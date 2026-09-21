package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Sprite3D;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0040l extends AbstractC0023aw {

    /* JADX INFO: renamed from: a */
    public int f471a;

    /* JADX INFO: renamed from: b */
    public int f472b;

    /* JADX INFO: renamed from: c */
    public int f473c;

    /* JADX INFO: renamed from: d */
    public int f474d;

    /* JADX INFO: renamed from: e */
    public int f475e;

    /* JADX INFO: renamed from: f */
    public int f476f;

    /* JADX INFO: renamed from: g */
    public int f477g;

    /* JADX INFO: renamed from: h */
    public boolean f478h;

    /* JADX INFO: renamed from: i */
    public boolean f479i;

    /* JADX INFO: renamed from: j */
    public Sprite3D f480j;

    /* JADX INFO: renamed from: k */
    public C0019as f481k;

    /* JADX INFO: renamed from: l */
    public String f482l;

    /* JADX INFO: renamed from: m */
    public Appearance f483m;

    /* JADX INFO: renamed from: n */
    public CompositingMode f484n;

    public C0040l(C0006af c0006af) {
        super(c0006af);
        this.f483m = new Appearance();
        this.f453I |= 8;
        this.f476f = -1;
        m303b(1);
        this.f452H.f47c.m288a(this);
    }

    /* JADX INFO: renamed from: d */
    private void m297d() {
        if (this.f456L != null && this.f456L.getParent() != null) {
            this.f456L.getParent().removeChild(this.f456L);
        }
        this.f456L = null;
        if (this.f479i) {
            this.f452H.f48d.m76a(this.f482l, this.f480j);
        }
        this.f479i = false;
        this.f480j = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m298a() {
        if (this.f484n == null) {
            this.f484n = new CompositingMode();
        }
        this.f484n.setAlphaThreshold(0.5f);
        this.f484n.setDepthWriteEnable(false);
        this.f483m.setCompositingMode(this.f484n);
        this.f480j.setAppearance(this.f483m);
    }

    /* JADX INFO: renamed from: a */
    public final void m299a(int i) {
        this.f475e = i;
        m302b();
    }

    /* JADX INFO: renamed from: a */
    public final void m300a(int i, int i2, String str) {
        boolean z = true;
        m297d();
        this.f482l = str;
        this.f481k = this.f452H.f48d.m79c(str);
        if (this.f481k.f237h) {
            this.f471a = this.f481k.f232c;
            this.f472b = this.f481k.f230a;
            this.f473c = this.f481k.f231b;
            this.f480j = this.f452H.f48d.m80d(str);
            if (this.f480j == null) {
                this.f480j = new Sprite3D(true, this.f481k.f236g, this.f483m);
                z = false;
            } else {
                this.f480j.setAppearance(this.f483m);
            }
            this.f479i = z;
            this.f480j.setScale(i / 200.0f, i2 / 200.0f, 1.0f);
        } else {
            this.f471a = this.f481k.f232c;
            this.f472b = this.f481k.f230a;
            this.f473c = this.f481k.f231b;
            this.f480j = new Sprite3D(false, this.f481k.f236g, this.f483m);
            this.f479i = false;
        }
        this.f456L = this.f480j;
        if (this.f451G != null) {
            this.f451G.f18F.addChild(this.f456L);
        }
        this.f475e = 0;
        this.f474d = 0;
        this.f477g = 0;
        this.f478h = false;
        this.f480j.setCrop(0, 0, this.f472b, this.f473c);
        m299a(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m301a(boolean z, boolean z2) {
        CompositingMode compositingMode;
        int i;
        if (this.f484n == null) {
            this.f484n = new CompositingMode();
        }
        if (!z) {
            compositingMode = this.f484n;
            i = 68;
        } else if (z2) {
            compositingMode = this.f484n;
            i = 65;
        } else {
            compositingMode = this.f484n;
            i = 64;
        }
        compositingMode.setBlending(i);
        this.f483m.setCompositingMode(this.f484n);
        this.f480j.setAppearance(this.f483m);
    }

    /* JADX INFO: renamed from: b */
    public final void m302b() {
        if (this.f480j == null) {
            return;
        }
        int i = this.f471a / this.f472b;
        this.f480j.setCrop(((this.f475e + this.f481k.f234e) % i) * this.f472b, ((this.f475e + this.f481k.f234e) / i) * this.f473c, this.f472b, this.f473c);
    }

    /* JADX INFO: renamed from: b */
    public final void m303b(int i) {
        this.f483m.setLayer(i + 1);
    }

    @Override // p000.C0037i
    /* JADX INFO: renamed from: c */
    public final void mo19c() {
        this.f452H.f47c.m289b(this);
        m297d();
        super.mo19c();
    }
}
