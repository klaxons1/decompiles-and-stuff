package p000;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0015j {

    /* JADX INFO: renamed from: a */
    public RunnableC0017l f288a;

    /* JADX INFO: renamed from: b */
    public int f289b;

    /* JADX INFO: renamed from: c */
    public int f290c;

    /* JADX INFO: renamed from: d */
    short[] f291d;

    /* JADX INFO: renamed from: e */
    public Transform f292e;

    /* JADX INFO: renamed from: f */
    public C0000a f293f;

    /* JADX INFO: renamed from: g */
    public C0021p f294g;

    /* JADX INFO: renamed from: h */
    C0018m f295h;

    /* JADX INFO: renamed from: i */
    public int f296i;

    /* JADX INFO: renamed from: j */
    private C0014i f297j;

    /* JADX INFO: renamed from: l */
    private Texture2D[] f299l;

    /* JADX INFO: renamed from: r */
    private short[] f305r;

    /* JADX INFO: renamed from: s */
    private int f306s;

    /* JADX INFO: renamed from: t */
    private int f307t;

    /* JADX INFO: renamed from: k */
    private Texture2D f298k = null;

    /* JADX INFO: renamed from: m */
    private CompositingMode f300m = new CompositingMode();

    /* JADX INFO: renamed from: n */
    private Appearance f301n = new Appearance();

    /* JADX INFO: renamed from: o */
    private VertexArray f302o = new VertexArray(4, 3, 2);

    /* JADX INFO: renamed from: p */
    private VertexBuffer f303p = new VertexBuffer();

    /* JADX INFO: renamed from: q */
    private int[] f304q = {4};

    public C0015j(RunnableC0017l runnableC0017l, C0014i c0014i, C0010e c0010e) {
        this.f288a = null;
        this.f297j = null;
        this.f299l = null;
        new TriangleStripArray(0, this.f304q);
        this.f305r = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.f291d = new short[4];
        this.f288a = runnableC0017l;
        this.f297j = c0014i;
        this.f306s = 2;
        this.f307t = -1;
        this.f293f = this.f288a.f317A.f629aO;
        this.f294g = null;
        this.f295h = null;
        this.f292e = new Transform();
        this.f299l = new Texture2D[this.f293f.m7b()];
        for (int i = 0; i < this.f293f.m7b(); i++) {
            this.f299l[i] = null;
        }
        this.f289b = 0;
        this.f290c = 0;
        this.f296i = 0;
        this.f300m.setBlending(68);
        this.f300m.setDepthTestEnable(true);
        this.f300m.setDepthWriteEnable(true);
        this.f301n.setPolygonMode(this.f297j.f266c);
        this.f301n.setCompositingMode(this.f300m);
        this.f302o.set(0, 4, this.f305r);
        this.f303p.setPositions(this.f302o, 0.03125f, (float[]) null);
        this.f303p.setDefaultColor(-14869219);
    }

    /* JADX INFO: renamed from: a */
    private Texture2D m85a(String str, int i, int i2, int i3, boolean z) {
        Image2D image2D;
        Image imageM169a = this.f288a.m169a(str, i, i2, i3 == 255 ? 0 : i3);
        if (z) {
            Image imageCreateImage = Image.createImage(imageM169a.getWidth(), imageM169a.getHeight());
            Graphics graphics = imageCreateImage.getGraphics();
            graphics.drawImage(imageM169a, 0, 0, 20);
            System.gc();
            for (int i4 = 0; i4 < this.f294g.f586h; i4++) {
                try {
                    graphics.drawImage(this.f293f.f12h[this.f294g.f587i[i4]] == 2 ? this.f288a.m169a(new StringBuffer().append("/").append(C0000a.f6g[this.f294g.f587i[i4]]).toString(), i, i2, i3) : Image.createImage(new StringBuffer().append("/").append(C0000a.f6g[this.f294g.f587i[i4]]).toString()), this.f295h.f560h[this.f294g.f587i[i4] << 1], this.f295h.f560h[(this.f294g.f587i[i4] << 1) + 1], 20);
                    System.gc();
                } catch (Exception e) {
                }
            }
            image2D = new Image2D(99, imageCreateImage);
        } else {
            image2D = new Image2D(99, imageM169a);
        }
        System.gc();
        Texture2D texture2D = new Texture2D(image2D);
        System.gc();
        texture2D.setFiltering(208, 210);
        texture2D.setWrapping(241, 241);
        texture2D.setBlending(228);
        return texture2D;
    }

    /* JADX INFO: renamed from: a */
    public final int m86a() {
        if (this.f295h != null) {
            return this.f295h.f556d;
        }
        return 540;
    }

    /* JADX INFO: renamed from: a */
    public final void m87a(int i) {
        boolean z = true;
        if (i != 2 && i != 2 && i != 1) {
            z = false;
        }
        RunnableC0017l.m128a(z, "c:\\mobiledevelopment\\ff53d\\src\\carappearance_shared.h", 64, this.f288a);
        this.f306s = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m88a(Transform transform, boolean z, int i, int i2) {
        Appearance appearance = this.f295h.f561i[0].getAppearance(0);
        if (appearance.getTexture(0) != this.f298k) {
            appearance.setTexture(0, this.f298k);
        }
        this.f288a.f552z.f271h.render(this.f295h.f561i[this.f306s], transform);
        if (i > 4500 && this.f288a.f341Y == 0.0f) {
            return;
        }
        if (z) {
            this.f288a.f552z.f271h.render(this.f295h.f561i[0], transform);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.f293f.m7b()) {
                return;
            }
            int i5 = this.f294g.f585g[i4];
            if (i5 != 255) {
                C0025t c0025tM9c = this.f293f.m9c(i4);
                if (c0025tM9c.f691a == 1) {
                    Appearance appearance2 = c0025tM9c.f694d[i5].getAppearance(0);
                    if (appearance2.getTexture(0) != this.f299l[i4]) {
                        appearance2.setTexture(0, this.f299l[i4]);
                    }
                } else if (c0025tM9c.f691a == 2) {
                    Appearance appearance3 = c0025tM9c.f694d[i5].getAppearance(0);
                    if (appearance3.getTexture(0) != this.f298k) {
                        appearance3.setTexture(0, this.f298k);
                    }
                }
                for (int i6 = 0; i6 < c0025tM9c.f692b; i6++) {
                    int i7 = c0025tM9c.f693c[i6];
                    this.f292e.set(transform);
                    this.f292e.postTranslate(this.f295h.f562j[i7][0] * 0.00390625f, this.f295h.f562j[i7][1] * 0.00390625f, this.f295h.f562j[i7][2] * 0.00390625f);
                    switch (i7) {
                        case 0:
                            this.f292e.postTranslate(0.0f, this.f291d[0] * 0.00390625f, 0.0f);
                            this.f292e.postRotate((this.f290c << 7) * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
                            this.f292e.postRotate(((-this.f289b) << 8) * 2.1457672E-5f, 1.0f, 0.0f, 0.0f);
                            break;
                        case 1:
                            this.f292e.postTranslate(0.0f, this.f291d[1] * 0.00390625f, 0.0f);
                            this.f292e.postRotate((this.f290c << 7) * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
                            this.f292e.postRotate(((-this.f289b) << 8) * 2.1457672E-5f, 1.0f, 0.0f, 0.0f);
                            this.f292e.postRotate(180.0f, 0.0f, 1.0f, 0.0f);
                            break;
                        case 2:
                            this.f292e.postTranslate(0.0f, this.f291d[2] * 0.00390625f, 0.0f);
                            this.f292e.postRotate(((-this.f289b) << 8) * 2.1457672E-5f, 1.0f, 0.0f, 0.0f);
                            break;
                        case 3:
                            this.f292e.postTranslate(0.0f, this.f291d[3] * 0.00390625f, 0.0f);
                            this.f292e.postRotate(((-this.f289b) << 8) * 2.1457672E-5f, 1.0f, 0.0f, 0.0f);
                            this.f292e.postRotate(180.0f, 0.0f, 1.0f, 0.0f);
                            break;
                    }
                    this.f288a.f552z.f271h.render(c0025tM9c.f694d[i5], this.f292e);
                }
            }
            i3 = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m89b() {
        if (this.f295h != null) {
            return this.f295h.f557e;
        }
        return 250;
    }

    /* JADX INFO: renamed from: b */
    public final void m90b(int i) {
        if (i == -1) {
            i = Math.abs(this.f288a.m178b()) % this.f293f.m4a();
        }
        if (this.f307t == i) {
            return;
        }
        RunnableC0017l.m128a(i >= 0 && i < this.f293f.m4a(), "c:\\mobiledevelopment\\ff53d\\src\\carappearance_shared.h", 82, this.f288a);
        this.f307t = i;
        this.f294g = this.f293f.m5a(i);
        this.f295h = this.f293f.m8b(this.f294g.f580b);
        if (this.f298k != null) {
            this.f298k = null;
        }
        for (int i2 = 0; i2 < this.f293f.m7b(); i2++) {
            if (this.f299l[i2] != null) {
                this.f299l[i2] = null;
            }
        }
        int i3 = this.f294g.f581c;
        int i4 = this.f295h.f555c;
        this.f298k = m85a(C0000a.f1b[this.f295h.f554b], C0000a.f3d[this.f295h.f554b], i4, i3, true);
        for (int i5 = 0; i5 < this.f293f.m7b(); i5++) {
            if (this.f293f.m9c(i5).f691a == 1 && this.f294g.f585g[i5] != 255) {
                this.f299l[i5] = m85a(C0000a.f5f[i5], C0000a.f3d[this.f295h.f554b], i4, i3, false);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m91c() {
        if (this.f295h != null) {
            return this.f295h.f558f;
        }
        return 540;
    }

    /* JADX INFO: renamed from: d */
    public final int m92d() {
        if (this.f295h != null) {
            return this.f295h.f559g;
        }
        return 250;
    }
}
