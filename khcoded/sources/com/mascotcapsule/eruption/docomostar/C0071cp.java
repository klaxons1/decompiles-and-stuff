package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cp */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0071cp implements InterfaceC0111j {
    C0071cp() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0111j
    /* JADX INFO: renamed from: a */
    public final void mo352a(float f, AbstractC0101ds abstractC0101ds, AbstractC0101ds abstractC0101ds2, float[] fArr) {
        C0114m c0114m = (C0114m) abstractC0101ds;
        C0114m c0114m2 = (C0114m) abstractC0101ds2;
        float f2 = (f - abstractC0101ds.f913n) / (abstractC0101ds2.f913n - abstractC0101ds.f913n);
        fArr[0] = ((c0114m2.f971a - c0114m.f971a) * f2) + c0114m.f971a;
        fArr[1] = ((c0114m2.f972b - c0114m.f972b) * f2) + c0114m.f972b;
        fArr[2] = c0114m.f973c + ((c0114m2.f973c - c0114m.f973c) * f2);
    }
}
