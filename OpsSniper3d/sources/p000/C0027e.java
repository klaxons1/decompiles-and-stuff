package p000;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0027e {

    /* JADX INFO: renamed from: a */
    public float[] f167a;

    /* JADX INFO: renamed from: b */
    private float[] f168b;

    /* JADX INFO: renamed from: c */
    private float f169c;

    /* JADX INFO: renamed from: d */
    private float[] f170d;

    /* JADX INFO: renamed from: e */
    private float[] f171e;

    public C0027e(float[] fArr, float[] fArr2) {
        this.f168b = new float[3];
        this.f170d = new float[3];
        this.f171e = new float[3];
        this.f168b = fArr;
        float[] fArr3 = {fArr2[0] - fArr[0], fArr2[1] - fArr[1], fArr2[2] - fArr[2]};
        this.f169c = C0034l.m183a(fArr3);
        this.f167a = C0034l.m185b(fArr3);
        this.f170d[0] = fArr[0] > fArr2[0] ? fArr2[0] : fArr[0];
        this.f170d[1] = fArr[1] > fArr2[1] ? fArr2[1] : fArr[1];
        this.f170d[2] = fArr[2] > fArr2[2] ? fArr2[2] : fArr[2];
        this.f171e[0] = fArr[0] < fArr2[0] ? fArr2[0] : fArr[0];
        this.f171e[1] = fArr[1] < fArr2[1] ? fArr2[1] : fArr[1];
        this.f171e[2] = fArr[2] < fArr2[2] ? fArr2[2] : fArr[2];
    }

    public C0027e(float[] fArr, float[] fArr2, float f) {
        this.f168b = new float[3];
        this.f170d = new float[3];
        this.f171e = new float[3];
        this.f168b = fArr;
        this.f169c = C0034l.m183a(fArr2) * f;
        this.f167a = C0034l.m185b(fArr2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m127a(C0027e c0027e) {
        float[] fArr = {c0027e.f168b[0] - this.f168b[0], c0027e.f168b[1] - this.f168b[1], c0027e.f168b[2] - this.f168b[2]};
        float[] fArrM186b = C0034l.m186b(this.f167a, c0027e.f167a);
        float f = (fArrM186b[0] * fArrM186b[0]) + (fArrM186b[1] * fArrM186b[1]) + (fArrM186b[2] * fArrM186b[2]);
        if (f == 0.0f) {
            return false;
        }
        float fM184a = C0034l.m184a(C0034l.m186b(fArr, c0027e.f167a), fArrM186b) / f;
        if (fM184a > this.f169c || fM184a < 0.0f) {
            return false;
        }
        float fM184a2 = C0034l.m184a(C0034l.m186b(fArr, this.f167a), fArrM186b) / f;
        return fM184a2 <= c0027e.f169c && fM184a2 >= 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m128a() {
        return this.f170d;
    }

    /* JADX INFO: renamed from: b */
    public final float[] m129b() {
        return this.f171e;
    }
}
