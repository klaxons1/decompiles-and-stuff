package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.aj */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0011aj implements InterfaceC0111j {
    C0011aj() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0111j
    /* JADX INFO: renamed from: a */
    public final void mo352a(float f, AbstractC0101ds abstractC0101ds, AbstractC0101ds abstractC0101ds2, float[] fArr) {
        C0035bg c0035bg = (C0035bg) abstractC0101ds;
        C0031bc c0031bc = (C0031bc) abstractC0101ds2;
        float f2 = (f - c0035bg.f913n) / (c0031bc.f913n - c0035bg.f913n);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        float f5 = ((((f4 * 2.0f) - (3.0f * f3)) + 1.0f) * c0035bg.f881c) + ((((-2.0f) * f4) + (3.0f * f3)) * c0031bc.f881c);
        fArr[0] = ((f2 + (f4 - (f3 * 2.0f))) * c0035bg.f702b) + f5 + ((f4 - f3) * c0031bc.f696a);
    }
}
