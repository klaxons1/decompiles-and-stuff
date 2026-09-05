package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dr */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0100dr {

    /* JADX INFO: renamed from: b */
    private float f908b = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f909c = 0.0f;

    /* JADX INFO: renamed from: d */
    private float f910d = 0.0f;

    /* JADX INFO: renamed from: e */
    private float f911e = 0.0f;

    /* JADX INFO: renamed from: a */
    float f907a = 0.0f;

    C0100dr() {
    }

    /* JADX INFO: renamed from: a */
    final float m491a(float f) {
        this.f908b += this.f909c * f;
        this.f907a += this.f908b * f;
        if (this.f907a > this.f910d) {
            this.f907a = this.f910d;
        } else if (this.f907a < this.f911e) {
            this.f907a = this.f911e;
        }
        return this.f907a;
    }

    /* JADX INFO: renamed from: a */
    final void m492a(float f, float f2, float f3, float f4, float f5) {
        this.f907a = f;
        this.f908b = f2;
        this.f909c = f3;
        this.f910d = f4;
        this.f911e = f5;
    }
}
