package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.ByteBuffer;
import com.docomostar.ui.ogl.DirectBuffer;
import com.docomostar.ui.ogl.DirectBufferFactory;
import com.docomostar.ui.ogl.FloatBuffer;
import com.docomostar.ui.ogl.GraphicsOGL;
import com.docomostar.ui.ogl.ShortBuffer;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dv */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0104dv {

    /* JADX INFO: renamed from: a */
    int f920a;

    /* JADX INFO: renamed from: b */
    int f921b;

    /* JADX INFO: renamed from: c */
    int f922c;

    /* JADX INFO: renamed from: d */
    private boolean f923d;

    C0104dv(GraphicsOGL graphicsOGL, C0009ah c0009ah, int i, int i2) {
        this.f923d = false;
        ByteBuffer byteBufferAllocateByteBuffer = DirectBufferFactory.getFactory().allocateByteBuffer(i2);
        this.f920a = i;
        this.f921b = c0009ah.m368a(graphicsOGL, this, (DirectBuffer) byteBufferAllocateByteBuffer);
        this.f923d = true;
    }

    /* JADX INFO: renamed from: a */
    static final int m494a(IndexBuffer indexBuffer) {
        int iM298c = 0;
        int i = 0;
        while (true) {
            int i2 = iM298c;
            if (i >= indexBuffer.f340e) {
                return i2;
            }
            iM298c = Util3D.m298c(indexBuffer.f344q[i] << 1) + i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    static final int m495a(VertexBuffer vertexBuffer, BoneDeformer boneDeformer, int i) {
        int iM298c = 0;
        for (int i2 = 0; i2 <= 6; i2++) {
            if (vertexBuffer.f542g[i2] > 0 && vertexBuffer.f544q[i2] != null) {
                iM298c += Util3D.m298c(vertexBuffer.f543p[i2].m470c());
            }
        }
        if (boneDeformer == null) {
            return iM298c;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < boneDeformer.f141a) {
            C0124w c0124w = boneDeformer.f143c[i3];
            int i6 = c0124w.f1041c > i ? i : c0124w.f1041c;
            if (i6 <= i4) {
                i6 = i4;
            }
            i5 += boneDeformer.f142b[i3];
            i3++;
            i4 = i6;
        }
        int i7 = (i4 << 2) * i5;
        int i8 = iM298c + i7;
        vertexBuffer.f545r = (byte) i4;
        vertexBuffer.f546s = i7;
        return i8;
    }

    /* JADX INFO: renamed from: a */
    static final int m496a(C0069cn[] c0069cnArr) {
        int iM298c = 0;
        int i = 0;
        while (true) {
            int i2 = iM298c;
            if (i >= c0069cnArr.length) {
                return i2;
            }
            iM298c = Util3D.m298c((c0069cnArr[i].f807c != null ? 2 : 1) * c0069cnArr[i].f806b) + i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m497a(GraphicsOGL graphicsOGL, Graphics3D graphics3D, VertexBuffer vertexBuffer, BoneDeformer boneDeformer) {
        int i;
        vertexBuffer.f552y = new C0069cn[13];
        vertexBuffer.m334a(graphics3D, graphicsOGL);
        vertexBuffer.m338b();
        if (vertexBuffer.f549v != null) {
            vertexBuffer.f549v.m70a(vertexBuffer.f550w);
        }
        graphics3D.f309h.m388a(graphicsOGL, this);
        for (int i2 = 0; i2 <= 6; i2++) {
            if (vertexBuffer.f542g[i2] > 0 && vertexBuffer.f544q[i2] != null) {
                int iM470c = vertexBuffer.f543p[i2].m470c();
                vertexBuffer.f552y[i2] = new C0069cn(-1, iM470c);
                vertexBuffer.f552y[i2].f809e = this.f922c;
                C0009ah.m357a(graphicsOGL, this.f920a, vertexBuffer.f544q[i2], this.f922c);
                this.f922c = Util3D.m298c(iM470c) + this.f922c;
            }
        }
        if (boneDeformer != null) {
            FloatBuffer floatBufferAllocateFloatBuffer = DirectBufferFactory.getFactory().allocateFloatBuffer(vertexBuffer.f546s >> 2);
            int i3 = 0;
            int i4 = vertexBuffer.f545r;
            float[] fArr = new float[i4];
            for (int i5 = 0; i5 < boneDeformer.f141a; i5++) {
                C0124w c0124w = boneDeformer.f143c[i5];
                int i6 = c0124w.f1041c > i4 ? i4 : c0124w.f1041c;
                int i7 = 0;
                while (i7 < i6) {
                    fArr[i7] = c0124w.f1039a[i7];
                    i7++;
                }
                if (i6 == 0) {
                    fArr[0] = 1.0f;
                    i = 1;
                } else {
                    i = i7;
                }
                while (i < i4) {
                    fArr[i] = 0.0f;
                    i++;
                }
                for (int i8 = 0; i8 < boneDeformer.f142b[i5]; i8++) {
                    floatBufferAllocateFloatBuffer.put(i3, fArr, 0, i4);
                    i3 += i4;
                }
            }
            vertexBuffer.f552y[8] = new C0069cn(-1, vertexBuffer.f546s);
            vertexBuffer.f552y[8].f809e = this.f922c;
            C0009ah.m357a(graphicsOGL, this.f920a, (DirectBuffer) floatBufferAllocateFloatBuffer, this.f922c);
            this.f922c += Util3D.m298c(vertexBuffer.f546s);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m498a(GraphicsOGL graphicsOGL, C0009ah c0009ah, VertexBuffer vertexBuffer, int i) {
        c0009ah.m388a(graphicsOGL, this);
        C0009ah.m357a(graphicsOGL, this.f920a, vertexBuffer.f544q[i], vertexBuffer.f552y[i].f809e);
    }

    /* JADX INFO: renamed from: a */
    final void m499a(GraphicsOGL graphicsOGL, C0009ah c0009ah, C0069cn[] c0069cnArr) {
        c0009ah.m388a(graphicsOGL, this);
        for (int i = 0; i < c0069cnArr.length; i++) {
            C0009ah.m357a(graphicsOGL, this.f920a, c0069cnArr[i].f810f, c0069cnArr[i].f809e);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m500a(GraphicsOGL graphicsOGL, C0009ah c0009ah, C0069cn[] c0069cnArr, IndexBuffer indexBuffer) {
        c0009ah.m388a(graphicsOGL, this);
        for (int i = 0; i < indexBuffer.f340e; i++) {
            C0009ah.m357a(graphicsOGL, this.f920a, indexBuffer.f314A[i], c0069cnArr[i].f809e);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m501a(BufferPool bufferPool, GraphicsOGL graphicsOGL, C0009ah c0009ah, IndexBuffer indexBuffer) {
        int i = indexBuffer.f336a;
        if (bufferPool != null && bufferPool.getType() != 2) {
            throw new IllegalArgumentException();
        }
        c0009ah.m388a(graphicsOGL, this);
        indexBuffer.f318E = new C0069cn[indexBuffer.f340e];
        for (int i2 = 0; i2 < indexBuffer.f340e; i2++) {
            if (indexBuffer.f342g > 0 && i2 == indexBuffer.f340e - 1) {
                i = 4;
            }
            indexBuffer.f318E[i2] = new C0069cn(i, indexBuffer.f344q[i2]);
            indexBuffer.f318E[i2].f809e = this.f922c;
            if (indexBuffer.f315B != null) {
                indexBuffer.f315B.m70a(indexBuffer.f316C[i2]);
            }
            C0009ah.m357a(graphicsOGL, this.f920a, indexBuffer.f314A[i2], this.f922c);
            this.f922c += Util3D.m298c(indexBuffer.f344q[i2] << 1);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m502a(BufferPool bufferPool, GraphicsOGL graphicsOGL, C0009ah c0009ah, C0069cn[] c0069cnArr, boolean z) {
        ByteBuffer byteBufferAllocateShortBuffer;
        DirectBufferFactory factory = DirectBufferFactory.getFactory();
        C0122u c0122u = null;
        if (bufferPool != null) {
            if (this.f920a == 0 && bufferPool.getType() != 3) {
                throw new IllegalArgumentException();
            }
            if (this.f920a == 1 && bufferPool.getType() != 2) {
                throw new IllegalArgumentException();
            }
        }
        c0009ah.m388a(graphicsOGL, this);
        for (int i = 0; i < c0069cnArr.length; i++) {
            if (i <= 0 || c0069cnArr[i] != c0069cnArr[i - 1]) {
                if (this.f920a == 0) {
                    if (bufferPool != null) {
                        C0122u c0122uM69a = bufferPool.m69a(c0069cnArr[i], c0069cnArr[i].f808d.length, 0);
                        if (c0122uM69a == null) {
                            throw new OutOfMemoryError();
                        }
                        bufferPool.m70a(c0122uM69a);
                        byteBufferAllocateShortBuffer = bufferPool.f156a[0];
                        byteBufferAllocateShortBuffer.put(c0122uM69a.f1033a, c0069cnArr[i].f808d, 0, c0069cnArr[i].f808d.length);
                        c0122u = c0122uM69a;
                    } else {
                        byteBufferAllocateShortBuffer = factory.allocateByteBuffer(c0069cnArr[i].f808d);
                    }
                    c0069cnArr[i].f809e = this.f922c;
                    C0009ah.m357a(graphicsOGL, this.f920a, (DirectBuffer) byteBufferAllocateShortBuffer, this.f922c);
                    this.f922c += Util3D.m298c(c0069cnArr[i].f806b);
                } else {
                    if (bufferPool != null) {
                        C0122u c0122uM69a2 = bufferPool.m69a(c0069cnArr[i], c0069cnArr[i].f807c.length, 0);
                        if (c0122uM69a2 == null) {
                            throw new OutOfMemoryError();
                        }
                        bufferPool.m70a(c0122uM69a2);
                        byteBufferAllocateShortBuffer = bufferPool.f156a[0];
                        ((ShortBuffer) byteBufferAllocateShortBuffer).put(c0122uM69a2.f1033a, c0069cnArr[i].f807c, 0, c0069cnArr[i].f807c.length);
                        c0122u = c0122uM69a2;
                    } else {
                        byteBufferAllocateShortBuffer = factory.allocateShortBuffer(c0069cnArr[i].f807c);
                    }
                    c0069cnArr[i].f809e = this.f922c;
                    C0009ah.m357a(graphicsOGL, this.f920a, (DirectBuffer) byteBufferAllocateShortBuffer, this.f922c);
                    this.f922c += Util3D.m298c(c0069cnArr[i].f806b << 1);
                }
                if (z) {
                    c0069cnArr[i].f810f = byteBufferAllocateShortBuffer;
                    if (bufferPool != null) {
                        c0069cnArr[i].f811g = bufferPool;
                        c0069cnArr[i].f812h = c0122u;
                    }
                } else if (bufferPool != null) {
                    c0122u.f1037e = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m503a(Graphics3D graphics3D, GraphicsOGL graphicsOGL) {
        if (this.f923d) {
            C0009ah.m363c(graphicsOGL, this.f921b);
            this.f923d = false;
        }
    }
}
