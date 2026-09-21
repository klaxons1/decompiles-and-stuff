package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.IndexBuffer;
import javax.microedition.m3g.Material;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: ai */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0009ai {

    /* JADX INFO: renamed from: a */
    public VertexBuffer f96a;

    /* JADX INFO: renamed from: b */
    public IndexBuffer[] f97b;

    /* JADX INFO: renamed from: c */
    public Appearance[] f98c;

    /* JADX INFO: renamed from: a */
    private static float m81a(int i) {
        return i / 65536.0f;
    }

    /* JADX INFO: renamed from: a */
    public static C0009ai m82a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte[] bArr = new byte[4];
        dataInputStream.read(bArr, 0, 4);
        if (bArr[0] != 84 || bArr[1] != 77 || bArr[2] != 77 || bArr[3] != 72) {
            throw new IOException("Not of TMMH format");
        }
        if (dataInputStream.readByte() != 1) {
            throw new IOException("Not version 1");
        }
        C0009ai c0009ai = new C0009ai();
        while (dataInputStream.available() > 0) {
            byte b = dataInputStream.readByte();
            if (b == 1) {
                float fM81a = m81a(dataInputStream.readInt());
                short s = dataInputStream.readShort();
                short s2 = dataInputStream.readShort();
                c0009ai.f96a = new VertexBuffer();
                if ((s2 & 1) > 0) {
                    short[] sArr = new short[s * 3];
                    for (int i = 0; i < s; i++) {
                        sArr[(i * 3) + 0] = dataInputStream.readShort();
                        sArr[(i * 3) + 1] = dataInputStream.readShort();
                        sArr[(i * 3) + 2] = dataInputStream.readShort();
                    }
                    VertexArray vertexArray = new VertexArray(s, 3, 2);
                    vertexArray.set(0, s, sArr);
                    c0009ai.f96a.setPositions(vertexArray, fM81a, (float[]) null);
                }
                if ((s2 & 2) > 0) {
                    byte[] bArr2 = new byte[s * 3];
                    for (int i2 = 0; i2 < s; i2++) {
                        bArr2[(i2 * 3) + 0] = dataInputStream.readByte();
                        bArr2[(i2 * 3) + 1] = dataInputStream.readByte();
                        bArr2[(i2 * 3) + 2] = dataInputStream.readByte();
                    }
                    VertexArray vertexArray2 = new VertexArray(s, 3, 1);
                    vertexArray2.set(0, s, bArr2);
                    c0009ai.f96a.setNormals(vertexArray2);
                }
                if ((s2 & 4) > 0) {
                    byte[] bArr3 = new byte[s * 3];
                    for (int i3 = 0; i3 < s; i3++) {
                        bArr3[(i3 * 3) + 0] = dataInputStream.readByte();
                        bArr3[(i3 * 3) + 1] = dataInputStream.readByte();
                        bArr3[(i3 * 3) + 2] = dataInputStream.readByte();
                    }
                    VertexArray vertexArray3 = new VertexArray(s, 3, 1);
                    vertexArray3.set(0, s, bArr3);
                    c0009ai.f96a.setColors(vertexArray3);
                }
                if ((s2 & 8) > 0) {
                    byte[] bArr4 = new byte[s * 2];
                    for (int i4 = 0; i4 < s; i4++) {
                        bArr4[(i4 * 2) + 0] = dataInputStream.readByte();
                        bArr4[(i4 * 2) + 1] = dataInputStream.readByte();
                        bArr4[(i4 * 2) + 1] = (byte) (255 - bArr4[(i4 * 2) + 1]);
                    }
                    VertexArray vertexArray4 = new VertexArray(s, 2, 1);
                    vertexArray4.set(0, s, bArr4);
                    c0009ai.f96a.setTexCoords(0, vertexArray4, 0.007843138f, new float[]{0.003921569f, 0.003921569f});
                }
                int i5 = dataInputStream.readByte();
                c0009ai.f97b = new IndexBuffer[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = dataInputStream.readShort();
                    int[] iArr = new int[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        iArr[i8] = dataInputStream.readShort();
                    }
                    int i9 = dataInputStream.readShort();
                    int[] iArr2 = new int[i9];
                    for (int i10 = 0; i10 < i9; i10++) {
                        iArr2[i10] = dataInputStream.readShort();
                    }
                    c0009ai.f97b[i6] = new TriangleStripArray(iArr, iArr2);
                }
            } else {
                if (b != 2) {
                    throw new RuntimeException("Unknown block type");
                }
                c0009ai.f98c = new Appearance[c0009ai.f97b.length];
                boolean z = dataInputStream.readBoolean();
                byte b2 = dataInputStream.readByte();
                if (b2 != 0 && b2 != c0009ai.f98c.length) {
                    throw new IOException("color count != submesh count");
                }
                for (int i11 = 0; i11 < c0009ai.f98c.length; i11++) {
                    Appearance appearance = new Appearance();
                    PolygonMode polygonMode = new PolygonMode();
                    polygonMode.setPerspectiveCorrectionEnable(false);
                    if (z) {
                        polygonMode.setCulling(162);
                    }
                    appearance.setPolygonMode(polygonMode);
                    if (b2 != 0) {
                        int i12 = dataInputStream.readInt();
                        Material material = new Material();
                        material.setColor(2048, i12);
                        material.setColor(4096, ((((i12 >> 0) & 255) / 2) << 0) + ((((i12 >> 16) & 255) / 2) << 16) + ((((i12 >> 8) & 255) / 2) << 8));
                        appearance.setMaterial(material);
                    }
                    c0009ai.f98c[i11] = appearance;
                }
            }
        }
        return c0009ai;
    }
}
