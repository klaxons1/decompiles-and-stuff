package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.IndexBuffer;
import javax.microedition.m3g.Sprite3D;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: ah */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0008ah {

    /* JADX INFO: renamed from: i */
    public boolean f95i;

    /* JADX INFO: renamed from: b */
    public C0019as f88b = new C0019as(1, 1, 1, 1, 0, 1, true, new Image2D(99, 1, 1));

    /* JADX INFO: renamed from: c */
    public Hashtable f89c = new Hashtable();

    /* JADX INFO: renamed from: d */
    public Hashtable f90d = new Hashtable();

    /* JADX INFO: renamed from: e */
    public Hashtable f91e = new Hashtable();

    /* JADX INFO: renamed from: f */
    public Hashtable f92f = new Hashtable();

    /* JADX INFO: renamed from: g */
    public Hashtable f93g = new Hashtable();

    /* JADX INFO: renamed from: h */
    public Hashtable f94h = new Hashtable();

    /* JADX INFO: renamed from: a */
    public C0009ai f87a = new C0009ai();

    public C0008ah() {
        this.f87a.f96a = new VertexBuffer();
        byte[] bArr = new byte[9];
        VertexArray vertexArray = new VertexArray(3, 3, 1);
        vertexArray.set(0, 3, bArr);
        VertexArray vertexArray2 = new VertexArray(3, 3, 1);
        vertexArray2.set(0, 3, bArr);
        this.f87a.f96a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.f87a.f96a.setNormals(vertexArray2);
        this.f87a.f97b = new IndexBuffer[1];
        this.f87a.f97b[0] = new TriangleStripArray(0, new int[]{3});
        this.f87a.f98c = new Appearance[1];
        this.f87a.f98c[0] = new Appearance();
    }

    /* JADX INFO: renamed from: e */
    private Image2D m70e(String str) throws IOException {
        Image2D image2D = (Image2D) this.f92f.get(str);
        if (image2D != null) {
            return image2D;
        }
        Image2D image2D2 = new Image2D(100, Image.createImage(new StringBuffer().append(str).append(".png").toString()));
        this.f92f.put(str, image2D2);
        return image2D2;
    }

    /* JADX INFO: renamed from: a */
    public final C0009ai m71a(String str) {
        C0009ai c0009ai = (C0009ai) this.f89c.get(str);
        return c0009ai == null ? this.f87a : c0009ai;
    }

    /* JADX INFO: renamed from: a */
    public final void m72a() {
        this.f89c.clear();
        this.f90d.clear();
        this.f91e.clear();
        this.f92f.clear();
        this.f93g.clear();
        this.f94h.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m73a(String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str2) throws IOException {
        if (!this.f95i && this.f91e.get(str) == null) {
            this.f91e.put(str, new C0019as(i, i2, i3, i4, i5, i6, z, m70e(str2)));
            if (z) {
                return;
            }
            this.f93g.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74a(String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str2, int i7) throws IOException {
        m73a(str, i, i2, i3, i4, i5, i6, z, str2);
        if (z && ((Vector) this.f94h.get(str)) == null) {
            C0019as c0019asM79c = m79c(str);
            Vector vector = new Vector();
            this.f94h.put(str, vector);
            for (int i8 = 0; i8 < i7; i8++) {
                vector.addElement(new Sprite3D(true, c0019asM79c.f236g, (Appearance) null));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75a(String str, String str2) throws IOException {
        InputStream resourceAsStream;
        if (this.f95i || this.f89c.get(str) != null || (resourceAsStream = getClass().getResourceAsStream(new StringBuffer().append(str2).append(".mmsh").toString())) == null) {
            return;
        }
        this.f89c.put(str, C0009ai.m82a(resourceAsStream));
    }

    /* JADX INFO: renamed from: a */
    public final void m76a(String str, Sprite3D sprite3D) {
        Vector vector = (Vector) this.f94h.get(str);
        if (vector != null) {
            vector.addElement(sprite3D);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Texture2D m77b(String str) {
        return (Texture2D) this.f90d.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m78b(String str, String str2) throws IOException {
        if (!this.f95i && this.f90d.get(str) == null) {
            this.f90d.put(str, new Texture2D(m70e(str2)));
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0019as m79c(String str) {
        C0019as c0019as = (C0019as) this.f91e.get(str);
        return c0019as == null ? this.f88b : c0019as;
    }

    /* JADX INFO: renamed from: d */
    public final Sprite3D m80d(String str) {
        Vector vector = (Vector) this.f94h.get(str);
        if (vector == null || vector.size() <= 0) {
            return null;
        }
        Sprite3D sprite3D = (Sprite3D) vector.elementAt(vector.size() - 1);
        vector.removeElementAt(vector.size() - 1);
        return sprite3D;
    }
}
