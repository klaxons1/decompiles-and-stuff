package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ch */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0063ch extends AbstractC0032bd {
    C0063ch() {
        this((byte) 0);
    }

    private C0063ch(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException, IOException {
        int i = c0028b.f687d;
        c0028b.f687d = 0;
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        byte bM422d = C0028b.m422d(c0028b, inputStream);
        C0028b.m414a(c0028b, inputStream);
        int iM426g = C0028b.m426g(c0028b, inputStream);
        int iM426g2 = C0028b.m426g(c0028b, inputStream);
        short[] sArr = new short[iM426g2];
        if (bM422d == 1) {
            int i2 = c0004ac.f557a - c0028b.f687d;
            byte[] bArr = new byte[i2];
            inputStream.read(bArr);
            i += i2;
            inputStream = new C0016ao(bArr);
        }
        for (int i3 = 0; i3 < iM426g2; i3++) {
            sArr[i3] = C0028b.m424e(c0028b, inputStream);
        }
        BoneDeformer boneDeformer = new BoneDeformer(iM426g, iM426g2, sArr);
        this.f698d = boneDeformer;
        boneDeformer.f401i = c0004ac.f559c;
        boneDeformer.f402j = c0004ac.f560d;
        if (iM426g > 0) {
            for (int i4 = 0; i4 < iM426g; i4++) {
                short sM421c = C0028b.m421c(c0028b, inputStream);
                if (sM421c > 4) {
                    throw new IllegalStateException();
                }
                boneDeformer.f142b[i4] = C0028b.m421c(c0028b, inputStream);
                for (int i5 = 0; i5 < sM421c; i5++) {
                    boneDeformer.f143c[i4].f1039a[i5] = C0028b.m425f(c0028b, inputStream);
                }
                for (int i6 = 0; i6 < sM421c; i6++) {
                    boneDeformer.f143c[i4].f1040b[i6] = C0028b.m421c(c0028b, inputStream);
                }
                boneDeformer.f143c[i4].f1041c = sM421c;
            }
            boneDeformer.m55b();
        }
        if (bM422d == 1) {
            c0028b.f687d = i;
        } else {
            c0028b.f687d = i + c0028b.f687d;
        }
    }
}
