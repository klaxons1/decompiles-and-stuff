package p000;

import javax.microedition.m3g.Background;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0030f extends World {
    public InterfaceC0036s Code = new C0034m();

    public C0030f() {
        Background background = new Background();
        background.setColorClearEnable(false);
        setBackground(background);
    }

    public static boolean Code(C0010as c0010as, int i, Object obj, C0010as c0010as2, int i2) {
        return Code(c0010as, i, obj, c0010as2.Code(), i2, 0);
    }

    private static boolean Code(C0010as c0010as, int i, Object obj, Node node, int i2, int i3) {
        if (i3 <= i2) {
            if (!(node instanceof Group)) {
                return c0010as.Code(node, i, obj);
            }
            Group group = (Group) node;
            for (int i4 = 0; i4 < group.getChildCount(); i4++) {
                if (!Code(c0010as, i, obj, group.getChild(i4), i2, i3 + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void Code(C0003ah c0003ah) {
        super.setActiveCamera(c0003ah);
    }

    public final void Code(C0010as c0010as) {
        addChild(c0010as.Code());
    }

    public final void Code(Graphics3D graphics3D) {
        this.Code.mo43o();
        this.Code.Code(graphics3D);
    }

    /* JADX INFO: renamed from: V */
    public final void m125V(C0010as c0010as) {
        removeChild(c0010as.Code());
    }
}
