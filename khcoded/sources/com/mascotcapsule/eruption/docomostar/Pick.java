package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Pick {
    public static final int USE_BS_PRUNING = 1;
    public static final int USE_ONLY_BS_PRUNING = 3;

    /* JADX INFO: renamed from: b */
    private static float f435b = 1.0E-4f;

    /* JADX INFO: renamed from: c */
    private static Vector3D f436c = new Vector3D();

    /* JADX INFO: renamed from: d */
    private static Vector3D f437d = new Vector3D();

    /* JADX INFO: renamed from: e */
    private static Vector3D f438e = new Vector3D();

    /* JADX INFO: renamed from: f */
    private static Vector3D f439f = new Vector3D();

    /* JADX INFO: renamed from: g */
    private static Vector3D f440g = new Vector3D();

    /* JADX INFO: renamed from: h */
    private static Vector3D f441h = new Vector3D();

    /* JADX INFO: renamed from: i */
    private static Vector3D f442i = new Vector3D();

    /* JADX INFO: renamed from: j */
    private static Vector3D f443j = new Vector3D();

    /* JADX INFO: renamed from: k */
    private static Vector3D f444k = new Vector3D();

    /* JADX INFO: renamed from: l */
    private static Vector3D f445l = new Vector3D();

    /* JADX INFO: renamed from: m */
    private static Transform f446m = new Transform();

    /* JADX INFO: renamed from: n */
    private static Transform f447n = new Transform();

    /* JADX INFO: renamed from: o */
    private static float[] f448o = new float[2];

    /* JADX INFO: renamed from: p */
    private static float[][] f449p = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, 4);

    /* JADX INFO: renamed from: q */
    private static float[][] f450q = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, 2);

    /* JADX INFO: renamed from: r */
    private static int[] f451r = new int[3];

    /* JADX INFO: renamed from: s */
    private static int[] f452s = new int[3];

    /* JADX INFO: renamed from: t */
    private static int[] f453t = new int[3];

    /* JADX INFO: renamed from: u */
    private static int[][] f454u = {new int[]{0, 1, 2}, new int[]{2, 1, 3}};

    /* JADX INFO: renamed from: a */
    private float f455a = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    private static int m234a(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, Vector3D vector3D4, Vector3D vector3D5, int i, Vector3D vector3D6, Vector3D vector3D7) {
        f441h.sub(vector3D2, vector3D);
        f442i.sub(vector3D3, vector3D);
        vector3D7.cross(f441h, f442i);
        float fDot = vector3D7.dot(vector3D4);
        if (i == 0 && fDot > 0.0f) {
            return 0;
        }
        if (i == 1 && fDot < 0.0f) {
            return 0;
        }
        if (vector3D7.f516a == 0.0f && vector3D7.f517b == 0.0f && vector3D7.f518c == 0.0f) {
            return -1;
        }
        f444k.sub(vector3D5, vector3D);
        float fDot2 = vector3D7.dot(f444k);
        float fDot3 = vector3D7.dot(vector3D4);
        if (Math.abs(fDot3) < f435b) {
            return fDot2 == 0.0f ? 2 : 0;
        }
        float f = (-fDot2) / fDot3;
        if (f < 0.0f) {
            return 0;
        }
        vector3D6.f516a = vector3D5.f516a + (vector3D4.f516a * f);
        vector3D6.f517b = vector3D5.f517b + (vector3D4.f517b * f);
        vector3D6.f518c = (f * vector3D4.f518c) + vector3D5.f518c;
        float fDot4 = f441h.dot(f441h);
        float fDot5 = f441h.dot(f442i);
        float fDot6 = f442i.dot(f442i);
        f443j.sub(vector3D6, vector3D);
        float fDot7 = f443j.dot(f441h);
        float fDot8 = f443j.dot(f442i);
        float f2 = (fDot5 * fDot5) - (fDot4 * fDot6);
        float f3 = ((fDot5 * fDot8) - (fDot6 * fDot7)) / f2;
        if (f3 < (-f435b) || f3 > 1.0f + f435b) {
            return 0;
        }
        float f4 = ((fDot5 * fDot7) - (fDot4 * fDot8)) / f2;
        return (f4 < (-f435b) || f4 + f3 > 1.0f + f435b) ? 0 : 1;
    }

    /* JADX INFO: renamed from: a */
    private static void m235a(int i, int i2, C0082d c0082d, float[] fArr, int[] iArr, Transform transform, VertexBuffer vertexBuffer) {
        if (vertexBuffer.m339c(i2) == null) {
            return;
        }
        short[] sArrM472e = vertexBuffer.m339c(i2).m472e();
        float[] fArrM471d = vertexBuffer.m339c(i2).m471d();
        if (sArrM472e == null && fArrM471d == null) {
            return;
        }
        Transform transformM341d = vertexBuffer.m341d(i);
        f445l.f518c = 0.0f;
        for (int i3 = 0; i3 < 3; i3++) {
            if (sArrM472e != null) {
                f445l.f516a = sArrM472e[iArr[i3]];
                f445l.f517b = sArrM472e[iArr[i3]];
            } else {
                f445l.f516a = fArrM471d[iArr[i3]];
                f445l.f517b = fArrM471d[iArr[i3]];
            }
            transformM341d.transPosition(f445l);
            f450q[i3][0] = f445l.f516a;
            f450q[i3][1] = f445l.f517b;
        }
        for (int i4 = 0; i4 < 2; i4++) {
            c0082d.f842b[i][i4] = (((f450q[0][i4] * transform.f494b.m[0]) + (f450q[1][i4] * transform.f494b.m[4]) + (f450q[2][i4] * transform.f494b.m[8])) * fArr[0]) + (((f450q[0][i4] * transform.f494b.m[1]) + (f450q[1][i4] * transform.f494b.m[5]) + (f450q[2][i4] * transform.f494b.m[9])) * fArr[1]) + (f450q[0][i4] * transform.f494b.m[2]) + (f450q[1][i4] * transform.f494b.m[6]) + (f450q[2][i4] * transform.f494b.m[10]);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m236a(C0082d c0082d, Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, Vector3D vector3D4, int[] iArr, VertexBuffer vertexBuffer) {
        byte[] bArrM473f;
        float[] fArr = c0082d.f844d;
        float[] fArr2 = c0082d.f844d;
        float[] fArr3 = c0082d.f844d;
        c0082d.f844d[3] = 0.0f;
        fArr3[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr[0] = 0.0f;
        float[] fArr4 = c0082d.f842b[0];
        c0082d.f842b[0][1] = 0.0f;
        fArr4[0] = 0.0f;
        float[] fArr5 = c0082d.f842b[1];
        c0082d.f842b[1][1] = 0.0f;
        fArr5[0] = 0.0f;
        f453t[0] = iArr[0] << 1;
        f453t[1] = iArr[1] << 1;
        f453t[2] = iArr[2] << 1;
        for (int i = 0; i < 3; i++) {
            f446m.setIdentity();
            switch (i) {
                case 0:
                    f446m.f494b.m[0] = vector3D.f516a;
                    f446m.f494b.m[1] = vector3D2.f516a;
                    f446m.f494b.m[2] = vector3D3.f516a;
                    f446m.f494b.m[4] = vector3D.f517b;
                    f446m.f494b.m[5] = vector3D2.f517b;
                    f446m.f494b.m[6] = vector3D3.f517b;
                    f448o[0] = vector3D4.f516a;
                    f448o[1] = vector3D4.f517b;
                    break;
                case 1:
                    f446m.f494b.m[0] = vector3D.f517b;
                    f446m.f494b.m[1] = vector3D2.f517b;
                    f446m.f494b.m[2] = vector3D3.f517b;
                    f446m.f494b.m[4] = vector3D.f518c;
                    f446m.f494b.m[5] = vector3D2.f518c;
                    f446m.f494b.m[6] = vector3D3.f518c;
                    f448o[0] = vector3D4.f517b;
                    f448o[1] = vector3D4.f518c;
                    break;
                default:
                    f446m.f494b.m[0] = vector3D.f516a;
                    f446m.f494b.m[1] = vector3D2.f516a;
                    f446m.f494b.m[2] = vector3D3.f516a;
                    f446m.f494b.m[4] = vector3D.f518c;
                    f446m.f494b.m[5] = vector3D2.f518c;
                    f446m.f494b.m[6] = vector3D3.f518c;
                    f448o[0] = vector3D4.f516a;
                    f448o[1] = vector3D4.f518c;
                    break;
            }
            float[] fArr6 = f446m.f494b.m;
            f446m.f494b.m[9] = 1.0f;
            fArr6[8] = 1.0f;
            f446m.f495c = (byte) 0;
            f446m.f496d = (byte) 0;
            if (Math.abs(f446m.m253a()) > f435b) {
                f447n.setInvert(f446m);
                if (vertexBuffer.m339c(4) != null && (bArrM473f = vertexBuffer.m339c(4).m473f()) != null) {
                    m237a(bArrM473f, iArr[0], f449p[0]);
                    m237a(bArrM473f, iArr[1], f449p[1]);
                    m237a(bArrM473f, iArr[2], f449p[2]);
                    for (int i2 = 0; i2 < 4; i2++) {
                        c0082d.f844d[i2] = (((f449p[0][i2] * f447n.f494b.m[0]) + (f449p[1][i2] * f447n.f494b.m[4]) + (f449p[2][i2] * f447n.f494b.m[8])) * f448o[0]) + (((f449p[0][i2] * f447n.f494b.m[1]) + (f449p[1][i2] * f447n.f494b.m[5]) + (f449p[2][i2] * f447n.f494b.m[9])) * f448o[1]) + (f449p[0][i2] * f447n.f494b.m[2]) + (f449p[1][i2] * f447n.f494b.m[6]) + (f449p[2][i2] * f447n.f494b.m[10]);
                    }
                }
                m235a(0, 5, c0082d, f448o, f453t, f447n, vertexBuffer);
                m235a(1, 6, c0082d, f448o, f453t, f447n, vertexBuffer);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m237a(byte[] bArr, int i, float[] fArr) {
        int i2 = i << 2;
        fArr[0] = bArr[i2] * 0.003921569f;
        fArr[1] = bArr[i2 + 1] * 0.003921569f;
        fArr[2] = bArr[i2 + 2] * 0.003921569f;
        fArr[3] = bArr[i2 + 3] * 0.003921569f;
    }

    /* JADX INFO: renamed from: a */
    private boolean m238a(int i, int i2, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Vector3D vector3D, Vector3D vector3D2, IntersectionAttributes intersectionAttributes, boolean z, Transform transform) {
        int i3;
        boolean z2;
        boolean z3 = false;
        int i4 = indexBuffer.f352y.f109d.f757i;
        int i5 = 0;
        while (i5 < i) {
            if (indexBuffer.f345r != null) {
                int i6 = i2 + 1;
                f451r[0] = indexBuffer.f345r[i2];
                int i7 = i6 + 1;
                f451r[1] = indexBuffer.f345r[i6];
                f451r[2] = indexBuffer.f345r[i7];
                i3 = i7 + 1;
            } else {
                int i8 = i2 + 1;
                f451r[0] = i2;
                int i9 = i8 + 1;
                f451r[1] = i8;
                f451r[2] = i9;
                i3 = i9 + 1;
            }
            f452s[0] = f451r[0] * 3;
            f452s[1] = f451r[1] * 3;
            f452s[2] = f451r[2] * 3;
            float[] fArrM471d = vertexBuffer.m337b(0).m471d();
            f436c.set(fArrM471d[f452s[0]], fArrM471d[f452s[0] + 1], fArrM471d[f452s[0] + 2]);
            f437d.set(fArrM471d[f452s[1]], fArrM471d[f452s[1] + 1], fArrM471d[f452s[1] + 2]);
            f438e.set(fArrM471d[f452s[2]], fArrM471d[f452s[2] + 1], fArrM471d[f452s[2] + 2]);
            if (transform != null) {
                transform.m262a(f436c, f436c);
                transform.m262a(f437d, f437d);
                transform.m262a(f438e, f438e);
            }
            if (m234a(f436c, f437d, f438e, vector3D2, vector3D, i4, f439f, f440g) != 1) {
                z2 = z3;
            } else {
                if (intersectionAttributes == null) {
                    return true;
                }
                C0082d c0082d = new C0082d();
                c0082d.f841a = f439f.distance(vector3D);
                if (z || c0082d.f841a < this.f455a) {
                    this.f455a = c0082d.f841a;
                    try {
                        c0082d.f845e = indexBuffer.getUserData(i5);
                    } catch (IllegalStateException e) {
                        c0082d.f845e = 0;
                    }
                    c0082d.f846f = indexBuffer.f352y;
                    c0082d.f843c[0] = f440g.f516a;
                    c0082d.f843c[1] = f440g.f517b;
                    c0082d.f843c[2] = f440g.f518c;
                    m236a(c0082d, f436c, f437d, f438e, f439f, f451r, vertexBuffer);
                    if (!z) {
                        intersectionAttributes.m172a();
                    }
                    intersectionAttributes.m173a(c0082d);
                }
                z2 = true;
            }
            i5++;
            i2 = i3;
            z3 = z2;
        }
        return z3;
    }

    /* JADX INFO: renamed from: b */
    private boolean m239b(int i, int i2, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Vector3D vector3D, Vector3D vector3D2, IntersectionAttributes intersectionAttributes, boolean z, Transform transform) {
        boolean z2;
        boolean z3 = false;
        int i3 = indexBuffer.f352y.f109d.f757i;
        int i4 = 0;
        int i5 = i2;
        while (i4 < i) {
            int i6 = i4 & 1;
            if (indexBuffer.f345r != null) {
                f451r[0] = indexBuffer.f345r[f454u[i6][0] + i5];
                f451r[1] = indexBuffer.f345r[f454u[i6][1] + i5];
                f451r[2] = indexBuffer.f345r[f454u[i6][2] + i5];
            } else {
                f451r[0] = f454u[i6][0] + i5;
                f451r[1] = f454u[i6][1] + i5;
                f451r[2] = f454u[i6][2] + i5;
            }
            int i7 = i6 == 1 ? i5 + 2 : i5;
            f452s[0] = f451r[0] * 3;
            f452s[1] = f451r[1] * 3;
            f452s[2] = f451r[2] * 3;
            float[] fArrM471d = vertexBuffer.m337b(0).m471d();
            f436c.set(fArrM471d[f452s[0]], fArrM471d[f452s[0] + 1], fArrM471d[f452s[0] + 2]);
            f437d.set(fArrM471d[f452s[1]], fArrM471d[f452s[1] + 1], fArrM471d[f452s[1] + 2]);
            f438e.set(fArrM471d[f452s[2]], fArrM471d[f452s[2] + 1], fArrM471d[f452s[2] + 2]);
            if (transform != null) {
                transform.m262a(f436c, f436c);
                transform.m262a(f437d, f437d);
                transform.m262a(f438e, f438e);
            }
            if (m234a(f436c, f437d, f438e, vector3D2, vector3D, i3, f439f, f440g) != 1) {
                z2 = z3;
            } else {
                if (intersectionAttributes == null) {
                    return true;
                }
                C0082d c0082d = new C0082d();
                c0082d.f841a = f439f.distance(vector3D);
                if (z || c0082d.f841a < this.f455a) {
                    this.f455a = c0082d.f841a;
                    try {
                        c0082d.f845e = indexBuffer.getUserData(i4);
                    } catch (IllegalStateException e) {
                        c0082d.f845e = 0;
                    }
                    c0082d.f846f = indexBuffer.f352y;
                    c0082d.f843c[0] = f440g.f516a;
                    c0082d.f843c[1] = f440g.f517b;
                    c0082d.f843c[2] = f440g.f518c;
                    m236a(c0082d, f436c, f437d, f438e, f439f, f451r, vertexBuffer);
                    if (!z) {
                        intersectionAttributes.m172a();
                    }
                    intersectionAttributes.m173a(c0082d);
                }
                z2 = true;
            }
            i4++;
            i5 = i7;
            z3 = z2;
        }
        return z3;
    }

    /* JADX INFO: renamed from: c */
    private boolean m240c(int i, int i2, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Vector3D vector3D, Vector3D vector3D2, IntersectionAttributes intersectionAttributes, boolean z, Transform transform) {
        boolean z2;
        boolean z3 = false;
        int i3 = indexBuffer.f352y.f109d.f757i;
        if (indexBuffer.f345r != null) {
            f451r[0] = indexBuffer.f345r[i2];
        } else {
            f451r[0] = i2;
        }
        f452s[0] = f451r[0] * 3;
        int i4 = 0;
        while (i4 < i) {
            i2++;
            if (indexBuffer.f345r != null) {
                f451r[1] = indexBuffer.f345r[i2];
                f451r[2] = indexBuffer.f345r[i2 + 1];
            } else {
                f451r[1] = i2;
                f451r[2] = i2 + 1;
            }
            f452s[1] = f451r[1] * 3;
            f452s[2] = f451r[2] * 3;
            float[] fArrM471d = vertexBuffer.m337b(0).m471d();
            f436c.set(fArrM471d[f452s[0]], fArrM471d[f452s[0] + 1], fArrM471d[f452s[0] + 2]);
            f437d.set(fArrM471d[f452s[1]], fArrM471d[f452s[1] + 1], fArrM471d[f452s[1] + 2]);
            f438e.set(fArrM471d[f452s[2]], fArrM471d[f452s[2] + 1], fArrM471d[f452s[2] + 2]);
            if (transform != null) {
                transform.m262a(f436c, f436c);
                transform.m262a(f437d, f437d);
                transform.m262a(f438e, f438e);
            }
            if (m234a(f436c, f437d, f438e, vector3D2, vector3D, i3, f439f, f440g) != 1) {
                z2 = z3;
            } else {
                if (intersectionAttributes == null) {
                    return true;
                }
                C0082d c0082d = new C0082d();
                c0082d.f841a = f439f.distance(vector3D);
                if (z || c0082d.f841a < this.f455a) {
                    this.f455a = c0082d.f841a;
                    try {
                        c0082d.f845e = indexBuffer.getUserData(i4);
                    } catch (IllegalStateException e) {
                        c0082d.f845e = 0;
                    }
                    c0082d.f846f = indexBuffer.f352y;
                    c0082d.f843c[0] = f440g.f516a;
                    c0082d.f843c[1] = f440g.f517b;
                    c0082d.f843c[2] = f440g.f518c;
                    m236a(c0082d, f436c, f437d, f438e, f439f, f451r, vertexBuffer);
                    if (!z) {
                        intersectionAttributes.m172a();
                    }
                    intersectionAttributes.m173a(c0082d);
                }
                z2 = true;
            }
            i4++;
            z3 = z2;
        }
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX INFO: renamed from: a */
    final boolean m241a(Figure figure, Vector3D vector3D, Vector3D vector3D2, IntersectionAttributes intersectionAttributes, int i, boolean z, TransformTree transformTree, Transform transform, boolean z2, int i2) {
        boolean z3;
        if (figure.f229g != null) {
            transformTree = figure.f229g;
        }
        GeometricShape geometricShape = figure.getGeometricShape();
        if (geometricShape == null) {
            if ((i & 3) == 3) {
                return false;
            }
        } else if ((i & 1) != 0 && !Collision3D.isHit(vector3D, vector3D2, geometricShape, transform, (Vector3D) null)) {
            return false;
        }
        VertexBuffer vertexBuffer = figure.f225c;
        if (vertexBuffer == null || !z2) {
            z3 = false;
        } else {
            int indexNum = figure.getIndexNum();
            IndexBuffer[] indexBufferArr = figure.f224b;
            BoneDeformer boneDeformer = figure.f227e;
            MorphDeformer morphDeformer = figure.f228f;
            boolean z4 = vertexBuffer.f541f[1] != null;
            if (boneDeformer != null && transformTree != null) {
                boneDeformer.m47a(transformTree, vertexBuffer.f539d[0] || vertexBuffer.f539d[1]);
                if (z4) {
                    boneDeformer.m62d();
                    vertexBuffer.f527F = boneDeformer.f147g;
                } else {
                    vertexBuffer.f527F = false;
                }
                if (morphDeformer != null) {
                    C0059cd c0059cdM200b = morphDeformer.m200b(0);
                    for (int i3 = 0; i3 < indexNum; i3++) {
                        boneDeformer.m45a(morphDeformer, indexBufferArr[i3], vertexBuffer, boneDeformer.f145e, c0059cdM200b);
                    }
                } else {
                    boneDeformer.m59b(vertexBuffer);
                    if (z4) {
                        boneDeformer.m61c(vertexBuffer);
                    }
                }
            } else if (morphDeformer != null) {
                morphDeformer.m195a(vertexBuffer, morphDeformer.m200b(0));
            }
            z3 = false;
            for (int i4 = 0; i4 < indexNum; i4++) {
                if (m242a(vertexBuffer, indexBufferArr[i4], vector3D, vector3D2, intersectionAttributes, i, z, transform)) {
                    z3 = true;
                    if (intersectionAttributes == null) {
                        return true;
                    }
                }
            }
        }
        NodeDeformer nodeDeformer = figure.getNodeDeformer();
        if (nodeDeformer == null) {
            return z3;
        }
        int nodeNum = nodeDeformer.getNodeNum();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            boolean z5 = z3;
            if (i6 >= nodeNum) {
                return z5;
            }
            C0017ap c0017ap = nodeDeformer.f392e[i6];
            if (c0017ap.f675e) {
                Object3D object3D = c0017ap.f671a;
                if (object3D.f400h != 9 || i2 >= 4) {
                    z3 = z5;
                } else if (m241a((Figure) object3D, vector3D, vector3D2, intersectionAttributes, i, z, transformTree, c0017ap.f673c, c0017ap.f675e, i2 + 1)) {
                    z3 = true;
                    if (intersectionAttributes == null) {
                        return true;
                    }
                } else {
                    z3 = z5;
                }
            } else {
                z3 = z5;
            }
            i5 = i6 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m242a(VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Vector3D vector3D, Vector3D vector3D2, IntersectionAttributes intersectionAttributes, int i, boolean z, Transform transform) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (indexBuffer.f336a != 4 && indexBuffer.f336a != 5 && indexBuffer.f336a != 6 && indexBuffer.f336a != 7) {
            return false;
        }
        GeometricShape geometricShape = indexBuffer.getGeometricShape(1);
        if (geometricShape == null) {
            if ((i & 3) == 3) {
                return false;
            }
        } else if ((i & 1) != 0 && !Collision3D.isHit(vector3D, vector3D2, geometricShape, transform, (Vector3D) null)) {
            return false;
        }
        if (indexBuffer.f352y == null || indexBuffer.f352y.f109d.f757i == 2) {
            return false;
        }
        int i2 = indexBuffer.f342g > 0 ? indexBuffer.f340e - 1 : indexBuffer.f340e;
        int i3 = indexBuffer.f345r == null ? indexBuffer.f339d : 0;
        switch (indexBuffer.f336a) {
            case 4:
                int i4 = 0;
                int i5 = i3;
                while (i4 < i2) {
                    if (!m238a(indexBuffer.f344q[i4] / 3, i5, vertexBuffer, indexBuffer, vector3D, vector3D2, intersectionAttributes, z, transform)) {
                        z5 = z6;
                    } else {
                        if (intersectionAttributes == null) {
                            return true;
                        }
                        z5 = true;
                    }
                    i5 += indexBuffer.f344q[i4];
                    i4++;
                    z6 = z5;
                }
                return z6;
            case 5:
                int i6 = 0;
                int i7 = i3;
                while (i6 < i2) {
                    if (!m239b(indexBuffer.f344q[i6] - 2, i7, vertexBuffer, indexBuffer, vector3D, vector3D2, intersectionAttributes, z, transform)) {
                        z4 = z6;
                    } else {
                        if (intersectionAttributes == null) {
                            return true;
                        }
                        z4 = true;
                    }
                    i7 += indexBuffer.f344q[i6];
                    i6++;
                    z6 = z4;
                }
                if (indexBuffer.f342g <= 0 || !m238a(indexBuffer.f342g / 3, i7, vertexBuffer, indexBuffer, vector3D, vector3D2, intersectionAttributes, z, transform)) {
                    return z6;
                }
                return intersectionAttributes == null ? true : true;
            case 6:
                int i8 = 0;
                int i9 = i3;
                while (i8 < i2) {
                    if (!m240c(indexBuffer.f344q[i8] - 2, i9, vertexBuffer, indexBuffer, vector3D, vector3D2, intersectionAttributes, z, transform)) {
                        z3 = z6;
                    } else {
                        if (intersectionAttributes == null) {
                            return true;
                        }
                        z3 = true;
                    }
                    i9 += indexBuffer.f344q[i8];
                    i8++;
                    z6 = z3;
                }
                return z6;
            case 7:
                if (!VertexBuffer.m309h(vertexBuffer.f537b)) {
                    vertexBuffer.m327a();
                    if (VertexBuffer.m308g(vertexBuffer.f536a)) {
                        vertexBuffer.m345h();
                    }
                    vertexBuffer.m342d();
                }
                if (vertexBuffer.f539d[4]) {
                    vertexBuffer.m345h();
                }
                if (vertexBuffer.f539d[7]) {
                    vertexBuffer.m342d();
                }
                vertexBuffer.m343d(transform);
                int i10 = 0;
                int i11 = i3;
                while (i10 < i2) {
                    if (!m238a(indexBuffer.f344q[i10] << 1, i11, vertexBuffer, indexBuffer, vector3D, vector3D2, intersectionAttributes, z, transform)) {
                        z2 = z6;
                    } else {
                        if (intersectionAttributes == null) {
                            return true;
                        }
                        z2 = true;
                    }
                    i11 += indexBuffer.f344q[i10];
                    i10++;
                    z6 = z2;
                }
                return z6;
            default:
                return false;
        }
    }
}
