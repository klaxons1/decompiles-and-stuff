package p000;

import Coral.Math.Float.crlV4;

/* JADX INFO: renamed from: ag */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class C0002ag {
    public float Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private int f368Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public crlV4 f369Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0027bx f370Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0031g f371Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public boolean f372Code;

    /* JADX INFO: renamed from: a */
    public float f19a;

    public C0002ag() {
        this.f368Code = -1;
        this.f369Code = new crlV4();
        new crlV4(1.0f, 1.0f, 1.0f);
    }

    public C0002ag(C0017bd c0017bd) {
        Code();
    }

    public void Code() {
        this.f370Code = null;
        this.f19a = -1.0f;
        this.Code = -1.0f;
    }

    public final void Code(float f) {
        this.Code = f / 2.0f;
    }

    public final void Code(float f, float f2, float f3) {
        this.f369Code.m208Code(f, f2, f3);
        this.f371Code.Code(this.f368Code, this.f369Code, this.Code);
    }

    public final void Code(C0031g c0031g, int i) {
        if (this.f371Code != null || this.f368Code != -1) {
            throw new RuntimeException("initParticle called more than once!");
        }
        this.f371Code = c0031g;
        this.f368Code = i;
    }

    public final void Code(boolean z) {
        this.f372Code = z;
        if (this.f372Code) {
            mo18V();
        } else {
            this.f371Code.m176f(this.f368Code);
        }
    }

    /* JADX INFO: renamed from: V */
    public void mo18V() {
    }

    /* JADX INFO: renamed from: V */
    public final void m19V(float f, float f2, float f3) {
        this.f369Code.m13V(f, f2, f3);
        this.f371Code.Code(this.f368Code, this.f369Code, this.Code);
    }
}
