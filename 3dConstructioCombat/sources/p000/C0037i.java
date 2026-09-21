package p000;

import javax.microedition.m3g.Node;
import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public class C0037i {

    /* JADX INFO: renamed from: G */
    public C0002ab f451G;

    /* JADX INFO: renamed from: H */
    public C0006af f452H;

    /* JADX INFO: renamed from: I */
    public int f453I;

    /* JADX INFO: renamed from: J */
    public C0025ay f454J = new C0025ay();

    /* JADX INFO: renamed from: K */
    public C0034f f455K = new C0034f();

    /* JADX INFO: renamed from: L */
    public Node f456L;

    /* JADX INFO: renamed from: M */
    public Transform f457M;

    /* JADX INFO: renamed from: N */
    public float[] f458N;

    /* JADX INFO: renamed from: O */
    public boolean f459O;

    public C0037i(C0006af c0006af) {
        if (this.f452H == null) {
            this.f452H = c0006af;
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m284d(int i) {
        return i / 65536.0f;
    }

    /* JADX INFO: renamed from: a */
    public void mo251a(int i, int i2, int i3) {
        this.f456L.setTranslation(m284d(i), m284d(i2), m284d(i3));
        this.f454J.m173a(i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public void mo252a(C0002ab c0002ab) {
        this.f451G = c0002ab;
    }

    /* JADX INFO: renamed from: a */
    public void mo254a(C0025ay c0025ay) {
        this.f456L.setTranslation(m284d(c0025ay.f249a), m284d(c0025ay.f250b), m284d(c0025ay.f251c));
        this.f454J.m174a(c0025ay);
    }

    /* JADX INFO: renamed from: a */
    public final void m285a(C0034f c0034f) {
        this.f455K.m279a(c0034f);
        if (this.f457M == null) {
            this.f457M = new Transform();
            this.f458N = new float[16];
            this.f458N[15] = 1.0f;
        }
        this.f458N[0] = m284d(this.f455K.m277a(0, 0));
        this.f458N[4] = m284d(this.f455K.m277a(1, 0));
        this.f458N[8] = m284d(this.f455K.m277a(2, 0));
        this.f458N[1] = m284d(this.f455K.m277a(0, 1));
        this.f458N[5] = m284d(this.f455K.m277a(1, 1));
        this.f458N[9] = m284d(this.f455K.m277a(2, 1));
        this.f458N[2] = m284d(this.f455K.m277a(0, 2));
        this.f458N[6] = m284d(this.f455K.m277a(1, 2));
        this.f458N[10] = m284d(this.f455K.m277a(2, 2));
        this.f457M.set(this.f458N);
        this.f456L.setTransform(this.f457M);
    }

    /* JADX INFO: renamed from: c */
    public void mo19c() {
        if (this.f451G != null) {
            this.f451G.m18b(this);
        }
        this.f452H.m51b(this);
        this.f459O = true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m286c(int i) {
        return (this.f453I & i) > 0;
    }
}
