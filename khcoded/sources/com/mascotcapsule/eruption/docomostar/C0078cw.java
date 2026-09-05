package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cw */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0078cw extends AbstractC0067cl {
    C0078cw() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0067cl
    /* JADX INFO: renamed from: a */
    final void mo456a(Transform transform, float[] fArr) {
        float fCos = Util3D.cos(fArr[0]);
        float fSin = Util3D.sin(fArr[0]);
        float fCos2 = Util3D.cos(fArr[1]);
        float fSin2 = Util3D.sin(fArr[1]);
        float fCos3 = Util3D.cos(fArr[2]);
        float fSin3 = Util3D.sin(fArr[2]);
        float[] fArr2 = transform.f494b.m;
        fArr2[0] = fCos2 * fCos3;
        fArr2[4] = ((-fSin3) * fCos2 * fCos) + (fSin2 * fSin);
        fArr2[8] = ((-fSin3) * fCos2 * (-fSin)) + (fSin2 * fCos);
        fArr2[1] = fSin3;
        fArr2[5] = fCos3 * fCos;
        fArr2[9] = (-fSin) * fCos3;
        fArr2[2] = fCos3 * (-fSin2);
        fArr2[6] = ((-fSin2) * (-fSin3) * fCos) + (fCos2 * fSin);
        float f = fCos * fCos2;
        fArr2[10] = f + ((-fSin) * (-fSin2) * (-fSin3));
        transform.f495c = (byte) 0;
        transform.f496d = (byte) 1;
        transform.f497e = (byte) 1;
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0067cl
    /* JADX INFO: renamed from: b */
    final void mo457b(Transform transform, float[] fArr) {
        float[] fArr2 = transform.f494b.m;
        float f = -Util3D.asin(fArr2[1]);
        if (f == 0.5f || f == -0.5f) {
            fArr[0] = 0.0f;
            fArr[1] = Util3D.atan2(fArr2[8], fArr2[10]);
            fArr[2] = f;
        } else {
            fArr[0] = Util3D.asin(fArr2[9] / Util3D.cos(f));
            fArr[1] = Util3D.atan2(fArr2[2], fArr2[0]);
            fArr[2] = f;
            if (fArr2[5] < 0.0f) {
                fArr[0] = 0.5f - fArr[0];
            }
        }
    }
}
