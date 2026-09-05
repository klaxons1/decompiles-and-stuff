package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.f */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0107f implements InterfaceC0111j {
    C0107f() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0111j
    /* JADX INFO: renamed from: a */
    public final void mo352a(float f, AbstractC0101ds abstractC0101ds, AbstractC0101ds abstractC0101ds2, float[] fArr) {
        C0075ct c0075ct = (C0075ct) abstractC0101ds;
        C0075ct c0075ct2 = (C0075ct) abstractC0101ds2;
        float f2 = (f - abstractC0101ds.f913n) / (abstractC0101ds2.f913n - abstractC0101ds.f913n);
        fArr[0] = ((c0075ct2.f822e - c0075ct.f822e) * f2) + c0075ct.f822e;
        fArr[1] = c0075ct.f823f + ((c0075ct2.f823f - c0075ct.f823f) * f2);
    }
}
