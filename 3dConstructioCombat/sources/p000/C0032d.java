package p000;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public class C0032d extends C0002ab {

    /* JADX INFO: renamed from: A */
    public boolean f402A;

    /* JADX INFO: renamed from: B */
    public int f403B;

    /* JADX INFO: renamed from: C */
    public C0007ag f404C;

    /* JADX INFO: renamed from: h */
    public int f405h;

    /* JADX INFO: renamed from: i */
    public int f406i;

    /* JADX INFO: renamed from: j */
    public C0025ay f407j;

    /* JADX INFO: renamed from: k */
    public C0025ay f408k;

    /* JADX INFO: renamed from: l */
    public C0025ay f409l;

    /* JADX INFO: renamed from: m */
    public int f410m;

    /* JADX INFO: renamed from: n */
    public boolean f411n;

    /* JADX INFO: renamed from: o */
    public int f412o;

    /* JADX INFO: renamed from: p */
    public int f413p;

    /* JADX INFO: renamed from: q */
    public int f414q;

    /* JADX INFO: renamed from: r */
    public int f415r;

    /* JADX INFO: renamed from: s */
    public C0024ax f416s;

    /* JADX INFO: renamed from: t */
    public C0024ax f417t;

    /* JADX INFO: renamed from: u */
    public C0003ac f418u;

    /* JADX INFO: renamed from: v */
    public boolean f419v;

    /* JADX INFO: renamed from: w */
    public int f420w;

    /* JADX INFO: renamed from: x */
    public C0032d f421x;

    /* JADX INFO: renamed from: y */
    public C0032d f422y;

    /* JADX INFO: renamed from: z */
    public C0025ay f423z;

    public C0032d(C0006af c0006af) {
        super(c0006af);
        this.f407j = new C0025ay();
        this.f408k = new C0025ay();
        this.f409l = new C0025ay();
        this.f416s = new C0024ax();
        this.f417t = new C0024ax();
        this.f423z = new C0025ay();
        m260f();
        try {
            this.f404C = (C0007ag) this.f452H.f47c;
        } catch (ClassCastException e) {
            this.f404C = null;
        }
        if (this.f404C == null) {
            throw new RuntimeException("HopEntity: Invalid scene manager");
        }
        this.f404C.m62a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m250a(int i) {
        this.f414q = i;
        this.f419v = true;
    }

    @Override // p000.C0037i
    /* JADX INFO: renamed from: a */
    public final void mo251a(int i, int i2, int i3) {
        super.mo251a(i, i2, i3);
        m255b(this.f454J);
    }

    @Override // p000.C0037i
    /* JADX INFO: renamed from: a */
    public final void mo252a(C0002ab c0002ab) {
        if (c0002ab == this.f404C) {
            this.f404C.m66c(this);
            this.f404C.m65c(this.f416s.f247a);
            this.f404C.m65c(this.f416s.f248b);
        } else {
            this.f404C.m67d(this);
        }
        super.mo252a(c0002ab);
    }

    /* JADX INFO: renamed from: a */
    public final void m253a(C0024ax c0024ax) {
        this.f416s.m171a(c0024ax);
        m265k();
    }

    @Override // p000.C0037i
    /* JADX INFO: renamed from: a */
    public final void mo254a(C0025ay c0025ay) {
        super.mo254a(c0025ay);
        m255b(c0025ay);
    }

    /* JADX INFO: renamed from: b */
    public final void m255b(C0025ay c0025ay) {
        this.f407j.m174a(c0025ay);
        C0031c.m212a(this.f417t, this.f416s, this.f407j);
        this.f419v = true;
        this.f420w = 0;
    }

    @Override // p000.C0002ab, p000.C0037i
    /* JADX INFO: renamed from: c */
    public void mo19c() {
        this.f404C.m64b(this);
        super.mo19c();
    }

    /* JADX INFO: renamed from: c */
    public final void m256c(C0025ay c0025ay) {
        this.f408k.m174a(c0025ay);
        this.f419v = true;
        this.f420w = 0;
    }

    /* JADX INFO: renamed from: d */
    public void mo29d() {
    }

    /* JADX INFO: renamed from: d */
    public final void m257d(C0025ay c0025ay) {
        C0031c.m218a(this.f409l, this.f409l, c0025ay);
        this.f419v = true;
        this.f420w = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m258e() {
        if (m264j()) {
            super.mo254a(this.f407j);
        }
        if (this.f403B == 0 || this.f403B >= this.f452H.f45a) {
            return;
        }
        mo29d();
        this.f403B = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m259e(C0025ay c0025ay) {
        this.f407j.m174a(c0025ay);
        C0031c.m212a(this.f417t, this.f416s, this.f407j);
    }

    /* JADX INFO: renamed from: f */
    public final void m260f() {
        this.f405h = 65536;
        this.f406i = 0;
        this.f410m = 32768;
        this.f411n = false;
        this.f412o = 32768;
        this.f413p = 32768;
        this.f414q = 65536;
        this.f415r = 0;
        this.f421x = null;
        this.f422y = null;
        this.f418u = null;
        this.f419v = true;
        this.f420w = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m261g() {
        this.f405h = -65536;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m262h() {
        return this.f405h == -65536;
    }

    /* JADX INFO: renamed from: i */
    public final void m263i() {
        this.f409l.m174a(C0031c.f376a);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m264j() {
        return this.f419v && this.f451G == this.f404C;
    }

    /* JADX INFO: renamed from: k */
    public final void m265k() {
        C0031c.m212a(this.f417t, this.f416s, this.f407j);
    }
}
