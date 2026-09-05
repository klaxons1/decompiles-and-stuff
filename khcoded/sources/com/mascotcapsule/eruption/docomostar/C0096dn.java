package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.GraphicsOGL;
import java.util.Vector;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.dn */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0096dn {

    /* JADX INFO: renamed from: f */
    private static Vector f882f = new Vector();

    /* JADX INFO: renamed from: g */
    private static Vector f883g = new Vector();

    /* JADX INFO: renamed from: h */
    private static Vector f884h = new Vector();

    /* JADX INFO: renamed from: i */
    private static Vector f885i = new Vector();

    /* JADX INFO: renamed from: j */
    private static C0069cn[] f886j;

    /* JADX INFO: renamed from: k */
    private static C0069cn[] f887k;

    /* JADX INFO: renamed from: l */
    private static C0043bo[] f888l;

    /* JADX INFO: renamed from: a */
    C0043bo[] f889a;

    /* JADX INFO: renamed from: b */
    C0069cn[] f890b;

    /* JADX INFO: renamed from: c */
    C0104dv f891c;

    /* JADX INFO: renamed from: d */
    C0104dv f892d;

    /* JADX INFO: renamed from: e */
    int f893e;

    /* JADX INFO: renamed from: m */
    private C0069cn[] f894m;

    C0096dn(BufferPool bufferPool, BufferPool bufferPool2, GraphicsOGL graphicsOGL, C0009ah c0009ah, IndexBuffer indexBuffer, BoneDeformer boneDeformer, boolean z, C0104dv c0104dv, C0104dv c0104dv2, boolean z2) {
        m486a(null, c0009ah, indexBuffer, boneDeformer, z);
        c0104dv.m502a(bufferPool, graphicsOGL, c0009ah, f886j, z2);
        c0104dv2.m502a(bufferPool2, graphicsOGL, c0009ah, f887k, z2);
        this.f891c = c0104dv;
        this.f892d = c0104dv2;
        this.f894m = f886j;
        this.f890b = f887k;
        this.f889a = f888l;
        this.f893e = this.f889a.length;
        f888l = null;
        f886j = null;
        f887k = null;
    }

    /* JADX INFO: renamed from: a */
    private static void m484a(int i) {
        int size = f884h.size();
        if (size == 0) {
            return;
        }
        short[] sArr = new short[size];
        for (int i2 = 0; i2 < size; i2++) {
            sArr[i2] = ((Short) f884h.elementAt(i2)).shortValue();
        }
        f884h.removeAllElements();
        f885i.addElement(new C0069cn(i, sArr));
    }

    /* JADX INFO: renamed from: a */
    private static void m485a(BoneDeformer boneDeformer, int[] iArr, int i, int i2, C0069cn c0069cn, int i3) {
        byte[] bArr;
        C0043bo c0043bo = new C0043bo();
        int size = f883g.size();
        short[] sArr = new short[size];
        if (c0069cn == null) {
            byte[] bArr2 = new byte[i * i2];
            c0069cn = new C0069cn(-1, bArr2);
            bArr = bArr2;
        } else {
            bArr = c0069cn.f808d;
        }
        for (int i4 = 0; i4 < size; i4++) {
            sArr[i4] = ((Short) f883g.elementAt(i4)).shortValue();
        }
        f883g.removeAllElements();
        c0043bo.f734a = sArr;
        int size2 = f885i.size();
        c0043bo.f737d = new C0069cn[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            c0043bo.f737d[i5] = (C0069cn) f885i.elementAt(i5);
        }
        f885i.removeAllElements();
        for (int i6 = 0; i6 < size2; i6++) {
            C0069cn c0069cn2 = c0043bo.f737d[i6];
            int i7 = c0069cn2.f806b;
            for (int i8 = 0; i8 < i7; i8++) {
                short s = c0069cn2.f807c[i8];
                C0124w c0124w = boneDeformer.f143c[iArr[s]];
                int i9 = c0124w.f1041c > i3 ? i3 : c0124w.f1041c;
                for (int i10 = 0; i10 < i9; i10++) {
                    short s2 = c0124w.f1040b[i10];
                    for (int i11 = 0; i11 < size; i11++) {
                        if (s2 == c0043bo.f734a[i11]) {
                            bArr[(s * i2) + i10] = (byte) i11;
                            break;
                        }
                    }
                }
                if (i9 == 0) {
                    for (int i12 = 0; i12 < size; i12++) {
                        if (-1 == c0043bo.f734a[i12]) {
                            bArr[s * i2] = (byte) i12;
                            break;
                        }
                    }
                }
            }
        }
        c0043bo.f736c = c0069cn;
        c0043bo.f735b = i2;
        f882f.addElement(c0043bo);
    }

    /* JADX INFO: renamed from: a */
    static final void m486a(int[] iArr, C0009ah c0009ah, IndexBuffer indexBuffer, BoneDeformer boneDeformer, boolean z) {
        int i;
        int i2 = c0009ah.f635b.f746a;
        int i3 = c0009ah.f635b.f747b;
        int i4 = indexBuffer.f336a;
        int i5 = 0;
        for (int i6 = 0; i6 < boneDeformer.f141a; i6++) {
            i5 += boneDeformer.f142b[i6];
        }
        int[] iArr2 = new int[i5];
        int i7 = 0;
        for (int i8 = 0; i8 < boneDeformer.f141a; i8++) {
            int i9 = 0;
            while (i9 < boneDeformer.f142b[i8]) {
                iArr2[i7] = i8;
                i9++;
                i7++;
            }
        }
        int i10 = 1;
        for (int i11 = 0; i11 < boneDeformer.f141a; i11++) {
            if (boneDeformer.f143c[i11].f1041c > i10) {
                i10 = boneDeformer.f143c[i11].f1041c;
            }
        }
        if (i10 > i3) {
            i10 = i3;
        }
        C0069cn c0069cn = z ? new C0069cn(-1, new byte[i5 * i10]) : null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = i4;
        while (true) {
            int i16 = i12;
            if (i13 >= indexBuffer.f340e) {
                int size = f882f.size();
                f888l = new C0043bo[size];
                int i17 = 0;
                int i18 = 0;
                while (i18 < size) {
                    f888l[i18] = (C0043bo) f882f.elementAt(i18);
                    int length = f888l[i18].f737d.length + i17;
                    i18++;
                    i17 = length;
                }
                f882f.removeAllElements();
                f886j = new C0069cn[size];
                for (int i19 = 0; i19 < size; i19++) {
                    f886j[i19] = f888l[i19].f736c;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] + C0104dv.m496a(f886j);
                }
                f887k = new C0069cn[i17];
                int i20 = 0;
                for (int i21 = 0; i21 < size; i21++) {
                    int i22 = 0;
                    while (i22 < f888l[i21].f737d.length) {
                        f887k[i20] = f888l[i21].f737d[i22];
                        i22++;
                        i20++;
                    }
                }
                if (iArr != null) {
                    iArr[1] = iArr[1] + C0104dv.m496a(f887k);
                    return;
                }
                return;
            }
            if (indexBuffer.f342g > 0 && i13 == indexBuffer.f340e - 1) {
                i15 = 4;
            }
            int i23 = 0;
            i12 = i14;
            while (i23 < indexBuffer.f344q[i13]) {
                if (m487a(boneDeformer.f143c[iArr2[indexBuffer.f345r[i12]]], i2, i3)) {
                    int size2 = 0;
                    switch (i15) {
                        case 4:
                            size2 = f884h.size() % 3;
                            for (int i24 = 0; i24 < size2; i24++) {
                                f884h.removeElementAt(f884h.size() - 1);
                            }
                            break;
                    }
                    int i25 = size2;
                    m484a(i15);
                    m485a(boneDeformer, iArr2, i5, i10, c0069cn, i3);
                    switch (i15) {
                        case 4:
                            for (int i26 = 0; i26 < i25; i26++) {
                                int i27 = (i12 - i25) + i26;
                                f884h.addElement(new Short(indexBuffer.f345r[i27]));
                                m487a(boneDeformer.f143c[iArr2[indexBuffer.f345r[i27]]], i2, i3);
                            }
                            break;
                        case 5:
                            if (i23 != 0) {
                                if ((i12 - i16) % 2 == 0) {
                                    f884h.addElement(new Short(indexBuffer.f345r[i12 - 2]));
                                    f884h.addElement(new Short(indexBuffer.f345r[i12 - 1]));
                                    m487a(boneDeformer.f143c[iArr2[indexBuffer.f345r[i12 - 2]]], i2, i3);
                                    m487a(boneDeformer.f143c[iArr2[indexBuffer.f345r[i12 - 1]]], i2, i3);
                                    i = 2;
                                } else {
                                    f884h.addElement(new Short(indexBuffer.f345r[i12 - 1]));
                                    f884h.addElement(new Short(indexBuffer.f345r[i12 - 2]));
                                    f884h.addElement(new Short(indexBuffer.f345r[i12 - 1]));
                                    m487a(boneDeformer.f143c[iArr2[indexBuffer.f345r[i12 - 2]]], i2, i3);
                                    m487a(boneDeformer.f143c[iArr2[indexBuffer.f345r[i12 - 1]]], i2, i3);
                                    i = 3;
                                }
                                i25 += i;
                            }
                            break;
                    }
                    i16 = i12 - i25;
                    i23--;
                } else {
                    f884h.addElement(new Short(indexBuffer.f345r[i12]));
                    i12++;
                }
                i23++;
            }
            m484a(i15);
            m485a(boneDeformer, iArr2, i5, i10, c0069cn, i3);
            i13++;
            i14 = i12;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m487a(C0124w c0124w, int i, int i2) {
        for (int i3 = 0; i3 < c0124w.f1041c && i3 < i2; i3++) {
            if (m488a(c0124w.f1040b[i3], i)) {
                return true;
            }
        }
        return c0124w.f1041c == 0 && m488a((short) -1, i);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m488a(short s, int i) {
        boolean z;
        int size = f883g.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            if (s == ((Short) f883g.elementAt(i2)).shortValue()) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            if (f883g.size() >= i) {
                return true;
            }
            f883g.addElement(new Short(s));
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    final void m489a() {
        if (this.f894m != null) {
            for (int i = 0; i < this.f894m.length; i++) {
                if (this.f894m[i] != null) {
                    this.f894m[i].m476b();
                }
            }
            this.f894m = null;
        }
        if (this.f890b != null) {
            for (int i2 = 0; i2 < this.f890b.length; i2++) {
                if (this.f890b[i2] != null) {
                    this.f890b[i2].m476b();
                }
            }
            this.f890b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m490a(Graphics3D graphics3D, GraphicsOGL graphicsOGL) {
        this.f891c.m503a(graphics3D, graphicsOGL);
        this.f891c = null;
        this.f892d.m503a(graphics3D, graphicsOGL);
        this.f892d = null;
        m489a();
    }
}
