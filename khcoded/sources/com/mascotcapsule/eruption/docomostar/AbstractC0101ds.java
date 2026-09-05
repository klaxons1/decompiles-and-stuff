package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ds */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
abstract class AbstractC0101ds {

    /* JADX INFO: renamed from: m */
    int f912m;

    /* JADX INFO: renamed from: n */
    float f913n;

    /* JADX INFO: renamed from: o */
    InterfaceC0111j f914o;

    AbstractC0101ds() {
    }

    /* JADX INFO: renamed from: a */
    final void m493a(float f, AbstractC0101ds abstractC0101ds, float[] fArr) {
        this.f914o.mo352a(f, this, abstractC0101ds, fArr);
    }

    /* JADX INFO: renamed from: a */
    void mo353a(int i, float f, float[] fArr) {
        this.f912m = i;
        this.f913n = f;
    }

    /* JADX INFO: renamed from: a */
    abstract void mo454a(float[] fArr);
}
