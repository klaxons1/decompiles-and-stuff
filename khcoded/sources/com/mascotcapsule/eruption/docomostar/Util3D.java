package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Util3D {

    /* JADX INFO: renamed from: a */
    private static final C0053by[] f512a;

    /* JADX INFO: renamed from: b */
    private static final C0057cb[] f513b;

    /* JADX INFO: renamed from: c */
    private static final C0053by[] f514c;

    /* JADX INFO: renamed from: d */
    private static final C0053by[] f515d;

    static {
        C0053by[] c0053byArr = new C0053by[8];
        f512a = c0053byArr;
        c0053byArr[0] = new C0053by(0.0f, 6.362832f, -3.838464f);
        f512a[1] = new C0053by(-0.027141f, 7.240384f, -10.9312f);
        f512a[2] = new C0053by(-0.109875f, 8.580848f, -16.359936f);
        f512a[3] = new C0053by(-0.20904f, 9.66048f, -19.29728f);
        f512a[4] = new C0053by(-0.20312f, 9.6368f, -19.29728f);
        f512a[5] = new C0053by(0.090565f, 7.779088f, -16.359936f);
        f512a[6] = new C0053by(0.860251f, 3.690816f, -10.9312f);
        f512a[7] = new C0053by(2.2218f, -2.524368f, -3.838464f);
        C0057cb[] c0057cbArr = new C0057cb[8];
        f513b = c0057cbArr;
        c0057cbArr[0] = new C0057cb(29271, -4180441, 59920);
        f513b[1] = new C0057cb(521088977, -248783712, 50701);
        f513b[2] = new C0057cb(1013920792, -455890835, 43613);
        f513b[3] = new C0057cb(1482669700, -634159620, 38046);
        f513b[4] = new C0057cb(1930554392, -789722371, 33570);
        f513b[5] = new C0057cb(-1934832096, -927019315, 29908);
        f513b[6] = new C0057cb(-1521479215, -1049363767, 26867);
        f513b[7] = new C0057cb(-1122643343, -1159284866, 24308);
        C0053by[] c0053byArr2 = new C0053by[9];
        f514c = c0053byArr2;
        c0053byArr2[0] = new C0053by(0.0f, 0.155054f, 0.023224f);
        f514c[1] = new C0053by(0.020901f, 0.0704f, 0.108928f);
        f514c[2] = new C0053by(0.149829f, -0.274016f, 0.338944f);
        f514c[3] = new C0053by(0.647753f, -1.412928f, 0.990208f);
        f514c[4] = new C0053by(2.271173f, -4.877376f, 2.838528f);
        f514c[5] = new C0053by(7.1997094f, -15.053858f, 8.091649f);
        f514c[6] = new C0053by(21.514599f, -44.14069f, 22.867243f);
        f514c[7] = new C0053by(62.878464f, -127.52367f, 64.88895f);
        f514c[8] = new C0053by(564.484f, -1134.2972f, 570.0633f);
        C0053by[] c0053byArr3 = new C0053by[10];
        f515d = c0053byArr3;
        c0053byArr3[0] = new C0053by(0.0f, 0.16018f, -0.0155f);
        f515d[1] = new C0053by(-9.481E-4f, 0.1698841f, -0.0403175f);
        f515d[2] = new C0053by(-0.0024995f, 0.1779111f, -0.0506663f);
        f515d[3] = new C0053by(0.0158103f, 0.1384918f, -0.0296849f);
        f515d[4] = new C0053by(0.0843438f, 0.0600459f, -0.0072414f);
        f515d[5] = new C0053by(0.1578419f, 0.0174207f, -0.0010648f);
        f515d[6] = new C0053by(0.2034208f, 0.0043683f, -1.315E-4f);
        f515d[7] = new C0053by(0.227078f, 0.0010529f, -1.55E-5f);
        f515d[8] = new C0053by(0.2442418f, 1.74E-5f, 0.0f);
        f515d[9] = new C0053by(0.2494641f, 1.62E-8f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    static final float m288a(float f) {
        return f < 0.0f ? -f : f;
    }

    /* JADX INFO: renamed from: a */
    static final int m289a(int i) {
        int i2 = (i >> 1) | i;
        int i3 = i2 | (i2 >> 2);
        int i4 = i3 | (i3 >> 4);
        int i5 = i4 | (i4 >> 8);
        int i6 = i5 | (i5 >> 16);
        int i7 = i6 & ((i6 >> 1) ^ (-1));
        return (((-65536) & i7) != 0 ? 16 : 0) | (((-16711936) & i7) != 0 ? 8 : 0) | (((-1431655766) & i7) != 0 ? 1 : 0) | (((-858993460) & i7) != 0 ? 2 : 0) | (((-252645136) & i7) != 0 ? 4 : 0);
    }

    /* JADX INFO: renamed from: a */
    static final int m290a(float[] fArr) {
        return ((int) (fArr[0] * 255.0f)) | (((int) (fArr[1] * 255.0f)) << 8) | (((int) (fArr[2] * 255.0f)) << 16);
    }

    /* JADX INFO: renamed from: a */
    static final void m291a(float[] fArr, int i) {
        fArr[0] = (i & 255) * 0.003921569f;
        fArr[1] = ((i >> 8) & 255) * 0.003921569f;
        fArr[2] = ((i >> 16) & 255) * 0.003921569f;
    }

    /* JADX INFO: renamed from: a */
    static final boolean m292a(float[] fArr, float[] fArr2) {
        return fArr[0] == fArr2[0] && fArr[1] == fArr2[1] && fArr[2] == fArr2[2];
    }

    public static final float acos(float f) {
        return 0.25f - asin(f);
    }

    public static final float asin(float f) {
        C0053by c0053by;
        if (f < -1.0f || f > 1.0f) {
            return 0.0f;
        }
        float f2 = f < 0.0f ? -f : f;
        if (f2 < 0.5f) {
            c0053by = f514c[0];
        } else if (f2 <= 0.75f) {
            c0053by = f514c[1];
        } else if (f2 <= 0.875f) {
            c0053by = f514c[2];
        } else if (f2 <= 0.9375f) {
            c0053by = f514c[3];
        } else if (f2 <= 0.96875f) {
            c0053by = f514c[4];
        } else if (f2 <= 0.984375f) {
            c0053by = f514c[5];
        } else if (f2 <= 0.992188f) {
            c0053by = f514c[6];
        } else {
            c0053by = f2 <= 0.996094f ? f514c[7] : f514c[8];
        }
        float f3 = (c0053by.f763c * f2 * f2) + c0053by.f761a + (c0053by.f762b * f2);
        return f < 0.0f ? -f3 : f3;
    }

    public static final float atan(float f) {
        float f2;
        C0053by c0053by;
        float f3 = f < 0.0f ? -f : f;
        if (f3 < 32767.0f) {
            if (f3 < 0.2f) {
                c0053by = f515d[0];
            } else if (f3 <= 0.41f) {
                c0053by = f515d[1];
            } else if (f3 <= 0.8405f) {
                c0053by = f515d[2];
            } else if (f3 <= 1.723025f) {
                c0053by = f515d[3];
            } else if (f3 <= 3.532201f) {
                c0053by = f515d[4];
            } else if (f3 <= 7.241012f) {
                c0053by = f515d[5];
            } else if (f3 <= 14.844074f) {
                c0053by = f515d[6];
            } else if (f3 <= 30.430351f) {
                c0053by = f515d[7];
            } else {
                c0053by = f3 <= 300.0f ? f515d[8] : f515d[9];
            }
            f2 = (c0053by.f763c * f3 * f3) + c0053by.f761a + (c0053by.f762b * f3);
        } else {
            f2 = 0.25f;
        }
        return f < 0.0f ? -f2 : f2;
    }

    public static final float atan2(float f, float f2) {
        if (f == 0.0f) {
            if (f2 > 0.0f) {
                return 0.25f;
            }
            return f2 < 0.0f ? -0.25f : 0.0f;
        }
        if (f2 == 0.0f) {
            return f < 0.0f ? 0.5f : 0.0f;
        }
        float fAtan = atan(f2 / f);
        if (f < 0.0f) {
            return f2 > 0.0f ? fAtan + 0.5f : fAtan - 0.5f;
        }
        return fAtan;
    }

    /* JADX INFO: renamed from: b */
    static final float m293b(int i) {
        return (i & 255) * 0.003921569f;
    }

    /* JADX INFO: renamed from: b */
    static final int m294b(float f) {
        return (int) (255.0f * f);
    }

    /* JADX INFO: renamed from: b */
    static final int m295b(float[] fArr) {
        return ((int) (fArr[0] * 255.0f)) | (((int) (fArr[1] * 255.0f)) << 8) | (((int) (fArr[2] * 255.0f)) << 16) | (((int) (fArr[3] * 255.0f)) << 24);
    }

    /* JADX INFO: renamed from: b */
    static final void m296b(float[] fArr, int i) {
        fArr[0] = (i & 255) * 0.003921569f;
        fArr[1] = ((i >> 8) & 255) * 0.003921569f;
        fArr[2] = ((i >> 16) & 255) * 0.003921569f;
        fArr[3] = (i >>> 24) * 0.003921569f;
    }

    /* JADX INFO: renamed from: b */
    static final boolean m297b(float[] fArr, float[] fArr2) {
        return fArr[0] == fArr2[0] && fArr[1] == fArr2[1] && fArr[2] == fArr2[2] && fArr[3] == fArr2[3];
    }

    /* JADX INFO: renamed from: c */
    static final int m298c(int i) {
        return (i + 3) & (-4);
    }

    /* JADX INFO: renamed from: c */
    static final void m299c(float[] fArr, float[] fArr2) {
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
    }

    public static final float cos(float f) {
        return sin(0.25f + f);
    }

    /* JADX INFO: renamed from: d */
    static final int m300d(int i) {
        return (i + 15) & (-16);
    }

    /* JADX INFO: renamed from: d */
    static final void m301d(float[] fArr, float[] fArr2) {
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
    }

    public static final float sin(float f) {
        C0053by c0053by;
        float f2 = f < 0.0f ? 1.0f - (((int) f) - f) : f - ((int) f);
        float f3 = f2 != 1.0f ? f2 : 0.0f;
        int iFloatToIntBits = Float.floatToIntBits(f3);
        int i = ((2139095040 & iFloatToIntBits) >>> 23) - 146;
        int i2 = ((8388608 | (iFloatToIntBits & 8388607)) >>> (i < -31 ? 31 : -i)) & 15;
        if ((i2 & 8) == 0) {
            c0053by = f512a[i2];
        } else {
            c0053by = f512a[i2 & 7];
            f3 -= 0.5f;
        }
        float f4 = (f3 * c0053by.f763c * f3) + c0053by.f761a + (c0053by.f762b * f3);
        return (i2 & 8) != 0 ? -f4 : f4;
    }

    public static final float sqrt(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iFloatToIntBits = Float.floatToIntBits(f);
        int i = (2139095040 & iFloatToIntBits) >>> 23;
        int i2 = (iFloatToIntBits & 8388607) >>> 7;
        C0057cb c0057cb = f513b[i2 >>> 13];
        int i3 = i2 & 8191;
        int i4 = (((i3 * ((c0057cb.f768b - ((c0057cb.f769c * i3) >>> 2)) >>> 16)) + c0057cb.f767a) + 32768) >>> 16;
        return Float.intBitsToFloat((((i & 1) == 0 ? ((i4 * 46341) >>> 1) + 889516852 : i4 << 14) >>> 8) | ((i - (((i - 127) + 1) >>> 1)) << 23));
    }
}
