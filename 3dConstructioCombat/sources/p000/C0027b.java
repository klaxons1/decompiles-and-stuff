package p000;

import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0027b extends C0037i {

    /* JADX INFO: renamed from: a */
    public Camera f326a;

    /* JADX INFO: renamed from: b */
    public C0025ay f327b;

    /* JADX INFO: renamed from: c */
    public C0025ay f328c;

    /* JADX INFO: renamed from: d */
    public C0025ay f329d;

    public C0027b(C0006af c0006af) {
        super(c0006af);
        this.f327b = new C0025ay();
        this.f328c = new C0025ay();
        this.f329d = new C0025ay();
        this.f453I |= 32;
        this.f326a = new Camera();
        this.f456L = this.f326a;
        this.f452H.f47c.f461Z.setActiveCamera(this.f326a);
    }

    /* JADX INFO: renamed from: a */
    public final void m182a(C0025ay c0025ay, C0025ay c0025ay2, C0025ay c0025ay3) {
        C0031c.m243f(this.f328c, c0025ay2);
        C0031c.m243f(this.f329d, c0025ay3);
        C0031c.m234c(this.f327b, this.f328c, this.f329d);
        C0031c.m239d(this.f327b);
        C0031c.m234c(this.f329d, this.f327b, this.f328c);
        if (this.f457M == null) {
            this.f457M = new Transform();
            this.f458N = new float[16];
            this.f458N[15] = 1.0f;
        }
        this.f458N[0] = C0037i.m284d(this.f327b.f249a);
        this.f458N[4] = C0037i.m284d(this.f327b.f250b);
        this.f458N[8] = C0037i.m284d(this.f327b.f251c);
        this.f458N[1] = C0037i.m284d(this.f329d.f249a);
        this.f458N[5] = C0037i.m284d(this.f329d.f250b);
        this.f458N[9] = C0037i.m284d(this.f329d.f251c);
        this.f458N[2] = -C0037i.m284d(this.f328c.f249a);
        this.f458N[6] = -C0037i.m284d(this.f328c.f250b);
        this.f458N[10] = -C0037i.m284d(this.f328c.f251c);
        this.f458N[3] = C0037i.m284d(c0025ay.f249a);
        this.f458N[7] = C0037i.m284d(c0025ay.f250b);
        this.f458N[11] = C0037i.m284d(c0025ay.f251c);
        this.f457M.set(this.f458N);
        this.f456L.setTransform(this.f457M);
    }

    /* JADX INFO: renamed from: b */
    public final void m183b(int i, int i2, int i3) {
        this.f326a.setPerspective(C0037i.m284d(C0031c.m240e(i)), 1.0f, C0037i.m284d(i2), C0037i.m284d(i3));
    }
}
