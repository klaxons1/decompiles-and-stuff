package p000;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: C:\Temp\jadx-12448572193422856954\classes.dex */
public final class C0003d extends AbstractRunnableC0012m implements InterfaceC0000a, InterfaceC0001b, InterfaceC0007h {

    /* JADX INFO: renamed from: A */
    public static int f160A;

    /* JADX INFO: renamed from: C */
    private static boolean f167C;

    /* JADX INFO: renamed from: C */
    private static int[] f168C;

    /* JADX INFO: renamed from: D */
    static int f169D;

    /* JADX INFO: renamed from: E */
    static int f171E;

    /* JADX INFO: renamed from: E */
    private static int[] f173E;

    /* JADX INFO: renamed from: F */
    private static boolean f174F;

    /* JADX INFO: renamed from: F */
    private static int[] f175F;

    /* JADX INFO: renamed from: H */
    private static boolean f177H;

    /* JADX INFO: renamed from: K */
    private static int f180K;

    /* JADX INFO: renamed from: L */
    private static int f182L;

    /* JADX INFO: renamed from: L */
    private static boolean f183L;

    /* JADX INFO: renamed from: M */
    private static int f184M;

    /* JADX INFO: renamed from: M */
    private static boolean f185M;

    /* JADX INFO: renamed from: N */
    private static int f186N;

    /* JADX INFO: renamed from: N */
    private static boolean f187N;

    /* JADX INFO: renamed from: O */
    private static int f188O;

    /* JADX INFO: renamed from: R */
    private static int f191R;

    /* JADX INFO: renamed from: S */
    private static int f192S;

    /* JADX INFO: renamed from: V */
    private static int f195V;

    /* JADX INFO: renamed from: W */
    private static int f196W;

    /* JADX INFO: renamed from: X */
    private static int f197X;

    /* JADX INFO: renamed from: Y */
    private static int f198Y;

    /* JADX INFO: renamed from: Z */
    private static int f199Z;

    /* JADX INFO: renamed from: a */
    static C0004e f201a;

    /* JADX INFO: renamed from: a */
    private static C0008i f202a;

    /* JADX INFO: renamed from: a */
    private static String f203a;

    /* JADX INFO: renamed from: a */
    private static Display f204a;

    /* JADX INFO: renamed from: a */
    private static C0013n f206a;

    /* JADX INFO: renamed from: a */
    private static byte[] f208a;

    /* JADX INFO: renamed from: a */
    public static C0004e[] f210a;

    /* JADX INFO: renamed from: a */
    private static RunnableC0006g[] f211a;

    /* JADX INFO: renamed from: a */
    public static C0008i[] f212a;

    /* JADX INFO: renamed from: a */
    private static short[] f214a;

    /* JADX INFO: renamed from: aF */
    private static int f221aF;

    /* JADX INFO: renamed from: aG */
    private static int f222aG;

    /* JADX INFO: renamed from: aH */
    private static int f223aH;

    /* JADX INFO: renamed from: aI */
    private static int f224aI;

    /* JADX INFO: renamed from: aJ */
    private static int f225aJ;

    /* JADX INFO: renamed from: aK */
    private static int f226aK;

    /* JADX INFO: renamed from: aN */
    private static int f229aN;

    /* JADX INFO: renamed from: aO */
    private static int f230aO;

    /* JADX INFO: renamed from: aP */
    private static int f231aP;

    /* JADX INFO: renamed from: aQ */
    private static int f232aQ;

    /* JADX INFO: renamed from: aS */
    private static int f234aS;

    /* JADX INFO: renamed from: aY */
    private static int f240aY;

    /* JADX INFO: renamed from: aZ */
    private static int f241aZ;

    /* JADX INFO: renamed from: aa */
    private static int f242aa;

    /* JADX INFO: renamed from: ad */
    private static int f245ad;

    /* JADX INFO: renamed from: ae */
    private static int f246ae;

    /* JADX INFO: renamed from: af */
    private static int f247af;

    /* JADX INFO: renamed from: ag */
    private static int f248ag;

    /* JADX INFO: renamed from: ah */
    private static int f249ah;

    /* JADX INFO: renamed from: ai */
    private static int f250ai;

    /* JADX INFO: renamed from: aj */
    private static int f251aj;

    /* JADX INFO: renamed from: ao */
    private static int f256ao;

    /* JADX INFO: renamed from: ap */
    private static int f257ap;

    /* JADX INFO: renamed from: aq */
    private static int f258aq;

    /* JADX INFO: renamed from: ar */
    private static int f259ar;

    /* JADX INFO: renamed from: b */
    private static long f267b;

    /* JADX INFO: renamed from: b */
    private static C0004e f268b;

    /* JADX INFO: renamed from: b */
    private static C0008i f269b;

    /* JADX INFO: renamed from: b */
    private static String f270b;

    /* JADX INFO: renamed from: b */
    private static Graphics f271b;

    /* JADX INFO: renamed from: b */
    private static Image f272b;

    /* JADX INFO: renamed from: b */
    private static byte[] f274b;

    /* JADX INFO: renamed from: b */
    public static C0008i[] f276b;

    /* JADX INFO: renamed from: b */
    private static short[] f278b;

    /* JADX INFO: renamed from: b */
    public static int[][] f279b;

    /* JADX INFO: renamed from: bA */
    private static int f280bA;

    /* JADX INFO: renamed from: bB */
    private static int f281bB;

    /* JADX INFO: renamed from: bC */
    private static int f282bC;

    /* JADX INFO: renamed from: bD */
    private static int f283bD;

    /* JADX INFO: renamed from: bE */
    private static int f284bE;

    /* JADX INFO: renamed from: bF */
    private static int f285bF;

    /* JADX INFO: renamed from: bG */
    private static int f286bG;

    /* JADX INFO: renamed from: bH */
    private static int f287bH;

    /* JADX INFO: renamed from: bI */
    private static int f288bI;

    /* JADX INFO: renamed from: bJ */
    private static int f289bJ;

    /* JADX INFO: renamed from: bK */
    private static int f290bK;

    /* JADX INFO: renamed from: bL */
    private static int f291bL;

    /* JADX INFO: renamed from: bM */
    private static int f292bM;

    /* JADX INFO: renamed from: bN */
    private static int f293bN;

    /* JADX INFO: renamed from: bO */
    private static int f294bO;

    /* JADX INFO: renamed from: bP */
    private static int f295bP;

    /* JADX INFO: renamed from: bQ */
    private static int f296bQ;

    /* JADX INFO: renamed from: bc */
    private static int f299bc;

    /* JADX INFO: renamed from: bd */
    private static int f300bd;

    /* JADX INFO: renamed from: be */
    private static int f301be;

    /* JADX INFO: renamed from: bf */
    private static int f302bf;

    /* JADX INFO: renamed from: bg */
    private static int f303bg;

    /* JADX INFO: renamed from: bh */
    private static int f304bh;

    /* JADX INFO: renamed from: bi */
    private static int f305bi;

    /* JADX INFO: renamed from: bj */
    private static int f306bj;

    /* JADX INFO: renamed from: bk */
    private static int f307bk;

    /* JADX INFO: renamed from: bl */
    private static int f308bl;

    /* JADX INFO: renamed from: bm */
    private static int f309bm;

    /* JADX INFO: renamed from: bn */
    private static int f310bn;

    /* JADX INFO: renamed from: bo */
    private static int f311bo;

    /* JADX INFO: renamed from: bp */
    private static int f312bp;

    /* JADX INFO: renamed from: bs */
    private static int f315bs;

    /* JADX INFO: renamed from: bt */
    private static int f316bt;

    /* JADX INFO: renamed from: bu */
    private static int f317bu;

    /* JADX INFO: renamed from: bv */
    private static int f318bv;

    /* JADX INFO: renamed from: bw */
    private static int f319bw;

    /* JADX INFO: renamed from: bx */
    private static int f320bx;

    /* JADX INFO: renamed from: by */
    private static int f321by;

    /* JADX INFO: renamed from: bz */
    private static int f322bz;

    /* JADX INFO: renamed from: c */
    private static long f323c;

    /* JADX INFO: renamed from: c */
    private static C0008i f325c;

    /* JADX INFO: renamed from: c */
    private static String f326c;

    /* JADX INFO: renamed from: c */
    private static byte[] f328c;

    /* JADX INFO: renamed from: c */
    static C0004e[] f330c;

    /* JADX INFO: renamed from: c */
    private static C0008i[] f331c;

    /* JADX INFO: renamed from: c */
    private static String[] f332c;

    /* JADX INFO: renamed from: d */
    private static long f335d;

    /* JADX INFO: renamed from: d */
    private static C0008i f336d;

    /* JADX INFO: renamed from: d */
    static boolean f338d;

    /* JADX INFO: renamed from: d */
    private static byte[] f339d;

    /* JADX INFO: renamed from: d */
    private static int[][] f343d;

    /* JADX INFO: renamed from: e */
    public static int f344e;

    /* JADX INFO: renamed from: e */
    private static String f345e;

    /* JADX INFO: renamed from: e */
    static boolean f346e;

    /* JADX INFO: renamed from: e */
    private static byte[] f347e;

    /* JADX INFO: renamed from: f */
    public static int f350f;

    /* JADX INFO: renamed from: f */
    private static String f351f;

    /* JADX INFO: renamed from: f */
    private static byte[] f352f;

    /* JADX INFO: renamed from: f */
    private static int[][] f354f;

    /* JADX INFO: renamed from: g */
    static int f355g;

    /* JADX INFO: renamed from: g */
    private static byte[] f356g;

    /* JADX INFO: renamed from: h */
    static int f358h;

    /* JADX INFO: renamed from: h */
    private static boolean f359h;

    /* JADX INFO: renamed from: h */
    private static byte[] f360h;

    /* JADX INFO: renamed from: h */
    private static int[] f361h;

    /* JADX INFO: renamed from: i */
    static int f362i;

    /* JADX INFO: renamed from: i */
    private static boolean f363i;

    /* JADX INFO: renamed from: i */
    private static byte[] f364i;

    /* JADX INFO: renamed from: j */
    static int f366j;

    /* JADX INFO: renamed from: j */
    private static boolean f367j;

    /* JADX INFO: renamed from: k */
    static int f369k;

    /* JADX INFO: renamed from: l */
    static int f372l;

    /* JADX INFO: renamed from: l */
    private static boolean f373l;

    /* JADX INFO: renamed from: m */
    static int f375m;

    /* JADX INFO: renamed from: m */
    private static boolean f376m;

    /* JADX INFO: renamed from: n */
    static int f378n;

    /* JADX INFO: renamed from: n */
    private static boolean f379n;

    /* JADX INFO: renamed from: o */
    public static int f381o;

    /* JADX INFO: renamed from: o */
    private static boolean f382o;

    /* JADX INFO: renamed from: p */
    public static int f384p;

    /* JADX INFO: renamed from: p */
    private static boolean f385p;

    /* JADX INFO: renamed from: q */
    public static int f387q;

    /* JADX INFO: renamed from: r */
    public static int f390r;

    /* JADX INFO: renamed from: u */
    public static int f399u;

    /* JADX INFO: renamed from: u */
    private static boolean f400u;

    /* JADX INFO: renamed from: v */
    public static int f402v;

    /* JADX INFO: renamed from: v */
    private static boolean f403v;

    /* JADX INFO: renamed from: v */
    private static int[] f404v;

    /* JADX INFO: renamed from: w */
    public static int f405w;

    /* JADX INFO: renamed from: w */
    private static boolean f406w;

    /* JADX INFO: renamed from: x */
    public static int f408x;

    /* JADX INFO: renamed from: x */
    private static boolean f409x;

    /* JADX INFO: renamed from: y */
    private static boolean f412y;

    /* JADX INFO: renamed from: D */
    private boolean f414D;

    /* JADX INFO: renamed from: aE */
    private int f415aE;

    /* JADX INFO: renamed from: ay */
    private int f416ay;

    /* JADX INFO: renamed from: y */
    private int[] f417y;

    /* JADX INFO: renamed from: z */
    private boolean f418z;

    /* JADX INFO: renamed from: z */
    private int[] f419z;

    /* JADX INFO: renamed from: c */
    static int[] f329c = new int[4];

    /* JADX INFO: renamed from: d */
    static int[] f340d = new int[4];

    /* JADX INFO: renamed from: P */
    private static int f189P = -1;

    /* JADX INFO: renamed from: Q */
    private static int f190Q = -1;

    /* JADX INFO: renamed from: a */
    public static boolean f207a = false;

    /* JADX INFO: renamed from: a */
    private static byte[][] f215a = new byte[23][];

    /* JADX INFO: renamed from: e */
    private static int[] f348e = new int[23];

    /* JADX INFO: renamed from: f */
    private static int[] f353f = {0, 100};

    /* JADX INFO: renamed from: k */
    private static boolean f370k = false;

    /* JADX INFO: renamed from: T */
    private static int f193T = -1;

    /* JADX INFO: renamed from: U */
    private static int f194U = -1;

    /* JADX INFO: renamed from: ab */
    private static int f243ab = -1;

    /* JADX INFO: renamed from: ac */
    private static int f244ac = -1;

    /* JADX INFO: renamed from: q */
    private static boolean f388q = false;

    /* JADX INFO: renamed from: g */
    private static int[] f357g = new int[10];

    /* JADX INFO: renamed from: i */
    private static int[] f365i = new int[20];

    /* JADX INFO: renamed from: r */
    private static boolean f391r = false;

    /* JADX INFO: renamed from: ak */
    private static int f252ak = 1;

    /* JADX INFO: renamed from: al */
    private static int f253al = 0;

    /* JADX INFO: renamed from: a */
    private static Image f205a = null;

    /* JADX INFO: renamed from: am */
    private static int f254am = 0;

    /* JADX INFO: renamed from: an */
    private static int f255an = -1;

    /* JADX INFO: renamed from: j */
    private static int[] f368j = {14835037, 1201877, 16371768, 4249262};

    /* JADX INFO: renamed from: k */
    private static int[] f371k = {92, 69, 154, 1879048262, 73, 74, 76, 78};

    /* JADX INFO: renamed from: l */
    private static int[] f374l = {92, 69, 154, 1879048263, 73, 74, 76, 78};

    /* JADX INFO: renamed from: m */
    private static int[] f377m = {92, 69, 154, 1879048264, 73, 74, 76, 78};

    /* JADX INFO: renamed from: n */
    private static int[] f380n = {92, 69, 154, 73, 74, 76, 78};

    /* JADX INFO: renamed from: o */
    private static int[] f383o = {93, 94, 73, 74, 68, 78};

    /* JADX INFO: renamed from: p */
    private static int[] f386p = {143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153};

    /* JADX INFO: renamed from: q */
    private static int[] f389q = {219, 218, 220};

    /* JADX INFO: renamed from: r */
    private static int[] f392r = {164, 165, 166};

    /* JADX INFO: renamed from: s */
    private static int[] f395s = {164, 165, 167};

    /* JADX INFO: renamed from: t */
    private static int[] f398t = {164, 165};

    /* JADX INFO: renamed from: u */
    private static int[] f401u = {164, 165, 167};

    /* JADX INFO: renamed from: c */
    private static int[][] f334c = {f392r, f395s, f398t, f401u};

    /* JADX INFO: renamed from: s */
    private static boolean f394s = false;

    /* JADX INFO: renamed from: t */
    private static boolean f397t = false;

    /* JADX INFO: renamed from: as */
    private static int f260as = 0;

    /* JADX INFO: renamed from: at */
    private static int f261at = 0;

    /* JADX INFO: renamed from: au */
    private static int f262au = 0;

    /* JADX INFO: renamed from: av */
    private static int f263av = 0;

    /* JADX INFO: renamed from: aw */
    private static int f264aw = 0;

    /* JADX INFO: renamed from: a */
    private static String[] f213a = {"S", "A", "B", "C"};

    /* JADX INFO: renamed from: a */
    private static long[] f209a = {70000, 165000, 100000, 250000, 140000, 200000, 93000, 206000, 120000, 170000, 150000};

    /* JADX INFO: renamed from: s */
    public static int f393s = 0;

    /* JADX INFO: renamed from: t */
    public static int f396t = 0;

    /* JADX INFO: renamed from: w */
    private static int[] f407w = new int[11];

    /* JADX INFO: renamed from: x */
    private static int[] f410x = new int[55];

    /* JADX INFO: renamed from: ax */
    private static int f265ax = 0;

    /* JADX INFO: renamed from: az */
    private static int f266az = 0;

    /* JADX INFO: renamed from: aA */
    private static int f217aA = 0;

    /* JADX INFO: renamed from: aB */
    private static int f218aB = 0;

    /* JADX INFO: renamed from: aC */
    private static int f219aC = 0;

    /* JADX INFO: renamed from: aD */
    private static int f220aD = 0;

    /* JADX INFO: renamed from: A */
    private static boolean f161A = false;

    /* JADX INFO: renamed from: a */
    private static long f200a = 0;

    /* JADX INFO: renamed from: B */
    private static boolean f164B = false;

    /* JADX INFO: renamed from: a */
    public static final int[][] f216a = {new int[]{-1}, new int[]{17}, new int[]{-1}, new int[]{20}, new int[]{-1}, new int[]{23}, new int[]{-1}, new int[]{26}, new int[]{-1}, new int[]{29}, new int[]{32, 35}};

    /* JADX INFO: renamed from: A */
    private static int[] f162A = {18, 21, 24, 27, 30, 33, 36};

    /* JADX INFO: renamed from: E */
    private static boolean f172E = false;

    /* JADX INFO: renamed from: aL */
    private static int f227aL = Integer.parseInt("/12".substring("/12".indexOf(47) + 1, "/12".length()));

    /* JADX INFO: renamed from: aM */
    private static int f228aM = Integer.parseInt("/8".substring("/8".indexOf(47) + 1, "/8".length()));

    /* JADX INFO: renamed from: B */
    private static int[] f165B = {0, 256, 0, 1025, 1, 513, 3, 259, 2, 258, 514};

    /* JADX INFO: renamed from: b */
    public static C0004e[] f275b = new C0004e[400];

    /* JADX INFO: renamed from: d */
    private static C0004e[] f341d = new C0004e[200];

    /* JADX INFO: renamed from: c */
    private static short[] f333c = new short[1500];

    /* JADX INFO: renamed from: aR */
    private static int f233aR = -1;

    /* JADX INFO: renamed from: d */
    private static short[] f342d = new short[1500];

    /* JADX INFO: renamed from: aT */
    private static int f235aT = 0;

    /* JADX INFO: renamed from: y */
    public static int f411y = 0;

    /* JADX INFO: renamed from: z */
    public static int f413z = 0;

    /* JADX INFO: renamed from: b */
    public static boolean f273b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f327c = false;

    /* JADX INFO: renamed from: B */
    public static int f163B = 0;

    /* JADX INFO: renamed from: C */
    public static int f166C = 0;

    /* JADX INFO: renamed from: aU */
    private static int f236aU = 0;

    /* JADX INFO: renamed from: aV */
    private static int f237aV = 0;

    /* JADX INFO: renamed from: aW */
    private static int f238aW = 0;

    /* JADX INFO: renamed from: aX */
    private static int f239aX = 0;

    /* JADX INFO: renamed from: e */
    private static int[][] f349e = new int[600][];

    /* JADX INFO: renamed from: ba */
    private static int f297ba = 0;

    /* JADX INFO: renamed from: bb */
    private static int f298bb = 10;

    /* JADX INFO: renamed from: d */
    private static String f337d = "";

    /* JADX INFO: renamed from: D */
    private static int[] f170D = new int[32];

    /* JADX INFO: renamed from: G */
    private static boolean f176G = false;

    /* JADX INFO: renamed from: b */
    private static String[] f277b = {"00", "01", "99", "98", "03", "09"};

    /* JADX INFO: renamed from: I */
    private static boolean f178I = false;

    /* JADX INFO: renamed from: J */
    private static boolean f179J = false;

    /* JADX INFO: renamed from: bq */
    private static int f313bq = 0;

    /* JADX INFO: renamed from: c */
    private static C0004e f324c = null;

    /* JADX INFO: renamed from: br */
    private static int f314br = 0;

    /* JADX INFO: renamed from: K */
    private static boolean f181K = false;

    static {
        int i = C0009j.f601a;
        f315bs = i;
        f316bt = (i - 48) / 7;
        f317bu = -1;
        f318bv = -1;
        f183L = false;
        f319bw = 0;
        f320bx = 0;
        f321by = 48;
        f322bz = 7;
        f280bA = 0;
        f281bB = 0;
        f282bC = 0;
        f283bD = 0;
        f345e = "5 >>";
        f335d = 0L;
        f354f = new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}};
        f289bJ = 72;
        f290bK = 0;
        f346e = false;
        f185M = false;
        short[][] sArr = {new short[]{80, 14, 113, 255}, new short[]{8, 0, 8, 0}};
        f175F = null;
        f296bQ = 0;
    }

    C0003d(Object obj, Object obj2) {
        super(obj, obj2);
        this.f416ay = 0;
        this.f417y = new int[]{191, 192, 193, 194, 195, 196, 197, 198};
        this.f419z = new int[]{167, 168, 169, 170, 242, 243, 244, 245};
        this.f418z = false;
        this.f415aE = -1;
        this.f414D = false;
        AbstractRunnableC0012m.m351a(false, 50, 8);
        AbstractRunnableC0012m.m351a(false, 52, 10);
        AbstractRunnableC0012m.m351a(false, 54, 12);
        AbstractRunnableC0012m.m351a(false, 56, 14);
        AbstractRunnableC0012m.m351a(false, 53, 11);
        f204a = Display.getDisplay(GloftSOUN.f0a);
        f182L = -1;
        f359h = false;
        f363i = true;
        f344e = 0;
        f350f = 0;
        f180K = 1;
    }

    /* JADX INFO: renamed from: A */
    private static void m39A() {
        switch (f220aD) {
            case 0:
                f198Y = 2;
                f199Z = 28;
                m110e(4);
                break;
            case 1:
                f249ah = 4;
                f199Z = 22;
                break;
            case 2:
                f249ah = 4;
                f199Z = 23;
                break;
        }
    }

    /* JADX INFO: renamed from: B */
    private static void m40B() {
        int i = 0;
        if (f212a == null) {
            f212a = new C0008i[64];
            while (i < f212a.length) {
                f212a[i] = new C0008i();
                i++;
            }
            return;
        }
        while (i < f212a.length) {
            if (i != 0 && i != 3 && i != 2 && i != 19) {
                f212a[i] = null;
                f212a[i] = new C0008i();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: C */
    private static void m41C() {
        if (f336d == null) {
            AbstractRunnableC0012m.m348a("/5");
            f336d = m59a(1, 3, true, true);
            AbstractRunnableC0012m.m393l();
        }
    }

    /* JADX INFO: renamed from: D */
    private static void m42D() {
        if (f336d != null && f198Y != 0) {
            f336d.m312a(AbstractRunnableC0012m.f611a, 1, 0, C0009j.f601a >> 1, C0009j.f602b >> 1, 0, 0, 0);
        } else {
            AbstractRunnableC0012m.m375d(0);
            AbstractRunnableC0012m.m368c(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
        }
    }

    /* JADX INFO: renamed from: E */
    private static void m43E() {
        switch (f196W) {
            case 1:
                f208a = null;
                m109e();
                f364i = null;
                m48J();
                C0013n.f673c = false;
                break;
            case 2:
                f275b = new C0004e[400];
                f408x = 0;
                f341d = new C0004e[200];
                f229aN = 0;
                f210a = null;
                f405w = 0;
                C0004e.m154a();
                C0013n.m406a();
                m101c();
                f260as = 0;
                f261at = 0;
                f262au = 0;
                f393s = 0;
                f396t = 0;
                f263av = 0;
                f285bF = 0;
                f286bG = 0;
                f284bE = 0;
                f346e = false;
                break;
            case 3:
                m40B();
                if (f199Z == 6) {
                    f212a[30] = m61a(f212a[30], 30, 1, false, false);
                    AbstractRunnableC0012m.m393l();
                }
                break;
            case 4:
                f274b = null;
                f328c = null;
                f339d = null;
                f347e = null;
                f352f = null;
                f356g = null;
                f360h = null;
                RunnableC0006g.m274i(0);
                RunnableC0006g.m274i(1);
                f331c = null;
                break;
        }
    }

    /* JADX INFO: renamed from: F */
    private static void m44F() {
        if (f174F) {
            int i = 0;
            for (int i2 = 0; i2 < f405w; i2++) {
                if ((f210a[i2].f506D & 262144) != 0) {
                    f210a[i2] = null;
                } else {
                    if (i != i2) {
                        f210a[i] = f210a[i2];
                        f210a[i2] = null;
                    }
                    i++;
                }
            }
            f405w = i;
        }
        f174F = false;
    }

    /* JADX INFO: renamed from: G */
    private static void m45G() {
        f229aN = 0;
        f408x = 0;
        if (f338d) {
            if (f177H && m83a(32768, true)) {
                f178I = true;
                do {
                    m51M();
                    for (int i = 39; i >= 0; i--) {
                        C0004e c0004e = f330c[i];
                        if (c0004e != null) {
                            c0004e.m230b(AbstractRunnableC0012m.f622a_);
                        }
                    }
                    if (f305bi >= f304bh) {
                        break;
                    }
                } while (f306bj != 0);
                if (f178I && f324c != null) {
                    m96b(f324c);
                    f324c = null;
                }
                m109e();
                m102c(-1);
            } else {
                for (int i2 = 39; i2 >= 0; i2--) {
                    C0004e c0004e2 = f330c[i2];
                    if (c0004e2 != null) {
                        c0004e2.m229b();
                        if (m99b(c0004e2)) {
                            m104c(c0004e2);
                        }
                    }
                }
            }
        }
        for (int i3 = 0; i3 < f405w; i3++) {
            C0004e c0004e3 = f210a[i3];
            if (c0004e3 != null) {
                c0004e3.m229b();
                if (m99b(c0004e3)) {
                    m104c(c0004e3);
                }
                if ((c0004e3.f506D & 262144) == 0 && m84a(c0004e3)) {
                    if (f408x < 399) {
                        f275b[f408x] = c0004e3;
                        f408x++;
                    } else {
                        System.out.println("Active Actors number overstep MAX_ACTIVE_ACTOR!");
                    }
                }
            }
        }
        for (int i4 = 0; i4 < f408x; i4++) {
            C0004e c0004e4 = f275b[i4];
            if (c0004e4.f462f != Integer.MIN_VALUE) {
                c0004e4.mo239e();
            }
        }
        for (int i5 = 0; i5 < f408x; i5++) {
            C0004e c0004e5 = f275b[i5];
            if (c0004e5.f462f == Integer.MIN_VALUE) {
                c0004e5.mo239e();
            }
        }
        for (int i6 = 0; i6 < f408x; i6++) {
            if ((f275b[i6] != C0004e.f425a || f275b[i6].f467j != 7) && f275b[i6].f462f != 42 && f275b[i6].f462f != 43 && f275b[i6].f462f != 47 && f275b[i6].f462f != 57) {
                f275b[i6].m230b(AbstractRunnableC0012m.f622a_);
                if (f275b[i6] == C0004e.f425a) {
                    C0004e.f425a.m445z();
                    C0004e.f425a.m442v();
                }
            } else if (f275b[i6] == C0004e.f425a) {
                C0004e.f425a.m442v();
            }
        }
        switch (f287bH) {
            case 2:
                if (f288bI < 100) {
                    f288bI += 4;
                } else {
                    f287bH = 1;
                }
                break;
            case 3:
                if (f288bI > 0) {
                    f288bI -= 4;
                } else {
                    f287bH = 0;
                }
                break;
        }
        if (f288bI < 0) {
            f288bI = 0;
        }
        if (f288bI > 100) {
            f288bI = 100;
        }
    }

    /* JADX INFO: renamed from: H */
    private static void m46H() {
        int i;
        for (int i2 = 0; i2 < f297ba; i2++) {
            if (f349e[i2][5] != -1) {
                int i3 = 0;
                while (true) {
                    if (i3 >= f297ba) {
                        i3 = -1;
                        break;
                    } else if (f349e[i3][0] == f349e[i2][5]) {
                        break;
                    } else {
                        i3++;
                    }
                }
                f349e[i2][5] = i3;
            }
        }
        for (int i4 = 0; i4 < f297ba; i4++) {
            if (f349e[i4][1] == 0) {
                int i5 = 0;
                for (int i6 = i4; f349e[i6][5] != -1; i6 = f349e[i6][5]) {
                    i5++;
                }
                C0004e.f428a[C0004e.f443p] = new int[(i5 << 1) + 6 + (i5 - 1) + (i5 - 1)];
                int[] iArr = C0004e.f428a[C0004e.f443p];
                iArr[0] = f349e[i4][2];
                iArr[1] = i5 - 1;
                int i7 = 6;
                int i8 = f349e[i4][5];
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = i7 + 1;
                    iArr[i7] = f349e[i8][3] << 8;
                    i7 = i10 + 1;
                    iArr[i10] = f349e[i8][4] << 8;
                    i8 = f349e[i8][5];
                }
                int i11 = f349e[i4][5];
                int i12 = i7;
                while (i11 != -1 && f349e[i11][5] != -1) {
                    int i13 = f349e[i11][5];
                    if (i13 != -1) {
                        int i14 = f349e[i11][3];
                        int i15 = f349e[i11][4];
                        int i16 = f349e[i13][3];
                        int i17 = f349e[i13][4];
                        i = i12 + 1;
                        iArr[i12] = C0004e.m148a(i14 - i16, i15 - i17) << 8;
                    } else {
                        i = i12;
                    }
                    i11 = f349e[i11][5];
                    i12 = i;
                }
                int i18 = f349e[i4][5];
                if (i18 != -1) {
                    while (f349e[i18][5] != -1) {
                        iArr[i12] = f349e[i18][2];
                        i18 = f349e[i18][5];
                        i12++;
                    }
                    int i19 = C0004e.f443p;
                    int[] iArr2 = C0004e.f428a[i19];
                    iArr2[2] = Integer.MAX_VALUE;
                    iArr2[3] = Integer.MAX_VALUE;
                    iArr2[4] = 0;
                    iArr2[5] = 0;
                    int iM172b = C0004e.m172b(i19);
                    for (int i20 = 6; i20 < (iM172b << 1) + 2 + 6; i20 += 2) {
                        int i21 = iArr2[i20];
                        int i22 = iArr2[i20 + 1];
                        if (i21 < iArr2[2]) {
                            iArr2[2] = i21;
                        }
                        if (i21 > iArr2[4]) {
                            iArr2[4] = i21;
                        }
                        if (i22 < iArr2[3]) {
                            iArr2[3] = i22;
                        }
                        if (i22 > iArr2[5]) {
                            iArr2[5] = i22;
                        }
                    }
                    iArr2[2] = iArr2[2] - 15360;
                    iArr2[4] = iArr2[4] + 15360;
                    iArr2[3] = iArr2[3] - 15360;
                    iArr2[5] = iArr2[5] + 15360;
                    C0004e.f443p++;
                }
            }
        }
        f349e = null;
        f297ba = 0;
    }

    /* JADX INFO: renamed from: I */
    private static void m47I() {
        if (f176G) {
            f337d = "";
            for (int i = 0; i < f301be - 1; i++) {
                f337d = new StringBuffer().append(f337d).append(Integer.toString(f170D[i])).toString();
            }
            f301be = 0;
            f176G = false;
        }
        for (int i2 = 0; i2 < f277b.length; i2++) {
            if (f337d.equals(f277b[i2])) {
                f300bd ^= 1 << i2;
                f337d = "";
            }
        }
        if (m107d(2)) {
            Graphics graphics = AbstractRunnableC0012m.f611a;
            graphics.setColor(0);
            graphics.fillRect(0, 0, f355g, 24);
            graphics.setColor(16711680);
            int iMax = Math.max(1, AbstractRunnableC0012m.f622a_);
            graphics.drawString(new StringBuffer().append("fps: ").append((1000 % iMax >= iMax / 2 ? 1 : 0) + (1000 / iMax)).toString(), 2, 2, 0);
        }
        if (m107d(3)) {
            Graphics graphics2 = AbstractRunnableC0012m.f611a;
            long j = Runtime.getRuntime().totalMemory() / 1024;
            long jFreeMemory = Runtime.getRuntime().freeMemory() / 1024;
            graphics2.drawString(new StringBuffer().append("U:").append(j - jFreeMemory).append(" T:").append(j).append(" F:").append(jFreeMemory).toString(), f355g - 2, 2, 24);
        }
    }

    /* JADX INFO: renamed from: J */
    private static void m48J() {
        f343d = null;
        f234aS = 0;
        f231aP = 0;
        f232aQ = 0;
        f168C = null;
        f335d = 0L;
    }

    /* JADX INFO: renamed from: K */
    private static void m49K() {
        m48J();
        m106d();
        if (m120g(f402v)) {
            f331c[1].m324c(0);
            f331c[0].m324c(0);
            RunnableC0006g.m250a(f355g, f358h, 20, 20);
            f211a[0] = new RunnableC0006g();
            RunnableC0006g.m256a(0, f274b, f328c, f339d, f331c[0], true, 16, 0, 0);
            f211a[1] = new RunnableC0006g();
            RunnableC0006g.m256a(1, f347e, f352f, f356g, f331c[1], false, 16, 0, 0);
            C0004e.f425a.m438r();
            f212a[15].m324c(0);
            f212a[16].m324c(0);
            m66a(0);
        }
        f207a = false;
    }

    /* JADX INFO: renamed from: L */
    private static void m50L() {
        f354f = new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}};
    }

    /* JADX INFO: renamed from: M */
    private static void m51M() {
        if (f305bi == f304bh && f307bk == 0) {
            m109e();
            return;
        }
        if (f312bp > 0) {
            f308bl = (((f312bp - 1) * f308bl) + f310bn) / f312bp;
            f309bm = (((f312bp - 1) * f309bm) + f311bo) / f312bp;
            f312bp--;
        }
        for (int i = 0; i < 40; i++) {
            C0004e c0004e = f330c[i];
            if (c0004e != null && (c0004e.f506D & 536870912) == 0) {
                c0004e.m230b(AbstractRunnableC0012m.f622a_);
                c0004e.m245j();
                if ((c0004e.f506D & 134217728) != 0 && c0004e.m232b()) {
                    c0004e.m243h();
                    c0004e.f456c = 0;
                    c0004e.f458d = 0;
                }
            }
        }
        do {
            if (f179J && f307bk <= 0 && f183L && !f178I) {
                f307bk = f313bq;
            }
            if (f307bk > 0) {
                f307bk--;
                return;
            }
            if (f179J) {
                f179J = false;
                f183L = false;
            }
            if (f305bi < f304bh) {
                int i2 = f305bi;
                byte[] bArr = f364i;
                int i3 = f305bi;
                f305bi = i3 + 1;
                byte b = bArr[i3];
                f306bj++;
                switch (b) {
                    case 11:
                        short sM344a = AbstractRunnableC0012m.m344a(f364i, f305bi);
                        f305bi += 2;
                        short sM344a2 = AbstractRunnableC0012m.m344a(f364i, f305bi);
                        f305bi += 2;
                        byte[] bArr2 = f364i;
                        int i4 = f305bi;
                        f305bi = i4 + 1;
                        int i5 = bArr2[i4] & 255;
                        System.out.println(new StringBuffer().append("Camera.MoveTo(").append((int) sM344a).append(", ").append((int) sM344a2).append(", ").append(i5).append(");").toString());
                        f310bn = sM344a << 8;
                        f311bo = sM344a2 << 8;
                        if (i5 == 0) {
                            f308bl = f310bn;
                            f309bm = f311bo;
                        }
                        f312bp = i5;
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 28:
                    case 32:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 44:
                    case 45:
                    default:
                        System.out.println(new StringBuffer().append("ERROR !!! (Instr: ").append(f306bj).append(",  OpCodePos: ").append(f305bi).append("/").append(f304bh).append(")").toString());
                        break;
                    case 21:
                        byte[] bArr3 = f364i;
                        int i6 = f305bi;
                        f305bi = i6 + 1;
                        int i7 = bArr3[i6] & 255;
                        byte[] bArr4 = f364i;
                        int i8 = f305bi;
                        f305bi = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        byte[] bArr5 = f364i;
                        int i10 = f305bi;
                        f305bi = i10 + 1;
                        int i11 = bArr5[i10] & 255;
                        short sM344a3 = AbstractRunnableC0012m.m344a(f364i, f305bi);
                        f305bi += 2;
                        short sM344a4 = AbstractRunnableC0012m.m344a(f364i, f305bi);
                        f305bi += 2;
                        byte[] bArr6 = f364i;
                        int i12 = f305bi;
                        f305bi = i12 + 1;
                        int i13 = bArr6[i12] & 255;
                        System.out.println(new StringBuffer().append("Sprite[").append(i7).append("].New(").append(i9).append(", ").append(i11).append(", ").append((int) sM344a3).append(", ").append((int) sM344a4).append(", ").append(i13).append(");").toString());
                        f330c[i7] = new C0004e(i11, sM344a3, sM344a4, i13);
                        break;
                    case 22:
                        byte[] bArr7 = f364i;
                        int i14 = f305bi;
                        f305bi = i14 + 1;
                        int i15 = bArr7[i14] & 255;
                        System.out.println(new StringBuffer().append("Sprite[").append(i15).append("].Delete();").toString());
                        f330c[i15] = null;
                        break;
                    case 23:
                        byte[] bArr8 = f364i;
                        int i16 = f305bi;
                        f305bi = i16 + 1;
                        int i17 = bArr8[i16] & 255;
                        int iM338a = AbstractRunnableC0012m.m338a(f364i, f305bi);
                        f305bi += 4;
                        System.out.println(new StringBuffer().append("Sprite[").append(i17).append("].AddFlags(0x").append(Integer.toHexString(iM338a)).append(");").toString());
                        C0004e c0004e2 = f330c[i17];
                        c0004e2.f506D = iM338a | c0004e2.f506D;
                        break;
                    case 24:
                        byte[] bArr9 = f364i;
                        int i18 = f305bi;
                        f305bi = i18 + 1;
                        int i19 = bArr9[i18] & 255;
                        int iM338a2 = AbstractRunnableC0012m.m338a(f364i, f305bi);
                        f305bi += 4;
                        System.out.println(new StringBuffer().append("Sprite[").append(i19).append("].RemoveFlags(0x").append(Integer.toHexString(iM338a2)).append(");").toString());
                        C0004e c0004e3 = f330c[i19];
                        c0004e3.f506D = (iM338a2 ^ (-1)) & c0004e3.f506D;
                        break;
                    case 25:
                        byte[] bArr10 = f364i;
                        int i20 = f305bi;
                        f305bi = i20 + 1;
                        int i21 = bArr10[i20] & 255;
                        byte[] bArr11 = f364i;
                        int i22 = f305bi;
                        f305bi = i22 + 1;
                        int i23 = bArr11[i22] & 255;
                        if (i23 == 255) {
                            i23 = -1;
                        }
                        byte[] bArr12 = f364i;
                        int i24 = f305bi;
                        f305bi = i24 + 1;
                        int i25 = bArr12[i24] & 255;
                        if (i25 == 255) {
                            i25 = -1;
                        }
                        System.out.println(new StringBuffer().append("Sprite[").append(i21).append("].SetModule(").append(i23).append(", ").append(i25).append(");").toString());
                        if (i23 >= 0 || i25 >= 0) {
                            f330c[i21].mo213a(i23, 0);
                            f330c[i21].m281d(i25);
                            f330c[i21].f507E = -1;
                        } else {
                            f330c[i21].f507E = 0;
                        }
                        break;
                    case 26:
                        byte[] bArr13 = f364i;
                        int i26 = f305bi;
                        f305bi = i26 + 1;
                        int i27 = bArr13[i26] & 255;
                        byte[] bArr14 = f364i;
                        int i28 = f305bi;
                        f305bi = i28 + 1;
                        int i29 = bArr14[i28] & 255;
                        System.out.println(new StringBuffer().append("Sprite[").append(i27).append("].SetAnim(").append(i29).append(");").toString());
                        f330c[i27].mo213a(i29, 0);
                        break;
                    case 27:
                        byte[] bArr15 = f364i;
                        int i30 = f305bi;
                        f305bi = i30 + 1;
                        int i31 = bArr15[i30] & 255;
                        byte[] bArr16 = f364i;
                        int i32 = f305bi;
                        f305bi = i32 + 1;
                        int i33 = bArr16[i32] & 255;
                        byte[] bArr17 = f364i;
                        int i34 = f305bi;
                        f305bi = i34 + 1;
                        int i35 = bArr17[i34] & 255;
                        System.out.println(new StringBuffer().append("Sprite[").append(i31).append("].SetAnimEx(").append(i33).append(", ").append(i35).append(");").toString());
                        f330c[i31].mo213a(i33 + f173E[i35], 0);
                        break;
                    case 29:
                        byte[] bArr18 = f364i;
                        int i36 = f305bi;
                        f305bi = i36 + 1;
                        int i37 = bArr18[i36] & 255;
                        System.out.println(new StringBuffer().append("Sprite[").append(i37).append("].ApplyAnimOff();").toString());
                        f330c[i37].m243h();
                        break;
                    case 30:
                        byte[] bArr19 = f364i;
                        int i38 = f305bi;
                        f305bi = i38 + 1;
                        int i39 = bArr19[i38] & 255;
                        short sM344a5 = AbstractRunnableC0012m.m344a(f364i, f305bi);
                        f305bi += 2;
                        short sM344a6 = AbstractRunnableC0012m.m344a(f364i, f305bi);
                        f305bi += 2;
                        System.out.println(new StringBuffer().append("Sprite[").append(i39).append("].SetPos(").append((int) sM344a5).append(", ").append((int) sM344a6).append(");").toString());
                        f330c[i39].f450a = sM344a5 << 8;
                        f330c[i39].f454b = sM344a6 << 8;
                        break;
                    case 31:
                        byte[] bArr20 = f364i;
                        int i40 = f305bi;
                        f305bi = i40 + 1;
                        int i41 = bArr20[i40] & 255;
                        short sM344a7 = AbstractRunnableC0012m.m344a(f364i, f305bi);
                        f305bi += 2;
                        short sM344a8 = AbstractRunnableC0012m.m344a(f364i, f305bi);
                        f305bi += 2;
                        if (f330c[i41].f455b == null) {
                            f330c[i41].f455b = new int[2];
                        }
                        f330c[i41].f455b[0] = sM344a7 << 8;
                        f330c[i41].f455b[1] = sM344a8 << 8;
                        break;
                    case 33:
                        byte[] bArr21 = f364i;
                        int i42 = f305bi;
                        f305bi = i42 + 1;
                        int i43 = bArr21[i42] & 255;
                        byte[] bArr22 = f364i;
                        int i44 = f305bi;
                        f305bi = i44 + 1;
                        int i45 = bArr22[i44] & 255;
                        System.out.println(new StringBuffer().append("Sprite[").append(i43).append("].SetPalette(").append(i45).append(");").toString());
                        f330c[i43].f468k = i45;
                        break;
                    case 41:
                        byte[] bArr23 = f364i;
                        int i46 = f305bi;
                        f305bi = i46 + 1;
                        int i47 = bArr23[i46] & 255;
                        System.out.println(new StringBuffer().append("WaitEndAnim(").append(i47).append(");").toString());
                        if (!f330c[i47].m232b() && !f178I) {
                            f305bi = i2;
                            f306bj--;
                            return;
                        }
                        break;
                    case 42:
                        byte[] bArr24 = f364i;
                        int i48 = f305bi;
                        f305bi = i48 + 1;
                        int i49 = bArr24[i48] & 255;
                        System.out.println(new StringBuffer().append("Wait(").append(i49).append(");").toString());
                        f307bk = i49;
                        break;
                    case 43:
                        byte[] bArr25 = f364i;
                        int i50 = f305bi;
                        f305bi = i50 + 1;
                        int i51 = bArr25[i50] & 255;
                        byte[] bArr26 = f364i;
                        int i52 = f305bi;
                        f305bi = i52 + 1;
                        int i53 = bArr26[i52] & 255;
                        System.out.println(new StringBuffer().append("Event(").append(i51).append(", ").append(i53).append(");").toString());
                        System.out.println(new StringBuffer().append("TriggerEvent(").append(i51).append(", ").append(i53).append(")...").toString());
                        if (i51 != 0) {
                            if (i51 != 4) {
                                if (i51 == 3) {
                                    C0004e c0004eM58a = m58a(i53);
                                    if (c0004eM58a != null) {
                                        c0004eM58a.m235c();
                                    }
                                } else if (i51 == 6) {
                                    C0004e c0004eM58a2 = m58a(i53);
                                    if (c0004eM58a2 != null) {
                                        c0004eM58a2.m237d();
                                    }
                                } else if (i51 == 12) {
                                    f287bH = 1;
                                    f288bI = 80;
                                } else if (i51 == 13) {
                                    f287bH = 3;
                                } else if (i51 == 14) {
                                    f287bH = 2;
                                } else if (i51 == 2) {
                                    f188O = i53;
                                    f411y = 0;
                                    f235aT = 0;
                                } else if (i51 == 10) {
                                    C0013n.m415k(i53);
                                } else if (i51 == 21) {
                                    C0004e.m184c(i53);
                                } else if (i51 == 19) {
                                    if (i53 == 0) {
                                        f177H = false;
                                        m95b(-1, -1, true);
                                    } else if (i53 == 1) {
                                        f177H = true;
                                        m95b(-1, 44, true);
                                    }
                                } else if (i51 == 18) {
                                    if (i53 == 0) {
                                        ((C0004e) C0004e.f425a).f455b[19] = 1;
                                    } else if (i53 == 1) {
                                        ((C0004e) C0004e.f425a).f455b[19] = 0;
                                    }
                                } else if (i51 == 7) {
                                    C0004e c0004eM58a3 = m58a(i53);
                                    if (c0004eM58a3 != null) {
                                        m96b(c0004eM58a3);
                                    }
                                } else if (i51 == 20) {
                                    if (i53 == 0) {
                                        f346e = false;
                                    } else if (i53 == 1) {
                                        f346e = true;
                                    }
                                } else if (i51 == 22) {
                                    m68a(0, 3, i53);
                                } else if (i51 == 23) {
                                    C0004e.f425a.m434j(i53);
                                } else if (i51 == 24) {
                                    m93b(1, i53);
                                } else if (i51 == 25) {
                                    m93b(2, i53);
                                } else if (i51 == 31) {
                                    m93b(3, i53);
                                } else if (i51 == 26) {
                                    f307bk = i53;
                                    f313bq = i53;
                                    f179J = true;
                                } else if (i51 == 27) {
                                    if (f324c != null) {
                                        f181K = true;
                                        f324c.f469l = -f324c.f469l;
                                        f324c.f470m = -f324c.f470m;
                                        f314br = 0;
                                        f307bk = f313bq;
                                        f179J = true;
                                        f183L = true;
                                    } else {
                                        f183L = false;
                                    }
                                } else if (i51 == 30) {
                                    f331c[1].m324c(1);
                                    f331c[0].m324c(1);
                                    RunnableC0006g.m250a(f355g, f358h, 20, 20);
                                    f211a[0] = new RunnableC0006g();
                                    RunnableC0006g.m256a(0, f274b, f328c, f339d, f331c[0], true, 16, 0, 0);
                                    f211a[1] = new RunnableC0006g();
                                    RunnableC0006g.m256a(1, f347e, f352f, f356g, f331c[1], false, 16, 0, 0);
                                    C0004e.f425a.m437q();
                                    f212a[15].m324c(2);
                                    f212a[16].m324c(1);
                                    m66a(0);
                                }
                                break;
                            } else {
                                switch (i53) {
                                    case 0:
                                        f285bF = 0;
                                        f286bG = 0;
                                        f284bE = 0;
                                        f346e = false;
                                        break;
                                    case 1:
                                        f286bG = 70;
                                        f285bF = 1;
                                        f284bE = 70;
                                        f346e = true;
                                        break;
                                    case 2:
                                        f286bG = 70;
                                        f285bF = 2;
                                        f346e = true;
                                        break;
                                    case 3:
                                        f286bG = 70;
                                        f285bF = 3;
                                        f346e = false;
                                        break;
                                    case 4:
                                        f286bG = 35;
                                        f285bF = 4;
                                        f284bE = 35;
                                        f346e = true;
                                        break;
                                    case 5:
                                        f286bG = 35;
                                        f285bF = 5;
                                        f346e = true;
                                        break;
                                    case 6:
                                        f286bG = 35;
                                        f285bF = 3;
                                        f346e = false;
                                        break;
                                }
                            }
                        } else {
                            switch (i53) {
                                case 0:
                                    C0013n.f668I = 0;
                                    C0013n.f669J = 0;
                                    break;
                                case 1:
                                    C0013n.f668I = 294910;
                                    C0013n.f669J = -1;
                                    m102c(-1);
                                    C0004e.f425a.m214a(0, true);
                                    break;
                                case 2:
                                    C0004e.f425a.f506D &= -8388609;
                                    break;
                                case 3:
                                    C0004e.f425a.f506D |= 8388608;
                                    break;
                                case 4:
                                    C0013n.f668I = 0;
                                    C0004e.f425a.f506D &= -8388609;
                                    break;
                                case 5:
                                    C0004e.f425a.m443w();
                                    break;
                                case 6:
                                    C0004e.f425a.m444x();
                                    break;
                            }
                        }
                        break;
                    case 46:
                        byte[] bArr27 = f364i;
                        int i54 = f305bi;
                        f305bi = i54 + 1;
                        int i55 = bArr27[i54] & 255;
                        byte[] bArr28 = f364i;
                        int i56 = f305bi;
                        f305bi = i56 + 1;
                        int i57 = bArr28[i56] & 255;
                        System.out.println(new StringBuffer().append("SetAnimBase(").append(i55).append(", ").append(i57).append(");").toString());
                        f173E[i55] = i57;
                        break;
                }
            } else {
                return;
            }
        } while (f305bi != f304bh);
        System.out.println("--- END ---");
    }

    /* JADX INFO: renamed from: N */
    private static void m52N() {
        int i;
        int i2;
        if (f346e) {
            return;
        }
        if (f180K == 13) {
            f335d += (long) AbstractRunnableC0012m.f622a_;
        }
        if (f335d > 599000) {
            f335d = 599000L;
        }
        f351f = m63a(f335d);
        int i3 = 0;
        if (f269b != null) {
            if (((C0004e) C0004e.f425a).f455b[13] != 0) {
                i3 = 0;
            } else if (f344e % 2 == 1) {
                i3 = 1;
            }
            if (C0004e.f430b != null) {
                f269b.m312a(AbstractRunnableC0012m.f611a, 11, i3, (f355g >> 1) + f163B, (f358h >> 1) + f166C, 0, 0, 0);
            } else {
                f269b.m312a(AbstractRunnableC0012m.f611a, 3, i3, (f355g >> 1) + f163B, (f358h >> 1) + f166C, 0, 0, 0);
            }
            int iAbs = Math.abs(C0004e.f425a.f469l >> 8);
            int iAbs2 = Math.abs(C0004e.f425a.f470m >> 8);
            int i4 = (iAbs * iAbs) + (iAbs2 * iAbs2);
            if (i4 > 676) {
                i4 = 676;
            }
            AbstractRunnableC0012m.f611a.setClip(f163B + 49, f166C + 291, (i4 * 60) / 676, 4);
            f269b.m312a(AbstractRunnableC0012m.f611a, 4, 0, (f355g >> 1) + f163B, (f358h >> 1) + f166C, 0, 0, 0);
            if (C0004e.f430b != null) {
                ((C0004e) C0004e.f425a).f455b[15] = 0;
                int i5 = (C0004e.f430b.f455b[1] * 54) / (m105c(f402v) ? 6 : 8);
                AbstractRunnableC0012m.f611a.setClip(f163B + 132 + (54 - i5), f166C + 298, i5, 5);
                f269b.m312a(AbstractRunnableC0012m.f611a, 10, 0, (f355g >> 1) + f163B, (f358h >> 1) + f166C, 0, 0, 0);
            } else {
                AbstractRunnableC0012m.f611a.setClip(f163B + 72, f166C + 298, (((C0004e) C0004e.f425a).f455b[15] * 122) / 100, 6);
                if (((C0004e) C0004e.f425a).f455b[15] != 100) {
                    i3 = 0;
                } else if (f344e % 2 == 1) {
                    i3 = 1;
                }
                f269b.m312a(AbstractRunnableC0012m.f611a, 5, i3, (f355g >> 1) + f163B, (f358h >> 1) + f166C, 0, 0, 0);
            }
            AbstractRunnableC0012m.f611a.setClip(0, 0, C0009j.f601a, C0009j.f602b);
        }
        f276b[0].m313a(AbstractRunnableC0012m.f611a, f351f, f163B + 2, f166C + 29, 0);
        f276b[0].m313a(AbstractRunnableC0012m.f611a, new StringBuffer().append("").append(((C0004e) C0004e.f425a).f455b[14]).toString(), f163B + 55, f166C + 5, 0);
        if (((C0004e) C0004e.f425a).f455b[13] >= 999) {
            ((C0004e) C0004e.f425a).f455b[13] = 999;
        }
        int[] iArr = {((C0004e) C0004e.f425a).f455b[13] % 10, (((C0004e) C0004e.f425a).f455b[13] / 10) % 10, ((C0004e) C0004e.f425a).f455b[13] / 100};
        String string = new StringBuffer().append("").append(iArr[2]).append(iArr[1]).append(iArr[0]).toString();
        f276b[1].m324c(1);
        f276b[1].m313a(AbstractRunnableC0012m.f611a, string, f163B + 31, f166C + 304, 0);
        if (m57a((C0004e) C0004e.f425a) >= 0) {
            int i6 = f289bJ - 8;
            f289bJ = i6;
            if (i6 < 0) {
                f289bJ = 0;
            }
        } else {
            int i7 = f289bJ + 8;
            f289bJ = i7;
            if (i7 > 72) {
                f289bJ = 72;
            }
        }
        if (f289bJ < 72) {
            if (f269b != null) {
                f269b.m312a(AbstractRunnableC0012m.f611a, 6, 0, ((f355g >> 1) + f163B) - f289bJ, (f358h >> 1) + f166C, 0, 0, 0);
                int i8 = f290bK + 1;
                f290bK = i8;
                if (i8 > 4) {
                    f290bK = 0;
                }
                int i9 = (((C0004e) C0004e.f425a).f455b[20] * 58) / 20000;
                AbstractRunnableC0012m.f611a.setClip(0, f166C + 53, f163B + i9, 10);
                if (i9 > 7 || f344e % 2 == 1) {
                    f269b.m312a(AbstractRunnableC0012m.f611a, 7, f290bK >> 1, ((f355g >> 1) + f163B) - f289bJ, (f358h >> 1) + f166C, 0, 0, 0);
                }
                AbstractRunnableC0012m.f611a.setClip(0, 0, C0009j.f601a, C0009j.f602b);
            }
            i = 30;
        } else {
            i = 0;
        }
        if (f212a[6] != null) {
            int i10 = 0;
            int length = f354f.length - 1;
            while (length >= 0) {
                if (f354f[length][0] != -1) {
                    int[] iArr2 = f354f[length];
                    iArr2[1] = iArr2[1] - AbstractRunnableC0012m.f622a_;
                    if (f354f[length][1] <= 0 && f180K != 18 && m98b(f402v)) {
                        m114f();
                    }
                    if (f354f[length][1] > 0) {
                        f212a[6].m320b(0, 255);
                        if (f354f[length][1] <= 2500) {
                            int i11 = f354f[length][1] / 100;
                            if (i11 == 0) {
                                i11 = 1;
                            }
                            f212a[6].m320b(0, i11 * 10);
                            f212a[6].m311a(AbstractRunnableC0012m.f611a, f354f[length][0], 0, (i10 * 28) + 10, i + 55, 0);
                        } else if (f344e % 2 == 1) {
                            f212a[6].m311a(AbstractRunnableC0012m.f611a, f354f[length][0], 0, (i10 * 28) + 10, i + 55, 0);
                        }
                    } else {
                        f354f[length][0] = -1;
                        f354f[length][1] = 0;
                    }
                    i2 = i10 + 1;
                } else {
                    i2 = i10;
                }
                length--;
                i10 = i2;
            }
            f212a[6].m320b(0, 255);
            m67a(-1, 0);
        }
    }

    /* JADX INFO: renamed from: O */
    private static void m53O() {
        if (f330c == null) {
            return;
        }
        for (int i = 0; i < 40; i++) {
            try {
                if (f330c[i] != null) {
                    f330c[i].m279c(f330c[i].f450a >> 8, f330c[i].f454b >> 8);
                    f330c[i].m285m();
                }
            } catch (Exception e) {
                System.out.println("PaintTaskObjects()");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static int m54a(int i, int i2) {
        if (i < 0 || i >= f362i || i2 < 0 || i2 >= f366j) {
            return 1;
        }
        try {
            return f360h[(f362i * i2) + i] + 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m55a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* JADX INFO: renamed from: a */
    private static int m56a(long j) {
        int i = -1;
        if (j > 0) {
            int[] iArr = new int[5];
            int i2 = 0;
            for (int i3 = 0; i3 < 5; i3++) {
                if ((f410x[(f190Q * 5) + i2] > j || f410x[(f190Q * 5) + i2] <= 0) && i < 0) {
                    iArr[i3] = (int) j;
                    i = i3;
                } else {
                    iArr[i3] = f410x[(f190Q * 5) + i2];
                    i2++;
                }
            }
            for (int i4 = 0; i4 < 5; i4++) {
                f410x[(f190Q * 5) + i4] = iArr[i4];
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    static final int m57a(C0004e c0004e) {
        for (int i = 0; i < f299bc; i++) {
            if (C0004e.m167a(c0004e.f450a, c0004e.f454b, f279b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static C0004e m58a(int i) {
        if (i < 0) {
            return null;
        }
        int iMin = Math.min(f405w - 1, i);
        int i2 = 0;
        while (i2 <= iMin) {
            int i3 = (i2 + iMin) / 2;
            int i4 = f210a[i3].f463g;
            if (i4 > i) {
                iMin = i3 - 1;
            } else {
                if (i4 >= i) {
                    return f210a[i3];
                }
                i2 = i3 + 1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static C0008i m59a(int i, int i2, boolean z, boolean z2) {
        return m60a(null, i, i2, 0, 0, z, z2);
    }

    /* JADX INFO: renamed from: a */
    private static C0008i m60a(C0008i c0008i, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (c0008i == null) {
            c0008i = new C0008i();
        }
        c0008i.m314a(AbstractRunnableC0012m.m352a(i), 0);
        for (int i5 = 0; (i2 >> i5) != 0; i5++) {
            if (((i2 >> i5) & 1) != 0) {
                if (i3 != 0) {
                    if (i3 == 1) {
                        c0008i.m320b(i5, i4);
                    } else if (i3 == 2) {
                        c0008i.m327d(i5);
                    }
                }
                if (z) {
                    c0008i.m307a(i5, 0, -1, -1);
                }
            }
        }
        if (z && z2) {
            c0008i.m306a();
        }
        return c0008i;
    }

    /* JADX INFO: renamed from: a */
    private static C0008i m61a(C0008i c0008i, int i, int i2, boolean z, boolean z2) {
        return m60a(c0008i, i, i2, 0, 0, z, z2);
    }

    /* JADX INFO: renamed from: a */
    static String m62a(int i) {
        return AbstractRunnableC0012m.m366c(i);
    }

    /* JADX INFO: renamed from: a */
    private static String m63a(long j) {
        long j2 = (j / 1000) / 60;
        long j3 = (j / 1000) - (j2 * 60);
        return new StringBuffer().append(j2).append(" : ").append(j3 < 10 ? new StringBuffer().append("0").append(j3).toString() : new StringBuffer().append("").append(j3).toString()).append(" . ").append(((j - (j3 * 1000)) - ((60 * j2) * 1000)) / 10).toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m64a(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int i = 0;
        if (str.length() >= 4) {
            for (int i2 = 3; str.length() > i2; i2 += 3) {
                i++;
            }
            for (int i3 = 1; i3 <= i; i3++) {
                stringBuffer.insert(str.length() - (i3 * 3), ',');
            }
        }
        return new String(stringBuffer);
    }

    /* JADX INFO: renamed from: a */
    private static String m65a(String str, String[] strArr) {
        int i = 0;
        String string = "";
        if (str.indexOf(37) < 0) {
            return str;
        }
        int i2 = 0;
        do {
            int iIndexOf = str.indexOf(37, i);
            if (iIndexOf < 0 || iIndexOf == str.length() - 1) {
                string = new StringBuffer().append(string).append(str.substring(i2)).toString();
                i = -1;
            } else {
                if (str.charAt(iIndexOf + 1) != 's') {
                    new StringBuffer().append("Invalid string format pattern '").append(str).append("'");
                }
                int iCharAt = str.charAt(iIndexOf + 2) - '0';
                if (iCharAt < 0 || iCharAt > 9) {
                    i = iIndexOf + 1;
                } else {
                    string = new StringBuffer().append(new StringBuffer().append(string).append(str.substring(i2, iIndexOf)).toString()).append(strArr[iCharAt]).toString();
                    int i3 = iIndexOf + 3;
                    i2 = i3;
                    i = i3;
                }
            }
        } while (i >= 0);
        return string;
    }

    /* JADX INFO: renamed from: a */
    static void m66a(int i) {
        if (f403v) {
            RunnableC0006g.m271g(0);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m67a(int i, int i2) {
        int[][] iArr = new int[3][];
        iArr[0] = new int[]{-1, 0};
        iArr[1] = new int[]{-1, 0};
        iArr[2] = new int[]{-1, 0};
        int i3 = 0;
        for (int i4 = 0; i4 < f354f.length; i4++) {
            if (f354f[i4][0] != -1) {
                iArr[i3] = f354f[i4];
                i3++;
            }
        }
        f354f = iArr;
        if (i2 == 0) {
            return;
        }
        if (i3 != f354f.length) {
            f354f[i3][0] = i;
            f354f[i3][1] = i2;
            return;
        }
        int i5 = 0;
        for (int i6 = 1; i6 < f354f.length; i6++) {
            iArr[i5] = f354f[i6];
            i5++;
        }
        iArr[i5][0] = i;
        iArr[i5][1] = i2;
        f354f = iArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m68a(int i, int i2, int i3) {
        f236aU = 0;
        f237aV = AbstractRunnableC0012m.f622a_ * i3;
        f238aW = i;
        f239aX = i2;
        m125i(300);
    }

    /* JADX INFO: renamed from: a */
    private void m69a(int i, int i2, String str, int i3, int i4, int i5) {
        f276b[0].m324c(0);
        f276b[0].m313a(AbstractRunnableC0012m.f611a, str, i3, i4, 3);
    }

    /* JADX INFO: renamed from: a */
    static void m70a(int i, int i2, boolean z) {
        boolean z2;
        if (f403v) {
            try {
                RunnableC0006g.m259a(f215a[i2], f348e[i2], i2, true);
                int i3 = f353f[1];
                if (i == 1) {
                    if (f370k) {
                        return;
                    }
                    int i4 = 1;
                    while (true) {
                        if (i4 > InterfaceC0005f.f479a) {
                            z2 = false;
                            break;
                        } else {
                            if (!RunnableC0006g.m265c(i4)) {
                                z2 = true;
                                i = i4;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (!z2) {
                        return;
                    } else {
                        i3 = 100;
                    }
                } else if (i == 0) {
                    if (RunnableC0006g.m265c(i)) {
                        return;
                    }
                    f194U = i2;
                    f373l = z;
                    i3 = 100;
                }
                RunnableC0006g.m251a(i, i2, z ? 0 : 1, i3, i != 0 ? 1 : 0);
                f370k = true;
                Thread.sleep(10L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m71a(int i, boolean z) {
        boolean z2 = false;
        for (int i2 = 0; i2 < f247af; i2++) {
            if (f365i[i2] == i) {
                int[] iArr = f365i;
                iArr[i2] = iArr[i2] | Integer.MIN_VALUE;
                z2 = true;
            }
            if (z2) {
                f365i[i2] = f365i[i2 + 1];
            }
        }
        if (z2) {
            f247af--;
            if (f245ad > f247af) {
                f245ad = 0;
            }
            if (f245ad > f248ag - 1) {
                f246ae = f245ad - (f248ag - 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m72a(int i, int[] iArr, int i2) {
        f361h = iArr;
        f247af = iArr.length;
        for (int i3 = 0; i3 < f247af; i3++) {
            f365i[i3] = iArr[i3];
        }
        f246ae = 0;
        f248ag = 11;
        int i4 = i < 0 ? 0 : f357g[i];
        f245ad = i4;
        if (i4 > f247af) {
            f245ad = 0;
        }
        if (f245ad > f248ag - 1) {
            f246ae = f245ad - (f248ag - 1);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m73a(C0004e c0004e) {
        if (f405w >= 1500) {
            System.out.println("Actors number overstep MAX_LEVEL_ACTOR!");
        } else {
            f210a[f405w] = c0004e;
            f405w++;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m74a(Graphics graphics) {
        if (f276b[0] != null) {
            f276b[0].m324c(0);
            if (f243ab != -1) {
                if (f243ab == -2) {
                    AbstractRunnableC0012m.m375d(16777215);
                    AbstractRunnableC0012m.m347a(0, (AbstractRunnableC0012m.m362c() - 10) + 1, 10, (AbstractRunnableC0012m.m362c() - 10) + 1, 5, AbstractRunnableC0012m.m362c() - 1);
                } else {
                    if (f325c != null && (f180K != 6 || f394s)) {
                        f325c.m312a(graphics, 4, 0, 0, AbstractRunnableC0012m.m362c(), 0, 0, 0);
                    }
                    f276b[0].m313a(graphics, AbstractRunnableC0012m.m366c(f243ab), 5, AbstractRunnableC0012m.m362c() - 1, 36);
                }
            }
            if (f244ac == -1 || f244ac == -2) {
                return;
            }
            if (f325c != null && (f180K != 6 || f394s)) {
                f325c.m312a(graphics, 5, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c(), 0, 0, 0);
            }
            f276b[0].m313a(graphics, AbstractRunnableC0012m.m366c(f244ac), AbstractRunnableC0012m.m353b() - 5, AbstractRunnableC0012m.m362c() - 1, 40);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m75a(Graphics graphics, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i - (((f247af < f248ag ? f247af : f248ag) - 1) * 15);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            int i9 = i5;
            if (i8 >= (f247af < f248ag ? f247af : f248ag)) {
                return;
            }
            int i10 = (f246ae + i8) % f247af;
            if (i10 >= 0) {
                String strM366c = f361h != null ? AbstractRunnableC0012m.m366c(f365i[i10] & 268435455) : new StringBuffer().append(AbstractRunnableC0012m.m366c(0)).append(" ").append(i10 + 1).toString();
                f276b[0].m309a(strM366c);
                int iM294b = C0008i.m294b();
                int i11 = 6;
                if (f180K == 10) {
                    i11 = 9;
                    i2 = 20;
                    i3 = 40;
                } else if (f180K == 21) {
                    i11 = 19;
                    i2 = 20;
                    i3 = 50;
                } else {
                    i2 = 0;
                    i3 = -1;
                }
                int i12 = 0;
                if ((f365i[i10] & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    f276b[0].m324c(2);
                    i4 = i11 + 2;
                } else if (f246ae + i8 == f245ad) {
                    f276b[0].m324c(1);
                    if (f344e % 2 != 1 || f249ah == 0) {
                        i4 = i11;
                    } else {
                        i12 = 1;
                        i4 = i11;
                    }
                } else {
                    f276b[0].m324c(0);
                    i4 = i11 + 1;
                }
                int iM326d = f325c.m326d(f325c.m318b(7, 0));
                int iM328e = f325c.m328e(f325c.m318b(7, 0));
                f325c.m312a(graphics, i4, i12, AbstractRunnableC0012m.m353b() >> 1, i9 - 13, 0, 0, 0);
                if ((f365i[i10] & 1879048192) == 1879048192) {
                    f276b[0].m324c(6);
                    if (f205a != null && RunnableC0002c.m22a() && !f409x) {
                        RunnableC0002c.m25a(graphics, f205a, (AbstractRunnableC0012m.m353b() >> 1) + (iM326d >> 1) + 5, (i9 - 13) + (iM328e - 14), 6);
                    }
                }
                if (iM294b > iM326d - 14) {
                    int i13 = (iM294b - (iM326d - 60)) >> 1;
                    int iM353b = ((AbstractRunnableC0012m.m353b() - iM326d) + 18) >> 1;
                    int i14 = (iM326d - 18) + 4;
                    if (f180K != 11 || f251aj >= iM326d - 14) {
                        AbstractRunnableC0012m.m346a(iM353b, i9 - 13, i14, iM328e);
                    } else {
                        AbstractRunnableC0012m.m346a(f250ai, 0, f251aj, AbstractRunnableC0012m.m362c());
                    }
                    if (AbstractRunnableC0012m.m371d(f253al) > i13) {
                        if (f253al <= 0) {
                            i13 = -i13;
                        }
                        f253al = i13;
                        f252ak = -f252ak;
                    }
                    i3 = f253al + f252ak;
                    f253al = i3;
                }
                f276b[0].m313a(graphics, strM366c, (AbstractRunnableC0012m.m353b() >> 1) - i3, i9, 3);
                if (iM294b > iM326d - 14) {
                    AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                }
                if (f180K == 11) {
                    AbstractRunnableC0012m.m346a(f250ai, 0, f251aj, AbstractRunnableC0012m.m362c());
                }
                if (f180K == 10) {
                    f276b[0].m313a(graphics, AbstractRunnableC0012m.m366c(161), (AbstractRunnableC0012m.m353b() >> 1) + 20, i9, 3);
                    if (f407w[m108e(i8)] != 0) {
                        if (f246ae + i8 != f245ad) {
                            f276b[0].m324c(4);
                        } else {
                            f276b[0].m324c(0);
                        }
                        f276b[0].m313a(graphics, f213a[4 - f407w[m108e(i8)]], (AbstractRunnableC0012m.m353b() >> 1) + 56, i9, 3);
                        i6 = i2;
                    }
                } else if (f180K == 21) {
                    f276b[0].m324c(5);
                    f276b[0].m313a(graphics, m90b(f410x[m108e(f246ae + i8) * 5]), (AbstractRunnableC0012m.m353b() >> 1) + 30, i9, 3);
                }
                i6 = i2;
            }
            i5 = i9 + i6 + 30;
            i7 = i8 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m76a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int color = graphics.getColor();
        int i6 = 0;
        while (i6 < i4) {
            int i7 = (i6 == 0 || i6 == i4 + (-1)) ? 5 : 0;
            if (i6 == 1 || i6 == i4 - 2) {
                i7 = 3;
            }
            if (i6 == 2 || i6 == i4 - 3) {
                i7 = 2;
            }
            if (i6 == 3 || i6 == i4 - 4) {
                i7 = 1;
            }
            if (i6 == 4 || i6 == i4 - 5) {
                i7 = 1;
            }
            if (i6 == 0) {
                graphics.setColor(i5);
                graphics.drawLine(i + i7, i2, (i + i3) - i7, i2);
            } else if (i6 == i4 - 1) {
                graphics.setColor(i5);
                graphics.drawLine(i + i7, i2 + i6, (i + i3) - i7, i2 + i6);
            } else {
                graphics.setColor(i5);
                graphics.drawLine(i + i7, i2 + i6, i + i7 + 1, i2 + i6);
                graphics.drawLine(i + i7 + 2, i2 + i6, ((i + i3) - i7) - 2, i2 + i6);
                graphics.setColor(i5);
                graphics.drawLine(((i + i3) - i7) - 1, i2 + i6, (i + i3) - i7, i2 + i6);
            }
            i6++;
        }
        graphics.setColor(color);
    }

    /* JADX INFO: renamed from: a */
    private static void m77a(boolean z) {
        int i;
        int iAbs;
        int i2 = InterfaceC0011l.f604a;
        int i3 = ((C0004e) C0004e.f425a).f454b;
        if (f411y == 0) {
            f411y = 0;
            if (C0004e.f424a == null || C0004e.f424a.f467j == 0 || AbstractRunnableC0012m.m371d(((C0004e) C0004e.f425a).f450a - C0004e.f424a.f450a) <= ((AbstractRunnableC0012m.m353b() / 5) << 8)) {
                i = ((C0004e) C0004e.f425a).f450a;
            } else {
                i = ((C0004e.f424a.f450a << 2) / 5) + (((C0004e) C0004e.f425a).f450a / 5);
                i3 = (((C0004e) C0004e.f425a).f454b >> 1) + (C0004e.f424a.f454b >> 1);
            }
        } else {
            m68a(0, 3, 4);
            int i4 = f413z + AbstractRunnableC0012m.f622a_;
            f413z = i4;
            if (i4 > AbstractRunnableC0012m.f622a_ * 3) {
                if (f411y - ((C0004e) C0004e.f425a).f450a < 0) {
                    f411y = f411y + C0004e.f425a.f469l + 6656;
                }
                if (f411y - ((C0004e) C0004e.f425a).f450a > 0) {
                    f411y = (f411y + C0004e.f425a.f469l) - 6656;
                }
            }
            i = f411y;
            if (Math.abs(f411y - ((C0004e) C0004e.f425a).f450a) <= 6656 && f413z > AbstractRunnableC0012m.f622a_ * 3) {
                f411y = 0;
            }
        }
        if ((f169D & 16416) == 0) {
            f273b = false;
        }
        if (C0004e.f425a.f467j == 2) {
            if (((C0004e) C0004e.f425a).f455b[0] < 0) {
                i2 = -InterfaceC0011l.f604a;
            }
            iAbs = (i2 * C0004e.f425a.f477y) / 5120;
        } else {
            if ((C0004e.f425a.f506D & 1) != 0) {
                i2 = -InterfaceC0011l.f604a;
            }
            iAbs = (i2 * Math.abs(C0004e.f425a.f469l)) / 5120;
        }
        if (f235aT != iAbs) {
            if (f235aT < iAbs) {
                f235aT += 4;
            }
            if (f235aT > iAbs) {
                f235aT -= 4;
            }
            if (Math.abs(f235aT - iAbs) <= 4) {
                f235aT = iAbs;
            }
        }
        int i5 = ((i >> 8) - (f355g >> 1)) + f235aT + f163B;
        int i6 = ((i3 >> 8) - (f358h >> 1)) + f166C;
        if ((f160A <= 0 && !m82a(f402v) && !m98b(f402v)) || z || (m105c(f402v) && C0004e.f430b != null && C0004e.f430b.f467j == 19)) {
            f375m = i5;
            f378n = i6;
        } else {
            int iM55a = m55a(i5, f387q, f381o);
            int iM55a2 = m55a(i6, f390r, f384p);
            if (C0004e.f425a.m278c() == 9 || C0004e.f425a.m278c() == 6 || (C0004e.f425a.m278c() >= 43 && C0004e.f425a.m278c() <= 51)) {
                f375m = iM55a;
                f378n = iM55a2;
            } else {
                f375m = m121h(iM55a - f375m) + f375m;
                f378n = m121h(iM55a2 - f378n) + f378n;
            }
        }
        if (f160A > 0) {
            f160A--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009b A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x0002, B:4:0x001c, B:6:0x001f, B:8:0x002c, B:9:0x0043, B:10:0x0059, B:12:0x005c, B:14:0x0067, B:17:0x006d, B:22:0x007b, B:25:0x008c, B:26:0x0090, B:28:0x009b, B:30:0x00a2, B:31:0x00a5, B:33:0x00ac, B:35:0x00be, B:36:0x00e0, B:37:0x0103, B:38:0x010f, B:39:0x011c, B:40:0x0129, B:41:0x0137, B:42:0x0195, B:43:0x01a2, B:44:0x01b0, B:47:0x01b8, B:49:0x01be, B:51:0x01c5, B:53:0x01cc, B:55:0x01d3, B:57:0x01da, B:59:0x01e1, B:61:0x01e8, B:64:0x01fd, B:66:0x0204, B:63:0x01ef, B:67:0x0211, B:68:0x021f, B:69:0x0233, B:75:0x0252, B:77:0x0258, B:80:0x0265, B:82:0x026c, B:83:0x0277, B:84:0x0282, B:85:0x0297, B:86:0x02a4, B:87:0x02b1, B:88:0x02c4, B:89:0x02d1, B:90:0x02e1, B:91:0x02ef, B:92:0x02fc, B:93:0x0309, B:94:0x0316, B:95:0x0329, B:96:0x0336, B:97:0x0343, B:99:0x034a, B:100:0x0357), top: B:104:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x0002, B:4:0x001c, B:6:0x001f, B:8:0x002c, B:9:0x0043, B:10:0x0059, B:12:0x005c, B:14:0x0067, B:17:0x006d, B:22:0x007b, B:25:0x008c, B:26:0x0090, B:28:0x009b, B:30:0x00a2, B:31:0x00a5, B:33:0x00ac, B:35:0x00be, B:36:0x00e0, B:37:0x0103, B:38:0x010f, B:39:0x011c, B:40:0x0129, B:41:0x0137, B:42:0x0195, B:43:0x01a2, B:44:0x01b0, B:47:0x01b8, B:49:0x01be, B:51:0x01c5, B:53:0x01cc, B:55:0x01d3, B:57:0x01da, B:59:0x01e1, B:61:0x01e8, B:64:0x01fd, B:66:0x0204, B:63:0x01ef, B:67:0x0211, B:68:0x021f, B:69:0x0233, B:75:0x0252, B:77:0x0258, B:80:0x0265, B:82:0x026c, B:83:0x0277, B:84:0x0282, B:85:0x0297, B:86:0x02a4, B:87:0x02b1, B:88:0x02c4, B:89:0x02d1, B:90:0x02e1, B:91:0x02ef, B:92:0x02fc, B:93:0x0309, B:94:0x0316, B:95:0x0329, B:96:0x0336, B:97:0x0343, B:99:0x034a, B:100:0x0357), top: B:104:0x0002 }] */
    /* JADX INFO: renamed from: a */
    private static void m78a(byte[] bArr) {
        C0004e c0004e;
        try {
            f210a = new C0004e[1500];
            f279b = new int[f298bb][];
            f299bc = 0;
            f230aO = 0;
            f405w = 0;
            short s = 0;
            f349e = null;
            f297ba = 0;
            while (s < bArr.length) {
                int i = bArr[s] & 255;
                short[] sArr = new short[i];
                int i2 = 0;
                s = (short) (s + 1);
                while (i2 < i) {
                    sArr[i2] = (short) ((bArr[s] & 255) | ((bArr[s + 1] & 255) << 8));
                    i2++;
                    s = (short) (s + 2);
                }
                short s2 = sArr[0];
                short s3 = sArr[1];
                short s4 = sArr[2];
                short s5 = sArr[3];
                int i3 = 5;
                short s6 = sArr[4];
                short[] sArr2 = new short[sArr.length - 5];
                int i4 = 0;
                while (i4 < sArr2.length) {
                    sArr2[i4] = sArr[i3];
                    i4++;
                    i3++;
                }
                switch (s2) {
                    case 0:
                    case 19:
                        C0013n c0013n = new C0013n();
                        C0004e.f425a = c0013n;
                        C0004e.f425a.m423a(196608, s4, s5, sArr2[0] != 0, s2);
                        c0004e = c0013n;
                        c0004e.m212a((int) s6);
                        if (m82a(f402v) && c0004e.f462f == 65537) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 1:
                    case 37:
                        c0004e = new C0004e(65537, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 4:
                        if (sArr2[1] != 0) {
                            c0004e = (sArr2[1] == 5 || sArr2[1] == 13 || sArr2[1] == 19 || sArr2[1] == 33 || sArr2[1] == 62 || sArr2[1] == 80 || sArr2[1] == 105 || sArr2[1] == 119) ? new C0004e(65542, s2, s4, s5, sArr2) : sArr2[1] == 116 ? new C0004e(66, s2, s4, s5, sArr2) : null;
                            c0004e.m212a((int) s6);
                            if (m82a(f402v)) {
                                c0004e.m235c();
                            }
                            c0004e.f463g = s3;
                            if (s2 < f212a.length) {
                                ((RunnableC0006g) c0004e).f509a = f212a[s2];
                                f323c |= 1 << s2;
                            }
                        } else {
                            c0004e = null;
                        }
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 15:
                    case 16:
                    case 18:
                    case 22:
                    case 23:
                    case 24:
                    case 32:
                    case 33:
                        if (s2 != 24) {
                            C0004e c0004e2 = (s2 == 7 && sArr2[1] == 3) ? new C0004e(52, s2, s4, s5, sArr2) : new C0004e(Integer.MIN_VALUE, s2, s4, s5, sArr2);
                            if (s2 == 5 && sArr2[1] == 69) {
                                c0004e2.f471n |= 524704;
                                c0004e = c0004e2;
                            } else {
                                c0004e = c0004e2;
                            }
                            c0004e.m212a((int) s6);
                            if (m82a(f402v)) {
                                c0004e.m235c();
                            }
                            c0004e.f463g = s3;
                            if (s2 < f212a.length) {
                                ((RunnableC0006g) c0004e).f509a = f212a[s2];
                                f323c |= 1 << s2;
                            }
                        } else {
                            c0004e = null;
                        }
                        break;
                    case 6:
                        c0004e = new C0004e(65543, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 9:
                        c0004e = new C0004e(41, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 10:
                        c0004e = new C0004e(42, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 11:
                        C0004e c0004e3 = new C0004e(65538, s2, s4, s5, sArr2);
                        c0004e3.f471n |= 495;
                        c0004e = c0004e3;
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 12:
                        C0004e c0004e4 = new C0004e(44, s2, s4, s5, sArr2);
                        c0004e4.f471n |= 32;
                        c0004e = c0004e4;
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 13:
                        c0004e = new C0004e(45, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 14:
                        C0004e c0004e5 = new C0004e(65539, s2, s4, s5, sArr2);
                        C0004e.f430b = c0004e5;
                        c0004e = c0004e5;
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 17:
                        c0004e = new C0004e(65547, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 20:
                        c0004e = new C0004e(48, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 25:
                        c0004e = new C0004e(50, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 26:
                        c0004e = new C0004e(51, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 27:
                        C0004e c0004e6 = new C0004e(53, s2, s4, s5, sArr2);
                        c0004e6.f471n |= 480;
                        c0004e = c0004e6;
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 28:
                        c0004e = new C0004e(54, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 30:
                        if (sArr2[1] == 25) {
                            c0004e = new C0004e(61, s2, s4, s5, sArr2);
                        } else {
                            C0004e c0004e7 = new C0004e(55, s2, s4, s5, sArr2);
                            C0004e.f430b = c0004e7;
                            c0004e = c0004e7;
                        }
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 34:
                        c0004e = new C0004e(62, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 36:
                        C0004e c0004e8 = new C0004e(Integer.MIN_VALUE, s2, s4, s5, sArr2);
                        c0004e8.f471n |= 524704;
                        c0004e = c0004e8;
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 38:
                        C0004e c0004e9 = new C0004e(Integer.MIN_VALUE, s2, s4, s5, sArr2);
                        c0004e9.f471n |= 270336;
                        c0004e = c0004e9;
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 39:
                        s2 = 4;
                        c0004e = new C0004e(67, 4, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 100:
                        m79a(new int[]{s3, 0, 65535 & s6, s4, s5, sArr2[0]});
                        c0004e = null;
                        break;
                    case 101:
                        m79a(new int[]{s3, 1, 65535 & s6, s4, s5, sArr2[0]});
                        c0004e = null;
                        break;
                    case 102:
                        c0004e = new C0004e(37, -1, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 103:
                        c0004e = new C0004e(38, -1, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 104:
                        c0004e = new C0004e(39, -1, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    case 105:
                        f279b[f299bc] = new int[4];
                        f279b[f299bc][0] = (((s4 + 10) / 20) * 20) << 8;
                        f279b[f299bc][1] = (((s5 + 10) / 20) * 20) << 8;
                        f279b[f299bc][2] = ((((s4 + sArr2[0]) + 10) / 20) * 20) << 8;
                        f279b[f299bc][3] = ((((sArr2[1] + s5) + 10) / 20) * 20) << 8;
                        f299bc++;
                        c0004e = null;
                        break;
                    case 106:
                        c0004e = new C0004e(40, s2, s4, s5, sArr2);
                        c0004e.m212a((int) s6);
                        if (m82a(f402v)) {
                            c0004e.m235c();
                        }
                        c0004e.f463g = s3;
                        if (s2 < f212a.length) {
                            ((RunnableC0006g) c0004e).f509a = f212a[s2];
                            f323c |= 1 << s2;
                        }
                        break;
                    default:
                        c0004e = null;
                        break;
                }
                if (c0004e != null) {
                    int i5 = f230aO;
                    f230aO = i5 + 1;
                    c0004e.f466i = i5;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m79a(int[] iArr) {
        if (f349e == null) {
            f349e = new int[600][];
            f297ba = 0;
        }
        if (f297ba >= f349e.length) {
            System.out.println("_segment_raw_data out of index!! ");
            return;
        }
        int[][] iArr2 = f349e;
        int i = f297ba;
        f297ba = i + 1;
        iArr2[i] = iArr;
    }

    /* JADX INFO: renamed from: a */
    private static void m80a(C0004e[] c0004eArr, C0004e c0004e, int i, int i2) {
        if (i < 0 || i >= c0004eArr.length) {
            return;
        }
        while (i2 > i) {
            c0004eArr[i2] = c0004eArr[i2 - 1];
            i2--;
        }
        c0004eArr[i] = c0004e;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m81a() {
        if (!f376m || !f379n) {
            return false;
        }
        m110e(f199Z);
        if (f199Z == 6) {
            m70a(0, 0, true);
        }
        f376m = false;
        f199Z = -1;
        return true;
    }

    /* JADX INFO: renamed from: a */
    static boolean m82a(int i) {
        if (C0004e.f425a == null) {
            return (f165B[i] & 256) != 0;
        }
        return !C0013n.m409d(2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83a(int i, boolean z) {
        if (z) {
            return (f169D & i) != 0;
        }
        return (f171E & i) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84a(C0004e c0004e) {
        if ((c0004e.f506D & 262144) != 0) {
            return false;
        }
        if ((c0004e.f506D & 1073741824) != 0) {
            return true;
        }
        if ((c0004e.f506D & 2097152) != 0) {
            return ((c0004e.f465h & 2) == 0 && (c0004e.f506D & 4194304) == 0) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85a(boolean z) {
        return f171E != 0;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m86a(byte[] bArr) {
        int i;
        int i2;
        int iM338a = AbstractRunnableC0012m.m338a(bArr, 16) + 8 + 16;
        int iM338a2 = iM338a + AbstractRunnableC0012m.m338a(bArr, iM338a) + 12;
        int iM338a3 = AbstractRunnableC0012m.m338a(bArr, iM338a2 - 4) >> 8;
        int i3 = iM338a3 * 505;
        byte[] bArr2 = new byte[i3 + 44];
        bArr2[0] = 82;
        bArr2[1] = 73;
        bArr2[2] = 70;
        bArr2[3] = 70;
        AbstractRunnableC0012m.m339a(bArr2, 4, (i3 + 44) - 8);
        bArr2[8] = 87;
        bArr2[9] = 65;
        bArr2[10] = 86;
        bArr2[11] = 69;
        bArr2[12] = 102;
        bArr2[13] = 109;
        bArr2[14] = 116;
        bArr2[15] = 32;
        bArr2[16] = 16;
        bArr2[17] = 0;
        bArr2[18] = 0;
        bArr2[19] = 0;
        bArr2[20] = 1;
        bArr2[21] = 0;
        bArr2[22] = 1;
        bArr2[23] = 0;
        bArr2[24] = 64;
        bArr2[25] = 31;
        bArr2[26] = 0;
        bArr2[27] = 0;
        bArr2[28] = 64;
        bArr2[29] = 31;
        bArr2[30] = 0;
        bArr2[31] = 0;
        bArr2[32] = 1;
        bArr2[33] = 0;
        bArr2[34] = 8;
        bArr2[35] = 0;
        bArr2[36] = 100;
        bArr2[37] = 97;
        bArr2[38] = 116;
        bArr2[39] = 97;
        AbstractRunnableC0012m.m339a(bArr2, 40, i3);
        int i4 = 0;
        int i5 = 44;
        int i6 = iM338a2;
        while (i4 < iM338a3) {
            short sM344a = AbstractRunnableC0012m.m344a(bArr, i6);
            int i7 = bArr[i6 + 2];
            bArr2[i5] = (byte) (sM344a >> 8);
            bArr2[i5] = (byte) ((bArr2[i5] & 127) | ((bArr2[i5] ^ (-1)) & 128));
            int i8 = i5 + 1;
            int i9 = i6 + 4;
            int i10 = 0;
            int i11 = 0;
            int i12 = 504;
            int i13 = sM344a;
            while (i12 > 0) {
                if (i10 == 0) {
                    i2 = i9 + 1;
                    i11 = bArr[i9];
                    i = i11 & 15;
                } else {
                    i = (i11 >> 4) & 15;
                    i2 = i9;
                }
                i10 = (i10 + 1) & 1;
                int i14 = i & 8;
                int i15 = i & 7;
                short s = f214a[i7];
                int i16 = s >> 3;
                if ((i15 & 4) != 0) {
                    i16 += s;
                }
                if ((i15 & 2) != 0) {
                    i16 += s >> 1;
                }
                if ((i15 & 1) != 0) {
                    i16 += s >> 2;
                }
                int i17 = i14 != 0 ? i13 - i16 : i16 + i13;
                if (i17 > 32767) {
                    i17 = 32767;
                } else if (i17 < -32768) {
                    i17 = -32768;
                }
                int i18 = f278b[i15] + i7;
                if (i18 < 0) {
                    i18 = 0;
                }
                if (i18 > 88) {
                    i18 = 88;
                }
                i7 = i18;
                bArr2[i8] = (byte) (i17 >> 8);
                bArr2[i8] = (byte) ((bArr2[i8] & 127) | ((bArr2[i8] ^ (-1)) & 128));
                i8++;
                i12--;
                i13 = i17;
                i9 = i2;
            }
            i4++;
            i5 += 505;
            i6 += 256;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    private static short[] m87a(byte[] bArr) {
        int length = bArr.length >> 1;
        short[] sArr = new short[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            int i4 = bArr[i] & 255;
            i = i3 + 1;
            sArr[i2] = (short) (((bArr[i3] & 255) << 8) + i4);
        }
        return sArr;
    }

    /* JADX INFO: renamed from: b */
    private static int m88b(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 24);
    }

    /* JADX INFO: renamed from: b */
    private static int m89b(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i2 >>> 24);
        return i6;
    }

    /* JADX INFO: renamed from: b */
    private static String m90b(long j) {
        return j <= 0 ? "--  :  --  .  --" : m63a(j);
    }

    /* JADX INFO: renamed from: b */
    public static void m91b() {
        f233aR = f402v;
        f231aP = 0;
        f343d = new int[1500][];
        for (int i = 0; i < f405w; i++) {
            if (f210a[i].m220a()) {
                f343d[f231aP] = f210a[i].m226a();
                f231aP++;
            }
        }
        for (int i2 = 0; i2 < f234aS; i2++) {
            f333c[i2] = f342d[i2];
        }
        f232aQ = f234aS;
        f168C = null;
        int[] iArr = new int[10];
        f168C = iArr;
        iArr[0] = f188O;
        f168C[1] = f375m;
        f168C[2] = f378n;
        f168C[3] = f184M;
        f168C[4] = f186N;
        f168C[6] = f381o;
        f168C[8] = f384p;
        f168C[5] = f387q;
        f168C[7] = f390r;
        f168C[9] = C0013n.m409d(2) ? 0 : 1;
        m70a(1, 21, false);
    }

    /* JADX INFO: renamed from: b */
    static void m92b(int i) {
        if (f403v) {
            RunnableC0006g.m269f(0);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m93b(int i, int i2) {
        f317bu = i;
        f318bv = i2;
        f183L = true;
        f181K = false;
        if (f317bu < 3 && f330c[f317bu] != null) {
            f319bw = (f330c[f317bu].f450a >> 8) - RunnableC0006g.m266e(1);
            f320bx = ((f330c[f317bu].f454b >> 8) - RunnableC0006g.m268f(1)) - 7;
            if (f319bw > (C0009j.f601a >> 1)) {
                f319bw -= 48;
            }
        } else if (f317bu == 3) {
            if (f324c == null) {
                C0004e c0004e = new C0004e(68, 40, ((C0004e) C0004e.f425a).f450a >> 8, (((C0004e) C0004e.f425a).f454b >> 8) - 20, null);
                f324c = c0004e;
                c0004e.f469l = 512;
                f324c.f470m = -512;
                f324c.f461e = ((C0004e) C0004e.f425a).f461e;
                f324c.f506D |= -1073741824;
                f324c.mo213a(1, 6);
                f314br = 0;
            } else {
                f314br = 16;
            }
            f319bw = (f324c.f450a >> 8) - RunnableC0006g.m266e(1);
            f320bx = ((f324c.f454b >> 8) - RunnableC0006g.m268f(1)) - 7;
            if (f319bw > (C0009j.f601a >> 1)) {
                f319bw -= 48;
            }
        }
        f280bA = (0 - f319bw) / 7;
        f281bB = (0 - f320bx) / 7;
        f321by = 48;
        f322bz = 7;
        int i3 = f318bv;
        String string = new StringBuffer().append("\\4").append(AbstractRunnableC0012m.m366c(221)).append(" \\1").append(AbstractRunnableC0012m.m366c(i3)).toString();
        if (f317bu == 1 && (C0013n.f666G & 1) != 0) {
            string = new StringBuffer().append("\\4").append(AbstractRunnableC0012m.m366c(222)).append(" \\1").append(AbstractRunnableC0012m.m366c(i3)).toString();
        } else if (f317bu == 2) {
            string = new StringBuffer().append("\\4").append(AbstractRunnableC0012m.m366c(224)).append(" \\1").append(AbstractRunnableC0012m.m366c(i3)).toString();
        } else if (f317bu == 3) {
            string = new StringBuffer().append("\\4").append(AbstractRunnableC0012m.m366c(223)).append(" \\1").append(AbstractRunnableC0012m.m366c(i3)).toString();
        }
        f326c = string;
        f326c = f276b[0].m305a(f326c, f315bs - 40);
        int i4 = 0;
        int i5 = 0;
        do {
            i4++;
            int iIndexOf = f326c.indexOf(10, i5);
            i5 = (iIndexOf < 0 || iIndexOf == f326c.length() + (-1)) ? -1 : iIndexOf + 1;
        } while (i5 >= 0);
        int i6 = (i4 >> 1) + (i4 % 2);
        String[] strArr = new String[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            strArr[i7] = "";
        }
        int length = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = 0;
            do {
                i10++;
                int iIndexOf2 = f326c.indexOf(10, length);
                if (iIndexOf2 < 0 || iIndexOf2 == f326c.length() - 1) {
                    length = f326c.length();
                    strArr[i9] = new StringBuffer().append(strArr[i9]).append(f326c.substring(i8, length)).toString();
                    i10 = 2;
                } else {
                    strArr[i9] = new StringBuffer().append(strArr[i9]).append(f326c.substring(i8, iIndexOf2)).append('\n').toString();
                    int i11 = iIndexOf2 + 1;
                    length = i11;
                    i8 = i11;
                }
            } while (i10 < 2);
        }
        f332c = strArr;
        f282bC = 0;
        f283bD = f332c.length;
    }

    /* JADX INFO: renamed from: b */
    private static void m94b(int i, int i2, int i3) {
        AbstractRunnableC0012m.f611a.setColor(f368j[i3]);
        int iM326d = f325c.m326d(12);
        int iM328e = f325c.m328e(12) - 7;
        for (int i4 = 0; i4 < 4; i4++) {
            int i5 = 6 - i4;
            AbstractRunnableC0012m.f611a.fillRect(i + i5, i4 + 3 + i2, iM326d - (i5 << 1), 1);
        }
        AbstractRunnableC0012m.f611a.fillRect(i, i2 + 4 + 3, iM326d, iM328e);
        f325c.m312a(AbstractRunnableC0012m.f611a, 12, 0, i, i2, 0, 0, 0);
        String string = new StringBuffer().append(AbstractRunnableC0012m.m366c(79)).append(" ").append(i3 + 1).toString();
        f276b[0].m324c(0);
        f276b[0].m313a(AbstractRunnableC0012m.f611a, string, i + 7, i2 + 5, 0);
    }

    /* JADX INFO: renamed from: b */
    private static void m95b(int i, int i2, boolean z) {
        f243ab = i2;
        f244ac = i;
        f388q = z;
    }

    /* JADX INFO: renamed from: b */
    static void m96b(C0004e c0004e) {
        if (c0004e == null) {
            return;
        }
        if (c0004e.f466i != -1 && f234aS < f342d.length) {
            short[] sArr = f342d;
            int i = f234aS;
            f234aS = i + 1;
            sArr[i] = (short) c0004e.f466i;
        }
        c0004e.f506D |= 262144;
        f174F = true;
        if (c0004e.f462f == 40 && c0004e.f467j == 1 && f201a == c0004e) {
            f201a.f467j = 0;
            f201a = null;
            c0004e.m244i();
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m97b() {
        return f191R > 0;
    }

    /* JADX INFO: renamed from: b */
    static boolean m98b(int i) {
        return (f165B[i] & 512) != 0;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m99b(C0004e c0004e) {
        if ((c0004e.f506D & 262144) != 0) {
            return false;
        }
        if ((c0004e.f506D & Integer.MIN_VALUE) != 0) {
            return true;
        }
        if (((c0004e.f506D & 2097152) != 0 || c0004e.f462f == 44) && !((c0004e.f465h & 1) == 0 && (c0004e.f506D & 4194304) == 0)) {
            return true;
        }
        return c0004e.f462f == 65547;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m100b(boolean z) {
        if (f249ah != 0 && f225aJ == 0) {
            f225aJ = -1;
        }
        if (f225aJ > 0) {
            f267b += (long) AbstractRunnableC0012m.f622a_;
            f172E = true;
            if (f267b > 300) {
                f267b = 300L;
                f225aJ = 0;
                return true;
            }
        } else if (f225aJ < 0) {
            f267b -= (long) AbstractRunnableC0012m.f622a_;
            f172E = true;
            if (f267b <= 0) {
                f267b = 0L;
                f225aJ = 0;
                if (f249ah == 4) {
                    m110e(f199Z);
                } else if (f249ah == 1) {
                    m110e(4);
                } else if (f249ah == 2) {
                    f394s = true;
                    f225aJ = 1;
                } else if (f249ah == 3) {
                    f394s = false;
                    f225aJ = 1;
                }
                f249ah = 0;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    static void m101c() {
        if (f201a != null) {
            f201a.f467j = 0;
            f201a.m244i();
            f201a = null;
        }
        f411y = 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m102c(int i) {
        f169D &= i ^ (-1);
        f171E &= i ^ (-1);
        f240aY &= i ^ (-1);
    }

    /* JADX INFO: renamed from: c */
    private static void m103c(int i, int i2, boolean z) {
        f256ao = 1;
        f400u = z;
        f257ap = i;
        f270b = AbstractRunnableC0012m.m366c(i);
        f258aq = i2;
        f326c = f276b[0].m305a(f270b, InterfaceC0007h.f514H - 20);
        f276b[0].m309a(f326c);
        f259ar = C0008i.m295c();
        f172E = true;
    }

    /* JADX INFO: renamed from: c */
    private static void m104c(C0004e c0004e) {
        if (f229aN >= 199) {
            System.out.println("out of index: s_actorDrawList!");
            return;
        }
        for (int i = 0; i < f229aN; i++) {
            C0004e c0004e2 = f341d[i];
            if (c0004e.f461e == c0004e2.f461e ? c0004e.f450a >= c0004e2.f450a : c0004e.f461e < c0004e2.f461e) {
                m80a(f341d, c0004e, i, f229aN);
                f229aN++;
                return;
            }
        }
        m80a(f341d, c0004e, f229aN, f229aN);
        f229aN++;
    }

    /* JADX INFO: renamed from: c */
    static boolean m105c(int i) {
        return ((f165B[i] & 2) == 0 || (f165B[i] & 512) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    static void m106d() {
        m50L();
        m101c();
        m78a(f208a);
        m131m(0);
        if (f233aR == f402v && f343d != null) {
            for (int i = 0; i < f232aQ; i++) {
                f342d[i] = f333c[i];
            }
            f234aS = f232aQ;
            for (int i2 = 0; i2 < f405w; i2++) {
                for (int i3 = 0; i3 < f231aP; i3++) {
                    if (f343d[i3][0] == f210a[i2].f466i && f210a[i2].f462f != 53) {
                        f210a[i2].m219a(f343d[i3]);
                        if (f210a[i2] != C0004e.f425a) {
                            break;
                        }
                        C0013n.m406a();
                        f210a[i2].f455b[20] = 20000;
                        f210a[i2].f467j = 0;
                        f210a[i2].f468k = 0;
                        f210a[i2].mo213a(0, 0);
                        break;
                    }
                }
                for (int i4 = 0; i4 < f234aS; i4++) {
                    if (f342d[i4] == f210a[i2].f466i) {
                        m96b(f210a[i2]);
                        break;
                    }
                }
            }
            f188O = f168C[0];
            f375m = f168C[1];
            f378n = f168C[2];
            f184M = f168C[3];
            f186N = f168C[4];
            f381o = f168C[6];
            f384p = f168C[8];
            f387q = f168C[5];
            f390r = f168C[7];
            if (f168C[9] == 0) {
                C0004e.f425a.m438r();
            } else {
                C0004e.f425a.m437q();
            }
        }
        m45G();
        C0013n.m422y();
        C0013n.f673c = false;
        m77a(true);
        f207a = false;
        m66a(0);
        m92b(0);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m107d(int i) {
        return (f300bd & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: e */
    private static int m108e(int i) {
        int length = 0;
        int i2 = 0;
        while (true) {
            int i3 = length;
            if (i2 >= f254am) {
                return i3 + i;
            }
            length = f334c[i2].length + i3;
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    static void m109e() {
        if (f338d) {
            System.out.println("StopTask()");
            f338d = false;
            f330c = null;
            f173E = null;
            f177H = false;
            f188O = 0;
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m110e(int i) {
        f182L = i;
        f359h = true;
    }

    /* JADX INFO: renamed from: e */
    private static void m111e(int i, int i2, int i3, int i4) {
        int iM370d = AbstractRunnableC0012m.m370d();
        int iM377e = AbstractRunnableC0012m.m377e();
        int iM380f = AbstractRunnableC0012m.m380f();
        int iM383g = AbstractRunnableC0012m.m383g();
        AbstractRunnableC0012m.m346a(i > iM370d ? i : iM370d, i2 > iM377e ? i2 : iM377e, (i + i3 < iM370d + iM380f ? i + i3 : iM370d + iM380f) - (i > iM370d ? i : iM370d), (i2 + i4 < iM377e + iM383g ? i2 + i4 : iM377e + iM383g) - (i2 > iM377e ? i2 : iM377e));
        for (int i5 = i; i5 < i3 + i; i5 += 16) {
            for (int i6 = i2; i6 < i4 + i2; i6 += 16) {
                AbstractRunnableC0012m.f611a.drawRGB(f404v, 0, 16, i5, i6, 16, 16, true);
            }
        }
        AbstractRunnableC0012m.m346a(iM370d, iM377e, iM380f, iM383g);
    }

    /* JADX INFO: renamed from: e */
    static boolean m112e(int i) {
        System.out.println(new StringBuffer().append("StartTask(").append(i).append(")").toString());
        if (!f338d) {
            f338d = true;
            f178I = false;
        }
        if (i < 0) {
            f302bf = -1;
            f310bn = 0;
            f311bo = 0;
            f312bp = 0;
            return false;
        }
        f302bf = 0;
        f303bg = 1;
        f304bh = AbstractRunnableC0012m.m344a(f364i, f303bg);
        while (f302bf < i) {
            f302bf++;
            f303bg += f304bh + 2;
            f304bh = AbstractRunnableC0012m.m344a(f364i, f303bg);
        }
        f303bg += 2;
        System.out.println(new StringBuffer().append("TaskLength: ").append(f304bh).append(" bytes").toString());
        f304bh += f303bg;
        f305bi = f303bg;
        f306bj = 0;
        f307bk = 0;
        f310bn = 0;
        f311bo = 0;
        f312bp = 0;
        f330c = new C0004e[40];
        f173E = new int[32];
        f308bl = f375m << 8;
        f309bm = f378n << 8;
        f177H = false;
        return true;
    }

    /* JADX INFO: renamed from: f */
    private static int m113f(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i -= f334c[i3].length;
            if (i < 0) {
                return i2;
            }
            i2++;
        }
        return 4;
    }

    /* JADX INFO: renamed from: f */
    static void m114f() {
        f185M = false;
        C0013n.f673c = false;
        f200a = f335d;
        if (f161A) {
            f198Y = 2;
            f199Z = 27;
            m110e(4);
        } else {
            m66a(0);
            m92b(0);
            m110e(18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:324:0x0876  */
    /* JADX WARN: Code duplicated, block: B:621:0x148f  */
    /* JADX WARN: Code duplicated, block: B:623:0x14bf  */
    /* JADX WARN: Code duplicated, block: B:636:0x15a7  */
    /* JADX WARN: Code duplicated, block: B:717:0x18c7  */
    /* JADX INFO: renamed from: f */
    private void m115f(int i) {
        int i2;
        String strM366c;
        switch (f180K) {
            case 1:
                if (i == 0) {
                    C0008i.m287a(4);
                    AbstractRunnableC0012m.m350a("/1", 0, 1);
                    AbstractRunnableC0012m.m348a("/1");
                    AbstractRunnableC0012m.m393l();
                    AbstractRunnableC0012m.m369c("UTF-8");
                    f212a = new C0008i[64];
                    f276b = new C0008i[2];
                    f403v = false;
                    f167C = false;
                    RunnableC0002c.m20a(GloftSOUN.f0a, this, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    f265ax = RunnableC0002c.m0a();
                }
                if (i == 1) {
                    m110e(2);
                }
                break;
            case 2:
                if (i == 0) {
                    this.f416ay = 0;
                }
                if (i == 1) {
                    switch (this.f416ay) {
                        case 0:
                            AbstractRunnableC0012m.m348a("/5");
                            f202a = m59a(0, 1, true, true);
                            AbstractRunnableC0012m.m393l();
                            f172E = true;
                            AbstractRunnableC0012m.m350a("/1", 0, 1);
                            m140u();
                            if (!f409x && RunnableC0002c.m22a()) {
                                f205a = Image.createImage("/new.png");
                            }
                            break;
                        case 1:
                            AbstractRunnableC0012m.m348a("/5");
                            if (f325c == null) {
                                f325c = m59a(3, 1, false, false);
                            }
                            break;
                        case 2:
                            if (f269b == null) {
                                f269b = m59a(2, 1, true, true);
                            }
                            AbstractRunnableC0012m.m393l();
                            break;
                    }
                    this.f416ay++;
                    if (this.f416ay >= 4) {
                        f195V = 0;
                        f196W = this.f416ay - 4;
                        m134o();
                    }
                    if (f350f > 9000 && !m81a() && this.f416ay >= 14) {
                        m110e(3);
                        f379n = true;
                        m122h(3);
                    }
                }
                if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    if (f350f < 3000) {
                        AbstractRunnableC0012m.m375d(-1);
                        AbstractRunnableC0012m.m368c(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                        f202a.m310a(AbstractRunnableC0012m.f611a, 0, (AbstractRunnableC0012m.m353b() - f202a.m326d(0)) >> 1, (AbstractRunnableC0012m.m362c() - f202a.m328e(0)) >> 1, 0);
                    } else if (f350f < 6000) {
                        AbstractRunnableC0012m.m375d(-1);
                        AbstractRunnableC0012m.m368c(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                        f202a.m310a(AbstractRunnableC0012m.f611a, 1, (AbstractRunnableC0012m.m353b() - f202a.m326d(1)) >> 1, (AbstractRunnableC0012m.m362c() - f202a.m328e(1)) >> 1, 0);
                    } else if (f196W >= 4) {
                        AbstractRunnableC0012m.m375d(0);
                        AbstractRunnableC0012m.m368c(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                        f276b[1].m324c(0);
                        f276b[1].m322b(AbstractRunnableC0012m.f611a, f276b[1].m305a(AbstractRunnableC0012m.m366c(206), (AbstractRunnableC0012m.m353b() << 1) / 3), AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 3);
                    }
                    f172E = true;
                }
                if (i == 3) {
                    f202a = null;
                }
                break;
            case 3:
                if (i == 0) {
                    m95b(-1, -1, false);
                    m103c(51, 1, false);
                    f394s = true;
                    f225aJ = 1;
                    f267b = 0L;
                }
                if (i == 1 && f397t) {
                    f397t = false;
                    if (f257ap == 51) {
                        if (f258aq == 1) {
                            f403v = true;
                            m70a(0, 0, true);
                        } else {
                            f403v = false;
                        }
                    }
                    m110e(5);
                } else if (i == 2) {
                    f336d.m312a(AbstractRunnableC0012m.f611a, 1, 0, C0009j.f601a >> 1, C0009j.f602b >> 1, 0, 0, 0);
                }
                break;
            case 4:
                m122h(i);
                break;
            case 5:
                if (i == 0) {
                    m95b(-1, -1, false);
                }
                if (i == 1 && m83a(16416, false)) {
                    m110e(6);
                }
                if (i == 2) {
                    if (f336d != null) {
                        f336d.m312a(AbstractRunnableC0012m.f611a, 0, 0, C0009j.f601a >> 1, C0009j.f602b >> 1, 0, 0, 0);
                    }
                    if ((System.currentTimeMillis() & 512) != 0) {
                        m69a(0, 0, AbstractRunnableC0012m.m366c(63), AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() - 58, 3);
                    }
                }
                break;
            case 6:
                if (i == 0) {
                    if (!RunnableC0002c.m22a()) {
                        m72a(0, f380n, 11);
                    } else if (f265ax == 0) {
                        m72a(0, f371k, 11);
                    } else if (f265ax == 2) {
                        m72a(0, f374l, 11);
                    } else if (f265ax == 1) {
                        m72a(0, f377m, 11);
                    }
                    if (!m97b()) {
                        m71a(92, true);
                    }
                    if ((f399u & 1) == 0) {
                        m71a(154, true);
                    }
                    m95b(-1, 39, false);
                    f161A = false;
                    f253al = 0;
                    f252ak = 1;
                    f225aJ = 1;
                    f267b = 0L;
                    f172E = true;
                    m41C();
                }
                if (i == 3) {
                    f357g[0] = f245ad;
                }
                if (i == 1) {
                    if (m107d(5)) {
                        f189P = 10;
                        f191R = 10;
                        f399u = 127;
                    }
                    if (f397t) {
                        f397t = false;
                        f267b = 0L;
                        f225aJ = 1;
                        if (f257ap == 64 && f258aq == 1) {
                            m66a(0);
                            AbstractRunnableC0012m.m392k();
                            break;
                        } else if (f257ap == 88 && f258aq == 1) {
                            m110e(25);
                            m141v();
                            f189P = 0;
                            break;
                        }
                    } else {
                        m135p();
                        if (m83a(49184, false)) {
                            if ((f365i[f245ad] & 268435455) == 69) {
                                if (m97b() || m107d(5)) {
                                    f249ah = 2;
                                    m103c(88, 0, true);
                                } else {
                                    f249ah = 4;
                                    f199Z = 25;
                                    f189P = 0;
                                    f191R = 0;
                                }
                            } else if ((f365i[f245ad] & 268435455) == 73) {
                                f249ah = 4;
                                f199Z = 7;
                                f242aa = 6;
                                f357g[2] = 0;
                            } else if ((f365i[f245ad] & 268435455) == 74) {
                                f249ah = 4;
                                f199Z = 15;
                                f242aa = 6;
                            } else if ((f365i[f245ad] & 268435455) == 76) {
                                f249ah = 4;
                                f199Z = 14;
                            } else if ((f365i[f245ad] & 268435455) == 92) {
                                f249ah = 4;
                                f199Z = 10;
                            } else if ((f365i[f245ad] & 268435455) == 78) {
                                f249ah = 2;
                                m103c(64, 0, true);
                            } else if ((f365i[f245ad] & 268435455) == 70) {
                                f249ah = 4;
                                f199Z = 20;
                                RunnableC0002c.m12a(AbstractRunnableC0012m.m366c(61), 0);
                                m66a(0);
                                m92b(0);
                            } else if ((f365i[f245ad] & 268435455) == 154) {
                                f249ah = 4;
                                f199Z = 21;
                            }
                        }
                    }
                    m100b(true);
                    if (i == 2) {
                        m42D();
                        if (!f394s) {
                            f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                            f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                            f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(68), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0007h.f513G + 10, 3);
                            m75a(AbstractRunnableC0012m.f611a, InterfaceC0007h.f512F + (InterfaceC0007h.f519g_ >> 1));
                            f325c.m312a(AbstractRunnableC0012m.f611a, 1, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                            AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                        }
                    }
                } else if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    m42D();
                    if (!f394s) {
                        f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                        f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(68), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0007h.f513G + 10, 3);
                        m75a(AbstractRunnableC0012m.f611a, InterfaceC0007h.f512F + (InterfaceC0007h.f519g_ >> 1));
                        f325c.m312a(AbstractRunnableC0012m.f611a, 1, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                        AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    }
                }
                break;
            case 7:
                if (i == 0) {
                    f217aA = 0;
                    m95b(41, 39, false);
                    f172E = true;
                }
                if (i == 3) {
                    m139t();
                }
                if (i == 1) {
                    int i3 = (f242aa == 11 || f191R <= 0) ? 1 : 2;
                    if (f397t) {
                        f397t = false;
                        f267b = 0L;
                        f225aJ = 1;
                        if (f257ap == 88 && f258aq == 1) {
                            m141v();
                            m139t();
                            String strM366c2 = AbstractRunnableC0012m.m366c(89);
                            f256ao = 0;
                            f257ap = -1;
                            f270b = strM366c2;
                            f326c = f276b[0].m305a(f270b, InterfaceC0007h.f514H - 20);
                            f276b[0].m309a(f326c);
                            f259ar = C0008i.m295c();
                            f172E = true;
                            f394s = true;
                            f217aA = 0;
                        }
                    } else {
                        if (m83a(1028, false)) {
                            int i4 = f217aA - 1;
                            f217aA = i4;
                            if (i4 < 0) {
                                f217aA = i3;
                            }
                            f172E = true;
                        }
                        if (m83a(2304, false)) {
                            int i5 = f217aA + 1;
                            f217aA = i5;
                            if (i5 > i3) {
                                f217aA = 0;
                            }
                            f172E = true;
                        }
                        if (m83a(65536, false)) {
                            f249ah = 4;
                            int i6 = f242aa;
                            f199Z = i6;
                            if (i6 == 6 && f403v && !m116f(0)) {
                                m70a(0, 0, true);
                            }
                        }
                        switch (f217aA) {
                            case 0:
                                if (m83a(8256, false) || m83a(4112, false) || m83a(32768, false)) {
                                    f172E = true;
                                    m66a(0);
                                    boolean z = !f403v;
                                    f403v = z;
                                    if (z) {
                                        m70a(1, 11, false);
                                    }
                                }
                                break;
                            case 1:
                                if (m83a(8256, false) || m83a(4112, false) || m83a(32768, false)) {
                                    f172E = true;
                                    f406w = !f406w;
                                    m125i(300);
                                    m139t();
                                }
                                break;
                            case 2:
                                if (m83a(49184, false)) {
                                    f172E = true;
                                    f249ah = 2;
                                    m103c(88, 0, true);
                                }
                                break;
                        }
                        m100b(true);
                    }
                }
                if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    m42D();
                    if (!f394s) {
                        f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                        f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                        f276b[0].m324c(0);
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(73), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0007h.f513G + 10, 3);
                        f276b[0].m324c(4);
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(52), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0001b.f6a[0], 3);
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(87), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0001b.f6a[1], 3);
                        int i7 = (f242aa == 11 || f191R <= 0) ? 1 : 2;
                        for (int i8 = 0; i8 <= i7; i8++) {
                            String strM366c3 = null;
                            if (i8 == 0) {
                                strM366c3 = new StringBuffer().append("<  ").append(f403v ? AbstractRunnableC0012m.m366c(59) : AbstractRunnableC0012m.m366c(60)).append("  >").toString();
                            } else if (i8 == 1) {
                                strM366c3 = new StringBuffer().append("<  ").append(f406w ? AbstractRunnableC0012m.m366c(59) : AbstractRunnableC0012m.m366c(60)).append("  >").toString();
                            } else if (i8 == 2) {
                                strM366c3 = AbstractRunnableC0012m.m366c(86);
                                if (f242aa == 11) {
                                    AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                                }
                            }
                            f276b[0].m324c(0);
                            if (i8 == f217aA) {
                                f276b[0].m324c(1);
                            }
                            f276b[0].m313a(AbstractRunnableC0012m.f611a, strM366c3, AbstractRunnableC0012m.m353b() >> 1, InterfaceC0001b.f7b[i8], 3);
                            break;
                        }
                        AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    }
                }
                break;
            case 8:
            case 9:
            case 12:
            case 16:
            case 17:
            default:
                new StringBuffer().append("State [").append(f180K).append("] is undefined.");
                break;
            case 10:
                if (i == 0) {
                    m95b(41, 39, false);
                    f225aJ = 1;
                    f267b = 0L;
                    f254am = m113f(f189P);
                    f357g[8] = m117g(f189P);
                    f255an = m113f(f191R);
                    m136q();
                    f172E = true;
                }
                if (i == 1) {
                    m137r();
                    if (m83a(49184, false) && f391r) {
                        f189P = m108e(f245ad);
                        f249ah = 4;
                        f199Z = 22;
                    }
                    if (m83a(65536, false)) {
                        m110e(6);
                    }
                    m100b(true);
                }
                if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    m42D();
                    m138s();
                    AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                }
                break;
            case 11:
                if (i == 0) {
                    m72a(5, f383o, 11);
                    m95b(41, 39, false);
                    f225aJ = 1;
                    f267b = 0L;
                    m66a(0);
                    m92b(0);
                    f346e = true;
                    f172E = true;
                }
                if (i == 3) {
                    if (f199Z == 13) {
                        f357g[5] = 0;
                    } else {
                        f357g[5] = f245ad;
                    }
                    f346e = false;
                }
                if (i == 1) {
                    if (f397t) {
                        f397t = false;
                        f267b = 0L;
                        f225aJ = 1;
                        if (f257ap == 95 && f258aq == 1) {
                            f198Y = 2;
                            f199Z = 6;
                            f207a = false;
                            m110e(4);
                            break;
                        } else if (f257ap == 226 && f258aq == 1) {
                            m49K();
                            m110e(13);
                            break;
                        } else if (f257ap == 64 && f258aq == 1) {
                            m66a(0);
                            AbstractRunnableC0012m.m392k();
                            break;
                        }
                    } else {
                        if (f225aJ == 0) {
                            m135p();
                            if (m83a(49184, false)) {
                                if ((f365i[f245ad] & 268435455) == 93) {
                                    f249ah = 4;
                                    f199Z = 13;
                                    m102c(-1);
                                } else if ((f365i[f245ad] & 268435455) == 94) {
                                    f249ah = 2;
                                    m103c(226, 0, true);
                                } else if ((f365i[f245ad] & 268435455) == 73) {
                                    f249ah = 4;
                                    f199Z = 7;
                                    f242aa = 11;
                                } else if ((f365i[f245ad] & 268435455) == 74) {
                                    f249ah = 4;
                                    f199Z = 15;
                                    f242aa = 11;
                                } else if ((f365i[f245ad] & 268435455) == 68) {
                                    f249ah = 2;
                                    m103c(95, 0, true);
                                } else if ((f365i[f245ad] & 268435455) == 78) {
                                    f249ah = 2;
                                    m103c(64, 0, true);
                                }
                            } else if (m83a(65536, false)) {
                                f249ah = 4;
                                f199Z = 13;
                            }
                        }
                        m100b(true);
                    }
                    if (i == 2) {
                        m142w();
                        if (!f394s) {
                            int iM353b = (int) ((((long) AbstractRunnableC0012m.m353b()) * f267b) / 300);
                            f250ai = (AbstractRunnableC0012m.m353b() - iM353b) >> 1;
                            f251aj = iM353b;
                            AbstractRunnableC0012m.m346a(f250ai, 0, f251aj, AbstractRunnableC0012m.m362c());
                            m119g(-2130706433);
                            m111e(InterfaceC0007h.f520h_, InterfaceC0007h.f512F, InterfaceC0007h.f518f_, InterfaceC0007h.f519g_);
                            AbstractRunnableC0012m.m375d(-1);
                            AbstractRunnableC0012m.m376d(InterfaceC0007h.f520h_, InterfaceC0007h.f512F, InterfaceC0007h.f518f_, InterfaceC0007h.f519g_);
                            f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                            f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                            f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(90), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0007h.f513G + 10, 3);
                            m75a(AbstractRunnableC0012m.f611a, InterfaceC0007h.f512F + (InterfaceC0007h.f519g_ >> 1));
                            AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                        }
                    }
                } else if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    m142w();
                    if (!f394s) {
                        int iM353b2 = (int) ((((long) AbstractRunnableC0012m.m353b()) * f267b) / 300);
                        f250ai = (AbstractRunnableC0012m.m353b() - iM353b2) >> 1;
                        f251aj = iM353b2;
                        AbstractRunnableC0012m.m346a(f250ai, 0, f251aj, AbstractRunnableC0012m.m362c());
                        m119g(-2130706433);
                        m111e(InterfaceC0007h.f520h_, InterfaceC0007h.f512F, InterfaceC0007h.f518f_, InterfaceC0007h.f519g_);
                        AbstractRunnableC0012m.m375d(-1);
                        AbstractRunnableC0012m.m376d(InterfaceC0007h.f520h_, InterfaceC0007h.f512F, InterfaceC0007h.f518f_, InterfaceC0007h.f519g_);
                        f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                        f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(90), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0007h.f513G + 10, 3);
                        m75a(AbstractRunnableC0012m.f611a, InterfaceC0007h.f512F + (InterfaceC0007h.f519g_ >> 1));
                        AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    }
                }
                break;
            case 13:
                if (i == 0) {
                    f336d = null;
                    m95b(-2, -1, false);
                    m66a(0);
                    m92b(0);
                    f198Y = 5;
                }
                if (i == 1) {
                    if (f338d) {
                        m51M();
                    }
                    switch (f188O) {
                        case 0:
                            m77a(false);
                            break;
                        case 1:
                            f375m = f308bl >> 8;
                            f378n += m121h((f309bm >> 8) - f378n);
                            break;
                    }
                    if (!m82a(f402v) && !m98b(f402v)) {
                        f375m = m55a(f375m, f387q, f381o);
                    }
                    f378n = m55a(f378n, f390r, f384p);
                    RunnableC0006g.m263b(0, (f375m * f369k) / f362i, (f378n * f372l) / f366j);
                    RunnableC0006g.m263b(1, f375m, f378n);
                    f329c[0] = f375m << 8;
                    f329c[1] = f378n << 8;
                    f329c[2] = (f375m + f355g) << 8;
                    f329c[3] = (f378n + f358h) << 8;
                    f340d[0] = (f375m - ((f355g * 70) / 100)) << 8;
                    f340d[1] = (f378n - ((f355g * 70) / 100)) << 8;
                    f340d[2] = ((f375m + f355g) + ((f355g * 70) / 100)) << 8;
                    f340d[3] = ((f378n + f358h) + ((f355g * 70) / 100)) << 8;
                    m45G();
                    m44F();
                    if (f344e % 3 == 0) {
                        m132n();
                    }
                    if ((m83a(32768, false) || (AbstractRunnableC0012m.f647g && !f167C)) && !f338d) {
                        f167C = true;
                        f357g[5] = 0;
                        m110e(11);
                    }
                }
                if (i == 2) {
                    m142w();
                }
                break;
            case 14:
                if (i == 0) {
                    String string = new StringBuffer().append(AbstractRunnableC0012m.m366c(137)).append(AbstractRunnableC0012m.m366c(138)).toString();
                    f326c = string;
                    f326c = m65a(string, new String[]{AbstractRunnableC0012m.f612a.getAppProperty("MIDlet-Version")});
                    if (!RunnableC0002c.m22a() || f412y) {
                        f187N = false;
                    }
                    if (f187N) {
                        m95b(-1, 43, false);
                    } else {
                        m95b(41, -1, false);
                    }
                    f276b[1].m309a(f326c);
                    f224aI = C0008i.m295c();
                    f196W = AbstractRunnableC0012m.m362c() - 60;
                    f172E = true;
                    this.f418z = false;
                }
                if (i == 1) {
                    int i9 = 2;
                    if (m83a(65536, false) && !f187N) {
                        f249ah = 4;
                        f199Z = 6;
                        m70a(0, 0, true);
                    } else if (m83a(2304, true)) {
                        i9 = 4;
                    } else if (m83a(1028, true)) {
                        i9 = -2;
                    } else if (f187N && m83a(32768, false)) {
                        if (this.f418z) {
                            f187N = false;
                            f412y = true;
                            m139t();
                            f249ah = 4;
                            f199Z = 20;
                            RunnableC0002c.m12a(AbstractRunnableC0012m.m366c(61), 0);
                            m66a(0);
                            m92b(0);
                        }
                        this.f418z = true;
                    }
                    if (f196W + f224aI > 60) {
                        f196W -= i9;
                    } else {
                        f196W = AbstractRunnableC0012m.m362c() - 60;
                    }
                    m100b(true);
                }
                if (i == 2) {
                    if (f172E || AbstractRunnableC0012m.f647g) {
                        AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    }
                    m42D();
                    f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                    f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                    if (this.f418z) {
                        AbstractRunnableC0012m.m346a(0, 60, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c() - 120);
                        f326c = AbstractRunnableC0012m.m366c(228);
                        f326c = f276b[1].m305a(f326c, 220);
                        f276b[1].m309a(f326c);
                        f224aI = C0008i.m295c();
                        f276b[1].m324c(0);
                        f276b[1].m322b(AbstractRunnableC0012m.f611a, f326c, AbstractRunnableC0012m.m353b() >> 1, ((AbstractRunnableC0012m.m362c() - f224aI) >> 1) - 5, 3);
                        f326c = AbstractRunnableC0012m.m366c(229);
                        f326c = f276b[1].m305a(f326c, 220);
                        f276b[1].m309a(f326c);
                        f224aI = C0008i.m295c();
                        f276b[1].m324c(0);
                        f276b[1].m322b(AbstractRunnableC0012m.f611a, f326c, AbstractRunnableC0012m.m353b() >> 1, ((AbstractRunnableC0012m.m362c() + f224aI) >> 1) + 5, 3);
                        AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    } else {
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(76), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0007h.f513G + 10, 3);
                        AbstractRunnableC0012m.m346a(0, 60, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c() - 120);
                        f276b[1].m324c(0);
                        f276b[1].m313a(AbstractRunnableC0012m.f611a, f326c, AbstractRunnableC0012m.m353b() >> 1, f196W, 17);
                        AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    }
                }
                break;
            case 15:
                if (i == 0) {
                    f218aB = 0;
                    f219aC = 0;
                    m95b(41, 43, false);
                    f172E = true;
                }
                if (i == 1) {
                    if (m83a(65536, false)) {
                        m110e(f242aa);
                    }
                    if (m83a(4112, false)) {
                        int i10 = f218aB - 1;
                        f218aB = i10;
                        if (i10 < 0) {
                            f218aB = 3;
                        }
                        f172E = true;
                    }
                    if (m83a(8256, false) || m83a(49184, false)) {
                        int i11 = f218aB + 1;
                        f218aB = i11;
                        if (i11 > 3) {
                            f218aB = 0;
                        }
                        f172E = true;
                    }
                    f219aC = 0;
                    if (f218aB > 1) {
                        f219aC = 1;
                    }
                }
                if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    m42D();
                    f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                    f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                    f276b[0].m324c(0);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(74), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0007h.f513G + 10, 3);
                    f276b[0].m324c(4);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(f219aC + 185), AbstractRunnableC0012m.m353b() >> 1, 50, 3);
                    f276b[0].m324c(0);
                    f276b[0].m322b(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(f218aB + 187), AbstractRunnableC0012m.m353b() >> 1, 82, 17);
                    String string2 = new StringBuffer().append("( ").append(f218aB + 1).append(" / ").append(4).append(" )").toString();
                    f276b[0].m324c(4);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, string2, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() - 25, 17);
                }
                break;
            case 18:
                if (i == 0) {
                    m95b(47, 43, false);
                    f225aJ = 1;
                    f267b = 0L;
                    if (f335d <= f209a[f189P]) {
                        f260as = 10000;
                    } else {
                        f260as = (int) (10000 - (((f335d - f209a[f189P]) / 1000) * 100));
                    }
                    if (f260as < 2000) {
                        f260as = 2000;
                    }
                    if (((C0004e) C0004e.f425a).f455b[13] > 120) {
                        f262au = 5000;
                    } else if (((C0004e) C0004e.f425a).f455b[13] > 100 && ((C0004e) C0004e.f425a).f455b[13] <= 120) {
                        f262au = 4500;
                    } else if (((C0004e) C0004e.f425a).f455b[13] <= 90 || ((C0004e) C0004e.f425a).f455b[13] > 100) {
                        f262au = 4000 - ((((90 - ((C0004e) C0004e.f425a).f455b[13]) / 10) + 1) * 500);
                    } else {
                        f262au = 4000;
                    }
                    if (f262au < 0) {
                        f262au = 0;
                    }
                    int i12 = (f393s * 300) + (f396t * 200);
                    f261at = i12;
                    if (i12 > 10000 || m98b(f189P)) {
                        f261at = 10000;
                    }
                    int i13 = f260as + f261at + f262au;
                    f263av = i13;
                    if (i13 >= 17000) {
                        f264aw = 4;
                    } else if (f263av >= 10000 && f263av < 17000) {
                        f264aw = 3;
                    } else if (f263av < 5000 || f263av >= 10000) {
                        f264aw = 1;
                    } else {
                        f264aw = 2;
                    }
                    boolean z2 = false;
                    if (f264aw > f407w[f189P]) {
                        f407w[f189P] = f264aw;
                        z2 = true;
                    }
                    if (z2) {
                        m139t();
                    }
                    f172E = true;
                    f346e = true;
                    m70a(0, 10, false);
                }
                if (i == 3) {
                    f346e = false;
                    m66a(0);
                    m92b(0);
                }
                if (i == 1) {
                    if (f225aJ == 0) {
                        if (m83a(49184, false)) {
                            m145z();
                        } else if (m83a(65536, false)) {
                            f198Y = 2;
                            f199Z = 6;
                            m110e(4);
                        }
                    }
                    m100b(true);
                }
                if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    m142w();
                    int iM353b3 = (int) ((((long) AbstractRunnableC0012m.m353b()) * f267b) / 300);
                    AbstractRunnableC0012m.m346a((AbstractRunnableC0012m.m353b() - iM353b3) >> 1, 0, iM353b3, AbstractRunnableC0012m.m362c());
                    int i14 = (InterfaceC0007h.f515I - 60) + 10;
                    m119g(-1879048192);
                    m111e(InterfaceC0007h.f516J, InterfaceC0007h.f515I - 60, InterfaceC0007h.f514H, 120);
                    AbstractRunnableC0012m.m375d(-1);
                    AbstractRunnableC0012m.m376d(InterfaceC0007h.f516J, InterfaceC0007h.f515I - 60, InterfaceC0007h.f514H, 120);
                    AbstractRunnableC0012m.m360b(InterfaceC0007h.f516J, (InterfaceC0007h.f515I - 60) + 20, InterfaceC0007h.f516J + InterfaceC0007h.f514H, (InterfaceC0007h.f515I - 60) + 20);
                    f276b[0].m322b(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(157), AbstractRunnableC0012m.m353b() >> 1, i14, 3);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(158), InterfaceC0007h.f516J + 18, i14 + 20, 4);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(159), InterfaceC0007h.f516J + 18, i14 + 40, 4);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(160), InterfaceC0007h.f516J + 18, i14 + 60, 4);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(161), InterfaceC0007h.f516J + 18, i14 + 80, 4);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, m64a(new StringBuffer().append("").append(f260as).toString()), AbstractRunnableC0012m.m353b() - 40, i14 + 20, 8);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, m64a(new StringBuffer().append("").append(f261at).toString()), AbstractRunnableC0012m.m353b() - 40, i14 + 40, 8);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, m64a(new StringBuffer().append("").append(f262au).toString()), AbstractRunnableC0012m.m353b() - 40, i14 + 60, 8);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, m64a(new StringBuffer().append("").append(f263av).toString()), AbstractRunnableC0012m.m353b() - 40, i14 + 80, 8);
                    f276b[0].m324c(4);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, f213a[4 - f264aw], (AbstractRunnableC0012m.m353b() >> 1) + 100, i14 + 80, 4);
                }
                break;
            case 19:
                if (i == 0) {
                    m95b(41, 39, false);
                    f225aJ = 1;
                    f267b = 0L;
                    f346e = true;
                    f172E = true;
                    f249ah = 2;
                    String string3 = new StringBuffer().append(AbstractRunnableC0012m.m366c(162)).append(AbstractRunnableC0012m.m366c(226)).toString();
                    f256ao = 1;
                    f400u = true;
                    f257ap = -1;
                    f270b = string3;
                    f258aq = 1;
                    f326c = f276b[0].m305a(f270b, InterfaceC0007h.f514H - 20);
                    f276b[0].m309a(f326c);
                    f259ar = C0008i.m295c();
                    f172E = true;
                }
                if (i == 1) {
                    if (f397t) {
                        f397t = false;
                        f267b = 0L;
                        f225aJ = 1;
                        if (f258aq == 1) {
                            f346e = false;
                            m49K();
                            m110e(13);
                        } else if (f258aq == 0) {
                            f198Y = 2;
                            f199Z = 6;
                            m110e(4);
                        }
                    }
                    m100b(true);
                    if (i == 2) {
                        m142w();
                    }
                } else if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    m142w();
                }
                break;
            case 20:
                if (i == 0) {
                    m95b(-1, -1, false);
                    f172E = true;
                }
                if (i == 3) {
                    f357g[0] = f245ad;
                }
                if (i == 1) {
                    m143x();
                }
                if (i == 2) {
                    m144y();
                }
                break;
            case 21:
                m127j(i);
                break;
            case 22:
                if (i == 0) {
                    f326c = AbstractRunnableC0012m.m366c(f189P + 173);
                    f326c = f276b[0].m305a(f326c, 160);
                    f276b[0].m309a(f326c);
                    f224aI = C0008i.m295c();
                    m95b(-1, -1, false);
                    f196W = AbstractRunnableC0012m.m362c() - 60;
                    m41C();
                    f172E = true;
                }
                if (i == 1) {
                    int i15 = 1;
                    if (m83a(16416, false)) {
                        f249ah = 1;
                        f199Z = 13;
                        f198Y = 1;
                    } else if (m83a(2304, true)) {
                        i15 = 2;
                    } else if (m83a(1028, true)) {
                        i15 = -1;
                    }
                    if (f196W + f224aI > 60) {
                        f196W -= i15;
                    } else {
                        f196W = AbstractRunnableC0012m.m362c() - 60;
                    }
                    if (f224aI <= AbstractRunnableC0012m.m362c() - 120) {
                        f196W = AbstractRunnableC0012m.m362c() >> 1;
                    }
                    m100b(true);
                }
                if (i == 2) {
                    m42D();
                    f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                    f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(f386p[f189P]), (AbstractRunnableC0012m.m353b() >> 1) + 5, InterfaceC0007h.f513G + 10, 3);
                    AbstractRunnableC0012m.m346a(0, 60, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c() - 120);
                    f276b[0].m324c(5);
                    if (f224aI <= AbstractRunnableC0012m.m362c() - 120) {
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, f326c, AbstractRunnableC0012m.m353b() >> 1, f196W, 3);
                    } else {
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, f326c, AbstractRunnableC0012m.m353b() >> 1, f196W, 17);
                    }
                    AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    if (!f394s && (System.currentTimeMillis() & 512) != 0) {
                        m69a(0, 0, AbstractRunnableC0012m.m366c(63), AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() - 18, 3);
                    }
                }
                break;
            case 23:
                m130l(i);
                break;
            case 24:
                break;
            case 25:
                if (i == 0) {
                    m95b(-1, 44, false);
                    AbstractRunnableC0012m.m348a("/12");
                    f364i = AbstractRunnableC0012m.m352a(8);
                    m112e(3);
                    f292bM = AbstractRunnableC0012m.m353b();
                    f276b[1].m309a(AbstractRunnableC0012m.m366c(172));
                    f293bN = C0008i.m294b();
                }
                if (i == 1) {
                    f378n = 0;
                    f375m = 0;
                    if (f338d) {
                        m51M();
                    }
                    f292bM -= 2;
                    if ((!f338d && f292bM <= (-f293bN)) || m83a(32768, false)) {
                        m110e(22);
                    }
                }
                if (i == 3) {
                    m43E();
                }
                if (i == 2) {
                    AbstractRunnableC0012m.m375d(0);
                    AbstractRunnableC0012m.m368c(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    AbstractRunnableC0012m.m346a(0, 53, AbstractRunnableC0012m.m353b(), 202);
                    m53O();
                    AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    f325c.m312a(AbstractRunnableC0012m.f611a, 2, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                    f325c.m312a(AbstractRunnableC0012m.f611a, 3, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                    f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 5, 43, 0, 0, 0);
                    f276b[1].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(172), f292bM, 280, 20);
                }
                break;
            case 26:
                m129k(i);
                break;
            case 27:
                if (i == 0) {
                    m72a(0, f389q, 11);
                    m95b(-1, 39, false);
                    m41C();
                    this.f415aE = m56a(f200a);
                    if (this.f415aE >= 0) {
                        m139t();
                    }
                    f245ad = 0;
                    f225aJ = 1;
                    f267b = 0L;
                    f172E = true;
                    f164B = false;
                }
                if (i == 1) {
                    if (f397t) {
                        f397t = false;
                        f267b = 0L;
                        f225aJ = 1;
                        if (f257ap == 96 && f258aq == 1) {
                            f249ah = 1;
                            f199Z = 13;
                            f198Y = 1;
                            f164B = true;
                            break;
                        } else if (f257ap == 95 && f258aq == 1) {
                            m110e(6);
                            f161A = false;
                            m70a(0, 0, true);
                            f164B = true;
                            break;
                        }
                    } else if (!f164B) {
                        m135p();
                        if (m83a(49184, false)) {
                            if ((f365i[f245ad] & 268435455) == 218) {
                                f249ah = 4;
                                f199Z = 21;
                                f242aa = 27;
                                f164B = true;
                            } else if ((f365i[f245ad] & 268435455) == 219) {
                                f249ah = 2;
                                m103c(96, 0, true);
                            } else if ((f365i[f245ad] & 268435455) == 220) {
                                f249ah = 2;
                                m103c(95, 0, true);
                            }
                        }
                    }
                    m100b(true);
                    if (i == 2) {
                        m42D();
                        if (!f394s) {
                            m42D();
                            f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                            f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                            if (f185M) {
                                i2 = 209;
                            } else {
                                i2 = 208;
                            }
                            f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(i2), (AbstractRunnableC0012m.m353b() >> 1) + 10, (InterfaceC0007h.f513G + 10) - 1, 3);
                            f276b[0].m324c(5);
                            int i16 = InterfaceC0007h.f513G + 20 + 30;
                            f276b[0].m313a(AbstractRunnableC0012m.f611a, new StringBuffer().append(AbstractRunnableC0012m.m366c(210)).append("    ").append(m90b(f200a)).toString(), 20, i16, 6);
                            int i17 = i16 + 30;
                            if (f185M) {
                                strM366c = AbstractRunnableC0012m.m366c(227);
                            } else {
                                strM366c = AbstractRunnableC0012m.m366c(227);
                            }
                            f276b[0].m313a(AbstractRunnableC0012m.f611a, strM366c, 20, i17, 6);
                            m75a(AbstractRunnableC0012m.f611a, (InterfaceC0007h.f519g_ >> 1) + i17);
                            AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                        }
                    }
                } else if (i == 2 && (f172E || AbstractRunnableC0012m.f647g)) {
                    m42D();
                    if (!f394s) {
                        m42D();
                        f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                        f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                        if (f185M) {
                            i2 = 209;
                        } else {
                            i2 = 208;
                        }
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(i2), (AbstractRunnableC0012m.m353b() >> 1) + 10, (InterfaceC0007h.f513G + 10) - 1, 3);
                        f276b[0].m324c(5);
                        int i18 = InterfaceC0007h.f513G + 20 + 30;
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, new StringBuffer().append(AbstractRunnableC0012m.m366c(210)).append("    ").append(m90b(f200a)).toString(), 20, i18, 6);
                        int i19 = i18 + 30;
                        if (f185M || this.f415aE < 0) {
                            strM366c = AbstractRunnableC0012m.m366c(227);
                        } else {
                            strM366c = new StringBuffer().append(AbstractRunnableC0012m.m366c(211)).append("    ").append(AbstractRunnableC0012m.m366c(this.f415aE + 213)).toString();
                        }
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, strM366c, 20, i19, 6);
                        m75a(AbstractRunnableC0012m.f611a, (InterfaceC0007h.f519g_ >> 1) + i19);
                        AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    }
                }
                break;
            case 28:
                if (i == 0) {
                    m95b(-1, 44, true);
                    f294bO = 0;
                    f187N = false;
                }
                if (i == 1 && f187N) {
                    f272b = null;
                    f271b = null;
                    f295bP = -1;
                    m110e(14);
                }
                if (i == 2) {
                    switch (f294bO) {
                        case 0:
                            AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                            AbstractRunnableC0012m.f611a.setColor(0);
                            AbstractRunnableC0012m.f611a.fillRect(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                            if (f272b == null) {
                                f272b = Image.createImage(AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                            }
                            Graphics graphics = f272b.getGraphics();
                            f271b = graphics;
                            graphics.setColor(16711935);
                            f271b.fillRect(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                            f276b[1].m322b(f271b, f276b[1].m305a(AbstractRunnableC0012m.m366c(184), (AbstractRunnableC0012m.m353b() << 1) / 3), AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 3);
                            f175F = new int[AbstractRunnableC0012m.m353b() * AbstractRunnableC0012m.m362c()];
                            f272b.getRGB(f175F, 0, AbstractRunnableC0012m.m353b(), 0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                            f295bP = 0;
                            f187N = false;
                            f294bO++;
                        case 1:
                            m133n(f295bP);
                            f295bP++;
                            if (m83a(32768, false)) {
                                f295bP = 256;
                                f187N = true;
                            }
                            if (f295bP > 180) {
                                f295bP = 255;
                                f296bQ = 0;
                                f294bO++;
                            }
                            break;
                        case 2:
                            f296bQ++;
                            if (m83a(32768, false)) {
                                f187N = true;
                            }
                            if (f296bQ >= 20) {
                                f294bO++;
                                f295bP = 256;
                            }
                            m133n(f295bP);
                            break;
                        case 3:
                            AbstractRunnableC0012m.f611a.setColor(0);
                            AbstractRunnableC0012m.f611a.fillRect(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                            m133n(f295bP);
                            f295bP -= 2;
                            if (m83a(32768, false)) {
                                f295bP = -1;
                                f187N = true;
                            }
                            if (f295bP <= 0) {
                                f295bP = -1;
                                f296bQ = 0;
                                f294bO++;
                            }
                            break;
                        case 4:
                            f187N = true;
                            break;
                    }
                }
                break;
        }
        m47I();
    }

    /* JADX INFO: renamed from: f */
    private static boolean m116f(int i) {
        if (!f403v) {
            return false;
        }
        try {
            return RunnableC0006g.m265c(i);
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private static int m117g(int i) {
        for (int i2 = 0; i2 < f254am; i2++) {
            i -= f334c[i2].length;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    static void m118g() {
        f185M = true;
        f200a = 0L;
        if (f161A) {
            f198Y = 2;
            f199Z = 27;
            m110e(4);
        } else {
            m66a(0);
            m92b(0);
            m70a(0, 1, false);
            m110e(19);
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m119g(int i) {
        if (f404v == null) {
            f404v = new int[256];
        }
        if (f404v[0] != i) {
            for (int i2 = 0; i2 < f404v.length; i2++) {
                f404v[i2] = i;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m120g(int i) {
        return (f165B[i] & 1024) != 0;
    }

    /* JADX INFO: renamed from: h */
    private static int m121h(int i) {
        int i2;
        int i3 = 22;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = i == 0 ? 0 : -1;
        }
        int i4 = i * i2;
        if (i4 <= 44) {
            if (i4 >= 22) {
                i3 = 16;
            } else if (i4 >= 6) {
                i3 = ((i4 * 70) / 100) + 1;
            } else {
                i3 = i4 > 1 ? 1 : i4;
            }
        }
        return i3 * i2;
    }

    /* JADX INFO: renamed from: h */
    private void m122h(int i) {
        int iM371d;
        int i2;
        int i3;
        if (i == 0) {
            m95b(-1, -1, false);
            int i4 = f198Y;
            f379n = false;
            f376m = true;
            f196W = 0;
            f195V = i4;
            f297ba = 0;
            f203a = "";
            switch (f195V) {
                case 0:
                    f197X = 10;
                    break;
                case 1:
                    f197X = 100;
                    f196W = 0;
                    while (f196W <= 10) {
                        m43E();
                        f196W++;
                    }
                    f196W = 0;
                    break;
                case 2:
                    f197X = 10;
                    break;
            }
            f382o = true;
            f385p = true;
            f206a = null;
            f266az = 0;
            m66a(0);
            m92b(0);
            if (f195V == 1) {
                m41C();
            }
        }
        if (i == 3) {
            f198Y = 5;
            f206a = null;
        }
        if (i == 1) {
            m134o();
            if (f379n && (m83a(16416, false) || f198Y != 1)) {
                m81a();
                m102c(-1);
            }
        }
        if (i == 2 && f382o) {
            AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
            if (f385p) {
                m42D();
            }
            if (f382o) {
                int i5 = (f196W * 174) / f197X;
                int i6 = i5 > 174 ? 174 : i5;
                if (f325c == null) {
                    AbstractRunnableC0012m.m375d(16777215);
                    AbstractRunnableC0012m.m376d(InterfaceC0000a.f2a, InterfaceC0000a.f3b, 174, 16);
                    AbstractRunnableC0012m.m375d(9437184);
                    AbstractRunnableC0012m.m368c(InterfaceC0000a.f2a + 1, InterfaceC0000a.f3b + 1, i6 - 2, 14);
                    return;
                }
                if (f198Y == 1) {
                    m119g(-2130706433);
                    m111e(0, 53, AbstractRunnableC0012m.m353b(), 202);
                    AbstractRunnableC0012m.m346a(0, 53, AbstractRunnableC0012m.m353b(), 202);
                    switch (f266az) {
                        case 0:
                            if (m82a(f402v)) {
                                iM371d = AbstractRunnableC0012m.m371d(AbstractRunnableC0012m.m331a()) % 4;
                                i2 = 4;
                                i3 = 4;
                                if (f206a == null) {
                                    C0013n c0013n = new C0013n();
                                    f206a = c0013n;
                                    ((RunnableC0006g) c0013n).f509a = f212a[19];
                                }
                            } else {
                                iM371d = AbstractRunnableC0012m.m371d(AbstractRunnableC0012m.m331a()) % 4;
                                i2 = 0;
                                i3 = 0;
                                if (f206a == null) {
                                    C0013n c0013n2 = new C0013n();
                                    f206a = c0013n2;
                                    ((RunnableC0006g) c0013n2).f509a = f212a[0];
                                }
                            }
                            f206a.mo213a(this.f419z[i2 + iM371d], 0);
                            f326c = AbstractRunnableC0012m.m366c(this.f417y[i3 + iM371d]);
                            f326c = f276b[0].m305a(f326c, 220);
                            f276b[0].m309a(f326c);
                            f266az = 1;
                            break;
                        case 1:
                            if (f206a.m211a() == f206a.m283e() - 1) {
                                f266az = 0;
                            }
                            break;
                    }
                    f206a.m279c(InterfaceC0001b.f8i_, InterfaceC0001b.f9j_);
                    f206a.m285m();
                    f206a.m230b(AbstractRunnableC0012m.f622a_);
                    if (f206a.m278c() == 170) {
                        f212a[2].m320b(0, 179);
                        f212a[2].m312a(AbstractRunnableC0012m.f611a, 4, f344e % 4, InterfaceC0001b.f8i_, InterfaceC0001b.f9j_, 0, 0, 0);
                        f212a[3].m312a(AbstractRunnableC0012m.f611a, 4, f344e % 4, InterfaceC0001b.f8i_, InterfaceC0001b.f9j_, 0, 0, 0);
                    }
                    AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
                    f276b[0].m324c(4);
                    f276b[0].m322b(AbstractRunnableC0012m.f611a, f326c, AbstractRunnableC0012m.m353b() >> 1, InterfaceC0001b.f9j_ + 2, 17);
                    f325c.m312a(AbstractRunnableC0012m.f611a, 2, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                    f325c.m312a(AbstractRunnableC0012m.f611a, 3, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                    f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 5, 43, 0, 0, 0);
                    f276b[0].m324c(4);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(199), (AbstractRunnableC0012m.m353b() >> 1) + 5, 48, 3);
                }
                if (f195V != 0 && !f379n) {
                    f276b[1].m324c(1);
                    f276b[1].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(61), AbstractRunnableC0012m.m353b() >> 1, ((InterfaceC0000a.f3b - 16) - 10) + 2, 3);
                }
                if (f379n && f198Y == 1) {
                    f276b[0].m324c(5);
                    if (f344e % 10 >= 5) {
                        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(63), AbstractRunnableC0012m.m353b() >> 1, InterfaceC0000a.f3b, 3);
                        return;
                    }
                    return;
                }
                f325c.m312a(AbstractRunnableC0012m.f611a, 13, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                AbstractRunnableC0012m.m346a(InterfaceC0000a.f2a, InterfaceC0000a.f3b, i6, 16);
                f325c.m312a(AbstractRunnableC0012m.f611a, 14, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m123h(int i) {
        return (f165B[i] & 255) == 1;
    }

    /* JADX INFO: renamed from: i */
    private static int m124i(int i) {
        if (i < 0) {
            i = -i;
        }
        switch (i) {
            case -7:
            case 7:
                return 65536;
            case -6:
            case 6:
                return 32768;
            case -5:
            case 5:
                return 16384;
            case -4:
            case 4:
                return 8192;
            case -3:
            case 3:
                return 4096;
            case -2:
            case 2:
                return 2048;
            case -1:
            case 1:
                return 1024;
            case 35:
                return 524288;
            case 42:
                return 262144;
            case 48:
                return 1;
            case 49:
                return 2;
            case 50:
                return 4;
            case 51:
                return 8;
            case 52:
                return 16;
            case 53:
                return 32;
            case 54:
                return 64;
            case 55:
                return 128;
            case 56:
                return 256;
            case 57:
                return 512;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m125i(int i) {
        if (f406w) {
            if (f204a.vibrate(300)) {
                System.out.println("vibrate ok");
            } else {
                System.out.println("vibrate no");
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static boolean m126i(int i) {
        return (f165B[i] & 255) == 2;
    }

    /* JADX INFO: renamed from: j */
    private void m127j(int i) {
        if (i == 0) {
            m95b(41, 39, false);
            f225aJ = 1;
            f267b = 0L;
            f161A = true;
            for (int i2 = 0; i2 <= f191R; i2++) {
                if (f216a[i2][0] >= 0) {
                    if (((f399u >> ((f216a[i2][0] - 17) / 3)) & 1) == 0) {
                        break;
                    } else {
                        f192S = i2;
                    }
                }
            }
            if (f190Q < 0) {
                f190Q = 0;
            }
            if (f192S < f190Q) {
                f190Q = f192S;
            }
            f254am = m113f(f190Q);
            f357g[9] = m117g(f190Q);
            f255an = m113f(f192S);
            m136q();
            f172E = true;
        }
        if (i == 1) {
            m137r();
            if (m83a(49184, false) && f391r) {
                f190Q = m108e(f245ad);
                f249ah = 4;
                f199Z = 26;
            }
            if (m83a(65536, false)) {
                m110e(6);
                f161A = false;
                if (f242aa == 27) {
                    m70a(0, 0, true);
                }
            }
            m100b(true);
        }
        if (i == 2) {
            if (f172E || AbstractRunnableC0012m.f647g) {
                m42D();
                m138s();
                AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m128j(int i) {
        return (f165B[i] & 255) == 3;
    }

    /* JADX INFO: renamed from: k */
    private static void m129k(int i) {
        if (i == 0) {
            m95b(41, 43, false);
            m41C();
            f172E = true;
        }
        if (i == 1) {
            if (m83a(49184, false)) {
                f249ah = 1;
                f199Z = 13;
                f198Y = 1;
            } else if (m83a(65536, false)) {
                f249ah = 4;
                f199Z = 21;
            }
            m100b(true);
        }
        if (i == 2) {
            if (f172E || AbstractRunnableC0012m.f647g) {
                m42D();
                f325c.m312a(AbstractRunnableC0012m.f611a, 0, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
                f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 7, 7, 0, 0, 0);
                f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(f386p[f190Q]), AbstractRunnableC0012m.m353b() >> 1, (InterfaceC0007h.f513G + 10) - 1, 3);
                int i2 = InterfaceC0007h.f513G + 20 + 30;
                f276b[0].m324c(4);
                f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(212), AbstractRunnableC0012m.m353b() >> 1, i2, 3);
                int i3 = i2 + 30;
                for (int i4 = 0; i4 < 5; i4++) {
                    f276b[0].m324c(1);
                    f325c.m312a(AbstractRunnableC0012m.f611a, 20, 0, AbstractRunnableC0012m.m353b() >> 1, i3 - 13, 0, 0, 0);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(i4 + 213), (AbstractRunnableC0012m.m353b() >> 1) - 50, i3, 3);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, m90b(f410x[(f190Q * 5) + i4]), (AbstractRunnableC0012m.m353b() >> 1) + 30, i3, 3);
                    i3 += 40;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: l */
    private void m130l(int i) {
        if (i == 0) {
            m41C();
            m95b(-1, 43, false);
            if (f268b == null) {
                f268b = new C0004e();
                if (f212a[6] != null) {
                    ((RunnableC0006g) f268b).f509a = f212a[6];
                }
            }
            f221aF = 3;
            f172E = true;
        }
        if (i == 3) {
            f268b = null;
        }
        if (i == 1) {
            if (m83a(49184, false) && f221aF != 2 && f221aF != 4) {
                for (int i2 = 0; i2 < f216a[f189P].length; i2++) {
                    if (((f399u >> ((f216a[f189P][i2] - 17) / 3)) & 1) == 0) {
                        f399u |= 1 << ((f216a[f189P][i2] - 17) / 3);
                    }
                }
                f221aF = 2;
                return;
            }
            switch (f221aF) {
                case 0:
                    if (f268b.m211a() == f268b.m283e() - 1) {
                        f268b.mo213a(f222aG, 0);
                        f221aF = 1;
                        for (int i3 = 0; i3 < f162A.length; i3++) {
                            f223aH = (i3 * 24) + 48;
                            if (f162A[i3] != f222aG) {
                            }
                        }
                    }
                    f268b.m230b(AbstractRunnableC0012m.f622a_);
                    m100b(true);
                    break;
                case 1:
                    if (f268b.m211a() == f268b.m283e() - 1) {
                        f399u |= 1 << (((f222aG - 1) - 17) / 3);
                        f221aF = 3;
                    }
                    f268b.m230b(AbstractRunnableC0012m.f622a_);
                    m100b(true);
                    break;
                case 2:
                    if (m83a(49184, false)) {
                        if (f399u == 1) {
                            f326c = AbstractRunnableC0012m.m366c(204);
                            f326c = f276b[0].m305a(f326c, 160);
                        } else {
                            f326c = AbstractRunnableC0012m.m366c(225);
                            f326c = f276b[0].m305a(f326c, 160);
                        }
                        f221aF = 4;
                    }
                    f268b.m230b(AbstractRunnableC0012m.f622a_);
                    m100b(true);
                    break;
                case 3:
                    for (int i4 = 0; i4 < f216a[f189P].length; i4++) {
                        if (((f399u >> ((f216a[f189P][i4] - 17) / 3)) & 1) == 0) {
                            f221aF = 0;
                            f268b.mo213a(f216a[f189P][i4], 0);
                            f222aG = f216a[f189P][i4] + 1;
                        }
                        break;
                    }
                    f221aF = 2;
                    f268b.m230b(AbstractRunnableC0012m.f622a_);
                    m100b(true);
                    break;
                case 4:
                    if (m83a(49184, false)) {
                        m145z();
                    }
                    f268b.m230b(AbstractRunnableC0012m.f622a_);
                    m100b(true);
                    break;
                default:
                    f268b.m230b(AbstractRunnableC0012m.f622a_);
                    m100b(true);
                    break;
            }
            return;
        }
        if (i == 2) {
            m42D();
            m119g(-2130706433);
            m111e(0, 53, AbstractRunnableC0012m.m353b(), 202);
            f325c.m312a(AbstractRunnableC0012m.f611a, 2, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
            f325c.m312a(AbstractRunnableC0012m.f611a, 3, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
            f269b.m312a(AbstractRunnableC0012m.f611a, 12, 0, 5, 43, 0, 0, 0);
            f276b[0].m324c(4);
            f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(200), AbstractRunnableC0012m.m353b() >> 1, 48, 3);
            if (f221aF != 4) {
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 < f162A.length) {
                        int i7 = (i6 * 24) + 48;
                        if (((f399u >> i6) & 1) == 0) {
                            f212a[6].m312a(AbstractRunnableC0012m.f611a, 38, 0, i7, 220, 0, 0, 0);
                        } else {
                            f212a[6].m312a(AbstractRunnableC0012m.f611a, f162A[i6], 0, i7, 220, 0, 0, 0);
                        }
                        i5 = i6 + 1;
                    }
                }
            }
            if (f221aF == 0) {
                f268b.m279c(AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1);
                f268b.m285m();
                return;
            }
            if (f221aF == 1) {
                f268b.m279c(f223aH, 220);
                f268b.m285m();
            } else if (f221aF == 2) {
                f276b[0].m322b(AbstractRunnableC0012m.f611a, new StringBuffer().append(AbstractRunnableC0012m.m366c(201)).append(f216a[f189P].length > 1 ? AbstractRunnableC0012m.m366c(203) : AbstractRunnableC0012m.m366c(202)).toString(), AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 3);
            } else {
                if (f221aF != 4 || f326c == null) {
                    return;
                }
                f276b[0].m322b(AbstractRunnableC0012m.f611a, f326c, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 3);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m131m(int i) {
        for (int i2 = 0; i2 < f405w - 1; i2++) {
            for (int i3 = i2; i3 < f405w; i3++) {
                if (f210a[i2].f463g > f210a[i3].f463g) {
                    C0004e c0004e = f210a[i2];
                    f210a[i2] = f210a[i3];
                    f210a[i3] = c0004e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m132n() {
        try {
            if (RunnableC0006g.m265c(0)) {
                return;
            }
            if (f403v) {
                for (int i = 1; i <= InterfaceC0005f.f479a; i++) {
                    if (m116f(i)) {
                        RunnableC0006g.m271g(i);
                    }
                }
            }
            if (f207a) {
                m70a(0, 3, false);
                return;
            }
            if (m82a(f402v)) {
                m70a(0, 8, false);
                return;
            }
            if (m98b(f402v)) {
                if (m123h(f402v)) {
                    m70a(0, 3, false);
                    return;
                } else {
                    m70a(0, 9, false);
                    return;
                }
            }
            if ((f165B[f402v] & 255) == 0) {
                m70a(0, 4, false);
                return;
            }
            if (m123h(f402v)) {
                m70a(0, 6, false);
            } else if (m126i(f402v)) {
                m70a(0, 7, false);
            } else if (m128j(f402v)) {
                m70a(0, 5, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m133n(int i) {
        int[] iArr = f175F;
        int i2 = (((i * 100) / 256) * 255) / 100;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] & 16777215;
            if (iArr[i3] != 16711935) {
                iArr[i3] = iArr[i3] | (i2 << 24);
            }
        }
        AbstractRunnableC0012m.f611a.drawRGB(f175F, 0, AbstractRunnableC0012m.m353b(), 0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c(), true);
    }

    /* JADX INFO: renamed from: o */
    private void m134o() {
        int i = 2;
        if (f195V == 0) {
            switch (f196W) {
                case 0:
                    f203a = "COMMON TEXT --";
                    try {
                        AbstractRunnableC0012m.m349a("/EN", 0);
                    } catch (Exception e) {
                    }
                    break;
                case 1:
                    f203a = "OPEN FONT PACK --";
                    AbstractRunnableC0012m.m348a("/2");
                    C0008i.m288a(2, 100);
                    break;
                case 2:
                    f203a = "FONTS --";
                    f276b[0] = m59a(0, 7, false, false);
                    f276b[1] = f276b[0];
                    f276b[0].m319b(2);
                    break;
                case 3:
                    f203a = "CHARACTER MAPPING TABLE --";
                    short[] sArr = (short[]) AbstractRunnableC0012m.m341a(1);
                    f276b[1].m316a(sArr);
                    f276b[0].m316a(sArr);
                    break;
                case 4:
                    f203a = "CLOSE FONT PACK --";
                    AbstractRunnableC0012m.m393l();
                    break;
                case 5:
                    f203a = "LOAD SPLASH IMAGE --";
                    AbstractRunnableC0012m.m348a("/5");
                    f336d = m59a(1, 3, true, true);
                    f269b = m59a(2, 1, true, true);
                    AbstractRunnableC0012m.m393l();
                    break;
                case 6:
                    m40B();
                    AbstractRunnableC0012m.m348a("/7");
                    f212a[0] = m61a(f212a[0], 0, 1, false, false);
                    f212a[2] = m61a(f212a[2], 2, 1, false, false);
                    f212a[3] = m61a(f212a[3], 3, 1, false, false);
                    break;
                case 7:
                    f212a[19] = m61a(f212a[19], 19, 1, false, false);
                    break;
                case 8:
                    f212a[30] = m61a(f212a[30], 30, 1, false, false);
                    AbstractRunnableC0012m.m393l();
                    break;
                case 9:
                    f203a = "-- LOAD SOUND ENGINE --";
                    try {
                        if (f214a == null || f278b == null) {
                            AbstractRunnableC0012m.m348a("/4");
                            f214a = m87a(AbstractRunnableC0012m.m352a(0));
                            f278b = m87a(AbstractRunnableC0012m.m352a(1));
                            AbstractRunnableC0012m.m393l();
                        }
                        System.out.println(new StringBuffer().append("s_snd_maxNbSoundSlot : ").append(RunnableC0006g.f480F).toString());
                        AbstractRunnableC0012m.m361b("/0");
                        RunnableC0006g.m267e(23);
                        RunnableC0006g.m273h(f353f[1]);
                        System.out.println(new StringBuffer().append("s_snd_maxNbSoundSlot : ").append(RunnableC0006g.f480F).toString());
                        AbstractRunnableC0012m.m348a("/3");
                        for (int i2 = 0; i2 < 23; i2++) {
                            f215a[i2] = AbstractRunnableC0012m.m352a(i2);
                            f348e[i2] = AbstractRunnableC0012m.f639d_;
                            if (i2 >= 11) {
                                f215a[i2] = m86a(f215a[i2]);
                                f348e[i2] = 0;
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    break;
            }
        } else if (f195V == 1) {
            f402v = f189P;
            if (f161A) {
                f402v = f190Q;
            }
            if (f196W == 1) {
                m40B();
                f323c = 1134696595468L;
                if (!m82a(f402v) && !m98b(f402v)) {
                    f323c |= 549755813888L;
                }
                if (!f161A && f191R < f189P) {
                    f191R = f189P;
                }
                m139t();
            }
            if (f196W == 2) {
                C0008i[] c0008iArr = new C0008i[2];
                f331c = c0008iArr;
                c0008iArr[0] = new C0008i();
                f331c[1] = new C0008i();
            } else if (f196W == 3) {
                f203a = "Open TileSet PACK --";
                AbstractRunnableC0012m.m348a(new StringBuffer().append("/").append((f165B[f402v] & 255) + f228aM).toString());
            } else if (f196W == 4) {
                f331c[0] = m59a(0, m120g(f402v) ? 3 : m82a(f402v) ? 2 : 1, true, true);
                f331c[0].m324c(m82a(f402v) ? 1 : 0);
            } else if (f196W == 5) {
                f331c[1] = m59a(1, m120g(f402v) ? 3 : m82a(f402v) ? 2 : 1, true, true);
                f331c[1].m324c(m82a(f402v) ? 1 : 0);
            } else if (f196W == 6) {
                f203a = "Close TileSet PACK --";
                AbstractRunnableC0012m.m393l();
            } else if (f196W == 7) {
                f203a = "OPEN Level PACK --";
                AbstractRunnableC0012m.m348a(new StringBuffer().append("/").append(f227aL + f402v).toString());
                C0004e.f443p = 0;
            } else if (f196W == 8) {
                f355g = AbstractRunnableC0012m.m353b();
                f358h = AbstractRunnableC0012m.m362c();
                f211a = new RunnableC0006g[3];
                RunnableC0006g.m250a(f355g, f358h, 20, 20);
                f211a[0] = new RunnableC0006g();
                byte[] bArrM352a = AbstractRunnableC0012m.m352a(0);
                f274b = bArrM352a;
                byte[] bArrM352a2 = AbstractRunnableC0012m.m352a(1);
                f328c = bArrM352a2;
                byte[] bArrM352a3 = AbstractRunnableC0012m.m352a(2);
                f339d = bArrM352a3;
                RunnableC0006g.m256a(0, bArrM352a, bArrM352a2, bArrM352a3, f331c[0], true, 16, 0, 0);
                RunnableC0006g.m263b(0, 0, 0);
                f211a[1] = new RunnableC0006g();
                byte[] bArrM352a4 = AbstractRunnableC0012m.m352a(3);
                f347e = bArrM352a4;
                byte[] bArrM352a5 = AbstractRunnableC0012m.m352a(4);
                f352f = bArrM352a5;
                byte[] bArrM352a6 = AbstractRunnableC0012m.m352a(5);
                f356g = bArrM352a6;
                RunnableC0006g.m256a(1, bArrM352a4, bArrM352a5, bArrM352a6, f331c[1], false, 16, 0, 0);
                RunnableC0006g.m263b(1, 0, 0);
            } else if (f196W == 9) {
                f360h = AbstractRunnableC0012m.m352a(6);
                f369k = RunnableC0006g.m270g(0) / 20;
                f372l = RunnableC0006g.m272h(0) / 20;
                f362i = RunnableC0006g.m270g(1) / 20;
                f366j = RunnableC0006g.m272h(1) / 20;
                f381o = (f362i * 20) - f355g;
                f384p = (f366j * 20) - f358h;
            } else if (f196W == 10) {
                byte[] bArrM352a7 = AbstractRunnableC0012m.m352a(7);
                f208a = bArrM352a7;
                m78a(bArrM352a7);
                m131m(0);
                m46H();
            } else if (f196W == 11) {
                f364i = AbstractRunnableC0012m.m352a(8);
            } else if (f196W == 12) {
                f203a = "CLOSE Level PACK --";
                AbstractRunnableC0012m.m393l();
            } else if (f196W == 13) {
                f203a = "OPEN SPRITES PACK --";
                AbstractRunnableC0012m.m348a("/7");
                f226aK = 0;
            } else if (f196W >= 20 && f196W < 84) {
                f203a = new StringBuffer().append("SPRITES --").append(f226aK).toString();
                if ((f323c & (1 << f226aK)) != 0 && f226aK < 41) {
                    System.out.println(new StringBuffer().append("_spr_loadingID = ").append(f226aK).toString());
                    if (f226aK == 6 || f226aK == 15 || f226aK == 16 || f226aK == 12 || f226aK == 7 || f226aK == 14 || f226aK == 26 || f226aK == 1 || f226aK == 39 || f226aK == 40) {
                        f212a[f226aK] = m61a(f212a[f226aK], f226aK, 1, false, false);
                    } else if (f226aK == 18) {
                        f212a[f226aK] = m60a(f212a[f226aK], f226aK, 1, 1, 117, true, true);
                    } else if (f226aK == 29) {
                        f212a[f226aK] = m60a(f212a[f226aK], f226aK, 1, 1, 178, true, true);
                    } else if (f226aK == 13) {
                        f212a[f226aK] = m60a(f212a[f226aK], f226aK, 1, 1, 200, true, true);
                    } else if (f226aK == 38) {
                        if (m126i(f402v)) {
                            i = 1;
                        } else if (!m128j(f402v)) {
                            i = 0;
                        }
                        f212a[f226aK] = m61a(f212a[f226aK], f226aK, 1 << i, true, true);
                        f212a[f226aK].m324c(i);
                    } else if (f226aK == 1 || f226aK == 11 || f226aK == 23 || f226aK == 32 || f226aK == 33 || f226aK == 5) {
                        f212a[f226aK] = m61a(f212a[f226aK], f226aK, m82a(f402v) ? 2 : 1, true, true);
                        f212a[f226aK].m324c(m82a(f402v) ? 1 : 0);
                    } else if (f226aK == 4) {
                        if (m82a(f402v) || m120g(f402v)) {
                            f212a[f226aK] = m61a(f212a[f226aK], f226aK, 1, false, false);
                        } else {
                            f212a[f226aK] = m61a(f212a[f226aK], f226aK, 1, true, true);
                        }
                    } else if (f226aK != 0 && f226aK != 19 && f226aK != 2 && f226aK != 3) {
                        f212a[f226aK] = m61a(f212a[f226aK], f226aK, 1, true, true);
                    }
                } else if (f226aK != 0 && f226aK != 19) {
                    f212a[f226aK] = null;
                }
                f226aK++;
            } else if (f196W == 84) {
                f203a = "CLOSE SPRITES PACK --";
                AbstractRunnableC0012m.m393l();
            } else if (f196W == 85) {
                m77a(true);
                f346e = false;
                f207a = false;
            } else if (f196W == 86) {
                f235aT = 0;
                f335d = 0L;
                C0013n.m422y();
                m50L();
            } else {
                f203a = "load Idle";
            }
        } else if (f195V == 2) {
            m43E();
        }
        if (f379n) {
            return;
        }
        int i3 = f196W + 1;
        f196W = i3;
        if (i3 >= f197X) {
            f379n = true;
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m135p() {
        f391r = false;
        for (int i = 0; i < f247af; i++) {
            if ((f365i[i] & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                f391r = true;
                break;
            }
        }
        if (f391r) {
            if (m83a(1028, false)) {
                do {
                    int i2 = f245ad - 1;
                    f245ad = i2;
                    if (i2 < f246ae) {
                        f246ae--;
                    }
                    if (f245ad < 0) {
                        f245ad = f247af - 1;
                        f246ae = f247af - f248ag < 0 ? 0 : f247af - f248ag;
                    }
                } while ((f365i[f245ad] & Integer.MIN_VALUE) == Integer.MIN_VALUE);
                f172E = true;
            }
            if (m83a(2304, false)) {
                do {
                    int i3 = f245ad + 1;
                    f245ad = i3;
                    if (i3 > (f246ae + f248ag) - 1) {
                        f246ae++;
                    }
                    if (f245ad == f247af) {
                        f245ad = 0;
                        f246ae = 0;
                    }
                } while ((f365i[f245ad] & Integer.MIN_VALUE) == Integer.MIN_VALUE);
                f172E = true;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m136q() {
        int i = f191R;
        if (f180K == 21) {
            m72a(9, f334c[f254am], 11);
            i = f192S;
        } else {
            m72a(8, f334c[f254am], 11);
        }
        for (int i2 = 0; i2 < f334c[f254am].length; i2++) {
            if (m108e(i2) > i) {
                m71a(f334c[f254am][i2], true);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m137r() {
        int i = 3;
        if (f255an <= 3 && f255an >= 0) {
            i = f255an;
        }
        if (m83a(4112, false)) {
            int i2 = f254am - 1;
            f254am = i2;
            if (i2 < 0) {
                f254am = i;
            }
            if (f180K == 21) {
                f357g[9] = 0;
            } else {
                f357g[8] = 0;
            }
            m136q();
            f172E = true;
        }
        if (m83a(8256, false)) {
            int i3 = f254am + 1;
            f254am = i3;
            if (i3 > i) {
                f254am = 0;
            }
            if (f180K == 21) {
                f357g[9] = 0;
            } else {
                f357g[8] = 0;
            }
            m136q();
            f172E = true;
        }
        m135p();
    }

    /* JADX INFO: renamed from: s */
    private static void m138s() {
        int i = (f255an > 3 || f255an < 0) ? 3 : f255an;
        m119g(-2130706433);
        m111e(0, 53, AbstractRunnableC0012m.m353b(), 202);
        for (int i2 = 0; i2 <= i; i2++) {
            if (i2 != f254am) {
                m94b(i2 * 58, 18, i2);
            }
        }
        m94b(f254am * 58, 13, f254am);
        f325c.m312a(AbstractRunnableC0012m.f611a, 2, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
        f325c.m312a(AbstractRunnableC0012m.f611a, 3, 0, AbstractRunnableC0012m.m353b() >> 1, AbstractRunnableC0012m.m362c() >> 1, 0, 0, 0);
        f276b[0].m324c(0);
        f276b[0].m313a(AbstractRunnableC0012m.f611a, AbstractRunnableC0012m.m366c(f254am + 168), AbstractRunnableC0012m.m353b() >> 1, (AbstractRunnableC0012m.m362c() >> 1) - 112, 3);
        m75a(AbstractRunnableC0012m.f611a, (AbstractRunnableC0012m.m362c() >> 1) - 20);
    }

    /* JADX INFO: renamed from: t */
    private static void m139t() {
        try {
            byte[] bArr = new byte[275];
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("sn", true);
            bArr[0] = (byte) (f409x ? 1 : 0);
            bArr[1] = (byte) (f412y ? 1 : 0);
            bArr[2] = (byte) (f403v ? 1 : 0);
            bArr[3] = (byte) (f406w ? 1 : 0);
            bArr[4] = (byte) (f367j ? 1 : 0);
            bArr[5] = (byte) f189P;
            bArr[6] = (byte) f191R;
            int iM89b = 8;
            bArr[7] = (byte) f399u;
            for (int i = 0; i < 11; i++) {
                iM89b = m89b(bArr, iM89b, f407w[i]);
            }
            for (int i2 = 0; i2 < 55; i2++) {
                iM89b = m89b(bArr, iM89b, f410x[i2]);
            }
            bArr[iM89b] = (byte) f190Q;
            recordStoreOpenRecordStore.setRecord(1, bArr, 0, 275);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: u */
    private static void m140u() {
        try {
            byte[] bArr = new byte[275];
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("sn", true);
            if (recordStoreOpenRecordStore == null || recordStoreOpenRecordStore.getNumRecords() <= 0) {
                recordStoreOpenRecordStore.addRecord(bArr, 0, 275);
            } else {
                recordStoreOpenRecordStore.getRecord(1, bArr, 0);
                f409x = (bArr[0] & 255) != 0;
                f412y = (bArr[1] & 255) != 0;
                f403v = (bArr[2] & 255) != 0;
                f406w = (bArr[3] & 255) != 0;
                f367j = (bArr[4] & 255) != 0;
                f189P = bArr[5];
                f191R = bArr[6] & 255;
                int i = 8;
                f399u = bArr[7] & 255;
                for (int i2 = 0; i2 < 11; i2++) {
                    f407w[i2] = m88b(bArr, i);
                    i += 4;
                }
                for (int i3 = 0; i3 < 55; i3++) {
                    f410x[i3] = m88b(bArr, i);
                    i += 4;
                }
                f190Q = bArr[i] & 255;
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v */
    private static void m141v() {
        f189P = -1;
        f191R = 0;
        f190Q = -1;
        f192S = 0;
        f254am = 0;
        f367j = false;
        for (int i = 0; i < f407w.length; i++) {
            f407w[i] = 0;
        }
        for (int i2 = 0; i2 < f410x.length; i2++) {
            f410x[i2] = 0;
        }
        f399u = 0;
    }

    /* JADX INFO: renamed from: w */
    private static void m142w() {
        AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
        RunnableC0006g.m257a(AbstractRunnableC0012m.f611a, 0);
        boolean z = false;
        for (int i = 0; i < f229aN; i++) {
            C0004e c0004e = f341d[i];
            if (!z && c0004e.f461e > -10) {
                RunnableC0006g.m257a(AbstractRunnableC0012m.f611a, 1);
                z = true;
            }
            c0004e.mo241f();
        }
        if (!z) {
            RunnableC0006g.m257a(AbstractRunnableC0012m.f611a, 1);
        }
        if (m107d(1)) {
            int i2 = f375m;
            int i3 = f378n;
            int i4 = i2 / 20;
            int i5 = i3 / 20;
            int i6 = (f355g + i2) / 20;
            int i7 = (f358h + i3) / 20;
            int i8 = i4;
            int i9 = (i4 * 20) - i2;
            while (i8 <= i6) {
                int i10 = (i5 * 20) - i3;
                for (int i11 = i5; i11 <= i7; i11++) {
                    int iM54a = m54a((f375m + i9) / 20, (f378n + i10) / 20);
                    AbstractRunnableC0012m.f611a.setColor(1613039);
                    AbstractRunnableC0012m.f611a.drawRect(i9, i10, 20, 20);
                    AbstractRunnableC0012m.f611a.drawString(new StringBuffer().append("").append(iM54a).toString(), i9 + 10, i10 + 10, 0);
                    i10 += 20;
                }
                i8++;
                i9 += 20;
            }
        }
        if (m107d(1)) {
            C0004e.m158a(AbstractRunnableC0012m.f611a);
        }
        if (!f183L) {
            m52N();
        }
        if (f236aU < f237aV) {
            f163B = f163B == f238aW ? -f238aW : f238aW;
            f166C = f166C == f239aX ? -f239aX : f239aX;
            f236aU += AbstractRunnableC0012m.f622a_;
        } else {
            f237aV = 0;
            f163B = 0;
            f166C = 0;
        }
        if (f287bH != 0) {
            Graphics graphics = AbstractRunnableC0012m.f611a;
            int i12 = f288bI;
            graphics.setClip(0, 0, f355g, f358h);
            if (i12 != 0) {
                if (i12 == 100) {
                    int i13 = f355g;
                    int i14 = f358h;
                    AbstractRunnableC0012m.f611a.setColor(21);
                    AbstractRunnableC0012m.m368c(0, 0, i13, i14);
                } else {
                    int i15 = f355g;
                    int i16 = f358h;
                    AbstractRunnableC0012m.f611a.setClip(0, 0, f355g, f358h);
                    m119g((((i12 * 255) / 100) << 24) | 21);
                    m111e(0, 0, i15, i16);
                }
            }
        }
        switch (f285bF) {
            case 1:
            case 4:
                AbstractRunnableC0012m.f611a.setColor(0);
                AbstractRunnableC0012m.f611a.setClip(0, 0, f355g, f358h);
                AbstractRunnableC0012m.f611a.fillRect(0, 0, f355g, f286bG);
                AbstractRunnableC0012m.f611a.fillRect(0, (f358h + 0) - f286bG, f355g, f286bG);
                break;
            case 2:
            case 5:
                if (f284bE > 0) {
                    f284bE--;
                } else {
                    f285bF = 0;
                }
                AbstractRunnableC0012m.f611a.setColor(0);
                AbstractRunnableC0012m.f611a.setClip(0, 0, f355g, f358h);
                AbstractRunnableC0012m.f611a.fillRect(0, 0, f355g, f284bE);
                AbstractRunnableC0012m.f611a.fillRect(0, (f358h + 0) - f284bE, f355g, f284bE);
                break;
            case 3:
            case 6:
                if (f284bE < f286bG) {
                    f284bE++;
                } else {
                    f285bF = 1;
                }
                AbstractRunnableC0012m.f611a.setColor(0);
                AbstractRunnableC0012m.f611a.setClip(0, 0, f355g, f358h);
                AbstractRunnableC0012m.f611a.fillRect(0, 0, f355g, f284bE);
                AbstractRunnableC0012m.f611a.fillRect(0, (f358h + 0) - f284bE, f355g, f284bE);
                break;
        }
        if (f183L) {
            if (f338d && f183L && ((f314br >= 16 || f317bu < 3) && !f181K)) {
                if (f319bw <= 0 || f320bx <= 0 || f282bC != 0) {
                    f319bw = 0;
                    f320bx = 0;
                    f321by = f315bs;
                    f322bz = 36;
                } else {
                    f319bw += f280bA;
                    f320bx += f281bB;
                    f321by += f316bt;
                    f322bz += 4;
                }
            } else if (f324c != null) {
                f324c.f450a += f324c.f469l;
                f324c.f454b += f324c.f470m;
                f314br++;
                if (f181K) {
                    f324c.m218a(true);
                }
                f324c.mo213a(0, 6);
            }
            if (f314br >= 16 && f181K) {
                if (f324c != null) {
                    m96b(f324c);
                    f324c = null;
                }
                f179J = false;
                f183L = false;
                f307bk = 0;
            } else if ((f314br >= 16 || f317bu < 3) && !f181K) {
                int i17 = f319bw;
                int i18 = f320bx;
                int i19 = f321by;
                int i20 = f322bz;
                AbstractRunnableC0012m.m346a(i17, i18, i19, i20);
                m76a(AbstractRunnableC0012m.f611a, i17, i18, i19, i20, 255);
                m76a(AbstractRunnableC0012m.f611a, i17 + 1, i18 + 1, i19 - 3, i20 - 3, 0);
                m76a(AbstractRunnableC0012m.f611a, i17 + 2, i18 + 2, i19 - 5, i20 - 5, 16777215);
                if (f319bw == 0 && f320bx == 0) {
                    f276b[0].m324c(1);
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, f332c[f282bC], i17 + 8, i18 + 3, 20);
                }
                if (f344e % 4 > 1) {
                    f276b[0].m313a(AbstractRunnableC0012m.f611a, f345e, (i17 + i19) - 3, (i18 + i20) - 3, 40);
                }
                AbstractRunnableC0012m.m346a(0, 0, AbstractRunnableC0012m.m353b(), AbstractRunnableC0012m.m362c());
            }
        }
        C0004e.m201l();
    }

    /* JADX INFO: renamed from: x */
    private static void m143x() {
        int i = 0;
        if (m83a(1028, false)) {
            i = 21;
        } else if (m83a(2304, false)) {
            i = 32;
        } else if (m83a(4112, false)) {
            i = 23;
        } else if (m83a(8256, false)) {
            i = 24;
        } else if (m83a(65536, false)) {
            i = 26;
        } else if (m83a(49184, false)) {
            i = 25;
        }
        try {
            if (RunnableC0002c.m23a(i)) {
                m110e(6);
                m70a(0, 0, true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m144y() {
        try {
            RunnableC0002c.m15a(AbstractRunnableC0012m.f611a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m145z() {
        if (f220aD != 2 && f216a[f189P][0] > 0 && ((f399u >> ((f216a[f189P][0] - 17) / 3)) & 1) == 0) {
            f220aD = 2;
            m39A();
            return;
        }
        if (f189P >= f386p.length - 1) {
            f220aD = 0;
            m39A();
            return;
        }
        f189P++;
        int length = 0;
        for (int i = 0; i <= f254am; i++) {
            length += f334c[i].length;
        }
        if (f189P >= length) {
            f254am++;
        }
        int length2 = f189P;
        for (int i2 = 0; i2 < f254am; i2++) {
            length2 -= f334c[i2].length;
        }
        if ((f334c[f254am][length2] & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            f189P++;
        }
        if (f189P > f386p.length - 1) {
            f220aD = 0;
            m39A();
        } else {
            f220aD = 1;
            m39A();
        }
    }

    @Override // p000.AbstractRunnableC0012m
    /* JADX INFO: renamed from: a */
    final void mo146a() {
        int i;
        f171E = (f169D ^ (-1)) & f240aY;
        f169D = f240aY;
        if (f180K == 13) {
            if (f179J && f338d && ((f314br >= 16 || f324c == null) && m83a(16416, false))) {
                int i2 = f282bC + 1;
                f282bC = i2;
                if (i2 >= f283bD) {
                    f307bk = 0;
                    f179J = false;
                    f183L = false;
                }
                f240aY &= -16417;
            }
            if (C0013n.f669J > 0) {
                C0013n.f669J--;
            }
            if (C0013n.f669J != 0) {
                f169D &= C0013n.f668I ^ (-1);
                f171E &= C0013n.f668I ^ (-1);
            }
        }
        if (f193T != -1 && f344e - f291bL == 10) {
            if (f180K != 11 && f180K != 13) {
                try {
                    if (f193T >= 0) {
                        m70a(0, f193T, f373l);
                        f193T = -1;
                    }
                } catch (Exception e) {
                }
            }
            f291bL = 0;
        }
        if (f363i) {
            f363i = false;
            f344e = 0;
            f350f = 0;
            f193T = -1;
            m115f(0);
        }
        if (f394s) {
            if (f256ao == 1 && !f397t && (m83a(2304, false) || m83a(1028, false))) {
                f258aq = (f258aq + 1) % 2;
                f172E = true;
            }
            if (m83a(49184, false)) {
                f249ah = 3;
                f397t = true;
            }
            if (f256ao == 1 && f400u && m83a(65536, false)) {
                f397t = true;
                f249ah = 3;
                f258aq = 0;
            }
            m100b(true);
            if (f172E) {
                m115f(2);
                if (f394s) {
                    Graphics graphics = AbstractRunnableC0012m.f611a;
                    int iM353b = (int) ((((long) AbstractRunnableC0012m.m353b()) * f267b) / 300);
                    AbstractRunnableC0012m.m346a((AbstractRunnableC0012m.m353b() - iM353b) >> 1, 0, iM353b, AbstractRunnableC0012m.m362c());
                    int i3 = InterfaceC0007h.f515I;
                    int i4 = f259ar + 40;
                    if (f256ao == 0) {
                        m119g(-2130706433);
                        m111e(InterfaceC0007h.f516J, InterfaceC0007h.f515I - (i4 >> 1), InterfaceC0007h.f514H, i4);
                        AbstractRunnableC0012m.m375d(-1);
                        AbstractRunnableC0012m.m376d(InterfaceC0007h.f516J, InterfaceC0007h.f515I - (i4 >> 1), InterfaceC0007h.f514H, i4);
                        f276b[0].m322b(graphics, f326c, AbstractRunnableC0012m.m353b() >> 1, i3, 3);
                    } else if (f256ao == 1) {
                        int i5 = i4 + 92;
                        m119g(-2130706433);
                        m111e(InterfaceC0007h.f516J, InterfaceC0007h.f515I - (i5 >> 1), InterfaceC0007h.f514H, i5);
                        AbstractRunnableC0012m.m375d(-1);
                        AbstractRunnableC0012m.m376d(InterfaceC0007h.f516J, InterfaceC0007h.f515I - (i5 >> 1), InterfaceC0007h.f514H, i5);
                        f325c.m312a(graphics, 18, 0, AbstractRunnableC0012m.m353b() >> 1, (InterfaceC0007h.f515I - (i5 >> 1)) - 20, 0, 0, 0);
                        f276b[0].m324c(4);
                        int i6 = (i3 - (i5 >> 1)) + 20 + (f259ar >> 1);
                        f276b[0].m322b(graphics, f326c, AbstractRunnableC0012m.m353b() >> 1, i6, 3);
                        int i7 = i6 + (f259ar >> 1) + 16 + 30;
                        f276b[0].m309a(AbstractRunnableC0012m.m366c(45));
                        int i8 = 0;
                        if (f249ah != 3 || f344e % 2 != 1) {
                            i = 0;
                        } else if (f258aq == 1) {
                            i8 = 1;
                            i = 0;
                        } else {
                            i = 1;
                        }
                        f325c.m312a(graphics, f258aq == 1 ? 15 : 16, i8, AbstractRunnableC0012m.m353b() >> 1, i7 - 13, 0, 0, 0);
                        f276b[0].m324c(f258aq == 1 ? 1 : 0);
                        f276b[0].m313a(graphics, AbstractRunnableC0012m.m366c(45), AbstractRunnableC0012m.m353b() >> 1, i7, 3);
                        int i9 = i7 + 30;
                        f325c.m312a(graphics, f258aq == 0 ? 15 : 16, i, AbstractRunnableC0012m.m353b() >> 1, i9 - 13, 0, 0, 0);
                        f276b[0].m324c(f258aq == 0 ? 1 : 0);
                        f276b[0].m313a(graphics, AbstractRunnableC0012m.m366c(46), AbstractRunnableC0012m.m353b() >> 1, i9, 3);
                    }
                    Graphics graphics2 = AbstractRunnableC0012m.f611a;
                    int i10 = f243ab;
                    int i11 = f244ac;
                    boolean z = f388q;
                    if (f256ao != 1) {
                        m95b(-1, 40, true);
                    } else if (f400u) {
                        m95b(41, 39, true);
                    } else {
                        m95b(-1, 39, true);
                    }
                    m74a(graphics2);
                    m95b(i11, i10, z);
                }
            }
            if (!f394s) {
                f169D = 0;
                f171E = 0;
                f240aY = 0;
                m115f(1);
            }
        } else {
            m115f(1);
            if (!f394s) {
                m115f(2);
                m74a(AbstractRunnableC0012m.f611a);
            }
        }
        if (f359h) {
            m115f(3);
            f359h = false;
            f363i = true;
            f180K = f182L;
            f182L = -1;
        }
        f344e++;
        f350f += AbstractRunnableC0012m.f622a_;
        RunnableC0006g.m275n();
        f370k = false;
        if (f241aZ != 0) {
            f240aY = 0;
        }
        f241aZ = 0;
    }

    @Override // p000.AbstractRunnableC0012m
    public final void hideNotify() {
        if (f180K == 20) {
            RunnableC0002c.m21a(true);
        }
        try {
            if (f194U >= 0 && RunnableC0006g.m265c(0)) {
                f193T = f194U;
            }
            System.out.println(new StringBuffer().append("s_interruptedSoundID = ").append(f193T).toString());
        } catch (Exception e) {
            f193T = -1;
        }
        m66a(0);
        m92b(0);
        if (f180K == 13 && !f338d) {
            f167C = true;
            f357g[5] = 0;
            m110e(11);
        } else if (f180K == 11) {
            f245ad = 0;
            f246ae = 0;
        }
        AbstractRunnableC0012m.m390i();
    }

    @Override // p000.AbstractRunnableC0012m
    protected final void keyPressed(int i) {
        f240aY |= m124i(i);
    }

    @Override // p000.AbstractRunnableC0012m
    protected final void keyReleased(int i) {
        f170D[f301be] = i - 48;
        if (i == 35) {
            f176G = true;
        }
        int i2 = f301be + 1;
        f301be = i2;
        if (i2 >= f170D.length) {
            f301be = 0;
        }
        int iM124i = m124i(i);
        if ((f169D & iM124i) == 0) {
            f241aZ = iM124i | f241aZ;
        } else {
            f240aY = (iM124i ^ (-1)) & f240aY;
        }
    }

    protected final void keyRepeated(int i) {
    }

    @Override // p000.AbstractRunnableC0012m
    public final void showNotify() {
        if (f180K == 20) {
            RunnableC0002c.m21a(false);
        }
        m396j();
        f291bL = f344e;
        f258aq = 0;
        f172E = true;
        m102c(-1);
    }
}
