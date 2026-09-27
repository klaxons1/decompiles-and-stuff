package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0018b {

    /* JADX INFO: renamed from: a */
    private Mesh f94a;

    /* JADX INFO: renamed from: b */
    private Appearance f95b;

    /* JADX INFO: renamed from: c */
    private Texture2D[] f96c;

    /* JADX INFO: renamed from: d */
    private int f97d;

    /* JADX INFO: renamed from: e */
    private int f98e;

    /* JADX INFO: renamed from: f */
    private boolean f99f;

    /* JADX INFO: renamed from: g */
    private Camera f100g;

    /* JADX INFO: renamed from: h */
    private float[] f101h;

    public C0018b(Mesh mesh, Texture2D[] texture2DArr, Camera camera) {
        this.f101h = new float[3];
        this.f98e = 0;
        this.f96c = texture2DArr;
        this.f97d = texture2DArr.length;
        this.f94a = mesh.duplicate();
        this.f95b = this.f94a.getAppearance(0);
        this.f95b.setTexture(0, texture2DArr[this.f98e]);
        this.f100g = camera;
        if (this.f100g != null) {
            this.f94a.setAlignment(this.f100g, 148, (Node) null, 144);
        }
        this.f94a.setPickingEnable(false);
        m87a(false);
    }

    public C0018b(Image2D[] image2DArr, Camera camera, float f) {
        this.f101h = new float[3];
        this.f100g = camera;
        short[] sArr = {-1, -1, 0, 1, -1, 0, 1, 1, 0, -1, 1, 0};
        VertexArray vertexArray = new VertexArray(sArr.length / 3, 3, 2);
        vertexArray.set(0, sArr.length / 3, sArr);
        short[] sArr2 = {0, 1, 1, 1, 1, 0, 0, 0};
        VertexArray vertexArray2 = new VertexArray(sArr2.length / 2, 2, 2);
        vertexArray2.set(0, sArr2.length / 2, sArr2);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 0.25f, (float[]) null);
        vertexBuffer.setTexCoords(0, vertexArray2, 1.0f, (float[]) null);
        TriangleStripArray triangleStripArray = new TriangleStripArray(new int[]{1, 2, 0, 3}, new int[]{4});
        this.f97d = image2DArr.length;
        this.f98e = 0;
        this.f96c = m83a(image2DArr, this.f97d);
        Texture2D texture2D = this.f96c[this.f98e];
        this.f95b = new Appearance();
        CompositingMode compositingMode = new CompositingMode();
        compositingMode.setBlending(64);
        this.f95b.setCompositingMode(compositingMode);
        this.f95b.setTexture(0, texture2D);
        this.f95b = this.f95b;
        this.f94a = new Mesh(vertexBuffer, triangleStripArray, this.f95b);
        float f2 = 0.5f * f;
        this.f94a.scale(f2, f2, f2);
        if (this.f100g != null) {
            this.f94a.setAlignment(this.f100g, 148, (Node) null, 144);
        }
        this.f94a.setPickingEnable(false);
        m87a(false);
    }

    /* JADX INFO: renamed from: a */
    private static Texture2D[] m83a(Image2D[] image2DArr, int i) {
        Texture2D[] texture2DArr = new Texture2D[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (image2DArr[i2] != null) {
                texture2DArr[i2] = new Texture2D(image2DArr[i2]);
                texture2DArr[i2].setFiltering(210, 210);
                texture2DArr[i2].setWrapping(240, 240);
                texture2DArr[i2].setBlending(228);
            } else {
                System.out.println(new StringBuffer("Image ").append(i2).append(" is null").toString());
            }
        }
        return texture2DArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m84a() {
        if (this.f99f) {
            if (this.f100g != null) {
                this.f94a.align(this.f100g);
            }
            if (this.f98e >= this.f97d) {
                m87a(false);
                return;
            }
            this.f95b.setTexture(0, this.f96c[this.f98e]);
            this.f98e++;
            if (this.f101h[0] == 0.0f && this.f101h[1] == 0.0f && this.f101h[2] == 0.0f) {
                return;
            }
            float[] fArr = new float[3];
            this.f94a.getTranslation(fArr);
            float[] fArr2 = this.f101h;
            float[] fArr3 = {fArr[0] + fArr2[0], fArr[1] + fArr2[1], fArr[2] + fArr2[2]};
            m85a(fArr3[0], fArr3[1], fArr3[2]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m85a(float f, float f2, float f3) {
        this.f94a.setTranslation(f, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public final void m86a(int i) {
        this.f98e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m87a(boolean z) {
        this.f99f = z;
        if (!this.f99f) {
            this.f94a.setRenderingEnable(false);
            return;
        }
        this.f94a.setRenderingEnable(true);
        this.f98e = 0;
        this.f101h[0] = 0.0f;
        this.f101h[0] = 0.0f;
        this.f101h[0] = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m88a(float[] fArr) {
        System.arraycopy(fArr, 0, this.f101h, 0, this.f101h.length);
    }

    /* JADX INFO: renamed from: b */
    public final Mesh m89b() {
        return this.f94a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90c() {
        return this.f99f;
    }

    /* JADX INFO: renamed from: d */
    public final Texture2D[] m91d() {
        return this.f96c;
    }

    /* JADX INFO: renamed from: e */
    public final void m92e() {
        this.f98e = this.f97d;
    }

    /* JADX INFO: renamed from: f */
    public final int m93f() {
        return this.f97d;
    }
}
