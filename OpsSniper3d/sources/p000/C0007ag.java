package p000;

/* JADX INFO: renamed from: ag */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0007ag {

    /* JADX INFO: renamed from: a */
    private static C0007ag f33a;

    /* JADX INFO: renamed from: a */
    public static C0007ag m21a() {
        if (f33a == null) {
            f33a = new C0007ag();
        }
        return f33a;
    }

    /* JADX INFO: renamed from: a */
    private static void m22a(C0039q c0039q) {
        float[] fArrM205a = c0039q.m205a(1, 3.0f);
        C0013am c0013amM209c = c0039q.m209c(fArrM205a);
        float[] fArrMo174a = c0039q.mo174a(fArrM205a);
        if (c0039q.mo68a(c0013amM209c) == null && c0039q.m206b(c0013amM209c) == null && fArrMo174a[0] == fArrM205a[0] && fArrMo174a[1] == fArrM205a[1] && fArrMo174a[2] == fArrM205a[2]) {
            c0039q.m173a(11, fArrMo174a);
        } else if (C0040r.f296a.nextInt(2) == 0) {
            c0039q.mo176c(30.0f);
        } else {
            c0039q.mo177d(30.0f);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m23a(AbstractC0042t abstractC0042t) {
        C0039q c0039q = (C0039q) abstractC0042t;
        if (c0039q.m181i()) {
            if (c0039q.mo7b() <= 0) {
                return;
            }
            if (c0039q.m216q() == 1 && c0039q.m199l()) {
                float[] fArrM212m = abstractC0042t.m212m();
                float[] fArrM212m2 = C0045w.m228a().m240f().f18g.m212m();
                if (((fArrM212m2[2] - fArrM212m[2]) * (fArrM212m2[2] - fArrM212m[2])) + ((fArrM212m2[0] - fArrM212m[0]) * (fArrM212m2[0] - fArrM212m[0])) + ((fArrM212m2[1] - fArrM212m[1]) * (fArrM212m2[1] - fArrM212m[1])) > 100.0f) {
                    AbstractC0042t abstractC0042t2 = C0045w.m228a().m240f().f18g;
                    float[] fArrM212m3 = abstractC0042t.m212m();
                    float[] fArrM212m4 = abstractC0042t2.m212m();
                    float[] fArr = {fArrM212m4[0] - fArrM212m3[0], 0.0f, fArrM212m4[2] - fArrM212m3[2]};
                    float[] fArrM205a = abstractC0042t.m205a(1, 3.0f);
                    float degrees = (float) Math.toDegrees((float) C0003ac.m16a(((double) C0034l.m184a(fArrM205a, fArr)) / (Math.sqrt(((fArrM205a[0] * fArrM205a[0]) + (fArrM205a[1] * fArrM205a[1])) + (fArrM205a[2] * fArrM205a[2])) * Math.sqrt(((fArr[0] * fArr[0]) + (fArr[1] * fArr[1])) + (fArr[2] * fArr[2])))));
                    if (C0034l.m186b(fArrM205a, fArr)[1] < 0.0f) {
                        abstractC0042t.mo177d(degrees);
                    } else {
                        abstractC0042t.mo176c(degrees);
                    }
                    m22a(c0039q);
                } else {
                    int iNextInt = C0040r.f296a.nextInt(6);
                    if (iNextInt == 4) {
                        int iNextInt2 = C0040r.f296a.nextInt(25);
                        if (iNextInt2 % 2 == 0) {
                            c0039q.mo176c(iNextInt2);
                        } else {
                            c0039q.mo177d(iNextInt2);
                        }
                    } else if (iNextInt < 2) {
                        m22a(c0039q);
                    }
                }
            }
        }
        int iM182j = c0039q.m182j();
        if (!c0039q.m181i() && (iM182j == 1 || iM182j == 11 || iM182j == 5)) {
            c0039q.m179g();
        }
        c0039q.m180h();
    }

    /* JADX INFO: renamed from: b */
    private static void m24b(AbstractC0042t abstractC0042t) {
        abstractC0042t.m210c(C0045w.m228a().m240f().f18g.m208b(abstractC0042t));
    }

    /* JADX INFO: renamed from: b */
    public final void m25b() {
        AbstractC0042t[] abstractC0042tArr;
        if (C0045w.m228a().m240f().f19h != null) {
            m23a(C0045w.m228a().m240f().f19h);
        }
        if (C0045w.m228a().m240f().f22k != 0 && (abstractC0042tArr = C0045w.m228a().m240f().f20i[C0045w.m228a().m240f().f22k - 1].f159f) != null) {
            for (int i = 0; i < abstractC0042tArr.length; i++) {
                m23a(abstractC0042tArr[i]);
                m24b(abstractC0042tArr[i]);
            }
        }
        AbstractC0042t[] abstractC0042tArr2 = C0045w.m228a().m240f().m18b().f159f;
        if (abstractC0042tArr2 != null) {
            for (int i2 = 0; i2 < abstractC0042tArr2.length; i2++) {
                m23a(abstractC0042tArr2[i2]);
                m24b(abstractC0042tArr2[i2]);
            }
        }
    }
}
