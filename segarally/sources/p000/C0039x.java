package p000;

import Coral.Math.Float.crlM44;
import javax.microedition.lcdui.Graphics;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0039x {
    private static C0039x Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static boolean f539Code = true;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private Graphics3D f540Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0034m f541Code = new C0034m();

    static {
        new crlM44();
    }

    private C0039x() {
        this.f541Code.setColorClearEnable(true);
        this.f540Code = Graphics3D.getInstance();
    }

    public static C0039x Code() {
        if (Code == null) {
            Code = new C0039x();
        }
        return Code;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m247Code() {
        this.f540Code.setCamera((Camera) null, (Transform) null);
        this.f540Code.resetLights();
        this.f540Code = null;
    }

    public final void Code(int i) {
        this.f541Code.setColor(i);
    }

    public final void Code(Graphics graphics, C0030f c0030f) {
        this.f540Code.bindTarget(graphics, f539Code, 0);
        try {
            this.f540Code.clear(this.f541Code);
            c0030f.Code(this.f540Code);
            this.f540Code.render(c0030f);
        } catch (Exception e) {
        } finally {
            this.f540Code.releaseTarget();
        }
    }
}
