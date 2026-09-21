package p000;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0041m extends AbstractC0050v {

    /* JADX INFO: renamed from: a */
    public C0035g f485a;

    /* JADX INFO: renamed from: b */
    public C0005ae f486b;

    public C0041m(C0006af c0006af) {
        super(c0006af);
        this.f453I |= 4096;
        this.f486b = new C0005ae(this.f452H);
        m16a(this.f486b);
        this.f413p = C0031c.m209a(100);
        this.f412o = C0031c.m209a(100);
        this.f403B = this.f452H.f45a + 500;
        this.f533c = 8192;
    }

    /* JADX INFO: renamed from: a */
    public final void m304a(int i, int i2) {
        C0013am c0013amM99k = C0013am.m99k();
        C0000a c0000a = c0013amM99k.f123D[i];
        if (c0000a == null) {
            if (this.f485a.f446g == null) {
                mo19c();
                return;
            }
            c0000a = new C0000a(this.f452H, i2);
            c0013amM99k.f123D[i] = c0000a;
            c0000a.mo254a(c0013amM99k.f122C[i]);
            this.f452H.f47c.m16a((C0037i) c0000a);
        }
        if (c0000a.m4b(this)) {
        }
        mo19c();
    }

    /* JADX INFO: renamed from: a */
    public final void m305a(C0035g c0035g) {
        this.f485a = c0035g;
        this.f486b.m45a(this.f485a.f441b);
        this.f486b.mo251a(0, 0, this.f485a.f448i);
        m253a(this.f485a.f449j);
        this.f535e = this.f485a.f448i;
    }

    @Override // p000.C0032d
    /* JADX INFO: renamed from: d */
    public final void mo29d() {
    }

    @Override // p000.AbstractC0050v
    /* JADX INFO: renamed from: f */
    public final void mo200f(C0025ay c0025ay) {
        ((C0003ac) this.f451G).m32n();
    }
}
