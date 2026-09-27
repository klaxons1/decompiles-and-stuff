package p000;

/* JADX INFO: renamed from: am */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0013am {

    /* JADX INFO: renamed from: a */
    private float[] f58a;

    /* JADX INFO: renamed from: b */
    private float f59b;

    public C0013am() {
        this.f58a = new float[3];
    }

    public C0013am(float[] fArr, float f) {
        this.f58a = new float[3];
        this.f58a = fArr;
        this.f59b = f;
    }

    /* JADX INFO: renamed from: a */
    public final void m50a(float f) {
        this.f59b = f;
    }

    /* JADX INFO: renamed from: a */
    public final void m51a(float f, float f2, float f3) {
        this.f58a[0] = f;
        this.f58a[1] = 0.0f;
        this.f58a[2] = f3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52a(C0013am c0013am) {
        float[] fArr = c0013am.f58a;
        return ((fArr[2] - this.f58a[2]) * (fArr[2] - this.f58a[2])) + (((fArr[0] - this.f58a[0]) * (fArr[0] - this.f58a[0])) + ((fArr[1] - this.f58a[1]) * (fArr[1] - this.f58a[1]))) <= (this.f59b + c0013am.f59b) * (this.f59b + c0013am.f59b);
    }

    /* JADX INFO: renamed from: a */
    public final float[] m53a() {
        return this.f58a;
    }

    /* JADX INFO: renamed from: b */
    public final float m54b() {
        return this.f59b;
    }
}
