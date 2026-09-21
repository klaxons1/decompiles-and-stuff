package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: aj */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0010aj extends AbstractC0023aw {

    /* JADX INFO: renamed from: a */
    public Mesh f99a;

    /* JADX INFO: renamed from: b */
    public Appearance f100b;

    /* JADX INFO: renamed from: c */
    public CompositingMode f101c;

    /* JADX INFO: renamed from: d */
    public C0025ay f102d;

    /* JADX INFO: renamed from: e */
    public C0025ay f103e;

    /* JADX INFO: renamed from: f */
    public C0025ay f104f;

    /* JADX INFO: renamed from: g */
    public C0025ay f105g;

    /* JADX INFO: renamed from: h */
    public C0025ay f106h;

    public C0010aj(C0006af c0006af) {
        super(c0006af);
        this.f100b = new Appearance();
        this.f102d = new C0025ay();
        this.f103e = new C0025ay();
        this.f104f = new C0025ay();
        this.f105g = new C0025ay();
        this.f106h = new C0025ay();
        this.f453I |= 128;
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(162);
        this.f100b.setPolygonMode(polygonMode);
        this.f100b.setLayer(1);
    }

    /* JADX INFO: renamed from: a */
    private void m83a(boolean z) {
        this.f456L.setRenderingEnable(z);
    }

    /* JADX INFO: renamed from: b */
    private void m84b() {
        if (this.f456L != null && this.f456L.getParent() != null) {
            this.f456L.getParent().removeChild(this.f456L);
        }
        this.f456L = null;
        this.f99a = null;
    }

    /* JADX INFO: renamed from: d */
    private void m85d() {
        C0031c.m229b(this.f104f, this.f103e, this.f102d);
        int iM232c = C0031c.m232c(this.f104f);
        if (iM232c == 0) {
            m83a(false);
            return;
        }
        C0031c.m226b(this.f104f, iM232c);
        if (this.f104f.m175b(C0031c.f381f) || this.f104f.m175b(C0031c.f382g)) {
            m83a(false);
            return;
        }
        m83a(true);
        C0031c.m234c(this.f106h, this.f104f, C0031c.f381f);
        C0031c.m239d(this.f106h);
        C0031c.m234c(this.f105g, this.f106h, this.f104f);
        if (this.f457M == null) {
            this.f457M = new Transform();
            this.f458N = new float[16];
            this.f458N[15] = 1.0f;
        }
        this.f458N[0] = C0037i.m284d(this.f106h.f249a);
        this.f458N[4] = C0037i.m284d(this.f106h.f250b);
        this.f458N[8] = C0037i.m284d(this.f106h.f251c);
        this.f458N[1] = C0037i.m284d(this.f105g.f249a);
        this.f458N[5] = C0037i.m284d(this.f105g.f250b);
        this.f458N[9] = C0037i.m284d(this.f105g.f251c);
        this.f458N[2] = C0037i.m284d(this.f104f.f249a);
        this.f458N[6] = C0037i.m284d(this.f104f.f250b);
        this.f458N[10] = C0037i.m284d(this.f104f.f251c);
        this.f458N[3] = C0037i.m284d(this.f102d.f249a);
        this.f458N[7] = C0037i.m284d(this.f102d.f250b);
        this.f458N[11] = C0037i.m284d(this.f102d.f251c);
        this.f457M.set(this.f458N);
        this.f457M.postScale(0.1f, 1.0f, C0037i.m284d(iM232c));
        this.f456L.setTransform(this.f457M);
    }

    /* JADX INFO: renamed from: a */
    public final void m86a() {
        if (this.f101c == null) {
            this.f101c = new CompositingMode();
        }
        this.f101c.setAlphaThreshold(0.5f);
        this.f101c.setDepthWriteEnable(false);
        this.f100b.setCompositingMode(this.f101c);
    }

    /* JADX INFO: renamed from: a */
    public final void m87a(int i, C0025ay c0025ay, C0025ay c0025ay2) {
        m84b();
        VertexBuffer vertexBuffer = new VertexBuffer();
        VertexArray vertexArray = new VertexArray(4, 3, 1);
        vertexArray.set(0, 4, new byte[]{1, 0, 0, -1, 0, 0, 1, 0, 1, -1, 0, 1});
        vertexBuffer.setPositions(vertexArray, 1.0f, (float[]) null);
        vertexBuffer.setDefaultColor(i);
        this.f99a = new Mesh(vertexBuffer, new TriangleStripArray(0, new int[]{4}), this.f100b);
        this.f456L = this.f99a;
        if (this.f451G != null) {
            this.f451G.f18F.addChild(this.f456L);
        }
        this.f102d.m174a(c0025ay);
        this.f103e.m174a(c0025ay2);
        m85d();
    }

    /* JADX INFO: renamed from: a */
    public final void m88a(boolean z, boolean z2) {
        CompositingMode compositingMode;
        int i;
        if (this.f101c == null) {
            this.f101c = new CompositingMode();
        }
        if (!z) {
            compositingMode = this.f101c;
            i = 68;
        } else if (z2) {
            compositingMode = this.f101c;
            i = 65;
        } else {
            compositingMode = this.f101c;
            i = 64;
        }
        compositingMode.setBlending(i);
        this.f100b.setCompositingMode(this.f101c);
    }

    /* JADX INFO: renamed from: b */
    public final void m89b(C0025ay c0025ay) {
        this.f103e.m174a(c0025ay);
        m85d();
    }

    @Override // p000.C0037i
    /* JADX INFO: renamed from: c */
    public final void mo19c() {
        m84b();
        super.mo19c();
    }
}
