package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.ByteBuffer;
import com.docomostar.ui.ogl.FloatBuffer;
import com.docomostar.ui.ogl.ShortBuffer;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cj */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0065cj {

    /* JADX INFO: renamed from: a */
    private static final Vector3D f794a = new Vector3D();

    /* JADX INFO: renamed from: b */
    private final int f795b;

    /* JADX INFO: renamed from: c */
    private final int f796c;

    /* JADX INFO: renamed from: d */
    private final C0013al f797d;

    /* JADX INFO: renamed from: e */
    private float[] f798e;

    /* JADX INFO: renamed from: f */
    private short[] f799f;

    /* JADX INFO: renamed from: g */
    private byte[] f800g;

    /* JADX INFO: renamed from: h */
    private Object f801h;

    C0065cj(int i, int i2, C0013al c0013al) {
        this.f795b = i2;
        this.f796c = i;
        this.f797d = c0013al;
        switch (i2) {
            case 0:
                this.f798e = new float[c0013al.f643c * i];
                this.f801h = this.f798e;
                break;
            case 2:
                this.f799f = new short[c0013al.f643c * i];
                this.f801h = this.f799f;
                break;
            case 3:
                this.f800g = new byte[c0013al.f643c * i];
                this.f801h = this.f800g;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    final C0013al m458a() {
        return this.f797d;
    }

    /* JADX INFO: renamed from: a */
    final void m459a(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f797d.f643c * i;
        int i5 = this.f797d.f643c * i2;
        int i6 = this.f797d.f643c * i3;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f800g[i4 + i7] = bArr[i5 + i7];
        }
    }

    /* JADX INFO: renamed from: a */
    final void m460a(int i, float[] fArr, int i2, int i3) {
        int i4 = this.f797d.f643c * i;
        int i5 = this.f797d.f643c * i2;
        int i6 = this.f797d.f643c * i3;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f798e[i4 + i7] = fArr[i5 + i7];
        }
    }

    /* JADX INFO: renamed from: a */
    final void m461a(int i, short[] sArr, int i2, int i3) {
        int i4 = this.f797d.f643c * i;
        int i5 = this.f797d.f643c * i2;
        int i6 = this.f797d.f643c * i3;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f799f[i4 + i7] = sArr[i5 + i7];
        }
    }

    /* JADX INFO: renamed from: a */
    final void m462a(int i, short[] sArr, int i2, int i3, Transform transform) {
        int i4 = this.f797d.f643c * i;
        int i5 = this.f797d.f643c * i2;
        int i6 = this.f797d.f643c * i3;
        for (int i7 = 0; i7 < i6; i7 += 2) {
            f794a.set(sArr[i5 + i7], sArr[i5 + i7 + 1], 0.0f);
            transform.m262a(f794a, f794a);
            this.f798e[i4 + i7] = f794a.f516a;
            this.f798e[i4 + i7 + 1] = f794a.f517b;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m463a(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(this.f797d.f643c * i, this.f800g, 0, this.f797d.f643c * i2);
    }

    /* JADX INFO: renamed from: a */
    final void m464a(FloatBuffer floatBuffer, int i, int i2) {
        floatBuffer.put(this.f797d.f643c * i, this.f798e, 0, this.f797d.f643c * i2);
    }

    /* JADX INFO: renamed from: a */
    final void m465a(ShortBuffer shortBuffer, int i, int i2) {
        shortBuffer.put(this.f797d.f643c * i, this.f799f, 0, this.f797d.f643c * i2);
    }

    /* JADX INFO: renamed from: b */
    final int m466b() {
        return this.f796c;
    }

    /* JADX INFO: renamed from: b */
    final void m467b(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f797d.f643c * i;
        int i5 = this.f797d.f643c * i2;
        int i6 = this.f797d.f643c * i3;
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i5 + i7] = this.f800g[i4 + i7];
        }
    }

    /* JADX INFO: renamed from: b */
    final void m468b(int i, float[] fArr, int i2, int i3) {
        int i4 = this.f797d.f643c * i;
        int i5 = this.f797d.f643c * i2;
        int i6 = this.f797d.f643c * i3;
        for (int i7 = 0; i7 < i6; i7++) {
            fArr[i5 + i7] = this.f798e[i4 + i7];
        }
    }

    /* JADX INFO: renamed from: b */
    final void m469b(int i, short[] sArr, int i2, int i3) {
        int i4 = this.f797d.f643c * i;
        int i5 = this.f797d.f643c * i2;
        int i6 = this.f797d.f643c * i3;
        for (int i7 = 0; i7 < i6; i7++) {
            sArr[i5 + i7] = this.f799f[i4 + i7];
        }
    }

    /* JADX INFO: renamed from: c */
    final int m470c() {
        int i = 1;
        switch (this.f795b) {
            case 0:
                i = 4;
                break;
            case 2:
                i = 2;
                break;
        }
        return i * this.f797d.f643c * this.f796c;
    }

    /* JADX INFO: renamed from: d */
    final float[] m471d() {
        return this.f798e;
    }

    /* JADX INFO: renamed from: e */
    final short[] m472e() {
        return this.f799f;
    }

    /* JADX INFO: renamed from: f */
    final byte[] m473f() {
        return this.f800g;
    }

    /* JADX INFO: renamed from: g */
    final Object m474g() {
        return this.f801h;
    }
}
