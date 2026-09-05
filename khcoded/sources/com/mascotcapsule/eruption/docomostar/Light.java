package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import p000.GameCommon;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Light extends Animatable implements NodeDeformerNode {
    public static final int Type_AMBIENT = 0;
    public static final int Type_DIRECTION = 1;
    public static final int Type_NONE = -1;
    public static final int Type_OMNI = 2;
    public static final int Type_SPOT = 3;

    /* JADX INFO: renamed from: t */
    private static final Vector3D f356t = new Vector3D();

    /* JADX INFO: renamed from: u */
    private static final Vector3D f357u = new Vector3D();

    /* JADX INFO: renamed from: v */
    private static final Vector3D f358v = new Vector3D();

    /* JADX INFO: renamed from: w */
    private static final float[] f359w = new float[3];

    /* JADX INFO: renamed from: x */
    private static final Transform f360x = new Transform();

    /* JADX INFO: renamed from: A */
    private NodeDeformerNode f361A;

    /* JADX INFO: renamed from: B */
    private Transform f362B;

    /* JADX INFO: renamed from: c */
    int f363c;

    /* JADX INFO: renamed from: d */
    float[] f364d;

    /* JADX INFO: renamed from: e */
    float f365e;

    /* JADX INFO: renamed from: f */
    float f366f;

    /* JADX INFO: renamed from: g */
    float f367g;

    /* JADX INFO: renamed from: p */
    float f368p;

    /* JADX INFO: renamed from: q */
    float f369q;

    /* JADX INFO: renamed from: r */
    Transform f370r;

    /* JADX INFO: renamed from: s */
    int f371s;

    /* JADX INFO: renamed from: y */
    private float[] f372y;

    /* JADX INFO: renamed from: z */
    private float f373z;

    public Light(int i) {
        super(16);
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException();
        }
        mo3a();
        this.f363c = i;
        if (i == 3) {
            this.f368p = 0.125f;
            this.f369q = 0.0f;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    final Transform m174a(TransformTree transformTree) throws IllegalStateException {
        if (this.f361A == null || this.f363c != 3) {
            return transformTree.m284b(this.f406n);
        }
        if (((Object3D) this.f361A).f404l == null || ((Object3D) this.f361A).f404l.f394g == null) {
            throw new IllegalStateException();
        }
        transformTree.m284b(this.f406n).m262a(f356t, f357u);
        ((Object3D) this.f361A).f404l.f394g.m284b(((Object3D) this.f361A).f406n).m262a(f356t, f358v);
        f358v.f516a = f357u.f516a - f358v.f516a;
        f358v.f517b = f357u.f517b - f358v.f517b;
        f358v.f518c = f357u.f518c - f358v.f518c;
        f358v.normalize(f358v);
        f359w[0] = f358v.f516a;
        f359w[1] = f358v.f517b;
        f359w[2] = f358v.f518c;
        this.f362B.m273c(f359w);
        float[] fArr = this.f362B.f494b.m;
        fArr[12] = f357u.f516a;
        fArr[13] = f357u.f517b;
        fArr[14] = f357u.f518c;
        return this.f362B;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo3a() {
        super.mo3a();
        this.f372y = new float[3];
        this.f364d = new float[4];
        this.f363c = 0;
        Util3D.m291a(this.f372y, GameCommon.K_ANY);
        Util3D.m296b(this.f364d, -1);
        this.f373z = 1.0f;
        this.f365e = 1.0f;
        this.f366f = 0.0f;
        this.f367g = 0.0f;
        this.f368p = 1.0f;
        this.f369q = 0.0f;
        this.f362B = new Transform();
        this.f370r = new Transform();
        this.f371s = -1;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo4a(Action action) {
        if (action.f84c != 3) {
            throw new IllegalArgumentException();
        }
        if (((this.f363c == 0 || this.f363c == 1) && action.f85d.length != 2) || ((this.f363c == 2 && action.f85d.length != 3) || (this.f363c == 3 && action.f85d.length != 4))) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo5a(ActionController actionController) {
        if (((this.f363c == 0 || this.f363c == 1) && actionController.f90c != 2) || ((this.f363c == 2 && actionController.f90c != 3) || (this.f363c == 3 && actionController.f90c != 4))) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m175a(Vector3D vector3D, Vector3D vector3D2) {
        if (this.f363c == 1) {
            vector3D.f517b = 0.0f;
            vector3D.f516a = 0.0f;
            vector3D.f518c = 1.0f;
            f360x.setIdentity();
            Transform.m252f(f360x, this.f370r);
            f360x.transPosition(vector3D);
        } else {
            vector3D.f516a = this.f370r.f494b.m[12] - vector3D2.f516a;
            vector3D.f517b = this.f370r.f494b.m[13] - vector3D2.f517b;
            vector3D.f518c = this.f370r.f494b.m[14] - vector3D2.f518c;
        }
        vector3D.normalize(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo6a(C0097do c0097do, float f) {
        boolean z;
        char c;
        C0019ar[] c0019arArr = c0097do.f895a.f85d;
        float[] fArr = {0.0f, 0.0f, 0.0f};
        if (!c0019arArr[0].m410a(f, c0097do.f899e, c0097do.f897c[0], fArr) || (this.f372y[0] == fArr[0] && this.f372y[1] == fArr[1] && this.f372y[2] == fArr[2])) {
            z = false;
        } else {
            this.f372y[0] = fArr[0];
            this.f372y[1] = fArr[1];
            this.f372y[2] = fArr[2];
            z = true;
        }
        if (c0019arArr[1].m410a(f, c0097do.f899e, c0097do.f897c[1], fArr) && this.f373z != fArr[0]) {
            this.f373z = fArr[0];
            z = true;
        }
        if (z) {
            this.f364d[0] = this.f372y[0] * this.f373z;
            this.f364d[1] = this.f372y[1] * this.f373z;
            this.f364d[2] = this.f372y[2] * this.f373z;
        }
        if (this.f363c == 2 || this.f363c == 3) {
            if (c0019arArr[2].m410a(f, c0097do.f899e, c0097do.f897c[2], fArr) && (this.f365e != fArr[0] || this.f366f != fArr[1] || this.f367g != fArr[3])) {
                this.f365e = fArr[0];
                this.f366f = fArr[1];
                this.f367g = fArr[2];
            }
            c = 3;
        } else {
            c = 2;
        }
        if (this.f363c == 3 && c0019arArr[c].m410a(f, c0097do.f899e, c0097do.f897c[c], fArr)) {
            if (this.f368p == fArr[0] && this.f369q == fArr[1]) {
                return;
            }
            this.f368p = fArr[0];
            this.f369q = fArr[1];
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo7a(C0019ar[][] c0019arArr, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, int i) {
        boolean z = false;
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 0, f96a) && (this.f372y[0] != f96a[0] || this.f372y[1] != f96a[1] || this.f372y[2] != f96a[2])) {
            this.f372y[0] = f96a[0];
            this.f372y[1] = f96a[1];
            this.f372y[2] = f96a[2];
            z = true;
        }
        if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 1, f96a) && this.f373z != f96a[0]) {
            this.f373z = f96a[0];
            z = true;
        }
        if (z) {
            this.f364d[0] = this.f372y[0] * this.f373z;
            this.f364d[1] = this.f372y[1] * this.f373z;
            this.f364d[2] = this.f372y[2] * this.f373z;
        }
        int i2 = 2;
        if (this.f363c == 2 || this.f363c == 3) {
            if (C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, 2, f96a) && (this.f365e != f96a[0] || this.f366f != f96a[1] || this.f367g != f96a[3])) {
                this.f365e = f96a[0];
                this.f366f = f96a[1];
                this.f367g = f96a[2];
                if (this.f365e < 0.0f) {
                    this.f365e = 0.0f;
                }
                if (this.f366f < 0.0f) {
                    this.f366f = 0.0f;
                }
                if (this.f367g < 0.0f) {
                    this.f367g = 0.0f;
                }
                if (this.f365e == 0.0f && this.f366f == 0.0f && this.f367g == 0.0f) {
                    this.f365e = 1.0f;
                }
            }
            i2 = 3;
        }
        if (this.f363c == 3 && C0019ar.m409a(c0019arArr, fArr, c0033beArr, fArr2, i, i2, f96a)) {
            if (this.f368p == f96a[0] && this.f369q == f96a[1]) {
                return;
            }
            this.f368p = f96a[0];
            this.f369q = f96a[1];
            if (this.f368p < 0.0f) {
                this.f368p = 0.0f;
            } else if (0.25f < this.f368p) {
                this.f368p = 0.25f;
            }
            if (this.f369q < 0.0f) {
                this.f369q = 0.0f;
            } else if (128.0f < this.f369q) {
                this.f369q = 128.0f;
            }
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void addSiblingNode(NodeDeformerNode nodeDeformerNode, Transform transform) {
        super.m223a(nodeDeformerNode, transform);
    }

    public final float getAttenuationConstant() {
        return this.f365e;
    }

    public final float getAttenuationLinear() {
        return this.f366f;
    }

    public final float getAttenuationQuadratic() {
        return this.f367g;
    }

    public final int getColor() {
        return Util3D.m290a(this.f372y);
    }

    public final float getIntensity() {
        return this.f373z;
    }

    public final int getLightType() {
        return this.f363c;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final NodeDeformer getParent() {
        return this.f404l;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final int getParentIndex() {
        return this.f405m;
    }

    public final float getSpotCutoff() {
        return this.f368p;
    }

    public final float getSpotExponent() {
        return this.f369q;
    }

    public final NodeDeformerNode getTargetObject3D() {
        return this.f361A;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void getToWorldTransform(Transform transform) {
        super.m224a(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void getTransform(Transform transform) {
        super.m229c(transform);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void setAttenuation(float f, float f2, float f3) throws IllegalStateException {
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f363c != 2 && this.f363c != 3) {
            throw new IllegalStateException();
        }
        if (this.f365e == f && this.f366f == f2 && this.f367g == f3) {
            return;
        }
        this.f365e = f;
        this.f366f = f2;
        this.f367g = f3;
    }

    public final void setColor(int i) {
        if (Util3D.m290a(this.f372y) != i) {
            Util3D.m291a(this.f372y, i);
            this.f364d[0] = this.f372y[0] * this.f373z;
            this.f364d[1] = this.f372y[1] * this.f373z;
            this.f364d[2] = this.f372y[2] * this.f373z;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setIdentity() {
        super.m230e();
    }

    public final void setIntensity(float f) {
        if (this.f373z != f) {
            this.f373z = f;
            this.f364d[0] = this.f372y[0] * this.f373z;
            this.f364d[1] = this.f372y[1] * this.f373z;
            this.f364d[2] = this.f372y[2] * this.f373z;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setRotateEuler(int i, Vector3D vector3D) {
        super.m222a(i, vector3D);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void setSpot(float f, float f2) throws IllegalStateException {
        if (f < 0.0f || f > 0.25f) {
            throw new IllegalArgumentException();
        }
        if (f2 < 0.0f || f2 > 128.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f363c != 3) {
            throw new IllegalStateException();
        }
        if (this.f368p == f && this.f369q == f2) {
            return;
        }
        this.f368p = f;
        this.f369q = f2;
    }

    public final void setTargetObject3D(NodeDeformerNode nodeDeformerNode) {
        if (nodeDeformerNode != null && !(nodeDeformerNode instanceof NodeDeformerNode)) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode == this) {
            throw new IllegalArgumentException();
        }
        this.f361A = nodeDeformerNode;
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
