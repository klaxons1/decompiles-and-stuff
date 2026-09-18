package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Texture2D;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0028d {
    public Appearance Code = new Appearance();

    static {
        new C0028d();
    }

    private void Code(int i, Image2D image2D) {
        this.Code.setTexture(i, new Texture2D(image2D));
    }

    public final void Code() {
        this.Code.setTexture(0, (Texture2D) null);
    }

    public final void Code(long j, int i) {
        if (i == 1) {
            Code(0, C0037t.Code(j, 100));
            return;
        }
        if (i == 8) {
            Code(0, RunnableC0025bt.f462Code.m245Code(j));
            return;
        }
        if (i != 12) {
            if (i != 5) {
            }
            return;
        }
        Appearance appearance = RunnableC0025bt.f462Code.m242Code(j).Code;
        this.Code.setTexture(0, appearance.getTexture(0));
        this.Code.setCompositingMode(appearance.getCompositingMode());
        this.Code.setPolygonMode(appearance.getPolygonMode());
    }
}
