package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public class Collision3D {
    public static final int ISHIT_NOT_FIGURE_GS = 2;
    public static final int ISHIT_NOT_INDEX_BUFFER_GS = 4;
    public static final int ISHIT_NOT_NODEDEFORMER_GS = 1;

    /* JADX INFO: renamed from: a */
    private static final float[] f188a = new float[1];

    /* JADX INFO: renamed from: b */
    private static final float[] f189b = new float[1];

    /* JADX INFO: renamed from: c */
    private static final C0105dw f190c = new C0105dw();

    /* JADX INFO: renamed from: d */
    private static final C0109h f191d = new C0109h();

    /* JADX INFO: renamed from: e */
    private static final C0102dt f192e = new C0102dt();

    /* JADX INFO: renamed from: f */
    private static final C0074cs f193f = new C0074cs();

    /* JADX INFO: renamed from: a */
    private static int m74a(Vector3D vector3D, Vector3D vector3D2, float f) {
        Vector3D vector3DM439a = null;
        try {
            vector3DM439a = C0046br.m439a();
            vector3DM439a.set(vector3D.f516a - vector3D2.f516a, vector3D.f517b - vector3D2.f517b, vector3D.f518c - vector3D2.f518c);
            float fDot = vector3DM439a.dot(vector3DM439a);
            if (fDot < f) {
                C0046br.m440a(vector3DM439a);
                return 2;
            }
            if (fDot == f) {
                C0046br.m440a(vector3DM439a);
                return 1;
            }
            C0046br.m440a(vector3DM439a);
            return 0;
        } catch (Throwable th) {
            C0046br.m440a(vector3DM439a);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0142  */
    /* JADX INFO: renamed from: a */
    static final void m75a(Figure figure, Transform transform, C0105dw c0105dw) {
        Vector3D vector3D;
        Vector3D vector3DM439a;
        Transform transformM442a;
        int i;
        int i2;
        try {
            transformM442a = C0055c.m442a();
            try {
                vector3DM439a = C0046br.m439a();
                try {
                    Vector3D vector3DM439a2 = C0046br.m439a();
                    try {
                        short s = figure.f223a;
                        int i3 = c0105dw.f927d;
                        if (transform == null) {
                            transformM442a.copy(c0105dw.f925b);
                        } else {
                            transformM442a.multiply(c0105dw.f925b, transform);
                        }
                        GeometricShape geometricShape = (c0105dw.f928e & 12) != 0 ? figure.f233s : null;
                        if (geometricShape != null) {
                            geometricShape.m135d(transformM442a);
                            geometricShape.m132a(vector3DM439a, f189b);
                            if (!m77a(vector3DM439a, f189b[0], c0105dw.f924a.f176c)) {
                                if (c0105dw.f926c != null) {
                                    int i4 = 0;
                                    while (i4 < s) {
                                        if (c0105dw.f926c.length > i3) {
                                            i2 = i3 + 1;
                                            c0105dw.f926c[i3] = figure.f224b[i4];
                                        } else {
                                            i2 = i3;
                                        }
                                        i4++;
                                        i3 = i2;
                                    }
                                } else {
                                    i3++;
                                }
                            }
                        } else {
                            int i5 = 0;
                            while (i5 < s) {
                                GeometricShape geometricShape2 = (c0105dw.f928e & 4) != 0 ? figure.f224b[i5].f349v : null;
                                if (geometricShape2 != null) {
                                    geometricShape2.m135d(transformM442a);
                                    geometricShape2.m132a(vector3DM439a, f189b);
                                    if (m77a(vector3DM439a, f189b[0], c0105dw.f924a.f176c)) {
                                        i = i3;
                                    } else if (c0105dw.f926c == null) {
                                        i = i3 + 1;
                                    } else if (c0105dw.f926c.length > i3) {
                                        i = i3 + 1;
                                        c0105dw.f926c[i3] = figure.f224b[i5];
                                    } else {
                                        i = i3;
                                    }
                                } else {
                                    VertexBuffer vertexBuffer = figure.f225c;
                                    IndexBuffer indexBuffer = figure.f224b[i5];
                                    int indexType = indexBuffer.getIndexType();
                                    if (indexType == 7) {
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
                                        vertexBuffer.m343d(transformM442a);
                                    }
                                    indexBuffer.m166a(vertexBuffer, vector3DM439a, vector3DM439a2);
                                    if (indexType != 7) {
                                        transformM442a.m262a(vector3DM439a, vector3DM439a);
                                        transformM442a.m262a(vector3DM439a2, vector3DM439a2);
                                    }
                                    float fDistance = vector3DM439a.distance(vector3DM439a2);
                                    if (m77a(vector3DM439a, fDistance, c0105dw.f924a.f176c)) {
                                        i = i3;
                                    } else if (c0105dw.f926c == null) {
                                        i = i3 + 1;
                                    } else if (c0105dw.f926c.length > i3) {
                                        c0105dw.f926c[i3] = figure.f224b[i5];
                                        if (transform != null) {
                                            transform.transPosition(vector3DM439a, vector3DM439a);
                                        }
                                        i = i3 + 1;
                                        c0105dw.f926c[i3].f350w.set(vector3DM439a, null, fDistance);
                                    } else {
                                        i = i3;
                                    }
                                }
                                i5++;
                                i3 = i;
                            }
                        }
                        c0105dw.f927d = i3;
                        C0055c.m443a(transformM442a);
                        C0046br.m440a(vector3DM439a);
                        C0046br.m440a(vector3DM439a2);
                    } catch (Throwable th) {
                        th = th;
                        vector3D = vector3DM439a2;
                        C0055c.m443a(transformM442a);
                        C0046br.m440a(vector3DM439a);
                        C0046br.m440a(vector3D);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    vector3D = null;
                }
            } catch (Throwable th3) {
                th = th3;
                vector3D = null;
                vector3DM439a = null;
            }
        } catch (Throwable th4) {
            th = th4;
            vector3D = null;
            vector3DM439a = null;
            transformM442a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    static final boolean m76a(Figure figure) {
        short s = figure.f223a;
        for (int i = 0; i < s; i++) {
            if (figure.f224b[i].f349v == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    static final boolean m77a(Vector3D vector3D, float f, Transform transform) {
        Vector3D vector3DM439a = null;
        try {
            vector3DM439a = C0046br.m439a();
            float[] fArr = transform.f494b.m;
            float f2 = vector3D.f516a;
            float f3 = vector3D.f517b;
            float f4 = vector3D.f518c;
            vector3DM439a.f516a = fArr[3] + fArr[0];
            vector3DM439a.f517b = fArr[7] + fArr[4];
            vector3DM439a.f518c = fArr[11] + fArr[8];
            if (((fArr[15] + fArr[12]) * vector3DM439a.m302a(vector3DM439a)) + (vector3DM439a.f516a * f2) + (vector3DM439a.f517b * f3) + (vector3DM439a.f518c * f4) + f < 0.0f) {
                C0046br.m440a(vector3DM439a);
                return true;
            }
            vector3DM439a.f516a = fArr[3] - fArr[0];
            vector3DM439a.f517b = fArr[7] - fArr[4];
            vector3DM439a.f518c = fArr[11] - fArr[8];
            if (((fArr[15] - fArr[12]) * vector3DM439a.m302a(vector3DM439a)) + (vector3DM439a.f516a * f2) + (vector3DM439a.f517b * f3) + (vector3DM439a.f518c * f4) + f < 0.0f) {
                C0046br.m440a(vector3DM439a);
                return true;
            }
            vector3DM439a.f516a = fArr[3] + fArr[1];
            vector3DM439a.f517b = fArr[7] + fArr[5];
            vector3DM439a.f518c = fArr[11] + fArr[9];
            if (((fArr[15] + fArr[13]) * vector3DM439a.m302a(vector3DM439a)) + (vector3DM439a.f516a * f2) + (vector3DM439a.f517b * f3) + (vector3DM439a.f518c * f4) + f < 0.0f) {
                C0046br.m440a(vector3DM439a);
                return true;
            }
            vector3DM439a.f516a = fArr[3] - fArr[1];
            vector3DM439a.f517b = fArr[7] - fArr[5];
            vector3DM439a.f518c = fArr[11] - fArr[9];
            if (((fArr[15] - fArr[13]) * vector3DM439a.m302a(vector3DM439a)) + (vector3DM439a.f516a * f2) + (vector3DM439a.f517b * f3) + (vector3DM439a.f518c * f4) + f < 0.0f) {
                C0046br.m440a(vector3DM439a);
                return true;
            }
            vector3DM439a.f516a = fArr[3] + fArr[2];
            vector3DM439a.f517b = fArr[7] + fArr[6];
            vector3DM439a.f518c = fArr[11] + fArr[10];
            if (((fArr[15] + fArr[14]) * vector3DM439a.m302a(vector3DM439a)) + (vector3DM439a.f516a * f2) + (vector3DM439a.f517b * f3) + (vector3DM439a.f518c * f4) + f < 0.0f) {
                C0046br.m440a(vector3DM439a);
                return true;
            }
            vector3DM439a.f516a = fArr[3] - fArr[2];
            vector3DM439a.f517b = fArr[7] - fArr[6];
            vector3DM439a.f518c = fArr[11] - fArr[10];
            if (((fArr[15] - fArr[14]) * vector3DM439a.m302a(vector3DM439a)) + (f2 * vector3DM439a.f516a) + (vector3DM439a.f517b * f3) + (vector3DM439a.f518c * f4) + f < 0.0f) {
                C0046br.m440a(vector3DM439a);
                return true;
            }
            C0046br.m440a(vector3DM439a);
            return false;
        } catch (Throwable th) {
            C0046br.m440a(vector3DM439a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    static final boolean m78a(Vector3D vector3D, float f, Vector3D vector3D2, float f2, boolean[] zArr) throws Throwable {
        Vector3D vector3D3;
        boolean z = true;
        try {
            Vector3D vector3DM439a = C0046br.m439a();
            try {
                vector3DM439a.set(vector3D.f516a - vector3D2.f516a, vector3D.f517b - vector3D2.f517b, vector3D.f518c - vector3D2.f518c);
                float fDot = vector3DM439a.dot(vector3DM439a);
                float f3 = f + f2;
                if (fDot > f3 * f3) {
                    z = false;
                } else if (zArr != null && zArr.length > 0) {
                    float f4 = f - f2;
                    if (fDot < f4 * f4) {
                        zArr[0] = true;
                    } else {
                        zArr[0] = false;
                    }
                }
                C0046br.m440a(vector3DM439a);
                return z;
            } catch (Throwable th) {
                th = th;
                vector3D3 = vector3DM439a;
                C0046br.m440a(vector3D3);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vector3D3 = null;
        }
    }

    /* JADX INFO: renamed from: a */
    static final boolean m79a(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, float f) throws Throwable {
        Vector3D vector3D4;
        try {
            Vector3D vector3DM439a = C0046br.m439a();
            try {
                vector3DM439a.set(vector3D.f516a - vector3D3.f516a, vector3D.f517b - vector3D3.f517b, vector3D.f518c - vector3D3.f518c);
                float fDot = vector3DM439a.dot(vector3DM439a) - (f * f);
                if (fDot <= 0.0f) {
                    C0046br.m440a(vector3DM439a);
                    return true;
                }
                float fDot2 = vector3DM439a.dot(vector3D2);
                if (0.0f < fDot2) {
                    C0046br.m440a(vector3DM439a);
                    return false;
                }
                if ((fDot2 * fDot2) - fDot < 0.0f) {
                    C0046br.m440a(vector3DM439a);
                    return false;
                }
                C0046br.m440a(vector3DM439a);
                return true;
            } catch (Throwable th) {
                th = th;
                vector3D4 = vector3DM439a;
                C0046br.m440a(vector3D4);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vector3D4 = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m80a(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, float f, Vector3D vector3D4) {
        float f2;
        Vector3D vector3DM439a = null;
        try {
            vector3DM439a = C0046br.m439a();
            float f3 = f * f;
            vector3DM439a.set(vector3D.f516a - vector3D3.f516a, vector3D.f517b - vector3D3.f517b, vector3D.f518c - vector3D3.f518c);
            float fDot = vector3DM439a.dot(vector3D2);
            float fDot2 = vector3DM439a.dot(vector3DM439a) - f3;
            if (0.0f < fDot2 && 0.0f < fDot) {
                return false;
            }
            float f4 = (fDot * fDot) - fDot2;
            if (f4 < 0.0f) {
                return false;
            }
            float fSqrt = Util3D.sqrt(f4);
            float f5 = (-fDot) - fSqrt;
            float f6 = (-fDot) + fSqrt;
            if (0.0f <= f5) {
                f2 = f5;
            } else {
                if (0.0f > f6) {
                    return false;
                }
                f2 = f6;
            }
            vector3D4.set(vector3D.f516a + (vector3D2.f516a * f2), vector3D.f517b + (vector3D2.f517b * f2), (f2 * vector3D2.f518c) + vector3D.f518c);
            return true;
        } finally {
            C0046br.m440a(vector3DM439a);
        }
    }

    /* JADX INFO: renamed from: a */
    static final boolean m81a(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, Vector3D vector3D4, float f) throws Throwable {
        Vector3D vector3D5 = null;
        Vector3D vector3D6 = null;
        try {
            Vector3D vector3DM439a = C0046br.m439a();
            try {
                Vector3D vector3DM439a2 = C0046br.m439a();
                float f2 = f * f;
                try {
                    if (m74a(vector3D, vector3D4, f2) == 2 && m74a(vector3D2, vector3D4, f2) == 2 && m74a(vector3D3, vector3D4, f2) == 2) {
                        C0046br.m440a(vector3DM439a);
                        C0046br.m440a(vector3DM439a2);
                        return true;
                    }
                    try {
                        Vector3D vector3DM439a3 = C0046br.m439a();
                        Vector3D vector3DM439a4 = C0046br.m439a();
                        Vector3D vector3DM439a5 = C0046br.m439a();
                        vector3DM439a3.set(vector3D2.f516a - vector3D.f516a, vector3D2.f517b - vector3D.f517b, vector3D2.f518c - vector3D.f518c);
                        vector3DM439a4.set(vector3D3.f516a - vector3D.f516a, vector3D3.f517b - vector3D.f517b, vector3D3.f518c - vector3D.f518c);
                        vector3DM439a5.set(vector3D4.f516a - vector3D.f516a, vector3D4.f517b - vector3D.f517b, vector3D4.f518c - vector3D.f518c);
                        float fDot = vector3DM439a3.dot(vector3DM439a5);
                        float fDot2 = vector3DM439a4.dot(vector3DM439a5);
                        if (fDot > 0.0f || fDot2 > 0.0f) {
                            vector3DM439a5.set(vector3D4.f516a - vector3D2.f516a, vector3D4.f517b - vector3D2.f517b, vector3D4.f518c - vector3D2.f518c);
                            float fDot3 = vector3DM439a3.dot(vector3DM439a5);
                            float fDot4 = vector3DM439a4.dot(vector3DM439a5);
                            if (0.0f > fDot3 || fDot4 > fDot3) {
                                float f3 = (fDot * fDot4) - (fDot3 * fDot2);
                                if (f3 > 0.0f || 0.0f > fDot || fDot3 > 0.0f) {
                                    vector3DM439a5.set(vector3D4.f516a - vector3D3.f516a, vector3D4.f517b - vector3D3.f517b, vector3D4.f518c - vector3D3.f518c);
                                    float fDot5 = vector3DM439a3.dot(vector3DM439a5);
                                    float fDot6 = vector3DM439a4.dot(vector3DM439a5);
                                    if (0.0f > fDot6 || fDot5 > fDot6) {
                                        float f4 = (fDot5 * fDot2) - (fDot * fDot6);
                                        if (f4 > 0.0f || 0.0f > fDot2 || fDot6 > 0.0f) {
                                            float f5 = (fDot3 * fDot6) - (fDot5 * fDot4);
                                            if (f5 > 0.0f || 0.0f > fDot4 - fDot3 || 0.0f > fDot5 - fDot6) {
                                                float f6 = 1.0f / ((f5 + f4) + f3);
                                                float f7 = f4 * f6;
                                                float f8 = f6 * f3;
                                                vector3DM439a2.set(vector3D.f516a + (vector3DM439a3.f516a * f7) + (vector3DM439a4.f516a * f8), vector3D.f517b + (vector3DM439a3.f517b * f7) + (vector3DM439a4.f517b * f8), (f7 * vector3DM439a3.f518c) + vector3D.f518c + (f8 * vector3DM439a4.f518c));
                                                C0046br.m440a(vector3DM439a3);
                                                C0046br.m440a(vector3DM439a4);
                                                C0046br.m440a(vector3DM439a5);
                                            } else {
                                                float f9 = (fDot4 - fDot3) / ((fDot4 - fDot3) + (fDot5 - fDot6));
                                                vector3DM439a2.set(vector3D2.f516a + ((vector3D3.f516a - vector3D2.f516a) * f9), vector3D2.f517b + ((vector3D3.f517b - vector3D2.f517b) * f9), (f9 * (vector3D3.f518c - vector3D2.f518c)) + vector3D2.f518c);
                                                C0046br.m440a(vector3DM439a3);
                                                C0046br.m440a(vector3DM439a4);
                                                C0046br.m440a(vector3DM439a5);
                                            }
                                        } else {
                                            float f10 = fDot2 / (fDot2 - fDot6);
                                            vector3DM439a2.set(vector3D.f516a + (vector3DM439a4.f516a * f10), vector3D.f517b + (vector3DM439a4.f517b * f10), (f10 * vector3DM439a4.f518c) + vector3D.f518c);
                                            C0046br.m440a(vector3DM439a3);
                                            C0046br.m440a(vector3DM439a4);
                                            C0046br.m440a(vector3DM439a5);
                                        }
                                    } else {
                                        vector3DM439a2.set(vector3D3.f516a, vector3D3.f517b, vector3D3.f518c);
                                        C0046br.m440a(vector3DM439a3);
                                        C0046br.m440a(vector3DM439a4);
                                        C0046br.m440a(vector3DM439a5);
                                    }
                                } else {
                                    float f11 = fDot / (fDot - fDot3);
                                    vector3DM439a2.set(vector3D.f516a + (vector3DM439a3.f516a * f11), vector3D.f517b + (vector3DM439a3.f517b * f11), (f11 * vector3DM439a3.f518c) + vector3D.f518c);
                                    C0046br.m440a(vector3DM439a3);
                                    C0046br.m440a(vector3DM439a4);
                                    C0046br.m440a(vector3DM439a5);
                                }
                            } else {
                                vector3DM439a2.set(vector3D2.f516a, vector3D2.f517b, vector3D2.f518c);
                                C0046br.m440a(vector3DM439a3);
                                C0046br.m440a(vector3DM439a4);
                                C0046br.m440a(vector3DM439a5);
                            }
                        } else {
                            vector3DM439a2.set(vector3D.f516a, vector3D.f517b, vector3D.f518c);
                            C0046br.m440a(vector3DM439a3);
                            C0046br.m440a(vector3DM439a4);
                            C0046br.m440a(vector3DM439a5);
                        }
                        vector3DM439a.set(vector3DM439a2.f516a - vector3D4.f516a, vector3DM439a2.f517b - vector3D4.f517b, vector3DM439a2.f518c - vector3D4.f518c);
                        if (vector3DM439a.dot(vector3DM439a) <= f2) {
                            C0046br.m440a(vector3DM439a);
                            C0046br.m440a(vector3DM439a2);
                            return true;
                        }
                        C0046br.m440a(vector3DM439a);
                        C0046br.m440a(vector3DM439a2);
                        return false;
                    } catch (Throwable th) {
                        C0046br.m440a(null);
                        C0046br.m440a(null);
                        C0046br.m440a(null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    vector3D6 = vector3DM439a2;
                    vector3D5 = vector3DM439a;
                    C0046br.m440a(vector3D5);
                    C0046br.m440a(vector3D6);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                vector3D5 = vector3DM439a;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static final boolean isHit(GeometricShape geometricShape, Figure figure, Transform transform, Transform transform2, GeometricShape[] geometricShapeArr, int[] iArr, int i) throws Throwable {
        Vector3D vector3DM439a;
        Transform transformM442a;
        float[] fArr = f188a;
        try {
            transformM442a = C0055c.m442a();
            try {
                vector3DM439a = C0046br.m439a();
                try {
                    if (geometricShape == null || figure == null) {
                        throw new NullPointerException();
                    }
                    if (geometricShape.f257a != 1) {
                        throw new IllegalArgumentException();
                    }
                    if (transform2 == null) {
                        transformM442a.setIdentity();
                        transform2 = transformM442a;
                    }
                    geometricShape.m131a(transform, vector3DM439a, fArr);
                    figure.m113a(figure, (TransformTree) null, transform2, 1);
                    f192e.f915a = vector3DM439a;
                    f192e.f916b = fArr[0];
                    f192e.f917c = geometricShapeArr;
                    f192e.f918d = 0;
                    f192e.f919e = i;
                    boolean zM120a = figure.m120a(f192e, true, 1);
                    if (iArr != null && iArr.length > 0) {
                        iArr[0] = f192e.f918d;
                    }
                    C0055c.m443a(transformM442a);
                    C0046br.m440a(vector3DM439a);
                    return zM120a;
                } catch (Throwable th) {
                    th = th;
                    C0055c.m443a(transformM442a);
                    C0046br.m440a(vector3DM439a);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                vector3DM439a = null;
            }
        } catch (Throwable th3) {
            th = th3;
            vector3DM439a = null;
            transformM442a = null;
        }
    }

    public static final boolean isHit(GeometricShape geometricShape, GeometricShape geometricShape2, Transform transform, Transform transform2, boolean[] zArr) throws Throwable {
        Vector3D vector3DM439a;
        Vector3D vector3DM439a2;
        float[] fArr = f188a;
        float[] fArr2 = f189b;
        try {
            vector3DM439a2 = C0046br.m439a();
            try {
                vector3DM439a = C0046br.m439a();
                try {
                    if (geometricShape == null || geometricShape2 == null) {
                        throw new NullPointerException();
                    }
                    if (geometricShape.f257a != 1 || geometricShape2.f257a != 1) {
                        throw new IllegalArgumentException();
                    }
                    geometricShape.m131a(transform, vector3DM439a2, fArr);
                    geometricShape2.m131a(transform2, vector3DM439a, fArr2);
                    boolean zM78a = m78a(vector3DM439a2, fArr[0], vector3DM439a, fArr2[0], zArr);
                    C0046br.m440a(vector3DM439a2);
                    C0046br.m440a(vector3DM439a);
                    return zM78a;
                } catch (Throwable th) {
                    th = th;
                    C0046br.m440a(vector3DM439a2);
                    C0046br.m440a(vector3DM439a);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                vector3DM439a = null;
            }
        } catch (Throwable th3) {
            th = th3;
            vector3DM439a = null;
            vector3DM439a2 = null;
        }
    }

    public static final boolean isHit(Vector3D vector3D, Vector3D vector3D2, Figure figure, Transform transform, GeometricShape[] geometricShapeArr, int[] iArr, int i) {
        try {
            Transform transformM442a = C0055c.m442a();
            if (vector3D == null || vector3D2 == null || figure == null) {
                throw new NullPointerException();
            }
            if (vector3D2.f516a == 0.0f && vector3D2.f517b == 0.0f && vector3D2.f518c == 0.0f) {
                throw new IllegalArgumentException();
            }
            if (transform == null) {
                transformM442a.setIdentity();
                transform = transformM442a;
            }
            figure.m113a(figure, (TransformTree) null, transform, 1);
            f191d.f952a = vector3D;
            f191d.f953b = vector3D2;
            f191d.f954c = geometricShapeArr;
            f191d.f955d = 0;
            f191d.f956e = i;
            boolean zM121a = figure.m121a(f191d, true, 1);
            if (iArr != null && iArr.length > 0) {
                iArr[0] = f191d.f955d;
            }
            C0055c.m443a(transformM442a);
            return zM121a;
        } catch (Throwable th) {
            C0055c.m443a(null);
            throw th;
        }
    }

    public static final boolean isHit(Vector3D vector3D, Vector3D vector3D2, GeometricShape geometricShape, Transform transform, Vector3D vector3D3) {
        float[] fArr = f188a;
        try {
            Vector3D vector3DM439a = C0046br.m439a();
            if (vector3D == null || vector3D2 == null || geometricShape == null) {
                throw new NullPointerException();
            }
            if (vector3D2.f516a == 0.0f && vector3D2.f517b == 0.0f && vector3D2.f518c == 0.0f) {
                throw new IllegalArgumentException();
            }
            if (geometricShape.f257a != 1) {
                throw new IllegalArgumentException();
            }
            geometricShape.m131a(transform, vector3DM439a, fArr);
            boolean zM80a = vector3D3 != null ? m80a(vector3D, vector3D2, vector3DM439a, fArr[0], vector3D3) : m79a(vector3D, vector3D2, vector3DM439a, fArr[0]);
            C0046br.m440a(vector3DM439a);
            return zM80a;
        } catch (Throwable th) {
            C0046br.m440a(null);
            throw th;
        }
    }

    public static final boolean isHit(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, Figure figure, Transform transform, GeometricShape[] geometricShapeArr, int[] iArr, int i) {
        try {
            Transform transformM442a = C0055c.m442a();
            if (vector3D == null || vector3D2 == null || vector3D3 == null || figure == null) {
                throw new NullPointerException();
            }
            if (transform == null) {
                transformM442a.setIdentity();
                transform = transformM442a;
            }
            figure.m113a(figure, (TransformTree) null, transform, 1);
            f193f.f813a = vector3D;
            f193f.f814b = vector3D2;
            f193f.f815c = vector3D3;
            f193f.f816d = geometricShapeArr;
            f193f.f817e = 0;
            f193f.f818f = i;
            boolean zM119a = figure.m119a(f193f, true, 1);
            if (iArr != null && iArr.length > 0) {
                iArr[0] = f193f.f817e;
            }
            C0055c.m443a(transformM442a);
            return zM119a;
        } catch (Throwable th) {
            C0055c.m443a(null);
            throw th;
        }
    }

    public static final boolean isHit(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, GeometricShape geometricShape, Transform transform) {
        float[] fArr = f188a;
        try {
            Vector3D vector3DM439a = C0046br.m439a();
            if (vector3D == null || vector3D2 == null || vector3D3 == null || geometricShape == null) {
                throw new NullPointerException();
            }
            if (geometricShape.f257a != 1) {
                throw new IllegalArgumentException();
            }
            geometricShape.m131a(transform, vector3DM439a, fArr);
            boolean zM81a = m81a(vector3D, vector3D2, vector3D3, vector3DM439a, fArr[0]);
            C0046br.m440a(vector3DM439a);
            return zM81a;
        } catch (Throwable th) {
            C0046br.m440a(null);
            throw th;
        }
    }

    public static final boolean isInViewVolume(Figure figure, Transform transform, Camera camera, Transform transform2, IndexBuffer[] indexBufferArr, int[] iArr, int i) throws Throwable {
        Transform transform3;
        Transform transform4 = null;
        try {
            Transform transformM442a = C0055c.m442a();
            try {
                if (figure == null || camera == null) {
                    throw new NullPointerException();
                }
                if (transform == null) {
                    transformM442a.setIdentity();
                    transform3 = transformM442a;
                } else {
                    transform3 = transform;
                }
                if (transform2 == null) {
                    f190c.f925b.setIdentity();
                } else {
                    f190c.f925b.setInvert(transform2);
                }
                f190c.f924a = camera;
                f190c.f926c = indexBufferArr;
                f190c.f927d = 0;
                f190c.f928e = i;
                figure.m113a(figure, (TransformTree) null, transform3, 1);
                figure.m117a((TransformTree) null, transform3, f190c, true, 1);
                if (iArr != null && iArr.length > 0) {
                    iArr[0] = f190c.f927d;
                }
                boolean z = f190c.f927d > 0;
                C0055c.m443a(transformM442a);
                return z;
            } catch (Throwable th) {
                th = th;
                transform4 = transformM442a;
                C0055c.m443a(transform4);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final boolean isInViewVolume(Figure figure, Transform transform, Camera camera, Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, IndexBuffer[] indexBufferArr, int[] iArr, int i) throws Throwable {
        Transform transform2;
        Transform transform3 = null;
        try {
            Transform transformM442a = C0055c.m442a();
            try {
                if (figure == null || camera == null || vector3D == null || vector3D2 == null || vector3D3 == null) {
                    throw new NullPointerException();
                }
                if (transform == null) {
                    transformM442a.setIdentity();
                    transform2 = transformM442a;
                } else {
                    transform2 = transform;
                }
                f190c.f925b.m263a(vector3D, vector3D2, vector3D3);
                f190c.f924a = camera;
                f190c.f926c = indexBufferArr;
                f190c.f927d = 0;
                f190c.f928e = i;
                figure.m113a(figure, (TransformTree) null, transform2, 1);
                figure.m117a((TransformTree) null, transform2, f190c, true, 1);
                if (iArr != null && iArr.length > 0) {
                    iArr[0] = f190c.f927d;
                }
                boolean z = f190c.f927d > 0;
                C0055c.m443a(transformM442a);
                return z;
            } catch (Throwable th) {
                th = th;
                transform3 = transformM442a;
                C0055c.m443a(transform3);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    public static final boolean isInViewVolume(VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Transform transform, Camera camera, Transform transform2, int i) throws Throwable {
        Vector3D vector3DM439a;
        Vector3D vector3DM439a2;
        Transform transformM442a;
        float fDistance;
        Transform transform3;
        try {
            transformM442a = C0055c.m442a();
            try {
                vector3DM439a2 = C0046br.m439a();
                try {
                    vector3DM439a = C0046br.m439a();
                    try {
                        if (vertexBuffer == null || indexBuffer == null || camera == null) {
                            throw new NullPointerException();
                        }
                        if (indexBuffer.f325L != vertexBuffer) {
                            if (!indexBuffer.m167a(vertexBuffer)) {
                                throw new IllegalArgumentException();
                            }
                            indexBuffer.f325L = vertexBuffer;
                        }
                        if (transform2 != null) {
                            transformM442a.setInvert(transform2);
                        } else {
                            transformM442a.setIdentity();
                        }
                        if (transform != null) {
                            transformM442a.multiply(transformM442a, transform);
                        }
                        GeometricShape geometricShape = (i & 4) != 0 ? indexBuffer.f349v : null;
                        if (geometricShape == null) {
                            int indexType = indexBuffer.getIndexType();
                            if (indexType == 7) {
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
                                vertexBuffer.m343d(transformM442a);
                            }
                            indexBuffer.m166a(vertexBuffer, vector3DM439a2, vector3DM439a);
                            fDistance = vector3DM439a2.distance(vector3DM439a);
                            if (indexType != 7) {
                                transformM442a.m267b(camera.f176c, transformM442a);
                                transform3 = transformM442a;
                            }
                            boolean z = m77a(vector3DM439a2, fDistance, transform3) ? false : true;
                            C0055c.m443a(transformM442a);
                            C0046br.m440a(vector3DM439a2);
                            C0046br.m440a(vector3DM439a);
                            return z;
                        }
                        geometricShape.m135d(transformM442a);
                        geometricShape.m132a(vector3DM439a2, f188a);
                        fDistance = f188a[0];
                        transform3 = camera.f176c;
                        if (m77a(vector3DM439a2, fDistance, transform3)) {
                        }
                        C0055c.m443a(transformM442a);
                        C0046br.m440a(vector3DM439a2);
                        C0046br.m440a(vector3DM439a);
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        C0055c.m443a(transformM442a);
                        C0046br.m440a(vector3DM439a2);
                        C0046br.m440a(vector3DM439a);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    vector3DM439a = null;
                }
            } catch (Throwable th3) {
                th = th3;
                vector3DM439a = null;
                vector3DM439a2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            vector3DM439a = null;
            vector3DM439a2 = null;
            transformM442a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    public static final boolean isInViewVolume(VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Transform transform, Camera camera, Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, int i) throws Throwable {
        Vector3D vector3DM439a;
        Vector3D vector3DM439a2;
        Transform transformM442a;
        float fDistance;
        Transform transform2;
        try {
            transformM442a = C0055c.m442a();
            try {
                vector3DM439a2 = C0046br.m439a();
                try {
                    vector3DM439a = C0046br.m439a();
                    try {
                        if (vertexBuffer == null || indexBuffer == null || camera == null || vector3D == null || vector3D2 == null || vector3D3 == null) {
                            throw new NullPointerException();
                        }
                        if (indexBuffer.f325L != vertexBuffer) {
                            if (!indexBuffer.m167a(vertexBuffer)) {
                                throw new IllegalArgumentException();
                            }
                            indexBuffer.f325L = vertexBuffer;
                        }
                        transformM442a.m263a(vector3D, vector3D2, vector3D3);
                        if (transform != null) {
                            transformM442a.multiply(transformM442a, transform);
                        }
                        GeometricShape geometricShape = (i & 4) != 0 ? indexBuffer.f349v : null;
                        if (geometricShape == null) {
                            int indexType = indexBuffer.getIndexType();
                            if (indexType == 7) {
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
                                vertexBuffer.m343d(transformM442a);
                            }
                            indexBuffer.m166a(vertexBuffer, vector3DM439a, vector3DM439a2);
                            fDistance = vector3DM439a.distance(vector3DM439a2);
                            if (indexType != 7) {
                                transformM442a.m267b(camera.f176c, transformM442a);
                                transform2 = transformM442a;
                            }
                            boolean z = m77a(vector3DM439a, fDistance, transform2) ? false : true;
                            C0055c.m443a(transformM442a);
                            C0046br.m440a(vector3DM439a2);
                            C0046br.m440a(vector3DM439a);
                            return z;
                        }
                        geometricShape.m135d(transformM442a);
                        geometricShape.m132a(vector3DM439a, f188a);
                        fDistance = f188a[0];
                        transform2 = camera.f176c;
                        if (m77a(vector3DM439a, fDistance, transform2)) {
                        }
                        C0055c.m443a(transformM442a);
                        C0046br.m440a(vector3DM439a2);
                        C0046br.m440a(vector3DM439a);
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        C0055c.m443a(transformM442a);
                        C0046br.m440a(vector3DM439a2);
                        C0046br.m440a(vector3DM439a);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    vector3DM439a = null;
                }
            } catch (Throwable th3) {
                th = th3;
                vector3DM439a = null;
                vector3DM439a2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            vector3DM439a = null;
            vector3DM439a2 = null;
            transformM442a = null;
        }
    }
}
