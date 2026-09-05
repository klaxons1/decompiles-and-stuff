package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public final class RunnableC0010k extends C0004e implements Runnable, CommandListener {

    /* JADX INFO: renamed from: a */
    private static long f215a;

    /* JADX INFO: renamed from: a */
    public static Main f216a;

    /* JADX INFO: renamed from: a */
    public static C0006g f217a;

    /* JADX INFO: renamed from: a */
    private static Display f219a;

    /* JADX INFO: renamed from: a */
    private static Image f220a;

    /* JADX INFO: renamed from: a */
    public static RunnableC0010k f221a;

    /* JADX INFO: renamed from: a */
    public static boolean f222a;

    /* JADX INFO: renamed from: a */
    public static String[] f223a;

    /* JADX INFO: renamed from: a */
    private static final int[][] f224a;

    /* JADX INFO: renamed from: a */
    private static C0006g[][] f225a;

    /* JADX INFO: renamed from: b */
    private static long f226b;

    /* JADX INFO: renamed from: b */
    public static boolean f228b;

    /* JADX INFO: renamed from: c */
    private static C0006g f231c;

    /* JADX INFO: renamed from: c */
    public static boolean f232c;

    /* JADX INFO: renamed from: d */
    public static int f233d;

    /* JADX INFO: renamed from: f */
    public static int f237f;

    /* JADX INFO: renamed from: f */
    public static boolean f238f;

    /* JADX INFO: renamed from: i */
    private static int f240i;

    /* JADX INFO: renamed from: j */
    private static final int f241j;

    /* JADX INFO: renamed from: m */
    private static int f243m;

    /* JADX INFO: renamed from: r */
    private static int f244r;

    /* JADX INFO: renamed from: s */
    private static int f245s;

    /* JADX INFO: renamed from: t */
    private static int f246t;

    /* JADX INFO: renamed from: a */
    private C0000a f247a;

    /* JADX INFO: renamed from: a */
    private String f248a;

    /* JADX INFO: renamed from: b */
    private C0000a f249b;

    /* JADX INFO: renamed from: b */
    private C0006g f250b;

    /* JADX INFO: renamed from: c */
    private C0000a f251c;

    /* JADX INFO: renamed from: d */
    private C0000a f252d;

    /* JADX INFO: renamed from: e */
    private C0000a f253e;

    /* JADX INFO: renamed from: f */
    private C0000a f254f;

    /* JADX INFO: renamed from: g */
    private C0000a f255g;

    /* JADX INFO: renamed from: g */
    private boolean f256g;

    /* JADX INFO: renamed from: h */
    private int f257h;

    /* JADX INFO: renamed from: h */
    private C0000a f258h;

    /* JADX INFO: renamed from: h */
    private boolean f259h = false;

    /* JADX INFO: renamed from: i */
    private C0000a f260i;

    /* JADX INFO: renamed from: j */
    private C0000a f261j;

    /* JADX INFO: renamed from: k */
    private int f262k;

    /* JADX INFO: renamed from: n */
    private int f263n;

    /* JADX INFO: renamed from: o */
    private int f264o;

    /* JADX INFO: renamed from: p */
    private int f265p;

    /* JADX INFO: renamed from: q */
    private int f266q;

    /* JADX INFO: renamed from: c */
    public static int f230c = -1;

    /* JADX INFO: renamed from: d */
    public static boolean f234d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f236e = true;

    /* JADX INFO: renamed from: a */
    private static Random f218a = new Random();

    /* JADX INFO: renamed from: e */
    public static int f235e = -1;

    /* JADX INFO: renamed from: g */
    public static int f239g = 90;

    /* JADX INFO: renamed from: l */
    private static int f242l = -1;

    /* JADX INFO: renamed from: b */
    private static final String[] f229b = {"lang.dat", "fr.dat", "de.dat", "it.dat", "es.dat"};

    /* JADX INFO: renamed from: b */
    private static String f227b = "";

    static {
        int[][] iArr = {new int[]{1}, new int[]{2}, new int[]{3, 4}};
        f224a = iArr;
        f241j = iArr.length;
        new String();
    }

    public RunnableC0010k(Main main) {
        f216a = main;
        f221a = this;
        Display display = Display.getDisplay(main);
        f219a = display;
        display.setCurrent(this);
        new Thread(this).start();
    }

    /* JADX INFO: renamed from: a */
    private static int m79a(String str, int i) {
        int iIndexOf;
        if (m118d(str.charAt(i))) {
            return i + 1;
        }
        while (true) {
            iIndexOf = str.indexOf(32, i);
            if (iIndexOf != 0) {
                break;
            }
            i++;
        }
        int length = iIndexOf == -1 ? str.length() : iIndexOf + 1;
        for (int i2 = i + 1; i2 < length; i2++) {
            if (m118d(str.charAt(i2))) {
                return i2;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: a */
    private static C0000a m80a(String str, String str2, C0000a c0000a, C0000a c0000a2) {
        C0000a c0000a3 = new C0000a(str, m100a(str2, 234, 1), 2);
        c0000a3.f7b = c0000a;
        c0000a3.f3a = c0000a2;
        return c0000a3;
    }

    /* JADX INFO: renamed from: a */
    private static Object m81a(int i, int i2, int i3, int i4, boolean z) {
        try {
            byte[] bArrM24a = C0005f.m24a(i);
            byte[] bArrM24a2 = C0005f.m24a(i2);
            int i5 = bArrM24a[0] & 255;
            C0006g[] c0006gArr = new C0006g[i5];
            if (i3 != -1) {
                C0006g c0006g = new C0006g(i3, new StringBuffer().append("unsplit image for SpriteID ").append(i).toString());
                int i6 = 0;
                int i7 = 0;
                int i8 = 3;
                while (i6 < i5) {
                    int i9 = i8 + 1;
                    int i10 = bArrM24a[i8] & 255;
                    int i11 = i9 + 1;
                    int i12 = bArrM24a[i9] & 255;
                    int i13 = i11 + 1;
                    int i14 = bArrM24a[i11] & 255;
                    int i15 = i13 + 1;
                    int i16 = bArrM24a[i13] & 255;
                    int i17 = i15 + 1;
                    byte b = bArrM24a[i15];
                    int i18 = i17 + 1;
                    byte b2 = bArrM24a[i17];
                    C0006g c0006g2 = new C0006g(c0006g, i10, i12, i14, i16);
                    c0006g2.f43a = b;
                    c0006g2.f47b = b2;
                    c0006gArr[i7] = c0006g2;
                    i6++;
                    i7++;
                    i8 = i18;
                }
            } else {
                int i19 = 0;
                int i20 = 0;
                int i21 = 3;
                while (i20 < i5) {
                    int i22 = i21 + 4;
                    int i23 = i22 + 1;
                    byte b3 = bArrM24a[i22];
                    i21 = i23 + 1;
                    byte b4 = bArrM24a[i23];
                    C0006g c0006g3 = new C0006g(i4 + i20, new StringBuffer().append("split image ").append(i20).append(" for SpriteID ").append(i).toString());
                    c0006g3.f43a = b3;
                    c0006g3.f47b = b4;
                    c0006gArr[i19] = c0006g3;
                    i20++;
                    i19++;
                }
            }
            int i24 = 1;
            int i25 = bArrM24a2[0];
            byte[][] bArr = new byte[i25][];
            for (int i26 = 0; i26 < i25; i26++) {
                int i27 = i24 + 1;
                byte b5 = bArrM24a2[i24];
                i24 = i27 + 1;
                byte b6 = bArrM24a2[i27];
                if (b6 != 1 && !z) {
                    throw new Exception(new StringBuffer().append("\"frameCount != 1 && !multipleFrames\" in Engine.loadSprite frames file (").append(i2).append(")").toString());
                }
                bArr[b5] = new byte[b6 << 1];
                for (int i28 = 0; i28 < b6; i28++) {
                    int i29 = i24 + 1;
                    byte b7 = bArrM24a2[i24];
                    i24 = i29 + 1;
                    byte b8 = bArrM24a2[i29];
                    bArr[b5][i28 << 1] = b7;
                    bArr[b5][(i28 << 1) + 1] = b8;
                }
            }
            if (!z) {
                C0006g[] c0006gArr2 = new C0006g[i25];
                for (int i30 = 0; i30 < i25; i30++) {
                    byte b9 = bArr[i30][0];
                    if (bArr[i30][1] == 0) {
                        c0006gArr2[i30] = c0006gArr[b9];
                    } else {
                        c0006gArr2[i30] = new C0006g();
                    }
                }
                return c0006gArr2;
            }
            C0006g[][] c0006gArr3 = new C0006g[i25][];
            for (int i31 = 0; i31 < i25; i31++) {
                int length = bArr[i31].length >> 1;
                c0006gArr3[i31] = new C0006g[length];
                int i32 = 0;
                for (int i33 = 0; i33 < length; i33++) {
                    int i34 = i32 + 1;
                    byte b10 = bArr[i31][i32];
                    i32 = i34 + 1;
                    if (bArr[i31][i34] == 0) {
                        c0006gArr3[i31][i33] = c0006gArr[b10];
                    } else {
                        c0006gArr3[i31][i33] = new C0006g();
                    }
                }
            }
            return c0006gArr3;
        } catch (Exception e) {
            System.out.println(new StringBuffer().append("Exception in loadSprite(spriteFileId=").append(65535 & i).append(", framesFileId=").append(65535 & i2).append(", unSplitImgId=").append(65535 & i3).append(", firstSplitImgId=").append(65535 & i4).append(")").toString());
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m82a(int i, String[] strArr) {
        String str = new String(i < f223a.length ? f223a[i] : new StringBuffer().append("No text: ").append(i).toString());
        if (strArr.length == 1) {
            return m84a(str, "%U", strArr[0]);
        }
        int i2 = 0;
        while (i2 < strArr.length) {
            String strM84a = m84a(str, "%U", strArr[i2]);
            i2++;
            str = strM84a;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static String m83a(String str) {
        String appProperty = f216a.getAppProperty(str);
        if (appProperty != null) {
            return appProperty.trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m84a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf != -1 ? new StringBuffer().append(str.substring(0, iIndexOf)).append(str3).append(str.substring(iIndexOf + str2.length())).toString() : str;
    }

    /* JADX INFO: renamed from: a */
    private void m85a(int i, int i2) {
        f235e = 3;
        m117d();
        C0004e.m15a(1);
        this.f250b = null;
        try {
            C0008i.m38a();
            C0008i.m40a(i, i2);
            C0008i.m63c();
        } catch (Exception e) {
            new StringBuffer().append("ex in loadLevel: ").append(e.toString()).toString();
        }
        f246t = 0;
        f235e = 100;
    }

    /* JADX INFO: renamed from: a */
    private void m86a(C0000a c0000a) {
        if (c0000a == null) {
            return;
        }
        if (c0000a.f6b != 0 && this.f247a != null && c0000a != this.f247a.f7b) {
            c0000a.f7b = this.f247a;
        }
        this.f247a = c0000a;
        if (c0000a.f6b == 2 || c0000a.f6b == 1) {
            this.f263n = Math.min(this.f247a.m0a(), 4);
            this.f264o = ((this.f263n - (this.f247a.f4a == null ? 0 : 1)) * (C0009j.f207a[1] + 2)) - 2;
        } else {
            this.f263n = Math.min(this.f247a.m0a(), 1);
            this.f264o = (this.f263n * (f243m + 2)) - 2;
        }
        this.f262k = this.f247a.f2a;
        m125k();
        f246t = 0;
        f235e = 10;
    }

    /* JADX INFO: renamed from: a */
    private void m87a(C0000a c0000a, int i) {
        String str = c0000a.f6b != 3 ? c0000a.f5a[i] : null;
        if (c0000a == this.f249b) {
            if (str == f223a[47]) {
                m113c(this.f248a);
            } else {
                if (f235e == 10 && str == f223a[36]) {
                    f235e = 7;
                    return;
                }
                if (str == f223a[5]) {
                    m86a(this.f261j);
                } else if (str == f223a[36]) {
                    m85a(0, 0);
                } else if (f237f == 2 && str == f223a[47]) {
                    m113c(this.f248a);
                } else if (str == f223a[6]) {
                    m86a(m80a(f223a[6], f223a[33], this.f247a, (C0000a) null));
                } else if (str == f223a[7]) {
                    m86a(this.f252d);
                } else if (str == f223a[8]) {
                    String strM83a = m83a("MIDlet-Version");
                    if (strM83a == null) {
                        strM83a = "?";
                    }
                    String strM82a = m82a(34, new String[]{strM83a});
                    if (f237f > 0) {
                        strM82a = f242l == 1 ? new StringBuffer().append("Démo\n").append(strM82a).toString() : new StringBuffer().append("Demo\n").append(strM82a).toString();
                    }
                    m86a(m80a(f223a[8], strM82a, c0000a, (C0000a) null));
                }
            }
            if (str == f223a[43]) {
                m86a(this.f255g);
            }
        } else if (c0000a == this.f261j) {
            int i2 = this.f247a.f2a;
            m85a(i2 / 3, i2 % 3);
        } else if (c0000a == this.f252d || c0000a == this.f251c) {
            if (str == f223a[10]) {
                f236e = false;
                c0000a.m1a(f223a[11]);
                C0004e.m15a(1);
            } else if (str == f223a[11]) {
                f236e = true;
                c0000a.m1a(f223a[10]);
                C0004e.m16a(3, 5);
            } else if (str == f223a[13]) {
                f234d = true;
                c0000a.m1a(f223a[12]);
                C0004e.m19a(250);
            } else if (str == f223a[12]) {
                f234d = false;
                c0000a.m1a(f223a[13]);
            } else if (str == f223a[22]) {
                if (f237f > 0) {
                    m102b();
                } else {
                    m86a(this.f260i);
                }
                C0000a c0000a2 = this.f247a;
                this.f262k = 0;
                c0000a2.f2a = 0;
            } else if (str == f223a[7]) {
                m86a(this.f252d);
            } else if (str == f223a[21]) {
                m120f();
                return;
            }
        } else if (c0000a == this.f260i) {
            if (str == f223a[15]) {
                C0008i.m38a();
                m119e();
                m86a(this.f249b);
                C0004e.m16a(3, 0);
            } else {
                m86a(this.f251c);
            }
        } else if (c0000a == this.f253e) {
            if (str == f223a[15]) {
                f228b = false;
            } else if (str == f223a[16]) {
                m86a(this.f249b);
            }
        } else if (c0000a == this.f254f) {
            if (str == f223a[10]) {
                f236e = true;
                m124j();
                m121g();
            } else if (str == f223a[11]) {
                f236e = false;
                m124j();
                m121g();
            }
        }
        if (c0000a == null) {
            if (str == f223a[15]) {
                this.f250b = null;
                try {
                    C0004e.m17a(0, this.f248a);
                } catch (Exception e) {
                }
                f228b = false;
            } else if (str == f223a[16]) {
                this.f250b = null;
                m86a(this.f249b);
            }
        }
        if (c0000a == this.f258h) {
            if (str != f223a[15]) {
                if (str == f223a[16]) {
                    m86a(this.f249b);
                    return;
                }
                return;
            }
            String strM83a2 = m83a(new StringBuffer().append("upSellUrl_").append(System.getProperty("LGE.CA")).toString());
            if (strM83a2 == null || strM83a2.length() == 0) {
                strM83a2 = m83a(new StringBuffer().append("upSellUrl_ORANGE_").append(System.getProperty("microedition.locale").substring(0, 2).toUpperCase()).toString());
            }
            if (strM83a2 == null || strM83a2.length() == 0) {
                strM83a2 = m83a("upSellUrl_ORANGE_GB");
            }
            if (strM83a2 != null) {
                try {
                    C0004e.m17a(0, strM83a2);
                } catch (Exception e2) {
                }
                f228b = false;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m88a(String str) {
        f235e = 3;
        m117d();
        m104b(new StringBuffer().append("/").append(str).toString());
        try {
            C0004e.m17a(1, f223a[0]);
        } catch (Exception e) {
        }
        m123i();
    }

    /* JADX INFO: renamed from: a */
    private static void m89a(Graphics graphics) {
        if (f220a == null) {
            try {
                f220a = Image.createImage("/demoSplash.png");
            } catch (Exception e) {
                System.out.println(new StringBuffer().append("Failed to load demo splash").append(e).toString());
            }
        }
        graphics.drawImage(f220a, 0, 0, 20);
    }

    /* JADX INFO: renamed from: a */
    private static void m90a(Graphics graphics, int i) {
        graphics.setColor(i);
        graphics.fillRect(0, 0, 240, 320);
    }

    /* JADX INFO: renamed from: a */
    public static void m91a(Graphics graphics, int i, int i2, int i3, int i4) {
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int iMax = Math.max(i, clipX);
        int iMax2 = Math.max(i2, clipY);
        graphics.setClip(iMax, iMax2, Math.min(i + i3, clipX + clipWidth) - iMax, Math.min(i2 + i4, clipY + clipHeight) - iMax2);
    }

    /* JADX INFO: renamed from: a */
    public static void m92a(Graphics graphics, int i, int i2, boolean z) {
        if (z) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, 240, 260);
        } else {
            graphics.setColor(0);
            graphics.fillRect(0, 0, 240, 320);
        }
        int i3 = z ? f225a[0][0].f46a + 10 + 10 : 20;
        m95a(graphics, f223a[i + 29], i3, 130 - (C0004e.f26a << 1), 20, -1118482, -10264122);
        m95a(graphics, f223a[31], 120, 130, 17, -1118482, -10264122);
        if (z) {
            f225a[0][0].m29a(graphics, 10, 130);
            f225a[1][0].m29a(graphics, 230 - f225a[1][0].f46a, 130);
        }
        m95a(graphics, new StringBuffer().append(f223a[32]).append(" ").append(i2).toString(), 240 - i3, (C0004e.f26a << 1) + 130, 24, -1118482, -10264122);
    }

    /* JADX INFO: renamed from: a */
    public static void m93a(Graphics graphics, String str, int i, int i2, int i3) {
        m94a(graphics, str, i - 1, i2, i3, -15597228);
        m94a(graphics, str, i + 1, i2, i3, -15597228);
        m94a(graphics, str, i, i2 - 1, i3, -15597228);
        m94a(graphics, str, i, i2 + 1, i3, -15597228);
        m94a(graphics, str, i, i2, i3, -1118482);
    }

    /* JADX INFO: renamed from: a */
    private static void m94a(Graphics graphics, String str, int i, int i2, int i3, int i4) {
        graphics.setFont(C0004e.f27a);
        graphics.setColor(i4);
        graphics.drawString(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m95a(Graphics graphics, String str, int i, int i2, int i3, int i4, int i5) {
        m94a(graphics, str, i + 2, i2 + 2, i3, i5);
        m94a(graphics, str, i + 1, i2 + 1, i3, -16777216);
        m94a(graphics, str, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m96a() {
        if (f246t == 0) {
            return false;
        }
        f246t = 0;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m97a(int i) {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("SONIC", true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(f244r);
            dataOutputStream.writeBoolean(f234d);
            dataOutputStream.writeUTF(f227b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            dataOutputStream.close();
            byteArrayOutputStream.close();
            if (recordStoreOpenRecordStore.getNumRecords() <= 0) {
                recordStoreOpenRecordStore.addRecord(byteArray, 0, byteArray.length);
            } else {
                recordStoreOpenRecordStore.setRecord(1, byteArray, 0, byteArray.length);
            }
            recordStoreOpenRecordStore.closeRecordStore();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m98a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        while (i < bArr.length - 4) {
            if (bArr[i] == 80 && bArr[i + 1] == 76 && bArr[i + 2] == 84 && bArr[i + 3] == 69) {
                int i2 = i - 4;
                int i3 = (((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255)) + 12;
                byte[] bArr3 = new byte[(bArr.length - i3) + bArr2.length];
                System.arraycopy(bArr, 0, bArr3, 0, i2);
                System.arraycopy(bArr2, 0, bArr3, i2, bArr2.length);
                System.arraycopy(bArr, i2 + i3, bArr3, bArr2.length + i2, bArr.length - (i2 + i3));
                return bArr3;
            }
            i++;
        }
        i = 37;
        int i4 = i - 4;
        int i5 = (((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255)) + 12;
        byte[] bArr4 = new byte[(bArr.length - i5) + bArr2.length];
        System.arraycopy(bArr, 0, bArr4, 0, i4);
        System.arraycopy(bArr2, 0, bArr4, i4, bArr2.length);
        System.arraycopy(bArr, i4 + i5, bArr4, bArr2.length + i4, bArr.length - (i4 + i5));
        return bArr4;
    }

    /* JADX INFO: renamed from: a */
    public static C0006g[] m99a(int i, int i2, int i3, int i4) {
        return (C0006g[]) m81a(i, i2, i3, i4, false);
    }

    /* JADX INFO: renamed from: a */
    private static String[] m100a(String str, int i, int i2) {
        String strTrim;
        Vector vector = new Vector();
        int length = str.length();
        String str2 = null;
        int i3 = 0;
        while (true) {
            int iIndexOf = str.indexOf(10, i3);
            int i4 = i3;
            String str3 = str2;
            while (true) {
                int iM79a = m79a(str, i4);
                if (iIndexOf > -1 && iIndexOf < iM79a) {
                    iM79a = iIndexOf;
                }
                strTrim = str.substring(i3, iM79a).trim();
                if (C0009j.m76a(i2, strTrim) > i) {
                    if (i4 != i3) {
                        strTrim = str3;
                        break;
                    }
                    int length2 = strTrim.length() - 1;
                    while (true) {
                        if (length2 <= 0) {
                            i4 = iM79a;
                            break;
                        }
                        String strSubstring = strTrim.substring(0, length2);
                        if (C0009j.m76a(i2, strSubstring) <= i) {
                            i4 += length2;
                            strTrim = strSubstring;
                            break;
                        }
                        length2--;
                    }
                } else {
                    if (iM79a == iIndexOf) {
                        i4 = iM79a + 1;
                        break;
                    }
                    if (iM79a >= length) {
                        i4 = iM79a;
                        break;
                    }
                    i4 = iM79a;
                    str3 = strTrim;
                }
            }
            vector.addElement(strTrim);
            if (i4 >= length) {
                String[] strArr = new String[vector.size()];
                vector.copyInto(strArr);
                return strArr;
            }
            str2 = strTrim;
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0006g[][] m101a(int i, int i2, int i3, int i4) {
        return (C0006g[][]) m81a(i, i2, i3, i4, true);
    }

    /* JADX INFO: renamed from: b */
    public static void m102b() {
        C0004e.m15a(1);
        f246t = 0;
        f235e = 8;
    }

    /* JADX INFO: renamed from: b */
    public static void m103b(int i) {
        f246t &= i ^ (-1);
    }

    /* JADX INFO: renamed from: b */
    private static void m104b(String str) {
        try {
            DataInputStream dataInputStream = new DataInputStream(f221a.getClass().getResourceAsStream(str));
            f223a = new String[dataInputStream.readInt()];
            for (int i = 0; i < f223a.length; i++) {
                f223a[i] = dataInputStream.readUTF();
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m105b(Graphics graphics) {
        m90a(graphics, -14548822);
        m107b(graphics, 0, 0, 240, 30);
        m107b(graphics, 0, 290, 240, 30);
        this.f259h = true;
        m89a(graphics);
        int i = 2;
        for (String str : m100a(f216a.getAppProperty("MIDlet-Name"), 230, 0)) {
            C0009j.m78a(0, graphics, str, 120, i, 17);
            i += C0004e.f30b;
        }
        int i2 = i + (C0004e.f30b >> 1);
        for (String str2 : m100a(f223a[48], 230, 0)) {
            C0009j.m78a(0, graphics, str2, 120, i2, 17);
            i2 += C0004e.f30b;
        }
        int i3 = i2 + C0004e.f30b;
        for (String str3 : m100a(f223a[57], 230, 0)) {
            C0009j.m78a(0, graphics, str3, 120, i3, 17);
            i3 += C0004e.f30b;
        }
        C0009j.m78a(0, graphics, f223a[52], 10, 315, 36);
        C0009j.m78a(0, graphics, f223a[55], 230, 315, 40);
        this.f259h = true;
    }

    /* JADX INFO: renamed from: b */
    private void m106b(Graphics graphics, int i) {
        if (!this.f259h) {
            if (f238f) {
                if ((i & 1) != 0) {
                    m115c(graphics, 20, 4, 316, 36);
                }
                if ((i & 4) != 0) {
                    m115c(graphics, 9, 4, 316, 36);
                }
                if ((i & 2) != 0) {
                    m115c(graphics, 17, 236, 316, 40);
                }
                if ((i & 8) != 0) {
                    m93a(graphics, ">>", 236, 316, 40);
                }
                if (f235e == 6) {
                    m115c(graphics, 22, 4, 316, 36);
                }
            } else {
                if ((i & 1) != 0) {
                    m115c(graphics, 20, 236, 316, 40);
                }
                if ((i & 4) != 0) {
                    m115c(graphics, 9, 236, 316, 40);
                }
                if ((i & 2) != 0) {
                    m115c(graphics, 17, 4, 316, 36);
                }
                if ((i & 8) != 0) {
                    m93a(graphics, ">>", 4, 316, 36);
                }
                if (f235e == 6) {
                    m115c(graphics, 22, 236, 316, 40);
                }
            }
        }
        this.f259h = false;
    }

    /* JADX INFO: renamed from: b */
    private static void m107b(Graphics graphics, int i, int i2, int i3, int i4) {
        int i5 = 30;
        int i6 = 0;
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            }
            graphics.setColor(InterfaceC0007h.f52i[i6]);
            graphics.fillRect(0, i2 + i5, 240, 1);
            i6 = 1 - i6;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m108b(boolean z) {
        boolean z2;
        if (((int) System.currentTimeMillis()) - this.f257h > 2000 || z) {
            try {
                byte[] bArrM25a = C0005f.m25a(new StringBuffer().append("brand").append(this.f262k).append(".png").toString());
                if (bArrM25a != null) {
                    this.f250b = new C0006g(bArrM25a, "brand");
                    this.f262k++;
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f257h = (int) System.currentTimeMillis();
            } catch (Exception e) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            f246t = 0;
            C0004e.m16a(3, 0);
            this.f250b = null;
            m86a(this.f249b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m109b(int i) {
        return (f245s & i) != 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m110c(int i) {
        return Math.abs(f218a.nextInt() % 4);
    }

    /* JADX INFO: renamed from: c */
    public static void m111c() {
        f246t = 0;
    }

    /* JADX INFO: renamed from: c */
    private static void m112c(int i) {
        System.out.println("loadRMS 1");
        System.out.println("loadRMS 2");
        System.out.println("loadRMS 3");
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("SONIC", true);
            if (recordStoreOpenRecordStore.getNumRecords() > 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(recordStoreOpenRecordStore.getRecord(1));
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                f244r = dataInputStream.readInt();
                f234d = dataInputStream.readBoolean();
                f227b = dataInputStream.readUTF();
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m113c(String str) {
        C0004e.m15a(1);
        try {
            Main.f0a.platformRequest(str);
            Main.f0a.notifyDestroyed();
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m114c(Graphics graphics) {
        m90a(graphics, -14548822);
        m107b(graphics, 0, 0, 240, 30);
        m107b(graphics, 0, 290, 240, 30);
        this.f259h = true;
        m89a(graphics);
        int i = 2;
        for (String str : m100a(f216a.getAppProperty("MIDlet-Name"), 230, 0)) {
            C0009j.m78a(0, graphics, str, 120, i, 17);
            i += C0004e.f30b;
        }
        int i2 = i + (C0004e.f30b >> 1);
        for (String str2 : m100a(f223a[48], 230, 0)) {
            C0009j.m78a(0, graphics, str2, 120, i2, 17);
            i2 += C0004e.f30b;
        }
        int i3 = i2 + (C0004e.f30b >> 1);
        for (String str3 : m100a(m82a(49, new String[]{new StringBuffer().append("").append(f239g).toString()}), 230, 0)) {
            C0009j.m78a(0, graphics, str3, 120, i3, 17);
            i3 += C0004e.f30b;
        }
        C0009j.m78a(0, graphics, f223a[53], 10, 315, 36);
        C0009j.m78a(0, graphics, f223a[54], 230, 315, 40);
    }

    /* JADX INFO: renamed from: c */
    private static void m115c(Graphics graphics, int i, int i2, int i3, int i4) {
        String str = f223a[i];
        m94a(graphics, str, i2 - 1, 316, i4, -15597228);
        m94a(graphics, str, i2 + 1, 316, i4, -15597228);
        m94a(graphics, str, i2, 315, i4, -15597228);
        m94a(graphics, str, i2, 317, i4, -15597228);
        m94a(graphics, str, i2, 316, i4, -1118482);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m116c(int i) {
        if ((f246t & i) == 0) {
            return false;
        }
        f246t = 0;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static void m117d() {
        f221a.repaint();
        f221a.serviceRepaints();
    }

    /* JADX INFO: renamed from: d */
    private static boolean m118d(int i) {
        return (i >= 11904 && i < 44032) || (i >= 63744 && i < 64256) || (i >= 65280 && i < 65504);
    }

    /* JADX INFO: renamed from: e */
    private static void m119e() {
        try {
            f231c = new C0006g(65536, "title");
            if (f217a == null) {
                f217a = new C0006g(65537, "backicon");
            }
            f225a = m101a(65541, 65542, 65543, -1);
        } catch (Exception e) {
            new StringBuffer().append("Engine.returnFromGameWorld: ").append(e.toString()).toString();
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m120f() {
        f246t = 0;
        f245s = 0;
        C0008i.m44a(System.currentTimeMillis() - f226b);
        C0008i.m56b();
        f235e = 100;
    }

    /* JADX INFO: renamed from: g */
    private void m121g() {
        this.f262k = 0;
        f246t = 0;
        f235e = 5;
        m108b(true);
    }

    /* JADX INFO: renamed from: h */
    private void m122h() {
        m86a(this.f254f);
    }

    /* JADX INFO: renamed from: i */
    private void m123i() {
        int iIntValue;
        String[] strArr;
        char c;
        f243m = C0009j.f207a[1];
        String[] strArr2 = {f223a[15], f223a[16]};
        String[] strArr3 = {f223a[16], f223a[15]};
        String[] strArr4 = {f223a[11], f223a[10]};
        String strM83a = m83a("ms-upSell");
        if (strM83a != null) {
            try {
                iIntValue = Integer.valueOf(strM83a).intValue();
            } catch (NumberFormatException e) {
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        if (iIntValue != 0) {
            String strM83a2 = m83a("ms-upSellUrl");
            String[] strArr5 = {f223a[5], f223a[43], f223a[6], f223a[7], f223a[8]};
            if (f237f > 0) {
                if (f237f == 2) {
                    strArr = new String[strArr5.length + 1];
                    for (int i = 0; i < strArr5.length; i++) {
                        strArr[i + 1] = strArr5[i];
                    }
                    strArr[0] = f223a[47];
                    c = 1;
                } else {
                    c = 0;
                    strArr = strArr5;
                }
                strArr[c] = f223a[36];
            } else {
                strArr = strArr5;
            }
            String str = f223a[45];
            if (strM83a2 != null && iIntValue == 2) {
                this.f258h = new C0000a(f223a[46], strArr2, 1);
            }
            this.f255g = m80a(f223a[43], str, (C0000a) null, this.f258h != null ? this.f258h : this.f249b);
        } else if (f237f == 1) {
            strArr = new String[]{f223a[36], f223a[6], f223a[7], f223a[8]};
        } else {
            strArr = f237f == 2 ? new String[]{f223a[47], f223a[36], f223a[6], f223a[7], f223a[8]} : new String[]{f223a[5], f223a[6], f223a[7], f223a[8]};
        }
        String[] strArr6 = {f223a[21], f223a[7], f223a[22]};
        this.f249b = new C0000a(null, strArr, 0);
        this.f253e = new C0000a(f223a[9], strArr3, 1);
        this.f254f = new C0000a(f223a[14], strArr4, 1);
        this.f261j = new C0000a(f223a[5], null, 3);
        this.f251c = new C0000a(null, strArr6, 1);
        this.f260i = new C0000a(f223a[22], strArr3, 1);
        m124j();
    }

    /* JADX INFO: renamed from: j */
    private void m124j() {
        String[] strArr = new String[2];
        strArr[0] = f223a[f236e ? '\n' : (char) 11];
        strArr[1] = f223a[f234d ? '\f' : '\r'];
        this.f252d = new C0000a(f223a[7], strArr, 1);
    }

    /* JADX INFO: renamed from: k */
    private void m125k() {
        if (this.f247a.f6b == 2) {
            this.f265p = this.f247a.f2a;
            this.f266q = Math.min(this.f265p + 4, this.f247a.m0a());
            return;
        }
        this.f265p = Math.max(0, this.f247a.f2a - (this.f263n >> 1));
        this.f266q = this.f265p + this.f263n;
        if (this.f266q >= this.f247a.m0a()) {
            this.f266q = this.f247a.m0a();
            this.f265p = Math.max(0, this.f266q - this.f263n);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m126a(boolean z) {
        f226b = System.currentTimeMillis();
        f246t = 0;
        if (z) {
            m86a(this.f251c);
        } else {
            m119e();
            m86a(this.f249b);
        }
        this.f247a.f2a = 0;
        this.f262k = 0;
        this.f261j.f2a = 0;
        C0004e.m15a(1);
        if (z) {
            return;
        }
        C0004e.m16a(3, 0);
    }

    public final void commandAction(Command command, Displayable displayable) {
    }

    public final void keyPressed(int i) {
        try {
            int iM20b = m20b(i);
            f245s |= iM20b;
            f246t = iM20b | f246t;
        } catch (Exception e) {
        }
    }

    public final void keyReleased(int i) {
        try {
            f245s = (m20b(i) ^ (-1)) & f245s;
        } catch (Exception e) {
        }
    }

    @Override // p000.C0004e
    public final void paint(Graphics graphics) {
        if (f235e == 100 && System.currentTimeMillis() - f215a > 1500) {
            hideNotify();
            showNotify();
        }
        f215a = System.currentTimeMillis();
        try {
            switch (f235e) {
                case 1:
                    String[] strArr = {"ENGLISH", "FRANÇAIS", "DEUTSCH", "ITALIANO", "ESPAÑOL"};
                    m90a(graphics, 0);
                    int iStringWidth = (240 - graphics.getFont().stringWidth(strArr[this.f262k])) >> 1;
                    int height = (320 - graphics.getFont().getHeight()) >> 1;
                    m107b(graphics, 0, 0, 240, 30);
                    m107b(graphics, 0, 290, 240, 30);
                    graphics.setColor(16777215);
                    C0009j.m78a(1, graphics, strArr[this.f262k], iStringWidth, height, 20);
                    C0009j.m78a(1, graphics, "<", iStringWidth - (graphics.getFont().charWidth('W') + 5), height, 20);
                    C0009j.m78a(1, graphics, ">", iStringWidth + graphics.getFont().stringWidth(new StringBuffer().append(strArr[this.f262k]).append(7).toString()), height, 20);
                    break;
                case 2:
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, 240, 320);
                    C0009j.m78a(0, graphics, "PUT SPLASH HERE", 120, 0, 17);
                    if ((f233d & 4) != 0) {
                        C0009j.m78a(0, graphics, f223a[19], 120, 320 - (C0009j.f207a[0] << 1), 17);
                    }
                    break;
                case 3:
                    m90a(graphics, 0);
                    C0009j.m78a(0, graphics, f223a == null ? "..." : f223a[18], 120, (320 - C0009j.f207a[0]) >> 1, 17);
                    break;
                case 4:
                    m90a(graphics, 0);
                    C0009j.m78a(0, graphics, f223a[19], 120, (320 - C0009j.f207a[0]) >> 1, 17);
                    break;
                case 5:
                    int i = this.f262k - 1;
                    m90a(graphics, 0);
                    if (this.f250b != null) {
                        if (i == 0) {
                            graphics.setColor(16777215);
                        } else {
                            graphics.setColor(0);
                        }
                        graphics.fillRect(0, 0, 240, 320);
                        this.f250b.m29a(graphics, (240 - this.f250b.f46a) >> 1, (320 - this.f250b.f49b) >> 1);
                    }
                    break;
                case 6:
                    if (f220a != null) {
                        graphics.drawImage(f220a, 0, 0, 0);
                    } else {
                        System.out.println("#Engine.paint: demoSplash null!!");
                    }
                    m106b(graphics, f237f == 2 ? 2 : 0);
                    break;
                case 7:
                    m114c(graphics);
                    break;
                case 8:
                    m105b(graphics);
                    break;
                case 10:
                    m90a(graphics, -14548822);
                    m107b(graphics, 0, 0, 240, 30);
                    m107b(graphics, 0, 290, 240, 30);
                    int i2 = this.f247a.f7b != null ? 1 : 0;
                    if (this.f247a.f3a != null || this.f247a.f6b != 2) {
                        i2 |= 2;
                    }
                    if (this.f247a == this.f249b) {
                        i2 |= 4;
                    }
                    m106b(graphics, i2);
                    graphics.translate(0, 30);
                    graphics.setClip(0, 0, 240, 260);
                    if (this.f247a.f6b == 0) {
                        f231c.m32b(graphics, (240 - f231c.f46a) >> 1, (260 - f231c.f49b) >> 1);
                        int i3 = 260 - C0009j.f207a[0];
                        m93a(graphics, this.f247a.f5a[this.f247a.f2a], 120, i3 - (C0004e.f26a >> 2), 17);
                        f225a[0][0].m29a(graphics, 10, i3);
                        f225a[1][0].m29a(graphics, 230 - f225a[1][0].f46a, i3);
                        if (f237f > 0) {
                            graphics.drawString(f223a[48], 120 - (graphics.getFont().stringWidth(f223a[48]) >> 1), 0, 20);
                        }
                    } else if (this.f247a.f6b == 3) {
                        m92a(graphics, this.f247a.f2a / 3, (this.f247a.f2a % 3) + 1, true);
                    } else if (this.f247a.f6b == 1 || this.f247a.f6b == 2) {
                        graphics.setColor(0);
                        graphics.fillRect(0, 0, 240, 260);
                        if (this.f247a.f4a != null) {
                            m95a(graphics, this.f247a.f4a, 120, 5, 17, -1118482, -10264122);
                        }
                        int i4 = (260 - this.f264o) >> 1;
                        if (this.f265p > 0) {
                            f225a[3][0].m29a(graphics, 120, f243m + 5 + 2 + 3);
                        }
                        graphics.setFont(C0004e.f29a[1]);
                        for (int i5 = this.f265p; i5 < this.f266q; i5++) {
                            if (this.f247a.f6b == 2 || i5 != this.f247a.f2a) {
                                graphics.setColor(10526880);
                                graphics.drawString(this.f247a.f5a[i5], 120, i4, 17);
                            } else {
                                graphics.setColor(6711039);
                                graphics.fillRect(20, i4, 200, graphics.getFont().getHeight());
                                graphics.setColor(16777215);
                                graphics.drawString(this.f247a.f5a[i5], 120, i4, 17);
                            }
                            i4 += f243m + 2;
                        }
                        if (this.f266q < this.f247a.m0a()) {
                            f225a[2][0].m29a(graphics, 120, i4 + 2);
                        }
                    }
                    graphics.translate(0, -30);
                    break;
                case 20:
                    m90a(graphics, 0);
                    break;
                case 100:
                    C0008i.m45a(graphics);
                    break;
            }
        } catch (Exception e) {
        }
        System.gc();
    }

    /* JADX WARN: Code duplicated, block: B:218:0x045f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0465  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        f228b = true;
        f235e = 0;
        boolean z4 = true;
        while (f228b) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f215a = jCurrentTimeMillis;
            try {
                if (f222a) {
                    f222a = false;
                    f246t = 0;
                    f245s = 0;
                    f226b = System.currentTimeMillis();
                    if (f235e != 4) {
                        C0004e.m15a(1);
                        if (f223a != null) {
                            f240i = f235e;
                            f235e = 4;
                        }
                    }
                }
                if (!f232c) {
                    C0004e.m18a();
                    try {
                        if (this.f256g) {
                            this.f256g = C0004e.m15a(2) == 0;
                        }
                        switch (f235e) {
                            case 0:
                                C0009j.m77a(0);
                                C0009j.m77a(1);
                                f235e = 3;
                                m117d();
                                m119e();
                                C0004e.m15a(0);
                                String strM83a = m83a("ms-skPos");
                                if (strM83a != null) {
                                    f238f = strM83a.equals("1");
                                }
                                String strM83a2 = m83a("ms-demoMode");
                                if (strM83a2 != null) {
                                    f237f = Integer.valueOf(strM83a2).intValue();
                                }
                                if (f237f == 2) {
                                    this.f248a = m83a(new StringBuffer().append("demoUrl_").append(System.getProperty("LGE.CA")).toString());
                                    if (this.f248a == null || this.f248a.length() == 0) {
                                        this.f248a = m83a(new StringBuffer().append("demoUrl_ORANGE_").append(System.getProperty("microedition.locale").substring(0, 2).toUpperCase()).toString());
                                    }
                                    if (this.f248a == null || this.f248a.length() == 0) {
                                        this.f248a = m83a("demoUrl_ORANGE_GB");
                                    }
                                    if (this.f248a == null || this.f248a == "") {
                                        f237f = 1;
                                    }
                                }
                                String strM83a3 = m83a("ms-demoDuration");
                                if (strM83a3 != null) {
                                    f239g = Integer.valueOf(strM83a3).intValue();
                                }
                                m112c(0);
                                f244r++;
                                String strM83a4 = m83a("ms-multiLang");
                                if (strM83a4 == null) {
                                    m88a(f229b[0]);
                                    m122h();
                                } else if (!strM83a4.equals("1")) {
                                    m88a(strM83a4);
                                    m122h();
                                } else {
                                    f235e = 3;
                                    m117d();
                                    this.f262k = 0;
                                    f235e = 1;
                                }
                                break;
                            case 1:
                                if (m116c(4)) {
                                    this.f262k--;
                                    if (this.f262k < 0) {
                                        this.f262k = f229b.length - 1;
                                    }
                                } else if (m116c(8)) {
                                    this.f262k++;
                                    if (this.f262k > f229b.length - 1) {
                                        this.f262k = 0;
                                    }
                                } else if (m116c(16)) {
                                    f242l = this.f262k;
                                    m88a(f229b[this.f262k]);
                                    m122h();
                                }
                                break;
                            case 2:
                                if (m96a()) {
                                    m86a(this.f249b);
                                }
                                break;
                            case 4:
                                if (m96a()) {
                                    f235e = f240i;
                                    new StringBuffer().append("setting state to ").append(f235e).toString();
                                    if (f235e == 100) {
                                        new StringBuffer().append("resuming gameworld").append(System.currentTimeMillis() / 1000).toString();
                                        C0008i.m44a(System.currentTimeMillis() - f226b);
                                    } else if (f235e == 10 && this.f247a != this.f251c) {
                                        new StringBuffer().append("resuming menu ").append(System.currentTimeMillis() / 1000).toString();
                                        C0004e.m16a(3, 0);
                                    }
                                }
                                break;
                            case 5:
                                m108b(false);
                                break;
                            case 6:
                                if (f237f == 2 && m116c(64)) {
                                    m113c(this.f248a);
                                }
                                if (m116c(128)) {
                                    m86a(this.f249b);
                                }
                                break;
                            case 7:
                                if (m116c(64)) {
                                    f235e = 100;
                                    m85a(0, 0);
                                } else if (m116c(128)) {
                                    f228b = false;
                                }
                                break;
                            case 8:
                                if (m116c(64)) {
                                    m113c(this.f248a);
                                }
                                if (m116c(128)) {
                                    m86a(this.f249b);
                                }
                                break;
                            case 10:
                                if (this.f247a.f6b == 0 || this.f247a.f6b == 3) {
                                    if (m116c(4)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else if ((this.f247a.f6b == 1 || this.f247a.f6b == 2) && m116c(1)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean z5 = (this.f247a.f6b == 2 && m109b(1)) ? true : z;
                                if (this.f247a.f6b == 0 || this.f247a.f6b == 3) {
                                    if (m116c(8)) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } else if ((this.f247a.f6b == 1 || this.f247a.f6b == 2) && m116c(2)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                boolean z6 = (this.f247a.f6b == 2 && m109b(2)) ? true : z2;
                                if (z5) {
                                    C0000a c0000a = this.f247a;
                                    int i = c0000a.f2a - 1;
                                    c0000a.f2a = i;
                                    if (i >= 0) {
                                        z3 = true;
                                    } else if (this.f247a.f6b == 2) {
                                        this.f247a.f2a = 0;
                                        z3 = false;
                                    } else {
                                        m103b(1);
                                        this.f247a.f2a = this.f247a.m0a() - 1;
                                        z3 = true;
                                    }
                                } else {
                                    z3 = false;
                                }
                                if (z6) {
                                    int iM0a = this.f247a.m0a();
                                    if (this.f247a.f6b == 2) {
                                        int i2 = iM0a - 3;
                                        C0000a c0000a2 = this.f247a;
                                        int i3 = c0000a2.f2a + 1;
                                        c0000a2.f2a = i3;
                                        if (i3 >= i2) {
                                            this.f247a.f2a = i2 - 1;
                                        } else {
                                            z3 = true;
                                        }
                                    } else {
                                        m103b(2);
                                        C0000a c0000a3 = this.f247a;
                                        int i4 = c0000a3.f2a + 1;
                                        c0000a3.f2a = i4;
                                        if (i4 >= iM0a) {
                                            this.f247a.f2a = 0;
                                        }
                                        z3 = true;
                                    }
                                } else if (m116c(16) || m116c(64)) {
                                    if (this.f247a.f3a != null) {
                                        this.f247a.f3a.f2a = 0;
                                        m86a(this.f247a.f3a);
                                    } else {
                                        m87a(this.f247a, this.f247a.f2a);
                                    }
                                } else if (m116c(128)) {
                                    if (this.f247a == this.f249b) {
                                        m86a(this.f253e);
                                    } else if (this.f247a == this.f251c) {
                                        m120f();
                                    } else if (this.f247a.f7b != null) {
                                        this.f247a.f2a = 0;
                                        m86a(this.f247a.f7b);
                                    }
                                    break;
                                }
                                if (z3) {
                                    m125k();
                                }
                                break;
                            case 20:
                                f227b = null;
                                if (0 != 0) {
                                    f235e = 10;
                                }
                                break;
                            case 100:
                                C0008i.m63c();
                                break;
                        }
                        f233d++;
                    } catch (Exception e) {
                    }
                    if (f235e == 100) {
                        if (C0008i.f85a != 0 && System.currentTimeMillis() - C0008i.f85a > 1000) {
                            try {
                                C0008i.f85a = System.currentTimeMillis();
                                C0008i.f84a++;
                                System.out.println(new StringBuffer().append("//Debug: Secs: ").append(C0008i.f84a).toString());
                                z4 = true;
                            } catch (Exception e2) {
                                z4 = true;
                            }
                        }
                    } else if (z4) {
                        int i5 = C0008i.f84a - 1;
                        C0008i.f84a = i5;
                        if (i5 < 0) {
                            C0008i.f84a = 0;
                        }
                        z4 = false;
                    }
                    m117d();
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 < 70) {
                    Thread.sleep(70 - jCurrentTimeMillis2);
                }
            } catch (Exception e3) {
            }
        }
        C0004e.m15a(1);
        f216a.destroyApp(true);
        f216a.notifyDestroyed();
    }
}
