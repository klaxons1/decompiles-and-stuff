package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.df */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0088df implements InterfaceC0111j {
    C0088df() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0111j
    /* JADX INFO: renamed from: a */
    public final void mo352a(float f, AbstractC0101ds abstractC0101ds, AbstractC0101ds abstractC0101ds2, float[] fArr) {
        C0048bt c0048bt = (C0048bt) abstractC0101ds;
        C0003ab c0003ab = (C0003ab) abstractC0101ds2;
        float f2 = (f - c0048bt.f913n) / (c0003ab.f913n - c0048bt.f913n);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        float f5 = ((f4 * 2.0f) - (3.0f * f3)) + 1.0f;
        float f6 = ((-2.0f) * f4) + (3.0f * f3);
        float f7 = f2 + (f4 - (f3 * 2.0f));
        float f8 = f4 - f3;
        fArr[0] = (c0048bt.f971a * f5) + (c0003ab.f971a * f6) + (c0048bt.f743g * f7) + (c0003ab.f554d * f8);
        fArr[1] = (c0048bt.f972b * f5) + (c0003ab.f972b * f6) + (c0048bt.f744h * f7) + (c0003ab.f555e * f8);
        fArr[2] = (f7 * c0048bt.f745i) + (f5 * c0048bt.f973c) + (f6 * c0003ab.f973c) + (f8 * c0003ab.f556f);
    }
}
