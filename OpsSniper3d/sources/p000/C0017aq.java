package p000;

import java.util.Vector;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Image2D;

/* JADX INFO: renamed from: aq */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0017aq {

    /* JADX INFO: renamed from: a */
    public static Image2D[] f88a;

    /* JADX INFO: renamed from: b */
    public static Image[] f89b;

    /* JADX INFO: renamed from: c */
    public static Image2D[] f90c;

    /* JADX INFO: renamed from: d */
    public static Image[] f91d;

    /* JADX INFO: renamed from: e */
    private static C0017aq f92e;

    /* JADX INFO: renamed from: f */
    private Vector f93f = new Vector();

    private C0017aq() {
    }

    /* JADX INFO: renamed from: a */
    public static C0017aq m79a() {
        if (f92e == null) {
            f92e = new C0017aq();
        }
        return f92e;
    }

    /* JADX INFO: renamed from: a */
    public final C0018b m80a(Camera camera, int i) {
        if (this.f93f == null) {
            this.f93f = new Vector();
        }
        C0018b c0018b = new C0018b(f88a, camera, 3.0f);
        c0018b.m89b().setPickingEnable(false);
        this.f93f.addElement(c0018b);
        return c0018b;
    }

    /* JADX INFO: renamed from: b */
    public final void m81b() {
        if (this.f93f == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f93f.size()) {
                return;
            }
            Object objElementAt = this.f93f.elementAt(i2);
            if (objElementAt != null) {
                ((C0018b) objElementAt).m84a();
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m82c() {
        this.f93f = null;
    }
}
