package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.InputStream;
import p000.GameStatus;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ao */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0016ao extends InputStream {

    /* JADX INFO: renamed from: a */
    private C0120s[] f652a;

    /* JADX INFO: renamed from: b */
    private short[] f653b;

    /* JADX INFO: renamed from: c */
    private boolean f654c;

    /* JADX INFO: renamed from: d */
    private boolean f655d;

    /* JADX INFO: renamed from: e */
    private int f656e;

    /* JADX INFO: renamed from: f */
    private int f657f;

    /* JADX INFO: renamed from: g */
    private int f658g;

    /* JADX INFO: renamed from: h */
    private int f659h;

    /* JADX INFO: renamed from: i */
    private int f660i;

    /* JADX INFO: renamed from: j */
    private int f661j;

    /* JADX INFO: renamed from: k */
    private int f662k;

    /* JADX INFO: renamed from: l */
    private int f663l;

    /* JADX INFO: renamed from: m */
    private int f664m;

    /* JADX INFO: renamed from: n */
    private int f665n;

    /* JADX INFO: renamed from: o */
    private int f666o;

    /* JADX INFO: renamed from: p */
    private int f667p;

    /* JADX INFO: renamed from: q */
    private int f668q = 0;

    /* JADX INFO: renamed from: r */
    private int f669r;

    /* JADX INFO: renamed from: s */
    private byte[] f670s;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    C0016ao(byte[] bArr) throws IllegalStateException {
        this.f670s = bArr;
        this.f669r = this.f670s.length;
        if (this.f669r > 1) {
            this.f656e = this.f670s[this.f668q] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
            this.f668q++;
            if (this.f656e < 2 || this.f656e >= 12) {
                throw new IllegalStateException("Input Code Bits ");
            }
        }
        this.f653b = new short[5003];
        this.f652a = new C0120s[5003];
        for (int i = 0; i < 5003; i++) {
            this.f652a[i] = new C0120s(this);
        }
        this.f665n = 0;
        this.f666o = 0;
        this.f667p = 0;
        this.f654c = false;
        this.f655d = true;
        this.f658g = 1 << this.f656e;
        this.f659h = this.f658g + 1;
        m403a();
    }

    /* JADX INFO: renamed from: a */
    private final int m402a(int i, int i2) {
        int i3 = (1 << this.f656e) - 1;
        while (i2 > i3) {
            this.f653b[i] = (short) this.f652a[i2].f1032b;
            i++;
            i2 = this.f652a[i2].f1031a;
        }
        this.f653b[i] = (short) i2;
        return i + 1;
    }

    /* JADX INFO: renamed from: a */
    private final void m403a() {
        this.f661j = this.f658g << 1;
        this.f664m = 0;
        this.f657f = this.f656e + 1;
        this.f660i = this.f658g + 2;
    }

    /* JADX INFO: renamed from: b */
    private final int m404b() {
        if (this.f654c) {
            return this.f659h;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f657f; i2++) {
            if (this.f667p <= this.f666o) {
                this.f666o = 0;
                if (this.f668q + 1 > this.f669r) {
                    throw new IndexOutOfBoundsException();
                }
                this.f667p = this.f670s[this.f668q] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                this.f668q++;
                if (this.f667p == 0) {
                    return 0;
                }
            }
            i |= ((this.f670s[this.f668q] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) & (1 << this.f665n)) != 0 ? 1 << i2 : 0;
            this.f665n++;
            if (this.f665n > 7) {
                this.f665n = 0;
                this.f668q++;
                this.f666o++;
            }
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read() {
        int iM404b;
        int iM404b2;
        if (this.f655d) {
            iM404b = this.f658g;
            this.f655d = false;
        } else {
            if (this.f664m != 0) {
                this.f664m--;
                return this.f653b[this.f664m] & 255;
            }
            iM404b = m404b();
        }
        if (iM404b == this.f658g) {
            m403a();
            do {
                iM404b2 = m404b();
            } while (iM404b2 == this.f658g);
            this.f662k = iM404b2;
            this.f663l = iM404b2;
            return iM404b2;
        }
        if (iM404b == this.f659h) {
            if (this.f665n > 0) {
                if (this.f668q + 1 > this.f669r) {
                    throw new IndexOutOfBoundsException();
                }
                this.f668q++;
                this.f666o++;
            }
            if (this.f667p > this.f666o) {
                if ((this.f668q + this.f667p) - this.f666o > this.f669r) {
                    throw new IndexOutOfBoundsException();
                }
                this.f668q += this.f667p - this.f666o;
            }
            this.f654c = true;
            return 0;
        }
        if (this.f660i <= iM404b) {
            this.f653b[0] = (short) this.f663l;
            this.f664m = m402a(1, this.f662k);
        } else {
            this.f664m = m402a(0, iM404b);
        }
        this.f663l = this.f653b[this.f664m - 1] & 255;
        if (this.f660i < 5003) {
            this.f652a[this.f660i].f1031a = this.f662k;
            this.f652a[this.f660i].f1032b = this.f663l;
            this.f660i++;
            if (this.f660i >= this.f661j && this.f657f < 12) {
                this.f657f++;
                this.f661j <<= 1;
            }
        }
        this.f662k = iM404b;
        this.f664m--;
        return this.f653b[this.f664m] & 255;
    }
}
