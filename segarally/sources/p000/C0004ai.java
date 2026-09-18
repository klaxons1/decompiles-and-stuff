package p000;

/* JADX INFO: renamed from: ai */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0004ai extends C0003ah {
    private C0007ao Code;

    @Override // p000.C0003ah
    public final void Code() {
        int i = this.Code.f386Code;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0018be) this.Code.Code(i2)).mo16V();
        }
        this.Code.m42m();
        this.Code = null;
        super.Code();
    }

    @Override // p000.C0003ah
    public final void Code(float f, float f2, float f3, float f4) {
        super.Code(f, f2, f3, f4);
        this.Code = new C0007ao(false, false, false);
    }

    public final void Code(C0018be c0018be) {
        this.Code.Code((Object) c0018be);
        c0018be.f421Code = ((C0003ah) this).f374Code;
    }

    /* JADX INFO: renamed from: I */
    public final void m21I() {
        this.Code.m42m();
    }

    @Override // p000.C0003ah
    /* JADX INFO: renamed from: V */
    public final void mo20V() {
        int i = this.Code.f386Code;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0018be) this.Code.Code(i2)).mo17Z();
        }
        super.mo20V();
    }
}
