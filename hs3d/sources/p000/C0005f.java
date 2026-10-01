package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
public final class C0005f {

    /* JADX INFO: renamed from: a */
    private float f158a;

    /* JADX INFO: renamed from: a */
    private C0003d f159a;

    /* JADX INFO: renamed from: a */
    private Mesh f160a;

    /* JADX INFO: renamed from: a */
    float[] f161a;

    /* JADX INFO: renamed from: a */
    private static final PolygonMode f150a = new PolygonMode();

    /* JADX INFO: renamed from: b */
    private static final PolygonMode f152b = new PolygonMode();

    /* JADX INFO: renamed from: a */
    private static final CompositingMode f149a = new CompositingMode();

    /* JADX INFO: renamed from: b */
    private static final CompositingMode f151b = new CompositingMode();

    /* JADX INFO: renamed from: c */
    private static final CompositingMode f153c = new CompositingMode();

    /* JADX INFO: renamed from: d */
    private static final CompositingMode f154d = new CompositingMode();

    /* JADX INFO: renamed from: e */
    private static final CompositingMode f155e = new CompositingMode();

    /* JADX INFO: renamed from: f */
    private static final CompositingMode f156f = new CompositingMode();

    /* JADX INFO: renamed from: g */
    private static final CompositingMode f157g = new CompositingMode();

    C0005f(String str, int i, int i2) throws Throwable {
        this.f158a = 0.0f;
        this.f160a = null;
        this.f159a = null;
        this.f161a = new float[3];
        i2 = str.equals("/f1.apt") ? i2 | 32 : i2;
        Object[] objArrM46a = C0003d.m46a(str, this.f161a);
        Appearance appearance = new Appearance();
        appearance.setLayer(i);
        appearance.setPolygonMode((i2 & 4) != 0 ? f150a : f152b);
        if ((i2 & 32) != 0) {
            appearance.setCompositingMode(f157g);
        } else if ((i2 & 64) != 0) {
            appearance.setCompositingMode(f156f);
        } else if ((i2 & 16) != 0) {
            appearance.setCompositingMode(f155e);
        } else if ((i2 & 2) != 0) {
            appearance.setCompositingMode(f154d);
        } else if ((i2 & 1) != 0) {
            appearance.setCompositingMode(f149a);
        } else if ((i2 & 8) != 0) {
            appearance.setCompositingMode(f151b);
        } else {
            appearance.setCompositingMode(f153c);
        }
        this.f160a = new Mesh((VertexBuffer) objArrM46a[0], (TriangleStripArray) objArrM46a[1], appearance);
        if (this.f160a == null) {
            RunnableC0008i.m124a(true, new StringBuffer().append("h2 ").append(str).toString());
        }
    }

    C0005f(String str, C0005f c0005f) throws Throwable {
        this.f158a = 0.0f;
        this.f160a = null;
        this.f159a = null;
        this.f161a = new float[3];
        Object[] objArrM46a = C0003d.m46a(str, this.f161a);
        this.f160a = new Mesh((VertexBuffer) objArrM46a[0], (TriangleStripArray) objArrM46a[1], c0005f.f160a.getAppearance(0));
        if (this.f160a == null) {
            RunnableC0008i.m124a(true, new StringBuffer().append("h1").append(str).toString());
        }
    }

    C0005f(VertexBuffer vertexBuffer, TriangleStripArray triangleStripArray, int i, int i2) {
        this.f158a = 0.0f;
        this.f160a = null;
        this.f159a = null;
        this.f161a = new float[3];
        Appearance appearance = new Appearance();
        appearance.setLayer(i);
        if ((i2 & 4) != 0) {
            appearance.setPolygonMode(f150a);
        } else {
            appearance.setPolygonMode(f152b);
        }
        if ((i2 & 32) != 0) {
            appearance.setCompositingMode(f157g);
        } else if ((i2 & 64) != 0) {
            appearance.setCompositingMode(f156f);
        } else if ((i2 & 16) != 0) {
            appearance.setCompositingMode(f155e);
        } else if ((i2 & 2) != 0) {
            appearance.setCompositingMode(f154d);
        } else if ((i2 & 1) != 0) {
            appearance.setCompositingMode(f149a);
        } else if ((i2 & 8) != 0) {
            appearance.setCompositingMode(f151b);
        } else {
            appearance.setCompositingMode(f153c);
        }
        this.f160a = new Mesh(vertexBuffer, triangleStripArray, appearance);
    }

    /* JADX INFO: renamed from: a */
    static void m58a() {
        f150a.setPerspectiveCorrectionEnable(false);
        f150a.setCulling(162);
        f150a.setShading(165);
        f152b.setPerspectiveCorrectionEnable(false);
        f152b.setCulling(160);
        f152b.setShading(165);
        f154d.setBlending(68);
        f154d.setDepthTestEnable(false);
        f154d.setDepthWriteEnable(false);
        f153c.setBlending(68);
        f151b.setBlending(68);
        f151b.setAlphaThreshold(0.5f);
        f149a.setBlending(65);
        f155e.setBlending(66);
        f155e.setDepthTestEnable(false);
        f155e.setDepthWriteEnable(false);
        f156f.setBlending(64);
        f156f.setDepthTestEnable(false);
        f156f.setDepthWriteEnable(false);
        f157g.setBlending(65);
        f157g.setDepthTestEnable(false);
        f157g.setDepthWriteEnable(false);
    }

    /* JADX INFO: renamed from: b */
    static void m59b(boolean z) {
        f150a.setPerspectiveCorrectionEnable(z);
        f152b.setPerspectiveCorrectionEnable(z);
    }

    /* JADX INFO: renamed from: a */
    final Mesh m60a() {
        return this.f160a;
    }

    /* JADX INFO: renamed from: a */
    final void m61a(float f) {
        this.f158a = f;
        if (this.f158a > 1.0f) {
            this.f158a = 1.0f;
        } else if (this.f158a < 0.0f) {
            this.f158a = 0.0f;
        }
        this.f160a.setAlphaFactor(this.f158a);
    }

    /* JADX INFO: renamed from: a */
    final void m62a(int i, C0003d c0003d) {
        if (c0003d == null || c0003d.m47a() == null) {
            return;
        }
        this.f159a = c0003d;
        this.f160a.getAppearance(0).setTexture(0, this.f159a.m47a());
    }

    /* JADX INFO: renamed from: a */
    final void m63a(boolean z) {
        if (z && this.f159a != null) {
            this.f159a.m48a();
        }
        this.f159a = null;
        this.f160a = null;
        this.f161a = null;
    }
}
