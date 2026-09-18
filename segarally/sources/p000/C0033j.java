package p000;

import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class C0033j {
    private static C0033j Code;

    /* JADX INFO: renamed from: V */
    public static int f325V;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public int f518Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0003ah f519Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0007ao f520Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0031g[] f521Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public boolean[] f522Code;

    /* JADX INFO: renamed from: a */
    private int f326a;

    public C0033j() {
    }

    public C0033j(boolean z) {
        this();
    }

    public C0033j(boolean z, boolean z2) {
        this();
    }

    public C0033j(boolean z, boolean z2, boolean z3) {
        this();
    }

    private C0033j(boolean z, boolean z2, boolean z3, boolean z4) {
        this();
    }

    public static C0033j Code() {
        if (Code == null) {
            Code = new C0033j(false, false, false, false);
        }
        return Code;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public int mo237Code() {
        int i = this.f520Code.f386Code;
        for (int i2 = 0; i2 < i; i2++) {
            C0027bx c0027bx = (C0027bx) this.f520Code.Code(i2);
            if (c0027bx != null) {
                c0027bx.m227Code();
            }
        }
        this.f520Code.m42m();
        f325V = 0;
        this.f520Code = null;
        return 0;
    }

    public int Code(float f) {
        if (this.f518Code != 2) {
            return -1;
        }
        for (int i = 0; i < this.f326a; i++) {
            this.f521Code[i].m170V(f);
        }
        return 0;
    }

    public int Code(int i, int i2) {
        this.f520Code = new C0007ao(i, i2);
        this.f522Code = new boolean[i * i];
        for (int i3 = 0; i3 < this.f522Code.length; i3++) {
            this.f522Code[i3] = true;
        }
        return 0;
    }

    public int Code(C0003ah c0003ah) {
        this.f520Code.Code((Object) c0003ah);
        return 0;
    }

    public int Code(C0022bm c0022bm) {
        return Code(c0022bm, true);
    }

    public int Code(C0022bm c0022bm, boolean z) {
        C0027bx c0027bx = new C0027bx();
        c0027bx.f185V = z;
        c0027bx.Code(c0022bm);
        this.f520Code.Code((Object) c0027bx);
        f325V++;
        return 0;
    }

    public int Code(RunnableC0025bt runnableC0025bt) {
        try {
            this.f521Code = new C0031g[10];
            this.f326a = 0;
            this.f518Code = 2;
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public int Code(C0031g c0031g) {
        if (this.f326a == 10) {
            return -1;
        }
        C0031g[] c0031gArr = this.f521Code;
        int i = this.f326a;
        this.f326a = i + 1;
        c0031gArr[i] = c0031g;
        return 0;
    }

    public C0027bx Code(int i) {
        return (C0027bx) this.f520Code.Code(i);
    }

    /* JADX INFO: renamed from: V */
    public int mo82V() {
        float f;
        float f2;
        C0027bx c0027bx;
        float f3 = C0031g.f236a;
        int i = this.f520Code.f386Code;
        for (int i2 = 0; i2 < i; i2++) {
            C0027bx c0027bx2 = (C0027bx) this.f520Code.Code(i2);
            if (c0027bx2 != null) {
                c0027bx2.Code(f3);
            }
        }
        int i3 = this.f520Code.f386Code;
        for (int i4 = 0; i4 < i3; i4++) {
            C0027bx c0027bx3 = (C0027bx) this.f520Code.Code(i4);
            if (c0027bx3.f185V) {
                for (int i5 = 0; i5 < i3; i5++) {
                    if (i4 != i5) {
                        C0027bx c0027bx4 = (C0027bx) this.f520Code.Code(i5);
                        if (c0027bx4.f185V && c0027bx3.m228Code(c0027bx4) && C0018be.Code(c0027bx3.f477Code, c0027bx4.f477Code)) {
                            if ((i4 == 0 || i5 == 0) && C0031g.f251ag == 1 && !C0031g.f484Code.m236Code(2) && !C0031g.f484Code.m236Code(3)) {
                                C0031g.f484Code.m173Z(RunnableC0025bt.f460Code.nextInt(10) > 5 ? 3 : 2);
                                C0031g.f484Code.m171V(100);
                            }
                            float f4 = c0027bx3.f475Code.f362Code - c0027bx4.f475Code.f362Code;
                            float f5 = c0027bx3.f475Code.f17I - c0027bx4.f475Code.f17I;
                            if (f4 == 0.0f && f5 == 0.0f) {
                                f4 = 0.01f;
                                f5 = 0.01f;
                            }
                            float fCode = crlV4.Code((f4 * f4) + (f5 * f5));
                            float f6 = f5 * fCode;
                            float f7 = fCode * f4;
                            if (!crlV4.m205Code(f7) && !crlV4.m205Code(f6)) {
                                f5 = f6;
                                f4 = f7;
                            }
                            do {
                                if (!c0027bx3.f188Z || c0027bx4.f180S <= c0027bx3.f180S) {
                                    c0027bx3.f475Code.f362Code += f4;
                                    c0027bx3.f475Code.f17I += f5;
                                    f = c0027bx3.f475Code.f362Code;
                                    f2 = c0027bx3.f475Code.f18V;
                                    c0027bx = c0027bx3;
                                } else {
                                    c0027bx4.f475Code.f362Code -= f4;
                                    c0027bx4.f475Code.f17I -= f5;
                                    f = c0027bx4.f475Code.f362Code;
                                    f2 = c0027bx4.f475Code.f18V;
                                    c0027bx = c0027bx4;
                                }
                                c0027bx.Code(f, f2, c0027bx.f475Code.f17I);
                            } while (C0018be.Code(c0027bx3.f477Code, c0027bx4.f477Code));
                        }
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public int mo92a() {
        int i = this.f520Code.f386Code;
        for (int i2 = 0; i2 < i; i2++) {
            C0022bm c0022bm = (C0022bm) this.f520Code.Code(i2);
            if (c0022bm != null && c0022bm.f129Z) {
                c0022bm.m108S();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public int m185a(int i, int i2) {
        this.f518Code = 1;
        this.f520Code = new C0007ao(i, i2);
        this.f518Code = 2;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public int m186a(C0022bm c0022bm) {
        this.f520Code.Code((Object) c0022bm);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int m187b() {
        this.f518Code = 5;
        this.f520Code.m42m();
        this.f520Code = null;
        this.f518Code = 0;
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public int mo96c() {
        this.f520Code = new C0007ao(false, false, false);
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m188d() {
        int i = this.f520Code.f386Code;
        for (int i2 = 0; i2 < i; i2++) {
            C0003ah c0003ah = (C0003ah) this.f520Code.Code(i2);
            if (c0003ah != null) {
                c0003ah.Code();
            }
        }
        this.f520Code.m42m();
        this.f520Code = null;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m189e() {
        int i = this.f520Code.f386Code;
        for (int i2 = 0; i2 < i; i2++) {
            C0003ah c0003ah = (C0003ah) this.f520Code.Code(i2);
            if (c0003ah != null) {
                c0003ah.mo20V();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public int m190f() {
        for (int i = 0; i < 10; i++) {
            this.f521Code[i] = null;
        }
        this.f521Code = null;
        this.f518Code = 0;
        return 0;
    }
}
