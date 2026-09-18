package p000;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0026u {

    /* JADX INFO: renamed from: a */
    int f698a;

    /* JADX INFO: renamed from: b */
    int f699b;

    /* JADX INFO: renamed from: c */
    int f700c;

    /* JADX INFO: renamed from: d */
    int f701d;

    /* JADX INFO: renamed from: e */
    int f702e;

    /* JADX INFO: renamed from: f */
    int f703f;

    /* JADX INFO: renamed from: g */
    C0028w[] f704g;

    /* JADX INFO: renamed from: h */
    C0009d[] f705h;

    /* JADX INFO: renamed from: i */
    int f706i;

    /* JADX INFO: renamed from: j */
    public boolean f707j;

    C0026u() {
    }

    /* JADX INFO: renamed from: d */
    private int m248d(int i) {
        return (this.f698a >= 0 ? i << this.f698a : i >> (-this.f698a)) + this.f699b;
    }

    /* JADX INFO: renamed from: e */
    private int m249e(int i) {
        return (this.f698a >= 0 ? i << this.f698a : i >> (-this.f698a)) + this.f700c;
    }

    /* JADX INFO: renamed from: a */
    final int m250a(int i) {
        int i2 = i - this.f699b;
        return this.f698a >= 0 ? i2 >> this.f698a : i2 << (-this.f698a);
    }

    /* JADX INFO: renamed from: a */
    final int m251a(int i, int i2, int i3) {
        C0009d c0009d = this.f705h[i];
        C0028w c0028w = this.f704g[c0009d.f80b[0] & Short.MAX_VALUE];
        C0028w c0028w2 = this.f704g[c0009d.f80b[1] & Short.MAX_VALUE];
        C0028w c0028w3 = this.f704g[c0009d.f80b[2] & Short.MAX_VALUE];
        long j = ((long) i2) - (((long) c0028w.f712a) << 8);
        long j2 = ((long) i3) - (((long) c0028w.f713b) << 8);
        long j3 = ((long) (c0028w3.f712a - c0028w2.f712a)) << 8;
        long j4 = ((long) (c0028w3.f713b - c0028w2.f713b)) << 8;
        long j5 = ((long) (c0028w2.f712a - c0028w.f712a)) << 8;
        long j6 = ((long) (c0028w2.f713b - c0028w.f713b)) << 8;
        long j7 = (j3 * j6) - (j4 * j5);
        long j8 = ((long) c0028w.f714c) << 8;
        if (j7 != 0) {
            long j9 = (((long) (c0028w2.f714c - c0028w.f714c)) << 8) * ((j2 * j3) - (j * j4));
            j8 += (long) ((int) ((j9 + ((((long) (c0028w3.f714c - c0028w2.f714c)) << 8) * ((j6 * j) - (j5 * j2)))) / j7));
        }
        return (int) j8;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0351  */
    /* JADX INFO: renamed from: a */
    final void m252a(int i, int i2, C0007b c0007b) {
        int i3;
        C0028w c0028w;
        C0028w c0028w2;
        boolean z;
        int i4;
        short s;
        int i5;
        C0028w c0028w3;
        C0028w c0028w4;
        boolean z2;
        int i6;
        boolean z3;
        c0007b.f67b = m250a(c0007b.f67b);
        c0007b.f68c = m254b(c0007b.f68c);
        int iM250a = m250a(i);
        int iM254b = m254b(i2);
        short s2 = c0007b.f66a;
        int i7 = -1;
        int i8 = 0;
        while (i8 <= 6 && c0007b.f66a != -1) {
            C0009d c0009d = this.f705h[c0007b.f66a];
            int i9 = 0;
            while (true) {
                if (i9 >= 3) {
                    i4 = i9;
                    s = s2;
                    i5 = iM254b;
                    break;
                }
                int i10 = i9 < 2 ? i9 + 1 : 0;
                if (c0009d.f80b[i9] < 0) {
                    c0028w3 = this.f704g[c0009d.f80b[i10] & Short.MAX_VALUE];
                    c0028w4 = this.f704g[c0009d.f80b[i9] & Short.MAX_VALUE];
                    z2 = true;
                } else {
                    c0028w3 = this.f704g[c0009d.f80b[i9] & Short.MAX_VALUE];
                    c0028w4 = this.f704g[c0009d.f80b[i10] & Short.MAX_VALUE];
                    z2 = false;
                }
                long j = ((((long) iM250a) - (((long) c0028w3.f712a) << 8)) * (((long) (c0028w4.f713b - c0028w3.f713b)) << 8)) + ((((long) iM254b) - (((long) c0028w3.f713b) << 8)) * (((long) (c0028w3.f712a - c0028w4.f712a)) << 8));
                if ((!z2 || j > 0) && (z2 || j <= 0)) {
                    i6 = i7;
                } else {
                    int i11 = iM254b - c0007b.f68c;
                    int i12 = c0007b.f67b - iM250a;
                    long j2 = (((long) ((c0028w3.f712a << 8) - c0007b.f67b)) * ((long) i11)) + (((long) ((c0028w3.f713b << 8) - c0007b.f68c)) * ((long) i12));
                    long j3 = (((long) i12) * ((long) ((c0028w4.f713b << 8) - c0007b.f68c))) + (((long) ((c0028w4.f712a << 8) - c0007b.f67b)) * ((long) i11));
                    long j4 = ((((long) c0007b.f67b) - (((long) c0028w3.f712a) << 8)) * (((long) (c0028w4.f713b - c0028w3.f713b)) << 8)) + ((((long) c0007b.f68c) - (((long) c0028w3.f713b) << 8)) * (((long) (c0028w3.f712a - c0028w4.f712a)) << 8));
                    if (z2) {
                        z3 = (j2 <= 0 && j3 > 0) || j4 <= 0;
                    } else {
                        z3 = (j2 > 0 && j3 <= 0) || j4 > 0;
                    }
                    if (z3) {
                        short s3 = c0009d.f81c[i9];
                        if (s3 >= 0 && (this.f705h[s3].f79a & this.f706i) != 0) {
                            s = c0007b.f66a;
                            c0007b.f66a = s3;
                            i7 = -1;
                            i4 = i9;
                            i5 = iM254b;
                            break;
                        }
                        if (i7 != i9 || s2 != c0007b.f66a) {
                            if (i7 != -1 && s2 == c0007b.f66a) {
                                int i13 = c0007b.f67b;
                                i5 = c0007b.f68c;
                                i4 = 3;
                                s = s2;
                                iM250a = i13;
                                break;
                            }
                            long j5 = ((long) (c0028w4.f712a - c0028w3.f712a)) << 8;
                            long j6 = ((long) (c0028w4.f713b - c0028w3.f713b)) << 8;
                            long j7 = (((((long) (iM250a - (c0028w3.f712a << 8))) * j6) - (((long) (iM254b - (c0028w3.f713b << 8))) * j5)) * 5) >> 16;
                            long j8 = (((j6 * j6) + (j5 * j5)) << 2) >> 16;
                            iM250a -= (int) ((j6 * j7) / j8);
                            i5 = iM254b + ((int) ((j7 * j5) / j8));
                            i4 = i9;
                            i7 = i9;
                            s = s2;
                            break;
                        }
                        i6 = i9;
                    } else {
                        i6 = i7;
                    }
                }
                i9++;
                i7 = i6;
            }
            if (i4 == 3) {
                if (c0007b.f66a >= 0) {
                    c0007b.f67b = m248d(iM250a);
                    c0007b.f68c = m249e(i5);
                    c0007b.f69d = m255c(m251a(c0007b.f66a, iM250a, i5));
                    return;
                }
                return;
            }
            i8++;
            s2 = s;
            iM254b = i5;
        }
        c0007b.f66a = (short) -1;
        int i14 = 0;
        while (true) {
            int i15 = i14;
            if (i15 >= this.f702e) {
                return;
            }
            C0009d c0009d2 = this.f705h[i15];
            int i16 = 0;
            while (true) {
                i3 = i16;
                if (i3 < 3) {
                    int i17 = i3 < 2 ? i3 + 1 : 0;
                    if (c0009d2.f80b[i3] < 0) {
                        c0028w = this.f704g[c0009d2.f80b[i17] & Short.MAX_VALUE];
                        c0028w2 = this.f704g[c0009d2.f80b[i3] & Short.MAX_VALUE];
                        z = true;
                    } else {
                        c0028w = this.f704g[c0009d2.f80b[i3] & Short.MAX_VALUE];
                        c0028w2 = this.f704g[c0009d2.f80b[i17] & Short.MAX_VALUE];
                        z = false;
                    }
                    long j9 = ((((long) iM250a) - (((long) c0028w.f712a) << 8)) * (((long) (c0028w2.f713b - c0028w.f713b)) << 8)) + ((((long) iM254b) - (((long) c0028w.f713b) << 8)) * (((long) (c0028w.f712a - c0028w2.f712a)) << 8));
                    if (!z) {
                        if (j9 > 0) {
                            break;
                        } else {
                            i16 = i3 + 1;
                        }
                    } else if (j9 <= 0) {
                        break;
                    } else {
                        i16 = i3 + 1;
                    }
                } else {
                    break;
                }
            }
            if (i3 == 3) {
                c0007b.f66a = (short) i15;
                c0007b.f67b = m248d(iM250a);
                c0007b.f68c = m249e(iM254b);
                c0007b.f69d = m255c(m251a(i15, iM250a, iM254b));
                return;
            }
            i14 = i15 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m253a(RunnableC0017l runnableC0017l, int i) {
        this.f707j = false;
        this.f706i = -1;
        this.f699b = runnableC0017l.m163A(i) << 16;
        this.f699b |= runnableC0017l.m163A(i) & 65535;
        this.f700c = runnableC0017l.m163A(i) << 16;
        this.f700c |= runnableC0017l.m163A(i) & 65535;
        this.f701d = runnableC0017l.m163A(i) << 16;
        this.f701d |= runnableC0017l.m163A(i) & 65535;
        this.f698a = runnableC0017l.m163A(i) - 8;
        if (this.f698a >= 0) {
            this.f699b >>= this.f698a;
            this.f699b <<= this.f698a;
            this.f700c >>= this.f698a;
            this.f700c <<= this.f698a;
            this.f701d >>= this.f698a;
            this.f701d <<= this.f698a;
        }
        this.f703f = runnableC0017l.m163A(i);
        this.f704g = new C0028w[this.f703f];
        for (int i2 = 0; i2 < this.f703f; i2++) {
            this.f704g[i2] = new C0028w(this);
            this.f704g[i2].f712a = runnableC0017l.m163A(i);
            this.f704g[i2].f713b = runnableC0017l.m163A(i);
            this.f704g[i2].f714c = runnableC0017l.m163A(i);
        }
        this.f702e = runnableC0017l.m163A(i);
        this.f705h = new C0009d[this.f702e];
        for (int i3 = 0; i3 < this.f702e; i3++) {
            this.f705h[i3] = new C0009d(this);
            this.f705h[i3].f79a = runnableC0017l.m163A(i);
            this.f705h[i3].f80b[0] = runnableC0017l.m163A(i);
            this.f705h[i3].f80b[1] = runnableC0017l.m163A(i);
            this.f705h[i3].f80b[2] = runnableC0017l.m163A(i);
            this.f705h[i3].f81c[0] = runnableC0017l.m163A(i);
            this.f705h[i3].f81c[1] = runnableC0017l.m163A(i);
            this.f705h[i3].f81c[2] = runnableC0017l.m163A(i);
        }
    }

    /* JADX INFO: renamed from: b */
    final int m254b(int i) {
        int i2 = i - this.f700c;
        return this.f698a >= 0 ? i2 >> this.f698a : i2 << (-this.f698a);
    }

    /* JADX INFO: renamed from: c */
    final int m255c(int i) {
        return (this.f698a >= 0 ? i << this.f698a : i >> (-this.f698a)) + this.f701d;
    }
}
