package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cd */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0059cd {

    /* JADX INFO: renamed from: a */
    float[] f772a;

    /* JADX INFO: renamed from: b */
    int[] f773b;

    /* JADX INFO: renamed from: c */
    byte f774c;

    /* JADX INFO: renamed from: d */
    boolean f775d;

    C0059cd(int i) {
        this.f772a = new float[i];
        this.f773b = new int[i];
    }

    /* JADX INFO: renamed from: a */
    final void m449a(MorphDeformer morphDeformer) {
        for (int i = 0; i < morphDeformer.f380e.length; i++) {
            this.f772a[i] = morphDeformer.f380e[i];
            this.f773b[i] = morphDeformer.f381f[i];
        }
        this.f774c = morphDeformer.f384q;
    }
}
