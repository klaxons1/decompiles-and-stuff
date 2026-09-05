package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.a */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0001a implements InterfaceC0023av {
    C0001a() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0023av
    /* JADX INFO: renamed from: a */
    public final Transform mo348a() {
        return C0126y.f1044b;
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0023av
    /* JADX INFO: renamed from: a */
    public final void mo349a(Vector3D vector3D, float[] fArr, int i) {
        float[] fArr2 = C0126y.f1044b.f494b.m;
        int i2 = i * 3;
        vector3D.f516a = (fArr2[0] * fArr[i2]) + (fArr2[4] * fArr[i2 + 1]) + (fArr2[8] * fArr[i2 + 2]);
        vector3D.f517b = (fArr2[1] * fArr[i2]) + (fArr2[5] * fArr[i2 + 1]) + (fArr2[9] * fArr[i2 + 2]);
        vector3D.f518c = (fArr2[10] * fArr[i2 + 2]) + (fArr2[2] * fArr[i2]) + (fArr2[6] * fArr[i2 + 1]);
        vector3D.normalize(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0023av
    /* JADX INFO: renamed from: a */
    public final void mo350a(short[] sArr, short[] sArr2, int i) {
        int[] iArr = C0126y.f1043a.f771a;
        int i2 = i * 3;
        C0126y.f1045c.f516a = (iArr[0] * sArr2[i2]) + (iArr[3] * sArr2[i2 + 1]) + (iArr[6] * sArr2[i2 + 2]);
        C0126y.f1045c.f517b = (iArr[1] * sArr2[i2]) + (iArr[4] * sArr2[i2 + 1]) + (iArr[7] * sArr2[i2 + 2]);
        C0126y.f1045c.f518c = (iArr[8] * sArr2[i2 + 2]) + (iArr[2] * sArr2[i2]) + (iArr[5] * sArr2[i2 + 1]);
        C0126y.f1045c.normalize(C0126y.f1045c);
        sArr[0] = (short) (C0126y.f1045c.f516a * 32767.0f);
        sArr[1] = (short) (C0126y.f1045c.f517b * 32767.0f);
        sArr[2] = (short) (C0126y.f1045c.f518c * 32767.0f);
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0023av
    /* JADX INFO: renamed from: b */
    public final boolean mo351b() {
        return true;
    }
}
