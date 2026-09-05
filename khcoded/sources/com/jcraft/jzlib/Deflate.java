package com.jcraft.jzlib;

import com.mascotcapsule.eruption.docomostar.Appearance;
import p000.GameStatus;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Deflate {
    private static final int BL_CODES = 19;
    private static final int BUSY_STATE = 113;
    private static final int BlockDone = 1;
    private static final int Buf_size = 16;
    private static final int DEF_MEM_LEVEL = 8;
    private static final int DYN_TREES = 2;
    private static final int D_CODES = 30;
    private static final int END_BLOCK = 256;
    private static final int FAST = 1;
    private static final int FINISH_STATE = 666;
    private static final int FinishDone = 3;
    private static final int FinishStarted = 2;
    private static final int HEAP_SIZE = 573;
    private static final int INIT_STATE = 42;
    private static final int LENGTH_CODES = 29;
    private static final int LITERALS = 256;
    private static final int L_CODES = 286;
    private static final int MAX_BITS = 15;
    private static final int MAX_MATCH = 258;
    private static final int MAX_MEM_LEVEL = 9;
    private static final int MAX_WBITS = 15;
    private static final int MIN_LOOKAHEAD = 262;
    private static final int MIN_MATCH = 3;
    private static final int NeedMore = 0;
    private static final int PRESET_DICT = 32;
    private static final int REPZ_11_138 = 18;
    private static final int REPZ_3_10 = 17;
    private static final int REP_3_6 = 16;
    private static final int SLOW = 2;
    private static final int STATIC_TREES = 1;
    private static final int STORED = 0;
    private static final int STORED_BLOCK = 0;
    private static final int Z_ASCII = 1;
    private static final int Z_BINARY = 0;
    private static final int Z_BUF_ERROR = -5;
    private static final int Z_DATA_ERROR = -3;
    private static final int Z_DEFAULT_COMPRESSION = -1;
    private static final int Z_DEFAULT_STRATEGY = 0;
    private static final int Z_DEFLATED = 8;
    private static final int Z_ERRNO = -1;
    private static final int Z_FILTERED = 1;
    private static final int Z_FINISH = 4;
    private static final int Z_FULL_FLUSH = 3;
    private static final int Z_HUFFMAN_ONLY = 2;
    private static final int Z_MEM_ERROR = -4;
    private static final int Z_NEED_DICT = 2;
    private static final int Z_NO_FLUSH = 0;
    private static final int Z_OK = 0;
    private static final int Z_PARTIAL_FLUSH = 1;
    private static final int Z_STREAM_END = 1;
    private static final int Z_STREAM_ERROR = -2;
    private static final int Z_SYNC_FLUSH = 2;
    private static final int Z_UNKNOWN = 2;
    private static final int Z_VERSION_ERROR = -6;
    private static final Config[] config_table = new Config[10];
    private static final String[] z_errmsg;
    short bi_buf;
    int bi_valid;
    int block_start;
    int d_buf;
    byte data_type;
    int good_match;
    int hash_bits;
    int hash_mask;
    int hash_shift;
    int hash_size;
    short[] head;
    int heap_len;
    int heap_max;
    int ins_h;
    int l_buf;
    int last_eob_len;
    int last_flush;
    int last_lit;
    int level;
    int lit_bufsize;
    int lookahead;
    int match_available;
    int match_length;
    int match_start;
    int matches;
    int max_chain_length;
    int max_lazy_match;
    byte method;
    int nice_match;
    int noheader;
    int opt_len;
    int pending;
    byte[] pending_buf;
    int pending_buf_size;
    int pending_out;
    short[] prev;
    int prev_length;
    int prev_match;
    int static_len;
    int status;
    int strategy;
    ZStream strm;
    int strstart;
    int w_bits;
    int w_mask;
    int w_size;
    byte[] window;
    int window_size;
    Tree l_desc = new Tree();
    Tree d_desc = new Tree();
    Tree bl_desc = new Tree();
    short[] bl_count = new short[16];
    int[] heap = new int[HEAP_SIZE];
    byte[] depth = new byte[HEAP_SIZE];
    short[] dyn_ltree = new short[1146];
    short[] dyn_dtree = new short[122];
    short[] bl_tree = new short[78];

    static class Config {
        int func;
        int good_length;
        int max_chain;
        int max_lazy;
        int nice_length;

        Config(int i, int i2, int i3, int i4, int i5) {
            this.good_length = i;
            this.max_lazy = i2;
            this.nice_length = i3;
            this.max_chain = i4;
            this.func = i5;
        }
    }

    static {
        config_table[0] = new Config(0, 0, 0, 0, 0);
        config_table[1] = new Config(4, 4, 8, 4, 1);
        config_table[2] = new Config(4, 5, 16, 8, 1);
        config_table[3] = new Config(4, 6, 32, 32, 1);
        config_table[4] = new Config(4, 4, 16, 16, 2);
        config_table[5] = new Config(8, 16, 32, 32, 2);
        config_table[6] = new Config(8, 16, 128, 128, 2);
        config_table[7] = new Config(8, 32, 128, Appearance.LIGHTTWOSIDE, 2);
        config_table[8] = new Config(32, 128, MAX_MATCH, 1024, 2);
        config_table[9] = new Config(32, MAX_MATCH, MAX_MATCH, 4096, 2);
        z_errmsg = new String[]{"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};
    }

    Deflate() {
    }

    static boolean smaller(short[] sArr, int i, int i2, byte[] bArr) {
        short s = sArr[i * 2];
        short s2 = sArr[i2 * 2];
        return s < s2 || (s == s2 && bArr[i] <= bArr[i2]);
    }

    void _tr_align() {
        send_bits(2, 3);
        send_code(Appearance.LIGHTTWOSIDE, StaticTree.static_ltree);
        bi_flush();
        if (((this.last_eob_len + 1) + 10) - this.bi_valid < 9) {
            send_bits(2, 3);
            send_code(Appearance.LIGHTTWOSIDE, StaticTree.static_ltree);
            bi_flush();
        }
        this.last_eob_len = 7;
    }

    void _tr_flush_block(int i, int i2, boolean z) {
        int iBuild_bl_tree;
        int i3;
        int i4;
        if (this.level > 0) {
            if (this.data_type == 2) {
                set_data_type();
            }
            this.l_desc.build_tree(this);
            this.d_desc.build_tree(this);
            iBuild_bl_tree = build_bl_tree();
            i4 = ((this.opt_len + 3) + 7) >>> 3;
            int i5 = ((this.static_len + 3) + 7) >>> 3;
            if (i5 <= i4) {
                i3 = i5;
                i4 = i5;
            } else {
                i3 = i5;
            }
        } else {
            int i6 = i2 + 5;
            iBuild_bl_tree = 0;
            i3 = i6;
            i4 = i6;
        }
        if (i2 + 4 <= i4 && i != -1) {
            _tr_stored_block(i, i2, z);
        } else if (i3 == i4) {
            send_bits((z ? 1 : 0) + 2, 3);
            compress_block(StaticTree.static_ltree, StaticTree.static_dtree);
        } else {
            send_bits((z ? 1 : 0) + 4, 3);
            send_all_trees(this.l_desc.max_code + 1, this.d_desc.max_code + 1, iBuild_bl_tree + 1);
            compress_block(this.dyn_ltree, this.dyn_dtree);
        }
        init_block();
        if (z) {
            bi_windup();
        }
    }

    void _tr_stored_block(int i, int i2, boolean z) {
        send_bits((z ? 1 : 0) + 0, 3);
        copy_block(i, i2, true);
    }

    boolean _tr_tally(int i, int i2) {
        this.pending_buf[this.d_buf + (this.last_lit * 2)] = (byte) (i >>> 8);
        this.pending_buf[this.d_buf + (this.last_lit * 2) + 1] = (byte) i;
        this.pending_buf[this.l_buf + this.last_lit] = (byte) i2;
        this.last_lit++;
        if (i == 0) {
            short[] sArr = this.dyn_ltree;
            int i3 = i2 * 2;
            sArr[i3] = (short) (sArr[i3] + 1);
        } else {
            this.matches++;
            short[] sArr2 = this.dyn_ltree;
            int i4 = (Tree._length_code[i2] + 256 + 1) * 2;
            sArr2[i4] = (short) (sArr2[i4] + 1);
            short[] sArr3 = this.dyn_dtree;
            int iD_code = Tree.d_code(i - 1) * 2;
            sArr3[iD_code] = (short) (sArr3[iD_code] + 1);
        }
        if ((this.last_lit & 8191) == 0 && this.level > 2) {
            int i5 = this.last_lit * 8;
            int i6 = this.strstart - this.block_start;
            for (int i7 = 0; i7 < D_CODES; i7++) {
                i5 = (int) (((long) i5) + (((long) this.dyn_dtree[i7 * 2]) * (5 + ((long) Tree.extra_dbits[i7]))));
            }
            int i8 = i5 >>> 3;
            if (this.matches < this.last_lit / 2 && i8 < i6 / 2) {
                return true;
            }
        }
        return this.last_lit == this.lit_bufsize + (-1);
    }

    void bi_flush() {
        if (this.bi_valid == 16) {
            put_short(this.bi_buf);
            this.bi_buf = (short) 0;
            this.bi_valid = 0;
        } else if (this.bi_valid >= 8) {
            put_byte((byte) this.bi_buf);
            this.bi_buf = (short) (this.bi_buf >>> 8);
            this.bi_valid -= 8;
        }
    }

    void bi_windup() {
        if (this.bi_valid > 8) {
            put_short(this.bi_buf);
        } else if (this.bi_valid > 0) {
            put_byte((byte) this.bi_buf);
        }
        this.bi_buf = (short) 0;
        this.bi_valid = 0;
    }

    int build_bl_tree() {
        scan_tree(this.dyn_ltree, this.l_desc.max_code);
        scan_tree(this.dyn_dtree, this.d_desc.max_code);
        this.bl_desc.build_tree(this);
        int i = 18;
        while (i >= 3 && this.bl_tree[(Tree.bl_order[i] * 2) + 1] == 0) {
            i--;
        }
        this.opt_len += ((i + 1) * 3) + 5 + 5 + 4;
        return i;
    }

    void compress_block(short[] sArr, short[] sArr2) {
        int i = 0;
        if (this.last_lit != 0) {
            do {
                int i2 = ((this.pending_buf[this.d_buf + (i * 2)] << 8) & 65280) | (this.pending_buf[this.d_buf + (i * 2) + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
                int i3 = this.pending_buf[this.l_buf + i] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                i++;
                if (i2 == 0) {
                    send_code(i3, sArr);
                } else {
                    byte b = Tree._length_code[i3];
                    send_code(b + 256 + 1, sArr);
                    int i4 = Tree.extra_lbits[b];
                    if (i4 != 0) {
                        send_bits(i3 - Tree.base_length[b], i4);
                    }
                    int i5 = i2 - 1;
                    int iD_code = Tree.d_code(i5);
                    send_code(iD_code, sArr2);
                    int i6 = Tree.extra_dbits[iD_code];
                    if (i6 != 0) {
                        send_bits(i5 - Tree.base_dist[iD_code], i6);
                    }
                }
            } while (i < this.last_lit);
        }
        send_code(Appearance.LIGHTTWOSIDE, sArr);
        this.last_eob_len = sArr[513];
    }

    void copy_block(int i, int i2, boolean z) {
        bi_windup();
        this.last_eob_len = 8;
        if (z) {
            put_short((short) i2);
            put_short((short) (i2 ^ (-1)));
        }
        put_byte(this.window, i, i2);
    }

    int deflate(ZStream zStream, int i) {
        int iDeflate_slow;
        if (i > 4 || i < 0) {
            return Z_STREAM_ERROR;
        }
        if (zStream.next_out == null || ((zStream.next_in == null && zStream.avail_in != 0) || (this.status == FINISH_STATE && i != 4))) {
            zStream.msg = z_errmsg[4];
            return Z_STREAM_ERROR;
        }
        if (zStream.avail_out == 0) {
            zStream.msg = z_errmsg[7];
            return Z_BUF_ERROR;
        }
        this.strm = zStream;
        int i2 = this.last_flush;
        this.last_flush = i;
        if (this.status == INIT_STATE) {
            int i3 = (((this.w_bits - 8) << 4) + 8) << 8;
            int i4 = ((this.level - 1) & 255) >> 1;
            if (i4 > 3) {
                i4 = 3;
            }
            int i5 = (i4 << 6) | i3;
            if (this.strstart != 0) {
                i5 |= 32;
            }
            this.status = BUSY_STATE;
            putShortMSB(i5 + (31 - (i5 % 31)));
            if (this.strstart != 0) {
                putShortMSB((int) (zStream.adler >>> 16));
                putShortMSB((int) (zStream.adler & 65535));
            }
            zStream.adler = zStream._adler.adler32(0L, null, 0, 0);
        }
        if (this.pending != 0) {
            zStream.flush_pending();
            if (zStream.avail_out == 0) {
                this.last_flush = -1;
                return 0;
            }
        } else if (zStream.avail_in == 0 && i <= i2 && i != 4) {
            zStream.msg = z_errmsg[7];
            return Z_BUF_ERROR;
        }
        if (this.status == FINISH_STATE && zStream.avail_in != 0) {
            zStream.msg = z_errmsg[7];
            return Z_BUF_ERROR;
        }
        if (zStream.avail_in != 0 || this.lookahead != 0 || (i != 0 && this.status != FINISH_STATE)) {
            switch (config_table[this.level].func) {
                case 0:
                    iDeflate_slow = deflate_stored(i);
                    break;
                case 1:
                    iDeflate_slow = deflate_fast(i);
                    break;
                case 2:
                    iDeflate_slow = deflate_slow(i);
                    break;
                default:
                    iDeflate_slow = -1;
                    break;
            }
            if (iDeflate_slow == 2 || iDeflate_slow == 3) {
                this.status = FINISH_STATE;
            }
            if (iDeflate_slow == 0 || iDeflate_slow == 2) {
                if (zStream.avail_out != 0) {
                    return 0;
                }
                this.last_flush = -1;
                return 0;
            }
            if (iDeflate_slow == 1) {
                if (i == 1) {
                    _tr_align();
                } else {
                    _tr_stored_block(0, 0, false);
                    if (i == 3) {
                        for (int i6 = 0; i6 < this.hash_size; i6++) {
                            this.head[i6] = 0;
                        }
                    }
                }
                zStream.flush_pending();
                if (zStream.avail_out == 0) {
                    this.last_flush = -1;
                    return 0;
                }
            }
        }
        if (i != 4) {
            return 0;
        }
        if (this.noheader != 0) {
            return 1;
        }
        putShortMSB((int) (zStream.adler >>> 16));
        putShortMSB((int) (zStream.adler & 65535));
        zStream.flush_pending();
        this.noheader = -1;
        return this.pending == 0 ? 1 : 0;
    }

    int deflateEnd() {
        if (this.status != INIT_STATE && this.status != BUSY_STATE && this.status != FINISH_STATE) {
            return Z_STREAM_ERROR;
        }
        this.pending_buf = null;
        this.head = null;
        this.prev = null;
        this.window = null;
        if (this.status == BUSY_STATE) {
            return Z_DATA_ERROR;
        }
        return 0;
    }

    int deflateInit(ZStream zStream, int i) {
        return deflateInit(zStream, i, 15);
    }

    int deflateInit(ZStream zStream, int i, int i2) {
        return deflateInit2(zStream, i, 8, i2, 8, 0);
    }

    int deflateInit2(ZStream zStream, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        zStream.msg = null;
        if (i == -1) {
            i = 6;
        }
        if (i3 < 0) {
            i3 = -i3;
            i6 = 1;
        }
        if (i4 < 1 || i4 > 9 || i2 != 8 || i3 < 9 || i3 > 15 || i < 0 || i > 9 || i5 < 0 || i5 > 2) {
            return Z_STREAM_ERROR;
        }
        zStream.dstate = this;
        this.noheader = i6;
        this.w_bits = i3;
        this.w_size = 1 << this.w_bits;
        this.w_mask = this.w_size - 1;
        this.hash_bits = i4 + 7;
        this.hash_size = 1 << this.hash_bits;
        this.hash_mask = this.hash_size - 1;
        this.hash_shift = ((this.hash_bits + 3) - 1) / 3;
        this.window = new byte[this.w_size * 2];
        this.prev = new short[this.w_size];
        this.head = new short[this.hash_size];
        this.lit_bufsize = 1 << (i4 + 6);
        this.pending_buf = new byte[this.lit_bufsize * 4];
        this.pending_buf_size = this.lit_bufsize * 4;
        this.d_buf = this.lit_bufsize / 2;
        this.l_buf = this.lit_bufsize * 3;
        this.level = i;
        this.strategy = i5;
        this.method = (byte) i2;
        return deflateReset(zStream);
    }

    int deflateParams(ZStream zStream, int i, int i2) {
        int iDeflate = 0;
        if (i == -1) {
            i = 6;
        }
        if (i < 0 || i > 9 || i2 < 0 || i2 > 2) {
            return Z_STREAM_ERROR;
        }
        if (config_table[this.level].func != config_table[i].func && zStream.total_in != 0) {
            iDeflate = zStream.deflate(1);
        }
        if (this.level != i) {
            this.level = i;
            this.max_lazy_match = config_table[this.level].max_lazy;
            this.good_match = config_table[this.level].good_length;
            this.nice_match = config_table[this.level].nice_length;
            this.max_chain_length = config_table[this.level].max_chain;
        }
        this.strategy = i2;
        return iDeflate;
    }

    int deflateReset(ZStream zStream) {
        zStream.total_out = 0L;
        zStream.total_in = 0L;
        zStream.msg = null;
        zStream.data_type = 2;
        this.pending = 0;
        this.pending_out = 0;
        if (this.noheader < 0) {
            this.noheader = 0;
        }
        this.status = this.noheader != 0 ? BUSY_STATE : INIT_STATE;
        zStream.adler = zStream._adler.adler32(0L, null, 0, 0);
        this.last_flush = 0;
        tr_init();
        lm_init();
        return 0;
    }

    int deflateSetDictionary(ZStream zStream, byte[] bArr, int i) {
        int i2;
        if (bArr == null || this.status != INIT_STATE) {
            return Z_STREAM_ERROR;
        }
        zStream.adler = zStream._adler.adler32(zStream.adler, bArr, 0, i);
        if (i < 3) {
            return 0;
        }
        if (i > this.w_size - 262) {
            int i3 = this.w_size - 262;
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        System.arraycopy(bArr, i2, this.window, 0, i);
        this.strstart = i;
        this.block_start = i;
        this.ins_h = this.window[0] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
        this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) & this.hash_mask;
        for (int i4 = 0; i4 <= i + Z_DATA_ERROR; i4++) {
            this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[i4 + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) & this.hash_mask;
            this.prev[this.w_mask & i4] = this.head[this.ins_h];
            this.head[this.ins_h] = (short) i4;
        }
        return 0;
    }

    int deflate_fast(int i) {
        boolean z_tr_tally;
        int i2;
        int i3 = 0;
        while (true) {
            if (this.lookahead < MIN_LOOKAHEAD) {
                fill_window();
                if (this.lookahead < MIN_LOOKAHEAD && i == 0) {
                    return 0;
                }
                if (this.lookahead == 0) {
                    flush_block_only(i == 4);
                    if (this.strm.avail_out == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    return i == 4 ? 3 : 1;
                }
            }
            if (this.lookahead >= 3) {
                this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[this.strstart + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) & this.hash_mask;
                i3 = this.head[this.ins_h] & 65535;
                this.prev[this.strstart & this.w_mask] = this.head[this.ins_h];
                this.head[this.ins_h] = (short) this.strstart;
            }
            if (i3 != 0 && ((this.strstart - i3) & 65535) <= this.w_size - 262 && this.strategy != 2) {
                this.match_length = longest_match(i3);
            }
            if (this.match_length >= 3) {
                z_tr_tally = _tr_tally(this.strstart - this.match_start, this.match_length + Z_DATA_ERROR);
                this.lookahead -= this.match_length;
                if (this.match_length > this.max_lazy_match || this.lookahead < 3) {
                    this.strstart += this.match_length;
                    this.match_length = 0;
                    this.ins_h = this.window[this.strstart] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                    this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[this.strstart + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) & this.hash_mask;
                } else {
                    this.match_length--;
                    do {
                        this.strstart++;
                        this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[this.strstart + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) & this.hash_mask;
                        i3 = this.head[this.ins_h] & 65535;
                        this.prev[this.strstart & this.w_mask] = this.head[this.ins_h];
                        this.head[this.ins_h] = (short) this.strstart;
                        i2 = this.match_length - 1;
                        this.match_length = i2;
                    } while (i2 != 0);
                    this.strstart++;
                }
            } else {
                z_tr_tally = _tr_tally(0, this.window[this.strstart] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
                this.lookahead--;
                this.strstart++;
            }
            if (z_tr_tally) {
                flush_block_only(false);
                if (this.strm.avail_out == 0) {
                    return 0;
                }
            }
        }
    }

    int deflate_slow(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            if (this.lookahead < MIN_LOOKAHEAD) {
                fill_window();
                if (this.lookahead < MIN_LOOKAHEAD && i == 0) {
                    return 0;
                }
                if (this.lookahead == 0) {
                    if (this.match_available != 0) {
                        _tr_tally(0, this.window[this.strstart - 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
                        this.match_available = 0;
                    }
                    flush_block_only(i == 4);
                    if (this.strm.avail_out == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    return i == 4 ? 3 : 1;
                }
            }
            if (this.lookahead >= 3) {
                this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[this.strstart + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) & this.hash_mask;
                i3 = this.head[this.ins_h] & 65535;
                this.prev[this.strstart & this.w_mask] = this.head[this.ins_h];
                this.head[this.ins_h] = (short) this.strstart;
            }
            this.prev_length = this.match_length;
            this.prev_match = this.match_start;
            this.match_length = 2;
            if (i3 != 0 && this.prev_length < this.max_lazy_match && ((this.strstart - i3) & 65535) <= this.w_size - 262) {
                if (this.strategy != 2) {
                    this.match_length = longest_match(i3);
                }
                if (this.match_length <= 5 && (this.strategy == 1 || (this.match_length == 3 && this.strstart - this.match_start > 4096))) {
                    this.match_length = 2;
                }
            }
            if (this.prev_length >= 3 && this.match_length <= this.prev_length) {
                int i4 = this.strstart + this.lookahead + Z_DATA_ERROR;
                boolean z_tr_tally = _tr_tally((this.strstart - 1) - this.prev_match, this.prev_length + Z_DATA_ERROR);
                this.lookahead -= this.prev_length - 1;
                this.prev_length += Z_STREAM_ERROR;
                do {
                    int i5 = this.strstart + 1;
                    this.strstart = i5;
                    if (i5 <= i4) {
                        this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[this.strstart + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) & this.hash_mask;
                        i3 = this.head[this.ins_h] & 65535;
                        this.prev[this.strstart & this.w_mask] = this.head[this.ins_h];
                        this.head[this.ins_h] = (short) this.strstart;
                    }
                    i2 = this.prev_length - 1;
                    this.prev_length = i2;
                } while (i2 != 0);
                this.match_available = 0;
                this.match_length = 2;
                this.strstart++;
                if (z_tr_tally) {
                    flush_block_only(false);
                    if (this.strm.avail_out == 0) {
                        return 0;
                    }
                } else {
                    continue;
                }
            } else if (this.match_available != 0) {
                if (_tr_tally(0, this.window[this.strstart - 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) {
                    flush_block_only(false);
                }
                this.strstart++;
                this.lookahead--;
                if (this.strm.avail_out == 0) {
                    return 0;
                }
            } else {
                this.match_available = 1;
                this.strstart++;
                this.lookahead--;
            }
        }
    }

    int deflate_stored(int i) {
        int i2 = 65535 > this.pending_buf_size + Z_BUF_ERROR ? this.pending_buf_size + Z_BUF_ERROR : 65535;
        while (true) {
            if (this.lookahead <= 1) {
                fill_window();
                if (this.lookahead == 0 && i == 0) {
                    return 0;
                }
                if (this.lookahead == 0) {
                    flush_block_only(i == 4);
                    if (this.strm.avail_out == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    return i == 4 ? 3 : 1;
                }
            }
            this.strstart += this.lookahead;
            this.lookahead = 0;
            int i3 = this.block_start + i2;
            if (this.strstart == 0 || this.strstart >= i3) {
                this.lookahead = this.strstart - i3;
                this.strstart = i3;
                flush_block_only(false);
                if (this.strm.avail_out == 0) {
                    return 0;
                }
            }
            if (this.strstart - this.block_start >= this.w_size - 262) {
                flush_block_only(false);
                if (this.strm.avail_out == 0) {
                    return 0;
                }
            }
        }
    }

    void fill_window() {
        int i;
        do {
            int i2 = (this.window_size - this.lookahead) - this.strstart;
            if (i2 == 0 && this.strstart == 0 && this.lookahead == 0) {
                i = this.w_size;
            } else if (i2 == -1) {
                i = i2 - 1;
            } else if (this.strstart >= (this.w_size + this.w_size) - 262) {
                System.arraycopy(this.window, this.w_size, this.window, 0, this.w_size);
                this.match_start -= this.w_size;
                this.strstart -= this.w_size;
                this.block_start -= this.w_size;
                int i3 = this.hash_size;
                int i4 = i3;
                do {
                    int i5 = i3;
                    i4--;
                    int i6 = this.head[i4] & 65535;
                    this.head[i4] = i6 >= this.w_size ? (short) (i6 - this.w_size) : (short) 0;
                    i3 = i5 - 1;
                } while (i3 != 0);
                int i7 = this.w_size;
                int i8 = i7;
                do {
                    int i9 = i7;
                    i8--;
                    int i10 = this.prev[i8] & 65535;
                    this.prev[i8] = i10 >= this.w_size ? (short) (i10 - this.w_size) : (short) 0;
                    i7 = i9 - 1;
                } while (i7 != 0);
                i = this.w_size + i2;
            } else {
                i = i2;
            }
            if (this.strm.avail_in == 0) {
                return;
            }
            this.lookahead = this.strm.read_buf(this.window, this.strstart + this.lookahead, i) + this.lookahead;
            if (this.lookahead >= 3) {
                this.ins_h = this.window[this.strstart] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                this.ins_h = ((this.ins_h << this.hash_shift) ^ (this.window[this.strstart + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET)) & this.hash_mask;
            }
            if (this.lookahead >= MIN_LOOKAHEAD) {
                return;
            }
        } while (this.strm.avail_in != 0);
    }

    void flush_block_only(boolean z) {
        _tr_flush_block(this.block_start >= 0 ? this.block_start : -1, this.strstart - this.block_start, z);
        this.block_start = this.strstart;
        this.strm.flush_pending();
    }

    void init_block() {
        for (int i = 0; i < L_CODES; i++) {
            this.dyn_ltree[i * 2] = 0;
        }
        for (int i2 = 0; i2 < D_CODES; i2++) {
            this.dyn_dtree[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.bl_tree[i3 * 2] = 0;
        }
        this.dyn_ltree[512] = 1;
        this.static_len = 0;
        this.opt_len = 0;
        this.matches = 0;
        this.last_lit = 0;
    }

    void lm_init() {
        this.window_size = this.w_size * 2;
        this.head[this.hash_size - 1] = 0;
        for (int i = 0; i < this.hash_size - 1; i++) {
            this.head[i] = 0;
        }
        this.max_lazy_match = config_table[this.level].max_lazy;
        this.good_match = config_table[this.level].good_length;
        this.nice_match = config_table[this.level].nice_length;
        this.max_chain_length = config_table[this.level].max_chain;
        this.strstart = 0;
        this.block_start = 0;
        this.lookahead = 0;
        this.prev_length = 2;
        this.match_length = 2;
        this.match_available = 0;
        this.ins_h = 0;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x011b A[PHI: r6
  0x011b: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v8 int) binds: [B:12:0x0040, B:14:0x004a, B:16:0x0054, B:47:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    int longest_match(int i) {
        byte b;
        int i2 = this.max_chain_length;
        int i3 = this.strstart;
        int i4 = this.prev_length;
        int i5 = this.strstart > this.w_size + (-262) ? this.strstart - (this.w_size - 262) : 0;
        int i6 = this.nice_match;
        int i7 = this.w_mask;
        int i8 = this.strstart + MAX_MATCH;
        byte b2 = this.window[(i3 + i4) - 1];
        byte b3 = this.window[i3 + i4];
        if (this.prev_length >= this.good_match) {
            i2 >>= 2;
        }
        if (i6 > this.lookahead) {
            i6 = this.lookahead;
        }
        while (true) {
            if (this.window[i + i4] == b3 && this.window[(i + i4) - 1] == b2 && this.window[i] == this.window[i3]) {
                int i9 = i + 1;
                if (this.window[i9] != this.window[i3 + 1]) {
                    b = b3;
                } else {
                    int i10 = i3 + 2;
                    int i11 = i9 + 1;
                    do {
                        i10++;
                        int i12 = i11 + 1;
                        if (this.window[i10] != this.window[i12]) {
                            break;
                        }
                        i10++;
                        int i13 = i12 + 1;
                        if (this.window[i10] != this.window[i13]) {
                            break;
                        }
                        i10++;
                        int i14 = i13 + 1;
                        if (this.window[i10] != this.window[i14]) {
                            break;
                        }
                        i10++;
                        int i15 = i14 + 1;
                        if (this.window[i10] != this.window[i15]) {
                            break;
                        }
                        i10++;
                        int i16 = i15 + 1;
                        if (this.window[i10] != this.window[i16]) {
                            break;
                        }
                        i10++;
                        int i17 = i16 + 1;
                        if (this.window[i10] != this.window[i17]) {
                            break;
                        }
                        i10++;
                        int i18 = i17 + 1;
                        if (this.window[i10] != this.window[i18]) {
                            break;
                        }
                        i10++;
                        i11 = i18 + 1;
                        if (this.window[i10] != this.window[i11]) {
                            break;
                        }
                    } while (i10 < i8);
                    int i19 = 258 - (i8 - i10);
                    i3 = i8 - 258;
                    if (i19 > i4) {
                        this.match_start = i;
                        if (i19 >= i6) {
                            i4 = i19;
                            break;
                        }
                        b2 = this.window[(i3 + i19) - 1];
                        b = this.window[i3 + i19];
                        i4 = i19;
                    } else {
                        b = b3;
                    }
                }
                i = this.prev[i & i7] & 65535;
                if (i <= i5) {
                    break;
                }
                break;
                break;
            }
            b = b3;
            i = this.prev[i & i7] & 65535;
            if (i <= i5 || (i2 = i2 - 1) == 0) {
                break;
            }
            b3 = b;
        }
        return i4 <= this.lookahead ? i4 : this.lookahead;
    }

    void pqdownheap(short[] sArr, int i) {
        int i2 = this.heap[i];
        int i3 = i << 1;
        while (i3 <= this.heap_len) {
            int i4 = (i3 >= this.heap_len || !smaller(sArr, this.heap[i3 + 1], this.heap[i3], this.depth)) ? i3 : i3 + 1;
            if (smaller(sArr, i2, this.heap[i4], this.depth)) {
                break;
            }
            this.heap[i] = this.heap[i4];
            i3 = i4 << 1;
            i = i4;
        }
        this.heap[i] = i2;
    }

    final void putShortMSB(int i) {
        put_byte((byte) (i >> 8));
        put_byte((byte) i);
    }

    final void put_byte(byte b) {
        byte[] bArr = this.pending_buf;
        int i = this.pending;
        this.pending = i + 1;
        bArr[i] = b;
    }

    final void put_byte(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.pending_buf, this.pending, i2);
        this.pending += i2;
    }

    final void put_short(int i) {
        put_byte((byte) i);
        put_byte((byte) (i >>> 8));
    }

    void scan_tree(short[] sArr, int i) {
        int i2;
        int i3;
        short s = -1;
        short s2 = sArr[1];
        if (s2 == 0) {
            i3 = 138;
            i2 = 3;
        } else {
            i2 = 4;
            i3 = 7;
        }
        sArr[((i + 1) * 2) + 1] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i5 <= i) {
            short s3 = sArr[((i5 + 1) * 2) + 1];
            i4++;
            if (i4 >= i3 || s2 != s3) {
                if (i4 < i2) {
                    short[] sArr2 = this.bl_tree;
                    int i6 = s2 * 2;
                    sArr2[i6] = (short) (i4 + sArr2[i6]);
                } else if (s2 != 0) {
                    if (s2 != s) {
                        short[] sArr3 = this.bl_tree;
                        int i7 = s2 * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.bl_tree;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i4 <= 10) {
                    short[] sArr5 = this.bl_tree;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.bl_tree;
                    sArr6[36] = (short) (sArr6[36] + 1);
                }
                if (s3 == 0) {
                    i3 = 138;
                    i2 = 3;
                    i4 = 0;
                    s = s2;
                } else if (s2 == s3) {
                    i3 = 6;
                    i2 = 3;
                    i4 = 0;
                    s = s2;
                } else {
                    i2 = 4;
                    i3 = 7;
                    i4 = 0;
                    s = s2;
                }
            }
            i5++;
            s2 = s3;
        }
    }

    void send_all_trees(int i, int i2, int i3) {
        send_bits(i - 257, 5);
        send_bits(i2 - 1, 5);
        send_bits(i3 + Z_MEM_ERROR, 4);
        for (int i4 = 0; i4 < i3; i4++) {
            send_bits(this.bl_tree[(Tree.bl_order[i4] * 2) + 1], 3);
        }
        send_tree(this.dyn_ltree, i - 1);
        send_tree(this.dyn_dtree, i2 - 1);
    }

    void send_bits(int i, int i2) {
        if (this.bi_valid <= 16 - i2) {
            this.bi_buf = (short) (this.bi_buf | ((i << this.bi_valid) & 65535));
            this.bi_valid += i2;
        } else {
            this.bi_buf = (short) (this.bi_buf | ((i << this.bi_valid) & 65535));
            put_short(this.bi_buf);
            this.bi_buf = (short) (i >>> (16 - this.bi_valid));
            this.bi_valid += i2 - 16;
        }
    }

    final void send_code(int i, short[] sArr) {
        int i2 = i * 2;
        send_bits(sArr[i2] & 65535, sArr[i2 + 1] & 65535);
    }

    void send_tree(short[] sArr, int i) {
        int i2;
        short s = -1;
        short s2 = sArr[1];
        int i3 = 0;
        int i4 = 7;
        int i5 = 4;
        if (s2 == 0) {
            i4 = 138;
            i5 = 3;
        }
        int i6 = i5;
        int i7 = i4;
        for (int i8 = 0; i8 <= i; i8++) {
            short s3 = sArr[((i8 + 1) * 2) + 1];
            int i9 = i3 + 1;
            if (i9 >= i7 || s2 != s3) {
                if (i9 < i6) {
                    do {
                        send_code(s2, this.bl_tree);
                        i9--;
                    } while (i9 != 0);
                } else if (s2 != 0) {
                    if (s2 != s) {
                        send_code(s2, this.bl_tree);
                        i9--;
                    }
                    send_code(16, this.bl_tree);
                    send_bits(i9 + Z_DATA_ERROR, 2);
                } else if (i9 <= 10) {
                    send_code(17, this.bl_tree);
                    send_bits(i9 + Z_DATA_ERROR, 3);
                } else {
                    send_code(18, this.bl_tree);
                    send_bits(i9 - 11, 7);
                }
                i3 = 0;
                if (s3 == 0) {
                    i2 = 3;
                    i7 = 138;
                    s = s2;
                } else if (s2 == s3) {
                    i2 = 3;
                    i7 = 6;
                    s = s2;
                } else {
                    i2 = 4;
                    i7 = 7;
                    s = s2;
                }
            } else {
                i2 = i6;
                i3 = i9;
            }
            i6 = i2;
            s2 = s3;
        }
    }

    void set_data_type() {
        int i = 0;
        int i2 = 0;
        while (i2 < 7) {
            i += this.dyn_ltree[i2 * 2];
            i2++;
        }
        int i3 = 0;
        while (i2 < 128) {
            i3 += this.dyn_ltree[i2 * 2];
            i2++;
        }
        while (i2 < 256) {
            i += this.dyn_ltree[i2 * 2];
            i2++;
        }
        this.data_type = (byte) (i <= (i3 >>> 2) ? 1 : 0);
    }

    void tr_init() {
        this.l_desc.dyn_tree = this.dyn_ltree;
        this.l_desc.stat_desc = StaticTree.static_l_desc;
        this.d_desc.dyn_tree = this.dyn_dtree;
        this.d_desc.stat_desc = StaticTree.static_d_desc;
        this.bl_desc.dyn_tree = this.bl_tree;
        this.bl_desc.stat_desc = StaticTree.static_bl_desc;
        this.bi_buf = (short) 0;
        this.bi_valid = 0;
        this.last_eob_len = 8;
        init_block();
    }
}
