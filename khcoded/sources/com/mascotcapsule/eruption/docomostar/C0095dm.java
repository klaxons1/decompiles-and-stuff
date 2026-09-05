package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dm */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0095dm extends AbstractC0032bd {
    C0095dm() {
        this((byte) 0);
    }

    private C0095dm(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException {
        Figure figure;
        TransformTree transformTree;
        BoneDeformer boneDeformer;
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        int iM428i = C0028b.m428i(c0028b, inputStream);
        int[] iArr = new int[iM428i];
        for (int i = 0; i < iM428i; i++) {
            iArr[i] = C0028b.m414a(c0028b, inputStream);
        }
        int iM414a = C0028b.m414a(c0028b, inputStream);
        int iM414a2 = C0028b.m414a(c0028b, inputStream);
        int iM414a3 = C0028b.m414a(c0028b, inputStream);
        int iM414a4 = C0028b.m414a(c0028b, inputStream);
        int iM414a5 = C0028b.m414a(c0028b, inputStream);
        int iM414a6 = C0028b.m414a(c0028b, inputStream);
        C0028b.m414a(c0028b, inputStream);
        if (iM428i == 0 || iM414a == -1) {
            figure = new Figure();
        } else {
            C0027az c0027az = (C0027az) Loader.m177a(c0028b, 1, iM414a);
            if (c0027az == null) {
                throw new IllegalStateException("No relevant VertexBuffer for Figure");
            }
            VertexBuffer vertexBuffer = (VertexBuffer) c0027az.f698d;
            IndexBuffer[] indexBufferArr = new IndexBuffer[iM428i];
            C0110i[] c0110iArr = new C0110i[iM428i];
            for (int i2 = 0; i2 < iM428i; i2++) {
                if (iArr[i2] != -1) {
                    c0110iArr[i2] = (C0110i) Loader.m177a(c0028b, 2, iArr[i2]);
                    if (c0110iArr[i2] == null) {
                        throw new IllegalStateException("No relevant IndexBuffer for Figure");
                    }
                    indexBufferArr[i2] = (IndexBuffer) c0110iArr[i2].f698d;
                }
            }
            figure = new Figure(vertexBuffer, indexBufferArr);
            if (c0027az.f697c == 0) {
                c0027az.f697c = 1;
            }
            for (int i3 = 0; i3 < iM428i; i3++) {
                if (c0110iArr[i3].f697c == 0) {
                    c0110iArr[i3].f697c = 1;
                }
            }
        }
        this.f698d = figure;
        this.f698d.m221a(c0004ac.f559c);
        this.f698d.setUserId(c0004ac.f560d);
        if (iM414a3 != -1) {
            AbstractC0032bd abstractC0032bdM177a = Loader.m177a(c0028b, 10, iM414a3);
            if (abstractC0032bdM177a == null) {
                throw new IllegalStateException("No relevant NodeDeformer for Figure");
            }
            ((Figure) this.f698d).setNodeDeformer((NodeDeformer) abstractC0032bdM177a.f698d);
            abstractC0032bdM177a.f697c = 1;
        }
        if (iM414a2 != -1) {
            AbstractC0032bd abstractC0032bdM177a2 = Loader.m177a(c0028b, 7, iM414a2);
            if (abstractC0032bdM177a2 == null) {
                throw new IllegalStateException("No relevant TransformTree for Figure");
            }
            TransformTree transformTree2 = (TransformTree) abstractC0032bdM177a2.f698d;
            figure.setTransformTree(transformTree2);
            abstractC0032bdM177a2.f697c = 1;
            transformTree = transformTree2;
        } else {
            transformTree = null;
        }
        if (iM414a4 != -1) {
            AbstractC0032bd abstractC0032bdM177a3 = Loader.m177a(c0028b, 8, iM414a4);
            if (abstractC0032bdM177a3 == null) {
                throw new IllegalStateException("No relevant BoneDeformer for Figure");
            }
            BoneDeformer boneDeformer2 = (BoneDeformer) abstractC0032bdM177a3.f698d;
            figure.setBoneDeformer(boneDeformer2);
            abstractC0032bdM177a3.f697c = 1;
            boneDeformer = boneDeformer2;
        } else {
            boneDeformer = null;
        }
        if (iM414a5 != -1) {
            AbstractC0032bd abstractC0032bdM177a4 = Loader.m177a(c0028b, 9, iM414a5);
            if (abstractC0032bdM177a4 == null) {
                throw new IllegalStateException("No relevant MorphDeformer for Figure");
            }
            figure.setMorphDeformer((MorphDeformer) abstractC0032bdM177a4.f698d);
            abstractC0032bdM177a4.f697c = 1;
        }
        if (iM414a6 != -1) {
            AbstractC0032bd abstractC0032bdM177a5 = Loader.m177a(c0028b, 4, iM414a6);
            if (abstractC0032bdM177a5 != null) {
                figure.setCamera((Camera) abstractC0032bdM177a5.f698d);
            } else {
                figure.setCamera((Camera) c0028b.f686c.f804c[4][0].f698d);
            }
        }
        if (transformTree == null || boneDeformer == null) {
            return;
        }
        transformTree.m285b(true);
        boneDeformer.m58b(transformTree, -1);
    }
}
