package p000;

import java.util.Vector;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public abstract class AbstractC0042t {

    /* JADX INFO: renamed from: d */
    public static float f305d = 0.5f;

    /* JADX INFO: renamed from: e */
    public static float f306e = 8.0f;

    /* JADX INFO: renamed from: a */
    private float[] f307a;

    /* JADX INFO: renamed from: b */
    protected int f308b;

    /* JADX INFO: renamed from: c */
    protected float[] f309c;

    /* JADX INFO: renamed from: f */
    public int f310f;

    /* JADX INFO: renamed from: g */
    protected AbstractC0036n f311g;

    /* JADX INFO: renamed from: h */
    protected float f312h;

    /* JADX INFO: renamed from: i */
    protected float f313i;

    /* JADX INFO: renamed from: j */
    public boolean f314j;

    /* JADX INFO: renamed from: k */
    private C0013am f315k;

    public AbstractC0042t() {
        this.f309c = new float[3];
        this.f310f = 0;
        this.f315k = new C0013am();
        this.f312h = 0.0f;
        this.f313i = 0.0f;
        this.f314j = true;
    }

    public AbstractC0042t(int i, String str, int i2, float[] fArr) {
        this.f309c = new float[3];
        this.f310f = 0;
        this.f315k = new C0013am();
        this.f312h = 0.0f;
        this.f313i = 0.0f;
        this.f314j = true;
        this.f308b = i2;
        this.f307a = fArr;
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo171a(float f);

    /* JADX INFO: renamed from: a */
    public AbstractC0042t mo68a(C0013am c0013am) {
        AbstractC0042t abstractC0042t;
        AbstractC0042t abstractC0042t2 = C0045w.m228a().m240f().f18g;
        if (abstractC0042t2 == this || !abstractC0042t2.f315k.m52a(c0013am)) {
            abstractC0042t2 = null;
        }
        if (abstractC0042t2 != null) {
            return abstractC0042t2;
        }
        AbstractC0042t[] abstractC0042tArr = C0045w.m228a().m240f().m18b().f159f;
        if (abstractC0042tArr != null) {
            for (AbstractC0042t abstractC0042t3 : abstractC0042tArr) {
                if (abstractC0042t3 != this && abstractC0042t3.f315k.m52a(c0013am)) {
                    abstractC0042t2 = abstractC0042t3;
                    break;
                }
            }
        }
        if (abstractC0042t2 != null) {
            return abstractC0042t2;
        }
        AbstractC0042t[] abstractC0042tArr2 = C0045w.m228a().m240f().m18b().f160g;
        if (abstractC0042tArr2 != null) {
            for (int i = 0; i < abstractC0042tArr2.length; i++) {
                abstractC0042t = abstractC0042tArr2[i];
                if (abstractC0042t == this || !abstractC0042t.f315k.m52a(c0013am)) {
                }
            }
            abstractC0042t = abstractC0042t2;
        } else {
            abstractC0042t = abstractC0042t2;
        }
        return abstractC0042t;
    }

    /* JADX INFO: renamed from: a */
    public final void m203a(AbstractC0036n abstractC0036n) {
        this.f311g = abstractC0036n;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x012f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e  */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:57:0x016d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126 A[EDGE_INSN: B:66:0x0126->B:38:0x0126 BREAK  A[LOOP:0: B:15:0x00ab->B:70:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0126 A[EDGE_INSN: B:67:0x0126->B:38:0x0126 BREAK  A[LOOP:0: B:15:0x00ab->B:70:0x00ab], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final boolean m204a(AbstractC0042t abstractC0042t) {
        float f;
        int iFloor;
        float f2;
        int iFloor2;
        int i;
        int i2;
        float[] fArr = abstractC0042t.f309c;
        float[] fArr2 = this.f309c;
        float[] fArr3 = {fArr[0] - fArr2[0], 0.0f, fArr[2] - fArr2[2]};
        float[] fArrM242h = C0045w.m228a().m242h();
        float f3 = (fArr[2] - fArrM242h[1]) / 20.0f;
        int iFloor3 = f3 < 1.0f ? 0 : (int) Math.floor(f3);
        float f4 = (fArr[0] - fArrM242h[0]) / 20.0f;
        int iFloor4 = f4 < 1.0f ? 0 : (int) Math.floor(f4);
        float f5 = (fArr2[2] - fArrM242h[1]) / 20.0f;
        int iFloor5 = f5 < 1.0f ? 0 : (int) Math.floor(f5);
        float f6 = (fArr2[0] - fArrM242h[0]) / 20.0f;
        int iFloor6 = f6 < 1.0f ? 0 : (int) Math.floor(f6);
        float[] fArr4 = {iFloor4 - iFloor6, 0.0f, iFloor3 - iFloor5};
        float[] fArrM185b = C0034l.m185b(fArr4);
        float[] fArr5 = {(fArrM185b[0] * 20.0f) / 2.0f, 0.0f, (fArrM185b[2] * 20.0f) / 2.0f};
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i3 != 0) {
                float f7 = (i3 * fArr5[0]) + fArr2[0];
                float f8 = fArr2[2] + (i3 * fArr5[2]);
                if (fArr3[0] < 0.0f) {
                    if (f7 < fArr[0]) {
                        break;
                    }
                    if (fArr3[2] >= 0.0f) {
                        if (f8 >= fArr[2]) {
                            break;
                            break;
                        }
                        f = (f8 - fArrM242h[1]) / 20.0f;
                        if (f < 1.0f) {
                            iFloor = 0;
                        } else {
                            iFloor = (int) Math.floor(f);
                        }
                        f2 = (f7 - fArrM242h[0]) / 20.0f;
                        if (f2 < 1.0f) {
                            iFloor2 = 0;
                        } else {
                            iFloor2 = (int) Math.floor(f2);
                        }
                        i = iFloor;
                        i2 = iFloor2;
                    } else {
                        if (f8 <= fArr[2]) {
                            break;
                            break;
                        }
                        f = (f8 - fArrM242h[1]) / 20.0f;
                        if (f < 1.0f) {
                            iFloor = 0;
                        } else {
                            iFloor = (int) Math.floor(f);
                        }
                        f2 = (f7 - fArrM242h[0]) / 20.0f;
                        if (f2 < 1.0f) {
                            iFloor2 = 0;
                        } else {
                            iFloor2 = (int) Math.floor(f2);
                        }
                        i = iFloor;
                        i2 = iFloor2;
                    }
                } else if (f7 <= fArr[0]) {
                    if (fArr3[2] >= 0.0f) {
                        if (f8 >= fArr[2]) {
                            break;
                        }
                        f = (f8 - fArrM242h[1]) / 20.0f;
                        if (f < 1.0f) {
                            iFloor = 0;
                        } else {
                            iFloor = (int) Math.floor(f);
                        }
                        f2 = (f7 - fArrM242h[0]) / 20.0f;
                        if (f2 < 1.0f) {
                            iFloor2 = 0;
                        } else {
                            iFloor2 = (int) Math.floor(f2);
                        }
                        i = iFloor;
                        i2 = iFloor2;
                    } else {
                        if (f8 <= fArr[2]) {
                            break;
                        }
                        f = (f8 - fArrM242h[1]) / 20.0f;
                        if (f < 1.0f) {
                            iFloor = 0;
                        } else {
                            iFloor = (int) Math.floor(f);
                        }
                        f2 = (f7 - fArrM242h[0]) / 20.0f;
                        if (f2 < 1.0f) {
                            iFloor2 = 0;
                        } else {
                            iFloor2 = (int) Math.floor(f2);
                        }
                        i = iFloor;
                        i2 = iFloor2;
                    }
                } else {
                    break;
                }
            } else {
                i = iFloor5;
                i2 = iFloor6;
            }
            i3++;
            if (i2 != i5 || i != i4) {
                Vector vector = C0045w.m228a().m243i()[i][i2];
                C0027e c0027e = new C0027e(fArr2, fArr3, 1.0f);
                if (vector != null) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6;
                        if (i7 >= vector.size()) {
                            break;
                        }
                        if (((C0027e) vector.elementAt(i7)).m127a(c0027e)) {
                            return true;
                        }
                        i6 = i7 + 1;
                    }
                }
                if (fArr4[0] == 0.0f && fArr4[2] == 0.0f) {
                    break;
                }
                i4 = i;
                i5 = i2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m205a(int i, float f) {
        float f2 = 0.0f;
        switch (i) {
            case 1:
                f2 = this.f313i + 180.0f;
                break;
            case 2:
                f2 = this.f313i;
                break;
            case 3:
                f2 = this.f313i - 90.0f;
                break;
            case 4:
                f2 = this.f313i + 90.0f;
                break;
        }
        float[] fArr = new float[3];
        double dSin = Math.sin(Math.toRadians(f2));
        double dCos = Math.cos(Math.toRadians(f2));
        if (Math.abs(dCos) == 1.0d) {
            fArr[0] = 0.0f;
            fArr[2] = (float) (((double) f) * dCos);
            fArr[1] = 0.0f;
        } else if (Math.abs(dSin) == 1.0d) {
            fArr[2] = 0.0f;
            fArr[0] = (float) (dSin * ((double) f));
            fArr[1] = 0.0f;
        } else {
            double d = f;
            fArr[0] = (float) (dSin * d);
            fArr[2] = (float) (d * dCos);
            fArr[1] = 0.0f;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: a */
    public abstract float[] mo174a(float[] fArr);

    /* JADX INFO: renamed from: b */
    public abstract float mo175b(float f);

    /* JADX INFO: renamed from: b */
    public final AbstractC0042t m206b(C0013am c0013am) {
        if (C0045w.m228a().m240f().f22k != 0) {
            C0045w.m228a().m240f();
            C0045w.m228a().m240f();
        }
        C0045w.m228a().m240f();
        return null;
    }

    /* JADX INFO: renamed from: b */
    protected final void m207b(float[] fArr) {
        float[] fArrM53a = this.f315k.m53a();
        fArrM53a[0] = fArrM53a[0] + fArr[0];
        fArrM53a[1] = fArrM53a[1] + fArr[1];
        fArrM53a[2] = fArrM53a[2] + fArr[2];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m208b(AbstractC0042t abstractC0042t) {
        float[] fArr = abstractC0042t.f309c;
        float f = fArr[0];
        float f2 = fArr[2];
        float[] fArr2 = this.f309c;
        float[] fArr3 = {f - fArr2[0], 0.0f, f2 - fArr2[2]};
        float[] fArrM205a = m205a(1, 1.0f);
        return ((float) Math.toDegrees((double) ((float) C0003ac.m16a(((double) C0034l.m184a(fArrM205a, fArr3)) / (Math.sqrt((double) ((fArrM205a[2] * fArrM205a[2]) + ((fArrM205a[0] * fArrM205a[0]) + (fArrM205a[1] * fArrM205a[1])))) * Math.sqrt((double) (((fArr3[0] * fArr3[0]) + (fArr3[1] * fArr3[1])) + (fArr3[2] * fArr3[2])))))))) <= 40.0f;
    }

    /* JADX INFO: renamed from: c */
    public abstract float mo176c(float f);

    /* JADX INFO: renamed from: c */
    public final C0013am m209c(float[] fArr) {
        float[] fArrM53a = this.f315k.m53a();
        C0013am c0013am = new C0013am(new float[3], 0.0f);
        c0013am.m53a()[0] = fArrM53a[0] + fArr[0];
        c0013am.m53a()[1] = fArrM53a[1] + fArr[1];
        c0013am.m53a()[2] = fArrM53a[2] + fArr[2];
        c0013am.m50a(this.f315k.m54b());
        return c0013am;
    }

    /* JADX INFO: renamed from: c */
    public final void m210c(boolean z) {
        this.f314j = z;
    }

    /* JADX INFO: renamed from: d */
    public abstract float mo177d(float f);

    /* JADX INFO: renamed from: d */
    protected final C0027e m211d(float[] fArr) {
        C0013am c0013amM209c = m209c(fArr);
        C0013am c0013am = new C0013am(c0013amM209c.m53a(), c0013amM209c.m54b() * 2.0f);
        float[] fArrM53a = this.f315k.m53a();
        float fM54b = c0013am.m54b();
        float f = fArrM53a[0] - fM54b;
        float f2 = fArrM53a[2] - fM54b;
        float f3 = fArrM53a[0] + fM54b;
        float f4 = fArrM53a[2] + fM54b;
        float[] fArrM242h = C0045w.m228a().m242h();
        float f5 = (f2 - fArrM242h[1]) / 20.0f;
        int iFloor = f5 < 1.0f ? 0 : (int) Math.floor(f5);
        float f6 = (f - fArrM242h[0]) / 20.0f;
        int iFloor2 = f6 < 1.0f ? 0 : (int) Math.floor(f6);
        float f7 = (f4 - fArrM242h[1]) / 20.0f;
        int iFloor3 = f7 < 1.0f ? 0 : (int) Math.floor(f7);
        float f8 = (f3 - fArrM242h[0]) / 20.0f;
        int iFloor4 = f8 < 1.0f ? 0 : (int) Math.floor(f8);
        C0027e c0027e = new C0027e(fArrM53a, fArr, 1.2f);
        Vector[][] vectorArrM243i = C0045w.m228a().m243i();
        for (int i = iFloor; i <= iFloor3; i++) {
            for (int i2 = iFloor2; i2 <= iFloor4; i2++) {
                if (i >= vectorArrM243i.length || i2 >= vectorArrM243i[i].length) {
                    return null;
                }
                if (vectorArrM243i[i][i2] != null) {
                    Vector vector = vectorArrM243i[i][i2];
                    for (int i3 = 0; i3 < vector.size(); i3++) {
                        C0027e c0027e2 = (C0027e) vector.elementAt(i3);
                        if (c0027e2.m127a(c0027e)) {
                            return c0027e2;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void mo10d() {
        if (this.f311g != null) {
            this.f311g.mo187b();
            this.f311g = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo11e() {
        this.f312h = 0.0f;
        this.f313i = 0.0f;
        this.f309c[0] = this.f307a[0];
        this.f309c[1] = this.f307a[1];
        this.f309c[2] = this.f307a[2];
        this.f315k.m50a(1.0f);
        this.f315k.m51a(this.f307a[0], 0.0f, this.f307a[2]);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo178f();

    /* JADX INFO: renamed from: k */
    public abstract void mo12k();

    /* JADX INFO: renamed from: m */
    public final float[] m212m() {
        return this.f309c;
    }

    /* JADX INFO: renamed from: n */
    public final C0013am m213n() {
        return this.f315k;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0036n m214o() {
        return this.f311g;
    }

    /* JADX INFO: renamed from: p */
    public final float[] m215p() {
        return this.f307a;
    }

    /* JADX INFO: renamed from: q */
    public final int m216q() {
        return this.f308b;
    }
}
