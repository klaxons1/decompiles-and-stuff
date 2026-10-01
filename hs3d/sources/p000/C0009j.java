package p000;

import java.util.Calendar;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
final class C0009j {

    /* JADX INFO: renamed from: a */
    static byte f346a;

    /* JADX INFO: renamed from: a */
    static int f348a;

    /* JADX INFO: renamed from: a */
    private static C0005f f349a;

    /* JADX INFO: renamed from: a */
    static Image f352a;

    /* JADX INFO: renamed from: a */
    static short f354a;

    /* JADX INFO: renamed from: a */
    static String[] f358a;

    /* JADX INFO: renamed from: a */
    static Image[] f359a;

    /* JADX INFO: renamed from: a */
    private static byte[][][] f361a;

    /* JADX INFO: renamed from: b */
    static byte f362b;

    /* JADX INFO: renamed from: b */
    static int f364b;

    /* JADX INFO: renamed from: b */
    static Image f366b;

    /* JADX INFO: renamed from: b */
    private static short f367b;

    /* JADX INFO: renamed from: c */
    static byte f371c;

    /* JADX INFO: renamed from: c */
    private static int f373c;

    /* JADX INFO: renamed from: c */
    static Image f375c;

    /* JADX INFO: renamed from: c */
    private static short f376c;

    /* JADX INFO: renamed from: d */
    static byte f379d;

    /* JADX INFO: renamed from: e */
    private static int f387e;

    /* JADX INFO: renamed from: e */
    private static Image f388e;

    /* JADX INFO: renamed from: e */
    static boolean f389e;

    /* JADX INFO: renamed from: e */
    static byte[] f390e;

    /* JADX INFO: renamed from: f */
    private static Image f393f;

    /* JADX INFO: renamed from: f */
    static boolean f394f;

    /* JADX INFO: renamed from: f */
    static byte[] f395f;

    /* JADX INFO: renamed from: g */
    static boolean f397g;

    /* JADX INFO: renamed from: g */
    static byte[] f398g;

    /* JADX INFO: renamed from: h */
    static boolean f400h;

    /* JADX INFO: renamed from: h */
    static byte[] f401h;

    /* JADX INFO: renamed from: i */
    static byte[] f404i;

    /* JADX INFO: renamed from: j */
    static byte[] f407j;

    /* JADX INFO: renamed from: n */
    private static byte f417n;

    /* JADX INFO: renamed from: o */
    private static byte f420o;

    /* JADX INFO: renamed from: o */
    private static boolean f421o;

    /* JADX INFO: renamed from: p */
    private static byte f423p;

    /* JADX INFO: renamed from: p */
    private static boolean f424p;

    /* JADX INFO: renamed from: q */
    private static byte f426q;

    /* JADX INFO: renamed from: q */
    private static boolean f427q;

    /* JADX INFO: renamed from: i */
    private static boolean f403i = false;

    /* JADX INFO: renamed from: j */
    private static boolean f406j = true;

    /* JADX INFO: renamed from: a */
    static boolean f355a = false;

    /* JADX INFO: renamed from: k */
    private static boolean f409k = false;

    /* JADX INFO: renamed from: l */
    private static boolean f412l = false;

    /* JADX INFO: renamed from: b */
    static boolean f368b = false;

    /* JADX INFO: renamed from: c */
    static boolean f377c = true;

    /* JADX INFO: renamed from: d */
    private static int f381d = 30;

    /* JADX INFO: renamed from: d */
    static boolean f383d = false;

    /* JADX INFO: renamed from: m */
    private static boolean f415m = false;

    /* JADX INFO: renamed from: a */
    public static Hashtable f351a = new Hashtable();

    /* JADX INFO: renamed from: n */
    private static boolean f418n = true;

    /* JADX INFO: renamed from: m */
    private static byte f414m = 1;

    /* JADX INFO: renamed from: a */
    private static String f350a = "http://update.herocraft.com/jad/";

    /* JADX INFO: renamed from: b */
    private static String f365b = "HighSpeed3D";

    /* JADX INFO: renamed from: c */
    private static String f374c = null;

    /* JADX INFO: renamed from: m */
    private static final byte[] f416m = {1, 0, 1, 2, 0, 0, 0, 0, 0, 1, 0, 2, -1, 0, 2, 2, -1, 127, 127, 127, 126};

    /* JADX INFO: renamed from: a */
    static final byte[] f356a = {0, 2, -1, 0, 10, 0, 0, 0, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: b */
    static final byte[] f369b = {0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: n */
    private static final byte[] f419n = new byte[2];

    /* JADX INFO: renamed from: o */
    private static final byte[] f422o = new byte[2];

    /* JADX INFO: renamed from: p */
    private static final byte[] f425p = new byte[2];

    /* JADX INFO: renamed from: a */
    static int[] f357a = null;

    /* JADX INFO: renamed from: b */
    static int[] f370b = null;

    /* JADX INFO: renamed from: a */
    private static float f347a = 0.0f;

    /* JADX INFO: renamed from: b */
    private static float f363b = 0.0f;

    /* JADX INFO: renamed from: c */
    private static float f372c = 0.0f;

    /* JADX INFO: renamed from: a */
    static final C0014o f353a = new C0014o();

    /* JADX INFO: renamed from: d */
    static Image f382d = null;

    /* JADX INFO: renamed from: c */
    static byte[] f378c = null;

    /* JADX INFO: renamed from: r */
    private static boolean f430r = false;

    /* JADX INFO: renamed from: q */
    private static final byte[] f428q = {20, 22, 23, 90, 24, 25};

    /* JADX INFO: renamed from: r */
    private static final byte[] f431r = {81, 0, 1, 2, 3, 4, 32, 125, 5};

    /* JADX INFO: renamed from: s */
    private static final byte[] f433s = {20, 22, 93, 94, 95};

    /* JADX INFO: renamed from: t */
    private static final byte[] f435t = {102, 41, -128, 127};

    /* JADX INFO: renamed from: a */
    private static final byte[][] f360a = {new byte[]{82, 83, 84}, new byte[]{6, 54, 89}, new byte[]{10, 11}, new byte[]{12, 13, 14, 36}, new byte[]{15, 16, 35, 17}, new byte[]{18, 37}, new byte[]{33, 34}, new byte[]{10, 11}, new byte[]{19}};

    /* JADX INFO: renamed from: u */
    private static final byte[] f436u = {38, 39, 40, 126};

    /* JADX INFO: renamed from: d */
    static byte[] f384d = f416m;

    /* JADX INFO: renamed from: e */
    static byte f385e = -1;

    /* JADX INFO: renamed from: f */
    static byte f391f = -1;

    /* JADX INFO: renamed from: k */
    static byte[] f410k = {-1, -1};

    /* JADX INFO: renamed from: g */
    static byte f396g = 2;

    /* JADX INFO: renamed from: r */
    private static byte f429r = 2;

    /* JADX INFO: renamed from: h */
    static byte f399h = 0;

    /* JADX INFO: renamed from: s */
    private static byte f432s = 0;

    /* JADX INFO: renamed from: t */
    private static byte f434t = 0;

    /* JADX INFO: renamed from: i */
    static byte f402i = 0;

    /* JADX INFO: renamed from: d */
    private static float f380d = 0.0f;

    /* JADX INFO: renamed from: e */
    private static float f386e = 0.0f;

    /* JADX INFO: renamed from: f */
    private static float f392f = 0.0f;

    /* JADX INFO: renamed from: j */
    static byte f405j = -1;

    /* JADX INFO: renamed from: k */
    static byte f408k = -1;

    /* JADX INFO: renamed from: l */
    static byte f411l = 0;

    /* JADX INFO: renamed from: l */
    static byte[] f413l = {77, 105, 99, 114, 111, 69, 100, 105, 116, 105, 111, 110, 46, 86, 101, 114, 115, 105, 111, 110};

    C0009j() {
    }

    /* JADX INFO: renamed from: a */
    static void m136a() {
        f359a = null;
        f375c = null;
        f366b = null;
        f393f = null;
        f361a = null;
    }

    /* JADX INFO: renamed from: a */
    private static void m137a(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = new int[6];
        f370b = iArr;
        iArr[0] = C0011l.m167a(i);
        f370b[1] = C0011l.m167a(i2);
        f370b[2] = C0011l.m167a(i3);
        f370b[3] = C0011l.m167a(i4);
        f370b[4] = C0011l.m167a(i5);
        f370b[5] = C0011l.m167a(i6);
    }

    /* JADX WARN: Code duplicated, block: B:707:0x1c98  */
    /* JADX INFO: renamed from: a */
    static void m138a(Graphics graphics) {
        int i;
        switch (f405j) {
            case -1:
                graphics.setColor(-1);
                graphics.fillRect(0, 0, 320, 240);
                if (f414m == 0) {
                    graphics.setColor(f373c);
                    graphics.fillRect(0, 0, 320, 240);
                    graphics.drawImage(f359a[0], 160, 120, 3);
                } else if (f414m == 1) {
                    graphics.drawImage(f359a[1], 160, 120, 3);
                } else if (f414m == 2) {
                    graphics.drawImage(f359a[2], 160, 107, 3);
                }
                C0011l.m183a(graphics, 1, 160, 225, 3);
                break;
            case 0:
                graphics.setColor(0);
                graphics.fillRect(0, 0, 320, 240);
                if (f347a < 0.0f) {
                    graphics.drawRegion(f375c, 0, 0, f375c.getWidth(), 68, 0, 160, (int) (0.0f + ((-68) * (-f347a))), 17);
                    graphics.drawRegion(f375c, 0, 68, f375c.getWidth(), f375c.getHeight() - 68, 0, 160, (int) (68 + (172 * (-f347a))), 17);
                    int height = 68 - (f366b.getHeight() / 2);
                    graphics.drawRegion(f366b, 0, 0, f366b.getWidth(), (f366b.getHeight() / 2) + 13, 0, 320, (int) (((((-f366b.getHeight()) / 2) - height) * (-f347a)) + height), 24);
                    graphics.drawRegion(f366b, 0, f366b.getHeight() / 2, f366b.getWidth(), f366b.getHeight() / 2, 0, 320, (int) (68 + (172 * (-f347a))), 24);
                    int height2 = 68 - (f393f.getHeight() / 2);
                    graphics.drawImage(f393f, 160, (int) (((0 - height2) * (-f347a)) + height2), 17);
                } else if (f347a < 0.3f) {
                    graphics.drawImage(f375c, 160, 0, 17);
                } else if (f347a < 0.5f) {
                    graphics.drawImage(f375c, 160, 0, 17);
                    int width = f366b.getWidth() + 320;
                    graphics.drawImage(f366b, (int) (((320 - width) * ((f347a - 0.3f) / 0.2f)) + width), 68, 10);
                    graphics.drawImage(f393f, (int) (640 + ((-640) * ((f347a - 0.3f) / 0.2f))), 68, 3);
                } else if (f347a < 0.6f) {
                    graphics.drawImage(f375c, 160, 0, 17);
                    graphics.drawImage(f366b, 320, 68, 10);
                    graphics.drawImage(f393f, (int) (0.0f + (186.0f * ((f347a - 0.5f) / 0.1f))), 68, 3);
                } else if (f347a < 0.7f) {
                    graphics.drawImage(f375c, 160, 0, 17);
                    graphics.drawImage(f366b, 320, 68, 10);
                    graphics.drawImage(f393f, (int) (186 + ((-26) * ((f347a - 0.6f) / 0.1f))), 68, 3);
                } else {
                    graphics.drawImage(f375c, 160, 0, 17);
                    graphics.drawImage(f366b, 320, 68, 10);
                    graphics.drawImage(f393f, 160, 68, 3);
                }
                if (f411l != 0 && f347a > 0.7f) {
                    C0011l.m183a(graphics, 1, 160, 199, 3);
                }
                break;
            case 1:
                RunnableC0008i.m117a(-30);
                graphics.drawImage(f393f, 160, 0, 17);
                float f = f363b;
                int i2 = 0;
                while (i2 < 6) {
                    int i3 = (f374c == null && i2 == 3) ? i2 + 1 : i2;
                    int iSin = (int) (Math.sin(Math.toRadians(f)) * 164.0d);
                    int iCos = (int) (Math.cos(Math.toRadians(f)) * 55.0d);
                    float f2 = f + (360 / f387e);
                    if (iCos <= 0) {
                        graphics.drawRegion(f375c, i3 * 64, 91, 64, 64, 0, iSin + 160, iCos + 120, 3);
                    }
                    i2 = i3 + 1;
                    f = f2;
                }
                C0002c.m27a(graphics, C0004e.f129a, 0, 0, 30, 320, 210);
                C0002c.m25a(60.0f, 320, 210, 1.0f, 100.0f);
                RunnableC0008i.f288a.m151a(RunnableC0008i.f298b);
                RunnableC0008i.f288a.m147a(180.0f, 0.0f, 0.0f, 1.0f);
                RunnableC0008i.f288a.m146a(0.0f, 1.2f, 0.0f);
                C0002c.m31a(C0000a.f9a, RunnableC0008i.f288a);
                RunnableC0008i.f288a.m146a(0.0f, C0000a.f19a[C0000a.f5a][0], C0000a.f19a[C0000a.f5a][1]);
                RunnableC0008i.f288a.m154b(C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f288a);
                RunnableC0008i.f288a.m146a(0.0f, 0.0f, C0000a.f19a[C0000a.f5a][2] - C0000a.f19a[C0000a.f5a][1]);
                RunnableC0008i.f288a.m154b(C0000a.f19a[C0000a.f5a][4] / C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f288a);
                RunnableC0008i.f298b.m146a(0.0f, -0.54f, 0.0f);
                C0002c.m31a(f349a, RunnableC0008i.f298b);
                RunnableC0008i.f298b.m146a(0.0f, 0.54f, 0.0f);
                C0004e.m56d();
                C0002c.m31a(C0000a.f9a, RunnableC0008i.f298b);
                RunnableC0008i.f298b.m146a(0.0f, C0000a.f19a[C0000a.f5a][0], C0000a.f19a[C0000a.f5a][1]);
                RunnableC0008i.f298b.m154b(C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f298b);
                RunnableC0008i.f298b.m146a(0.0f, 0.0f, C0000a.f19a[C0000a.f5a][2] - C0000a.f19a[C0000a.f5a][1]);
                RunnableC0008i.f298b.m154b(C0000a.f19a[C0000a.f5a][4] / C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f298b);
                C0002c.m32b();
                float f3 = f363b;
                int i4 = 0;
                while (i4 < 6) {
                    int i5 = (f374c == null && i4 == 3) ? i4 + 1 : i4;
                    int iSin2 = (int) (Math.sin(Math.toRadians(f3)) * 164.0d);
                    int iCos2 = (int) (Math.cos(Math.toRadians(f3)) * 55.0d);
                    float f4 = f3 + (360 / f387e);
                    if (iCos2 > 0) {
                        graphics.drawRegion(f375c, i5 * 91, 0, 91, 91, 0, iSin2 + 160, iCos2 + 120, 3);
                        C0006g.m70a(RunnableC0008i.f293a[f428q[i5]]);
                        C0006g.m79a(graphics, (iSin2 + 160) - (C0006g.m65a(1) / 2), (iCos2 + 166) - (C0006g.f171b[1] / 2), 1, 0, 0);
                    }
                    i4 = i5 + 1;
                    f3 = f4;
                }
                C0011l.m183a(graphics, 0, 305, 225, 3);
                C0011l.m183a(graphics, 1, 15, 225, 3);
                C0007h.m109e();
                break;
            case 2:
                if (RunnableC0008i.f329j == 0 && (C0014o.f569a == 2139062142 || C0014o.f569a == Integer.MAX_VALUE)) {
                    C0014o.f569a = 1080000;
                    f384d[20] = (byte) C0014o.f569a;
                    f384d[19] = (byte) (C0014o.f569a >>> 8);
                    f384d[18] = (byte) (C0014o.f569a >>> 16);
                    f384d[17] = (byte) (C0014o.f569a >>> 24);
                }
                RunnableC0008i.m117a(-30);
                int i6 = f396g - f429r;
                int i7 = i6 > 1 ? -1 : i6 < -1 ? 1 : i6;
                int i8 = (int) (i7 * f380d * 85.0f);
                graphics.drawRegion(f359a[0], (f396g > 0 ? f396g - 1 : 3) * 72, 72, 72, 72, 0, 160, i8 + 35, 3);
                graphics.drawRegion(f359a[0], f396g * 72, 0, 72, 72, 0, 160, i8 + 120, 3);
                graphics.drawRegion(f359a[0], (f396g < 3 ? f396g + 1 : 0) * 72, 72, 72, 72, 0, 160, i8 + 205, 3);
                if (f380d > 0.0f) {
                    if (i7 == -1) {
                        graphics.drawRegion(f359a[0], (f396g + 2 > 3 ? f396g - 2 : f396g + 2) * 72, 72, 72, 72, 0, 160, i8 + 290, 3);
                    } else {
                        graphics.drawRegion(f359a[0], (f396g + (-2) < 0 ? f396g + 2 : f396g - 2) * 72, 72, 72, 72, 0, 160, i8 - 50, 3);
                    }
                }
                graphics.setColor(-256);
                int i9 = f399h - f432s;
                int i10 = i9 > 1 ? -1 : i9 < -1 ? 1 : i9;
                int i11 = (int) (i10 * f386e * 13.0f * 4.0f);
                C0002c.m30a(2);
                int i12 = f396g < 2 ? 0 : 41;
                int i13 = 0;
                while (true) {
                    int i14 = i13;
                    if (i14 >= 5) {
                        if (f386e > 0.0f) {
                            if (i10 == -1) {
                                int i15 = f399h + 3;
                                if (i15 > 4) {
                                    i15 -= 5;
                                }
                                graphics.drawRegion(f359a[1], i15 * 41, i12, 41, 41, 0, i11 + 316, 205, 3);
                            } else {
                                int i16 = f399h - 3;
                                if (i16 < 0) {
                                    i16 += 5;
                                }
                                graphics.drawRegion(f359a[1], i16 * 41, i12, 40, 41, 0, i11 + 4, 205, 3);
                            }
                        }
                        graphics.setColor(i11 == 0 ? -31713 : -8947849);
                        int iAbs = (int) (((41.0f * (1.0f + (Math.abs(i11) / 30.0f))) * 13.0f) / 10.0f);
                        graphics.drawRect(160 - (iAbs / 2), 205 - (iAbs / 2), iAbs, iAbs);
                        C0006g.m70a(RunnableC0008i.f293a[55]);
                        int iM65a = C0006g.m65a(1) - 120;
                        if (iM65a < 0) {
                            iM65a = 0;
                        }
                        C0006g.m79a(graphics, iM65a + 120, 6, 1, 0, 2);
                        C0006g.m70a(RunnableC0008i.f293a[56]);
                        int iM65a2 = C0006g.m65a(1) - 120;
                        if (iM65a2 < 0) {
                            iM65a2 = 0;
                        }
                        C0006g.m79a(graphics, iM65a2 + 120, 26, 1, 0, 2);
                        C0006g.m70a(RunnableC0008i.f293a[59]);
                        int iM65a3 = C0006g.m65a(1) - 120;
                        if (iM65a3 < 0) {
                            iM65a3 = 0;
                        }
                        C0006g.m79a(graphics, iM65a3 + 120, 45, 1, 0, 2);
                        C0006g.m68a((int) f417n);
                        C0006g.m79a(graphics, 202, 6, 1, 0, 0);
                        C0011l.m183a(graphics, 17, 314, 6, 24);
                        C0006g.m70a(f420o == 1 ? RunnableC0008i.f293a[135] : RunnableC0008i.f293a[58]);
                        C0006g.m79a(graphics, 202, 26, 1, 0, 0);
                        C0011l.m183a(graphics, 18, 314, 26, 24);
                        C0006g.m68a((int) f423p);
                        C0006g.m79a(graphics, 202, 45, 1, 0, 0);
                        if ((f348a & (1 << ((f396g * 5) + f399h))) == 0) {
                            graphics.setColor(-11206656);
                            graphics.fillRect(0, 106, 320, 27);
                            C0006g.m70a(RunnableC0008i.f293a[86]);
                            C0006g.m79a(graphics, 160, (240 - C0006g.f171b[1]) / 2, 1, 0, 1);
                            if (f384d[7] == 0 && f409k) {
                                C0011l.m183a(graphics, 22, 15, 225, 3);
                            }
                        } else {
                            C0011l.m183a(graphics, 1, 15, 225, 3);
                        }
                        C0011l.m183a(graphics, 19, 314, 45, 24);
                        C0011l.m183a(graphics, 5, 160, 225, 3);
                        C0011l.m183a(graphics, 4, 160, 15, 3);
                        C0011l.m183a(graphics, 2, 15, 120, 3);
                        C0011l.m183a(graphics, 3, 305, 120, 3);
                        C0011l.m183a(graphics, 0, 305, 225, 3);
                    } else {
                        int i17 = i14 - f399h;
                        if (i17 > 2) {
                            i17 -= 5;
                        } else if (i17 < -2) {
                            i17 += 5;
                        }
                        graphics.drawRegion(f359a[1], i14 * 41, i12, 41, 41, 0, ((i17 * 13) << 2) + 160 + i11, 205, 3);
                        i13 = i14 + 1;
                    }
                    break;
                }
                break;
            case 3:
                RunnableC0008i.m117a(0);
                C0006g.m70a(RunnableC0008i.f293a[23]);
                C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 0, 1);
                int i18 = 32;
                int i19 = 0;
                while (true) {
                    int i20 = i19;
                    if (i20 >= f431r.length) {
                        C0011l.m183a(graphics, 0, 305, 225, 3);
                        if (f402i == 8) {
                            C0011l.m183a(graphics, 1, 15, 225, 3);
                        }
                    } else {
                        if (i20 != 7 || f409k || f412l || f368b) {
                            if (i20 == f402i) {
                                graphics.setColor(-12303292);
                                graphics.fillRect(0, i18 - 4, 320, C0006g.f171b[0] + C0006g.f171b[1] + 8);
                                C0006g.m70a(RunnableC0008i.f293a[f431r[i20]]);
                                C0006g.m79a(graphics, 6, i18, 1, 0, 0);
                                C0006g.m70a(RunnableC0008i.f293a[f360a[i20][f384d[f402i]]]);
                                C0006g.m79a(graphics, 160, i18 + C0006g.f171b[1], 0, 0, 1);
                                if (f384d[f402i] - 1 >= 0) {
                                    C0011l.m183a(graphics, 2, 6, C0006g.f171b[1] + i18 + (C0006g.f171b[0] / 2), 3);
                                }
                                if (f384d[f402i] + 1 < f360a[i20].length) {
                                    C0011l.m183a(graphics, 3, 314, C0006g.f171b[1] + i18 + (C0006g.f171b[0] / 2), 3);
                                }
                                i18 += C0006g.f171b[0] + C0006g.f171b[1] + 4;
                            } else {
                                C0006g.m70a(RunnableC0008i.f293a[f431r[i20]]);
                                C0006g.m79a(graphics, 6, i18, 0, 0, 0);
                                i18 += C0006g.f171b[0] + 4;
                            }
                        }
                        i19 = i20 + 1;
                    }
                    break;
                }
                break;
            case 4:
                RunnableC0008i.m117a(-30);
                float f5 = f363b;
                int i21 = 0;
                while (i21 < 4) {
                    int iSin3 = (int) (Math.sin(Math.toRadians(f5)) * 164.0d);
                    int iCos3 = (int) (Math.cos(Math.toRadians(f5)) * 55.0d);
                    float f6 = f5 + 90.0f;
                    if (iCos3 <= 0) {
                        graphics.drawRegion(f366b, i21 * 64, 92, 64, 64, 0, iSin3 + 160, iCos3 + 120, 3);
                    }
                    i21++;
                    f5 = f6;
                }
                if (C0002c.m30a(0)) {
                    RunnableC0008i.m115a((byte) 98);
                }
                C0002c.m27a(graphics, C0004e.f129a, 0, 0, 30, 320, 210);
                C0002c.m25a(60.0f, 320, 210, 1.0f, 100.0f);
                RunnableC0008i.f288a.m151a(RunnableC0008i.f298b);
                RunnableC0008i.f288a.m147a(180.0f, 0.0f, 0.0f, 1.0f);
                RunnableC0008i.f288a.m146a(0.0f, 1.2f, 0.0f);
                C0002c.m31a(C0000a.f9a, RunnableC0008i.f288a);
                RunnableC0008i.f288a.m146a(0.0f, C0000a.f19a[C0000a.f5a][0], C0000a.f19a[C0000a.f5a][1]);
                RunnableC0008i.f288a.m154b(C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f288a);
                RunnableC0008i.f288a.m146a(0.0f, 0.0f, C0000a.f19a[C0000a.f5a][2] - C0000a.f19a[C0000a.f5a][1]);
                RunnableC0008i.f288a.m154b(C0000a.f19a[C0000a.f5a][4] / C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f288a);
                RunnableC0008i.f298b.m146a(0.0f, -0.54f, 0.0f);
                C0002c.m31a(f349a, RunnableC0008i.f298b);
                RunnableC0008i.f298b.m146a(0.0f, 0.54f, 0.0f);
                C0002c.m31a(C0000a.f9a, RunnableC0008i.f298b);
                RunnableC0008i.f298b.m146a(0.0f, C0000a.f19a[C0000a.f5a][0], C0000a.f19a[C0000a.f5a][1]);
                RunnableC0008i.f298b.m154b(C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f298b);
                RunnableC0008i.f298b.m146a(0.0f, 0.0f, C0000a.f19a[C0000a.f5a][2] - C0000a.f19a[C0000a.f5a][1]);
                RunnableC0008i.f298b.m154b(C0000a.f19a[C0000a.f5a][4] / C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f298b);
                C0002c.m32b();
                float f7 = f363b;
                int i22 = 0;
                while (i22 < 4) {
                    int iSin4 = (int) (Math.sin(Math.toRadians(f7)) * 164.0d);
                    int iCos4 = (int) (Math.cos(Math.toRadians(f7)) * 55.0d);
                    float f8 = f7 + 90.0f;
                    if (iCos4 > 0) {
                        C0006g.m70a(RunnableC0008i.f293a[f436u[i22]]);
                        if (i22 == 1 || i22 == 2) {
                            C0006g.m88b(" (");
                            C0006g.m87b((int) f422o[i22 - 1]);
                            C0006g.m86b('/');
                            C0006g.m87b((int) f419n[i22 - 1]);
                            C0006g.m86b(')');
                            if (f425p[i22 - 1] > 0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                        } else {
                            i = 0;
                        }
                        graphics.drawRegion(f366b, i22 * 92, 0, 92, 92, 0, iSin4 + 160, iCos4 + 120, 3);
                        C0006g.m79a(graphics, (iSin4 + 160) - (C0006g.m65a(1) / 2), (iCos4 + 166) - (C0006g.f171b[1] / 2), 1, i, 0);
                    }
                    i22++;
                    f7 = f8;
                }
                if (f382d != null) {
                    graphics.drawImage(f382d, 6, 6, 0);
                }
                C0006g.m68a(f354a * 1000);
                C0006g.m88b(" $");
                C0006g.m79a(graphics, 314, 8, 1, 1, 2);
                C0006g.m70a(f378c);
                C0006g.m79a(graphics, 71, 8, 1, 1, 0);
                int i23 = C0006g.f171b[1] + 3 + 8;
                C0006g.m69a(C0000a.f17a[f390e[0]]);
                C0006g.m88b(" (");
                C0006g.m86b(C0000a.f15a[C0000a.f34c[f390e[0]]]);
                C0006g.m86b(')');
                C0006g.m79a(graphics, 71, i23, 1, 0, 0);
                int i24 = i23 + C0006g.f171b[1] + 3;
                int i25 = ((f422o[0] + f422o[1]) * 100) / (f419n[0] + f419n[1]);
                C0006g.m70a(RunnableC0008i.f293a[42]);
                C0006g.m86b(' ');
                C0006g.m87b(i25);
                C0006g.m86b('%');
                C0006g.m79a(graphics, 71, i24, 1, 0, 0);
                C0011l.m183a(graphics, 1, 15, 225, 3);
                C0011l.m183a(graphics, 0, 305, 225, 3);
                break;
            case 6:
                boolean z = C0014o.f569a == 2139062141 && C0000a.f22b <= 0 && C0001b.f56a <= 0 && C0002c.f68a <= 0 && C0007h.f211a <= 0;
                RunnableC0008i.m117a(0);
                C0006g.m70a(RunnableC0008i.f293a[24]);
                C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 0, 1);
                int i26 = 32;
                int i27 = 0;
                while (true) {
                    int i28 = i27;
                    if (i28 >= f433s.length - (z ? 0 : 1)) {
                        C0011l.m183a(graphics, 0, 305, 225, 3);
                        C0011l.m183a(graphics, 1, 15, 225, 3);
                        if (RunnableC0008i.f311d) {
                            graphics.setColor(-16777216);
                            graphics.fillRect(0, 0, 320, 240);
                            C0006g.m69a("tm:");
                            C0006g.m87b(C0011l.f454a);
                            C0006g.m79a(graphics, 5, 5, 0, 0, 0);
                            int i29 = C0006g.f171b[0] + 5;
                            C0006g.m69a("td:");
                            C0006g.m87b(C0000a.f7a);
                            C0006g.m79a(graphics, 5, i29, 0, 0, 0);
                            int i30 = i29 + C0006g.f171b[0];
                            C0006g.m69a("t0:");
                            C0006g.m87b(C0000a.f22b);
                            C0006g.m79a(graphics, 5, i30, 0, 0, 0);
                            int i31 = i30 + C0006g.f171b[0];
                            C0006g.m69a("t1:");
                            C0006g.m87b(C0001b.f56a);
                            C0006g.m79a(graphics, 5, i31, 0, 0, 0);
                            int i32 = i31 + C0006g.f171b[0];
                            C0006g.m69a("t2:");
                            C0006g.m87b(C0002c.f68a);
                            C0006g.m79a(graphics, 5, i32, 0, 0, 0);
                            int i33 = i32 + C0006g.f171b[0];
                            C0006g.m69a("t3:");
                            C0006g.m87b(C0007h.f211a);
                            C0006g.m79a(graphics, 5, i33, 0, 0, 0);
                            int i34 = i33 + C0006g.f171b[0];
                            C0006g.m69a("dt:");
                            C0006g.m87b(C0014o.f569a / 1000);
                            C0006g.m79a(graphics, 5, i34, 0, 0, 0);
                            int i35 = i34 + C0006g.f171b[0];
                            C0006g.m69a("od:");
                            C0006g.m87b((int) f384d[16]);
                            C0006g.m79a(graphics, 5, i35, 0, 0, 0);
                        }
                    } else {
                        if (i28 == f402i) {
                            graphics.setColor(-12303292);
                            graphics.fillRect(0, i26 - 6, 320, C0006g.f171b[0] + 13);
                            C0006g.m70a(RunnableC0008i.f293a[f433s[i28]]);
                            C0006g.m79a(graphics, 6, i26, 1, 0, 0);
                        } else {
                            C0006g.m70a(RunnableC0008i.f293a[f433s[i28]]);
                            C0006g.m79a(graphics, 6, i26, 0, 0, 0);
                        }
                        i26 += C0006g.f171b[0] + 6;
                        i27 = i28 + 1;
                    }
                    break;
                }
                break;
            case 7:
                RunnableC0008i.m117a(0);
                C0006g.m70a(RunnableC0008i.f293a[f371c + 39]);
                C0006g.m79a(graphics, 6, (30 - C0006g.f171b[1]) / 2, 1, 1, 0);
                C0006g.m70a(RunnableC0008i.f293a[92]);
                C0006g.m86b(' ');
                C0006g.m87b(C0000a.f34c[f390e[0]] + 1);
                C0006g.m88b(" / ");
                C0006g.m87b(3);
                C0006g.m79a(graphics, 314, (30 - C0006g.f171b[1]) / 2, 1, 0, 2);
                f424p = false;
                while (f381d + (f410k[f371c] * (C0006g.f171b[0] + 6)) > 201) {
                    f381d -= C0006g.f171b[0] + 6;
                }
                while (f381d + (f410k[f371c] * (C0006g.f171b[0] + 6)) < 30) {
                    f381d += C0006g.f171b[0] + 6;
                }
                int i36 = f381d;
                int length = (C0006g.f171b[0] + 6) * (f361a[f371c].length / 5);
                int i37 = (30625 / length) - 2;
                graphics.setColor(-12303292);
                graphics.fillRect(317, 33, 2, 169);
                graphics.setColor(-1);
                int i38 = 32 - (((f381d - 30) * 175) / length);
                if (i37 < 1) {
                    i37 = 1;
                }
                graphics.fillRect(317, i38, 2, i37);
                graphics.setColor(-4473925);
                graphics.drawLine(317, 32, 318, 32);
                graphics.drawLine(316, 33, 319, 33);
                graphics.drawLine(316, 202, 319, 202);
                graphics.drawLine(317, 203, 318, 203);
                int i39 = 0;
                while (true) {
                    int i40 = i39;
                    int i41 = i36;
                    if (i40 >= f361a[f371c].length / 5) {
                        if (f424p) {
                            C0011l.m183a(graphics, 1, 15, 225, 3);
                        }
                        C0011l.m183a(graphics, 0, 305, 225, 3);
                    } else {
                        if (i41 >= 30 && i41 <= 201) {
                            if (i40 == f410k[f371c]) {
                                graphics.setColor(-12303292);
                                graphics.fillRect(0, i41, 316, C0006g.f171b[0] + 3 + 3);
                                short sM177a = C0011l.m177a((int) f361a[f371c][(i40 * 5) + 2][1], (int) f361a[f371c][(i40 * 5) + 2][2]);
                                byte b = f361a[f371c][(i40 * 5) + 2][3];
                                byte b2 = f361a[f371c][(i40 * 5) + 2][4];
                                boolean z2 = (f395f[(f371c == 0 ? i40 : (f361a[0].length / 5) + i40) / 8] & C0011l.m199b((f371c == 0 ? i40 : (f361a[0].length / 5) + i40) % 8)) != 0;
                                f427q = z2;
                                if (z2) {
                                    C0011l.m183a(graphics, 8, 13, ((C0006g.f171b[0] + 6) / 2) + i41, 3);
                                } else if (f361a[f371c][(i40 * 5) + 2][40] - f390e[12] > 1 || sM177a > f354a || b > f379d || b2 > C0000a.f34c[f390e[0]]) {
                                    C0011l.m183a(graphics, 7, 13, ((C0006g.f171b[0] + 6) / 2) + i41, 3);
                                } else {
                                    C0011l.m183a(graphics, 6, 13, ((C0006g.f171b[0] + 6) / 2) + i41, 3);
                                }
                                if (f361a[f371c][(i40 * 5) + 2][40] - f390e[12] > 1 || sM177a > f354a || b > f379d || b2 > C0000a.f34c[f390e[0]]) {
                                    f424p = false;
                                } else {
                                    f424p = true;
                                }
                                if (f427q) {
                                    f424p = true;
                                }
                                C0006g.m89b(f361a[f371c][i40 * 5]);
                                int iM65a4 = C0006g.m65a(0);
                                boolean z3 = false;
                                if (!f424p) {
                                    if (b2 > C0000a.f34c[f390e[0]]) {
                                        C0006g.m70a(RunnableC0008i.f293a[21]);
                                        C0006g.m86b(' ');
                                        C0006g.m86b(C0000a.f15a[b2]);
                                        if (iM65a4 + 26 > 307 - C0006g.m65a(1)) {
                                            C0006g.m67a('(');
                                            C0006g.m86b(C0000a.f15a[b2]);
                                            C0006g.m86b(')');
                                        }
                                        C0006g.m79a(graphics, 314, i41 + 3, 1, 0, 2);
                                        z3 = true;
                                    } else if (sM177a > 0 && sM177a > f354a) {
                                        C0006g.m68a(sM177a * 1000);
                                        C0006g.m86b('$');
                                        C0006g.m79a(graphics, 314, i41 + 3, 1, 0, 2);
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    int iM65a5 = 314 - C0006g.m65a(1);
                                    C0006g.m89b(f361a[f371c][i40 * 5]);
                                    boolean z4 = false;
                                    while (iM65a4 + 26 > iM65a5) {
                                        C0006g.m98f(-1);
                                        iM65a4 = C0006g.m65a(0);
                                        z4 = true;
                                    }
                                    if (z4) {
                                        C0006g.m98f(-2);
                                        C0006g.m88b("..");
                                        C0006g.m96d(3);
                                    } else {
                                        C0006g.m97e(1000);
                                    }
                                    C0006g.m79a(graphics, 26, i41 + 3, 0, f424p ? 0 : 1, 0);
                                } else {
                                    boolean z5 = false;
                                    int iM65a6 = iM65a4;
                                    while (iM65a6 + 26 > 316) {
                                        C0006g.m98f(-1);
                                        iM65a6 = C0006g.m65a(0);
                                        z5 = true;
                                    }
                                    if (z5) {
                                        C0006g.m98f(-2);
                                        C0006g.m88b("..");
                                        C0006g.m96d(3);
                                    } else {
                                        C0006g.m97e(1000);
                                    }
                                    C0006g.m79a(graphics, 26, i41 + 3, 0, f424p ? 0 : 1, 0);
                                }
                            } else {
                                short sM177a2 = C0011l.m177a((int) f361a[f371c][(i40 * 5) + 2][1], (int) f361a[f371c][(i40 * 5) + 2][2]);
                                byte b3 = f361a[f371c][(i40 * 5) + 2][3];
                                byte b4 = f361a[f371c][(i40 * 5) + 2][4];
                                boolean z6 = (f395f[(f371c == 0 ? i40 : (f361a[0].length / 5) + i40) / 8] & C0011l.m199b((f371c == 0 ? i40 : (f361a[0].length / 5) + i40) % 8)) != 0;
                                if (z6) {
                                    C0011l.m183a(graphics, 8, 13, ((C0006g.f171b[0] + 6) / 2) + i41, 3);
                                } else if (f361a[f371c][(i40 * 5) + 2][40] - f390e[12] > 1 || sM177a2 > f354a || b3 > f379d || b4 > C0000a.f34c[f390e[0]]) {
                                    C0011l.m183a(graphics, 7, 13, ((C0006g.f171b[0] + 6) / 2) + i41, 3);
                                } else {
                                    C0011l.m183a(graphics, 6, 13, ((C0006g.f171b[0] + 6) / 2) + i41, 3);
                                }
                                C0006g.m70a(f361a[f371c][i40 * 5]);
                                boolean z7 = false;
                                int iM65a7 = C0006g.m65a(0);
                                while (iM65a7 + 26 > 316) {
                                    C0006g.m98f(-1);
                                    iM65a7 = C0006g.m65a(0);
                                    z7 = true;
                                }
                                if (z7) {
                                    C0006g.m98f(-2);
                                    C0006g.m88b("..");
                                }
                                C0006g.m79a(graphics, 26, i41 + 3, 0, (z6 || (f361a[f371c][(i40 * 5) + 2][40] - f390e[12] <= 1 && sM177a2 <= f354a && b3 <= f379d && b4 <= C0000a.f34c[f390e[0]])) ? 0 : 1, 0);
                            }
                        }
                        i36 = i41 + C0006g.f171b[0] + 6;
                        i39 = i40 + 1;
                    }
                    break;
                }
                break;
            case 8:
                RunnableC0008i.m117a(0);
                C0006g.m89b(f361a[f371c][f410k[f371c] * 5]);
                if (C0006g.m65a(1) > 320) {
                    C0006g.m79a(graphics, 0, (30 - C0006g.f171b[1]) / 2, 1, 0, 0);
                    C0006g.m96d(3);
                } else {
                    C0006g.m97e(1000);
                    C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 0, 1);
                }
                if (f347a < 0.3f && f418n) {
                    graphics.drawImage(f388e, (int) ((f347a / 0.3f) * 128.0f), 120, 3);
                    graphics.drawImage(f382d, (int) (320.0f - ((f347a / 0.3f) * 128.0f)), 120, 3);
                } else if (f347a < 0.7f) {
                    graphics.drawImage(f388e, 128, 120, 3);
                    graphics.drawImage(f382d, 192, 120, 3);
                } else {
                    float f9 = (f347a - 0.7f) / 0.3f;
                    graphics.drawImage(f388e, (int) (102 + ((-96) * f9)), (int) (88 + ((-52) * f9)), 20);
                    graphics.drawImage(f382d, (int) (192 + (154 * f9)), 120, 3);
                    C0006g.m80a(graphics, 3, (int) (240.0f + ((-136.0f) * f9)), false, true, 0);
                    int i42 = (int) ((-32.0f) + (69.0f * f9));
                    C0006g.m70a(RunnableC0008i.f293a[59]);
                    C0006g.m88b(": ");
                    C0006g.m87b((int) f361a[f371c][(f410k[f371c] * 5) + 2][26]);
                    C0006g.m79a(graphics, 71, i42, 1, 0, 0);
                    int i43 = i42 + C0006g.f171b[1] + 3;
                    if (f376c > 0) {
                        C0006g.m70a(RunnableC0008i.f293a[44]);
                        C0006g.m88b(": ");
                        C0006g.m87b(f376c * 1000);
                        C0006g.m86b('$');
                        C0006g.m79a(graphics, 71, i43, 1, 0, 0);
                        i43 += C0006g.f171b[1] + 3;
                    }
                    if (f367b > 0) {
                        C0006g.m70a(RunnableC0008i.f293a[46]);
                        C0006g.m88b(": ");
                        C0006g.m87b(f367b * 1000);
                        C0006g.m86b('$');
                        C0006g.m79a(graphics, 71, i43, 1, 1, 0);
                        i43 += C0006g.f171b[1] + 3;
                    }
                    if (f421o) {
                        C0006g.m70a(RunnableC0008i.f293a[47]);
                        C0006g.m79a(graphics, 71, i43, 1, 1, 0);
                    }
                    if (f347a == 1.0f) {
                        C0006g.m70a(RunnableC0008i.f293a[114]);
                        C0006g.m79a(graphics, 5, 235 - C0006g.f171b[0], 1, 1, 0);
                        C0006g.m70a(RunnableC0008i.f293a[115]);
                        C0006g.m79a(graphics, 315, 235 - C0006g.f171b[0], 1, 0, 2);
                    }
                }
                break;
            case 9:
                RunnableC0008i.m117a(0);
                boolean z8 = false;
                if (!C0000a.f25b && !f400h) {
                    if (f397g && (f367b - f376c > 0 || f361a[f371c][(f410k[f371c] * 5) + 2][32] > 0)) {
                        C0006g.m70a(RunnableC0008i.f293a[46]);
                        C0006g.m86b(' ');
                        if (f367b - f376c > 0) {
                            C0006g.m87b((f367b - f376c) * 1000);
                            C0006g.m88b("$ ");
                        }
                        if (f361a[f371c][(f410k[f371c] * 5) + 2][32] > 0) {
                            C0006g.m92c(RunnableC0008i.f293a[69]);
                        }
                        C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 1, 1);
                        z8 = true;
                    } else if (!f397g && f376c > 0) {
                        C0006g.m70a(RunnableC0008i.f293a[80]);
                        C0006g.m88b(": ");
                        C0006g.m87b(f376c * 1000);
                        C0006g.m86b('$');
                        C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 1, 1);
                        z8 = true;
                    }
                }
                if (!z8 && !f400h) {
                    if (f397g) {
                        C0006g.m70a(RunnableC0008i.f293a[48]);
                        C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 1, 1);
                    } else {
                        C0006g.m70a(RunnableC0008i.f293a[49]);
                        C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 0, 1);
                    }
                }
                if (C0000a.f25b || f388e == null || !C0006g.m81a()) {
                    graphics.drawImage(f382d, 6, 36, 20);
                } else {
                    graphics.drawImage(f388e, 6, 36, 20);
                }
                boolean z9 = f357a[0] <= f370b[0] || f370b[0] == 255;
                C0006g.m70a(RunnableC0008i.f293a[50]);
                C0006g.m79a(graphics, 91, 36, 0, z9 ? 0 : 1, 0);
                C0011l.m183a(graphics, z9 ? 9 : 10, 74, 45, 3);
                int i44 = C0006g.m65a(0) + 91 > 221 ? C0006g.f171b[0] + 36 : 36;
                C0006g.m68a(f357a[0]);
                C0006g.m79a(graphics, 221, i44, 0, z9 ? 0 : 1, 0);
                if (!z9) {
                    i44 += C0006g.f171b[0];
                    C0006g.m68a(f370b[0]);
                    C0006g.m79a(graphics, 221, i44, 0, 0, 0);
                }
                int i45 = i44 + C0006g.f171b[0];
                boolean z10 = f357a[1] >= f370b[1] || f370b[1] == 255;
                C0006g.m70a(RunnableC0008i.f293a[51]);
                C0006g.m79a(graphics, 91, i45, 0, z10 ? 0 : 1, 0);
                C0011l.m183a(graphics, z10 ? 9 : 10, 74, i45 + 9, 3);
                if (C0006g.m65a(0) + 91 > 221) {
                    i45 += C0006g.f171b[0];
                }
                C0006g.m68a(f357a[1]);
                C0006g.m86b(' ');
                C0006g.m92c(RunnableC0008i.f293a[124]);
                C0006g.m79a(graphics, 221, i45, 0, z10 ? 0 : 1, 0);
                if (!z10) {
                    i45 += C0006g.f171b[0];
                    C0006g.m68a(f370b[1]);
                    C0006g.m86b(' ');
                    C0006g.m92c(RunnableC0008i.f293a[124]);
                    C0006g.m79a(graphics, 221, i45, 0, 0, 0);
                }
                int i46 = i45 + C0006g.f171b[0];
                boolean z11 = f357a[2] <= f370b[2] || f370b[2] == 255;
                C0006g.m70a(RunnableC0008i.f293a[52]);
                C0006g.m79a(graphics, 91, i46, 0, z11 ? 0 : 1, 0);
                C0011l.m183a(graphics, z11 ? 9 : 10, 74, i46 + 9, 3);
                if (C0006g.m65a(0) + 91 > 221) {
                    i46 += C0006g.f171b[0];
                }
                C0006g.m66a();
                C0011l.m179a(f357a[2] * 1000);
                C0006g.m79a(graphics, 221, i46, 0, z11 ? 0 : 1, 0);
                if (!z11) {
                    i46 += C0006g.f171b[0];
                    C0006g.m66a();
                    C0011l.m179a(f370b[2] * 1000);
                    C0006g.m79a(graphics, 221, i46, 0, 0, 0);
                }
                int i47 = i46 + C0006g.f171b[0];
                boolean z12 = (f357a[3] <= f370b[3] || f370b[3] == 255) && (f357a[4] >= f370b[4] || f370b[4] == 255);
                C0006g.m70a(RunnableC0008i.f293a[53]);
                C0006g.m79a(graphics, 91, i47, 0, z12 ? 0 : 1, 0);
                C0011l.m183a(graphics, z12 ? 9 : 10, 74, i47 + 9, 3);
                if (C0006g.m65a(0) + 91 > 221) {
                    i47 += C0006g.f171b[0];
                }
                C0006g.m68a(f357a[3]);
                C0006g.m86b('/');
                C0006g.m87b(f357a[4]);
                C0006g.m79a(graphics, 221, i47, 0, z12 ? 0 : 1, 0);
                if (!z12) {
                    i47 += C0006g.f171b[0];
                    C0006g.m68a(f370b[3] == 255 ? 0 : f370b[3]);
                    C0006g.m86b('/');
                    C0006g.m87b(f370b[4] == 255 ? 0 : f370b[4]);
                    C0006g.m79a(graphics, 221, i47, 0, 0, 0);
                }
                int i48 = i47 + C0006g.f171b[0];
                boolean z13 = f357a[5] >= f370b[5] || f370b[5] == 255;
                C0006g.m70a(RunnableC0008i.f293a[85]);
                C0006g.m79a(graphics, 91, i48, 0, z13 ? 0 : 1, 0);
                C0011l.m183a(graphics, z13 ? 9 : 10, 74, i48 + 9, 3);
                if (C0006g.m65a(0) + 91 > 221) {
                    i48 += C0006g.f171b[0];
                }
                C0006g.m68a(f357a[5]);
                C0006g.m79a(graphics, 221, i48, 0, z13 ? 0 : 1, 0);
                if (!z13) {
                    i48 += C0006g.f171b[0];
                    C0006g.m68a(f370b[5]);
                    C0006g.m79a(graphics, 221, i48, 0, 0, 0);
                }
                int i49 = i48 + C0006g.f171b[0] + 6;
                if (!C0000a.f25b && C0006g.m81a()) {
                    C0006g.m91b((240 - i49) - 32);
                    C0006g.m80a(graphics, 0, i49, false, true, 0);
                }
                C0011l.m183a(graphics, 1, 160, 225, 3);
                break;
            case 10:
                RunnableC0008i.m117a(0);
                C0006g.m70a(RunnableC0008i.f293a[f433s[f402i]]);
                C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 0, 1);
                C0006g.m80a(graphics, 0, 30, false, f430r, 0);
                C0011l.m183a(graphics, 0, 305, 225, 3);
                break;
            case 11:
                RunnableC0008i.m117a(0);
                C0006g.m70a(RunnableC0008i.f293a[102]);
                C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 0, 1);
                graphics.setColor(-12303292);
                C0006g.m70a(RunnableC0008i.f293a[45]);
                C0006g.m79a(graphics, 6, 32, 1, 1, 0);
                int i50 = C0006g.f171b[1] + 6 + 32;
                if (f402i == 0) {
                    graphics.fillRect(0, i50 - 6, 320, C0006g.f171b[0] + 13);
                }
                C0006g.m70a(RunnableC0008i.f293a[109]);
                C0006g.m79a(graphics, 6, i50, f402i == 0 ? 1 : 0, 0, 0);
                int i51 = i50 + C0006g.f171b[0] + 6;
                if (f402i == 1) {
                    graphics.fillRect(0, i51 - 6, 320, C0006g.f171b[0] + 13);
                }
                C0006g.m70a(RunnableC0008i.f293a[110]);
                C0006g.m79a(graphics, 6, i51, f402i == 1 ? 1 : 0, 0, 0);
                int i52 = i51 + C0006g.f171b[0] + 6;
                C0006g.m70a(RunnableC0008i.f293a[111]);
                C0006g.m79a(graphics, 6, i52, 1, 1, 0);
                int i53 = i52 + C0006g.f171b[1] + 6;
                if (f402i == 2) {
                    graphics.fillRect(0, i53 - 6, 320, C0006g.f171b[0] + 13);
                }
                C0006g.m70a(RunnableC0008i.f293a[112]);
                C0006g.m79a(graphics, 6, i53, f402i == 2 ? 1 : 0, 0, 0);
                int i54 = i53 + C0006g.f171b[0] + 6;
                if (f402i > 2 && f402i < 8) {
                    graphics.fillRect(0, i54 - 6, 320, C0006g.f171b[0] + 13);
                }
                C0006g.m70a(RunnableC0008i.f293a[109]);
                C0006g.m88b(": ");
                for (int i55 = 1; i55 < 6; i55++) {
                    if (f402i == i55 + 2) {
                        C0006g.m86b((char) 3);
                    }
                    C0006g.m87b(i55);
                    if (f402i == i55 + 2) {
                        C0006g.m86b((char) 5);
                    }
                    if (i55 < 5) {
                        C0006g.m88b(", ");
                    }
                }
                C0006g.m79a(graphics, 6, i54, 0, 0, 0);
                int i56 = i54 + C0006g.f171b[0] + 6;
                if (f402i > 7 && f402i < 13) {
                    graphics.fillRect(0, i56 - 6, 320, C0006g.f171b[0] + 13);
                }
                C0006g.m70a(RunnableC0008i.f293a[110]);
                C0006g.m88b(": ");
                for (int i57 = 1; i57 < 6; i57++) {
                    if (f402i == i57 + 7) {
                        C0006g.m86b((char) 3);
                    }
                    C0006g.m87b(i57);
                    if (f402i == i57 + 7) {
                        C0006g.m86b((char) 5);
                    }
                    if (i57 < 5) {
                        C0006g.m88b(", ");
                    }
                }
                C0006g.m79a(graphics, 6, i56, 0, 0, 0);
                int i58 = i56 + C0006g.f171b[0] + 6;
                if (f406j) {
                    if (f402i == 13) {
                        graphics.fillRect(0, i58 - 6, 320, C0006g.f171b[0] + 13);
                    }
                    C0006g.m70a(RunnableC0008i.f293a[136]);
                    C0006g.m79a(graphics, 6, i58, f402i == 13 ? 1 : 0, 0, 0);
                }
                C0011l.m183a(graphics, 0, 305, 225, 3);
                C0006g.m70a(RunnableC0008i.f293a[113]);
                C0006g.m79a(graphics, 5, 235 - C0006g.f171b[0], 1, 0, 0);
                break;
            case 12:
                if (f362b == 0 || f362b == 3) {
                    graphics.setColor(-16777216);
                    graphics.fillRect(0, 0, 320, 240);
                    if (!C0006g.m81a()) {
                        graphics.drawImage(f359a[0], 160, 120, 3);
                    } else if (f362b == 3) {
                        int height3 = ((240 - f359a[0].getHeight()) - C0006g.m84b()) / 2;
                        graphics.drawImage(f359a[0], 160, height3, 17);
                        C0006g.m80a(graphics, 0, f359a[0].getHeight() + height3, false, true, 0);
                    } else {
                        graphics.drawImage(f359a[0], 160, 0, 17);
                        C0006g.m80a(graphics, 0, f359a[0].getHeight(), false, true, 0);
                    }
                } else if (f362b == 1) {
                    RunnableC0008i.m117a(-30);
                    int i59 = -C0006g.m64a();
                    byte[][] bArrM83a = C0006g.m83a();
                    for (int i60 = 0; i60 < bArrM83a.length; i60++) {
                        int i61 = (bArrM83a[i60][0] * C0006g.f171b[0]) + i59 + 6;
                        if (i61 > (-f382d.getHeight()) && i61 < 240) {
                            if (bArrM83a[i60][1] == 0) {
                                graphics.drawImage(f382d, 0, i61, 0);
                            } else {
                                graphics.drawImage(f359a[bArrM83a[i60][1] - 1], 0, i61, 0);
                            }
                        }
                    }
                    C0006g.m80a(graphics, f359a[0].getWidth(), 0, false, true, 0);
                    C0011l.m183a(graphics, 1, 305, 225, 3);
                } else {
                    RunnableC0008i.m117a(-30);
                    C0006g.m80a(graphics, 0, 0, false, true, 0);
                }
                break;
            case 13:
                RunnableC0008i.m117a(0);
                if (f402i == 0) {
                    C0006g.m70a(RunnableC0008i.f293a[109]);
                } else if (f402i == 1) {
                    C0006g.m70a(RunnableC0008i.f293a[110]);
                } else {
                    C0006g.m70a(RunnableC0008i.f293a[102]);
                }
                C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 0, 1);
                C0006g.m80a(graphics, 0, 30, false, false, 0);
                C0011l.m183a(graphics, 0, 305, 225, 3);
                C0006g.m70a(RunnableC0008i.f293a[113]);
                C0006g.m79a(graphics, 5, 235 - C0006g.f171b[0], 1, 0, 0);
                break;
            case 14:
                RunnableC0008i.m117a(0);
                C0006g.m70a(RunnableC0008i.f293a[126]);
                C0006g.m79a(graphics, 160, (30 - C0006g.f171b[1]) / 2, 1, 0, 1);
                int i62 = 32;
                int i63 = 0;
                while (true) {
                    int i64 = i63;
                    if (i64 >= f435t.length - ((f384d[7] == 0 && f368b) ? 0 : 1)) {
                        C0011l.m183a(graphics, 0, 305, 225, 3);
                        C0011l.m183a(graphics, 1, 15, 225, 3);
                    } else {
                        if ((f403i || i64 != 1) && (f377c || i64 != 0)) {
                            if (i64 == f402i) {
                                graphics.setColor(-12303292);
                                graphics.fillRect(0, i62 - 6, 320, C0006g.f171b[0] + 13);
                                C0006g.m94c(f435t[i64]);
                                C0006g.m79a(graphics, 6, i62, 1, 0, 0);
                            } else {
                                C0006g.m94c(f435t[i64]);
                                C0006g.m79a(graphics, 6, i62, 0, 0, 0);
                            }
                            i62 += C0006g.f171b[0] + 6;
                        }
                        i63 = i64 + 1;
                    }
                    break;
                }
                break;
        }
        if (C0002c.m30a(3)) {
            RunnableC0008i.m115a((byte) 98);
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m139a() {
        boolean z = C0001b.f56a > 0 && C0001b.f56a < 500;
        if (z) {
            RunnableC0008i.m115a((byte) 75);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0369  */
    /* JADX WARN: Code duplicated, block: B:111:0x0381  */
    /* JADX WARN: Code duplicated, block: B:114:0x038d  */
    /* JADX WARN: Code duplicated, block: B:117:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0406  */
    /* JADX WARN: Code duplicated, block: B:171:0x054c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0560  */
    /* JADX WARN: Code duplicated, block: B:187:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:201:0x0602  */
    /* JADX WARN: Code duplicated, block: B:215:0x0643  */
    /* JADX WARN: Code duplicated, block: B:216:0x0646  */
    /* JADX WARN: Code duplicated, block: B:217:0x0648  */
    /* JADX WARN: Code duplicated, block: B:220:0x064f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0652  */
    /* JADX WARN: Code duplicated, block: B:28:0x0123  */
    /* JADX WARN: Code duplicated, block: B:31:0x015a  */
    /* JADX WARN: Code duplicated, block: B:343:0x061c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x05cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0167  */
    /* JADX WARN: Code duplicated, block: B:366:0x057b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0176  */
    /* JADX WARN: Code duplicated, block: B:40:0x018a  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ae A[LOOP:1: B:44:0x01a9->B:46:0x01ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0209  */
    /* JADX WARN: Code duplicated, block: B:66:0x021f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0253  */
    /* JADX WARN: Code duplicated, block: B:72:0x0273  */
    /* JADX WARN: Code duplicated, block: B:80:0x029d A[LOOP:2: B:78:0x029a->B:80:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x02bc  */
    /* JADX INFO: renamed from: b */
    static void m140b() {
        byte[] bArrM206b;
        byte[] bArrM206b2;
        byte[] bArrM206b3;
        byte b;
        byte[] bArrM206b4;
        byte[] bArrM206b5;
        byte[] bArrM206b6;
        byte[] bArrM206b7;
        byte[] bArrM206b8;
        byte[] bArrM206b9;
        String strM113a;
        String strM113a2;
        String strM113a3;
        boolean z;
        String strM113a4;
        String strM113a5;
        boolean z2;
        String strM113a6;
        boolean z3;
        String strM113a7;
        String strM113a8;
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        if (f411l != 0) {
            if (f411l == 2) {
                C0011l.f462b = new Random();
            } else if (f411l == 3) {
                if (!C0000a.f25b) {
                    if (f361a == null) {
                        f361a = C0011l.m197a();
                    }
                    if (f357a != null) {
                        C0011l.m203b();
                        byte[] bArr = f401h;
                        bArr[2] = (byte) (bArr[2] + 1);
                        if (f376c > 0) {
                            f354a = (short) (f354a - f376c);
                        }
                        if (f397g || f400h) {
                            byte[] bArr2 = f401h;
                            bArr2[1] = (byte) (bArr2[1] + 1);
                            short sM177a = C0011l.m177a((int) f361a[f371c][(f410k[f371c] * 5) + 2][33], (int) f361a[f371c][(f410k[f371c] * 5) + 2][34]);
                            byte b2 = (byte) (sM177a / 1000);
                            byte b3 = (byte) ((sM177a % 1000) / 100);
                            byte b4 = (byte) ((sM177a % 100) / 10);
                            byte b5 = (byte) (sM177a % 10);
                            for (int i5 = 0; i5 < b2; i5++) {
                                f348a |= 1 << i5;
                            }
                            for (int i6 = 0; i6 < b3; i6++) {
                                f348a |= 1 << (i6 + 5);
                            }
                            for (int i7 = 0; i7 < b4; i7++) {
                                f348a |= 1 << (i7 + 10);
                            }
                            for (int i8 = 0; i8 < b5; i8++) {
                                f348a |= 1 << (i8 + 15);
                            }
                            C0011l.m185a(C0011l.m190a(f348a), 9);
                            if (f361a[f371c][(f410k[f371c] * 5) + 2][31] > f390e[10]) {
                                f390e[10] = f361a[f371c][(f410k[f371c] * 5) + 2][31];
                            }
                            if (f361a[f371c][(f410k[f371c] * 5) + 2][32] > f390e[11]) {
                                f390e[11] = f361a[f371c][(f410k[f371c] * 5) + 2][32];
                            }
                            if (f367b > 0) {
                                f354a = (short) (f354a + f367b);
                            }
                            if (f426q > 0 && !f421o && f426q > f379d) {
                                f379d = f426q;
                            }
                            if (!f421o) {
                                byte[] bArr3 = f390e;
                                bArr3[12] = (byte) (bArr3[12] + 1);
                                int iM199b = C0011l.m199b((f371c == 0 ? f410k[f371c] : (f361a[0].length / 5) + f410k[f371c]) % 8);
                                byte[] bArr4 = f395f;
                                int length = (f371c == 0 ? f410k[f371c] : (f361a[0].length / 5) + f410k[f371c]) / 8;
                                bArr4[length] = (byte) (iM199b | bArr4[length]);
                                C0011l.m185a(f395f, 4);
                            }
                            if (f361a[f371c][(f410k[f371c] * 5) + 2][39] != 0) {
                                f404i[0] = f361a[f371c][(f410k[f371c] * 5) + 2][39];
                            }
                        } else if (!f421o && f361a[f371c][(f410k[f371c] * 5) + 2][36] == 1) {
                            f415m = true;
                        }
                        C0011l.m185a(f401h, 7);
                        f398g[f371c] = f410k[f371c];
                        C0011l.m185a(f398g, 10);
                        C0011l.m185a(f404i, 8);
                        f390e[3] = C0011l.m161a(f354a, 0);
                        f390e[4] = C0011l.m161a(f354a, 1);
                        f390e[5] = f379d;
                        C0011l.m185a(f390e, 3);
                        C0011l.m211c();
                        if (f397g) {
                            if (f361a[f371c][(f410k[f371c] * 5) + 3] != null) {
                                f388e = null;
                                f388e = C0011l.m202b(new StringBuffer().append("/a").append((int) f361a[f371c][(f410k[f371c] * 5) + 2][37]).append(".cc").toString());
                                C0006g.m77a("result", 320, 91, 240, 91, f361a[f371c][(f410k[f371c] * 5) + 3], 0);
                            }
                        } else if (f361a[f371c][(f410k[f371c] * 5) + 4] != null) {
                            f388e = null;
                            f388e = C0011l.m202b(new StringBuffer().append("/a").append((int) f361a[f371c][(f410k[f371c] * 5) + 2][38]).append(".cc").toString());
                            C0006g.m77a("result", 320, 91, 240, 91, f361a[f371c][(f410k[f371c] * 5) + 4], 0);
                        }
                        f405j = (byte) 9;
                    } else {
                        f370b = null;
                        f405j = (byte) 4;
                    }
                    if (f366b == null) {
                        f366b = C0011l.m202b("/menu2.cc");
                    }
                } else if (f357a != null) {
                    f405j = (byte) 9;
                } else {
                    f405j = (byte) 1;
                }
            }
            C0002c.m33c();
            if (C0000a.f25b || C0013n.f493b != 0 || !C0000a.f13a) {
                C0013n.f493b = 0;
                C0000a.f5a = f390e[0];
                C0000a.m7a(true);
                C0000a.m8a(true, 0);
                C0011l.m204b(70);
            }
            C0013n.f493b = 0;
            if (f375c == null) {
                f375c = C0011l.m202b("/menu1.cc");
            }
            if (f393f == null) {
                f393f = C0011l.m202b("/hs.cc");
            }
            if (f411l == 3 && f382d == null) {
                f382d = C0011l.m202b("/av.cc");
            }
            if (f361a == null) {
                f361a = C0011l.m197a();
            }
            m142d();
            C0004e.f129a.m144a();
            C0004e.f129a.m146a(0.0f, 1.4f, 5.9f);
            C0004e.f129a.m147a(-22.0f, 1.0f, 0.0f, 0.0f);
            if (f411l == 2 && f383d) {
                RunnableC0008i.m128c();
                f383d = false;
            }
            f411l = (byte) 3;
            return;
        }
        C0011l.f455a = new Random();
        RunnableC0008i.f287a = null;
        RunnableC0008i.f287a = C0011l.m202b("/back.cc");
        f352a = null;
        f352a = C0011l.m176a("/ui.cc");
        f393f = null;
        f393f = C0011l.m202b("/hs.cc");
        f359a = new Image[3];
        try {
            f359a[0] = null;
            f359a[0] = Image.createImage("/prov.png");
            f414m = (byte) 0;
            try {
                f373c = Integer.parseInt(RunnableC0008i.m113a("rovColor"));
            } catch (Exception e) {
                f373c = -1;
            }
        } catch (Exception e2) {
            f414m = (byte) 1;
        }
        f359a[1] = C0003d.m40a("/hr.avg", 5, 307, 160, 2, 0, 0, -1);
        f359a[2] = C0003d.m40a("/apt.avg", 10, 307, 160, 2, 0, 0, -1);
        f375c = C0011l.m202b("/spl1.cc");
        f366b = C0011l.m202b("/spl2.cc");
        C0005f.m58a();
        f411l = (byte) 1;
        RunnableC0008i.m114a();
        C0011l.f459a[3] = C0002c.m24a(RunnableC0008i.f280a, f351a, "503", C0002c.f74a);
        C0011l.m203b();
        byte[] bArrM206b10 = C0011l.m206b(5);
        if (bArrM206b10 != null && bArrM206b10[0] == 85) {
            bArrM206b10[0] = 77;
            C0011l.m185a(bArrM206b10, 5);
            byte[] bArr5 = new byte[73];
            f401h = bArr5;
            C0011l.m185a(bArr5, 7);
            byte[] bArr6 = new byte[21];
            f407j = bArr6;
            bArr6[0] = (byte) Calendar.getInstance().get(2);
            C0011l.m185a(f407j, 22);
            C0011l.m185a((byte[]) null, 11);
            for (int i9 = 0; i9 < 10; i9++) {
                C0011l.m185a((byte[]) null, i9 + 12);
            }
        }
        if (bArrM206b10 != null && bArrM206b10[0] == 77) {
            f364b = C0011l.m169a(bArrM206b10[1], bArrM206b10[2], bArrM206b10[3], bArrM206b10[4]);
            f389e = bArrM206b10[5] == 1;
            boolean z4 = bArrM206b10[6] == 1;
            f394f = z4;
            f378c = C0011l.m206b(6);
            bArrM206b = C0011l.m206b(1);
            f384d = bArrM206b;
            if (bArrM206b == null) {
                f384d = new byte[f416m.length];
                System.arraycopy(f416m, 0, f384d, 0, f384d.length);
                C0011l.m185a(f384d, 1);
            }
            C0011l.f454a = C0011l.m167a((int) f384d[16]) * 3516;
            C0000a.f7a = C0011l.m167a((int) f384d[16]) * 4688;
            if (f385e != -1) {
                f384d[14] = f385e;
            }
            if (f391f != -1) {
                f384d[1] = f391f;
            }
            bArrM206b2 = C0011l.m206b(7);
            f401h = bArrM206b2;
            if (bArrM206b2 == null) {
                byte[] bArr7 = new byte[73];
                f401h = bArr7;
                C0011l.m185a(bArr7, 7);
            }
            bArrM206b3 = C0011l.m206b(22);
            f407j = bArrM206b3;
            if (bArrM206b3 == null) {
                byte[] bArr8 = new byte[21];
                f407j = bArr8;
                C0011l.m185a(bArr8, 22);
            }
            b = (byte) Calendar.getInstance().get(2);
            if (f407j[0] != b) {
                f407j[0] = b;
                for (i4 = 1; i4 < f407j.length; i4++) {
                    f407j[i4] = 0;
                }
                C0011l.m185a(f407j, 22);
            }
            bArrM206b4 = C0011l.m206b(8);
            f404i = bArrM206b4;
            if (bArrM206b4 == null) {
                byte[] bArr9 = {1, 3, 0};
                f404i = bArr9;
                C0011l.m185a(bArr9, 8);
            }
            if (RunnableC0008i.m113a("MN") != null) {
                f404i[2] = 1;
            }
            bArrM206b5 = C0011l.m206b(10);
            f398g = bArrM206b5;
            if (bArrM206b5 == null) {
                byte[] bArr10 = {0, 0, 1, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 15, 8, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 15, 5, 0, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 7, 4, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 4, 11};
                f398g = bArr10;
                C0011l.m185a(bArr10, 10);
            }
            bArrM206b6 = C0011l.m206b(3);
            f390e = bArrM206b6;
            if (bArrM206b6 == null) {
                f390e = new byte[f356a.length];
                System.arraycopy(f356a, 0, f390e, 0, f390e.length);
                C0011l.m185a(f390e, 3);
            }
            f354a = C0011l.m177a((int) f390e[3], (int) f390e[4]);
            f379d = f390e[5];
            bArrM206b7 = C0011l.m206b(9);
            if (bArrM206b7 == null) {
                int i10 = f348a | 1;
                f348a = i10;
                int i11 = i10 | 32;
                f348a = i11;
                int i12 = i11 | 1024;
                f348a = i12;
                C0011l.m185a(C0011l.m190a(i12), 9);
            } else {
                f348a = C0011l.m169a(bArrM206b7[0], bArrM206b7[1], bArrM206b7[2], bArrM206b7[3]);
            }
            bArrM206b8 = C0011l.m206b(4);
            f395f = bArrM206b8;
            if (bArrM206b8 == null) {
                f395f = new byte[f369b.length];
                System.arraycopy(f369b, 0, f395f, 0, f395f.length);
                C0011l.m185a(f395f, 4);
            }
            bArrM206b9 = C0011l.m206b(2);
            if (bArrM206b9 != null && bArrM206b9.length == 14300) {
                iArr = new int[3575];
                for (i3 = 0; i3 < iArr.length; i3++) {
                    iArr[i3] = C0011l.m169a(bArrM206b9[i3 << 2], bArrM206b9[(i3 << 2) + 1], bArrM206b9[(i3 << 2) + 2], bArrM206b9[(i3 << 2) + 3]);
                }
                f382d = Image.createRGBImage(iArr, 55, 65, false);
                f355a = true;
            }
            C0011l.m211c();
            C0005f c0005f = new C0005f("/w.apt", 19, 8);
            C0000a.f24b = c0005f;
            c0005f.m62a(0, new C0003d((byte) 100, (short) 228, "/w.cc", true));
            C0014o.f569a = C0011l.m169a(f384d[17], f384d[18], f384d[19], f384d[20]);
            strM113a = RunnableC0008i.m113a("CO");
            if (strM113a != null || strM113a.length() == 0) {
                strM113a2 = RunnableC0008i.m113a("RA");
                String strM113a9 = RunnableC0008i.m113a("RB");
                strM113a3 = RunnableC0008i.m113a("RC");
                if (strM113a2 != null || strM113a2.length() == 0 || strM113a9 == null || strM113a9.length() == 0 || strM113a3 == null || strM113a3.length() == 0) {
                    z = false;
                } else {
                    z = true;
                }
                f412l = z;
                if (z) {
                    try {
                        RunnableC0008i.m122a("RC", new StringBuffer().append(strM113a3).append(' ').append(RunnableC0008i.m113a("RD")).toString());
                    } catch (Exception e3) {
                    }
                }
                strM113a4 = RunnableC0008i.m113a("AA");
                String strM113a10 = RunnableC0008i.m113a("AB");
                strM113a5 = RunnableC0008i.m113a("AC");
                if (strM113a4 != null || strM113a4.length() == 0 || strM113a10 == null || strM113a10.length() == 0 || strM113a5 == null || strM113a5.length() == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                f368b = z2;
                if (z2) {
                    try {
                        RunnableC0008i.m122a("AC", new StringBuffer().append(strM113a5).append(' ').append(RunnableC0008i.m113a("AD")).toString());
                    } catch (Exception e4) {
                    }
                }
                String strM113a11 = RunnableC0008i.m113a("TA");
                String strM113a12 = RunnableC0008i.m113a("TB");
                strM113a6 = RunnableC0008i.m113a("TC");
                z3 = (strM113a11 != null || strM113a11.length() == 0 || strM113a12 == null || strM113a12.length() == 0 || strM113a6 == null || strM113a6.length() == 0) ? false : true;
                f409k = z3;
                if (z3) {
                    try {
                        RunnableC0008i.m122a("TC", new StringBuffer().append(strM113a6).append(' ').append(RunnableC0008i.m113a("TD")).toString());
                    } catch (Exception e5) {
                    }
                }
            } else {
                String property = System.getProperty("wireless.messaging.sms.smsc");
                if (property == null || property.length() == 0) {
                    i2 = -1;
                    break;
                }
                if (property.startsWith("+")) {
                    property = property.substring(1);
                }
                String[] strArrM195a = C0011l.m195a(strM113a, '|');
                i2 = 0;
                while (true) {
                    if (i2 >= strArrM195a.length) {
                        i2 = -1;
                        break;
                    } else if (property.startsWith(strArrM195a[i2])) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    f412l = false;
                    f368b = false;
                    f409k = false;
                } else {
                    String[] strArrM195a2 = C0011l.m195a(RunnableC0008i.m113a("RA"), '|');
                    String[] strArrM195a3 = C0011l.m195a(RunnableC0008i.m113a("RB"), '|');
                    String[] strArrM195a4 = C0011l.m195a(RunnableC0008i.m113a("RD"), '|');
                    String strM113a13 = RunnableC0008i.m113a("RC");
                    if (strM113a13 != null && strM113a13.length() != 0) {
                        try {
                            RunnableC0008i.m122a("RA", strArrM195a2[i2]);
                            RunnableC0008i.m122a("RB", strArrM195a3[i2]);
                            try {
                                RunnableC0008i.m122a("RC", new StringBuffer().append(strM113a13).append(' ').append(strArrM195a4[i2]).toString());
                            } catch (Exception e6) {
                            }
                            f412l = true;
                        } catch (Exception e7) {
                            f412l = false;
                        }
                    }
                    String[] strArrM195a5 = C0011l.m195a(RunnableC0008i.m113a("AA"), '|');
                    String[] strArrM195a6 = C0011l.m195a(RunnableC0008i.m113a("AB"), '|');
                    String[] strArrM195a7 = C0011l.m195a(RunnableC0008i.m113a("AD"), '|');
                    String strM113a14 = RunnableC0008i.m113a("AC");
                    if (strM113a14 != null && strM113a14.length() != 0) {
                        try {
                            RunnableC0008i.m122a("AA", strArrM195a5[i2]);
                            RunnableC0008i.m122a("AB", strArrM195a6[i2]);
                            try {
                                RunnableC0008i.m122a("AC", new StringBuffer().append(strM113a14).append(' ').append(strArrM195a7[i2]).toString());
                            } catch (Exception e8) {
                            }
                            f368b = true;
                        } catch (Exception e9) {
                            f368b = false;
                        }
                    }
                    String[] strArrM195a8 = C0011l.m195a(RunnableC0008i.m113a("TA"), '|');
                    String[] strArrM195a9 = C0011l.m195a(RunnableC0008i.m113a("TB"), '|');
                    String[] strArrM195a10 = C0011l.m195a(RunnableC0008i.m113a("TD"), '|');
                    String strM113a15 = RunnableC0008i.m113a("TC");
                    if (strM113a15 != null && strM113a15.length() != 0) {
                        try {
                            RunnableC0008i.m122a("TA", strArrM195a8[i2]);
                            RunnableC0008i.m122a("TB", strArrM195a9[i2]);
                            try {
                                RunnableC0008i.m122a("TC", new StringBuffer().append(strM113a15).append(' ').append(strArrM195a10[i2]).toString());
                            } catch (Exception e10) {
                            }
                            f409k = true;
                        } catch (Exception e11) {
                            f409k = false;
                        }
                    }
                }
            }
            strM113a7 = RunnableC0008i.m113a("SS");
            RunnableC0008i.f283a = strM113a7;
            if (strM113a7 != null || RunnableC0008i.f283a.length() == 0) {
                RunnableC0008i.f283a = null;
                f377c = false;
                f406j = false;
            }
            strM113a8 = RunnableC0008i.m113a("ST");
            RunnableC0008i.f297b = strM113a8;
            if (strM113a8 != null || RunnableC0008i.f297b.length() == 0) {
                RunnableC0008i.f297b = null;
                f406j = false;
            }
            if (RunnableC0008i.f293a[131] != null) {
                RunnableC0008i.f305c = new String(RunnableC0008i.f293a[131]);
            }
            if (RunnableC0008i.f293a[91] != null) {
                f374c = new String(RunnableC0008i.f293a[91]);
            }
            if (f374c != null && !f374c.startsWith("http://")) {
                try {
                    f374c = RunnableC0008i.f280a.getAppProperty(f374c);
                } catch (Exception e12) {
                    f374c = null;
                }
            }
            if (f374c != null && f374c.length() == 0) {
                f374c = null;
            }
            if (f374c == null) {
                i = 5;
            } else {
                i = 6;
            }
            f387e = i;
            if (System.getProperty("supports.video.capture") != null) {
                f403i = System.getProperty("supports.video.capture").equals("true");
            } else {
                f403i = false;
            }
            C0011l.f459a[0] = C0007h.m101a(RunnableC0008i.f280a, f351a, "500", C0002c.f74a);
            if (f361a == null) {
                f361a = C0011l.m197a();
            }
            f349a = C0012m.m224b();
            f411l = (byte) 2;
        }
        C0011l.m211c();
        C0011l.m178a();
        C0011l.m203b();
        C0011l.m185a(new byte[]{77, 0, 0, 0, 0, 0, 0}, 5);
        f389e = false;
        f394f = z4;
        f378c = C0011l.m206b(6);
        bArrM206b = C0011l.m206b(1);
        f384d = bArrM206b;
        if (bArrM206b == null) {
            f384d = new byte[f416m.length];
            System.arraycopy(f416m, 0, f384d, 0, f384d.length);
            C0011l.m185a(f384d, 1);
        }
        C0011l.f454a = C0011l.m167a((int) f384d[16]) * 3516;
        C0000a.f7a = C0011l.m167a((int) f384d[16]) * 4688;
        if (f385e != -1) {
            f384d[14] = f385e;
        }
        if (f391f != -1) {
            f384d[1] = f391f;
        }
        bArrM206b2 = C0011l.m206b(7);
        f401h = bArrM206b2;
        if (bArrM206b2 == null) {
            byte[] bArr11 = new byte[73];
            f401h = bArr11;
            C0011l.m185a(bArr11, 7);
        }
        bArrM206b3 = C0011l.m206b(22);
        f407j = bArrM206b3;
        if (bArrM206b3 == null) {
            byte[] bArr12 = new byte[21];
            f407j = bArr12;
            C0011l.m185a(bArr12, 22);
        }
        b = (byte) Calendar.getInstance().get(2);
        if (f407j[0] != b) {
            f407j[0] = b;
            while (i4 < f407j.length) {
                f407j[i4] = 0;
            }
            C0011l.m185a(f407j, 22);
        }
        bArrM206b4 = C0011l.m206b(8);
        f404i = bArrM206b4;
        if (bArrM206b4 == null) {
            byte[] bArr13 = {1, 3, 0};
            f404i = bArr13;
            C0011l.m185a(bArr13, 8);
        }
        if (RunnableC0008i.m113a("MN") != null) {
            f404i[2] = 1;
        }
        bArrM206b5 = C0011l.m206b(10);
        f398g = bArrM206b5;
        if (bArrM206b5 == null) {
            byte[] bArr14 = {0, 0, 1, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 15, 8, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 15, 5, 0, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 7, 4, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 4, 11};
            f398g = bArr14;
            C0011l.m185a(bArr14, 10);
        }
        bArrM206b6 = C0011l.m206b(3);
        f390e = bArrM206b6;
        if (bArrM206b6 == null) {
            f390e = new byte[f356a.length];
            System.arraycopy(f356a, 0, f390e, 0, f390e.length);
            C0011l.m185a(f390e, 3);
        }
        f354a = C0011l.m177a((int) f390e[3], (int) f390e[4]);
        f379d = f390e[5];
        bArrM206b7 = C0011l.m206b(9);
        if (bArrM206b7 == null) {
            int i13 = f348a | 1;
            f348a = i13;
            int i14 = i13 | 32;
            f348a = i14;
            int i15 = i14 | 1024;
            f348a = i15;
            C0011l.m185a(C0011l.m190a(i15), 9);
        } else {
            f348a = C0011l.m169a(bArrM206b7[0], bArrM206b7[1], bArrM206b7[2], bArrM206b7[3]);
        }
        bArrM206b8 = C0011l.m206b(4);
        f395f = bArrM206b8;
        if (bArrM206b8 == null) {
            f395f = new byte[f369b.length];
            System.arraycopy(f369b, 0, f395f, 0, f395f.length);
            C0011l.m185a(f395f, 4);
        }
        bArrM206b9 = C0011l.m206b(2);
        if (bArrM206b9 != null) {
            iArr = new int[3575];
            while (i3 < iArr.length) {
                iArr[i3] = C0011l.m169a(bArrM206b9[i3 << 2], bArrM206b9[(i3 << 2) + 1], bArrM206b9[(i3 << 2) + 2], bArrM206b9[(i3 << 2) + 3]);
            }
            f382d = Image.createRGBImage(iArr, 55, 65, false);
            f355a = true;
        }
        C0011l.m211c();
        C0005f c0005f2 = new C0005f("/w.apt", 19, 8);
        C0000a.f24b = c0005f2;
        c0005f2.m62a(0, new C0003d((byte) 100, (short) 228, "/w.cc", true));
        C0014o.f569a = C0011l.m169a(f384d[17], f384d[18], f384d[19], f384d[20]);
        strM113a = RunnableC0008i.m113a("CO");
        if (strM113a != null) {
            strM113a2 = RunnableC0008i.m113a("RA");
            String strM113a16 = RunnableC0008i.m113a("RB");
            strM113a3 = RunnableC0008i.m113a("RC");
            if (strM113a2 != null) {
                z = false;
            } else {
                z = false;
            }
            f412l = z;
            if (z) {
                RunnableC0008i.m122a("RC", new StringBuffer().append(strM113a3).append(' ').append(RunnableC0008i.m113a("RD")).toString());
            }
            strM113a4 = RunnableC0008i.m113a("AA");
            String strM113a17 = RunnableC0008i.m113a("AB");
            strM113a5 = RunnableC0008i.m113a("AC");
            if (strM113a4 != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            f368b = z2;
            if (z2) {
                RunnableC0008i.m122a("AC", new StringBuffer().append(strM113a5).append(' ').append(RunnableC0008i.m113a("AD")).toString());
            }
            String strM113a18 = RunnableC0008i.m113a("TA");
            String strM113a19 = RunnableC0008i.m113a("TB");
            strM113a6 = RunnableC0008i.m113a("TC");
            if (strM113a18 != null) {
            }
            f409k = z3;
            if (z3) {
                RunnableC0008i.m122a("TC", new StringBuffer().append(strM113a6).append(' ').append(RunnableC0008i.m113a("TD")).toString());
            }
        } else {
            strM113a2 = RunnableC0008i.m113a("RA");
            String strM113a110 = RunnableC0008i.m113a("RB");
            strM113a3 = RunnableC0008i.m113a("RC");
            if (strM113a2 != null) {
                z = false;
            } else {
                z = false;
            }
            f412l = z;
            if (z) {
                RunnableC0008i.m122a("RC", new StringBuffer().append(strM113a3).append(' ').append(RunnableC0008i.m113a("RD")).toString());
            }
            strM113a4 = RunnableC0008i.m113a("AA");
            String strM113a111 = RunnableC0008i.m113a("AB");
            strM113a5 = RunnableC0008i.m113a("AC");
            if (strM113a4 != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            f368b = z2;
            if (z2) {
                RunnableC0008i.m122a("AC", new StringBuffer().append(strM113a5).append(' ').append(RunnableC0008i.m113a("AD")).toString());
            }
            String strM113a112 = RunnableC0008i.m113a("TA");
            String strM113a113 = RunnableC0008i.m113a("TB");
            strM113a6 = RunnableC0008i.m113a("TC");
            if (strM113a112 != null) {
            }
            f409k = z3;
            if (z3) {
                RunnableC0008i.m122a("TC", new StringBuffer().append(strM113a6).append(' ').append(RunnableC0008i.m113a("TD")).toString());
            }
        }
        strM113a7 = RunnableC0008i.m113a("SS");
        RunnableC0008i.f283a = strM113a7;
        if (strM113a7 != null) {
            RunnableC0008i.f283a = null;
            f377c = false;
            f406j = false;
        } else {
            RunnableC0008i.f283a = null;
            f377c = false;
            f406j = false;
        }
        strM113a8 = RunnableC0008i.m113a("ST");
        RunnableC0008i.f297b = strM113a8;
        if (strM113a8 != null) {
            RunnableC0008i.f297b = null;
            f406j = false;
        } else {
            RunnableC0008i.f297b = null;
            f406j = false;
        }
        if (RunnableC0008i.f293a[131] != null) {
            RunnableC0008i.f305c = new String(RunnableC0008i.f293a[131]);
        }
        if (RunnableC0008i.f293a[91] != null) {
            f374c = new String(RunnableC0008i.f293a[91]);
        }
        if (f374c != null) {
            f374c = RunnableC0008i.f280a.getAppProperty(f374c);
        }
        if (f374c != null) {
            f374c = null;
        }
        if (f374c == null) {
            i = 5;
        } else {
            i = 6;
        }
        f387e = i;
        if (System.getProperty("supports.video.capture") != null) {
            f403i = System.getProperty("supports.video.capture").equals("true");
        } else {
            f403i = false;
        }
        C0011l.f459a[0] = C0007h.m101a(RunnableC0008i.f280a, f351a, "500", C0002c.f74a);
        if (f361a == null) {
            f361a = C0011l.m197a();
        }
        f349a = C0012m.m224b();
        f411l = (byte) 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: c */
    static void m141c() {
        if (RunnableC0008i.f313e == 1) {
            f378c = RunnableC0008i.f307c;
            f394f = true;
            C0011l.m203b();
            byte[] bArrM190a = C0011l.m190a(f364b);
            byte[] bArr = new byte[7];
            bArr[0] = 77;
            bArr[1] = bArrM190a[0];
            bArr[2] = bArrM190a[1];
            bArr[3] = bArrM190a[2];
            bArr[4] = bArrM190a[3];
            bArr[5] = (byte) (f389e ? 1 : 0);
            bArr[6] = 1;
            C0011l.m185a(bArr, 5);
            C0011l.m185a(f378c, 6);
            C0011l.m211c();
            RunnableC0008i.m131f();
            if (f355a) {
                RunnableC0008i.m116a((byte) 10, true);
                return;
            } else {
                if (!f403i) {
                    if (f382d == null) {
                        f382d = C0011l.m202b("/av.cc");
                    }
                    RunnableC0008i.m116a((byte) 10, true);
                    return;
                }
                RunnableC0008i.m120a(1, RunnableC0008i.f293a[31], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
            }
        } else {
            if (RunnableC0008i.f309d == 0) {
                if (RunnableC0008i.f302c == 1) {
                    RunnableC0008i.m115a((byte) 10);
                }
                RunnableC0008i.m130e();
                return;
            }
            if (RunnableC0008i.f309d == 1) {
                if (RunnableC0008i.f302c == 1) {
                    f405j = (byte) 5;
                    f408k = (byte) 4;
                    f434t = (byte) 0;
                    f372c = 0.0f;
                    f353a.m255a();
                } else {
                    f355a = true;
                    f382d = null;
                    f382d = C0011l.m202b("/av.cc");
                    RunnableC0008i.m116a((byte) 10, true);
                }
                RunnableC0008i.m130e();
                return;
            }
            if (RunnableC0008i.f309d == 2) {
                if (RunnableC0008i.f302c == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str = new String(RunnableC0008i.f293a[96]);
                    String str2 = new String(RunnableC0008i.f293a[97]);
                    String str3 = new String(RunnableC0008i.f293a[98]);
                    String strM175a = C0011l.m175a("MIDlet-Version");
                    String string = new StringBuffer().append(f365b).append(str).append(str2).append(str3).append(jCurrentTimeMillis).append(strM175a).toString();
                    f365b = string;
                    f365b = new StringBuffer().append("id=").append(str).append("&lng=").append(str2).append("&p=").append(str3).append("&port=").append(C0011l.m171a(string)).append("&ts=").append(jCurrentTimeMillis).append("&v=").append(strM175a).toString();
                    C0011l.m215f();
                    f365b = C0011l.m201b(f365b);
                    C0011l.m182a(new StringBuffer().append(f350a).append(f365b).toString(), true);
                }
                RunnableC0008i.m130e();
                return;
            }
            if (RunnableC0008i.f309d == 3) {
                if (RunnableC0008i.f302c == 2) {
                    RunnableC0008i.m130e();
                    RunnableC0008i.m120a(4, RunnableC0008i.f293a[118], (byte[]) null, RunnableC0008i.f293a[100]);
                    f358a = null;
                    return;
                } else {
                    if (RunnableC0008i.f302c == 1) {
                        RunnableC0008i.m130e();
                        RunnableC0008i.m116a((byte) 16, true);
                        return;
                    }
                    return;
                }
            }
            if (RunnableC0008i.f309d == 4) {
                RunnableC0008i.m116a((byte) 14, true);
                RunnableC0008i.m130e();
                return;
            }
            if (RunnableC0008i.f309d == 5) {
                if (RunnableC0008i.f302c == 1) {
                    RunnableC0008i.m116a((byte) 17, true);
                } else {
                    f358a = null;
                }
                RunnableC0008i.m130e();
                return;
            }
            if (RunnableC0008i.f309d == 6) {
                if (RunnableC0008i.f302c == 1) {
                    RunnableC0008i.m116a((byte) 18, true);
                } else {
                    f358a = null;
                }
                RunnableC0008i.m130e();
                return;
            }
            if (RunnableC0008i.f309d == 7) {
                if (RunnableC0008i.f302c == 1) {
                    C0011l.m182a(f374c, false);
                }
                RunnableC0008i.m130e();
                return;
            } else if (RunnableC0008i.f309d == 15) {
                if (RunnableC0008i.f302c == 1) {
                    C0011l.m182a(RunnableC0008i.f297b, false);
                }
                RunnableC0008i.m130e();
                return;
            }
        }
        if (m139a()) {
            RunnableC0008i.m115a((byte) 11);
        }
        switch (f405j) {
            case -1:
                if (RunnableC0008i.f319f && RunnableC0008i.f329j == 0) {
                    RunnableC0008i.m126b();
                    f414m = (byte) (f414m + 1);
                    RunnableC0008i.f306c = true;
                    RunnableC0008i.f329j = (byte) 3;
                    if (f414m > 2) {
                        f359a[0] = null;
                        f359a[1] = null;
                        f359a[2] = null;
                        f359a = null;
                        RunnableC0008i.f306c = false;
                        RunnableC0008i.f329j = (byte) 3;
                        f405j = (byte) 0;
                    }
                    break;
                }
                break;
            case 0:
                if (f347a < 0.0f) {
                    f347a -= RunnableC0008i.f277a * 2.0f;
                    if (!C0004e.f132a[1]) {
                        C0001b.f56a = RunnableC0008i.m112a(new String(C0004e.f131a), (C0011l.f454a + C0000a.f7a) >> 1);
                        C0004e.f132a[1] = true;
                    }
                    f375c = null;
                    f366b = null;
                    f405j = (byte) 1;
                    RunnableC0008i.m116a((byte) 5, true);
                } else if (f347a < 0.3f) {
                    f347a += RunnableC0008i.f277a * 0.12f;
                } else {
                    f347a += RunnableC0008i.f277a * 0.3f;
                }
                if (RunnableC0008i.f319f && f411l != 0 && f347a > 0.7f) {
                    C0011l.f459a[2] = C0000a.m4a(RunnableC0008i.f280a, f351a, "501", C0002c.f74a);
                    RunnableC0008i.m126b();
                    f347a = -0.001f;
                    C0011l.f459a[1] = C0013n.m234a(RunnableC0008i.f280a, f351a, "L502", C0002c.f74a);
                    break;
                }
                break;
            case 1:
                if (f363b > 360.0f && f372c > 360.0f) {
                    f363b -= 360.0f;
                    f372c -= 360.0f;
                }
                f363b = C0011l.m208c(f363b + ((f372c - f363b) * 2.0f * RunnableC0008i.f277a));
                C0011l.m213d();
                RunnableC0008i.f298b.m144a();
                RunnableC0008i.f298b.m147a(f392f, 0.0f, 1.0f, 0.0f);
                float f = f392f + (RunnableC0008i.f277a * 20.0f);
                f392f = f;
                if (f > 360.0f) {
                    f392f -= 360.0f;
                }
                if (RunnableC0008i.f292a[11]) {
                    RunnableC0008i.m120a(0, RunnableC0008i.f293a[30], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                } else {
                    if (RunnableC0008i.f292a[RunnableC0008i.f324h]) {
                        byte b = (byte) (f434t - 1);
                        f434t = b;
                        if (b < 0) {
                            f434t = (byte) (f387e - 1);
                        }
                        RunnableC0008i.m126b();
                        f372c = 360 - ((f434t * 360) / f387e);
                        if (f363b - f372c > 180.0f) {
                            f372c += 360.0f;
                        } else if (f372c - f363b > 180.0f) {
                            f363b += 360.0f;
                        }
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f327i]) {
                        byte b2 = (byte) (f434t + 1);
                        f434t = b2;
                        if (b2 >= f387e) {
                            f434t = (byte) 0;
                        }
                        RunnableC0008i.m126b();
                        f372c = 360 - ((f434t * 360) / f387e);
                        if (f363b - f372c > 180.0f) {
                            f372c += 360.0f;
                        } else if (f372c - f363b > 180.0f) {
                            f363b += 360.0f;
                        }
                    }
                    if (RunnableC0008i.f329j == 0) {
                        if (RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10]) {
                            if (C0014o.f569a != 2139062141 || C0000a.f22b > 0 || C0001b.f56a > 0 || C0002c.f68a > 0 || C0007h.f211a > 0) {
                                f409k = false;
                                f412l = false;
                                f368b = false;
                            }
                            if (f434t == 0) {
                                Image[] imageArr = new Image[2];
                                f359a = imageArr;
                                imageArr[0] = C0011l.m202b("/fast.cc");
                                f359a[1] = C0011l.m202b("/fast2.cc");
                                RunnableC0008i.f329j = (byte) 3;
                                f405j = (byte) 2;
                                f420o = (byte) (C0011l.m162a() > 0.5f ? -1 : 1);
                                f417n = (byte) (2.0f + (C0011l.m162a() * 4.0f));
                                f423p = (byte) (1.0f + (C0011l.m162a() * 2.0f));
                            } else if (f434t == 1) {
                                f434t = (byte) 0;
                                f372c = 0.0f;
                                if (f378c == null) {
                                    RunnableC0008i.m118a(1, 10, RunnableC0008i.f293a[101], "          ");
                                } else if (f355a) {
                                    RunnableC0008i.m116a((byte) 10, true);
                                } else if (!f403i) {
                                    if (f382d == null) {
                                        f382d = C0011l.m202b("/av.cc");
                                    }
                                    RunnableC0008i.m116a((byte) 10, true);
                                } else {
                                    RunnableC0008i.m120a(1, RunnableC0008i.f293a[31], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                                }
                                break;
                            } else if (f434t == 2) {
                                RunnableC0008i.f329j = (byte) 3;
                                f405j = (byte) 3;
                                f402i = (byte) 0;
                            } else if (f374c != null && f434t == 3) {
                                RunnableC0008i.m120a(7, RunnableC0008i.f293a[99], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                            } else if ((f374c != null && f434t == 4) || (f374c == null && f434t == 3)) {
                                RunnableC0008i.f329j = (byte) 3;
                                f405j = (byte) 6;
                                f402i = (byte) 0;
                            } else if ((f374c != null && f434t == 5) || (f374c == null && f434t == 4)) {
                                RunnableC0008i.m120a(0, RunnableC0008i.f293a[30], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                            }
                            RunnableC0008i.m126b();
                        }
                    }
                }
                break;
            case 2:
                if (RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10]) {
                    if ((f348a & (1 << ((f396g * 5) + f399h))) != 0) {
                        int i = (f396g / 2) + 1;
                        int i2 = f399h + 1;
                        C0000a.f25b = true;
                        int i3 = 1;
                        if (f417n >= 6) {
                            i3 = 3;
                        } else if (f417n >= 3) {
                            i3 = 2;
                        } else if (f417n == 0) {
                            i3 = 0;
                        }
                        int i4 = 8 - f417n;
                        if (i4 > 6) {
                            i4 = 6;
                        }
                        if (i == 1 && (f396g % 2) + 1 == 2) {
                            i4 = (int) (i4 * 0.75f);
                        }
                        C0013n.m240a(f384d[3] + 1, i2, f420o, i, (f396g % 2) + 1, C0013n.f489a[i - 1][i2 - 1][(int) (C0011l.m162a() * C0013n.f489a[i - 1][i2 - 1].length)], i3, f417n, i4, 0, -1.0f, 1.0f, f423p, 100, 0);
                        m137a(1, -1, -1, 50, -1, -1);
                        RunnableC0008i.m115a((byte) 4);
                    } else if (f384d[7] == 0 && f409k) {
                        String[] strArr = {null, RunnableC0008i.m113a("TC"), RunnableC0008i.m113a("TA"), RunnableC0008i.m113a("TB"), new String(RunnableC0008i.f293a[27]), new String(RunnableC0008i.f293a[28])};
                        f358a = strArr;
                        byte[] bArrM207b = C0011l.m207b(strArr[1]);
                        C0011l.m184a(bArrM207b);
                        RunnableC0008i.m120a(6, bArrM207b, C0011l.m207b(f358a[4]), C0011l.m207b(f358a[5]));
                    }
                    RunnableC0008i.m126b();
                } else if (RunnableC0008i.f292a[11]) {
                    f359a[0] = null;
                    f359a[1] = null;
                    f359a = null;
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 1;
                    RunnableC0008i.m126b();
                } else {
                    if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                        f429r = f396g;
                        f396g = (byte) (f396g - 1);
                        f399h = (byte) 0;
                        if (f396g < 0) {
                            f396g = (byte) 3;
                        }
                        f399h = (byte) 0;
                        RunnableC0008i.f292a[RunnableC0008i.f317f] = false;
                        f380d = 1.0f;
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                        f429r = f396g;
                        byte b3 = (byte) (f396g + 1);
                        f396g = b3;
                        if (b3 > 3) {
                            f396g = (byte) 0;
                        }
                        f399h = (byte) 0;
                        RunnableC0008i.f292a[RunnableC0008i.f321g] = false;
                        f380d = 1.0f;
                    }
                    if (RunnableC0008i.f292a[RunnableC0008i.f324h]) {
                        f432s = f399h;
                        byte b4 = (byte) (f399h - 1);
                        f399h = b4;
                        if (b4 < 0) {
                            f399h = (byte) 4;
                        }
                        RunnableC0008i.f292a[RunnableC0008i.f324h] = false;
                        f386e = 1.0f;
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f327i]) {
                        f432s = f399h;
                        byte b5 = (byte) (f399h + 1);
                        f399h = b5;
                        if (b5 > 4) {
                            f399h = (byte) 0;
                        }
                        RunnableC0008i.f292a[RunnableC0008i.f327i] = false;
                        f386e = 1.0f;
                    }
                    if (RunnableC0008i.f292a[4]) {
                        byte b6 = (byte) (f417n + 1);
                        f417n = b6;
                        if (b6 > 7) {
                            f417n = (byte) 0;
                        }
                        RunnableC0008i.f292a[4] = false;
                    }
                    if (RunnableC0008i.f292a[13]) {
                        f420o = (byte) (f420o == -1 ? 1 : -1);
                        RunnableC0008i.f292a[13] = false;
                    }
                    if (RunnableC0008i.f292a[12]) {
                        byte b7 = (byte) (f423p + 1);
                        f423p = b7;
                        if (b7 > 3) {
                            f423p = (byte) 1;
                        }
                        RunnableC0008i.f292a[12] = false;
                    }
                    float f2 = f380d - RunnableC0008i.f277a;
                    f380d = f2;
                    if (f2 < 0.0f) {
                        f380d = 0.0f;
                    }
                    float f3 = f386e - RunnableC0008i.f277a;
                    f386e = f3;
                    if (f3 < 0.0f) {
                        f386e = 0.0f;
                    }
                }
                break;
            case 3:
                if (f402i == 8) {
                    if (RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10]) {
                        RunnableC0008i.m120a(50, RunnableC0008i.f293a[29], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                        RunnableC0008i.m126b();
                    } else if (RunnableC0008i.f302c == 1) {
                        RunnableC0008i.m130e();
                        RunnableC0008i.m126b();
                        RunnableC0008i.m116a((byte) 11, true);
                    } else if (RunnableC0008i.f302c == 2) {
                        RunnableC0008i.m130e();
                    }
                }
                if (RunnableC0008i.f292a[11]) {
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 1;
                    RunnableC0008i.m126b();
                    if (f384d[1] == 0) {
                        RunnableC0008i.f281a.m23d();
                    }
                    RunnableC0008i.m125a(f384d, 1);
                } else {
                    if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                        byte b8 = (byte) (f402i - 1);
                        f402i = b8;
                        if (b8 == 7 && !f409k && !f412l && !f368b) {
                            f402i = (byte) (f402i - 1);
                        }
                        if (f402i < 0) {
                            f402i = (byte) (f431r.length - 1);
                        }
                        RunnableC0008i.m126b();
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                        byte b9 = (byte) (f402i + 1);
                        f402i = b9;
                        if (b9 == 7 && !f409k && !f412l && !f368b) {
                            f402i = (byte) (f402i + 1);
                        }
                        if (f402i >= f431r.length) {
                            f402i = (byte) 0;
                        }
                        RunnableC0008i.m126b();
                    }
                    if (RunnableC0008i.f292a[RunnableC0008i.f324h]) {
                        byte[] bArr2 = f384d;
                        byte b10 = f402i;
                        bArr2[b10] = (byte) (bArr2[b10] - 1);
                        if (f384d[f402i] < 0) {
                            f384d[f402i] = 0;
                        } else if (f402i == 1) {
                            if (f384d[1] == 0) {
                                RunnableC0008i.f281a.m16a();
                            } else if (RunnableC0008i.f281a.f60a == null) {
                                RunnableC0008i.m116a((byte) 7, false);
                            } else {
                                RunnableC0008i.f281a.m17a(f384d[14]);
                            }
                        } else if (f402i == 7) {
                            RunnableC0008i.m120a(-2, f384d[7] == 0 ? RunnableC0008i.f293a[133] : RunnableC0008i.f293a[134], (byte[]) null, RunnableC0008i.f293a[73]);
                        }
                        RunnableC0008i.m126b();
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f327i]) {
                        byte[] bArr3 = f384d;
                        byte b11 = f402i;
                        bArr3[b11] = (byte) (bArr3[b11] + 1);
                        if (f384d[f402i] >= f360a[f402i].length) {
                            f384d[f402i] = (byte) (f360a[f402i].length - 1);
                        } else if (f402i == 1) {
                            if (f384d[1] == 0) {
                                RunnableC0008i.f281a.m16a();
                            } else if (RunnableC0008i.f281a.f60a == null) {
                                RunnableC0008i.m116a((byte) 7, false);
                            } else {
                                RunnableC0008i.f281a.m17a(f384d[14]);
                            }
                        } else if (f402i == 7) {
                            RunnableC0008i.m120a(-2, f384d[7] == 0 ? RunnableC0008i.f293a[133] : RunnableC0008i.f293a[134], (byte[]) null, RunnableC0008i.f293a[73]);
                        }
                        RunnableC0008i.m126b();
                    }
                }
                break;
            case 4:
                if (RunnableC0008i.f329j == 0 && (C0014o.f569a == 2139062142 || C0014o.f569a == Integer.MAX_VALUE)) {
                    C0014o.f569a = 1020000;
                    f384d[20] = (byte) C0014o.f569a;
                    f384d[19] = (byte) (C0014o.f569a >>> 8);
                    f384d[18] = (byte) (C0014o.f569a >>> 16);
                    f384d[17] = (byte) (C0014o.f569a >>> 24);
                }
                if (f363b > 360.0f && f372c > 360.0f) {
                    f363b -= 360.0f;
                    f372c -= 360.0f;
                }
                f363b = C0011l.m208c(f363b + ((f372c - f363b) * 2.0f * RunnableC0008i.f277a));
                RunnableC0008i.f298b.m144a();
                RunnableC0008i.f298b.m147a(f392f, 0.0f, 1.0f, 0.0f);
                float f4 = f392f + (RunnableC0008i.f277a * 20.0f);
                f392f = f4;
                if (f4 > 360.0f) {
                    f392f -= 360.0f;
                }
                if (!RunnableC0008i.f292a[11]) {
                    if (RunnableC0008i.f292a[RunnableC0008i.f324h]) {
                        byte b12 = (byte) (f434t - 1);
                        f434t = b12;
                        if (b12 < 0) {
                            f434t = (byte) (f436u.length - 1);
                        }
                        RunnableC0008i.m126b();
                        f372c = 360 - ((f434t * 360) / f436u.length);
                        if (f363b - f372c > 180.0f) {
                            f372c += 360.0f;
                        } else if (f372c - f363b > 180.0f) {
                            f363b += 360.0f;
                        }
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f327i]) {
                        byte b13 = (byte) (f434t + 1);
                        f434t = b13;
                        if (b13 >= f436u.length) {
                            f434t = (byte) 0;
                        }
                        RunnableC0008i.m126b();
                        f372c = 360 - ((f434t * 360) / f436u.length);
                        if (f363b - f372c > 180.0f) {
                            f372c += 360.0f;
                        } else if (f372c - f363b > 180.0f) {
                            f363b += 360.0f;
                        }
                    }
                    if (RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10]) {
                        switch (f434t) {
                            case 0:
                                C0013n.f516d = (byte) 2;
                                int i5 = (int) ((RunnableC0008i.f279a / 3600000) % 24);
                                C0013n.f531f = (byte) ((i5 < 8 || i5 > 19) ? 2 : 1);
                                C0000a.f25b = false;
                                C0013n.m237a(f384d[3] + 1);
                                RunnableC0008i.m115a((byte) 4);
                                RunnableC0008i.m126b();
                                break;
                            case 1:
                                f371c = (byte) 0;
                                if (f404i[0] != 0) {
                                    RunnableC0008i.m116a((byte) 15, true);
                                } else {
                                    f405j = (byte) 7;
                                    RunnableC0008i.f329j = (byte) 3;
                                    RunnableC0008i.m126b();
                                }
                                break;
                            case 2:
                                f371c = (byte) 1;
                                if (f404i[0] != 0) {
                                    RunnableC0008i.m116a((byte) 15, true);
                                } else {
                                    f405j = (byte) 7;
                                    RunnableC0008i.f329j = (byte) 3;
                                    RunnableC0008i.m126b();
                                }
                                break;
                            case 3:
                                f405j = (byte) 14;
                                f402i = (byte) 0;
                                if (!f377c && f402i == 0) {
                                    f402i = (byte) (f402i + 1);
                                }
                                if (!f403i && f402i == 1) {
                                    f402i = (byte) (f402i + 1);
                                }
                                RunnableC0008i.f329j = (byte) 3;
                                RunnableC0008i.m126b();
                                break;
                            default:
                                RunnableC0008i.m126b();
                                break;
                        }
                    }
                } else {
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 1;
                    f434t = (byte) 1;
                    f372c = 360 - ((f434t * 360) / f428q.length);
                    RunnableC0008i.m126b();
                    break;
                }
                break;
            case 5:
                if (RunnableC0008i.f292a[11] && !f353a.f572a) {
                    RunnableC0008i.m126b();
                    f353a.m256b();
                    if (f382d == null) {
                        f382d = C0011l.m202b("/av.cc");
                    }
                    f405j = f408k;
                    RunnableC0008i.f329j = (byte) 3;
                    RunnableC0008i.f294b = (byte) 0;
                    RunnableC0008i.m116a((byte) 10, true);
                } else if ((RunnableC0008i.f292a[10] || RunnableC0008i.f292a[9]) && !f353a.f572a) {
                    RunnableC0008i.m126b();
                    Image imageM254a = f353a.m254a(55, 65);
                    f353a.m256b();
                    if (imageM254a != null) {
                        f382d = imageM254a;
                        int[] iArr = new int[3575];
                        f382d.getRGB(iArr, 0, 55, 0, 0, 55, 65);
                        byte[] bArr4 = new byte[14300];
                        for (int i6 = 0; i6 < iArr.length; i6++) {
                            bArr4[i6 << 2] = (byte) ((iArr[i6] >> 24) & 255);
                            bArr4[(i6 << 2) + 1] = (byte) ((iArr[i6] >> 16) & 255);
                            bArr4[(i6 << 2) + 2] = (byte) ((iArr[i6] >> 8) & 255);
                            bArr4[(i6 << 2) + 3] = (byte) (iArr[i6] & 255);
                        }
                        C0011l.m203b();
                        f389e = true;
                        byte[] bArrM190a2 = C0011l.m190a(f364b);
                        byte[] bArr5 = new byte[7];
                        bArr5[0] = 77;
                        bArr5[1] = bArrM190a2[0];
                        bArr5[2] = bArrM190a2[1];
                        bArr5[3] = bArrM190a2[2];
                        bArr5[4] = bArrM190a2[3];
                        bArr5[5] = 1;
                        bArr5[6] = (byte) (f394f ? 1 : 0);
                        C0011l.m185a(bArr5, 5);
                        C0011l.m185a(bArr4, 2);
                        C0011l.m211c();
                        f355a = true;
                    } else if (f382d == null) {
                        f382d = C0011l.m202b("/av.cc");
                    }
                    f353a.f572a = false;
                    f405j = f408k;
                    RunnableC0008i.f329j = (byte) 3;
                    RunnableC0008i.f294b = (byte) 0;
                    RunnableC0008i.m116a((byte) 10, true);
                }
                break;
            case 6:
                if (RunnableC0008i.f292a[11]) {
                    RunnableC0008i.f311d = false;
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 1;
                    RunnableC0008i.m126b();
                } else if (RunnableC0008i.f292a[10] || RunnableC0008i.f292a[9]) {
                    switch (f402i) {
                        case 0:
                            f430r = true;
                            C0006g.m77a("help", 319, 182, 239, 262, C0011l.m191a("/fh.cc"), 0);
                            RunnableC0008i.f329j = (byte) 3;
                            f405j = (byte) 10;
                            break;
                        case 1:
                            f430r = true;
                            C0006g.m77a("help", 319, 182, 239, 262, C0011l.m191a("/ch.cc"), 0);
                            RunnableC0008i.f329j = (byte) 3;
                            f405j = (byte) 10;
                            break;
                        case 2:
                            f430r = false;
                            C0006g.m77a("help", 319, 182, 239, 262, C0011l.m191a("/keys.cc"), 0);
                            RunnableC0008i.f329j = (byte) 3;
                            f405j = (byte) 10;
                            break;
                        case 3:
                            f430r = false;
                            C0006g.m77a("help", 319, 182, 239, 262, C0011l.m191a("/auth.cc"), 0);
                            RunnableC0008i.f329j = (byte) 3;
                            f405j = (byte) 10;
                            break;
                        case 4:
                            RunnableC0008i.m120a(2, RunnableC0008i.f293a[99], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                            break;
                    }
                    RunnableC0008i.m126b();
                } else {
                    boolean z = C0014o.f569a == 2139062141 && C0000a.f22b <= 0 && C0001b.f56a <= 0 && C0002c.f68a <= 0 && C0007h.f211a <= 0;
                    if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                        byte b14 = (byte) (f402i - 1);
                        f402i = b14;
                        if (b14 < 0) {
                            f402i = (byte) ((f433s.length - 1) - (z ? 0 : 1));
                        }
                        RunnableC0008i.m126b();
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                        byte b15 = (byte) (f402i + 1);
                        f402i = b15;
                        if (b15 >= f433s.length - (z ? 0 : 1)) {
                            f402i = (byte) 0;
                        }
                        RunnableC0008i.m126b();
                    }
                }
                break;
            case 7:
                if (f410k[f371c] == -1) {
                    f410k[f371c] = f398g[f371c];
                    f381d = 30 - (f410k[f371c] * (C0006g.f171b[0] + 6));
                    while (f381d + ((f361a[f371c].length / 5) * (C0006g.f171b[0] + 6)) < 201) {
                        f381d += C0006g.f171b[0] + 6;
                    }
                }
                if (RunnableC0008i.f292a[11]) {
                    C0006g.m93c();
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 4;
                    RunnableC0008i.m126b();
                } else {
                    if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                        C0006g.m93c();
                        byte[] bArr6 = f410k;
                        byte b16 = f371c;
                        bArr6[b16] = (byte) (bArr6[b16] - 1);
                        if (f410k[f371c] < 0) {
                            f410k[f371c] = 0;
                        } else if (f410k[f371c] >= f361a[f371c].length / 5) {
                            f410k[f371c] = (byte) ((f361a[f371c].length / 5) - 1);
                        }
                        RunnableC0008i.f292a[RunnableC0008i.f317f] = false;
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                        C0006g.m93c();
                        byte[] bArr7 = f410k;
                        byte b17 = f371c;
                        bArr7[b17] = (byte) (bArr7[b17] + 1);
                        if (f410k[f371c] < 0) {
                            f410k[f371c] = 0;
                        } else if (f410k[f371c] >= f361a[f371c].length / 5) {
                            f410k[f371c] = (byte) ((f361a[f371c].length / 5) - 1);
                        }
                        RunnableC0008i.f292a[RunnableC0008i.f321g] = false;
                    }
                    if ((RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10]) && f424p) {
                        C0006g.m93c();
                        f347a = 0.0f;
                        C0006g.m77a("item", 316, 97, 236, 177, f361a[f371c][(f410k[f371c] * 5) + 1], 0);
                        f421o = (f395f[(f371c == 0 ? f410k[f371c] : (f361a[0].length / 5) + f410k[f371c]) / 8] & C0011l.m199b((f371c == 0 ? f410k[f371c] : (f361a[0].length / 5) + f410k[f371c]) % 8)) != 0;
                        f367b = C0011l.m177a((int) f361a[f371c][(f410k[f371c] * 5) + 2][5], (int) f361a[f371c][(f410k[f371c] * 5) + 2][6]);
                        f426q = f361a[f371c][(f410k[f371c] * 5) + 2][7];
                        f376c = f421o ? (short) 0 : C0011l.m177a((int) f361a[f371c][(f410k[f371c] * 5) + 2][8], (int) f361a[f371c][(f410k[f371c] * 5) + 2][9]);
                        f400h = f361a[f371c][(f410k[f371c] * 5) + 2][40] == -1;
                        if (f421o && f367b > 0) {
                            int iM166a = C0011l.m166a(f367b / 3.0f);
                            if (iM166a == 0) {
                                iM166a = 1;
                            }
                            f367b = (short) iM166a;
                        } else if (!f421o && f361a[f371c][(f410k[f371c] * 5) + 2][18] > 1 && (f354a + f367b) - f376c < C0000a.f18a[f361a[f371c][(f410k[f371c] * 5) + 2][18]]) {
                            int i7 = (C0000a.f18a[f361a[f371c][(f410k[f371c] * 5) + 2][18]] - f354a) + f376c;
                            switch (f361a[f371c][(f410k[f371c] * 5) + 2][18]) {
                                case 2:
                                    i7 += 3;
                                    break;
                                case 4:
                                    i7 += 7;
                                    break;
                                case 5:
                                    i7 += 15;
                                    break;
                                case 7:
                                    i7 += 25;
                                    break;
                                case 8:
                                    i7 += 20;
                                    break;
                            }
                            while (i7 % 10 != 0 && i7 % 10 != 5) {
                                i7++;
                            }
                            f367b = (short) i7;
                        }
                        f415m = false;
                        f388e = null;
                        f388e = C0011l.m202b(new StringBuffer().append("/a").append((int) f361a[f371c][(f410k[f371c] * 5) + 2][0]).append(".cc").toString());
                        f405j = (byte) 8;
                        f418n = true;
                        RunnableC0008i.m126b();
                    }
                }
                break;
            case 8:
                if (!f418n) {
                    float f5 = f347a - (RunnableC0008i.f277a * 0.4f);
                    f347a = f5;
                    if (f5 < 0.0f) {
                        C0006g.m72a();
                        f388e = null;
                        byte b18 = f361a[f371c][(f410k[f371c] * 5) + 2][12];
                        byte b19 = f361a[f371c][(f410k[f371c] * 5) + 2][10];
                        C0000a.f25b = false;
                        C0013n.m240a(f384d[3] + 1, b19, f361a[f371c][(f410k[f371c] * 5) + 2][11], b18, f361a[f371c][(f410k[f371c] * 5) + 2][13], C0013n.f489a[b18 - 1][b19 - 1][f361a[f371c][(f410k[f371c] * 5) + 2][14]], f361a[f371c][(f410k[f371c] * 5) + 2][15], f361a[f371c][(f410k[f371c] * 5) + 2][16], f361a[f371c][(f410k[f371c] * 5) + 2][17], f361a[f371c][(f410k[f371c] * 5) + 2][18], f361a[f371c][(f410k[f371c] * 5) + 2][19], f361a[f371c][(f410k[f371c] * 5) + 2][20] / 100.0f, f361a[f371c][(f410k[f371c] * 5) + 2][26], f361a[f371c][(f410k[f371c] * 5) + 2][27], ((f361a[f371c][(f410k[f371c] * 5) + 2][29] & 255) << 16) | ((f361a[f371c][(f410k[f371c] * 5) + 2][30] & 255) << 8) | (f361a[f371c][(f410k[f371c] * 5) + 2][35] & 255));
                        m137a(f361a[f371c][(f410k[f371c] * 5) + 2][21], f361a[f371c][(f410k[f371c] * 5) + 2][22], C0011l.m177a((int) f361a[f371c][(f410k[f371c] * 5) + 2][23], (int) f361a[f371c][(f410k[f371c] * 5) + 2][41]), f361a[f371c][(f410k[f371c] * 5) + 2][24], f361a[f371c][(f410k[f371c] * 5) + 2][25], f361a[f371c][(f410k[f371c] * 5) + 2][28]);
                        RunnableC0008i.f329j = (byte) 1;
                        RunnableC0008i.m115a((byte) 9);
                    }
                } else {
                    float f6 = f347a + (RunnableC0008i.f277a * 0.4f);
                    f347a = f6;
                    if (f6 > 1.0f) {
                        f347a = 1.0f;
                    }
                }
                if (RunnableC0008i.f292a[11] && f347a == 1.0f) {
                    RunnableC0008i.f329j = (byte) 3;
                    C0006g.m72a();
                    f405j = (byte) 7;
                    f388e = null;
                    RunnableC0008i.m126b();
                } else {
                    if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                        C0006g.m73a((-RunnableC0008i.f277a) * 40.0f);
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                        C0006g.m73a(RunnableC0008i.f277a * 40.0f);
                    }
                    if ((RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10]) && f347a == 1.0f) {
                        RunnableC0008i.m126b();
                        f418n = false;
                    }
                }
                break;
            case 9:
                if (!C0000a.f25b) {
                    if (!C0006g.m81a()) {
                        if (f404i[0] != 0) {
                            f370b = null;
                            f357a = null;
                            f388e = null;
                            RunnableC0008i.m116a((byte) 15, true);
                        }
                        break;
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                        C0006g.m73a((-RunnableC0008i.f277a) * 40.0f);
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                        C0006g.m73a(RunnableC0008i.f277a * 40.0f);
                    }
                }
                if (RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10] || RunnableC0008i.f292a[11]) {
                    if (C0000a.f25b) {
                        RunnableC0008i.f329j = (byte) 3;
                        f405j = (byte) 1;
                    } else {
                        RunnableC0008i.f329j = (byte) 3;
                        C0006g.m72a();
                        if (f404i[0] != 0) {
                            f370b = null;
                            f357a = null;
                            f388e = null;
                            RunnableC0008i.m116a((byte) 15, true);
                        } else {
                            if (f415m) {
                                RunnableC0008i.f299b = true;
                            }
                            f405j = (byte) 7;
                        }
                    }
                    f370b = null;
                    f357a = null;
                    f388e = null;
                }
                break;
            case 10:
                if (RunnableC0008i.f292a[11]) {
                    C0006g.m72a();
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 6;
                    RunnableC0008i.m126b();
                } else if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                    C0006g.m73a((-RunnableC0008i.f277a) * 40.0f);
                } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                    C0006g.m73a(RunnableC0008i.f277a * 40.0f);
                }
                break;
            case 11:
                if (!RunnableC0008i.f292a[11]) {
                    if (RunnableC0008i.f292a[9]) {
                        RunnableC0008i.m126b();
                        if (f402i == 13) {
                            RunnableC0008i.m120a(15, RunnableC0008i.f293a[99], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                        } else {
                            f405j = (byte) 13;
                            RunnableC0008i.m116a((byte) 13, true);
                        }
                    } else {
                        if (RunnableC0008i.f292a[10]) {
                            if (f404i[2] == 1) {
                                RunnableC0008i.m116a((byte) 14, true);
                            } else if (f412l) {
                                String[] strArr2 = {null, RunnableC0008i.m113a("RC"), RunnableC0008i.m113a("RA"), RunnableC0008i.m113a("RB"), new String(RunnableC0008i.f293a[27]), new String(RunnableC0008i.f293a[28])};
                                f358a = strArr2;
                                byte[] bArrM207b2 = C0011l.m207b(strArr2[1]);
                                C0011l.m184a(bArrM207b2);
                                RunnableC0008i.m120a(3, bArrM207b2, C0011l.m207b(f358a[4]), C0011l.m207b(f358a[5]));
                            } else {
                                RunnableC0008i.m120a(4, RunnableC0008i.f293a[118], (byte[]) null, RunnableC0008i.f293a[100]);
                            }
                            RunnableC0008i.m126b();
                        }
                        if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                            if (f402i == 0) {
                                f402i = (byte) (f406j ? 13 : 8);
                            } else if (f402i == 13) {
                                f402i = (byte) 8;
                            } else if (f402i >= 8 && f402i <= 12) {
                                f402i = (byte) 3;
                            } else if (f402i < 3 || f402i > 7) {
                                f402i = (byte) (f402i - 1);
                            } else {
                                f402i = (byte) 2;
                            }
                            RunnableC0008i.m126b();
                        } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                            if (f402i == 13) {
                                f402i = (byte) 0;
                            } else if (f402i >= 8) {
                                f402i = (byte) (f406j ? 13 : 0);
                            } else if (f402i < 3 || f402i > 7) {
                                f402i = (byte) (f402i + 1);
                            } else {
                                f402i = (byte) 8;
                            }
                            RunnableC0008i.m126b();
                        }
                        if (RunnableC0008i.f292a[RunnableC0008i.f327i]) {
                            if (f402i >= 8 && f402i < 12) {
                                f402i = (byte) (f402i + 1);
                            } else if (f402i >= 3 && f402i < 7) {
                                f402i = (byte) (f402i + 1);
                            }
                            RunnableC0008i.m126b();
                        } else if (RunnableC0008i.f292a[RunnableC0008i.f324h]) {
                            if (f402i > 8 && f402i <= 12) {
                                f402i = (byte) (f402i - 1);
                            } else if (f402i > 3 && f402i <= 7) {
                                f402i = (byte) (f402i - 1);
                            }
                            RunnableC0008i.m126b();
                        }
                    }
                    break;
                } else {
                    RunnableC0008i.m126b();
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 14;
                    f402i = (byte) 0;
                    if (!f377c && f402i == 0) {
                        f402i = (byte) (f402i + 1);
                    }
                    if (!f403i && f402i == 1) {
                        f402i = (byte) (f402i + 1);
                        break;
                    }
                }
                break;
            case 12:
                if (RunnableC0008i.f292a[10] || RunnableC0008i.f292a[11] || RunnableC0008i.f292a[9]) {
                    RunnableC0008i.m126b();
                    f359a = null;
                    C0006g.m72a();
                    if (f346a == 0) {
                        RunnableC0008i.f329j = (byte) 3;
                        f405j = (byte) 7;
                        f404i[0] = 0;
                        RunnableC0008i.m125a(f404i, 8);
                    } else if (f346a == 100) {
                        RunnableC0008i.f329j = (byte) 3;
                        f405j = (byte) 1;
                        f434t = (byte) 0;
                        f372c = 360 - ((f434t * 360) / f428q.length);
                        f404i[0] = 0;
                        RunnableC0008i.m125a(f404i, 8);
                    } else {
                        f404i[0] = f346a;
                        RunnableC0008i.m116a((byte) 15, true);
                    }
                } else if (C0006g.m81a()) {
                    if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                        RunnableC0008i.f278a = 9999;
                        C0006g.m73a((-RunnableC0008i.f277a) * 40.0f);
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                        RunnableC0008i.f278a = 9999;
                        C0006g.m73a(RunnableC0008i.f277a * 40.0f);
                    }
                    if (RunnableC0008i.f278a < 0) {
                        RunnableC0008i.f278a += RunnableC0008i.f296b;
                    } else if (RunnableC0008i.f278a != 9999) {
                        C0006g.m73a(RunnableC0008i.f277a * 5.0f);
                    }
                }
                break;
            case 13:
                if (RunnableC0008i.f292a[11]) {
                    C0006g.m72a();
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 11;
                    RunnableC0008i.m126b();
                } else {
                    if (RunnableC0008i.f292a[10]) {
                        if (f404i[2] == 1) {
                            RunnableC0008i.m116a((byte) 14, true);
                        } else if (f412l) {
                            String[] strArr3 = {null, RunnableC0008i.m113a("RC"), RunnableC0008i.m113a("RA"), RunnableC0008i.m113a("RB"), new String(RunnableC0008i.f293a[27]), new String(RunnableC0008i.f293a[28])};
                            f358a = strArr3;
                            byte[] bArrM207b3 = C0011l.m207b(strArr3[1]);
                            C0011l.m184a(bArrM207b3);
                            RunnableC0008i.m120a(3, bArrM207b3, C0011l.m207b(f358a[4]), C0011l.m207b(f358a[5]));
                        } else {
                            RunnableC0008i.m120a(4, RunnableC0008i.f293a[118], (byte[]) null, RunnableC0008i.f293a[100]);
                        }
                        RunnableC0008i.m126b();
                    }
                    if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                        C0006g.m73a((-RunnableC0008i.f277a) * 40.0f);
                    } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                        C0006g.m73a(RunnableC0008i.f277a * 40.0f);
                    }
                }
                break;
            case 14:
                if (RunnableC0008i.f292a[11]) {
                    RunnableC0008i.f329j = (byte) 3;
                    f405j = (byte) 4;
                    RunnableC0008i.m126b();
                } else if (RunnableC0008i.f292a[10] || RunnableC0008i.f292a[9]) {
                    switch (f402i) {
                        case 0:
                            f402i = (byte) 0;
                            f405j = (byte) 11;
                            RunnableC0008i.f329j = (byte) 3;
                            break;
                        case 1:
                            f405j = (byte) 5;
                            f408k = (byte) 4;
                            f353a.m255a();
                            break;
                        case 2:
                            RunnableC0008i.m118a(1, 10, RunnableC0008i.f293a[101], "          ");
                            break;
                        case 3:
                            String[] strArr4 = {null, RunnableC0008i.m113a("AC"), RunnableC0008i.m113a("AA"), RunnableC0008i.m113a("AB"), new String(RunnableC0008i.f293a[27]), new String(RunnableC0008i.f293a[28])};
                            f358a = strArr4;
                            byte[] bArrM207b4 = C0011l.m207b(strArr4[1]);
                            C0011l.m184a(bArrM207b4);
                            RunnableC0008i.m120a(5, bArrM207b4, C0011l.m207b(f358a[4]), C0011l.m207b(f358a[5]));
                            break;
                    }
                    RunnableC0008i.m126b();
                } else if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                    f402i = (byte) (f402i - 1);
                    if (!f403i && f402i == 1) {
                        f402i = (byte) (f402i - 1);
                    }
                    if (!f377c && f402i == 0) {
                        f402i = (byte) (f402i - 1);
                    }
                    if (f402i < 0) {
                        f402i = (byte) ((f435t.length - 1) - ((f384d[7] == 0 && f368b) ? 0 : 1));
                    }
                    if (!f403i && f402i == 1) {
                        f402i = (byte) (f402i - 1);
                    }
                    if (!f377c && f402i == 0) {
                        f402i = (byte) (f402i - 1);
                    }
                    RunnableC0008i.m126b();
                } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                    byte b20 = (byte) (f402i + 1);
                    f402i = b20;
                    if (b20 >= f435t.length - ((f384d[7] == 0 && f368b) ? 0 : 1)) {
                        f402i = (byte) 0;
                    }
                    if (!f377c && f402i == 0) {
                        f402i = (byte) (f402i + 1);
                    }
                    if (!f403i && f402i == 1) {
                        f402i = (byte) (f402i + 1);
                    }
                    RunnableC0008i.m126b();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    static void m142d() {
        int i = 0;
        while (i < 2) {
            f419n[i] = (byte) (f361a[i].length / 5);
            f422o[i] = 0;
            f425p[i] = 0;
            for (int i2 = 0; i2 < f361a[i].length / 5; i2++) {
                short sM177a = C0011l.m177a((int) f361a[i][(i2 * 5) + 2][1], (int) f361a[i][(i2 * 5) + 2][2]);
                byte b = f361a[i][(i2 * 5) + 2][3];
                byte b2 = f361a[i][(i2 * 5) + 2][4];
                boolean z = (f395f[(i == 0 ? i2 : (f361a[0].length / 5) + i2) / 8] & C0011l.m199b((i == 0 ? i2 : (f361a[0].length / 5) + i2) % 8)) != 0;
                if (z) {
                    byte[] bArr = f422o;
                    bArr[i] = (byte) (bArr[i] + 1);
                }
                if ((z || (f361a[i][(i2 * 5) + 2][40] - f390e[12] <= 1 && sM177a <= f354a && b <= f379d && b2 <= C0000a.f34c[f390e[0]])) && !z) {
                    byte[] bArr2 = f425p;
                    bArr2[i] = (byte) (bArr2[i] + 1);
                }
            }
            i++;
        }
    }
}
