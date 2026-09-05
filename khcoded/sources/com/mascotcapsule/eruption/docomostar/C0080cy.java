package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cy */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0080cy {

    /* JADX INFO: renamed from: a */
    private C0039bk[] f839a;

    C0080cy(int i) {
        this.f839a = new C0039bk[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f839a[i2] = new C0039bk();
        }
    }

    /* JADX INFO: renamed from: a */
    final float m479a(int i) {
        return this.f839a[i].m437a();
    }

    /* JADX INFO: renamed from: a */
    final void m480a(int i, float f, float f2) {
        this.f839a[i].m438a(f, f2);
    }
}
