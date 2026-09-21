package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Texture2D;

/* JADX INFO: renamed from: ae */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0005ae extends AbstractC0023aw {

    /* JADX INFO: renamed from: a */
    public C0009ai f41a;

    /* JADX INFO: renamed from: b */
    public Appearance[] f42b;

    /* JADX INFO: renamed from: c */
    public Mesh f43c;

    /* JADX INFO: renamed from: d */
    public int f44d;

    public C0005ae(C0006af c0006af) {
        super(c0006af);
        this.f453I |= 4;
        this.f44d = 1;
    }

    /* JADX INFO: renamed from: a */
    private void m43a() {
        if (this.f456L != null && this.f456L.getParent() != null) {
            this.f456L.getParent().removeChild(this.f456L);
        }
        this.f456L = null;
        this.f43c = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m44a(int i) {
        this.f44d = i;
        if (this.f43c == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f42b.length; i2++) {
            this.f42b[i2].setLayer(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m45a(String str) {
        Group group;
        m43a();
        this.f41a = this.f452H.f48d.m71a(str);
        if (this.f41a == null) {
            group = new Group();
        } else {
            this.f42b = new Appearance[this.f41a.f98c.length];
            for (int i = 0; i < this.f42b.length; i++) {
                this.f42b[i] = this.f41a.f98c[i];
                this.f42b[i].setLayer(this.f44d);
            }
            this.f43c = new Mesh(this.f41a.f96a, this.f41a.f97b, this.f42b);
            group = this.f43c;
        }
        this.f456L = group;
        if (this.f451G != null) {
            this.f451G.f18F.addChild(this.f456L);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m46a(String[] strArr) {
        if (this.f43c == null) {
            return;
        }
        if (strArr.length != this.f42b.length) {
            throw new RuntimeException("setTextures: names.length!=mAppearances.length");
        }
        for (int i = 0; i < strArr.length; i++) {
            this.f42b[i].setTexture(0, this.f452H.f48d.m77b(strArr[i]));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m47b(String str) {
        if (this.f43c == null) {
            return;
        }
        Texture2D texture2DM77b = this.f452H.f48d.m77b(str);
        for (int i = 0; i < this.f42b.length; i++) {
            this.f42b[i].setTexture(0, texture2DM77b);
        }
    }

    @Override // p000.C0037i
    /* JADX INFO: renamed from: c */
    public final void mo19c() {
        m43a();
        super.mo19c();
    }
}
