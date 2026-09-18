package p000;

import Coral.Math.Float.crlM44;
import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: bm */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class C0022bm implements InterfaceC0009ar {
    private static float Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static int f448Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static crlV4 f449Code = new crlV4();

    /* JADX INFO: renamed from: V */
    private static C0010as f125V;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public crlM44 f450Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0007ao f451Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0010as f452Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0032i f453Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private boolean f454Code;

    /* JADX INFO: renamed from: I */
    public boolean f126I;

    /* JADX INFO: renamed from: V */
    public int f127V;

    /* JADX INFO: renamed from: V */
    public C0028d f128V;

    /* JADX INFO: renamed from: Z */
    public boolean f129Z;

    public C0022bm() {
        this(false, false);
    }

    public C0022bm(boolean z) {
        this.f129Z = true;
    }

    public C0022bm(boolean z, boolean z2) {
        this(false);
        this.f451Code = new C0007ao(8, 8);
    }

    /* JADX INFO: renamed from: C */
    public final void m107C() {
        f125V = RunnableC0025bt.f462Code.m241Code(113514746782572L);
        this.f452Code.Code(f125V);
        f448Code = 0;
        this.f454Code = true;
    }

    public final void Code(crlM44 crlm44) {
        this.f450Code.Code(crlm44);
        this.f452Code.Code(this.f450Code);
    }

    public final void Code(C0001ae c0001ae) {
        this.f451Code.Code((Object) c0001ae);
    }

    public void Code(C0010as c0010as, int i) {
        mo25V();
        this.f452Code = c0010as;
        this.f452Code.Code(true);
        this.f450Code.Code();
        C0031g.f483Code.Code(this.f452Code);
        this.f128V.Code(40152077078831L, 12);
        this.f128V.Code.getCompositingMode().setAlphaThreshold(0.25f);
        if (this.f127V == 0) {
            this.f452Code.Code(this.f453Code);
        }
    }

    public void Code(C0027bx c0027bx) {
        if (this.f454Code) {
            switch (f448Code) {
                case 0:
                    if (RunnableC0025bt.f460Code.nextInt(10) > 5) {
                        f448Code = RunnableC0025bt.f460Code.nextInt(3) + 1;
                    }
                    break;
                case 1:
                    f449Code.f18V += C0031g.f236a * 12.0f;
                    if (f449Code.f18V > 10.0f) {
                        f449Code.f18V = 10.0f;
                        f448Code = 2;
                    }
                    f125V.Code(f449Code);
                    break;
                case 2:
                    f449Code.f18V -= C0031g.f236a * 12.0f;
                    if (f449Code.f18V < 0.0f) {
                        f449Code.f18V = 0.0f;
                        f448Code = 0;
                    }
                    f125V.Code(f449Code);
                    break;
                case 3:
                    Code += 120.0f * C0031g.f236a;
                    if (Code > 1440.0f) {
                        Code = 0.0f;
                        f448Code = 0;
                    }
                    f125V.Code(Code, 0.0f, 1.0f, 0.0f);
                    break;
            }
        }
    }

    @Override // p000.InterfaceC0009ar
    public void Code(C0040z c0040z) {
        C0017bd c0017bd;
        byte b = 0;
        if (c0040z.Code() == 3) {
            Code(true);
            C0031g.Code.f432Code.f506Code = false;
            if (((C0016bb) c0040z).Code == 7) {
                Code(false);
                return;
            }
            return;
        }
        if (c0040z.Code() == 2 && this.f127V != 0) {
            c0017bd = (C0017bd) C0031g.Code.f436Code[this.f127V];
            b = ((C0026bu) c0040z).Code;
        } else if (c0040z.Code() != 1 || this.f127V == 0) {
            return;
        } else {
            c0017bd = (C0017bd) C0031g.Code.f436Code[this.f127V];
        }
        c0017bd.Code(b);
    }

    public final void Code(boolean z) {
        this.f453Code.Code(z);
    }

    /* JADX INFO: renamed from: Code */
    public boolean mo209Code() {
        if (this.f126I) {
            return false;
        }
        this.f453Code = C0037t.Code(2.6f, 5.0f, (byte) 0, (byte) 64, (byte) 63, (byte) 127);
        this.f128V = new C0028d();
        this.f453Code.Code(this.f128V);
        this.f126I = true;
        return true;
    }

    /* JADX INFO: renamed from: I */
    public void mo24I() {
        Code(true);
    }

    /* JADX INFO: renamed from: S */
    public final void m108S() {
        int i = this.f451Code.f386Code;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0001ae) this.f451Code.Code(i2)).mo17Z();
        }
    }

    /* JADX INFO: renamed from: V */
    public void mo25V() {
        if (this.f452Code != null) {
            this.f452Code.m45V(this.f453Code);
            if (this.f454Code) {
                this.f452Code.m45V(f125V);
                f125V = null;
                this.f454Code = false;
            }
            this.f128V.Code();
            C0031g.f483Code.m125V(this.f452Code);
            this.f452Code = null;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m109V(C0001ae c0001ae) {
        this.f451Code.m215Code((Object) c0001ae);
    }

    /* JADX INFO: renamed from: V */
    public final void m110V(C0010as c0010as, int i) {
        this.f127V = i;
        this.f452Code = c0010as;
        this.f450Code = new crlM44();
    }
}
