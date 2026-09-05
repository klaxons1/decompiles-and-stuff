package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ct */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class C0075ct extends AbstractC0101ds {

    /* JADX INFO: renamed from: a */
    private static InterfaceC0111j f819a = new C0107f();

    /* JADX INFO: renamed from: b */
    private static InterfaceC0111j f820b = new C0123v();

    /* JADX INFO: renamed from: c */
    private static InterfaceC0111j f821c = new C0112k();

    /* JADX INFO: renamed from: e */
    float f822e;

    /* JADX INFO: renamed from: f */
    float f823f;

    C0075ct() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    void mo353a(int i, float f, float[] fArr) {
        super.mo353a(i, f, fArr);
        this.f822e = fArr[0];
        this.f823f = fArr[1];
        switch (i) {
            case 1:
                this.f914o = f819a;
                break;
            case 2:
                this.f914o = f820b;
                break;
            case 3:
                this.f914o = f821c;
                break;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    final void mo454a(float[] fArr) {
        fArr[0] = this.f822e;
        fArr[1] = this.f823f;
    }
}
