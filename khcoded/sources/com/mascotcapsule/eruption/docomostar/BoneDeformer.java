package com.mascotcapsule.eruption.docomostar;

import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class BoneDeformer extends Object3D {

    /* JADX INFO: renamed from: p */
    private static float[][] f139p = new float[4][];

    /* JADX INFO: renamed from: q */
    private static short[][] f140q = new short[4][];

    /* JADX INFO: renamed from: a */
    short f141a;

    /* JADX INFO: renamed from: b */
    short[] f142b;

    /* JADX INFO: renamed from: c */
    C0124w[] f143c;

    /* JADX INFO: renamed from: d */
    C0015an f144d;

    /* JADX INFO: renamed from: e */
    C0007af f145e;

    /* JADX INFO: renamed from: f */
    TransformTree f146f;

    /* JADX INFO: renamed from: g */
    boolean f147g;

    /* JADX INFO: renamed from: r */
    private C0015an f148r;

    /* JADX INFO: renamed from: s */
    private Vector f149s;

    /* JADX INFO: renamed from: t */
    private C0007af[] f150t;

    /* JADX INFO: renamed from: u */
    private short[] f151u;

    /* JADX INFO: renamed from: v */
    private byte f152v;

    /* JADX INFO: renamed from: w */
    private byte f153w;

    /* JADX INFO: renamed from: x */
    private byte f154x;

    /* JADX INFO: renamed from: y */
    private boolean f155y;

    public BoneDeformer(int i, int i2) {
        this(i, i2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoneDeformer(int i, int i2, short[] sArr) {
        super(6);
        if (i <= 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        if (i2 <= 0 || i2 > 32767) {
            throw new IllegalArgumentException();
        }
        m41a(i, i2);
        if (sArr != null) {
            if (sArr[0] == -1) {
                this.f155y = true;
                return;
            }
            this.f151u = new short[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f151u[i3] = sArr[i3];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41a(int i, int i2) {
        this.f141a = (short) i;
        this.f142b = new short[i];
        this.f143c = new C0124w[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f142b[i3] = 1;
            this.f143c[i3] = new C0124w();
        }
        this.f148r = new C0015an(i2);
        this.f145e = new C0007af(i2);
        this.f149s = new Vector(1, 1);
        this.f149s.addElement(this.f145e);
        m42h();
        this.f145e = this.f150t[0];
    }

    /* JADX INFO: renamed from: h */
    private void m42h() {
        int size = this.f149s.size();
        this.f150t = new C0007af[size];
        for (int i = 0; i < size; i++) {
            this.f150t[i] = (C0007af) this.f149s.elementAt(i);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m43a() {
        this.f144d = new C0015an(this.f148r.f651a.length);
    }

    /* JADX INFO: renamed from: a */
    final void m44a(IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0007af c0007af) {
        if (indexBuffer.f319F == c0007af.f568f) {
            return;
        }
        m49a(vertexBuffer.m339c(0).m471d(), indexBuffer, vertexBuffer, c0007af);
        vertexBuffer.f540e[0] = true;
        vertexBuffer.m340c();
        indexBuffer.f319F = c0007af.f568f;
    }

    /* JADX INFO: renamed from: a */
    final void m45a(MorphDeformer morphDeformer, IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0007af c0007af, C0059cd c0059cd) {
        if (indexBuffer.f319F == c0007af.f568f && indexBuffer.f322I == c0059cd.f774c) {
            return;
        }
        m51a(vertexBuffer.m339c(0).m471d(), morphDeformer, indexBuffer, vertexBuffer, c0007af, c0059cd);
        vertexBuffer.f540e[0] = true;
        vertexBuffer.m340c();
        indexBuffer.f319F = c0007af.f568f;
        indexBuffer.f322I = c0059cd.f774c;
    }

    /* JADX INFO: renamed from: a */
    final void m46a(TransformTree transformTree, int i) {
        if (transformTree == null || this.f152v != transformTree.f504f) {
            int size = this.f149s.size();
            if (i >= size) {
                int length = this.f145e.f563a.f651a.length;
                while (size <= i) {
                    this.f149s.addElement(new C0007af(length));
                    size++;
                }
                m42h();
            }
            this.f145e = this.f150t[i];
        }
    }

    /* JADX INFO: renamed from: a */
    final void m47a(TransformTree transformTree, boolean z) {
        int i = 0;
        Transform[] transformArr = this.f148r.f651a;
        Transform[] transformArr2 = this.f145e.f563a.f651a;
        short[] sArr = this.f151u;
        int length = this.f145e.f563a.f651a.length;
        if (this.f152v != transformTree.f504f || z) {
            if (sArr != null) {
                while (i < length) {
                    transformArr2[i].m261a(transformTree.m284b(sArr[i]), transformArr[i]);
                    i++;
                }
            } else {
                while (i < length) {
                    transformArr2[i].m261a(transformTree.m284b(i), transformArr[i]);
                    i++;
                }
            }
            Transform.m251e(this.f145e.f565c, transformTree.f503e);
            m60c();
            this.f152v = transformTree.f504f;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m48a(C0007af c0007af, Transform transform) {
        Transform[] transformArr = c0007af.f563a.f651a;
        Transform[] transformArr2 = this.f144d.f651a;
        int length = transformArr.length;
        for (int i = 0; i < length; i++) {
            transformArr2[i].m261a(transform, transformArr[i]);
        }
        c0007af.f567e.m261a(transform, c0007af.f565c);
    }

    /* JADX INFO: renamed from: a */
    final void m49a(float[] fArr, IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0007af c0007af) {
        float f;
        float f2;
        float f3;
        Transform[] transformArr = c0007af.f563a.f651a;
        short[] sArr = indexBuffer.f347t;
        short[] sArr2 = this.f142b;
        C0124w[] c0124wArr = this.f143c;
        float[] fArr2 = c0007af.f565c.f494b.m;
        float[] fArrM471d = vertexBuffer.m337b(0).m471d();
        int i = indexBuffer.f343p << 1;
        for (int i2 = 0; i2 < i; i2 += 2) {
            short s = sArr[i2];
            C0124w c0124w = c0124wArr[s];
            short s2 = c0124w.f1041c;
            int i3 = (s << 1) + s;
            int i4 = i3 + 1;
            float f4 = fArrM471d[i3];
            float f5 = fArrM471d[i4];
            float f6 = fArrM471d[i4 + 1];
            if (s2 == 0) {
                f = (fArr2[0] * f4) + (fArr2[4] * f5) + (fArr2[8] * f6) + fArr2[12];
                f2 = fArr2[13] + (fArr2[1] * f4) + (fArr2[5] * f5) + (fArr2[9] * f6);
                f3 = (fArr2[2] * f4) + (fArr2[6] * f5) + (fArr2[10] * f6) + fArr2[14];
            } else if (s2 == 1) {
                float[] fArr3 = transformArr[c0124w.f1040b[0]].f494b.m;
                f = fArr3[12] + (fArr3[0] * f4) + (fArr3[4] * f5) + (fArr3[8] * f6);
                f2 = (fArr3[1] * f4) + (fArr3[5] * f5) + (fArr3[9] * f6) + fArr3[13];
                f3 = fArr3[14] + (fArr3[2] * f4) + (fArr3[6] * f5) + (fArr3[10] * f6);
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                float[] fArr4 = c0124w.f1039a;
                for (int i5 = 0; i5 < s2; i5++) {
                    float f7 = fArr4[i5];
                    float[] fArr5 = transformArr[c0124w.f1040b[i5]].f494b.m;
                    f += ((fArr5[0] * f4) + (fArr5[4] * f5) + (fArr5[8] * f6) + fArr5[12]) * f7;
                    f2 += ((fArr5[1] * f4) + (fArr5[5] * f5) + (fArr5[9] * f6) + fArr5[13]) * f7;
                    f3 += f7 * (fArr5[14] + (fArr5[2] * f4) + (fArr5[6] * f5) + (fArr5[10] * f6));
                }
            }
            short s3 = sArr2[s];
            short s4 = sArr[i2 + 1];
            int i6 = (s4 << 1) + s4;
            for (int i7 = 0; i7 < s3; i7++) {
                int i8 = i6 + 1;
                fArr[i6] = f;
                int i9 = i8 + 1;
                fArr[i8] = f2;
                i6 = i9 + 1;
                fArr[i9] = f3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m50a(float[] fArr, IndexBuffer indexBuffer, C0007af c0007af, short[] sArr) {
        int i;
        int i2;
        int i3;
        C0058cc[] c0058ccArr = c0007af.f564b.f742a;
        short[] sArr2 = indexBuffer.f347t;
        short[] sArr3 = this.f142b;
        C0124w[] c0124wArr = this.f143c;
        int[] iArr = c0007af.f566d.f771a;
        int i4 = indexBuffer.f343p << 1;
        for (int i5 = 0; i5 < i4; i5 += 2) {
            short s = sArr2[i5];
            C0124w c0124w = c0124wArr[s];
            short s2 = c0124w.f1041c;
            int i6 = (s << 1) + s;
            int i7 = i6 + 1;
            short s3 = sArr[i6];
            short s4 = sArr[i7];
            short s5 = sArr[i7 + 1];
            if (s2 == 0) {
                i = (((iArr[0] * s3) + (iArr[3] * s4)) + (iArr[6] * s5)) >> 12;
                i2 = (((iArr[1] * s3) + (iArr[4] * s4)) + (iArr[7] * s5)) >> 12;
                i3 = (((iArr[2] * s3) + (iArr[5] * s4)) + (iArr[8] * s5)) >> 12;
            } else if (s2 == 1) {
                int[] iArr2 = c0058ccArr[c0124w.f1040b[0]].f771a;
                i = (((iArr2[0] * s3) + (iArr2[3] * s4)) + (iArr2[6] * s5)) >> 12;
                i2 = (((iArr2[1] * s3) + (iArr2[4] * s4)) + (iArr2[7] * s5)) >> 12;
                i3 = ((iArr2[8] * s5) + ((iArr2[2] * s3) + (iArr2[5] * s4))) >> 12;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                float[] fArr2 = c0124w.f1039a;
                for (int i8 = 0; i8 < s2; i8++) {
                    int i9 = (int) (4096.0f * fArr2[i8]);
                    int[] iArr3 = c0058ccArr[c0124w.f1040b[i8]].f771a;
                    i += (((((iArr3[0] * s3) + (iArr3[3] * s4)) + (iArr3[6] * s5)) >> 12) * i9) >> 12;
                    i2 += (((((iArr3[1] * s3) + (iArr3[4] * s4)) + (iArr3[7] * s5)) >> 12) * i9) >> 12;
                    i3 += (i9 * (((iArr3[8] * s5) + ((iArr3[2] * s3) + (iArr3[5] * s4))) >> 12)) >> 12;
                }
            }
            short s6 = sArr3[s];
            short s7 = sArr2[i5 + 1];
            float f = i * 3.051851E-5f;
            float f2 = 3.051851E-5f * i2;
            float f3 = i3 * 3.051851E-5f;
            int i10 = s7 + (s7 << 1);
            for (int i11 = 0; i11 < s6; i11++) {
                int i12 = i10 + 1;
                fArr[i10] = f;
                int i13 = i12 + 1;
                fArr[i12] = f2;
                i10 = i13 + 1;
                fArr[i13] = f3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m51a(float[] fArr, MorphDeformer morphDeformer, IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0007af c0007af, C0059cd c0059cd) {
        int length;
        short[] sArr;
        boolean z;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Transform[] transformArr = c0007af.f563a.f651a;
        short[] sArr2 = indexBuffer.f347t;
        short[] sArr3 = this.f142b;
        C0124w[] c0124wArr = this.f143c;
        float[] fArr2 = c0007af.f565c.f494b.m;
        float[] fArrM471d = vertexBuffer.m337b(0).m471d();
        int i2 = indexBuffer.f343p << 1;
        float[] fArr3 = c0059cd.f772a;
        int i3 = morphDeformer.f378c;
        C0006ae c0006ae = null;
        boolean z2 = false;
        for (int i4 = 0; i4 < morphDeformer.f383p; i4++) {
            c0006ae = morphDeformer.f382g[i4];
            if (c0006ae.f561a == indexBuffer) {
                if (c0006ae.f562b[0] == null) {
                    break;
                }
                z2 = true;
                break;
            }
        }
        if (z2) {
            sArr = c0006ae.f562b[0];
            length = sArr.length;
            for (int i5 = 0; i5 < i3; i5++) {
                f139p[i5] = morphDeformer.f379d[i5].m337b(0).m471d();
            }
        } else {
            length = 0;
            sArr = null;
        }
        boolean z3 = z2;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7 += 2) {
            short s = sArr2[i7];
            C0124w c0124w = c0124wArr[s];
            short s2 = c0124w.f1041c;
            int i8 = (s << 1) + s;
            float f7 = fArrM471d[i8];
            float f8 = fArrM471d[i8 + 1];
            float f9 = fArrM471d[i8 + 2];
            if (z3 && sArr[i6] == s) {
                float f10 = f9;
                f2 = f8;
                f3 = f7;
                for (int i9 = 0; i9 < i3; i9++) {
                    float[] fArr4 = f139p[i9];
                    f3 += fArr3[i9] * (fArr4[i8] - f7);
                    f2 += fArr3[i9] * (fArr4[i8 + 1] - f8);
                    f10 += (fArr4[i8 + 2] - f9) * fArr3[i9];
                }
                int i10 = i6 + 1;
                if (i10 >= length) {
                    z3 = false;
                }
                z = z3;
                i = i10;
                f = f10;
            } else {
                z = z3;
                i = i6;
                f = f9;
                f2 = f8;
                f3 = f7;
            }
            if (s2 == 0) {
                f4 = (fArr2[0] * f3) + (fArr2[4] * f2) + (fArr2[8] * f) + fArr2[12];
                f5 = fArr2[13] + (fArr2[1] * f3) + (fArr2[5] * f2) + (fArr2[9] * f);
                f6 = (fArr2[2] * f3) + (fArr2[6] * f2) + (fArr2[10] * f) + fArr2[14];
            } else if (s2 == 1) {
                float[] fArr5 = transformArr[c0124w.f1040b[0]].f494b.m;
                f4 = fArr5[12] + (fArr5[0] * f3) + (fArr5[4] * f2) + (fArr5[8] * f);
                f5 = (fArr5[1] * f3) + (fArr5[5] * f2) + (fArr5[9] * f) + fArr5[13];
                f6 = fArr5[14] + (fArr5[2] * f3) + (f2 * fArr5[6]) + (f * fArr5[10]);
            } else {
                f4 = 0.0f;
                f5 = 0.0f;
                f6 = 0.0f;
                float[] fArr6 = c0124w.f1039a;
                for (int i11 = 0; i11 < s2; i11++) {
                    float f11 = fArr6[i11];
                    float[] fArr7 = transformArr[c0124w.f1040b[i11]].f494b.m;
                    f4 += ((fArr7[0] * f3) + (fArr7[4] * f2) + (fArr7[8] * f) + fArr7[12]) * f11;
                    f5 += ((fArr7[1] * f3) + (fArr7[5] * f2) + (fArr7[9] * f) + fArr7[13]) * f11;
                    f6 += f11 * (fArr7[14] + (fArr7[2] * f3) + (fArr7[6] * f2) + (fArr7[10] * f));
                }
            }
            short s3 = sArr3[s];
            short s4 = sArr2[i7 + 1];
            int i12 = s4 + (s4 << 1);
            for (int i13 = 0; i13 < s3; i13++) {
                int i14 = i12 + 1;
                fArr[i12] = f4;
                int i15 = i14 + 1;
                fArr[i14] = f5;
                i12 = i15 + 1;
                fArr[i15] = f6;
            }
            z3 = z;
            i6 = i;
        }
        for (int i16 = 0; i16 < 4; i16++) {
            f139p[i16] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m52a(float[] fArr, MorphDeformer morphDeformer, IndexBuffer indexBuffer, C0059cd c0059cd, short[] sArr, int i) {
        int length;
        short[] sArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C0058cc[] c0058ccArr = this.f145e.f564b.f742a;
        int[] iArr = this.f145e.f566d.f771a;
        short[] sArr3 = indexBuffer.f347t;
        short[] sArr4 = this.f142b;
        C0124w[] c0124wArr = this.f143c;
        int i8 = indexBuffer.f343p << 1;
        int[] iArr2 = c0059cd.f773b;
        int i9 = morphDeformer.f378c;
        C0006ae c0006ae = null;
        int i10 = 0;
        boolean z = false;
        for (int i11 = 0; i11 < morphDeformer.f383p; i11++) {
            c0006ae = morphDeformer.f382g[i11];
            if (c0006ae.f561a == indexBuffer) {
                if (c0006ae.f562b[i] == null) {
                    break;
                }
                z = true;
                break;
            }
        }
        if (z) {
            sArr2 = c0006ae.f562b[i];
            length = sArr2.length;
            for (int i12 = 0; i12 < i9; i12++) {
                f140q[i12] = morphDeformer.f379d[i12].m337b(i).m472e();
            }
        } else {
            length = 0;
            sArr2 = null;
        }
        int i13 = 0;
        while (true) {
            boolean z2 = z;
            int i14 = i10;
            int i15 = i13;
            if (i15 >= i8) {
                break;
            }
            short s = sArr3[i15];
            C0124w c0124w = c0124wArr[s];
            short s2 = c0124w.f1041c;
            int i16 = (s << 1) + s;
            int i17 = i16 + 1;
            short s3 = sArr[i16];
            int i18 = i17 + 1;
            short s4 = sArr[i17];
            short s5 = sArr[i18];
            if (z2 && sArr2[i14] == s) {
                int i19 = 0;
                int i20 = s5;
                i2 = s4;
                i3 = s3;
                while (i19 < i9) {
                    short[] sArr5 = f140q[i19];
                    i3 = (i3 == true ? 1 : 0) + ((iArr2[i19] * (sArr5[i18] - s3)) >> 12);
                    i2 = (i2 == true ? 1 : 0) + ((iArr2[i19] * (sArr5[i18 + 1] - s4)) >> 12);
                    int i21 = iArr2[i19];
                    i19++;
                    i20 += ((sArr5[i18 + 2] - s5) * i21) >> 12;
                }
                int i22 = i14 + 1;
                if (i22 >= length) {
                    z2 = false;
                }
                z = z2;
                i10 = i22;
                i4 = i20;
            } else {
                z = z2;
                i10 = i14;
                i2 = s4;
                i3 = s3;
                i4 = s5;
            }
            if (s2 == 0) {
                i5 = (((iArr[0] * i3) + (iArr[3] * i2)) + (iArr[6] * i4)) >> 12;
                i6 = (((iArr[1] * i3) + (iArr[4] * i2)) + (iArr[7] * i4)) >> 12;
                i7 = (((iArr[2] * i3) + (i2 * iArr[5])) + (i4 * iArr[8])) >> 12;
            } else if (s2 == 1) {
                int[] iArr3 = c0058ccArr[c0124w.f1040b[0]].f771a;
                i5 = (((iArr3[0] * i3) + (iArr3[3] * i2)) + (iArr3[6] * i4)) >> 12;
                i6 = (((iArr3[1] * i3) + (iArr3[4] * i2)) + (iArr3[7] * i4)) >> 12;
                i7 = ((iArr3[8] * i4) + ((i2 * iArr3[5]) + (iArr3[2] * i3))) >> 12;
            } else {
                i5 = 0;
                i6 = 0;
                i7 = 0;
                float[] fArr2 = c0124w.f1039a;
                for (int i23 = 0; i23 < s2; i23++) {
                    int i24 = (int) (4096.0f * fArr2[i23]);
                    int[] iArr4 = c0058ccArr[c0124w.f1040b[i23]].f771a;
                    i5 += (((((iArr4[0] * i3) + (iArr4[3] * i2)) + (iArr4[6] * i4)) >> 12) * i24) >> 12;
                    i6 += (((((iArr4[1] * i3) + (iArr4[4] * i2)) + (iArr4[7] * i4)) >> 12) * i24) >> 12;
                    i7 += (i24 * (((iArr4[8] * i4) + ((iArr4[2] * i3) + (iArr4[5] * i2))) >> 12)) >> 12;
                }
            }
            short s6 = sArr4[s];
            short s7 = sArr3[i15 + 1];
            float f = i5 * 3.051851E-5f;
            float f2 = 3.051851E-5f * i6;
            float f3 = i7 * 3.051851E-5f;
            int i25 = s7 + (s7 << 1);
            for (int i26 = 0; i26 < s6; i26++) {
                int i27 = i25 + 1;
                fArr[i25] = f;
                int i28 = i27 + 1;
                fArr[i27] = f2;
                i25 = i28 + 1;
                fArr[i28] = f3;
            }
            i13 = i15 + 2;
        }
        for (int i29 = 0; i29 < i9; i29++) {
            f140q[i29] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m53a(TransformTree transformTree) {
        int length = this.f148r.f651a.length;
        if (this.f151u != null) {
            for (int i = 0; i < length; i++) {
                if (this.f151u[i] >= transformTree.f501c) {
                    return false;
                }
            }
        } else if (this.f155y) {
            if (length > transformTree.f501c) {
                return false;
            }
        } else if (length != transformTree.f501c) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    final boolean m54a(VertexBuffer vertexBuffer) {
        short s = this.f141a;
        if (s > vertexBuffer.getVerticesNum(1)) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < s; i2++) {
            i += this.f142b[i2];
        }
        return i <= vertexBuffer.getMaxVerticesNum();
    }

    /* JADX INFO: renamed from: b */
    final void m55b() {
        for (int i = 0; i < this.f141a; i++) {
            C0124w c0124w = this.f143c[i];
            short s = c0124w.f1041c;
            float f = 0.0f;
            int i2 = 0;
            while (i2 < s) {
                float f2 = c0124w.f1039a[i2] + f;
                i2++;
                f = f2;
            }
            for (int i3 = 0; i3 < s; i3++) {
                c0124w.f1039a[i3] = c0124w.f1039a[i3] / f;
            }
            for (int i4 = 1; i4 < s; i4++) {
                for (int i5 = 0; i5 < s - i4; i5++) {
                    if (c0124w.f1039a[i5] < c0124w.f1039a[i5 + 1]) {
                        float f3 = c0124w.f1039a[i5 + 1];
                        c0124w.f1039a[i5 + 1] = c0124w.f1039a[i5];
                        c0124w.f1039a[i5] = f3;
                        short s2 = c0124w.f1040b[i5 + 1];
                        c0124w.f1040b[i5 + 1] = c0124w.f1040b[i5];
                        c0124w.f1040b[i5] = s2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final void m56b(IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0007af c0007af) {
        if (indexBuffer.f320G == c0007af.f568f) {
            return;
        }
        for (int i = 1; i <= 3; i++) {
            C0065cj c0065cjM337b = vertexBuffer.m337b(i);
            short[] sArrM472e = c0065cjM337b != null ? c0065cjM337b.m472e() : null;
            if (sArrM472e != null) {
                m50a(vertexBuffer.m339c(i).m471d(), indexBuffer, c0007af, sArrM472e);
                vertexBuffer.f540e[i] = true;
            }
        }
        indexBuffer.f320G = c0007af.f568f;
    }

    /* JADX INFO: renamed from: b */
    final void m57b(MorphDeformer morphDeformer, IndexBuffer indexBuffer, VertexBuffer vertexBuffer, C0007af c0007af, C0059cd c0059cd) {
        if (indexBuffer.f320G == c0007af.f568f && indexBuffer.f323J == c0059cd.f774c) {
            return;
        }
        for (int i = 1; i <= 3; i++) {
            C0065cj c0065cjM337b = vertexBuffer.m337b(i);
            short[] sArrM472e = c0065cjM337b != null ? c0065cjM337b.m472e() : null;
            if (sArrM472e != null) {
                m52a(vertexBuffer.m339c(i).m471d(), morphDeformer, indexBuffer, c0059cd, sArrM472e, i);
                vertexBuffer.f540e[i] = true;
            }
        }
        indexBuffer.f320G = c0007af.f568f;
        indexBuffer.f323J = c0059cd.f774c;
    }

    /* JADX INFO: renamed from: b */
    final void m58b(TransformTree transformTree, int i) {
        int i2 = 0;
        Transform[] transformArr = this.f148r.f651a;
        int length = this.f148r.f651a.length;
        short[] sArr = this.f151u;
        Transform transformM286c = i >= 0 ? transformTree.m286c(i) : null;
        if (sArr != null) {
            while (i2 < length) {
                transformArr[i2].m266b(transformTree.m286c(sArr[i2]));
                if (transformM286c != null) {
                    transformArr[i2].multiply(transformArr[i2], transformM286c);
                }
                i2++;
            }
            return;
        }
        while (i2 < length) {
            transformArr[i2].m266b(transformTree.m286c(i2));
            if (transformM286c != null) {
                transformArr[i2].multiply(transformArr[i2], transformM286c);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m59b(VertexBuffer vertexBuffer) {
        float f;
        float f2;
        float f3;
        short[] sArr = this.f142b;
        Transform[] transformArr = this.f145e.f563a.f651a;
        float[] fArrM471d = vertexBuffer.m337b(0).m471d();
        float[] fArr = this.f145e.f565c.f494b.m;
        float[] fArrM471d2 = vertexBuffer.m339c(0).m471d();
        int i = vertexBuffer.f538c[0] * 3;
        int i2 = 0;
        if (vertexBuffer.f523B == this.f145e.f568f) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = i3 + 1;
            float f4 = fArrM471d[i3];
            int i6 = i5 + 1;
            float f5 = fArrM471d[i5];
            int i7 = i6 + 1;
            float f6 = fArrM471d[i6];
            C0124w c0124w = this.f143c[i4];
            short s = c0124w.f1041c;
            if (s == 0) {
                f = (fArr[0] * f4) + (fArr[4] * f5) + (fArr[8] * f6) + fArr[12];
                f2 = fArr[13] + (fArr[1] * f4) + (fArr[5] * f5) + (fArr[9] * f6);
                f3 = (fArr[2] * f4) + (fArr[6] * f5) + (fArr[10] * f6) + fArr[14];
            } else if (s == 1) {
                float[] fArr2 = transformArr[c0124w.f1040b[0]].f494b.m;
                f = fArr2[12] + (fArr2[0] * f4) + (fArr2[4] * f5) + (fArr2[8] * f6);
                f2 = (fArr2[1] * f4) + (fArr2[5] * f5) + (fArr2[9] * f6) + fArr2[13];
                f3 = fArr2[14] + (fArr2[2] * f4) + (fArr2[6] * f5) + (fArr2[10] * f6);
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                for (int i8 = 0; i8 < s; i8++) {
                    float f7 = c0124w.f1039a[i8];
                    float[] fArr3 = transformArr[c0124w.f1040b[i8]].f494b.m;
                    f += ((fArr3[0] * f4) + (fArr3[4] * f5) + (fArr3[8] * f6) + fArr3[12]) * f7;
                    f2 += ((fArr3[1] * f4) + (fArr3[5] * f5) + (fArr3[9] * f6) + fArr3[13]) * f7;
                    f3 += f7 * (fArr3[14] + (fArr3[2] * f4) + (fArr3[6] * f5) + (fArr3[10] * f6));
                }
            }
            short s2 = sArr[i4];
            for (int i9 = 0; i9 < s2; i9++) {
                int i10 = i2 + 1;
                fArrM471d2[i2] = f;
                int i11 = i10 + 1;
                fArrM471d2[i10] = f2;
                i2 = i11 + 1;
                fArrM471d2[i11] = f3;
            }
            i4++;
            i3 = i7;
        }
        vertexBuffer.f540e[0] = true;
        vertexBuffer.m340c();
        vertexBuffer.f523B = this.f145e.f568f;
    }

    /* JADX INFO: renamed from: c */
    final void m60c() {
        if (this.f153w == 127) {
            this.f153w = (byte) -128;
        } else {
            this.f153w = (byte) (this.f153w + 1);
        }
        this.f145e.f568f = this.f153w;
    }

    /* JADX INFO: renamed from: c */
    final void m61c(VertexBuffer vertexBuffer) {
        int i;
        int i2;
        int i3;
        short[] sArr = this.f142b;
        C0058cc[] c0058ccArr = this.f145e.f564b.f742a;
        int[] iArr = this.f145e.f566d.f771a;
        if (vertexBuffer.f524C == this.f145e.f568f) {
            return;
        }
        int i4 = 1;
        while (true) {
            int i5 = i4;
            if (i5 > 3) {
                vertexBuffer.f524C = this.f145e.f568f;
                return;
            }
            C0065cj c0065cjM337b = vertexBuffer.m337b(i5);
            short[] sArrM472e = c0065cjM337b != null ? c0065cjM337b.m472e() : null;
            if (sArrM472e != null) {
                int i6 = vertexBuffer.f538c[i5] * 3;
                float[] fArrM471d = vertexBuffer.m339c(i5).m471d();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < i6) {
                    int i10 = i7 + 1;
                    short s = sArrM472e[i7];
                    int i11 = i10 + 1;
                    short s2 = sArrM472e[i10];
                    int i12 = i11 + 1;
                    short s3 = sArrM472e[i11];
                    C0124w c0124w = this.f143c[i9];
                    short s4 = c0124w.f1041c;
                    if (s4 == 0) {
                        i = (((iArr[0] * s) + (iArr[3] * s2)) + (iArr[6] * s3)) >> 12;
                        i2 = (((iArr[1] * s) + (iArr[4] * s2)) + (iArr[7] * s3)) >> 12;
                        i3 = (((iArr[2] * s) + (iArr[5] * s2)) + (iArr[8] * s3)) >> 12;
                    } else if (s4 == 1) {
                        int[] iArr2 = c0058ccArr[c0124w.f1040b[0]].f771a;
                        i = (((iArr2[0] * s) + (iArr2[3] * s2)) + (iArr2[6] * s3)) >> 12;
                        i2 = (((iArr2[1] * s) + (iArr2[4] * s2)) + (iArr2[7] * s3)) >> 12;
                        i3 = ((iArr2[8] * s3) + ((iArr2[2] * s) + (iArr2[5] * s2))) >> 12;
                    } else {
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        for (int i13 = 0; i13 < s4; i13++) {
                            int i14 = (int) (4096.0f * c0124w.f1039a[i13]);
                            int[] iArr3 = c0058ccArr[c0124w.f1040b[i13]].f771a;
                            i += (((((iArr3[0] * s) + (iArr3[3] * s2)) + (iArr3[6] * s3)) >> 12) * i14) >> 12;
                            i2 += (((((iArr3[1] * s) + (iArr3[4] * s2)) + (iArr3[7] * s3)) >> 12) * i14) >> 12;
                            i3 += (i14 * (((iArr3[8] * s3) + ((iArr3[2] * s) + (iArr3[5] * s2))) >> 12)) >> 12;
                        }
                    }
                    float f = i * 3.051851E-5f;
                    float f2 = 3.051851E-5f * i2;
                    float f3 = i3 * 3.051851E-5f;
                    short s5 = sArr[i9];
                    int i15 = i8;
                    for (int i16 = 0; i16 < s5; i16++) {
                        int i17 = i15 + 1;
                        fArrM471d[i15] = f;
                        int i18 = i17 + 1;
                        fArrM471d[i17] = f2;
                        i15 = i18 + 1;
                        fArrM471d[i18] = f3;
                    }
                    i8 = i15;
                    i9++;
                    i7 = i12;
                }
                vertexBuffer.f540e[i5] = true;
            }
            i4 = i5 + 1;
        }
    }

    public final void couplingTransformTree(TransformTree transformTree, int i) {
        if (i < 0 || i >= transformTree.f501c) {
            throw new IllegalArgumentException();
        }
        if (!m53a(transformTree)) {
            throw new IllegalArgumentException();
        }
        m58b(transformTree, i);
        this.f146f = transformTree;
    }

    /* JADX INFO: renamed from: d */
    final void m62d() {
        Transform[] transformArr = this.f145e.f563a.f651a;
        C0058cc[] c0058ccArr = this.f145e.f564b.f742a;
        int length = transformArr.length;
        if (this.f154x == this.f145e.f568f) {
            return;
        }
        this.f147g = false;
        for (int i = 0; i < length; i++) {
            if (!c0058ccArr[i].m447a(transformArr[i])) {
                this.f147g = true;
            }
        }
        if (!this.f145e.f566d.m447a(this.f145e.f565c)) {
            this.f147g = true;
        }
        this.f154x = this.f145e.f568f;
    }

    public final short[] getTransIndexMap() {
        return this.f151u;
    }

    public final int getTransNum() {
        return this.f148r.f651a.length;
    }

    public final void getTransformAndWeights(int i, short[] sArr, float[] fArr) {
        if (sArr == null || fArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f141a) {
            throw new IllegalArgumentException();
        }
        C0124w c0124w = this.f143c[i];
        if (sArr.length < c0124w.f1041c || fArr.length < c0124w.f1041c || this.f151u != null) {
            throw new IllegalArgumentException();
        }
        for (int i2 = 0; i2 < c0124w.f1041c; i2++) {
            sArr[i2] = c0124w.f1040b[i2];
            fArr[i2] = c0124w.f1039a[i2];
        }
    }

    public final void setTransformAndWeights(int i, short[] sArr, float[] fArr, int i2) {
        float f = 0.0f;
        if (sArr == null || fArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f141a) {
            throw new IllegalArgumentException();
        }
        if (i2 <= 0 || i2 > 4) {
            throw new IllegalArgumentException();
        }
        if (sArr.length != i2 || fArr.length != i2 || this.f151u != null) {
            throw new IllegalArgumentException();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (fArr[i3] <= 0.0f) {
                throw new IllegalArgumentException();
            }
            if (sArr[i3] < 0 || sArr[i3] >= this.f148r.f651a.length) {
                throw new IllegalArgumentException();
            }
        }
        C0124w c0124w = this.f143c[i];
        for (int i4 = 0; i4 < i2; i4++) {
            f += fArr[i4];
            c0124w.f1039a[i4] = fArr[i4];
            c0124w.f1040b[i4] = sArr[i4];
        }
        for (int i5 = 0; i5 < i2; i5++) {
            c0124w.f1039a[i5] = c0124w.f1039a[i5] / f;
        }
        c0124w.f1041c = (short) i2;
        if (this.f146f != null) {
            this.f146f.f506p = true;
        }
    }
}
