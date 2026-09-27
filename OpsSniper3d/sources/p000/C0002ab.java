package p000;

import com.m3gworks.engine.RunnableC0025f;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.RayIntersection;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: ab */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0002ab extends AbstractC0033k implements InterfaceC0032j {

    /* JADX INFO: renamed from: k */
    private boolean f7k;

    /* JADX INFO: renamed from: l */
    private int f8l;

    /* JADX INFO: renamed from: m */
    private C0014an f9m;

    /* JADX INFO: renamed from: n */
    private boolean f10n;

    /* JADX INFO: renamed from: o */
    private boolean f11o;

    public C0002ab(int i, String str, int i2, float[] fArr, boolean z) {
        super(i, str, i2, fArr);
        this.f10n = false;
        this.f11o = false;
        this.f7k = z;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: a */
    public final int mo4a() {
        AbstractC0042t[] abstractC0042tArr;
        ((AbstractC0033k) this).f262a = 0;
        C0015ao c0015ao = (C0015ao) C0045w.m228a().m240f().f18g;
        if (C0040r.f296a.nextInt(C0010aj.m33a().m42g() == 2 ? 8 : 4) == 0) {
            float[] fArrM212m = c0015ao.m212m();
            c0015ao.mo5a(this, this.f9m.m65d(), null, null, ((fArrM212m[0] - this.f309c[0]) * (fArrM212m[0] - this.f309c[0])) + ((fArrM212m[1] - this.f309c[1]) * (fArrM212m[1] - this.f309c[1])) + ((fArrM212m[2] - this.f309c[2]) * (fArrM212m[2] - this.f309c[2])));
            this.f11o = true;
            return 1;
        }
        if (C0040r.f296a.nextInt(30) == 1) {
            int i = C0045w.m228a().m240f().f22k;
            if (i != 0 && (abstractC0042tArr = C0045w.m228a().m240f().f20i[i - 1].f159f) != null) {
                for (int i2 = 0; i2 < abstractC0042tArr.length; i2++) {
                    if (abstractC0042tArr[i2].m216q() == 1) {
                        float[] fArrM212m2 = abstractC0042tArr[i2].m212m();
                        ((C0039q) abstractC0042tArr[i2]).mo5a(this, this.f9m.m65d(), null, null, ((fArrM212m2[0] - this.f309c[0]) * (fArrM212m2[0] - this.f309c[0])) + ((fArrM212m2[1] - this.f309c[1]) * (fArrM212m2[1] - this.f309c[1])) + ((fArrM212m2[2] - this.f309c[2]) * (fArrM212m2[2] - this.f309c[2])));
                    }
                }
            }
            AbstractC0042t[] abstractC0042tArr2 = C0045w.m228a().m240f().m18b().f159f;
            if (abstractC0042tArr2 != null) {
                for (int i3 = 0; i3 < abstractC0042tArr2.length; i3++) {
                    if (abstractC0042tArr2[i3].m216q() == 1) {
                        float[] fArrM212m3 = abstractC0042tArr2[i3].m212m();
                        ((C0039q) abstractC0042tArr2[i3]).mo5a(this, this.f9m.m65d(), null, null, ((fArrM212m3[0] - this.f309c[0]) * (fArrM212m3[0] - this.f309c[0])) + ((fArrM212m3[1] - this.f309c[1]) * (fArrM212m3[1] - this.f309c[1])) + ((fArrM212m3[2] - this.f309c[2]) * (fArrM212m3[2] - this.f309c[2])));
                    }
                }
            }
        }
        return 2;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: a */
    public final int mo5a(AbstractC0042t abstractC0042t, C0035m c0035m, RayIntersection rayIntersection, World world, float f) {
        boolean z = false;
        if (this.f8l <= 0) {
            return 0;
        }
        int iNextInt = C0040r.f296a.nextInt(6);
        if (iNextInt == 0) {
            iNextInt = 3;
        }
        int i = (int) ((c0035m.f273f * (1.0f - (f / (c0035m.f274g * c0035m.f274g)))) / iNextInt);
        int i2 = i <= 0 ? 0 : i;
        this.f8l -= i2;
        if (this.f8l < 0) {
            this.f8l = 0;
        }
        this.f10n = true;
        if (i2 > 0 && c0035m.f271d != 3 && c0035m.f271d != 4) {
            C0043u.m217a().m221a(1, rayIntersection, world, (Camera) C0000a.m0a().m190d());
        }
        if (this.f8l > 0) {
            return i2;
        }
        m172a(0);
        if (this.f308b == 4 && !this.f7k) {
            RunnableC0025f.m117a().m121a(true);
            return i2;
        }
        C0004ad c0004adM240f = C0045w.m228a().m240f();
        if (c0004adM240f.f20i == null) {
            return i2;
        }
        C0026d c0026dM18b = c0004adM240f.m18b();
        if (c0026dM18b.f157d != 2) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 < c0026dM18b.f160g.length) {
                if (((C0002ab) c0026dM18b.f160g[i3]).f8l > 0 && ((C0002ab) c0026dM18b.f160g[i3]).f7k) {
                    break;
                }
                i3++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return i2;
        }
        RunnableC0025f.m117a().m120a(c0026dM18b);
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m6a(boolean z) {
        this.f11o = false;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: b */
    public final int mo7b() {
        return this.f8l;
    }

    /* JADX INFO: renamed from: b */
    public final void m8b(boolean z) {
        this.f10n = false;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: c */
    public final C0014an mo9c() {
        return this.f9m;
    }

    @Override // p000.AbstractC0033k, p000.AbstractC0042t
    /* JADX INFO: renamed from: d */
    public final void mo10d() {
        super.mo10d();
        this.f9m.m66e();
        this.f9m = null;
    }

    @Override // p000.AbstractC0033k, p000.AbstractC0042t
    /* JADX INFO: renamed from: e */
    public final void mo11e() {
        super.mo11e();
        if (this.f8l <= 0) {
            this.f9m.m57a();
        }
        this.f9m.m62b((C0035m) C0014an.f60a.elementAt(C0014an.f61b));
        this.f9m.m59a(1);
        this.f8l = 100;
        if (this.f308b == 4) {
            m172a(7);
        }
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: k */
    public final void mo12k() {
        this.f9m = new C0014an(this);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m13l() {
        return this.f11o;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m14r() {
        return this.f10n;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15s() {
        return this.f7k;
    }
}
