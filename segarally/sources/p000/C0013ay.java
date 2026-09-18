package p000;

import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: ay */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0013ay extends C0002ag {
    private long Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0027bx f410Code;

    /* JADX INFO: renamed from: I */
    private crlV4 f43I = new crlV4();

    /* JADX INFO: renamed from: V */
    private long f44V;

    /* JADX INFO: renamed from: V */
    private crlV4 f45V;

    public C0013ay(Object obj) {
        this.f410Code = (C0027bx) obj;
    }

    @Override // p000.C0002ag
    public final void Code() {
        if (C0031g.f276e >= this.f44V) {
            this.f45V = ((C0002ag) this).f369Code;
            m19V(this.f43I.f362Code * this.f410Code.m123V(), this.f43I.f18V * this.f410Code.m123V(), 0.0f);
            this.f43I.m207Code(1.01f);
            if (this.f45V.f362Code > 110.0f || this.f45V.f362Code < -110.0f || this.f45V.f18V > 110.0f || this.f45V.f18V < -110.0f || C0031g.f276e > this.Code) {
                Code(false);
            }
        }
    }

    @Override // p000.C0002ag
    /* JADX INFO: renamed from: V */
    public final void mo18V() {
        float fNextFloat = (RunnableC0025bt.f460Code.nextFloat() * 220.0f) - 110.0f;
        float fNextFloat2 = (RunnableC0025bt.f460Code.nextFloat() * 220.0f) - 110.0f;
        this.f44V = C0031g.f276e + ((long) 2000) + ((long) RunnableC0025bt.f460Code.nextInt(1000));
        this.Code = this.f44V + ((long) 12000);
        Code(2.0f + (RunnableC0025bt.f460Code.nextFloat() * 6.0f));
        this.f43I.m208Code(fNextFloat * 0.03f, fNextFloat2 * 0.03f, 0.0f);
        Code(fNextFloat, fNextFloat2, 0.0f);
    }
}
