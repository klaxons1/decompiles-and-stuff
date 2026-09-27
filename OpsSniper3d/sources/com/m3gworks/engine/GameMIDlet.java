package com.m3gworks.engine;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import p000.C0028f;

/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public class GameMIDlet extends MIDlet {

    /* JADX INFO: renamed from: b */
    private static GameMIDlet f104b;

    /* JADX INFO: renamed from: a */
    private Display f105a;

    public GameMIDlet() {
        this.f105a = null;
        f104b = this;
        this.f105a = Display.getDisplay(this);
    }

    /* JADX INFO: renamed from: a */
    public static GameMIDlet m95a() {
        return f104b;
    }

    /* JADX INFO: renamed from: b */
    public final Display m96b() {
        return this.f105a;
    }

    public void destroyApp(boolean z) {
    }

    public void pauseApp() {
    }

    public void startApp() {
        C0028f.m130a().m145c();
        C0028f.m134d();
        this.f105a.setCurrent(C0028f.m130a());
        C0028f.m130a().m139a(901);
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - jCurrentTimeMillis < 2000) {
            C0028f.m130a().m142b();
            try {
                Thread.sleep(10L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C0028f.m130a().m139a(902);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        while (System.currentTimeMillis() - jCurrentTimeMillis2 < 2000) {
            C0028f.m130a().m142b();
            try {
                Thread.sleep(10L);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        C0028f.m130a().m139a(0);
        C0028f.m130a().m142b();
    }
}
