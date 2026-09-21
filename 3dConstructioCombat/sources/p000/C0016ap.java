package p000;

/* JADX INFO: renamed from: ap */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0016ap extends C0002ab {

    /* JADX INFO: renamed from: a */
    public int f216a;

    /* JADX INFO: renamed from: b */
    public C0025ay f217b;

    /* JADX INFO: renamed from: c */
    public C0032d f218c;

    /* JADX INFO: renamed from: d */
    public C0025ay f219d;

    /* JADX INFO: renamed from: e */
    public C0025ay f220e;

    /* JADX INFO: renamed from: f */
    public int f221f;

    /* JADX INFO: renamed from: g */
    public int f222g;

    /* JADX INFO: renamed from: h */
    public C0040l f223h;

    /* JADX INFO: renamed from: i */
    public boolean f224i;

    /* JADX INFO: renamed from: j */
    public C0000a f225j;

    public C0016ap(int i, C0006af c0006af) {
        super(c0006af);
        this.f217b = new C0025ay();
        this.f219d = new C0025ay();
        this.f220e = new C0025ay();
        this.f224i = false;
        this.f216a = i;
        C0013am.m99k().m110a(this);
        switch (this.f216a) {
            case 0:
                m145a();
                break;
            case 1:
                m146b();
                break;
            case 2:
                m147d();
                break;
            case 3:
                m148e();
                break;
            case 4:
                m149f();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m145a() {
        this.f223h = new C0040l(this.f452H);
        this.f223h.m300a(500, 500, "stunMissileFire");
        this.f223h.f474d = 100;
        this.f223h.m298a();
        this.f223h.m301a(true, true);
        m16a(this.f223h);
    }

    /* JADX INFO: renamed from: b */
    private void m146b() {
        this.f223h = new C0040l(this.f452H);
        this.f223h.m300a(500, 500, "balloon");
        this.f223h.f474d = 100;
        this.f223h.f476f = 3;
        this.f223h.m298a();
        m16a(this.f223h);
    }

    /* JADX INFO: renamed from: d */
    private void m147d() {
        this.f223h = new C0040l(this.f452H);
        this.f223h.m300a(500, 500, "demoBomb");
        this.f223h.f474d = 100;
        this.f223h.m298a();
        m16a(this.f223h);
    }

    /* JADX INFO: renamed from: e */
    private void m148e() {
        this.f223h = new C0040l(this.f452H);
        this.f223h.m300a(500, 500, "nukie");
        this.f223h.m299a(3);
        this.f223h.m298a();
        m16a(this.f223h);
    }

    /* JADX INFO: renamed from: f */
    private void m149f() {
        this.f223h = new C0040l(this.f452H);
        this.f223h.m300a(500, 500, "stunMissileFire");
        this.f223h.f474d = 100;
        this.f223h.m298a();
        this.f223h.m301a(true, true);
        m16a(this.f223h);
    }

    /* JADX INFO: renamed from: g */
    private void m150g() {
        switch (this.f216a) {
            case 0:
                m151h();
                break;
            case 1:
                m152i();
                break;
            case 2:
                m153j();
                break;
            case 3:
                m154k();
                break;
            case 4:
                m155l();
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m151h() {
        C0053y.m338a().m341a("stunHit", false);
        this.f223h.m300a(850, 850, "sparks");
        this.f223h.f474d = 100;
        this.f223h.f478h = true;
        this.f223h.m298a();
        this.f223h.m301a(true, true);
        this.f223h.mo254a(this.f454J);
        this.f451G.m16a(this.f223h);
        if (this.f218c != null && this.f218c.m286c(2048)) {
            C0003ac c0003ac = (C0003ac) this.f218c;
            c0003ac.m32n();
            c0003ac.m34p();
            C0025ay c0025ay = new C0025ay();
            C0031c.m229b(c0025ay, this.f218c.f454J, this.f217b);
            C0031c.m239d(c0025ay);
            C0031c.m215a(c0025ay, C0031c.m231c(10));
            c0003ac.m256c(c0025ay);
        }
        mo19c();
    }

    /* JADX INFO: renamed from: i */
    private void m152i() {
        if (this.f218c != null && this.f218c.m286c(1024) && ((AbstractC0050v) this.f218c).m332l()) {
            this.f224i = true;
            AbstractC0050v abstractC0050v = (AbstractC0050v) this.f218c;
            mo254a(new C0025ay(0, 0, C0031c.m231c(2)));
            abstractC0050v.m16a((C0037i) this);
            abstractC0050v.mo26a(false);
            abstractC0050v.m250a(C0031c.m209a(-500));
            this.f221f = C0031c.m231c(this.f218c.m286c(2048) ? 3 : 5);
            return;
        }
        this.f223h.m300a(850, 850, "sparks");
        this.f223h.f474d = 100;
        this.f223h.f478h = true;
        this.f223h.m298a();
        this.f223h.m301a(true, true);
        this.f223h.mo254a(this.f454J);
        this.f451G.m16a(this.f223h);
        mo19c();
    }

    /* JADX INFO: renamed from: j */
    private void m153j() {
        C0053y.m338a().m341a("bombHit", false);
        this.f223h.m300a(1200, 1200, "explode");
        this.f223h.f474d = 100;
        this.f223h.f478h = true;
        this.f223h.m298a();
        this.f223h.m301a(true, false);
        this.f223h.mo254a(this.f454J);
        this.f451G.m16a(this.f223h);
        if (this.f225j != null) {
            this.f225j.m1a();
        }
        mo19c();
    }

    /* JADX INFO: renamed from: k */
    private void m154k() {
        C0053y.m338a().m341a("bombHit", false);
        this.f223h.m300a(1200, 1200, "nukieExplode");
        this.f223h.f474d = 100;
        this.f223h.f478h = true;
        this.f223h.m298a();
        this.f223h.m301a(true, false);
        this.f223h.mo254a(this.f454J);
        this.f451G.m16a(this.f223h);
        if (this.f225j != null) {
            this.f225j.m3b();
        }
        mo19c();
    }

    /* JADX INFO: renamed from: l */
    private void m155l() {
        C0053y.m338a().m341a("puttyHit", false);
        this.f223h.m300a(850, 850, "sparks");
        this.f223h.f474d = 100;
        this.f223h.f478h = true;
        this.f223h.m298a();
        this.f223h.m301a(true, true);
        this.f223h.mo254a(this.f454J);
        this.f451G.m16a(this.f223h);
        if (this.f218c != null && this.f218c.m286c(2048)) {
            C0003ac c0003ac = (C0003ac) this.f218c;
            c0003ac.m32n();
            c0003ac.m35q();
            C0025ay c0025ay = new C0025ay();
            C0031c.m229b(c0025ay, this.f218c.f454J, this.f217b);
            C0031c.m239d(c0025ay);
            C0031c.m215a(c0025ay, C0031c.m231c(50));
            c0003ac.m256c(c0025ay);
        }
        mo19c();
    }

    /* JADX INFO: renamed from: m */
    private C0025ay m156m() {
        if (this.f218c != null) {
            this.f219d.m174a(this.f218c.f454J);
        }
        return this.f219d;
    }

    /* JADX INFO: renamed from: a */
    public final void m157a(int i) {
        if (this.f216a != 1 || !this.f224i) {
            this.f221f -= i;
            if (this.f221f < 0) {
                m150g();
                return;
            }
            int i2 = 65536 - ((int) (((((long) this.f221f) << 32) / ((long) this.f222g)) >> 16));
            C0031c.m229b(this.f220e, m156m(), this.f217b);
            C0031c.m215a(this.f220e, i2);
            C0031c.m216a(this.f220e, this.f217b);
            mo254a(this.f220e);
            return;
        }
        this.f221f -= i;
        if (this.f221f <= 0) {
            this.f223h.m300a(850, 850, "sparks");
            this.f223h.f474d = 100;
            this.f223h.f478h = true;
            this.f223h.m298a();
            this.f223h.m301a(true, true);
            this.f223h.mo254a(this.f451G.f454J);
            this.f451G.m16a(this.f223h);
            ((AbstractC0050v) this.f451G).mo26a(true);
            if (this.f451G.m286c(2048)) {
                mo19c();
            } else {
                this.f451G.mo19c();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m158a(C0025ay c0025ay, C0025ay c0025ay2, int i) {
        this.f217b.m174a(c0025ay);
        this.f219d.m174a(c0025ay2);
        mo254a(c0025ay);
        this.f221f = C0031c.m224b(C0031c.m241e(this.f217b, this.f219d), i);
        this.f222g = this.f221f;
    }

    /* JADX INFO: renamed from: a */
    public final void m159a(C0025ay c0025ay, C0032d c0032d, int i) {
        this.f217b.m174a(c0025ay);
        this.f218c = c0032d;
        mo254a(c0025ay);
        this.f221f = C0031c.m224b(C0031c.m241e(this.f217b, this.f218c.f454J), i);
        this.f222g = this.f221f;
    }

    @Override // p000.C0002ab, p000.C0037i
    /* JADX INFO: renamed from: c */
    public final void mo19c() {
        super.mo19c();
        C0013am.m99k().m120b(this);
    }
}
