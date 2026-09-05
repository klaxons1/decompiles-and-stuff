package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cm */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0068cm extends AbstractC0032bd {
    C0068cm() {
        this((byte) 0);
    }

    private C0068cm(byte b) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) throws IllegalStateException {
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        int iM421c = C0028b.m421c(c0028b, inputStream);
        int iM414a = C0028b.m414a(c0028b, inputStream);
        if (iM421c > 0) {
            VertexBuffer[] vertexBufferArr = new VertexBuffer[iM421c];
            float[] fArr = new float[iM421c];
            for (int i = 0; i < iM421c; i++) {
                int iM414a2 = C0028b.m414a(c0028b, inputStream);
                fArr[i] = C0028b.m425f(c0028b, inputStream);
                if (iM414a2 != -1) {
                    AbstractC0032bd abstractC0032bdM177a = Loader.m177a(c0028b, 1, iM414a2);
                    if (abstractC0032bdM177a == null) {
                        throw new IllegalStateException("No relevant VertexBuffer for MorphDeformer");
                    }
                    vertexBufferArr[i] = (VertexBuffer) abstractC0032bdM177a.f698d;
                    abstractC0032bdM177a.f697c = 1;
                }
            }
            MorphDeformer morphDeformer = new MorphDeformer(vertexBufferArr);
            morphDeformer.setWeight(fArr);
            if (iM414a != -1) {
                morphDeformer.setRefGid(iM414a);
            }
            morphDeformer.f401i = c0004ac.f559c;
            morphDeformer.f402j = c0004ac.f560d;
            this.f698d = morphDeformer;
        }
    }
}
