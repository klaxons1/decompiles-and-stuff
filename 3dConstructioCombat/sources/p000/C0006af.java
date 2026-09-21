package p000;

/* JADX INFO: renamed from: af */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0006af {

    /* JADX INFO: renamed from: c */
    public C0038j f47c;

    /* JADX INFO: renamed from: a */
    public int f45a = 0;

    /* JADX INFO: renamed from: b */
    public int f46b = 0;

    /* JADX INFO: renamed from: d */
    public C0008ah f48d = new C0008ah();

    /* JADX INFO: renamed from: a */
    public final void m48a() {
        this.f48d.m72a();
    }

    /* JADX INFO: renamed from: a */
    public final void m49a(int i) {
        if (this.f47c == null) {
            throw new RuntimeException("Engine: invalid SceneManager");
        }
        this.f46b++;
        this.f45a += i;
        this.f47c.mo60a(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m50a(C0037i c0037i) {
        if (this.f47c != null) {
            this.f47c.m290c(c0037i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m51b(C0037i c0037i) {
        if (this.f47c != null) {
            this.f47c.m291d(c0037i);
        }
    }
}
