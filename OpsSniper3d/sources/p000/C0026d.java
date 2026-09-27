package p000;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0026d {

    /* JADX INFO: renamed from: a */
    public float[] f154a;

    /* JADX INFO: renamed from: b */
    public float f155b;

    /* JADX INFO: renamed from: c */
    public float f156c;

    /* JADX INFO: renamed from: d */
    public int f157d;

    /* JADX INFO: renamed from: f */
    public AbstractC0042t[] f159f;

    /* JADX INFO: renamed from: g */
    public AbstractC0042t[] f160g;

    /* JADX INFO: renamed from: h */
    public C0005ae[] f161h;

    /* JADX INFO: renamed from: i */
    public C0001aa[] f162i;

    /* JADX INFO: renamed from: j */
    public boolean f163j;

    /* JADX INFO: renamed from: k */
    public C0009ai[] f164k;

    /* JADX INFO: renamed from: m */
    public C0011ak f166m;

    /* JADX INFO: renamed from: e */
    public boolean f158e = false;

    /* JADX INFO: renamed from: l */
    public int f165l = 0;

    public C0026d() {
    }

    public C0026d(String str, String str2, int i, boolean z, float[] fArr, float f, float f2) {
        this.f157d = i;
        this.f163j = z;
        this.f154a = fArr;
        this.f155b = f;
        this.f156c = f2;
    }

    /* JADX INFO: renamed from: a */
    public final void m126a() {
        if (this.f164k != null) {
            for (int i = 0; i < this.f164k.length; i++) {
                C0009ai c0009ai = this.f164k[i];
                c0009ai.f36b = -1.0f;
                c0009ai.f37c = false;
                if (c0009ai.f35a == -1) {
                    c0009ai.f38d = -16777216;
                } else if (c0009ai.f35a == -2) {
                    c0009ai.f38d = 0;
                }
            }
            this.f165l = 0;
        }
        if (this.f166m != null) {
            this.f166m.m44a();
        }
    }
}
