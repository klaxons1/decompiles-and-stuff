package p000;

/* JADX INFO: renamed from: ad */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0004ad {

    /* JADX INFO: renamed from: a */
    public String f12a;

    /* JADX INFO: renamed from: b */
    public String f13b;

    /* JADX INFO: renamed from: c */
    public String[] f14c;

    /* JADX INFO: renamed from: d */
    public String f15d;

    /* JADX INFO: renamed from: e */
    public String f16e;

    /* JADX INFO: renamed from: f */
    public float f17f;

    /* JADX INFO: renamed from: g */
    public AbstractC0042t f18g;

    /* JADX INFO: renamed from: h */
    public AbstractC0042t f19h;

    /* JADX INFO: renamed from: i */
    public C0026d[] f20i;

    /* JADX INFO: renamed from: l */
    public C0037o[] f23l;

    /* JADX INFO: renamed from: j */
    public boolean f21j = false;

    /* JADX INFO: renamed from: k */
    public int f22k = 0;

    /* JADX INFO: renamed from: m */
    public int f24m = -16777216;

    /* JADX INFO: renamed from: a */
    public final void m17a() {
        if (this.f23l == null) {
            return;
        }
        for (int i = 0; i < this.f23l.length; i++) {
            C0037o c0037o = this.f23l[i];
            c0037o.f281b = -1.0f;
            c0037o.f282c = false;
            if (c0037o.f280a == -1) {
                c0037o.f283d = -16777216;
            } else if (c0037o.f280a == -2) {
                c0037o.f283d = 0;
            }
        }
        this.f24m = -16777216;
    }

    /* JADX INFO: renamed from: b */
    public final C0026d m18b() {
        return this.f20i[this.f22k];
    }
}
