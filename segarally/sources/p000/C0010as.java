package p000;

import Coral.Math.Float.crlM44;
import Coral.Math.Float.crlV4;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: as */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class C0010as {
    public static Transform Code = new Transform();

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static float[] f405Code = new float[16];

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public Group f406Code;

    public C0010as() {
        this.f406Code = new Group();
    }

    public C0010as(Group group) {
        this.f406Code = group;
    }

    public C0010as(boolean z) {
        this();
    }

    public Group Code() {
        return this.f406Code;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m217Code() {
        if (this.f406Code == null) {
            return;
        }
        int childCount = this.f406Code.getChildCount();
        while (true) {
            childCount--;
            if (childCount <= -1) {
                return;
            } else {
                this.f406Code.removeChild(this.f406Code.getChild(childCount));
            }
        }
    }

    public final void Code(float f, float f2, float f3) {
        this.f406Code.setTranslation(f, f2, f3);
    }

    public final void Code(float f, float f2, float f3, float f4) {
        this.f406Code.setOrientation(f, f2, f3, f4);
    }

    public final void Code(crlM44 crlm44) {
        crlm44.m0V(f405Code);
        Code.set(f405Code);
        this.f406Code.setTransform(Code);
    }

    public final void Code(crlV4 crlv4) {
        this.f406Code.setTranslation(crlv4.f362Code, crlv4.f18V, crlv4.f17I);
    }

    public final void Code(C0010as c0010as) {
        if (this.f406Code == null) {
            this.f406Code = new Group();
        }
        this.f406Code.addChild(c0010as.Code());
    }

    public void Code(C0028d c0028d) {
        Code(c0028d, Integer.MAX_VALUE);
    }

    public final void Code(C0028d c0028d, int i) {
        C0030f.Code(this, 0, c0028d, this, i);
    }

    public final void Code(boolean z) {
        this.f406Code.setRenderingEnable(z);
    }

    public final void Code(float[] fArr) {
        System.arraycopy(fArr, 0, f405Code, 0, 16);
        Code.set(f405Code);
        this.f406Code.setTransform(Code);
    }

    public final boolean Code(Node node, int i, Object obj) {
        int i2;
        if (i == 0) {
            if (node instanceof Mesh) {
                ((Mesh) node).setAppearance(0, obj == null ? null : ((C0028d) obj).Code);
            }
            return true;
        }
        if (i != 1 || !(node instanceof Mesh)) {
            return false;
        }
        Mesh mesh = (Mesh) node;
        if (obj != null) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        mesh.setScope(i2);
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final void m44V(float f, float f2, float f3) {
        this.f406Code.scale(f, f2, f3);
    }

    /* JADX INFO: renamed from: V */
    public final void m45V(C0010as c0010as) {
        if (this.f406Code != null) {
            this.f406Code.removeChild(c0010as.Code());
        }
    }
}
