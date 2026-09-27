package p000;

import com.m3gworks.engine.C0020a;
import com.m3gworks.engine.C0023d;
import com.m3gworks.engine.GameMIDlet;
import com.m3gworks.engine.RunnableC0024e;
import com.m3gworks.engine.RunnableC0025f;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0028f extends GameCanvas {

    /* JADX INFO: renamed from: C */
    private static Image f174C;

    /* JADX INFO: renamed from: m */
    public static Image f187m;

    /* JADX INFO: renamed from: n */
    private static C0028f f188n;

    /* JADX INFO: renamed from: D */
    private float f191D;

    /* JADX INFO: renamed from: E */
    private float f192E;

    /* JADX INFO: renamed from: F */
    private float f193F;

    /* JADX INFO: renamed from: G */
    private float f194G;

    /* JADX INFO: renamed from: H */
    private float f195H;

    /* JADX INFO: renamed from: I */
    private float f196I;

    /* JADX INFO: renamed from: J */
    private int f197J;

    /* JADX INFO: renamed from: K */
    private int f198K;

    /* JADX INFO: renamed from: L */
    private float f199L;

    /* JADX INFO: renamed from: N */
    private int f200N;

    /* JADX INFO: renamed from: a */
    protected int f201a;

    /* JADX INFO: renamed from: o */
    private GameMIDlet f202o;

    /* JADX INFO: renamed from: p */
    private Graphics f203p;

    /* JADX INFO: renamed from: q */
    private int f204q;

    /* JADX INFO: renamed from: r */
    private int f205r;

    /* JADX INFO: renamed from: s */
    private boolean f206s;

    /* JADX INFO: renamed from: t */
    private boolean f207t;

    /* JADX INFO: renamed from: u */
    private boolean f208u;

    /* JADX INFO: renamed from: v */
    private boolean f209v;

    /* JADX INFO: renamed from: y */
    private int f210y;

    /* JADX INFO: renamed from: z */
    private int f211z;

    /* JADX INFO: renamed from: w */
    private static Image f189w = null;

    /* JADX INFO: renamed from: b */
    protected static Image f176b = null;

    /* JADX INFO: renamed from: x */
    private static Image f190x = null;

    /* JADX INFO: renamed from: A */
    private static final String[] f172A = C0023d.f123d;

    /* JADX INFO: renamed from: c */
    public static final String[] f177c = C0023d.f124e;

    /* JADX INFO: renamed from: d */
    public static final String[] f178d = C0023d.f125f;

    /* JADX INFO: renamed from: e */
    public static final String[] f179e = C0023d.f126g;

    /* JADX INFO: renamed from: f */
    public static final String[] f180f = C0023d.f127h;

    /* JADX INFO: renamed from: g */
    public static final String[] f181g = C0023d.f115A;

    /* JADX INFO: renamed from: h */
    public static final String[] f182h = C0023d.f116B;

    /* JADX INFO: renamed from: i */
    public static final String[] f183i = C0023d.f117C;

    /* JADX INFO: renamed from: j */
    public static final String[] f184j = C0023d.f118D;

    /* JADX INFO: renamed from: k */
    public static final String[] f185k = C0023d.f119E;

    /* JADX INFO: renamed from: B */
    private static final String[] f173B = C0023d.f128i;

    /* JADX INFO: renamed from: l */
    public static final String[] f186l = C0023d.f129j;

    /* JADX INFO: renamed from: M */
    private static Image f175M = null;

    public C0028f() {
        super(false);
        this.f202o = GameMIDlet.m95a();
        this.f203p = null;
        this.f201a = 0;
        this.f205r = 0;
        this.f206s = false;
        this.f207t = this.f206s;
        this.f208u = false;
        this.f209v = this.f208u;
        this.f210y = 0;
        this.f211z = 0;
        this.f191D = 0.025f;
        this.f192E = 0.0156f;
        this.f193F = 0.24f;
        this.f194G = 0.140625f;
        this.f195H = 0.12f;
        this.f196I = 0.075f;
        this.f197J = 1;
        this.f198K = 1;
        this.f199L = 0.04f;
        this.f200N = 0;
        setFullScreenMode(true);
        this.f203p = getGraphics();
    }

    /* JADX INFO: renamed from: a */
    public static C0028f m130a() {
        if (f188n == null) {
            f188n = new C0028f();
        }
        return f188n;
    }

    /* JADX INFO: renamed from: a */
    private void m131a(int i, int i2, int i3) {
        this.f200N = -2013265920;
        m142b();
        this.f200N = -16777216;
        m142b();
        if (i2 != -1) {
            this.f197J = i2;
        }
        if (i3 != -1) {
            this.f201a = i3;
        }
        this.f204q = i;
        this.f200N = 0;
        m142b();
    }

    /* JADX INFO: renamed from: a */
    public static void m132a(String str, int i, Graphics graphics, int i2, int i3, int i4, int i5) {
        Image imageCreateRGBImage;
        if (i5 == -1) {
            imageCreateRGBImage = f174C;
        } else {
            int[] iArr = new int[f174C.getWidth() * f174C.getHeight()];
            f174C.getRGB(iArr, 0, f174C.getWidth(), 0, 0, f174C.getWidth(), f174C.getHeight());
            for (int i6 = 0; i6 < iArr.length; i6++) {
                if (iArr[i6] == -1 || iArr[i6] == -197380) {
                    iArr[i6] = i5;
                }
            }
            imageCreateRGBImage = Image.createRGBImage(iArr, f174C.getWidth(), f174C.getHeight(), true);
        }
        int[] iArr2 = new int[4];
        String string = new StringBuffer(String.valueOf(str)).append(" ").toString();
        String strSubstring = str.toLowerCase().substring(0, i);
        int i7 = 0;
        int i8 = i4;
        int i9 = i3;
        while (true) {
            int i10 = i7;
            if (i10 >= strSubstring.length()) {
                return;
            }
            char cCharAt = strSubstring.charAt(i10);
            iArr2[0] = -1;
            iArr2[1] = -1;
            iArr2[2] = -1;
            iArr2[3] = -1;
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                iArr2[0] = ((cCharAt - 'a') * 6) + 0;
                iArr2[1] = 0;
                iArr2[2] = 6;
                iArr2[3] = 11;
            } else if (cCharAt < '0' || cCharAt > '9') {
                switch (cCharAt) {
                    case '!':
                        iArr2[0] = 225;
                        iArr2[1] = 0;
                        iArr2[2] = 3;
                        iArr2[3] = 11;
                        break;
                    case '#':
                        iArr2[0] = 264;
                        iArr2[1] = 0;
                        iArr2[2] = 7;
                        iArr2[3] = 11;
                        break;
                    case '$':
                        iArr2[0] = 257;
                        iArr2[1] = 0;
                        iArr2[2] = 7;
                        iArr2[3] = 11;
                        break;
                    case '\'':
                        iArr2[0] = 222;
                        iArr2[1] = 0;
                        iArr2[2] = 3;
                        iArr2[3] = 11;
                        break;
                    case '(':
                        iArr2[0] = 236;
                        iArr2[1] = 0;
                        iArr2[2] = 4;
                        iArr2[3] = 11;
                        break;
                    case ')':
                        iArr2[0] = 240;
                        iArr2[1] = 0;
                        iArr2[2] = 4;
                        iArr2[3] = 11;
                        break;
                    case '*':
                        iArr2[0] = 286;
                        iArr2[1] = 0;
                        iArr2[2] = 7;
                        iArr2[3] = 11;
                        break;
                    case ',':
                        iArr2[0] = 219;
                        iArr2[1] = 0;
                        iArr2[2] = 3;
                        iArr2[3] = 11;
                        break;
                    case '-':
                        iArr2[0] = 244;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case '.':
                        iArr2[0] = 216;
                        iArr2[1] = 0;
                        iArr2[2] = 3;
                        iArr2[3] = 11;
                        break;
                    case '/':
                        iArr2[0] = 293;
                        iArr2[1] = 0;
                        iArr2[2] = 5;
                        iArr2[3] = 11;
                        break;
                    case ':':
                        iArr2[0] = 232;
                        iArr2[1] = 0;
                        iArr2[2] = 4;
                        iArr2[3] = 11;
                        break;
                    case ';':
                        iArr2[0] = 228;
                        iArr2[1] = 0;
                        iArr2[2] = 4;
                        iArr2[3] = 11;
                        break;
                    case '<':
                        iArr2[0] = 369;
                        iArr2[1] = 0;
                        iArr2[2] = 5;
                        iArr2[3] = 11;
                        break;
                    case '>':
                        iArr2[0] = 374;
                        iArr2[1] = 0;
                        iArr2[2] = 5;
                        iArr2[3] = 11;
                        break;
                    case '?':
                        iArr2[0] = 250;
                        iArr2[1] = 0;
                        iArr2[2] = 7;
                        iArr2[3] = 11;
                        break;
                    case '@':
                        iArr2[0] = 271;
                        iArr2[1] = 0;
                        iArr2[2] = 7;
                        iArr2[3] = 11;
                        break;
                    case '^':
                        iArr2[0] = 278;
                        iArr2[1] = 0;
                        iArr2[2] = 8;
                        iArr2[3] = 11;
                        break;
                    case 161:
                        iArr2[0] = 114;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 223:
                        iArr2[0] = 316;
                        iArr2[1] = 0;
                        iArr2[2] = 5;
                        iArr2[3] = 11;
                        break;
                    case 224:
                        iArr2[0] = 78;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 225:
                        iArr2[0] = 0;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 226:
                        iArr2[0] = 66;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 227:
                        iArr2[0] = 72;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 228:
                        iArr2[0] = 304;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 231:
                        iArr2[0] = 84;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 233:
                        iArr2[0] = 60;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 234:
                        iArr2[0] = 90;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 237:
                        iArr2[0] = 54;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 243:
                        iArr2[0] = 327;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 244:
                        iArr2[0] = 96;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 245:
                        iArr2[0] = 102;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 246:
                        iArr2[0] = 310;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 250:
                        iArr2[0] = 108;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 252:
                        iArr2[0] = 298;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 253:
                        iArr2[0] = 42;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 261:
                        iArr2[0] = 120;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 263:
                        iArr2[0] = 351;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 269:
                        iArr2[0] = 6;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 281:
                        iArr2[0] = 339;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 283:
                        iArr2[0] = 12;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 322:
                        iArr2[0] = 321;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 324:
                        iArr2[0] = 363;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 328:
                        iArr2[0] = 18;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 345:
                        iArr2[0] = 24;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 347:
                        iArr2[0] = 333;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 353:
                        iArr2[0] = 30;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 367:
                        iArr2[0] = 36;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 378:
                        iArr2[0] = 345;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 380:
                        iArr2[0] = 357;
                        iArr2[1] = 0;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 382:
                        iArr2[0] = 48;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1072:
                        iArr2[0] = 126;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1073:
                        iArr2[0] = 132;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1074:
                        iArr2[0] = 138;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1075:
                        iArr2[0] = 144;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1076:
                        iArr2[0] = 150;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1077:
                        iArr2[0] = 156;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1078:
                        iArr2[0] = 168;
                        iArr2[1] = 11;
                        iArr2[2] = 8;
                        iArr2[3] = 11;
                        break;
                    case 1079:
                        iArr2[0] = 176;
                        iArr2[1] = 11;
                        iArr2[2] = 5;
                        iArr2[3] = 11;
                        break;
                    case 1080:
                        iArr2[0] = 181;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1081:
                        iArr2[0] = 187;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1082:
                        iArr2[0] = 193;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1083:
                        iArr2[0] = 199;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1084:
                        iArr2[0] = 205;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1085:
                        iArr2[0] = 211;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1086:
                        iArr2[0] = 217;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1087:
                        iArr2[0] = 223;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1088:
                        iArr2[0] = 229;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1089:
                        iArr2[0] = 235;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1090:
                        iArr2[0] = 241;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1091:
                        iArr2[0] = 247;
                        iArr2[1] = 11;
                        iArr2[2] = 5;
                        iArr2[3] = 11;
                        break;
                    case 1092:
                        iArr2[0] = 252;
                        iArr2[1] = 11;
                        iArr2[2] = 8;
                        iArr2[3] = 11;
                        break;
                    case 1093:
                        iArr2[0] = 260;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1094:
                        iArr2[0] = 266;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1095:
                        iArr2[0] = 272;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1096:
                        iArr2[0] = 278;
                        iArr2[1] = 11;
                        iArr2[2] = 8;
                        iArr2[3] = 11;
                        break;
                    case 1097:
                        iArr2[0] = 286;
                        iArr2[1] = 11;
                        iArr2[2] = 9;
                        iArr2[3] = 11;
                        break;
                    case 1098:
                        iArr2[0] = 295;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1099:
                        iArr2[0] = 301;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1100:
                        iArr2[0] = 307;
                        iArr2[1] = 11;
                        iArr2[2] = 5;
                        iArr2[3] = 11;
                        break;
                    case 1101:
                        iArr2[0] = 312;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1102:
                        iArr2[0] = 318;
                        iArr2[1] = 11;
                        iArr2[2] = 7;
                        iArr2[3] = 11;
                        break;
                    case 1103:
                        iArr2[0] = 325;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                    case 1105:
                        iArr2[0] = 162;
                        iArr2[1] = 11;
                        iArr2[2] = 6;
                        iArr2[3] = 11;
                        break;
                }
            } else {
                iArr2[0] = ((cCharAt - '0') * 6) + 156;
                iArr2[1] = 0;
                iArr2[2] = 6;
                iArr2[3] = 11;
            }
            if (iArr2[0] != -1) {
                graphics.drawRegion(imageCreateRGBImage, iArr2[0], iArr2[1], iArr2[2], iArr2[3], 0, i9, i8, 20);
                i9 += iArr2[2];
            } else {
                int iIndexOf = string.indexOf(" ", i10 + 1);
                if (iIndexOf == -1) {
                    i9 += 6;
                } else if (((iIndexOf - (i10 + 1)) * 6) + i9 > i2) {
                    i8 = i8 + 6 + 3;
                    i9 = i3;
                } else {
                    i9 += 6;
                }
            }
            i7 = i10 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m133a(String str, String[] strArr, int i) {
        int height = (int) (getHeight() * ((1.0f - this.f193F) - this.f194G));
        int height2 = ((height - (f176b.getHeight() << 1)) - ((int) (this.f192E * getHeight()))) / (((int) (this.f192E * getHeight())) + 11);
        int length = strArr.length;
        if (length > height2) {
            length = height2;
        }
        int height3 = ((length + 1) * ((int) (this.f192E * getHeight()))) + (length * 11) + (f176b.getHeight() << 1);
        int height4 = ((int) (getHeight() * this.f193F)) + ((height - height3) / 2);
        int[] iArr = new int[getWidth()];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = -15529214;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= height3 - 2) {
                break;
            }
            this.f203p.drawRGB(iArr, 0, getWidth(), 0, i4 + height4, getWidth(), 1, true);
            i3 = i4 + 1;
        }
        String lowerCase = str.toLowerCase();
        int length2 = str.length();
        Graphics graphics = this.f203p;
        int width = getWidth();
        getHeight();
        m132a(lowerCase, length2, graphics, width, (getWidth() - (str.length() * 6)) / 2, (height4 - 11) - ((int) (getHeight() * this.f192E)), -6253705);
        this.f203p.drawImage(f176b, 0, height4 - f176b.getHeight(), 20);
        int i5 = 0;
        this.f198K = strArr.length / height2;
        if (strArr.length % height2 > 0) {
            this.f198K++;
        }
        int i6 = (this.f197J - 1) * height2;
        int i7 = i6 + height2;
        int i8 = i6;
        while (i8 < i7) {
            int height5 = ((int) (getHeight() * this.f192E)) + height4 + ((i8 % height2) * (((int) (getHeight() * this.f192E)) + 11));
            if (i8 >= strArr.length) {
                if (this.f197J == 1) {
                    break;
                }
            } else {
                int width2 = (getWidth() - (strArr[i8].length() * 6)) / 2;
                int i9 = i8 == i ? -1 : -6253705;
                String lowerCase2 = strArr[i8].toLowerCase();
                int length3 = strArr[i8].length();
                Graphics graphics2 = this.f203p;
                int width3 = getWidth();
                getHeight();
                m132a(lowerCase2, length3, graphics2, width3, width2, height5, i9);
            }
            i5 = height5;
            i8++;
        }
        int height6 = i5 + 11 + ((int) (getHeight() * this.f192E));
        this.f203p.drawImage(f176b, 0, height6, 20);
        if (this.f198K > 1) {
            int width4 = (getWidth() - ((this.f198K * 6) + ((this.f198K - 1) * ((int) (this.f199L * getWidth()))))) / 2;
            int height7 = (((height6 + f176b.getHeight()) + ((int) (getHeight() * (1.0f - this.f196I)))) - 11) / 2;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= this.f198K) {
                    break;
                }
                int i12 = -6253705;
                if (i11 == this.f197J - 1) {
                    i12 = -1;
                }
                String string = new StringBuffer(String.valueOf(i11 + 1)).toString();
                int length4 = new StringBuffer(String.valueOf(i11 + 1)).toString().length();
                Graphics graphics3 = this.f203p;
                int width5 = getWidth();
                getHeight();
                m132a(string, length4, graphics3, width5, ((((int) (this.f199L * getWidth())) + 6) * i11) + width4, height7, i12);
                i10 = i11 + 1;
            }
            if (this.f197J == 1) {
                this.f203p.setColor(-6253705);
            } else {
                this.f203p.setColor(-1);
            }
            int width6 = (width4 - ((int) (this.f199L * getWidth()))) - 2;
            int i13 = height7 + 5;
            this.f203p.drawLine(width6, i13, width6, i13);
            this.f203p.drawLine(width6 + 1, i13 - 1, width6 + 1, i13 + 1);
            if (C0020a.m97a().m100b() == 2) {
                this.f203p.drawLine(width6 + 2, i13 - 2, width6 + 2, i13 + 2);
            }
            if (this.f197J == this.f198K) {
                this.f203p.setColor(-6253705);
            } else {
                this.f203p.setColor(-1);
            }
            int width7 = ((getWidth() - width4) + ((int) (this.f199L * getWidth()))) - 3;
            int i14 = height7 + 5;
            if (C0020a.m97a().m100b() == 2) {
                this.f203p.drawLine(width7, i14 - 2, width7, i14 + 2);
            }
            this.f203p.drawLine(width7 + 1, i14 - 1, width7 + 1, i14 + 1);
            this.f203p.drawLine(width7 + 2, i14, width7 + 2, i14);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m134d() {
        int i;
        try {
            f189w = Image.createImage("/res/image2d/title.png");
            f176b = Image.createImage("/res/image2d/bg_line_1.png");
            f190x = Image.createImage("/res/image2d/bg_line_2.png");
            f174C = Image.createImage("/res/image2d/text.png");
            f187m = Image.createImage("/res/image2d/btn.png");
            f175M = Image.createImage("/res/image2d/forbidden.png");
            try {
                RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("m3gworksSnpEl", true);
                int numRecords = recordStoreOpenRecordStore.getNumRecords();
                if (numRecords == 0) {
                    byte[] bytes = "notreged".getBytes();
                    recordStoreOpenRecordStore.addRecord(bytes, 0, bytes.length);
                    byte[] bytes2 = "0".getBytes();
                    recordStoreOpenRecordStore.addRecord(bytes2, 0, bytes2.length);
                    i = 0;
                } else if (numRecords == 1) {
                    byte[] bytes3 = "0".getBytes();
                    recordStoreOpenRecordStore.addRecord(bytes3, 0, bytes3.length);
                    i = 0;
                } else {
                    byte[] record = recordStoreOpenRecordStore.getRecord(2);
                    i = record == null ? 0 : Integer.parseInt(new String(record));
                }
                try {
                    recordStoreOpenRecordStore.closeRecordStore();
                } catch (RecordStoreFullException e) {
                    e = e;
                    e.printStackTrace();
                } catch (RecordStoreException e2) {
                    e = e2;
                    e.printStackTrace();
                } catch (RecordStoreNotFoundException e3) {
                    e = e3;
                    e.printStackTrace();
                }
            } catch (RecordStoreFullException e4) {
                e = e4;
                i = 0;
            } catch (RecordStoreException e5) {
                e = e5;
                i = 0;
            } catch (RecordStoreNotFoundException e6) {
                e = e6;
                i = 0;
            }
            Vector vectorM238d = C0045w.m228a().m238d();
            for (int i2 = 0; i2 < i + 1; i2++) {
                ((C0004ad) vectorM238d.elementAt(i2)).f21j = true;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m135g() {
        this.f203p.setColor(1115910);
        this.f203p.fillRect(0, 0, getWidth(), getHeight());
        if (this.f204q != 902) {
            this.f203p.setColor(2036483);
            this.f203p.fillRect(0, (int) (getHeight() * this.f195H), getWidth(), ((int) (getHeight() * ((1.0f - this.f195H) - this.f196I))) + 1);
        }
        this.f203p.drawImage(f189w, 0, (int) (getHeight() * this.f191D), 20);
        this.f203p.drawImage(f190x, 0, (int) (getHeight() * (1.0f - this.f196I)), 20);
    }

    /* JADX INFO: renamed from: h */
    private void m136h() {
        int[] iArr = new int[getWidth()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = this.f200N;
        }
        for (int i2 = 0; i2 < getHeight(); i2++) {
            this.f203p.drawRGB(iArr, 0, getWidth(), 0, i2, getWidth(), 1, true);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m137i() {
        m135g();
        String str = f178d[0];
        String str2 = this.f207t ? f179e[0] : f179e[1];
        String str3 = f178d[1];
        String str4 = this.f209v ? f179e[0] : f179e[1];
        String string = "";
        for (int i = 0; i < (18 - str.length()) - str2.length(); i++) {
            string = new StringBuffer(String.valueOf(string)).append(" ").toString();
        }
        String string2 = "";
        for (int i2 = 0; i2 < (18 - str3.length()) - str4.length(); i2++) {
            string2 = new StringBuffer(String.valueOf(string2)).append(" ").toString();
        }
        m133a(f177c[1], new String[]{new StringBuffer(String.valueOf(str)).append(string).append("<").append(str2).append(">").toString(), new StringBuffer(String.valueOf(str3)).append(string2).append("<").append(str4).append(">").toString()}, this.f205r);
        this.f203p.drawRegion(f187m, 0, 0, (f186l[0].length() * 6) + 7, f187m.getHeight(), 0, 0, getHeight() - f187m.getHeight(), 20);
        this.f203p.drawRegion(f187m, 0, 0, (f186l[3].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[3].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
        String str5 = f186l[0];
        int length = f186l[0].length();
        Graphics graphics = this.f203p;
        int width = getWidth();
        getHeight();
        m132a(str5, length, graphics, width, 4, getHeight() - f187m.getHeight(), -1);
        String str6 = f186l[3];
        int length2 = f186l[3].length();
        Graphics graphics2 = this.f203p;
        int width2 = getWidth();
        getHeight();
        m132a(str6, length2, graphics2, width2, (getWidth() - (f186l[3].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
        m136h();
        flushGraphics();
        if (this.f202o.m96b().getCurrent() != this) {
            this.f202o.m96b().setCurrent(this);
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m138j() {
        f189w = null;
        f176b = null;
        f190x = null;
        f174C = null;
        f187m = null;
        f175M = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m139a(int i) {
        this.f204q = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m140a(String str) {
        this.f203p.setColor(0, 0, 0);
        this.f203p.fillRect(0, 0, getWidth(), getHeight());
        this.f203p.setColor(255, 255, 255);
        int length = str.length();
        Graphics graphics = this.f203p;
        int width = getWidth();
        getHeight();
        m132a(str, length, graphics, width, 0, 10, -1);
        flushGraphics();
        if (this.f202o.m96b().getCurrent() != this) {
            this.f202o.m96b().setCurrent(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m141a(boolean z) {
        this.f206s = z;
        this.f207t = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m142b() {
        int i;
        int i2;
        Image imageCreateImage;
        switch (this.f204q) {
            case 0:
                m135g();
                m133a(f177c[0], f172A, this.f210y);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[0].length() * 6) + 7, f187m.getHeight(), 0, 0, getHeight() - f187m.getHeight(), 20);
                String str = f186l[0];
                int length = f186l[0].length();
                Graphics graphics = this.f203p;
                int width = getWidth();
                getHeight();
                m132a(str, length, graphics, width, 4, getHeight() - f187m.getHeight(), -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[1].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[1].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                String str2 = f186l[1];
                int length2 = f186l[1].length();
                Graphics graphics2 = this.f203p;
                int width2 = getWidth();
                getHeight();
                m132a(str2, length2, graphics2, width2, (getWidth() - (f186l[1].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 1:
                m135g();
                int height = (int) (getHeight() * ((1.0f - this.f193F) - this.f194G));
                int height2 = ((height - (f176b.getHeight() << 1)) - ((int) (this.f192E * getHeight()))) / (((int) (this.f192E * getHeight())) + 11);
                int height3 = (height2 * 11) + ((height2 + 1) * ((int) (this.f192E * getHeight()))) + (f176b.getHeight() << 1);
                int height4 = ((int) (getHeight() * this.f193F)) + ((height - height3) / 2);
                int[] iArr = new int[getWidth()];
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    iArr[i3] = -15529214;
                }
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= height3 - 2) {
                        String lowerCase = f177c[5].toLowerCase();
                        int length3 = f177c[5].length();
                        Graphics graphics3 = this.f203p;
                        int width3 = getWidth();
                        getHeight();
                        m132a(lowerCase, length3, graphics3, width3, (getWidth() - (f177c[5].length() * 6)) / 2, (height4 - 11) - ((int) (getHeight() * this.f192E)), -6253705);
                        this.f203p.drawImage(f176b, 0, height4 - f176b.getHeight(), 20);
                        Vector vectorM238d = C0045w.m228a().m238d();
                        C0004ad c0004ad = (C0004ad) vectorM238d.elementAt(this.f201a);
                        try {
                            imageCreateImage = Image.createImage(c0004ad.f15d);
                        } catch (IOException e) {
                            e.printStackTrace();
                            imageCreateImage = null;
                        }
                        int height5 = (int) (getHeight() * (this.f193F + 0.118f));
                        this.f203p.drawImage(imageCreateImage, getWidth() / 2, height5, 17);
                        if (!c0004ad.f21j) {
                            this.f203p.drawImage(f175M, getWidth() / 2, (imageCreateImage.getHeight() / 2) + height5, 3);
                        }
                        this.f203p.setColor(-12706048);
                        this.f203p.drawRect((getWidth() - imageCreateImage.getWidth()) / 2, height5, imageCreateImage.getWidth(), imageCreateImage.getHeight());
                        this.f203p.setColor(-13428224);
                        this.f203p.drawRect(((getWidth() - imageCreateImage.getWidth()) / 2) - 1, height5 - 1, imageCreateImage.getWidth() + 2, imageCreateImage.getHeight() + 2);
                        this.f203p.setColor(-14216192);
                        this.f203p.drawRect(((getWidth() - imageCreateImage.getWidth()) / 2) - 2, height5 - 2, imageCreateImage.getWidth() + 4, imageCreateImage.getHeight() + 4);
                        this.f203p.setColor(-14938624);
                        this.f203p.drawRect(((getWidth() - imageCreateImage.getWidth()) / 2) - 3, height5 - 3, imageCreateImage.getWidth() + 6, imageCreateImage.getHeight() + 6);
                        int height6 = ((int) (((1.0f - this.f194G) - 0.118f) * getHeight())) - 11;
                        String str3 = c0004ad.f12a;
                        int length4 = c0004ad.f12a.length();
                        Graphics graphics4 = this.f203p;
                        int width4 = getWidth();
                        getHeight();
                        m132a(str3, length4, graphics4, width4, (getWidth() - (c0004ad.f12a.length() * 6)) / 2, height6, -6253705);
                        int i6 = 30;
                        if (C0020a.m97a().m100b() == 2) {
                            i6 = 30;
                        } else if (C0020a.m97a().m100b() == 1) {
                            i6 = 20;
                        } else if (C0020a.m97a().m100b() == 0) {
                            i6 = 10;
                        }
                        if (this.f197J == 1) {
                            this.f203p.setColor(-6253705);
                        } else {
                            this.f203p.setColor(-1);
                        }
                        int height7 = (imageCreateImage.getHeight() / 2) + height5;
                        this.f203p.drawLine(i6, height7, i6, height7);
                        this.f203p.drawLine(i6 + 1, height7 - 1, i6 + 1, height7 + 1);
                        this.f203p.drawLine(i6 + 2, height7 - 2, i6 + 2, height7 + 2);
                        if (C0020a.m97a().m100b() == 2) {
                            this.f203p.drawLine(i6 + 3, height7 - 3, i6 + 3, height7 + 3);
                        }
                        if (this.f197J == this.f198K) {
                            this.f203p.setColor(-6253705);
                        } else {
                            this.f203p.setColor(-1);
                        }
                        int width5 = getWidth() - i6;
                        int height8 = (imageCreateImage.getHeight() / 2) + height5;
                        this.f203p.drawLine(width5, height8, width5, height8);
                        this.f203p.drawLine(width5 - 1, height8 - 1, width5 - 1, height8 + 1);
                        this.f203p.drawLine(width5 - 2, height8 - 2, width5 - 2, height8 + 2);
                        if (C0020a.m97a().m100b() == 2) {
                            this.f203p.drawLine(width5 - 3, height8 - 3, width5 - 3, height8 + 3);
                        }
                        int height9 = 0;
                        for (int i7 = 0; i7 < height2; i7++) {
                            height9 = ((int) (getHeight() * this.f192E)) + height4 + ((i7 % height2) * (((int) (getHeight() * this.f192E)) + 11));
                        }
                        int height10 = height9 + 11 + ((int) (getHeight() * this.f192E));
                        this.f203p.drawImage(f176b, 0, height10, 20);
                        this.f198K = vectorM238d.size();
                        if (this.f198K > 1) {
                            int width6 = (getWidth() - ((this.f198K * 6) + ((this.f198K - 1) * ((int) (this.f199L * getWidth()))))) / 2;
                            int height11 = (((height10 + f176b.getHeight()) + ((int) (getHeight() * (1.0f - this.f196I)))) - 11) / 2;
                            int i8 = 0;
                            while (true) {
                                int i9 = i8;
                                if (i9 >= this.f198K) {
                                    if (this.f197J == 1) {
                                        this.f203p.setColor(-6253705);
                                    } else {
                                        this.f203p.setColor(-1);
                                    }
                                    int width7 = (width6 - ((int) (this.f199L * getWidth()))) - 2;
                                    int i10 = height11 + 5;
                                    this.f203p.drawLine(width7, i10, width7, i10);
                                    this.f203p.drawLine(width7 + 1, i10 - 1, width7 + 1, i10 + 1);
                                    if (C0020a.m97a().m100b() == 2) {
                                        this.f203p.drawLine(width7 + 2, i10 - 2, width7 + 2, i10 + 2);
                                    }
                                    if (this.f197J == this.f198K) {
                                        this.f203p.setColor(-6253705);
                                    } else {
                                        this.f203p.setColor(-1);
                                    }
                                    int width8 = ((getWidth() - width6) + ((int) (this.f199L * getWidth()))) - 3;
                                    int i11 = height11 + 5;
                                    if (C0020a.m97a().m100b() == 2) {
                                        this.f203p.drawLine(width8, i11 - 2, width8, i11 + 2);
                                    }
                                    this.f203p.drawLine(width8 + 1, i11 - 1, width8 + 1, i11 + 1);
                                    this.f203p.drawLine(width8 + 2, i11, width8 + 2, i11);
                                } else {
                                    int i12 = -6253705;
                                    if (i9 == this.f197J - 1) {
                                        i12 = -1;
                                    }
                                    String string = new StringBuffer(String.valueOf(i9 + 1)).toString();
                                    int length5 = new StringBuffer(String.valueOf(i9 + 1)).toString().length();
                                    Graphics graphics5 = this.f203p;
                                    int width9 = getWidth();
                                    getHeight();
                                    m132a(string, length5, graphics5, width9, ((((int) (this.f199L * getWidth())) + 6) * i9) + width6, height11, i12);
                                    i8 = i9 + 1;
                                }
                            }
                        }
                        if (c0004ad.f21j) {
                            this.f203p.drawRegion(f187m, 0, 0, (f186l[0].length() * 6) + 7, f187m.getHeight(), 0, 0, getHeight() - f187m.getHeight(), 20);
                            String str4 = f186l[0];
                            int length6 = f186l[0].length();
                            Graphics graphics6 = this.f203p;
                            int width10 = getWidth();
                            getHeight();
                            m132a(str4, length6, graphics6, width10, 4, getHeight() - f187m.getHeight(), -1);
                        }
                        this.f203p.drawRegion(f187m, 0, 0, (f186l[2].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[2].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                        String str5 = f186l[2];
                        int length7 = f186l[2].length();
                        Graphics graphics7 = this.f203p;
                        int width11 = getWidth();
                        getHeight();
                        m132a(str5, length7, graphics7, width11, (getWidth() - (f186l[2].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                        m136h();
                        flushGraphics();
                        if (this.f202o.m96b().getCurrent() != this) {
                            this.f202o.m96b().setCurrent(this);
                        }
                    } else {
                        this.f203p.drawRGB(iArr, 0, getWidth(), 0, i5 + height4, getWidth(), 1, true);
                        i4 = i5 + 1;
                    }
                    break;
                }
                break;
            case 2:
                m137i();
                break;
            case 3:
                m135g();
                m133a(f177c[2], f180f, this.f211z);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[0].length() * 6) + 7, f187m.getHeight(), 0, 0, getHeight() - f187m.getHeight(), 20);
                String str6 = f186l[0];
                int length8 = f186l[0].length();
                Graphics graphics8 = this.f203p;
                int width12 = getWidth();
                getHeight();
                m132a(str6, length8, graphics8, width12, 4, getHeight() - f187m.getHeight(), -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[2].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[2].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                String str7 = f186l[2];
                int length9 = f186l[2].length();
                Graphics graphics9 = this.f203p;
                int width13 = getWidth();
                getHeight();
                m132a(str7, length9, graphics9, width13, (getWidth() - (f186l[2].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 4:
                m135g();
                m133a(f177c[3], f173B, -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[2].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[2].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                String str8 = f186l[2];
                int length10 = f186l[2].length();
                Graphics graphics10 = this.f203p;
                int width14 = getWidth();
                getHeight();
                m132a(str8, length10, graphics10, width14, (getWidth() - (f186l[2].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 9:
                m135g();
                if (C0020a.m97a().m100b() == 2) {
                    i = 5;
                    i2 = 20;
                } else if (C0020a.m97a().m100b() == 1) {
                    i = 4;
                    i2 = 15;
                } else if (C0020a.m97a().m100b() == 0) {
                    i = 3;
                    i2 = 10;
                } else {
                    i = 5;
                    i2 = 20;
                }
                int height12 = (getHeight() - ((int) (getHeight() * this.f196I))) - i2;
                int width15 = getWidth() - (i2 << 1);
                String str9 = f177c[4];
                int length11 = f177c[4].length();
                Graphics graphics11 = this.f203p;
                int width16 = getWidth();
                getHeight();
                m132a(str9, length11, graphics11, width16, (getWidth() - (f177c[4].length() * 6)) / 2, height12 - i2, -6253705);
                this.f203p.setColor(14601092);
                this.f203p.fillRect(i2, height12, (int) (width15 * (RunnableC0024e.m112a().m116e() / 100.0f)), i);
                this.f203p.setColor(5918518);
                this.f203p.drawRect(i2, height12, width15, i);
                flushGraphics();
                break;
            case 11:
                m135g();
                m133a(f177c[6], ((C0004ad) C0045w.m228a().m238d().elementAt(this.f201a)).f14c, -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[4].length() * 6) + 7, f187m.getHeight(), 0, 0, getHeight() - f187m.getHeight(), 20);
                String str10 = f186l[4];
                int length12 = f186l[4].length();
                Graphics graphics12 = this.f203p;
                int width17 = getWidth();
                getHeight();
                m132a(str10, length12, graphics12, width17, 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                break;
            case 30:
                m135g();
                m133a(f180f[0], f181g, -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[2].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[2].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                String str11 = f186l[2];
                int length13 = f186l[2].length();
                Graphics graphics13 = this.f203p;
                int width18 = getWidth();
                getHeight();
                m132a(str11, length13, graphics13, width18, (getWidth() - (f186l[2].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 31:
                m135g();
                m133a(f180f[1], f182h, -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[2].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[2].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                String str12 = f186l[2];
                int length14 = f186l[2].length();
                Graphics graphics14 = this.f203p;
                int width19 = getWidth();
                getHeight();
                m132a(str12, length14, graphics14, width19, (getWidth() - (f186l[2].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 32:
                m135g();
                m133a(f180f[2], f183i, -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[2].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[2].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                String str13 = f186l[2];
                int length15 = f186l[2].length();
                Graphics graphics15 = this.f203p;
                int width20 = getWidth();
                getHeight();
                m132a(str13, length15, graphics15, width20, (getWidth() - (f186l[2].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 33:
                m135g();
                m133a(f180f[3], f184j, -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[2].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[2].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                String str14 = f186l[2];
                int length16 = f186l[2].length();
                Graphics graphics16 = this.f203p;
                int width21 = getWidth();
                getHeight();
                m132a(str14, length16, graphics16, width21, (getWidth() - (f186l[2].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 34:
                m135g();
                m133a(f180f[4], f185k, -1);
                this.f203p.drawRegion(f187m, 0, 0, (f186l[2].length() * 6) + 7, f187m.getHeight(), 0, (getWidth() - (f186l[2].length() * 6)) - 8, getHeight() - f187m.getHeight(), 20);
                String str15 = f186l[2];
                int length17 = f186l[2].length();
                Graphics graphics17 = this.f203p;
                int width22 = getWidth();
                getHeight();
                m132a(str15, length17, graphics17, width22, (getWidth() - (f186l[2].length() * 6)) - 4, getHeight() - f187m.getHeight(), -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 901:
                this.f203p.setColor(0, 0, 0);
                this.f203p.fillRect(0, 0, getWidth(), getHeight());
                Image imageCreateImage2 = null;
                try {
                    imageCreateImage2 = Image.createImage("/res/image2d/brand.png");
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                this.f203p.drawImage(imageCreateImage2, getWidth() / 2, getHeight() / 3, 3);
                int[] iArr2 = new int[getWidth()];
                for (int i13 = 0; i13 < iArr2.length; i13++) {
                    iArr2[i13] = 0;
                }
                for (int i14 = 0; i14 < getHeight(); i14++) {
                    this.f203p.drawRGB(iArr2, 0, getWidth(), 0, i14, getWidth(), 1, true);
                }
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
            case 902:
                this.f203p.setColor(0, 0, 0);
                this.f203p.fillRect(0, 0, getWidth(), getHeight());
                Image imageCreateImage3 = null;
                try {
                    imageCreateImage3 = Image.createImage("/res/image2d/logo.png");
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                m135g();
                this.f203p.drawImage(imageCreateImage3, getWidth() / 2, ((int) (getHeight() * this.f191D)) + f189w.getHeight() + ((((int) (getHeight() * ((1.0f - this.f196I) - this.f191D))) - f189w.getHeight()) / 2), 3);
                int length18 = "^ 2008 m3gworks".length();
                Graphics graphics18 = this.f203p;
                int width23 = getWidth();
                getHeight();
                m132a("^ 2008 m3gworks", length18, graphics18, width23, (getWidth() - ("^ 2008 m3gworks".length() * 6)) / 2, (getHeight() - ((((int) (getHeight() * this.f196I)) - 11) / 2)) - 11, -1);
                m136h();
                flushGraphics();
                if (this.f202o.m96b().getCurrent() != this) {
                    this.f202o.m96b().setCurrent(this);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m143b(int i) {
        C0045w.m228a().m233a(i);
        this.f204q = 9;
        m142b();
        RunnableC0024e.m112a();
        RunnableC0024e.m113b();
    }

    /* JADX INFO: renamed from: b */
    public final void m144b(boolean z) {
        this.f208u = z;
        this.f209v = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m145c() {
        int width = getWidth();
        if (width < 130) {
            C0020a.m97a().m99a(0);
        } else if (width < 220) {
            C0020a.m97a().m99a(1);
        } else {
            C0020a.m97a().m99a(2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m146e() {
        return this.f206s;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m147f() {
        return this.f208u;
    }

    protected final void keyPressed(int i) {
        switch (this.f204q) {
            case 0:
                if (i != 50 && getGameAction(i) != 1) {
                    if (i != 56 && getGameAction(i) != 6) {
                        if (getGameAction(i) != 8 && i != -6 && i != -21) {
                            if (i == -7 || i == -22) {
                                try {
                                    RunnableC0024e.m112a();
                                    RunnableC0024e.m115d();
                                    m138j();
                                    GameMIDlet.m95a().destroyApp(false);
                                } catch (MIDletStateChangeException e) {
                                    e.printStackTrace();
                                }
                                GameMIDlet.m95a().notifyDestroyed();
                            }
                            break;
                        } else {
                            switch (this.f210y) {
                                case 0:
                                    this.f201a = 0;
                                    this.f197J = 1;
                                    this.f198K = 1;
                                    m131a(1, -1, -1);
                                    break;
                                case 1:
                                    m131a(2, -1, -1);
                                    break;
                                case 2:
                                    this.f211z = 0;
                                    this.f197J = 1;
                                    this.f198K = 1;
                                    m131a(3, -1, -1);
                                    break;
                                case 3:
                                    this.f197J = 1;
                                    this.f198K = 1;
                                    m131a(4, -1, -1);
                                    break;
                                case 4:
                                    try {
                                        RunnableC0024e.m112a();
                                        RunnableC0024e.m115d();
                                        m138j();
                                        GameMIDlet.m95a().destroyApp(false);
                                    } catch (MIDletStateChangeException e2) {
                                        e2.printStackTrace();
                                    }
                                    GameMIDlet.m95a().notifyDestroyed();
                                    break;
                            }
                        }
                    } else {
                        if (this.f210y == f172A.length - 1) {
                            this.f210y = 0;
                        } else {
                            this.f210y++;
                        }
                        m142b();
                        break;
                    }
                } else {
                    if (this.f210y == 0) {
                        this.f210y = f172A.length - 1;
                    } else {
                        this.f210y--;
                    }
                    m142b();
                    break;
                }
                break;
            case 1:
                C0045w.m228a();
                if (i != 56 && getGameAction(i) != 1 && i != 50 && getGameAction(i) != 6) {
                    if (i == 52 || getGameAction(i) == 2) {
                        if (this.f197J > 1) {
                            m131a(this.f204q, this.f197J - 1, this.f201a - 1);
                        }
                    } else if (i == 54 || getGameAction(i) == 5) {
                        if (this.f197J < this.f198K) {
                            m131a(this.f204q, this.f197J + 1, this.f201a + 1);
                        }
                    } else if (getGameAction(i) == 8 || i == -6 || i == -21) {
                        if (((C0004ad) C0045w.m228a().m238d().elementAt(this.f201a)).f21j) {
                            this.f197J = 1;
                            this.f198K = 1;
                            m143b(this.f201a);
                        }
                    } else if (i == -7 || i == -22) {
                        this.f210y = 0;
                        m131a(0, 1, -1);
                    }
                    break;
                }
                break;
            case 2:
                if (i == 50 || getGameAction(i) == 1) {
                    if (this.f205r == 0) {
                        this.f205r = f178d.length - 1;
                    } else {
                        this.f205r--;
                    }
                    m142b();
                } else if (i == 56 || getGameAction(i) == 6) {
                    if (this.f205r == f178d.length - 1) {
                        this.f205r = 0;
                    } else {
                        this.f205r++;
                    }
                    m142b();
                } else if (i == 52 || getGameAction(i) == 2) {
                    switch (this.f205r) {
                        case 0:
                            this.f207t = this.f207t ? false : true;
                            break;
                        case 1:
                            this.f209v = this.f209v ? false : true;
                            break;
                    }
                    m142b();
                } else if (i == 54 || getGameAction(i) == 5) {
                    switch (this.f205r) {
                        case 0:
                            this.f207t = this.f207t ? false : true;
                            break;
                        case 1:
                            this.f209v = this.f209v ? false : true;
                            break;
                    }
                    m142b();
                } else if (getGameAction(i) == 8) {
                    switch (this.f205r) {
                        case 0:
                            this.f207t = this.f207t ? false : true;
                            break;
                        case 1:
                            this.f209v = this.f209v ? false : true;
                            break;
                    }
                    m142b();
                } else if (i == -6 || i == -21) {
                    this.f206s = this.f207t;
                    this.f208u = this.f209v;
                    this.f210y = 0;
                    m131a(0, 1, -1);
                } else if (i == -7 || i == -22) {
                    this.f207t = this.f206s;
                    this.f209v = this.f208u;
                    this.f210y = 0;
                    m131a(0, 1, -1);
                }
                break;
            case 3:
                if (i != 50 && getGameAction(i) != 1) {
                    if (i != 56 && getGameAction(i) != 6) {
                        if (getGameAction(i) != 8 && i != -6 && i != -21) {
                            if (i == -7 || i == -22) {
                                this.f210y = 0;
                                m131a(0, 1, -1);
                            }
                            break;
                        } else {
                            switch (this.f211z) {
                                case 0:
                                    this.f197J = 1;
                                    this.f198K = 1;
                                    this.f211z = 0;
                                    m131a(30, -1, -1);
                                    break;
                                case 1:
                                    this.f197J = 1;
                                    this.f198K = 1;
                                    this.f211z = 0;
                                    m131a(31, -1, -1);
                                    break;
                                case 2:
                                    this.f197J = 1;
                                    this.f198K = 1;
                                    this.f211z = 0;
                                    m131a(32, -1, -1);
                                    break;
                                case 3:
                                    this.f197J = 1;
                                    this.f198K = 1;
                                    this.f211z = 0;
                                    m131a(33, -1, -1);
                                    break;
                                case 4:
                                    this.f197J = 1;
                                    this.f198K = 1;
                                    this.f211z = 0;
                                    m131a(34, -1, -1);
                                    break;
                            }
                        }
                    } else {
                        if (this.f211z == f180f.length - 1) {
                            this.f211z = 0;
                        } else {
                            this.f211z++;
                        }
                        m142b();
                        break;
                    }
                } else {
                    if (this.f211z == 0) {
                        this.f211z = f180f.length - 1;
                    } else {
                        this.f211z--;
                    }
                    m142b();
                    break;
                }
                break;
            case 4:
                if (i != 50 && getGameAction(i) != 1 && i != 56 && getGameAction(i) != 6) {
                    if (i == 52 || getGameAction(i) == 2) {
                        if (this.f197J > 1) {
                            m131a(this.f204q, this.f197J - 1, -1);
                        }
                    } else if (i == 54 || getGameAction(i) == 5) {
                        if (this.f197J < this.f198K) {
                            m131a(this.f204q, this.f197J + 1, -1);
                        }
                    } else if (i == -7 || i == -22) {
                        this.f210y = 0;
                        m131a(0, 1, -1);
                    }
                    break;
                }
                break;
            case 11:
                if (i == 52 || getGameAction(i) == 2) {
                    if (this.f197J > 1) {
                        m131a(this.f204q, this.f197J - 1, -1);
                    }
                } else if (i == 54 || getGameAction(i) == 5) {
                    if (this.f197J < this.f198K) {
                        m131a(this.f204q, this.f197J + 1, -1);
                    }
                } else if (getGameAction(i) == 8 || i == -6 || i == -21) {
                    this.f197J = 1;
                    this.f198K = 1;
                    RunnableC0025f.m117a().m122b();
                }
                break;
            case 30:
                if (i != 50 && getGameAction(i) != 1 && i != 56 && getGameAction(i) != 6) {
                    if (i == 52 || getGameAction(i) == 2) {
                        if (this.f197J > 1) {
                            m131a(this.f204q, this.f197J - 1, -1);
                        }
                    } else if (i == 54 || getGameAction(i) == 5) {
                        if (this.f197J < this.f198K) {
                            m131a(this.f204q, this.f197J + 1, -1);
                        }
                    } else if (i == -7 || i == -22) {
                        this.f211z = 0;
                        m131a(3, 1, -1);
                    }
                    break;
                }
                break;
            case 31:
                if (i != 50 && getGameAction(i) != 1 && i != 56 && getGameAction(i) != 6) {
                    if (i == 52 || getGameAction(i) == 2) {
                        if (this.f197J > 1) {
                            m131a(this.f204q, this.f197J - 1, -1);
                        }
                    } else if (i == 54 || getGameAction(i) == 5) {
                        if (this.f197J < this.f198K) {
                            m131a(this.f204q, this.f197J + 1, -1);
                        }
                    } else if (i == -7 || i == -22) {
                        this.f211z = 0;
                        m131a(3, 1, -1);
                    }
                    break;
                }
                break;
            case 32:
                if (i != 50 && getGameAction(i) != 1 && i != 56 && getGameAction(i) != 6) {
                    if (i == 52 || getGameAction(i) == 2) {
                        if (this.f197J > 1) {
                            m131a(this.f204q, this.f197J - 1, -1);
                        }
                    } else if (i == 54 || getGameAction(i) == 5) {
                        if (this.f197J < this.f198K) {
                            m131a(this.f204q, this.f197J + 1, -1);
                        }
                    } else if (i == -7 || i == -22) {
                        this.f211z = 0;
                        m131a(3, 1, -1);
                    }
                    break;
                }
                break;
            case 33:
                if (i != 50 && getGameAction(i) != 1 && i != 56 && getGameAction(i) != 6) {
                    if (i == 52 || getGameAction(i) == 2) {
                        if (this.f197J > 1) {
                            m131a(this.f204q, this.f197J - 1, -1);
                        }
                    } else if (i == 54 || getGameAction(i) == 5) {
                        if (this.f197J < this.f198K) {
                            m131a(this.f204q, this.f197J + 1, -1);
                        }
                    } else if (i == -7 || i == -22) {
                        this.f211z = 0;
                        m131a(3, 1, -1);
                    }
                    break;
                }
                break;
            case 34:
                if (i != 50 && getGameAction(i) != 1 && i != 56 && getGameAction(i) != 6) {
                    if (i == 52 || getGameAction(i) == 2) {
                        if (this.f197J > 1) {
                            m131a(this.f204q, this.f197J - 1, -1);
                        }
                    } else if (i == 54 || getGameAction(i) == 5) {
                        if (this.f197J < this.f198K) {
                            m131a(this.f204q, this.f197J + 1, -1);
                        }
                    } else if (i == -7 || i == -22) {
                        this.f211z = 0;
                        m131a(3, 1, -1);
                    }
                    break;
                }
                break;
        }
    }

    protected final void sizeChanged(int i, int i2) {
        this.f203p = getGraphics();
        m142b();
    }
}
