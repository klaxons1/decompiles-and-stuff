package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dq */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0099dq extends AbstractC0045bq {

    /* JADX INFO: renamed from: d */
    private C0039bk f904d = new C0039bk();

    /* JADX INFO: renamed from: e */
    private C0039bk f905e = new C0039bk();

    /* JADX INFO: renamed from: f */
    private final float[][] f906f = {new float[]{1.0f, 0.0f}, new float[]{0.0f, -1.0f}, new float[]{-1.0f, 0.0f}, new float[]{0.0f, 1.0f}};

    C0099dq() {
        this.f904d.m438a(0.5f, -0.5f);
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0045bq
    /* JADX INFO: renamed from: a */
    final void mo429a(float[] fArr) {
        float fM437a;
        float fM437a2;
        if (this.f740c == 1) {
            this.f905e.m438a(0.5f, -0.5f);
            fM437a = this.f904d.m437a();
            fM437a2 = this.f905e.m437a();
        } else {
            float fM437a3 = this.f904d.m437a();
            int iM436a = C0039bk.m436a(this.f906f.length);
            fM437a = this.f906f[iM436a][0] * fM437a3;
            fM437a2 = fM437a3 * this.f906f[iM436a][1];
            if (fM437a == 0.0f) {
                fM437a = this.f906f[iM436a][1] * 0.5f;
            }
            if (fM437a2 == 0.0f) {
                fM437a2 = this.f906f[iM436a][0] * 0.5f;
            }
        }
        fArr[0] = (fM437a * this.f739b.getX()) + this.f738a.getX();
        fArr[1] = this.f738a.getY();
        fArr[2] = (fM437a2 * this.f739b.getY()) + this.f738a.getZ();
    }
}
