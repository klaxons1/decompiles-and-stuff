package p000;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public class C0004e extends Canvas implements InterfaceC0002c {

    /* JADX INFO: renamed from: a */
    public static final int f26a;

    /* JADX INFO: renamed from: a */
    public static final Font f27a;

    /* JADX INFO: renamed from: a */
    public static final Font[] f29a;

    /* JADX INFO: renamed from: b */
    public static final int f30b;

    /* JADX INFO: renamed from: c */
    public static int[] f32c;

    /* JADX INFO: renamed from: d */
    public static final int[] f33d;

    /* JADX INFO: renamed from: e */
    public static final int[] f34e;

    /* JADX INFO: renamed from: f */
    public static final int[] f35f;

    /* JADX INFO: renamed from: g */
    public static final int[] f36g;

    /* JADX INFO: renamed from: a */
    public static final int[] f28a = null;

    /* JADX INFO: renamed from: b */
    public static final int[] f31b = null;

    static {
        Font font = Font.getFont(0, 1, 8);
        f27a = font;
        int height = font.getHeight();
        f26a = height;
        f30b = height + 4;
        f32c = new int[]{1, 1};
        f29a = new Font[]{Font.getFont(0, 1, 8), Font.getFont(0, 0, 0)};
        f33d = new int[]{16, 3, 2, 0, 19, 3, 2, 0};
        f34e = new int[]{1, 16777215, 1, -1};
        f35f = new int[0];
        f36g = new int[]{0, -1};
        String[] strArr = {"2", "8", "4", "6", "1", "3", "7", "9"};
    }

    public C0004e() {
        setFullScreenMode(true);
    }

    /* JADX INFO: renamed from: a */
    public static int m15a(int i) {
        return m16a(i, 0);
    }

    /* JADX INFO: renamed from: a */
    public static int m16a(int i, int i2) {
        switch (i) {
            case 0:
                C0001b.m2a();
                return 0;
            case 1:
                C0001b.m5b();
                return 0;
            case 2:
                return C0001b.m4a() ? 1 : 0;
            case 3:
                C0001b.m3a(i2);
                return 0;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m17a(int i, String str) {
        switch (i) {
            case 0:
                RunnableC0010k.f216a.platformRequest(str);
                break;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m18a() {
        if (RunnableC0010k.f235e == 10) {
            try {
                Thread.sleep(20L);
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19a(int i) {
        if (RunnableC0010k.f234d) {
            Display.getDisplay(Main.f0a).vibrate(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m20b(int i) {
        switch (i) {
            case 99:
            case 120:
                i = 55;
                break;
            case 101:
            case 114:
                i = 49;
                break;
            case 105:
            case 117:
                i = 51;
                break;
            case 109:
            case 110:
                i = 57;
                break;
        }
        if (i == 53) {
            return 16;
        }
        if (i == -6) {
            return RunnableC0010k.f238f ? 128 : 64;
        }
        if (i == -7) {
            return RunnableC0010k.f238f ? 64 : 128;
        }
        if (i == 50) {
            return 1;
        }
        if (i == 56) {
            return 2;
        }
        if (i == 52) {
            return 4;
        }
        if (i == 54) {
            return 8;
        }
        if (i == 49) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        if (i == 55) {
            return 1024;
        }
        if (i == 57) {
            return 2048;
        }
        if (i == 42) {
            return 4096;
        }
        switch (getGameAction(i)) {
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
            case 4:
            case 7:
            default:
                return 8192;
            case 5:
                return 8;
            case 6:
                return 2;
            case 8:
                return 16;
        }
    }

    public void hideNotify() {
        RunnableC0010k.f222a = true;
        RunnableC0010k.f232c = true;
        m16a(1, -1);
    }

    public void paint(Graphics graphics) {
    }

    public void pointerDragged(int i, int i2) {
    }

    public void pointerPressed(int i, int i2) {
        if (i2 >= 300) {
            if (i < 80) {
                keyPressed(-6);
            } else if (i > 160) {
                keyPressed(-7);
            }
        }
    }

    public void pointerReleased(int i, int i2) {
        if (i2 >= 300) {
            if (i < 80) {
                keyReleased(-6);
            } else if (i > 160) {
                keyReleased(-7);
            }
        }
    }

    public void showNotify() {
        RunnableC0010k.f232c = false;
    }
}
