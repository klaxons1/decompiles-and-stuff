package p000;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: loaded from: C:\Temp\jadx-12448572193422856954\classes.dex */
public final class GloftSOUN extends MIDlet {

    /* JADX INFO: renamed from: a */
    public static GloftSOUN f0a;

    /* JADX INFO: renamed from: a */
    private static C0003d f1a = null;

    public GloftSOUN() {
        f0a = this;
    }

    public final void destroyApp(boolean z) {
        if (f1a != null) {
            AbstractRunnableC0012m.m392k();
        }
    }

    public final void pauseApp() {
        AbstractRunnableC0012m.m390i();
    }

    public final void startApp() {
        if (f1a == null) {
            C0003d c0003d = new C0003d(this, Display.getDisplay(this));
            f1a = c0003d;
            c0003d.m395h();
        }
        f1a.m396j();
    }
}
