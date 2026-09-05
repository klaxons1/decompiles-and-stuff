package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.GraphicsOGL;
import com.docomostar.ui.ogl.math.Matrix4f;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Transform {
    public static final int ROTATE_EULER_XYZ = 0;
    public static final int ROTATE_EULER_XZY = 1;
    public static final int ROTATE_EULER_YXZ = 2;
    public static final int ROTATE_EULER_YZX = 3;
    public static final int ROTATE_EULER_ZXY = 4;
    public static final int ROTATE_EULER_ZYX = 5;

    /* JADX INFO: renamed from: a */
    static AbstractC0067cl[] f489a;

    /* JADX INFO: renamed from: f */
    private static float[] f490f = new float[4];

    /* JADX INFO: renamed from: g */
    private static final Transform f491g = new Transform();

    /* JADX INFO: renamed from: h */
    private static final Vector3D f492h = new Vector3D();

    /* JADX INFO: renamed from: i */
    private static final Vector3D f493i = new Vector3D();

    /* JADX INFO: renamed from: b */
    Matrix4f f494b = new Matrix4f();

    /* JADX INFO: renamed from: c */
    byte f495c;

    /* JADX INFO: renamed from: d */
    byte f496d;

    /* JADX INFO: renamed from: e */
    byte f497e;

    static {
        AbstractC0067cl[] abstractC0067clArr = new AbstractC0067cl[6];
        f489a = abstractC0067clArr;
        abstractC0067clArr[0] = new C0094dl();
        f489a[1] = new C0078cw();
        f489a[2] = new C0103du();
        f489a[3] = new C0064ci();
        f489a[4] = new C0121t();
        f489a[5] = new C0073cr();
    }

    public Transform() {
        setIdentity();
    }

    public Transform(float[] fArr) {
        set(fArr);
    }

    /* JADX INFO: renamed from: a */
    static final void m249a(Matrix4f matrix4f, Matrix4f matrix4f2) {
        float[] fArr = matrix4f2.m;
        float[] fArr2 = matrix4f.m;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        fArr2[4] = -fArr[4];
        fArr2[5] = -fArr[5];
        fArr2[6] = -fArr[6];
        fArr2[7] = -fArr[7];
        fArr2[8] = fArr[8];
        fArr2[9] = fArr[9];
        fArr2[10] = fArr[10];
        fArr2[11] = fArr[11];
        fArr2[12] = fArr[12];
        fArr2[13] = fArr[13];
        fArr2[14] = fArr[14];
        fArr2[15] = fArr[15];
    }

    /* JADX INFO: renamed from: a */
    static final void m250a(Transform transform, C0058cc c0058cc) {
        int[] iArr = c0058cc.f771a;
        float[] fArr = transform.f494b.m;
        fArr[0] = iArr[0] * 2.4414062E-4f;
        fArr[1] = iArr[1] * 2.4414062E-4f;
        fArr[2] = iArr[2] * 2.4414062E-4f;
        fArr[4] = iArr[3] * 2.4414062E-4f;
        fArr[5] = iArr[4] * 2.4414062E-4f;
        fArr[6] = iArr[5] * 2.4414062E-4f;
        fArr[8] = iArr[6] * 2.4414062E-4f;
        fArr[9] = iArr[7] * 2.4414062E-4f;
        fArr[10] = iArr[8] * 2.4414062E-4f;
        fArr[14] = 0.0f;
        fArr[13] = 0.0f;
        fArr[12] = 0.0f;
        fArr[11] = 0.0f;
        fArr[7] = 0.0f;
        fArr[3] = 0.0f;
        fArr[15] = 1.0f;
        transform.f495c = (byte) 0;
        transform.f496d = (byte) 0;
        transform.f497e = (byte) 0;
    }

    /* JADX INFO: renamed from: e */
    static final void m251e(Transform transform, Transform transform2) {
        float[] fArr = transform.f494b.m;
        float[] fArr2 = transform2.f494b.m;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
        fArr[4] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[6] = fArr2[6];
        fArr[7] = fArr2[7];
        fArr[8] = fArr2[8];
        fArr[9] = fArr2[9];
        fArr[10] = fArr2[10];
        fArr[11] = fArr2[11];
        fArr[12] = fArr2[12];
        fArr[13] = fArr2[13];
        fArr[14] = fArr2[14];
        fArr[15] = fArr2[15];
        transform.f495c = transform2.f495c;
        transform.f496d = transform2.f496d;
        transform.f497e = transform2.f497e;
    }

    /* JADX INFO: renamed from: f */
    static final void m252f(Transform transform, Transform transform2) {
        float[] fArr = transform.f494b.m;
        float[] fArr2 = transform2.f494b.m;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[4] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[6] = fArr2[6];
        fArr[8] = fArr2[8];
        fArr[9] = fArr2[9];
        fArr[10] = fArr2[10];
        transform.f495c = (byte) 0;
        transform.f496d = transform2.f496d;
        transform.f497e = transform2.f497e;
    }

    /* JADX INFO: renamed from: a */
    final float m253a() {
        float[] fArr = this.f494b.m;
        return ((((((fArr[0] * fArr[5]) * fArr[10]) - ((fArr[0] * fArr[9]) * fArr[6])) - ((fArr[4] * fArr[1]) * fArr[10])) + ((fArr[4] * fArr[9]) * fArr[2])) + ((fArr[8] * fArr[1]) * fArr[6])) - (fArr[2] * (fArr[8] * fArr[5]));
    }

    /* JADX INFO: renamed from: a */
    final void m254a(float f, float f2, float f3, float f4) {
        float[] fArr = this.f494b.m;
        float f5 = f4 - f3;
        float f6 = f2 * 0.5f;
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f2 <= 0.0f || f2 >= 0.5f) {
            throw new IllegalArgumentException();
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        float fCos = Util3D.cos(f6) / Util3D.sin(f6);
        fArr[0] = fCos / f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = fCos;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = (-(f3 + f4)) / f5;
        fArr[11] = -1.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = ((f3 * f4) / f5) * (-2.0f);
        fArr[15] = 0.0f;
        this.f495c = (byte) 0;
        this.f496d = (byte) 0;
        this.f497e = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    final void m255a(float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArr = this.f494b.m;
        float f7 = f2 - f;
        float f8 = f4 - f3;
        float f9 = f6 - f5;
        float f10 = 2.0f * f5;
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        fArr[0] = f10 / f7;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = f10 / f8;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = (f2 + f) / f7;
        fArr[9] = (f4 + f3) / f8;
        fArr[10] = (-(f5 + f6)) / f9;
        fArr[11] = -1.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = ((f5 * f6) / f9) * (-2.0f);
        fArr[15] = 0.0f;
        this.f495c = (byte) 0;
        this.f496d = (byte) 0;
        this.f497e = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    final void m256a(int i, int i2) {
        float[] fArr = this.f494b.m;
        if (i <= 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        if (i2 <= 0 || i2 > 32767) {
            throw new IllegalArgumentException();
        }
        fArr[0] = 2.0f / i;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 2.0f / i2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        this.f495c = (byte) 0;
        this.f496d = (byte) 0;
        this.f497e = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    final void m257a(int i, int i2, float f, float f2) {
        float[] fArr = this.f494b.m;
        float f3 = f2 - f;
        if (i <= 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        if (i2 <= 0 || i2 > 32767) {
            throw new IllegalArgumentException();
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        fArr[0] = 2.0f / i;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 2.0f / i2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = (-2.0f) / f3;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = -((f + f2) / f3);
        fArr[15] = 1.0f;
        this.f495c = (byte) 0;
        this.f496d = (byte) 0;
        this.f497e = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    final void m258a(int i, Vector3D vector3D) {
        f490f[0] = vector3D.f516a;
        f490f[1] = vector3D.f517b;
        f490f[2] = vector3D.f518c;
        f489a[4].mo457b(this, f490f);
        vector3D.f516a = f490f[0];
        vector3D.f517b = f490f[1];
        vector3D.f518c = f490f[2];
    }

    /* JADX INFO: renamed from: a */
    final void m259a(Transform transform) {
        m261a(this, transform);
    }

    /* JADX INFO: renamed from: a */
    final void m260a(Transform transform, float f) {
        float[] fArr = this.f494b.m;
        float[] fArr2 = transform.f494b.m;
        if (f == 0.0f) {
            throw new ArithmeticException();
        }
        float f2 = 1.0f / f;
        fArr[0] = ((fArr2[5] * fArr2[10]) - (fArr2[9] * fArr2[6])) * f2;
        fArr[4] = ((fArr2[8] * fArr2[6]) - (fArr2[4] * fArr2[10])) * f2;
        fArr[8] = ((fArr2[4] * fArr2[9]) - (fArr2[8] * fArr2[5])) * f2;
        fArr[12] = 0.0f;
        fArr[1] = ((fArr2[9] * fArr2[2]) - (fArr2[1] * fArr2[10])) * f2;
        fArr[5] = ((fArr2[0] * fArr2[10]) - (fArr2[8] * fArr2[2])) * f2;
        fArr[9] = ((fArr2[8] * fArr2[1]) - (fArr2[0] * fArr2[9])) * f2;
        fArr[13] = 0.0f;
        fArr[2] = ((fArr2[1] * fArr2[6]) - (fArr2[5] * fArr2[2])) * f2;
        fArr[6] = ((fArr2[4] * fArr2[2]) - (fArr2[0] * fArr2[6])) * f2;
        fArr[10] = ((fArr2[0] * fArr2[5]) - (fArr2[1] * fArr2[4])) * f2;
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        this.f495c = transform.f495c;
        this.f496d = transform.f496d;
        this.f497e = transform.f497e;
    }

    /* JADX INFO: renamed from: a */
    final void m261a(Transform transform, Transform transform2) {
        if (transform.m270b()) {
            m251e(this, transform2);
            return;
        }
        if (transform2.m270b()) {
            m251e(this, transform);
            return;
        }
        this.f494b.mul(transform.f494b, transform2.f494b);
        this.f495c = (byte) 0;
        if (transform.f496d == 1 && transform2.f496d == 1) {
            this.f496d = (byte) 1;
        } else {
            this.f496d = (byte) 0;
        }
        if (transform.f497e == 1 && transform2.f497e == 1) {
            this.f497e = (byte) 1;
        } else {
            this.f497e = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m262a(Vector3D vector3D, Vector3D vector3D2) {
        float[] fArr = this.f494b.m;
        float f = vector3D.f516a;
        float f2 = vector3D.f517b;
        float f3 = vector3D.f518c;
        vector3D2.f516a = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        vector3D2.f517b = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        vector3D2.f518c = fArr[14] + (f * fArr[2]) + (f2 * fArr[6]) + (fArr[10] * f3);
    }

    /* JADX INFO: renamed from: a */
    final void m263a(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3) {
        float[] fArr = this.f494b.m;
        float f = -vector3D.f516a;
        float f2 = -vector3D.f517b;
        float f3 = -vector3D.f518c;
        f493i.f516a = -vector3D2.f516a;
        f493i.f517b = -vector3D2.f517b;
        f493i.f518c = -vector3D2.f518c;
        f492h.normalize(f493i);
        fArr[2] = f492h.f516a;
        fArr[6] = f492h.f517b;
        fArr[10] = f492h.f518c;
        fArr[14] = (f492h.f516a * f) + (f492h.f517b * f2) + (f492h.f518c * f3);
        f492h.cross(vector3D3, f493i);
        f492h.normalize(f492h);
        fArr[0] = f492h.f516a;
        fArr[4] = f492h.f517b;
        fArr[8] = f492h.f518c;
        fArr[12] = (f492h.f516a * f) + (f492h.f517b * f2) + (f492h.f518c * f3);
        f492h.cross(f493i, f492h);
        f492h.normalize(f492h);
        fArr[1] = f492h.f516a;
        fArr[5] = f492h.f517b;
        fArr[9] = f492h.f518c;
        fArr[13] = (f * f492h.f516a) + (f2 * f492h.f517b) + (f492h.f518c * f3);
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        this.f495c = (byte) 0;
        this.f496d = (byte) 0;
        this.f497e = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    final void m264a(C0009ah c0009ah, GraphicsOGL graphicsOGL, int i) {
        c0009ah.m375a(graphicsOGL, this.f494b, i);
    }

    /* JADX INFO: renamed from: a */
    final void m265a(float[] fArr) {
        float[] fArr2 = this.f494b.m;
        fArr2[12] = fArr[0];
        fArr2[13] = fArr[1];
        fArr2[14] = fArr[2];
        this.f495c = (byte) 0;
    }

    /* JADX INFO: renamed from: b */
    final void m266b(Transform transform) {
        m251e(this, transform);
        this.f494b.invert();
    }

    /* JADX INFO: renamed from: b */
    final void m267b(Transform transform, Transform transform2) {
        if (transform.m270b()) {
            m251e(this, transform2);
            return;
        }
        if (transform2.m270b()) {
            m251e(this, transform);
            return;
        }
        this.f494b.mul(transform.f494b, transform2.f494b);
        this.f495c = (byte) 0;
        if (transform.f496d == 1 && transform2.f496d == 1) {
            this.f496d = (byte) 1;
        } else {
            this.f496d = (byte) 0;
        }
        if (transform.f497e == 1 && transform2.f497e == 1) {
            this.f497e = (byte) 1;
        } else {
            this.f497e = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m268b(Vector3D vector3D, Vector3D vector3D2) {
        float[] fArr = this.f494b.m;
        float f = vector3D.f516a;
        float f2 = vector3D.f517b;
        float f3 = vector3D.f518c;
        vector3D2.f516a = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3);
        vector3D2.f517b = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3);
        vector3D2.f518c = (fArr[10] * f3) + (f * fArr[2]) + (f2 * fArr[6]);
    }

    /* JADX INFO: renamed from: b */
    final void m269b(float[] fArr) {
        boolean z;
        float[] fArr2 = this.f494b.m;
        float f = fArr[0];
        if (f != 1.0f) {
            fArr2[0] = fArr2[0] * f;
            fArr2[1] = fArr2[1] * f;
            fArr2[2] = f * fArr2[2];
            z = true;
        } else {
            z = false;
        }
        float f2 = fArr[1];
        if (f2 != 1.0f) {
            fArr2[4] = fArr2[4] * f2;
            fArr2[5] = fArr2[5] * f2;
            fArr2[6] = f2 * fArr2[6];
            z = true;
        }
        float f3 = fArr[2];
        if (f3 != 1.0f) {
            fArr2[8] = fArr2[8] * f3;
            fArr2[9] = fArr2[9] * f3;
            fArr2[10] = fArr2[10] * f3;
            z = true;
        }
        if (z) {
            float fM288a = Util3D.m288a(f3);
            float fM288a2 = Util3D.m288a(fArr[0]) - fM288a;
            float fM288a3 = Util3D.m288a(fArr[1]) - fM288a;
            if (-0.003921569f >= fM288a2 || fM288a2 >= 0.003921569f || -0.003921569f >= fM288a3 || fM288a3 >= 0.003921569f) {
                this.f497e = (byte) 2;
            } else {
                this.f497e = (byte) 1;
            }
            this.f495c = (byte) 0;
            this.f496d = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: b */
    final boolean m270b() {
        if (this.f495c == 0) {
            float[] fArr = this.f494b.m;
            if (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
                this.f495c = (byte) 1;
                this.f496d = (byte) 1;
                this.f497e = (byte) 1;
            } else {
                this.f495c = (byte) 2;
            }
        }
        return this.f495c == 1;
    }

    /* JADX INFO: renamed from: c */
    final void m271c(Transform transform) {
        float[] fArr = this.f494b.m;
        float[] fArr2 = transform.f494b.m;
        fArr[12] = fArr[12] + fArr2[12];
        fArr[13] = fArr[13] + fArr2[13];
        fArr[14] = fArr2[14] + fArr[14];
        this.f495c = (byte) 0;
    }

    /* JADX INFO: renamed from: c */
    final void m272c(Transform transform, Transform transform2) {
        if (transform.m270b()) {
            m252f(this, transform2);
            return;
        }
        if (transform2.m270b()) {
            m252f(this, transform);
            return;
        }
        float[] fArr = transform.f494b.m;
        float[] fArr2 = transform2.f494b.m;
        float[] fArr3 = this.f494b.m;
        float f = (fArr[0] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[8] * fArr2[2]);
        float f2 = (fArr[0] * fArr2[4]) + (fArr[4] * fArr2[5]) + (fArr[8] * fArr2[6]);
        float f3 = (fArr[0] * fArr2[8]) + (fArr[4] * fArr2[9]) + (fArr[8] * fArr2[10]);
        float f4 = (fArr[1] * fArr2[0]) + (fArr[5] * fArr2[1]) + (fArr[9] * fArr2[2]);
        float f5 = (fArr[1] * fArr2[4]) + (fArr[5] * fArr2[5]) + (fArr[9] * fArr2[6]);
        float f6 = (fArr[1] * fArr2[8]) + (fArr[5] * fArr2[9]) + (fArr[9] * fArr2[10]);
        float f7 = (fArr[2] * fArr2[0]) + (fArr[6] * fArr2[1]) + (fArr[10] * fArr2[2]);
        float f8 = (fArr[2] * fArr2[4]) + (fArr[6] * fArr2[5]) + (fArr[10] * fArr2[6]);
        float f9 = (fArr[10] * fArr2[10]) + (fArr[2] * fArr2[8]) + (fArr[6] * fArr2[9]);
        fArr3[0] = f;
        fArr3[1] = f4;
        fArr3[2] = f7;
        fArr3[4] = f2;
        fArr3[5] = f5;
        fArr3[6] = f8;
        fArr3[8] = f3;
        fArr3[9] = f6;
        fArr3[10] = f9;
        this.f495c = (byte) 0;
        if (transform.f496d == 1 && transform2.f496d == 1) {
            this.f496d = (byte) 1;
        } else {
            this.f496d = (byte) 0;
        }
        if (transform.f497e == 1 && transform2.f497e == 1) {
            this.f497e = (byte) 1;
        } else {
            this.f497e = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: c */
    final void m273c(float[] fArr) {
        float[] fArr2 = this.f494b.m;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = f * f;
        float f5 = f2 * f2;
        if (f4 > 0.0f || f5 > 0.0f) {
            float f6 = (1.0f - f3) / (f4 + f5);
            float f7 = (-f) * f2 * f6;
            fArr2[0] = (f5 * f6) + f3;
            fArr2[4] = f7;
            fArr2[8] = f;
            fArr2[1] = f7;
            fArr2[5] = (f4 * f6) + f3;
            fArr2[9] = f2;
            fArr2[2] = -f;
            fArr2[6] = -f2;
            fArr2[10] = f3;
        } else {
            fArr2[0] = 1.0f;
            fArr2[4] = 0.0f;
            fArr2[8] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[5] = f3;
            fArr2[9] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[6] = 0.0f;
            fArr2[10] = f3;
        }
        this.f495c = (byte) 0;
        this.f496d = (byte) 1;
        this.f497e = (byte) 1;
    }

    /* JADX INFO: renamed from: c */
    final boolean m274c() {
        if (this.f496d == 0) {
            float[] fArr = this.f494b.m;
            float f = (fArr[0] * fArr[0]) + (fArr[1] * fArr[1]) + (fArr[2] * fArr[2]);
            float f2 = (fArr[4] * fArr[4]) + (fArr[5] * fArr[5]) + (fArr[6] * fArr[6]);
            float f3 = (fArr[10] * fArr[10]) + (fArr[8] * fArr[8]) + (fArr[9] * fArr[9]);
            float fM288a = Util3D.m288a(f) - 1.0f;
            float fM288a2 = Util3D.m288a(f2) - 1.0f;
            float fM288a3 = Util3D.m288a(f3) - 1.0f;
            if (-0.015625f >= fM288a || fM288a >= 0.015625f || -0.015625f >= fM288a2 || fM288a2 >= 0.015625f || -0.015625f >= fM288a3 || fM288a3 >= 0.015625f) {
                this.f496d = (byte) 2;
            } else {
                this.f496d = (byte) 1;
                this.f497e = (byte) 1;
            }
        }
        return this.f496d == 1;
    }

    public final void copy(Transform transform) {
        if (transform == null) {
            throw new NullPointerException();
        }
        m251e(this, transform);
    }

    /* JADX INFO: renamed from: d */
    final void m275d(Transform transform, Transform transform2) {
        float[] fArr = this.f494b.m;
        float[] fArr2 = transform.f494b.m;
        float[] fArr3 = transform2.f494b.m;
        float f = fArr2[12];
        float f2 = fArr2[13];
        float f3 = fArr2[14];
        fArr3[0] = 1.0f;
        fArr3[1] = 0.0f;
        fArr3[2] = 0.0f;
        fArr3[3] = 0.0f;
        fArr3[4] = 0.0f;
        fArr3[5] = 1.0f;
        fArr3[6] = 0.0f;
        fArr3[7] = 0.0f;
        fArr3[8] = 0.0f;
        fArr3[9] = 0.0f;
        fArr3[10] = 1.0f;
        fArr3[11] = 0.0f;
        fArr3[12] = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        fArr3[13] = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        fArr3[14] = fArr[14] + (f3 * fArr[10]) + (f * fArr[2]) + (f2 * fArr[6]);
        fArr3[15] = 1.0f;
        transform2.f495c = (byte) 0;
        transform2.f496d = (byte) 1;
        transform2.f497e = (byte) 1;
    }

    /* JADX INFO: renamed from: d */
    final boolean m276d() {
        if (this.f497e == 0) {
            float[] fArr = this.f494b.m;
            float f = (fArr[0] * fArr[0]) + (fArr[1] * fArr[1]) + (fArr[2] * fArr[2]);
            float f2 = (fArr[4] * fArr[4]) + (fArr[5] * fArr[5]) + (fArr[6] * fArr[6]);
            float f3 = (fArr[10] * fArr[10]) + (fArr[8] * fArr[8]) + (fArr[9] * fArr[9]);
            float fM288a = Util3D.m288a(f);
            float fM288a2 = Util3D.m288a(f2);
            float fM288a3 = Util3D.m288a(f3);
            float f4 = fM288a - fM288a3;
            float f5 = fM288a2 - fM288a3;
            if (-0.015625f >= f4 || f4 >= 0.015625f || -0.015625f >= f5 || f5 >= 0.015625f) {
                this.f497e = (byte) 2;
            } else {
                this.f497e = (byte) 1;
            }
        }
        return this.f497e == 1;
    }

    /* JADX INFO: renamed from: d */
    final boolean m277d(Transform transform) {
        float[] fArr = this.f494b.m;
        float[] fArr2 = transform.f494b.m;
        return fArr[0] == fArr2[0] && fArr[1] == fArr2[1] && fArr[2] == fArr2[2] && fArr[4] == fArr2[4] && fArr[5] == fArr2[5] && fArr[6] == fArr2[6] && fArr[8] == fArr2[8] && fArr[9] == fArr2[9] && fArr[10] == fArr2[10] && fArr[12] == fArr2[12] && fArr[13] == fArr2[13] && fArr[14] == fArr2[14];
    }

    public final void get(float[] fArr) {
        float[] fArr2 = this.f494b.m;
        if (fArr == null) {
            throw new NullPointerException();
        }
        if (fArr.length < 16) {
            throw new IllegalArgumentException();
        }
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[4];
        fArr[2] = fArr2[8];
        fArr[3] = fArr2[12];
        fArr[4] = fArr2[1];
        fArr[5] = fArr2[5];
        fArr[6] = fArr2[9];
        fArr[7] = fArr2[13];
        fArr[8] = fArr2[2];
        fArr[9] = fArr2[6];
        fArr[10] = fArr2[10];
        fArr[11] = fArr2[14];
        fArr[12] = fArr2[3];
        fArr[13] = fArr2[7];
        fArr[14] = fArr2[11];
        fArr[15] = fArr2[15];
    }

    public final void multiply(Transform transform) {
        if (transform == null) {
            throw new NullPointerException();
        }
        m261a(this, transform);
    }

    public final void multiply(Transform transform, Transform transform2) {
        if (transform == null || transform2 == null) {
            throw new NullPointerException();
        }
        m261a(transform, transform2);
    }

    public final void set(float[] fArr) {
        float[] fArr2 = this.f494b.m;
        if (fArr == null) {
            throw new NullPointerException();
        }
        if (fArr.length < 16) {
            throw new IllegalArgumentException();
        }
        fArr2[0] = fArr[0];
        fArr2[4] = fArr[1];
        fArr2[8] = fArr[2];
        fArr2[12] = fArr[3];
        fArr2[1] = fArr[4];
        fArr2[5] = fArr[5];
        fArr2[9] = fArr[6];
        fArr2[13] = fArr[7];
        fArr2[2] = fArr[8];
        fArr2[6] = fArr[9];
        fArr2[10] = fArr[10];
        fArr2[14] = fArr[11];
        fArr2[3] = fArr[12];
        fArr2[7] = fArr[13];
        fArr2[11] = fArr[14];
        fArr2[15] = fArr[15];
        this.f495c = (byte) 0;
        this.f496d = (byte) 0;
        this.f497e = (byte) 0;
    }

    public final void setIdentity() {
        this.f494b.setIdentity();
        this.f495c = (byte) 1;
        this.f496d = (byte) 1;
        this.f497e = (byte) 1;
    }

    public final void setInvert(Transform transform) {
        if (this != transform) {
            m266b(transform);
        } else {
            m251e(f491g, transform);
            m266b(f491g);
        }
    }

    public final void setRotate(Vector3D vector3D, float f) {
        float[] fArr = this.f494b.m;
        if (vector3D == null) {
            throw new NullPointerException();
        }
        if (f != 0.0f && vector3D.f516a == 0.0f && vector3D.f517b == 0.0f && vector3D.f518c == 0.0f) {
            throw new IllegalArgumentException();
        }
        f492h.normalize(vector3D);
        float f2 = f492h.f516a;
        float f3 = f492h.f517b;
        float f4 = f492h.f518c;
        float fCos = Util3D.cos(f);
        float fSin = Util3D.sin(f);
        float f5 = (1.0f - fCos) * f2;
        float f6 = (1.0f - fCos) * f3;
        float f7 = f2 * fSin;
        float f8 = f3 * fSin;
        float f9 = fSin * f4;
        fArr[0] = (f2 * f5) + fCos;
        fArr[4] = (f5 * f3) - f9;
        fArr[8] = (f5 * f4) + f8;
        fArr[12] = 0.0f;
        fArr[1] = f9 + (f5 * f3);
        fArr[5] = (f3 * f6) + fCos;
        fArr[9] = (f6 * f4) - f7;
        fArr[13] = 0.0f;
        fArr[2] = (f5 * f4) - f8;
        fArr[6] = (f6 * f4) + f7;
        fArr[10] = ((1.0f - fCos) * f4 * f4) + fCos;
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        this.f495c = (byte) 0;
        this.f496d = (byte) 1;
        this.f497e = (byte) 1;
    }

    public final void setRotateEuler(int i, Vector3D vector3D) {
        if (vector3D == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i > 5) {
            throw new IllegalArgumentException();
        }
        f490f[0] = vector3D.f516a;
        f490f[1] = vector3D.f517b;
        f490f[2] = vector3D.f518c;
        setIdentity();
        f489a[i].mo456a(this, f490f);
    }

    public final void setScale(float f, float f2, float f3) {
        float[] fArr = this.f494b.m;
        float fM288a = Util3D.m288a(f3);
        float fM288a2 = Util3D.m288a(f) - fM288a;
        float fM288a3 = Util3D.m288a(f2) - fM288a;
        setIdentity();
        fArr[0] = f;
        fArr[5] = f2;
        fArr[10] = f3;
        if (-0.003921569f >= fM288a2 || fM288a2 >= 0.003921569f || -0.003921569f >= fM288a3 || fM288a3 >= 0.003921569f) {
            this.f497e = (byte) 2;
        } else {
            this.f497e = (byte) 1;
        }
        this.f495c = (byte) 0;
        this.f496d = (byte) 0;
    }

    public final void setScale(Vector3D vector3D) {
        float[] fArr = this.f494b.m;
        float fM288a = Util3D.m288a(vector3D.f518c);
        float fM288a2 = Util3D.m288a(vector3D.f516a) - fM288a;
        float fM288a3 = Util3D.m288a(vector3D.f517b) - fM288a;
        setIdentity();
        fArr[0] = vector3D.f516a;
        fArr[5] = vector3D.f517b;
        fArr[10] = vector3D.f518c;
        if (-0.003921569f >= fM288a2 || fM288a2 >= 0.003921569f || -0.003921569f >= fM288a3 || fM288a3 >= 0.003921569f) {
            this.f497e = (byte) 2;
        } else {
            this.f497e = (byte) 1;
        }
        this.f495c = (byte) 0;
        this.f496d = (byte) 0;
    }

    public final void setTranslate(float f, float f2, float f3) {
        float[] fArr = this.f494b.m;
        setIdentity();
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = f3;
        this.f495c = (byte) 0;
    }

    public final void setTranslate(Vector3D vector3D) {
        float[] fArr = this.f494b.m;
        setIdentity();
        fArr[12] = vector3D.f516a;
        fArr[13] = vector3D.f517b;
        fArr[14] = vector3D.f518c;
        this.f495c = (byte) 0;
    }

    public final void setTranspose(Transform transform) {
        float[] fArr = transform.f494b.m;
        float[] fArr2 = this.f494b.m;
        if (transform == null) {
            throw new NullPointerException();
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        fArr2[0] = f;
        fArr2[1] = f5;
        fArr2[2] = f9;
        fArr2[3] = f13;
        fArr2[4] = f2;
        fArr2[5] = f6;
        fArr2[6] = f10;
        fArr2[7] = f14;
        fArr2[8] = f3;
        fArr2[9] = f7;
        fArr2[10] = f11;
        fArr2[11] = f15;
        fArr2[12] = f4;
        fArr2[13] = f8;
        fArr2[14] = f12;
        fArr2[15] = f16;
        this.f495c = transform.f495c;
        this.f496d = transform.f496d;
        this.f497e = transform.f497e;
    }

    public final void transPosition(Vector3D vector3D) {
        float[] fArr = this.f494b.m;
        if (vector3D == null) {
            throw new NullPointerException();
        }
        float f = vector3D.f516a;
        float f2 = vector3D.f517b;
        float f3 = vector3D.f518c;
        float f4 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        if (f4 == 0.0f) {
            throw new ArithmeticException();
        }
        float f5 = 1.0f / f4;
        vector3D.f516a = ((fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12]) * f5;
        vector3D.f517b = ((fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13]) * f5;
        vector3D.f518c = (fArr[14] + (f * fArr[2]) + (f2 * fArr[6]) + (fArr[10] * f3)) * f5;
    }

    public final void transPosition(Vector3D vector3D, Vector3D vector3D2) {
        float[] fArr = this.f494b.m;
        if (vector3D == null || vector3D2 == null) {
            throw new NullPointerException();
        }
        float f = vector3D.f516a;
        float f2 = vector3D.f517b;
        float f3 = vector3D.f518c;
        float f4 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        if (f4 == 0.0f) {
            throw new ArithmeticException();
        }
        float f5 = 1.0f / f4;
        vector3D2.f516a = ((fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12]) * f5;
        vector3D2.f517b = ((fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13]) * f5;
        vector3D2.f518c = (fArr[14] + (f * fArr[2]) + (f2 * fArr[6]) + (fArr[10] * f3)) * f5;
    }
}
