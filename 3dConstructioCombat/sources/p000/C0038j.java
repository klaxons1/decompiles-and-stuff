package p000;

import javax.microedition.lcdui.Graphics;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public class C0038j extends C0002ab {

    /* JADX INFO: renamed from: Y */
    public C0002ab f460Y;

    /* JADX INFO: renamed from: Z */
    public World f461Z;

    /* JADX INFO: renamed from: aa */
    public Graphics3D f462aa;

    /* JADX INFO: renamed from: ab */
    public C0037i[] f463ab;

    /* JADX INFO: renamed from: ac */
    public int f464ac;

    /* JADX INFO: renamed from: ad */
    public C0040l[] f465ad;

    /* JADX INFO: renamed from: ae */
    public int f466ae;

    /* JADX INFO: renamed from: af */
    public Background f467af;

    public C0038j(C0006af c0006af) {
        super(c0006af);
        this.f462aa = Graphics3D.getInstance();
        this.f463ab = new C0037i[0];
        this.f465ad = new C0040l[0];
        this.f467af = new Background();
        this.f460Y = new C0002ab(c0006af);
        this.f467af.setDepthClearEnable(true);
        this.f467af.setColorClearEnable(false);
        this.f461Z = new World();
        this.f18F = this.f461Z;
        this.f456L = this.f18F;
        this.f461Z.setBackground(this.f467af);
        this.f461Z.addChild(this.f460Y.f456L);
    }

    /* JADX INFO: renamed from: a */
    public void mo60a(int i) {
        for (int i2 = 0; i2 < this.f466ae; i2++) {
            C0040l c0040l = this.f465ad[i2];
            if (c0040l.f474d != 0) {
                c0040l.f477g += i;
                if (c0040l.f477g > c0040l.f474d) {
                    c0040l.f477g -= c0040l.f474d;
                    if (c0040l.f476f == -1) {
                        c0040l.f475e++;
                        if (c0040l.f475e < c0040l.f481k.f235f) {
                            c0040l.m302b();
                        } else if (c0040l.f478h) {
                            c0040l.mo19c();
                        } else {
                            c0040l.f475e = 0;
                            c0040l.m302b();
                        }
                    } else {
                        if (c0040l.f476f < c0040l.f475e) {
                            c0040l.f475e--;
                        } else if (c0040l.f476f > c0040l.f475e) {
                            c0040l.f475e++;
                        } else if (c0040l.f478h) {
                            c0040l.mo19c();
                        }
                        c0040l.m302b();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m287a(Graphics graphics, C0027b c0027b) {
        if (this.f460Y.f17E > 0 && c0027b.f458N != null) {
            this.f460Y.f456L.setTranslation(c0027b.f458N[3], c0027b.f458N[7], c0027b.f458N[11]);
        }
        try {
            this.f462aa.bindTarget(graphics);
            this.f462aa.render(this.f461Z);
        } finally {
            this.f462aa.releaseTarget();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m288a(C0040l c0040l) {
        int i = 0;
        while (i < this.f466ae && this.f465ad[i] != c0040l) {
            i++;
        }
        if (i == this.f466ae) {
            if (this.f465ad.length < this.f466ae + 1) {
                C0040l[] c0040lArr = new C0040l[this.f466ae + 1];
                System.arraycopy(this.f465ad, 0, c0040lArr, 0, this.f465ad.length);
                this.f465ad = c0040lArr;
            }
            this.f465ad[this.f466ae] = c0040l;
            this.f466ae++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m289b(C0040l c0040l) {
        int i = 0;
        while (i < this.f466ae && this.f465ad[i] != c0040l) {
            i++;
        }
        if (i != this.f466ae) {
            this.f465ad[i] = null;
            System.arraycopy(this.f465ad, i + 1, this.f465ad, i, this.f466ae - (i + 1));
            this.f466ae--;
            this.f465ad[this.f466ae] = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m290c(C0037i c0037i) {
        int i = 0;
        while (i < this.f464ac && this.f463ab[i] != c0037i) {
            i++;
        }
        if (i == this.f464ac) {
            if (this.f463ab.length < this.f464ac + 1) {
                C0037i[] c0037iArr = new C0037i[this.f464ac + 1];
                System.arraycopy(this.f463ab, 0, c0037iArr, 0, this.f463ab.length);
                this.f463ab = c0037iArr;
            }
            this.f463ab[this.f464ac] = c0037i;
            this.f464ac++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m291d(C0037i c0037i) {
        int i = 0;
        while (i < this.f464ac && this.f463ab[i] != c0037i) {
            i++;
        }
        if (i != this.f464ac) {
            this.f463ab[i] = null;
            System.arraycopy(this.f463ab, i + 1, this.f463ab, i, this.f464ac - (i + 1));
            this.f464ac--;
            this.f463ab[this.f464ac] = null;
        }
    }
}
