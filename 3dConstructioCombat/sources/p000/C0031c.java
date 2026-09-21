package p000;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0031c {

    /* JADX INFO: renamed from: a */
    public static final C0025ay f376a = new C0025ay();

    /* JADX INFO: renamed from: b */
    public static final C0025ay f377b = new C0025ay(65536, 0, 0);

    /* JADX INFO: renamed from: c */
    public static final C0025ay f378c = new C0025ay(-65536, 0, 0);

    /* JADX INFO: renamed from: d */
    public static final C0025ay f379d = new C0025ay(0, 65536, 0);

    /* JADX INFO: renamed from: e */
    public static final C0025ay f380e = new C0025ay(0, -65536, 0);

    /* JADX INFO: renamed from: f */
    public static final C0025ay f381f = new C0025ay(0, 0, 65536);

    /* JADX INFO: renamed from: g */
    public static final C0025ay f382g = new C0025ay(0, 0, -65536);

    static {
        new C0034f();
        new C0024ax();
    }

    /* JADX INFO: renamed from: a */
    public static int m209a(int i) {
        return ((i / 1) * 65) + ((i / 10) * 5) + ((i / 100) * 3) + ((i / 1000) * 6);
    }

    /* JADX INFO: renamed from: a */
    public static int m210a(int i, int i2) {
        return (int) ((((long) i) * ((long) i2)) >> 16);
    }

    /* JADX INFO: renamed from: a */
    public static int m211a(C0022av c0022av, C0024ax c0024ax, C0025ay c0025ay, C0025ay c0025ay2) {
        char c;
        char c2;
        boolean z;
        char c3;
        C0025ay c0025ay3;
        boolean z2;
        char c4;
        boolean z3 = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        C0025ay c0025ay4 = f378c;
        C0025ay c0025ay5 = f380e;
        C0025ay c0025ay6 = f382g;
        if (c0022av.f245a.f249a < c0024ax.f247a.f249a) {
            c = 0;
            i = c0024ax.f247a.f249a;
            z3 = false;
        } else if (c0022av.f245a.f249a > c0024ax.f248b.f249a) {
            c = 1;
            i = c0024ax.f248b.f249a;
            c0025ay4 = f377b;
            z3 = false;
        } else {
            c = 2;
        }
        if (c0022av.f245a.f250b < c0024ax.f247a.f250b) {
            c2 = 0;
            z = false;
            i2 = c0024ax.f247a.f250b;
        } else if (c0022av.f245a.f250b > c0024ax.f248b.f250b) {
            c2 = 1;
            i2 = c0024ax.f248b.f250b;
            z = false;
            c0025ay5 = f379d;
        } else {
            c2 = 2;
            z = z3;
        }
        if (c0022av.f245a.f251c < c0024ax.f247a.f251c) {
            c3 = 0;
            z2 = false;
            c0025ay3 = c0025ay6;
            i3 = c0024ax.f247a.f251c;
        } else if (c0022av.f245a.f251c > c0024ax.f248b.f251c) {
            int i4 = c0024ax.f248b.f251c;
            c0025ay3 = f381f;
            z2 = false;
            i3 = i4;
            c3 = 1;
        } else {
            c3 = 2;
            c0025ay3 = c0025ay6;
            z2 = z;
        }
        if (z2) {
            return -65536;
        }
        int i5 = (c == 2 || c0022av.f246b.f249a == 0) ? -65536 : (int) (((((long) (i - c0022av.f245a.f249a)) << 32) / ((long) c0022av.f246b.f249a)) >> 16);
        int i6 = (c2 == 2 || c0022av.f246b.f250b == 0) ? -65536 : (int) (((((long) (i2 - c0022av.f245a.f250b)) << 32) / ((long) c0022av.f246b.f250b)) >> 16);
        int i7 = (c3 == 2 || c0022av.f246b.f251c == 0) ? -65536 : (int) (((((long) (i3 - c0022av.f245a.f251c)) << 32) / ((long) c0022av.f246b.f251c)) >> 16);
        if (i5 > i6 && i5 > i7) {
            c4 = 0;
        } else if (i6 > i7) {
            c0025ay4 = c0025ay5;
            i5 = i6;
            c4 = 1;
        } else {
            c0025ay4 = c0025ay3;
            i5 = i7;
            c4 = 2;
        }
        c0025ay2.m174a(c0025ay4);
        if (i5 < 0 || i5 > 65536) {
            return -65536;
        }
        if (c4 != 0) {
            c0025ay.f249a = c0022av.f245a.f249a + ((int) ((((long) i5) * ((long) c0022av.f246b.f249a)) >> 16));
            if (c0025ay.f249a < c0024ax.f247a.f249a || c0025ay.f249a > c0024ax.f248b.f249a) {
                return -65536;
            }
        } else {
            c0025ay.f249a = i;
        }
        if (c4 != 1) {
            c0025ay.f250b = c0022av.f245a.f250b + ((int) ((((long) i5) * ((long) c0022av.f246b.f250b)) >> 16));
            if (c0025ay.f250b < c0024ax.f247a.f250b || c0025ay.f250b > c0024ax.f248b.f250b) {
                return -65536;
            }
        } else {
            c0025ay.f250b = i2;
        }
        if (c4 == 2) {
            c0025ay.f251c = i3;
            return i5;
        }
        c0025ay.f251c = c0022av.f245a.f251c + ((int) ((((long) i5) * ((long) c0022av.f246b.f251c)) >> 16));
        if (c0025ay.f251c < c0024ax.f247a.f251c || c0025ay.f251c > c0024ax.f248b.f251c) {
            return -65536;
        }
        return i5;
    }

    /* JADX INFO: renamed from: a */
    public static void m212a(C0024ax c0024ax, C0024ax c0024ax2, C0025ay c0025ay) {
        c0024ax.f247a.f249a = c0024ax2.f247a.f249a + c0025ay.f249a;
        c0024ax.f247a.f250b = c0024ax2.f247a.f250b + c0025ay.f250b;
        c0024ax.f247a.f251c = c0024ax2.f247a.f251c + c0025ay.f251c;
        c0024ax.f248b.f249a = c0024ax2.f248b.f249a + c0025ay.f249a;
        c0024ax.f248b.f250b = c0024ax2.f248b.f250b + c0025ay.f250b;
        c0024ax.f248b.f251c = c0024ax2.f248b.f251c + c0025ay.f251c;
    }

    /* JADX INFO: renamed from: a */
    public static void m213a(C0024ax c0024ax, C0025ay c0025ay) {
        c0024ax.f247a.f249a += c0025ay.f249a;
        c0024ax.f247a.f250b += c0025ay.f250b;
        c0024ax.f247a.f251c += c0025ay.f251c;
        c0024ax.f248b.f249a += c0025ay.f249a;
        c0024ax.f248b.f250b += c0025ay.f250b;
        c0024ax.f248b.f251c += c0025ay.f251c;
    }

    /* JADX INFO: renamed from: a */
    public static void m214a(C0025ay c0025ay) {
        c0025ay.f249a = (int) ((((long) c0025ay.f249a) * (-65536)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay.f250b) * (-65536)) >> 16);
        c0025ay.f251c = (int) ((((long) c0025ay.f251c) * (-65536)) >> 16);
    }

    /* JADX INFO: renamed from: a */
    public static void m215a(C0025ay c0025ay, int i) {
        c0025ay.f249a = (int) ((((long) c0025ay.f249a) * ((long) i)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay.f250b) * ((long) i)) >> 16);
        c0025ay.f251c = (int) ((((long) c0025ay.f251c) * ((long) i)) >> 16);
    }

    /* JADX INFO: renamed from: a */
    public static void m216a(C0025ay c0025ay, C0025ay c0025ay2) {
        c0025ay.f249a += c0025ay2.f249a;
        c0025ay.f250b += c0025ay2.f250b;
        c0025ay.f251c += c0025ay2.f251c;
    }

    /* JADX INFO: renamed from: a */
    public static void m217a(C0025ay c0025ay, C0025ay c0025ay2, int i) {
        c0025ay.f249a = (int) ((((long) c0025ay2.f249a) * ((long) i)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay2.f250b) * ((long) i)) >> 16);
        c0025ay.f251c = (int) ((((long) c0025ay2.f251c) * ((long) i)) >> 16);
    }

    /* JADX INFO: renamed from: a */
    public static void m218a(C0025ay c0025ay, C0025ay c0025ay2, C0025ay c0025ay3) {
        c0025ay.f249a = c0025ay2.f249a + c0025ay3.f249a;
        c0025ay.f250b = c0025ay2.f250b + c0025ay3.f250b;
        c0025ay.f251c = c0025ay2.f251c + c0025ay3.f251c;
    }

    /* JADX INFO: renamed from: a */
    public static void m219a(C0025ay c0025ay, C0034f c0034f) {
        int i = ((int) ((((long) c0034f.f439a[0]) * ((long) c0025ay.f249a)) >> 16)) + ((int) ((((long) c0034f.f439a[3]) * ((long) c0025ay.f250b)) >> 16)) + ((int) ((((long) c0034f.f439a[6]) * ((long) c0025ay.f251c)) >> 16));
        int i2 = ((int) ((((long) c0034f.f439a[1]) * ((long) c0025ay.f249a)) >> 16)) + ((int) ((((long) c0034f.f439a[4]) * ((long) c0025ay.f250b)) >> 16)) + ((int) ((((long) c0034f.f439a[7]) * ((long) c0025ay.f251c)) >> 16));
        int i3 = ((int) ((((long) c0034f.f439a[2]) * ((long) c0025ay.f249a)) >> 16)) + ((int) ((((long) c0034f.f439a[5]) * ((long) c0025ay.f250b)) >> 16)) + ((int) ((((long) c0034f.f439a[8]) * ((long) c0025ay.f251c)) >> 16));
        c0025ay.f249a = i;
        c0025ay.f250b = i2;
        c0025ay.f251c = i3;
    }

    /* JADX INFO: renamed from: a */
    public static void m220a(C0034f c0034f, int i) {
        int iM248i = m248i(i);
        int iM246h = m246h(i);
        c0034f.m278a(iM248i, 0, iM246h, 0, 65536, 0, -iM246h, 0, iM248i);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m221a(C0024ax c0024ax, C0024ax c0024ax2) {
        return c0024ax.f247a.f249a <= c0024ax2.f248b.f249a && c0024ax.f247a.f250b <= c0024ax2.f248b.f250b && c0024ax.f247a.f251c <= c0024ax2.f248b.f251c && c0024ax2.f247a.f249a <= c0024ax.f248b.f249a && c0024ax2.f247a.f250b <= c0024ax.f248b.f250b && c0024ax2.f247a.f251c <= c0024ax.f248b.f251c;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m222a(C0025ay c0025ay, C0024ax c0024ax) {
        return m245g(c0025ay, c0024ax.f247a) && m247h(c0025ay, c0024ax.f248b);
    }

    /* JADX INFO: renamed from: b */
    public static int m223b(int i) {
        return i >> 16;
    }

    /* JADX INFO: renamed from: b */
    public static int m224b(int i, int i2) {
        return (int) (((((long) i) << 32) / ((long) i2)) >> 16);
    }

    /* JADX INFO: renamed from: b */
    public static int m225b(C0025ay c0025ay) {
        return ((int) ((((long) c0025ay.f249a) * ((long) c0025ay.f249a)) >> 16)) + ((int) ((((long) c0025ay.f250b) * ((long) c0025ay.f250b)) >> 16)) + ((int) ((((long) c0025ay.f251c) * ((long) c0025ay.f251c)) >> 16));
    }

    /* JADX INFO: renamed from: b */
    public static void m226b(C0025ay c0025ay, int i) {
        int i2 = (int) ((281474976710656L / ((long) i)) >> 16);
        c0025ay.f249a = (int) ((((long) c0025ay.f249a) * ((long) i2)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay.f250b) * ((long) i2)) >> 16);
        c0025ay.f251c = (int) ((((long) i2) * ((long) c0025ay.f251c)) >> 16);
    }

    /* JADX INFO: renamed from: b */
    public static void m227b(C0025ay c0025ay, C0025ay c0025ay2) {
        c0025ay.f249a -= c0025ay2.f249a;
        c0025ay.f250b -= c0025ay2.f250b;
        c0025ay.f251c -= c0025ay2.f251c;
    }

    /* JADX INFO: renamed from: b */
    public static void m228b(C0025ay c0025ay, C0025ay c0025ay2, int i) {
        int i2 = (int) ((281474976710656L / ((long) i)) >> 16);
        c0025ay.f249a = (int) ((((long) c0025ay2.f249a) * ((long) i2)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay2.f250b) * ((long) i2)) >> 16);
        c0025ay.f251c = (int) ((((long) i2) * ((long) c0025ay2.f251c)) >> 16);
    }

    /* JADX INFO: renamed from: b */
    public static void m229b(C0025ay c0025ay, C0025ay c0025ay2, C0025ay c0025ay3) {
        c0025ay.f249a = c0025ay2.f249a - c0025ay3.f249a;
        c0025ay.f250b = c0025ay2.f250b - c0025ay3.f250b;
        c0025ay.f251c = c0025ay2.f251c - c0025ay3.f251c;
    }

    /* JADX INFO: renamed from: b */
    public static void m230b(C0034f c0034f, int i) {
        int iM248i = m248i(i);
        int iM246h = m246h(i);
        c0034f.m278a(iM248i, -iM246h, 0, iM246h, iM248i, 0, 0, 0, 65536);
    }

    /* JADX INFO: renamed from: c */
    public static int m231c(int i) {
        return i << 16;
    }

    /* JADX INFO: renamed from: c */
    public static int m232c(C0025ay c0025ay) {
        return m242f(((int) ((((long) c0025ay.f249a) * ((long) c0025ay.f249a)) >> 16)) + ((int) ((((long) c0025ay.f250b) * ((long) c0025ay.f250b)) >> 16)) + ((int) ((((long) c0025ay.f251c) * ((long) c0025ay.f251c)) >> 16)));
    }

    /* JADX INFO: renamed from: c */
    public static int m233c(C0025ay c0025ay, C0025ay c0025ay2) {
        return ((int) ((((long) c0025ay.f249a) * ((long) c0025ay2.f249a)) >> 16)) + ((int) ((((long) c0025ay.f250b) * ((long) c0025ay2.f250b)) >> 16)) + ((int) ((((long) c0025ay.f251c) * ((long) c0025ay2.f251c)) >> 16));
    }

    /* JADX INFO: renamed from: c */
    public static void m234c(C0025ay c0025ay, C0025ay c0025ay2, C0025ay c0025ay3) {
        c0025ay.f249a = ((int) ((((long) c0025ay2.f250b) * ((long) c0025ay3.f251c)) >> 16)) - ((int) ((((long) c0025ay2.f251c) * ((long) c0025ay3.f250b)) >> 16));
        c0025ay.f250b = ((int) ((((long) c0025ay2.f251c) * ((long) c0025ay3.f249a)) >> 16)) - ((int) ((((long) c0025ay2.f249a) * ((long) c0025ay3.f251c)) >> 16));
        c0025ay.f251c = ((int) ((((long) c0025ay2.f249a) * ((long) c0025ay3.f250b)) >> 16)) - ((int) ((((long) c0025ay2.f250b) * ((long) c0025ay3.f249a)) >> 16));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m235c(C0025ay c0025ay, int i) {
        int iM232c = m232c(c0025ay);
        if (iM232c <= i) {
            return false;
        }
        int i2 = (int) ((281474976710656L / ((long) iM232c)) >> 16);
        c0025ay.f249a = (int) ((((long) c0025ay.f249a) * ((long) i2)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay.f250b) * ((long) i2)) >> 16);
        c0025ay.f251c = (int) ((((long) i2) * ((long) c0025ay.f251c)) >> 16);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m236c(C0025ay c0025ay, C0025ay c0025ay2, int i) {
        int iM232c = m232c(c0025ay2);
        if (iM232c <= i) {
            return false;
        }
        int i2 = (int) ((281474976710656L / ((long) iM232c)) >> 16);
        c0025ay.f249a = (int) ((((long) c0025ay2.f249a) * ((long) i2)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay2.f250b) * ((long) i2)) >> 16);
        c0025ay.f251c = (int) ((((long) i2) * ((long) c0025ay2.f251c)) >> 16);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static int m237d(int i) {
        return (int) (((((long) ((int) ((((long) i) * 205887) >> 16))) << 32) / 11796480) >> 16);
    }

    /* JADX INFO: renamed from: d */
    public static int m238d(C0025ay c0025ay, C0025ay c0025ay2) {
        int i = c0025ay.f249a - c0025ay2.f249a;
        int i2 = c0025ay.f250b - c0025ay2.f250b;
        int i3 = c0025ay.f251c - c0025ay2.f251c;
        return ((int) ((((long) i) * ((long) i)) >> 16)) + ((int) ((((long) i2) * ((long) i2)) >> 16)) + ((int) ((((long) i3) * ((long) i3)) >> 16));
    }

    /* JADX INFO: renamed from: d */
    public static void m239d(C0025ay c0025ay) {
        int iM232c = (int) ((281474976710656L / ((long) m232c(c0025ay))) >> 16);
        c0025ay.f249a = (int) ((((long) c0025ay.f249a) * ((long) iM232c)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay.f250b) * ((long) iM232c)) >> 16);
        c0025ay.f251c = (int) ((((long) iM232c) * ((long) c0025ay.f251c)) >> 16);
    }

    /* JADX INFO: renamed from: e */
    public static int m240e(int i) {
        return (int) (((((long) ((int) ((((long) i) * 11796480) >> 16))) << 32) / 205887) >> 16);
    }

    /* JADX INFO: renamed from: e */
    public static int m241e(C0025ay c0025ay, C0025ay c0025ay2) {
        int i = c0025ay.f249a - c0025ay2.f249a;
        int i2 = c0025ay.f250b - c0025ay2.f250b;
        int i3 = c0025ay.f251c - c0025ay2.f251c;
        return m242f(((int) ((((long) i) * ((long) i)) >> 16)) + ((int) ((((long) i2) * ((long) i2)) >> 16)) + ((int) ((((long) i3) * ((long) i3)) >> 16)));
    }

    /* JADX INFO: renamed from: f */
    public static int m242f(int i) {
        int iM224b = (65536 + i) >> 1;
        for (int i2 = 0; i2 < 8; i2++) {
            iM224b = (iM224b + m224b(i, iM224b)) >> 1;
        }
        return iM224b;
    }

    /* JADX INFO: renamed from: f */
    public static void m243f(C0025ay c0025ay, C0025ay c0025ay2) {
        int iM232c = (int) ((281474976710656L / ((long) m232c(c0025ay2))) >> 16);
        c0025ay.f249a = (int) ((((long) c0025ay2.f249a) * ((long) iM232c)) >> 16);
        c0025ay.f250b = (int) ((((long) c0025ay2.f250b) * ((long) iM232c)) >> 16);
        c0025ay.f251c = (int) ((((long) iM232c) * ((long) c0025ay2.f251c)) >> 16);
    }

    /* JADX INFO: renamed from: g */
    public static int m244g(int i) {
        return 102943 - m210a(m242f(65536 - i), m210a(m210a(m210a(-1228, i) + 4866, i) - 13901, i) + 102939);
    }

    /* JADX INFO: renamed from: g */
    private static boolean m245g(C0025ay c0025ay, C0025ay c0025ay2) {
        return c0025ay.f249a > c0025ay2.f249a && c0025ay.f250b > c0025ay2.f250b && c0025ay.f251c > c0025ay2.f251c;
    }

    /* JADX INFO: renamed from: h */
    private static int m246h(int i) {
        int i2;
        int i3;
        int i4 = 205887;
        if (i <= 102943 || i > 205887) {
            if (i > 205887 && i <= 308830) {
                i3 = i;
            } else if (i > 308830) {
                i3 = 411774;
                i4 = i;
            } else {
                i2 = 1;
            }
            i = i3 - i4;
            i2 = -1;
        } else {
            i = 205887 - i;
            i2 = 1;
        }
        int iM210a = m210a(i, i);
        return i2 * m210a(m210a(m210a(498, iM210a) - 10882, iM210a) + 65536, i);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m247h(C0025ay c0025ay, C0025ay c0025ay2) {
        return c0025ay.f249a < c0025ay2.f249a && c0025ay.f250b < c0025ay2.f250b && c0025ay.f251c < c0025ay2.f251c;
    }

    /* JADX INFO: renamed from: i */
    private static int m248i(int i) {
        int i2 = -1;
        if (i > 102943 && i <= 205887) {
            i = 205887 - i;
        } else if (i > 102943 && i <= 308830) {
            i -= 205887;
        } else if (i > 308830) {
            i = 411774 - i;
            i2 = 1;
        } else {
            i2 = 1;
        }
        int iM210a = m210a(i, i);
        return i2 * (m210a(m210a(2328, iM210a) - 32551, iM210a) + 65536);
    }
}
