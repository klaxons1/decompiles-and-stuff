package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ay */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0026ay implements InterfaceC0111j {
    C0026ay() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0111j
    /* JADX INFO: renamed from: a */
    public final void mo352a(float f, AbstractC0101ds abstractC0101ds, AbstractC0101ds abstractC0101ds2, float[] fArr) {
        C0093dk c0093dk = (C0093dk) abstractC0101ds;
        float f2 = (f - abstractC0101ds.f913n) / (abstractC0101ds2.f913n - abstractC0101ds.f913n);
        fArr[0] = c0093dk.f881c + ((((C0093dk) abstractC0101ds2).f881c - c0093dk.f881c) * f2);
    }
}
