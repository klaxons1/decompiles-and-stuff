package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cz */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0081cz extends AbstractC0032bd {

    /* JADX INFO: renamed from: a */
    int f840a;

    C0081cz() {
        this((byte) 0);
    }

    private C0081cz(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException {
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        byte bM422d = C0028b.m422d(c0028b, inputStream);
        long jM419b = C0028b.m419b(c0028b, inputStream);
        float fM425f = C0028b.m425f(c0028b, inputStream);
        float fM425f2 = C0028b.m425f(c0028b, inputStream);
        float fM425f3 = C0028b.m425f(c0028b, inputStream);
        float fM425f4 = C0028b.m425f(c0028b, inputStream);
        float fM425f5 = C0028b.m425f(c0028b, inputStream);
        float fM425f6 = C0028b.m425f(c0028b, inputStream);
        int iM414a = C0028b.m414a(c0028b, inputStream);
        Light light = new Light(bM422d);
        this.f840a = C0028b.m414a(c0028b, inputStream);
        light.f401i = c0004ac.f559c;
        light.f402j = c0004ac.f560d;
        this.f698d = light;
        light.setColor((int) jM419b);
        light.setIntensity(fM425f);
        if (bM422d == 2 || bM422d == 3) {
            light.setAttenuation(fM425f2, fM425f3, fM425f4);
        }
        if (bM422d == 3) {
            light.setSpot(fM425f5, fM425f6);
        }
        if (iM414a != -1) {
            light.setRefGid(iM414a);
        }
    }
}
