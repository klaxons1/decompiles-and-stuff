package com.jcraft.jzlib;

import com.mascotcapsule.eruption.docomostar.Appearance;
import p000.GameStatus;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class InfBlocks {
    private static final int BAD = 9;
    private static final int BTREE = 4;
    private static final int CODES = 6;
    private static final int DONE = 8;
    private static final int DRY = 7;
    private static final int DTREE = 5;
    private static final int LENS = 1;
    private static final int MANY = 1440;
    private static final int STORED = 2;
    private static final int TABLE = 3;
    private static final int TYPE = 0;
    private static final int Z_BUF_ERROR = -5;
    private static final int Z_DATA_ERROR = -3;
    private static final int Z_ERRNO = -1;
    private static final int Z_MEM_ERROR = -4;
    private static final int Z_NEED_DICT = 2;
    private static final int Z_OK = 0;
    private static final int Z_STREAM_END = 1;
    private static final int Z_STREAM_ERROR = -2;
    private static final int Z_VERSION_ERROR = -6;
    int bitb;
    int bitk;
    int[] blens;
    long check;
    Object checkfn;
    int end;
    int index;
    int last;
    int left;
    int read;
    int table;
    byte[] window;
    int write;
    private static final int[] inflate_mask = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, Appearance.MASK, 8191, 16383, 32767, 65535};
    static final int[] border = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: bb */
    int[] f72bb = new int[1];

    /* JADX INFO: renamed from: tb */
    int[] f73tb = new int[1];
    InfCodes codes = new InfCodes();
    InfTree inftree = new InfTree();
    int[] hufts = new int[4320];
    int mode = 0;

    InfBlocks(ZStream zStream, Object obj, int i) {
        this.window = new byte[i];
        this.end = i;
        this.checkfn = obj;
        reset(zStream, null);
    }

    void free(ZStream zStream) {
        reset(zStream, null);
        this.window = null;
        this.hufts = null;
    }

    int inflate_flush(ZStream zStream, int i) {
        int i2;
        int i3 = zStream.next_out_index;
        int i4 = this.read;
        int i5 = (i4 <= this.write ? this.write : this.end) - i4;
        if (i5 > zStream.avail_out) {
            i5 = zStream.avail_out;
        }
        if (i5 != 0 && i == Z_BUF_ERROR) {
            i = 0;
        }
        zStream.avail_out -= i5;
        zStream.total_out += (long) i5;
        if (this.checkfn != null) {
            long jAdler32 = zStream._adler.adler32(this.check, this.window, i4, i5);
            this.check = jAdler32;
            zStream.adler = jAdler32;
        }
        System.arraycopy(this.window, i4, zStream.next_out, i3, i5);
        int i6 = i3 + i5;
        int i7 = i4 + i5;
        if (i7 == this.end) {
            if (this.write == this.end) {
                this.write = 0;
            }
            int i8 = this.write - 0;
            if (i8 > zStream.avail_out) {
                i8 = zStream.avail_out;
            }
            if (i8 != 0 && i == Z_BUF_ERROR) {
                i = 0;
            }
            zStream.avail_out -= i8;
            zStream.total_out += (long) i8;
            if (this.checkfn != null) {
                long jAdler33 = zStream._adler.adler32(this.check, this.window, 0, i8);
                this.check = jAdler33;
                zStream.adler = jAdler33;
            }
            System.arraycopy(this.window, 0, zStream.next_out, i6, i8);
            i2 = i6 + i8;
            i7 = 0 + i8;
        } else {
            i2 = i6;
        }
        zStream.next_out_index = i2;
        this.read = i7;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:103:0x03ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x03d0 A[LOOP:4: B:101:0x03cb->B:104:0x03d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0441 A[LOOP:5: B:110:0x0439->B:112:0x0441, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x047e  */
    /* JADX WARN: Code duplicated, block: B:119:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:126:0x051d  */
    /* JADX WARN: Code duplicated, block: B:128:0x055c  */
    /* JADX WARN: Code duplicated, block: B:130:0x056c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x056e A[LOOP:7: B:129:0x056a->B:131:0x056e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x060a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0610  */
    /* JADX WARN: Code duplicated, block: B:147:0x0617 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0619 A[LOOP:8: B:145:0x0613->B:148:0x0619, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x062d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0631  */
    /* JADX WARN: Code duplicated, block: B:154:0x067e  */
    /* JADX WARN: Code duplicated, block: B:166:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:170:0x0753  */
    /* JADX WARN: Code duplicated, block: B:172:0x0778  */
    /* JADX WARN: Code duplicated, block: B:175:0x0785  */
    /* JADX WARN: Code duplicated, block: B:176:0x078f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0633 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0685 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0749 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0795 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x047b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x051a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0439 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0606 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x04db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x05e9 A[SYNTHETIC] */
    int proc(ZStream zStream, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iProc;
        int i10;
        int i11;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int iInflate_trees_dynamic;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iInflate_trees_bits;
        int i29 = zStream.next_in_index;
        int i30 = zStream.avail_in;
        int i31 = this.bitb;
        int i32 = this.bitk;
        int i33 = this.write;
        int i34 = i33 < this.read ? (this.read - i33) - 1 : this.end - i33;
        int i35 = i33;
        int i36 = i31;
        while (true) {
            switch (this.mode) {
                case 0:
                    int i37 = i30;
                    int i38 = i29;
                    int i39 = i32;
                    int i40 = i36;
                    while (i39 < 3) {
                        if (i37 == 0) {
                            this.bitb = i40;
                            this.bitk = i39;
                            zStream.avail_in = i37;
                            zStream.total_in += (long) (i38 - zStream.next_in_index);
                            zStream.next_in_index = i38;
                            this.write = i35;
                            return inflate_flush(zStream, i);
                        }
                        i = 0;
                        i37--;
                        i40 |= (zStream.next_in[i38] & 255) << i39;
                        i39 += 8;
                        i38++;
                    }
                    int i41 = i40 & 7;
                    this.last = i41 & 1;
                    switch (i41 >>> 1) {
                        case 0:
                            int i42 = i39 + Z_DATA_ERROR;
                            int i43 = i42 & 7;
                            i2 = (i40 >>> 3) >>> i43;
                            i3 = i42 - i43;
                            this.mode = 1;
                            break;
                        case 1:
                            int[] iArr5 = new int[1];
                            int[] iArr6 = new int[1];
                            int[][] iArr7 = new int[1][];
                            int[][] iArr8 = new int[1][];
                            InfTree.inflate_trees_fixed(iArr5, iArr6, iArr7, iArr8, zStream);
                            this.codes.init(iArr5[0], iArr6[0], iArr7[0], 0, iArr8[0], 0, zStream);
                            i2 = i40 >>> 3;
                            i3 = i39 + Z_DATA_ERROR;
                            this.mode = 6;
                            break;
                        case 2:
                            i2 = i40 >>> 3;
                            i3 = i39 + Z_DATA_ERROR;
                            this.mode = 3;
                            break;
                        case 3:
                            int i44 = i39 + Z_DATA_ERROR;
                            this.mode = 9;
                            zStream.msg = "invalid block type";
                            this.bitb = i40 >>> 3;
                            this.bitk = i44;
                            zStream.avail_in = i37;
                            zStream.total_in += (long) (i38 - zStream.next_in_index);
                            zStream.next_in_index = i38;
                            this.write = i35;
                            return inflate_flush(zStream, Z_DATA_ERROR);
                        default:
                            i3 = i39;
                            i2 = i40;
                            break;
                    }
                    i30 = i37;
                    i29 = i38;
                    i32 = i3;
                    i36 = i2;
                    break;
                case 1:
                    int i45 = i30;
                    while (true) {
                        int i46 = i29;
                        if (i32 >= 32) {
                            if ((((i36 ^ (-1)) >>> 16) & 65535) == (65535 & i36)) {
                                this.left = 65535 & i36;
                                this.mode = this.left != 0 ? 2 : this.last != 0 ? 7 : 0;
                                i30 = i45;
                                i29 = i46;
                                i32 = 0;
                                i36 = 0;
                                break;
                            }
                            this.mode = 9;
                            zStream.msg = "invalid stored block lengths";
                            this.bitb = i36;
                            this.bitk = i32;
                            zStream.avail_in = i45;
                            zStream.total_in += (long) (i46 - zStream.next_in_index);
                            zStream.next_in_index = i46;
                            this.write = i35;
                            return inflate_flush(zStream, Z_DATA_ERROR);
                        }
                        if (i45 == 0) {
                            this.bitb = i36;
                            this.bitk = i32;
                            zStream.avail_in = i45;
                            zStream.total_in += (long) (i46 - zStream.next_in_index);
                            zStream.next_in_index = i46;
                            this.write = i35;
                            return inflate_flush(zStream, i);
                        }
                        i = 0;
                        i45--;
                        i29 = i46 + 1;
                        i36 |= (zStream.next_in[i46] & 255) << i32;
                        i32 += 8;
                    }
                    break;
                case 2:
                    if (i30 == 0) {
                        this.bitb = i36;
                        this.bitk = i32;
                        zStream.avail_in = i30;
                        zStream.total_in += (long) (i29 - zStream.next_in_index);
                        zStream.next_in_index = i29;
                        this.write = i35;
                        return inflate_flush(zStream, i);
                    }
                    if (i34 == 0) {
                        if (i35 == this.end && this.read != 0) {
                            i35 = 0;
                            i34 = 0 < this.read ? (this.read - 0) - 1 : this.end - 0;
                        }
                        if (i34 == 0) {
                            this.write = i35;
                            int iInflate_flush = inflate_flush(zStream, i);
                            i35 = this.write;
                            int i47 = i35 < this.read ? (this.read - i35) - 1 : this.end - i35;
                            if (i35 != this.end || this.read == 0) {
                                i34 = i47;
                            } else {
                                i35 = 0;
                                i34 = 0 < this.read ? (this.read - 0) - 1 : this.end - 0;
                            }
                            if (i34 == 0) {
                                this.bitb = i36;
                                this.bitk = i32;
                                zStream.avail_in = i30;
                                zStream.total_in += (long) (i29 - zStream.next_in_index);
                                zStream.next_in_index = i29;
                                this.write = i35;
                                return inflate_flush(zStream, iInflate_flush);
                            }
                        }
                    }
                    i = 0;
                    int i48 = this.left;
                    if (i48 > i30) {
                        i48 = i30;
                    }
                    int i49 = i48 > i34 ? i34 : i48;
                    System.arraycopy(zStream.next_in, i29, this.window, i35, i49);
                    i29 += i49;
                    i30 -= i49;
                    int i50 = i35 + i49;
                    int i51 = i34 - i49;
                    int i52 = this.left - i49;
                    this.left = i52;
                    if (i52 != 0) {
                        i34 = i51;
                        i35 = i50;
                    } else {
                        this.mode = this.last != 0 ? 7 : 0;
                        i34 = i51;
                        i35 = i50;
                    }
                    break;
                    break;
                case 3:
                    while (i32 < 14) {
                        if (i30 == 0) {
                            this.bitb = i36;
                            this.bitk = i32;
                            zStream.avail_in = i30;
                            zStream.total_in += (long) (i29 - zStream.next_in_index);
                            zStream.next_in_index = i29;
                            this.write = i35;
                            return inflate_flush(zStream, i);
                        }
                        i = 0;
                        i30--;
                        i36 |= (zStream.next_in[i29] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << i32;
                        i32 += 8;
                        i29++;
                    }
                    int i53 = i36 & 16383;
                    this.table = i53;
                    if ((i53 & 31) > 29 || ((i53 >> 5) & 31) > 29) {
                        this.mode = 9;
                        zStream.msg = "too many length or distance symbols";
                        this.bitb = i36;
                        this.bitk = i32;
                        zStream.avail_in = i30;
                        zStream.total_in += (long) (i29 - zStream.next_in_index);
                        zStream.next_in_index = i29;
                        this.write = i35;
                        return inflate_flush(zStream, Z_DATA_ERROR);
                    }
                    int i54 = (i53 & 31) + 258 + ((i53 >> 5) & 31);
                    if (this.blens == null || this.blens.length < i54) {
                        this.blens = new int[i54];
                    } else {
                        for (int i55 = 0; i55 < i54; i55++) {
                            this.blens[i55] = 0;
                        }
                    }
                    i36 >>>= 14;
                    i32 -= 14;
                    this.index = 0;
                    this.mode = 4;
                    while (true) {
                        i26 = i30;
                        i27 = i29;
                        i28 = i32;
                        if (this.index < (this.table >>> 10) + 4) {
                            i30 = i26;
                            while (true) {
                                i29 = i27;
                                if (i28 < 3) {
                                    if (i30 != 0) {
                                        this.bitb = i36;
                                        this.bitk = i28;
                                        zStream.avail_in = i30;
                                        zStream.total_in += (long) (i29 - zStream.next_in_index);
                                        zStream.next_in_index = i29;
                                        this.write = i35;
                                        return inflate_flush(zStream, i);
                                    }
                                    i = 0;
                                    i30--;
                                    i27 = i29 + 1;
                                    i36 |= (zStream.next_in[i29] & 255) << i28;
                                    i28 += 8;
                                }
                            }
                            int[] iArr9 = this.blens;
                            int[] iArr10 = border;
                            int i56 = this.index;
                            this.index = i56 + 1;
                            iArr9[iArr10[i56]] = i36 & 7;
                            i36 >>>= 3;
                            i32 = i28 + Z_DATA_ERROR;
                        } else {
                            while (this.index < 19) {
                                int[] iArr11 = this.blens;
                                int[] iArr12 = border;
                                int i57 = this.index;
                                this.index = i57 + 1;
                                iArr11[iArr12[i57]] = 0;
                            }
                            this.f72bb[0] = 7;
                            iInflate_trees_bits = this.inftree.inflate_trees_bits(this.blens, this.f72bb, this.f73tb, this.hufts, zStream);
                            if (iInflate_trees_bits != 0) {
                                if (iInflate_trees_bits == Z_DATA_ERROR) {
                                    this.blens = null;
                                    this.mode = 9;
                                }
                                this.bitb = i36;
                                this.bitk = i28;
                                zStream.avail_in = i26;
                                zStream.total_in += (long) (i27 - zStream.next_in_index);
                                zStream.next_in_index = i27;
                                this.write = i35;
                                return inflate_flush(zStream, iInflate_trees_bits);
                            }
                            this.index = 0;
                            this.mode = 5;
                            i6 = i26;
                            i7 = i27;
                            i8 = i28;
                        }
                    }
                    while (true) {
                        i9 = i36;
                        i11 = this.table;
                        if (this.index >= ((i11 >> 5) & 31) + (i11 & 31) + 258) {
                            this.f73tb[0] = -1;
                            iArr3 = new int[1];
                            iArr4 = new int[1];
                            iArr = new int[]{9};
                            iArr2 = new int[]{6};
                            int i58 = this.table;
                            iInflate_trees_dynamic = this.inftree.inflate_trees_dynamic((i58 & 31) + 257, ((i58 >> 5) & 31) + 1, this.blens, iArr, iArr2, iArr3, iArr4, this.hufts, zStream);
                            if (iInflate_trees_dynamic != 0) {
                                if (iInflate_trees_dynamic == Z_DATA_ERROR) {
                                    this.blens = null;
                                    this.mode = 9;
                                }
                                this.bitb = i9;
                                this.bitk = i8;
                                zStream.avail_in = i6;
                                zStream.total_in += (long) (i7 - zStream.next_in_index);
                                zStream.next_in_index = i7;
                                this.write = i35;
                                return inflate_flush(zStream, iInflate_trees_dynamic);
                            }
                            this.codes.init(iArr[0], iArr2[0], this.hufts, iArr3[0], this.hufts, iArr4[0], zStream);
                            this.mode = 6;
                        } else {
                            i12 = this.f72bb[0];
                            i13 = i6;
                            i14 = i7;
                            i15 = i8;
                            i16 = i9;
                            while (i15 < i12) {
                                if (i13 == 0) {
                                    this.bitb = i16;
                                    this.bitk = i15;
                                    zStream.avail_in = i13;
                                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                                    zStream.next_in_index = i14;
                                    this.write = i35;
                                    return inflate_flush(zStream, i);
                                }
                                i = 0;
                                i13--;
                                i16 |= (zStream.next_in[i14] & 255) << i15;
                                i15 += 8;
                                i14++;
                            }
                            if (this.f73tb[0] == -1) {
                            }
                            i17 = this.hufts[(((inflate_mask[i12] & i16) + this.f73tb[0]) * 3) + 1];
                            i18 = this.hufts[((this.f73tb[0] + (inflate_mask[i17] & i16)) * 3) + 2];
                            if (i18 < 16) {
                                i36 = i16 >>> i17;
                                int i59 = i15 - i17;
                                int[] iArr13 = this.blens;
                                int i60 = this.index;
                                this.index = i60 + 1;
                                iArr13[i60] = i18;
                                i6 = i13;
                                i7 = i14;
                                i8 = i59;
                            } else {
                                if (i18 == 18) {
                                    i19 = 7;
                                } else {
                                    i19 = i18 - 14;
                                }
                                if (i18 == 18) {
                                    i20 = 11;
                                } else {
                                    i20 = 3;
                                }
                                i21 = i15;
                                while (i21 < i17 + i19) {
                                    if (i13 == 0) {
                                        this.bitb = i16;
                                        this.bitk = i21;
                                        zStream.avail_in = i13;
                                        zStream.total_in += (long) (i14 - zStream.next_in_index);
                                        zStream.next_in_index = i14;
                                        this.write = i35;
                                        return inflate_flush(zStream, i);
                                    }
                                    i = 0;
                                    i13--;
                                    i16 |= (zStream.next_in[i14] & 255) << i21;
                                    i21 += 8;
                                    i14++;
                                }
                                int i61 = i16 >>> i17;
                                i22 = (inflate_mask[i19] & i61) + i20;
                                i36 = i61 >>> i19;
                                i23 = (i21 - i17) - i19;
                                i24 = this.index;
                                i25 = this.table;
                                if (i24 + i22 <= ((i25 >> 5) & 31) + (i25 & 31) + 258 || (i18 == 16 && i24 < 1)) {
                                    this.blens = null;
                                    this.mode = 9;
                                    zStream.msg = "invalid bit length repeat";
                                    this.bitb = i36;
                                    this.bitk = i23;
                                    zStream.avail_in = i13;
                                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                                    zStream.next_in_index = i14;
                                    this.write = i35;
                                    return inflate_flush(zStream, Z_DATA_ERROR);
                                }
                                int i62 = i18 == 16 ? this.blens[i24 - 1] : 0;
                                while (true) {
                                    int i63 = i24 + 1;
                                    this.blens[i24] = i62;
                                    i22--;
                                    if (i22 == 0) {
                                        this.index = i63;
                                        i6 = i13;
                                        i7 = i14;
                                        i8 = i23;
                                    } else {
                                        i24 = i63;
                                    }
                                }
                            }
                        }
                    }
                    this.bitb = i9;
                    this.bitk = i8;
                    zStream.avail_in = i6;
                    zStream.total_in += (long) (i7 - zStream.next_in_index);
                    zStream.next_in_index = i7;
                    this.write = i35;
                    iProc = this.codes.proc(this, zStream, i);
                    if (iProc != 1) {
                        return inflate_flush(zStream, iProc);
                    }
                    i = 0;
                    this.codes.free(zStream);
                    i29 = zStream.next_in_index;
                    i30 = zStream.avail_in;
                    i4 = this.bitb;
                    i32 = this.bitk;
                    i5 = this.write;
                    if (i5 < this.read) {
                        i10 = (this.read - i5) - 1;
                    } else {
                        i10 = this.end - i5;
                    }
                    if (this.last == 0) {
                        this.mode = 0;
                        i34 = i10;
                        i35 = i5;
                        i36 = i4;
                    } else {
                        this.mode = 7;
                    }
                    break;
                    break;
                case 4:
                    while (true) {
                        i26 = i30;
                        i27 = i29;
                        i28 = i32;
                        if (this.index < (this.table >>> 10) + 4) {
                            i30 = i26;
                            while (true) {
                                i29 = i27;
                                if (i28 < 3) {
                                    if (i30 != 0) {
                                        this.bitb = i36;
                                        this.bitk = i28;
                                        zStream.avail_in = i30;
                                        zStream.total_in += (long) (i29 - zStream.next_in_index);
                                        zStream.next_in_index = i29;
                                        this.write = i35;
                                        return inflate_flush(zStream, i);
                                    }
                                    i = 0;
                                    i30--;
                                    i27 = i29 + 1;
                                    i36 |= (zStream.next_in[i29] & 255) << i28;
                                    i28 += 8;
                                }
                            }
                            int[] iArr14 = this.blens;
                            int[] iArr15 = border;
                            int i510 = this.index;
                            this.index = i510 + 1;
                            iArr14[iArr15[i510]] = i36 & 7;
                            i36 >>>= 3;
                            i32 = i28 + Z_DATA_ERROR;
                        } else {
                            while (this.index < 19) {
                                int[] iArr16 = this.blens;
                                int[] iArr17 = border;
                                int i511 = this.index;
                                this.index = i511 + 1;
                                iArr16[iArr17[i511]] = 0;
                            }
                            this.f72bb[0] = 7;
                            iInflate_trees_bits = this.inftree.inflate_trees_bits(this.blens, this.f72bb, this.f73tb, this.hufts, zStream);
                            if (iInflate_trees_bits != 0) {
                                if (iInflate_trees_bits == Z_DATA_ERROR) {
                                    this.blens = null;
                                    this.mode = 9;
                                }
                                this.bitb = i36;
                                this.bitk = i28;
                                zStream.avail_in = i26;
                                zStream.total_in += (long) (i27 - zStream.next_in_index);
                                zStream.next_in_index = i27;
                                this.write = i35;
                                return inflate_flush(zStream, iInflate_trees_bits);
                            }
                            this.index = 0;
                            this.mode = 5;
                            i6 = i26;
                            i7 = i27;
                            i8 = i28;
                        }
                    }
                    while (true) {
                        i9 = i36;
                        i11 = this.table;
                        if (this.index >= ((i11 >> 5) & 31) + (i11 & 31) + 258) {
                            this.f73tb[0] = -1;
                            iArr3 = new int[1];
                            iArr4 = new int[1];
                            iArr = new int[]{9};
                            iArr2 = new int[]{6};
                            int i512 = this.table;
                            iInflate_trees_dynamic = this.inftree.inflate_trees_dynamic((i512 & 31) + 257, ((i512 >> 5) & 31) + 1, this.blens, iArr, iArr2, iArr3, iArr4, this.hufts, zStream);
                            if (iInflate_trees_dynamic != 0) {
                                if (iInflate_trees_dynamic == Z_DATA_ERROR) {
                                    this.blens = null;
                                    this.mode = 9;
                                }
                                this.bitb = i9;
                                this.bitk = i8;
                                zStream.avail_in = i6;
                                zStream.total_in += (long) (i7 - zStream.next_in_index);
                                zStream.next_in_index = i7;
                                this.write = i35;
                                return inflate_flush(zStream, iInflate_trees_dynamic);
                            }
                            this.codes.init(iArr[0], iArr2[0], this.hufts, iArr3[0], this.hufts, iArr4[0], zStream);
                            this.mode = 6;
                        } else {
                            i12 = this.f72bb[0];
                            i13 = i6;
                            i14 = i7;
                            i15 = i8;
                            i16 = i9;
                            while (i15 < i12) {
                                if (i13 == 0) {
                                    this.bitb = i16;
                                    this.bitk = i15;
                                    zStream.avail_in = i13;
                                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                                    zStream.next_in_index = i14;
                                    this.write = i35;
                                    return inflate_flush(zStream, i);
                                }
                                i = 0;
                                i13--;
                                i16 |= (zStream.next_in[i14] & 255) << i15;
                                i15 += 8;
                                i14++;
                            }
                            if (this.f73tb[0] == -1) {
                            }
                            i17 = this.hufts[(((inflate_mask[i12] & i16) + this.f73tb[0]) * 3) + 1];
                            i18 = this.hufts[((this.f73tb[0] + (inflate_mask[i17] & i16)) * 3) + 2];
                            if (i18 < 16) {
                                if (i18 == 18) {
                                    i19 = 7;
                                } else {
                                    i19 = i18 - 14;
                                }
                                if (i18 == 18) {
                                    i20 = 11;
                                } else {
                                    i20 = 3;
                                }
                                i21 = i15;
                                while (i21 < i17 + i19) {
                                    if (i13 == 0) {
                                        this.bitb = i16;
                                        this.bitk = i21;
                                        zStream.avail_in = i13;
                                        zStream.total_in += (long) (i14 - zStream.next_in_index);
                                        zStream.next_in_index = i14;
                                        this.write = i35;
                                        return inflate_flush(zStream, i);
                                    }
                                    i = 0;
                                    i13--;
                                    i16 |= (zStream.next_in[i14] & 255) << i21;
                                    i21 += 8;
                                    i14++;
                                }
                                int i64 = i16 >>> i17;
                                i22 = (inflate_mask[i19] & i64) + i20;
                                i36 = i64 >>> i19;
                                i23 = (i21 - i17) - i19;
                                i24 = this.index;
                                i25 = this.table;
                                if (i24 + i22 <= ((i25 >> 5) & 31) + (i25 & 31) + 258) {
                                }
                                this.blens = null;
                                this.mode = 9;
                                zStream.msg = "invalid bit length repeat";
                                this.bitb = i36;
                                this.bitk = i23;
                                zStream.avail_in = i13;
                                zStream.total_in += (long) (i14 - zStream.next_in_index);
                                zStream.next_in_index = i14;
                                this.write = i35;
                                return inflate_flush(zStream, Z_DATA_ERROR);
                            }
                            i36 = i16 >>> i17;
                            int i513 = i15 - i17;
                            int[] iArr18 = this.blens;
                            int i65 = this.index;
                            this.index = i65 + 1;
                            iArr18[i65] = i18;
                            i6 = i13;
                            i7 = i14;
                            i8 = i513;
                        }
                    }
                    this.bitb = i9;
                    this.bitk = i8;
                    zStream.avail_in = i6;
                    zStream.total_in += (long) (i7 - zStream.next_in_index);
                    zStream.next_in_index = i7;
                    this.write = i35;
                    iProc = this.codes.proc(this, zStream, i);
                    if (iProc != 1) {
                        return inflate_flush(zStream, iProc);
                    }
                    i = 0;
                    this.codes.free(zStream);
                    i29 = zStream.next_in_index;
                    i30 = zStream.avail_in;
                    i4 = this.bitb;
                    i32 = this.bitk;
                    i5 = this.write;
                    if (i5 < this.read) {
                        i10 = (this.read - i5) - 1;
                    } else {
                        i10 = this.end - i5;
                    }
                    if (this.last == 0) {
                        this.mode = 0;
                        i34 = i10;
                        i35 = i5;
                        i36 = i4;
                    } else {
                        this.mode = 7;
                    }
                    break;
                    break;
                case 5:
                    i6 = i30;
                    i7 = i29;
                    i8 = i32;
                    while (true) {
                        i9 = i36;
                        i11 = this.table;
                        if (this.index >= ((i11 >> 5) & 31) + (i11 & 31) + 258) {
                            this.f73tb[0] = -1;
                            iArr3 = new int[1];
                            iArr4 = new int[1];
                            iArr = new int[]{9};
                            iArr2 = new int[]{6};
                            int i514 = this.table;
                            iInflate_trees_dynamic = this.inftree.inflate_trees_dynamic((i514 & 31) + 257, ((i514 >> 5) & 31) + 1, this.blens, iArr, iArr2, iArr3, iArr4, this.hufts, zStream);
                            if (iInflate_trees_dynamic != 0) {
                                if (iInflate_trees_dynamic == Z_DATA_ERROR) {
                                    this.blens = null;
                                    this.mode = 9;
                                }
                                this.bitb = i9;
                                this.bitk = i8;
                                zStream.avail_in = i6;
                                zStream.total_in += (long) (i7 - zStream.next_in_index);
                                zStream.next_in_index = i7;
                                this.write = i35;
                                return inflate_flush(zStream, iInflate_trees_dynamic);
                            }
                            this.codes.init(iArr[0], iArr2[0], this.hufts, iArr3[0], this.hufts, iArr4[0], zStream);
                            this.mode = 6;
                        } else {
                            i12 = this.f72bb[0];
                            i13 = i6;
                            i14 = i7;
                            i15 = i8;
                            i16 = i9;
                            while (i15 < i12) {
                                if (i13 == 0) {
                                    this.bitb = i16;
                                    this.bitk = i15;
                                    zStream.avail_in = i13;
                                    zStream.total_in += (long) (i14 - zStream.next_in_index);
                                    zStream.next_in_index = i14;
                                    this.write = i35;
                                    return inflate_flush(zStream, i);
                                }
                                i = 0;
                                i13--;
                                i16 |= (zStream.next_in[i14] & 255) << i15;
                                i15 += 8;
                                i14++;
                            }
                            if (this.f73tb[0] == -1) {
                            }
                            i17 = this.hufts[(((inflate_mask[i12] & i16) + this.f73tb[0]) * 3) + 1];
                            i18 = this.hufts[((this.f73tb[0] + (inflate_mask[i17] & i16)) * 3) + 2];
                            if (i18 < 16) {
                                if (i18 == 18) {
                                    i19 = 7;
                                } else {
                                    i19 = i18 - 14;
                                }
                                if (i18 == 18) {
                                    i20 = 11;
                                } else {
                                    i20 = 3;
                                }
                                i21 = i15;
                                while (i21 < i17 + i19) {
                                    if (i13 == 0) {
                                        this.bitb = i16;
                                        this.bitk = i21;
                                        zStream.avail_in = i13;
                                        zStream.total_in += (long) (i14 - zStream.next_in_index);
                                        zStream.next_in_index = i14;
                                        this.write = i35;
                                        return inflate_flush(zStream, i);
                                    }
                                    i = 0;
                                    i13--;
                                    i16 |= (zStream.next_in[i14] & 255) << i21;
                                    i21 += 8;
                                    i14++;
                                }
                                int i66 = i16 >>> i17;
                                i22 = (inflate_mask[i19] & i66) + i20;
                                i36 = i66 >>> i19;
                                i23 = (i21 - i17) - i19;
                                i24 = this.index;
                                i25 = this.table;
                                if (i24 + i22 <= ((i25 >> 5) & 31) + (i25 & 31) + 258) {
                                }
                                this.blens = null;
                                this.mode = 9;
                                zStream.msg = "invalid bit length repeat";
                                this.bitb = i36;
                                this.bitk = i23;
                                zStream.avail_in = i13;
                                zStream.total_in += (long) (i14 - zStream.next_in_index);
                                zStream.next_in_index = i14;
                                this.write = i35;
                                return inflate_flush(zStream, Z_DATA_ERROR);
                            }
                            i36 = i16 >>> i17;
                            int i515 = i15 - i17;
                            int[] iArr19 = this.blens;
                            int i67 = this.index;
                            this.index = i67 + 1;
                            iArr19[i67] = i18;
                            i6 = i13;
                            i7 = i14;
                            i8 = i515;
                        }
                    }
                    this.bitb = i9;
                    this.bitk = i8;
                    zStream.avail_in = i6;
                    zStream.total_in += (long) (i7 - zStream.next_in_index);
                    zStream.next_in_index = i7;
                    this.write = i35;
                    iProc = this.codes.proc(this, zStream, i);
                    if (iProc != 1) {
                        return inflate_flush(zStream, iProc);
                    }
                    i = 0;
                    this.codes.free(zStream);
                    i29 = zStream.next_in_index;
                    i30 = zStream.avail_in;
                    i4 = this.bitb;
                    i32 = this.bitk;
                    i5 = this.write;
                    if (i5 < this.read) {
                        i10 = (this.read - i5) - 1;
                    } else {
                        i10 = this.end - i5;
                    }
                    if (this.last == 0) {
                        this.mode = 0;
                        i34 = i10;
                        i35 = i5;
                        i36 = i4;
                    } else {
                        this.mode = 7;
                    }
                    break;
                    break;
                case 6:
                    i6 = i30;
                    i7 = i29;
                    i8 = i32;
                    i9 = i36;
                    this.bitb = i9;
                    this.bitk = i8;
                    zStream.avail_in = i6;
                    zStream.total_in += (long) (i7 - zStream.next_in_index);
                    zStream.next_in_index = i7;
                    this.write = i35;
                    iProc = this.codes.proc(this, zStream, i);
                    if (iProc != 1) {
                        return inflate_flush(zStream, iProc);
                    }
                    i = 0;
                    this.codes.free(zStream);
                    i29 = zStream.next_in_index;
                    i30 = zStream.avail_in;
                    i4 = this.bitb;
                    i32 = this.bitk;
                    i5 = this.write;
                    if (i5 < this.read) {
                        i10 = (this.read - i5) - 1;
                    } else {
                        i10 = this.end - i5;
                    }
                    if (this.last == 0) {
                        this.mode = 0;
                        i34 = i10;
                        i35 = i5;
                        i36 = i4;
                    } else {
                        this.mode = 7;
                    }
                    break;
                    break;
                case 7:
                    i5 = i35;
                    i4 = i36;
                    break;
                case 8:
                    i4 = i36;
                    this.bitb = i4;
                    this.bitk = i32;
                    zStream.avail_in = i30;
                    zStream.total_in += (long) (i29 - zStream.next_in_index);
                    zStream.next_in_index = i29;
                    this.write = i35;
                    return inflate_flush(zStream, 1);
                case 9:
                    this.bitb = i36;
                    this.bitk = i32;
                    zStream.avail_in = i30;
                    zStream.total_in += (long) (i29 - zStream.next_in_index);
                    zStream.next_in_index = i29;
                    this.write = i35;
                    return inflate_flush(zStream, Z_DATA_ERROR);
                default:
                    this.bitb = i36;
                    this.bitk = i32;
                    zStream.avail_in = i30;
                    zStream.total_in += (long) (i29 - zStream.next_in_index);
                    zStream.next_in_index = i29;
                    this.write = i35;
                    return inflate_flush(zStream, Z_STREAM_ERROR);
            }
        }
        this.write = i5;
        int iInflate_flush2 = inflate_flush(zStream, i);
        i35 = this.write;
        if (i35 < this.read) {
            int i68 = (this.read - i35) - 1;
        } else {
            int i69 = this.end - i35;
        }
        if (this.read != this.write) {
            this.bitb = i4;
            this.bitk = i32;
            zStream.avail_in = i30;
            zStream.total_in += (long) (i29 - zStream.next_in_index);
            zStream.next_in_index = i29;
            this.write = i35;
            return inflate_flush(zStream, iInflate_flush2);
        }
        this.mode = 8;
        this.bitb = i4;
        this.bitk = i32;
        zStream.avail_in = i30;
        zStream.total_in += (long) (i29 - zStream.next_in_index);
        zStream.next_in_index = i29;
        this.write = i35;
        return inflate_flush(zStream, 1);
    }

    void reset(ZStream zStream, long[] jArr) {
        if (jArr != null) {
            jArr[0] = this.check;
        }
        if (this.mode == 4 || this.mode == 5) {
        }
        if (this.mode == 6) {
            this.codes.free(zStream);
        }
        this.mode = 0;
        this.bitk = 0;
        this.bitb = 0;
        this.write = 0;
        this.read = 0;
        if (this.checkfn != null) {
            long jAdler32 = zStream._adler.adler32(0L, null, 0, 0);
            this.check = jAdler32;
            zStream.adler = jAdler32;
        }
    }

    void set_dictionary(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.window, 0, i2);
        this.write = i2;
        this.read = i2;
    }

    int sync_point() {
        return this.mode == 1 ? 1 : 0;
    }
}
