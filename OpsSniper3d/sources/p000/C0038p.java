package p000;

import javax.microedition.m3g.Node;
import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: p */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0038p {

    /* JADX INFO: renamed from: a */
    private static float[] f287a = new float[16];

    /* JADX INFO: renamed from: b */
    private static Transform f288b = new Transform();

    /* JADX INFO: renamed from: c */
    private static float[] f289c = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: d */
    private static float[] f290d = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: e */
    private static float[] f291e = {0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: a */
    private static float m194a(float[] fArr) {
        float fSqrt = (float) Math.sqrt((fArr[0] * fArr[0]) + (fArr[1] * fArr[1]) + (fArr[2] * fArr[2]));
        if (fSqrt > 0.0f) {
            float f = 1.0f / fSqrt;
            fArr[0] = fArr[0] * f;
            fArr[1] = fArr[1] * f;
            fArr[2] = f * fArr[2];
        }
        return fSqrt;
    }

    /* JADX INFO: renamed from: a */
    public static void m195a(Node node, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        float[] fArr5 = f291e;
        fArr5[0] = fArr2[0] - fArr[0];
        fArr5[1] = fArr2[1] - fArr[1];
        fArr5[2] = fArr2[2] - fArr[2];
        m194a(f291e);
        m196a(f291e, fArr3, f289c);
        m194a(f289c);
        m196a(f289c, f291e, f290d);
        f287a[0] = f289c[0];
        f287a[1] = f290d[0];
        f287a[2] = -f291e[0];
        f287a[3] = 0.0f;
        f287a[4] = f289c[1];
        f287a[5] = f290d[1];
        f287a[6] = -f291e[1];
        f287a[7] = 0.0f;
        f287a[8] = f289c[2];
        f287a[9] = f290d[2];
        f287a[10] = -f291e[2];
        f287a[11] = 0.0f;
        f287a[12] = 0.0f;
        f287a[13] = 0.0f;
        f287a[14] = 0.0f;
        f287a[15] = 1.0f;
        f288b.set(f287a);
        node.setTransform(f288b);
        node.setTranslation(fArr[0], fArr[1], fArr[2]);
    }

    /* JADX INFO: renamed from: a */
    private static void m196a(float[] fArr, float[] fArr2, float[] fArr3) {
        if (fArr3 != fArr && fArr3 != fArr2) {
            fArr3[0] = (fArr[1] * fArr2[2]) - (fArr[2] * fArr2[1]);
            fArr3[1] = (fArr[2] * fArr2[0]) - (fArr[0] * fArr2[2]);
            fArr3[2] = (fArr[0] * fArr2[1]) - (fArr[1] * fArr2[0]);
        } else {
            float f = (fArr[1] * fArr2[2]) - (fArr[2] * fArr2[1]);
            float f2 = (fArr[2] * fArr2[0]) - (fArr[0] * fArr2[2]);
            fArr3[2] = (fArr[0] * fArr2[1]) - (fArr[1] * fArr2[0]);
            fArr3[1] = f2;
            fArr3[0] = f;
        }
    }
}
