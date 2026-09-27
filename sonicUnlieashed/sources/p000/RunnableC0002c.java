package p000;

import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: C:\Temp\jadx-12448572193422856954\classes.dex */
public final class RunnableC0002c implements Runnable, CommandListener {

    /* JADX INFO: renamed from: A */
    private static int f10A;

    /* JADX INFO: renamed from: B */
    private static int f11B;

    /* JADX INFO: renamed from: C */
    private static int f12C;

    /* JADX INFO: renamed from: D */
    private static int f13D;

    /* JADX INFO: renamed from: E */
    private static int f14E;

    /* JADX INFO: renamed from: F */
    private static int f15F;

    /* JADX INFO: renamed from: H */
    private static int f17H;

    /* JADX INFO: renamed from: I */
    private static int f18I;

    /* JADX INFO: renamed from: J */
    private static int f19J;

    /* JADX INFO: renamed from: O */
    private static int f24O;

    /* JADX INFO: renamed from: P */
    private static int f25P;

    /* JADX INFO: renamed from: Q */
    private static int f26Q;

    /* JADX INFO: renamed from: R */
    private static int f27R;

    /* JADX INFO: renamed from: S */
    private static int f28S;

    /* JADX INFO: renamed from: T */
    private static int f29T;

    /* JADX INFO: renamed from: U */
    private static int f30U;

    /* JADX INFO: renamed from: V */
    private static int f31V;

    /* JADX INFO: renamed from: W */
    private static int f32W;

    /* JADX INFO: renamed from: X */
    private static int f33X;

    /* JADX INFO: renamed from: Y */
    private static int f34Y;

    /* JADX INFO: renamed from: Z */
    private static int f35Z;

    /* JADX INFO: renamed from: a */
    private static byte f36a;

    /* JADX INFO: renamed from: a */
    private static Canvas f42a;

    /* JADX INFO: renamed from: a */
    private static Command f43a;

    /* JADX INFO: renamed from: a */
    private static Font f45a;

    /* JADX INFO: renamed from: a */
    private static Image f46a;

    /* JADX INFO: renamed from: a */
    private static MIDlet f47a;

    /* JADX INFO: renamed from: a */
    private static boolean f48a;

    /* JADX INFO: renamed from: a */
    private static byte[] f49a;

    /* JADX INFO: renamed from: a */
    private static Image[] f52a;

    /* JADX INFO: renamed from: a */
    private static short[] f53a;

    /* JADX INFO: renamed from: a */
    private static byte[][] f55a;

    /* JADX INFO: renamed from: a */
    private static int[][] f56a;

    /* JADX INFO: renamed from: a */
    private static String[][] f57a;

    /* JADX INFO: renamed from: a */
    private static Image[][] f58a;

    /* JADX INFO: renamed from: aa */
    private static int f60aa;

    /* JADX INFO: renamed from: ab */
    private static int f61ab;

    /* JADX INFO: renamed from: ac */
    private static int f62ac;

    /* JADX INFO: renamed from: ad */
    private static int f63ad;

    /* JADX INFO: renamed from: ae */
    private static int f64ae;

    /* JADX INFO: renamed from: af */
    private static int f65af;

    /* JADX INFO: renamed from: ag */
    private static int f66ag;

    /* JADX INFO: renamed from: ah */
    private static int f67ah;

    /* JADX INFO: renamed from: ai */
    private static int f68ai;

    /* JADX INFO: renamed from: aj */
    private static int f69aj;

    /* JADX INFO: renamed from: am */
    private static int f72am;

    /* JADX INFO: renamed from: an */
    private static int f73an;

    /* JADX INFO: renamed from: ao */
    private static int f74ao;

    /* JADX INFO: renamed from: ap */
    private static int f75ap;

    /* JADX INFO: renamed from: aq */
    private static int f76aq;

    /* JADX INFO: renamed from: ar */
    private static int f77ar;

    /* JADX INFO: renamed from: as */
    private static int f78as;

    /* JADX INFO: renamed from: at */
    private static int f79at;

    /* JADX INFO: renamed from: au */
    private static int f80au;

    /* JADX INFO: renamed from: av */
    private static int f81av;

    /* JADX INFO: renamed from: aw */
    private static int f82aw;

    /* JADX INFO: renamed from: b */
    private static byte f86b;

    /* JADX INFO: renamed from: b */
    private static Command f89b;

    /* JADX INFO: renamed from: b */
    private static Image f90b;

    /* JADX INFO: renamed from: b */
    private static boolean f91b;

    /* JADX INFO: renamed from: b */
    private static int[] f92b;

    /* JADX INFO: renamed from: b */
    private static Image[] f94b;

    /* JADX INFO: renamed from: b */
    private static boolean[] f95b;

    /* JADX INFO: renamed from: b */
    private static int[][] f96b;

    /* JADX INFO: renamed from: c */
    private static Image f99c;

    /* JADX INFO: renamed from: c */
    private static boolean f100c;

    /* JADX INFO: renamed from: c */
    private static int[] f101c;

    /* JADX INFO: renamed from: c */
    private static String[] f102c;

    /* JADX INFO: renamed from: c */
    private static Image[] f103c;

    /* JADX INFO: renamed from: d */
    private static int f104d;

    /* JADX INFO: renamed from: d */
    private static String f105d;

    /* JADX INFO: renamed from: d */
    private static Image f106d;

    /* JADX INFO: renamed from: d */
    private static boolean f107d;

    /* JADX INFO: renamed from: d */
    private static int[] f108d;

    /* JADX INFO: renamed from: d */
    private static String[] f109d;

    /* JADX INFO: renamed from: d */
    private static Image[] f110d;

    /* JADX INFO: renamed from: e */
    private static int f111e;

    /* JADX INFO: renamed from: e */
    private static String f112e;

    /* JADX INFO: renamed from: e */
    private static Image f113e;

    /* JADX INFO: renamed from: e */
    private static boolean f114e;

    /* JADX INFO: renamed from: e */
    private static int[] f115e;

    /* JADX INFO: renamed from: e */
    private static String[] f116e;

    /* JADX INFO: renamed from: f */
    private static int f117f;

    /* JADX INFO: renamed from: f */
    private static String f118f;

    /* JADX INFO: renamed from: f */
    private static Image f119f;

    /* JADX INFO: renamed from: f */
    private static String[] f121f;

    /* JADX INFO: renamed from: g */
    private static Image f124g;

    /* JADX INFO: renamed from: g */
    private static String[] f126g;

    /* JADX INFO: renamed from: h */
    private static int f127h;

    /* JADX INFO: renamed from: h */
    private static String f128h;

    /* JADX INFO: renamed from: h */
    private static Image f129h;

    /* JADX INFO: renamed from: i */
    private static String f132i;

    /* JADX INFO: renamed from: i */
    private static Image f133i;

    /* JADX INFO: renamed from: j */
    private static String f136j;

    /* JADX INFO: renamed from: j */
    private static Image f137j;

    /* JADX INFO: renamed from: k */
    private static int f139k;

    /* JADX INFO: renamed from: l */
    private static int f141l;

    /* JADX INFO: renamed from: l */
    private static boolean f142l;

    /* JADX INFO: renamed from: m */
    private static int f143m;

    /* JADX INFO: renamed from: m */
    private static boolean f144m;

    /* JADX INFO: renamed from: n */
    private static int f145n;

    /* JADX INFO: renamed from: o */
    private static int f147o;

    /* JADX INFO: renamed from: p */
    private static int f149p;

    /* JADX INFO: renamed from: q */
    private static int f150q;

    /* JADX INFO: renamed from: r */
    private static int f151r;

    /* JADX INFO: renamed from: s */
    private static int f152s;

    /* JADX INFO: renamed from: t */
    private static int f153t;

    /* JADX INFO: renamed from: u */
    private static int f154u;

    /* JADX INFO: renamed from: v */
    private static int f155v;

    /* JADX INFO: renamed from: w */
    private static int f156w;

    /* JADX INFO: renamed from: x */
    private static int f157x;

    /* JADX INFO: renamed from: y */
    private static int f158y;

    /* JADX INFO: renamed from: z */
    private static int f159z;

    /* JADX INFO: renamed from: a */
    private static String f40a = "2.0";

    /* JADX INFO: renamed from: b */
    private static String f88b = new StringBuffer().append("IGP-Signature=").append(f40a).toString();

    /* JADX INFO: renamed from: c */
    private static String f98c = "";

    /* JADX INFO: renamed from: a */
    private static int f37a = 0;

    /* JADX INFO: renamed from: b */
    private static int f87b = 13568256;

    /* JADX INFO: renamed from: c */
    private static int f97c = 2;

    /* JADX INFO: renamed from: g */
    private static int f122g = 0;

    /* JADX INFO: renamed from: a */
    private static boolean[] f54a = new boolean[1];

    /* JADX INFO: renamed from: a */
    private static int[] f50a = new int[1];

    /* JADX INFO: renamed from: i */
    private static int f131i = -1;

    /* JADX INFO: renamed from: j */
    private static int f135j = 8;

    /* JADX INFO: renamed from: G */
    private static int f16G = 14;

    /* JADX INFO: renamed from: K */
    private static int f20K = 0;

    /* JADX INFO: renamed from: L */
    private static int f21L = 1;

    /* JADX INFO: renamed from: M */
    private static int f22M = 2;

    /* JADX INFO: renamed from: N */
    private static int f23N = 3;

    /* JADX INFO: renamed from: a */
    private static final String[] f51a = {"URL-WN", "URL-BS", "URL"};

    /* JADX INFO: renamed from: b */
    private static String[] f93b = new String[0];

    /* JADX INFO: renamed from: f */
    private static boolean f120f = false;

    /* JADX INFO: renamed from: g */
    private static boolean f125g = false;

    /* JADX INFO: renamed from: a */
    private static long f38a = 0;

    /* JADX INFO: renamed from: h */
    private static boolean f130h = true;

    /* JADX INFO: renamed from: i */
    private static boolean f134i = false;

    /* JADX INFO: renamed from: a */
    private static CommandListener f44a = null;

    /* JADX INFO: renamed from: a */
    private static RunnableC0002c f39a = null;

    /* JADX INFO: renamed from: j */
    private static boolean f138j = false;

    /* JADX INFO: renamed from: g */
    private static String f123g = null;

    /* JADX INFO: renamed from: k */
    private static boolean f140k = false;

    /* JADX INFO: renamed from: ak */
    private static int f70ak = -1;

    /* JADX INFO: renamed from: al */
    private static int f71al = 0;

    /* JADX INFO: renamed from: ax */
    private static int f83ax = 0;

    /* JADX INFO: renamed from: n */
    private static boolean f146n = false;

    /* JADX INFO: renamed from: o */
    private static boolean f148o = false;

    /* JADX INFO: renamed from: ay */
    private static int f84ay = -1;

    /* JADX INFO: renamed from: az */
    private static int f85az = -1;

    /* JADX INFO: renamed from: a */
    private static Hashtable f41a = new Hashtable();

    /* JADX INFO: renamed from: aA */
    private static int f59aA = 0;

    /* JADX INFO: renamed from: a */
    public static int m0a() {
        return (f140k && m29b() > 0) ? 0 : -1;
    }

    /* JADX INFO: renamed from: a */
    private static int m1a(int i, int i2) {
        if (f59aA == 0) {
            return f49a[(i << 2) + i2] & 255;
        }
        if (i2 != 0 && i2 != f21L) {
            return f49a[(i * 6) + i2] & 255;
        }
        return (f49a[(i * 6) + i2] & 255 & 255) | (((f49a[((i * 6) + i2) + 1] & 255) & 255) << 8) | 0;
    }

    /* JADX INFO: renamed from: a */
    private static int m2a(byte[] bArr) {
        int i = f18I;
        f18I = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = f18I;
        f18I = i3 + 1;
        return i2 + ((bArr[i3] & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    private static String m3a(int i) {
        return new StringBuffer().append("").append(f121f[i]).toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m4a(String str, String str2, String str3) {
        String strTrim = "";
        if (str3 != null && str != null && str2 != null) {
            try {
                int iIndexOf = str.indexOf(new StringBuffer().append(str2).append("=").toString());
                String strTrim2 = str3.trim();
                if (iIndexOf >= 0 && strTrim2.length() > 0) {
                    int length = iIndexOf + str2.length() + 1;
                    int iIndexOf2 = str.indexOf(";", length);
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = str.length();
                    }
                    strTrim = str.substring(length, iIndexOf2).trim();
                    if (strTrim.length() == 0 || strTrim.compareTo("0") == 0 || strTrim.toUpperCase().compareTo("NO") == 0) {
                        return "";
                    }
                    if (strTrim.toUpperCase().compareTo("DEL") != 0 && str2.compareTo("OP") != 0) {
                        int iIndexOf3 = strTrim2.indexOf("XXXX");
                        return iIndexOf3 >= 0 ? new StringBuffer().append(strTrim2.substring(0, iIndexOf3)).append(strTrim).append(strTrim2.substring(iIndexOf3 + "XXXX".length())).toString() : strTrim2;
                    }
                }
            } catch (Exception e) {
                return "";
            }
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: a */
    private static Image m5a(byte[] bArr) {
        byte[] bArrM27a = m27a(bArr);
        return Image.createImage(bArrM27a, 0, bArrM27a.length);
    }

    /* JADX INFO: renamed from: a */
    private static Image m6a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = 2; i5 == 0 && i6 < i2 + 2; i6++) {
            if ((bArr[i6] & 255) == 80 && (bArr[i6 + 1] & 255) == 76 && (bArr[i6 + 2] & 255) == 84 && (bArr[i6 + 3] & 255) == 69) {
                i5 = i6;
            }
        }
        int i7 = ((bArr[i5 - 4] << 24) & (-16777216)) + ((bArr[i5 - 3] << 16) & 16711680) + ((bArr[i5 - 2] << 8) & 65280) + (bArr[i5 - 1] & 255);
        bArr[i5 + 4 + 3] = (byte) ((i4 >> 16) & 255);
        bArr[i5 + 4 + 3 + 1] = (byte) ((i4 >> 8) & 255);
        bArr[i5 + 4 + 3 + 2] = (byte) i4;
        byte[] bArr2 = new byte[i7 + 4];
        System.arraycopy(bArr, i5, bArr2, 0, i7 + 4);
        long[] jArr = new long[256];
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= 256) {
                break;
            }
            long j = i9;
            for (int i10 = 0; i10 < 8; i10++) {
                j = (1 & j) == 1 ? (j >> 1) ^ 3988292384L : j >> 1;
            }
            jArr[i9] = j;
            i8 = i9 + 1;
        }
        long j2 = 4294967295L;
        for (byte b : bArr2) {
            j2 = (j2 >> 8) ^ jArr[((int) (((long) b) ^ j2)) & 255];
        }
        long j3 = j2 ^ 4294967295L;
        bArr[i5 + 4 + i7] = (byte) (((-16777216) & j3) >> 24);
        bArr[i5 + 4 + i7 + 1] = (byte) ((16711680 & j3) >> 16);
        bArr[i5 + 4 + i7 + 2] = (byte) ((65280 & j3) >> 8);
        bArr[i5 + 4 + i7 + 3] = (byte) (j3 & 255);
        System.gc();
        return Image.createImage(bArr, 2, i2);
    }

    /* JADX INFO: renamed from: a */
    private static void m7a() {
        f92b = null;
        f55a = null;
        f17H = 0;
        System.gc();
    }

    /* JADX INFO: renamed from: a */
    private static void m8a(int i) {
        int i2;
        int i3 = 0;
        f18I = 0;
        switch (i) {
            case -1:
                f94b = new Image[f16G];
                f103c = new Image[f28S];
                Image[][] imageArr = new Image[3][];
                f58a = imageArr;
                imageArr[0] = new Image[f102c.length];
                f58a[1] = new Image[f109d.length];
                f58a[2] = new Image[f116e.length];
                return;
            case 0:
                m33b();
                return;
            case 1:
                byte[] bArrM26a = m26a(i);
                for (int i4 = 0; i4 < f78as; i4++) {
                    f18I = m2a(bArrM26a) + f18I;
                }
                m2a(bArrM26a);
                int iM2a = m2a(bArrM26a);
                f121f = new String[iM2a];
                byte[] bArr = new byte[iM2a];
                System.arraycopy(bArrM26a, f18I, bArr, 0, iM2a);
                f18I += iM2a;
                m2a(bArrM26a);
                int i5 = f18I;
                f18I = i5 + 1;
                int i6 = bArrM26a[i5] & 255;
                int i7 = f18I;
                f18I = i7 + 1;
                int i8 = i6 | ((bArrM26a[i7] & 255) << 8);
                f53a = new short[i8];
                for (int i9 = 0; i9 < i8 - 1; i9++) {
                    short[] sArr = f53a;
                    int i10 = f18I;
                    f18I = i10 + 1;
                    int i11 = bArrM26a[i10] & 255;
                    int i12 = f18I;
                    f18I = i12 + 1;
                    sArr[i9] = (short) (i11 + ((bArrM26a[i12] & 255) << 8));
                }
                f53a[i8 - 1] = (short) iM2a;
                int i13 = 0;
                while (i13 < i8) {
                    int i14 = i13 == 0 ? 0 : f53a[i13 - 1] & 65535;
                    int i15 = (f53a[i13] & 65535) - i14;
                    if (i15 != 0) {
                        try {
                            StringBuffer stringBuffer = new StringBuffer((i15 / 2) + 2);
                            int i16 = i14;
                            while (i16 < i14 + i15) {
                                if ((bArr[i16] & 128) == 0) {
                                    i2 = i16 + 1;
                                    stringBuffer.append((char) (bArr[i16] & 255));
                                } else if ((bArr[i16] & 224) == 192) {
                                    if (i16 + 1 >= i14 + i15 || (bArr[i16 + 1] & 192) != 128) {
                                        throw new Exception();
                                    }
                                    int i17 = i16 + 1;
                                    i2 = i17 + 1;
                                    stringBuffer.append((char) (((bArr[i16] & 31) << 6) | (bArr[i17] & 63)));
                                } else {
                                    if ((bArr[i16] & 240) != 224) {
                                        throw new Exception();
                                    }
                                    if (i16 + 2 >= i14 + i15 || (bArr[i16 + 1] & 192) != 128 || (bArr[i16 + 2] & 192) != 128) {
                                        throw new Exception();
                                    }
                                    int i18 = i16 + 1;
                                    int i19 = i18 + 1;
                                    int i20 = ((bArr[i16] & 15) << 12) | ((bArr[i18] & 63) << 6);
                                    i2 = i19 + 1;
                                    stringBuffer.append((char) (i20 | (bArr[i19] & 63)));
                                }
                                f121f[i13] = stringBuffer.toString().toUpperCase();
                                i16 = i2;
                            }
                        } catch (Exception e) {
                        }
                    }
                    i13++;
                }
                if (f134i) {
                    f43a = new Command(m3a(f155v), 4, 1);
                    f89b = new Command(m3a(f156w), 2, 1);
                    if (f89b != null) {
                        f42a.removeCommand(f89b);
                    }
                    if (f43a != null) {
                        f42a.removeCommand(f43a);
                    }
                    f42a.addCommand(f43a);
                    f42a.addCommand(f89b);
                    return;
                }
                return;
            case 2:
                f52a = new Image[3];
                byte[] bArrM26a2 = m26a(i);
                byte[] bArr2 = new byte[bArrM26a2.length];
                System.arraycopy(bArrM26a2, 0, bArr2, 0, bArrM26a2.length);
                int iM2a2 = m2a(bArrM26a2);
                f18I = 0;
                f52a[0] = m5a(bArrM26a2);
                f52a[1] = m6a(bArr2, 2, iM2a2, 1, 46319);
                f52a[2] = m6a(bArr2, 2, iM2a2, 1, 16711680);
                int iM2a3 = m2a(bArrM26a2);
                f49a = new byte[(m2a(bArrM26a2) + 1) * (f59aA + 4)];
                int i21 = iM2a3 / (f59aA + 6);
                for (int i22 = 0; i22 < i21; i22++) {
                    System.arraycopy(bArrM26a2, f18I, f49a, m2a(bArrM26a2) * (f59aA + 4), f59aA + 4);
                    f18I += f59aA + 4;
                }
                byte b = f49a[((f59aA + 4) * 32) + f23N];
                f19J = b;
                f122g = b != 13 ? -1 : 0;
                m35c();
                return;
            case 3:
                byte[] bArrM26a3 = m26a(i);
                while (i3 < f16G) {
                    if (i3 != 13 && i3 != 12) {
                        f94b[i3] = m5a(bArrM26a3);
                    }
                    i3++;
                }
                return;
            case 4:
                byte[] bArrM26a4 = m26a(i);
                f18I = 0;
                while (i3 <= f32W) {
                    if (i3 == f32W) {
                        f103c[f32W] = m5a(bArrM26a4);
                    } else {
                        f18I = m2a(bArrM26a4) + f18I;
                    }
                    i3++;
                }
                return;
            case 5:
                byte[] bArrM26a5 = m26a(i);
                byte[] bArrM27a = m27a(bArrM26a5);
                f103c[f139k] = Image.createImage(bArrM27a, 0, bArrM27a.length);
                while (i3 < f78as) {
                    m5a(bArrM26a5);
                    i3++;
                }
                f46a = m5a(bArrM26a5);
                return;
            case 6:
            case 7:
                int length = (i == 6 ? f102c.length : f109d.length) - 1;
                char c = i == 6 ? (char) 0 : (char) 1;
                byte[] bArrM26a6 = m26a(i);
                while (i3 < length) {
                    f58a[c][i3] = m5a(bArrM26a6);
                    i3++;
                }
                f58a[c][i3] = f94b[11];
                f103c[i == 6 ? f141l : f143m] = f94b[10];
                return;
            case 8:
                f103c[f145n] = m5a(m26a(i));
                return;
            default:
                if (i == f50a[0]) {
                    f103c[f147o] = m5a(m26a(i));
                    return;
                } else {
                    if (i == f127h) {
                        m7a();
                        return;
                    }
                    return;
                }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m9a(int i, String str, int i2, String str2, String str3) {
        String appProperty;
        try {
            if (f100c) {
                appProperty = m4a(f47a.getAppProperty(str2), str, str3);
            } else {
                appProperty = f47a.getAppProperty(new StringBuffer().append("URL-").append(str).toString());
            }
            if (m24a(appProperty, 7)) {
                if (appProperty.toUpperCase().compareTo("NO") == 0 && appProperty.toUpperCase().compareTo("0") == 0) {
                    return;
                }
                f95b[i] = true;
                f126g[i] = appProperty;
                if (!f95b[i] || i == f139k) {
                    return;
                }
                f71al++;
                f115e[i] = 4;
                if (f91b) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String[] strArr = f126g;
                    strArr[i] = stringBuffer.append(strArr[i]).append("&ctg=SC").append(f71al < 10 ? "0" : "").append(f71al).toString();
                }
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m10a(int i, Graphics graphics, int i2, int i3, int i4) {
        m14a(m3a(i), graphics, f79at, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #2 {Exception -> 0x0132, blocks: (B:15:0x0035, B:17:0x0039, B:19:0x003d, B:20:0x0047, B:22:0x004e, B:37:0x009b, B:39:0x00a3, B:42:0x00be, B:44:0x00cf, B:46:0x00d3, B:48:0x00dd, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:53:0x00fd), top: B:68:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[PHI: r3
  0x0069: PHI (r3v3 int) = (r3v2 int), (r3v9 int) binds: [B:21:0x004c, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[Catch: Exception -> 0x0132, TryCatch #2 {Exception -> 0x0132, blocks: (B:15:0x0035, B:17:0x0039, B:19:0x003d, B:20:0x0047, B:22:0x004e, B:37:0x009b, B:39:0x00a3, B:42:0x00be, B:44:0x00cf, B:46:0x00d3, B:48:0x00dd, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:53:0x00fd), top: B:68:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3 A[Catch: Exception -> 0x0132, TryCatch #2 {Exception -> 0x0132, blocks: (B:15:0x0035, B:17:0x0039, B:19:0x003d, B:20:0x0047, B:22:0x004e, B:37:0x009b, B:39:0x00a3, B:42:0x00be, B:44:0x00cf, B:46:0x00d3, B:48:0x00dd, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:53:0x00fd), top: B:68:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[Catch: Exception -> 0x0132, TryCatch #2 {Exception -> 0x0132, blocks: (B:15:0x0035, B:17:0x0039, B:19:0x003d, B:20:0x0047, B:22:0x004e, B:37:0x009b, B:39:0x00a3, B:42:0x00be, B:44:0x00cf, B:46:0x00d3, B:48:0x00dd, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:53:0x00fd), top: B:68:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7 A[Catch: Exception -> 0x0132, TryCatch #2 {Exception -> 0x0132, blocks: (B:15:0x0035, B:17:0x0039, B:19:0x003d, B:20:0x0047, B:22:0x004e, B:37:0x009b, B:39:0x00a3, B:42:0x00be, B:44:0x00cf, B:46:0x00d3, B:48:0x00dd, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:53:0x00fd), top: B:68:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[Catch: Exception -> 0x0132, TryCatch #2 {Exception -> 0x0132, blocks: (B:15:0x0035, B:17:0x0039, B:19:0x003d, B:20:0x0047, B:22:0x004e, B:37:0x009b, B:39:0x00a3, B:42:0x00be, B:44:0x00cf, B:46:0x00d3, B:48:0x00dd, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:53:0x00fd), top: B:68:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5 A[Catch: Exception -> 0x0132, TryCatch #2 {Exception -> 0x0132, blocks: (B:15:0x0035, B:17:0x0039, B:19:0x003d, B:20:0x0047, B:22:0x004e, B:37:0x009b, B:39:0x00a3, B:42:0x00be, B:44:0x00cf, B:46:0x00d3, B:48:0x00dd, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:53:0x00fd), top: B:68:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #2 {Exception -> 0x0132, blocks: (B:15:0x0035, B:17:0x0039, B:19:0x003d, B:20:0x0047, B:22:0x004e, B:37:0x009b, B:39:0x00a3, B:42:0x00be, B:44:0x00cf, B:46:0x00d3, B:48:0x00dd, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:53:0x00fd), top: B:68:0x0035 }] */
    /* JADX INFO: renamed from: a */
    private static void m11a(int i, String[] strArr, int i2, String str) {
        int i3;
        int i4 = 0;
        int length = strArr.length;
        f57a[i] = new String[length];
        f56a[i] = new int[length];
        f96b[i] = new int[length];
        if (f54a[0]) {
            return;
        }
        String string = "";
        if (f100c) {
            try {
                str = f47a.getAppProperty(str);
                if (i != 2) {
                    string = f112e;
                } else if (f136j.length() > 0 && f91b) {
                    string = new StringBuffer().append(f136j).append("&ctg=XXXX").toString();
                } else if (f136j.length() > 0) {
                    string = f136j;
                }
            } catch (Exception e) {
            }
        }
        int i5 = 0;
        while (true) {
            i3 = i4;
            if (i5 >= strArr.length) {
                break;
            }
            String strM4a = "";
            if (i != 2) {
                try {
                    if (i5 == length - 1) {
                        if (!f100c) {
                            strM4a = f47a.getAppProperty(f51a[i]);
                        } else if (f136j.length() > 0) {
                            strM4a = m4a(f47a.getAppProperty("IGP-CATEGORIES"), strArr[i5], new StringBuffer().append(f136j).append(f91b ? "&ctg=XXXX" : "").toString());
                        }
                    } else if (f100c) {
                        strM4a = f47a.getAppProperty(new StringBuffer().append(f51a[i]).append("-").append(strArr[i5]).toString());
                    } else if (strArr[i5].compareTo("GLDT") == 0) {
                        strM4a = m4a(str, strArr[i5], f112e);
                    } else if (strArr[i5].compareTo("CATALOG") == 0) {
                        strM4a = f136j;
                    } else {
                        strM4a = m4a(str, strArr[i5], string);
                    }
                    if (m24a(strM4a, 7)) {
                        f57a[i][i3] = strM4a;
                        i4 = i3 + 1;
                        try {
                            f56a[i][i3] = i5;
                            f96b[i][i5] = (i2 - (strArr.length - 1)) + i5;
                            i3 = i4;
                            i4 = i3;
                        } catch (Exception e2) {
                        }
                    } else {
                        i4 = i3;
                    }
                } catch (Exception e3) {
                    i4 = i3;
                }
            } else {
                if (f100c) {
                    strM4a = f47a.getAppProperty(new StringBuffer().append(f51a[i]).append("-").append(strArr[i5]).toString());
                } else if (strArr[i5].compareTo("GLDT") == 0) {
                    strM4a = m4a(str, strArr[i5], f112e);
                } else if (strArr[i5].compareTo("CATALOG") == 0) {
                    strM4a = f136j;
                } else {
                    strM4a = m4a(str, strArr[i5], string);
                }
                if (m24a(strM4a, 7)) {
                    f57a[i][i3] = strM4a;
                    i4 = i3 + 1;
                    f56a[i][i3] = i5;
                    f96b[i][i5] = (i2 - (strArr.length - 1)) + i5;
                    i3 = i4;
                    i4 = i3;
                } else {
                    i4 = i3;
                }
            }
            i5++;
        }
        if (i3 > 0) {
            f95b[f141l + i] = true;
            f108d[i] = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12a(String str, int i) {
        new StringBuffer().append("enterIGP(loadingMsg = ").append(str).append(", appLanguage = ").append(0).append(" (").append(f93b[0]).append(")");
        if (0 < f93b.length) {
            if (0 <= f93b.length) {
            }
            f78as = 0;
            f132i = str;
            f34Y = -1;
            f30U = 0;
            f33X = -1;
            f32W = 0;
            f63ad = 0;
            f64ae = 0;
            f101c = new int[10];
            f138j = true;
            f45a = Font.getFont(0, 0, 8);
            f36a = (byte) 0;
            f86b = (byte) 0;
            new Thread(new RunnableC0002c()).start();
        }
        f35Z = 4;
        f120f = true;
        f125g = true;
        RecordStore recordStoreOpenRecordStore = null;
        try {
            recordStoreOpenRecordStore = RecordStore.openRecordStore("igp19", false);
        } catch (Exception e) {
            try {
                recordStoreOpenRecordStore = RecordStore.openRecordStore("igp19", true);
            } catch (Exception e2) {
            }
        }
        if (recordStoreOpenRecordStore != null) {
            try {
                recordStoreOpenRecordStore.closeRecordStore();
            } catch (Exception e3) {
            }
        }
        f32W = m34c();
        if (f134i) {
            f42a.setCommandListener(f39a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[PHI: r1
  0x0043: PHI (r1v57 int) = (r1v54 int), (r1v4 int) binds: [B:17:0x0041, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX INFO: renamed from: a */
    private static void m13a(String str, Graphics graphics, int i, int i2, int i3) {
        int i4;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        f101c[0] = 0;
        f26Q = 0;
        int i9 = 0;
        int length = str.length();
        int i10 = (f79at > 176 || f115e[f32W] != 4) ? 0 : 2;
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\n' || i9 >= 10) {
                if (cCharAt == '\\') {
                    i11++;
                    if (str.charAt(i11) == 'N') {
                        int[] iArr = f101c;
                        iArr[i9] = iArr[i9] - f122g;
                        if (f101c[i9] > f26Q) {
                            f26Q = f101c[i9];
                        }
                        i9++;
                        f101c[i9] = 0;
                    }
                }
                if (cCharAt != 0 && cCharAt != 1) {
                    int[] iArr2 = f101c;
                    iArr2[i9] = m1a(cCharAt, f22M) + f122g + iArr2[i9];
                }
            } else {
                int[] iArr3 = f101c;
                iArr3[i9] = iArr3[i9] - f122g;
                if (f101c[i9] > f26Q) {
                    f26Q = f101c[i9];
                }
                i9++;
                f101c[i9] = 0;
            }
            i11++;
        }
        int[] iArr4 = f101c;
        iArr4[i9] = iArr4[i9] - f122g;
        if (f101c[i9] > f26Q) {
            f26Q = f101c[i9];
        }
        f25P = ((i9 + 1) * f19J) + ((i10 + 0) * i9);
        if (f48a) {
            f48a = false;
            return;
        }
        int i12 = (((i10 + 0) * i9) / 2) + i2;
        int i13 = 0;
        if ((i3 & 32) != 0) {
            i12 -= f25P;
        } else if ((i3 & 2) != 0) {
            i12 -= f25P >> 1;
        }
        boolean z3 = true;
        boolean z4 = false;
        m16a(graphics, 0, 0, f79at, f80au);
        int i14 = 0;
        int iM1a = i;
        int i15 = i12;
        while (i14 < length) {
            char cCharAt2 = str.charAt(i14);
            if (z3) {
                if ((i3 & 8) != 0) {
                    i8 = i - f101c[i13];
                } else {
                    i8 = (i3 & 1) != 0 ? i - (f101c[i13] >> 1) : i;
                }
                z3 = false;
                iM1a = i8;
            }
            if (cCharAt2 != '\n' || i13 >= 10) {
                if (cCharAt2 == '\\') {
                    i7 = i14 + 1;
                    if (str.charAt(i7) != 'N') {
                        i4 = i7;
                    }
                    i14 = i5 + 1;
                    z4 = z;
                    z3 = z2;
                    i13 = i6;
                } else {
                    i4 = i14;
                }
                if (z4) {
                    char cCharAt3 = str.charAt(i4 - 2);
                    if (cCharAt3 == ' ') {
                        iM1a -= (m1a(cCharAt3, f22M) + f122g) >> 1;
                    }
                    if (cCharAt2 == ' ') {
                        iM1a += (m1a(cCharAt2, f22M) + f122g) >> 1;
                        z = false;
                        z2 = z3;
                        i5 = i4;
                        i6 = i13;
                    } else {
                        z = false;
                    }
                    i14 = i5 + 1;
                    z4 = z;
                    z3 = z2;
                    i13 = i6;
                } else {
                    z = z4;
                }
                m16a(graphics, iM1a, i15, m1a(cCharAt2, f22M), m1a(cCharAt2, f23N));
                graphics.drawRegion(f52a[f24O], m1a(cCharAt2, 0), m1a(cCharAt2, f21L), m1a(cCharAt2, f22M), m1a(cCharAt2, f23N), 0, iM1a, i15, 20);
                iM1a += m1a(cCharAt2, f22M) + f122g;
                z2 = z3;
                i5 = i4;
                i6 = i13;
                i14 = i5 + 1;
                z4 = z;
                z3 = z2;
                i13 = i6;
            } else {
                i7 = i14;
            }
            i15 += (f19J + i10) - 2;
            i6 = i13 + 1;
            z = true;
            z2 = true;
            i5 = i7;
            i14 = i5 + 1;
            z4 = z;
            z3 = z2;
            i13 = i6;
        }
        m16a(graphics, 0, 0, f79at, f80au);
        f24O = 1;
    }

    /* JADX INFO: renamed from: a */
    private static void m14a(String str, Graphics graphics, int i, int i2, int i3, int i4) {
        m13a(str, graphics, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public static void m15a(Graphics graphics) {
        if (f140k) {
            m16a(graphics, 0, 0, f79at, f80au);
            m16a(graphics, 0, 0, f79at, f80au);
            switch (f30U) {
                case 0:
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, f79at, f80au);
                    int i = f82aw;
                    int i2 = (f79at * 3) / 4;
                    int i3 = f34Y;
                    int i4 = f35Z;
                    if (i3 > i4) {
                        i3 = i4;
                    }
                    int i5 = (f79at - i2) / 2;
                    graphics.setColor(16777215);
                    graphics.drawRect(i5, i, i2, 6);
                    graphics.setColor(16711680);
                    graphics.fillRect(i5 + 1 + 1, i + 1 + 1, ((i3 * ((i2 - 2) - 2)) / i4) + 1, 3);
                    if (f132i != null && !f132i.trim().equals("")) {
                        graphics.setColor(16777215);
                        graphics.setFont(f45a);
                        graphics.drawString(f132i, f81av, f82aw - 5, 33);
                        break;
                    }
                    break;
                case 1:
                    m31b(graphics);
                    if (System.currentTimeMillis() % 1000 > 500 && f142l) {
                        graphics.setColor(f87b);
                        if (f54a[0]) {
                            graphics.setColor(16744192);
                        }
                        f24O = 0;
                        graphics.fillRect(f76aq, f77ar, f74ao, f75ap + 1);
                        m10a(f73an, graphics, f81av, f77ar + (f75ap >> 1), 3);
                        break;
                    }
                    break;
                case 2:
                    graphics.setFont(f45a);
                    int height = f45a.getHeight();
                    graphics.setColor(255);
                    graphics.fillRect(0, (f82aw - height) - 5, f79at, height << 1);
                    graphics.setColor(16777215);
                    graphics.drawString(f132i, f81av, f82aw, 65);
                    break;
                case 3:
                    m31b(graphics);
                    int i6 = (f80au * 40) / 100;
                    int i7 = f79at;
                    int i8 = f80au - (i6 << 1);
                    int[] iArr = new int[i7 * i8];
                    for (int i9 = 0; i9 < iArr.length; i9++) {
                        iArr[i9] = -220209185;
                    }
                    graphics.drawRGB(iArr, 0, i7, 0, i6, i7, i8, true);
                    graphics.setColor(39423);
                    graphics.drawRect(0, i6, i7 - 1, (f80au - (i6 << 1)) - 1);
                    graphics.drawRect(1, i6 + 1, i7 - 3, (f80au - (i6 << 1)) - 3);
                    m10a(f11B, graphics, f81av, f82aw, 3);
                    m36c(graphics);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m16a(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setClip(Math.max(i, 0), Math.max(i2, 0), Math.min(i3, f79at), Math.min(i4, f80au));
    }

    /* JADX INFO: renamed from: a */
    private static void m17a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        graphics.fillTriangle(i, i2, i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: a */
    private static void m18a(Graphics graphics, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = z2 ? -1 : 1;
        if (i3 % 2 == 0) {
            i3--;
        }
        graphics.setColor(46319);
        m17a(graphics, i, i2, i - (i3 >> 1), i2 + ((i3 >> 1) * i5), i + (i3 >> 1), i2 + ((i3 >> 1) * i5));
        graphics.setColor(i4);
        m17a(graphics, i, i2 + i5, (i - (i3 >> 1)) + 2, (((i3 >> 1) * i5) + i2) - i5, ((i3 >> 1) + i) - 2, (((i3 >> 1) * i5) + i2) - i5);
    }

    /* JADX INFO: renamed from: a */
    private static void m19a(Graphics graphics, Image image, int i, int i2, int i3) {
        graphics.drawImage(image, i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public static void m20a(MIDlet mIDlet, Canvas canvas, int i, int i2) {
        new StringBuffer().append("initialize(midlet = ").append(mIDlet).append(", game = ").append(canvas).append(", screenWidth = ").append(i).append(", screenHeight = ").append(i2).append(", cmdListener = ").append((Object) null).append(")");
        f79at = i;
        f80au = i2;
        f81av = f79at >> 1;
        f82aw = f80au >> 1;
        f104d = (f80au * 5) / 100;
        f111e = f80au / 2;
        f117f = (f80au * 93) / 100;
        if (2 > (f79at / 2) - ((f79at * 15) / 100)) {
            f97c = 2;
        }
        if (f47a != null || canvas == null) {
            return;
        }
        f47a = mIDlet;
        f42a = canvas;
        m30b();
        new StringBuffer().append(f88b).append("");
    }

    /* JADX INFO: renamed from: a */
    public static void m21a(boolean z) {
        if (!z) {
            if (f30U == 5) {
                f30U = f33X;
                f34Y = -1;
                return;
            }
            return;
        }
        if (f30U == 0 || f30U == 2) {
            f33X = f30U;
            f30U = 5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22a() {
        return m0a() != -1;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23a(int i) {
        int i2;
        if (!f140k) {
            return true;
        }
        f31V = i;
        switch (f30U) {
            case 0:
                if (f34Y >= f35Z) {
                    f30U = 1;
                    m38d();
                } else {
                    m8a(f34Y);
                }
                f34Y++;
                break;
            case 1:
                switch (f31V) {
                    case 21:
                        if (f144m && f64ae > 0) {
                            int i3 = f64ae - 1;
                            f64ae = i3;
                            if (i3 - f63ad < 0) {
                                f63ad--;
                            }
                        }
                        break;
                    case 23:
                        if (f70ak > 1) {
                            if (f32W == 0) {
                                f32W = f28S - 1;
                            } else {
                                f32W--;
                            }
                            while (!f95b[f32W]) {
                                if (f32W == 0) {
                                    f32W = f28S - 1;
                                } else {
                                    f32W--;
                                }
                            }
                            f107d = true;
                            break;
                        }
                    case 24:
                        if (f70ak > 1) {
                            if (!f107d) {
                                if (f32W == f28S - 1) {
                                    f32W = 0;
                                } else {
                                    f32W++;
                                }
                                while (!f95b[f32W]) {
                                    if (f32W == f28S - 1) {
                                        f32W = 0;
                                    } else {
                                        f32W++;
                                    }
                                }
                                f114e = true;
                            }
                            f63ad = 0;
                            f64ae = 0;
                            m38d();
                        }
                        break;
                    case 25:
                    case 27:
                        f30U = 6;
                        break;
                    case 26:
                        f30U = 4;
                        break;
                    case 32:
                        if (f144m && f64ae < f61ab - 1) {
                            int i4 = f64ae + 1;
                            f64ae = i4;
                            if (i4 - f63ad >= f62ac) {
                                f63ad++;
                            }
                        }
                        break;
                }
                break;
            case 2:
                m32b(false);
                m33b();
                int i5 = f32W;
                if (f115e[i5] == 4) {
                    i2 = f115e[i5];
                } else if (i5 == f139k) {
                    i2 = 5;
                } else if (i5 == f141l) {
                    i2 = 6;
                } else if (i5 == f143m) {
                    i2 = 7;
                } else if (i5 == f145n) {
                    i2 = 8;
                } else {
                    i2 = i5 == f147o ? f50a[0] : -1;
                }
                f34Y = i2;
                m8a(i2);
                m7a();
                f30U = 1;
                break;
            case 3:
                switch (f31V) {
                    case 25:
                    case 27:
                        f123g = null;
                        break;
                    case 26:
                        f30U = 1;
                        f118f = null;
                        break;
                }
                break;
            case 4:
                m32b(true);
                if (f134i) {
                    f42a.setCommandListener(f44a);
                    if (f89b != null) {
                        f42a.removeCommand(f89b);
                        f89b = null;
                    }
                    if (f43a != null) {
                        f42a.removeCommand(f43a);
                        f43a = null;
                    }
                }
                f138j = false;
                return true;
            case 6:
                String string = f126g[f32W];
                if (f144m) {
                    string = f57a[f60aa][f64ae];
                }
                if (string != null && string.length() > 0) {
                    if (f91b) {
                        int iIndexOf = string.indexOf("&lg=");
                        string = iIndexOf == -1 ? new StringBuffer().append(string).append("&lg=").append(f93b[f78as]).toString() : new StringBuffer().append(string.substring(0, iIndexOf)).append("&lg=").append(f93b[f78as]).append(string.substring(iIndexOf + "&lg=".length() + 2)).toString();
                    }
                    f123g = string;
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m24a(String str, int i) {
        if (str == null) {
            return (i & 1) == 0;
        }
        String strTrim = str.trim();
        if (((i & 1) == 0 || strTrim.length() != 0) && ((i & 2) == 0 || strTrim.toUpperCase().compareTo("DEL") != 0)) {
            if ((i & 4) == 0) {
                return true;
            }
            if (strTrim.toUpperCase().compareTo("NO") != 0 && strTrim.toUpperCase().compareTo("0") != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m25a(Graphics graphics, Image image, int i, int i2, int i3) {
        if (m37c() || !f140k || image == null || graphics == null) {
            return false;
        }
        if (System.currentTimeMillis() - f38a > 800) {
            f130h = f130h ? false : true;
            f38a = System.currentTimeMillis();
        }
        if (!f130h) {
            return true;
        }
        m19a(graphics, image, i, i2, 6);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m26a(int i) {
        int i2;
        byte[] bArr = null;
        if (i >= 0 && i < f17H - 1 && (i2 = f92b[i + 1] - f92b[i]) != 0) {
            try {
                InputStream resourceAsStream = "a".getClass().getResourceAsStream("/dataIGP");
                resourceAsStream.skip((f17H * 4) + 2 + f92b[i]);
                bArr = new byte[i2];
                for (int length = bArr.length; length > 0; length -= resourceAsStream.read(bArr)) {
                }
                resourceAsStream.close();
            } catch (Exception e) {
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m27a(byte[] bArr) {
        int iM2a = m2a(bArr);
        byte[] bArr2 = new byte[iM2a];
        System.arraycopy(bArr, f18I, bArr2, 0, iM2a);
        f18I = iM2a + f18I;
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    private static String[] m28a(byte[] bArr) {
        String[] strArr = new String[m2a(bArr)];
        for (int i = 0; i < strArr.length; i++) {
            int iM2a = m2a(bArr);
            strArr[i] = new String(bArr, f18I, iM2a);
            f18I = iM2a + f18I;
        }
        return strArr;
    }

    /* JADX INFO: renamed from: b */
    private static int m29b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 >= f95b.length) {
                return i3;
            }
            i = f95b[i2] ? i3 + 1 : i3;
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m30b() {
        try {
            if (!m33b()) {
                f140k = false;
                return;
            }
            byte[] bArrM26a = m26a(0);
            m2a(bArrM26a);
            f18I = m2a(bArrM26a) + f18I;
            f93b = m28a(bArrM26a);
            String[] strArrM28a = m28a(bArrM26a);
            f102c = m28a(bArrM26a);
            f109d = m28a(bArrM26a);
            f116e = m28a(bArrM26a);
            for (int i = 0; i < f54a.length; i++) {
                f54a[i] = m2a(bArrM26a) == 1;
            }
            try {
                String str = new String(bArrM26a, f18I, m2a(bArrM26a));
                f98c = str;
                if (str.equals("2.0z")) {
                    f59aA = 2;
                    f21L = 2;
                    f22M = 4;
                    f23N = 5;
                }
                if (!f98c.startsWith(f40a)) {
                    new StringBuffer().append("Invalid dataIGP file, dataIGP file IGP Version : ").append(f98c);
                    new StringBuffer().append("IGP Class version : ").append(f40a);
                }
            } catch (Exception e) {
                f140k = false;
            }
            m7a();
            int length = (strArrM28a.length + (-1) > 0 ? strArrM28a.length - 1 : 0) + 4 + 1;
            f149p = length;
            int i2 = length + 1;
            f150q = i2;
            int i3 = i2 + 1;
            f151r = i3;
            int i4 = i3 + 1;
            f152s = i4;
            int i5 = i4 + 1;
            f153t = i5;
            int i6 = i5 + 1;
            f154u = i6;
            int i7 = i6 + 1;
            f155v = i7;
            int i8 = i7 + 1;
            f156w = i8;
            int i9 = i8 + 1;
            f157x = i9;
            int i10 = i9 + 1;
            f158y = i10;
            int i11 = i10 + 1;
            f159z = i11;
            int i12 = i11 + 1;
            f10A = i12;
            int i13 = i12 + 1;
            f11B = i13;
            if (f102c.length > 1) {
                int i14 = i13 + 1;
                f12C = i14;
                f13D = i14 + (f102c.length - 1);
            } else {
                f13D = i13 + 1;
            }
            int i15 = f13D;
            if (f109d.length > 1) {
                int i16 = i15 + 1;
                f14E = i16;
                f15F = i16 + (f109d.length - 1);
            } else {
                f15F = i15 + 1;
            }
            int length2 = strArrM28a.length;
            f27R = length2;
            f110d = new Image[length2];
            f28S = (f54a[0] ? 1 : 0) + f27R + 1 + 1 + 1 + 1;
            for (int i17 = 0; i17 < f54a.length; i17++) {
                if (f54a[i17]) {
                    int[] iArr = f50a;
                    int i18 = f135j + 1;
                    f135j = i18;
                    iArr[i17] = i18;
                } else {
                    int[] iArr2 = f50a;
                    int i19 = f131i - 1;
                    f131i = i19;
                    iArr2[i17] = i19;
                }
            }
            int i20 = f135j + 1;
            f135j = i20;
            f127h = i20;
            f126g = new String[f28S];
            f95b = new boolean[f28S];
            f115e = new int[f28S];
            for (int i21 = 0; i21 < f95b.length; i21++) {
                f95b[i21] = false;
            }
            int i22 = f27R;
            f139k = i22;
            int i23 = i22 + 1;
            f141l = i23;
            int i24 = i23 + 1;
            f143m = i24;
            int i25 = i24 + 1;
            f145n = i25;
            f147o = i25 + 1;
            f57a = new String[3][];
            f56a = new int[3][];
            f96b = new int[3][];
            f108d = new int[3];
            try {
                f112e = f47a.getAppProperty("URL-TEMPLATE-GAME").trim();
                f100c = true;
                if (f112e.indexOf("ingameads.gameloft.com/redir") != -1) {
                    f91b = true;
                }
            } catch (Exception e2) {
            }
            for (int i26 = 0; i26 < f27R; i26++) {
                m9a(i26, strArrM28a[i26], 7, "IGP-PROMOS", f112e);
            }
            try {
                String appProperty = f47a.getAppProperty("URL-OPERATOR");
                if (m24a(appProperty, 7)) {
                    f136j = appProperty;
                }
                f128h = f47a.getAppProperty("URL-PT");
            } catch (Exception e3) {
            }
            if (!f54a[0]) {
                if (!f100c) {
                    String appProperty2 = f47a.getAppProperty("URL-PROMO");
                    if (appProperty2 != null && m24a(f47a.getAppProperty("URL-PROMO"), 7)) {
                        f126g[f139k] = appProperty2;
                        f95b[f139k] = true;
                        f115e[f139k] = 5;
                    }
                } else if (m24a(f136j, 7)) {
                    m9a(f27R, "PROMO", 7, "IGP-CATEGORIES", new StringBuffer().append(f136j).append(f91b ? "&ctg=XXXX" : "").toString());
                }
            }
            m11a(0, f102c, f13D, "IGP-WN");
            m11a(1, f109d, f15F, "IGP-BS");
            if (!f54a[0]) {
                if (f100c) {
                    if (m24a(m4a(f47a.getAppProperty("IGP-CATEGORIES"), "OP", f136j), 7)) {
                        if (m24a(f136j, 7)) {
                            f95b[f145n] = true;
                        }
                        f126g[f145n] = f136j;
                    }
                } else if (m24a(f136j, 7)) {
                    f126g[f145n] = f136j;
                    f95b[f145n] = true;
                }
                if (f95b[f145n] && f91b) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String[] strArr = f126g;
                    int i27 = f145n;
                    strArr[i27] = stringBuffer.append(strArr[i27]).append("&ctg=CCTL").toString();
                }
            }
            if (f54a[0]) {
                try {
                    if (m24a(f136j, 7)) {
                        f126g[f147o] = f136j;
                        f95b[f147o] = true;
                    }
                } catch (Exception e4) {
                }
            }
            int iM29b = m29b();
            f70ak = iM29b;
            if (iM29b > 0) {
                f140k = true;
            }
            new StringBuffer().append("isAvailable = ").append(f140k);
        } catch (Exception e5) {
            f140k = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x05ce A[PHI: r2
  0x05ce: PHI (r2v7 boolean) = (r2v6 boolean), (r2v10 boolean) binds: [B:133:0x053c, B:140:0x058c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    private static void m31b(Graphics graphics) {
        int i;
        int i2;
        int i3;
        f48a = true;
        m10a(f73an, (Graphics) null, 0, 0, 3);
        int iM1a = m1a(32, f22M) / 2;
        int iM1a2 = m1a(32, f23N) / 3;
        f74ao = iM1a + f26Q;
        f75ap = f25P + iM1a2;
        if ((f25P + f75ap) % 2 != 0) {
            f75ap++;
        }
        f76aq = f81av - (f74ao / 2);
        if (f115e[f32W] == 4 || f32W == f147o) {
            f77ar = f111e - (f75ap / 2);
        } else if (f32W == f139k || f32W == f145n) {
            f77ar = f117f - (f75ap / 2);
        }
        if (f54a[0] && f32W == f147o) {
            f77ar = (f80au * 80) / 100;
        }
        graphics.setColor(16777215);
        if (f54a[0]) {
            graphics.setColor(0);
        }
        graphics.fillRect(0, 0, f79at, f80au);
        if (f144m) {
            int height = f104d;
            if (f80au > 128) {
                m19a(graphics, f103c[f32W], f81av, f104d, 17);
                height += f103c[f32W].getHeight();
            }
            f24O = 2;
            m10a(f72am, graphics, f81av, height, 17);
            int iMax = Math.max(f19J * 2, f58a[f60aa][f56a[f60aa][0]].getHeight());
            f48a = true;
            m10a(f72am, (Graphics) null, 0, 0, 0);
            int i4 = height + f25P;
            int i5 = (f80au * 7) / 100;
            int i6 = ((f80au / 2) - i4) << 1;
            int height2 = ((f80au - f94b[8].getHeight()) - 2) - i4;
            f62ac = f61ab;
            if (i6 / iMax >= f61ab) {
                i3 = (i4 + (i6 / 2)) - ((f62ac * iMax) / 2);
            } else {
                if (height2 / iMax < f61ab) {
                    f62ac = (height2 - (i5 * 2)) / iMax;
                }
                i3 = (i4 + (height2 / 2)) - ((f62ac * iMax) / 2);
            }
            if (f62ac < f61ab) {
                if (f63ad > 0) {
                    m18a(graphics, f81av, i3 - i5, i5, 16777215, true, false);
                }
                if (f63ad + f62ac < f61ab) {
                    m18a(graphics, f81av, (f62ac * iMax) + i3 + i5, i5, 16777215, true, true);
                }
            }
            int i7 = (iMax / 2) + i3 + 1;
            f68ai = f79at - (f94b[5].getWidth() * 3);
            f66ag = (f79at >> 1) - (f68ai >> 1);
            int i8 = f79at / 100;
            int i9 = f66ag + i8;
            int width = f58a[f60aa][0].getWidth() + i9 + i8;
            for (int i10 = f63ad; i10 < f63ad + f62ac; i10++) {
                int i11 = f56a[f60aa][i10];
                m19a(graphics, f58a[f60aa][i11], i9, i7, 6);
                if (f60aa == 2 || i11 == f96b[f60aa].length - 1) {
                    f24O = 2;
                }
                m13a(m3a(f96b[f60aa][i11]), graphics, width, i7, 6);
                i7 += iMax;
            }
            f65af = f64ae - f63ad;
            f67ah = (f65af * iMax) + i3;
            f69aj = iMax;
            graphics.setColor(16545540);
            graphics.drawRect(f66ag, f67ah, f68ai, f69aj);
        } else if (f32W == f147o) {
            m19a(graphics, f103c[f147o], f79at / 2, (f80au << 3) / 100, 17);
            f48a = true;
            m10a(f149p, (Graphics) null, 0, 0, 0);
            f103c[f32W].getHeight();
            if (f54a[0]) {
                f24O = 0;
            }
            m14a(m3a(f150q), graphics, f79at - ((f94b[4].getWidth() + 8) << 1), f79at / 2, (f80au * 60) / 100, 3);
        } else if (f32W == f139k) {
            boolean z = f80au >= 128;
            boolean z2 = f128h != null && f128h.length() > 0;
            int height3 = (((z ? f94b[10].getHeight() : 0) * 3) / 5) + f104d;
            if (f103c[f139k].getWidth() > 220) {
                graphics.setColor(13421772);
                graphics.fillRect(f81av + 20, height3, 3, 54);
                height3 += 54;
            } else if (f103c[f139k].getWidth() > 140) {
                graphics.setColor(14145495);
                graphics.fillRect(f81av + 14, height3, 2, 37);
                height3 += 37;
            } else if (f103c[f139k].getWidth() > 100) {
                graphics.setColor(14465464);
                graphics.fillRect(f81av + 11, height3, 1, 26);
                height3 += 26;
            }
            int height4 = height3 + f103c[f139k].getHeight();
            m19a(graphics, f103c[f139k], f81av, height4, 33);
            m19a(graphics, f46a, f81av + (f103c[f139k].getWidth() >> 1) + 1, height4, 40);
            if (z) {
                m19a(graphics, f94b[10], f81av, f104d, 17);
            }
            if (z2) {
                f24O = 2;
                int i12 = f77ar - height4;
                int i13 = 3;
                if ((f19J << 1) > i12) {
                    i2 = height4 + (f19J / 3);
                    i13 = 17;
                } else {
                    i2 = height4 + (i12 / 2);
                }
                m14a(f128h, graphics, f79at, f81av, i2, i13);
            }
        } else if (f32W == f145n) {
            boolean z3 = f80au >= 128;
            int width2 = (f103c[f32W].getWidth() * 70) / 100;
            int height5 = f103c[f32W].getHeight() >> 1;
            int i14 = (f79at >> 1) - (width2 >> 1);
            int i15 = (f80au >> 1) - (height5 >> 1);
            if (i15 + height5 > f80au) {
                height5 = f80au - i15;
            }
            if (i14 + width2 > f79at) {
                width2 = f79at - i14;
            }
            for (int i16 = i15; i16 < i15 + height5; i16++) {
                graphics.setColor((((i16 - i15) * (-9)) / height5) + 250, (((i16 - i15) * (-139)) / height5) + 209, (((i16 - i15) * (-24)) / height5) + 45);
                graphics.drawLine(i14, i16, i14 + width2, i16);
            }
            int i17 = f80au / 2;
            m19a(graphics, f103c[f32W], f81av, i17, 3);
            if (z3) {
                m19a(graphics, f94b[10], f81av, f104d, 17);
            }
            f48a = true;
            m14a(m3a(f72am), null, 0, 0, 0, 0);
            int i18 = i17 - (f25P / 2);
            int i19 = f24O;
            f24O = 0;
            m14a(m3a(f72am), graphics, f103c[f32W].getWidth() / 2, f81av, i18, 17);
            f24O = i19;
        } else {
            f48a = true;
            m14a(m3a(f72am), graphics, 0, 0, 0, 0);
            int height6 = f103c[f32W].getHeight();
            boolean z4 = false;
            int height7 = f26Q > f79at - (f94b[9].getWidth() << 1) ? f94b[9].getHeight() : 0;
            int iMax2 = Math.max(0, f80au - ((f25P + height6) + height7));
            if (f25P > (f19J << 1) && iMax2 / 3 > f19J / 2) {
                iMax2 = Math.max(0, f80au - (((f19J << 1) + height6) + height7));
                z4 = true;
            }
            int i20 = iMax2 / 3;
            if (height7 > 0) {
                int height8 = f80au - f94b[9].getHeight();
                int iMax3 = Math.max(0, f80au - (f25P + height6));
                if (f25P > (f19J << 1) && iMax3 / 3 > f25P - (f19J << 1)) {
                    iMax3 = Math.max(0, f80au - ((f19J << 1) + height6));
                    z4 = true;
                }
                i = iMax3 / 3;
                if ((i * 2) + f25P + f103c[f32W].getHeight() >= height8) {
                    i = i20;
                }
            } else {
                i = i20;
            }
            m19a(graphics, f103c[f32W], f81av, i, 17);
            int height9 = i + f103c[f32W].getHeight() + i;
            if (f54a[0]) {
                f24O = 0;
            }
            m14a(m3a(f72am), graphics, 0, f81av, height9 + (z4 ? -(f19J / 2) : 0), 17);
        }
        m36c(graphics);
        if (f70ak > 1) {
            int iAbs = Math.abs(((int) ((System.currentTimeMillis() / 80) % 8)) - 4);
            char c = 5;
            char c2 = 7;
            char c3 = 1;
            char c4 = 3;
            if (f107d) {
                c = 4;
                c3 = 0;
                f29T++;
            }
            if (f114e) {
                c2 = 6;
                c4 = 2;
                f29T++;
            }
            int width3 = iAbs + 1 + f94b[c].getWidth();
            int width4 = width3 - ((f94b[c].getWidth() * 20) / 100);
            m19a(graphics, f94b[c], width3, f82aw, 10);
            m19a(graphics, f94b[c3], width4, f82aw, 10);
            m19a(graphics, f94b[c2], f79at - width3, f82aw, 6);
            m19a(graphics, f94b[c4], f79at - width4, f82aw, 6);
            if (f29T > 4) {
                f107d = false;
                f114e = false;
                f29T = 0;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m32b(boolean z) {
        for (int i = 0; i < f58a.length; i++) {
            if (f58a[i] != null) {
                for (int i2 = 0; i2 < f58a[i].length; i2++) {
                    f58a[i][i2] = null;
                }
            }
        }
        for (int i3 = 0; i3 < f103c.length; i3++) {
            f103c[i3] = null;
        }
        f46a = null;
        if (z) {
            m7a();
            f49a = null;
            f52a = null;
            for (int i4 = 0; i4 < f16G; i4++) {
                f94b[i4] = null;
            }
            f94b = null;
            f53a = null;
            f121f = null;
            f101c = null;
            f132i = null;
            f103c = null;
            f58a = null;
            f90b = null;
            f99c = null;
            f106d = null;
            f113e = null;
            f119f = null;
            f124g = null;
            f129h = null;
            f133i = null;
            f137j = null;
            for (int i5 = 0; i5 < f110d.length; i5++) {
                f110d[i5] = null;
            }
        }
        System.gc();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m33b() {
        m7a();
        try {
            InputStream resourceAsStream = "a".getClass().getResourceAsStream("/dataIGP");
            int i = resourceAsStream.read() & 255;
            f17H = i;
            int i2 = i + ((resourceAsStream.read() & 255) << 8);
            f17H = i2;
            f92b = new int[i2];
            for (int i3 = 0; i3 < f17H; i3++) {
                f92b[i3] = resourceAsStream.read() & 255;
                int[] iArr = f92b;
                iArr[i3] = iArr[i3] + ((resourceAsStream.read() & 255) << 8);
                int[] iArr2 = f92b;
                iArr2[i3] = iArr2[i3] + ((resourceAsStream.read() & 255) << 16);
                int[] iArr3 = f92b;
                iArr3[i3] = iArr3[i3] + ((resourceAsStream.read() & 255) << 24);
            }
            resourceAsStream.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m34c() {
        for (int i = 0; i < f95b.length; i++) {
            if (f95b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    private static void m35c() {
        int i;
        int i2;
        if (f128h == null) {
            return;
        }
        int length = f128h.length();
        if (length <= 0) {
            f128h = null;
            return;
        }
        String string = "";
        f128h = f128h.toUpperCase();
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int length2 = 0;
        boolean z = false;
        while (i3 < length) {
            char cCharAt = f128h.charAt(i3);
            if ((cCharAt < ' ' || cCharAt > 'z') && cCharAt != 130 && cCharAt != '\n') {
                string = null;
                break;
            }
            if (cCharAt == '\n') {
                i = i3;
                z = true;
            } else if (i3 < length - 1 && cCharAt == '\\' && (f128h.charAt(i3 + 1) == 'n' || f128h.charAt(i3 + 1) == 'N')) {
                i = i3 + 1;
                z = true;
            } else {
                i = i3;
            }
            if (z) {
                if (string.length() > 0) {
                    i4++;
                    if (i4 == 3) {
                        string = null;
                        break;
                    } else {
                        string = new StringBuffer().append(string).append('\n').toString();
                        i6 = 0;
                    }
                } else {
                    string = new StringBuffer().append(string).append("").toString();
                }
                i2 = i6;
                z = false;
            } else {
                string = new StringBuffer().append(string).append(cCharAt).toString();
                int iM1a = i6 + m1a(cCharAt, f22M);
                if (cCharAt == ' ') {
                    length2 = string.length() - 1;
                    i5 = iM1a;
                    i2 = iM1a;
                } else {
                    i2 = iM1a;
                }
            }
            if (i2 < f79at) {
                i6 = i2;
            } else {
                if (i4 >= 3) {
                    string = null;
                    break;
                }
                if (length2 != i) {
                    if (length2 == 0) {
                        string = null;
                        break;
                    } else {
                        string = new StringBuffer().append(string.substring(0, length2)).append("\n").append(string.substring(length2 + 1, string.length())).toString();
                        i6 = i2 - i5;
                    }
                } else {
                    string = new StringBuffer().append(string).append("\n").toString();
                    i6 = 0;
                }
                i4++;
            }
            i3 = i + 1;
        }
        if (string != null && !m24a(string, 7)) {
            string = null;
        }
        f128h = string;
    }

    /* JADX INFO: renamed from: c */
    private static void m36c(Graphics graphics) {
        int i = f97c;
        int i2 = f80au - 2;
        int i3 = f79at - i;
        if (f134i) {
            return;
        }
        byte b = (byte) (f36a | 1);
        f36a = b;
        byte b2 = (byte) (b | 2);
        f36a = b2;
        if ((b2 & 1) != 0) {
            m19a(graphics, f94b[9], i, i2, 36);
        }
        if ((f36a & 2) != 0) {
            m19a(graphics, f94b[8], i3, i2, 40);
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m37c() {
        if (f140k) {
            if (f125g) {
                return f120f;
            }
            try {
                RecordStore.openRecordStore("igp19", false).closeRecordStore();
                f120f = true;
            } catch (Exception e) {
            }
            f125g = true;
        }
        return f120f;
    }

    /* JADX INFO: renamed from: d */
    private static void m38d() {
        f30U = 2;
        f72am = f32W;
        f64ae = 0;
        f61ab = 0;
        f63ad = 0;
        f144m = false;
        f142l = (f126g[f32W] == null || f126g[f32W].length() <= 0 || f126g[f32W].compareTo("DEL") == 0) ? false : true;
        if (f32W == f141l) {
            f60aa = 0;
            f144m = true;
            f142l = false;
        }
        if (f32W == f143m) {
            f60aa = 1;
            f144m = true;
            f142l = false;
        }
        if (f32W == f145n || f32W == f147o) {
            f142l = true;
        }
        f73an = f151r;
        if (f115e[f32W] == 4) {
            f73an = f152s;
        }
        if (f144m) {
            f61ab = f108d[f60aa];
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (f134i) {
            if (command == f43a) {
                m23a(25);
            } else if (command == f89b) {
                m23a(26);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (f138j) {
            try {
                if (f123g != null) {
                    String str = f123g;
                    f105d = str;
                    if (str != null && f105d.length() > 0) {
                        String str2 = f105d;
                        f105d = null;
                        new StringBuffer().append("urlPlatformRequest = ").append(str2);
                        try {
                            f47a.platformRequest(str2);
                            Thread.sleep(200L);
                        } catch (Exception e) {
                        }
                        f30U = 1;
                        f47a.notifyDestroyed();
                    }
                    f123g = null;
                }
                Thread.sleep(1000L);
            } catch (Exception e2) {
            }
        }
    }
}
