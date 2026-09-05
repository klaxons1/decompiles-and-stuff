package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import p000.GameCommon;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Camera extends Animatable implements NodeDeformerNode {
    public static final int FogType_EXPONENT = 2;
    public static final int FogType_LINEAR = 1;
    public static final int FogType_NONE = 0;
    public static final int Type_Frustum = 2;
    public static final int Type_Parallel = 0;
    public static final int Type_Perspective = 1;

    /* JADX INFO: renamed from: t */
    private static final Vector3D f164t = new Vector3D();

    /* JADX INFO: renamed from: u */
    private static final Vector3D f165u = new Vector3D();

    /* JADX INFO: renamed from: v */
    private static final Vector3D f166v = new Vector3D();

    /* JADX INFO: renamed from: w */
    private static final Vector3D f167w = new Vector3D();

    /* JADX INFO: renamed from: A */
    private int f168A;

    /* JADX INFO: renamed from: B */
    private int f169B;

    /* JADX INFO: renamed from: C */
    private float f170C;

    /* JADX INFO: renamed from: D */
    private float f171D;

    /* JADX INFO: renamed from: E */
    private float f172E;

    /* JADX INFO: renamed from: F */
    private float f173F;

    /* JADX INFO: renamed from: G */
    private NodeDeformerNode f174G;

    /* JADX INFO: renamed from: H */
    private NodeDeformerNode f175H;

    /* JADX INFO: renamed from: c */
    Transform f176c;

    /* JADX INFO: renamed from: d */
    Transform f177d;

    /* JADX INFO: renamed from: e */
    int f178e;

    /* JADX INFO: renamed from: f */
    float[] f179f;

    /* JADX INFO: renamed from: g */
    float f180g;

    /* JADX INFO: renamed from: p */
    float f181p;

    /* JADX INFO: renamed from: q */
    float f182q;

    /* JADX INFO: renamed from: r */
    boolean f183r;

    /* JADX INFO: renamed from: s */
    int f184s;

    /* JADX INFO: renamed from: x */
    private int f185x;

    /* JADX INFO: renamed from: y */
    private float f186y;

    /* JADX INFO: renamed from: z */
    private float f187z;

    public Camera() {
        super(15);
        mo3a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    final Transform m72a(TransformTree transformTree) throws IllegalStateException {
        if (this.f174G == null) {
            try {
                this.f177d.m266b(transformTree.m284b(this.f406n));
            } catch (Exception e) {
                throw new IllegalStateException();
            }
        } else {
            if (((Object3D) this.f174G).f404l == null || ((Object3D) this.f174G).f404l.f394g == null) {
                throw new IllegalStateException();
            }
            transformTree.m284b(this.f406n).m262a(f164t, f165u);
            ((Object3D) this.f174G).f404l.f394g.m284b(((Object3D) this.f174G).f406n).m262a(f164t, f166v);
            f166v.f516a -= f165u.f516a;
            f166v.f517b -= f165u.f517b;
            f166v.f518c -= f165u.f518c;
            if (this.f175H == null) {
                f167w.set(0.0f, 1.0f, 0.0f);
            } else {
                if (((Object3D) this.f175H).f404l == null || ((Object3D) this.f175H).f404l.f394g == null) {
                    throw new IllegalStateException();
                }
                ((Object3D) this.f175H).f404l.f394g.m284b(((Object3D) this.f175H).f406n).m262a(f164t, f167w);
                f167w.f516a -= f165u.f516a;
                f167w.f517b -= f165u.f517b;
                f167w.f518c -= f165u.f518c;
            }
            this.f177d.m263a(f165u, f166v, f167w);
        }
        return this.f177d;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo3a() {
        super.mo3a();
        this.f176c = new Transform();
        this.f177d = new Transform();
        setPerspectiveFov(1.0f, 0.125f, 1.0f, 2.0f);
        this.f172E = 0.0f;
        this.f173F = 0.0f;
        this.f178e = 0;
        this.f179f = new float[4];
        Util3D.m291a(this.f179f, GameCommon.K_ANY);
        this.f179f[3] = 1.0f;
        this.f180g = 1.0f;
        this.f181p = 0.0f;
        this.f182q = 1.0f;
        this.f183r = false;
        this.f184s = 0;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo4a(Action action) {
        if (action.f84c != 4) {
            throw new IllegalArgumentException();
        }
        if (action.f85d.length != 6) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo5a(ActionController actionController) {
        if (actionController.f90c != 6) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo6a(C0097do c0097do, float f) {
        boolean z;
        C0019ar[] c0019arArr = c0097do.f895a.f85d;
        float[] fArr = {0.0f, 0.0f};
        if (c0019arArr[0].m410a(f, c0097do.f899e, c0097do.f897c[0], fArr)) {
            this.f170C = fArr[0];
            this.f171D = fArr[1];
            z = true;
        } else {
            z = false;
        }
        if (c0019arArr[1].m410a(f, c0097do.f899e, c0097do.f897c[1], fArr)) {
            this.f178e = (int) fArr[0];
        }
        c0019arArr[2].m410a(f, c0097do.f899e, c0097do.f897c[2], this.f179f);
        if (c0019arArr[3].m410a(f, c0097do.f899e, c0097do.f897c[3], fArr)) {
            this.f180g = fArr[0];
        }
        if (c0019arArr[4].m410a(f, c0097do.f899e, c0097do.f897c[4], fArr)) {
            this.f181p = fArr[0];
            this.f182q = fArr[1];
        }
        if (c0019arArr[5].m410a(f, c0097do.f899e, c0097do.f897c[5], fArr)) {
            this.f186y = fArr[0];
            z = true;
        }
        if (z) {
            if (this.f185x == 0) {
                this.f176c.m257a(this.f168A, this.f169B, this.f170C, this.f171D);
            } else if (this.f185x == 1) {
                this.f176c.m254a(this.f187z, this.f186y, this.f170C, this.f171D);
            }
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo7a(C0019ar[][] c0019arArr, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, int i) {
        boolean z = false;
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 0, f96a)) {
            this.f170C = f96a[0];
            this.f171D = f96a[1];
            if (this.f170C <= 0.0f) {
                this.f170C = 1.0E-4f;
            }
            if (this.f171D <= 0.0f) {
                this.f171D = 1.0E-4f;
            }
            if (this.f171D < this.f170C) {
                float f = this.f171D;
                this.f171D = this.f170C;
                this.f170C = f;
            } else if (this.f170C == this.f171D) {
                this.f171D += 1.0E-4f;
            }
            z = true;
        }
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 1, f96a)) {
            this.f178e = (int) f96a[0];
            if (this.f178e < 1) {
                this.f178e = 1;
            } else if (2 < this.f178e) {
                this.f178e = 2;
            }
        }
        C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 2, this.f179f);
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 3, f96a)) {
            this.f180g = f96a[0];
        }
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 4, f96a)) {
            this.f181p = f96a[0];
            this.f182q = f96a[1];
        }
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 5, f96a)) {
            this.f186y = f96a[0];
            if (this.f186y <= 0.0f) {
                this.f186y = 1.0E-4f;
            } else if (0.5f <= this.f186y) {
                this.f186y = 0.4999f;
            }
            z = true;
        }
        if (z) {
            if (this.f185x == 0) {
                this.f176c.m257a(this.f168A, this.f169B, this.f170C, this.f171D);
            } else if (this.f185x == 1) {
                this.f176c.m254a(this.f187z, this.f186y, this.f170C, this.f171D);
            }
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void addSiblingNode(NodeDeformerNode nodeDeformerNode, Transform transform) {
        super.m223a(nodeDeformerNode, transform);
    }

    /* JADX INFO: renamed from: c */
    final boolean m73c() {
        return this.f184s > 0;
    }

    public final float getAngle() {
        return this.f186y;
    }

    public final float getAspect() {
        return this.f187z;
    }

    public final int getCameraType() {
        return this.f185x;
    }

    public final float getFar() {
        return this.f171D;
    }

    public final int getFogColor() {
        return Util3D.m290a(this.f179f);
    }

    public final float getFogDensity() {
        return this.f180g;
    }

    public final float getFogEnd() {
        return this.f182q;
    }

    public final boolean getFogHint() {
        return this.f183r;
    }

    public final float getFogStart() {
        return this.f181p;
    }

    public final int getFogType() {
        return this.f178e;
    }

    public final int getHeight() {
        return this.f169B;
    }

    public final float getNear() {
        return this.f170C;
    }

    public final float getOpticalCenterX() {
        return this.f172E;
    }

    public final float getOpticalCenterY() {
        return this.f173F;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final NodeDeformer getParent() {
        return this.f404l;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final int getParentIndex() {
        return this.f405m;
    }

    public final NodeDeformerNode getTargetObject3D() {
        return this.f174G;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void getToWorldTransform(Transform transform) {
        super.m224a(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void getTransform(Transform transform) {
        super.m229c(transform);
    }

    public final NodeDeformerNode getUpObject3D() {
        return this.f175H;
    }

    public final int getWidth() {
        return this.f168A;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final boolean isVisible() {
        return super.m232g();
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void mulScale(Vector3D vector3D) {
        super.m228b(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void removeFromParent() {
        super.m231f();
    }

    public final void setFogColor(int i) {
        Util3D.m291a(this.f179f, i);
    }

    public final void setFogDensity(float f) {
        this.f180g = f;
    }

    public final void setFogHint(boolean z) {
        this.f183r = z;
    }

    public final void setFogStartEnd(float f, float f2) {
        this.f181p = f;
        this.f182q = f2;
    }

    public final void setFogType(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException();
        }
        this.f178e = i;
    }

    public final void setFrustum(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f176c.m255a(f, f2, f3, f4, f5, f6);
        this.f185x = 2;
        this.f186y = 0.0f;
        this.f187z = 0.0f;
        this.f168A = 0;
        this.f169B = 0;
        this.f170C = f5;
        this.f171D = f6;
        this.f172E = 0.0f;
        this.f173F = 0.0f;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setIdentity() {
        super.m230e();
    }

    public final void setParallel(int i, int i2, float f, float f2) {
        this.f176c.m257a(i, i2, f, f2);
        this.f185x = 0;
        this.f186y = 0.0f;
        this.f187z = i / i2;
        this.f168A = i;
        this.f169B = i2;
        this.f170C = f;
        this.f171D = f2;
        this.f172E = 0.0f;
        this.f173F = 0.0f;
    }

    public final void setPerspectiveFov(float f, float f2, float f3, float f4) {
        this.f176c.m254a(f, f2, f3, f4);
        this.f185x = 1;
        this.f186y = f2;
        this.f187z = f;
        this.f168A = 0;
        this.f169B = 0;
        this.f170C = f3;
        this.f171D = f4;
        this.f172E = 0.0f;
        this.f173F = 0.0f;
    }

    public final void setPerspectiveFov(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * 0.5f;
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f2 <= 0.0f || f2 >= 0.5f) {
            throw new IllegalArgumentException();
        }
        if (f4 - f3 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f5 < -100.0f || f5 > 100.0f) {
            throw new IllegalArgumentException();
        }
        if (f6 < -100.0f || f6 > 100.0f) {
            throw new IllegalArgumentException();
        }
        float fSin = (Util3D.sin(f7) / Util3D.cos(f7)) * f3;
        float f8 = f * fSin;
        float f9 = fSin * 2.0f;
        float f10 = 2.0f * f8;
        float f11 = fSin + (f9 * f6);
        float f12 = f11 - f9;
        float f13 = f8 + (f10 * f5);
        this.f176c.m255a(f13 - f10, f13, f12, f11, f3, f4);
        this.f185x = 1;
        this.f186y = f2;
        this.f187z = f;
        this.f168A = 0;
        this.f169B = 0;
        this.f170C = f3;
        this.f171D = f4;
        this.f172E = f5;
        this.f173F = f6;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setRotateEuler(int i, Vector3D vector3D) {
        super.m222a(i, vector3D);
    }

    public final void setTargetAndUpObject3D(NodeDeformerNode nodeDeformerNode, NodeDeformerNode nodeDeformerNode2) {
        if (nodeDeformerNode != null && !(nodeDeformerNode instanceof NodeDeformerNode)) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode2 != null && !(nodeDeformerNode2 instanceof NodeDeformerNode)) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode == null && nodeDeformerNode2 != null) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode == this || nodeDeformerNode2 == this) {
            throw new IllegalArgumentException();
        }
        this.f174G = nodeDeformerNode;
        this.f175H = nodeDeformerNode2;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setTransform(Transform transform) {
        super.m227b(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setTranslate(Vector3D vector3D) {
        super.m225a(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setVisible(boolean z) {
        super.m226a(z);
    }
}
