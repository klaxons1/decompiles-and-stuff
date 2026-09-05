package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public final class C0008i implements InterfaceC0002c {

    /* JADX INFO: renamed from: A */
    private static int f57A;

    /* JADX INFO: renamed from: B */
    private static int f58B;

    /* JADX INFO: renamed from: C */
    private static int f59C;

    /* JADX INFO: renamed from: G */
    private static int f63G;

    /* JADX INFO: renamed from: H */
    private static int f64H;

    /* JADX INFO: renamed from: I */
    private static int f65I;

    /* JADX INFO: renamed from: J */
    private static int f66J;

    /* JADX INFO: renamed from: K */
    private static int f67K;

    /* JADX INFO: renamed from: L */
    private static int f68L;

    /* JADX INFO: renamed from: M */
    private static int f69M;

    /* JADX INFO: renamed from: N */
    private static int f70N;

    /* JADX INFO: renamed from: O */
    private static int f71O;

    /* JADX INFO: renamed from: Q */
    private static final int f73Q;

    /* JADX INFO: renamed from: R */
    private static int f74R;

    /* JADX INFO: renamed from: S */
    private static int f75S;

    /* JADX INFO: renamed from: T */
    private static int f76T;

    /* JADX INFO: renamed from: U */
    private static int f77U;

    /* JADX INFO: renamed from: V */
    private static int f78V;

    /* JADX INFO: renamed from: W */
    private static int f79W;

    /* JADX INFO: renamed from: X */
    private static int f80X;

    /* JADX INFO: renamed from: Y */
    private static int f81Y;

    /* JADX INFO: renamed from: Z */
    private static int f82Z;

    /* JADX INFO: renamed from: a */
    private static byte f83a;

    /* JADX INFO: renamed from: a */
    public static int f84a;

    /* JADX INFO: renamed from: a */
    public static long f85a;

    /* JADX INFO: renamed from: a */
    private static C0006g f86a;

    /* JADX INFO: renamed from: a */
    private static short f87a;

    /* JADX INFO: renamed from: a */
    private static boolean f88a;

    /* JADX INFO: renamed from: a */
    private static byte[] f89a;

    /* JADX INFO: renamed from: a */
    private static C0006g[] f91a;

    /* JADX INFO: renamed from: a */
    private static C0006g[][] f94a;

    /* JADX INFO: renamed from: aa */
    private static int f95aa;

    /* JADX INFO: renamed from: ab */
    private static int f96ab;

    /* JADX INFO: renamed from: ac */
    private static int f97ac;

    /* JADX INFO: renamed from: ad */
    private static int f98ad;

    /* JADX INFO: renamed from: ae */
    private static int f99ae;

    /* JADX INFO: renamed from: af */
    private static int f100af;

    /* JADX INFO: renamed from: ag */
    private static int f101ag;

    /* JADX INFO: renamed from: ah */
    private static int f102ah;

    /* JADX INFO: renamed from: ai */
    private static int f103ai;

    /* JADX INFO: renamed from: aj */
    private static int f104aj;

    /* JADX INFO: renamed from: ak */
    private static int f105ak;

    /* JADX INFO: renamed from: al */
    private static int f106al;

    /* JADX INFO: renamed from: am */
    private static int f107am;

    /* JADX INFO: renamed from: an */
    private static int f108an;

    /* JADX INFO: renamed from: ao */
    private static int f109ao;

    /* JADX INFO: renamed from: b */
    private static byte f110b;

    /* JADX INFO: renamed from: b */
    private static long f112b;

    /* JADX INFO: renamed from: b */
    private static C0006g f113b;

    /* JADX INFO: renamed from: b */
    private static boolean f114b;

    /* JADX INFO: renamed from: b */
    private static byte[] f115b;

    /* JADX INFO: renamed from: b */
    private static C0006g[] f117b;

    /* JADX INFO: renamed from: b */
    private static short[] f118b;

    /* JADX INFO: renamed from: b */
    private static byte[][] f119b;

    /* JADX INFO: renamed from: b */
    private static C0006g[][] f121b;

    /* JADX INFO: renamed from: c */
    private static int f122c;

    /* JADX INFO: renamed from: c */
    private static long f123c;

    /* JADX INFO: renamed from: c */
    private static C0006g f124c;

    /* JADX INFO: renamed from: c */
    private static boolean f125c;

    /* JADX INFO: renamed from: c */
    private static byte[] f126c;

    /* JADX INFO: renamed from: c */
    private static final int[] f127c;

    /* JADX INFO: renamed from: c */
    private static C0006g[] f128c;

    /* JADX INFO: renamed from: c */
    private static final short[] f129c;

    /* JADX INFO: renamed from: c */
    private static C0006g[][] f130c;

    /* JADX INFO: renamed from: d */
    private static int f131d;

    /* JADX INFO: renamed from: d */
    private static long f132d;

    /* JADX INFO: renamed from: d */
    private static C0006g f133d;

    /* JADX INFO: renamed from: d */
    private static boolean f134d;

    /* JADX INFO: renamed from: d */
    private static final short[] f137d;

    /* JADX INFO: renamed from: d */
    private static C0006g[][] f138d;

    /* JADX INFO: renamed from: e */
    private static int f139e;

    /* JADX INFO: renamed from: e */
    private static C0006g f140e;

    /* JADX INFO: renamed from: e */
    private static boolean f141e;

    /* JADX INFO: renamed from: e */
    private static byte[] f142e;

    /* JADX INFO: renamed from: e */
    private static short[] f144e;

    /* JADX INFO: renamed from: e */
    private static C0006g[][] f145e;

    /* JADX INFO: renamed from: f */
    private static int f146f;

    /* JADX INFO: renamed from: f */
    private static C0006g f147f;

    /* JADX INFO: renamed from: f */
    private static boolean f148f;

    /* JADX INFO: renamed from: f */
    private static byte[] f149f;

    /* JADX INFO: renamed from: g */
    private static int f151g;

    /* JADX INFO: renamed from: g */
    private static C0006g f152g;

    /* JADX INFO: renamed from: g */
    private static boolean f153g;

    /* JADX INFO: renamed from: g */
    private static byte[] f154g;

    /* JADX INFO: renamed from: g */
    private static int[] f155g;

    /* JADX INFO: renamed from: h */
    private static int f156h;

    /* JADX INFO: renamed from: h */
    private static C0006g f157h;

    /* JADX INFO: renamed from: h */
    private static boolean f158h;

    /* JADX INFO: renamed from: h */
    private static byte[] f159h;

    /* JADX INFO: renamed from: i */
    private static int f160i;

    /* JADX INFO: renamed from: i */
    private static C0006g f161i;

    /* JADX INFO: renamed from: i */
    private static boolean f162i;

    /* JADX INFO: renamed from: i */
    private static byte[] f163i;

    /* JADX INFO: renamed from: j */
    private static int f164j;

    /* JADX INFO: renamed from: j */
    private static C0006g f165j;

    /* JADX INFO: renamed from: j */
    private static boolean f166j;

    /* JADX INFO: renamed from: j */
    private static byte[] f167j;

    /* JADX INFO: renamed from: k */
    private static int f168k;

    /* JADX INFO: renamed from: k */
    private static C0006g f169k;

    /* JADX INFO: renamed from: k */
    private static boolean f170k;

    /* JADX INFO: renamed from: k */
    private static final byte[] f171k;

    /* JADX INFO: renamed from: l */
    private static int f172l;

    /* JADX INFO: renamed from: l */
    private static C0006g f173l;

    /* JADX INFO: renamed from: l */
    private static boolean f174l;

    /* JADX INFO: renamed from: l */
    private static final byte[] f175l;

    /* JADX INFO: renamed from: m */
    private static int f176m;

    /* JADX INFO: renamed from: m */
    private static C0006g f177m;

    /* JADX INFO: renamed from: m */
    private static boolean f178m;

    /* JADX INFO: renamed from: m */
    private static final byte[] f179m;

    /* JADX INFO: renamed from: n */
    private static int f180n;

    /* JADX INFO: renamed from: n */
    private static C0006g f181n;

    /* JADX INFO: renamed from: n */
    private static final int[] f182n;

    /* JADX INFO: renamed from: o */
    private static int f183o;

    /* JADX INFO: renamed from: o */
    private static C0006g f184o;

    /* JADX INFO: renamed from: o */
    private static final int[] f185o;

    /* JADX INFO: renamed from: p */
    private static int f186p;

    /* JADX INFO: renamed from: p */
    private static C0006g f187p;

    /* JADX INFO: renamed from: p */
    private static int[] f188p;

    /* JADX INFO: renamed from: q */
    private static int f189q;

    /* JADX INFO: renamed from: q */
    private static C0006g f190q;

    /* JADX INFO: renamed from: q */
    private static int[] f191q;

    /* JADX INFO: renamed from: r */
    private static int f192r;

    /* JADX INFO: renamed from: r */
    private static C0006g f193r;

    /* JADX INFO: renamed from: r */
    private static int[] f194r;

    /* JADX INFO: renamed from: s */
    private static int f195s;

    /* JADX INFO: renamed from: s */
    private static C0006g f196s;

    /* JADX INFO: renamed from: s */
    private static int[] f197s;

    /* JADX INFO: renamed from: t */
    private static int f198t;

    /* JADX INFO: renamed from: t */
    private static int[] f199t;

    /* JADX INFO: renamed from: u */
    private static int f200u;

    /* JADX INFO: renamed from: u */
    private static int[] f201u;

    /* JADX INFO: renamed from: v */
    private static int f202v;

    /* JADX INFO: renamed from: w */
    private static int f203w;

    /* JADX INFO: renamed from: x */
    private static int f204x;

    /* JADX INFO: renamed from: y */
    private static int f205y;

    /* JADX INFO: renamed from: z */
    private static int f206z;

    /* JADX INFO: renamed from: b */
    private static int f111b = 0;

    /* JADX INFO: renamed from: a */
    private static final int[][] f93a = {new int[]{2097341, 6324448}, new int[]{170, 4499968}};

    /* JADX INFO: renamed from: a */
    private static final int[] f90a = {25, 24, 24};

    /* JADX INFO: renamed from: d */
    private static final byte[] f135d = {2, 30, 2, 9, 2, 30, 1, 20, 1, 20, 1, 12};

    /* JADX INFO: renamed from: D */
    private static int f60D = 2048;

    /* JADX INFO: renamed from: E */
    private static int f61E = 12;

    /* JADX INFO: renamed from: F */
    private static int f62F = 1536;

    /* JADX INFO: renamed from: a */
    private static final short[] f92a = {0, 0, 338, -1, 22, -1, 350, 350, 10, 10};

    /* JADX INFO: renamed from: b */
    private static final int[] f116b = {0, 2, 4, 6, 4, 2, 0};

    /* JADX INFO: renamed from: P */
    private static int f72P = 0;

    /* JADX INFO: renamed from: b */
    private static final int[][] f120b = {new int[]{0, 1, 2, 3, 4, 5, 11}, new int[]{6, 7, 8, 9, 10}};

    /* JADX INFO: renamed from: d */
    private static final int[] f136d = {0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 4, 8, 0, 4, 6, 6, 6, 7, 7, 0, 4, 8};

    /* JADX INFO: renamed from: e */
    private static final int[] f143e = {0, 1, 2, 3, 4, 9, 3, 5, 7, 3, 6, 8, 8, 8, 7, 7, -1, -1, -1, -1, -1, -1, -1, 11, 10};

    /* JADX INFO: renamed from: f */
    private static final int[] f150f = {192, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, -1, -1, -1, -1, 32, 32, 128, 128};

    static {
        byte[] bArr = {0, 0, -14, -23, 14, 23, -14, 0, 14, 0};
        byte[] bArr2 = {-32, -32, -28, -23, -28, -23, -28, -32, -28, -32};
        int[] iArr = {65575, 65576, 65577, 65578, 65579, 65580, 65581, 65582, 65583, 65584, 65586, 65585};
        f127c = iArr;
        f73Q = iArr.length;
        for (int i = 0; i < InterfaceC0002c.f16a.length; i++) {
            byte[] bArr3 = InterfaceC0002c.f16a[i];
            for (int i2 = 0; i2 < bArr3.length; i2++) {
                InterfaceC0002c.f16a[i][i2] = (byte) ((InterfaceC0002c.f16a[i][i2] * 200) / 100);
            }
        }
        f182n = new int[]{3, 4, 4, 3};
        f185o = new int[]{3, 3, 3, 3};
        f171k = new byte[]{0, 1, 3, 4};
        f175l = new byte[]{1, 2, 3, 3, 2, 1};
        f179m = new byte[6];
        f201u = new int[128];
        f100af = -1;
        f101ag = -1;
        f102ah = -1;
        f103ai = 0;
        f107am = 1;
        int[] iArr2 = {2048, 128, 1};
        f129c = new short[]{60, 50, 85, 10, 90, 5, 120, 4, 180, 3, 240, 2, Short.MAX_VALUE, 1};
        f137d = new short[]{100, 200, 500, 1000};
        f84a = 0;
        f85a = 0L;
        f144e = new short[360];
        int i3 = 58368;
        int i4 = 0;
        for (int i5 = 0; i5 <= 90; i5++) {
            int i6 = i4 / 57;
            f144e[i5] = (short) i6;
            i3 -= i6;
            i4 += i3 / 57;
        }
        for (int i7 = 1; i7 <= 90; i7++) {
            f144e[i7 + 90] = f144e[90 - i7];
        }
        for (int i8 = 1; i8 < 180; i8++) {
            f144e[i8 + 180] = (short) (-f144e[i8]);
        }
        int[] iArr3 = {0, 175, 349, 523, 698, 872, 1045, 1219, 1392, 1564, 1736, 1908, 2079, 2249, 2419, 2588, 2756, 2924, 3090, 3256, 3420, 3584, 3746, 3907, 4067, 4226, 4384, 4540, 4695, 4848, 5000, 5150, 5299, 5446, 5592, 5736, 5878, 6018, 6156, 6293, 6428, 6560, 6691, 6820, 6946, 7071, 7193, 7313, 7431, 7547, 7660, 7771, 7880, 7986, 8090, 8191, 8290, 8387, 8480, 8572, 8660, 8746, 8829, 8910, 8988, 9063, 9135, 9205, 9272, 9336, 9397, 9455, 9510, 9563, 9613, 9659, 9703, 9744, 9781, 9816, 9848, 9877, 9903, 9925, 9945, 9962, 9976, 9986, 9994, 9998, 10000};
    }

    /* JADX INFO: renamed from: a */
    private static int m33a(int i) {
        if (i >= f142e.length) {
            return -1;
        }
        return i >= 0 ? f142e[i] : i;
    }

    /* JADX INFO: renamed from: a */
    private static int m34a(int i, int i2) {
        if (i < 0 || i2 < 0 || i2 >= f146f) {
            return -2;
        }
        if (i >= f139e) {
            return m34a(i - 2, i2);
        }
        int i3 = i >> 3;
        int i4 = i2 >> 3;
        int i5 = f126c[(f122c * i4) + i3] << 5;
        int i6 = i - (i3 << 3);
        int i7 = i6 & 1;
        byte b = f115b[(i6 >> 1) + i5 + ((i2 - (i4 << 3)) << 2)];
        if (b < 0 || (b << 1) + i7 >= f89a.length) {
            return -1;
        }
        byte b2 = f89a[(b << 1) + i7];
        if (b2 == 255) {
            b2 = -1;
        }
        if (b2 != 127) {
            return b2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private static int m35a(int i, int i2, int i3, int i4) {
        return m55b(i << 6, i2 << 6, i3 << 6, i4 << 6);
    }

    /* JADX INFO: renamed from: a */
    private static int m36a(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = i >> 6;
        int i7 = i2 >> 6;
        if (i5 == 0) {
            i7 = i4 == 0 ? i7 - 15 : i7 - 30;
        }
        int i8 = i6 >> 5;
        int i9 = i7 >> 5;
        int i10 = i6 - (i8 << 5);
        int i11 = i7 - (i9 << 5);
        int iM34a = m34a(i8, i9);
        int iM33a = m33a(iM34a);
        int i12 = -1;
        if (z && i5 == 1 && iM33a == -1) {
            if (i11 == 0) {
                int iM34a2 = m34a(i8, i9 - 1);
                int iM33a2 = m33a(iM34a2);
                if (iM33a2 < 0 || iM33a2 >= 10 || f149f[iM34a2] < 0) {
                    iM33a2 = iM33a;
                    iM34a2 = iM34a;
                } else {
                    i11 += 32;
                }
                iM33a = iM33a2;
                iM34a = iM34a2;
            } else {
                int iM34a3 = m34a(i8, i9 + 1);
                int iM33a3 = m33a(iM34a3);
                if (iM33a3 >= 0 && iM33a3 < 10 && f149f[iM34a3] <= 0) {
                    i11 -= 32;
                    iM33a = iM33a3;
                    iM34a = iM34a3;
                }
            }
        }
        if (iM33a != -2) {
            if (iM33a == -1) {
                int iM34a4 = m34a(i8 - i3, i9 - i4);
                boolean z2 = true;
                switch (f100af) {
                    case 0:
                        if (iM34a4 < 0 || iM34a4 == 30 || iM34a4 == 34) {
                            if (iM34a == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (iM34a4 == 12) {
                            z2 = iM34a != 2 && iM34a != 3;
                        }
                        break;
                    case 1:
                        z2 = iM34a4 >= 0 || m33a(iM34a) != 0;
                        break;
                }
                return !z2 ? 0 : -1;
            }
            if (iM33a >= 10) {
                return -1;
            }
            int i13 = InterfaceC0002c.f16a[iM33a][i10] + f149f[iM34a];
            if (!z) {
                if (f100af == 1) {
                    if (m33a(m34a(i8, i9 - 1)) != -1) {
                        return 0;
                    }
                    if (i4 < 0 && iM33a != -1) {
                        i12 = 0;
                    }
                }
                if (i5 != 1) {
                    return i12;
                }
                if (i11 <= i13 + 12 && f206z > 0) {
                    return 1;
                }
                if (f206z <= 0 && f100af != 1) {
                    return i12;
                }
            } else {
                if (f100af == 1 && m33a(m34a(i8, i9 - 1)) != -1) {
                    return 0;
                }
                if (i5 == 1) {
                    return i11 <= i13 + 12 ? 1 : 0;
                }
                if (i11 <= i13) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static int m37a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i + i3;
        int i6 = i2 + i4;
        int iM36a = -1;
        if (i4 >= 0 && (iM36a = m36a(i5, i6, i3, i4, 1, z)) == 0) {
            return 0;
        }
        if (i4 > 0 || m36a(i5, i6, i3, i4, 0, z) != 0) {
            return iM36a;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m38a() {
        f111b = 0;
        f102ah = -1;
    }

    /* JADX INFO: renamed from: a */
    private static void m39a(int i) throws IOException {
        new StringBuffer().append("*** loadZoneResources(").append(i).append(")").toString();
        f91a = RunnableC0010k.m99a(65552 + i, 65554 + i, 65569 + i, InterfaceC0007h.f53j[i]);
        f86a = new C0006g(65572 + i, new StringBuffer().append("Z").append(i).append("_BG_32X24_PNG").toString());
        byte[] bArrM24a = C0005f.m24a(65587 + i);
        int i2 = bArrM24a[1] << 1;
        f89a = new byte[i2];
        System.arraycopy(bArrM24a, 2, f89a, 0, i2);
        boolean zM23a = C0005f.m23a(65589 + i);
        f115b = C0005f.m24a(65589 + i);
        if (!zM23a) {
            for (int length = f115b.length - 1; length >= 0; length--) {
                byte[] bArr = f115b;
                bArr[length] = (byte) (bArr[length] - 1);
            }
        }
        f142e = C0005f.m24a(65591 + i);
        f149f = C0005f.m24a(65593 + i);
        for (int i3 = 0; i3 < f149f.length; i3++) {
            f149f[i3] = (byte) ((f149f[i3] * 200) / 100);
        }
        f119b = new byte[f73Q][];
        f163i = new byte[f73Q];
        f167j = new byte[f73Q];
        for (int i4 : f120b[f100af]) {
            int i5 = f127c[i4];
            if (i5 != -1) {
                DataInputStream dataInputStreamM21a = C0005f.m21a(i5);
                byte b = dataInputStreamM21a.readByte();
                byte b2 = dataInputStreamM21a.readByte();
                f163i[i4] = b;
                f167j[i4] = b2;
                f119b[i4] = new byte[b * b2];
                dataInputStreamM21a.read(f119b[i4]);
                for (int i6 = 0; i6 < b * b2; i6++) {
                    byte[] bArr2 = f119b[i4];
                    bArr2[i6] = (byte) (bArr2[i6] - 1);
                }
            }
        }
        f145e = RunnableC0010k.m101a(65556 + i, 65558 + i, 65560 + i, InterfaceC0007h.f54k[i]);
        f130c = RunnableC0010k.m101a(65562 + i, 65564 + i, 65566 + i, -1);
        if (i == 1) {
            C0006g c0006g = f130c[0][0];
            f110b = (byte) c0006g.f49b;
            f83a = (byte) c0006g.f46a;
            f147f = f130c[3][0];
            f152g = f130c[5][0];
            f157h = f130c[6][0];
            f161i = f130c[4][0];
            f165j = f130c[7][0];
            f169k = f130c[8][0];
            f173l = f130c[9][0];
            f177m = f130c[10][0];
            f181n = f130c[11][0];
            f184o = f130c[12][0];
            f187p = f130c[13][0];
            f117b = new C0006g[]{f177m, f181n, f184o, f187p};
            int[] iArr = f182n;
            f75S = ((f177m.f46a * iArr[0]) + (f181n.f46a * iArr[1])) - (f165j.f46a >> 1);
            int[] iArr2 = f185o;
            f78V = ((f177m.f46a * iArr2[0]) + (f181n.f46a * iArr2[1])) - (f165j.f46a >> 1);
            f74R = 0;
            f77U = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < iArr.length; i8++) {
                f74R += iArr[i8] * f117b[i8].f46a;
                f77U += iArr2[i8] * f117b[i8].f46a;
                i7 += f117b[i8].f46a;
            }
            f76T = f74R / 6;
            f79W = f77U / 5;
            f150f[17] = f74R;
            f150f[18] = f77U;
            f150f[19] = i7 + 16;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m40a(int i, int i2) {
        C0004e.m16a(4, (i << 1) + 1);
        new StringBuffer().append("*** loadLevel(zone=").append(i).append(", act=").append(i2).append(")").toString();
        f166j = true;
        boolean z = f100af != i;
        boolean z2 = (f100af == i && f101ag == i2) ? false : true;
        boolean z3 = z2 || f102ah == -1;
        f100af = i;
        f101ag = i2;
        f102ah = i2;
        RunnableC0010k.m117d();
        if (!f162i) {
            f190q = new C0006g(65538, "lives");
            f193r = new C0006g(65539, "rings");
            C0006g c0006g = new C0006g(65540, "numbers");
            f128c = c0006g.m31a(c0006g.f46a / 11, c0006g.f49b);
            C0006g c0006g2 = new C0006g(120, 30);
            f196s = c0006g2;
            m47a(c0006g2.m28a(), 0, 30);
            f94a = RunnableC0010k.m101a(65544, 65545, 65568, -1);
            C0006g[][] c0006gArrM101a = RunnableC0010k.m101a(65546, 65547, 65548, -1);
            f121b = c0006gArrM101a;
            f113b = c0006gArrM101a[0][0];
            f133d = f121b[13][0];
            f140e = f121b[11][0];
            f124c = f121b[12][0];
            f72P = f121b[1][0].f49b;
            f99ae = f121b[6][0].f49b;
            f138d = RunnableC0010k.m101a(65549, 65550, 65551, -1);
        }
        if (z) {
            m39a(i);
        }
        if (z2) {
            new StringBuffer().append("*** loadActResources(").append(i).append(",").append(i2).append(")").toString();
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(C0005f.m24a(InterfaceC0007h.f55l[i] + i2)));
            f122c = dataInputStream.read();
            f131d = dataInputStream.read();
            f126c = new byte[f122c * f131d];
            dataInputStream.readFully(f126c);
            f139e = f122c << 3;
            f146f = f131d << 3;
            f180n = (f122c << 8) - 240;
            f183o = (f131d << 8) - 260;
        }
        if (z3) {
            m58b(i, i2);
        }
        f162i = true;
        f166j = false;
    }

    /* JADX INFO: renamed from: a */
    private static void m41a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iM54b;
        int i8 = i3 << 6;
        int i9 = i4 << 6;
        switch (i2) {
            case 20:
                byte b = f159h[i + 1];
                if (b == -1) {
                    i7 = 17;
                } else {
                    i7 = b & 3;
                    if (b <= 0) {
                        i7 = 3;
                    }
                }
                i5 = (i7 << 4) << 6;
                i6 = i9;
                break;
            case 21:
            default:
                i5 = f150f[i2] << 6;
                int i10 = f159h[i + 5] * 7;
                i8 += f155g[i10 + 3];
                i6 = f155g[i10 + 4] + i9;
                break;
            case 22:
                i5 = f150f[i2] << 6;
                i6 = i9;
                break;
        }
        if (f198t < i8 || f198t >= i8 + i5) {
            return;
        }
        if (f202v < i8 || f202v >= i5 + i8) {
            iM54b = -1;
        } else {
            iM54b = m54b(i2, f202v - i8);
            if (iM54b >= 0) {
                iM54b += i6;
            }
        }
        int iM54b2 = m54b(i2, f198t - i8);
        if (iM54b2 >= 0) {
            iM54b2 = i6 + iM54b2;
        }
        boolean z = (iM54b < 0 && f200u <= iM54b2 + 1152) || f203w <= iM54b;
        boolean z2 = f200u >= iM54b2;
        if (z && z2 && f206z >= 0) {
            f200u = iM54b2;
            if (f192r != 5 && f192r != 6) {
                if (f159h[i + 1] != 0 || i2 == 14 || i2 == 24) {
                    f204x = f205y >> 2;
                } else {
                    f204x = f205y;
                }
            }
            f58B = i;
            m74i();
            f66J = 0;
            int i11 = f136d[i2];
            if (i11 == 2 || i11 == 8) {
                f159h[i + 4] = 1;
            }
            m57b(5);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m42a(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = i2 << 6;
        int i7 = i3 << 6;
        int i8 = i4 << 6;
        int i9 = i5 << 6;
        switch (i) {
            case 0:
                f200u = i7;
                if (z) {
                    f206z = 0;
                }
                break;
            case 1:
                f198t = i6 + i8 + 1152;
                if (z) {
                    f205y = 0;
                    f204x = 0;
                }
                break;
            case 2:
                f200u = i7 + i9 + 1920;
                f200u = f203w;
                if (z) {
                    f206z = -(f206z - (f206z >> 2));
                }
                break;
            case 3:
                f198t = i6 - 896;
                if (z) {
                    f205y = 0;
                    f204x = 0;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m43a(int i, boolean z) {
        if (!z) {
            f191q[i] = -1;
            C0003d.m9a(f191q[i + 9]);
            return;
        }
        f159h[f191q[i + 10] + 4] = 2;
        f191q[i] = 4;
        f191q[i + 6] = 0;
        f191q[i + 4] = 0;
        f191q[i + 5] = -1280;
        int i2 = f191q[i + 9];
        C0006g c0006g = C0003d.f21a[i2][C0003d.f23c[i2]];
        int i3 = c0006g.f46a << 6;
        int i4 = c0006g.f49b << 6;
        int[] iArr = f191q;
        int i5 = i + 2;
        iArr[i5] = ((i3 >> 1) - (i3 >> 2)) + iArr[i5];
        int[] iArr2 = f191q;
        int i6 = i + 3;
        iArr2[i6] = ((i4 >> 1) - (i4 >> 2)) + iArr2[i6];
        C0003d.m11a(i2, f138d[5]);
        int i7 = f65I;
        short[] sArr = f137d;
        int i8 = f66J;
        f66J = i8 + 1;
        f65I = i7 + sArr[i8];
        f114b = true;
        if (f66J == f137d.length) {
            f66J--;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m44a(long j) {
        if (f111b == 2) {
            C0004e.m16a(3, (f100af << 1) + 1);
            f112b += j;
            m56b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m45a(Graphics graphics) {
        String string;
        C0006g c0006g;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (f166j) {
            RunnableC0010k.m92a(graphics, f100af, f101ag + 1, false);
            return;
        }
        graphics.translate(0, 30);
        graphics.setClip(0, 0, 240, 260);
        boolean z2 = f100af == 0 || f156h < (f90a[f101ag] << 5);
        boolean z3 = f100af == 1 && f176m > (f90a[f101ag] << 5);
        boolean z4 = z2 && z3;
        if (z2) {
            short s = f86a.f46a;
            short s2 = f86a.f49b;
            int i6 = f151g >> 4;
            int i7 = (64 - (f156h >> 10)) - 15;
            if (i7 > 0) {
                graphics.setColor(f93a[f100af][0]);
                graphics.fillRect(0, 0, 240, i7);
            }
            int i8 = s2 + i7;
            if (i8 >= 0) {
                for (int i9 = -i6; i9 < 240; i9 += s) {
                    f86a.m29a(graphics, i9 + 0, i7);
                }
            }
            if (i8 < 0) {
                i8 = 0;
            }
            if (i8 < 260) {
                graphics.setColor(f93a[f100af][1]);
                graphics.fillRect(0, i8, 240, 260 - i8);
            }
        } else if (z3) {
            graphics.setColor(2236962);
            graphics.fillRect(0, 0, 240, 260);
        }
        if (z4) {
            int i10 = (f90a[f101ag] << 5) - f156h;
            graphics.setColor(2236962);
            graphics.fillRect(0, i10, 240, 260 - i10);
        }
        int i11 = f151g >> 8;
        int i12 = f156h >> 8;
        int i13 = (f151g >> 6) % 4;
        int i14 = (f156h >> 5) % 8;
        int i15 = ((f151g + 240) - 1) >> 8;
        int i16 = ((f156h + 260) - 1) >> 8;
        int i17 = i13 << 6;
        int i18 = i14 << 5;
        int i19 = i14 << 2;
        int i20 = -(f151g % 64);
        int i21 = -(f156h % 32);
        while (true) {
            int i22 = i12;
            int i23 = i20;
            int i24 = i19;
            int i25 = i18;
            if (i22 > i16) {
                break;
            }
            int i26 = i22 * f122c;
            int i27 = i11;
            int i28 = i17;
            int i29 = i13;
            while (i27 <= i15) {
                int i30 = (f126c[i26 + i27] << 5) + i24 + i29;
                int i31 = i14;
                int i32 = i21;
                while (i31 < 8) {
                    int i33 = i29;
                    int i34 = i23;
                    while (true) {
                        if (i33 >= 4) {
                            i5 = i30;
                            break;
                        }
                        int i35 = i30 + 1;
                        int i36 = f115b[i30] & 127;
                        if (i34 >= 240) {
                            i5 = ((4 - i33) - 1) + i35;
                            break;
                        }
                        if (i36 == 127) {
                            i34 += 64;
                        } else {
                            int i37 = i36 << 1;
                            if (i37 < f89a.length && i37 + 1 < f89a.length) {
                                byte b = f89a[i37];
                                byte b2 = f89a[i37 + 1];
                                if (b != -1) {
                                    f91a[b].m29a(graphics, i34, i32);
                                }
                                if (b2 != -1) {
                                    f91a[b2].m29a(graphics, i34 + 32, i32);
                                }
                                i34 += 64;
                            }
                        }
                        i33++;
                        i30 = i35;
                    }
                    int i38 = i32 + 32;
                    if (i38 >= 260) {
                        break;
                    }
                    i30 = i5 + i29;
                    i31++;
                    i32 = i38;
                }
                i23 += 256 - i28;
                i29 = 0;
                i27++;
                i28 = 0;
            }
            i21 += 256 - i25;
            i19 = 0;
            i14 = 0;
            i18 = 0;
            i12 = i22 + 1;
        }
        int i39 = (f198t >> 6) - f151g;
        int i40 = (f200u >> 6) - f156h;
        int i41 = f151g >> 8;
        int i42 = f156h >> 8;
        int i43 = f172l >> 8;
        int i44 = f176m >> 8;
        int i45 = -(f151g % 256);
        int i46 = -(f156h % 256);
        if (i41 > 0) {
            i41--;
            i45 -= 256;
        }
        if (i42 > 0) {
            i42--;
            i46 -= 256;
        }
        while (true) {
            int i47 = i42;
            int i48 = i46;
            int i49 = i45;
            if (i47 > i44) {
                for (int i50 = 0; i50 < f191q.length; i50 += 11) {
                    int i51 = f191q[i50];
                    if (i51 != -1) {
                        int i52 = f191q[i50 + 2];
                        int i53 = f191q[i50 + 3];
                        int i54 = (i52 >> 6) - f151g;
                        int i55 = (i53 >> 6) - f156h;
                        int i56 = f191q[i50 + 9];
                        C0006g c0006g2 = C0003d.f21a[i56][C0003d.f23c[i56]];
                        switch (i51) {
                            case 0:
                            case 1:
                            case 3:
                            case 4:
                                c0006g2.m29a(graphics, i54, i55);
                                break;
                            case 2:
                                c0006g2.m29a(graphics, i54, i55);
                                if (f191q[i50 + 6] == 4) {
                                    C0006g c0006g3 = f138d[3][f108an];
                                    int i57 = c0006g3.f46a << 6;
                                    int i58 = i52 + (c0006g2.f46a << 5);
                                    int i59 = f191q[i50 + 7];
                                    int i60 = (i53 + f191q[i50 + 8]) >> 6;
                                    int i61 = (((i58 - i59) - (i57 >> 1)) >> 6) - f151g;
                                    int i62 = i60 - f156h;
                                    c0006g3.m29a(graphics, i61, i62);
                                    c0006g3.m29a(graphics, (((i58 + i59) - (i57 >> 1)) >> 6) - f151g, i62);
                                }
                                break;
                        }
                    }
                }
                int i63 = C0003d.f23c[f186p];
                if (f111b == 2) {
                    boolean z5 = true;
                    if (f153g) {
                        if (f95aa != 0) {
                            RunnableC0010k.m91a(graphics, 0, 0, f95aa - f151g, 260);
                        } else if (f82Z != 0) {
                            RunnableC0010k.m91a(graphics, f82Z - f151g, 0, 240, 260);
                        } else {
                            f153g = false;
                            z5 = false;
                        }
                    }
                    if ((!f134d || (f67K & 1) == 0) && z5) {
                        C0003d.f21a[f186p][i63].m29a(graphics, i39 - 26, (f59C + i40) - 48);
                    }
                    if (f148f && z5) {
                        f94a[22][RunnableC0010k.f233d & 1].m29a(graphics, i39 - 26, (f59C + i40) - 48);
                    }
                    if (f141e && z5) {
                        f94a[21][RunnableC0010k.f233d & 1].m29a(graphics, i39 - 26, (f59C + i40) - 48);
                    }
                    if (f153g) {
                        f153g = false;
                        f82Z = 0;
                        f95aa = 0;
                        graphics.setClip(0, 0, 240, 260);
                    }
                } else if (f111b == 4 || f111b == 5) {
                    graphics.setClip(0, 0, 240, 320);
                    if (f111b != 4) {
                        int height = (260 - (C0004e.f27a.getHeight() * 5)) >> 1;
                        int height2 = C0004e.f27a.getHeight();
                        RunnableC0010k.m93a(graphics, RunnableC0010k.f223a[26], 120, height, 17);
                        int i64 = height + height2;
                        RunnableC0010k.m93a(graphics, new StringBuffer().append(RunnableC0010k.f223a[32]).append(" ").append(f101ag + 1).toString(), 120, i64, 17);
                        int i65 = i64 + height2;
                        RunnableC0010k.m93a(graphics, RunnableC0010k.f223a[23], 10, i65, 20);
                        int i66 = i65 + height2;
                        RunnableC0010k.m93a(graphics, RunnableC0010k.f223a[24], 10, i66, 20);
                        RunnableC0010k.m93a(graphics, RunnableC0010k.f223a[25], 10, i66 + height2, 20);
                        RunnableC0010k.m93a(graphics, new StringBuffer().append("").append(f65I).toString(), 230, i65, 24);
                        int i67 = i65 + height2;
                        RunnableC0010k.m93a(graphics, new StringBuffer().append("").append(f69M).toString(), 230, i67, 24);
                        RunnableC0010k.m93a(graphics, new StringBuffer().append("").append(f70N).toString(), 230, i67 + height2, 24);
                    } else if (!f125c || f63G <= 0) {
                        RunnableC0010k.m93a(graphics, RunnableC0010k.f223a[28], 120, 130, 17);
                    } else {
                        RunnableC0010k.m93a(graphics, RunnableC0010k.f223a[27], 120, 130, 17);
                    }
                }
                if (f96ab > 0) {
                    m60b(graphics);
                }
                graphics.translate(0, -30);
                graphics.setClip(0, 0, 240, 320);
                f196s.m32b(graphics, 120, 290);
                m50a(graphics, new StringBuffer().append("").append(f65I).toString(), (236 - RunnableC0010k.f217a.f46a) - 4, 302, 8);
                graphics.setClip(0, 0, 240, 320);
                RunnableC0010k.f217a.m30a(graphics, 236, 316, 40);
                f114b = false;
                if (f170k) {
                    graphics.setClip(0, 0, 240, 320);
                    f196s.m32b(graphics, 0, 0);
                    f193r.m29a(graphics, 4, 4);
                    m50a(graphics, String.valueOf(f64H), f193r.f46a + 4 + 10, 4, 20);
                    f170k = false;
                }
                graphics.setClip(0, 0, 240, 320);
                f196s.m32b(graphics, 0, 290);
                short s3 = f190q.f46a;
                f190q.m29a(graphics, 4, 316 - f190q.f49b);
                m50a(graphics, new StringBuffer().append("").append(Math.max(f63G, 0)).toString(), s3 + 4 + 4, 302, 4);
                f174l = false;
                if (f178m) {
                    graphics.setClip(0, 0, 240, 320);
                    f196s.m32b(graphics, 120, 0);
                    if (f125c) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(9);
                        stringBuffer.append(':');
                        stringBuffer.append(59);
                        string = stringBuffer.toString();
                    } else {
                        int i68 = f84a % 60;
                        string = new StringBuffer().append(f84a / 60).append(":").append(i68 < 10 ? "0" : "").append(i68).toString();
                    }
                    m50a(graphics, string, 236, 4, 8);
                    f178m = false;
                }
                f158h = false;
                return;
            }
            int i69 = i41;
            int i70 = (f122c * i47) + i41;
            while (true) {
                int i71 = i49;
                if (i69 <= i43) {
                    if (i70 < f118b.length) {
                        byte b3 = f154g[i70];
                        int i72 = 0;
                        int i73 = f118b[i70];
                        while (true) {
                            int i74 = i72;
                            int i75 = i73;
                            if (i74 < b3) {
                                byte b4 = f159h[i75 == true ? 1 : 0];
                                if (b4 >= 0) {
                                    int i76 = f159h[(i75 == true ? 1 : 0) + 1];
                                    byte b5 = f159h[(i75 == true ? 1 : 0) + 4];
                                    byte b6 = f159h[(i75 == true ? 1 : 0) + 5];
                                    int i77 = i71 + (f159h[(i75 == true ? 1 : 0) + 2] & 255);
                                    int i78 = (f159h[(i75 == true ? 1 : 0) + 3] & 255) + i48;
                                    switch (b4) {
                                        case 0:
                                            if (i76 == 0) {
                                                i76 = 7;
                                            }
                                            int i79 = C0003d.f23c[f80X];
                                            while (i76 > 0) {
                                                if ((i76 & 1) > 0) {
                                                    f121b[6][i79].m29a(graphics, i77, i78);
                                                }
                                                i76 >>= 1;
                                                i77 += 24;
                                            }
                                            break;
                                        case 1:
                                            if (i76 == 0) {
                                                i76 = 7;
                                            }
                                            int i80 = C0003d.f23c[f80X];
                                            while (i76 > 0) {
                                                if ((i76 & 1) > 0) {
                                                    f121b[6][i80].m29a(graphics, i77, i78);
                                                }
                                                i76 >>= 1;
                                                i78 += 24;
                                            }
                                            break;
                                        case 2:
                                            if (b5 == 0 || b5 == 1) {
                                                if (b5 == 0 && f159h[(i75 == true ? 1 : 0) + 5] > 0) {
                                                    i78 -= f116b[f159h[(i75 == true ? 1 : 0) + 5]];
                                                }
                                                f121b[1][0].m29a(graphics, i77, i78);
                                                if (C0003d.f23c[f81Y] == 0) {
                                                    f121b[3][0].m29a(graphics, i77, i78);
                                                } else {
                                                    f121b[1][i76 + 1].m29a(graphics, i77, i78);
                                                }
                                            } else {
                                                f121b[2][0].m29a(graphics, i77, i78);
                                            }
                                            m46a(graphics, i75 == true ? 1 : 0);
                                            if (b5 == 3) {
                                                f121b[1][i76 + 1].m29a(graphics, i77, i78 - b6);
                                            } else if (b5 == 4) {
                                                f121b[1][i76 + 1].m29a(graphics, i77, i78 - 56);
                                            }
                                            break;
                                        case 3:
                                            if (i76 == -1) {
                                                i3 = 17;
                                                i4 = 0;
                                            } else if (i76 == -2) {
                                                i3 = 20;
                                                i4 = 0;
                                            } else {
                                                i3 = (i76 & 3) > 0 ? i76 & 3 : 3;
                                                if ((i76 & 4) > 0) {
                                                    i4 = f155g[(f159h[(i75 == true ? 1 : 0) + 5] * 7) + 4] >> 6;
                                                    i78 += i4;
                                                } else {
                                                    i4 = 0;
                                                }
                                            }
                                            RunnableC0010k.m91a(graphics, i77, i78, i3 << 4, 32 - i4);
                                            for (int i81 = 0; i81 < i3; i81++) {
                                                f113b.m29a(graphics, i77, i78);
                                                i77 += 16;
                                            }
                                            graphics.setClip(0, 0, 240, 260);
                                            break;
                                        case 4:
                                            f121b[7][0].m29a(graphics, i77, i78);
                                            m46a(graphics, i75 == true ? 1 : 0);
                                            break;
                                        case 5:
                                            m48a(graphics, i75 == true ? 1 : 0, i77, i78);
                                            break;
                                        case 6:
                                            f130c[0][0].m29a(graphics, i77, i78);
                                            break;
                                        case 7:
                                        case 17:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 35:
                                        case 38:
                                        case 41:
                                        case 42:
                                            if (b5 != 2) {
                                                m48a(graphics, i75 == true ? 1 : 0, i77, i78);
                                            }
                                            break;
                                        case 8:
                                            f121b[4][0].m29a(graphics, i77, i78);
                                            if (b5 == 1) {
                                                f121b[5][0].m29a(graphics, i77, i78);
                                            }
                                            break;
                                        case 9:
                                            if (b5 == 1) {
                                                f121b[10][0].m29a(graphics, i77, i78);
                                            } else {
                                                f121b[9][0].m29a(graphics, i77, i78);
                                            }
                                            break;
                                        case 11:
                                            if (b5 != 2) {
                                                f91a[0].m29a(graphics, i77, i78);
                                                f91a[0].m29a(graphics, i77, i78 + 32);
                                                f91a[0].m29a(graphics, i77 + 32, i78);
                                                f91a[0].m29a(graphics, i77 + 32, i78 + 32);
                                                RunnableC0010k.m91a(graphics, i77 + 3, i78, 29, 64);
                                                f91a[0].m29a(graphics, i77 + 3, i78);
                                                f91a[0].m29a(graphics, i77 + 3, i78 + 32);
                                                graphics.setClip(0, 0, 240, 260);
                                            }
                                            break;
                                        case 12:
                                            short s4 = f121b[0][0].f49b;
                                            RunnableC0010k.m91a(graphics, i77, i78, 256, s4);
                                            int i82 = i78 + 8;
                                            int i83 = f87a;
                                            int i84 = i77 + 256;
                                            while (i77 < i84) {
                                                int i85 = i83 + 8;
                                                int i86 = ((i83 % 64) * 180) / 64;
                                                if (i86 > 90) {
                                                    i86 = 180 - i86;
                                                }
                                                f121b[0][0].m29a(graphics, i77, ((f144e[i86] * s4) >> 10) + i82);
                                                i77 += 16;
                                                i83 = i85;
                                            }
                                            graphics.setClip(0, 0, 240, 260);
                                            break;
                                        case 15:
                                            f121b[8][0].m29a(graphics, i77, i78);
                                            break;
                                        case 16:
                                            if (f159h[(i75 == true ? 1 : 0) + 4] != 0) {
                                                int i87 = f159h[(i75 == true ? 1 : 0) + 5] << 1;
                                                int i88 = i78 + (f194r[i87] >> 6);
                                                char c = f194r[i87 + 1] > 0 ? (char) 0 : (char) 1;
                                                f130c[c][RunnableC0010k.f233d % f130c[c].length].m29a(graphics, i77, i88);
                                            }
                                            break;
                                        case 18:
                                            int i89 = (i76 & 3) > 0 ? i76 & 3 : 3;
                                            if ((i76 & 4) > 0) {
                                                i = f155g[(f159h[(i75 == true ? 1 : 0) + 5] * 7) + 4] >> 6;
                                                i2 = i77 + i;
                                            } else {
                                                i = 0;
                                                i2 = i77;
                                            }
                                            RunnableC0010k.m91a(graphics, i2, i78, 32 - i, i89 << 4);
                                            for (int i90 = 0; i90 < i89; i90++) {
                                                f133d.m29a(graphics, i2, i78);
                                                i78 += 16;
                                            }
                                            graphics.setClip(0, 0, 240, 260);
                                            break;
                                        case 19:
                                            int i91 = (i76 & 3) > 0 ? i76 & 3 : 3;
                                            RunnableC0010k.m91a(graphics, i77, i78, 32, i91 << 4);
                                            if ((i76 & 4) > 0) {
                                                i77 -= f155g[(f159h[(i75 == true ? 1 : 0) + 5] * 7) + 4] >> 6;
                                            }
                                            for (int i92 = 0; i92 < i91; i92++) {
                                                f140e.m29a(graphics, i77, i78);
                                                i78 += 16;
                                            }
                                            graphics.setClip(0, 0, 240, 260);
                                            break;
                                        case 26:
                                        case 44:
                                            int i93 = (f155g[(f159h[(i75 == true ? 1 : 0) + 5] * 7) + 4] >> 6) + i78;
                                            short s5 = f152g.f49b;
                                            int i94 = (144 - (f147f.f49b << 1)) / s5;
                                            f147f.m29a(graphics, i77, i93);
                                            f147f.m29a(graphics, i77 + 32, i93);
                                            int i95 = f130c[3][0].f49b + i93;
                                            for (int i96 = 0; i96 < i94; i96++) {
                                                f152g.m29a(graphics, i77, i95);
                                                f157h.m29a(graphics, i77 + 32, i95);
                                                i95 += s5;
                                            }
                                            f161i.m29a(graphics, i77, i95);
                                            f161i.m29a(graphics, i77 + 32, i95);
                                            break;
                                        case 27:
                                            m49a(graphics, i77, i78, f155g[(f159h[(i75 == true ? 1 : 0) + 5] * 7) + 4] >> 6, 1);
                                            break;
                                        case 28:
                                            m49a(graphics, i77, i78, f155g[(f159h[(i75 == true ? 1 : 0) + 5] * 7) + 4] >> 6, 0);
                                            break;
                                        case 32:
                                        case 43:
                                            int i97 = f150f[13];
                                            boolean z6 = false;
                                            if (i76 == i97 || i76 == (-i97) || b4 == 43) {
                                                z6 = true;
                                                if ((b4 == 32 && i76 < 0) || (b4 == 43 && i76 > 0)) {
                                                    RunnableC0010k.m91a(graphics, i77, i78, i97, 32);
                                                    z = true;
                                                } else if (b4 != 32 || i76 <= 0) {
                                                    RunnableC0010k.m91a(graphics, (i77 - 64) + 1, i78, i97, 32);
                                                    z = z6;
                                                } else {
                                                    RunnableC0010k.m91a(graphics, i77 + 64, i78, i97, 32);
                                                    z = true;
                                                }
                                            } else {
                                                z = z6;
                                            }
                                            if (b5 != 2) {
                                                m48a(graphics, i75 == true ? 1 : 0, i77, i78);
                                            }
                                            if (z) {
                                                graphics.setClip(0, 0, 240, 260);
                                            }
                                            break;
                                        case 33:
                                            m49a(graphics, i77, i78, f155g[(f159h[(i75 == true ? 1 : 0) + 5] * 7) + 4] >> 6, 2);
                                            break;
                                        case 34:
                                        case 36:
                                            if (f159h[(i75 == true ? 1 : 0) + 4] != 0) {
                                                int i98 = f159h[(i75 == true ? 1 : 0) + 5] * 3;
                                                if (f197s[i98] <= 0) {
                                                    int i99 = f197s[i98 + 1] >> 6;
                                                    int i100 = f197s[i98 + 2] >> 6;
                                                    int i101 = ((i76 & 255) * 200) / 100;
                                                    if (b4 == 36) {
                                                        c0006g = f130c[0][RunnableC0010k.f233d % f130c[0].length];
                                                        RunnableC0010k.m91a(graphics, i77, c0006g.f49b + i78, c0006g.f46a, i101 - c0006g.f49b);
                                                    } else {
                                                        c0006g = f130c[2][RunnableC0010k.f233d % f130c[2].length];
                                                        RunnableC0010k.m91a(graphics, c0006g.f46a + i77, i78, i101 - c0006g.f46a, c0006g.f49b);
                                                    }
                                                    c0006g.m29a(graphics, i77 + i99, i78 + i100);
                                                    graphics.setClip(0, 0, 240, 260);
                                                }
                                            }
                                            break;
                                        case 37:
                                            if (f159h[(i75 == true ? 1 : 0) + 4] != 0) {
                                                C0006g c0006g4 = f130c[14][0];
                                                C0006g c0006g5 = f130c[15][0];
                                                C0006g c0006g6 = f130c[18][0];
                                                RunnableC0010k.m91a(graphics, i77, c0006g4.f49b + i78, 64, 360);
                                                int i102 = ((f199t[(f159h[(i75 == true ? 1 : 0) + 5] * 3) + 1] - 16640) >> 6) + i78;
                                                int i103 = (i102 + 260) - c0006g4.f49b;
                                                f130c[16][0].m29a(graphics, i77, i102);
                                                f130c[19][0].m29a(graphics, i77 + 32, i102);
                                                int i104 = i102 + f130c[16][0].f49b;
                                                while (i104 < i103) {
                                                    c0006g5.m29a(graphics, i77, i104);
                                                    c0006g6.m29a(graphics, i77 + 32, i104);
                                                    i104 += c0006g5.f49b;
                                                }
                                                c0006g4.m29a(graphics, i77, i104);
                                                f130c[17][0].m29a(graphics, i77 + 32, i104);
                                                graphics.setClip(0, 0, 240, 260);
                                            }
                                            break;
                                        case 46:
                                        case 47:
                                            int i105 = (b4 == 46 ? 2 : 3) << 1;
                                            byte b7 = f89a[i105];
                                            byte b8 = f89a[i105 + 1];
                                            f91a[b7].m29a(graphics, i77, i78);
                                            f91a[b8].m29a(graphics, i77 + 32, i78);
                                            break;
                                    }
                                }
                                i72 = i74 + 1;
                                i73 = (i75 == true ? 1 : 0) + 9;
                            }
                        }
                    }
                    i49 = i71 + 256;
                    i69++;
                    i70++;
                }
            }
            i46 = i48 + 256;
            i42 = i47 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m46a(Graphics graphics, int i) {
        int i2 = ((f159h[i + 7] << 8) + (f159h[i + 2] & 255)) >> 5;
        int i3 = ((f159h[i + 8] << 8) + (f159h[i + 3] & 255)) >> 5;
        if (m34a(i2, i3) == 44) {
            int i4 = (i2 << 5) - f151g;
            int i5 = (i3 << 5) - f156h;
            f91a[44].m29a(graphics, i4, i5);
            f91a[46].m29a(graphics, i4 + 32, i5);
            f91a[45].m29a(graphics, i4, i5 + 32);
            f91a[47].m29a(graphics, i4 + 32, i5 + 32);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m47a(Graphics graphics, int i, int i2) {
        int i3 = InterfaceC0007h.f52i[0];
        int i4 = InterfaceC0007h.f52i[1] ^ InterfaceC0007h.f52i[0];
        for (int i5 = 29; i5 >= 0; i5--) {
            graphics.setColor(i3);
            i3 ^= i4;
            graphics.fillRect(0, i5, 120, 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m48a(Graphics graphics, int i, int i2, int i3) {
        int i4 = f159h[i + 5] * 7;
        int i5 = f155g[i4];
        int i6 = f143e[i5];
        byte[] bArr = f119b[i6];
        byte b = f163i[i6];
        int i7 = f167j[i6];
        if (i5 == 1 && f159h[i + 4] == 1) {
            int i8 = f155g[i4 + 4] >> 6;
            for (int i9 = i7 - 1; i9 >= 0; i9--) {
                int i10 = ((b << 6) + i2) - 32;
                int i11 = i3 + (i9 << 5);
                int i12 = i3 + i8 + (i9 << 5);
                int i13 = 0;
                int i14 = b - 1;
                while (i14 >= 0) {
                    int i15 = bArr[(i9 * b) + i14] << 1;
                    byte b2 = f89a[i15];
                    f91a[f89a[i15 + 1]].m29a(graphics, i10, i12);
                    int i16 = i13 + 1;
                    int i17 = i12 - (i16 * 16);
                    if (i17 < i11) {
                        i17 = i11;
                    }
                    int i18 = i10 - 32;
                    f91a[b2].m29a(graphics, i18, i17);
                    i13 = i16 + 1;
                    int i19 = i17 - (i13 * 16);
                    if (i19 < i11) {
                        i19 = i11;
                    }
                    i10 = i18 - 32;
                    i14--;
                    i12 = i19;
                }
            }
            return;
        }
        if (i5 == 2 && f159h[i + 4] == 1) {
            int i20 = f155g[i4 + 4] >> 6;
            for (int i21 = i7 - 1; i21 >= 0; i21--) {
                int i22 = i3 + (i21 << 5);
                int i23 = i3 + i20 + (i21 << 5);
                int i24 = 0;
                int i25 = 0;
                int i26 = i2;
                while (i25 < b) {
                    int i27 = bArr[(i21 * b) + i25] << 1;
                    byte b3 = f89a[i27];
                    byte b4 = f89a[i27 + 1];
                    f91a[b3].m29a(graphics, i26, i23);
                    int i28 = i24 + 1;
                    int i29 = i23 - (i28 * 16);
                    if (i29 < i22) {
                        i29 = i22;
                    }
                    int i30 = i26 + 32;
                    f91a[b4].m29a(graphics, i30, i29);
                    i24 = i28 + 1;
                    int i31 = i29 - (i24 * 16);
                    if (i31 < i22) {
                        i31 = i22;
                    }
                    i26 = i30 + 32;
                    i25++;
                    i23 = i31;
                }
            }
            return;
        }
        if (i5 != 0 || i != f58B) {
            int i32 = i2 + (f155g[i4 + 3] >> 6);
            int i33 = i3 + (f155g[i4 + 4] >> 6);
            int i34 = 0;
            int i35 = i33;
            int i36 = i7;
            while (true) {
                int i37 = i36 - 1;
                if (i37 < 0) {
                    break;
                }
                int i38 = b;
                int i39 = i32;
                while (true) {
                    i38--;
                    if (i38 >= 0) {
                        int i40 = i34 + 1;
                        int i41 = bArr[i34] << 1;
                        byte b5 = f89a[i41];
                        byte b6 = f89a[i41 + 1];
                        f91a[b5].m29a(graphics, i39, i35);
                        f91a[b6].m29a(graphics, i39 + 32, i35);
                        i39 += 64;
                        i34 = i40;
                    }
                }
                i35 += 32;
                i36 = i37;
            }
            if ((i5 == 14 || i5 == 24) && f159h[i + 4] == 1) {
                int i42 = f155g[i4 + 2] >> 6;
                int length = f130c[0].length;
                int i43 = i33 - (f110b >> 1);
                int i44 = 0;
                int i45 = -(f83a >> 1);
                C0006g c0006g = null;
                while (i45 < i42 - 1) {
                    c0006g = f130c[0][(i44 + RunnableC0010k.f233d) % length];
                    c0006g.m29a(graphics, i32 + i45, i43);
                    i45 += f83a;
                    i44++;
                }
                if (i42 < f150f[i5] - 2) {
                    c0006g.m29a(graphics, i32 + i42, i43);
                    return;
                }
                return;
            }
            return;
        }
        int i46 = 0;
        while (true) {
            int i47 = i7 - 1;
            if (i47 < 0) {
                return;
            }
            int i48 = 0;
            int i49 = b;
            int i50 = i2;
            while (true) {
                i49--;
                if (i49 >= 0) {
                    int i51 = i46 + 1;
                    int i52 = bArr[i46] << 1;
                    byte b7 = f89a[i52];
                    byte b8 = f89a[i52 + 1];
                    f91a[b7].m29a(graphics, i50, f179m[i48] + i3);
                    f91a[b8].m29a(graphics, i50 + 32, f179m[i48 + 1] + i3);
                    i50 += 64;
                    i48 += 2;
                    i46 = i51;
                }
            }
            i3 += 32;
            i7 = i47;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m49a(Graphics graphics, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int[] iArr = null;
        if (i4 == 1) {
            iArr = f182n;
            i7 = f75S;
            i6 = f76T;
            i5 = 6;
        } else if (i4 == 2) {
            iArr = f185o;
            i7 = f78V;
            i6 = f79W;
            i5 = 5;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        short s = f169k.f49b;
        if (i4 > 0) {
            i += i7;
        }
        RunnableC0010k.m91a(graphics, i, f165j.f49b + i2, f165j.f46a, i3);
        int i8 = f165j.f49b + i2 + i3;
        while (i8 > f165j.f49b + i2) {
            i8 -= s;
            f169k.m29a(graphics, i, i8);
        }
        graphics.setClip(0, 0, 240, 260);
        f165j.m29a(graphics, i, i2);
        int i9 = f165j.f49b + i3 + i2;
        f173l.m29a(graphics, i, i9);
        int i10 = i9 + f173l.f49b;
        if (i4 == 0) {
            f177m.m29a(graphics, i, i10);
            int i11 = f177m.f46a + i;
            f181n.m29a(graphics, i11, i10);
            int i12 = i11 + f181n.f46a;
            f184o.m29a(graphics, i12, i10);
            f187p.m29a(graphics, i12 + f184o.f46a, i10);
            return;
        }
        int i13 = f124c.f46a >> 1;
        int i14 = i - i7;
        int i15 = (i14 + i6) - i13;
        for (int i16 = 0; i16 < iArr.length; i16++) {
            for (int i17 = 0; i17 < iArr[i16]; i17++) {
                C0006g c0006g = f117b[i16];
                c0006g.m29a(graphics, i14, i10);
                i14 += c0006g.f46a;
            }
        }
        int i18 = i10 + f117b[0].f49b;
        int i19 = i15;
        for (int i20 = 0; i20 < i5; i20++) {
            f124c.m29a(graphics, i19 - i13, i18);
            i19 += i6;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m50a(Graphics graphics, String str, int i, int i2, int i3) {
        char[] charArray = str.toCharArray();
        if ((i3 & 8) != 0) {
            i -= (charArray.length * 12) - 2;
        }
        for (char c : charArray) {
            f128c[c - '0'].m29a(graphics, i, i2);
            i += 12;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m51a(boolean z) {
        f84a = 0;
        f85a = System.currentTimeMillis();
        f192r = 0;
        RunnableC0010k.m111c();
        if (z) {
            f166j = true;
            try {
                m58b(f100af, f101ag);
            } catch (Exception e) {
                new StringBuffer().append("ex in resetLevel: ").append(e.toString()).toString();
                e.printStackTrace();
            }
            f166j = false;
        } else {
            f112b = System.currentTimeMillis();
            f125c = false;
            f71O = 0;
            m57b(0);
            m52a();
        }
        f148f = false;
        f134d = false;
        f141e = false;
        f96ab = 0;
        f66J = 0;
        m70f(0);
        f88a = false;
        f58B = -1;
        f59C = 0;
        f202v = f198t;
        f203w = f200u;
        f205y = 0;
        f206z = 0;
        f204x = 0;
        m64c(1);
        if (f71O == 0) {
            int i = ((f100af * 3) + f101ag) << 1;
            f198t = f135d[i];
            f200u = f135d[i + 1];
            f198t <<= 1035;
            f200u <<= 11;
            m57b(0);
            m52a();
        } else {
            byte b = f159h[f71O + 7];
            byte b2 = f159h[f71O + 8];
            f198t = ((b << 8) + (f159h[f71O + 2] & 255)) << 6;
            int i2 = ((b2 << 8) + (f159h[f71O + 3] & 255)) << 6;
            f200u = i2;
            f200u = i2 + ((f121b[4][0].f49b + 4) << 6);
            f202v = f198t;
            f203w = f200u - 2048;
            m57b(0);
        }
        f168k = 0;
        f164j = 0;
        f160i = 0;
        m75j();
        m56b();
        RunnableC0010k.m111c();
        C0004e.m15a(1);
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        C0004e.m16a(3, (f100af << 1) + 1);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m52a() {
        int i = f198t >> 11;
        int i2 = f200u >> 11;
        int iM34a = m34a(i, i2);
        int iM33a = m33a(iM34a);
        if (iM33a < 0 || iM33a >= 10) {
            return false;
        }
        int i3 = (f198t >> 6) - (i << 5);
        f200u = ((InterfaceC0002c.f16a[iM33a][i3] + f149f[iM34a]) + (i2 << 5)) << 6;
        m74i();
        f66J = 0;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static int m53b(int i) {
        if (i >= 360) {
            i %= 360;
        } else if (i < 0) {
            if (i < -360) {
                i %= 360;
            }
            i += 360;
        }
        return f144e[i];
    }

    /* JADX INFO: renamed from: b */
    private static int m54b(int i, int i2) {
        int i3;
        if (f143e[i] != -1) {
            i3 = i;
        } else {
            if (f136d[i] == 6) {
                return (f165j.f49b + 2) << 6;
            }
            if (i != 22 && i != 16) {
                return 0;
            }
            i3 = f100af == 0 ? 9 : 10;
        }
        int i4 = i2 >> 6;
        byte b = f89a[(f119b[f143e[i3]][i4 >> 6] << 1) + ((i4 >> 5) & 1)];
        int iM33a = m33a((int) b);
        if (iM33a < 0 || iM33a >= 10) {
            b = -1;
        }
        if (b == -1) {
            return 0;
        }
        int i5 = i2 >> 6;
        return (f149f[b] + InterfaceC0002c.f16a[m33a((int) b)][i5 - ((i5 >> 5) << 5)]) << 6;
    }

    /* JADX INFO: renamed from: b */
    private static int m55b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i + i3;
        int i8 = i2 + i4;
        int i9 = f198t - f202v;
        int i10 = f200u - f203w;
        boolean z = f198t + 832 >= i && f198t + (-1152) < i7;
        boolean z2 = f200u + (-64) >= i2 && f200u + (-1920) < i8;
        if (!z || !z2) {
            return -1;
        }
        if (i9 > 0) {
            i5 = (i + i9) - (f198t + 832);
        } else {
            i5 = i9 < 0 ? (f198t - 1152) - (i9 + i7) : -1;
        }
        if (i10 > 0) {
            i6 = (i2 + i10) - (f200u - 64);
        } else {
            i6 = i10 < 0 ? (f200u - 1920) - (i10 + i8) : -1;
        }
        if (i5 >= 0 && i6 >= 0) {
            if ((i10 > 0 ? i10 : -i10) * i5 > (i9 > 0 ? i9 : -i9) * i6) {
                i5 = -1;
            } else {
                i6 = -1;
            }
        }
        if (i6 >= 0) {
            return i10 > 0 ? 0 : 2;
        }
        if (i5 >= 0) {
            return i9 > 0 ? 3 : 1;
        }
        return -2;
    }

    /* JADX INFO: renamed from: b */
    public static void m56b() {
        f158h = true;
        f174l = true;
        f170k = true;
        f178m = true;
        f114b = true;
    }

    /* JADX INFO: renamed from: b */
    private static void m57b(int i) {
        if (f192r == 12) {
            return;
        }
        try {
            switch (i) {
                case 0:
                    C0003d.m14b(f186p, f94a[f57A == 1 ? (char) 4 : (char) 14], 1);
                    break;
                case 1:
                    C0003d.m14b(f186p, f94a[f57A == 1 ? (char) 5 : (char) 15], 4);
                    break;
                case 2:
                    C0003d.m14b(f186p, f94a[f57A == 1 ? (char) 1 : (char) 11], 1);
                    break;
                case 3:
                    C0003d.m14b(f186p, f94a[f57A == 1 ? (char) 0 : '\n'], 1);
                    break;
                case 6:
                    C0003d.m14b(f186p, f94a[f57A != 1 ? (char) 19 : '\t'], 1);
                    break;
                case 7:
                    C0003d.m14b(f186p, f94a[f57A == 1 ? (char) 6 : (char) 16], 1);
                    break;
                case 8:
                    C0003d.m14b(f186p, f94a[f57A == 1 ? '\t' : (char) 19], 1);
                    break;
                case 9:
                    C0003d.m14b(f186p, f94a[f57A == 1 ? (char) 3 : '\r'], 1);
                    break;
                case 10:
                    C0003d.m14b(f186p, f94a[f57A == 1 ? (char) 2 : '\f'], 1);
                    break;
                case 11:
                    C0003d.m14b(f186p, f94a[20], 1);
                    break;
            }
        } catch (Exception e) {
            new StringBuffer().append("Sonic Set State: ").append(i).append(", Exception: ").append(e.toString()).toString();
        }
        f192r = i;
        f195s = 0;
    }

    /* JADX INFO: renamed from: b */
    private static void m58b(int i, int i2) throws IOException {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        new StringBuffer().append("*** loadActObjects(").append(i).append(",").append(i2).append(")").toString();
        C0003d.m8a();
        f186p = C0003d.m7a();
        int iM7a = C0003d.m7a();
        f81Y = iM7a;
        C0003d.m10a(iM7a, 2);
        int iM7a2 = C0003d.m7a();
        f80X = iM7a2;
        C0003d.m10a(iM7a2, f121b[6].length);
        DataInputStream dataInputStreamM21a = C0005f.m21a(InterfaceC0007h.f56m[i] + i2);
        int i3 = dataInputStreamM21a.readShort();
        f118b = new short[i3];
        f154g = new byte[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = dataInputStreamM21a.read();
            f118b[i5] = (short) i4;
            f154g[i5] = (byte) i6;
            i4 += i6 * 9;
        }
        short s = dataInputStreamM21a.readShort();
        f159h = new byte[s * 9];
        int i7 = 0;
        int i8 = 0;
        int i9 = f154g[0];
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < s) {
            int i12 = i9;
            while (i12 == 0) {
                int i13 = i8 + 1;
                i12 = f154g[i13];
                i7++;
                i8 = i13;
            }
            dataInputStreamM21a.read(f159h, i11, 4);
            f159h[i11 + 2] = (byte) ((f159h[i11 + 2] * 200) / 100);
            f159h[i11 + 3] = (byte) ((f159h[i11 + 3] * 200) / 100);
            int i14 = i7 % f122c;
            int i15 = i7 / f122c;
            f159h[i11 + 7] = (byte) i14;
            f159h[i11 + 8] = (byte) i15;
            byte b11 = 0;
            switch (f159h[i11]) {
                case 3:
                case 5:
                case 7:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 35:
                case 38:
                case 41:
                case 42:
                case 43:
                case 44:
                    b = (byte) (b10 + 1);
                    b11 = b10;
                    b2 = b9;
                    b3 = b8;
                    b4 = b7;
                    b5 = b6;
                    break;
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 39:
                case 40:
                default:
                    b = b10;
                    b2 = b9;
                    b3 = b8;
                    b4 = b7;
                    b5 = b6;
                    break;
                case 10:
                    b5 = (byte) (b6 + 1);
                    b11 = b6;
                    b = b10;
                    b2 = b9;
                    b3 = b8;
                    b4 = b7;
                    break;
                case 16:
                    b4 = (byte) (b7 + 1);
                    b11 = b7;
                    b = b10;
                    b2 = b9;
                    b3 = b8;
                    b5 = b6;
                    break;
                case 34:
                case 36:
                    b3 = (byte) (b8 + 1);
                    b11 = b8;
                    b = b10;
                    b2 = b9;
                    b4 = b7;
                    b5 = b6;
                    break;
                case 37:
                    b2 = (byte) (b9 + 1);
                    b11 = b9;
                    b = b10;
                    b3 = b8;
                    b4 = b7;
                    b5 = b6;
                    break;
            }
            f159h[i11 + 4] = 0;
            f159h[i11 + 5] = b11;
            i11 += 9;
            i9 = i12 - 1;
            i10++;
            b10 = b;
            b9 = b2;
            b8 = b3;
            b7 = b4;
            b6 = b5;
        }
        f191q = new int[b6 * 11];
        for (int i16 = 0; i16 < f191q.length; i16 += 11) {
            f191q[i16] = -1;
        }
        f155g = new int[b10 * 7];
        Vector vector = new Vector();
        for (int i17 = 0; i17 < f159h.length; i17 += 9) {
            int i18 = f159h[i17 + 5] * 7;
            int i19 = -1;
            switch (f159h[i17]) {
                case 3:
                    i19 = 20;
                    break;
                case 5:
                    i19 = 0;
                    break;
                case 7:
                    i19 = 3;
                    break;
                case 17:
                    i19 = 4;
                    break;
                case 18:
                case 19:
                    i19 = 21;
                    break;
                case 20:
                    i19 = 14;
                    break;
                case 21:
                    i19 = 1;
                    break;
                case 22:
                    i19 = 2;
                    break;
                case 23:
                    i19 = 6;
                    break;
                case 24:
                    i19 = 9;
                    break;
                case 25:
                    i19 = 15;
                    break;
                case 26:
                case 44:
                    i19 = 16;
                    break;
                case 27:
                    i19 = 17;
                    break;
                case 28:
                    i19 = 19;
                    break;
                case 29:
                    i19 = 7;
                    break;
                case 30:
                    i19 = 8;
                    break;
                case 31:
                    i19 = 10;
                    break;
                case 32:
                case 43:
                    i19 = 11;
                    break;
                case 33:
                    i19 = 18;
                    break;
                case 35:
                    i19 = 13;
                    break;
                case 38:
                    i19 = 5;
                    break;
                case 41:
                    i19 = 23;
                    break;
                case 42:
                    i19 = 24;
                    break;
            }
            if (i19 != -1) {
                f155g[i18] = i19;
                if (f136d[i19] == 4 || f136d[i19] == 5) {
                    vector.addElement(new Integer(i17));
                }
                if (f136d[i19] == 3 && f159h[i17 + 1] < 0) {
                    f159h[i17 + 1] = (byte) (-f159h[i17 + 1]);
                    f155g[i18 + 1] = 1;
                    f155g[i18 + 2] = 11520;
                }
                if (i19 == 21 && (f159h[i17 + 1] & 8) > 0) {
                    byte[] bArr = f159h;
                    int i20 = i17 + 1;
                    bArr[i20] = (byte) (bArr[i20] & 7);
                    f155g[i18 + 4] = 2048;
                    f155g[i18 + 1] = 2;
                }
            }
        }
        f188p = new int[vector.size()];
        int i21 = 0;
        while (true) {
            int i22 = i21;
            if (i22 >= vector.size()) {
                f194r = new int[b7 << 1];
                f197s = new int[b8 * 3];
                f199t = new int[b9 * 3];
                return;
            }
            f188p[i22] = ((Integer) vector.elementAt(i22)).intValue();
            i21 = i22 + 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0325  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x047f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0487  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX INFO: renamed from: b */
    private static void m59b(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i2 == -1) {
            i2 = 80;
            z4 = true;
        }
        int i11 = (i2 * 200) / 100;
        boolean z5 = false;
        int i12 = f159h[i + 5] * 7;
        int i13 = f155g[i12];
        int i14 = f136d[i13];
        switch (i14) {
            case 1:
                int i15 = f155g[i12 + 1];
                if (i15 == 2) {
                    int[] iArr = f155g;
                    int i16 = i12 + 6;
                    iArr[i16] = iArr[i16] + 224;
                    int[] iArr2 = f155g;
                    int i17 = i12 + 4;
                    iArr2[i17] = iArr2[i17] + f155g[i12 + 6];
                    if ((((i4 << 6) + f155g[i12 + 4]) >> 14) > f131d) {
                        f155g[i12 + 4] = 0;
                        f155g[i12 + 6] = 0;
                        f159h[i + 4] = 2;
                    }
                    if (f58B != i) {
                        if (i15 == 0) {
                            f155g[i12 + 1] = 1;
                            f155g[i12 + 2] = 5;
                            z = false;
                        } else if (i15 == 1) {
                            int[] iArr3 = f155g;
                            int i18 = i12 + 2;
                            i10 = iArr3[i18] - 1;
                            iArr3[i18] = i10;
                            if (i10 == 0) {
                                f155g[i12 + 1] = 2;
                                z = false;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    } else if (f155g[i12 + 6] > 1344) {
                        f206z = f155g[i12 + 6];
                        z = true;
                    } else {
                        f200u += f155g[i12 + 6];
                        if (i15 == 0) {
                            f155g[i12 + 1] = 1;
                            f155g[i12 + 2] = 5;
                            z = false;
                        } else if (i15 == 1) {
                            int[] iArr4 = f155g;
                            int i19 = i12 + 2;
                            i10 = iArr4[i19] - 1;
                            iArr4[i19] = i10;
                            if (i10 == 0) {
                                f155g[i12 + 1] = 2;
                                z = false;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                } else if (i15 == 0) {
                    f155g[i12 + 1] = 1;
                    f155g[i12 + 2] = 5;
                    z = false;
                } else if (i15 == 1) {
                    int[] iArr5 = f155g;
                    int i110 = i12 + 2;
                    i10 = iArr5[i110] - 1;
                    iArr5[i110] = i10;
                    if (i10 == 0) {
                        f155g[i12 + 1] = 2;
                        z = false;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (f58B == i) {
                    if (z5 && f192r != 10) {
                        if (i11 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f155g[i12 + 1] != 1 || f155g[i12 + 1] == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (((!z2 && z3) || (!z2 && !z3)) && m33a(m34a(f198t >> 11, (f200u - 1920) >> 11)) != -1) {
                            m68e(4);
                        }
                    }
                    if (z) {
                        f58B = -1;
                        f205y = f204x;
                        m57b(7);
                        m69f();
                    }
                }
                break;
            case 2:
                int[] iArr6 = f155g;
                int i20 = i12 + 6;
                iArr6[i20] = iArr6[i20] + 252;
                int[] iArr7 = f155g;
                int i21 = i12 + 4;
                iArr7[i21] = iArr7[i21] + f155g[i12 + 6];
                if (i3 < f151g - f150f[i13] || i3 > f172l || i4 < f156h - 32 || i4 > f176m) {
                    f155g[i12 + 4] = f131d << 14;
                    if ((((i4 << 6) + f155g[i12 + 4]) >> 14) > f131d) {
                        f155g[i12 + 4] = 0;
                        f155g[i12 + 6] = 0;
                        f159h[i + 4] = 0;
                    }
                    z = true;
                } else if (f58B != i) {
                    z = false;
                } else if (f155g[i12 + 6] > 1792) {
                    f206z = 1792;
                    z = true;
                } else {
                    f200u += f155g[i12 + 6];
                    z = false;
                }
                if (f58B == i) {
                    if (z5) {
                        if (i11 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f155g[i12 + 1] != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z2) {
                            m68e(4);
                        } else {
                            m68e(4);
                        }
                    }
                    if (z) {
                        f58B = -1;
                        f205y = f204x;
                        m57b(7);
                        m69f();
                    }
                }
                break;
            case 3:
                int i22 = f155g[i12 + 1] == 1 ? f104aj >> 6 : f105ak >> 6;
                int i23 = ((f144e[i22 + 90] * i11) >> 10) << 6;
                int i24 = ((f144e[i22] * i11) >> 10) << 6;
                if (f58B == i) {
                    int i25 = f155g[i12 + 3];
                    int i26 = f155g[i12 + 4];
                    f198t = (i23 - i25) + f198t;
                    f200u += i24 - i26;
                }
                f155g[i12 + 3] = i23;
                f155g[i12 + 4] = i24;
                z = false;
                if (f58B == i) {
                    if (z5) {
                        if (i11 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f155g[i12 + 1] != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z2) {
                            m68e(4);
                        } else {
                            m68e(4);
                        }
                    }
                    if (z) {
                        f58B = -1;
                        f205y = f204x;
                        m57b(7);
                        m69f();
                    }
                }
                break;
            case 4:
            case 5:
                i11 <<= 6;
                if (i14 == 4) {
                    i7 = f155g[i12 + 4];
                    i8 = f155g[i12 + 6];
                } else {
                    i7 = f155g[i12 + 3];
                    i8 = f155g[i12 + 5];
                }
                if (i11 > 0) {
                    if (f155g[i12 + 1] == 0) {
                        if (i7 > i11 - 9) {
                            i8 -= 32;
                            if (i8 <= 0) {
                                i8 = 0;
                                f155g[i12 + 1] = 1;
                            }
                        } else if (i8 < 288 && (i8 = i8 + 32) > 288) {
                            i8 = 288;
                        }
                    } else if (i7 <= 9) {
                        i8 += 32;
                        if (i8 > 0) {
                            i8 = 0;
                            f155g[i12 + 1] = 0;
                        }
                    } else if (i8 > -288 && (i8 = i8 - 32) < -288) {
                        i8 = -288;
                    }
                    i9 = i7 + i8;
                    if (i9 > i11) {
                        i8 = 0;
                        i9 = i11;
                    }
                    if (i9 < 0) {
                        i8 = 0;
                        i9 = 0;
                    }
                } else {
                    if (f155g[i12 + 1] == 0) {
                        if (i7 < i11 + 9) {
                            i8 += 32;
                            if (i8 >= 0) {
                                i8 = 0;
                                f155g[i12 + 1] = 1;
                            }
                        } else if (i8 > -288 && (i8 = i8 - 32) < -288) {
                            i8 = -288;
                        }
                    } else if (i7 >= -9) {
                        i8 -= 32;
                        if (i8 < 0) {
                            i8 = 0;
                            f155g[i12 + 1] = 0;
                        }
                    } else if (i8 < 288 && (i8 = i8 + 32) > 288) {
                        i8 = 288;
                    }
                    i9 = i7 + i8;
                    if (i9 < i11) {
                        i8 = 0;
                        i9 = i11;
                    }
                    if (i9 > 0) {
                        i8 = 0;
                        i9 = 0;
                    }
                }
                if (i14 != 4) {
                    f155g[i12 + 3] = i9;
                    f155g[i12 + 5] = i8;
                    if (f58B == i) {
                        int i27 = f198t + i8;
                        int iM37a = m37a(i27, f200u, i8 > 0 ? 1 : -1, 0, true);
                        if (iM37a == 0 || iM37a == 1) {
                            f58B = -1;
                            if (f192r == 6) {
                                m57b(8);
                            } else {
                                m57b(7);
                            }
                            f206z = 0;
                            f205y = 0;
                            m69f();
                            z = false;
                        } else {
                            f198t = i27;
                        }
                        if (f58B == i) {
                            if (z5) {
                                if (i11 > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (f155g[i12 + 1] != 1) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (!z2) {
                                    m68e(4);
                                } else {
                                    m68e(4);
                                }
                            }
                            if (z) {
                                f58B = -1;
                                f205y = f204x;
                                m57b(7);
                                m69f();
                            }
                        }
                    }
                } else {
                    f155g[i12 + 4] = i9;
                    f155g[i12 + 6] = i8;
                    if (f58B == i) {
                        f200u = (i4 << 6) + i9 + m54b(i13, f198t - (i3 << 6));
                    }
                    boolean z6 = f155g[i12] == 16;
                    f155g[i12 + 2] = 1;
                    z5 = z6;
                    z = false;
                    if (f58B == i) {
                        if (z5) {
                            if (i11 > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (f155g[i12 + 1] != 1) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (!z2) {
                                m68e(4);
                            } else {
                                m68e(4);
                            }
                        }
                        if (z) {
                            f58B = -1;
                            f205y = f204x;
                            m57b(7);
                            m69f();
                        }
                    }
                }
                f155g[i12 + 2] = 1;
                z5 = z6;
                z = false;
                if (f58B == i) {
                    if (z5) {
                        if (i11 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f155g[i12 + 1] != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z2) {
                            m68e(4);
                        } else {
                            m68e(4);
                        }
                    }
                    if (z) {
                        f58B = -1;
                        f205y = f204x;
                        m57b(7);
                        m69f();
                    }
                }
                break;
            case 6:
                i11 <<= 6;
                int i28 = f155g[i12 + 4];
                int i29 = f155g[i12 + 6];
                switch (f155g[i12 + 1]) {
                    case 0:
                        i5 = i29 + 512;
                        if (i5 > 4096) {
                            i5 = 4096;
                        }
                        i6 = i28 + i5;
                        if (i6 > i11) {
                            if (f58B == i) {
                                f200u = (i5 - (i6 - i11)) + f200u;
                            }
                            i5 = 0;
                            f155g[i12 + 2] = 30;
                            f155g[i12 + 1] = 1;
                            i28 = i11;
                        } else if (f58B != i) {
                            i28 = i6;
                        } else {
                            f200u += i5;
                            i28 = i6;
                        }
                        break;
                    case 1:
                        int[] iArr8 = f155g;
                        int i30 = i12 + 2;
                        int i31 = iArr8[i30] - 1;
                        iArr8[i30] = i31;
                        if (i31 != 0) {
                            i5 = i29;
                        } else {
                            f155g[i12 + 1] = 2;
                            i5 = i29;
                        }
                        break;
                    case 2:
                        if (z4) {
                            i5 = i29 - 256;
                            if (i5 < -256) {
                                i5 = -256;
                            }
                        } else {
                            i5 = i29 - 144;
                            if (i5 < -128) {
                                i5 = -128;
                            }
                        }
                        i6 = i28 + i5;
                        if (i6 < 0) {
                            i6 = 0;
                            i5 = 0;
                            f155g[i12 + 1] = 0;
                        }
                        if (f58B == i) {
                            f200u += i5;
                        }
                        i28 = i6;
                        break;
                    default:
                        i5 = i29;
                        break;
                }
                f155g[i12 + 4] = i28;
                f155g[i12 + 6] = i5;
                z5 = true;
                z = false;
                if (f58B == i) {
                    if (z5) {
                        if (i11 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f155g[i12 + 1] != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z2) {
                            m68e(4);
                        } else {
                            m68e(4);
                        }
                    }
                    if (z) {
                        f58B = -1;
                        f205y = f204x;
                        m57b(7);
                        m69f();
                    }
                }
                break;
            case 7:
                int i32 = f155g[i12 + 4];
                int i33 = f155g[i12 + 6];
                switch (f155g[i12 + 1]) {
                    case 0:
                        i33 += 128;
                        i32 += i33;
                        if (i32 > 2048) {
                            i32 = 2048;
                            f155g[i12 + 2] = 20;
                            f155g[i12 + 1] = 1;
                        }
                        break;
                    case 1:
                        int[] iArr9 = f155g;
                        int i34 = i12 + 2;
                        int i35 = iArr9[i34] - 1;
                        iArr9[i34] = i35;
                        if (i35 == 0) {
                            i33 = 0;
                            f155g[i12 + 1] = 2;
                        }
                        break;
                    case 2:
                        i33 += 128;
                        i32 -= i33;
                        if (i32 <= 0) {
                            i32 = 0;
                            f155g[i12 + 2] = 20;
                            f155g[i12 + 1] = 3;
                        }
                        break;
                    case 3:
                        int[] iArr10 = f155g;
                        int i36 = i12 + 2;
                        int i37 = iArr10[i36] - 1;
                        iArr10[i36] = i37;
                        if (i37 == 0) {
                            i33 = 0;
                            f155g[i12 + 1] = 0;
                        }
                        break;
                }
                f155g[i12 + 4] = i32;
                f155g[i12 + 6] = i33;
                z = false;
                if (f58B == i) {
                    if (z5) {
                        if (i11 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f155g[i12 + 1] != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z2) {
                            m68e(4);
                        } else {
                            m68e(4);
                        }
                    }
                    if (z) {
                        f58B = -1;
                        f205y = f204x;
                        m57b(7);
                        m69f();
                    }
                }
                break;
            case 8:
                if (f159h[i + 4] == 1) {
                    int i38 = f150f[i13];
                    if (i3 > f172l || i3 + i38 < f151g) {
                        f159h[i + 4] = 0;
                        f155g[i12 + 2] = 0;
                    } else {
                        int i39 = (i38 - 1) << 6;
                        int i40 = f155g[i12 + 2];
                        if (i40 < i39) {
                            i40 += 96;
                            if (i40 > i39 - 1) {
                                i40 = i39 - 1;
                            }
                            f155g[i12 + 2] = i40;
                        }
                        int i41 = (i3 << 6) + i40;
                        if (f58B == i && f198t - 1152 < i41 && i40 > 512) {
                            m68e(0);
                        }
                    }
                }
                z = false;
                if (f58B == i) {
                    if (z5) {
                        if (i11 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f155g[i12 + 1] != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z2) {
                            m68e(4);
                        } else {
                            m68e(4);
                        }
                    }
                    if (z) {
                        f58B = -1;
                        f205y = f204x;
                        m57b(7);
                        m69f();
                    }
                }
                break;
            default:
                z = false;
                if (f58B == i) {
                    if (z5) {
                        if (i11 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (f155g[i12 + 1] != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (!z2) {
                            m68e(4);
                        } else {
                            m68e(4);
                        }
                    }
                    if (z) {
                        f58B = -1;
                        f205y = f204x;
                        m57b(7);
                        m69f();
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m60b(Graphics graphics) {
        for (int i = 0; i <= f97ac; i += 4) {
            int i2 = f201u[i + 1];
            if (i2 != 0) {
                f121b[6][C0003d.f23c[f80X]].m29a(graphics, (f201u[i] >> 6) - f151g, (i2 >> 6) - f156h);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m61c(int i) {
        int i2 = i + 90;
        if (i2 >= 360) {
            i2 %= 360;
        } else if (i2 < 0) {
            if (i2 < -360) {
                i2 %= 360;
            }
            i2 += 360;
        }
        return f144e[i2];
    }

    /* JADX INFO: renamed from: c */
    private static int m62c(int i, int i2) {
        int i3;
        int i4;
        int i5 = i < 0 ? -i : i;
        int i6 = i2 < 0 ? -i2 : i2;
        if (i6 < i5) {
            i3 = i5;
            i4 = i6;
        } else {
            i3 = i6;
            i4 = i5;
        }
        return i3 + ((i4 * 5) >> 4);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:791:0x1082  */
    /* JADX WARN: Code duplicated, block: B:825:0x010a A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static void m63c() {
        int i;
        int i2;
        boolean z;
        int i3;
        int iM34a;
        boolean z2;
        short s;
        int i4;
        int iM35a;
        int iM35a2;
        int iM35a3;
        int i5;
        int iM35a4;
        byte b;
        if (RunnableC0010k.f237f > 0 && (System.currentTimeMillis() - f112b) / 1000 > RunnableC0010k.f239g) {
            RunnableC0010k.m102b();
        }
        switch (f111b) {
            case 0:
                f63G = 3;
                f65I = 0;
                f109ao = 0;
                f71O = 0;
                break;
            case 1:
                break;
            case 2:
                if (RunnableC0010k.m116c(128)) {
                    RunnableC0010k.f221a.m126a(true);
                    return;
                }
                f202v = f198t;
                f203w = f200u;
                m65d();
                if (f111b == 5) {
                    f70N = f64H * 100;
                    long jCurrentTimeMillis = System.currentTimeMillis() - f112b;
                    for (int i6 = 0; i6 < f129c.length; i6 += 2) {
                        if (jCurrentTimeMillis < f129c[i6] * 1000) {
                            f69M = f129c[i6 + 1] * 1000;
                        }
                    }
                } else {
                    if (f134d) {
                        int i7 = f67K - 1;
                        f67K = i7;
                        if (i7 == 0) {
                            f134d = false;
                        }
                    }
                    if (f141e) {
                        int i8 = f68L - 1;
                        f68L = i8;
                        if (i8 == 0) {
                            f141e = false;
                        }
                    }
                    if (f84a > 600 && !f125c) {
                        f84a = 0;
                        m68e(4);
                        f125c = true;
                        f178m = true;
                        f158h = true;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() / 900;
                    if (jCurrentTimeMillis2 != f132d && !f125c) {
                        f178m = true;
                        f158h = true;
                        f132d = jCurrentTimeMillis2;
                    }
                    if (f114b) {
                        if (f109ao % 50000 > f65I % 50000) {
                            f63G++;
                            f174l = true;
                            f158h = true;
                        }
                        f109ao = f65I;
                    }
                }
                if (f192r != 11) {
                    int i9 = (f151g >> 8) - 1;
                    int i10 = (f156h >> 8) - 1;
                    int i11 = (f172l >> 8) + 1;
                    int i12 = (f176m >> 8) + 1;
                    if (i9 < 0) {
                        i9 = 0;
                    }
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    int i13 = i11 >= f122c ? f122c - 1 : i11;
                    int i14 = i12 >= f131d ? f131d - 1 : i12;
                    for (int i15 = i10; i15 <= i14; i15++) {
                        for (int i16 = i9; i16 <= i13; i16++) {
                            int i17 = (f122c * i15) + i16;
                            if (i17 < f154g.length) {
                                byte b2 = f154g[i17];
                                short s2 = f118b[i17];
                                int i18 = i16 << 8;
                                int i19 = i15 << 8;
                                int i20 = 0;
                                int i21 = s2;
                                while (true) {
                                    int i22 = i20;
                                    int i23 = i21;
                                    if (i22 < b2) {
                                        int i24 = (f198t >> 6) - 2;
                                        int i25 = (f200u >> 6) - 15;
                                        byte b3 = f159h[i23 == true ? 1 : 0];
                                        if (b3 >= 0) {
                                            byte b4 = f159h[(i23 == true ? 1 : 0) + 1];
                                            int i26 = i18 + (f159h[(i23 == true ? 1 : 0) + 2] & 255);
                                            int i27 = i19 + (f159h[(i23 == true ? 1 : 0) + 3] & 255);
                                            byte b5 = f159h[(i23 == true ? 1 : 0) + 4];
                                            switch (b3) {
                                                case 0:
                                                    if (f192r != 10) {
                                                        int i28 = i26 + 8;
                                                        int i29 = i27 + 8;
                                                        byte b6 = b4 == 0 ? (byte) 7 : b4;
                                                        int i30 = 1;
                                                        int i31 = i28;
                                                        byte b7 = b6;
                                                        int i32 = b6;
                                                        while (i32 > 0) {
                                                            if ((i32 & 1) <= 0 || m62c(i24 - i31, i25 - i29) >= 28) {
                                                                b = b7;
                                                            } else {
                                                                b = (byte) ((i30 ^ (-1)) & b7);
                                                                if (b == 0) {
                                                                    f159h[i23 == true ? 1 : 0] = -1;
                                                                }
                                                                m70f(f64H + 1);
                                                            }
                                                            i32 >>= 1;
                                                            i31 += 24;
                                                            b7 = b;
                                                            i30 <<= 1;
                                                        }
                                                        f159h[(i23 == true ? 1 : 0) + 1] = b7;
                                                    }
                                                    break;
                                                case 1:
                                                    if (f192r != 10) {
                                                        int i33 = i26 + 8;
                                                        int i34 = i27 + 8;
                                                        if (b4 == 0) {
                                                            b4 = 7;
                                                        }
                                                        int i35 = 1;
                                                        byte b8 = b4;
                                                        for (int i36 = b4; i36 > 0; i36 >>= 1) {
                                                            if ((i36 & 1) > 0 && m62c(i24 - i33, i25 - i34) < 28) {
                                                                b8 = (byte) (b8 & (i35 ^ (-1)));
                                                                if (b8 == 0) {
                                                                    f159h[i23 == true ? 1 : 0] = -1;
                                                                }
                                                                m70f(f64H + 1);
                                                            }
                                                            i35 <<= 1;
                                                            i34 += 24;
                                                        }
                                                        f159h[(i23 == true ? 1 : 0) + 1] = b8;
                                                    }
                                                    break;
                                                case 2:
                                                    if (f58B != i23) {
                                                        if (b5 == 0) {
                                                            int iM35a5 = m35a(i26, i27, 32, 32);
                                                            if (iM35a5 >= 0) {
                                                                boolean z3 = false;
                                                                if (f192r == 10 || f192r == 7 || f58B != -1) {
                                                                    m41a(i23 == true ? 1 : 0, 22, i26, i27);
                                                                } else {
                                                                    if (iM35a5 != 0) {
                                                                        if (iM35a5 != 3 && iM35a5 != 1) {
                                                                            if (iM35a5 == 2) {
                                                                                f206z = -(f206z - (f206z >> 2));
                                                                                if (m34a(((f159h[(i23 == true ? 1 : 0) + 7] << 8) + (f159h[(i23 == true ? 1 : 0) + 2] & 255)) >> 5, ((f159h[(i23 == true ? 1 : 0) + 8] << 8) + (f159h[(i23 == true ? 1 : 0) + 3] & 255)) >> 5) == 44) {
                                                                                    f159h[(i23 == true ? 1 : 0) + 4] = 1;
                                                                                    f159h[(i23 == true ? 1 : 0) + 5] = 1;
                                                                                } else {
                                                                                    f159h[(i23 == true ? 1 : 0) + 5] = (byte) (f116b.length - 1);
                                                                                }
                                                                            }
                                                                            break;
                                                                        } else if (f192r == 5) {
                                                                            f204x = 0;
                                                                        } else if (f192r == 6) {
                                                                            z3 = true;
                                                                        } else if (Math.abs(f205y) > 256) {
                                                                            z3 = true;
                                                                            f205y >>= 1;
                                                                            f206z = -1664;
                                                                        }
                                                                    } else {
                                                                        m71g();
                                                                        z3 = true;
                                                                    }
                                                                    if (z3) {
                                                                        f159h[(i23 == true ? 1 : 0) + 4] = 3;
                                                                        f159h[(i23 == true ? 1 : 0) + 5] = 0;
                                                                        switch (b4) {
                                                                            case 0:
                                                                                m70f(f64H + 10);
                                                                                break;
                                                                            case 1:
                                                                                f141e = true;
                                                                                f68L = 175;
                                                                                break;
                                                                            case 2:
                                                                                f148f = true;
                                                                                break;
                                                                            case 3:
                                                                                f63G++;
                                                                                f174l = true;
                                                                                f158h = true;
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        m42a(iM35a5, i26, i27, 32, 32, false);
                                                                    }
                                                                    if (f159h[(i23 == true ? 1 : 0) + 5] > 0) {
                                                                        byte[] bArr = f159h;
                                                                        int i37 = (i23 == true ? 1 : 0) + 5;
                                                                        bArr[i37] = (byte) (bArr[i37] - 1);
                                                                    }
                                                                }
                                                            } else if (f159h[(i23 == true ? 1 : 0) + 5] > 0) {
                                                                byte[] bArr2 = f159h;
                                                                int i38 = (i23 == true ? 1 : 0) + 5;
                                                                bArr2[i38] = (byte) (bArr2[i38] - 1);
                                                            }
                                                        } else if (b5 == 1) {
                                                            byte b9 = f159h[(i23 == true ? 1 : 0) + 5];
                                                            byte[] bArr3 = f159h;
                                                            int i39 = (i23 == true ? 1 : 0) + 3;
                                                            bArr3[i39] = (byte) (bArr3[i39] + b9);
                                                            int i40 = (f159h[(i23 == true ? 1 : 0) + 7] << 8) + (f159h[(i23 == true ? 1 : 0) + 2] & 255);
                                                            int i41 = ((f159h[(i23 == true ? 1 : 0) + 8] << 8) + (f159h[(i23 == true ? 1 : 0) + 3] & 255)) >> 5;
                                                            int iM33a = m33a(m34a(i40 >> 5, i41));
                                                            if (iM33a >= 0 && iM33a < 10) {
                                                                f159h[(i23 == true ? 1 : 0) + 3] = (byte) (((i41 << 5) - i19) - f72P);
                                                                f159h[(i23 == true ? 1 : 0) + 4] = 0;
                                                                f159h[(i23 == true ? 1 : 0) + 5] = 0;
                                                            } else if (b9 <= 16) {
                                                                byte[] bArr4 = f159h;
                                                                int i42 = (i23 == true ? 1 : 0) + 5;
                                                                bArr4[i42] = (byte) (bArr4[i42] << 1);
                                                            }
                                                        } else if (b5 == 3) {
                                                            byte[] bArr5 = f159h;
                                                            int i43 = (i23 == true ? 1 : 0) + 5;
                                                            bArr5[i43] = (byte) (bArr5[i43] + 2);
                                                            if (f159h[(i23 == true ? 1 : 0) + 5] > 56) {
                                                                f159h[(i23 == true ? 1 : 0) + 5] = 0;
                                                                f159h[(i23 == true ? 1 : 0) + 4] = 4;
                                                            }
                                                        } else if (b5 == 4) {
                                                            byte[] bArr6 = f159h;
                                                            int i44 = (i23 == true ? 1 : 0) + 5;
                                                            byte b10 = (byte) (bArr6[i44] + 1);
                                                            bArr6[i44] = b10;
                                                            if (b10 > 20) {
                                                                f159h[(i23 == true ? 1 : 0) + 4] = 2;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    if (f141e && f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, 20, i26, i27);
                                                    }
                                                    if (f141e || f58B != i23) {
                                                        int i45 = 32;
                                                        if (b4 == -1) {
                                                            i5 = 17;
                                                        } else if (b4 != -2) {
                                                            i5 = b4 & 3;
                                                            if (i5 <= 0) {
                                                                i5 = 3;
                                                            }
                                                            if ((b4 & 4) > 0) {
                                                                m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                                int i46 = f159h[(i23 == true ? 1 : 0) + 5] * 7;
                                                                if (f155g[i46 + 1] != 1) {
                                                                    int i47 = f155g[i46 + 4] >> 6;
                                                                    i27 += i47;
                                                                    i45 = 32 - i47;
                                                                }
                                                            }
                                                        } else {
                                                            i5 = 20;
                                                        }
                                                        int i48 = ((i5 - 1) * 16) + 8;
                                                        int iM35a6 = m35a(i26, i27, i48, i45);
                                                        if (iM35a6 != -1 && f192r != 11) {
                                                            if (iM35a6 == 0 || iM35a6 == -2) {
                                                                if ((b4 & 4) > 0) {
                                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                                }
                                                                m68e(1);
                                                            } else if (iM35a6 != 2) {
                                                                m42a(iM35a6, i26, i27, i48, 32, true);
                                                            }
                                                        }
                                                    } else {
                                                        m68e(3);
                                                    }
                                                    break;
                                                case 4:
                                                    int iM35a7 = m35a(i26, i27, 32, 32);
                                                    if (iM35a7 >= 0) {
                                                        m42a(iM35a7, i26, i27, 32, 32, true);
                                                        if (iM35a7 == 0) {
                                                            if (b4 == 0) {
                                                                f206z = -2200;
                                                            } else {
                                                                f206z = -2750;
                                                            }
                                                            m57b(9);
                                                        }
                                                    }
                                                    break;
                                                case 5:
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, 0, i26, i27);
                                                    }
                                                    if (f58B == i23) {
                                                        int i49 = ((f198t >> 6) - i26) >> 5;
                                                        for (int i50 = 5; i50 >= 0; i50--) {
                                                            int i51 = i50 - i49;
                                                            if (i51 < 0) {
                                                                i51 = -i51;
                                                            }
                                                            int i52 = 3 - i51;
                                                            if (i52 < 0) {
                                                                i52 = 0;
                                                            } else if (i52 > f175l[i49]) {
                                                                i52 = f175l[i49];
                                                            } else if (i52 > f175l[i50]) {
                                                                i52 = f175l[i50];
                                                            }
                                                            f179m[i50] = f171k[i52];
                                                            if (i50 == i49) {
                                                                f59C = f171k[i52];
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 6:
                                                    int i53 = i26 + 10;
                                                    if (f58B == -1 && (iM35a4 = m35a(i53, i27, 32, 32)) != -1) {
                                                        m41a(i23 == true ? 1 : 0, 22, i53, i27);
                                                        if (f58B != i23) {
                                                            if (iM35a4 == 1 || iM35a4 == 3 || iM35a4 == 2) {
                                                                m42a(iM35a4, i53, i27, 32, 32, true);
                                                            } else if (iM35a4 == -2) {
                                                                int i54 = (i53 << 6) + 1024;
                                                                if (f198t < i54 && f57A == 1) {
                                                                    m42a(3, i53, i27, 32, 32, true);
                                                                } else if (f198t > i54 && f57A == -1) {
                                                                    m42a(1, i53, i27, 32, 32, true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 7:
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, 3, i26, i27);
                                                    }
                                                    if (f159h[(i23 == true ? 1 : 0) + 4] == 1) {
                                                        m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    }
                                                    break;
                                                case 8:
                                                    if (f192r != 10 && f192r != 11 && b5 != 1 && m35a(i26, i27, 16, 52) != -1) {
                                                        f71O = i23 == true ? 1 : 0;
                                                        System.currentTimeMillis();
                                                        f159h[(i23 == true ? 1 : 0) + 4] = 1;
                                                    }
                                                    break;
                                                case 9:
                                                    if ((f198t >> 6) > i26) {
                                                        f159h[(i23 == true ? 1 : 0) + 4] = 1;
                                                    }
                                                    if (f192r < 7 && f159h[(i23 == true ? 1 : 0) + 4] == 1) {
                                                        m57b(12);
                                                        f57A = 1;
                                                    }
                                                    break;
                                                case 10:
                                                    if (b5 != 2) {
                                                        int i55 = f159h[(i23 == true ? 1 : 0) + 5] * 11;
                                                        if (f191q[i55] == -1 && (i26 + 32 < f151g || i26 > f172l || i27 + 32 < f156h || i27 > f176m)) {
                                                            int i56 = i27 << 6;
                                                            f191q[i55 + 1] = i56;
                                                            f191q[i55 + 2] = i26 << 6;
                                                            f191q[i55 + 3] = i56;
                                                            byte b11 = f159h[(i23 == true ? 1 : 0) + 1];
                                                            f191q[i55] = b11;
                                                            f191q[i55 + 6] = 0;
                                                            f191q[i55 + 10] = i23 == true ? 1 : 0;
                                                            int iM7a = C0003d.m7a();
                                                            switch (b11) {
                                                                case 0:
                                                                    f191q[i55 + 4] = -300;
                                                                    C0003d.m14b(iM7a, f145e[0], 3);
                                                                    break;
                                                                case 1:
                                                                    f191q[i55 + 5] = -1424;
                                                                    C0003d.m11a(iM7a, f145e[2]);
                                                                    break;
                                                                case 2:
                                                                    f191q[i55 + 4] = -176;
                                                                    f191q[i55 + 8] = 2;
                                                                    C0003d.m14b(iM7a, f138d[0], 4);
                                                                    break;
                                                                case 3:
                                                                    f191q[i55 + 6] = 0;
                                                                    C0003d.m11a(iM7a, f145e[2]);
                                                                    break;
                                                            }
                                                            f191q[i55 + 9] = iM7a;
                                                        }
                                                    }
                                                    break;
                                                case 11:
                                                    if (b5 != 2 && (iM35a = m35a(i26, i27, 64, 64)) >= 0) {
                                                        int i57 = f204x > 0 ? 1 : -1;
                                                        int i58 = f204x;
                                                        if (f192r != 6 || i58 * i57 <= 768) {
                                                            m42a(iM35a, i26, i27, 64, 64, true);
                                                        } else {
                                                            f204x -= i57 << 6;
                                                            f159h[(i23 == true ? 1 : 0) + 4] = 2;
                                                        }
                                                    }
                                                    break;
                                                case 12:
                                                    int i59 = f198t >> 6;
                                                    if (i59 + 13 >= i26 && i59 - 18 <= i26 + 256) {
                                                        int i60 = (((64 - f87a) << 1) + i26) - 16;
                                                        if (m35a(i60, i27, 32, 32) != -1) {
                                                            m68e(0);
                                                        } else if (m35a(i60 + 128, i27, 32, 32) != -1) {
                                                            m68e(0);
                                                        }
                                                    }
                                                    break;
                                                case 13:
                                                    int iM35a8 = m35a(i26, i27, 256, 32);
                                                    if (iM35a8 >= 0 && iM35a8 != 2) {
                                                        m68e(3);
                                                    }
                                                    break;
                                                case 14:
                                                    int iM35a9 = m35a(i26, i27, 32, 32);
                                                    if (iM35a9 >= 0 && iM35a9 != 2) {
                                                        m42a(iM35a9, i26, i27, 32, 32, false);
                                                    }
                                                    break;
                                                case 15:
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, 22, i26, i27);
                                                    }
                                                    if (f58B == -1 && m35a(i26, i27, 32, 32) == 3) {
                                                        f204x = -4096;
                                                        f88a = true;
                                                        m57b(5);
                                                    }
                                                    break;
                                                case 16:
                                                    int i61 = f159h[(i23 == true ? 1 : 0) + 5] << 1;
                                                    if (i26 + 32 < f151g || i26 > f172l) {
                                                        if (b5 == 1) {
                                                            f159h[(i23 == true ? 1 : 0) + 4] = 0;
                                                            f194r[i61] = 0;
                                                        }
                                                    } else if (b5 == 0) {
                                                        if (f194r[i61] == 0) {
                                                            f194r[i61] = ((2 - b4) * 10) + 10;
                                                        } else {
                                                            int[] iArr = f194r;
                                                            int i62 = iArr[i61] - 1;
                                                            iArr[i61] = i62;
                                                            if (i62 == 0) {
                                                                f194r[i61 + 1] = ((1344 >> b4) + 672) * (-1);
                                                                f159h[(i23 == true ? 1 : 0) + 4] = 1;
                                                            }
                                                        }
                                                    } else if (b5 == 1) {
                                                        int[] iArr2 = f194r;
                                                        iArr2[i61] = iArr2[i61] + f194r[i61 + 1];
                                                        int[] iArr3 = f194r;
                                                        int i63 = i61 + 1;
                                                        iArr3[i63] = iArr3[i63] + 112;
                                                        int i64 = f194r[i61];
                                                        if (i64 > 0) {
                                                            f159h[(i23 == true ? 1 : 0) + 4] = 0;
                                                            f194r[i61] = 10;
                                                        }
                                                        if (m35a(i26, (i64 >> 6) + i27, (int) f83a, (int) f110b) != -1) {
                                                            m68e(0);
                                                        }
                                                    }
                                                    break;
                                                case 17:
                                                case 24:
                                                case 31:
                                                case 32:
                                                case 38:
                                                case 43:
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, f155g[f159h[(i23 == true ? 1 : 0) + 5] * 7], i26, i27);
                                                    }
                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    break;
                                                case 18:
                                                    int i65 = (b4 & 3) > 0 ? b4 & 3 : 3;
                                                    int i66 = f159h[(i23 == true ? 1 : 0) + 5] * 7;
                                                    int i67 = f155g[i66 + 4] >> 6;
                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    int i68 = i26 + i67;
                                                    if (f58B != i23 || (i68 << 6) < f198t) {
                                                        if (f58B == -1) {
                                                            m41a(i23 == true ? 1 : 0, 21, i68, i27);
                                                        }
                                                        if (f58B == -1 && (iM35a3 = m35a(i68, i27, 32, ((i65 - 1) * 16) + 8)) != -1) {
                                                            if ((iM35a3 == 3 || iM35a3 == -2) && f155g[i66 + 1] != 1) {
                                                                m68e(1);
                                                            } else if (f155g[i66 + 1] != 1) {
                                                                m42a(iM35a3, i68, i27, 32, 32, true);
                                                            }
                                                        }
                                                    } else {
                                                        f58B = -1;
                                                        f205y = 0;
                                                        f206z = 0;
                                                        m57b(7);
                                                        m69f();
                                                    }
                                                    break;
                                                case 19:
                                                    int i69 = (b4 & 3) > 0 ? b4 & 3 : 3;
                                                    int i70 = f159h[(i23 == true ? 1 : 0) + 5] * 7;
                                                    int i71 = f155g[i70 + 4] >> 6;
                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    int i72 = i26 - i71;
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, 21, i72, i27);
                                                    }
                                                    if (f58B == i23 && ((i72 + 32) << 6) < f198t) {
                                                        f58B = -1;
                                                        f205y = 0;
                                                        f206z = 0;
                                                        m57b(7);
                                                        m69f();
                                                    } else if (f58B == -1 && (iM35a2 = m35a(i72, i27, 32, ((i69 - 1) * 16) + 8)) != -1) {
                                                        if ((iM35a2 == 1 || iM35a2 == -2) && f155g[i70 + 1] != 1) {
                                                            m68e(1);
                                                        } else if (f155g[i70 + 1] != 1) {
                                                            m42a(iM35a2, i72, i27, 32, 32, true);
                                                        }
                                                    }
                                                    break;
                                                case 20:
                                                case 25:
                                                case 29:
                                                case 30:
                                                case 41:
                                                case 42:
                                                    int i73 = f159h[(i23 == true ? 1 : 0) + 5] * 7;
                                                    int i74 = f155g[i73];
                                                    int i75 = f150f[i74];
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, i74, i26, i27);
                                                    }
                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, i74, i26, i27);
                                                    }
                                                    if (f58B == -1) {
                                                        int i76 = i26 + (f155g[i73 + 3] >> 6);
                                                        int i77 = i27 + (f155g[i73 + 4] >> 6);
                                                        int iM35a10 = m35a(i76, i77, i75, 160);
                                                        int i78 = f192r < 7 ? f204x : f205y;
                                                        if (i78 > 0) {
                                                            if (iM35a10 == 3) {
                                                                m42a(iM35a10, i76, i77, i75, 32, true);
                                                            } else if (iM35a10 == -2) {
                                                                if (f198t < (i76 << 6) + (i75 << 5)) {
                                                                    m42a(3, i76, i77, i75, 32, true);
                                                                }
                                                            }
                                                        } else if (i78 < 0) {
                                                            if (iM35a10 == 1) {
                                                                m42a(iM35a10, i76, i77, i75, 32, true);
                                                            } else if (iM35a10 == -2) {
                                                                if (f198t > (i76 << 6) + (i75 << 5)) {
                                                                    m42a(1, i76, i77, i75, 32, true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 21:
                                                case 22:
                                                    if (b5 != 2) {
                                                        if (f58B == -1) {
                                                            int i79 = f192r;
                                                            m41a(i23 == true ? 1 : 0, b3 == 21 ? 1 : 2, i26, i27);
                                                            if (f58B != -1) {
                                                                int iM33a2 = m33a(m34a(f198t >> 11, f200u >> 11));
                                                                if (iM33a2 < 1 || iM33a2 >= 10) {
                                                                    f159h[(i23 == true ? 1 : 0) + 4] = 1;
                                                                } else {
                                                                    f192r = i79;
                                                                    f58B = -1;
                                                                }
                                                            }
                                                        }
                                                        if (b5 == 1) {
                                                            m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                        }
                                                    }
                                                    break;
                                                case 23:
                                                case 35:
                                                    int i80 = f155g[f159h[(i23 == true ? 1 : 0) + 5] * 7];
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, i80, i26, i27);
                                                    }
                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, i80, i26, i27);
                                                    }
                                                    break;
                                                case 26:
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, 16, i26, i27);
                                                    }
                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, 16, i26, i27);
                                                    }
                                                    int i81 = f155g[(f159h[(i23 == true ? 1 : 0) + 5] * 7) + 4];
                                                    int i82 = i81 >> 6;
                                                    int iM54b = i27 + ((i81 + m54b(16, 0)) >> 6);
                                                    if (f58B == i23 && i82 < 30 && m33a(m34a(f198t >> 11, f200u >> 11)) != -1) {
                                                        m68e(4);
                                                    }
                                                    int i83 = i26 + 13;
                                                    int iM35a11 = m35a(i83, iM54b, 33, 144);
                                                    switch (iM35a11) {
                                                        case -2:
                                                            if (f192r < 7) {
                                                                if (f198t < ((i83 + 16) << 6)) {
                                                                    m42a(3, i83, iM54b, 33, 144, true);
                                                                } else {
                                                                    m42a(1, i83, iM54b, 33, 144, true);
                                                                }
                                                            } else if (f200u < ((iM54b + 72) << 6)) {
                                                                m68e(4);
                                                            }
                                                            break;
                                                        case 0:
                                                            m68e(4);
                                                            break;
                                                        case 2:
                                                            f206z = -(f206z - (f206z >> 2));
                                                            f200u = (((iM54b + 144) + 30) << 6) + 64;
                                                        case 1:
                                                        case 3:
                                                            m42a(iM35a11, i83, iM54b, 33, 144, true);
                                                            break;
                                                    }
                                                    break;
                                                case 27:
                                                case 33:
                                                    int i84 = f159h[(i23 == true ? 1 : 0) + 5] * 7;
                                                    int i85 = f155g[i84];
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, i85, i26, f165j.f49b + i27);
                                                    }
                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    if (f58B == -1) {
                                                        short s3 = f117b[0].f49b;
                                                        int i86 = f165j.f49b + f173l.f49b + (f155g[i84 + 4] >> 6) + i27;
                                                        int i87 = b3 == 27 ? f74R : f77U;
                                                        int iM35a12 = m35a(i26, i86, i87, (int) s3);
                                                        if (iM35a12 != -1) {
                                                            m42a(iM35a12, i26, i86, i87, (int) s3, true);
                                                        }
                                                        if (m35a(i26 + 14, i86 + s3, i87 - 33, 32) != -1) {
                                                            m68e(0);
                                                        }
                                                    }
                                                    break;
                                                case 28:
                                                    int i88 = f159h[(i23 == true ? 1 : 0) + 5] * 7;
                                                    int i89 = f155g[i88];
                                                    if (f58B == -1) {
                                                        m41a(i23 == true ? 1 : 0, i89, i26 - 8, i27);
                                                    }
                                                    int i90 = (f165j.f46a >> 1) + i26;
                                                    if (i90 > f151g && i90 < f172l) {
                                                        m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    }
                                                    if (f58B == -1) {
                                                        short s4 = f117b[0].f49b;
                                                        int i91 = i27 + f165j.f49b + (f155g[i88 + 4] >> 6) + f173l.f49b;
                                                        int i92 = i26 << 6;
                                                        int i93 = f165j.f46a << 6;
                                                        int iM35a13 = m35a(i26, i91, (int) f165j.f46a, (int) s4);
                                                        if (iM35a13 != -1 && iM35a13 != 0 && iM35a13 != -2) {
                                                            m42a(iM35a13, i26, i91, (int) f165j.f46a, (int) s4, true);
                                                        } else if (iM35a13 == -2) {
                                                            boolean z4 = (f198t + 832 > i92 + 256) || (f198t + (-1152) > (i92 + i93) + (-256));
                                                            if (f192r >= 7 || !z4) {
                                                                int i94 = (i93 >> 1) + i92;
                                                                if (f198t < i94) {
                                                                    m42a(3, i26, i91, (int) f165j.f46a, (int) s4, true);
                                                                } else if (f198t > i94) {
                                                                    m42a(1, i26, i91, (int) f165j.f46a, (int) s4, true);
                                                                }
                                                            } else {
                                                                m68e(0);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 34:
                                                case 36:
                                                    int i95 = ((b4 & 255) * 200) / 100;
                                                    int i96 = f159h[(i23 == true ? 1 : 0) + 5] * 3;
                                                    if (b5 == 0 && i26 > f151g - 32 && i26 < f172l && i27 > f156h - 32 && i27 < f176m) {
                                                        f159h[(i23 == true ? 1 : 0) + 4] = 1;
                                                        f197s[i96] = 20;
                                                    } else if (b5 == 1) {
                                                        int[] iArr4 = f197s;
                                                        int i97 = iArr4[i96] - 1;
                                                        iArr4[i96] = i97;
                                                        if (i97 <= 0) {
                                                            if (b3 == 36) {
                                                                int[] iArr5 = f197s;
                                                                int i98 = i96 + 2;
                                                                iArr5[i98] = iArr5[i98] + 336;
                                                                z2 = (f197s[i96 + 2] >> 6) > i95;
                                                                s = f130c[0][0].f46a;
                                                                i4 = f130c[0][0].f49b;
                                                            } else {
                                                                int[] iArr6 = f197s;
                                                                int i99 = i96 + 1;
                                                                iArr6[i99] = iArr6[i99] + 336;
                                                                z2 = (f197s[i96 + 1] >> 6) > i95;
                                                                s = f130c[2][0].f46a;
                                                                i4 = f130c[2][0].f49b >> 1;
                                                            }
                                                            int i100 = (i26 << 6) + f197s[i96 + 1];
                                                            int i101 = (i27 << 6) + f197s[i96 + 2];
                                                            if (m55b(i100, i101, s << 6, i4 << 6) != -1) {
                                                                m68e(0);
                                                            }
                                                            int i102 = i100 >> 6;
                                                            int i103 = i101 >> 6;
                                                            if (z2 || i102 > f172l || i103 > f176m) {
                                                                f197s[i96 + 1] = 0;
                                                                f197s[i96 + 2] = 0;
                                                                f159h[(i23 == true ? 1 : 0) + 4] = 0;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 37:
                                                    int i104 = f159h[(i23 == true ? 1 : 0) + 5] * 3;
                                                    if (b5 == 0) {
                                                        int[] iArr7 = f199t;
                                                        int i105 = iArr7[i104] + 1;
                                                        iArr7[i104] = i105;
                                                        if (i105 == 20) {
                                                            f199t[i104 + 1] = 0;
                                                            f199t[i104 + 2] = 0;
                                                            f159h[(i23 == true ? 1 : 0) + 4] = 1;
                                                        }
                                                    } else if (b5 == 1) {
                                                        int[] iArr8 = f199t;
                                                        int i106 = i104 + 1;
                                                        iArr8[i106] = iArr8[i106] + f199t[i104 + 2];
                                                        int[] iArr9 = f199t;
                                                        int i107 = i104 + 2;
                                                        iArr9[i107] = iArr9[i107] + 80;
                                                        int i108 = f199t[i104 + 1] - 16640;
                                                        if (i108 > 23040 && (i108 >> 6) > f176m) {
                                                            f199t[i104] = 0;
                                                            f159h[(i23 == true ? 1 : 0) + 4] = 0;
                                                        }
                                                        if (m55b(i26 << 6, (f199t[i104 + 1] + (i27 << 6)) - 16640, 4096, 16640) != -1) {
                                                            m68e(0);
                                                        }
                                                    }
                                                    break;
                                                case 40:
                                                    int iM35a14 = m35a(i26, i27, 64, 64);
                                                    if (iM35a14 == 3 || iM35a14 == 1) {
                                                        f205y = 0;
                                                        f204x = 0;
                                                        m42a(iM35a14, i26, i27, 64, 64, false);
                                                    } else if (iM35a14 == 2 && f206z < 0) {
                                                        f206z = (-f206z) - (f206z >> 2);
                                                    } else if (iM35a14 == 0 || iM35a14 == -2) {
                                                        if (f198t < (i26 << 6) + 2048) {
                                                            m42a(3, i26, i27, 64, 64, true);
                                                        } else {
                                                            m42a(1, i26, i27, 64, 64, true);
                                                        }
                                                    }
                                                    break;
                                                case 44:
                                                    m59b(i23 == true ? 1 : 0, (int) b4, i26, i27);
                                                    int iM54b2 = i27 + ((f155g[(f159h[(i23 == true ? 1 : 0) + 5] * 7) + 4] + m54b(16, 0)) >> 6);
                                                    int i109 = i26 + 12;
                                                    int iM35a15 = m35a(i109, iM54b2, 35, 144);
                                                    switch (iM35a15) {
                                                        case -2:
                                                        case 2:
                                                            if (f192r >= 7) {
                                                                f206z = -(f206z - (f206z >> 2));
                                                                f200u = (((iM54b2 + 144) + 30) << 6) + 64;
                                                            } else {
                                                                m68e(4);
                                                            }
                                                            break;
                                                        case 1:
                                                        case 3:
                                                            m42a(iM35a15, i109, iM54b2, 35, 144, true);
                                                            break;
                                                    }
                                                    break;
                                                case 46:
                                                case 47:
                                                    if (m35a(i26, i27, 64, 32) != -1) {
                                                        if (b4 == 1 && (f198t >> 6) > i26) {
                                                            f153g = true;
                                                            f95aa = i26;
                                                        } else if (b4 == 2 && (f198t >> 6) < i26 + 64) {
                                                            f153g = true;
                                                            f82Z = i26 + 64;
                                                        } else if (b4 == 0) {
                                                            f153g = true;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        i20 = i22 + 1;
                                        i21 = (i23 == true ? 1 : 0) + 9;
                                    }
                                }
                            }
                        }
                    }
                    for (int i110 = 0; i110 < f188p.length; i110++) {
                        int i111 = f188p[i110];
                        byte b12 = f159h[i111 + 1];
                        int i112 = f159h[i111 + 5] * 7;
                        if (f155g[i112 + 2] == 0) {
                            m59b(i111, (int) b12, 0, 0);
                        }
                        f155g[i112 + 2] = 0;
                    }
                    int i113 = f106al;
                    int i114 = f107am;
                    int i115 = (i114 << 4) + i113;
                    int i116 = f104aj + i115;
                    if (i114 == 1 && i116 > 5760) {
                        i115 += 64;
                        i114 = -i114;
                    } else if (i114 == -1 && i116 < 5760) {
                        i115 -= 64;
                        i114 = -i114;
                    } else if (i116 >= 11520) {
                        i116 = 11520;
                        i115 = 0;
                    } else if (i116 <= 0) {
                        i116 = 0;
                        i115 = 0;
                    }
                    f106al = i115;
                    f104aj = i116;
                    f105ak = 11520 - i116;
                    f107am = i114;
                    short s5 = (short) (f87a - 1);
                    f87a = s5;
                    if (s5 < 0) {
                        f87a = (short) (f87a + 64);
                    }
                    C0003d.m13b(f80X);
                    C0003d.m13b(f81Y);
                    m73h();
                    if (f192r < 7 && f100af == 1 && !f134d && f192r < 7 && f58B == -1 && ((iM34a = m34a(f198t >> 11, f200u >> 11)) == 19 || iM34a == 20)) {
                        if (f126c[(f198t >> 14) + ((f200u >> 14) * f122c)] != 31) {
                            m68e(0);
                        }
                    }
                    if (f96ab > 0) {
                        int i117 = f98ad - 1;
                        f98ad = i117;
                        if (i117 == 0) {
                            f96ab = 0;
                        } else {
                            int i118 = f99ae << 6;
                            int i119 = f97ac;
                            for (int i120 = 0; i120 <= i119; i120 += 4) {
                                int i121 = f201u[i120];
                                int i122 = f201u[i120 + 1];
                                if (i122 != 0) {
                                    int i123 = f201u[i120 + 2];
                                    int i124 = f201u[i120 + 3] + 112;
                                    int i125 = i121 + i123;
                                    int i126 = i122 + i124;
                                    if (i123 > 0) {
                                        i = (i121 + i118) >> 11;
                                        i2 = (i125 + i118) >> 11;
                                    } else {
                                        i = i121 >> 11;
                                        i2 = i125 >> 11;
                                    }
                                    int i127 = (i122 + i118) >> 11;
                                    int i128 = (i126 + i118) >> 11;
                                    int iM33a3 = m33a(m34a(i2, i128));
                                    if (iM33a3 < 0 || iM33a3 >= 10) {
                                        z = false;
                                        i3 = i126;
                                    } else if (i128 > i127) {
                                        int i129 = -((i124 >> 1) + (i124 >> 2));
                                        i3 = (i128 << 11) - i118;
                                        if (i129 >= 0 || i129 <= -64) {
                                            z = false;
                                            i124 = i129;
                                        } else {
                                            z = true;
                                            i124 = i129;
                                        }
                                    } else if ((i2 <= i || i128 != i127) && i2 >= i) {
                                        z = false;
                                        i3 = i126;
                                    } else {
                                        i123 = -i123;
                                        z = false;
                                        i3 = i126;
                                        i125 = i121;
                                    }
                                    int i130 = (f198t - 1152) - i118;
                                    int i131 = f198t + 832;
                                    int i132 = (f200u - 1920) - i118;
                                    int i133 = f200u - 64;
                                    boolean z5 = f98ad > 45;
                                    if (z) {
                                        f201u[i120 + 1] = 0;
                                        f96ab--;
                                    } else if (z5 || i125 <= i130 || i125 >= i131 || i3 <= i132 || i3 >= i133) {
                                        f201u[i120] = i125;
                                        f201u[i120 + 1] = i3;
                                        f201u[i120 + 2] = i123;
                                        f201u[i120 + 3] = i124;
                                    } else {
                                        m70f(f64H + 1);
                                        f201u[i120 + 1] = 0;
                                        f96ab--;
                                    }
                                }
                            }
                        }
                    }
                    m75j();
                    return;
                }
                return;
            case 3:
                m51a(true);
                f111b = 2;
                return;
            case 4:
                if (System.currentTimeMillis() - f123c > 3000 || RunnableC0010k.m116c(16) || RunnableC0010k.m116c(32)) {
                    if (f125c && f63G > 0) {
                        f125c = false;
                        f111b = 3;
                        return;
                    } else if (RunnableC0010k.f237f != 1 && RunnableC0010k.f237f != 2) {
                        f111b = 0;
                        RunnableC0010k.f221a.m126a(false);
                        return;
                    } else {
                        C0004e.m15a(1);
                        f111b = 0;
                        RunnableC0010k.m102b();
                        return;
                    }
                }
                return;
            case 5:
                if (System.currentTimeMillis() - f123c > 3000 || RunnableC0010k.m116c(16) || RunnableC0010k.m116c(32)) {
                    if (RunnableC0010k.f237f == 1 || RunnableC0010k.f237f == 2) {
                        C0004e.m15a(1);
                        f111b = 0;
                        RunnableC0010k.m102b();
                        return;
                    }
                    C0004e.m15a(1);
                    f71O = 0;
                    if (f100af == 1 && f101ag == 2) {
                        RunnableC0010k.f221a.m126a(false);
                        return;
                    }
                    f65I += f70N + f69M;
                    try {
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        if (f101ag == 2) {
                            m40a(f100af + 1, 0);
                        } else {
                            m40a(f100af, f101ag + 1);
                        }
                        while (System.currentTimeMillis() - jCurrentTimeMillis3 < 2000) {
                        }
                        f111b = 1;
                        m63c();
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            default:
                return;
        }
        m51a(false);
        f111b = 2;
        f166j = false;
    }

    /* JADX INFO: renamed from: c */
    private static void m64c(int i) {
        if (i != f57A) {
            f57A = i;
            m57b(f192r);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:163:0x0298  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX INFO: renamed from: d */
    private static void m65d() {
        boolean z;
        int i;
        int i2;
        f202v = f198t;
        f203w = f200u;
        f59C = 0;
        f195s++;
        boolean zM109b = RunnableC0010k.m109b(4);
        boolean zM109b2 = RunnableC0010k.m109b(8);
        if (zM109b && zM109b2) {
            zM109b2 = false;
            zM109b = false;
        }
        if (f192r != 10) {
            if (zM109b) {
                m64c(-1);
            }
            if (zM109b2) {
                m64c(1);
            }
        }
        if (f192r < 7) {
            if (RunnableC0010k.m116c(1)) {
                m66d(1);
            } else if (RunnableC0010k.m116c(256)) {
                m66d(0);
                return;
            } else if (RunnableC0010k.m116c(512)) {
                m66d(2);
                return;
            }
        }
        switch (f192r) {
            case 0:
                if (f195s >= 30) {
                    m57b(1);
                }
                if (RunnableC0010k.m109b(16)) {
                    m57b(3);
                    m72g(0);
                } else if (RunnableC0010k.m109b(2)) {
                    m57b(2);
                    m72g(1);
                } else if (zM109b) {
                    f204x = -f61E;
                    m57b(5);
                    m65d();
                } else if (zM109b2) {
                    f204x = f61E;
                    m57b(5);
                    m65d();
                }
                if (f192r == 5 && f192r != 6) {
                    C0003d.m13b(f186p);
                } else {
                    int iAbs = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                    f189q = iAbs;
                    int i3 = iAbs % (f62F * 15);
                    f189q = i3;
                    int i4 = i3 / f62F;
                    i = f186p;
                    i2 = i4 % C0003d.f18a[i];
                    C0003d.f22b[i] = i2;
                    if (C0003d.f20a[i] != null) {
                        C0003d.f23c[i] = C0003d.f20a[i][i2];
                    } else {
                        C0003d.f23c[i] = i2;
                    }
                }
                break;
            case 1:
                if (RunnableC0010k.m109b(16)) {
                    m57b(3);
                    m72g(0);
                } else if (RunnableC0010k.m109b(2)) {
                    m57b(2);
                    m72g(1);
                } else if (zM109b) {
                    f204x = -f61E;
                    m57b(5);
                    m65d();
                } else if (zM109b2) {
                    f204x = f61E;
                    m57b(5);
                    m65d();
                }
                if (f192r == 5) {
                }
                int iAbs2 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs2;
                int i5 = iAbs2 % (f62F * 15);
                f189q = i5;
                int i6 = i5 / f62F;
                i = f186p;
                i2 = i6 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
            case 2:
                if (RunnableC0010k.m109b(2)) {
                    m72g(1);
                } else {
                    m57b(0);
                }
                if (f192r == 5) {
                }
                int iAbs3 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs3;
                int i7 = iAbs3 % (f62F * 15);
                f189q = i7;
                int i8 = i7 / f62F;
                i = f186p;
                i2 = i8 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
            case 3:
                if (RunnableC0010k.m109b(16)) {
                    m72g(0);
                } else {
                    m57b(0);
                }
                if (f192r == 5) {
                }
                int iAbs4 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs4;
                int i9 = iAbs4 % (f62F * 15);
                f189q = i9;
                int i10 = i9 / f62F;
                i = f186p;
                i2 = i10 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
            case 4:
            default:
                if (f192r == 5) {
                }
                int iAbs5 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs5;
                int i11 = iAbs5 % (f62F * 15);
                f189q = i11;
                int i12 = i11 / f62F;
                i = f186p;
                i2 = i12 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
            case 5:
                if (!RunnableC0010k.m109b(2)) {
                    if (f204x > 0 || (f204x == 0 && f57A > 0)) {
                        if (zM109b2) {
                            f204x += 48;
                        } else if (!zM109b) {
                            int i13 = f204x - 48;
                            f204x = i13;
                            if (i13 <= 0) {
                                f204x = 0;
                                m57b(0);
                            }
                        } else {
                            f204x -= 384;
                        }
                        if (f88a) {
                            if (f204x < f62F) {
                                f88a = false;
                            }
                        } else if (f204x > f62F) {
                            f204x = f62F;
                        }
                    } else if (f204x < 0 || (f204x == 0 && f57A < 0)) {
                        if (zM109b) {
                            f204x -= 48;
                        } else if (!zM109b2) {
                            int i14 = f204x + 48;
                            f204x = i14;
                            if (i14 >= 0) {
                                f204x = 0;
                                m57b(0);
                            }
                        } else {
                            f204x += 384;
                        }
                        if (f88a) {
                            if (f204x > (-f62F)) {
                                f88a = false;
                            }
                        } else if (f204x < (-f62F)) {
                            f204x = -f62F;
                        }
                    }
                    if ((f204x > 0 ? f204x : -f204x) >= f62F) {
                        C0003d.m12a(f186p, f94a[f57A == 1 ? '\b' : (char) 18], 1);
                    } else {
                        C0003d.m12a(f186p, f94a[f57A == 1 ? (char) 6 : (char) 16], 1);
                    }
                    m67e();
                    if (f192r == 5) {
                    }
                    int iAbs6 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                    f189q = iAbs6;
                    int i15 = iAbs6 % (f62F * 15);
                    f189q = i15;
                    int i16 = i15 / f62F;
                    i = f186p;
                    i2 = i16 % C0003d.f18a[i];
                    C0003d.f22b[i] = i2;
                    if (C0003d.f20a[i] != null) {
                        C0003d.f23c[i] = C0003d.f20a[i][i2];
                    } else {
                        C0003d.f23c[i] = i2;
                    }
                } else {
                    m57b(6);
                    m65d();
                }
                break;
            case 6:
                if (f204x > 0 || (f204x == 0 && f57A > 0)) {
                    int i17 = f204x - 48;
                    f204x = i17;
                    if (i17 <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (f204x < 0 || (f204x == 0 && f57A < 0)) {
                    int i18 = f204x + 48;
                    f204x = i18;
                    if (i18 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    f204x = 0;
                    if (RunnableC0010k.m109b(2)) {
                        m57b(2);
                    } else {
                        m57b(0);
                    }
                }
                m67e();
                if (f192r == 5) {
                }
                int iAbs7 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs7;
                int i19 = iAbs7 % (f62F * 15);
                f189q = i19;
                int i110 = i19 / f62F;
                i = f186p;
                i2 = i110 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
            case 7:
            case 8:
            case 10:
                m69f();
                if (f192r == 5) {
                }
                int iAbs8 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs8;
                int i111 = iAbs8 % (f62F * 15);
                f189q = i111;
                int i112 = i111 / f62F;
                i = f186p;
                i2 = i112 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
            case 9:
                if (f206z > 0) {
                    m57b(7);
                    C0003d.f24d[f186p] = 2;
                }
                m69f();
                if (f192r == 5) {
                }
                int iAbs9 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs9;
                int i113 = iAbs9 % (f62F * 15);
                f189q = i113;
                int i114 = i113 / f62F;
                i = f186p;
                i2 = i114 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
            case 11:
                if ((f200u >> 6) - 30 > f176m) {
                    if (f63G <= 0 || f125c) {
                        f123c = System.currentTimeMillis();
                        f111b = 4;
                    } else {
                        f111b = 3;
                    }
                }
                f200u += f206z;
                f206z += 224;
                if (f192r == 5) {
                }
                int iAbs10 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs10;
                int i115 = iAbs10 % (f62F * 15);
                f189q = i115;
                int i116 = i115 / f62F;
                i = f186p;
                i2 = i116 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
            case 12:
                m64c(1);
                if (f192r == 12) {
                    f204x += 48;
                }
                if (f204x >= f62F) {
                    C0003d.m12a(f186p, f94a[8], 1);
                } else {
                    C0003d.m12a(f186p, f94a[6], 1);
                }
                m67e();
                if (f198t > ((f139e + 1) << 11)) {
                    f123c = System.currentTimeMillis();
                    f111b = 5;
                }
                if (f192r == 5) {
                }
                int iAbs11 = Math.abs(Math.max(f204x, f62F >> 1)) + f189q;
                f189q = iAbs11;
                int i117 = iAbs11 % (f62F * 15);
                f189q = i117;
                int i118 = i117 / f62F;
                i = f186p;
                i2 = i118 % C0003d.f18a[i];
                C0003d.f22b[i] = i2;
                if (C0003d.f20a[i] != null) {
                    C0003d.f23c[i] = C0003d.f20a[i][i2];
                } else {
                    C0003d.f23c[i] = i2;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m66d(int i) {
        short s;
        if (f58B < 0) {
            int i2 = f198t >> 11;
            int i3 = f200u >> 11;
            int iM33a = m33a(m34a(i2, i3));
            if (iM33a == -1) {
                iM33a = f142e[m34a(i2, i3 + 1)];
            }
            s = f92a[iM33a];
        } else {
            s = f92a[0];
        }
        f205y = ((m53b((int) s) * 1664) >> 10) + f204x;
        f206z = -((m61c((int) s) * 1664) >> 10);
        if (i == 0) {
            f205y -= 96;
        } else if (i == 2) {
            f205y += 96;
        }
        f58B = -1;
        f164j = f200u >> 6;
        m57b(8);
        m69f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    private static void m67e() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (f58B < 0) {
            int i6 = f198t >> 11;
            int i7 = f200u >> 11;
            int i8 = f198t - (i6 << 11);
            int i9 = f204x > 0 ? 1 : -1;
            int i10 = f204x * i9;
            if (f204x >= 0) {
                i8 = 2048 - (i8 + 1);
            }
            boolean z2 = true;
            int i11 = i8;
            while (z2) {
                int iM34a = m34a(i6, i7);
                int iM33a = m33a(iM34a);
                if (iM33a == -1) {
                    i7 = f200u - (i7 << 11) == 0 ? i7 - 1 : i7 + 1;
                } else {
                    int i12 = i7 << 11;
                    byte[] bArr = InterfaceC0002c.f16a[iM33a];
                    int i13 = f198t - (i6 << 11);
                    if (i13 >= 0 && i13 < 2048) {
                        f200u = ((bArr[i13 >> 6] + f149f[iM34a]) << 6) + i12;
                        short s = f92a[iM33a];
                        if (s != 0) {
                            int i14 = s + 90;
                            if ((i14 > 180 && f57A == 1) || (i14 < 180 && f57A == -1)) {
                                f204x = (m53b(i14) * f204x) >> 10;
                            } else if (i14 > 180 && f57A == -1) {
                                f204x -= 24;
                            } else if (i14 < 180 && f57A == 1) {
                                f204x += 24;
                            }
                        }
                    }
                    if (i10 == 0) {
                        return;
                    }
                    if (i10 > i11) {
                        f198t += i11 * i9;
                        i10 -= i11;
                        f200u = ((f149f[iM34a] + bArr[((i11 * i9) + i13) >> 6]) << 6) + i12;
                        switch (m37a(f198t, f200u, i9, 0, true)) {
                            case -1:
                                f198t += i9;
                                f205y = f204x;
                                f206z = 224;
                                if (f192r == 6) {
                                    m57b(8);
                                } else {
                                    m57b(7);
                                }
                                z = false;
                                i10 = 0;
                                break;
                            case 0:
                                f204x = 0;
                                i10 = 0;
                                z = z2;
                                break;
                            default:
                                i11 = 2048;
                                i6 += i9;
                                z = z2;
                                break;
                        }
                    } else {
                        f198t += i10 * i9;
                        i10 = 0;
                        z = z2;
                    }
                    i7 = f200u >> 11;
                    z2 = z;
                }
            }
            return;
        }
        byte b = f159h[f58B];
        int i15 = ((f159h[f58B + 2] & 255) + (f159h[f58B + 7] << 8)) << 6;
        int i16 = ((f159h[f58B + 3] & 255) + (f159h[f58B + 8] << 8)) << 6;
        int i17 = -1;
        switch (b) {
            case 2:
            case 4:
            case 15:
                i = 22;
                i2 = i16;
                i3 = i15;
                break;
            case 3:
                byte b2 = f159h[f58B + 1];
                if (b2 == -1) {
                    i4 = 17;
                } else {
                    i4 = b2 & 3;
                    if (i4 <= 0) {
                        i4 = 3;
                    }
                }
                i17 = (i4 << 4) << 6;
                i = 20;
                i2 = i16;
                i3 = i15;
                break;
            case 5:
                i = 0;
                i2 = i16;
                i3 = i15;
                break;
            case 6:
                i17 = 3328;
                i = 22;
                i2 = i16;
                i3 = i15;
                break;
            case 18:
            case 19:
                i17 = 2048;
                i = 21;
                i2 = i16;
                i3 = i15;
                break;
            case 27:
            case 33:
                int i18 = f159h[f58B + 5] * 7;
                int i19 = f155g[i18];
                int i20 = i15 + f155g[i18 + 3];
                int i21 = i16 + f155g[i18 + 4] + (f165j.f49b << 6);
                i = i19;
                i2 = i21;
                i3 = i20;
                break;
            case 28:
                int i22 = f159h[f58B + 5] * 7;
                int i23 = f155g[i22];
                int i24 = (i15 - 512) + f155g[i22 + 3];
                int i25 = i16 + f155g[i22 + 4];
                i = i23;
                i2 = i25;
                i3 = i24;
                break;
            default:
                int i26 = f159h[f58B + 5] * 7;
                int i27 = f155g[i26];
                int i28 = i15 + f155g[i26 + 3];
                int i29 = i16 + f155g[i26 + 4];
                i = i27;
                i2 = i29;
                i3 = i28;
                break;
        }
        if (i17 == -1) {
            i17 = f150f[i] << 6;
        }
        int i30 = f204x > 0 ? 1 : -1;
        int i31 = f204x * i30;
        while (i31 > 0) {
            int i32 = f198t - ((f198t >> 11) << 11);
            if (f204x >= 0) {
                i32 = 2048 - (i32 + 1);
            }
            if (i31 > i32) {
                f198t += i32 * i30;
                i5 = i31 - i32;
                switch (m37a(f198t, f200u, i30, 0, true)) {
                    case 0:
                        f204x = 0;
                        i5 = 0;
                        break;
                    case 1:
                        f198t += i30 * 64;
                        f58B = -1;
                        m52a();
                        m57b(5);
                        break;
                    default:
                        f198t += i30;
                        i31 = i5 - 1;
                        continue;
                }
            } else {
                f198t += i31 * i30;
                i5 = 0;
            }
            i31 = i5;
        }
        if (f198t >= i3 && f198t <= i17 + i3) {
            f200u = m54b(i, f198t - i3) + i2;
            return;
        }
        f58B = -1;
        f205y = f204x;
        f206z = 224;
        if (f192r == 6) {
            m57b(8);
        } else {
            m57b(7);
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m68e(int i) {
        short s;
        int i2;
        if (i == 1) {
            f134d = false;
        }
        if (i == 2) {
            f134d = false;
            f141e = false;
        }
        if (i == 3 || i == 4) {
            f134d = false;
            f141e = false;
            f148f = false;
        }
        if (i == 4) {
            m70f(0);
        }
        if (f141e || f134d) {
            return;
        }
        if (f148f) {
            f148f = false;
            f205y = f57A * (-512);
            f206z = -1024;
            f134d = true;
            f67K = 35;
            m57b(10);
            m65d();
            return;
        }
        f66J = 0;
        if (f64H == 0) {
            f63G--;
            f174l = true;
            f158h = true;
            f134d = false;
            f205y = 0;
            f206z = -1360;
            m57b(11);
        } else {
            int i3 = f64H;
            if (i3 > 32) {
                i3 = 32;
            }
            f96ab = i3;
            f97ac = (i3 - 1) << 2;
            int i4 = 0;
            int i5 = 0;
            while (i4 < i3) {
                if (i4 > 16) {
                    s = 512;
                    i2 = i4 - 16;
                } else {
                    s = 1024;
                    i2 = i4;
                }
                int i6 = ((i2 >> 1) * 2250) + 1125;
                if ((i4 & 1) == 1) {
                    i6 = 36000 - i6;
                }
                int i7 = i6 / 100;
                int i8 = (f144e[i7] * s) >> 10;
                int iM61c = (m61c(i7) * s) >> 10;
                f201u[i5] = f198t - 128;
                f201u[i5 + 1] = f200u - 1920;
                f201u[i5 + 2] = i8;
                f201u[i5 + 3] = -iM61c;
                i4++;
                i5 += 4;
            }
            f98ad = 60;
            f58B = -1;
            m70f(0);
            f134d = true;
            f67K = 35;
            f205y = f57A * (-512);
            f206z = -1024;
            m64c(-f57A);
            m57b(10);
        }
        C0004e.m19a(1000);
        m65d();
    }

    /* JADX INFO: renamed from: f */
    private static void m69f() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        if (f200u >= ((f146f - 1) << 11)) {
            m68e(4);
            return;
        }
        boolean zM109b = RunnableC0010k.m109b(4);
        boolean zM109b2 = RunnableC0010k.m109b(8);
        if (zM109b && zM109b2) {
            zM109b2 = false;
            zM109b = false;
        }
        if (RunnableC0010k.m109b(256) && !zM109b2) {
            m64c(-1);
            zM109b = true;
        } else if (RunnableC0010k.m109b(512) && !zM109b) {
            m64c(1);
            zM109b2 = true;
        }
        if (f192r != 10 && f192r != 11) {
            if (f192r != 9) {
                if (-896 <= f206z) {
                    RunnableC0010k.m103b(1);
                    RunnableC0010k.m103b(256);
                    RunnableC0010k.m103b(512);
                } else if (!RunnableC0010k.m109b(1) && !RunnableC0010k.m109b(256) && !RunnableC0010k.m109b(512)) {
                    f206z = -896;
                }
            }
            if (zM109b) {
                if (f205y == 0) {
                    f205y -= 192;
                } else {
                    int i6 = f205y - 96;
                    f205y = i6;
                    if (i6 > 0) {
                        f205y -= 192;
                    }
                }
            } else if (zM109b2) {
                if (f205y == 0) {
                    f205y += 192;
                } else {
                    int i7 = f205y + 96;
                    f205y = i7;
                    if (i7 < 0) {
                        f205y += 192;
                    }
                }
            }
        }
        if (f205y > f62F && !f88a) {
            f205y = f62F;
        }
        if (f205y < (-f62F) && !f88a) {
            f205y = -f62F;
        }
        int i8 = f198t;
        int i9 = f200u;
        if (f206z < 0) {
            i9 -= 1920;
        }
        int i10 = i8 - ((i8 >> 11) << 11);
        int i11 = i9 - ((i9 >> 11) << 11);
        int i12 = f205y <= 0 ? i10 : 2048 - (i10 + 1);
        int i13 = f206z <= 0 ? i11 : 2048 - (i11 + 1);
        if (f205y == 0) {
            i = 0;
        } else {
            i = f205y < 0 ? -1 : 1;
        }
        if (f206z == 0) {
            i2 = 0;
        } else {
            i2 = f206z < 0 ? -1 : 1;
        }
        int i14 = f205y;
        int i15 = f206z;
        if (i14 < 0) {
            i14 = -i14;
        }
        int i16 = i15 < 0 ? -i15 : i15;
        boolean z2 = f206z > 0 && m36a(f198t, f200u, 0, 0, 1, false) == 1;
        while (true) {
            if (i14 <= 0 && i16 <= 0) {
                break;
            }
            if (!z2) {
                if (i14 <= i12 && i16 <= i13) {
                    f198t += i14 * i;
                    f200u += i16 * i2;
                    break;
                }
                if (i12 * i16 < i13 * i14) {
                    int i17 = i14 == 0 ? 0 : (i16 * i12) / i14;
                    f198t += i12 * i;
                    f200u += i17 * i2;
                    i14 -= i12;
                    int i18 = i16 - i17;
                    i3 = 2048;
                    i4 = i13 - i17;
                    int iM37a = m37a(f198t, f200u, i, 0, false);
                    if (iM37a == 0) {
                        f205y = 0;
                        i5 = i18;
                        i14 = 0;
                        i16 = i5;
                        i13 = i4;
                        i12 = i3;
                    } else {
                        if (iM37a == 1) {
                            f198t += i;
                            z = true;
                        } else {
                            z = z2;
                        }
                        z2 = z;
                        i16 = i18;
                        i13 = i4;
                        i12 = 2048;
                    }
                } else {
                    int i19 = i16 == 0 ? 0 : (i14 * i13) / i16;
                    f198t += i19 * i;
                    f200u += i13 * i2;
                    i14 -= i19;
                    int i20 = i16 - i13;
                    i3 = i12 - i19;
                    i4 = 2048;
                    int iM37a2 = m37a(f198t, f200u, 0, i2, false);
                    if (iM37a2 == 0) {
                        f206z = 0;
                        i16 = 0;
                        i13 = 2048;
                        i12 = i3;
                    } else {
                        if (iM37a2 == 1) {
                            f200u += i2;
                            f204x = f205y;
                            z2 = true;
                            i5 = i20;
                        } else {
                            i5 = i20;
                        }
                        i16 = i5;
                        i13 = i4;
                        i12 = i3;
                    }
                }
            } else {
                boolean zM52a = m52a();
                m57b(5);
                if (!zM52a) {
                    break;
                }
                m67e();
                break;
            }
        }
        f206z += 224;
    }

    /* JADX INFO: renamed from: f */
    private static void m70f(int i) {
        if (f64H < 100 && i >= 100) {
            f63G++;
            f174l = true;
        }
        f64H = i;
        f170k = true;
        f158h = true;
    }

    /* JADX INFO: renamed from: g */
    private static void m71g() {
        if (f205y < 0) {
            f205y = Math.max(f205y, -416);
        } else if (f205y > 0) {
            f205y = Math.min(f205y, 416);
        }
        f206z = -1664;
        m57b(8);
        m69f();
    }

    /* JADX INFO: renamed from: g */
    private static void m72g(int i) {
        if (i == 0) {
            if (f160i > 0 || f160i <= -65) {
                return;
            }
            f160i -= 6;
            return;
        }
        if (f160i < 0 || f160i >= 97) {
            return;
        }
        f160i += 6;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x0316  */
    /* JADX WARN: Code duplicated, block: B:156:0x0335  */
    /* JADX WARN: Code duplicated, block: B:158:0x033e  */
    /* JADX WARN: Code duplicated, block: B:160:0x036d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0393  */
    /* JADX WARN: Code duplicated, block: B:242:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x005a A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    private static void m73h() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        short s;
        int i8;
        boolean z2;
        boolean z3;
        if (f192r == 11) {
            return;
        }
        for (int i9 = 0; i9 < f191q.length; i9 += 11) {
            int i10 = f191q[i9];
            if (i10 != -1) {
                int i11 = f191q[i9 + 2];
                int i12 = f191q[i9 + 3];
                int i13 = i11 >> 14;
                int i14 = i12 >> 14;
                int i15 = i11 >> 6;
                int i16 = i12 >> 6;
                int i17 = f198t >> 14;
                int i18 = i14 - (f200u >> 14);
                if ((Math.abs(i13 - i17) <= 2 && Math.abs(i18) <= 2) || (i15 + 32 >= f151g && i15 <= f172l && i16 + 32 >= f156h && i16 <= f176m)) {
                    int i19 = f191q[i9 + 9];
                    C0006g c0006g = C0003d.f21a[i19][C0003d.f23c[i19]];
                    int i20 = c0006g.f46a << 6;
                    int i21 = c0006g.f49b << 6;
                    if (i10 != 4 && f192r != 10 && m35a(i15, i16, (int) c0006g.f46a, (int) c0006g.f49b) != -1) {
                        if (f192r == 8 || f192r == 6) {
                            if (f192r == 8 && f206z >= 0) {
                                m71g();
                            }
                            m43a(i9, true);
                        } else if (f141e) {
                            m43a(i9, true);
                        } else if (!f134d) {
                            if (f58B == -1 || f159h[f58B] != 6) {
                                m68e(0);
                                return;
                            }
                            return;
                        }
                    }
                    switch (f191q[i9]) {
                        case 0:
                        case 2:
                            if ((f191q[i9] == 0 && f191q[i9 + 6] == 0) || (f191q[i9] == 2 && f191q[i9 + 6] == 0)) {
                                C0003d.m13b(i19);
                                int i22 = c0006g.f46a << 6;
                                int i23 = c0006g.f49b << 6;
                                int[] iArr = f191q;
                                int i24 = i9 + 2;
                                iArr[i24] = iArr[i24] + f191q[i9 + 4];
                                int i25 = f191q[i9 + 2];
                                int i26 = f191q[i9 + 4] < 0 ? i25 >> 11 : ((i25 + i22) - 1) >> 11;
                                if (i26 >= 0) {
                                    boolean z4 = m33a(m34a(i26, ((i12 + i23) + 1024) >> 11)) != 1;
                                    if (z4) {
                                        if (f191q[i9 + 4] < 0) {
                                            f191q[i9 + 2] = (i26 + 1) << 11;
                                        } else {
                                            f191q[i9 + 2] = ((i26 << 5) - c0006g.f46a) << 6;
                                        }
                                    }
                                    if (!z4) {
                                        int i27 = (f122c * i14) + i13;
                                        byte b = f154g[i27];
                                        s = f118b[i27];
                                        int i28 = (i25 + i22) - 1;
                                        int i29 = f159h[s + 8] << 8;
                                        int i30 = i16 + c0006g.f49b;
                                        int i31 = 0;
                                        while (i31 < b) {
                                            if (f159h[i8] == 6 || f159h[i8] == 3 || f159h[i8] == 4 || f159h[i8] == 15 || f159h[i8] == 11 || f159h[i8] == 45) {
                                                i8 = s;
                                                i8 = s;
                                                i8 = s;
                                                i8 = s;
                                                i8 = s;
                                                i8 = s;
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                int i32 = (f159h[i8 + 3] & 255) + i29;
                                                int i33 = i32 + 32;
                                                if (i32 >= i30 || i33 <= i16) {
                                                    i8 = s;
                                                    z3 = false;
                                                } else {
                                                    z3 = true;
                                                }
                                                if (z3) {
                                                    int i34 = ((i13 << 8) + (f159h[i8 + 2] & 255)) << 6;
                                                    int i35 = i34 + 2048;
                                                    if (i25 < i34 && i28 > i34) {
                                                        f191q[i9 + 2] = i34 - i22;
                                                        z4 = true;
                                                    } else if (i25 < i35 && i28 > i35) {
                                                        f191q[i9 + 2] = i35;
                                                        z4 = true;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                i8 = s;
                                            }
                                            i31++;
                                            i8 += 9;
                                        }
                                    }
                                    if (!z4) {
                                        i8 = s;
                                    } else if (i10 == 0) {
                                        f191q[i9 + 6] = 1;
                                        f191q[i9 + 7] = 10;
                                    } else if (i10 == 2) {
                                        if (f191q[i9 + 6] == 0) {
                                            f191q[i9 + 6] = 1;
                                        } else if (f191q[i9 + 6] == 1) {
                                            f191q[i9 + 6] = 0;
                                        }
                                        f191q[i9 + 7] = 14;
                                    }
                                } else if (i25 + i22 < 0) {
                                    m43a(i9, false);
                                }
                            } else if (i10 == 0) {
                                int[] iArr2 = f191q;
                                int i36 = i9 + 7;
                                int i37 = iArr2[i36] - 1;
                                iArr2[i36] = i37;
                                if (i37 == 0) {
                                    f191q[i9 + 6] = 0;
                                    f191q[i9 + 4] = -f191q[i9 + 4];
                                    C0003d.m14b(i19, f145e[f191q[i9 + 4] < 0 ? (char) 0 : (char) 1], 3);
                                    if (i10 != 2) {
                                        if (f191q[i9 + 6] == 1) {
                                            C0003d.m14b(i19, f138d[1], 4);
                                            int[] iArr3 = f191q;
                                            int i38 = i9 + 7;
                                            i5 = iArr3[i38] - 1;
                                            iArr3[i38] = i5;
                                            if (i5 == 0) {
                                                i6 = i11 >> 6;
                                                int i39 = i12 >> 6;
                                                if (i6 >= f151g || i6 > f172l || i39 < f156h || i39 > f176m) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    int[] iArr4 = f191q;
                                                    int i40 = i9 + 8;
                                                    i7 = iArr4[i40] - 1;
                                                    iArr4[i40] = i7;
                                                    if (i7 > 0) {
                                                        C0003d.m14b(i19, f138d[0], 4);
                                                        f191q[i9 + 4] = -f191q[i9 + 4];
                                                        f191q[i9 + 6] = 0;
                                                    } else {
                                                        f191q[i9 + 6] = 4;
                                                        f191q[i9 + 5] = -848;
                                                        f191q[i9 + 7] = 0;
                                                        f191q[i9 + 8] = 0;
                                                    }
                                                } else {
                                                    C0003d.m14b(i19, f138d[0], 4);
                                                    f191q[i9 + 4] = -f191q[i9 + 4];
                                                    f191q[i9 + 6] = 0;
                                                }
                                            }
                                        } else if (f191q[i9 + 6] == 4) {
                                            C0003d.m14b(i19, f138d[2], 4);
                                            int[] iArr5 = f191q;
                                            int i41 = i9 + 5;
                                            iArr5[i41] = iArr5[i41] + 101;
                                            i = f191q[i9 + 7] + 216;
                                            int i42 = f191q[i9 + 8] + f191q[i9 + 5];
                                            i2 = i12 + i42;
                                            if ((i2 >> 6) > f183o) {
                                                C0003d.m14b(i19, f138d[0], 4);
                                                f191q[i9 + 6] = 0;
                                                f191q[i9 + 4] = -f191q[i9 + 4];
                                                f191q[i9 + 8] = 0;
                                            } else {
                                                i3 = f138d[3][0].f46a << 6;
                                                i4 = (((i20 >> 1) + i11) - i) - (i3 >> 1);
                                                int i43 = (((i20 >> 1) + i11) + i) - (i3 >> 1);
                                                if ((m55b(i4, i2, i3, i3) != -1 && m55b(i43, i2, i3, i3) == -1) || f134d || f141e) {
                                                    f191q[i9 + 7] = i;
                                                    f191q[i9 + 8] = i42;
                                                    f108an = (f108an + 1) & 1;
                                                } else {
                                                    m68e(0);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i10 != 2) {
                                if (f191q[i9 + 6] == 1) {
                                    C0003d.m14b(i19, f138d[1], 4);
                                    int[] iArr6 = f191q;
                                    int i310 = i9 + 7;
                                    i5 = iArr6[i310] - 1;
                                    iArr6[i310] = i5;
                                    if (i5 == 0) {
                                        i6 = i11 >> 6;
                                        int i311 = i12 >> 6;
                                        if (i6 >= f151g) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (z) {
                                            C0003d.m14b(i19, f138d[0], 4);
                                            f191q[i9 + 4] = -f191q[i9 + 4];
                                            f191q[i9 + 6] = 0;
                                        } else {
                                            int[] iArr7 = f191q;
                                            int i44 = i9 + 8;
                                            i7 = iArr7[i44] - 1;
                                            iArr7[i44] = i7;
                                            if (i7 > 0) {
                                                C0003d.m14b(i19, f138d[0], 4);
                                                f191q[i9 + 4] = -f191q[i9 + 4];
                                                f191q[i9 + 6] = 0;
                                            } else {
                                                f191q[i9 + 6] = 4;
                                                f191q[i9 + 5] = -848;
                                                f191q[i9 + 7] = 0;
                                                f191q[i9 + 8] = 0;
                                            }
                                        }
                                    }
                                } else if (f191q[i9 + 6] == 4) {
                                    C0003d.m14b(i19, f138d[2], 4);
                                    int[] iArr8 = f191q;
                                    int i45 = i9 + 5;
                                    iArr8[i45] = iArr8[i45] + 101;
                                    i = f191q[i9 + 7] + 216;
                                    int i46 = f191q[i9 + 8] + f191q[i9 + 5];
                                    i2 = i12 + i46;
                                    if ((i2 >> 6) > f183o) {
                                        C0003d.m14b(i19, f138d[0], 4);
                                        f191q[i9 + 6] = 0;
                                        f191q[i9 + 4] = -f191q[i9 + 4];
                                        f191q[i9 + 8] = 0;
                                    } else {
                                        i3 = f138d[3][0].f46a << 6;
                                        i4 = (((i20 >> 1) + i11) - i) - (i3 >> 1);
                                        int i47 = (((i20 >> 1) + i11) + i) - (i3 >> 1);
                                        if (m55b(i4, i2, i3, i3) != -1) {
                                            m68e(0);
                                        } else {
                                            m68e(0);
                                        }
                                    }
                                }
                            }
                            break;
                        case 1:
                            C0003d.m13b(i19);
                            int i48 = f191q[i9 + 3];
                            int i49 = f191q[i9 + 5];
                            int i50 = f191q[i9 + 1];
                            if (i49 > 0 && i48 > i50) {
                                f191q[i9 + 3] = i50;
                                f191q[i9 + 5] = -1424;
                            }
                            int[] iArr9 = f191q;
                            int i51 = i9 + 5;
                            iArr9[i51] = iArr9[i51] + 64;
                            int[] iArr10 = f191q;
                            int i52 = i9 + 3;
                            iArr10[i52] = iArr10[i52] + f191q[i9 + 5];
                            break;
                        case 3:
                            switch (f191q[i9 + 6]) {
                                case 0:
                                    int i53 = (f198t - i11) >> 6;
                                    int i54 = (f200u - i12) >> 6;
                                    if (i53 < 0) {
                                        i53 = -i53;
                                    }
                                    if (((f202v == f198t && f203w == f200u) ? false : true) && i53 < 120 && i54 > 0 && i54 < 120) {
                                        if (f198t < i11) {
                                            f191q[i9 + 4] = -176;
                                            C0003d.m14b(i19, f145e[0], 2);
                                        } else {
                                            f191q[i9 + 4] = 176;
                                            C0003d.m14b(i19, f145e[1], 2);
                                        }
                                        f191q[i9 + 5] = 0;
                                        f191q[i9 + 7] = f191q[i9 + 3] + (RunnableC0010k.m110c(4) << 11);
                                        int[] iArr11 = f191q;
                                        int i55 = i9 + 6;
                                        iArr11[i55] = iArr11[i55] + 1;
                                    }
                                    break;
                                case 1:
                                    int[] iArr12 = f191q;
                                    int i56 = i9 + 2;
                                    iArr12[i56] = iArr12[i56] + f191q[i9 + 4];
                                    int[] iArr13 = f191q;
                                    int i57 = i9 + 3;
                                    iArr13[i57] = iArr13[i57] + f191q[i9 + 5];
                                    int[] iArr14 = f191q;
                                    int i58 = i9 + 5;
                                    iArr14[i58] = iArr14[i58] + 224;
                                    if (m33a(m34a(f191q[i9 + 2] >> 11, (f191q[i9 + 3] >> 11) + 1)) != -1 || f191q[i9 + 3] > f191q[i9 + 7]) {
                                        if (f191q[i9 + 4] > 0) {
                                            f191q[i9 + 4] = 208;
                                        } else {
                                            f191q[i9 + 4] = -208;
                                        }
                                        int[] iArr15 = f191q;
                                        int i59 = i9 + 6;
                                        iArr15[i59] = iArr15[i59] + 1;
                                    }
                                    break;
                                case 2:
                                    C0003d.m13b(i19);
                                    int[] iArr16 = f191q;
                                    int i60 = i9 + 2;
                                    iArr16[i60] = iArr16[i60] + f191q[i9 + 4];
                                    int i61 = (f198t - i11) >> 6;
                                    if (i61 < 0) {
                                        i61 = -i61;
                                    }
                                    if (!((f202v == f198t && f203w == f200u) ? false : true) && i61 > 120) {
                                        f191q[i9 + 5] = 0;
                                        int[] iArr17 = f191q;
                                        int i62 = i9 + 6;
                                        iArr17[i62] = iArr17[i62] + 1;
                                    }
                                    break;
                                case 3:
                                    int[] iArr18 = f191q;
                                    int i63 = i9 + 2;
                                    iArr18[i63] = iArr18[i63] + f191q[i9 + 4];
                                    int[] iArr19 = f191q;
                                    int i64 = i9 + 3;
                                    iArr19[i64] = iArr19[i64] + f191q[i9 + 5];
                                    int[] iArr20 = f191q;
                                    int i65 = i9 + 5;
                                    iArr20[i65] = iArr20[i65] - 224;
                                    int i66 = f191q[i9 + 2] >> 11;
                                    int i67 = f191q[i9 + 3] >> 11;
                                    if (m33a(m34a(i66, i67)) != -1) {
                                        f191q[i9 + 3] = (i67 + 1) << 11;
                                        f191q[i9 + 6] = 0;
                                        C0003d.m11a(i19, f145e[2]);
                                    }
                                    break;
                            }
                            break;
                        case 4:
                            C0003d.m13b(i19);
                            int[] iArr21 = f191q;
                            int i68 = i9 + 5;
                            iArr21[i68] = iArr21[i68] + 224;
                            int[] iArr22 = f191q;
                            int i69 = i9 + 2;
                            iArr22[i69] = iArr22[i69] + f191q[i9 + 4];
                            int[] iArr23 = f191q;
                            int i70 = i9 + 3;
                            iArr23[i70] = iArr23[i70] + f191q[i9 + 5];
                            int i71 = f191q[i9 + 2];
                            int i72 = f191q[i9 + 3];
                            if (f191q[i9 + 5] > 0) {
                                int i73 = i72 + i21;
                                int i74 = i73 >> 11;
                                int iM34a = m34a(i71 >> 11, i74);
                                int iM33a = m33a(iM34a);
                                int i75 = (i73 >> 6) - (i74 << 5);
                                if (iM33a >= 0 && iM33a < 10 && i75 >= f149f[iM34a]) {
                                    int[] iArr24 = f191q;
                                    int i76 = i9 + 3;
                                    iArr24[i76] = iArr24[i76] - (((i75 - f149f[iM34a]) + 1) << 6);
                                    f191q[i9 + 4] = -592;
                                    f191q[i9 + 5] = -1280;
                                    if (f191q[i9 + 6] == 0) {
                                        C0003d.m11a(i19, f138d[4]);
                                    }
                                }
                            }
                            break;
                    }
                } else {
                    m43a(i9, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m74i() {
        if (f164j != 0) {
            f168k = f156h - (((f200u >> 6) - 130) - 32);
            f164j = 0;
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m75j() {
        int i = 65;
        if (f160i > 0 && !RunnableC0010k.m109b(2)) {
            int i2 = f160i - 6;
            f160i = i2;
            if (i2 < 0) {
                f160i = 0;
            }
        } else if (f160i < 0 && !RunnableC0010k.m109b(16)) {
            int i3 = f160i + 6;
            f160i = i3;
            if (i3 > 0) {
                f160i = 0;
            }
        }
        if (f168k > 0) {
            int i4 = f168k - 20;
            f168k = i4;
            if (i4 < 0) {
                f168k = 0;
            }
        } else if (f168k < 0) {
            int i5 = f168k + 20;
            f168k = i5;
            if (i5 > 0) {
                f168k = 0;
            }
        }
        if (f164j != 0) {
            int i6 = f164j - (f200u >> 6);
            if (i6 <= 65) {
                if (i6 < 0) {
                    f164j = 0;
                    i = 0;
                } else {
                    i = i6;
                }
            }
        } else {
            i = 0;
        }
        f151g = (f198t >> 6) - 120;
        f156h = i + (((f200u >> 6) - 130) - 32) + f160i + f168k;
        if (f151g < 0) {
            f151g = 0;
        } else if (f151g >= f180n) {
            f151g = f180n - 1;
        }
        if (f156h < 0) {
            f156h = 0;
        } else if (f156h >= f183o) {
            f156h = f183o - 1;
        }
        f172l = (f151g + 240) - 1;
        f176m = (f156h + 260) - 1;
    }
}
