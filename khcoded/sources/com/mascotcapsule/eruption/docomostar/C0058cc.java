package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cc */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0058cc {

    /* JADX INFO: renamed from: b */
    private static Transform f770b = new Transform();

    /* JADX INFO: renamed from: a */
    int[] f771a = new int[9];

    C0058cc() {
        this.f771a[0] = 4096;
        this.f771a[1] = 0;
        this.f771a[2] = 0;
        this.f771a[3] = 0;
        this.f771a[4] = 4096;
        this.f771a[5] = 0;
        this.f771a[6] = 0;
        this.f771a[7] = 0;
        this.f771a[8] = 4096;
    }

    /* JADX INFO: renamed from: a */
    final void m446a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = -4095;
        int[] iArr = this.f771a;
        if (iArr[0] < -4095) {
            i = -4095;
        } else {
            i = iArr[0] > 4095 ? 4095 : iArr[0];
        }
        iArr[0] = i;
        if (iArr[1] < -4095) {
            i2 = -4095;
        } else {
            i2 = iArr[1] > 4095 ? 4095 : iArr[1];
        }
        iArr[1] = i2;
        if (iArr[2] < -4095) {
            i3 = -4095;
        } else {
            i3 = iArr[2] > 4095 ? 4095 : iArr[2];
        }
        iArr[2] = i3;
        if (iArr[3] < -4095) {
            i4 = -4095;
        } else {
            i4 = iArr[3] > 4095 ? 4095 : iArr[3];
        }
        iArr[3] = i4;
        if (iArr[4] < -4095) {
            i5 = -4095;
        } else {
            i5 = iArr[4] > 4095 ? 4095 : iArr[4];
        }
        iArr[4] = i5;
        if (iArr[5] < -4095) {
            i6 = -4095;
        } else {
            i6 = iArr[5] > 4095 ? 4095 : iArr[5];
        }
        iArr[5] = i6;
        if (iArr[6] < -4095) {
            i7 = -4095;
        } else {
            i7 = iArr[6] > 4095 ? 4095 : iArr[6];
        }
        iArr[6] = i7;
        if (iArr[7] < -4095) {
            i8 = -4095;
        } else {
            i8 = iArr[7] > 4095 ? 4095 : iArr[7];
        }
        iArr[7] = i8;
        if (iArr[8] >= -4095) {
            i9 = iArr[8] > 4095 ? 4095 : iArr[8];
        }
        iArr[8] = i9;
    }

    /* JADX INFO: renamed from: a */
    final boolean m447a(Transform transform) {
        if (transform.m274c()) {
            m448b(transform);
            return true;
        }
        try {
            f770b.m260a(transform, transform.m253a());
            float[] fArr = f770b.f494b.m;
            int[] iArr = this.f771a;
            iArr[0] = (int) (fArr[0] * 4096.0f);
            iArr[1] = (int) (fArr[4] * 4096.0f);
            iArr[2] = (int) (fArr[8] * 4096.0f);
            iArr[3] = (int) (fArr[1] * 4096.0f);
            iArr[4] = (int) (fArr[5] * 4096.0f);
            iArr[5] = (int) (fArr[9] * 4096.0f);
            iArr[6] = (int) (fArr[2] * 4096.0f);
            iArr[7] = (int) (fArr[6] * 4096.0f);
            iArr[8] = (int) (fArr[10] * 4096.0f);
            return false;
        } catch (Exception e) {
            m448b(transform);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m448b(Transform transform) {
        float[] fArr = transform.f494b.m;
        int[] iArr = this.f771a;
        iArr[0] = (int) (fArr[0] * 4096.0f);
        iArr[1] = (int) (fArr[1] * 4096.0f);
        iArr[2] = (int) (fArr[2] * 4096.0f);
        iArr[3] = (int) (fArr[4] * 4096.0f);
        iArr[4] = (int) (fArr[5] * 4096.0f);
        iArr[5] = (int) (fArr[6] * 4096.0f);
        iArr[6] = (int) (fArr[8] * 4096.0f);
        iArr[7] = (int) (fArr[9] * 4096.0f);
        iArr[8] = (int) (fArr[10] * 4096.0f);
    }
}
