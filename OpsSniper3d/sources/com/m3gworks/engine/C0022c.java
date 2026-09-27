package com.m3gworks.engine;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Transform;
import p000.AbstractC0036n;
import p000.AbstractC0042t;
import p000.C0000a;
import p000.C0004ad;
import p000.C0005ae;
import p000.C0007ag;
import p000.C0008ah;
import p000.C0009ai;
import p000.C0010aj;
import p000.C0017aq;
import p000.C0019c;
import p000.C0026d;
import p000.C0029g;
import p000.C0030h;
import p000.C0031i;
import p000.C0037o;
import p000.C0043u;
import p000.C0045w;
import p000.InterfaceC0032j;

/* JADX INFO: renamed from: com.m3gworks.engine.c */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0022c extends GameCanvas {

    /* JADX INFO: renamed from: a */
    private static C0022c f111a;

    /* JADX INFO: renamed from: b */
    private Graphics3D f112b;

    /* JADX INFO: renamed from: c */
    private Graphics f113c;

    /* JADX INFO: renamed from: d */
    private int f114d;

    public C0022c() {
        super(false);
        this.f112b = Graphics3D.getInstance();
        this.f113c = getGraphics();
        this.f114d = 1;
        C0020a.m97a();
        setFullScreenMode(true);
        C0045w.m228a().m234a(getWidth(), getHeight());
        Camera cameraM190d = C0000a.m0a().m190d();
        float width = getWidth() / getHeight();
        cameraM190d.setPerspective(60.0f / width, width, 0.1f, C0045w.m228a().m240f().f17f);
        C0045w.m228a().m239e().setActiveCamera(cameraM190d);
        m109a(1);
    }

    /* JADX INFO: renamed from: a */
    public static C0022c m106a() {
        f111a = null;
        C0022c c0022c = new C0022c();
        f111a = c0022c;
        return c0022c;
    }

    /* JADX INFO: renamed from: b */
    public static C0022c m107b() {
        return f111a;
    }

    /* JADX INFO: renamed from: e */
    public static void m108e() {
        f111a.f113c = null;
        f111a.f112b = null;
        f111a = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m109a(int i) {
        int i2;
        this.f114d = i;
        float width = getWidth() / getHeight();
        Camera cameraM190d = C0000a.m0a().m190d();
        float f = 60.0f / width;
        if (i != 1) {
            i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                i2 <<= 1;
            }
        } else {
            i2 = 1;
        }
        cameraM190d.setPerspective(f / i2, width, 0.1f, i2 * C0045w.m228a().m240f().f17f);
    }

    /* JADX INFO: renamed from: c */
    public final void m110c() {
        AbstractC0042t[] abstractC0042tArr;
        AbstractC0042t[] abstractC0042tArr2;
        AbstractC0042t[] abstractC0042tArr3;
        try {
            try {
                try {
                    if (!C0021b.m101a().m104d()) {
                        C0010aj.m33a().m38c();
                        if (!C0029g.m148a().m156c()) {
                            C0007ag.m21a().m25b();
                            C0008ah c0008ahM26a = C0008ah.m26a();
                            if (RunnableC0025f.m117a().m124e() != 1) {
                                if (C0045w.m228a().m240f().f22k != 0 && (abstractC0042tArr = C0045w.m228a().m240f().f20i[C0045w.m228a().m240f().f22k - 1].f160g) != null) {
                                    for (int i = 0; i < abstractC0042tArr.length; i++) {
                                        c0008ahM26a.m30a(abstractC0042tArr[i]);
                                        C0008ah.m28b(abstractC0042tArr[i]);
                                    }
                                }
                                AbstractC0042t[] abstractC0042tArr4 = C0045w.m228a().m240f().m18b().f160g;
                                if (abstractC0042tArr4 != null) {
                                    for (int i2 = 0; i2 < abstractC0042tArr4.length; i2++) {
                                        c0008ahM26a.m30a(abstractC0042tArr4[i2]);
                                        C0008ah.m28b(abstractC0042tArr4[i2]);
                                    }
                                }
                            }
                        }
                    } else if (!C0029g.m148a().m156c()) {
                        C0021b.m101a().m102b();
                        C0007ag.m21a().m25b();
                    }
                    C0019c c0019cM94a = C0019c.m94a();
                    for (int i3 = 0; i3 < 5; i3++) {
                        if (c0019cM94a.f103a[i3].f278c != 0) {
                            c0019cM94a.f103a[i3].m202f().m92e();
                            c0019cM94a.f103a[i3].f278c = 0;
                            if (c0019cM94a.f103a[i3].m191e() != null) {
                                c0019cM94a.f103a[i3].m191e().m203a((AbstractC0036n) null);
                                c0019cM94a.f103a[i3].m188b(null);
                            }
                            c0019cM94a.f103a[i3].m190d().setUserObject((Object) null);
                            c0019cM94a.f103a[i3].m190d().setRenderingEnable(false);
                            c0019cM94a.f103a[i3].m190d().setPickingEnable(false);
                        }
                    }
                    C0004ad c0004adM240f = C0045w.m228a().m240f();
                    c0004adM240f.f18g.mo178f();
                    if (c0004adM240f.f19h != null) {
                        c0004adM240f.f19h.mo178f();
                    }
                    if (c0004adM240f.f22k != 0 && (abstractC0042tArr3 = c0004adM240f.f20i[c0004adM240f.f22k - 1].f159f) != null) {
                        for (int i4 = 0; i4 < abstractC0042tArr3.length; i4++) {
                            if (abstractC0042tArr3[i4].f314j) {
                                abstractC0042tArr3[i4].mo178f();
                            }
                        }
                    }
                    AbstractC0042t[] abstractC0042tArr5 = c0004adM240f.m18b().f159f;
                    if (abstractC0042tArr5 != null) {
                        for (int i5 = 0; i5 < abstractC0042tArr5.length; i5++) {
                            if (abstractC0042tArr5[i5].f314j) {
                                abstractC0042tArr5[i5].mo178f();
                            }
                        }
                    }
                    if (c0004adM240f.f22k != 0 && (abstractC0042tArr2 = c0004adM240f.f20i[c0004adM240f.f22k - 1].f160g) != null) {
                        for (int i6 = 0; i6 < abstractC0042tArr2.length; i6++) {
                            if (abstractC0042tArr2[i6].f314j) {
                                abstractC0042tArr2[i6].mo178f();
                            }
                        }
                    }
                    AbstractC0042t[] abstractC0042tArr6 = c0004adM240f.m18b().f160g;
                    if (abstractC0042tArr6 != null) {
                        for (int i7 = 0; i7 < abstractC0042tArr6.length; i7++) {
                            if (abstractC0042tArr6[i7].f314j) {
                                abstractC0042tArr6[i7].mo178f();
                            }
                        }
                    }
                    C0043u.m217a().m223c();
                    C0017aq.m79a().m81b();
                    this.f112b.bindTarget(this.f113c, true, 6);
                    this.f112b.render(C0045w.m228a().m239e());
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f112b.releaseTarget();
            this.f112b.setCamera((Camera) null, (Transform) null);
            this.f112b.resetLights();
            C0030h.m157a().m162a(this.f113c, this);
            C0029g.m148a().m154a(this.f113c, this);
            flushGraphics();
        } catch (Throwable th) {
            this.f112b.releaseTarget();
            this.f112b.setCamera((Camera) null, (Transform) null);
            this.f112b.resetLights();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m111d() {
        return this.f114d;
    }

    public final void keyPressed(int i) {
        C0031i.m170a();
        InterfaceC0032j interfaceC0032j = (InterfaceC0032j) C0045w.m228a().m240f().f18g;
        int iM124e = RunnableC0025f.m117a().m124e();
        if (C0029g.m148a().m156c()) {
            C0029g.m148a().m153a(i, getGameAction(i));
            return;
        }
        C0010aj c0010ajM33a = C0010aj.m33a();
        if (iM124e == 1) {
            if (i == -7 || i == -22) {
                C0037o[] c0037oArr = C0045w.m228a().m240f().f23l;
                for (int length = c0037oArr.length - 1; length >= 0; length--) {
                    c0037oArr[length].f282c = true;
                }
                return;
            }
            return;
        }
        if (iM124e == 2) {
            if (i == 50) {
                c0010ajM33a.m36a(1, true);
            } else if (i == 56) {
                c0010ajM33a.m36a(2, true);
            } else if (i == 52) {
                c0010ajM33a.m36a(7, true);
            } else if (i == 54) {
                c0010ajM33a.m36a(8, true);
            } else if (i == 53 || getGameAction(i) == 8) {
                if (interfaceC0032j.mo9c().f72k != 0) {
                    c0010ajM33a.m36a(0, true);
                }
            } else if (getGameAction(i) == 1) {
                c0010ajM33a.m36a(1, true);
            } else if (getGameAction(i) == 6) {
                c0010ajM33a.m36a(2, true);
            } else if (getGameAction(i) == 2) {
                c0010ajM33a.m36a(7, true);
            } else if (getGameAction(i) == 5) {
                c0010ajM33a.m36a(8, true);
            } else if (i == 49) {
                c0010ajM33a.m36a(3, true);
            } else if (i == 51) {
                c0010ajM33a.m36a(4, true);
            } else if (i == 57) {
                if (c0010ajM33a.m42g() == 1) {
                    c0010ajM33a.m35a(2);
                } else if (c0010ajM33a.m42g() == 2) {
                    c0010ajM33a.m35a(1);
                }
            }
            if (i == 48) {
                float[] fArrM212m = C0045w.m228a().m240f().f18g.m212m();
                boolean z = false;
                for (C0026d c0026d : C0045w.m228a().m240f().f20i) {
                    C0005ae[] c0005aeArr = c0026d.f161h;
                    if (c0005aeArr != null) {
                        for (int i2 = 0; i2 < c0005aeArr.length; i2++) {
                            float[] fArr = c0005aeArr[i2].f27c;
                            if (!c0005aeArr[i2].f30f) {
                                if (((fArr[2] - fArrM212m[2]) * (fArr[2] - fArrM212m[2])) + ((fArr[0] - fArrM212m[0]) * (fArr[0] - fArrM212m[0])) + ((fArr[1] - fArrM212m[1]) * (fArr[1] - fArrM212m[1])) < 25.0f) {
                                    z = true;
                                    c0005aeArr[i2].f28d.setRenderingEnable(false);
                                    c0005aeArr[i2].f30f = true;
                                    interfaceC0032j.mo9c().m58a(c0005aeArr[i2]);
                                    C0030h.m157a().m167c(c0005aeArr[i2].f26b);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (z) {
                    return;
                }
                C0030h c0030hM157a = C0030h.m157a();
                if (!c0030hM157a.m169g()) {
                    c0030hM157a.m163a(true);
                    return;
                }
                int length2 = interfaceC0032j.mo9c().f69h.length;
                int iM168f = c0030hM157a.m168f();
                int i3 = 0;
                while (i3 < length2) {
                    int i4 = iM168f == length2 + (-1) ? 0 : iM168f + 1;
                    if (interfaceC0032j.mo9c().f70i[i4] > 0) {
                        c0030hM157a.m165b(i4);
                        return;
                    } else {
                        i3++;
                        iM168f = i4;
                    }
                }
                return;
            }
            if (i == 55 && interfaceC0032j.mo9c().f72k != 0) {
                f111a.m109a(1);
                interfaceC0032j.mo9c().f72k = -1;
                int i5 = ((InterfaceC0032j) C0045w.m228a().m240f().f18g).mo9c().f71j;
                if (i5 != 0 && i5 != 1 && i5 != 2) {
                    i5 = -1;
                }
                for (int i6 = 0; i6 < 3; i6++) {
                    i5 = i5 == 2 ? 0 : i5 + 1;
                    if (interfaceC0032j.mo9c().m59a(i5)) {
                        return;
                    }
                }
                return;
            }
            if (i == 42) {
                C0030h c0030hM157a2 = C0030h.m157a();
                if (interfaceC0032j.mo9c().f72k == -1 && !c0030hM157a2.m169g() && interfaceC0032j.mo9c().f72k != 0 && interfaceC0032j.mo9c().m65d() != null && interfaceC0032j.mo9c().m65d().f275h != 1) {
                    if (this.f114d == interfaceC0032j.mo9c().m65d().f275h) {
                        m109a(2);
                        return;
                    } else {
                        m109a(this.f114d + 1);
                        return;
                    }
                }
                if (c0030hM157a2.m169g()) {
                    interfaceC0032j.mo9c().m61b(c0030hM157a2.m168f());
                    c0030hM157a2.m165b(0);
                    c0030hM157a2.m163a(false);
                    if (interfaceC0032j.mo9c().f72k != 0) {
                        m109a(1);
                    }
                }
                if (interfaceC0032j.mo9c().f72k == 0) {
                    if (this.f114d == 3) {
                        m109a(2);
                        return;
                    } else {
                        m109a(this.f114d + 1);
                        return;
                    }
                }
                return;
            }
            if (i == 35) {
                C0030h c0030hM157a3 = C0030h.m157a();
                if (this.f114d != 1) {
                    m109a(1);
                    if (interfaceC0032j.mo9c().f72k == 0) {
                        interfaceC0032j.mo9c().f72k = -1;
                        return;
                    }
                    return;
                }
                if (c0030hM157a3.m169g()) {
                    c0030hM157a3.m163a(false);
                    c0030hM157a3.m165b(0);
                    return;
                }
                return;
            }
            if (i != -7 && i != -22) {
                if ((i == -6 || i == -21) && !C0021b.m101a().m104d()) {
                    c0010ajM33a.m36a(-1, false);
                    C0029g.m148a().m152a(11);
                    C0029g.m148a().m155b();
                    return;
                }
                return;
            }
            if (!C0021b.m101a().m104d()) {
                c0010ajM33a.m36a(-1, false);
                C0029g.m148a().m152a(0);
                C0029g.m148a().m155b();
            } else if (C0045w.m228a().m240f().f22k != C0045w.m228a().m240f().f20i.length - 1) {
                C0009ai[] c0009aiArr = C0045w.m228a().m240f().m18b().f164k;
                int length3 = c0009aiArr.length - 1;
                if (c0009aiArr[length3].f35a == -1 || c0009aiArr[length3].f35a == -2) {
                    length3--;
                }
                if (c0009aiArr[length3].f35a == -1 || c0009aiArr[length3].f35a == -2) {
                    length3--;
                }
                while (length3 >= 0) {
                    c0009aiArr[length3].f37c = true;
                    length3--;
                }
            }
        }
    }

    public final void keyReleased(int i) {
        C0031i.m170a();
        if (C0029g.m148a().m156c()) {
            return;
        }
        C0010aj c0010ajM33a = C0010aj.m33a();
        if (i == 50) {
            c0010ajM33a.m36a(1, false);
            return;
        }
        if (i == 56) {
            c0010ajM33a.m36a(2, false);
            return;
        }
        if (i == 52) {
            c0010ajM33a.m36a(7, false);
            return;
        }
        if (i == 54) {
            c0010ajM33a.m36a(8, false);
            return;
        }
        if (i == 53 || getGameAction(i) == 8) {
            c0010ajM33a.m36a(0, false);
            return;
        }
        if (getGameAction(i) == 1) {
            c0010ajM33a.m36a(1, false);
            return;
        }
        if (getGameAction(i) == 6) {
            c0010ajM33a.m36a(2, false);
            return;
        }
        if (getGameAction(i) == 2) {
            c0010ajM33a.m36a(7, false);
            return;
        }
        if (getGameAction(i) == 5) {
            c0010ajM33a.m36a(8, false);
        } else if (i == 49) {
            c0010ajM33a.m36a(3, false);
        } else if (i == 51) {
            c0010ajM33a.m36a(4, false);
        }
    }

    protected final void sizeChanged(int i, int i2) {
        this.f113c = getGraphics();
    }
}
