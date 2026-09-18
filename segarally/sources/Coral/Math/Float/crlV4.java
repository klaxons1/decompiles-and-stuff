package Coral.Math.Float;

/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class crlV4 {
    public static final crlV4 Code = new crlV4(0.0f, 1.0f, 0.0f);

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public float f362Code;

    /* JADX INFO: renamed from: I */
    public float f17I;

    /* JADX INFO: renamed from: V */
    public float f18V;

    static {
        new crlV4(0.0f, 0.0f, 0.0f);
    }

    public crlV4() {
    }

    public crlV4(float f, float f2, float f3) {
        this.f362Code = f;
        this.f18V = f2;
        this.f17I = f3;
    }

    public static double Code(double d) {
        boolean z;
        double d2;
        boolean z2;
        int i;
        int i2 = 0;
        if (d < 0.0d) {
            d2 = -d;
            z = true;
        } else {
            z = false;
            d2 = d;
        }
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
            z2 = true;
        } else {
            z2 = false;
        }
        while (true) {
            i = i2;
            if (d2 <= 0.2617993877991494d) {
                break;
            }
            i2 = i + 1;
            d2 = (1.0d / (d2 + 1.7320508075688772d)) * ((d2 * 1.7320508075688772d) - 1.0d);
        }
        double d3 = d2 * d2;
        double d4 = (((0.55913709d / (1.4087812d + d3)) + 0.60310579d) - (d3 * 0.05160454d)) * d2;
        while (i > 0) {
            i--;
            d4 += 0.5235987755982988d;
        }
        if (z2) {
            d4 = 1.5707963267948966d - d4;
        }
        return z ? -d4 : d4;
    }

    public static double Code(double d, double d2) {
        if (d == 0.0d && d2 == 0.0d) {
            return 0.0d;
        }
        if (d2 > 0.0d) {
            return Code(d / d2);
        }
        if (d2 >= 0.0d) {
            return d < 0.0d ? -1.5707963267948966d : 1.5707963267948966d;
        }
        return d >= 0.0d ? 3.141592653589793d - Code((-d) / d2) : -(3.141592653589793d - Code(d / d2));
    }

    public static float Code(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(1597463174 - (Float.floatToIntBits(f) >> 1));
        return fIntBitsToFloat * (1.5f - (((0.5f * f) * fIntBitsToFloat) * fIntBitsToFloat));
    }

    public static final float Code(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static final float Code(crlV4 crlv4, crlV4 crlv5) {
        return (crlv4.f362Code * crlv5.f362Code) + (crlv4.f18V * crlv5.f18V) + (crlv4.f17I * crlv5.f17I);
    }

    public static final void Code(crlV4 crlv4, crlV4 crlv5, crlV4 crlv6) {
        crlv4.f362Code = crlv5.f362Code + crlv6.f362Code;
        crlv4.f18V = crlv5.f18V + crlv6.f18V;
        crlv4.f17I = crlv5.f17I + crlv6.f17I;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public static final boolean m205Code(float f) {
        return f != f;
    }

    /* JADX INFO: renamed from: I */
    public static final float m1I(float f) {
        if (m205Code(f)) {
            return 0.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: I */
    public static float m2I(crlV4 crlv4, crlV4 crlv5) {
        float f = crlv5.f362Code - crlv4.f362Code;
        float f2 = crlv5.f17I - crlv4.f17I;
        return (f * f) + (f2 * f2);
    }

    /* JADX INFO: renamed from: I */
    public static void m3I(crlV4 crlv4, crlV4 crlv5, crlV4 crlv6) {
        crlv4.f362Code = (crlv5.f18V * crlv6.f17I) - (crlv5.f17I * crlv6.f18V);
        crlv4.f18V = (crlv5.f17I * crlv6.f362Code) - (crlv5.f362Code * crlv6.f17I);
        crlv4.f17I = (crlv5.f362Code * crlv6.f18V) - (crlv5.f18V * crlv6.f362Code);
    }

    /* JADX INFO: renamed from: V */
    public static final float m4V(float f) {
        if (f >= 1.0E-6f || f <= -1.0E-6f) {
            return f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: V */
    public static final float m5V(float f, float f2, float f3) {
        return ((f3 - f2) * f) + f2;
    }

    /* JADX INFO: renamed from: V */
    public static float m6V(crlV4 crlv4, crlV4 crlv5) {
        float f = crlv5.f362Code - crlv4.f362Code;
        float f2 = crlv5.f18V - crlv4.f18V;
        float f3 = (f * f) + (f2 * f2);
        float f4 = crlv5.f17I - crlv4.f17I;
        return f3 + (f4 * f4);
    }

    /* JADX INFO: renamed from: V */
    public static final void m7V(crlV4 crlv4, crlV4 crlv5, crlV4 crlv6) {
        crlv4.f362Code = crlv5.f362Code - crlv6.f362Code;
        crlv4.f18V = crlv5.f18V - crlv6.f18V;
        crlv4.f17I = crlv5.f17I - crlv6.f17I;
    }

    public final float Code() {
        return (float) Math.sqrt((this.f362Code * this.f362Code) + (this.f18V * this.f18V) + (this.f17I * this.f17I));
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m206Code() {
        float fCode = Code((this.f362Code * this.f362Code) + (this.f18V * this.f18V) + (this.f17I * this.f17I));
        float f = this.f362Code * fCode;
        if (!m205Code(f)) {
            this.f362Code = f;
        }
        float f2 = this.f18V * fCode;
        if (!m205Code(f2)) {
            this.f18V = f2;
        }
        float f3 = fCode * this.f17I;
        if (m205Code(f3)) {
            return;
        }
        this.f17I = f3;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m207Code(float f) {
        this.f362Code *= f;
        this.f18V *= f;
        this.f17I *= f;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m208Code(float f, float f2, float f3) {
        this.f362Code = f;
        this.f18V = f2;
        this.f17I = f3;
    }

    public final void Code(crlV4 crlv4) {
        this.f362Code = crlv4.f362Code;
        this.f18V = crlv4.f18V;
        this.f17I = crlv4.f17I;
    }

    /* JADX INFO: renamed from: I */
    public final void m8I() {
        if (this.f362Code > -1.0E-6f && this.f362Code < 1.0E-6f) {
            this.f362Code = 0.0f;
        }
        if (this.f18V > -1.0E-6f && this.f18V < 1.0E-6f) {
            this.f18V = 0.0f;
        }
        if (this.f17I <= -1.0E-6f || this.f17I >= 1.0E-6f) {
            return;
        }
        this.f17I = 0.0f;
    }

    /* JADX INFO: renamed from: I */
    public final void m9I(float f, float f2, float f3) {
        this.f362Code -= f;
        this.f18V -= f2;
        this.f17I -= f3;
    }

    /* JADX INFO: renamed from: I */
    public final void m10I(crlV4 crlv4) {
        this.f362Code -= crlv4.f362Code;
        this.f18V -= crlv4.f18V;
        this.f17I -= crlv4.f17I;
    }

    /* JADX INFO: renamed from: V */
    public final void m11V() {
        float fSqrt = 1.0f / ((float) Math.sqrt((this.f362Code * this.f362Code) + (this.f18V * this.f18V)));
        this.f362Code *= fSqrt;
        this.f18V = fSqrt * this.f18V;
        this.f17I = 0.0f;
    }

    /* JADX INFO: renamed from: V */
    public final void m12V(float f) {
        this.f362Code *= f;
        this.f18V *= f;
        this.f17I = 0.0f;
    }

    /* JADX INFO: renamed from: V */
    public final void m13V(float f, float f2, float f3) {
        this.f362Code += f;
        this.f18V += f2;
        this.f17I += f3;
    }

    /* JADX INFO: renamed from: V */
    public final void m14V(crlV4 crlv4) {
        this.f362Code += crlv4.f362Code;
        this.f18V += crlv4.f18V;
        this.f17I += crlv4.f17I;
    }
}
