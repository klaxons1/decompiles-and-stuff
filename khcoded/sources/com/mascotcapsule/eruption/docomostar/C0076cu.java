package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cu */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0076cu {

    /* JADX INFO: renamed from: a */
    float[] f824a = new float[4];

    /* JADX INFO: renamed from: b */
    byte f825b;

    C0076cu() {
        this.f824a[0] = 1.0f;
        this.f824a[1] = 1.0f;
        this.f824a[2] = 1.0f;
        this.f824a[3] = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    final void m477a(VertexBuffer vertexBuffer) {
        this.f824a[0] = vertexBuffer.f548u[0];
        this.f824a[1] = vertexBuffer.f548u[1];
        this.f824a[2] = vertexBuffer.f548u[2];
        this.f824a[3] = vertexBuffer.f548u[3];
        this.f825b = vertexBuffer.f526E;
    }
}
