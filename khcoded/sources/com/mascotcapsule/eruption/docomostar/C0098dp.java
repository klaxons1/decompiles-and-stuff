package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dp */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0098dp extends AbstractC0045bq {

    /* JADX INFO: renamed from: d */
    private C0039bk f902d = new C0039bk();

    /* JADX INFO: renamed from: e */
    private C0039bk f903e = new C0039bk();

    C0098dp() {
        this.f902d.m438a(6.2831855f, 0.0f);
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0045bq
    /* JADX INFO: renamed from: a */
    final void mo429a(float[] fArr) {
        float fM437a;
        float fM437a2 = this.f902d.m437a();
        if (this.f740c == 0) {
            fM437a = this.f739b.getX();
        } else {
            this.f903e.m438a(this.f739b.getX(), 0.0f);
            fM437a = this.f903e.m437a();
        }
        fArr[0] = this.f738a.getX() + (Util3D.cos(fM437a2) * fM437a);
        fArr[1] = this.f738a.getY();
        fArr[2] = (fM437a * Util3D.sin(fM437a2)) + this.f738a.getZ();
    }
}
