package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Sprite3D;
import javax.microedition.m3g.Texture2D;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0000a {

    /* JADX INFO: renamed from: a */
    static final String[] f0a = {"car_exotic.m3g", "car_import.m3g", "car_muscle.m3g", "car_performance.m3g", "car_sports.m3g", "car_tuner.m3g"};

    /* JADX INFO: renamed from: b */
    static final String[] f1b = {"car_exotic.png", "car_import.png", "car_muscle.png", "car_performance.png", "car_sports.png", "car_tuner.png"};

    /* JADX INFO: renamed from: c */
    static final int[] f2c = {319, 317, 315, 313, 311, 309};

    /* JADX INFO: renamed from: d */
    static final int[] f3d = {347, 345, 343, 341, 339, 337};

    /* JADX INFO: renamed from: e */
    static final String[] f4e = {"bonnet_part.m3g", "police_lights.m3g", "wheels.m3g", "wing_part.m3g"};

    /* JADX INFO: renamed from: f */
    static final String[] f5f = {"bonnet_part.png", null, null, "wing_part.png"};

    /* JADX INFO: renamed from: g */
    static final String[] f6g = {"decal_import_side_01.png", "decal_muscle_side_01.png", "decal_performance_side_01.png", "decal_performance_side_02.png", "decal_sports_side_01.png", "decal_sports_side_02.png", "decal_tuner_side_01.png", "decal_tuner_side_02.png", "exotic_front_bump_01.png", "exotic_front_bump_02.png", "exotic_rear_bump_01.png", "exotic_rear_bump_02.png", "import_front_bump_01.png", "import_front_bump_02.png", "import_rear_bump_01.png", "import_rear_bump_02.png", "muscle_front_bump_01.png", "muscle_front_bump_02.png", "muscle_rear_bump_01.png", "muscle_rear_bump_02.png", "performance_front_bump_01.png", "performance_front_bump_02.png", "performance_rear_bump_01.png", "performance_rear_bump_02.png", "car_police.png", "sports_front_bump01.png", "sports_front_bump02.png", "sports_rear_bump01.png", "sports_rear_bump02.png", "tuner_front_bump_01.png", "tuner_front_bump_02.png", "tuner_rear_bump_01.png", "tuner_rear_bump_02.png"};

    /* JADX INFO: renamed from: E */
    private int f11E;

    /* JADX INFO: renamed from: o */
    public Sprite3D f19o;

    /* JADX INFO: renamed from: p */
    public Sprite3D f20p;

    /* JADX INFO: renamed from: q */
    public Sprite3D f21q;

    /* JADX INFO: renamed from: r */
    public Sprite3D f22r;

    /* JADX INFO: renamed from: t */
    private RunnableC0017l f24t;

    /* JADX INFO: renamed from: u */
    private C0014i f25u;

    /* JADX INFO: renamed from: v */
    private int f26v = 0;

    /* JADX INFO: renamed from: w */
    private C0021p[] f27w = null;

    /* JADX INFO: renamed from: x */
    private int f28x = 0;

    /* JADX INFO: renamed from: y */
    private C0018m[] f29y = null;

    /* JADX INFO: renamed from: z */
    private int f30z = 0;

    /* JADX INFO: renamed from: A */
    private C0025t[] f7A = null;

    /* JADX INFO: renamed from: h */
    public int[] f12h = null;

    /* JADX INFO: renamed from: B */
    private int f8B = 0;

    /* JADX INFO: renamed from: i */
    public C0031z[] f13i = null;

    /* JADX INFO: renamed from: C */
    private int f9C = 0;

    /* JADX INFO: renamed from: j */
    public C0003ac[] f14j = null;

    /* JADX INFO: renamed from: D */
    private int f10D = 0;

    /* JADX INFO: renamed from: k */
    public C0019n[] f15k = null;

    /* JADX INFO: renamed from: l */
    public Mesh f16l = null;

    /* JADX INFO: renamed from: m */
    public Texture2D[] f17m = null;

    /* JADX INFO: renamed from: s */
    public C0008c[][] f23s = null;

    /* JADX INFO: renamed from: n */
    public Texture2D f18n = null;

    public C0000a(RunnableC0017l runnableC0017l, C0014i c0014i) {
        this.f24t = runnableC0017l;
        this.f25u = c0014i;
        try {
            m2h();
            Appearance appearance = new Appearance();
            appearance.setCompositingMode(this.f25u.f267d);
            this.f21q = new Sprite3D(true, new Image2D(100, C0014i.m71b("Reflection_Test.png")), appearance);
            this.f22r = new Sprite3D(true, new Image2D(100, C0014i.m71b("Pink_Slip.png")), appearance);
            m3i();
            Appearance appearance2 = new Appearance();
            appearance2.setCompositingMode(this.f25u.f270g);
            this.f19o = new Sprite3D(true, new Image2D(100, C0014i.m71b("sparks.png")), appearance2);
            this.f20p = new Sprite3D(true, new Image2D(100, C0014i.m71b("smoke.png")), appearance2);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: f */
    private int m0f() {
        return this.f24t.m164B(this.f11E);
    }

    /* JADX INFO: renamed from: g */
    private int m1g() {
        return this.f24t.m163A(this.f11E);
    }

    /* JADX INFO: renamed from: h */
    private void m2h() {
        this.f11E = this.f24t.m213y(322);
        this.f28x = m0f();
        this.f29y = new C0018m[this.f28x];
        for (int i = 0; i < this.f28x; i++) {
            int iM0f = m0f();
            int iM0f2 = m0f();
            if (iM0f2 == 0) {
                iM0f2 = 256;
            }
            this.f29y[i] = new C0018m(this.f24t, i, iM0f2, iM0f, m1g(), m1g());
        }
        this.f30z = m0f();
        this.f7A = new C0025t[this.f30z];
        for (int i2 = 0; i2 < this.f30z; i2++) {
            int iM0f3 = m0f();
            int iM0f4 = m0f();
            int iM0f5 = m0f();
            this.f7A[i2] = new C0025t(this.f24t, i2, iM0f3, iM0f4, iM0f5);
            for (int i3 = 0; i3 < iM0f5; i3++) {
                int iM0f6 = m0f() - 1;
                RunnableC0017l.m128a(iM0f6 >= 0 && iM0f6 < 16, "c:\\mobiledevelopment\\ff53d\\src\\carappmanager.hpp", 389, this.f24t);
                this.f7A[i2].f693c[i3] = iM0f6;
            }
        }
        int iM0f7 = m0f();
        this.f12h = new int[iM0f7];
        for (int i4 = 0; i4 < iM0f7; i4++) {
            this.f12h[i4] = m0f();
            for (int i5 = 0; i5 < this.f28x; i5++) {
                if (i4 == 0) {
                    this.f29y[i5].f560h = new int[iM0f7 << 1];
                }
                this.f29y[i5].f560h[i4 << 1] = m0f();
                this.f29y[i5].f560h[(i4 << 1) + 1] = m0f();
            }
        }
        this.f26v = m0f();
        this.f27w = new C0021p[this.f26v];
        for (int i6 = 0; i6 < this.f26v; i6++) {
            this.f27w[i6] = new C0021p();
            int iM0f8 = m0f();
            this.f27w[i6].f579a = new String();
            for (int i7 = 0; i7 < iM0f8; i7++) {
                StringBuffer stringBuffer = new StringBuffer();
                C0021p c0021p = this.f27w[i6];
                c0021p.f579a = stringBuffer.append(c0021p.f579a).append((char) m0f()).toString();
            }
            this.f27w[i6].f580b = m0f();
            this.f27w[i6].f582d = m0f();
            this.f27w[i6].f583e = m0f();
            this.f27w[i6].f584f = m0f();
            this.f27w[i6].f581c = m0f();
            this.f27w[i6].f585g = new int[this.f30z];
            for (int i8 = 0; i8 < this.f30z; i8++) {
                this.f27w[i6].f585g[i8] = m0f();
            }
            this.f27w[i6].f586h = m0f();
            this.f27w[i6].f587i = new int[this.f27w[i6].f586h];
            for (int i9 = 0; i9 < this.f27w[i6].f586h; i9++) {
                this.f27w[i6].f587i[i9] = m0f();
            }
        }
        this.f8B = m0f();
        this.f13i = new C0031z[this.f8B];
        for (int i10 = 0; i10 < this.f8B; i10++) {
            this.f13i[i10] = new C0031z();
            this.f13i[i10].f747a = m1g();
            this.f13i[i10].f748b = m1g();
            this.f13i[i10].f749c = m1g();
            this.f13i[i10].f750d = m1g();
            this.f13i[i10].f751e = m1g();
            this.f13i[i10].f752f = m1g();
            this.f13i[i10].f753g = m1g();
            this.f13i[i10].f754h = m1g();
            this.f13i[i10].f755i = m1g() & 65535;
            this.f13i[i10].f756j = m1g() & 65535;
        }
        this.f9C = m0f();
        this.f14j = new C0003ac[this.f9C];
        for (int i11 = 0; i11 < this.f9C; i11++) {
            this.f14j[i11] = new C0003ac();
            this.f14j[i11].f45a = m1g();
            this.f14j[i11].f46b = m1g();
            this.f14j[i11].f47c = m1g();
            for (int i12 = 0; i12 < 5; i12++) {
                this.f14j[i11].f48d[i12] = m1g();
                this.f14j[i11].f49e[i12] = m1g();
                this.f14j[i11].f50f[i12] = m1g();
                this.f14j[i11].f51g[i12] = m1g();
            }
            m1g();
            m1g();
            this.f14j[i11].f52h = m1g() & 65535;
            this.f14j[i11].f53i = m1g() & 65535;
        }
        this.f10D = m0f();
        this.f15k = new C0019n[this.f10D];
        for (int i13 = 0; i13 < this.f10D; i13++) {
            this.f15k[i13] = new C0019n();
            this.f15k[i13].f563a = m1g();
            this.f15k[i13].f564b = m1g();
            this.f15k[i13].f565c = m1g();
            this.f15k[i13].f566d = m1g();
            this.f15k[i13].f567e = m1g();
            this.f15k[i13].f568f = m1g();
            this.f15k[i13].f569g = m1g();
            this.f15k[i13].f570h = m1g();
            this.f15k[i13].f571i = m1g() & 65535;
            this.f15k[i13].f572j = m1g() & 65535;
            this.f15k[i13].f569g = RunnableC0017l.m158w(this.f15k[i13].f569g);
        }
        this.f23s = new C0008c[4][];
        for (int i14 = 0; i14 < 4; i14++) {
            this.f23s[i14] = new C0008c[4];
            for (int i15 = 0; i15 < 4; i15++) {
                this.f23s[i14][i15] = new C0008c();
                this.f23s[i14][i15].f70a = m1g() & 65535;
                this.f23s[i14][i15].f71b = m1g() & 65535;
                this.f23s[i14][i15].f72c = m1g() & 65535;
                this.f23s[i14][i15].f73d = m1g() & 65535;
                this.f23s[i14][i15].f74e = m1g() & 65535;
                this.f23s[i14][i15].f75f = m0f();
                this.f23s[i14][i15].f76g = new int[this.f23s[i14][i15].f75f];
                for (int i16 = 0; i16 < this.f23s[i14][i15].f75f; i16++) {
                    this.f23s[i14][i15].f76g[i16] = m0f();
                }
            }
        }
        this.f24t.m214z(322);
        for (int i17 = 0; i17 < this.f28x; i17++) {
            C0018m c0018m = this.f29y[i17];
            c0018m.m215a();
            c0018m.m216b();
        }
        for (int i18 = 0; i18 < this.f30z; i18++) {
            this.f7A[i18].m247a();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m3i() {
        this.f16l = C0014i.m70a("nitro.m3g")[0];
        Appearance appearance = new Appearance();
        appearance.setPolygonMode(this.f25u.f266c);
        appearance.setCompositingMode(this.f24t.f552z.f270g);
        RunnableC0017l.m128a(this.f16l.getAppearance(0) == null, "c:\\mobiledevelopment\\ff53d\\src\\carappmanager.hpp", 701, this.f24t);
        this.f16l.setAppearance(0, appearance);
        String[] strArr = {"nitro_01.png", "nitro_02.png"};
        this.f17m = new Texture2D[2];
        for (int i = 0; i < 2; i++) {
            this.f17m[i] = new Texture2D(new Image2D(100, C0014i.m71b(strArr[i])));
            this.f17m[i].setFiltering(208, 210);
            this.f17m[i].setWrapping(241, 241);
            this.f17m[i].setBlending(228);
        }
        System.gc();
    }

    /* JADX INFO: renamed from: a */
    public final int m4a() {
        return this.f26v;
    }

    /* JADX INFO: renamed from: a */
    public final C0021p m5a(int i) {
        RunnableC0017l.m128a(i >= 0 && i < this.f26v, "c:\\mobiledevelopment\\ff53d\\src\\carappmanager.hpp", 253, this.f24t);
        return this.f27w[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m6a(boolean z) {
        for (int i = 0; i < this.f28x; i++) {
            C0018m c0018m = this.f29y[i];
            if (z) {
                for (int i2 = 0; i2 < c0018m.f561i.length; i2++) {
                    c0018m.f561i[i2].getAppearance(0).setPolygonMode(c0018m.f553a.f552z.f265b);
                }
            } else {
                for (int i3 = 0; i3 < c0018m.f561i.length; i3++) {
                    c0018m.f561i[i3].getAppearance(0).setPolygonMode(c0018m.f553a.f552z.f266c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m7b() {
        return this.f30z;
    }

    /* JADX INFO: renamed from: b */
    public final C0018m m8b(int i) {
        RunnableC0017l.m128a(i >= 0 && i < this.f28x, "c:\\mobiledevelopment\\ff53d\\src\\carappmanager.hpp", 263, this.f24t);
        return this.f29y[i];
    }

    /* JADX INFO: renamed from: c */
    public final C0025t m9c(int i) {
        RunnableC0017l.m128a(i >= 0 && i < this.f30z, "c:\\mobiledevelopment\\ff53d\\src\\carappmanager.hpp", 273, this.f24t);
        return this.f7A[i];
    }

    /* JADX INFO: renamed from: c */
    public final void m10c() {
        for (int i = 0; i < this.f28x; i++) {
            this.f29y[i].f561i[0].getAppearance(0).setTexture(0, (Texture2D) null);
        }
        for (int i2 = 0; i2 < this.f30z; i2++) {
            if (this.f7A[i2].f691a != 0) {
                this.f7A[i2].f694d[0].getAppearance(0).setTexture(0, (Texture2D) null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11d() {
        this.f18n = new Texture2D(new Image2D(100, C0014i.m71b("reflection_plane_java.png")));
        this.f18n.setFiltering(208, 210);
        this.f18n.setWrapping(241, 241);
        this.f18n.setBlending(228);
        System.gc();
    }

    /* JADX INFO: renamed from: e */
    public final void m12e() {
        this.f18n = null;
    }
}
