package p000;

import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public class aow22 extends MIDlet {

    /* JADX INFO: renamed from: b */
    static aow22 f22b;

    /* JADX INFO: renamed from: a */
    Display f23a;

    /* JADX INFO: renamed from: g */
    RunnableC0002c f24g;

    /* JADX INFO: renamed from: a */
    public static InputStream m7a() {
        try {
            return Runtime.getRuntime().getClass().getResourceAsStream("/general");
        } catch (Exception e) {
            return null;
        }
    }

    public void destroyApp(boolean z) {
        if (this.f24g != null) {
            this.f24g.m24b();
        }
    }

    public void pauseApp() {
        if (this.f24g != null) {
            this.f24g.m26j();
        }
    }

    public void startApp() {
        f22b = this;
        RunnableC0011l.start();
        if (this.f24g != null) {
            this.f24g.m27k();
            return;
        }
        this.f23a = Display.getDisplay(this);
        this.f24g = new RunnableC0002c(this);
        new Thread(this.f24g).start();
    }
}
