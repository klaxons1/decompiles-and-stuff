package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Vector3D {

    /* JADX INFO: renamed from: a */
    float f516a;

    /* JADX INFO: renamed from: b */
    float f517b;

    /* JADX INFO: renamed from: c */
    float f518c;

    public Vector3D() {
        this.f516a = 0.0f;
        this.f517b = 0.0f;
        this.f518c = 0.0f;
    }

    public Vector3D(float f, float f2, float f3) {
        this.f516a = f;
        this.f517b = f2;
        this.f518c = f3;
    }

    public Vector3D(Vector3D vector3D) {
        this.f516a = vector3D.f516a;
        this.f517b = vector3D.f517b;
        this.f518c = vector3D.f518c;
    }

    public static final float length(float f, float f2, float f3) {
        return Util3D.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    /* JADX INFO: renamed from: a */
    final float m302a(Vector3D vector3D) {
        float f = vector3D.f516a;
        float f2 = vector3D.f517b;
        float f3 = vector3D.f518c;
        float fSqrt = Util3D.sqrt((f * f) + (f2 * f2) + (f3 * f3));
        if (fSqrt == 0.0f) {
            this.f516a = 0.0f;
            this.f517b = 0.0f;
            this.f518c = 1.0f;
            return 1.0f;
        }
        float f4 = 1.0f / fSqrt;
        this.f516a = f * f4;
        this.f517b = f2 * f4;
        this.f518c = f3 * f4;
        return f4;
    }

    public final void add(Vector3D vector3D, Vector3D vector3D2) {
        this.f516a = vector3D.f516a + vector3D2.f516a;
        this.f517b = vector3D.f517b + vector3D2.f517b;
        this.f518c = vector3D.f518c + vector3D2.f518c;
    }

    public final void cross(Vector3D vector3D) {
        cross(this, vector3D);
    }

    public final void cross(Vector3D vector3D, Vector3D vector3D2) {
        float f = (vector3D.f517b * vector3D2.f518c) - (vector3D.f518c * vector3D2.f517b);
        float f2 = (vector3D.f518c * vector3D2.f516a) - (vector3D.f516a * vector3D2.f518c);
        float f3 = (vector3D.f516a * vector3D2.f517b) - (vector3D.f517b * vector3D2.f516a);
        this.f516a = f;
        this.f517b = f2;
        this.f518c = f3;
    }

    public final float distance(Vector3D vector3D) {
        float f = this.f516a - vector3D.f516a;
        float f2 = this.f517b - vector3D.f517b;
        float f3 = this.f518c - vector3D.f518c;
        return Util3D.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    public final float dot(Vector3D vector3D) {
        return (this.f516a * vector3D.f516a) + (this.f517b * vector3D.f517b) + (this.f518c * vector3D.f518c);
    }

    public final float getX() {
        return this.f516a;
    }

    public final float getY() {
        return this.f517b;
    }

    public final float getZ() {
        return this.f518c;
    }

    public final void mul(Vector3D vector3D, float f) {
        this.f516a = vector3D.f516a * f;
        this.f517b = vector3D.f517b * f;
        this.f518c = vector3D.f518c * f;
    }

    public final void normalize(Vector3D vector3D) {
        float f = vector3D.f516a;
        float f2 = vector3D.f517b;
        float f3 = vector3D.f518c;
        float fSqrt = Util3D.sqrt((f * f) + (f2 * f2) + (f3 * f3));
        if (fSqrt == 0.0f) {
            this.f516a = 0.0f;
            this.f517b = 0.0f;
            this.f518c = 1.0f;
        } else {
            float f4 = 1.0f / fSqrt;
            this.f516a = f * f4;
            this.f517b = f2 * f4;
            this.f518c = f3 * f4;
        }
    }

    public final void set(float f, float f2, float f3) {
        this.f516a = f;
        this.f517b = f2;
        this.f518c = f3;
    }

    public final void set(Vector3D vector3D) {
        this.f516a = vector3D.f516a;
        this.f517b = vector3D.f517b;
        this.f518c = vector3D.f518c;
    }

    public final void sub(Vector3D vector3D, Vector3D vector3D2) {
        this.f516a = vector3D.f516a - vector3D2.f516a;
        this.f517b = vector3D.f517b - vector3D2.f517b;
        this.f518c = vector3D.f518c - vector3D2.f518c;
    }
}
