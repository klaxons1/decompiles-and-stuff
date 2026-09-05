package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.v */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0123v implements InterfaceC0111j {
    C0123v() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0111j
    /* JADX INFO: renamed from: a */
    public final void mo352a(float f, AbstractC0101ds abstractC0101ds, AbstractC0101ds abstractC0101ds2, float[] fArr) {
        C0038bj c0038bj = (C0038bj) abstractC0101ds;
        C0054bz c0054bz = (C0054bz) abstractC0101ds2;
        float f2 = (f - c0038bj.f913n) / (c0054bz.f913n - c0038bj.f913n);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        float f5 = ((f4 * 2.0f) - (3.0f * f3)) + 1.0f;
        float f6 = ((-2.0f) * f4) + (3.0f * f3);
        float f7 = f2 + (f4 - (f3 * 2.0f));
        float f8 = f4 - f3;
        fArr[0] = (c0038bj.f822e * f5) + (c0054bz.f822e * f6) + (c0038bj.f726a * f7) + (c0054bz.f764c * f8);
        fArr[1] = (f7 * c0038bj.f727b) + (f5 * c0038bj.f823f) + (f6 * c0054bz.f823f) + (f8 * c0054bz.f765d);
    }
}
