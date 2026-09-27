package p000;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0034l {
    /* JADX INFO: renamed from: a */
    public static float m183a(float[] fArr) {
        float f = 0.0f;
        for (int i = 0; i < fArr.length; i++) {
            f += fArr[i] * fArr[i];
        }
        return (float) Math.sqrt(f);
    }

    /* JADX INFO: renamed from: a */
    public static float m184a(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length) {
            throw new ArithmeticException();
        }
        float f = 0.0f;
        for (int i = 0; i < fArr.length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: renamed from: b */
    public static float[] m185b(float[] fArr) {
        float fM183a = m183a(fArr);
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr2.length; i++) {
            fArr2[i] = fArr[i] / fM183a;
        }
        return fArr2;
    }

    /* JADX INFO: renamed from: b */
    public static float[] m186b(float[] fArr, float[] fArr2) {
        if (fArr.length == 3 && fArr2.length == 3) {
            return new float[]{(fArr[1] * fArr2[2]) - (fArr[2] * fArr2[1]), (fArr[2] * fArr2[0]) - (fArr[0] * fArr2[2]), (fArr[0] * fArr2[1]) - (fArr[1] * fArr2[0])};
        }
        throw new ArithmeticException();
    }
}
