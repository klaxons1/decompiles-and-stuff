package p000;

import java.util.Vector;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0033e implements InterfaceC0051w {

    /* JADX INFO: renamed from: a */
    public C0003ac f424a;

    /* JADX INFO: renamed from: b */
    public boolean f425b;

    /* JADX INFO: renamed from: h */
    public int f431h;

    /* JADX INFO: renamed from: i */
    public int f432i;

    /* JADX INFO: renamed from: l */
    public C0040l f435l;

    /* JADX INFO: renamed from: c */
    public C0034f f426c = new C0034f();

    /* JADX INFO: renamed from: d */
    public int f427d = 0;

    /* JADX INFO: renamed from: e */
    public int f428e = 0;

    /* JADX INFO: renamed from: f */
    public int f429f = 0;

    /* JADX INFO: renamed from: g */
    public int f430g = 0;

    /* JADX INFO: renamed from: j */
    public C0024ax f433j = new C0024ax();

    /* JADX INFO: renamed from: k */
    public Vector f434k = new Vector();

    /* JADX INFO: renamed from: m */
    public C0022av f436m = new C0022av();

    /* JADX INFO: renamed from: n */
    public C0025ay f437n = new C0025ay();

    /* JADX INFO: renamed from: o */
    public C0034f f438o = new C0034f();

    public C0033e(C0003ac c0003ac, C0040l c0040l) {
        this.f424a = c0003ac;
        this.f435l = c0040l;
    }

    /* JADX INFO: renamed from: c */
    private void m266c(int i) {
        this.f427d += (int) ((102943 * ((long) i)) >> 16);
        if (this.f427d > 411774) {
            this.f427d -= 411774;
        }
        m267d();
    }

    /* JADX INFO: renamed from: d */
    private void m267d() {
        C0031c.m230b(this.f438o, this.f427d);
        this.f424a.m285a(this.f438o);
    }

    /* JADX INFO: renamed from: d */
    private void m268d(int i) {
        this.f427d -= (int) ((102943 * ((long) i)) >> 16);
        if (this.f427d < 0) {
            this.f427d += 411774;
        }
        m267d();
    }

    /* JADX INFO: renamed from: e */
    private void m269e() {
        this.f424a.m36r();
        this.f424a.m30g(this.f436m.f246b);
    }

    /* JADX INFO: renamed from: e */
    private void m270e(int i) {
        this.f428e += (int) ((102943 * ((long) ((int) (((((long) i) << 32) / 131072) >> 16)))) >> 16);
        if (this.f428e > 25735) {
            this.f428e = 25735;
        }
        C0031c.m220a(this.f426c, this.f428e);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    /* JADX INFO: renamed from: f */
    private void m271f() {
        int i;
        int i2 = -205887;
        this.f437n.m172a();
        if ((this.f431h & 1) <= 0) {
            if ((this.f431h & 2) > 0) {
                this.f437n.f249a -= 524288;
                i = -205887;
            }
            C0031c.m219a(this.f437n, this.f424a.f455K);
            if ((this.f431h & 64) > 0) {
                if ((this.f431h & 128) > 0) {
                    this.f437n.f251c -= 327680;
                    i2 = 205887;
                }
                this.f424a.m256c(this.f437n);
            }
            this.f437n.f251c += 327680;
            this.f430g = i2;
            this.f424a.m256c(this.f437n);
        }
        this.f437n.f249a += 524288;
        i = 205887;
        this.f430g = i;
        C0031c.m219a(this.f437n, this.f424a.f455K);
        if ((this.f431h & 64) > 0) {
            if ((this.f431h & 128) > 0) {
                this.f437n.f251c -= 327680;
                i2 = 205887;
            }
            this.f424a.m256c(this.f437n);
        }
        this.f437n.f251c += 327680;
        this.f430g = i2;
        this.f424a.m256c(this.f437n);
    }

    /* JADX INFO: renamed from: f */
    private void m272f(int i) {
        this.f428e -= (int) ((102943 * ((long) ((int) (((((long) i) << 32) / 131072) >> 16)))) >> 16);
        if (this.f428e < -25735) {
            this.f428e = -25735;
        }
        C0031c.m220a(this.f426c, this.f428e);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f7  */
    /* JADX INFO: renamed from: g */
    private void m273g() {
        C0003ac c0003ac;
        AbstractC0050v abstractC0050v;
        int iM233c;
        C0003ac c0003ac2;
        C0040l c0040l;
        int i;
        int i2;
        int i3;
        int iM233c2;
        int i4 = 57344;
        int i5 = 0;
        int i6 = -1;
        int iM39u = this.f424a.m39u();
        C0013am c0013amM99k = C0013am.m99k();
        C0031c.m217a(this.f437n, this.f436m.f246b, iM39u);
        C0031c.m216a(this.f437n, this.f436m.f245a);
        this.f433j.m170a(iM39u * 2);
        C0031c.m213a(this.f433j, this.f437n);
        if (this.f424a.f19P == null || this.f424a.f19P.f533c != 8192) {
            c0013amM99k.f120A.m61a(this.f433j, this.f434k);
            int i7 = this.f424a.f19P != null ? this.f424a.f19P.f533c : 1024;
            C0025ay c0025ay = this.f424a.f454J;
            int size = this.f434k.size() - 1;
            int i8 = 57344;
            AbstractC0050v abstractC0050v2 = null;
            while (size >= 0) {
                C0032d c0032d = (C0032d) this.f434k.elementAt(size);
                int i9 = c0032d.f453I;
                if ((i9 & 1024) == 0) {
                    abstractC0050v = abstractC0050v2;
                } else {
                    abstractC0050v = (AbstractC0050v) c0032d;
                    if (abstractC0050v == this.f424a || (i9 & i7) == 0) {
                        abstractC0050v = abstractC0050v2;
                    } else if (this.f424a.f19P != null) {
                        C0031c.m229b(this.f437n, abstractC0050v.f454J, c0025ay);
                        C0031c.m239d(this.f437n);
                        iM233c = C0031c.m233c(this.f437n, this.f436m.f246b);
                        if (iM233c > i8) {
                            i8 = iM233c;
                        } else {
                            abstractC0050v = abstractC0050v2;
                        }
                    } else if (!abstractC0050v.m332l()) {
                        abstractC0050v = abstractC0050v2;
                    } else if ((i9 & 2048) > 0) {
                        abstractC0050v = abstractC0050v2;
                    } else {
                        C0031c.m229b(this.f437n, abstractC0050v.f454J, c0025ay);
                        C0031c.m239d(this.f437n);
                        iM233c = C0031c.m233c(this.f437n, this.f436m.f246b);
                        if (iM233c > i8) {
                            i8 = iM233c;
                        } else {
                            abstractC0050v = abstractC0050v2;
                        }
                    }
                }
                size--;
                abstractC0050v2 = abstractC0050v;
            }
            this.f434k.removeAllElements();
            if (this.f424a.f34g != abstractC0050v2) {
                if (abstractC0050v2 != null) {
                    c0003ac = this.f424a;
                } else {
                    c0003ac = this.f424a;
                    abstractC0050v2 = null;
                }
                c0003ac.f34g = abstractC0050v2;
            }
            if (this.f435l != null) {
                if (this.f424a.f34g != null) {
                    if (this.f435l.f451G == null) {
                        c0013amM99k.f120A.m16a((C0037i) this.f435l);
                    }
                } else if (this.f435l.f451G != null) {
                    c0013amM99k.f120A.m18b((C0037i) this.f435l);
                }
            }
            this.f424a.f33f = -1;
            return;
        }
        boolean zM286c = this.f424a.f19P.m286c(4096);
        boolean z = !zM286c;
        int i10 = -1;
        while (i5 < c0013amM99k.f121B) {
            if (!C0031c.m222a(c0013amM99k.f122C[i5], this.f433j)) {
                iM233c2 = i4;
            } else if (z && c0013amM99k.f123D[i5] == null) {
                iM233c2 = i4;
            } else if (zM286c && c0013amM99k.f123D[i5] != null && (c0013amM99k.f123D[i5].f6g != this.f424a.f20Q || !c0013amM99k.f123D[i5].m2a((C0041m) this.f424a.f19P))) {
                iM233c2 = i4;
            } else if (c0013amM99k.f123D[i5] == null && ((C0041m) this.f424a.f19P).f485a.f446g == null) {
                iM233c2 = i4;
            } else {
                C0031c.m229b(this.f437n, c0013amM99k.f122C[i5], this.f424a.f454J);
                C0031c.m239d(this.f437n);
                iM233c2 = C0031c.m233c(this.f437n, this.f436m.f246b);
                if (iM233c2 > i4) {
                    i10 = i5;
                } else {
                    iM233c2 = i4;
                }
            }
            i5++;
            i4 = iM233c2;
        }
        if (i10 == -1) {
            if (this.f435l != null && this.f435l.f451G != null) {
                c0013amM99k.f120A.m18b((C0037i) this.f435l);
            }
            c0003ac2 = this.f424a;
        } else {
            if (this.f424a.f33f == i10) {
                return;
            }
            if (this.f435l != null) {
                if (c0013amM99k.f123D[i10] == null) {
                    c0040l = this.f435l;
                    i = c0013amM99k.f122C[i10].f249a;
                    i2 = c0013amM99k.f122C[i10].f250b;
                    i3 = c0013amM99k.f122C[i10].f251c;
                } else {
                    c0040l = this.f435l;
                    i = c0013amM99k.f122C[i10].f249a;
                    i2 = c0013amM99k.f122C[i10].f250b;
                    i3 = c0013amM99k.f122C[i10].f251c + c0013amM99k.f123D[i10].f416s.f248b.f251c;
                }
                c0040l.mo251a(i, i2, i3 + 131072);
                if (this.f435l.f451G == null) {
                    c0013amM99k.f120A.m16a((C0037i) this.f435l);
                }
            }
            c0003ac2 = this.f424a;
            i6 = i10;
        }
        c0003ac2.f33f = i6;
        this.f424a.f34g = null;
    }

    /* JADX INFO: renamed from: g */
    private void m274g(int i) {
        if (!this.f424a.f21R && this.f424a.f406i != 1) {
            this.f424a.m256c(C0031c.f376a);
        }
        if (this.f430g > 0) {
            this.f430g -= i * 6;
            if (this.f430g >= 0) {
                return;
            }
        } else {
            if (this.f430g >= 0) {
                return;
            }
            this.f430g += i * 6;
            if (this.f430g <= 0) {
                return;
            }
        }
        this.f430g = 0;
    }

    /* JADX INFO: renamed from: h */
    private void m275h() {
        this.f436m.f246b.m173a(65536, 0, 0);
        C0031c.m219a(this.f436m.f246b, this.f426c);
        C0031c.m219a(this.f436m.f246b, this.f424a.f455K);
        C0031c.m215a(this.f436m.f246b, 458752);
        this.f436m.f245a.m174a(this.f424a.f454J);
        C0031c.m227b(this.f436m.f245a, this.f436m.f246b);
        this.f436m.f245a.f251c += 98304;
        C0031c.m239d(this.f436m.f246b);
    }

    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    /* JADX INFO: renamed from: h */
    private void m276h(int i) {
        int i2;
        this.f429f += (int) ((((long) ((int) ((((long) this.f430g) * ((long) i)) >> 16))) * 131072) >> 16);
        if (this.f429f <= 411774) {
            if (this.f429f < 0) {
                i2 = this.f429f + 411774;
            }
            C0031c.m230b(this.f438o, this.f429f);
            if (this.f424a.f30a.m286c(4)) {
                this.f424a.f30a.m285a(this.f438o);
            }
        }
        i2 = this.f429f - 411774;
        this.f429f = i2;
        C0031c.m230b(this.f438o, this.f429f);
        if (this.f424a.f30a.m286c(4)) {
            this.f424a.f30a.m285a(this.f438o);
        }
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: a */
    public final void mo107a() {
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: a */
    public final void mo108a(int i) {
        this.f427d = i;
        m267d();
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: b */
    public final void mo118b() {
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: b */
    public final void mo119b(int i) {
        boolean z;
        int i2 = this.f424a.f452H.f45a;
        int iM209a = C0031c.m209a(i);
        if ((this.f431h & 256) > 0) {
            if (!this.f425b) {
                m269e();
                z = true;
                this.f425b = z;
            }
        } else if (this.f425b) {
            z = false;
            this.f425b = z;
        }
        if ((this.f431h & 4) > 0) {
            m266c(iM209a);
        } else if ((this.f431h & 8) > 0) {
            m268d(iM209a);
        }
        if ((this.f431h & 32) > 0) {
            m270e(iM209a);
        } else if ((this.f431h & 16) > 0) {
            m272f(iM209a);
        }
        if (!this.f424a.m38t() || (this.f431h & 195) <= 0) {
            m274g(iM209a);
        } else {
            m271f();
        }
        if (this.f430g != 0) {
            m276h(iM209a);
        }
        if (this.f424a.m38t()) {
            if (this.f432i < i2) {
                this.f432i = i2 + 500;
                m273g();
            }
        } else if (this.f435l != null && this.f435l.f451G != null) {
            C0013am.m99k().f120A.m18b((C0037i) this.f435l);
        }
        AbstractC0050v abstractC0050v = this.f424a.f34g;
        if (this.f435l != null && abstractC0050v != null) {
            C0025ay c0025ay = abstractC0050v.f454J;
            this.f435l.mo251a(c0025ay.f249a, c0025ay.f250b, c0025ay.f251c + this.f424a.f416s.f248b.f251c + 131072);
        }
        m275h();
        this.f424a.m37s();
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: c */
    public final void mo123c() {
    }
}
