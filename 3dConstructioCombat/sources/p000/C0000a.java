package p000;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0000a extends C0032d {

    /* JADX INFO: renamed from: a */
    public C0035g f0a;

    /* JADX INFO: renamed from: b */
    public C0035g f1b;

    /* JADX INFO: renamed from: c */
    public int f2c;

    /* JADX INFO: renamed from: d */
    public C0005ae f3d;

    /* JADX INFO: renamed from: e */
    public C0040l f4e;

    /* JADX INFO: renamed from: f */
    public C0024ax f5f;

    /* JADX INFO: renamed from: g */
    public int f6g;

    public C0000a(C0006af c0006af, int i) {
        C0040l c0040l;
        String str;
        super(c0006af);
        this.f453I |= 8192;
        this.f6g = i;
        m261g();
        m250a(0);
        this.f5f = new C0024ax(C0031c.m231c(-2), C0031c.m231c(-2), C0031c.m231c(0), C0031c.m231c(2), C0031c.m231c(2), C0031c.m231c(0));
        m253a(this.f5f);
        this.f3d = new C0005ae(this.f452H);
        this.f3d.m44a(C0013am.m99k().f149aC);
        m16a(this.f3d);
        this.f4e = new C0040l(this.f452H);
        if (this.f6g == 1) {
            c0040l = this.f4e;
            str = "yellowGlow";
        } else {
            c0040l = this.f4e;
            str = "redGlow";
        }
        c0040l.m300a(300, 300, str);
        this.f4e.m298a();
        this.f4e.m301a(true, true);
        m16a(this.f4e);
    }

    /* JADX INFO: renamed from: l */
    private void m0l() {
        C0005ae c0005ae;
        String[] strArr;
        int i;
        int i2;
        if (this.f0a == null) {
            c0005ae = this.f3d;
            strArr = this.f1b.f442c;
            i = this.f2c;
            i2 = 1;
        } else {
            c0005ae = this.f3d;
            strArr = this.f1b.f443d;
            i = this.f2c;
            i2 = 2;
        }
        c0005ae.m45a(strArr[i - i2]);
        this.f3d.m47b(this.f1b.f444e);
        this.f5f.f248b.f251c = C0031c.m210a(C0031c.m231c(this.f2c), this.f1b.f449j.f248b.f251c - this.f1b.f449j.f247a.f251c);
        m253a(this.f5f);
        this.f4e.mo251a(0, 0, C0031c.m231c(1) + this.f5f.f248b.f251c);
    }

    /* JADX INFO: renamed from: a */
    public final void m1a() {
        if (this.f0a != null) {
            this.f0a = null;
        }
        this.f2c--;
        if (this.f2c <= 0) {
            m3b();
        } else {
            m0l();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2a(C0041m c0041m) {
        if (this.f1b == null) {
            return true;
        }
        if (this.f0a != null) {
            return false;
        }
        if (this.f1b != c0041m.f485a) {
            return this.f1b.f446g.equals(c0041m.f485a.f440a);
        }
        return this.f2c < this.f1b.f447h;
    }

    /* JADX INFO: renamed from: b */
    public final void m3b() {
        C0013am c0013amM99k = C0013am.m99k();
        for (int i = 0; i < c0013amM99k.f123D.length; i++) {
            if (c0013amM99k.f123D[i] == this) {
                c0013amM99k.f123D[i] = null;
            }
        }
        mo19c();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4b(C0041m c0041m) {
        if (this.f1b == null) {
            if (c0041m.f485a.f446g == null) {
                this.f0a = c0041m.f485a;
                this.f1b = (C0035g) C0013am.m99k().f125F.get(this.f0a.f445f);
            } else {
                this.f1b = c0041m.f485a;
            }
        } else {
            if (this.f0a != null) {
                return false;
            }
            if (this.f1b != c0041m.f485a) {
                if (!this.f1b.f446g.equals(c0041m.f485a.f440a)) {
                    return false;
                }
                this.f0a = c0041m.f485a;
            } else if (this.f2c >= this.f1b.f447h) {
                return false;
            }
        }
        this.f2c++;
        m0l();
        return true;
    }
}
