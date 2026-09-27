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

/* JADX INFO: renamed from: af */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0006af {

    /* JADX INFO: renamed from: a */
    private Mesh f31a;

    /* JADX INFO: renamed from: b */
    private Camera f32b;

    public C0006af(Image2D image2D, Camera camera, float f, float f2, float f3, float f4) {
        this.f32b = camera;
        short[] sArr = {-1, -1, 0, 1, -1, 0, 1, 1, 0, -1, 1, 0};
        VertexArray vertexArray = new VertexArray(sArr.length / 3, 3, 2);
        vertexArray.set(0, sArr.length / 3, sArr);
        short[] sArr2 = {0, 1, 1, 1, 1, 0, 0, 0};
        VertexArray vertexArray2 = new VertexArray(sArr2.length / 2, 2, 2);
        vertexArray2.set(0, sArr2.length / 2, sArr2);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 1.0f, (float[]) null);
        vertexBuffer.setTexCoords(0, vertexArray2, 1.0f, (float[]) null);
        TriangleStripArray triangleStripArray = new TriangleStripArray(new int[]{1, 2, 0, 3}, new int[]{4});
        Appearance appearance = new Appearance();
        CompositingMode compositingMode = new CompositingMode();
        compositingMode.setBlending(64);
        appearance.setCompositingMode(compositingMode);
        if (image2D != null) {
            Texture2D texture2D = new Texture2D(image2D);
            texture2D.setFiltering(210, 210);
            texture2D.setWrapping(240, 240);
            texture2D.setBlending(228);
            appearance.setTexture(0, texture2D);
        }
        this.f31a = new Mesh(vertexBuffer, triangleStripArray, appearance);
        float f5 = 0.5f * f4;
        this.f31a.scale(f5, f5, f5);
        this.f31a.setTranslation(f, f2, f3);
        this.f31a.setAlignment(this.f32b, 148, (Node) null, 144);
    }

    /* JADX INFO: renamed from: a */
    public final Mesh m19a() {
        return this.f31a;
    }

    /* JADX INFO: renamed from: b */
    public final void m20b() {
        this.f31a.align(this.f32b);
    }
}
