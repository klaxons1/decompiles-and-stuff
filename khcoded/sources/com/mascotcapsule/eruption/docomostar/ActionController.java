package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public class ActionController extends Object3D {

    /* JADX INFO: renamed from: a */
    float[] f88a;

    /* JADX INFO: renamed from: b */
    float[] f89b;

    /* JADX INFO: renamed from: c */
    short f90c;

    /* JADX INFO: renamed from: d */
    boolean f91d;

    /* JADX INFO: renamed from: e */
    boolean f92e;

    /* JADX INFO: renamed from: f */
    private int f93f;

    /* JADX INFO: renamed from: g */
    private float f94g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionController(Action action) {
        super(17);
        if (action == null) {
            throw new NullPointerException();
        }
        this.f88a = null;
        this.f89b = null;
        this.f93f = 1;
        this.f90c = (short) 0;
        this.f91d = true;
        this.f92e = false;
        this.f90c = (short) action.f85d.length;
        this.f94g = action.f83b;
        this.f93f = action.f86e;
        this.f88a = new float[this.f90c];
        this.f89b = new float[this.f90c];
        for (int i = 0; i < this.f90c; i++) {
            this.f88a[i] = 1.0f;
            this.f89b[i] = 0.0f;
        }
    }

    public final void enableFrame(boolean z) {
        this.f91d = z;
    }

    public final int getRepeatMode() {
        return this.f93f;
    }

    public final void resetWeight() {
        setWeightAll(1.0f);
    }

    public final void setFrame(int i, float f) {
        if (i < 0 || this.f90c <= i) {
            throw new IllegalArgumentException();
        }
        if (this.f93f == 2) {
            if (this.f94g == 0.0f) {
                f = 0.0f;
            } else if (this.f94g <= f) {
                f -= this.f94g * ((int) (f / this.f94g));
            } else if (f < 0.0f) {
                f = (f - (this.f94g * ((int) (f / this.f94g)))) + this.f94g;
            }
        }
        this.f89b[i] = f;
        this.f92e = true;
    }

    public final void setFrameAll(float f) {
        if (this.f93f == 2) {
            if (this.f94g == 0.0f) {
                f = 0.0f;
            } else if (this.f94g <= f) {
                f -= this.f94g * ((int) (f / this.f94g));
            } else if (f < 0.0f) {
                f = (f - (this.f94g * ((int) (f / this.f94g)))) + this.f94g;
            }
        }
        for (int i = 0; i < this.f90c; i++) {
            this.f89b[i] = f;
        }
        this.f92e = true;
    }

    public final void setRepeatMode(int i) {
        if (i <= 0 || 3 <= i) {
            throw new IllegalArgumentException();
        }
        this.f93f = i;
    }

    public final void setWeight(int i, float f) {
        if (i < 0 || this.f90c <= i) {
            throw new IllegalArgumentException();
        }
        if (f < 0.0f) {
            throw new IllegalArgumentException();
        }
        this.f88a[i] = f;
    }

    public final void setWeightAll(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < this.f90c; i++) {
            this.f88a[i] = f;
        }
    }
}
