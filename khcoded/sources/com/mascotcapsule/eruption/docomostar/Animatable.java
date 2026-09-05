package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public abstract class Animatable extends Object3D {

    /* JADX INFO: renamed from: b */
    C0097do[] f101b;

    /* JADX INFO: renamed from: g */
    private int f102g;

    /* JADX INFO: renamed from: c */
    private static C0019ar[][] f97c = new C0019ar[4][];

    /* JADX INFO: renamed from: d */
    private static float[][] f98d = new float[4][];

    /* JADX INFO: renamed from: e */
    private static C0033be[][] f99e = new C0033be[4][];

    /* JADX INFO: renamed from: f */
    private static float[][] f100f = new float[4][];

    /* JADX INFO: renamed from: a */
    static float[] f96a = new float[4];

    Animatable(int i) {
        super(i);
        this.f102g = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m2a(int i, Action action) {
        C0097do c0097do = this.f101b[i];
        c0097do.f895a = null;
        c0097do.f898d = 0.0f;
        c0097do.f899e = 0.0f;
        c0097do.f900f = true;
        if (action == null) {
            c0097do.f897c = null;
            return;
        }
        C0019ar[] c0019arArr = action.f85d;
        C0033be[] c0033beArr = c0097do.f897c;
        c0097do.f895a = action;
        if (c0033beArr == null || c0033beArr.length != action.f85d.length) {
            c0033beArr = new C0033be[action.f85d.length];
            c0097do.f897c = c0033beArr;
        }
        for (int i2 = 0; i2 < c0033beArr.length; i2++) {
            C0033be c0033be = c0033beArr[i2];
            if (c0033be == null) {
                c0033be = new C0033be();
                c0033beArr[i2] = c0033be;
            }
            c0033be.f699a = 0.0f;
            if (c0033be.f700b == null || c0033be.f700b.length != c0019arArr[i2].f681a.length) {
                c0033be.f700b = new int[c0019arArr[i2].f681a.length];
            }
            for (int i3 = 0; i3 < c0033be.f700b.length; i3++) {
                c0033be.f700b[i3] = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025 A[PHI: r0
  0x0025: PHI (r0v2 int) = (r0v1 int), (r0v5 int), (r0v5 int) binds: [B:11:0x0014, B:13:0x0020, B:15:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x003c A[SYNTHETIC] */
    @Override // com.mascotcapsule.eruption.docomostar.Object3D
    /* JADX INFO: renamed from: a */
    int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        int iMo0a = super.mo0a(i, i2, object3DArr, i3);
        if (object3DArr == null || object3DArr.length > iMo0a) {
            for (int i4 = 0; i4 < 4; i4++) {
                if (this.f101b[i4].f895a != null) {
                    iMo0a = this.f101b[i4].f895a.mo0a(i, i2, object3DArr, iMo0a);
                    if (object3DArr != null && object3DArr.length <= iMo0a) {
                        break;
                    }
                    if (this.f101b[i4].f901g != null) {
                        iMo0a = this.f101b[i4].f901g.mo0a(i, i2, object3DArr, iMo0a);
                        if (object3DArr != null && object3DArr.length <= iMo0a) {
                            break;
                        }
                    }
                } else {
                    if (this.f101b[i4].f901g != null) {
                        iMo0a = this.f101b[i4].f901g.mo0a(i, i2, object3DArr, iMo0a);
                        if (object3DArr != null) {
                            continue;
                        }
                    }
                }
            }
        }
        return iMo0a;
    }

    /* JADX INFO: renamed from: a */
    void mo3a() {
        this.f101b = new C0097do[4];
        for (int i = 0; i < this.f101b.length; i++) {
            this.f101b[i] = new C0097do();
            this.f101b[i].f895a = null;
            this.f101b[i].f896b = -1;
            this.f101b[i].f897c = null;
            this.f101b[i].f898d = 0.0f;
            this.f101b[i].f899e = 0.0f;
            this.f101b[i].f900f = true;
            this.f101b[i].f901g = null;
        }
        this.f102g = 0;
    }

    /* JADX INFO: renamed from: a */
    abstract void mo4a(Action action);

    /* JADX INFO: renamed from: a */
    abstract void mo5a(ActionController actionController);

    /* JADX INFO: renamed from: a */
    abstract void mo6a(C0097do c0097do, float f);

    /* JADX INFO: renamed from: a */
    abstract void mo7a(C0019ar[][] c0019arArr, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, int i);

    /* JADX INFO: renamed from: b */
    final boolean m8b() {
        if (this.f101b[0].f895a == null) {
            return false;
        }
        if (this.f102g <= 0) {
            return this.f101b[0].f900f;
        }
        boolean z = false;
        for (int i = 0; i < this.f102g; i++) {
            if (this.f101b[i].f895a != null && this.f101b[i].f901g != null) {
                if (this.f101b[i].f901g.f91d) {
                    z = z ? true : this.f101b[i].f901g.f92e;
                } else if (this.f101b[0].f900f) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final Action getAction() {
        return getAction(0);
    }

    public final Action getAction(int i) {
        if (i < 0 || 4 <= i) {
            throw new IllegalArgumentException();
        }
        return this.f101b[i].f895a;
    }

    public final ActionController getActionController(int i) {
        if (i < 0 || 4 <= i) {
            throw new IllegalArgumentException();
        }
        return this.f101b[i].f901g;
    }

    public final float getFrame() {
        return this.f101b[0].f898d;
    }

    public final int getRefGid() {
        return this.f101b[0].f896b;
    }

    public final int getRefGid(int i) {
        if (i < 0 || 4 <= i) {
            throw new IllegalArgumentException();
        }
        return this.f101b[i].f896b;
    }

    public final void setAction(Action action) {
        setAction(action, 0);
    }

    public final void setAction(Action action, int i) {
        if (i < 0 || 4 <= i) {
            throw new IllegalArgumentException();
        }
        if (action != null) {
            mo4a(action);
        }
        m2a(i, action);
    }

    public final void setActionController(ActionController actionController, int i) {
        if (i < 0 || 4 <= i) {
            throw new IllegalArgumentException();
        }
        if (actionController != null) {
            mo5a(actionController);
        }
        this.f101b[i].f901g = actionController;
    }

    public final void setFrame(float f) {
        if (this.f101b[0].f895a != null) {
            if (this.f101b[0].f895a.f86e == 2) {
                if (this.f101b[0].f895a.f83b == 0.0f) {
                    f = 0.0f;
                } else if (this.f101b[0].f895a.f83b <= f) {
                    f -= this.f101b[0].f895a.f83b * ((int) (f / this.f101b[0].f895a.f83b));
                } else if (f < 0.0f) {
                    f = (f - (this.f101b[0].f895a.f83b * ((int) (f / this.f101b[0].f895a.f83b)))) + this.f101b[0].f895a.f83b;
                }
            }
            this.f101b[0].f898d = f;
            if (this.f101b[0].f898d != this.f101b[0].f899e) {
                this.f101b[0].f900f = true;
            }
        }
    }

    public final void setRefGid(int i) {
        this.f101b[0].f896b = i;
    }

    public final void setRefGid(int i, int i2) {
        if (i2 < 0 || 4 <= i2) {
            throw new IllegalArgumentException();
        }
        this.f101b[i2].f896b = i;
    }

    public final void setUseActionControllerNum(int i) {
        if (i < 0 || 4 < i) {
            throw new IllegalArgumentException();
        }
        this.f102g = i;
    }

    public final void updatePosture() {
        float f = this.f101b[0].f898d;
        if (this.f101b[0].f895a != null) {
            if (this.f102g <= 0) {
                mo6a(this.f101b[0], f);
                this.f101b[0].f900f = false;
            } else {
                int i = 0;
                for (int i2 = 0; i2 < this.f102g; i2++) {
                    try {
                        Action action = this.f101b[i2].f895a;
                        ActionController actionController = this.f101b[i2].f901g;
                        if (action != null && actionController != null) {
                            f97c[i2] = action.f85d;
                            f100f[i2] = actionController.f88a;
                            f98d[i2] = actionController.f89b;
                            f99e[i2] = this.f101b[i2].f897c;
                            if (!actionController.f91d) {
                                actionController.setFrameAll(f);
                            }
                            i++;
                            this.f101b[i2].f901g.f92e = false;
                            this.f101b[0].f900f = false;
                        }
                    } catch (Throwable th) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            f97c[i3] = null;
                            f100f[i3] = null;
                            f98d[i3] = null;
                            f99e[i3] = null;
                        }
                        throw th;
                    }
                }
                mo7a(f97c, f98d, f99e, f100f, i);
                for (int i4 = 0; i4 < 4; i4++) {
                    f97c[i4] = null;
                    f100f[i4] = null;
                    f98d[i4] = null;
                    f99e[i4] = null;
                }
            }
            this.f101b[0].f899e = f;
        }
    }
}
