package p000;

import com.m3gworks.engine.RunnableC0025f;
import javax.microedition.m3g.RayIntersection;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0039q extends AbstractC0033k implements InterfaceC0032j {

    /* JADX INFO: renamed from: k */
    private int f292k;

    /* JADX INFO: renamed from: l */
    private boolean f293l;

    /* JADX INFO: renamed from: m */
    private boolean f294m;

    /* JADX INFO: renamed from: n */
    private boolean f295n;

    public C0039q(int i, String str, int i2, float[] fArr, boolean z) {
        super(1, str, i2, fArr);
        this.f293l = true;
        this.f294m = true;
        this.f295n = false;
        this.f293l = z;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: a */
    public final int mo4a() {
        return 0;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: a */
    public final int mo5a(AbstractC0042t abstractC0042t, C0035m c0035m, RayIntersection rayIntersection, World world, float f) {
        if (this.f292k <= 0) {
            return 0;
        }
        int iNextInt = C0040r.f296a.nextInt(6);
        if (iNextInt == 0) {
            iNextInt = 3;
        }
        int i = (int) ((c0035m.f273f * (1.0f - (f / (c0035m.f274g * c0035m.f274g)))) / iNextInt);
        if (i <= 0) {
            i = 0;
        }
        this.f292k -= i;
        if (this.f292k < 0) {
            this.f292k = 0;
        }
        if (this.f292k > 0) {
            return i;
        }
        m172a(0);
        RunnableC0025f.m117a().m121a(true);
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final void m197a(boolean z) {
        this.f294m = z;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: b */
    public final int mo7b() {
        return this.f292k;
    }

    /* JADX INFO: renamed from: b */
    public final void m198b(boolean z) {
        this.f295n = true;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: c */
    public final C0014an mo9c() {
        return null;
    }

    @Override // p000.AbstractC0033k, p000.AbstractC0042t
    /* JADX INFO: renamed from: e */
    public final void mo11e() {
        super.mo11e();
        this.f292k = 100;
        this.f295n = false;
        this.f294m = this.f293l;
        if (this.f308b == 2) {
            m172a(6);
        } else if (this.f308b == 1) {
            m172a(9);
        }
    }

    @Override // p000.AbstractC0033k, p000.AbstractC0042t
    /* JADX INFO: renamed from: f */
    public final void mo178f() {
        if (this.f294m) {
            super.mo178f();
        }
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: k */
    public final void mo12k() {
    }

    /* JADX INFO: renamed from: l */
    public final boolean m199l() {
        return this.f295n;
    }
}
