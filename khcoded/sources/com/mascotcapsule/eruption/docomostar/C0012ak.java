package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ak */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0012ak {

    /* JADX INFO: renamed from: a */
    private int f639a;

    /* JADX INFO: renamed from: b */
    private C0100dr[] f640b;

    C0012ak(int i) {
        this.f640b = new C0100dr[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f640b[i2] = new C0100dr();
        }
        this.f639a = i;
    }

    /* JADX INFO: renamed from: a */
    final float m396a(int i) {
        return this.f640b[i].f907a;
    }

    /* JADX INFO: renamed from: a */
    final float m397a(int i, float f) {
        return this.f640b[i].m491a(f);
    }

    /* JADX INFO: renamed from: a */
    final void m398a(C0080cy c0080cy, C0080cy c0080cy2, C0080cy c0080cy3, float[] fArr, float[] fArr2) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f639a) {
                return;
            }
            this.f640b[i2].m492a(c0080cy.m479a(i2), c0080cy2.m479a(i2), c0080cy3.m479a(i2), fArr[i2], fArr2[i2]);
            i = i2 + 1;
        }
    }
}
