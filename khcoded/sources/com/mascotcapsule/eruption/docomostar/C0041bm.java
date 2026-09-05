package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bm */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0041bm extends AbstractC0014am {
    C0041bm(IndexBuffer[] indexBufferArr, VertexBuffer vertexBuffer) {
        mo401b(indexBufferArr, vertexBuffer);
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0014am
    /* JADX INFO: renamed from: a */
    final boolean mo400a(Vector3D vector3D) {
        int i = this.f644a;
        if (this.f645b <= i) {
            int i2 = this.f646c + 1;
            this.f646c = i2;
            if (i2 >= this.f647d) {
                return false;
            }
            this.f649f = this.f650g[this.f646c].f345r;
            this.f645b = this.f650g[this.f646c].f341f;
            this.f644a = 0;
            i = this.f644a;
        }
        int i3 = this.f649f[i] + (this.f649f[i] << 1);
        vector3D.f516a = this.f648e[i3];
        vector3D.f517b = this.f648e[i3 + 1];
        vector3D.f518c = this.f648e[i3 + 2];
        this.f644a++;
        return true;
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0014am
    /* JADX INFO: renamed from: b */
    final void mo401b(IndexBuffer[] indexBufferArr, VertexBuffer vertexBuffer) {
        this.f650g = indexBufferArr;
        this.f648e = vertexBuffer.m339c(0).m471d();
        this.f649f = indexBufferArr[0].f345r;
        this.f645b = indexBufferArr[0].f341f;
        this.f644a = 0;
        this.f647d = indexBufferArr.length;
        this.f646c = 0;
    }
}
