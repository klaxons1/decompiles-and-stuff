package p000;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public final class C0000a {

    /* JADX INFO: renamed from: a */
    public int f2a;

    /* JADX INFO: renamed from: a */
    public C0000a f3a;

    /* JADX INFO: renamed from: a */
    public String f4a;

    /* JADX INFO: renamed from: a */
    public String[] f5a;

    /* JADX INFO: renamed from: b */
    public int f6b;

    /* JADX INFO: renamed from: b */
    public C0000a f7b;

    public C0000a(String str, String[] strArr, int i) {
        this.f4a = str;
        this.f5a = strArr;
        this.f6b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m0a() {
        if (this.f6b == 3) {
            return 6;
        }
        return this.f5a.length;
    }

    /* JADX INFO: renamed from: a */
    public final void m1a(String str) {
        this.f5a[this.f2a] = str;
    }
}
