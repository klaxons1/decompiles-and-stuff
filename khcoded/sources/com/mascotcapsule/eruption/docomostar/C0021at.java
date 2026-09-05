package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.at */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0021at extends AbstractC0014am {
    C0021at(IndexBuffer[] indexBufferArr, VertexBuffer vertexBuffer) {
        mo401b(indexBufferArr, vertexBuffer);
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0014am
    /* JADX INFO: renamed from: a */
    final boolean mo400a(Vector3D vector3D) {
        if (this.f645b <= this.f644a) {
            int i = this.f646c + 1;
            this.f646c = i;
            if (i >= this.f647d) {
                return false;
            }
            this.f645b = this.f650g[this.f646c].f338c * 3;
            this.f644a = this.f650g[this.f646c].f339d * 3;
        }
        float[] fArr = this.f648e;
        int i2 = this.f644a;
        this.f644a = i2 + 1;
        vector3D.f516a = fArr[i2];
        float[] fArr2 = this.f648e;
        int i3 = this.f644a;
        this.f644a = i3 + 1;
        vector3D.f517b = fArr2[i3];
        float[] fArr3 = this.f648e;
        int i4 = this.f644a;
        this.f644a = i4 + 1;
        vector3D.f518c = fArr3[i4];
        return true;
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0014am
    /* JADX INFO: renamed from: b */
    final void mo401b(IndexBuffer[] indexBufferArr, VertexBuffer vertexBuffer) {
        this.f650g = indexBufferArr;
        this.f648e = vertexBuffer.m339c(0).m471d();
        this.f649f = null;
        this.f645b = indexBufferArr[0].f338c * 3;
        this.f644a = indexBufferArr[0].f339d * 3;
        this.f647d = indexBufferArr.length;
        this.f646c = 0;
    }
}
