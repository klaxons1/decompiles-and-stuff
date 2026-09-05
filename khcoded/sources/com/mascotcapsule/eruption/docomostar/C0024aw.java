package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.aw */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0024aw extends AbstractC0032bd {
    C0024aw() {
        this((byte) 0);
    }

    private C0024aw(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException {
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        int iM414a = C0028b.m414a(c0028b, inputStream);
        int iM426g = C0028b.m426g(c0028b, inputStream);
        int[] iArr = new int[iM426g];
        for (int i = 0; i < iM426g; i++) {
            iArr[i] = C0028b.m414a(c0028b, inputStream);
        }
        Vector3D vector3DM427h = C0028b.m427h(c0028b, inputStream);
        Vector3D vector3DM427h2 = C0028b.m427h(c0028b, inputStream);
        short sM421c = C0028b.m421c(c0028b, inputStream);
        short sM421c2 = C0028b.m421c(c0028b, inputStream);
        Vector3D vector3DM427h3 = C0028b.m427h(c0028b, inputStream);
        short sM421c3 = C0028b.m421c(c0028b, inputStream);
        Vector3D vector3DM427h4 = C0028b.m427h(c0028b, inputStream);
        Vector3D vector3DM427h5 = C0028b.m427h(c0028b, inputStream);
        Vector3D vector3DM427h6 = C0028b.m427h(c0028b, inputStream);
        float fM425f = C0028b.m425f(c0028b, inputStream);
        float fM425f2 = C0028b.m425f(c0028b, inputStream);
        int iM414a2 = C0028b.m414a(c0028b, inputStream);
        short sM421c4 = C0028b.m421c(c0028b, inputStream);
        int iM414a3 = C0028b.m414a(c0028b, inputStream);
        int[] iArr2 = new int[iM414a3];
        for (int i2 = 0; i2 < iM414a3; i2++) {
            iArr2[i2] = C0028b.m414a(c0028b, inputStream);
        }
        EffectSource effectSource = new EffectSource(iM414a2);
        this.f698d = effectSource;
        this.f698d.f401i = c0004ac.f559c;
        this.f698d.f402j = c0004ac.f560d;
        if (iM426g != 0) {
            C0027az c0027az = (C0027az) Loader.m177a(c0028b, 1, iM414a);
            if (c0027az == null) {
                throw new IllegalStateException("No relevant VertexBuffer for EffectSource");
            }
            VertexBuffer vertexBuffer = (VertexBuffer) c0027az.f698d;
            c0027az.f697c = 1;
            IndexBuffer[] indexBufferArr = new IndexBuffer[iM426g];
            C0110i[] c0110iArr = new C0110i[iM426g];
            for (int i3 = 0; i3 < iM426g; i3++) {
                if (iArr[i3] != -1) {
                    c0110iArr[i3] = (C0110i) Loader.m177a(c0028b, 2, iArr[i3]);
                    if (c0110iArr[i3] == null) {
                        throw new IllegalStateException("No relevant IndexBuffer for EffectSource");
                    }
                    indexBufferArr[i3] = (IndexBuffer) c0110iArr[i3].f698d;
                    c0110iArr[i3].f697c = 1;
                }
            }
            effectSource.setModel(vertexBuffer, indexBufferArr);
        } else if (iM414a != -1) {
            C0115n c0115n = (C0115n) Loader.m177a(c0028b, 3, iM414a);
            if (c0115n == null) {
                throw new IllegalStateException("No relevant Particle for EffectSource");
            }
            Particle particle = (Particle) c0115n.f698d;
            c0115n.f697c = 1;
            effectSource.setBaseModel(particle, null);
        }
        effectSource.setFlow(fM425f, fM425f2, sM421c4 == 1);
        effectSource.setLaunchVector(vector3DM427h4, vector3DM427h5, sM421c3 == 1);
        effectSource.setExtFactorAcceleration(vector3DM427h6);
        effectSource.setPosition(vector3DM427h);
        effectSource.setRotation(vector3DM427h2);
        effectSource.setShapeType(sM421c, sM421c2);
        effectSource.setShapeSize(vector3DM427h3);
        Object3D[] object3DArr = new Object3D[iM414a3];
        for (int i4 = 0; i4 < iM414a3; i4++) {
            if (iArr2[i4] != -1) {
                AbstractC0032bd abstractC0032bdM177a = Loader.m177a(c0028b, 3, iArr2[i4]);
                if (abstractC0032bdM177a != null) {
                    object3DArr[i4] = abstractC0032bdM177a.f698d;
                    abstractC0032bdM177a.f697c = 1;
                } else {
                    AbstractC0032bd abstractC0032bdM177a2 = Loader.m177a(c0028b, 4, iArr2[i4]);
                    if (abstractC0032bdM177a2 == null) {
                        throw new IllegalStateException("No relevant IndexBuffer for EffectSource");
                    }
                    object3DArr[i4] = abstractC0032bdM177a2.f698d;
                    abstractC0032bdM177a2.f697c = 1;
                }
            }
        }
        effectSource.setParticleSeeds(object3DArr);
    }
}
