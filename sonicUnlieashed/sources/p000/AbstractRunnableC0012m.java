package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: C:\Temp\jadx-12448572193422856954\classes.dex */
public abstract class AbstractRunnableC0012m extends Canvas implements Runnable {

    /* JADX INFO: renamed from: a */
    private static long f605a;

    /* JADX INFO: renamed from: a */
    private static InputStream f606a;

    /* JADX INFO: renamed from: a */
    private static String f607a;

    /* JADX INFO: renamed from: a */
    private static Hashtable f608a;

    /* JADX INFO: renamed from: a */
    private static Random f609a;

    /* JADX INFO: renamed from: a */
    private static Display f610a;

    /* JADX INFO: renamed from: a */
    static MIDlet f612a;

    /* JADX INFO: renamed from: a */
    static AbstractRunnableC0012m f613a;

    /* JADX INFO: renamed from: a */
    private static short f614a;

    /* JADX INFO: renamed from: a */
    private static boolean f615a;

    /* JADX INFO: renamed from: a */
    private static byte[] f616a;

    /* JADX INFO: renamed from: a */
    private static int[] f617a;

    /* JADX INFO: renamed from: a */
    private static String[] f618a;

    /* JADX INFO: renamed from: a */
    private static short[] f619a;

    /* JADX INFO: renamed from: a */
    private static byte[][] f620a;

    /* JADX INFO: renamed from: a_ */
    static int f622a_;

    /* JADX INFO: renamed from: b */
    private static Hashtable f624b;

    /* JADX INFO: renamed from: b */
    private static short f626b;

    /* JADX INFO: renamed from: b */
    private static boolean f627b;

    /* JADX INFO: renamed from: b */
    private static byte[] f628b;

    /* JADX INFO: renamed from: b */
    private static int[] f629b;

    /* JADX INFO: renamed from: b */
    private static short[] f630b;

    /* JADX INFO: renamed from: c */
    private static long f632c;

    /* JADX INFO: renamed from: c */
    private static byte[] f633c;

    /* JADX INFO: renamed from: c */
    private static int[] f634c;

    /* JADX INFO: renamed from: d */
    private static long f636d;

    /* JADX INFO: renamed from: d */
    private static byte[] f637d;

    /* JADX INFO: renamed from: d */
    private static int[] f638d;

    /* JADX INFO: renamed from: d_ */
    static int f639d_;

    /* JADX INFO: renamed from: e */
    private static int f640e;

    /* JADX INFO: renamed from: e */
    private static long f641e;

    /* JADX INFO: renamed from: e */
    private static byte[] f642e;

    /* JADX INFO: renamed from: f */
    static boolean f644f;

    /* JADX INFO: renamed from: f */
    private static byte[] f645f;

    /* JADX INFO: renamed from: g */
    static boolean f647g;

    /* JADX INFO: renamed from: i */
    private static int f649i;

    /* JADX INFO: renamed from: j */
    private static int f650j;

    /* JADX INFO: renamed from: q */
    private static int f657q;

    /* JADX INFO: renamed from: r */
    private static int f658r;

    /* JADX INFO: renamed from: s */
    private static int f659s;

    /* JADX INFO: renamed from: t */
    private static int f660t;

    /* JADX INFO: renamed from: v */
    private static int f662v;

    /* JADX INFO: renamed from: b */
    private long f664b;

    /* JADX INFO: renamed from: a */
    public static Graphics f611a = null;

    /* JADX INFO: renamed from: b */
    private static Graphics f625b = null;

    /* JADX INFO: renamed from: f */
    private static int f643f = 0;

    /* JADX INFO: renamed from: g */
    private static int f646g = 0;

    /* JADX INFO: renamed from: h */
    private static int f648h = 62;

    /* JADX INFO: renamed from: k */
    private static int f651k = -9999;

    /* JADX INFO: renamed from: l */
    private static int f652l = 256;

    /* JADX INFO: renamed from: m */
    private static int f653m = 256;

    /* JADX INFO: renamed from: b_ */
    static final int f631b_ = m378e(90);

    /* JADX INFO: renamed from: c_ */
    static final int f635c_ = m378e(180);

    /* JADX INFO: renamed from: n */
    private static int f654n = m378e(270);

    /* JADX INFO: renamed from: o */
    private static int f655o = m378e(360);

    /* JADX INFO: renamed from: p */
    private static int f656p = 804;

    /* JADX INFO: renamed from: a */
    private static int[][] f621a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 2);

    /* JADX INFO: renamed from: u */
    private static int f661u = 0;

    /* JADX INFO: renamed from: b */
    private static String f623b = "UTF-8";

    /* JADX INFO: renamed from: a */
    private Image f663a = null;

    /* JADX INFO: renamed from: c */
    private Graphics f665c = null;

    public AbstractRunnableC0012m(Object obj, Object obj2) {
        f613a = this;
        f640e = -1;
        f615a = true;
        f612a = (MIDlet) obj;
        f610a = (Display) obj2;
        m359b();
        f624b = new Hashtable();
        Hashtable hashtable = new Hashtable();
        f608a = hashtable;
        hashtable.put(new Integer(48), new Integer(6));
        f608a.put(new Integer(49), new Integer(7));
        f608a.put(new Integer(50), new Integer(1));
        f608a.put(new Integer(51), new Integer(9));
        f608a.put(new Integer(52), new Integer(3));
        f608a.put(new Integer(53), new Integer(5));
        f608a.put(new Integer(54), new Integer(4));
        f608a.put(new Integer(55), new Integer(13));
        f608a.put(new Integer(56), new Integer(2));
        f608a.put(new Integer(57), new Integer(15));
        f608a.put(new Integer(35), new Integer(17));
        f608a.put(new Integer(42), new Integer(16));
        f608a.put(new Integer(-6), new Integer(18));
        f608a.put(new Integer(-7), new Integer(19));
        f624b.put(new Integer(-5), new Integer(5));
        f624b.put(new Integer(-1), new Integer(1));
        f624b.put(new Integer(-2), new Integer(2));
        f624b.put(new Integer(-3), new Integer(3));
        f624b.put(new Integer(-4), new Integer(4));
        f632c = System.currentTimeMillis();
        this.f664b = f632c;
    }

    /* JADX INFO: renamed from: a */
    private static byte m330a(int i) {
        Integer num = new Integer(i);
        Integer num2 = (Integer) f608a.get(num);
        if (num2 != null) {
            return num2.byteValue();
        }
        Integer num3 = (Integer) f624b.get(num);
        if (num3 != null) {
            return num3.byteValue();
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    static final int m331a() {
        return f609a.nextInt();
    }

    /* JADX INFO: renamed from: a */
    static int m332a(int i) {
        return (i * 360) >> 8;
    }

    /* JADX INFO: renamed from: a */
    private static int m333a(int i, int i2) {
        return (int) (((((long) i) * ((long) i2)) + ((long) (f652l >> 1))) >> 8);
    }

    /* JADX INFO: renamed from: a */
    private static int m334a(int i, int i2, int i3) {
        for (int i4 = i; i4 < i2; i4++) {
            if (m381f(i4) <= i3 && i3 < m381f(i4 + 1)) {
                return i4;
            }
        }
        if (i == f631b_ || i2 == f631b_) {
            return f631b_;
        }
        if (i == f654n || i2 == f654n) {
            return f654n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    static int m335a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iM333a;
        int iM379e;
        int i9 = i5 + i7;
        int i10 = i6 + i8;
        if (i - i3 != 0) {
            int iM379e2 = m379e(i2 - i4, i - i3);
            if (iM379e2 != 0) {
                int i11 = (-m333a(iM379e2, i3)) + i4;
                iM333a = m333a(iM379e2, i5) + i11;
                if (iM333a < i6 || iM333a > i10) {
                    iM333a = iM333a < i6 ? i6 : i10;
                    iM379e = m379e(i11 - iM333a, -iM379e2);
                    if (iM379e < i5 || iM379e > i9) {
                        return 0;
                    }
                } else {
                    iM379e = i5;
                }
                int iM333a2 = m333a(iM379e2, i9) + i11;
                if (iM333a2 < i6 || iM333a2 > i10) {
                    if (iM333a2 >= i6) {
                        i6 = i10;
                    }
                    int iM379e3 = m379e(i11 - i6, -iM379e2);
                    if (iM379e3 < i5 || iM379e3 > i9) {
                        return 0;
                    }
                    i10 = i6;
                    i9 = iM379e3;
                } else {
                    i10 = iM333a2;
                }
            } else {
                if (i4 < i6 || i4 > i10) {
                    return 0;
                }
                i10 = i4;
                iM333a = i4;
                iM379e = i5;
            }
        } else {
            if (i3 < i5 || i3 > i9) {
                return 0;
            }
            i9 = i3;
            iM333a = i6;
            iM379e = i3;
        }
        f621a[0][0] = iM379e;
        f621a[0][1] = iM333a;
        f621a[1][0] = i9;
        f621a[1][1] = i10;
        return (iM379e == i9 && iM333a == i10) ? 2 : 4;
    }

    /* JADX INFO: renamed from: a */
    private static int m336a(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i >= 0) {
            f661u++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static int m337a(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = i2;
        while (i4 > 0) {
            try {
                int i5 = inputStream.read(bArr, i3, i4);
                i4 -= i5;
                i3 += i5;
            } catch (Exception e) {
            }
        }
        f661u += i2;
        return i2;
    }

    /* JADX INFO: renamed from: a */
    static int m338a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 24);
    }

    /* JADX INFO: renamed from: a */
    static int m339a(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i2 >>> 24);
        return i6;
    }

    /* JADX INFO: renamed from: a */
    private static InputStream m340a(String str) {
        return "".getClass().getResourceAsStream(str);
    }

    /* JADX INFO: renamed from: a */
    static Object m341a(int i) {
        m384g(i);
        f661u = 0;
        if (f627b) {
            return m342a((InputStream) new ByteArrayInputStream(m352a(i)));
        }
        Object objM342a = m342a(f606a);
        f657q += f661u;
        return objM342a;
    }

    /* JADX INFO: renamed from: a */
    private static Object m342a(InputStream inputStream) {
        Object[] objArr;
        int i = 0;
        try {
            int iM336a = m336a(inputStream);
            int i2 = iM336a >> 4;
            int i3 = iM336a & 7;
            int iM356b = (iM336a & 8) != 0 ? m356b(inputStream) : m336a(inputStream);
            switch (i3) {
                case 0:
                    byte[] bArr = new byte[iM356b];
                    while (i < iM356b) {
                        bArr[i] = (byte) m336a(inputStream);
                        i++;
                    }
                    return bArr;
                case 1:
                    short[] sArr = new short[iM356b];
                    if (i2 == 0) {
                        while (i < iM356b) {
                            sArr[i] = (byte) m336a(inputStream);
                            i++;
                        }
                        return sArr;
                    }
                    while (i < iM356b) {
                        sArr[i] = (short) m356b(inputStream);
                        i++;
                    }
                    return sArr;
                case 2:
                    int[] iArr = new int[iM356b];
                    if (i2 == 0) {
                        while (i < iM356b) {
                            iArr[i] = (byte) m336a(inputStream);
                            i++;
                        }
                        return iArr;
                    }
                    if (i2 == 1) {
                        while (i < iM356b) {
                            iArr[i] = (short) m356b(inputStream);
                            i++;
                        }
                        return iArr;
                    }
                    while (i < iM356b) {
                        iArr[i] = m365c(inputStream);
                        i++;
                    }
                    return iArr;
                default:
                    switch (i3 & 3) {
                        case 0:
                            objArr = i2 != 2 ? new byte[iM356b][][] : new byte[iM356b][];
                            break;
                        case 1:
                            objArr = i2 != 2 ? new short[iM356b][][] : new short[iM356b][];
                            break;
                        default:
                            objArr = i2 != 2 ? new int[iM356b][][] : new int[iM356b][];
                            break;
                    }
                    while (i < iM356b) {
                        objArr[i] = m342a(inputStream);
                        i++;
                    }
                    return objArr;
            }
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m343a(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        int i3 = i;
        int i4 = 0;
        while (i3 < i + i2) {
            if ((bArr[i3] & 128) == 0) {
                cArr[i4] = (char) bArr[i3];
                i3++;
                i4++;
            } else if ((bArr[i3] & 192) == 192 && i3 + 1 < i + i2 && (bArr[i3 + 1] & 192) == 128) {
                cArr[i4] = (char) (((bArr[i3] & 31) << 6) | (bArr[i3 + 1] & 63));
                i3 += 2;
                i4++;
            } else {
                if ((bArr[i3] & 224) != 224 || i3 + 2 >= i + i2 || (bArr[i3 + 1] & 192) != 128 || (bArr[i3 + 2] & 192) != 128) {
                    return "";
                }
                cArr[i4] = (char) (((bArr[i3] & 15) << 12) | ((bArr[i3 + 1] & 63) << 6) | (bArr[i3 + 2] & 63));
                i3 += 3;
                i4++;
            }
        }
        return new String(cArr, 0, i4);
    }

    /* JADX INFO: renamed from: a */
    static short m344a(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* JADX INFO: renamed from: a */
    private static void m345a(int i) {
        if (i == 0) {
            return;
        }
        if (f633c == null) {
            f633c = new byte[256];
        }
        while (i > 256) {
            m357b(f633c, 0, 256);
            i -= 256;
        }
        if (i > 0) {
            m357b(f633c, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    static final void m346a(int i, int i2, int i3, int i4) {
        f611a.setClip(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    static final void m347a(int i, int i2, int i3, int i4, int i5, int i6) {
        f611a.fillTriangle(i, i2, i3, i4, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static void m348a(String str) {
        if (f607a == null || str.compareTo(f607a) != 0) {
            m393l();
            f607a = str;
            f606a = m340a(str);
            f614a = (short) m389i();
            int iM389i = (short) m389i();
            f626b = iM389i;
            f619a = new short[iM389i];
            for (int i = 0; i < f626b; i++) {
                f619a[i] = (short) m389i();
            }
            f658r = 0;
            m367c();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m349a(String str, int i) {
        if (f618a != null) {
            for (int i2 = 0; i2 < f662v; i2++) {
                f618a[i2] = null;
            }
            f618a = null;
        }
        f638d = null;
        f645f = null;
        f662v = 0;
        m348a(str);
        m384g(0);
        if (f627b) {
            m373d(new ByteArrayInputStream(m352a(0)));
        } else {
            m373d(f606a);
        }
        m393l();
        m374d();
    }

    /* JADX INFO: renamed from: a */
    static void m350a(String str, int i, int i2) {
        m348a(str);
        f617a = (int[]) m341a(0);
        m341a(1);
        m393l();
    }

    /* JADX INFO: renamed from: a */
    public static void m351a(boolean z, int i, int i2) {
        Integer num = new Integer(i);
        Hashtable hashtable = f608a;
        if (((Integer) hashtable.get(num)) != null) {
            hashtable.remove(num);
        }
        hashtable.put(num, new Integer(i2));
    }

    /* JADX INFO: renamed from: a */
    static byte[] m352a(int i) {
        int i2;
        boolean z;
        int i3;
        int iM385g;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM384g = m384g(i);
        if (!f627b) {
            byte[] bArr = new byte[iM384g];
            m357b(bArr, 0, bArr.length);
            return bArr;
        }
        try {
            InputStream inputStream = f606a;
            byte[] bArr2 = new byte[13];
            byte[] bArr3 = new byte[iM384g - 13];
            m337a(inputStream, bArr2, 0, 13);
            m337a(inputStream, bArr3, 0, iM384g - 13);
            int[] iArr = new int[5];
            for (int i9 = 0; i9 < 5; i9++) {
                iArr[i9] = bArr2[i9] & 255;
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < 4) {
                int i12 = ((bArr2[i10 + 5] & 255) << (i10 << 3)) + i11;
                i10++;
                i11 = i12;
            }
            int i13 = iArr[0];
            int i14 = i13 / 45;
            int i15 = i13 % 45;
            int i16 = i15 / 9;
            int i17 = i15 % 9;
            int i18 = (768 << (i17 + i16)) + 1846;
            f642e = new byte[i11];
            f630b = new short[i18];
            int i19 = i18 << 1;
            int length = bArr3.length;
            int i20 = (768 << (i17 + i16)) + 1846;
            short[] sArr = f630b;
            int i21 = 0;
            boolean z2 = false;
            int i22 = 1;
            int i23 = 1;
            int i24 = 1;
            int i25 = 1;
            int i26 = (1 << i14) - 1;
            int i27 = (1 << i16) - 1;
            if (i19 >= (i20 << 1)) {
                for (int i28 = 0; i28 < i20; i28++) {
                    sArr[i28] = 1024;
                }
                f637d = bArr3;
                f659s = length;
                f660t = 0;
                f641e = 0L;
                f636d = 4294967295L;
                for (int i29 = 0; i29 < 5; i29++) {
                    f641e = (f641e << 8) | ((long) m391j());
                }
                int i30 = 0;
                int i31 = 0;
                while (i30 < i11) {
                    int i32 = i30 & i26;
                    if (m387h((i21 << 4) + 0 + i32) != 0) {
                        if (m387h(i21 + 192) == 1) {
                            if (m387h(i21 + 204) != 0) {
                                if (m387h(i21 + 216) == 0) {
                                    i8 = i23;
                                } else {
                                    if (m387h(i21 + 228) == 0) {
                                        i6 = i25;
                                        i7 = i24;
                                    } else {
                                        i6 = i24;
                                        i7 = i25;
                                    }
                                    i25 = i6;
                                    i24 = i23;
                                    i8 = i7;
                                }
                                i4 = i24;
                                i5 = i22;
                            } else if (m387h((i21 << 4) + 240 + i32) == 0) {
                                int i33 = i21 < 7 ? 9 : 11;
                                int i34 = f642e[i30 - i22] & 255;
                                f642e[i30] = (byte) i34;
                                i30++;
                                i31 = i34;
                                z2 = true;
                                i21 = i33;
                            } else {
                                i4 = i24;
                                i5 = i23;
                                i8 = i22;
                            }
                            iM385g = m385g(1332, i32);
                            i3 = i8;
                            i21 = i21 < 7 ? 8 : 11;
                        } else {
                            i21 = i21 < 7 ? 7 : 10;
                            int iM385g2 = m385g(818, i32);
                            int iM382f = m382f(((iM385g2 < 4 ? iM385g2 : 3) << 6) + 432, 6);
                            if (iM382f >= 4) {
                                int i35 = (iM382f >> 1) - 1;
                                int i36 = ((iM382f & 1) | 2) << i35;
                                if (iM382f < 14) {
                                    iM382f = m388h(((i36 + 688) - iM382f) - 1, i35) + i36;
                                } else {
                                    long j = f636d;
                                    long jM391j = f641e;
                                    int i37 = 0;
                                    for (int i38 = i35 - 4; i38 > 0; i38--) {
                                        j >>= 1;
                                        i37 <<= 1;
                                        if (jM391j >= j) {
                                            jM391j -= j;
                                            i37 |= 1;
                                        }
                                        if (j < 16777216) {
                                            j <<= 8;
                                            jM391j = (jM391j << 8) | ((long) m391j());
                                        }
                                    }
                                    f636d = j;
                                    f641e = jM391j;
                                    iM382f = (i37 << 4) + i36 + m388h(802, 4);
                                }
                            }
                            i3 = iM382f + 1;
                            iM385g = iM385g2;
                            i25 = i24;
                            i4 = i23;
                            i5 = i22;
                        }
                        int i39 = iM385g + 2;
                        while (true) {
                            i31 = f642e[i30 - i3] & 255;
                            int i40 = i30 + 1;
                            f642e[i30] = (byte) i31;
                            i39--;
                            if (i39 <= 0) {
                                i30 = i40;
                                i24 = i4;
                                i23 = i5;
                                i22 = i3;
                                z2 = true;
                                break;
                            }
                            if (i40 >= i11) {
                                i30 = i40;
                                i24 = i4;
                                i23 = i5;
                                i22 = i3;
                                z2 = true;
                                break;
                            }
                            i30 = i40;
                        }
                    } else {
                        int i41 = ((((i30 & i27) << i17) + ((i31 & 255) >> (8 - i17))) * 768) + 1846;
                        int i42 = i21 < 4 ? 0 : i21 < 10 ? i21 - 3 : i21 - 6;
                        if (z2) {
                            byte b = f642e[i30 - i22];
                            int iM387h = 1;
                            do {
                                int i43 = (b >> 7) & 1;
                                b = (byte) (b << 1);
                                int iM387h2 = m387h(((i43 + 1) << 8) + i41 + iM387h);
                                iM387h = (iM387h << 1) | iM387h2;
                                if (i43 != iM387h2) {
                                    while (iM387h < 256) {
                                        iM387h = m387h(iM387h + i41) | (iM387h << 1);
                                    }
                                    break;
                                }
                            } while (iM387h < 256);
                            i2 = iM387h & 255;
                            z = false;
                        } else {
                            int iM387h3 = 1;
                            do {
                                iM387h3 = m387h(iM387h3 + i41) | (iM387h3 << 1);
                            } while (iM387h3 < 256);
                            i2 = iM387h3 & 255;
                            z = z2;
                        }
                        f642e[i30] = (byte) i2;
                        i30++;
                        i31 = i2;
                        z2 = z;
                        i21 = i42;
                    }
                }
            }
            f630b = null;
            f637d = null;
            System.gc();
            f657q += iM384g;
            byte[] bArr4 = f642e;
            try {
                f642e = null;
                return bArr4;
            } catch (Exception e) {
                return bArr4;
            }
        } catch (Exception e2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    static final int m353b() {
        return f643f;
    }

    /* JADX INFO: renamed from: b */
    static int m354b(int i) {
        return m363c(f631b_ - i);
    }

    /* JADX INFO: renamed from: b */
    static int m355b(int i, int i2) {
        int iNextInt = f609a.nextInt();
        if (iNextInt < 0) {
            iNextInt = -iNextInt;
        }
        return (iNextInt % 10) + 0;
    }

    /* JADX INFO: renamed from: b */
    private static int m356b(InputStream inputStream) {
        return (m336a(inputStream) & 255) | ((m336a(inputStream) & 255) << 8);
    }

    /* JADX INFO: renamed from: b */
    private static int m357b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = i2;
        while (i4 > 0) {
            try {
                int i5 = f606a.read(bArr, i3, i4);
                i4 -= i5;
                i3 += i5;
            } catch (Exception e) {
            }
        }
        f657q += i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    static String m358b(int i) {
        if (i >= f620a.length) {
            return "";
        }
        try {
            return new String(f620a[i], "UTF-8");
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private void m359b() {
        if (f610a.getCurrent() != this) {
            f610a.setCurrent(this);
        }
        setFullScreenMode(true);
    }

    /* JADX INFO: renamed from: b */
    static final void m360b(int i, int i2, int i3, int i4) {
        f611a.drawLine(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    static void m361b(String str) {
        if (f620a == null) {
            InputStream inputStream = f606a;
            f606a = m340a(str);
            int iM386h = m386h();
            f620a = new byte[iM386h][];
            for (int i = 0; i < iM386h; i++) {
                int iM386h2 = m386h();
                f620a[i] = new byte[iM386h2];
                m357b(f620a[i], 0, iM386h2);
            }
            try {
                f606a.close();
            } catch (Exception e) {
            }
            f606a = inputStream;
        }
    }

    /* JADX INFO: renamed from: c */
    static final int m362c() {
        return f646g;
    }

    /* JADX INFO: renamed from: c */
    static int m363c(int i) {
        if (i < 0) {
            i = -i;
        }
        int i2 = (f655o - 1) & i;
        if (i2 <= f631b_) {
            return f617a[i2];
        }
        if (i2 < f635c_) {
            return -f617a[f635c_ - i2];
        }
        if (i2 <= f654n) {
            return -f617a[i2 - f635c_];
        }
        return f617a[f655o - i2];
    }

    /* JADX INFO: renamed from: c */
    static int m364c(int i, int i2) {
        int iM334a;
        if (f629b == null) {
            f629b = new int[f652l + 1];
            int i3 = 0;
            while (i3 < f652l + 1) {
                int[] iArr = f629b;
                int i4 = f652l;
                if (i4 > 0) {
                    if (i3 > 0) {
                        iM334a = m334a(0, f631b_, (f652l * i3) / i4);
                    } else {
                        iM334a = i3 == 0 ? 0 : m334a(f654n, f655o, (f652l * i3) / i4);
                    }
                } else if (i4 == 0) {
                    if (i3 > 0) {
                        iM334a = f631b_;
                    } else {
                        iM334a = i3 == 0 ? 0 : f654n;
                    }
                } else if (i3 > 0) {
                    iM334a = m334a(f631b_, f635c_, (f652l * i3) / i4);
                } else {
                    iM334a = i3 == 0 ? f635c_ : m334a(f635c_, f654n, (f652l * i3) / i4);
                }
                iArr[i3] = iM334a;
                i3++;
            }
        }
        if (i == 0) {
            if (i2 > 0) {
                return f631b_;
            }
            if (i2 != 0) {
                return f654n;
            }
            return 0;
        }
        if (i > 0) {
            if (i2 >= 0) {
                if (i >= i2) {
                    return f629b[(f652l * i2) / i];
                }
                return f631b_ - f629b[(f652l * i) / i2];
            }
            int i5 = -i2;
            if (i >= i5) {
                return f655o - f629b[(i5 * f652l) / i];
            }
            return f654n + f629b[(f652l * i) / i5];
        }
        int i6 = -i;
        if (i2 >= 0) {
            if (i6 >= i2) {
                return f635c_ - f629b[(f652l * i2) / i6];
            }
            return f631b_ + f629b[(i6 * f652l) / i2];
        }
        int i7 = -i2;
        if (i6 >= i7) {
            return f635c_ + f629b[(i7 * f652l) / i6];
        }
        return f654n - f629b[(i6 * f652l) / i7];
    }

    /* JADX INFO: renamed from: c */
    private static int m365c(InputStream inputStream) {
        return (m336a(inputStream) & 255) | ((m336a(inputStream) & 255) << 8) | ((m336a(inputStream) & 255) << 16) | ((m336a(inputStream) & 255) << 24);
    }

    /* JADX INFO: renamed from: c */
    static String m366c(int i) {
        String str = null;
        if (f618a != null) {
            return f618a[i];
        }
        try {
            int i2 = f638d[i + 1] - f638d[i];
            if (i2 != 0) {
                str = !f623b.equals("UTF-8") ? new String(f645f, f638d[i], i2, f623b) : m343a(f645f, f638d[i], i2);
            }
            return str;
        } catch (Exception e) {
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m367c() {
        int i = f658r == f626b + (-1) ? f614a - f619a[f658r] : f619a[f658r + 1] - f619a[f658r];
        f634c = new int[i + 1];
        for (int i2 = 0; i2 < i + 1; i2++) {
            f634c[i2] = (m386h() & 255) | ((m386h() & 255) << 8) | ((m386h() & 255) << 16) | ((m386h() & 255) << 24);
        }
    }

    /* JADX INFO: renamed from: c */
    static final void m368c(int i, int i2, int i3, int i4) {
        f611a.fillRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    static final void m369c(String str) {
        f623b = str;
    }

    /* JADX INFO: renamed from: d */
    static final int m370d() {
        return f611a.getClipX();
    }

    /* JADX INFO: renamed from: d */
    static final int m371d(int i) {
        return Math.abs(i);
    }

    /* JADX INFO: renamed from: d */
    static final int m372d(int i, int i2) {
        return Math.max(i, 0);
    }

    /* JADX INFO: renamed from: d */
    private static int m373d(InputStream inputStream) {
        try {
            int iM365c = m365c(inputStream);
            f662v = iM365c;
            f638d = new int[iM365c + 1];
            for (int i = 1; i < f662v + 1; i++) {
                f638d[i] = m365c(inputStream);
            }
            f645f = new byte[f638d[f662v]];
            m337a(inputStream, f645f, 0, f645f.length);
        } catch (Exception e) {
        }
        return f645f.length + ((f662v + 1) << 2);
    }

    /* JADX INFO: renamed from: d */
    private static void m374d() {
        String[] strArr = new String[f662v];
        for (int i = 0; i < f662v; i++) {
            strArr[i] = m366c(i);
        }
        f618a = strArr;
        f638d = null;
        f645f = null;
        System.gc();
    }

    /* JADX INFO: renamed from: d */
    static final void m375d(int i) {
        f611a.setColor(i);
    }

    /* JADX INFO: renamed from: d */
    static final void m376d(int i, int i2, int i3, int i4) {
        f611a.drawRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: e */
    static final int m377e() {
        return f611a.getClipY();
    }

    /* JADX INFO: renamed from: e */
    private static int m378e(int i) {
        return (f653m * i) / 360;
    }

    /* JADX INFO: renamed from: e */
    private static int m379e(int i, int i2) {
        return ((int) ((((((long) i) << 8) << 1) / ((long) i2)) + 1)) >> 1;
    }

    /* JADX INFO: renamed from: f */
    static final int m380f() {
        return f611a.getClipWidth();
    }

    /* JADX INFO: renamed from: f */
    private static int m381f(int i) {
        int iM363c = m363c(i);
        if (iM363c == 0) {
            return Integer.MAX_VALUE;
        }
        return (m354b(i) << 8) / iM363c;
    }

    /* JADX INFO: renamed from: f */
    private static int m382f(int i, int i2) {
        int iM387h = 1;
        for (int i3 = i2; i3 > 0; i3--) {
            iM387h = m387h(iM387h + i) + (iM387h << 1);
        }
        return iM387h - (1 << i2);
    }

    /* JADX INFO: renamed from: g */
    static final int m383g() {
        return f611a.getClipHeight();
    }

    /* JADX INFO: renamed from: g */
    private static int m384g(int i) {
        int i2 = f626b - 1;
        while (i2 >= 0 && f619a[i2] > i) {
            i2--;
        }
        if (f658r != i2) {
            f658r = i2;
            m393l();
            if (f658r == 0) {
                String str = f607a;
                f607a = null;
                m348a(str);
            } else {
                f606a = m340a(new StringBuffer().append(f607a).append(".").append(f658r).toString());
                m367c();
            }
        } else if (f606a == null) {
            if (f658r == 0) {
                String str2 = f607a;
                f607a = null;
                m348a(str2);
            } else {
                f606a = m340a(new StringBuffer().append(f607a).append(".").append(f658r).toString());
            }
        }
        int i3 = i - f619a[f658r];
        int i4 = f634c[i3];
        int i5 = f634c[i3 + 1] - f634c[i3];
        if (f657q != i4) {
            if (f657q > i4) {
                m393l();
                if (f658r == 0) {
                    f606a = m340a(f607a);
                } else {
                    f606a = m340a(new StringBuffer().append(f607a).append(".").append(f658r).toString());
                }
            } else {
                i4 -= f657q;
            }
            m345a(i4);
        }
        f627b = false;
        if (i5 <= 0) {
            return i5;
        }
        int iM386h = m386h() & 255;
        f639d_ = iM386h;
        if (iM386h >= 127) {
            f639d_ -= 127;
            f627b = true;
        }
        return i5 - 1;
    }

    /* JADX INFO: renamed from: g */
    private static int m385g(int i, int i2) {
        if (m387h(i) == 0) {
            return m382f(i + 2 + (i2 << 3), 3);
        }
        return m387h(i + 1) == 0 ? m382f(i + 130 + (i2 << 3), 3) + 8 : m382f(i + 258, 8) + 16;
    }

    /* JADX INFO: renamed from: h */
    private static int m386h() {
        int i = 0;
        try {
            i = f606a.read();
        } catch (Exception e) {
        }
        f657q++;
        return i;
    }

    /* JADX INFO: renamed from: h */
    private static int m387h(int i) {
        long j = (f636d >> 11) * ((long) f630b[i]);
        if (f641e < j) {
            f636d = j;
            short[] sArr = f630b;
            sArr[i] = (short) (sArr[i] + ((2048 - f630b[i]) >> 5));
            if (f636d < 16777216) {
                f641e = (f641e << 8) | ((long) m391j());
                f636d <<= 8;
            }
            return 0;
        }
        f636d -= j;
        f641e -= j;
        short[] sArr2 = f630b;
        sArr2[i] = (short) (sArr2[i] - (f630b[i] >> 5));
        if (f636d < 16777216) {
            f641e = (f641e << 8) | ((long) m391j());
            f636d <<= 8;
        }
        return 1;
    }

    /* JADX INFO: renamed from: h */
    private static int m388h(int i, int i2) {
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int iM387h = m387h(i + i3);
            i3 = (i3 << 1) + iM387h;
            int i6 = (iM387h << i4) | i5;
            i4++;
            i5 = i6;
        }
        return i5;
    }

    /* JADX INFO: renamed from: i */
    private static int m389i() {
        return (m386h() & 255) | ((m386h() & 255) << 8);
    }

    /* JADX INFO: renamed from: i */
    protected static void m390i() {
        f644f = true;
        try {
            RunnableC0006g.m276o();
            RunnableC0006g.m277p();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: j */
    private static int m391j() {
        if (f660t == f659s) {
            return 255;
        }
        byte[] bArr = f637d;
        int i = f660t;
        f660t = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: k */
    protected static void m392k() {
        f640e = -1;
    }

    /* JADX INFO: renamed from: l */
    static void m393l() {
        if (f606a != null) {
            try {
                f606a.close();
            } catch (Exception e) {
            }
            f606a = null;
        }
        f657q = 0;
        System.gc();
    }

    /* JADX INFO: renamed from: m */
    static final void m394m() {
        System.gc();
    }

    /* JADX INFO: renamed from: a */
    abstract void mo146a();

    /* JADX INFO: renamed from: h */
    protected final void m395h() {
        if (f640e >= 0) {
            return;
        }
        f643f = 240;
        f646g = 320;
        f616a = new byte[20];
        f628b = new byte[20];
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f609a == null) {
            f609a = new Random(jCurrentTimeMillis);
        } else {
            f609a.setSeed(jCurrentTimeMillis);
        }
        f640e = 0;
        new Thread(this).start();
    }

    public void hideNotify() {
        m390i();
    }

    /* JADX INFO: renamed from: j */
    protected final void m396j() {
        if (f644f) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f605a = jCurrentTimeMillis;
            f632c = jCurrentTimeMillis;
            this.f664b = jCurrentTimeMillis;
            f644f = false;
            m359b();
            f647g = true;
            repaint();
            if (f616a == null || f628b == null) {
                return;
            }
            for (int i = 0; i < 20; i++) {
                f616a[i] = 0;
                f628b[i] = 0;
            }
        }
    }

    protected void keyPressed(int i) {
        byte bM330a = m330a(i);
        if (f628b[bM330a] > 0) {
            return;
        }
        if (f628b[bM330a] < 0) {
            f628b[bM330a] = 0;
        }
        if (f628b[bM330a] < 126) {
            byte[] bArr = f628b;
            bArr[bM330a] = (byte) (bArr[bM330a] + 1);
        }
    }

    protected void keyReleased(int i) {
        byte bM330a = m330a(i);
        if (f628b[bM330a] > 0) {
            byte[] bArr = f628b;
            bArr[bM330a] = (byte) (-bArr[bM330a]);
        }
    }

    public void paint(Graphics graphics) {
        if (f644f || f615a) {
            return;
        }
        f615a = true;
        for (int i = 0; i < 20; i++) {
            f616a[i] = f628b[i];
            if (f628b[i] != 0) {
                if (f628b[i] < 0) {
                    f628b[i] = 0;
                } else if (f628b[i] < 126) {
                    byte[] bArr = f628b;
                    bArr[i] = (byte) (bArr[i] + 1);
                    if (i >= 18) {
                        byte[] bArr2 = f628b;
                        bArr2[i] = (byte) (-bArr2[i]);
                    }
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        f605a = jCurrentTimeMillis;
        int i2 = (int) (jCurrentTimeMillis - f632c);
        f622a_ = i2;
        if (i2 < 0) {
            f622a_ = 0;
        }
        if (f622a_ > 1000) {
            f622a_ = 1000;
        }
        f632c = f605a;
        f649i += f622a_;
        f650j++;
        try {
            f625b = graphics;
            f611a = graphics;
            mo146a();
        } catch (Exception e) {
            f640e = -1;
        }
        f647g = false;
        f615a = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m359b();
            f615a = false;
            while (f640e >= 0) {
                if (f644f) {
                    this.f664b = Math.min(this.f664b, System.currentTimeMillis());
                    try {
                        Thread.sleep(1L);
                    } catch (Exception e) {
                    }
                } else {
                    repaint();
                    serviceRepaints();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f664b = Math.min(this.f664b, jCurrentTimeMillis);
                    try {
                        Thread.sleep(Math.max(1L, ((long) f648h) - (jCurrentTimeMillis - this.f664b)));
                    } catch (Exception e2) {
                    }
                    this.f664b = System.currentTimeMillis();
                }
            }
        } catch (Exception e3) {
            f640e = -1;
        }
        f616a = null;
        f628b = null;
        f620a = null;
        System.gc();
        f612a.notifyDestroyed();
    }

    public void showNotify() {
        m396j();
    }

    public void sizeChanged(int i, int i2) {
        f643f = i;
        f646g = i2;
    }
}
