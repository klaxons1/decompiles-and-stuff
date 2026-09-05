package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ba */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0029ba implements InterfaceC0111j {
    C0029ba() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0111j
    /* JADX INFO: renamed from: a */
    public final void mo352a(float f, AbstractC0101ds abstractC0101ds, AbstractC0101ds abstractC0101ds2, float[] fArr) {
        C0030bb c0030bb = (C0030bb) abstractC0101ds;
        C0008ag c0008ag = (C0008ag) abstractC0101ds2;
        float f2 = (f - c0030bb.f913n) / (c0008ag.f913n - c0030bb.f913n);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        float f5 = ((f4 * 2.0f) - (3.0f * f3)) + 1.0f;
        float f6 = ((-2.0f) * f4) + (3.0f * f3);
        float f7 = f2 + (f4 - (f3 * 2.0f));
        float f8 = f4 - f3;
        fArr[0] = (c0030bb.f1003a * f5) + (c0008ag.f1003a * f6) + (c0030bb.f692i * f7) + (c0008ag.f569e * f8);
        fArr[1] = (c0030bb.f1004b * f5) + (c0008ag.f1004b * f6) + (c0030bb.f693j * f7) + (c0008ag.f570f * f8);
        fArr[2] = (c0030bb.f1005c * f5) + (c0008ag.f1005c * f6) + (c0030bb.f694k * f7) + (c0008ag.f571g * f8);
        fArr[3] = (f7 * c0030bb.f695l) + (f5 * c0030bb.f1006d) + (f6 * c0008ag.f1006d) + (f8 * c0008ag.f572h);
    }
}
