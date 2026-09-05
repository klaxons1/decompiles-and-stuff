package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.n */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0115n extends AbstractC0032bd {
    C0115n() {
        this((byte) 0);
    }

    private C0115n(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException {
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        Particle particle = new Particle();
        this.f698d = particle;
        this.f698d.f401i = c0004ac.f559c;
        this.f698d.f402j = c0004ac.f560d;
        int iM426g = C0028b.m426g(c0028b, inputStream);
        int[] iArr = new int[iM426g];
        for (int i = 0; i < iM426g; i++) {
            iArr[i] = C0028b.m414a(c0028b, inputStream);
        }
        C0027az c0027az = (C0027az) Loader.m177a(c0028b, 1, C0028b.m414a(c0028b, inputStream));
        if (c0027az == null) {
            throw new IllegalStateException("No relevant VertexBuffer for Particle");
        }
        VertexBuffer vertexBuffer = (VertexBuffer) c0027az.f698d;
        c0027az.f697c = 1;
        IndexBuffer[] indexBufferArr = new IndexBuffer[iM426g];
        C0110i[] c0110iArr = new C0110i[iM426g];
        for (int i2 = 0; i2 < iM426g; i2++) {
            if (iArr[i2] != -1) {
                c0110iArr[i2] = (C0110i) Loader.m177a(c0028b, 2, iArr[i2]);
                if (c0110iArr[i2] == null) {
                    throw new IllegalStateException("No relevant IndexBuffer for Particle");
                }
                indexBufferArr[i2] = (IndexBuffer) c0110iArr[i2].f698d;
                c0110iArr[i2].f697c = 1;
            }
        }
        particle.setModel(vertexBuffer, indexBufferArr);
        particle.setLifeDuration(C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream));
        particle.setMoveSpeed(C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream));
        particle.setMoveSpeedRange(C0028b.m425f(c0028b, inputStream), C0028b.m425f(c0028b, inputStream));
        particle.setRotationIniVal(C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream));
        particle.setRotationVelocity(C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream));
        particle.setRotationRange(C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream));
        particle.setScaleIniVal(C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream));
        particle.setScaleVelocity(C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream));
        particle.setScaleRange(C0028b.m427h(c0028b, inputStream), C0028b.m427h(c0028b, inputStream));
        particle.setColorIniVal(C0028b.m414a(c0028b, inputStream), C0028b.m414a(c0028b, inputStream));
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        float[] fArr3 = new float[4];
        float[] fArr4 = new float[4];
        for (int i3 = 0; i3 < 4; i3++) {
            fArr[i3] = C0028b.m425f(c0028b, inputStream);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            fArr2[i4] = C0028b.m425f(c0028b, inputStream);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            fArr3[i5] = C0028b.m425f(c0028b, inputStream);
        }
        for (int i6 = 0; i6 < 4; i6++) {
            fArr4[i6] = C0028b.m425f(c0028b, inputStream);
        }
        particle.setColorVelocity(fArr, fArr2, fArr3, fArr4);
        particle.setColorRange(C0028b.m414a(c0028b, inputStream), C0028b.m414a(c0028b, inputStream));
        float[] fArr5 = new float[2];
        float[] fArr6 = new float[2];
        for (int i7 = 0; i7 < 2; i7++) {
            fArr5[i7] = C0028b.m425f(c0028b, inputStream);
        }
        for (int i8 = 0; i8 < 2; i8++) {
            fArr6[i8] = C0028b.m425f(c0028b, inputStream);
        }
        particle.setTextureSTVelocity(fArr5, fArr6);
        for (int i9 = 0; i9 < 2; i9++) {
            fArr5[i9] = C0028b.m425f(c0028b, inputStream);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            fArr6[i10] = C0028b.m425f(c0028b, inputStream);
        }
        particle.setTextureSTRange(fArr5, fArr6);
    }
}
