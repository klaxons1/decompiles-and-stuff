package p000;

import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: aq */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0008aq extends C0002ag {
    private long Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0027bx f404Code;

    /* JADX INFO: renamed from: V */
    private crlV4 f39V = new crlV4();

    public C0008aq(Object obj) {
        new crlV4();
        this.f404Code = (C0027bx) obj;
    }

    @Override // p000.C0002ag
    public final void Code() {
        this.f39V.m207Code(0.9f);
        m19V(this.f39V.f362Code * C0031g.f236a, this.f39V.f18V * C0031g.f236a, this.f39V.f17I * C0031g.f236a);
        if (System.currentTimeMillis() > this.Code) {
            Code(false);
        }
    }

    @Override // p000.C0002ag
    /* JADX INFO: renamed from: V */
    public final void mo18V() {
        if (this.f404Code.m123V() < 0.5f) {
            this.Code = 0L;
            return;
        }
        this.Code = System.currentTimeMillis() + ((long) 250) + ((long) RunnableC0025bt.f460Code.nextInt(100));
        float fNextFloat = (-4.5f) + RunnableC0025bt.f460Code.nextFloat();
        if (this.f404Code.f479Code) {
            fNextFloat += 10.0f;
        }
        this.f39V.m208Code((RunnableC0025bt.f460Code.nextFloat() - 0.5f) * 12.0f, (4.0f + RunnableC0025bt.f460Code.nextFloat()) * 12.0f, (RunnableC0025bt.f460Code.nextFloat() - 0.5f) * 12.0f);
        Code(fNextFloat, 0.0f, 30.0f);
    }
}
