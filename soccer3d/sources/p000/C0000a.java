package p000;

import javax.microedition.midlet.MIDlet;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: C:\Temp\jadx-9991838165078942717\classes.dex */
public class C0000a extends MIDlet {

    /* JADX INFO: renamed from: a */
    public static C0005e f0a;

    /* JADX INFO: renamed from: b */
    public static C0000a f1b;

    public C0000a() {
        f1b = this;
    }

    /* JADX INFO: renamed from: a */
    public void m0a() {
        destroyApp(true);
        notifyDestroyed();
    }

    public void destroyApp(boolean z) {
        if (f0a != null) {
            f0a.m143d();
            f0a = null;
        }
        notifyDestroyed();
    }

    public void pauseApp() {
        f0a.m151g();
        notifyPaused();
    }

    public void startApp() {
        if (f0a == null) {
            try {
                f0a = new C0005e();
            } catch (Exception e) {
                m0a();
            }
        }
        f0a.m159n();
    }
}
