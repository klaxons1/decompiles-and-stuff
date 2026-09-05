package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bp */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0044bp implements InterfaceC0111j {
    C0044bp() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0111j
    /* JADX INFO: renamed from: a */
    public final void mo352a(float f, AbstractC0101ds abstractC0101ds, AbstractC0101ds abstractC0101ds2, float[] fArr) {
        C0118q c0118q = (C0118q) abstractC0101ds;
        C0118q c0118q2 = (C0118q) abstractC0101ds2;
        float f2 = (f - abstractC0101ds.f913n) / (abstractC0101ds2.f913n - abstractC0101ds.f913n);
        fArr[0] = ((c0118q2.f1003a - c0118q.f1003a) * f2) + c0118q.f1003a;
        fArr[1] = ((c0118q2.f1004b - c0118q.f1004b) * f2) + c0118q.f1004b;
        fArr[2] = ((c0118q2.f1005c - c0118q.f1005c) * f2) + c0118q.f1005c;
        fArr[3] = c0118q.f1006d + ((c0118q2.f1006d - c0118q.f1006d) * f2);
    }
}
