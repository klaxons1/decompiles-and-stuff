package p000;

import javax.microedition.m3g.Light;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0045q extends C0037i {

    /* JADX INFO: renamed from: a */
    public C0025ay f506a;

    /* JADX INFO: renamed from: b */
    public C0025ay f507b;

    /* JADX INFO: renamed from: c */
    public Light f508c;

    public C0045q(C0006af c0006af) {
        super(c0006af);
        this.f506a = new C0025ay();
        this.f507b = new C0025ay();
        this.f508c = new Light();
        this.f453I |= 64;
        this.f508c = new Light();
        this.f456L = this.f508c;
        this.f508c.setMode(129);
    }

    /* JADX INFO: renamed from: a */
    public final void m313a(int i) {
        int iM284d = (int) (C0037i.m284d(i) * 255.0f);
        int i2 = iM284d <= 255 ? iM284d : 255;
        this.f508c.setColor(i2 + (i2 << 16) + (i2 << 8));
    }

    /* JADX INFO: renamed from: b */
    public final void m314b(C0025ay c0025ay) {
        Light light;
        float fM284d;
        float fM284d2;
        float fM284d3;
        float f;
        C0031c.m243f(this.f506a, c0025ay);
        if (this.f506a.m175b(C0031c.f382g)) {
            light = this.f508c;
            fM284d3 = 0.0f;
            f = 0.0f;
            fM284d2 = 0.0f;
            fM284d = 0.0f;
        } else if (this.f506a.m175b(C0031c.f381f)) {
            light = this.f508c;
            fM284d = 180.0f;
            fM284d2 = 1.0f;
            fM284d3 = 0.0f;
            f = 0.0f;
        } else {
            C0031c.m234c(this.f507b, C0031c.f382g, this.f506a);
            int iM232c = C0031c.m232c(this.f507b);
            int iM240e = C0031c.m240e(C0031c.m244g(iM232c));
            this.f507b.f249a = C0031c.m210a(this.f507b.f249a, iM232c);
            this.f507b.f250b = C0031c.m210a(this.f507b.f250b, iM232c);
            this.f507b.f251c = C0031c.m210a(this.f507b.f251c, iM232c);
            light = this.f508c;
            fM284d = C0037i.m284d(iM240e);
            fM284d2 = C0037i.m284d(this.f507b.f249a);
            float fM284d4 = C0037i.m284d(this.f507b.f250b);
            fM284d3 = C0037i.m284d(this.f507b.f251c);
            f = fM284d4;
        }
        light.setOrientation(fM284d, fM284d2, f, fM284d3);
    }
}
