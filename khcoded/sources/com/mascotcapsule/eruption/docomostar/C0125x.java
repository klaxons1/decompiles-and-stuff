package com.mascotcapsule.eruption.docomostar;

import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.x */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0125x extends AbstractC0032bd {

    /* JADX INFO: renamed from: a */
    int[] f1042a;

    C0125x() {
        this((byte) 0);
    }

    private C0125x(byte b) {
        this.f1042a = new int[2];
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) {
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        Appearance appearance = new Appearance();
        this.f698d = appearance;
        this.f1042a[0] = -1;
        this.f1042a[1] = -1;
        appearance.f401i = c0004ac.f559c;
        appearance.f402j = c0004ac.f560d;
        if (c0004ac.f558b == 0) {
            this.f1042a[0] = C0028b.m414a(c0028b, inputStream);
        }
        appearance.setColor(0, C0028b.m414a(c0028b, inputStream));
        appearance.setColor(1, C0028b.m414a(c0028b, inputStream));
        appearance.setColor(2, C0028b.m414a(c0028b, inputStream));
        appearance.setColor(3, C0028b.m414a(c0028b, inputStream));
        C0028b.m419b(c0028b, inputStream);
        appearance.setShininess(C0028b.m421c(c0028b, inputStream));
        appearance.setAlphaThreshold(C0028b.m421c(c0028b, inputStream));
        appearance.setBlendMode((byte) C0028b.m421c(c0028b, inputStream), (byte) C0028b.m421c(c0028b, inputStream));
        appearance.setShadingMode(C0028b.m422d(c0028b, inputStream));
        appearance.setCullingMode(C0028b.m422d(c0028b, inputStream));
        byte bM422d = C0028b.m422d(c0028b, inputStream);
        appearance.setDrawOrder(C0028b.m424e(c0028b, inputStream));
        int iM414a = C0028b.m414a(c0028b, inputStream);
        if (c0004ac.f558b == 0) {
            appearance.setProperties(iM414a | 1024);
        } else {
            appearance.setProperties(iM414a);
        }
        appearance.setPolygonOffset(C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream));
        C0028b.m425f(c0028b, inputStream);
        for (int i = 0; i < 2; i++) {
            int iM414a2 = C0028b.m414a(c0028b, inputStream);
            if (iM414a2 != -1) {
                appearance.setTextureRefGid(i, iM414a2);
            }
            if (c0004ac.f558b > 0) {
                this.f1042a[i] = C0028b.m414a(c0028b, inputStream);
            }
            byte bM422d2 = C0028b.m422d(c0028b, inputStream);
            byte bM422d3 = C0028b.m422d(c0028b, inputStream);
            byte bM422d4 = C0028b.m422d(c0028b, inputStream);
            byte bM422d5 = C0028b.m422d(c0028b, inputStream);
            byte bM422d6 = C0028b.m422d(c0028b, inputStream);
            byte bM421c = (byte) C0028b.m421c(c0028b, inputStream);
            appearance.setTextureBlendMode(i, bM422d2);
            appearance.setTextureWrapMode(i, bM422d3, bM422d4);
            appearance.setTextureFilter(i, 1, bM422d5);
            appearance.setTextureFilter(i, 0, bM422d6);
            appearance.setTextureType(i, bM421c);
            appearance.setTextureBlendColor(i, C0028b.m414a(c0028b, inputStream));
            Transform transform = new Transform();
            float[] fArr = new float[3];
            transform.setIdentity();
            for (int i2 = 0; i2 < 4; i2++) {
                transform.f494b.m[i2 * 4] = C0028b.m425f(c0028b, inputStream);
                transform.f494b.m[(i2 * 4) + 1] = C0028b.m425f(c0028b, inputStream);
                transform.f494b.m[(i2 * 4) + 2] = C0028b.m425f(c0028b, inputStream);
            }
            fArr[0] = C0028b.m425f(c0028b, inputStream);
            fArr[1] = C0028b.m425f(c0028b, inputStream);
            fArr[2] = C0028b.m425f(c0028b, inputStream);
            transform.f495c = (byte) 0;
            transform.f496d = (byte) 0;
            transform.f497e = (byte) 0;
            transform.m270b();
            transform.m274c();
            transform.m276d();
            appearance.m25a(i, transform);
            appearance.m26a(i, fArr);
            Transform transform2 = new Transform();
            transform2.setIdentity();
            transform2.f494b.m[0] = fArr[0] * transform.f494b.m[0];
            transform2.f494b.m[1] = fArr[0] * transform.f494b.m[1];
            transform2.f494b.m[2] = fArr[0] * transform.f494b.m[2];
            transform2.f494b.m[4] = fArr[1] * transform.f494b.m[4];
            transform2.f494b.m[5] = fArr[1] * transform.f494b.m[5];
            transform2.f494b.m[6] = fArr[1] * transform.f494b.m[6];
            transform2.f494b.m[8] = fArr[2] * transform.f494b.m[8];
            transform2.f494b.m[9] = fArr[2] * transform.f494b.m[9];
            transform2.f494b.m[10] = fArr[2] * transform.f494b.m[10];
            transform2.f494b.m[12] = transform.f494b.m[12];
            transform2.f494b.m[13] = transform.f494b.m[13];
            transform2.f494b.m[14] = transform.f494b.m[14];
            transform2.f495c = (byte) 0;
            transform2.f496d = (byte) 0;
            transform2.f497e = (byte) 0;
            transform2.m270b();
            transform2.m274c();
            transform2.m276d();
            appearance.setTransform(i, transform2);
        }
        int iM414a3 = C0028b.m414a(c0028b, inputStream);
        if (iM414a3 != -1) {
            appearance.setRefGid(iM414a3);
        }
        if (bM422d == 1) {
            for (int i3 = 0; i3 < 64; i3++) {
                appearance.setUserData(i3, C0028b.m414a(c0028b, inputStream));
            }
        }
    }
}
