package com.mascotcapsule.eruption.docomostar;

import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class MorphDeformer extends Animatable {
    public static final int TARGET_MAX = 4;

    /* JADX INFO: renamed from: r */
    private static float[][] f374r = new float[4][];

    /* JADX INFO: renamed from: s */
    private static short[][] f375s = new short[4][];

    /* JADX INFO: renamed from: t */
    private static byte[][] f376t = new byte[4][];

    /* JADX INFO: renamed from: u */
    private static int[] f377u = new int[4];

    /* JADX INFO: renamed from: c */
    int f378c;

    /* JADX INFO: renamed from: d */
    VertexBuffer[] f379d;

    /* JADX INFO: renamed from: e */
    float[] f380e;

    /* JADX INFO: renamed from: f */
    int[] f381f;

    /* JADX INFO: renamed from: g */
    C0006ae[] f382g;

    /* JADX INFO: renamed from: p */
    int f383p;

    /* JADX INFO: renamed from: q */
    byte f384q;

    /* JADX INFO: renamed from: v */
    private int f385v;

    /* JADX INFO: renamed from: w */
    private boolean f386w;

    /* JADX INFO: renamed from: x */
    private Vector f387x;

    /* JADX INFO: renamed from: y */
    private C0059cd[] f388y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorphDeformer(VertexBuffer[] vertexBufferArr) {
        super(8);
        if (vertexBufferArr == null) {
            throw new NullPointerException();
        }
        if (vertexBufferArr.length <= 0 || vertexBufferArr.length > 4) {
            throw new IllegalArgumentException();
        }
        int length = vertexBufferArr.length;
        super.mo3a();
        this.f378c = length;
        this.f380e = new float[length];
        this.f381f = new int[length];
        this.f387x = new Vector(0, 1);
        this.f385v = m184a(vertexBufferArr);
        this.f379d = new VertexBuffer[this.f378c];
        for (int i = 0; i < this.f378c; i++) {
            this.f379d[i] = vertexBufferArr[i];
        }
    }

    /* JADX INFO: renamed from: a */
    private int m183a(VertexBuffer vertexBuffer, int i, IndexBuffer indexBuffer, short[] sArr) {
        int i2;
        int i3;
        boolean z;
        short[] sArr2 = indexBuffer.f347t;
        if (vertexBuffer.m337b(i) == null) {
            return 0;
        }
        float[] fArrM471d = vertexBuffer.m337b(i).m471d();
        int i4 = this.f378c;
        int i5 = vertexBuffer.f530I[i].f643c;
        int i6 = indexBuffer.f343p << 1;
        int i7 = 0;
        int i8 = 0;
        if (fArrM471d == null) {
            return 0;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            f374r[i9] = this.f379d[i9].m337b(i).m471d();
            if (f374r[i9] == null) {
                return 0;
            }
            f377u[i9] = 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (i11 < i6) {
            boolean z2 = false;
            int i12 = sArr2[i11] * i5;
            int i13 = 0;
            while (i13 < i5) {
                int i14 = i12 + 1;
                float f = fArrM471d[i12];
                if (f < 0.0f) {
                    f = -f;
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= i4) {
                        z = z2;
                        break;
                    }
                    float[] fArr = f374r[i15];
                    int[] iArr = f377u;
                    int i16 = iArr[i15];
                    iArr[i15] = i16 + 1;
                    float f2 = fArr[i16] - f;
                    if (f2 < 0.0f) {
                        f2 = -f2;
                    }
                    if (f2 - f > 6.1035156E-5f || f2 - f < -6.1035156E-5f) {
                        z = true;
                        break;
                    }
                    i15++;
                }
                i13++;
                z2 = z;
                i12 = i14;
            }
            if (z2) {
                if (sArr != null) {
                    i2 = i8 + 1;
                    sArr[i8] = (short) i10;
                } else {
                    i2 = i8;
                }
                i3 = i7 + 1;
            } else {
                i2 = i8;
                i3 = i7;
            }
            i10++;
            i11 += 2;
            i8 = i2;
            i7 = i3;
        }
        for (int i17 = 0; i17 < 4; i17++) {
            f374r[i17] = null;
        }
        return i7;
    }

    /* JADX INFO: renamed from: a */
    private int m184a(VertexBuffer[] vertexBufferArr) {
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= 7) {
            int verticesNum = vertexBufferArr[0].getVerticesNum(i);
            for (int i4 = 1; i4 < this.f378c; i4++) {
                int verticesNum2 = vertexBufferArr[i4].getVerticesNum(i);
                if (verticesNum2 != verticesNum) {
                    throw new IllegalArgumentException();
                }
                if ((i3 == 5 || i3 == 6) && verticesNum2 > 0 && vertexBufferArr[0].f530I[i3].f641a != vertexBufferArr[i4].f530I[i3].f641a) {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = verticesNum > 0 ? i2 | i : i2;
            i <<= 1;
            i3++;
            i2 = i5;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private void m185a(C0006ae c0006ae, VertexBuffer vertexBuffer, int i, C0059cd c0059cd) {
        m186a(vertexBuffer.m339c(i).m471d(), c0006ae, vertexBuffer, i, c0059cd);
        vertexBuffer.f540e[i] = true;
        if (i == 0) {
            vertexBuffer.m340c();
        }
        for (int i2 = 0; i2 < 4; i2++) {
            f374r[i2] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m186a(float[] fArr, C0006ae c0006ae, VertexBuffer vertexBuffer, int i, C0059cd c0059cd) {
        float[] fArrM471d = vertexBuffer.m337b(i).m471d();
        float[] fArr2 = c0059cd.f772a;
        int i2 = this.f378c;
        int i3 = vertexBuffer.f530I[i].f643c;
        int length = c0006ae.f562b[i].length;
        short[] sArr = c0006ae.f562b[i];
        for (int i4 = 0; i4 < i2; i4++) {
            f374r[i4] = this.f379d[i4].m337b(i).m471d();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = sArr[i5] * i3;
            for (int i7 = 0; i7 < i3; i7++) {
                float f = fArrM471d[i6];
                float f2 = f;
                for (int i8 = 0; i8 < i2; i8++) {
                    f2 += fArr2[i8] * (f374r[i8][i6] - f);
                }
                fArr[i6] = f2;
                i6++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private int m187b(VertexBuffer vertexBuffer, int i, IndexBuffer indexBuffer, short[] sArr) {
        int i2;
        int i3;
        boolean z;
        short[] sArr2 = indexBuffer.f347t;
        if (vertexBuffer.m337b(4) == null) {
            return 0;
        }
        byte[] bArrM473f = vertexBuffer.m337b(4).m473f();
        int i4 = this.f378c;
        int i5 = indexBuffer.f343p << 1;
        int i6 = 0;
        int i7 = 0;
        if (bArrM473f == 0) {
            return 0;
        }
        for (int i8 = 0; i8 < i4; i8++) {
            f376t[i8] = this.f379d[i8].m337b(4).m473f();
            if (f376t[i8] == null) {
                return 0;
            }
            f377u[i8] = 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i5; i10 += 2) {
            boolean z2 = false;
            int i11 = 0;
            int i12 = sArr2[i10] << 2;
            while (true) {
                int i13 = i11;
                if (i13 >= 4) {
                    break;
                }
                int i14 = i12 + 1;
                int i15 = bArrM473f[i12];
                if (i15 < 0) {
                    i15 = -i15;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= i4) {
                        z = z2;
                        break;
                    }
                    byte[] bArr = f376t[i16];
                    int[] iArr = f377u;
                    int i17 = iArr[i16];
                    iArr[i16] = i17 + 1;
                    int i18 = bArr[i17] - i15;
                    if (i18 < 0) {
                        i18 = -i18;
                    }
                    if (i18 - i15 > 4 || i18 - i15 < -4) {
                        z = true;
                        break;
                    }
                    i16++;
                }
                i11 = i13 + 1;
                z2 = z;
                i12 = i14;
            }
            if (z2) {
                if (sArr != null) {
                    i2 = i7 + 1;
                    sArr[i7] = (short) i9;
                } else {
                    i2 = i7;
                }
                i3 = i6 + 1;
            } else {
                i2 = i7;
                i3 = i6;
            }
            i7 = i2;
            i6 = i3;
            i9++;
        }
        for (int i19 = 0; i19 < 4; i19++) {
            f376t[i19] = null;
        }
        return i6;
    }

    /* JADX INFO: renamed from: b */
    private void m188b(C0006ae c0006ae, VertexBuffer vertexBuffer, int i, C0059cd c0059cd) {
        byte[] bArrM473f = vertexBuffer.m337b(4).m473f();
        int[] iArr = c0059cd.f773b;
        int i2 = this.f378c;
        int length = c0006ae.f562b[4].length;
        short[] sArr = c0006ae.f562b[4];
        byte[] bArrM473f2 = vertexBuffer.m339c(4).m473f();
        for (int i3 = 0; i3 < i2; i3++) {
            f376t[i3] = this.f379d[i3].m337b(4).m473f();
        }
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = sArr[i4] << 2;
            int i6 = 0;
            while (true) {
                int i7 = i5;
                int i8 = i6;
                if (i8 < 4) {
                    byte b = bArrM473f[i7];
                    int i9 = b;
                    for (int i10 = 0; i10 < i2; i10++) {
                        i9 += (iArr[i10] * (f376t[i10][i7] - b)) >> 12;
                    }
                    if (i9 < 0) {
                        i9 = 0;
                    } else if (i9 > 255) {
                        i9 = 255;
                    }
                    bArrM473f2[i7] = (byte) i9;
                    i5 = i7 + 1;
                    i6 = i8 + 1;
                }
            }
        }
        vertexBuffer.f540e[4] = true;
        for (int i11 = 0; i11 < 4; i11++) {
            f376t[i11] = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m189b(float[] fArr, C0006ae c0006ae, VertexBuffer vertexBuffer, int i, C0059cd c0059cd) {
        short[] sArrM472e = vertexBuffer.m337b(i).m472e();
        int[] iArr = c0059cd.f773b;
        int i2 = this.f378c;
        int i3 = vertexBuffer.f530I[i].f643c;
        int length = c0006ae.f562b[i].length;
        short[] sArr = c0006ae.f562b[i];
        for (int i4 = 0; i4 < i2; i4++) {
            f375s[i4] = this.f379d[i4].m337b(i).m472e();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = sArr[i5] * i3;
            for (int i7 = 0; i7 < i3; i7++) {
                short s = sArrM472e[i6];
                int i8 = s;
                for (int i9 = 0; i9 < i2; i9++) {
                    i8 += (iArr[i9] * (f375s[i9][i6] - s)) >> 12;
                }
                fArr[i6] = i8 * 3.051851E-5f;
                i6++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private int m190c(VertexBuffer vertexBuffer, int i, IndexBuffer indexBuffer, short[] sArr) {
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        short[] sArr2 = indexBuffer.f347t;
        if (vertexBuffer.m337b(i) == null) {
            return 0;
        }
        short[] sArrM472e = vertexBuffer.m337b(i).m472e();
        int i6 = this.f378c;
        int i7 = vertexBuffer.f530I[i].f643c;
        int i8 = indexBuffer.f343p << 1;
        int i9 = 0;
        int i10 = 0;
        if (sArrM472e == null) {
            return 0;
        }
        for (int i11 = 0; i11 < i6; i11++) {
            if (this.f379d[i11].m337b(i) == null) {
                return 0;
            }
            f375s[i11] = this.f379d[i11].m337b(i).m472e();
            if (f375s[i11] == null) {
                return 0;
            }
            f377u[i11] = 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i8; i13 += 2) {
            boolean z2 = false;
            int i14 = sArr2[i13] * i7;
            for (int i15 = 0; i15 < i7; i15++) {
                int i16 = i14 + 1;
                short s = sArrM472e[i14];
                if (s < 0) {
                    i4 = s;
                    i4 = -s;
                }
                i4 = s;
                int i17 = 0;
                while (true) {
                    if (i17 >= i6) {
                        z = z2;
                        break;
                    }
                    short[] sArr3 = f375s[i17];
                    int[] iArr = f377u;
                    int i18 = iArr[i17];
                    iArr[i17] = i18 + 1;
                    int i19 = sArr3[i18] - i4;
                    if (i19 < 0) {
                        i5 = i19;
                        i5 = -i19;
                    }
                    i5 = i19;
                    if (i5 - i4 > 4 || i5 - i4 < -4) {
                        z = true;
                        break;
                    }
                    i17++;
                }
                z2 = z;
                i14 = i16;
            }
            if (z2) {
                if (sArr != null) {
                    i2 = i10 + 1;
                    sArr[i10] = (short) i12;
                } else {
                    i2 = i10;
                }
                i3 = i9 + 1;
            } else {
                i2 = i10;
                i3 = i9;
            }
            i10 = i2;
            i9 = i3;
            i12++;
        }
        for (int i20 = 0; i20 < 4; i20++) {
            f375s[i20] = null;
        }
        return i9;
    }

    /* JADX INFO: renamed from: c */
    private void m191c() {
        if (this.f384q == 127) {
            this.f384q = (byte) -128;
        } else {
            this.f384q = (byte) (this.f384q + 1);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m192c(C0006ae c0006ae, VertexBuffer vertexBuffer, int i, C0059cd c0059cd) {
        short[] sArrM472e = vertexBuffer.m337b(i).m472e();
        int[] iArr = c0059cd.f773b;
        int i2 = this.f378c;
        int i3 = vertexBuffer.f530I[i].f643c;
        int length = c0006ae.f562b[i].length;
        short[] sArr = c0006ae.f562b[i];
        short[] sArrM472e2 = vertexBuffer.m339c(i).m472e();
        for (int i4 = 0; i4 < i2; i4++) {
            f375s[i4] = this.f379d[i4].m337b(i).m472e();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = sArr[i5] * i3;
            for (int i7 = 0; i7 < i3; i7++) {
                short s = sArrM472e[i6];
                int i8 = s;
                for (int i9 = 0; i9 < i2; i9++) {
                    i8 += (iArr[i9] * (f375s[i9][i6] - s)) >> 12;
                }
                sArrM472e2[i6] = (short) i8;
                i6++;
            }
        }
        vertexBuffer.f540e[i] = true;
        for (int i10 = 0; i10 < 4; i10++) {
            f375s[i10] = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m193d(C0006ae c0006ae, VertexBuffer vertexBuffer, int i, C0059cd c0059cd) {
        m189b(vertexBuffer.m339c(i).m471d(), c0006ae, vertexBuffer, i, c0059cd);
        vertexBuffer.f540e[i] = true;
        for (int i2 = 0; i2 < 4; i2++) {
            f375s[i2] = null;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable, com.mascotcapsule.eruption.docomostar.Object3D
    /* JADX INFO: renamed from: a */
    final int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        int iMo0a = super.mo0a(i, i2, object3DArr, i3);
        if (object3DArr == null || object3DArr.length > iMo0a) {
            for (int i4 = 0; i4 < this.f378c; i4++) {
                iMo0a = this.f379d[i4].mo0a(i, i2, object3DArr, iMo0a);
                if (object3DArr != null && object3DArr.length <= iMo0a) {
                    break;
                }
            }
        }
        return iMo0a;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo4a(Action action) {
        if (action.f84c != 6) {
            throw new IllegalArgumentException();
        }
        if (action.f85d.length != this.f378c) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo5a(ActionController actionController) {
        if (actionController.f90c != this.f378c) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m194a(IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0059cd c0059cd) {
        for (int i = 0; i < this.f383p; i++) {
            C0006ae c0006ae = this.f382g[i];
            if (c0006ae.f561a == indexBuffer) {
                if (c0006ae.f562b[0] == null || indexBuffer.f322I == c0059cd.f774c) {
                    return;
                }
                m185a(c0006ae, vertexBuffer, 0, c0059cd);
                indexBuffer.f322I = c0059cd.f774c;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m195a(VertexBuffer vertexBuffer, C0059cd c0059cd) {
        for (int i = 0; i < this.f383p; i++) {
            C0006ae c0006ae = this.f382g[i];
            IndexBuffer indexBuffer = c0006ae.f561a;
            if (c0006ae.f562b[0] != null && indexBuffer.f322I != c0059cd.f774c) {
                m185a(c0006ae, vertexBuffer, 0, c0059cd);
                indexBuffer.f322I = c0059cd.f774c;
            }
            if (indexBuffer.f323J != c0059cd.f774c) {
                if (c0006ae.f562b[1] != null) {
                    m193d(c0006ae, vertexBuffer, 1, c0059cd);
                    vertexBuffer.f527F = true;
                }
                if (c0006ae.f562b[2] != null) {
                    m193d(c0006ae, vertexBuffer, 2, c0059cd);
                }
                if (c0006ae.f562b[3] != null) {
                    m193d(c0006ae, vertexBuffer, 3, c0059cd);
                }
                indexBuffer.f323J = c0059cd.f774c;
            }
            if (indexBuffer.f324K != c0059cd.f774c) {
                if (c0006ae.f562b[4] != null) {
                    m188b(c0006ae, vertexBuffer, 4, c0059cd);
                }
                if (c0006ae.f562b[5] != null) {
                    if (vertexBuffer.f530I[5].f641a == 0) {
                        m185a(c0006ae, vertexBuffer, 5, c0059cd);
                    } else {
                        m192c(c0006ae, vertexBuffer, 5, c0059cd);
                    }
                }
                if (c0006ae.f562b[6] != null) {
                    if (vertexBuffer.f530I[6].f641a == 0) {
                        m185a(c0006ae, vertexBuffer, 6, c0059cd);
                    } else {
                        m192c(c0006ae, vertexBuffer, 6, c0059cd);
                    }
                }
                if (c0006ae.f562b[7] != null) {
                    m185a(c0006ae, vertexBuffer, 7, c0059cd);
                }
                indexBuffer.f324K = c0059cd.f774c;
            }
        }
        this.f386w = false;
    }

    /* JADX INFO: renamed from: a */
    final void m196a(VertexBuffer vertexBuffer, IndexBuffer[] indexBufferArr) {
        int length = indexBufferArr.length;
        int[] iArr = new int[8];
        this.f383p = length;
        this.f382g = new C0006ae[length];
        for (int i = 0; i < length; i++) {
            iArr[0] = m183a(vertexBuffer, 0, indexBufferArr[i], (short[]) null);
            iArr[1] = m190c(vertexBuffer, 1, indexBufferArr[i], (short[]) null);
            iArr[2] = m190c(vertexBuffer, 2, indexBufferArr[i], (short[]) null);
            iArr[3] = m190c(vertexBuffer, 3, indexBufferArr[i], (short[]) null);
            iArr[4] = m187b(vertexBuffer, 4, indexBufferArr[i], (short[]) null);
            if (vertexBuffer.f530I[5].f641a == 0) {
                iArr[5] = m183a(vertexBuffer, 5, indexBufferArr[i], (short[]) null);
            } else {
                iArr[5] = m190c(vertexBuffer, 5, indexBufferArr[i], (short[]) null);
            }
            if (vertexBuffer.f530I[6].f641a == 0) {
                iArr[6] = m183a(vertexBuffer, 6, indexBufferArr[i], (short[]) null);
            } else {
                iArr[6] = m190c(vertexBuffer, 6, indexBufferArr[i], (short[]) null);
            }
            iArr[7] = m183a(vertexBuffer, 7, indexBufferArr[i], (short[]) null);
            C0006ae c0006ae = new C0006ae(indexBufferArr[i], iArr);
            if (iArr[0] > 0) {
                m183a(vertexBuffer, 0, indexBufferArr[i], c0006ae.f562b[0]);
            }
            if (iArr[1] > 0) {
                m190c(vertexBuffer, 1, indexBufferArr[i], c0006ae.f562b[1]);
            }
            if (iArr[2] > 0) {
                m190c(vertexBuffer, 2, indexBufferArr[i], c0006ae.f562b[2]);
            }
            if (iArr[3] > 0) {
                m190c(vertexBuffer, 3, indexBufferArr[i], c0006ae.f562b[3]);
            }
            if (iArr[4] > 0) {
                m187b(vertexBuffer, 4, indexBufferArr[i], c0006ae.f562b[4]);
            }
            if (iArr[5] > 0) {
                if (vertexBuffer.f530I[5].f641a == 0) {
                    m183a(vertexBuffer, 5, indexBufferArr[i], c0006ae.f562b[5]);
                } else {
                    m190c(vertexBuffer, 5, indexBufferArr[i], c0006ae.f562b[5]);
                }
            }
            if (iArr[6] > 0) {
                if (vertexBuffer.f530I[6].f641a == 0) {
                    m183a(vertexBuffer, 6, indexBufferArr[i], c0006ae.f562b[6]);
                } else {
                    m190c(vertexBuffer, 6, indexBufferArr[i], c0006ae.f562b[6]);
                }
            }
            if (iArr[7] > 0) {
                m183a(vertexBuffer, 7, indexBufferArr[i], c0006ae.f562b[7]);
            }
            this.f382g[i] = c0006ae;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo6a(C0097do c0097do, float f) {
        C0019ar[] c0019arArr = c0097do.f895a.f85d;
        float[] fArr = {0.0f};
        for (int i = 0; i < this.f378c; i++) {
            if (c0019arArr[i].m410a(f, c0097do.f899e, c0097do.f897c[i], fArr)) {
                this.f380e[i] = fArr[0];
                this.f381f[i] = (int) (this.f380e[i] * 4096.0f);
                m191c();
                this.f386w = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m197a(float[] fArr, IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0059cd c0059cd) {
        for (int i = 0; i < this.f383p; i++) {
            C0006ae c0006ae = this.f382g[i];
            if (c0006ae.f561a == indexBuffer) {
                if (c0006ae.f562b[0] == null || indexBuffer.f322I == c0059cd.f774c) {
                    return;
                }
                m186a(fArr, c0006ae, vertexBuffer, 0, c0059cd);
                indexBuffer.f322I = c0059cd.f774c;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m198a(float[] fArr, float[] fArr2, float[] fArr3, IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0059cd c0059cd) {
        for (int i = 0; i < this.f383p; i++) {
            C0006ae c0006ae = this.f382g[i];
            if (c0006ae.f561a == indexBuffer) {
                if (indexBuffer.f323J != c0059cd.f774c) {
                    if (c0006ae.f562b[1] != null) {
                        m189b(fArr, c0006ae, vertexBuffer, 1, c0059cd);
                        vertexBuffer.f527F = true;
                    }
                    if (c0006ae.f562b[2] != null) {
                        m189b(fArr2, c0006ae, vertexBuffer, 2, c0059cd);
                    }
                    if (c0006ae.f562b[3] != null) {
                        m189b(fArr3, c0006ae, vertexBuffer, 3, c0059cd);
                    }
                    indexBuffer.f323J = c0059cd.f774c;
                    return;
                }
                return;
            }
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo7a(C0019ar[][] c0019arArr, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, int i) {
        for (int i2 = 0; i2 < this.f378c; i2++) {
            if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, i2, f96a)) {
                this.f380e[i2] = f96a[0];
                this.f381f[i2] = (int) (f96a[0] * 4096.0f);
                m191c();
                this.f386w = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m199a(VertexBuffer vertexBuffer) {
        int i = 1;
        for (int i2 = 0; i2 <= 7; i2++) {
            int verticesNum = this.f379d[0].getVerticesNum(i);
            int verticesNum2 = vertexBuffer.getVerticesNum(i);
            if (verticesNum2 > 0 && verticesNum > 0 && verticesNum != verticesNum2) {
                return false;
            }
            if (verticesNum2 > 0) {
                if ((i2 == 2 || i2 == 3) && vertexBuffer.getVerticesNum(i >> 1) != this.f379d[0].getVerticesNum(i >> 1)) {
                    return false;
                }
                if ((i2 == 5 || i2 == 6) && vertexBuffer.f530I[i2].f641a != this.f379d[0].f530I[i2].f641a) {
                    return false;
                }
            }
            i <<= 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    final C0059cd m200b(int i) {
        C0059cd c0059cd;
        int size = this.f387x.size();
        if (i < size) {
            c0059cd = this.f388y[i];
            if (this.f386w || !c0059cd.f775d) {
            }
            return c0059cd;
        }
        while (size <= i) {
            this.f387x.addElement(new C0059cd(this.f378c));
            size++;
        }
        int size2 = this.f387x.size();
        this.f388y = new C0059cd[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            this.f388y[i2] = (C0059cd) this.f387x.elementAt(i2);
        }
        c0059cd = this.f388y[i];
        c0059cd.m449a(this);
        c0059cd.f775d = true;
        return c0059cd;
    }

    /* JADX INFO: renamed from: b */
    final void m201b(IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0059cd c0059cd) {
        for (int i = 0; i < this.f383p; i++) {
            C0006ae c0006ae = this.f382g[i];
            if (c0006ae.f561a == indexBuffer) {
                if (indexBuffer.f323J != c0059cd.f774c) {
                    if (c0006ae.f562b[1] != null) {
                        m193d(c0006ae, vertexBuffer, 1, c0059cd);
                        vertexBuffer.f527F = true;
                    }
                    if (c0006ae.f562b[2] != null) {
                        m193d(c0006ae, vertexBuffer, 2, c0059cd);
                    }
                    if (c0006ae.f562b[3] != null) {
                        m193d(c0006ae, vertexBuffer, 3, c0059cd);
                    }
                    indexBuffer.f323J = c0059cd.f774c;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final int m202c(int i) {
        return this.f385v & 127;
    }

    /* JADX INFO: renamed from: c */
    final void m203c(IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0059cd c0059cd) {
        for (int i = 0; i < this.f383p; i++) {
            C0006ae c0006ae = this.f382g[i];
            if (c0006ae.f561a == indexBuffer) {
                if (indexBuffer.f324K == c0059cd.f774c) {
                    break;
                }
                if (c0006ae.f562b[4] != null) {
                    m188b(c0006ae, vertexBuffer, 4, c0059cd);
                }
                if (c0006ae.f562b[5] != null) {
                    if (vertexBuffer.f530I[5].f641a == 0) {
                        m185a(c0006ae, vertexBuffer, 5, c0059cd);
                    } else {
                        m192c(c0006ae, vertexBuffer, 5, c0059cd);
                    }
                }
                if (c0006ae.f562b[6] != null) {
                    if (vertexBuffer.f530I[6].f641a == 0) {
                        m185a(c0006ae, vertexBuffer, 6, c0059cd);
                    } else {
                        m192c(c0006ae, vertexBuffer, 6, c0059cd);
                    }
                }
                if (c0006ae.f562b[7] != null) {
                    m185a(c0006ae, vertexBuffer, 7, c0059cd);
                }
                indexBuffer.f324K = c0059cd.f774c;
                break;
            }
        }
        this.f386w = false;
    }

    public final VertexBuffer getTargetBuffer(int i) {
        if (i < 0 || i >= this.f378c) {
            throw new IllegalArgumentException();
        }
        return this.f379d[i];
    }

    public final int getTargetNum() {
        return this.f378c;
    }

    public final void setWeight(float[] fArr) {
        if (fArr == null) {
            throw new NullPointerException();
        }
        if (fArr.length != this.f378c) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < fArr.length; i++) {
            this.f380e[i] = fArr[i];
            this.f381f[i] = (int) (fArr[i] * 4096.0f);
        }
        m191c();
        this.f386w = true;
    }
}
