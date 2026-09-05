package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cr */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0073cr extends AbstractC0067cl {
    C0073cr() {
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
        fArr2[4] = (-fSin3) * fCos2;
        fArr2[8] = fSin2;
        fArr2[1] = ((-fSin) * (-fSin2) * fCos3) + (fCos * fSin3);
        fArr2[5] = ((-fSin) * (-fSin2) * (-fSin3)) + (fCos * fCos3);
        fArr2[9] = (-fSin) * fCos2;
        fArr2[2] = ((-fSin2) * fCos * fCos3) + (fSin * fSin3);
        fArr2[6] = (fSin * fCos3) + ((-fSin2) * fCos * (-fSin3));
        fArr2[10] = fCos * fCos2;
        transform.f495c = (byte) 0;
        transform.f496d = (byte) 1;
        transform.f497e = (byte) 1;
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0067cl
    /* JADX INFO: renamed from: b */
    final void mo457b(Transform transform, float[] fArr) {
        float[] fArr2 = transform.f494b.m;
        float f = -Util3D.asin(fArr2[8]);
        if (f == 0.5f || f == -0.5f) {
            fArr[0] = Util3D.atan2(fArr2[6], fArr2[5]);
            fArr[1] = f;
            fArr[2] = 0.0f;
        } else {
            fArr[0] = Util3D.atan2(fArr2[9], fArr2[10]);
            fArr[1] = f;
            fArr[2] = Util3D.asin(fArr2[4] / Util3D.cos(f));
            if (fArr2[0] < 0.0f) {
                fArr[2] = 0.5f - fArr[2];
            }
        }
    }
}
