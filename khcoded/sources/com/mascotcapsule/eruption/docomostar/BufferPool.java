package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.ByteBuffer;
import com.docomostar.ui.ogl.DirectBuffer;
import com.docomostar.ui.ogl.DirectBufferFactory;
import com.docomostar.ui.ogl.FloatBuffer;
import com.docomostar.ui.ogl.ShortBuffer;
import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class BufferPool {
    public static final int BYTEBUFFER = 3;
    public static final int INDEX = 2;
    public static final int VERTEX = 1;

    /* JADX INFO: renamed from: a */
    DirectBuffer[] f156a;

    /* JADX INFO: renamed from: b */
    DirectBuffer[] f157b;

    /* JADX INFO: renamed from: c */
    private int f158c;

    /* JADX INFO: renamed from: d */
    private int f159d;

    /* JADX INFO: renamed from: e */
    private int f160e;

    /* JADX INFO: renamed from: f */
    private int f161f;

    /* JADX INFO: renamed from: g */
    private Vector f162g = new Vector();

    /* JADX INFO: renamed from: h */
    private C0013al[] f163h;

    public BufferPool(int i, int i2, int i3) {
        this.f158c = i;
        this.f160e = i3;
        switch (i) {
            case 1:
                this.f159d = i2;
                this.f156a = new DirectBuffer[13];
                this.f157b = new DirectBuffer[13];
                this.f163h = VertexBuffer.m307f(i2);
                int i4 = 1;
                for (int i5 = 0; i5 < 8; i5++) {
                    if ((i4 & i2) != 0 || ((i2 & 128) != 0 && i4 == 32)) {
                        this.f156a[i5] = m63a(i3, this.f163h[i5].f641a, this.f163h[i5]);
                        if (i5 == 1) {
                            this.f157b[i5] = m63a(i3, this.f163h[i5].f642b, this.f163h[i5]);
                        }
                    }
                    i4 <<= 1;
                }
                return;
            case 2:
                this.f163h = new C0013al[1];
                this.f163h[0] = new C0013al(2, 2, 1);
                this.f156a = new DirectBuffer[1];
                this.f156a[0] = m63a(i3, 2, this.f163h[0]);
                return;
            case 3:
                this.f163h = new C0013al[1];
                this.f163h[0] = new C0013al(3, 3, 1);
                this.f156a = new DirectBuffer[1];
                this.f156a[0] = m63a(i3, 3, this.f163h[0]);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    private static final DirectBuffer m63a(int i, int i2, C0013al c0013al) {
        DirectBufferFactory factory = DirectBufferFactory.getFactory();
        switch (i2) {
            case 0:
                return factory.allocateFloatBuffer(c0013al.f643c * i);
            case 1:
            default:
                return null;
            case 2:
                return factory.allocateShortBuffer(c0013al.f643c * i);
            case 3:
                return factory.allocateByteBuffer(c0013al.f643c * i);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m64a(C0013al c0013al, ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = c0013al.f643c * i;
        int i5 = c0013al.f643c * i2;
        int i6 = c0013al.f643c * i3;
        byte[] bArr = new byte[i6];
        byteBuffer.get(i4, bArr, 0, i6);
        byteBuffer.put(i5, bArr, 0, i6);
    }

    /* JADX INFO: renamed from: a */
    private final void m65a(C0013al c0013al, DirectBuffer directBuffer, int i, int i2, int i3) {
        switch (c0013al.f641a) {
            case 0:
                m66a(c0013al, (FloatBuffer) directBuffer, i, i2, i3);
                break;
            case 2:
                m67a(c0013al, (ShortBuffer) directBuffer, i, i2, i3);
                break;
            case 3:
                m64a(c0013al, (ByteBuffer) directBuffer, i, i2, i3);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m66a(C0013al c0013al, FloatBuffer floatBuffer, int i, int i2, int i3) {
        int i4 = c0013al.f643c * i;
        int i5 = c0013al.f643c * i2;
        int i6 = c0013al.f643c * i3;
        float[] fArr = new float[i6];
        floatBuffer.get(i4, fArr, 0, i6);
        floatBuffer.put(i5, fArr, 0, i6);
    }

    /* JADX INFO: renamed from: a */
    private static void m67a(C0013al c0013al, ShortBuffer shortBuffer, int i, int i2, int i3) {
        int i4 = c0013al.f643c * i;
        int i5 = c0013al.f643c * i2;
        int i6 = c0013al.f643c * i3;
        short[] sArr = new short[i6];
        shortBuffer.get(i4, sArr, 0, i6);
        shortBuffer.put(i5, sArr, 0, i6);
    }

    /* JADX INFO: renamed from: b */
    private final void m68b(C0013al c0013al, DirectBuffer directBuffer, int i, int i2, int i3) {
        switch (c0013al.f642b) {
            case 0:
                m66a(c0013al, (FloatBuffer) directBuffer, i, i2, i3);
                break;
            case 2:
                m67a(c0013al, (ShortBuffer) directBuffer, i, i2, i3);
                break;
            case 3:
                m64a(c0013al, (ByteBuffer) directBuffer, i, i2, i3);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    final C0122u m69a(Object obj, int i, int i2) {
        if ((this.f159d & i2 & 255) != (i2 & 255)) {
            throw new IllegalArgumentException();
        }
        if ((i2 & 32) != 0) {
            if ((i2 & VertexBuffer.TEXTURECOORDF_0) != 0 && (this.f159d & VertexBuffer.TEXTURECOORDF_0) == 0) {
                throw new IllegalArgumentException();
            }
            if ((i2 & VertexBuffer.TEXTURECOORDF_0) == 0 && (this.f159d & VertexBuffer.TEXTURECOORDF_0) != 0) {
                throw new IllegalArgumentException();
            }
        }
        if ((i2 & 64) != 0) {
            if ((i2 & VertexBuffer.TEXTURECOORDF_1) != 0 && (this.f159d & VertexBuffer.TEXTURECOORDF_1) == 0) {
                throw new IllegalArgumentException();
            }
            if ((i2 & VertexBuffer.TEXTURECOORDF_1) == 0 && (this.f159d & VertexBuffer.TEXTURECOORDF_1) != 0) {
                throw new IllegalArgumentException();
            }
        }
        getUseSize();
        if (this.f160e - this.f161f < i) {
            return null;
        }
        C0122u c0122u = new C0122u(obj, this.f161f, i, i2);
        this.f161f += i;
        this.f162g.addElement(c0122u);
        return c0122u;
    }

    /* JADX INFO: renamed from: a */
    final void m70a(C0122u c0122u) {
        DirectBuffer[] directBufferArr = this.f156a;
        switch (this.f158c) {
            case 1:
                DirectBuffer[] directBufferArr2 = this.f157b;
                C0013al[] c0013alArr = this.f163h;
                int i = 1;
                for (int i2 = 0; i2 < 13; i2++) {
                    if ((c0122u.f1036d & i) != 0) {
                        directBufferArr[i2].setSegment(c0013alArr[i2].f643c * c0122u.f1033a, c0013alArr[i2].f643c * c0122u.f1035c);
                        if (directBufferArr2[i2] != null) {
                            directBufferArr2[i2].setSegment(c0013alArr[i2].f643c * c0122u.f1033a, c0013alArr[i2].f643c * c0122u.f1035c);
                        }
                    }
                    i <<= 1;
                }
                break;
            case 2:
            case 3:
                directBufferArr[0].setSegment(c0122u.f1033a, c0122u.f1035c);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m71a(C0122u c0122u, int i) {
        int i2 = 1 << i;
        if ((c0122u.f1036d & i2) == 0) {
            this.f156a[i] = m63a(c0122u.f1035c, this.f163h[i].f642b, this.f163h[i]);
            c0122u.f1036d = i2 | c0122u.f1036d;
        }
    }

    public final int getParams() {
        return this.f159d;
    }

    public final int getSize() {
        return this.f160e;
    }

    public final int getType() {
        return this.f158c;
    }

    public final int getUseSize() {
        int i;
        boolean z;
        int i2;
        int size = this.f162g.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i = size;
                z = false;
                break;
            }
            C0122u c0122u = (C0122u) this.f162g.elementAt(i3);
            if (!c0122u.m520a()) {
                int i4 = c0122u.f1033a;
                this.f161f -= c0122u.f1035c;
                this.f162g.removeElementAt(i3);
                int i5 = size - 1;
                while (i3 < i5) {
                    C0122u c0122u2 = (C0122u) this.f162g.elementAt(i3);
                    if (c0122u2.m520a()) {
                        c0122u2.f1034b = i4;
                        i4 += c0122u2.f1035c;
                        i2 = i5;
                    } else {
                        this.f161f -= c0122u2.f1035c;
                        this.f162g.removeElementAt(i3);
                        i2 = i5 - 1;
                        i3--;
                    }
                    i3++;
                    i5 = i2;
                }
                i = i5;
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            for (int i6 = 0; i6 < i; i6++) {
                C0122u c0122u3 = (C0122u) this.f162g.elementAt(i6);
                if (c0122u3.f1033a != c0122u3.f1034b) {
                    switch (this.f158c) {
                        case 1:
                            int i7 = 0;
                            int i8 = 1;
                            while (i7 < 13) {
                                if ((c0122u3.f1036d & i8) != 0) {
                                    if (i7 == 2 && this.f163h[i7].f642b == 0) {
                                        m68b(this.f163h[i7], this.f157b[i7], c0122u3.f1033a, c0122u3.f1034b, c0122u3.f1035c);
                                    } else if (i7 == 32 && (this.f159d & VertexBuffer.TEXTURECOORDF_0) != 0) {
                                        m68b(this.f163h[i7], this.f157b[i7], c0122u3.f1033a, c0122u3.f1034b, c0122u3.f1035c);
                                    } else if (i7 != 64 || (this.f159d & VertexBuffer.TEXTURECOORDF_1) == 0) {
                                        m65a(this.f163h[i7], this.f156a[i7], c0122u3.f1033a, c0122u3.f1034b, c0122u3.f1035c);
                                    } else {
                                        m68b(this.f163h[i7], this.f157b[i7], c0122u3.f1033a, c0122u3.f1034b, c0122u3.f1035c);
                                    }
                                }
                                i7++;
                                i8 <<= 1;
                            }
                            break;
                        case 2:
                        case 3:
                            m65a(this.f163h[0], this.f156a[0], c0122u3.f1033a, c0122u3.f1034b, c0122u3.f1035c);
                            break;
                    }
                    c0122u3.f1033a = c0122u3.f1034b;
                }
            }
        }
        return this.f161f;
    }
}
