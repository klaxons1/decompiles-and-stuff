package p000;

import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: C:\Temp\jadx-12448572193422856954\classes.dex */
public class C0004e extends RunnableC0006g {

    /* JADX INFO: renamed from: H */
    private static int f421H;

    /* JADX INFO: renamed from: I */
    private static int f422I;

    /* JADX INFO: renamed from: a */
    static C0004e f424a;

    /* JADX INFO: renamed from: a */
    static C0013n f425a;

    /* JADX INFO: renamed from: a */
    private static C0004e[] f426a;

    /* JADX INFO: renamed from: a */
    private static boolean[] f427a;

    /* JADX INFO: renamed from: b */
    static C0004e f430b;

    /* JADX INFO: renamed from: b */
    static boolean f431b;

    /* JADX INFO: renamed from: c */
    public static C0004e f433c;

    /* JADX INFO: renamed from: d */
    private static int[] f436d;

    /* JADX INFO: renamed from: e */
    private static C0004e f438e;

    /* JADX INFO: renamed from: e */
    private static boolean f439e;

    /* JADX INFO: renamed from: f */
    private static C0004e f441f;

    /* JADX INFO: renamed from: p */
    public static int f443p;

    /* JADX INFO: renamed from: q */
    public static int f444q;

    /* JADX INFO: renamed from: r */
    public static int f445r;

    /* JADX INFO: renamed from: s */
    public static int f446s;

    /* JADX INFO: renamed from: t */
    public static int f447t;

    /* JADX INFO: renamed from: G */
    private int f448G;

    /* JADX INFO: renamed from: J */
    private int f449J;

    /* JADX INFO: renamed from: a */
    int f450a;

    /* JADX INFO: renamed from: a */
    public boolean f451a;

    /* JADX INFO: renamed from: a */
    int[] f452a;

    /* JADX INFO: renamed from: a */
    public byte[][] f453a;

    /* JADX INFO: renamed from: b */
    int f454b;

    /* JADX INFO: renamed from: b */
    int[] f455b;

    /* JADX INFO: renamed from: c */
    int f456c;

    /* JADX INFO: renamed from: c */
    private boolean f457c;

    /* JADX INFO: renamed from: d */
    int f458d;

    /* JADX INFO: renamed from: d */
    C0004e f459d;

    /* JADX INFO: renamed from: d */
    private boolean f460d;

    /* JADX INFO: renamed from: e */
    int f461e;

    /* JADX INFO: renamed from: f */
    int f462f;

    /* JADX INFO: renamed from: g */
    int f463g;

    /* JADX INFO: renamed from: g */
    private C0004e f464g;

    /* JADX INFO: renamed from: h */
    int f465h;

    /* JADX INFO: renamed from: i */
    int f466i;

    /* JADX INFO: renamed from: j */
    int f467j;

    /* JADX INFO: renamed from: k */
    int f468k;

    /* JADX INFO: renamed from: l */
    int f469l;

    /* JADX INFO: renamed from: m */
    int f470m;

    /* JADX INFO: renamed from: n */
    int f471n;

    /* JADX INFO: renamed from: o */
    public int f472o;

    /* JADX INFO: renamed from: u */
    public int f473u;

    /* JADX INFO: renamed from: v */
    public int f474v;

    /* JADX INFO: renamed from: w */
    public int f475w;

    /* JADX INFO: renamed from: x */
    public int f476x;

    /* JADX INFO: renamed from: y */
    public int f477y;

    /* JADX INFO: renamed from: z */
    public int f478z;

    /* JADX INFO: renamed from: c */
    static int[] f434c = new int[32];

    /* JADX INFO: renamed from: a */
    public static int[][] f428a = new int[100][];

    /* JADX INFO: renamed from: A */
    public static int f420A = -1;

    /* JADX INFO: renamed from: e */
    private static int[] f440e = new int[4];

    /* JADX INFO: renamed from: f */
    private static final int[] f442f = {0, 1, 0, 1, 0, 2, 1, 1, 0, 1};

    /* JADX INFO: renamed from: a */
    private static final boolean[][] f429a = {new boolean[]{true, false, true, false, true}, new boolean[]{false, true, false, true, false}, new boolean[]{true, true, true, false, false}, new boolean[]{false, false, true, true, true}, new boolean[]{true, true, false, true, true}};

    /* JADX INFO: renamed from: b */
    private static byte[][] f432b = {new byte[]{0, -20}, new byte[]{0, -18}, new byte[]{1, -17}, new byte[]{-1, -21}, new byte[]{-1, -18}, new byte[]{-2, -19}, new byte[]{2, -18}, new byte[]{-15, 33}};

    /* JADX INFO: renamed from: c */
    private static byte[][] f435c = {new byte[]{-12, -26}, new byte[]{-12, -14}, new byte[]{-11, -26}, new byte[]{-9, -15}, new byte[]{-12, -20}, new byte[]{-6, -11}, new byte[]{-10, -18}, new byte[]{-1, -7}, new byte[]{-9, -10}, new byte[]{4, -8}, new byte[]{-7, -8}, new byte[]{5, -9}, new byte[]{-4, -11}, new byte[]{9, -10}, new byte[]{-15, 14}, new byte[]{-7, 16}};

    /* JADX INFO: renamed from: d */
    private static byte[][] f437d = {new byte[]{-12, -24}, new byte[]{-12, -16}, new byte[]{-11, -23}, new byte[]{-10, -17}, new byte[]{-9, -17}, new byte[]{-8, -13}, new byte[]{-7, -14}, new byte[]{-3, -10}, new byte[]{-6, -9}, new byte[]{-1, -7}, new byte[]{-4, -10}, new byte[]{2, -10}, new byte[]{-1, -11}, new byte[]{5, -10}, new byte[]{-14, 16}, new byte[]{-9, 17}};

    /* JADX INFO: renamed from: K */
    private static int f423K = -1;

    static {
        int[] iArr = {1, 2, 1, 2, 1, 1, 2, 2};
    }

    C0004e() {
        this.f463g = 999;
        this.f466i = -1;
        this.f448G = 1;
        this.f453a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, 8);
        this.f473u = -1;
        this.f449J = 0;
        this.f452a = new int[4];
        if ((this.f462f & 2097152) == 0) {
            this.f506D = 33554432;
            this.f472o = 123;
            this.f471n |= Integer.MIN_VALUE;
        }
    }

    C0004e(int i, int i2, int i3, int i4) {
        this.f463g = 999;
        this.f466i = -1;
        this.f448G = 1;
        this.f453a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, 8);
        this.f473u = -1;
        this.f449J = 0;
        this.f452a = new int[4];
        this.f450a = i2 << 8;
        this.f454b = i3 << 8;
        this.f461e = i4;
        this.f462f = 99;
        ((RunnableC0006g) this).f509a = m153a(i);
        this.f506D = -2147483616;
    }

    C0004e(int i, int i2, int i3, int i4, short[] sArr) {
        this.f463g = 999;
        this.f466i = -1;
        this.f448G = 1;
        this.f453a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, 8);
        this.f473u = -1;
        this.f449J = 0;
        this.f450a = i3 << 8;
        this.f454b = i4 << 8;
        ((RunnableC0006g) this).f509a = m153a(i2);
        this.f462f = i;
        this.f452a = new int[4];
        int[] iArr = null;
        if (sArr != null) {
            int[] iArr2 = new int[sArr.length];
            for (int i5 = 0; i5 < sArr.length; i5++) {
                iArr2[i5] = sArr[i5];
            }
            iArr = iArr2;
        }
        switch (this.f462f) {
            case Integer.MIN_VALUE:
            case 41:
            case 51:
            case 62:
                m197j(iArr[0]);
                this.f455b = iArr;
                this.f461e = this.f455b[2];
                break;
            case 37:
            case 38:
            case 39:
            case 40:
                this.f455b = iArr;
                m234b();
                break;
            case 42:
                this.f455b = new int[11];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    this.f455b[i6] = iArr[i6];
                }
                this.f461e = iArr[2];
                this.f455b[9] = iArr[5];
                this.f455b[7] = this.f455b[3] - 1;
                this.f471n |= 270336;
                break;
            case 44:
                this.f455b = new int[10];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    this.f455b[i7] = iArr[i7];
                }
                this.f455b[4] = this.f455b[4] << 8;
                this.f455b[6] = this.f455b[6] << 8;
                this.f455b[7] = this.f450a;
                this.f455b[8] = this.f454b;
                this.f461e = 9;
                this.f471n |= 32;
                if (this.f455b[0] == 15) {
                    this.f471n |= 16;
                    this.f506D |= 1073741824;
                }
                break;
            case 45:
                this.f467j = 1;
                this.f455b = new int[4];
                this.f455b[0] = iArr[1];
                this.f455b[1] = this.f450a;
                this.f455b[2] = this.f454b;
                this.f455b[3] = 0;
                this.f461e = iArr[2];
                this.f471n |= 1;
                break;
            case 48:
                this.f467j = 0;
                this.f455b = new int[16];
                this.f455b[0] = this.f450a + (iArr[1] << 8);
                this.f455b[1] = this.f454b + (iArr[2] << 8);
                this.f455b[2] = this.f455b[0] + (iArr[3] << 8);
                this.f455b[3] = this.f455b[1] + (iArr[4] << 8);
                this.f455b[4] = 1;
                this.f455b[6] = 0;
                this.f455b[5] = iArr[5];
                this.f455b[8] = 120;
                this.f455b[9] = 76;
                this.f455b[10] = 0;
                this.f455b[11] = 0;
                this.f455b[12] = 120;
                this.f455b[13] = 0;
                this.f455b[14] = 0;
                this.f455b[15] = 0;
                this.f461e = iArr[6];
                break;
            case 50:
                this.f467j = 0;
                this.f455b = new int[4];
                this.f455b[0] = this.f450a + (iArr[1] << 8);
                this.f455b[1] = this.f454b + (iArr[2] << 8);
                this.f455b[2] = this.f455b[0] + (iArr[3] << 8);
                this.f455b[3] = this.f455b[1] + (iArr[4] << 8);
                this.f461e = iArr[5];
                this.f472o = 115;
                this.f506D |= 1073741824;
                break;
            case 52:
                this.f467j = 0;
                m197j(iArr[0]);
                this.f455b = iArr;
                this.f461e = this.f455b[2];
                break;
            case 53:
                this.f467j = 0;
                this.f455b = new int[7];
                this.f455b[0] = this.f450a + (iArr[1] << 8);
                this.f455b[1] = this.f454b + (iArr[2] << 8);
                this.f455b[2] = this.f455b[0] + (iArr[3] << 8);
                this.f455b[3] = this.f455b[1] + (iArr[4] << 8);
                this.f455b[4] = iArr[5];
                this.f455b[5] = iArr[6];
                if (this.f455b[5] == 0) {
                    this.f455b[6] = -(iArr[7] << 8);
                } else {
                    this.f455b[6] = iArr[7] << 8;
                }
                this.f461e = iArr[8];
                break;
            case 54:
                m197j(iArr[0]);
                this.f455b = new int[iArr.length];
                System.arraycopy(iArr, 0, this.f455b, 0, iArr.length);
                this.f467j = 0;
                break;
            case 55:
                this.f467j = 0;
                this.f455b = new int[30];
                this.f455b[0] = iArr[1];
                this.f461e = 19;
                this.f472o = 82;
                this.f506D |= 1073741824;
                this.f506D |= Integer.MIN_VALUE;
                C0004e c0004e = new C0004e(60, 30, 0, 0, new short[]{15, -1});
                c0004e.m235c();
                c0004e.f506D |= 8388608;
                c0004e.f506D |= 1073741824;
                this.f461e = 19;
                f438e = c0004e;
                this.f455b[1] = 6;
                this.f455b[25] = 0;
                break;
            case 56:
                m197j(iArr[0]);
                this.f455b = new int[iArr.length];
                System.arraycopy(iArr, 0, this.f455b, 0, iArr.length);
                this.f461e = iArr[2];
                this.f467j = 0;
                this.f506D |= 1073741824;
                break;
            case 58:
            case 59:
            case 65540:
                this.f467j = 1;
                this.f455b = new int[iArr.length];
                System.arraycopy(iArr, 0, this.f455b, 0, iArr.length);
                break;
            case 60:
                this.f467j = 0;
                this.f455b = new int[iArr.length];
                System.arraycopy(iArr, 0, this.f455b, 0, iArr.length);
                break;
            case 61:
                m197j(iArr[0]);
                this.f455b = new int[4];
                System.arraycopy(iArr, 0, this.f455b, 0, iArr.length);
                this.f461e = -10;
                this.f455b[2] = this.f450a >> 8;
                this.f455b[3] = this.f454b >> 8;
                break;
            case 63:
                this.f467j = 0;
                this.f455b = new int[2];
                this.f455b[0] = iArr[0];
                this.f461e = 30;
                break;
            case 64:
                this.f467j = 0;
                this.f455b = new int[1];
                this.f455b[0] = iArr[0];
                this.f461e = 30;
                break;
            case 66:
                this.f467j = 0;
                m197j(iArr[0]);
                this.f455b = new int[5];
                this.f455b[0] = this.f450a + (iArr[2] << 8);
                this.f455b[1] = this.f454b + (iArr[3] << 8);
                this.f455b[2] = this.f455b[0] + (iArr[4] << 8);
                this.f455b[3] = this.f455b[1] + (iArr[5] << 8);
                this.f471n |= 4194304;
                this.f461e = iArr[6];
                break;
            case 67:
            case 65542:
                this.f467j = 1024;
                m197j(iArr[0]);
                this.f455b = new int[36];
                this.f455b[0] = this.f450a + (iArr[2] << 8);
                this.f455b[1] = this.f454b + (iArr[3] << 8);
                this.f455b[2] = this.f455b[0] + (iArr[4] << 8);
                this.f455b[3] = this.f455b[1] + (iArr[5] << 8);
                int i8 = this.f455b[0] + 15360;
                int i9 = this.f455b[2] - 15360;
                if (i8 < i9) {
                    this.f455b[4] = i8;
                    this.f455b[5] = i9;
                } else {
                    this.f455b[4] = this.f455b[0];
                    this.f455b[5] = this.f455b[2];
                }
                this.f455b[6] = 0;
                this.f455b[7] = this.f454b;
                this.f455b[16] = iArr[7];
                this.f455b[17] = iArr[8];
                this.f455b[18] = iArr[9];
                this.f455b[21] = 0;
                switch (iArr[1]) {
                    case 5:
                        this.f455b[8] = 5;
                        this.f455b[9] = 6;
                        this.f455b[10] = 7;
                        this.f455b[11] = 8;
                        this.f455b[12] = 9;
                        this.f455b[13] = 10;
                        this.f455b[14] = 27;
                        this.f455b[15] = 31;
                        break;
                    case 13:
                        this.f455b[8] = 13;
                        this.f455b[9] = 14;
                        this.f455b[10] = 15;
                        this.f455b[11] = 16;
                        this.f455b[12] = 17;
                        this.f455b[13] = 18;
                        this.f455b[14] = 28;
                        this.f455b[15] = 32;
                        this.f455b[22] = 53;
                        this.f455b[23] = 54;
                        this.f455b[24] = 55;
                        break;
                    case 19:
                        this.f455b[8] = 19;
                        this.f455b[9] = 20;
                        this.f455b[10] = 21;
                        this.f455b[11] = 22;
                        this.f455b[12] = 23;
                        this.f455b[13] = 24;
                        this.f455b[14] = 25;
                        this.f455b[15] = 25;
                        this.f471n |= 4194304;
                        break;
                    case 33:
                        this.f455b[8] = 33;
                        this.f455b[9] = 34;
                        this.f455b[10] = 35;
                        this.f455b[11] = 113;
                        this.f455b[12] = 37;
                        this.f455b[13] = 38;
                        this.f455b[14] = 39;
                        this.f455b[15] = 41;
                        this.f455b[22] = 46;
                        this.f455b[23] = 47;
                        this.f455b[24] = 48;
                        this.f455b[32] = 145;
                        this.f455b[31] = 144;
                        this.f455b[33] = 146;
                        this.f455b[35] = this.f455b[18];
                        this.f455b[21] = 1;
                        break;
                    case 62:
                        this.f455b[8] = 62;
                        this.f455b[9] = 63;
                        this.f455b[10] = 64;
                        this.f455b[11] = 65;
                        this.f455b[12] = 66;
                        this.f455b[13] = 67;
                        this.f455b[14] = 68;
                        this.f455b[15] = 70;
                        this.f455b[22] = 77;
                        this.f455b[23] = 78;
                        this.f455b[24] = 79;
                        this.f455b[32] = 148;
                        this.f455b[31] = 147;
                        this.f455b[33] = 149;
                        this.f455b[35] = this.f455b[18];
                        this.f455b[21] = 2;
                        break;
                    case 80:
                        this.f455b[8] = 80;
                        this.f455b[9] = 81;
                        this.f455b[10] = 82;
                        this.f455b[11] = 83;
                        this.f455b[12] = 84;
                        this.f455b[13] = 85;
                        this.f455b[14] = 86;
                        this.f455b[15] = 88;
                        this.f455b[22] = 96;
                        this.f455b[23] = 97;
                        this.f455b[24] = 98;
                        this.f455b[32] = 151;
                        this.f455b[31] = 150;
                        this.f455b[33] = 152;
                        this.f455b[35] = this.f455b[18];
                        this.f455b[21] = 3;
                        break;
                    case 105:
                        this.f455b[8] = 105;
                        this.f455b[9] = 106;
                        this.f455b[10] = 107;
                        this.f455b[11] = 108;
                        this.f455b[12] = 109;
                        this.f455b[13] = 110;
                        this.f455b[14] = 111;
                        this.f455b[15] = 112;
                        break;
                    case 119:
                        this.f455b[8] = 119;
                        this.f455b[9] = 120;
                        this.f455b[10] = 123;
                        this.f455b[11] = 124;
                        this.f455b[12] = 140;
                        this.f455b[13] = 141;
                        this.f455b[14] = 142;
                        this.f455b[15] = 126;
                        this.f455b[22] = 137;
                        this.f455b[23] = 138;
                        this.f455b[24] = 139;
                        this.f455b[25] = 0;
                        this.f455b[21] = 4;
                        break;
                }
                this.f455b[34] = 0;
                this.f455b[26] = this.f450a;
                this.f455b[27] = this.f454b;
                this.f455b[28] = 0;
                this.f455b[29] = 0;
                if (this.f455b[8] != 19) {
                    this.f472o = 115;
                    this.f472o |= 4;
                }
                if (this.f455b[18] > 3) {
                    this.f472o |= 128;
                }
                this.f455b[30] = 0;
                if (this.f455b[18] > 13) {
                    this.f455b[30] = 1;
                }
                this.f461e = iArr[6];
                this.f471n |= 2359296;
                break;
            case 65537:
                this.f455b = new int[10];
                this.f455b[0] = iArr[1];
                this.f455b[1] = (iArr[2] * 95) / 100;
                this.f455b[2] = (iArr[3] * 95) / 100;
                this.f455b[8] = iArr[5];
                this.f455b[9] = iArr[6];
                m197j(iArr[0]);
                if ((this.f455b[0] >= 0 && this.f455b[0] <= 7) || ((this.f455b[0] >= 16 && this.f455b[0] <= 23) || ((this.f455b[0] >= 57 && this.f455b[0] <= 64) || this.f455b[0] == 56 || this.f455b[0] == 55 || this.f455b[0] == 54))) {
                    if (this.f455b[0] >= 0 && this.f455b[0] <= 7) {
                        this.f455b[3] = this.f455b[0] + 52;
                    } else if (this.f455b[0] >= 16 && this.f455b[0] <= 23) {
                        this.f455b[3] = (this.f455b[0] - 16) + 52;
                    } else if (this.f455b[0] >= 57 && this.f455b[0] <= 64) {
                        this.f455b[3] = (this.f455b[0] - 57) + 52;
                    } else if (this.f455b[0] == 56 || this.f455b[0] == 55 || this.f455b[0] == 54) {
                        this.f455b[3] = 54;
                    }
                    if (this.f455b[0] == 56 || this.f455b[0] == 55 || this.f455b[0] == 54) {
                        this.f455b[4] = this.f455b[0];
                    } else {
                        this.f455b[4] = this.f455b[0] + 8;
                    }
                    this.f455b[5] = 16;
                    if (this.f455b[0] == 16 || this.f455b[0] == 20) {
                        this.f455b[3] = 4;
                        this.f455b[5] = 0;
                    }
                } else if (this.f455b[0] >= 32 && this.f455b[0] <= 39) {
                    this.f455b[3] = (this.f455b[0] - 32) + 60;
                    this.f455b[4] = this.f455b[0];
                    this.f455b[5] = 16;
                } else if (this.f455b[0] >= 40 && this.f455b[0] <= 47) {
                    this.f455b[3] = 4;
                    this.f455b[4] = this.f455b[0];
                    this.f455b[5] = 0;
                } else if (this.f455b[0] == 78) {
                    this.f455b[3] = 54;
                    this.f455b[4] = this.f455b[0];
                    this.f455b[5] = 16;
                }
                this.f455b[6] = 1;
                this.f461e = iArr[4];
                break;
            case 65538:
                m197j(iArr[0]);
                this.f455b = new int[iArr.length];
                System.arraycopy(iArr, 0, this.f455b, 0, iArr.length);
                this.f467j = 0;
                this.f506D |= 1073741824;
                this.f471n |= 262144;
                break;
            case 65539:
                this.f467j = 0;
                this.f455b = new int[30];
                this.f455b[0] = iArr[1];
                this.f461e = 19;
                this.f472o = 82;
                this.f455b[25] = 0;
                break;
            case 65543:
                this.f467j = 1;
                m197j(iArr[0]);
                this.f455b = new int[7];
                this.f455b[0] = iArr[1];
                this.f455b[1] = 0;
                this.f455b[2] = 0;
                this.f455b[3] = 0;
                this.f455b[4] = 256;
                this.f455b[5] = 0;
                this.f455b[6] = 0;
                this.f461e = iArr[2];
                break;
            case 65545:
                this.f467j = 1;
                m197j(iArr[0]);
                this.f455b = new int[5];
                this.f455b[0] = this.f450a + (iArr[2] << 8);
                this.f455b[1] = this.f454b + (iArr[3] << 8);
                this.f455b[2] = this.f455b[0] + (iArr[4] << 8);
                this.f455b[3] = this.f455b[1] + (iArr[5] << 8);
                this.f455b[4] = 0;
                this.f461e = iArr[6];
                break;
            case 65547:
                this.f506D |= 1082130432;
                f424a = this;
                this.f455b = new int[5];
                System.arraycopy(iArr, 0, this.f455b, 0, iArr.length);
                this.f461e = 21;
                break;
        }
        C0003d.m73a(this);
    }

    /* JADX INFO: renamed from: a */
    public static int m147a(int i) {
        if (i < 0) {
            return 0;
        }
        return f428a[i][0];
    }

    /* JADX INFO: renamed from: a */
    public static final int m148a(int i, int i2) {
        int i3;
        int i4;
        int i5 = i < 0 ? -i : i;
        int i6 = i2 < 0 ? -i2 : i2;
        if (i5 < i6) {
            i3 = i5;
            i4 = i6;
        } else {
            i3 = i6;
            i4 = i5;
        }
        return ((((((((i4 << 8) + (i4 << 3)) - (i4 << 4)) - (i4 << 1)) + (i3 << 7)) - (i3 << 5)) + (i3 << 3)) - (i3 << 1)) >> 8;
    }

    /* JADX INFO: renamed from: a */
    public static int m149a(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        m173b(i, i2);
        if (z) {
            i4 = f444q >> 8;
            i5 = f445r >> 8;
            i6 = f446s >> 8;
            i7 = f447t >> 8;
        } else {
            i4 = f445r >> 8;
            i5 = f444q >> 8;
            i6 = f447t >> 8;
            i7 = f446s >> 8;
        }
        int iM189e = m189e(i, i2) >> 8;
        int i16 = z ? i2 + 1 : i2 - 1;
        if (i16 < 0 || i16 >= m172b(i)) {
            return i3;
        }
        m173b(i, i16);
        if (z) {
            i8 = f444q >> 8;
            i9 = f445r >> 8;
            i10 = f446s >> 8;
            i11 = f447t >> 8;
        } else {
            i8 = f445r >> 8;
            i9 = f444q >> 8;
            i10 = f447t >> 8;
            i11 = f446s >> 8;
        }
        int iM189e2 = m189e(i, i16) >> 8;
        int i17 = i5 - i4;
        int i18 = i8 - i4;
        int i19 = i9 - i4;
        int i20 = i11 - i6;
        int i21 = -(i7 - i6);
        int i22 = -(i10 - i6);
        int i23 = -i20;
        if (i17 < 0) {
            i13 = -i17;
            i14 = -i18;
            i12 = -i19;
        } else {
            i12 = i19;
            i13 = i17;
            i14 = i18;
        }
        if (i21 < 0) {
            i21 = -i21;
            i22 = -i22;
            i15 = -i23;
        } else {
            i15 = i23;
        }
        return Math.abs((((i12 < i14 ? -1 : 1) * (Math.abs(i15 - i22) * (Math.abs(i21) * i3))) / (iM189e * iM189e2)) + (((i3 * Math.abs(i13)) * Math.abs(i12 - i14)) / (iM189e * iM189e2)));
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01da  */
    /* JADX INFO: renamed from: a */
    private int m150a(C0004e c0004e, int i) {
        int i2;
        int i3;
        boolean z;
        char c;
        char c2;
        boolean z2;
        char c3;
        char c4;
        if ((i & 7) == 0) {
            return 0;
        }
        c0004e.m202l(0);
        m202l(4);
        boolean z3 = (i & 16) != 0;
        if ((i & 4) != 4) {
            i2 = 0;
        } else {
            if ((this.f506D & 1) == 0) {
                z2 = (c0004e.f469l < 0 || this.f469l > 0) && c0004e.f450a >= this.f450a;
                c3 = 0;
                c4 = 6;
            } else {
                z2 = (c0004e.f469l > 0 || this.f469l < 0) && c0004e.f450a <= this.f450a;
                c3 = 2;
                c4 = 4;
            }
            boolean z4 = z2 || f425a.m429f();
            if (z3 || z4) {
                if (z4) {
                    int[] iArr = f434c;
                    iArr[c3] = iArr[c3] + c0004e.f469l;
                    int[] iArr2 = f434c;
                    iArr2[c4] = iArr2[c4] + this.f469l;
                }
                i2 = m170a(f434c, 0, f434c, 4) ? 4 : 0;
                if (z4) {
                    int[] iArr3 = f434c;
                    iArr3[c3] = iArr3[c3] - c0004e.f469l;
                    int[] iArr4 = f434c;
                    iArr4[c4] = iArr4[c4] - this.f469l;
                }
            } else {
                i2 = 0;
            }
        }
        if ((i & 8) != 8) {
            i3 = i2;
        } else {
            if ((this.f506D & 1) == 0) {
                z = (c0004e.f469l > 0 || this.f469l < 0) && c0004e.f450a <= this.f450a;
                c = 2;
                c2 = 4;
            } else {
                z = (c0004e.f469l < 0 || this.f469l > 0) && c0004e.f450a >= this.f450a;
                c = 0;
                c2 = 6;
            }
            boolean z5 = z || f425a.m429f();
            if (z3 || z5) {
                if (z5) {
                    int[] iArr5 = f434c;
                    iArr5[c] = iArr5[c] + c0004e.f469l;
                    int[] iArr6 = f434c;
                    iArr6[c2] = iArr6[c2] + this.f469l;
                }
                i3 = m170a(f434c, 0, f434c, 4) ? i2 | 8 : i2;
                if (z5) {
                    int[] iArr7 = f434c;
                    iArr7[c] = iArr7[c] - c0004e.f469l;
                    int[] iArr8 = f434c;
                    iArr8[c2] = iArr8[c2] - this.f469l;
                }
            } else {
                i3 = i2;
            }
        }
        if ((i & 1) == 1) {
            boolean z6 = (c0004e.f470m > 0 || this.f470m < 0) && this.f454b + ((this.f452a[1] + this.f452a[3]) / 2) >= c0004e.f454b + c0004e.f452a[3];
            if (z3 || z6) {
                if (z6) {
                    int[] iArr9 = f434c;
                    iArr9[3] = iArr9[3] + c0004e.f470m;
                    int[] iArr10 = f434c;
                    iArr10[5] = iArr10[5] + this.f470m;
                }
                if (m170a(f434c, 0, f434c, 4)) {
                    i3 |= 1;
                }
                if (z6) {
                    int[] iArr11 = f434c;
                    iArr11[3] = iArr11[3] - c0004e.f470m;
                    int[] iArr12 = f434c;
                    iArr12[5] = iArr12[5] - this.f470m;
                }
            }
        }
        if ((i & 2) == 2) {
            boolean z7 = (c0004e.f470m < 0 || this.f470m > 0) && this.f454b + ((this.f452a[3] + this.f452a[1]) / 2) <= c0004e.f454b + c0004e.f452a[1];
            if (z3 || z7) {
                if (z7) {
                    int[] iArr13 = f434c;
                    iArr13[1] = iArr13[1] + c0004e.f470m;
                    int[] iArr14 = f434c;
                    iArr14[7] = iArr14[7] + this.f470m;
                }
                if (m170a(f434c, 0, f434c, 4)) {
                    i3 |= 2;
                }
                if (z7) {
                    int[] iArr15 = f434c;
                    iArr15[1] = iArr15[1] - c0004e.f470m;
                    int[] iArr16 = f434c;
                    iArr16[7] = iArr16[7] - this.f470m;
                }
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public static C0004e m151a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C0004e c0004e = new C0004e(i, i2, i4, i5, null);
        c0004e.f461e = i6;
        c0004e.f506D |= (-1073741824) | i7;
        c0004e.mo213a(i3, 128);
        return c0004e;
    }

    /* JADX INFO: renamed from: a */
    private static C0004e m152a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C0004e c0004e = new C0004e(65, i, i3, i4, null);
        c0004e.f469l = i5;
        c0004e.f470m = i6;
        c0004e.f461e = 30;
        c0004e.f506D |= -1073741824;
        c0004e.mo213a(i2, 6);
        c0004e.f467j = i7;
        return c0004e;
    }

    /* JADX INFO: renamed from: a */
    private static C0008i m153a(int i) {
        if (i < 0 || i > 100) {
            return null;
        }
        return C0003d.f212a[i];
    }

    /* JADX INFO: renamed from: a */
    static void m154a() {
        f425a = null;
        f424a = null;
        f430b = null;
        if (f426a != null) {
            for (int i = 0; i < f426a.length; i++) {
                f426a[i] = null;
            }
        }
        f426a = null;
        f436d = null;
        f427a = null;
        f438e = null;
        f433c = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m155a(int i, int i2, int i3) {
        m173b(i2, i3);
        int iAbs = Math.abs(f444q - f445r);
        int iAbs2 = Math.abs(f446s - f447t);
        int iM148a = m148a(iAbs, iAbs2);
        int i4 = (i * iAbs2) / iM148a;
        int i5 = (i * iAbs) / iM148a;
        if (iAbs != 0 && iAbs2 != 0) {
            switch (m183c(i2, i3)) {
                case 2:
                    i4 = -i4;
                case 1:
                    i5 = -i5;
                    break;
                case 3:
                    i4 = -i4;
                    break;
            }
        } else {
            if (iAbs == 0) {
                i4 = i;
            } else {
                i5 = i;
            }
            if ((m187d(i2, i3) & 32768) == 0) {
                i4 = -i4;
                i5 = -i5;
            }
        }
        f434c[0] = i4;
        f434c[1] = i5;
    }

    /* JADX INFO: renamed from: a */
    private static void m156a(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        m173b(i4, i5);
        if (f444q == f445r) {
            i7 = f444q;
            if (f446s > f447t) {
                if (z) {
                    i3 = -i3;
                }
            } else if (!z) {
                i3 = -i3;
            }
            i6 = i2 + i3;
        } else if (f446s == f447t) {
            if (f444q < f445r) {
                if (!z) {
                    i3 = -i3;
                }
            } else if (z) {
                i3 = -i3;
            }
            i7 = i + i3;
            i6 = f446s;
        } else {
            int iM189e = m189e(i4, i5);
            int iAbs = Math.abs(((f444q - f445r) * i3) / iM189e);
            int iAbs2 = Math.abs(((f446s - f447t) * i3) / iM189e);
            switch (m183c(i4, i5)) {
                case 1:
                case 3:
                    if (f444q >= f445r) {
                        if (z) {
                            iAbs = -iAbs;
                            iAbs2 = -iAbs2;
                        }
                    } else if (!z) {
                        iAbs = -iAbs;
                        iAbs2 = -iAbs2;
                    }
                    break;
                case 2:
                case 4:
                    if (f444q >= f445r) {
                        if (!z) {
                            iAbs2 = -iAbs2;
                        } else {
                            iAbs = -iAbs;
                        }
                    } else if (!z) {
                        iAbs = -iAbs;
                    } else {
                        iAbs2 = -iAbs2;
                    }
                    break;
            }
            int i8 = i + iAbs;
            i6 = i2 + iAbs2;
            i7 = i8;
        }
        f434c[0] = i7;
        f434c[1] = i6;
    }

    /* JADX INFO: renamed from: a */
    private void m157a(int i, boolean z, int i2) {
        int i3 = this.f470m;
        int i4 = this.f470m;
        if (this.f470m < 0) {
            i = -i;
        }
        this.f470m = i4 + i;
        if (i3 * this.f470m < 0) {
            this.f470m = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m158a(Graphics graphics) {
        graphics.setClip(0, 0, C0003d.f355g, C0003d.f358h);
        for (int i = 0; i < f443p; i++) {
            for (int i2 = 0; i2 < f428a[i][1]; i2++) {
                m173b(i, i2);
                int i3 = f444q >> 8;
                int i4 = f446s >> 8;
                int i5 = f445r >> 8;
                int i6 = f447t >> 8;
                int i7 = C0003d.f375m;
                int i8 = C0003d.f378n;
                int i9 = i3 - i7;
                int i10 = i5 - i7;
                int i11 = i4 - i8;
                int i12 = i6 - i8;
                graphics.setColor(16711680);
                graphics.drawLine(i9, i11 - 1, i10, i12 - 1);
                graphics.setColor(16776960);
                graphics.drawLine(i9, i11, i10, i12);
                graphics.setColor(255);
                graphics.drawLine(i9, i11 + 1, i10, i12 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m159a(short s) {
        m160a(s, ((C0004e) f425a).f450a, ((C0004e) f425a).f454b);
    }

    /* JADX INFO: renamed from: a */
    private void m160a(short s, int i, int i2) {
        C0004e c0004e = new C0004e(65543, 6, i >> 8, i2 >> 8, new short[]{0, s, 10});
        c0004e.f504B = m194i(i);
        c0004e.f505C = m196j(i2) - 35;
        c0004e.f469l = (m194i(i) - 10) >> 2;
        c0004e.f470m = (m196j(i2) - 55) >> 2;
        c0004e.f455b[5] = 1;
        c0004e.f506D |= -1073741824;
    }

    /* JADX INFO: renamed from: a */
    private void m161a(boolean z, int i, boolean z2) {
        if (!m169a(f425a, this.f455b) || this.f450a <= C0003d.f329c[0] + 60 || this.f450a >= C0003d.f329c[2] - 60) {
            return;
        }
        if ((((C0004e) f425a).f450a - i >= 0 || z2) && (((C0004e) f425a).f450a - i <= 0 || !z2)) {
            return;
        }
        int i2 = 25600;
        if (this.f455b[21] > 0 && this.f455b[21] != 4) {
            i2 = 51200;
        }
        if (Math.abs(((C0004e) f425a).f450a - i) > i2 || ((C0004e) f425a).f455b[17] > 0 || this.f450a >= this.f455b[2] || this.f450a <= this.f455b[0]) {
            return;
        }
        if (this.f455b[21] > 0) {
            if (this.f455b[21] == 1) {
                if ((AbstractRunnableC0012m.m355b(0, 10) <= 3 || this.f455b[11] == 113 || this.f455b[34] != 1) && !z) {
                    m151a(1073741824, 4, 154, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, this.f506D);
                    this.f455b[11] = 36;
                } else {
                    m151a(1073741824, 4, 156, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, this.f506D);
                    this.f455b[11] = 113;
                }
            } else if (this.f455b[21] == 2) {
                if ((C0003d.f344e % 2 == 1 && this.f455b[34] == 1) || z) {
                    this.f455b[10] = 71;
                    m151a(1073741824, 4, 153, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, this.f506D);
                    this.f449J = 2;
                } else {
                    this.f455b[10] = 64;
                    m151a(1073741824, 4, 154, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, this.f506D);
                }
            } else if (this.f455b[21] == 3) {
                int i3 = C0003d.f350f % 10;
                if ((i3 > 5 && i3 <= 7 && this.f455b[34] == 1) || z) {
                    this.f455b[10] = 89;
                    m151a(1073741824, 4, 155, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, this.f506D);
                } else if (i3 > 7 && this.f455b[34] == 1) {
                    this.f455b[10] = 90;
                    m151a(1073741824, 4, 153, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, this.f506D);
                    this.f449J = 2;
                } else if (i3 <= 5 || this.f455b[10] == 89 || this.f455b[34] == 0) {
                    this.f455b[10] = 82;
                    m151a(1073741824, 4, 154, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, this.f506D);
                }
            }
        }
        mo213a(this.f455b[10], 0);
        this.f467j = 4;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m162a(int i) {
        return i == 1;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m163a(int i, int i2, int i3, int i4) {
        int i5 = i4 + 6 + i4;
        int i6 = f428a[i3][i5];
        int i7 = f428a[i3][i5 + 1];
        int i8 = f428a[i3][i5 + 2];
        int i9 = f428a[i3][i5 + 3];
        return (Math.abs(i6 - i8) < 512 || m177b(i, i6, i8)) && (Math.abs(i7 - i9) < 512 || m177b(i2, i7, i9));
    }

    /* JADX INFO: renamed from: a */
    static final boolean m164a(int i, int i2, int i3, int i4, int i5, int i6) {
        return m177b(i, i3, i5) && m177b(i2, i4, i6);
    }

    /* JADX INFO: renamed from: a */
    static final boolean m165a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return i <= i7 && i3 >= i5 && i2 <= i8 && i4 >= i6;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m166a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (m163a(i, i2, i3, i4)) {
            return false;
        }
        int iM172b = z ? i4 + 1 : i4 - 1;
        if (iM172b < 0 || iM172b >= m172b(i3)) {
            if (!z2) {
                return false;
            }
            iM172b = iM172b < 0 ? m172b(i3) - 1 : 0;
        }
        m173b(i3, iM172b);
        f434c[0] = iM172b;
        if (z) {
            f434c[1] = f444q;
            f434c[2] = f446s;
        } else {
            f434c[1] = f445r;
            f434c[2] = f447t;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m167a(int i, int i2, int[] iArr) {
        return m177b(i, iArr[0], iArr[2]) && m177b(i2, iArr[1], iArr[3]);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m168a(C0004e c0004e, C0004e c0004e2) {
        return m165a(c0004e.f452a[0] + c0004e.f450a, c0004e.f452a[1] + c0004e.f454b, c0004e.f452a[2] + c0004e.f450a, c0004e.f452a[3] + c0004e.f454b, c0004e2.f452a[0] + c0004e2.f450a, c0004e2.f452a[1] + c0004e2.f454b, c0004e2.f452a[2] + c0004e2.f450a, c0004e2.f452a[3] + c0004e2.f454b);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m169a(C0004e c0004e, int[] iArr) {
        return m165a(c0004e.f452a[0] + c0004e.f450a, c0004e.f452a[1] + c0004e.f454b, c0004e.f452a[2] + c0004e.f450a, c0004e.f452a[3] + c0004e.f454b, iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m170a(int[] iArr, int i, int[] iArr2, int i2) {
        return iArr[0] <= iArr2[6] && iArr2[4] <= iArr[2] && iArr[1] <= iArr2[7] && iArr2[5] <= iArr[3];
    }

    /* JADX INFO: renamed from: a */
    private static boolean m171a(int[] iArr, int[] iArr2) {
        return iArr[0] <= iArr2[2] && iArr[2] >= iArr2[0] && iArr[1] <= iArr2[3] && iArr[3] >= iArr2[1];
    }

    /* JADX INFO: renamed from: b */
    public static int m172b(int i) {
        if (i < 0) {
        }
        return f428a[i][1];
    }

    /* JADX INFO: renamed from: b */
    public static void m173b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return;
        }
        int i3 = i2 + 6 + i2;
        int[] iArr = f428a[i];
        f444q = iArr[i3];
        f446s = iArr[i3 + 1];
        f445r = iArr[i3 + 2];
        f447t = iArr[i3 + 3];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    private void m174b(boolean z) {
        C0004e[] c0004eArr = new C0004e[3];
        C0004e[] c0004eArr2 = new C0004e[3];
        for (int i = 0; i < 3; i++) {
            c0004eArr[i] = C0003d.m58a(this.f455b[i + 3]);
        }
        for (int i2 = 0; i2 < 3; i2++) {
            c0004eArr2[i2] = C0003d.m58a(this.f455b[i2 + 6]);
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            if (c0004eArr[i3] != null) {
                if (!m164a(c0004eArr[i3].f450a, c0004eArr[i3].f454b, this.f452a[0], this.f452a[1], this.f452a[2], this.f452a[3])) {
                    z2 = false;
                    break;
                }
                z2 = true;
            }
        }
        if (z2) {
            switch (this.f455b[2]) {
                case 0:
                case 1:
                    break;
                case 2:
                    C0003d.m96b(this);
                    C0003d.m91b();
                    return;
                case 3:
                    C0003d.m114f();
                    C0003d.m96b(this);
                case 4:
                    for (int i4 = 0; i4 < 3; i4++) {
                        if (c0004eArr2[i4] != null && c0004eArr2[i4].f462f == 50) {
                            c0004eArr2[i4].f467j = 3;
                        }
                    }
                    C0003d.m96b(this);
                default:
                    C0003d.m96b(this);
            }
            for (int i5 = 0; i5 < 3; i5++) {
                if (z) {
                    if (this.f455b[i5 + 6] >= 0) {
                        if (this.f455b[2] == 0) {
                            C0003d.m112e(this.f455b[i5 + 6]);
                        } else if (this.f455b[2] == 1) {
                            C0003d.m109e();
                        }
                        C0003d.m96b(this);
                    }
                } else if (c0004eArr2[i5] != null) {
                    if (this.f455b[2] == 0) {
                        c0004eArr2[i5].m235c();
                    } else {
                        c0004eArr2[i5].m237d();
                    }
                }
            }
            C0003d.m96b(this);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m175b(int[] iArr) {
        if (((RunnableC0006g) this).f509a != null) {
            ((RunnableC0006g) this).f509a.m315a(iArr, AbstractRunnableC0012m.m372d(m278c(), 0), AbstractRunnableC0012m.m372d(m211a(), 0), 0, 0, this.f506D);
            iArr[0] = this.f450a + (iArr[0] << 8);
            iArr[2] = this.f450a + (iArr[2] << 8);
            iArr[1] = this.f454b + (iArr[1] << 8);
            iArr[3] = this.f454b + (iArr[3] << 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m176b(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m177b(int i, int i2, int i3) {
        if (i2 < i3) {
            return i >= i2 && i <= i3;
        }
        return i >= i3 && i <= i2;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m178b(int i, int i2, int i3, int i4) {
        if (i2 < i3) {
            return i >= i2 - i4 && i <= i3 + i4;
        }
        return i >= i3 - i4 && i <= i2 + i4;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m179b(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        m173b(i3, i4);
        if (!m178b(i, f444q, f445r, 40960) || !m178b(i2, f446s, f447t, 40960)) {
            return false;
        }
        int i7 = (i + 128) >> 8;
        int i8 = (i2 + 128) >> 8;
        int i9 = ((i + i5) + 128) >> 8;
        int i10 = ((i2 + i6) + 128) >> 8;
        f444q = (f444q + 128) >> 8;
        f446s = (f446s + 128) >> 8;
        f445r = (f445r + 128) >> 8;
        f447t = (f447t + 128) >> 8;
        if (Math.abs(f446s - f447t) <= 1 && Math.abs(((i8 + i10) / 2) - f446s) <= 1) {
            f434c[0] = i9 << 8;
            f434c[1] = f446s << 8;
            return m177b(i9, f444q, f445r);
        }
        int i11 = f444q;
        int i12 = f446s;
        int i13 = f445r;
        int i14 = f447t;
        long j = ((long) (i7 - i9)) << 8;
        long j2 = ((long) (i8 - i10)) << 8;
        long j3 = ((long) (i11 - i13)) << 8;
        long j4 = ((long) (i12 - i14)) << 8;
        long j5 = ((long) ((i9 * i8) - (i7 * i10))) << 8;
        long j6 = ((long) ((i13 * i12) - (i11 * i14))) << 8;
        if (j == 0 && j3 == 0) {
            z = false;
        } else if (j == 0 && j4 == 0 && m177b(i7, i11, i13) && m177b(i12, i8, i10)) {
            f434c[0] = i7;
            f434c[1] = i12;
            z = true;
        } else if (j2 == 0 && j3 == 0 && m177b(i11, i7, i9) && m177b(i8, i12, i14)) {
            f434c[0] = i11;
            f434c[1] = i8;
            z = true;
        } else {
            long j7 = (j3 * j2) - (j * j4);
            if (j3 * j2 == j * j4) {
                z = false;
            } else {
                long j8 = (j3 * j5) - (j * j6);
                long j9 = j5 * j7;
                long j10 = ((j4 != 0 || j3 == 0) && ((j2 == 0 && j != 0) || j != 0)) ? ((j2 * j8) - j9) / (j * j7) : ((j4 * j8) - (j6 * j7)) / (j3 * j7);
                f434c[0] = (int) (j8 / j7);
                f434c[1] = (int) j10;
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        int[] iArr = f434c;
        iArr[0] = iArr[0] << 8;
        int[] iArr2 = f434c;
        iArr2[1] = iArr2[1] << 8;
        return m164a(f434c[0] >> 8, f434c[1] >> 8, i7, i8, i9, i10) && m164a(f434c[0] >> 8, f434c[1] >> 8, f444q, f446s, f445r, f447t);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m180b(C0004e c0004e, C0004e c0004e2) {
        return m164a(c0004e.f450a, c0004e.f454b, c0004e2.f450a + c0004e2.f452a[0], c0004e2.f454b + c0004e2.f452a[1], c0004e2.f450a + c0004e2.f452a[2], c0004e2.f454b + c0004e2.f452a[3]);
    }

    /* JADX INFO: renamed from: b */
    private boolean m181b(C0004e c0004e, boolean z) {
        c0004e.m202l(0);
        m202l(4);
        return m170a(f434c, 0, f434c, 4);
    }

    /* JADX INFO: renamed from: c */
    static int m182c(int i) {
        int iAbs = Math.abs(i);
        if (i > AbstractRunnableC0012m.f631b_) {
            iAbs = AbstractRunnableC0012m.f635c_ - iAbs;
        }
        int i2 = (iAbs * 12) / AbstractRunnableC0012m.f631b_;
        return (i2 % 2) + (i2 / 2);
    }

    /* JADX INFO: renamed from: c */
    public static int m183c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        m173b(i, i2);
        int i7 = f444q;
        int i8 = f446s;
        int i9 = f445r;
        int i10 = f447t;
        if (i7 > i9) {
            i3 = i8;
            i4 = i7;
            i5 = i10;
            i6 = i9;
        } else {
            i3 = i10;
            i4 = i9;
            i5 = i8;
            i6 = i7;
        }
        if (((i5 - i3) >> 8) * ((i6 - i4) >> 8) < 0) {
            return (m187d(i, i2) & 32768) != 0 ? 4 : 2;
        }
        return (m187d(i, i2) & 32768) != 0 ? 3 : 1;
    }

    /* JADX INFO: renamed from: c */
    static void m184c(int i) {
        f430b.f450a = C0003d.f330c[i].f450a;
        f430b.f454b = C0003d.f330c[i].f454b;
        f430b.f467j = 13;
        f430b.f455b[10] = 1;
        f438e.f506D |= 8388608;
    }

    /* JADX INFO: renamed from: c */
    private void m185c(C0004e c0004e) {
        this.f473u = c0004e.f473u;
        this.f474v = c0004e.f474v;
        this.f451a = c0004e.f451a;
        this.f475w = c0004e.f475w;
        this.f476x = c0004e.f476x;
        this.f450a = c0004e.f450a;
        this.f454b = c0004e.f454b;
        this.f469l = c0004e.f469l;
        this.f470m = c0004e.f470m;
        for (int i = 0; i < 4; i++) {
            this.f452a[i] = c0004e.f452a[i];
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m186c(boolean z) {
        if (f439e) {
            return false;
        }
        f439e = true;
        if (this.f462f == 196608 && z && (this.f467j == 0 || this.f467j == 3 || f425a.m429f())) {
            this.f469l = 0;
        }
        f439e = false;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static int m187d(int i, int i2) {
        if ((m147a(i) & 32768) == 0) {
            return 0;
        }
        return f428a[i][i2 + 6 + (f428a[i][1] * 3) + 2];
    }

    /* JADX INFO: renamed from: d */
    private void m188d(C0004e c0004e) {
        this.f467j = 3;
        if (c0004e.f462f == 42) {
            this.f467j = 4;
            this.f459d = c0004e;
        }
        f425a.m428d(5, 0);
        f425a.mo213a(175, 0);
        this.f470m = 0;
        this.f469l = 0;
        this.f450a = c0004e.f450a;
        this.f454b = c0004e.f454b;
        ((C0004e) f425a).f454b -= 14848;
        ((C0004e) f425a).f450a = ((((this.f506D & 1) == 0 ? 1 : -1) * 24) << 8) + ((C0004e) f425a).f450a;
        mo213a(7, 0);
        ((C0004e) f425a).f455b[23] = this.f455b[3];
    }

    /* JADX INFO: renamed from: e */
    private static int m189e(int i, int i2) {
        return f428a[i][i2 + 6 + (f428a[i][1] * 2) + 2];
    }

    /* JADX INFO: renamed from: e */
    private void m190e(C0004e c0004e) {
        boolean z;
        switch (this.f467j) {
            case 0:
                mo213a(0, 0);
                this.f506D |= 8388608;
                break;
            case 1:
                if (c0004e == null) {
                    z = false;
                } else if ((c0004e.f471n & 8192) != 0) {
                    m188d(c0004e);
                } else {
                    if (c0004e.f462f == 47) {
                        if (this.f469l > 0) {
                            this.f450a = c0004e.f452a[0];
                        } else {
                            this.f450a = c0004e.f452a[2];
                        }
                    } else if (this.f469l > 0) {
                        this.f450a = c0004e.f450a + c0004e.f452a[0];
                    } else {
                        this.f450a = c0004e.f450a + c0004e.f452a[2];
                    }
                    z = true;
                }
                if ((this.f469l == 0 && this.f470m == 0) || ((this.f469l > 0 && this.f450a + this.f452a[2] + this.f469l >= C0003d.f329c[2]) || (this.f469l < 0 && this.f450a + this.f452a[0] + this.f469l <= C0003d.f329c[0]))) {
                    z = true;
                }
                if (z) {
                    this.f469l = -this.f469l;
                    this.f470m = -this.f470m;
                    this.f467j = 2;
                    this.f506D &= -33554433;
                } else if (this.f470m == 0) {
                    m215a(4096, false, true, 2139062143);
                } else if (this.f469l != 0) {
                    int iM363c = (AbstractRunnableC0012m.m363c(this.f455b[3]) * 4096) >> 8;
                    int iM354b = (AbstractRunnableC0012m.m354b(this.f455b[3]) * 4096) >> 8;
                    m215a(Math.abs(iM363c), false, true, 2139062143);
                    m157a(-Math.abs(iM354b), true, 2139062143);
                } else {
                    m157a(-4096, true, 2139062143);
                }
                break;
            case 2:
                if (c0004e != null && (c0004e.f471n & 8192) != 0) {
                    m188d(c0004e);
                } else if (!m222a(((C0004e) f425a).f450a, ((C0004e) f425a).f454b, this.f469l)) {
                    m215a(4096, true, true, 2139062143);
                } else {
                    this.f467j = 0;
                    this.f506D |= 8388608;
                }
                break;
            case 3:
                mo213a(7, 0);
                this.f470m = 0;
                this.f469l = 0;
                if (!f425a.m222a(this.f450a, this.f454b, f425a.f469l)) {
                    f425a.m215a(1024, true, true, 3840);
                } else {
                    this.f467j = 0;
                    this.f506D |= 8388608;
                    f425a.mo213a(176, 128);
                }
                break;
            case 4:
                mo213a(7, 0);
                this.f470m = 0;
                this.f469l = 0;
                if (!f425a.m222a(this.f450a, this.f454b, f425a.f469l)) {
                    f425a.m215a(1024, true, true, 3840);
                } else if (m148a(((C0004e) f425a).f450a - this.f450a, ((C0004e) f425a).f454b - this.f454b) <= 16896) {
                    this.f459d.f455b[7] = 0;
                    ((C0004e) f425a).f459d = this.f459d;
                    this.f459d.f467j = 1;
                    this.f459d.m231b(f425a);
                    this.f459d.f455b[9] = (f425a.f506D & 1) == 0 ? 0 : 1;
                    this.f459d.f455b[6] = ((f425a.f506D & 1) == 0 ? -1 : 1) * (Math.abs(this.f455b[3]) % AbstractRunnableC0012m.f631b_);
                    int[] iArr = this.f459d.f455b;
                    iArr[6] = iArr[6] << 8;
                    f425a.f467j = 7;
                    f425a.mo213a(81, 0);
                    this.f459d.m246k();
                    this.f467j = 0;
                    this.f506D |= 8388608;
                    this.f459d = null;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m191f() {
        return m167a(((C0004e) f425a).f450a, ((C0004e) f425a).f454b, this.f452a);
    }

    /* JADX INFO: renamed from: g */
    private boolean m192g() {
        return (this.f506D & 2097152) != 0;
    }

    /* JADX INFO: renamed from: h */
    private boolean m193h() {
        if (this.f470m == 0 && this.f469l == 0) {
            return false;
        }
        int i = this.f450a;
        int i2 = this.f454b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < f443p; i5++) {
            int iM147a = m147a(i5);
            if ((this.f462f != 196608 || (iM147a & 16384) != 16384) && m164a(i, i2, f428a[i5][2], f428a[i5][3], f428a[i5][4], f428a[i5][5])) {
                for (int i6 = 0; i6 < f428a[i5][1]; i6++) {
                    if (m179b(i, i2, i5, i6, this.f469l, this.f470m) && (i != f434c[0] || i2 != f434c[1])) {
                        i3 = i6;
                        i4 = i5;
                        break;
                    }
                }
                if (i4 >= 0) {
                    break;
                }
            }
            i3 = i3;
            i4 = i4;
        }
        if (i4 < 0) {
            return false;
        }
        this.f473u = i4;
        this.f474v = i3;
        this.f450a = f434c[0];
        this.f454b = f434c[1];
        this.f451a = (this.f506D & 1) == 0;
        m223a(this.f473u, this.f474v, this.f469l, this.f470m, (this.f506D & 1) == 0);
        this.f477y = f434c[0];
        this.f475w = this.f450a;
        this.f476x = this.f454b;
        m204m(0);
        this.f470m = 0;
        this.f469l = 0;
        if (this.f462f == 65543 && this.f455b[2] == 1) {
            this.f455b[4] = 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    private static int m194i(int i) {
        return (i >> 8) - RunnableC0006g.m266e(1);
    }

    /* JADX INFO: renamed from: i */
    private static boolean m195i() {
        if (f425a.m429f()) {
            if (f425a.f477y > 6656) {
                return true;
            }
        } else if (Math.abs(f425a.f469l) > 6656) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private static int m196j(int i) {
        return (i >> 8) - RunnableC0006g.m268f(1);
    }

    /* JADX INFO: renamed from: j */
    private void m197j(int i) {
        if (i == 1) {
            this.f506D |= 1;
        } else {
            this.f506D &= -2;
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m198j() {
        boolean z = (f425a.f506D & 1) == 0;
        if (((C0004e) f425a).f455b[17] > 0) {
            return false;
        }
        return (this.f450a < ((C0004e) f425a).f450a && z) || (this.f450a > ((C0004e) f425a).f450a && !z);
    }

    /* JADX INFO: renamed from: k */
    private void m199k(int i) {
        if (((RunnableC0006g) this).f509a != null) {
            m208q();
            ((RunnableC0006g) this).f509a.m308a(AbstractRunnableC0012m.m372d(m278c(), 0), AbstractRunnableC0012m.m372d(m211a(), 0), i, this.f452a, this.f506D);
            int[] iArr = this.f452a;
            iArr[2] = iArr[2] + this.f452a[0];
            int[] iArr2 = this.f452a;
            iArr2[3] = iArr2[3] + this.f452a[1];
            int[] iArr3 = this.f452a;
            iArr3[0] = iArr3[0] - (-(this.f456c >> 8));
            int[] iArr4 = this.f452a;
            iArr4[2] = iArr4[2] - (-(this.f456c >> 8));
            int[] iArr5 = this.f452a;
            iArr5[1] = iArr5[1] - (-(this.f458d >> 8));
            int[] iArr6 = this.f452a;
            iArr6[3] = iArr6[3] - (-(this.f458d >> 8));
            int[] iArr7 = this.f452a;
            iArr7[0] = iArr7[0] << 8;
            int[] iArr8 = this.f452a;
            iArr8[2] = iArr8[2] << 8;
            int[] iArr9 = this.f452a;
            iArr9[1] = iArr9[1] << 8;
            int[] iArr10 = this.f452a;
            iArr10[3] = iArr10[3] << 8;
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m200k() {
        if ((f425a.m278c() == 226 || f425a.m278c() == 227 || f425a.m278c() == 228 || f425a.m278c() == 230 || f425a.m278c() == 231 || f425a.m278c() == 232 || f425a.m278c() == 233 || (f425a.f467j == 10 && f425a.f468k == 1)) && !m198j()) {
            return true;
        }
        if ((this.f462f == 65542 || this.f462f == 67) && this.f467j == 512) {
            return true;
        }
        return f425a.m278c() == 232 && f425a.m211a() > 1;
    }

    /* JADX INFO: renamed from: l */
    static void m201l() {
        if (f423K >= 0) {
            int i = f423K + 1;
            f423K = i;
            if (i % 8 < 4) {
                int iM325d = C0003d.f276b[0].m325d();
                C0003d.f276b[0].m324c(4);
                C0003d.f276b[0].m313a(AbstractRunnableC0012m.f611a, C0003d.m62a(205), AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 3);
                C0003d.f276b[0].m324c(iM325d);
            }
            if (f423K >= 16) {
                f423K = -1;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m202l(int i) {
        if (this.f462f == 47) {
            f434c[i] = this.f452a[0];
            f434c[i + 1] = this.f452a[1];
            f434c[i + 2] = this.f452a[2];
            f434c[i + 3] = this.f452a[3];
            return;
        }
        f434c[i] = this.f450a + this.f452a[0];
        f434c[i + 1] = this.f454b + this.f452a[1];
        f434c[i + 2] = this.f450a + this.f452a[2];
        f434c[i + 3] = this.f454b + this.f452a[3];
    }

    /* JADX INFO: renamed from: l */
    private boolean m203l() {
        return this.f467j == 262144 || m278c() == 71 || m278c() == 90;
    }

    /* JADX INFO: renamed from: m */
    private void m204m(int i) {
        if (i == 1) {
            this.f473u = -1;
        }
    }

    /* JADX INFO: renamed from: m */
    private static boolean m205m() {
        return f425a.m278c() == 197 || f425a.m278c() == 198 || f425a.m278c() == 199 || f425a.m278c() == 200 || f425a.m278c() == 201 || f425a.m278c() == 202 || f425a.m278c() == 181 || f425a.m278c() == 182 || f425a.m278c() == 233;
    }

    /* JADX INFO: renamed from: n */
    private void m206n(int i) {
        int iM172b = m172b(i);
        this.f473u = i;
        m173b(i, 0);
        int iM148a = m148a((this.f450a - f444q) >> 8, (this.f454b - f446s) >> 8);
        this.f474v = 0;
        this.f451a = true;
        this.f475w = f444q;
        this.f476x = f446s;
        m173b(i, iM172b - 1);
        if (iM148a > m148a((this.f450a - f445r) >> 8, (this.f454b - f447t) >> 8)) {
            this.f474v = iM172b - 1;
            this.f451a = false;
            this.f475w = f445r;
            this.f476x = f447t;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m207o(int i) {
        int i2 = this.f454b;
        int i3 = this.f462f == 47 ? i2 + 33280 : i2;
        if (i == 1) {
            m151a(1073741824, 7, 5, this.f450a >> 8, i3 >> 8, f424a.f461e, f424a.f506D);
            return;
        }
        if (m205m()) {
            m151a(1073741824, 7, 6, this.f450a >> 8, i3 >> 8, this.f461e + 1, this.f506D);
        } else if (this.f462f == 65539) {
            m151a(1073741824, 7, 7, this.f450a >> 8, i3 >> 8, this.f461e + 1, this.f506D);
        } else {
            m151a(1073741824, 7, 5, this.f450a >> 8, i3 >> 8, this.f461e + 1, this.f506D);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m208q() {
        if (m278c() < 0 || m211a() < 0) {
            return;
        }
        int iM211a = ((RunnableC0006g) this).f509a.f549a[m278c()] + m211a();
        this.f456c = ((RunnableC0006g) this).f509a.m317b(iM211a) << 8;
        if ((this.f506D & 1) != 0) {
            this.f456c = -this.f456c;
        }
        this.f458d = ((RunnableC0006g) this).f509a.m323c(iM211a) << 8;
        if ((this.f506D & 2) != 0) {
            this.f458d = -this.f458d;
        }
    }

    /* JADX INFO: renamed from: r */
    private void m209r() {
        switch (this.f467j) {
            case 1:
                mo213a(3, 0);
                this.f470m = 0;
                this.f469l = 2560;
                this.f455b[2] = 0;
                this.f454b = C0003d.f201a.f452a[1] + 18944;
                break;
            case 2:
                mo213a(3, 0);
                this.f455b[7] = (C0003d.f201a.f452a[0] + C0003d.f201a.f452a[2]) / 2;
                this.f455b[8] = C0003d.f201a.f452a[1] + 18944;
                this.f454b = C0003d.f201a.f452a[1] + 18944;
                break;
            case 6:
                mo213a(31, 0);
                this.f455b[9] = 0;
                this.f455b[11] = 0;
                this.f454b = C0003d.f201a.f452a[1] + 18944;
                this.f469l = 0;
                this.f470m = 0;
                break;
            case 7:
                mo213a(7, 128);
                this.f455b[9] = 0;
                break;
            case 27:
                if (this.f455b[25] != 0 || this.f455b[1] != 5) {
                    int[] iArr = this.f455b;
                    iArr[23] = iArr[23] + 1;
                    this.f467j = 13;
                    switch (f442f[this.f455b[23] % f442f.length]) {
                        case 0:
                            this.f455b[10] = 1;
                            break;
                        case 1:
                            this.f455b[10] = 6;
                            break;
                        case 2:
                            if (this.f455b[25] == 0) {
                                this.f455b[10] = 1;
                            } else if (this.f455b[25] == 1) {
                                this.f455b[10] = 35;
                            }
                            break;
                    }
                } else {
                    this.f467j = 14;
                    this.f469l = -2560;
                    if ((this.f506D & 1) == 0) {
                        this.f506D ^= 1;
                    }
                    C0003d.m96b(C0003d.f201a);
                    this.f455b[25] = 1;
                    this.f455b[23] = 0;
                    break;
                }
                break;
            case 35:
                mo213a(3, 0);
                this.f470m = 0;
                this.f469l = 2560;
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m210s() {
        mo213a(this.f455b[1], 0);
    }

    /* JADX INFO: renamed from: a */
    public final int m211a() {
        int iM280d = m280d();
        return iM280d >= m283e() ? m283e() - 1 : iM280d;
    }

    /* JADX INFO: renamed from: a */
    final void m212a(int i) {
        if (i >= 10) {
            this.f506D |= 4194304;
        } else {
            this.f506D &= -4194305;
        }
        if ((i & 1) == 0) {
            this.f506D &= -2097153;
        } else {
            this.f506D |= 2097152;
        }
    }

    @Override // p000.RunnableC0006g
    /* JADX INFO: renamed from: a */
    final void mo213a(int i, int i2) {
        switch (this.f462f) {
            case 196608:
                if ((i2 & 256) == 0 && f425a.m429f()) {
                    if ((i == 0 || i == 10 || i == 11) && C0013n.m414i(m278c()) != m278c()) {
                        return;
                    }
                    i = f425a.m433j(i);
                    this.f506D = f434c[0];
                }
                break;
        }
        if (i != super.m278c() || (i2 & 1) != 0) {
            this.f460d = false;
            if ((i2 & 32) != 0) {
                this.f454b += this.f452a[3];
            }
            super.mo213a(i, -1);
            m281d(0);
            this.f507E = 0;
            this.f456c = 0;
            this.f458d = 0;
            if ((i2 & 2) == 0) {
                this.f469l = 0;
            }
            if ((i2 & 4) == 0) {
                this.f470m = 0;
            }
            if ((i2 & 8) == 0) {
                this.f477y = 0;
            }
            this.f506D &= -4097;
            if ((i2 & 128) != 0) {
                this.f506D |= 4096;
            }
            this.f506D &= -8193;
            if ((i2 & 64) != 0) {
                this.f506D |= 8192;
                m281d(((RunnableC0006g) this).f509a.m303a(m280d()) - 1);
            }
        }
        m234b();
        if ((i2 & 32) != 0) {
            this.f454b += this.f452a[3];
        }
        if ((this.f471n & 16384) != 0 && ((C0004e) f425a).f459d == this && f425a.f467j == 3) {
            ((C0004e) f425a).f454b = (this.f454b + this.f452a[1]) - 256;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m214a(int i, boolean z) {
        if (this.f473u >= 0) {
            this.f477y = i;
            return;
        }
        this.f469l = i;
        if ((!z || (this.f506D & 1) == 0) && (z || (this.f506D & 1) != 0)) {
            return;
        }
        this.f469l = -i;
    }

    /* JADX INFO: renamed from: a */
    public final void m215a(int i, boolean z, boolean z2, int i2) {
        if (i2 == 2139062143 || Math.abs(this.f469l) <= i2) {
            if (z) {
                if ((this.f506D & 1) == 0) {
                    this.f469l += i;
                    if (z2 && this.f469l < 0) {
                        this.f469l = 0;
                    }
                } else {
                    this.f469l -= i;
                    if (z2 && this.f469l > 0) {
                        this.f469l = 0;
                    }
                }
            } else if ((this.f506D & 1) == 0) {
                this.f469l -= i;
                if (z2 && this.f469l < 0) {
                    this.f469l = 0;
                }
            } else {
                this.f469l += i;
                if (z2 && this.f469l > 0) {
                    this.f469l = 0;
                }
            }
            if (i2 != 2139062143) {
                if (this.f469l > i2) {
                    this.f469l = i2;
                }
                if (this.f469l < (-i2)) {
                    this.f469l = -i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m216a(C0004e c0004e) {
        int i = this.f455b[2];
        if ((i & 1) != 0 && c0004e.f450a < (C0003d.f387q << 8) + 7680) {
            c0004e.f450a = (C0003d.f387q << 8) + 7680;
            c0004e.f469l = 0;
        }
        if ((i & 4) == 0 || c0004e.f450a <= ((C0003d.f381o + C0003d.f355g) << 8) - 7680) {
            return;
        }
        c0004e.f450a = ((C0003d.f381o + C0003d.f355g) << 8) - 7680;
        c0004e.f469l = 0;
    }

    /* JADX WARN: Code duplicated, block: B:285:0x071c  */
    /* JADX INFO: renamed from: a */
    void mo217a(C0004e c0004e, int i) {
        switch (this.f462f) {
            case 47:
                int[] iArr = this.f455b;
                iArr[12] = iArr[12] - 1;
                if (this.f455b[12] >= 1) {
                    this.f467j = 16;
                } else {
                    this.f467j = 2;
                    this.f455b[12] = 0;
                }
                m207o(i);
                break;
            case 55:
                if (f425a.m278c() == 6) {
                    if (this.f467j != 30) {
                        if (((C0004e) f425a).f450a + ((C0004e) f425a).f452a[0] < f438e.f452a[0] + f438e.f450a || ((C0004e) f425a).f450a + ((C0004e) f425a).f452a[2] > f438e.f450a + f438e.f452a[2]) {
                            f425a.f469l = -f425a.f469l;
                        } else {
                            f425a.f470m = -f425a.f470m;
                        }
                    } else if (f425a.f470m > 0) {
                        f425a.f470m = -f425a.f470m;
                    }
                    int[] iArr2 = this.f455b;
                    iArr2[1] = iArr2[1] - 1;
                }
                int i2 = this.f455b[1] > 3 ? 19 : 39;
                if (this.f467j == 30) {
                    mo213a(32, 128);
                } else {
                    f438e.mo213a(i2, 128);
                }
                break;
            case 56:
                if (i == 0) {
                    mo213a(1, 128);
                    for (int i3 = 0; i3 < C0003d.f405w; i3++) {
                        if (this.f455b[3] == C0003d.f210a[i3].f463g) {
                            C0003d.f210a[i3].f506D |= 8388608;
                        }
                    }
                }
                break;
            case 66:
                C0003d.f396t++;
                this.f467j = 5;
                mo213a(118, 128);
                m207o(i);
                C0003d.m96b(this.f464g);
                break;
            case 67:
            case 65542:
                if (this.f467j != 16 && this.f467j != 32 && this.f467j != 256 && m278c() != 72) {
                    if ((i != 0 || m205m() || (this.f455b[21] > 0 && (this.f455b[21] != 4 || !C0013n.m409d(2)))) && i != 4) {
                        if (i == 0 && (((this.f455b[21] == 4 && !C0013n.m409d(2)) || this.f455b[21] <= 0) && (f425a.m278c() == 181 || f425a.m278c() == 182 || f425a.m278c() == 180))) {
                            this.f455b[18] = 0;
                            this.f469l = (c0004e.f469l * 6) / 5;
                            this.f470m = 1280;
                            mo213a(this.f455b[14], 6);
                        } else if (i == 1 || m205m() || (i == 2 && this.f455b[21] <= 0 && this.f455b[8] != 13)) {
                            if (this.f450a > c0004e.f450a) {
                                this.f469l = 2048;
                            } else {
                                this.f469l = -2048;
                            }
                            this.f470m = 0;
                            if (c0004e.f455b[4] < 3 || this.f455b[21] > 0 || f425a.m278c() == 197 || f425a.m278c() == 199 || f425a.m278c() == 200 || f425a.m278c() == 201 || f425a.m278c() == 202) {
                                int[] iArr3 = this.f455b;
                                iArr3[18] = iArr3[18] - 1;
                            } else {
                                this.f455b[18] = 0;
                                this.f469l += (this.f469l * (c0004e.f455b[4] - 3)) >> 2;
                                this.f470m = 640;
                            }
                            if (f425a.m278c() == 197) {
                                C0003d.m68a(3, 3, 7);
                                if (this.f455b[15] == 30) {
                                    this.f455b[15] = 31;
                                } else if (this.f455b[15] == 29) {
                                    this.f455b[15] = 32;
                                }
                            } else if (this.f455b[15] == 31) {
                                this.f455b[15] = 30;
                            } else if (this.f455b[15] == 32) {
                                this.f455b[15] = 29;
                            }
                            mo213a(this.f455b[15], 6);
                        } else if (i == 2) {
                            m218a((f425a.f506D & 1) == 0);
                            if (this.f455b[21] != 4) {
                                if ((this.f472o & 128) == 0 || this.f455b[18] < 1) {
                                    if (this.f455b[18] >= 1) {
                                        if (f425a.m278c() == 226 && m278c() != 49) {
                                            mo213a(49, 130);
                                            int[] iArr4 = this.f455b;
                                            iArr4[18] = iArr4[18] - 1;
                                        } else if (f425a.m278c() == 227 && m278c() != 50) {
                                            mo213a(50, 130);
                                            int[] iArr5 = this.f455b;
                                            iArr5[18] = iArr5[18] - 1;
                                        } else if (f425a.m278c() == 228 && m278c() != 51) {
                                            mo213a(51, 130);
                                            int[] iArr6 = this.f455b;
                                            iArr6[18] = iArr6[18] - 1;
                                        } else if (f425a.m278c() == 229 && m278c() != 52) {
                                            mo213a(52, 130);
                                            int[] iArr7 = this.f455b;
                                            iArr7[18] = iArr7[18] - 1;
                                        } else if (f425a.m278c() == 232) {
                                            this.f455b[18] = 0;
                                        }
                                    }
                                } else if (f425a.m278c() == 230 && m278c() != this.f455b[22]) {
                                    mo213a(this.f455b[22], 130);
                                    int[] iArr8 = this.f455b;
                                    iArr8[18] = iArr8[18] - 1;
                                } else if (f425a.m278c() == 231 && m278c() != this.f455b[23]) {
                                    mo213a(this.f455b[23], 130);
                                    int[] iArr9 = this.f455b;
                                    iArr9[18] = iArr9[18] - 1;
                                } else if (f425a.m278c() == 232 && m278c() != this.f455b[24] && f425a.m211a() <= 1) {
                                    mo213a(this.f455b[24], 130);
                                    int[] iArr10 = this.f455b;
                                    iArr10[18] = iArr10[18] - 1;
                                } else if (m278c() != this.f455b[15] && (f425a.m278c() == 226 || f425a.m278c() == 227 || f425a.m278c() == 228 || f425a.m278c() == 229)) {
                                    mo213a(this.f455b[15], 130);
                                    int[] iArr11 = this.f455b;
                                    iArr11[18] = iArr11[18] - 1;
                                }
                            } else if (f425a.m278c() == 230 && m278c() != 128) {
                                mo213a(128, 130);
                            } else if (f425a.m278c() == 231 && m278c() != 129) {
                                mo213a(129, 130);
                            } else if (f425a.m278c() == 232 && m278c() != 130) {
                                mo213a(130, 130);
                            }
                            if (f425a.m278c() != 226 && f425a.m278c() != 227 && f425a.m278c() != 228 && f425a.m278c() != 229) {
                                f425a.m202l(0);
                            }
                            if (m170a(f434c, 0, f434c, 4)) {
                                int i4 = ((this.f454b + this.f452a[1]) - 256) / 5120;
                                if ((f425a.f506D & 1) != 0) {
                                    if (this.f450a > f434c[0] + 256) {
                                        do {
                                            this.f450a -= 1536;
                                            if (C0003d.m54a((this.f450a + this.f452a[0]) / 5120, i4) != 1) {
                                            }
                                            this.f450a += 1536;
                                        } while (this.f450a >= f434c[0] + 256);
                                        this.f450a += 1536;
                                    }
                                } else if (this.f450a < f434c[2] - 256) {
                                    do {
                                        this.f450a += 1536;
                                        if (C0003d.m54a((this.f450a + this.f452a[2]) / 5120, i4) != 1) {
                                        }
                                        this.f450a -= 1536;
                                    } while (this.f450a <= f434c[2] - 256);
                                    this.f450a -= 1536;
                                }
                            }
                            this.f467j = 512;
                        }
                        break;
                    } else {
                        this.f455b[18] = 0;
                        if ((c0004e.f462f == 196608 && c0004e.m278c() == 6) || i == 4) {
                            this.f469l = 0;
                            if (this.f455b[11] != 22 || c0004e.f470m >= 0) {
                                this.f470m = 0;
                            } else {
                                this.f470m = 1280;
                            }
                            mo213a(this.f455b[12], 134);
                        } else {
                            this.f469l = (c0004e.f469l * 6) / 5;
                            this.f470m = 1280;
                            mo213a(this.f455b[14], 6);
                        }
                    }
                    if (this.f455b[18] >= 1) {
                        this.f467j = 256;
                    } else {
                        this.f467j = 16;
                        this.f455b[18] = 0;
                    }
                    if (f425a.m278c() == 6) {
                        if ((f425a.f468k & 2048) != 0) {
                            f425a.f468k &= -2049;
                            f425a.f469l = ((-((C0004e) f425a).f455b[11]) + ((C0004e) f425a).f450a) / 2;
                            f425a.f470m = (-((C0004e) f425a).f455b[12]) + ((C0004e) f425a).f454b;
                        }
                        if (f425a.f470m > 0) {
                            f425a.f470m = -f425a.f470m;
                        }
                    }
                    m207o(i);
                    break;
                }
                break;
            case 65538:
                if (i == 1 || i == 0) {
                    mo213a(this.f455b[1] + 1, 128);
                    C0003d.m68a(3, 3, 7);
                    this.f471n &= -262145;
                } else {
                    C0003d.m68a(3, 3, 7);
                }
                m207o(i);
                break;
            case 65539:
                if (f425a.m278c() == 6) {
                    if (f425a.f470m > 0) {
                        f425a.f470m = -((f425a.f470m * 6) / 5);
                    }
                    f425a.f469l = (f425a.f469l * 6) / 5;
                }
                int[] iArr12 = this.f455b;
                iArr12[1] = iArr12[1] - 1;
                mo213a(12, 128);
                C0003d.m68a(2, 2, 4);
                m207o(i);
                break;
            case 65543:
                if (f425a.m278c() == 6 && this.f467j != 4 && this.f455b[1] != 1 && f425a.f470m > 0) {
                    f425a.f470m = -f425a.f470m;
                }
                switch (this.f455b[1]) {
                    case 1:
                        mo213a(9, 0);
                        if (((C0004e) f425a).f455b[13] < 0) {
                            ((C0004e) f425a).f455b[13] = 0;
                        }
                        int[] iArr13 = ((C0004e) f425a).f455b;
                        iArr13[13] = iArr13[13] + 1;
                        if (((C0004e) f425a).f455b[13] > 999) {
                            ((C0004e) f425a).f455b[13] = 999;
                        }
                        int[] iArr14 = ((C0004e) f425a).f455b;
                        iArr14[15] = iArr14[15] + 1;
                        if (((C0004e) f425a).f455b[15] > 100) {
                            ((C0004e) f425a).f455b[15] = 100;
                        }
                        C0003d.m70a(1, 11, false);
                        break;
                    case 2:
                        mo213a(4, 0);
                        m159a((short) 5);
                        int[] iArr15 = ((C0004e) f425a).f455b;
                        iArr15[15] = iArr15[15] + 30;
                        if (((C0004e) f425a).f455b[15] > 100) {
                            ((C0004e) f425a).f455b[15] = 100;
                        }
                        C0003d.m70a(1, 15, false);
                        break;
                    case 4:
                        mo213a(1, 0);
                        m159a((short) 2);
                        if (((C0004e) f425a).f455b[13] < 0) {
                            ((C0004e) f425a).f455b[13] = 0;
                        }
                        int[] iArr16 = ((C0004e) f425a).f455b;
                        iArr16[13] = iArr16[13] + 5;
                        if (((C0004e) f425a).f455b[13] > 999) {
                            ((C0004e) f425a).f455b[13] = 999;
                        }
                        int[] iArr17 = ((C0004e) f425a).f455b;
                        iArr17[15] = iArr17[15] + 5;
                        if (((C0004e) f425a).f455b[15] > 100) {
                            ((C0004e) f425a).f455b[15] = 100;
                        }
                        C0003d.m70a(1, 15, false);
                        break;
                    case 8:
                        f431b = true;
                        f425a.mo213a(166, 0);
                        f425a.f506D &= -33554433;
                        mo213a(11, 0);
                        m159a((short) 12);
                        ((C0004e) f425a).f455b[25] = 200;
                        C0003d.m66a(0);
                        C0003d.m92b(0);
                        C0003d.m70a(0, 2, false);
                        break;
                    case 16:
                        mo213a(7, 0);
                        m159a((short) 16);
                        ((C0004e) f425a).f455b[24] = 1;
                        C0003d.m70a(1, 20, false);
                        break;
                    case 32:
                        mo213a(14, 0);
                        m159a((short) 15);
                        int[] iArr18 = ((C0004e) f425a).f455b;
                        iArr18[14] = iArr18[14] + 1;
                        if (((C0004e) f425a).f455b[14] > 99) {
                            ((C0004e) f425a).f455b[14] = 99;
                        }
                        break;
                }
                this.f467j = 4;
                if (this.f455b[1] != 1) {
                    C0003d.f393s++;
                }
                break;
            case 65545:
                this.f470m = 3840;
                this.f469l = c0004e.f469l;
                this.f455b[4] = 1;
                this.f467j = 2;
                C0003d.f396t++;
                C0003d.m70a(1, 15, false);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m218a(boolean z) {
        if (z) {
            this.f506D |= 1;
        } else {
            this.f506D &= -2;
        }
        m234b();
    }

    /* JADX INFO: renamed from: a */
    final void m219a(int[] iArr) {
        this.f450a = iArr[1];
        this.f454b = iArr[2];
        this.f456c = iArr[3];
        this.f458d = iArr[4];
        this.f506D = iArr[5];
        this.f467j = iArr[6];
        this.f468k = iArr[7];
        if (this != f425a) {
            mo213a(iArr[9], 0);
        }
        int length = this.f455b != null ? this.f455b.length : 0;
        for (int i = 0; i < length; i++) {
            this.f455b[i] = iArr[i + 11];
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m220a() {
        return this.f466i != -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m221a(int i, int i2) {
        boolean z = this.f451a;
        int i3 = this.f450a;
        int i4 = this.f454b;
        if (i >= 0 && i2 >= 0) {
            f434c[0] = i2;
            f434c[1] = i3;
            f434c[2] = i4;
            if (m163a(i3, i4, i, i2)) {
                m156a(i3, i4, 512, i, i2, z);
                f434c[2] = f434c[1];
                f434c[1] = f434c[0];
                f434c[0] = this.f474v;
                if (!m163a(f434c[1], f434c[2], i, f434c[0]) && !m166a(f434c[1], f434c[2], i, i2, z, false)) {
                    m206n(i);
                    f434c[0] = this.f474v;
                    f434c[1] = this.f475w;
                    f434c[2] = this.f476x;
                }
            }
        }
        if (f434c[2] < this.f454b) {
            return !z;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m222a(int i, int i2, int i3) {
        int iM148a = m148a(i - this.f450a, i2 - this.f454b);
        int iAbs = Math.abs(i3);
        if (iAbs > iM148a) {
            iAbs = iM148a;
        }
        if (iAbs == 0) {
            return this.f450a == i && this.f454b == i2;
        }
        if ((iM148a >> 8) == 0) {
            return true;
        }
        int i4 = (((i - this.f450a) >> 8) * iAbs) / (iM148a >> 8);
        int i5 = (iAbs * ((i2 - this.f454b) >> 8)) / (iM148a >> 8);
        if (i4 == 0) {
            this.f450a = i;
        }
        if (i5 == 0) {
            this.f454b = i2;
        }
        int i6 = this.f450a + i4;
        int i7 = i5 + this.f454b;
        if ((this.f450a <= i) != (i6 <= i)) {
            i6 = i;
        }
        if ((this.f454b <= i2) != (i7 <= i2)) {
            i7 = i2;
        }
        this.f450a = i6;
        this.f454b = i7;
        return (i6 >> 8) == (i >> 8) && (i7 >> 8) == (i2 >> 8);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m223a(int i, int i2, int i3, int i4, boolean z) {
        if (i3 == 0 && i4 == 0) {
            m173b(i, 0);
            boolean z2 = f444q < f445r;
            m173b(i, i2);
            boolean z3 = z2 == (f444q < f445r);
            if (z) {
                return z3;
            }
            return !z3;
        }
        m173b(i, i2);
        int i5 = f444q;
        int i6 = f446s;
        m156a(i5, i6, 2048, i, i2, true);
        int i7 = f434c[0] - i5;
        int i8 = f434c[1] - i6;
        f434c[0] = 0;
        if (i7 == 0 && i8 == 0) {
            return true;
        }
        if (i7 != 0) {
            f434c[0] = (i3 * 2048) / i7;
        } else {
            f434c[0] = (i4 * 2048) / i8;
        }
        f434c[0] = Math.abs(f434c[0]);
        if (i3 > 0) {
            return i7 > 0;
        }
        if (i3 < 0) {
            return i7 < 0;
        }
        if (i4 > 0) {
            return i8 > 0;
        }
        return i4 >= 0 || i8 < 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m224a(C0004e c0004e, boolean z) {
        c0004e.m202l(0);
        m202l(4);
        if (z) {
            int[] iArr = f434c;
            iArr[3] = iArr[3] + c0004e.f470m;
        } else {
            f434c[3] = (this.f454b + this.f452a[3]) - 256;
        }
        return m170a(f434c, 0, f434c, 4);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo225a(boolean z) {
        int i = z ? C0003d.f169D : C0003d.f171E;
        if ((this.f506D & 1) == 0) {
            return (i & 4242) != 0;
        }
        return (i & 8776) != 0;
    }

    /* JADX INFO: renamed from: a */
    final int[] m226a() {
        int length = this.f455b != null ? this.f455b.length : 0;
        int[] iArr = new int[length + 11];
        iArr[0] = this.f466i;
        iArr[1] = this.f450a;
        iArr[2] = this.f454b;
        iArr[3] = this.f456c;
        iArr[4] = this.f458d;
        iArr[5] = this.f506D;
        iArr[6] = this.f467j;
        if (this.f462f == 40) {
            iArr[6] = 0;
        } else if (this.f462f == 65543) {
            iArr[6] = 1;
        }
        iArr[7] = this.f468k;
        iArr[9] = m278c();
        iArr[10] = m280d();
        for (int i = 0; i < length; i++) {
            iArr[i + 11] = this.f455b[i];
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final int m227b() {
        if (this.f473u < 0) {
            return this.f469l;
        }
        return this.f451a ? this.f477y : -this.f477y;
    }

    /* JADX INFO: renamed from: b */
    public final int m228b(int i, int i2) {
        int i3 = this.f475w;
        int i4 = this.f476x;
        int i5 = this.f450a;
        int i6 = this.f454b;
        if (i <= 0 || this.f473u < 0) {
            return 0;
        }
        m156a(this.f475w, this.f476x, i, this.f473u, this.f474v, this.f451a);
        int i7 = f434c[0] - this.f475w;
        int i8 = f434c[1] - this.f476x;
        this.f469l = i7;
        this.f470m = i8;
        int i9 = this.f469l;
        int i10 = this.f470m;
        int i11 = 2;
        int iMax = Math.max(Math.abs(i7), Math.abs(i8)) >> 8;
        if (iMax > 20) {
            i11 = 10;
        } else if (iMax > 40) {
            i11 = 20;
        } else if (iMax > 80) {
            i11 = 40;
        }
        int iAbs = Math.abs(i7 / i11);
        int iAbs2 = Math.abs(i8 / i11);
        if (iAbs == 0) {
            i7 = 0;
        }
        if (iAbs2 == 0) {
            i8 = 0;
        }
        if (iAbs == 0 && iAbs2 == 0) {
            return 0;
        }
        while (true) {
            if (i7 != 0 || i8 != 0) {
                int i12 = i7 < 0 ? -iAbs : iAbs;
                int i13 = Math.abs(i7) < Math.abs(i12) ? i7 : i12;
                int i14 = i7 - i13;
                this.f450a += i13;
                this.f475w += i13;
                int i15 = i8 < 0 ? -iAbs2 : iAbs2;
                int i16 = Math.abs(i8) < Math.abs(i15) ? i8 : i15;
                int i17 = i8 - i16;
                this.f454b += i16;
                this.f476x += i16;
                if (m166a(this.f475w, this.f476x, this.f473u, this.f474v, this.f451a, (i2 & 1) != 0)) {
                    if ((this.f462f != 196608 || (!f425a.m430g() && !f425a.m431h())) && this.f477y < 4505 && C0013n.f670K <= 0) {
                        this.f477y = m149a(this.f473u, this.f474v, this.f477y, this.f451a);
                    }
                    if (this.f477y < 0) {
                        this.f477y = -this.f477y;
                    }
                    this.f474v = f434c[0];
                    if (this.f462f == 196608) {
                        if ((this.f467j & Integer.MIN_VALUE) == 0) {
                            if ((m147a(this.f473u) & 15) == 1 && (m187d(this.f473u, this.f474v) & 4096) == 0) {
                                f425a.m428d(2, this.f468k);
                            } else {
                                f425a.m428d(1, this.f468k);
                            }
                        }
                        f425a.m440t();
                        mo213a(f425a.m433j(m278c()), 14);
                        this.f506D = f434c[0];
                    }
                    this.f475w = f434c[1];
                    this.f476x = f434c[2];
                    this.f450a = this.f475w;
                    this.f454b = this.f476x;
                    int iM148a = (i - m148a(i3 - this.f475w, i4 - this.f476x)) + this.f478z;
                    if ((this.f471n & 1024) != 0 && ((C0004e) f425a).f459d == this) {
                        ((C0004e) f425a).f450a += this.f450a - i5;
                        ((C0004e) f425a).f454b += this.f454b - i6;
                    }
                    int iM228b = m228b(iM148a, i2);
                    m204m(2);
                    return iM228b;
                }
                if ((this.f472o & 3) != 0) {
                    int[] iArr = this.f452a;
                    iArr[3] = iArr[3] - 512;
                    m242g();
                    int[] iArr2 = this.f452a;
                    iArr2[3] = iArr2[3] + 512;
                    if (this.f462f == 196608) {
                        f425a.m435j();
                    }
                }
                if (i9 != this.f469l || i10 != this.f470m) {
                    this.f450a -= i13;
                    this.f475w -= i13;
                    this.f454b -= i16;
                    this.f476x -= i16;
                    this.f477y = 0;
                    i2 = 0;
                    break;
                }
                if (this.f462f == 196608 && (this.f467j & Integer.MIN_VALUE) == 0) {
                    if (!f425a.m432i()) {
                        i2 = 0;
                        break;
                    }
                    i8 = i17;
                    i7 = i14;
                } else if (m163a(this.f475w, this.f476x, this.f473u, this.f474v)) {
                    i8 = i17;
                    i7 = i14;
                } else {
                    if ((i2 & 6) != 0) {
                        boolean z = this.f451a;
                        m206n(this.f473u);
                        this.f450a = this.f475w;
                        this.f454b = this.f476x;
                        if ((i2 & 4) == 0) {
                            break;
                        }
                        this.f451a = z;
                        break;
                    }
                    m204m(1);
                }
            }
            i2 = 0;
            break;
        }
        if ((this.f471n & 1024) == 0 || ((C0004e) f425a).f459d != this) {
            return i2;
        }
        ((C0004e) f425a).f450a += this.f450a - i5;
        ((C0004e) f425a).f454b += this.f454b - i6;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    final void m229b() {
        this.f465h = 0;
        if (this.f462f == 44 && this.f467j == 0) {
            mo213a(this.f455b[0], 0);
        }
        if (this.f462f == 37 || this.f462f == 38 || this.f462f == 40 || this.f462f == 39 || this.f462f == 43 || this.f462f == 57 || this.f462f == 47 || this.f462f == 48) {
            int[] iArrM234b = m234b();
            for (int i = 0; i < f440e.length; i++) {
                f440e[i] = iArrM234b[i];
            }
        } else if (((RunnableC0006g) this).f509a != null) {
            ((RunnableC0006g) this).f509a.m315a(f440e, AbstractRunnableC0012m.m372d(m278c(), 0), AbstractRunnableC0012m.m372d(m211a(), 0), 0, 0, this.f506D);
            f440e[0] = this.f450a + (f440e[0] << 8);
            f440e[2] = this.f450a + (f440e[2] << 8);
            f440e[1] = this.f454b + (f440e[1] << 8);
            f440e[3] = this.f454b + (f440e[3] << 8);
        }
        if (m171a(f440e, C0003d.f329c)) {
            this.f465h |= 1;
        }
        if (m167a(this.f450a, this.f454b, C0003d.f340d)) {
            this.f465h |= 2;
        }
        if ((this.f462f == 47 || this.f462f == 43 || this.f462f == 57 || this.f462f == 48 || this.f462f == 40) && m171a(f440e, C0003d.f340d)) {
            this.f465h |= 2;
            if (this.f462f == 43 || this.f462f == 57) {
                this.f465h |= 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m230b(int i) {
        this.f460d = false;
        if (((RunnableC0006g) this).f509a != null && this.f507E >= 0 && (this.f506D & 536870912) == 0 && m278c() >= 0) {
            this.f507E += i;
            int iM284f = m284f();
            if (iM284f > this.f507E && (this.f506D & 33554432) != 0) {
                m243h();
            }
            while (this.f507E >= iM284f) {
                this.f507E -= iM284f;
                int iM280d = m280d();
                int i2 = (this.f506D & 8192) == 0 ? iM280d + 1 : iM280d - 1;
                if (i2 >= m283e() || i2 < 0) {
                    this.f460d = true;
                    if ((this.f506D & 4096) == 0) {
                        if ((this.f506D & 8192) == 0) {
                            m281d(0);
                        } else {
                            m281d(i2 - 1);
                        }
                        this.f456c = 0;
                        this.f458d = 0;
                        m234b();
                    } else if ((this.f506D & 8192) == 0) {
                        m281d(i2 - 1);
                    } else {
                        m281d(0);
                    }
                    if ((this.f506D & 33554432) != 0) {
                        m243h();
                    }
                } else {
                    m281d(i2);
                    m234b();
                    if ((this.f506D & 33554432) != 0) {
                        m243h();
                    }
                }
            }
            if ((this.f471n & 16384) != 0 && ((C0004e) f425a).f459d == this && f425a.f467j == 3) {
                ((C0004e) f425a).f454b = (this.f454b + this.f452a[1]) - 256;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m231b(C0004e c0004e) {
        int i = this.f455b[7] * 2304;
        int i2 = this.f455b[6] >> 8;
        int iM354b = (AbstractRunnableC0012m.m354b(i2) * i) >> 8;
        int iM363c = (i * AbstractRunnableC0012m.m363c(i2)) >> 8;
        c0004e.f450a = this.f450a + iM354b;
        c0004e.f454b = iM363c + this.f454b;
    }

    /* JADX INFO: renamed from: b */
    final boolean m232b() {
        return this.f460d;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo233b(boolean z) {
        int i = z ? C0003d.f169D : C0003d.f171E;
        if ((this.f506D & 1) != 0) {
            return (i & 4242) != 0;
        }
        return (i & 8776) != 0;
    }

    /* JADX INFO: renamed from: b */
    final int[] m234b() {
        if (this.f462f == 37 || this.f462f == 38) {
            this.f452a[0] = this.f450a;
            this.f452a[1] = this.f454b;
            this.f452a[2] = this.f450a + (this.f455b[0] << 8);
            this.f452a[3] = this.f454b + (this.f455b[1] << 8);
        } else if (this.f462f == 40) {
            this.f452a[0] = this.f450a + (this.f455b[3] << 8);
            this.f452a[1] = this.f454b + (this.f455b[4] << 8);
            this.f452a[2] = this.f452a[0] + (this.f455b[5] << 8);
            this.f452a[3] = this.f452a[1] + (this.f455b[6] << 8);
        } else if (this.f462f == 39) {
            this.f452a[0] = this.f450a;
            this.f452a[1] = this.f454b;
            this.f452a[2] = this.f450a + 5120;
            this.f452a[3] = this.f454b + 5120;
        } else if (this.f462f == 43 || this.f462f == 47 || this.f462f == 57 || this.f462f == 48) {
            this.f452a[0] = this.f455b[0];
            this.f452a[1] = this.f455b[1];
            this.f452a[2] = this.f455b[2];
            this.f452a[3] = this.f455b[3];
        } else if (((RunnableC0006g) this).f509a != null) {
            m208q();
            if (this.f462f == 196608 || this.f462f == 44 || this.f462f == 45 || this.f462f == 65543 || this.f462f == 65538 || this.f462f == 65539 || this.f462f == 53 || this.f462f == 54 || this.f462f == 65542 || this.f462f == 55 || this.f462f == 60 || this.f462f == 67 || this.f462f == 49 || (this.f471n & 524288) != 0) {
                ((RunnableC0006g) this).f509a.m308a(AbstractRunnableC0012m.m372d(m278c(), 0), AbstractRunnableC0012m.m372d(m211a(), 0), 0, this.f452a, this.f506D);
                int[] iArr = this.f452a;
                iArr[2] = iArr[2] + this.f452a[0];
                int[] iArr2 = this.f452a;
                iArr2[3] = iArr2[3] + this.f452a[1];
                int[] iArr3 = this.f452a;
                iArr3[0] = iArr3[0] - (-(this.f456c >> 8));
                int[] iArr4 = this.f452a;
                iArr4[2] = iArr4[2] - (-(this.f456c >> 8));
                int[] iArr5 = this.f452a;
                iArr5[1] = iArr5[1] - (-(this.f458d >> 8));
                int[] iArr6 = this.f452a;
                iArr6[3] = iArr6[3] - (-(this.f458d >> 8));
            } else {
                ((RunnableC0006g) this).f509a.m315a(this.f452a, AbstractRunnableC0012m.m372d(m278c(), 0), AbstractRunnableC0012m.m372d(m211a(), 0), this.f450a, this.f454b, this.f506D);
                int[] iArr7 = this.f452a;
                iArr7[0] = iArr7[0] - this.f450a;
                int[] iArr8 = this.f452a;
                iArr8[2] = iArr8[2] - this.f450a;
                int[] iArr9 = this.f452a;
                iArr9[1] = iArr9[1] - this.f454b;
                int[] iArr10 = this.f452a;
                iArr10[3] = iArr10[3] - this.f454b;
            }
            int[] iArr11 = this.f452a;
            iArr11[0] = iArr11[0] << 8;
            int[] iArr12 = this.f452a;
            iArr12[2] = iArr12[2] << 8;
            int[] iArr13 = this.f452a;
            iArr13[1] = iArr13[1] << 8;
            int[] iArr14 = this.f452a;
            iArr14[3] = iArr14[3] << 8;
        }
        return this.f452a;
    }

    /* JADX INFO: renamed from: c */
    final void m235c() {
        this.f506D |= 2097152;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x034b A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:204:0x009c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX INFO: renamed from: c */
    public final boolean m236c() {
        boolean z;
        boolean z2;
        if ((this.f471n & 1073741824) != 0 && this.f460d) {
            C0003d.m96b(this);
            return true;
        }
        if ((this.f471n & 262144) != 0 || (this.f471n & 1048576) != 0 || (this.f471n & 2097152) != 0) {
            int i = 0;
            while (true) {
                if (i >= C0003d.f408x) {
                    z = false;
                    break;
                }
                C0004e c0004e = C0003d.f275b[i];
                if ((this.f471n & 262144) != 0 && c0004e.f462f == 65547) {
                    if (c0004e.f467j != 0 && c0004e.f467j != 3) {
                        if (m181b(c0004e, false)) {
                            c0004e.m190e(this);
                            mo217a(c0004e, 1);
                            z = true;
                            break;
                        }
                        if ((this.f471n & 1048576) == 0) {
                            if ((this.f471n & 2097152) != 0) {
                                continue;
                            }
                        } else if ((this.f471n & 2097152) != 0) {
                            continue;
                        }
                    }
                    i++;
                } else if ((this.f471n & 1048576) == 0 && c0004e.f462f == 49) {
                    c0004e.m234b();
                    if (m181b(c0004e, false)) {
                        mo217a(c0004e, 3);
                        z = true;
                        break;
                    }
                    if (m168a(c0004e, f425a)) {
                        f425a.mo217a(c0004e, 3);
                        z = true;
                        break;
                    }
                    if ((this.f471n & 2097152) != 0) {
                        continue;
                    }
                    i++;
                } else {
                    if ((this.f471n & 2097152) != 0 && c0004e.f462f == 50 && m181b(c0004e, false)) {
                        mo217a(c0004e, 4);
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                return true;
            }
        }
        if ((this.f471n & 495) == 0) {
            return false;
        }
        C0013n c0013n = f425a;
        int i2 = this.f471n;
        if ((c0013n.f506D & 8388608) != 0 || this == c0013n || this.f452a[2] <= this.f452a[0] || this.f452a[3] <= this.f452a[1] || ((C0004e) c0013n).f452a[2] <= ((C0004e) c0013n).f452a[0] || ((C0004e) c0013n).f452a[3] <= ((C0004e) c0013n).f452a[1]) {
            z2 = false;
        } else if (c0013n == f425a && c0013n.f467j == 20) {
            z2 = false;
        } else if (c0013n == f425a && this.f462f == 44 && (((C0004e) f425a).f450a < this.f452a[0] + this.f450a || ((C0004e) f425a).f450a > this.f452a[2] + this.f450a)) {
            if (((C0004e) f425a).f459d == this) {
                ((C0004e) f425a).f459d = null;
            }
            z2 = false;
        } else {
            f433c.m185c(c0013n);
            int iM150a = m150a((C0004e) c0013n, i2);
            if (this.f462f == Integer.MIN_VALUE && (this.f471n & 524288) != 0 && m168a(this, c0013n)) {
                f425a.mo217a(this, 0);
                C0003d.m70a(1, 18, false);
                z2 = true;
            } else {
                if ((f425a.f467j == 3 && ((C0004e) f425a).f459d == this) || iM150a != 0) {
                    if ((this.f471n & 524288) != 0) {
                        f425a.mo217a(this, 0);
                        C0003d.m70a(1, 18, false);
                    }
                    switch (this.f462f) {
                        case 45:
                            ((C0004e) f425a).f459d = this;
                            ((C0004e) f425a).f450a = this.f450a;
                            f425a.m424a(this, 1, 0);
                            break;
                        case 47:
                            if (((C0004e) f425a).f459d != this) {
                                ((C0004e) f425a).f459d = this;
                                f425a.m424a(this, 1, 0);
                            }
                            break;
                        case 55:
                            if (((C0004e) f425a).f459d != this) {
                                ((C0004e) f425a).f459d = this;
                                f425a.m424a(this, 1, 0);
                            }
                            break;
                    }
                }
                int i3 = (i2 >> 5) & 511;
                if (f433c.f469l * c0013n.f469l < 0) {
                    f433c.f469l = c0013n.f469l;
                }
                if (f433c.f470m * c0013n.f470m < 0) {
                    f433c.f470m = c0013n.f470m;
                }
                int iM150a2 = m150a(f433c, i3);
                if (iM150a2 == 0) {
                    z2 = false;
                } else {
                    if (this.f462f == 44 && ((C0004e) f425a).f459d != this && f425a.f467j != 7 && f425a.m278c() != 54 && f425a.m278c() != 55) {
                        if (this.f455b[0] != 15) {
                            mo213a(this.f455b[0] + 1, 0);
                        }
                        ((C0004e) f425a).f459d = this;
                        f425a.m424a(this, 1, 0);
                    }
                    if (((this.f462f == 65538 && this.f467j == 1) || (this.f462f == 65543 && this.f467j == 2)) && (f425a.m278c() == 4 || f425a.m278c() == 6 || f425a.m278c() == 181 || Math.abs(f425a.m227b()) >= 5632)) {
                        mo217a((C0004e) f425a, 0);
                        if (this.f462f == 65543) {
                            m151a(1073741824, 4, 10, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, 0);
                        }
                        z2 = true;
                    } else {
                        boolean z3 = (this.f506D & 1) == 0;
                        if ((iM150a2 & 12) != 0 && ((C0004e) c0013n).f459d != this) {
                            if ((this.f471n & 32768) == 0) {
                                f425a.m214a(0, true);
                            } else if (Math.abs(f425a.m227b()) > 2048) {
                                f425a.m214a(2048, true);
                            }
                            int i4 = (iM150a2 & 4) != 0 ? z3 ? ((this.f450a + this.f452a[2]) - ((C0004e) f425a).f452a[0]) + 512 : ((this.f450a + this.f452a[0]) - ((C0004e) f425a).f452a[2]) - 512 : 2139062143;
                            if ((iM150a2 & 8) != 0) {
                                i4 = !z3 ? ((this.f450a + this.f452a[2]) - ((C0004e) f425a).f452a[0]) + 512 : ((this.f450a + this.f452a[0]) - ((C0004e) f425a).f452a[2]) - 512;
                            }
                            if (i4 != 2139062143) {
                                f433c.m185c(f425a);
                                f433c.f472o = 33;
                                f433c.f469l = i4 - f433c.f450a;
                                f433c.f470m = 0;
                                f433c.f473u = -1;
                                f433c.m243h();
                                ((C0004e) f425a).f450a = f433c.f450a;
                            }
                        }
                        if (c0013n == f425a && (iM150a2 & 3) != 0) {
                            int i5 = (((C0004e) f425a).f454b + ((C0004e) f425a).f452a[3]) - (this.f454b + this.f452a[1]);
                            if ((iM150a2 & 1) != 0 && ((C0004e) f425a).f459d != this && (i5 <= 0 || i5 < this.f470m + f425a.f470m)) {
                                f425a.m424a(this, 1, 0);
                                if ((this.f471n & 65536) == 0) {
                                    f425a.f470m = 0;
                                }
                            }
                            if ((iM150a2 & 2) != 0 && (iM150a2 & 12) == 0) {
                                ((C0004e) f425a).f454b = (this.f454b + this.f452a[3]) - ((C0004e) f425a).f452a[1];
                                if ((this.f471n & 65536) == 0) {
                                    f425a.f470m = 0;
                                }
                            }
                        }
                        z2 = false;
                    }
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: d */
    final void m237d() {
        this.f506D &= -2097153;
        this.f506D &= -1073741825;
        if (this.f462f == 40 && this.f467j == 1 && C0003d.f201a == this) {
            C0003d.f201a.f467j = 0;
            C0003d.f201a = null;
            m244i();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m238d() {
        boolean zM186c;
        if ((this.f453a[0][0] & 16) == 0 || this.f469l == 0) {
            zM186c = false;
        } else {
            if ((this.f472o & 32) != 0) {
                if (this.f469l > 0) {
                    this.f450a = (((((((this.f450a + this.f452a[2]) + 256) >> 8) / 20) << 8) * 20) - 256) - this.f452a[2];
                } else {
                    this.f450a = ((((((((this.f450a + this.f452a[0]) - 256) + 5120) >> 8) / 20) << 8) * 20) + 256) - this.f452a[0];
                }
            }
            if ((this.f472o & 8) != 0) {
                if (this.f462f == 196608 && (m278c() == 2 || m278c() == 3 || m278c() == 4 || m278c() == 68)) {
                    mo213a(0, 6);
                }
                this.f469l = 0;
                zM186c = true;
            } else {
                zM186c = m186c(true);
            }
            m242g();
        }
        if ((this.f453a[1][0] & 16) == 0) {
            return zM186c;
        }
        if ((this.f472o & 64) != 0) {
            if (this.f470m > 0) {
                this.f454b = (((((((this.f454b + this.f452a[3]) + 256) >> 8) / 20) << 8) * 20) - 256) - this.f452a[3];
            } else {
                this.f454b = ((((((((this.f454b + this.f452a[1]) - 256) + 5120) >> 8) / 20) << 8) * 20) + 256) - this.f452a[1];
            }
        }
        if ((this.f472o & 16) == 0) {
            return m186c(false);
        }
        if (this.f462f != 65543) {
            this.f470m = 0;
            return true;
        }
        if (this.f455b[2] != 1 || this.f470m <= 0) {
            this.f470m = 0;
            return true;
        }
        this.f470m = -(this.f470m - (this.f470m >> 1));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:1037:0x20bb  */
    /* JADX WARN: Code duplicated, block: B:1040:0x20c4 A[LOOP:9: B:1038:0x20c1->B:1040:0x20c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:1242:0x2545  */
    /* JADX WARN: Code duplicated, block: B:1244:0x255b  */
    /* JADX WARN: Code duplicated, block: B:1245:0x255e  */
    /* JADX WARN: Code duplicated, block: B:1809:0x3324 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1810:0x3326  */
    /* JADX WARN: Code duplicated, block: B:1813:0x332a  */
    /* JADX WARN: Code duplicated, block: B:1815:0x333a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1816:0x333c  */
    /* JADX WARN: Code duplicated, block: B:1842:0x3380  */
    /* JADX WARN: Code duplicated, block: B:1843:0x3386  */
    /* JADX WARN: Code duplicated, block: B:1846:0x338a  */
    /* JADX WARN: Code duplicated, block: B:1849:0x3394  */
    /* JADX WARN: Code duplicated, block: B:1851:0x33a2  */
    /* JADX WARN: Code duplicated, block: B:1852:0x33a6 A[LOOP:13: B:1844:0x3387->B:1852:0x33a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:2432:0x3341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:2435:0x3392 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    void mo239e() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        if (f431b || !C0003d.m84a(this) || m236c()) {
            return;
        }
        switch (this.f462f) {
            case Integer.MIN_VALUE:
                m210s();
                break;
            case 37:
                m174b(false);
                break;
            case 38:
                m174b(true);
                break;
            case 39:
                C0004e[] c0004eArr = new C0004e[3];
                C0004e[] c0004eArr2 = new C0004e[3];
                for (int i6 = 0; i6 < 3; i6++) {
                    c0004eArr[i6] = C0003d.m58a(this.f455b[i6 + 1]);
                }
                boolean z3 = false;
                boolean z4 = this.f455b[0] < 10;
                boolean z5 = this.f455b[0] % 10 <= 2;
                int i7 = this.f455b[0] % 10;
                for (int i8 = 0; i8 < 3; i8++) {
                    if (i7 == 0 || i7 == 3) {
                        if (this.f455b[i8 + 1] < 0) {
                            continue;
                        } else if (c0004eArr[i8] == null || c0004eArr[i8].mo240e()) {
                            z3 = true;
                        } else {
                            z3 = false;
                            if (z3) {
                                if (z5) {
                                    for (i3 = 0; i3 < 3; i3++) {
                                        c0004eArr2[i3] = C0003d.m58a(this.f455b[i3 + 4]);
                                        if (c0004eArr2[i3] == null) {
                                            if (z4) {
                                                c0004eArr2[i3].m235c();
                                            } else {
                                                c0004eArr2[i3].m237d();
                                            }
                                        }
                                    }
                                } else {
                                    for (i2 = 0; i2 < 3; i2++) {
                                        if (this.f455b[i2 + 4] >= 0) {
                                            if (z4) {
                                                C0003d.m112e(this.f455b[i2 + 4]);
                                            } else {
                                                C0003d.m109e();
                                            }
                                        }
                                    }
                                }
                                C0003d.m96b(this);
                            }
                        }
                    } else if (i7 == 4 || i7 == 1) {
                        if (this.f455b[i8 + 1] < 0) {
                            continue;
                        } else if (c0004eArr[i8] == null || !c0004eArr[i8].m192g()) {
                            z3 = false;
                            if (z3) {
                                if (z5) {
                                    while (i3 < 3) {
                                        c0004eArr2[i3] = C0003d.m58a(this.f455b[i3 + 4]);
                                        if (c0004eArr2[i3] == null) {
                                            if (z4) {
                                                c0004eArr2[i3].m235c();
                                            } else {
                                                c0004eArr2[i3].m237d();
                                            }
                                        }
                                    }
                                } else {
                                    while (i2 < 3) {
                                        if (this.f455b[i2 + 4] >= 0) {
                                            if (z4) {
                                                C0003d.m112e(this.f455b[i2 + 4]);
                                            } else {
                                                C0003d.m109e();
                                            }
                                        }
                                    }
                                }
                                C0003d.m96b(this);
                            }
                        } else {
                            z3 = true;
                        }
                    } else {
                        if ((i7 == 5 || i7 == 2) && this.f455b[i8 + 1] >= 0) {
                            if (c0004eArr[i8] == null || c0004eArr[i8].m192g()) {
                                z3 = false;
                                if (z3) {
                                    if (z5) {
                                        while (i3 < 3) {
                                            c0004eArr2[i3] = C0003d.m58a(this.f455b[i3 + 4]);
                                            if (c0004eArr2[i3] == null) {
                                                if (z4) {
                                                    c0004eArr2[i3].m235c();
                                                } else {
                                                    c0004eArr2[i3].m237d();
                                                }
                                            }
                                        }
                                    } else {
                                        while (i2 < 3) {
                                            if (this.f455b[i2 + 4] >= 0) {
                                                if (z4) {
                                                    C0003d.m112e(this.f455b[i2 + 4]);
                                                } else {
                                                    C0003d.m109e();
                                                }
                                            }
                                        }
                                    }
                                    C0003d.m96b(this);
                                }
                            } else {
                                z3 = true;
                            }
                            break;
                        }
                    }
                    break;
                }
                if (z3) {
                    if (z5) {
                        while (i3 < 3) {
                            c0004eArr2[i3] = C0003d.m58a(this.f455b[i3 + 4]);
                            if (c0004eArr2[i3] == null) {
                                if (z4) {
                                    c0004eArr2[i3].m235c();
                                } else {
                                    c0004eArr2[i3].m237d();
                                }
                            }
                        }
                    } else {
                        while (i2 < 3) {
                            if (this.f455b[i2 + 4] >= 0) {
                                if (z4) {
                                    C0003d.m112e(this.f455b[i2 + 4]);
                                } else {
                                    C0003d.m109e();
                                }
                            }
                        }
                    }
                    C0003d.m96b(this);
                }
                break;
            case 40:
                m234b();
                if (this.f467j == 0) {
                    if (m191f()) {
                        this.f467j = 1;
                        if (C0003d.f201a != null) {
                            C0003d.m101c();
                        }
                        C0003d.f201a = this;
                        int i9 = this.f455b[2];
                        if ((i9 & 1) != 0) {
                            C0003d.f387q = this.f450a >> 8;
                        }
                        if ((i9 & 4) != 0) {
                            C0003d.f381o = ((this.f450a >> 8) + this.f455b[0]) - C0003d.f355g;
                        }
                        if ((i9 & 2) != 0) {
                            C0003d.f390r = this.f454b >> 8;
                        }
                        if ((i9 & 8) != 0) {
                            C0003d.f384p = ((this.f454b >> 8) + this.f455b[1]) - C0003d.f358h;
                        }
                        C0003d.f160A = 12;
                    }
                    break;
                } else if (this.f467j == 1 && !m191f()) {
                    if (C0003d.f201a == this) {
                        C0003d.m101c();
                    }
                    m244i();
                    this.f467j = 0;
                    break;
                }
                break;
            case 41:
                switch (this.f467j) {
                    case 0:
                        mo213a(this.f455b[1], 0);
                        if (m168a(this, f425a)) {
                            mo213a(this.f455b[1] + 1, 128);
                            this.f467j = 1;
                        }
                        break;
                    case 1:
                        if (this.f460d) {
                            mo213a(this.f455b[1] + 2, 128);
                            this.f467j = 2;
                        }
                        break;
                    case 2:
                        if (!m169a(this, C0003d.f329c)) {
                            mo213a(this.f455b[1], 128);
                            this.f467j = 0;
                        }
                        break;
                }
                break;
            case 42:
                int iM303a = ((RunnableC0006g) f425a).f509a.m303a(81);
                if (this.f455b[9] == 0) {
                    this.f455b[8] = 1661;
                } else {
                    this.f455b[8] = -1661;
                }
                int[] iArr = this.f455b;
                iArr[6] = iArr[6] + this.f455b[8];
                if (this.f455b[6] < (iM303a / 2) * (-1661)) {
                    this.f455b[9] = 0;
                    this.f455b[6] = (iM303a / 2) * (-1661);
                } else if (this.f455b[6] > (iM303a / 2) * 1661) {
                    this.f455b[9] = 1;
                    this.f455b[6] = (iM303a / 2) * 1661;
                }
                if (this.f467j == 0 && ((C0004e) f425a).f459d != this && f425a.f467j != 7 && C0013n.m409d(2)) {
                    this.f455b[7] = this.f455b[3] - 1;
                    C0013n c0013n = f425a;
                    if (((C0004e) c0013n).f454b < this.f454b) {
                        i = -1;
                    } else {
                        int i10 = this.f455b[3] * 2304;
                        if (((C0004e) c0013n).f450a <= this.f450a + i10 && ((C0004e) c0013n).f450a >= this.f450a - i10 && ((C0004e) c0013n).f454b <= this.f454b + i10 + 10240) {
                            c0013n.m202l(0);
                            if ((this.f506D & 1) != 0) {
                                f434c[0] = ((C0004e) c0013n).f450a - 5120;
                                f434c[2] = ((C0004e) c0013n).f450a;
                            } else {
                                f434c[0] = ((C0004e) c0013n).f450a;
                                f434c[2] = ((C0004e) c0013n).f450a + 5120;
                            }
                            int i11 = this.f455b[7] * 2304;
                            int i12 = this.f455b[6] >> 8;
                            int iM354b = (AbstractRunnableC0012m.m354b(i12) * i11) >> 8;
                            int iM363c = (AbstractRunnableC0012m.m363c(i12) * i11) >> 8;
                            if (iM354b > 0) {
                                this.f452a[0] = this.f450a - 1024;
                                this.f452a[2] = iM354b + this.f450a + 1024;
                            } else {
                                this.f452a[0] = (iM354b + this.f450a) - 1024;
                                this.f452a[2] = this.f450a + 1024;
                            }
                            this.f452a[1] = this.f454b;
                            this.f452a[3] = (i10 + (iM363c + this.f454b)) - i11;
                            if (m171a(f434c, this.f452a)) {
                                int iM363c2 = (((C0004e) c0013n).f454b - this.f454b) / ((AbstractRunnableC0012m.m363c(i12) * 2304) >> 8);
                                if (iM363c2 < 0) {
                                    iM363c2 = 0;
                                }
                                if (iM363c2 > this.f455b[3] - 2) {
                                    iM363c2 = this.f455b[3] - 2;
                                }
                                i = iM363c2 < 0 ? -1 : iM363c2 & 65534;
                            } else {
                                i = -1;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        this.f455b[7] = i;
                        ((C0004e) f425a).f459d = this;
                        this.f467j = 1;
                        m231b(f425a);
                        f425a.f467j = 7;
                        f425a.mo213a(81, 0);
                        m246k();
                    }
                } else if (this.f467j == 1) {
                    if (this.f455b[7] < this.f455b[3] - 1) {
                        int[] iArr2 = this.f455b;
                        iArr2[7] = iArr2[7] + 1;
                    }
                    m231b(f425a);
                    m246k();
                } else if (this.f467j == 2) {
                    int[] iArr3 = this.f455b;
                    iArr3[10] = iArr3[10] + 1;
                    if (this.f455b[10] > 5) {
                        this.f455b[10] = 0;
                        this.f467j = 0;
                    }
                }
                break;
            case 44:
                if (this.f460d && this.f467j != 4) {
                    switch (m278c() % 3) {
                        case 0:
                        case 2:
                            mo213a(this.f455b[0], 0);
                            break;
                        case 1:
                            mo213a(this.f455b[0] + 2, 0);
                            break;
                    }
                }
                switch (this.f467j) {
                    case 0:
                        mo213a(this.f455b[0], 0);
                        this.f467j = 1;
                        this.f506D &= -1073741825;
                        break;
                    case 1:
                        if (this.f455b[0] != 15 && this.f455b[0] != 21) {
                            int[] iArr4 = this.f455b;
                            iArr4[9] = iArr4[9] + 1;
                            if (this.f455b[9] > this.f455b[5]) {
                                this.f467j = 2;
                                this.f455b[9] = 0;
                            }
                        } else if (((C0004e) f425a).f459d == this) {
                            mo213a(16, 0);
                            this.f467j = 3;
                            this.f455b[9] = 0;
                        }
                        this.f470m = 0;
                        this.f469l = 0;
                        break;
                    case 2:
                        if (this.f455b[3] == 0) {
                            this.f470m = 0;
                            int i13 = this.f450a;
                            if (Math.abs(Math.abs(this.f450a - this.f455b[7]) - Math.abs(this.f455b[6])) <= this.f455b[4]) {
                                this.f467j = 1;
                                this.f450a = this.f455b[7] + this.f455b[6];
                                this.f455b[7] = this.f450a;
                                this.f455b[6] = -this.f455b[6];
                            } else {
                                this.f450a = (this.f455b[6] > 0 ? this.f455b[4] : -this.f455b[4]) + this.f450a;
                            }
                            this.f469l = this.f450a - i13;
                        } else if (this.f455b[3] == 1) {
                            this.f469l = 0;
                            int i14 = this.f454b;
                            if (Math.abs(Math.abs(this.f454b - this.f455b[8]) - Math.abs(this.f455b[6])) <= this.f455b[4]) {
                                this.f467j = 1;
                                this.f454b = this.f455b[8] + this.f455b[6];
                                this.f455b[8] = this.f454b;
                                this.f455b[6] = -this.f455b[6];
                            } else {
                                this.f454b = (this.f455b[6] > 0 ? this.f455b[4] : -this.f455b[4]) + this.f454b;
                            }
                            this.f470m = this.f454b - i14;
                        }
                        break;
                    case 3:
                        if (this.f460d || this.f450a < C0003d.f329c[0] + 10240 || this.f450a > C0003d.f329c[2] - 10240) {
                            if (((C0004e) f425a).f459d == this) {
                                ((C0004e) f425a).f459d = null;
                            }
                            m151a(49, 21, 0, this.f450a >> 8, this.f454b >> 8, 30, 0);
                            mo213a(26, 0);
                            this.f467j = 4;
                            this.f506D |= 1073741824;
                        }
                        break;
                    case 4:
                        if (!m167a(this.f450a, this.f454b, C0003d.f340d)) {
                            this.f467j = 0;
                        }
                        break;
                }
                if (((C0004e) f425a).f459d == this) {
                    ((C0004e) f425a).f450a += this.f469l;
                    ((C0004e) f425a).f454b += this.f470m;
                    f425a.m234b();
                }
                break;
            case 45:
                switch (this.f467j) {
                    case 1:
                        mo213a(1, 6);
                        this.f467j = 2;
                        break;
                    case 2:
                        if (m168a(f425a, this) || ((C0004e) f425a).f459d == this) {
                            this.f467j = 4;
                            ((C0004e) f425a).f459d = this;
                            f425a.f467j = 3;
                            C0013n.m410e(293872, -1);
                            f425a.m426b(false);
                            f425a.f469l = 0;
                            f425a.f470m = 0;
                            f425a.mo213a(160, 6);
                        }
                        break;
                    case 4:
                        if (f430b == null) {
                            this.f454b -= 1536;
                            ((C0004e) f425a).f454b -= 1536;
                        }
                        int[] iArr5 = this.f455b;
                        iArr5[3] = iArr5[3] + AbstractRunnableC0012m.f622a_;
                        ((C0004e) f425a).f455b[20] = 20000;
                        if (this.f455b[3] > this.f455b[0] * 1000 || C0003d.m83a(1038, true)) {
                            mo213a(2, 0);
                            this.f467j = 8;
                            C0013n.m422y();
                            ((C0004e) f425a).f459d = null;
                        }
                        break;
                    case 8:
                        if (m211a() == m283e() - 1) {
                            mo213a(0, 0);
                            this.f467j = 16;
                            this.f450a = this.f455b[1];
                            this.f454b = this.f455b[2];
                        }
                        break;
                    case 16:
                        if (m211a() == m283e() - 1) {
                            mo213a(1, 0);
                            this.f467j = 2;
                            this.f455b[3] = 0;
                        }
                        break;
                }
                break;
            case 48:
                if (m169a(f425a, this.f455b)) {
                    this.f455b[7] = 0;
                    for (int i15 = 0; i15 < C0003d.f405w; i15++) {
                        C0004e c0004e = C0003d.f210a[i15];
                        if ((c0004e.f462f == 65542 || c0004e.f462f == 67) && c0004e.f455b[16] == this.f463g) {
                            int[] iArr6 = this.f455b;
                            iArr6[7] = iArr6[7] + 1;
                        }
                    }
                }
                switch (this.f467j) {
                    case 0:
                        mo213a(0, 0);
                        if (m169a(f425a, this.f455b)) {
                            this.f455b[11] = 1;
                            this.f455b[6] = 0;
                            if (this.f455b[13] == 120 || this.f455b[15] != 1) {
                                for (int i16 = 0; i16 < C0003d.f405w; i16++) {
                                    C0004e c0004e2 = C0003d.f210a[i16];
                                    if ((c0004e2.f462f == 65542 || c0004e2.f462f == 67) && c0004e2.f455b[16] == this.f463g && c0004e2.f455b[17] == this.f455b[4]) {
                                        if (c0004e2.f455b[17] == this.f455b[4]) {
                                            this.f455b[6] = 1;
                                        }
                                        if (!c0004e2.m192g()) {
                                            if (c0004e2.f455b[21] <= 0 || c0004e2.f455b[21] >= 4 || this.f455b[15] != 0) {
                                                f441f = c0004e2;
                                                boolean z6 = (c0004e2.f506D & 1) == 0;
                                                if ((((C0004e) f425a).f450a - f441f.f450a < 0 && z6) || (((C0004e) f425a).f450a - f441f.f450a > 0 && !z6)) {
                                                    if (z6) {
                                                        f441f.m218a(true);
                                                    } else {
                                                        f441f.m218a(false);
                                                    }
                                                }
                                                if (f441f.f450a > ((C0004e) f425a).f450a - 7680 && f441f.f450a < ((C0004e) f425a).f450a + 7680) {
                                                    if (f441f.f450a > ((C0004e) f425a).f450a) {
                                                        f441f.f450a += 15360;
                                                    } else {
                                                        f441f.f450a -= 15360;
                                                    }
                                                }
                                                this.f450a = f441f.f450a;
                                                this.f454b = f441f.f454b - 5120;
                                                mo213a(0, 0);
                                                this.f467j = 1;
                                            } else {
                                                this.f455b[15] = 1;
                                            }
                                            break;
                                        }
                                    }
                                }
                                if (this.f455b[6] == 0) {
                                    int[] iArr7 = this.f455b;
                                    iArr7[4] = iArr7[4] + 1;
                                }
                                if (this.f455b[4] > this.f455b[5]) {
                                    this.f467j = 3;
                                }
                            }
                        } else {
                            this.f455b[11] = 0;
                        }
                        break;
                    case 1:
                        if (m211a() == m283e() - 1) {
                            mo213a(1, 0);
                            f441f.m235c();
                            f441f.f467j = 1024;
                            this.f467j = 2;
                        }
                        break;
                    case 2:
                        if (m211a() == m283e() - 1) {
                            this.f467j = 0;
                        }
                        break;
                    case 3:
                        int[] iArr8 = this.f455b;
                        iArr8[13] = iArr8[13] - 8;
                        f423K = 0;
                        if (this.f455b[13] <= 0 || this.f455b[15] != 1) {
                            C0003d.m96b(this);
                            f441f = null;
                        }
                        break;
                }
                break;
            case 49:
            case 1073741824:
                if (this.f460d) {
                    C0003d.m96b(this);
                }
                break;
            case 50:
                switch (this.f467j) {
                    case 0:
                    case 3:
                        if (m168a(f425a, this)) {
                            f425a.mo217a(this, 0);
                        }
                        break;
                    case 1:
                    case 2:
                        if (m168a(f425a, this) && f425a.f467j != 20) {
                            f425a.mo213a(80, 128);
                            f425a.m428d(20, 0);
                            ((C0004e) f425a).f459d = null;
                        }
                        break;
                }
                switch (this.f467j) {
                    case 0:
                        mo213a(0, 0);
                        if (m169a(f425a, this.f455b)) {
                            mo213a(1, 0);
                            this.f467j = 1;
                        }
                        break;
                    case 1:
                        if (this.f460d) {
                            mo213a(3, 6);
                            this.f467j = 2;
                            this.f506D |= Integer.MIN_VALUE;
                        }
                        break;
                    case 2:
                        if (m167a(this.f450a, this.f454b, C0003d.f340d)) {
                            C0003d.m68a(1, 1, 3);
                        }
                        if ((this.f506D & 1) != 0) {
                            this.f469l -= 1024;
                        } else {
                            this.f469l += 1024;
                        }
                        this.f470m += 512;
                        int i17 = C0003d.m82a(C0003d.f402v) ? 3242 : 6656;
                        if (m167a(this.f450a, this.f454b, C0003d.f329c)) {
                            if (this.f469l > (i17 * 5) / 10) {
                                this.f469l = (i17 * 5) / 10;
                            } else if (this.f469l < (-((i17 * 5) / 10))) {
                                this.f469l = -((i17 * 5) / 10);
                            }
                        } else if (this.f469l > (i17 * 15) / 10) {
                            this.f469l = (i17 * 15) / 10;
                        } else if (this.f469l < (-((i17 * 15) / 10))) {
                            this.f469l = -((i17 * 15) / 10);
                        }
                        if (AbstractRunnableC0012m.m371d(this.f469l) > 810) {
                            mo213a(4, 6);
                        }
                        m193h();
                        if (this.f473u >= 0 && this.f474v >= 0) {
                            int iM183c = m183c(this.f473u, this.f474v);
                            boolean z7 = (this.f506D & 1) == 0;
                            switch (iM183c) {
                                case 1:
                                case 3:
                                    if (!this.f451a) {
                                        z7 = !z7;
                                    }
                                    break;
                                case 2:
                                case 4:
                                    if (this.f451a) {
                                        z7 = !z7;
                                    }
                                    break;
                            }
                            this.f451a = z7;
                        }
                        m218a(!this.f451a);
                        m228b(this.f477y, 0);
                        if (this.f473u == -1) {
                            this.f450a += this.f469l;
                            this.f454b += this.f470m;
                        }
                        m242g();
                        m238d();
                        break;
                    case 3:
                        mo213a(0, 0);
                        break;
                }
                break;
            case 51:
                switch (this.f467j) {
                    case 0:
                        mo213a(this.f455b[1], 0);
                        if (m168a(this, f425a)) {
                            mo213a(this.f455b[1] + 1, 128);
                            this.f467j = 1;
                            C0003d.m91b();
                        }
                        break;
                    case 1:
                        if (this.f460d) {
                            mo213a(this.f455b[1] + 2, 128);
                            this.f467j = 2;
                        }
                        break;
                }
                break;
            case 52:
                switch (this.f467j) {
                    case 0:
                        mo213a(3, 0);
                        if (m180b(f425a, this)) {
                            mo213a(4, 0);
                            this.f467j = 1;
                        }
                        break;
                    case 1:
                        if (this.f460d) {
                            f425a.m427b(this.f450a, this.f454b, 54);
                            this.f467j = 2;
                        }
                        break;
                    case 2:
                        C0003d.m96b(this);
                        break;
                }
                break;
            case 53:
                m234b();
                int[] iArr9 = new int[4];
                int i18 = this.f469l;
                int i19 = this.f470m;
                switch (this.f467j) {
                    case 0:
                        if (this.f455b[4] == 1) {
                            this.f469l = this.f455b[6];
                            this.f470m = 0;
                        } else {
                            this.f469l = 0;
                            this.f470m = this.f455b[6];
                        }
                        mo213a(0, 6);
                        this.f467j = 1;
                        break;
                    case 1:
                        this.f450a += this.f469l;
                        this.f454b += this.f470m;
                        int i20 = this.f450a;
                        int i21 = this.f454b;
                        iArr9[0] = this.f450a + this.f452a[0];
                        iArr9[1] = this.f454b + this.f452a[1];
                        iArr9[2] = this.f450a + this.f452a[2];
                        iArr9[3] = this.f454b + this.f452a[3];
                        if (this.f455b[4] == 1) {
                            if (iArr9[0] <= this.f455b[0]) {
                                this.f450a = this.f455b[0] - this.f452a[0];
                                i18 = this.f469l - (i20 - this.f450a);
                                this.f469l = -this.f469l;
                            } else if (iArr9[2] >= this.f455b[2]) {
                                this.f450a = this.f455b[2] - this.f452a[2];
                                i18 = this.f469l - (i20 - this.f450a);
                                this.f469l = -this.f469l;
                            }
                        } else if (iArr9[1] <= this.f455b[1]) {
                            this.f454b = this.f455b[1] - this.f452a[1];
                            i19 = this.f470m - (i21 - this.f454b);
                            this.f470m = -(this.f470m << 2);
                            mo213a(1, 6);
                            this.f467j = 2;
                        } else if (iArr9[3] >= this.f455b[3]) {
                            this.f454b = this.f455b[3] - this.f452a[3];
                            i19 = this.f470m - (i21 - this.f454b);
                            if (this.f455b[6] > 0) {
                                this.f470m = -this.f455b[6];
                            } else {
                                this.f470m = this.f455b[6];
                            }
                            C0003d.m68a(3, 3, 3);
                        }
                        break;
                    case 2:
                        if (this.f460d) {
                            mo213a(0, 6);
                            this.f467j = 1;
                        }
                        break;
                }
                if (((C0004e) f425a).f459d == this && ((C0004e) f425a).f453a[0][0] == 0) {
                    C0013n c0013n2 = f425a;
                    ((C0004e) c0013n2).f450a = i18 + ((C0004e) c0013n2).f450a;
                    C0013n c0013n3 = f425a;
                    ((C0004e) c0013n3).f454b = i19 + ((C0004e) c0013n3).f454b;
                    f425a.m234b();
                }
                int[] iArr10 = new int[4];
                int[] iArr11 = new int[4];
                if (this.f455b[4] != 1) {
                    iArr10[0] = this.f455b[0];
                    iArr10[1] = this.f455b[1];
                    iArr10[2] = this.f455b[2];
                    iArr10[3] = this.f454b + this.f452a[1];
                    iArr11[0] = this.f455b[0];
                    iArr11[1] = this.f454b + this.f452a[3];
                    iArr11[2] = this.f455b[2];
                    iArr11[3] = this.f455b[3];
                    if ((m169a(f425a, iArr10) && iArr10[3] - iArr10[1] <= 7680) || (m169a(f425a, iArr11) && iArr11[3] - iArr11[1] <= 7680)) {
                        f425a.mo213a(80, 128);
                        f425a.m428d(20, 0);
                        ((C0004e) f425a).f459d = null;
                        C0003d.m70a(1, 17, false);
                        break;
                    }
                } else {
                    iArr10[0] = this.f455b[0];
                    iArr10[1] = this.f455b[1];
                    iArr10[2] = this.f450a + this.f452a[0];
                    iArr10[3] = this.f455b[3];
                    iArr11[0] = this.f450a + this.f452a[2];
                    iArr11[1] = this.f455b[1];
                    iArr11[2] = this.f455b[2];
                    iArr11[3] = this.f455b[3];
                    if ((m169a(f425a, iArr10) && ((C0004e) f425a).f459d != this && iArr10[2] - iArr10[0] <= 2560) || (m169a(f425a, iArr11) && ((C0004e) f425a).f459d != this && iArr11[2] - iArr11[0] <= 2560)) {
                        f425a.mo213a(80, 128);
                        f425a.m428d(20, 0);
                        ((C0004e) f425a).f459d = null;
                        C0003d.m70a(1, 17, false);
                        break;
                    }
                }
                break;
            case 54:
                switch (this.f467j) {
                    case 0:
                        mo213a(this.f455b[1], 0);
                        this.f467j = 2;
                        break;
                    case 2:
                        if (m168a(this, f425a)) {
                            f425a.mo217a(this, 3);
                        }
                        break;
                }
                break;
            case 55:
                if (!C0003d.f338d) {
                    if ((C0003d.f375m * C0003d.f369k) / C0003d.f362i > (C0003d.f369k * 20) - C0003d.f355g) {
                        this.f455b[21] = ((237 - ((C0003d.f369k * 20) - C0003d.f355g)) + C0003d.f375m) << 8;
                        this.f455b[22] = ((363 - ((C0003d.f369k * 20) - C0003d.f355g)) + C0003d.f375m) << 8;
                    } else {
                        this.f455b[21] = ((237 - ((C0003d.f375m * C0003d.f369k) / C0003d.f362i)) + C0003d.f375m) << 8;
                        this.f455b[22] = ((363 - ((C0003d.f375m * C0003d.f369k) / C0003d.f362i)) + C0003d.f375m) << 8;
                    }
                    switch (this.f467j) {
                        case 0:
                            mo213a(0, 128);
                            if (m278c() == 0 && this.f460d) {
                                this.f467j = 13;
                                this.f455b[10] = 19;
                            }
                            break;
                        case 1:
                            int i22 = this.f455b[1] > 1 ? 30 : 48;
                            this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                            if (m278c() == i22 && this.f460d) {
                                this.f467j = 13;
                                this.f455b[10] = 2;
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 17:
                            this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                            switch (this.f467j) {
                                case 2:
                                    mo213a(this.f455b[1] > 1 ? 3 : 43, 128);
                                    this.f467j = 3;
                                    break;
                                case 3:
                                    int i23 = this.f455b[1] > 1 ? 3 : 43;
                                    int i24 = this.f455b[1] > 1 ? 4 : 44;
                                    if (m278c() == i23 && this.f460d) {
                                        this.f467j = 17;
                                        mo213a(i24, 128);
                                        this.f455b[15] = 0;
                                        f436d = new int[15];
                                    }
                                    break;
                                case 5:
                                    this.f467j = 13;
                                    this.f455b[10] = 27;
                                    break;
                                case 17:
                                    if (this.f455b[15] <= 40) {
                                        this.f455b[16] = ((((C0004e) f425a).f450a - (C0003d.f375m << 8)) - (f425a.f469l << 1)) >> 8;
                                        this.f455b[17] = (((C0004e) f425a).f454b - 6400) >> 8;
                                        if (this.f455b[15] % 8 == 0 && this.f455b[15] != 0) {
                                            f436d[((this.f455b[15] / 8) - 1) * 3] = ((C0004e) f425a).f450a;
                                            f436d[(((this.f455b[15] / 8) - 1) * 3) + 1] = ((C0004e) f425a).f454b - 6400;
                                            f436d[(((this.f455b[15] / 8) - 1) * 3) + 2] = 9;
                                        }
                                        int[] iArr12 = this.f455b;
                                        iArr12[15] = iArr12[15] + 1;
                                    } else {
                                        this.f467j = 4;
                                        this.f455b[15] = 0;
                                        f426a = new C0004e[5];
                                        int i25 = 0;
                                        while (true) {
                                            int i26 = i25;
                                            if (i26 < 5) {
                                                C0004e c0004e3 = new C0004e(58, 30, f436d[i26 * 3] >> 8, -50, new short[]{18, (short) i26});
                                                c0004e3.f472o = 4;
                                                c0004e3.m235c();
                                                c0004e3.f506D |= 8388608;
                                                c0004e3.f506D |= 1073741824;
                                                f426a[i26] = c0004e3;
                                                i25 = i26 + 1;
                                            }
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 12:
                            if (f438e.m278c() == 57 && f438e.f460d) {
                                C0003d.m114f();
                            }
                            break;
                        case 13:
                            this.f467j = this.f455b[10];
                            switch (this.f467j) {
                                case 1:
                                    mo213a(this.f455b[1] > 1 ? 30 : 48, 0);
                                    this.f470m = 0;
                                    this.f469l = 0;
                                    this.f455b[2] = 0;
                                    this.f454b = 48640;
                                    this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                                    f438e.f467j = 1;
                                    f438e.f455b[1] = -1;
                                    this.f455b[23] = 1;
                                    break;
                                case 2:
                                    this.f455b[23] = 1;
                                    break;
                                case 19:
                                    mo213a(23, 0);
                                    this.f469l = 1024;
                                    this.f454b = 59392;
                                    this.f470m = 0;
                                    f438e.f450a = 45312;
                                    f438e.f454b = 34816;
                                    f438e.f455b[1] = 2;
                                    f438e.mo213a(15, 0);
                                    f438e.f469l = 2560;
                                    f438e.f470m = 0;
                                    break;
                                case 20:
                                    this.f455b[23] = 2;
                                    mo213a(this.f455b[1] > 1 ? 7 : 45, 128);
                                    this.f454b = 48640;
                                    this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                                    break;
                                case 27:
                                    if (this.f455b[25] == 0 && this.f455b[1] == 1) {
                                        this.f467j = 28;
                                        this.f455b[24] = C0003d.f375m << 8;
                                        C0003d.m96b(C0003d.f201a);
                                        mo213a(3, 0);
                                        f438e.f467j = 1;
                                        f438e.f455b[1] = -1;
                                        C0003d.f387q = 1980;
                                        if (f426a != null) {
                                            for (int i27 = 0; i27 < 2; i27++) {
                                                f426a[i27].f467j = 2;
                                                C0003d.m96b(f426a[i27]);
                                            }
                                            f426a = null;
                                        }
                                        this.f471n &= -386;
                                        this.f455b[25] = 1;
                                        this.f455b[26] = 0;
                                    } else {
                                        if (this.f455b[23] == 1) {
                                            this.f467j = 13;
                                            this.f455b[10] = 20;
                                        } else if (this.f455b[23] == 2) {
                                            this.f467j = 13;
                                            this.f455b[10] = 1;
                                        }
                                        if ((this.f506D & 1) != 0) {
                                            this.f506D ^= 1;
                                        }
                                    }
                                    break;
                            }
                            break;
                        case 19:
                            if (m211a() == 1 || m211a() == 2 || m211a() == 3 || m211a() == 4) {
                                this.f469l = 0;
                            } else {
                                this.f469l += 512;
                                if (this.f469l > 3584) {
                                    this.f469l = 3584;
                                }
                            }
                            this.f454b += this.f470m;
                            this.f450a += this.f469l;
                            if (this.f450a < C0003d.f329c[0]) {
                                this.f450a = C0003d.f329c[0];
                            }
                            if (m211a() == 4) {
                                C0003d.m68a(3, 3, 3);
                            }
                            if (m168a(this, f425a)) {
                                f425a.mo217a(this, 5);
                            }
                            if (this.f450a >= 438528) {
                                this.f450a = 438528;
                                this.f470m = 0;
                                this.f469l = 0;
                                f438e.f450a = 438528;
                                f438e.f469l = 0;
                                if (C0003d.f201a != null) {
                                    this.f467j = 13;
                                    this.f455b[10] = 1;
                                }
                            }
                            break;
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 32:
                        case 33:
                        case 34:
                            int i28 = this.f455b[1] > 1 ? 7 : 45;
                            int i29 = this.f455b[1] > 1 ? 8 : 46;
                            switch (this.f467j) {
                                case 20:
                                    this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                                    if (m278c() == i28 && this.f460d) {
                                        this.f467j = 21;
                                        this.f455b[7] = this.f450a >> 8;
                                        this.f455b[8] = 151;
                                    }
                                    break;
                                case 21:
                                    this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                                    if (m278c() != i29) {
                                        int[] iArr13 = this.f455b;
                                        iArr13[7] = iArr13[7] - 12;
                                        if (this.f455b[7] < (C0003d.f329c[0] >> 8) - 30) {
                                            mo213a(i29, 128);
                                        }
                                    }
                                    if (m278c() == i29 && this.f460d) {
                                        this.f467j = 22;
                                        if (this.f455b[25] == 0) {
                                            this.f455b[7] = (this.f450a >> 8) - 27;
                                        } else {
                                            this.f455b[7] = (this.f450a >> 8) + 27;
                                        }
                                        this.f455b[8] = 160;
                                    }
                                    break;
                                case 22:
                                    this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                                    if (this.f455b[25] == 0) {
                                        int[] iArr14 = this.f455b;
                                        iArr14[7] = iArr14[7] - 12;
                                    } else {
                                        int[] iArr15 = this.f455b;
                                        iArr15[7] = iArr15[7] + 12;
                                    }
                                    if (this.f455b[7] < (C0003d.f329c[0] >> 8) - 30 || this.f455b[7] > (C0003d.f329c[2] >> 8) + 30) {
                                        this.f467j = 23;
                                        mo213a(10, 0);
                                        this.f450a = C0003d.f329c[0] - 7680;
                                        this.f454b = this.f455b[1] > 1 ? 34560 : 15360;
                                        this.f469l = 6144;
                                        this.f455b[9] = 0;
                                        this.f470m = 0;
                                        f438e.f455b[1] = 3;
                                        int i30 = this.f455b[1] > 3 ? 15 : 37;
                                        if (this.f455b[1] <= 1) {
                                            i30 = 38;
                                        }
                                        f438e.mo213a(i30, 0);
                                        f438e.f450a = C0003d.f329c[0] - 30720;
                                        f438e.f454b = this.f455b[1] > 1 ? 15360 : 34560;
                                        f438e.f469l = 1280;
                                        f438e.f470m = 0;
                                    }
                                    break;
                                case 23:
                                    if (this.f455b[9] < 40) {
                                        this.f454b += this.f470m;
                                        this.f450a += this.f469l;
                                        int i31 = ((C0004e) f425a).f450a - this.f450a;
                                        int i32 = ((C0004e) f425a).f454b - this.f454b;
                                        if ((i31 > 0 && (this.f506D & 1) != 0) || (i31 < 0 && (this.f506D & 1) == 0)) {
                                            this.f506D ^= 1;
                                        }
                                        this.f469l = (i31 * 6144) / m148a(i31, i32);
                                        int[] iArr16 = this.f455b;
                                        iArr16[9] = iArr16[9] + 1;
                                    } else {
                                        mo213a(36, 128);
                                        if (m278c() == 36 && this.f460d) {
                                            this.f455b[9] = 0;
                                            this.f467j = 24;
                                            this.f469l = 0;
                                            this.f470m = 6144;
                                            this.f471n |= 385;
                                        }
                                    }
                                    break;
                                case 24:
                                    this.f454b += this.f470m;
                                    this.f450a += this.f469l;
                                    if (m168a(this, f425a)) {
                                        f425a.mo217a(this, 0);
                                    }
                                    if (this.f454b + this.f452a[3] >= 71680) {
                                        this.f454b = 71680 - this.f452a[3];
                                        this.f467j = 25;
                                        mo213a(11, 128);
                                        this.f469l = 0;
                                        this.f470m = 0;
                                        C0003d.m68a(3, 3, 3);
                                        if (this.f455b[1] > 1) {
                                            if (f438e.f450a < this.f450a - 17920) {
                                                f438e.f469l = (((this.f450a - 17920) - f438e.f450a) << 9) / (this.f455b[1] > 1 ? 34560 : 15360 - f438e.f454b);
                                            } else if (f438e.f450a > this.f450a + 17920) {
                                                f438e.f469l = ((f438e.f450a - (this.f450a + 17920)) << 9) / (this.f455b[1] > 1 ? 34560 : 15360 - f438e.f454b);
                                            } else {
                                                f438e.f469l = 0;
                                            }
                                        }
                                    }
                                    break;
                                case 25:
                                    if (m278c() == 11 && this.f460d) {
                                        f426a = new C0004e[2];
                                        int i33 = 0;
                                        while (true) {
                                            int i34 = i33;
                                            if (i34 < 2) {
                                                C0004e c0004e4 = new C0004e(59, 30, (f430b.f450a + (i34 == 0 ? 13824 : -13824)) >> 8, 280, new short[]{(short) (i34 + 13), (short) i34});
                                                c0004e4.m235c();
                                                c0004e4.f506D |= 8388608;
                                                c0004e4.f506D |= 1073741824;
                                                c0004e4.f461e = 19;
                                                f426a[i34] = c0004e4;
                                                i33 = i34 + 1;
                                            } else {
                                                mo213a(12, 128);
                                            }
                                        }
                                    }
                                    if (m278c() == 12 && this.f460d) {
                                        this.f467j = 26;
                                        mo213a(10, 0);
                                        this.f469l = 0;
                                        this.f470m = -2048;
                                        int i35 = this.f455b[1] > 3 ? 15 : 37;
                                        if (this.f455b[1] <= 1) {
                                            i35 = 38;
                                        }
                                        f438e.mo213a(i35, 0);
                                        f438e.f469l = 2560;
                                        f438e.f470m = 0;
                                        this.f471n &= -386;
                                        ((C0004e) f425a).f459d = null;
                                    }
                                    break;
                                case 26:
                                    if (this.f455b[1] != 1 || this.f455b[25] != 0) {
                                        this.f450a += this.f469l;
                                        this.f454b += this.f470m;
                                    }
                                    f438e.f450a += f438e.f469l;
                                    f438e.f454b += f438e.f470m;
                                    if (this.f454b <= 35840) {
                                        this.f469l = 2560;
                                        this.f470m = 0;
                                    }
                                    if (!((this.f455b[1] == 1 && this.f455b[25] == 0) ? m169a(f438e, C0003d.f329c) : m169a(this, C0003d.f329c))) {
                                        this.f467j = 13;
                                        this.f455b[10] = 27;
                                        mo213a(35, 0);
                                        this.f454b = 51456;
                                        this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                                        if ((this.f506D & 1) != 0) {
                                            this.f506D ^= 1;
                                        }
                                    }
                                    break;
                                case 32:
                                    this.f450a += this.f469l;
                                    this.f454b += this.f470m;
                                    if (m168a(this, f438e) && f438e.m278c() == 38) {
                                        f438e.mo213a(56, 128);
                                        m151a(1073741824, 7, 5, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, 0);
                                    }
                                    if (f438e.m278c() == 56 && f438e.f460d) {
                                        f438e.mo213a(50, 0);
                                    }
                                    if (this.f470m == 0) {
                                        if (m278c() == 12 && this.f460d) {
                                            this.f467j = 33;
                                            mo213a(10, 0);
                                            this.f470m = 2048;
                                            this.f469l = 0;
                                            f438e.mo213a(38, 0);
                                            f438e.f470m = 0;
                                            f438e.f469l = 2560;
                                        } else {
                                            if (m168a(this, f425a) && f425a.m278c() == 6) {
                                                mo213a(36, 128);
                                                m151a(1073741824, 7, 5, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, 0);
                                            }
                                            if (m278c() == 36 && this.f460d) {
                                                this.f467j = 34;
                                                mo213a(10, 0);
                                                this.f469l = 0;
                                                this.f470m = 0;
                                            }
                                        }
                                    }
                                    break;
                                case 33:
                                    this.f450a += this.f469l;
                                    this.f454b += this.f470m;
                                    f438e.f450a += f438e.f469l;
                                    f438e.f454b += f438e.f470m;
                                    if (this.f454b >= 35840) {
                                        this.f469l = 2560;
                                        this.f470m = 0;
                                    }
                                    if (!m169a(this, C0003d.f329c)) {
                                        this.f467j = 13;
                                        this.f455b[10] = 27;
                                        mo213a(35, 0);
                                        this.f454b = 51456;
                                        this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                                        if ((this.f506D & 1) != 0) {
                                            this.f506D ^= 1;
                                        }
                                    }
                                    break;
                                case 34:
                                    this.f450a += this.f469l;
                                    this.f454b += this.f470m;
                                    this.f470m += 1024;
                                    if (m168a(this, f438e)) {
                                        int[] iArr17 = this.f455b;
                                        iArr17[1] = iArr17[1] - 1;
                                        f438e.f467j = 5;
                                        f438e.mo213a(57, 128);
                                        m151a(49, 21, 1, f438e.f450a >> 8, f438e.f454b >> 8, 30, 0);
                                    }
                                    m242g();
                                    if (m238d()) {
                                        this.f469l = 0;
                                        this.f470m = 0;
                                    }
                                    break;
                            }
                            break;
                        case 28:
                            this.f450a = (this.f455b[21] + this.f455b[22]) / 2;
                            this.f454b = 48640;
                            if (C0003d.f344e % 8 == 0 && this.f455b[24] < 1024000) {
                                C0004e c0004e5 = new C0004e(58, 30, this.f455b[24] >> 8, 0, new short[]{18, -1});
                                c0004e5.m235c();
                                c0004e5.f472o = 82;
                            }
                            int[] iArr18 = this.f455b;
                            iArr18[24] = iArr18[24] + 2048;
                            if (f425a.f469l == 0 && this.f455b[24] < C0003d.f329c[0]) {
                                this.f455b[24] = C0003d.f329c[0];
                            }
                            if (C0003d.f201a != null) {
                                this.f467j = 13;
                                this.f455b[10] = 1;
                            }
                            if (((C0004e) f425a).f450a < (C0003d.f387q << 8) + 7680) {
                                ((C0004e) f425a).f450a = (C0003d.f387q << 8) + 7680;
                                f425a.f469l = 0;
                            }
                            break;
                    }
                    if (this.f467j == 1 || this.f467j == 2 || this.f467j == 3 || this.f467j == 17 || this.f467j == 4 || this.f467j == 5 || this.f467j == 28 || this.f467j == 20 || this.f467j == 21 || this.f467j == 22 || this.f467j == 27 || this.f467j == 13) {
                        this.f461e = -11;
                        f438e.f461e = -11;
                    } else {
                        this.f461e = 19;
                        f438e.f461e = 19;
                    }
                }
                break;
            case 56:
                switch (this.f467j) {
                    case 0:
                        mo213a(this.f455b[1], 0);
                        this.f467j = 1;
                        break;
                    case 1:
                        if (m168a(this, f425a) && (f425a.m278c() == 4 || f425a.m278c() == 6 || f425a.m278c() == 226 || f425a.m278c() == 230)) {
                            mo217a((C0004e) f425a, 0);
                            break;
                        } else if (this.f460d && m278c() == 1) {
                            this.f467j = 3;
                            mo213a(0, 0);
                            break;
                        }
                        break;
                    case 3:
                        if (!m167a(this.f450a, this.f454b, C0003d.f340d)) {
                            this.f467j = 0;
                            for (int i36 = 0; i36 < C0003d.f405w; i36++) {
                                if (this.f455b[3] == C0003d.f210a[i36].f463g) {
                                    C0003d.f210a[i36].f506D &= -8388609;
                                }
                            }
                        }
                        break;
                }
                break;
            case 58:
                if (m168a(this, f425a)) {
                    f425a.mo217a(this, 0);
                }
                switch (this.f467j) {
                    case 1:
                        if (this.f455b[1] != -1) {
                            this.f467j = 2;
                        } else {
                            this.f467j = 4;
                        }
                        break;
                    case 2:
                        if (f430b.f467j == 4) {
                            this.f467j = 4;
                        }
                        break;
                    case 4:
                        mo213a(this.f455b[0], 0);
                        this.f506D &= -8388609;
                        this.f469l = 0;
                        this.f470m = 6144;
                        this.f467j = 8;
                        break;
                    case 8:
                        this.f454b += this.f470m;
                        this.f450a += this.f469l;
                        if (this.f455b[1] == -1) {
                            m242g();
                            if (m238d()) {
                                this.f467j = 16;
                                mo213a(24, 128);
                                this.f469l = 0;
                                this.f470m = 0;
                                m151a(49, 21, 3, this.f450a >> 8, (this.f454b >> 8) + 20, 30, 0);
                            }
                        } else if (this.f454b >= f436d[(this.f455b[1] * 3) + 1]) {
                            this.f467j = 16;
                            mo213a(24, 128);
                            this.f454b = f436d[(this.f455b[1] * 3) + 1];
                            m151a(49, 21, 3, this.f450a >> 8, (this.f454b >> 8) + 20, 30, 0);
                        }
                        break;
                    case 16:
                        if (m278c() == 24 && this.f460d) {
                            this.f467j = 32;
                            if (this.f455b[1] == -1) {
                                C0004e c0004e6 = new C0004e(54, 28, this.f450a >> 8, (this.f454b >> 8) + 20, new short[]{0, 3, 0});
                                c0004e6.m235c();
                                c0004e6.f467j = 0;
                            }
                            break;
                        }
                        break;
                    case 32:
                        if (this.f455b[1] == -1) {
                            C0003d.m96b(this);
                        } else {
                            this.f467j = 64;
                            this.f506D |= 8388608;
                            this.f450a = 0;
                            this.f454b = 0;
                            boolean z8 = true;
                            for (int i37 = 0; i37 < 5; i37++) {
                                if (f426a[i37].f467j != 64) {
                                    z8 = false;
                                    if (z8) {
                                        f430b.f467j = 5;
                                        for (i5 = 0; i5 < 5; i5++) {
                                            C0003d.m96b(f426a[i5]);
                                        }
                                        f426a = null;
                                    }
                                }
                                break;
                            }
                            if (z8) {
                                f430b.f467j = 5;
                                while (i5 < 5) {
                                    C0003d.m96b(f426a[i5]);
                                }
                                f426a = null;
                            }
                        }
                        break;
                }
                break;
            case 59:
                switch (this.f467j) {
                    case 1:
                        this.f467j = 2;
                        break;
                    case 2:
                        if (f430b.f467j == 25) {
                            this.f467j = 4;
                        }
                        break;
                    case 4:
                        mo213a(this.f455b[0], 0);
                        this.f506D &= -8388609;
                        this.f469l = (this.f455b[1] == 0 ? 1 : -1) * 2048;
                        this.f470m = 0;
                        this.f467j = 8;
                        break;
                    case 8:
                        this.f454b += this.f470m;
                        this.f450a += this.f469l;
                        if (m168a(this, f425a)) {
                            f425a.mo217a(this, 0);
                        }
                        if (C0003d.f201a != null && !m169a(this, C0003d.f201a.f452a)) {
                            this.f467j = 32;
                            break;
                        }
                        break;
                    case 32:
                        this.f467j = 64;
                        this.f506D |= 8388608;
                        this.f469l = 0;
                        this.f470m = 0;
                        break;
                }
                break;
            case 60:
                switch (this.f467j) {
                    case 0:
                        this.f467j = 1;
                        break;
                    case 1:
                        if (this.f455b[1] == -1) {
                            this.f506D |= 8388608;
                        } else {
                            this.f506D &= -8388609;
                            this.f467j = this.f455b[1];
                            this.f455b[1] = -1;
                        }
                        break;
                    case 2:
                        this.f450a = f430b.f450a;
                        break;
                    case 3:
                        switch (f430b.f467j) {
                            case 23:
                                this.f450a += this.f469l;
                                if (this.f450a < f430b.f450a - 17920) {
                                    this.f469l = 1280;
                                } else if (this.f450a > f430b.f450a + 17920) {
                                    this.f469l -= 1280;
                                } else {
                                    this.f469l = ((f430b.f450a - this.f450a) * 1280) / 17920;
                                }
                                break;
                            case 25:
                                if (f430b.f455b[25] == 0) {
                                    if (this.f454b < 34560) {
                                        this.f454b += 512;
                                        this.f450a += this.f469l;
                                    } else {
                                        this.f454b = 34560;
                                        if (m278c() == 15 || m278c() == 37) {
                                            mo213a(49, 0);
                                        }
                                        this.f470m = 0;
                                        this.f469l = 0;
                                    }
                                    int i38 = f430b.f455b[1] > 3 ? 15 : 37;
                                    if (m168a(this, f425a) && (m278c() == i38 || m278c() == 49)) {
                                        f430b.mo217a((C0004e) f425a, 0);
                                        m151a(1073741824, 7, 5, this.f450a >> 8, (this.f454b >> 8) + 4, this.f461e + 1, 0);
                                    }
                                    if ((m278c() == 19 || m278c() == 39) && this.f460d) {
                                        mo213a(i38, 0);
                                        f430b.mo213a(10, 0);
                                        f430b.f467j = 26;
                                        f430b.f471n &= -386;
                                        ((C0004e) f425a).f459d = null;
                                        this.f469l = 2560;
                                        this.f470m = 0;
                                        f430b.f469l = 0;
                                        f430b.f470m = -2048;
                                        this.f467j = 4;
                                    }
                                } else if (m168a(this, f425a)) {
                                    if (((C0004e) f425a).f450a + ((C0004e) f425a).f452a[0] < this.f450a + this.f452a[0] || ((C0004e) f425a).f450a + ((C0004e) f425a).f452a[2] > this.f450a + this.f452a[2]) {
                                        f425a.f469l = -f425a.f469l;
                                        if (((C0004e) f425a).f450a + ((C0004e) f425a).f452a[0] < this.f450a + this.f452a[0]) {
                                            ((C0004e) f425a).f450a = (this.f450a + this.f452a[0]) - ((C0004e) f425a).f452a[2];
                                        }
                                        if (((C0004e) f425a).f450a + ((C0004e) f425a).f452a[2] > this.f450a + this.f452a[2]) {
                                            ((C0004e) f425a).f450a = (this.f450a + this.f452a[2]) - ((C0004e) f425a).f452a[0];
                                        }
                                    } else {
                                        f425a.f470m = -f425a.f470m;
                                        ((C0004e) f425a).f454b = (this.f454b + this.f452a[3]) - ((C0004e) f425a).f452a[1];
                                    }
                                }
                                break;
                        }
                        break;
                    case 5:
                        if (m278c() == 57 && this.f460d) {
                            f430b.f467j = 12;
                            break;
                        }
                        break;
                }
                break;
            case 61:
                m210s();
                if ((C0003d.f375m * C0003d.f369k) / C0003d.f362i > (C0003d.f369k * 20) - C0003d.f355g) {
                    this.f450a = ((this.f455b[2] - ((C0003d.f369k * 20) - C0003d.f355g)) + C0003d.f375m) << 8;
                    this.f454b = ((this.f455b[3] - ((C0003d.f378n * C0003d.f372l) / C0003d.f366j)) + C0003d.f378n) << 8;
                } else {
                    this.f450a = ((this.f455b[2] - ((C0003d.f375m * C0003d.f369k) / C0003d.f362i)) + C0003d.f375m) << 8;
                    this.f454b = ((this.f455b[3] - ((C0003d.f378n * C0003d.f372l) / C0003d.f366j)) + C0003d.f378n) << 8;
                }
                break;
            case 62:
                switch (this.f467j) {
                    case 0:
                        mo213a(this.f455b[1], 0);
                        this.f467j = 1;
                        break;
                    case 1:
                        switch (this.f455b[1]) {
                            case 0:
                                if (f430b.f467j == 32) {
                                    this.f467j = 2;
                                    f430b.f470m = -3072;
                                    if (f430b.f450a == this.f450a) {
                                        f430b.f469l = 0;
                                    } else {
                                        f430b.f469l = ((this.f450a - f430b.f450a) * f430b.f470m) / (this.f454b - f430b.f454b);
                                    }
                                    f430b.f471n &= -386;
                                }
                                break;
                            case 1:
                                if (m168a(this, f425a) && m278c() == 1 && f430b.f467j == 25) {
                                    f430b.f467j = 32;
                                    mo213a(2, 128);
                                    this.f467j = 2;
                                    f430b.mo213a(10, 0);
                                    break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (this.f455b[1]) {
                            case 0:
                                if (f430b.f467j == 32 && m168a(this, f430b) && f430b.f470m != 0) {
                                    f430b.f469l = 0;
                                    f430b.f470m = 0;
                                    C0003d.m96b(C0003d.f201a);
                                    f430b.mo213a(12, 128);
                                }
                                if (f430b.f467j == 33) {
                                    this.f467j = 1;
                                }
                                if (f430b.f467j == 32 && f438e.m278c() != 56) {
                                    if (f438e.f450a < this.f450a - 2560) {
                                        f438e.f450a += 1280;
                                    }
                                    if (f438e.f450a > this.f450a + 2560) {
                                        f438e.f450a -= 1280;
                                    }
                                    break;
                                }
                                break;
                            case 1:
                                if (f430b.f467j == 33) {
                                    this.f467j = 1;
                                    mo213a(1, 0);
                                }
                                break;
                        }
                        break;
                }
                break;
            case 63:
                switch (this.f467j) {
                    case 0:
                        mo213a(1, 0);
                        this.f467j = 1;
                        break;
                    case 1:
                        if (this.f460d) {
                            if (C0003d.f212a[4] != null) {
                                new C0004e(64, 4, this.f450a >> 8, C0003d.f329c[1] >> 8, new short[]{(short) (this.f454b >> 8)}).m235c();
                            }
                            int[] iArr19 = this.f455b;
                            iArr19[0] = iArr19[0] - 1;
                            if (this.f455b[0] > 0) {
                                this.f450a = ((C0004e) f425a).f450a;
                                this.f454b = ((C0004e) f425a).f454b;
                                this.f467j = 0;
                            } else {
                                C0003d.m96b(this);
                            }
                        }
                        break;
                }
                break;
            case 64:
                switch (this.f467j) {
                    case 0:
                        mo213a(99, 14);
                        this.f467j = 1;
                        break;
                    case 1:
                        this.f454b += 6144;
                        if (m168a(this, f425a) || this.f454b >= (this.f455b[0] << 8)) {
                            m151a(49, 21, 0, this.f450a >> 8, this.f454b >> 8, 30, 0);
                            C0003d.m96b(this);
                        }
                        break;
                }
                break;
            case 65:
                if (m168a(this, f425a)) {
                    f425a.mo217a(this, 0);
                }
                m234b();
                m242g();
                switch (this.f467j) {
                    case 0:
                        mo213a(7, 6);
                        if (this.f454b > C0003d.f329c[3]) {
                            this.f467j = 3;
                        }
                        boolean zM193h = (this.f472o & 4) != 0 ? m193h() : false;
                        if (m238d() || zM193h) {
                            mo213a(8, 128);
                            this.f467j = 1;
                            this.f469l = 0;
                            this.f470m = 0;
                        } else {
                            this.f450a += this.f469l;
                            this.f454b += this.f470m;
                            this.f470m += 256;
                        }
                        break;
                    case 1:
                        if (this.f460d) {
                            m151a(49, 21, 0, this.f450a >> 8, this.f454b >> 8, 30, 0);
                            this.f467j = 3;
                        }
                        break;
                    case 2:
                        this.f450a += this.f469l;
                        if (!m167a(this.f450a, this.f454b, C0003d.f340d)) {
                            this.f467j = 3;
                        }
                        break;
                    case 3:
                        C0003d.m96b(this);
                        break;
                }
                break;
            case 66:
                if (m168a(this, f425a) && this.f467j != 5 && ((m195i() || f425a.m278c() == 6 || f425a.m278c() == 181 || f425a.m278c() == 182 || m205m()) && m278c() != 72 && m278c() != 91 && m278c() != 89)) {
                    mo217a((C0004e) f425a, 0);
                }
                boolean z9 = (this.f506D & 1) == 0;
                if (this.f467j == 1) {
                    if (((C0004e) f425a).f450a - this.f450a > 0) {
                        m218a(false);
                        this.f469l = 2560;
                    } else if (((C0004e) f425a).f450a - this.f450a < 0) {
                        m218a(true);
                        this.f469l = -2560;
                    }
                } else if (this.f467j == 4) {
                    this.f469l = 2560;
                    if (!z9) {
                        this.f469l = -2560;
                    }
                    this.f470m = 1792;
                }
                switch (this.f467j) {
                    case 0:
                        mo213a(116, 6);
                        if (this.f464g == null) {
                            this.f464g = m152a(28, 7, this.f450a >> 8, this.f450a >> 8, 0, 0, 4, 30, 0);
                            this.f464g.f472o = 82;
                            this.f464g.f472o |= 4;
                        }
                        if (m169a(f425a, this.f455b)) {
                            this.f467j = 1;
                        }
                        break;
                    case 1:
                        if (Math.abs(((C0004e) f425a).f450a - this.f450a) <= 17920) {
                            mo213a(143, 0);
                            this.f467j = 2;
                        } else {
                            this.f450a += this.f469l;
                            this.f464g.f450a = this.f450a;
                            this.f464g.f454b = this.f454b;
                            this.f464g.f467j = 4;
                        }
                        break;
                    case 2:
                        if (this.f460d) {
                            mo213a(117, 128);
                            this.f467j = 3;
                        }
                        break;
                    case 3:
                        this.f464g.f467j = 0;
                        this.f464g.f469l = 768;
                        if ((this.f506D & 1) != 0) {
                            this.f464g.f469l = -768;
                        }
                        this.f464g.f470m = 0;
                        mo213a(116, 6);
                        this.f467j = 4;
                        break;
                    case 4:
                        this.f450a += this.f469l;
                        this.f454b -= this.f470m;
                        if (!m167a(this.f450a, this.f454b, C0003d.f329c)) {
                            C0003d.m96b(this);
                        }
                        break;
                    case 5:
                        if (this.f460d) {
                            C0003d.m96b(this);
                            this.f464g = null;
                        }
                        break;
                }
                break;
            case 67:
            case 65542:
                m234b();
                boolean z10 = (this.f506D & 1) == 0;
                int i39 = this.f450a;
                if (f425a.f467j == 10 && f425a.f468k == 1) {
                    C0013n c0013n4 = f425a;
                    if (((c0013n4.f506D & 1) != 0 && this.f450a < ((C0004e) c0013n4).f450a) || ((c0013n4.f506D & 1) == 0 && this.f450a > ((C0004e) c0013n4).f450a)) {
                        f425a.m175b(f434c);
                        m202l(4);
                        boolean z11 = (f425a.f506D & 1) == 0;
                        if ((this.f471n & 262144) == 0) {
                            z2 = true;
                        } else if (AbstractRunnableC0012m.m371d(this.f454b - ((C0004e) f425a).f454b) > 15360) {
                            z2 = false;
                        } else if (z11) {
                            if (this.f450a < ((C0004e) f425a).f450a) {
                                z2 = false;
                            } else if (m148a(((C0004e) f425a).f450a - this.f450a, ((C0004e) f425a).f454b - this.f454b) > 20480) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (this.f450a > ((C0004e) f425a).f450a) {
                            z2 = false;
                        } else if (m148a(((C0004e) f425a).f450a - this.f450a, ((C0004e) f425a).f454b - this.f454b) > 20480) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2 && this.f467j != 16384 && (this.f455b[21] <= 0 || this.f455b[21] == 4 || this.f467j == 512 || this.f467j == 256 || m203l())) {
                            mo217a((C0004e) f425a, 2);
                        }
                    }
                }
                if (this.f455b[21] > 0 && this.f455b[21] != 4 && this.f455b[34] == 0 && this.f455b[18] <= this.f455b[35] - 6 && this.f450a > C0003d.f329c[0] + 60 && this.f450a < C0003d.f329c[2] - 60 && m168a(this, f425a) && m203l()) {
                    this.f455b[34] = 1;
                    mo213a(this.f455b[33], 128);
                    this.f467j = 1048576;
                } else if (this.f455b[21] <= 0 || this.f455b[21] == 4 || !m168a(this, f425a)) {
                    if ((this.f455b[21] <= 0 || this.f455b[21] == 4) && !m200k() && m168a(this, f425a) && this.f467j != 16 && this.f467j != 32 && this.f467j != 256) {
                        if (this.f455b[21] != 4) {
                            if (m195i() || f425a.m278c() == 6 || f425a.m278c() == 181 || f425a.m278c() == 182 || m205m()) {
                                mo217a((C0004e) f425a, 0);
                            } else if (f425a.m278c() != 180) {
                                if (m198j()) {
                                    f425a.m218a((f425a.f506D & 1) == 0);
                                }
                                f425a.mo217a(this, 0);
                            }
                        } else if (C0013n.m409d(2)) {
                            if (f425a.m278c() != 6 && !m195i()) {
                                if (m198j()) {
                                    f425a.m218a((f425a.f506D & 1) == 0);
                                }
                                f425a.mo217a(this, 0);
                            } else if (f425a.m278c() == 6 || !(this.f467j == 8 || this.f467j == 8192)) {
                                mo217a((C0004e) f425a, 0);
                            } else {
                                if (m198j()) {
                                    f425a.m218a((f425a.f506D & 1) == 0);
                                }
                                f425a.mo217a(this, 0);
                            }
                        } else if (f425a.m278c() == 181 || f425a.m278c() == 182 || f425a.m278c() == 180) {
                            mo217a((C0004e) f425a, 0);
                        } else if (this.f467j != 16384) {
                            if (m198j()) {
                                f425a.m218a((f425a.f506D & 1) == 0);
                            }
                            f425a.mo217a(this, 0);
                        }
                    }
                } else if (this.f467j == 512 || this.f467j == 256 || this.f467j == 16 || this.f467j == 32 || this.f467j == 32768 || (m203l() && m205m())) {
                    if (m203l() && m205m() && f425a.m278c() != 233) {
                        mo217a((C0004e) f425a, 0);
                    }
                } else if ((!m200k() || this.f467j == 8 || this.f467j == 2048) && this.f467j != 1048576) {
                    if (m198j()) {
                        f425a.m218a((f425a.f506D & 1) == 0);
                    }
                    f425a.mo217a(this, 0);
                } else {
                    if (m198j()) {
                        f425a.m218a((f425a.f506D & 1) == 0);
                    }
                    f425a.mo217a(this, 6);
                }
                if (this.f455b[8] != 19 && C0003d.m82a(C0003d.f402v) && this.f467j != 256 && this.f467j != 512 && this.f467j != 16 && this.f467j != 32 && this.f467j != 4096 && this.f467j != 8 && this.f467j != 4 && this.f467j != 16384 && this.f467j != 2 && this.f467j != 524288 && this.f467j != 262144 && this.f467j != 1048576) {
                    m242g();
                    if ((this.f453a[2][0] & 16) == 0 && !m193h()) {
                        this.f467j = 4096;
                        mo213a(this.f455b[8], 6);
                    }
                }
                switch (this.f467j) {
                    case 1:
                        mo213a(this.f455b[8], 6);
                        this.f471n |= 262144;
                        if (z10) {
                            this.f469l = 512;
                        } else {
                            this.f469l = -512;
                        }
                        int i40 = this.f469l + i39;
                        if ((i40 <= this.f455b[5] || !z10) && (i40 >= this.f455b[4] || z10)) {
                            this.f450a += this.f469l;
                            m161a(false, i40, z10);
                        } else {
                            mo213a(this.f455b[9], 0);
                            this.f467j = 2;
                        }
                        break;
                    case 2:
                        if (m211a() >= m283e() - 1) {
                            if (z10) {
                                this.f469l = -512;
                                m218a(true);
                            } else {
                                this.f469l = 512;
                                m218a(false);
                            }
                            if (this.f454b == this.f455b[7] || this.f455b[8] != 19) {
                                this.f467j = 1;
                            } else {
                                this.f469l = (this.f455b[6] - this.f450a) >> 4;
                                this.f470m = (this.f455b[7] - this.f454b) >> 4;
                                mo213a(this.f455b[8], 6);
                                this.f467j = 64;
                            }
                        }
                        break;
                    case 4:
                        if (m211a() >= m283e() - 1) {
                            if (this.f455b[21] > 0) {
                                if (this.f455b[21] == 1) {
                                    if (this.f455b[11] == 113) {
                                        mo213a(this.f455b[11], 134);
                                        this.f467j = 2048;
                                    }
                                    break;
                                } else if (this.f455b[21] != 2) {
                                    if (this.f455b[21] == 3) {
                                        if (this.f455b[10] == 90) {
                                            this.f455b[11] = 91;
                                        } else if (this.f455b[10] == 82) {
                                            this.f455b[11] = 83;
                                        } else if (this.f455b[10] == 89) {
                                            C0004e c0004e7 = new C0004e(63, 35, ((C0004e) f425a).f450a >> 8, ((C0004e) f425a).f454b >> 8, new short[]{2, 0});
                                            c0004e7.f455b[1] = 0;
                                            c0004e7.m235c();
                                            this.f467j = 1;
                                        }
                                    }
                                    break;
                                } else if (this.f455b[10] == 71) {
                                    this.f455b[11] = 72;
                                } else {
                                    this.f455b[11] = 65;
                                }
                            }
                            mo213a(this.f455b[11], 6);
                            if (this.f455b[8] == 105) {
                                this.f467j = 2048;
                            } else {
                                this.f467j = 8;
                                this.f455b[6] = this.f450a;
                                if (this.f455b[10] == 21) {
                                    this.f455b[7] = this.f454b;
                                    this.f455b[19] = ((C0004e) f425a).f450a;
                                    this.f455b[20] = ((C0004e) f425a).f454b;
                                    this.f469l = (((C0004e) f425a).f450a - this.f450a) >> 3;
                                    this.f470m = (((C0004e) f425a).f454b - this.f454b) >> 3;
                                }
                            }
                        }
                        break;
                    case 8:
                        if (this.f455b[11] != 22) {
                            if ((m278c() == 72 || m278c() == 91) && m211a() == m283e() - 3) {
                                z = true;
                            } else if (((this.f450a >= C0003d.f329c[0] + 60 || z10) && (this.f450a <= C0003d.f329c[2] - 60 || !z10)) || m278c() == 72 || m278c() == 91) {
                                z = false;
                            } else {
                                if (this.f455b[21] > 0 && this.f455b[21] != 4) {
                                    C0003d.m68a(3, 2, 16);
                                    mo213a(this.f455b[31], 2);
                                    this.f467j = 524288;
                                }
                                z = true;
                            }
                            if (!z) {
                                if (z10) {
                                    if (this.f455b[21] == 4) {
                                        this.f469l = 1280;
                                    } else {
                                        this.f469l = 2560;
                                    }
                                } else if (this.f455b[21] == 4) {
                                    this.f469l = -1280;
                                } else {
                                    this.f469l = -2560;
                                }
                                if ((this.f452a[2] + this.f450a < this.f455b[2] || !z10) && (this.f452a[0] + this.f450a > this.f455b[0] || z10)) {
                                    this.f450a += this.f469l;
                                } else {
                                    this.f469l = 0;
                                    this.f467j = 2;
                                }
                            } else if (this.f467j != 524288) {
                                if (this.f449J > 0) {
                                    this.f469l = 0;
                                    mo213a(this.f455b[10], 128);
                                    this.f467j = 4;
                                    this.f449J--;
                                } else {
                                    this.f467j = 1;
                                }
                            }
                        } else if (AbstractRunnableC0012m.m371d(this.f454b - this.f455b[20]) <= AbstractRunnableC0012m.m371d(this.f470m) || (this.f470m == 0 && this.f469l == 0)) {
                            this.f450a = this.f455b[19];
                            this.f454b = this.f455b[20];
                            mo213a(this.f455b[10], 0);
                            this.f467j = 128;
                        } else {
                            this.f450a += this.f469l;
                            this.f454b += this.f470m;
                        }
                        break;
                    case 16:
                        this.f450a += this.f469l;
                        this.f454b -= this.f470m;
                        if (m211a() == m283e() - 1) {
                            C0003d.f396t++;
                            mo213a(this.f455b[13], 0);
                            this.f467j = 32;
                            C0003d.m70a(1, 15, false);
                        }
                        break;
                    case 32:
                        if (m211a() == m283e() - 1) {
                            if (this.f455b[21] > 0 && this.f455b[21] != 4) {
                                C0003d.m66a(0);
                                C0003d.m92b(0);
                                C0003d.f207a = false;
                            }
                            C0003d.m96b(this);
                        }
                        break;
                    case 64:
                        if (AbstractRunnableC0012m.m371d(this.f454b - this.f455b[7]) <= AbstractRunnableC0012m.m371d(this.f470m)) {
                            this.f450a = this.f455b[6];
                            this.f454b = this.f455b[7];
                            this.f467j = 1;
                        } else {
                            this.f450a += this.f469l;
                            this.f454b += this.f470m;
                        }
                        break;
                    case 128:
                        if (this.f460d) {
                            mo213a(this.f455b[9], 0);
                            this.f467j = 2;
                        }
                        break;
                    case 256:
                        if (this.f455b[15] != 31 && this.f455b[15] != 32) {
                            this.f450a += this.f469l;
                            this.f454b -= this.f470m;
                        }
                        if (this.f460d) {
                            if (this.f455b[15] == 31 || this.f455b[15] == 32) {
                                if (this.f455b[15] == 31) {
                                    this.f455b[15] = 30;
                                } else if (this.f455b[15] == 32) {
                                    this.f455b[15] = 29;
                                }
                                mo213a(this.f455b[15], 6);
                            } else {
                                this.f471n |= 262144;
                                if (this.f455b[18] < 1) {
                                    mo213a(this.f455b[13], 0);
                                    this.f467j = 32;
                                    this.f455b[18] = 0;
                                } else if ((((C0004e) f425a).f450a >= this.f450a || !z10) && (((C0004e) f425a).f450a <= this.f450a || z10)) {
                                    this.f467j = 1;
                                } else {
                                    mo213a(this.f455b[9], 0);
                                    this.f467j = 2;
                                }
                            }
                        }
                        break;
                    case 512:
                        boolean z12 = false;
                        if (this.f455b[21] != 4) {
                            if (m278c() == this.f455b[24] && m211a() >= 10) {
                                z12 = true;
                                if (this.f450a > ((C0004e) f425a).f450a) {
                                    this.f469l = 2048;
                                } else {
                                    this.f469l = -2048;
                                }
                                this.f450a += this.f469l;
                                C0003d.m68a(3, 2, 5);
                            }
                        } else if (f425a.m278c() == 232 && f425a.m211a() == 12) {
                            z12 = true;
                        }
                        this.f471n |= 262144;
                        if (this.f455b[21] == 4 || !this.f460d) {
                            if (this.f455b[21] == 4) {
                                if (z12) {
                                    mo213a(131, 128);
                                    this.f467j = 16384;
                                } else {
                                    this.f467j = 1;
                                }
                            }
                        } else if ((this.f455b[21] > 0 || !z12) && this.f455b[18] >= 1) {
                            this.f467j = 1;
                        } else {
                            this.f455b[18] = 0;
                            C0003d.f396t++;
                            mo213a(this.f455b[13], 0);
                            this.f467j = 32;
                        }
                        if (this.f455b[18] <= 0) {
                            mo213a(this.f455b[13], 0);
                            this.f467j = 32;
                        }
                        break;
                    case 1024:
                        this.f467j = 1;
                        if (this.f462f == 67) {
                            C0003d.m66a(0);
                            C0003d.m92b(0);
                            C0003d.f207a = true;
                        }
                        break;
                    case 2048:
                        if (this.f455b[21] == 1 && m211a() == m283e() - 3) {
                            int i41 = 2560;
                            int i42 = this.f450a + this.f452a[2] + 5120;
                            if (z10) {
                                i4 = i42;
                            } else {
                                i41 = -2560;
                                i4 = (this.f450a + this.f452a[0]) - 5120;
                            }
                            C0004e c0004eM152a = m152a(4, 114, i4 >> 8, this.f454b >> 8, i41, 0, 2, 30, 0);
                            if (!z10) {
                                c0004eM152a.m218a(true);
                            }
                        }
                        if (this.f455b[8] == 105) {
                            if ((m211a() == m283e() - 2 && (this.f506D & 1) == 0) || (m211a() == m283e() - 6 && (this.f506D & 1) != 0)) {
                                m152a(28, 7, (this.f450a + this.f452a[0]) >> 8, (this.f454b + this.f452a[1]) >> 8, -768, -2560, 0, 30, 0);
                            }
                            if ((m211a() == m283e() - 6 && (this.f506D & 1) == 0) || (m211a() == m283e() - 2 && (this.f506D & 1) != 0)) {
                                m152a(28, 7, (this.f450a + this.f452a[2]) >> 8, (this.f454b + this.f452a[1]) >> 8, 768, -2560, 0, 30, 0);
                            }
                        }
                        if (this.f460d) {
                            this.f467j = 1;
                        }
                        break;
                    case 4096:
                        m242g();
                        if ((this.f453a[2][0] & 32) != 0) {
                            C0003d.f396t++;
                            mo213a(this.f455b[13], 0);
                            this.f467j = 32;
                        } else if ((this.f453a[2][0] & 16) == 0 && !m193h()) {
                            this.f470m += 768;
                            this.f454b += this.f470m;
                        } else if (this.f454b - this.f455b[3] > 12800) {
                            C0003d.f396t++;
                            mo213a(this.f455b[13], 0);
                            this.f467j = 32;
                        } else {
                            this.f467j = 1;
                            this.f470m = 0;
                        }
                        break;
                    case 8192:
                        if (m278c() == 121) {
                            if (m211a() >= m283e() - 1) {
                                mo213a(122, 0);
                                this.f455b[25] = 0;
                            }
                        } else if (this.f455b[25] == 30) {
                            this.f455b[10] = 123;
                            mo213a(this.f455b[10], 0);
                            this.f467j = 4;
                        } else {
                            if (m278c() != 122 && this.f460d) {
                                mo213a(122, 0);
                            }
                            int[] iArr20 = this.f455b;
                            iArr20[25] = iArr20[25] + 1;
                        }
                        break;
                    case 16384:
                        if (this.f450a > ((C0004e) f425a).f450a) {
                            this.f450a += 256;
                        } else {
                            this.f450a -= 256;
                        }
                        if (m278c() == 131 && this.f460d) {
                            this.f455b[8] = 13;
                            this.f455b[9] = 14;
                            this.f455b[10] = 15;
                            this.f455b[11] = 16;
                            this.f455b[12] = 17;
                            this.f455b[13] = 18;
                            this.f455b[14] = 28;
                            this.f455b[15] = 32;
                            this.f455b[22] = 53;
                            this.f455b[23] = 54;
                            this.f455b[24] = 55;
                            this.f455b[21] = 0;
                            this.f467j = 1024;
                            break;
                        }
                        break;
                    case 32768:
                        if (m211a() == m283e() - 1) {
                            this.f467j = 1;
                        }
                        break;
                    case 262144:
                        if (this.f460d) {
                            this.f467j = 1;
                        }
                        break;
                    case 524288:
                        if (z10) {
                            this.f450a -= 512;
                        } else {
                            this.f450a += 512;
                        }
                        if (this.f460d) {
                            mo213a(this.f455b[32], 128);
                            this.f467j = 262144;
                        }
                        break;
                    case 1048576:
                        switch (this.f455b[33]) {
                            case 129:
                                if (m211a() == 3) {
                                    C0003d.m68a(10, 10, 16);
                                }
                                break;
                            case 132:
                                if (m211a() == 8) {
                                    C0003d.m68a(10, 10, 16);
                                }
                                break;
                            case 135:
                                if (m211a() == 3) {
                                    C0003d.m68a(10, 10, 16);
                                }
                                break;
                        }
                        if (this.f460d) {
                            if ((((C0004e) f425a).f450a < this.f450a && z10) || (((C0004e) f425a).f450a > this.f450a && !z10)) {
                                if (z10) {
                                    this.f469l = -512;
                                    m218a(true);
                                } else {
                                    this.f469l = 512;
                                    m218a(false);
                                }
                            }
                            m161a(true, this.f450a, z10);
                        }
                        break;
                }
                break;
            case 65537:
                if (f425a.f467j != 20) {
                    if (this.f455b[0] < 73 || this.f455b[0] > 77) {
                        if (this.f455b[6] == 1 && this.f455b[0] != 78) {
                            mo213a(this.f455b[0], 0);
                            this.f455b[6] = 0;
                            this.f455b[7] = 0;
                        }
                        if (this.f455b[0] == 78) {
                            if (f430b != null && f430b.f462f == 65539 && f430b.f467j >= 35) {
                                if (f430b.f467j == 35 && f430b.m278c() == 5 && f430b.m211a() == 0) {
                                    mo213a(79, 128);
                                }
                                if (m278c() == 79 && this.f460d) {
                                    mo213a(80, 0);
                                }
                                if (f430b.f467j == 39 && f430b.f455b[12] >= 20) {
                                    mo213a(81, 128);
                                }
                            } else if (m278c() == 81 && this.f460d) {
                                mo213a(78, 0);
                                break;
                            }
                        }
                        if (((RunnableC0006g) this).f509a != null) {
                            ((RunnableC0006g) this).f509a.m315a(this.f452a, AbstractRunnableC0012m.m372d(m278c(), 0), AbstractRunnableC0012m.m372d(m211a(), 0), 0, 0, this.f506D);
                            int[] iArr21 = this.f452a;
                            iArr21[0] = iArr21[0] << 8;
                            int[] iArr22 = this.f452a;
                            iArr22[2] = iArr22[2] << 8;
                            int[] iArr23 = this.f452a;
                            iArr23[1] = iArr23[1] << 8;
                            int[] iArr24 = this.f452a;
                            iArr24[3] = iArr24[3] << 8;
                        }
                        int i43 = (this.f452a[0] + this.f452a[2]) / 2;
                        int i44 = (this.f452a[1] + this.f452a[3]) / 2;
                        if (!m168a(f425a, this)) {
                            this.f455b[7] = 1;
                        } else if ((this.f455b[0] != 40 && this.f455b[0] != 44) || f425a.m278c() != 6) {
                            if (this.f455b[0] != 78 || f425a.m278c() != 54) {
                                if (this.f455b[7] == 1) {
                                    int iM329f = ((RunnableC0006g) this).f509a.m329f(((RunnableC0006g) this).f509a.m318b(AbstractRunnableC0012m.m372d(m278c(), 0), AbstractRunnableC0012m.m372d(m211a(), 0)));
                                    for (int i45 = 0; i45 < iM329f; i45++) {
                                        m199k(i45);
                                        if (f425a.f470m <= 0 || ((C0004e) f425a).f454b >= this.f454b + this.f452a[1]) {
                                            if (f425a.f470m < 0 && ((C0004e) f425a).f454b > this.f454b + this.f452a[3] && ((C0004e) f425a).f454b + f425a.f470m < this.f454b + this.f452a[1]) {
                                                ((C0004e) f425a).f454b = this.f454b + ((this.f452a[1] + this.f452a[3]) / 2);
                                            }
                                        } else if (((C0004e) f425a).f454b + f425a.f470m > this.f454b + this.f452a[3]) {
                                            ((C0004e) f425a).f454b = this.f454b + ((this.f452a[1] + this.f452a[3]) / 2);
                                        }
                                        if (f425a.f469l <= 0 || ((C0004e) f425a).f450a >= this.f450a + this.f452a[0]) {
                                            if (f425a.f469l < 0 && ((C0004e) f425a).f450a > this.f450a + this.f452a[2] && ((C0004e) f425a).f450a + f425a.f469l < this.f450a + this.f452a[0]) {
                                                ((C0004e) f425a).f450a = this.f450a + ((this.f452a[0] + this.f452a[2]) / 2);
                                            }
                                        } else if (((C0004e) f425a).f450a + f425a.f469l > this.f450a + this.f452a[2]) {
                                            ((C0004e) f425a).f450a = this.f450a + ((this.f452a[0] + this.f452a[2]) / 2);
                                        }
                                        if (this.f455b[0] == 40 || this.f455b[0] == 44 || this.f455b[0] == 16 || this.f455b[0] == 20 || this.f455b[0] == 57 || this.f455b[0] == 61) {
                                            ((C0004e) f425a).f450a = this.f450a + ((this.f452a[0] + this.f452a[2]) / 2);
                                            ((C0004e) f425a).f454b = this.f454b + ((this.f452a[1] + this.f452a[3]) / 2);
                                        }
                                        if (this.f455b[0] == 2 && f425a.m278c() == 6 && f425a.f470m > 0 && ((C0004e) f425a).f450a < this.f450a + this.f452a[2] && ((C0004e) f425a).f450a > this.f450a + this.f452a[0]) {
                                            ((C0004e) f425a).f454b = this.f454b + this.f452a[1];
                                        }
                                        if (this.f455b[0] == 23 && (f425a.m278c() == 56 || f425a.m278c() == 57 || f425a.m278c() == 64 || f425a.m278c() == 65)) {
                                            ((C0004e) f425a).f450a = this.f450a + ((this.f452a[0] + this.f452a[2]) / 2);
                                            ((C0004e) f425a).f454b = this.f454b + ((this.f452a[1] + this.f452a[3]) / 2);
                                        }
                                        if (m180b(f425a, this)) {
                                            switch (this.f455b[0]) {
                                                case 1:
                                                case 3:
                                                case 5:
                                                case 7:
                                                    ((C0004e) f425a).f450a = i43 + this.f450a;
                                                    ((C0004e) f425a).f454b = this.f454b + i44;
                                                    break;
                                                case 2:
                                                    ((C0004e) f425a).f454b = this.f454b + this.f452a[1];
                                                    break;
                                                case 16:
                                                case 20:
                                                case 40:
                                                case 44:
                                                case 57:
                                                case 61:
                                                    if (((f425a.f506D & 1) == 0 && this.f455b[1] < 0) || ((f425a.f506D & 1) != 0 && this.f455b[1] > 0)) {
                                                        f425a.m441u();
                                                    }
                                                    f425a.m425b(5120, true);
                                                    if (this.f455b[1] > 0) {
                                                        ((C0004e) f425a).f450a = this.f450a + this.f452a[2] + 2560;
                                                    } else if (this.f455b[1] < 0) {
                                                        ((C0004e) f425a).f450a = (this.f450a + this.f452a[0]) - 2560;
                                                    }
                                                    break;
                                                case 17:
                                                case 58:
                                                    ((C0004e) f425a).f450a = this.f450a + this.f452a[2];
                                                    ((C0004e) f425a).f454b = this.f454b + this.f452a[1];
                                                    break;
                                                case 18:
                                                case 59:
                                                    ((C0004e) f425a).f450a = this.f450a + ((this.f452a[0] + this.f452a[2]) / 2);
                                                    ((C0004e) f425a).f454b = this.f454b + this.f452a[1];
                                                    break;
                                                case 19:
                                                case 60:
                                                    ((C0004e) f425a).f450a = this.f450a + this.f452a[0];
                                                    ((C0004e) f425a).f454b = this.f454b + this.f452a[1];
                                                    break;
                                                case 21:
                                                case 62:
                                                    ((C0004e) f425a).f450a = this.f450a + this.f452a[0];
                                                    ((C0004e) f425a).f454b = this.f454b + this.f452a[3];
                                                    break;
                                                case 22:
                                                case 63:
                                                    ((C0004e) f425a).f450a = this.f450a + ((this.f452a[0] + this.f452a[2]) / 2);
                                                    ((C0004e) f425a).f454b = this.f454b + this.f452a[1];
                                                    break;
                                                case 23:
                                                case 64:
                                                    ((C0004e) f425a).f450a = this.f450a + this.f452a[2];
                                                    ((C0004e) f425a).f454b = this.f454b + this.f452a[3];
                                                    break;
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 78:
                                                    ((C0004e) f425a).f450a = this.f450a + ((this.f452a[0] + this.f452a[2]) / 2);
                                                    ((C0004e) f425a).f454b = this.f454b + ((this.f452a[1] + this.f452a[3]) / 2);
                                                    break;
                                            }
                                            f425a.f469l = this.f455b[1] << 8;
                                            f425a.f470m = this.f455b[2] << 8;
                                            if (f425a.f470m == 0) {
                                                if (f425a.f469l > 0) {
                                                    C0003d.m102c(4242);
                                                } else if (f425a.f469l < 0) {
                                                    C0003d.m102c(8776);
                                                }
                                            }
                                            if (this.f455b[5] == 16) {
                                                int i46 = this.f455b[8] == 1 ? 256 : 0;
                                                if (this.f455b[9] == 1) {
                                                    i46 |= 192;
                                                }
                                                f425a.m428d(this.f455b[5], i46);
                                                if ((f425a.f506D & 1) != 0) {
                                                    f425a.f506D ^= 1;
                                                }
                                            } else {
                                                f425a.m428d(this.f455b[5], 0);
                                            }
                                            f425a.mo213a(this.f455b[3], 6);
                                            if (this.f455b[0] != 78) {
                                                mo213a(this.f455b[4], 4096);
                                                this.f455b[7] = 0;
                                            }
                                            C0013n.f667H = -1;
                                            if (f422I < 32 || f422I > 39 || C0003d.f344e - f421H > 5) {
                                                C0003d.m70a(1, 13, false);
                                            }
                                            f421H = C0003d.f344e;
                                            f422I = this.f455b[0];
                                        }
                                    }
                                }
                            }
                        }
                        if (this.f460d && m278c() != this.f455b[0] && this.f455b[0] != 78) {
                            mo213a(this.f455b[0], 0);
                            break;
                        }
                    }
                }
                break;
            case 65538:
                switch (this.f467j) {
                    case 0:
                        mo213a(this.f455b[1], 0);
                        this.f467j = 1;
                        this.f471n |= 262144;
                        break;
                    case 1:
                        f425a.m175b(f434c);
                        m202l(4);
                        if (m170a(f434c, 0, f434c, 4) && (m205m() || m200k())) {
                            mo217a((C0004e) f425a, 0);
                            break;
                        } else if (f430b != null && m168a(this, f430b)) {
                            mo217a(f430b, 0);
                            break;
                        } else if (this.f460d && m278c() == this.f455b[1] + 1) {
                            this.f467j = 3;
                            mo213a(6, 0);
                            if (f430b != null) {
                                C0003d.m96b(this);
                            }
                            break;
                        }
                        break;
                    case 3:
                        if (!m167a(this.f450a, this.f454b, C0003d.f340d)) {
                            this.f467j = 0;
                        }
                        break;
                }
                break;
            case 65539:
                switch (this.f467j) {
                    case 0:
                        mo213a(4, 128);
                        if (m278c() == 4 && this.f460d) {
                            this.f455b[1] = 8;
                            this.f467j = 13;
                            this.f455b[10] = 1;
                            this.f450a = 62464;
                            this.f454b = 18944;
                            this.f506D |= 1073741824;
                            this.f506D |= Integer.MIN_VALUE;
                            break;
                        }
                        break;
                    case 1:
                        if (this.f455b[2] < 60) {
                            this.f454b -= this.f470m;
                            this.f450a += this.f469l;
                            if (f425a.f469l == 0) {
                                this.f469l = 2560;
                            } else {
                                this.f469l = 4096;
                            }
                            if ((this.f506D & 1) == 0) {
                                if (this.f450a > C0003d.f329c[2]) {
                                    this.f506D ^= 1;
                                    this.f469l = -this.f469l;
                                }
                            } else if (this.f450a < C0003d.f329c[0]) {
                                this.f506D ^= 1;
                            } else {
                                this.f469l = -this.f469l;
                            }
                            int[] iArr25 = this.f455b;
                            iArr25[2] = iArr25[2] + 1;
                        } else {
                            this.f455b[2] = 0;
                            this.f467j = 13;
                            this.f455b[10] = 2;
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        switch (this.f467j) {
                            case 2:
                                this.f454b += this.f470m;
                                this.f450a += this.f469l;
                                if (this.f450a > this.f455b[7] + 3840) {
                                    if ((this.f506D & 1) == 0) {
                                        this.f506D ^= 1;
                                    }
                                    this.f469l = -2560;
                                } else if (this.f450a < this.f455b[7] - 3840) {
                                    if ((this.f506D & 1) != 0) {
                                        this.f506D ^= 1;
                                    }
                                    this.f469l = 2560;
                                } else {
                                    this.f469l = 0;
                                    this.f470m = 0;
                                    this.f450a = this.f455b[7];
                                    this.f454b = this.f455b[8];
                                    this.f467j = 3;
                                    mo213a(5, 128);
                                }
                                break;
                            case 3:
                                if (m278c() == 5 && this.f460d) {
                                    this.f467j = 4;
                                    mo213a(6, 0);
                                    this.f455b[20] = 1;
                                    this.f455b[5] = this.f455b[7];
                                    this.f455b[6] = this.f455b[8] + 11520;
                                    if (((C0004e) f425a).f450a < this.f450a) {
                                        this.f455b[29] = 0;
                                    } else {
                                        this.f455b[29] = 1;
                                    }
                                    if (this.f455b[29] == 0) {
                                        this.f455b[16] = C0003d.f201a.f452a[0] >> 8;
                                        this.f455b[17] = ((C0003d.f201a.f452a[1] >> 8) + 280) - 60;
                                        this.f455b[18] = -1;
                                        this.f455b[19] = -1;
                                    } else {
                                        this.f455b[16] = C0003d.f201a.f452a[2] >> 8;
                                        this.f455b[17] = ((C0003d.f201a.f452a[1] >> 8) + 280) - 60;
                                        this.f455b[18] = -1;
                                        this.f455b[19] = -1;
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                if (this.f455b[25] != 0) {
                                    if (this.f455b[25] == 1) {
                                        switch (this.f455b[20]) {
                                            case 1:
                                                if (this.f455b[29] == 0) {
                                                    int[] iArr26 = this.f455b;
                                                    iArr26[16] = iArr26[16] + 10;
                                                    if (this.f455b[16] >= (C0003d.f201a.f452a[0] >> 8) + 100) {
                                                        this.f455b[20] = 2;
                                                    }
                                                } else if (this.f455b[29] == 1) {
                                                    int[] iArr27 = this.f455b;
                                                    iArr27[16] = iArr27[16] - 10;
                                                    if (this.f455b[16] <= (C0003d.f201a.f452a[2] >> 8) - 100) {
                                                        this.f455b[20] = 2;
                                                    }
                                                }
                                                break;
                                            case 2:
                                                int[] iArr28 = this.f455b;
                                                iArr28[17] = iArr28[17] + 6;
                                                if (this.f455b[17] >= (C0003d.f201a.f452a[1] >> 8) + 280) {
                                                    this.f455b[20] = 3;
                                                }
                                                break;
                                            case 3:
                                                if (this.f455b[29] == 0) {
                                                    int[] iArr29 = this.f455b;
                                                    iArr29[16] = iArr29[16] + 10;
                                                    if (this.f455b[16] >= ((C0003d.f201a.f452a[0] + C0003d.f201a.f452a[2]) >> 8) / 2) {
                                                        this.f455b[20] = 4;
                                                        this.f455b[18] = C0003d.f201a.f452a[2] >> 8;
                                                        this.f455b[19] = ((C0003d.f201a.f452a[1] >> 8) + 280) - 60;
                                                    }
                                                } else if (this.f455b[29] == 1) {
                                                    int[] iArr30 = this.f455b;
                                                    iArr30[16] = iArr30[16] - 10;
                                                    if (this.f455b[16] <= ((C0003d.f201a.f452a[0] + C0003d.f201a.f452a[2]) >> 8) / 2) {
                                                        this.f455b[20] = 4;
                                                        this.f455b[18] = C0003d.f201a.f452a[0] >> 8;
                                                        this.f455b[19] = ((C0003d.f201a.f452a[1] >> 8) + 280) - 60;
                                                    }
                                                }
                                                break;
                                            case 4:
                                                if (this.f455b[29] == 0) {
                                                    int[] iArr31 = this.f455b;
                                                    iArr31[18] = iArr31[18] - 10;
                                                    if (this.f455b[18] <= (C0003d.f201a.f452a[2] >> 8) - 100) {
                                                        this.f455b[20] = 5;
                                                    }
                                                    if (this.f455b[16] > (((C0003d.f201a.f452a[0] + C0003d.f201a.f452a[2]) >> 8) / 2) + 50) {
                                                        this.f455b[16] = -1;
                                                    } else if (this.f455b[16] != -1) {
                                                        int[] iArr32 = this.f455b;
                                                        iArr32[16] = iArr32[16] + 10;
                                                    }
                                                } else if (this.f455b[29] == 1) {
                                                    int[] iArr33 = this.f455b;
                                                    iArr33[18] = iArr33[18] + 10;
                                                    if (this.f455b[18] >= (C0003d.f201a.f452a[0] >> 8) + 100) {
                                                        this.f455b[20] = 5;
                                                    }
                                                    if (this.f455b[16] < (((C0003d.f201a.f452a[0] + C0003d.f201a.f452a[2]) >> 8) / 2) - 50) {
                                                        this.f455b[16] = -1;
                                                    } else if (this.f455b[16] != -1) {
                                                        int[] iArr34 = this.f455b;
                                                        iArr34[16] = iArr34[16] - 10;
                                                    }
                                                }
                                                break;
                                            case 5:
                                                int[] iArr35 = this.f455b;
                                                iArr35[19] = iArr35[19] + 6;
                                                if (this.f455b[19] >= (C0003d.f201a.f452a[1] >> 8) + 280) {
                                                    this.f455b[20] = 6;
                                                }
                                                break;
                                            case 6:
                                                if (this.f455b[29] == 0) {
                                                    int[] iArr36 = this.f455b;
                                                    iArr36[18] = iArr36[18] - 10;
                                                    if (this.f455b[18] <= (((C0003d.f201a.f452a[0] + C0003d.f201a.f452a[2]) >> 8) / 2) - 100) {
                                                        this.f467j = 5;
                                                    }
                                                } else if (this.f455b[29] == 1) {
                                                    int[] iArr37 = this.f455b;
                                                    iArr37[18] = iArr37[18] + 10;
                                                    if (this.f455b[18] >= (((C0003d.f201a.f452a[0] + C0003d.f201a.f452a[2]) >> 8) / 2) + 100) {
                                                        this.f467j = 5;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                } else {
                                    switch (this.f455b[20]) {
                                        case 1:
                                            int[] iArr38 = this.f455b;
                                            iArr38[17] = iArr38[17] + 6;
                                            if (this.f455b[17] >= C0003d.f201a.f452a[1] + 280) {
                                                this.f455b[20] = 2;
                                            }
                                            break;
                                        case 2:
                                            if (this.f455b[29] == 0) {
                                                int[] iArr39 = this.f455b;
                                                iArr39[16] = iArr39[16] + 10;
                                                if (this.f455b[16] >= (C0003d.f201a.f452a[0] >> 8) + ((C0003d.f201a.f455b[5] * 3) / 4)) {
                                                    this.f467j = 5;
                                                }
                                            } else {
                                                int[] iArr40 = this.f455b;
                                                iArr40[16] = iArr40[16] - 10;
                                                if (this.f455b[16] <= (C0003d.f201a.f452a[0] >> 8) + (C0003d.f201a.f455b[5] / 4)) {
                                                    this.f467j = 5;
                                                }
                                            }
                                            break;
                                    }
                                }
                                if (this.f455b[16] != -1 && AbstractRunnableC0012m.m335a(this.f455b[5], this.f455b[6], this.f455b[16] << 8, this.f455b[17] << 8, ((C0004e) f425a).f450a + ((C0004e) f425a).f452a[0], ((C0004e) f425a).f454b + ((C0004e) f425a).f452a[1], ((C0004e) f425a).f452a[2] - ((C0004e) f425a).f452a[0], ((C0004e) f425a).f452a[3] - ((C0004e) f425a).f452a[1]) != 0) {
                                    f425a.mo217a(this, 0);
                                    break;
                                } else if (this.f455b[18] != -1 && AbstractRunnableC0012m.m335a(this.f455b[5], this.f455b[6], this.f455b[18] << 8, this.f455b[19] << 8, ((C0004e) f425a).f450a + ((C0004e) f425a).f452a[0], ((C0004e) f425a).f454b + ((C0004e) f425a).f452a[1], ((C0004e) f425a).f452a[2] - ((C0004e) f425a).f452a[0], ((C0004e) f425a).f452a[3] - ((C0004e) f425a).f452a[1]) != 0) {
                                    f425a.mo217a(this, 0);
                                    break;
                                } else if (C0003d.f344e % 5 == 0) {
                                    if (this.f455b[16] != -1) {
                                        m151a(49, 21, 1, this.f455b[16], this.f455b[17], 30, 0);
                                    }
                                    if (this.f455b[25] == 1 && this.f455b[18] != -1) {
                                        m151a(49, 21, 1, this.f455b[18], this.f455b[19], 30, 0);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                this.f467j = 13;
                                this.f455b[10] = 27;
                                break;
                        }
                        break;
                    case 6:
                        if (this.f455b[9] < 40) {
                            this.f454b += this.f470m;
                            this.f450a += this.f469l;
                            int i47 = ((C0004e) f425a).f450a - this.f450a;
                            int i48 = ((C0004e) f425a).f454b - this.f454b;
                            if ((i47 > 0 && (this.f506D & 1) != 0) || (i47 < 0 && (this.f506D & 1) == 0)) {
                                this.f506D ^= 1;
                            }
                            if (i47 != 0 || i48 != 0) {
                                this.f469l = (i47 * 2048) / m148a(i47, i48);
                                this.f470m = (i48 * 2048) / m148a(i47, i48);
                            }
                            if (this.f454b > C0003d.f201a.f452a[1] + 35840) {
                                this.f470m = 0;
                            }
                        } else {
                            mo213a(7, 128);
                            this.f467j = 7;
                        }
                        int[] iArr41 = this.f455b;
                        iArr41[9] = iArr41[9] + 1;
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        switch (this.f467j) {
                            case 7:
                                if (m278c() == 7 && this.f460d) {
                                    this.f467j = 8;
                                    mo213a(8, 128);
                                    this.f469l = 0;
                                    this.f470m = 2048;
                                    break;
                                }
                                break;
                            case 8:
                                this.f454b += this.f470m;
                                this.f450a += this.f469l;
                                m234b();
                                if (m168a(this, f425a)) {
                                    f425a.mo217a(this, 0);
                                }
                                m242g();
                                if (m238d()) {
                                    this.f467j = 10;
                                    mo213a(9, 128);
                                    this.f469l = 0;
                                    this.f470m = 0;
                                }
                                break;
                            case 9:
                                if (m168a(this, f425a) && f425a.m278c() != 6 && m278c() == 26) {
                                    f425a.mo217a(this, 0);
                                }
                                if (m278c() == 26 && this.f455b[1] >= 0 && m168a(this, f425a) && f425a.m278c() == 6) {
                                    mo217a((C0004e) f425a, 0);
                                }
                                if (((m278c() == 26 && this.f455b[13] <= 0) || (m278c() == 12 && this.f460d)) && this.f455b[1] >= 0) {
                                    this.f467j = 11;
                                    mo213a(2, 128);
                                    this.f469l = 0;
                                    this.f470m = -2048;
                                }
                                if (this.f455b[1] <= 0) {
                                    this.f467j = 12;
                                    mo213a(13, 128);
                                    m151a(49, 21, 4, this.f450a >> 8, this.f454b >> 8, 30, 0);
                                    C0013n.f673c = true;
                                }
                                if (m278c() == 26) {
                                    int[] iArr42 = this.f455b;
                                    iArr42[13] = iArr42[13] - 1;
                                }
                                break;
                            case 10:
                                if (m168a(this, f425a)) {
                                    f425a.mo217a(this, 0);
                                }
                                if (m278c() == 9 && this.f460d) {
                                    this.f467j = 9;
                                    mo213a(26, 0);
                                    this.f455b[13] = 80;
                                    break;
                                }
                                break;
                            case 11:
                                this.f454b += this.f470m;
                                this.f450a += this.f469l;
                                if (m168a(this, f425a)) {
                                    f425a.f469l = -f425a.f469l;
                                }
                                if (this.f454b <= C0003d.f201a.f452a[1] + 18944) {
                                    this.f467j = 13;
                                    this.f455b[10] = 27;
                                }
                                break;
                        }
                        break;
                    case 12:
                        if (m278c() == 13 && this.f460d) {
                            int i49 = this.f450a;
                            int i50 = this.f454b;
                            if (C0003d.f216a[C0003d.f402v][0] > 0) {
                                if (((C0003d.f399u >> ((C0003d.f216a[C0003d.f402v][0] - 17) / 3)) & 1) == 0) {
                                    int i51 = 0;
                                    while (true) {
                                        int i52 = i51;
                                        if (i52 < C0003d.f216a[C0003d.f402v].length) {
                                            C0004e c0004e8 = new C0004e(65543, 6, (i49 >> 8) + (i52 * 25), i50 >> 8, new short[]{0, (short) C0003d.f216a[C0003d.f402v][i52], 19});
                                            c0004e8.f467j = 1;
                                            c0004e8.m235c();
                                            i51 = i52 + 1;
                                        }
                                    }
                                } else if (C0003d.m98b(C0003d.f402v)) {
                                    C0003d.m114f();
                                }
                            }
                            C0003d.m96b(this);
                            break;
                        }
                        break;
                    case 13:
                        this.f467j = this.f455b[10];
                        m209r();
                        break;
                    case 14:
                    case 15:
                    case 16:
                        switch (this.f467j) {
                            case 13:
                                this.f467j = this.f455b[10];
                                m209r();
                                break;
                            case 14:
                                this.f454b += this.f470m;
                                this.f450a += this.f469l;
                                int i53 = this.f469l;
                                if (this.f450a + this.f452a[2] < 0) {
                                    this.f454b = 66048;
                                    this.f450a = -25600;
                                    this.f467j = 16;
                                    this.f455b[12] = 15;
                                    mo213a(11, 0);
                                    this.f469l = -(i53 - 512);
                                    if ((this.f506D & 1) != 0) {
                                        this.f506D ^= 1;
                                    }
                                    this.f470m = 0;
                                } else if (this.f450a > 204800) {
                                    this.f454b = 66048;
                                    this.f450a = 230400;
                                    this.f467j = 16;
                                    this.f455b[12] = 15;
                                    mo213a(11, 0);
                                    this.f469l = -(i53 + 512);
                                    if ((this.f506D & 1) == 0) {
                                        this.f506D ^= 1;
                                    }
                                    this.f470m = 0;
                                }
                                break;
                            case 15:
                                this.f454b += this.f470m;
                                this.f450a += this.f469l;
                                m234b();
                                if (m168a(this, f425a)) {
                                    f425a.mo217a(this, 0);
                                }
                                if (this.f450a + this.f452a[0] < 0 && this.f469l < 0) {
                                    this.f467j = 14;
                                } else if (this.f450a > 204800 && this.f469l > 0) {
                                    this.f467j = 14;
                                }
                                break;
                            case 16:
                                if (this.f455b[12] >= 0) {
                                    int[] iArr43 = this.f455b;
                                    iArr43[12] = iArr43[12] - 1;
                                } else {
                                    this.f467j = 15;
                                }
                                break;
                        }
                        if (C0003d.f201a != null) {
                            this.f467j = 13;
                            this.f455b[10] = 1;
                        }
                        break;
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                        switch (this.f467j) {
                            case 35:
                                this.f454b += this.f470m;
                                this.f450a += this.f469l;
                                if (this.f450a > ((C0004e) f425a).f450a + 3840) {
                                    if ((this.f506D & 1) == 0) {
                                        this.f506D ^= 1;
                                    }
                                    this.f469l = -2560;
                                } else if (this.f450a < ((C0004e) f425a).f450a - 3840) {
                                    if ((this.f506D & 1) != 0) {
                                        this.f506D ^= 1;
                                    }
                                    this.f469l = 2560;
                                } else {
                                    this.f450a = ((C0004e) f425a).f450a;
                                    mo213a(5, 128);
                                }
                                if (m278c() == 5) {
                                    this.f450a = ((C0004e) f425a).f450a;
                                    if (this.f460d) {
                                        this.f467j = 36;
                                        f436d = new int[8];
                                        boolean[] zArr = new boolean[7];
                                        f427a = zArr;
                                        zArr[0] = true;
                                        f427a[6] = true;
                                        for (int i54 = 0; i54 < 8; i54++) {
                                            f436d[i54] = this.f450a;
                                        }
                                        this.f455b[28] = 0;
                                        f436d[7] = this.f454b + 3840;
                                        mo213a(31, 0);
                                        this.f455b[12] = 0;
                                    }
                                }
                                break;
                            case 36:
                                int[] iArr44 = this.f455b;
                                iArr44[28] = iArr44[28] + 512;
                                int[] iArr45 = f436d;
                                iArr45[7] = iArr45[7] + 768;
                                f436d[0] = ((C0004e) f425a).f450a - (this.f455b[28] * 3);
                                f436d[1] = ((C0004e) f425a).f450a - (this.f455b[28] << 1);
                                f436d[2] = ((C0004e) f425a).f450a - this.f455b[28];
                                f436d[3] = ((C0004e) f425a).f450a;
                                f436d[4] = ((C0004e) f425a).f450a + this.f455b[28];
                                f436d[5] = ((C0004e) f425a).f450a + (this.f455b[28] << 1);
                                f436d[6] = ((C0004e) f425a).f450a + (this.f455b[28] * 3);
                                if (this.f455b[28] >= 7680) {
                                    this.f467j = 37;
                                    this.f455b[11] = 0;
                                    System.arraycopy(f429a[0], 0, f427a, 1, 5);
                                }
                                break;
                            case 37:
                                if (this.f455b[11] < 190) {
                                    if (this.f455b[11] % 38 == 0) {
                                        System.arraycopy(f429a[this.f455b[11] / 38], 0, f427a, 1, 5);
                                    }
                                    int[] iArr46 = this.f455b;
                                    iArr46[11] = iArr46[11] + 1;
                                } else {
                                    this.f467j = 39;
                                }
                                for (int i55 = 0; i55 < 7; i55++) {
                                    if (f427a[i55]) {
                                        if (i55 != 0 && i55 != 6 && this.f455b[11] % 38 >= 0 && this.f455b[11] % 38 <= 18) {
                                            break;
                                        } else if (f436d[i55] > ((C0004e) f425a).f450a + ((C0004e) f425a).f452a[0] && f436d[i55] < ((C0004e) f425a).f450a + ((C0004e) f425a).f452a[2]) {
                                            f425a.mo217a(this, 0);
                                            this.f467j = 38;
                                        }
                                    }
                                }
                                break;
                            case 38:
                                if (((C0004e) f425a).f455b[17] > 0) {
                                    f436d[0] = ((C0004e) f425a).f450a - (this.f455b[28] * 3);
                                    f436d[1] = ((C0004e) f425a).f450a - (this.f455b[28] << 1);
                                    f436d[2] = ((C0004e) f425a).f450a - this.f455b[28];
                                    f436d[3] = ((C0004e) f425a).f450a;
                                    f436d[4] = ((C0004e) f425a).f450a + this.f455b[28];
                                    f436d[5] = ((C0004e) f425a).f450a + (this.f455b[28] << 1);
                                    f436d[6] = ((C0004e) f425a).f450a + (this.f455b[28] * 3);
                                } else {
                                    this.f467j = 37;
                                    this.f455b[11] = this.f455b[11] - (this.f455b[11] % 38);
                                }
                                break;
                            case 39:
                                if (this.f455b[12] < 20) {
                                    int[] iArr47 = this.f455b;
                                    iArr47[12] = iArr47[12] + 1;
                                } else {
                                    this.f467j = 13;
                                    this.f455b[10] = 27;
                                }
                                break;
                        }
                        break;
                }
                break;
            case 65543:
                if (this.f455b[2] == 1) {
                    int[] iArr48 = this.f455b;
                    iArr48[3] = iArr48[3] + AbstractRunnableC0012m.f622a_;
                }
                switch (this.f467j) {
                    case 1:
                        mo213a(this.f455b[0], 6);
                        switch (this.f455b[0]) {
                            case 0:
                                this.f455b[1] = 4;
                                this.f467j = 2;
                                this.f471n |= 495;
                                break;
                            case 2:
                            case 5:
                            case 12:
                            case 15:
                            case 16:
                            case 19:
                            case 22:
                            case 25:
                            case 28:
                            case 31:
                            case 34:
                            case 37:
                                this.f467j = 8;
                                break;
                            case 3:
                                this.f455b[1] = 2;
                                this.f467j = 2;
                                this.f471n |= 495;
                                break;
                            case 6:
                                this.f455b[1] = 16;
                                this.f467j = 2;
                                this.f471n |= 495;
                                break;
                            case 8:
                                this.f455b[1] = 1;
                                this.f467j = 2;
                                break;
                            case 10:
                                this.f455b[1] = 8;
                                this.f467j = 2;
                                this.f471n |= 495;
                                break;
                            case 13:
                                this.f455b[1] = 32;
                                this.f467j = 2;
                                this.f471n |= 495;
                                break;
                            case 17:
                            case 20:
                            case 23:
                            case 26:
                            case 29:
                            case 32:
                            case 35:
                                this.f467j = 16;
                                break;
                        }
                        break;
                    case 2:
                        f425a.m234b();
                        m199k(0);
                        if (this.f455b[2] == 1) {
                            this.f450a += this.f469l;
                            this.f454b += this.f470m;
                            this.f470m += this.f455b[4];
                            this.f469l -= this.f469l >> 4;
                            m193h();
                            m242g();
                            m238d();
                            if (this.f455b[3] >= AbstractRunnableC0012m.f622a_ * 8) {
                                if (this.f455b[3] >= ((C0004e) f425a).f455b[22]) {
                                    C0003d.m96b(this);
                                }
                            }
                        }
                        if (this.f455b[1] == 1) {
                            if (AbstractRunnableC0012m.m371d(((C0004e) f425a).f450a - this.f450a) < ((C0004e) f425a).f455b[21] && AbstractRunnableC0012m.m371d(((C0004e) f425a).f454b - this.f454b) < ((C0004e) f425a).f455b[21]) {
                                this.f455b[6] = 1;
                            }
                            if (this.f455b[6] == 1) {
                                int iM371d = AbstractRunnableC0012m.m371d(((C0004e) f425a).f450a - this.f450a) / 3;
                                int iM371d2 = AbstractRunnableC0012m.m371d(((C0004e) f425a).f454b - this.f454b) / 3;
                                if (AbstractRunnableC0012m.m371d(((C0004e) f425a).f450a - this.f450a) < 2560 || AbstractRunnableC0012m.m371d(((C0004e) f425a).f454b - this.f454b) < 2560) {
                                    iM371d = AbstractRunnableC0012m.m371d(((C0004e) f425a).f450a - this.f450a);
                                    iM371d2 = AbstractRunnableC0012m.m371d(((C0004e) f425a).f454b - this.f454b);
                                }
                                if (((C0004e) f425a).f450a < this.f450a) {
                                    iM371d = -iM371d;
                                }
                                if (((C0004e) f425a).f454b < this.f454b) {
                                    iM371d2 = -iM371d2;
                                }
                                this.f450a = iM371d + this.f450a;
                                this.f454b = iM371d2 + this.f454b;
                            }
                        }
                        f425a.m175b(f434c);
                        m202l(4);
                        if (m170a(f434c, 0, f434c, 4)) {
                            if (m205m() || m200k() || this.f455b[1] == 1) {
                                mo217a((C0004e) f425a, 0);
                                if (this.f455b[1] != 1) {
                                    m151a(1073741824, 4, 10, this.f450a >> 8, this.f454b >> 8, this.f461e + 1, 0);
                                }
                            }
                        }
                        break;
                    case 4:
                        if (m211a() == m283e() - 1) {
                            C0003d.m96b(this);
                        }
                        break;
                    case 8:
                        if (this.f455b[1] != 1) {
                            if (this.f505C - this.f470m < 55) {
                                C0003d.m67a(this.f455b[0], 3000);
                                C0003d.m96b(this);
                            } else {
                                this.f504B -= this.f469l;
                                this.f505C -= this.f470m;
                            }
                        }
                        break;
                    case 16:
                        if (m211a() == m283e() - 1) {
                            mo213a(this.f455b[0] + 1, 6);
                            this.f467j = 32;
                        }
                        break;
                    case 32:
                        if (m211a() == m283e() - 1) {
                            m160a((short) (this.f455b[0] + 2), this.f450a, this.f454b);
                            C0003d.m96b(this);
                        }
                        break;
                }
                break;
            case 65545:
                switch (this.f467j) {
                    case 1:
                        mo213a(0, 0);
                        m234b();
                        f425a.m234b();
                        if (this.f452a != null && ((C0004e) f425a).f452a != null) {
                            if (m195i()) {
                                if (m168a(this, f425a)) {
                                    mo217a((C0004e) f425a, 0);
                                }
                            } else if (m169a(f425a, this.f455b)) {
                                this.f470m = 6400;
                                this.f469l = 0;
                                this.f455b[4] = 0;
                                this.f467j = 2;
                            }
                            break;
                        }
                        break;
                    case 2:
                        this.f454b -= this.f470m;
                        this.f450a += this.f469l;
                        this.f470m -= 512;
                        if (this.f470m < 0 && this.f455b[4] == 1) {
                            mo213a(4, 0);
                            this.f467j = 4;
                        } else if (Math.abs(this.f470m) == 6912 && this.f455b[4] == 0) {
                            mo213a(0, 0);
                            this.f467j = 1;
                        } else if (this.f455b[4] == 1) {
                            mo213a(3, 6);
                        } else if (this.f470m > 0) {
                            mo213a(1, 4);
                        } else if (this.f470m < 0) {
                            mo213a(2, 4);
                        }
                        break;
                    case 4:
                        if (m211a() == m283e() - 1) {
                            C0003d.m96b(this);
                        }
                        break;
                }
                break;
            case 65547:
                m190e((C0004e) null);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    boolean mo240e() {
        return this.f448G <= 0;
    }

    /* JADX INFO: renamed from: f */
    void mo241f() {
        byte b;
        int i;
        if ((((RunnableC0006g) this).f509a != null || this.f462f == 43 || this.f462f == 47 || this.f462f == 57) && (this.f506D & 8388608) == 0 && (this.f506D & 262144) == 0) {
            if (this.f462f == 55 && C0003d.f338d) {
                return;
            }
            if (this.f462f == 65543 && this.f455b[2] == 1 && C0003d.f344e % 2 == 1 && this.f455b[3] >= (((C0004e) f425a).f455b[22] * 3) / 5) {
                return;
            }
            if (this.f462f == 65542 && ((m278c() == 30 || m278c() == 29) && C0003d.f344e % 2 == 1)) {
                return;
            }
            if (this.f462f == 42) {
                Graphics graphics = AbstractRunnableC0012m.f611a;
                int i2 = (this.f450a >> 8) - C0003d.f375m;
                int i3 = (this.f454b >> 8) - C0003d.f378n;
                int i4 = this.f455b[6];
                int iM354b = (AbstractRunnableC0012m.m354b(i4 >> 8) * 2304) >> 8;
                int iM363c = (AbstractRunnableC0012m.m363c(i4 >> 8) * 2304) >> 8;
                int i5 = this.f455b[3] - 1;
                int i6 = i2 << 8;
                ((RunnableC0006g) this).f509a.m324c(this.f455b[4]);
                ((RunnableC0006g) this).f509a.m312a(graphics, this.f455b[0], C0003d.f344e % ((RunnableC0006g) this).f509a.m303a(this.f455b[0]), i2, i3, this.f506D, 0, 0);
                int iM363c2 = (i3 << 8) + 2304;
                for (int i7 = 1; i7 <= i5; i7++) {
                    ((RunnableC0006g) this).f509a.m312a(graphics, 1, 0, i6 >> 8, iM363c2 >> 8, 0, 0, 0);
                    int iM363c3 = (i6 + iM354b) - ((AbstractRunnableC0012m.m363c(((i7 - 1) << 7) / i5) * iM354b) >> 10);
                    iM363c2 = iM363c2 + iM363c + ((AbstractRunnableC0012m.m363c(((i7 - 1) << 7) / i5) * iM363c) >> 10);
                    i6 = iM363c3;
                }
                return;
            }
            int iM194i = m194i(this.f450a);
            int iM196j = m196j(this.f454b);
            if (this.f462f != 65543 || this.f455b[5] != 1) {
                m279c(iM194i, iM196j);
            }
            if (this.f462f == 48 && this.f455b[11] == 1 && !C0003d.f346e) {
                if (this.f455b[10] <= 30) {
                    int[] iArr = this.f455b;
                    iArr[10] = iArr[10] + 1;
                } else {
                    int[] iArr2 = this.f455b;
                    iArr2[8] = iArr2[8] + 8;
                    int[] iArr3 = this.f455b;
                    iArr3[9] = iArr3[9] - 6;
                    if (this.f455b[8] >= 190) {
                        this.f455b[8] = 190;
                    }
                    if (this.f455b[9] <= 30) {
                        this.f455b[9] = 30;
                    }
                }
                if (((RunnableC0006g) this).f509a != null) {
                    ((RunnableC0006g) this).f509a.m312a(AbstractRunnableC0012m.f611a, 2, 0, this.f455b[8] + C0003d.f163B, this.f455b[9] + C0003d.f166C, 0, 0, 0);
                }
                int i8 = this.f455b[7] % 10;
                int i9 = this.f455b[7] / 10;
                if (C0003d.f212a[22] != null) {
                    C0003d.f212a[22].m312a(AbstractRunnableC0012m.f611a, i8 + 12, 0, this.f455b[8] + 6 + C0003d.f163B, this.f455b[9] + 13 + C0003d.f166C, 0, 0, 0);
                    C0003d.f212a[22].m312a(AbstractRunnableC0012m.f611a, i9 + 12, 0, (this.f455b[8] - 6) + C0003d.f163B, this.f455b[9] + 13 + C0003d.f166C, 0, 0, 0);
                }
                if (this.f455b[15] == 1) {
                    int[] iArr4 = this.f455b;
                    iArr4[13] = iArr4[13] + 2;
                    if (this.f455b[13] >= 120) {
                        this.f455b[13] = 120;
                    }
                    ((RunnableC0006g) this).f509a.m312a(AbstractRunnableC0012m.f611a, 3, this.f455b[14] > 2 ? 1 : 0, (this.f455b[13] >= 120 ? (f425a.f504B - this.f455b[12]) >> 2 : 0) + this.f455b[12], this.f455b[13], 0, 0, 0);
                    int[] iArr5 = this.f455b;
                    iArr5[14] = iArr5[14] + 1;
                    if (this.f455b[14] >= 6) {
                        this.f455b[14] = 0;
                    }
                }
            }
            if (this.f462f == 48 && (this.f467j == 0 || this.f467j == 3)) {
                return;
            }
            if (this.f462f == 196608 && f424a != null && f424a.f467j != 0) {
                f424a.m279c((f424a.f450a >> 8) - RunnableC0006g.m266e(1), (f424a.f454b >> 8) - RunnableC0006g.m268f(1));
                int iM182c = m182c(AbstractRunnableC0012m.m364c(Math.abs(((C0004e) f425a).f450a - f424a.f450a), Math.abs(f424a.f454b - ((C0004e) f425a).f454b)));
                if (iM182c > 6) {
                    iM182c = 6;
                }
                byte b2 = ((C0004e) f425a).f450a < f424a.f450a ? (byte) 1 : (byte) -1;
                if (f424a.m278c() == 7) {
                    b = (f425a.f506D & 1) == 0 ? (byte) 1 : (byte) -1;
                    i = 7;
                } else {
                    b = b2;
                    i = iM182c;
                }
                AbstractRunnableC0012m.f611a.setColor(1613039);
                AbstractRunnableC0012m.m347a(f425a.f504B + (f432b[i][0] * b), f425a.f505C + f432b[i][1], f424a.f504B + (f435c[i << 1][0] * b), f424a.f505C + f435c[i << 1][1], f424a.f504B + (f435c[(i << 1) + 1][0] * b), f424a.f505C + f435c[(i << 1) + 1][1]);
                AbstractRunnableC0012m.f611a.setColor(8421504);
                AbstractRunnableC0012m.m347a(f425a.f504B + (f432b[i][0] * b), f425a.f505C + f432b[i][1], f424a.f504B + (f437d[i << 1][0] * b), f424a.f505C + f437d[i << 1][1], f424a.f504B + (f437d[(i << 1) + 1][0] * b), f424a.f505C + f437d[(i << 1) + 1][1]);
            }
            if (this.f462f == 61 && (f430b.f467j == 23 || f430b.f467j == 24 || f430b.f467j == 25 || f430b.f467j == 26 || f430b.f467j == 14 || f430b.f467j == 15 || f430b.f467j == 16 || f430b.f467j == 29 || f430b.f467j == 30 || f430b.f467j == 31)) {
                C0003d.f212a[30].m312a(AbstractRunnableC0012m.f611a, 34, 0, ((f430b.f455b[21] >> 8) - C0003d.f375m) + 63, 190 - C0003d.f378n, 0, 0, 0);
            }
            m285m();
            if (this.f462f == 60 && m278c() == 38) {
                C0003d.f212a[29].m312a(AbstractRunnableC0012m.f611a, 166, m211a(), (this.f450a >> 8) - C0003d.f375m, (this.f454b >> 8) - C0003d.f378n, this.f506D, 0, 0);
            }
            if (this.f462f == 45 && this.f467j == 4) {
                C0003d.f276b[0].m313a(AbstractRunnableC0012m.f611a, new StringBuffer().append("").append((((this.f455b[0] * 1000) - this.f455b[3]) / 1000) + 1).toString(), this.f504B - 5, this.f505C - 45, 0);
            } else if ((this.f462f == 65542 || this.f462f == 67) && ((this.f467j == 256 || this.f467j == 512) && this.f455b[18] >= 1)) {
                C0003d.f276b[0].m313a(AbstractRunnableC0012m.f611a, new StringBuffer().append("").append(this.f455b[18]).toString(), this.f504B - 5, ((this.f452a[1] >> 8) + this.f505C) - 20, 0);
            } else if (this.f462f == 65539 && this.f467j == 4) {
                if (this.f455b[16] != -1) {
                    AbstractRunnableC0012m.m375d(16711680);
                    AbstractRunnableC0012m.m360b((this.f455b[5] >> 8) - C0003d.f375m, (this.f455b[6] >> 8) - C0003d.f378n, this.f455b[16] - C0003d.f375m, this.f455b[17] - C0003d.f378n);
                    AbstractRunnableC0012m.m360b(((this.f455b[5] >> 8) - C0003d.f375m) + 1, (this.f455b[6] >> 8) - C0003d.f378n, (this.f455b[16] - C0003d.f375m) + 1, this.f455b[17] - C0003d.f378n);
                }
                if (this.f455b[25] == 0) {
                    C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 28, C0003d.f344e % 4, this.f455b[16] - C0003d.f375m, this.f455b[17] - C0003d.f378n, 0, 0, 0);
                } else if (this.f455b[25] == 1 && this.f455b[16] != -1) {
                    C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 27, C0003d.f344e % 4, this.f455b[16] - C0003d.f375m, this.f455b[17] - C0003d.f378n, 0, 0, 0);
                }
                if (this.f455b[25] == 1 && this.f455b[18] != -1) {
                    AbstractRunnableC0012m.m375d(16711680);
                    AbstractRunnableC0012m.m360b((this.f455b[5] >> 8) - C0003d.f375m, (this.f455b[6] >> 8) - C0003d.f378n, this.f455b[18] - C0003d.f375m, this.f455b[19] - C0003d.f378n);
                    AbstractRunnableC0012m.m360b(((this.f455b[5] >> 8) - C0003d.f375m) + 1, (this.f455b[6] >> 8) - C0003d.f378n, (this.f455b[18] - C0003d.f375m) + 1, this.f455b[19] - C0003d.f378n);
                    C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 27, C0003d.f344e % 4, this.f455b[18] - C0003d.f375m, this.f455b[19] - C0003d.f378n, 0, 0, 0);
                }
            } else if (this.f462f == 65539 && this.f467j == 16 && ((C0004e) f425a).f454b <= 71680) {
                if (this.f455b[12] >= 0) {
                    C0003d.f212a[22].m312a(AbstractRunnableC0012m.f611a, 35, this.f455b[12], this.f450a < 0 ? 10 : 230, 140, 0, 0, 0);
                }
            } else if (this.f462f == 65539 && (this.f467j == 7 || this.f467j == 8 || this.f467j == 9 || this.f467j == 11 || this.f467j == 10 || this.f467j == 6)) {
                if (this.f467j == 9) {
                    C0003d.f212a[22].m312a(AbstractRunnableC0012m.f611a, 40, this.f455b[11] % 4, this.f504B, this.f505C - 20, 0, 0, 0);
                }
                C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 15, this.f455b[11] % 18, this.f504B, this.f467j == 6 ? this.f505C : 140, 0, 0, 0);
                int[] iArr6 = this.f455b;
                iArr6[11] = iArr6[11] + 1;
            }
            if (this.f462f == 65539 && (this.f467j == 36 || this.f467j == 38)) {
                int i10 = 0;
                while (true) {
                    int i11 = i10;
                    if (i11 >= 7) {
                        break;
                    }
                    C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 16, C0003d.f344e % 3, (f436d[i11] >> 8) - C0003d.f375m, (f436d[7] >> 8) - C0003d.f378n, 0, 0, 0);
                    i10 = i11 + 1;
                }
            }
            if (this.f462f == 65539 && (this.f467j == 37 || (this.f467j == 38 && ((C0004e) f425a).f455b[17] == 50))) {
                AbstractRunnableC0012m.m375d(16711680);
                int i12 = 0;
                while (true) {
                    int i13 = i12;
                    if (i13 >= 7) {
                        break;
                    }
                    if (!f427a[i13]) {
                        C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 16, C0003d.f344e % 3, (f436d[i13] >> 8) - C0003d.f375m, (f436d[7] >> 8) - C0003d.f378n, 0, 0, 0);
                    } else if (i13 == 0 || i13 == 6 || this.f455b[11] % 38 < 0 || this.f455b[11] % 38 > 18) {
                        AbstractRunnableC0012m.m360b((f436d[i13] >> 8) - C0003d.f375m, (f436d[7] >> 8) - C0003d.f378n, (f436d[i13] >> 8) - C0003d.f375m, ((C0003d.f201a.f452a[1] >> 8) + 280) - C0003d.f378n);
                        AbstractRunnableC0012m.m360b(((f436d[i13] >> 8) - C0003d.f375m) + 1, (f436d[7] >> 8) - C0003d.f378n, ((f436d[i13] >> 8) - C0003d.f375m) + 1, ((C0003d.f201a.f452a[1] >> 8) + 280) - C0003d.f378n);
                        C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 30, 0, (f436d[i13] >> 8) - C0003d.f375m, (f436d[7] >> 8) - C0003d.f378n, 0, 0, 0);
                        C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 27, C0003d.f344e % 4, (f436d[i13] >> 8) - C0003d.f375m, ((C0003d.f201a.f452a[1] >> 8) + 280) - C0003d.f378n, 0, 0, 0);
                    } else {
                        C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 30, C0003d.f344e % 3, (f436d[i13] >> 8) - C0003d.f375m, (f436d[7] >> 8) - C0003d.f378n, 0, 0, 0);
                    }
                    i12 = i13 + 1;
                }
            }
            if (this.f462f == 65539 && this.f467j == 39) {
                int i14 = 0;
                while (true) {
                    int i15 = i14;
                    if (i15 >= 7) {
                        break;
                    }
                    if (C0003d.f344e % 2 != 0) {
                        C0003d.f212a[14].m312a(AbstractRunnableC0012m.f611a, 16, 0, (f436d[i15] >> 8) - C0003d.f375m, (f436d[7] >> 8) - C0003d.f378n, 0, 0, 0);
                    }
                    i14 = i15 + 1;
                }
            }
            if (this.f462f == 196608 && f430b != null && f430b.f467j == 17) {
                C0003d.f212a[35].m312a(AbstractRunnableC0012m.f611a, 0, f430b.f455b[15] % 5, f430b.f455b[16], f430b.f455b[17], 0, 0, 0);
            }
            if (this.f462f == 55 && this.f467j == 21) {
                C0003d.f212a[30].m312a(AbstractRunnableC0012m.f611a, 27, 0, this.f455b[7] - C0003d.f375m, this.f455b[8], 0, 0, 0);
            }
            if (this.f462f == 55 && this.f467j == 22) {
                C0003d.f212a[30].m312a(AbstractRunnableC0012m.f611a, 9, 0, this.f455b[7] - C0003d.f375m, this.f455b[8], this.f455b[25] == 0 ? 0 : 1, 0, 0);
            }
            if (this.f462f == 196608 && C0003d.m105c(C0003d.f402v) && f430b != null && (f430b.f467j == 17 || f430b.f467j == 4)) {
                int i16 = 0;
                while (true) {
                    int i17 = i16;
                    if (i17 >= 5) {
                        break;
                    }
                    if (f436d[i17 * 3] != 0) {
                        if (f436d[(i17 * 3) + 2] >= 0) {
                            C0003d.f212a[35].m312a(AbstractRunnableC0012m.f611a, 1, f436d[(i17 * 3) + 2], (f436d[i17 * 3] - (C0003d.f375m << 8)) >> 8, f436d[(i17 * 3) + 1] >> 8, 0, 0, 0);
                            int[] iArr7 = f436d;
                            int i18 = (i17 * 3) + 2;
                            iArr7[i18] = iArr7[i18] - 1;
                        } else {
                            C0003d.f212a[35].m312a(AbstractRunnableC0012m.f611a, 2, 0, (f436d[i17 * 3] - (C0003d.f375m << 8)) >> 8, f436d[(i17 * 3) + 1] >> 8, 0, 0, 0);
                        }
                    }
                    i16 = i17 + 1;
                }
            }
            if (C0003d.m107d(1)) {
                if (this.f462f == 196608 || this.f462f == 65545 || this.f462f == 65542 || this.f462f == 67 || this.f462f == 65543 || this.f462f == 41 || this.f462f == 43 || this.f462f == 57 || this.f462f == 44 || this.f462f == 47 || this.f462f == 49 || this.f462f == 65538 || this.f462f == 53 || this.f462f == 55 || this.f462f == 60 || this.f462f == 65537) {
                    m234b();
                    AbstractRunnableC0012m.f611a.setColor(16711680);
                    AbstractRunnableC0012m.f611a.drawRect(((this.f452a[0] + this.f450a) >> 8) - C0003d.f375m, ((this.f452a[1] + this.f454b) >> 8) - C0003d.f378n, (this.f452a[2] - this.f452a[0]) >> 8, (this.f452a[3] - this.f452a[1]) >> 8);
                    AbstractRunnableC0012m.f611a.drawRect((this.f450a >> 8) - C0003d.f375m, (this.f454b >> 8) - C0003d.f378n, 1, 1);
                    if (this.f462f == 65545 || this.f462f == 65542 || this.f462f == 67 || this.f462f == 43 || this.f462f == 47 || this.f462f == 53 || this.f462f == 57) {
                        AbstractRunnableC0012m.f611a.setColor(16711680);
                        AbstractRunnableC0012m.f611a.drawRect((this.f455b[0] >> 8) - C0003d.f375m, (this.f455b[1] >> 8) - C0003d.f378n, (this.f455b[2] - this.f455b[0]) >> 8, (this.f455b[3] - this.f455b[1]) >> 8);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m242g() {
        int i;
        byte b = -1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 3) {
                break;
            }
            for (int i4 = 0; i4 < 8; i4++) {
                this.f453a[i3][i4] = 0;
            }
            i2 = i3 + 1;
        }
        if (this.f452a[2] <= this.f452a[0] || this.f452a[3] <= this.f452a[1]) {
            return;
        }
        if ((this.f472o & 2) != 0 && this.f470m > 0) {
            b = 1;
        }
        byte b2 = (this.f472o & 4) != 0 ? (byte) 2 : (byte) -1;
        if (b >= 0 || b2 >= 0) {
            int i5 = 0;
            boolean z = true;
            int i6 = 0;
            int i7 = (((this.f454b + this.f452a[3]) + 256) >> 8) / 20;
            int i8 = (((this.f450a + this.f452a[0]) + 2560) >> 8) / 20;
            int i9 = ((((this.f450a + this.f452a[2]) + 5120) - 256) >> 8) / 20;
            if (i8 == i9 && this.f452a[0] != this.f452a[2]) {
                i9++;
            }
            while (i8 < i9) {
                int iM54a = C0003d.m54a(i8, i7);
                if (i5 + 1 >= 8) {
                    break;
                }
                i5++;
                if (b >= 0) {
                    this.f453a[b][i5] = (byte) iM54a;
                }
                if (b2 >= 0) {
                    this.f453a[b2][i5] = (byte) iM54a;
                }
                if (iM54a != 0) {
                    z = false;
                    if (iM54a == 1) {
                        i6 |= 16;
                    } else if (iM54a == 2) {
                        i6 |= 32;
                    }
                }
                i8++;
            }
            int i10 = i5 | i6;
            if (z) {
                i10 = 0;
            }
            if (b >= 0) {
                this.f453a[b][0] = (byte) i10;
            }
            if (b2 >= 0) {
                this.f453a[b2][0] = (byte) i10;
            }
        }
        if ((this.f472o & 2) != 0 && this.f470m < 0) {
            int i11 = 0;
            boolean z2 = true;
            int i12 = 0;
            int i13 = (((this.f454b + this.f452a[1]) - 256) >> 8) / 20;
            int i14 = (((this.f450a + this.f452a[0]) + 2560) >> 8) / 20;
            int i15 = ((((this.f450a + this.f452a[2]) + 5120) - 256) >> 8) / 20;
            if (i14 == i15 && this.f452a[0] != this.f452a[2]) {
                i15++;
            }
            while (i14 < i15) {
                int iM54a2 = C0003d.m54a(i14, i13);
                i11++;
                this.f453a[1][i11] = (byte) iM54a2;
                if (iM54a2 != 0) {
                    z2 = false;
                    if (iM54a2 == 1) {
                        i12 |= 16;
                    }
                }
                i14++;
            }
            int i16 = i11 | i12;
            if (z2) {
                i16 = 0;
            }
            this.f453a[1][0] = (byte) i16;
        }
        if ((this.f472o & 1) != 0) {
            if (this.f469l == 0 && (this.f459d == null || this.f459d.f469l == 0)) {
                return;
            }
            int i17 = 0;
            boolean z3 = true;
            int i18 = 0;
            if (this.f469l > 0 || (this.f459d != null && this.f459d.f469l > 0)) {
                i = (((this.f450a + this.f452a[2]) + 256) >> 8) / 20;
            } else {
                int i19 = ((this.f450a + this.f452a[0]) - 256) >> 8;
                i = i19 / 20;
                if (i19 < 0 && i == 0) {
                    i = -1;
                }
            }
            int i20 = ((this.f454b + this.f452a[1]) >> 8) / 20;
            int i21 = ((((this.f454b + this.f452a[3]) + 5120) - 256) >> 8) / 20;
            if (i20 == i21 && this.f452a[1] != this.f452a[3]) {
                i21++;
            }
            int i22 = i20;
            while (i22 < i21) {
                int iM54a3 = C0003d.m54a(i, i22);
                if (i17 + 1 >= 8) {
                    i17 = 1 / 0;
                }
                int i23 = i17 + 1;
                this.f453a[0][i23] = (byte) iM54a3;
                if (iM54a3 != 0) {
                    z3 = false;
                    if (iM54a3 == 1) {
                        i18 |= 16;
                    }
                }
                i22++;
                i17 = i23;
            }
            int i24 = i17 | i18;
            if (z3) {
                i24 = 0;
            }
            this.f453a[0][0] = (byte) i24;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0180  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX INFO: renamed from: h */
    public final void m243h() {
        int i;
        int i2;
        if (this.f457c) {
            return;
        }
        this.f457c = true;
        if (this.f462f == 196608) {
            if (f425a.m429f()) {
                f425a.m439s();
                this.f457c = false;
                return;
            } else if (f425a.f467j == 5 || (f425a.f467j == 16 && (f425a.f468k & 2048) != 0)) {
                this.f457c = false;
                return;
            }
        } else if (this.f473u >= 0 && (this.f506D & 2048) != 0) {
            m228b(this.f477y, 0);
            this.f457c = false;
            return;
        }
        if (this.f469l == 0 && this.f470m == 0 && (this.f472o & 4) == 0) {
            this.f457c = false;
            return;
        }
        int i3 = this.f469l;
        int i4 = this.f470m;
        int iAbs = Math.abs(i3);
        if (iAbs < Math.abs(i4)) {
            iAbs = Math.abs(i4);
        }
        int i5 = 4864;
        int i6 = 4864;
        int i7 = iAbs / 4864;
        int i8 = this.f450a;
        int i9 = this.f454b;
        if (this.f462f == 196608) {
            if (f425a.m436k()) {
                i7 = -1;
                C0013n.f667H = -1;
            } else {
                C0013n.f667H |= 65535;
            }
            if (i7 < 0) {
                this.f457c = false;
                return;
            }
        }
        int i10 = 0;
        int i11 = i9;
        int i12 = i8;
        while (i10 < i7 + 1) {
            int i13 = i3 < 0 ? -i5 : i5;
            if (Math.abs(i3) < Math.abs(i13)) {
                i13 = i3;
            }
            int i14 = i3 - i13;
            this.f450a = i13 + this.f450a;
            int i15 = i4 < 0 ? -i6 : i6;
            if (Math.abs(i4) < Math.abs(i15)) {
                i15 = i4;
            }
            i4 -= i15;
            this.f454b = i15 + this.f454b;
            m242g();
            if (this.f462f != 196608) {
                if ((this.f506D & 2048) != 0 && m193h()) {
                    break;
                }
                m238d();
                if ((this.f471n & 1024) != 0 && ((C0004e) f425a).f459d == this) {
                    C0013n c0013n = f425a;
                    ((C0004e) c0013n).f450a = (this.f450a - i12) + ((C0004e) c0013n).f450a;
                    C0013n c0013n2 = f425a;
                    ((C0004e) c0013n2).f454b = (this.f454b - i11) + ((C0004e) c0013n2).f454b;
                }
                if (this.f469l == 0) {
                    i2 = 0;
                    i5 = 0;
                } else {
                    i2 = i14;
                }
                if (this.f470m == 0) {
                    i6 = 0;
                    i4 = 0;
                }
                if (i2 != 0) {
                }
                i12 = this.f450a;
                i11 = this.f454b;
                i10++;
                i3 = i2;
            } else {
                if (!f425a.m432i()) {
                    break;
                }
                if (this.f469l == 0) {
                    i2 = 0;
                    i5 = 0;
                } else {
                    i2 = i14;
                }
                if (this.f470m == 0) {
                    i6 = 0;
                    i4 = 0;
                }
                if (i2 != 0 && i4 == 0) {
                    break;
                }
                i12 = this.f450a;
                i11 = this.f454b;
                i10++;
                i3 = i2;
            }
        }
        if (this.f450a != i8 && this.f462f == 196608) {
            f433c.m185c(this);
            f433c.f472o = 33;
            f433c.f469l = f433c.f450a - i8;
            int iAbs2 = 256 > Math.abs(f433c.f469l) ? Math.abs(f433c.f469l) : 256;
            int i16 = f433c.f469l;
            if (i16 < 0) {
                i = -1;
            } else {
                i = i16 > 0 ? 1 : 0;
            }
            int i17 = iAbs2 * (-i);
            C0004e c0004e = f433c;
            c0004e.f450a = i17 + c0004e.f450a;
            int i18 = f433c.f450a;
            f433c.f470m = 0;
            f433c.f473u = -1;
            f433c.m242g();
            f433c.m238d();
            if (i18 != f433c.f450a) {
                this.f450a = f433c.f450a;
            }
        }
        this.f457c = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m244i() {
        int i = this.f455b[2];
        if ((i & 1) != 0) {
            C0003d.f387q = 0;
        }
        if ((i & 4) != 0) {
            C0003d.f381o = (C0003d.f362i * 20) - C0003d.f355g;
        }
        if ((i & 2) != 0) {
            C0003d.f390r = 0;
        }
        if ((i & 8) != 0) {
            C0003d.f384p = (C0003d.f366j * 20) - C0003d.f358h;
        }
        C0003d.f160A = 12;
    }

    /* JADX INFO: renamed from: j */
    public final void m245j() {
        if (this.f455b != null) {
            if (this.f455b[0] == 0 && this.f455b[1] == 0) {
                return;
            }
            this.f450a += this.f455b[0];
            this.f454b += this.f455b[1];
            m234b();
        }
    }

    /* JADX INFO: renamed from: k */
    final void m246k() {
        int iM303a = ((RunnableC0006g) f425a).f509a.m303a(81);
        int i = (this.f455b[6] / 1661) + (iM303a / 2);
        if (this.f455b[9] == 0) {
            f425a.m218a(false);
        } else {
            f425a.m218a(true);
            i = iM303a - i;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= iM303a) {
            i = iM303a - 1;
        }
        f425a.mo213a(81, 0);
        f425a.m281d(i);
    }
}
