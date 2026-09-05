package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cx */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0079cx extends AbstractC0045bq {

    /* JADX INFO: renamed from: d */
    private final int[][] f834d = {new int[]{0, 1, 2}, new int[]{2, 1, 0}, new int[]{0, 1, 2}, new int[]{2, 1, 0}, new int[]{0, 2, 1}, new int[]{0, 2, 1}};

    /* JADX INFO: renamed from: e */
    private final float[] f835e = {0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f};

    /* JADX INFO: renamed from: f */
    private C0039bk f836f = new C0039bk();

    /* JADX INFO: renamed from: g */
    private C0039bk f837g = new C0039bk();

    /* JADX INFO: renamed from: h */
    private C0039bk f838h = new C0039bk();

    C0079cx() {
        this.f836f.m438a(0.5f, -0.5f);
        this.f837g.m438a(0.5f, -0.5f);
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0045bq
    /* JADX INFO: renamed from: a */
    final void mo429a(float[] fArr) {
        float fM437a = this.f836f.m437a();
        float fM437a2 = this.f837g.m437a();
        int iM436a = C0039bk.m436a(this.f834d.length);
        fArr[0] = this.f739b.getX();
        fArr[1] = this.f739b.getY();
        fArr[2] = this.f739b.getZ();
        int i = this.f834d[iM436a][0];
        fArr[i] = fM437a * fArr[i];
        int i2 = this.f834d[iM436a][1];
        fArr[i2] = fM437a2 * fArr[i2];
        int i3 = this.f834d[iM436a][2];
        fArr[i3] = fArr[i3] * this.f835e[iM436a];
        fArr[0] = fArr[0] + this.f738a.getX();
        fArr[1] = fArr[1] + this.f738a.getY();
        fArr[2] = fArr[2] + this.f738a.getZ();
    }
}
