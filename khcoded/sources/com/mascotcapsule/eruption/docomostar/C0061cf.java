package com.mascotcapsule.eruption.docomostar;

import p000.GameStatus;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cf */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0061cf extends AbstractC0101ds {

    /* JADX INFO: renamed from: d */
    private static int[] f787d = {0, 1, 2, 4};

    /* JADX INFO: renamed from: a */
    int f788a;

    /* JADX INFO: renamed from: b */
    byte f789b;

    /* JADX INFO: renamed from: c */
    private byte[] f790c;

    C0061cf(int i, byte b, int i2) {
        this.f788a = i;
        this.f789b = b;
        this.f790c = new byte[i2];
    }

    /* JADX INFO: renamed from: a */
    static final void m451a(C0061cf c0061cf, int i, int[] iArr) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 >= c0061cf.f788a) {
                return;
            }
            byte b = (byte) ((c0061cf.f789b >> (i3 << 1)) & 3);
            byte[] bArr = c0061cf.f790c;
            int i5 = iArr[i3];
            switch (b) {
                case 1:
                    i5 += bArr[i4] << i;
                    break;
                case 2:
                    i5 += ((short) ((bArr[i4] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) | ((bArr[i4 + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8))) << i;
                    break;
                case 3:
                    i5 += ((bArr[i4] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) | ((((bArr[i4 + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24) | ((bArr[i4 + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16)) | ((bArr[i4 + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8))) << i;
                    break;
            }
            iArr[i3] = i5;
            i2 = f787d[b] + i4;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    static final void m452a(int[] iArr, float[] fArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.intBitsToFloat(iArr[i2]);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m453a(int i, float f, byte[] bArr) {
        super.mo353a(i, f, (float[]) null);
        System.arraycopy(bArr, 0, this.f790c, 0, this.f790c.length);
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0101ds
    /* JADX INFO: renamed from: a */
    final void mo454a(float[] fArr) {
        for (int i = 0; i < this.f788a; i++) {
            fArr[i] = Float.intBitsToFloat((this.f790c[i << 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) | ((this.f790c[(i << 2) + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8) | ((this.f790c[(i << 2) + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16) | ((this.f790c[(i << 2) + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24));
        }
    }

    /* JADX INFO: renamed from: a */
    final void m455a(int[] iArr) {
        for (int i = 0; i < this.f788a; i++) {
            iArr[i] = (this.f790c[i << 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) | ((this.f790c[(i << 2) + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8) | ((this.f790c[(i << 2) + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16) | ((this.f790c[(i << 2) + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24);
        }
    }
}
