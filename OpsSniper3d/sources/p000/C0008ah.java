package p000;

import com.m3gworks.engine.RunnableC0025f;

/* JADX INFO: renamed from: ah */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0008ah {

    /* JADX INFO: renamed from: a */
    private static C0008ah f34a;

    /* JADX INFO: renamed from: a */
    public static C0008ah m26a() {
        if (f34a == null) {
            f34a = new C0008ah();
        }
        return f34a;
    }

    /* JADX INFO: renamed from: a */
    private static void m27a(AbstractC0033k abstractC0033k) {
        float[] fArrM205a = abstractC0033k.m205a(1, 3.0f);
        C0013am c0013amM209c = abstractC0033k.m209c(fArrM205a);
        float[] fArrMo174a = abstractC0033k.mo174a(fArrM205a);
        if (abstractC0033k.mo68a(c0013amM209c) != null || abstractC0033k.m206b(c0013amM209c) != null || fArrMo174a[0] != fArrM205a[0] || fArrMo174a[1] != fArrM205a[1] || fArrMo174a[2] != fArrM205a[2]) {
            if (C0040r.f296a.nextInt(2) == 0) {
                abstractC0033k.mo176c(70.0f);
                return;
            } else {
                abstractC0033k.mo177d(70.0f);
                return;
            }
        }
        C0026d c0026dM18b = C0045w.m228a().m240f().m18b();
        float[] fArr = c0026dM18b.f154a;
        float[] fArrM212m = abstractC0033k.m212m();
        float[] fArr2 = {fArrM212m[0] + fArrMo174a[0], fArrM212m[1] + fArrMo174a[1], fArrM212m[2] + fArrMo174a[2]};
        if (((fArr[2] - fArr2[2]) * (fArr[2] - fArr2[2])) + ((fArr[0] - fArr2[0]) * (fArr[0] - fArr2[0])) + ((fArr[1] - fArr2[1]) * (fArr[1] - fArr2[1])) < c0026dM18b.f156c * c0026dM18b.f156c) {
            abstractC0033k.m173a(1, fArrMo174a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m28b(AbstractC0042t abstractC0042t) {
        abstractC0042t.m210c(C0045w.m228a().m240f().f18g.m208b(abstractC0042t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    private boolean m29c(AbstractC0042t abstractC0042t) {
        InterfaceC0032j interfaceC0032j = (InterfaceC0032j) abstractC0042t;
        AbstractC0042t abstractC0042t2 = C0045w.m228a().m240f().f18g;
        float[] fArrM212m = abstractC0042t.m212m();
        float[] fArrM212m2 = abstractC0042t2.m212m();
        float[] fArr = {fArrM212m2[0] - fArrM212m[0], 0.0f, fArrM212m2[2] - fArrM212m[2]};
        float[] fArrM205a = abstractC0042t.m205a(1, 3.0f);
        float degrees = (float) Math.toDegrees((float) C0003ac.m16a(((double) C0034l.m184a(fArrM205a, fArr)) / (Math.sqrt(((fArrM205a[0] * fArrM205a[0]) + (fArrM205a[1] * fArrM205a[1])) + (fArrM205a[2] * fArrM205a[2])) * Math.sqrt(((fArr[0] * fArr[0]) + (fArr[1] * fArr[1])) + (fArr[2] * fArr[2])))));
        if (C0034l.m186b(fArrM205a, fArr)[1] < 0.0f) {
            abstractC0042t.mo177d(degrees);
        } else {
            abstractC0042t.mo176c(degrees);
        }
        interfaceC0032j.mo4a();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m30a(AbstractC0042t abstractC0042t) {
        C0002ab c0002ab = (C0002ab) abstractC0042t;
        if (c0002ab.m181i()) {
            if (c0002ab.mo7b() <= 0) {
                return;
            }
            if (c0002ab.m216q() == 3) {
                int iNextInt = C0040r.f296a.nextInt(6);
                if (c0002ab.m14r()) {
                    c0002ab.m8b(false);
                    if (iNextInt < 2) {
                        m27a((AbstractC0033k) abstractC0042t);
                    } else if (iNextInt > 4 && RunnableC0025f.m117a().m124e() == 2) {
                        m29c(abstractC0042t);
                        return;
                    }
                } else if (c0002ab.m13l()) {
                    c0002ab.m6a(false);
                    if (RunnableC0025f.m117a().m124e() == 2) {
                        if (iNextInt < 3) {
                            c0002ab.mo4a();
                            return;
                        }
                        return;
                    }
                } else if (iNextInt <= 1) {
                    if (!C0045w.m228a().m240f().f18g.m204a(abstractC0042t) && RunnableC0025f.m117a().m124e() == 2) {
                        m29c(abstractC0042t);
                        return;
                    }
                } else if (iNextInt == 2) {
                    AbstractC0033k abstractC0033k = (AbstractC0033k) abstractC0042t;
                    int iNextInt2 = C0040r.f296a.nextInt(25);
                    if (iNextInt2 % 2 == 0) {
                        abstractC0033k.mo176c(iNextInt2);
                    } else {
                        abstractC0033k.mo177d(iNextInt2);
                    }
                } else if (iNextInt > 4) {
                    m27a((AbstractC0033k) abstractC0042t);
                }
            }
        }
        int iM182j = c0002ab.m182j();
        if (!c0002ab.m181i() && (iM182j == 1 || iM182j == 2 || iM182j == 3 || iM182j == 4)) {
            c0002ab.m179g();
        }
        c0002ab.m180h();
    }
}
