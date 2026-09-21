package com.lightningtoads.jdropscape;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import p000.C0013am;
import p000.C0026az;
import p000.C0030bc;
import p000.RunnableC0015ao;

/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class Dropscape extends MIDlet {

    /* JADX INFO: renamed from: a */
    public static final int f383a;

    /* JADX INFO: renamed from: b */
    public static final int f384b;

    /* JADX INFO: renamed from: c */
    public static final int f385c;

    /* JADX INFO: renamed from: d */
    public static final int f386d;

    /* JADX INFO: renamed from: e */
    public static final int f387e;

    /* JADX INFO: renamed from: f */
    public static final int f388f;

    /* JADX INFO: renamed from: g */
    public static final int f389g;

    /* JADX INFO: renamed from: h */
    public static final int f390h;

    /* JADX INFO: renamed from: i */
    public static final int f391i;

    /* JADX INFO: renamed from: j */
    public static final int f392j;

    /* JADX INFO: renamed from: k */
    public static final int f393k;

    /* JADX INFO: renamed from: l */
    public static final int f394l;

    /* JADX INFO: renamed from: m */
    public static final int f395m;

    /* JADX INFO: renamed from: n */
    private static int f396n;

    /* JADX INFO: renamed from: o */
    private boolean f397o = false;

    /* JADX INFO: renamed from: p */
    private Display f398p = Display.getDisplay(this);

    /* JADX INFO: renamed from: q */
    private RunnableC0015ao f399q = new RunnableC0015ao(this, this.f398p);

    /* JADX INFO: renamed from: r */
    private C0030bc f400r;

    /* JADX INFO: renamed from: s */
    private C0013am f401s;

    static {
        f396n = 1;
        int i = f396n;
        f396n = i + 1;
        f383a = i;
        int i2 = f396n;
        f396n = i2 + 1;
        f384b = i2;
        int i3 = f396n;
        f396n = i3 + 1;
        f385c = i3;
        int i4 = f396n;
        f396n = i4 + 1;
        f386d = i4;
        int i5 = f396n;
        f396n = i5 + 1;
        f387e = i5;
        int i6 = f396n;
        f396n = i6 + 1;
        f388f = i6;
        int i7 = f396n;
        f396n = i7 + 1;
        f389g = i7;
        int i8 = f396n;
        f396n = i8 + 1;
        f390h = i8;
        int i9 = f396n;
        f396n = i9 + 1;
        f391i = i9;
        int i10 = f396n;
        f396n = i10 + 1;
        f392j = i10;
        int i11 = f396n;
        f396n = i11 + 1;
        f393k = i11;
        int i12 = f396n;
        f396n = i12 + 1;
        f394l = i12;
        int i13 = f396n;
        f396n = i13 + 1;
        f395m = i13;
    }

    public Dropscape() {
        this.f399q.f213j = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m249a(int i) {
        C0013am c0013am;
        boolean z = true;
        if (i == f383a) {
            destroyApp(false);
            notifyDestroyed();
            return;
        }
        if (i == f384b) {
            this.f399q.m142a(this.f401s);
            return;
        }
        if (i == f385c) {
            this.f399q.m142a(this.f401s);
            return;
        }
        if (i == f386d) {
            this.f399q.m142a(this.f400r);
            return;
        }
        if (i == f387e) {
            this.f399q.m142a(this.f400r);
            this.f401s.m128e();
            this.f400r.m205a();
            this.f400r.m206a(this.f400r.f360k);
            return;
        }
        if (i == f388f) {
            this.f399q.m142a(this.f400r);
            this.f401s.m128e();
            this.f400r.m205a();
            this.f400r.m206a(this.f400r.f361l);
            return;
        }
        if (i == f389g) {
            this.f399q.m142a(this.f400r);
            this.f401s.m128e();
            this.f400r.m205a();
            this.f400r.m206a(this.f400r.f363n);
            return;
        }
        if (i == f390h) {
            this.f400r.m207a(true);
            this.f401s.m117a(true);
            return;
        }
        if (i == f391i) {
            this.f400r.m207a(false);
            this.f401s.m117a(false);
        } else {
            if (i == f392j || i == f393k) {
                return;
            }
            if (i == f394l) {
                c0013am = this.f401s;
            } else {
                if (i != f395m) {
                    return;
                }
                c0013am = this.f401s;
                z = false;
            }
            c0013am.m122b(z);
        }
    }

    public final void destroyApp(boolean z) {
        this.f399q.m144c();
        this.f398p = null;
        this.f399q = null;
        C0026az.m181b();
    }

    public final void pauseApp() {
        this.f399q.m143b();
    }

    public final void startApp() throws MIDletStateChangeException {
        if (!this.f397o) {
            try {
                C0026az.m180a(this);
                this.f401s = new C0013am(this.f399q);
                this.f400r = new C0030bc(this.f399q);
                this.f399q.f209f = this.f400r;
                this.f397o = true;
            } catch (Exception e) {
                Alert alert = new Alert("Dropscape");
                alert.setTimeout(-2);
                alert.setString(e.toString());
                this.f398p.setCurrent(alert);
                e.printStackTrace();
                return;
            }
        }
        this.f399q.m140a();
    }
}
