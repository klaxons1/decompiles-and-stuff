package p000;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: C:\Temp\jadx-9991838165078942717\classes.dex */
public class C0007g {

    /* JADX INFO: renamed from: a */
    static int[] f281a = new int[256];

    /* JADX INFO: renamed from: b */
    byte[] f282b;

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = (i2 & 1) != 0 ? (i2 >>> 1) ^ (-306674912) : i2 >>> 1;
            }
            f281a[i] = i2;
        }
    }

    public C0007g(String str) {
        try {
            this.f282b = m169a(str);
        } catch (IOException e) {
            System.err.println(new StringBuffer().append("PNGColorizer error. Error loading png image :").append(str).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private int m168a(byte[] bArr, int i, int i2) {
        int i3 = -1;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 = (i3 >>> 8) ^ f281a[(bArr[i4] ^ i3) & 255];
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    private byte[] m169a(String str) throws IOException {
        byte[] bArr;
        InputStream resourceAsStream = getClass().getResourceAsStream(str);
        byte[] bArr2 = null;
        int i = 0;
        while (true) {
            if (bArr2 == null) {
                bArr = new byte[128];
            } else {
                bArr = new byte[bArr2.length * 2];
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            }
            int i2 = resourceAsStream.read(bArr, i, bArr.length - i);
            if (i2 > 0) {
                i += i2;
            }
            if (i2 <= 0) {
                byte[] bArr3 = new byte[i];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                return bArr3;
            }
            bArr2 = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public Image m170a(int[] iArr, int i) {
        if (this.f282b == null) {
            return null;
        }
        int[] iArr2 = new int[3];
        float[] fArr = new float[3];
        byte[] bArr = new byte[this.f282b.length];
        System.arraycopy(this.f282b, 0, bArr, 0, this.f282b.length);
        int i2 = 8;
        while (i2 + 12 < bArr.length) {
            int i3 = bArr[i2 + 3] | (bArr[i2] << 24) | (bArr[i2 + 1] << 16) | (bArr[i2 + 2] << 8);
            if (bArr[i2 + 4] == 80 && bArr[i2 + 5] == 76 && bArr[i2 + 6] == 84 && bArr[i2 + 7] == 69) {
                for (int i4 = 0; i4 <= i3 / 3 && i < iArr.length; i4++) {
                    bArr[i2 + 8 + (i4 * 3)] = (byte) ((iArr[i] >> 16) & 255);
                    bArr[i2 + 9 + (i4 * 3)] = (byte) ((iArr[i] >> 8) & 255);
                    bArr[i2 + 10 + (i4 * 3)] = (byte) (iArr[i] & 255);
                    i++;
                }
                int iM168a = m168a(bArr, i2 + 4, i3 + 4);
                bArr[i2 + i3 + 8] = (byte) (iM168a >> 24);
                bArr[i2 + i3 + 9] = (byte) (iM168a >> 16);
                bArr[i2 + i3 + 10] = (byte) (iM168a >> 8);
                bArr[i2 + i3 + 11] = (byte) iM168a;
                break;
            }
            i2 += i3 + 12;
        }
        Image imageCreateImage = Image.createImage(bArr, 0, bArr.length);
        System.gc();
        return imageCreateImage;
    }
}
