package com.jcraft.jzlib;

import com.mascotcapsule.eruption.docomostar.Appearance;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class InfTree {
    static final int BMAX = 15;
    private static final int MANY = 1440;
    private static final int Z_BUF_ERROR = -5;
    private static final int Z_DATA_ERROR = -3;
    private static final int Z_ERRNO = -1;
    private static final int Z_MEM_ERROR = -4;
    private static final int Z_NEED_DICT = 2;
    private static final int Z_OK = 0;
    private static final int Z_STREAM_END = 1;
    private static final int Z_STREAM_ERROR = -2;
    private static final int Z_VERSION_ERROR = -6;
    static final int fixed_bd = 5;
    static final int fixed_bl = 9;
    static final int[] fixed_tl = {96, 7, Appearance.LIGHTTWOSIDE, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, 112, 0, 8, 48, 0, 9, 192, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, 9, 160, 0, 8, 0, 0, 8, 128, 0, 8, 64, 0, 9, 224, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, 9, 144, 83, 7, 59, 0, 8, 120, 0, 8, 56, 0, 9, 208, 81, 7, 17, 0, 8, 104, 0, 8, 40, 0, 9, 176, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, 9, 240, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, 9, 200, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, 9, 168, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, 9, 232, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, 9, 152, 84, 7, 83, 0, 8, 124, 0, 8, 60, 0, 9, 216, 82, 7, 23, 0, 8, 108, 0, 8, 44, 0, 9, 184, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, 9, 248, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, 9, 196, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, 9, 164, 0, 8, 2, 0, 8, 130, 0, 8, 66, 0, 9, 228, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, 9, 148, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, 9, 212, 82, 7, 19, 0, 8, 106, 0, 8, 42, 0, 9, 180, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, 9, 244, 80, 7, 5, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, 9, 204, 81, 7, 15, 0, 8, 102, 0, 8, 38, 0, 9, 172, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, 9, 236, 80, 7, 9, 0, 8, 94, 0, 8, 30, 0, 9, 156, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, 9, 220, 82, 7, 27, 0, 8, 110, 0, 8, 46, 0, 9, 188, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, 9, 252, 96, 7, Appearance.LIGHTTWOSIDE, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, 113, 0, 8, 49, 0, 9, 194, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, 9, 162, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, 9, 226, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, 9, 146, 83, 7, 59, 0, 8, 121, 0, 8, 57, 0, 9, 210, 81, 7, 17, 0, 8, 105, 0, 8, 41, 0, 9, 178, 0, 8, 9, 0, 8, 137, 0, 8, 73, 0, 9, 242, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, 117, 0, 8, 53, 0, 9, 202, 81, 7, 13, 0, 8, 101, 0, 8, 37, 0, 9, 170, 0, 8, 5, 0, 8, 133, 0, 8, 69, 0, 9, 234, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, 9, 154, 84, 7, 83, 0, 8, 125, 0, 8, 61, 0, 9, 218, 82, 7, 23, 0, 8, 109, 0, 8, 45, 0, 9, 186, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, 9, 250, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, 9, 198, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, 9, 166, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, 9, 230, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, 9, 150, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, 9, 214, 82, 7, 19, 0, 8, 107, 0, 8, 43, 0, 9, 182, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, 9, 246, 80, 7, 5, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, 9, 206, 81, 7, 15, 0, 8, 103, 0, 8, 39, 0, 9, 174, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, 9, 238, 80, 7, 9, 0, 8, 95, 0, 8, 31, 0, 9, 158, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, 9, 222, 82, 7, 27, 0, 8, 111, 0, 8, 47, 0, 9, 190, 0, 8, 15, 0, 8, 143, 0, 8, 79, 0, 9, 254, 96, 7, Appearance.LIGHTTWOSIDE, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, 112, 0, 8, 48, 0, 9, 193, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, 9, 161, 0, 8, 0, 0, 8, 128, 0, 8, 64, 0, 9, 225, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, 9, 145, 83, 7, 59, 0, 8, 120, 0, 8, 56, 0, 9, 209, 81, 7, 17, 0, 8, 104, 0, 8, 40, 0, 9, 177, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, 9, 241, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, 9, 201, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, 9, 169, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, 9, 233, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, 9, 153, 84, 7, 83, 0, 8, 124, 0, 8, 60, 0, 9, 217, 82, 7, 23, 0, 8, 108, 0, 8, 44, 0, 9, 185, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, 9, 249, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, 9, 197, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, 9, 165, 0, 8, 2, 0, 
    8, 130, 0, 8, 66, 0, 9, 229, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, 9, 149, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, 9, 213, 82, 7, 19, 0, 8, 106, 0, 8, 42, 0, 9, 181, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, 9, 245, 80, 7, 5, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, 9, 205, 81, 7, 15, 0, 8, 102, 0, 8, 38, 0, 9, 173, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, 9, 237, 80, 7, 9, 0, 8, 94, 0, 8, 30, 0, 9, 157, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, 9, 221, 82, 7, 27, 0, 8, 110, 0, 8, 46, 0, 9, 189, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, 9, 253, 96, 7, Appearance.LIGHTTWOSIDE, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, 113, 0, 8, 49, 0, 9, 195, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, 9, 163, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, 9, 227, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, 9, 147, 83, 7, 59, 0, 8, 121, 0, 8, 57, 0, 9, 211, 81, 7, 17, 0, 8, 105, 0, 8, 41, 0, 9, 179, 0, 8, 9, 0, 8, 137, 0, 8, 73, 0, 9, 243, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, 117, 0, 8, 53, 0, 9, 203, 81, 7, 13, 0, 8, 101, 0, 8, 37, 0, 9, 171, 0, 8, 5, 0, 8, 133, 0, 8, 69, 0, 9, 235, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, 9, 155, 84, 7, 83, 0, 8, 125, 0, 8, 61, 0, 9, 219, 82, 7, 23, 0, 8, 109, 0, 8, 45, 0, 9, 187, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, 9, 251, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, 9, 199, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, 9, 167, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, 9, 231, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, 9, 151, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, 9, 215, 82, 7, 19, 0, 8, 107, 0, 8, 43, 0, 9, 183, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, 9, 247, 80, 7, 5, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, 9, 207, 81, 7, 15, 0, 8, 103, 0, 8, 39, 0, 9, 175, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, 9, 239, 80, 7, 9, 0, 8, 95, 0, 8, 31, 0, 9, 159, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, 9, 223, 82, 7, 27, 0, 8, 111, 0, 8, 47, 0, 9, 191, 0, 8, 15, 0, 8, 143, 0, 8, 79, 0, 9, 255};
    static final int[] fixed_td = {80, 5, 1, 87, 5, 257, 83, 5, 17, 91, 5, 4097, 81, 5, 5, 89, 5, 1025, 85, 5, 65, 93, 5, 16385, 80, 5, 3, 88, 5, 513, 84, 5, 33, 92, 5, 8193, 82, 5, 9, 90, 5, 2049, 86, 5, 129, 192, 5, 24577, 80, 5, 2, 87, 5, 385, 83, 5, 25, 91, 5, 6145, 81, 5, 7, 89, 5, 1537, 85, 5, 97, 93, 5, 24577, 80, 5, 4, 88, 5, 769, 84, 5, 49, 92, 5, 12289, 82, 5, 13, 90, 5, 3073, 86, 5, 193, 192, 5, 24577};
    static final int[] cplens = {3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};
    static final int[] cplext = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 112, 112};
    static final int[] cpdist = {1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};
    static final int[] cpdext = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* JADX INFO: renamed from: hn */
    int[] f75hn = null;

    /* JADX INFO: renamed from: v */
    int[] f78v = null;

    /* JADX INFO: renamed from: c */
    int[] f74c = null;

    /* JADX INFO: renamed from: r */
    int[] f76r = null;

    /* JADX INFO: renamed from: u */
    int[] f77u = null;

    /* JADX INFO: renamed from: x */
    int[] f79x = null;

    InfTree() {
    }

    private int huft_build(int[] iArr, int i, int i2, int i3, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8) {
        int i4;
        int i5 = 0;
        int i6 = i2;
        do {
            int[] iArr9 = this.f74c;
            int i7 = iArr[i + i5];
            iArr9[i7] = iArr9[i7] + 1;
            i5++;
            i6--;
        } while (i6 != 0);
        if (this.f74c[0] == i2) {
            iArr4[0] = -1;
            iArr5[0] = 0;
            return 0;
        }
        int i8 = iArr5[0];
        int i9 = 1;
        while (i9 <= 15 && this.f74c[i9] == 0) {
            i9++;
        }
        if (i8 < i9) {
            i8 = i9;
        }
        int i10 = 15;
        while (i10 != 0 && this.f74c[i10] == 0) {
            i10--;
        }
        if (i8 > i10) {
            i8 = i10;
        }
        iArr5[0] = i8;
        int i11 = 1 << i9;
        int i12 = i9;
        while (i12 < i10) {
            int i13 = i11 - this.f74c[i12];
            if (i13 < 0) {
                return Z_DATA_ERROR;
            }
            i12++;
            i11 = i13 << 1;
        }
        int i14 = i11 - this.f74c[i10];
        if (i14 < 0) {
            return Z_DATA_ERROR;
        }
        int[] iArr10 = this.f74c;
        iArr10[i10] = iArr10[i10] + i14;
        int i15 = 0;
        this.f79x[1] = 0;
        int i16 = 1;
        int i17 = 2;
        int i18 = i10;
        while (true) {
            i18--;
            if (i18 == 0) {
                break;
            }
            int[] iArr11 = this.f79x;
            i15 += this.f74c[i16];
            iArr11[i17] = i15;
            i17++;
            i16++;
        }
        int i19 = 0;
        int i20 = 0;
        do {
            int i21 = iArr[i + i20];
            if (i21 != 0) {
                int[] iArr12 = this.f79x;
                int i22 = iArr12[i21];
                iArr12[i21] = i22 + 1;
                iArr8[i22] = i19;
            }
            i20++;
            i19++;
        } while (i19 < i2);
        int i23 = this.f79x[i10];
        int i24 = 0;
        this.f79x[0] = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = -i8;
        this.f77u[0] = 0;
        int i28 = 0;
        int i29 = 0;
        for (int i30 = i9; i30 <= i10; i30++) {
            int i31 = this.f74c[i30];
            while (true) {
                int i32 = i31 - 1;
                if (i31 != 0) {
                    int i33 = i28;
                    while (i30 > i27 + i8) {
                        i26++;
                        i27 += i8;
                        int i34 = i10 - i27;
                        int i35 = i34 > i8 ? i8 : i34;
                        int i36 = i30 - i27;
                        int i37 = 1 << i36;
                        if (i37 > i32 + 1) {
                            int i38 = i37 - (i32 + 1);
                            if (i36 < i35) {
                                int i39 = i30;
                                while (true) {
                                    i36++;
                                    if (i36 >= i35) {
                                        break;
                                    }
                                    int i40 = i38 << 1;
                                    i39++;
                                    if (i40 <= this.f74c[i39]) {
                                        break;
                                    }
                                    i38 = i40 - this.f74c[i39];
                                }
                            }
                        }
                        i29 = 1 << i36;
                        if (iArr7[0] + i29 > MANY) {
                            return Z_DATA_ERROR;
                        }
                        int[] iArr13 = this.f77u;
                        i33 = iArr7[0];
                        iArr13[i26] = i33;
                        iArr7[0] = iArr7[0] + i29;
                        if (i26 != 0) {
                            this.f79x[i26] = i24;
                            this.f76r[0] = (byte) i36;
                            this.f76r[1] = (byte) i8;
                            int i41 = i24 >>> (i27 - i8);
                            this.f76r[2] = (i33 - this.f77u[i26 - 1]) - i41;
                            System.arraycopy(this.f76r, 0, iArr6, (i41 + this.f77u[i26 - 1]) * 3, 3);
                        } else {
                            iArr4[0] = i33;
                        }
                    }
                    this.f76r[1] = (byte) (i30 - i27);
                    if (i25 >= i23) {
                        this.f76r[0] = 192;
                        i4 = i25;
                    } else if (iArr8[i25] < i3) {
                        this.f76r[0] = (byte) (iArr8[i25] < 256 ? 0 : 96);
                        i4 = i25 + 1;
                        this.f76r[2] = iArr8[i25];
                    } else {
                        this.f76r[0] = (byte) (iArr3[iArr8[i25] - i3] + 16 + 64);
                        i4 = i25 + 1;
                        this.f76r[2] = iArr2[iArr8[i25] - i3];
                    }
                    int i42 = 1 << (i30 - i27);
                    for (int i43 = i24 >>> i27; i43 < i29; i43 += i42) {
                        System.arraycopy(this.f76r, 0, iArr6, (i33 + i43) * 3, 3);
                    }
                    int i44 = 1 << (i30 - 1);
                    while ((i24 & i44) != 0) {
                        i24 ^= i44;
                        i44 >>>= 1;
                    }
                    int i45 = i24 ^ i44;
                    int i46 = (1 << i27) - 1;
                    while ((i45 & i46) != this.f79x[i26]) {
                        i26--;
                        int i47 = i27 - i8;
                        i46 = (1 << i47) - 1;
                        i27 = i47;
                    }
                    i28 = i33;
                    i25 = i4;
                    i24 = i45;
                    i31 = i32;
                }
            }
        }
        if (i14 == 0 || i10 == 1) {
            return 0;
        }
        return Z_BUF_ERROR;
    }

    static int inflate_trees_fixed(int[] iArr, int[] iArr2, int[][] iArr3, int[][] iArr4, ZStream zStream) {
        iArr[0] = 9;
        iArr2[0] = 5;
        iArr3[0] = fixed_tl;
        iArr4[0] = fixed_td;
        return 0;
    }

    private void initWorkArea(int i) {
        if (this.f75hn == null) {
            this.f75hn = new int[1];
            this.f78v = new int[i];
            this.f74c = new int[16];
            this.f76r = new int[3];
            this.f77u = new int[15];
            this.f79x = new int[16];
        }
        if (this.f78v.length < i) {
            this.f78v = new int[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f78v[i2] = 0;
        }
        for (int i3 = 0; i3 < 16; i3++) {
            this.f74c[i3] = 0;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            this.f76r[i4] = 0;
        }
        System.arraycopy(this.f74c, 0, this.f77u, 0, 15);
        System.arraycopy(this.f74c, 0, this.f79x, 0, 16);
    }

    int inflate_trees_bits(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, ZStream zStream) {
        initWorkArea(19);
        this.f75hn[0] = 0;
        int iHuft_build = huft_build(iArr, 0, 19, 19, null, null, iArr3, iArr2, iArr4, this.f75hn, this.f78v);
        if (iHuft_build == Z_DATA_ERROR) {
            zStream.msg = "oversubscribed dynamic bit lengths tree";
            return iHuft_build;
        }
        if (iHuft_build != Z_BUF_ERROR && iArr2[0] != 0) {
            return iHuft_build;
        }
        zStream.msg = "incomplete dynamic bit lengths tree";
        return Z_DATA_ERROR;
    }

    int inflate_trees_dynamic(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, ZStream zStream) {
        initWorkArea(288);
        this.f75hn[0] = 0;
        int iHuft_build = huft_build(iArr, 0, i, 257, cplens, cplext, iArr4, iArr2, iArr6, this.f75hn, this.f78v);
        if (iHuft_build != 0 || iArr2[0] == 0) {
            if (iHuft_build == Z_DATA_ERROR) {
                zStream.msg = "oversubscribed literal/length tree";
                return iHuft_build;
            }
            if (iHuft_build == Z_MEM_ERROR) {
                return iHuft_build;
            }
            zStream.msg = "incomplete literal/length tree";
            return Z_DATA_ERROR;
        }
        initWorkArea(288);
        int iHuft_build2 = huft_build(iArr, i, i2, 0, cpdist, cpdext, iArr5, iArr3, iArr6, this.f75hn, this.f78v);
        if (iHuft_build2 == 0 && (iArr3[0] != 0 || i <= 257)) {
            return 0;
        }
        if (iHuft_build2 == Z_DATA_ERROR) {
            zStream.msg = "oversubscribed distance tree";
            return iHuft_build2;
        }
        if (iHuft_build2 == Z_BUF_ERROR) {
            zStream.msg = "incomplete distance tree";
            return Z_DATA_ERROR;
        }
        if (iHuft_build2 == Z_MEM_ERROR) {
            return iHuft_build2;
        }
        zStream.msg = "empty distance tree with lengths";
        return Z_DATA_ERROR;
    }
}
