package p000;

import SegaRally3D.SegaRally3D;
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: renamed from: bt */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class RunnableC0025bt extends GameCanvas implements Runnable {

    /* JADX INFO: renamed from: B */
    public static int f130B;

    /* JADX INFO: renamed from: B */
    public static boolean f131B;

    /* JADX INFO: renamed from: B */
    private static final long[] f132B;

    /* JADX INFO: renamed from: C */
    public static int f133C;

    /* JADX INFO: renamed from: C */
    public static boolean f134C;
    public static int Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static long f455Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static SegaRally3D f456Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static C0007ao f457Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static DirectGraphics f458Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static String f459Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static Random f460Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static Graphics f461Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static C0037t f462Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static boolean f463Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static final int[] f464Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static final long[] f465Code;

    /* JADX INFO: renamed from: D */
    public static int f135D;

    /* JADX INFO: renamed from: F */
    public static int f136F;

    /* JADX INFO: renamed from: I */
    public static int f137I;

    /* JADX INFO: renamed from: I */
    public static long f138I;

    /* JADX INFO: renamed from: I */
    public static boolean f139I;

    /* JADX INFO: renamed from: I */
    public static int[] f140I;

    /* JADX INFO: renamed from: I */
    private static final long[] f141I;

    /* JADX INFO: renamed from: L */
    public static int f142L;

    /* JADX INFO: renamed from: S */
    public static int f143S;

    /* JADX INFO: renamed from: S */
    public static boolean f144S;

    /* JADX INFO: renamed from: V */
    public static int f145V;

    /* JADX INFO: renamed from: V */
    public static long f146V;

    /* JADX INFO: renamed from: V */
    public static String f147V;

    /* JADX INFO: renamed from: V */
    public static boolean f148V;

    /* JADX INFO: renamed from: V */
    public static final long[] f149V;

    /* JADX INFO: renamed from: Z */
    public static int f150Z;

    /* JADX INFO: renamed from: Z */
    public static long f151Z;

    /* JADX INFO: renamed from: Z */
    public static boolean f152Z;

    /* JADX INFO: renamed from: Z */
    private static final int[] f153Z;

    /* JADX INFO: renamed from: Z */
    private static final long[] f154Z;

    /* JADX INFO: renamed from: a */
    public static int f155a;

    /* JADX INFO: renamed from: e */
    private static int f156e;

    /* JADX INFO: renamed from: B */
    private long f157B;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public Thread f466Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private Image f467Code;

    /* JADX INFO: renamed from: V */
    public int[] f158V;

    /* JADX INFO: renamed from: b */
    private int f159b;

    /* JADX INFO: renamed from: c */
    private int f160c;

    /* JADX INFO: renamed from: d */
    private int f161d;

    static {
        m115a(55, "\u0016\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f123456789*0#\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000ðð\u0000\u0004\u0000\u0000ŀŀ");
        m115a(60, "\u0016\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f123456789*0#\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000ðð\u0000\u0004\u0000\u0000ŀŀ");
        f465Code = new long[]{326286885123857L, 326349757324236L, 326414104829728L, 326477799544954L, 327380626216405L, 326607943784440L, 326671541926720L, 326737202219755L, 326803493925506L, 326867577468719L, 326932011207856L, 326996642457507L, 327059871169320L, 327125168840342L, 327189061823914L, 327252125064863L, 327318556611863L, 327447599654782L, 327511887255677L, 327574977828412L, 327639031991680L};
        f464Code = m115a(0, "\u0016\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f123456789*0#\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000ðð\u0000\u0004\u0000\u0000ŀŀ");
        f141I = new long[]{-4294967296L, 6574619291585L, 15758520667983L, 21057994471L};
        f149V = new long[]{-4294967295L, 278547323299847L, 245206326959118L, 24949248346314L, -4294967293L, 25128639368450L, 25066093991579L, 25008102905808L, 115783511483480L, 133996067746550L, 150484848574042L, 167120734212663L, 177668157571707L, 187774254316223L, 199284572273767L, 216006644422702L, 228776273941273L, 326286885123857L, 326349757324236L, 326414104829728L, 326477799544954L, 327380626216405L, 326607943784440L, 326671541926720L, 326737202219755L, 326803493925506L, 326867577468719L, 326932011207856L, 326996642457507L, 327059871169320L, 327125168840342L, 327189061823914L, 327252125064863L, 327318556611863L, 327447599654782L, 327511887255677L, 327574977828412L, 327639031991680L, 237804033262402L, 241672903327864L, 242022430461309L, 242358805588600L, 242713294414234L, 243075643161094L, 243446662365813L, 243794716553013L, 244148666993158L, 244499421955927L, 244851399216778L, 256803438780306L, 264388924569436L, 270716979403709L, 25366811507263L, 40152077078831L, 115329633643640L, 113091753148744L, 113154910112681L, 113211575106596L, 113392004473315L, 113455300566750L, 113334075846823L, 113271411078515L, 113571824166884L, 113514746782572L, 325254336246185L, 325833783849123L, 325899753724671L, 325966327415330L, 326026781725305L, 326093578231555L, 326157566005962L, 326221764255560L, 325000008231190L, 325062354244939L, 325128662368021L, 325192676518892L, 263110046920160L, 325321494196424L, 325383080241155L, 325450973305593L, 325640410597607L, 325575709675962L, 325513147271706L, 324935253071544L, 325707882621990L, 325770257147833L, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0, -4294967292L, 0, 0, 0};
        long[] jArr = {325833783849123L, 325899753724671L, 325966327415330L, 326026781725305L, 326093578231555L, 326157566005962L, 326221764255560L, 325000008231190L, 325128662368021L, 263110046920160L, 325321494196424L, 325383080241155L, 325450973305593L, 325640410597607L, 325575709675962L, 325513147271706L, 324935253071544L, 325707882621990L, 325770257147833L};
        f154Z = new long[]{25008102905808L, 25066093991579L, 25128639368450L, 24949248346314L};
        f153Z = new int[]{16777215, 16777215, 0, 0};
        f132B = new long[]{4000, 3000, 3000, 3000};
    }

    public RunnableC0025bt() {
        super(false);
        this.f158V = m115a(23, "\u0016\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f123456789*0#\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000ðð\u0000\u0004\u0000\u0000ŀŀ");
        m115a(36, "\u0016\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\f123456789*0#\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0000ðð\u0000\u0004\u0000\u0000ŀŀ");
        String[] strArr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        this.f466Code = null;
        f152Z = false;
        f148V = false;
        f148V = true;
        f139I = true;
        f131B = false;
        Code = 0;
        f145V = 0;
        f137I = 0;
        f150Z = 0;
        f455Code = 62;
        f135D = 0;
        f144S = true;
        setFullScreenMode(true);
    }

    public RunnableC0025bt(SegaRally3D segaRally3D) {
        this();
        this.f157B = 0L;
        this.f161d = -1;
        f456Code = segaRally3D;
        C0031g.f482Code = this;
        f455Code = 73;
        C0031g.f488Code = f456Code;
    }

    public static final int Code() {
        return f155a;
    }

    public static int Code(int i) {
        return f460Code.nextInt(i);
    }

    public static void Code(int i, int i2) {
        f143S = (-16777216) | i2;
        f136F = 255;
        f133C = -i;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public static boolean m224Code() {
        return f133C != 0;
    }

    /* JADX INFO: renamed from: F */
    public static void m111F() {
        f133C = 0;
        f143S = 0;
        f136F = 0;
    }

    /* JADX INFO: renamed from: I */
    private void m112I(Graphics graphics) {
        if (this.f467Code != null) {
            graphics.setColor(f153Z[this.f161d]);
            graphics.fillRect(0, 0, f155a, f142L);
            this.f159b = (f155a - this.f467Code.getWidth()) / 2;
            this.f160c = (f142L - this.f467Code.getHeight()) / 2;
            graphics.drawImage(this.f467Code, this.f159b, this.f160c, 0);
        }
    }

    /* JADX INFO: renamed from: V */
    public static final int m113V() {
        return f142L;
    }

    /* JADX INFO: renamed from: V */
    public static void m114V(int i, int i2) {
        f143S = 16777215 & i2;
        f136F = 0;
        f133C = i;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m115a(int i, String str) {
        int iCharAt = str.charAt(i);
        int i2 = i + 1;
        int[] iArr = new int[iCharAt];
        int i3 = 0;
        while (i3 < iCharAt) {
            iArr[i3] = str.charAt(i2);
            i3++;
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: C */
    public final void m116C() {
        this.f466Code = new Thread(this);
        this.f466Code.start();
    }

    public final C0002ag Code(int i, Object obj) {
        switch (i) {
            case 1:
                return new C0012aw(obj);
            case 2:
                return new C0013ay(obj);
            case 3:
                return new C0008aq(obj);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m225Code() {
        if (f135D != 1) {
            f135D = 1;
            f148V = false;
            this.f466Code = null;
            if (C0031g.f484Code != null) {
                C0031g.f484Code.m166V();
                C0031g.f484Code = null;
            }
            C0031g.f266c.m182v();
            C0031g.f266c = null;
            f462Code.m246Code(1);
            f462Code.m246Code(0);
            C0031g.Code.mo82V();
            C0031g.Code = null;
            if (f463Code) {
                C0031g.f267c.m190f();
                C0031g.f267c = null;
                C0031g.f481Code = null;
                C0031g.f485Code.mo237Code();
                C0031g.f485Code = null;
                C0031g.f239a.m187b();
                C0031g.f239a = null;
                C0031g.f260b.m188d();
                C0031g.f260b = null;
                C0031g.f483Code = null;
                C0031g.f489Code.m247Code();
                C0031g.f489Code = null;
                f457Code = null;
                f463Code = false;
            }
            if (f462Code != null) {
                f462Code.mo237Code();
            }
            f462Code = null;
        }
    }

    public final void Code(MIDlet mIDlet) {
        Display.getDisplay(mIDlet);
        f155a = getWidth();
        f142L = getHeight();
        f140I = new int[f155a];
        f459Code = mIDlet.getAppProperty(new StringBuffer().append("MIDlet-").append("Name").toString());
        f147V = mIDlet.getAppProperty(new StringBuffer().append("MIDlet-").append("Version").toString());
        mIDlet.getAppProperty(new StringBuffer().append("MIDlet-").append("Vendor").toString());
        mIDlet.getAppProperty("Rockpool-DJL");
        String appProperty = mIDlet.getAppProperty("Rockpool-CheatCode");
        if (appProperty != null) {
            Integer.parseInt(appProperty);
        }
        f460Code = new Random();
        f462Code = new C0037t();
    }

    /* JADX INFO: renamed from: I */
    public final int m117I() {
        return getHeight();
    }

    /* JADX INFO: renamed from: I */
    public final void m118I() {
        m111F();
        if (f130B == 0) {
            f130B = 1;
            if (C0031g.f484Code != null) {
                C0031g.f484Code.m160I();
                C0031g.f484Code.m169V();
                C0031g.f484Code.m160I();
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                }
                C0031g.f484Code.Code();
            }
        }
    }

    public final void hideNotify() {
        if (f152Z) {
            return;
        }
        f134C = true;
        m118I();
        f131B = false;
        f144S = true;
        f139I = true;
        Code = 0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    public void keyPressed(int i) {
        int i2;
        f150Z = i;
        try {
            getGameAction(i);
        } catch (Exception e) {
        }
        if (f150Z == this.f158V[4] || f150Z == -5) {
            i2 = Code | 16;
        } else if (f150Z == this.f158V[9]) {
            i2 = Code | 32;
        } else if (f150Z == this.f158V[10]) {
            i2 = Code | 64;
        } else if (f150Z == this.f158V[11]) {
            i2 = Code | 128;
        } else if (f150Z == this.f158V[1] || f150Z == -1) {
            Code &= 65533;
            i2 = Code | 1;
        } else if (f150Z == this.f158V[7] || f150Z == -2) {
            Code &= 65534;
            i2 = Code | 2;
        } else if (f150Z == this.f158V[3] || f150Z == -3) {
            Code &= 65527;
            i2 = Code | 4;
        } else if (f150Z == this.f158V[5] || f150Z == -4) {
            Code &= 65531;
            i2 = Code | 8;
        } else if (f150Z == this.f158V[0]) {
            Code &= 65525;
            i2 = Code | 5;
        } else if (f150Z == this.f158V[2]) {
            Code &= 65529;
            i2 = Code | 9;
        } else if (f150Z == this.f158V[6]) {
            Code &= 65526;
            i2 = Code | 6;
        } else if (f150Z == this.f158V[8]) {
            Code &= 65530;
            i2 = Code | 10;
        } else {
            if (f150Z != -6) {
                if (f150Z == -7) {
                    i2 = 512;
                }
                f145V++;
                if (f145V > Integer.MAX_VALUE) {
                    f145V = Integer.MAX_VALUE;
                }
                f137I = 1;
                f144S = true;
            }
            i2 = 256;
        }
        Code = i2;
        f145V++;
        if (f145V > Integer.MAX_VALUE) {
            f145V = Integer.MAX_VALUE;
        }
        f137I = 1;
        f144S = true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    public void keyReleased(int i) {
        int i2;
        int i3;
        f150Z = i;
        if (f150Z == this.f158V[4] || f150Z == -5) {
            i2 = Code;
            i3 = 65519;
        } else if (f150Z == this.f158V[9]) {
            i3 = 65503;
            i2 = Code;
        } else if (f150Z == this.f158V[10]) {
            i3 = 65471;
            i2 = Code;
        } else if (f150Z == this.f158V[11]) {
            i3 = 65407;
            i2 = Code;
        } else if (f150Z == this.f158V[1] || f150Z == -1) {
            i3 = 65534;
            i2 = Code;
        } else if (f150Z == this.f158V[7] || f150Z == -2) {
            i3 = 65533;
            i2 = Code;
        } else if (f150Z == this.f158V[3] || f150Z == -3) {
            i3 = 65531;
            i2 = Code;
        } else if (f150Z == this.f158V[5] || f150Z == -4) {
            i3 = 65527;
            i2 = Code;
        } else if (f150Z == this.f158V[0]) {
            i3 = 65530;
            i2 = Code;
        } else if (f150Z == this.f158V[2]) {
            i3 = 65526;
            i2 = Code;
        } else if (f150Z == this.f158V[6]) {
            i3 = 65529;
            i2 = Code;
        } else if (f150Z == this.f158V[8]) {
            i3 = 65525;
            i2 = Code;
        } else {
            if (f150Z != -6) {
                if (f150Z == -7) {
                    i2 = Code;
                    i3 = 65023;
                }
                f150Z = 0;
                if (Code == 0) {
                    f145V = 0;
                    f137I = 0;
                }
                f144S = true;
            }
            i2 = Code;
            i3 = 65279;
        }
        Code = i3 & i2;
        f150Z = 0;
        if (Code == 0) {
            f145V = 0;
            f137I = 0;
        }
        f144S = true;
    }

    public void keyRepeated(int i) {
        f145V++;
        if (f145V > Integer.MAX_VALUE) {
            f145V = Integer.MAX_VALUE;
        }
        f144S = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        C0031g c0031g;
        int i;
        int i2;
        C0031g c0031g2;
        int[] iArr;
        char c;
        int i3;
        while (true) {
            try {
                f146V = System.currentTimeMillis();
                f151Z++;
                if (f152Z) {
                    f456Code.quitApp();
                    return;
                }
                if (f462Code != null) {
                    f462Code.mo82V();
                }
                float f = 0.09f;
                if (f138I != 0) {
                    f = f138I / 1000.0f;
                    if (f < 0.04f) {
                        f = 0.04f;
                    } else if (f > 0.25f) {
                        f = 0.25f;
                    }
                }
                C0031g.f236a = f;
                if (C0031g.f484Code != null) {
                    if (f130B == 3) {
                        f130B = 0;
                        if (C0031g.f287h[1] > 0) {
                            C0031g.f484Code.m231Code();
                        }
                    }
                    C0031g.f484Code.Code();
                }
                switch (f135D) {
                    case 0:
                        f135D = 2;
                        break;
                    case 1:
                        if (C0031g.Code != null) {
                            C0031g.Code.mo96c();
                        }
                        f152Z = true;
                        break;
                    case 2:
                        f462Code.Code(76299, 128, 28644, "segarally");
                        f462Code.m201V(5);
                        f462Code.Code(2, (C0024br) new C0023bo());
                        f462Code.Code(3, (C0024br) new C0021bl());
                        f462Code.Code(4, (C0024br) new C0014az());
                        C0031g.Code = new C0019bh();
                        C0031g.Code.m64C();
                        C0031g.f266c = new C0031g(false, false, false, false, false);
                        C0031g.f266c.Code(this, 3, C0031g.f496Code);
                        C0031g.f484Code = new C0031g(false, false, false, false, false, false, false, false, false);
                        C0031g.f484Code.m232Code(f465Code.length);
                        f462Code.Code(f141I);
                        while (((C0033j) f462Code).f518Code != 2) {
                            f462Code.mo82V();
                        }
                        C0031g.f266c.m184y();
                        f148V = true;
                        f135D = C0031g.f300u > 0 ? 17 : 4;
                        Code(32, 16777215);
                        break;
                    case 5:
                        if (((C0033j) f462Code).f518Code == 2) {
                            f135D = 6;
                        } else if ((this.f161d == -1 || System.currentTimeMillis() > this.f157B + f132B[this.f161d]) && this.f161d + 1 < f154Z.length) {
                            this.f467Code = f462Code.m244Code(f154Z[this.f161d + 1]);
                            if (this.f467Code != null) {
                                this.f161d++;
                                if (C0031g.f277e && (this.f161d == 1 || this.f161d == 2)) {
                                    this.f161d++;
                                    this.f467Code = f462Code.m244Code(f154Z[this.f161d + 1]);
                                    if (this.f467Code != null) {
                                        this.f159b = (f155a - this.f467Code.getWidth()) / 2;
                                        this.f160c = (f142L - this.f467Code.getHeight()) / 2;
                                        this.f157B = System.currentTimeMillis();
                                    }
                                } else {
                                    this.f159b = (f155a - this.f467Code.getWidth()) / 2;
                                    this.f160c = (f142L - this.f467Code.getHeight()) / 2;
                                    this.f157B = System.currentTimeMillis();
                                }
                            }
                        }
                        break;
                    case 6:
                        if (this.f161d == -1 || System.currentTimeMillis() > this.f157B + f132B[this.f161d]) {
                            if (this.f161d + 1 != f154Z.length) {
                                this.f467Code = f462Code.m244Code(f154Z[this.f161d + 1]);
                                if (this.f467Code != null) {
                                    this.f161d++;
                                    this.f159b = (f155a - this.f467Code.getWidth()) / 2;
                                    this.f160c = (f142L - this.f467Code.getHeight()) / 2;
                                    this.f157B = System.currentTimeMillis();
                                }
                            } else {
                                f462Code.m197V(f154Z);
                                f462Code.m196I();
                                this.f467Code = null;
                                f135D = 8;
                            }
                        }
                        break;
                    case 8:
                        if (f130B == 1) {
                            f130B = 2;
                            f135D = 11;
                            C0031g.f266c.m177g(21);
                        }
                        if (C0031g.f287h[0] <= 0) {
                            if (C0031g.f287h[0] == 0) {
                                C0031g.f484Code.m161I(0);
                            }
                        } else if (f130B == 0) {
                            C0031g.f484Code.m233Code(0, -1);
                        }
                        C0031g.f266c.m178h(Code);
                        break;
                    case 9:
                        if (f130B != 1) {
                            if ((Code & 512) == 512 && !m224Code()) {
                                m118I();
                                f135D = 10;
                                if (C0031g.f484Code.f506Code) {
                                    c0031g2 = C0031g.f266c;
                                    i2 = 20;
                                } else {
                                    i2 = 22;
                                    c0031g2 = C0031g.f266c;
                                }
                                c0031g2.m177g(i2);
                            }
                            C0031g.f267c.Code(C0031g.f236a);
                            C0031g.f485Code.mo82V();
                            C0031g.f239a.mo92a();
                            C0031g.f260b.m189e();
                            C0031g.Code.m72I();
                        } else {
                            f135D = 10;
                            f130B = 2;
                            if (C0031g.f484Code.f506Code) {
                                i = 20;
                                c0031g = C0031g.f266c;
                            } else {
                                c0031g = C0031g.f266c;
                                i = 22;
                            }
                            c0031g.m177g(i);
                        }
                        break;
                    case 10:
                    case 11:
                        C0031g.f266c.m178h(Code);
                        break;
                    case 13:
                        if (((C0033j) f462Code).f518Code == 2) {
                            f135D = 26;
                        }
                        break;
                    case 14:
                        if (((C0033j) f462Code).f518Code == 2) {
                            f135D = 8;
                            Code(16, 16777215);
                        }
                        break;
                    case 15:
                        if (!m224Code()) {
                            m111F();
                            C0031g.f489Code = C0039x.Code();
                            C0031g.f483Code = new C0030f();
                            C0031g.f260b = new C0033j(false, false, false);
                            C0031g.f260b.mo96c();
                            C0031g.f239a = new C0033j(false, false);
                            C0031g.f239a.m185a(32, 16);
                            C0031g.f485Code = new C0033j(false);
                            C0031g.f485Code.Code(13, 32);
                            C0031g.f481Code = new C0020bj();
                            C0031g.f267c = C0033j.Code();
                            C0031g.f267c.Code(this);
                            C0031g.Code.mo237Code();
                            C0031g.f485Code.Code(C0031g.Code.f437Code[0].f127V).Code(C0007ao.m28a());
                            f457Code = new C0007ao(90.0f, f155a / f142L, 0.1f, 20.0f);
                            f463Code = true;
                            f462Code.Code(f149V);
                            f144S = true;
                            f135D = 5;
                        }
                        break;
                    case 17:
                        if ((Code & 256) == 256) {
                            f135D = 4;
                            Code = 0;
                        }
                        break;
                    case 26:
                        if (C0031g.Code.m60B() >= 100) {
                            f135D = 9;
                            f156e = 0;
                            C0031g.Code.f433Code = false;
                        } else {
                            C0031g.Code.m62B();
                        }
                        break;
                }
                if (f148V) {
                    if (f461Code == null) {
                        f461Code = getGraphics();
                    }
                    if (f458Code == null) {
                        f458Code = DirectUtils.getDirectGraphics(f461Code);
                    }
                    if (f139I) {
                        f139I = false;
                        Graphics graphics = f461Code;
                        switch (f135D) {
                            case 3:
                                graphics.setClip(0, 0, f155a, f142L);
                                int iCode = C0031g.f266c.Code(graphics, Code);
                                if (iCode >= 0) {
                                    if (iCode != 0) {
                                        if (C0031g.f287h[0] == 0 && C0031g.f287h[1] == 0 && C0031g.f287h[2] == 0) {
                                            C0031g.f287h[0] = 50;
                                            iArr = C0031g.f287h;
                                            i3 = 50;
                                            c = 1;
                                        }
                                        f135D = 15;
                                        graphics.setColor(-1);
                                        graphics.fillRect(0, 0, 240, 320);
                                    } else {
                                        C0031g.f287h[1] = 0;
                                        C0031g.f287h[0] = 0;
                                        iArr = C0031g.f287h;
                                        c = 2;
                                        i3 = 0;
                                    }
                                    iArr[c] = i3;
                                    f135D = 15;
                                    graphics.setColor(-1);
                                    graphics.fillRect(0, 0, 240, 320);
                                }
                                break;
                            case 4:
                                graphics.setClip(0, 0, f155a, f142L);
                                switch (C0031g.f266c.Code(graphics, 31, Code)) {
                                    case 0:
                                        f135D = 1;
                                        break;
                                    case 1:
                                        C0037t.Code(174, 145, 158, 159);
                                        f135D = 3;
                                        f144S = true;
                                        f149V[1] = C0031g.f243a[C0031g.f292l];
                                        break;
                                }
                                break;
                            case 5:
                                graphics.setClip(0, 0, f155a, f142L);
                                m112I(graphics);
                                C0031g.f266c.Code(graphics, f462Code.m202Z(), true, this.f161d < 2);
                                break;
                            case 6:
                                graphics.setClip(0, 0, f155a, f142L);
                                m112I(graphics);
                                break;
                            case 8:
                            case 10:
                            case 11:
                                C0031g.f266c.m165S(graphics);
                                break;
                            case 9:
                                if (f156e >= 3) {
                                    C0031g.f489Code.Code(graphics, C0031g.f483Code);
                                    C0031g.f266c.Code(graphics);
                                } else {
                                    graphics.setColor(0);
                                    graphics.fillRect(0, 0, f155a, f142L);
                                    f156e++;
                                }
                                break;
                            case 13:
                                C0031g.f266c.m162I(graphics, f462Code.m202Z() / 2);
                                break;
                            case 14:
                                C0031g.f266c.m162I(graphics, f462Code.m202Z());
                                break;
                            case 17:
                                C0031g.f266c.m155C(graphics);
                                break;
                            case 26:
                                C0031g.f266c.m162I(graphics, ((int) (C0031g.Code.m60B() * 0.5f)) + 50);
                                break;
                        }
                        Graphics graphics2 = f461Code;
                        if (f133C != 0) {
                            if (f133C > 0) {
                                f136F += f133C;
                                if (f136F >= 255) {
                                    f136F = 255;
                                    f133C = 0;
                                }
                            } else {
                                f136F += f133C;
                                if (f136F <= 0) {
                                    f136F = 0;
                                    f133C = 0;
                                    f143S = 0;
                                }
                            }
                            f144S = true;
                        }
                        f143S = (f143S & 16777215) | (f136F << 24);
                        if (f143S != 0) {
                            for (int i4 = 0; i4 < f155a; i4++) {
                                f140I[i4] = f143S;
                            }
                            for (int i5 = 0; i5 < f142L; i5++) {
                                graphics2.drawRGB(f140I, 0, 0, 0, i5, f155a, 1, true);
                            }
                        }
                        f139I = true;
                    }
                    flushGraphics();
                }
                do {
                    Thread.yield();
                } while (System.currentTimeMillis() - f146V <= f455Code);
                f138I = System.currentTimeMillis() - f146V;
            } catch (Exception e) {
            }
        }
    }

    public final void showNotify() {
        if (!f131B) {
            f134C = true;
            f131B = true;
            f461Code = null;
            f458Code = null;
        }
        f144S = true;
        f139I = true;
        Code = 0;
    }

    public void sizeChanged(int i, int i2) {
        f155a = i;
        f142L = i2;
    }
}
