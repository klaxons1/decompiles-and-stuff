package p000;

import javax.microedition.midlet.MIDlet;

/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public class Main extends MIDlet {

    /* JADX INFO: renamed from: a */
    public static Main f0a;

    /* JADX INFO: renamed from: a */
    private RunnableC0010k f1a;

    public Main() {
        f0a = this;
        this.f1a = new RunnableC0010k(this);
    }

    protected void destroyApp(boolean z) {
        RunnableC0010k.m97a(0);
        RunnableC0010k.f228b = false;
    }

    protected void pauseApp() {
        if (this.f1a != null) {
            RunnableC0010k.f222a = true;
        }
    }

    protected void startApp() {
    }
}
