package com.jcraft.jzlib;

import com.mascotcapsule.eruption.docomostar.Appearance;
import p000.GameStatus;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class InfCodes {
    private static final int BADCODE = 9;
    private static final int COPY = 5;
    private static final int DIST = 3;
    private static final int DISTEXT = 4;
    private static final int END = 8;
    private static final int LEN = 1;
    private static final int LENEXT = 2;
    private static final int LIT = 6;
    private static final int START = 0;
    private static final int WASH = 7;
    private static final int Z_BUF_ERROR = -5;
    private static final int Z_DATA_ERROR = -3;
    private static final int Z_ERRNO = -1;
    private static final int Z_MEM_ERROR = -4;
    private static final int Z_NEED_DICT = 2;
    private static final int Z_OK = 0;
    private static final int Z_STREAM_END = 1;
    private static final int Z_STREAM_ERROR = -2;
    private static final int Z_VERSION_ERROR = -6;
    private static final int[] inflate_mask = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, Appearance.MASK, 8191, 16383, 32767, 65535};
    byte dbits;
    int dist;
    int[] dtree;
    int dtree_index;
    int get;
    byte lbits;
    int len;
    int lit;
    int[] ltree;
    int ltree_index;
    int mode;
    int need;
    int[] tree;
    int tree_index = 0;

    InfCodes() {
    }

    void free(ZStream zStream) {
    }

    int inflate_fast(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, InfBlocks infBlocks, ZStream zStream) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = zStream.next_in_index;
        int i13 = zStream.avail_in;
        int i14 = infBlocks.bitb;
        int i15 = infBlocks.bitk;
        int i16 = infBlocks.write;
        int i17 = i16 < infBlocks.read ? (infBlocks.read - i16) - 1 : infBlocks.end - i16;
        int i18 = inflate_mask[i];
        int i19 = inflate_mask[i2];
        int i20 = i17;
        while (true) {
            if (i15 < 20) {
                i13--;
                i14 |= (zStream.next_in[i12] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i15;
                i15 += 8;
                i12++;
            } else {
                int i21 = i14 & i18;
                int i22 = (i3 + i21) * 3;
                int i23 = iArr[i22];
                if (i23 == 0) {
                    i14 >>= iArr[i22 + 1];
                    i15 -= iArr[i22 + 1];
                    i9 = i16 + 1;
                    infBlocks.window[i16] = (byte) iArr[i22 + 2];
                    i10 = i20 - 1;
                    i11 = i13;
                    i5 = i12;
                } else {
                    while (true) {
                        i14 >>= iArr[i22 + 1];
                        i15 -= iArr[i22 + 1];
                        if ((i23 & 16) != 0) {
                            int i24 = i23 & 15;
                            int i25 = iArr[i22 + 2] + (inflate_mask[i24] & i14);
                            int i26 = i14 >> i24;
                            int i27 = i15 - i24;
                            while (true) {
                                i5 = i12;
                                if (i27 >= 15) {
                                    break;
                                }
                                i13--;
                                i12 = i5 + 1;
                                i26 |= (zStream.next_in[i5] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i27;
                                i27 += 8;
                            }
                            int i28 = i26 & i19;
                            int i29 = (i4 + i28) * 3;
                            int i30 = iArr2[i29];
                            while (true) {
                                i26 >>= iArr2[i29 + 1];
                                i27 -= iArr2[i29 + 1];
                                if ((i30 & 16) != 0) {
                                    int i31 = i30 & 15;
                                    int i32 = i13;
                                    int i33 = i27;
                                    int i34 = i26;
                                    while (i33 < i31) {
                                        i32--;
                                        i34 |= (zStream.next_in[i5] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i33;
                                        i5++;
                                        i33 += 8;
                                    }
                                    int i35 = iArr2[i29 + 2] + (inflate_mask[i31] & i34);
                                    int i36 = i34 >> i31;
                                    int i37 = i33 - i31;
                                    int i38 = i20 - i25;
                                    if (i16 >= i35) {
                                        int i39 = i16 - i35;
                                        if (i16 - i39 <= 0 || 2 <= i16 - i39) {
                                            System.arraycopy(infBlocks.window, i39, infBlocks.window, i16, 2);
                                            i8 = i16 + 2;
                                            i6 = i39 + 2;
                                            i7 = i25 + Z_STREAM_ERROR;
                                        } else {
                                            int i40 = i16 + 1;
                                            int i41 = i39 + 1;
                                            infBlocks.window[i16] = infBlocks.window[i39];
                                            i8 = i40 + 1;
                                            i6 = i41 + 1;
                                            infBlocks.window[i40] = infBlocks.window[i41];
                                            i7 = i25 + Z_STREAM_ERROR;
                                        }
                                    } else {
                                        i6 = i16 - i35;
                                        do {
                                            i6 += infBlocks.end;
                                        } while (i6 < 0);
                                        int i42 = infBlocks.end - i6;
                                        if (i25 > i42) {
                                            int i43 = i25 - i42;
                                            if (i16 - i6 <= 0 || i42 <= i16 - i6) {
                                                System.arraycopy(infBlocks.window, i6, infBlocks.window, i16, i42);
                                                i8 = i16 + i42;
                                                int i44 = i6 + i42;
                                            } else {
                                                int i45 = i16;
                                                int i46 = i42;
                                                while (true) {
                                                    i8 = i45 + 1;
                                                    int i47 = i6 + 1;
                                                    infBlocks.window[i45] = infBlocks.window[i6];
                                                    i46--;
                                                    if (i46 == 0) {
                                                        break;
                                                    }
                                                    i6 = i47;
                                                    i45 = i8;
                                                }
                                            }
                                            i6 = 0;
                                            i7 = i43;
                                        } else {
                                            i7 = i25;
                                            i8 = i16;
                                        }
                                    }
                                    if (i8 - i6 > 0 && i7 > i8 - i6) {
                                        int i48 = i7;
                                        while (true) {
                                            i9 = i8 + 1;
                                            int i49 = i6 + 1;
                                            infBlocks.window[i8] = infBlocks.window[i6];
                                            i48--;
                                            if (i48 == 0) {
                                                break;
                                            }
                                            i6 = i49;
                                            i8 = i9;
                                        }
                                        i10 = i38;
                                        i11 = i32;
                                        i15 = i37;
                                        i14 = i36;
                                        break;
                                    }
                                    System.arraycopy(infBlocks.window, i6, infBlocks.window, i8, i7);
                                    i9 = i8 + i7;
                                    int i50 = i6 + i7;
                                    i10 = i38;
                                    i11 = i32;
                                    i15 = i37;
                                    i14 = i36;
                                    break;
                                }
                                if ((i30 & 64) != 0) {
                                    zStream.msg = "invalid distance code";
                                    int i51 = zStream.avail_in - i13;
                                    if ((i27 >> 3) < i51) {
                                        i51 = i27 >> 3;
                                    }
                                    int i52 = i5 - i51;
                                    infBlocks.bitb = i26;
                                    infBlocks.bitk = i27 - (i51 << 3);
                                    zStream.avail_in = i13 + i51;
                                    zStream.total_in += (long) (i52 - zStream.next_in_index);
                                    zStream.next_in_index = i52;
                                    infBlocks.write = i16;
                                    return Z_DATA_ERROR;
                                }
                                i28 = iArr2[i29 + 2] + i28 + (inflate_mask[i30] & i26);
                                i29 = (i4 + i28) * 3;
                                i30 = iArr2[i29];
                            }
                        } else {
                            if ((i23 & 64) != 0) {
                                if ((i23 & 32) != 0) {
                                    int i53 = zStream.avail_in - i13;
                                    if ((i15 >> 3) < i53) {
                                        i53 = i15 >> 3;
                                    }
                                    int i54 = i12 - i53;
                                    infBlocks.bitb = i14;
                                    infBlocks.bitk = i15 - (i53 << 3);
                                    zStream.avail_in = i13 + i53;
                                    zStream.total_in += (long) (i54 - zStream.next_in_index);
                                    zStream.next_in_index = i54;
                                    infBlocks.write = i16;
                                    return 1;
                                }
                                zStream.msg = "invalid literal/length code";
                                int i55 = zStream.avail_in - i13;
                                if ((i15 >> 3) < i55) {
                                    i55 = i15 >> 3;
                                }
                                int i56 = i12 - i55;
                                infBlocks.bitb = i14;
                                infBlocks.bitk = i15 - (i55 << 3);
                                zStream.avail_in = i13 + i55;
                                zStream.total_in += (long) (i56 - zStream.next_in_index);
                                zStream.next_in_index = i56;
                                infBlocks.write = i16;
                                return Z_DATA_ERROR;
                            }
                            i21 = iArr[i22 + 2] + i21 + (inflate_mask[i23] & i14);
                            i22 = (i3 + i21) * 3;
                            i23 = iArr[i22];
                            if (i23 == 0) {
                                i14 >>= iArr[i22 + 1];
                                i15 -= iArr[i22 + 1];
                                i9 = i16 + 1;
                                infBlocks.window[i16] = (byte) iArr[i22 + 2];
                                i10 = i20 - 1;
                                i11 = i13;
                                i5 = i12;
                                break;
                            }
                        }
                    }
                }
                if (i10 < 258 || i11 < 10) {
                    break;
                }
                i20 = i10;
                i16 = i9;
                i13 = i11;
                i12 = i5;
            }
        }
        int i57 = zStream.avail_in - i11;
        if ((i15 >> 3) < i57) {
            i57 = i15 >> 3;
        }
        int i58 = i5 - i57;
        infBlocks.bitb = i14;
        infBlocks.bitk = i15 - (i57 << 3);
        zStream.avail_in = i11 + i57;
        zStream.total_in += (long) (i58 - zStream.next_in_index);
        zStream.next_in_index = i58;
        infBlocks.write = i9;
        return 0;
    }

    void init(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, ZStream zStream) {
        this.mode = 0;
        this.lbits = (byte) i;
        this.dbits = (byte) i2;
        this.ltree = iArr;
        this.ltree_index = i3;
        this.dtree = iArr2;
        this.dtree_index = i4;
        this.tree = null;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:154:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:1: B:26:0x009b->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0124  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a5 A[LOOP:3: B:50:0x01a1->B:52:0x01a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0208  */
    /* JADX WARN: Code duplicated, block: B:69:0x0285 A[LOOP:5: B:68:0x0283->B:69:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x029c  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:85:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:94:0x02db  */
    /* JADX WARN: Code duplicated, block: B:97:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:98:0x0300  */
    /* JADX WARN: Code duplicated, block: B:99:0x0304  */
    int proc(InfBlocks infBlocks, ZStream zStream, int i) {
        int i2;
        int i3;
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
        int i14 = zStream.next_in_index;
        int i15 = zStream.avail_in;
        int i16 = infBlocks.bitb;
        int i17 = infBlocks.bitk;
        int i18 = infBlocks.write;
        int i19 = i18 < infBlocks.read ? (infBlocks.read - i18) - 1 : infBlocks.end - i18;
        while (true) {
            switch (this.mode) {
                case 0:
                    if (i19 >= 258 && i15 >= 10) {
                        infBlocks.bitb = i16;
                        infBlocks.bitk = i17;
                        zStream.avail_in = i15;
                        zStream.total_in += (long) (i14 - zStream.next_in_index);
                        zStream.next_in_index = i14;
                        infBlocks.write = i18;
                        i = inflate_fast(this.lbits, this.dbits, this.ltree, this.ltree_index, this.dtree, this.dtree_index, infBlocks, zStream);
                        i14 = zStream.next_in_index;
                        i15 = zStream.avail_in;
                        i16 = infBlocks.bitb;
                        i17 = infBlocks.bitk;
                        i18 = infBlocks.write;
                        i19 = i18 < infBlocks.read ? (infBlocks.read - i18) - 1 : infBlocks.end - i18;
                        if (i != 0) {
                            this.mode = i == 1 ? 7 : 9;
                        }
                        break;
                    }
                    this.need = this.lbits;
                    this.tree = this.ltree;
                    this.tree_index = this.ltree_index;
                    this.mode = 1;
                    i9 = this.need;
                    i10 = i17;
                    i11 = i16;
                    while (i10 < i9) {
                        if (i15 != 0) {
                            infBlocks.bitb = i11;
                            infBlocks.bitk = i10;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, i);
                        }
                        i = 0;
                        i15--;
                        i11 |= (zStream.next_in[i14] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i10;
                        i14++;
                        i10 += 8;
                    }
                    i12 = (this.tree_index + (inflate_mask[i9] & i11)) * 3;
                    i16 = i11 >>> this.tree[i12 + 1];
                    i17 = i10 - this.tree[i12 + 1];
                    i13 = this.tree[i12];
                    if (i13 == 0) {
                        this.lit = this.tree[i12 + 2];
                        this.mode = 6;
                    } else if ((i13 & 16) != 0) {
                        this.get = i13 & 15;
                        this.len = this.tree[i12 + 2];
                        this.mode = 2;
                    } else if ((i13 & 64) == 0) {
                        this.need = i13;
                        this.tree_index = (i12 / 3) + this.tree[i12 + 2];
                    } else {
                        if ((i13 & 32) != 0) {
                            this.mode = 9;
                            zStream.msg = "invalid literal/length code";
                            infBlocks.bitb = i16;
                            infBlocks.bitk = i17;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, Z_DATA_ERROR);
                        }
                        this.mode = 7;
                    }
                    break;
                case 1:
                    i9 = this.need;
                    i10 = i17;
                    i11 = i16;
                    while (i10 < i9) {
                        if (i15 != 0) {
                            infBlocks.bitb = i11;
                            infBlocks.bitk = i10;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, i);
                        }
                        i = 0;
                        i15--;
                        i11 |= (zStream.next_in[i14] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i10;
                        i14++;
                        i10 += 8;
                    }
                    i12 = (this.tree_index + (inflate_mask[i9] & i11)) * 3;
                    i16 = i11 >>> this.tree[i12 + 1];
                    i17 = i10 - this.tree[i12 + 1];
                    i13 = this.tree[i12];
                    if (i13 == 0) {
                        this.lit = this.tree[i12 + 2];
                        this.mode = 6;
                    } else if ((i13 & 16) != 0) {
                        this.get = i13 & 15;
                        this.len = this.tree[i12 + 2];
                        this.mode = 2;
                    } else if ((i13 & 64) == 0) {
                        this.need = i13;
                        this.tree_index = (i12 / 3) + this.tree[i12 + 2];
                    } else {
                        if ((i13 & 32) != 0) {
                            this.mode = 9;
                            zStream.msg = "invalid literal/length code";
                            infBlocks.bitb = i16;
                            infBlocks.bitk = i17;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, Z_DATA_ERROR);
                        }
                        this.mode = 7;
                    }
                    break;
                case 2:
                    int i20 = this.get;
                    int i21 = i17;
                    int i22 = i16;
                    while (i21 < i20) {
                        if (i15 == 0) {
                            infBlocks.bitb = i22;
                            infBlocks.bitk = i21;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, i);
                        }
                        i = 0;
                        i15--;
                        i22 |= (zStream.next_in[i14] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i21;
                        i14++;
                        i21 += 8;
                    }
                    this.len += inflate_mask[i20] & i22;
                    i16 = i22 >> i20;
                    i17 = i21 - i20;
                    this.need = this.dbits;
                    this.tree = this.dtree;
                    this.tree_index = this.dtree_index;
                    this.mode = 3;
                    i4 = this.need;
                    i5 = i17;
                    i6 = i16;
                    while (i5 < i4) {
                        if (i15 != 0) {
                            infBlocks.bitb = i6;
                            infBlocks.bitk = i5;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, i);
                        }
                        i = 0;
                        i15--;
                        i6 |= (zStream.next_in[i14] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i5;
                        i14++;
                        i5 += 8;
                    }
                    i7 = (this.tree_index + (inflate_mask[i4] & i6)) * 3;
                    i16 = i6 >> this.tree[i7 + 1];
                    i17 = i5 - this.tree[i7 + 1];
                    i8 = this.tree[i7];
                    if ((i8 & 16) != 0) {
                        this.get = i8 & 15;
                        this.dist = this.tree[i7 + 2];
                        this.mode = 4;
                    } else {
                        if ((i8 & 64) == 0) {
                            this.mode = 9;
                            zStream.msg = "invalid distance code";
                            infBlocks.bitb = i16;
                            infBlocks.bitk = i17;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, Z_DATA_ERROR);
                        }
                        this.need = i8;
                        this.tree_index = (i7 / 3) + this.tree[i7 + 2];
                    }
                    break;
                case 3:
                    i4 = this.need;
                    i5 = i17;
                    i6 = i16;
                    while (i5 < i4) {
                        if (i15 != 0) {
                            infBlocks.bitb = i6;
                            infBlocks.bitk = i5;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, i);
                        }
                        i = 0;
                        i15--;
                        i6 |= (zStream.next_in[i14] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i5;
                        i14++;
                        i5 += 8;
                    }
                    i7 = (this.tree_index + (inflate_mask[i4] & i6)) * 3;
                    i16 = i6 >> this.tree[i7 + 1];
                    i17 = i5 - this.tree[i7 + 1];
                    i8 = this.tree[i7];
                    if ((i8 & 16) != 0) {
                        this.get = i8 & 15;
                        this.dist = this.tree[i7 + 2];
                        this.mode = 4;
                    } else {
                        if ((i8 & 64) == 0) {
                            this.mode = 9;
                            zStream.msg = "invalid distance code";
                            infBlocks.bitb = i16;
                            infBlocks.bitk = i17;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, Z_DATA_ERROR);
                        }
                        this.need = i8;
                        this.tree_index = (i7 / 3) + this.tree[i7 + 2];
                    }
                    break;
                case 4:
                    int i23 = this.get;
                    int i24 = i17;
                    int i25 = i16;
                    while (i24 < i23) {
                        if (i15 == 0) {
                            infBlocks.bitb = i25;
                            infBlocks.bitk = i24;
                            zStream.avail_in = i15;
                            zStream.total_in += (long) (i14 - zStream.next_in_index);
                            zStream.next_in_index = i14;
                            infBlocks.write = i18;
                            return infBlocks.inflate_flush(zStream, i);
                        }
                        i = 0;
                        i15--;
                        i25 |= (zStream.next_in[i14] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i24;
                        i14++;
                        i24 += 8;
                    }
                    this.dist += inflate_mask[i23] & i25;
                    i16 = i25 >> i23;
                    i17 = i24 - i23;
                    this.mode = 5;
                    i2 = i18 - this.dist;
                    while (i2 < 0) {
                        i2 += infBlocks.end;
                    }
                    while (this.len != 0) {
                        if (i19 == 0) {
                            if (i18 == infBlocks.end && infBlocks.read != 0) {
                                i18 = 0;
                                if (0 < infBlocks.read) {
                                    i19 = (infBlocks.read - 0) - 1;
                                } else {
                                    i19 = infBlocks.end - 0;
                                }
                            }
                            if (i19 == 0) {
                                infBlocks.write = i18;
                                i = infBlocks.inflate_flush(zStream, i);
                                i18 = infBlocks.write;
                                if (i18 < infBlocks.read) {
                                    i19 = (infBlocks.read - i18) - 1;
                                } else {
                                    i19 = infBlocks.end - i18;
                                }
                                if (i18 == infBlocks.end && infBlocks.read != 0) {
                                    i18 = 0;
                                    if (0 < infBlocks.read) {
                                        i19 = (infBlocks.read - 0) - 1;
                                    } else {
                                        i19 = infBlocks.end - 0;
                                    }
                                }
                                if (i19 == 0) {
                                    infBlocks.bitb = i16;
                                    infBlocks.bitk = i17;
                                    zStream.avail_in = i15;
                                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                                    zStream.next_in_index = i14;
                                    infBlocks.write = i18;
                                    return infBlocks.inflate_flush(zStream, i);
                                }
                            }
                        }
                        int i26 = i18;
                        i18 = i26 + 1;
                        i3 = i2 + 1;
                        infBlocks.window[i26] = infBlocks.window[i2];
                        i19--;
                        if (i3 == infBlocks.end) {
                            i2 = 0;
                        } else {
                            i2 = i3;
                        }
                        this.len--;
                    }
                    this.mode = 0;
                    break;
                case 5:
                    i2 = i18 - this.dist;
                    while (i2 < 0) {
                        i2 += infBlocks.end;
                    }
                    while (this.len != 0) {
                        if (i19 == 0) {
                            if (i18 == infBlocks.end) {
                                i18 = 0;
                                if (0 < infBlocks.read) {
                                    i19 = (infBlocks.read - 0) - 1;
                                } else {
                                    i19 = infBlocks.end - 0;
                                }
                            }
                            if (i19 == 0) {
                                infBlocks.write = i18;
                                i = infBlocks.inflate_flush(zStream, i);
                                i18 = infBlocks.write;
                                if (i18 < infBlocks.read) {
                                    i19 = (infBlocks.read - i18) - 1;
                                } else {
                                    i19 = infBlocks.end - i18;
                                }
                                if (i18 == infBlocks.end) {
                                    i18 = 0;
                                    if (0 < infBlocks.read) {
                                        i19 = (infBlocks.read - 0) - 1;
                                    } else {
                                        i19 = infBlocks.end - 0;
                                    }
                                }
                                if (i19 == 0) {
                                    infBlocks.bitb = i16;
                                    infBlocks.bitk = i17;
                                    zStream.avail_in = i15;
                                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                                    zStream.next_in_index = i14;
                                    infBlocks.write = i18;
                                    return infBlocks.inflate_flush(zStream, i);
                                }
                            }
                        }
                        int i27 = i18;
                        i18 = i27 + 1;
                        i3 = i2 + 1;
                        infBlocks.window[i27] = infBlocks.window[i2];
                        i19--;
                        if (i3 == infBlocks.end) {
                            i2 = 0;
                        } else {
                            i2 = i3;
                        }
                        this.len--;
                    }
                    this.mode = 0;
                    break;
                case 6:
                    if (i19 == 0) {
                        if (i18 == infBlocks.end && infBlocks.read != 0) {
                            i18 = 0;
                            i19 = 0 < infBlocks.read ? (infBlocks.read - 0) - 1 : infBlocks.end - 0;
                        }
                        if (i19 == 0) {
                            infBlocks.write = i18;
                            int iInflate_flush = infBlocks.inflate_flush(zStream, i);
                            i18 = infBlocks.write;
                            i19 = i18 < infBlocks.read ? (infBlocks.read - i18) - 1 : infBlocks.end - i18;
                            if (i18 == infBlocks.end && infBlocks.read != 0) {
                                i18 = 0;
                                i19 = 0 < infBlocks.read ? (infBlocks.read - 0) - 1 : infBlocks.end - 0;
                            }
                            if (i19 == 0) {
                                infBlocks.bitb = i16;
                                infBlocks.bitk = i17;
                                zStream.avail_in = i15;
                                zStream.total_in += (long) (i14 - zStream.next_in_index);
                                zStream.next_in_index = i14;
                                infBlocks.write = i18;
                                return infBlocks.inflate_flush(zStream, iInflate_flush);
                            }
                        }
                    }
                    int i28 = i18;
                    i = 0;
                    i18 = i28 + 1;
                    infBlocks.window[i28] = (byte) this.lit;
                    i19--;
                    this.mode = 0;
                    break;
                case 7:
                    if (i17 > 7) {
                        i17 -= 8;
                        i15++;
                        i14--;
                    }
                    infBlocks.write = i18;
                    int iInflate_flush2 = infBlocks.inflate_flush(zStream, i);
                    i18 = infBlocks.write;
                    if (i18 < infBlocks.read) {
                        int i29 = (infBlocks.read - i18) - 1;
                    } else {
                        int i30 = infBlocks.end - i18;
                    }
                    if (infBlocks.read != infBlocks.write) {
                        infBlocks.bitb = i16;
                        infBlocks.bitk = i17;
                        zStream.avail_in = i15;
                        zStream.total_in += (long) (i14 - zStream.next_in_index);
                        zStream.next_in_index = i14;
                        infBlocks.write = i18;
                        return infBlocks.inflate_flush(zStream, iInflate_flush2);
                    }
                    this.mode = 8;
                    infBlocks.bitb = i16;
                    infBlocks.bitk = i17;
                    zStream.avail_in = i15;
                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                    zStream.next_in_index = i14;
                    infBlocks.write = i18;
                    return infBlocks.inflate_flush(zStream, 1);
                case 8:
                    infBlocks.bitb = i16;
                    infBlocks.bitk = i17;
                    zStream.avail_in = i15;
                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                    zStream.next_in_index = i14;
                    infBlocks.write = i18;
                    return infBlocks.inflate_flush(zStream, 1);
                case 9:
                    infBlocks.bitb = i16;
                    infBlocks.bitk = i17;
                    zStream.avail_in = i15;
                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                    zStream.next_in_index = i14;
                    infBlocks.write = i18;
                    return infBlocks.inflate_flush(zStream, Z_DATA_ERROR);
                default:
                    infBlocks.bitb = i16;
                    infBlocks.bitk = i17;
                    zStream.avail_in = i15;
                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                    zStream.next_in_index = i14;
                    infBlocks.write = i18;
                    return infBlocks.inflate_flush(zStream, Z_STREAM_ERROR);
            }
        }
    }
}
