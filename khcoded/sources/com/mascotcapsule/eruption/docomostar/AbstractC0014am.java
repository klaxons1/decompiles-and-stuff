package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.am */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
abstract class AbstractC0014am {

    /* JADX INFO: renamed from: a */
    int f644a;

    /* JADX INFO: renamed from: b */
    int f645b;

    /* JADX INFO: renamed from: c */
    int f646c;

    /* JADX INFO: renamed from: d */
    int f647d;

    /* JADX INFO: renamed from: e */
    float[] f648e;

    /* JADX INFO: renamed from: f */
    short[] f649f;

    /* JADX INFO: renamed from: g */
    IndexBuffer[] f650g;

    AbstractC0014am() {
    }

    /* JADX INFO: renamed from: a */
    static final AbstractC0014am m399a(IndexBuffer[] indexBufferArr, VertexBuffer vertexBuffer) {
        return !(indexBufferArr[0].f345r == null) ? new C0041bm(indexBufferArr, vertexBuffer) : new C0021at(indexBufferArr, vertexBuffer);
    }

    /* JADX INFO: renamed from: a */
    abstract boolean mo400a(Vector3D vector3D);

    /* JADX INFO: renamed from: b */
    abstract void mo401b(IndexBuffer[] indexBufferArr, VertexBuffer vertexBuffer);
}
