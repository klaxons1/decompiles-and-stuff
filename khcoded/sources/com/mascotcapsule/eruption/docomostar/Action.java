package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public class Action extends Object3D {
    public static final int RepeatMode_CONSTANT = 1;
    public static final int RepeatMode_LOOP = 2;

    /* JADX INFO: renamed from: a */
    int f82a;

    /* JADX INFO: renamed from: b */
    float f83b;

    /* JADX INFO: renamed from: c */
    int f84c;

    /* JADX INFO: renamed from: d */
    C0019ar[] f85d;

    /* JADX INFO: renamed from: e */
    int f86e;

    /* JADX INFO: renamed from: f */
    ActionTable f87f;

    private Action() {
        super(12);
        this.f82a = -1;
        this.f83b = 0.0f;
        this.f84c = 0;
        this.f85d = null;
        this.f86e = 0;
    }

    Action(int i, int i2, int i3, float f) {
        super(12);
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        if (i2 <= 0 || i2 >= 7) {
            throw new IllegalArgumentException();
        }
        if (i3 <= 0 || i3 > 131068) {
            throw new IllegalArgumentException();
        }
        if (f < 0.0f) {
            throw new IllegalArgumentException();
        }
        this.f85d = new C0019ar[i3];
        this.f82a = i;
        this.f83b = f;
        this.f84c = i2;
        this.f86e = 1;
    }

    public final ActionTable getActionTable() {
        return this.f87f;
    }

    public final int getGid() {
        return this.f82a;
    }

    public final float getNumFrame() {
        return this.f83b;
    }
}
