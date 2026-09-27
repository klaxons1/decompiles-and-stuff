package p000;

import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public abstract class AbstractC0033k extends AbstractC0042t {

    /* JADX INFO: renamed from: a */
    protected int f262a;

    /* JADX INFO: renamed from: k */
    private float[] f263k;

    /* JADX INFO: renamed from: l */
    private Transform f264l;

    /* JADX INFO: renamed from: m */
    private int f265m;

    /* JADX INFO: renamed from: n */
    private int f266n;

    /* JADX INFO: renamed from: o */
    private int f267o;

    public AbstractC0033k() {
        this.f264l = new Transform();
        this.f266n = -1;
        this.f267o = 0;
        this.f262a = 0;
    }

    public AbstractC0033k(int i, String str, int i2, float[] fArr) {
        super(i, str, i2, fArr);
        this.f264l = new Transform();
        this.f266n = -1;
        this.f267o = 0;
        this.f262a = 0;
        this.f311g = new C0041s(this);
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: a */
    public final float mo171a(float f) {
        this.f312h += f;
        if (this.f312h > 75.0f) {
            this.f312h = 75.0f;
            return 0.0f;
        }
        this.f264l.postRotate(f, 1.0f, 0.0f, 0.0f);
        return f;
    }

    /* JADX INFO: renamed from: a */
    public final void m172a(int i) {
        if (i == 0) {
            this.f264l.setIdentity();
        }
        this.f266n = i;
        this.f267o = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m173a(int i, float[] fArr) {
        this.f263k = fArr;
        m172a(i);
        m207b(fArr);
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: a */
    public final float[] mo174a(float[] fArr) {
        float[] fArr2 = new float[3];
        if (m211d(fArr) == null) {
            fArr2[0] = fArr[0];
            fArr2[1] = fArr[1];
            fArr2[2] = fArr[2];
        }
        return fArr2;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: b */
    public final float mo175b(float f) {
        this.f312h -= f;
        if (this.f312h < -75.0f) {
            this.f312h = -75.0f;
            return 0.0f;
        }
        this.f264l.postRotate(-f, 1.0f, 0.0f, 0.0f);
        return f;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: c */
    public final float mo176c(float f) {
        this.f264l.postRotate(-this.f312h, 1.0f, 0.0f, 0.0f);
        this.f264l.postRotate(f, 0.0f, 1.0f, 0.0f);
        this.f264l.postRotate(this.f312h, 1.0f, 0.0f, 0.0f);
        this.f313i += f;
        return f;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: d */
    public final float mo177d(float f) {
        this.f264l.postRotate(-this.f312h, 1.0f, 0.0f, 0.0f);
        this.f264l.postRotate(-f, 0.0f, 1.0f, 0.0f);
        this.f264l.postRotate(this.f312h, 1.0f, 0.0f, 0.0f);
        this.f313i -= f;
        return f;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: d */
    public void mo10d() {
        super.mo10d();
        this.f263k = null;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: e */
    public void mo11e() {
        super.mo11e();
        this.f265m = (C0041s.f297d[1][1] - C0041s.f297d[1][0]) - 1;
        this.f264l.setIdentity();
        this.f266n = -1;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: f */
    public void mo178f() {
        C0041s c0041s;
        boolean z;
        C0019c c0019cM94a = C0019c.m94a();
        int i = 0;
        while (true) {
            if (i >= 5) {
                c0041s = null;
                break;
            }
            if (c0019cM94a.f103a[i].f278c == 0) {
                c0019cM94a.f103a[i].m190d().getAppearance(0).getTexture(0).setImage(C0046x.m244a().f336a[m216q()]);
                m203a(c0019cM94a.f103a[i]);
                c0019cM94a.f103a[i].m188b(this);
                c0019cM94a.f103a[i].m190d().setUserObject(this);
                c0019cM94a.f103a[i].m190d().setRenderingEnable(true);
                c0019cM94a.f103a[i].m190d().setPickingEnable(true);
                if (m216q() == 3) {
                    c0019cM94a.f103a[i].m200a().setRenderingEnable(true);
                    c0019cM94a.f103a[i].m200a().setPickingEnable(true);
                } else {
                    c0019cM94a.f103a[i].m200a().setRenderingEnable(false);
                    c0019cM94a.f103a[i].m200a().setPickingEnable(false);
                }
                c0019cM94a.f103a[i].f278c = 1;
                c0041s = c0019cM94a.f103a[i];
                break;
            }
            i++;
        }
        if (c0041s == null) {
            return;
        }
        if (this.f262a < c0041s.m202f().m93f()) {
            c0041s.m202f().m87a(true);
            c0041s.m202f().m86a(this.f262a);
            this.f262a++;
        }
        c0041s.m189c().setTransform(this.f264l);
        c0041s.m189c().setTranslation(m212m()[0], m212m()[1], m212m()[2]);
        if (this.f266n == 0 || this.f266n == -1) {
            z = true;
        } else {
            float[] fArrM212m = m212m();
            float[] fArrM212m2 = C0045w.m228a().m240f().f18g.m212m();
            float f = ((fArrM212m2[2] - fArrM212m[2]) * (fArrM212m2[2] - fArrM212m[2])) + ((fArrM212m2[0] - fArrM212m[0]) * (fArrM212m2[0] - fArrM212m[0]));
            float f2 = C0045w.m228a().m240f().f17f;
            z = f < f2 * f2;
        }
        if (z) {
            this.f311g.m189c().animate(this.f265m * 50);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m179g() {
        int i = C0041s.f297d[m216q() == 1 ? (char) 11 : (char) 1][1];
        float[] fArr = this.f309c;
        fArr[0] = fArr[0] + (this.f263k[0] / i);
        float[] fArr2 = this.f309c;
        fArr2[1] = fArr2[1] + (this.f263k[1] / i);
        float[] fArr3 = this.f309c;
        fArr3[2] = (this.f263k[2] / i) + fArr3[2];
    }

    /* JADX INFO: renamed from: h */
    public final void m180h() {
        if (m181i()) {
            return;
        }
        this.f265m = C0041s.f297d[this.f266n][0] + (this.f267o - 1);
        this.f267o++;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m181i() {
        return this.f266n == -1 || this.f267o > C0041s.f297d[this.f266n][1];
    }

    /* JADX INFO: renamed from: j */
    public final int m182j() {
        return this.f266n;
    }
}
