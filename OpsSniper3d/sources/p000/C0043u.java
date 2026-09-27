package p000;

import com.m3gworks.engine.C0020a;
import java.util.Vector;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.RayIntersection;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0043u {

    /* JADX INFO: renamed from: a */
    private static C0043u f316a;

    /* JADX INFO: renamed from: b */
    private static Image2D[] f317b;

    /* JADX INFO: renamed from: c */
    private static Image2D[] f318c;

    /* JADX INFO: renamed from: d */
    private static Image2D[] f319d;

    /* JADX INFO: renamed from: e */
    private static Image2D[] f320e;

    /* JADX INFO: renamed from: f */
    private Vector f321f;

    /* JADX INFO: renamed from: g */
    private Vector f322g;

    /* JADX INFO: renamed from: h */
    private Vector f323h;

    /* JADX INFO: renamed from: i */
    private Vector f324i;

    private C0043u() {
    }

    /* JADX INFO: renamed from: a */
    public static C0043u m217a() {
        if (f316a == null) {
            f316a = new C0043u();
        }
        return f316a;
    }

    /* JADX INFO: renamed from: a */
    private static void m218a(Vector vector) {
        if (vector == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= vector.size()) {
                return;
            }
            Object objElementAt = vector.elementAt(i2);
            if (objElementAt != null) {
                ((C0018b) objElementAt).m84a();
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m219b() {
        f317b = C0012al.m48a("/res/image2d/bloodspray.png", 4, 32);
        C0020a.m97a();
        C0020a.m97a();
        f319d = C0012al.m48a("/res/image2d/wallsplash.png", 4, 32);
        f320e = C0012al.m48a("/res/image2d/explosion.png", 6, 64);
    }

    /* JADX INFO: renamed from: e */
    public static void m220e() {
        f317b = null;
        f318c = null;
        f319d = null;
        f320e = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m221a(int i, RayIntersection rayIntersection, World world, Camera camera) {
        float f;
        C0018b c0018b;
        Vector vector = null;
        Image2D[] image2DArr = null;
        if (this.f321f == null) {
            this.f321f = new Vector();
        }
        if (this.f322g == null) {
            this.f322g = new Vector();
        }
        if (this.f323h == null) {
            this.f323h = new Vector();
        }
        if (i == 1) {
            vector = this.f321f;
            image2DArr = f317b;
            f = 8.0f;
        } else if (i == 2) {
            vector = this.f322g;
            image2DArr = f318c;
            f = 6.0f;
        } else if (i == 3) {
            vector = this.f323h;
            image2DArr = f319d;
            f = 16.0f;
        } else {
            f = 1.0f;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < vector.size()) {
                c0018b = (C0018b) vector.elementAt(i3);
                if (!c0018b.m90c()) {
                    break;
                } else {
                    i2 = i3 + 1;
                }
            } else {
                c0018b = null;
                break;
            }
        }
        if (c0018b == null) {
            C0018b c0018b2 = vector.size() > 0 ? (C0018b) vector.elementAt(0) : null;
            c0018b = c0018b2 != null ? new C0018b(c0018b2.m89b(), c0018b2.m91d(), camera) : new C0018b(image2DArr, camera, f);
            world.addChild(c0018b.m89b());
            vector.addElement(c0018b);
        }
        c0018b.m87a(true);
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        if (rayIntersection != null) {
            float distance = rayIntersection.getDistance();
            float[] fArr = new float[6];
            rayIntersection.getRay(fArr);
            f2 = (fArr[3] * distance) + fArr[0];
            f3 = fArr[1] + (fArr[4] * distance);
            f4 = (distance * fArr[5]) + fArr[2];
        }
        c0018b.m85a(f2, f3, f4);
        if (i == 2) {
            float normalX = rayIntersection.getNormalX();
            float normalY = rayIntersection.getNormalY();
            float normalZ = rayIntersection.getNormalZ();
            Node intersected = rayIntersection.getIntersected();
            Transform transform = new Transform();
            intersected.getTransformTo(world, transform);
            float[] fArr2 = {normalX, normalY, normalZ, 0.0f};
            transform.transform(fArr2);
            float[] fArr3 = {fArr2[0], fArr2[1], fArr2[2]};
            float[] fArr4 = new float[6];
            rayIntersection.getRay(fArr4);
            if (C0034l.m184a(fArr3, new float[]{fArr4[3], fArr4[4], fArr4[5]}) > 0.0f) {
                fArr3[0] = -fArr3[0];
                fArr3[1] = -fArr3[1];
                fArr3[2] = -fArr3[2];
            }
            float fM183a = 0.2f / C0034l.m183a(fArr3);
            fArr3[0] = fArr3[0] * fM183a;
            fArr3[1] = (fArr3[1] * fM183a) + 0.08f;
            fArr3[2] = fM183a * fArr3[2];
            c0018b.m88a(fArr3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m222a(float[] fArr, World world, Camera camera) {
        C0018b c0018b;
        if (this.f324i == null) {
            this.f324i = new Vector();
        }
        int i = 0;
        while (true) {
            if (i < this.f324i.size()) {
                c0018b = (C0018b) this.f324i.elementAt(i);
                if (!c0018b.m90c()) {
                    break;
                } else {
                    i++;
                }
            } else {
                c0018b = null;
                break;
            }
        }
        if (c0018b == null) {
            c0018b = new C0018b(f320e, camera, 32.0f);
            world.addChild(c0018b.m89b());
            this.f324i.addElement(c0018b);
        }
        c0018b.m87a(true);
        c0018b.m85a(fArr[0], fArr[1], fArr[2]);
    }

    /* JADX INFO: renamed from: c */
    public final void m223c() {
        m218a(this.f321f);
        m218a(this.f322g);
        m218a(this.f323h);
        m218a(this.f324i);
    }

    /* JADX INFO: renamed from: d */
    public final void m224d() {
        this.f321f = null;
        this.f322g = null;
        this.f323h = null;
        this.f324i = null;
    }
}
