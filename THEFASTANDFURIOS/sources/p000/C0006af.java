package p000;

/* JADX INFO: renamed from: af */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
public final class C0006af {

    /* JADX INFO: renamed from: a */
    public C0012g[] f60a;

    /* JADX INFO: renamed from: b */
    public C0006af f61b;

    /* JADX INFO: renamed from: d */
    public int f63d;

    /* JADX INFO: renamed from: e */
    public int f64e;

    /* JADX INFO: renamed from: c */
    public int f62c = 0;

    /* JADX INFO: renamed from: f */
    public boolean f65f = false;

    public C0006af(C0022q c0022q, int i, C0012g[] c0012gArr, int i2, int i3) {
        this.f61b = null;
        this.f64e = i3;
        this.f60a = c0012gArr;
        this.f63d = i2;
        for (int i4 = 0; i4 < this.f63d; i4++) {
            if (this.f60a[i4] != null && this.f60a[i4].f254e != null) {
                this.f60a[i4].f254e.f61b = this;
            }
        }
    }
}
