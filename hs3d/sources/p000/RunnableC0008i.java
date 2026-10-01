package p000;

import java.util.Calendar;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
final class RunnableC0008i extends GameCanvas implements Runnable, CommandListener {

    /* JADX INFO: renamed from: a */
    static int f278a;

    /* JADX INFO: renamed from: a */
    public static HSpeed f280a;

    /* JADX INFO: renamed from: a */
    private static Alert f284a;

    /* JADX INFO: renamed from: a */
    static Graphics f286a;

    /* JADX INFO: renamed from: a */
    static Image f287a;

    /* JADX INFO: renamed from: a */
    static byte[][] f293a;

    /* JADX INFO: renamed from: b */
    static int f296b;

    /* JADX INFO: renamed from: c */
    static String f305c;

    /* JADX INFO: renamed from: c */
    static byte[] f307c;

    /* JADX INFO: renamed from: d */
    static byte f309d;

    /* JADX INFO: renamed from: d */
    private static byte[] f312d;

    /* JADX INFO: renamed from: e */
    static byte f313e;

    /* JADX INFO: renamed from: e */
    private static byte[] f316e;

    /* JADX INFO: renamed from: f */
    private static byte[] f320f;

    /* JADX INFO: renamed from: g */
    private static byte[] f323g;

    /* JADX INFO: renamed from: h */
    private static byte[] f326h;

    /* JADX INFO: renamed from: n */
    private static byte f337n;

    /* JADX INFO: renamed from: o */
    private static byte f339o;

    /* JADX INFO: renamed from: p */
    private static boolean f341p;

    /* JADX INFO: renamed from: h */
    private static boolean f325h = false;

    /* JADX INFO: renamed from: c */
    private static int f304c = 0;

    /* JADX INFO: renamed from: a */
    static boolean f289a = false;

    /* JADX INFO: renamed from: a */
    static String f283a = null;

    /* JADX INFO: renamed from: b */
    static String f297b = null;

    /* JADX INFO: renamed from: b */
    static boolean f299b = false;

    /* JADX INFO: renamed from: i */
    private static boolean f328i = false;

    /* JADX INFO: renamed from: c */
    static boolean f306c = false;

    /* JADX INFO: renamed from: m */
    private static byte f335m = 0;

    /* JADX INFO: renamed from: d */
    static boolean f311d = false;

    /* JADX INFO: renamed from: d */
    private static int f310d = 0;

    /* JADX INFO: renamed from: a */
    static final C0006g f282a = new C0006g();

    /* JADX INFO: renamed from: j */
    private static boolean f330j = false;

    /* JADX INFO: renamed from: e */
    static boolean f315e = false;

    /* JADX INFO: renamed from: a */
    static byte[] f290a = {104, 116, 116, 112, 115, 58, 47, 47};

    /* JADX INFO: renamed from: b */
    static byte[] f300b = {77, 73, 68, 108, 101, 116, 45, 86, 101, 114, 115, 105, 111, 110};

    /* JADX INFO: renamed from: k */
    private static volatile boolean f332k = false;

    /* JADX INFO: renamed from: l */
    private static volatile boolean f334l = false;

    /* JADX INFO: renamed from: m */
    private static volatile boolean f336m = false;

    /* JADX INFO: renamed from: n */
    private static volatile boolean f338n = false;

    /* JADX INFO: renamed from: o */
    private static volatile boolean f340o = false;

    /* JADX INFO: renamed from: a */
    static byte f276a = 0;

    /* JADX INFO: renamed from: a */
    private static final Command f285a = new Command("Exit", 1, 1);

    /* JADX INFO: renamed from: a */
    static final float[] f291a = new float[16];

    /* JADX INFO: renamed from: a */
    static final C0010k f288a = new C0010k();

    /* JADX INFO: renamed from: b */
    static final C0010k f298b = new C0010k();

    /* JADX INFO: renamed from: b */
    static byte f294b = 0;

    /* JADX INFO: renamed from: a */
    static C0001b f281a = null;

    /* JADX INFO: renamed from: c */
    static byte f302c = 0;

    /* JADX INFO: renamed from: q */
    private static boolean f342q = false;

    /* JADX INFO: renamed from: r */
    private static boolean f343r = false;

    /* JADX INFO: renamed from: s */
    private static boolean f344s = false;

    /* JADX INFO: renamed from: e */
    private static int f314e = 0;

    /* JADX INFO: renamed from: f */
    private static int f318f = 0;

    /* JADX INFO: renamed from: b */
    private static float f295b = 0.0f;

    /* JADX INFO: renamed from: c */
    private static float f303c = 40.0f;

    /* JADX INFO: renamed from: f */
    static boolean f319f = false;

    /* JADX INFO: renamed from: f */
    static byte f317f = 0;

    /* JADX INFO: renamed from: g */
    static byte f321g = 1;

    /* JADX INFO: renamed from: h */
    static byte f324h = 2;

    /* JADX INFO: renamed from: i */
    static byte f327i = 3;

    /* JADX INFO: renamed from: j */
    static byte f329j = 0;

    /* JADX INFO: renamed from: k */
    static byte f331k = 0;

    /* JADX INFO: renamed from: l */
    static byte f333l = 0;

    /* JADX INFO: renamed from: a */
    static long f279a = 0;

    /* JADX INFO: renamed from: a */
    static float f277a = 1.0f;

    /* JADX INFO: renamed from: a */
    static volatile boolean[] f292a = {false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    /* JADX INFO: renamed from: b */
    private static volatile boolean[] f301b = {false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    /* JADX INFO: renamed from: c */
    private static volatile boolean[] f308c = {false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    /* JADX INFO: renamed from: t */
    private static boolean f345t = true;

    /* JADX INFO: renamed from: g */
    static boolean f322g = false;

    static {
        byte[] bArr = {77, 73, 68, 108, 101, 116, 45, 72, 101, 97, 112, 45, 83, 105, 122, 101};
    }

    RunnableC0008i(HSpeed hSpeed) {
        super(false);
        f280a = hSpeed;
    }

    /* JADX INFO: renamed from: a */
    public static final int m112a(String str, int i) {
        if (((String) C0009j.f351a.get(str)) != null) {
            try {
                i = Integer.parseInt((String) C0009j.f351a.get(str));
            } catch (Exception e) {
            }
        }
        if (C0014o.f569a > 2139062135 && i > 0) {
            C0014o.f569a = 1260000;
            C0009j.f384d[20] = (byte) C0014o.f569a;
            C0009j.f384d[19] = (byte) (C0014o.f569a >>> 8);
            C0009j.f384d[18] = (byte) (C0014o.f569a >>> 16);
            C0009j.f384d[17] = (byte) (C0014o.f569a >>> 24);
        } else if (C0014o.f569a == 2139062142) {
            C0014o.f569a = 2139062141;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static final String m113a(String str) {
        try {
            return (String) C0009j.f351a.get(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m114a() {
        if (f329j == 4 || f329j == 0) {
            return;
        }
        f329j = f329j == 1 ? (byte) 3 : (byte) 4;
    }

    /* JADX INFO: renamed from: a */
    static void m115a(byte b) {
        if (f333l == 11 || f333l == 98 || f333l == 75) {
            return;
        }
        f333l = b;
        m126b();
    }

    /* JADX INFO: renamed from: a */
    static void m116a(byte b, boolean z) {
        m126b();
        if (z) {
            f329j = (byte) 1;
        }
        new Thread(HSpeed.f0a, new StringBuffer().append("").append((int) b).toString()).start();
    }

    /* JADX INFO: renamed from: a */
    static final void m117a(int i) {
        f286a.drawImage(f287a, 0, i, 0);
    }

    /* JADX INFO: renamed from: a */
    static void m118a(int i, int i2, byte[] bArr, String str) {
        f329j = (byte) 3;
        f313e = (byte) 1;
        if (str != null) {
            f307c = str.getBytes();
        } else {
            f307c = new byte[10];
        }
        f342q = false;
        f337n = (byte) 0;
        f323g = bArr;
        f344s = true;
        m126b();
    }

    /* JADX INFO: renamed from: a */
    static void m119a(int i, boolean z) {
        Image image;
        switch (i) {
            case 0:
                f317f = (byte) 0;
                f321g = (byte) 1;
                f324h = (byte) 2;
                f327i = (byte) 3;
                break;
            case 1:
                f317f = (byte) 3;
                f321g = (byte) 2;
                f324h = (byte) 0;
                f327i = (byte) 1;
                break;
            case 2:
                f317f = (byte) 1;
                f321g = (byte) 0;
                f324h = (byte) 3;
                f327i = (byte) 2;
                break;
            case 3:
                f317f = (byte) 2;
                f321g = (byte) 3;
                f324h = (byte) 1;
                f327i = (byte) 0;
                break;
        }
        if (!z || i == C0013n.f473a) {
            return;
        }
        Image imageCreateImage = null;
        if (i == 1 && C0013n.f473a == 0) {
            Image imageCreateImage2 = Image.createImage(C0009j.f375c, 0, 0, C0009j.f375c.getWidth(), C0009j.f375c.getHeight(), 5);
            imageCreateImage = Image.createImage(C0009j.f366b, 0, 0, C0009j.f366b.getWidth(), C0009j.f366b.getHeight(), 5);
            image = imageCreateImage2;
        } else if (i == 1 && C0013n.f473a == 3) {
            Image imageCreateImage3 = Image.createImage(C0009j.f375c, 0, 0, C0009j.f375c.getWidth(), C0009j.f375c.getHeight(), 3);
            imageCreateImage = Image.createImage(C0009j.f366b, 0, 0, C0009j.f366b.getWidth(), C0009j.f366b.getHeight(), 3);
            image = imageCreateImage3;
        } else if (i == 3 && C0013n.f473a == 0) {
            Image imageCreateImage4 = Image.createImage(C0009j.f375c, 0, 0, C0009j.f375c.getWidth(), C0009j.f375c.getHeight(), 6);
            imageCreateImage = Image.createImage(C0009j.f366b, 0, 0, C0009j.f366b.getWidth(), C0009j.f366b.getHeight(), 6);
            image = imageCreateImage4;
        } else if (i == 3 && C0013n.f473a == 1) {
            Image imageCreateImage5 = Image.createImage(C0009j.f375c, 0, 0, C0009j.f375c.getWidth(), C0009j.f375c.getHeight(), 3);
            imageCreateImage = Image.createImage(C0009j.f366b, 0, 0, C0009j.f366b.getWidth(), C0009j.f366b.getHeight(), 3);
            image = imageCreateImage5;
        } else if (i == 0 && C0013n.f473a == 1) {
            Image imageCreateImage6 = Image.createImage(C0009j.f375c, 0, 0, C0009j.f375c.getWidth(), C0009j.f375c.getHeight(), 6);
            imageCreateImage = Image.createImage(C0009j.f366b, 0, 0, C0009j.f366b.getWidth(), C0009j.f366b.getHeight(), 6);
            image = imageCreateImage6;
        } else if (i == 0 && C0013n.f473a == 3) {
            Image imageCreateImage7 = Image.createImage(C0009j.f375c, 0, 0, C0009j.f375c.getWidth(), C0009j.f375c.getHeight(), 5);
            imageCreateImage = Image.createImage(C0009j.f366b, 0, 0, C0009j.f366b.getWidth(), C0009j.f366b.getHeight(), 5);
            image = imageCreateImage7;
        } else {
            image = null;
        }
        C0009j.f375c = null;
        C0009j.f375c = image;
        C0009j.f366b = null;
        C0009j.f366b = imageCreateImage;
        C0013n.f473a = (byte) i;
        C0011l.m214e();
    }

    /* JADX INFO: renamed from: a */
    static void m120a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        f329j = (byte) 3;
        f309d = (byte) i;
        f312d = bArr;
        f316e = bArr2;
        f320f = bArr3;
        f343r = true;
        m126b();
    }

    /* JADX INFO: renamed from: a */
    private static void m121a(String str) {
        HSpeed.f3b = true;
        if (f284a == null) {
            Alert alert = new Alert("Error");
            f284a = alert;
            alert.setString(str);
            f284a.setTimeout(-2);
            f284a.addCommand(f285a);
            f284a.setCommandListener(HSpeed.f0a);
            Display.getDisplay(f280a).setCurrent(f284a);
            if (f341p) {
                f345t = false;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m122a(String str, String str2) {
        if (C0009j.f351a != null) {
            C0009j.f351a.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m123a(Graphics graphics) {
        graphics.setColor(f306c ? -1 : -16777216);
        graphics.drawRect(0, 0, 320, 240);
        int i = (int) (120.0f - ((240.0f * f303c) / 100.0f));
        int i2 = (int) (160.0f - ((320.0f * f303c) / 100.0f));
        if (f306c) {
            graphics.setColor(-1);
        } else if (f299b) {
            graphics.setColor((-10551296) - ((-16711680) * ((int) f303c)));
        } else {
            graphics.setColor((-10526881) - ((-16711423) * ((int) f303c)));
        }
        graphics.fillRect(0, 0, 320, i);
        if (f306c) {
            graphics.setColor(-1);
        } else if (f299b) {
            graphics.setColor((-10092544) - ((-16711680) * ((int) f303c)));
        } else {
            graphics.setColor((-10066330) - ((-16711423) * ((int) f303c)));
        }
        graphics.fillRect(0, 0, i2, 240);
        if (f306c) {
            graphics.setColor(-1);
        } else if (f299b) {
            graphics.setColor((-10551296) - ((-16711680) * ((int) f303c)));
        } else {
            graphics.setColor((-10526881) - ((-16711423) * ((int) f303c)));
        }
        graphics.fillRect(0, 240 - i, 320, i);
        if (f306c) {
            graphics.setColor(-1);
        } else if (f299b) {
            graphics.setColor((-10092544) - ((-16711680) * ((int) f303c)));
        } else {
            graphics.setColor((-10066330) - ((-16711423) * ((int) f303c)));
        }
        graphics.fillRect(320 - i2, i, i2, 240 - i);
        if (C0009j.f411l != 0 && (f329j == 2 || f329j == 5)) {
            C0006g.m70a(f293a[61]);
            C0006g.m79a(graphics, 160, 208, 1, 0, 1);
        }
        if (C0002c.f68a > 0 && C0002c.f68a < 400) {
            m115a((byte) 11);
        }
        f295b += 25.0f * f277a;
        if (f329j == 1 || f329j == 3) {
            float f = f303c - (f299b ? f277a * 20.0f : f277a * 70.0f);
            f303c = f;
            if (f < 0.0f) {
                f303c = 0.0f;
                f329j = f329j == 3 ? (byte) 4 : (byte) 2;
            }
        } else if (f329j == 4) {
            float f2 = (f299b ? f277a * 20.0f : f277a * 70.0f) + f303c;
            f303c = f2;
            if (f2 > 50.0f) {
                f303c = 50.0f;
                f329j = (byte) 0;
                f299b = false;
            }
        }
        if (f276a != 0 && (f329j == 2 || f329j == 5)) {
            int i3 = 36;
            if (f276a != 2 || C0000a.f25b) {
                if (f310d < 3500 || f276a == 1) {
                    C0006g.m80a(graphics, 13, 13, true, false, 0);
                } else {
                    C0006g.m70a(f293a[130]);
                    C0006g.m79a(graphics, 160, 36, 1, 1, 1);
                    int i4 = (C0006g.f171b[1] << 1) + 36;
                    C0006g.m70a(f293a[103]);
                    C0006g.m88b(": ");
                    C0006g.m79a(graphics, 160, i4, 0, 0, 2);
                    int iM167a = 255 - C0011l.m167a((int) C0009j.f401h[((((((C0013n.f516d - 1) * 5) + C0013n.f525e) - 1) * 7) + 3) + 1]);
                    if (iM167a == 255) {
                        C0006g.m70a(f293a[123]);
                    } else {
                        C0006g.m66a();
                        C0011l.m179a(iM167a * 1000);
                    }
                    C0006g.m79a(graphics, 160, i4, 0, 0, 0);
                    int i5 = i4 + C0006g.f171b[0];
                    C0006g.m70a(f293a[51]);
                    C0006g.m88b(": ");
                    C0006g.m79a(graphics, 160, i5, 0, 0, 2);
                    int iM167a2 = C0011l.m167a((int) C0009j.f401h[(((((C0013n.f516d - 1) * 5) + C0013n.f525e) - 1) * 7) + 3 + 3]);
                    if (iM167a2 == 0) {
                        C0006g.m70a(f293a[123]);
                    } else {
                        C0006g.m68a((int) ((iM167a2 * 3.597f) / 1.5f));
                    }
                    C0006g.m79a(graphics, 160, i5, 0, 0, 0);
                    int i6 = i5 + C0006g.f171b[0];
                    C0006g.m70a(f293a[105]);
                    C0006g.m88b(": ");
                    C0006g.m79a(graphics, 160, i6, 0, 0, 2);
                    int iM167a3 = C0011l.m167a((int) C0009j.f401h[(((((C0013n.f516d - 1) * 5) + C0013n.f525e) - 1) * 7) + 3 + 5]);
                    if (iM167a3 == 0) {
                        C0006g.m70a(f293a[123]);
                    } else {
                        C0006g.m68a(iM167a3);
                    }
                    C0006g.m79a(graphics, 160, i6, 0, 0, 0);
                }
                f310d += f296b;
            } else {
                if (C0009j.f370b[0] != 255 || C0009j.f370b[1] != 255 || C0009j.f370b[2] != 255 || C0009j.f370b[3] != 255 || C0009j.f370b[4] != 255 || C0009j.f370b[5] != 255) {
                    C0006g.m70a(f293a[79]);
                    C0006g.m79a(graphics, 160, 36, 1, 1, 1);
                    int i7 = (C0006g.f171b[1] << 1) + 36;
                    if (C0009j.f370b[0] != 255) {
                        C0006g.m70a(f293a[50]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i7, 0, 0, 2);
                        C0006g.m68a(C0009j.f370b[0]);
                        C0006g.m79a(graphics, 160, i7, 0, 0, 0);
                        i7 += C0006g.f171b[0];
                    }
                    if (C0009j.f370b[1] != 255) {
                        C0006g.m70a(f293a[51]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i7, 0, 0, 2);
                        C0006g.m68a(C0009j.f370b[1]);
                        C0006g.m86b(' ');
                        C0006g.m92c(f293a[124]);
                        C0006g.m79a(graphics, 160, i7, 0, 0, 0);
                        i7 += C0006g.f171b[0];
                    }
                    if (C0009j.f370b[2] != 255) {
                        C0006g.m70a(f293a[52]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i7, 0, 0, 2);
                        C0006g.m66a();
                        C0011l.m179a(C0009j.f370b[2] * 1000);
                        C0006g.m79a(graphics, 160, i7, 0, 0, 0);
                        i7 += C0006g.f171b[0];
                    }
                    if (C0009j.f370b[3] != 255 || C0009j.f370b[4] != 255) {
                        C0006g.m70a(f293a[53]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i7, 0, 0, 2);
                        if (C0009j.f370b[3] == 255) {
                            C0006g.m67a('-');
                        } else {
                            C0006g.m68a(C0009j.f370b[3]);
                        }
                        C0006g.m88b(" / ");
                        if (C0009j.f370b[4] == 255) {
                            C0006g.m86b('-');
                        } else {
                            C0006g.m87b(C0009j.f370b[4]);
                        }
                        C0006g.m79a(graphics, 160, i7, 0, 0, 0);
                        i7 += C0006g.f171b[0];
                    }
                    if (C0009j.f370b[5] != 255) {
                        C0006g.m70a(f293a[85]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i7, 0, 0, 2);
                        C0006g.m68a(C0009j.f370b[5]);
                        C0006g.m79a(graphics, 160, i7, 0, 0, 0);
                        i7 += C0006g.f171b[0];
                    }
                    i3 = i7 + C0006g.f171b[1];
                }
                C0006g.m70a(f293a[130]);
                C0006g.m79a(graphics, 160, i3, 1, 1, 1);
                int i8 = i3 + (C0006g.f171b[1] << 1);
                C0006g.m70a(f293a[103]);
                C0006g.m88b(": ");
                C0006g.m79a(graphics, 160, i8, 0, 0, 2);
                int iM167a4 = 255 - C0011l.m167a((int) C0009j.f401h[((((((C0013n.f516d - 1) * 5) + C0013n.f525e) - 1) * 7) + 3) + 1]);
                if (iM167a4 == 255) {
                    C0006g.m70a(f293a[123]);
                } else {
                    C0006g.m66a();
                    C0011l.m179a(iM167a4 * 1000);
                }
                C0006g.m79a(graphics, 160, i8, 0, 0, 0);
                int i9 = i8 + C0006g.f171b[0];
                C0006g.m70a(f293a[51]);
                C0006g.m88b(": ");
                C0006g.m79a(graphics, 160, i9, 0, 0, 2);
                int iM167a5 = C0011l.m167a((int) C0009j.f401h[(((((C0013n.f516d - 1) * 5) + C0013n.f525e) - 1) * 7) + 3 + 3]);
                if (iM167a5 == 0) {
                    C0006g.m70a(f293a[123]);
                } else {
                    C0006g.m68a((int) ((iM167a5 * 3.597f) / 1.5f));
                }
                C0006g.m79a(graphics, 160, i9, 0, 0, 0);
                int i10 = i9 + C0006g.f171b[0];
                C0006g.m70a(f293a[105]);
                C0006g.m88b(": ");
                C0006g.m79a(graphics, 160, i10, 0, 0, 2);
                int iM167a6 = C0011l.m167a((int) C0009j.f401h[(((((C0013n.f516d - 1) * 5) + C0013n.f525e) - 1) * 7) + 3 + 5]);
                if (iM167a6 == 0) {
                    C0006g.m70a(f293a[123]);
                } else {
                    C0006g.m68a(iM167a6);
                }
                C0006g.m79a(graphics, 160, i10, 0, 0, 0);
            }
        }
        try {
            Thread.sleep(5L);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    static void m124a(boolean z, String str) {
        f341p = z;
        if (z) {
            m121a("Not enough memory. Please restart your device.");
        }
    }

    /* JADX INFO: renamed from: a */
    static void m125a(byte[] bArr, int i) {
        f326h = bArr;
        f339o = (byte) i;
        m116a((byte) 6, false);
    }

    /* JADX INFO: renamed from: b */
    static void m126b() {
        for (int i = 0; i < f292a.length; i++) {
            f292a[i] = false;
            f308c[i] = false;
            f301b[i] = false;
        }
        f317f = (byte) 0;
        f321g = (byte) 1;
        f324h = (byte) 2;
        f327i = (byte) 3;
        f319f = false;
    }

    /* JADX INFO: renamed from: b */
    static void m127b(boolean z, String str) {
        f341p = z;
        if (z) {
            m121a("Not enough memory. Please restart your device.");
        }
    }

    /* JADX INFO: renamed from: c */
    static final void m128c() {
        if (C0009j.f384d[1] == 2 && f331k == 9) {
            f281a.m19a("/mw", 1, 1);
        } else {
            f281a.m19a("/mm", 0, -1);
        }
        if (C0009j.f384d[14] == 0) {
            C0009j.f384d[14] = 2;
            C0009j.f385e = (byte) 2;
        }
        f281a.m17a(C0009j.f384d[14]);
    }

    /* JADX INFO: renamed from: d */
    public static void m129d() {
        if (C0013n.f539h == 2) {
            if (C0009j.f384d[14] > 0 && C0009j.f384d[1] == 2) {
                f281a.m18a(2, 2, 1794000, 2580000);
            }
            if (C0009j.f384d[2] == 0) {
                f280a.m1b();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    static void m130e() {
        f302c = (byte) 0;
        f309d = (byte) -1;
    }

    /* JADX INFO: renamed from: f */
    static void m131f() {
        f342q = false;
        f307c = null;
        f323g = null;
        f313e = (byte) -1;
    }

    /* JADX INFO: renamed from: g */
    private static void m132g() {
        m126b();
        switch (f331k) {
            case 1:
                C0009j.m136a();
                break;
            case 9:
                C0013n.m235a();
                break;
        }
        C0011l.m214e();
    }

    /* JADX INFO: renamed from: h */
    private static void m133h() {
        m126b();
        switch (f333l) {
            case 1:
                m116a((byte) 5, true);
                break;
            case 4:
                m116a((byte) 4, true);
                break;
            case 9:
                m116a((byte) 2, true);
                break;
            case 10:
                f280a.m2c();
                break;
            case 75:
                C0011l.m203b();
                C0011l.m185a((byte[]) null, 9);
                m135j();
                C0011l.m211c();
                String strM113a = m113a("DI");
                if (strM113a == null) {
                    m120a(54, f293a[116], (byte[]) null, f293a[100]);
                } else {
                    String[] strArrM196a = C0011l.m196a(strM113a, 138, true);
                    C0009j.f358a = strArrM196a;
                    if (strArrM196a == null) {
                        m120a(54, f293a[116], (byte[]) null, f293a[100]);
                    } else {
                        byte[] bArrM207b = C0011l.m207b(C0009j.f358a[1]);
                        C0011l.m184a(bArrM207b);
                        m120a(88, bArrM207b, C0011l.m207b(C0009j.f358a[4]), C0011l.m207b(C0009j.f358a[5]));
                    }
                }
                break;
        }
        f331k = f333l;
        if (C0009j.f411l != 3 || C0014o.f569a >= 0) {
            return;
        }
        m115a((byte) 75);
    }

    /* JADX INFO: renamed from: i */
    private static void m134i() {
        if (C0014o.f569a < 2139062100) {
            C0014o.f569a -= f296b;
        }
        if (f286a == null) {
            return;
        }
        f286a.setClip(0, 0, 320, 240);
        if (HSpeed.f2a && f287a != null) {
            m117a(-30);
            C0006g.m70a(f293a[60]);
            C0006g.m79a(f286a, 160, (240 - C0006g.m85b(1)) / 2, 1, 0, 1);
            C0006g.m70a(f293a[73]);
            C0006g.m79a(f286a, 160, 235 - C0006g.f171b[0], 0, 0, 1);
            return;
        }
        if (f294b == 1) {
            f286a.setColor(-16777216);
            f286a.fillRect(0, 0, 320, 240);
            f294b = (byte) 2;
        } else if (f329j == 1 || f329j == 2 || f329j == 3) {
            m123a(f286a);
        } else {
            if (f343r) {
                m117a(-30);
                C0006g.m70a(f312d);
                C0006g.m79a(f286a, 160, (240 - C0006g.m85b(1)) / 2, 1, 0, 1);
                if (f316e != null) {
                    C0006g.m70a(f316e);
                    C0006g.m79a(f286a, 5, 235 - C0006g.f171b[0], 0, 0, 0);
                }
                if (f320f != null) {
                    C0006g.m70a(f320f);
                    C0006g.m79a(f286a, 315, 235 - C0006g.f171b[0], 0, 0, 2);
                }
            } else if (!f344s) {
                C0011l.m180a(2, f296b);
                switch (f331k) {
                    case 0:
                        f286a.setColor(-16777216);
                        f286a.fillRect(0, 0, 320, 240);
                        if (f287a != null) {
                            m117a(-30);
                        }
                        C0006g.m70a(f293a[26]);
                        C0006g.m79a(f286a, 160, ((240 - C0006g.m85b(1)) >> 1) - 26, 1, 0, 1);
                        C0006g.m70a(f293a[27]);
                        C0006g.m79a(f286a, 5, 235 - C0006g.f171b[0], 0, 0, 0);
                        C0006g.m70a(f293a[28]);
                        C0006g.m79a(f286a, 315, 235 - C0006g.f171b[0], 0, 0, 2);
                        break;
                    case 1:
                        C0009j.m138a(f286a);
                        break;
                    case 4:
                        C0000a.m6a(f286a);
                        break;
                    case 9:
                        C0013n.m244a(f286a);
                        break;
                    case 10:
                        f286a.setColor(-16777216);
                        f286a.fillRect(0, 0, 320, 240);
                        break;
                    case 11:
                        C0011l.m203b();
                        C0011l.m185a((byte[]) null, 9);
                        m135j();
                        C0011l.m211c();
                        String strM113a = m113a("DI");
                        if (strM113a == null) {
                            m120a(54, f293a[116], (byte[]) null, f293a[100]);
                        } else {
                            String[] strArrM196a = C0011l.m196a(strM113a, 138, true);
                            C0009j.f358a = strArrM196a;
                            if (strArrM196a == null) {
                                m120a(54, f293a[116], (byte[]) null, f293a[100]);
                            } else {
                                byte[] bArrM207b = C0011l.m207b(C0009j.f358a[1]);
                                C0011l.m184a(bArrM207b);
                                m120a(88, bArrM207b, C0011l.m207b(C0009j.f358a[4]), C0011l.m207b(C0009j.f358a[5]));
                            }
                        }
                        break;
                }
            } else {
                m117a(-30);
                C0006g.m70a(f323g);
                C0006g.m79a(f286a, 160, 68, 1, 1, 1);
                int length = f307c.length * 13;
                C0011l.m183a(f286a, 4, ((320 - length) / 2) + (f337n * 13) + 3, ((240 - C0006g.f171b[0]) - 13) / 2, 3);
                C0011l.m183a(f286a, 5, ((320 - length) / 2) + (f337n * 13) + 3, (((C0006g.f171b[0] + 240) + 13) / 2) - 2, 3);
                C0011l.m183a(f286a, 2, 13, 120, 3);
                C0011l.m183a(f286a, 3, 307, 120, 3);
                int i = 0;
                while (i < f307c.length) {
                    char c = (char) f307c[i];
                    if (c == ' ') {
                        c = '_';
                    }
                    C0006g.m67a(c);
                    C0006g.m79a(f286a, (i * 13) + ((320 - length) / 2), (240 - C0006g.f171b[0]) / 2, 1, f337n == i ? 1 : 0, 0);
                    i++;
                }
                if (f342q) {
                    C0011l.m183a(f286a, 1, 160, 225, 3);
                }
                C0011l.m183a(f286a, 0, 305, 225, 3);
            }
            if (f329j == 4 || f329j == 5) {
                m123a(f286a);
            }
        }
        if (C0009j.f411l != 3 || C0014o.f569a >= 0) {
            return;
        }
        m115a((byte) 75);
    }

    /* JADX INFO: renamed from: j */
    private static void m135j() {
        C0009j.f384d[20] = (byte) C0014o.f569a;
        C0009j.f384d[19] = (byte) (C0014o.f569a >>> 8);
        C0009j.f384d[18] = (byte) (C0014o.f569a >>> 16);
        C0009j.f384d[17] = (byte) (C0014o.f569a >>> 24);
        C0011l.m185a(C0009j.f384d, 1);
        C0011l.m185a((byte[]) null, 11);
        for (int i = 0; i < 10; i++) {
            C0011l.m185a((byte[]) null, i + 12);
        }
        C0009j.f390e = new byte[C0009j.f356a.length];
        System.arraycopy(C0009j.f356a, 0, C0009j.f390e, 0, C0009j.f390e.length);
        C0011l.m185a(C0009j.f390e, 3);
        C0009j.f354a = C0011l.m177a((int) C0009j.f390e[3], (int) C0009j.f390e[4]);
        C0009j.f379d = C0009j.f390e[5];
        C0009j.f395f = new byte[C0009j.f369b.length];
        System.arraycopy(C0009j.f369b, 0, C0009j.f395f, 0, C0009j.f395f.length);
        C0011l.m185a(C0009j.f395f, 4);
        byte[] bArr = new byte[73];
        C0009j.f401h = bArr;
        C0011l.m185a(bArr, 7);
        byte[] bArr2 = new byte[21];
        C0009j.f407j = bArr2;
        bArr2[0] = (byte) Calendar.getInstance().get(2);
        C0011l.m185a(C0009j.f407j, 22);
        C0009j.f404i[0] = 1;
        C0009j.f404i[1] = 3;
        C0011l.m185a(C0009j.f404i, 8);
        byte[] bArr3 = {0, 0, 1, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 15, 8, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 15, 5, 0, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 0, 7, 4, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 4, 11};
        C0009j.f398g = bArr3;
        C0011l.m185a(bArr3, 10);
        C0009j.f382d = null;
        C0009j.f355a = false;
        C0009j.f378c = null;
        C0011l.m185a((byte[]) null, 2);
        C0011l.m185a((byte[]) null, 6);
        C0009j.f364b = 0;
        C0011l.m185a(new byte[]{77, 0, 0, 0, 0, 0, 0}, 5);
        C0009j.f389e = false;
        C0009j.f394f = false;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command == f285a) {
            if (f341p) {
                f280a.m2c();
            } else {
                Display.getDisplay(f280a).setCurrent(this);
            }
        }
        HSpeed.f3b = false;
    }

    protected final void hideNotify() {
        if (HSpeed.f3b || HSpeed.f2a) {
            return;
        }
        f280a.pauseApp();
    }

    protected final void keyPressed(int i) {
        byte b;
        f319f = true;
        switch (i) {
            case -8:
            case 43:
            case 1044:
            case 1076:
                b = -8;
                break;
            case -7:
            case 58:
            case 63:
            case 79:
            case 80:
            case 111:
            case 112:
            case 1047:
            case 1065:
            case 1079:
            case 1097:
                b = -7;
                break;
            case -6:
            case 33:
            case 47:
            case 81:
            case 87:
            case 113:
            case 119:
            case 1049:
            case 1062:
            case 1081:
            case 1093:
            case 1094:
            case 1098:
                b = -6;
                break;
            case -5:
            case 53:
            case 71:
            case 72:
            case 103:
            case 104:
            case 1055:
            case 1056:
            case 1087:
            case 1088:
                b = 53;
                break;
            case -4:
            case 54:
            case 74:
            case 75:
            case 106:
            case 107:
            case 1051:
            case 1054:
            case 1083:
            case 1086:
                b = 54;
                break;
            case -3:
            case 52:
            case 68:
            case 70:
            case 100:
            case 102:
            case 1040:
            case 1042:
            case 1072:
            case 1074:
                b = 52;
                break;
            case -2:
            case 56:
            case 66:
            case 86:
            case 98:
            case 118:
            case 1048:
            case 1052:
            case 1080:
            case 1084:
                b = 56;
                break;
            case -1:
            case 50:
            case 84:
            case 89:
            case 116:
            case 121:
            case 1045:
            case 1053:
            case 1077:
            case 1085:
                b = 50;
                break;
            case 32:
            case 48:
                b = 48;
                break;
            case 35:
                b = 35;
                break;
            case 42:
                b = 42;
                break;
            case 49:
            case 69:
            case 82:
            case 101:
            case 114:
            case 1050:
            case 1059:
            case 1082:
            case 1091:
                b = 49;
                break;
            case 51:
            case 73:
            case 85:
            case 105:
            case 117:
            case 1043:
            case 1064:
            case 1075:
            case 1096:
                b = 51;
                break;
            case 55:
            case 67:
            case 88:
            case 99:
            case 120:
            case 1057:
            case 1063:
            case 1089:
            case 1095:
                b = 55;
                break;
            case 57:
            case 77:
            case 78:
            case 109:
            case 110:
            case 1058:
            case 1068:
            case 1090:
            case 1100:
                b = 57;
                break;
            default:
        }
        if (f331k != 1 || C0009j.f405j != 6) {
            f335m = (byte) 0;
        } else if (f335m == 0 && b == 48) {
            f335m = (byte) 1;
        } else if (f335m == 1 && b == 49) {
            f335m = (byte) 2;
        } else if (f335m == 2 && b == 48) {
            f335m = (byte) 3;
        } else if (f335m == 3 && b == 55) {
            f335m = (byte) 4;
        } else if (f335m == 4 && b == 51) {
            f335m = (byte) 5;
        } else if (f335m == 5 && b == 48) {
            f335m = (byte) 6;
        } else if (f335m == 6 && b == 51) {
            f335m = (byte) 7;
        } else if (f335m == 7 && b == 49) {
            f311d = true;
            f335m = (byte) 0;
        } else {
            f335m = (byte) 0;
        }
        switch (C0013n.f539h) {
            case 2:
            case 5:
                switch (C0009j.f384d[5]) {
                    case 0:
                        switch (b) {
                            case -7:
                                f301b[11] = true;
                                break;
                            case -6:
                                f301b[10] = true;
                                break;
                            case 35:
                                f301b[7] = true;
                                break;
                            case 42:
                                f301b[8] = true;
                                break;
                            case 48:
                                f301b[6] = true;
                                break;
                            case 49:
                                if (C0004e.f134b == 0) {
                                    f301b[f324h] = true;
                                    f301b[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 1) {
                                    f301b[f317f] = true;
                                    f301b[5] = true;
                                } else if (C0004e.f134b == 3) {
                                    f301b[f327i] = true;
                                    f301b[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 50:
                                f314e = 0;
                                f318f = 0;
                                f301b[0] = true;
                                break;
                            case 51:
                                if (C0004e.f134b == 0) {
                                    f301b[f327i] = true;
                                    f301b[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 1) {
                                    f301b[f324h] = true;
                                    f301b[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 52:
                                f301b[2] = true;
                                break;
                            case 53:
                                f301b[9] = true;
                                break;
                            case 54:
                                f301b[3] = true;
                                break;
                            case 55:
                                if (C0004e.f134b == 0) {
                                    f301b[f317f] = true;
                                    f301b[5] = true;
                                } else if (C0004e.f134b == 3) {
                                    f301b[f324h] = true;
                                    f301b[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 56:
                                f314e = 0;
                                f318f = 0;
                                f301b[1] = true;
                                break;
                            case 57:
                                if (C0004e.f134b == 0) {
                                    f301b[12] = true;
                                } else if (C0004e.f134b == 1) {
                                    f301b[f327i] = true;
                                    f301b[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 3) {
                                    f301b[f317f] = true;
                                    f301b[5] = true;
                                }
                                break;
                            case 125:
                            case 126:
                            case 127:
                                f301b[9] = true;
                                break;
                        }
                        break;
                    case 1:
                        switch (b) {
                            case -7:
                                f301b[11] = true;
                                break;
                            case -6:
                                f301b[10] = true;
                                break;
                            case 35:
                                f301b[8] = true;
                                break;
                            case 42:
                                f301b[7] = true;
                                break;
                            case 48:
                                f301b[6] = true;
                                break;
                            case 49:
                                if (C0004e.f134b == 0) {
                                    f301b[f324h] = true;
                                    f301b[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 3) {
                                    f301b[f327i] = true;
                                    f301b[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 50:
                                f314e = 0;
                                f318f = 0;
                                f301b[0] = true;
                                break;
                            case 51:
                                if (C0004e.f134b == 0) {
                                    f301b[f327i] = true;
                                    f301b[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 1) {
                                    f301b[f324h] = true;
                                    f301b[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 3) {
                                    f301b[f317f] = true;
                                    f301b[12] = true;
                                }
                                break;
                            case 52:
                                f301b[2] = true;
                                break;
                            case 53:
                                f301b[9] = true;
                                break;
                            case 54:
                                f301b[3] = true;
                                break;
                            case 55:
                                if (C0004e.f134b == 0) {
                                    f301b[5] = true;
                                } else if (C0004e.f134b == 1) {
                                    f301b[f317f] = true;
                                    f301b[12] = true;
                                } else if (C0004e.f134b == 3) {
                                    f301b[f324h] = true;
                                    f301b[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 56:
                                f314e = 0;
                                f318f = 0;
                                f301b[1] = true;
                                break;
                            case 57:
                                if (C0004e.f134b == 0) {
                                    f301b[f317f] = true;
                                    f301b[12] = true;
                                } else if (C0004e.f134b == 1) {
                                    f301b[f327i] = true;
                                    f301b[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 125:
                            case 126:
                            case 127:
                                f301b[9] = true;
                                break;
                        }
                        break;
                }
                break;
            case 3:
            case 4:
            default:
                switch (b) {
                    case -8:
                    case 35:
                        f301b[8] = true;
                        break;
                    case -7:
                        f301b[11] = true;
                        break;
                    case -6:
                        f301b[10] = true;
                        break;
                    case 42:
                        f301b[7] = true;
                        break;
                    case 48:
                        f301b[6] = true;
                        break;
                    case 49:
                        f301b[4] = true;
                        break;
                    case 50:
                        f314e = 0;
                        f318f = 0;
                        f301b[0] = true;
                        break;
                    case 51:
                        f301b[13] = true;
                        break;
                    case 52:
                        f301b[2] = true;
                        break;
                    case 53:
                        f301b[9] = true;
                        break;
                    case 54:
                        f301b[3] = true;
                        break;
                    case 55:
                        f301b[5] = true;
                        break;
                    case 56:
                        f314e = 0;
                        f318f = 0;
                        f301b[1] = true;
                        break;
                    case 57:
                        f301b[12] = true;
                        break;
                    case 125:
                    case 126:
                    case 127:
                        f301b[9] = true;
                        break;
                }
                break;
        }
    }

    protected final void keyReleased(int i) {
        byte b;
        switch (i) {
            case -8:
            case 43:
            case 1044:
            case 1076:
                b = -8;
                break;
            case -7:
            case 58:
            case 63:
            case 79:
            case 80:
            case 111:
            case 112:
            case 1047:
            case 1065:
            case 1079:
            case 1097:
                b = -7;
                break;
            case -6:
            case 33:
            case 47:
            case 81:
            case 87:
            case 113:
            case 119:
            case 1049:
            case 1062:
            case 1081:
            case 1093:
            case 1094:
            case 1098:
                b = -6;
                break;
            case -5:
            case 53:
            case 71:
            case 72:
            case 103:
            case 104:
            case 1055:
            case 1056:
            case 1087:
            case 1088:
                b = 53;
                break;
            case -4:
            case 54:
            case 74:
            case 75:
            case 106:
            case 107:
            case 1051:
            case 1054:
            case 1083:
            case 1086:
                b = 54;
                break;
            case -3:
            case 52:
            case 68:
            case 70:
            case 100:
            case 102:
            case 1040:
            case 1042:
            case 1072:
            case 1074:
                b = 52;
                break;
            case -2:
            case 56:
            case 66:
            case 86:
            case 98:
            case 118:
            case 1048:
            case 1052:
            case 1080:
            case 1084:
                b = 56;
                break;
            case -1:
            case 50:
            case 84:
            case 89:
            case 116:
            case 121:
            case 1045:
            case 1053:
            case 1077:
            case 1085:
                b = 50;
                break;
            case 32:
            case 48:
                b = 48;
                break;
            case 35:
                b = 35;
                break;
            case 42:
                b = 42;
                break;
            case 49:
            case 69:
            case 82:
            case 101:
            case 114:
            case 1050:
            case 1059:
            case 1082:
            case 1091:
                b = 49;
                break;
            case 51:
            case 73:
            case 85:
            case 105:
            case 117:
            case 1043:
            case 1064:
            case 1075:
            case 1096:
                b = 51;
                break;
            case 55:
            case 67:
            case 88:
            case 99:
            case 120:
            case 1057:
            case 1063:
            case 1089:
            case 1095:
                b = 55;
                break;
            case 57:
            case 77:
            case 78:
            case 109:
            case 110:
            case 1058:
            case 1068:
            case 1090:
            case 1100:
                b = 57;
                break;
            default:
        }
        switch (C0013n.f539h) {
            case 2:
            case 5:
                switch (C0009j.f384d[5]) {
                    case 0:
                        switch (b) {
                            case -7:
                                f308c[11] = true;
                                break;
                            case -6:
                                f308c[10] = true;
                                break;
                            case 35:
                                f308c[7] = true;
                                break;
                            case 42:
                                f308c[8] = true;
                                break;
                            case 48:
                                f308c[6] = true;
                                break;
                            case 49:
                                if (C0004e.f134b == 0) {
                                    f308c[f324h] = true;
                                    f308c[4] = true;
                                } else if (C0004e.f134b == 1) {
                                    f308c[f317f] = true;
                                    f308c[5] = true;
                                } else if (C0004e.f134b == 3) {
                                    f308c[f327i] = true;
                                    f308c[13] = true;
                                }
                                break;
                            case 50:
                                f308c[0] = true;
                                break;
                            case 51:
                                if (C0004e.f134b == 0) {
                                    f308c[f327i] = true;
                                    f308c[13] = true;
                                } else if (C0004e.f134b == 1) {
                                    f308c[f324h] = true;
                                    f308c[4] = true;
                                }
                                break;
                            case 52:
                                f308c[2] = true;
                                break;
                            case 53:
                                f308c[9] = true;
                                break;
                            case 54:
                                f308c[3] = true;
                                break;
                            case 55:
                                if (C0004e.f134b == 0) {
                                    f308c[f317f] = true;
                                    f308c[5] = true;
                                } else if (C0004e.f134b == 3) {
                                    f308c[f324h] = true;
                                    f308c[4] = true;
                                }
                                break;
                            case 56:
                                f308c[1] = true;
                                break;
                            case 57:
                                if (C0004e.f134b == 0) {
                                    f308c[12] = true;
                                } else if (C0004e.f134b == 1) {
                                    f308c[f327i] = true;
                                    f308c[13] = true;
                                } else if (C0004e.f134b == 3) {
                                    f308c[f317f] = true;
                                    f308c[5] = true;
                                }
                                break;
                            case 125:
                            case 126:
                            case 127:
                                f308c[9] = true;
                                break;
                        }
                        break;
                    case 1:
                        switch (b) {
                            case -7:
                                f308c[11] = true;
                                break;
                            case -6:
                                f308c[10] = true;
                                break;
                            case 35:
                                f308c[8] = true;
                                break;
                            case 42:
                                f308c[7] = true;
                                break;
                            case 48:
                                f308c[6] = true;
                                break;
                            case 49:
                                if (C0004e.f134b == 0) {
                                    f308c[f324h] = true;
                                    f308c[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 3) {
                                    f308c[f327i] = true;
                                    f308c[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 50:
                                f308c[0] = true;
                                break;
                            case 51:
                                if (C0004e.f134b == 0) {
                                    f308c[f327i] = true;
                                    f308c[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 1) {
                                    f308c[f324h] = true;
                                    f308c[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                } else if (C0004e.f134b == 3) {
                                    f308c[f317f] = true;
                                    f308c[12] = true;
                                }
                                break;
                            case 52:
                                f308c[2] = true;
                                break;
                            case 53:
                                f308c[9] = true;
                                break;
                            case 54:
                                f308c[3] = true;
                                break;
                            case 55:
                                if (C0004e.f134b == 0) {
                                    f308c[5] = true;
                                } else if (C0004e.f134b == 1) {
                                    f308c[f317f] = true;
                                    f308c[12] = true;
                                } else if (C0004e.f134b == 3) {
                                    f308c[f324h] = true;
                                    f308c[4] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 56:
                                f308c[1] = true;
                                break;
                            case 57:
                                if (C0004e.f134b == 0) {
                                    f308c[f317f] = true;
                                    f308c[12] = true;
                                } else if (C0004e.f134b == 1) {
                                    f308c[f327i] = true;
                                    f308c[13] = true;
                                    if (C0007h.f230c >= 0) {
                                        C0007h.f208a = (byte) 127;
                                    }
                                }
                                break;
                            case 125:
                            case 126:
                            case 127:
                                f308c[9] = true;
                                break;
                        }
                        break;
                }
                break;
            case 3:
            case 4:
            default:
                switch (b) {
                    case -8:
                    case 35:
                        f308c[8] = true;
                        break;
                    case -7:
                        f308c[11] = true;
                        break;
                    case -6:
                        f308c[10] = true;
                        break;
                    case 42:
                        f308c[7] = true;
                        break;
                    case 48:
                        f308c[6] = true;
                        break;
                    case 49:
                        f308c[4] = true;
                        break;
                    case 50:
                        f308c[0] = true;
                        break;
                    case 51:
                        f308c[13] = true;
                        break;
                    case 52:
                        f308c[2] = true;
                        break;
                    case 53:
                        f308c[9] = true;
                        break;
                    case 54:
                        f308c[3] = true;
                        break;
                    case 55:
                        f308c[5] = true;
                        break;
                    case 56:
                        f308c[1] = true;
                        break;
                    case 57:
                        f308c[12] = true;
                        break;
                    case 125:
                    case 126:
                    case 127:
                        f308c[9] = true;
                        break;
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:200:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:203:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:207:0x03df  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        boolean z;
        boolean z2;
        int length;
        String string;
        int i2;
        int i3;
        f304c++;
        String name = Thread.currentThread().getName();
        switch (name.length()) {
            case 1:
                i = name.getBytes()[0] - 48;
                break;
            case 2:
                i = (name.getBytes()[1] + 10) - 48;
                break;
            default:
                i = 1;
                break;
        }
        if (i != 1) {
            HSpeed.f1a.setPriority(1);
            Thread.currentThread().setPriority(10);
        }
        switch (i) {
            case 1:
                if (!f330j) {
                    f330j = true;
                    f281a = new C0001b(C0007h.f221b);
                    f286a = getGraphics();
                    C0011l.f460a[20][0] = (short) ((getWidth() / 3) + C0011l.f460a[20][2]);
                    m116a((byte) 12, true);
                }
                while (HSpeed.f1a != null && HSpeed.f1a == Thread.currentThread() && f345t) {
                    f281a.m20b();
                    C0006g.m90b();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (f279a == 0) {
                        f296b = 1;
                    } else {
                        int i4 = (int) (jCurrentTimeMillis - f279a);
                        f296b = i4;
                        if (i4 < 1) {
                            f296b = 1;
                        }
                    }
                    f279a = jCurrentTimeMillis;
                    float fM198b = C0011l.m198b(f296b * 0.0014f);
                    f277a = fM198b;
                    if (fM198b > 0.35f) {
                        f277a = 0.35f;
                        f296b = 250;
                    }
                    for (int i5 = 0; i5 < f292a.length; i5++) {
                        if (!f301b[i5] && f308c[i5]) {
                            f308c[i5] = false;
                            f292a[i5] = false;
                        }
                        if (f301b[i5]) {
                            f301b[i5] = false;
                            f292a[i5] = true;
                            f319f = true;
                        }
                    }
                    if (C0009j.f384d[14] > 0 && C0009j.f384d[1] > 0 && f281a.f64b != -1) {
                        f281a.f64b -= f296b;
                        if (f281a.f64b <= 0) {
                            f281a.m16a();
                        }
                    }
                    C0000a.m14d();
                    if (f333l != f331k && f304c == 1) {
                        m132g();
                        try {
                            Thread.sleep(100L);
                            break;
                        } catch (Exception e) {
                        }
                        m133h();
                    }
                    if (HSpeed.f2a) {
                        f281a.m22c();
                        if (f292a[9]) {
                            f292a[9] = false;
                            HSpeed.m0a();
                        }
                    } else if (f329j == 5 || f329j == 0 || f329j == 4) {
                        if (!f343r) {
                            if (!f344s) {
                                if (f309d == 88) {
                                    if (f302c == 1) {
                                        if (C0011l.m189a(C0009j.f358a[2], C0009j.f358a[3])) {
                                            m120a(89, f293a[117], (byte[]) null, f293a[73]);
                                        } else {
                                            C0011l.m182a(f305c, true);
                                        }
                                        C0009j.f358a = null;
                                    } else {
                                        C0011l.m182a(f305c, true);
                                    }
                                } else if (f309d == 89 || f309d == 54) {
                                    C0011l.m182a(f305c, true);
                                }
                                switch (f331k) {
                                    case 0:
                                        if (f292a[10] || f292a[11] || f292a[f324h] || f292a[f327i]) {
                                            if (f292a[11] || f292a[f327i]) {
                                                C0009j.f384d[1] = 0;
                                                C0009j.f391f = (byte) 0;
                                            } else {
                                                if (C0009j.f384d[1] == 0) {
                                                    C0009j.f384d[1] = 2;
                                                    C0009j.f391f = (byte) 2;
                                                }
                                                C0009j.f383d = true;
                                            }
                                            f329j = (byte) 3;
                                            f331k = (byte) 1;
                                            f333l = (byte) 1;
                                            m126b();
                                        }
                                        break;
                                    case 1:
                                        C0009j.m141c();
                                        break;
                                    case 4:
                                        C0000a.m15e();
                                        break;
                                    case 9:
                                        if (f277a <= 0.18f || C0013n.f539h != 2) {
                                            C0013n.m249d();
                                        } else {
                                            float f = f277a;
                                            int i6 = f296b;
                                            int i7 = f296b / 2;
                                            f296b = i7;
                                            if (i7 < 1) {
                                                f296b = 1;
                                            }
                                            f277a = C0011l.m198b(f296b * 0.0014f);
                                            C0013n.m249d();
                                            C0013n.m249d();
                                            f277a = f;
                                            f296b = i6;
                                        }
                                        break;
                                    case 98:
                                        C0011l.m203b();
                                        C0011l.m185a((byte[]) null, 9);
                                        m135j();
                                        C0011l.m211c();
                                        String strM113a = m113a("DI");
                                        if (strM113a != null) {
                                            String[] strArrM196a = C0011l.m196a(strM113a, 138, true);
                                            C0009j.f358a = strArrM196a;
                                            if (strArrM196a != null) {
                                                byte[] bArrM207b = C0011l.m207b(C0009j.f358a[1]);
                                                C0011l.m184a(bArrM207b);
                                                m120a(88, bArrM207b, C0011l.m207b(C0009j.f358a[4]), C0011l.m207b(C0009j.f358a[5]));
                                            } else {
                                                m120a(54, f293a[116], (byte[]) null, f293a[100]);
                                            }
                                        } else {
                                            m120a(54, f293a[116], (byte[]) null, f293a[100]);
                                        }
                                        break;
                                }
                            } else {
                                if (f292a[f327i]) {
                                    if (f337n + 1 < f307c.length) {
                                        f337n = (byte) (f337n + 1);
                                    }
                                    f292a[f327i] = false;
                                } else if (f292a[f324h]) {
                                    if (f337n - 1 >= 0) {
                                        f337n = (byte) (f337n - 1);
                                    }
                                    f292a[f324h] = false;
                                }
                                if (f292a[11]) {
                                    m131f();
                                    f344s = false;
                                    m126b();
                                    f329j = (byte) 3;
                                    if (C0009j.f405j == 4) {
                                        C0009j.f405j = (byte) 1;
                                    }
                                } else if (f292a[7] || f292a[8] || f292a[6]) {
                                    f292a[7] = false;
                                    f292a[8] = false;
                                    f292a[6] = false;
                                    f307c[f337n] = 32;
                                    if (f337n > 0) {
                                        f337n = (byte) (f337n - 1);
                                    }
                                } else if (f292a[f317f]) {
                                    if (f314e < 1) {
                                        if (f318f < 150) {
                                            f318f += 30;
                                        }
                                        f314e = 300 - f318f;
                                        if (f307c[f337n] == 32) {
                                            f307c[f337n] = 58;
                                        }
                                        byte[] bArr = f307c;
                                        byte b = f337n;
                                        bArr[b] = (byte) (bArr[b] - 1);
                                        if (f307c[f337n] < 65 && f307c[f337n] > 57) {
                                            f307c[f337n] = 57;
                                        }
                                        if (f307c[f337n] < 48) {
                                            f307c[f337n] = 90;
                                        }
                                    } else {
                                        f314e -= f296b;
                                    }
                                } else if (f292a[f321g]) {
                                    if (f314e < 1) {
                                        if (f318f < 150) {
                                            f318f += 30;
                                        }
                                        f314e = 300 - f318f;
                                        if (f307c[f337n] == 32) {
                                            f307c[f337n] = 64;
                                        }
                                        byte[] bArr2 = f307c;
                                        byte b2 = f337n;
                                        bArr2[b2] = (byte) (bArr2[b2] + 1);
                                        if (f307c[f337n] > 90) {
                                            f307c[f337n] = 48;
                                        }
                                        if (f307c[f337n] > 57 && f307c[f337n] < 65) {
                                            f307c[f337n] = 65;
                                        }
                                    } else {
                                        f314e -= f296b;
                                    }
                                }
                                if (f344s) {
                                    f342q = false;
                                    for (int i8 = 0; i8 < f307c.length; i8++) {
                                        if (f307c[i8] != 32) {
                                            f342q = true;
                                            if (f292a[9] && f342q) {
                                                i2 = 0;
                                                while (i2 < f307c.length && f307c[i2] == 32) {
                                                    i2++;
                                                }
                                                if (i2 > 0) {
                                                    for (i3 = 0; i3 < f307c.length; i3++) {
                                                        if (i3 + i2 < f307c.length) {
                                                            f307c[i3] = f307c[i3 + i2];
                                                        } else {
                                                            f307c[i3] = 32;
                                                        }
                                                    }
                                                }
                                                f344s = false;
                                                m126b();
                                                f329j = (byte) 3;
                                            }
                                        }
                                    }
                                    if (f292a[9]) {
                                        i2 = 0;
                                        while (i2 < f307c.length) {
                                            i2++;
                                        }
                                        if (i2 > 0) {
                                            while (i3 < f307c.length) {
                                                if (i3 + i2 < f307c.length) {
                                                    f307c[i3] = f307c[i3 + i2];
                                                } else {
                                                    f307c[i3] = 32;
                                                }
                                            }
                                        }
                                        f344s = false;
                                        m126b();
                                        f329j = (byte) 3;
                                    }
                                }
                            }
                        } else if ((f316e != null && (f292a[10] || f292a[f324h])) || (f320f != null && (f292a[11] || f292a[f327i]))) {
                            f302c = (f292a[10] || f292a[f324h]) ? (byte) 1 : (byte) 2;
                            f343r = false;
                            m126b();
                            if (f309d < 0) {
                                m130e();
                            }
                            f329j = (byte) 3;
                        }
                    } else if (f276a != 0 && (C0000a.f25b || f276a != 2)) {
                        if (f292a[f317f]) {
                            C0006g.m73a((-f277a) * 40.0f);
                        } else if (f292a[f321g]) {
                            C0006g.m73a(f277a * 40.0f);
                        }
                    }
                    if (f294b < 2 || HSpeed.f2a) {
                        m134i();
                        flushGraphics();
                        if (f315e || HSpeed.f2a) {
                            try {
                                Thread.sleep(50L);
                                break;
                            } catch (Exception e2) {
                            }
                        }
                    } else {
                        try {
                            Thread.sleep(30L);
                            break;
                        } catch (Exception e3) {
                        }
                    }
                    if (f331k != 9) {
                        try {
                            Thread.sleep(1L);
                            break;
                        } catch (InterruptedException e4) {
                        }
                    }
                    C0004e.m52a(this);
                    f319f = false;
                }
                break;
            case 2:
                f310d = 0;
                if (C0000a.f25b) {
                    C0006g.m77a("thlp", 294, 175, 214, 255, C0011l.m191a(C0009j.f384d[5] == 0 ? "/rhlp.cc" : "/lhlp.cc"), 0);
                }
                f276a = (byte) 2;
                C0000a.m8a(false, 0);
                C0013n.m248c();
                break;
            case 3:
                C0000a.m7a(!C0000a.f25b);
                m114a();
                break;
            case 4:
                C0006g.m77a("thlp", 294, 175, 214, 255, C0011l.m191a("/ghlp.cc"), 0);
                f276a = (byte) 1;
                C0000a.m5a();
                f276a = (byte) 0;
                C0006g.m72a();
                m114a();
                break;
            case 5:
                while (C0009j.f411l < 2) {
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException e5) {
                    }
                }
                C0009j.m140b();
                m114a();
                break;
            case 6:
                C0011l.m203b();
                C0011l.m185a(f326h, (int) f339o);
                C0011l.m211c();
                f339o = (byte) 0;
                f326h = null;
                break;
            case 7:
                m128c();
                break;
            case 9:
                C0000a.m12c();
                C0000a.f33c = true;
                break;
            case 10:
                if (C0009j.f366b == null) {
                    C0009j.f366b = C0011l.m202b("/menu2.cc");
                }
                C0009j.m142d();
                C0009j.f405j = (byte) 4;
                m114a();
                break;
            case 11:
                C0011l.m203b();
                m135j();
                C0011l.m211c();
                C0000a.f5a = C0009j.f390e[0];
                C0000a.m7a(true);
                C0000a.m8a(true, 0);
                m114a();
                break;
            case 12:
                C0006g.m75a("arial");
                C0011l.m181a("/lang.dat");
                C0009j.m140b();
                break;
            case 13:
                C0006g.m72a();
                if (C0009j.f402i < 2) {
                    StringBuffer stringBuffer = new StringBuffer(new String(C0011l.m191a(new StringBuffer().append("/stat").append(C0009j.f402i == 0 ? 'v' : 's').append(".cc").toString())));
                    int i9 = 0;
                    while (i9 < stringBuffer.length()) {
                        char cCharAt = stringBuffer.charAt(i9);
                        if (cCharAt <= '\r' || cCharAt >= 27) {
                            length = i9;
                        } else {
                            stringBuffer.delete(i9, i9 + 1);
                            if (cCharAt < 17) {
                                string = new StringBuffer().append(C0011l.m173a((int) C0009j.f401h[cCharAt - 14])).append("").toString();
                            } else {
                                String string2 = new StringBuffer().append(new String(f293a[106])).append(": ").append(C0011l.m173a((int) C0009j.f401h[((cCharAt - 17) * 7) + 3])).append('\n').toString();
                                int iM167a = 255 - C0011l.m167a((int) C0009j.f401h[(((cCharAt - 17) * 7) + 3) + 1]);
                                int iM167a2 = 255 - C0011l.m167a((int) C0009j.f401h[(((cCharAt - 17) * 7) + 3) + 2]);
                                String string3 = new StringBuffer().append(string2).append(new String(f293a[103])).append(": ").append(iM167a == 255 ? "-" : C0011l.m210c(iM167a * 1000)).append(iM167a2 == 255 ? "" : new StringBuffer().append(" ( ").append(C0011l.m210c(iM167a2 * 1000)).append(" )").toString()).append('\n').toString();
                                int iM167a3 = (int) ((C0011l.m167a((int) C0009j.f401h[(((cCharAt - 17) * 7) + 3) + 4]) * 3.597f) / 1.5f);
                                String string4 = new StringBuffer().append(string3).append(new String(f293a[104])).append(": ").append(C0011l.m200b((int) C0009j.f401h[((cCharAt - 17) * 7) + 3 + 3])).append(iM167a3 == 0 ? "" : new StringBuffer().append(" ( ").append(iM167a3).append(" )").toString()).append('\n').toString();
                                int iM167a4 = C0011l.m167a((int) C0009j.f401h[((cCharAt - 17) * 7) + 3 + 6]);
                                string = new StringBuffer().append(string4).append(new String(f293a[105])).append(": ").append(C0011l.m173a((int) C0009j.f401h[((cCharAt - 17) * 7) + 3 + 5])).append(iM167a4 == 0 ? "" : new StringBuffer().append(" ( ").append(iM167a4).append(" )").toString()).append('\n').toString();
                            }
                            stringBuffer.insert(i9, string);
                            length = string.length() + i9;
                        }
                        i9 = length + 1;
                    }
                    C0006g.m76a("stat", 319, 182, 239, 262, stringBuffer.toString(), 0);
                } else {
                    C0011l.m203b();
                    byte[] bArrM206b = C0011l.m206b((C0009j.f402i + 11) - 2);
                    C0011l.m211c();
                    if (bArrM206b != null) {
                        C0006g.m77a("stat", 319, 182, 239, 262, bArrM206b, 0);
                    } else {
                        C0006g.m77a("stat", 319, 182, 239, 262, C0011l.m191a("/statn.cc"), 0);
                    }
                }
                m114a();
                break;
            case 14:
                boolean z3 = true;
                if (C0009j.f364b == 0 && C0009j.f404i[2] == 1) {
                    C0006g.m69a(f283a);
                    C0006g.m88b("?cmd=reg");
                    byte[] bArrM192a = C0011l.m192a(C0006g.m71a(), C0009j.f378c);
                    if (bArrM192a == null || bArrM192a.length != 4) {
                        z3 = false;
                    } else {
                        C0009j.f364b = C0011l.m169a(bArrM192a[0], bArrM192a[1], bArrM192a[2], bArrM192a[3]);
                    }
                }
                if (!z3 || C0009j.f364b == 0) {
                    z = z3;
                } else {
                    if (C0009j.f389e && C0009j.f382d != null) {
                        int[] iArr = new int[3575];
                        C0009j.f382d.getRGB(iArr, 0, 55, 0, 0, 55, 65);
                        byte[] bArr3 = new byte[10725];
                        for (int i10 = 0; i10 < iArr.length; i10++) {
                            bArr3[i10 * 3] = (byte) ((iArr[i10] >> 16) & 255);
                            bArr3[(i10 * 3) + 1] = (byte) ((iArr[i10] >> 8) & 255);
                            bArr3[(i10 * 3) + 2] = (byte) (iArr[i10] & 255);
                        }
                        C0006g.m69a(f283a);
                        C0006g.m88b("?cmd=avatar&user=");
                        C0006g.m87b(C0009j.f364b);
                        byte[] bArrM192a2 = C0011l.m192a(C0006g.m71a(), bArr3);
                        if (bArrM192a2 != null && bArrM192a2.length == 1 && bArrM192a2[0] == 1) {
                            C0009j.f389e = false;
                        }
                    }
                    if (C0009j.f394f && C0009j.f378c != null) {
                        C0006g.m69a(f283a);
                        C0006g.m88b("?cmd=chname&user=");
                        C0006g.m87b(C0009j.f364b);
                        byte[] bArrM192a3 = C0011l.m192a(C0006g.m71a(), C0009j.f378c);
                        if (bArrM192a3 != null && bArrM192a3.length == 1 && bArrM192a3[0] == 1) {
                            C0009j.f394f = false;
                        }
                    }
                    C0006g.m69a(f283a);
                    C0006g.m88b("?cmd=data&user=");
                    C0006g.m87b(C0009j.f364b);
                    C0006g.m88b("&car=");
                    C0006g.m87b((int) C0009j.f390e[0]);
                    C0006g.m88b("&col=");
                    C0006g.m87b((int) C0009j.f398g[(C0009j.f390e[0] * 7) + 2 + 5]);
                    C0006g.m88b("&dec=");
                    C0006g.m87b((int) C0009j.f398g[(C0009j.f390e[0] * 7) + 2 + 6]);
                    int i11 = 0;
                    for (int i12 = 0; i12 < C0009j.f401h.length; i12++) {
                        i11 += C0009j.f401h[i12];
                    }
                    byte[] bArrM82a = C0006g.m82a();
                    boolean z4 = false;
                    int i13 = 0;
                    int i14 = i11;
                    while (i13 < C0006g.f162a) {
                        boolean z5 = bArrM82a[i13] == 63 ? true : z4;
                        if (z5) {
                            i14 += bArrM82a[i13];
                        }
                        i13++;
                        z4 = z5;
                    }
                    C0006g.m88b("&cc=");
                    C0006g.m87b(i14);
                    byte[] bArrM192a4 = C0011l.m192a(C0006g.m71a(), C0009j.f401h);
                    if (bArrM192a4 == null || bArrM192a4.length != 73) {
                        z2 = false;
                    } else {
                        C0009j.f401h = bArrM192a4;
                        C0011l.m203b();
                        C0011l.m185a(C0009j.f401h, 7);
                        byte[] bArrM190a = C0011l.m190a(C0009j.f364b);
                        byte[] bArr4 = new byte[7];
                        bArr4[0] = 77;
                        bArr4[1] = bArrM190a[0];
                        bArr4[2] = bArrM190a[1];
                        bArr4[3] = bArrM190a[2];
                        bArr4[4] = bArrM190a[3];
                        bArr4[5] = (byte) (C0009j.f389e ? 1 : 0);
                        bArr4[6] = (byte) (C0009j.f394f ? 1 : 0);
                        C0011l.m185a(bArr4, 5);
                        C0011l.m211c();
                        z2 = z3;
                    }
                    if (z2) {
                        int iM177a = 0;
                        for (int i15 = 1; i15 < C0009j.f407j.length; i15 += 2) {
                            iM177a += C0011l.m177a((int) C0009j.f407j[i15], (int) C0009j.f407j[i15 + 1]);
                        }
                        C0006g.m69a(f283a);
                        C0006g.m88b("?cmd=mrec&user=");
                        C0006g.m87b(C0009j.f364b);
                        C0006g.m88b("&m=");
                        C0006g.m87b((int) C0009j.f407j[0]);
                        C0006g.m88b("&t=");
                        C0006g.m87b(iM177a);
                        byte[] bArrM82a2 = C0006g.m82a();
                        boolean z6 = false;
                        int i16 = 0;
                        for (int i17 = 0; i17 < C0006g.f162a; i17++) {
                            if (bArrM82a2[i17] == 63) {
                                z6 = true;
                            }
                            if (z6) {
                                i16 += bArrM82a2[i17];
                            }
                        }
                        C0006g.m88b("&cc=");
                        C0006g.m87b(i16);
                        C0011l.m192a(C0006g.m71a(), (byte[]) null);
                    }
                    z = z2;
                }
                C0006g.m69a(f283a);
                C0006g.m88b("?cmd=stats&nn=1&lng=");
                C0006g.m92c(f293a[97]);
                C0006g.m88b("&user=");
                C0006g.m87b(C0009j.f364b);
                byte[] bArrM192a5 = C0011l.m192a(C0006g.m71a(), (byte[]) null);
                if (bArrM192a5 == null || bArrM192a5.length <= 10) {
                    z = false;
                } else {
                    C0011l.m203b();
                    int iM177a2 = C0011l.m177a((int) bArrM192a5[0], (int) bArrM192a5[1]);
                    byte[] bArr5 = new byte[iM177a2];
                    System.arraycopy(bArrM192a5, 2, bArr5, 0, iM177a2);
                    C0011l.m185a(bArr5, 11);
                    for (int i18 = 0; i18 < 10; i18++) {
                        int i19 = iM177a2 + 2;
                        int iM177a3 = C0011l.m177a((int) bArrM192a5[i19], (int) bArrM192a5[i19 + 1]);
                        byte[] bArr6 = new byte[iM177a3];
                        System.arraycopy(bArrM192a5, i19 + 2, bArr6, 0, iM177a3);
                        C0011l.m185a(bArr6, i18 + 12);
                        iM177a2 = i19 + iM177a3;
                    }
                    C0011l.m211c();
                }
                m114a();
                if (!z) {
                    m120a(-5, f293a[108], (byte[]) null, f293a[73]);
                } else if (C0009j.f405j == 13) {
                    m116a((byte) 13, true);
                }
                break;
            case 15:
                byte[] bArrM191a = C0011l.m191a(new StringBuffer().append("/t").append((int) C0009j.f404i[0]).append(".cc").toString());
                C0009j.f346a = bArrM191a[0];
                byte b3 = bArrM191a[1];
                C0009j.f362b = b3;
                if (b3 == 0 || C0009j.f362b == 3) {
                    C0009j.f359a = new Image[]{C0011l.m202b(new StringBuffer().append("/t/").append((int) bArrM191a[2]).append(".cc").toString())};
                    if (bArrM191a.length > 3) {
                        C0006g.m78a("trail", 319, 240 - C0009j.f359a[0].getHeight(), 239, 320 - C0009j.f359a[0].getHeight(), bArrM191a, 0, 3);
                    }
                } else if (C0009j.f362b == 1) {
                    C0009j.f359a = new Image[bArrM191a[2]];
                    for (int i20 = 0; i20 < bArrM191a[2]; i20++) {
                        C0009j.f359a[i20] = null;
                        C0009j.f359a[i20] = C0011l.m202b(new StringBuffer().append("/a").append((int) bArrM191a[i20 + 3]).append(".cc").toString());
                    }
                    C0006g.m78a("trail", 319 - C0009j.f359a[0].getWidth(), 214, 239 - C0009j.f359a[0].getWidth(), 294, bArrM191a, 0, bArrM191a[2] + 3);
                } else {
                    C0006g.m77a("trail", 319, 240, 239, 320, bArrM191a, 0);
                }
                f278a = -5000;
                C0009j.f405j = (byte) 12;
                m114a();
                break;
            case 16:
                if (C0011l.m189a(C0009j.f358a[2], C0009j.f358a[3])) {
                    C0009j.f404i[2] = 1;
                    C0011l.m203b();
                    C0011l.m185a(C0009j.f404i, 8);
                    C0011l.m211c();
                    m116a((byte) 14, true);
                } else {
                    m120a(4, f293a[118], (byte[]) null, f293a[100]);
                    m114a();
                }
                C0009j.f358a = null;
                break;
            case 17:
                if (C0011l.m189a(C0009j.f358a[2], C0009j.f358a[3])) {
                    switch (C0000a.f34c[C0009j.f390e[0]]) {
                        case 0:
                            C0009j.f354a = (short) (C0009j.f354a + 20);
                            break;
                        case 1:
                            C0009j.f354a = (short) (C0009j.f354a + 100);
                            break;
                        case 2:
                            C0009j.f354a = (short) (C0009j.f354a + 300);
                            break;
                    }
                    C0009j.f390e[3] = C0011l.m161a(C0009j.f354a, 0);
                    C0009j.f390e[4] = C0011l.m161a(C0009j.f354a, 1);
                    C0011l.m203b();
                    C0011l.m185a(C0009j.f390e, 3);
                    C0011l.m211c();
                    C0009j.f405j = (byte) 4;
                    m120a(-5, f293a[129], (byte[]) null, f293a[73]);
                } else {
                    m120a(-5, f293a[119], (byte[]) null, f293a[73]);
                }
                C0009j.f358a = null;
                m114a();
                break;
            case 18:
                if (C0011l.m189a(C0009j.f358a[2], C0009j.f358a[3])) {
                    C0009j.f348a |= 1 << ((C0009j.f396g * 5) + C0009j.f399h);
                    C0011l.m203b();
                    C0011l.m185a(C0011l.m190a(C0009j.f348a), 9);
                    C0011l.m211c();
                } else {
                    m120a(-5, f293a[119], (byte[]) null, f293a[73]);
                }
                C0009j.f358a = null;
                m114a();
                break;
        }
        if (HSpeed.f1a != null && i != 1) {
            HSpeed.f1a.setPriority(10);
        }
        C0011l.m214e();
        f304c--;
    }

    protected final void showNotify() {
        if (HSpeed.f2a) {
            f280a.startApp();
        }
        setFullScreenMode(true);
    }
}
