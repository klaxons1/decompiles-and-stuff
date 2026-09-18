package com.iplay.fastfurious53d;

import javax.microedition.midlet.MIDlet;
import p000.RunnableC0017l;

/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
public class FastFurious53D extends MIDlet {

    /* JADX INFO: renamed from: a */
    private RunnableC0017l f77a = new RunnableC0017l(this);

    /* JADX INFO: renamed from: b */
    private boolean f78b;

    public FastFurious53D() {
        this.f78b = false;
        this.f78b = false;
    }

    protected void destroyApp(boolean z) {
        this.f77a.m195h();
    }

    protected void pauseApp() {
        this.f77a.hideNotify();
    }

    protected void startApp() {
        try {
            if (this.f78b) {
                this.f77a.showNotify();
            } else {
                this.f78b = true;
                this.f77a.m197i();
            }
        } catch (Error e) {
            System.out.println(e);
            notifyDestroyed();
        } catch (Exception e2) {
            System.out.println(e2);
            notifyDestroyed();
        }
    }
}
