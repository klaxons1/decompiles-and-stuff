package p000;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public abstract class AbstractC0050v extends C0032d {

    /* JADX INFO: renamed from: c */
    public int f533c;

    /* JADX INFO: renamed from: d */
    public int f534d;

    /* JADX INFO: renamed from: e */
    public int f535e;

    public AbstractC0050v(C0006af c0006af) {
        super(c0006af);
        this.f534d = C0031c.m231c(20);
        this.f535e = -C0031c.m231c(1);
        this.f453I |= 1024;
        this.f413p = C0031c.m231c(1);
        this.f412o = C0031c.m231c(1);
        C0013am.m99k().m115a(this);
    }

    /* JADX INFO: renamed from: a */
    public void mo198a() {
    }

    /* JADX INFO: renamed from: a */
    public void mo26a(boolean z) {
        if (z) {
            this.f406i = 0;
            m250a(C0031c.m231c(1));
        } else {
            this.f406i = 1;
            m250a(0);
            m256c(C0031c.f376a);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo199b() {
    }

    @Override // p000.C0032d, p000.C0002ab, p000.C0037i
    /* JADX INFO: renamed from: c */
    public final void mo19c() {
        if (this.f451G != null && this.f451G.m286c(2048)) {
            ((C0003ac) this.f451G).m31m();
        }
        super.mo19c();
        C0013am.m99k().m121b(this);
    }

    /* JADX INFO: renamed from: f */
    public void mo200f(C0025ay c0025ay) {
    }

    /* JADX INFO: renamed from: l */
    public final boolean m332l() {
        return this.f406i == 0;
    }
}
