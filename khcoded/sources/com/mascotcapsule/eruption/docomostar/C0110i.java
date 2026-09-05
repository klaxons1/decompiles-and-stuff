package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.i */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0110i extends AbstractC0032bd {

    /* JADX INFO: renamed from: a */
    private byte f957a;

    /* JADX INFO: renamed from: b */
    private int f958b;

    /* JADX INFO: renamed from: e */
    private int[] f959e;

    C0110i() {
        this((byte) 0);
    }

    private C0110i(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException, IOException {
        int i;
        IndexBuffer indexBuffer;
        int i2 = c0028b.f687d;
        c0028b.f687d = 0;
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        byte bM422d = C0028b.m422d(c0028b, inputStream);
        C0028b.m414a(c0028b, inputStream);
        byte bM422d2 = C0028b.m422d(c0028b, inputStream);
        this.f957a = C0028b.m422d(c0028b, inputStream);
        int iM426g = C0028b.m426g(c0028b, inputStream);
        int iM426g2 = C0028b.m426g(c0028b, inputStream);
        int iM426g3 = C0028b.m426g(c0028b, inputStream);
        this.f958b = C0028b.m414a(c0028b, inputStream);
        C0028b.m414a(c0028b, inputStream);
        if (bM422d == 1) {
            int i3 = c0004ac.f557a - c0028b.f687d;
            byte[] bArr = new byte[i3];
            inputStream.read(bArr);
            inputStream = new C0016ao(bArr);
            i = i2 + i3;
        } else {
            i = i2;
        }
        int[] iArr = new int[iM426g2];
        for (int i4 = 0; i4 < iM426g2; i4++) {
            iArr[i4] = C0028b.m426g(c0028b, inputStream);
        }
        if (iM426g3 == 0) {
            IndexBuffer indexBuffer2 = new IndexBuffer(c0028b.f690g, iArr.length);
            indexBuffer2.set(bM422d2, iM426g, iArr);
            indexBuffer = indexBuffer2;
        } else {
            if (iM426g != 0) {
                throw new IllegalStateException("Illegal type data in IndexBuffer");
            }
            short[] sArr = new short[iM426g3];
            for (int i5 = 0; i5 < iM426g3; i5++) {
                sArr[i5] = C0028b.m424e(c0028b, inputStream);
            }
            IndexBuffer indexBuffer3 = bM422d2 == 7 ? new IndexBuffer(c0028b.f690g, iArr.length, sArr.length * 6) : new IndexBuffer(c0028b.f690g, iArr.length, sArr.length);
            indexBuffer3.m160a((int) bM422d2, iArr, sArr, false);
            indexBuffer = indexBuffer3;
        }
        indexBuffer.fix();
        int polygonCount = indexBuffer.getPolygonCount();
        if (this.f957a == 1) {
            this.f959e = new int[polygonCount];
            for (int i6 = 0; i6 < polygonCount; i6++) {
                this.f959e[i6] = C0028b.m414a(c0028b, inputStream);
            }
            indexBuffer.setUserData(0, this.f959e, 0, polygonCount);
        }
        if (this.f958b != -1) {
            AbstractC0032bd abstractC0032bdM177a = Loader.m177a(c0028b, 0, this.f958b);
            if (abstractC0032bdM177a == null) {
                throw new IllegalStateException("no relevant Appearance for IndexBuffer");
            }
            indexBuffer.setAppearance((Appearance) abstractC0032bdM177a.f698d);
            abstractC0032bdM177a.f697c++;
        }
        indexBuffer.f401i = c0004ac.f559c;
        indexBuffer.f402j = c0004ac.f560d;
        this.f698d = indexBuffer;
        if (bM422d == 1) {
            c0028b.f687d = i;
        } else {
            c0028b.f687d += i;
        }
    }
}
