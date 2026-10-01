package p000;

import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Transform;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
public final class C0002c {

    /* JADX INFO: renamed from: a */
    static int f68a;

    /* JADX INFO: renamed from: a */
    static short f74a;

    /* JADX INFO: renamed from: b */
    private static int f77b;

    /* JADX INFO: renamed from: c */
    private static int f80c;

    /* JADX INFO: renamed from: d */
    private static int f82d;

    /* JADX INFO: renamed from: j */
    private static float f87j;

    /* JADX INFO: renamed from: k */
    private static float f88k;

    /* JADX INFO: renamed from: l */
    private static float f89l;

    /* JADX INFO: renamed from: a */
    byte f91a;

    /* JADX INFO: renamed from: a */
    float f92a;

    /* JADX INFO: renamed from: a */
    boolean f93a;

    /* JADX INFO: renamed from: b */
    byte f94b;

    /* JADX INFO: renamed from: b */
    float f95b;

    /* JADX INFO: renamed from: b */
    public short f96b;

    /* JADX INFO: renamed from: b */
    boolean f97b;

    /* JADX INFO: renamed from: b */
    float[] f98b;

    /* JADX INFO: renamed from: c */
    byte f99c;

    /* JADX INFO: renamed from: c */
    float f100c;

    /* JADX INFO: renamed from: c */
    public short f101c;

    /* JADX INFO: renamed from: c */
    boolean f102c;

    /* JADX INFO: renamed from: c */
    float[] f103c;

    /* JADX INFO: renamed from: d */
    private byte f104d;

    /* JADX INFO: renamed from: d */
    float f105d;

    /* JADX INFO: renamed from: d */
    float[] f106d;

    /* JADX INFO: renamed from: e */
    private byte f107e;

    /* JADX INFO: renamed from: e */
    float f108e;

    /* JADX INFO: renamed from: e */
    private boolean f109e;

    /* JADX INFO: renamed from: e */
    public float[] f110e;

    /* JADX INFO: renamed from: f */
    float f111f;

    /* JADX INFO: renamed from: f */
    private boolean f112f;

    /* JADX INFO: renamed from: g */
    float f113g;

    /* JADX INFO: renamed from: h */
    float f114h;

    /* JADX INFO: renamed from: i */
    float f115i;

    /* JADX INFO: renamed from: i */
    private float[] f116i;

    /* JADX INFO: renamed from: n */
    private float f117n;

    /* JADX INFO: renamed from: o */
    private float f118o;

    /* JADX INFO: renamed from: p */
    private float f119p;

    /* JADX INFO: renamed from: q */
    private float f120q;

    /* JADX INFO: renamed from: r */
    private float f121r;

    /* JADX INFO: renamed from: s */
    private float f122s;

    /* JADX INFO: renamed from: a */
    private static Background f69a = new Background();

    /* JADX INFO: renamed from: a */
    private static Graphics3D f71a = Graphics3D.getInstance();

    /* JADX INFO: renamed from: a */
    private static Camera f70a = new Camera();

    /* JADX INFO: renamed from: a */
    private static final C0010k f73a = new C0010k();

    /* JADX INFO: renamed from: b */
    private static final C0010k f78b = new C0010k();

    /* JADX INFO: renamed from: c */
    private static final C0010k f81c = new C0010k();

    /* JADX INFO: renamed from: a */
    private static final Transform f72a = new Transform();

    /* JADX INFO: renamed from: d */
    private static boolean f83d = false;

    /* JADX INFO: renamed from: m */
    private static float f90m = 60.0f;

    /* JADX INFO: renamed from: a */
    static byte[] f75a = {77, 73, 68, 108, 101, 116, 45, 67, 76, 68, 67};

    /* JADX INFO: renamed from: b */
    static byte[] f79b = {47, 77, 69, 84, 65, 45, 73, 78, 70, 47, 77, 65, 78, 73, 70, 69, 83, 84, 46, 77, 70};

    /* JADX INFO: renamed from: f */
    private static final float[] f84f = {110.0f, 300.0f, 110.0f, 110.0f, 300.0f, 300.0f, 300.0f, 300.0f, 110.0f, 150.0f, 110.0f};

    /* JADX INFO: renamed from: g */
    private static final float[] f85g = {0.5f, 0.2f, 1.0f, 1.0f, 0.2f, 0.2f, 0.2f, 0.2f, 1.0f, 0.4f, 1.0f};

    /* JADX INFO: renamed from: h */
    private static final float[] f86h = {4.4f, 7.2f, 4.4f, 4.4f, 8.5f, 7.2f, 7.2f, 7.2f, 4.4f, 4.6f, 4.4f};

    /* JADX INFO: renamed from: a */
    static final float[] f76a = {350.0f, 250.0f};

    /* JADX INFO: renamed from: a */
    static int m24a(MIDlet mIDlet, Hashtable hashtable, String str, int i) {
        boolean z;
        String str2;
        int iM3a = C0000a.m3a();
        String str3 = (String) C0009j.f351a.get(str);
        if (str3 == null) {
            int i2 = -iM3a;
            hashtable.put(new String(C0007h.f226b), new StringBuffer().append("").append(i2).toString());
            return i2;
        }
        try {
            String str4 = new String(C0007h.f226b);
            String appProperty = mIDlet.getAppProperty(str4);
            String str5 = new String(C0004e.m53a(str3, i, false));
            boolean zEquals = str5.equals(new String(C0000a.f14a));
            if (zEquals) {
                return iM3a;
            }
            if (appProperty.startsWith(new String(C0013n.f498b)) && appProperty.startsWith(new String(C0013n.f498b))) {
                if (appProperty.startsWith(new String(C0013n.f498b))) {
                    appProperty = appProperty.substring(C0013n.f498b.length);
                }
                if (appProperty.startsWith(new String(RunnableC0008i.f290a))) {
                    appProperty = appProperty.substring(RunnableC0008i.f290a.length);
                }
                String[] strArrM195a = C0011l.m195a(appProperty, '/');
                String[] strArrM195a2 = C0011l.m195a(str5, '$');
                int i3 = 0;
                while (true) {
                    if (i3 >= strArrM195a2.length) {
                        z = zEquals;
                        str2 = appProperty;
                        break;
                    }
                    if (strArrM195a[0].indexOf(strArrM195a2[i3]) >= 0) {
                        z = true;
                        str2 = appProperty;
                        break;
                    }
                    i3++;
                }
            } else {
                z = zEquals;
                str2 = appProperty;
            }
            byte[] bArr = new byte[str2.length()];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i6 < bArr.length) {
                if (i4 >= str4.length()) {
                    i4 = 0;
                }
                bArr[i6] = (byte) (str4.charAt(i4) & str2.charAt(i6));
                if (bArr[i6] == 0) {
                    i5++;
                }
                i6++;
                i4++;
            }
            int i7 = z ? (-(i5 * str4.length())) - iM3a : iM3a;
            try {
                hashtable.put(str4, new StringBuffer().append("").append(i7).toString());
                return i7;
            } catch (Exception e) {
                return i7;
            }
        } catch (Exception e2) {
            return iM3a;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m25a(float f, int i, int i2, float f2, float f3) {
        f90m = f;
        f70a.setPerspective(f90m, i / i2, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    private void m26a(int i, boolean z) {
        if (this.f107e == -1) {
            i--;
        }
        int i2 = this.f96b + (this.f107e * i);
        if (i2 >= C0013n.f537g) {
            i2 -= C0013n.f537g;
        } else if (i2 < 0) {
            i2 += C0013n.f537g;
        }
        this.f116i[0] = C0013n.m233a(0, i2, (int) this.f104d);
        this.f116i[1] = C0013n.m233a(1, i2, (int) this.f104d);
        this.f116i[2] = C0013n.m233a(2, i2, (int) this.f104d);
        if (z) {
            this.f112f = true;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m27a(Graphics graphics, C0010k c0010k, int i, int i2, int i3, int i4, int i5) {
        if (f83d) {
            m32b();
        }
        f80c = i4;
        f82d = i5;
        f77b = i;
        f71a.bindTarget(graphics, true, 0);
        f71a.setViewport(i2, i3, i4, i5);
        f71a.clear(f69a);
        if (c0010k != null) {
            f87j = c0010k.m143a(3);
            f88k = c0010k.m143a(7);
            f89l = c0010k.m143a(11);
            f73a.m151a(c0010k);
            f73a.m150a(3, 0);
            f73a.m150a(7, 0);
            f73a.m150a(11, 0);
            if (f77b != 0) {
                f73a.m147a(90.0f * f77b, 0.0f, 0.0f, 1.0f);
            }
            f73a.m153b();
        } else {
            f73a.m144a();
        }
        f83d = true;
    }

    /* JADX INFO: renamed from: a */
    static void m28a(C0010k c0010k) {
        float fM164a = C0011l.m164a(f90m * 0.5f);
        float f = (f80c * fM164a) / f82d;
        c0010k.m144a();
        c0010k.m150a(0, (int) (16384.0f / f));
        c0010k.m150a(5, (int) (16384.0f / fM164a));
        c0010k.m150a(10, 0);
        c0010k.m150a(14, -16384);
        c0010k.m150a(15, 0);
        if (f77b != 0) {
            c0010k.m147a((-90.0f) * f77b, 0.0f, 0.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m29a(float[] fArr, float f, float f2, int i) {
        float fM232a;
        float fM232a2;
        float fM232a3;
        if (i + 1 < C0013n.f537g) {
            fM232a = C0013n.m232a(0, i + 1);
            fM232a2 = C0013n.m232a(1, i + 1);
            fM232a3 = C0013n.m232a(2, i + 1);
        } else {
            fM232a = C0013n.m232a(0, 0);
            fM232a2 = C0013n.m232a(1, 0);
            fM232a3 = C0013n.m232a(2, 0);
        }
        float fM232a4 = C0013n.m232a(0, i);
        float fM232a5 = C0013n.m232a(2, i);
        float fM232a6 = C0013n.m232a(1, i);
        float f3 = fM232a - fM232a4;
        float f4 = fM232a3 - fM232a5;
        fArr[3] = (((f - fM232a4) * f3) + ((f2 - fM232a5) * f4)) / C0011l.m198b((f3 * f3) + (f4 * f4));
        fArr[0] = (f3 * fArr[3]) + fM232a4;
        fArr[1] = ((fM232a2 - fM232a6) * fArr[3]) + fM232a6;
        fArr[2] = (f4 * fArr[3]) + fM232a5;
    }

    /* JADX INFO: renamed from: a */
    static boolean m30a(int i) {
        boolean z = true;
        switch (i) {
            case 0:
                if (C0000a.f22b <= 0 || C0000a.f22b >= 500) {
                    z = false;
                }
                break;
            case 1:
                if (C0001b.f56a <= 0 || C0001b.f56a >= 500) {
                    z = false;
                }
                break;
            case 2:
                if (f68a <= 0 || f68a >= 500) {
                    z = false;
                }
                break;
            case 3:
                if (C0007h.f211a <= 0 || C0007h.f211a >= 500) {
                    z = false;
                }
                break;
        }
        if (z) {
            RunnableC0008i.m115a((byte) 75);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    static boolean m31a(C0005f c0005f, C0010k c0010k) {
        if (!f83d) {
            return false;
        }
        if (c0010k == null && ((f87j - c0005f.f161a[0]) * (f87j - c0005f.f161a[0])) + ((f89l - c0005f.f161a[2]) * (f89l - c0005f.f161a[2])) > 160000.0f) {
            return false;
        }
        f81c.m151a(c0010k);
        C0010k c0010k2 = f81c;
        float f = -f87j;
        float f2 = -f88k;
        float f3 = -f89l;
        c0010k2.f437a = f + c0010k2.f437a;
        c0010k2.f439b += f2;
        c0010k2.f441c += f3;
        f78b.m151a(f73a);
        f78b.m155b(f81c);
        f78b.m156b(RunnableC0008i.f291a);
        f72a.set(RunnableC0008i.f291a);
        f71a.render(c0005f.m60a(), f72a);
        return true;
    }

    /* JADX INFO: renamed from: b */
    static void m32b() {
        if (f83d) {
            f71a.releaseTarget();
            f83d = false;
        }
    }

    /* JADX INFO: renamed from: c */
    static void m33c() {
        f69a = null;
        f71a = null;
        f70a = null;
        f69a = new Background();
        f71a = Graphics3D.getInstance();
        f70a = new Camera();
        f71a.resetLights();
        m25a(60.0f, 320, 240, 1.0f, 10.0f);
        f69a.setColorClearEnable(false);
        f71a.setCamera(f70a, (Transform) null);
    }

    /* JADX INFO: renamed from: a */
    final void m34a() {
        this.f98b = null;
        this.f103c = null;
        this.f106d = null;
        this.f116i = null;
        this.f110e = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m35a(byte b, byte b2, int i, byte b3, byte b4, float f, float f2, float f3) {
        if (this.f98b == null) {
            this.f98b = new float[16];
        }
        if (this.f103c == null) {
            this.f103c = new float[]{0.0f, 0.0f, 0.0f};
        }
        if (this.f106d == null) {
            this.f106d = new float[]{0.0f, 0.0f, 0.0f};
        }
        if (this.f116i == null) {
            this.f116i = new float[]{0.0f, 0.0f, 0.0f};
        }
        if (this.f110e == null) {
            this.f110e = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        this.f117n = 1.0f;
        this.f93a = false;
        this.f112f = false;
        this.f118o = 0.0f;
        this.f97b = false;
        this.f92a = 0.0f;
        this.f119p = 0.0f;
        this.f102c = false;
        this.f100c = 0.0f;
        this.f113g = 0.01f;
        this.f114h = 0.01f;
        this.f91a = (byte) 0;
        this.f109e = false;
        this.f99c = b;
        this.f104d = b3;
        this.f96b = (short) i;
        this.f101c = this.f96b;
        this.f94b = b2;
        this.f107e = b4;
        this.f103c[0] = f;
        this.f103c[1] = f2;
        this.f103c[2] = f3;
        float[] fArr = this.f110e;
        float[] fArr2 = this.f110e;
        float[] fArr3 = this.f110e;
        this.f110e[3] = 0.0f;
        fArr3[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr[0] = 0.0f;
        switch (this.f94b) {
            case 0:
                this.f111f = 15.0f + (C0011l.m162a() * 25.0f);
                this.f95b = C0013n.f481a[b + 1];
                this.f105d = f84f[b + 1];
                this.f108e = f85g[b + 1];
                this.f120q = 0.75f;
                this.f121r = 2.0f;
                this.f115i = f86h[b + 1];
                break;
            case 1:
                this.f122s = (C0013n.f492b * (1.5f + (0.05f * (4 - C0013n.f505c)))) + (C0011l.m162a() * 5.0f);
                this.f122s *= 1.0f + (0.1f * (C0009j.f384d[0] - 1));
                if (C0013n.f516d == 1 && C0013n.f531f == 2) {
                    this.f122s *= 0.95f;
                }
                if (C0000a.f34c[C0000a.f5a] == 1) {
                    this.f122s *= 0.97f;
                } else if (C0000a.f34c[C0000a.f5a] == 2) {
                    this.f122s *= 0.95f;
                }
                this.f111f = 0.0f;
                this.f95b = (C0013n.f481a[0] * C0013n.f507c) / 100.0f;
                this.f105d = f84f[0];
                this.f108e = f85g[0];
                this.f120q = 0.6f;
                this.f121r = 1.7f;
                this.f115i = f86h[0];
                break;
        }
        m26a(1, false);
        this.f106d[0] = this.f116i[0] - this.f103c[0];
        this.f106d[1] = this.f116i[1] - this.f103c[1];
        this.f106d[2] = this.f116i[2] - this.f103c[2];
        C0011l.m186a(this.f106d);
        float f4 = -this.f106d[2];
        float f5 = this.f106d[0];
        float f6 = (0.0f * this.f106d[2]) - (this.f106d[1] * f5);
        float f7 = (this.f106d[0] * f5) - (this.f106d[2] * f4);
        float f8 = (this.f106d[1] * f4) - (0.0f * this.f106d[0]);
        this.f98b[0] = f4;
        this.f98b[1] = f6;
        this.f98b[2] = -this.f106d[0];
        this.f98b[3] = this.f103c[0];
        this.f98b[4] = 0.0f;
        this.f98b[5] = f7;
        this.f98b[6] = -this.f106d[1];
        this.f98b[7] = this.f103c[1] + 0.7f;
        this.f98b[8] = f5;
        this.f98b[9] = f8;
        this.f98b[10] = -this.f106d[2];
        this.f98b[11] = this.f103c[2];
        this.f98b[12] = 0.0f;
        this.f98b[13] = 0.0f;
        this.f98b[14] = 0.0f;
        this.f98b[15] = 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:291:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:302:0x095b  */
    /* JADX WARN: Code duplicated, block: B:304:0x0965  */
    /* JADX WARN: Code duplicated, block: B:305:0x0968  */
    /* JADX WARN: Code duplicated, block: B:307:0x0972  */
    /* JADX WARN: Code duplicated, block: B:308:0x0975  */
    /* JADX WARN: Code duplicated, block: B:310:0x097f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0982  */
    /* JADX WARN: Code duplicated, block: B:313:0x098c  */
    /* JADX WARN: Code duplicated, block: B:325:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:327:0x0a1c  */
    /* JADX INFO: renamed from: a */
    public final void m36a(boolean z) {
        float f;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        this.f102c = z;
        if (this.f91a == 2) {
            this.f102c = false;
        }
        if (this.f94b == 0 && !this.f102c && !C0013n.f538g) {
            int i = this.f96b;
            if (i - C0007h.f214a < -50) {
                i += C0013n.f537g;
            } else if (i - C0007h.f214a > 50) {
                i -= C0013n.f537g;
            }
            if (Math.abs(i - C0007h.f214a) > 4) {
                byte[] bArr = C0013n.f502b[this.f104d];
                short s = this.f96b;
                bArr[s] = (byte) (bArr[s] - 1);
                this.f96b = (short) (C0011l.m162a() > 0.3f ? C0007h.f214a + 2 + ((int) (C0011l.m162a() * 2.0f)) : (C0007h.f214a - 2) - ((int) (C0011l.m162a() * 2.0f)));
                if (this.f96b >= C0013n.f537g) {
                    this.f96b = (short) (this.f96b - C0013n.f537g);
                } else if (this.f96b < 0) {
                    this.f96b = (short) (this.f96b + C0013n.f537g);
                }
                if ((C0013n.f523d[this.f96b] & 2) != 2) {
                    if ((C0013n.f523d[this.f96b + 1 < C0013n.f537g ? this.f96b + 1 : 0] & 2) != 2) {
                        if ((C0013n.f523d[this.f96b + (-1) >= 0 ? this.f96b - 1 : C0013n.f537g - 1] & 2) != 2) {
                            int iM162a = (int) (C0011l.m162a() * 4.0f);
                            byte b = C0013n.f502b[iM162a][this.f96b];
                            for (int i2 = 0; i2 < 4; i2++) {
                                if (C0013n.f502b[i2][this.f96b] < b) {
                                    b = C0013n.f502b[i2][this.f96b];
                                    iM162a = i2;
                                }
                            }
                            this.f104d = (byte) iM162a;
                            this.f107e = (byte) (this.f104d < 2 ? -1 : 1);
                            int iM162a2 = (int) (C0011l.m162a() * C0013n.f475a);
                            this.f99c = (byte) 1;
                            int i3 = 0;
                            for (int i4 = 1; i4 < C0013n.f485a[C0013n.f516d - 1].length; i4++) {
                                if (i3 <= iM162a2 && iM162a2 < C0013n.f485a[C0013n.f516d - 1][i4] + i3) {
                                    this.f99c = (byte) i4;
                                    break;
                                }
                                i3 += C0013n.f485a[C0013n.f516d - 1][i4];
                            }
                            this.f99c = (byte) (this.f99c - 1);
                            byte[] bArr2 = C0013n.f502b[this.f104d];
                            short s2 = this.f96b;
                            bArr2[s2] = (byte) (bArr2[s2] + 1);
                            m35a(this.f99c, (byte) 0, this.f96b, this.f104d, this.f107e, C0013n.m233a(0, (int) this.f96b, (int) this.f104d), C0013n.m233a(1, (int) this.f96b, (int) this.f104d), C0013n.m233a(2, (int) this.f96b, (int) this.f104d));
                        }
                    }
                }
                this.f91a = (byte) 2;
                return;
            }
        }
        if ((this.f102c || !this.f97b) && this.f91a != 2) {
            byte[] bArr3 = C0013n.f502b[this.f104d];
            short s3 = this.f96b;
            bArr3[s3] = (byte) (bArr3[s3] - 1);
            this.f113g = C0011l.m208c(this.f113g - ((this.f113g * 2.0f) * RunnableC0008i.f277a));
            this.f114h = C0011l.m208c(this.f114h - ((this.f114h * 2.0f) * RunnableC0008i.f277a));
            if (this.f93a) {
                this.f117n -= 0.3f * RunnableC0008i.f277a;
                if (this.f117n < 0.0f) {
                    this.f117n = 0.0f;
                }
            }
            if (!this.f97b) {
                this.f113g += C0011l.m208c(this.f106d[0] * RunnableC0008i.f277a * this.f111f * this.f117n);
                this.f114h += C0011l.m208c(this.f106d[2] * RunnableC0008i.f277a * this.f111f * this.f117n);
            }
            float[] fArr = this.f103c;
            fArr[0] = fArr[0] + (this.f113g * RunnableC0008i.f277a);
            float[] fArr2 = this.f103c;
            fArr2[2] = fArr2[2] + (this.f114h * RunnableC0008i.f277a);
            if (this.f91a == 0) {
                m29a(this.f110e, this.f103c[0], this.f103c[2], this.f96b);
                short s4 = this.f110e[3] > 0.8f ? (short) 1 : this.f110e[3] < 0.2f ? (short) -1 : (short) 0;
                if (s4 == 0) {
                    z2 = false;
                } else {
                    if (s4 == 1) {
                        int i5 = (this.f96b << 1) + 2;
                        if (i5 >= (C0013n.f537g << 1)) {
                            i5 -= C0013n.f537g << 1;
                        }
                        f2 = C0013n.f486a[0][i5];
                        f3 = C0013n.f486a[2][i5];
                        f4 = C0013n.f486a[0][i5 + 1];
                        f5 = C0013n.f486a[2][i5 + 1];
                    } else {
                        f2 = C0013n.f486a[0][(this.f96b << 1) + 1];
                        f3 = C0013n.f486a[2][(this.f96b << 1) + 1];
                        f4 = C0013n.f486a[0][this.f96b << 1];
                        f5 = C0013n.f486a[2][this.f96b << 1];
                    }
                    if (((f4 - f2) * (this.f103c[2] - f3)) - ((f5 - f3) * (this.f103c[0] - f2)) <= 0.0f) {
                        if (C0007h.f211a > 0 && C0007h.f211a < 600) {
                            RunnableC0008i.m115a((byte) 75);
                        }
                        this.f96b = (short) (this.f96b + s4);
                        this.f101c = (short) (this.f101c + s4);
                        if (this.f96b >= C0013n.f537g) {
                            this.f96b = (short) (this.f96b - C0013n.f537g);
                            if (this.f94b == 1 && this.f101c >= C0013n.f537g * C0013n.f491b) {
                                this.f93a = true;
                            }
                        } else if (this.f96b < 0) {
                            this.f96b = (short) (this.f96b + C0013n.f537g);
                        }
                        m29a(this.f110e, this.f103c[0], this.f103c[2], this.f96b);
                        if (this.f102c && !this.f97b && this.f94b == 0) {
                            if (this.f107e == -1) {
                                this.f104d = (byte) (C0013n.f502b[0][this.f96b] < C0013n.f502b[1][this.f96b] ? 0 : 1);
                            } else {
                                this.f104d = (byte) (C0013n.f502b[2][this.f96b] < C0013n.f502b[3][this.f96b] ? 2 : 3);
                            }
                        }
                        if (!this.f112f && !this.f97b) {
                            m26a(1, false);
                        }
                        this.f112f = false;
                        if (this.f94b == 0) {
                            int i6 = C0013n.f535g == 1 ? this.f96b + C0013n.f521d : (((-this.f96b) - C0013n.f521d) + C0013n.f537g) - 1;
                            if (i6 >= C0013n.f537g) {
                                i6 -= C0013n.f537g;
                            } else if (i6 < 0) {
                                i6 += C0013n.f537g;
                            }
                            if (C0013n.f516d != 2 || C0013n.f525e != 5) {
                                if (C0013n.f516d != 1 || C0013n.f525e != 1) {
                                    if (C0013n.f516d == 1 && C0013n.f525e == 3) {
                                        switch (i6) {
                                            case 4:
                                                this.f91a = (byte) 1;
                                                this.f116i[0] = -957.6014f;
                                                this.f116i[1] = 0.0f;
                                                this.f116i[2] = -687.1866f;
                                                z2 = true;
                                                break;
                                            case 11:
                                                this.f91a = (byte) 1;
                                                this.f116i[0] = -621.9241f;
                                                this.f116i[1] = 0.0f;
                                                this.f116i[2] = -1061.2524f;
                                            default:
                                                z2 = true;
                                                break;
                                        }
                                    } else if (C0013n.f516d == 1 && C0013n.f525e == 4) {
                                        switch (i6) {
                                            case 52:
                                                this.f91a = (byte) 1;
                                                this.f116i[0] = 334.59793f;
                                                this.f116i[1] = 10.22185f;
                                                this.f116i[2] = 1075.2311f;
                                                z2 = true;
                                                break;
                                            case 58:
                                                this.f91a = (byte) 1;
                                                this.f116i[0] = 45.980648f;
                                                this.f116i[1] = 18.3594f;
                                                this.f116i[2] = 606.40045f;
                                            default:
                                                z2 = true;
                                                break;
                                        }
                                    } else {
                                        z2 = true;
                                    }
                                } else {
                                    switch (i6) {
                                        case 12:
                                            this.f91a = (byte) 1;
                                            this.f116i[0] = -969.2423f;
                                            this.f116i[1] = 0.0f;
                                            this.f116i[2] = -690.9707f;
                                            z2 = true;
                                            break;
                                        case 19:
                                            this.f91a = (byte) 1;
                                            this.f116i[0] = -618.5155f;
                                            this.f116i[1] = 0.0f;
                                            this.f116i[2] = -1058.3951f;
                                            z2 = true;
                                            break;
                                        case 36:
                                            this.f91a = (byte) 1;
                                            this.f116i[0] = 338.24106f;
                                            this.f116i[1] = -0.018555472f;
                                            this.f116i[2] = -1123.6119f;
                                            z2 = true;
                                            break;
                                        case 41:
                                            this.f91a = (byte) 1;
                                            this.f116i[0] = 485.4475f;
                                            this.f116i[1] = -24.6033f;
                                            this.f116i[2] = -841.9167f;
                                            z2 = true;
                                            break;
                                        case 69:
                                            this.f91a = (byte) 1;
                                            this.f116i[0] = 363.16345f;
                                            this.f116i[1] = 10.164333f;
                                            this.f116i[2] = 1013.64233f;
                                            z2 = true;
                                            break;
                                        case 75:
                                            this.f91a = (byte) 1;
                                            this.f116i[0] = 46.747887f;
                                            this.f116i[1] = 18.3594f;
                                            this.f116i[2] = 598.15326f;
                                        default:
                                            z2 = true;
                                            break;
                                    }
                                }
                            } else {
                                switch (i6) {
                                    case 42:
                                        this.f91a = (byte) 1;
                                        this.f116i[0] = -136.35887f;
                                        this.f116i[1] = -15.561726f;
                                        this.f116i[2] = 519.37787f;
                                        z2 = true;
                                        break;
                                    case 59:
                                        this.f91a = (byte) 1;
                                        this.f116i[0] = -900.8252f;
                                        this.f116i[1] = 0.0f;
                                        this.f116i[2] = 1076.2906f;
                                    default:
                                        z2 = true;
                                        break;
                                }
                            }
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
                if (this.f110e[3] > 1.0f) {
                    this.f110e[3] = 1.0f;
                } else if (this.f110e[3] < 0.0f) {
                    this.f110e[3] = 0.0f;
                }
                float f6 = (C0013n.f516d == 1 ? 1.2f : 1.0f) * this.f120q;
                if (f6 > 0.9f) {
                    f6 = 0.9f;
                }
                if (((this.f107e == 1 && this.f110e[3] >= f6) || (this.f107e == -1 && this.f110e[3] <= 1.0f - f6)) && !this.f112f && !this.f97b) {
                    m26a(2, true);
                }
                if (this.f102c) {
                    this.f92a = C0011l.m198b(((this.f103c[0] - this.f110e[0]) * (this.f103c[0] - this.f110e[0])) + ((this.f103c[2] - this.f110e[2]) * (this.f103c[2] - this.f110e[2])));
                    if (this.f92a > f76a[C0013n.f516d - 1]) {
                        float[] fArr3 = this.f103c;
                        fArr3[0] = fArr3[0] + ((this.f110e[0] - this.f103c[0]) * (1.0f - (f76a[C0013n.f516d - 1] / this.f92a)) * 0.5f);
                        float[] fArr4 = this.f103c;
                        fArr4[2] = fArr4[2] + ((this.f110e[2] - this.f103c[2]) * (1.0f - (f76a[C0013n.f516d - 1] / this.f92a)) * 0.5f);
                    }
                    if (this.f94b == 1) {
                        this.f119p -= 14.0f * RunnableC0008i.f277a;
                        float[] fArr5 = this.f103c;
                        fArr5[1] = fArr5[1] + (this.f119p * RunnableC0008i.f277a);
                        if (this.f103c[1] < this.f110e[1]) {
                            if (!z2) {
                                this.f119p += (this.f110e[1] - this.f103c[1]) / RunnableC0008i.f277a;
                            }
                            this.f103c[1] = this.f110e[1];
                        }
                    } else {
                        this.f119p = 0.0f;
                        this.f103c[1] = this.f110e[1];
                    }
                } else {
                    this.f119p = 0.0f;
                    this.f103c[1] = this.f110e[1];
                }
            }
            if (this.f102c && this.f94b == 1) {
                float f7 = ((C0007h.f214a + C0007h.f217a[3]) - this.f96b) - this.f110e[3];
                byte b2 = this.f104d;
                if (f7 < 0.03f) {
                    if (f7 > (C0013n.f516d == 1 ? -0.35f : -0.45f)) {
                        if (C0013n.f502b[C0007h.f228c][this.f96b] == (this.f96b == C0007h.f214a ? (byte) 1 : (byte) 0)) {
                            b2 = C0007h.f228c;
                        } else if (C0013n.f502b[2][this.f96b] == 0) {
                            b2 = 2;
                        } else if (C0013n.f502b[3][this.f96b] == 0) {
                            b2 = 3;
                        } else if (C0013n.f502b[1][this.f96b] == 0) {
                            b2 = 1;
                        } else if (C0013n.f502b[0][this.f96b] == 0) {
                            b2 = 0;
                        }
                    } else if (C0013n.f502b[2][this.f96b] == 0) {
                        b2 = 2;
                    } else if (C0013n.f502b[3][this.f96b] == 0) {
                        b2 = 3;
                    } else if (C0013n.f502b[1][this.f96b] == 0) {
                        b2 = 1;
                    } else if (C0013n.f502b[0][this.f96b] == 0) {
                        b2 = 0;
                    }
                } else if (C0013n.f502b[2][this.f96b] == 0) {
                    b2 = 2;
                } else if (C0013n.f502b[3][this.f96b] == 0) {
                    b2 = 3;
                } else if (C0013n.f502b[1][this.f96b] == 0) {
                    b2 = 1;
                } else if (C0013n.f502b[0][this.f96b] == 0) {
                    b2 = 0;
                }
                if (this.f104d != b2) {
                    this.f104d = b2;
                    m26a(this.f110e[3] < 0.5f ? 1 : 2, false);
                }
            }
            if (!this.f97b) {
                C0013n.f499b[0] = this.f116i[0] - this.f103c[0];
                C0013n.f499b[1] = this.f116i[1] - this.f103c[1];
                C0013n.f499b[2] = this.f116i[2] - this.f103c[2];
                C0011l.m186a(C0013n.f499b);
                if (this.f94b == 1 && this.f102c) {
                    this.f111f -= C0011l.m208c((((float) Math.sqrt((((C0013n.f499b[0] - this.f106d[0]) * (C0013n.f499b[0] - this.f106d[0])) + ((C0013n.f499b[1] - this.f106d[1]) * (C0013n.f499b[1] - this.f106d[1]))) + ((C0013n.f499b[2] - this.f106d[2]) * (C0013n.f499b[2] - this.f106d[2])))) * RunnableC0008i.f277a) * 0.17f);
                }
                float[] fArr6 = this.f106d;
                fArr6[0] = fArr6[0] + ((C0013n.f499b[0] - this.f106d[0]) * this.f121r * RunnableC0008i.f277a);
                float[] fArr7 = this.f106d;
                fArr7[1] = fArr7[1] + ((C0013n.f499b[1] - this.f106d[1]) * this.f121r * RunnableC0008i.f277a);
                float[] fArr8 = this.f106d;
                fArr8[2] = fArr8[2] + ((C0013n.f499b[2] - this.f106d[2]) * this.f121r * RunnableC0008i.f277a);
                this.f106d[0] = C0011l.m208c(this.f106d[0]);
                this.f106d[1] = C0011l.m208c(this.f106d[1]);
                this.f106d[2] = C0011l.m208c(this.f106d[2]);
                if (this.f102c) {
                    C0011l.m186a(this.f106d);
                }
            }
            if (this.f102c) {
                if (this.f97b) {
                    this.f98b[3] = this.f103c[0];
                    this.f98b[7] = this.f103c[1] + 0.7f;
                    this.f98b[11] = this.f103c[2];
                    if (this.f113g != 0.0f || this.f114h != 0.0f) {
                        RunnableC0008i.f298b.m152a(this.f98b);
                        RunnableC0008i.f298b.m147a(((float) Math.sqrt((this.f113g * this.f113g) + (this.f114h * this.f114h))) * 0.25f * (-RunnableC0008i.f277a) * 30.0f, 0.0f, 0.0f, 1.0f);
                        RunnableC0008i.f298b.m156b(this.f98b);
                    }
                } else {
                    float f8 = -this.f106d[2];
                    float f9 = this.f106d[0];
                    float f10 = (this.f106d[2] * 0.0f) - (this.f106d[1] * f9);
                    float f11 = (this.f106d[0] * f9) - (this.f106d[2] * f8);
                    float f12 = (this.f106d[1] * f8) - (this.f106d[0] * 0.0f);
                    this.f98b[0] = f8;
                    this.f98b[1] = f10;
                    this.f98b[2] = -this.f106d[0];
                    this.f98b[3] = this.f103c[0];
                    this.f98b[4] = 0.0f;
                    this.f98b[5] = f11;
                    this.f98b[6] = -this.f106d[1];
                    this.f98b[7] = this.f103c[1] + 0.7f;
                    this.f98b[8] = f9;
                    this.f98b[9] = f12;
                    this.f98b[10] = -this.f106d[2];
                    this.f98b[11] = this.f103c[2];
                    this.f98b[12] = 0.0f;
                    this.f98b[13] = 0.0f;
                    this.f98b[14] = 0.0f;
                    this.f98b[15] = 1.0f;
                    this.f118o += (this.f100c - this.f118o) * RunnableC0008i.f277a;
                    RunnableC0008i.f298b.m152a(this.f98b);
                    RunnableC0008i.f298b.m147a(this.f118o, 0.0f, 1.0f, 0.0f);
                    RunnableC0008i.f298b.m156b(this.f98b);
                    this.f106d[0] = -this.f98b[2];
                    this.f106d[1] = -this.f98b[6];
                    this.f106d[2] = -this.f98b[10];
                }
            }
            if (!this.f97b) {
                if (this.f94b == 1) {
                    float f13 = ((C0007h.f224b + C0007h.f217a[3]) - this.f101c) - this.f110e[3];
                    if (f13 <= 0.0f) {
                        f = this.f122s;
                    } else if (f13 < (C0013n.f516d == 1 ? 2.0f : 3.0f)) {
                        if (f13 < 0.15f) {
                            f13 = 0.15f - f13;
                        }
                        f = (((C0013n.f516d == 1 ? 1.5f : 1.0f) * 0.08f * f13) + 1.0f) * this.f122s;
                        if (C0009j.f371c == 1 && C0009j.f410k[C0009j.f371c] == 18) {
                            this.f122s = 112.0f;
                        } else if (!this.f109e) {
                            this.f109e = true;
                            this.f122s *= 1.05f;
                        }
                    } else {
                        f = this.f122s;
                    }
                    float fM198b = f * (1.0f - (0.4f - ((this.f95b / C0011l.m198b((C0013n.f481a[0] * C0013n.f507c) / 100.0f)) * 0.4f)));
                    if (fM198b < this.f111f) {
                        this.f111f = C0011l.m208c(((fM198b - this.f111f) * RunnableC0008i.f277a * 0.05f) + this.f111f);
                    } else {
                        this.f111f = C0011l.m208c(((fM198b - this.f111f) * RunnableC0008i.f277a) + this.f111f);
                    }
                    this.f120q = 1.0f - (this.f111f / 200.0f);
                    if (this.f120q < 0.5f) {
                        this.f120q = 0.5f;
                    }
                }
                if (this.f94b == 0 && C0013n.f538g) {
                    this.f93a = true;
                }
                this.f100c = C0011l.m208c(this.f100c - ((this.f100c * 4.0f) * RunnableC0008i.f277a));
            }
            if (this.f94b == 0 && this.f91a == 1 && ((this.f103c[0] - this.f116i[0]) * (this.f103c[0] - this.f116i[0])) + ((this.f103c[2] - this.f116i[2]) * (this.f103c[2] - this.f116i[2])) < 10.0f) {
                this.f91a = (byte) 2;
            }
            byte[] bArr4 = C0013n.f502b[this.f104d];
            short s5 = this.f96b;
            bArr4[s5] = (byte) (bArr4[s5] + 1);
        }
    }
}
