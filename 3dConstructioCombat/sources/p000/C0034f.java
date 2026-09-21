package p000;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0034f {

    /* JADX INFO: renamed from: a */
    public int[] f439a = new int[9];

    public C0034f() {
        this.f439a[0] = 65536;
        this.f439a[4] = 65536;
        this.f439a[8] = 65536;
    }

    /* JADX INFO: renamed from: a */
    public final int m277a(int i, int i2) {
        return this.f439a[(i2 * 3) + i];
    }

    /* JADX INFO: renamed from: a */
    public final void m278a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f439a[0] = i;
        this.f439a[3] = i2;
        this.f439a[6] = i3;
        this.f439a[1] = i4;
        this.f439a[4] = i5;
        this.f439a[7] = i6;
        this.f439a[2] = i7;
        this.f439a[5] = i8;
        this.f439a[8] = i9;
    }

    /* JADX INFO: renamed from: a */
    public final void m279a(C0034f c0034f) {
        System.arraycopy(c0034f.f439a, 0, this.f439a, 0, 9);
    }
}
