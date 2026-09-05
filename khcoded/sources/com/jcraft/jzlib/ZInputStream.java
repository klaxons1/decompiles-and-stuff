package com.jcraft.jzlib;

import com.mascotcapsule.eruption.docomostar.Appearance;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.GameStatus;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public class ZInputStream extends InputStream {
    protected byte[] buf;
    protected byte[] buf1;
    protected int bufsize;
    protected boolean compress;
    protected int flush;

    /* JADX INFO: renamed from: in */
    protected InputStream f80in;
    private boolean nomoreinput;

    /* JADX INFO: renamed from: z */
    protected ZStream f81z;

    public ZInputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public ZInputStream(InputStream inputStream, int i) {
        this.f81z = new ZStream();
        this.bufsize = Appearance.DRAWSILHOUETTE;
        this.flush = 0;
        this.buf = new byte[this.bufsize];
        this.buf1 = new byte[1];
        this.f80in = null;
        this.nomoreinput = false;
        this.f80in = inputStream;
        this.f81z.deflateInit(i);
        this.compress = true;
        this.f81z.next_in = this.buf;
        this.f81z.next_in_index = 0;
        this.f81z.avail_in = 0;
    }

    public ZInputStream(InputStream inputStream, boolean z) {
        this.f81z = new ZStream();
        this.bufsize = Appearance.DRAWSILHOUETTE;
        this.flush = 0;
        this.buf = new byte[this.bufsize];
        this.buf1 = new byte[1];
        this.f80in = null;
        this.nomoreinput = false;
        this.f80in = inputStream;
        this.f81z.inflateInit(z);
        this.compress = false;
        this.f81z.next_in = this.buf;
        this.f81z.next_in_index = 0;
        this.f81z.avail_in = 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f80in.close();
    }

    public int getBufferSize() {
        return this.bufsize;
    }

    public int getFlushMode() {
        return this.flush;
    }

    public long getTotalIn() {
        return this.f81z.total_in;
    }

    public long getTotalOut() {
        return this.f81z.total_out;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.buf1, 0, 1) == -1) {
            return -1;
        }
        return this.buf1[0] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iDeflate;
        if (i2 == 0) {
            return 0;
        }
        this.f81z.next_out = bArr;
        this.f81z.next_out_index = i;
        this.f81z.avail_out = i2;
        do {
            if (this.f81z.avail_in == 0 && !this.nomoreinput) {
                this.f81z.next_in_index = 0;
                this.f81z.avail_in = this.f80in.read(this.buf, 0, this.bufsize);
                if (this.f81z.avail_in == -1) {
                    this.f81z.avail_in = 0;
                    this.nomoreinput = true;
                }
            }
            iDeflate = this.compress ? this.f81z.deflate(this.flush) : this.f81z.inflate(this.flush);
            if (this.nomoreinput && iDeflate == -5) {
                return -1;
            }
            if (iDeflate != 0 && iDeflate != 1) {
                throw new ZStreamException(new StringBuffer().append(this.compress ? "de" : "in").append("flating: ").append(this.f81z.msg).toString());
            }
            if ((!this.nomoreinput && iDeflate != 1) || this.f81z.avail_out != i2) {
                if (this.f81z.avail_out != i2) {
                    break;
                }
            } else {
                return -1;
            }
        } while (iDeflate == 0);
        return i2 - this.f81z.avail_out;
    }

    public byte[] read(int i, int i2) throws IOException {
        if (i2 <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        int bufferSize = i2;
        while (i3 != i2) {
            if (bufferSize > getBufferSize()) {
                bufferSize = getBufferSize();
            }
            byte[] bArr = new byte[bufferSize];
            int i4 = read(bArr, 0, bufferSize);
            byteArrayOutputStream.write(bArr, 0, i4);
            i3 += i4;
            if (i3 < i2) {
                bufferSize = i2 - i3;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void setBufferSize(int i) {
        this.bufsize = i;
        if (this.buf != null) {
            this.buf = null;
        }
        this.buf = new byte[this.bufsize];
        this.f81z.next_in = this.buf;
    }

    public void setFlushMode(int i) {
        this.flush = i;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        int i = Appearance.DRAWSILHOUETTE;
        if (j < Appearance.DRAWSILHOUETTE) {
            i = (int) j;
        }
        return read(new byte[i]);
    }
}
