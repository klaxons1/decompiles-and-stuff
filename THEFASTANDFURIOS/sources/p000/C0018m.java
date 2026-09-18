package p000;

import java.lang.reflect.Array;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Mesh;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0018m {

    /* JADX INFO: renamed from: a */
    public RunnableC0017l f553a;

    /* JADX INFO: renamed from: b */
    public int f554b;

    /* JADX INFO: renamed from: c */
    public int f555c;

    /* JADX INFO: renamed from: d */
    public int f556d;

    /* JADX INFO: renamed from: e */
    public int f557e;

    /* JADX INFO: renamed from: f */
    public int f558f;

    /* JADX INFO: renamed from: g */
    public int f559g;

    /* JADX INFO: renamed from: j */
    public short[][] f562j = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 16, 3);

    /* JADX INFO: renamed from: h */
    public int[] f560h = null;

    /* JADX INFO: renamed from: i */
    public Mesh[] f561i = null;

    public C0018m(RunnableC0017l runnableC0017l, int i, int i2, int i3, int i4, int i5) {
        this.f553a = runnableC0017l;
        this.f554b = i;
        this.f555c = i2;
        this.f556d = i4;
        this.f557e = i5;
        this.f558f = i4 + 40;
        this.f559g = i5 - 40;
    }

    /* JADX INFO: renamed from: a */
    void m215a() {
        if (this.f561i != null) {
            this.f561i = null;
        }
        this.f561i = C0014i.m70a(C0000a.f0a[this.f554b]);
        RunnableC0017l.m128a(this.f561i.length == 3, "c:\\mobiledevelopment\\ff53d\\src\\carmeshdata.hpp", 102, this.f553a);
        Appearance appearance = new Appearance();
        appearance.setCompositingMode(this.f553a.f552z.f268e);
        for (int i = 0; i < this.f561i.length; i++) {
            RunnableC0017l.m128a(this.f561i[i].getAppearance(0) == null, "c:\\mobiledevelopment\\ff53d\\src\\carmeshdata.hpp", 114, this.f553a);
            this.f561i[i].setAppearance(0, appearance);
        }
        System.gc();
    }

    /* JADX INFO: renamed from: b */
    void m216b() {
        int i = C0000a.f2c[this.f554b];
        int iM213y = this.f553a.m213y(i);
        RunnableC0017l.m128a(this.f553a.m163A(iM213y) == 16, "c:\\mobiledevelopment\\ff53d\\src\\carmeshdata.hpp", 170, this.f553a);
        for (int i2 = 0; i2 < 16; i2++) {
            this.f562j[i2][0] = (short) (this.f553a.m163A(iM213y) >> 2);
            this.f562j[i2][2] = (short) (-(this.f553a.m163A(iM213y) >> 2));
            this.f562j[i2][1] = (short) (this.f553a.m163A(iM213y) >> 2);
        }
        this.f553a.m214z(i);
    }
}
