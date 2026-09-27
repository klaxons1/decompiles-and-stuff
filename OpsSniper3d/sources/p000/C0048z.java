package p000;

import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.RayIntersection;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: z */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0048z {

    /* JADX INFO: renamed from: b */
    private static Image2D f338b;

    /* JADX INFO: renamed from: c */
    private static float f339c = 2.5f;

    /* JADX INFO: renamed from: a */
    private AbstractC0042t f340a;

    /* JADX INFO: renamed from: d */
    private C0006af f341d;

    /* JADX INFO: renamed from: e */
    private float[] f342e;

    /* JADX INFO: renamed from: f */
    private float[] f343f;

    /* JADX INFO: renamed from: g */
    private int f344g = 0;

    /* JADX INFO: renamed from: h */
    private boolean f345h = true;

    /* JADX INFO: renamed from: i */
    private int f346i = -1;

    public C0048z(AbstractC0042t abstractC0042t) {
        this.f340a = abstractC0042t;
    }

    /* JADX INFO: renamed from: a */
    public static void m246a() {
        f338b = C0012al.m47a("/res/image2d/grenade.png");
    }

    /* JADX INFO: renamed from: c */
    public static void m247c() {
        f338b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m248a(World world) {
        if (this.f345h) {
            return;
        }
        this.f346i++;
        float[] fArr = {this.f342e[0] + (this.f343f[0] * this.f344g), this.f342e[1] + (this.f343f[1] * this.f344g) + (0.5f * (-0.2f) * this.f344g * this.f344g), this.f342e[2] + (this.f343f[2] * this.f344g)};
        this.f341d.m19a().setTranslation(fArr[0], fArr[1], fArr[2]);
        this.f341d.m20b();
        this.f344g++;
        float[] fArrM185b = C0034l.m185b(new float[]{this.f343f[0], this.f343f[1] + (this.f344g * (-0.2f)), this.f343f[2]});
        RayIntersection rayIntersection = new RayIntersection();
        world.pick(-1, fArr[0], fArr[1], fArr[2], fArrM185b[0], fArrM185b[1], fArrM185b[2], rayIntersection);
        float distance = rayIntersection.getDistance();
        float[] fArr2 = {this.f342e[0] + (this.f343f[0] * this.f344g), this.f342e[1] + (this.f343f[1] * this.f344g) + (0.5f * (-0.2f) * this.f344g * this.f344g), this.f342e[2] + (this.f343f[2] * this.f344g)};
        if (((fArr2[2] - fArr[2]) * (fArr2[2] - fArr[2])) + ((fArr2[0] - fArr[0]) * (fArr2[0] - fArr[0])) + ((fArr2[1] - fArr[1]) * (fArr2[1] - fArr[1])) > distance * distance) {
            this.f341d.m19a().setRenderingEnable(false);
            if (fArr[1] < 4.0f) {
                fArr[1] = 4.0f;
            }
            C0043u.m217a().m222a(fArr, world, (Camera) C0000a.m0a().m190d());
            if (C0028f.m130a().m146e()) {
                C0016ap.m72a().m76a(4);
            }
            if (C0045w.m228a().m240f().f18g == this.f340a) {
                AbstractC0042t[] abstractC0042tArr = C0045w.m228a().m240f().m18b().f160g;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= abstractC0042tArr.length) {
                        break;
                    }
                    C0002ab c0002ab = abstractC0042tArr[i2];
                    if (c0002ab != this.f340a && c0002ab.mo7b() > 0) {
                        float[] fArrM212m = c0002ab.m212m();
                        c0002ab.mo5a(this.f340a, (C0035m) C0014an.f60a.elementAt(C0014an.f62c), null, null, ((fArrM212m[0] - fArr[0]) * (fArrM212m[0] - fArr[0])) + ((fArrM212m[1] - fArr[1]) * (fArrM212m[1] - fArr[1])) + ((fArrM212m[2] - fArr[2]) * (fArrM212m[2] - fArr[2])));
                    }
                    i = i2 + 1;
                }
            }
            this.f345h = true;
            this.f346i = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m249a(World world, float[] fArr, float[] fArr2) {
        this.f345h = false;
        this.f342e = fArr;
        this.f346i = 0;
        this.f343f = C0034l.m185b(fArr2);
        this.f343f[0] = this.f343f[0] * f339c;
        this.f343f[1] = this.f343f[1] * f339c;
        this.f343f[2] = this.f343f[2] * f339c;
        this.f344g = 0;
        if (this.f341d == null) {
            this.f341d = new C0006af(f338b, world.getActiveCamera(), this.f342e[0], this.f342e[1], this.f342e[2], 0.3f);
            world.addChild(this.f341d.m19a());
            this.f341d.m19a().setPickingEnable(false);
        }
        this.f341d.m19a().setTranslation(this.f342e[0], this.f342e[1], this.f342e[2]);
        this.f341d.m19a().setRenderingEnable(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m250b() {
        this.f342e = null;
        this.f343f = null;
        this.f341d = null;
        this.f344g = 0;
        this.f345h = true;
        this.f346i = -1;
    }
}
