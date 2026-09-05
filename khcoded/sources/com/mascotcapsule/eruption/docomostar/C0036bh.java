package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bh */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0036bh {

    /* JADX INFO: renamed from: a */
    int f703a = 0;

    /* JADX INFO: renamed from: b */
    float[] f704b = new float[4];

    /* JADX INFO: renamed from: c */
    int f705c;

    /* JADX INFO: renamed from: d */
    byte f706d;

    /* JADX INFO: renamed from: e */
    byte f707e;

    /* JADX INFO: renamed from: f */
    float f708f;

    /* JADX INFO: renamed from: g */
    float f709g;

    /* JADX INFO: renamed from: h */
    float f710h;

    /* JADX INFO: renamed from: i */
    int f711i;

    /* JADX INFO: renamed from: j */
    C0113l f712j;

    /* JADX INFO: renamed from: k */
    Texture f713k;

    /* JADX INFO: renamed from: l */
    Light f714l;

    /* JADX INFO: renamed from: m */
    Camera f715m;

    /* JADX INFO: renamed from: n */
    boolean f716n;

    /* JADX INFO: renamed from: o */
    boolean f717o;

    C0036bh() {
        this.f704b[3] = 1.0f;
        this.f705c = 0;
        this.f706d = (byte) 0;
        this.f707e = (byte) 0;
        this.f708f = 9728.0f;
        this.f709g = 9728.0f;
        this.f710h = 1.0f;
        this.f711i = -1;
        this.f712j = new C0113l();
        this.f713k = null;
        this.f714l = null;
        this.f715m = null;
        this.f716n = false;
        this.f717o = true;
    }

    /* JADX INFO: renamed from: a */
    final void m430a(C0036bh c0036bh) {
        this.f703a = c0036bh.f703a;
        Util3D.m299c(this.f704b, c0036bh.f704b);
        this.f705c = c0036bh.f705c;
        this.f706d = c0036bh.f706d;
        this.f707e = c0036bh.f707e;
        this.f708f = c0036bh.f708f;
        this.f709g = c0036bh.f709g;
        this.f710h = c0036bh.f710h;
        Transform.m251e(this.f712j.f960a, c0036bh.f712j.f960a);
        this.f713k = c0036bh.f713k;
        this.f714l = c0036bh.f714l;
        this.f715m = c0036bh.f715m;
        this.f717o = c0036bh.f717o;
        this.f716n = c0036bh.f716n;
    }
}
