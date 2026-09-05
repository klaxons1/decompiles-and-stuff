package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public abstract class Object3D {
    public static final int ClassType_Action = 12;
    public static final int ClassType_ActionController = 17;
    public static final int ClassType_ActionTable = 13;
    public static final int ClassType_Appearance = 14;
    public static final int ClassType_Batch = 19;
    public static final int ClassType_Bone = 18;
    public static final int ClassType_BoneDeformer = 6;
    public static final int ClassType_Camera = 15;
    public static final int ClassType_EffectSource = 22;
    public static final int ClassType_Figure = 9;
    public static final int ClassType_GeometricShape = 20;
    public static final int ClassType_Graphics3D = 2;
    public static final int ClassType_IndexBuffer = 4;
    public static final int ClassType_Light = 16;
    public static final int ClassType_MorphDeformer = 8;
    public static final int ClassType_NodeDeformer = 7;
    public static final int ClassType_None = 0;
    public static final int ClassType_Num = 23;
    public static final int ClassType_Object3D = 1;
    public static final int ClassType_Particle = 21;
    public static final int ClassType_Texture = 10;
    public static final int ClassType_TextureTable = 11;
    public static final int ClassType_TransformTree = 5;
    public static final int ClassType_VertexBuffer = 3;

    /* JADX INFO: renamed from: a */
    private static Object3D[] f399a = new Object3D[1];

    /* JADX INFO: renamed from: h */
    final int f400h;

    /* JADX INFO: renamed from: i */
    int f401i;

    /* JADX INFO: renamed from: k */
    int f403k;

    /* JADX INFO: renamed from: l */
    NodeDeformer f404l;

    /* JADX INFO: renamed from: j */
    int f402j = -1;

    /* JADX INFO: renamed from: m */
    short f405m = -1;

    /* JADX INFO: renamed from: n */
    short f406n = -1;

    /* JADX INFO: renamed from: o */
    boolean f407o = true;

    Object3D(int i) {
        this.f400h = i;
    }

    /* JADX INFO: renamed from: a */
    int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        if (object3DArr != null && object3DArr.length <= i3) {
            return i3;
        }
        if (i == 1) {
            if (i2 == -1) {
                if (object3DArr != null) {
                    object3DArr[i3] = this;
                }
                return i3 + 1;
            }
            if (this.f402j != i2) {
                return i3;
            }
            if (object3DArr != null) {
                object3DArr[i3] = this;
            }
            return i3 + 1;
        }
        if (i2 == -1) {
            if (this.f400h != i) {
                return i3;
            }
            if (object3DArr != null) {
                object3DArr[i3] = this;
            }
            return i3 + 1;
        }
        if (this.f400h != i || this.f402j != i2) {
            return i3;
        }
        if (object3DArr != null) {
            object3DArr[i3] = this;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: a */
    final void m221a(int i) {
        this.f401i = i;
    }

    /* JADX INFO: renamed from: a */
    final void m222a(int i, Vector3D vector3D) {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.f394g.setRotateEuler(this.f406n, i, vector3D);
    }

    /* JADX INFO: renamed from: a */
    final void m223a(NodeDeformerNode nodeDeformerNode, Transform transform) {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.addNode(nodeDeformerNode, this.f406n, transform);
    }

    /* JADX INFO: renamed from: a */
    final void m224a(Transform transform) {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.f394g.getToWorldTransform(this.f406n, transform);
    }

    /* JADX INFO: renamed from: a */
    final void m225a(Vector3D vector3D) {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.f394g.setTranslate(this.f406n, vector3D);
    }

    /* JADX INFO: renamed from: a */
    final void m226a(boolean z) {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.setVisible(this.f405m, z);
    }

    /* JADX INFO: renamed from: b */
    final void m227b(Transform transform) {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.f394g.setTransform(this.f406n, transform);
    }

    /* JADX INFO: renamed from: b */
    final void m228b(Vector3D vector3D) {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.f394g.mulScale(this.f406n, vector3D);
    }

    /* JADX INFO: renamed from: c */
    final void m229c(Transform transform) {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.f394g.getTransform(this.f406n, transform);
    }

    /* JADX INFO: renamed from: e */
    final void m230e() {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.f394g.setIdentity(this.f406n);
    }

    /* JADX INFO: renamed from: f */
    final void m231f() {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        this.f404l.removeNode(this.f405m);
    }

    public final int findObject3D(int i, int i2, Object3D[] object3DArr) {
        if (i <= 0 || i >= 23) {
            return 0;
        }
        if (object3DArr == null || object3DArr.length != 0) {
            return mo0a(i, i2, object3DArr, 0);
        }
        return 0;
    }

    public final Object3D findObject3D(int i, int i2) {
        if (i <= 0 || i >= 23) {
            return null;
        }
        mo0a(i, i2, f399a, 0);
        Object3D object3D = f399a[0];
        f399a[0] = null;
        return object3D;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: g */
    final boolean m232g() throws IllegalStateException {
        if (this.f404l == null || this.f404l.f394g == null) {
            throw new IllegalStateException();
        }
        return this.f404l.isVisible(this.f405m);
    }

    public final int getClassType() {
        return this.f400h;
    }

    public final int getUserId() {
        return this.f402j;
    }

    public final boolean isRenderEnable() {
        return this.f407o;
    }

    public final void setRenderEnable(boolean z) {
        this.f407o = z;
    }

    public final void setUserId(int i) {
        this.f402j = i;
    }
}
