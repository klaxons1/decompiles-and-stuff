package p000;

import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
public final class C0012m {

    /* JADX INFO: renamed from: a */
    private static short f465a;

    /* JADX INFO: renamed from: a */
    private static byte[] f466a;

    /* JADX INFO: renamed from: a */
    private static short[] f468a;

    /* JADX INFO: renamed from: b */
    private static short[] f470b;

    /* JADX INFO: renamed from: d */
    private static short[] f472d;

    /* JADX INFO: renamed from: a */
    private static final int[][][] f469a = {new int[][]{new int[]{-14798569, -13093841}, new int[]{-11381148, -12501189}}, new int[][]{new int[]{-13025506, -12698047}, new int[]{-15327216, -15461355}}};

    /* JADX INFO: renamed from: a */
    private static final int[] f467a = {-10526976, -14403011, -12172288, -13421773};

    /* JADX INFO: renamed from: c */
    private static short[] f471c = {9, 376, 250, 355, 319, 146, 363, 17, 154, 285, 324, 298, 199, 397, 3, 239, 338, 261, 117, 188};

    /* JADX INFO: renamed from: a */
    static final C0005f m216a() {
        f472d = new short[180];
        short[] sArrM223a = m223a(0.0f);
        VertexArray vertexArray = new VertexArray(sArrM223a.length / 3, 3, 2);
        vertexArray.set(0, sArrM223a.length / 3, sArrM223a);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 0.005f, (float[]) null);
        vertexBuffer.setDefaultColor(-3355444);
        int[] iArr = new int[60];
        for (int i = 0; i < 60; i++) {
            iArr[i] = i;
        }
        int[] iArr2 = new int[20];
        for (int i2 = 0; i2 < 20; i2++) {
            iArr2[i2] = 3;
        }
        return new C0005f(vertexBuffer, new TriangleStripArray(iArr, iArr2), 55, 0);
    }

    /* JADX INFO: renamed from: a */
    static final C0005f m217a(byte[] bArr) {
        VertexArray vertexArray = new VertexArray(10, 3, 1);
        vertexArray.set(0, 10, bArr);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 0.06153846f, (float[]) null);
        VertexArray vertexArray2 = new VertexArray(10, 2, 1);
        vertexArray2.set(0, 10, new byte[]{2, 0, 2, 32, 0, 0, 0, 32, 16, 0, 16, 32, 16, 32, 32, 32, 16, 0, 32, 0});
        vertexBuffer.setTexCoords(0, vertexArray2, 0.03125f, (float[]) null);
        return new C0005f(vertexBuffer, new TriangleStripArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{6, 4}), 4, 20);
    }

    /* JADX INFO: renamed from: a */
    static void m218a() {
        f468a = null;
        f470b = null;
        f466a = null;
        f472d = null;
    }

    /* JADX INFO: renamed from: a */
    static final void m219a(C0005f c0005f, float f) {
        c0005f.m60a().getVertexBuffer().getPositions((float[]) null).set(0, 60, m223a(f));
    }

    /* JADX INFO: renamed from: a */
    static void m220a(C0005f c0005f, int i) {
        c0005f.m60a().getVertexBuffer().setDefaultColor(f469a[C0013n.f516d - 1][C0013n.f531f - 1][i]);
    }

    /* JADX INFO: renamed from: a */
    static void m221a(C0005f c0005f, int i, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        short s;
        short s2;
        short s3;
        short s4;
        short s5;
        short s6;
        int i2 = z ? i - 4 : i - 2;
        float f10 = 999999.0f;
        float f11 = 999999.0f;
        float f12 = 999999.0f;
        for (int i3 = 0; i3 < f466a.length * 6; i3++) {
            int i4 = (i2 * 6) + i3;
            if (i4 < 0) {
                i4 += C0013n.f537g * 6;
            } else if (i4 >= C0013n.f537g * 6) {
                i4 -= C0013n.f537g * 6;
            }
            if (C0013n.f486a[0][C0013n.f515c[i4]] < f10) {
                f10 = C0013n.f486a[0][C0013n.f515c[i4]];
            }
            if (C0013n.f486a[1][C0013n.f515c[i4]] < f11) {
                f11 = C0013n.f486a[1][C0013n.f515c[i4]];
            }
            if (C0013n.f486a[2][C0013n.f515c[i4]] < f12) {
                f12 = C0013n.f486a[2][C0013n.f515c[i4]];
            }
        }
        C0013n.f477a.m144a();
        C0013n.f477a.m146a(f10, f11, f12);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < f466a.length; i8++) {
            int i9 = 0;
            while (i9 < 2) {
                int i10 = (i2 * 6) + (i7 * 3);
                int i11 = i10 < 0 ? i10 + (C0013n.f537g * 6) : i10 >= C0013n.f537g * 6 ? i10 - (C0013n.f537g * 6) : i10;
                int i12 = (i2 * 12) + (i7 * 6);
                int i13 = i12 < 0 ? i12 + (C0013n.f537g * 12) : i12 >= C0013n.f537g * 12 ? i12 - (C0013n.f537g * 12) : i12;
                int i14 = i7 + 1;
                if (i9 == 0) {
                    f7 = C0013n.f486a[0][C0013n.f515c[i11]];
                    f8 = C0013n.f486a[1][C0013n.f515c[i11]];
                    f9 = C0013n.f486a[2][C0013n.f515c[i11]];
                    f4 = C0013n.f486a[0][C0013n.f515c[i11 + 1]];
                    f5 = C0013n.f486a[1][C0013n.f515c[i11 + 1]];
                    f6 = C0013n.f486a[2][C0013n.f515c[i11 + 1]];
                    f = C0013n.f486a[0][C0013n.f515c[i11 + 2]];
                    f2 = C0013n.f486a[1][C0013n.f515c[i11 + 2]];
                    f3 = C0013n.f486a[2][C0013n.f515c[i11 + 2]];
                    s5 = C0013n.f524d[i13];
                    s6 = C0013n.f524d[i13 + 1];
                    s3 = C0013n.f524d[i13 + 2];
                    s4 = C0013n.f524d[i13 + 3];
                    s = C0013n.f524d[i13 + 4];
                    s2 = C0013n.f524d[i13 + 5];
                } else {
                    f = C0013n.f486a[0][C0013n.f515c[i11]];
                    f2 = C0013n.f486a[1][C0013n.f515c[i11]];
                    f3 = C0013n.f486a[2][C0013n.f515c[i11]];
                    f4 = C0013n.f486a[0][C0013n.f515c[i11 + 1]];
                    f5 = C0013n.f486a[1][C0013n.f515c[i11 + 1]];
                    f6 = C0013n.f486a[2][C0013n.f515c[i11 + 1]];
                    f7 = C0013n.f486a[0][C0013n.f515c[i11 + 2]];
                    f8 = C0013n.f486a[1][C0013n.f515c[i11 + 2]];
                    f9 = C0013n.f486a[2][C0013n.f515c[i11 + 2]];
                    s = C0013n.f524d[i13];
                    s2 = C0013n.f524d[i13 + 1];
                    s3 = C0013n.f524d[i13 + 2];
                    s4 = C0013n.f524d[i13 + 3];
                    s5 = C0013n.f524d[i13 + 4];
                    s6 = C0013n.f524d[i13 + 5];
                }
                int i15 = 1;
                int i16 = i6;
                int i17 = i5;
                while (i15 <= f466a[i8]) {
                    short[] sArr = f468a;
                    short s7 = (short) ((((((f7 - f) * i15) / f466a[i8]) + f) - f10) * 45.0f);
                    sArr[i17] = s7;
                    short s8 = (short) ((((((f8 - f2) * i15) / f466a[i8]) + f2) - f11) * 45.0f);
                    f468a[i17 + 1] = s8;
                    short s9 = (short) ((((((f9 - f3) * i15) / f466a[i8]) + f3) - f12) * 45.0f);
                    f468a[i17 + 2] = s9;
                    i17 += 3;
                    short[] sArr2 = f470b;
                    short s10 = (short) ((((s5 - s) * i15) / f466a[i8]) + s);
                    sArr2[i16] = s10;
                    short s11 = (short) ((((s6 - s2) * i15) / f466a[i8]) + s2);
                    f470b[i16 + 1] = s11;
                    int i18 = i16 + 2;
                    if (i15 == 1) {
                        f468a[i17] = (short) ((f - f10) * 45.0f);
                        f468a[i17 + 1] = (short) ((f2 - f11) * 45.0f);
                        f468a[i17 + 2] = (short) ((f3 - f12) * 45.0f);
                        int i19 = i17 + 3;
                        f470b[i18] = s;
                        f470b[i18 + 1] = s2;
                        int i20 = i18 + 2;
                        f468a[i19] = (short) (((((f4 - f) / f466a[i8]) + f) - f10) * 45.0f);
                        f468a[i19 + 1] = (short) (((((f5 - f2) / f466a[i8]) + f2) - f11) * 45.0f);
                        f468a[i19 + 2] = (short) (((((f6 - f3) / f466a[i8]) + f3) - f12) * 45.0f);
                        i17 = i19 + 3;
                        f470b[i20] = (short) (((s3 - s) / f466a[i8]) + s);
                        f470b[i20 + 1] = (short) (((s4 - s2) / f466a[i8]) + s2);
                        i18 = i20 + 2;
                    } else {
                        short s12 = (short) ((((((f4 - f) * i15) / f466a[i8]) + f) - f10) * 45.0f);
                        short s13 = (short) ((((((f5 - f2) * i15) / f466a[i8]) + f2) - f11) * 45.0f);
                        short s14 = (short) ((((((f6 - f3) * i15) / f466a[i8]) + f3) - f12) * 45.0f);
                        short s15 = (short) ((((s3 - s) * i15) / f466a[i8]) + s);
                        short s16 = (short) ((((s4 - s2) * i15) / f466a[i8]) + s2);
                        for (int i21 = 0; i21 < i15; i21++) {
                            f468a[i17] = (short) ((((s12 - s7) * i21) / (i15 - 1)) + s7);
                            f468a[i17 + 1] = (short) ((((s13 - s8) * i21) / (i15 - 1)) + s8);
                            f468a[i17 + 2] = (short) ((((s14 - s9) * i21) / (i15 - 1)) + s9);
                            i17 += 3;
                            f470b[i18] = (short) ((((s15 - s10) * i21) / (i15 - 1)) + s10);
                            f470b[i18 + 1] = (short) ((((s16 - s11) * i21) / (i15 - 1)) + s11);
                            i18 += 2;
                        }
                    }
                    i15++;
                    i16 = i18;
                }
                i9++;
                i7 = i14;
                i6 = i16;
                i5 = i17;
            }
        }
        c0005f.m60a().getVertexBuffer().getPositions((float[]) null).set(0, f468a.length / 3, f468a);
        c0005f.m60a().getVertexBuffer().getTexCoords(0, (float[]) null).set(0, f470b.length / 2, f470b);
    }

    /* JADX INFO: renamed from: a */
    static final void m222a(C0005f c0005f, byte[] bArr) {
        c0005f.m60a().getVertexBuffer().getPositions((float[]) null).set(0, 10, bArr);
    }

    /* JADX INFO: renamed from: a */
    private static short[] m223a(float f) {
        for (int i = 0; i < 20; i++) {
            int i2 = (C0013n.f539h == 2 ? -((int) (C0004e.f126a * 1.7f)) : (int) (C0004e.f126a * 1.7f)) + (((i * 300) / 20) - 150);
            while (i2 < -150) {
                i2 += 300;
            }
            while (i2 > 150) {
                i2 -= 300;
            }
            int i3 = (int) ((180.0f - (365.0f * f)) - f471c[i]);
            while (i3 < -185) {
                i3 += 365;
            }
            if (i3 < 0) {
                i2 = (int) (i2 * (1.0f - ((C0007h.f267r * (i3 / 180.0f)) / 30.0f)));
            }
            int i4 = ((i3 + 180) / 2) % 10;
            if (i4 < 3) {
                f472d[i * 3 * 3] = (short) i2;
                f472d[(i * 3 * 3) + 1] = (short) (i3 + 5);
                f472d[(i * 3 * 3) + 2] = 0;
                f472d[(i * 3 * 3) + 3] = (short) (i2 - 2);
                f472d[(i * 3 * 3) + 4] = (short) i3;
                f472d[(i * 3 * 3) + 5] = 0;
                f472d[(i * 3 * 3) + 6] = (short) (i2 + 2);
                f472d[(i * 3 * 3) + 7] = (short) i3;
                f472d[(i * 3 * 3) + 8] = 0;
            } else if (i4 < 5) {
                f472d[i * 3 * 3] = (short) (i2 - 5);
                f472d[(i * 3 * 3) + 1] = (short) i3;
                f472d[(i * 3 * 3) + 2] = 0;
                f472d[(i * 3 * 3) + 3] = (short) i2;
                f472d[(i * 3 * 3) + 4] = (short) (i3 - 2);
                f472d[(i * 3 * 3) + 5] = 0;
                f472d[(i * 3 * 3) + 6] = (short) i2;
                f472d[(i * 3 * 3) + 7] = (short) (i3 + 2);
                f472d[(i * 3 * 3) + 8] = 0;
            } else if (i4 < 8) {
                f472d[i * 3 * 3] = (short) (i2 - 2);
                f472d[(i * 3 * 3) + 1] = (short) i3;
                f472d[(i * 3 * 3) + 2] = 0;
                f472d[(i * 3 * 3) + 3] = (short) i2;
                f472d[(i * 3 * 3) + 4] = (short) (i3 - 5);
                f472d[(i * 3 * 3) + 5] = 0;
                f472d[(i * 3 * 3) + 6] = (short) (i2 + 2);
                f472d[(i * 3 * 3) + 7] = (short) i3;
                f472d[(i * 3 * 3) + 8] = 0;
            } else {
                f472d[i * 3 * 3] = (short) i2;
                f472d[(i * 3 * 3) + 1] = (short) (i3 + 2);
                f472d[(i * 3 * 3) + 2] = 0;
                f472d[(i * 3 * 3) + 3] = (short) i2;
                f472d[(i * 3 * 3) + 4] = (short) (i3 - 2);
                f472d[(i * 3 * 3) + 5] = 0;
                f472d[(i * 3 * 3) + 6] = (short) (i2 + 5);
                f472d[(i * 3 * 3) + 7] = (short) i3;
                f472d[(i * 3 * 3) + 8] = 0;
            }
        }
        return f472d;
    }

    /* JADX INFO: renamed from: b */
    static C0005f m224b() {
        byte[] bArr = {-6, 0, 0, -3, 0, 6, -3, 0, -6, 3, 0, 6, 3, 0, -6, 6, 0, 0};
        VertexArray vertexArray = new VertexArray(bArr.length / 3, 3, 1);
        vertexArray.set(0, bArr.length / 3, bArr);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 1.0f, (float[]) null);
        vertexBuffer.setDefaultColor(1996488704);
        return new C0005f(vertexBuffer, new TriangleStripArray(new int[]{0, 1, 2, 3, 4, 5}, new int[]{6}), 4, 64);
    }

    /* JADX INFO: renamed from: c */
    static C0005f m225c() {
        byte[] bArr = C0013n.f531f == 1 ? new byte[]{1, 1, 0, -1, 1, 0, 1, -1, 0, -1, -1, 0} : new byte[]{2, 2, 0, -2, 2, 0, 2, -7, 0, -2, -7, 0};
        VertexArray vertexArray = new VertexArray(bArr.length / 3, 3, 1);
        vertexArray.set(0, bArr.length / 3, bArr);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, C0013n.f531f == 1 ? 1.0f : 0.2f, (float[]) null);
        byte[] bArr2 = {1, 0, 0, 0, 1, 1, 0, 1};
        VertexArray vertexArray2 = new VertexArray(bArr2.length / 2, 2, 1);
        vertexArray2.set(0, bArr2.length / 2, bArr2);
        vertexBuffer.setTexCoords(0, vertexArray2, 1.0f, (float[]) null);
        return new C0005f(vertexBuffer, new TriangleStripArray(new int[]{0, 1, 2, 3}, new int[]{4}), 54, 36);
    }

    /* JADX INFO: renamed from: d */
    static C0005f m226d() {
        byte[] bArr = {2, 2, 0, -2, 2, 0, 2, -2, 0, -2, -2, 0};
        VertexArray vertexArray = new VertexArray(bArr.length / 3, 3, 1);
        vertexArray.set(0, bArr.length / 3, bArr);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 1.4f, (float[]) null);
        vertexBuffer.setDefaultColor(f467a[(((C0013n.f516d - 1) << 1) + C0013n.f531f) - 1]);
        return new C0005f(vertexBuffer, new TriangleStripArray(new int[]{0, 1, 2, 3}, new int[]{4}), 55, 32);
    }

    /* JADX INFO: renamed from: e */
    static C0005f m227e() {
        byte[] bArr = {0, 0, 0, 0, -1, -1, 0, 1, -1};
        VertexArray vertexArray = new VertexArray(bArr.length / 3, 3, 1);
        vertexArray.set(0, bArr.length / 3, bArr);
        byte[] bArr2 = {-1, 0, 0, -1, -1, 0, -1, -1, 0};
        VertexArray vertexArray2 = new VertexArray(bArr2.length / 3, 3, 1);
        vertexArray2.set(0, bArr2.length / 3, bArr2);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 1.0f, (float[]) null);
        vertexBuffer.setColors(vertexArray2);
        return new C0005f(vertexBuffer, new TriangleStripArray(new int[]{0, 1, 2}, new int[]{3}), 50, 4);
    }

    /* JADX INFO: renamed from: f */
    static C0005f m228f() {
        byte[] bArr = {0, 0, 1, -1, 0, 0, 1, 0, 0};
        VertexArray vertexArray = new VertexArray(bArr.length / 3, 3, 1);
        vertexArray.set(0, bArr.length / 3, bArr);
        byte[] bArr2 = {127, 127, 127, -1, 127, 127, 127, 1, 127, 127, 127, 1};
        VertexArray vertexArray2 = new VertexArray(bArr2.length / 4, 4, 1);
        vertexArray2.set(0, bArr2.length / 4, bArr2);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 1.0f, (float[]) null);
        vertexBuffer.setColors(vertexArray2);
        return new C0005f(vertexBuffer, new TriangleStripArray(new int[]{0, 1, 2}, new int[]{3}), 40, 36);
    }

    /* JADX INFO: renamed from: g */
    static C0005f m229g() {
        byte[] bArr = {-10, -8, 0, -10, -6, 0, -10, -7, 10, 10, -8, 0, 10, -6, 0, 10, -7, 10, -10, 2, 0, -10, 0, 0, -10, 1, 10, 10, 2, 0, 10, 0, 0, 10, 1, 10};
        VertexArray vertexArray = new VertexArray(bArr.length / 3, 3, 1);
        vertexArray.set(0, bArr.length / 3, bArr);
        byte[] bArr2 = {-1, 0, -33, 0, 0, -1, 0, 0, 0, -1, 0, -33, 0, 0, -1, 0, 0, 0, -1, 0, -33, 0, 0, -1, 0, 0, 0, -1, 0, -33, 0, 0, -1, 0, 0, 0};
        VertexArray vertexArray2 = new VertexArray(bArr2.length / 3, 3, 1);
        vertexArray2.set(0, bArr2.length / 3, bArr2);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 0.1f, (float[]) null);
        vertexBuffer.setColors(vertexArray2);
        return new C0005f(vertexBuffer, new TriangleStripArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, new int[]{3, 3, 3, 3}), 30, 5);
    }

    /* JADX INFO: renamed from: h */
    static C0005f m230h() {
        byte[] bArr = {-1, 0, 0, 1, 0, 0, -1, 0, 1, 1, 0, 1};
        VertexArray vertexArray = new VertexArray(bArr.length / 3, 3, 1);
        vertexArray.set(0, bArr.length / 3, bArr);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 1.0f, (float[]) null);
        vertexBuffer.setDefaultColor(-13421773);
        return new C0005f(vertexBuffer, new TriangleStripArray(new int[]{0, 1, 2, 3}, new int[]{4}), 5, 2);
    }

    /* JADX INFO: renamed from: i */
    static C0005f m231i() {
        if (C0013n.f542h) {
            f466a = new byte[]{1, 1, 1, 1, 1, 1};
        } else {
            f466a = new byte[]{1, 4, 20, 8, 2, 1};
        }
        int i = 0;
        for (int i2 = 0; i2 < f466a.length; i2++) {
            i += f466a[i2] << 1;
        }
        int[] iArr = new int[i];
        f465a = (short) 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < f466a.length; i5++) {
            f465a = (short) (f465a + 1);
            for (int i6 = 1; i6 <= f466a[i5]; i6++) {
                i3 += (i6 << 1) + 1;
                f465a = (short) (f465a + i6 + 1);
                iArr[(i4 + i6) - 1] = (i6 << 1) + 1;
                iArr[((i4 + i6) - 1) + f466a[i5]] = (i6 << 1) + 1;
            }
            i4 += f466a[i5] << 1;
        }
        f465a = (short) (f465a << 1);
        int[] iArr2 = new int[i3 << 1];
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < f466a.length; i9++) {
            int i10 = 0;
            while (i10 < 2) {
                int i11 = 1;
                int i12 = i7;
                int i13 = i8;
                while (i11 <= f466a[i9]) {
                    iArr2[i13] = i12;
                    i13++;
                    int i14 = i12 + 1;
                    if (i11 == 1) {
                        iArr2[i13] = i14;
                        int i15 = i13 + 1;
                        int i16 = i14 + 1;
                        iArr2[i15] = i16;
                        i13 = i15 + 1;
                        i14 = i16 + 1;
                    } else {
                        for (int i17 = 0; i17 < i11; i17++) {
                            if (i11 == 2 && i17 == 0) {
                                iArr2[i13] = i14 - 4;
                            } else {
                                iArr2[i13] = (i14 - i11) - 1;
                            }
                            int i18 = i13 + 1;
                            iArr2[i18] = i14;
                            i13 = i18 + 1;
                            i14++;
                        }
                    }
                    i11++;
                    i12 = i14;
                }
                i10++;
                i7 = i12;
                i8 = i13;
            }
        }
        f468a = new short[f465a * 3];
        f470b = new short[f465a << 1];
        VertexArray vertexArray = new VertexArray(f465a, 3, 2);
        VertexArray vertexArray2 = new VertexArray(f465a, 2, 2);
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.setPositions(vertexArray, 0.022222223f, (float[]) null);
        vertexBuffer.setTexCoords(0, vertexArray2, 0.00390625f, (float[]) null);
        return new C0005f(vertexBuffer, new TriangleStripArray(iArr2, iArr), 0, 4);
    }
}
