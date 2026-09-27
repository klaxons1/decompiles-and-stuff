package p000;

import com.m3gworks.engine.RunnableC0025f;
import javax.microedition.m3g.Background;

/* JADX INFO: renamed from: aj */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0010aj {

    /* JADX INFO: renamed from: a */
    private static C0010aj f42a;

    /* JADX INFO: renamed from: c */
    private boolean f44c = false;

    /* JADX INFO: renamed from: d */
    private int f45d = 0;

    /* JADX INFO: renamed from: e */
    private int f46e = 0;

    /* JADX INFO: renamed from: f */
    private int f47f = 1;

    /* JADX INFO: renamed from: g */
    private int f48g = 0;

    /* JADX INFO: renamed from: h */
    private int f49h = 1;

    /* JADX INFO: renamed from: i */
    private boolean f50i = false;

    /* JADX INFO: renamed from: j */
    private long f51j = 0;

    /* JADX INFO: renamed from: k */
    private int f52k = 1;

    /* JADX INFO: renamed from: b */
    private boolean[] f43b = new boolean[9];

    /* JADX INFO: renamed from: a */
    public static C0010aj m33a() {
        if (f42a == null) {
            f42a = new C0010aj();
        }
        return f42a;
    }

    /* JADX INFO: renamed from: a */
    private void m34a(AbstractC0042t abstractC0042t, int i) {
        float[] fArrM205a = abstractC0042t.m205a(i, this.f52k == 1 ? 1.0f : 0.2f);
        C0013am c0013amM209c = abstractC0042t.m209c(fArrM205a);
        if (abstractC0042t.mo68a(c0013amM209c) == null && abstractC0042t.m206b(c0013amM209c) == null) {
            float[] fArrMo174a = abstractC0042t.mo174a(fArrM205a);
            if (fArrMo174a[0] == 0.0f && fArrMo174a[1] == 0.0f && fArrMo174a[2] == 0.0f) {
                return;
            }
            ((AbstractC0044v) abstractC0042t).m226e(fArrMo174a);
            C0004ad c0004adM240f = C0045w.m228a().m240f();
            if (c0004adM240f.f20i != null) {
                C0026d c0026dM18b = c0004adM240f.m18b();
                float[] fArrM212m = abstractC0042t.m212m();
                float[] fArr = c0026dM18b.f154a;
                if (c0026dM18b.f158e) {
                    return;
                }
                if (((fArr[2] - fArrM212m[2]) * (fArr[2] - fArrM212m[2])) + ((fArr[0] - fArrM212m[0]) * (fArr[0] - fArrM212m[0])) + ((fArr[1] - fArrM212m[1]) * (fArr[1] - fArrM212m[1])) < c0026dM18b.f155b * c0026dM18b.f155b) {
                    if (c0026dM18b.f157d == 1 || c0026dM18b.f157d == 4) {
                        RunnableC0025f.m117a().m120a(c0026dM18b);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m35a(int i) {
        this.f52k = i;
        AbstractC0044v abstractC0044v = (AbstractC0044v) C0045w.m228a().m240f().f18g;
        float[] fArrM212m = abstractC0044v.m212m();
        if (i == 1) {
            abstractC0044v.m212m()[0] = fArrM212m[0];
            abstractC0044v.m212m()[1] = abstractC0044v.m215p()[1];
            abstractC0044v.m212m()[2] = fArrM212m[2];
        } else if (i == 2) {
            abstractC0044v.m212m()[0] = fArrM212m[0];
            abstractC0044v.m212m()[1] = abstractC0044v.m215p()[1] / 8.0f;
            abstractC0044v.m212m()[2] = fArrM212m[2];
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m36a(int i, boolean z) {
        if (i == -1) {
            for (int i2 = 0; i2 < this.f43b.length; i2++) {
                this.f43b[i2] = z;
            }
        } else {
            this.f43b[i] = z;
        }
        if (i != -1 && i == 0 && z) {
            this.f44c = true;
            this.f45d = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m37b() {
        this.f44c = false;
        this.f45d = 0;
        this.f46e = 0;
        this.f47f = 1;
        this.f48g = 0;
        this.f49h = 1;
        this.f50i = false;
        this.f51j = 0L;
        this.f52k = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final void m38c() {
        boolean z = false;
        AbstractC0042t abstractC0042t = C0045w.m228a().m240f().f18g;
        if (RunnableC0025f.m117a().m124e() == 1) {
            C0037o[] c0037oArr = C0045w.m228a().m240f().f23l;
            if (c0037oArr == null) {
                z = true;
                break;
            }
            for (int i = 0; i < c0037oArr.length; i++) {
                if (!c0037oArr[i].f282c) {
                    c0037oArr[i].m193a();
                    break;
                }
            }
            int i2 = 0;
            while (true) {
                if (i2 >= c0037oArr.length) {
                    z = true;
                    break;
                } else if (!c0037oArr[i2].f282c) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                RunnableC0025f.m117a();
                RunnableC0025f.m118c();
                RunnableC0025f.m117a().m119a(2);
                return;
            }
            return;
        }
        InterfaceC0032j interfaceC0032j = (InterfaceC0032j) abstractC0042t;
        if (this.f43b[5] || this.f43b[6] || this.f43b[7] || this.f43b[8]) {
            abstractC0042t.f310f++;
        } else {
            abstractC0042t.f310f = 0;
        }
        float f = AbstractC0042t.f305d * abstractC0042t.f310f;
        if (f >= AbstractC0042t.f306e) {
            f = AbstractC0042t.f306e;
        }
        if (this.f43b[1]) {
            m34a(abstractC0042t, 1);
        } else if (this.f43b[2]) {
            m34a(abstractC0042t, 2);
        }
        if (this.f43b[3]) {
            m34a(abstractC0042t, 3);
        } else if (this.f43b[4]) {
            m34a(abstractC0042t, 4);
        }
        if (this.f43b[1] || this.f43b[2] || this.f43b[3] || this.f43b[4]) {
            if (this.f46e == 0) {
                this.f47f = 1;
            } else if (this.f46e == 3) {
                this.f47f = -1;
            }
            this.f46e += this.f47f;
        } else if (this.f46e != 0) {
            this.f46e--;
        }
        interfaceC0032j.mo9c().m67g().m248a(C0045w.m228a().m239e());
        if (this.f43b[5]) {
            abstractC0042t.mo171a(f);
        } else if (this.f43b[6]) {
            abstractC0042t.mo175b(f);
        }
        if (this.f43b[7]) {
            float fMo176c = abstractC0042t.mo176c(f);
            Background background = C0045w.m228a().m239e().getBackground();
            if (background != null) {
                background.setCrop(background.getCropX() - ((int) (fMo176c * (background.getCropWidth() / 60.0f))), background.getCropY(), background.getCropWidth(), background.getCropHeight());
            }
        } else if (this.f43b[8]) {
            float fMo177d = abstractC0042t.mo177d(f);
            Background background2 = C0045w.m228a().m239e().getBackground();
            if (background2 != null) {
                background2.setCrop(((int) (fMo177d * (background2.getCropWidth() / 60.0f))) + background2.getCropX(), background2.getCropY(), background2.getCropWidth(), background2.getCropHeight());
            }
        }
        int i3 = interfaceC0032j.mo9c().f71j;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            int iM60b = interfaceC0032j.mo9c().m60b();
            int i4 = iM60b % interfaceC0032j.mo9c().m65d().f269b;
            if (interfaceC0032j.mo9c().f68g[i3] < iM60b) {
                interfaceC0032j.mo9c().f68g[i3] = iM60b;
            }
            if (iM60b != 0 && i4 == 0 && iM60b < interfaceC0032j.mo9c().f68g[i3]) {
                interfaceC0032j.mo9c().f68g[i3] = iM60b;
                this.f50i = true;
                this.f51j = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - this.f51j > 1500) {
                this.f50i = false;
            }
            if (this.f50i) {
                m36a(0, false);
            }
        } else {
            this.f50i = false;
        }
        if (!this.f43b[0]) {
            if (this.f48g != 0) {
                this.f48g--;
                return;
            }
            return;
        }
        if (i3 == 1 && !this.f44c) {
            this.f44c = true;
            return;
        }
        if (i3 == 0 || i3 == 2 || i3 == 3) {
            m36a(0, false);
        }
        if (interfaceC0032j.mo9c().m60b() > 0) {
            if (i3 == 1) {
                float f2 = 0.1f * this.f45d;
                switch (C0040r.f296a.nextInt(3)) {
                    case 0:
                        abstractC0042t.mo176c(f2);
                        break;
                    case 1:
                        abstractC0042t.mo177d(f2);
                        break;
                }
                this.f45d++;
            }
            if (C0028f.m130a().m146e()) {
                if (i3 == 1) {
                    C0016ap.m72a().m76a(1);
                } else if (i3 == 0) {
                    C0016ap.m72a().m76a(2);
                } else if (i3 == 2) {
                    C0016ap.m72a().m76a(3);
                }
            }
            interfaceC0032j.mo4a();
            if (i3 == 0 || i3 == 1 || i3 == 2) {
                C0030h.m157a().m164b();
                if (this.f48g == 0) {
                    this.f49h = 1;
                } else if (this.f48g == 3) {
                    this.f49h = -1;
                }
                this.f48g += this.f49h;
            } else if ((i3 == 3 || i3 == 4) && interfaceC0032j.mo9c().m60b() <= 0) {
                interfaceC0032j.mo9c().m64c(i3);
                interfaceC0032j.mo9c().m59a(-1);
            }
            if (i3 != 1 || this.f44c) {
                return;
            }
            this.f44c = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m39d() {
        return this.f46e;
    }

    /* JADX INFO: renamed from: e */
    public final int m40e() {
        return this.f48g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m41f() {
        return this.f50i;
    }

    /* JADX INFO: renamed from: g */
    public final int m42g() {
        return this.f52k;
    }

    /* JADX INFO: renamed from: h */
    public final boolean[] m43h() {
        return this.f43b;
    }
}
