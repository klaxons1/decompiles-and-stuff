package p000;

import javax.microedition.lcdui.Canvas;

/* JADX INFO: renamed from: ad */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
public abstract class AbstractC0004ad extends Canvas {

    /* JADX INFO: renamed from: aT */
    public static boolean f54aT = false;

    /* JADX INFO: renamed from: j */
    public final void m27j() {
        repaint();
        try {
            if (isShown()) {
                serviceRepaints();
            }
        } catch (Throwable th) {
        }
    }
}
