package p000;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0048t implements InterfaceC0051w {

    /* JADX INFO: renamed from: a */
    public static final int f518a = C0031c.m231c(6);

    /* JADX INFO: renamed from: b */
    public static final C0025ay f519b = new C0025ay(0, 0, f518a);

    /* JADX INFO: renamed from: d */
    public C0003ac f521d;

    /* JADX INFO: renamed from: e */
    public C0040l f522e;

    /* JADX INFO: renamed from: f */
    public int f523f;

    /* JADX INFO: renamed from: g */
    public int f524g;

    /* JADX INFO: renamed from: h */
    public int f525h;

    /* JADX INFO: renamed from: j */
    public AbstractC0050v f527j;

    /* JADX INFO: renamed from: c */
    public C0025ay f520c = new C0025ay();

    /* JADX INFO: renamed from: i */
    public int f526i = 0;

    public C0048t(C0003ac c0003ac, C0040l c0040l) {
        this.f521d = c0003ac;
        this.f522e = c0040l;
    }

    /* JADX INFO: renamed from: c */
    private void m320c(int i) {
        this.f526i = i;
        this.f524g = 0;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX INFO: renamed from: d */
    private void m321d() {
        C0003ac c0003ac;
        int i;
        C0013am c0013amM99k = C0013am.m99k();
        if (this.f521d.f19P != null) {
            if (this.f521d.f19P.m286c(4096)) {
                m324g();
                return;
            } else {
                m326i();
                return;
            }
        }
        this.f521d.f34g = null;
        int iM231c = C0031c.m231c(10000);
        int iM231c2 = C0031c.m231c(10000);
        AbstractC0050v abstractC0050v = this.f527j;
        this.f527j = null;
        C0025ay c0025ay = this.f521d.f454J;
        int iM231c3 = C0031c.m231c(-1);
        int i2 = 0;
        AbstractC0050v abstractC0050v2 = null;
        AbstractC0050v abstractC0050v3 = null;
        while (i2 < c0013amM99k.f135P) {
            AbstractC0050v abstractC0050v4 = c0013amM99k.f134O[i2];
            if (abstractC0050v4.m286c(2048) || !abstractC0050v4.m332l() || abstractC0050v4 == abstractC0050v || abstractC0050v4.f408k.f251c <= iM231c3) {
                i = iM231c2;
            } else {
                if (abstractC0050v4.m286c(1048576) && ((C0029bb) abstractC0050v4).f339g == 4) {
                    this.f521d.f34g = abstractC0050v4;
                    m320c(1);
                    return;
                }
                int iM238d = C0031c.m238d(abstractC0050v4.f454J, c0025ay);
                if (abstractC0050v4.m286c(4096)) {
                    if (iM238d < iM231c2) {
                        i = iM238d;
                        abstractC0050v2 = abstractC0050v4;
                    } else {
                        i = iM231c2;
                    }
                } else if (iM238d < iM231c) {
                    i = iM231c2;
                    iM231c = iM238d;
                    abstractC0050v3 = abstractC0050v4;
                } else {
                    i = iM231c2;
                }
            }
            i2++;
            iM231c2 = i;
        }
        if (abstractC0050v3 != null) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i5 < c0013amM99k.f121B) {
                C0000a c0000a = c0013amM99k.f123D[i5];
                if (c0000a != null) {
                    if (c0000a.f6g == this.f521d.f20Q) {
                        i4 += c0000a.f2c;
                    } else {
                        i3 += c0000a.f2c;
                    }
                }
                i5++;
                i3 = i3;
            }
            if (i4 > i3 * 2 || (i3 > i4 * 2 && c0013amM99k.f141V < 20000)) {
                this.f521d.f34g = abstractC0050v3;
                m320c(1);
                return;
            }
        }
        if (abstractC0050v2 != null && abstractC0050v3 != null) {
            if (c0013amM99k.f138S.nextInt() % 3 == 0) {
                c0003ac = this.f521d;
            } else {
                c0003ac = this.f521d;
                abstractC0050v2 = abstractC0050v3;
            }
            c0003ac.f34g = abstractC0050v2;
            m320c(1);
            return;
        }
        if (abstractC0050v2 != null) {
            this.f521d.f34g = abstractC0050v2;
            m320c(1);
        } else if (abstractC0050v3 == null) {
            m322e();
        } else {
            this.f521d.f34g = abstractC0050v3;
            m320c(1);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m322e() {
        this.f521d.m256c(C0031c.f376a);
        m320c(0);
        this.f523f = C0013am.m99k().f184j;
    }

    /* JADX INFO: renamed from: f */
    private void m323f() {
        if (this.f521d.f34g == null || this.f521d.f34g.f459O || !this.f521d.f34g.m332l()) {
            this.f521d.f34g = null;
            m322e();
            return;
        }
        C0031c.m229b(this.f520c, this.f521d.f34g.f454J, this.f521d.f454J);
        int iM232c = C0031c.m232c(this.f520c);
        C0031c.m226b(this.f520c, iM232c);
        if (iM232c < m330m()) {
            this.f521d.m36r();
            m322e();
        } else {
            C0031c.m215a(this.f520c, f518a);
            this.f521d.m256c(this.f520c);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m324g() {
        int i;
        int iM238d;
        int i2;
        if (this.f521d.f19P == null) {
            m322e();
            return;
        }
        m320c(2);
        C0013am c0013amM99k = C0013am.m99k();
        C0041m c0041m = (C0041m) this.f521d.f19P;
        if (c0041m.f485a.f446g == null) {
            int i3 = 0;
            int i4 = -1;
            int i5 = 0;
            while (i3 < c0013amM99k.f121B) {
                C0000a c0000a = c0013amM99k.f123D[i3];
                if (c0000a == null || c0000a.f6g != this.f521d.f20Q || !c0000a.m2a(c0041m) || c0000a.f2c <= i5) {
                    i2 = i4;
                } else {
                    i5 = c0000a.f2c;
                    i2 = i3;
                }
                i3++;
                i4 = i2;
            }
            if (i4 != -1) {
                this.f521d.f33f = i4;
                return;
            }
        } else {
            C0000a[] c0000aArr = new C0000a[20];
            int[] iArr = new int[20];
            int i6 = 0;
            for (int i7 = 0; i7 < c0013amM99k.f121B; i7++) {
                C0000a c0000a2 = c0013amM99k.f123D[i7];
                if (c0000a2 != null && c0000a2.f6g == this.f521d.f20Q && c0000a2.m2a((C0041m) this.f521d.f19P)) {
                    c0000aArr[i6] = c0000a2;
                    iArr[i6] = i7;
                    i6++;
                }
            }
            if (i6 < 2) {
                int iM231c = C0031c.m231c(10000);
                C0025ay c0025ay = this.f521d.f454J;
                int i8 = -1;
                for (int i9 = 0; i9 < c0013amM99k.f121B; i9++) {
                    if (c0013amM99k.f123D[i9] == null && (iM238d = C0031c.m238d(c0013amM99k.f122C[i9], c0025ay)) < iM231c) {
                        i8 = i9;
                        iM231c = iM238d;
                    }
                }
                if (i8 != -1) {
                    this.f521d.f33f = i8;
                    return;
                }
            } else {
                int i10 = 10000;
                int i11 = -1;
                for (int i12 = 0; i12 < i6; i12++) {
                    int i13 = c0000aArr[i12].f2c;
                    if (i13 < i10) {
                        i = iArr[i12];
                    } else {
                        i13 = i10;
                        i = i11;
                    }
                    i10 = i13;
                    i11 = i;
                }
                if (i11 != -1) {
                    this.f521d.f33f = i11;
                    return;
                }
            }
        }
        m329l();
        m322e();
    }

    /* JADX INFO: renamed from: h */
    private void m325h() {
        C0031c.m229b(this.f520c, C0013am.m99k().f122C[this.f521d.f33f], this.f521d.f454J);
        int iM232c = C0031c.m232c(this.f520c);
        C0031c.m226b(this.f520c, iM232c);
        if (iM232c < this.f521d.m39u()) {
            this.f521d.m30g(this.f520c);
            m322e();
        } else {
            C0031c.m215a(this.f520c, f518a);
            this.f521d.m256c(this.f520c);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m326i() {
        int i = 0;
        if (this.f521d.f19P == null) {
            m322e();
            return;
        }
        C0013am c0013amM99k = C0013am.m99k();
        int i2 = this.f521d.f19P.f533c;
        if (i2 == 8192) {
            this.f521d.f33f = -1;
            while (i < c0013amM99k.f121B) {
                C0000a c0000a = c0013amM99k.f123D[i];
                if (c0000a != null && c0000a.f6g != this.f521d.f20Q) {
                    this.f521d.f33f = i;
                }
                i++;
            }
            if (this.f521d.f33f != -1) {
                m320c(4);
                return;
            }
        } else {
            this.f521d.f34g = null;
            while (i < c0013amM99k.f135P) {
                AbstractC0050v abstractC0050v = c0013amM99k.f134O[i];
                if (abstractC0050v != this.f521d && abstractC0050v.m286c(i2) && abstractC0050v.m332l()) {
                    this.f521d.f34g = abstractC0050v;
                }
                i++;
            }
            if (this.f521d.f33f != -1) {
                m320c(3);
                return;
            }
        }
        m329l();
        m322e();
    }

    /* JADX INFO: renamed from: j */
    private void m327j() {
        C0031c.m229b(this.f520c, C0013am.m99k().f122C[this.f521d.f33f], this.f521d.f454J);
        int iM232c = C0031c.m232c(this.f520c);
        C0031c.m226b(this.f520c, iM232c);
        if (iM232c < this.f521d.m39u()) {
            this.f521d.m30g(this.f520c);
            m322e();
        } else {
            C0031c.m215a(this.f520c, f518a);
            this.f521d.m256c(this.f520c);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m328k() {
        if (this.f521d.f34g == null || !this.f521d.f34g.m332l()) {
            this.f521d.f34g = null;
            m322e();
            return;
        }
        C0031c.m229b(this.f520c, this.f521d.f34g.f454J, this.f521d.f454J);
        int iM232c = C0031c.m232c(this.f520c);
        C0031c.m226b(this.f520c, iM232c);
        if (iM232c < this.f521d.m39u()) {
            this.f521d.m30g(this.f520c);
            m322e();
        } else {
            C0031c.m215a(this.f520c, f518a);
            this.f521d.m256c(this.f520c);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m329l() {
        this.f527j = this.f521d.f19P;
        this.f521d.m32n();
    }

    /* JADX INFO: renamed from: m */
    private int m330m() {
        return (int) (((((long) ((int) ((((long) this.f521d.m39u()) * 196608) >> 16))) << 32) / 131072) >> 16);
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: a */
    public final void mo107a() {
        this.f522e.f474d = 0;
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: a */
    public final void mo108a(int i) {
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: b */
    public final void mo118b() {
        this.f522e.f474d = 100;
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: b */
    public final void mo119b(int i) {
        this.f521d.m37s();
        if (this.f521d.m38t()) {
            if (this.f523f > 0) {
                this.f523f -= i;
                if (this.f523f < 0) {
                    this.f523f = 0;
                    return;
                }
                return;
            }
            this.f524g += i;
            if (this.f524g > 10000) {
                m329l();
                m322e();
                return;
            }
            switch (this.f526i) {
                case 0:
                    m321d();
                    break;
                case 1:
                    m323f();
                    break;
                case 2:
                    m325h();
                    break;
                case 3:
                    m328k();
                    break;
                case 4:
                    m327j();
                    break;
            }
            if (this.f525h > 0) {
                this.f525h -= i;
                if (this.f525h <= 0) {
                    this.f525h = 0;
                }
                this.f521d.m256c(f519b);
            }
        }
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: c */
    public final void mo123c() {
        this.f525h = 1000;
    }
}
