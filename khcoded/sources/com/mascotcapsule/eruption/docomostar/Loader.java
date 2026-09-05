package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.GameStatus;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public class Loader {
    public static final int SCALEFUNC_MASK = 15;
    public static final int USE_LOCALSCALE = 2;
    public static final int USE_POSTSCALE = 1;

    Loader() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    private static Object3D m176a(C0028b c0028b, InputStream inputStream) throws IllegalStateException {
        if (C0028b.m421c(c0028b, inputStream) == 1) {
            throw new IllegalStateException("FIXED Data type is not supported.");
        }
        byte[] bArr = {C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream)};
        int iM426g = C0028b.m426g(c0028b, inputStream);
        Action[] actionArr = new Action[iM426g];
        for (int i = 0; i < iM426g; i++) {
            actionArr[i] = m179b(c0028b, inputStream);
        }
        ActionTable actionTable = new ActionTable(iM426g);
        for (int i2 = 0; i2 < iM426g; i2++) {
            actionTable.m1a(i2, actionArr[i2]);
        }
        return actionTable;
    }

    /* JADX INFO: renamed from: a */
    static AbstractC0032bd m177a(C0028b c0028b, int i, int i2) {
        return m180b(c0028b, i, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    private static void m178a(C0028b c0028b) throws IllegalStateException {
        int i;
        Figure figure;
        Figure figure2;
        for (int i2 = 0; i2 < c0028b.f686c.f803b[0]; i2++) {
            for (int i3 = 0; i3 < 2; i3++) {
                int i4 = ((C0125x) c0028b.f686c.f804c[0][i2]).f1042a[i3];
                if (i4 != -1) {
                    AbstractC0032bd abstractC0032bdM180b = m180b(c0028b, 3, i4);
                    if (abstractC0032bdM180b == null) {
                        throw new IllegalStateException("No relevant Light for Appearance");
                    }
                    ((Appearance) c0028b.f686c.f804c[0][i2].f698d).setSoftwareLight(i3, (Light) abstractC0032bdM180b.f698d);
                    abstractC0032bdM180b.f697c = 1;
                }
            }
        }
        int[] iArr = {11, 3, 4, 6};
        for (int i5 = 0; i5 < c0028b.f686c.f803b[10]; i5 = i + 1) {
            C0022au c0022au = (C0022au) c0028b.f686c.f804c[10][i5];
            NodeDeformer nodeDeformer = (NodeDeformer) c0022au.f698d;
            for (int i6 = 0; i6 < c0022au.f682a; i6++) {
                AbstractC0032bd abstractC0032bdM180b2 = null;
                for (int i7 : iArr) {
                    abstractC0032bdM180b2 = m180b(c0028b, i7, c0022au.f683b[i6]);
                    if (abstractC0032bdM180b2 != null) {
                        boolean z = nodeDeformer.f392e[i6].f675e;
                        nodeDeformer.setNode(i6, (NodeDeformerNode) abstractC0032bdM180b2.f698d, nodeDeformer.f392e[i6].f674d, null);
                        nodeDeformer.setVisible(i6, z);
                        abstractC0032bdM180b2.f697c = 1;
                        break;
                    }
                }
                if (abstractC0032bdM180b2 == null) {
                    throw new IllegalStateException("No relevant NodeDeformerNode for NodeDeformer");
                }
                if (abstractC0032bdM180b2.f698d.getClassType() == 9) {
                    Figure figure3 = (Figure) abstractC0032bdM180b2.f698d;
                    if (nodeDeformer.f394g != null && figure3.f227e != null) {
                        nodeDeformer.f394g.m285b(true);
                        figure3.f227e.m58b(nodeDeformer.f394g, nodeDeformer.f392e[i6].f674d);
                    }
                }
            }
            for (int i8 = 0; i8 < c0028b.f686c.f803b[3]; i8++) {
                C0081cz c0081cz = (C0081cz) c0028b.f686c.f804c[3][i8];
                if (c0081cz.f840a != -1) {
                    AbstractC0032bd abstractC0032bdM180b3 = m180b(c0028b, 11, c0081cz.f840a);
                    if (abstractC0032bdM180b3 == null) {
                        throw new IllegalStateException("No relevant Target Figure for Light");
                    }
                    ((Light) c0081cz.f698d).setTargetObject3D((NodeDeformerNode) abstractC0032bdM180b3.f698d);
                    c0081cz.f697c = 1;
                }
            }
            i = 0;
            while (i < c0028b.f686c.f803b[4]) {
                C0040bl c0040bl = (C0040bl) c0028b.f686c.f804c[4][i];
                if (c0040bl.f732a != -1) {
                    AbstractC0032bd abstractC0032bdM180b4 = m180b(c0028b, 11, c0040bl.f732a);
                    if (abstractC0032bdM180b4 == null) {
                        throw new IllegalStateException("No relevant Target Figure for Camera");
                    }
                    Figure figure4 = (Figure) abstractC0032bdM180b4.f698d;
                    abstractC0032bdM180b4.f697c = 1;
                    figure = figure4;
                } else {
                    figure = null;
                }
                if (c0040bl.f733b != -1) {
                    AbstractC0032bd abstractC0032bdM180b5 = m180b(c0028b, 11, c0040bl.f733b);
                    if (abstractC0032bdM180b5 == null) {
                        throw new IllegalStateException("No relevant Up Vector Figure for Camera");
                    }
                    Figure figure5 = (Figure) abstractC0032bdM180b5.f698d;
                    abstractC0032bdM180b5.f697c = 1;
                    figure2 = figure5;
                } else {
                    figure2 = null;
                }
                ((Camera) c0040bl.f698d).setTargetAndUpObject3D(figure, figure2);
                i++;
            }
        }
        c0028b.f684a = 0;
        for (int i9 = 0; i9 < c0028b.f686c.f802a; i9++) {
            for (int i10 = 0; i10 < c0028b.f686c.f803b[i9]; i10++) {
                if (c0028b.f686c.f804c[i9][i10].f697c == 0) {
                    c0028b.f684a++;
                }
            }
        }
        c0028b.f685b = new Object3D[c0028b.f684a];
        int i11 = 0;
        int i12 = 0;
        while (i12 < c0028b.f686c.f802a) {
            int i13 = i11;
            for (int i14 = 0; i14 < c0028b.f686c.f803b[i12]; i14++) {
                if (c0028b.f686c.f804c[i12][i14].f697c == 0) {
                    c0028b.f685b[i13] = c0028b.f686c.f804c[i12][i14].f698d;
                    if (c0028b.f685b[i13].getClassType() == 9) {
                        ((Figure) c0028b.f685b[i13]).updatePosture(null);
                    }
                    i13++;
                }
            }
            i12++;
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: b */
    private static Action m179b(C0028b c0028b, InputStream inputStream) throws IOException {
        int i;
        int i2;
        int i3 = c0028b.f687d;
        c0028b.f687d = 0;
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        int iM414a = C0028b.m414a(c0028b, inputStream);
        byte bM422d = C0028b.m422d(c0028b, inputStream);
        C0028b.m414a(c0028b, inputStream);
        float fM425f = C0028b.m425f(c0028b, inputStream);
        byte bM422d2 = C0028b.m422d(c0028b, inputStream);
        byte bM422d3 = C0028b.m422d(c0028b, inputStream);
        int iM426g = C0028b.m426g(c0028b, inputStream);
        Action action = new Action(iM414a, bM422d2, iM426g, fM425f);
        action.f401i = c0004ac.f559c;
        action.f402j = c0004ac.f560d;
        action.f86e = bM422d3;
        if (bM422d == 1) {
            int i4 = c0004ac.f557a - c0028b.f687d;
            byte[] bArr = new byte[i4];
            inputStream.read(bArr);
            inputStream = new C0016ao(bArr);
            i = i3 + i4;
        } else {
            i = i3;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= iM426g) {
                if (bM422d == 1) {
                    c0028b.f687d = i;
                } else {
                    c0028b.f687d += i;
                }
                return action;
            }
            short sM424e = C0028b.m424e(c0028b, inputStream);
            if (sM424e <= 0) {
                action.f85d[i6] = new C0019ar(0);
            } else {
                action.f85d[i6] = new C0019ar(sM424e);
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i8 < sM424e) {
                        C0037bi[] c0037biArr = action.f85d[i6].f681a;
                        float[] fArr = new float[12];
                        byte[] bArr2 = new byte[48];
                        byte bM422d4 = C0028b.m422d(c0028b, inputStream);
                        byte bM422d5 = C0028b.m422d(c0028b, inputStream);
                        int iM426g2 = C0028b.m426g(c0028b, inputStream);
                        C0028b.m426g(c0028b, inputStream);
                        C0028b.m426g(c0028b, inputStream);
                        C0037bi c0037bi = new C0037bi(bM422d4, bM422d5, iM426g2);
                        for (int i9 = 0; i9 < iM426g2; i9++) {
                            byte bM422d6 = C0028b.m422d(c0028b, inputStream);
                            byte bM422d7 = C0028b.m422d(c0028b, inputStream);
                            float fM425f2 = C0028b.m425f(c0028b, inputStream);
                            if (bM422d5 < 10) {
                                int i10 = bM422d5 * bM422d7;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    fArr[i11] = C0028b.m425f(c0028b, inputStream);
                                }
                                c0037bi.m435a(i9, bM422d6, bM422d7, fM425f2, fArr, i10);
                            } else {
                                int iM432a = C0037bi.m432a(bM422d5, 1);
                                if (bM422d7 == 0) {
                                    for (int i12 = 0; i12 < iM432a; i12++) {
                                        fArr[i12] = C0028b.m425f(c0028b, inputStream);
                                        int iFloatToIntBits = Float.floatToIntBits(fArr[i12]);
                                        bArr2[i12 << 2] = (byte) iFloatToIntBits;
                                        bArr2[(i12 << 2) + 1] = (byte) (iFloatToIntBits >> 8);
                                        bArr2[(i12 << 2) + 2] = (byte) (iFloatToIntBits >> 16);
                                        bArr2[(i12 << 2) + 3] = (byte) (iFloatToIntBits >>> 24);
                                    }
                                } else {
                                    int i13 = 0;
                                    int i14 = 0;
                                    while (i14 < iM432a) {
                                        switch (C0037bi.m431a((byte) ((bM422d7 >> (i14 << 1)) & 3))) {
                                            case 1:
                                                i2 = i13 + 1;
                                                bArr2[i13] = (byte) (C0028b.m422d(c0028b, inputStream) & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
                                                break;
                                            case 2:
                                                short sM424e2 = C0028b.m424e(c0028b, inputStream);
                                                int i15 = i13 + 1;
                                                bArr2[i13] = (byte) (sM424e2 & 255);
                                                i2 = i15 + 1;
                                                bArr2[i15] = (byte) ((sM424e2 >> 8) & 255);
                                                break;
                                            case 3:
                                            default:
                                                i2 = i13;
                                                break;
                                            case 4:
                                                int iM414a2 = C0028b.m414a(c0028b, inputStream);
                                                int i16 = i13 + 1;
                                                bArr2[i13] = (byte) (iM414a2 & 255);
                                                int i17 = i16 + 1;
                                                bArr2[i16] = (byte) ((iM414a2 >> 8) & 255);
                                                int i18 = i17 + 1;
                                                bArr2[i17] = (byte) ((iM414a2 >> 16) & 255);
                                                i2 = i18 + 1;
                                                bArr2[i18] = (byte) ((iM414a2 >> 24) & 255);
                                                break;
                                        }
                                        i14++;
                                        i13 = i2;
                                    }
                                }
                                c0037bi.m434a(i9, bM422d6, bM422d7, fM425f2, bArr2);
                            }
                        }
                        c0037biArr[i8] = c0037bi;
                        i7 = i8 + 1;
                    }
                }
            }
            i5 = i6 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC0032bd m180b(C0028b c0028b, int i, int i2) {
        for (int i3 = 0; i3 < c0028b.f686c.f803b[i]; i3++) {
            if (c0028b.f686c.f804c[i][i3].f698d.f401i == i2) {
                return c0028b.f686c.f804c[i][i3];
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: c */
    private static Object3D m181c(C0028b c0028b, InputStream inputStream) throws IllegalStateException, IOException {
        int i;
        InputStream c0016ao;
        int iM426g = C0028b.m426g(c0028b, inputStream);
        Texture[] textureArr = new Texture[iM426g];
        for (int i2 = 0; i2 < iM426g; i2++) {
            int i3 = c0028b.f687d;
            c0028b.f687d = 0;
            C0004ac c0004ac = new C0004ac();
            C0028b.m416a(c0028b, inputStream, c0004ac);
            int iM414a = C0028b.m414a(c0028b, inputStream);
            int iM414a2 = C0028b.m414a(c0028b, inputStream);
            int iM426g2 = C0028b.m426g(c0028b, inputStream);
            int iM426g3 = C0028b.m426g(c0028b, inputStream);
            byte bM422d = C0028b.m422d(c0028b, inputStream);
            short sM421c = (short) (C0028b.m421c(c0028b, inputStream) + 1);
            byte bM422d2 = C0028b.m422d(c0028b, inputStream);
            C0028b.m422d(c0028b, inputStream);
            boolean z = false;
            int[] iArr = new int[sM421c + 1];
            iArr[0] = 0;
            if (sM421c > 1) {
                for (int i4 = 1; i4 < sM421c; i4++) {
                    iArr[i4] = C0028b.m414a(c0028b, inputStream);
                }
                z = true;
            }
            int i5 = c0004ac.f557a - c0028b.f687d;
            if (bM422d == 1) {
                int i6 = c0004ac.f557a - c0028b.f687d;
                byte[] bArr = new byte[i6];
                inputStream.read(bArr);
                i = i6 + i3;
                c0016ao = new C0016ao(bArr);
            } else {
                iM414a2 = i5;
                i = i3;
                c0016ao = inputStream;
            }
            Texture texture = new Texture(c0028b.f691h, iM414a, bM422d2, iM426g2, iM426g3, z, iM414a2);
            texture.m221a(c0004ac.f559c);
            texture.setUserId(c0004ac.f560d);
            if (texture.f479q > 0) {
                byte[] bArr2 = new byte[texture.f479q];
                c0016ao.read(bArr2, 0, texture.f479q);
                texture.setPalette(bM422d2, bArr2);
                iM414a2 -= texture.f479q;
            }
            iArr[sM421c] = iM414a2;
            int i7 = iM426g2;
            int i8 = iM426g3;
            for (int i9 = 0; i9 < sM421c; i9++) {
                if (i7 < 1) {
                    i7 = 1;
                }
                if (i8 < 1) {
                    i8 = 1;
                }
                int i10 = iArr[i9 + 1] - iArr[i9];
                byte[] bArr3 = new byte[i10];
                c0016ao.read(bArr3, 0, i10);
                texture.setImage(bM422d2, i9, 0, 0, i7, i8, bArr3);
                i7 >>= 1;
                i8 >>= 1;
            }
            if (bM422d == 1) {
                c0028b.f687d = i;
            } else {
                c0028b.f687d += i;
            }
            textureArr[i2] = texture;
        }
        TextureTable textureTable = new TextureTable(iM426g);
        for (int i11 = 0; i11 < iM426g; i11++) {
            textureTable.m248a(i11, textureArr[i11]);
        }
        return textureTable;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: d */
    private static Object3D[] m182d(C0028b c0028b, InputStream inputStream) throws IllegalStateException {
        c0028b.f687d = 0;
        if (C0028b.m422d(c0028b, inputStream) == 1) {
            throw new IllegalStateException("FIXED Data type is not supported.");
        }
        byte[] bArr = {C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream)};
        C0028b.m417a(c0028b, new int[]{0, 1, 2, 12, 13}, inputStream);
        c0028b.f684a = 0;
        for (int i = 0; i < c0028b.f686c.f802a; i++) {
            for (int i2 = 0; i2 < c0028b.f686c.f803b[i]; i2++) {
                if (c0028b.f686c.f804c[i][i2].f697c == 0) {
                    c0028b.f684a++;
                }
            }
        }
        c0028b.f685b = new Object3D[c0028b.f684a];
        int i3 = 0;
        for (int i4 = 0; i4 < c0028b.f686c.f802a; i4++) {
            for (int i5 = 0; i5 < c0028b.f686c.f803b[i4]; i5++) {
                if (c0028b.f686c.f804c[i4][i5].f697c == 0) {
                    c0028b.f685b[i3] = c0028b.f686c.f804c[i4][i5].f698d;
                    i3++;
                }
            }
        }
        return c0028b.f685b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public static Object3D[] load(BufferPool[] bufferPoolArr, InputStream inputStream, int i) throws IllegalStateException, IOException {
        if ((i & 1) != 0 && (i & 2) != 0) {
            throw new IllegalArgumentException();
        }
        C0028b c0028b = new C0028b();
        c0028b.f688e = i;
        if (bufferPoolArr != null) {
            for (int i2 = 0; i2 < bufferPoolArr.length; i2++) {
                if (bufferPoolArr[i2] != null && bufferPoolArr[i2].getType() == 1) {
                    c0028b.f689f = bufferPoolArr[i2];
                    break;
                }
            }
            for (int i3 = 0; i3 < bufferPoolArr.length; i3++) {
                if (bufferPoolArr[i3] != null && bufferPoolArr[i3].getType() == 2) {
                    c0028b.f690g = bufferPoolArr[i3];
                    break;
                }
            }
            for (int i4 = 0; i4 < bufferPoolArr.length; i4++) {
                if (bufferPoolArr[i4] != null && bufferPoolArr[i4].getType() == 3) {
                    c0028b.f691h = bufferPoolArr[i4];
                    break;
                }
            }
        }
        byte[] bArr = {C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream)};
        C0028b.m414a(c0028b, inputStream);
        c0028b.f687d = 0;
        String str = new String(bArr);
        if (str.equals("MCM_")) {
            c0028b.f687d = 0;
            if (C0028b.m422d(c0028b, inputStream) == 1) {
                throw new IllegalStateException("FIXED Data type is not supported.");
            }
            byte[] bArr2 = {C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream), C0028b.m422d(c0028b, inputStream)};
            C0028b.m417a(c0028b, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, inputStream);
            m178a(c0028b);
            return c0028b.f685b;
        }
        if (str.equals("MCA_")) {
            return new Object3D[]{m176a(c0028b, inputStream)};
        }
        if (str.equals("MCT_")) {
            return new Object3D[]{m181c(c0028b, inputStream)};
        }
        if (str.equals("MCE_")) {
            return m182d(c0028b, inputStream);
        }
        throw new IOException("Not Eruption Data.");
    }

    public static Object3D[] load(BufferPool[] bufferPoolArr, byte[] bArr, int i) {
        return load(bufferPoolArr, new ByteArrayInputStream(bArr), i);
    }
}
