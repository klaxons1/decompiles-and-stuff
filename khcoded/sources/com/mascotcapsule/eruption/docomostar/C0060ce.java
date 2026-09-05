package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ce */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0060ce {

    /* JADX INFO: renamed from: a */
    VertexBuffer f776a;

    /* JADX INFO: renamed from: b */
    IndexBuffer[] f777b;

    /* JADX INFO: renamed from: c */
    Particle f778c;

    /* JADX INFO: renamed from: d */
    int f779d = 0;

    /* JADX INFO: renamed from: e */
    boolean f780e;

    /* JADX INFO: renamed from: f */
    EffectSource[] f781f;

    /* JADX INFO: renamed from: g */
    VertexBuffer[] f782g;

    /* JADX INFO: renamed from: h */
    float[] f783h;

    /* JADX INFO: renamed from: i */
    byte[] f784i;

    /* JADX INFO: renamed from: j */
    float[] f785j;

    /* JADX INFO: renamed from: k */
    private Appearance[] f786k;

    C0060ce(EffectSource effectSource, Particle particle, int i) {
        this.f781f = null;
        if (particle.f417a == null || particle.f418b == null) {
            throw new IllegalArgumentException("particle has no model data");
        }
        this.f776a = new VertexBuffer((BufferPool) null, 145, i);
        int[] iArr = {i};
        this.f777b = new IndexBuffer[particle.f417a.length];
        this.f786k = new Appearance[particle.f417a.length];
        for (int i2 = 0; i2 < particle.f417a.length; i2++) {
            this.f777b[i2] = new IndexBuffer(null, 1);
            this.f777b[i2].set(7, 0, iArr);
            this.f786k[i2] = particle.f417a[i2].getAppearance();
            if (this.f786k[i2] != null) {
                this.f777b[i2].setAppearance(this.f786k[i2]);
            }
        }
        this.f776a.m327a();
        this.f778c = particle;
        this.f780e = particle.f416I;
        this.f783h = this.f776a.m337b(0).m471d();
        this.f784i = this.f776a.m337b(4).m473f();
        this.f785j = this.f776a.m337b(7).m471d();
        if (this.f780e) {
            this.f782g = null;
        } else {
            this.f782g = new VertexBuffer[i];
            for (int i3 = 0; i3 < i; i3++) {
                this.f782g[i3] = m450a(particle.f418b);
            }
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = i5 + 1;
            this.f783h[i5] = 0.0f;
            int i9 = i8 + 1;
            this.f783h[i8] = 0.0f;
            i5 = i9 + 1;
            this.f783h[i9] = 0.0f;
            int i10 = i6 + 1;
            this.f784i[i6] = -1;
            int i11 = i10 + 1;
            this.f784i[i10] = -1;
            int i12 = i11 + 1;
            this.f784i[i11] = -1;
            i6 = i12 + 1;
            this.f784i[i12] = -1;
            int i13 = i4 + 1;
            this.f785j[i4] = 0.0f;
            int i14 = i13 + 1;
            this.f785j[i13] = 0.0f;
            int i15 = i14 + 1;
            this.f785j[i14] = 0.0f;
            int i16 = i15 + 1;
            this.f785j[i15] = 0.0f;
            int i17 = i16 + 1;
            this.f785j[i16] = 0.0f;
            int i18 = i17 + 1;
            this.f785j[i17] = 0.0f;
            i4 = i18 + 1;
            this.f785j[i18] = 0.0f;
        }
        this.f776a.f539d[0] = true;
        this.f776a.f539d[4] = true;
        this.f776a.f539d[7] = true;
        if (particle.f400h == 22) {
            this.f781f = new EffectSource[i];
            for (int i19 = 0; i19 < i; i19++) {
                this.f781f[i19] = EffectSource.m83a((EffectSource) particle);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static VertexBuffer m450a(VertexBuffer vertexBuffer) {
        VertexBuffer vertexBuffer2 = new VertexBuffer((BufferPool) null, vertexBuffer.f536a, vertexBuffer.f538c);
        int i = 1;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((vertexBuffer.f536a & i) != 0 && vertexBuffer.f538c[i2] > 0) {
                if (vertexBuffer.f530I[i2].f641a == 0) {
                    vertexBuffer2.setVertices(i, 0, vertexBuffer.m337b(i2).m471d(), 0, vertexBuffer.f538c[i2]);
                } else if (vertexBuffer.f530I[i2].f641a == 3) {
                    vertexBuffer2.setVertices(i, 0, vertexBuffer.m337b(i2).m473f(), 0, vertexBuffer.f538c[i2]);
                } else if (vertexBuffer.f530I[i2].f641a == 2) {
                    vertexBuffer2.setVertices(i, 0, vertexBuffer.m337b(i2).m472e(), 0, vertexBuffer.f538c[i2]);
                }
            }
            i <<= 1;
        }
        float f = vertexBuffer.f547t[0][0];
        float[] fArr = {vertexBuffer.f547t[0][1], vertexBuffer.f547t[0][2], vertexBuffer.f547t[0][3]};
        vertexBuffer2.setTexCoordScale(32, f, fArr);
        float f2 = vertexBuffer.f547t[1][0];
        fArr[0] = vertexBuffer.f547t[1][1];
        fArr[1] = vertexBuffer.f547t[1][2];
        fArr[2] = vertexBuffer.f547t[1][3];
        vertexBuffer2.setTexCoordScale(64, f2, fArr);
        return vertexBuffer2;
    }
}
