package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ar */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0019ar {

    /* JADX INFO: renamed from: b */
    private static float[] f676b = new float[4];

    /* JADX INFO: renamed from: c */
    private static Transform f677c = new Transform();

    /* JADX INFO: renamed from: d */
    private static float[] f678d = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: e */
    private static float[][] f679e = {new float[]{0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f}};

    /* JADX INFO: renamed from: f */
    private static float[] f680f = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: a */
    C0037bi[] f681a;

    C0019ar(int i) {
        if (i < 0 || i > 131068) {
            throw new IllegalArgumentException();
        }
        this.f681a = new C0037bi[i];
    }

    /* JADX INFO: renamed from: a */
    private static void m406a(int i, Transform transform, float[] fArr) {
        switch (i) {
            case 1:
                transform.m265a(fArr);
                break;
            case 5:
                Transform.f489a[0].mo456a(transform, fArr);
                break;
            case 6:
                Transform.f489a[1].mo456a(transform, fArr);
                break;
            case 7:
                Transform.f489a[2].mo456a(transform, fArr);
                break;
            case 8:
                Transform.f489a[3].mo456a(transform, fArr);
                break;
            case 9:
                Transform.f489a[4].mo456a(transform, fArr);
                break;
            case 10:
                Transform.f489a[5].mo456a(transform, fArr);
                break;
            case 11:
                transform.m269b(fArr);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    private static void m407a(int i, float[] fArr, float f, float[] fArr2) {
        switch (i) {
            case 1:
                fArr2[0] = fArr2[0] + (fArr[0] * f);
                break;
            case 2:
                fArr2[1] = fArr2[1] + (fArr[1] * f);
                fArr2[0] = fArr2[0] + (fArr[0] * f);
                break;
            case 3:
                fArr2[2] = fArr2[2] + (fArr[2] * f);
                fArr2[1] = fArr2[1] + (fArr[1] * f);
                fArr2[0] = fArr2[0] + (fArr[0] * f);
                break;
            case 4:
                fArr2[3] = fArr2[3] + (fArr[3] * f);
                fArr2[2] = fArr2[2] + (fArr[2] * f);
                fArr2[1] = fArr2[1] + (fArr[1] * f);
                fArr2[0] = fArr2[0] + (fArr[0] * f);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m408a(C0019ar[][] c0019arArr, C0113l c0113l, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, boolean[] zArr, int i, int i2, int i3) {
        Transform transform = c0113l.f960a;
        int i4 = 0;
        boolean z = false;
        f678d[0] = 0.0f;
        f678d[1] = 0.0f;
        f678d[2] = 0.0f;
        f679e[0][0] = 0.0f;
        f679e[0][1] = 0.0f;
        f679e[0][2] = 0.0f;
        f679e[1][0] = 0.0f;
        f679e[1][1] = 0.0f;
        f679e[1][2] = 0.0f;
        f680f[0] = 0.0f;
        f680f[1] = 0.0f;
        f680f[2] = 0.0f;
        f677c.setIdentity();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= i) {
                break;
            }
            if (zArr[i6]) {
                C0019ar c0019ar = c0019arArr[i6][i2];
                for (int i7 = 0; i7 < c0019ar.f681a.length; i7++) {
                    C0037bi c0037bi = c0019ar.f681a[i7];
                    c0037bi.m433a(fArr[i6][i2], c0033beArr[i6][i2].f699a, c0033beArr[i6][i2].f700b[i7], f676b);
                    if (c0037bi.f721a == 1) {
                        m407a(c0037bi.f722b, f676b, fArr2[i6][i2], f678d);
                        i4 |= 1;
                    } else if (c0037bi.f721a >= 2 && c0037bi.f721a <= 10) {
                        m406a(c0037bi.f721a, f677c, f676b);
                        f676b[0] = f677c.f494b.m[0];
                        f676b[1] = f677c.f494b.m[1];
                        f676b[2] = f677c.f494b.m[2];
                        m407a(c0037bi.f722b, f676b, fArr2[i6][i2], f679e[0]);
                        f676b[0] = f677c.f494b.m[4];
                        f676b[1] = f677c.f494b.m[5];
                        f676b[2] = f677c.f494b.m[6];
                        m407a(c0037bi.f722b, f676b, fArr2[i6][i2], f679e[1]);
                        i4 |= 2;
                    } else if (c0037bi.f721a == 11) {
                        m407a(c0037bi.f722b, f676b, fArr2[i6][i2], f680f);
                        i4 |= 4;
                    }
                    z = true;
                }
                c0033beArr[i6][i2].f699a = fArr[i6][i2];
            }
            i5 = i6 + 1;
        }
        Transform.m251e(transform, c0113l.f962c);
        if ((i4 & 1) != 0) {
            m406a(1, transform, f678d);
        }
        if ((i4 & 2) != 0) {
            Vector3D[] vector3DArr = {new Vector3D(), new Vector3D(), new Vector3D()};
            vector3DArr[0].f516a = f679e[0][0];
            vector3DArr[0].f517b = f679e[0][1];
            vector3DArr[0].f518c = f679e[0][2];
            vector3DArr[1].f516a = f679e[1][0];
            vector3DArr[1].f517b = f679e[1][1];
            vector3DArr[1].f518c = f679e[1][2];
            if (vector3DArr[0].f516a == 0.0f && vector3DArr[0].f517b == 0.0f && vector3DArr[0].f518c == 0.0f && vector3DArr[1].f516a == 0.0f && vector3DArr[1].f517b == 0.0f && vector3DArr[1].f518c == 0.0f) {
                Vector3D vector3D = vector3DArr[0];
                vector3DArr[1].f517b = 1.0f;
                vector3D.f516a = 1.0f;
            }
            vector3DArr[0].normalize(vector3DArr[0]);
            vector3DArr[2].cross(vector3DArr[0], vector3DArr[1]);
            vector3DArr[2].normalize(vector3DArr[2]);
            vector3DArr[1].cross(vector3DArr[2], vector3DArr[0]);
            float[] fArr3 = transform.f494b.m;
            fArr3[0] = vector3DArr[0].f516a;
            fArr3[4] = vector3DArr[1].f516a;
            fArr3[8] = vector3DArr[2].f516a;
            fArr3[1] = vector3DArr[0].f517b;
            fArr3[5] = vector3DArr[1].f517b;
            fArr3[9] = vector3DArr[2].f517b;
            fArr3[2] = vector3DArr[0].f518c;
            fArr3[6] = vector3DArr[1].f518c;
            fArr3[10] = vector3DArr[2].f518c;
            transform.f495c = (byte) 0;
            transform.f496d = (byte) 0;
            transform.f497e = (byte) 0;
        }
        if (i3 != 0) {
            ((C0083da) c0113l).f848j[0] = f680f[0];
            ((C0083da) c0113l).f848j[1] = f680f[1];
            ((C0083da) c0113l).f848j[2] = f680f[2];
        } else if ((i4 & 4) == 0) {
            transform.m269b(c0113l.f963d);
        } else {
            m406a(11, transform, f680f);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    static final boolean m409a(C0019ar[][] c0019arArr, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, int i, int i2, float[] fArr3) {
        float[] fArr4 = {0.0f, 0.0f, 0.0f, 0.0f};
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            C0037bi[] c0037biArr = c0019arArr[i3][i2].f681a;
            if (c0037biArr.length > 0 && c0037biArr[0] != null) {
                c0033beArr[i3][i2].f700b[0] = c0037biArr[0].m433a(fArr[i3][i2], c0033beArr[i3][i2].f699a, c0033beArr[i3][i2].f700b[0], f676b);
                m407a(c0037biArr[0].f722b, f676b, fArr2[i3][i2], fArr4);
                z = true;
            }
            c0033beArr[i3][i2].f699a = fArr[i3][i2];
        }
        if (z) {
            for (int i4 = 0; i4 < fArr3.length; i4++) {
                fArr3[i4] = fArr4[i4];
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    final boolean m410a(float f, float f2, C0033be c0033be, float[] fArr) {
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = z;
            if (i >= this.f681a.length) {
                return z2;
            }
            z = true;
            c0033be.f700b[i] = this.f681a[i].m433a(f, f2, c0033be.f700b[i], fArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m411a(C0113l c0113l, float f, float f2, C0033be c0033be, int i) {
        Transform transform = c0113l.f960a;
        Transform.m251e(transform, c0113l.f962c);
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < this.f681a.length) {
            C0037bi c0037bi = this.f681a[i2];
            c0033be.f700b[i2] = c0037bi.m433a(f, f2, c0033be.f700b[i2], f676b);
            if (c0037bi.f721a == 11) {
                i3 |= 4;
                if (i != 0) {
                    ((C0083da) c0113l).f848j[0] = f676b[0];
                    ((C0083da) c0113l).f848j[1] = f676b[1];
                    ((C0083da) c0113l).f848j[2] = f676b[2];
                } else {
                    m406a(c0037bi.f721a, transform, f676b);
                }
            } else {
                m406a(c0037bi.f721a, transform, f676b);
            }
            i2++;
            z = true;
        }
        if (i == 0 && (i3 & 4) == 0) {
            transform.m269b(c0113l.f963d);
        }
        return z;
    }
}
