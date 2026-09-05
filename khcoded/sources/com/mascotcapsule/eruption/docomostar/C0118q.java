package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.q */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class C0118q extends AbstractC0101ds {

    /* JADX INFO: renamed from: e */
    private static InterfaceC0111j f1000e = new C0044bp();

    /* JADX INFO: renamed from: f */
    private static InterfaceC0111j f1001f = new C0029ba();

    /* JADX INFO: renamed from: g */
    private static InterfaceC0111j f1002g = new C0052bx();

    /* JADX INFO: renamed from: a */
    float f1003a;

    /* JADX INFO: renamed from: b */
    float f1004b;

    /* JADX INFO: renamed from: c */
    float f1005c;

    /* JADX INFO: renamed from: d */
    float f1006d;

    C0118q() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    void mo353a(int i, float f, float[] fArr) {
        super.mo353a(i, f, fArr);
        this.f1003a = fArr[0];
        this.f1004b = fArr[1];
        this.f1005c = fArr[2];
        this.f1006d = fArr[3];
        switch (i) {
            case 1:
                this.f914o = f1000e;
                break;
            case 2:
                this.f914o = f1001f;
                break;
            case 3:
                this.f914o = f1002g;
                break;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    final void mo454a(float[] fArr) {
        fArr[0] = this.f1003a;
        fArr[1] = this.f1004b;
        fArr[2] = this.f1005c;
        fArr[3] = this.f1006d;
    }
}
