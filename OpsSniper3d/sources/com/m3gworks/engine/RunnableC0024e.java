package com.m3gworks.engine;

import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.World;
import p000.AbstractC0042t;
import p000.C0000a;
import p000.C0004ad;
import p000.C0012al;
import p000.C0014an;
import p000.C0016ap;
import p000.C0017aq;
import p000.C0019c;
import p000.C0026d;
import p000.C0028f;
import p000.C0029g;
import p000.C0030h;
import p000.C0041s;
import p000.C0043u;
import p000.C0045w;
import p000.C0046x;
import p000.C0048z;

/* JADX INFO: renamed from: com.m3gworks.engine.e */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class RunnableC0024e implements Runnable {

    /* JADX INFO: renamed from: a */
    private static RunnableC0024e f146a;

    /* JADX INFO: renamed from: b */
    private static boolean f147b = false;

    /* JADX INFO: renamed from: c */
    private int f148c = 0;

    /* JADX INFO: renamed from: d */
    private int f149d = 0;

    private RunnableC0024e() {
    }

    /* JADX INFO: renamed from: a */
    public static RunnableC0024e m112a() {
        if (f146a == null) {
            f146a = new RunnableC0024e();
        }
        return f146a;
    }

    /* JADX INFO: renamed from: b */
    public static void m113b() {
        GameMIDlet.m95a().m96b().setCurrent(C0028f.m130a());
        C0028f.m130a().m142b();
        new Thread(f146a).start();
    }

    /* JADX INFO: renamed from: c */
    public static void m114c() {
        C0045w.m228a().m240f();
        C0004ad c0004adM240f = C0045w.m228a().m240f();
        c0004adM240f.f18g.mo10d();
        for (int i = 0; i < c0004adM240f.f20i.length; i++) {
            AbstractC0042t[] abstractC0042tArr = c0004adM240f.f20i[i].f159f;
            if (abstractC0042tArr != null) {
                for (AbstractC0042t abstractC0042t : abstractC0042tArr) {
                    abstractC0042t.mo10d();
                }
            }
            AbstractC0042t[] abstractC0042tArr2 = c0004adM240f.f20i[i].f160g;
            if (abstractC0042tArr2 != null) {
                for (AbstractC0042t abstractC0042t2 : abstractC0042tArr2) {
                    abstractC0042t2.mo10d();
                }
            }
        }
        C0045w.m228a().m237c();
        C0020a.m97a();
        C0043u.m217a().m224d();
        C0017aq.m79a().m82c();
        C0030h.m157a();
        C0029g.m148a();
        C0046x c0046xM244a = C0046x.m244a();
        for (int i2 = 0; i2 < c0046xM244a.f336a.length; i2++) {
            c0046xM244a.f336a[i2] = null;
        }
        C0022c.m108e();
        Runtime.getRuntime().gc();
    }

    /* JADX INFO: renamed from: d */
    public static void m115d() {
        C0020a.m97a();
        C0043u.m220e();
        C0048z.m247c();
        C0014an.m56f();
        C0016ap.m72a().m78c();
        C0017aq.f88a = null;
        C0017aq.f90c = null;
        C0030h.m160e();
        Runtime.getRuntime().gc();
    }

    /* JADX INFO: renamed from: e */
    public final int m116e() {
        return this.f148c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0028f.m130a().m139a(9);
            this.f149d++;
            this.f148c = 1;
            C0028f.m130a().m142b();
            this.f149d++;
            World worldM236b = C0045w.m228a().m236b();
            this.f149d++;
            this.f148c = 20;
            C0028f.m130a().m142b();
            this.f149d++;
            if (!f147b) {
                C0020a.m97a();
            }
            this.f149d++;
            this.f148c = 25;
            C0028f.m130a().m142b();
            if (!f147b) {
                C0048z.m246a();
            }
            this.f149d++;
            this.f148c = 28;
            C0028f.m130a().m142b();
            if (!f147b) {
                C0043u.m219b();
            }
            this.f149d++;
            this.f148c = 35;
            C0028f.m130a().m142b();
            if (!f147b) {
                C0016ap.m72a().m77b();
            }
            this.f148c = 50;
            C0028f.m130a().m142b();
            this.f149d++;
            if (!f147b) {
                C0017aq.f89b = new Image[3];
                C0017aq.f88a = C0012al.m49a("/res/image2d/muzzleflash_r.png", 3, 32, C0017aq.f89b);
                C0017aq.f91d = new Image[1];
                C0017aq.f90c = C0012al.m49a("/res/image2d/muzzleflash_p.png", 1, 32, C0017aq.f91d);
            }
            this.f149d++;
            this.f148c = 60;
            C0028f.m130a().m142b();
            C0004ad c0004adM240f = C0045w.m228a().m240f();
            c0004adM240f.f18g.mo12k();
            for (int i = 0; i < c0004adM240f.f20i.length; i++) {
                AbstractC0042t[] abstractC0042tArr = c0004adM240f.f20i[i].f160g;
                if (abstractC0042tArr != null) {
                    for (AbstractC0042t abstractC0042t : abstractC0042tArr) {
                        abstractC0042t.mo12k();
                    }
                }
            }
            C0000a.m0a().m1a(worldM236b);
            C0019c c0019cM94a = C0019c.m94a();
            for (int i2 = 0; i2 < 5; i2++) {
                C0041s c0041s = new C0041s();
                c0019cM94a.f103a[i2] = c0041s;
                Node nodeM201a = c0041s.m201a(worldM236b);
                nodeM201a.setRenderingEnable(false);
                nodeM201a.setPickingEnable(false);
            }
            C0046x c0046xM244a = C0046x.m244a();
            c0046xM244a.f336a[0] = C0012al.m47a("/res/role/ownside_soldier_32X32.png");
            C0026d[] c0026dArr = C0045w.m228a().m240f().f20i;
            for (int i3 = 0; i3 < c0026dArr.length; i3++) {
                AbstractC0042t[] abstractC0042tArr2 = c0026dArr[i3].f159f;
                if (abstractC0042tArr2 != null) {
                    for (AbstractC0042t abstractC0042t2 : abstractC0042tArr2) {
                        switch (abstractC0042t2.m216q()) {
                            case 1:
                                if (c0046xM244a.f336a[1] == null) {
                                    c0046xM244a.f336a[1] = C0012al.m47a("/res/role/ownside_hostage_32X32.png");
                                }
                                break;
                            case 2:
                                if (c0046xM244a.f336a[2] == null) {
                                    c0046xM244a.f336a[2] = C0012al.m47a("/res/role/ownside_informant_32X32.png");
                                }
                                break;
                        }
                    }
                }
                AbstractC0042t[] abstractC0042tArr3 = c0026dArr[i3].f160g;
                if (abstractC0042tArr3 != null) {
                    for (AbstractC0042t abstractC0042t3 : abstractC0042tArr3) {
                        switch (abstractC0042t3.m216q()) {
                            case 3:
                                if (c0046xM244a.f336a[3] == null) {
                                    c0046xM244a.f336a[3] = C0012al.m47a("/res/role/otherside_soldier_32X32.png");
                                }
                                break;
                            case 4:
                                if (c0046xM244a.f336a[4] == null) {
                                    c0046xM244a.f336a[4] = C0012al.m47a("/res/role/otherside_officer_32X32.png");
                                }
                                break;
                        }
                    }
                }
            }
            this.f148c = 80;
            C0028f.m130a().m142b();
            this.f149d++;
            this.f148c = 85;
            C0028f.m130a().m142b();
            if (!f147b) {
                C0030h.m159d();
            }
            this.f149d++;
            this.f148c = 90;
            C0028f.m130a().m142b();
            this.f149d++;
            this.f148c = 95;
            C0028f.m130a().m142b();
            System.gc();
            this.f148c = 100;
            C0028f.m130a().m142b();
            this.f149d++;
            f147b = true;
            this.f148c = 0;
            C0028f.m130a().m139a(11);
            C0028f.m130a().m142b();
        } catch (Exception e) {
            e.printStackTrace();
            GameMIDlet.m95a().m96b().setCurrent(C0028f.m130a());
            C0028f.m130a().m140a(new StringBuffer("Ldr:").append(this.f149d).append(e.toString()).toString());
        }
    }
}
