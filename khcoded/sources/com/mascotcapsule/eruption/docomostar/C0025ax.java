package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ax */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0025ax extends AbstractC0005ad {
    C0025ax() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0005ad
    /* JADX INFO: renamed from: a */
    final int mo354a(AbstractC0101ds[] abstractC0101dsArr, float f, float f2, int i, int i2, float[] fArr) {
        int i3;
        int i4;
        int i5;
        boolean z = true;
        if (f2 <= f) {
            i3 = i + 1;
            while (true) {
                if (i3 >= abstractC0101dsArr.length) {
                    z = false;
                    break;
                }
                if (f < abstractC0101dsArr[i3].f913n) {
                    break;
                }
                i3++;
            }
            if (f < abstractC0101dsArr[0].f913n) {
                i3 = 0;
                z = false;
                i4 = 0;
                i5 = 0;
            } else {
                int i6 = i3 - 1;
                i4 = i6;
                i5 = i6;
            }
        } else {
            int i7 = i;
            while (true) {
                if (i7 < 0) {
                    z = false;
                    break;
                }
                if (f >= abstractC0101dsArr[i7].f913n) {
                    break;
                }
                i7--;
            }
            if (i7 + 1 < abstractC0101dsArr.length) {
                int i8 = i7 + 1;
                i3 = i8;
                i4 = i8;
                i5 = i7;
            } else {
                i3 = i7;
                z = false;
                i4 = i7;
                i5 = i7;
            }
        }
        if (z) {
            abstractC0101dsArr[i5].m493a(f, abstractC0101dsArr[i3], fArr);
            return i5;
        }
        abstractC0101dsArr[i4].mo454a(fArr);
        return i4;
    }
}
