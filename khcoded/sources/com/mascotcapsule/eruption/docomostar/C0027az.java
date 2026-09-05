package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.az */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0027az extends AbstractC0032bd {
    C0027az() {
        this((byte) 0);
    }

    private C0027az(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    private static boolean m413a(C0028b c0028b, VertexBuffer vertexBuffer, int i, int i2, byte b, byte b2, InputStream inputStream) throws IllegalStateException {
        int i3 = 0;
        if (i2 != 0) {
            int i4 = b2 * i2;
            if (b == 0) {
                float[] fArr = (float[]) vertexBuffer.getVerticesArray(i);
                while (i3 < i4) {
                    fArr[i3] = C0028b.m425f(c0028b, inputStream);
                    i3++;
                }
            } else if (b == 3) {
                short[] sArr = (short[]) vertexBuffer.getVerticesArray(i);
                while (i3 < i4) {
                    sArr[i3] = C0028b.m424e(c0028b, inputStream);
                    i3++;
                }
            } else {
                byte[] bArr = (byte[]) vertexBuffer.getVerticesArray(i);
                int i5 = i4 << 2;
                while (i3 < i5) {
                    bArr[i3] = C0028b.m422d(c0028b, inputStream);
                    i3++;
                }
            }
            vertexBuffer.updateVertices(i);
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException, IOException {
        int i;
        InputStream c0016ao;
        int i2 = c0028b.f687d;
        c0028b.f687d = 0;
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        byte bM422d = C0028b.m422d(c0028b, inputStream);
        C0028b.m414a(c0028b, inputStream);
        byte bM422d2 = C0028b.m422d(c0028b, inputStream);
        byte bM422d3 = C0028b.m422d(c0028b, inputStream);
        byte bM422d4 = C0028b.m422d(c0028b, inputStream);
        byte bM422d5 = C0028b.m422d(c0028b, inputStream);
        byte bM422d6 = C0028b.m422d(c0028b, inputStream);
        byte bM422d7 = C0028b.m422d(c0028b, inputStream);
        byte bM422d8 = C0028b.m422d(c0028b, inputStream);
        int[] iArr = {C0028b.m426g(c0028b, inputStream), C0028b.m426g(c0028b, inputStream), C0028b.m426g(c0028b, inputStream), C0028b.m426g(c0028b, inputStream), C0028b.m426g(c0028b, inputStream), C0028b.m426g(c0028b, inputStream), C0028b.m426g(c0028b, inputStream), C0028b.m426g(c0028b, inputStream)};
        byte[] bArr = {C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream)};
        byte bM422d9 = C0028b.m422d(c0028b, inputStream);
        float fM425f = C0028b.m425f(c0028b, inputStream);
        float[] fArr = {C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream)};
        float fM425f2 = C0028b.m425f(c0028b, inputStream);
        float[] fArr2 = {C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream)};
        int i3 = iArr[0] > 0 ? 1 : 0;
        if (iArr[1] > 0) {
            i3 |= 2;
        }
        if (iArr[2] > 0) {
            i3 |= 4;
        }
        if (iArr[3] > 0) {
            i3 |= 8;
        }
        if (iArr[4] > 0) {
            i3 |= 16;
        }
        if (iArr[5] > 0) {
            i3 |= 32;
        }
        if (iArr[6] > 0) {
            i3 |= 64;
        }
        if (iArr[7] > 0) {
            i3 |= 128;
        }
        if (bArr[5] != 3) {
            i3 |= VertexBuffer.TEXTURECOORDF_0;
        }
        if (bArr[6] != 3) {
            i3 |= VertexBuffer.TEXTURECOORDF_1;
        }
        VertexBuffer vertexBuffer = new VertexBuffer(c0028b.f689f, i3, iArr);
        this.f698d = vertexBuffer;
        vertexBuffer.f401i = c0004ac.f559c;
        vertexBuffer.f402j = c0004ac.f560d;
        if (bM422d == 1) {
            int i4 = c0004ac.f557a - c0028b.f687d;
            byte[] bArr2 = new byte[i4];
            inputStream.read(bArr2);
            c0016ao = new C0016ao(bArr2);
            i = i4 + i2;
        } else {
            i = i2;
            c0016ao = inputStream;
        }
        m413a(c0028b, vertexBuffer, 1, iArr[0], bArr[0], bM422d2, c0016ao);
        m413a(c0028b, vertexBuffer, 2, iArr[1], bArr[1], bM422d3, c0016ao);
        m413a(c0028b, vertexBuffer, 4, iArr[2], bArr[2], bM422d4, c0016ao);
        m413a(c0028b, vertexBuffer, 8, iArr[3], bArr[3], bM422d5, c0016ao);
        m413a(c0028b, vertexBuffer, 16, iArr[4], bArr[4], bM422d6, c0016ao);
        m413a(c0028b, vertexBuffer, 32, iArr[5], bArr[5], bM422d7, c0016ao);
        if (iArr[5] > 0) {
            vertexBuffer.setTexCoordScale(32, fM425f, fArr);
        }
        m413a(c0028b, vertexBuffer, 64, iArr[6], bArr[6], bM422d8, c0016ao);
        if (iArr[6] > 0) {
            vertexBuffer.setTexCoordScale(64, fM425f2, fArr2);
        }
        m413a(c0028b, vertexBuffer, 128, iArr[7], bArr[7], bM422d9, c0016ao);
        if (bM422d == 1) {
            c0028b.f687d = i;
        } else {
            c0028b.f687d += i;
        }
    }
}
