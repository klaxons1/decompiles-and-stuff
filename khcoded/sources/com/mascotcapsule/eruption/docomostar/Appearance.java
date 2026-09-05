package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Appearance extends Animatable {
    public static final int ALPHAWRITE = 2;
    public static final int BlendModeDst_DST_ALPHA = 6;
    public static final int BlendModeDst_ONE = 1;
    public static final int BlendModeDst_ONE_MINUS_DST_ALPHA = 7;
    public static final int BlendModeDst_ONE_MINUS_SRC_ALPHA = 5;
    public static final int BlendModeDst_ONE_MINUS_SRC_COLOR = 3;
    public static final int BlendModeDst_SRC_ALPHA = 4;
    public static final int BlendModeDst_SRC_COLOR = 2;
    public static final int BlendModeDst_ZERO = 0;
    public static final int BlendModeSrc_DST_ALPHA = 6;
    public static final int BlendModeSrc_DST_COLOR = 2;
    public static final int BlendModeSrc_ONE = 1;
    public static final int BlendModeSrc_ONE_MINUS_DST_ALPHA = 7;
    public static final int BlendModeSrc_ONE_MINUS_DST_COLOR = 3;
    public static final int BlendModeSrc_ONE_MINUS_SRC_ALPHA = 5;
    public static final int BlendModeSrc_SRC_ALPHA = 4;
    public static final int BlendModeSrc_SRC_ALPHA_SATURATE = 8;
    public static final int BlendModeSrc_ZERO = 0;
    public static final int BlendMode_ALPHA = 0;
    public static final int BlendMode_ALPHA_ADD = 1;
    public static final int BlendMode_MODULATE = 2;
    public static final int BlendMode_MODULATE_X2 = 3;
    public static final int BlendMode_REPLACE = 4;
    public static final int COLORWRITE = 4;
    public static final int CullingMode_CULL_BACK = 0;
    public static final int CullingMode_CULL_FRONT = 1;
    public static final int CullingMode_CULL_NONE = 2;
    public static final int DEPTHOFFSET = 128;
    public static final int DEPTHTEST = 8;
    public static final int DEPTHWRITE = 16;
    public static final int DRAWSILHOUETTE = 512;
    public static final int LIGHTING = 1;
    public static final int LIGHTTWOSIDE = 256;
    public static final int MASK = 4095;
    public static final int MAX_TEXTURE_NUM = 2;
    public static final int MaterialType_AMBIENT = 0;
    public static final int MaterialType_DIFFUSE = 1;
    public static final int MaterialType_EMISSIVE = 2;
    public static final int MaterialType_SPECULAR = 3;
    public static final int PERSCORRECT = 32;
    public static final int ShadingMode_FLAT = 0;
    public static final int ShadingMode_GOURAUD = 1;
    public static final int TEXTURE_FILTER_LINEAR = 1;
    public static final int TEXTURE_FILTER_LINEAR_MIPMAP_LINEAR = 5;
    public static final int TEXTURE_FILTER_LINEAR_MIPMAP_NEAREST = 3;
    public static final int TEXTURE_FILTER_NEAREST = 0;
    public static final int TEXTURE_FILTER_NEAREST_MIPMAP_LINEAR = 4;
    public static final int TEXTURE_FILTER_NEAREST_MIPMAP_NEAREST = 2;
    public static final int TEXTURE_FILTER_TYPE_MAG = 1;
    public static final int TEXTURE_FILTER_TYPE_MIN = 0;
    public static final int TEXTURE_WRAP_CLAMP = 1;
    public static final int TEXTURE_WRAP_REPEAT = 0;
    public static final int TextureType_COLORMAP = 0;
    public static final int TextureType_LIGHTMAP = 2;
    public static final int TextureType_NORMALMAP = 3;
    public static final int TextureType_PROJECTIVE = 4;
    public static final int TextureType_REFLECTMAP = 1;
    public static final int Texture_FUNC_ADD = 1;
    public static final int Texture_FUNC_BLEND = 2;
    public static final int Texture_FUNC_DECAL = 3;
    public static final int Texture_FUNC_MODULATE = 4;
    public static final int Texture_FUNC_REPLACE = 0;
    public static final int USERDATA_NUM = 64;
    public static final int USE_FIGURE_APPEARANCE = 2048;
    public static final int VERTEXCOLOR = 64;
    public static final int VISIBLE = 1024;

    /* JADX INFO: renamed from: q */
    private static final C0106e[] f103q;

    /* JADX INFO: renamed from: r */
    private static final short[] f104r = {0, 1, 774, 775, 770, 771, 772, 773, 776};

    /* JADX INFO: renamed from: s */
    private static final short[] f105s = {0, 1, 768, 769, 770, 771, 772, 773};

    /* JADX INFO: renamed from: t */
    private static float[] f106t = new float[4];

    /* JADX INFO: renamed from: u */
    private static boolean[] f107u = new boolean[4];

    /* JADX INFO: renamed from: c */
    C0086dd f108c;

    /* JADX INFO: renamed from: d */
    C0051bw f109d;

    /* JADX INFO: renamed from: e */
    C0036bh[] f110e;

    /* JADX INFO: renamed from: f */
    boolean f111f;

    /* JADX INFO: renamed from: g */
    boolean f112g;

    /* JADX INFO: renamed from: p */
    boolean[] f113p;

    /* JADX INFO: renamed from: v */
    private int[] f114v;

    /* JADX INFO: renamed from: w */
    private Vector f115w;

    /* JADX INFO: renamed from: x */
    private C0117p[] f116x;

    static {
        C0106e[] c0106eArr = new C0106e[5];
        f103q = c0106eArr;
        c0106eArr[0] = new C0106e(770, 771);
        f103q[1] = new C0106e(770, 1);
        f103q[2] = new C0106e(774, 0);
        f103q[3] = new C0106e(774, 768);
        f103q[4] = new C0106e(1, 0);
        for (int i = 0; i < 4; i++) {
            f107u[i] = true;
        }
    }

    public Appearance() {
        super(14);
        mo3a();
    }

    /* JADX INFO: renamed from: a */
    static final int m9a(int i, boolean z) {
        return i | 2;
    }

    /* JADX INFO: renamed from: b */
    static final int m10b(int i, boolean z) {
        return i | 4;
    }

    /* JADX INFO: renamed from: c */
    static final int m11c(int i, boolean z) {
        return i | 8;
    }

    /* JADX INFO: renamed from: c */
    static final boolean m12c(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: d */
    static final int m13d(int i, boolean z) {
        return i | 16;
    }

    /* JADX INFO: renamed from: d */
    static final boolean m14d(int i) {
        return (i & 4) != 0;
    }

    /* JADX INFO: renamed from: e */
    static final int m15e(int i, boolean z) {
        return i | 1024;
    }

    /* JADX INFO: renamed from: e */
    static final boolean m16e(int i) {
        return (i & 8) != 0;
    }

    /* JADX INFO: renamed from: f */
    static final boolean m17f(int i) {
        return (i & 16) != 0;
    }

    /* JADX INFO: renamed from: g */
    static final boolean m18g(int i) {
        return (i & 32) != 0;
    }

    /* JADX INFO: renamed from: h */
    static final boolean m19h(int i) {
        return (i & 128) != 0;
    }

    /* JADX INFO: renamed from: i */
    static final boolean m20i(int i) {
        return (i & LIGHTTWOSIDE) != 0;
    }

    /* JADX INFO: renamed from: j */
    static final boolean m21j(int i) {
        return (i & DRAWSILHOUETTE) != 0;
    }

    /* JADX INFO: renamed from: k */
    static final boolean m22k(int i) {
        return (i & 1024) != 0;
    }

    /* JADX INFO: renamed from: l */
    static final boolean m23l(int i) {
        return (i & USE_FIGURE_APPEARANCE) != 0;
    }

    /* JADX INFO: renamed from: m */
    private boolean m24m(int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.f110e[i2].f705c == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025 A[PHI: r0
  0x0025: PHI (r0v2 int) = (r0v1 int), (r0v7 int), (r0v7 int) binds: [B:11:0x0014, B:13:0x0020, B:15:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[PHI: r0
  0x003c: PHI (r0v3 int) = (r0v2 int), (r0v6 int), (r0v6 int) binds: [B:17:0x002b, B:19:0x0037, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0053 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // com.mascotcapsule.eruption.docomostar.Animatable, com.mascotcapsule.eruption.docomostar.Object3D
    /* JADX INFO: renamed from: a */
    final int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        int iMo0a = super.mo0a(i, i2, object3DArr, i3);
        if (object3DArr == null || object3DArr.length > iMo0a) {
            for (int i4 = 0; i4 < 2; i4++) {
                if (this.f110e[i4].f713k != null) {
                    iMo0a = this.f110e[i4].f713k.mo0a(i, i2, object3DArr, iMo0a);
                    if (object3DArr != null && object3DArr.length <= iMo0a) {
                        break;
                    }
                    if (this.f110e[i4].f714l != null) {
                        iMo0a = this.f110e[i4].f714l.mo0a(i, i2, object3DArr, iMo0a);
                        if (object3DArr == null && object3DArr.length <= iMo0a) {
                            break;
                        }
                        if (this.f110e[i4].f715m != null) {
                            iMo0a = this.f110e[i4].f715m.mo0a(i, i2, object3DArr, iMo0a);
                            if (object3DArr == null && object3DArr.length <= iMo0a) {
                                break;
                            }
                        }
                    } else {
                        if (this.f110e[i4].f715m != null) {
                            iMo0a = this.f110e[i4].f715m.mo0a(i, i2, object3DArr, iMo0a);
                            if (object3DArr == null) {
                                continue;
                            }
                        }
                    }
                } else if (this.f110e[i4].f714l != null) {
                    iMo0a = this.f110e[i4].f714l.mo0a(i, i2, object3DArr, iMo0a);
                    if (object3DArr == null) {
                        if (this.f110e[i4].f715m != null) {
                            iMo0a = this.f110e[i4].f715m.mo0a(i, i2, object3DArr, iMo0a);
                            if (object3DArr == null) {
                                continue;
                            }
                        }
                    } else {
                        if (this.f110e[i4].f715m != null) {
                            iMo0a = this.f110e[i4].f715m.mo0a(i, i2, object3DArr, iMo0a);
                            if (object3DArr == null) {
                                continue;
                            }
                        }
                    }
                } else {
                    if (this.f110e[i4].f715m != null) {
                        iMo0a = this.f110e[i4].f715m.mo0a(i, i2, object3DArr, iMo0a);
                        if (object3DArr == null) {
                            continue;
                        }
                    }
                }
            }
        }
        return iMo0a;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo3a() {
        super.mo3a();
        this.f108c = new C0086dd();
        this.f109d = new C0051bw();
        this.f110e = new C0036bh[2];
        for (int i = 0; i < 2; i++) {
            this.f110e[i] = new C0036bh();
        }
        this.f111f = false;
        this.f112g = false;
        this.f113p = new boolean[2];
        this.f114v = null;
        this.f115w = new Vector(0, 1);
    }

    /* JADX INFO: renamed from: a */
    final void m25a(int i, Transform transform) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        Transform.m251e(this.f110e[i].f712j.f962c, transform);
        this.f110e[i].f712j.f965f = true;
        this.f113p[i] = true;
    }

    /* JADX INFO: renamed from: a */
    final void m26a(int i, float[] fArr) {
        float[] fArr2 = this.f110e[i].f712j.f963d;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        this.f110e[i].f712j.f965f = true;
        this.f113p[i] = true;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo4a(Action action) {
        if (action.f84c != 2) {
            throw new IllegalArgumentException();
        }
        if (action.f85d.length != 9) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo5a(ActionController actionController) {
        if (actionController.f90c != 9) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo6a(C0097do c0097do, float f) {
        C0019ar[] c0019arArr = c0097do.f895a.f85d;
        float[] fArr = {0.0f};
        if (c0019arArr[0].m410a(f, c0097do.f899e, c0097do.f897c[0], this.f108c.f852a)) {
            this.f111f = true;
        }
        if (c0019arArr[1].m410a(f, c0097do.f899e, c0097do.f897c[1], this.f108c.f853b)) {
            this.f111f = true;
        }
        if (c0019arArr[2].m410a(f, c0097do.f899e, c0097do.f897c[2], this.f108c.f854c)) {
            this.f111f = true;
        }
        if (c0019arArr[3].m410a(f, c0097do.f899e, c0097do.f897c[3], this.f108c.f855d)) {
            this.f111f = true;
        }
        if (c0019arArr[4].m410a(f, c0097do.f899e, c0097do.f897c[4], fArr)) {
            this.f108c.f856e = fArr[0];
            this.f111f = true;
        }
        int i = 5;
        for (int i2 = 0; i2 < 2; i2++) {
            if (c0019arArr[i].m410a(f, c0097do.f899e, c0097do.f897c[i], this.f110e[i2].f704b)) {
                this.f113p[i2] = true;
            }
            int i3 = i + 1;
            C0113l c0113l = this.f110e[i2].f712j;
            if (c0019arArr[i3].m411a(c0113l, f, c0097do.f899e, c0097do.f897c[i3], 0)) {
                c0113l.f965f = true;
                this.f113p[i2] = true;
            }
            i = i3 + 1;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo7a(C0019ar[][] c0019arArr, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, int i) {
        C0086dd c0086dd = this.f108c;
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 0, c0086dd.f852a)) {
            this.f111f = true;
        }
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 1, c0086dd.f853b)) {
            this.f111f = true;
        }
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 2, c0086dd.f854c)) {
            this.f111f = true;
        }
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 3, c0086dd.f855d)) {
            this.f111f = true;
        }
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 4, f106t)) {
            c0086dd.f856e = f106t[0];
            if (128.0f < c0086dd.f856e) {
                c0086dd.f856e = 128.0f;
            }
            this.f111f = true;
        }
        int i2 = 5;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= 2) {
                return;
            }
            if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, i2, this.f110e[i4].f704b)) {
                this.f113p[i4] = true;
            }
            int i5 = i2 + 1;
            C0113l c0113l = this.f110e[i4].f712j;
            if (C0019ar.m408a(c0019arArr, c0113l, fArr, c0033beArr, fArr2, f107u, i, i5, 0)) {
                c0113l.f965f = true;
                this.f113p[i4] = true;
            }
            i2 = i5 + 1;
            i3 = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    final C0117p m27b(int i) {
        C0117p c0117p;
        int i2 = 0;
        int size = this.f115w.size();
        if (i >= size) {
            while (size <= i) {
                this.f115w.addElement(new C0117p(this));
                size++;
            }
            int size2 = this.f115w.size();
            this.f116x = new C0117p[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                this.f116x[i3] = (C0117p) this.f115w.elementAt(i3);
            }
            c0117p = this.f116x[i];
            c0117p.f996b.m481a(this.f108c);
            c0117p.f997c.m441a(this.f109d);
            while (i2 < 2) {
                c0117p.f998d[i2].m430a(this.f110e[i2]);
                i2++;
            }
            c0117p.f999e = true;
        } else {
            c0117p = this.f116x[i];
            if (c0117p.f999e) {
                if (this.f111f) {
                    c0117p.f996b.m481a(this.f108c);
                }
                if (this.f112g) {
                    c0117p.f997c.m441a(this.f109d);
                }
                while (i2 < 2) {
                    if (this.f113p[i2]) {
                        c0117p.f998d[i2].m430a(this.f110e[i2]);
                    }
                    i2++;
                }
            } else {
                c0117p.f996b.m481a(this.f108c);
                c0117p.f997c.m441a(this.f109d);
                while (i2 < 2) {
                    c0117p.f998d[i2].m430a(this.f110e[i2]);
                    i2++;
                }
                c0117p.f999e = true;
            }
        }
        return c0117p;
    }

    /* JADX INFO: renamed from: c */
    final boolean m28c() {
        return m24m(1);
    }

    /* JADX INFO: renamed from: d */
    final boolean m29d() {
        return m24m(3);
    }

    public final int getAlphaThreshold() {
        return Util3D.m294b(this.f109d.f750b);
    }

    public final int getBlendModeDst() {
        switch (this.f109d.f756h) {
            case 0:
            default:
                return 0;
            case 1:
                return 1;
            case 768:
                return 2;
            case 769:
                return 3;
            case 770:
                return 4;
            case 771:
                return 5;
            case 772:
                return 6;
            case 773:
                return 7;
        }
    }

    public final int getBlendModeSrc() {
        switch (this.f109d.f755g) {
            case 0:
            default:
                return 0;
            case 1:
                return 1;
            case 770:
                return 4;
            case 771:
                return 5;
            case 772:
                return 6;
            case 773:
                return 7;
            case 774:
                return 2;
            case 775:
                return 3;
            case 776:
                return 8;
        }
    }

    public final int getColor(int i) {
        switch (i) {
            case 0:
                return Util3D.m295b(this.f108c.f852a);
            case 1:
                return Util3D.m295b(this.f108c.f853b);
            case 2:
                return Util3D.m295b(this.f108c.f854c);
            case 3:
                return Util3D.m295b(this.f108c.f855d);
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int getCullingMode() {
        return this.f109d.f757i;
    }

    public final int getDrawOrder() {
        return this.f109d.f759k;
    }

    public final float getPolygonOffsetFactor() {
        return this.f109d.f751c;
    }

    public final float getPolygonOffsetUnits() {
        return this.f109d.f752d;
    }

    public final Camera getProjector(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f715m;
    }

    public final int getProperties() {
        return this.f109d.f749a;
    }

    public final int getShadingMode() {
        return this.f109d.f758j;
    }

    public final int getShininess() {
        return Util3D.m294b(this.f108c.f856e / 128.0f);
    }

    public final int getSilhouetteColor() {
        return this.f109d.f754f;
    }

    public final float getSilhouetteWidth() {
        return this.f109d.f753e;
    }

    public final Texture getTexture(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f713k;
    }

    public final int getTextureBlendColor(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return Util3D.m295b(this.f110e[i].f704b);
    }

    public final int getTextureBlendMode(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f703a;
    }

    public final float getTextureCombineRgbScale(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f710h;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020 A[ORIG_RETURN, RETURN] */
    public final int getTextureFilter(int i, int i2) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        switch (i2) {
            case 0:
                switch ((int) this.f110e[i].f708f) {
                    case 9728:
                        return 0;
                    case 9729:
                        return 1;
                    case 9984:
                        return 2;
                    case 9985:
                        return 3;
                    case 9986:
                        return 4;
                    case 9987:
                        return 5;
                    default:
                        return -1;
                }
            case 1:
                switch ((int) this.f110e[i].f709g) {
                    case 9728:
                        return 0;
                    case 9729:
                        return 1;
                    default:
                        return -1;
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean getTextureHint(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f716n;
    }

    public final int getTextureRefGid(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f711i;
    }

    public final int getTextureType(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f705c;
    }

    public final int getTextureWrapModeS(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f706d;
    }

    public final int getTextureWrapModeT(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        return this.f110e[i].f707e;
    }

    public final void getTransform(int i, Transform transform) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        Transform.m251e(transform, this.f110e[i].f712j.f960a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final int getUserData(int i) throws IllegalStateException {
        if (i < 0 || i >= 64) {
            throw new IllegalArgumentException();
        }
        if (this.f114v == null) {
            throw new IllegalStateException();
        }
        return this.f114v[i];
    }

    /* JADX INFO: renamed from: h */
    final boolean m30h() {
        for (int i = 0; i < 2; i++) {
            if ((this.f110e[i].f705c == 1 && this.f110e[i].f716n) || this.f110e[i].f705c == 2 || this.f110e[i].f705c == 4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    final boolean m31i() {
        for (int i = 0; i < 2; i++) {
            if (this.f110e[i].f705c == 1 || this.f110e[i].f705c == 2 || this.f110e[i].f705c == 3) {
                return true;
            }
        }
        return false;
    }

    public final void setAlphaThreshold(int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException();
        }
        this.f109d.f750b = Util3D.m293b(i);
        this.f112g = true;
    }

    public final void setBlendMode(int i) {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException();
        }
        this.f109d.f755g = f103q[i].f929a;
        this.f109d.f756h = f103q[i].f930b;
        this.f109d.f760l = i != 4;
        this.f112g = true;
    }

    public final void setBlendMode(int i, int i2) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 > 7) {
            throw new IllegalArgumentException();
        }
        this.f109d.f755g = f104r[i];
        this.f109d.f756h = f105s[i2];
        if (i == 1 && i2 == 0) {
            this.f109d.f760l = false;
        } else {
            this.f109d.f760l = true;
        }
        this.f112g = true;
    }

    public final void setColor(int i, int i2) {
        switch (i) {
            case 0:
                Util3D.m296b(this.f108c.f852a, i2);
                this.f111f = true;
                return;
            case 1:
                Util3D.m296b(this.f108c.f853b, i2);
                this.f111f = true;
                return;
            case 2:
                Util3D.m296b(this.f108c.f854c, i2);
                this.f111f = true;
                return;
            case 3:
                Util3D.m296b(this.f108c.f855d, i2);
                this.f111f = true;
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void setCullingMode(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException();
        }
        this.f109d.f757i = i;
        this.f112g = true;
    }

    public final void setDrawOrder(int i) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException();
        }
        this.f109d.f759k = (short) i;
        this.f112g = true;
    }

    public final void setIdentity(int i) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f712j.f960a.setIdentity();
        this.f110e[i].f712j.f965f = true;
        this.f113p[i] = true;
    }

    public final void setPolygonOffset(float f, float f2) {
        this.f109d.f751c = f;
        this.f109d.f752d = f2;
        this.f112g = true;
    }

    public final void setProjector(int i, Camera camera) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (camera != null) {
            camera.f184s++;
        }
        if (this.f110e[i].f715m != null) {
            this.f110e[i].f715m.f184s--;
        }
        this.f110e[i].f715m = camera;
    }

    public final void setProperties(int i) {
        this.f109d.f749a = i;
        if ((i & 1) != 0) {
            this.f108c.f857f = true;
        } else {
            this.f108c.f857f = false;
        }
        if ((i & 64) != 0) {
            this.f108c.f858g = true;
        } else {
            this.f108c.f858g = false;
        }
        this.f111f = true;
        this.f112g = true;
    }

    public final void setRotateEuler(int i, int i2, Vector3D vector3D) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 > 5) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f712j.f960a.setRotateEuler(i2, vector3D);
        this.f110e[i].f712j.f965f = true;
        this.f113p[i] = true;
    }

    public final void setScale(int i, Vector3D vector3D) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        f106t[0] = vector3D.f516a;
        f106t[1] = vector3D.f517b;
        f106t[2] = vector3D.f518c;
        this.f110e[i].f712j.f960a.m269b(f106t);
        this.f110e[i].f712j.f965f = true;
        this.f113p[i] = true;
    }

    public final void setShadingMode(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException();
        }
        this.f109d.f758j = i;
        this.f112g = true;
    }

    public final void setShininess(int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException();
        }
        this.f108c.f856e = Util3D.m293b(i);
        this.f108c.f856e *= 128.0f;
    }

    public final void setSilhouette(float f, int i) {
        if (f < 0.0f) {
            throw new IllegalArgumentException();
        }
        this.f109d.f753e = f;
        this.f109d.f754f = i;
    }

    public final void setSoftwareLight(int i, Light light) {
        int lightType;
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (light != null && (lightType = light.getLightType()) != 1 && lightType != 2) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f714l = light;
    }

    public final void setTexture(int i, Texture texture) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (texture != null && texture.f476f <= 1) {
            switch ((int) this.f110e[i].f708f) {
                case 9984:
                case 9985:
                case 9986:
                case 9987:
                    throw new IllegalArgumentException();
            }
        }
        if (this.f110e[i].f713k == texture) {
            return;
        }
        this.f110e[i].f713k = texture;
        this.f113p[i] = true;
        this.f110e[i].f717o = true;
    }

    public final void setTextureBlendColor(int i, int i2) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        Util3D.m296b(this.f110e[i].f704b, i2);
        this.f113p[i] = true;
    }

    public final void setTextureBlendMode(int i, int i2) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 > 4) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f703a = i2;
        this.f113p[i] = true;
    }

    public final void setTextureCombineRgbScale(int i, float f) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f710h = f;
    }

    public final void setTextureFilter(int i, int i2, int i3) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        Texture texture = this.f110e[i].f713k;
        if (texture != null && texture.f476f <= 1) {
            switch (i3) {
                case 2:
                case 3:
                case 4:
                case 5:
                    throw new IllegalArgumentException();
            }
        }
        switch (i2) {
            case 0:
                switch (i3) {
                    case 0:
                        if (this.f110e[i].f708f == 9728.0f) {
                            return;
                        } else {
                            this.f110e[i].f708f = 9728.0f;
                        }
                        break;
                    case 1:
                        if (this.f110e[i].f708f == 9729.0f) {
                            return;
                        } else {
                            this.f110e[i].f708f = 9729.0f;
                        }
                        break;
                    case 2:
                        if (this.f110e[i].f708f == 9984.0f) {
                            return;
                        } else {
                            this.f110e[i].f708f = 9984.0f;
                        }
                        break;
                    case 3:
                        if (this.f110e[i].f708f == 9985.0f) {
                            return;
                        } else {
                            this.f110e[i].f708f = 9985.0f;
                        }
                        break;
                    case 4:
                        if (this.f110e[i].f708f == 9986.0f) {
                            return;
                        } else {
                            this.f110e[i].f708f = 9986.0f;
                        }
                        break;
                    case 5:
                        if (this.f110e[i].f708f == 9987.0f) {
                            return;
                        } else {
                            this.f110e[i].f708f = 9987.0f;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                break;
            case 1:
                switch (i3) {
                    case 0:
                        if (this.f110e[i].f709g == 9728.0f) {
                            return;
                        } else {
                            this.f110e[i].f709g = 9728.0f;
                        }
                        break;
                    case 1:
                        if (this.f110e[i].f709g == 9729.0f) {
                            return;
                        } else {
                            this.f110e[i].f709g = 9729.0f;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                break;
            default:
                throw new IllegalArgumentException();
        }
        this.f113p[i] = true;
        this.f110e[i].f717o = true;
    }

    public final void setTextureHint(int i, boolean z) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f716n = z;
    }

    public final void setTextureRefGid(int i, int i2) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (i2 == -1) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f711i = i2;
        this.f113p[i] = true;
    }

    public final void setTextureType(int i, int i2) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 > 4) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f705c = i2;
        this.f113p[i] = true;
    }

    public final void setTextureWrapMode(int i, int i2, int i3) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 > 1) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 1) {
            throw new IllegalArgumentException();
        }
        if (this.f110e[i].f706d == ((byte) i2) && this.f110e[i].f707e == ((byte) i3)) {
            return;
        }
        this.f110e[i].f706d = (byte) i2;
        this.f110e[i].f707e = (byte) i3;
        this.f113p[i] = true;
        this.f110e[i].f717o = true;
    }

    public final void setTransform(int i, Transform transform) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        Transform.m251e(this.f110e[i].f712j.f960a, transform);
        this.f110e[i].f712j.f965f = true;
        this.f113p[i] = true;
    }

    public final void setTranslate(int i, Vector3D vector3D) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        this.f110e[i].f712j.f960a.setTranslate(vector3D.f516a, vector3D.f517b, vector3D.f518c);
        this.f110e[i].f712j.f965f = true;
        this.f113p[i] = true;
    }

    public final void setUserData(int i, int i2) {
        if (i < 0 || i >= 64) {
            throw new IllegalArgumentException();
        }
        if (this.f114v == null) {
            this.f114v = new int[64];
        }
        this.f114v[i] = i2;
    }
}
