package com.mascotcapsule.eruption.docomostar;

import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.aq */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0018aq extends AbstractC0032bd {
    C0018aq() {
        this((byte) 0);
    }

    private C0018aq(byte b) {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) {
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        int iM414a = C0028b.m414a(c0028b, inputStream);
        short sM424e = C0028b.m424e(c0028b, inputStream);
        TransformTree transformTree = new TransformTree(sM424e, c0028b.f688e & 15);
        this.f698d = transformTree;
        transformTree.f401i = c0004ac.f559c;
        transformTree.f402j = c0004ac.f560d;
        if (sM424e > 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            for (int i = 0; i < sM424e; i++) {
                transformTree.f502d[i].f964e = C0028b.m424e(c0028b, inputStream);
                for (int i2 = 0; i2 < 4; i2++) {
                    transformTree.f502d[i].f962c.f494b.m[i2 * 4] = C0028b.m425f(c0028b, inputStream);
                    transformTree.f502d[i].f962c.f494b.m[(i2 * 4) + 1] = C0028b.m425f(c0028b, inputStream);
                    transformTree.f502d[i].f962c.f494b.m[(i2 * 4) + 2] = C0028b.m425f(c0028b, inputStream);
                }
                transformTree.f502d[i].f963d[0] = C0028b.m425f(c0028b, inputStream);
                transformTree.f502d[i].f963d[1] = C0028b.m425f(c0028b, inputStream);
                transformTree.f502d[i].f963d[2] = C0028b.m425f(c0028b, inputStream);
                C0028b.m422d(c0028b, inputStream);
                fArr[0] = C0028b.m425f(c0028b, inputStream);
                fArr[1] = C0028b.m425f(c0028b, inputStream);
                fArr[2] = C0028b.m425f(c0028b, inputStream);
                fArr2[0] = C0028b.m425f(c0028b, inputStream);
                fArr2[1] = C0028b.m425f(c0028b, inputStream);
                fArr2[2] = C0028b.m425f(c0028b, inputStream);
                C0028b.m425f(c0028b, inputStream);
                if ((c0028b.f688e & 3) != 0) {
                    Transform.m251e(transformTree.f502d[i].f960a, transformTree.f502d[i].f962c);
                    ((C0083da) transformTree.f502d[i]).f848j[0] = transformTree.f502d[i].f963d[0];
                    ((C0083da) transformTree.f502d[i]).f848j[1] = transformTree.f502d[i].f963d[1];
                    ((C0083da) transformTree.f502d[i]).f848j[2] = transformTree.f502d[i].f963d[2];
                } else {
                    transformTree.f502d[i].f960a.f494b.m[0] = transformTree.f502d[i].f963d[0] * transformTree.f502d[i].f962c.f494b.m[0];
                    transformTree.f502d[i].f960a.f494b.m[1] = transformTree.f502d[i].f963d[0] * transformTree.f502d[i].f962c.f494b.m[1];
                    transformTree.f502d[i].f960a.f494b.m[2] = transformTree.f502d[i].f963d[0] * transformTree.f502d[i].f962c.f494b.m[2];
                    transformTree.f502d[i].f960a.f494b.m[4] = transformTree.f502d[i].f963d[1] * transformTree.f502d[i].f962c.f494b.m[4];
                    transformTree.f502d[i].f960a.f494b.m[5] = transformTree.f502d[i].f963d[1] * transformTree.f502d[i].f962c.f494b.m[5];
                    transformTree.f502d[i].f960a.f494b.m[6] = transformTree.f502d[i].f963d[1] * transformTree.f502d[i].f962c.f494b.m[6];
                    transformTree.f502d[i].f960a.f494b.m[8] = transformTree.f502d[i].f963d[2] * transformTree.f502d[i].f962c.f494b.m[8];
                    transformTree.f502d[i].f960a.f494b.m[9] = transformTree.f502d[i].f963d[2] * transformTree.f502d[i].f962c.f494b.m[9];
                    transformTree.f502d[i].f960a.f494b.m[10] = transformTree.f502d[i].f963d[2] * transformTree.f502d[i].f962c.f494b.m[10];
                    transformTree.f502d[i].f960a.f494b.m[12] = transformTree.f502d[i].f962c.f494b.m[12];
                    transformTree.f502d[i].f960a.f494b.m[13] = transformTree.f502d[i].f962c.f494b.m[13];
                    transformTree.f502d[i].f960a.f494b.m[14] = transformTree.f502d[i].f962c.f494b.m[14];
                }
                transformTree.f502d[i].f962c.f495c = (byte) 0;
                transformTree.f502d[i].f962c.f496d = (byte) 0;
                transformTree.f502d[i].f962c.f497e = (byte) 0;
                transformTree.f502d[i].f962c.m270b();
                transformTree.f502d[i].f962c.m274c();
                transformTree.f502d[i].f962c.m276d();
                transformTree.f502d[i].f960a.f495c = (byte) 0;
                transformTree.f502d[i].f960a.f496d = (byte) 0;
                transformTree.f502d[i].f960a.f497e = (byte) 0;
                transformTree.f502d[i].f960a.m270b();
                transformTree.f502d[i].f960a.m274c();
                transformTree.f502d[i].f960a.m276d();
            }
        }
        transformTree.f505g = true;
        transformTree.m285b(true);
        if (iM414a != -1) {
            transformTree.setRefGid(iM414a);
        }
    }
}
