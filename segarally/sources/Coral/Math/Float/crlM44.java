package Coral.Math.Float;

import javax.microedition.m3g.Transform;

/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class crlM44 {
    private static crlV4 Code;

    /* JADX INFO: renamed from: I */
    private static crlV4 f0I;

    /* JADX INFO: renamed from: V */
    private static crlV4 f1V;

    /* JADX INFO: renamed from: B */
    public float f2B;

    /* JADX INFO: renamed from: C */
    public float f3C;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public float f361Code;

    /* JADX INFO: renamed from: D */
    public float f4D;

    /* JADX INFO: renamed from: F */
    public float f5F;

    /* JADX INFO: renamed from: I */
    public float f6I;

    /* JADX INFO: renamed from: L */
    public float f7L;

    /* JADX INFO: renamed from: S */
    public float f8S;

    /* JADX INFO: renamed from: V */
    public float f9V;

    /* JADX INFO: renamed from: Z */
    public float f10Z;

    /* JADX INFO: renamed from: a */
    public float f11a;

    /* JADX INFO: renamed from: b */
    public float f12b;

    /* JADX INFO: renamed from: c */
    public float f13c;

    /* JADX INFO: renamed from: d */
    public float f14d;

    /* JADX INFO: renamed from: e */
    public float f15e;

    /* JADX INFO: renamed from: f */
    public float f16f;

    static {
        new crlM44();
        Code = new crlV4();
        f1V = new crlV4();
        f0I = new crlV4();
    }

    public crlM44() {
        new Transform();
        this.f361Code = 1.0f;
        this.f9V = 0.0f;
        this.f6I = 0.0f;
        this.f10Z = 0.0f;
        this.f2B = 0.0f;
        this.f3C = 1.0f;
        this.f8S = 0.0f;
        this.f5F = 0.0f;
        this.f4D = 0.0f;
        this.f7L = 0.0f;
        this.f11a = 1.0f;
        this.f12b = 0.0f;
        this.f13c = 0.0f;
        this.f14d = 0.0f;
        this.f15e = 0.0f;
        this.f16f = 1.0f;
    }

    public static void Code(float[] fArr, crlV4 crlv4, crlV4 crlv5, crlV4 crlv6) {
        crlV4.m7V(Code, crlv4, crlv5);
        Code.m206Code();
        fArr[2] = Code.f362Code;
        fArr[6] = Code.f18V;
        fArr[10] = Code.f17I;
        fArr[14] = 0.0f;
        crlV4.m3I(f1V, crlv6, Code);
        f1V.m206Code();
        fArr[0] = f1V.f362Code;
        fArr[4] = f1V.f18V;
        fArr[8] = f1V.f17I;
        fArr[12] = 0.0f;
        crlV4.m3I(f0I, Code, f1V);
        fArr[1] = f0I.f362Code;
        fArr[5] = f0I.f18V;
        fArr[9] = f0I.f17I;
        fArr[13] = 0.0f;
        fArr[3] = crlv4.f362Code;
        fArr[7] = crlv4.f18V;
        fArr[11] = crlv4.f17I;
        fArr[15] = 1.0f;
    }

    public final void Code() {
        this.f361Code = 1.0f;
        this.f9V = 0.0f;
        this.f6I = 0.0f;
        this.f10Z = 0.0f;
        this.f2B = 0.0f;
        this.f3C = 1.0f;
        this.f8S = 0.0f;
        this.f5F = 0.0f;
        this.f4D = 0.0f;
        this.f7L = 0.0f;
        this.f11a = 1.0f;
        this.f12b = 0.0f;
        this.f13c = 0.0f;
        this.f14d = 0.0f;
        this.f15e = 0.0f;
        this.f16f = 1.0f;
    }

    public final void Code(crlM44 crlm44) {
        this.f361Code = crlm44.f361Code;
        this.f9V = crlm44.f9V;
        this.f6I = crlm44.f6I;
        this.f10Z = crlm44.f10Z;
        this.f2B = crlm44.f2B;
        this.f3C = crlm44.f3C;
        this.f8S = crlm44.f8S;
        this.f5F = crlm44.f5F;
        this.f4D = crlm44.f4D;
        this.f7L = crlm44.f7L;
        this.f11a = crlm44.f11a;
        this.f12b = crlm44.f12b;
        this.f13c = crlm44.f13c;
        this.f14d = crlm44.f14d;
        this.f15e = crlm44.f15e;
        this.f16f = crlm44.f16f;
    }

    public final void Code(float[] fArr) {
        this.f361Code = fArr[0];
        this.f9V = fArr[1];
        this.f6I = fArr[2];
        this.f10Z = fArr[3];
        this.f2B = fArr[4];
        this.f3C = fArr[5];
        this.f8S = fArr[6];
        this.f5F = fArr[7];
        this.f4D = fArr[8];
        this.f7L = fArr[9];
        this.f11a = fArr[10];
        this.f12b = fArr[11];
        this.f13c = fArr[12];
        this.f14d = fArr[13];
        this.f15e = fArr[14];
        this.f16f = fArr[15];
    }

    /* JADX INFO: renamed from: V */
    public final void m0V(float[] fArr) {
        fArr[0] = this.f361Code;
        fArr[1] = this.f9V;
        fArr[2] = this.f6I;
        fArr[3] = this.f10Z;
        fArr[4] = this.f2B;
        fArr[5] = this.f3C;
        fArr[6] = this.f8S;
        fArr[7] = this.f5F;
        fArr[8] = this.f4D;
        fArr[9] = this.f7L;
        fArr[10] = this.f11a;
        fArr[11] = this.f12b;
        fArr[12] = this.f13c;
        fArr[13] = this.f14d;
        fArr[14] = this.f15e;
        fArr[15] = this.f16f;
    }
}
