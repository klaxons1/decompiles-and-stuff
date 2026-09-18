package p000;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0023r {

    /* JADX INFO: renamed from: a */
    RunnableC0017l f687a;

    /* JADX INFO: renamed from: b */
    private int f688b;

    /* JADX INFO: renamed from: c */
    private long[] f689c = new long[5];

    /* JADX INFO: renamed from: d */
    private int[] f690d = new int[5];

    public C0023r(RunnableC0017l runnableC0017l) {
        this.f687a = runnableC0017l;
        m241a();
    }

    /* JADX INFO: renamed from: a */
    public final void m241a() {
        this.f688b = 0;
        for (int i = 0; i < 5; i++) {
            this.f689c[i] = 0;
            this.f690d[i] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m242a(int i, int i2) {
        this.f687a.f360aQ = "";
        StringBuffer stringBuffer = new StringBuffer();
        RunnableC0017l runnableC0017l = this.f687a;
        runnableC0017l.f360aQ = stringBuffer.append(runnableC0017l.f360aQ).append(this.f687a.f370ad).toString();
        this.f687a.f547u.m65a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length(), 19, i2 - 3, 0);
        int iM59a = this.f687a.f547u.m59a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length());
        this.f687a.f360aQ = "";
        StringBuffer stringBuffer2 = new StringBuffer();
        RunnableC0017l runnableC0017l2 = this.f687a;
        runnableC0017l2.f360aQ = stringBuffer2.append(runnableC0017l2.f360aQ).append("/").toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        RunnableC0017l runnableC0017l3 = this.f687a;
        runnableC0017l3.f360aQ = stringBuffer3.append(runnableC0017l3.f360aQ).append(this.f687a.f369ac.f727g + 1).toString();
        this.f687a.f546t.m65a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length(), iM59a + 19, i2, 0);
    }

    /* JADX INFO: renamed from: a */
    final void m243a(int i, int i2, int i3) {
        this.f687a.m171a(i, 4, 64);
        int iM205p = this.f687a.m205p(i) + 2 + 4;
        this.f687a.m171a(i2, iM205p, 64);
        this.f687a.m171a(i3, iM205p + this.f687a.m205p(i2) + 2, 64);
    }

    /* JADX INFO: renamed from: b */
    public final void m244b() {
        this.f687a.m173a(0, 0, this.f687a.f446c, 60, 0);
    }

    /* JADX INFO: renamed from: b */
    final void m245b(int i, int i2) {
        int i3 = this.f687a.f446c >> 1;
        int i4 = (this.f687a.f499d - (this.f687a.f499d >> 2)) - 90;
        int i5 = (this.f687a.f446c >> 1) - i3;
        int i6 = this.f687a.f499d - i4;
        if (this.f687a.f371ae[0].f98Q != 0) {
            this.f689c[this.f688b] = this.f687a.f371ae[0].f95N;
            this.f690d[this.f688b] = this.f687a.f322F;
            this.f688b = (this.f688b + 1) % 5;
            this.f687a.f371ae[0].f98Q = 0L;
        } else if (this.f687a.f371ae[0].f96O != 0) {
            this.f687a.f360aQ = "";
            StringBuffer stringBuffer = new StringBuffer();
            RunnableC0017l runnableC0017l = this.f687a;
            runnableC0017l.f360aQ = stringBuffer.append(runnableC0017l.f360aQ).append("x").toString();
            StringBuffer stringBuffer2 = new StringBuffer();
            RunnableC0017l runnableC0017l2 = this.f687a;
            runnableC0017l2.f360aQ = stringBuffer2.append(runnableC0017l2.f360aQ).append(this.f687a.f371ae[0].f99R).toString();
            this.f687a.f546t.m65a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length(), i3, i4 - this.f687a.f546t.m67c(), 1);
            this.f687a.f360aQ = "";
            StringBuffer stringBuffer3 = new StringBuffer();
            RunnableC0017l runnableC0017l3 = this.f687a;
            runnableC0017l3.f360aQ = stringBuffer3.append(runnableC0017l3.f360aQ).append((this.f687a.f371ae[0].f95N * 6553) >> 16).toString();
            this.f687a.f546t.m65a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length(), i3, i4, 1);
        } else if (this.f687a.f371ae[0].f97P != 0) {
            this.f687a.f360aQ = "";
            StringBuffer stringBuffer4 = new StringBuffer();
            RunnableC0017l runnableC0017l4 = this.f687a;
            runnableC0017l4.f360aQ = stringBuffer4.append(runnableC0017l4.f360aQ).append("x").toString();
            StringBuffer stringBuffer5 = new StringBuffer();
            RunnableC0017l runnableC0017l5 = this.f687a;
            runnableC0017l5.f360aQ = stringBuffer5.append(runnableC0017l5.f360aQ).append(this.f687a.f371ae[0].f99R).toString();
            this.f687a.f546t.m65a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length(), i3, i4 - this.f687a.f546t.m67c(), 1);
            this.f687a.f360aQ = "";
            StringBuffer stringBuffer6 = new StringBuffer();
            RunnableC0017l runnableC0017l6 = this.f687a;
            runnableC0017l6.f360aQ = stringBuffer6.append(runnableC0017l6.f360aQ).append("+").toString();
            StringBuffer stringBuffer7 = new StringBuffer();
            RunnableC0017l runnableC0017l7 = this.f687a;
            runnableC0017l7.f360aQ = stringBuffer7.append(runnableC0017l7.f360aQ).append((this.f687a.f371ae[0].f95N * 6553) >> 16).toString();
            this.f687a.f546t.m65a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length(), i3, i4, 1);
        }
        long j = 0;
        for (int i7 = 0; i7 < 5; i7++) {
            if (this.f689c[i7] != 0) {
                int i8 = this.f687a.f322F - this.f690d[i7];
                if (i8 < 500) {
                    int i9 = i3 + (((i5 * i8) * 43) >> 16);
                    int i10 = i4 + (((i8 * i6) * 43) >> 16);
                    this.f687a.f360aQ = "";
                    StringBuffer stringBuffer8 = new StringBuffer();
                    RunnableC0017l runnableC0017l8 = this.f687a;
                    runnableC0017l8.f360aQ = stringBuffer8.append(runnableC0017l8.f360aQ).append("+").toString();
                    StringBuffer stringBuffer9 = new StringBuffer();
                    RunnableC0017l runnableC0017l9 = this.f687a;
                    runnableC0017l9.f360aQ = stringBuffer9.append(runnableC0017l9.f360aQ).append(this.f689c[i7]).toString();
                    this.f687a.f546t.m65a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length(), i9, i10, 1);
                    j += this.f689c[i7];
                } else {
                    this.f689c[i7] = 0;
                }
            }
        }
        this.f687a.f360aQ = "";
        StringBuffer stringBuffer10 = new StringBuffer();
        RunnableC0017l runnableC0017l10 = this.f687a;
        runnableC0017l10.f360aQ = stringBuffer10.append(runnableC0017l10.f360aQ).append(this.f687a.f371ae[0].f94M - j).toString();
        this.f687a.f546t.m65a(this.f687a.f360aQ, 0, this.f687a.f360aQ.length(), 19, 0, 0);
    }

    /* JADX INFO: renamed from: c */
    void m246c() {
        int iM206q = (this.f687a.m206q(112) - 5) - 3;
        int iM205p = this.f687a.f446c - this.f687a.m205p(112);
        int i = ((((this.f687a.f499d - 60) - 90) - iM206q) >> 1) + 60;
        int i2 = i + iM206q + 5;
        this.f687a.m171a(112, iM205p, i);
        for (int i3 = 0; i3 < 10; i3++) {
            if (!this.f687a.f373ag[i3].f224j && !this.f687a.f373ag[i3].f223i) {
                int i4 = (i2 - ((int) ((this.f687a.f373ag[i3].f135aa / this.f687a.f373ag[i3].f107Z) * iM206q))) - 3;
                if (this.f687a.f373ag[i3].f218d || (this.f687a.f369ac.f725e == 2 && this.f687a.f373ag[i3].f138ad == 0)) {
                    this.f687a.m171a(24, (iM205p + 3) - this.f687a.m205p(24), i4 - (this.f687a.m206q(24) >> 1));
                } else if (this.f687a.f373ag[i3].f214c) {
                    this.f687a.m171a(20, (iM205p + 3) - this.f687a.m205p(20), i4 - (this.f687a.m206q(20) >> 1));
                } else {
                    this.f687a.m171a(28, (iM205p + 3) - this.f687a.m205p(28), i4 - (this.f687a.m206q(28) >> 1));
                }
            }
        }
    }
}
