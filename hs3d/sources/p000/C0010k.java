package p000;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
public final class C0010k {

    /* JADX INFO: renamed from: a */
    float f437a;

    /* JADX INFO: renamed from: a */
    private int f438a;

    /* JADX INFO: renamed from: b */
    float f439b;

    /* JADX INFO: renamed from: b */
    private int f440b;

    /* JADX INFO: renamed from: c */
    float f441c;

    /* JADX INFO: renamed from: c */
    private int f442c;

    /* JADX INFO: renamed from: d */
    private int f443d;

    /* JADX INFO: renamed from: e */
    private int f444e;

    /* JADX INFO: renamed from: f */
    private int f445f;

    /* JADX INFO: renamed from: g */
    private int f446g;

    /* JADX INFO: renamed from: h */
    private int f447h;

    /* JADX INFO: renamed from: i */
    private int f448i;

    /* JADX INFO: renamed from: j */
    private int f449j;

    /* JADX INFO: renamed from: k */
    private int f450k;

    /* JADX INFO: renamed from: l */
    private int f451l;

    /* JADX INFO: renamed from: m */
    private int f452m;

    C0010k() {
        m144a();
    }

    /* JADX INFO: renamed from: a */
    final float m143a(int i) {
        switch (i) {
            case 3:
                return this.f437a;
            case 7:
                return this.f439b;
            case 11:
                return this.f441c;
            default:
                return 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m144a() {
        this.f438a = 16384;
        this.f440b = 0;
        this.f442c = 0;
        this.f437a = 0.0f;
        this.f443d = 0;
        this.f444e = 16384;
        this.f445f = 0;
        this.f439b = 0.0f;
        this.f446g = 0;
        this.f447h = 0;
        this.f448i = 16384;
        this.f441c = 0.0f;
        this.f449j = 0;
        this.f450k = 0;
        this.f451l = 0;
        this.f452m = 16384;
    }

    /* JADX INFO: renamed from: a */
    final void m145a(double d, float f, float f2, float f3) {
        m147a((float) d, f, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    final void m146a(float f, float f2, float f3) {
        this.f437a += ((this.f438a * f) + (this.f440b * f2) + (this.f442c * f3)) * 6.1035156E-5f;
        this.f439b += ((this.f443d * f) + (this.f444e * f2) + (this.f445f * f3)) * 6.1035156E-5f;
        this.f441c += ((this.f446g * f) + (this.f447h * f2) + (this.f448i * f3)) * 6.1035156E-5f;
    }

    /* JADX INFO: renamed from: a */
    final void m147a(float f, float f2, float f3, float f4) {
        if (f > 0.001f || f < -0.001f) {
            float f5 = (C0011l.f453a / 360.0f) * f;
            int iSin = (int) (Math.sin(f5) * 16384.0d);
            int i = (int) (iSin * f2);
            int i2 = (int) (iSin * f3);
            int i3 = (int) (iSin * f4);
            int iCos = (int) (Math.cos(f5) * 16384.0d);
            int i4 = i << 1;
            int i5 = i2 << 1;
            int i6 = i3 << 1;
            int i7 = (i * i4) >> 14;
            int i8 = (i * i5) >> 14;
            int i9 = (i * i6) >> 14;
            int i10 = (i2 * i5) >> 14;
            int i11 = (i2 * i6) >> 14;
            int i12 = (i3 * i6) >> 14;
            int i13 = (i4 * iCos) >> 14;
            int i14 = (i5 * iCos) >> 14;
            int i15 = (iCos * i6) >> 14;
            int i16 = (16384 - i10) - i12;
            int i17 = i8 - i15;
            int i18 = i9 + i14;
            int i19 = i15 + i8;
            int i20 = (16384 - i7) - i12;
            int i21 = i11 - i13;
            int i22 = i9 - i14;
            int i23 = i11 + i13;
            int i24 = (16384 - i7) - i10;
            int i25 = (((this.f438a * i16) + (this.f440b * i19)) + (this.f442c * i22)) >> 14;
            int i26 = (((this.f443d * i16) + (this.f444e * i19)) + (this.f445f * i22)) >> 14;
            int i27 = (((i19 * this.f447h) + (i16 * this.f446g)) + (i22 * this.f448i)) >> 14;
            int i28 = (((this.f438a * i17) + (this.f440b * i20)) + (this.f442c * i23)) >> 14;
            int i29 = (((this.f443d * i17) + (this.f444e * i20)) + (this.f445f * i23)) >> 14;
            int i30 = (((i20 * this.f447h) + (this.f446g * i17)) + (i23 * this.f448i)) >> 14;
            int i31 = (((this.f438a * i18) + (this.f440b * i21)) + (this.f442c * i24)) >> 14;
            int i32 = (((this.f443d * i18) + (this.f444e * i21)) + (this.f445f * i24)) >> 14;
            int i33 = ((i24 * this.f448i) + ((i21 * this.f447h) + (this.f446g * i18))) >> 14;
            this.f438a = i25;
            this.f440b = i28;
            this.f442c = i31;
            this.f443d = i26;
            this.f444e = i29;
            this.f445f = i32;
            this.f446g = i27;
            this.f447h = i30;
            this.f448i = i33;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m148a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        float f13 = f4 - f;
        float f14 = f5 - f2;
        float f15 = f6 - f3;
        float fM163a = 1.0f / C0011l.m163a(Math.sqrt(((f13 * f13) + (f14 * f14)) + (f15 * f15)));
        float f16 = f13 * fM163a;
        float f17 = f14 * fM163a;
        float f18 = f15 * fM163a;
        float f19 = (0.0f * f17) - f18;
        float f20 = (0.0f * f18) - (0.0f * f16);
        float f21 = f16 - (0.0f * f17);
        float fM163a2 = 1.0f / C0011l.m163a(Math.sqrt(((f19 * f19) + (f20 * f20)) + (f21 * f21)));
        int i = (int) (f19 * fM163a2 * 16384.0f);
        int i2 = (int) (f20 * fM163a2 * 16384.0f);
        int i3 = (int) (f21 * fM163a2 * 16384.0f);
        int i4 = (int) (f16 * 16384.0f);
        int i5 = (int) (f17 * 16384.0f);
        int i6 = (int) (f18 * 16384.0f);
        int i7 = (int) (16384.0f * f10);
        int i8 = (int) (16384.0f * f12);
        this.f438a = (i * i7) >> 14;
        this.f440b = ((((i2 * i6) - (i3 * i5)) >> 14) << 14) >> 14;
        this.f442c = ((-i4) * i8) >> 14;
        this.f437a = f;
        this.f443d = (i2 * i7) >> 14;
        this.f444e = ((((i3 * i4) - (i * i6)) >> 14) << 14) >> 14;
        this.f445f = ((-i5) * i8) >> 14;
        this.f439b = f2;
        this.f446g = (i3 * i7) >> 14;
        this.f447h = ((((i * i5) - (i2 * i4)) >> 14) << 14) >> 14;
        this.f448i = ((-i6) * i8) >> 14;
        this.f441c = f3;
        this.f449j = 0;
        this.f450k = 0;
        this.f451l = 0;
        this.f452m = 16384;
    }

    /* JADX INFO: renamed from: a */
    final void m149a(int i, float f) {
        switch (i) {
            case 3:
                this.f437a = f;
                break;
            case 7:
                this.f439b = f;
                break;
            case 11:
                this.f441c = f;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m150a(int i, int i2) {
        switch (i) {
            case 0:
                this.f438a = i2;
                break;
            case 1:
                this.f440b = i2;
                break;
            case 2:
                this.f442c = i2;
                break;
            case 3:
                this.f437a = i2;
                break;
            case 4:
                this.f443d = i2;
                break;
            case 5:
                this.f444e = i2;
                break;
            case 6:
                this.f445f = i2;
                break;
            case 7:
                this.f439b = i2;
                break;
            case 8:
                this.f446g = i2;
                break;
            case 9:
                this.f447h = i2;
                break;
            case 10:
                this.f448i = i2;
                break;
            case 11:
                this.f441c = i2;
                break;
            case 12:
                this.f449j = i2;
                break;
            case 13:
                this.f450k = i2;
                break;
            case 14:
                this.f451l = i2;
                break;
            case 15:
                this.f452m = i2;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m151a(C0010k c0010k) {
        if (c0010k == null) {
            m144a();
            return;
        }
        this.f438a = c0010k.f438a;
        this.f440b = c0010k.f440b;
        this.f442c = c0010k.f442c;
        this.f437a = c0010k.f437a;
        this.f443d = c0010k.f443d;
        this.f444e = c0010k.f444e;
        this.f445f = c0010k.f445f;
        this.f439b = c0010k.f439b;
        this.f446g = c0010k.f446g;
        this.f447h = c0010k.f447h;
        this.f448i = c0010k.f448i;
        this.f441c = c0010k.f441c;
        this.f449j = c0010k.f449j;
        this.f450k = c0010k.f450k;
        this.f451l = c0010k.f451l;
        this.f452m = c0010k.f452m;
    }

    /* JADX INFO: renamed from: a */
    final void m152a(float[] fArr) {
        this.f438a = (int) (fArr[0] * 16384.0f);
        this.f440b = (int) (fArr[1] * 16384.0f);
        this.f442c = (int) (fArr[2] * 16384.0f);
        this.f437a = fArr[3];
        this.f443d = (int) (fArr[4] * 16384.0f);
        this.f444e = (int) (fArr[5] * 16384.0f);
        this.f445f = (int) (fArr[6] * 16384.0f);
        this.f439b = fArr[7];
        this.f446g = (int) (fArr[8] * 16384.0f);
        this.f447h = (int) (fArr[9] * 16384.0f);
        this.f448i = (int) (fArr[10] * 16384.0f);
        this.f441c = fArr[11];
        this.f449j = (int) (fArr[12] * 16384.0f);
        this.f450k = (int) (fArr[13] * 16384.0f);
        this.f451l = (int) (fArr[14] * 16384.0f);
        this.f452m = (int) (fArr[15] * 16384.0f);
    }

    /* JADX INFO: renamed from: b */
    final void m153b() {
        float f = (-((this.f438a * this.f437a) + (this.f443d * this.f439b) + (this.f446g * this.f441c))) * 6.1035156E-5f;
        float f2 = (-((this.f440b * this.f437a) + (this.f444e * this.f439b) + (this.f447h * this.f441c))) * 6.1035156E-5f;
        float f3 = (-((this.f442c * this.f437a) + (this.f445f * this.f439b) + (this.f448i * this.f441c))) * 6.1035156E-5f;
        this.f437a = f;
        this.f439b = f2;
        this.f441c = f3;
        int i = this.f440b;
        this.f440b = this.f443d;
        this.f443d = i;
        int i2 = this.f442c;
        this.f442c = this.f446g;
        this.f446g = i2;
        int i3 = this.f445f;
        this.f445f = this.f447h;
        this.f447h = i3;
    }

    /* JADX INFO: renamed from: b */
    final void m154b(float f, float f2, float f3) {
        this.f438a = (int) (this.f438a * f);
        this.f443d = (int) (this.f443d * f);
        this.f446g = (int) (this.f446g * f);
        this.f440b = (int) (this.f440b * f2);
        this.f444e = (int) (this.f444e * f2);
        this.f447h = (int) (this.f447h * f2);
        this.f442c = (int) (this.f442c * f3);
        this.f445f = (int) (this.f445f * f3);
        this.f448i = (int) (this.f448i * f3);
    }

    /* JADX INFO: renamed from: b */
    final void m155b(C0010k c0010k) {
        int i = (((this.f438a * c0010k.f438a) + (this.f440b * c0010k.f443d)) + (this.f442c * c0010k.f446g)) >> 14;
        int i2 = (((this.f443d * c0010k.f438a) + (this.f444e * c0010k.f443d)) + (this.f445f * c0010k.f446g)) >> 14;
        int i3 = (((this.f446g * c0010k.f438a) + (this.f447h * c0010k.f443d)) + (this.f448i * c0010k.f446g)) >> 14;
        int i4 = (((this.f438a * c0010k.f440b) + (this.f440b * c0010k.f444e)) + (this.f442c * c0010k.f447h)) >> 14;
        int i5 = (((this.f443d * c0010k.f440b) + (this.f444e * c0010k.f444e)) + (this.f445f * c0010k.f447h)) >> 14;
        int i6 = (((this.f446g * c0010k.f440b) + (this.f447h * c0010k.f444e)) + (this.f448i * c0010k.f447h)) >> 14;
        int i7 = (((this.f438a * c0010k.f442c) + (this.f440b * c0010k.f445f)) + (this.f442c * c0010k.f448i)) >> 14;
        int i8 = (((this.f443d * c0010k.f442c) + (this.f444e * c0010k.f445f)) + (this.f445f * c0010k.f448i)) >> 14;
        int i9 = (((this.f446g * c0010k.f442c) + (this.f447h * c0010k.f445f)) + (this.f448i * c0010k.f448i)) >> 14;
        float f = (((this.f438a * c0010k.f437a) + (this.f440b * c0010k.f439b) + (this.f442c * c0010k.f441c)) * 6.1035156E-5f) + this.f437a;
        float f2 = (((this.f443d * c0010k.f437a) + (this.f444e * c0010k.f439b) + (this.f445f * c0010k.f441c)) * 6.1035156E-5f) + this.f439b;
        float f3 = (((this.f446g * c0010k.f437a) + (this.f447h * c0010k.f439b) + (this.f448i * c0010k.f441c)) * 6.1035156E-5f) + this.f441c;
        this.f438a = i;
        this.f440b = i4;
        this.f442c = i7;
        this.f437a = f;
        this.f443d = i2;
        this.f444e = i5;
        this.f445f = i8;
        this.f439b = f2;
        this.f446g = i3;
        this.f447h = i6;
        this.f448i = i9;
        this.f441c = f3;
    }

    /* JADX INFO: renamed from: b */
    final void m156b(float[] fArr) {
        fArr[0] = this.f438a * 6.1035156E-5f;
        fArr[1] = this.f440b * 6.1035156E-5f;
        fArr[2] = this.f442c * 6.1035156E-5f;
        fArr[3] = this.f437a;
        fArr[4] = this.f443d * 6.1035156E-5f;
        fArr[5] = this.f444e * 6.1035156E-5f;
        fArr[6] = this.f445f * 6.1035156E-5f;
        fArr[7] = this.f439b;
        fArr[8] = this.f446g * 6.1035156E-5f;
        fArr[9] = this.f447h * 6.1035156E-5f;
        fArr[10] = this.f448i * 6.1035156E-5f;
        fArr[11] = this.f441c;
        fArr[12] = this.f449j * 6.1035156E-5f;
        fArr[13] = this.f450k * 6.1035156E-5f;
        fArr[14] = this.f451l * 6.1035156E-5f;
        fArr[15] = this.f452m * 6.1035156E-5f;
    }

    /* JADX INFO: renamed from: c */
    final void m157c(C0010k c0010k) {
        int i = (((this.f449j * c0010k.f438a) + (this.f450k * c0010k.f443d)) + (this.f451l * c0010k.f446g)) >> 14;
        int i2 = (((this.f449j * c0010k.f440b) + (this.f450k * c0010k.f444e)) + (this.f451l * c0010k.f447h)) >> 14;
        int i3 = (((this.f449j * c0010k.f442c) + (this.f450k * c0010k.f445f)) + (this.f451l * c0010k.f448i)) >> 14;
        int i4 = (int) ((this.f449j * c0010k.f437a) + (this.f450k * c0010k.f439b) + (this.f451l * c0010k.f441c));
        this.f449j = i;
        this.f450k = i2;
        this.f451l = i3;
        this.f452m = i4;
        m155b(c0010k);
    }

    /* JADX INFO: renamed from: c */
    final void m158c(float[] fArr) {
        float f = (((this.f438a * fArr[0]) + (this.f440b * fArr[1]) + (this.f442c * fArr[2])) * 6.1035156E-5f) + (this.f437a * fArr[3]);
        float f2 = (((this.f443d * fArr[0]) + (this.f444e * fArr[1]) + (this.f445f * fArr[2])) * 6.1035156E-5f) + (this.f439b * fArr[3]);
        float f3 = (((this.f446g * fArr[0]) + (this.f447h * fArr[1]) + (this.f448i * fArr[2])) * 6.1035156E-5f) + (this.f441c * fArr[3]);
        float f4 = ((this.f449j * fArr[0]) + (this.f450k * fArr[1]) + (this.f451l * fArr[2]) + (this.f452m * fArr[3])) * 6.1035156E-5f;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
    }

    /* JADX INFO: renamed from: d */
    final void m159d(C0010k c0010k) {
        this.f438a = -c0010k.f438a;
        this.f440b = c0010k.f440b;
        this.f442c = -c0010k.f442c;
        this.f443d = -c0010k.f443d;
        this.f444e = c0010k.f444e;
        this.f445f = -c0010k.f445f;
        this.f446g = -c0010k.f446g;
        this.f447h = c0010k.f447h;
        this.f448i = -c0010k.f448i;
    }
}
