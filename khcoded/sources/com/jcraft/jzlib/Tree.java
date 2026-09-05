package com.jcraft.jzlib;

import com.mascotcapsule.eruption.docomostar.Appearance;
import p000.GameCommon;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class Tree {
    private static final int BL_CODES = 19;
    static final int Buf_size = 16;
    static final int DIST_CODE_LEN = 512;
    private static final int D_CODES = 30;
    static final int END_BLOCK = 256;
    private static final int HEAP_SIZE = 573;
    private static final int LENGTH_CODES = 29;
    private static final int LITERALS = 256;
    private static final int L_CODES = 286;
    private static final int MAX_BITS = 15;
    static final int MAX_BL_BITS = 7;
    static final int REPZ_11_138 = 18;
    static final int REPZ_3_10 = 17;
    static final int REP_3_6 = 16;
    short[] dyn_tree;
    int max_code;
    StaticTree stat_desc;
    static final int[] extra_lbits = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};
    static final int[] extra_dbits = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
    static final int[] extra_blbits = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 7};
    static final byte[] bl_order = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    static final byte[] _dist_code = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 16, 17, 18, 18, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION_VIEW, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION, GameCommon.DS_MOTION};
    static final byte[] _length_code = {0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_SORA_HP, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_DMG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_EVEFLG_VIEW, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_SORA_LEVEL, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_MAPOBJ_ID, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_DTIME_FIX, GameCommon.DS_MOTION_VIEW};
    static final int[] base_length = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 0};
    static final int[] base_dist = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, Appearance.LIGHTTWOSIDE, 384, 512, 768, 1024, 1536, Appearance.USE_FIGURE_APPEARANCE, 3072, 4096, 6144, 8192, 12288, 16384, 24576};

    Tree() {
    }

    static int bi_reverse(int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i3 | (i & 1);
            i >>>= 1;
            i3 = i4 << 1;
            i2--;
        } while (i2 > 0);
        return i3 >>> 1;
    }

    static int d_code(int i) {
        return i < 256 ? _dist_code[i] : _dist_code[(i >>> 7) + Appearance.LIGHTTWOSIDE];
    }

    static void gen_codes(short[] sArr, int i, short[] sArr2) {
        short[] sArr3 = new short[16];
        short s = 0;
        for (int i2 = 1; i2 <= 15; i2++) {
            s = (short) ((s + sArr2[i2 - 1]) << 1);
            sArr3[i2] = s;
        }
        for (int i3 = 0; i3 <= i; i3++) {
            short s2 = sArr[(i3 * 2) + 1];
            if (s2 != 0) {
                short s3 = sArr3[s2];
                sArr3[s2] = (short) (s3 + 1);
                sArr[i3 * 2] = (short) bi_reverse(s3, s2);
            }
        }
    }

    void build_tree(Deflate deflate) {
        int i;
        short[] sArr = this.dyn_tree;
        short[] sArr2 = this.stat_desc.static_tree;
        int i2 = this.stat_desc.elems;
        int i3 = -1;
        deflate.heap_len = 0;
        deflate.heap_max = HEAP_SIZE;
        for (int i4 = 0; i4 < i2; i4++) {
            if (sArr[i4 * 2] != 0) {
                int[] iArr = deflate.heap;
                int i5 = deflate.heap_len + 1;
                deflate.heap_len = i5;
                iArr[i5] = i4;
                deflate.depth[i4] = 0;
                i3 = i4;
            } else {
                sArr[(i4 * 2) + 1] = 0;
            }
        }
        while (deflate.heap_len < 2) {
            int[] iArr2 = deflate.heap;
            int i6 = deflate.heap_len + 1;
            deflate.heap_len = i6;
            if (i3 < 2) {
                int i7 = i3 + 1;
                i = i7;
                i3 = i7;
            } else {
                i = 0;
            }
            iArr2[i6] = i;
            sArr[i * 2] = 1;
            deflate.depth[i] = 0;
            deflate.opt_len--;
            if (sArr2 != null) {
                deflate.static_len -= sArr2[(i * 2) + 1];
            }
        }
        this.max_code = i3;
        for (int i8 = deflate.heap_len / 2; i8 >= 1; i8--) {
            deflate.pqdownheap(sArr, i8);
        }
        int i9 = i2;
        while (true) {
            int i10 = deflate.heap[1];
            int[] iArr3 = deflate.heap;
            int[] iArr4 = deflate.heap;
            int i11 = deflate.heap_len;
            deflate.heap_len = i11 - 1;
            iArr3[1] = iArr4[i11];
            deflate.pqdownheap(sArr, 1);
            int i12 = deflate.heap[1];
            int[] iArr5 = deflate.heap;
            int i13 = deflate.heap_max - 1;
            deflate.heap_max = i13;
            iArr5[i13] = i10;
            int[] iArr6 = deflate.heap;
            int i14 = deflate.heap_max - 1;
            deflate.heap_max = i14;
            iArr6[i14] = i12;
            sArr[i9 * 2] = (short) (sArr[i10 * 2] + sArr[i12 * 2]);
            deflate.depth[i9] = (byte) (Math.max((int) deflate.depth[i10], (int) deflate.depth[i12]) + 1);
            short s = (short) i9;
            sArr[(i12 * 2) + 1] = s;
            sArr[(i10 * 2) + 1] = s;
            int i15 = i9 + 1;
            deflate.heap[1] = i9;
            deflate.pqdownheap(sArr, 1);
            if (deflate.heap_len < 2) {
                int[] iArr7 = deflate.heap;
                int i16 = deflate.heap_max - 1;
                deflate.heap_max = i16;
                iArr7[i16] = deflate.heap[1];
                gen_bitlen(deflate);
                gen_codes(sArr, i3, deflate.bl_count);
                return;
            }
            i9 = i15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void gen_bitlen(Deflate deflate) {
        short[] sArr = this.dyn_tree;
        short[] sArr2 = this.stat_desc.static_tree;
        int[] iArr = this.stat_desc.extra_bits;
        int i = this.stat_desc.extra_base;
        int i2 = this.stat_desc.max_length;
        for (int i3 = 0; i3 <= 15; i3++) {
            deflate.bl_count[i3] = 0;
        }
        sArr[(deflate.heap[deflate.heap_max] * 2) + 1] = 0;
        int i4 = deflate.heap_max + 1;
        int i5 = 0;
        while (i4 < HEAP_SIZE) {
            int i6 = deflate.heap[i4];
            int i7 = sArr[(sArr[(i6 * 2) + 1] * 2) + 1] + 1;
            if (i7 > i2) {
                i5++;
                i7 = i2;
            }
            sArr[(i6 * 2) + 1] = (short) i7;
            if (i6 <= this.max_code) {
                short[] sArr3 = deflate.bl_count;
                sArr3[i7] = (short) (sArr3[i7] + 1);
                int i8 = i6 >= i ? iArr[i6 - i] : 0;
                short s = sArr[i6 * 2];
                deflate.opt_len = ((i7 + i8) * s) + deflate.opt_len;
                if (sArr2 != null) {
                    deflate.static_len += (i8 + sArr2[(i6 * 2) + 1]) * s;
                }
            }
            i4++;
        }
        if (i5 == 0) {
            return;
        }
        do {
            int i9 = i2 - 1;
            while (deflate.bl_count[i9] == 0) {
                i9--;
            }
            short[] sArr4 = deflate.bl_count;
            sArr4[i9] = (short) (sArr4[i9] - 1);
            short[] sArr5 = deflate.bl_count;
            int i10 = i9 + 1;
            sArr5[i10] = (short) (sArr5[i10] + 2);
            short[] sArr6 = deflate.bl_count;
            sArr6[i2] = (short) (sArr6[i2] - 1);
            i5 -= 2;
        } while (i5 > 0);
        int i11 = i4;
        while (i2 != 0) {
            short s2 = deflate.bl_count[i2];
            while (s2 != 0) {
                i11--;
                int i12 = deflate.heap[i11];
                if (i12 <= this.max_code) {
                    if (sArr[(i12 * 2) + 1] != i2) {
                        deflate.opt_len = (int) (((long) deflate.opt_len) + ((((long) i2) - ((long) sArr[(i12 * 2) + 1])) * ((long) sArr[i12 * 2])));
                        sArr[(i12 * 2) + 1] = (short) i2;
                    }
                    s2--;
                }
            }
            i2--;
        }
    }
}
