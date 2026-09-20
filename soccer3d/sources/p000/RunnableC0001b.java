package p000;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: C:\Temp\jadx-9991838165078942717\classes.dex */
public class RunnableC0001b implements Runnable {

    /* JADX INFO: renamed from: a */
    private C0005e f2a;

    /* JADX INFO: renamed from: b */
    private int f3b;

    /* JADX INFO: renamed from: c */
    private C0004d f4c;

    public RunnableC0001b(C0004d c0004d, C0005e c0005e, int i) {
        this.f4c = c0004d;
        this.f2a = c0005e;
        this.f3b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.f3b) {
            case -6:
                this.f4c.m88n();
                break;
            case -5:
                this.f4c.m95y();
                break;
            case -4:
                this.f4c.m49E();
                break;
            case -3:
                this.f4c.m68e();
                break;
            case -2:
                this.f4c.m83i();
                break;
            case -1:
                int i5 = this.f4c.f159f[this.f4c.f119bK[406] + 527];
                int i6 = this.f4c.f159f[this.f4c.f119bK[407] + 527];
                if (i6 != i5 && i6 != this.f4c.f159f[i5 + 561]) {
                    i = this.f4c.f159f[(this.f4c.f119bK[406] * 4) + 585 + 1];
                    i2 = this.f4c.f159f[(this.f4c.f119bK[406] * 4) + 585 + 0];
                    i3 = this.f4c.f159f[(this.f4c.f119bK[407] * 4) + 585 + 1];
                    i4 = this.f4c.f159f[(this.f4c.f119bK[407] * 4) + 585 + 0];
                } else if (this.f4c.f114bF) {
                    i = this.f4c.f159f[(this.f4c.f119bK[406] * 4) + 585 + 3];
                    i2 = this.f4c.f159f[(this.f4c.f119bK[406] * 4) + 585 + 2];
                    i3 = this.f4c.f159f[(this.f4c.f119bK[407] * 4) + 585 + 1];
                    i4 = this.f4c.f159f[(this.f4c.f119bK[407] * 4) + 585 + 0];
                } else {
                    i = this.f4c.f159f[(this.f4c.f119bK[406] * 4) + 585 + 1];
                    i2 = this.f4c.f159f[(this.f4c.f119bK[406] * 4) + 585 + 0];
                    i3 = this.f4c.f159f[(this.f4c.f119bK[407] * 4) + 585 + 3];
                    i4 = this.f4c.f159f[(this.f4c.f119bK[407] * 4) + 585 + 2];
                }
                this.f4c.f152bw = this.f2a.m146e(2);
                this.f4c.f42N = this.f2a.m146e(14);
                this.f4c.f166m = this.f2a.m146e(13);
                this.f4c.f129bU = this.f2a.m146e(12);
                this.f4c.f123bO = this.f2a.m146e(11);
                this.f4c.f73aR = this.f2a.m147e(10, i4);
                this.f4c.f89ah = this.f2a.m147e(8, i4);
                this.f4c.f99ar = this.f2a.m147e(9, i3);
                this.f4c.f110bB = this.f2a.m147e(8, i3);
                this.f4c.f105ax = this.f2a.m147e(10, i2);
                this.f4c.f50V = this.f2a.m147e(8, i2);
                this.f4c.f45Q = this.f2a.m147e(9, i);
                this.f4c.f141bl = this.f2a.m147e(8, i);
                this.f4c.f149bt = this.f2a.m146e(6);
                this.f4c.f108b = this.f2a.m146e(7);
                this.f4c.f168o = this.f2a.m146e(5);
                this.f4c.f136bg = this.f2a.m146e(4);
                this.f4c.f157d = this.f2a.m146e(3);
                this.f2a.m161p();
                break;
            default:
                this.f4c.f174u = this.f2a.m146e(this.f3b);
                break;
        }
        System.gc();
    }
}
