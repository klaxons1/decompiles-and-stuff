package com.jcraft.jzlib;

import p000.GameStatus;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class Inflate {
    private static final int BAD = 13;
    private static final int BLOCKS = 7;
    private static final int CHECK1 = 11;
    private static final int CHECK2 = 10;
    private static final int CHECK3 = 9;
    private static final int CHECK4 = 8;
    private static final int DICT0 = 6;
    private static final int DICT1 = 5;
    private static final int DICT2 = 4;
    private static final int DICT3 = 3;
    private static final int DICT4 = 2;
    private static final int DONE = 12;
    private static final int FLAG = 1;
    private static final int MAX_WBITS = 15;
    private static final int METHOD = 0;
    private static final int PRESET_DICT = 32;
    private static final int Z_BUF_ERROR = -5;
    private static final int Z_DATA_ERROR = -3;
    private static final int Z_DEFLATED = 8;
    private static final int Z_ERRNO = -1;
    static final int Z_FINISH = 4;
    static final int Z_FULL_FLUSH = 3;
    private static final int Z_MEM_ERROR = -4;
    private static final int Z_NEED_DICT = 2;
    static final int Z_NO_FLUSH = 0;
    private static final int Z_OK = 0;
    static final int Z_PARTIAL_FLUSH = 1;
    private static final int Z_STREAM_END = 1;
    private static final int Z_STREAM_ERROR = -2;
    static final int Z_SYNC_FLUSH = 2;
    private static final int Z_VERSION_ERROR = -6;
    private static byte[] mark = {0, 0, -1, -1};
    InfBlocks blocks;
    int marker;
    int method;
    int mode;
    long need;
    int nowrap;
    long[] was = new long[1];
    int wbits;

    Inflate() {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:46:0x0158  */
    /* JADX WARN: Code duplicated, block: B:47:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0211  */
    /* JADX WARN: Code duplicated, block: B:68:0x0243  */
    /* JADX WARN: Code duplicated, block: B:71:0x0275  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x000b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00bd A[SYNTHETIC] */
    int inflate(ZStream zStream, int i) {
        int i2;
        if (zStream == null || zStream.istate == null || zStream.next_in == null) {
            return Z_STREAM_ERROR;
        }
        int i3 = i == 4 ? Z_BUF_ERROR : 0;
        int iProc = Z_BUF_ERROR;
        while (true) {
            switch (zStream.istate.mode) {
                case 0:
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate = zStream.istate;
                    byte[] bArr = zStream.next_in;
                    int i4 = zStream.next_in_index;
                    zStream.next_in_index = i4 + 1;
                    byte b = bArr[i4];
                    inflate.method = b;
                    if ((b & 15) != 8) {
                        zStream.istate.mode = 13;
                        zStream.msg = "unknown compression method";
                        zStream.istate.marker = 5;
                        iProc = i3;
                    } else if ((zStream.istate.method >> 4) + 8 > zStream.istate.wbits) {
                        zStream.istate.mode = 13;
                        zStream.msg = "invalid window size";
                        zStream.istate.marker = 5;
                        iProc = i3;
                    } else {
                        zStream.istate.mode = 1;
                        iProc = i3;
                        if (zStream.avail_in != 0) {
                            return iProc;
                        }
                        zStream.avail_in--;
                        zStream.total_in++;
                        byte[] bArr2 = zStream.next_in;
                        int i5 = zStream.next_in_index;
                        zStream.next_in_index = i5 + 1;
                        i2 = bArr2[i5] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                        if (((zStream.istate.method << 8) + i2) % 31 != 0) {
                            zStream.istate.mode = 13;
                            zStream.msg = "incorrect header check";
                            zStream.istate.marker = 5;
                            iProc = i3;
                        } else {
                            if ((i2 & 32) == 0) {
                                zStream.istate.mode = 2;
                                iProc = i3;
                                if (zStream.avail_in == 0) {
                                    return iProc;
                                }
                                zStream.avail_in--;
                                zStream.total_in++;
                                Inflate inflate2 = zStream.istate;
                                byte[] bArr3 = zStream.next_in;
                                int i6 = zStream.next_in_index;
                                zStream.next_in_index = i6 + 1;
                                inflate2.need = ((long) ((bArr3[i6] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24)) & 4278190080L;
                                zStream.istate.mode = 3;
                                iProc = i3;
                                if (zStream.avail_in != 0) {
                                    return iProc;
                                }
                                zStream.avail_in--;
                                zStream.total_in++;
                                Inflate inflate3 = zStream.istate;
                                long j = inflate3.need;
                                byte[] bArr4 = zStream.next_in;
                                int i7 = zStream.next_in_index;
                                zStream.next_in_index = i7 + 1;
                                inflate3.need = j + (((long) ((bArr4[i7] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16)) & 16711680);
                                zStream.istate.mode = 4;
                                iProc = i3;
                                if (zStream.avail_in == 0) {
                                    return iProc;
                                }
                                zStream.avail_in--;
                                zStream.total_in++;
                                Inflate inflate4 = zStream.istate;
                                long j2 = inflate4.need;
                                byte[] bArr5 = zStream.next_in;
                                int i8 = zStream.next_in_index;
                                zStream.next_in_index = i8 + 1;
                                inflate4.need = j2 + (((long) ((bArr5[i8] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                                zStream.istate.mode = 5;
                                if (zStream.avail_in == 0) {
                                    return i3;
                                }
                                zStream.avail_in--;
                                zStream.total_in++;
                                Inflate inflate5 = zStream.istate;
                                long j3 = inflate5.need;
                                byte[] bArr6 = zStream.next_in;
                                int i9 = zStream.next_in_index;
                                zStream.next_in_index = i9 + 1;
                                inflate5.need = j3 + (((long) bArr6[i9]) & 255);
                                zStream.adler = zStream.istate.need;
                                zStream.istate.mode = 6;
                                return 2;
                            }
                            zStream.istate.mode = 7;
                            iProc = i3;
                        }
                    }
                    break;
                    break;
                case 1:
                    if (zStream.avail_in != 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    byte[] bArr7 = zStream.next_in;
                    int i10 = zStream.next_in_index;
                    zStream.next_in_index = i10 + 1;
                    i2 = bArr7[i10] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                    if (((zStream.istate.method << 8) + i2) % 31 != 0) {
                        zStream.istate.mode = 13;
                        zStream.msg = "incorrect header check";
                        zStream.istate.marker = 5;
                        iProc = i3;
                    } else {
                        if ((i2 & 32) == 0) {
                            zStream.istate.mode = 2;
                            iProc = i3;
                            if (zStream.avail_in == 0) {
                                return iProc;
                            }
                            zStream.avail_in--;
                            zStream.total_in++;
                            Inflate inflate6 = zStream.istate;
                            byte[] bArr8 = zStream.next_in;
                            int i11 = zStream.next_in_index;
                            zStream.next_in_index = i11 + 1;
                            inflate6.need = ((long) ((bArr8[i11] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24)) & 4278190080L;
                            zStream.istate.mode = 3;
                            iProc = i3;
                            if (zStream.avail_in != 0) {
                                return iProc;
                            }
                            zStream.avail_in--;
                            zStream.total_in++;
                            Inflate inflate7 = zStream.istate;
                            long j4 = inflate7.need;
                            byte[] bArr9 = zStream.next_in;
                            int i12 = zStream.next_in_index;
                            zStream.next_in_index = i12 + 1;
                            inflate7.need = j4 + (((long) ((bArr9[i12] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16)) & 16711680);
                            zStream.istate.mode = 4;
                            iProc = i3;
                            if (zStream.avail_in == 0) {
                                return iProc;
                            }
                            zStream.avail_in--;
                            zStream.total_in++;
                            Inflate inflate8 = zStream.istate;
                            long j5 = inflate8.need;
                            byte[] bArr10 = zStream.next_in;
                            int i13 = zStream.next_in_index;
                            zStream.next_in_index = i13 + 1;
                            inflate8.need = j5 + (((long) ((bArr10[i13] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                            zStream.istate.mode = 5;
                            if (zStream.avail_in == 0) {
                                return i3;
                            }
                            zStream.avail_in--;
                            zStream.total_in++;
                            Inflate inflate9 = zStream.istate;
                            long j6 = inflate9.need;
                            byte[] bArr11 = zStream.next_in;
                            int i14 = zStream.next_in_index;
                            zStream.next_in_index = i14 + 1;
                            inflate9.need = j6 + (((long) bArr11[i14]) & 255);
                            zStream.adler = zStream.istate.need;
                            zStream.istate.mode = 6;
                            return 2;
                        }
                        zStream.istate.mode = 7;
                        iProc = i3;
                    }
                    break;
                    break;
                case 2:
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate10 = zStream.istate;
                    byte[] bArr12 = zStream.next_in;
                    int i15 = zStream.next_in_index;
                    zStream.next_in_index = i15 + 1;
                    inflate10.need = ((long) ((bArr12[i15] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24)) & 4278190080L;
                    zStream.istate.mode = 3;
                    iProc = i3;
                    if (zStream.avail_in != 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate11 = zStream.istate;
                    long j7 = inflate11.need;
                    byte[] bArr13 = zStream.next_in;
                    int i16 = zStream.next_in_index;
                    zStream.next_in_index = i16 + 1;
                    inflate11.need = j7 + (((long) ((bArr13[i16] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16)) & 16711680);
                    zStream.istate.mode = 4;
                    iProc = i3;
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate12 = zStream.istate;
                    long j8 = inflate12.need;
                    byte[] bArr14 = zStream.next_in;
                    int i17 = zStream.next_in_index;
                    zStream.next_in_index = i17 + 1;
                    inflate12.need = j8 + (((long) ((bArr14[i17] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                    zStream.istate.mode = 5;
                    if (zStream.avail_in == 0) {
                        return i3;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate13 = zStream.istate;
                    long j9 = inflate13.need;
                    byte[] bArr15 = zStream.next_in;
                    int i18 = zStream.next_in_index;
                    zStream.next_in_index = i18 + 1;
                    inflate13.need = j9 + (((long) bArr15[i18]) & 255);
                    zStream.adler = zStream.istate.need;
                    zStream.istate.mode = 6;
                    return 2;
                case 3:
                    if (zStream.avail_in != 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate14 = zStream.istate;
                    long j10 = inflate14.need;
                    byte[] bArr16 = zStream.next_in;
                    int i19 = zStream.next_in_index;
                    zStream.next_in_index = i19 + 1;
                    inflate14.need = j10 + (((long) ((bArr16[i19] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16)) & 16711680);
                    zStream.istate.mode = 4;
                    iProc = i3;
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate15 = zStream.istate;
                    long j11 = inflate15.need;
                    byte[] bArr17 = zStream.next_in;
                    int i110 = zStream.next_in_index;
                    zStream.next_in_index = i110 + 1;
                    inflate15.need = j11 + (((long) ((bArr17[i110] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                    zStream.istate.mode = 5;
                    if (zStream.avail_in == 0) {
                        return i3;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate16 = zStream.istate;
                    long j12 = inflate16.need;
                    byte[] bArr18 = zStream.next_in;
                    int i111 = zStream.next_in_index;
                    zStream.next_in_index = i111 + 1;
                    inflate16.need = j12 + (((long) bArr18[i111]) & 255);
                    zStream.adler = zStream.istate.need;
                    zStream.istate.mode = 6;
                    return 2;
                case 4:
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate17 = zStream.istate;
                    long j13 = inflate17.need;
                    byte[] bArr19 = zStream.next_in;
                    int i112 = zStream.next_in_index;
                    zStream.next_in_index = i112 + 1;
                    inflate17.need = j13 + (((long) ((bArr19[i112] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                    zStream.istate.mode = 5;
                    if (zStream.avail_in == 0) {
                        return i3;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate18 = zStream.istate;
                    long j14 = inflate18.need;
                    byte[] bArr110 = zStream.next_in;
                    int i113 = zStream.next_in_index;
                    zStream.next_in_index = i113 + 1;
                    inflate18.need = j14 + (((long) bArr110[i113]) & 255);
                    zStream.adler = zStream.istate.need;
                    zStream.istate.mode = 6;
                    return 2;
                case 5:
                    i3 = iProc;
                    if (zStream.avail_in == 0) {
                        return i3;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate19 = zStream.istate;
                    long j15 = inflate19.need;
                    byte[] bArr111 = zStream.next_in;
                    int i114 = zStream.next_in_index;
                    zStream.next_in_index = i114 + 1;
                    inflate19.need = j15 + (((long) bArr111[i114]) & 255);
                    zStream.adler = zStream.istate.need;
                    zStream.istate.mode = 6;
                    return 2;
                case 6:
                    zStream.istate.mode = 13;
                    zStream.msg = "need dictionary";
                    zStream.istate.marker = 0;
                    return Z_STREAM_ERROR;
                case 7:
                    iProc = zStream.istate.blocks.proc(zStream, iProc);
                    if (iProc == Z_DATA_ERROR) {
                        zStream.istate.mode = 13;
                        zStream.istate.marker = 0;
                    } else {
                        if (iProc == 0) {
                            iProc = i3;
                        }
                        if (iProc != 1) {
                            return iProc;
                        }
                        zStream.istate.blocks.reset(zStream, zStream.istate.was);
                        if (zStream.istate.nowrap != 0) {
                            zStream.istate.mode = 12;
                            iProc = i3;
                        } else {
                            zStream.istate.mode = 8;
                            iProc = i3;
                            if (zStream.avail_in != 0) {
                                return iProc;
                            }
                            zStream.avail_in--;
                            zStream.total_in++;
                            Inflate inflate20 = zStream.istate;
                            byte[] bArr20 = zStream.next_in;
                            int i20 = zStream.next_in_index;
                            zStream.next_in_index = i20 + 1;
                            inflate20.need = ((long) ((bArr20[i20] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24)) & 4278190080L;
                            zStream.istate.mode = 9;
                            iProc = i3;
                            if (zStream.avail_in == 0) {
                                return iProc;
                            }
                            zStream.avail_in--;
                            zStream.total_in++;
                            Inflate inflate21 = zStream.istate;
                            long j16 = inflate21.need;
                            byte[] bArr21 = zStream.next_in;
                            int i21 = zStream.next_in_index;
                            zStream.next_in_index = i21 + 1;
                            inflate21.need = j16 + (((long) ((bArr21[i21] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16)) & 16711680);
                            zStream.istate.mode = 10;
                            iProc = i3;
                            if (zStream.avail_in != 0) {
                                return iProc;
                            }
                            zStream.avail_in--;
                            zStream.total_in++;
                            Inflate inflate22 = zStream.istate;
                            long j17 = inflate22.need;
                            byte[] bArr22 = zStream.next_in;
                            int i22 = zStream.next_in_index;
                            zStream.next_in_index = i22 + 1;
                            inflate22.need = j17 + (((long) ((bArr22[i22] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                            zStream.istate.mode = 11;
                            iProc = i3;
                            if (zStream.avail_in == 0) {
                                return iProc;
                            }
                            zStream.avail_in--;
                            zStream.total_in++;
                            Inflate inflate23 = zStream.istate;
                            long j18 = inflate23.need;
                            byte[] bArr23 = zStream.next_in;
                            int i23 = zStream.next_in_index;
                            zStream.next_in_index = i23 + 1;
                            inflate23.need = j18 + (((long) bArr23[i23]) & 255);
                            if (((int) zStream.istate.was[0]) == ((int) zStream.istate.need)) {
                                zStream.istate.mode = 12;
                                return 1;
                            }
                            zStream.istate.mode = 13;
                            zStream.msg = "incorrect data check";
                            zStream.istate.marker = 5;
                            iProc = i3;
                        }
                    }
                    break;
                case 8:
                    if (zStream.avail_in != 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate24 = zStream.istate;
                    byte[] bArr24 = zStream.next_in;
                    int i24 = zStream.next_in_index;
                    zStream.next_in_index = i24 + 1;
                    inflate24.need = ((long) ((bArr24[i24] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24)) & 4278190080L;
                    zStream.istate.mode = 9;
                    iProc = i3;
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate25 = zStream.istate;
                    long j19 = inflate25.need;
                    byte[] bArr25 = zStream.next_in;
                    int i25 = zStream.next_in_index;
                    zStream.next_in_index = i25 + 1;
                    inflate25.need = j19 + (((long) ((bArr25[i25] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16)) & 16711680);
                    zStream.istate.mode = 10;
                    iProc = i3;
                    if (zStream.avail_in != 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate26 = zStream.istate;
                    long j110 = inflate26.need;
                    byte[] bArr26 = zStream.next_in;
                    int i26 = zStream.next_in_index;
                    zStream.next_in_index = i26 + 1;
                    inflate26.need = j110 + (((long) ((bArr26[i26] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                    zStream.istate.mode = 11;
                    iProc = i3;
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate27 = zStream.istate;
                    long j111 = inflate27.need;
                    byte[] bArr27 = zStream.next_in;
                    int i27 = zStream.next_in_index;
                    zStream.next_in_index = i27 + 1;
                    inflate27.need = j111 + (((long) bArr27[i27]) & 255);
                    if (((int) zStream.istate.was[0]) == ((int) zStream.istate.need)) {
                        zStream.istate.mode = 12;
                        return 1;
                    }
                    zStream.istate.mode = 13;
                    zStream.msg = "incorrect data check";
                    zStream.istate.marker = 5;
                    iProc = i3;
                    break;
                    break;
                case 9:
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate28 = zStream.istate;
                    long j112 = inflate28.need;
                    byte[] bArr28 = zStream.next_in;
                    int i28 = zStream.next_in_index;
                    zStream.next_in_index = i28 + 1;
                    inflate28.need = j112 + (((long) ((bArr28[i28] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16)) & 16711680);
                    zStream.istate.mode = 10;
                    iProc = i3;
                    if (zStream.avail_in != 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate29 = zStream.istate;
                    long j113 = inflate29.need;
                    byte[] bArr29 = zStream.next_in;
                    int i29 = zStream.next_in_index;
                    zStream.next_in_index = i29 + 1;
                    inflate29.need = j113 + (((long) ((bArr29[i29] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                    zStream.istate.mode = 11;
                    iProc = i3;
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate210 = zStream.istate;
                    long j114 = inflate210.need;
                    byte[] bArr210 = zStream.next_in;
                    int i210 = zStream.next_in_index;
                    zStream.next_in_index = i210 + 1;
                    inflate210.need = j114 + (((long) bArr210[i210]) & 255);
                    if (((int) zStream.istate.was[0]) == ((int) zStream.istate.need)) {
                        zStream.istate.mode = 12;
                        return 1;
                    }
                    zStream.istate.mode = 13;
                    zStream.msg = "incorrect data check";
                    zStream.istate.marker = 5;
                    iProc = i3;
                    break;
                    break;
                case 10:
                    if (zStream.avail_in != 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate211 = zStream.istate;
                    long j115 = inflate211.need;
                    byte[] bArr211 = zStream.next_in;
                    int i211 = zStream.next_in_index;
                    zStream.next_in_index = i211 + 1;
                    inflate211.need = j115 + (((long) ((bArr211[i211] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8)) & 65280);
                    zStream.istate.mode = 11;
                    iProc = i3;
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate212 = zStream.istate;
                    long j116 = inflate212.need;
                    byte[] bArr212 = zStream.next_in;
                    int i212 = zStream.next_in_index;
                    zStream.next_in_index = i212 + 1;
                    inflate212.need = j116 + (((long) bArr212[i212]) & 255);
                    if (((int) zStream.istate.was[0]) == ((int) zStream.istate.need)) {
                        zStream.istate.mode = 12;
                        return 1;
                    }
                    zStream.istate.mode = 13;
                    zStream.msg = "incorrect data check";
                    zStream.istate.marker = 5;
                    iProc = i3;
                    break;
                    break;
                case 11:
                    if (zStream.avail_in == 0) {
                        return iProc;
                    }
                    zStream.avail_in--;
                    zStream.total_in++;
                    Inflate inflate213 = zStream.istate;
                    long j117 = inflate213.need;
                    byte[] bArr213 = zStream.next_in;
                    int i213 = zStream.next_in_index;
                    zStream.next_in_index = i213 + 1;
                    inflate213.need = j117 + (((long) bArr213[i213]) & 255);
                    if (((int) zStream.istate.was[0]) == ((int) zStream.istate.need)) {
                        zStream.istate.mode = 12;
                        return 1;
                    }
                    zStream.istate.mode = 13;
                    zStream.msg = "incorrect data check";
                    zStream.istate.marker = 5;
                    iProc = i3;
                    break;
                    break;
                case 12:
                    return 1;
                case 13:
                    return Z_DATA_ERROR;
                default:
                    return Z_STREAM_ERROR;
            }
        }
    }

    int inflateEnd(ZStream zStream) {
        if (this.blocks != null) {
            this.blocks.free(zStream);
        }
        this.blocks = null;
        return 0;
    }

    int inflateInit(ZStream zStream, int i) {
        zStream.msg = null;
        this.blocks = null;
        this.nowrap = 0;
        if (i < 0) {
            i = -i;
            this.nowrap = 1;
        }
        if (i < 8 || i > 15) {
            inflateEnd(zStream);
            return Z_STREAM_ERROR;
        }
        this.wbits = i;
        zStream.istate.blocks = new InfBlocks(zStream, zStream.istate.nowrap == 0 ? this : null, 1 << i);
        inflateReset(zStream);
        return 0;
    }

    int inflateReset(ZStream zStream) {
        if (zStream == null || zStream.istate == null) {
            return Z_STREAM_ERROR;
        }
        zStream.total_out = 0L;
        zStream.total_in = 0L;
        zStream.msg = null;
        zStream.istate.mode = zStream.istate.nowrap != 0 ? 7 : 0;
        zStream.istate.blocks.reset(zStream, null);
        return 0;
    }

    int inflateSetDictionary(ZStream zStream, byte[] bArr, int i) {
        int i2;
        if (zStream == null || zStream.istate == null || zStream.istate.mode != 6) {
            return Z_STREAM_ERROR;
        }
        if (zStream._adler.adler32(1L, bArr, 0, i) != zStream.adler) {
            return Z_DATA_ERROR;
        }
        zStream.adler = zStream._adler.adler32(0L, null, 0, 0);
        if (i >= (1 << zStream.istate.wbits)) {
            int i3 = (1 << zStream.istate.wbits) - 1;
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        zStream.istate.blocks.set_dictionary(bArr, i2, i);
        zStream.istate.mode = 7;
        return 0;
    }

    int inflateSync(ZStream zStream) {
        if (zStream == null || zStream.istate == null) {
            return Z_STREAM_ERROR;
        }
        if (zStream.istate.mode != 13) {
            zStream.istate.mode = 13;
            zStream.istate.marker = 0;
        }
        int i = zStream.avail_in;
        if (i == 0) {
            return Z_BUF_ERROR;
        }
        int i2 = zStream.next_in_index;
        int i3 = zStream.istate.marker;
        while (i != 0 && i3 < 4) {
            if (zStream.next_in[i2] == mark[i3]) {
                i3++;
            } else {
                i3 = zStream.next_in[i2] != 0 ? 0 : 4 - i3;
            }
            i2++;
            i--;
        }
        zStream.total_in += (long) (i2 - zStream.next_in_index);
        zStream.next_in_index = i2;
        zStream.avail_in = i;
        zStream.istate.marker = i3;
        if (i3 != 4) {
            return Z_DATA_ERROR;
        }
        long j = zStream.total_in;
        long j2 = zStream.total_out;
        inflateReset(zStream);
        zStream.total_in = j;
        zStream.total_out = j2;
        zStream.istate.mode = 7;
        return 0;
    }

    int inflateSyncPoint(ZStream zStream) {
        return (zStream == null || zStream.istate == null || zStream.istate.blocks == null) ? Z_STREAM_ERROR : zStream.istate.blocks.sync_point();
    }
}
