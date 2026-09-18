package p000;

import Coral.Math.Float.crlM44;
import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: be */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class C0018be extends C0001ae {
    private static final float[][] Code = {new float[]{-270.0f, -2.0f, -100.0f}, new float[]{481.0f, -2.0f, 366.0f}, new float[]{-301.0f, -2.0f, -52.0f}, new float[]{-572.0f, -5.0f, -63.0f}, new float[]{-419.0f, 16.0f, 363.0f}, new float[]{-511.0f, -2.0f, 181.0f}, new float[]{632.0f, -2.0f, 345.0f}, new float[]{-515.0f, -10.0f, -155.0f}, new float[]{215.0f, 12.0f, 291.0f}};

    /* JADX INFO: renamed from: B */
    private crlV4 f64B;

    /* JADX INFO: renamed from: C */
    private crlV4 f65C;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private crlM44 f418Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public crlV4 f419Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0027bx f420Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public float[] f421Code;

    /* JADX INFO: renamed from: F */
    private crlV4 f66F;

    /* JADX INFO: renamed from: I */
    private crlV4 f67I;

    /* JADX INFO: renamed from: I */
    private boolean f68I;

    /* JADX INFO: renamed from: S */
    private crlV4 f69S;

    /* JADX INFO: renamed from: V */
    public crlV4 f70V;

    /* JADX INFO: renamed from: Z */
    private crlV4 f71Z;

    /* JADX INFO: renamed from: Z */
    private boolean f72Z;

    public C0018be() {
    }

    public C0018be(boolean z) {
        this();
    }

    public static boolean Code(crlV4 crlv4, crlV4 crlv5, crlV4 crlv6, crlV4 crlv7, crlV4 crlv8) {
        float f = crlv6.f362Code - crlv5.f362Code;
        float f2 = crlv6.f18V - crlv5.f18V;
        float f3 = crlv6.f17I - crlv5.f17I;
        float f4 = crlv7.f362Code - crlv5.f362Code;
        float f5 = crlv7.f18V - crlv5.f18V;
        float f6 = (f5 * f) - (f2 * f4);
        float f7 = crlv7.f17I - crlv5.f17I;
        float f8 = (f3 * f4) - (f * f7);
        float f9 = crlv4.f362Code - crlv5.f362Code;
        float f10 = (crlv4.f18V - crlv5.f18V) + 1000.0f;
        float f11 = (f2 * f7) - (f3 * f5);
        float f12 = crlv4.f17I - crlv5.f17I;
        float f13 = (f9 * f11) + ((f10 - 2000.0f) * f8) + (f12 * f6);
        float f14 = (f12 * f6) + (f9 * f11) + (f10 * f8);
        float f15 = f14 - f13;
        crlv8.f362Code = crlV4.m4V(((crlv4.f362Code * f14) - (crlv4.f362Code * f13)) / f15);
        crlv8.f18V = crlV4.m4V((((crlv4.f18V - 1000.0f) * f14) - ((crlv4.f18V + 1000.0f) * f13)) / f15);
        crlv8.f17I = crlV4.m4V(((f14 * crlv4.f17I) - (crlv4.f17I * f13)) / f15);
        if ((((f5 * f6) - (f7 * f8)) * (crlv8.f362Code - crlv5.f362Code)) + (((f7 * f11) - (f4 * f6)) * (crlv8.f18V - crlv5.f18V)) + (((f4 * f8) - (f5 * f11)) * (crlv8.f17I - crlv5.f17I)) >= 0.0f) {
            float f16 = crlv6.f362Code - crlv7.f362Code;
            float f17 = crlv6.f18V - crlv7.f18V;
            float f18 = crlv6.f17I - crlv7.f17I;
            if ((((f16 * f8) - (f17 * f11)) * (crlv8.f17I - crlv7.f17I)) + (((f18 * f11) - (f16 * f6)) * (crlv8.f18V - crlv7.f18V)) + (((f17 * f6) - (f18 * f8)) * (crlv8.f362Code - crlv7.f362Code)) >= 0.0f) {
                float f19 = crlv5.f362Code - crlv6.f362Code;
                float f20 = crlv5.f18V - crlv6.f18V;
                float f21 = crlv5.f17I - crlv6.f17I;
                if ((((f8 * f19) - (f11 * f20)) * (crlv8.f17I - crlv6.f17I)) + (((f21 * f11) - (f6 * f19)) * (crlv8.f18V - crlv6.f18V)) + (((f20 * f6) - (f21 * f8)) * (crlv8.f362Code - crlv6.f362Code)) >= 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Code(C0035p c0035p, C0035p c0035p2) {
        float f = c0035p.f333S;
        float f2 = c0035p.f329D;
        float f3 = c0035p.f330F;
        float f4 = c0035p.f332L;
        float f5 = c0035p.f337b;
        float f6 = c0035p.f336a;
        float f7 = c0035p.f338c;
        float f8 = c0035p.f340e;
        float f9 = c0035p.f339d;
        float f10 = c0035p2.f333S;
        float f11 = c0035p2.f329D;
        float f12 = c0035p2.f330F;
        float f13 = c0035p2.f332L;
        float f14 = c0035p2.f337b;
        float f15 = c0035p2.f336a;
        float f16 = c0035p2.f338c;
        float f17 = c0035p2.f340e;
        float f18 = c0035p2.f339d;
        float f19 = c0035p.f335Z;
        float f20 = c0035p.f327B;
        float f21 = c0035p.f328C;
        float f22 = c0035p2.f335Z;
        float f23 = c0035p2.f327B;
        float f24 = (f * f10) + (f2 * f11) + (f3 * f12);
        float f25 = c0035p2.f328C;
        float f26 = c0035p2.Code - c0035p.Code;
        float f27 = c0035p2.f334V - c0035p.f334V;
        float f28 = (f26 * f7) + (f27 * f8);
        float f29 = c0035p2.f331I - c0035p.f331I;
        float f30 = (f29 * f3) + (f26 * f) + (f27 * f2);
        float f31 = (f29 * f6) + (f26 * f4) + (f27 * f5);
        float f32 = (f29 * f9) + f28;
        float f33 = (f * f16) + (f2 * f17) + (f3 * f18);
        float f34 = (f * f13) + (f2 * f14) + (f3 * f15);
        float f35 = (f24 >= 0.0f ? f24 : -f24) + 0.1f;
        float f36 = (f34 >= 0.0f ? f34 : -f34) + 0.1f;
        float f37 = (f33 >= 0.0f ? f33 : -f33) + 0.1f;
        if ((f30 >= 0.0f ? f30 : -f30) <= (f25 * f37) + (f22 * f35) + f19 + (f23 * f36)) {
            float f38 = (f4 * f16) + (f5 * f17) + (f6 * f18);
            float f39 = (f4 * f13) + (f5 * f14) + (f6 * f15);
            float f40 = (f4 * f10) + (f5 * f11) + (f6 * f12);
            float f41 = (f40 >= 0.0f ? f40 : -f40) + 0.1f;
            float f42 = (f39 < 0.0f ? -f39 : f39) + 0.1f;
            float f43 = (f38 >= 0.0f ? f38 : -f38) + 0.1f;
            if ((f31 < 0.0f ? -f31 : f31) <= (f25 * f43) + (f22 * f41) + f20 + (f23 * f42)) {
                float f44 = (f7 * f10) + (f8 * f11) + (f9 * f12);
                float f45 = (f7 * f13) + (f8 * f14) + (f9 * f15);
                float f46 = (f9 * f18) + (f7 * f16) + (f8 * f17);
                float f47 = 0.1f + (f44 < 0.0f ? -f44 : f44);
                float f48 = 0.1f + (f45 >= 0.0f ? f45 : -f45);
                float f49 = 0.1f + (f46 >= 0.0f ? f46 : -f46);
                if ((f32 >= 0.0f ? f32 : -f32) <= (f25 * f49) + (f22 * f47) + f21 + (f23 * f48)) {
                    float f50 = (f30 * f24) + (f31 * f40) + (f32 * f44);
                    float f51 = (f19 * f35) + (f20 * f41) + (f21 * f47) + f22;
                    if (f50 < 0.0f) {
                        f50 = -f50;
                    }
                    if (f50 <= f51) {
                        float f52 = (f30 * f34) + (f31 * f39) + (f32 * f45);
                        float f53 = (f19 * f36) + (f20 * f42) + (f21 * f48) + f23;
                        if (f52 < 0.0f) {
                            f52 = -f52;
                        }
                        if (f52 <= f53) {
                            float f54 = (f19 * f37) + (f20 * f43) + (f21 * f49) + f25;
                            float f55 = (f30 * f33) + (f31 * f38) + (f32 * f46);
                            if (f55 < 0.0f) {
                                f55 = -f55;
                            }
                            if (f55 <= f54) {
                                float f56 = (f25 * f36) + (f20 * f47) + (f21 * f41) + (f23 * f37);
                                float f57 = (f32 * f40) - (f31 * f44);
                                if (f57 < 0.0f) {
                                    f57 = -f57;
                                }
                                if (f57 <= f56) {
                                    float f58 = (f32 * f39) - (f31 * f45);
                                    float f59 = (f20 * f48) + (f21 * f42) + (f22 * f37) + (f25 * f35);
                                    if (f58 < 0.0f) {
                                        f58 = -f58;
                                    }
                                    if (f58 <= f59) {
                                        float f60 = (f32 * f38) - (f31 * f46);
                                        float f61 = (f20 * f49) + (f21 * f43) + (f22 * f36) + (f23 * f35);
                                        if (f60 < 0.0f) {
                                            f60 = -f60;
                                        }
                                        if (f60 <= f61) {
                                            float f62 = (f30 * f44) - (f32 * f24);
                                            float f63 = (f19 * f47) + (f21 * f35) + (f23 * f43) + (f25 * f42);
                                            if (f62 < 0.0f) {
                                                f62 = -f62;
                                            }
                                            if (f62 <= f63) {
                                                float f64 = (f25 * f41) + (f19 * f48) + (f21 * f36) + (f22 * f43);
                                                float f65 = (f30 * f45) - (f32 * f34);
                                                if (f65 < 0.0f) {
                                                    f65 = -f65;
                                                }
                                                if (f65 <= f64) {
                                                    float f66 = (f30 * f46) - (f32 * f33);
                                                    float f67 = (f19 * f49) + (f21 * f37) + (f22 * f42) + (f23 * f41);
                                                    if (f66 < 0.0f) {
                                                        f66 = -f66;
                                                    }
                                                    if (f66 <= f67) {
                                                        float f68 = (f31 * f24) - (f30 * f40);
                                                        float f69 = (f19 * f41) + (f20 * f35) + (f23 * f49) + (f25 * f48);
                                                        if (f68 < 0.0f) {
                                                            f68 = -f68;
                                                        }
                                                        if (f68 <= f69) {
                                                            float f70 = (f25 * f47) + (f19 * f42) + (f20 * f36) + (f22 * f49);
                                                            float f71 = (f31 * f34) - (f30 * f39);
                                                            if (f71 < 0.0f) {
                                                                f71 = -f71;
                                                            }
                                                            if (f71 <= f70) {
                                                                float f72 = (f23 * f47) + (f19 * f43) + (f20 * f37) + (f22 * f48);
                                                                float f73 = (f31 * f33) - (f30 * f38);
                                                                if (f73 < 0.0f) {
                                                                    f73 = -f73;
                                                                }
                                                                if (f73 <= f72) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m48V(crlV4 crlv4, crlV4 crlv5, crlV4 crlv6, crlV4 crlv7, crlV4 crlv8) {
        float f = crlv6.f362Code - crlv5.f362Code;
        float f2 = crlv6.f17I - crlv5.f17I;
        float f3 = crlv7.f362Code - crlv5.f362Code;
        float f4 = crlv7.f17I - crlv5.f17I;
        float f5 = (f2 * f3) - (f * f4);
        float f6 = (-1000.0f) * f5;
        float f7 = 1000.0f * f5;
        float f8 = f7 - f6;
        crlv8.f362Code = ((crlv4.f362Code * f7) - (crlv4.f362Code * f6)) / f8;
        crlv8.f18V = (((-1000.0f) * f7) - (1000.0f * f6)) / f8;
        crlv8.f17I = ((f7 * crlv4.f17I) - (f6 * crlv4.f17I)) / f8;
        if (((-(f4 * f5)) * (crlv8.f362Code - crlv5.f362Code)) + (f3 * f5 * (crlv8.f17I - crlv5.f17I)) >= 0.0f) {
            float f9 = (crlv6.f362Code - crlv7.f362Code) * f5;
            if ((f9 * (crlv8.f17I - crlv7.f17I)) + ((-((crlv6.f17I - crlv7.f17I) * f5)) * (crlv8.f362Code - crlv7.f362Code)) >= 0.0f) {
                if (((-(f5 * (crlv5.f17I - crlv6.f17I))) * (crlv8.f362Code - crlv6.f362Code)) + ((crlv5.f362Code - crlv6.f362Code) * f5 * (crlv8.f17I - crlv6.f17I)) >= 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public void m49B() {
        this.f68I = !this.f68I;
        C0007ao.Code(!this.f68I ? -0.25f : -0.15f);
    }

    /* JADX INFO: renamed from: C */
    public void m50C() {
        this.f72Z = true;
        this.f68I = true;
        m49B();
    }

    public void Code() {
        this.f419Code = new crlV4();
        this.f67I = new crlV4(0.0f, 10.0f, 20.0f);
        this.f64B = new crlV4();
        this.f71Z = new crlV4();
        this.f70V = new crlV4();
        this.f65C = new crlV4();
        this.f66F = new crlV4();
        this.f69S = new crlV4(0.0f, 1.0f, 0.0f);
        m51I();
    }

    public void Code(float f, float f2, float f3) {
        this.f67I.m208Code(f, f2, f3);
    }

    public void Code(C0027bx c0027bx) {
        this.f420Code = c0027bx;
        this.f418Code = c0027bx.f474Code;
    }

    /* JADX INFO: renamed from: I */
    public void m51I() {
        this.f64B.m208Code(0.0f, 0.0f, 0.0f);
        this.f72Z = false;
        this.f68I = true;
        m49B();
    }

    @Override // p000.C0001ae
    /* JADX INFO: renamed from: V */
    public void mo16V() {
        this.f418Code = null;
        this.f419Code = null;
        this.f67I = null;
        this.f66F = null;
        this.f64B = null;
        this.f65C = null;
        this.f69S = null;
        this.f420Code = null;
    }

    /* JADX INFO: renamed from: V */
    public void m52V(float f, float f2, float f3) {
        this.f65C.m208Code(f, f2, f3);
    }

    @Override // p000.C0001ae
    /* JADX INFO: renamed from: Z */
    public void mo17Z() {
        if (this.f68I) {
            this.f64B.m208Code(this.f418Code.f10Z, this.f418Code.f5F + 1.75f, this.f418Code.f12b);
            this.f64B.m13V(this.f418Code.f6I * 2.5f, 0.0f, this.f418Code.f11a * 2.5f);
            this.f419Code.f362Code = this.f64B.f362Code + (this.f418Code.f6I * 10.0f);
            this.f419Code.f17I = this.f64B.f17I + (this.f418Code.f11a * 10.0f);
            this.f419Code.f18V = crlV4.m5V(0.35f, this.f419Code.f18V, this.f64B.f18V + (this.f418Code.f8S * 20.0f));
        } else {
            this.f70V.m208Code(this.f418Code.f10Z, this.f418Code.f5F, this.f418Code.f12b);
            this.f66F.m208Code(this.f418Code.f6I, this.f418Code.f8S, this.f418Code.f11a);
            this.f66F.m207Code(this.f67I.f17I);
            this.f70V.m14V(this.f66F);
            this.f66F.m208Code(this.f418Code.f361Code, this.f418Code.f2B, this.f418Code.f4D);
            this.f66F.m207Code(this.f67I.f362Code);
            this.f70V.m14V(this.f66F);
            this.f66F.m208Code(this.f418Code.f9V, this.f418Code.f3C, this.f418Code.f7L);
            this.f66F.m207Code(this.f67I.f18V);
            this.f70V.m14V(this.f66F);
            this.f71Z.m208Code(this.f418Code.f10Z, this.f418Code.f5F, this.f418Code.f12b);
            this.f66F.m208Code(this.f418Code.f6I, this.f418Code.f8S, this.f418Code.f11a);
            this.f66F.m207Code(this.f65C.f17I);
            this.f71Z.m14V(this.f66F);
            this.f66F.m208Code(this.f418Code.f361Code, this.f418Code.f2B, this.f418Code.f4D);
            this.f66F.m207Code(this.f65C.f362Code);
            this.f71Z.m14V(this.f66F);
            this.f66F.m208Code(this.f418Code.f9V, this.f418Code.f3C, this.f418Code.f7L);
            this.f66F.m207Code(this.f65C.f18V);
            this.f71Z.m14V(this.f66F);
            if (this.f64B.f362Code == 0.0f && this.f64B.f18V == 0.0f && this.f64B.f17I == 0.0f) {
                this.f64B.Code(this.f71Z);
            } else {
                this.f64B.f362Code = crlV4.m5V(0.35f, this.f64B.f362Code, this.f71Z.f362Code);
                this.f64B.f18V = crlV4.m5V(0.8f, this.f64B.f18V, this.f71Z.f18V);
                this.f64B.f17I = crlV4.m5V(0.35f, this.f64B.f17I, this.f71Z.f17I);
                this.f66F.m208Code(this.f64B.f362Code - this.f418Code.f10Z, this.f64B.f17I - this.f418Code.f12b, 0.0f);
                this.f66F.m11V();
                this.f66F.m12V(-this.f65C.f17I);
                this.f64B.f362Code = this.f418Code.f10Z + this.f66F.f362Code;
                this.f64B.f17I = this.f418Code.f12b + this.f66F.f18V;
            }
            this.f419Code.Code(this.f70V);
        }
        if (this.f72Z) {
            this.f64B.m208Code(Code[C0031g.Code.f76B][0], Code[C0031g.Code.f76B][1], Code[C0031g.Code.f76B][2]);
        }
        crlM44.Code(this.f421Code, this.f64B, this.f419Code, this.f69S);
    }
}
