package p000;

import java.util.Vector;

/* JADX INFO: renamed from: ag */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0007ag extends C0038j {

    /* JADX INFO: renamed from: A */
    public C0025ay f49A;

    /* JADX INFO: renamed from: B */
    public C0025ay f50B;

    /* JADX INFO: renamed from: C */
    public C0028ba f51C;

    /* JADX INFO: renamed from: P */
    public C0028ba f52P;

    /* JADX INFO: renamed from: Q */
    public C0022av f53Q;

    /* JADX INFO: renamed from: R */
    public C0024ax f54R;

    /* JADX INFO: renamed from: S */
    public C0024ax f55S;

    /* JADX INFO: renamed from: T */
    public C0024ax f56T;

    /* JADX INFO: renamed from: U */
    public C0025ay f57U;

    /* JADX INFO: renamed from: V */
    public C0025ay f58V;

    /* JADX INFO: renamed from: W */
    public C0025ay f59W;

    /* JADX INFO: renamed from: X */
    public C0025ay f60X;

    /* JADX INFO: renamed from: a */
    public C0032d[] f61a;

    /* JADX INFO: renamed from: b */
    public int f62b;

    /* JADX INFO: renamed from: c */
    public int f63c;

    /* JADX INFO: renamed from: d */
    public C0025ay f64d;

    /* JADX INFO: renamed from: e */
    public int f65e;

    /* JADX INFO: renamed from: f */
    public int f66f;

    /* JADX INFO: renamed from: g */
    public int f67g;

    /* JADX INFO: renamed from: h */
    public int f68h;

    /* JADX INFO: renamed from: i */
    public C0028ba[] f69i;

    /* JADX INFO: renamed from: j */
    public C0032d[] f70j;

    /* JADX INFO: renamed from: k */
    public int f71k;

    /* JADX INFO: renamed from: l */
    public C0032d[] f72l;

    /* JADX INFO: renamed from: m */
    public int f73m;

    /* JADX INFO: renamed from: n */
    public int f74n;

    /* JADX INFO: renamed from: o */
    public int f75o;

    /* JADX INFO: renamed from: p */
    public C0013am f76p;

    /* JADX INFO: renamed from: q */
    public C0025ay f77q;

    /* JADX INFO: renamed from: r */
    public C0025ay f78r;

    /* JADX INFO: renamed from: s */
    public C0025ay f79s;

    /* JADX INFO: renamed from: t */
    public C0025ay f80t;

    /* JADX INFO: renamed from: u */
    public C0025ay f81u;

    /* JADX INFO: renamed from: v */
    public C0025ay f82v;

    /* JADX INFO: renamed from: w */
    public C0025ay f83w;

    /* JADX INFO: renamed from: x */
    public C0025ay f84x;

    /* JADX INFO: renamed from: y */
    public C0025ay f85y;

    /* JADX INFO: renamed from: z */
    public C0025ay f86z;

    public C0007ag(C0006af c0006af) {
        super(c0006af);
        this.f61a = new C0032d[0];
        this.f64d = new C0025ay();
        this.f69i = new C0028ba[0];
        this.f70j = new C0032d[0];
        this.f71k = 0;
        this.f72l = new C0032d[0];
        this.f73m = 0;
        this.f77q = new C0025ay();
        this.f78r = new C0025ay();
        this.f79s = new C0025ay();
        this.f80t = new C0025ay();
        this.f81u = new C0025ay();
        this.f82v = new C0025ay();
        this.f83w = new C0025ay();
        this.f84x = new C0025ay();
        this.f85y = new C0025ay();
        this.f86z = new C0025ay();
        this.f49A = new C0025ay();
        this.f50B = new C0025ay();
        this.f51C = new C0028ba();
        this.f52P = new C0028ba();
        new C0025ay();
        new C0025ay();
        this.f53Q = new C0022av();
        new C0022av();
        this.f54R = new C0024ax();
        new C0024ax();
        new C0024ax();
        this.f55S = new C0024ax();
        new C0024ax();
        this.f56T = new C0024ax();
        this.f57U = new C0025ay();
        this.f58V = new C0025ay();
        this.f59W = new C0025ay();
        this.f60X = new C0025ay();
        m53a();
    }

    /* JADX INFO: renamed from: a */
    private int m52a(C0024ax c0024ax, C0032d[] c0032dArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 >= this.f71k) {
                return i3;
            }
            if (C0031c.m221a(c0024ax, this.f70j[i2].f417t)) {
                c0032dArr[i3] = this.f70j[i2];
                i = i3 + 1;
            } else {
                i = i3;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m53a() {
        m68e(4);
        this.f68h = C0031c.m231c(1000);
        m63b(C0031c.f382g);
        this.f63c = 0;
        m69f(this.f66f << 1);
        this.f75o = 4;
    }

    /* JADX INFO: renamed from: a */
    private void m54a(C0022av c0022av, C0024ax c0024ax, C0028ba c0028ba) {
        C0025ay c0025ay;
        C0025ay c0025ay2;
        C0024ax c0024ax2 = this.f56T;
        c0024ax2.m171a(c0024ax);
        if (!C0031c.m222a(c0022av.f245a, c0024ax2)) {
            c0028ba.f330a = C0031c.m211a(c0022av, c0024ax2, c0028ba.f331b, c0028ba.f332c);
            return;
        }
        int iAbs = Math.abs(c0022av.f245a.f249a - c0024ax2.f247a.f249a);
        int iAbs2 = Math.abs(c0022av.f245a.f250b - c0024ax2.f247a.f250b);
        int iAbs3 = Math.abs(c0022av.f245a.f251c - c0024ax2.f247a.f251c);
        int iAbs4 = Math.abs(c0022av.f245a.f249a - c0024ax2.f248b.f249a);
        int iAbs5 = Math.abs(c0022av.f245a.f250b - c0024ax2.f248b.f250b);
        int iAbs6 = Math.abs(c0022av.f245a.f251c - c0024ax2.f248b.f251c);
        if (iAbs > iAbs2 || iAbs > iAbs3 || iAbs > iAbs4 || iAbs > iAbs5 || iAbs > iAbs6) {
            if (iAbs2 > iAbs3 || iAbs2 > iAbs4 || iAbs2 > iAbs5 || iAbs2 > iAbs6) {
                if (iAbs3 > iAbs4 || iAbs3 > iAbs5 || iAbs3 > iAbs6) {
                    if (iAbs4 > iAbs5 || iAbs4 > iAbs6) {
                        if (iAbs5 <= iAbs6) {
                            if (C0031c.m233c(c0022av.f246b, C0031c.f379d) >= 0) {
                                return;
                            }
                            c0025ay = c0028ba.f332c;
                            c0025ay2 = C0031c.f379d;
                        } else {
                            if (C0031c.m233c(c0022av.f246b, C0031c.f381f) >= 0) {
                                return;
                            }
                            c0025ay = c0028ba.f332c;
                            c0025ay2 = C0031c.f381f;
                        }
                    } else {
                        if (C0031c.m233c(c0022av.f246b, C0031c.f377b) >= 0) {
                            return;
                        }
                        c0025ay = c0028ba.f332c;
                        c0025ay2 = C0031c.f377b;
                    }
                } else {
                    if (C0031c.m233c(c0022av.f246b, C0031c.f382g) >= 0) {
                        return;
                    }
                    c0025ay = c0028ba.f332c;
                    c0025ay2 = C0031c.f382g;
                }
            } else {
                if (C0031c.m233c(c0022av.f246b, C0031c.f380e) >= 0) {
                    return;
                }
                c0025ay = c0028ba.f332c;
                c0025ay2 = C0031c.f380e;
            }
        } else {
            if (C0031c.m233c(c0022av.f246b, C0031c.f378c) >= 0) {
                return;
            }
            c0025ay = c0028ba.f332c;
            c0025ay2 = C0031c.f378c;
        }
        c0025ay.m174a(c0025ay2);
        c0028ba.f330a = 0;
        c0028ba.f331b.m174a(c0022av.f245a);
    }

    /* JADX INFO: renamed from: a */
    private void m55a(C0032d c0032d, C0025ay c0025ay, C0025ay c0025ay2, C0028ba c0028ba) {
        c0028ba.f330a = -65536;
        if (c0032d.f406i == 1) {
            return;
        }
        C0022av c0022av = this.f53Q;
        c0022av.m169a(c0025ay, c0025ay2);
        for (int i = 0; i < this.f73m; i++) {
            C0032d c0032d2 = this.f72l[i];
            if (c0032d != c0032d2 && c0032d2.f406i == 0) {
                this.f52P.m184a();
                this.f52P.f334e = c0032d2;
                C0024ax c0024ax = this.f55S;
                c0024ax.m171a(c0032d2.f416s);
                C0031c.m213a(c0024ax, c0032d2.f407j);
                C0031c.m227b(c0024ax.f248b, c0032d.f416s.f247a);
                C0031c.m227b(c0024ax.f247a, c0032d.f416s.f248b);
                m54a(c0022av, c0024ax, this.f52P);
                if (this.f52P.f330a >= 0) {
                    if (c0028ba.f330a >= 0 && this.f52P.f330a >= c0028ba.f330a) {
                        if (c0028ba.f330a == this.f52P.f330a) {
                            C0031c.m216a(c0028ba.f332c, this.f52P.f332c);
                            if (!C0031c.m235c(c0028ba.f332c, this.f66f)) {
                            }
                        }
                    }
                    c0028ba.m185a(this.f52P);
                }
            }
        }
        if (this.f76p != null) {
            this.f76p.m111a(c0022av, c0032d, this.f52P);
            if (this.f52P.f330a >= 0) {
                if (c0028ba.f330a >= 0 && this.f52P.f330a >= c0028ba.f330a) {
                    if (c0028ba.f330a != this.f52P.f330a) {
                        return;
                    }
                    C0031c.m216a(c0028ba.f332c, this.f52P.f332c);
                    if (C0031c.m235c(c0028ba.f332c, this.f66f)) {
                        return;
                    }
                }
                c0028ba.m185a(this.f52P);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m56a(C0032d c0032d, C0025ay c0025ay, C0032d c0032d2, int i, C0025ay c0025ay2) {
        c0025ay2.m174a(C0031c.f376a);
        if (c0032d2 == null || c0032d.f405h <= 0 || c0032d2.f405h == 0) {
            return;
        }
        C0025ay c0025ay3 = this.f57U;
        c0025ay3.m174a(C0031c.f376a);
        C0025ay c0025ay4 = this.f58V;
        c0025ay4.m174a(C0031c.f376a);
        C0025ay c0025ay5 = this.f59W;
        c0025ay5.m174a(C0031c.f376a);
        C0025ay c0025ay6 = this.f60X;
        c0025ay6.m174a(C0031c.f376a);
        int iM233c = ((int) ((((long) ((int) ((((long) C0031c.m233c(this.f64d, c0032d.f423z)) * ((long) c0032d.f414q)) >> 16))) * ((long) c0032d.f405h)) >> 16)) + C0031c.m233c(c0032d.f409l, c0032d.f423z);
        C0031c.m229b(c0025ay3, c0025ay, c0032d2.f408k);
        int iM232c = C0031c.m232c(c0025ay3);
        C0031c.m228b(c0025ay6, c0025ay3, iM232c);
        if (iM233c == 0 || iM232c <= 0) {
            return;
        }
        C0031c.m217a(c0025ay4, c0025ay6, iM233c);
        C0031c.m217a(c0025ay2, c0025ay4, c0032d.f412o);
        C0031c.m217a(c0025ay5, c0025ay3, -c0032d.f405h);
        C0031c.m226b(c0025ay5, i);
        C0031c.m215a(c0025ay6, C0031c.m233c(c0032d.f409l, c0025ay6));
        C0031c.m216a(c0025ay5, c0025ay6);
        if (C0031c.m225b(c0025ay5) > C0031c.m225b(c0025ay2)) {
            C0031c.m217a(c0025ay2, c0025ay4, c0032d.f413p);
        } else {
            c0025ay2.m174a(c0025ay5);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m57d(C0025ay c0025ay) {
        int i;
        int i2;
        int i3 = 0;
        if (c0025ay.f249a >= this.f67g) {
            i = this.f66f;
        } else {
            i = c0025ay.f249a <= (-this.f67g) ? -this.f66f : 0;
        }
        c0025ay.f249a = i;
        if (c0025ay.f250b >= this.f67g) {
            i2 = this.f66f;
        } else {
            i2 = c0025ay.f250b <= (-this.f67g) ? -this.f66f : 0;
        }
        c0025ay.f250b = i2;
        if (c0025ay.f251c >= this.f67g) {
            i3 = this.f66f;
        } else if (c0025ay.f251c <= (-this.f67g)) {
            i3 = -this.f66f;
        }
        c0025ay.f251c = i3;
    }

    /* JADX INFO: renamed from: e */
    private boolean m58e(C0025ay c0025ay) {
        return c0025ay.f249a < this.f66f && c0025ay.f249a > (-this.f66f) && c0025ay.f250b < this.f66f && c0025ay.f250b > (-this.f66f) && c0025ay.f251c < this.f66f && c0025ay.f251c > (-this.f66f);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x035c  */
    /* JADX WARN: Code duplicated, block: B:116:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:132:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x04da  */
    /* JADX WARN: Code duplicated, block: B:140:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x0518  */
    /* JADX WARN: Code duplicated, block: B:146:0x0522  */
    /* JADX WARN: Code duplicated, block: B:148:0x058b  */
    /* JADX WARN: Code duplicated, block: B:149:0x058e  */
    /* JADX WARN: Code duplicated, block: B:152:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:157:0x0602  */
    /* JADX WARN: Code duplicated, block: B:159:0x0608  */
    /* JADX WARN: Code duplicated, block: B:162:0x0619  */
    /* JADX WARN: Code duplicated, block: B:164:0x061d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0631  */
    /* JADX WARN: Code duplicated, block: B:166:0x063c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0647  */
    /* JADX WARN: Code duplicated, block: B:172:0x065d A[LOOP:1: B:48:0x01cf->B:172:0x065d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x068c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0691  */
    /* JADX WARN: Code duplicated, block: B:186:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x063f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x037b A[EDGE_INSN: B:194:0x037b->B:104:0x037b BREAK  A[LOOP:1: B:48:0x01cf->B:172:0x065d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x01af  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x0242  */
    /* JADX WARN: Code duplicated, block: B:93:0x0311  */
    /* JADX INFO: renamed from: g */
    private void m59g(int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        C0032d c0032d;
        int i4;
        int iM233c;
        int i5;
        C0025ay c0025ay = this.f77q;
        c0025ay.m172a();
        C0025ay c0025ay2 = this.f78r;
        c0025ay2.m172a();
        this.f79s.m172a();
        C0025ay c0025ay3 = this.f80t;
        c0025ay3.m172a();
        C0025ay c0025ay4 = this.f81u;
        c0025ay4.m172a();
        C0025ay c0025ay5 = this.f82v;
        c0025ay5.m172a();
        C0025ay c0025ay6 = this.f83w;
        c0025ay6.m172a();
        C0025ay c0025ay7 = this.f84x;
        c0025ay7.m172a();
        C0025ay c0025ay8 = this.f85y;
        c0025ay8.m172a();
        C0025ay c0025ay9 = this.f86z;
        c0025ay9.m172a();
        this.f49A.m172a();
        this.f50B.m172a();
        C0028ba c0028ba = this.f51C;
        c0028ba.m184a();
        int i6 = 0;
        int iM209a = C0031c.m209a(i);
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= this.f71k) {
                break;
            }
            C0032d c0032d2 = this.f70j[i8];
            if (c0032d2.f419v) {
                C0032d c0032d3 = c0032d2.f422y;
                m56a(c0032d2, c0032d2.f408k, c0032d3, iM209a, c0025ay7);
                int i9 = c0032d2.f405h > 0 ? (int) ((281474976710656L / ((long) c0032d2.f405h)) >> 16) : 0;
                if (this.f63c == 0) {
                    C0031c.m217a(c0025ay5, this.f64d, (int) ((((long) c0032d2.f414q) * ((long) iM209a)) >> 16));
                    C0031c.m218a(c0025ay3, c0032d2.f408k, c0025ay5);
                    if (c0032d2.f405h != 0) {
                        C0031c.m217a(c0025ay5, c0032d2.f408k, c0032d2.f415r);
                        C0031c.m229b(c0025ay5, c0032d2.f409l, c0025ay5);
                        C0031c.m216a(c0025ay5, c0025ay7);
                        C0031c.m215a(c0025ay5, (int) ((((long) iM209a) * ((long) i9)) >> 16));
                        C0031c.m216a(c0025ay3, c0025ay5);
                    }
                } else if (this.f63c == 1) {
                    C0031c.m217a(c0025ay8, this.f64d, (int) ((((long) c0032d2.f414q) * ((long) iM209a)) >> 16));
                    c0025ay9.m174a(c0025ay8);
                    if (c0032d2.f405h != 0) {
                        C0031c.m217a(c0025ay5, c0032d2.f408k, c0032d2.f415r);
                        C0031c.m229b(c0025ay5, c0032d2.f409l, c0025ay5);
                        C0031c.m216a(c0025ay5, c0025ay7);
                        C0031c.m215a(c0025ay5, (int) ((((long) iM209a) * ((long) i9)) >> 16));
                        C0031c.m216a(c0025ay8, c0025ay5);
                        c0025ay4.m174a(c0025ay7);
                        C0031c.m218a(c0025ay5, c0032d2.f408k, c0025ay8);
                        m56a(c0032d2, c0025ay5, c0032d3, iM209a, c0025ay7);
                        C0031c.m215a(c0025ay5, c0032d2.f415r);
                        C0031c.m229b(c0025ay5, c0032d2.f409l, c0025ay5);
                        C0031c.m216a(c0025ay5, c0025ay7);
                        C0031c.m215a(c0025ay5, (int) ((((long) iM209a) * ((long) i9)) >> 16));
                        C0031c.m216a(c0025ay8, c0025ay5);
                        C0031c.m216a(c0025ay7, c0025ay4);
                        C0031c.m215a(c0025ay7, 32768);
                    }
                    C0031c.m218a(c0025ay5, c0025ay8, c0025ay9);
                    C0031c.m215a(c0025ay5, 32768);
                    C0031c.m218a(c0025ay3, c0032d2.f408k, c0025ay5);
                }
                if (c0032d3 != null && !c0032d3.m262h()) {
                    C0031c.m217a(c0025ay4, c0025ay7, -65536);
                    c0032d3.m257d(c0025ay4);
                }
                if (c0025ay3.f249a > this.f68h) {
                    c0025ay3.f249a = this.f68h;
                }
                if (c0025ay3.f249a < (-this.f68h)) {
                    c0025ay3.f249a = -this.f68h;
                }
                if (c0025ay3.f250b > this.f68h) {
                    c0025ay3.f250b = this.f68h;
                }
                if (c0025ay3.f250b < (-this.f68h)) {
                    c0025ay3.f250b = -this.f68h;
                }
                if (c0025ay3.f251c > this.f68h) {
                    c0025ay3.f251c = this.f68h;
                }
                if (c0025ay3.f251c < (-this.f68h)) {
                    c0025ay3.f251c = -this.f68h;
                }
                c0025ay.m174a(c0032d2.f407j);
                if (this.f63c == 0) {
                    C0031c.m217a(c0025ay4, c0025ay3, iM209a);
                } else {
                    if (this.f63c == 1 || this.f63c == 2) {
                        C0031c.m217a(c0025ay8, c0032d2.f408k, iM209a);
                        C0031c.m217a(c0025ay9, c0025ay3, iM209a);
                        C0031c.m218a(c0025ay4, c0025ay8, c0025ay9);
                        C0031c.m215a(c0025ay4, 32768);
                    }
                    c0032d2.f408k.m174a(c0025ay3);
                    c0032d2.m263i();
                    if (c0032d2.f406i != 1) {
                        m65c(c0025ay);
                        m65c(c0025ay2);
                        C0031c.m229b(c0025ay4, c0025ay2, c0025ay);
                        if (m58e(c0025ay4)) {
                            c0025ay2.m174a(c0025ay);
                            z = true;
                        } else {
                            if (c0025ay4.f249a < 0) {
                                c0025ay4.f249a = (int) ((((long) c0025ay4.f249a) * (-65536)) >> 16);
                            }
                            if (c0025ay4.f250b < 0) {
                                c0025ay4.f250b = (int) ((((long) c0025ay4.f250b) * (-65536)) >> 16);
                            }
                            if (c0025ay4.f251c < 0) {
                                c0025ay4.f251c = (int) ((((long) c0025ay4.f251c) * (-65536)) >> 16);
                            }
                            i5 = c0025ay4.f249a;
                            if (c0025ay4.f250b > i5) {
                                i5 = c0025ay4.f250b;
                            }
                            if (c0025ay4.f251c > i5) {
                                i5 = c0025ay4.f251c;
                            }
                            int i10 = i5 + this.f66f;
                            C0024ax c0024ax = this.f54R;
                            c0024ax.m171a(c0032d2.f416s);
                            C0031c.m213a(c0024ax, c0025ay2);
                            c0024ax.f247a.f249a -= i10;
                            c0024ax.f247a.f250b -= i10;
                            c0024ax.f247a.f251c -= i10;
                            c0024ax.f248b.f249a += i10;
                            c0024ax.f248b.f250b += i10;
                            C0025ay c0025ay10 = c0024ax.f248b;
                            c0025ay10.f251c = i10 + c0025ay10.f251c;
                            this.f73m = m52a(c0024ax, this.f72l);
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    z2 = true;
                    i2 = 0;
                    while (!z) {
                        if (z2) {
                            m65c(c0025ay);
                            m65c(c0025ay2);
                            C0031c.m229b(c0025ay4, c0025ay2, c0025ay);
                            if (m58e(c0025ay4)) {
                                c0025ay2.m174a(c0025ay);
                                break;
                            }
                        } else {
                            z2 = false;
                        }
                        m55a(c0032d2, c0025ay, c0025ay2, c0028ba);
                        if (c0028ba.f330a < 0) {
                            break;
                        }
                        if (c0028ba.f330a == 0 || c0028ba.f334e == null || c0028ba.f334e.f405h != -65536) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        c0032d2.f402A = z3;
                        if (c0028ba.f334e != c0032d2.f422y || (c0032d2.f418u == null && c0028ba.f334e.f418u == null)) {
                            i3 = i6;
                        } else {
                            c0028ba.f335f = c0032d2;
                            C0031c.m229b(c0028ba.f333d, c0032d2.f408k, c0028ba.f334e.f408k);
                            this.f69i[i6].m185a(c0028ba);
                            i3 = i6 + 1;
                        }
                        c0032d = c0028ba.f334e;
                        if (c0032d2.f411n) {
                            i4 = c0032d2.f410m;
                        } else {
                            i4 = (int) (((((long) (c0032d2.f410m + c0032d.f410m)) << 32) / 131072) >> 16);
                        }
                        C0031c.m229b(c0025ay4, c0032d.f408k, c0032d2.f408k);
                        iM233c = (int) ((((long) (i4 + 65536)) * ((long) C0031c.m233c(c0025ay4, c0028ba.f332c))) >> 16);
                        c0025ay4.m172a();
                        if (c0032d2.f405h == 0 && c0032d.f405h != 0) {
                            int i11 = c0032d2.m262h() ? 0 : (int) ((281474976710656L / ((long) c0032d2.f405h)) >> 16);
                            int i12 = c0032d.m262h() ? 0 : (int) ((281474976710656L / ((long) c0032d.f405h)) >> 16);
                            int i13 = (int) (((((long) iM233c) << 32) / ((long) (i11 + i12))) >> 16);
                            if (!c0032d2.m262h()) {
                                C0031c.m217a(c0025ay5, c0028ba.f332c, i13);
                                C0031c.m215a(c0025ay5, i11);
                                C0031c.m216a(c0032d2.f408k, c0025ay5);
                            }
                            if (!c0032d.m262h() && c0032d2.f406i == 0) {
                                if (c0032d2.m262h()) {
                                    C0031c.m229b(c0025ay4, c0032d.f408k, c0032d2.f408k);
                                    C0031c.m217a(c0025ay4, c0028ba.f332c, (int) ((131072 * ((long) C0031c.m233c(c0025ay4, c0028ba.f332c))) >> 16));
                                } else {
                                    C0031c.m217a(c0025ay4, c0028ba.f332c, i13);
                                    C0031c.m215a(c0025ay4, i12);
                                }
                            }
                        } else if (c0032d.f405h != 0 && c0032d2.f406i == 0) {
                            C0031c.m217a(c0025ay4, c0028ba.f332c, iM233c);
                        } else if (c0032d2.f405h == 0) {
                            C0031c.m217a(c0025ay5, c0028ba.f332c, iM233c);
                            C0031c.m216a(c0032d2.f408k, c0025ay5);
                        }
                        if (C0031c.m225b(c0025ay4) >= this.f74n) {
                            c0032d.f419v = true;
                            C0031c.m227b(c0032d.f408k, c0025ay4);
                        }
                        m65c(c0028ba.f331b);
                        c0025ay4.m174a(c0028ba.f332c);
                        m57d(c0025ay4);
                        C0031c.m216a(c0025ay4, c0028ba.f331b);
                        C0031c.m229b(c0025ay6, c0025ay2, c0025ay4);
                        if (c0032d2.f406i == 0 && c0028ba.f334e.f406i == 0) {
                            if (c0032d2.f421x == c0028ba.f334e) {
                                c0032d2.f422y = c0028ba.f334e;
                                c0032d2.f423z.m174a(c0028ba.f332c);
                            } else {
                                c0032d2.f421x = c0028ba.f334e;
                                c0032d2.f422y = null;
                            }
                        }
                        if (m58e(c0025ay6)) {
                            c0025ay2.m174a(c0025ay4);
                            i6 = i3;
                            break;
                        }
                        if (i2 > 4) {
                            c0025ay2.m174a(c0025ay4);
                            i6 = i3;
                            break;
                        } else {
                            if (!C0031c.m236c(c0025ay3, c0032d2.f408k, this.f66f)) {
                                c0025ay2.m174a(c0025ay4);
                                i6 = i3;
                                break;
                            }
                            c0025ay.m174a(c0025ay4);
                            C0031c.m215a(c0025ay3, C0031c.m232c(c0025ay6));
                            C0031c.m217a(c0025ay4, c0028ba.f332c, C0031c.m233c(c0025ay3, c0028ba.f332c));
                            C0031c.m227b(c0025ay3, c0025ay4);
                            C0031c.m218a(c0025ay2, c0025ay, c0025ay3);
                            i6 = i3;
                            i2++;
                        }
                    }
                    if (c0028ba.f330a < 0 && i2 == 0) {
                        if (c0032d2.f422y == null && c0032d2.f406i == 0 && c0032d2.f422y.f406i == 0) {
                            c0032d2.f421x = c0032d2.f422y;
                            c0032d2.f422y = null;
                        } else {
                            c0032d2.f421x = null;
                        }
                    }
                    if (C0031c.m238d(c0025ay2, c0032d2.f407j) < this.f74n) {
                        c0032d2.f420w++;
                        if (c0032d2.f420w > this.f75o) {
                            c0032d2.f419v = false;
                        }
                    } else {
                        c0032d2.f420w = 0;
                    }
                    c0032d2.m259e(c0025ay2);
                }
                C0031c.m218a(c0025ay2, c0025ay, c0025ay4);
                c0032d2.f408k.m174a(c0025ay3);
                c0032d2.m263i();
                if (c0032d2.f406i != 1) {
                    m65c(c0025ay);
                    m65c(c0025ay2);
                    C0031c.m229b(c0025ay4, c0025ay2, c0025ay);
                    if (m58e(c0025ay4)) {
                        c0025ay2.m174a(c0025ay);
                        z = true;
                    } else {
                        if (c0025ay4.f249a < 0) {
                            c0025ay4.f249a = (int) ((((long) c0025ay4.f249a) * (-65536)) >> 16);
                        }
                        if (c0025ay4.f250b < 0) {
                            c0025ay4.f250b = (int) ((((long) c0025ay4.f250b) * (-65536)) >> 16);
                        }
                        if (c0025ay4.f251c < 0) {
                            c0025ay4.f251c = (int) ((((long) c0025ay4.f251c) * (-65536)) >> 16);
                        }
                        i5 = c0025ay4.f249a;
                        if (c0025ay4.f250b > i5) {
                            i5 = c0025ay4.f250b;
                        }
                        if (c0025ay4.f251c > i5) {
                            i5 = c0025ay4.f251c;
                        }
                        int i14 = i5 + this.f66f;
                        C0024ax c0024ax2 = this.f54R;
                        c0024ax2.m171a(c0032d2.f416s);
                        C0031c.m213a(c0024ax2, c0025ay2);
                        c0024ax2.f247a.f249a -= i14;
                        c0024ax2.f247a.f250b -= i14;
                        c0024ax2.f247a.f251c -= i14;
                        c0024ax2.f248b.f249a += i14;
                        c0024ax2.f248b.f250b += i14;
                        C0025ay c0025ay11 = c0024ax2.f248b;
                        c0025ay11.f251c = i14 + c0025ay11.f251c;
                        this.f73m = m52a(c0024ax2, this.f72l);
                        z = false;
                    }
                } else {
                    z = false;
                }
                z2 = true;
                i2 = 0;
                while (!z) {
                    if (z2) {
                        m65c(c0025ay);
                        m65c(c0025ay2);
                        C0031c.m229b(c0025ay4, c0025ay2, c0025ay);
                        if (m58e(c0025ay4)) {
                            c0025ay2.m174a(c0025ay);
                            break;
                        }
                    } else {
                        z2 = false;
                    }
                    m55a(c0032d2, c0025ay, c0025ay2, c0028ba);
                    if (c0028ba.f330a < 0) {
                        break;
                        break;
                    }
                    if (c0028ba.f330a == 0) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    c0032d2.f402A = z3;
                    if (c0028ba.f334e != c0032d2.f422y) {
                        i3 = i6;
                    } else {
                        i3 = i6;
                    }
                    c0032d = c0028ba.f334e;
                    if (c0032d2.f411n) {
                        i4 = c0032d2.f410m;
                    } else {
                        i4 = (int) (((((long) (c0032d2.f410m + c0032d.f410m)) << 32) / 131072) >> 16);
                    }
                    C0031c.m229b(c0025ay4, c0032d.f408k, c0032d2.f408k);
                    iM233c = (int) ((((long) (i4 + 65536)) * ((long) C0031c.m233c(c0025ay4, c0028ba.f332c))) >> 16);
                    c0025ay4.m172a();
                    if (c0032d2.f405h == 0) {
                        if (c0032d.f405h != 0) {
                            if (c0032d2.f405h == 0) {
                                C0031c.m217a(c0025ay5, c0028ba.f332c, iM233c);
                                C0031c.m216a(c0032d2.f408k, c0025ay5);
                            }
                        } else if (c0032d2.f405h == 0) {
                            C0031c.m217a(c0025ay5, c0028ba.f332c, iM233c);
                            C0031c.m216a(c0032d2.f408k, c0025ay5);
                        }
                    } else if (c0032d.f405h != 0) {
                        if (c0032d2.f405h == 0) {
                            C0031c.m217a(c0025ay5, c0028ba.f332c, iM233c);
                            C0031c.m216a(c0032d2.f408k, c0025ay5);
                        }
                    } else if (c0032d2.f405h == 0) {
                        C0031c.m217a(c0025ay5, c0028ba.f332c, iM233c);
                        C0031c.m216a(c0032d2.f408k, c0025ay5);
                    }
                    if (C0031c.m225b(c0025ay4) >= this.f74n) {
                        c0032d.f419v = true;
                        C0031c.m227b(c0032d.f408k, c0025ay4);
                    }
                    m65c(c0028ba.f331b);
                    c0025ay4.m174a(c0028ba.f332c);
                    m57d(c0025ay4);
                    C0031c.m216a(c0025ay4, c0028ba.f331b);
                    C0031c.m229b(c0025ay6, c0025ay2, c0025ay4);
                    if (c0032d2.f406i == 0) {
                        if (c0032d2.f421x == c0028ba.f334e) {
                            c0032d2.f422y = c0028ba.f334e;
                            c0032d2.f423z.m174a(c0028ba.f332c);
                        } else {
                            c0032d2.f421x = c0028ba.f334e;
                            c0032d2.f422y = null;
                        }
                    }
                    if (m58e(c0025ay6)) {
                        c0025ay2.m174a(c0025ay4);
                        i6 = i3;
                        break;
                    }
                    if (i2 > 4) {
                        c0025ay2.m174a(c0025ay4);
                        i6 = i3;
                        break;
                    } else {
                        if (!C0031c.m236c(c0025ay3, c0032d2.f408k, this.f66f)) {
                            c0025ay2.m174a(c0025ay4);
                            i6 = i3;
                            break;
                        }
                        c0025ay.m174a(c0025ay4);
                        C0031c.m215a(c0025ay3, C0031c.m232c(c0025ay6));
                        C0031c.m217a(c0025ay4, c0028ba.f332c, C0031c.m233c(c0025ay3, c0028ba.f332c));
                        C0031c.m227b(c0025ay3, c0025ay4);
                        C0031c.m218a(c0025ay2, c0025ay, c0025ay3);
                        i6 = i3;
                        i2++;
                    }
                }
                if (c0028ba.f330a < 0) {
                    if (c0032d2.f422y == null) {
                        c0032d2.f421x = null;
                    } else {
                        c0032d2.f421x = null;
                    }
                }
                if (C0031c.m238d(c0025ay2, c0032d2.f407j) < this.f74n) {
                    c0032d2.f420w++;
                    if (c0032d2.f420w > this.f75o) {
                        c0032d2.f419v = false;
                    }
                } else {
                    c0032d2.f420w = 0;
                }
                c0032d2.m259e(c0025ay2);
            }
            i7 = i8 + 1;
        }
        for (int i15 = 0; i15 < i6; i15++) {
            C0028ba c0028ba2 = this.f69i[i15];
            C0003ac c0003ac = c0028ba2.f335f.f418u;
            if (c0003ac != null) {
                c0003ac.m25a(c0028ba2);
            }
            C0032d c0032d4 = c0028ba2.f334e;
            c0028ba2.f334e = c0028ba2.f335f;
            c0028ba2.f335f = c0032d4;
            C0003ac c0003ac2 = c0028ba2.f335f.f418u;
            if (c0032d4.f406i == 0 && c0003ac2 != null) {
                C0031c.m214a(c0028ba2.f332c);
                C0031c.m214a(c0028ba2.f333d);
                c0003ac2.m25a(c0028ba2);
            }
        }
    }

    @Override // p000.C0038j
    /* JADX INFO: renamed from: a */
    public final void mo60a(int i) {
        super.mo60a(i);
        m59g(i);
        for (int i2 = this.f62b - 1; i2 >= 0; i2--) {
            this.f61a[i2].m258e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m61a(C0024ax c0024ax, Vector vector) {
        int iM52a = m52a(c0024ax, this.f72l);
        vector.setSize(iM52a);
        for (int i = 0; i < iM52a; i++) {
            vector.setElementAt(this.f72l[i], i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m62a(C0032d c0032d) {
        int i = 0;
        while (i < this.f62b && this.f61a[i] != c0032d) {
            i++;
        }
        if (i == this.f62b) {
            if (this.f61a.length < this.f62b + 1) {
                C0032d[] c0032dArr = new C0032d[this.f62b + 1];
                System.arraycopy(this.f61a, 0, c0032dArr, 0, this.f61a.length);
                this.f61a = c0032dArr;
            }
            this.f61a[this.f62b] = c0032d;
            this.f62b++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m63b(C0025ay c0025ay) {
        this.f64d.m174a(c0025ay);
        for (int i = 0; i < this.f71k; i++) {
            this.f70j[i].f419v = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m64b(C0032d c0032d) {
        int i = 0;
        while (i < this.f62b && this.f61a[i] != c0032d) {
            i++;
        }
        if (i != this.f62b) {
            this.f61a[i] = null;
            System.arraycopy(this.f61a, i + 1, this.f61a, i, this.f62b - (i + 1));
            this.f62b--;
            this.f61a[this.f62b] = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m65c(C0025ay c0025ay) {
        c0025ay.f249a = (c0025ay.f249a << this.f65e) >> this.f65e;
        c0025ay.f250b = (c0025ay.f250b << this.f65e) >> this.f65e;
        c0025ay.f251c = (c0025ay.f251c << this.f65e) >> this.f65e;
    }

    /* JADX INFO: renamed from: c */
    public final void m66c(C0032d c0032d) {
        int i = 0;
        while (i < this.f71k && this.f70j[i] != c0032d) {
            i++;
        }
        if (i == this.f71k) {
            if (this.f70j.length < this.f71k + 1) {
                C0032d[] c0032dArr = new C0032d[this.f71k + 1];
                System.arraycopy(this.f70j, 0, c0032dArr, 0, this.f70j.length);
                this.f70j = c0032dArr;
                this.f72l = new C0032d[this.f70j.length];
                C0028ba[] c0028baArr = new C0028ba[this.f70j.length];
                System.arraycopy(this.f69i, 0, c0028baArr, 0, this.f69i.length);
                c0028baArr[this.f70j.length - 1] = new C0028ba();
                this.f69i = c0028baArr;
            }
            this.f70j[this.f71k] = c0032d;
            this.f71k++;
            c0032d.f419v = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m67d(C0032d c0032d) {
        int i = 0;
        c0032d.f422y = null;
        c0032d.f421x = null;
        for (int i2 = 0; i2 < this.f71k; i2++) {
            C0032d c0032d2 = this.f70j[i2];
            if (c0032d2.f421x == c0032d) {
                c0032d2.f421x = null;
            }
            if (c0032d2.f422y == c0032d) {
                c0032d2.f422y = null;
            }
        }
        while (i < this.f71k && this.f70j[i] != c0032d) {
            i++;
        }
        if (i != this.f71k) {
            this.f70j[i] = null;
            System.arraycopy(this.f70j, i + 1, this.f70j, i, this.f71k - (i + 1));
            this.f71k--;
            this.f70j[this.f71k] = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m68e(int i) {
        this.f65e = i;
        this.f66f = 1 << this.f66f;
        this.f67g = this.f66f >> 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m69f(int i) {
        this.f74n = C0031c.m210a(i, i);
    }
}
