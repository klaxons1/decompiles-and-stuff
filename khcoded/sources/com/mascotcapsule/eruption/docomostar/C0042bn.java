package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bn */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0042bn implements InterfaceC0023av {
    C0042bn() {
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
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0023av
    /* JADX INFO: renamed from: a */
    public final void mo350a(short[] sArr, short[] sArr2, int i) {
        int[] iArr = C0126y.f1043a.f771a;
        int i2 = i * 3;
        int i3 = (((iArr[0] * sArr2[i2]) + (iArr[3] * sArr2[i2 + 1])) + (iArr[6] * sArr2[i2 + 2])) >> 12;
        int i4 = (((iArr[1] * sArr2[i2]) + (iArr[4] * sArr2[i2 + 1])) + (iArr[7] * sArr2[i2 + 2])) >> 12;
        int i5 = ((iArr[8] * sArr2[i2 + 2]) + ((iArr[2] * sArr2[i2]) + (iArr[5] * sArr2[i2 + 1]))) >> 12;
        sArr[0] = (short) i3;
        sArr[1] = (short) i4;
        sArr[2] = (short) i5;
    }

    @Override // com.mascotcapsule.eruption.docomostar.InterfaceC0023av
    /* JADX INFO: renamed from: b */
    public final boolean mo351b() {
        return false;
    }
}
