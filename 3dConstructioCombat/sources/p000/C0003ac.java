package p000;

/* JADX INFO: renamed from: ac */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0003ac extends AbstractC0050v {

    /* JADX INFO: renamed from: P */
    public AbstractC0050v f19P;

    /* JADX INFO: renamed from: Q */
    public int f20Q;

    /* JADX INFO: renamed from: R */
    public boolean f21R;

    /* JADX INFO: renamed from: S */
    public InterfaceC0051w f22S;

    /* JADX INFO: renamed from: T */
    public C0010aj f23T;

    /* JADX INFO: renamed from: U */
    public boolean f24U;

    /* JADX INFO: renamed from: V */
    public boolean f25V;

    /* JADX INFO: renamed from: W */
    public int f26W;

    /* JADX INFO: renamed from: X */
    public C0025ay f27X;

    /* JADX INFO: renamed from: Y */
    public C0025ay f28Y;

    /* JADX INFO: renamed from: Z */
    public C0025ay f29Z;

    /* JADX INFO: renamed from: a */
    public C0037i f30a;

    /* JADX INFO: renamed from: aa */
    public C0025ay f31aa;

    /* JADX INFO: renamed from: b */
    public boolean f32b;

    /* JADX INFO: renamed from: f */
    public int f33f;

    /* JADX INFO: renamed from: g */
    public AbstractC0050v f34g;

    public C0003ac(C0006af c0006af) {
        super(c0006af);
        this.f24U = false;
        this.f25V = false;
        this.f27X = new C0025ay();
        this.f28Y = new C0025ay();
        this.f29Z = new C0025ay();
        this.f31aa = new C0025ay();
        this.f453I |= 2048;
        this.f418u = this;
        m253a(new C0024ax(C0031c.m231c(-1), C0031c.m231c(-1), C0031c.m231c(-1), C0031c.m231c(1), C0031c.m231c(1), C0031c.m231c(1)));
        m250a(C0031c.m231c(0));
        this.f410m = C0031c.m231c(0);
        this.f411n = true;
        this.f413p = C0031c.m209a(100);
        this.f412o = C0031c.m209a(100);
    }

    /* JADX INFO: renamed from: e */
    private void m20e(int i) {
        int iM209a = C0031c.m209a(i * 2);
        C0031c.m217a(this.f29Z, this.f27X, iM209a);
        C0031c.m217a(this.f31aa, this.f28Y, C0031c.m231c(1) - iM209a);
        C0031c.m216a(this.f29Z, this.f31aa);
        if (this.f19P != null) {
            this.f19P.mo254a(this.f29Z);
        }
        this.f23T.m89b(this.f29Z);
    }

    /* JADX INFO: renamed from: f */
    private void m21f(int i) {
        int iM209a = C0031c.m209a((i - 500) * 2);
        C0031c.m217a(this.f29Z, this.f27X, C0031c.m231c(1) - iM209a);
        C0031c.m217a(this.f31aa, this.f28Y, iM209a);
        C0031c.m216a(this.f29Z, this.f31aa);
        if (this.f19P != null) {
            this.f19P.mo254a(this.f29Z);
        }
        this.f23T.m89b(this.f29Z);
    }

    /* JADX INFO: renamed from: h */
    private void m22h(C0025ay c0025ay) {
        C0010aj c0010aj;
        int i;
        C0025ay c0025ay2 = this.f454J;
        this.f27X.m174a(c0025ay);
        this.f28Y.m174a(c0025ay2);
        this.f28Y.f251c -= C0031c.m231c(1);
        this.f23T = new C0010aj(this.f452H);
        if (this.f20Q == 1) {
            c0010aj = this.f23T;
            i = -256;
        } else {
            c0010aj = this.f23T;
            i = -65536;
        }
        c0010aj.m87a(i, c0025ay2, this.f28Y);
        this.f23T.m88a(true, true);
        this.f23T.m86a();
        this.f451G.m16a(this.f23T);
    }

    /* JADX INFO: renamed from: v */
    private void m23v() {
        if (this.f34g != null && this.f34g.m286c(2048)) {
            C0003ac c0003ac = (C0003ac) this.f34g;
            c0003ac.f406i = 0;
            c0003ac.m34p();
            C0025ay c0025ay = new C0025ay(C0031c.m231c(10), 0, 0);
            C0031c.m219a(c0025ay, this.f455K);
            c0003ac.m256c(c0025ay);
            this.f34g = null;
            return;
        }
        if (this.f19P == null) {
            this.f19P = this.f34g;
            this.f34g = null;
            if (this.f32b) {
                C0053y.m338a().m341a("pickup", false);
                return;
            }
            return;
        }
        this.f19P.mo26a(true);
        if (this.f19P.m286c(4096)) {
            ((C0041m) this.f19P).m304a(this.f33f, this.f20Q);
            if (this.f32b) {
                C0053y.m338a().m341a("shootPiece", false);
            }
        }
        this.f34g = null;
        this.f19P = null;
    }

    /* JADX INFO: renamed from: w */
    private void m24w() {
        if (this.f19P != null) {
            this.f29Z.m173a(0, 0, this.f19P.f535e);
            this.f19P.mo254a(this.f29Z);
            m16a((C0037i) this.f19P);
            this.f19P.mo198a();
        }
        if (this.f34g != null) {
            this.f34g.mo26a(true);
        }
        this.f23T.mo19c();
        this.f23T = null;
        this.f24U = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m25a(C0028ba c0028ba) {
        if (c0028ba.f334e == null || c0028ba.f334e.m286c(2048) || this.f22S == null) {
            return;
        }
        this.f22S.mo123c();
    }

    @Override // p000.AbstractC0050v
    /* JADX INFO: renamed from: a */
    public final void mo26a(boolean z) {
        if (z) {
            this.f406i = 0;
            m250a(C0031c.m231c(0));
        } else {
            this.f406i = 1;
            m250a(0);
            m256c(C0031c.f376a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27b(boolean z) {
        this.f32b = z;
        this.f20Q = !this.f32b ? 2 : 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m28c(C0037i c0037i) {
        this.f30a = c0037i;
        m16a(this.f30a);
    }

    @Override // p000.C0032d
    /* JADX INFO: renamed from: d */
    public final void mo29d() {
        if (this.f406i == 2) {
            this.f406i = 0;
        }
        if (this.f21R) {
            m250a(0);
            this.f410m = 0;
            this.f21R = false;
            if (this.f22S != null) {
                this.f22S.mo118b();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m30g(C0025ay c0025ay) {
        if (this.f24U || this.f19P == null) {
            return;
        }
        if (this.f19P.f533c != 8192 || !this.f19P.m286c(4096) || this.f33f == -1) {
            this.f19P.mo200f(c0025ay);
            return;
        }
        this.f19P.mo199b();
        this.f28Y.m174a(this.f454J);
        this.f28Y.f251c -= C0031c.m231c(1);
        this.f19P.mo254a(this.f28Y);
        this.f451G.m16a((C0037i) this.f19P);
        C0013am c0013amM99k = C0013am.m99k();
        this.f29Z.m174a(c0013amM99k.f122C[this.f33f]);
        if (c0013amM99k.f123D[this.f33f] != null) {
            C0025ay c0025ay2 = this.f29Z;
            c0025ay2.f251c = c0013amM99k.f123D[this.f33f].f416s.f248b.f251c + c0025ay2.f251c;
        }
        this.f29Z.f251c -= this.f19P.f416s.f247a.f251c;
        m22h(this.f29Z);
        this.f25V = false;
        this.f24U = true;
        this.f26W = this.f452H.f45a;
    }

    /* JADX INFO: renamed from: m */
    public final void m31m() {
        this.f19P = null;
    }

    /* JADX INFO: renamed from: n */
    public final void m32n() {
        if (this.f19P == null) {
            return;
        }
        this.f19P.mo199b();
        this.f19P.f406i = 0;
        this.f19P.m250a(C0031c.m231c(1));
        this.f28Y.m174a(this.f454J);
        this.f28Y.f251c -= C0031c.m231c(1);
        this.f19P.mo254a(this.f28Y);
        this.f451G.m16a((C0037i) this.f19P);
        C0025ay c0025ay = new C0025ay(C0031c.m231c(5), 0, C0031c.m231c(5));
        C0031c.m219a(c0025ay, this.f455K);
        this.f19P.m256c(c0025ay);
        this.f406i = 2;
        this.f403B = this.f452H.f45a + 500;
        this.f19P = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m33o() {
        m250a(C0031c.m231c(1));
        this.f21R = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m34p() {
        m250a(C0031c.m231c(1));
        this.f21R = true;
        this.f403B = this.f452H.f45a + 2000;
        if (this.f22S != null) {
            this.f22S.mo107a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m35q() {
        m250a(C0031c.m231c(1));
        this.f410m = C0031c.m231c(1);
        this.f21R = true;
        this.f403B = this.f452H.f45a + 3000;
        if (this.f22S != null) {
            this.f22S.mo107a();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m36r() {
        if (this.f19P != null || this.f24U || this.f34g == null || !this.f34g.m332l() || this.f34g.m286c(2048)) {
            return;
        }
        m22h(this.f34g.f454J);
        this.f34g.mo26a(false);
        this.f25V = false;
        this.f24U = true;
        this.f26W = this.f452H.f45a;
    }

    /* JADX INFO: renamed from: s */
    public final void m37s() {
        if (this.f24U) {
            int i = this.f452H.f45a - this.f26W;
            if (i < 500) {
                m20e(i);
                return;
            }
            if (!this.f25V) {
                this.f25V = true;
                m23v();
            }
            if (i < 1000) {
                m21f(i);
            } else {
                m24w();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m38t() {
        return (this.f24U || this.f406i == 1 || this.f21R) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final int m39u() {
        if (this.f19P != null) {
            return this.f19P.f534d;
        }
        return 655360;
    }
}
