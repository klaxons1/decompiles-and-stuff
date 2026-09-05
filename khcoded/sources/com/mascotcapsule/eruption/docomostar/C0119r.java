package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.r */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0119r {

    /* JADX INFO: renamed from: r */
    private float f1024r;

    /* JADX INFO: renamed from: x */
    private final EffectSource f1030x;

    /* JADX INFO: renamed from: i */
    private C0100dr f1015i = new C0100dr();

    /* JADX INFO: renamed from: b */
    C0012ak f1008b = new C0012ak(3);

    /* JADX INFO: renamed from: c */
    C0012ak f1009c = new C0012ak(3);

    /* JADX INFO: renamed from: p */
    private C0012ak f1022p = new C0012ak(4);

    /* JADX INFO: renamed from: q */
    private Vector3D f1023q = new Vector3D();

    /* JADX INFO: renamed from: f */
    VertexBuffer f1012f = null;

    /* JADX INFO: renamed from: t */
    private float[] f1026t = new float[2];

    /* JADX INFO: renamed from: v */
    private float[] f1028v = new float[2];

    /* JADX INFO: renamed from: w */
    private float[] f1029w = new float[3];

    /* JADX INFO: renamed from: a */
    Particle f1007a = null;

    /* JADX INFO: renamed from: d */
    C0060ce f1010d = null;

    /* JADX INFO: renamed from: j */
    private Vector3D f1016j = new Vector3D();

    /* JADX INFO: renamed from: k */
    private Vector3D f1017k = new Vector3D();

    /* JADX INFO: renamed from: l */
    private Vector3D f1018l = new Vector3D();

    /* JADX INFO: renamed from: m */
    private Vector3D f1019m = new Vector3D();

    /* JADX INFO: renamed from: n */
    private Vector3D f1020n = new Vector3D();

    /* JADX INFO: renamed from: o */
    private Vector3D f1021o = new Vector3D();

    /* JADX INFO: renamed from: s */
    private float f1025s = 0.0f;

    /* JADX INFO: renamed from: e */
    boolean f1011e = false;

    /* JADX INFO: renamed from: g */
    int f1013g = 0;

    /* JADX INFO: renamed from: h */
    int f1014h = 0;

    /* JADX INFO: renamed from: u */
    private int f1027u = 0;

    C0119r(EffectSource effectSource) {
        this.f1030x = effectSource;
    }

    /* JADX INFO: renamed from: a */
    final void m518a(int i) {
        this.f1021o.mul(EffectSource.m100k(this.f1030x), EffectSource.m101l(this.f1030x));
        this.f1018l.add(this.f1018l, this.f1021o);
        this.f1019m.mul(this.f1016j, this.f1015i.m491a(EffectSource.m101l(this.f1030x)));
        this.f1019m.add(this.f1019m, this.f1018l);
        this.f1019m.add(this.f1019m, this.f1017k);
        this.f1020n.mul(this.f1019m, EffectSource.m101l(this.f1030x));
        float[] fArr = this.f1010d.f783h;
        int i2 = this.f1013g;
        fArr[i2] = fArr[i2] + this.f1020n.getX();
        float[] fArr2 = this.f1010d.f783h;
        int i3 = this.f1013g + 1;
        fArr2[i3] = fArr2[i3] + this.f1020n.getY();
        float[] fArr3 = this.f1010d.f783h;
        int i4 = this.f1013g + 2;
        fArr3[i4] = fArr3[i4] + this.f1020n.getZ();
        float[] fArr4 = new float[3];
        float[] fArr5 = new float[3];
        for (int i5 = 0; i5 < 3; i5++) {
            fArr4[i5] = this.f1008b.m397a(i5, EffectSource.m101l(this.f1030x));
            fArr5[i5] = this.f1009c.m397a(i5, EffectSource.m101l(this.f1030x));
        }
        if (this.f1007a.f416I) {
            for (int i6 = 0; i6 < 4; i6++) {
                this.f1010d.f784i[this.f1027u + i6] = (byte) (this.f1022p.m397a(i6, EffectSource.m101l(this.f1030x)) * 255.0f);
            }
            for (int i7 = 0; i7 < 2; i7++) {
                if (this.f1007a.f414G[i7] != 0.0f && this.f1028v[i7] >= this.f1007a.f415H[i7]) {
                    float[] fArr6 = this.f1010d.f785j;
                    int i8 = this.f1014h + 3 + i7;
                    fArr6[i8] = fArr6[i8] + this.f1007a.f414G[i7];
                    float[] fArr7 = this.f1010d.f785j;
                    int i9 = this.f1014h + 5 + i7;
                    fArr7[i9] = fArr7[i9] + this.f1007a.f414G[i7];
                    if (this.f1010d.f785j[this.f1014h + 3 + i7] > this.f1007a.f412E[i7]) {
                        this.f1010d.f785j[this.f1014h + 3 + i7] = this.f1007a.f412E[i7] - this.f1007a.f414G[i7];
                        this.f1010d.f785j[this.f1014h + 5 + i7] = this.f1007a.f412E[i7];
                    } else if (this.f1010d.f785j[this.f1014h + 3 + i7] < this.f1007a.f413F[i7]) {
                        this.f1010d.f785j[this.f1014h + 3 + i7] = this.f1007a.f413F[i7];
                        this.f1010d.f785j[this.f1014h + 5 + i7] = this.f1010d.f785j[this.f1014h + 3 + i7] + this.f1007a.f414G[i7];
                    }
                    if (this.f1010d.f785j[this.f1014h + 5 + i7] > this.f1007a.f412E[i7]) {
                        this.f1010d.f785j[this.f1014h + 3 + i7] = this.f1007a.f412E[i7] - this.f1007a.f414G[i7];
                        this.f1010d.f785j[this.f1014h + 5 + i7] = this.f1007a.f412E[i7];
                    } else if (this.f1010d.f785j[this.f1014h + 5 + i7] < this.f1007a.f413F[i7]) {
                        this.f1010d.f785j[this.f1014h + 3 + i7] = this.f1007a.f413F[i7];
                        this.f1010d.f785j[this.f1014h + 5 + i7] = this.f1010d.f785j[this.f1014h + 3 + i7] + this.f1007a.f414G[i7];
                    }
                    this.f1028v[i7] = 0.0f;
                }
                float[] fArr8 = this.f1028v;
                fArr8[i7] = fArr8[i7] + EffectSource.m101l(this.f1030x);
            }
            this.f1010d.f785j[this.f1014h] = this.f1026t[0] * fArr4[0];
            this.f1010d.f785j[this.f1014h + 1] = fArr4[1] * this.f1026t[1];
            this.f1010d.f785j[this.f1014h + 2] = fArr5[2];
        } else if (this.f1012f.f538c[4] > 0) {
            this.f1012f.multiVertexColors(this.f1022p.m397a(0, EffectSource.m101l(this.f1030x)), this.f1022p.m397a(1, EffectSource.m101l(this.f1030x)), this.f1022p.m397a(2, EffectSource.m101l(this.f1030x)), this.f1022p.m397a(3, EffectSource.m101l(this.f1030x)));
        }
        this.f1024r += EffectSource.m101l(this.f1030x);
        this.f1025s -= EffectSource.m101l(this.f1030x);
        if (this.f1025s <= 0.0f) {
            this.f1011e = false;
            if (this.f1007a.f416I) {
                this.f1010d.f785j[this.f1014h] = 0.0f;
                this.f1010d.f785j[this.f1014h + 1] = 0.0f;
            }
        }
        if (this.f1007a.getClassType() != 22 || i >= 4) {
            return;
        }
        this.f1023q.set(this.f1010d.f783h[this.f1013g], this.f1010d.f783h[this.f1013g + 1], this.f1010d.f783h[this.f1013g + 2]);
        ((EffectSource) this.f1007a).setPosition(this.f1023q);
        EffectSource.m82a((EffectSource) this.f1007a, EffectSource.m101l(this.f1030x));
        EffectSource.m85a((EffectSource) this.f1007a, this.f1019m);
        EffectSource.m84a((EffectSource) this.f1007a, i + 1);
    }

    /* JADX INFO: renamed from: a */
    final void m519a(int i, Vector3D vector3D) {
        float[] fArr = new float[7];
        this.f1013g = i * 3;
        this.f1027u = i << 2;
        this.f1014h = i * 7;
        this.f1010d = EffectSource.m90b(this.f1030x)[C0039bk.m436a(EffectSource.m91c(this.f1030x))];
        EffectSource.m88a()[EffectSource.m93d(this.f1030x)].mo429a(this.f1029w);
        this.f1010d.f783h[this.f1013g] = this.f1029w[0];
        this.f1010d.f783h[this.f1013g + 1] = this.f1029w[1];
        this.f1010d.f783h[this.f1013g + 2] = this.f1029w[2];
        this.f1016j.set(0.0f, 0.0f, 0.0f);
        this.f1018l.set(0.0f, 0.0f, 0.0f);
        if (EffectSource.m93d(this.f1030x) == 4) {
            this.f1016j.set((this.f1029w[0] - EffectSource.m94e(this.f1030x).getX()) / EffectSource.m95f(this.f1030x).getX(), (this.f1029w[1] - EffectSource.m94e(this.f1030x).getY()) / EffectSource.m95f(this.f1030x).getX(), (this.f1029w[2] - EffectSource.m94e(this.f1030x).getZ()) / EffectSource.m95f(this.f1030x).getX());
        } else {
            this.f1016j.set(EffectSource.m96g(this.f1030x).m479a(0), EffectSource.m96g(this.f1030x).m479a(1), EffectSource.m96g(this.f1030x).m479a(2));
        }
        if (EffectSource.m97h(this.f1030x)) {
            this.f1016j.normalize(this.f1016j);
        }
        EffectSource.m98i(this.f1030x).m268b(this.f1016j, this.f1016j);
        if (this.f1010d.f778c.f400h == 22) {
            this.f1007a = this.f1010d.f781f[i];
        } else {
            this.f1007a = this.f1010d.f778c;
        }
        this.f1015i.m492a(this.f1007a.f420d.m437a(), 0.0f, this.f1007a.f421e.m437a(), this.f1007a.f422f, this.f1007a.f423g);
        this.f1008b.m398a(this.f1007a.f429u, this.f1007a.f432x, this.f1007a.f433y, this.f1007a.f430v, this.f1007a.f431w);
        this.f1009c.m398a(this.f1007a.f424p, this.f1007a.f427s, this.f1007a.f428t, this.f1007a.f425q, this.f1007a.f426r);
        if (this.f1007a.f416I) {
            Particle particle = this.f1007a;
            if (particle.f418b != null) {
                particle.f418b.m337b(7).m468b(0, fArr, 0, 1);
            }
            this.f1026t[0] = fArr[0];
            this.f1026t[1] = fArr[1];
            fArr[0] = fArr[0] * this.f1008b.m396a(0);
            fArr[1] = fArr[1] * this.f1008b.m396a(1);
            fArr[2] = this.f1009c.m396a(2);
            for (int i2 = 0; i2 < 7; i2++) {
                this.f1010d.f785j[this.f1014h + i2] = fArr[i2];
            }
        } else {
            this.f1012f = this.f1010d.f782g[this.f1010d.f779d];
            this.f1010d.f779d++;
            if (this.f1010d.f779d >= EffectSource.m99j(this.f1030x)) {
                this.f1010d.f779d = 0;
            }
        }
        if (vector3D != null) {
            this.f1017k.set(vector3D);
        }
        this.f1028v[0] = 0.0f;
        this.f1028v[1] = 0.0f;
        this.f1011e = true;
        this.f1025s = this.f1007a.f419c.m437a();
        this.f1024r = 0.0f;
        this.f1022p.m398a(this.f1007a.f434z, this.f1007a.f410C, this.f1007a.f411D, this.f1007a.f408A, this.f1007a.f409B);
        if (!this.f1007a.f416I) {
            if (this.f1012f.f538c[4] > 0) {
                this.f1012f.multiVertexColors(this.f1022p.m396a(0), this.f1022p.m396a(1), this.f1022p.m396a(2), this.f1022p.m396a(3));
            }
        } else {
            for (int i3 = 0; i3 < 4; i3++) {
                this.f1010d.f784i[this.f1027u + i3] = (byte) (this.f1022p.m396a(i3) * 255.0f);
            }
        }
    }
}
