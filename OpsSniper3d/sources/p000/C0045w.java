package p000;

import com.m3gworks.engine.C0020a;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Light;
import javax.microedition.m3g.Loader;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: w */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0045w {

    /* JADX INFO: renamed from: c */
    private static C0045w f326c;

    /* JADX INFO: renamed from: e */
    private World f330e;

    /* JADX INFO: renamed from: f */
    private int f331f;

    /* JADX INFO: renamed from: g */
    private float[] f332g;

    /* JADX INFO: renamed from: h */
    private Vector[][] f333h;

    /* JADX INFO: renamed from: i */
    private Background f334i;

    /* JADX INFO: renamed from: d */
    private Vector f329d = new Vector();

    /* JADX INFO: renamed from: a */
    public Mesh f327a = null;

    /* JADX INFO: renamed from: b */
    public float[] f328b = null;

    static {
        C0020a.m97a();
        C0020a.m98c();
    }

    private C0045w() {
    }

    /* JADX INFO: renamed from: a */
    public static C0045w m228a() {
        if (f326c == null) {
            f326c = new C0045w();
        }
        return f326c;
    }

    /* JADX INFO: renamed from: j */
    private void m229j() {
        C0026d[] c0026dArr = m240f().f20i;
        for (int i = 0; i < c0026dArr.length; i++) {
            C0005ae[] c0005aeArr = m240f().f20i[i].f161h;
            if (c0005aeArr != null) {
                for (int i2 = 0; i2 < c0005aeArr.length; i2++) {
                    c0005aeArr[i2].f28d = this.f330e.find(c0005aeArr[i2].f29e);
                    c0005aeArr[i2].f28d.setTranslation(c0005aeArr[i2].f27c[0], c0005aeArr[i2].f27c[1], c0005aeArr[i2].f27c[2]);
                    c0005aeArr[i2].f28d.setUserObject(c0005aeArr[i2]);
                    c0005aeArr[i2].f30f = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m230k() {
        C0026d[] c0026dArr = m240f().f20i;
        for (int i = 0; i < c0026dArr.length; i++) {
            C0001aa[] c0001aaArr = m240f().f20i[i].f162i;
            if (c0001aaArr != null) {
                for (int i2 = 0; i2 < c0001aaArr.length; i2++) {
                    c0001aaArr[i2].f1a = this.f330e.find(c0001aaArr[i2].f4d);
                    c0001aaArr[i2].f1a.setUserObject(c0001aaArr[i2]);
                    c0001aaArr[i2].f2b = this.f330e.find(c0001aaArr[i2].f5e);
                    c0001aaArr[i2].f2b.setUserObject(c0001aaArr[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m231l() {
        int i;
        float[] fArr;
        String str = m240f().f16e;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(getClass().getResourceAsStream(str));
            i = 0;
            while (true) {
                try {
                    int i2 = inputStreamReader.read();
                    if (i2 == -1) {
                        break;
                    }
                    if (i2 != 13 && i2 != 10) {
                        stringBuffer.append((char) i2);
                    }
                    if (i2 == 102) {
                        i++;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                }
            }
            inputStreamReader.close();
        } catch (Exception e2) {
            e = e2;
            i = 0;
        }
        String strTrim = stringBuffer.toString().trim();
        if (i != 0) {
            float[] fArr2 = new float[i];
            String strSubstring = strTrim;
            int i3 = 0;
            while (true) {
                int iIndexOf = strSubstring.indexOf("f");
                int i4 = i3 + 1;
                fArr2[i3] = Float.parseFloat(strSubstring.substring(0, iIndexOf + 1));
                if (iIndexOf == strSubstring.length() - 1) {
                    break;
                }
                strSubstring = strSubstring.substring(iIndexOf + 2);
                i3 = i4;
            }
            fArr = fArr2;
        } else {
            fArr = null;
        }
        this.f332g = new float[4];
        if (fArr == null) {
            this.f332g[0] = -400.0f;
            this.f332g[1] = -400.0f;
            this.f332g[2] = 400.0f;
            this.f332g[3] = 400.0f;
            this.f333h = (Vector[][]) Array.newInstance((Class<?>) Vector.class, (int) Math.ceil((this.f332g[3] - this.f332g[1]) / 20.0f), (int) Math.ceil((this.f332g[2] - this.f332g[0]) / 20.0f));
            return;
        }
        this.f332g[0] = Float.MAX_VALUE;
        this.f332g[1] = Float.MAX_VALUE;
        this.f332g[2] = -3.4028235E38f;
        this.f332g[3] = -3.4028235E38f;
        C0027e[] c0027eArr = new C0027e[fArr.length / 6];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            if (i5 % 6 == 0) {
                C0027e c0027e = new C0027e(new float[]{fArr[i5], fArr[i5 + 1], fArr[i5 + 2]}, new float[]{fArr[i5 + 3], fArr[i5 + 4], fArr[i5 + 5]});
                c0027eArr[i5 / 6] = c0027e;
                float[] fArrM128a = c0027e.m128a();
                float[] fArrM129b = c0027e.m129b();
                if (fArrM128a[0] < this.f332g[0]) {
                    this.f332g[0] = fArrM128a[0];
                }
                if (fArrM128a[2] < this.f332g[1]) {
                    this.f332g[1] = fArrM128a[2];
                }
                if (fArrM129b[0] > this.f332g[2]) {
                    this.f332g[2] = fArrM129b[0];
                }
                if (fArrM129b[2] > this.f332g[3]) {
                    this.f332g[3] = fArrM129b[2];
                }
            }
        }
        float[] fArr3 = this.f332g;
        fArr3[0] = fArr3[0] - 5.0f;
        float[] fArr4 = this.f332g;
        fArr4[1] = fArr4[1] - 5.0f;
        float[] fArr5 = this.f332g;
        fArr5[2] = fArr5[2] + 5.0f;
        float[] fArr6 = this.f332g;
        fArr6[3] = fArr6[3] + 5.0f;
        this.f333h = (Vector[][]) Array.newInstance((Class<?>) Vector.class, (int) Math.ceil((this.f332g[3] - this.f332g[1]) / 20.0f), (int) Math.ceil((this.f332g[2] - this.f332g[0]) / 20.0f));
        for (C0027e c0027e2 : c0027eArr) {
            float f = c0027e2.m128a()[0];
            float f2 = c0027e2.m128a()[2];
            float f3 = c0027e2.m129b()[0];
            float f4 = c0027e2.m129b()[2];
            float f5 = (f2 - this.f332g[1]) / 20.0f;
            int iFloor = f5 < 1.0f ? 0 : (int) Math.floor(f5);
            float f6 = (f - this.f332g[0]) / 20.0f;
            int iFloor2 = f6 < 1.0f ? 0 : (int) Math.floor(f6);
            float f7 = (f4 - this.f332g[1]) / 20.0f;
            int iFloor3 = f7 < 1.0f ? 0 : (int) Math.floor(f7);
            float f8 = (f3 - this.f332g[0]) / 20.0f;
            int iFloor4 = f8 < 1.0f ? 0 : (int) Math.floor(f8);
            for (int i6 = iFloor; i6 <= iFloor3; i6++) {
                for (int i7 = iFloor2; i7 <= iFloor4; i7++) {
                    if (this.f333h[i6][i7] == null) {
                        this.f333h[i6][i7] = new Vector();
                    }
                    this.f333h[i6][i7].addElement(c0027e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private void m232m() {
        try {
            Image2D image2D = new Image2D(99, Image.createImage("/res/maps/bg.png"));
            this.f334i = new Background();
            this.f334i.setImage(image2D);
            this.f330e.setBackground(this.f334i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m233a(int i) {
        this.f331f = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m234a(int i, int i2) {
        Background background = this.f330e.getBackground();
        if (background != null) {
            background.setImageMode(33, 33);
            background.setCrop(0, (background.getImage().getHeight() - i2) / 2, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m235a(C0004ad c0004ad) {
        this.f329d.addElement(c0004ad);
    }

    /* JADX INFO: renamed from: b */
    public final World m236b() {
        try {
            World[] worldArrLoad = Loader.load(m240f().f13b);
            for (int i = 0; i < worldArrLoad.length; i++) {
                if (worldArrLoad[i] instanceof World) {
                    this.f330e = worldArrLoad[i];
                    break;
                }
            }
            int i2 = this.f331f;
            World world = this.f330e;
            switch (i2) {
                case 0:
                    Image2D image2DM47a = C0012al.m47a("/res/maps/tree_64X64_RGBA.png");
                    Image2D image2DM47a2 = C0012al.m47a("/res/maps/Bullrt02_32X32_RGBA.png");
                    Image2D image2DM47a3 = C0012al.m47a("/res/maps/TNTandBullrt_32X32_RGBA.png");
                    world.find(81).setImage(image2DM47a);
                    world.find(85).setImage(image2DM47a2);
                    world.find(86).setImage(image2DM47a2);
                    world.find(87).setImage(image2DM47a3);
                    break;
                case 1:
                    Image2D image2DM47a4 = C0012al.m47a("/res/maps/tree_64X64_RGBA.png");
                    Image2D image2DM47a5 = C0012al.m47a("/res/maps/Bullrt02_32X32_RGBA.png");
                    Image2D image2DM47a6 = C0012al.m47a("/res/maps/TNTandBullrt_32X32_RGBA.png");
                    world.find(103).setImage(C0012al.m47a("/res/maps/m03g1_32X32_RGBA.png"));
                    world.find(104).setImage(image2DM47a4);
                    world.find(114).setImage(image2DM47a5);
                    world.find(115).setImage(image2DM47a6);
                    world.find(116).setImage(image2DM47a6);
                    break;
                case 2:
                    Image2D image2DM47a7 = C0012al.m47a("/res/maps/wirenet_32X32_RGBA.png");
                    Image2D image2DM47a8 = C0012al.m47a("/res/maps/Bullrt02_32X32_RGBA.png");
                    Image2D image2DM47a9 = C0012al.m47a("/res/maps/TNTandBullrt_32X32_RGBA.png");
                    world.find(87).setImage(image2DM47a7);
                    world.find(88).setImage(image2DM47a8);
                    world.find(89).setImage(image2DM47a8);
                    world.find(90).setImage(image2DM47a9);
                    break;
                case 3:
                    world.find(90).setImage(C0012al.m47a("/res/maps/Bullrt02_32X32_RGBA.png"));
                    break;
                case 4:
                    Image2D image2DM47a10 = C0012al.m47a("/res/maps/m06_a_32X32_RGBA.png");
                    Image2D image2DM47a11 = C0012al.m47a("/res/maps/Bullrt02_32X32_RGBA.png");
                    Image2D image2DM47a12 = C0012al.m47a("/res/maps/m06_k_32X32_RGBA.png");
                    Image2D image2DM47a13 = C0012al.m47a("/res/maps/tree_64X64_RGBA.png");
                    world.find(116).setImage(image2DM47a10);
                    world.find(117).setImage(image2DM47a12);
                    world.find(119).setImage(image2DM47a13);
                    world.find(124).setImage(image2DM47a11);
                    break;
                case 5:
                    Image2D image2DM47a14 = C0012al.m47a("/res/maps/Bullrt02_32X32_RGBA.png");
                    Image2D image2DM47a15 = C0012al.m47a("/res/maps/TNTandBullrt_32X32_RGBA.png");
                    world.find(78).setImage(image2DM47a14);
                    world.find(79).setImage(image2DM47a14);
                    world.find(80).setImage(image2DM47a15);
                    break;
                case 6:
                    Image2D image2DM47a16 = C0012al.m47a("/res/maps/wirenet_32X32_RGBA.png");
                    Image2D image2DM47a17 = C0012al.m47a("/res/maps/Bullrt02_32X32_RGBA.png");
                    Image2D image2DM47a18 = C0012al.m47a("/res/maps/TNTandBullrt_32X32_RGBA.png");
                    world.find(100).setImage(image2DM47a16);
                    world.find(111).setImage(image2DM47a17);
                    world.find(112).setImage(image2DM47a18);
                    break;
                case 7:
                    Image2D image2DM47a19 = C0012al.m47a("/res/maps/m09_a._32X32_RGBA.png");
                    Image2D image2DM47a20 = C0012al.m47a("/res/maps/Bullrt02_32X32_RGBA.png");
                    Image2D image2DM47a21 = C0012al.m47a("/res/maps/TNTandBullrt_32X32_RGBA.png");
                    world.find(81).setImage(image2DM47a19);
                    world.find(84).setImage(image2DM47a20);
                    world.find(85).setImage(image2DM47a20);
                    world.find(86).setImage(image2DM47a21);
                    break;
            }
            switch (this.f331f) {
                case 0:
                    m232m();
                    break;
                case 1:
                    m232m();
                    break;
                case 2:
                    m232m();
                    break;
                case 3:
                    m232m();
                    break;
                case 4:
                    m232m();
                    break;
                case 5:
                    m232m();
                    break;
                case 6:
                    m232m();
                    break;
                case 7:
                    m232m();
                    break;
            }
            Light light = new Light();
            light.setMode(128);
            light.setIntensity(3.0f);
            this.f330e.addChild(light);
            m229j();
            m230k();
            if (this.f331f == 7) {
                Mesh meshFind = this.f330e.find(306);
                if (meshFind instanceof Mesh) {
                    this.f327a = meshFind;
                    this.f328b = new float[3];
                    this.f327a.getTranslation(this.f328b);
                }
            }
            m231l();
        } catch (Exception e) {
            System.out.println("Load map error!");
            e.printStackTrace();
        }
        return this.f330e;
    }

    /* JADX INFO: renamed from: c */
    public final void m237c() {
        this.f330e = null;
        this.f332g = null;
        this.f333h = null;
        this.f334i = null;
    }

    /* JADX INFO: renamed from: d */
    public final Vector m238d() {
        return this.f329d;
    }

    /* JADX INFO: renamed from: e */
    public final World m239e() {
        return this.f330e;
    }

    /* JADX INFO: renamed from: f */
    public final C0004ad m240f() {
        return (C0004ad) this.f329d.elementAt(this.f331f);
    }

    /* JADX INFO: renamed from: g */
    public final int m241g() {
        return this.f331f;
    }

    /* JADX INFO: renamed from: h */
    public final float[] m242h() {
        return this.f332g;
    }

    /* JADX INFO: renamed from: i */
    public final Vector[][] m243i() {
        return this.f333h;
    }
}
