package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dk */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class C0093dk extends AbstractC0101ds {

    /* JADX INFO: renamed from: a */
    private static InterfaceC0111j f878a = new C0026ay();

    /* JADX INFO: renamed from: b */
    private static InterfaceC0111j f879b = new C0011aj();

    /* JADX INFO: renamed from: d */
    private static InterfaceC0111j f880d = new C0002aa();

    /* JADX INFO: renamed from: c */
    float f881c;

    C0093dk() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    void mo353a(int i, float f, float[] fArr) {
        super.mo353a(i, f, fArr);
        this.f881c = fArr[0];
        switch (i) {
            case 1:
                this.f914o = f878a;
                break;
            case 2:
                this.f914o = f879b;
                break;
            case 3:
                this.f914o = f880d;
                break;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    final void mo454a(float[] fArr) {
        fArr[0] = this.f881c;
    }
}
