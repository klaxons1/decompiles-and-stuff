package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.di */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0091di {

    /* JADX INFO: renamed from: a */
    private int f868a;

    /* JADX INFO: renamed from: b */
    private int f869b;

    /* JADX INFO: renamed from: c */
    private int f870c;

    /* JADX INFO: renamed from: d */
    private short[] f871d;

    /* JADX INFO: renamed from: e */
    private int f872e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0020as f873f = new C0090dh(this);

    /* JADX INFO: renamed from: g */
    private final InterfaceC0020as f874g = new C0072cq(this);

    /* JADX INFO: renamed from: h */
    private InterfaceC0020as f875h;

    C0091di() {
    }

    /* JADX INFO: renamed from: a */
    final short m482a() {
        if (this.f870c <= this.f872e) {
            return (short) -1;
        }
        short sMo412a = this.f875h.mo412a(this.f872e, this.f871d);
        this.f872e += this.f869b;
        return sMo412a;
    }

    /* JADX INFO: renamed from: a */
    final void m483a(IndexBuffer indexBuffer) {
        this.f868a = indexBuffer.getIndices(null) == 0 ? 1 : 0;
        if (this.f868a == 0) {
            this.f871d = indexBuffer.f345r;
            this.f870c = indexBuffer.f341f;
            this.f869b = 1;
            this.f872e = 0;
            this.f875h = this.f873f;
            return;
        }
        this.f871d = null;
        this.f870c = indexBuffer.f338c;
        this.f869b = indexBuffer.m171d();
        this.f872e = indexBuffer.f339d;
        this.f875h = this.f874g;
    }
}
