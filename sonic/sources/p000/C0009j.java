package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
final class C0009j {

    /* JADX INFO: renamed from: b */
    private static int[] f210b = new int[C0004e.f29a.length];

    /* JADX INFO: renamed from: c */
    private static int[] f211c = new int[C0004e.f29a.length];

    /* JADX INFO: renamed from: a */
    private static C0006g[][] f209a = new C0006g[2][];

    /* JADX INFO: renamed from: a */
    private static char[][] f208a = new char[2][];

    /* JADX INFO: renamed from: d */
    private static int[] f212d = new int[2];

    /* JADX INFO: renamed from: e */
    private static int[] f213e = new int[2];

    /* JADX INFO: renamed from: f */
    private static int[] f214f = new int[2];

    /* JADX INFO: renamed from: a */
    public static int[] f207a = new int[2];

    static {
        for (int i = 0; i < C0004e.f29a.length; i++) {
            int i2 = i << 2;
            int i3 = C0004e.f33d[i2];
            int i4 = C0004e.f33d[i2 + 1];
            int i5 = C0004e.f33d[i2 + 3];
            f210b[i] = C0004e.f33d[i2 + 2] + (i3 - i5);
            f211c[i] = (i3 - i5) + i4 + 1;
        }
    }

    C0009j() {
    }

    /* JADX INFO: renamed from: a */
    public static int m76a(int i, String str) {
        return C0004e.f32c[i] == -1 ? Font.getDefaultFont().stringWidth(str) : C0004e.f29a[C0004e.f34e[i << 1]].stringWidth(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m77a(int i) {
        if (C0004e.f32c[i] != 0) {
            int i2 = C0004e.f34e[i << 1];
            f214f[i] = f210b[i2];
            f207a[i] = f211c[i2];
            f213e[i] = C0004e.f29a[i2].charWidth('W');
            return;
        }
        if (f209a[i] != null) {
            return;
        }
        try {
            int i3 = C0004e.f36g[i << 1];
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(C0005f.m24a(C0004e.f35f[(i3 << 1) + 1])));
            f212d[i] = dataInputStream.readByte();
            f213e[i] = dataInputStream.readByte();
            f214f[i] = dataInputStream.readByte();
            f207a[i] = dataInputStream.readByte() + f214f[i];
            int i4 = dataInputStream.readByte();
            f208a[i] = dataInputStream.readUTF().toCharArray();
            byte[] bArr = new byte[i4];
            short[] sArr = new short[i4 << 1];
            for (int i5 = 0; i5 < i4; i5++) {
                bArr[i5] = dataInputStream.readByte();
            }
            for (int i6 = 0; i6 < (i4 << 1); i6++) {
                sArr[i6] = dataInputStream.readShort();
            }
            byte[] bArrM24a = C0005f.m24a(C0004e.f35f[i3 << 1]);
            int i7 = C0004e.f36g[(i << 1) + 1];
            C0006g c0006g = i7 == -1 ? new C0006g(bArrM24a, new StringBuffer().append("font ").append(i).toString()) : new C0006g(RunnableC0010k.m98a(bArrM24a, C0005f.m24a(i7)), new StringBuffer().append("font ").append(i).append(" plt ").append(i7).toString());
            C0006g[] c0006gArr = new C0006g[i4];
            for (int i8 = 0; i8 < c0006gArr.length; i8++) {
                c0006gArr[i8] = new C0006g(c0006g, sArr[i8 << 1], sArr[(i8 << 1) + 1], bArr[i8], f214f[i]);
            }
            f209a[i] = c0006gArr;
            dataInputStream.close();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78a(int i, Graphics graphics, String str, int i2, int i3, int i4) {
        int i5;
        if (C0004e.f32c[i] == -1) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        int i6 = C0004e.f34e[(i << 1) + 1];
        if (i6 != -1) {
            graphics.setColor(i6);
        }
        int i7 = C0004e.f34e[i << 1];
        Font font = C0004e.f29a[i7];
        if ((i4 & 1) > 0) {
            i2 -= m76a(i7, str) >> 1;
        } else if ((i4 & 8) > 0) {
            i2 = (i2 - m76a(i7, str)) + 1;
        }
        if ((i4 & 64) > 0) {
            i5 = i3 - f214f[i];
        } else {
            i5 = (i4 & 32) > 0 ? i3 - (f214f[i] + 2) : i3;
        }
        if ((i4 & 2) > 0) {
            i5 -= f214f[i] >> 1;
        }
        graphics.setFont(font);
        graphics.drawString(str, i2, i5 - C0004e.f33d[(i7 << 2) + 3], 20);
    }
}
