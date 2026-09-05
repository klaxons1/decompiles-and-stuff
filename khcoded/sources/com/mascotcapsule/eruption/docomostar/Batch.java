package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.ogl.GraphicsOGL;
import p000.GameStatus;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Batch extends Object3D {

    /* JADX INFO: renamed from: g */
    private static Transform f117g = new Transform();

    /* JADX INFO: renamed from: p */
    private static Vector3D f118p = new Vector3D();

    /* JADX INFO: renamed from: q */
    private static Vector3D f119q = new Vector3D();

    /* JADX INFO: renamed from: A */
    private boolean f120A;

    /* JADX INFO: renamed from: B */
    private boolean f121B;

    /* JADX INFO: renamed from: C */
    private boolean f122C;

    /* JADX INFO: renamed from: D */
    private boolean f123D;

    /* JADX INFO: renamed from: a */
    BoneDeformer f124a;

    /* JADX INFO: renamed from: b */
    VertexBuffer f125b;

    /* JADX INFO: renamed from: c */
    IndexBuffer f126c;

    /* JADX INFO: renamed from: d */
    C0096dn[] f127d;

    /* JADX INFO: renamed from: e */
    boolean f128e;

    /* JADX INFO: renamed from: f */
    boolean f129f;

    /* JADX INFO: renamed from: r */
    private Figure[] f130r;

    /* JADX INFO: renamed from: s */
    private C0089dg[] f131s;

    /* JADX INFO: renamed from: t */
    private C0089dg[] f132t;

    /* JADX INFO: renamed from: u */
    private int[] f133u;

    /* JADX INFO: renamed from: v */
    private Transform[][] f134v;

    /* JADX INFO: renamed from: w */
    private byte[] f135w;

    /* JADX INFO: renamed from: x */
    private boolean[] f136x;

    /* JADX INFO: renamed from: y */
    private C0069cn[] f137y;

    /* JADX INFO: renamed from: z */
    private int f138z;

    public Batch(BufferPool[] bufferPoolArr, Figure[] figureArr, Appearance appearance, boolean z) {
        BufferPool bufferPool;
        BufferPool bufferPool2;
        int polygonCount;
        BufferPool bufferPool3;
        super(19);
        short[] sArr = new short[1];
        float[] fArr = new float[1];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        if (figureArr == null) {
            throw new NullPointerException();
        }
        if (bufferPoolArr != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= bufferPoolArr.length) {
                    bufferPool3 = null;
                    break;
                } else {
                    if (bufferPoolArr[i4] != null && bufferPoolArr[i4].getType() == 1) {
                        bufferPool3 = bufferPoolArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            int i5 = 0;
            while (true) {
                if (i5 >= bufferPoolArr.length) {
                    bufferPool = null;
                    bufferPool2 = bufferPool3;
                    break;
                } else {
                    if (bufferPoolArr[i5] != null && bufferPoolArr[i5].getType() == 2) {
                        bufferPool = bufferPoolArr[i5];
                        bufferPool2 = bufferPool3;
                        break;
                    }
                    i5++;
                }
            }
        } else {
            bufferPool = null;
            bufferPool2 = null;
        }
        this.f138z = figureArr.length;
        int params = 0;
        for (int i6 = 0; i6 < this.f138z; i6++) {
            VertexBuffer vertexBuffer = (VertexBuffer) figureArr[i6].findObject3D(3, -1);
            IndexBuffer indexBuffer = (IndexBuffer) figureArr[i6].findObject3D(4, -1);
            if (vertexBuffer == null || indexBuffer == null) {
                throw new IllegalArgumentException();
            }
            if (indexBuffer.f345r == null) {
                throw new IllegalArgumentException();
            }
            if (i6 == 0) {
                params = vertexBuffer.getParams();
                i3 = indexBuffer.f336a;
                if (i3 != 4 && i3 != 5) {
                    throw new IllegalArgumentException();
                }
            } else {
                if (params != vertexBuffer.getParams()) {
                    throw new IllegalArgumentException();
                }
                if (i3 != indexBuffer.f336a) {
                    throw new IllegalArgumentException();
                }
            }
            int maxVerticesNum = vertexBuffer.getMaxVerticesNum() + i;
            switch (indexBuffer.f336a) {
                case 4:
                case 5:
                    polygonCount = (indexBuffer.getPolygonCount() * 3) + i2;
                    break;
                default:
                    polygonCount = -1;
                    break;
            }
            i2 = polygonCount;
            i = maxVerticesNum;
        }
        this.f130r = new Figure[this.f138z];
        this.f131s = new C0089dg[this.f138z];
        this.f132t = new C0089dg[this.f138z];
        this.f133u = new int[this.f138z];
        this.f135w = new byte[this.f138z << 2];
        this.f124a = new BoneDeformer(i, this.f138z);
        params = VertexBuffer.m309h(params) ? params | VertexBuffer.TEXTURECOORDF_0 : params;
        int i7 = VertexBuffer.m310i(params) ? params | VertexBuffer.TEXTURECOORDF_1 : params;
        this.f125b = new VertexBuffer(bufferPool2, i7 | 16, i);
        int[] iArr = new int[8];
        int iM325a = this.f125b.m325a(VertexBuffer.m308g(i7) ? 127 : 111, iArr);
        if (iM325a != 0) {
            this.f125b.m330a(iM325a, iArr, this.f124a, false);
        }
        int[] iArr2 = {i2};
        short[] sArr2 = new short[i2];
        int iM33a = 0;
        int i8 = 0;
        fArr[0] = 1.0f;
        int i9 = 0;
        while (true) {
            int i10 = iM33a;
            if (i9 >= this.f138z) {
                this.f126c = new IndexBuffer(bufferPool, 4, iArr2, sArr2, 0);
                this.f126c.setAppearance(appearance);
                this.f126c.m159a();
                this.f136x = new boolean[this.f138z];
                for (int i11 = 0; i11 < this.f138z; i11++) {
                    this.f136x[i11] = z;
                }
                this.f120A = true;
                this.f134v = new Transform[this.f138z][];
                for (int i12 = 0; i12 < this.f138z; i12++) {
                    this.f134v[i12] = new Transform[2];
                    for (int i13 = 0; i13 < 2; i13++) {
                        this.f134v[i12][i13] = new Transform();
                    }
                }
                return;
            }
            VertexBuffer vertexBuffer2 = (VertexBuffer) figureArr[i9].findObject3D(3, -1);
            IndexBuffer indexBuffer2 = (IndexBuffer) figureArr[i9].findObject3D(4, -1);
            this.f130r[i9] = figureArr[i9];
            int iM32a = m32a(i8, i10, indexBuffer2, sArr2);
            this.f131s[i9] = new C0089dg(indexBuffer2, vertexBuffer2, i8, iM32a - i8, vertexBuffer2.getMaxVerticesNum(), i9);
            this.f132t[i9] = this.f131s[i9];
            sArr[0] = (short) i9;
            int maxVerticesNum2 = vertexBuffer2.getMaxVerticesNum() + i10;
            for (int i14 = i10; i14 < maxVerticesNum2; i14++) {
                this.f124a.setTransformAndWeights(i14, sArr, fArr, 1);
            }
            iM33a = m33a(i10, i7, vertexBuffer2, this.f125b);
            this.f133u[i9] = iM33a;
            i9++;
            i8 = iM32a;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m32a(int i, int i2, IndexBuffer indexBuffer, short[] sArr) {
        int i3 = 0;
        int i4 = indexBuffer.f342g > 0 ? indexBuffer.f340e - 1 : indexBuffer.f340e;
        int[] iArr = indexBuffer.f344q;
        switch (indexBuffer.f336a) {
            case 4:
                int i5 = 0;
                int i6 = 0;
                int i7 = i;
                while (i6 < i4) {
                    int i8 = iArr[i6];
                    int i9 = 0;
                    int i10 = i7;
                    while (i9 < i8) {
                        sArr[i10] = (short) (indexBuffer.f345r[i5 + i9] + i2);
                        i9++;
                        i10++;
                    }
                    i5 += iArr[i6];
                    i6++;
                    i7 = i10;
                }
                return i7;
            case 5:
                int i11 = 0;
                int i12 = 0;
                int i13 = i;
                while (i12 < i4) {
                    int i14 = iArr[i12] - 2;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((i15 & 1) == 0) {
                            int i16 = i13 + 1;
                            sArr[i13] = (short) (indexBuffer.f345r[i11 + i15] + i2);
                            int i17 = i16 + 1;
                            sArr[i16] = (short) (indexBuffer.f345r[i11 + i15 + 1] + i2);
                            i13 = i17 + 1;
                            sArr[i17] = (short) (indexBuffer.f345r[i11 + i15 + 2] + i2);
                        } else {
                            int i18 = i13 + 1;
                            sArr[i13] = (short) (indexBuffer.f345r[i11 + i15 + 1] + i2);
                            int i19 = i18 + 1;
                            sArr[i18] = (short) (indexBuffer.f345r[i11 + i15] + i2);
                            i13 = i19 + 1;
                            sArr[i19] = (short) (indexBuffer.f345r[i11 + i15 + 2] + i2);
                        }
                    }
                    int i20 = iArr[i12] + i11;
                    i12++;
                    i11 = i20;
                }
                if (indexBuffer.f342g <= 0) {
                    return i13;
                }
                int i21 = indexBuffer.f342g;
                int i22 = i13;
                while (i3 < i21) {
                    sArr[i22] = (short) (indexBuffer.f345r[i11 + i3] + i2);
                    i3++;
                    i22++;
                }
                return i22;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m33a(int i, int i2, VertexBuffer vertexBuffer, VertexBuffer vertexBuffer2) {
        int maxVerticesNum = vertexBuffer.getMaxVerticesNum();
        int i3 = 1;
        for (int i4 = 0; i4 < 8; i4++) {
            if ((i3 & i2) != 0) {
                C0065cj c0065cj = vertexBuffer.f541f[i4];
                switch (c0065cj.m458a().f641a) {
                    case 0:
                        vertexBuffer2.setVertices(i3, i, c0065cj.m471d(), 0, maxVerticesNum);
                        break;
                    case 2:
                        if (i3 == 32 && (1048576 & i2) != 0) {
                            vertexBuffer2.m329a(i3, i, c0065cj.m472e(), 0, maxVerticesNum, vertexBuffer.m341d(0));
                        } else if (i3 != 64 || (2097152 & i2) == 0) {
                            vertexBuffer2.setVertices(i3, i, c0065cj.m472e(), 0, maxVerticesNum);
                        } else {
                            vertexBuffer2.m329a(i3, i, c0065cj.m472e(), 0, maxVerticesNum, vertexBuffer.m341d(1));
                        }
                        break;
                    case 3:
                        vertexBuffer2.setVertices(i3, i, c0065cj.m473f(), 0, maxVerticesNum);
                        break;
                }
            }
            i3 <<= 1;
        }
        return i + maxVerticesNum;
    }

    /* JADX INFO: renamed from: a */
    private Transform m34a(Figure figure, int i, TransformTree transformTree, Transform transform, int i2) {
        boolean z = figure.f229g != null;
        if (z) {
            transformTree = figure.f229g;
        }
        NodeDeformer nodeDeformer = figure.f226d;
        VertexBuffer vertexBuffer = figure.f225c;
        Transform[] transformArr = this.f134v[i];
        short s = figure.f223a;
        if (s > 0) {
            for (int i3 = 0; i3 < s; i3++) {
                Appearance appearance = figure.f224b[i3].f352y;
                if (appearance != null) {
                    if (appearance.m8b()) {
                        appearance.updatePosture();
                    }
                    for (int i4 = 0; i4 < 2; i4++) {
                        if (appearance.f110e[i4].f713k != null && appearance.f113p[i4]) {
                            Transform.m251e(transformArr[i4], appearance.f110e[i4].f712j.f960a);
                            if (!this.f121B) {
                                this.f121B = true;
                            }
                        }
                    }
                    if (appearance.f111f) {
                        float[] fArr = appearance.f108c.f853b;
                        int i5 = i << 2;
                        int i6 = i5 + 1;
                        this.f135w[i5] = (byte) (fArr[0] * 255.0f);
                        int i7 = i6 + 1;
                        this.f135w[i6] = (byte) (fArr[1] * 255.0f);
                        this.f135w[i7] = (byte) (fArr[2] * 255.0f);
                        this.f135w[i7 + 1] = (byte) (fArr[3] * 255.0f);
                        if (!this.f122C) {
                            this.f122C = true;
                        }
                    }
                }
            }
        }
        if (vertexBuffer != null) {
            return transform;
        }
        if (transformTree != null) {
            if (z) {
                transformTree.m287d(transform);
            }
            if (transformTree.m8b()) {
                transformTree.updatePosture();
                transformTree.relatedMultiply();
                transformTree.f506p = false;
                this.f124a.m60c();
            } else if (transformTree.f506p) {
                transformTree.relatedMultiply();
                transformTree.f506p = false;
                this.f124a.m60c();
            }
            if (nodeDeformer != null) {
                short[] sArr = nodeDeformer.f393f;
                short s2 = nodeDeformer.f391d;
                for (int i8 = 0; i8 < s2; i8++) {
                    C0017ap c0017ap = nodeDeformer.f392e[sArr[i8]];
                    if (i2 >= 4) {
                        return null;
                    }
                    Transform transformM34a = m34a((Figure) c0017ap.f671a, i, nodeDeformer.f394g, c0017ap.m405a(nodeDeformer.f394g), i2 + 1);
                    if (transformM34a != null) {
                        return transformM34a;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m35a() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                return;
            }
            C0065cj c0065cjM337b = this.f125b.m337b(i2 + 5);
            if (c0065cjM337b != null) {
                float[] fArrM471d = c0065cjM337b.m471d();
                float[] fArrM471d2 = this.f125b.m339c(i2 + 5).m471d();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f138z; i6++) {
                    float[] fArr = this.f134v[i6][i2].f494b.m;
                    int i7 = this.f133u[i6];
                    while (i3 < i7) {
                        int i8 = i4 + 1;
                        float f = fArrM471d[i4];
                        i4 = i8 + 1;
                        float f2 = fArrM471d[i8];
                        int i9 = i5 + 1;
                        fArrM471d2[i5] = (fArr[0] * f) + (fArr[4] * f2) + fArr[12];
                        i5 = i9 + 1;
                        fArrM471d2[i9] = (f2 * fArr[5]) + (f * fArr[1]) + fArr[13];
                        i3++;
                    }
                }
                this.f125b.f540e[i2 + 5] = true;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36b() {
        C0065cj c0065cjM337b = this.f125b.m337b(4);
        C0065cj c0065cjM339c = this.f125b.m339c(4);
        if (c0065cjM339c == null) {
            return;
        }
        byte[] bArr = this.f135w;
        byte[] bArrM473f = c0065cjM339c.m473f();
        if (c0065cjM337b == c0065cjM339c) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i4 < this.f138z) {
                int i5 = i2 + 1;
                byte b = bArr[i2];
                int i6 = i5 + 1;
                byte b2 = bArr[i5];
                int i7 = i6 + 1;
                byte b3 = bArr[i6];
                int i8 = i7 + 1;
                byte b4 = bArr[i7];
                int i9 = this.f133u[i4];
                while (i3 < i9) {
                    int i10 = i + 1;
                    bArrM473f[i] = b;
                    int i11 = i10 + 1;
                    bArrM473f[i10] = b2;
                    int i12 = i11 + 1;
                    bArrM473f[i11] = b3;
                    i = i12 + 1;
                    bArrM473f[i12] = b4;
                    i3++;
                }
                i4++;
                i2 = i8;
            }
        } else {
            byte[] bArrM473f2 = c0065cjM337b.m473f();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.f138z) {
                int i17 = i14 + 1;
                int i18 = bArr[i14] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                int i19 = i17 + 1;
                int i20 = bArr[i17] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                int i21 = i19 + 1;
                int i22 = bArr[i19] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                i14 = i21 + 1;
                int i23 = bArr[i21] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                int i24 = this.f133u[i16];
                int i25 = i13;
                while (i15 < i24) {
                    bArrM473f[i25] = (byte) (((bArrM473f2[i25] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) * i18) >> 8);
                    int i26 = i25 + 1;
                    bArrM473f[i26] = (byte) (((bArrM473f2[i26] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) * i20) >> 8);
                    int i27 = i26 + 1;
                    bArrM473f[i27] = (byte) (((bArrM473f2[i27] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) * i22) >> 8);
                    int i28 = i27 + 1;
                    bArrM473f[i28] = (byte) (((bArrM473f2[i28] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) * i23) >> 8);
                    i25 = i28 + 1;
                    i15++;
                }
                i16++;
                i13 = i25;
            }
        }
        this.f125b.f540e[4] = true;
    }

    /* JADX INFO: renamed from: a */
    final void m37a(GraphicsOGL graphicsOGL, Graphics3D graphics3D) {
        if (this.f123D) {
            this.f127d[0].m490a(graphics3D, graphicsOGL);
            this.f127d = null;
            this.f125b.f551x.m503a(graphics3D, graphicsOGL);
            this.f125b.f551x = null;
            if (this.f125b.f553z != null) {
                this.f125b.f553z.m503a(graphics3D, graphicsOGL);
                this.f125b.f553z = null;
            }
            this.f126c.f317D.m503a(graphics3D, graphicsOGL);
            this.f126c.f317D = null;
            this.f137y = null;
            this.f123D = false;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m38a(GraphicsOGL graphicsOGL, Graphics3D graphics3D, Transform transform, boolean z) {
        int i;
        if (z) {
            Transform[] transformArr = this.f124a.f145e.f563a.f651a;
            C0043bo[] c0043boArr = this.f127d[0].f889a;
            C0069cn[] c0069cnArr = this.f127d[0].f890b;
            short[] sArr = this.f126c.f345r;
            short[] sArr2 = this.f126c.f346s;
            byte[] bArr = c0043boArr[0].f736c.f808d;
            int i2 = graphics3D.f309h.f635b.f746a;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f138z; i7++) {
                C0089dg c0089dg = this.f131s[i7];
                if (this.f136x[i7]) {
                    c0089dg.f863b.m169b(c0089dg.f864c);
                    c0089dg.f864c.m338b();
                    f117g.m261a(transform, transformArr[i7]);
                    f117g.m262a(c0089dg.f863b.f353z, f118p);
                    c0089dg.f862a = f118p.distance(f119q);
                    this.f132t[i3] = c0089dg;
                    i3++;
                }
            }
            C0108g.m505a(this.f132t, i3, 1);
            int i8 = 0;
            int i9 = 0;
            while (i9 < i3) {
                C0089dg c0089dg2 = this.f132t[i9];
                int i10 = c0089dg2.f865d + c0089dg2.f866e;
                int i11 = c0089dg2.f865d;
                while (i11 < i10) {
                    sArr2[i4] = sArr[i11];
                    bArr[sArr[i11]] = (byte) i6;
                    i11++;
                    i4++;
                }
                i8 += c0089dg2.f866e;
                int i12 = i6 + 1;
                c0043boArr[i5].f734a[i6] = (short) c0089dg2.f867f;
                if (i12 >= i2) {
                    i = i5 + 1;
                    c0069cnArr[i5].f806b = i8;
                    i8 = 0;
                    i12 = 0;
                } else {
                    i = i5;
                }
                i9++;
                i6 = i12;
                i5 = i;
            }
            if (i8 > 0) {
                c0069cnArr[i5].f806b = i8;
                i5++;
            }
            if (this.f126c.f315B != null) {
                this.f126c.f315B.m70a(this.f126c.f316C[0]);
            }
            this.f126c.f344q[0] = i4;
            this.f126c.m170c();
            this.f127d[0].f892d.m500a(graphicsOGL, graphics3D.f309h, this.f127d[0].f890b, this.f126c);
            c0043boArr[0].f736c.m475a();
            if (this.f137y[0].f811g != null) {
                this.f137y[0].f811g.m70a(this.f137y[0].f812h);
            }
            this.f127d[0].f893e = i5;
            this.f127d[0].f891c.m499a(graphicsOGL, graphics3D.f309h, this.f137y);
            this.f120A = false;
        }
        if (this.f121B) {
            m35a();
            this.f121B = false;
        }
        if (this.f122C) {
            m36b();
            this.f122C = false;
        }
        if (this.f120A) {
            C0043bo[] c0043boArr2 = this.f127d[0].f889a;
            C0069cn[] c0069cnArr2 = this.f127d[0].f890b;
            short[] sArr3 = this.f126c.f345r;
            short[] sArr4 = this.f126c.f346s;
            byte[] bArr2 = c0043boArr2[0].f736c.f808d;
            int i13 = graphics3D.f309h.f635b.f746a;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < this.f138z; i18++) {
                if (this.f136x[i18]) {
                    C0089dg c0089dg3 = this.f131s[i18];
                    int i19 = c0089dg3.f865d + c0089dg3.f866e;
                    int i20 = c0089dg3.f865d;
                    while (i20 < i19) {
                        sArr4[i14] = sArr3[i20];
                        bArr2[sArr3[i20]] = (byte) i16;
                        i20++;
                        i14++;
                    }
                    i17 += c0089dg3.f866e;
                    int i21 = i16 + 1;
                    c0043boArr2[i15].f734a[i16] = (short) c0089dg3.f867f;
                    if (i21 >= i13) {
                        c0069cnArr2[i15].f806b = i17;
                        i17 = 0;
                        i16 = 0;
                        i15++;
                    } else {
                        i16 = i21;
                    }
                }
            }
            if (i17 > 0) {
                c0069cnArr2[i15].f806b = i17;
                i15++;
            }
            if (this.f126c.f315B != null) {
                this.f126c.f315B.m70a(this.f126c.f316C[0]);
            }
            this.f126c.f344q[0] = i14;
            this.f126c.m170c();
            this.f127d[0].f892d.m500a(graphicsOGL, graphics3D.f309h, this.f127d[0].f890b, this.f126c);
            c0043boArr2[0].f736c.m475a();
            if (this.f137y[0].f811g != null) {
                this.f137y[0].f811g.m70a(this.f137y[0].f812h);
            }
            this.f127d[0].f893e = i15;
            this.f127d[0].f891c.m499a(graphicsOGL, graphics3D.f309h, this.f137y);
            this.f120A = false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    final void m39a(BufferPool bufferPool, BufferPool bufferPool2, GraphicsOGL graphicsOGL, Graphics3D graphics3D) throws IllegalStateException {
        if (this.f123D) {
            throw new IllegalStateException();
        }
        int[] iArr = new int[2];
        int iM495a = C0104dv.m495a(this.f125b, this.f124a, graphics3D.f309h.f635b.f747b);
        C0096dn.m486a(iArr, graphics3D.f309h, this.f126c, this.f124a, true);
        C0104dv c0104dv = new C0104dv(graphicsOGL, graphics3D.f309h, 0, iM495a + iArr[0]);
        C0104dv c0104dv2 = new C0104dv(graphicsOGL, graphics3D.f309h, 1, iArr[1]);
        for (int i = 0; i < this.f138z; i++) {
            this.f130r[i].m122b(1);
            updatePosture(i, graphics3D.f304c);
        }
        m40a(graphics3D, graphics3D.f304c, false);
        this.f124a.m43a();
        this.f127d = new C0096dn[1];
        this.f127d[0] = new C0096dn(bufferPool, bufferPool2, graphicsOGL, graphics3D.f309h, this.f126c, this.f124a, true, c0104dv, c0104dv2, true);
        c0104dv.m497a(graphicsOGL, graphics3D, this.f125b, this.f124a);
        this.f125b.f551x = c0104dv;
        this.f126c.f317D = c0104dv2;
        this.f137y = new C0069cn[1];
        this.f137y[0] = this.f127d[0].f889a[0].f736c;
        this.f123D = true;
    }

    /* JADX INFO: renamed from: a */
    final void m40a(Graphics3D graphics3D, Transform transform, boolean z) {
        boolean z2 = graphics3D.f302a && this.f125b.f541f[1] != null;
        this.f124a.m59b(this.f125b);
        if (z2) {
            this.f124a.m62d();
            this.f124a.m61c(this.f125b);
        }
        if (z) {
            Transform[] transformArr = this.f124a.f145e.f563a.f651a;
            short[] sArr = this.f126c.f345r;
            short[] sArr2 = this.f126c.f346s;
            int i = 0;
            for (int i2 = 0; i2 < this.f138z; i2++) {
                C0089dg c0089dg = this.f131s[i2];
                if (this.f136x[i2]) {
                    c0089dg.f863b.m169b(c0089dg.f864c);
                    c0089dg.f864c.m338b();
                    f117g.m261a(transform, transformArr[i2]);
                    f117g.m262a(c0089dg.f863b.f353z, f118p);
                    c0089dg.f862a = f118p.distance(f119q);
                    this.f132t[i] = c0089dg;
                    i++;
                }
            }
            C0108g.m505a(this.f132t, i, 1);
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                C0089dg c0089dg2 = this.f132t[i4];
                int i5 = c0089dg2.f866e + c0089dg2.f865d;
                int i6 = c0089dg2.f865d;
                while (i6 < i5) {
                    sArr2[i3] = sArr[i6];
                    i6++;
                    i3++;
                }
            }
            if (this.f126c.f315B != null) {
                this.f126c.f315B.m70a(this.f126c.f316C[0]);
            }
            this.f126c.f344q[0] = i3;
            this.f126c.m170c();
            this.f120A = false;
        }
        if (this.f121B) {
            m35a();
            this.f121B = false;
        }
        if (this.f122C) {
            m36b();
            this.f122C = false;
        }
        if (this.f120A) {
            short[] sArr3 = this.f126c.f345r;
            short[] sArr4 = this.f126c.f346s;
            int i7 = 0;
            for (int i8 = 0; i8 < this.f138z; i8++) {
                if (this.f136x[i8]) {
                    C0089dg c0089dg3 = this.f131s[i8];
                    int i9 = c0089dg3.f866e + c0089dg3.f865d;
                    int i10 = c0089dg3.f865d;
                    while (i10 < i9) {
                        sArr4[i7] = sArr3[i10];
                        i10++;
                        i7++;
                    }
                }
            }
            if (this.f126c.f315B != null) {
                this.f126c.f315B.m70a(this.f126c.f316C[0]);
            }
            this.f126c.f344q[0] = i7;
            this.f126c.m170c();
            this.f120A = false;
        }
    }

    public final Appearance getAppearance() {
        return this.f126c.f352y;
    }

    public final Figure getFigure(int i) {
        if (i < 0 || i >= this.f138z) {
            throw new IllegalArgumentException();
        }
        return this.f130r[i];
    }

    public final int getFigureNum() {
        return this.f138z;
    }

    public final void getTransform(int i, Transform transform) {
        if (i < 0 || i >= this.f138z) {
            throw new IllegalArgumentException();
        }
        if (transform == null) {
            throw new NullPointerException();
        }
        Transform.m251e(transform, this.f124a.f145e.f563a.f651a[i]);
    }

    public final boolean isVisible(int i) {
        if (i < 0 || i >= this.f138z) {
            throw new IllegalArgumentException();
        }
        return this.f136x[i];
    }

    public final void purgeBufferAll() {
        if (this.f128e) {
            return;
        }
        if (this.f127d != null) {
            this.f127d[0].m489a();
        }
        this.f125b.purgeBuffer();
        this.f126c.purgeBuffer();
        this.f128e = true;
    }

    public final void setAppearance(Appearance appearance) {
        this.f126c.f352y = appearance;
    }

    public final void setColor(int i, int i2) {
        if (i < 0 || i >= this.f138z) {
            throw new IllegalArgumentException();
        }
        int i3 = i << 2;
        byte b = (byte) i2;
        byte b2 = (byte) (i2 >> 4);
        byte b3 = (byte) (i2 >> 16);
        byte b4 = (byte) (i2 >>> 24);
        if (b == this.f135w[i3] && b2 == this.f135w[i3 + 1] && b3 == this.f135w[i3 + 2] && b4 == this.f135w[i3 + 3]) {
            return;
        }
        int i4 = i3 + 1;
        this.f135w[i3] = b;
        int i5 = i4 + 1;
        this.f135w[i4] = b2;
        this.f135w[i5] = b3;
        this.f135w[i5 + 1] = b4;
        this.f122C = true;
    }

    public final void setTransform(int i, Transform transform) {
        if (i < 0 || i >= this.f138z) {
            throw new IllegalArgumentException();
        }
        if (transform == null) {
            throw new NullPointerException();
        }
        Transform.m251e(this.f124a.f145e.f563a.f651a[i], transform);
        this.f124a.m60c();
    }

    public final void setVisible(int i, boolean z) {
        if (i < 0 || i >= this.f138z) {
            throw new IllegalArgumentException();
        }
        if (this.f136x[i] != z) {
            this.f136x[i] = z;
            this.f120A = true;
        }
    }

    public final void updatePosture(int i, Transform transform) {
        if (i < 0 || i >= this.f138z) {
            throw new IllegalArgumentException();
        }
        Transform transformM34a = m34a(this.f130r[i], i, null, transform, 1);
        if (transformM34a != null) {
            Transform.m251e(this.f124a.f145e.f563a.f651a[i], transformM34a);
        }
    }
}
