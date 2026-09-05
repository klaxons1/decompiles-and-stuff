package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bl */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0040bl extends AbstractC0032bd {

    /* JADX INFO: renamed from: a */
    int f732a;

    /* JADX INFO: renamed from: b */
    int f733b;

    C0040bl() {
        this((byte) 0);
    }

    private C0040bl(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException {
        Camera camera = new Camera();
        this.f698d = camera;
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        byte bM422d = C0028b.m422d(c0028b, inputStream);
        float fM425f = C0028b.m425f(c0028b, inputStream);
        float fM425f2 = C0028b.m425f(c0028b, inputStream);
        float fM425f3 = C0028b.m425f(c0028b, inputStream);
        float fM425f4 = C0028b.m425f(c0028b, inputStream);
        float fM425f5 = C0028b.m425f(c0028b, inputStream);
        float fM425f6 = C0028b.m425f(c0028b, inputStream);
        byte bM422d2 = C0028b.m422d(c0028b, inputStream);
        int iM414a = C0028b.m414a(c0028b, inputStream);
        float fM425f7 = C0028b.m425f(c0028b, inputStream);
        float fM425f8 = C0028b.m425f(c0028b, inputStream);
        int iM414a2 = C0028b.m414a(c0028b, inputStream);
        this.f732a = C0028b.m414a(c0028b, inputStream);
        this.f733b = C0028b.m414a(c0028b, inputStream);
        if (bM422d == 1) {
            camera.setPerspectiveFov(fM425f, fM425f2, fM425f3, fM425f4, fM425f5, fM425f6);
        } else {
            if (bM422d != 0) {
                throw new IllegalStateException("Unsupported Camera type");
            }
            camera.setParallel((int) fM425f, (int) fM425f2, fM425f3, fM425f4);
        }
        if (bM422d2 != 0) {
            camera.setFogType(bM422d2);
            camera.setFogColor(iM414a);
            if (bM422d2 == 1) {
                camera.setFogStartEnd(fM425f7, fM425f8);
            } else if (bM422d2 == 2) {
                camera.setFogDensity(fM425f7);
            }
        }
        camera.f401i = c0004ac.f559c;
        camera.f402j = c0004ac.f560d;
        if (iM414a2 != -1) {
            camera.setRefGid(iM414a2);
        }
    }
}
