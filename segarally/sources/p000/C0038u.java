package p000;

import Coral.Math.Float.crlV4;
import javax.microedition.m3g.Node;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0038u extends C0001ae {
    public static C0027bx Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static boolean f537Code;

    /* JADX INFO: renamed from: B */
    private boolean f357B;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private long f538Code;

    /* JADX INFO: renamed from: I */
    private boolean f358I;

    /* JADX INFO: renamed from: V */
    private boolean f359V;

    /* JADX INFO: renamed from: Z */
    private boolean f360Z;

    public static void Code(C0027bx c0027bx) {
        Code = c0027bx;
    }

    /* JADX INFO: renamed from: I */
    public static void m204I() {
        f537Code = true;
    }

    public final void Code() {
        f537Code = true;
        this.f357B = false;
        this.f359V = false;
        this.f360Z = false;
        this.f358I = false;
        this.f538Code = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0143  */
    @Override // p000.C0001ae
    /* JADX INFO: renamed from: Z */
    public final void mo17Z() {
        float f;
        C0027bx c0027bx;
        if (C0031g.f251ag == 1) {
            Node node = C0031g.Code.f426Code.f28V;
            int i = RunnableC0025bt.Code;
            this.f359V = (i & 2) == 2;
            this.f357B = (i & 1) == 1 || (i & 64) == 64;
            if (C0031g.f287h[4] == 1) {
                if (this.f359V) {
                    f537Code = false;
                    this.f357B = false;
                    this.f538Code = C0031g.f276e + ((long) 500);
                } else if (this.f357B) {
                    f537Code = true;
                }
                if (f537Code) {
                    this.f357B = true;
                }
                if (!f537Code && this.f538Code != 0 && C0031g.f276e > this.f538Code && Math.abs(Code.f195d) < 0.1f) {
                    f537Code = true;
                    this.f357B = true;
                    this.f538Code = 0L;
                }
            } else {
                f537Code = false;
            }
            this.f358I = (i & 4) == 4;
            this.f360Z = (i & 8) == 8;
            Code.f197e = 0.0f;
            Code.f199f = 0.0f;
            if (this.f359V) {
                Code.f199f = 1.0f;
            } else if (this.f357B) {
                Code.f197e = 1.0f;
            }
            if (!this.f358I) {
                if (this.f360Z) {
                    f = -0.15f;
                    c0027bx = Code;
                }
                if (!f537Code && !this.f357B && !this.f359V && Code.m123V() > 0.5f) {
                    Code.f195d *= (Code.m123V() - 0.5f) + 1.0f;
                    C0031g.Code.f426Code.m23B();
                }
                if (!this.f357B || f537Code) {
                    C0005aj.m22Z();
                    if (!C0031g.f484Code.m236Code(1)) {
                        C0031g.f484Code.m173Z(1);
                    }
                } else if (!this.f357B && !f537Code && C0031g.f484Code.m236Code(1)) {
                    C0031g.f484Code.m161I(1);
                    C0031g.f484Code.Code();
                    C0031g.f484Code.Code(RunnableC0025bt.f462Code, RunnableC0025bt.f465Code, RunnableC0025bt.f464Code);
                    C0031g.f484Code.Code();
                }
                Code.f195d *= 0.5f;
                Code.f195d = crlV4.m4V(Code.f195d);
            }
            f = 0.15f;
            c0027bx = Code;
            c0027bx.f195d = f;
            if (!f537Code) {
                Code.f195d *= (Code.m123V() - 0.5f) + 1.0f;
                C0031g.Code.f426Code.m23B();
            }
            if (this.f357B) {
                C0005aj.m22Z();
                if (!C0031g.f484Code.m236Code(1)) {
                    C0031g.f484Code.m173Z(1);
                }
            } else {
                C0005aj.m22Z();
                if (!C0031g.f484Code.m236Code(1)) {
                    C0031g.f484Code.m173Z(1);
                }
            }
            Code.f195d *= 0.5f;
            Code.f195d = crlV4.m4V(Code.f195d);
        }
    }
}
