package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: p */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0044p extends Thread {

    /* JADX INFO: renamed from: b */
    public ByteArrayOutputStream f495b;

    /* JADX INFO: renamed from: c */
    public DataOutputStream f496c;

    /* JADX INFO: renamed from: d */
    public byte[] f497d;

    /* JADX INFO: renamed from: e */
    public ByteArrayInputStream f498e;

    /* JADX INFO: renamed from: f */
    public DataInputStream f499f;

    /* JADX INFO: renamed from: g */
    public C0036h f500g;

    /* JADX INFO: renamed from: i */
    public boolean f502i;

    /* JADX INFO: renamed from: k */
    public boolean f504k;

    /* JADX INFO: renamed from: h */
    public Object f501h = new Object();

    /* JADX INFO: renamed from: j */
    public Object f503j = new Object();

    /* JADX INFO: renamed from: a */
    public byte[] f494a = null;

    /* JADX INFO: renamed from: l */
    public boolean f505l = true;

    public C0044p(C0036h c0036h, int i) {
        this.f500g = c0036h;
        this.f495b = new ByteArrayOutputStream(i);
        this.f496c = new DataOutputStream(this.f495b);
        this.f497d = new byte[i];
        this.f498e = new ByteArrayInputStream(this.f497d);
        this.f499f = new DataInputStream(this.f498e);
        start();
    }

    /* JADX INFO: renamed from: a */
    public final void m310a() {
        this.f505l = false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m311a(long j) {
        try {
            synchronized (this.f503j) {
                if (this.f504k) {
                    return true;
                }
                this.f503j.wait(j);
                return this.f504k;
            }
        } catch (InterruptedException e) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m312b() {
        synchronized (this.f501h) {
            this.f494a = this.f495b.toByteArray();
            this.f495b.reset();
            try {
                this.f500g.m282b(this.f494a);
            } catch (IOException e) {
            }
            this.f494a = null;
            this.f502i = true;
            this.f501h.notify();
            this.f504k = false;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (this.f505l) {
            try {
                synchronized (this.f501h) {
                    if (!this.f502i) {
                        try {
                            this.f501h.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    this.f502i = false;
                }
                this.f500g.m280a(this.f497d);
                this.f498e.reset();
                synchronized (this.f503j) {
                    this.f504k = true;
                    this.f503j.notify();
                }
            } catch (InterruptedIOException e2) {
            } catch (IOException e3) {
            }
        }
    }
}
