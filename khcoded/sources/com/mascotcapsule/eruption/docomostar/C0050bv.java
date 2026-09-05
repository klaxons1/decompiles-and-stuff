package com.mascotcapsule.eruption.docomostar;

import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bv */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0050bv extends AbstractC0032bd {
    C0050bv() {
        this((byte) 0);
    }

    private C0050bv(byte b) {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) {
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        this.f698d = new GeometricShape(C0028b.m422d(c0028b, inputStream), C0028b.m427h(c0028b, inputStream), c0004ac.f558b > 0 ? C0028b.m427h(c0028b, inputStream) : null, C0028b.m425f(c0028b, inputStream));
        this.f698d.f401i = c0004ac.f559c;
        this.f698d.f402j = c0004ac.f560d;
    }
}
