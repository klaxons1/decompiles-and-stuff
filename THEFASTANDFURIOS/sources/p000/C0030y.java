package p000;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0030y {

    /* JADX INFO: renamed from: A */
    public int f715A;

    /* JADX INFO: renamed from: B */
    public int f716B;

    /* JADX INFO: renamed from: C */
    public boolean f717C;

    /* JADX INFO: renamed from: D */
    public boolean f718D;

    /* JADX INFO: renamed from: E */
    private RunnableC0017l f719E;

    /* JADX INFO: renamed from: F */
    private int f720F;

    /* JADX INFO: renamed from: a */
    public int f721a;

    /* JADX INFO: renamed from: b */
    public int f722b;

    /* JADX INFO: renamed from: c */
    public int f723c;

    /* JADX INFO: renamed from: d */
    public boolean f724d;

    /* JADX INFO: renamed from: e */
    public int f725e;

    /* JADX INFO: renamed from: f */
    public int f726f;

    /* JADX INFO: renamed from: g */
    public int f727g;

    /* JADX INFO: renamed from: h */
    public int f728h;

    /* JADX INFO: renamed from: i */
    public boolean f729i;

    /* JADX INFO: renamed from: j */
    public boolean f730j;

    /* JADX INFO: renamed from: k */
    public boolean f731k = false;

    /* JADX INFO: renamed from: l */
    public boolean f732l;

    /* JADX INFO: renamed from: m */
    public int f733m;

    /* JADX INFO: renamed from: n */
    public int f734n;

    /* JADX INFO: renamed from: o */
    public int f735o;

    /* JADX INFO: renamed from: p */
    public int f736p;

    /* JADX INFO: renamed from: q */
    public int f737q;

    /* JADX INFO: renamed from: r */
    public int f738r;

    /* JADX INFO: renamed from: s */
    public boolean f739s;

    /* JADX INFO: renamed from: t */
    public int f740t;

    /* JADX INFO: renamed from: u */
    public int f741u;

    /* JADX INFO: renamed from: v */
    public int f742v;

    /* JADX INFO: renamed from: w */
    public int f743w;

    /* JADX INFO: renamed from: x */
    public int f744x;

    /* JADX INFO: renamed from: y */
    public int f745y;

    /* JADX INFO: renamed from: z */
    public boolean f746z;

    public C0030y(RunnableC0017l runnableC0017l) {
        this.f719E = runnableC0017l;
        this.f720F = 0;
        this.f720F = Math.abs(this.f719E.m178b()) % 4;
    }

    /* JADX INFO: renamed from: a */
    private void m256a(int i, int i2, int i3, int i4, int i5) {
        this.f740t = i;
        this.f745y = -1;
        this.f741u = -1;
        this.f733m = -1;
        this.f723c = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m257a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f736p = i;
        this.f742v = i2;
        this.f743w = i3;
        this.f744x = i4;
        this.f734n = -1;
        this.f735o = i6;
        switch (this.f736p) {
            case 238:
                this.f737q = 2693186;
                this.f738r = 55;
                break;
            case 244:
                this.f737q = 8216408;
                this.f738r = 48;
                break;
            case 250:
                this.f737q = 3551357;
                this.f738r = 55;
                break;
            default:
                this.f737q = 3551357;
                this.f738r = 0;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m258a(int i, int i2) {
        this.f721a = i;
        this.f722b = i2;
        this.f723c = 0;
        if (this.f722b < 0) {
            this.f722b = this.f720F % 4;
            this.f720F++;
        }
        this.f728h = 0;
        this.f724d = false;
        this.f739s = false;
        this.f731k = false;
        this.f732l = false;
        this.f717C = false;
        this.f718D = false;
        switch (i) {
            case 0:
                switch (i2) {
                    case 0:
                        this.f725e = 0;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(250, 451, 455, 453, -1, -1);
                        m256a(449, -1, -1, -1, 0);
                        break;
                    case 1:
                        this.f725e = 1;
                        this.f726f = 1;
                        this.f724d = false;
                        this.f732l = true;
                        m257a(238, 381, 385, 383, -1, -1);
                        m256a(379, -1, -1, -1, 0);
                        break;
                    case 2:
                        this.f725e = 2;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(244, 425, 429, 427, -1, 431);
                        m256a(423, -1, -1, -1, 0);
                        break;
                    case 3:
                        this.f725e = 0;
                        this.f726f = 1;
                        this.f727g = 0;
                        this.f728h = 1;
                        this.f724d = false;
                        this.f739s = true;
                        m257a(238, 451, 455, 453, -1, -1);
                        m256a(449, -1, -1, -1, 0);
                        break;
                }
                break;
            case 1:
                switch (i2) {
                    case 0:
                        this.f725e = 1;
                        this.f726f = 1;
                        this.f724d = false;
                        this.f732l = true;
                        m257a(238, 373, 377, 375, -1, -1);
                        m256a(371, -1, -1, -1, 0);
                        break;
                    case 1:
                        this.f725e = 0;
                        this.f726f = 1;
                        this.f727g = 0;
                        this.f728h = 1;
                        this.f724d = false;
                        this.f739s = true;
                        m257a(244, 417, 421, 419, -1, -1);
                        m256a(415, -1, -1, -1, 0);
                        break;
                    case 2:
                        this.f725e = 2;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(244, 407, 411, 409, -1, 413);
                        m256a(405, -1, -1, -1, 0);
                        break;
                    case 3:
                        this.f725e = 0;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(244, 417, 421, 419, -1, -1);
                        m256a(415, -1, -1, -1, 0);
                        break;
                }
                break;
            case 2:
                switch (i2) {
                    case 0:
                        this.f725e = 0;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(250, 443, 447, 445, -1, -1);
                        m256a(441, -1, -1, -1, 0);
                        break;
                    case 1:
                        this.f725e = 1;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(238, 389, 393, 391, -1, -1);
                        m256a(387, -1, -1, -1, 0);
                        break;
                    case 2:
                        this.f725e = 2;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(244, 397, 401, 399, -1, 403);
                        m256a(395, -1, -1, -1, 0);
                        break;
                    case 3:
                        this.f725e = 0;
                        this.f726f = 1;
                        this.f727g = 0;
                        this.f728h = 2;
                        this.f724d = false;
                        this.f739s = true;
                        m257a(250, 443, 447, 445, -1, -1);
                        m256a(441, -1, -1, -1, 0);
                        break;
                }
                break;
            case 3:
                switch (i2) {
                    case 0:
                        this.f725e = 2;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(238, 355, 359, 357, -1, 361);
                        m256a(353, -1, -1, -1, 0);
                        break;
                    case 1:
                        this.f725e = 0;
                        this.f726f = 1;
                        this.f727g = 0;
                        this.f728h = 3;
                        this.f724d = false;
                        this.f739s = true;
                        m257a(250, 435, 439, 437, -1, -1);
                        m256a(433, -1, -1, -1, 0);
                        break;
                    case 2:
                        this.f725e = 1;
                        this.f726f = 1;
                        this.f724d = false;
                        this.f732l = true;
                        m257a(238, 365, 369, 367, -1, -1);
                        m256a(363, -1, -1, -1, 0);
                        break;
                    case 3:
                        this.f725e = 0;
                        this.f726f = 1;
                        this.f724d = false;
                        m257a(250, 435, 439, 437, -1, -1);
                        m256a(433, -1, -1, -1, 0);
                        break;
                }
                break;
        }
    }
}
