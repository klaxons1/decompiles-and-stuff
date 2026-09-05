package com.mascotcapsule.eruption.docomostar;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.de */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0087de extends AbstractC0005ad {

    /* JADX INFO: renamed from: a */
    private static int[] f859a = new int[4];

    /* JADX INFO: renamed from: b */
    private static float[] f860b = new float[4];

    /* JADX INFO: renamed from: c */
    private static AbstractC0101ds[][] f861c;

    static {
        AbstractC0101ds[][] abstractC0101dsArr = (AbstractC0101ds[][]) Array.newInstance((Class<?>) AbstractC0101ds.class, 4, 2);
        f861c = abstractC0101dsArr;
        abstractC0101dsArr[0][0] = new C0093dk();
        f861c[0][1] = new C0093dk();
        f861c[1][0] = new C0075ct();
        f861c[1][1] = new C0075ct();
        f861c[2][0] = new C0114m();
        f861c[2][1] = new C0114m();
        f861c[3][0] = new C0118q();
        f861c[3][1] = new C0118q();
    }

    C0087de() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0005ad
    /* JADX INFO: renamed from: a */
    final int mo354a(AbstractC0101ds[] abstractC0101dsArr, float f, float f2, int i, int i2, float[] fArr) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C0061cf c0061cf;
        C0061cf c0061cf2;
        int i8;
        boolean z;
        int i9 = -1;
        boolean z2 = false;
        if (abstractC0101dsArr[i].f913n <= f) {
            i5 = i + 1;
            while (true) {
                i8 = i9;
                if (i5 >= abstractC0101dsArr.length) {
                    z = false;
                    break;
                }
                if (f < abstractC0101dsArr[i5].f913n) {
                    z = true;
                    break;
                }
                i9 = ((C0061cf) abstractC0101dsArr[i5]).f789b == 0 ? i5 : i8;
                i5++;
            }
            if (f < abstractC0101dsArr[0].f913n) {
                z2 = false;
                i4 = i8;
                i5 = 0;
                i6 = 0;
                i7 = 0;
            } else {
                int i10 = i5 - 1;
                z2 = z;
                i4 = i8;
                i6 = i10;
                i7 = i10;
            }
        } else {
            int i11 = -1;
            int i12 = i;
            while (true) {
                if (i12 < 0) {
                    i3 = i11;
                    break;
                }
                i3 = ((C0061cf) abstractC0101dsArr[i12]).f789b == 0 ? i12 : i11;
                if (f >= abstractC0101dsArr[i12].f913n) {
                    z2 = true;
                    if (i12 >= i3) {
                        break;
                    }
                    i3 = -1;
                    break;
                }
                i12--;
                i11 = i3;
            }
            if (i12 + 1 < abstractC0101dsArr.length) {
                int i13 = i12 + 1;
                i4 = i3;
                i5 = i13;
                i6 = i13;
                i7 = i12;
            } else {
                z2 = false;
                i4 = i3;
                i5 = i12;
                i6 = i12;
                i7 = i12;
            }
        }
        if (!z2) {
            C0061cf c0061cf3 = (C0061cf) abstractC0101dsArr[i5];
            if (c0061cf3.f789b == 0) {
                c0061cf3.mo454a(fArr);
                return i6;
            }
            if (i4 != -1) {
                i = i4;
            } else if (i7 < i) {
                i = i7;
                while (i >= 0 && ((C0061cf) abstractC0101dsArr[i]).f789b != 0) {
                    i--;
                }
            }
            for (int i14 = i + 1; i14 <= i6; i14++) {
                C0061cf.m451a((C0061cf) abstractC0101dsArr[i14], i2, f859a);
            }
            C0061cf.m452a(f859a, fArr, c0061cf3.f788a);
            return i;
        }
        if (((C0061cf) abstractC0101dsArr[i7]).f789b == 0 && ((C0061cf) abstractC0101dsArr[i5]).f789b == 0) {
            c0061cf = (C0061cf) abstractC0101dsArr[i7];
            c0061cf2 = (C0061cf) abstractC0101dsArr[i5];
            c0061cf.mo454a(f860b);
            f861c[c0061cf.f788a - 1][0].mo353a(c0061cf.f912m, c0061cf.f913n, f860b);
            c0061cf2.mo454a(f860b);
            i = i7;
        } else {
            if (i4 != -1) {
                i = i4;
            } else if (i7 < i) {
                i = i7;
                while (i >= 0 && ((C0061cf) abstractC0101dsArr[i]).f789b != 0) {
                    i--;
                }
            }
            ((C0061cf) abstractC0101dsArr[i]).m455a(f859a);
            for (int i15 = i + 1; i15 < i5; i15++) {
                C0061cf.m451a((C0061cf) abstractC0101dsArr[i15], i2, f859a);
            }
            c0061cf = (C0061cf) abstractC0101dsArr[i7];
            C0061cf.m452a(f859a, f860b, c0061cf.f788a);
            f861c[c0061cf.f788a - 1][0].mo353a(c0061cf.f912m, c0061cf.f913n, f860b);
            c0061cf2 = (C0061cf) abstractC0101dsArr[i5];
            if (c0061cf2.f789b == 0) {
                c0061cf2.mo454a(f860b);
            } else {
                C0061cf.m451a(c0061cf2, i2, f859a);
                C0061cf.m452a(f859a, f860b, c0061cf2.f788a);
            }
        }
        f861c[c0061cf2.f788a - 1][1].mo353a(c0061cf2.f912m, c0061cf2.f913n, f860b);
        f861c[c0061cf.f788a - 1][0].m493a(f, f861c[c0061cf2.f788a - 1][1], fArr);
        return i;
    }
}
