package p000;

/* JADX INFO: renamed from: ak */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0011ak {

    /* JADX INFO: renamed from: a */
    public int f53a;

    /* JADX INFO: renamed from: b */
    private String[] f54b;

    /* JADX INFO: renamed from: c */
    private int f55c;

    /* JADX INFO: renamed from: d */
    private int f56d;

    /* JADX INFO: renamed from: e */
    private int f57e;

    public C0011ak() {
        this.f56d = 0;
        this.f57e = 0;
    }

    public C0011ak(int i, String[] strArr) {
        this.f56d = 0;
        this.f57e = 0;
        this.f53a = 1;
        this.f54b = strArr;
        this.f55c = 0;
        this.f56d = 0;
        this.f57e = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m44a() {
        this.f55c = 0;
        this.f56d = 0;
        this.f57e = 0;
    }

    /* JADX INFO: renamed from: b */
    public final String m45b() {
        if (this.f55c == this.f54b.length) {
            return null;
        }
        String lowerCase = this.f54b[this.f55c].toLowerCase();
        if (this.f56d == lowerCase.length() + 20) {
            this.f55c++;
            this.f56d = 0;
            this.f57e = 0;
            return lowerCase;
        }
        if (this.f56d >= lowerCase.length() + 20) {
            return lowerCase;
        }
        this.f56d++;
        if (this.f56d > lowerCase.length()) {
            return lowerCase;
        }
        this.f57e++;
        return lowerCase;
    }

    /* JADX INFO: renamed from: c */
    public final int m46c() {
        return this.f57e;
    }
}
