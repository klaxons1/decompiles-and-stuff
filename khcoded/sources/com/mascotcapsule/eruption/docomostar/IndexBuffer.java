package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.ogl.DirectBufferFactory;
import com.docomostar.ui.ogl.GraphicsOGL;
import com.docomostar.ui.ogl.ShortBuffer;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class IndexBuffer extends Object3D {
    public static final int LINES = 2;
    public static final int LINE_STRIP = 3;

    /* JADX INFO: renamed from: M */
    private static final C0092dj[] f312M;

    /* JADX INFO: renamed from: N */
    private static float[][] f313N = new float[4][];
    public static final int POINTS = 1;
    public static final int SPRITES = 7;
    public static final int TRIANGLES = 4;
    public static final int TRIANGLE_FAN = 6;
    public static final int TRIANGLE_STRIP = 5;

    /* JADX INFO: renamed from: A */
    ShortBuffer[] f314A;

    /* JADX INFO: renamed from: B */
    BufferPool f315B;

    /* JADX INFO: renamed from: C */
    C0122u[] f316C;

    /* JADX INFO: renamed from: D */
    C0104dv f317D;

    /* JADX INFO: renamed from: E */
    C0069cn[] f318E;

    /* JADX INFO: renamed from: F */
    byte f319F;

    /* JADX INFO: renamed from: G */
    byte f320G;

    /* JADX INFO: renamed from: H */
    byte f321H;

    /* JADX INFO: renamed from: I */
    byte f322I;

    /* JADX INFO: renamed from: J */
    byte f323J;

    /* JADX INFO: renamed from: K */
    byte f324K;

    /* JADX INFO: renamed from: L */
    VertexBuffer f325L;

    /* JADX INFO: renamed from: O */
    private boolean f326O;

    /* JADX INFO: renamed from: P */
    private int f327P;

    /* JADX INFO: renamed from: Q */
    private int f328Q;

    /* JADX INFO: renamed from: R */
    private int f329R;

    /* JADX INFO: renamed from: S */
    private int[] f330S;

    /* JADX INFO: renamed from: T */
    private short[] f331T;

    /* JADX INFO: renamed from: U */
    private int[] f332U;

    /* JADX INFO: renamed from: V */
    private int f333V;

    /* JADX INFO: renamed from: W */
    private Vector3D f334W;

    /* JADX INFO: renamed from: X */
    private byte f335X;

    /* JADX INFO: renamed from: a */
    int f336a;

    /* JADX INFO: renamed from: b */
    boolean f337b;

    /* JADX INFO: renamed from: c */
    int f338c;

    /* JADX INFO: renamed from: d */
    int f339d;

    /* JADX INFO: renamed from: e */
    int f340e;

    /* JADX INFO: renamed from: f */
    int f341f;

    /* JADX INFO: renamed from: g */
    int f342g;

    /* JADX INFO: renamed from: p */
    int f343p;

    /* JADX INFO: renamed from: q */
    int[] f344q;

    /* JADX INFO: renamed from: r */
    short[] f345r;

    /* JADX INFO: renamed from: s */
    short[] f346s;

    /* JADX INFO: renamed from: t */
    short[] f347t;

    /* JADX INFO: renamed from: u */
    short[] f348u;

    /* JADX INFO: renamed from: v */
    GeometricShape f349v;

    /* JADX INFO: renamed from: w */
    GeometricShape f350w;

    /* JADX INFO: renamed from: x */
    int f351x;

    /* JADX INFO: renamed from: y */
    Appearance f352y;

    /* JADX INFO: renamed from: z */
    Vector3D f353z;

    static {
        C0092dj[] c0092djArr = new C0092dj[10];
        f312M = c0092djArr;
        c0092djArr[0] = new C0092dj(20, 1);
        f312M[1] = new C0092dj(40, 2);
        f312M[2] = new C0092dj(80, 4);
        f312M[3] = new C0092dj(160, 8);
        f312M[4] = new C0092dj(320, 16);
        f312M[5] = new C0092dj(640, 32);
        f312M[6] = new C0092dj(1280, 64);
        f312M[7] = new C0092dj(2560, 128);
        f312M[8] = new C0092dj(5120, Appearance.LIGHTTWOSIDE);
        f312M[9] = new C0092dj(Integer.MAX_VALUE, Appearance.DRAWSILHOUETTE);
    }

    public IndexBuffer(BufferPool bufferPool, int i) {
        super(4);
        m155h();
        if (bufferPool != null && bufferPool.getType() != 2) {
            throw new IllegalArgumentException();
        }
        if (i <= 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        this.f315B = bufferPool;
        this.f344q = new int[i];
        this.f327P = i;
        this.f328Q = 0;
    }

    public IndexBuffer(BufferPool bufferPool, int i, int i2) {
        super(4);
        m155h();
        if (bufferPool != null && bufferPool.getType() != 2) {
            throw new IllegalArgumentException();
        }
        if (i <= 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        if (i2 <= 0 || i2 > 32767) {
            throw new IllegalArgumentException();
        }
        this.f315B = bufferPool;
        this.f344q = new int[i];
        this.f330S = this.f344q;
        this.f345r = new short[i2];
        this.f346s = this.f345r;
        this.f327P = i;
        this.f328Q = i2;
    }

    IndexBuffer(BufferPool bufferPool, int i, int[] iArr, short[] sArr, int i2) {
        super(4);
        m155h();
        if (bufferPool != null && bufferPool.getType() != 2) {
            throw new IllegalArgumentException();
        }
        this.f315B = bufferPool;
        m152a(4, 0, iArr, iArr.length, sArr, sArr.length, true);
        this.f344q = iArr;
        this.f330S = iArr;
        this.f327P = iArr.length;
        this.f345r = sArr;
        this.f346s = sArr;
        this.f328Q = sArr.length;
        this.f336a = 4;
        this.f340e = iArr.length;
        this.f341f = sArr.length;
        this.f342g = 0;
        m157j();
        m158k();
        m156i();
    }

    /* JADX INFO: renamed from: a */
    private final void m152a(int i, int i2, int[] iArr, int i3, short[] sArr, int i4, boolean z) {
        int i5;
        int i6 = 0;
        if (iArr == null) {
            throw new NullPointerException();
        }
        if (z && sArr == null) {
            throw new NullPointerException();
        }
        switch (i) {
            case 1:
                i5 = 1;
                break;
            case 2:
            case 3:
                i5 = 2;
                break;
            case 4:
            case 5:
            case 6:
                i5 = 3;
                break;
            case 7:
                i5 = 1;
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (i3 <= 0 || i3 > 32767) {
            throw new IllegalArgumentException();
        }
        if (!z) {
            if (i2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            this.f338c = i2;
            while (i6 < i3) {
                if (iArr[i6] < i5) {
                    throw new IllegalArgumentException();
                }
                this.f338c += iArr[i6];
                if (this.f338c > 32767) {
                    throw new IllegalArgumentException();
                }
                i6++;
            }
            if (this.f338c > i2) {
                this.f338c--;
                return;
            }
            return;
        }
        if (i4 <= 0 || i4 > 32767) {
            throw new IllegalArgumentException();
        }
        for (int i7 = 0; i7 < i3; i7++) {
            if (iArr[i7] < i5 || iArr[i7] > 32767) {
                throw new IllegalArgumentException();
            }
        }
        while (i6 < i4) {
            if (sArr[i6] < 0 || sArr[i6] > Short.MAX_VALUE) {
                throw new IllegalArgumentException();
            }
            if (this.f338c < sArr[i6]) {
                this.f338c = sArr[i6];
            }
            i6++;
        }
        if (this.f338c > 32767) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m153a(VertexBuffer vertexBuffer, int i, Vector3D vector3D, Vector3D vector3D2) {
        int i2 = this.f341f;
        short[] sArr = this.f346s;
        float[] fArrM471d = vertexBuffer.m339c(0).m471d();
        float f = fArrM471d[0];
        float f2 = fArrM471d[0];
        float f3 = fArrM471d[1];
        float f4 = fArrM471d[1];
        float f5 = fArrM471d[2];
        float f6 = fArrM471d[2];
        int i3 = 1;
        while (i3 < i2) {
            int i4 = sArr[i3] * 3;
            float f7 = fArrM471d[i4];
            if (f > f7) {
                f = f7;
            }
            if (f2 >= f7) {
                f7 = f2;
            }
            float f8 = fArrM471d[i4 + 1];
            if (f3 > f8) {
                f3 = f8;
            }
            if (f4 < f8) {
                f4 = f8;
            }
            float f9 = fArrM471d[i4 + 2];
            if (f5 > f9) {
                f5 = f9;
            }
            if (f6 < f9) {
                f6 = f9;
            }
            i3 += i;
            f2 = f7;
        }
        vector3D.set((f + f2) * 0.5f, (f3 + f4) * 0.5f, (f5 + f6) * 0.5f);
        if (vector3D2 != null) {
            vector3D2.set(f2, f4, f6);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m154b(VertexBuffer vertexBuffer, int i, Vector3D vector3D, Vector3D vector3D2) {
        int i2 = this.f338c * 3;
        int i3 = this.f339d * 3;
        int i4 = (i - 1) * 3;
        float[] fArrM471d = vertexBuffer.m339c(0).m471d();
        float f = fArrM471d[i3];
        float f2 = fArrM471d[i3];
        float f3 = fArrM471d[i3 + 1];
        float f4 = fArrM471d[i3 + 1];
        float f5 = fArrM471d[i3 + 2];
        float f6 = fArrM471d[i3 + 2];
        int i5 = (this.f339d + 1) * 3;
        while (i5 < i2) {
            int i6 = i5 + 1;
            float f7 = fArrM471d[i5];
            if (f > f7) {
                f = f7;
            }
            if (f2 >= f7) {
                f7 = f2;
            }
            int i7 = i6 + 1;
            float f8 = fArrM471d[i6];
            if (f3 > f8) {
                f3 = f8;
            }
            if (f4 < f8) {
                f4 = f8;
            }
            int i8 = i7 + 1;
            float f9 = fArrM471d[i7];
            if (f5 > f9) {
                f5 = f9;
            }
            if (f6 < f9) {
                f6 = f9;
            }
            i5 = i8 + i4;
            f2 = f7;
        }
        vector3D.set((f + f2) * 0.5f, (f3 + f4) * 0.5f, (f5 + f6) * 0.5f);
        if (vector3D2 != null) {
            vector3D2.set(f2, f4, f6);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m155h() {
        this.f336a = 0;
        this.f338c = 0;
        this.f339d = 0;
        this.f340e = 0;
        this.f341f = 0;
        this.f342g = 0;
        this.f344q = null;
        this.f330S = null;
        this.f345r = null;
        this.f346s = null;
        this.f332U = null;
        this.f351x = 0;
        this.f352y = null;
        this.f333V = 1;
        this.f353z = new Vector3D();
        this.f334W = new Vector3D();
        this.f314A = null;
        this.f348u = null;
        this.f325L = null;
        this.f349v = null;
        this.f350w = new GeometricShape();
        this.f350w.f257a = 5;
    }

    /* JADX INFO: renamed from: i */
    private void m156i() {
        DirectBufferFactory factory = null;
        if (this.f346s == null) {
            return;
        }
        if (this.f315B != null) {
            if (this.f316C != null) {
                for (int i = 0; i < this.f316C.length; i++) {
                    this.f316C[i].f1037e = true;
                }
            }
            this.f316C = new C0122u[this.f340e];
        } else {
            factory = DirectBufferFactory.getFactory();
        }
        this.f314A = new ShortBuffer[this.f340e];
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.f340e) {
            int i4 = this.f344q[i3];
            if (this.f315B != null) {
                this.f316C[i3] = this.f315B.m69a(this, i4, 0);
                if (this.f316C[i3] == null) {
                    throw new OutOfMemoryError();
                }
                this.f314A[i3] = (ShortBuffer) this.f315B.f156a[0];
                this.f314A[i3].put(this.f316C[i3].f1033a, this.f346s, i2, i4);
            } else {
                this.f314A[i3] = factory.allocateShortBuffer(i4);
                this.f314A[i3].put(0, this.f346s, i2, i4);
            }
            i3++;
            i2 += i4;
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m157j() {
        int i;
        int i2 = this.f340e;
        switch (this.f336a) {
            case 1:
                i = 0;
                for (int i3 = 0; i3 < i2; i3++) {
                    i += this.f344q[i3];
                }
                break;
            case 2:
                i = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    i += this.f344q[i4] / 2;
                }
                break;
            case 3:
                i = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    i += this.f344q[i5] - 1;
                }
                break;
            case 4:
                i = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    i += this.f344q[i6] / 3;
                }
                break;
            case 5:
            case 6:
                if (this.f342g > 0) {
                    int i7 = i2 - 1;
                    int i8 = 0;
                    int i9 = 0;
                    while (i9 < i7) {
                        int i10 = (this.f344q[i9] - 2) + i8;
                        i9++;
                        i8 = i10;
                    }
                    i = i8 + (this.f342g / 3);
                } else {
                    i = 0;
                    for (int i11 = 0; i11 < i2; i11++) {
                        i += this.f344q[i11] - 2;
                    }
                }
                break;
            case 7:
                int i12 = 0;
                int i13 = 0;
                while (i13 < i2) {
                    int i14 = this.f344q[i13] + i12;
                    i13++;
                    i12 = i14;
                }
                i = i12 / 6;
                break;
            default:
                i = 0;
                break;
        }
        this.f351x = i;
    }

    /* JADX INFO: renamed from: k */
    private final void m158k() {
        int i = 0;
        if (this.f345r != null) {
            while (i < f312M.length) {
                if (this.f341f < f312M[i].f876a) {
                    this.f333V = f312M[i].f877b;
                    return;
                }
                i++;
            }
            return;
        }
        while (i < f312M.length) {
            if (this.f338c < f312M[i].f876a) {
                this.f333V = f312M[i].f877b;
                return;
            }
            i++;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Object3D
    /* JADX INFO: renamed from: a */
    final int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        int iMo0a = super.mo0a(i, i2, object3DArr, i3);
        if ((object3DArr == null || object3DArr.length > iMo0a) && this.f352y != null) {
            iMo0a = this.f352y.mo0a(i, i2, object3DArr, iMo0a);
            if (object3DArr == null || object3DArr.length <= iMo0a) {
            }
        }
        return iMo0a;
    }

    /* JADX INFO: renamed from: a */
    final void m159a() {
        this.f346s = new short[this.f341f];
        this.f330S = new int[this.f340e];
        for (int i = 0; i < this.f341f; i++) {
            this.f346s[i] = this.f345r[i];
        }
        for (int i2 = 0; i2 < this.f340e; i2++) {
            this.f330S[i2] = this.f344q[i2];
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    final void m160a(int i, int[] iArr, short[] sArr, boolean z) throws IllegalStateException {
        int length = iArr.length;
        int length2 = sArr.length;
        m152a(i, 0, iArr, length, sArr, length2, true);
        if (this.f327P < length) {
            throw new IllegalArgumentException();
        }
        if (this.f328Q < (i != 7 ? length2 : length2 * 6)) {
            throw new IllegalArgumentException();
        }
        if (this.f337b) {
            throw new IllegalStateException();
        }
        this.f336a = i;
        this.f340e = length;
        if (i == 7) {
            this.f338c *= 6;
            for (int i2 = 0; i2 < length; i2++) {
                this.f344q[i2] = iArr[i2] * 6;
            }
            this.f341f = length2 * 6;
            for (int i3 = 0; i3 < length2; i3++) {
                for (int i4 = 0; i4 < 6; i4++) {
                    this.f345r[(i3 * 6) + i4] = (short) ((sArr[i3] * 6) + i4);
                }
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                this.f344q[i5] = iArr[i5];
            }
            for (int i6 = 0; i6 < length2; i6++) {
                this.f345r[i6] = sArr[i6];
            }
            this.f341f = length2;
        }
        m157j();
        m158k();
        if (z) {
            m156i();
        }
        this.f326O = true;
        this.f325L = null;
    }

    /* JADX INFO: renamed from: a */
    final void m161a(BoneDeformer boneDeformer) {
        int[] iArr;
        int i;
        int[] iArr2;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        short[] sArr = this.f345r;
        short[] sArr2 = boneDeformer != null ? boneDeformer.f142b : null;
        if (sArr2 != null) {
            if (sArr != null) {
                iArr2 = new int[this.f341f];
                i = 0;
                for (int i6 = 0; i6 < this.f341f; i6++) {
                    short s = sArr2[0];
                    short s2 = sArr[i6];
                    int i7 = 0;
                    while (i5 <= s2) {
                        i5 = s;
                        i7++;
                        i5 += sArr2[i7];
                    }
                    i5 = s;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i) {
                            z3 = false;
                            break;
                        } else {
                            if (iArr2[i8] == i7) {
                                z3 = true;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (!z3) {
                        iArr2[i] = i7;
                        i++;
                    }
                }
                iArr = iArr2;
            } else {
                int i9 = 0;
                for (int i10 = 0; i10 < this.f340e; i10++) {
                    i9 += this.f344q[i10];
                }
                int[] iArr3 = new int[i9];
                int i11 = this.f339d;
                int i12 = 0;
                i = 0;
                while (i12 < this.f340e) {
                    int i13 = this.f344q[i12];
                    int i14 = i11;
                    int i15 = 0;
                    while (i15 < i13) {
                        short s3 = sArr2[0];
                        int i16 = 0;
                        while (i3 <= i14) {
                            i3 = s3;
                            i16++;
                            i3 += sArr2[i16];
                        }
                        i3 = s3;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= i) {
                                z2 = false;
                                break;
                            } else {
                                if (iArr3[i17] == i16) {
                                    z2 = true;
                                    break;
                                }
                                i17++;
                            }
                        }
                        if (z2) {
                            i4 = i;
                        } else {
                            i4 = i + 1;
                            iArr3[i] = i16;
                        }
                        i14++;
                        i15++;
                        i = i4;
                    }
                    i12++;
                    i11 = i14;
                }
                iArr = iArr3;
            }
        } else if (sArr != null) {
            iArr2 = new int[this.f341f];
            i = 0;
            for (int i18 = 0; i18 < this.f341f; i18++) {
                short s4 = sArr[i18];
                int i19 = 0;
                while (true) {
                    if (i19 >= i) {
                        z = false;
                        break;
                    } else {
                        if (iArr2[i19] == s4) {
                            z = true;
                            break;
                        }
                        i19++;
                    }
                }
                if (!z) {
                    iArr2[i] = s4;
                    i++;
                }
            }
            iArr = iArr2;
        } else {
            int i20 = 0;
            for (int i21 = 0; i21 < this.f340e; i21++) {
                i20 += this.f344q[i21];
            }
            int[] iArr4 = new int[i20];
            int i22 = this.f339d;
            int i23 = 0;
            for (int i24 = 0; i24 < this.f340e; i24++) {
                int i25 = this.f344q[i24];
                int i26 = 0;
                while (i26 < i25) {
                    iArr4[i23] = i22;
                    i26++;
                    i22++;
                    i23++;
                }
            }
            iArr = iArr4;
            i = i23;
        }
        int i27 = 0;
        while (true) {
            if (i27 >= f312M.length) {
                i2 = 1;
                break;
            } else {
                if (i < f312M[i27].f876a) {
                    i2 = f312M[i27].f877b;
                    break;
                }
                i27++;
            }
        }
        this.f331T = new short[(i / i2) + 1];
        C0108g.m504a(iArr, i);
        int i28 = 0;
        int i29 = 0;
        while (i29 < i) {
            this.f331T[i28] = (short) iArr[i29];
            i29 += i2;
            i28++;
        }
        this.f329R = i28;
        this.f343p = i;
        this.f347t = new short[i << 1];
        for (int i30 = 0; i30 < i; i30++) {
            int i31 = i30 << 1;
            this.f347t[i31] = (short) iArr[i30];
            int i32 = iArr[i30];
            int i33 = 0;
            int i34 = 0;
            while (i34 < i32) {
                short s5 = sArr2 != null ? sArr2[i34] : (short) 1;
                i34++;
                i33 = s5 + i33;
            }
            this.f347t[i31 + 1] = (short) i33;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m162a(Graphics3D graphics3D, GraphicsOGL graphicsOGL) {
        if (!this.f326O || this.f314A == null || this.f317D == null) {
            return;
        }
        graphics3D.f309h.m388a(graphicsOGL, this.f317D);
        for (int i = 0; i < this.f340e; i++) {
            if (this.f315B != null) {
                this.f315B.m70a(this.f316C[i]);
            }
            C0009ah.m357a(graphicsOGL, 1, this.f314A[i], this.f318E[i].f809e);
        }
        this.f326O = false;
    }

    /* JADX INFO: renamed from: a */
    final void m163a(VertexBuffer vertexBuffer, BoneDeformer boneDeformer, Transform transform, MorphDeformer morphDeformer, C0007af c0007af, C0059cd c0059cd) {
        int length;
        short[] sArr;
        boolean z;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        Transform[] transformArr = c0007af.f563a.f651a;
        short[] sArr2 = this.f331T;
        float[] fArrM471d = vertexBuffer.m337b(0).m471d();
        C0124w[] c0124wArr = boneDeformer.f143c;
        float[] fArr = transform.f494b.m;
        float[] fArr2 = c0059cd.f772a;
        int i2 = morphDeformer.f378c;
        int i3 = this.f329R;
        float f6 = Float.MAX_VALUE;
        float f7 = -3.4028235E38f;
        float f8 = Float.MAX_VALUE;
        float f9 = -3.4028235E38f;
        float f10 = Float.MAX_VALUE;
        C0006ae c0006ae = null;
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < morphDeformer.f383p; i5++) {
            c0006ae = morphDeformer.f382g[i5];
            if (c0006ae.f561a == this) {
                if (c0006ae.f562b[0] == null) {
                    break;
                }
                z2 = true;
                break;
            }
        }
        if (z2) {
            sArr = c0006ae.f562b[0];
            length = sArr.length;
            for (int i6 = 0; i6 < i2; i6++) {
                f313N[i6] = morphDeformer.f379d[i6].m337b(0).m471d();
            }
        } else {
            length = 0;
            sArr = null;
        }
        int i7 = 0;
        boolean z3 = z2;
        float f11 = -3.4028235E38f;
        while (i7 < i3) {
            short s = sArr2[i7];
            C0124w c0124w = c0124wArr[s];
            short s2 = c0124w.f1041c;
            int i8 = (s << 1) + s;
            float f12 = fArrM471d[i8];
            float f13 = fArrM471d[i8 + 1];
            float f14 = fArrM471d[i8 + 2];
            if (z3 && sArr[i4] == s) {
                i = 0;
                float f15 = f14;
                float f16 = f13;
                f2 = f12;
                while (i < i2) {
                    float[] fArr3 = f313N[i];
                    f2 += fArr2[i] * (fArr3[i8] - f12);
                    f16 += fArr2[i] * (fArr3[i8 + 1] - f13);
                    f15 += (fArr3[i8 + 2] - f14) * fArr2[i];
                    i++;
                }
                i4++;
                if (i4 >= length) {
                    z3 = false;
                }
                z = z3;
                f = f15;
                f13 = f16;
            } else {
                z = z3;
                f = f14;
                f2 = f12;
                i = i7;
            }
            if (s2 == 0) {
                f3 = (fArr[0] * f2) + (fArr[4] * f13) + (fArr[8] * f) + fArr[12];
                f4 = fArr[13] + (fArr[1] * f2) + (fArr[5] * f13) + (fArr[9] * f);
                f5 = (fArr[2] * f2) + (fArr[6] * f13) + (fArr[10] * f) + fArr[14];
            } else if (s2 == 1) {
                float[] fArr4 = transformArr[c0124w.f1040b[0]].f494b.m;
                f3 = fArr4[12] + (fArr4[0] * f2) + (fArr4[4] * f13) + (fArr4[8] * f);
                f4 = (fArr4[1] * f2) + (fArr4[5] * f13) + (fArr4[9] * f) + fArr4[13];
                f5 = fArr4[14] + (fArr4[2] * f2) + (f13 * fArr4[6]) + (f * fArr4[10]);
            } else {
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
                for (int i9 = 0; i9 < s2; i9++) {
                    float f17 = c0124w.f1039a[i9];
                    float[] fArr5 = transformArr[c0124w.f1040b[i9]].f494b.m;
                    f3 += ((fArr5[0] * f2) + (fArr5[4] * f13) + (fArr5[8] * f) + fArr5[12]) * f17;
                    f4 += ((fArr5[1] * f2) + (fArr5[5] * f13) + (fArr5[9] * f) + fArr5[13]) * f17;
                    f5 += f17 * (fArr5[14] + (fArr5[2] * f2) + (fArr5[6] * f13) + (fArr5[10] * f));
                }
            }
            if (f6 > f3) {
                f6 = f3;
            }
            if (f7 < f3) {
                f7 = f3;
            }
            if (f8 > f4) {
                f8 = f4;
            }
            if (f9 < f4) {
                f9 = f4;
            }
            float f18 = f10 > f5 ? f5 : f10;
            if (f11 < f5) {
                f11 = f5;
            }
            i7 = i + 1;
            z3 = z;
            f10 = f18;
        }
        this.f353z.set((f6 + f7) * 0.5f, (f8 + f9) * 0.5f, (f11 + f10) * 0.5f);
        for (int i10 = 0; i10 < 4; i10++) {
            f313N[i10] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m164a(VertexBuffer vertexBuffer, BoneDeformer boneDeformer, Transform transform, C0007af c0007af) {
        float f;
        float f2;
        float f3;
        Transform[] transformArr = c0007af.f563a.f651a;
        short[] sArr = this.f331T;
        float[] fArrM471d = vertexBuffer.m337b(0).m471d();
        C0124w[] c0124wArr = boneDeformer.f143c;
        float[] fArr = transform.f494b.m;
        int i = this.f329R;
        float f4 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        float f6 = Float.MAX_VALUE;
        float f7 = -3.4028235E38f;
        float f8 = -3.4028235E38f;
        int i2 = 0;
        float f9 = Float.MAX_VALUE;
        while (i2 < i) {
            short s = sArr[i2];
            C0124w c0124w = c0124wArr[s];
            short s2 = c0124w.f1041c;
            int i3 = s + (s << 1);
            int i4 = i3 + 1;
            float f10 = fArrM471d[i3];
            float f11 = fArrM471d[i4];
            float f12 = fArrM471d[i4 + 1];
            if (s2 == 0) {
                f = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
                f2 = fArr[13] + (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12);
                f3 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
            } else if (s2 == 1) {
                float[] fArr2 = transformArr[c0124w.f1040b[0]].f494b.m;
                f = fArr2[12] + (fArr2[0] * f10) + (fArr2[4] * f11) + (fArr2[8] * f12);
                f2 = (fArr2[1] * f10) + (fArr2[5] * f11) + (fArr2[9] * f12) + fArr2[13];
                f3 = fArr2[14] + (fArr2[2] * f10) + (fArr2[6] * f11) + (fArr2[10] * f12);
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                for (int i5 = 0; i5 < s2; i5++) {
                    float f13 = c0124w.f1039a[i5];
                    float[] fArr3 = transformArr[c0124w.f1040b[i5]].f494b.m;
                    f += ((fArr3[0] * f10) + (fArr3[4] * f11) + (fArr3[8] * f12) + fArr3[12]) * f13;
                    f2 += ((fArr3[1] * f10) + (fArr3[5] * f11) + (fArr3[9] * f12) + fArr3[13]) * f13;
                    f3 += f13 * (fArr3[14] + (fArr3[2] * f10) + (fArr3[6] * f11) + (fArr3[10] * f12));
                }
            }
            if (f4 > f) {
                f4 = f;
            }
            if (f5 < f) {
                f5 = f;
            }
            if (f6 > f2) {
                f6 = f2;
            }
            if (f7 < f2) {
                f7 = f2;
            }
            if (f9 > f3) {
                f9 = f3;
            }
            if (f8 >= f3) {
                f3 = f8;
            }
            i2++;
            f8 = f3;
        }
        this.f353z.set((f5 + f4) * 0.5f, (f7 + f6) * 0.5f, (f8 + f9) * 0.5f);
    }

    /* JADX INFO: renamed from: a */
    final void m165a(VertexBuffer vertexBuffer, MorphDeformer morphDeformer, C0059cd c0059cd) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (this.f335X != vertexBuffer.f525D) {
            C0006ae c0006ae = null;
            int i = 0;
            while (true) {
                if (i < morphDeformer.f383p) {
                    c0006ae = morphDeformer.f382g[i];
                    if (c0006ae.f561a == this) {
                        if (c0006ae.f562b[0] != null) {
                            z = true;
                            break;
                        }
                    } else {
                        i++;
                    }
                }
                z = false;
                break;
            }
            if (z) {
                if (this.f345r != null) {
                    int i2 = this.f333V;
                    Vector3D vector3D = this.f353z;
                    Vector3D vector3D2 = this.f334W;
                    int i3 = this.f341f;
                    short[] sArr = this.f345r;
                    float[] fArrM471d = vertexBuffer.m339c(0).m471d();
                    float f7 = fArrM471d[0];
                    float f8 = fArrM471d[0];
                    float f9 = fArrM471d[1];
                    float f10 = fArrM471d[1];
                    float f11 = fArrM471d[2];
                    float f12 = fArrM471d[2];
                    float[] fArr = c0059cd.f772a;
                    int i4 = morphDeformer.f378c;
                    short[] sArr2 = c0006ae.f562b[0];
                    int length = sArr2.length;
                    boolean z2 = true;
                    for (int i5 = 0; i5 < i4; i5++) {
                        f313N[i5] = morphDeformer.f379d[i5].m337b(0).m471d();
                    }
                    int i6 = 1;
                    int i7 = 0;
                    while (i6 < i3) {
                        short s = sArr[i6];
                        int i8 = (s << 1) + s;
                        float f13 = fArrM471d[i8];
                        float f14 = fArrM471d[i8 + 1];
                        float f15 = fArrM471d[i8 + 2];
                        if (z2 && sArr2[i7] == s) {
                            i6 = 0;
                            f4 = f15;
                            f5 = f14;
                            f6 = f13;
                            while (i6 < i4) {
                                f6 += fArr[i6] * (f313N[i6][i8] - f13);
                                f5 += fArr[i6] * (f313N[i6][i8 + 1] - f14);
                                f4 += fArr[i6] * (f313N[i6][i8 + 2] - f15);
                                i6++;
                            }
                            i7++;
                            if (i7 >= length) {
                                z2 = false;
                            }
                        } else {
                            f4 = f15;
                            f5 = f14;
                            f6 = f13;
                        }
                        if (f7 > f6) {
                            f7 = f6;
                        }
                        if (f8 < f6) {
                            f8 = f6;
                        }
                        if (f9 > f5) {
                            f9 = f5;
                        }
                        if (f10 < f5) {
                            f10 = f5;
                        }
                        if (f11 > f4) {
                            f11 = f4;
                        }
                        if (f12 >= f4) {
                            f4 = f12;
                        }
                        i6 += i2;
                        f12 = f4;
                    }
                    vector3D.set((f7 + f8) * 0.5f, (f9 + f10) * 0.5f, (f11 + f12) * 0.5f);
                    if (vector3D2 != null) {
                        vector3D2.set(f8, f10, f12);
                    }
                    for (int i9 = 0; i9 < i4; i9++) {
                        f313N[i9] = null;
                    }
                    return;
                }
                int i10 = this.f333V;
                Vector3D vector3D3 = this.f353z;
                Vector3D vector3D4 = this.f334W;
                int i11 = this.f338c * 3;
                int i12 = this.f339d * 3;
                int i13 = i10 * 3;
                float[] fArrM471d2 = vertexBuffer.m339c(0).m471d();
                float f16 = fArrM471d2[i12];
                float f17 = fArrM471d2[i12];
                float f18 = fArrM471d2[i12 + 1];
                float f19 = fArrM471d2[i12 + 1];
                float f20 = fArrM471d2[i12 + 2];
                float f21 = fArrM471d2[i12 + 2];
                float[] fArr2 = c0059cd.f772a;
                int i14 = morphDeformer.f378c;
                short[] sArr3 = c0006ae.f562b[0];
                int length2 = sArr3.length;
                boolean z3 = true;
                for (int i15 = 0; i15 < i14; i15++) {
                    f313N[i15] = morphDeformer.f379d[i15].m337b(0).m471d();
                }
                int i16 = this.f339d + 1;
                int i17 = i16 * 3;
                int i18 = 0;
                while (i17 < i11) {
                    float f22 = fArrM471d2[i17];
                    float f23 = fArrM471d2[i17 + 1];
                    float f24 = fArrM471d2[i17 + 2];
                    if (z3 && sArr3[i18] == i16) {
                        f = f24;
                        f2 = f23;
                        f3 = f22;
                        for (int i19 = 0; i19 < i14; i19++) {
                            f3 += fArr2[i19] * (f313N[i19][i17] - f22);
                            f2 += fArr2[i19] * (f313N[i19][i17 + 1] - f23);
                            f += fArr2[i19] * (f313N[i19][i17 + 2] - f24);
                        }
                        i18++;
                        if (i18 >= length2) {
                            z3 = false;
                        }
                    } else {
                        f = f24;
                        f2 = f23;
                        f3 = f22;
                    }
                    if (f16 > f3) {
                        f16 = f3;
                    }
                    if (f17 < f3) {
                        f17 = f3;
                    }
                    if (f18 > f2) {
                        f18 = f2;
                    }
                    if (f19 < f2) {
                        f19 = f2;
                    }
                    if (f20 > f) {
                        f20 = f;
                    }
                    if (f21 >= f) {
                        f = f21;
                    }
                    i17 += i13;
                    i16++;
                    f21 = f;
                }
                vector3D3.set((f16 + f17) * 0.5f, (f18 + f19) * 0.5f, (f20 + f21) * 0.5f);
                if (vector3D4 != null) {
                    vector3D4.set(f17, f19, f21);
                }
                for (int i20 = 0; i20 < i14; i20++) {
                    f313N[i20] = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m166a(VertexBuffer vertexBuffer, Vector3D vector3D, Vector3D vector3D2) {
        if (this.f335X != vertexBuffer.f525D) {
            if (this.f345r != null) {
                m153a(vertexBuffer, 1, this.f353z, this.f334W);
            } else {
                m154b(vertexBuffer, 1, this.f353z, this.f334W);
            }
            this.f335X = vertexBuffer.f525D;
        }
        vector3D.f516a = this.f353z.f516a;
        vector3D.f517b = this.f353z.f517b;
        vector3D.f518c = this.f353z.f518c;
        vector3D2.f516a = this.f334W.f516a;
        vector3D2.f517b = this.f334W.f517b;
        vector3D2.f518c = this.f334W.f518c;
    }

    /* JADX INFO: renamed from: a */
    final boolean m167a(VertexBuffer vertexBuffer) {
        if ((this.f336a == 7 ? this.f338c / 6 : this.f338c) >= vertexBuffer.getMaxVerticesNum()) {
            return false;
        }
        int params = vertexBuffer.getParams();
        switch (this.f336a) {
            case 7:
                return (params & 129) == 129 && (params & 14) == 0;
            default:
                if ((params & 128) != 0) {
                    return false;
                }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m168b() {
        boolean z;
        int i;
        if (this.f345r == null) {
            short s = (short) this.f339d;
            int i2 = this.f340e;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 += this.f344q[i4];
            }
            this.f348u = new short[i3];
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = this.f344q[i6];
                short s2 = s;
                int i8 = 0;
                while (i8 < i7) {
                    this.f348u[i5] = s2;
                    i8++;
                    i5++;
                    s2 = (short) (s2 + 1);
                }
                s = s2;
            }
            return;
        }
        int i9 = this.f341f;
        int[] iArr = new int[this.f341f];
        int i10 = 0;
        int i11 = 0;
        while (i11 < i9) {
            short s3 = this.f345r[i11];
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    z = false;
                    break;
                } else {
                    if (iArr[i12] == s3) {
                        z = true;
                        break;
                    }
                    i12++;
                }
            }
            if (z) {
                i = i10;
            } else {
                i = i10 + 1;
                iArr[i10] = s3;
            }
            i11++;
            i10 = i;
        }
        C0108g.m504a(iArr, i10);
        this.f348u = new short[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            this.f348u[i13] = (short) iArr[i13];
        }
    }

    /* JADX INFO: renamed from: b */
    final void m169b(VertexBuffer vertexBuffer) {
        if (this.f335X != vertexBuffer.f525D) {
            if (this.f346s != null) {
                m153a(vertexBuffer, this.f333V, this.f353z, (Vector3D) null);
            } else {
                m154b(vertexBuffer, this.f333V, this.f353z, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final void m170c() {
        int i = this.f340e;
        if (this.f315B == null) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = this.f344q[i3];
                this.f314A[i3].put(0, this.f346s, i2, i4);
                i2 += i4;
            }
            return;
        }
        C0122u[] c0122uArr = this.f316C;
        int i5 = 0;
        int i6 = 0;
        while (i6 < i) {
            int i7 = this.f344q[i6];
            this.f314A[i6].put(c0122uArr[i6].f1033a, this.f346s, i5, i7);
            i6++;
            i5 = i7 + i5;
        }
    }

    /* JADX INFO: renamed from: d */
    final int m171d() {
        return this.f333V;
    }

    public final void fix() {
        if (this.f337b) {
            return;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = this.f340e;
        if (this.f336a == 5 && this.f345r != null && i4 > 1) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (this.f344q[i5] < 8) {
                    i3 += this.f344q[i5] - 2;
                } else {
                    i2++;
                    i += this.f344q[i5];
                }
            }
            int i6 = i3 * 3;
            int[] iArr = new int[(i3 > 0 ? 1 : 0) + i2];
            short[] sArr = new short[i6 + i];
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i7 < i4) {
                if (this.f344q[i7] >= 8) {
                    int i11 = i9 + 1;
                    iArr[i9] = this.f344q[i7];
                    int i12 = 0;
                    while (i12 < this.f344q[i7]) {
                        sArr[i10] = this.f345r[i8 + i12];
                        i12++;
                        i10++;
                    }
                    i9 = i11;
                }
                int i13 = i8 + this.f344q[i7];
                i7++;
                i8 = i13;
            }
            int i14 = 0;
            int i15 = 0;
            int i16 = i10;
            while (i15 < i4) {
                if (this.f344q[i15] < 8) {
                    int i17 = 0;
                    int i18 = this.f344q[i15] - 2;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((i19 & 1) == 0) {
                            int i20 = i16 + 1;
                            sArr[i16] = this.f345r[i14 + i17];
                            int i21 = i20 + 1;
                            sArr[i20] = this.f345r[i14 + i17 + 1];
                            i16 = i21 + 1;
                            sArr[i21] = this.f345r[i14 + i17 + 2];
                        } else {
                            int i22 = i16 + 1;
                            sArr[i16] = this.f345r[i14 + i17 + 1];
                            int i23 = i22 + 1;
                            sArr[i22] = this.f345r[i14 + i17];
                            i16 = i23 + 1;
                            sArr[i23] = this.f345r[i14 + i17 + 2];
                        }
                        i17++;
                    }
                }
                int i24 = i14 + this.f344q[i15];
                i15++;
                i14 = i24;
            }
            this.f344q = null;
            this.f336a = 5;
            if (i3 > 0) {
                iArr[i2] = i6;
            }
            this.f342g = i6;
            this.f340e = (i3 > 0 ? 1 : 0) + i2;
            this.f344q = iArr;
            this.f330S = iArr;
            this.f341f = i + i6;
            this.f345r = sArr;
            this.f346s = sArr;
            m152a(this.f336a, 0, this.f344q, this.f340e, this.f345r, this.f341f, true);
            m157j();
            m158k();
        }
        m156i();
        this.f326O = true;
        this.f325L = null;
        this.f337b = true;
    }

    public final Appearance getAppearance() {
        return this.f352y;
    }

    public final GeometricShape getGeometricShape(int i) {
        switch (i) {
            case 1:
                return this.f349v;
            case 5:
                return this.f350w;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int getIndexLengths(int[] iArr) {
        if (iArr != null) {
            for (int i = 0; i < this.f340e; i++) {
                iArr[i] = this.f344q[i];
            }
        }
        return this.f340e;
    }

    public final int getIndexType() {
        return this.f336a;
    }

    public final int getIndices(short[] sArr) {
        if (sArr != null && this.f345r != null) {
            for (int i = 0; i < this.f341f; i++) {
                sArr[i] = this.f345r[i];
            }
        }
        return this.f341f;
    }

    public final int getPolygonCount() {
        return this.f351x;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final int getUserData(int i) throws IllegalStateException {
        if (i < 0 || i >= this.f351x) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f332U == null) {
            throw new IllegalStateException();
        }
        return this.f332U[i];
    }

    public final boolean isConvertStrip() {
        return this.f342g > 0;
    }

    public final boolean isFix() {
        return this.f337b;
    }

    public final void purgeBuffer() {
        if (this.f314A != null) {
            for (int i = 0; i < this.f314A.length; i++) {
                this.f314A[i] = null;
            }
        }
        if (this.f315B != null) {
            if (this.f316C != null) {
                for (int i2 = 0; i2 < this.f316C.length; i2++) {
                    this.f316C[i2].f1037e = true;
                }
            }
            this.f315B = null;
            this.f316C = null;
        }
        if (this.f318E != null) {
            for (int i3 = 0; i3 < this.f318E.length; i3++) {
                if (this.f318E[i3] != null) {
                    this.f318E[i3].m476b();
                }
            }
            this.f318E = null;
        }
    }

    public final void set(int i, int i2, int[] iArr) {
        int i3 = 0;
        int length = iArr.length;
        m152a(i, i2, iArr, length, null, 0, false);
        if (this.f327P < length) {
            throw new IllegalArgumentException();
        }
        if (this.f328Q > 0) {
            throw new IllegalArgumentException();
        }
        if (this.f337b) {
            throw new IllegalStateException();
        }
        this.f336a = i;
        this.f340e = length;
        if (i == 7) {
            this.f338c *= 6;
            this.f339d = i2 * 6;
            while (i3 < length) {
                this.f344q[i3] = iArr[i3] * 6;
                i3++;
            }
        } else {
            this.f339d = i2;
            while (i3 < length) {
                this.f344q[i3] = iArr[i3];
                i3++;
            }
        }
        m157j();
        m158k();
        this.f325L = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void set(int i, int[] iArr, short[] sArr) throws IllegalStateException {
        m160a(i, iArr, sArr, true);
    }

    public final void setAppearance(Appearance appearance) {
        this.f352y = appearance;
    }

    public final void setGeometricShape(GeometricShape geometricShape) {
        if (geometricShape != null && geometricShape.f257a != 1) {
            throw new IllegalArgumentException();
        }
        if (geometricShape != null && geometricShape.f259c != null) {
            throw new IllegalArgumentException();
        }
        if (this.f349v != null) {
            this.f349v.f259c = null;
            this.f349v = null;
        }
        this.f349v = geometricShape;
        if (geometricShape != null) {
            geometricShape.f259c = this;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void setUserData(int i, int[] iArr, int i2, int i3) throws IllegalStateException {
        if (iArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f351x) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 <= 0 || i + i3 > this.f351x) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 < 0 || i2 >= iArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 + i3 > iArr.length) {
            throw new IndexOutOfBoundsException();
        }
        switch (this.f336a) {
            case 4:
            case 5:
            case 6:
                if (this.f332U == null) {
                    this.f332U = new int[this.f351x];
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f332U[i + i4] = iArr[i2 + i4];
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
