package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dg */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0089dg extends AbstractC0056ca {

    /* JADX INFO: renamed from: a */
    float f862a;

    /* JADX INFO: renamed from: b */
    final IndexBuffer f863b;

    /* JADX INFO: renamed from: c */
    final VertexBuffer f864c;

    /* JADX INFO: renamed from: d */
    final int f865d;

    /* JADX INFO: renamed from: e */
    final int f866e;

    /* JADX INFO: renamed from: f */
    final int f867f;

    C0089dg(IndexBuffer indexBuffer, VertexBuffer vertexBuffer, int i, int i2, int i3, int i4) {
        this.f863b = indexBuffer;
        this.f864c = vertexBuffer;
        this.f865d = i;
        this.f866e = i2;
        this.f867f = i4;
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0056ca
    /* JADX INFO: renamed from: a */
    final boolean mo444a(AbstractC0056ca abstractC0056ca) {
        return this.f862a > ((C0089dg) abstractC0056ca).f862a;
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0056ca
    /* JADX INFO: renamed from: b */
    final boolean mo445b(AbstractC0056ca abstractC0056ca) {
        return this.f862a > ((C0089dg) abstractC0056ca).f862a;
    }
}
