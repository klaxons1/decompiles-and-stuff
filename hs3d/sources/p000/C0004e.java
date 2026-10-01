package p000;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
final class C0004e {

    /* JADX INFO: renamed from: a */
    static byte f125a;

    /* JADX INFO: renamed from: a */
    static float f126a;

    /* JADX INFO: renamed from: a */
    static C0003d f127a;

    /* JADX INFO: renamed from: a */
    static C0005f f128a;

    /* JADX INFO: renamed from: a */
    static boolean f130a;

    /* JADX INFO: renamed from: b */
    static byte f134b;

    /* JADX INFO: renamed from: b */
    static float f135b;

    /* JADX INFO: renamed from: b */
    static C0003d f136b;

    /* JADX INFO: renamed from: b */
    static C0005f f137b;

    /* JADX INFO: renamed from: b */
    static boolean f138b;

    /* JADX INFO: renamed from: c */
    static float f139c;

    /* JADX INFO: renamed from: c */
    static C0005f f140c;

    /* JADX INFO: renamed from: d */
    static float f141d;

    /* JADX INFO: renamed from: e */
    static float f142e;

    /* JADX INFO: renamed from: f */
    static float f143f;

    /* JADX INFO: renamed from: g */
    static float f144g;

    /* JADX INFO: renamed from: h */
    private static float f145h;

    /* JADX INFO: renamed from: a */
    static boolean[] f132a = {false, false, false, false};

    /* JADX INFO: renamed from: a */
    static byte[] f131a = {77, 73, 68, 108, 101, 116, 45, 74, 97, 114, 45, 83, 105, 122, 101};

    /* JADX INFO: renamed from: a */
    private static short[][] f133a = {new short[]{160, 240}, new short[]{-150, -140}};

    /* JADX INFO: renamed from: a */
    static final C0010k f129a = new C0010k();

    /* JADX INFO: renamed from: i */
    private static float f146i = 0.0f;

    /* JADX INFO: renamed from: j */
    private static float f147j = 0.0f;

    /* JADX INFO: renamed from: k */
    private static float f148k = 5.0f;

    C0004e() {
    }

    /* JADX INFO: renamed from: a */
    static void m50a() {
        if (f140c != null) {
            f140c.m63a(true);
        }
        f140c = null;
        if (f128a != null) {
            f128a.m63a(true);
        }
        f128a = null;
        if (f137b != null) {
            f137b.m63a(true);
        }
        f137b = null;
        if (f127a != null) {
            f127a.m48a();
        }
        f127a = null;
        if (f136b != null) {
            f136b.m48a();
        }
        f136b = null;
        C0009j.f384d[4] = f125a;
        C0009j.f384d[13] = f134b;
        C0011l.m214e();
    }

    /* JADX INFO: renamed from: a */
    public static void m51a(float f, float f2, float f3) {
        f143f = f;
        f142e = f2;
        f144g = f3;
    }

    /* JADX INFO: renamed from: a */
    static void m52a(RunnableC0008i runnableC0008i) {
        if (C0007h.f211a > 0) {
            if (C0009j.f405j > 1 || (C0009j.f405j == 1 && RunnableC0008i.f329j == 0)) {
                int i = C0007h.f211a - RunnableC0008i.f296b;
                C0007h.f211a = i;
                if (i < 1) {
                    C0007h.f211a = 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static byte[] m53a(String str, int i, boolean z) {
        int i2 = 0;
        int length = str.length() >> 1;
        int i3 = z ? 2 : 0;
        byte[] bArr = new byte[length + i3];
        if (z) {
            bArr[0] = (byte) ((length >> 8) & 255);
            bArr[1] = (byte) length;
        }
        while (i2 < str.length()) {
            bArr[i3] = (byte) ((((C0011l.m209c((int) str.charAt(i2)) << 4) & 240) | (C0011l.m209c((int) str.charAt(i2 + 1)) & 15)) ^ i);
            i2 += 2;
            i3++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    static void m54b() {
        boolean z;
        f145h = 0.0f;
        f141d = 1.8f;
        f130a = false;
        f142e = 10.0f;
        f143f = 0.0f;
        f144g = 0.0f;
        f135b = 60.0f;
        f125a = (byte) (C0009j.f384d[4] - 1);
        f134b = C0009j.f384d[13];
        if (RunnableC0008i.f331k == 9) {
            C0002c.m25a(f135b, 320, C0013n.f533f, 0.5f, 600.0f);
        }
        m55c();
        if (C0013n.f546i) {
            if (C0013n.f531f == 1) {
                f128a = C0012m.m226d();
            }
            if (C0013n.f531f == 2 && C0013n.f516d == 1) {
                f140c = C0012m.m216a();
                z = false;
            } else {
                z = true;
            }
            if (z) {
                f137b = C0012m.m225c();
                if (C0013n.f531f == 1) {
                    f136b = new C0003d((byte) 99, (short) 228, "/li.cc", false);
                } else {
                    f127a = new C0003d((byte) 99, (short) 228, "/fa1.cc", false);
                    f136b = new C0003d((byte) 99, (short) 228, "/fa2.cc", false);
                }
                f137b.m62a(0, f136b);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    static void m55c() {
        byte b = (byte) (f125a + 1);
        f125a = b;
        if (b >= 4) {
            f125a = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: d */
    static void m56d() {
        if (f132a[2]) {
            return;
        }
        C0002c.f68a = RunnableC0008i.m112a(new String(C0013n.f512c), (C0011l.f454a + C0000a.f7a) >> 1);
        f132a[2] = true;
    }

    /* JADX INFO: renamed from: e */
    public static void m57e() {
        float f;
        if (RunnableC0008i.f331k == 9) {
            if (C0013n.f539h == 2 || C0013n.f539h == 1) {
                if (C0013n.f561n || f125a == 2) {
                    f135b = 60.0f;
                } else {
                    float f2 = 60.0f + (((C0007h.f264o * 70.0f) * C0007h.f267r) / C0007h.f263n) + ((30.0f * C0007h.f267r) / C0007h.f263n);
                    f135b = f2;
                    if (f2 > 125.0f) {
                        f135b = 125.0f;
                    }
                }
                C0002c.m25a(f135b, C0013n.f528e, C0013n.f533f, 0.5f, 600.0f);
                if (C0013n.f534f) {
                    f129a.m151a(C0007h.f243e);
                    f129a.m147a(-180.0f, 0.0f, 1.0f, 0.0f);
                    f129a.m146a(0.0f, 2.5f, 8.0f);
                    f129a.m145a(Math.toDegrees(C0007h.f266q), 0.0f, 0.0f, -1.0f);
                    f129a.m145a(Math.toDegrees(C0007h.f265p), -1.0f, 0.0f, 0.0f);
                } else if (f125a == 1) {
                    f129a.m151a(C0007h.f243e);
                    f129a.m146a(0.0f, 1.0f, 0.0f);
                    f129a.m145a(Math.toDegrees(C0007h.f266q), 0.0f, 0.0f, 1.0f);
                    f129a.m145a(Math.toDegrees(C0007h.f265p), 1.0f, 0.0f, 0.0f);
                } else if (f125a == 2) {
                    f129a.m151a(C0007h.f243e);
                    f146i += (C0007h.f272w - f146i) * RunnableC0008i.f277a * 3.0f;
                    f129a.m146a(f146i, 3.5f, 6.0f + (0.02f * ((((C0007h.f264o * 70.0f) * C0007h.f267r) / C0007h.f263n) + ((30.0f * C0007h.f267r) / C0007h.f263n))));
                    f129a.m145a(Math.toDegrees(C0007h.f266q) * 0.699999988079071d, 0.0f, 0.0f, 1.0f);
                    f129a.m145a(Math.toDegrees(C0007h.f265p) - 20.0d, 1.0f, 0.0f, 0.0f);
                } else if (f125a == 3) {
                    f129a.m151a(C0007h.f243e);
                    f146i += (C0007h.f272w - f146i) * RunnableC0008i.f277a * 2.0f;
                    f129a.m146a(f146i, 1.5f, (6.0f + (C0007h.f267r / C0007h.f263n)) - ((f135b - 60.0f) * 0.02f));
                    f129a.m145a(Math.toDegrees(C0007h.f266q) * 0.699999988079071d, 0.0f, 0.0f, 1.0f);
                    f129a.m145a(Math.toDegrees(C0007h.f265p), 1.0f, 0.0f, 0.0f);
                } else if (C0013n.f561n) {
                    f143f += (C0013n.f517d - f143f) * RunnableC0008i.f277a * C0013n.f506c;
                    f142e += (C0013n.f526e - f142e) * RunnableC0008i.f277a * C0013n.f506c;
                    f144g += (C0013n.f532f - f144g) * RunnableC0008i.f277a * C0013n.f506c;
                    float f3 = f143f - C0007h.f234c[0];
                    float f4 = f144g - C0007h.f234c[2];
                    float f5 = (f3 * f3) + (f4 * f4);
                    if (f5 < 16.0f) {
                        float fM198b = C0011l.m198b((float) Math.sqrt(f5));
                        f143f = ((f3 * 4.0f) / fM198b) + C0007h.f234c[0];
                        f144g = C0007h.f234c[2] + ((f4 * 4.0f) / fM198b);
                    }
                    f129a.m148a(f143f, f142e + f141d, f144g, C0007h.f234c[0], C0007h.f234c[1], C0007h.f234c[2], 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    float fM198b2 = C0011l.m198b((float) Math.sqrt(((C0007h.f234c[0] - f143f) * (C0007h.f234c[0] - f143f)) + ((C0007h.f234c[1] - f142e) * (C0007h.f234c[1] - f142e)) + ((C0007h.f234c[2] - f144g) * (C0007h.f234c[2] - f144g))));
                    float f6 = f148k + ((((5.0f + ((C0007h.f267r * 2.7f) / 70.0f)) + ((60.0f - f135b) * 0.14f)) - f148k) * RunnableC0008i.f277a * 0.5f);
                    f148k = f6;
                    if (f6 < 6.0f) {
                        f148k = 6.0f;
                    }
                    if (fM198b2 > f148k) {
                        f143f = C0007h.f234c[0] - (((C0007h.f234c[0] - f143f) * f148k) / fM198b2);
                        f142e = C0007h.f234c[1] - (((C0007h.f234c[1] - f142e) * f148k) / fM198b2);
                        f144g = C0007h.f234c[2] - (((C0007h.f234c[2] - f144g) * f148k) / fM198b2);
                        f = 1.0f;
                    } else {
                        f = fM198b2 / f148k;
                    }
                    f141d = C0011l.m208c(f141d + (((1.8f + (C0007h.f267r * 0.027f)) - f141d) * RunnableC0008i.f277a));
                    f129a.m148a(f143f, f142e + f141d, f144g, C0007h.f234c[0], (f * 2.5f) + C0007h.f234c[1], C0007h.f234c[2], 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                if (C0007h.f225b && !C0013n.f561n && f125a != 1) {
                    f129a.m147a(C0007h.f264o * ((7.0f * ((float) Math.sin(f147j))) + ((C0011l.m162a() - 0.5f) * 1.4f)), 0.0f, 0.0f, 1.0f);
                    f147j += RunnableC0008i.f277a;
                }
            } else {
                f135b = 60.0f;
                C0002c.m25a(60.0f, C0013n.f528e, C0013n.f533f, 0.5f, 600.0f);
            }
        }
        f129a.m156b(RunnableC0008i.f291a);
        f143f = RunnableC0008i.f291a[3];
        f142e = RunnableC0008i.f291a[7] - f141d;
        f144g = RunnableC0008i.f291a[11];
        RunnableC0008i.f288a.m144a();
        RunnableC0008i.f288a.m146a(RunnableC0008i.f291a[3], RunnableC0008i.f291a[7], RunnableC0008i.f291a[11]);
        if (C0013n.f546i) {
            if (C0013n.f531f != 1) {
                if (C0013n.f516d == 1) {
                    f126a = f133a[C0013n.f516d - 1][C0013n.f531f - 1] + ((float) Math.toDegrees(C0011l.m165a(RunnableC0008i.f291a[10], RunnableC0008i.f291a[2])));
                    float f7 = f145h + ((0.1f + (C0007h.f267r / 250.0f)) * RunnableC0008i.f277a);
                    f145h = f7;
                    if (f7 > 1.0f) {
                        f145h -= 1.0f;
                    }
                    C0012m.m219a(f140c, f145h);
                    return;
                }
                return;
            }
            float degrees = ((float) Math.toDegrees(C0011l.m165a(RunnableC0008i.f291a[10], RunnableC0008i.f291a[2]))) + f133a[C0013n.f516d - 1][C0013n.f531f - 1];
            f126a = degrees;
            if (f126a < 0.0f) {
                f126a += 360.0f;
            } else if (f126a > 360.0f) {
                f126a -= 360.0f;
            }
            if (f126a > 180.0f) {
                f126a = 360.0f - f126a;
            }
            if (f126a < 90.0f) {
                float f8 = (90.0f - f126a) / 90.0f;
                f130a = true;
                if (RunnableC0008i.f331k == 9) {
                    if ((C0013n.f523d[C0007h.f214a] & 16) == 16) {
                        f130a = false;
                    } else if ((C0013n.f523d[C0007h.f214a] & 8) == 8) {
                        if (C0007h.f217a[3] >= 0.5f) {
                            f8 *= 1.0f - ((C0007h.f217a[3] - 0.5f) * 2.0f);
                        }
                    } else if ((C0013n.f523d[C0007h.f214a] & 32) == 32 && C0007h.f217a[3] <= 0.5f) {
                        f8 *= C0007h.f217a[3] * 2.0f;
                    }
                }
                if (f130a) {
                    f128a.m61a(f8);
                }
            } else {
                f130a = false;
            }
            float f9 = 180.0f + degrees;
            f126a = f9;
            if (f9 < 0.0f) {
                f126a += 360.0f;
            } else if (f126a > 360.0f) {
                f126a -= 360.0f;
            }
            f139c = f126a;
            if (f126a > 180.0f) {
                f126a = 360.0f - f126a;
            }
            if (f126a >= 90.0f) {
                f138b = false;
                return;
            }
            float f10 = (90.0f - f126a) / 90.0f;
            f138b = true;
            if (RunnableC0008i.f331k == 9) {
                if ((C0013n.f523d[C0007h.f214a] & 16) == 16) {
                    f138b = false;
                } else if ((C0013n.f523d[C0007h.f214a] & 8) == 8) {
                    if (C0007h.f217a[3] >= 0.5f) {
                        f10 *= 1.0f - ((C0007h.f217a[3] - 0.5f) * 2.0f);
                    }
                } else if ((C0013n.f523d[C0007h.f214a] & 32) == 32 && C0007h.f217a[3] <= 0.5f) {
                    f10 *= C0007h.f217a[3] * 2.0f;
                }
            }
            if (f138b) {
                f137b.m61a(f10);
            }
        }
    }
}
