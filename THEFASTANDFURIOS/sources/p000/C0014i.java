package p000;

import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Loader;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Object3D;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0014i {

    /* JADX INFO: renamed from: a */
    Mesh[][] f264a;

    /* JADX INFO: renamed from: b */
    PolygonMode f265b;

    /* JADX INFO: renamed from: c */
    PolygonMode f266c;

    /* JADX INFO: renamed from: d */
    CompositingMode f267d;

    /* JADX INFO: renamed from: e */
    CompositingMode f268e;

    /* JADX INFO: renamed from: f */
    CompositingMode f269f;

    /* JADX INFO: renamed from: g */
    CompositingMode f270g;

    /* JADX INFO: renamed from: h */
    public Graphics3D f271h;

    /* JADX INFO: renamed from: i */
    float[] f272i;

    /* JADX INFO: renamed from: j */
    private RunnableC0017l f273j;

    /* JADX INFO: renamed from: k */
    private Transform[] f274k;

    /* JADX INFO: renamed from: l */
    private CompositingMode f275l;

    /* JADX INFO: renamed from: m */
    private CompositingMode f276m;

    /* JADX INFO: renamed from: n */
    private CompositingMode f277n;

    /* JADX INFO: renamed from: o */
    private CompositingMode f278o;

    /* JADX INFO: renamed from: p */
    private CompositingMode f279p;

    /* JADX INFO: renamed from: q */
    private Background f280q;

    /* JADX INFO: renamed from: r */
    private Background f281r;

    /* JADX INFO: renamed from: s */
    private float f282s = 1.0f;

    /* JADX INFO: renamed from: t */
    private float f283t = 1.0f;

    /* JADX INFO: renamed from: u */
    private Camera f284u;

    /* JADX INFO: renamed from: v */
    private float[] f285v;

    /* JADX INFO: renamed from: w */
    private float f286w;

    /* JADX INFO: renamed from: x */
    private float f287x;

    public C0014i(RunnableC0017l runnableC0017l) {
        this.f273j = runnableC0017l;
    }

    /* JADX INFO: renamed from: a */
    static float m68a(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(1597463007 - (Float.floatToIntBits(f) >> 1));
        return (1.5f - (((0.5f * f) * fIntBitsToFloat) * fIntBitsToFloat)) * fIntBitsToFloat * f;
    }

    /* JADX INFO: renamed from: a */
    private void m69a(int i) {
        short s = this.f273j.f383aq[i];
        short s2 = this.f273j.f384ar[i];
        if (this.f274k == null) {
            this.f274k = new Transform[this.f273j.f382ap];
        }
        if (this.f274k[i] == null) {
            C0014i c0014i = this.f273j.f552z;
            int i2 = c0014i.f273j.f385as[i << 2];
            int i3 = c0014i.f273j.f385as[(i << 2) + 1];
            int i4 = c0014i.f273j.f385as[(i << 2) + 2];
            int i5 = c0014i.f273j.f385as[(i << 2) + 3];
            c0014i.f274k[i] = new Transform();
            c0014i.f274k[i].setIdentity();
            c0014i.f274k[i].postTranslate(i2 * 0.00390625f, i3 * 0.00390625f, i4 * 0.00390625f);
            c0014i.f274k[i].postRotate(i5 * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
        }
        this.f273j.f552z.f271h.render(this.f264a[s][s2], this.f274k[i]);
    }

    /* JADX INFO: renamed from: a */
    static Mesh[] m70a(String str) throws Exception {
        int i;
        Object3D[] object3DArrLoad = null;
        String string = new StringBuffer().append("/").append(str).toString();
        boolean z = false;
        int i2 = 0;
        do {
            i2++;
            try {
                object3DArrLoad = Loader.load(string);
                z = true;
            } catch (Exception e) {
                if (i2 > 3) {
                    throw e;
                }
            }
        } while (!z);
        int i3 = 0;
        for (Object3D object3D : object3DArrLoad) {
            if (object3D instanceof Mesh) {
                i3++;
            }
        }
        Mesh[] meshArr = new Mesh[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < object3DArrLoad.length; i5++) {
            if (object3DArrLoad[i5] instanceof Mesh) {
                i = i4 + 1;
                meshArr[i4] = (Mesh) object3DArrLoad[i5];
            } else {
                i = i4;
            }
            i4 = i;
        }
        return meshArr;
    }

    /* JADX INFO: renamed from: b */
    static Image m71b(String str) {
        try {
            if (str.indexOf(".png") <= 0) {
                return null;
            }
            return Image.createImage(new StringBuffer().append("/").append(str).toString());
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m72a() {
        this.f273j.f552z.f271h = Graphics3D.getInstance();
        this.f280q = new Background();
        this.f280q.setColor(5732756);
        this.f280q.setColorClearEnable(false);
        this.f280q.setDepthClearEnable(true);
        this.f273j.f552z.f281r = new Background();
        this.f273j.f552z.f281r.setColor(5063493);
        this.f273j.f552z.f281r.setColorClearEnable(true);
        this.f273j.f552z.f281r.setDepthClearEnable(false);
        this.f273j.f552z.f284u = new Camera();
        C0014i c0014i = this.f273j.f552z;
        c0014i.f265b = new PolygonMode();
        c0014i.f266c = new PolygonMode();
        c0014i.f268e = new CompositingMode();
        c0014i.f278o = new CompositingMode();
        c0014i.f269f = new CompositingMode();
        c0014i.f276m = new CompositingMode();
        c0014i.f275l = new CompositingMode();
        c0014i.f270g = new CompositingMode();
        c0014i.f279p = new CompositingMode();
        c0014i.f277n = new CompositingMode();
        c0014i.f267d = new CompositingMode();
        c0014i.f266c.setPerspectiveCorrectionEnable(false);
        c0014i.f266c.setCulling(160);
        c0014i.f266c.setShading(164);
        c0014i.f265b.setPerspectiveCorrectionEnable(true);
        c0014i.f265b.setCulling(160);
        c0014i.f265b.setShading(164);
        c0014i.f275l.setDepthTestEnable(false);
        c0014i.f275l.setDepthWriteEnable(false);
        c0014i.f275l.setAlphaWriteEnable(false);
        c0014i.f277n.setDepthTestEnable(true);
        c0014i.f277n.setDepthWriteEnable(false);
        c0014i.f277n.setBlending(65);
        c0014i.f277n.setAlphaWriteEnable(false);
        c0014i.f267d.setDepthTestEnable(false);
        c0014i.f267d.setDepthWriteEnable(false);
        c0014i.f267d.setBlending(65);
        c0014i.f267d.setAlphaWriteEnable(false);
        c0014i.f270g.setDepthTestEnable(true);
        c0014i.f270g.setDepthWriteEnable(false);
        c0014i.f270g.setBlending(64);
        c0014i.f270g.setAlphaWriteEnable(false);
        c0014i.f279p.setDepthTestEnable(false);
        c0014i.f279p.setDepthWriteEnable(true);
        c0014i.f279p.setBlending(64);
        c0014i.f279p.setAlphaWriteEnable(false);
        c0014i.f278o.setDepthTestEnable(true);
        c0014i.f278o.setDepthWriteEnable(true);
        c0014i.f278o.setBlending(65);
        c0014i.f278o.setAlphaWriteEnable(false);
        c0014i.f268e.setDepthTestEnable(true);
        c0014i.f268e.setDepthWriteEnable(true);
        c0014i.f268e.setAlphaWriteEnable(false);
        c0014i.f269f.setAlphaThreshold(1.0f);
        c0014i.f269f.setAlphaWriteEnable(false);
        c0014i.f276m.setDepthTestEnable(false);
        c0014i.f276m.setDepthWriteEnable(true);
        c0014i.f276m.setAlphaWriteEnable(false);
        new Transform();
        new Transform();
        new Transform();
        this.f272i = new float[16];
        new Transform();
        new Transform();
        this.f285v = new float[16];
    }

    /* JADX INFO: renamed from: a */
    final void m73a(int i, int i2, int i3, int i4) {
        this.f273j.f552z.f271h.setViewport(0, 0, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    final boolean m74a(String str, int i) {
        this.f264a[i] = m70a(str);
        return true;
    }

    /* JADX INFO: renamed from: b */
    final void m75b() {
        this.f265b = null;
        this.f266c = null;
        this.f268e = null;
        this.f278o = null;
        this.f269f = null;
        this.f276m = null;
        this.f275l = null;
        this.f270g = null;
        this.f279p = null;
        this.f277n = null;
        this.f267d = null;
        this.f272i = null;
        this.f285v = null;
        this.f280q = null;
        this.f273j.f552z.f281r = null;
        this.f273j.f552z.f284u = null;
    }

    /* JADX INFO: renamed from: b */
    final void m76b(float f) {
        if (this.f286w != f) {
            this.f286w = f;
            this.f287x = (this.f273j.f446c >> 1) / ((float) Math.tan(0.008726646f * f));
        }
        if ((this.f273j.f541o & 8192) != 0) {
            this.f273j.f552z.f284u.setPerspective(f, this.f283t, 0.5f, 400.0f);
        } else {
            this.f273j.f552z.f284u.setPerspective(f, this.f282s, 0.5f, 400.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    final void m77c() {
        this.f283t = this.f273j.f446c / ((this.f273j.f499d - 60) - 90);
        this.f282s = this.f273j.f446c / this.f273j.f499d;
        this.f273j.f552z.f284u.setPerspective(80.0f, this.f282s, 0.5f, 400.0f);
        this.f286w = 0.0f;
        this.f287x = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    final void m78d() {
        if (this.f264a != null) {
            for (int i = 0; i < this.f264a.length; i++) {
                for (int i2 = 0; i2 < this.f264a[i].length; i2++) {
                    this.f264a[i][i2] = null;
                }
                this.f264a[i] = null;
            }
            this.f264a = null;
        }
        if (this.f274k != null) {
            for (int i3 = 0; i3 < this.f274k.length; i3++) {
                this.f274k[i3] = null;
            }
            this.f274k = null;
        }
    }

    /* JADX INFO: renamed from: e */
    final void m79e() {
        this.f273j.f552z.f271h.bindTarget(RunnableC0017l.f312aS, true, 0);
        this.f273j.f552z.f271h.clear(this.f280q);
        this.f273j.f552z.f271h.setCamera(this.f273j.f552z.f284u, this.f273j.f328L);
    }

    /* JADX INFO: renamed from: f */
    final void m80f() {
        this.f273j.f552z.f271h.releaseTarget();
    }

    /* JADX INFO: renamed from: g */
    final void m81g() {
        int i;
        int iM205p = this.f273j.m205p(this.f273j.f369ac.f736p);
        int iM206q = this.f273j.m206q(this.f273j.f369ac.f736p);
        this.f273j.f328L.get(this.f285v);
        if (this.f285v[5] == 0.0f) {
            i = -this.f273j.f369ac.f738r;
        } else {
            i = ((((this.f273j.f499d - 60) - 90) >> 1) + 60) - ((int) ((this.f287x * this.f285v[6]) / this.f285v[5]));
        }
        int i2 = (i - iM206q) + this.f273j.f369ac.f738r;
        int i3 = (((this.f273j.f331O >> 8) * (iM205p * 10)) >> 16) % iM205p;
        while (i3 > 0) {
            i3 -= iM205p;
        }
        while (i3 < this.f273j.f446c) {
            this.f273j.m171a(this.f273j.f369ac.f736p, i3, i2);
            i3 += iM205p;
        }
        if (i2 > 60) {
            this.f273j.m173a(0, 60, this.f273j.f446c, i2 - 60, this.f273j.f369ac.f737q);
        }
    }

    /* JADX INFO: renamed from: h */
    final void m82h() {
        int i;
        int i2;
        float[] fArr = new float[3];
        float[] fArr2 = new float[2];
        for (int i3 = 0; i3 < this.f273j.f392az; i3++) {
            short s = this.f273j.f344aA[i3];
            int i4 = this.f273j.f390ax[s] * (this.f273j.f542p % this.f273j.f389aw[s]);
            switch (this.f273j.f387au[s]) {
                case 0:
                    switch (this.f273j.f386at[s]) {
                        case 0:
                            i = 0;
                            i2 = i4;
                            continue;
                            fArr2[0] = i2 * 1.5258789E-5f;
                            fArr2[1] = i * 1.5258789E-5f;
                            this.f273j.f345aB[i3].setTexCoords(0, this.f273j.f345aB[i3].getTexCoords(0, fArr), fArr[0], fArr2);
                            break;
                        case 1:
                            i = 0;
                            i2 = -i4;
                            continue;
                            fArr2[0] = i2 * 1.5258789E-5f;
                            fArr2[1] = i * 1.5258789E-5f;
                            this.f273j.f345aB[i3].setTexCoords(0, this.f273j.f345aB[i3].getTexCoords(0, fArr), fArr[0], fArr2);
                            break;
                        case 2:
                            i = i4;
                            i2 = 0;
                            continue;
                            fArr2[0] = i2 * 1.5258789E-5f;
                            fArr2[1] = i * 1.5258789E-5f;
                            this.f273j.f345aB[i3].setTexCoords(0, this.f273j.f345aB[i3].getTexCoords(0, fArr), fArr[0], fArr2);
                            break;
                        case 3:
                            i = -i4;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    i2 = 0;
                    continue;
                    fArr2[0] = i2 * 1.5258789E-5f;
                    fArr2[1] = i * 1.5258789E-5f;
                    this.f273j.f345aB[i3].setTexCoords(0, this.f273j.f345aB[i3].getTexCoords(0, fArr), fArr[0], fArr2);
                    break;
                case 1:
                    switch (this.f273j.f386at[s]) {
                        case 0:
                            int i5 = ((i4 * this.f273j.f388av[s]) >> 24) * this.f273j.f391ay[s];
                            i = 0;
                            i2 = i5;
                            break;
                        case 1:
                            int i6 = (-((i4 * this.f273j.f388av[s]) >> 24)) * this.f273j.f391ay[s];
                            i = 0;
                            i2 = i6;
                            break;
                        case 2:
                            i = this.f273j.f391ay[s] * ((i4 * this.f273j.f388av[s]) >> 24);
                            i2 = 0;
                            break;
                        case 3:
                            i = this.f273j.f391ay[s] * (-((i4 * this.f273j.f388av[s]) >> 24));
                            i2 = 0;
                            break;
                    }
                    fArr2[0] = i2 * 1.5258789E-5f;
                    fArr2[1] = i * 1.5258789E-5f;
                    this.f273j.f345aB[i3].setTexCoords(0, this.f273j.f345aB[i3].getTexCoords(0, fArr), fArr[0], fArr2);
                    break;
            }
            i = 0;
            i2 = 0;
            fArr2[0] = i2 * 1.5258789E-5f;
            fArr2[1] = i * 1.5258789E-5f;
            this.f273j.f345aB[i3].setTexCoords(0, this.f273j.f345aB[i3].getTexCoords(0, fArr), fArr[0], fArr2);
        }
    }

    /* JADX INFO: renamed from: i */
    final void m83i() {
        this.f273j.f378al = 0;
        for (int i = 0; i < this.f273j.f381ao[this.f273j.f380an].length && this.f273j.f378al < this.f273j.f379am; i++) {
            int i2 = this.f273j.f381ao[this.f273j.f380an][i];
            int i3 = (i2 >> 16) & 65535;
            if ((i2 & 65535 & this.f273j.f377ak) != 0) {
                this.f273j.f552z.m69a(i3);
                this.f273j.f378al++;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    final void m84j() {
        int i = this.f273j.f371ae[0].f237w;
        int i2 = this.f273j.f371ae[0].f238x;
        int i3 = this.f273j.f371ae[0].f239y;
        for (int i4 = 0; i4 < this.f273j.f346aC; i4++) {
            int i5 = i4 << 1;
            if (this.f273j.f369ac.f723c == this.f273j.f347aD[i5]) {
                int i6 = this.f273j.f347aD[i5 + 1];
                int i7 = i6 << 2;
                int iAbs = Math.abs(i - this.f273j.f385as[i7]);
                int i8 = i7 + 1;
                if (Math.abs(i2 - this.f273j.f385as[i8 + 1]) + iAbs + Math.abs(i3 - this.f273j.f385as[i8]) < 40000) {
                    this.f273j.f552z.m69a(i6);
                }
            }
        }
    }
}
