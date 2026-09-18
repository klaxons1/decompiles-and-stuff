package p000;

import Coral.Math.Float.crlM44;
import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: au */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0011au extends C0018be {
    private static crlM44 Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static final crlV4[] f408Code = {new crlV4(1.0f, 10.0f, 1.0f), new crlV4(0.0f, 1.0f, 7.0f), new crlV4(3.0f, 2.0f, 7.0f), new crlV4(6.0f, 5.0f, -4.0f)};

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static crlV4 f407Code = new crlV4();

    /* JADX INFO: renamed from: V */
    private static crlV4 f40V = new crlV4();

    public static void Code(C0027bx c0027bx) {
        Code = c0027bx.f474Code;
    }

    @Override // p000.C0018be, p000.C0001ae
    /* JADX INFO: renamed from: V */
    public final void mo16V() {
    }

    @Override // p000.C0018be, p000.C0001ae
    /* JADX INFO: renamed from: Z */
    public final void mo17Z() {
        float length = C0031g.f212B / (5000 / (f408Code.length / 2));
        int i = (int) length;
        float f = length - i;
        int length2 = (((f408Code.length / 2) - 1) - i) * 2;
        if (length2 < 0) {
            length2 = 0;
        } else if (length2 >= f408Code.length) {
            length2 = f408Code.length - 1;
        }
        float f2 = 1.0f - f;
        float fM5V = crlV4.m5V(f2, f408Code[length2].f362Code, f408Code[length2 + 1].f362Code);
        float fM5V2 = crlV4.m5V(f2, f408Code[length2].f18V, f408Code[length2 + 1].f18V);
        float fM5V3 = crlV4.m5V(f2, f408Code[length2].f17I, f408Code[length2 + 1].f17I);
        f40V.m208Code(Code.f10Z, Code.f5F, Code.f12b);
        f407Code.Code(f40V);
        f407Code.f362Code += (Code.f361Code * fM5V) + (Code.f2B * fM5V2) + (Code.f4D * fM5V3);
        f407Code.f18V += (Code.f9V * fM5V) + (Code.f3C * fM5V2) + (Code.f7L * fM5V3);
        crlV4 crlv4 = f407Code;
        crlv4.f17I = (fM5V3 * Code.f11a) + (fM5V * Code.f6I) + (fM5V2 * Code.f8S) + crlv4.f17I;
        crlM44.Code(((C0018be) this).f421Code, f407Code, f40V, crlV4.Code);
    }
}
