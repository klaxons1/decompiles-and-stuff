package com.mascotcapsule.eruption.docomostar;

import p000.GameCommon;
import p000.GameStatus;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bi */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0037bi {

    /* JADX INFO: renamed from: f */
    private static AbstractC0005ad[] f718f;

    /* JADX INFO: renamed from: g */
    private static int[][] f719g;

    /* JADX INFO: renamed from: h */
    private static int[] f720h;

    /* JADX INFO: renamed from: a */
    int f721a;

    /* JADX INFO: renamed from: b */
    int f722b;

    /* JADX INFO: renamed from: c */
    private int f723c;

    /* JADX INFO: renamed from: d */
    private int f724d;

    /* JADX INFO: renamed from: e */
    private AbstractC0101ds[] f725e;

    static {
        AbstractC0005ad[] abstractC0005adArr = new AbstractC0005ad[2];
        f718f = abstractC0005adArr;
        abstractC0005adArr[0] = new C0025ax();
        f718f[1] = new C0087de();
        f719g = new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 1, 2, 3}, new int[]{0, 2, 4, 6}, new int[]{0, 3, 6, 9}, new int[]{0, 4, 8, 12}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 1, 0, 0}, new int[]{0, 2, 0, 0}, new int[]{0, 3, 0, 0}, new int[]{0, 4, 0, 0}, new int[]{0, 1, 0, 0}, new int[]{0, 2, 0, 0}, new int[]{0, 3, 0, 0}, new int[]{0, 4, 0, 0}, new int[]{0, 1, 0, 0}, new int[]{0, 2, 0, 0}, new int[]{0, 3, 0, 0}, new int[]{0, 4, 0, 0}, new int[]{0, 1, 0, 0}, new int[]{0, 2, 0, 0}, new int[]{0, 3, 0, 0}, new int[]{0, 4, 0, 0}, new int[]{0, 1, 0, 0}, new int[]{0, 2, 0, 0}, new int[]{0, 3, 0, 0}, new int[]{0, 4, 0, 0}};
        f720h = new int[]{0, 1, 2, 4};
    }

    C0037bi(int i, int i2, int i3) {
        this(i, i2, i3, (byte) 0);
    }

    private C0037bi(int i, int i2, int i3, byte b) {
        this.f723c = 0;
        this.f724d = 0;
        if (i <= 0 || i >= 13) {
            throw new IllegalArgumentException();
        }
        if ((i2 <= 0 || i2 >= 5) && (i2 <= 10 || i2 >= 31)) {
            throw new IllegalArgumentException();
        }
        if (i3 <= 0 || i3 > 131068) {
            throw new IllegalArgumentException();
        }
        this.f725e = new AbstractC0101ds[i3];
        this.f721a = i;
        this.f722b = i2;
        switch (i2) {
            case 11:
            case 12:
            case 13:
            case 14:
                this.f724d = 1;
                this.f723c = 0;
                return;
            case 15:
            case 16:
            case 17:
            case 18:
                this.f724d = 1;
                this.f723c = 2;
                return;
            case 19:
            case 20:
            case 21:
            case 22:
                this.f724d = 1;
                this.f723c = 4;
                return;
            case 23:
            case GameCommon.K_DIR_DOUBLE /* 24 */:
            case GameCommon.K_DIR /* 25 */:
            case GameCommon.K_DIR_BACK /* 26 */:
                this.f724d = 1;
                this.f723c = 6;
                return;
            case GameCommon.K_MAX /* 27 */:
            case 28:
            case 29:
            case 30:
                this.f724d = 1;
                this.f723c = 8;
                return;
            default:
                this.f724d = 0;
                this.f723c = 0;
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    static final int m431a(byte b) {
        return f720h[b & 3] + f720h[(b & 12) >> 2] + f720h[(b & 48) >> 4] + f720h[(b & 192) >> 6];
    }

    /* JADX INFO: renamed from: a */
    static final int m432a(int i, int i2) {
        return f719g[i][1];
    }

    /* JADX INFO: renamed from: a */
    final int m433a(float f, float f2, int i, float[] fArr) {
        return f718f[this.f724d].mo354a(this.f725e, f, f2, i, this.f723c, fArr);
    }

    /* JADX INFO: renamed from: a */
    final void m434a(int i, byte b, byte b2, float f, byte[] bArr) {
        int iM431a;
        int i2 = 1;
        if (i < 0 || i >= this.f725e.length) {
            throw new IllegalArgumentException();
        }
        if (f < 0.0f) {
            throw new IllegalArgumentException();
        }
        if (b != 1 && b != 3) {
            throw new IllegalArgumentException();
        }
        switch (this.f722b) {
            case 11:
            case 15:
            case 19:
            case 23:
            case GameCommon.K_MAX /* 27 */:
                iM431a = 4;
                break;
            case 12:
            case 16:
            case 20:
            case GameCommon.K_DIR_DOUBLE /* 24 */:
            case 28:
                iM431a = 8;
                i2 = 2;
                break;
            case 13:
            case 17:
            case 21:
            case GameCommon.K_DIR /* 25 */:
            case 29:
                iM431a = 12;
                i2 = 3;
                break;
            case 14:
            case 18:
            case 22:
            case GameCommon.K_DIR_BACK /* 26 */:
            case 30:
                iM431a = 16;
                i2 = 4;
                break;
            default:
                throw new IllegalArgumentException();
        }
        if ((b2 & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) != 0) {
            iM431a = m431a(b2);
        }
        C0061cf c0061cf = new C0061cf(i2, b2, iM431a);
        c0061cf.m453a((int) b, f, bArr);
        this.f725e[i] = c0061cf;
    }

    /* JADX INFO: renamed from: a */
    final void m435a(int i, int i2, int i3, float f, float[] fArr, int i4) {
        if (i < 0 || i >= this.f725e.length) {
            throw new IllegalArgumentException();
        }
        if (f < 0.0f) {
            throw new IllegalArgumentException();
        }
        if (i4 != f719g[this.f722b][i3]) {
            throw new IllegalArgumentException();
        }
        if (i2 <= 0 || 4 <= i2) {
            throw new IllegalArgumentException();
        }
        if (i3 <= 0 || 4 <= i3) {
            throw new IllegalArgumentException();
        }
        AbstractC0101ds c0030bb = null;
        switch (this.f722b) {
            case 1:
                if (i3 == 1) {
                    c0030bb = new C0093dk();
                } else if (i3 == 2) {
                    c0030bb = new C0031bc();
                } else if (i3 == 3) {
                    c0030bb = new C0035bg();
                }
                break;
            case 2:
                if (i3 == 1) {
                    c0030bb = new C0075ct();
                } else if (i3 == 2) {
                    c0030bb = new C0054bz();
                } else if (i3 == 3) {
                    c0030bb = new C0038bj();
                }
                break;
            case 3:
                if (i3 == 1) {
                    c0030bb = new C0114m();
                } else if (i3 == 2) {
                    c0030bb = new C0003ab();
                } else if (i3 == 3) {
                    c0030bb = new C0048bt();
                }
                break;
            case 4:
                if (i3 == 1) {
                    c0030bb = new C0118q();
                } else if (i3 == 2) {
                    c0030bb = new C0008ag();
                } else if (i3 == 3) {
                    c0030bb = new C0030bb();
                }
                break;
        }
        c0030bb.mo353a(i2, f, fArr);
        this.f725e[i] = c0030bb;
    }
}
