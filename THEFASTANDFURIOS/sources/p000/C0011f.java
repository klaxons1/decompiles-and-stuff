package p000;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0011f {

    /* JADX INFO: renamed from: a */
    private RunnableC0017l f241a;

    /* JADX INFO: renamed from: b */
    private int f242b;

    /* JADX INFO: renamed from: c */
    private int f243c;

    /* JADX INFO: renamed from: d */
    private int f244d;

    /* JADX INFO: renamed from: e */
    private char[] f245e;

    /* JADX INFO: renamed from: f */
    private int f246f;

    /* JADX INFO: renamed from: g */
    private int f247g;

    /* JADX INFO: renamed from: h */
    private int f248h;

    /* JADX INFO: renamed from: i */
    private int f249i;

    public C0011f(RunnableC0017l runnableC0017l) {
        this.f241a = runnableC0017l;
    }

    /* JADX INFO: renamed from: b */
    private int m57b(String str, int i, int i2) {
        int iM120a = RunnableC0017l.m120a(str, i, i2, ' ');
        int iM120a2 = RunnableC0017l.m120a(str, i, i2, (char) 1);
        int iM120a3 = RunnableC0017l.m120a(str, i, i2, '\n');
        if (iM120a < (iM120a2 < iM120a3 ? iM120a2 : iM120a3)) {
            return iM120a;
        }
        return iM120a2 < iM120a3 ? iM120a2 : iM120a3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006f  */
    /* JADX INFO: renamed from: d */
    private void m58d() {
        int i = Integer.MAX_VALUE;
        short s = (short) (this.f241a.f343a[this.f242b + 1] & 65535);
        short s2 = (short) (this.f241a.f343a[s] >> 16);
        int i2 = 0;
        int i3 = -1;
        while (i2 < s2) {
            int iM166a = this.f241a.m166a(s, i2);
            short s3 = (short) (this.f241a.f343a[iM166a] >> 16);
            short s4 = (short) (this.f241a.f343a[iM166a] & 65535);
            short s5 = (short) (this.f241a.f343a[iM166a + 1] >> 16);
            if (s3 <= 255) {
                int i4 = ((s3 - this.f246f) * (s3 - this.f246f)) + ((s4 - this.f247g) * (s4 - this.f247g)) + ((s5 - this.f248h) * (s5 - this.f248h));
                if (i4 < i) {
                    i = i4;
                } else {
                    iM166a = i3;
                }
            } else if (i3 != -1) {
                iM166a = i3;
            }
            i2++;
            i3 = iM166a;
        }
        this.f243c = i3;
    }

    /* JADX INFO: renamed from: a */
    final int m59a(String str, int i, int i2) {
        int i3 = 0;
        int i4 = i + i2;
        while (i < i4) {
            int iCharAt = ((str.charAt(i) - 31) << 3) + 6 + 4;
            if (iCharAt < this.f244d) {
                i3 += this.f245e[iCharAt];
            }
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    final int m60a(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = i2 + 0;
        int i9 = 0;
        while (true) {
            if (i7 < i8 && (str.charAt(i7) == 1 || str.charAt(i7) == '\n')) {
                i7++;
            }
            while (i7 < i8 && str.charAt(i7) == ' ') {
                i7++;
            }
            if (i7 >= i8) {
                return i9;
            }
            int iM57b = m57b(str, i7, i8);
            if (iM57b + 1 < i8) {
                int i10 = iM57b + 1;
                if (str.charAt(i10) == '!' || str.charAt(i10) == '.' || str.charAt(i10) == '?') {
                    iM57b = m57b(str, i10, i8);
                }
            }
            while (iM57b < i8 - 1 && str.charAt(iM57b) != 1 && str.charAt(iM57b) != '\n') {
                int iM57b2 = m57b(str, iM57b + 1, i8);
                if (iM57b2 + 1 < i8) {
                    int i11 = iM57b2 + 1;
                    if (str.charAt(i11) == '!' || str.charAt(i11) == '.' || str.charAt(i11) == '?') {
                        iM57b2 = m57b(str, i11, i8);
                    }
                }
                if (m59a(str, i7, iM57b2 - i7) > i3) {
                    break;
                }
                iM57b = iM57b2;
            }
            int i12 = iM57b;
            while (m59a(str, i7, i12 - i7) > i3) {
                i12--;
            }
            for (int i13 = i12; i13 >= i7 && str.charAt(i13 - 1) == ' '; i13--) {
            }
            i9++;
            i7 = i12;
        }
    }

    /* JADX INFO: renamed from: a */
    final int m61a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int iM67c;
        int iM59a;
        int i11 = 0;
        int i12 = i2 + 0;
        int i13 = 0;
        if ((i6 & 12) != 0) {
            int i14 = 0 + i2;
            this.f249i = 0;
            int i15 = 0;
            int iM67c2 = 0;
            while (true) {
                if (i15 < i14 && str.charAt(i15) == ' ') {
                    i15++;
                } else {
                    if (i15 >= i14) {
                        break;
                    }
                    int iM120a = RunnableC0017l.m120a(str, i15, i14, ' ');
                    while (iM120a < i14 - 1) {
                        int iM120a2 = RunnableC0017l.m120a(str, iM120a + 1, i14, ' ');
                        if (m59a(str, i15, iM120a2 - i15) > i3) {
                            break;
                        }
                        iM120a = iM120a2;
                    }
                    while (true) {
                        iM59a = m59a(str, i15, iM120a - i15);
                        if (iM59a <= i3) {
                            break;
                        }
                        iM120a--;
                    }
                    if (this.f249i < iM59a) {
                        this.f249i = iM59a;
                    }
                    i15 = iM120a;
                    iM67c2 = m67c() + 0 + iM67c2;
                }
            }
            if ((i6 & 4) != 0) {
                i5 -= iM67c2 >> 1;
            } else if ((i6 & 8) != 0) {
                i5 -= iM67c2;
            }
            i10 = i6 & 3;
            iM67c = i5;
        } else {
            i10 = i6;
            iM67c = i5;
        }
        while (true) {
            if (i11 < i12 && (str.charAt(i11) == 1 || str.charAt(i11) == '\n')) {
                i11++;
            }
            while (i11 < i12 && str.charAt(i11) == ' ') {
                i11++;
            }
            if (i11 >= i12) {
                break;
            }
            int iM57b = m57b(str, i11, i12);
            if (iM57b + 1 < i12) {
                int i16 = iM57b + 1;
                if (str.charAt(i16) == '!' || str.charAt(i16) == '.' || str.charAt(i16) == '?') {
                    iM57b = m57b(str, i16, i12);
                }
            }
            while (iM57b < i12 - 1 && str.charAt(iM57b) != 1 && str.charAt(iM57b) != '\n') {
                int iM57b2 = m57b(str, iM57b + 1, i12);
                if (iM57b2 + 1 < i12) {
                    int i17 = iM57b2 + 1;
                    if (str.charAt(i17) == '!' || str.charAt(i17) == '.' || str.charAt(i17) == '?') {
                        iM57b2 = m57b(str, i17, i12);
                    }
                }
                if (m59a(str, i11, iM57b2 - i11) > i3) {
                    break;
                }
                iM57b = iM57b2;
            }
            int i18 = iM57b;
            while (m59a(str, i11, i18 - i11) > i3) {
                i18--;
            }
            int i19 = i18;
            while (i19 >= i11 && str.charAt(i19 - 1) == ' ') {
                i19--;
            }
            if (i8 == -1 || i9 == -1) {
                m65a(str, i11, i19 - i11, i4, iM67c, i10);
                iM67c += m67c();
            } else if (i13 >= i8 && i13 <= i9) {
                m65a(str, i11, i19 - i11, i4, iM67c, i10);
                iM67c += m67c();
            }
            int i20 = i13 + 1;
            if (i20 > i9 && i9 != -1) {
                break;
            }
            i13 = i20;
            i11 = i18;
        }
        return iM67c;
    }

    /* JADX INFO: renamed from: a */
    final void m62a() {
        this.f242b = -1;
        this.f243c = -1;
        this.f246f = 0;
        this.f247g = 0;
        this.f248h = 0;
        this.f249i = 0;
    }

    /* JADX INFO: renamed from: a */
    final void m63a(int i) {
        this.f246f = 255;
        this.f247g = 255;
        this.f248h = 255;
        if (this.f242b >= 0) {
            m58d();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m64a(int i, int i2) {
        if (this.f242b >= 0) {
            this.f241a.m208s(this.f242b);
        }
        this.f242b = 460;
        this.f241a.m207r(this.f242b);
        m58d();
        int iM213y = this.f241a.m213y(325);
        int i3 = (short) (this.f241a.f343a[326] >> 16);
        this.f245e = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            this.f245e[i4] = this.f241a.m164B(iM213y);
        }
        this.f244d = i3;
        this.f241a.m214z(325);
    }

    /* JADX INFO: renamed from: a */
    final void m65a(String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int iM59a = m59a(str, i, i2);
        int iM67c = m67c();
        if ((i5 & 1) != 0) {
            i6 = i3 - (iM59a >> 1);
        } else {
            i6 = (i5 & 2) != 0 ? i3 - iM59a : i3;
        }
        if ((i5 & 4) != 0) {
            i4 -= iM67c >> 1;
        } else if ((i5 & 8) != 0) {
            i4 -= iM67c;
        }
        int i7 = this.f242b;
        short s = (short) (this.f241a.f343a[(short) (this.f241a.f343a[((short) (this.f241a.f343a[this.f243c + 1] & 65535)) + 2] >> 16)] >> 16);
        int i8 = i + i2;
        int i9 = i4 - 4;
        while (i < i8) {
            int iCharAt = ((str.charAt(i) - 31) << 3) + 6;
            int i10 = ((this.f245e[iCharAt + 1] & 255) << 8) | (this.f245e[iCharAt] & 255);
            int i11 = ((this.f245e[(iCharAt + 2) + 1] & 255) << 8) | (this.f245e[iCharAt + 2] & 255);
            char c = this.f245e[iCharAt + 4];
            char c2 = this.f245e[iCharAt + 5];
            int i12 = ((this.f245e[(iCharAt + 6) + 1] & 255) << 8) | (this.f245e[iCharAt + 6] & 255);
            this.f241a.m175a(s, i6 - i10, (i9 - i11) + i12, i6, i12 + i9, c, c2, false);
            i6 += c;
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m66b() {
        if (this.f245e != null) {
            this.f245e = null;
        }
        if (this.f242b >= 0) {
            this.f241a.m208s(this.f242b);
        }
        this.f242b = -1;
    }

    /* JADX INFO: renamed from: c */
    final int m67c() {
        return ((short) (this.f241a.f343a[this.f242b] & 65535)) + 2;
    }
}
