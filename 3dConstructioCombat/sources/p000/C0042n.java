package p000;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0042n {

    /* JADX INFO: renamed from: a */
    public C0049u[] f487a;

    /* JADX INFO: renamed from: b */
    public C0025ay f488b;

    /* JADX INFO: renamed from: c */
    public int f489c;

    /* JADX INFO: renamed from: d */
    public int f490d;

    /* JADX INFO: renamed from: e */
    public int f491e;

    /* JADX INFO: renamed from: a */
    private void m306a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        short s;
        short s2;
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
        short s3;
        int i26;
        C0049u c0049u = this.f487a[i];
        if (c0049u.f532e != -1) {
            if (this.f490d == -65536 || i2 < this.f490d) {
                this.f490d = i2;
                this.f488b.f249a = i10;
                this.f488b.f250b = i11;
                this.f488b.f251c = i12;
                return;
            }
            return;
        }
        int i27 = ((int) ((((long) c0049u.f528a.f251c) * ((long) (i9 - i6))) >> 16)) + ((int) ((((long) c0049u.f528a.f249a) * ((long) (i7 - i4))) >> 16)) + ((int) ((((long) c0049u.f528a.f250b) * ((long) (i8 - i5))) >> 16));
        int i28 = ((((int) ((((long) i4) * ((long) c0049u.f528a.f249a)) >> 16)) + ((int) ((((long) i5) * ((long) c0049u.f528a.f250b)) >> 16))) + ((int) ((((long) i6) * ((long) c0049u.f528a.f251c)) >> 16))) - c0049u.f529b;
        int i29 = ((((int) ((((long) i7) * ((long) c0049u.f528a.f249a)) >> 16)) + ((int) ((((long) i8) * ((long) c0049u.f528a.f250b)) >> 16))) + ((int) ((((long) i9) * ((long) c0049u.f528a.f251c)) >> 16))) - c0049u.f529b;
        if (i28 < this.f491e || i29 < this.f491e) {
            if (i28 >= (-this.f491e) || i29 >= (-this.f491e)) {
                if (i28 < i29) {
                    s = c0049u.f531d;
                    s2 = c0049u.f530c;
                    int i30 = (int) ((281474976710656L / ((long) (i28 - i29))) >> 16);
                    i13 = (int) ((((long) ((i28 - this.f491e) + this.f489c)) * ((long) i30)) >> 16);
                    i14 = (int) ((((long) ((i28 + this.f491e) + this.f489c)) * ((long) i30)) >> 16);
                } else if (i29 < i28) {
                    s = c0049u.f530c;
                    s2 = c0049u.f531d;
                    int i31 = (int) ((281474976710656L / ((long) (i28 - i29))) >> 16);
                    i13 = (int) ((((long) ((this.f491e + i28) + this.f489c)) * ((long) i31)) >> 16);
                    i14 = (int) ((((long) ((i28 - this.f491e) - this.f489c)) * ((long) i31)) >> 16);
                } else {
                    s = c0049u.f530c;
                    s2 = c0049u.f531d;
                    i13 = 65536;
                    i14 = 0;
                }
                if (i2 == 0 || i2 == 65536) {
                    if (i27 > 0) {
                        i15 = -c0049u.f528a.f249a;
                        i16 = -c0049u.f528a.f250b;
                        i17 = -c0049u.f528a.f251c;
                    } else {
                        i15 = c0049u.f528a.f249a;
                        i16 = c0049u.f528a.f250b;
                        i17 = c0049u.f528a.f251c;
                    }
                    i18 = i17;
                    i19 = i16;
                    i20 = i15;
                } else {
                    i18 = i12;
                    i19 = i11;
                    i20 = i10;
                }
                if (s >= 0) {
                    if (i13 < 0) {
                        i26 = 0;
                    } else {
                        i26 = i13 > 65536 ? 65536 : i13;
                    }
                    m306a(s, i2, i2 + ((int) ((((long) (i3 - i2)) * ((long) i26)) >> 16)), i4, i5, i6, i4 + ((int) ((((long) i26) * ((long) (i7 - i4))) >> 16)), i5 + ((int) ((((long) i26) * ((long) (i8 - i5))) >> 16)), i6 + ((int) ((((long) i26) * ((long) (i9 - i6))) >> 16)), i20, i19, i18);
                }
                if (s2 < 0) {
                    return;
                }
                if (i14 < 0) {
                    i21 = 0;
                } else {
                    i21 = i14 > 65536 ? 65536 : i14;
                }
                i22 = i6 + ((int) ((((long) i21) * ((long) (i9 - i6))) >> 16));
                i23 = i5 + ((int) ((((long) i21) * ((long) (i8 - i5))) >> 16));
                i24 = i4 + ((int) ((((long) i21) * ((long) (i7 - i4))) >> 16));
                i25 = i2 + ((int) ((((long) (i3 - i2)) * ((long) i21)) >> 16));
                s3 = s2;
            } else {
                if (c0049u.f531d < 0) {
                    return;
                }
                s3 = c0049u.f531d;
                i22 = i6;
                i23 = i5;
                i24 = i4;
                i25 = i2;
                i18 = i12;
                i19 = i11;
                i20 = i10;
            }
        } else {
            if (c0049u.f530c < 0) {
                return;
            }
            s3 = c0049u.f530c;
            i22 = i6;
            i23 = i5;
            i24 = i4;
            i25 = i2;
            i18 = i12;
            i19 = i11;
            i20 = i10;
        }
        m306a(s3, i25, i3, i24, i23, i22, i7, i8, i9, i20, i19, i18);
    }

    /* JADX INFO: renamed from: a */
    public final int m307a(C0025ay c0025ay, C0025ay c0025ay2, int i, C0025ay c0025ay3) {
        this.f491e = i;
        this.f490d = -65536;
        this.f488b = c0025ay3;
        m306a(0, 0, 65536, c0025ay.f249a, c0025ay.f250b, c0025ay.f251c, c0025ay2.f249a, c0025ay2.f250b, c0025ay2.f251c, 0, 0, 0);
        this.f488b = null;
        return this.f490d;
    }
}
