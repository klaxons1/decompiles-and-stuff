package com.mascotcapsule.eruption.docomostar;

import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ai */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0010ai extends AbstractC0032bd {
    C0010ai() {
        this((byte) 0);
    }

    private C0010ai(byte b) {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) {
        Bone bone = new Bone();
        this.f698d = bone;
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        bone.f401i = c0004ac.f559c;
        bone.f402j = c0004ac.f560d;
    }
}
