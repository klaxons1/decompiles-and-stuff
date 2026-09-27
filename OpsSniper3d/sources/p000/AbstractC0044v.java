package p000;

import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public abstract class AbstractC0044v extends AbstractC0042t {

    /* JADX INFO: renamed from: a */
    private Transform f325a;

    public AbstractC0044v() {
        this.f325a = new Transform();
    }

    public AbstractC0044v(int i, String str, int i2, float[] fArr) {
        super(i, str, i2, fArr);
        this.f325a = new Transform();
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: a */
    public final float mo171a(float f) {
        this.f312h += f;
        if (this.f312h > 75.0f) {
            this.f312h = 75.0f;
            return 0.0f;
        }
        this.f325a.postRotate(f, 1.0f, 0.0f, 0.0f);
        return f;
    }

    /* JADX INFO: renamed from: a */
    public final void m225a(Transform transform) {
        this.f325a = transform;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: a */
    public final float[] mo174a(float[] fArr) {
        float[] fArr2 = new float[3];
        C0027e c0027eM211d = m211d(fArr);
        if (c0027eM211d == null) {
            fArr2[0] = fArr[0];
            fArr2[1] = fArr[1];
            fArr2[2] = fArr[2];
        } else {
            float[] fArr3 = c0027eM211d.f167a;
            float[] fArr4 = {fArr3[0], 0.0f, fArr3[2]};
            Math.toDegrees((float) C0003ac.m16a(((double) C0034l.m184a(fArr, fArr3)) / (Math.sqrt(((fArr[0] * fArr[0]) + (fArr[1] * fArr[1])) + (fArr[2] * fArr[2])) * Math.sqrt((fArr3[2] * fArr3[2]) + ((fArr3[0] * fArr3[0]) + (fArr3[1] * fArr3[1]))))));
            fArr4[0] = -fArr4[0];
            fArr4[1] = -fArr4[1];
            fArr4[2] = -fArr4[2];
            float fM184a = (float) ((((double) C0034l.m184a(fArr, fArr4)) / (Math.sqrt(((fArr[0] * fArr[0]) + (fArr[1] * fArr[1])) + (fArr[2] * fArr[2])) * Math.sqrt(((fArr4[0] * fArr4[0]) + (fArr4[1] * fArr4[1])) + (fArr4[2] * fArr4[2])))) * ((double) C0034l.m183a(fArr)));
            fArr2[0] = fArr4[0] * fM184a;
            fArr2[1] = fArr4[1] * fM184a;
            fArr2[2] = fM184a * fArr4[2];
            if (m211d(fArr2) != null) {
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
            }
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
        this.f325a.postRotate(-f, 1.0f, 0.0f, 0.0f);
        return f;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: c */
    public final float mo176c(float f) {
        this.f325a.postRotate(-this.f312h, 1.0f, 0.0f, 0.0f);
        this.f325a.postRotate(f, 0.0f, 1.0f, 0.0f);
        this.f325a.postRotate(this.f312h, 1.0f, 0.0f, 0.0f);
        this.f313i += f;
        return f;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: d */
    public final float mo177d(float f) {
        this.f325a.postRotate(-this.f312h, 1.0f, 0.0f, 0.0f);
        this.f325a.postRotate(-f, 0.0f, 1.0f, 0.0f);
        this.f325a.postRotate(this.f312h, 1.0f, 0.0f, 0.0f);
        this.f313i -= f;
        return f;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: d */
    public void mo10d() {
        super.mo10d();
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: e */
    public void mo11e() {
        super.mo11e();
        this.f325a.setIdentity();
    }

    /* JADX INFO: renamed from: e */
    public final void m226e(float[] fArr) {
        m207b(fArr);
        float[] fArr2 = this.f309c;
        fArr2[0] = fArr2[0] + fArr[0];
        float[] fArr3 = this.f309c;
        fArr3[1] = fArr3[1] + fArr[1];
        float[] fArr4 = this.f309c;
        fArr4[2] = fArr4[2] + fArr[2];
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: f */
    public final void mo178f() {
        if (this.f308b == 0) {
            C0000a.m0a().m2a(this);
        }
        this.f311g.m189c().setTranslation(this.f309c[0], this.f309c[1], this.f309c[2]);
        this.f311g.m189c().setTransform(this.f325a);
    }

    /* JADX INFO: renamed from: g */
    public final void m227g() {
        this.f312h = 0.0f;
        this.f313i = 0.0f;
        this.f325a.setIdentity();
    }
}
