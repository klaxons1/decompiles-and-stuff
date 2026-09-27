package com.m3gworks.engine;

import java.util.Timer;
import javax.microedition.lcdui.Displayable;
import javax.microedition.m3g.Mesh;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;
import p000.AbstractC0042t;
import p000.C0001aa;
import p000.C0002ab;
import p000.C0004ad;
import p000.C0005ae;
import p000.C0010aj;
import p000.C0015ao;
import p000.C0026d;
import p000.C0028f;
import p000.C0029g;
import p000.C0030h;
import p000.C0039q;
import p000.C0045w;
import p000.C0047y;
import p000.InterfaceC0032j;

/* JADX INFO: renamed from: com.m3gworks.engine.f */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class RunnableC0025f implements Runnable {

    /* JADX INFO: renamed from: a */
    private static RunnableC0025f f150a;

    /* JADX INFO: renamed from: c */
    private C0047y f152c;

    /* JADX INFO: renamed from: b */
    private int f151b = 5;

    /* JADX INFO: renamed from: d */
    private int f153d = 0;

    private RunnableC0025f() {
    }

    /* JADX INFO: renamed from: a */
    public static RunnableC0025f m117a() {
        if (f150a == null) {
            f150a = new RunnableC0025f();
        }
        return f150a;
    }

    /* JADX INFO: renamed from: c */
    public static void m118c() {
        C0020a.m97a();
        C0004ad c0004adM240f = C0045w.m228a().m240f();
        c0004adM240f.f18g.mo11e();
        if (c0004adM240f.f19h != null) {
            c0004adM240f.f19h.mo11e();
        }
        for (int i = 0; i < c0004adM240f.f20i.length; i++) {
            AbstractC0042t[] abstractC0042tArr = c0004adM240f.f20i[i].f159f;
            if (abstractC0042tArr != null) {
                for (AbstractC0042t abstractC0042t : abstractC0042tArr) {
                    abstractC0042t.mo11e();
                }
            }
            AbstractC0042t[] abstractC0042tArr2 = c0004adM240f.f20i[i].f160g;
            if (abstractC0042tArr2 != null) {
                for (AbstractC0042t abstractC0042t2 : abstractC0042tArr2) {
                    abstractC0042t2.mo11e();
                }
            }
        }
        C0004ad c0004adM240f2 = C0045w.m228a().m240f();
        for (int i2 = 0; i2 < c0004adM240f2.f20i.length; i2++) {
            C0001aa[] c0001aaArr = c0004adM240f2.f20i[i2].f162i;
            if (c0001aaArr != null) {
                for (C0001aa c0001aa : c0001aaArr) {
                    c0001aa.f3c = false;
                    c0001aa.f2b.setRenderingEnable(false);
                    c0001aa.f2b.setPickingEnable(false);
                    c0001aa.f1a.setRenderingEnable(true);
                    c0001aa.f1a.setPickingEnable(true);
                }
            }
        }
        C0004ad c0004adM240f3 = C0045w.m228a().m240f();
        for (int i3 = 0; i3 < c0004adM240f3.f20i.length; i3++) {
            C0005ae[] c0005aeArr = c0004adM240f3.f20i[i3].f161h;
            if (c0005aeArr != null) {
                for (int i4 = 0; i4 < c0005aeArr.length; i4++) {
                    c0005aeArr[i4].f30f = false;
                    c0005aeArr[i4].f28d.setRenderingEnable(true);
                    c0005aeArr[i4].f28d.setPickingEnable(true);
                    c0005aeArr[i4].f28d.setTranslation(c0005aeArr[i4].f27c[0], c0005aeArr[i4].f27c[1], c0005aeArr[i4].f27c[2]);
                }
            }
        }
        C0004ad c0004adM240f4 = C0045w.m228a().m240f();
        if (c0004adM240f4.f20i != null) {
            c0004adM240f4.f22k = 0;
            for (int i5 = 0; i5 < c0004adM240f4.f20i.length; i5++) {
                c0004adM240f4.f20i[i5].f158e = false;
            }
        }
        C0045w.m228a().m240f();
        Mesh mesh = C0045w.m228a().f327a;
        if (mesh != null) {
            float[] fArr = C0045w.m228a().f328b;
            mesh.setTranslation(fArr[0], fArr[1], fArr[2]);
        }
        C0030h.m157a().m166c();
        C0010aj.m33a().m37b();
    }

    /* JADX INFO: renamed from: a */
    public final void m119a(int i) {
        this.f151b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m120a(C0026d c0026d) {
        c0026d.f158e = true;
        AbstractC0042t[] abstractC0042tArr = c0026d.f160g;
        if (abstractC0042tArr != null) {
            for (AbstractC0042t abstractC0042t : abstractC0042tArr) {
                C0002ab c0002ab = (C0002ab) abstractC0042t;
                if (c0002ab.mo7b() > 0 && c0002ab.m216q() == 4 && !c0002ab.m15s()) {
                    c0002ab.m172a(8);
                }
            }
        }
        AbstractC0042t[] abstractC0042tArr2 = c0026d.f159f;
        if (abstractC0042tArr2 != null) {
            for (AbstractC0042t abstractC0042t2 : abstractC0042tArr2) {
                C0039q c0039q = (C0039q) abstractC0042t2;
                c0039q.m198b(true);
                if (c0039q.mo7b() > 0 && c0039q.m216q() == 1) {
                    c0039q.m172a(10);
                }
            }
        }
        if (!c0026d.f163j) {
            m123d();
        } else {
            C0010aj.m33a().m36a(-1, false);
            C0021b.m101a().m103c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m121a(boolean z) {
        if (((InterfaceC0032j) C0045w.m228a().m240f().f18g).mo7b() <= 0 || z) {
            this.f153d = 2;
            return;
        }
        this.f153d = 1;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("m3gworksSnpEl", true);
            int i = Integer.parseInt(new String(recordStoreOpenRecordStore.getRecord(2)));
            if (i == C0045w.m228a().m241g() && i != C0045w.m228a().m238d().size() - 1) {
                byte[] bytes = new StringBuffer(String.valueOf(i + 1)).toString().getBytes();
                recordStoreOpenRecordStore.setRecord(2, bytes, 0, bytes.length);
                ((C0004ad) C0045w.m228a().m238d().elementAt(C0045w.m228a().m241g() + 1)).f21j = true;
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (RecordStoreNotFoundException e) {
            e.printStackTrace();
        } catch (RecordStoreException e2) {
            e2.printStackTrace();
        } catch (RecordStoreFullException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m122b() {
        if (this.f151b == 4 || this.f151b == 5 || this.f151b == 6) {
            Thread thread = new Thread(this);
            this.f153d = 0;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m123d() {
        C0045w.m228a().m240f().m18b().m126a();
        C0004ad c0004adM240f = C0045w.m228a().m240f();
        if (c0004adM240f.f22k == C0045w.m228a().m240f().f20i.length - 1) {
            m121a(false);
        } else {
            C0030h.m157a().m161a(1);
            c0004adM240f.f22k++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m124e() {
        return this.f151b;
    }

    /* JADX INFO: renamed from: f */
    public final int m125f() {
        return this.f153d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Displayable displayableM106a = C0022c.m106a();
        this.f151b = 1;
        Timer timer = new Timer();
        while (this.f151b != 4 && this.f151b != 5 && this.f151b != 6) {
            try {
                displayableM106a.m110c();
                if (GameMIDlet.m95a().m96b().getCurrent() != displayableM106a) {
                    GameMIDlet.m95a().m96b().setCurrent(displayableM106a);
                }
                if (this.f151b == 2) {
                    if (this.f153d != 0) {
                        this.f151b = 3;
                        C0010aj.m33a().m36a(-1, false);
                        if (C0045w.m228a().m240f().m18b().f164k == null || this.f153d == 2) {
                            C0020a.m97a();
                            i = 1;
                        } else {
                            i = 0;
                        }
                        this.f152c = new C0047y(i);
                        timer.schedule(this.f152c, 0L, 1000L);
                    }
                } else if (this.f151b == 3 && this.f152c.m245a() == 0) {
                    C0029g.m148a().m152a(12);
                    C0029g.m148a().m155b();
                }
                Thread.yield();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f151b == 4) {
            C0045w.m228a().m240f().f18g.mo11e();
            C0045w.m228a().m240f().m17a();
            m117a().m122b();
        }
        if (this.f151b == 5) {
            C0045w.m228a().m240f().m17a();
            RunnableC0024e.m112a();
            RunnableC0024e.m114c();
            C0028f c0028fM130a = C0028f.m130a();
            c0028fM130a.m139a(0);
            c0028fM130a.m142b();
        }
        if (this.f151b == 6) {
            C0045w.m228a().m240f().m17a();
            ((C0015ao) C0045w.m228a().m240f().f18g).m71i();
            RunnableC0024e.m112a();
            RunnableC0024e.m114c();
            C0028f.m130a().m143b(C0045w.m228a().m241g() + 1);
        }
    }
}
