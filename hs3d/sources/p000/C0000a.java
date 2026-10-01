package p000;

import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
final class C0000a {

    /* JADX INFO: renamed from: a */
    private static float f6a;

    /* JADX INFO: renamed from: a */
    static C0003d f8a;

    /* JADX INFO: renamed from: a */
    static C0005f f9a;

    /* JADX INFO: renamed from: a */
    private static Image f10a;

    /* JADX INFO: renamed from: a */
    private static C0010k f11a;

    /* JADX INFO: renamed from: a */
    private static short f12a;

    /* JADX INFO: renamed from: a */
    private static int[] f16a;

    /* JADX INFO: renamed from: b */
    private static float f21b;

    /* JADX INFO: renamed from: b */
    static int f22b;

    /* JADX INFO: renamed from: b */
    static C0003d f23b;

    /* JADX INFO: renamed from: b */
    static C0005f f24b;

    /* JADX INFO: renamed from: b */
    static byte[] f26b;

    /* JADX INFO: renamed from: b */
    private static int[] f27b;

    /* JADX INFO: renamed from: c */
    private static float f29c;

    /* JADX INFO: renamed from: c */
    static C0005f f32c;

    /* JADX INFO: renamed from: d */
    private static float f37d;

    /* JADX INFO: renamed from: d */
    static C0005f f39d;

    /* JADX INFO: renamed from: e */
    private static float f42e;

    /* JADX INFO: renamed from: e */
    private static C0005f f43e;

    /* JADX INFO: renamed from: f */
    private static float f45f;

    /* JADX INFO: renamed from: f */
    private static C0005f f46f;

    /* JADX INFO: renamed from: i */
    private static byte[] f53i;

    /* JADX INFO: renamed from: a */
    static byte[] f14a = {102, 105, 108, 101, 58, 47, 47};

    /* JADX INFO: renamed from: a */
    static int f7a = 90335;

    /* JADX INFO: renamed from: c */
    private static int f30c = 0;

    /* JADX INFO: renamed from: d */
    private static final byte[] f41d = {6, 7, 7, 6};

    /* JADX INFO: renamed from: b */
    private static byte f20b = 0;

    /* JADX INFO: renamed from: d */
    private static boolean f40d = false;

    /* JADX INFO: renamed from: a */
    static boolean f13a = false;

    /* JADX INFO: renamed from: b */
    static boolean f25b = true;

    /* JADX INFO: renamed from: d */
    private static int f38d = 0;

    /* JADX INFO: renamed from: c */
    static boolean f33c = true;

    /* JADX INFO: renamed from: c */
    private static C0003d f31c = new C0003d((byte) 99);

    /* JADX INFO: renamed from: c */
    private static byte f28c = 0;

    /* JADX INFO: renamed from: e */
    private static byte[] f44e = {8, 15, 1, 1, 10, 12, 20, 25, 7, 7, 7, 7};

    /* JADX INFO: renamed from: f */
    private static byte[] f47f = {0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};

    /* JADX INFO: renamed from: c */
    private static int[] f35c = {-1, -2, -3, 0, 26, 52, 78, 104, 130, 156, 182, 208, 234, 260, 286, 312, 338};

    /* JADX INFO: renamed from: g */
    private static byte[] f49g = {6, 5, 14, 6, 5, 4, 3, 6, 0};

    /* JADX INFO: renamed from: h */
    private static byte[] f51h = {1, 3, 1, 1, 1, 0, 0, 1, 0};

    /* JADX INFO: renamed from: c */
    static final byte[] f34c = {0, 0, 0, 1, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: a */
    static final short[] f18a = {20, 30, 32, 130, 150, 190, 360, 400, 500};

    /* JADX INFO: renamed from: a */
    static final float[][] f19a = {new float[]{-0.25619984f, -1.6422001f, 1.5924983f, 0.99104f, 1.0662194f}, new float[]{-0.2421999f, -1.6568989f, 1.5616994f, 0.9439999f, 0.9791998f}, new float[]{-0.2701999f, -1.906798f, 1.5175999f, 0.9997201f, 0.99594f}, new float[]{-0.26249987f, -1.6806989f, 1.6876984f, 1.0074197f, 1.0593598f}, new float[]{-0.20859975f, -1.7758983f, 1.7009982f, 1.0218391f, 1.0541795f}, new float[]{-0.25689992f, -1.7114989f, 1.8143979f, 1.0142798f, 1.079939f}, new float[]{-0.25409985f, -1.7835982f, 1.6764989f, 1.0663593f, 1.0848378f}, new float[]{-0.26599985f, -1.658299f, 1.6715988f, 0.91726005f, 0.9561797f}, new float[]{-0.24429974f, -1.4524997f, 1.9361981f, 1.1129794f, 1.1152192f}};

    /* JADX INFO: renamed from: a */
    static final String[] f17a = {"Creon", "Carpos", "Latona", "Cintia", "Orion", "Phaeton", "Corona", "Magnet", "Phenix"};

    /* JADX INFO: renamed from: a */
    static final char[] f15a = {'A', 'B', 'C'};

    /* JADX INFO: renamed from: d */
    private static byte f36d = 4;

    /* JADX INFO: renamed from: g */
    private static float f48g = 160.0f;

    /* JADX INFO: renamed from: h */
    private static float f50h = 5.2f;

    /* JADX INFO: renamed from: i */
    private static float f52i = 1.0f;

    /* JADX INFO: renamed from: j */
    private static float f54j = 0.0f;

    /* JADX INFO: renamed from: k */
    private static float f55k = 0.0f;

    /* JADX INFO: renamed from: a */
    static byte f5a = 0;

    C0000a() {
    }

    /* JADX INFO: renamed from: a */
    static int m3a() {
        return Math.abs((new Random().nextInt() % (f7a - C0011l.f454a)) + C0011l.f454a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [int, java.lang.String] */
    /* JADX INFO: renamed from: a */
    static int m4a(MIDlet mIDlet, Hashtable hashtable, String str, int i) {
        boolean z;
        int iM3a = m3a();
        try {
            String property = System.getProperty(new String(C0013n.f512c));
            String appProperty = mIDlet.getAppProperty(new String(RunnableC0008i.f300b));
            String str2 = property == null ? appProperty : property;
            ?? r0 = (String) C0009j.f351a.get(str);
            try {
                if (r0 == 0) {
                    int i2 = -iM3a;
                    hashtable.put(new String(C0013n.f512c), new StringBuffer().append("").append(i2).toString());
                    return i2;
                }
                if (r0 != 0) {
                    return iM3a;
                }
                String[] strArrM195a = C0011l.m195a(new String(C0004e.m53a((String) r0, i, false)), '@');
                int i3 = 0;
                while (true) {
                    if (i3 >= strArrM195a.length - 1) {
                        z = false;
                        break;
                    }
                    if (str2.startsWith(strArrM195a[i3])) {
                        z = true;
                        break;
                    }
                    i3++;
                }
                if (!z) {
                    for (String str3 : strArrM195a) {
                        if (str3.equals(str2)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    String str4 = new String(C0013n.f512c);
                    StringBuffer stringBufferAppend = new StringBuffer().append("");
                    if (z) {
                        iM3a = -iM3a;
                    }
                    hashtable.put(str4, stringBufferAppend.append(iM3a).toString());
                }
                int i4 = iM3a;
                if (str2.equals(mIDlet.getAppProperty(new String(C0009j.f413l)))) {
                    return m3a();
                }
                hashtable.put(appProperty, new StringBuffer().append("").append(i4).toString());
                return i4;
            } catch (Exception e) {
                return r0;
            }
        } catch (Exception e2) {
            return iM3a;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m5a() throws Throwable {
        f30c = 0;
        C0002c.m33c();
        f11a = new C0010k();
        f28c = (byte) 0;
        f36d = (byte) 4;
        C0004e.f129a.m144a();
        if (f8a == null) {
            m10b();
        }
        f43e = new C0005f(new StringBuffer().append("/w").append((int) C0013n.f516d).append("/g1.apt").toString(), 0, 4);
        f46f = new C0005f(new StringBuffer().append("/w").append((int) C0013n.f516d).append("/g2.apt").toString(), 0, 12);
        f43e.m62a(0, f8a);
        f46f.m62a(0, f23b);
        m13c(false);
        if (f25b) {
            f5a = C0009j.f384d[10];
            m7a(false);
        }
        f10a = null;
        f10a = C0011l.m202b("/gartop.cc");
        C0004e.m54b();
    }

    /* JADX INFO: renamed from: a */
    static void m6a(Graphics graphics) {
        boolean z;
        float f;
        float f2;
        if (f36d == 0) {
            C0002c.m27a(graphics, C0004e.f129a, 0, 0, 145, 320, 95);
            C0002c.m25a(60.0f, 320, 95, 0.5f, 600.0f);
        } else if (f25b || f13a || !f40d) {
            C0002c.m27a(graphics, C0004e.f129a, 0, 0, 35, 320, 205);
            C0002c.m25a(60.0f, 320, 205, 0.5f, 600.0f);
        } else {
            C0002c.m27a(graphics, C0004e.f129a, 0, 0, 73, 320, 167);
            C0002c.m25a(60.0f, 320, 167, 0.5f, 600.0f);
        }
        C0002c.m31a(f39d, RunnableC0008i.f288a);
        C0002c.m31a(f43e, (C0010k) null);
        C0002c.m31a(f46f, (C0010k) null);
        if (C0013n.f559m) {
            C0002c.m31a(f32c, RunnableC0008i.f298b);
        }
        C0002c.m31a(f9a, RunnableC0008i.f298b);
        if (f40d) {
            f11a.m151a(RunnableC0008i.f298b);
            f11a.m146a(0.0f, f19a[f5a][0], f19a[f5a][1]);
            f11a.m147a(f55k * 50.0f, 1.0f, 0.0f, 0.0f);
            f11a.m154b(f19a[f5a][3], 1.0f, 1.0f);
            C0002c.m31a(f24b, f11a);
            f11a.m151a(RunnableC0008i.f298b);
            f11a.m146a(0.0f, f19a[f5a][0], f19a[f5a][2]);
            f11a.m147a(f55k * 50.0f, 1.0f, 0.0f, 0.0f);
            f11a.m154b(f19a[f5a][4], 1.0f, 1.0f);
            C0002c.m31a(f24b, f11a);
        }
        if (C0013n.f546i) {
            if (C0013n.f531f == 1 && C0004e.f138b && f40d) {
                RunnableC0008i.f298b.m144a();
                RunnableC0008i.f298b.m146a(0.0f, 0.0f, f55k);
                RunnableC0008i.f298b.m159d(C0004e.f129a);
                RunnableC0008i.f298b.m147a(2.0f * C0004e.f139c, 0.0f, 0.0f, 1.0f);
                C0002c.m31a(C0004e.f137b, RunnableC0008i.f298b);
            } else if (C0013n.f516d == 2 && C0013n.f531f == 2 && f40d) {
                if (C0011l.m188a(C0004e.f143f, (C0004e.f144g - f55k) + 2.4f, 0.0f, 0.0f, 1.0f, 0.0f)) {
                    f2 = -2.4f;
                    C0004e.f137b.m62a(0, C0004e.f127a);
                    z = true;
                    f = 0.0f;
                } else if (C0011l.m188a(C0004e.f143f, (C0004e.f144g - f55k) - 2.4f, 0.0f, 0.0f, 1.0f, 0.0f)) {
                    z = false;
                    f = 0.0f;
                    f2 = 2.4f;
                } else {
                    C0004e.f137b.m62a(0, C0004e.f136b);
                    f = 0.1f;
                    z = true;
                    f2 = 2.4f;
                }
                if (z) {
                    float f3 = f19a[f5a][3] - 0.3f;
                    RunnableC0008i.f298b.m144a();
                    RunnableC0008i.f298b.m146a(f3, f, f55k + f2);
                    RunnableC0008i.f298b.m159d(C0004e.f129a);
                    C0002c.m31a(C0004e.f137b, RunnableC0008i.f298b);
                    RunnableC0008i.f298b.m144a();
                    RunnableC0008i.f298b.m146a(-f3, f, f2 + f55k);
                    RunnableC0008i.f298b.m159d(C0004e.f129a);
                    C0002c.m31a(C0004e.f137b, RunnableC0008i.f298b);
                }
            }
            if (C0004e.f130a && C0013n.f531f == 1) {
                RunnableC0008i.f298b.m151a(C0004e.f129a);
                RunnableC0008i.f298b.m146a(0.0f, 0.0f, -1.0f);
                C0002c.m31a(C0004e.f128a, RunnableC0008i.f298b);
            }
            if (C0013n.f516d == 1 && C0013n.f531f == 2) {
                RunnableC0008i.f298b.m151a(C0004e.f129a);
                RunnableC0008i.f298b.m146a(0.0f, 0.0f, -1.0f);
                C0002c.m31a(C0004e.f140c, RunnableC0008i.f298b);
            }
        }
        C0002c.m32b();
        if (f22b > 0 && f22b < 500) {
            RunnableC0008i.m115a((byte) 11);
        }
        graphics.drawImage(f10a, 0, 0, 0);
        C0006g.m69a(f17a[f5a]);
        C0006g.m79a(graphics, 6, 0, 1, 1, 0);
        if (f25b) {
            C0006g.m70a(RunnableC0008i.f293a[21]);
            C0006g.m86b(' ');
            C0006g.m86b(f15a[f34c[f5a]]);
            C0006g.m79a(graphics, 6, 12, 1, 0, 0);
        } else {
            C0006g.m67a('(');
            C0006g.m86b(f15a[f34c[f5a]]);
            C0006g.m88b(") ");
            C0006g.m87b(f18a[f5a] * 1000);
            C0006g.m86b('$');
            C0006g.m79a(graphics, 6, 12, 1, 0, 0);
        }
        graphics.setColor(-65536);
        graphics.fillRect(147, 5, (int) (((C0007h.f259j - 25.0f) * 87.0f) / 40.0f), 3);
        graphics.fillRect(147, 12, (int) (((C0007h.f247f - 0.5f) * 87.0f) / 1.8f), 3);
        graphics.fillRect(147, 19, (int) (((C0007h.f250g - 0.7f) * 87.0f) / 1.5999999f), 3);
        graphics.fillRect(147, 26, (int) (((C0007h.f261l - 0.1f) * 87.0f) / 0.21000001f), 3);
        if (!f33c) {
            C0006g.m70a(RunnableC0008i.f293a[62]);
            C0006g.m79a(graphics, 160, (240 - C0006g.f171b[0]) / 2, 0, 0, 1);
        }
        if (!f40d) {
            C0006g.m70a(RunnableC0008i.f293a[86]);
            C0006g.m79a(graphics, 160, (240 - C0006g.f171b[1]) / 2, 1, 0, 1);
        }
        if (f36d == 0) {
            graphics.drawRegion(RunnableC0008i.f287a, 0, 35, 320, 110, 0, 0, 35, 0);
            C0006g.m70a(RunnableC0008i.f293a[63]);
            C0006g.m86b(':');
            C0006g.m79a(graphics, 78 - C0006g.m65a(1), 39, 1, 1, 0);
            C0006g.m68a(C0009j.f354a * 1000);
            C0006g.m86b('$');
            C0006g.m79a(graphics, 84, 39, 1, 1, 0);
            C0006g.m70a(RunnableC0008i.f293a[64]);
            C0006g.m86b(':');
            C0006g.m79a(graphics, 78 - C0006g.m65a(1), 56, 1, f20b == 0 ? 1 : 0, 0);
            int i = 0;
            while (i < 5) {
                int i2 = i < C0009j.f390e[6] ? 15 : 14;
                if (f20b == 0 && i == C0009j.f390e[6]) {
                    i2 = 16;
                }
                C0011l.m183a(graphics, i2, ((i * 39) / 2) + 84, 59, 20);
                i++;
            }
            C0006g.m70a(RunnableC0008i.f293a[65]);
            C0006g.m86b(':');
            if (78 - C0006g.m65a(1) < 0) {
                C0006g.f163a = true;
            }
            C0006g.m79a(graphics, 78, 73, 1, f20b == 1 ? 1 : 0, 2);
            int i3 = 0;
            while (i3 < 5) {
                int i4 = i3 < C0009j.f390e[7] ? 15 : 14;
                if (f20b == 1 && i3 == C0009j.f390e[7]) {
                    i4 = 16;
                }
                C0011l.m183a(graphics, i4, ((i3 * 39) / 2) + 84, 76, 20);
                i3++;
            }
            C0006g.m70a(RunnableC0008i.f293a[66]);
            C0006g.m86b(':');
            C0006g.m79a(graphics, 78 - C0006g.m65a(1), 90, 1, f20b == 2 ? 1 : 0, 0);
            int i5 = 0;
            while (i5 < 5) {
                int i6 = i5 < C0009j.f390e[8] ? 15 : 14;
                if (f20b == 2 && i5 == C0009j.f390e[8]) {
                    i6 = 16;
                }
                C0011l.m183a(graphics, i6, ((i5 * 39) / 2) + 84, 93, 20);
                i5++;
            }
            C0006g.m70a(RunnableC0008i.f293a[67]);
            C0006g.m86b(':');
            C0006g.m79a(graphics, 78 - C0006g.m65a(1), 107, 1, f20b == 3 ? 1 : 0, 0);
            int i7 = 0;
            while (i7 < 5) {
                int i8 = i7 < C0009j.f390e[9] ? 15 : 14;
                if (f20b == 3 && i7 == C0009j.f390e[9]) {
                    i8 = 16;
                }
                C0011l.m183a(graphics, i8, ((i7 * 39) / 2) + 84, 110, 20);
                i7++;
            }
            if (f12a != -1) {
                C0006g.m68a(f12a * 1000);
                C0006g.m86b('$');
                if (C0006g.m65a(1) + 182 > 320) {
                    C0006g.m79a(graphics, 320, 78, 1, f12a <= C0009j.f354a ? 1 : 0, 2);
                } else {
                    C0006g.m79a(graphics, 182, 78, 1, f12a <= C0009j.f354a ? 1 : 0, 0);
                }
            }
        } else if (!f25b && !f13a && f40d) {
            graphics.drawRegion(RunnableC0008i.f287a, 0, 35, 320, 38, 0, 0, 35, 0);
            C0006g.m70a(RunnableC0008i.f293a[43]);
            C0006g.m86b(' ');
            C0006g.m87b(C0009j.f354a * 1000);
            C0006g.m86b('$');
            C0006g.m79a(graphics, 160, 33, 1, f18a[f5a] <= C0009j.f354a ? 1 : 0, 1);
            C0006g.m70a(RunnableC0008i.f293a[87]);
            C0006g.m86b(' ');
            C0006g.m87b(f18a[f5a] * 1000);
            C0006g.m86b('$');
            C0006g.m79a(graphics, 160, C0006g.f171b[1] + 33, 1, f18a[f5a] <= C0009j.f354a ? 1 : 0, 1);
        }
        if (f28c != 0) {
            if (!f25b && f40d && f13a) {
                graphics.setColor(-13421773);
                graphics.fillRect(0, 137, 88, 103);
                graphics.setColor(-11184811);
                graphics.fillRect(1, 240 - (f28c * 20), 85, 20);
                C0006g.m70a(RunnableC0008i.f293a[68]);
                C0006g.m79a(graphics, 7, 140, 0, 0, 0);
                C0006g.m70a(RunnableC0008i.f293a[69]);
                C0006g.m79a(graphics, 7, 160, 0, 0, 0);
                C0006g.m70a(RunnableC0008i.f293a[70]);
                C0006g.m79a(graphics, 7, 180, 0, 0, 0);
                C0006g.m70a(RunnableC0008i.f293a[71]);
                C0006g.m79a(graphics, 7, 200, 0, 0, 0);
                C0006g.m70a(RunnableC0008i.f293a[72]);
                C0006g.m79a(graphics, 7, 220, 0, 0, 0);
            } else {
                graphics.setColor(-13421773);
                graphics.fillRect(0, 157, 88, 83);
                graphics.setColor(-11184811);
                graphics.fillRect(1, 240 - (f28c * 20), 85, 20);
                C0006g.m70a(RunnableC0008i.f293a[68]);
                C0006g.m79a(graphics, 7, 160, 0, 0, 0);
                C0006g.m70a(RunnableC0008i.f293a[69]);
                C0006g.m79a(graphics, 7, 180, 0, 0, 0);
                C0006g.m70a(RunnableC0008i.f293a[70]);
                C0006g.m79a(graphics, 7, 200, 0, 0, 0);
                C0006g.m70a(RunnableC0008i.f293a[71]);
                C0006g.m79a(graphics, 7, 220, 0, 0, 0);
            }
            C0011l.m183a(graphics, 0, 305, 225, 3);
            return;
        }
        if (f36d == 4) {
            C0011l.m183a(graphics, 5, 160, 201, 3);
            if (f25b || f13a || !f40d) {
                C0011l.m183a(graphics, 4, 160, 52, 3);
            } else {
                C0011l.m183a(graphics, 4, 160, 78, 3);
            }
        }
        if (f36d != 0) {
            C0011l.m183a(graphics, 2, 15, 120, 3);
            C0011l.m183a(graphics, 3, 305, 120, 3);
            if (f13a || ((f25b && f40d) || (!f13a && f40d && f18a[f5a] <= C0009j.f354a))) {
                C0011l.m183a(graphics, 1, 160, 225, 3);
            }
        } else {
            C0011l.m183a(graphics, 4, 201, 45, 3);
            C0011l.m183a(graphics, 5, 201, 117, 3);
            if (f12a != -1 && f12a <= C0009j.f354a) {
                C0011l.m183a(graphics, 22, 160, 225, 3);
            }
        }
        C0011l.m183a(graphics, 0, 305, 225, 3);
        if (f30c < 20000) {
            int i9 = f30c + RunnableC0008i.f296b;
            f30c = i9;
            int i10 = i9 % 1000;
            if (i10 > 500) {
                i10 = 1000 - i10;
            }
            C0011l.m183a(graphics, 4, 15, 225 - ((i10 * 13) / 1000), 3);
        } else {
            C0011l.m183a(graphics, 4, 15, 225, 3);
        }
        byte b = C0009j.f398g[(f5a * 7) + 2 + 5];
        if (f38d > 0) {
            int[] iArr = {f35c[b], 180, 360, 360};
            for (int i11 = 0; i11 < 5; i11++) {
                int length = (b + i11) - 2;
                if (length < 0) {
                    length += f35c.length;
                } else if (length >= f35c.length) {
                    length -= f35c.length;
                }
                iArr[0] = f35c[length];
                if (iArr[0] == -1) {
                    iArr[1] = 180;
                    iArr[2] = 1;
                } else if (iArr[0] == -2) {
                    iArr[1] = 0;
                    iArr[2] = 1;
                } else if (iArr[0] == -3) {
                    iArr[1] = 360;
                    iArr[2] = 1;
                } else {
                    iArr[1] = 180;
                    iArr[2] = 360;
                }
                int iAbs = 325 / ((Math.abs(i11 - 2) + 2) * 5);
                graphics.setColor(-16777216);
                graphics.fillRect(((160 - (iAbs / 2)) + ((((i11 - 2) * 25) * 13) / 10)) - 1, (120 - (iAbs / 2)) - 1, iAbs + 2, iAbs + 2);
                graphics.setColor(C0011l.m170a(iArr));
                graphics.fillRect((160 - (iAbs / 2)) + ((((i11 - 2) * 25) * 13) / 10), 120 - (iAbs / 2), iAbs, iAbs);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    static void m7a(boolean z) throws Throwable {
        Throwable th;
        InputStream inputStreamM172a;
        InputStream inputStream = null;
        f13a = f5a == C0009j.f390e[0];
        if (C0009j.f398g[(f5a * 7) + 2] == 1) {
            C0009j.f390e[6] = C0009j.f398g[(f5a * 7) + 2 + 1];
            C0009j.f390e[7] = C0009j.f398g[(f5a * 7) + 2 + 2];
            C0009j.f390e[8] = C0009j.f398g[(f5a * 7) + 2 + 3];
            C0009j.f390e[9] = C0009j.f398g[(f5a * 7) + 2 + 4];
            f13a = true;
        }
        f40d = f34c[f5a] <= C0009j.f390e[10];
        if (f9a != null) {
            f9a.m63a(false);
        }
        f9a = null;
        C0013n.f479a = true;
        f9a = new C0005f(new StringBuffer().append("/cars/").append(f17a[f5a]).append("/c.apt").toString(), 20, 0);
        f55k = 14.0f;
        if (f40d || C0013n.f493b != 0) {
            m13c(true);
            m12c();
        } else {
            f16a = null;
            f53i = null;
            f9a.m62a(0, new C0003d((byte) 99, (short) 228, "/blank.cc", false));
        }
        try {
            inputStreamM172a = C0011l.m172a(new StringBuffer().append("/cars/").append(f17a[f5a]).append("/k.cc").toString());
            try {
                try {
                    f45f = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read())) / 1000.0f;
                    f21b = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read())) / 1000.0f;
                    f29c = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read())) / 1000.0f;
                    f37d = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read())) / 1000.0f;
                    C0007h.f256i = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read())) / 1000.0f;
                    f6a = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read()));
                    C0007h.f260k = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read())) / 1000.0f;
                    f42e = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read())) / 1000.0f;
                    C0007h.f262m = C0011l.m177a((int) ((byte) inputStreamM172a.read()), (int) ((byte) inputStreamM172a.read()));
                    if (inputStreamM172a != null) {
                        try {
                            inputStreamM172a.close();
                        } catch (Exception e) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamM172a;
                    if (inputStream != null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Exception e2) {
                        throw th;
                    }
                }
            } catch (Exception e3) {
                RunnableC0008i.m127b(true, new StringBuffer().append("g2").append(f17a[f5a]).toString());
                if (inputStreamM172a != null) {
                    try {
                        inputStreamM172a.close();
                    } catch (Exception e4) {
                    }
                }
            }
        } catch (Exception e5) {
            inputStreamM172a = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                throw th;
            }
            inputStream.close();
            throw th;
        }
        m11b(z);
    }

    /* JADX INFO: renamed from: a */
    static void m8a(boolean z, int i) {
        f10a = null;
        f16a = null;
        f11a = null;
        if (f43e != null) {
            f43e.m63a(false);
        }
        f43e = null;
        if (f46f != null) {
            f46f.m63a(false);
        }
        f46f = null;
        f27b = null;
        f53i = null;
        if (z) {
            C0013n.f484a = null;
            if (f8a != null) {
                f8a.m48a();
            }
            f8a = null;
            if (f23b != null) {
                f23b.m48a();
            }
            f23b = null;
            if (f39d != null) {
                f39d.m63a(true);
            }
            f39d = null;
            if (f32c != null) {
                f32c.m63a(true);
            }
            f32c = null;
            f26b = null;
        }
        if (i == 1) {
            if (!f25b) {
                if (f13a) {
                    C0009j.f390e[0] = f5a;
                }
                C0009j.f390e[3] = C0011l.m161a(C0009j.f354a, 0);
                C0009j.f390e[4] = C0011l.m161a(C0009j.f354a, 1);
                C0011l.m203b();
                C0011l.m185a(C0009j.f398g, 10);
                C0011l.m185a(C0009j.f390e, 3);
                C0009j.f384d[20] = (byte) C0014o.f569a;
                C0009j.f384d[19] = (byte) (C0014o.f569a >>> 8);
                C0009j.f384d[18] = (byte) (C0014o.f569a >>> 16);
                C0009j.f384d[17] = (byte) (C0014o.f569a >>> 24);
                C0011l.m185a(C0009j.f384d, 1);
                C0011l.m211c();
            } else if (f40d) {
                C0009j.f384d[10] = f5a;
                C0011l.m203b();
                C0011l.m185a(C0009j.f398g, 10);
                C0009j.f384d[20] = (byte) C0014o.f569a;
                C0009j.f384d[19] = (byte) (C0014o.f569a >>> 8);
                C0009j.f384d[18] = (byte) (C0014o.f569a >>> 16);
                C0009j.f384d[17] = (byte) (C0014o.f569a >>> 24);
                C0011l.m185a(C0009j.f384d, 1);
                C0011l.m211c();
            }
        } else if (i == 2) {
            if (f25b) {
                C0009j.f384d[10] = f5a;
            }
            if (C0009j.f384d[14] == 0) {
                C0009j.f384d[1] = 0;
            }
            C0011l.m203b();
            C0011l.m185a(C0009j.f398g, 10);
            C0011l.m185a(C0009j.f401h, 7);
            C0011l.m185a(C0009j.f407j, 22);
            C0009j.f384d[20] = (byte) C0014o.f569a;
            C0009j.f384d[19] = (byte) (C0014o.f569a >>> 8);
            C0009j.f384d[18] = (byte) (C0014o.f569a >>> 16);
            C0009j.f384d[17] = (byte) (C0014o.f569a >>> 24);
            C0011l.m185a(C0009j.f384d, 1);
            C0011l.m211c();
        }
        C0011l.m214e();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private static byte[] m9a(String str) throws Throwable {
        Throwable th;
        InputStream inputStreamM172a;
        InputStream inputStream;
        byte[] bArr = new byte[2048];
        int i = 0;
        try {
            inputStreamM172a = C0011l.m172a(new StringBuffer().append("/cars/").append(str).append("/map.map").toString());
            while (true) {
                try {
                    int i2 = inputStreamM172a.read();
                    if (i2 == -1) {
                        break;
                    }
                    bArr[i] = (byte) i2;
                    i++;
                } catch (Exception e) {
                    inputStream = inputStreamM172a;
                    try {
                        RunnableC0008i.m127b(true, new StringBuffer().append("g1").append(str).toString());
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e2) {
                                return null;
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamM172a = inputStream;
                        if (inputStreamM172a != null) {
                            throw th;
                        }
                        try {
                            inputStreamM172a.close();
                            throw th;
                        } catch (Exception e3) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (inputStreamM172a != null) {
                        throw th;
                    }
                    inputStreamM172a.close();
                    throw th;
                }
            }
            if (inputStreamM172a == null) {
                return bArr;
            }
            try {
                inputStreamM172a.close();
                return bArr;
            } catch (Exception e4) {
                return bArr;
            }
        } catch (Exception e5) {
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamM172a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    static void m10b() {
        C0005f c0005f = new C0005f("/p.apt", 0, 0);
        f39d = c0005f;
        c0005f.m62a(0, new C0003d((byte) 99, (short) 228, new StringBuffer().append("/w").append((int) C0013n.f516d).append("/bg").append((int) C0013n.f531f).append(".cc").toString(), false));
        f8a = new C0003d((byte) 99, (short) 228, new StringBuffer().append("/w").append((int) C0013n.f516d).append("/r").append((int) C0013n.f531f).append(".cc").toString(), false);
        f23b = new C0003d((byte) 100, (short) 228, new StringBuffer().append("/w").append((int) C0013n.f516d).append("/tr").append((int) C0013n.f531f).append(".cc").toString(), true);
        if (C0013n.f559m) {
            byte[] bArr = {-17, -9, -40, -17, -9, 40, 17, -9, -40, 17, -9, 40, 40, -9, -16, 40, -9, 63, -17, -9, 40, 6, -9, 63, 17, -9, 40, 40, -9, 63};
            f26b = bArr;
            C0005f c0005fM217a = C0012m.m217a(bArr);
            f32c = c0005fM217a;
            c0005fM217a.m62a(0, new C0003d((byte) 100, (short) 228, "/sh.cc", false));
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m11b(boolean z) {
        if (!z) {
            C0007h.f259j = f6a;
            C0007h.f247f = f21b;
            C0007h.f250g = f29c;
            C0007h.f253h = f37d;
            C0007h.f261l = f42e;
            C0007h.f242e = f45f;
            return;
        }
        float f = f6a * ((((C0009j.f398g[((f5a * 7) + 2) + 1] - 2.5f) * 0.2f) / 5.0f) + 1.0f);
        C0007h.f259j = f;
        if (f < 25.0f) {
            C0007h.f259j = 25.0f;
        } else if (C0007h.f259j > 65.0f) {
            C0007h.f259j = 65.0f;
        }
        float f2 = f21b * ((((C0009j.f398g[((f5a * 7) + 2) + 2] - 2.5f) * 0.2f) / 5.0f) + 1.0f);
        C0007h.f247f = f2;
        if (f2 < 0.5f) {
            C0007h.f247f = 0.5f;
        } else if (C0007h.f247f > 2.3f) {
            C0007h.f247f = 2.3f;
        }
        C0007h.f242e = f45f * (1.0f - ((0.15f * (C0009j.f398g[((f5a * 7) + 2) + 2] - 2.5f)) / 5.0f));
        float f3 = f29c * ((((C0009j.f398g[((f5a * 7) + 2) + 3] - 2.5f) * 0.2f) / 5.0f) + 1.0f);
        C0007h.f250g = f3;
        if (f3 < 0.7f) {
            C0007h.f250g = 0.7f;
        } else if (C0007h.f250g > 2.3f) {
            C0007h.f250g = 2.3f;
        }
        C0007h.f253h = f37d * ((((C0009j.f398g[((f5a * 7) + 2) + 3] - 2.5f) * 0.2f) / 5.0f) + 1.0f);
        float f4 = f42e * ((((C0009j.f398g[((f5a * 7) + 2) + 4] - 2.5f) * 0.2f) / 5.0f) + 1.0f);
        C0007h.f261l = f4;
        if (f4 < 0.1f) {
            C0007h.f261l = 0.1f;
        } else if (C0007h.f261l > 0.31f) {
            C0007h.f261l = 0.31f;
        }
    }

    /* JADX INFO: renamed from: c */
    static void m12c() {
        byte b;
        byte b2;
        byte b3 = C0009j.f398g[(f5a * 7) + 2 + 5];
        byte b4 = C0009j.f398g[(f5a * 7) + 2 + 6];
        if (b4 > C0009j.f390e[11]) {
            b4 = C0009j.f390e[11];
        }
        if (f25b || C0013n.f493b == 0) {
            b = b4;
            b2 = b3;
        } else {
            byte b5 = (byte) (C0013n.f493b >> 8);
            b = (byte) C0013n.f493b;
            b2 = b5;
        }
        f31c.m49a(f16a, f35c[b2], f53i, f27b, b, b >= 0 ? f47f[b] : (byte) -1, f49g[f5a], f51h[f5a]);
        f9a.m62a(0, f31c);
    }

    /* JADX INFO: renamed from: c */
    private static void m13c(boolean z) {
        if (f27b == null) {
            f27b = C0011l.m194a("/de.cc");
        }
        if (z || f53i == null) {
            f53i = m9a(f17a[f5a]);
        }
        if (z || f16a == null) {
            f16a = C0011l.m194a(new StringBuffer().append("/cars/").append(f17a[f5a]).append("/txt.cc").toString());
        }
    }

    /* JADX INFO: renamed from: d */
    static void m14d() {
        if (C0001b.f56a > 0) {
            if (C0009j.f405j > 1 || (C0009j.f405j == 1 && RunnableC0008i.f329j == 0)) {
                int i = C0001b.f56a - RunnableC0008i.f296b;
                C0001b.f56a = i;
                if (i < 1) {
                    C0001b.f56a = 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    static void m15e() {
        if (f28c != 0) {
            if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                f28c = (byte) (f28c + 1);
                RunnableC0008i.f292a[RunnableC0008i.f317f] = false;
            } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                f28c = (byte) (f28c - 1);
                RunnableC0008i.f292a[RunnableC0008i.f321g] = false;
            }
            if (f28c < 1) {
                f28c = (byte) ((!f25b && f40d && f13a) ? 5 : 4);
            } else {
                if (f28c > ((!f25b && f40d && f13a) ? (byte) 5 : (byte) 4)) {
                    f28c = (byte) 1;
                }
            }
            if (RunnableC0008i.f292a[10] || RunnableC0008i.f292a[9]) {
                if (!f25b && f40d && f13a) {
                    f36d = (byte) (f28c - 1);
                } else {
                    f36d = f28c;
                }
                f28c = (byte) 0;
                RunnableC0008i.f292a[10] = false;
                RunnableC0008i.f292a[9] = false;
            }
            if (RunnableC0008i.f292a[11]) {
                f28c = (byte) 0;
                RunnableC0008i.f292a[11] = false;
            }
        } else {
            if (f36d == 4) {
                if (RunnableC0008i.f292a[RunnableC0008i.f324h]) {
                    f52i -= RunnableC0008i.f277a;
                } else if (RunnableC0008i.f292a[RunnableC0008i.f327i]) {
                    f52i += RunnableC0008i.f277a;
                }
                if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                    f54j -= RunnableC0008i.f277a * 3.0f;
                } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                    f54j += RunnableC0008i.f277a * 3.0f;
                }
            } else if (f36d == 0) {
                f52i += RunnableC0008i.f277a * 0.1f;
            }
            if (C0009j.m139a()) {
                RunnableC0008i.m115a((byte) 98);
            }
            if (f33c) {
                if (f40d) {
                    if (!f25b && RunnableC0008i.f292a[6] && f13a) {
                        f36d = f36d == 0 ? (byte) 4 : (byte) 0;
                        RunnableC0008i.f292a[6] = false;
                        f38d = 0;
                    }
                    if (f36d == 0) {
                        if (RunnableC0008i.f292a[RunnableC0008i.f317f]) {
                            byte b = (byte) (f20b - 1);
                            f20b = b;
                            if (b < 0) {
                                f20b = (byte) 3;
                            }
                            RunnableC0008i.f292a[RunnableC0008i.f317f] = false;
                        } else if (RunnableC0008i.f292a[RunnableC0008i.f321g]) {
                            byte b2 = (byte) (f20b + 1);
                            f20b = b2;
                            if (b2 > 3) {
                                f20b = (byte) 0;
                            }
                            RunnableC0008i.f292a[RunnableC0008i.f321g] = false;
                        }
                        if (f34c[f5a] == 0) {
                            f12a = (short) ((f18a[f5a] * (1.0f + (C0009j.f390e[f20b + 6] / 5.0f))) / f41d[f20b]);
                        } else if (f34c[f5a] == 1) {
                            f12a = (short) ((f18a[f5a] * (1.0f + (C0009j.f390e[f20b + 6] / 5.0f))) / (f41d[f20b] * 3));
                        } else {
                            f12a = (short) ((f18a[f5a] * (1.0f + (C0009j.f390e[f20b + 6] / 5.0f))) / (f41d[f20b] * 5));
                        }
                        if (C0009j.f390e[f20b + 6] >= 5) {
                            f12a = (short) -1;
                        }
                        if (RunnableC0008i.f292a[9]) {
                            if (C0009j.f390e[f20b + 6] < 5 && f12a != -1 && f12a <= C0009j.f354a) {
                                C0009j.f354a = (short) (C0009j.f354a - f12a);
                                byte[] bArr = C0009j.f390e;
                                int i = f20b + 6;
                                bArr[i] = (byte) (bArr[i] + 1);
                                C0009j.f398g[(f5a * 7) + 2 + 1] = C0009j.f390e[6];
                                C0009j.f398g[(f5a * 7) + 2 + 2] = C0009j.f390e[7];
                                C0009j.f398g[(f5a * 7) + 2 + 3] = C0009j.f390e[8];
                                C0009j.f398g[(f5a * 7) + 2 + 4] = C0009j.f390e[9];
                                m11b(true);
                            }
                            RunnableC0008i.f292a[9] = false;
                        }
                        if (RunnableC0008i.f292a[11]) {
                            f36d = (byte) 4;
                            RunnableC0008i.f292a[11] = false;
                        }
                    } else {
                        if (RunnableC0008i.f292a[4] || RunnableC0008i.f292a[13] || (f36d == 2 && (RunnableC0008i.f292a[RunnableC0008i.f324h] || RunnableC0008i.f292a[RunnableC0008i.f327i]))) {
                            byte[] bArr2 = C0009j.f398g;
                            int i2 = (f5a * 7) + 2 + 5;
                            bArr2[i2] = (byte) (((RunnableC0008i.f292a[RunnableC0008i.f327i] || RunnableC0008i.f292a[13]) ? (byte) 1 : (byte) -1) + bArr2[i2]);
                            if (C0009j.f398g[(f5a * 7) + 2 + 5] < 0) {
                                byte[] bArr3 = C0009j.f398g;
                                int i3 = (f5a * 7) + 2 + 5;
                                bArr3[i3] = (byte) (bArr3[i3] + f35c.length);
                            } else if (C0009j.f398g[(f5a * 7) + 2 + 5] >= f35c.length) {
                                byte[] bArr4 = C0009j.f398g;
                                int i4 = (f5a * 7) + 2 + 5;
                                bArr4[i4] = (byte) (bArr4[i4] - f35c.length);
                            }
                            f38d = 250;
                            RunnableC0008i.f292a[4] = false;
                            RunnableC0008i.f292a[13] = false;
                            if (f36d == 2) {
                                RunnableC0008i.f292a[RunnableC0008i.f324h] = false;
                                RunnableC0008i.f292a[RunnableC0008i.f327i] = false;
                            }
                        }
                        if (f38d > 0) {
                            if (RunnableC0008i.f292a[11]) {
                                f38d = 0;
                                RunnableC0008i.f292a[11] = false;
                            } else {
                                int i5 = (int) (f38d - (RunnableC0008i.f277a * 100.0f));
                                f38d = i5;
                                if (i5 <= 0 || RunnableC0008i.f292a[9]) {
                                    RunnableC0008i.f292a[9] = false;
                                    f33c = false;
                                    RunnableC0008i.m116a((byte) 9, false);
                                    f38d = 0;
                                }
                            }
                        }
                        if (RunnableC0008i.f292a[5] || RunnableC0008i.f292a[12] || (f36d == 3 && (RunnableC0008i.f292a[RunnableC0008i.f324h] || RunnableC0008i.f292a[RunnableC0008i.f327i]))) {
                            f33c = false;
                            f38d = 0;
                            if (RunnableC0008i.f292a[5] || RunnableC0008i.f292a[RunnableC0008i.f324h]) {
                                byte[] bArr5 = C0009j.f398g;
                                int i6 = (f5a * 7) + 2 + 6;
                                bArr5[i6] = (byte) (bArr5[i6] - 1);
                            } else {
                                byte[] bArr6 = C0009j.f398g;
                                int i7 = (f5a * 7) + 2 + 6;
                                bArr6[i7] = (byte) (bArr6[i7] + 1);
                            }
                            if (C0009j.f398g[(f5a * 7) + 2 + 6] > C0009j.f390e[11]) {
                                C0009j.f398g[(f5a * 7) + 2 + 6] = -1;
                            } else if (C0009j.f398g[(f5a * 7) + 2 + 6] < -1) {
                                C0009j.f398g[(f5a * 7) + 2 + 6] = C0009j.f390e[11];
                            }
                            RunnableC0008i.m116a((byte) 9, false);
                        }
                    }
                }
                if (f36d != 0) {
                    if ((f36d == 1 && RunnableC0008i.f292a[RunnableC0008i.f324h]) || RunnableC0008i.f292a[7]) {
                        f38d = 0;
                        RunnableC0008i.f292a[RunnableC0008i.f324h] = false;
                        RunnableC0008i.f292a[7] = false;
                        byte b3 = (byte) (f5a - 1);
                        f5a = b3;
                        if (b3 < 0) {
                            f5a = (byte) (f17a.length - 1);
                        }
                        RunnableC0008i.m116a((byte) 3, true);
                    } else if ((f36d == 1 && RunnableC0008i.f292a[RunnableC0008i.f327i]) || RunnableC0008i.f292a[8]) {
                        f38d = 0;
                        RunnableC0008i.f292a[RunnableC0008i.f327i] = false;
                        RunnableC0008i.f292a[8] = false;
                        byte b4 = (byte) (f5a + 1);
                        f5a = b4;
                        if (b4 >= f17a.length) {
                            f5a = (byte) 0;
                        }
                        RunnableC0008i.m116a((byte) 3, true);
                    }
                    if (RunnableC0008i.f309d == 0 && RunnableC0008i.f302c == 1) {
                        RunnableC0008i.m130e();
                        C0009j.f354a = (short) (C0009j.f354a - f18a[f5a]);
                        f13a = true;
                        C0009j.f390e[0] = f5a;
                        C0009j.f390e[6] = 0;
                        C0009j.f390e[7] = 0;
                        C0009j.f390e[8] = 0;
                        C0009j.f390e[9] = 0;
                        C0009j.f398g[(f5a * 7) + 2] = 1;
                        m11b(true);
                    }
                    if (RunnableC0008i.f292a[11] || (f13a && RunnableC0008i.f292a[9] && !f25b)) {
                        f38d = 0;
                        C0004e.m50a();
                        m8a(true, 1);
                        RunnableC0008i.f329j = (byte) 1;
                        RunnableC0008i.m115a((byte) 1);
                        RunnableC0008i.m126b();
                        return;
                    }
                    if (RunnableC0008i.f292a[9]) {
                        if (f25b) {
                            if (f40d) {
                                f38d = 0;
                                RunnableC0008i.m115a((byte) 9);
                                RunnableC0008i.m126b();
                            }
                        } else if (!f13a && f40d && f18a[f5a] <= C0009j.f354a) {
                            RunnableC0008i.m120a(0, RunnableC0008i.f293a[88], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                        }
                    }
                }
            }
        }
        if (RunnableC0008i.f292a[10]) {
            if (!f25b && f40d && f13a) {
                f28c = (byte) (f36d + 1);
            } else {
                f28c = f36d;
            }
            f30c = 999999;
            RunnableC0008i.f292a[10] = false;
        }
        if (f52i > 3.0f) {
            f52i = 3.0f;
        } else if (f52i < -3.0f) {
            f52i = -3.0f;
        }
        f48g += f52i * RunnableC0008i.f277a;
        float f = f50h + (f54j * RunnableC0008i.f277a);
        f50h = f;
        if (f > 9.0f) {
            f50h = 9.0f;
            f54j = 0.0f;
        } else if (f50h < 5.0f) {
            f50h = 5.0f;
            f54j = 0.0f;
        }
        f52i = C0011l.m208c(f52i - ((f52i * RunnableC0008i.f277a) * 0.1f));
        f54j = C0011l.m208c(f54j - (f54j * RunnableC0008i.f277a));
        C0004e.f143f = ((float) Math.sin(f48g)) * f50h;
        C0004e.f142e = (f50h / 1.6f) - 2.0f;
        C0004e.f144g = ((float) Math.cos(f48g)) * f50h;
        C0004e.f129a.m148a(C0004e.f143f, C0004e.f142e, C0004e.f144g, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        C0004e.m57e();
        RunnableC0008i.f298b.m144a();
        if (f55k != 0.0f) {
            f55k = C0011l.m208c(f55k - ((f55k * RunnableC0008i.f277a) * 2.0f));
            RunnableC0008i.f298b.m146a(0.0f, 0.0f, f55k);
        }
    }
}
