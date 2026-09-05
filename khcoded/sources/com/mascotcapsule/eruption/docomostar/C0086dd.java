package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dd */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0086dd {

    /* JADX INFO: renamed from: a */
    float[] f852a = new float[4];

    /* JADX INFO: renamed from: b */
    float[] f853b;

    /* JADX INFO: renamed from: c */
    float[] f854c;

    /* JADX INFO: renamed from: d */
    float[] f855d;

    /* JADX INFO: renamed from: e */
    float f856e;

    /* JADX INFO: renamed from: f */
    boolean f857f;

    /* JADX INFO: renamed from: g */
    boolean f858g;

    C0086dd() {
        Util3D.m296b(this.f852a, 3355443);
        this.f853b = new float[4];
        Util3D.m296b(this.f853b, -3355444);
        this.f854c = new float[4];
        this.f855d = new float[4];
        this.f856e = 0.0f;
        this.f857f = false;
        this.f858g = false;
    }

    /* JADX INFO: renamed from: a */
    final void m481a(C0086dd c0086dd) {
        Util3D.m301d(this.f852a, c0086dd.f852a);
        Util3D.m301d(this.f853b, c0086dd.f853b);
        Util3D.m301d(this.f854c, c0086dd.f854c);
        Util3D.m301d(this.f855d, c0086dd.f855d);
        this.f856e = c0086dd.f856e;
        this.f857f = c0086dd.f857f;
        this.f858g = c0086dd.f858g;
    }
}
