package p000;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: C:\Temp\jadx-12448572193422856954\classes.dex */
public final class C0008i {

    /* JADX INFO: renamed from: b */
    private static int f523b;

    /* JADX INFO: renamed from: b */
    private static short[] f525b;

    /* JADX INFO: renamed from: c */
    private static int f526c;

    /* JADX INFO: renamed from: c */
    private static int[] f528c;

    /* JADX INFO: renamed from: d */
    private static int[] f530d;

    /* JADX INFO: renamed from: w */
    private static int f542w;

    /* JADX INFO: renamed from: x */
    private static int f543x;

    /* JADX INFO: renamed from: y */
    private static int f544y;

    /* JADX INFO: renamed from: z */
    private static int f545z;

    /* JADX INFO: renamed from: a */
    private short f547a;

    /* JADX INFO: renamed from: a */
    short[] f549a;

    /* JADX INFO: renamed from: a */
    private int[][] f550a;

    /* JADX INFO: renamed from: a */
    private Image[][] f551a;

    /* JADX INFO: renamed from: a */
    private short[][] f552a;

    /* JADX INFO: renamed from: b */
    private short f553b;

    /* JADX INFO: renamed from: b */
    private short[][] f556b;

    /* JADX INFO: renamed from: c */
    private boolean f557c;

    /* JADX INFO: renamed from: c */
    private short[] f558c;

    /* JADX INFO: renamed from: d */
    private int f559d;

    /* JADX INFO: renamed from: d */
    private short[] f560d;

    /* JADX INFO: renamed from: e */
    private int f561e;

    /* JADX INFO: renamed from: e */
    private int[] f562e;

    /* JADX INFO: renamed from: e */
    private short[] f563e;

    /* JADX INFO: renamed from: f */
    private int f564f;

    /* JADX INFO: renamed from: f */
    private short[] f565f;

    /* JADX INFO: renamed from: g */
    private int f566g;

    /* JADX INFO: renamed from: g */
    private int[] f567g;

    /* JADX INFO: renamed from: g */
    private short[] f568g;

    /* JADX INFO: renamed from: h */
    private int f569h;

    /* JADX INFO: renamed from: h */
    private short[] f570h;

    /* JADX INFO: renamed from: i */
    private short[] f572i;

    /* JADX INFO: renamed from: j */
    private byte[] f573j;

    /* JADX INFO: renamed from: j */
    private short[] f574j;

    /* JADX INFO: renamed from: k */
    private int f575k;

    /* JADX INFO: renamed from: k */
    private byte[] f576k;

    /* JADX INFO: renamed from: k */
    private short[] f577k;

    /* JADX INFO: renamed from: l */
    private byte[] f578l;

    /* JADX INFO: renamed from: l */
    private short[] f579l;

    /* JADX INFO: renamed from: m */
    private byte[] f580m;

    /* JADX INFO: renamed from: n */
    private byte[] f581n;

    /* JADX INFO: renamed from: o */
    private int f582o;

    /* JADX INFO: renamed from: o */
    private byte[] f583o;

    /* JADX INFO: renamed from: p */
    private int f584p;

    /* JADX INFO: renamed from: p */
    private byte[] f585p;

    /* JADX INFO: renamed from: q */
    private int f586q;

    /* JADX INFO: renamed from: q */
    private byte[] f587q;

    /* JADX INFO: renamed from: r */
    private int f588r;

    /* JADX INFO: renamed from: r */
    private byte[] f589r;

    /* JADX INFO: renamed from: s */
    private int f590s;

    /* JADX INFO: renamed from: s */
    private byte[] f591s;

    /* JADX INFO: renamed from: t */
    private int f592t;

    /* JADX INFO: renamed from: t */
    private byte[] f593t;

    /* JADX INFO: renamed from: u */
    private int f594u;

    /* JADX INFO: renamed from: u */
    private byte[] f595u;

    /* JADX INFO: renamed from: v */
    private int f596v;

    /* JADX INFO: renamed from: v */
    private byte[] f597v;

    /* JADX INFO: renamed from: w */
    private byte[] f598w;

    /* JADX INFO: renamed from: x */
    private byte[] f599x;

    /* JADX INFO: renamed from: y */
    private byte[] f600y;

    /* JADX INFO: renamed from: a */
    private static byte[] f521a = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: b */
    private static byte[] f524b = {73, 72, 68, 82};

    /* JADX INFO: renamed from: c */
    private static byte[] f527c = {80, 76, 84, 69};

    /* JADX INFO: renamed from: d */
    private static byte[] f529d = {116, 82, 78, 83};

    /* JADX INFO: renamed from: e */
    private static byte[] f531e = {73, 68, 65, 84};

    /* JADX INFO: renamed from: f */
    private static byte[] f532f = {8, 3, 0, 0, 0};

    /* JADX INFO: renamed from: g */
    private static byte[] f534g = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* JADX INFO: renamed from: h */
    private static byte[] f535h = {120, -100, 1};

    /* JADX INFO: renamed from: a */
    private static int[] f522a = new int[256];

    /* JADX INFO: renamed from: i */
    private static int f537i = -1;

    /* JADX INFO: renamed from: j */
    private static int f538j = -1;

    /* JADX INFO: renamed from: l */
    private static int f539l = -1;

    /* JADX INFO: renamed from: m */
    private static int f540m = -1;

    /* JADX INFO: renamed from: n */
    private static int f541n = 0;

    /* JADX INFO: renamed from: f */
    private static int[] f533f = {0, 2, 1, 3, 5, 7, 4, 6};

    /* JADX INFO: renamed from: h */
    private static int[] f536h = new int[4];

    /* JADX INFO: renamed from: a */
    private int f546a = -1;

    /* JADX INFO: renamed from: i */
    private byte[] f571i = null;

    /* JADX INFO: renamed from: a */
    private boolean f548a = false;

    /* JADX INFO: renamed from: b */
    private boolean f554b = false;

    /* JADX INFO: renamed from: b */
    private int[] f555b = new int[4];

    static {
        byte[] bArr = {73, 69, 78, 68};
        byte[] bArr2 = {8, 6, 0, 0, 0};
    }

    C0008i() {
    }

    /* JADX INFO: renamed from: a */
    private static int m286a(byte[] bArr, int i, short[] sArr, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6 = 0;
        while (i6 < i3) {
            if (z) {
                i4 = i + 1;
                i5 = bArr[i];
            } else {
                int i7 = i + 1;
                i4 = i7 + 1;
                i5 = ((bArr[i7] & 255) << 8) + (bArr[i] & 255);
            }
            sArr[i6] = (short) i5;
            i6++;
            i = i4;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static void m287a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public static void m288a(int i, int i2) {
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00b0 A[PHI: r5 r7
  0x00b0: PHI (r5v6 int) = (r5v2 int), (r5v5 int), (r5v9 int) binds: [B:56:0x0092, B:43:0x0067, B:26:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r7v8 int) = (r7v1 int), (r7v6 int), (r7v1 int) binds: [B:56:0x0092, B:43:0x0067, B:26:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    private void m289a(String str, char[] cArr) {
        int length;
        boolean z;
        int iCharAt;
        if (str == null && cArr == null) {
            return;
        }
        f523b = 0;
        f526c = this.f561e;
        boolean z2 = str != null;
        int i = f537i >= 0 ? f537i : 0;
        if (z2) {
            length = f538j >= 0 ? f538j : str.length();
        } else {
            length = f538j >= 0 ? f538j : cArr.length;
        }
        boolean z3 = this.f554b;
        int iM296c = 0;
        while (i < length) {
            char cCharAt = z2 ? str.charAt(i) : cArr[i];
            if (cCharAt == '\\') {
                i++;
                if ((z2 ? str.charAt(i) : cArr[i]) == '^') {
                    z = !z3;
                } else {
                    z = z3;
                }
            } else {
                if (cCharAt > ' ') {
                    iCharAt = m301j(cCharAt);
                } else if (cCharAt == ' ') {
                    iM296c += this.f569h;
                    z = z3;
                } else if (cCharAt == '\n') {
                    if (iM296c > f523b) {
                        f523b = iM296c;
                    }
                    f526c += this.f559d + this.f561e;
                    z = z3;
                    iM296c = 0;
                } else if (cCharAt == 1) {
                    i++;
                    z = z3;
                } else if (cCharAt == 2) {
                    i++;
                    iCharAt = z2 ? str.charAt(i) : cArr[i];
                } else {
                    z = z3;
                }
                iM296c += m296c(iCharAt, 0);
                if (z3) {
                    iM296c++;
                    z = z3;
                } else {
                    z = z3;
                }
            }
            i++;
            z3 = z;
        }
        if (iM296c > f523b) {
            f523b = iM296c;
        }
        if (f523b > 0) {
            f523b = f523b;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m290a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int iM298g;
        int iM299h;
        int i7 = this.f573j[i] & 255;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f572i[i] + i8;
            int i10 = this.f587q[i9] & 255;
            int i11 = (this.f580m[i9] & 255) | ((i10 & 192) << 2);
            if ((this.f586q & 16384) != 0) {
                this.f592t = this.f585p[i9] & 255;
            }
            if ((i10 & 16) != 0) {
                iM298g = (i4 & 1) != 0 ? i2 - this.f581n[i9] : this.f581n[i9] + i2;
                iM299h = (i4 & 2) != 0 ? i3 - this.f583o[i9] : i3 + this.f583o[i9];
            } else {
                iM298g = (i4 & 1) != 0 ? i2 - (this.f581n[i9] + m298g(i11)) : this.f581n[i9] + i2;
                iM299h = (i4 & 2) != 0 ? i3 - (this.f583o[i9] + m299h(i11)) : i3 + this.f583o[i9];
            }
            if ((i10 & 16) != 0) {
                m290a(graphics, i11, iM298g, iM299h, i4 ^ (i10 & 15), i5, i6);
            } else {
                m321b(graphics, i11, iM298g, iM299h, i4 ^ (i10 & 15));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m291a(Graphics graphics, String str, int i, int i2, int i3, boolean z) {
        int i4;
        int length;
        int length2;
        char cCharAt;
        int i5;
        int iM296c;
        int i6;
        char cCharAt2;
        int iCharAt;
        int i7;
        char cCharAt3;
        if (str != null) {
            int i8 = i2 + this.f564f;
            boolean z2 = str != null;
            m289a(str, (char[]) null);
            if ((i3 & 43) != 0) {
                if ((i3 & 8) != 0) {
                    i4 = i - f523b;
                } else {
                    i4 = (i3 & 1) != 0 ? i - (f523b >> 1) : i;
                }
                if ((i3 & 32) != 0) {
                    i8 -= f526c;
                } else if ((i3 & 2) != 0) {
                    i8 -= f526c >> 1;
                }
            } else {
                i4 = i;
            }
            if (z) {
                this.f575k = this.f592t;
            }
            int i9 = f537i >= 0 ? f537i : 0;
            if (z2) {
                length2 = f538j >= 0 ? f538j : str.length();
            } else {
                if (f538j >= 0) {
                    length = f538j;
                } else {
                    Object[] objArr = null;
                    length = objArr.length;
                }
                length2 = length;
            }
            int i10 = i4;
            while (i9 < length2) {
                if (z2) {
                    cCharAt = str.charAt(i9);
                } else {
                    char[] cArr = null;
                    cCharAt = cArr[i9];
                }
                if (cCharAt == '\\') {
                    int i11 = i9 + 1;
                    if (z2) {
                        cCharAt3 = str.charAt(i11);
                    } else {
                        char[] cArr2 = null;
                        cCharAt3 = cArr2[i11];
                    }
                    if (cCharAt3 == '_') {
                        this.f548a = !this.f548a;
                        i5 = i11;
                        iM296c = i10;
                    } else if (cCharAt3 == '^') {
                        this.f554b = !this.f554b;
                        i5 = i11;
                        iM296c = i10;
                    } else {
                        m324c((cCharAt3 & 255) - 48);
                        i5 = i11;
                        iM296c = i10;
                    }
                } else {
                    if (cCharAt > ' ') {
                        i6 = i9;
                        iCharAt = m301j(cCharAt);
                    } else if (cCharAt == ' ') {
                        if (this.f548a) {
                            int iM301j = m301j(95);
                            m310a(graphics, iM301j, i10 + ((this.f569h - m296c(iM301j, 0)) >> 1), i8, 0);
                        }
                        i5 = i9;
                        iM296c = i10 + this.f569h;
                    } else if (cCharAt == '\n') {
                        i8 += this.f559d + this.f561e;
                        i5 = i9;
                        iM296c = i4;
                    } else if (cCharAt == 1) {
                        i5 = i9 + 1;
                        if (z2) {
                            cCharAt2 = str.charAt(i5);
                        } else {
                            char[] cArr3 = null;
                            cCharAt2 = cArr3[i5];
                        }
                        if (cCharAt2 < this.f588r) {
                            this.f592t = cCharAt2;
                        }
                        if (cCharAt2 == 255) {
                            this.f592t = this.f575k;
                            iM296c = i10;
                        } else {
                            iM296c = i10;
                        }
                    } else if (cCharAt == 2) {
                        i6 = i9 + 1;
                        if (z2) {
                            iCharAt = str.charAt(i6);
                        } else {
                            char[] cArr4 = null;
                            iCharAt = cArr4[i6];
                        }
                    } else {
                        i5 = i9;
                        iM296c = i10;
                    }
                    m310a(graphics, iCharAt, i10, i8, 0);
                    if (this.f548a) {
                        int iM301j2 = m301j(95);
                        m310a(graphics, iM301j2, i10 + ((m296c(iCharAt, 0) - m296c(iM301j2, 0)) >> 1), i8, 0);
                    }
                    if (this.f554b) {
                        i7 = i10 + 1;
                        m310a(graphics, iCharAt, i7, i8, 0);
                    } else {
                        i7 = i10;
                    }
                    i5 = i6;
                    iM296c = i7 + m296c(iCharAt, 0);
                }
                i9 = i5 + 1;
                i10 = iM296c;
            }
            if (z) {
                this.f592t = this.f575k;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m292a(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = i2 * i3;
        if (f528c == null) {
            f528c = new int[8000];
        }
        if (this.f550a == null) {
            return;
        }
        int[] iArr = this.f550a[this.f592t];
        if (this.f553b == 25840) {
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i + 1;
                int i8 = bArr[i] & 255;
                int i9 = iArr[this.f594u & i8];
                int i10 = i8 >> this.f596v;
                int i11 = i6;
                while (true) {
                    int i12 = i10 - 1;
                    if (i10 >= 0) {
                        f528c[i11] = i9;
                        i10 = i12;
                        i11++;
                    }
                }
                i6 = i11;
                i = i7;
            }
            return;
        }
        if (this.f553b == 10225) {
            while (i4 < i5) {
                int i13 = i + 1;
                int i14 = bArr[i] & 255;
                if (i14 > 127) {
                    i = i13 + 1;
                    int i15 = iArr[bArr[i13] & 255];
                    int i16 = i14 - 128;
                    while (true) {
                        int i17 = i16 - 1;
                        if (i16 > 0) {
                            f528c[i4] = i15;
                            i16 = i17;
                            i4++;
                        }
                    }
                } else {
                    f528c[i4] = iArr[i14];
                    i4++;
                    i = i13;
                }
            }
            return;
        }
        if (this.f553b == 22258) {
            int i18 = 0;
            while (i18 < i5) {
                int i19 = i + 1;
                int i20 = bArr[i] & 255;
                if (i20 > 127) {
                    int i21 = i20 - 128;
                    int i22 = i18;
                    int i23 = i19;
                    while (true) {
                        int i24 = i21 - 1;
                        if (i21 <= 0) {
                            break;
                        }
                        f528c[i22] = iArr[bArr[i23] & 255];
                        i21 = i24;
                        i22++;
                        i23++;
                    }
                    i18 = i22;
                    i = i23;
                } else {
                    i = i19 + 1;
                    int i25 = iArr[bArr[i19] & 255];
                    int i26 = i18;
                    while (true) {
                        int i27 = i20 - 1;
                        if (i20 <= 0) {
                            break;
                        }
                        f528c[i26] = i25;
                        i20 = i27;
                        i26++;
                    }
                    i18 = i26;
                }
            }
            return;
        }
        if (this.f553b == 5632) {
            while (i4 < i5) {
                byte b = bArr[i];
                int i28 = i4 + 1;
                f528c[i4] = iArr[(b >> 4) & 15];
                i4 = i28 + 1;
                f528c[i28] = iArr[b & 15];
                i++;
            }
            return;
        }
        if (this.f553b == 1024) {
            while (i4 < i5) {
                byte b2 = bArr[i];
                int i29 = i4 + 1;
                f528c[i4] = iArr[(b2 >> 6) & 3];
                int i30 = i29 + 1;
                f528c[i29] = iArr[(b2 >> 4) & 3];
                int i31 = i30 + 1;
                f528c[i30] = iArr[(b2 >> 2) & 3];
                i4 = i31 + 1;
                f528c[i31] = iArr[b2 & 3];
                i++;
            }
            return;
        }
        if (this.f553b != 512) {
            if (this.f553b == 22018) {
                while (i4 < i5) {
                    f528c[i4] = iArr[bArr[i] & 255];
                    i4++;
                    i++;
                }
                return;
            }
            return;
        }
        while (i4 < i5) {
            byte b3 = bArr[i];
            int i32 = i4 + 1;
            f528c[i4] = iArr[(b3 >> 7) & 1];
            int i33 = i32 + 1;
            f528c[i32] = iArr[(b3 >> 6) & 1];
            int i34 = i33 + 1;
            f528c[i33] = iArr[(b3 >> 5) & 1];
            int i35 = i34 + 1;
            f528c[i34] = iArr[(b3 >> 4) & 1];
            int i36 = i35 + 1;
            f528c[i35] = iArr[(b3 >> 3) & 1];
            int i37 = i36 + 1;
            f528c[i36] = iArr[(b3 >> 2) & 1];
            int i38 = i37 + 1;
            f528c[i37] = iArr[(b3 >> 1) & 1];
            i4 = i38 + 1;
            f528c[i38] = iArr[b3 & 1];
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private int[] m293a(int i) {
        if (this.f562e == null || this.f599x == null) {
            return null;
        }
        m292a(this.f599x, this.f562e[i], m298g(i), m299h(i));
        return f528c;
    }

    /* JADX INFO: renamed from: b */
    static int m294b() {
        return f523b;
    }

    /* JADX INFO: renamed from: c */
    static int m295c() {
        return f526c;
    }

    /* JADX INFO: renamed from: c */
    private int m296c(int i, int i2) {
        return this.f581n[this.f572i[i]];
    }

    /* JADX INFO: renamed from: d */
    private int m297d(int i, int i2) {
        return this.f583o[this.f572i[0] + i2];
    }

    /* JADX INFO: renamed from: g */
    private int m298g(int i) {
        return this.f563e[i] & 65535;
    }

    /* JADX INFO: renamed from: h */
    private int m299h(int i) {
        return this.f565f[i] & 65535;
    }

    /* JADX INFO: renamed from: i */
    private int m300i(int i) {
        if (this.f570h != null) {
            for (int i2 = 0; i2 < this.f570h.length; i2 += 2) {
                if (this.f570h[i2] == i) {
                    return this.f570h[i2 + 1];
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    private int m301j(int i) {
        int i2 = i % this.f547a;
        if (this.f552a[i2][0] == i) {
            return this.f552a[i2][1];
        }
        int i3 = 2;
        int length = this.f552a[i2].length;
        while (i3 < length && this.f552a[i2][i3] != i) {
            i3 += 2;
        }
        if (i3 < length) {
            return this.f552a[i2][i3 + 1];
        }
        return 1;
    }

    /* JADX INFO: renamed from: a */
    final int m302a() {
        if (this.f573j == null) {
            return 0;
        }
        return this.f573j.length;
    }

    /* JADX INFO: renamed from: a */
    final int m303a(int i) {
        return this.f589r[i] & 255;
    }

    /* JADX INFO: renamed from: a */
    final int m304a(int i, int i2) {
        return this.f593t[this.f549a[i] + i2] & 255;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0168 A[PHI: r1
  0x0168: PHI (r1v20 int) = (r1v1 int), (r1v21 int) binds: [B:39:0x00a5, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    final String m305a(String str, int i) {
        int iM301j;
        short s;
        if (f525b == null) {
            f525b = new short[100];
        }
        int length = str.length();
        short s2 = 0;
        short s3 = 1;
        short s4 = 0;
        boolean z = false;
        short s5 = 0;
        boolean z2 = this.f554b;
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ') {
                s2 = (short) (this.f569h + s2);
                s = (short) i2;
                if (s2 > i) {
                    z = false;
                    int i3 = s;
                    while (i3 >= 0 && str.charAt(i3) == ' ') {
                        i3--;
                        s2 = (short) (s2 - this.f569h);
                    }
                    while (s < length && str.charAt(s) == ' ') {
                        s = (short) (s + 1);
                    }
                    short s6 = (short) (s - 1);
                    short s7 = (short) (s3 + 1);
                    f525b[s3] = (short) (s6 + 1);
                    s3 = (short) (s7 + 1);
                    f525b[s7] = s2;
                    s2 = 0;
                    i2 = s6;
                    s5 = 0;
                    s = s6;
                } else {
                    s5 = 0;
                    z = true;
                }
            } else if (cCharAt == '\\') {
                i2++;
                if (str.charAt(i2) == '^') {
                    z2 = !z2;
                    s = s4;
                } else {
                    s = s4;
                }
            } else if (cCharAt == '\n') {
                short s8 = (short) (s3 + 1);
                f525b[s3] = (short) i2;
                s3 = (short) (s8 + 1);
                f525b[s8] = s2;
                s2 = 0;
                s5 = 0;
                s = s4;
            } else {
                if (cCharAt >= ' ') {
                    iM301j = m301j((short) cCharAt);
                } else if (cCharAt == 1) {
                    i2++;
                    s = s4;
                } else if (cCharAt == 2) {
                    i2++;
                    iM301j = str.charAt(i2);
                } else {
                    s = s4;
                }
                if (iM301j > m302a()) {
                    iM301j = 0;
                }
                int iM296c = m296c(iM301j, 0);
                int i4 = z2 ? iM296c + 1 : iM296c;
                short s9 = (short) (s5 + i4);
                s2 = (short) (s2 + i4);
                if (s2 <= i || !z) {
                    s5 = s9;
                    s = s4;
                } else {
                    z = false;
                    int i5 = s4;
                    while (i5 >= 0 && str.charAt(i5) == ' ') {
                        i5--;
                        s2 = (short) (s2 - this.f569h);
                    }
                    short s10 = (short) (s3 + 1);
                    f525b[s3] = (short) (s4 + 1);
                    s3 = (short) (s10 + 1);
                    f525b[s10] = (short) (s2 - s9);
                    s2 = 0;
                    i2 = s4;
                    s5 = s9;
                    s = s4;
                }
            }
            i2++;
            s4 = s;
        }
        if (s2 != 0) {
            short s11 = (short) (s3 + 1);
            f525b[s3] = (short) length;
            s3 = (short) (s11 + 1);
            f525b[s11] = s2;
        }
        f525b[0] = (short) (s3 / 2);
        short[] sArr = f525b;
        short s12 = 0;
        String string = "";
        for (int i6 = 0; i6 < sArr[0]; i6++) {
            if (s12 != 0 && str.charAt(s12) != '\n') {
                string = new StringBuffer().append(string).append("\n").toString();
            }
            string = new StringBuffer().append(string).append(str.substring(s12, sArr[(i6 << 1) + 1])).toString();
            s12 = sArr[(i6 << 1) + 1];
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    final void m306a() {
        this.f599x = null;
        this.f562e = null;
        System.gc();
    }

    /* JADX INFO: renamed from: a */
    final void m307a(int i, int i2, int i3, int i4) {
        int[] iArrM293a;
        boolean z;
        if (this.f551a == null) {
            this.f551a = new Image[this.f588r][];
        }
        if (this.f582o == 0) {
            return;
        }
        int i5 = this.f582o - 1;
        if ((this.f586q & 16777216) != 0) {
            if (this.f551a[i] == null) {
                this.f551a[i] = new Image[this.f582o];
            }
            int i6 = this.f592t;
            this.f592t = i;
            System.gc();
            for (int i7 = 0; i7 <= i5; i7++) {
                if (this.f600y[i7] == 0) {
                    int iM298g = m298g(i7);
                    int iM299h = m299h(i7);
                    if (iM298g > 0 && iM299h > 0 && (iArrM293a = m293a(i7)) != null) {
                        int i8 = iM298g * iM299h;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= i8) {
                                z = false;
                                break;
                            } else {
                                if ((iArrM293a[i9] & (-16777216)) != -16777216) {
                                    z = true;
                                    break;
                                }
                                i9++;
                            }
                        }
                        this.f551a[i][i7] = Image.createRGBImage(iArrM293a, iM298g, iM299h, z);
                    }
                }
            }
            System.gc();
            this.f592t = i6;
        }
        System.gc();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 1281. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: a */
    final void m308a(int r9, int r10, int r11, int[] r12, int r13) {
        /*
            r8 = this;
            r7 = 3
            r6 = 2
            r5 = 1
            r4 = 0
            short[] r0 = r8.f549a
            short r0 = r0[r9]
            int r0 = r0 + r10
            byte[] r1 = r8.f591s
            r1 = r1[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r2 = r8.f598w
            r2 = r2[r0]
            r2 = r2 & 192(0xc0, float:2.69E-43)
            int r2 = r2 << 2
            r1 = r1 | r2
            byte[] r2 = r8.f598w
            r0 = r2[r0]
            r0 = r0 & 15
            r0 = r0 ^ r13
            short[] r2 = r8.f579l
            if (r2 == 0) goto L76
            if (r12 == 0) goto L76
            short[] r2 = r8.f579l
            short r2 = r2[r1]
            short[] r3 = r8.f579l
            int r1 = r1 + 1
            short r1 = r3[r1]
            int r1 = r1 - r2
            if (r1 <= 0) goto L77
            if (r11 >= r1) goto L77
            int r1 = r2 + r11
            int r1 = r1 << 2
            byte[] r2 = r8.f578l
            if (r2 == 0) goto L5e
            byte[] r2 = r8.f578l
            r2 = r2[r1]
            r12[r4] = r2
            byte[] r2 = r8.f578l
            int r3 = r1 + 1
            r2 = r2[r3]
            r12[r5] = r2
            byte[] r2 = r8.f578l
            int r3 = r1 + 2
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r12[r6] = r2
            byte[] r2 = r8.f578l
            int r1 = r1 + 3
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r12[r7] = r1
        L5e:
            r1 = r0 & 1
            if (r1 == 0) goto L6a
            r1 = r12[r4]
            int r1 = -r1
            r2 = r12[r6]
            int r1 = r1 - r2
            r12[r4] = r1
        L6a:
            r0 = r0 & 2
            if (r0 == 0) goto L76
            r0 = r12[r5]
            int r0 = -r0
            r1 = r12[r7]
            int r0 = r0 - r1
            r12[r5] = r0
        L76:
            return
        L77:
            r12[r4] = r4
            r12[r5] = r4
            r12[r6] = r4
            r12[r7] = r4
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0008i.m308a(int, int, int, int[], int):void");
    }

    /* JADX INFO: renamed from: a */
    final void m309a(String str) {
        m289a(str, (char[]) null);
    }

    /* JADX INFO: renamed from: a */
    final void m310a(Graphics graphics, int i, int i2, int i3, int i4) {
        m290a(graphics, i, i2, i3, i4, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    final void m311a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        m312a(graphics, i, i2, i3, i4, i5, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    final void m312a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = this.f549a[i] + i2;
        int i9 = ((this.f598w[i8] & 192) << 2) | (this.f591s[i8] & 255);
        int i10 = (i5 & 1) != 0 ? this.f595u[i8] + 0 : 0 - this.f595u[i8];
        int i11 = (i5 & 2) != 0 ? this.f597v[i8] + 0 : 0 - this.f597v[i8];
        m290a(graphics, i9, i3 - i10, i4 - i11, i5 ^ (this.f598w[i8] & 15), i10, i11);
    }

    /* JADX INFO: renamed from: a */
    final void m313a(Graphics graphics, String str, int i, int i2, int i3) {
        m291a(graphics, str, i, i2, i3, true);
    }

    /* JADX INFO: renamed from: a */
    final void m314a(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        short[][] sArr;
        int i10;
        int i11;
        if (bArr == null) {
            return;
        }
        try {
            System.gc();
            this.f586q = (bArr[2] & 255) + ((bArr[3] & 255) << 8) + ((bArr[4] & 255) << 16) + ((bArr[5] & 255) << 24);
            int i12 = 8;
            this.f582o = (short) (((bArr[7] & 255) << 8) + (bArr[6] & 255));
            if (this.f582o > 0) {
                if ((this.f586q & 34) != 0) {
                    this.f558c = new short[this.f582o];
                    this.f560d = new short[this.f582o];
                }
                this.f563e = new short[this.f582o];
                this.f565f = new short[this.f582o];
                int i13 = 0;
                this.f600y = new byte[this.f582o];
                this.f567g = new int[this.f582o];
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                int i14 = 0;
                short[][] sArr2 = null;
                int i15 = 0;
                int i16 = 8;
                while (i14 < this.f582o) {
                    boolean z5 = false;
                    if ((bArr[i16] & 255) == 0) {
                        i9 = i16 + 1;
                        this.f600y[i14] = 0;
                        z2 = false;
                        z3 = true;
                        z = false;
                        z4 = true;
                    } else if ((bArr[i16] & 255) == 255) {
                        i9 = i16 + 1;
                        this.f600y[i14] = 1;
                        z2 = true;
                        z3 = false;
                        z = false;
                        z4 = true;
                    } else if ((bArr[i16] & 255) == 254) {
                        i9 = i16 + 1;
                        this.f600y[i14] = 2;
                        z2 = true;
                        z3 = false;
                        z = false;
                        z4 = true;
                    } else if ((bArr[i16] & 255) == 253) {
                        i9 = i16 + 1;
                        this.f600y[i14] = 5;
                        z2 = false;
                        z3 = false;
                        z = false;
                        z4 = true;
                    } else if ((bArr[i16] & 255) == 252) {
                        i9 = i16 + 1;
                        this.f600y[i14] = 3;
                        z2 = true;
                        z3 = false;
                        z5 = true;
                        z = false;
                        z4 = true;
                    } else if ((bArr[i16] & 255) == 251) {
                        i9 = i16 + 1;
                        this.f600y[i14] = 4;
                        z2 = true;
                        z3 = false;
                        z5 = true;
                        z = false;
                        z4 = true;
                    } else if ((bArr[i16] & 255) == 250) {
                        i9 = i16 + 1;
                        this.f600y[i14] = 6;
                        z2 = true;
                        z3 = false;
                        z = true;
                        z4 = false;
                    } else if ((bArr[i16] & 255) == 249) {
                        i9 = i16 + 1;
                        this.f600y[i14] = 7;
                        z2 = true;
                        z3 = false;
                        z = true;
                        z4 = false;
                    } else {
                        z = false;
                        i9 = i16;
                    }
                    if (z2) {
                        int[] iArr = this.f567g;
                        int i17 = i9 + 1;
                        int i18 = i17 + 1;
                        int i19 = (bArr[i9] & 255) + ((bArr[i17] & 255) << 8);
                        int i20 = i18 + 1;
                        int i21 = ((bArr[i18] & 255) << 16) + i19;
                        i9 = i20 + 1;
                        iArr[i14] = ((bArr[i20] & 255) << 24) + i21;
                    }
                    if (z3 && (this.f586q & 32) != 0) {
                        int i22 = i9 + 1;
                        int i23 = i22 + 1;
                        this.f558c[i14] = (short) ((bArr[i9] & 255) + ((bArr[i22] & 255) << 8));
                        int i24 = i23 + 1;
                        i9 = i24 + 1;
                        this.f560d[i14] = (short) (((bArr[i24] & 255) << 8) + (bArr[i23] & 255));
                    }
                    if (!z4) {
                        i16 = i9;
                    } else if ((this.f586q & 16) == 0) {
                        int i25 = i9 + 1;
                        this.f563e[i14] = (short) (bArr[i9] & 255);
                        this.f565f[i14] = (short) (bArr[i25] & 255);
                        i16 = i25 + 1;
                    } else {
                        int i26 = i9 + 1;
                        int i27 = i26 + 1;
                        this.f563e[i14] = (short) ((bArr[i9] & 255) + ((bArr[i26] & 255) << 8));
                        int i28 = i27 + 1;
                        i9 = i28 + 1;
                        this.f565f[i14] = (short) (((bArr[i28] & 255) << 8) + (bArr[i27] & 255));
                        i16 = i9;
                    }
                    if (z5) {
                        sArr = sArr2 == null ? new short[this.f582o][] : sArr2;
                        int i29 = i16 + 1;
                        int i30 = i29 + 1;
                        int i31 = i30 + 1;
                        i16 = i31 + 1;
                        sArr[i14] = new short[]{(short) ((bArr[i16] & 255) + ((bArr[i29] & 255) << 8)), (short) (((bArr[i31] & 255) << 8) + (bArr[i30] & 255))};
                        i11 = i13 + 1;
                        i10 = i15 + 2;
                    } else {
                        sArr = sArr2;
                        i10 = i15;
                        i11 = i13;
                    }
                    if (z) {
                        if (sArr == null) {
                            sArr = new short[this.f582o][];
                        }
                        int i32 = i16 + 1;
                        int i33 = i32 + 1;
                        int i34 = i33 + 1;
                        int i35 = bArr[i33] & 255;
                        int i36 = i34 + 1;
                        int i37 = i36 + 1;
                        int i38 = bArr[i36] & 255;
                        int i39 = i37 + 1;
                        int i40 = i39 + 1;
                        i16 = i40 + 1;
                        sArr[i14] = new short[]{(short) ((bArr[i16] & 255) + ((bArr[i32] & 255) << 8)), (short) (((bArr[i34] & 255) << 8) + i35), (short) (((bArr[i37] & 255) << 8) + i38), (short) (((bArr[i40] & 255) << 8) + (bArr[i39] & 255))};
                        i11++;
                        i10 += 4;
                    }
                    i14++;
                    sArr2 = sArr;
                    i15 = i10;
                    i13 = i11;
                }
                if (i13 > 0) {
                    this.f568g = new short[i15];
                    this.f570h = new short[i13 << 1];
                    int i41 = 0;
                    short s = 0;
                    for (short s2 = 0; s2 < this.f582o; s2 = (short) (s2 + 1)) {
                        int i42 = (this.f600y[s2] == 3 || this.f600y[s2] == 4) ? 2 : (this.f600y[s2] == 6 || this.f600y[s2] == 7) ? 4 : -1;
                        if (i42 > 0) {
                            this.f570h[i41 << 1] = s2;
                            this.f570h[(i41 << 1) + 1] = s;
                            for (int i43 = 0; i43 < i42; i43++) {
                                this.f568g[s] = sArr2[s2][i43];
                                s = (short) (s + 1);
                            }
                            sArr2[s2] = null;
                            i41++;
                        }
                    }
                }
                i12 = i16;
            }
            int i44 = i12 + 1;
            int i45 = bArr[i12] & 255;
            int iM286a = i44 + 1;
            int i46 = (short) (((bArr[i44] & 255) << 8) + i45);
            if (i46 > 0) {
                this.f580m = new byte[i46];
                this.f581n = new byte[i46];
                this.f583o = new byte[i46];
                this.f587q = new byte[i46];
                if ((this.f586q & 16384) != 0) {
                    this.f585p = new byte[i46];
                }
                int i47 = 0;
                while (i47 < i46) {
                    int i48 = iM286a + 1;
                    this.f580m[i47] = bArr[iM286a];
                    int i49 = i48 + 1;
                    this.f581n[i47] = bArr[i48];
                    int i50 = i49 + 1;
                    this.f583o[i47] = bArr[i49];
                    if ((this.f586q & 16384) != 0) {
                        i8 = i50 + 1;
                        this.f585p[i47] = bArr[i50];
                    } else {
                        i8 = i50;
                    }
                    this.f587q[i47] = bArr[i8];
                    i47++;
                    iM286a = i8 + 1;
                }
            }
            if ((this.f586q & 32768) != 0) {
                int i51 = iM286a + 1;
                int i52 = i51 + 1;
                short s3 = (short) ((bArr[iM286a] & 255) + ((bArr[i51] & 255) << 8));
                if ((this.f586q & 1024) == 0) {
                    this.f578l = new byte[s3 << 2];
                    System.arraycopy(bArr, i52, this.f578l, 0, s3 << 2);
                    iM286a = (s3 << 2) + i52;
                } else {
                    this.f577k = new short[s3 << 2];
                    iM286a = m286a(bArr, i52, this.f577k, 0, s3 << 2, false);
                }
            }
            int i53 = iM286a + 1;
            int i54 = i53 + 1;
            int i55 = (short) ((bArr[iM286a] & 255) + ((bArr[i53] & 255) << 8));
            if (i55 > 0) {
                this.f573j = new byte[i55];
                this.f572i = new short[i55];
                if ((this.f586q & 32768) != 0) {
                    this.f579l = new short[i55 + 1];
                }
                short s4 = 0;
                int i56 = 0;
                int i57 = i54;
                while (i56 < i55) {
                    this.f573j[i56] = bArr[i57];
                    int i58 = i57 + 1 + 1;
                    int i59 = i58 + 1;
                    int i60 = i59 + 1;
                    this.f572i[i56] = (short) ((bArr[i58] & 255) + ((bArr[i59] & 255) << 8));
                    if ((this.f586q & 32768) == 0 || (this.f586q & 32768) == 0) {
                        i7 = i60;
                    } else {
                        this.f579l[i56] = s4;
                        i7 = i60 + 1;
                        s4 = (short) (s4 + bArr[i60]);
                    }
                    i56++;
                    i57 = i7;
                }
                if ((this.f586q & 32768) != 0) {
                    this.f579l[this.f579l.length - 1] = s4;
                }
                int i61 = i55 << 2;
                if ((this.f586q & 1024) == 0) {
                    this.f576k = new byte[i61];
                    int i62 = 0;
                    i2 = i57;
                    while (i62 < i61) {
                        this.f576k[i62] = bArr[i2];
                        i62++;
                        i2++;
                    }
                } else {
                    this.f574j = new short[i61];
                    i2 = i57;
                    for (int i63 = 0; i63 < i61; i63++) {
                        short[] sArr3 = this.f574j;
                        int i64 = i2 + 1;
                        int i65 = bArr[i2] & 255;
                        i2 = i64 + 1;
                        sArr3[i63] = (short) (((bArr[i64] & 255) << 8) + i65);
                    }
                }
            } else {
                i2 = i54;
            }
            int i66 = i2 + 1;
            int i67 = bArr[i2] & 255;
            int i68 = i66 + 1;
            int i69 = (short) (((bArr[i66] & 255) << 8) + i67);
            if (i69 > 0) {
                this.f591s = new byte[i69];
                this.f593t = new byte[i69];
                this.f595u = new byte[i69];
                this.f597v = new byte[i69];
                this.f598w = new byte[i69];
                for (int i70 = 0; i70 < i69; i70++) {
                    int i71 = i68 + 1;
                    this.f591s[i70] = bArr[i68];
                    int i72 = i71 + 1;
                    this.f593t[i70] = bArr[i71];
                    int i73 = i72 + 1;
                    this.f595u[i70] = bArr[i72];
                    int i74 = i73 + 1;
                    this.f597v[i70] = bArr[i73];
                    i68 = i74 + 1;
                    this.f598w[i70] = bArr[i74];
                }
            }
            int i75 = i68 + 1;
            int i76 = bArr[i68] & 255;
            int i77 = i75 + 1;
            int i78 = (short) (((bArr[i75] & 255) << 8) + i76);
            if (i78 > 0) {
                this.f589r = new byte[i78];
                this.f549a = new short[i78];
                for (int i79 = 0; i79 < i78; i79++) {
                    this.f589r[i79] = bArr[i77];
                    int i80 = i77 + 1 + 1;
                    short[] sArr4 = this.f549a;
                    int i81 = i80 + 1;
                    int i82 = bArr[i80] & 255;
                    i77 = i81 + 1;
                    sArr4[i79] = (short) (((bArr[i81] & 255) << 8) + i82);
                }
            }
            if (this.f582o <= 0) {
                System.gc();
                return;
            }
            if ((this.f586q & 16777216) != 0 && (this.f586q & 16777216) != 0 && i77 < bArr.length) {
                int i83 = i77 + 1;
                int i84 = i83 + 1;
                short s5 = (short) ((bArr[i77] & 255) + ((bArr[i83] & 255) << 8));
                int i85 = i84 + 1;
                this.f588r = bArr[i84] & 255;
                int i86 = i85 + 1;
                this.f590s = bArr[i85] & 255;
                if (this.f590s == 0) {
                    this.f590s = 256;
                }
                if (this.f550a == null) {
                    this.f550a = new int[16][];
                }
                for (int i87 = 0; i87 < this.f588r; i87++) {
                    this.f550a[i87] = new int[this.f590s];
                    if (s5 == -30584) {
                        for (int i88 = 0; i88 < this.f590s; i88++) {
                            int i89 = i86 + 1;
                            int i90 = i89 + 1;
                            int i91 = (bArr[i86] & 255) + ((bArr[i89] & 255) << 8);
                            int i92 = i90 + 1;
                            int i93 = ((bArr[i90] & 255) << 16) + i91;
                            i86 = i92 + 1;
                            int i94 = ((bArr[i92] & 255) << 24) + i93;
                            if (((-16777216) & i94) != -16777216) {
                                this.f557c = true;
                            }
                            this.f550a[i87][i88] = i94;
                        }
                    } else if (s5 == 17476) {
                        for (int i95 = 0; i95 < this.f590s; i95++) {
                            int i96 = i86 + 1;
                            int i97 = bArr[i86] & 255;
                            i86 = i96 + 1;
                            short s6 = (short) (((bArr[i96] & 255) << 8) + i97);
                            if ((61440 & s6) != 61440) {
                                this.f557c = true;
                            }
                            this.f550a[i87][i95] = (s6 & 15) | ((61440 & s6) << 16) | ((61440 & s6) << 12) | ((s6 & 3840) << 12) | ((s6 & 3840) << 8) | ((s6 & 240) << 8) | ((s6 & 240) << 4) | ((s6 & 15) << 4);
                        }
                    } else if (s5 == 21781) {
                        int i98 = 0;
                        while (i98 < this.f590s) {
                            int i99 = i86 + 1;
                            int i100 = i99 + 1;
                            short s7 = (short) ((bArr[i86] & 255) + ((bArr[i99] & 255) << 8));
                            int i101 = -16777216;
                            if ((Short.MIN_VALUE & s7) != 32768) {
                                i101 = 0;
                                this.f557c = true;
                            }
                            this.f550a[i87][i98] = i101 | ((s7 & 31744) << 9) | ((s7 & 992) << 6) | ((s7 & 31) << 3);
                            i98++;
                            i86 = i100;
                        }
                    } else if (s5 == 25861) {
                        int i102 = 0;
                        while (i102 < this.f590s) {
                            int i103 = i86 + 1;
                            int i104 = i103 + 1;
                            short s8 = (short) ((bArr[i86] & 255) + ((bArr[i103] & 255) << 8));
                            int i105 = -16777216;
                            if (s8 == 63519) {
                                i105 = 0;
                                this.f557c = true;
                            }
                            this.f550a[i87][i102] = i105 | ((63488 & s8) << 8) | ((s8 & 2016) << 5) | ((s8 & 31) << 3);
                            i102++;
                            i86 = i104;
                        }
                    }
                }
                int i106 = i86 + 1;
                int i107 = i106 + 1;
                this.f553b = (short) ((bArr[i86] & 255) + ((bArr[i106] & 255) << 8));
                if (this.f553b == 25840) {
                    int i108 = this.f590s - 1;
                    this.f594u = 1;
                    this.f596v = 0;
                    while (i108 != 0) {
                        i108 >>= 1;
                        this.f594u <<= 1;
                        this.f596v++;
                    }
                    this.f594u--;
                }
                if (this.f582o > 0) {
                    this.f562e = new int[this.f582o];
                    int i109 = 0;
                    int i110 = 0;
                    int i111 = i107;
                    while (i109 < this.f582o) {
                        if ((this.f586q & 128) != 0) {
                            int i112 = i111 + 1;
                            int i113 = bArr[i111] & 255;
                            int i114 = i112 + 1;
                            int i115 = i114 + 1;
                            int i116 = ((bArr[i112] & 255) << 8) + i113 + ((bArr[i114] & 255) << 16);
                            i5 = i115 + 1;
                            i6 = i116 + ((bArr[i115] & 255) << 24);
                        } else {
                            int i117 = i111 + 1;
                            i5 = i117 + 1;
                            i6 = (short) (((bArr[i117] & 255) << 8) + (bArr[i111] & 255));
                        }
                        this.f562e[i109] = i110;
                        i110 += i6;
                        i109++;
                        i111 = i5 + i6;
                    }
                    this.f599x = new byte[i110];
                    for (int i118 = 0; i118 < this.f582o; i118++) {
                        if ((this.f586q & 128) != 0) {
                            int i119 = i107 + 1;
                            int i120 = i119 + 1;
                            int i121 = i120 + 1;
                            int i122 = ((bArr[i119] & 255) << 8) + (bArr[i107] & 255) + ((bArr[i120] & 255) << 16);
                            i3 = i121 + 1;
                            i4 = i122 + ((bArr[i121] & 255) << 24);
                        } else {
                            int i123 = i107 + 1;
                            int i124 = bArr[i107] & 255;
                            i3 = i123 + 1;
                            i4 = (short) (((bArr[i123] & 255) << 8) + i124);
                        }
                        System.arraycopy(bArr, i3, this.f599x, this.f562e[i118], i4);
                        i107 = i3 + i4;
                    }
                }
            }
            this.f556b = new short[16][];
            this.f584p = -1;
            System.gc();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    final void m315a(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        f542w = Integer.MAX_VALUE;
        f543x = Integer.MAX_VALUE;
        f544y = Integer.MIN_VALUE;
        f545z = Integer.MIN_VALUE;
        f541n = 1;
        m311a((Graphics) null, i, i2, i3, i4, i5);
        f541n = 0;
        iArr[0] = f542w;
        iArr[1] = f543x;
        iArr[2] = f544y;
        iArr[3] = f545z;
    }

    /* JADX INFO: renamed from: a */
    final void m316a(short[] sArr) {
        this.f547a = sArr[0];
        this.f552a = new short[this.f547a][];
        int i = 1;
        for (int i2 = 0; i2 < this.f547a; i2++) {
            this.f552a[i2] = new short[2];
            int i3 = i + 1;
            this.f552a[i2][0] = sArr[i];
            i = i3 + 1;
            this.f552a[i2][1] = sArr[i3];
        }
        while (i < sArr.length) {
            int i4 = i + 1;
            short s = sArr[i];
            i = i4 + 1;
            short s2 = sArr[i4];
            short[] sArr2 = new short[(s2 << 1) + 2];
            sArr2[0] = this.f552a[s][0];
            sArr2[1] = this.f552a[s][1];
            for (int i5 = 0; i5 < s2; i5++) {
                int i6 = i + 1;
                sArr2[(i5 << 1) + 2] = sArr[i];
                i = i6 + 1;
                sArr2[(i5 << 1) + 3] = sArr[i6];
            }
            this.f552a[s] = sArr2;
        }
        this.f564f = -m297d(0, 0);
        this.f566g = m297d(0, 1);
        this.f559d = m297d(0, 2) - m297d(0, 1);
        this.f561e = this.f564f + this.f566g;
        this.f569h = m296c(m301j(32), 0);
    }

    /* JADX INFO: renamed from: b */
    final int m317b(int i) {
        return this.f595u[i];
    }

    /* JADX INFO: renamed from: b */
    final int m318b(int i, int i2) {
        int i3 = this.f549a[i] + i2;
        return ((this.f598w[i3] & 192) << 2) | (this.f591s[i3] & 255);
    }

    /* JADX INFO: renamed from: b */
    public final void m319b(int i) {
    }

    /* JADX INFO: renamed from: b */
    final void m320b(int i, int i2) {
        int i3 = i2 & 255;
        for (int i4 = 0; i4 < this.f550a[i].length; i4++) {
            if ((this.f550a[i][i4] & 16777215) != 16711935 && (this.f550a[i][i4] >> 24) != 0) {
                this.f550a[i][i4] = ((i3 & 255) << 24) | (this.f550a[i][i4] & 16777215);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r12v0 ??, r12v1 ??, r12v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: b */
    final void m321b(javax.microedition.lcdui.Graphics r11, 
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r12v0 ??, r12v1 ??, r12v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX INFO: renamed from: b */
    final void m322b(Graphics graphics, String str, int i, int i2, int i3) {
        int length = str.length();
        int[] iArr = new int[100];
        int i4 = 0;
        iArr[0] = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.charAt(i5) == '\n') {
                i4++;
                iArr[i4] = i5;
            }
        }
        int i6 = i4 + 1;
        iArr[i6] = length;
        int i7 = this.f559d + this.f561e;
        if ((i3 & 32) != 0) {
            i2 -= (i6 - 1) * i7;
        } else if ((i3 & 2) != 0) {
            i2 -= ((i6 - 1) * i7) >> 1;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            f537i = iArr[i8] + 1;
            f538j = iArr[i8 + 1];
            m291a(graphics, str, i, i2 + (i8 * i7), i3, false);
        }
        f537i = -1;
        f538j = -1;
    }

    /* JADX INFO: renamed from: c */
    final int m323c(int i) {
        return this.f597v[i];
    }

    /* JADX INFO: renamed from: c */
    final void m324c(int i) {
        if (i < this.f588r) {
            this.f592t = i;
        }
    }

    /* JADX INFO: renamed from: d */
    final int m325d() {
        return this.f592t;
    }

    /* JADX INFO: renamed from: d */
    final int m326d(int i) {
        return (this.f586q & 1024) == 0 ? this.f576k[(i << 2) + 2] & 255 : this.f574j[(i << 2) + 2] & 65535;
    }

    /* JADX INFO: renamed from: d */
    final void m327d(int i) {
        int i2 = this.f588r - 1;
        this.f557c = true;
        for (int i3 = 0; i3 < this.f550a[i].length; i3++) {
            if ((this.f550a[i][i3] & 16777215) != 16711935 && (this.f550a[i][i3] >> 24) != 0) {
                int[] iArr = this.f550a[i];
                iArr[i3] = iArr[i3] & 16777215;
                int[] iArr2 = this.f550a[i];
                iArr2[i3] = iArr2[i3] | ((this.f550a[i2][i3] & 16711680) << 8);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    final int m328e(int i) {
        return (this.f586q & 1024) == 0 ? this.f576k[(i << 2) + 3] & 255 : this.f574j[(i << 2) + 3] & 65535;
    }

    /* JADX INFO: renamed from: f */
    final int m329f(int i) {
        if (this.f579l != null) {
            return this.f579l[i + 1] - this.f579l[i];
        }
        return 0;
    }
}
