package p000;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
public class HSpeed extends MIDlet {

    /* JADX INFO: renamed from: a */
    static RunnableC0008i f0a;

    /* JADX INFO: renamed from: a */
    static Thread f1a;

    /* JADX INFO: renamed from: c */
    private static boolean f4c = false;

    /* JADX INFO: renamed from: a */
    static boolean f2a = false;

    /* JADX INFO: renamed from: b */
    static boolean f3b = false;

    /* JADX INFO: renamed from: a */
    static void m0a() {
        if (f0a == null || !f2a) {
            return;
        }
        RunnableC0008i.f279a = 0L;
        if (C0009j.f384d[1] > 0 && C0009j.f384d[14] > 0 && RunnableC0008i.f281a.f59a == 0) {
            RunnableC0008i.f281a.m18a(5, 0, -1, -1);
        }
        if (RunnableC0008i.f294b != 0 && !C0009j.f353a.f572a) {
            C0009j.f353a.m255a();
        }
        if (RunnableC0008i.f331k == 9 && C0013n.f539h == 2 && C0009j.f384d[9] == 1) {
            C0013n.f522d = true;
        }
        f2a = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m1b() {
        Display.getDisplay(this).vibrate(800);
    }

    /* JADX INFO: renamed from: c */
    public final void m2c() {
        C0011l.m203b();
        C0009j.f384d[20] = (byte) C0014o.f569a;
        C0009j.f384d[19] = (byte) (C0014o.f569a >>> 8);
        C0009j.f384d[18] = (byte) (C0014o.f569a >>> 16);
        C0009j.f384d[17] = (byte) (C0014o.f569a >>> 24);
        C0011l.m185a(C0009j.f384d, 1);
        C0011l.m211c();
        try {
            destroyApp(false);
        } catch (MIDletStateChangeException e) {
        }
        notifyDestroyed();
    }

    protected void destroyApp(boolean z) {
    }

    protected void pauseApp() {
        if (f0a == null || f3b || f2a) {
            return;
        }
        f2a = true;
        if (RunnableC0008i.f294b != 0) {
            C0009j.f353a.m256b();
        }
        RunnableC0008i.f281a.m16a();
        RunnableC0008i.f281a.m20b();
        RunnableC0008i.f281a.m22c();
        notifyPaused();
        C0011l.m204b(1);
    }

    protected void startApp() {
        if (!f4c) {
            if (f0a == null) {
                RunnableC0008i runnableC0008i = new RunnableC0008i(this);
                f0a = runnableC0008i;
                runnableC0008i.setFullScreenMode(true);
            }
            RunnableC0008i.f279a = 0L;
            if (f1a == null) {
                Thread thread = new Thread(f0a);
                f1a = thread;
                thread.start();
            }
        }
        if (f0a != null) {
            Display.getDisplay(this).setCurrent(f0a);
        }
        if (f2a) {
            resumeRequest();
        }
        f4c = true;
    }
}
