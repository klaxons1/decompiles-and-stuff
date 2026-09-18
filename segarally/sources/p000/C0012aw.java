package p000;

import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: aw */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0012aw extends C0002ag {

    /* JADX INFO: renamed from: a */
    public static int f41a;
    private long Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0027bx f409Code;

    /* JADX INFO: renamed from: V */
    private crlV4 f42V = new crlV4();

    public C0012aw(Object obj) {
        new crlV4();
        this.f409Code = (C0027bx) obj;
    }

    @Override // p000.C0002ag
    public final void Code() {
        this.f42V.m207Code(0.9f);
        m19V(this.f42V.f362Code, this.f42V.f18V, this.f42V.f17I);
        if (System.currentTimeMillis() > this.Code) {
            Code(false);
        }
    }

    @Override // p000.C0002ag
    /* JADX INFO: renamed from: V */
    public final void mo18V() {
        float fNextFloat = -12.0f;
        float fNextFloat2 = 30.0f;
        if (this.f409Code.Code() < 15.0f) {
            this.Code = 0L;
            return;
        }
        this.Code = System.currentTimeMillis() + ((long) 750) + ((long) RunnableC0025bt.f460Code.nextInt(250));
        int iNextInt = RunnableC0025bt.f460Code.nextInt(30);
        if (iNextInt < 5) {
            fNextFloat2 = (30.0f * RunnableC0025bt.f460Code.nextFloat()) - 15.0f;
        } else if (iNextInt < 10) {
            fNextFloat = 12.0f;
            fNextFloat2 = (30.0f * RunnableC0025bt.f460Code.nextFloat()) - 15.0f;
        } else {
            fNextFloat = (-12.0f) + (RunnableC0025bt.f460Code.nextFloat() * 24.0f);
        }
        this.f42V.m208Code((RunnableC0025bt.f460Code.nextFloat() * 3.0f) - 1.5f, 0.0f, (RunnableC0025bt.f460Code.nextFloat() * 3.0f) - 1.5f);
        Code(fNextFloat, 0.0f, fNextFloat2);
    }
}
