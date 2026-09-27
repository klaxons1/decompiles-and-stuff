package p000;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: C:\Temp\jadx-12448572193422856954\classes.dex */
final class C0013n extends C0004e {

    /* JADX INFO: renamed from: G */
    static int f666G;

    /* JADX INFO: renamed from: I */
    static int f668I;

    /* JADX INFO: renamed from: J */
    static int f669J;

    /* JADX INFO: renamed from: K */
    static int f670K;

    /* JADX INFO: renamed from: Q */
    private static int f671Q;

    /* JADX INFO: renamed from: R */
    private static int f672R;

    /* JADX INFO: renamed from: e */
    private static C0004e f674e;

    /* JADX INFO: renamed from: f */
    private static C0004e f675f;

    /* JADX INFO: renamed from: f */
    private static boolean f676f;

    /* JADX INFO: renamed from: L */
    private int f677L;

    /* JADX INFO: renamed from: M */
    private int f678M;

    /* JADX INFO: renamed from: N */
    private int f679N;

    /* JADX INFO: renamed from: d */
    private boolean f682d;

    /* JADX INFO: renamed from: e */
    private boolean f684e;

    /* JADX INFO: renamed from: H */
    static int f667H = -1;

    /* JADX INFO: renamed from: c */
    public static boolean f673c = false;

    /* JADX INFO: renamed from: d */
    private int[] f683d = new int[15];

    /* JADX INFO: renamed from: O */
    private int f680O = 3;

    /* JADX INFO: renamed from: P */
    private int f681P = 0;

    C0013n() {
    }

    /* JADX INFO: renamed from: A */
    private void m397A() {
        C0004e c0004eM405a;
        if ((m278c() == 13 || m278c() == 12 || m278c() == 199) && m278c() == 200) {
            return;
        }
        C0003d.m70a(1, 12, false);
        if (m409d(1) && (c0004eM405a = m405a(false, false)) != null && c0004eM405a.f462f != Integer.MIN_VALUE) {
            mo213a(200, 14);
        } else if (m227b() >= 5632) {
            mo213a(13, 14);
        } else {
            mo213a(12, 14);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m398B() {
        if ((m412f(m278c()) || m278c() == 13 || m278c() == 12 || m278c() == 199) && m278c() == 200) {
            return;
        }
        mo213a(199, 14);
        C0003d.m70a(1, 22, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:140:0x0250  */
    /* JADX WARN: Code duplicated, block: B:281:0x0459  */
    /* JADX WARN: Code duplicated, block: B:283:0x0460  */
    /* JADX WARN: Code duplicated, block: B:285:0x046b  */
    /* JADX WARN: Code duplicated, block: B:288:0x0476  */
    /* JADX WARN: Code duplicated, block: B:289:0x047b  */
    /* JADX WARN: Code duplicated, block: B:291:0x0481  */
    /* JADX WARN: Code duplicated, block: B:299:0x04a0  */
    /* JADX INFO: renamed from: C */
    private void m399C() {
        boolean z;
        boolean z2;
        boolean zM83a = C0003d.m83a(2304, true);
        boolean zM83a2 = C0003d.m83a(128, true);
        boolean zM83a3 = C0003d.m83a(512, true);
        if (m278c() < 0) {
            mo213a(0, 0);
        }
        if (((C0004e) this).f459d != null && !((C0004e) this).f459d.m224a((C0004e) this, false)) {
            ((C0004e) this).f459d = null;
        }
        int iM278c = m278c();
        if (C0003d.m83a(16416, true) && this.f467j != 19) {
            m416l(7680);
        }
        int iM414i = m429f() ? m414i(m278c()) : iM278c;
        if (iM414i == 0 || iM414i == 2 || iM414i == 3 || iM414i == 4 || iM414i == 6 || iM414i == 69 || iM414i == 10 || iM414i == 11 || iM414i == 160 || iM414i == 240 || iM414i == 239) {
            boolean zM429f = m429f();
            boolean zM83a4 = C0003d.m83a(1028, false);
            boolean zM83a5 = C0003d.m83a(2, false);
            boolean zM83a6 = C0003d.m83a(8, false);
            if (zM83a4 || zM83a5 || zM83a6) {
                if (zM429f) {
                    C0004e.f420A = C0004e.m187d(this.f473u, this.f474v) & 15;
                    f667H = (this.f473u << 16) | this.f474v;
                    if ((C0004e.m147a(this.f473u) & 4096) != 0) {
                        z = false;
                    } else if ((C0004e.m187d(this.f473u, this.f474v) & 8192) != 0) {
                        this.f469l >>= 1;
                    }
                }
                if (zM429f && (C0004e.m187d(this.f473u, this.f474v) & 8192) == 0) {
                    ((C0004e) this).f455b[4] = iM414i;
                    int i = this.f473u;
                    int i2 = this.f474v;
                    if (m430g()) {
                        this.f469l = (this.f506D & 1) == 0 ? Math.abs(this.f469l) : -Math.abs(this.f469l);
                    }
                    if (m409d(4)) {
                        if (m418m()) {
                            mo213a(173, 46);
                            this.f470m = -7680;
                        } else {
                            mo213a(173, 0);
                        }
                        m428d(16, 1537);
                    } else {
                        mo213a(6, 256);
                        m428d(16, 1540);
                    }
                    if (!m418m()) {
                        C0004e.m155a(4096, i, i2);
                        this.f469l = C0004e.f434c[0];
                        this.f470m = C0004e.f434c[1];
                    }
                    ((C0004e) this).f455b[5] = zM83a4 ? 1028 : zM83a5 ? 2 : 8;
                    z = true;
                } else if (iM414i == 0 || iM414i == 10 || iM414i == 11) {
                    boolean z3 = (this.f506D & 1) == 0;
                    ((C0004e) this).f455b[5] = zM83a4 ? 1028 : zM83a5 ? 2 : 8;
                    if ((z3 && zM83a5) || (!z3 && zM83a6)) {
                        m441u();
                    }
                    m428d(16, 1537);
                    this.f470m = -6400;
                    if (!zM83a4) {
                        if (!m409d(4)) {
                            mo213a(6, 4);
                        } else if (m418m()) {
                            this.f470m = 7680;
                            mo213a(173, 36);
                        } else {
                            mo213a(173, 4);
                        }
                        this.f469l = 1280;
                        if (zM83a5) {
                            this.f469l = -1280;
                        }
                    } else if (!m409d(4)) {
                        mo213a(6, 4);
                    } else if (m418m()) {
                        this.f470m = 7680;
                        mo213a(173, 46);
                    } else {
                        mo213a(173, 14);
                    }
                    z = true;
                } else {
                    m428d(16, 1537);
                    ((C0004e) this).f455b[4] = iM414i;
                    this.f470m = -6400;
                    ((C0004e) this).f455b[5] = zM83a4 ? 1028 : zM83a5 ? 2 : 8;
                    if (iM414i == 4 || iM414i == 6) {
                        this.f470m = -6400;
                    }
                    if (!m409d(4)) {
                        mo213a(6, 14);
                    } else if (m418m()) {
                        this.f470m = 7680;
                        mo213a(173, 46);
                    } else {
                        mo213a(173, 14);
                    }
                    z = true;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            C0003d.m70a(1, 14, false);
            return;
        }
        if (m429f()) {
            if ((C0004e.m147a(this.f473u) & 16384) != 0) {
                m428d(16, 0);
                mo213a(9, 14);
                return;
            } else if ((C0004e.m147a(this.f473u) & 4096) != 0 && Math.abs(this.f469l) < 4505) {
                m428d(16, 0);
                mo213a(9, 14);
                return;
            }
        }
        if (!m409d(1)) {
            z2 = false;
        } else if (!C0003d.m83a(16416, (f666G & 1) == 0) || C0004e.f424a == null || m418m()) {
            z2 = false;
        } else if ((iM414i == 0 || iM414i == 2 || iM414i == 10 || iM414i == 11) && (C0004e.f424a.f467j == 0 || C0004e.f424a.f467j == 3)) {
            C0004e c0004eM405a = m405a(true, false);
            if (m429f() || c0004eM405a == null || (!(c0004eM405a.f462f == 65542 || c0004eM405a.f462f == 67) || C0004e.f434c[0] > 27306)) {
                if (c0004eM405a == null || ((!m429f() && (c0004eM405a.f471n & 4202496) == 0) || Math.abs(((C0004e) this).f454b - c0004eM405a.f454b) <= 5120)) {
                    if (!m429f()) {
                        m408c(true);
                        m428d(10, 1);
                        mo213a(226, 0);
                    }
                } else if (C0004e.f424a.f467j == 0) {
                    mo213a(178, 257);
                    z2 = true;
                }
                z2 = false;
            } else {
                int i3 = (c0004eM405a.f472o & 128) != 0 ? 230 : 226;
                if (C0004e.f434c[0] <= 15360) {
                    m408c(true);
                    m428d(10, 1);
                    mo213a(i3, 128);
                } else {
                    C0004e.f425a.m424a(c0004eM405a, 4, i3);
                }
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        int iM278c2 = m278c();
        if ((iM278c2 == 0 || iM278c2 == 2 || iM278c2 == 3 || iM278c2 == 4 || iM278c2 == 10 || iM278c2 == 11) && (zM83a || zM83a2 || zM83a3)) {
            ((C0004e) this).f455b[8] = zM83a ? 2304 : zM83a2 ? 128 : 512;
            if (mo225a(true) && iM278c2 == 0) {
                m441u();
            }
            if (m409d(8)) {
                if ((iM278c2 == 2 || iM278c2 == 3 || iM278c2 == 4) && m227b() != 0) {
                    mo213a(6, 14);
                    return;
                } else {
                    mo213a(15, 142);
                    ((C0004e) this).f455b[9] = 1;
                    return;
                }
            }
            if (iM278c2 != 2 && iM278c2 != 3 && iM278c2 != 4) {
                mo213a(15, 142);
                return;
            }
        }
        switch (iM278c2) {
            case 0:
            case 10:
            case 11:
                if (m429f() && m420o()) {
                    mo213a(m433j(10), 256);
                } else if (m429f() && iM278c2 == 10) {
                    if (mo225a(false)) {
                        mo213a(0, 0);
                    }
                    if (mo233b(false)) {
                        mo213a(2, 17);
                    }
                    break;
                }
                if (mo233b(true)) {
                    mo213a(2, 0);
                    if (m429f()) {
                        this.f477y = 1024;
                    } else {
                        m215a(1024, true, true, this.f679N);
                    }
                }
                if (mo225a(true)) {
                    m441u();
                }
                break;
            case 2:
                boolean z4 = mo225a(true) && (!m429f() || (C0004e.m187d(this.f473u, this.f474v) & 512) == 0);
                if (!z4) {
                    z4 = m429f() ? (this.f468k != 2) && this.f477y == 0 : this.f469l == 0 && !mo233b(true);
                }
                if (z4) {
                    mo213a(0, 0);
                }
                break;
            case 6:
                break;
            case 7:
                if (!C0003d.m83a(((C0004e) this).f455b[8], true)) {
                    if (((C0004e) this).f455b[9] == 1) {
                        m416l(7679);
                        f670K = 22;
                        ((C0004e) this).f455b[9] = 0;
                    }
                    mo213a(6, 14);
                }
                break;
            case 9:
                mo213a(0, 0);
                if (m429f()) {
                    if (m429f()) {
                        if (mo233b(true)) {
                            mo213a(2, 0);
                            if (m429f()) {
                                this.f477y = 1024;
                            } else {
                                m215a(1024, true, true, this.f679N);
                            }
                        }
                        if (mo225a(true)) {
                            m441u();
                        }
                    } else {
                        if (mo233b(true)) {
                            mo213a(2, 0);
                            if (m429f()) {
                                this.f477y = 1024;
                            } else {
                                m215a(1024, true, true, this.f679N);
                            }
                        }
                        if (mo225a(true)) {
                            m441u();
                        }
                    }
                } else if (m429f()) {
                    if (mo233b(true)) {
                        mo213a(2, 0);
                        if (m429f()) {
                            this.f477y = 1024;
                        } else {
                            m215a(1024, true, true, this.f679N);
                        }
                    }
                    if (mo225a(true)) {
                        m441u();
                    }
                } else {
                    if (mo233b(true)) {
                        mo213a(2, 0);
                        if (m429f()) {
                            this.f477y = 1024;
                        } else {
                            m215a(1024, true, true, this.f679N);
                        }
                    }
                    if (mo225a(true)) {
                        m441u();
                    }
                }
                break;
            case 12:
            case 13:
            case 200:
                if (m232b()) {
                    if (iM278c2 == 200) {
                        m441u();
                    }
                    mo213a(0, 0);
                }
                break;
            case 15:
                if (!C0003d.m83a(((C0004e) this).f455b[8], true)) {
                    int iM280d = m280d();
                    int i4 = this.f470m;
                    mo213a(0, -1);
                    m234b();
                    this.f470m = -256;
                    m242g();
                    mo213a(15, 128);
                    m281d(iM280d);
                    m234b();
                    this.f470m = i4;
                    if (((C0004e) this).f453a[1][0] == 0 || this.f467j != 0) {
                        mo213a(0, 0);
                        if (m429f() && this.f468k == 2) {
                            this.f468k = 0;
                        }
                    }
                } else if (m232b() && m409d(8)) {
                    mo213a(7, 14);
                    C0003d.m70a(1, 16, false);
                }
                break;
            case 69:
                if (!m417l()) {
                    m407a(m227b(), true);
                }
                break;
            case 78:
            case 79:
                if (m232b()) {
                    mo213a(9, 14);
                }
                break;
            case 174:
                if (m278c() == 174 && m232b()) {
                    mo213a(0, 0);
                }
                break;
            case 178:
                C0004e.f424a.f455b[4] = 0;
                if (!C0003d.m83a(16416, true)) {
                    int iM413g = m413g();
                    if (iM413g != -1) {
                        mo213a(C0004e.m182c(iM413g) + 190, 128);
                    } else {
                        mo213a(197, 128);
                    }
                } else if (m232b()) {
                    mo213a(179, 0);
                }
                break;
            case 179:
                int[] iArr = C0004e.f424a.f455b;
                iArr[4] = iArr[4] + 1;
                if (!C0003d.m83a(16416, true)) {
                    int iM413g2 = m413g();
                    if (iM413g2 != -1) {
                        mo213a(C0004e.m182c(iM413g2) + 190, 128);
                    } else {
                        mo213a(198, 128);
                    }
                }
                break;
            case 182:
                if (m232b()) {
                    mo213a(0, 0);
                }
                break;
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                if (C0003d.m83a(16416, false) && C0004e.f424a.f467j == 1 && ((C0004e) this).f455b[15] >= 5) {
                    mo213a(201, 128);
                    ((C0004e) this).f455b[26] = 0;
                    int[] iArr2 = ((C0004e) this).f455b;
                    iArr2[15] = iArr2[15] - 5;
                    C0004e.f424a.f467j = 0;
                } else if (m232b() && C0004e.f424a.f467j == 0) {
                    mo213a(0, 0);
                }
                break;
            case 197:
            case 198:
                int[] iArr3 = ((C0004e) this).f455b;
                iArr3[26] = iArr3[26] + 1;
                if (C0003d.m83a(16416, false) && ((C0004e) this).f455b[26] <= 8 && ((C0004e) this).f455b[15] >= 5) {
                    mo213a(201, 128);
                    ((C0004e) this).f455b[26] = 0;
                    int[] iArr4 = ((C0004e) this).f455b;
                    iArr4[15] = iArr4[15] - 5;
                    C0004e.f424a.f467j = 0;
                }
                if (m232b()) {
                    mo213a(0, 0);
                }
                break;
            case 199:
                if (C0003d.m83a(16416, false)) {
                    mo213a(201, 142);
                    ((C0004e) this).f455b[26] = 0;
                    int[] iArr5 = ((C0004e) this).f455b;
                    iArr5[15] = iArr5[15] - 5;
                    C0003d.m70a(1, 22, false);
                }
                if (m232b()) {
                    mo213a(0, 0);
                }
                break;
            case 201:
            case 202:
                if (C0003d.m83a(16416, false) && ((C0004e) this).f455b[15] >= 5) {
                    ((C0004e) this).f455b[26] = 1;
                }
                if (m232b()) {
                    if (((C0004e) this).f455b[26] != 1) {
                        mo213a(203, 142);
                    } else {
                        mo213a(202, 14);
                        ((C0004e) this).f455b[26] = 0;
                        int[] iArr6 = ((C0004e) this).f455b;
                        iArr6[15] = iArr6[15] - 5;
                        C0003d.m70a(1, 22, false);
                    }
                }
                break;
            case 203:
                if (m232b()) {
                    mo213a(0, 0);
                }
                break;
            case 240:
                if (mo233b(true)) {
                    mo213a(239, 0);
                    this.f477y = 1024;
                }
                if (mo225a(true)) {
                    m441u();
                }
                if (!m418m() || C0003d.m83a(2944, true)) {
                    m428d(16, 0);
                    mo213a(9, 32);
                }
                break;
            default:
                m404H();
                break;
        }
        if (C0003d.m57a((C0004e) this) < 0) {
            ((C0004e) this).f455b[20] = 20000;
            return;
        }
        if (Math.abs(m227b()) < 3840) {
            int iM227b = (m227b() * 90) / 100;
            if (m429f()) {
                iM227b = Math.abs(iM227b);
            }
            m214a(iM227b, (this.f506D & 1) == 0);
        }
        m403G();
    }

    /* JADX INFO: renamed from: D */
    private void m400D() {
        if ((C0004e.m147a(this.f473u) & 8192) == 0) {
            m399C();
        } else {
            mo213a(6, 14);
            m218a(this.f469l < 0);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m401E() {
        int iM227b = m227b();
        mo213a(m414i(m278c()), 0);
        C0004e.f420A = -1;
        m234b();
        if (mo233b(true) && m278c() != 182 && m278c() != 181) {
            mo213a(2, 14);
            if (Math.abs(iM227b) < 512) {
                m214a(512, true);
                iM227b = 512;
            }
            m407a(iM227b, false);
            return;
        }
        if (m409d(2) && (m278c() == 9 || m278c() == 8)) {
            mo213a(4, 14);
            m407a(iM227b, true);
            return;
        }
        if ((m278c() == 8 || m278c() == 3 || m278c() == 4 || m278c() == 2 || m278c() == 69 || m278c() == 10 || m278c() == 11) && m407a(iM227b, false)) {
            return;
        }
        if (m278c() == 9 || m278c() == 8 || m278c() == 6) {
            if (m409d(1)) {
                mo213a(174, 128);
                return;
            } else {
                mo213a(0, 128);
                return;
            }
        }
        if (m278c() == 181) {
            mo213a(182, 128);
            C0003d.m68a(3, 3, 7);
        } else if (m278c() == 9) {
            mo213a(0, 0);
        }
    }

    /* JADX INFO: renamed from: F */
    private void m402F() {
        mo213a(80, 128);
        m428d(20, 0);
        ((C0004e) this).f459d = null;
        C0003d.m70a(1, 17, false);
    }

    /* JADX INFO: renamed from: G */
    private void m403G() {
        if (C0003d.f346e) {
            return;
        }
        if (C0004e.f430b == null || C0004e.f430b.f462f != 65539 || (C0004e.f430b.f467j < 35 && C0004e.f430b.f467j != 12)) {
            int[] iArr = ((C0004e) this).f455b;
            iArr[20] = iArr[20] - AbstractRunnableC0012m.f622a_;
            if (((C0004e) this).f455b[20] < 0) {
                ((C0004e) this).f455b[20] = 0;
                mo213a(80, 128);
                m428d(20, 0);
                ((C0004e) this).f459d = null;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    private void m404H() {
        switch (m278c()) {
            case 233:
                if (this.f469l == 0) {
                    mo213a(this.f468k, 128);
                    m428d(10, 1);
                    m426b(true);
                } else {
                    ((C0004e) this).f450a += this.f469l;
                    ((C0004e) this).f450a -= this.f469l;
                    int i = f675f.f450a;
                    int i2 = this.f469l > 0 ? i + f675f.f452a[0] : i + f675f.f452a[2];
                    if (m222a(i2, ((C0004e) this).f454b, 5120)) {
                        ((C0004e) this).f450a = i2;
                        if (this.f469l > 0) {
                            ((C0004e) this).f450a -= ((C0004e) this).f452a[2];
                        } else {
                            ((C0004e) this).f450a -= ((C0004e) this).f452a[0];
                        }
                        f675f = null;
                        this.f469l = 0;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0031 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0031 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private C0004e m405a(boolean z, boolean z2) {
        int iM148a;
        boolean z3 = true;
        C0004e c0004e = null;
        C0004e.f434c[0] = 40960;
        boolean z4 = (this.f506D & 1) == 0;
        if (z) {
            z3 = z4;
        } else if (z4) {
            z3 = false;
        }
        int i = 40960;
        for (int i2 = 0; i2 < C0003d.f408x; i2++) {
            C0004e c0004e2 = C0003d.f275b[i2];
            if ((c0004e2.f471n & 262144) != 0) {
                if (z2) {
                    if (c0004e2.f454b - ((C0004e) this).f454b >= 512) {
                        if (z3) {
                            if (c0004e2.f450a >= ((C0004e) this).f450a) {
                                iM148a = C0004e.m148a(((C0004e) this).f450a - c0004e2.f450a, ((C0004e) this).f454b - c0004e2.f454b);
                                if (iM148a > 40960 && (c0004e == null || (c0004e != null && iM148a < i))) {
                                    C0004e.f434c[0] = iM148a;
                                    i = iM148a;
                                    c0004e = c0004e2;
                                }
                            }
                        } else if (c0004e2.f450a <= ((C0004e) this).f450a) {
                            iM148a = C0004e.m148a(((C0004e) this).f450a - c0004e2.f450a, ((C0004e) this).f454b - c0004e2.f454b);
                            if (iM148a > 40960) {
                            }
                        }
                    }
                } else if (c0004e2.f454b - ((C0004e) this).f454b <= 1280) {
                    if (z3) {
                        if (c0004e2.f450a >= ((C0004e) this).f450a) {
                            iM148a = C0004e.m148a(((C0004e) this).f450a - c0004e2.f450a, ((C0004e) this).f454b - c0004e2.f454b);
                            if (iM148a > 40960) {
                            }
                        }
                    } else if (c0004e2.f450a <= ((C0004e) this).f450a) {
                        iM148a = C0004e.m148a(((C0004e) this).f450a - c0004e2.f450a, ((C0004e) this).f454b - c0004e2.f454b);
                        if (iM148a > 40960) {
                        }
                    }
                }
            }
        }
        return c0004e;
    }

    /* JADX INFO: renamed from: a */
    static void m406a() {
        f667H = -1;
        f668I = 0;
        f674e = null;
        f666G = 0;
    }

    /* JADX INFO: renamed from: a */
    private boolean m407a(int i, boolean z) {
        if (i < 0) {
            i = -i;
        }
        if (m414i(m278c()) == 6) {
            return false;
        }
        if (i >= 5632) {
            mo213a(4, 14);
        } else if (i >= 2048) {
            mo213a(3, 14);
        } else if (i >= 512) {
            mo213a(2, 14);
        } else {
            if (!z) {
                return false;
            }
            mo213a(0, 0);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private void m408c(boolean z) {
        boolean z2 = true;
        if (z) {
            f672R = 0;
            f676f = false;
            return;
        }
        if (C0003d.m83a(16416, false)) {
            f676f = C0003d.f344e - f672R < 6;
            f672R = C0003d.f344e;
        } else {
            if (C0003d.m85a(false)) {
                f672R = 0;
            }
            f676f = false;
        }
        boolean z3 = f676f || C0003d.f344e - f672R < 3;
        switch (m278c()) {
            case 226:
                m214a(512, true);
                ((C0004e) this).f455b[27] = 2;
                if (!m232b()) {
                    z2 = false;
                } else if (z3) {
                    mo213a(227, 0);
                    z2 = false;
                }
                break;
            case 227:
                m214a(512, true);
                ((C0004e) this).f455b[27] = 2;
                if (!m232b()) {
                    z2 = false;
                } else if (z3) {
                    if (m405a(true, false) != null && AbstractRunnableC0012m.m331a() % 2 == 0) {
                        mo213a(229, 0);
                        z2 = false;
                    } else {
                        mo213a(228, 0);
                        z2 = false;
                    }
                }
                break;
            case 228:
            case 229:
                m214a(512, true);
                ((C0004e) this).f455b[27] = 5;
                if (!m232b()) {
                    z2 = false;
                }
                break;
            case 230:
                if (!m232b()) {
                    z2 = false;
                } else {
                    this.f677L = 0;
                    this.f678M = 0;
                    if (z3) {
                        mo213a(231, 128);
                        z2 = false;
                    }
                }
                break;
            case 231:
                if (!m232b()) {
                    z2 = false;
                } else {
                    this.f677L = 0;
                    this.f678M = 0;
                    if (z3) {
                        mo213a(232, 128);
                        z2 = false;
                    }
                }
                break;
            case 232:
                if (!m232b()) {
                    z2 = false;
                } else {
                    this.f677L = 0;
                    this.f678M = 0;
                }
                break;
            default:
                z2 = false;
                break;
        }
        if (z2) {
            f672R = 0;
            f676f = false;
        }
        if (z2) {
            if (this.f677L == 11) {
                this.f677L = 0;
                this.f678M = 0;
            }
            m428d(this.f677L, this.f678M);
            mo213a(0, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    static boolean m409d(int i) {
        return (f666G & i) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static void m410e(int i, int i2) {
        f668I = i;
        f669J = -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: e */
    private boolean m411e(int i) {
        boolean z = false;
        int iM278c = m278c();
        boolean zMo233b = mo233b(true);
        switch (m429f() ? m414i(m278c()) : iM278c) {
            case 0:
            case 10:
            case 11:
                if (i != 0) {
                    mo213a(2, 14);
                    z = true;
                }
                return (!z || iM278c == m278c()) ? z : m411e(i);
            case 2:
                if (i >= 2048) {
                    mo213a(3, 14);
                } else {
                    z = true;
                }
                if (z) {
                    return z;
                }
            case 3:
                if (i >= 5632) {
                    mo213a(4, 14);
                } else if (i >= 2048 || zMo233b) {
                    z = true;
                } else {
                    mo213a(2, 14);
                }
                if (z) {
                    return z;
                }
            case 4:
                if (i >= 5632 || zMo233b) {
                    z = true;
                } else {
                    mo213a(3, 14);
                }
                if (z) {
                    return z;
                }
            case 6:
                if (i >= 512 || zMo233b) {
                    z = true;
                } else {
                    mo213a(2, 14);
                }
                if (z) {
                    return z;
                }
            case 12:
            case 13:
            case 199:
            case 200:
            case 201:
            case 202:
            case 203:
                z = true;
                if (z) {
                    return z;
                }
            case 68:
                z = true;
                if (z) {
                    return z;
                }
            case 69:
                if (i < this.f679N) {
                    z = true;
                }
                if (z) {
                    return z;
                }
            case 82:
            case 95:
            case 108:
            case 121:
            case 134:
            case 147:
            case 182:
                return false;
            case 239:
                z = true;
                if (z) {
                    return z;
                }
            case 240:
                if (i != 0) {
                    mo213a(239, 10);
                    z = true;
                }
                if (z) {
                    return z;
                }
            default:
                if (z) {
                    return z;
                }
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m412f(int i) {
        return i == 199 || i == 201 || i == 202 || i == 203;
    }

    /* JADX INFO: renamed from: g */
    private int m413g() {
        f674e = m405a(true, false);
        int iM364c = (this.f506D & 1) == 0 ? 0 : AbstractRunnableC0012m.f635c_;
        if (f674e != null) {
            if (C0004e.m148a(((C0004e) this).f450a - f674e.f450a, ((C0004e) this).f454b - f674e.f454b) <= 15360) {
                return -1;
            }
            iM364c = AbstractRunnableC0012m.m364c(f674e.f450a - ((C0004e) this).f450a, ((C0004e) this).f454b - f674e.f454b);
        }
        int i = C0004e.f424a.f455b[4];
        int i2 = i <= 6 ? i : 6;
        C0004e.f424a.mo213a(C0004e.m182c(iM364c) + 0, 0);
        int i3 = (i2 * 768) + 14336;
        C0004e.f424a.f506D &= -2;
        C0004e.f424a.f506D |= this.f506D & 1;
        C0004e.f424a.f469l = (AbstractRunnableC0012m.m363c(iM364c) * i3) >> 8;
        C0004e.f424a.f470m = ((-i3) * AbstractRunnableC0012m.m354b(iM364c)) >> 8;
        C0004e.f424a.f455b[3] = iM364c;
        C0004e.f424a.f450a = ((C0004e) this).f450a;
        C0004e.f424a.f454b = ((C0004e) this).f454b + ((C0004e) this).f452a[3];
        C0004e.f424a.f467j = 1;
        C0004e.f424a.f506D &= -8388609;
        C0004e.f424a.f506D |= 33554432;
        C0004e.f424a.m234b();
        return iM364c;
    }

    /* JADX INFO: renamed from: i */
    public static int m414i(int i) {
        if (i >= 17 && i <= 24) {
            return 2;
        }
        if (i >= 26 && i <= 33) {
            return 3;
        }
        if (i >= 35 && i <= 42) {
            return 4;
        }
        if (i >= 44 && i <= 51) {
            return 6;
        }
        if (i >= 70 && i <= 77) {
            return 69;
        }
        if (i >= 83 && i <= 94) {
            return 4;
        }
        if (i >= 96 && i <= 107) {
            return 4;
        }
        if (i >= 135 && i <= 146) {
            return 4;
        }
        if (i >= 109 && i <= 120) {
            return 4;
        }
        if (i >= 122 && i <= 133) {
            return 4;
        }
        if (i < 148 || i > 159) {
            return i;
        }
        return 4;
    }

    /* JADX INFO: renamed from: k */
    static void m415k(int i) {
        ((C0004e) C0004e.f425a).f450a = C0003d.f330c[i].f450a;
        ((C0004e) C0004e.f425a).f454b = C0003d.f330c[i].f454b;
    }

    /* JADX INFO: renamed from: l */
    private void m416l(int i) {
        if (m409d(2)) {
            if (i > this.f679N) {
                this.f679N = i;
            }
            int[] iArr = ((C0004e) this).f455b;
            iArr[15] = iArr[15] - 1;
            if (((C0004e) this).f455b[15] <= 0 && i == 7680) {
                C0003d.f273b = false;
                ((C0004e) this).f455b[15] = 0;
                return;
            }
            int i2 = m429f() ? this.f477y : this.f469l;
            if (C0003d.f411y == 0 && !C0003d.f273b) {
                C0003d.f413z = 0;
                C0003d.f411y = ((C0004e) this).f450a;
                C0003d.f273b = true;
            }
            if (Math.abs(i2) >= i) {
                i = i2;
            } else if ((this.f506D & 1) != 0) {
                i = -i;
            }
            if (m429f()) {
                this.f477y = Math.abs(i);
            } else {
                this.f469l = i;
            }
            if (C0003d.m83a(16416, false)) {
                C0004e.m151a(1073741824, 3, 136, ((C0004e) this).f450a >> 8, ((C0004e) this).f454b >> 8, 30, this.f506D);
                C0003d.m70a(1, 16, false);
            }
            this.f681P = 30;
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m417l() {
        return this.f473u >= 0 && m429f() && (C0004e.m187d(this.f473u, this.f474v) & 512) != 0;
    }

    /* JADX INFO: renamed from: m */
    private boolean m418m() {
        return m429f() && (C0004e.m147a(this.f473u) & 2048) != 0;
    }

    /* JADX INFO: renamed from: n */
    private boolean m419n() {
        if (this.f473u < 0) {
            return false;
        }
        int iM187d = C0004e.m187d(this.f473u, this.f474v);
        if ((32768 & iM187d) != 0) {
            return true;
        }
        C0004e.m173b(this.f473u, this.f474v);
        int iAbs = Math.abs(C0004e.f444q - C0004e.f445r) >> 8;
        int iAbs2 = Math.abs(C0004e.f446s - C0004e.f447t) >> 8;
        if ((C0004e.m147a(this.f473u) & 15) != 1 || (C0004e.m187d(this.f473u, this.f474v) & 4096) != 0) {
            return AbstractRunnableC0012m.m332a(AbstractRunnableC0012m.m364c(iAbs, iAbs2)) >= 50;
        }
        if ((iM187d & 1024) == 0) {
            return m433j(2) != 2;
        }
        if (C0004e.f446s <= C0004e.f447t || ((C0004e) this).f450a <= (C0004e.f444q + C0004e.f445r) / 2) {
            return (C0004e.f446s >= C0004e.f447t || ((C0004e) this).f450a >= (C0004e.f444q + C0004e.f445r) / 2) && iAbs2 >= iAbs / 2;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    private boolean m420o() {
        if ((C0004e.m187d(this.f473u, this.f474v) & 32768) != 0) {
            return true;
        }
        C0004e.m173b(this.f473u, this.f474v);
        int iM332a = AbstractRunnableC0012m.m332a(AbstractRunnableC0012m.m364c(Math.abs(C0004e.f444q - C0004e.f445r) >> 8, Math.abs(C0004e.f446s - C0004e.f447t) >> 8));
        return iM332a > 40 && iM332a < 50;
    }

    /* JADX INFO: renamed from: p */
    private boolean m421p() {
        return this.f682d || this.f681P > 0;
    }

    /* JADX INFO: renamed from: y */
    public static void m422y() {
        f668I = 0;
        f669J = 0;
    }

    /* JADX INFO: renamed from: a */
    final void m423a(int i, int i2, int i3, boolean z, int i4) {
        ((C0004e) this).f452a = new int[4];
        this.f467j = 0;
        this.f468k = 0;
        this.f506D &= -536870913;
        this.f506D &= -8388609;
        this.f506D |= 33554432;
        if (z) {
            this.f506D |= 1;
        } else {
            this.f506D &= -2;
        }
        this.f506D |= -1073741824;
        this.f471n |= 1050624;
        this.f472o |= 4;
        ((C0004e) this).f450a = i2 << 8;
        ((C0004e) this).f454b = i3 << 8;
        super.f461e = 20;
        this.f462f = i;
        ((C0004e) this).f455b = new int[31];
        ((C0004e) this).f455b[14] = 3;
        ((C0004e) this).f455b[13] = 0;
        if (i4 == 0) {
            ((C0004e) this).f455b[15] = 30;
        } else {
            ((C0004e) this).f455b[15] = 60;
        }
        ((C0004e) this).f455b[16] = 0;
        ((C0004e) this).f455b[20] = 20000;
        ((C0004e) this).f455b[21] = 7680;
        ((C0004e) this).f455b[22] = 5000;
        if (C0004e.f433c == null) {
            C0004e.f433c = new C0004e();
        }
        C0003d.m73a((C0004e) this);
        m235c();
        if (i4 != 0) {
            f666G = 5;
        } else if (C0003d.m98b(C0003d.f402v)) {
            f666G = 2;
        } else {
            f666G = 10;
        }
    }

    @Override // p000.C0004e
    /* JADX INFO: renamed from: a */
    final void mo217a(C0004e c0004e, int i) {
        if (C0003d.m107d(4) || f673c) {
            return;
        }
        if (((C0004e) this).f459d != null && ((C0004e) this).f459d.f462f == 45) {
            ((C0004e) this).f459d.mo213a(2, 0);
            ((C0004e) this).f459d.f467j = 8;
            m422y();
            ((C0004e) C0004e.f425a).f459d = null;
        }
        if (((C0004e) this).f455b[25] > 0 && (c0004e.f462f == 65542 || c0004e.f462f == 67)) {
            c0004e.mo217a((C0004e) C0004e.f425a, 0);
            return;
        }
        if (this.f467j != 20) {
            if (i == 5) {
                m402F();
                return;
            }
            if (((C0004e) this).f455b[17] <= 0) {
                if (i != 6) {
                    ((C0004e) this).f455b[17] = 50;
                }
                if (i != 6) {
                    if (!m427b(((C0004e) this).f450a, ((C0004e) this).f454b, 0)) {
                        ((C0004e) this).f455b[18] = 1;
                        ((C0004e) this).f455b[17] = 0;
                        if (mo240e()) {
                            return;
                        }
                    }
                    int[] iArr = ((C0004e) this).f455b;
                    iArr[22] = iArr[22] - ((((C0004e) this).f455b[22] - 2000) >> 2);
                }
                if (i != 3) {
                    if (Math.abs(m227b()) < 3072) {
                        m214a(3072, false);
                    } else {
                        m214a(3072, true);
                    }
                }
                mo213a(79, 142);
                this.f470m = -3072;
                m428d(19, 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m424a(C0004e c0004e, int i, int i2) {
        switch (i) {
            case 1:
                C0004e.f425a.m401E();
                ((C0004e) this).f459d = c0004e;
                if (c0004e.f462f == 47) {
                    ((C0004e) this).f454b = c0004e.f452a[1] - 256;
                } else {
                    ((C0004e) this).f454b = (c0004e.f454b + c0004e.f452a[1]) - 256;
                }
                if (this.f467j == 19) {
                    mo213a(0, 0);
                }
                m428d(3, 0);
                this.f470m = 0;
                break;
            case 4:
                m428d(11, i2);
                for (int i3 = 0; i3 < 3; i3++) {
                    this.f683d[i3 * 5] = ((C0004e) this).f450a;
                    this.f683d[(i3 * 5) + 1] = ((C0004e) this).f454b;
                    this.f683d[(i3 * 5) + 2] = m278c();
                    this.f683d[(i3 * 5) + 3] = m280d();
                    this.f683d[(i3 * 5) + 4] = this.f506D;
                }
                this.f682d = true;
                this.f680O = 3;
                mo213a(233, 0);
                m214a(1, true);
                f675f = c0004e;
                break;
        }
    }

    @Override // p000.C0004e
    /* JADX INFO: renamed from: a */
    public final boolean mo225a(boolean z) {
        if (!m429f()) {
            return super.mo225a(z);
        }
        if (((C0004e) this).f451a || !C0003d.m83a(8776, true)) {
            return ((C0004e) this).f451a && C0003d.m83a(4242, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m425b(int i, boolean z) {
        int iM278c = m278c();
        ((C0004e) this).f454b -= 5120;
        m428d(16, 0);
        mo213a(9, 0);
        this.f470m = 20480;
        while (this.f467j == 16 && this.f470m > 0) {
            m243h();
            mo239e();
        }
        mo213a(iM278c, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m426b(boolean z) {
        if (z) {
            this.f684e = true;
            return;
        }
        this.f684e = false;
        this.f682d = false;
        this.f681P = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m427b(int i, int i2, int i3) {
        if (((C0004e) this).f455b[24] == 1 && i3 <= 0) {
            ((C0004e) this).f455b[24] = 0;
            return true;
        }
        if (((C0004e) this).f455b[13] == 0 && i3 <= 0) {
            return false;
        }
        if (((C0004e) this).f455b[13] > 0) {
            C0003d.m70a(1, 19, false);
        }
        int i4 = i3 <= 0 ? ((C0004e) this).f455b[13] : i3;
        int i5 = i4 / 18;
        if (i4 % 18 > 5) {
            i5++;
        }
        if (i5 == 0) {
            i5 = 1;
        }
        int i6 = i5 > 3 ? 3 : i5;
        int i7 = 0;
        int i8 = 10;
        int i9 = 18;
        int i10 = i4;
        while (i7 < i6) {
            int i11 = i10 < i9 ? i10 : i9;
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                short[] sArr = {0, 8, 10};
                int iM363c = i8 * AbstractRunnableC0012m.m363c((i13 << 8) / 360);
                int iM354b = i8 * AbstractRunnableC0012m.m354b((i13 << 8) / 360);
                C0004e c0004e = new C0004e(65543, 6, i >> 8, (i3 <= 0 ? i2 - 5120 : i2) >> 8, sArr);
                c0004e.f455b[2] = 1;
                c0004e.f472o = 123;
                c0004e.f506D |= 1073741824;
                c0004e.f469l = iM363c;
                if (i6 == 1) {
                    c0004e.f470m = -iM354b;
                } else {
                    c0004e.f470m = iM354b;
                }
                c0004e.m235c();
                i12++;
                i13 += 20;
            }
            i10 -= i11;
            int i14 = i8 + (i7 * 4);
            i7++;
            i8 = i14;
            i9 = i11;
        }
        if (i3 <= 0) {
            ((C0004e) this).f455b[13] = 0;
        }
        return true;
    }

    @Override // p000.C0004e
    /* JADX INFO: renamed from: b */
    public final boolean mo233b(boolean z) {
        if (((C0004e) this).f455b[30] > 0) {
            return true;
        }
        if (!m429f()) {
            return super.mo233b(z);
        }
        if (((C0004e) this).f451a && C0003d.m83a(8776, true)) {
            return true;
        }
        return !((C0004e) this).f451a && C0003d.m83a(4242, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m428d(int i, int i2) {
        if (this.f462f == 196608) {
            this.f677L = this.f467j;
            this.f678M = this.f468k;
        }
        this.f467j = i;
        this.f468k = i2;
        if (this.f462f == 196608) {
            if (C0004e.f425a.m429f() || (this.f467j & Integer.MIN_VALUE) != 0) {
                this.f472o &= -113;
                if (m417l()) {
                    if (this.f477y < 1536) {
                        this.f477y = 1536;
                    }
                    mo213a(69, 14);
                } else {
                    if (m429f() && (C0004e.m147a(this.f473u) & 4096) != 0) {
                        mo213a(68, 14);
                    } else if (m418m()) {
                        mo213a(240, 0);
                    } else if (this.f677L == 10) {
                        mo213a(0, 0);
                    }
                }
            } else {
                this.f472o |= 112;
                this.f473u = -1;
            }
            if (this.f467j == 0) {
                f667H = -1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0367  */
    /* JADX WARN: Code duplicated, block: B:185:0x03af  */
    /* JADX WARN: Code duplicated, block: B:194:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:205:0x0423  */
    /* JADX WARN: Code duplicated, block: B:206:0x0425  */
    /* JADX WARN: Code duplicated, block: B:208:0x0429  */
    /* JADX WARN: Code duplicated, block: B:216:0x0471  */
    /* JADX WARN: Code duplicated, block: B:218:0x0477  */
    /* JADX WARN: Code duplicated, block: B:220:0x047b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0496  */
    /* JADX WARN: Code duplicated, block: B:238:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:241:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:249:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:254:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:261:0x050e  */
    /* JADX WARN: Code duplicated, block: B:277:0x0547  */
    /* JADX WARN: Code duplicated, block: B:279:0x054f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0562  */
    /* JADX WARN: Code duplicated, block: B:284:0x0566  */
    /* JADX WARN: Code duplicated, block: B:289:0x0575  */
    /* JADX WARN: Code duplicated, block: B:290:0x057d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0581  */
    /* JADX WARN: Code duplicated, block: B:293:0x0583  */
    /* JADX WARN: Code duplicated, block: B:295:0x0587  */
    /* JADX WARN: Code duplicated, block: B:296:0x058a  */
    /* JADX WARN: Code duplicated, block: B:298:0x058e  */
    /* JADX WARN: Code duplicated, block: B:299:0x0591  */
    /* JADX WARN: Code duplicated, block: B:301:0x0595  */
    /* JADX WARN: Code duplicated, block: B:314:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:762:0x0dec  */
    @Override // p000.C0004e
    /* JADX INFO: renamed from: e */
    final void mo239e() {
        boolean z;
        boolean z2;
        int iM278c;
        int iM414i;
        int i;
        int iM148a;
        C0004e c0004eM405a;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (m278c() == 166) {
            ((C0004e) this).f454b -= 256;
            if (m232b()) {
                this.f506D |= 33554432;
                mo213a(0, 1);
                C0004e.f431b = false;
            }
            m234b();
            this.f467j = 0;
        }
        if (m409d(1) && ((C0004e) this).f455b[15] < 20 && C0003d.f344e % 4 == 0) {
            ((C0004e) this).f455b[15] = ((C0004e) this).f455b[15] + 1;
        }
        if (f670K > 0) {
            f670K--;
        }
        m236c();
        if (((C0004e) this).f455b[17] > 0) {
            int[] iArr = ((C0004e) this).f455b;
            iArr[17] = iArr[17] - 1;
        }
        if (((C0004e) this).f455b[25] == 1) {
            C0003d.m66a(0);
            C0003d.m92b(0);
        }
        if (((C0004e) this).f455b[25] > 0) {
            int[] iArr2 = ((C0004e) this).f455b;
            iArr2[25] = iArr2[25] - 1;
        }
        if (((C0004e) this).f455b[30] > 0) {
            int[] iArr3 = ((C0004e) this).f455b;
            iArr3[30] = iArr3[30] - 1;
        }
        ((C0004e) this).f455b[0] = this.f469l;
        ((C0004e) this).f455b[1] = this.f470m;
        ((C0004e) this).f455b[11] = ((C0004e) this).f450a;
        ((C0004e) this).f455b[12] = ((C0004e) this).f454b;
        this.f475w = ((C0004e) this).f450a;
        this.f476x = ((C0004e) this).f454b;
        f674e = null;
        if (C0003d.m107d(0)) {
            if (C0003d.m83a(4112, true)) {
                ((C0004e) this).f450a -= 5120;
            }
            if (C0003d.m83a(8256, true)) {
                ((C0004e) this).f450a += 5120;
            }
            if (C0003d.m83a(1028, true)) {
                ((C0004e) this).f454b -= 5120;
            }
            if (C0003d.m83a(2304, true)) {
                ((C0004e) this).f454b += 5120;
            }
            m234b();
            this.f467j = 0;
            return;
        }
        if (((C0004e) this).f455b[10] == 1) {
            ((C0004e) this).f450a = ((C0004e) this).f455b[11];
            ((C0004e) this).f454b = ((C0004e) this).f455b[12];
            return;
        }
        if (m417l()) {
            super.f461e = -10;
        } else {
            super.f461e = 20;
        }
        if ((f671Q & 1) != 0) {
            if (!(C0003d.m83a(8, true) && (this.f506D & 1) == 0) && (!C0003d.m83a(2, true) || (this.f506D & 1) == 0)) {
                f671Q &= -2;
                C0003d.f169D &= -4097;
            } else if ((this.f506D & 1) == 0) {
                C0003d.f169D |= 8192;
            } else {
                C0003d.f169D |= 4096;
            }
        }
        if (this.f467j == 20) {
            this.f506D &= -33554433;
            ((C0004e) this).f455b[25] = 0;
            ((C0004e) this).f455b[24] = 0;
            if (m232b()) {
                if (((C0004e) this).f455b[14] <= 0) {
                    C0003d.m118g();
                    return;
                }
                int i2 = ((C0004e) this).f455b[14];
                C0003d.m106d();
                ((C0004e) C0004e.f425a).f455b[14] = i2 - 1;
                return;
            }
            return;
        }
        if ((((C0004e) this).f453a[2][0] & 32) != 0) {
            m402F();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        switch (this.f467j) {
            case 0:
                m399C();
                break;
            case 1:
                m400D();
                break;
            case 2:
                m400D();
                break;
            case 3:
                if (((C0004e) this).f459d == null || !((C0004e) this).f459d.m224a((C0004e) this, false)) {
                    ((C0004e) this).f459d = null;
                    m428d(16, 0);
                } else {
                    m399C();
                    int iM278c2 = m278c();
                    if (iM278c2 == 180) {
                        this.f469l = 0;
                        this.f470m = 0;
                        if (m232b()) {
                            mo213a(181, 0);
                        }
                    } else if (iM278c2 == 181) {
                        mo213a(182, 128);
                        C0003d.m68a(3, 3, 7);
                    } else if (iM278c2 == 173) {
                        mo213a(9, 46);
                    }
                }
                break;
            case 5:
                switch (m278c()) {
                    case 176:
                        if (m232b()) {
                            m428d(16, 16);
                            mo213a(173, 0);
                            this.f469l = Math.max(Math.abs((AbstractRunnableC0012m.m363c(((C0004e) this).f455b[23]) * 3072) >> 8), 512);
                            if ((this.f506D & 1) != 0) {
                                this.f469l = -this.f469l;
                            }
                            this.f470m = -3072;
                        }
                        break;
                    case 248:
                        if (m232b()) {
                            if (f675f.f462f == 42) {
                                ((C0004e) this).f459d = f675f;
                                ((C0004e) this).f459d.f455b[7] = 0;
                                ((C0004e) this).f459d.f467j = 1;
                                ((C0004e) this).f459d.m231b(this);
                                ((C0004e) this).f459d.f455b[9] = (this.f506D & 1) == 0 ? 0 : 1;
                                ((C0004e) this).f459d.f455b[6] = ((this.f506D & 1) == 0 ? -1 : 1) * (AbstractRunnableC0012m.f631b_ - (AbstractRunnableC0012m.m364c(Math.abs(((C0004e) this).f450a - f675f.f450a), Math.abs(f675f.f454b - ((C0004e) this).f454b)) % AbstractRunnableC0012m.f631b_));
                                int[] iArr4 = ((C0004e) this).f459d.f455b;
                                iArr4[6] = iArr4[6] << 8;
                                this.f467j = 7;
                                mo213a(81, 0);
                                ((C0004e) this).f459d.m246k();
                            } else {
                                ((C0004e) this).f450a = f675f.f450a;
                                ((C0004e) this).f454b = f675f.f454b;
                                this.f469l = 1024;
                                ((C0004e) this).f455b[23] = AbstractRunnableC0012m.f631b_ / 2;
                                C0004e.f425a.m428d(5, 0);
                                C0004e.f425a.mo213a(176, 128);
                            }
                            f675f = null;
                        }
                        break;
                }
                break;
            case 7:
                boolean zM83a = C0003d.m83a(1028, false);
                boolean zM83a2 = C0003d.m83a(2, false);
                boolean zM83a3 = C0003d.m83a(8, false);
                if (((C0004e) this).f459d != null) {
                    ((C0004e) this).f459d.m231b(this);
                }
                if (zM83a || zM83a2 || zM83a3) {
                    m428d(16, 1537);
                    ((C0004e) this).f455b[4] = 0;
                    this.f470m -= 6400;
                    if (zM83a2) {
                        this.f469l -= 768;
                        this.f506D |= 1;
                    }
                    if (zM83a3) {
                        this.f469l += 768;
                        this.f506D &= -2;
                    }
                    ((C0004e) this).f455b[5] = zM83a ? 1028 : zM83a2 ? 2 : 8;
                    int iM303a = ((RunnableC0006g) C0004e.f425a).f509a.m303a(81);
                    int i3 = ((C0004e) this).f459d.f455b[6] / 1661;
                    if (Math.abs(i3) >= (iM303a / 2) - 1) {
                        this.f506D &= -2;
                        this.f469l = 2048;
                        this.f470m = -6400;
                        if (i3 < 0) {
                            this.f506D |= 1;
                            this.f469l = -this.f469l;
                        }
                    }
                    if (m409d(4)) {
                        mo213a(173, 46);
                    } else {
                        mo213a(6, 46);
                    }
                    ((C0004e) this).f459d.f467j = 2;
                    ((C0004e) this).f459d = null;
                }
                break;
            case 10:
                m408c(false);
                break;
            case 11:
                m404H();
                break;
            case 16:
                int iM278c3 = m278c();
                if (((C0004e) this).f459d != null && !((C0004e) this).f459d.m224a((C0004e) this, true)) {
                    ((C0004e) this).f459d = null;
                }
                if (iM278c3 == 180) {
                    this.f469l = 0;
                    this.f470m = 0;
                    if (m232b()) {
                        mo213a(181, 0);
                        this.f470m = 4608;
                    }
                } else {
                    int iM57a = C0003d.m57a((C0004e) this);
                    if (iM57a >= 0 && (this.f468k & 32768) == 0) {
                        C0004e.m151a(1073741824, 0, 165, ((C0004e) this).f450a >> 8, C0003d.f279b[iM57a][1] >> 8, 30, 0);
                    }
                    if (iM57a >= 0) {
                        this.f468k |= 32768;
                        m403G();
                    } else {
                        this.f468k &= -32769;
                        ((C0004e) this).f455b[20] = 20000;
                    }
                    if ((this.f468k & 1024) != 0 && m409d(2) && C0003d.m83a(16416, false) && m278c() == 6 && !C0003d.m98b(C0003d.f402v) && (c0004eM405a = m405a(true, true)) != null && C0004e.m148a(((C0004e) this).f450a - c0004eM405a.f450a, ((C0004e) this).f454b - c0004eM405a.f454b) <= 40960) {
                        ((C0004e) this).f455b[28] = c0004eM405a.f450a;
                        ((C0004e) this).f455b[29] = c0004eM405a.f454b;
                        this.f681P = 30;
                        this.f468k |= 2048;
                    } else if ((this.f468k & 2048) == 0) {
                        if ((this.f468k & 16) != 0 && m409d(4) && C0003d.m83a(16416, true)) {
                            C0004e c0004e = null;
                            int i4 = 15360;
                            C0004e.f434c[0] = 15360;
                            boolean z7 = (this.f506D & 1) == 0;
                            for (int i5 = 0; i5 < C0003d.f408x; i5++) {
                                C0004e c0004e2 = C0003d.f275b[i5];
                                if ((c0004e2.f471n & 8192) != 0) {
                                    if (z7) {
                                        if (c0004e2.f450a >= ((C0004e) this).f450a) {
                                            iM148a = C0004e.m148a(((C0004e) this).f450a - c0004e2.f450a, ((C0004e) this).f454b - c0004e2.f454b);
                                            if (iM148a > 15360 && (c0004e == null || (c0004e != null && iM148a < i4))) {
                                                C0004e.f434c[0] = iM148a;
                                                c0004e = c0004e2;
                                                i4 = iM148a;
                                            }
                                        }
                                    } else if (c0004e2.f450a <= ((C0004e) this).f450a) {
                                        iM148a = C0004e.m148a(((C0004e) this).f450a - c0004e2.f450a, ((C0004e) this).f454b - c0004e2.f454b);
                                        if (iM148a > 15360) {
                                        }
                                    }
                                }
                            }
                            if (c0004e != null) {
                                C0004e.f425a.mo213a(248, 128);
                                C0004e.f425a.m428d(5, 0);
                                ((C0004e) C0004e.f425a).f454b = c0004e.f454b + 7936;
                                f675f = c0004e;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (iM278c3 == 180 && iM278c3 != 181 && C0003d.m83a(16416, true) && m409d(1) && ((C0004e) this).f455b[15] >= 20) {
                                int[] iArr5 = ((C0004e) this).f455b;
                                iArr5[15] = iArr5[15] - 20;
                                mo213a(180, 128);
                                this.f469l = 0;
                                this.f470m = 0;
                            } else if (this.f470m == 0 || (((C0004e) this).f453a[2][0] & 16) == 0) {
                                if (((this.f468k & 64) != 0 || this.f470m > 0) && (((this.f468k & 128) == 0 || this.f470m < 0) && (this.f468k & 512) != 0)) {
                                    if (C0003d.m83a(((C0004e) this).f455b[5], true) || m409d(4)) {
                                        this.f468k &= -513;
                                    } else {
                                        this.f470m -= (this.f468k & 32768) != 0 ? 224 : 320;
                                        if (this.f470m < -7680) {
                                            this.f470m = -7680;
                                        }
                                    }
                                }
                                if (m278c() == 173) {
                                    this.f506D |= 4096;
                                }
                                if ((mo225a(false) || (((this.f506D & 1) == 0 && C0003d.m83a(2, true)) || ((this.f506D & 1) != 0 && C0003d.m83a(8, true)))) && m278c() != 6) {
                                    m441u();
                                }
                                if (m232b() && (iM414i = m414i((iM278c = m278c()))) != iM278c) {
                                    i = iM278c - 1;
                                    switch (iM414i) {
                                        case 2:
                                            if (i < 17) {
                                                i = 2;
                                            }
                                            break;
                                        case 3:
                                            if (i < 26) {
                                                i = 3;
                                            }
                                            break;
                                        case 4:
                                            if (i < 35) {
                                                i = 4;
                                            }
                                            break;
                                        case 6:
                                            if (i < 44) {
                                                i = 6;
                                            }
                                            break;
                                    }
                                    mo213a(i, 14);
                                }
                                if (this.f470m >= 0 && m278c() != 6 && m278c() != 4 && m278c() != 80 && m278c() != 9 && (this.f468k & 448) == 0 && m278c() != 181 && (this.f468k & 4) == 0) {
                                    if (m278c() != 240 || m278c() == 239) {
                                        mo213a(9, 46);
                                    } else if ((this.f468k & 33) != 0) {
                                        mo213a(8, 14);
                                    } else {
                                        mo213a(9, 14);
                                    }
                                    this.f506D |= 4096;
                                    if (((this.f506D & 1) != 0 && this.f469l < 0) || ((this.f506D & 1) != 0 && this.f469l > 0)) {
                                        m441u();
                                    }
                                }
                            } else {
                                ((C0004e) this).f454b += ((C0004e) this).f452a[3];
                                if (this.f467j == 16) {
                                    m428d(0, 0);
                                    m401E();
                                    this.f470m = 0;
                                }
                                ((C0004e) this).f454b = (((((((C0004e) this).f454b + ((C0004e) this).f452a[3]) + 256) / 5120) * 5120) - 256) - ((C0004e) this).f452a[3];
                                if (C0003d.m83a(2304, true)) {
                                    mo213a(15, 128);
                                }
                            }
                        }
                    } else {
                        if (m222a(((C0004e) this).f455b[28], ((C0004e) this).f455b[29], 7680)) {
                            this.f468k &= -2049;
                        }
                        if (this.f470m == 0) {
                            mo213a(9, 14);
                            this.f468k &= -2049;
                        }
                        if (this.f470m == 0) {
                            if ((this.f468k & 16) != 0) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                if (iM278c3 == 180) {
                                    if (this.f470m == 0) {
                                        if ((this.f468k & 64) != 0) {
                                            if (C0003d.m83a(((C0004e) this).f455b[5], true)) {
                                                this.f468k &= -513;
                                            } else {
                                                this.f468k &= -513;
                                            }
                                        } else if (C0003d.m83a(((C0004e) this).f455b[5], true)) {
                                            this.f468k &= -513;
                                        } else {
                                            this.f468k &= -513;
                                        }
                                        if (m278c() == 173) {
                                            this.f506D |= 4096;
                                        }
                                        if (mo225a(false)) {
                                            m441u();
                                        } else {
                                            m441u();
                                        }
                                        if (m232b()) {
                                            i = iM278c - 1;
                                            switch (iM414i) {
                                                case 2:
                                                    if (i < 17) {
                                                        i = 2;
                                                    }
                                                    break;
                                                case 3:
                                                    if (i < 26) {
                                                        i = 3;
                                                    }
                                                    break;
                                                case 4:
                                                    if (i < 35) {
                                                        i = 4;
                                                    }
                                                    break;
                                                case 6:
                                                    if (i < 44) {
                                                        i = 6;
                                                    }
                                                    break;
                                            }
                                            mo213a(i, 14);
                                        }
                                        if (this.f470m >= 0) {
                                            if (m278c() != 240) {
                                                mo213a(9, 46);
                                            } else {
                                                mo213a(9, 46);
                                            }
                                            this.f506D |= 4096;
                                            if ((this.f506D & 1) != 0) {
                                                m441u();
                                            } else {
                                                m441u();
                                            }
                                        }
                                    } else {
                                        if ((this.f468k & 64) != 0) {
                                            if (C0003d.m83a(((C0004e) this).f455b[5], true)) {
                                                this.f468k &= -513;
                                            } else {
                                                this.f468k &= -513;
                                            }
                                        } else if (C0003d.m83a(((C0004e) this).f455b[5], true)) {
                                            this.f468k &= -513;
                                        } else {
                                            this.f468k &= -513;
                                        }
                                        if (m278c() == 173) {
                                            this.f506D |= 4096;
                                        }
                                        if (mo225a(false)) {
                                            m441u();
                                        } else {
                                            m441u();
                                        }
                                        if (m232b()) {
                                            i = iM278c - 1;
                                            switch (iM414i) {
                                                case 2:
                                                    if (i < 17) {
                                                        i = 2;
                                                    }
                                                    break;
                                                case 3:
                                                    if (i < 26) {
                                                        i = 3;
                                                    }
                                                    break;
                                                case 4:
                                                    if (i < 35) {
                                                        i = 4;
                                                    }
                                                    break;
                                                case 6:
                                                    if (i < 44) {
                                                        i = 6;
                                                    }
                                                    break;
                                            }
                                            mo213a(i, 14);
                                        }
                                        if (this.f470m >= 0) {
                                            if (m278c() != 240) {
                                                mo213a(9, 46);
                                            } else {
                                                mo213a(9, 46);
                                            }
                                            this.f506D |= 4096;
                                            if ((this.f506D & 1) != 0) {
                                                m441u();
                                            } else {
                                                m441u();
                                            }
                                        }
                                    }
                                } else if (this.f470m == 0) {
                                    if ((this.f468k & 64) != 0) {
                                        if (C0003d.m83a(((C0004e) this).f455b[5], true)) {
                                            this.f468k &= -513;
                                        } else {
                                            this.f468k &= -513;
                                        }
                                    } else if (C0003d.m83a(((C0004e) this).f455b[5], true)) {
                                        this.f468k &= -513;
                                    } else {
                                        this.f468k &= -513;
                                    }
                                    if (m278c() == 173) {
                                        this.f506D |= 4096;
                                    }
                                    if (mo225a(false)) {
                                        m441u();
                                    } else {
                                        m441u();
                                    }
                                    if (m232b()) {
                                        i = iM278c - 1;
                                        switch (iM414i) {
                                            case 2:
                                                if (i < 17) {
                                                    i = 2;
                                                }
                                                break;
                                            case 3:
                                                if (i < 26) {
                                                    i = 3;
                                                }
                                                break;
                                            case 4:
                                                if (i < 35) {
                                                    i = 4;
                                                }
                                                break;
                                            case 6:
                                                if (i < 44) {
                                                    i = 6;
                                                }
                                                break;
                                        }
                                        mo213a(i, 14);
                                    }
                                    if (this.f470m >= 0) {
                                        if (m278c() != 240) {
                                            mo213a(9, 46);
                                        } else {
                                            mo213a(9, 46);
                                        }
                                        this.f506D |= 4096;
                                        if ((this.f506D & 1) != 0) {
                                            m441u();
                                        } else {
                                            m441u();
                                        }
                                    }
                                } else {
                                    if ((this.f468k & 64) != 0) {
                                        if (C0003d.m83a(((C0004e) this).f455b[5], true)) {
                                            this.f468k &= -513;
                                        } else {
                                            this.f468k &= -513;
                                        }
                                    } else if (C0003d.m83a(((C0004e) this).f455b[5], true)) {
                                        this.f468k &= -513;
                                    } else {
                                        this.f468k &= -513;
                                    }
                                    if (m278c() == 173) {
                                        this.f506D |= 4096;
                                    }
                                    if (mo225a(false)) {
                                        m441u();
                                    } else {
                                        m441u();
                                    }
                                    if (m232b()) {
                                        i = iM278c - 1;
                                        switch (iM414i) {
                                            case 2:
                                                if (i < 17) {
                                                    i = 2;
                                                }
                                                break;
                                            case 3:
                                                if (i < 26) {
                                                    i = 3;
                                                }
                                                break;
                                            case 4:
                                                if (i < 35) {
                                                    i = 4;
                                                }
                                                break;
                                            case 6:
                                                if (i < 44) {
                                                    i = 6;
                                                }
                                                break;
                                        }
                                        mo213a(i, 14);
                                    }
                                    if (this.f470m >= 0) {
                                        if (m278c() != 240) {
                                            mo213a(9, 46);
                                        } else {
                                            mo213a(9, 46);
                                        }
                                        this.f506D |= 4096;
                                        if ((this.f506D & 1) != 0) {
                                            m441u();
                                        } else {
                                            m441u();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 19:
                m399C();
                if (this.f470m != 0 || (((C0004e) this).f453a[2][0] & 16) == 0) {
                    this.f470m += 768;
                } else {
                    ((C0004e) this).f454b += ((C0004e) this).f452a[3];
                    ((C0004e) this).f454b = (((((((((C0004e) this).f454b + ((C0004e) this).f452a[3]) + 256) >> 8) / 20) << 8) * 20) - 256) - ((C0004e) this).f452a[3];
                    m428d(0, 0);
                    mo213a(0, 0);
                    if (!mo240e()) {
                        this.f470m += 768;
                    }
                }
                break;
        }
        if (m409d(2)) {
            if (m421p() || m278c() == 6) {
                this.f679N = 7680;
            } else if (m429f()) {
                this.f679N = 6656;
            } else {
                this.f679N = 6656;
            }
        } else if (m418m()) {
            this.f679N = 1536;
        } else {
            this.f679N = 3242;
        }
        switch (this.f467j) {
            case 0:
            case 3:
                if (m278c() == 12 || m278c() == 13 || m278c() == 199 || m278c() == 200) {
                    if (m409d(2)) {
                        m215a(672, false, true, this.f679N);
                    } else {
                        m215a(160, false, true, this.f679N);
                    }
                } else if (m411e(Math.abs(this.f469l))) {
                    if (!m412f(m278c()) && m409d(1) && C0003d.m83a(16416, true)) {
                        m398B();
                    }
                    if (mo233b(true)) {
                        m215a(192, true, true, this.f679N);
                    } else if (mo225a(true)) {
                        if (m278c() == 6) {
                            m215a(192, false, true, 7680);
                        } else {
                            if (m278c() == 2) {
                                mo213a(0, 0);
                            }
                            if (m412f(m278c())) {
                                m441u();
                            } else if (m278c() != 2) {
                                m397A();
                            }
                        }
                    } else if (this.f469l > 6656) {
                        m215a(25, false, true, this.f679N);
                    } else if (m278c() == 6) {
                        if (f670K <= 0) {
                            m215a(25, false, true, this.f679N);
                        }
                    } else if (m278c() == 2 || m278c() == 3) {
                        m215a(336, false, true, this.f679N);
                    } else {
                        m215a(192, false, true, this.f679N);
                    }
                }
                break;
            case 1:
            case 2:
                if ((C0004e.m147a(this.f473u) & 8192) != 0) {
                    this.f477y = 5120;
                } else {
                    boolean zM411e = m411e(this.f477y);
                    if (m430g()) {
                        zM411e = true;
                    }
                    if (zM411e) {
                        boolean z8 = (C0004e.m187d(this.f473u, this.f474v) & 32768) != 0;
                        boolean z9 = (this.f506D & 1) == 0;
                        boolean z10 = ((C0004e) this).f455b[0] > 0;
                        boolean zMo233b = mo233b(true);
                        boolean zMo225a = mo225a(true);
                        if (zMo233b) {
                            if (((C0004e) this).f455b[0] == 0) {
                                z10 = true;
                            } else if (!z9) {
                                z10 = !z10;
                            }
                            if (z8) {
                                z10 = !z10;
                            }
                            z4 = !z10;
                        } else if (!zMo225a || this.f468k == 2) {
                            z4 = zMo225a;
                            z10 = zMo233b;
                        } else {
                            if (((C0004e) this).f455b[0] == 0) {
                                z10 = false;
                            } else if (z9) {
                                z10 = !z10;
                            }
                            if (z8) {
                                z10 = !z10;
                            }
                            z4 = !z10;
                        }
                        if ((z10 || z4) && !z8) {
                            C0004e.m173b(this.f473u, this.f474v);
                            if (C0004e.f444q == C0004e.f445r) {
                                z5 = z4;
                                z6 = z10;
                            } else {
                                boolean z11 = C0004e.f444q > C0004e.f445r;
                                C0004e.m173b(this.f473u, 0);
                                if (z11 != (C0004e.f444q > C0004e.f445r) || C0004e.f444q > C0004e.f445r) {
                                    z5 = z10;
                                    z6 = z4;
                                } else {
                                    z5 = z4;
                                    z6 = z10;
                                }
                            }
                        } else {
                            z5 = z4;
                            z6 = z10;
                        }
                        if (!m418m() && !m412f(m278c()) && m409d(1) && C0003d.m83a(16416, true)) {
                            m398B();
                        }
                        if (z6) {
                            if ((C0004e.m187d(this.f473u, this.f474v) & 2048) != 0 && !m430g()) {
                                this.f477y += 512;
                            } else if ((C0004e.m187d(this.f473u, this.f474v) & 512) != 0) {
                                this.f477y += 332;
                            } else {
                                this.f477y += 384;
                            }
                        } else if (m429f() && (C0004e.m187d(this.f473u, this.f474v) & 512) == 0) {
                            if (m278c() == 13 || m278c() == 12 || m278c() == 199 || m278c() == 200) {
                                if (m409d(2)) {
                                    this.f477y -= 672;
                                } else {
                                    this.f477y -= 160;
                                }
                            } else if (z5) {
                                if (m278c() == 6) {
                                    this.f477y -= 691;
                                } else if (m430g()) {
                                    this.f477y -= 1152;
                                } else if (m418m()) {
                                    this.f477y -= 768;
                                } else if (m412f(m278c())) {
                                    System.out.println("turn!!!!!!!!!!!!!!!!!!");
                                    m441u();
                                    this.f477y = 384;
                                } else if (!m419n()) {
                                    m397A();
                                }
                                break;
                            } else if (this.f477y > 6656) {
                                if (f670K <= 0) {
                                    this.f477y -= 25;
                                }
                            } else if (this.f468k == 2) {
                                if (!m419n()) {
                                    this.f477y -= 256;
                                }
                            } else if (!m419n()) {
                                if (m278c() == 2 || m278c() == 3) {
                                    this.f477y -= 336;
                                } else if (m430g()) {
                                    this.f477y -= 768;
                                } else if (m418m()) {
                                    this.f477y -= 256;
                                } else {
                                    this.f477y -= 307;
                                }
                            }
                        }
                        if (this.f477y < 0) {
                            this.f477y = 0;
                        }
                        if (this.f477y > this.f679N) {
                            this.f477y = this.f679N;
                        }
                        if (m278c() != 13 && m278c() != 12 && m278c() != 199 && m278c() != 200 && m278c() != 240) {
                            if (m278c() == 239) {
                                if (this.f477y == 0) {
                                    mo213a(240, 0);
                                }
                            }
                            break;
                        }
                    }
                    if (m429f()) {
                        if (m278c() != 0 && m278c() != 10 && m278c() != 11 && (this.f477y != 0 || (C0004e.m187d(this.f473u, this.f474v) & 512) != 0)) {
                            int i6 = this.f478z;
                            if (this.f470m >= 0 && i6 > 0 && this.f468k != 2) {
                                i6 *= 6;
                            }
                            this.f477y = i6 + this.f477y;
                        }
                        if (this.f477y < 0) {
                            this.f477y = 0;
                        }
                        if (this.f477y > this.f679N) {
                            this.f477y = this.f679N;
                        }
                        if (this.f477y < 1536 || (this.f477y < 4505 && (C0004e.m147a(this.f473u) & 4096) != 0)) {
                            if ((C0004e.m187d(this.f473u, this.f474v) & 512) != 0) {
                                if (this.f477y == 0) {
                                    m441u();
                                    this.f477y += 384;
                                }
                            } else if (((C0004e.m187d(this.f473u, this.f474v) & 32768) != 0 || (C0004e.m187d(this.f473u, this.f474v) & 256) != 0) && (this.f470m <= 0 || (C0004e.m187d(this.f473u, this.f474v) & 256) != 0)) {
                                C0004e.m173b(this.f473u, this.f474v);
                                if ((Math.abs(C0004e.f444q - C0004e.f445r) << 2) > Math.abs(C0004e.f446s - C0004e.f447t)) {
                                    C0004e.m155a(2560, this.f473u, this.f474v);
                                    this.f469l = (C0004e.f434c[0] * 3) / 4;
                                    if (Math.abs(this.f469l) < 768) {
                                        this.f469l = C0004e.f434c[0];
                                    }
                                    if (m430g()) {
                                        this.f469l = 0;
                                    }
                                    this.f470m = C0004e.f434c[1];
                                    m428d(16, 192);
                                    ((C0004e) this).f455b[4] = 0;
                                    ((C0004e) this).f450a += (((C0004e) this).f452a[0] + ((C0004e) this).f452a[2]) / 2;
                                    ((C0004e) this).f454b += ((C0004e) this).f452a[3];
                                    mo213a(9, 14);
                                    this.f473u = -1;
                                }
                            }
                        }
                        if (this.f477y == 0) {
                            if (this.f468k == 2) {
                                ((C0004e) this).f451a = !((C0004e) this).f451a;
                                mo213a(0, 0);
                            }
                            this.f468k = 0;
                            if (m419n()) {
                                if (this.f478z < 0) {
                                    m441u();
                                } else {
                                    m440t();
                                    this.f477y = 1024;
                                    z3 = false;
                                }
                                break;
                            } else if (m278c() == 11 || m278c() == 10 || m278c() == 0 || m278c() == 6 || m278c() == 7 || m278c() == 15 || m278c() == 179 || m278c() == 178 || m278c() == 177 || m278c() == 182 || ((m278c() >= 183 && m278c() <= 196) || m278c() == 197 || m278c() == 198 || m278c() == 199 || m278c() == 200 || m278c() == 201 || m278c() == 202 || m278c() == 203 || m278c() == 240 || m278c() == 239)) {
                                z3 = true;
                            } else if (m420o()) {
                                mo213a(m433j(10), 256);
                                z3 = true;
                            } else {
                                mo213a(0, 256);
                                z3 = true;
                            }
                            if (z3) {
                                ((C0004e) this).f451a = m223a(this.f473u, this.f474v, 0, 0, (this.f506D & 1) == 0);
                            }
                        }
                    }
                }
                break;
            case 7:
                this.f470m = 0;
                this.f469l = 0;
                break;
            case 16:
                if ((this.f468k & 256) == 0) {
                    int i7 = 512;
                    int i8 = 1024;
                    int i9 = 1536;
                    if ((this.f468k & 32768) != 0) {
                        i7 = 409;
                        i8 = 819;
                        i9 = 1228;
                    }
                    if ((this.f468k & 1) != 0) {
                        this.f470m += i8;
                    } else if ((this.f468k & 2) != 0) {
                        this.f470m = i9 + this.f470m;
                    } else if ((this.f468k & 16) != 0) {
                        this.f470m += i7;
                    } else {
                        this.f470m += i7;
                    }
                }
                if ((this.f468k & 192) != 192) {
                    int iM414i2 = m414i(m278c());
                    int i10 = iM414i2 == 4 ? 2139062143 : 1536;
                    boolean z12 = (this.f506D & 1) == 0 && C0003d.m83a(8776, true);
                    boolean z13 = (this.f506D & 1) != 0 && C0003d.m83a(4242, true);
                    if ((this.f468k & 64) == 0 || this.f470m > 0) {
                        if (((this.f468k & 128) == 0 || this.f470m < 0) && iM414i2 != 181) {
                            if (z12 || z13) {
                                int i11 = 768;
                                if ((this.f468k & 16384) != 0 && this.f470m < 0) {
                                    i11 = 128;
                                }
                                m215a(i11, true, false, 1536);
                            } else if (mo225a(true)) {
                                m215a(768, false, false, i10);
                            } else if ((this.f468k & 516) == 0) {
                                m215a(128, false, true, i10);
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // p000.C0004e
    /* JADX INFO: renamed from: e */
    final boolean mo240e() {
        if (((C0004e) this).f455b[18] == 0) {
            return false;
        }
        mo213a(80, 128);
        m428d(20, 0);
        ((C0004e) this).f459d = null;
        return true;
    }

    @Override // p000.C0004e
    /* JADX INFO: renamed from: f */
    final void mo241f() {
        if ((this.f506D & 8388608) != 0) {
            return;
        }
        if (m409d(2)) {
            if (((C0004e) this).f455b[25] > 0) {
                ((RunnableC0006g) this).f509a.m324c(0);
                int iM266e = RunnableC0006g.m266e(1);
                int iM268f = RunnableC0006g.m268f(1);
                int i = this.f680O;
                C0008i c0008i = C0003d.f212a[39];
                int i2 = 3 - i;
                while (true) {
                    int i3 = i2;
                    if (i3 >= 2) {
                        break;
                    }
                    int i4 = i3 + 1;
                    int iM303a = C0003d.f344e % c0008i.m303a(this.f683d[(i3 * 5) + 2]);
                    if (this.f683d[(i3 * 5) + 2] == 81) {
                        iM303a = this.f683d[(i3 * 5) + 3];
                    }
                    c0008i.m320b(c0008i.m325d(), (((i3 << 1) * 153) / ((i << 1) - 1)) + 102);
                    c0008i.m312a(AbstractRunnableC0012m.f611a, this.f683d[(i3 * 5) + 2], iM303a, (this.f683d[i3 * 5] >> 8) - iM266e, (this.f683d[(i3 * 5) + 1] >> 8) - iM268f, this.f683d[(i3 * 5) + 4], 0, 0);
                    c0008i.m320b(c0008i.m325d(), ((((i3 << 1) + 1) * 153) / ((i << 1) - 1)) + 102);
                    c0008i.m312a(AbstractRunnableC0012m.f611a, this.f683d[(i3 * 5) + 2], iM303a, (((this.f683d[i3 * 5] + this.f683d[i4 * 5]) / 2) >> 8) - iM266e, (((this.f683d[(i3 * 5) + 1] + this.f683d[(i4 * 5) + 1]) / 2) >> 8) - iM268f, this.f683d[(i3 * 5) + 4], 0, 0);
                    c0008i.m320b(c0008i.m325d(), 255);
                    i2 = i3 + 1;
                }
            } else {
                ((RunnableC0006g) this).f509a.m324c(0);
            }
        }
        if (((C0004e) this).f455b[17] % 2 == 0) {
            if (m409d(2)) {
                C0013n c0013n = C0004e.f425a;
                if (c0013n.f681P > 0) {
                    c0013n.f681P--;
                    if (c0013n.f681P <= 0) {
                        c0013n.m426b(true);
                        c0013n.f681P = 0;
                    }
                }
                if (c0013n.f684e) {
                    c0013n.f680O--;
                    if (c0013n.f680O <= 0) {
                        c0013n.f682d = false;
                        c0013n.f680O = 3;
                        c0013n.f684e = false;
                    }
                }
                if (c0013n.m421p()) {
                    int iM266e2 = RunnableC0006g.m266e(1);
                    int iM268f2 = RunnableC0006g.m268f(1);
                    int i5 = c0013n.f680O;
                    int i6 = 3 - i5;
                    while (true) {
                        int i7 = i6;
                        if (i7 >= 2) {
                            break;
                        }
                        int i8 = i7 + 1;
                        ((RunnableC0006g) c0013n).f509a.m320b(((RunnableC0006g) c0013n).f509a.m325d(), (((i7 << 1) * 153) / ((i5 << 1) - 1)) + 51);
                        ((RunnableC0006g) c0013n).f509a.m312a(AbstractRunnableC0012m.f611a, c0013n.f683d[(i7 * 5) + 2], c0013n.f683d[(i7 * 5) + 3], (c0013n.f683d[i7 * 5] >> 8) - iM266e2, (c0013n.f683d[(i7 * 5) + 1] >> 8) - iM268f2, c0013n.f683d[(i7 * 5) + 4], 0, 0);
                        ((RunnableC0006g) c0013n).f509a.m320b(((RunnableC0006g) c0013n).f509a.m325d(), ((((i7 << 1) + 1) * 153) / ((i5 << 1) - 1)) + 51);
                        ((RunnableC0006g) c0013n).f509a.m312a(AbstractRunnableC0012m.f611a, c0013n.f683d[(i7 * 5) + 2], c0013n.f683d[(i7 * 5) + 3], (((c0013n.f683d[i7 * 5] + c0013n.f683d[i8 * 5]) / 2) >> 8) - iM266e2, (((c0013n.f683d[(i7 * 5) + 1] + c0013n.f683d[(i8 * 5) + 1]) / 2) >> 8) - iM268f2, c0013n.f683d[(i7 * 5) + 4], 0, 0);
                        i6 = i7 + 1;
                    }
                    ((RunnableC0006g) c0013n).f509a.m320b(((RunnableC0006g) c0013n).f509a.m325d(), 255);
                }
            }
            super.mo241f();
            if (((C0004e) this).f455b[25] > 0) {
                C0003d.f212a[39].m312a(AbstractRunnableC0012m.f611a, m278c(), m211a(), (((C0004e) this).f450a >> 8) - C0003d.f375m, (((C0004e) this).f454b >> 8) - C0003d.f378n, this.f506D, 0, 0);
            }
            if (m409d(2) && m421p() && C0003d.m83a(16416, true) && m278c() != 166) {
                C0013n c0013n2 = C0004e.f425a;
                C0003d.f212a[2].m320b(0, 179);
                C0003d.f212a[2].m324c(0);
                C0003d.f212a[2].m312a(AbstractRunnableC0012m.f611a, c0013n2.m278c(), C0003d.f344e % ((RunnableC0006g) c0013n2).f509a.m303a(c0013n2.m278c()), (((C0004e) c0013n2).f450a >> 8) - C0003d.f375m, (((C0004e) c0013n2).f454b >> 8) - C0003d.f378n, c0013n2.f506D, 0, 0);
                C0003d.f212a[3].m312a(AbstractRunnableC0012m.f611a, c0013n2.m278c(), C0003d.f344e % ((RunnableC0006g) c0013n2).f509a.m303a(c0013n2.m278c()), (((C0004e) c0013n2).f450a >> 8) - C0003d.f375m, (((C0004e) c0013n2).f454b >> 8) - C0003d.f378n, c0013n2.f506D, 0, 0);
            }
            if (((C0004e) this).f455b[24] == 1) {
                C0013n c0013n3 = C0004e.f425a;
                int iM303a2 = C0003d.f344e % C0003d.f212a[29].m303a(c0013n3.m278c());
                if (c0013n3.m278c() == 81) {
                    iM303a2 = c0013n3.m211a();
                }
                C0003d.f212a[29].m312a(AbstractRunnableC0012m.f611a, c0013n3.m278c(), iM303a2, (((C0004e) c0013n3).f450a >> 8) - C0003d.f375m, (((C0004e) c0013n3).f454b >> 8) - C0003d.f378n, c0013n3.f506D, 0, 0);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m429f() {
        return this.f467j == 1 || this.f467j == 2;
    }

    /* JADX INFO: renamed from: g */
    final boolean m430g() {
        return (C0004e.m187d(this.f473u, this.f474v) & 256) != 0;
    }

    /* JADX INFO: renamed from: h */
    final boolean m431h() {
        int i = this.f474v;
        int i2 = ((C0004e) this).f451a ? i + 1 : i - 1;
        return i2 >= 0 && i2 < C0004e.m172b(this.f473u) && (C0004e.m187d(this.f473u, i2) & 256) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m432i() {
        int i = ((C0004e) this).f450a / 5120;
        int i2 = (((C0004e) this).f454b + 512) / 5120;
        if (m429f()) {
            if (C0004e.m166a(this.f475w, this.f476x, this.f473u, this.f474v, ((C0004e) this).f451a, false)) {
                this.f477y = C0004e.m149a(this.f473u, this.f474v, this.f477y, ((C0004e) this).f451a);
                if (this.f477y < 0) {
                    this.f477y = -this.f477y;
                }
                this.f474v = C0004e.f434c[0];
                if ((this.f467j & Integer.MIN_VALUE) == 0) {
                    if ((C0004e.m147a(this.f473u) & 15) == 1 && (C0004e.m187d(this.f473u, this.f474v) & 4096) == 0) {
                        m428d(2, this.f468k);
                    } else {
                        m428d(1, this.f468k);
                    }
                }
                m440t();
                this.f475w = C0004e.f434c[1];
                this.f476x = C0004e.f434c[2];
                ((C0004e) this).f450a = this.f475w;
                ((C0004e) this).f454b = this.f476x;
                return false;
            }
        } else if (m435j()) {
            return true;
        }
        switch (this.f467j) {
            case 1:
            case 2:
                if (this.f473u < 0 || C0004e.m163a(this.f475w, this.f476x, this.f473u, this.f474v)) {
                    return true;
                }
                int i3 = this.f468k;
                m428d(16, 0);
                ((C0004e) this).f455b[4] = 0;
                this.f473u = -1;
                C0004e.f420A = -1;
                if (this.f470m > 0 && i3 != 2) {
                    if (this.f469l < 0) {
                        this.f506D |= 1;
                    } else {
                        this.f506D &= -2;
                    }
                }
                if (!C0004e.m162a(C0003d.m54a(i, i2))) {
                    return false;
                }
                m428d(0, 0);
                ((C0004e) this).f454b = (i2 * 5120) - 256;
                this.f470m = 0;
                return false;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m433j(int i) {
        int i2;
        int i3 = 0;
        C0004e.f434c[0] = this.f506D;
        if (this.f473u < 0 || this.f474v < 0) {
            return i;
        }
        int iM414i = m414i(i);
        if (iM414i != 2 && iM414i != 3 && iM414i != 4 && iM414i != 6 && iM414i != 69 && iM414i != 10 && iM414i != 11 && iM414i != 82 && iM414i != 95 && iM414i != 108 && iM414i != 134 && iM414i != 121 && iM414i != 147) {
            return iM414i;
        }
        C0004e.m173b(this.f473u, this.f474v);
        boolean z = (C0004e.m187d(this.f473u, this.f474v) & 32768) != 0;
        boolean z2 = (C0004e.m187d(this.f473u, this.f474v) & 256) != 0;
        boolean z3 = (this.f506D & 1) == 0;
        int iAbs = Math.abs(C0004e.f444q - C0004e.f445r) >> 8;
        int iAbs2 = Math.abs(C0004e.f446s - C0004e.f447t) >> 8;
        int iM183c = C0004e.m183c(this.f473u, this.f474v);
        if (!z2) {
            if (iAbs != 0) {
                if (iAbs2 > iAbs) {
                    i3 = iAbs2 <= (iAbs << 1) ? 1 : 2;
                }
                int i4 = i3 < 0 ? 1 / 0 : i3;
                switch (iM183c) {
                    case 1:
                    case 3:
                        i2 = 9 - (z ? i4 + 5 : i4);
                        break;
                    case 2:
                    case 4:
                        if (z) {
                            i2 = i4 + 5;
                            break;
                        }
                    default:
                        i2 = i4;
                        break;
                }
            } else {
                i2 = z ? 7 : 2;
            }
            if (iM414i == 10 || iM414i == 11) {
                if (z3) {
                    return (iM183c == 2 || iM183c == 4) ? 11 : 10;
                }
                return (iM183c == 2 || iM183c == 4) ? 10 : 11;
            }
            if (i2 == 0 || i2 == 9) {
                return iM414i;
            }
            if (!z3) {
                i2 = 9 - i2;
            }
            switch (iM414i) {
                case 2:
                    return (i2 + 17) - 1;
                case 3:
                    return (i2 + 26) - 1;
                case 4:
                case 6:
                    return (i2 + 35) - 1;
                case 69:
                    return (i2 + 70) - 1;
                default:
                    return iM414i;
            }
        }
        boolean z4 = (C0004e.m187d(this.f473u, this.f474v) & 15) == 1;
        C0004e.m173b(this.f473u, this.f474v);
        int iM183c2 = C0004e.m183c(this.f473u, this.f474v);
        boolean z5 = (this.f506D & 1) == 0;
        int iAbs3 = Math.abs(C0004e.f446s - C0004e.f447t);
        int iMin = Math.min(C0004e.f446s, C0004e.f447t);
        int iMax = Math.max(C0004e.f446s, C0004e.f447t);
        boolean z6 = this.f470m >= 0;
        boolean zM417l = m417l();
        switch (iM183c2) {
            case 1:
            case 3:
                if (!z4) {
                    if (z5) {
                        return zM417l ? ((Math.abs(((C0004e) this).f454b - iMin) * 5) / iAbs3) + 89 : ((Math.abs(((C0004e) this).f454b - iMin) * 5) / iAbs3) + 102;
                    }
                    return zM417l ? ((Math.abs(((C0004e) this).f454b - iMax) * 6) / iAbs3) + 83 : ((Math.abs(((C0004e) this).f454b - iMax) * 6) / iAbs3) + 96;
                }
                if (z6) {
                    if (z5) {
                        return zM417l ? ((Math.abs(((C0004e) this).f454b - iMin) * 5) / iAbs3) + 148 : ((Math.abs(((C0004e) this).f454b - iMin) * 5) / iAbs3) + 122;
                    }
                    return zM417l ? ((Math.abs(((C0004e) this).f454b - iMin) * 6) / iAbs3) + 154 : ((Math.abs(((C0004e) this).f454b - iMin) * 6) / iAbs3) + 128;
                }
                if (z5) {
                    return zM417l ? ((Math.abs(((C0004e) this).f454b - iMax) * 5) / iAbs3) + 141 : ((Math.abs(((C0004e) this).f454b - iMax) * 5) / iAbs3) + 115;
                }
                return zM417l ? ((Math.abs(((C0004e) this).f454b - iMax) * 6) / iAbs3) + 135 : ((Math.abs(((C0004e) this).f454b - iMax) * 6) / iAbs3) + 109;
            case 2:
            case 4:
                if (!z4) {
                    if (z5) {
                        return zM417l ? ((Math.abs(((C0004e) this).f454b - iMax) * 6) / iAbs3) + 83 : ((Math.abs(((C0004e) this).f454b - iMax) * 6) / iAbs3) + 96;
                    }
                    return zM417l ? ((Math.abs(((C0004e) this).f454b - iMin) * 5) / iAbs3) + 89 : ((Math.abs(((C0004e) this).f454b - iMin) * 5) / iAbs3) + 102;
                }
                if (z6) {
                    if (z5) {
                        return zM417l ? ((Math.abs(((C0004e) this).f454b - iMin) * 6) / iAbs3) + 154 : ((Math.abs(((C0004e) this).f454b - iMin) * 6) / iAbs3) + 128;
                    }
                    return zM417l ? ((Math.abs(((C0004e) this).f454b - iMin) * 5) / iAbs3) + 148 : ((Math.abs(((C0004e) this).f454b - iMin) * 5) / iAbs3) + 122;
                }
                if (z5) {
                    return zM417l ? ((Math.abs(((C0004e) this).f454b - iMax) * 6) / iAbs3) + 135 : ((Math.abs(((C0004e) this).f454b - iMax) * 6) / iAbs3) + 109;
                }
                return zM417l ? ((Math.abs(((C0004e) this).f454b - iMax) * 5) / iAbs3) + 141 : ((Math.abs(((C0004e) this).f454b - iMax) * 5) / iAbs3) + 115;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m434j(int i) {
        ((C0004e) this).f455b[30] = i;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX INFO: renamed from: j */
    public final boolean m435j() {
        byte b;
        byte b2;
        boolean z = true;
        if (this.f467j == 7) {
            return true;
        }
        boolean zM238d = m238d();
        if (this.f467j == 0) {
            if (((C0004e) this).f453a[2][0] == 0 && ((C0004e) this).f459d == null) {
                m428d(16, 0);
                int iM414i = m414i(m278c());
                if (iM414i != 6 && iM414i != 7) {
                    mo213a(9, 0);
                }
                return true;
            }
            if (m409d(2) && (m278c() == 2 || m278c() == 0)) {
                byte[] bArr = ((C0004e) this).f453a[2];
                int i = bArr[0] & 15;
                if (mo233b(false)) {
                    i = 0;
                }
                if (i >= 2) {
                    int i2 = bArr[0] & 15;
                    if (i2 < 2) {
                        z = false;
                    } else {
                        if ((this.f506D & 1) == 0) {
                            b = bArr[i2];
                            b2 = bArr[i2 - 1];
                        } else {
                            b = bArr[1];
                            b2 = bArr[2];
                        }
                        if (!C0004e.m176b((int) b) || !C0004e.m162a((int) b2)) {
                            z = false;
                        } else if (this.f462f == 196608) {
                            mo213a(10, 0);
                        }
                    }
                    if (z) {
                        mo213a(10, 0);
                    }
                }
            }
        }
        return zM238d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x01f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x016e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x016b. Please report as an issue. */
    /* JADX INFO: renamed from: k */
    public final boolean m436k() {
        int i;
        int i2;
        if (this.f470m == 0 && this.f469l == 0) {
            return false;
        }
        if (this.f467j == 16 && this.f470m < 0 && m278c() != 6 && Math.abs(this.f469l) < 1024) {
            return false;
        }
        int i3 = -1;
        int i4 = -1;
        boolean z = (this.f506D & 1) == 0;
        int i5 = ((C0004e) this).f450a;
        int i6 = ((C0004e) this).f454b;
        int i7 = C0004e.f420A;
        int i8 = 0;
        while (true) {
            i = i4;
            i2 = i3;
            int i9 = i8;
            if (i9 < C0004e.f443p) {
                int iM147a = C0004e.m147a(i9);
                if ((iM147a & 16384) != 16384 && C0004e.m164a(i5, i6, C0004e.f428a[i9][2], C0004e.f428a[i9][3], C0004e.f428a[i9][4], C0004e.f428a[i9][5])) {
                    boolean z2 = (C0004e.m147a(i9) & 2048) != 0;
                    if (!((C0004e.m147a(i9) & 4096) != 0) || (Math.abs(this.f469l / 3) >= Math.abs(this.f470m) && Math.abs(this.f469l) >= 4505)) {
                        boolean z3 = (iM147a & 15) == 1;
                        int i10 = 0;
                        while (true) {
                            int i11 = i10;
                            if (i11 < C0004e.f428a[i9][1]) {
                                int iM187d = C0004e.m187d(i9, i11);
                                if ((32768 & iM187d) == 0) {
                                    if (z2) {
                                        C0004e.m173b(i9, i11);
                                        if (this.f470m <= 0) {
                                            continue;
                                        } else if (C0004e.m165a(((C0004e) this).f450a, ((C0004e) this).f454b + ((C0004e) this).f452a[1], ((C0004e) this).f450a, ((C0004e) this).f454b + ((C0004e) this).f452a[3], C0004e.f444q < C0004e.f445r ? C0004e.f444q : C0004e.f445r, C0004e.f446s < C0004e.f447t ? C0004e.f446s : C0004e.f447t, C0004e.f444q > C0004e.f445r ? C0004e.f444q : C0004e.f445r, C0004e.f446s > C0004e.f447t ? C0004e.f446s : C0004e.f447t)) {
                                            C0004e.f434c[0] = ((C0004e) this).f450a;
                                            C0004e.f434c[1] = C0004e.f446s;
                                            i = i11;
                                            i2 = i9;
                                        }
                                    } else if ((iM187d & 256) != 0) {
                                        switch (C0004e.m183c(i9, i11)) {
                                            case 1:
                                            case 3:
                                                int i12 = Math.abs(((C0004e) this).f450a - C0004e.f444q) > Math.abs(((C0004e) this).f450a - C0004e.f445r) ? C0004e.f444q : C0004e.f445r;
                                                if (!z || ((C0004e) this).f450a <= i12) {
                                                    if (Math.abs(this.f469l / 3) >= Math.abs(this.f470m) && Math.abs(this.f469l) >= 3942) {
                                                        if ((z3 || (iM187d & 4096) != 0 || i7 < 0 || (C0004e.m187d(i9, i11) & 15) == i7 || (f667H >> 16) != i9) && ((f667H < 0 || (f667H != ((i9 << 16) | i11) && ((iM187d & 512) == 0 || (f667H >> 16) != i9))) && C0004e.m179b(i5, i6, i9, i11, this.f469l, this.f470m))) {
                                                            i = i11;
                                                            i2 = i9;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 2:
                                            case 4:
                                                if (!z) {
                                                    if (((C0004e) this).f450a < (Math.abs(((C0004e) this).f450a - C0004e.f444q) > Math.abs(((C0004e) this).f450a - C0004e.f445r) ? C0004e.f444q : C0004e.f445r)) {
                                                        continue;
                                                    } else if (Math.abs(this.f469l / 3) >= Math.abs(this.f470m)) {
                                                    }
                                                } else if (Math.abs(this.f469l / 3) >= Math.abs(this.f470m)) {
                                                }
                                                break;
                                            default:
                                                if (Math.abs(this.f469l / 3) >= Math.abs(this.f470m)) {
                                                }
                                                break;
                                        }
                                    } else if (z3) {
                                        i = i11;
                                        i2 = i9;
                                    } else {
                                        i = i11;
                                        i2 = i9;
                                    }
                                }
                                i10 = i11 + 1;
                            }
                        }
                        if (i2 < 0) {
                        }
                    }
                }
                i4 = i;
                i3 = i2;
                i8 = i9 + 1;
            }
        }
        if (i2 < 0) {
            return false;
        }
        int i13 = this.f467j;
        C0004e.f420A = -1;
        this.f473u = i2;
        this.f474v = i;
        ((C0004e) this).f450a = C0004e.f434c[0];
        ((C0004e) this).f454b = C0004e.f434c[1];
        ((C0004e) this).f451a = (this.f506D & 1) == 0;
        m223a(this.f473u, this.f474v, this.f469l, this.f470m, (this.f506D & 1) == 0);
        this.f477y = C0004e.f434c[0];
        m440t();
        C0004e.m173b(i2, 0);
        if (C0004e.f444q > C0004e.f445r) {
            ((C0004e) this).f451a = !((C0004e) this).f451a;
        }
        boolean z4 = C0004e.f444q > C0004e.f445r;
        C0004e.m173b(i2, i);
        if (z4 != (C0004e.f444q > C0004e.f445r)) {
            ((C0004e) this).f451a = !((C0004e) this).f451a;
        }
        boolean z5 = false;
        if ((C0004e.m147a(this.f473u) & 8192) != 0) {
            ((C0004e) this).f451a = m221a(this.f473u, this.f474v);
            z5 = true;
        }
        if (m419n()) {
            mo213a(2, 0);
        }
        if ((this.f467j & Integer.MIN_VALUE) == 0) {
            if ((C0004e.m147a(this.f473u) & 15) == 1 && (C0004e.m187d(this.f473u, this.f474v) & 4096) == 0) {
                m428d(2, 0);
            } else {
                m428d(1, 0);
            }
            if (i13 == 16 && !m419n() && !z5) {
                m401E();
            }
        }
        this.f475w = ((C0004e) this).f450a;
        this.f476x = ((C0004e) this).f454b;
        this.f470m = 0;
        if (m417l()) {
            if (this.f477y < 1536) {
                this.f477y = 1536;
            }
            mo213a(69, 14);
        } else if (m418m()) {
            mo213a(240, 0);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m437q() {
        f666G = 5;
        ((RunnableC0006g) this).f509a = C0003d.f212a[19];
        ((C0004e) this).f455b[24] = 0;
        mo213a(0, 1);
    }

    /* JADX INFO: renamed from: r */
    public final void m438r() {
        f666G = 10;
        ((RunnableC0006g) this).f509a = C0003d.f212a[0];
        mo213a(0, 1);
    }

    /* JADX INFO: renamed from: s */
    public final void m439s() {
        int i = (this.f473u << 16) + this.f474v;
        m228b(this.f477y, 0);
        if (i == (this.f473u << 16) + this.f474v) {
            mo213a(m433j(m278c()), 14);
            this.f506D = C0004e.f434c[0];
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m440t() {
        int iM148a = this.f467j == 2 ? 384 : 512;
        if ((C0004e.m187d(this.f473u, this.f474v) & 16384) != 0) {
            iM148a = 2560;
        }
        if (m430g()) {
            iM148a = 0;
        }
        int i = this.f473u;
        int i2 = this.f474v;
        boolean z = ((C0004e) this).f451a;
        C0004e.m173b(i, i2);
        if (C0004e.f446s == C0004e.f447t) {
            iM148a = 0;
        } else if (C0004e.f444q != C0004e.f445r) {
            int iAbs = Math.abs(C0004e.f444q - C0004e.f445r);
            int iAbs2 = Math.abs(C0004e.f446s - C0004e.f447t);
            iM148a = (iM148a * (iAbs2 >> 8)) / (C0004e.m148a(iAbs, iAbs2) >> 8);
            switch (C0004e.m183c(i, i2)) {
                case 1:
                case 3:
                    if ((C0004e.f444q < C0004e.f445r) ^ z) {
                        iM148a = -iM148a;
                    }
                    break;
                case 2:
                case 4:
                    if ((C0004e.f444q > C0004e.f445r) ^ z) {
                        iM148a = -iM148a;
                    }
                    break;
            }
        } else if ((C0004e.f446s < C0004e.f447t) ^ z) {
            iM148a = -iM148a;
        }
        this.f478z = iM148a;
    }

    /* JADX INFO: renamed from: u */
    public final void m441u() {
        this.f506D ^= 1;
        ((C0004e) this).f451a = !((C0004e) this).f451a;
        m234b();
        if (m429f()) {
            m440t();
            if (this.f468k == 2) {
                m282d(m433j(m278c()));
                m234b();
                this.f468k = 0;
                ((C0004e) this).f451a = ((C0004e) this).f451a ? false : true;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m442v() {
        for (int i = 0; i < 2; i++) {
            this.f683d[i * 5] = this.f683d[(i + 1) * 5];
            this.f683d[(i * 5) + 1] = this.f683d[((i + 1) * 5) + 1];
            this.f683d[(i * 5) + 2] = this.f683d[((i + 1) * 5) + 2];
            this.f683d[(i * 5) + 3] = this.f683d[((i + 1) * 5) + 3];
            this.f683d[(i * 5) + 4] = this.f683d[((i + 1) * 5) + 4];
        }
        this.f683d[10] = ((C0004e) this).f450a;
        this.f683d[11] = ((C0004e) this).f454b;
        this.f683d[12] = m278c();
        this.f683d[13] = m280d();
        this.f683d[14] = this.f506D;
    }

    /* JADX INFO: renamed from: w */
    final void m443w() {
        ((C0004e) this).f455b[10] = 1;
    }

    /* JADX INFO: renamed from: x */
    final void m444x() {
        ((C0004e) this).f455b[10] = 0;
    }

    /* JADX INFO: renamed from: z */
    final void m445z() {
        if (((C0004e) this).f455b[19] == 1) {
            if (((C0004e) this).f450a < C0003d.f329c[0] + 5120) {
                ((C0004e) this).f450a = C0003d.f329c[0] + 5120;
            } else if (((C0004e) this).f450a > C0003d.f329c[2] - 5120) {
                ((C0004e) this).f450a = C0003d.f329c[2] - 5120;
            }
            if (((C0004e) this).f452a[1] < C0003d.f329c[1]) {
                ((C0004e) this).f454b += C0003d.f329c[1] - ((C0004e) this).f452a[1];
            } else if (((C0004e) this).f452a[3] > C0003d.f329c[3]) {
                ((C0004e) this).f454b -= ((C0004e) this).f452a[3] - C0003d.f329c[3];
            }
        }
        if (C0003d.f201a == null || C0003d.f201a.f467j != 1) {
            return;
        }
        C0003d.f201a.m216a(this);
    }
}
