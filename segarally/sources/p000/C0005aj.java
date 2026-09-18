package p000;

import javax.microedition.m3g.Node;

/* JADX INFO: renamed from: aj */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0005aj extends C0022bm {

    /* JADX INFO: renamed from: B */
    private static boolean f24B;
    private static long Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static C0028d f375Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private float f376Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0027bx f378Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0031g f379Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public Node f380Code;

    /* JADX INFO: renamed from: V */
    private long f25V;

    /* JADX INFO: renamed from: V */
    public C0031g f27V;

    /* JADX INFO: renamed from: V */
    public Node f28V;

    /* JADX INFO: renamed from: V */
    public boolean f29V;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public boolean f381Code = true;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0007ao f377Code = new C0007ao(15);

    /* JADX INFO: renamed from: V */
    public C0007ao f26V = new C0007ao(15);

    /* JADX INFO: renamed from: Z */
    public static void m22Z() {
        f24B = false;
    }

    /* JADX INFO: renamed from: B */
    public final void m23B() {
        if (this.f378Code.m123V() < 0.5f || f24B) {
            return;
        }
        if (this.f25V == 0) {
            this.f25V = C0031g.f276e + ((long) 1500);
            C0031g.f484Code.m173Z(16);
        }
        this.f27V.f506Code = true;
        f24B = true;
    }

    public final void Code() {
        C0031g.Code.f430Code.m51I();
    }

    @Override // p000.C0022bm
    public final void Code(C0010as c0010as, int i) {
        super.Code(c0010as, i);
        f375Code.Code(40152077078831L, 12);
        this.f379Code.f506Code = false;
        this.f27V.f506Code = false;
        ((C0022bm) this).f452Code.Code(this.f379Code.f504Code);
        ((C0022bm) this).f452Code.Code(this.f27V.f504Code);
        this.f381Code = false;
        this.f377Code.m34Z();
        this.f26V.m34Z();
        this.f380Code = c0010as.Code().find(3);
        this.f28V = c0010as.Code().find(4);
    }

    @Override // p000.C0022bm
    public final void Code(C0027bx c0027bx) {
        super.Code(c0027bx);
        if (this.f378Code == null) {
            this.f378Code = c0027bx;
        }
        if (C0031g.f276e > this.f25V) {
            this.f27V.f506Code = false;
            this.f27V.Code(false);
            this.f25V = 0L;
        }
        if (C0031g.f276e > Code + ((long) 500)) {
            C0031g.Code.f432Code.f506Code = true;
            C0031g.Code.f432Code.Code(true);
            Code = 9223372036854775306L;
        }
        float f = this.f378Code.f195d * 550.0f;
        if (f > 55.0f) {
            f = 55.0f;
        }
        this.f380Code.setOrientation(f, 0.0f, 1.0f, 0.0f);
        this.f28V.setOrientation(f, 0.0f, 1.0f, 0.0f);
        char c = 0;
        switch (c) {
            case 0:
                this.f376Code = c0027bx.m123V() * 0.5f;
                C0031g.Code.f430Code.m52V(0.0f, 3.0f, (-6.0f) + ((-4.0f) * this.f376Code));
                this.f377Code.m38g();
                this.f26V.m38g();
                if (c0027bx.Code() > 0.0f && this.f381Code) {
                    float f2 = ((C0022bm) this).f450Code.f361Code * 0.1f;
                    float f3 = ((C0022bm) this).f450Code.f2B * 0.1f;
                    float f4 = ((C0022bm) this).f450Code.f4D * 0.1f;
                    float f5 = ((C0022bm) this).f450Code.f10Z - (((C0022bm) this).f450Code.f6I * 1.5f);
                    float f6 = ((C0022bm) this).f450Code.f5F - (((C0022bm) this).f450Code.f8S * 1.5f);
                    float f7 = ((C0022bm) this).f450Code.f12b - (((C0022bm) this).f450Code.f11a * 1.5f);
                    float f8 = ((C0022bm) this).f450Code.f361Code * 0.885f;
                    float f9 = ((C0022bm) this).f450Code.f2B * 0.885f;
                    float f10 = ((C0022bm) this).f450Code.f4D * 0.885f;
                    this.f377Code.Code((f5 + f8) - f2, (f6 + f9) - f3, (f7 + f10) - f4, f5 + f8 + f2, f6 + f9 + f3, f7 + f10 + f4);
                    this.f26V.Code((f5 - f8) - f2, (f6 - f9) - f3, (f7 - f10) - f4, (f5 - f8) + f2, (f6 - f9) + f3, (f7 - f10) + f4);
                }
                this.f29V = !this.f29V;
                if (C0031g.f251ag == 2) {
                    c0027bx.f197e = 0.0f;
                    if (c0027bx.Code() > 0.0f) {
                        c0027bx.f199f = 5000.0f;
                    } else {
                        c0027bx.m124V();
                    }
                }
                break;
        }
    }

    @Override // p000.C0022bm, p000.InterfaceC0009ar
    public final void Code(C0040z c0040z) {
        super.Code(c0040z);
        if (c0040z.Code() == 3) {
            this.f379Code.f506Code = false;
            this.f381Code = false;
            C0031g.Code.f432Code.f506Code = false;
            short s = ((C0016bb) c0040z).Code;
            if (s < 4 || s > 7) {
                return;
            }
            if (s != 4) {
                this.f379Code.f506Code = true;
                int i = C0012aw.f41a;
                this.f379Code.Code(15.0f);
                if (s == 5) {
                    this.f379Code.Code(66, 64, 125, 127);
                } else if (s == 6) {
                    this.f379Code.Code(0, 16, 63, 63);
                } else if (s == 7) {
                    this.f379Code.Code(0, 16, 63, 63);
                    this.f379Code.Code(25.0f);
                    this.f379Code.f506Code = true;
                    Code = C0031g.f276e;
                    C0031g.f484Code.m173Z(4);
                    Code(false);
                }
            }
            if (s != this.f377Code.f386Code && s != 7) {
                this.f377Code.m212Code((int) s);
                this.f26V.m212Code((int) s);
            }
            if (s != 7) {
                this.f381Code = true;
            }
        }
    }

    @Override // p000.C0022bm
    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final boolean mo209Code() {
        if (!super.mo209Code()) {
            return true;
        }
        this.f377Code.Code(RunnableC0025bt.f462Code.m242Code(115329633643640L));
        this.f26V.Code(RunnableC0025bt.f462Code.m242Code(115329633643640L));
        if (f375Code == null) {
            f375Code = new C0028d();
        }
        this.f379Code = C0031g.Code(40, f375Code, 10, 0L, 66, 64, 125, 127);
        this.f379Code.Code(1, C0031g.f482Code, C0031g.f485Code.Code(((C0022bm) this).f127V));
        this.f379Code.f504Code.m44V(0.1f, 0.1f, 0.1f);
        this.f379Code.Code(15.0f);
        C0033j.Code().Code(this.f379Code);
        this.f27V = C0031g.Code(8, f375Code, 10, 0L, 96, 0, 127, 31);
        this.f27V.Code(3, C0031g.f482Code, C0031g.f485Code.Code(((C0022bm) this).f127V));
        this.f27V.f504Code.m44V(0.1f, 0.1f, 0.1f);
        this.f27V.Code(5.0f);
        C0033j.Code().Code(this.f27V);
        return true;
    }

    @Override // p000.C0022bm
    /* JADX INFO: renamed from: I */
    public final void mo24I() {
        super.mo24I();
        this.f377Code.m39h();
        this.f26V.m39h();
        this.f381Code = false;
        this.f379Code.f506Code = false;
        this.f379Code.Code(false);
        this.f27V.f506Code = false;
        this.f27V.Code(false);
        C0031g.Code.f432Code.f506Code = false;
        this.f376Code = 0.0f;
        Code = 9223372036854775306L;
    }

    @Override // p000.C0022bm
    /* JADX INFO: renamed from: V */
    public final void mo25V() {
        f375Code.Code();
        if (this.f379Code != null && ((C0022bm) this).f452Code != null) {
            ((C0022bm) this).f452Code.m45V(this.f379Code.f504Code);
            ((C0022bm) this).f452Code.m45V(this.f27V.f504Code);
        }
        this.f380Code = null;
        this.f28V = null;
        super.mo25V();
    }
}
