package p000;

/* JADX INFO: renamed from: bb */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0029bb extends AbstractC0050v {

    /* JADX INFO: renamed from: a */
    public boolean f336a;

    /* JADX INFO: renamed from: b */
    public C0040l f337b;

    /* JADX INFO: renamed from: f */
    public int f338f;

    /* JADX INFO: renamed from: g */
    public int f339g;

    public C0029bb(int i, C0006af c0006af) {
        super(c0006af);
        this.f453I |= 1048576;
        this.f339g = i;
        m253a(new C0024ax(C0031c.m231c(-1), C0031c.m231c(-1), C0031c.m231c(-1), C0031c.m231c(1), C0031c.m231c(1), C0031c.m231c(1)));
        this.f337b = new C0040l(this.f452H);
        m16a(this.f337b);
        switch (this.f339g) {
            case 0:
                m192m();
                break;
            case 1:
                m193n();
                break;
            case 2:
                m194o();
                break;
            case 3:
                m195p();
                break;
            case 4:
                m196q();
                break;
            case 5:
                m197r();
                break;
        }
        this.f337b.m298a();
        this.f337b.m299a(0);
    }

    /* JADX INFO: renamed from: g */
    private void m186g(C0025ay c0025ay) {
        C0003ac c0003ac = (C0003ac) this.f451G;
        if (this.f338f >= 3 || !this.f336a) {
            return;
        }
        C0016ap c0016ap = new C0016ap(0, this.f452H);
        C0025ay c0025ay2 = new C0025ay(c0003ac.f454J);
        C0031c.m216a(c0025ay2, this.f454J);
        if (c0003ac.f34g != null) {
            c0016ap.m159a(c0025ay2, c0003ac.f34g, C0031c.m231c(10));
        } else {
            C0025ay c0025ay3 = new C0025ay();
            C0031c.m217a(c0025ay3, c0025ay, C0031c.m231c(20));
            C0031c.m216a(c0025ay3, c0003ac.f454J);
            c0016ap.m158a(c0025ay2, c0025ay3, C0031c.m231c(10));
        }
        this.f452H.f47c.m16a((C0037i) c0016ap);
        this.f338f++;
        this.f337b.f476f = this.f338f;
        this.f336a = false;
        this.f403B = this.f452H.f45a + 500;
    }

    /* JADX INFO: renamed from: h */
    private void m187h(C0025ay c0025ay) {
        C0003ac c0003ac = (C0003ac) this.f451G;
        C0016ap c0016ap = new C0016ap(0, this.f452H);
        C0025ay c0025ay2 = new C0025ay(c0003ac.f454J);
        C0031c.m216a(c0025ay2, this.f454J);
        if (c0003ac.f34g != null) {
            c0016ap.m159a(c0025ay2, c0003ac.f34g, C0031c.m231c(10));
        } else {
            C0025ay c0025ay3 = new C0025ay();
            C0031c.m217a(c0025ay3, c0025ay, C0031c.m231c(20));
            C0031c.m216a(c0025ay3, c0003ac.f454J);
            c0016ap.m158a(c0025ay2, c0025ay3, C0031c.m231c(10));
        }
        this.f452H.f47c.m16a((C0037i) c0016ap);
        mo19c();
    }

    /* JADX INFO: renamed from: i */
    private void m188i(C0025ay c0025ay) {
        C0003ac c0003ac = (C0003ac) this.f451G;
        C0016ap c0016ap = new C0016ap(1, this.f452H);
        C0025ay c0025ay2 = new C0025ay(c0003ac.f454J);
        C0031c.m216a(c0025ay2, this.f454J);
        if (c0003ac.f34g != null) {
            c0016ap.m159a(c0025ay2, c0003ac.f34g, C0031c.m231c(20));
        } else {
            C0025ay c0025ay3 = new C0025ay();
            C0031c.m217a(c0025ay3, c0025ay, C0031c.m231c(20));
            C0031c.m216a(c0025ay3, c0003ac.f454J);
            c0016ap.m158a(c0025ay2, c0025ay3, C0031c.m231c(20));
        }
        this.f452H.f47c.m16a((C0037i) c0016ap);
        mo19c();
    }

    /* JADX INFO: renamed from: j */
    private void m189j(C0025ay c0025ay) {
        C0025ay c0025ay2;
        C0003ac c0003ac = (C0003ac) this.f451G;
        C0016ap c0016ap = new C0016ap(2, this.f452H);
        C0025ay c0025ay3 = new C0025ay(c0003ac.f454J);
        C0031c.m216a(c0025ay3, this.f454J);
        if (c0003ac.f33f == -1 || C0013am.m99k().f123D[c0003ac.f33f] == null) {
            C0025ay c0025ay4 = new C0025ay();
            C0031c.m217a(c0025ay4, c0025ay, C0031c.m231c(6));
            C0031c.m216a(c0025ay4, c0003ac.f454J);
            c0025ay2 = c0025ay4;
        } else {
            c0016ap.f225j = C0013am.m99k().f123D[c0003ac.f33f];
            c0025ay2 = new C0025ay(c0016ap.f225j.f454J);
            c0025ay2.f251c += c0016ap.f225j.f5f.f248b.f251c;
        }
        c0016ap.m158a(c0025ay3, c0025ay2, C0031c.m231c(10));
        this.f452H.f47c.m16a((C0037i) c0016ap);
        mo19c();
    }

    /* JADX INFO: renamed from: k */
    private void m190k(C0025ay c0025ay) {
        C0025ay c0025ay2;
        C0003ac c0003ac = (C0003ac) this.f451G;
        C0016ap c0016ap = new C0016ap(3, this.f452H);
        C0025ay c0025ay3 = new C0025ay(c0003ac.f454J);
        C0031c.m216a(c0025ay3, this.f454J);
        if (c0003ac.f33f == -1 || C0013am.m99k().f123D[c0003ac.f33f] == null) {
            C0025ay c0025ay4 = new C0025ay();
            C0031c.m217a(c0025ay4, c0025ay, C0031c.m231c(6));
            C0031c.m216a(c0025ay4, c0003ac.f454J);
            c0025ay2 = c0025ay4;
        } else {
            c0016ap.f225j = C0013am.m99k().f123D[c0003ac.f33f];
            c0025ay2 = new C0025ay(c0016ap.f225j.f454J);
            c0025ay2.f251c += c0016ap.f225j.f5f.f248b.f251c;
        }
        c0016ap.m158a(c0025ay3, c0025ay2, C0031c.m231c(10));
        this.f452H.f47c.m16a((C0037i) c0016ap);
        mo19c();
    }

    /* JADX INFO: renamed from: l */
    private void m191l(C0025ay c0025ay) {
        C0003ac c0003ac = (C0003ac) this.f451G;
        C0016ap c0016ap = new C0016ap(4, this.f452H);
        C0025ay c0025ay2 = new C0025ay(c0003ac.f454J);
        C0031c.m216a(c0025ay2, this.f454J);
        if (c0003ac.f34g != null) {
            c0016ap.m159a(c0025ay2, c0003ac.f34g, C0031c.m231c(10));
        } else {
            C0025ay c0025ay3 = new C0025ay();
            C0031c.m217a(c0025ay3, c0025ay, C0031c.m231c(20));
            C0031c.m216a(c0025ay3, c0003ac.f454J);
            c0016ap.m158a(c0025ay2, c0025ay3, C0031c.m231c(10));
        }
        this.f452H.f47c.m16a((C0037i) c0016ap);
        mo19c();
    }

    /* JADX INFO: renamed from: m */
    private void m192m() {
        this.f337b.m300a(500, 500, "stunMissile3Pack");
        this.f533c = 2048;
    }

    /* JADX INFO: renamed from: n */
    private void m193n() {
        this.f337b.m300a(500, 500, "stunMissile");
        this.f533c = 2048;
    }

    /* JADX INFO: renamed from: o */
    private void m194o() {
        this.f337b.m300a(500, 500, "balloon");
        this.f533c = 7168;
    }

    /* JADX INFO: renamed from: p */
    private void m195p() {
        this.f337b.m300a(500, 500, "demoBomb");
        this.f337b.f474d = 100;
        this.f533c = 8192;
        this.f534d = C0031c.m231c(10);
    }

    /* JADX INFO: renamed from: q */
    private void m196q() {
        this.f337b.m300a(500, 500, "nukie");
        this.f533c = 8192;
        this.f534d = C0031c.m231c(10);
    }

    /* JADX INFO: renamed from: r */
    private void m197r() {
        this.f337b.m300a(500, 500, "puttyMissile");
        this.f533c = 2048;
    }

    @Override // p000.AbstractC0050v
    /* JADX INFO: renamed from: a */
    public final void mo198a() {
        switch (this.f339g) {
            case 0:
                this.f337b.f474d = 100;
                this.f337b.f476f = 0;
                this.f403B = this.f452H.f45a + 400;
                return;
            case 1:
                break;
            case 2:
            case 3:
            default:
                return;
            case 4:
                break;
            case 5:
                break;
        }
        this.f337b.f474d = 100;
        this.f337b.f476f = 3;
    }

    @Override // p000.AbstractC0050v
    /* JADX INFO: renamed from: b */
    public final void mo199b() {
        switch (this.f339g) {
            case 0:
            case 1:
            case 5:
                this.f337b.f476f = 0;
                break;
        }
    }

    @Override // p000.C0032d
    /* JADX INFO: renamed from: d */
    public final void mo29d() {
        switch (this.f339g) {
            case 0:
                if (this.f338f == 0) {
                    this.f337b.f476f = 0;
                } else if (this.f338f >= 3) {
                    mo19c();
                }
                this.f336a = true;
                break;
        }
    }

    @Override // p000.AbstractC0050v
    /* JADX INFO: renamed from: f */
    public final void mo200f(C0025ay c0025ay) {
        switch (this.f339g) {
            case 0:
                m186g(c0025ay);
                break;
            case 1:
                m187h(c0025ay);
                break;
            case 2:
                m188i(c0025ay);
                break;
            case 3:
                m189j(c0025ay);
                break;
            case 4:
                m190k(c0025ay);
                break;
            case 5:
                m191l(c0025ay);
                break;
        }
    }
}
