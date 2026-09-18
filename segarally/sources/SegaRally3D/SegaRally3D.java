package SegaRally3D;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import p000.C0031g;
import p000.RunnableC0025bt;

/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class SegaRally3D extends MIDlet {

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private RunnableC0025bt f363Code = null;
    private SegaRally3D Code = this;

    public final void destroyApp(boolean z) {
        this.f363Code.m225Code();
    }

    public final void pauseApp() {
        this.f363Code.m118I();
    }

    public final void quitApp() {
        this.Code.destroyApp(false);
        this.Code.notifyDestroyed();
        this.Code = null;
    }

    public final void startApp() {
        if (this.f363Code == null) {
            this.f363Code = new RunnableC0025bt(this.Code);
            this.f363Code.Code(this.Code);
            C0031g.Code(this);
            Display.getDisplay(this).setCurrent(this.f363Code);
            this.f363Code.m116C();
        }
    }
}
