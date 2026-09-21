package p000;

/* JADX INFO: renamed from: ax */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0024ax {

    /* JADX INFO: renamed from: a */
    public C0025ay f247a;

    /* JADX INFO: renamed from: b */
    public C0025ay f248b;

    public C0024ax() {
        this.f247a = new C0025ay();
        this.f248b = new C0025ay();
    }

    public C0024ax(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f247a = new C0025ay(i, i2, i3);
        this.f248b = new C0025ay(i4, i5, i6);
    }

    /* JADX INFO: renamed from: a */
    public final void m170a(int i) {
        this.f247a.f249a = -i;
        this.f247a.f250b = -i;
        this.f247a.f251c = -i;
        this.f248b.f249a = i;
        this.f248b.f250b = i;
        this.f248b.f251c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m171a(C0024ax c0024ax) {
        this.f247a.f249a = c0024ax.f247a.f249a;
        this.f247a.f250b = c0024ax.f247a.f250b;
        this.f247a.f251c = c0024ax.f247a.f251c;
        this.f248b.f249a = c0024ax.f248b.f249a;
        this.f248b.f250b = c0024ax.f248b.f250b;
        this.f248b.f251c = c0024ax.f248b.f251c;
    }
}
