package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.ogl.ByteBuffer;
import com.docomostar.ui.ogl.DirectBuffer;
import com.docomostar.ui.ogl.DirectBufferFactory;
import com.docomostar.ui.ogl.FloatBuffer;
import com.docomostar.ui.ogl.GraphicsOGL;
import com.docomostar.ui.ogl.ShortBuffer;
import java.util.Vector;
import p000.GameStatus;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class VertexBuffer extends Object3D {
    public static final int BINORMAL = 4;
    public static final int COLOR = 16;

    /* JADX INFO: renamed from: J */
    private static final Transform f519J = new Transform();

    /* JADX INFO: renamed from: K */
    private static final Transform f520K = new Transform();

    /* JADX INFO: renamed from: L */
    private static final C0013al[][] f521L;
    public static final int NORMAL = 2;
    public static final int POSITION = 1;
    public static final int SPRITE = 128;
    public static final int SPRITE_PER_OBJ = 16777216;
    public static final int TANGENT = 8;
    public static final int TEXTURE2D_0 = 32;
    public static final int TEXTURE2D_1 = 64;
    public static final int TEXTURECOORDF_0 = 1048576;
    public static final int TEXTURECOORDF_1 = 2097152;
    public static final int TYPE_BYTE = 3;
    public static final int TYPE_FLOAT = 0;
    public static final int TYPE_SHORT = 2;
    public static final int TYPE_UNDEF = -1;

    /* JADX INFO: renamed from: A */
    C0076cu f522A;

    /* JADX INFO: renamed from: B */
    byte f523B;

    /* JADX INFO: renamed from: C */
    byte f524C;

    /* JADX INFO: renamed from: D */
    byte f525D;

    /* JADX INFO: renamed from: E */
    byte f526E;

    /* JADX INFO: renamed from: F */
    boolean f527F;

    /* JADX INFO: renamed from: G */
    boolean f528G;

    /* JADX INFO: renamed from: H */
    Figure f529H;

    /* JADX INFO: renamed from: I */
    final C0013al[] f530I;

    /* JADX INFO: renamed from: M */
    private float[] f531M;

    /* JADX INFO: renamed from: N */
    private float[] f532N;

    /* JADX INFO: renamed from: O */
    private Transform[] f533O;

    /* JADX INFO: renamed from: P */
    private Vector f534P;

    /* JADX INFO: renamed from: Q */
    private C0076cu[] f535Q;

    /* JADX INFO: renamed from: a */
    int f536a;

    /* JADX INFO: renamed from: b */
    int f537b;

    /* JADX INFO: renamed from: c */
    int[] f538c;

    /* JADX INFO: renamed from: d */
    boolean[] f539d;

    /* JADX INFO: renamed from: e */
    boolean[] f540e;

    /* JADX INFO: renamed from: f */
    C0065cj[] f541f;

    /* JADX INFO: renamed from: g */
    int[] f542g;

    /* JADX INFO: renamed from: p */
    C0065cj[] f543p;

    /* JADX INFO: renamed from: q */
    DirectBuffer[] f544q;

    /* JADX INFO: renamed from: r */
    byte f545r;

    /* JADX INFO: renamed from: s */
    int f546s;

    /* JADX INFO: renamed from: t */
    float[][] f547t;

    /* JADX INFO: renamed from: u */
    float[] f548u;

    /* JADX INFO: renamed from: v */
    BufferPool f549v;

    /* JADX INFO: renamed from: w */
    C0122u f550w;

    /* JADX INFO: renamed from: x */
    C0104dv f551x;

    /* JADX INFO: renamed from: y */
    C0069cn[] f552y;

    /* JADX INFO: renamed from: z */
    C0104dv f553z;

    static {
        C0013al[][] c0013alArr = new C0013al[4][];
        f521L = c0013alArr;
        c0013alArr[0] = new C0013al[13];
        f521L[0][0] = new C0013al(0, 0, 3);
        f521L[0][1] = new C0013al(2, 0, 3);
        f521L[0][2] = new C0013al(2, 0, 3);
        f521L[0][3] = new C0013al(2, 0, 3);
        f521L[0][4] = new C0013al(3, 3, 4);
        f521L[0][5] = new C0013al(2, 2, 2);
        f521L[0][6] = new C0013al(2, 2, 2);
        f521L[0][7] = new C0013al(0, 0, 7);
        f521L[0][9] = new C0013al(-1, 2, 2);
        f521L[0][10] = new C0013al(-1, 2, 2);
        f521L[0][11] = new C0013al(-1, 3, 4);
        f521L[0][12] = new C0013al(-1, 0, 3);
        f521L[1] = new C0013al[13];
        f521L[1][0] = new C0013al(0, 0, 3);
        f521L[1][1] = new C0013al(2, 0, 3);
        f521L[1][2] = new C0013al(2, 0, 3);
        f521L[1][3] = new C0013al(2, 0, 3);
        f521L[1][4] = new C0013al(3, 3, 4);
        f521L[1][5] = new C0013al(0, 0, 2);
        f521L[1][6] = new C0013al(0, 0, 2);
        f521L[1][7] = new C0013al(0, 0, 7);
        f521L[1][9] = new C0013al(-1, 2, 2);
        f521L[1][10] = new C0013al(-1, 2, 2);
        f521L[1][11] = new C0013al(-1, 3, 4);
        f521L[1][12] = new C0013al(-1, 0, 3);
        f521L[2] = new C0013al[13];
        f521L[2][0] = new C0013al(0, 0, 3);
        f521L[2][1] = new C0013al(2, 0, 3);
        f521L[2][2] = new C0013al(2, 0, 3);
        f521L[2][3] = new C0013al(2, 0, 3);
        f521L[2][4] = new C0013al(3, 3, 4);
        f521L[2][5] = new C0013al(0, 0, 2);
        f521L[2][6] = new C0013al(2, 2, 2);
        f521L[2][7] = new C0013al(0, 0, 7);
        f521L[2][9] = new C0013al(-1, 2, 2);
        f521L[2][10] = new C0013al(-1, 2, 2);
        f521L[2][11] = new C0013al(-1, 3, 4);
        f521L[2][12] = new C0013al(-1, 0, 3);
        f521L[3] = new C0013al[13];
        f521L[3][0] = new C0013al(0, 0, 3);
        f521L[3][1] = new C0013al(2, 0, 3);
        f521L[3][2] = new C0013al(2, 0, 3);
        f521L[3][3] = new C0013al(2, 0, 3);
        f521L[3][4] = new C0013al(3, 3, 4);
        f521L[3][5] = new C0013al(2, 2, 2);
        f521L[3][6] = new C0013al(0, 0, 2);
        f521L[3][7] = new C0013al(0, 0, 7);
        f521L[3][9] = new C0013al(-1, 2, 2);
        f521L[3][10] = new C0013al(-1, 2, 2);
        f521L[3][11] = new C0013al(-1, 3, 4);
        f521L[3][12] = new C0013al(-1, 0, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VertexBuffer(BufferPool bufferPool, int i, int i2) {
        super(3);
        int i3 = 1;
        if (bufferPool != null && bufferPool.getType() != 1) {
            throw new IllegalArgumentException();
        }
        m311j(i);
        if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException();
        }
        m312k();
        this.f530I = m307f(i);
        this.f536a = i;
        this.f549v = bufferPool;
        for (int i4 = 0; i4 < 8; i4++) {
            if ((i3 & i) != 0) {
                this.f538c[i4] = i2;
                this.f541f[i4] = new C0065cj(i2, this.f530I[i4].f641a, this.f530I[i4]);
            }
            i3 <<= 1;
        }
        m316m();
        m330a(0, (int[]) null, (BoneDeformer) null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VertexBuffer(BufferPool bufferPool, int i, int[] iArr) {
        super(3);
        int i2 = 1;
        if (bufferPool != null && bufferPool.getType() != 1) {
            throw new IllegalArgumentException();
        }
        m311j(i);
        m312k();
        this.f530I = m307f(i);
        this.f536a = i;
        this.f549v = bufferPool;
        for (int i3 = 0; i3 < 8; i3++) {
            if ((i2 & i) != 0) {
                if (iArr[i3] <= 0 || iArr[i3] > 65535) {
                    throw new IllegalArgumentException();
                }
                this.f541f[i3] = new C0065cj(iArr[i3], this.f530I[i3].f641a, this.f530I[i3]);
            } else if (iArr[i3] != 0) {
                throw new IllegalArgumentException();
            }
            this.f538c[i3] = iArr[i3];
            i2 <<= 1;
        }
        m316m();
        m330a(0, (int[]) null, (BoneDeformer) null, false);
    }

    /* JADX INFO: renamed from: a */
    private final DirectBuffer m303a(int i, int i2, C0013al c0013al, int i3) {
        if (i3 == 2 || i3 == 3) {
            return null;
        }
        DirectBufferFactory factory = DirectBufferFactory.getFactory();
        if (this.f549v != null) {
            return (i3 == 1 && i2 == 0) ? this.f549v.f157b[i3] : this.f549v.f156a[i3];
        }
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
    private final void m304a(int i, BoneDeformer boneDeformer) {
        int i2 = 1;
        for (int i3 = 0; i3 < 8; i3++) {
            if ((i2 & i) != 0) {
                switch (i2) {
                    case 1:
                        if (boneDeformer != null) {
                            m305a(i3, boneDeformer.f142b);
                            continue;
                        }
                        break;
                    case 2:
                    case 4:
                    case 8:
                        if (boneDeformer == null) {
                            m317m(i3);
                            continue;
                        } else {
                            m306b(i3, boneDeformer.f142b);
                        }
                        break;
                    case 16:
                        m318n(i3);
                        continue;
                    case 32:
                    case 64:
                        if (this.f530I[i3].f641a == 2) {
                            m315l(i3);
                        }
                        break;
                    default:
                        continue;
                }
                m313k(i3);
            }
            i2 <<= 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m305a(int i, short[] sArr) {
        C0013al c0013alM458a = this.f541f[i].m458a();
        float[] fArrM471d = this.f541f[i].m471d();
        float[] fArrM471d2 = this.f543p[i].m471d();
        int i2 = c0013alM458a.f643c;
        int iM466b = this.f541f[i].m466b();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iM466b; i5++) {
            short s = sArr[i5];
            for (int i6 = 0; i6 < s; i6++) {
                int i7 = i3;
                int i8 = 0;
                while (i8 < i2) {
                    fArrM471d2[i4] = fArrM471d[i7];
                    i8++;
                    i4++;
                    i7++;
                }
            }
            i3 += i2;
        }
        this.f540e[i] = true;
        if (i == 0) {
            m340c();
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m306b(int i, short[] sArr) {
        C0013al c0013alM458a = this.f541f[i].m458a();
        short[] sArrM472e = this.f541f[i].m472e();
        float[] fArrM471d = this.f543p[i].m471d();
        int i2 = c0013alM458a.f643c;
        int iM466b = this.f541f[i].m466b();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iM466b; i5++) {
            short s = sArr[i5];
            for (int i6 = 0; i6 < s; i6++) {
                int i7 = i3;
                int i8 = 0;
                while (i8 < i2) {
                    fArrM471d[i4] = sArrM472e[i7] * 3.051851E-5f;
                    i8++;
                    i4++;
                    i7++;
                }
            }
            i3 += i2;
        }
        this.f540e[i] = true;
    }

    /* JADX INFO: renamed from: f */
    static final C0013al[] m307f(int i) {
        if (m323s(i)) {
            return f521L[1];
        }
        if ((i & TEXTURECOORDF_0) != 0 && (i & TEXTURECOORDF_1) != 0) {
            return f521L[1];
        }
        if ((i & TEXTURECOORDF_0) != 0) {
            return f521L[2];
        }
        return (i & TEXTURECOORDF_1) != 0 ? f521L[3] : f521L[0];
    }

    /* JADX INFO: renamed from: g */
    static final boolean m308g(int i) {
        return (i & 16) != 0;
    }

    /* JADX INFO: renamed from: h */
    static final boolean m309h(int i) {
        return (i & 32) != 0;
    }

    /* JADX INFO: renamed from: i */
    static final boolean m310i(int i) {
        return (i & 64) != 0;
    }

    /* JADX INFO: renamed from: j */
    private static void m311j(int i) {
        if (!((i & 1) != 0)) {
            throw new IllegalArgumentException();
        }
        if (!m320p(i) && m321q(i)) {
            throw new IllegalArgumentException();
        }
        if (!(m320p(i) && m321q(i)) && m322r(i)) {
            throw new IllegalArgumentException();
        }
        if (m323s(i)) {
            if (m320p(i) || m321q(i) || m322r(i) || m309h(i) || m310i(i)) {
                throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m312k() {
        this.f538c = new int[8];
        this.f542g = new int[13];
        this.f539d = new boolean[8];
        this.f540e = new boolean[8];
        this.f541f = new C0065cj[8];
        this.f543p = new C0065cj[13];
        this.f544q = new DirectBuffer[13];
        this.f533O = new Transform[2];
        for (int i = 0; i < 2; i++) {
            this.f533O[i] = new Transform();
        }
        this.f547t = new float[2][];
        for (int i2 = 0; i2 < 2; i2++) {
            this.f547t[i2] = new float[4];
            this.f547t[i2][0] = 1.0f;
            this.f547t[i2][1] = 0.0f;
            this.f547t[i2][2] = 0.0f;
            this.f547t[i2][3] = 0.0f;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            this.f539d[i3] = false;
            this.f540e[i3] = false;
        }
        this.f548u = new float[4];
        this.f548u[0] = 1.0f;
        this.f548u[1] = 1.0f;
        this.f548u[2] = 1.0f;
        this.f548u[3] = 1.0f;
        this.f522A = new C0076cu();
        this.f534P = new Vector(1, 1);
        this.f534P.addElement(this.f522A);
        m314l();
        this.f523B = (byte) 0;
        this.f524C = (byte) 0;
        this.f525D = (byte) 1;
        this.f526E = (byte) 0;
    }

    /* JADX INFO: renamed from: k */
    private final void m313k(int i) {
        C0013al c0013alM458a = this.f541f[i].m458a();
        float[] fArrM471d = this.f541f[i].m471d();
        float[] fArrM471d2 = this.f543p[i].m471d();
        int iM466b = this.f541f[i].m466b() * c0013alM458a.f643c;
        for (int i2 = 0; i2 < iM466b; i2++) {
            fArrM471d2[i2] = fArrM471d[i2];
        }
        this.f540e[i] = true;
        if (i == 0) {
            m340c();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m314l() {
        int size = this.f534P.size();
        this.f535Q = new C0076cu[size];
        for (int i = 0; i < size; i++) {
            this.f535Q[i] = (C0076cu) this.f534P.elementAt(i);
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m315l(int i) {
        C0013al c0013alM458a = this.f541f[i].m458a();
        short[] sArrM472e = this.f541f[i].m472e();
        short[] sArrM472e2 = this.f543p[i].m472e();
        int iM466b = this.f541f[i].m466b() * c0013alM458a.f643c;
        for (int i2 = 0; i2 < iM466b; i2++) {
            sArrM472e2[i2] = sArrM472e[i2];
        }
        this.f540e[i] = true;
    }

    /* JADX INFO: renamed from: m */
    private final void m316m() {
        for (int i = 0; i < 8; i++) {
            if (this.f541f[i] != null) {
                this.f539d[i] = true;
                this.f540e[i] = true;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m317m(int i) {
        C0013al c0013alM458a = this.f541f[i].m458a();
        short[] sArrM472e = this.f541f[i].m472e();
        float[] fArrM471d = this.f543p[i].m471d();
        int iM466b = this.f541f[i].m466b() * c0013alM458a.f643c;
        for (int i2 = 0; i2 < iM466b; i2++) {
            fArrM471d[i2] = sArrM472e[i2] * 3.051851E-5f;
        }
        this.f540e[i] = true;
    }

    /* JADX INFO: renamed from: n */
    private final void m318n(int i) {
        C0013al c0013alM458a = this.f541f[i].m458a();
        byte[] bArrM473f = this.f541f[i].m473f();
        byte[] bArrM473f2 = this.f543p[i].m473f();
        int iM466b = this.f541f[i].m466b() * c0013alM458a.f643c;
        for (int i2 = 0; i2 < iM466b; i2++) {
            bArrM473f2[i2] = bArrM473f[i2];
        }
        this.f540e[i] = true;
    }

    /* JADX INFO: renamed from: o */
    private static int m319o(int i) {
        int i2 = 1;
        for (int i3 = 0; i3 < 32; i3++) {
            if ((i & i2) != 0) {
                if (((i2 ^ (-1)) & i) != 0) {
                    throw new IllegalArgumentException();
                }
                return i3;
            }
            i2 <<= 1;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: p */
    private static boolean m320p(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: q */
    private static boolean m321q(int i) {
        return (i & 4) != 0;
    }

    /* JADX INFO: renamed from: r */
    private static boolean m322r(int i) {
        return (i & 8) != 0;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m323s(int i) {
        return (i & 128) != 0;
    }

    /* JADX INFO: renamed from: t */
    private static boolean m324t(int i) {
        return (i & 255) != 0;
    }

    /* JADX INFO: renamed from: a */
    final int m325a(int i, int[] iArr) {
        int i2 = this.f536a & i;
        if (i2 == (this.f537b & i)) {
            return 0;
        }
        int maxVerticesNum = getMaxVerticesNum();
        int i3 = 1;
        int i4 = i2 | this.f537b;
        int i5 = 0;
        while (i5 < 8) {
            if ((i4 & i3) != 0) {
                iArr[i5] = maxVerticesNum;
            } else {
                iArr[i5] = -1;
            }
            i5++;
            i3 <<= 1;
        }
        return i4;
    }

    /* JADX INFO: renamed from: a */
    final C0065cj m326a(Graphics3D graphics3D, GraphicsOGL graphicsOGL, int i) {
        this.f542g[i] = this.f543p[0].m466b();
        this.f543p[i] = new C0065cj(this.f542g[i], this.f530I[i].f642b, this.f530I[i]);
        if (this.f549v != null) {
            this.f549v.m71a(this.f550w, i);
        }
        this.f544q[i] = m303a(this.f542g[i], this.f530I[i].f642b, this.f530I[i], i);
        if (this.f551x != null) {
            C0104dv c0104dv = new C0104dv(graphicsOGL, graphics3D.f309h, 0, this.f543p[i].m470c());
            m334a(graphics3D, graphicsOGL);
            m338b();
            if (this.f549v != null) {
                this.f549v.m70a(this.f550w);
            }
            graphics3D.f309h.m388a(graphicsOGL, c0104dv);
            if (this.f542g[i] > 0 && this.f544q[i] != null) {
                int iM470c = this.f543p[i].m470c();
                this.f552y[i] = new C0069cn(-1, iM470c);
                this.f552y[i].f809e = c0104dv.f922c;
                C0009ah.m357a(graphicsOGL, c0104dv.f920a, this.f544q[i], c0104dv.f922c);
                c0104dv.f922c = Util3D.m298c(iM470c) + c0104dv.f922c;
            }
            this.f553z = c0104dv;
        }
        return this.f543p[i];
    }

    /* JADX INFO: renamed from: a */
    final void m327a() {
        int i = 1;
        int i2 = this.f538c[0] * 6;
        int i3 = this.f538c[4] > 0 ? 49 : 33;
        int i4 = 1;
        for (int i5 = 0; i5 < 8; i5++) {
            this.f542g[i5] = 0;
            this.f543p[i5] = null;
            if ((i4 & i3) != 0) {
                this.f542g[i5] = i2;
            }
            i4 <<= 1;
        }
        if (this.f549v != null) {
            if (this.f550w != null) {
                this.f550w.f1037e = true;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                if (i6 < this.f542g[i7]) {
                    i6 = this.f542g[i7];
                }
            }
            this.f550w = this.f549v.m69a(this, i6, this.f536a);
            if (this.f550w == null) {
                throw new OutOfMemoryError();
            }
        }
        int i8 = 0;
        while (i8 < 8) {
            if ((i & i3) != 0) {
                this.f543p[i8] = new C0065cj(this.f542g[i8], this.f530I[i8].f642b, this.f530I[i8]);
                this.f544q[i8] = m303a(this.f542g[i8], this.f530I[i8].f642b, this.f530I[i8], i8);
            }
            i8++;
            i <<= 1;
        }
        this.f537b = i3;
    }

    /* JADX INFO: renamed from: a */
    final void m328a(float f, float f2, float f3, float f4) {
        this.f548u[0] = f;
        this.f548u[1] = f2;
        this.f548u[2] = f3;
        this.f548u[3] = f4;
        this.f528G = true;
        if (this.f526E == 127) {
            this.f526E = (byte) -128;
        } else {
            this.f526E = (byte) (this.f526E + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m329a(int i, int i2, short[] sArr, int i3, int i4, Transform transform) {
        if (sArr == null) {
            throw new NullPointerException();
        }
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        if (!m309h(i) && !m310i(i)) {
            throw new IllegalArgumentException();
        }
        if (this.f530I[iM319o].f641a != 0) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 <= 0 || i2 + i4 > this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        this.f539d[iM319o] = true;
        this.f541f[iM319o].m462a(i2, sArr, 0, i4, transform);
        if ((this.f537b & i) != 0) {
            m313k(iM319o);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m330a(int i, int[] iArr, BoneDeformer boneDeformer, boolean z) {
        int i2 = 1;
        int i3 = this.f536a & i;
        int i4 = this.f536a ^ i3;
        for (int i5 = 0; i5 < 8; i5++) {
            if (iArr == null) {
                this.f542g[i5] = this.f538c[i5];
            } else if (iArr[i5] > 0) {
                this.f542g[i5] = iArr[i5];
            } else {
                this.f542g[i5] = this.f538c[i5];
            }
            this.f543p[i5] = null;
        }
        if (this.f549v != null) {
            if (this.f550w != null) {
                this.f550w.f1037e = true;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                if (i6 < this.f542g[i7]) {
                    i6 = this.f542g[i7];
                }
            }
            this.f550w = this.f549v.m69a(this, i6, this.f536a & (-13));
            if (this.f550w == null) {
                throw new OutOfMemoryError();
            }
        }
        int i8 = 0;
        while (i8 < 8) {
            if ((i2 & i3) != 0) {
                this.f543p[i8] = new C0065cj(this.f542g[i8], this.f530I[i8].f642b, this.f530I[i8]);
                this.f544q[i8] = m303a(this.f542g[i8], this.f530I[i8].f642b, this.f530I[i8], i8);
            }
            if ((i2 & i4) != 0) {
                this.f543p[i8] = this.f541f[i8];
                this.f544q[i8] = m303a(this.f542g[i8], this.f530I[i8].f641a, this.f530I[i8], i8);
            }
            i8++;
            i2 <<= 1;
        }
        this.f537b = i3;
        if (z) {
            m304a(i3, boneDeformer);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m331a(BoneDeformer boneDeformer) {
        if (m323s(this.f536a)) {
            return;
        }
        m304a(this.f537b, boneDeformer);
    }

    /* JADX INFO: renamed from: a */
    final void m332a(BoneDeformer boneDeformer, MorphDeformer morphDeformer, C0007af c0007af, C0059cd c0059cd, IndexBuffer indexBuffer) {
        C0065cj c0065cj = this.f541f[1];
        C0065cj c0065cj2 = this.f543p[2];
        C0065cj c0065cj3 = this.f543p[3];
        float[] fArrM471d = c0065cj2 == null ? null : c0065cj2.m471d();
        float[] fArrM471d2 = c0065cj3 == null ? null : c0065cj3.m471d();
        if (this.f532N == null) {
            this.f532N = new float[this.f542g[0] * 3];
        }
        if (boneDeformer != null && morphDeformer != null) {
            boneDeformer.m52a(this.f532N, morphDeformer, indexBuffer, c0059cd, c0065cj.m472e(), 1);
            if (fArrM471d != null) {
                boneDeformer.m52a(fArrM471d, morphDeformer, indexBuffer, c0059cd, c0065cj2.m472e(), 2);
                if (fArrM471d2 != null) {
                    boneDeformer.m52a(fArrM471d2, morphDeformer, indexBuffer, c0059cd, c0065cj3.m472e(), 3);
                    return;
                }
                return;
            }
            return;
        }
        if (boneDeformer == null) {
            if (morphDeformer != null) {
                morphDeformer.m198a(this.f532N, fArrM471d, fArrM471d2, indexBuffer, this, c0059cd);
                return;
            }
            return;
        }
        boneDeformer.m50a(this.f532N, indexBuffer, c0007af, c0065cj.m472e());
        if (fArrM471d != null) {
            boneDeformer.m50a(fArrM471d, indexBuffer, c0007af, c0065cj2.m472e());
            if (fArrM471d2 != null) {
                boneDeformer.m50a(fArrM471d2, indexBuffer, c0007af, c0065cj3.m472e());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m333a(BoneDeformer boneDeformer, MorphDeformer morphDeformer, C0059cd c0059cd, IndexBuffer indexBuffer, C0007af c0007af) {
        if (this.f531M == null) {
            this.f531M = new float[this.f542g[0] * 3];
        }
        if (boneDeformer != null && morphDeformer != null) {
            boneDeformer.m51a(this.f531M, morphDeformer, indexBuffer, this, c0007af, c0059cd);
        } else if (boneDeformer != null) {
            boneDeformer.m49a(this.f531M, indexBuffer, this, c0007af);
        } else if (morphDeformer != null) {
            morphDeformer.m197a(this.f531M, indexBuffer, this, c0059cd);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX INFO: renamed from: a */
    final void m334a(Graphics3D graphics3D, GraphicsOGL graphicsOGL) {
        boolean[] zArr = this.f539d;
        boolean[] zArr2 = this.f540e;
        int i = 1;
        int i2 = this.f550w != null ? this.f550w.f1033a : 0;
        for (int i3 = 0; i3 < 8; i3++) {
            if (((this.f537b & i) != 0 && zArr2[i3]) || ((this.f536a & i) != 0 && zArr[i3])) {
                switch (i) {
                    case 1:
                        this.f543p[i3].m464a((FloatBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        break;
                    case 2:
                        if ((this.f537b & 2) == 0) {
                            this.f543p[i3].m465a((ShortBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        } else {
                            this.f543p[i3].m464a((FloatBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        }
                        break;
                    case 16:
                        this.f543p[i3].m463a((ByteBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        break;
                    case 32:
                    case 64:
                        if (this.f530I[i3].f642b == 2) {
                            this.f543p[i3].m465a((ShortBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        } else {
                            this.f543p[i3].m464a((FloatBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        }
                        break;
                }
                if (this.f551x != null) {
                    this.f551x.m498a(graphicsOGL, graphics3D.f309h, this, i3);
                }
            }
            i <<= 1;
        }
        int i4 = 9;
        while (true) {
            int i5 = i4;
            if (i5 >= 13) {
                return;
            }
            if (this.f543p[i5] != null) {
                switch (i5) {
                    case 9:
                    case 10:
                        this.f543p[i5].m465a((ShortBuffer) this.f544q[i5], i2, this.f542g[0]);
                        break;
                    case 11:
                        this.f543p[i5].m463a((ByteBuffer) this.f544q[i5], i2, this.f542g[0]);
                        break;
                    case 12:
                        this.f543p[i5].m464a((FloatBuffer) this.f544q[i5], i2, this.f542g[0]);
                        break;
                }
                if (this.f553z != null) {
                    this.f553z.m498a(graphicsOGL, graphics3D.f309h, this, i5);
                }
            }
            i4 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m335a(Graphics3D graphics3D, GraphicsOGL graphicsOGL, BoneDeformer boneDeformer) {
        boolean[] zArr = this.f539d;
        boolean[] zArr2 = this.f540e;
        int i = 1;
        int i2 = this.f550w != null ? this.f550w.f1033a : 0;
        for (int i3 = 0; i3 < 8; i3++) {
            if (((this.f537b & i) != 0 && zArr2[i3]) || ((this.f536a & i) != 0 && zArr[i3])) {
                switch (i) {
                    case 1:
                        if (zArr[i3]) {
                            m305a(i3, boneDeformer.f142b);
                            this.f543p[i3].m464a((FloatBuffer) this.f544q[i3], i2, this.f542g[i3]);
                            this.f551x.m498a(graphicsOGL, graphics3D.f309h, this, i3);
                        }
                        break;
                    case 2:
                        if (zArr[i3]) {
                            m306b(i3, boneDeformer.f142b);
                            this.f543p[i3].m464a((FloatBuffer) this.f544q[i3], i2, this.f542g[i3]);
                            this.f551x.m498a(graphicsOGL, graphics3D.f309h, this, i3);
                        }
                        break;
                    case 16:
                        this.f543p[i3].m463a((ByteBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        this.f551x.m498a(graphicsOGL, graphics3D.f309h, this, i3);
                        break;
                    case 32:
                    case 64:
                        if (this.f530I[i3].f642b == 2) {
                            this.f543p[i3].m465a((ShortBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        } else {
                            this.f543p[i3].m464a((FloatBuffer) this.f544q[i3], i2, this.f542g[i3]);
                        }
                        this.f551x.m498a(graphicsOGL, graphics3D.f309h, this, i3);
                        break;
                }
            }
            i <<= 1;
        }
        int i4 = 9;
        while (true) {
            int i5 = i4;
            if (i5 >= 13) {
                return;
            }
            if (this.f543p[i5] != null) {
                switch (i5) {
                    case 9:
                    case 10:
                        this.f543p[i5].m465a((ShortBuffer) this.f544q[i5], 0, this.f542g[0]);
                        break;
                    case 11:
                        this.f543p[i5].m463a((ByteBuffer) this.f544q[i5], 0, this.f542g[0]);
                        break;
                    case 12:
                        this.f543p[i5].m464a((FloatBuffer) this.f544q[i5], 0, this.f542g[0]);
                        break;
                }
                if (this.f553z != null) {
                    this.f553z.m498a(graphicsOGL, graphics3D.f309h, this, i5);
                }
            }
            i4 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m336a(IndexBuffer indexBuffer, C0076cu c0076cu) {
        int i;
        boolean z = this.f538c[7] > 0;
        float f = c0076cu.f824a[0];
        float f2 = c0076cu.f824a[1];
        float f3 = c0076cu.f824a[2];
        float f4 = c0076cu.f824a[3];
        if (this.f538c[4] <= 0) {
            indexBuffer.f321H = c0076cu.f825b;
            return;
        }
        if (z) {
            if (!m309h(this.f537b)) {
                m327a();
            }
            this.f539d[4] = false;
            i = 6;
        } else {
            if (!m308g(this.f537b)) {
                int[] iArr = new int[8];
                m330a(m325a(16, iArr), iArr, (BoneDeformer) null, true);
            }
            i = 1;
        }
        if (indexBuffer.f348u == null) {
            indexBuffer.m168b();
        }
        short[] sArr = indexBuffer.f348u;
        int length = sArr.length;
        byte[] bArrM473f = this.f541f[4].m473f();
        byte[] bArrM473f2 = this.f543p[4].m473f();
        for (int i2 = 0; i2 < length; i2 += i) {
            int i3 = sArr[i2] << 2;
            float f5 = (bArrM473f[i3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) * 0.0039215f;
            float f6 = (bArrM473f[i3 + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) * 0.0039215f;
            float f7 = (bArrM473f[i3 + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) * 0.0039215f;
            float f8 = (bArrM473f[i3 + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) * 0.0039215f;
            int i4 = (int) (f5 * f4 * 255.0f);
            int i5 = i4 > 255 ? 255 : i4;
            int i6 = (int) (f6 * f3 * 255.0f);
            int i7 = i6 > 255 ? 255 : i6;
            int i8 = (int) (f7 * f2 * 255.0f);
            int i9 = i8 > 255 ? 255 : i8;
            int i10 = (int) (f8 * f * 255.0f);
            if (i10 > 255) {
                i10 = 255;
            }
            int i11 = i3 + 1;
            bArrM473f2[i3] = (byte) i5;
            int i12 = i11 + 1;
            bArrM473f2[i11] = (byte) i7;
            int i13 = i12 + 1;
            bArrM473f2[i12] = (byte) i9;
            int i14 = i13 + 1;
            bArrM473f2[i13] = (byte) i10;
            if (z) {
                for (int i15 = 0; i15 < 5; i15++) {
                    int i16 = i14 + 1;
                    bArrM473f2[i14] = (byte) i5;
                    int i17 = i16 + 1;
                    bArrM473f2[i16] = (byte) i7;
                    int i18 = i17 + 1;
                    bArrM473f2[i17] = (byte) i9;
                    i14 = i18 + 1;
                    bArrM473f2[i18] = (byte) i10;
                }
            }
        }
        this.f540e[4] = true;
        indexBuffer.f321H = c0076cu.f825b;
    }

    /* JADX INFO: renamed from: b */
    final C0065cj m337b(int i) {
        return this.f541f[i];
    }

    /* JADX INFO: renamed from: b */
    final void m338b() {
        for (int i = 0; i < 8; i++) {
            this.f539d[i] = false;
            this.f540e[i] = false;
        }
    }

    /* JADX INFO: renamed from: c */
    final C0065cj m339c(int i) {
        return this.f543p[i];
    }

    /* JADX INFO: renamed from: c */
    final void m340c() {
        if (this.f525D == 127) {
            this.f525D = (byte) -128;
        } else {
            this.f525D = (byte) (this.f525D + 1);
        }
    }

    /* JADX INFO: renamed from: d */
    final Transform m341d(int i) {
        return this.f533O[i];
    }

    /* JADX INFO: renamed from: d */
    final void m342d() {
        int i;
        float[] fArrM471d = this.f541f[7].m471d();
        float[] fArrM471d2 = this.f543p[5].m471d();
        int i2 = 3;
        int i3 = this.f538c[0];
        boolean z = (this.f536a & SPRITE_PER_OBJ) != 0;
        int i4 = 0;
        int i5 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i5 < i3) {
            if (!z || i5 == 0) {
                int i6 = i2 + 1;
                f4 = fArrM471d[i2];
                int i7 = i6 + 1;
                f2 = fArrM471d[i6];
                int i8 = i7 + 1;
                f3 = fArrM471d[i7];
                float f5 = fArrM471d[i8];
                i = i8 + 1 + 3;
                f = f5;
            } else {
                i = i2;
            }
            int i9 = i4 + 1;
            fArrM471d2[i4] = f4;
            int i10 = i9 + 1;
            fArrM471d2[i9] = f2;
            int i11 = i10 + 1;
            fArrM471d2[i10] = f4;
            int i12 = i11 + 1;
            fArrM471d2[i11] = f;
            int i13 = i12 + 1;
            fArrM471d2[i12] = f3;
            int i14 = i13 + 1;
            fArrM471d2[i13] = f2;
            int i15 = i14 + 1;
            fArrM471d2[i14] = f3;
            int i16 = i15 + 1;
            fArrM471d2[i15] = f2;
            int i17 = i16 + 1;
            fArrM471d2[i16] = f4;
            int i18 = i17 + 1;
            fArrM471d2[i17] = f;
            int i19 = i18 + 1;
            fArrM471d2[i18] = f3;
            i4 = i19 + 1;
            fArrM471d2[i19] = f;
            i5++;
            i2 = i;
        }
        this.f540e[5] = true;
    }

    /* JADX INFO: renamed from: d */
    final void m343d(Transform transform) {
        boolean z;
        float fSin;
        int i;
        float f;
        float[] fArrM471d = this.f541f[0].m471d();
        float[] fArrM471d2 = this.f543p[0].m471d();
        float[] fArrM471d3 = this.f541f[7].m471d();
        float[] fArr = transform.f494b.m;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        int i2 = 0;
        int i3 = this.f538c[0];
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = (this.f536a & SPRITE_PER_OBJ) != 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i6 < i3) {
            int i7 = i5 + 1;
            float f9 = fArrM471d[i5];
            int i8 = i7 + 1;
            float f10 = fArrM471d[i7];
            i5 = i8 + 1;
            float f11 = fArrM471d[i8];
            float f12 = (fArr[0] * f9) + (fArr[4] * f10) + (fArr[8] * f11) + fArr[12];
            float f13 = (fArr[1] * f9) + (fArr[5] * f10) + (fArr[9] * f11) + fArr[13];
            float f14 = (f10 * fArr[6]) + (f9 * fArr[2]) + (fArr[10] * f11) + fArr[14];
            if (!z4 || z2) {
                int i9 = i2 + 1;
                f2 = fArrM471d3[i2] * 0.5f;
                int i10 = i9 + 1;
                f3 = fArrM471d3[i9] * 0.5f;
                z = false;
                i2 = i10 + 5;
                f4 = fArrM471d3[i10];
            } else {
                z = z2;
            }
            float f15 = -f2;
            float f16 = -f3;
            if (f4 < -6.1035156E-5f || f4 > 6.1035156E-5f) {
                if (!z4 || z3) {
                    float fCos = Util3D.cos(f4);
                    fSin = Util3D.sin(f4);
                    f6 = -fSin;
                    z3 = false;
                    f8 = fCos;
                    f5 = fCos;
                } else {
                    fSin = f7;
                }
                float f17 = (f5 * f15) + (f6 * f3) + f12;
                float f18 = (fSin * f15) + (f8 * f3) + f13;
                float f19 = (f5 * f15) + (f6 * f16) + f12;
                float f20 = (f15 * fSin) + (f8 * f16) + f13;
                float f21 = (f5 * f2) + (f6 * f3) + f12;
                float f22 = (fSin * f2) + (f8 * f3) + f13;
                float f23 = f12 + (f5 * f2) + (f6 * f16);
                float f24 = (f16 * f8) + (fSin * f2) + f13;
                int i11 = i4 + 1;
                fArrM471d2[i4] = f17;
                int i12 = i11 + 1;
                fArrM471d2[i11] = f18;
                int i13 = i12 + 1;
                fArrM471d2[i12] = f14;
                int i14 = i13 + 1;
                fArrM471d2[i13] = f19;
                int i15 = i14 + 1;
                fArrM471d2[i14] = f20;
                int i16 = i15 + 1;
                fArrM471d2[i15] = f14;
                int i17 = i16 + 1;
                fArrM471d2[i16] = f21;
                int i18 = i17 + 1;
                fArrM471d2[i17] = f22;
                int i19 = i18 + 1;
                fArrM471d2[i18] = f14;
                int i20 = i19 + 1;
                fArrM471d2[i19] = f21;
                int i21 = i20 + 1;
                fArrM471d2[i20] = f22;
                int i22 = i21 + 1;
                fArrM471d2[i21] = f14;
                int i23 = i22 + 1;
                fArrM471d2[i22] = f19;
                int i24 = i23 + 1;
                fArrM471d2[i23] = f20;
                int i25 = i24 + 1;
                fArrM471d2[i24] = f14;
                int i26 = i25 + 1;
                fArrM471d2[i25] = f23;
                int i27 = i26 + 1;
                fArrM471d2[i26] = f24;
                fArrM471d2[i27] = f14;
                i = i27 + 1;
                f = fSin;
            } else {
                float f25 = f15 + f12;
                float f26 = f2 + f12;
                float f27 = f3 + f13;
                float f28 = f16 + f13;
                int i28 = i4 + 1;
                fArrM471d2[i4] = f25;
                int i29 = i28 + 1;
                fArrM471d2[i28] = f27;
                int i30 = i29 + 1;
                fArrM471d2[i29] = f14;
                int i31 = i30 + 1;
                fArrM471d2[i30] = f25;
                int i32 = i31 + 1;
                fArrM471d2[i31] = f28;
                int i33 = i32 + 1;
                fArrM471d2[i32] = f14;
                int i34 = i33 + 1;
                fArrM471d2[i33] = f26;
                int i35 = i34 + 1;
                fArrM471d2[i34] = f27;
                int i36 = i35 + 1;
                fArrM471d2[i35] = f14;
                int i37 = i36 + 1;
                fArrM471d2[i36] = f26;
                int i38 = i37 + 1;
                fArrM471d2[i37] = f27;
                int i39 = i38 + 1;
                fArrM471d2[i38] = f14;
                int i40 = i39 + 1;
                fArrM471d2[i39] = f25;
                int i41 = i40 + 1;
                fArrM471d2[i40] = f28;
                int i42 = i41 + 1;
                fArrM471d2[i41] = f14;
                int i43 = i42 + 1;
                fArrM471d2[i42] = f26;
                int i44 = i43 + 1;
                fArrM471d2[i43] = f28;
                fArrM471d2[i44] = f14;
                i = i44 + 1;
                f = f7;
            }
            i6++;
            z2 = z;
            i4 = i;
            f7 = f;
        }
        this.f540e[0] = true;
        m340c();
    }

    /* JADX INFO: renamed from: e */
    final C0076cu m344e(int i) {
        int size = this.f534P.size();
        if (i < size) {
            this.f522A = this.f535Q[i];
            if (this.f528G || this.f522A.f825b == 0) {
            }
            return this.f522A;
        }
        while (size <= i) {
            this.f534P.addElement(new C0076cu());
            size++;
        }
        m314l();
        this.f522A = this.f535Q[i];
        this.f522A.m477a(this);
        return this.f522A;
    }

    public final int getMaxVerticesNum() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 >= 8) {
                return i2;
            }
            if (i2 < this.f538c[i3]) {
                i2 = this.f538c[i3];
            }
            i = i3 + 1;
        }
    }

    public final int getParams() {
        return this.f536a;
    }

    public final void getTexCoordScale(int i, float[] fArr) {
        switch (i) {
            case 32:
                for (int i2 = 0; i2 < 4; i2++) {
                    fArr[i2] = this.f547t[0][i2];
                }
                return;
            case 64:
                break;
            default:
                throw new IllegalArgumentException();
        }
        for (int i3 = 0; i3 < 4; i3++) {
            fArr[i3] = this.f547t[1][i3];
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void getVertices(int i, int i2, byte[] bArr, int i3, int i4) throws IllegalStateException {
        if (bArr == null) {
            throw new NullPointerException();
        }
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        if (this.f530I[iM319o].f641a != 3) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 <= 0 || i2 + i4 > this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (iM319o != 2 && iM319o != 3 && this.f544q[iM319o] == null) {
            throw new IllegalStateException();
        }
        this.f541f[iM319o].m467b(i2, bArr, i3, i4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void getVertices(int i, int i2, float[] fArr, int i3, int i4) throws IllegalStateException {
        if (fArr == null) {
            throw new NullPointerException();
        }
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        if (this.f530I[iM319o].f641a != 0) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 <= 0 || i2 + i4 > this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (iM319o != 2 && iM319o != 3 && this.f544q[iM319o] == null) {
            throw new IllegalStateException();
        }
        this.f541f[iM319o].m468b(i2, fArr, i3, i4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void getVertices(int i, int i2, short[] sArr, int i3, int i4) throws IllegalStateException {
        if (sArr == null) {
            throw new NullPointerException();
        }
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        if (this.f530I[iM319o].f641a != 2) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 <= 0 || i2 + i4 > this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (iM319o != 2 && iM319o != 3 && this.f544q[iM319o] == null) {
            throw new IllegalStateException();
        }
        this.f541f[iM319o].m469b(i2, sArr, i3, i4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final Object getVerticesArray(int i) throws IllegalStateException {
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        return this.f541f[iM319o].m474g();
    }

    public final int getVerticesNum(int i) {
        int iM319o = m319o(i);
        if (m324t(i)) {
            return this.f538c[iM319o];
        }
        throw new IllegalArgumentException();
    }

    public final int getVerticesType(int i) {
        int iM319o = m319o(i);
        if (m324t(i)) {
            return this.f541f[iM319o].m458a().f641a;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: h */
    final void m345h() {
        byte[] bArrM473f = this.f541f[4].m473f();
        byte[] bArrM473f2 = this.f543p[4].m473f();
        int i = this.f538c[0];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            int i5 = i3 + 1;
            byte b = bArrM473f[i3];
            int i6 = i5 + 1;
            byte b2 = bArrM473f[i5];
            int i7 = i6 + 1;
            byte b3 = bArrM473f[i6];
            int i8 = i7 + 1;
            byte b4 = bArrM473f[i7];
            int i9 = i2 + 1;
            bArrM473f2[i2] = b;
            int i10 = i9 + 1;
            bArrM473f2[i9] = b2;
            int i11 = i10 + 1;
            bArrM473f2[i10] = b3;
            int i12 = i11 + 1;
            bArrM473f2[i11] = b4;
            int i13 = i12 + 1;
            bArrM473f2[i12] = b;
            int i14 = i13 + 1;
            bArrM473f2[i13] = b2;
            int i15 = i14 + 1;
            bArrM473f2[i14] = b3;
            int i16 = i15 + 1;
            bArrM473f2[i15] = b4;
            int i17 = i16 + 1;
            bArrM473f2[i16] = b;
            int i18 = i17 + 1;
            bArrM473f2[i17] = b2;
            int i19 = i18 + 1;
            bArrM473f2[i18] = b3;
            int i20 = i19 + 1;
            bArrM473f2[i19] = b4;
            int i21 = i20 + 1;
            bArrM473f2[i20] = b;
            int i22 = i21 + 1;
            bArrM473f2[i21] = b2;
            int i23 = i22 + 1;
            bArrM473f2[i22] = b3;
            int i24 = i23 + 1;
            bArrM473f2[i23] = b4;
            int i25 = i24 + 1;
            bArrM473f2[i24] = b;
            int i26 = i25 + 1;
            bArrM473f2[i25] = b2;
            int i27 = i26 + 1;
            bArrM473f2[i26] = b3;
            int i28 = i27 + 1;
            bArrM473f2[i27] = b4;
            int i29 = i28 + 1;
            bArrM473f2[i28] = b;
            int i30 = i29 + 1;
            bArrM473f2[i29] = b2;
            int i31 = i30 + 1;
            bArrM473f2[i30] = b3;
            i2 = i31 + 1;
            bArrM473f2[i31] = b4;
            i4++;
            i3 = i8;
        }
        this.f540e[4] = true;
    }

    /* JADX INFO: renamed from: i */
    final float[] m346i() {
        return this.f531M;
    }

    /* JADX INFO: renamed from: j */
    final float[] m347j() {
        return this.f532N;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void multiVertexColors(float f, float f2, float f3, float f4) throws IllegalStateException {
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f538c[4] <= 0) {
            throw new IllegalStateException();
        }
        m328a(f, f2, f3, f4);
    }

    public final boolean pick(IndexBuffer indexBuffer, Vector3D vector3D, Vector3D vector3D2, IntersectionAttributes intersectionAttributes, int i, boolean z, Transform transform) {
        if (indexBuffer == null || vector3D == null || vector3D2 == null) {
            throw new NullPointerException("");
        }
        if (vector3D2.f516a == 0.0f && vector3D2.f517b == 0.0f && vector3D2.f518c == 0.0f) {
            throw new IllegalArgumentException("direction has 0 length");
        }
        if (!indexBuffer.m167a(this)) {
            throw new IllegalArgumentException("mismatch between VertexBuffer and IndexBuffer");
        }
        Vector3D vector3D3 = new Vector3D();
        Vector3D vector3D4 = new Vector3D();
        transform.m262a(vector3D, vector3D3);
        transform.m268b(vector3D2, vector3D4);
        if (intersectionAttributes != null) {
            intersectionAttributes.m172a();
        }
        return new Pick().m242a(this, indexBuffer, vector3D3, vector3D4, intersectionAttributes, i, z, transform);
    }

    public final void purgeBuffer() {
        for (int i = 0; i < 8; i++) {
            this.f544q[i] = null;
        }
        if (this.f549v != null) {
            this.f550w.f1037e = true;
            this.f549v = null;
            this.f550w = null;
        }
        if (this.f552y != null) {
            for (int i2 = 0; i2 < this.f552y.length; i2++) {
                if (this.f552y[i2] != null) {
                    this.f552y[i2].m476b();
                }
            }
            this.f552y = null;
        }
    }

    public final void setTexCoordScale(int i, float f, float[] fArr) {
        switch (i) {
            case 32:
                f519J.setTranslate(fArr[0], fArr[1], fArr[2]);
                f520K.setScale(f, f, f);
                this.f533O[0].m261a(f519J, f520K);
                this.f547t[0][0] = f;
                this.f547t[0][1] = fArr[0];
                this.f547t[0][2] = fArr[1];
                this.f547t[0][3] = fArr[2];
                return;
            case 64:
                f519J.setTranslate(fArr[0], fArr[1], fArr[2]);
                f520K.setScale(f, f, f);
                this.f533O[1].m261a(f519J, f520K);
                this.f547t[1][0] = f;
                this.f547t[1][1] = fArr[0];
                this.f547t[1][2] = fArr[1];
                this.f547t[1][3] = fArr[2];
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void setVertices(int i, int i2, byte[] bArr, int i3, int i4) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        if (this.f530I[iM319o].f641a != 3) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 <= 0 || i2 + i4 > this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (iM319o != 2 && iM319o != 3 && this.f544q[iM319o] == null) {
            throw new IllegalStateException();
        }
        this.f539d[iM319o] = true;
        this.f541f[iM319o].m459a(i2, bArr, i3, i4);
        if ((this.f537b & i) != 0) {
            m318n(iM319o);
        }
    }

    public final void setVertices(int i, int i2, float[] fArr, int i3, int i4) {
        if (fArr == null) {
            throw new NullPointerException();
        }
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        if (this.f530I[iM319o].f641a != 0) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 <= 0 || i2 + i4 > this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f544q[iM319o] == null) {
            throw new IllegalStateException();
        }
        this.f539d[iM319o] = true;
        if (iM319o == 0) {
            m340c();
        }
        this.f541f[iM319o].m460a(i2, fArr, i3, i4);
        if ((this.f537b & i) != 0) {
            m313k(iM319o);
        }
    }

    public final void setVertices(int i, int i2, short[] sArr, int i3, int i4) {
        if (sArr == null) {
            throw new NullPointerException();
        }
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        if (this.f530I[iM319o].f641a != 2) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (i4 <= 0 || i2 + i4 > this.f538c[iM319o]) {
            throw new IndexOutOfBoundsException();
        }
        if (iM319o != 2 && iM319o != 3 && this.f544q[iM319o] == null) {
            throw new IllegalStateException();
        }
        this.f539d[iM319o] = true;
        this.f541f[iM319o].m461a(i2, sArr, i3, i4);
        if ((this.f537b & i) != 0) {
            switch (iM319o) {
                case 1:
                case 2:
                case 3:
                    m317m(iM319o);
                    return;
                default:
                    m315l(iM319o);
                    return;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void updateVertices(int i) throws IllegalStateException {
        int iM319o = m319o(i);
        if ((this.f536a & i) == 0) {
            throw new IllegalStateException();
        }
        this.f539d[iM319o] = true;
        if (iM319o == 0) {
            m340c();
        }
        switch (this.f530I[iM319o].f641a) {
            case 0:
                this.f541f[iM319o].m460a(0, this.f541f[iM319o].m471d(), 0, this.f538c[iM319o]);
                break;
            case 2:
                this.f541f[iM319o].m461a(0, this.f541f[iM319o].m472e(), 0, this.f538c[iM319o]);
                break;
            case 3:
                this.f541f[iM319o].m459a(0, this.f541f[iM319o].m473f(), 0, this.f538c[iM319o]);
                break;
        }
        if ((this.f537b & i) != 0) {
            switch (this.f530I[iM319o].f641a) {
                case 0:
                    m313k(iM319o);
                    return;
                case 1:
                default:
                    return;
                case 2:
                    switch (iM319o) {
                        case 1:
                        case 2:
                        case 3:
                            m317m(iM319o);
                            return;
                        default:
                            m315l(iM319o);
                            return;
                    }
                case 3:
                    m318n(iM319o);
                    return;
            }
        }
    }
}
