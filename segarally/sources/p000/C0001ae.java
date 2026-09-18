package p000;

import Coral.Math.Float.crlM44;

/* JADX INFO: renamed from: ae */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class C0001ae {
    private crlM44 Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0022bm f365Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0027bx f366Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public boolean f367Code;

    public C0001ae() {
    }

    public C0001ae(boolean z) {
        this();
        this.f367Code = true;
    }

    /* JADX INFO: renamed from: V */
    public void mo16V() {
    }

    /* JADX INFO: renamed from: Z */
    public void mo17Z() {
        if (this.f367Code) {
            this.f366Code = C0031g.f485Code.Code(this.f365Code.f127V);
            this.Code = this.f366Code.f474Code;
            this.f365Code.Code(this.Code);
            this.f365Code.Code(this.f366Code);
        }
    }
}
