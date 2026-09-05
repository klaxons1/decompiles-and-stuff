package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.m */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class C0114m extends AbstractC0101ds {

    /* JADX INFO: renamed from: d */
    private static InterfaceC0111j f968d = new C0071cp();

    /* JADX INFO: renamed from: e */
    private static InterfaceC0111j f969e = new C0088df();

    /* JADX INFO: renamed from: f */
    private static InterfaceC0111j f970f = new C0070co();

    /* JADX INFO: renamed from: a */
    float f971a;

    /* JADX INFO: renamed from: b */
    float f972b;

    /* JADX INFO: renamed from: c */
    float f973c;

    C0114m() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    void mo353a(int i, float f, float[] fArr) {
        super.mo353a(i, f, fArr);
        this.f971a = fArr[0];
        this.f972b = fArr[1];
        this.f973c = fArr[2];
        switch (i) {
            case 1:
                this.f914o = f968d;
                break;
            case 2:
                this.f914o = f969e;
                break;
            case 3:
                this.f914o = f970f;
                break;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    final void mo454a(float[] fArr) {
        fArr[0] = this.f971a;
        fArr[1] = this.f972b;
        fArr[2] = this.f973c;
    }
}
