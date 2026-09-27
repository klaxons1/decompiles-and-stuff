package p000;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: C:\Temp\jadx-12448572193422856954\classes.dex */
class RunnableC0006g implements Runnable {

    /* JADX INFO: renamed from: F */
    static int f480F;

    /* JADX INFO: renamed from: a */
    private static int[] f481a;

    /* JADX INFO: renamed from: a */
    private static C0008i[] f482a;

    /* JADX INFO: renamed from: a */
    private static Player[] f483a;

    /* JADX INFO: renamed from: a */
    private static byte[][] f484a;

    /* JADX INFO: renamed from: a */
    private static int[][] f485a;

    /* JADX INFO: renamed from: a */
    private static Graphics[][] f486a;

    /* JADX INFO: renamed from: a */
    private static Image[][] f487a;

    /* JADX INFO: renamed from: a */
    private static byte[][][] f488a;

    /* JADX INFO: renamed from: b */
    private static boolean f489b;

    /* JADX INFO: renamed from: b */
    private static int[] f490b;

    /* JADX INFO: renamed from: c */
    private static int[] f493c;

    /* JADX INFO: renamed from: d */
    private static int[] f495d;

    /* JADX INFO: renamed from: e */
    private static int f496e;

    /* JADX INFO: renamed from: e */
    private static int[] f497e;

    /* JADX INFO: renamed from: f */
    private static int[] f499f;

    /* JADX INFO: renamed from: g */
    private static int[] f500g;

    /* JADX INFO: renamed from: h */
    private static int[] f501h;

    /* JADX INFO: renamed from: i */
    private static int[] f502i;

    /* JADX INFO: renamed from: j */
    private static int[] f503j;

    /* JADX INFO: renamed from: c */
    private static int f491c = 62;

    /* JADX INFO: renamed from: d */
    private static final int f494d = 7;

    /* JADX INFO: renamed from: c */
    private static boolean f492c = false;

    /* JADX INFO: renamed from: f */
    private static int f498f = 4;

    /* JADX INFO: renamed from: B */
    int f504B = 0;

    /* JADX INFO: renamed from: C */
    int f505C = 0;

    /* JADX INFO: renamed from: a */
    private int f508a = -1;

    /* JADX INFO: renamed from: b */
    private int f511b = 0;

    /* JADX INFO: renamed from: a */
    C0008i f509a = null;

    /* JADX INFO: renamed from: D */
    int f506D = 0;

    /* JADX INFO: renamed from: E */
    public int f507E = 0;

    /* JADX INFO: renamed from: a */
    private boolean f510a = true;

    RunnableC0006g() {
    }

    /* JADX INFO: renamed from: a */
    private static int m247a(int i) {
        int i2 = i;
        while (i2 >= 7) {
            i2 -= 7;
        }
        while (i2 < 0) {
            i2 += 7;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private static int m248a(int i, int i2) {
        return (i * 7 * 5) + (i2 * 5);
    }

    /* JADX INFO: renamed from: a */
    private static void m249a(int i) {
        int iM261b = m261b(i, 1);
        int iM261b2 = m261b(i, 2);
        if (f495d[i] != 2 || f493c[i] >= iM261b2) {
            if (f490b[i] != iM261b || f495d[i] == 0) {
                m262b(i);
                f483a[i] = Manager.createPlayer(new ByteArrayInputStream(f484a[iM261b]), AbstractRunnableC0012m.m358b(f481a[iM261b]));
                if (f483a[i] != null) {
                    f483a[i].realize();
                    f483a[i].prefetch();
                    f495d[i] = 1;
                    f490b[i] = iM261b;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static void m250a(int i, int i2, int i3, int i4) {
        f503j = new int[8];
        f485a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, f498f, 15);
        f488a = (byte[][][]) Array.newInstance((Class<?>) byte[].class, f498f, 2);
        f487a = (Image[][]) Array.newInstance((Class<?>) Image.class, f498f, 1);
        f486a = (Graphics[][]) Array.newInstance((Class<?>) Graphics.class, f498f, 1);
        f482a = new C0008i[f498f];
        f503j[0] = i;
        f503j[1] = i2;
        f503j[2] = 20;
        f503j[4] = 0;
        f503j[5] = 20;
        f503j[7] = 0;
        f492c = true;
    }

    /* JADX INFO: renamed from: a */
    static void m251a(int i, int i2, int i3, int i4, int i5) {
        if (i2 < 0 || i4 == 0) {
            return;
        }
        m252a(i, 3, i2, i5, i4, i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m252a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (f489b) {
            int i7 = f501h[i];
            int i8 = f502i[i];
            int iM247a = m247a(i7 + i8);
            for (int i9 = 0; i9 < i8; i9++) {
                int iM248a = m248a(i, m247a((iM247a - i9) - 1));
                if (f500g[iM248a] == i2 && ((i2 != 3 && i2 != 1) || f500g[iM248a + 2] >= i4)) {
                    f500g[iM248a] = 0;
                }
            }
            int iM248a2 = m248a(i, iM247a);
            f500g[iM248a2] = i2;
            f500g[iM248a2 + 1] = i3;
            f500g[iM248a2 + 2] = i4;
            f500g[iM248a2 + 3] = i5;
            f500g[iM248a2 + 4] = i6;
            int[] iArr = f502i;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final void m253a(int i, int i2, boolean z) {
        if (z) {
            int[] iArr = f485a[i];
            iArr[14] = iArr[14] | i2;
        } else {
            int[] iArr2 = f485a[i];
            iArr2[14] = iArr2[14] & (i2 ^ (-1));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m254a(int i, boolean z) {
        if (f492c) {
            f485a[i] = new int[15];
            if (z) {
                f487a[i] = new Image[1];
                f486a[i] = new Graphics[1];
            }
            f488a[i] = new byte[2][];
            f482a[i] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m255a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, C0008i c0008i, int i2, int i3, int i4, int i5) {
        if (f492c) {
            m254a(i, false);
            f488a[i][0] = bArr2;
            f488a[i][1] = bArr3;
            f485a[i][2] = AbstractRunnableC0012m.m344a(bArr, 0);
            f485a[i][3] = AbstractRunnableC0012m.m344a(bArr, 2);
            f485a[i][4] = f485a[i][2] * f503j[2];
            f485a[i][5] = f485a[i][3] * f503j[5];
            f482a[i] = c0008i;
            if (i2 > -1) {
                try {
                    int i6 = f503j[0] % f503j[2];
                    f485a[i][6] = (((i6 != 0 ? 1 : 0) + 1) * f503j[2]) + (f503j[0] - i6);
                    int i7 = f503j[1] % f503j[5];
                    f485a[i][7] = (((i7 != 0 ? 1 : 0) + 1) * f503j[5]) + (f503j[1] - i7);
                    if (i2 != i) {
                        f487a[i][0] = f487a[i2][0];
                        f486a[i][0] = f486a[i2][0];
                    } else if (f487a[i][0] == null || f487a[i][0].getWidth() != f485a[i][6] || f487a[i][0].getHeight() != f485a[i][7]) {
                        f487a[i][0] = Image.createImage(f485a[i][6], f485a[i][7]);
                        f486a[i][0] = f487a[i][0].getGraphics();
                    }
                    m253a(i, 4, true);
                } catch (Exception e) {
                }
            }
            f485a[i][8] = -1;
            f485a[i][9] = -1;
            f485a[i][10] = -1;
            f485a[i][11] = -1;
            f485a[i][0] = 1;
            f485a[i][1] = 1;
            f485a[i][12] = 0;
            f485a[i][13] = 0;
            m253a(i, 1, i4 == 1);
            m253a(i, 2, i5 == 1);
            m253a(i, 8, i3 == 32);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m256a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, C0008i c0008i, boolean z, int i2, int i3, int i4) {
        if (z) {
            m255a(i, bArr, bArr2, bArr3, c0008i, i, 16, 0, 0);
        } else {
            m255a(i, bArr, bArr2, bArr3, c0008i, -1, 16, 0, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m257a(Graphics graphics, int i) {
        int clipHeight;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (f492c) {
            if (graphics != null) {
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                clipHeight = graphics.getClipHeight();
                i2 = clipWidth;
                i3 = clipY;
                i4 = clipX;
            } else {
                clipHeight = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            int i9 = f503j[0];
            int i10 = f503j[1];
            if (i == -1) {
                for (int i11 = 0; i11 < f498f; i11++) {
                    m257a(graphics, i11);
                }
                return;
            }
            if (f485a[i][0] == 1 && f485a[i][1] == 1) {
                int i12 = f485a[i][12];
                int i13 = f485a[i][13];
                if (m260a(i, 4)) {
                    int i14 = i12 < 0 ? i12 - f503j[2] : i12;
                    int i15 = i13 < 0 ? i13 - f503j[5] : i13;
                    int i16 = i14 / f503j[2];
                    int i17 = i15 / f503j[5];
                    int i18 = ((f485a[i][6] / f503j[2]) + i16) - 1;
                    int i19 = ((f485a[i][7] / f503j[5]) + i17) - 1;
                    if (f485a[i][8] != i16 || f485a[i][10] != i18) {
                        if (f485a[i][8] < i16 || f485a[i][10] < i18) {
                            if (f485a[i][10] < i16) {
                                i6 = i18;
                                i5 = i16;
                            } else {
                                i5 = f485a[i][10] + 1;
                                i6 = i18;
                            }
                        } else if (f485a[i][8] > i18) {
                            i6 = i18;
                            i5 = i16;
                        } else {
                            i6 = f485a[i][8] - 1;
                            i5 = i16;
                        }
                        m264b(f486a[i][0], i, i5, i17, i6 - i5, i19 - i17, 0, 0);
                        f485a[i][8] = i16;
                        f485a[i][10] = i18;
                    }
                    if (f485a[i][9] != i17 || f485a[i][11] != i19) {
                        if (f485a[i][9] < i17 || f485a[i][11] < i19) {
                            if (f485a[i][11] < i17) {
                                i8 = i19;
                                i7 = i17;
                            } else {
                                i7 = f485a[i][11] + 1;
                                i8 = i19;
                            }
                        } else if (f485a[i][9] > i19) {
                            i8 = i19;
                            i7 = i17;
                        } else {
                            i8 = f485a[i][9] - 1;
                            i7 = i17;
                        }
                        m264b(f486a[i][0], i, i16, i7, i18 - i16, i8 - i7, 0, 0);
                        f485a[i][9] = i17;
                        f485a[i][11] = i19;
                    }
                    if (graphics != null) {
                        while (i12 < 0) {
                            i12 += f485a[i][6];
                        }
                        while (i13 < 0) {
                            i13 += f485a[i][7];
                        }
                        int i20 = i12 % f485a[i][6];
                        int i21 = i13 % f485a[i][7];
                        int i22 = (i12 + i9) % f485a[i][6];
                        int i23 = (i13 + i10) % f485a[i][7];
                        if (i22 > i20) {
                            if (i23 > i21) {
                                m258a(graphics, i, i20, i21, i9, i10, 0, 0);
                            } else {
                                m258a(graphics, i, i20, i21, i9, i10 - i23, 0, 0);
                                m258a(graphics, i, i20, 0, i9, i23, 0, i10 - i23);
                            }
                        } else if (i23 > i21) {
                            m258a(graphics, i, i20, i21, i9 - i22, i10, 0, 0);
                            m258a(graphics, i, 0, i21, i22, i10, i9 - i22, 0);
                        } else {
                            m258a(graphics, i, i20, i21, i9 - i22, i10 - i23, 0, 0);
                            m258a(graphics, i, i20, 0, i9 - i22, i23, 0, i10 - i23);
                            m258a(graphics, i, 0, i21, i22, i10 - i23, i9 - i22, 0);
                            m258a(graphics, i, 0, 0, i22, i23, i9 - i22, i10 - i23);
                        }
                    }
                } else {
                    int i24 = i12 < 0 ? i12 - f503j[2] : i12;
                    int i25 = i13 < 0 ? i13 - f503j[5] : i13;
                    int i26 = i24 / f503j[2];
                    int i27 = i25 / f503j[5];
                    int i28 = i9 / f503j[2];
                    if (f503j[2] * i28 < i9) {
                        i28++;
                    }
                    int i29 = i10 / f503j[5];
                    if (f503j[5] * i29 < i10) {
                        i29++;
                    }
                    m264b(graphics, i, i26, i27, i28, i29, (f503j[2] * i26) - i12, (f503j[5] * i27) - i13);
                }
                if (graphics != null) {
                    graphics.setClip(i4, i3, i2, clipHeight);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m258a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        graphics.setClip(i6, i7, i4, i5);
        graphics.drawImage(f487a[i][0], i6 - i2, i7 - i3, 0);
    }

    /* JADX INFO: renamed from: a */
    static void m259a(byte[] bArr, int i, int i2, boolean z) {
        if (f489b) {
            f484a[i2] = bArr;
            f481a[i2] = i;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m260a(int i, int i2) {
        return (f485a[i][14] & i2) != 0;
    }

    /* JADX INFO: renamed from: b */
    private static int m261b(int i, int i2) {
        return f500g[m248a(i, f501h[i]) + i2];
    }

    /* JADX INFO: renamed from: b */
    private static void m262b(int i) {
        if (f489b) {
            if (f483a[i] != null) {
                f483a[i].stop();
                f483a[i].deallocate();
                f483a[i].close();
                f483a[i] = null;
                AbstractRunnableC0012m.m394m();
            }
            f495d[i] = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    static final void m263b(int i, int i2, int i3) {
        f485a[i][12] = i2;
        int[] iArr = f485a[i];
        if (m260a(i, 8)) {
            i3 = (f485a[i][5] - f503j[1]) - i3;
        }
        iArr[13] = i3;
        if (!m260a(i, 1)) {
            if (f485a[i][12] < 0) {
                f485a[i][12] = 0;
            } else if (f485a[i][12] + f503j[0] > f485a[i][4]) {
                f485a[i][12] = f485a[i][4] - f503j[0];
            }
        }
        if (m260a(i, 2)) {
            return;
        }
        if (f485a[i][13] < 0) {
            f485a[i][13] = 0;
        } else if (f485a[i][13] + f503j[1] > f485a[i][5]) {
            f485a[i][13] = f485a[i][5] - f503j[1];
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m264b(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean zM260a = m260a(i, 4);
        boolean zM260a2 = m260a(i, 1);
        boolean zM260a3 = m260a(i, 2);
        int i13 = f485a[i][2];
        int i14 = f485a[i][3];
        byte[] bArr = f488a[i][0];
        byte[] bArr2 = f488a[i][1];
        int i15 = f503j[2];
        int i16 = f503j[5];
        if (zM260a) {
            i9 = ((f503j[2] * i2) % f485a[i][6]) + i6;
            i8 = ((f503j[5] * i3) % f485a[i][7]) + i7;
            if (i9 < 0) {
                i9 += f485a[i][6];
            }
            if (i8 < 0) {
                i8 += f485a[i][7];
            }
        } else {
            i8 = i7;
            i9 = i6;
        }
        if (zM260a2) {
            i11 = i2;
            while (i11 < 0) {
                i11 += i13;
            }
            while (i11 >= i13) {
                i11 -= i13;
            }
            i10 = i4;
        } else {
            if (i2 < 0) {
                i10 = i4 + i2;
                i11 = 0;
            } else {
                i10 = i4;
                i11 = i2;
            }
            if (i11 + i10 >= i13) {
                i10 = i13 - i11;
            }
        }
        if (zM260a3) {
            i12 = i3;
            while (i12 < 0) {
                i12 += i14;
            }
            while (i12 >= i14) {
                i12 -= i14;
            }
        } else {
            if (i3 < 0) {
                i5 += i3;
                i12 = 0;
            } else {
                i12 = i3;
            }
            if (i12 + i5 >= i14 && (i5 = i14 - i12) == 0) {
                return;
            }
        }
        while (true) {
            int i17 = i12;
            i5--;
            if (i5 < 0) {
                return;
            }
            int i18 = i11;
            int i19 = i10;
            int i20 = i9;
            while (true) {
                i19--;
                if (i19 < 0) {
                    break;
                }
                int i21 = i18 + (i17 * i13);
                if (i21 < bArr.length) {
                    int i22 = bArr[i21] & 255;
                    if (!(i22 == 255)) {
                        int i23 = bArr2 == null ? 0 : bArr2[i21] & 255;
                        if (f482a[i].m302a() == 0) {
                            f482a[i].m321b(graphics, i22, i20, i8, i23);
                        } else {
                            f482a[i].m310a(graphics, i22, (i23 & 1) != 0 ? i20 + f503j[2] : i20, (i23 & 2) != 0 ? i8 + f503j[5] : i8, i23);
                        }
                    }
                }
                i18++;
                if (i18 >= i13) {
                    if (!zM260a2) {
                        break;
                    } else {
                        i18 = 0;
                    }
                }
                i20 += i15;
                if (zM260a && i20 >= f485a[i][6]) {
                    i20 = 0;
                }
            }
            i12 = i17 + 1;
            if (i12 >= i14) {
                if (!zM260a3) {
                    return;
                } else {
                    i12 = 0;
                }
            }
            i8 += i16;
            if (zM260a && i8 >= f485a[i][7]) {
                i8 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    protected static boolean m265c(int i) {
        return f489b && f483a[i] != null && f483a[i].getState() == 400;
    }

    /* JADX INFO: renamed from: e */
    static final int m266e(int i) {
        return f485a[1][12];
    }

    /* JADX INFO: renamed from: e */
    static void m267e(int i) {
        f483a = new Player[f494d];
        f490b = new int[f494d];
        f493c = new int[f494d];
        f495d = new int[f494d];
        f497e = new int[f494d];
        f499f = new int[f494d];
        f500g = new int[f494d * 7 * 5];
        f501h = new int[f494d];
        f502i = new int[f494d];
        for (int i2 = 0; i2 < f494d; i2++) {
            f490b[i2] = -1;
            f501h[i2] = 0;
            f502i[i2] = 0;
        }
        f480F = 23;
        f484a = new byte[23][];
        f481a = new int[f480F];
        f496e = 100;
        f489b = true;
    }

    /* JADX INFO: renamed from: f */
    static final int m268f(int i) {
        return m260a(1, 8) ? (f485a[1][5] - f503j[1]) - f485a[1][13] : f485a[1][13];
    }

    /* JADX INFO: renamed from: f */
    static final void m269f(int i) {
        m252a(i, 2, -1, -1, -1, -1);
    }

    /* JADX INFO: renamed from: g */
    static final int m270g(int i) {
        return f485a[i][4];
    }

    /* JADX INFO: renamed from: g */
    static final void m271g(int i) {
        m252a(i, 4, -1, -1, -1, -1);
    }

    /* JADX INFO: renamed from: h */
    static final int m272h(int i) {
        return f485a[i][5];
    }

    /* JADX INFO: renamed from: h */
    static void m273h(int i) {
        if (!f489b) {
            return;
        }
        f496e = i;
        int i2 = 0;
        while (true) {
            try {
                int i3 = i2;
                if (i3 >= f494d) {
                    return;
                }
                if (f483a[i3] != null && f483a[i3] != null) {
                    f483a[i3].getControl("VolumeControl").setLevel(((f497e[i3] * f496e) * 100) / 10000);
                }
                i2 = i3 + 1;
            } catch (Exception e) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    static void m274i(int i) {
        m254a(i, true);
    }

    /* JADX INFO: renamed from: n */
    static void m275n() {
        boolean zM265c;
        if (f489b) {
            for (int i = 0; i < f494d; i++) {
                if (f502i[i] > 0 && f495d[i] == 2) {
                    try {
                        zM265c = m265c(i);
                    } catch (Exception e) {
                        zM265c = false;
                    }
                    if (!zM265c) {
                        f495d[i] = 1;
                    }
                }
                while (f502i[i] > 0) {
                    try {
                        switch (m261b(i, 0)) {
                            case 1:
                                m249a(i);
                                break;
                            case 2:
                                m262b(i);
                                break;
                            case 3:
                                m249a(i);
                                if (f495d[i] == 1 && f483a[i] != null) {
                                    int iM261b = m261b(i, 1);
                                    int iM261b2 = m261b(i, 2);
                                    int iM261b3 = m261b(i, 4);
                                    int iM261b4 = m261b(i, 3);
                                    if (iM261b3 == 0) {
                                        f483a[i].setLoopCount(-1);
                                    } else {
                                        f483a[i].setLoopCount(iM261b3);
                                    }
                                    f483a[i].getControl("VolumeControl").setLevel(((f496e * iM261b4) * 100) / 10000);
                                    f483a[i].setMediaTime(0L);
                                    f483a[i].start();
                                    f495d[i] = 2;
                                    f497e[i] = iM261b4;
                                    f499f[i] = iM261b3;
                                    f493c[i] = iM261b2;
                                    f490b[i] = iM261b;
                                }
                                break;
                            case 4:
                                if (f483a[i] != null) {
                                    f483a[i].stop();
                                    f495d[i] = 1;
                                }
                                break;
                            case 5:
                                if (f495d[i] == 2 && f483a[i] != null) {
                                    f483a[i].stop();
                                    f495d[i] = 3;
                                }
                                break;
                            case 6:
                                if (f495d[i] == 3 && f483a[i] != null) {
                                    f483a[i].start();
                                    f495d[i] = 2;
                                }
                                break;
                        }
                    } catch (Exception e2) {
                    }
                    f501h[i] = m247a(f501h[i] + 1);
                    int[] iArr = f502i;
                    iArr[i] = iArr[i] - 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    static void m276o() {
        for (int i = 0; i < f494d; i++) {
            m271g(i);
        }
        m275n();
    }

    /* JADX INFO: renamed from: p */
    static void m277p() {
    }

    /* JADX INFO: renamed from: a */
    void mo213a(int i, int i2) {
        if (this.f510a || i != this.f508a) {
            this.f508a = i;
            m281d(0);
            this.f510a = false;
        }
    }

    /* JADX INFO: renamed from: c */
    final int m278c() {
        return this.f508a;
    }

    /* JADX INFO: renamed from: c */
    final void m279c(int i, int i2) {
        this.f504B = i;
        this.f505C = i2;
    }

    /* JADX INFO: renamed from: d */
    final int m280d() {
        return this.f511b;
    }

    /* JADX INFO: renamed from: d */
    final int m281d(int i) {
        if (this.f508a < 0) {
            return -1;
        }
        int iM283e = m283e();
        int i2 = i;
        while (i2 > iM283e) {
            i2 -= iM283e;
        }
        this.f511b = i2;
        this.f507E = 0;
        return i2;
    }

    /* JADX INFO: renamed from: d */
    final void m282d(int i) {
        mo213a(i, -1);
    }

    /* JADX INFO: renamed from: e */
    final int m283e() {
        if (this.f508a >= 0) {
            return this.f509a.m303a(this.f508a);
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    final int m284f() {
        if (this.f508a >= 0) {
            return this.f509a.m304a(this.f508a, this.f511b) * f491c;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    final void m285m() {
        if (this.f508a < 0) {
            return;
        }
        this.f509a.m312a(AbstractRunnableC0012m.f611a, this.f508a, this.f511b, this.f504B, this.f505C, this.f506D, 0, 0);
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
