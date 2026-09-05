package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ae */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0006ae {

    /* JADX INFO: renamed from: a */
    final IndexBuffer f561a;

    /* JADX INFO: renamed from: b */
    final short[][] f562b = new short[8][];

    C0006ae(IndexBuffer indexBuffer, int[] iArr) {
        this.f561a = indexBuffer;
        for (int i = 0; i <= 7; i++) {
            if (iArr[i] > 0) {
                this.f562b[i] = new short[iArr[i]];
            }
        }
    }
}
