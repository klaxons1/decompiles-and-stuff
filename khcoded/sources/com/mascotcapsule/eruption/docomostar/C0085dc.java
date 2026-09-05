package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dc */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0085dc extends AbstractC0045bq {

    /* JADX INFO: renamed from: d */
    private C0039bk f850d = new C0039bk();

    /* JADX INFO: renamed from: e */
    private C0039bk f851e = new C0039bk();

    C0085dc() {
        this.f850d.m438a(6.2831855f, 0.0f);
        this.f851e.m438a(1.5707964f, -1.5707964f);
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0045bq
    /* JADX INFO: renamed from: a */
    final void mo429a(float[] fArr) {
        float fM437a = this.f851e.m437a();
        float fM437a2 = this.f850d.m437a();
        float x = this.f739b.getX();
        float fCos = Util3D.cos(fM437a) * x;
        fArr[0] = this.f738a.getX() + (Util3D.sin(fM437a2) * fCos);
        fArr[1] = (Util3D.sin(fM437a) * x) + this.f738a.getY();
        fArr[2] = (Util3D.cos(fM437a2) * fCos) + this.f738a.getZ();
    }
}
