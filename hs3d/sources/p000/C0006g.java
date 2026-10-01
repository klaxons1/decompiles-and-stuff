package p000;

import java.io.InputStream;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
public final class C0006g {

    /* JADX INFO: renamed from: a */
    private static Image[] f166a;

    /* JADX INFO: renamed from: a */
    private static byte[][] f167a;

    /* JADX INFO: renamed from: a */
    private static byte[][][] f168a;

    /* JADX INFO: renamed from: b */
    private static boolean f170b;

    /* JADX INFO: renamed from: b */
    static byte[] f171b;

    /* JADX INFO: renamed from: b */
    private static int[] f172b;

    /* JADX INFO: renamed from: b */
    private static byte[][] f173b;

    /* JADX INFO: renamed from: c */
    private static byte[][] f177c;

    /* JADX INFO: renamed from: d */
    private static int f178d;

    /* JADX INFO: renamed from: d */
    private static byte[] f180d;

    /* JADX INFO: renamed from: d */
    private static byte[][] f181d;

    /* JADX INFO: renamed from: e */
    private static int f182e;

    /* JADX INFO: renamed from: e */
    private static byte[] f184e;

    /* JADX INFO: renamed from: e */
    private static byte[][] f185e;

    /* JADX INFO: renamed from: f */
    private static int f186f;

    /* JADX INFO: renamed from: f */
    private static byte[] f187f;

    /* JADX INFO: renamed from: f */
    private static byte[][] f188f;

    /* JADX INFO: renamed from: g */
    private static int f189g;

    /* JADX INFO: renamed from: g */
    private static byte[] f190g;

    /* JADX INFO: renamed from: g */
    private static byte[][] f191g;

    /* JADX INFO: renamed from: h */
    private static int f192h;

    /* JADX INFO: renamed from: h */
    private static byte[][] f193h;

    /* JADX INFO: renamed from: a */
    static int f162a = 0;

    /* JADX INFO: renamed from: c */
    private static byte[] f176c = new byte[26];

    /* JADX INFO: renamed from: b */
    private static int f169b = -1000;

    /* JADX INFO: renamed from: c */
    private static int f174c = 0;

    /* JADX INFO: renamed from: a */
    static byte[] f164a = {77, 105, 99, 114, 111, 69, 100, 105, 116, 105, 111, 110, 46, 83, 68, 75};

    /* JADX INFO: renamed from: c */
    private static boolean f175c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f179d = false;

    /* JADX INFO: renamed from: a */
    static boolean f163a = false;

    /* JADX INFO: renamed from: a */
    private static int[] f165a = new int[10];

    /* JADX INFO: renamed from: e */
    private static boolean f183e = false;

    /* JADX INFO: renamed from: a */
    static int m64a() {
        if (f168a == null || f172b == null) {
            return 0;
        }
        return f172b[2] / 100;
    }

    /* JADX INFO: renamed from: a */
    static int m65a(int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < f162a; i4++) {
            int iM167a = C0011l.m167a((int) m82a()[i4]);
            if (iM167a != 13) {
                if (iM167a == 10) {
                    if (i2 >= i3) {
                        i3 = i2;
                    }
                    i2 = 0;
                } else if (iM167a == 32) {
                    i2 += 4;
                } else if (iM167a == 1) {
                    i = 1;
                } else if (iM167a == 2) {
                    i = 1;
                } else if (iM167a == 3) {
                    i = 0;
                } else if (iM167a != 4 && iM167a != 6 && iM167a != 7) {
                    if (i == 1 && ((iM167a > 96 && iM167a < 123) || iM167a > 223)) {
                        iM167a -= 32;
                    } else if (i == 1 && (iM167a == 154 || iM167a == 156 || iM167a == 157 || iM167a == 158 || iM167a == 159 || iM167a == 179 || iM167a == 186 || iM167a == 191)) {
                        iM167a -= 16;
                    }
                    i2 += f191g[i][iM167a];
                }
            }
        }
        return i2 >= i3 ? i2 : i3;
    }

    /* JADX INFO: renamed from: a */
    static C0006g m66a() {
        f170b = false;
        f162a = 0;
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: a */
    static final C0006g m67a(char c) {
        f170b = false;
        f176c[0] = C0011l.m160a(c);
        f162a = 1;
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: a */
    static C0006g m68a(int i) {
        int i2;
        int i3 = 1;
        f170b = false;
        f162a = 0;
        if (i < 0) {
            f176c[0] = 45;
            i2 = -i;
            f162a = 1;
        } else {
            i2 = i;
        }
        if (i2 < 10) {
            f176c[f162a] = (byte) (i2 + 48);
            f162a++;
            return RunnableC0008i.f282a;
        }
        int i4 = 0;
        for (int i5 = i2; i5 > 0; i5 /= 10) {
            i4++;
            i3 *= 10;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            f176c[f162a + i6] = (byte) (((i2 % i3) / (i3 / 10)) + 48);
            i3 /= 10;
        }
        f162a += i4;
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: a */
    static C0006g m69a(String str) {
        f170b = false;
        int length = str.length();
        f162a = length;
        m99g(length);
        for (int i = 0; i < f162a; i++) {
            f176c[i] = C0011l.m160a(str.charAt(i));
        }
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: a */
    static final C0006g m70a(byte[] bArr) {
        f170b = true;
        f180d = bArr;
        f162a = bArr.length;
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: a */
    static final String m71a() {
        return new String(m82a(), 0, f162a);
    }

    /* JADX INFO: renamed from: a */
    static void m72a() {
        f175c = true;
    }

    /* JADX INFO: renamed from: a */
    static void m73a(float f) {
        if (f168a == null || f172b == null) {
            return;
        }
        int i = f172b[0];
        int i2 = f172b[1];
        int i3 = f172b[2];
        int i4 = f172b[3];
        if ((f168a.length * f171b[i4]) + 12 > i2) {
            int length = (int) (i3 + (100.0f * f));
            if (length < 0) {
                length = 0;
            } else if (length > (((f168a.length * f171b[i4]) + 12) - i2) * 100) {
                length = (((f168a.length * f171b[i4]) + 12) - i2) * 100;
            }
            f172b[0] = i;
            f172b[1] = i2;
            f172b[2] = length;
            f172b[3] = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m74a(int i) {
        if (C0000a.f22b > 0) {
            if (C0009j.f405j > 1 || (C0009j.f405j == 1 && RunnableC0008i.f329j == 0)) {
                int i2 = C0000a.f22b - RunnableC0008i.f296b;
                C0000a.f22b = i2;
                if (i2 < 1) {
                    C0000a.f22b = 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    static void m75a(String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        Image[] imageArr = new Image[2];
        f166a = imageArr;
        imageArr[0] = C0011l.m176a(new StringBuffer().append("/").append(str).append(".cc").toString());
        f166a[1] = C0011l.m176a(new StringBuffer().append("/").append(str).append("2.cc").toString());
        InputStream inputStream2 = null;
        try {
            InputStream inputStreamM172a = C0011l.m172a(new StringBuffer().append("/").append(str).append(".fnt").toString());
            try {
                f184e = new byte[2];
                f171b = new byte[2];
                f167a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 256);
                f173b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 256);
                f177c = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 256);
                f181d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 256);
                f185e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 256);
                f188f = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 256);
                f191g = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 256);
                for (int i = 0; i < 2; i++) {
                    f184e[i] = (byte) inputStreamM172a.read();
                }
                for (int i2 = 0; i2 < 2; i2++) {
                    f171b[i2] = (byte) inputStreamM172a.read();
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    for (int i4 = 0; i4 < 256; i4++) {
                        f167a[i3][i4] = (byte) inputStreamM172a.read();
                    }
                }
                for (int i5 = 0; i5 < 2; i5++) {
                    for (int i6 = 0; i6 < 256; i6++) {
                        f173b[i5][i6] = (byte) inputStreamM172a.read();
                    }
                }
                for (int i7 = 0; i7 < 2; i7++) {
                    for (int i8 = 0; i8 < 256; i8++) {
                        f177c[i7][i8] = (byte) inputStreamM172a.read();
                    }
                }
                for (int i9 = 0; i9 < 2; i9++) {
                    for (int i10 = 0; i10 < 256; i10++) {
                        f181d[i9][i10] = (byte) inputStreamM172a.read();
                    }
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    for (int i12 = 0; i12 < 256; i12++) {
                        f185e[i11][i12] = (byte) inputStreamM172a.read();
                    }
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    for (int i14 = 0; i14 < 256; i14++) {
                        f188f[i13][i14] = (byte) inputStreamM172a.read();
                    }
                }
                for (int i15 = 0; i15 < 2; i15++) {
                    for (int i16 = 0; i16 < 256; i16++) {
                        f191g[i15][i16] = (byte) inputStreamM172a.read();
                    }
                }
                if (inputStreamM172a != null) {
                    try {
                        inputStreamM172a.close();
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e2) {
                inputStream2 = inputStreamM172a;
                try {
                    RunnableC0008i.m127b(true, "f");
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    if (inputStream != null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Exception e4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = inputStreamM172a;
                if (inputStream != null) {
                    throw th;
                }
                inputStream.close();
                throw th;
            }
        } catch (Exception e5) {
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m76a(String str, int i, int i2, int i3, int i4, String str2, int i5) {
        if (str2 == null) {
            return;
        }
        m77a(str, 319, 182, 239, 262, str2.getBytes(), 0);
    }

    /* JADX INFO: renamed from: a */
    static void m77a(String str, int i, int i2, int i3, int i4, byte[] bArr, int i5) {
        if (bArr == null) {
            return;
        }
        m78a(str, i, i2, i3, i4, bArr, i5, 0);
    }

    /* JADX INFO: renamed from: a */
    static void m78a(String str, int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        int i7;
        byte[] bArr2;
        byte[][][] bArr3;
        int i8;
        int i9;
        int i10;
        if (bArr == null) {
            return;
        }
        if (f175c) {
            f175c = false;
            f168a = null;
            f187f = null;
            f172b = null;
            f193h = null;
            f190g = null;
        }
        int i11 = 0;
        int i12 = 0;
        int iM167a = 0;
        byte[][][] bArr4 = new byte[100][][];
        byte[] bArr5 = new byte[100];
        byte[][] bArr6 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 20, 2);
        if ((C0009j.f384d[7] != 0 || !C0009j.f368b) && str.equals("help")) {
            int i13 = -1;
            int i14 = 0;
            while (i14 < bArr.length) {
                iM167a = C0011l.m167a((int) bArr[i14]);
                if (iM167a != 6) {
                    i7 = i14;
                } else if (i13 == -1) {
                    i7 = i14;
                    i13 = i14;
                } else {
                    int i15 = i14 + 1;
                    byte[] bArr7 = new byte[bArr.length - (i15 - i13)];
                    System.arraycopy(bArr, 0, bArr7, 0, i13);
                    System.arraycopy(bArr, i15, bArr7, i13, bArr.length - i15);
                    i13 = -1;
                    i7 = 0;
                    bArr = bArr7;
                }
                i14 = i7 + 1;
            }
        }
        if (str.equals("help") && !C0009j.f377c) {
            int i16 = -1;
            int i17 = 0;
            while (i17 < bArr.length) {
                iM167a = C0011l.m167a((int) bArr[i17]);
                if (iM167a != 7) {
                    i10 = i17;
                } else if (i16 == -1) {
                    i10 = i17;
                    i16 = i17;
                } else {
                    int i18 = i17 + 1;
                    byte[] bArr8 = new byte[bArr.length - (i18 - i16)];
                    System.arraycopy(bArr, 0, bArr8, 0, i16);
                    System.arraycopy(bArr, i18, bArr8, i16, bArr.length - i18);
                    i16 = -1;
                    i10 = 0;
                    bArr = bArr8;
                }
                i17 = i10 + 1;
            }
        }
        f179d = false;
        f183e = false;
        f178d = i6;
        f190g = bArr;
        f182e = i;
        f186f = i2;
        f189g = i3;
        f192h = i4;
        int i19 = i6;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = i6;
        while (i19 <= bArr.length) {
            if (i19 < bArr.length) {
                iM167a = C0011l.m167a((int) bArr[i19]);
            }
            if (i5 == 1 && ((iM167a > 96 && iM167a < 123) || iM167a > 223)) {
                iM167a -= 32;
            } else if (i5 == 1 && (iM167a == 154 || iM167a == 156 || iM167a == 157 || iM167a == 158 || iM167a == 159 || iM167a == 179 || iM167a == 186 || iM167a == 191)) {
                iM167a -= 16;
            }
            if (iM167a == 0) {
                while (i20 > 0 && i21 - bArr6[i20 - 1][0] < 4) {
                    if (bArr4[i21] == null) {
                        bArr4[i21] = new byte[1][];
                    }
                    bArr4[i21][0] = new byte[0];
                    i21++;
                }
                bArr6[i20][0] = (byte) i21;
                bArr6[i20][1] = bArr[i19 + 1];
                i20++;
                i19++;
                i23 += 2;
                i8 = i12;
                i9 = i11;
            } else if ((iM167a == 13 || iM167a == 1 || iM167a == 2 || iM167a == 4 || iM167a == 6 || iM167a == 7) && i19 < bArr.length) {
                i8 = i12;
                i9 = i11;
            } else if (iM167a == 10 || iM167a == 32 || i19 == bArr.length) {
                int i24 = i12 + 4;
                if (bArr4[i21] == null) {
                    bArr4[i21] = new byte[20][];
                }
                bArr4[i21][i11] = new byte[i19 - i23];
                System.arraycopy(bArr, i23, bArr4[i21][i11], 0, i19 - i23);
                i23 = i19 + 1;
                i9 = i11 + 1;
                if (iM167a == 10 || i19 == bArr.length) {
                    int i25 = i9 > 1 ? i9 - 1 : i9;
                    bArr5[i21] = (byte) (((i - 12) - (i24 - (i25 * 4))) / i25);
                    if (bArr5[i21] > 28) {
                        bArr5[i21] = (byte) (bArr5[i21] / 3);
                    }
                    if (bArr5[i21] < 4) {
                        bArr5[i21] = 4;
                    }
                    i21++;
                    i22 = 0;
                    i8 = 0;
                    i9 = 0;
                } else {
                    i22 = 0;
                    i8 = i24;
                }
            } else {
                i8 = f191g[i5][iM167a] + i12;
                int i26 = i22 + f191g[i5][iM167a];
                if (i11 <= 0 || i8 < i - 12) {
                    i22 = i26;
                    i9 = i11;
                } else {
                    if (i11 > 1) {
                        i11--;
                    }
                    bArr5[i21] = (byte) (((i - 12) - ((i8 - i26) - (i11 * 4))) / i11);
                    if (bArr5[i21] > 28) {
                        bArr5[i21] = (byte) (bArr5[i21] / 3);
                    }
                    if (bArr5[i21] < 4) {
                        bArr5[i21] = 4;
                    }
                    i21++;
                    i22 = i26;
                    i8 = i26;
                    i9 = 0;
                }
            }
            i19++;
            i12 = i8;
            i11 = i9;
            i23 = i23;
        }
        while (i20 > 0 && i21 - bArr6[i20 - 1][0] < 3) {
            if (bArr4[i21] == null) {
                bArr4[i21] = new byte[1][];
            }
            bArr4[i21][0] = new byte[0];
            i21++;
        }
        int i27 = 0;
        while (true) {
            if (i27 >= bArr4.length) {
                bArr2 = bArr5;
                bArr3 = bArr4;
                break;
            }
            if (bArr4[i27] == null) {
                bArr3 = new byte[i27][][];
                System.arraycopy(bArr4, 0, bArr3, 0, i27);
                byte[] bArr9 = new byte[i27];
                System.arraycopy(bArr5, 0, bArr9, 0, i27);
                bArr2 = bArr9;
                break;
            }
            for (int i28 = 0; i28 < bArr4[i27].length; i28++) {
                if (bArr4[i27][i28] == null) {
                    byte[][] bArr10 = new byte[i28][];
                    System.arraycopy(bArr4[i27], 0, bArr10, 0, i28);
                    bArr4[i27] = bArr10;
                    break;
                }
            }
            i27++;
        }
        if (i20 > 0) {
            byte[][] bArr11 = new byte[i20][];
            System.arraycopy(bArr6, 0, bArr11, 0, i20);
            f193h = bArr11;
        }
        int length = (bArr3.length * f171b[i5]) + 12;
        if (length < i2) {
            i2 = length;
        }
        f172b = new int[]{i, i2, 0, i5};
        f168a = bArr3;
        f187f = bArr2;
    }

    /* JADX INFO: renamed from: a */
    static void m79a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        int i7 = 0;
        if (i5 == 1 || i5 == 2) {
            int i8 = i3;
            for (int i9 = 0; i9 < f162a; i9++) {
                int iM167a = C0011l.m167a((int) m82a()[i9]);
                if (iM167a != 13) {
                    if (iM167a == 10) {
                        f165a[i7] = i6;
                        i7++;
                        i6 = 0;
                    } else if (iM167a == 32) {
                        i6 += 4;
                    } else if (iM167a == 1) {
                        i8 = 1;
                    } else if (iM167a == 2) {
                        i8 = 1;
                    } else if (iM167a == 3) {
                        i8 = 0;
                    } else if (iM167a == 5) {
                        i8 = 0;
                    } else if (iM167a != 4 && iM167a != 6 && iM167a != 7) {
                        if (i8 == 1 && ((iM167a > 96 && iM167a < 123) || iM167a > 223)) {
                            iM167a -= 32;
                        } else if (i8 == 1 && (iM167a == 154 || iM167a == 156 || iM167a == 157 || iM167a == 158 || iM167a == 159 || iM167a == 179 || iM167a == 186 || iM167a == 191)) {
                            iM167a -= 16;
                        }
                        i6 += f191g[i8][iM167a];
                        if (f163a) {
                            i6--;
                        }
                    }
                }
            }
            f165a[i7] = i6;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            int i14 = i11;
            int i15 = i10;
            if (i13 >= f162a) {
                f163a = false;
                return;
            }
            int iM167a2 = C0011l.m167a((int) m82a()[i13]);
            if (iM167a2 != 13) {
                if (iM167a2 == 10) {
                    i14++;
                    i15 = 0;
                } else if (iM167a2 == 32) {
                    i15 += 4;
                } else if (iM167a2 == 1) {
                    i3 = 1;
                    i4 = 0;
                } else if (iM167a2 == 2) {
                    i3 = 1;
                    i4 = 1;
                } else if (iM167a2 == 3) {
                    i3 = 0;
                    i4 = 1;
                } else if (iM167a2 == 5) {
                    i3 = 0;
                    i4 = 0;
                } else if (iM167a2 != 4 && iM167a2 != 6 && iM167a2 != 7) {
                    int i16 = (i3 != 1 || ((iM167a2 <= 96 || iM167a2 >= 123) && iM167a2 <= 223)) ? (i3 == 1 && (iM167a2 == 154 || iM167a2 == 156 || iM167a2 == 157 || iM167a2 == 158 || iM167a2 == 159 || iM167a2 == 179 || iM167a2 == 186 || iM167a2 == 191)) ? iM167a2 - 16 : iM167a2 : iM167a2 - 32;
                    switch (i5) {
                        case 1:
                            graphics.drawRegion(f166a[i4], f167a[i3][i16] < 0 ? f167a[i3][i16] + 256 : f167a[i3][i16], f173b[i3][i16] < 0 ? f173b[i3][i16] + 256 : f184e[i3] + f173b[i3][i16], f177c[i3][i16], f181d[i3][i16], 0, ((i + i15) + f185e[i3][i16]) - (f165a[i14] / 2), (f171b[i3] * i14) + f188f[i3][i16] + i2, 0);
                            break;
                        case 2:
                            graphics.drawRegion(f166a[i4], f167a[i3][i16] < 0 ? f167a[i3][i16] + 256 : f167a[i3][i16], f173b[i3][i16] < 0 ? f173b[i3][i16] + 256 : f184e[i3] + f173b[i3][i16], f177c[i3][i16], f181d[i3][i16], 0, ((i + i15) + f185e[i3][i16]) - f165a[i14], (f171b[i3] * i14) + f188f[i3][i16] + i2, 0);
                            break;
                        case 3:
                            graphics.drawRegion(f166a[i4], f167a[i3][i16] < 0 ? f167a[i3][i16] + 256 : f167a[i3][i16], f173b[i3][i16] < 0 ? f173b[i3][i16] + 256 : f184e[i3] + f173b[i3][i16], f177c[i3][i16], f181d[i3][i16], 0, (((i + i15) + f185e[i3][i16]) + i) - f165a[i14], (f171b[i3] * i14) + f188f[i3][i16] + i2, 0);
                            break;
                        default:
                            graphics.drawRegion(f166a[i4], f167a[i3][i16] < 0 ? f167a[i3][i16] + 256 : f167a[i3][i16], f173b[i3][i16] < 0 ? f173b[i3][i16] + 256 : f184e[i3] + f173b[i3][i16], f177c[i3][i16], f181d[i3][i16], 0, f185e[i3][i16] + i + i15, (f171b[i3] * i14) + f188f[i3][i16] + i2, 0);
                            break;
                    }
                    i15 += f191g[i3][i16];
                    if (f163a) {
                        i15--;
                    }
                }
            }
            i11 = i14;
            i10 = i15;
            i12 = i13 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m80a(Graphics graphics, int i, int i2, boolean z, boolean z2, int i3) {
        int i4;
        int i5;
        char c;
        if (f168a == null || f172b == null) {
            return;
        }
        int i6 = f172b[0];
        int i7 = f172b[1];
        int i8 = f172b[2] / 100;
        int i9 = f172b[3];
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        if (z) {
            graphics.setColor(-1);
            graphics.drawRect(i, i2, i6, i7);
        }
        int length = (f168a.length * f171b[i9]) + 12;
        if (length > i7) {
            int i10 = ((i7 * i7) / length) - 2;
            graphics.setColor(-12303292);
            graphics.fillRect((i + i6) - 3, i2 + 3, 2, i7 - 6);
            graphics.setColor(-1);
            int i11 = (i + i6) - 3;
            int i12 = ((i7 * i8) / length) + i2 + 2;
            if (i10 < 1) {
                i10 = 1;
            }
            graphics.fillRect(i11, i12, 2, i10);
            graphics.setColor(-4473925);
            graphics.drawLine((i + i6) - 3, i2 + 2, (i + i6) - 2, i2 + 2);
            graphics.drawLine((i + i6) - 4, i2 + 3, (i + i6) - 1, i2 + 3);
            graphics.drawLine((i + i6) - 4, (i2 + i7) - 3, (i + i6) - 1, (i2 + i7) - 3);
            graphics.drawLine((i + i6) - 3, (i2 + i7) - 2, (i + i6) - 2, (i2 + i7) - 2);
        }
        graphics.setClip(i, i2, i6, i7);
        int i13 = 0;
        int i14 = i8 / f171b[i9];
        while (true) {
            int i15 = i14;
            int i16 = i13;
            if (i15 >= f168a.length || (i16 - 1) * f171b[i9] > i7) {
                break;
            }
            int i17 = 0;
            if (f168a[i15][0].length <= 0 || f168a[i15][0][0] != 4) {
                i4 = 0;
            } else {
                z2 = false;
                int i18 = i9;
                for (int i19 = 0; i19 < f168a[i15].length; i19++) {
                    int i20 = i17;
                    for (int i21 = 0; i21 < f168a[i15][i19].length; i21++) {
                        int iM167a = C0011l.m167a((int) f168a[i15][i19][i21]);
                        if (iM167a == 1) {
                            i18 = 1;
                        } else if (iM167a == 2) {
                            i18 = 1;
                        } else if (iM167a == 3) {
                            i18 = 0;
                        } else if (iM167a == 5) {
                            i18 = 0;
                        } else if (iM167a != 4 && iM167a != 6 && iM167a != 7) {
                            if (i18 == 1 && ((iM167a > 96 && iM167a < 123) || iM167a > 223)) {
                                iM167a -= 32;
                            } else if (i18 == 1 && (iM167a == 154 || iM167a == 156 || iM167a == 157 || iM167a == 158 || iM167a == 159 || iM167a == 179 || iM167a == 186 || iM167a == 191)) {
                                iM167a -= 16;
                            }
                            i20 += f191g[i18][iM167a];
                        }
                    }
                    i17 = i19 + 1 < f168a[i15].length ? i20 + 4 : i20;
                }
                i4 = (i6 - i17) / 2;
            }
            char c2 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = i9;
            while (i23 < f168a[i15].length) {
                int i25 = 0;
                int i26 = i24;
                while (true) {
                    i5 = i22;
                    if (i25 >= f168a[i15][i23].length) {
                        break;
                    }
                    int i27 = f168a[i15][i23][i25] < 0 ? f168a[i15][i23][i25] + 256 : f168a[i15][i23][i25];
                    if (i27 == 1) {
                        i26 = 1;
                    } else {
                        if (i27 == 2) {
                            i26 = 1;
                            c = 1;
                        } else if (i27 == 3) {
                            i26 = 0;
                            c = 1;
                        } else if (i27 == 5) {
                            i26 = 0;
                        } else {
                            if (i27 != 4 && i27 != 6 && i27 != 7) {
                                int i28 = (i26 != 1 || ((i27 <= 96 || i27 >= 123) && i27 <= 223)) ? (i26 == 1 && (i27 == 154 || i27 == 156 || i27 == 157 || i27 == 158 || i27 == 159 || i27 == 179 || i27 == 186 || i27 == 191)) ? i27 - 16 : i27 : i27 - 32;
                                char c3 = i28 == 40 ? c2 == 0 ? (char) 1 : (char) 0 : c2;
                                graphics.drawRegion(f166a[c3], f167a[i26][i28] < 0 ? f167a[i26][i28] + 256 : f167a[i26][i28], f173b[i26][i28] < 0 ? f173b[i26][i28] + 256 : f184e[i26] + f173b[i26][i28], f177c[i26][i28], f181d[i26][i28], 0, i + 6 + i5 + f185e[i26][i28] + i4, (((i2 + 6) + f188f[i26][i28]) + (f171b[i9] * i16)) - (i8 % f171b[i9]), 0);
                                i5 += f191g[i26][i28];
                                if (i28 != 41) {
                                    c2 = c3;
                                } else if (c3 == 0) {
                                    c = 1;
                                }
                            }
                            i22 = i5;
                            i25++;
                        }
                        c2 = c;
                        i22 = i5;
                        i25++;
                    }
                    c = 0;
                    c2 = c;
                    i22 = i5;
                    i25++;
                }
                i22 = i5 + ((!z2 || i15 + 1 >= f168a.length || (f168a[i15 + 1].length <= 1 && f168a[i15 + 1][0].length <= 3)) ? (byte) 4 : f187f[i15]);
                i23++;
                i24 = i26;
            }
            i13 = i16 + 1;
            i14 = i15 + 1;
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    /* JADX INFO: renamed from: a */
    static boolean m81a() {
        return (f168a == null || f172b == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    static final byte[] m82a() {
        return f170b ? f180d : f176c;
    }

    /* JADX INFO: renamed from: a */
    static byte[][] m83a() {
        return f193h;
    }

    /* JADX INFO: renamed from: b */
    static int m84b() {
        if (f168a == null || f172b == null) {
            return 0;
        }
        return (f168a.length * f171b[f172b[3]]) + 12;
    }

    /* JADX INFO: renamed from: b */
    static int m85b(int i) {
        int i2 = 1;
        for (int i3 = 0; i3 < f162a; i3++) {
            if (C0011l.m167a((int) m82a()[i3]) == 10) {
                i2++;
            }
        }
        return f171b[1] * i2;
    }

    /* JADX INFO: renamed from: b */
    static C0006g m86b(char c) {
        if (f170b) {
            System.arraycopy(f180d, 0, f176c, 0, f162a);
        }
        f170b = false;
        m99g(f162a + 1);
        f176c[f162a] = C0011l.m160a(c);
        f162a++;
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: b */
    static C0006g m87b(int i) {
        int i2;
        if (f170b) {
            System.arraycopy(f180d, 0, f176c, 0, f162a);
        }
        f170b = false;
        if (i < 0) {
            m99g(f162a + 1);
            f176c[f162a] = 45;
            i2 = -i;
            f162a++;
        } else {
            i2 = i;
        }
        if (i2 < 10) {
            m99g(f162a + 1);
            f176c[f162a] = (byte) (i2 + 48);
            f162a++;
            return RunnableC0008i.f282a;
        }
        int i3 = 1;
        int i4 = 0;
        for (int i5 = i2; i5 > 0; i5 /= 10) {
            i4++;
            i3 *= 10;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            m99g(f162a + i6 + 1);
            f176c[f162a + i6] = (byte) (((i2 % i3) / (i3 / 10)) + 48);
            i3 /= 10;
        }
        f162a += i4;
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: b */
    static C0006g m88b(String str) {
        if (f170b) {
            System.arraycopy(f180d, 0, f176c, 0, f162a);
        }
        f170b = false;
        int length = str.length();
        m99g(f162a + length);
        for (int i = 0; i < length; i++) {
            f176c[f162a + i] = C0011l.m160a(str.charAt(i));
        }
        f162a += length;
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: b */
    static C0006g m89b(byte[] bArr) {
        f170b = false;
        int i = f169b < 0 ? 0 : f169b;
        int length = bArr.length - (i / 1000);
        f162a = length;
        m99g(length);
        for (int i2 = 0; i2 < f162a; i2++) {
            f176c[i2] = bArr[(i / 1000) + i2];
        }
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: b */
    static final void m90b() {
        if (f175c) {
            f175c = false;
            f168a = null;
            f187f = null;
            f172b = null;
            f193h = null;
            f190g = null;
        }
    }

    /* JADX INFO: renamed from: b */
    static void m91b(int i) {
        if (f168a == null || f172b == null) {
            return;
        }
        f172b[1] = i;
    }

    /* JADX INFO: renamed from: c */
    static C0006g m92c(byte[] bArr) {
        if (f170b) {
            System.arraycopy(f180d, 0, f176c, 0, f162a);
        }
        f170b = false;
        m99g(f162a + bArr.length);
        System.arraycopy(bArr, 0, f176c, f162a, bArr.length);
        f162a += bArr.length;
        return RunnableC0008i.f282a;
    }

    /* JADX INFO: renamed from: c */
    static void m93c() {
        f169b = -1000;
        f174c = 0;
    }

    /* JADX INFO: renamed from: c */
    static final void m94c(int i) {
        m70a(RunnableC0008i.f293a[C0011l.m167a(i)]);
    }

    /* JADX INFO: renamed from: d */
    static void m95d() {
        f170b = false;
    }

    /* JADX INFO: renamed from: d */
    static void m96d(int i) {
        f169b += RunnableC0008i.f296b * 3;
    }

    /* JADX INFO: renamed from: e */
    static void m97e(int i) {
        if (f174c == 0) {
            f174c = 1000;
            return;
        }
        int i2 = f174c - RunnableC0008i.f296b;
        f174c = i2;
        if (i2 < 0) {
            f174c = 0;
            f169b = -2000;
        }
    }

    /* JADX INFO: renamed from: f */
    static void m98f(int i) {
        f162a += i;
    }

    /* JADX INFO: renamed from: g */
    private static void m99g(int i) {
        int i2 = i + 1;
        if (f176c.length < i2) {
            byte[] bArr = new byte[i2];
            System.arraycopy(f176c, 0, bArr, 0, f176c.length);
            f176c = bArr;
        }
    }
}
