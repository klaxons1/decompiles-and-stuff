package p000;

import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0000a extends AbstractC0036n {

    /* JADX INFO: renamed from: d */
    private static C0000a f0d = null;

    /* JADX INFO: renamed from: a */
    public static C0000a m0a() {
        if (f0d == null) {
            f0d = new C0000a();
        }
        return f0d;
    }

    /* JADX INFO: renamed from: a */
    public final Node m1a(World world) {
        this.f276a = new Camera();
        world.addChild(this.f276a);
        this.f277b = this.f276a;
        return this.f277b;
    }

    /* JADX INFO: renamed from: a */
    public final void m2a(AbstractC0042t abstractC0042t) {
        abstractC0042t.m203a(this);
        m188b(abstractC0042t);
    }
}
