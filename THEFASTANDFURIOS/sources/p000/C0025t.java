package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Mesh;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0025t {

    /* JADX INFO: renamed from: a */
    public int f691a;

    /* JADX INFO: renamed from: b */
    public int f692b;

    /* JADX INFO: renamed from: c */
    public int[] f693c;

    /* JADX INFO: renamed from: d */
    public Mesh[] f694d = null;

    /* JADX INFO: renamed from: e */
    private RunnableC0017l f695e;

    /* JADX INFO: renamed from: f */
    private int f696f;

    /* JADX INFO: renamed from: g */
    private int f697g;

    public C0025t(RunnableC0017l runnableC0017l, int i, int i2, int i3, int i4) {
        this.f695e = runnableC0017l;
        this.f696f = i;
        this.f697g = i2;
        this.f691a = i3;
        this.f692b = i4;
        this.f693c = new int[this.f692b];
        for (int i5 = 0; i5 < this.f692b; i5++) {
            this.f693c[i5] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    void m247a() {
        if (this.f694d != null) {
            this.f694d = null;
        }
        this.f694d = C0014i.m70a(C0000a.f4e[this.f696f]);
        RunnableC0017l.m128a(this.f694d.length == this.f697g, "c:\\mobiledevelopment\\ff53d\\src\\carmeshpartdata.hpp", 89, this.f695e);
        if (this.f691a == 0) {
            for (int i = 0; i < this.f694d.length; i++) {
                RunnableC0017l.m128a(this.f694d[i].getAppearance(0) != null, "c:\\mobiledevelopment\\ff53d\\src\\carmeshpartdata.hpp", 114, this.f695e);
            }
            return;
        }
        Appearance appearance = new Appearance();
        appearance.setCompositingMode(this.f695e.f552z.f268e);
        for (int i2 = 0; i2 < this.f694d.length; i2++) {
            RunnableC0017l.m128a(this.f694d[i2].getAppearance(0) == null, "c:\\mobiledevelopment\\ff53d\\src\\carmeshpartdata.hpp", 102, this.f695e);
            this.f694d[i2].setAppearance(0, appearance);
        }
    }
}
