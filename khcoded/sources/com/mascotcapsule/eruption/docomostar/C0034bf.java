package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bf */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0034bf extends AbstractC0045bq {

    /* JADX INFO: renamed from: d */
    private C0039bk f701d = new C0039bk();

    C0034bf() {
        this.f701d.m438a(0.5f, -0.5f);
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0045bq
    /* JADX INFO: renamed from: a */
    final void mo429a(float[] fArr) {
        float fM437a = this.f701d.m437a();
        fArr[0] = this.f738a.getX() + (this.f739b.getX() * fM437a);
        fArr[1] = this.f738a.getY() + (this.f739b.getY() * fM437a);
        fArr[2] = (fM437a * this.f739b.getZ()) + this.f738a.getZ();
    }
}
