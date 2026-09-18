package p000;

import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: bd */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0017bd extends C0001ae {

    /* JADX INFO: renamed from: B */
    public float f48B;

    /* JADX INFO: renamed from: C */
    public float f50C;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private byte f411Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public float f412Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public int f413Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public crlV4 f414Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0002ag f415Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0027bx f416Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public boolean f417Code;

    /* JADX INFO: renamed from: D */
    private float f51D;

    /* JADX INFO: renamed from: F */
    private float f52F;

    /* JADX INFO: renamed from: I */
    public float f53I;

    /* JADX INFO: renamed from: I */
    public int f54I;

    /* JADX INFO: renamed from: L */
    private float f55L;

    /* JADX INFO: renamed from: S */
    private float f56S;

    /* JADX INFO: renamed from: V */
    public float f57V;

    /* JADX INFO: renamed from: V */
    public int f58V;

    /* JADX INFO: renamed from: V */
    private crlV4 f59V;

    /* JADX INFO: renamed from: Z */
    public float f60Z;

    /* JADX INFO: renamed from: a */
    private float f62a;

    /* JADX INFO: renamed from: V */
    private static final float[] f47V = {0.02f, 0.0175f, 0.02f};
    private static final int[] Code = {20, 13, 10};

    /* JADX INFO: renamed from: I */
    private static crlV4 f46I = new crlV4();

    /* JADX INFO: renamed from: B */
    private int f49B = 5000;

    /* JADX INFO: renamed from: b */
    private float f63b = Float.MAX_VALUE;

    /* JADX INFO: renamed from: Z */
    private crlV4 f61Z = new crlV4();

    static {
        float[] fArr = {1.0f, 1.0f, 1.05f, 1.05f, 1.1f, 5.5f, 1.2f, 1.0f};
        float[] fArr2 = {0.8f, 0.85f, 0.9f, 0.95f};
        float[] fArr3 = {0.8f, 0.95f, 1.1f, 1.25f};
        float[] fArr4 = {1.2f, 1.15f, 1.1f, 1.05f};
    }

    /* JADX INFO: renamed from: B */
    private void m46B() {
        this.f54I = this.f416Code.f183V + 3;
        if (this.f416Code.m123V() > 0.65f) {
            this.f54I++;
        }
        if (this.f416Code.f478Code == 5 || this.f416Code.f478Code == 6) {
            this.f54I += 2;
        }
        if (this.f416Code.f183V + this.f49B < this.f54I) {
            this.f54I = this.f416Code.f183V + this.f49B;
            if (this.f416Code.Code() < 20.0f) {
                this.f54I--;
            }
        }
        this.f414Code.Code(C0031g.f481Code.Code(C0031g.f481Code.f447Code[0], this.f54I));
        this.f414Code.m10I(this.f59V);
        this.f52F = this.f416Code.f472Code;
        this.f51D = this.f416Code.f182V;
        this.f55L = this.f416Code.f175I;
        this.f62a = (this.f414Code.f362Code * this.f52F) + (this.f414Code.f18V * this.f51D) + (this.f414Code.f17I * this.f55L);
        this.f60Z = crlV4.Code(-0.15f, this.f62a * 0.05f * C0031g.f236a, 0.15f);
        this.f416Code.f195d = (this.f416Code.f195d * 0.3f) + (this.f60Z * 0.7f);
    }

    private boolean Code() {
        int iCode;
        int i = 0;
        this.f415Code.Code();
        this.f417Code = false;
        boolean z = false;
        while (true) {
            int i2 = i;
            if (i2 >= 6) {
                return z;
            }
            if (i2 != this.f416Code.f473Code) {
                C0027bx c0027bxCode = C0031g.f485Code.Code(i2);
                if (this.f416Code.Code() - c0027bxCode.Code() >= 5.0f && (iCode = this.f416Code.Code(c0027bxCode)) >= 0 && iCode <= 5 && (iCode != 0 || this.f416Code.f173F <= c0027bxCode.f173F)) {
                    this.f48B = this.f416Code.f180S - c0027bxCode.f180S;
                    if (Math.abs(this.f48B) <= 100.0f) {
                        this.f50C = crlV4.m6V(this.f416Code.f475Code, c0027bxCode.f475Code);
                        if (this.f50C < 2500.0f) {
                            float f = this.f50C;
                            float f2 = this.f48B;
                            if (f < this.f415Code.f19a) {
                                this.f415Code.f370Code = c0027bxCode;
                                this.f415Code.f19a = f;
                                this.f415Code.Code = f2;
                            }
                            this.f417Code = true;
                            z = true;
                        }
                    }
                }
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: D */
    private void m47D() {
        this.f416Code.f197e = 1.0f;
        this.f416Code.f199f = 0.0f;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m218Code() {
        this.f58V = 1;
        this.f57V = this.f416Code.f201h;
        this.f53I = this.f57V;
        this.f413Code = 0;
        this.f59V.m208Code(0.0f, 0.0f, 0.0f);
        this.f414Code.m208Code(0.0f, 0.0f, 0.0f);
        RunnableC0025bt.f460Code.nextFloat();
    }

    public final void Code(byte b) {
        float f;
        this.f411Code = b;
        switch (b) {
            case 5:
            case 6:
            case 7:
            case 8:
                f = 60.0f;
                this.f49B = 4;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            default:
                this.f49B = 5000;
                f = Float.MAX_VALUE;
                break;
            case 13:
            case 14:
                f = 50.0f;
                this.f49B = 3;
                break;
            case 16:
            case 17:
                f = 40.0f;
                this.f49B = 2;
                break;
        }
        this.f63b = f;
    }

    public final void Code(C0027bx c0027bx) {
        this.f416Code = c0027bx;
        this.f59V = new crlV4();
        this.f414Code = new crlV4();
        new crlV4();
        new crlV4();
        new crlV4();
        new crlV4();
        if (this.f415Code == null) {
            this.f415Code = new C0002ag(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0142 A[PHI: r1
  0x0142: PHI (r1v31 int) = (r1v1 int), (r1v28 int), (r1v0 int), (r1v0 int) binds: [B:66:0x0278, B:60:0x0259, B:40:0x0197, B:31:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0246  */
    /* JADX WARN: Code duplicated, block: B:57:0x024a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0259  */
    /* JADX WARN: Code duplicated, block: B:63:0x026a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0270  */
    @Override // p000.C0001ae
    /* JADX INFO: renamed from: Z */
    public final void mo17Z() {
        float f;
        float f2;
        float f3;
        C0027bx c0027bx;
        float f4;
        boolean z;
        boolean z2;
        boolean z3;
        int i = 1;
        this.f56S = this.f416Code.Code();
        if (C0031g.f251ag != 0) {
            switch (this.f413Code) {
                case 0:
                    m47D();
                    if (this.f56S >= 4.0f) {
                        this.f413Code = i;
                    }
                    break;
                case 1:
                    if (Code()) {
                        i = 4;
                    } else {
                        this.f58V = this.f416Code.f183V;
                        this.f414Code.Code(this.f416Code.f475Code);
                        this.f414Code.m10I(C0031g.f481Code.f447Code[0][this.f58V]);
                        this.f412Code = this.f414Code.Code();
                        this.f59V.Code(this.f416Code.f184V);
                        this.f59V.m206Code();
                        this.f59V.m207Code(this.f412Code);
                        crlV4.Code(this.f59V, this.f416Code.f475Code, this.f59V);
                        m46B();
                        int iM226Code = C0031g.f485Code.Code(0).m226Code();
                        int iM226Code2 = Code[C0031g.Code.f83I] + this.f416Code.m226Code();
                        float f5 = ((iM226Code - iM226Code2) * f47V[C0031g.Code.f83I]) + 1.0f;
                        this.f53I = C0031g.f485Code.Code(0).f201h * f5;
                        if (iM226Code2 >= iM226Code) {
                            f = C0031g.f485Code.Code(0).f201h;
                        } else {
                            f5 = 10.0f;
                            f = C0031g.f485Code.Code(0).f201h;
                        }
                        this.f53I = f * f5;
                        if (this.f53I < 20.0f) {
                            f2 = 20.0f;
                        } else if (this.f53I > this.f63b) {
                            f2 = this.f63b;
                        } else {
                            f3 = this.f53I - this.f56S;
                            if (f3 >= -1.0f) {
                                if (f3 > 1.0f) {
                                    this.f416Code.f199f = 0.0f;
                                    m47D();
                                } else {
                                    c0027bx = this.f416Code;
                                    f4 = 0.0f;
                                }
                                if (this.f56S < 4.0f) {
                                    i = 0;
                                }
                            } else {
                                this.f416Code.f197e = 0.0f;
                                c0027bx = this.f416Code;
                                f4 = 1.0f;
                            }
                            c0027bx.f199f = f4;
                            if (this.f56S < 4.0f) {
                                i = 0;
                            }
                        }
                        this.f53I = f2;
                        f3 = this.f53I - this.f56S;
                        if (f3 >= -1.0f) {
                            if (f3 > 1.0f) {
                                this.f416Code.f199f = 0.0f;
                                m47D();
                            } else {
                                c0027bx = this.f416Code;
                                f4 = 0.0f;
                            }
                            if (this.f56S < 4.0f) {
                                i = 0;
                            }
                        } else {
                            this.f416Code.f197e = 0.0f;
                            c0027bx = this.f416Code;
                            f4 = 1.0f;
                        }
                        c0027bx.f199f = f4;
                        if (this.f56S < 4.0f) {
                            i = 0;
                        }
                    }
                    this.f413Code = i;
                    break;
                case 4:
                    if (this.f417Code && this.f415Code.f370Code != null) {
                        C0002ag c0002ag = this.f415Code;
                        boolean z4 = c0002ag.Code < 0.0f;
                        if (c0002ag.f370Code.f180S < -250.0f) {
                            z = true;
                            z2 = false;
                            z4 = false;
                        } else if (c0002ag.f370Code.f180S > 250.0f) {
                            z = false;
                            z2 = true;
                            z4 = true;
                        } else {
                            z = true;
                            z2 = true;
                        }
                        switch (this.f411Code) {
                            case 1:
                            case 5:
                            case 13:
                            case 16:
                                z2 = false;
                                break;
                            case 2:
                            case 6:
                            case 14:
                            case 17:
                                z = false;
                                break;
                        }
                        if (!z2 || !z) {
                            z3 = z;
                        } else if (z4) {
                            z3 = false;
                        } else {
                            z3 = z;
                            z2 = false;
                        }
                        if (z3) {
                            this.f61Z.Code(c0002ag.f370Code.f475Code);
                            crlV4 crlv4 = C0031g.f481Code.f123V[c0002ag.f370Code.f183V];
                            f46I.m208Code(crlv4.f17I, crlv4.f18V, -crlv4.f362Code);
                            this.f61Z.m13V(f46I.f362Code * 5.0f, f46I.f18V * 5.0f, f46I.f17I * 5.0f);
                        } else if (z2) {
                            this.f61Z.Code(c0002ag.f370Code.f475Code);
                            crlV4 crlv5 = C0031g.f481Code.f123V[c0002ag.f370Code.f183V];
                            f46I.m208Code(crlv5.f17I, crlv5.f18V, -crlv5.f362Code);
                            this.f61Z.m9I(f46I.f362Code * 5.0f, f46I.f18V * 5.0f, f46I.f17I * 5.0f);
                        } else {
                            m46B();
                        }
                        this.f414Code.Code(this.f416Code.f475Code);
                        this.f414Code.m10I(this.f61Z);
                        this.f412Code = this.f414Code.Code();
                        this.f59V.Code(this.f416Code.f184V);
                        this.f59V.m206Code();
                        this.f59V.m207Code(this.f412Code);
                        this.f59V.m14V(this.f416Code.f475Code);
                        this.f61Z.m10I(this.f59V);
                        this.f52F = this.f416Code.f472Code;
                        this.f51D = this.f416Code.f182V;
                        this.f55L = this.f416Code.f175I;
                        this.f62a = (this.f414Code.f362Code * this.f52F) + (this.f414Code.f18V * this.f51D) + (this.f414Code.f17I * this.f55L);
                        this.f60Z = crlV4.Code(-0.15f, this.f62a * 0.15f * C0031g.f236a, 0.15f);
                        this.f416Code.f195d = (this.f416Code.f195d * 0.3f) + (this.f60Z * 0.7f);
                    }
                    if (!Code()) {
                        this.f413Code = i;
                    }
                    break;
            }
            this.f416Code.f197e = crlV4.Code(0.0f, this.f416Code.f197e, 1.0f);
            this.f416Code.f199f = crlV4.Code(0.0f, this.f416Code.f199f, 1.0f);
            this.f416Code.f195d = crlV4.Code(-1.0f, this.f416Code.f195d, 1.0f);
        }
    }
}
