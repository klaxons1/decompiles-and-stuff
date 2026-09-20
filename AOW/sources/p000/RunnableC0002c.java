package p000;

import com.nokia.mid.ui.DeviceControl;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class RunnableC0002c extends Canvas implements Runnable {

    /* JADX INFO: renamed from: d */
    static short[] f26d;

    /* JADX INFO: renamed from: e */
    static short[] f27e;

    /* JADX INFO: renamed from: g */
    static byte f28g;

    /* JADX INFO: renamed from: h */
    private static byte f29h;

    /* JADX INFO: renamed from: o */
    static byte[] f30o;

    /* JADX INFO: renamed from: a */
    private long f31a;

    /* JADX INFO: renamed from: a */
    private RunnableC0000a f32a;

    /* JADX INFO: renamed from: a */
    aow22 f33a;

    /* JADX INFO: renamed from: a */
    RunnableC0003d f34a;

    /* JADX INFO: renamed from: a */
    C0005f f35a;

    /* JADX INFO: renamed from: a */
    C0006g f36a;

    /* JADX INFO: renamed from: a */
    C0007h f37a;

    /* JADX INFO: renamed from: a */
    private C0008i f38a;

    /* JADX INFO: renamed from: a */
    private C0009j f39a;

    /* JADX INFO: renamed from: a */
    private InputStream f40a;

    /* JADX INFO: renamed from: a */
    String f41a;

    /* JADX INFO: renamed from: a */
    short[] f44a;

    /* JADX INFO: renamed from: a */
    Image[][] f47a;

    /* JADX INFO: renamed from: a */
    int[][][][] f49a;

    /* JADX INFO: renamed from: b */
    byte f50b;

    /* JADX INFO: renamed from: b */
    private long f51b;

    /* JADX INFO: renamed from: b */
    String f52b;

    /* JADX INFO: renamed from: b */
    String[] f53b;

    /* JADX INFO: renamed from: b */
    short[] f54b;

    /* JADX INFO: renamed from: c */
    byte f57c;

    /* JADX INFO: renamed from: c */
    private long f58c;

    /* JADX INFO: renamed from: c */
    short[] f61c;

    /* JADX INFO: renamed from: c */
    byte[][] f62c;

    /* JADX INFO: renamed from: d */
    byte f64d;

    /* JADX INFO: renamed from: d */
    int f65d;

    /* JADX INFO: renamed from: d */
    byte[] f66d;

    /* JADX INFO: renamed from: d */
    byte[][] f67d;

    /* JADX INFO: renamed from: d */
    short[][] f68d;

    /* JADX INFO: renamed from: e */
    byte f69e;

    /* JADX INFO: renamed from: e */
    private int f70e;

    /* JADX INFO: renamed from: e */
    byte[] f71e;

    /* JADX INFO: renamed from: e */
    short[][] f73e;

    /* JADX INFO: renamed from: f */
    byte f74f;

    /* JADX INFO: renamed from: f */
    private int f75f;

    /* JADX INFO: renamed from: f */
    private boolean f76f;

    /* JADX INFO: renamed from: f */
    short[][] f79f;

    /* JADX INFO: renamed from: g */
    int f80g;

    /* JADX INFO: renamed from: g */
    boolean f81g;

    /* JADX INFO: renamed from: h */
    int f84h;

    /* JADX INFO: renamed from: h */
    boolean f85h;

    /* JADX INFO: renamed from: i */
    byte f88i;

    /* JADX INFO: renamed from: i */
    private int f89i;

    /* JADX INFO: renamed from: i */
    boolean f90i;

    /* JADX INFO: renamed from: i */
    byte[][] f92i;

    /* JADX INFO: renamed from: j */
    byte f93j;

    /* JADX INFO: renamed from: j */
    int f94j;

    /* JADX INFO: renamed from: j */
    boolean f95j;

    /* JADX INFO: renamed from: k */
    byte f97k;

    /* JADX INFO: renamed from: k */
    int f98k;

    /* JADX INFO: renamed from: k */
    boolean f99k;

    /* JADX INFO: renamed from: l */
    byte f101l;

    /* JADX INFO: renamed from: l */
    int f102l;

    /* JADX INFO: renamed from: l */
    boolean f103l;

    /* JADX INFO: renamed from: m */
    byte f105m;

    /* JADX INFO: renamed from: m */
    int f106m;

    /* JADX INFO: renamed from: m */
    boolean f107m;

    /* JADX INFO: renamed from: n */
    byte f109n;

    /* JADX INFO: renamed from: n */
    int f110n;

    /* JADX INFO: renamed from: n */
    private boolean f111n;

    /* JADX INFO: renamed from: o */
    byte f113o;

    /* JADX INFO: renamed from: o */
    private int f114o;

    /* JADX INFO: renamed from: o */
    private boolean f115o;

    /* JADX INFO: renamed from: p */
    byte f116p;

    /* JADX INFO: renamed from: p */
    private boolean f117p;

    /* JADX INFO: renamed from: q */
    byte f118q;

    /* JADX INFO: renamed from: q */
    private boolean f119q;

    /* JADX INFO: renamed from: r */
    byte f120r;

    /* JADX INFO: renamed from: r */
    private boolean f121r;

    /* JADX INFO: renamed from: s */
    byte f122s;

    /* JADX INFO: renamed from: s */
    boolean f123s;

    /* JADX INFO: renamed from: a */
    short[][] f48a = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 18, 10);

    /* JADX INFO: renamed from: a */
    Image[] f43a = new Image[3];

    /* JADX INFO: renamed from: a */
    Graphics[] f42a = new Graphics[3];

    /* JADX INFO: renamed from: c */
    byte[] f59c = new byte[2];

    /* JADX INFO: renamed from: a */
    byte[][] f45a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 128, 128);

    /* JADX INFO: renamed from: b */
    short[][] f56b = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 128, 128);

    /* JADX INFO: renamed from: b */
    byte[][] f55b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, 51);

    /* JADX INFO: renamed from: f */
    byte[] f77f = new byte[7272];

    /* JADX INFO: renamed from: e */
    byte[][] f72e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 7, 50);

    /* JADX INFO: renamed from: f */
    byte[][] f78f = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 18, 11);

    /* JADX INFO: renamed from: c */
    short[][] f63c = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 2, 11);

    /* JADX INFO: renamed from: g */
    byte[][] f83g = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, 19);

    /* JADX INFO: renamed from: h */
    byte[][] f87h = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 3, 25);

    /* JADX INFO: renamed from: a */
    String[][] f46a = (String[][]) Array.newInstance((Class<?>) String.class, 4, 5);

    /* JADX INFO: renamed from: g */
    byte[] f82g = new byte[5];

    /* JADX INFO: renamed from: c */
    private int[] f60c = {0, 5251341, 16704820, 16033043, 12010496};

    /* JADX INFO: renamed from: h */
    private byte[] f86h = {0, 1, 1, 1, 1};

    /* JADX INFO: renamed from: i */
    private byte[] f91i = {0, 1, 1, 2, 3};

    /* JADX INFO: renamed from: j */
    private byte[] f96j = {100, 98, 0, 0, 0};

    /* JADX INFO: renamed from: k */
    private byte[] f100k = {5, 3, 1, 1, 1};

    /* JADX INFO: renamed from: l */
    private byte[] f104l = {71, 107, 115, 50, 56, 114, 116, 55};

    /* JADX INFO: renamed from: m */
    private byte[] f108m = {71, 107, 115, 50, 56, 114, 116, 55};

    /* JADX INFO: renamed from: n */
    private byte[] f112n = {42, 42, 42};

    /* JADX INFO: renamed from: t */
    byte f124t = -1;

    /* JADX INFO: renamed from: u */
    byte f126u = 0;

    /* JADX INFO: renamed from: t */
    private boolean f125t = false;

    /* JADX INFO: renamed from: u */
    boolean f127u = false;

    /* JADX INFO: renamed from: v */
    boolean f128v = false;

    public RunnableC0002c(aow22 aow22Var) {
        this.f115o = false;
        this.f117p = false;
        this.f119q = false;
        setFullScreenMode(true);
        this.f33a = aow22Var;
        this.f76f = false;
        this.f65d = 23154512;
        this.f50b = (byte) 0;
        this.f57c = (byte) 0;
        this.f64d = (byte) 0;
        this.f31a = 0L;
        this.f51b = 0L;
        this.f70e = -6;
        this.f75f = -7;
        this.f80g = 0;
        this.f84h = 0;
        this.f69e = (byte) 2;
        this.f74f = (byte) 0;
        f28g = (byte) 0;
        f29h = (byte) 0;
        this.f81g = true;
        this.f85h = true;
        this.f90i = true;
        this.f95j = true;
        this.f99k = true;
        this.f103l = true;
        this.f88i = (byte) 0;
        this.f93j = (byte) 0;
        this.f97k = (byte) 0;
        this.f101l = (byte) 0;
        this.f105m = (byte) 0;
        this.f89i = 0;
        this.f109n = (byte) 1;
        this.f113o = (byte) 0;
        this.f94j = this.f109n ^ 1;
        this.f98k = 0;
        this.f41a = "";
        this.f102l = 0;
        this.f116p = (byte) 0;
        this.f118q = (byte) 0;
        this.f114o = 0;
        this.f111n = false;
        this.f120r = (byte) -1;
        this.f107m = true;
        this.f110n = 0;
        this.f122s = (byte) 0;
        this.f115o = false;
        this.f117p = false;
        this.f119q = false;
        this.f121r = false;
    }

    /* JADX INFO: renamed from: a */
    private byte m8a(int i) {
        byte b;
        if (i == this.f70e || i == (-this.f70e) || i == 42) {
            return (byte) 10;
        }
        if (i == this.f75f || i == (-this.f75f) || i == 35) {
            return (byte) 11;
        }
        switch (i) {
            case 48:
                b = 0;
                break;
            case 49:
                b = 1;
                break;
            case 50:
            case 52:
            case 53:
            case 54:
            case 56:
            default:
                b = -1;
                break;
            case 51:
                b = 3;
                break;
            case 55:
                b = 7;
                break;
            case 57:
                b = 9;
                break;
        }
        if (b != -1) {
            return b;
        }
        int gameAction = getGameAction(i);
        if (gameAction == 8 || i == 53) {
            return (byte) 5;
        }
        if (gameAction == 1 || i == 50) {
            return (byte) 2;
        }
        if (gameAction == 6 || i == 56) {
            return (byte) 8;
        }
        if (gameAction == 2 || i == 52) {
            return (byte) 4;
        }
        if (gameAction == 5 || i == 54) {
            return (byte) 6;
        }
        return b;
    }

    /* JADX INFO: renamed from: a */
    private void m9a(int i) {
        if (i > 98) {
            i = 98;
        }
        byte[] bArr = this.f96j;
        byte[] bArr2 = this.f96j;
        byte b = (byte) i;
        this.f96j[4] = b;
        bArr2[3] = b;
        bArr[2] = b;
        for (int i2 = 0; i2 < 5; i2++) {
            this.f42a[1].setColor(this.f60c[i2]);
            this.f42a[1].fillRect(this.f86h[i2] + 85, this.f91i[i2] + 312, this.f96j[i2], this.f100k[i2]);
        }
        m11a(true);
    }

    /* JADX INFO: renamed from: a */
    static void m10a(long j) {
        if (j <= 0) {
            j = 1;
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11a(boolean z) {
        this.f111n = true;
        repaint();
        if (z) {
            while (this.f111n) {
                Thread.yield();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private int m12b() {
        int i = 0;
        try {
            i = this.f108m[this.f114o] ^ this.f40a.read();
            this.f114o = (this.f114o + 1) % this.f108m.length;
        } catch (IOException e) {
        }
        return i & 255;
    }

    /* JADX INFO: renamed from: c */
    private int m13c() {
        int i = 0;
        try {
            i = this.f104l[this.f114o] ^ this.f40a.read();
            this.f114o = (this.f114o + 1) % this.f104l.length;
            return i;
        } catch (IOException e) {
            return i;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m14c() {
        C0010k.m240gc();
        Thread.yield();
        this.f66d = new byte[5700];
        this.f44a = new short[160];
        this.f54b = new short[1000];
        this.f61c = new short[9];
        this.f40a = null;
        try {
            this.f40a = getClass().getResourceAsStream("/a");
            if (this.f40a != null) {
                this.f44a[0] = 0;
                for (int i = 0; i < 157; i++) {
                    int i2 = (this.f40a.read() & 255) + ((this.f40a.read() & 255) << 8);
                    this.f44a[i + 1] = (short) (this.f44a[i] + i2);
                    if (i2 > 0) {
                        this.f40a.read(this.f66d, this.f44a[i], i2);
                    }
                }
                for (int i3 = 0; i3 < 9; i3++) {
                    int i4 = ((this.f40a.read() & 255) << 8) + (this.f40a.read() & 255);
                    if (i3 < 8) {
                        this.f61c[i3 + 1] = (short) (this.f61c[i3] + i4);
                    }
                    for (int i5 = 0; i5 < i4; i5++) {
                        this.f54b[this.f61c[i3] + i5] = (short) ((this.f40a.read() & 255) + ((this.f40a.read() & 255) << 8));
                    }
                }
            }
            this.f40a.close();
            this.f40a = null;
            this.f40a = getClass().getResourceAsStream("/d");
            if (this.f40a != null) {
                for (int i6 = 0; i6 < 4; i6++) {
                    this.f40a.read();
                }
                for (int i7 = 157; i7 < 160; i7++) {
                    short s = 47;
                    switch (i7) {
                        case 158:
                            s = 46;
                            break;
                        case 159:
                            s = 129;
                            break;
                    }
                    if (i7 < 159) {
                        this.f44a[i7 + 1] = (short) (this.f44a[i7] + s + 10);
                    }
                    this.f40a.read(this.f66d, this.f44a[i7], s);
                }
            }
            this.f40a.close();
            this.f40a = null;
        } catch (IOException e) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m15d() {
        C0010k.m240gc();
        Thread.yield();
        this.f40a = null;
        this.f114o = 0;
        try {
            this.f40a = getClass().getResourceAsStream("f");
            if (this.f40a != null) {
                try {
                    this.f52b = "";
                    while (true) {
                        int i = this.f40a.read();
                        if (i == -1) {
                            break;
                        } else {
                            this.f52b = new StringBuffer().append(this.f52b).append((char) (i & 255)).toString();
                        }
                    }
                } catch (Exception e) {
                }
            }
            this.f40a.close();
            this.f40a = null;
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: e */
    private void m16e() {
        this.f36a.f452b = this.f35a;
        this.f36a.f453b = this.f39a;
        this.f35a.f265c = this.f36a;
        this.f36a.f451b = this.f34a;
        C0010k.m240gc();
        Thread.yield();
        this.f40a = null;
        this.f114o = 0;
        try {
            this.f40a = getClass().getResourceAsStream("u");
            if (this.f40a != null) {
                try {
                    this.f37a.f557i = new String[m13c()];
                    for (int i = 0; i < this.f37a.f557i.length; i++) {
                        int iM13c = m13c();
                        this.f37a.f557i[i] = "";
                        for (int i2 = 0; i2 < iM13c; i2++) {
                            StringBuffer stringBuffer = new StringBuffer();
                            String[] strArr = this.f37a.f557i;
                            strArr[i] = stringBuffer.append(strArr[i]).append((char) m13c()).toString();
                        }
                    }
                } catch (Exception e) {
                }
            }
            this.f40a.close();
            this.f40a = null;
        } catch (Exception e2) {
        }
        m15d();
        C0006g c0006g = this.f36a;
        this.f37a.m222aO();
        this.f34a.f130b = this.f36a;
        this.f36a.f450b = this.f32a;
        this.f32a.f16b = this.f36a.f426ar;
        C0007h c0007h = this.f37a;
        c0007h.f562p = c0007h.f552a.getAppProperty("MIDlet-Version");
        this.f102l = Integer.parseInt(new StringBuffer().append(c0007h.f562p.substring(0, 1)).append(c0007h.f562p.substring(2, 3)).append(c0007h.f562p.substring(4, 6)).toString());
        this.f41a = this.f37a.f562p;
        byte[] bArr = this.f66d;
        short s = this.f44a[90];
        bArr[s] = (byte) (bArr[s] | 8);
        for (int i3 = 0; i3 < 3; i3++) {
            this.f39a.m236r(i3);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m17f() {
        if (this.f36a.f379aH == 2) {
            this.f81g = false;
        }
        switch (this.f105m) {
            case 0:
                C0006g c0006g = this.f36a;
                if (c0006g.f407ai != -1) {
                    c0006g.f429at = (byte) 0;
                    if ((c0006g.f365aB[c0006g.f546p[87] + (c0006g.f501bs >> 3)] & (1 << (c0006g.f501bs & 7))) != 0 || (c0006g.f501bs == 2 && c0006g.f508bz >= 138)) {
                        c0006g.m218e(false);
                        c0006g.f344J = false;
                    } else {
                        c0006g.m217e(2152, 0, 0);
                        c0006g.f344J = true;
                    }
                    c0006g.f407ai = (byte) -1;
                }
                c0006g.f429at = (byte) 1;
                c0006g.f455b[c0006g.f429at].drawImage(c0006g.f519d.f43a[0], 0, 0, 0);
                if (c0006g.f533h >= 0) {
                    c0006g.m221o(c0006g.f533h, 120, 160, c0006g.f432au, -1);
                } else if (c0006g.f501bs == 12 || c0006g.f501bs == 9) {
                    c0006g.m220n(141, 120, 160, 1, 0);
                } else if (c0006g.f501bs == 46 || c0006g.f501bs == 84 || c0006g.f501bs == 87) {
                    c0006g.m220n(138, 120, 160, 1, 0);
                } else if (c0006g.f501bs == 62) {
                    c0006g.m220n(142, 120, 160, 1, 0);
                } else if (c0006g.f501bs == 18) {
                    c0006g.m220n(140, 120, 160, 1, 0);
                } else if (c0006g.f501bs == 8) {
                    c0006g.m220n(143, 120, 160, 1, 0);
                } else if ((c0006g.f365aB[c0006g.f546p[89] + (c0006g.f501bs >> 3)] & (1 << (c0006g.f501bs & 7))) == 0) {
                    c0006g.f340H = false;
                    c0006g.m220n(139, 120, 160, 1, 0);
                    c0006g.m217e(Math.max((c0006g.f492bj - 40) / 10, 0) + 1890, 30, (((c0006g.f517ch + (c0006g.f496bn * 6)) + 3) - 2) - 60);
                } else {
                    c0006g.f340H = true;
                    c0006g.m220n(139, 120, 160, 1, 0);
                }
                c0006g.m220n(144, 0, 320, 1, 0);
                break;
            case 1:
                this.f36a.m218e(true);
                break;
            case 2:
                this.f36a.m208aB();
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m18g() {
        int i;
        int i2 = this.f112n[0];
        this.f47a = (Image[][]) Array.newInstance((Class<?>) Image.class, 1, i2);
        int[] iArr = new int[17415];
        byte[] bArr = new byte[17415];
        byte[] bArr2 = new byte[33000];
        int i3 = 0;
        int i4 = 0;
        while (i4 <= 0) {
            new StringBuffer("Load images /i\tIMG_COUNT:").append(i2);
            try {
                DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream(new StringBuffer("/i").append(i4).toString()));
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 >= (i2 << 1) || (i = dataInputStream.readByte() & 255) == 255) {
                        break;
                    }
                    int i7 = (i << 16) | ((dataInputStream.readByte() & 255) << 8) | (dataInputStream.readByte() & 255);
                    if (i7 > 0) {
                        dataInputStream.read(bArr2, 0, i7);
                    }
                    if (i7 > 0) {
                        if ((i3 & 1) == 0) {
                            try {
                                this.f47a[0][i3 >> 1] = Image.createImage(bArr2, 0, i7);
                            } catch (Exception e) {
                            }
                        } else {
                            Image imageCreateImage = Image.createImage(bArr2, 0, i7);
                            int width = this.f47a[0][i3 >> 1].getWidth();
                            int height = this.f47a[0][i3 >> 1].getHeight();
                            imageCreateImage.getRGB(iArr, 0, width, 0, 0, width, height);
                            for (int i8 = 0; i8 < width * height; i8++) {
                                bArr[i8] = (byte) iArr[i8];
                            }
                            this.f47a[0][i3 >> 1].getRGB(iArr, 0, width, 0, 0, width, height);
                            for (int i9 = 0; i9 < width * height; i9++) {
                                iArr[i9] = (bArr[i9] << 24) | (iArr[i9] & 16777215);
                            }
                            this.f47a[0][i3 >> 1] = null;
                            C0010k.m240gc();
                            m10a(10L);
                            this.f47a[0][i3 >> 1] = Image.createRGBImage(iArr, width, height, true);
                        }
                    }
                    C0010k.m240gc();
                    m10a(10L);
                    Thread.yield();
                    i3++;
                    i5 = i6 + 1;
                }
                dataInputStream.close();
                C0010k.m240gc();
            } catch (Exception e2) {
            }
            i4++;
            i3 = i3;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m19h() {
        try {
            DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream("/d0"));
            this.f92i = new byte[26][];
            this.f79f = new short[18][];
            for (int i = 0; i < 26; i++) {
                int i2 = dataInputStream.readShort();
                this.f92i[i] = new byte[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    this.f92i[i][i3] = dataInputStream.readByte();
                }
            }
            for (int i4 = 0; i4 < 18; i4++) {
                int i5 = dataInputStream.readShort();
                this.f79f[i4] = new short[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f79f[i4][i6] = dataInputStream.readShort();
                }
            }
            dataInputStream.close();
            C0010k.m240gc();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: i */
    private void m20i() {
        try {
            DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream("/ml"));
            int i = dataInputStream.readByte();
            this.f68d = new short[i][];
            this.f73e = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, 30);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = dataInputStream.readShort();
                this.f68d[i2] = new short[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f68d[i2][i4] = dataInputStream.readShort();
                }
                for (int i5 = 0; i5 < 30; i5++) {
                    this.f73e[i2][i5] = dataInputStream.readShort();
                }
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: m */
    private void m21m() {
        if (f28g < 2 || this.f105m == 0) {
            f28g = (byte) (((((f28g & 1) ^ (this.f36a.f501bs & 1)) ^ (this.f36a.f486bd & 1)) ^ (this.f36a.f409aj & 1)) ^ (this.f36a.f411ak & 1));
        }
        if (this.f38a == null || this.f38a.m226h() <= 100 || f28g != f29h) {
            f29h = f28g;
            m29n();
            new StringBuffer("/s").append((int) f28g);
            this.f38a = new C0008i("audio/midi");
        }
        C0008i c0008i = this.f38a;
        byte b = this.f74f;
        try {
            if (c0008i.f564a != null) {
                c0008i.f565a = c0008i.f564a.getControl("VolumeControl");
                if (b == 0) {
                    c0008i.m225aQ();
                } else {
                    c0008i.f565a.setLevel(b * 20);
                    if (c0008i.f564a.getState() != 400) {
                        c0008i.m224aP();
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: o */
    private void m22o() {
        m10a(10L);
        if (this.f117p) {
            this.f36a.m216b((byte) 1);
        }
        if (this.f117p) {
            while (this.f115o) {
                Thread.yield();
                m10a(10L);
            }
        }
        this.f117p = false;
        this.f121r = false;
        if (this.f74f == 2) {
            if (this.f38a == null || !(this.f38a == null || this.f38a.m226h() == 400)) {
                m21m();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m23a(String str) {
        C0010k.m240gc();
        Thread.yield();
        this.f40a = null;
        try {
            this.f40a = getClass().getResourceAsStream(str);
            if (this.f40a != null) {
                try {
                    this.f89i = 0;
                    while (true) {
                        int i = this.f40a.read();
                        if (i == -1) {
                            break;
                        }
                        this.f36a.f426ar[this.f89i] = (byte) i;
                        this.f89i++;
                    }
                } catch (Exception e) {
                }
            }
            this.f40a.close();
            this.f40a = null;
        } catch (IOException e2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m24b() {
        this.f76f = false;
        this.f32a.f8a = false;
        this.f33a.notifyDestroyed();
    }

    /* JADX INFO: renamed from: b */
    final void m25b(int i) {
        C0010k.m240gc();
        Thread.yield();
        this.f40a = null;
        this.f114o = 0;
        try {
            this.f40a = getClass().getResourceAsStream("n");
            if (this.f40a != null) {
                try {
                    this.f118q = (byte) m12b();
                    int iM12b = m12b();
                    if (i == 0) {
                        this.f53b = new String[iM12b];
                    }
                    int i2 = 0;
                    while (i2 < iM12b) {
                        if (i == 0) {
                            this.f53b[i2] = "";
                        }
                        int iM12b2 = m12b();
                        for (int i3 = 0; i3 < iM12b2; i3++) {
                            if (i == 0) {
                                StringBuffer stringBuffer = new StringBuffer();
                                String[] strArr = this.f53b;
                                strArr[i2] = stringBuffer.append(strArr[i2]).append((char) m12b()).toString();
                            } else {
                                m12b();
                            }
                        }
                        int iM12b3 = m12b();
                        for (int i4 = 0; i4 < iM12b3; i4++) {
                            int iM12b4 = m12b();
                            boolean z = i == 1 && i2 == this.f116p;
                            for (int i5 = 0; i5 < 4; i5++) {
                                if (z) {
                                    this.f46a[i5][iM12b4] = "";
                                }
                                int iM12b5 = m12b();
                                for (int i6 = 0; i6 < iM12b5; i6++) {
                                    if (z) {
                                        StringBuffer stringBuffer2 = new StringBuffer();
                                        String[] strArr2 = this.f46a[i5];
                                        strArr2[iM12b4] = stringBuffer2.append(strArr2[iM12b4]).append((char) m12b()).toString();
                                    } else {
                                        m12b();
                                    }
                                }
                            }
                            if (z) {
                                this.f82g[iM12b4] = (byte) m12b();
                            } else {
                                m12b();
                            }
                        }
                        i2++;
                    }
                    if (i == 2) {
                        int i7 = 0;
                        while (i7 < iM12b) {
                            boolean z2 = i7 == this.f116p;
                            int iM12b6 = m12b() + (m12b() << 8);
                            for (int i8 = 0; i8 < iM12b6; i8++) {
                                if (z2) {
                                    int iM12b7 = m12b();
                                    this.f39a.f570M[1][this.f39a.f611m[1][221] + i8] = this.f66d[this.f44a[139] + iM12b7];
                                    this.f39a.f571N[1][this.f39a.f611m[1][221] + i8] = this.f66d[iM12b7 + this.f44a[140]];
                                } else {
                                    m12b();
                                }
                            }
                            if (z2) {
                                short[] sArr = this.f39a.f611m[1];
                                sArr[221] = (short) (sArr[221] + iM12b6);
                                break;
                            }
                            i7++;
                        }
                    }
                } catch (Exception e) {
                    this.f33a.platformRequest(this.f37a.f559m);
                    m24b();
                }
            }
            this.f40a.close();
            this.f40a = null;
        } catch (Exception e2) {
            try {
                this.f33a.platformRequest(this.f37a.f559m);
            } catch (Exception e3) {
            }
            m24b();
        }
    }

    public final void hideNotify() {
        m26j();
    }

    /* JADX INFO: renamed from: j */
    public final void m26j() {
        this.f115o = true;
        this.f117p = true;
        if (this.f119q && !this.f121r) {
            m29n();
        }
        this.f121r = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m27k() {
        this.f115o = false;
    }

    protected final void keyPressed(int i) {
        byte b = this.f120r;
        this.f120r = m8a(i);
        if ((this.f120r == 5 || this.f120r == 1 || this.f120r == 3 || this.f120r == 7 || this.f120r == 9) && this.f105m == 1) {
            if (this.f122s == 0) {
                this.f122s = (byte) 3;
            } else {
                this.f122s = (byte) 4;
            }
        }
        if (this.f120r != -1) {
            this.f107m = false;
            this.f110n = 0;
        } else {
            this.f120r = b;
        }
        C0010k.currentTimeMillis();
    }

    protected final void keyReleased(int i) {
        if (this.f120r != m8a(i)) {
            return;
        }
        this.f107m = true;
        if (this.f110n <= 0 || this.f120r == -1 || ((1 << this.f120r) & 3754) != 0) {
            return;
        }
        this.f120r = (byte) -1;
    }

    /* JADX INFO: renamed from: l */
    final void m28l() {
        this.f74f = (byte) 2;
        m21m();
    }

    /* JADX INFO: renamed from: n */
    final void m29n() {
        if (this.f38a != null) {
            this.f38a.m225aQ();
            C0008i c0008i = this.f38a;
            if (c0008i.f564a != null && c0008i.f564a.getState() != 0) {
                c0008i.f564a.close();
            }
            this.f38a = null;
        }
    }

    protected final void paint(Graphics graphics) {
        if (this.f81g) {
            graphics.drawImage(this.f43a[1], this.f80g - 15, this.f84h - 10, 0);
        } else {
            graphics.drawImage(this.f43a[1], -15, -10, 0);
        }
        this.f84h = 0;
        this.f80g = 0;
        this.f111n = false;
    }

    protected final void pointerDragged(int i, int i2) {
    }

    protected final void pointerPressed(int i, int i2) {
    }

    protected final void pointerReleased(int i, int i2) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        for (int i = 0; i < this.f108m.length; i++) {
            try {
                byte[] bArr = this.f108m;
                bArr[i] = (byte) (bArr[i] ^ ((byte) "6290".charAt(i % 4)));
            } catch (Exception e) {
                return;
            }
        }
        this.f43a[1] = Image.createImage(270, 340);
        this.f42a[1] = this.f43a[1].getGraphics();
        byte b = 0;
        while (b < 3) {
            try {
                this.f42a[1].setColor(b != 1 ? 16777215 : 4156);
                this.f42a[1].fillRect(0, 0, 270, 340);
                this.f42a[1].drawImage(Image.createImage(new StringBuffer("/l").append((int) b).toString()), 135, 170, 3);
                z = true;
            } catch (IOException e2) {
                z = false;
            }
            if (b == 0) {
                this.f33a.f23a.setCurrent(this);
            } else if (z) {
                repaint();
            }
            if (z) {
                m10a(b == 0 ? 2000L : b == 1 ? 2000 : 50);
            }
            b = (byte) (b + 1);
        }
        m9a(5);
        m18g();
        C0010k.m240gc();
        m10a(10L);
        m19h();
        C0010k.m240gc();
        m10a(10L);
        m20i();
        this.f43a[0] = Image.createImage(270, 340);
        this.f42a[0] = this.f43a[0].getGraphics();
        this.f62c = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 128, 128);
        this.f71e = new byte[90];
        this.f67d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 7, 90);
        if (this.f88i < 2) {
            this.f49a = (int[][][][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 2, 4, 128);
        }
        m14c();
        m9a(50);
        this.f36a = new C0006g(this);
        m9a(60);
        this.f35a = new C0005f(this);
        m9a(70);
        this.f39a = new C0009j(this);
        m9a(80);
        this.f34a = new RunnableC0003d();
        m9a(90);
        this.f37a = new C0007h(this.f33a, this);
        m9a(95);
        this.f74f = (byte) 0;
        try {
            C0010k.m240gc();
            Thread.yield();
            f26d = new short[]{10550, 7710, 8424};
            f27e = new short[]{0, 10550, 18260};
            f30o = new byte[26684];
            InputStream resourceAsStream = getClass().getResourceAsStream("/s0");
            resourceAsStream.read(f30o, 0, 26684);
            resourceAsStream.close();
        } catch (Exception e3) {
        }
        this.f32a = new RunnableC0000a(this);
        m9a(100);
        m16e();
        this.f36a.m210aK();
        this.f36a.m211aM();
        this.f119q = true;
        this.f76f = true;
        this.f65d = 0;
        DeviceControl.setLights(0, 75);
        while (this.f76f) {
            long jCurrentTimeMillis = C0010k.currentTimeMillis();
            if (this.f58c + 1000 < jCurrentTimeMillis && this.f105m == 1 && this.f32a.f0a == 2) {
                this.f36a.m216b((byte) 71);
            }
            if (!this.f125t && this.f126u == 0) {
                this.f31a = jCurrentTimeMillis;
                m22o();
                this.f93j = this.f35a.f323z;
                this.f97k = this.f35a.f147A;
            }
            try {
                if (this.f32a.f0a == -1 && this.f124t != -1) {
                    if (this.f32a.f1a < 0) {
                        this.f32a.f1a = 0;
                        this.f32a.m4a();
                        this.f105m = (byte) 0;
                        this.f36a.m207a(74, true);
                        this.f124t = (byte) -1;
                        this.f123s = true;
                        this.f126u = (byte) 0;
                        this.f120r = (byte) -1;
                    }
                    switch (this.f124t) {
                        case 0:
                            C0006g c0006g = this.f36a;
                            c0006g.f450b.f0a = (byte) 2;
                            c0006g.f519d.f124t = (byte) 8;
                            break;
                        case 1:
                            this.f36a.m204Y();
                            break;
                        case 2:
                            C0006g c0006g2 = this.f36a;
                            c0006g2.f519d.f123s = false;
                            if (c0006g2.f501bs != 71) {
                                c0006g2.m207a(9, true);
                            } else {
                                c0006g2.f519d.f127u = true;
                            }
                            this.f124t = (byte) -1;
                            break;
                        case 3:
                            this.f36a.m205Z();
                            this.f124t = (byte) -1;
                            break;
                        case 5:
                            if (this.f36a.m219f()) {
                                this.f124t = (byte) -1;
                            }
                            break;
                        case 6:
                            C0006g c0006g3 = this.f36a;
                            if (c0006g3.f450b.f21e) {
                                c0006g3.f519d.f106m = c0006g3.f430at;
                                c0006g3.m202W();
                            } else {
                                c0006g3.m207a(68, true);
                                c0006g3.f519d.f124t = (byte) -1;
                            }
                            break;
                        case 7:
                            C0006g c0006g4 = this.f36a;
                            if (c0006g4.f501bs == 73) {
                                c0006g4.f450b.m4a();
                                c0006g4.f519d.f124t = (byte) -1;
                            } else {
                                c0006g4.f450b.f0a = (byte) 2;
                                c0006g4.f519d.f124t = (byte) 3;
                            }
                            break;
                        case 8:
                            this.f36a.m203X();
                            break;
                        case 9:
                            C0006g c0006g5 = this.f36a;
                            c0006g5.f450b.f0a = (byte) 2;
                            c0006g5.f519d.f124t = (byte) 11;
                            break;
                        case 10:
                            C0006g c0006g6 = this.f36a;
                            c0006g6.f450b.f0a = (byte) 2;
                            c0006g6.f519d.f124t = (byte) 1;
                            break;
                        case 11:
                            this.f36a.m202W();
                            break;
                    }
                }
                this.f125t = false;
                if (!this.f127u || this.f94j >= 0 || this.f123s || (this.f36a.f349O && this.f32a.f0a != -1)) {
                    boolean z2 = this.f105m == 0;
                    this.f36a.m213ac();
                    if (!(z2 && this.f105m != 0 && this.f98k == 0)) {
                        m17f();
                    }
                } else {
                    if (this.f32a.f0a == -1 && this.f94j < 0 && this.f126u == 0 && this.f113o != 0) {
                        this.f36a.m201V();
                        this.f126u = (byte) 1;
                        this.f125t = true;
                        this.f58c = C0010k.currentTimeMillis();
                    }
                    if (this.f32a.f0a == -1 && !this.f125t && (this.f94j >= 0 || ((this.f126u == 0 && this.f113o == 0) || (this.f126u == 1 && this.f113o != 0)))) {
                        this.f36a.m213ac();
                    }
                    if (this.f32a.f0a == -1 && this.f94j < 0 && !this.f125t) {
                        if (this.f113o == 0) {
                            if (this.f126u == 0) {
                                this.f36a.m200U();
                                this.f126u = (byte) 1;
                                this.f125t = true;
                            } else if (this.f126u == 1) {
                                this.f36a.m201V();
                                this.f126u = (byte) 2;
                                this.f125t = true;
                                this.f58c = C0010k.currentTimeMillis();
                                m17f();
                            }
                        } else if (this.f126u == 1) {
                            this.f36a.m200U();
                            this.f126u = (byte) 2;
                            this.f125t = true;
                            m17f();
                        }
                    }
                }
            } catch (Exception e4) {
            }
            if (this.f32a.f0a == -1 && !this.f125t && this.f94j < 0 && this.f126u == 2 && this.f105m == 0 && this.f36a.f501bs == 71 && this.f128v) {
                this.f105m = (byte) 1;
                this.f36a.f407ai = (byte) 4;
                if (this.f36a.f526f >= 0) {
                    this.f36a.f501bs = -1;
                    if (this.f36a.f526f == 139) {
                        this.f36a.f340H = true;
                        this.f36a.f508bz = this.f36a.f400aV;
                    }
                    this.f36a.f486bd = this.f36a.f401aW;
                    if (this.f36a.f526f == 139 || this.f36a.f526f == 137) {
                        this.f36a.f345K = true;
                    }
                }
            }
            if (!this.f127u || this.f123s || (this.f32a.f0a == -1 && !this.f125t && (this.f94j >= 0 || this.f126u == 2))) {
                try {
                    switch (this.f105m) {
                        case 1:
                            this.f35a.m110v();
                            break;
                        case 2:
                            if (this.f94j < 0) {
                                this.f35a.m110v();
                            }
                            break;
                    }
                } catch (Exception e5) {
                }
                this.f126u = (byte) 0;
            }
            if (!this.f125t && (this.f126u == 0 || (this.f36a.f349O && this.f32a.f0a != -1))) {
                m11a(true);
                this.f51b = C0010k.currentTimeMillis();
            }
            if (this.f125t || (this.f126u != 0 && (!this.f36a.f349O || this.f32a.f0a == -1))) {
                m10a(1L);
            } else if (this.f81g && this.f105m == 1) {
                m10a(50 - (this.f51b - this.f31a));
                this.f31a = C0010k.currentTimeMillis();
                this.f36a.m218e(true);
                m11a(false);
                this.f35a.m105d(false);
                this.f35a.m96G();
                while (this.f111n) {
                    Thread.yield();
                }
                this.f51b = C0010k.currentTimeMillis();
                m10a(50 - (this.f51b - this.f31a));
            } else {
                m10a(100 - (this.f51b - this.f31a));
            }
        }
    }

    public final void showNotify() {
        this.f115o = false;
    }
}
