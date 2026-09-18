package p000;

import Coral.Math.Float.crlM44;
import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: bx */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0027bx implements InterfaceC0009ar {

    /* JADX INFO: renamed from: B */
    public static int f162B;
    private static byte Code;

    /* JADX INFO: renamed from: B */
    public float f165B;

    /* JADX INFO: renamed from: B */
    public boolean f167B;

    /* JADX INFO: renamed from: C */
    public float f168C;

    /* JADX INFO: renamed from: C */
    private int f169C;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public float f472Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public int f473Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public crlM44 f474Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public crlV4 f475Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0007ao f476Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0035p f477Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public short f478Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public boolean f479Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private float[] f480Code;

    /* JADX INFO: renamed from: D */
    public float f171D;

    /* JADX INFO: renamed from: D */
    private crlV4 f172D;

    /* JADX INFO: renamed from: F */
    public float f173F;

    /* JADX INFO: renamed from: F */
    private crlV4 f174F;

    /* JADX INFO: renamed from: I */
    public float f175I;

    /* JADX INFO: renamed from: I */
    public int f176I;

    /* JADX INFO: renamed from: L */
    public float f178L;

    /* JADX INFO: renamed from: L */
    private crlV4 f179L;

    /* JADX INFO: renamed from: S */
    public float f180S;

    /* JADX INFO: renamed from: V */
    public float f182V;

    /* JADX INFO: renamed from: V */
    public int f183V;

    /* JADX INFO: renamed from: V */
    public crlV4 f184V;

    /* JADX INFO: renamed from: Z */
    public float f186Z;

    /* JADX INFO: renamed from: Z */
    public int f187Z;

    /* JADX INFO: renamed from: Z */
    public boolean f188Z;

    /* JADX INFO: renamed from: a */
    public float f189a;

    /* JADX INFO: renamed from: a */
    private crlV4 f190a;

    /* JADX INFO: renamed from: b */
    public float f191b;

    /* JADX INFO: renamed from: b */
    private crlV4 f192b;

    /* JADX INFO: renamed from: c */
    public float f193c;

    /* JADX INFO: renamed from: c */
    private crlV4 f194c;

    /* JADX INFO: renamed from: d */
    public float f195d;

    /* JADX INFO: renamed from: e */
    public float f197e;

    /* JADX INFO: renamed from: e */
    private crlV4 f198e;

    /* JADX INFO: renamed from: f */
    public float f199f;

    /* JADX INFO: renamed from: g */
    public float f200g;

    /* JADX INFO: renamed from: h */
    public float f201h;

    /* JADX INFO: renamed from: i */
    public float f202i;

    /* JADX INFO: renamed from: j */
    private float f203j;

    /* JADX INFO: renamed from: k */
    private float f204k;

    /* JADX INFO: renamed from: l */
    private float f205l;

    /* JADX INFO: renamed from: m */
    private float f206m;

    /* JADX INFO: renamed from: n */
    private float f207n;

    /* JADX INFO: renamed from: o */
    private float f208o;

    /* JADX INFO: renamed from: p */
    private float f209p;

    /* JADX INFO: renamed from: q */
    private float f210q;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static final float[][] f471Code = {new float[]{0.2185f, 0.1875f, 0.15625f, 0.125f, 0.09375f, 0.0625f, 0.0625f, 0.1875f}, new float[]{0.19675f, 0.16875f, 0.140625f, 0.1125f, 0.084375f, 0.05625f, 0.05625f, 0.16875f}, new float[]{0.175f, 0.15f, 0.125f, 0.1f, 0.075f, 0.05f, 0.05f, 0.15f}};

    /* JADX INFO: renamed from: I */
    public static crlV4 f163I = new crlV4();

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static crlV4[] f468Code = {new crlV4(), new crlV4(), new crlV4(), new crlV4()};

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static boolean[] f470Code = {false, false, false, false};

    /* JADX INFO: renamed from: Z */
    public static crlV4 f164Z = new crlV4();

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static C0040z[] f469Code = new C0040z[1];

    /* JADX INFO: renamed from: V */
    public boolean f185V = true;

    /* JADX INFO: renamed from: I */
    public boolean f177I = true;

    /* JADX INFO: renamed from: B */
    private crlV4 f166B = new crlV4();

    /* JADX INFO: renamed from: C */
    private crlV4 f170C = new crlV4();

    /* JADX INFO: renamed from: S */
    private crlV4 f181S = new crlV4();

    /* JADX INFO: renamed from: d */
    private crlV4 f196d = new crlV4();

    private void Code(crlM44 crlm44, float f) {
        float fSin = (float) Math.sin(f);
        float fCos = (float) Math.cos(f);
        this.f480Code[0] = (crlm44.f361Code * fCos) + (crlm44.f6I * (-fSin));
        this.f480Code[1] = crlm44.f9V;
        this.f480Code[2] = (crlm44.f361Code * fSin) + (crlm44.f6I * fCos);
        this.f480Code[3] = crlm44.f10Z;
        this.f480Code[4] = (crlm44.f2B * fCos) + (crlm44.f8S * (-fSin));
        this.f480Code[5] = crlm44.f3C;
        this.f480Code[6] = (crlm44.f2B * fSin) + (crlm44.f8S * fCos);
        this.f480Code[7] = crlm44.f5F;
        this.f480Code[8] = (crlm44.f4D * fCos) + (crlm44.f11a * (-fSin));
        this.f480Code[9] = crlm44.f7L;
        this.f480Code[10] = (fSin * crlm44.f4D) + (fCos * crlm44.f11a);
        this.f480Code[11] = crlm44.f12b;
        this.f474Code.Code(this.f480Code);
    }

    private void Code(crlM44 crlm44, float f, float f2) {
        crlm44.f10Z += crlV4.m1I((this.f186Z * f2) + (this.f168C * f));
        crlm44.f12b += crlV4.m1I((this.f472Code * f2) + (this.f175I * f));
    }

    private static final void Code(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    private static boolean Code(crlV4 crlv4, int i, crlV4 crlv5) {
        crlV4 crlv6;
        crlV4[] crlv4Arr;
        int i2;
        int i3 = 1;
        boolean z = false;
        while (!z && i3 < 5) {
            int i4 = i << 1;
            crlV4 crlv7 = C0031g.f481Code.f446Code[i4];
            crlV4 crlv8 = C0031g.f481Code.f446Code[i4 + 1];
            if (i4 + 2 < C0031g.f481Code.f121V) {
                i2 = i4 + 3;
                crlv6 = C0031g.f481Code.f446Code[i4 + 2];
                crlv4Arr = C0031g.f481Code.f446Code;
            } else {
                crlv6 = C0031g.f481Code.f446Code[0];
                crlv4Arr = C0031g.f481Code.f446Code;
                i2 = 1;
            }
            z = C0018be.Code(crlv4, crlv7, crlv8, crlv6, crlv5) || C0018be.Code(crlv4, crlv6, crlv8, crlv4Arr[i2], crlv5);
            i += i3;
            i3 = i3 <= 0 ? (-i3) + 1 : -(i3 + 1);
            if (i < 0) {
                i += C0031g.f481Code.f442Code;
            } else if (i >= C0031g.f481Code.f442Code) {
                i -= C0031g.f481Code.f442Code;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: F */
    private final void m119F() {
        this.f472Code = this.f474Code.f361Code;
        this.f182V = this.f474Code.f2B;
        this.f175I = this.f474Code.f4D;
        this.f186Z = this.f474Code.f6I;
        this.f165B = this.f474Code.f8S;
        this.f168C = this.f474Code.f11a;
    }

    /* JADX INFO: renamed from: S */
    private void m120S() {
        this.f475Code.f362Code = this.f474Code.f10Z;
        this.f475Code.f18V = this.f474Code.f5F;
        this.f475Code.f17I = this.f474Code.f12b;
    }

    /* JADX INFO: renamed from: V */
    private void m121V(crlM44 crlm44) {
        this.f477Code.f333S = crlm44.f361Code;
        this.f477Code.f329D = crlm44.f2B;
        this.f477Code.f330F = crlm44.f4D;
        this.f477Code.f332L = crlm44.f9V;
        this.f477Code.f337b = crlm44.f3C;
        this.f477Code.f336a = crlm44.f7L;
        this.f477Code.f338c = crlm44.f6I;
        this.f477Code.f340e = crlm44.f8S;
        this.f477Code.f339d = crlm44.f11a;
        this.f477Code.Code = crlm44.f10Z;
        this.f477Code.f334V = crlm44.f5F;
        this.f477Code.f331I = crlm44.f12b;
    }

    /* JADX INFO: renamed from: Z */
    private final void m122Z() {
        try {
            this.f187Z = this.f183V << 1;
            this.f174F = C0031g.f481Code.f446Code[this.f187Z];
            this.f172D = C0031g.f481Code.f446Code[this.f187Z + 1];
            if (this.f187Z + 2 >= C0031g.f481Code.f121V) {
                this.f179L = C0031g.f481Code.f446Code[0];
                this.f190a = C0031g.f481Code.f446Code[1];
            } else {
                this.f179L = C0031g.f481Code.f446Code[this.f187Z + 2];
                this.f190a = C0031g.f481Code.f446Code[this.f187Z + 3];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            new StringBuffer().append("quadpoints - mSegIDx2 = ").append(this.f187Z).toString();
            if (C0031g.f481Code.f446Code != null) {
                new StringBuffer().append("trackquads len = ").append(C0031g.f481Code.f446Code.length).toString();
            }
            throw e;
        }
    }

    public final float Code() {
        if (this.f200g < 0.0f) {
            return 0.0f;
        }
        return this.f200g;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final int m226Code() {
        return (C0031g.Code.f434Code[this.f473Code] != 1 || this.f177I || this.f183V <= C0031g.f481Code.f442Code + (-10)) ? this.f183V + ((C0031g.Code.f434Code[this.f473Code] - 1) * C0031g.f481Code.f442Code) : this.f183V - C0031g.f481Code.f442Code;
    }

    public final int Code(C0027bx c0027bx) {
        int i = c0027bx.f183V - this.f183V;
        if (i <= (C0031g.f481Code.f442Code >> 1)) {
            return i < (-(C0031g.f481Code.f442Code >> 1)) ? i + C0031g.f481Code.f442Code : i;
        }
        return i - C0031g.f481Code.f442Code;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m227Code() {
        this.f190a = null;
        this.f179L = null;
        this.f172D = null;
        this.f174F = null;
        this.f198e = null;
        this.f184V = null;
        this.f477Code = null;
        this.f475Code = null;
        this.f480Code = null;
        this.f474Code = null;
        this.f476Code = null;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:126:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:134:0x0690  */
    /* JADX WARN: Code duplicated, block: B:136:0x0696  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d9  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01db, code lost:
    
        if (r11.f167B != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Code(float r12) {
        /*
            Method dump skipped, instruction units count: 2103
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0027bx.Code(float):void");
    }

    public final void Code(float f, float f2, float f3) {
        this.f477Code.Code = f;
        this.f477Code.f334V = f2;
        this.f477Code.f331I = f3;
    }

    public final void Code(int i) {
        this.f204k = C0031g.f495Code[C0031g.Code.f80C][4];
        this.f207n = C0031g.f495Code[C0031g.Code.f80C][7];
        this.f206m = C0031g.f495Code[C0031g.Code.f80C][6];
        this.f205l = C0031g.f495Code[C0031g.Code.f80C][5];
        this.f201h = C0031g.f495Code[i][8];
        this.f208o = C0031g.f495Code[i][0];
        this.f209p = C0031g.f495Code[i][1];
        this.f210q = C0031g.f495Code[i][3];
        if (this.f473Code != 0) {
            this.f207n = ((RunnableC0025bt.f460Code.nextFloat() * 0.3f) + 0.95f) * this.f207n;
            this.f204k = ((RunnableC0025bt.f460Code.nextFloat() * 0.3f) + 0.95f) * this.f204k;
            this.f206m = ((RunnableC0025bt.f460Code.nextFloat() * 0.3f) + 0.95f) * this.f206m;
            this.f205l = ((RunnableC0025bt.f460Code.nextFloat() * 0.3f) + 0.95f) * this.f205l;
            RunnableC0025bt.f460Code.nextFloat();
            this.f201h = 1000.0f;
        }
        float f = this.f209p * 1.2f;
        float f2 = this.f208o * 1.2f;
        this.f477Code.f335Z = f;
        this.f477Code.f327B = 0.0f;
        this.f477Code.f328C = f2;
        this.f203j = 1.0f / (C0031g.f495Code[i][8] * 0.447f);
    }

    public final void Code(crlV4 crlv4, float f) {
        this.f474Code.Code();
        float f2 = crlv4.f362Code;
        float f3 = crlv4.f18V;
        float f4 = crlv4.f17I;
        this.f474Code.f10Z = f2;
        this.f474Code.f5F = f3;
        this.f474Code.f12b = f4;
        this.f475Code.f362Code = f2;
        this.f475Code.f18V = f3;
        this.f475Code.f17I = f4;
        Code(this.f474Code, (float) Math.toRadians(f));
        m120S();
        m119F();
        Code(this.f475Code.f362Code, this.f475Code.f18V, this.f475Code.f17I);
        m121V(this.f474Code);
    }

    public final void Code(InterfaceC0009ar interfaceC0009ar) {
        this.f476Code.Code((Object) interfaceC0009ar);
    }

    public final void Code(C0022bm c0022bm) {
        this.f473Code = c0022bm.f127V;
        this.f474Code = new crlM44();
        this.f480Code = new float[16];
        this.f475Code = new crlV4();
        this.f477Code = new C0035p();
        this.f184V = new crlV4();
        this.f194c = new crlV4();
        this.f198e = new crlV4();
        this.f192b = new crlV4();
        this.f174F = new crlV4(-1.0f, 1.0f, 2.0f);
        this.f172D = new crlV4(-1.0f, 1.0f, -1.0f);
        this.f179L = new crlV4(2.0f, 1.0f, -1.0f);
        this.f190a = new crlV4(-1.0f, 1.0f, -1.0f);
        this.f169C = -1;
        this.f195d = 0.0f;
        this.f197e = 0.0f;
        this.f199f = 0.0f;
        this.f200g = 0.0f;
        Code(this.f480Code);
        this.f474Code.Code(c0022bm.f450Code);
        m120S();
        this.f476Code = new C0007ao(3, 1);
        this.f478Code = (short) 0;
        f162B = 0;
        Code((InterfaceC0009ar) this);
    }

    @Override // p000.InterfaceC0009ar
    public final void Code(C0040z c0040z) {
        if (c0040z.Code() == 3) {
            this.f478Code = ((C0016bb) c0040z).Code;
            new StringBuffer().append("id ").append(this.f473Code).append(" setting road to ").append((int) this.f478Code).toString();
        }
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final boolean m228Code(C0027bx c0027bx) {
        int iAbs = Math.abs(this.f183V - c0027bx.f183V);
        return (iAbs < 3 || iAbs > C0031g.f481Code.f442Code + (-4)) && crlV4.m2I(this.f475Code, c0027bx.f475Code) < 27.0f;
    }

    /* JADX INFO: renamed from: V */
    public final float m123V() {
        float fCode = Code() * this.f203j;
        if (fCode > 1.0f) {
            return 1.0f;
        }
        if (fCode < 1.0E-6f) {
            return 0.0f;
        }
        return fCode;
    }

    /* JADX INFO: renamed from: V */
    public final void m124V() {
        boolean zM48V = false;
        this.f195d = 0.0f;
        this.f197e = 0.0f;
        this.f199f = 0.0f;
        this.f200g = 0.0f;
        this.f169C = -1;
        this.f184V.m208Code(0.0f, 0.0f, 0.0f);
        this.f194c.m208Code(0.0f, 0.0f, 0.0f);
        this.f191b = 0.0f;
        this.f192b.m208Code(0.0f, 0.0f, 0.0f);
        this.f198e.m208Code(0.0f, 0.0f, 0.0f);
        this.f183V = C0031g.f481Code.f442Code - 1;
        this.f177I = true;
        this.f478Code = (short) 0;
        f162B = 0;
        Code = (byte) 0;
        Code(this.f480Code);
        m121V(this.f474Code);
        while (!zM48V) {
            m122Z();
            zM48V = C0018be.m48V(this.f475Code, this.f174F, this.f172D, this.f179L, f163I);
            if (!zM48V) {
                zM48V = C0018be.m48V(this.f475Code, this.f179L, this.f172D, this.f190a, f163I);
            }
            if (!zM48V) {
                this.f183V--;
            }
        }
    }
}
