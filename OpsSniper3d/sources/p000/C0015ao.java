package p000;

import com.m3gworks.engine.C0020a;
import com.m3gworks.engine.GameMIDlet;
import com.m3gworks.engine.RunnableC0025f;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.RayIntersection;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: ao */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0015ao extends AbstractC0044v implements InterfaceC0032j {

    /* JADX INFO: renamed from: a */
    private static C0014an f74a = null;

    /* JADX INFO: renamed from: k */
    private int f75k;

    /* JADX INFO: renamed from: l */
    private C0014an f76l;

    /* JADX INFO: renamed from: m */
    private int f77m;

    public C0015ao(int i, String str, int i2, float[] fArr) {
        super(1, str, 0, fArr);
        this.f77m = 3;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: a */
    public final int mo4a() {
        int i = this.f76l.f71j;
        this.f76l.m63c();
        World worldM239e = C0045w.m228a().m239e();
        if (i == 3) {
            float[] fArrM212m = m212m();
            this.f76l.m67g().m249a(worldM239e, new float[]{fArrM212m[0], m215p()[1] * 1.2f, fArrM212m[2]}, m205a(1, 1.0f));
        } else if (i == 4) {
            float[] fArrM212m2 = m212m();
            for (C0026d c0026d : C0045w.m228a().m240f().f20i) {
                C0005ae[] c0005aeArr = c0026d.f161h;
                if (c0005aeArr != null) {
                    for (int i2 = 0; i2 < c0005aeArr.length; i2++) {
                        if (c0005aeArr[i2].f26b == 4 && c0005aeArr[i2].f30f) {
                            float[] fArr = new float[3];
                            c0005aeArr[i2].f28d.getTranslation(fArr);
                            c0005aeArr[i2].f28d.setTranslation(fArrM212m2[0], fArr[1], fArrM212m2[2]);
                            c0005aeArr[i2].f28d.setRenderingEnable(true);
                        }
                    }
                }
            }
        } else {
            RayIntersection rayIntersection = new RayIntersection();
            Camera cameraM190d = C0000a.m0a().m190d();
            if (worldM239e.pick(-1, 0.5f, 0.5f, cameraM190d, rayIntersection)) {
                float[] fArr2 = new float[6];
                rayIntersection.getRay(fArr2);
                float distance = rayIntersection.getDistance();
                float f = (fArr2[3] * distance) + fArr2[0];
                float f2 = (fArr2[4] * distance) + fArr2[1];
                float f3 = fArr2[2] + (distance * fArr2[5]);
                Mesh intersected = rayIntersection.getIntersected();
                Object userObject = intersected.getUserObject();
                if (userObject != null && (userObject instanceof InterfaceC0032j)) {
                    InterfaceC0032j interfaceC0032j = (InterfaceC0032j) userObject;
                    if (interfaceC0032j.mo7b() <= 0) {
                        return 2;
                    }
                    interfaceC0032j.mo5a(this, this.f76l.m65d(), rayIntersection, worldM239e, ((f - fArr2[0]) * (f - fArr2[0])) + ((f2 - fArr2[1]) * (f2 - fArr2[1])) + ((f3 - fArr2[2]) * (f3 - fArr2[2])));
                    return 1;
                }
                if (userObject == null || !(userObject instanceof C0005ae)) {
                    if (intersected.getAppearance(0).getCompositingMode().getBlending() != 64) {
                        C0020a.m97a();
                        C0020a.m97a();
                        C0020a.m97a();
                        C0043u.m217a().m221a(3, rayIntersection, worldM239e, cameraM190d);
                    }
                } else if (((C0005ae) userObject).f26b == 4) {
                    intersected.setRenderingEnable(false);
                    intersected.setPickingEnable(false);
                    if (C0028f.m130a().m146e()) {
                        C0016ap.m72a().m76a(4);
                    }
                    float[] fArr3 = {f, 3.0f, f3};
                    C0043u.m217a().m222a(fArr3, worldM239e, (Camera) C0000a.m0a().m190d());
                    AbstractC0042t[] abstractC0042tArr = C0045w.m228a().m240f().m18b().f160g;
                    if (abstractC0042tArr != null) {
                        for (AbstractC0042t abstractC0042t : abstractC0042tArr) {
                            if (abstractC0042t != this) {
                                C0002ab c0002ab = (C0002ab) abstractC0042t;
                                if (c0002ab.mo7b() > 0) {
                                    float[] fArrM212m3 = c0002ab.m212m();
                                    c0002ab.mo5a(this, (C0035m) C0014an.f60a.elementAt(C0014an.f63d), null, null, ((fArrM212m3[0] - fArr3[0]) * (fArrM212m3[0] - fArr3[0])) + ((fArrM212m3[1] - fArr3[1]) * (fArrM212m3[1] - fArr3[1])) + ((fArrM212m3[2] - fArr3[2]) * (fArrM212m3[2] - fArr3[2])));
                                }
                            }
                        }
                    }
                    C0001aa[] c0001aaArr = C0045w.m228a().m240f().m18b().f162i;
                    if (c0001aaArr != null) {
                        for (C0001aa c0001aa : c0001aaArr) {
                            if (!c0001aa.f3c) {
                                float[] fArr4 = new float[3];
                                c0001aa.f1a.getTranslation(fArr4);
                                float f4 = ((fArr4[0] - fArr3[0]) * (fArr4[0] - fArr3[0])) + ((fArr4[1] - fArr3[1]) * (fArr4[1] - fArr3[1])) + ((fArr4[2] - fArr3[2]) * (fArr4[2] - fArr3[2]));
                                float f5 = ((C0035m) C0014an.f60a.elementAt(C0014an.f62c)).f274g;
                                if (f4 < f5 * f5) {
                                    c0001aa.m3a();
                                }
                            }
                        }
                    }
                }
            }
        }
        return 2;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: a */
    public final int mo5a(AbstractC0042t abstractC0042t, C0035m c0035m, RayIntersection rayIntersection, World world, float f) {
        int i;
        C0002ab c0002ab = (C0002ab) abstractC0042t;
        if (this.f75k > 0) {
            int i2 = (int) (10.0f * (1.0f - (f / (c0002ab.mo9c().m65d().f274g * c0002ab.mo9c().m65d().f274g))));
            if (i2 <= 0) {
                i2 = 0;
            }
            if (i2 > 0) {
                this.f77m = 0;
                if (C0028f.m130a().m147f()) {
                    GameMIDlet.m95a().m96b().vibrate(300);
                }
                this.f75k -= i2;
                if (this.f75k < 0) {
                    this.f75k = 0;
                }
            }
            i = i2;
        } else {
            i = 0;
        }
        if (this.f75k <= 0) {
            float[] fArrM205a = m205a(2, 3.0f);
            C0039q c0039q = (C0039q) C0045w.m228a().m240f().f19h;
            c0039q.mo11e();
            c0039q.m212m()[0] = m212m()[0];
            c0039q.m212m()[1] = 0.0f;
            c0039q.m212m()[2] = m212m()[2];
            m226e(fArrM205a);
            m226e(new float[]{0.0f, 1.5f, 0.0f});
            mo175b(60.0f);
            c0039q.m197a(true);
            c0039q.m172a(0);
            RunnableC0025f.m117a().m121a(false);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [t] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [t] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [t] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [t] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r1v0, types: [t] */
    /* JADX WARN: Type inference failed for: r1v11, types: [t] */
    /* JADX WARN: Type inference failed for: r1v5, types: [t] */
    /* JADX WARN: Type inference failed for: r1v6, types: [t] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [t[]] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [t[]] */
    /* JADX WARN: Type inference failed for: r5v1, types: [t[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [t[]] */
    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: a */
    public final AbstractC0042t mo68a(C0013am c0013am) {
        ?? r2;
        ?? r4;
        ?? r3;
        ?? r0;
        ?? r1;
        if (C0045w.m228a().m240f().f22k != 0) {
            ?? r5 = C0045w.m228a().m240f().f20i[C0045w.m228a().m240f().f22k - 1].f159f;
            if (r5 == 0) {
                r1 = 0;
                break;
            }
            int i = 0;
            while (true) {
                if (i >= r5.length) {
                    r1 = 0;
                    break;
                }
                ?? r6 = r5[i];
                if (((InterfaceC0032j) r6).mo7b() > 0 && r6.m213n().m52a(c0013am)) {
                    r1 = r6;
                    break;
                }
                i++;
            }
            if (r1 != 0) {
                return r1;
            }
            r2 = r1;
        } else {
            r2 = 0;
        }
        ?? r7 = C0045w.m228a().m240f().m18b().f159f;
        if (r7 == 0) {
            r4 = r2;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= r7.length) {
                r4 = r2;
                break;
            }
            ?? r8 = r7[i2];
            if (((InterfaceC0032j) r8).mo7b() > 0 && r8.m213n().m52a(c0013am)) {
                r4 = r8;
                break;
            }
            i2++;
        }
        if (r4 != 0) {
            return r4;
        }
        if (C0045w.m228a().m240f().f22k != 0) {
            ?? r9 = C0045w.m228a().m240f().f20i[C0045w.m228a().m240f().f22k - 1].f160g;
            if (r9 == 0) {
                r0 = r4;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= r9.length) {
                    r0 = r4;
                    break;
                }
                ?? r10 = r9[i3];
                if (((InterfaceC0032j) r10).mo7b() > 0 && r10.m213n().m52a(c0013am)) {
                    r0 = r10;
                    break;
                }
                i3++;
            }
            if (r0 != 0) {
                return r0;
            }
            r3 = r0;
        } else {
            r3 = r4;
        }
        ?? r11 = C0045w.m228a().m240f().m18b().f160g;
        if (r11 != 0) {
            for (?? r12 : r11) {
                if (((InterfaceC0032j) r12).mo7b() > 0 && r12.m213n().m52a(c0013am)) {
                    r3 = r12;
                    break;
                }
            }
        }
        return r3;
    }

    /* JADX INFO: renamed from: a */
    public final void m69a(int i) {
        this.f75k = i;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: b */
    public final int mo7b() {
        return this.f75k;
    }

    @Override // p000.InterfaceC0032j
    /* JADX INFO: renamed from: c */
    public final C0014an mo9c() {
        return this.f76l;
    }

    @Override // p000.AbstractC0044v, p000.AbstractC0042t
    /* JADX INFO: renamed from: d */
    public final void mo10d() {
        super.mo10d();
        this.f76l.m66e();
        this.f76l = null;
    }

    @Override // p000.AbstractC0044v, p000.AbstractC0042t
    /* JADX INFO: renamed from: e */
    public final void mo11e() {
        super.mo11e();
        if (f74a != null) {
            for (int i = 0; i < f74a.f66e.length; i++) {
                this.f76l.f66e[i] = f74a.f66e[i];
            }
            for (int i2 = 0; i2 < f74a.f67f.length; i2++) {
                this.f76l.f67f[i2] = f74a.f67f[i2];
            }
            for (int i3 = 0; i3 < f74a.f69h.length; i3++) {
                this.f76l.f69h[i3] = f74a.f69h[i3];
            }
            for (int i4 = 0; i4 < f74a.f70i.length; i4++) {
                this.f76l.f70i[i4] = f74a.f70i[i4];
            }
            this.f76l.f71j = f74a.f71j;
            this.f76l.f72k = f74a.f72k;
            f74a = null;
        } else {
            this.f76l.m57a();
        }
        this.f75k = 100;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m70h() {
        if (this.f77m >= 3) {
            return false;
        }
        this.f77m++;
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m71i() {
        f74a = new C0014an();
        for (int i = 0; i < f74a.f66e.length; i++) {
            f74a.f66e[i] = this.f76l.f66e[i];
        }
        for (int i2 = 0; i2 < f74a.f67f.length; i2++) {
            f74a.f67f[i2] = this.f76l.f67f[i2];
        }
        for (int i3 = 0; i3 < f74a.f69h.length; i3++) {
            f74a.f69h[i3] = this.f76l.f69h[i3];
        }
        for (int i4 = 0; i4 < f74a.f70i.length; i4++) {
            f74a.f70i[i4] = this.f76l.f70i[i4];
        }
        f74a.f71j = this.f76l.f71j;
        f74a.f72k = this.f76l.f72k;
    }

    @Override // p000.AbstractC0042t
    /* JADX INFO: renamed from: k */
    public final void mo12k() {
        if (this.f76l == null) {
            this.f76l = new C0014an(this);
        }
    }
}
