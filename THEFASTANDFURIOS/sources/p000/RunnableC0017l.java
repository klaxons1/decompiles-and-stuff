package p000;

import com.iplay.fastfurious53d.FastFurious53D;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.VertexBuffer;
import javax.microedition.media.Player;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreNotFoundException;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
public final class RunnableC0017l extends AbstractC0024s implements Runnable {

    /* JADX INFO: renamed from: aR */
    public static MIDlet f311aR;

    /* JADX INFO: renamed from: aS */
    static Graphics f312aS;

    /* JADX INFO: renamed from: A */
    C0022q f317A;

    /* JADX INFO: renamed from: B */
    short[] f318B;

    /* JADX INFO: renamed from: C */
    int f319C;

    /* JADX INFO: renamed from: D */
    byte f320D;

    /* JADX INFO: renamed from: E */
    short f321E;

    /* JADX INFO: renamed from: F */
    int f322F;

    /* JADX INFO: renamed from: G */
    int f323G;

    /* JADX INFO: renamed from: H */
    int f324H;

    /* JADX INFO: renamed from: I */
    int f325I;

    /* JADX INFO: renamed from: J */
    int f326J;

    /* JADX INFO: renamed from: K */
    boolean f327K;

    /* JADX INFO: renamed from: L */
    Transform f328L;

    /* JADX INFO: renamed from: M */
    boolean f329M;

    /* JADX INFO: renamed from: N */
    boolean f330N;

    /* JADX INFO: renamed from: O */
    int f331O;

    /* JADX INFO: renamed from: P */
    int f332P;

    /* JADX INFO: renamed from: Q */
    int f333Q;

    /* JADX INFO: renamed from: R */
    int f334R;

    /* JADX INFO: renamed from: S */
    int f335S;

    /* JADX INFO: renamed from: T */
    short[] f336T;

    /* JADX INFO: renamed from: U */
    short[] f337U;

    /* JADX INFO: renamed from: V */
    C0026u f338V;

    /* JADX INFO: renamed from: W */
    int f339W;

    /* JADX INFO: renamed from: X */
    int f340X;

    /* JADX INFO: renamed from: Y */
    float f341Y;

    /* JADX INFO: renamed from: Z */
    int f342Z;

    /* JADX INFO: renamed from: a */
    int[] f343a;

    /* JADX INFO: renamed from: aA */
    short[] f344aA;

    /* JADX INFO: renamed from: aB */
    VertexBuffer[] f345aB;

    /* JADX INFO: renamed from: aC */
    int f346aC;

    /* JADX INFO: renamed from: aD */
    int[] f347aD;

    /* JADX INFO: renamed from: aE */
    int f348aE;

    /* JADX INFO: renamed from: aF */
    int f349aF;

    /* JADX INFO: renamed from: aG */
    String f350aG;

    /* JADX INFO: renamed from: aH */
    int f351aH;

    /* JADX INFO: renamed from: aI */
    int f352aI;

    /* JADX INFO: renamed from: aJ */
    int f353aJ;

    /* JADX INFO: renamed from: aK */
    int f354aK;

    /* JADX INFO: renamed from: aL */
    int f355aL;

    /* JADX INFO: renamed from: aM */
    int f356aM;

    /* JADX INFO: renamed from: aN */
    int f357aN;

    /* JADX INFO: renamed from: aO */
    int f358aO;

    /* JADX INFO: renamed from: aP */
    float f359aP;

    /* JADX INFO: renamed from: aV */
    private int f362aV;

    /* JADX INFO: renamed from: aW */
    private byte[] f363aW;

    /* JADX INFO: renamed from: aY */
    private int[] f365aY;

    /* JADX INFO: renamed from: aa */
    int f367aa;

    /* JADX INFO: renamed from: ab */
    C0002ab f368ab;

    /* JADX INFO: renamed from: ac */
    C0030y f369ac;

    /* JADX INFO: renamed from: ad */
    int f370ad;

    /* JADX INFO: renamed from: ae */
    C0010e[] f371ae;

    /* JADX INFO: renamed from: af */
    C0010e[] f372af;

    /* JADX INFO: renamed from: ag */
    C0010e[] f373ag;

    /* JADX INFO: renamed from: ah */
    C0010e[] f374ah;

    /* JADX INFO: renamed from: ai */
    int f375ai;

    /* JADX INFO: renamed from: aj */
    int f376aj;

    /* JADX INFO: renamed from: ak */
    int f377ak;

    /* JADX INFO: renamed from: al */
    int f378al;

    /* JADX INFO: renamed from: am */
    int f379am;

    /* JADX INFO: renamed from: an */
    int f380an;

    /* JADX INFO: renamed from: ao */
    int[][] f381ao;

    /* JADX INFO: renamed from: ap */
    int f382ap;

    /* JADX INFO: renamed from: aq */
    short[] f383aq;

    /* JADX INFO: renamed from: ar */
    short[] f384ar;

    /* JADX INFO: renamed from: as */
    int[] f385as;

    /* JADX INFO: renamed from: at */
    short[] f386at;

    /* JADX INFO: renamed from: au */
    short[] f387au;

    /* JADX INFO: renamed from: av */
    short[] f388av;

    /* JADX INFO: renamed from: aw */
    short[] f389aw;

    /* JADX INFO: renamed from: ax */
    int[] f390ax;

    /* JADX INFO: renamed from: ay */
    int[] f391ay;

    /* JADX INFO: renamed from: az */
    short f392az;

    /* JADX INFO: renamed from: bA */
    private int[] f394bA;

    /* JADX INFO: renamed from: bB */
    private int f395bB;

    /* JADX INFO: renamed from: bC */
    private int f396bC;

    /* JADX INFO: renamed from: bD */
    private int f397bD;

    /* JADX INFO: renamed from: bE */
    private boolean f398bE;

    /* JADX INFO: renamed from: bF */
    private int f399bF;

    /* JADX INFO: renamed from: bG */
    private int f400bG;

    /* JADX INFO: renamed from: bH */
    private int f401bH;

    /* JADX INFO: renamed from: bI */
    private int[] f402bI;

    /* JADX INFO: renamed from: bJ */
    private int[] f403bJ;

    /* JADX INFO: renamed from: bK */
    private boolean[] f404bK;

    /* JADX INFO: renamed from: bL */
    private boolean f405bL;

    /* JADX INFO: renamed from: bM */
    private boolean f406bM;

    /* JADX INFO: renamed from: bN */
    private int f407bN;

    /* JADX INFO: renamed from: bO */
    private int f408bO;

    /* JADX INFO: renamed from: bP */
    private C0007b f409bP;

    /* JADX INFO: renamed from: bQ */
    private int f410bQ;

    /* JADX INFO: renamed from: bR */
    private int f411bR;

    /* JADX INFO: renamed from: bS */
    private int f412bS;

    /* JADX INFO: renamed from: bT */
    private int f413bT;

    /* JADX INFO: renamed from: bU */
    private int f414bU;

    /* JADX INFO: renamed from: bV */
    private int f415bV;

    /* JADX INFO: renamed from: bW */
    private int f416bW;

    /* JADX INFO: renamed from: bX */
    private int f417bX;

    /* JADX INFO: renamed from: bY */
    private int f418bY;

    /* JADX INFO: renamed from: bZ */
    private int f419bZ;

    /* JADX INFO: renamed from: ba */
    private long f420ba;

    /* JADX INFO: renamed from: bb */
    private boolean f421bb;

    /* JADX INFO: renamed from: bc */
    private boolean f422bc;

    /* JADX INFO: renamed from: bd */
    private boolean f423bd;

    /* JADX INFO: renamed from: be */
    private boolean f424be;

    /* JADX INFO: renamed from: bf */
    private boolean f425bf;

    /* JADX INFO: renamed from: bg */
    private int f426bg;

    /* JADX INFO: renamed from: bh */
    private int f427bh;

    /* JADX INFO: renamed from: bi */
    private int f428bi;

    /* JADX INFO: renamed from: bj */
    private int f429bj;

    /* JADX INFO: renamed from: bk */
    private boolean f430bk;

    /* JADX INFO: renamed from: bl */
    private int f431bl;

    /* JADX INFO: renamed from: bm */
    private Thread f432bm;

    /* JADX INFO: renamed from: bn */
    private int f433bn;

    /* JADX INFO: renamed from: bp */
    private boolean f435bp;

    /* JADX INFO: renamed from: bq */
    private boolean f436bq;

    /* JADX INFO: renamed from: br */
    private int f437br;

    /* JADX INFO: renamed from: bs */
    private int f438bs;

    /* JADX INFO: renamed from: bt */
    private boolean f439bt;

    /* JADX INFO: renamed from: bu */
    private long f440bu;

    /* JADX INFO: renamed from: bv */
    private long f441bv;

    /* JADX INFO: renamed from: bw */
    private long f442bw;

    /* JADX INFO: renamed from: bx */
    private C0023r f443bx;

    /* JADX INFO: renamed from: by */
    private C0005ae f444by;

    /* JADX INFO: renamed from: bz */
    private RunnableC0017l f445bz;

    /* JADX INFO: renamed from: c */
    int f446c;

    /* JADX INFO: renamed from: cA */
    private int f447cA;

    /* JADX INFO: renamed from: cB */
    private int f448cB;

    /* JADX INFO: renamed from: cC */
    private int[] f449cC;

    /* JADX INFO: renamed from: cD */
    private int f450cD;

    /* JADX INFO: renamed from: cE */
    private int[] f451cE;

    /* JADX INFO: renamed from: cF */
    private boolean f452cF;

    /* JADX INFO: renamed from: cG */
    private float f453cG;

    /* JADX INFO: renamed from: cH */
    private int[] f454cH;

    /* JADX INFO: renamed from: cI */
    private boolean f455cI;

    /* JADX INFO: renamed from: cJ */
    private boolean f456cJ;

    /* JADX INFO: renamed from: cK */
    private boolean f457cK;

    /* JADX INFO: renamed from: cL */
    private int[] f458cL;

    /* JADX INFO: renamed from: cM */
    private int[] f459cM;

    /* JADX INFO: renamed from: cN */
    private int[] f460cN;

    /* JADX INFO: renamed from: cO */
    private int[] f461cO;

    /* JADX INFO: renamed from: cP */
    private int f462cP;

    /* JADX INFO: renamed from: cQ */
    private int f463cQ;

    /* JADX INFO: renamed from: cR */
    private int f464cR;

    /* JADX INFO: renamed from: cS */
    private int f465cS;

    /* JADX INFO: renamed from: cT */
    private int f466cT;

    /* JADX INFO: renamed from: cU */
    private int f467cU;

    /* JADX INFO: renamed from: cV */
    private int f468cV;

    /* JADX INFO: renamed from: cW */
    private int f469cW;

    /* JADX INFO: renamed from: cX */
    private int f470cX;

    /* JADX INFO: renamed from: cY */
    private int f471cY;

    /* JADX INFO: renamed from: cZ */
    private boolean f472cZ;

    /* JADX INFO: renamed from: ca */
    private int f473ca;

    /* JADX INFO: renamed from: cb */
    private int f474cb;

    /* JADX INFO: renamed from: cc */
    private int f475cc;

    /* JADX INFO: renamed from: cd */
    private int f476cd;

    /* JADX INFO: renamed from: ce */
    private int f477ce;

    /* JADX INFO: renamed from: cf */
    private int f478cf;

    /* JADX INFO: renamed from: cg */
    private int f479cg;

    /* JADX INFO: renamed from: ch */
    private int f480ch;

    /* JADX INFO: renamed from: ci */
    private int f481ci;

    /* JADX INFO: renamed from: cj */
    private int f482cj;

    /* JADX INFO: renamed from: ck */
    private int f483ck;

    /* JADX INFO: renamed from: cl */
    private short[] f484cl;

    /* JADX INFO: renamed from: cm */
    private short[] f485cm;

    /* JADX INFO: renamed from: cn */
    private short[] f486cn;

    /* JADX INFO: renamed from: co */
    private int f487co;

    /* JADX INFO: renamed from: cp */
    private C0007b f488cp;

    /* JADX INFO: renamed from: cq */
    private int f489cq;

    /* JADX INFO: renamed from: cr */
    private int f490cr;

    /* JADX INFO: renamed from: cs */
    private float f491cs;

    /* JADX INFO: renamed from: ct */
    private int f492ct;

    /* JADX INFO: renamed from: cu */
    private boolean f493cu;

    /* JADX INFO: renamed from: cv */
    private C0010e[] f494cv;

    /* JADX INFO: renamed from: cw */
    private int f495cw;

    /* JADX INFO: renamed from: cx */
    private int f496cx;

    /* JADX INFO: renamed from: cy */
    private int[] f497cy;

    /* JADX INFO: renamed from: cz */
    private int f498cz;

    /* JADX INFO: renamed from: d */
    int f499d;

    /* JADX INFO: renamed from: dA */
    private Transform f500dA;

    /* JADX INFO: renamed from: dB */
    private float[] f501dB;

    /* JADX INFO: renamed from: dF */
    private boolean f505dF;

    /* JADX INFO: renamed from: da */
    private boolean f506da;

    /* JADX INFO: renamed from: db */
    private int f507db;

    /* JADX INFO: renamed from: dc */
    private int f508dc;

    /* JADX INFO: renamed from: dd */
    private int f509dd;

    /* JADX INFO: renamed from: dj */
    private short f514dj;

    /* JADX INFO: renamed from: dk */
    private short f515dk;

    /* JADX INFO: renamed from: dl */
    private short f516dl;

    /* JADX INFO: renamed from: dm */
    private short[] f517dm;

    /* JADX INFO: renamed from: dn */
    private short[] f518dn;

    /* JADX INFO: renamed from: do */
    private short[][][] f519do;

    /* JADX INFO: renamed from: dp */
    private short f520dp;

    /* JADX INFO: renamed from: dq */
    private short f521dq;

    /* JADX INFO: renamed from: dr */
    private short[] f522dr;

    /* JADX INFO: renamed from: ds */
    private short[][] f523ds;

    /* JADX INFO: renamed from: dt */
    private short[][][][] f524dt;

    /* JADX INFO: renamed from: du */
    private int[] f525du;

    /* JADX INFO: renamed from: dv */
    private int[] f526dv;

    /* JADX INFO: renamed from: dw */
    private int[] f527dw;

    /* JADX INFO: renamed from: dx */
    private int[] f528dx;

    /* JADX INFO: renamed from: dy */
    private int[] f529dy;

    /* JADX INFO: renamed from: dz */
    private int[] f530dz;

    /* JADX INFO: renamed from: e */
    boolean f531e;

    /* JADX INFO: renamed from: f */
    boolean f532f;

    /* JADX INFO: renamed from: g */
    int f533g;

    /* JADX INFO: renamed from: h */
    boolean f534h;

    /* JADX INFO: renamed from: i */
    boolean f535i;

    /* JADX INFO: renamed from: j */
    boolean f536j;

    /* JADX INFO: renamed from: k */
    String f537k;

    /* JADX INFO: renamed from: l */
    int f538l;

    /* JADX INFO: renamed from: m */
    boolean f539m;

    /* JADX INFO: renamed from: n */
    int f540n;

    /* JADX INFO: renamed from: o */
    int f541o;

    /* JADX INFO: renamed from: p */
    int f542p;

    /* JADX INFO: renamed from: q */
    boolean f543q;

    /* JADX INFO: renamed from: r */
    boolean f544r;

    /* JADX INFO: renamed from: s */
    C0011f f545s;

    /* JADX INFO: renamed from: t */
    C0011f f546t;

    /* JADX INFO: renamed from: u */
    C0011f f547u;

    /* JADX INFO: renamed from: v */
    C0011f f548v;

    /* JADX INFO: renamed from: w */
    C0011f f549w;

    /* JADX INFO: renamed from: x */
    C0011f f550x;

    /* JADX INFO: renamed from: y */
    C0016k f551y;

    /* JADX INFO: renamed from: z */
    C0014i f552z;

    /* JADX INFO: renamed from: de */
    private static boolean f316de = false;

    /* JADX INFO: renamed from: dG */
    private static boolean f313dG = false;

    /* JADX INFO: renamed from: dH */
    private static boolean f314dH = false;

    /* JADX INFO: renamed from: dI */
    private static boolean f315dI = false;

    /* JADX INFO: renamed from: aU */
    private Image[] f361aU = new Image[30];

    /* JADX INFO: renamed from: b */
    byte[][] f393b = new byte[13][];

    /* JADX INFO: renamed from: aX */
    private int f364aX = -1;

    /* JADX INFO: renamed from: aZ */
    private Image[] f366aZ = new Image[30];

    /* JADX INFO: renamed from: bo */
    private int[] f434bo = new int[5];

    /* JADX INFO: renamed from: aQ */
    String f360aQ = "";

    /* JADX INFO: renamed from: df */
    private C0020o f510df = null;

    /* JADX INFO: renamed from: dg */
    private long[] f511dg = new long[256];

    /* JADX INFO: renamed from: dh */
    private int f512dh = 0;

    /* JADX INFO: renamed from: di */
    private Random f513di = new Random(System.currentTimeMillis());

    /* JADX INFO: renamed from: dC */
    private int[] f502dC = {16};

    /* JADX INFO: renamed from: dD */
    private int[][] f503dD = {new int[]{4194304, 8388608, 524288, 4194304, -1}, new int[]{262144, 262144, 8388608, 8388608, -1}, new int[]{33554432, 1048576, 4194304, 131072, -1}, new int[]{524288, 524288, 16777216, 1048576, -1}, new int[]{1048576, 262144, 8388608, 16777216, -1}, new int[]{262144, 4194304, 8388608, 8388608, -1}, new int[]{524288, 8388608, 524288, 33554432, -1}, new int[]{16777216, 1048576, 4194304, 524288, -1}, new int[]{4194304, 262144, 8388608, 8388608, -1}, new int[]{16777216, 4194304, 16777216, 8388608, -1}, new int[]{262144, 65536, 65536, 2097152, -1}, new int[]{8388608, 8388608, 524288, 16777216, -1}, new int[]{33554432, 1048576, 4194304, 262144, -1}, new int[]{33554432, 1048576, 4194304, 524288, -1}, new int[]{33554432, 1048576, 4194304, 1048576, -1}, new int[]{33554432, 1048576, 4194304, 8388608, -1}, new int[]{33554432, 1048576, 4194304, 16777216, -1}, new int[]{2097152, 16777216, 4194304, 8388608, -1}, new int[]{524288, 8388608, 8388608, 16777216, -1}, new int[]{524288, 524288, 262144, 1048576, -1}, new int[]{262144, 65536, 65536, 4194304, -1}, new int[]{1048576, 262144, 8388608, 262144, -1}, new int[]{8388608, 262144, 262144, 4194304, -1}, new int[]{262144, 8388608, 8388608, 1048576, -1}, new int[]{8388608, 4194304, 8388608, 524288, -1}, new int[]{524288, 8388608, 524288, 16777216, -1}, new int[]{16777216, 8388608, 2097152, 4194304, -1}};

    /* JADX INFO: renamed from: dE */
    private boolean f504dE = false;

    public RunnableC0017l(FastFurious53D fastFurious53D) {
        int[] iArr = {3, 7, 8, 5};
        int[] iArr2 = {-1, 3, 3, -1};
        int[] iArr3 = {500, 3200, 20000, 90000};
        int[][] iArr4 = {new int[]{150, 125, 100, 75}, new int[]{1000, 750, 500, 250}, new int[]{3000, 2750, 2400, 2000}, new int[]{5000, 4200, 3700, 3000}};
        int[] iArr5 = {50, 35, 25, 15};
        int[][] iArr6 = {new int[]{300000, 350000, 420000, 550000}, new int[]{570000, 600000, 750000, 800000}, new int[]{1000000, 1200000, 1500000, 1800000}, new int[]{2200000, 3300000, 6000000, 8000000}};
        f311aR = fastFurious53D;
        m128a(isDoubleBuffered(), "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\thegamej2me.hpp", 196, this.f445bz);
        this.f430bk = false;
        this.f445bz = this;
    }

    /* JADX INFO: renamed from: A */
    private void m100A() {
        int iM213y = this.f445bz.m213y(334);
        short s = (short) (this.f445bz.f343a[335] >> 16);
        this.f394bA = new int[s >> 2];
        for (int i = 0; i < (s >> 2); i++) {
            char cM164B = this.f445bz.m164B(iM213y);
            char cM164B2 = this.f445bz.m164B(iM213y);
            int i2 = cM164B2 << '\b';
            this.f394bA[i] = cM164B | i2 | (this.f445bz.m164B(iM213y) << 16) | (this.f445bz.m164B(iM213y) << 24);
        }
        this.f445bz.m203n(334);
    }

    /* JADX INFO: renamed from: B */
    private void m101B() {
        if (this.f445bz.f369ac.f734n == -1) {
            this.f448cB = 0;
            this.f449cC = null;
            return;
        }
        int iM213y = this.f445bz.m213y(this.f445bz.f369ac.f734n);
        this.f448cB = this.f445bz.m163A(iM213y);
        this.f449cC = new int[this.f448cB << 2];
        for (int i = 0; i < this.f448cB; i++) {
            this.f449cC[i << 2] = this.f445bz.m163A(iM213y);
            this.f449cC[(i << 2) + 1] = this.f445bz.m163A(iM213y) << 4;
            this.f449cC[(i << 2) + 2] = (-this.f445bz.m163A(iM213y)) << 4;
            this.f449cC[(i << 2) + 3] = this.f445bz.m163A(iM213y) << 4;
        }
        this.f445bz.m203n(this.f445bz.f369ac.f734n);
    }

    /* JADX INFO: renamed from: C */
    private int m102C(int i) {
        int i2 = i < 0 ? i + 256 : i;
        if (i2 >= 32 && i2 <= 122) {
            return i2;
        }
        int[] iArr = {161, 163, 169, 191, 171, 187, 176, 192, 193, 194, 196, 199, 200, 201, 202, 203, 204, 205, 206, 207, 209, 210, 211, 212, 214, 217, 218, 219, 220, 223, 224, 225, 226, 228, 231, 232, 233, 234, 235, 236, 237, 238, 239, 241, 242, 243, 32, 46, 170, 246, 249, 250, 251, 252, 8364, 8220, 8222, 39, 244};
        for (int i3 = 0; i3 < 59; i3++) {
            if (iArr[i3] < 0) {
                iArr[i3] = iArr[i3] + 256;
            }
            if (i2 == iArr[i3]) {
                return i3 + 123;
            }
        }
        switch (i2) {
            case 28:
                return 178;
            case 30:
                return 179;
            case 95:
                return m102C(95);
            case 133:
                return m102C(95);
            case 145:
                return m102C(39);
            case 146:
                return m102C(39);
            case 147:
                return m102C(34);
            case 148:
                return m102C(34);
            case 150:
                return m102C(45);
            case 160:
                return 169;
            case 172:
                return m102C(8364);
            case 186:
                return m102C(176);
            case 228:
                return 155;
            case 231:
                return 157;
            case 233:
                return 159;
            case 235:
                return 161;
            case 241:
                return 166;
            case 246:
                return 172;
            case 255:
                return 1;
            case 8211:
                return m102C(45);
            case 8220:
                return m102C(34);
            case 8221:
                return m102C(34);
            case 65279:
                return m102C(32);
            default:
                return m102C(63);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m103C() {
        if (this.f445bz.f369ac.f735o == -1) {
            this.f450cD = 0;
            this.f451cE = null;
            return;
        }
        int iM213y = this.f445bz.m213y(this.f445bz.f369ac.f735o);
        this.f450cD = this.f445bz.m163A(iM213y);
        this.f451cE = new int[this.f450cD << 2];
        for (int i = 0; i < this.f450cD; i++) {
            this.f451cE[i << 2] = this.f445bz.m163A(iM213y);
            this.f451cE[(i << 2) + 1] = this.f445bz.m163A(iM213y) << 4;
            this.f451cE[(i << 2) + 2] = (-this.f445bz.m163A(iM213y)) << 4;
            this.f451cE[(i << 2) + 3] = this.f445bz.m163A(iM213y) << 4;
        }
        this.f445bz.m203n(this.f445bz.f369ac.f735o);
    }

    /* JADX INFO: renamed from: D */
    private void m104D() {
        try {
            if ((this.f541o & 8192) != 0) {
                this.f445bz.f552z.m77c();
                this.f507db = 0;
                if (this.f371ae != null) {
                    for (int i = 0; i < 4; i++) {
                        this.f371ae[i].m44a();
                    }
                    this.f371ae = null;
                }
                if (this.f372af != null) {
                    for (int i2 = 1; i2 < 3; i2++) {
                        this.f372af[i2].f161b = null;
                    }
                    this.f372af = null;
                }
                if (this.f494cv != null) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        this.f494cv[i3].m44a();
                    }
                    this.f494cv = null;
                }
                this.f371ae = new C0010e[4];
                this.f372af = new C0010e[3];
                this.f494cv = new C0010e[3];
                for (int i4 = 0; i4 < 4; i4++) {
                    this.f371ae[i4] = null;
                }
                for (int i5 = 0; i5 < 3; i5++) {
                    this.f372af[i5] = null;
                }
                for (int i6 = 0; i6 < 3; i6++) {
                    this.f494cv[i6] = null;
                }
                this.f472cZ = false;
                m160x();
                this.f319C = 2;
                m211v(2);
            } else if ((this.f541o & 4096) != 0) {
                this.f445bz.f552z.m77c();
                C0022q c0022q = this.f445bz.f317A;
                c0022q.f601N = false;
                c0022q.f614a.f320D = (byte) 0;
                c0022q.f614a.m193g(306);
                c0022q.f614a.m176a(256, false);
                c0022q.f682v = true;
                c0022q.f614a.f544r = false;
                c0022q.f614a.m182c();
                c0022q.f614a.f542p = 0;
                c0022q.f686z = -1;
            } else if ((this.f541o & 16384) != 0) {
                m193g(306);
                m170a();
                C0005ae c0005ae = this.f445bz.f444by;
                if (c0005ae.f58d != -99) {
                    c0005ae.f58d = 0;
                }
                c0005ae.f56b = 1;
                c0005ae.f57c = 1;
                c0005ae.f55a.m176a(280, false);
                c0005ae.f55a.m176a(262, false);
                c0005ae.f55a.m176a(268, false);
                c0005ae.f55a.m176a(274, false);
            }
            this.f435bp = true;
            this.f436bq = false;
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: D */
    private void m105D(int i) {
        boolean z;
        if (this.f333Q > 0) {
            this.f333Q -= i;
            if (this.f333Q < 0) {
                this.f333Q = 0;
            }
        }
        if (this.f334R > 0) {
            i /= 3;
            this.f334R -= i;
            if (this.f334R < 0) {
                this.f334R = 0;
            }
            m188e();
        }
        if (this.f319C == 1 && (this.f540n & 8) == 0) {
            this.f322F += i;
            if ((5000 - this.f322F) / 1000 <= 0) {
                this.f324H += i;
            }
        }
        if ((this.f326J & 65536) == 65536) {
            this.f419bZ++;
            if (this.f419bZ >= 3) {
                this.f419bZ = 0;
            }
            m188e();
            this.f326J &= -65537;
        }
        if (i != 0) {
            int i2 = 65536 / i;
            for (int i3 = 1; i3 < 10; i3++) {
                int i4 = this.f373ag[i3].f140af;
                C0010e c0010e = this.f373ag[i3];
                int i5 = i3;
                while (this.f373ag[i5 - 1].f140af > i4) {
                    this.f373ag[i5] = this.f373ag[i5 - 1];
                    i5--;
                    if (i5 <= 0) {
                        break;
                    }
                }
                this.f373ag[i5] = c0010e;
            }
            for (int i6 = 0; i6 < 10; i6++) {
                this.f374ah[i6].m54c(i);
            }
            if (this.f322F >= 4000) {
                for (int i7 = 0; i7 < 10; i7++) {
                    this.f374ah[i7].m52b(i, i2);
                }
            } else if (this.f445bz.f369ac.f739s) {
                this.f371ae[0].f225k = 500000000;
                this.f371ae[0].m52b(i, i2);
            } else {
                for (int i8 = 0; i8 < 10; i8++) {
                    this.f373ag[i8].f90I = 0;
                    this.f373ag[i8].f240z = 0;
                    this.f373ag[i8].f82A = 0;
                    this.f373ag[i8].f87F = 0;
                    this.f373ag[i8].f88G = 0;
                    this.f373ag[i8].f89H = 0;
                    this.f373ag[i8].f144aj = 0;
                }
            }
            int i9 = 0;
            while (true) {
                int i10 = i9;
                if (i10 >= 10) {
                    break;
                }
                if (!this.f373ag[i10].f224j && this.f373ag[i10].f146al <= 2000) {
                    for (int i11 = i10 + 1; i11 < 10; i11++) {
                        if (!this.f373ag[i11].f224j && this.f373ag[i11].f146al <= 2000 && Math.abs(this.f373ag[i10].f237w - this.f373ag[i11].f237w) < 1500 && Math.abs(this.f373ag[i10].f238x - this.f373ag[i11].f238x) < 1500) {
                            this.f373ag[i10].m48a(this.f373ag[i11], i, i2);
                        }
                    }
                }
                i9 = i10 + 1;
            }
            if (!this.f445bz.f369ac.f729i) {
                if (this.f322F >= 6000) {
                    this.f495cw += i;
                    if (this.f445bz.f369ac.f728h > 0 && this.f495cw > 1000) {
                        for (int i12 = 0; i12 < this.f445bz.f369ac.f728h; i12++) {
                            if (this.f372af[i12].f224j) {
                                this.f372af[i12].f224j = false;
                                this.f372af[i12].f136ab = this.f371ae[0].f136ab;
                                this.f372af[i12].f151aq = 0;
                                int i13 = this.f371ae[0].f135aa - 2;
                                this.f372af[i12].f149ao = 0;
                                if (i13 < 0) {
                                    i13 = 0;
                                }
                                int i14 = this.f371ae[0].f90I + 3000;
                                if (i14 < (this.f372af[i12].f141ag >> 2)) {
                                    i14 = this.f372af[i12].f141ag >> 2;
                                }
                                this.f372af[i12].f86E = ((this.f372af[i12].f105X[(i13 * 5) + 2] << 8) + 4194304) & 16777215;
                                this.f372af[i12].f221g = false;
                                this.f372af[i12].f222h = false;
                                this.f372af[i12].f238x = this.f372af[i12].f105X[(i13 * 5) + 1] << 4;
                                this.f372af[i12].f237w = this.f372af[i12].f105X[i13 * 5] << 4;
                                this.f372af[i12].f135aa = i13;
                                this.f372af[i12].m51b(i13);
                                this.f372af[i12].f146al = 2000;
                                this.f372af[i12].f147am = 0;
                                this.f372af[i12].f240z = ((-m165a(this.f372af[i12].f86E >> 8)) * i14) >> 14;
                                this.f372af[i12].f82A = (i14 * (-m179b(this.f372af[i12].f86E >> 8))) >> 14;
                                this.f372af[i12].f90I = 0;
                                this.f372af[i12].f220f = false;
                                this.f372af[i12].f145ak = 0;
                                this.f372af[i12].f143ai = this.f372af[i12].f141ag;
                                this.f372af[i12].f150ap = 0;
                                this.f372af[i12].f236v = 0;
                                this.f372af[i12].f151aq = 0;
                                this.f495cw = 0;
                                break;
                            }
                        }
                    }
                    for (int i15 = 0; i15 < this.f445bz.f369ac.f728h; i15++) {
                        if (!this.f372af[i15].f224j && ((this.f372af[i15].f146al > 14000 || this.f372af[i15].f137ac > 4) && this.f372af[i15].f147am > 1000)) {
                            this.f372af[i15].f224j = true;
                        }
                    }
                }
                if (this.f445bz.f369ac.f741u != -1) {
                    int i16 = 0;
                    while (true) {
                        int i17 = i16;
                        if (i17 >= 3) {
                            break;
                        }
                        C0010e c0010e2 = this.f494cv[i17];
                        if (this.f371ae[0].f145ak > 2000 && (c0010e2.f146al > 2000 || c0010e2.f224j)) {
                            c0010e2.f224j = true;
                            c0010e2.f145ak = 0;
                            c0010e2.f240z = 0;
                            c0010e2.f82A = 0;
                            c0010e2.m49a(this.f486cn, this.f478cf, this.f483ck);
                            c0010e2.f221g = false;
                            c0010e2.f222h = false;
                            int iAbs = Math.abs(this.f513di.nextInt() >> 16) % c0010e2.f107Z;
                            int iAbs2 = Math.abs(this.f371ae[0].f237w - (c0010e2.f105X[iAbs * 5] << 4)) + Math.abs(this.f371ae[0].f238x - (c0010e2.f105X[(iAbs * 5) + 1] << 4));
                            if (iAbs2 > 20000 && iAbs2 < 51000) {
                                int i18 = -m165a(this.f331O >> 8);
                                int i19 = -m179b(this.f331O >> 8);
                                int i20 = c0010e2.f105X[iAbs * 5] << 4;
                                int i21 = c0010e2.f105X[(iAbs * 5) + 1] << 4;
                                if ((i18 * (i20 - this.f339W)) + (i19 * (i21 - this.f340X)) > 0) {
                                    int i22 = 0;
                                    while (i22 < 10) {
                                        C0010e c0010e3 = this.f373ag[i22];
                                        if (!c0010e3.f224j && c0010e3.f138ad != c0010e2.f138ad) {
                                            int i23 = c0010e3.f237w - i20;
                                            int i24 = c0010e3.f238x - i21;
                                            if ((i24 * i24) + (i23 * i23) < 1000000) {
                                                break;
                                            }
                                        }
                                        i22++;
                                    }
                                    if (i22 == 10) {
                                        c0010e2.f224j = false;
                                        c0010e2.f149ao = 0;
                                        c0010e2.f136ab = 0;
                                        int i25 = c0010e2.f141ag;
                                        if (c0010e2.f222h) {
                                            c0010e2.f86E = (((-c0010e2.f105X[(iAbs * 5) + 2]) << 8) - 4194304) & 16777215;
                                        } else {
                                            c0010e2.f86E = ((c0010e2.f105X[(iAbs * 5) + 2] << 8) + 4194304) & 16777215;
                                        }
                                        c0010e2.f237w = i20;
                                        c0010e2.f238x = i21;
                                        c0010e2.f136ab = this.f371ae[0].f136ab;
                                        c0010e2.f135aa = iAbs;
                                        c0010e2.m51b(iAbs);
                                        c0010e2.f146al = 0;
                                        c0010e2.f147am = 0;
                                        c0010e2.f240z = ((-m165a(c0010e2.f86E >> 8)) * i25) >> 14;
                                        c0010e2.f82A = (i25 * (-m179b(c0010e2.f86E >> 8))) >> 14;
                                        c0010e2.f83B = 0;
                                        c0010e2.f90I = 0;
                                        c0010e2.f220f = false;
                                        c0010e2.f145ak = 0;
                                        c0010e2.f143ai = c0010e2.f141ag;
                                        c0010e2.m54c(i);
                                        c0010e2.f151aq = 0;
                                        c0010e2.f153as = 0;
                                        c0010e2.f150ap = 0;
                                        c0010e2.f106Y = c0010e2.f105X;
                                        c0010e2.m49a(this.f336T, this.f474cb, this.f479cg);
                                    }
                                }
                            }
                        } else if (c0010e2.f146al > 2000) {
                            c0010e2.f224j = true;
                            c0010e2.f145ak = 0;
                            c0010e2.f240z = 0;
                            c0010e2.f82A = 0;
                        } else {
                            int i26 = this.f371ae[0].f237w - c0010e2.f237w;
                            int i27 = this.f371ae[0].f238x - c0010e2.f238x;
                            if (Math.abs(i26) + Math.abs(i27) > 2000) {
                                if ((i26 * (-m165a(this.f331O >> 8))) + (i27 * (-m179b(this.f331O >> 8))) > 0) {
                                    c0010e2.f146al = 2001;
                                    c0010e2.f224j = true;
                                    c0010e2.f145ak = 0;
                                    c0010e2.f240z = 0;
                                    c0010e2.f82A = 0;
                                }
                            }
                        }
                        i16 = i17 + 1;
                    }
                }
            }
            for (int i28 = 0; i28 < 10; i28++) {
                this.f374ah[i28].m46a(i, i2);
            }
        }
        if (this.f319C == 1) {
            if (Math.abs(this.f371ae[0].f90I) >= 6000) {
                z = true;
                break;
            }
            int i29 = 0;
            while (true) {
                if (i29 >= this.f445bz.f369ac.f728h) {
                    z = true;
                    break;
                }
                if (!this.f372af[i29].f224j && this.f372af[i29].f92K < 2500 && Math.abs(this.f372af[i29].f90I) < 6000) {
                    z = false;
                    this.f371ae[0].f148an += i;
                    break;
                }
                i29++;
            }
            if (this.f371ae[0].f148an > 0) {
                if (z) {
                    if (this.f371ae[0].f148an <= 1000 || this.f371ae[0].f148an >= 4000) {
                        if (this.f371ae[0].f148an > 1000) {
                            this.f445bz.m127a(this.f445bz.f551y.f308a[185], false);
                        }
                        this.f371ae[0].f148an = 0;
                    } else {
                        this.f371ae[0].f148an += i;
                    }
                }
                if (this.f371ae[0].f148an > 1000) {
                    this.f445bz.m127a(new StringBuffer().append(this.f445bz.f551y.f308a[186]).append(" ").append(((5000 - this.f371ae[0].f148an) / 1000) + 1).toString(), false);
                    if (this.f371ae[0].f148an > 5000) {
                        for (int i30 = 0; i30 < this.f445bz.f369ac.f728h; i30++) {
                            this.f372af[i30].f149ao = 4;
                        }
                        m211v(5);
                    }
                }
            }
        } else if (this.f319C == 4 || this.f319C == 5) {
            this.f371ae[0].f240z = (int) (this.f371ae[0].f240z * 0.95f);
            this.f371ae[0].f82A = (int) (this.f371ae[0].f82A * 0.95f);
            if (this.f319C == 5) {
                int iNextInt = this.f445bz.f513di.nextInt() & 1;
                C0010e c0010e4 = this.f371ae[0];
                c0010e4.m47a(0, 250, 2000, (((((c0010e4.f108a.f513di.nextInt() & 16384) - 8192) + c0010e4.f93L[iNextInt].f67b) >> 8) + c0010e4.f237w) >> 1, (c0010e4.f238x - ((((c0010e4.f108a.f513di.nextInt() & 16384) - 8192) + c0010e4.f93L[iNextInt].f68c) >> 8)) >> 1, (c0010e4.f93L[iNextInt].f69d >> 8) + 15);
            }
            for (int i31 = 0; i31 < this.f445bz.f369ac.f728h; i31++) {
                this.f372af[i31].f240z = (int) (this.f372af[i31].f240z * 0.95f);
                this.f372af[i31].f82A = (int) (this.f372af[i31].f82A * 0.95f);
            }
        }
        m109F(i);
        m110G(i);
        m153r();
        if (this.f319C == 1) {
            int i32 = 1;
            for (int i33 = 1; i33 < this.f445bz.f369ac.f727g + 1; i33++) {
                if (this.f371ae[i33].f137ac < 0) {
                    i32++;
                } else if (this.f371ae[i33].f137ac == 0 && this.f371ae[0].f154at < this.f371ae[i33].f154at) {
                    i32++;
                }
            }
            this.f370ad = i32;
            if (this.f371ae[0].f139ae > 0) {
                m152q();
            }
        }
        switch (this.f445bz.f369ac.f725e) {
            case 2:
                if (this.f371ae[1].f159ay == 3 && this.f371ae[1].f226l == 0 && !this.f457cK) {
                    this.f371ae[1].f226l = this.f371ae[1].f227m;
                    this.f371ae[1].f229o = 1;
                    this.f457cK = true;
                }
                if (this.f322F >= 4000) {
                    int i34 = this.f352aI;
                    int i35 = this.f454cH[i34];
                    int i36 = this.f454cH[i34 + 1];
                    int i37 = this.f371ae[0].f90I;
                    float f = i36 - i35;
                    if (f == 0.0f) {
                        this.f453cG = i37 - i35;
                    } else {
                        this.f453cG = (i37 - i35) / f;
                    }
                    int i38 = this.f371ae[0].f230p[i34];
                    int i39 = this.f371ae[0].f232r[i34];
                    int i40 = this.f460cN[i34];
                    C0010e c0010e5 = this.f371ae[0];
                    int i41 = (int) (i38 + (this.f453cG * (i39 - i38)));
                    c0010e5.f234t = i41;
                    this.f351aH = (i41 / 100) << 1;
                    if (i41 >= this.f445bz.f458cL[i34] + 1000) {
                        this.f353aJ -= 5;
                        if (this.f353aJ < 0) {
                            this.f353aJ = 0;
                        }
                    } else {
                        this.f353aJ += 5;
                        if (this.f353aJ > 100) {
                            this.f353aJ = 100;
                        }
                    }
                    if (i41 < this.f371ae[0].f231q[i34]) {
                        this.f455cI = false;
                    } else {
                        this.f455cI = true;
                    }
                    if (this.f352aI < 2 && this.f371ae[0].f229o != 3) {
                        this.f371ae[0].f229o = 2;
                        this.f371ae[0].f226l = 0;
                    }
                    if (((this.f326J & 256) == 256 || (this.f326J & 2097152) == 2097152) && this.f371ae[0].f229o == 0) {
                        this.f371ae[0].f226l = this.f371ae[0].f227m;
                        this.f371ae[0].f229o = 1;
                    }
                    if (this.f456cJ && this.f352aI < 4) {
                        this.f455cI = false;
                        this.f456cJ = false;
                        this.f352aI++;
                        if (i41 > i39 + i40 || i41 < i39 - i40) {
                            this.f353aJ -= (i39 - i41) / 100;
                        }
                    }
                }
                break;
        }
        if (this.f445bz.f369ac.f725e == 2) {
            this.f371ae[0].m49a(this.f337U, this.f475cc, this.f480ch);
            this.f371ae[1].m49a(this.f336T, this.f474cb, this.f479cg);
            this.f371ae[2].m49a(this.f484cl, this.f476cd, this.f481ci);
            this.f371ae[3].m49a(this.f485cm, this.f477ce, this.f482cj);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m106E() {
        int i = 0;
        this.f435bp = false;
        this.f436bq = false;
        try {
            if ((this.f541o & 8192) == 0) {
                if ((this.f541o & 4096) == 0) {
                    if ((this.f541o & 16384) != 0) {
                        C0005ae c0005ae = this.f445bz.f444by;
                        c0005ae.f55a.f534h = false;
                        c0005ae.f55a.m204o(280);
                        c0005ae.f55a.m204o(262);
                        c0005ae.f55a.m204o(268);
                        c0005ae.f55a.m204o(274);
                        return;
                    }
                    return;
                }
                C0022q c0022q = this.f445bz.f317A;
                c0022q.f627aM = null;
                if (c0022q.f686z < 12) {
                    c0022q.f614a.m204o(256);
                }
                c0022q.f614a.m204o(118);
                c0022q.f614a.m204o(162);
                c0022q.f614a.m204o(168);
                c0022q.f614a.m204o(174);
                c0022q.f614a.m204o(180);
                c0022q.f614a.m204o(232);
                c0022q.f614a.m204o(228);
                c0022q.f614a.m204o(224);
                c0022q.f614a.m204o(220);
                c0022q.f614a.m204o(216);
                c0022q.f614a.m204o(212);
                c0022q.f614a.m204o(156);
                c0022q.f614a.m204o(152);
                c0022q.f614a.m204o(148);
                c0022q.f614a.m204o(144);
                c0022q.f614a.m204o(140);
                c0022q.f614a.m204o(136);
                c0022q.f614a.m204o(132);
                c0022q.f614a.m204o(128);
                c0022q.f614a.m204o(124);
                c0022q.f682v = false;
                c0022q.f614a.m170a();
                c0022q.f614a.f543q = true;
                c0022q.f648am = null;
                c0022q.f649an = null;
                if (c0022q.f629aO != null) {
                    c0022q.f629aO.m12e();
                }
                while (i < 4) {
                    c0022q.f628aN[i] = null;
                    c0022q.f628aN[i] = null;
                    i++;
                }
                System.gc();
                this.f445bz.f552z.m78d();
                return;
            }
            this.f401bH = -1;
            m204o(this.f369ac.f736p);
            if (this.f445bz.f369ac.f728h > 0) {
                m204o(72);
                m204o(68);
                m204o(64);
                m204o(60);
                m204o(56);
                m204o(52);
            } else if (this.f369ac.f725e != 0 && this.f369ac.f725e != 1 && this.f369ac.f725e == 2) {
                m204o(86);
                m204o(82);
                m204o(78);
            }
            m204o(28);
            m204o(24);
            m204o(20);
            m204o(100);
            m204o(96);
            m204o(92);
            m204o(112);
            m204o(106);
            m204o(180);
            m204o(34);
            m204o(42);
            m204o(46);
            m204o(38);
            m170a();
            m192f();
            if (this.f381ao != null) {
                for (int i2 = 0; i2 < this.f496cx; i2++) {
                    this.f381ao[i2] = null;
                }
                this.f381ao = null;
                this.f381ao = null;
            }
            if (this.f497cy != null) {
                this.f497cy = null;
                this.f497cy = null;
            }
            if (this.f383aq != null) {
                this.f383aq = null;
                this.f383aq = null;
            }
            if (this.f384ar != null) {
                this.f384ar = null;
                this.f384ar = null;
            }
            if (this.f385as != null) {
                this.f385as = null;
                this.f385as = null;
            }
            if (this.f386at != null) {
                this.f386at = null;
                this.f386at = null;
            }
            if (this.f387au != null) {
                this.f387au = null;
                this.f387au = null;
            }
            if (this.f388av != null) {
                this.f388av = null;
                this.f388av = null;
            }
            if (this.f391ay != null) {
                this.f391ay = null;
                this.f391ay = null;
            }
            if (this.f389aw != null) {
                this.f389aw = null;
                this.f389aw = null;
            }
            if (this.f390ax != null) {
                this.f390ax = null;
                this.f390ax = null;
            }
            if (this.f344aA != null) {
                this.f344aA = null;
                this.f344aA = null;
            }
            if (this.f345aB != null) {
                this.f345aB = null;
                this.f345aB = null;
            }
            if (this.f347aD != null) {
                this.f347aD = null;
                this.f347aD = null;
            }
            this.f448cB = 0;
            if (this.f449cC != null) {
                this.f449cC = null;
                this.f449cC = null;
            }
            this.f450cD = 0;
            if (this.f451cE != null) {
                this.f451cE = null;
                this.f451cE = null;
            }
            for (int i3 = 0; i3 < 4; i3++) {
                if (this.f371ae != null && this.f371ae[i3] != null) {
                    this.f371ae[i3].m44a();
                }
            }
            if (this.f371ae != null) {
                for (int i4 = 0; i4 < 4; i4++) {
                    this.f371ae[i4] = null;
                }
                this.f371ae = null;
                this.f371ae = null;
            }
            if (this.f372af != null) {
                if (this.f372af[0] != null) {
                    this.f372af[0].f161b = null;
                }
                for (int i5 = 0; i5 < 3; i5++) {
                    if (this.f372af != null && this.f372af[i5] != null) {
                        this.f372af[i5].f161b = null;
                    }
                }
                for (int i6 = 0; i6 < 3; i6++) {
                    if (this.f372af != null && this.f372af[i6] != null) {
                        this.f372af[i6].m44a();
                    }
                }
                for (int i7 = 0; i7 < 3; i7++) {
                    this.f372af[i7] = null;
                }
                this.f372af = null;
                this.f372af = null;
            }
            for (int i8 = 0; i8 < 3; i8++) {
                if (this.f494cv != null && this.f494cv[i8] != null) {
                    this.f494cv[i8].m44a();
                }
            }
            if (this.f494cv != null) {
                for (int i9 = 0; i9 < 3; i9++) {
                    this.f494cv[i9] = null;
                }
                this.f494cv = null;
                this.f494cv = null;
            }
            if (this.f336T != null) {
                this.f336T = null;
            }
            if (this.f337U != null) {
                this.f337U = null;
            }
            if (this.f484cl != null) {
                this.f484cl = null;
            }
            if (this.f485cm != null) {
                this.f485cm = null;
            }
            if (this.f486cn != null) {
                this.f486cn = null;
            }
            if (this.f369ac.f733m != -1) {
                m204o(this.f369ac.f733m);
            }
            this.f474cb = 0;
            this.f475cc = 0;
            this.f478cf = 0;
            this.f479cg = 0;
            this.f480ch = 0;
            this.f483ck = 0;
            C0026u c0026u = this.f338V;
            if (c0026u.f704g != null) {
                for (int i10 = 0; i10 < c0026u.f703f; i10++) {
                    c0026u.f704g[i10] = null;
                }
            }
            c0026u.f704g = null;
            c0026u.f703f = 0;
            if (c0026u.f705h != null) {
                while (i < c0026u.f702e) {
                    c0026u.f705h[i] = null;
                    i++;
                }
            }
            c0026u.f705h = null;
            c0026u.f702e = 0;
            this.f338V = null;
            this.f488cp = null;
            this.f409bP = null;
            if (this.f454cH != null) {
                this.f454cH = null;
                this.f454cH = null;
            }
            this.f445bz.f552z.m78d();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: E */
    private void m107E(int i) {
        if (i < 0) {
            for (int i2 = 0; i2 < this.f445bz.f369ac.f728h; i2++) {
                this.f372af[i2].f149ao = 4;
            }
            this.f371ae[0].f151aq = 89601;
            m211v(5);
            return;
        }
        if (i != 0) {
            switch (this.f445bz.f369ac.f725e) {
                case 0:
                case 1:
                case 2:
                    this.f371ae[0].f139ae = i;
                    this.f371ae[0].f136ab = this.f445bz.f369ac.f726f;
                    m152q();
                    break;
            }
            return;
        }
        if (this.f369ac.f746z) {
            this.f371ae[0].f139ae = this.f370ad;
            int i3 = this.f369ac.f715A;
            if (this.f371ae[i3].f137ac < 0) {
                this.f371ae[i3].f139ae = this.f370ad - 1;
            } else {
                if (this.f371ae[i3].f137ac != 0 || this.f371ae[0].f154at >= this.f371ae[i3].f154at) {
                    return;
                }
                this.f371ae[i3].f139ae = this.f370ad - 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0840 A[PHI: r4
  0x0840: PHI (r4v87 int) = (r4v86 int), (r4v141 int), (r4v141 int) binds: [B:88:0x0503, B:119:0x083e, B:95:0x054c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: F */
    private void m108F() {
        char c;
        int iM59a;
        char c2;
        if (this.f435bp && this.f436bq) {
            try {
                if ((this.f541o & 8192) == 0) {
                    if ((this.f541o & 4096) != 0) {
                        this.f445bz.f317A.m239h();
                    } else if ((this.f541o & 16384) != 0) {
                        C0005ae c0005ae = this.f445bz.f444by;
                        C0016k c0016k = c0005ae.f55a.f551y;
                        if (c0005ae.f56b < 3000 && c0005ae.f56b > 0) {
                            c0005ae.f55a.m172a(0, 0, c0005ae.f55a.f446c, c0005ae.f55a.f499d);
                            c0005ae.f55a.m173a(0, 0, c0005ae.f55a.f446c, c0005ae.f55a.f499d, 16777215);
                            switch (c0005ae.f58d) {
                                case -99:
                                case 6:
                                    c0005ae.f56b = 3001;
                                    c0005ae.f58d++;
                                    break;
                                case 0:
                                case 1:
                                    c0005ae.f55a.m171a(298, (c0005ae.f55a.f446c - c0005ae.f55a.m205p(298)) >> 1, (c0005ae.f55a.f499d - c0005ae.f55a.m206q(298)) >> 1);
                                    if (c0005ae.f58d == 0) {
                                        c0005ae.f58d++;
                                    }
                                    break;
                                case 2:
                                    c0005ae.f55a.m171a(262, (c0005ae.f55a.f446c - c0005ae.f55a.m205p(262)) >> 1, (c0005ae.f55a.f499d - c0005ae.f55a.m206q(262)) >> 1);
                                    break;
                                case 3:
                                    c0005ae.f55a.m173a(0, 0, c0005ae.f55a.f446c, c0005ae.f55a.f499d, 0);
                                    int i = c0005ae.f55a.f446c >> 1;
                                    c0005ae.f55a.m173a(4, (c0005ae.f59e * 34) + 13, c0005ae.f55a.f446c - 4, 34, 8429708);
                                    c0005ae.f55a.f546t.m65a("English", 0, "English".length(), i, 17, 1);
                                    c0005ae.f55a.f546t.m65a(c0005ae.f55a.m168a("Français"), 0, c0005ae.f55a.m168a("Français").length(), i, 51, 1);
                                    c0005ae.f55a.f546t.m65a("Italiano", 0, "Italiano".length(), i, 85, 1);
                                    c0005ae.f55a.f546t.m65a("Deutsch", 0, "Deutsch".length(), i, 119, 1);
                                    c0005ae.f55a.f546t.m65a(c0005ae.f55a.m168a("Español"), 0, c0005ae.f55a.m168a("Español").length(), i, 153, 1);
                                    c0005ae.f55a.m171a(280, 0, c0005ae.f55a.f499d - c0005ae.f55a.m206q(280));
                                    break;
                                case 4:
                                    if (c0005ae.f55a.f534h) {
                                        c0005ae.f55a.f534h = false;
                                        c0005ae.f55a.m185d();
                                    }
                                    c0005ae.f55a.m173a(0, 0, c0005ae.f55a.f446c, c0005ae.f55a.f499d, 0);
                                    c0005ae.f55a.f546t.m61a(c0016k.f308a[80], 0, c0016k.f308a[80].length(), c0005ae.f55a.f446c - 16, c0005ae.f55a.f446c / 2, c0005ae.f55a.f499d / 3, 1, 0, -1, -1);
                                    c0016k.m95a();
                                    c0016k.m96a(0, 0);
                                    break;
                                case 5:
                                    c0005ae.f55a.m173a(0, 0, c0005ae.f55a.f446c, c0005ae.f55a.f499d, 0);
                                    int i2 = ((10000 - c0005ae.f57c) / 1000) + 1;
                                    boolean z = c0005ae.f55a.f533g > 0;
                                    c0005ae.f55a.f360aQ = "";
                                    if (z) {
                                        if (i2 == 1) {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            RunnableC0017l runnableC0017l = c0005ae.f55a;
                                            runnableC0017l.f360aQ = stringBuffer.append(runnableC0017l.f360aQ).append(c0016k.f308a[191]).toString();
                                        } else {
                                            StringBuffer stringBuffer2 = new StringBuffer();
                                            RunnableC0017l runnableC0017l2 = c0005ae.f55a;
                                            runnableC0017l2.f360aQ = stringBuffer2.append(runnableC0017l2.f360aQ).append(c0016k.f308a[193]).toString();
                                        }
                                    } else if (i2 == 1) {
                                        StringBuffer stringBuffer3 = new StringBuffer();
                                        RunnableC0017l runnableC0017l3 = c0005ae.f55a;
                                        runnableC0017l3.f360aQ = stringBuffer3.append(runnableC0017l3.f360aQ).append(c0016k.f308a[190]).toString();
                                    } else {
                                        StringBuffer stringBuffer4 = new StringBuffer();
                                        RunnableC0017l runnableC0017l4 = c0005ae.f55a;
                                        runnableC0017l4.f360aQ = stringBuffer4.append(runnableC0017l4.f360aQ).append(c0016k.f308a[192]).toString();
                                    }
                                    switch (i2) {
                                        case 0:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '0');
                                            break;
                                        case 1:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '1');
                                            break;
                                        case 2:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '2');
                                            break;
                                        case 3:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '3');
                                            break;
                                        case 4:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '4');
                                            break;
                                        case 5:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '5');
                                            break;
                                        case 6:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '6');
                                            break;
                                        case 7:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '7');
                                            break;
                                        case 8:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '8');
                                            break;
                                        case 9:
                                            c0005ae.f55a.f360aQ = c0005ae.f55a.f360aQ.replace('$', '9');
                                            break;
                                        case 10:
                                            int iIndexOf = c0005ae.f55a.f360aQ.indexOf(36);
                                            if (iIndexOf != -1) {
                                                c0005ae.f55a.f360aQ = new StringBuffer().append(c0005ae.f55a.f360aQ.substring(0, iIndexOf)).append("10").append(c0005ae.f55a.f360aQ.substring(iIndexOf + 1)).toString();
                                            }
                                            break;
                                    }
                                    c0005ae.f55a.f546t.m61a(c0005ae.f55a.f360aQ, 0, c0005ae.f55a.f360aQ.length(), c0005ae.f55a.f446c - 16, c0005ae.f55a.f446c / 2, c0005ae.f55a.f499d / 3, 1, 0, -1, -1);
                                    c0016k.m95a();
                                    c0016k.m96a(0, 0);
                                    c0016k.m96a(1, 1);
                                    break;
                                case 7:
                                    c0005ae.f55a.m171a(274, (c0005ae.f55a.f446c - c0005ae.f55a.m205p(274)) >> 1, (c0005ae.f55a.f499d - c0005ae.f55a.m206q(274)) >> 1);
                                    c0005ae.f55a.f546t.m61a(c0016k.f308a[73], 0, c0016k.f308a[73].length(), c0005ae.f55a.f446c - 16, c0005ae.f55a.f446c >> 1, c0005ae.f55a.f499d - (c0005ae.f55a.f499d >> 2), 1, 0, -1, -1);
                                    break;
                                case 8:
                                    c0005ae.f55a.m171a(268, (c0005ae.f55a.f446c - c0005ae.f55a.m205p(268)) >> 1, (c0005ae.f55a.f499d - c0005ae.f55a.m206q(268)) >> 1);
                                    c0005ae.f55a.f546t.m61a(c0016k.f308a[73], 0, c0016k.f308a[73].length(), c0005ae.f55a.f446c - 16, c0005ae.f55a.f446c >> 1, c0005ae.f55a.f499d - (c0005ae.f55a.f499d >> 2), 1, 0, -1, -1);
                                    break;
                            }
                        }
                    }
                } else if (!this.f472cZ) {
                    if (this.f319C == 1) {
                        m154s();
                    } else if (this.f319C == 4 || this.f319C == 6 || this.f319C == 5) {
                        C0016k c0016k2 = this.f445bz.f551y;
                        if (this.f370ad == 1) {
                            c = 'J';
                        } else if (this.f370ad == 2) {
                            c = 'K';
                        } else {
                            c = this.f370ad == 3 ? 'L' : 'M';
                        }
                        m173a(0, 0, this.f446c, this.f499d, 0);
                        c0016k2.m95a();
                        c0016k2.m96a(0, 0);
                        m171a(180, this.f446c - m205p(180), 0);
                        int i3 = this.f446c >> 1;
                        this.f549w.m61a(c0016k2.f308a[189], 0, c0016k2.f308a[189].length(), this.f446c, this.f446c - 2, m206q(180) >> 1, 6, 0, -1, -1);
                        int iM206q = m206q(180) + 5;
                        if (this.f369ac.f728h <= 0) {
                            int i4 = this.f369ac.f721a;
                            int i5 = this.f369ac.f722b;
                            int iM59a2 = this.f445bz.f545s.m59a(c0016k2.f308a[117], 0, c0016k2.f308a[117].length());
                            if (iM59a2 <= 0) {
                                iM59a2 = 0;
                            }
                            int iM59a3 = this.f445bz.f545s.m59a(c0016k2.f308a[c], 0, c0016k2.f308a[c].length());
                            if (iM59a3 <= 0) {
                                iM59a3 = 0;
                            }
                            int iM59a4 = this.f445bz.f545s.m59a(c0016k2.f308a[118], 0, c0016k2.f308a[118].length());
                            if (iM59a4 <= iM59a2) {
                                iM59a4 = iM59a2;
                            }
                            m210u(this.f322F - 4000);
                            int iM59a5 = this.f445bz.f545s.m59a(this.f445bz.f360aQ, 0, this.f445bz.f360aQ.length());
                            if (iM59a5 <= iM59a3) {
                                iM59a5 = iM59a3;
                            }
                            if (this.f317A.f629aO.f23s[i4][i5].f70a != 0) {
                                int iM59a6 = this.f445bz.f545s.m59a(c0016k2.f308a[119], 0, c0016k2.f308a[119].length());
                                if (iM59a6 <= iM59a4) {
                                    iM59a6 = iM59a4;
                                }
                                this.f445bz.f360aQ = "";
                                StringBuffer stringBuffer5 = new StringBuffer();
                                RunnableC0017l runnableC0017l5 = this.f445bz;
                                runnableC0017l5.f360aQ = stringBuffer5.append(runnableC0017l5.f360aQ).append(this.f371ae[0].f94M).toString();
                                int iM59a7 = this.f445bz.f545s.m59a(this.f445bz.f360aQ, 0, this.f445bz.f360aQ.length());
                                if (iM59a7 <= iM59a5) {
                                    iM59a7 = iM59a5;
                                }
                                iM59a4 = this.f445bz.f545s.m59a(c0016k2.f308a[120], 0, c0016k2.f308a[120].length());
                                if (iM59a4 <= iM59a6) {
                                    iM59a4 = iM59a6;
                                }
                                this.f445bz.f360aQ = "";
                                StringBuffer stringBuffer6 = new StringBuffer();
                                RunnableC0017l runnableC0017l6 = this.f445bz;
                                runnableC0017l6.f360aQ = stringBuffer6.append(runnableC0017l6.f360aQ).append(this.f317A.f629aO.f23s[i4][i5].f70a).toString();
                                iM59a5 = this.f445bz.f545s.m59a(this.f445bz.f360aQ, 0, this.f445bz.f360aQ.length());
                                if (iM59a5 <= iM59a7) {
                                    iM59a5 = iM59a7;
                                }
                            }
                            if (this.f369ac.f731k) {
                                iM59a = iM59a5;
                            } else {
                                int iM59a8 = this.f445bz.f545s.m59a(c0016k2.f308a[123], 0, c0016k2.f308a[123].length());
                                if (iM59a8 > iM59a4) {
                                    iM59a4 = iM59a8;
                                }
                                if (!this.f493cu ? (iM59a = this.f445bz.f545s.m59a(c0016k2.f308a[122], 0, c0016k2.f308a[122].length())) <= iM59a5 : (iM59a = this.f445bz.f545s.m59a(c0016k2.f308a[121], 0, c0016k2.f308a[121].length())) <= iM59a5) {
                                    iM59a = iM59a5;
                                }
                            }
                            int i6 = iM59a4 + iM59a + 4;
                            int i7 = ((this.f446c - i6) >> 1) + iM59a4;
                            int i8 = (this.f446c - ((this.f446c - i6) >> 1)) - iM59a;
                            this.f545s.m65a(c0016k2.f308a[117], 0, c0016k2.f308a[117].length(), i7, iM206q, 2);
                            this.f545s.m65a(c0016k2.f308a[c], 0, c0016k2.f308a[c].length(), i8, iM206q, 0);
                            int i9 = iM206q + 18;
                            this.f545s.m65a(c0016k2.f308a[118], 0, c0016k2.f308a[118].length(), i7, i9, 2);
                            m210u(this.f322F - 4000);
                            this.f545s.m65a(this.f445bz.f360aQ, 0, this.f445bz.f360aQ.length(), i8, i9, 0);
                            int i10 = i9 + 18;
                            if (this.f317A.f629aO.f23s[i4][i5].f70a != 0) {
                                this.f545s.m65a(c0016k2.f308a[119], 0, c0016k2.f308a[119].length(), i7, i10, 2);
                                this.f445bz.f360aQ = "";
                                StringBuffer stringBuffer7 = new StringBuffer();
                                RunnableC0017l runnableC0017l7 = this.f445bz;
                                runnableC0017l7.f360aQ = stringBuffer7.append(runnableC0017l7.f360aQ).append(this.f371ae[0].f94M).toString();
                                this.f545s.m65a(this.f445bz.f360aQ, 0, this.f445bz.f360aQ.length(), i8, i10, 0);
                                int i11 = i10 + 18;
                                this.f545s.m65a(c0016k2.f308a[120], 0, c0016k2.f308a[120].length(), i7, i11, 2);
                                this.f445bz.f360aQ = "";
                                StringBuffer stringBuffer8 = new StringBuffer();
                                RunnableC0017l runnableC0017l8 = this.f445bz;
                                runnableC0017l8.f360aQ = stringBuffer8.append(runnableC0017l8.f360aQ).append(this.f317A.f629aO.f23s[i4][i5].f70a).toString();
                                this.f545s.m65a(this.f445bz.f360aQ, 0, this.f445bz.f360aQ.length(), i8, i11, 0);
                                i10 = i11 + 18;
                            }
                            if (!this.f369ac.f731k) {
                                this.f545s.m65a(c0016k2.f308a[123], 0, c0016k2.f308a[123].length(), i7, i10, 2);
                                if (this.f493cu) {
                                    this.f545s.m65a(c0016k2.f308a[121], 0, c0016k2.f308a[121].length(), i8, i10, 0);
                                } else {
                                    this.f545s.m65a(c0016k2.f308a[122], 0, c0016k2.f308a[122].length(), i8, i10, 0);
                                }
                                int iM61a = i10 + 18 + 5;
                                if (this.f370ad != 1 || (this.f317A.f629aO.f23s[i4][i5].f70a != 0 && this.f371ae[0].f94M < this.f317A.f629aO.f23s[i4][i5].f70a)) {
                                    iM61a = this.f546t.m61a(c0016k2.f308a[124], 0, c0016k2.f308a[124].length(), this.f446c, i3, iM61a, 1, 0, -1, -1);
                                } else if (this.f317A.f667g) {
                                    iM61a = this.f546t.m61a(c0016k2.f308a[147], 0, c0016k2.f308a[147].length(), this.f446c, i3, iM61a, 1, 0, -1, -1);
                                } else if (this.f369ac.f717C) {
                                    iM61a = this.f546t.m61a(c0016k2.f308a[116], 0, c0016k2.f308a[116].length(), this.f446c, i3, iM61a, 1, 0, -1, -1);
                                }
                                int i12 = iM61a + 5;
                                if (!this.f493cu) {
                                    this.f445bz.f360aQ = "";
                                    StringBuffer stringBuffer9 = new StringBuffer();
                                    RunnableC0017l runnableC0017l9 = this.f445bz;
                                    runnableC0017l9.f360aQ = stringBuffer9.append(runnableC0017l9.f360aQ).append(c0016k2.f308a[this.f369ac.f716B + 150]).toString();
                                    StringBuffer stringBuffer10 = new StringBuffer();
                                    RunnableC0017l runnableC0017l10 = this.f445bz;
                                    runnableC0017l10.f360aQ = stringBuffer10.append(runnableC0017l10.f360aQ).append(" ").toString();
                                    StringBuffer stringBuffer11 = new StringBuffer();
                                    RunnableC0017l runnableC0017l11 = this.f445bz;
                                    runnableC0017l11.f360aQ = stringBuffer11.append(runnableC0017l11.f360aQ).append(c0016k2.f308a[188]).toString();
                                    this.f546t.m61a(this.f360aQ, 0, this.f360aQ.length(), this.f446c, i3, i12, 1, 0, -1, -1);
                                } else if (this.f369ac.f718D) {
                                    int i13 = this.f317A.f629aO.f23s[i4][i5].f76g[this.f369ac.f715A - 1];
                                    this.f445bz.f360aQ = "";
                                    StringBuffer stringBuffer12 = new StringBuffer();
                                    RunnableC0017l runnableC0017l12 = this.f445bz;
                                    runnableC0017l12.f360aQ = stringBuffer12.append(runnableC0017l12.f360aQ).append(c0016k2.f308a[i13 + 150]).toString();
                                    StringBuffer stringBuffer13 = new StringBuffer();
                                    RunnableC0017l runnableC0017l13 = this.f445bz;
                                    runnableC0017l13.f360aQ = stringBuffer13.append(runnableC0017l13.f360aQ).append(" ").toString();
                                    StringBuffer stringBuffer14 = new StringBuffer();
                                    RunnableC0017l runnableC0017l14 = this.f445bz;
                                    runnableC0017l14.f360aQ = stringBuffer14.append(runnableC0017l14.f360aQ).append(c0016k2.f308a[187]).toString();
                                    this.f546t.m61a(this.f360aQ, 0, this.f360aQ.length(), this.f446c, i3, i12, 1, 0, -1, -1);
                                }
                            }
                        } else if (this.f319C == 5) {
                            int iM61a2 = this.f546t.m61a(c0016k2.f308a[66], 0, c0016k2.f308a[66].length(), this.f446c, i3, iM206q, 1, 0, -1, -1) + 5;
                            if (!this.f369ac.f731k) {
                                this.f546t.m61a(c0016k2.f308a[114], 0, c0016k2.f308a[114].length(), this.f446c, i3, iM61a2, 1, 0, -1, -1);
                            }
                        } else {
                            int iM61a3 = this.f546t.m61a(c0016k2.f308a[115], 0, c0016k2.f308a[115].length(), this.f446c, i3, iM206q, 1, 0, -1, -1) + 5;
                            if (!this.f369ac.f731k) {
                                if (this.f317A.f667g) {
                                    this.f546t.m61a(c0016k2.f308a[147], 0, c0016k2.f308a[147].length(), this.f446c, i3, iM61a3, 1, 0, -1, -1);
                                } else if (this.f369ac.f717C) {
                                    this.f546t.m61a(c0016k2.f308a[116], 0, c0016k2.f308a[116].length(), this.f446c, i3, iM61a3, 1, 0, -1, -1);
                                }
                            }
                        }
                    } else if (this.f319C == 3) {
                        C0016k c0016k3 = this.f445bz.f551y;
                        m173a(0, 0, this.f446c, this.f499d, 0);
                        if (this.f445bz.f317A.f674n == 1) {
                            m172a(0, 4, this.f446c, this.f445bz.f317A.f684x);
                            this.f445bz.f317A.m228a(this.f445bz.f317A.f681u + 1024, this.f445bz.f317A.f678r, (this.f445bz.f317A.f684x / this.f445bz.f317A.f679s) + 1);
                            m172a(0, 0, this.f446c, this.f499d);
                            if (this.f445bz.f317A.f683w * this.f445bz.f317A.f679s > this.f445bz.f317A.f684x) {
                                m173a(this.f446c - 4, 4, 3, this.f445bz.f317A.f684x, 16711680);
                                int i14 = (((this.f445bz.f317A.f684x - 7) * this.f445bz.f317A.f678r) / this.f445bz.f317A.f683w) + 4;
                                int i15 = ((this.f445bz.f317A.f684x - 7) * (this.f445bz.f317A.f684x / this.f445bz.f317A.f679s)) / this.f445bz.f317A.f683w;
                                if (i15 > this.f445bz.f317A.f684x - 7) {
                                    i15 = this.f445bz.f317A.f684x - 7;
                                }
                                m173a(this.f446c - 3, i14 + 3, 1, i15, 16777215);
                            }
                            c0016k3.m95a();
                            c0016k3.m96a(2, 1);
                        } else {
                            m172a(0, 0, this.f446c, this.f499d);
                            if (this.f445bz.f317A.f674n == 6) {
                                this.f546t.m61a(c0016k3.f308a[55], 0, c0016k3.f308a[55].length(), this.f446c - 24, this.f446c >> 1, 20, 1, 0, -1, -1);
                                c0016k3.m95a();
                                c0016k3.m96a(2, 1);
                                c0016k3.m96a(0, 0);
                                int iM206q2 = (((this.f499d - 17) - m206q(220)) - 20) - 20;
                                m171a(186, 0, (this.f508dc * 20) + iM206q2);
                                this.f548v.m65a(c0016k3.f308a[1], 0, c0016k3.f308a[1].length(), this.f446c >> 1, iM206q2 + 2, 1);
                                this.f548v.m65a(c0016k3.f308a[2], 0, c0016k3.f308a[2].length(), this.f446c >> 1, iM206q2 + 20 + 2, 1);
                            } else if (this.f445bz.f317A.f674n == 7) {
                                this.f546t.m61a(c0016k3.f308a[54], 0, c0016k3.f308a[54].length(), this.f446c - 24, this.f446c >> 1, 20, 1, 0, -1, -1);
                                c0016k3.m95a();
                                c0016k3.m96a(2, 1);
                                c0016k3.m96a(0, 0);
                                int iM206q3 = (((this.f499d - 17) - m206q(220)) - 20) - 20;
                                m171a(186, 0, (this.f508dc * 20) + iM206q3);
                                this.f548v.m65a(c0016k3.f308a[1], 0, c0016k3.f308a[1].length(), this.f446c >> 1, iM206q3 + 2, 1);
                                this.f548v.m65a(c0016k3.f308a[2], 0, c0016k3.f308a[2].length(), this.f446c >> 1, iM206q3 + 20 + 2, 1);
                            } else {
                                if (this.f509dd == 0) {
                                    this.f549w.m65a(c0016k3.f308a[49], 0, c0016k3.f308a[49].length(), this.f446c >> 1, 12, 1);
                                } else {
                                    this.f549w.m65a(c0016k3.f308a[9], 0, c0016k3.f308a[9].length(), this.f446c >> 1, 12, 1);
                                }
                                int i16 = this.f508dc;
                                if (this.f408bO == 2) {
                                    i16 = this.f508dc != 0 ? 1 : 0;
                                }
                                m171a(186, 0, (i16 * 20) + 40);
                                c0016k3.m95a();
                                c0016k3.m96a(2, 1);
                                if (this.f509dd == 0) {
                                    this.f548v.m65a(c0016k3.f308a[50], 0, c0016k3.f308a[50].length(), this.f446c >> 1, 42, 1);
                                    this.f548v.m65a(c0016k3.f308a[53], 0, c0016k3.f308a[53].length(), this.f446c >> 1, 62, 1);
                                    this.f445bz.f360aQ = "";
                                    StringBuffer stringBuffer15 = new StringBuffer();
                                    RunnableC0017l runnableC0017l15 = this.f445bz;
                                    runnableC0017l15.f360aQ = stringBuffer15.append(runnableC0017l15.f360aQ).append(c0016k3.f308a[72]).toString();
                                    StringBuffer stringBuffer16 = new StringBuffer();
                                    RunnableC0017l runnableC0017l16 = this.f445bz;
                                    runnableC0017l16.f360aQ = stringBuffer16.append(runnableC0017l16.f360aQ).append(" ").toString();
                                    StringBuffer stringBuffer17 = new StringBuffer();
                                    RunnableC0017l runnableC0017l17 = this.f445bz;
                                    runnableC0017l17.f360aQ = stringBuffer17.append(runnableC0017l17.f360aQ).append(this.f533g).toString();
                                    this.f548v.m65a(this.f360aQ, 0, this.f360aQ.length(), this.f446c >> 1, 82, 1);
                                    if (this.f508dc == 2 && !this.f445bz.m199j(303) && ((this.f542p >> 9) & 1) == 1) {
                                        if (this.f533g > 0) {
                                            m189e(10, 88);
                                        }
                                        if (this.f533g < 5) {
                                            m186d((this.f446c - 10) - 4, 88);
                                        }
                                    }
                                    this.f445bz.f360aQ = "";
                                    StringBuffer stringBuffer18 = new StringBuffer();
                                    RunnableC0017l runnableC0017l18 = this.f445bz;
                                    runnableC0017l18.f360aQ = stringBuffer18.append(runnableC0017l18.f360aQ).append(c0016k3.f308a[68]).toString();
                                    StringBuffer stringBuffer19 = new StringBuffer();
                                    RunnableC0017l runnableC0017l19 = this.f445bz;
                                    runnableC0017l19.f360aQ = stringBuffer19.append(runnableC0017l19.f360aQ).append(" ").toString();
                                    if (this.f445bz.f535i) {
                                        StringBuffer stringBuffer20 = new StringBuffer();
                                        RunnableC0017l runnableC0017l20 = this.f445bz;
                                        runnableC0017l20.f360aQ = stringBuffer20.append(runnableC0017l20.f360aQ).append(c0016k3.f308a[70]).toString();
                                    } else {
                                        StringBuffer stringBuffer21 = new StringBuffer();
                                        RunnableC0017l runnableC0017l21 = this.f445bz;
                                        runnableC0017l21.f360aQ = stringBuffer21.append(runnableC0017l21.f360aQ).append(c0016k3.f308a[69]).toString();
                                    }
                                    this.f548v.m65a(this.f360aQ, 0, this.f360aQ.length(), this.f446c >> 1, 102, 1);
                                    if (this.f508dc == 3 && ((this.f542p >> 9) & 1) == 1) {
                                        m189e(10, 108);
                                        m186d((this.f446c - 10) - 4, 108);
                                    }
                                    this.f548v.m65a(c0016k3.f308a[9], 0, c0016k3.f308a[9].length(), this.f446c >> 1, 122, 1);
                                    this.f548v.m65a(c0016k3.f308a[51], 0, c0016k3.f308a[51].length(), this.f446c >> 1, 142, 1);
                                    if (this.f508dc != 2 && this.f508dc != 3) {
                                        c0016k3.m96a(0, 0);
                                    }
                                } else if (this.f509dd == 1) {
                                    this.f548v.m65a(c0016k3.f308a[36], 0, c0016k3.f308a[36].length(), this.f446c >> 1, 42, 1);
                                    this.f548v.m65a(c0016k3.f308a[38], 0, c0016k3.f308a[38].length(), this.f446c >> 1, 62, 1);
                                    this.f548v.m65a(c0016k3.f308a[23], 0, c0016k3.f308a[23].length(), this.f446c >> 1, 82, 1);
                                    c0016k3.m96a(0, 0);
                                }
                            }
                            if (this.f407bN != 0) {
                                m171a(298, (this.f446c - m205p(298)) >> 1, (this.f499d - m206q(298)) >> 1);
                                this.f406bM = true;
                            } else {
                                this.f406bM = false;
                            }
                        }
                    } else if (this.f319C == 2) {
                        C0016k c0016k4 = this.f445bz.f551y;
                        m172a(0, 0, this.f446c, this.f499d);
                        m173a(0, 0, this.f446c, this.f499d, 0);
                        int i17 = (int) (this.f499d * 0.04f);
                        int i18 = (int) (this.f446c * 0.8f);
                        int i19 = (int) (this.f499d - (this.f499d * 0.1f));
                        int i20 = (int) (this.f446c * 0.1f);
                        int i21 = (int) (this.f499d * 0.02f);
                        int i22 = (int) (this.f446c * 0.78f);
                        int i23 = (int) (this.f446c * 0.78f);
                        int i24 = i19 + ((i17 - i21) >> 1);
                        int i25 = i20 + ((i18 - i22) >> 1);
                        if (this.f397bD < 16) {
                            int i26 = i19 - 18;
                            if (this.f397bD != 15) {
                                this.f546t.m65a(c0016k4.f308a[46], 0, c0016k4.f308a[46].length(), this.f446c >> 1, i26, 1);
                                m173a(i20 - 1, i19 - 1, i18 + 2, i17 + 2, 16416779);
                                m173a(i20, i19, i18, i17, 0);
                                if (this.f397bD >= 14) {
                                    m173a(i25, i24, i22, i21, 16416779);
                                } else if (this.f397bD > 0 && this.f397bD <= 13) {
                                    m173a(i25, i24, (this.f397bD * i23) / 13, i21, 16416779);
                                } else if (this.f397bD > 0) {
                                    int i27 = i23 + ((this.f397bD * (i22 - i23)) / 14);
                                    if (i27 > i22) {
                                        i27 = i22;
                                    }
                                    m173a(i25, i24, i27, i21, 16416779);
                                }
                            } else {
                                this.f546t.m61a(c0016k4.f308a[73], 0, c0016k4.f308a[73].length(), this.f446c, this.f446c >> 1, i26, 1, 0, -1, -1);
                            }
                            int i28 = this.f369ac.f725e;
                            if (this.f369ac.f728h > 0) {
                                i28 = 3;
                            }
                            int i29 = (i28 * 3) + 134 + this.f507db;
                            this.f546t.m61a(c0016k4.f308a[i29], 0, c0016k4.f308a[i29].length(), this.f446c, this.f446c >> 1, m206q(180) + 5, 1, 0, -1, -1);
                        } else {
                            c0016k4.m95a();
                            c0016k4.m96a(0, 0);
                            if (this.f369ac.f725e == 0) {
                                c2 = this.f369ac.f728h > 0 ? (char) 132 : (char) 129;
                            } else if (this.f369ac.f725e == 1) {
                                c2 = 130;
                            } else {
                                c2 = this.f369ac.f725e == 2 ? (char) 131 : (char) 0;
                            }
                            m171a(180, this.f446c - m205p(180), 0);
                            int iM206q4 = ((this.f445bz.m206q(180) - this.f445bz.f549w.m67c()) - this.f445bz.f550x.m67c()) >> 1;
                            this.f445bz.f549w.m65a(c0016k4.f308a[128], 0, c0016k4.f308a[128].length(), this.f445bz.f446c - 2, iM206q4, 2);
                            this.f445bz.f550x.m65a(c0016k4.f308a[(this.f369ac.f721a * 4) + 81 + this.f369ac.f722b], 0, c0016k4.f308a[(this.f369ac.f721a * 4) + 81 + this.f369ac.f722b].length(), this.f445bz.f446c - 2, iM206q4 + this.f445bz.f549w.m67c(), 2);
                            int iM61a4 = this.f546t.m61a(c0016k4.f308a[c2], 0, c0016k4.f308a[c2].length(), this.f446c, this.f446c >> 1, m206q(180) + 5, 1, 0, -1, -1);
                            int i30 = this.f369ac.f721a;
                            int i31 = this.f369ac.f722b;
                            if (this.f317A.f629aO.f23s[i30][i31].f70a != 0) {
                                int i32 = iM61a4 + 18;
                                this.f445bz.f360aQ = "";
                                StringBuffer stringBuffer22 = new StringBuffer();
                                RunnableC0017l runnableC0017l22 = this.f445bz;
                                runnableC0017l22.f360aQ = stringBuffer22.append(runnableC0017l22.f360aQ).append(c0016k4.f308a[146]).toString();
                                StringBuffer stringBuffer23 = new StringBuffer();
                                RunnableC0017l runnableC0017l23 = this.f445bz;
                                runnableC0017l23.f360aQ = stringBuffer23.append(runnableC0017l23.f360aQ).append(this.f317A.f629aO.f23s[i30][i31].f70a).toString();
                                this.f546t.m61a(this.f360aQ, 0, this.f360aQ.length(), this.f446c, this.f446c >> 1, i32, 1, 0, -1, -1);
                            }
                        }
                        if (this.f399bF > 0) {
                            m182c();
                            this.f406bM = true;
                        }
                        if (this.f397bD < 0) {
                            this.f397bD++;
                        }
                    } else if (this.f319C == 7 && this.f515dk > 0) {
                        this.f443bx.m244b();
                        this.f445bz.m154s();
                        this.f445bz.f551y.m95a();
                        this.f445bz.f551y.m96a(7, 0);
                        this.f445bz.f551y.m96a(105, 1);
                    }
                }
                if (this.f439bt) {
                    this.f441bv = System.currentTimeMillis();
                    this.f442bw = this.f441bv - this.f440bu;
                    if (this.f442bw <= 0) {
                        this.f442bw = 1L;
                    }
                    this.f445bz.f360aQ = new StringBuffer().append("").append((int) (1000 / this.f442bw)).toString();
                    this.f546t.m65a(this.f360aQ, 0, this.f360aQ.length(), this.f446c >> 1, this.f499d, 9);
                    this.f440bu = System.currentTimeMillis();
                }
                if ((this.f540n & 128) != 0) {
                    this.f445bz.f360aQ = new StringBuffer().append("").append(this.f378al).toString();
                    this.f546t.m65a(this.f360aQ, 0, this.f360aQ.length(), (this.f446c >> 1) + (this.f446c >> 2), this.f499d, 9);
                }
                if ((this.f540n & 32) != 0) {
                    if ((this.f540n & 64) != 0) {
                        System.gc();
                    }
                    f312aS.setClip(0, 0, this.f446c, this.f499d);
                    f312aS.setColor(0);
                    f312aS.fillRect(0, 0, this.f446c, 50);
                    f312aS.setColor(255, 255, 255);
                    long j = Runtime.getRuntime().totalMemory();
                    long jFreeMemory = Runtime.getRuntime().freeMemory();
                    f312aS.drawString(new StringBuffer().append("TotalMem: ").append(String.valueOf(j)).toString(), this.f446c - 10, 10, 24);
                    String string = f313dG ? new StringBuffer().append("").append("D").toString() : "";
                    if ((this.f540n & 64) != 0) {
                        string = new StringBuffer().append(string).append("G").toString();
                    }
                    f312aS.drawString(new StringBuffer().append(new StringBuffer().append(string).append(" UsedMem: ").toString()).append(String.valueOf(j - jFreeMemory)).toString(), this.f446c - 10, 30, 24);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x024c  */
    /* JADX INFO: renamed from: F */
    private void m109F(int i) {
        if (this.f330N) {
            if (this.f451cE != null) {
                int i2 = 999999999;
                int i3 = -1;
                for (int i4 = 0; i4 < this.f450cD; i4++) {
                    int i5 = (this.f451cE[(i4 << 2) + 1] - this.f371ae[0].f237w) >> 4;
                    int i6 = (this.f451cE[(i4 << 2) + 2] - this.f371ae[0].f238x) >> 4;
                    int i7 = (i5 * i5) + (i6 * i6);
                    if (i7 < i2) {
                        i2 = i7;
                        i3 = i4;
                    }
                }
                if (i2 < 400000) {
                    this.f339W = this.f451cE[(i3 << 2) + 1];
                    this.f340X = this.f451cE[(i3 << 2) + 2];
                    this.f489cq = this.f451cE[(i3 << 2) + 3];
                    this.f490cr = this.f445bz.m191f((this.f339W - this.f371ae[0].f237w) >> 4, (this.f340X - this.f371ae[0].f238x) >> 4) & 16777215;
                    this.f331O = this.f490cr;
                    this.f341Y = -60.0f;
                    if (this.f492ct == -1) {
                        this.f492ct = this.f419bZ;
                    }
                    this.f419bZ = 2;
                    m188e();
                    return;
                }
                if (this.f341Y != 0.0f) {
                    this.f419bZ = this.f492ct;
                    this.f492ct = -1;
                    m188e();
                }
                this.f341Y = 0.0f;
            }
            this.f339W = this.f371ae[0].f237w;
            this.f340X = this.f371ae[0].f238x;
            this.f489cq = this.f371ae[0].f239y;
            this.f490cr = this.f371ae[0].f86E;
            if (this.f319C == 5) {
                this.f490cr = this.f331O + 1048576;
            }
            if (this.f371ae[0].f235u && this.f445bz.f332P != 2) {
                if (this.f371ae[0].f240z == 0 && this.f371ae[0].f82A == 0) {
                    this.f490cr = this.f371ae[0].f86E;
                } else {
                    this.f490cr = m191f(-this.f371ae[0].f240z, -this.f371ae[0].f82A) & 16777215;
                }
            }
            if (this.f319C == 4 && this.f445bz.f369ac.f725e == 0) {
                C0007b c0007b = new C0007b();
                this.f338V.m252a(this.f374ah[0].f105X[0] << 12, (-this.f374ah[0].f105X[1]) << 12, c0007b);
                this.f339W = this.f374ah[0].f105X[0] << 4;
                this.f340X = this.f374ah[0].f105X[1] << 4;
                this.f489cq = c0007b.f69d >> 8;
                this.f490cr = (this.f374ah[0].f105X[2] << 8) + 4194304;
                this.f331O = (this.f374ah[0].f105X[2] << 8) + 4194304;
                this.f371ae[0].f226l = 0;
                this.f333Q = 0;
                this.f419bZ = 10;
                m188e();
                return;
            }
            this.f490cr &= 16777215;
            if (this.f331O - this.f490cr > 8388608) {
                this.f331O -= 16777216;
            } else if (this.f331O - this.f490cr < -8388608) {
                this.f331O += 16777216;
            }
            if (Math.abs(this.f331O - this.f490cr) < 25000) {
                this.f331O = this.f490cr;
            } else {
                this.f331O -= this.f490cr;
                if (this.f322F <= 5000 || !this.f371ae[0].f235u) {
                    this.f331O = ((this.f331O >> 4) * (m190f((-i) * 12) >> 4)) >> 8;
                } else {
                    int i8 = (((this.f371ae[0].f240z * this.f371ae[0].f240z) + (this.f371ae[0].f82A * this.f371ae[0].f82A)) >> 16) * 80;
                    int i9 = 10000;
                    if (this.f371ae[0].f220f) {
                        i9 = 1250;
                    } else if (this.f371ae[0].f104W > 0) {
                        if (this.f371ae[0].f104W < 1024) {
                            i9 = (((1024 - this.f371ae[0].f104W) * 8750) >> 10) + 1250;
                        } else {
                            i9 = 1250;
                        }
                    }
                    if (i8 <= i9) {
                        i9 = i8;
                    }
                    if (this.f331O > 0) {
                        this.f331O -= i9 * i;
                        if (this.f331O < 0) {
                            this.f331O = 0;
                        }
                    } else if (this.f331O < 0) {
                        this.f331O = (i9 * i) + this.f331O;
                        if (this.f331O > 0) {
                            this.f331O = 0;
                        }
                    }
                }
                this.f331O += this.f490cr;
            }
            this.f331O &= 16777215;
        }
    }

    /* JADX INFO: renamed from: G */
    private void m110G(int i) {
        int iNextInt;
        this.f491cs = 90.0f + this.f465cS + this.f341Y;
        if (this.f371ae[0].f229o == 1) {
            if (this.f371ae[0].f226l > (this.f371ae[0].f227m >> 2)) {
                this.f491cs += (this.f371ae[0].f227m - this.f371ae[0].f226l) * 0.01f;
            } else {
                this.f491cs += this.f371ae[0].f226l * 0.025f;
            }
        }
        if (this.f491cs >= 120.0f) {
            this.f491cs = 120.0f;
        } else if (this.f491cs <= 20.0f) {
            this.f491cs = 20.0f;
        }
        if (this.f330N) {
            this.f445bz.f552z.m76b(this.f491cs);
        }
        int i2 = this.f416bW;
        int i3 = this.f417bX;
        int iNextInt2 = this.f418bY;
        if (this.f332P == 2 || this.f332P == 10) {
            this.f411bR = this.f413bT;
        } else {
            this.f411bR = this.f371ae[0].f90I >> 6;
            if (this.f371ae[0].f219e > 0) {
                if (this.f371ae[0].f219e > 1200) {
                    this.f371ae[0].f219e = 1200;
                }
                this.f411bR -= this.f371ae[0].f219e >> 5;
                i2 += this.f371ae[0].f219e << 7;
            }
            if (this.f411bR < -200) {
                this.f411bR = -200;
            } else if (this.f411bR > 500) {
                this.f411bR = 500;
            }
            if (this.f371ae[0].f229o == 1) {
                this.f411bR += (this.f371ae[0].f226l - (this.f371ae[0].f227m >> 1)) / 50;
            }
            this.f411bR += this.f413bT;
        }
        int iM165a = (m165a(this.f331O >> 8) * this.f411bR) >> 14;
        int iM179b = (m179b(this.f331O >> 8) * this.f411bR) >> 14;
        if (this.f333Q > 0) {
            iNextInt = ((this.f513di.nextInt() & 32767) - 16383) + i2;
            iNextInt2 = ((this.f513di.nextInt() & 32767) - 16383) + iNextInt2;
        } else {
            iNextInt = i2;
        }
        if (this.f341Y != 0.0f) {
            this.f342Z = this.f339W;
            this.f367aa = this.f340X;
        } else {
            this.f342Z = this.f339W - (iM165a << 1);
            this.f367aa = this.f340X - (iM179b << 1);
        }
        this.f328L.setIdentity();
        this.f328L.postTranslate((iM165a + this.f339W) * 0.00390625f, (this.f489cq + this.f415bV + this.f412bS) * 0.00390625f, (iM179b + this.f340X) * 0.00390625f);
        if (this.f332P == 2) {
            this.f328L.postRotate(this.f490cr * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
            this.f328L.postRotate(iNextInt * 2.1457672E-5f, 1.0f, 0.0f, 0.0f);
            this.f328L.postRotate(i3 * 2.1457672E-5f, 0.0f, 0.0f, 1.0f);
            this.f328L.postRotate(iNextInt2 * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
            return;
        }
        if (this.f332P == 10) {
            this.f328L.postRotate((this.f490cr + 8388608) * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
            this.f328L.postRotate(iNextInt * 2.1457672E-5f, 1.0f, 0.0f, 0.0f);
            this.f328L.postRotate(i3 * 2.1457672E-5f, 0.0f, 0.0f, 1.0f);
            this.f328L.postRotate(iNextInt2 * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
            return;
        }
        this.f328L.postRotate(this.f331O * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
        this.f328L.postRotate(iNextInt * 2.1457672E-5f, 1.0f, 0.0f, 0.0f);
        this.f328L.postRotate(i3 * 2.1457672E-5f, 0.0f, 0.0f, 1.0f);
        this.f328L.postRotate(iNextInt2 * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
        int i4 = (int) ((6.5f - (this.f491cs / 90.0f)) * 256.0f);
        this.f409bP.f67b = this.f371ae[0].f93L[2].f67b;
        this.f409bP.f68c = this.f371ae[0].f93L[2].f68c;
        this.f409bP.f69d = this.f371ae[0].f93L[2].f69d;
        this.f409bP.f66a = this.f371ae[0].f93L[2].f66a;
        int iM165a2 = m165a(this.f331O >> 8);
        int iM179b2 = m179b(this.f331O >> 8);
        int i5 = -iM179b2;
        int i6 = this.f339W + ((iM165a2 * i4) >> 14) + ((i5 * (-300)) >> 14);
        int i7 = this.f340X + ((iM179b2 * i4) >> 14) + ((iM165a2 * (-300)) >> 14);
        this.f338V.m252a(i6 << 8, (-i7) << 8, this.f409bP);
        if (this.f409bP.f66a == -1) {
            this.f409bP.f67b = i6 << 8;
            this.f409bP.f68c = (-i7) << 8;
            this.f409bP.f69d = this.f489cq << 8;
        }
        int i8 = ((((this.f409bP.f67b >> 8) - this.f339W) * iM165a2) + ((((-this.f409bP.f68c) >> 8) - this.f340X) * iM179b2)) >> 14;
        int i9 = this.f409bP.f69d;
        this.f409bP.f67b = this.f371ae[0].f93L[3].f67b;
        this.f409bP.f68c = this.f371ae[0].f93L[3].f68c;
        this.f409bP.f69d = this.f371ae[0].f93L[3].f69d;
        this.f409bP.f66a = this.f371ae[0].f93L[3].f66a;
        int i10 = (this.f339W + ((iM165a2 * i4) >> 14)) - ((i5 * (-300)) >> 14);
        int i11 = (((i4 * iM179b2) >> 14) + this.f340X) - ((iM165a2 * (-300)) >> 14);
        this.f338V.m252a(i10 << 8, (-i11) << 8, this.f409bP);
        if (this.f409bP.f66a == -1) {
            this.f409bP.f67b = i10 << 8;
            this.f409bP.f68c = (-i11) << 8;
            this.f409bP.f69d = this.f489cq << 8;
        }
        int i12 = ((((this.f409bP.f67b >> 8) - this.f339W) * iM165a2) + ((((-this.f409bP.f68c) >> 8) - this.f340X) * iM179b2)) >> 14;
        if (i8 <= i12) {
            i12 = i8;
        }
        int i13 = (this.f409bP.f69d + i9) >> 9;
        int iM191f = i13 > this.f489cq ? m191f(i13 - this.f489cq, i12) >> 8 : 0;
        this.f473ca -= iM191f;
        this.f473ca = (this.f473ca * m190f((-i) << 3)) >> 16;
        this.f473ca = iM191f + this.f473ca;
        int i14 = (this.f473ca << 8) + 0;
        this.f410bQ -= i14;
        this.f410bQ = (this.f410bQ * 200) >> 8;
        this.f410bQ = i14 + this.f410bQ;
        this.f328L.postRotate(-(this.f410bQ * 2.1457672E-5f), 1.0f, 0.0f, 0.0f);
        this.f328L.postTranslate(0.0f, 2.0f, i12 * 0.00390625f * 256.0f * 0.00390625f);
        this.f412bS = this.f414bU;
    }

    /* JADX INFO: renamed from: H */
    private void m111H(int i) {
        this.f515dk = (short) (this.f515dk + i);
        if (this.f515dk >= this.f514dj) {
            this.f515dk = (short) (this.f514dj - 1);
            if (!this.f445bz.f369ac.f729i) {
                for (int i2 = 0; i2 < 10; i2++) {
                    for (int i3 = 0; i3 < 4; i3++) {
                        this.f371ae[i3].m52b(i, 1310);
                    }
                    for (int i4 = 0; i4 < 4; i4++) {
                        this.f371ae[i4].f240z = 0;
                        this.f371ae[i4].f82A = 0;
                        this.f371ae[i4].f83B = 0;
                    }
                    for (int i5 = 1; i5 < 4; i5++) {
                        this.f371ae[0].m48a(this.f371ae[i5], i, 1310);
                    }
                    for (int i6 = 0; i6 < 4; i6++) {
                        this.f371ae[i6].m46a(i, 1310);
                    }
                }
                if (this.f445bz.f369ac.f739s) {
                    this.f371ae[0].f240z = (this.f371ae[0].f155au * (this.f371ae[0].f141ag - this.f371ae[0].f157aw)) >> 14;
                    this.f371ae[0].f82A = (this.f371ae[0].f156av * (this.f371ae[0].f141ag - this.f371ae[0].f157aw)) >> 14;
                    if (this.f445bz.f369ac.f728h > 0) {
                        this.f371ae[0].f240z >>= 2;
                        this.f371ae[0].f82A >>= 2;
                    }
                }
                this.f445bz.m157v();
                return;
            }
            if (this.f319C != 4) {
                m211v(4);
            }
        }
        int i7 = this.f515dk << 16;
        m133a(this.f528dx, i7, this.f519do[0], this.f518dn[0]);
        m140b(this.f529dy, i7, this.f519do[1], this.f518dn[1]);
        m140b(this.f530dz, i7, this.f519do[2], this.f518dn[2]);
        this.f445bz.f491cs = ((this.f445bz.m191f(this.f445bz.f499d >> 1, 2097152 / this.f530dz[2]) << 1) * 360.0f) / 1.6777216E7f;
        this.f445bz.f552z.m76b(this.f445bz.f491cs);
        this.f445bz.f339W = this.f445bz.f402bI[0];
        this.f445bz.f340X = this.f445bz.f402bI[1];
        this.f445bz.f489cq = this.f445bz.f402bI[2];
        this.f445bz.f410bQ = this.f445bz.f403bJ[0] + (this.f529dy[0] << 8);
        this.f445bz.f331O = this.f445bz.f403bJ[2] - (this.f529dy[1] << 8);
        this.f500dA.setIdentity();
        this.f500dA.postRotate(this.f445bz.f403bJ[2] * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
        this.f500dA.postRotate(this.f445bz.f403bJ[0] * 2.1457672E-5f, 1.0f, 0.0f, 0.0f);
        this.f500dA.postTranslate(-(this.f528dx[0] * 0.00390625f), -(this.f528dx[1] * 0.00390625f), this.f528dx[2] * 0.00390625f);
        this.f500dA.get(this.f501dB);
        RunnableC0017l runnableC0017l = this.f445bz;
        runnableC0017l.f339W = (int) (runnableC0017l.f339W + (this.f501dB[3] * 256.0f));
        RunnableC0017l runnableC0017l2 = this.f445bz;
        runnableC0017l2.f340X = (int) (runnableC0017l2.f340X + (this.f501dB[11] * 256.0f));
        RunnableC0017l runnableC0017l3 = this.f445bz;
        runnableC0017l3.f489cq = (int) (runnableC0017l3.f489cq + (this.f501dB[7] * 256.0f));
        this.f445bz.f328L.setIdentity();
        this.f445bz.f328L.postTranslate(this.f445bz.f339W * 0.00390625f, this.f445bz.f489cq * 0.00390625f, this.f445bz.f340X * 0.00390625f);
        this.f445bz.f328L.postRotate(this.f445bz.f331O * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
        this.f445bz.f328L.postRotate(-(this.f445bz.f410bQ * 2.1457672E-5f), 1.0f, 0.0f, 0.0f);
        for (int i8 = 0; i8 < this.f520dp; i8++) {
            if (m133a(this.f528dx, i7, this.f524dt[i8][0], this.f523ds[i8][0]) && m140b(this.f529dy, i7, this.f524dt[i8][1], this.f523ds[i8][1])) {
                int i9 = this.f445bz.f374ah[i8].f237w;
                int i10 = this.f445bz.f374ah[i8].f238x;
                if (i8 <= this.f369ac.f727g) {
                    this.f445bz.f374ah[i8].f224j = false;
                } else {
                    this.f445bz.f374ah[i8].f224j = true;
                }
                this.f445bz.f374ah[i8].f237w = this.f445bz.f402bI[0];
                this.f445bz.f374ah[i8].f238x = this.f445bz.f402bI[1];
                this.f445bz.f374ah[i8].f239y = this.f445bz.f402bI[2];
                this.f445bz.f374ah[i8].f84C = this.f445bz.f403bJ[0] + (this.f529dy[0] << 8);
                this.f445bz.f374ah[i8].f85D = this.f445bz.f403bJ[1] + (this.f529dy[2] << 8);
                this.f445bz.f374ah[i8].f86E = this.f445bz.f403bJ[2] - (this.f529dy[1] << 8);
                this.f500dA.setIdentity();
                this.f500dA.postRotate(this.f445bz.f403bJ[2] * 2.1457672E-5f, 0.0f, 1.0f, 0.0f);
                this.f500dA.postTranslate((-this.f528dx[0]) * 0.00390625f, -(this.f528dx[1] * 0.00390625f), this.f528dx[2] * 0.00390625f);
                this.f500dA.get(this.f501dB);
                C0010e c0010e = this.f445bz.f374ah[i8];
                c0010e.f237w = (int) (c0010e.f237w + (this.f501dB[3] * 256.0f));
                C0010e c0010e2 = this.f445bz.f374ah[i8];
                c0010e2.f238x = (int) (c0010e2.f238x + (this.f501dB[11] * 256.0f));
                C0010e c0010e3 = this.f445bz.f374ah[i8];
                c0010e3.f239y = (int) (c0010e3.f239y + (this.f501dB[7] * 256.0f));
                this.f445bz.f374ah[i8].f92K = 0;
                if (i9 != this.f445bz.f374ah[i8].f237w || i10 != this.f445bz.f374ah[i8].f238x) {
                    this.f445bz.f374ah[i8].f161b.f289b += 300;
                }
                this.f445bz.f374ah[i8].m53c();
            }
        }
        this.f445bz.m153r();
    }

    /* JADX INFO: renamed from: I */
    private void m112I(int i) {
        this.f445bz.f413bT = 0;
        this.f445bz.f414bU = 0;
        this.f445bz.f415bV = 0;
        this.f445bz.f416bW = 0;
        this.f445bz.f417bX = 0;
        this.f445bz.f418bY = 0;
        C0007b c0007b = new C0007b();
        this.f445bz.f338V.m252a(this.f445bz.f374ah[0].f105X[i * 5] << 12, (-this.f445bz.f374ah[0].f105X[(i * 5) + 1]) << 12, c0007b);
        this.f445bz.f402bI[0] = this.f445bz.f374ah[0].f105X[i * 5] << 4;
        this.f445bz.f402bI[1] = this.f445bz.f374ah[0].f105X[(i * 5) + 1] << 4;
        this.f445bz.f402bI[2] = c0007b.f69d >> 8;
        this.f445bz.f403bJ[0] = 0;
        this.f445bz.f403bJ[1] = 0;
        if (this.f445bz.f401bH == 4) {
            this.f445bz.f403bJ[2] = (this.f445bz.f374ah[0].f105X[(i * 5) + 2] << 8) + 4194304;
        } else {
            this.f445bz.f403bJ[2] = (this.f445bz.f374ah[0].f105X[(i * 5) + 2] << 8) + 4194304 + 8388608;
        }
    }

    /* JADX INFO: renamed from: J */
    private void m113J(int i) {
        Image2D image2D;
        if (this.f472cZ) {
            return;
        }
        if (this.f319C == 1) {
            m105D(i);
            return;
        }
        if (this.f319C != 2) {
            if (this.f319C != 3) {
                if (this.f319C != 4 && this.f319C != 5 && this.f319C != 6) {
                    if (this.f319C == 7) {
                        m111H(i);
                        return;
                    }
                    return;
                } else {
                    if (this.f405bL) {
                        this.f542p = 0;
                        m204o(180);
                        this.f540n &= -3;
                        m182c();
                        m212x(4097);
                        this.f405bL = false;
                        return;
                    }
                    return;
                }
            }
            if (this.f407bN == 0 || !this.f406bM) {
                return;
            }
            if (this.f407bN == 1) {
                if (this.f445bz.f317A.f674n == 6 || this.f445bz.f317A.f674n == 7) {
                    this.f445bz.f317A.f674n = (byte) 0;
                } else if (this.f509dd == 1) {
                    this.f509dd = 0;
                    this.f508dc = 4;
                    this.f407bN = 0;
                } else if (this.f509dd == 0) {
                    this.f508dc = 0;
                    this.f407bN = 2;
                }
            }
            if (this.f407bN != 2) {
                this.f407bN = 0;
                this.f406bM = false;
                return;
            }
            if (this.f509dd == 0) {
                if (this.f445bz.f317A.f674n == 6) {
                    if (this.f508dc == 0) {
                        this.f371ae[0].f226l = 0;
                        this.f334R = 0;
                        this.f335S = 0;
                        m182c();
                        this.f317A.f668h = -1;
                        m212x(4097);
                    } else {
                        this.f508dc = 5;
                        this.f317A.f674n = (byte) 0;
                    }
                } else if (this.f445bz.f317A.f674n == 7) {
                    if (this.f508dc == 0) {
                        this.f319C = 2;
                        m160x();
                        m211v(2);
                        this.f397bD = 5;
                    } else {
                        this.f508dc = 1;
                        this.f317A.f674n = (byte) 0;
                    }
                } else if (this.f508dc == 0) {
                    this.f319C = this.f408bO;
                    this.f542p = 400;
                    m209t(this.f533g);
                    m177a(false);
                    m151p();
                    if (this.f371ae[0].f91J <= 2 || this.f371ae[0].f225k > 0) {
                    }
                } else if (this.f508dc == 1) {
                    if (this.f408bO != 2) {
                        this.f317A.f674n = (byte) 7;
                    }
                } else if (this.f508dc == 4) {
                    this.f509dd = 1;
                    this.f508dc = 0;
                } else if (this.f508dc == 5) {
                    this.f317A.f674n = (byte) 6;
                    this.f508dc = 1;
                }
            } else if (this.f509dd == 1) {
                if (this.f508dc == 0) {
                    m182c();
                    this.f317A.m233b(C0016k.m93a(0), false);
                } else if (this.f508dc == 1) {
                    m182c();
                    this.f317A.m233b(C0016k.m93a(1), false);
                } else if (this.f508dc == 2) {
                    this.f509dd = 0;
                    this.f508dc = 4;
                }
            }
            this.f407bN = 0;
            this.f406bM = false;
            return;
        }
        System.gc();
        if (this.f399bF > 0) {
            int i2 = this.f399bF + 1;
            this.f399bF = i2;
            if (i2 <= 2 || !this.f406bM) {
                return;
            }
            if (!this.f369ac.f731k) {
                this.f445bz.f317A.f588A = true;
                this.f445bz.f317A.f589B = this.f445bz.f317A.f671k;
                this.f445bz.f317A.f590C = this.f445bz.f317A.f670j;
            }
            m182c();
            this.f445bz.m204o(180);
            m212x(4097);
            return;
        }
        if (this.f397bD >= 0) {
            if (this.f397bD < 16) {
                if (this.f397bD > 13 && this.f397bD < 14 && this.f445bz.f538l >= 10) {
                    this.f397bD += 40;
                    if (this.f397bD >= 14) {
                        this.f397bD = 14;
                    }
                }
                switch (this.f397bD) {
                    case 1:
                        this.f445bz.f317A.f629aO.m10c();
                        if (this.f445bz.f369ac.f728h > 0) {
                            m176a(72, false);
                            m176a(68, false);
                            m176a(64, false);
                            m176a(60, false);
                            m176a(56, false);
                            m176a(52, false);
                        } else if (this.f369ac.f725e != 0 && this.f369ac.f725e != 1 && this.f369ac.f725e == 2) {
                            m176a(86, false);
                            m176a(82, false);
                            m176a(78, false);
                        }
                        m176a(28, false);
                        m176a(24, false);
                        m176a(20, false);
                        m176a(100, false);
                        m176a(96, false);
                        m176a(92, false);
                        m176a(112, false);
                        m176a(106, false);
                        m176a(34, false);
                        m176a(42, false);
                        m176a(46, false);
                        m176a(38, false);
                        break;
                    case 2:
                        System.gc();
                        int i3 = this.f445bz.f369ac.f744x;
                        int iM213y = this.f445bz.m213y(i3);
                        this.f447cA = this.f445bz.m164B(iM213y);
                        if (this.f447cA != 0) {
                            this.f386at = new short[this.f447cA];
                            this.f387au = new short[this.f447cA];
                            this.f388av = new short[this.f447cA];
                            this.f389aw = new short[this.f447cA];
                            this.f391ay = new int[this.f447cA];
                            this.f390ax = new int[this.f447cA];
                            for (int i4 = 0; i4 < this.f447cA; i4++) {
                                this.f386at[i4] = (short) this.f445bz.m164B(iM213y);
                                this.f387au[i4] = (short) this.f445bz.m164B(iM213y);
                                this.f388av[i4] = this.f445bz.m163A(iM213y);
                                this.f389aw[i4] = this.f445bz.m163A(iM213y);
                                this.f391ay[i4] = 16777216 / this.f388av[i4];
                                this.f390ax[i4] = 65536 / this.f389aw[i4];
                            }
                        } else {
                            this.f386at = null;
                            this.f387au = null;
                            this.f388av = null;
                            this.f389aw = null;
                            this.f390ax = null;
                            this.f391ay = null;
                        }
                        this.f498cz = this.f445bz.m164B(iM213y);
                        String[] strArr = new String[this.f498cz];
                        for (int i5 = 0; i5 < this.f498cz; i5++) {
                            char cM164B = this.f445bz.m164B(iM213y);
                            strArr[i5] = new String();
                            for (int i6 = 0; i6 < cM164B; i6++) {
                                strArr[i5] = new StringBuffer().append(strArr[i5]).append(this.f445bz.m164B(iM213y)).toString();
                            }
                            strArr[i5] = new StringBuffer().append(strArr[i5]).append(".m3g").toString();
                        }
                        int iM163A = this.f445bz.m163A(iM213y);
                        String[] strArr2 = new String[iM163A];
                        boolean[] zArr = new boolean[iM163A];
                        short[] sArr = new short[iM163A];
                        for (int i7 = 0; i7 < iM163A; i7++) {
                            sArr[i7] = (short) this.f445bz.m164B(iM213y);
                            char cM164B2 = this.f445bz.m164B(iM213y);
                            zArr[i7] = false;
                            if ((cM164B2 & 128) != 0) {
                                zArr[i7] = true;
                            }
                            strArr2[i7] = new String();
                            char c = (char) (cM164B2 & 127);
                            for (int i8 = 0; i8 < c; i8++) {
                                strArr2[i7] = new StringBuffer().append(strArr2[i7]).append(this.f445bz.m164B(iM213y)).toString();
                            }
                            strArr2[i7] = new StringBuffer().append(strArr2[i7]).append(".png").toString();
                            strArr2[i7] = strArr2[i7].replace('\\', '/');
                        }
                        int iM163A2 = this.f445bz.m163A(iM213y);
                        int[] iArr = new int[iM163A2];
                        int[] iArr2 = new int[iM163A2];
                        int[] iArr3 = new int[iM163A2];
                        for (int i9 = 0; i9 < iM163A2; i9++) {
                            iArr[i9] = this.f445bz.m164B(iM213y);
                            iArr2[i9] = this.f445bz.m163A(iM213y);
                            iArr3[i9] = this.f445bz.m163A(iM213y);
                        }
                        this.f382ap = this.f445bz.m163A(iM213y);
                        this.f383aq = new short[this.f382ap];
                        this.f384ar = new short[this.f382ap];
                        this.f385as = new int[this.f382ap << 2];
                        for (int i10 = 0; i10 < this.f382ap; i10++) {
                            short sM163A = this.f445bz.m163A(iM213y);
                            this.f383aq[i10] = (short) ((63488 & sM163A) >> 11);
                            this.f384ar[i10] = (short) (sM163A & 2047);
                            this.f385as[i10 << 2] = this.f445bz.m164B(iM213y) | (this.f445bz.m164B(iM213y) << '\b') | (this.f445bz.m164B(iM213y) << 16) | (this.f445bz.m164B(iM213y) << 24);
                            this.f385as[(i10 << 2) + 1] = this.f445bz.m164B(iM213y) | (this.f445bz.m164B(iM213y) << '\b') | (this.f445bz.m164B(iM213y) << 16) | (this.f445bz.m164B(iM213y) << 24);
                            this.f385as[(i10 << 2) + 2] = this.f445bz.m164B(iM213y) | (this.f445bz.m164B(iM213y) << '\b') | (this.f445bz.m164B(iM213y) << 16) | (this.f445bz.m164B(iM213y) << 24);
                            this.f385as[(i10 << 2) + 3] = this.f445bz.m164B(iM213y) | (this.f445bz.m164B(iM213y) << '\b') | (this.f445bz.m164B(iM213y) << 16) | (this.f445bz.m164B(iM213y) << 24);
                        }
                        this.f347aD = null;
                        this.f346aC = this.f445bz.m163A(iM213y);
                        m128a(this.f346aC >= 0, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 2649, this.f445bz);
                        if (this.f346aC > 0) {
                            this.f347aD = new int[this.f346aC << 1];
                            for (int i11 = 0; i11 < this.f346aC; i11++) {
                                this.f347aD[i11 << 1] = this.f445bz.m163A(iM213y) & 65535;
                                this.f347aD[(i11 << 1) + 1] = this.f445bz.m163A(iM213y);
                            }
                        }
                        this.f445bz.m203n(i3);
                        this.f445bz.f552z.f264a = new Mesh[this.f498cz][];
                        for (int i12 = 0; i12 < this.f498cz; i12++) {
                            this.f445bz.f552z.m74a(strArr[i12], i12);
                            strArr[i12] = null;
                        }
                        this.f392az = (short) 0;
                        for (int i13 = 0; i13 < iM163A; i13++) {
                            Appearance appearance = new Appearance();
                            appearance.setPolygonMode(this.f445bz.f552z.f265b);
                            Image imageCreateImage = Image.createImage(new StringBuffer().append("/").append(strArr2[i13]).toString());
                            if (zArr[i13]) {
                                image2D = new Image2D(100, imageCreateImage);
                                appearance.setCompositingMode(this.f445bz.f552z.f269f);
                            } else {
                                image2D = new Image2D(99, imageCreateImage);
                            }
                            Texture2D texture2D = new Texture2D(image2D);
                            texture2D.setFiltering(208, 210);
                            texture2D.setWrapping(241, 241);
                            texture2D.setBlending(228);
                            appearance.setTexture(0, texture2D);
                            for (int i14 = 0; i14 < iM163A2; i14++) {
                                if (iArr3[i14] == i13) {
                                    this.f445bz.f552z.f264a[iArr[i14]][iArr2[i14]].setAppearance(0, appearance);
                                    if (sArr[i13] != 255) {
                                        this.f392az = (short) (this.f392az + 1);
                                    }
                                }
                            }
                            System.gc();
                        }
                        for (int i15 = 0; i15 < this.f445bz.f552z.f264a.length; i15++) {
                            for (int i16 = 0; i16 < this.f445bz.f552z.f264a[i15].length; i16++) {
                                if (this.f445bz.f552z.f264a[i15][i16].getAppearance(0) == null) {
                                    this.f445bz.f552z.f264a[i15][i16] = null;
                                }
                            }
                        }
                        this.f344aA = new short[this.f392az];
                        this.f345aB = new VertexBuffer[this.f392az];
                        int i17 = 0;
                        for (int i18 = 0; i18 < iM163A; i18++) {
                            for (int i19 = 0; i19 < iM163A2; i19++) {
                                if (iArr3[i19] == i18 && sArr[i18] != 255) {
                                    this.f344aA[i17] = sArr[i18];
                                    this.f345aB[i17] = this.f445bz.f552z.f264a[iArr[i19]][iArr2[i19]].getVertexBuffer();
                                    i17++;
                                }
                            }
                        }
                        System.gc();
                        System.gc();
                        break;
                    case 3:
                        m176a(this.f445bz.f369ac.f736p, false);
                        m115L(this.f445bz.f369ac.f742v);
                        System.gc();
                        break;
                    case 4:
                        this.f369ac.f727g = this.f445bz.f317A.f629aO.f23s[this.f369ac.f721a][this.f369ac.f722b].f75f;
                        if (this.f369ac.f727g == 1 && this.f445bz.f317A.f629aO.f23s[this.f369ac.f721a][this.f369ac.f722b].f76g[0] == 31) {
                            this.f369ac.f727g = 0;
                        }
                        for (int i20 = 0; i20 < 3; i20++) {
                            this.f372af[i20] = new C0010e(this);
                            this.f372af[i20].m45a(-(i20 + 1));
                            this.f372af[i20].m49a(this.f336T, this.f474cb, this.f479cg);
                            this.f372af[i20].f224j = true;
                            this.f372af[i20].f214c = true;
                            this.f372af[i20].f158ax = 112;
                            if (i20 == 0) {
                                this.f372af[0].f161b.m90b(31);
                            } else {
                                this.f372af[i20].f161b = null;
                                this.f372af[i20].f161b = this.f372af[0].f161b;
                            }
                        }
                        for (int i21 = 0; i21 < 3; i21++) {
                            this.f494cv[i21] = new C0010e(this);
                            this.f494cv[i21].m45a(-(i21 + 10));
                            this.f494cv[i21].f224j = true;
                            this.f494cv[i21].f223i = true;
                            if (this.f369ac.f741u != -1) {
                                Math.abs(this.f513di.nextInt());
                                this.f494cv[i21].f161b.m90b(-1);
                            }
                        }
                        this.f359aP = 1.0f;
                        this.f358aO = 4000;
                        this.f354aK = 1;
                        this.f355aL = 50;
                        this.f356aM = 5;
                        this.f357aN = 20;
                        break;
                    case 5:
                        this.f419bZ = 0;
                        m188e();
                        break;
                    case 6:
                        int i22 = this.f369ac.f743w;
                        this.f338V.m253a(this, this.f445bz.m213y(i22));
                        this.f338V.f706i = this.f369ac.f745y;
                        this.f445bz.m203n(i22);
                        int i23 = this.f369ac.f740t;
                        int i24 = this.f369ac.f741u;
                        int iM213y2 = this.f445bz.m213y(i23);
                        this.f474cb = this.f445bz.m163A(iM213y2);
                        this.f336T = new short[this.f474cb * 5];
                        m130a(this.f336T, this.f474cb, iM213y2);
                        this.f479cg = m122a(this.f336T, this.f474cb);
                        m139b(this.f336T, this.f474cb);
                        this.f475cc = this.f445bz.m163A(iM213y2);
                        this.f337U = new short[this.f475cc * 5];
                        m130a(this.f337U, this.f475cc, iM213y2);
                        this.f480ch = m122a(this.f337U, this.f475cc);
                        m139b(this.f337U, this.f475cc);
                        if (this.f445bz.f369ac.f725e == 2) {
                            this.f476cd = this.f445bz.m163A(iM213y2);
                            this.f484cl = new short[this.f476cd * 5];
                            m130a(this.f484cl, this.f476cd, iM213y2);
                            this.f481ci = m122a(this.f484cl, this.f476cd);
                            m139b(this.f484cl, this.f476cd);
                            this.f477ce = this.f445bz.m163A(iM213y2);
                            this.f485cm = new short[this.f477ce * 5];
                            m130a(this.f485cm, this.f477ce, iM213y2);
                            this.f482cj = m122a(this.f485cm, this.f477ce);
                            m139b(this.f485cm, this.f477ce);
                        } else {
                            this.f476cd = 0;
                            this.f477ce = 0;
                            this.f484cl = null;
                            this.f485cm = null;
                            this.f481ci = 0;
                            this.f482cj = 0;
                        }
                        this.f445bz.m203n(i23);
                        if (i24 != -1) {
                            int iM213y3 = this.f445bz.m213y(i24);
                            this.f478cf = this.f445bz.m163A(iM213y3);
                            this.f486cn = new short[this.f478cf * 5];
                            m130a(this.f486cn, this.f478cf, iM213y3);
                            this.f483ck = m122a(this.f486cn, this.f478cf);
                            m139b(this.f486cn, this.f478cf);
                            this.f445bz.m203n(i24);
                        }
                        this.f339W = ((this.f336T[0] << 4) + (this.f337U[0] << 4)) >> 1;
                        this.f340X = ((this.f336T[1] << 4) + (this.f337U[1] << 4)) >> 1;
                        this.f489cq = 0;
                        m101B();
                        m103C();
                        break;
                    case 7:
                        for (int i25 = 0; i25 < 4; i25++) {
                            if (this.f371ae[i25] == null) {
                                this.f371ae[i25] = new C0010e(this);
                            }
                            this.f371ae[i25].m45a(i25);
                            this.f371ae[i25].m49a(this.f336T, this.f474cb, this.f479cg);
                            this.f371ae[i25].m50b();
                            this.f371ae[i25].f224j = true;
                        }
                        if (this.f369ac.f725e == 2) {
                            this.f371ae[0].m49a(this.f337U, this.f475cc, this.f480ch);
                            this.f371ae[1].m49a(this.f336T, this.f474cb, this.f479cg);
                            this.f371ae[2].m49a(this.f484cl, this.f476cd, this.f481ci);
                            this.f371ae[3].m49a(this.f485cm, this.f477ce, this.f482cj);
                        }
                        if (this.f369ac.f725e == 2) {
                            this.f371ae[0].f237w = this.f337U[0] << 4;
                            this.f371ae[0].f238x = this.f337U[1] << 4;
                            this.f371ae[1].f237w = this.f336T[0] << 4;
                            this.f371ae[1].f238x = this.f336T[1] << 4;
                            this.f371ae[2].f237w = this.f484cl[0] << 4;
                            this.f371ae[2].f238x = this.f484cl[1] << 4;
                            this.f371ae[3].f237w = this.f485cm[0] << 4;
                            this.f371ae[3].f238x = this.f485cm[1] << 4;
                        }
                        for (int i26 = 0; i26 < 3; i26++) {
                            this.f372af[i26].m49a(this.f336T, this.f474cb, this.f479cg);
                            this.f372af[i26].f224j = true;
                            this.f372af[i26].f214c = true;
                            this.f372af[i26].f158ax = 112;
                        }
                        for (int i27 = 0; i27 < 3; i27++) {
                            this.f494cv[i27].f224j = true;
                            this.f494cv[i27].f223i = true;
                            if (this.f369ac.f741u != -1) {
                                Math.abs(this.f513di.nextInt());
                                this.f494cv[i27].f161b.m90b(-1);
                            }
                        }
                        break;
                    case 8:
                        m150o();
                        this.f371ae[0].f218d = true;
                        this.f371ae[0].f224j = false;
                        this.f371ae[0].f158ax = 128;
                        this.f371ae[0].f161b.m90b(this.f369ac.f716B);
                        break;
                    case 9:
                    case 10:
                    case 11:
                        int i28 = (this.f397bD - 9) + 1;
                        if (i28 < this.f369ac.f727g + 1) {
                            this.f371ae[i28].f218d = false;
                            this.f371ae[i28].f224j = false;
                            this.f371ae[i28].f161b.m90b(this.f445bz.f317A.f629aO.f23s[this.f369ac.f721a][this.f369ac.f722b].f76g[i28 - 1]);
                        }
                        break;
                    case 12:
                        int i29 = this.f369ac.f721a;
                        int i30 = this.f369ac.f722b;
                        int i31 = 0;
                        while (true) {
                            int i32 = i31;
                            if (i32 >= 4) {
                                this.f371ae[0].f161b.m87a(2);
                                for (int i33 = 0; i33 < 4; i33++) {
                                    this.f371ae[i33].f237w = this.f339W;
                                    this.f371ae[i33].f238x = this.f340X;
                                    this.f371ae[i33].f239y = 0;
                                    this.f371ae[i33].m50b();
                                    if (this.f445bz.f369ac.f725e == 1) {
                                        this.f371ae[i33].f235u = true;
                                    }
                                }
                                int i34 = (this.f371ae[0].f86E >> 8) + 16384;
                                int i35 = -m165a(i34);
                                int i36 = -m179b(i34);
                                boolean z = true;
                                int i37 = 0;
                                while (true) {
                                    boolean z2 = z;
                                    if (i37 >= 4) {
                                        this.f490cr = this.f371ae[0].f86E;
                                        this.f331O = this.f490cr;
                                        this.f443bx.m241a();
                                    } else {
                                        int i38 = z2 ? i37 * 600 : (-i37) * 600;
                                        this.f371ae[i37].f237w = this.f339W + ((i35 * i38) >> 14);
                                        this.f371ae[i37].f238x = ((i38 * i36) >> 14) + this.f340X;
                                        z = !z2;
                                        this.f371ae[i37].m50b();
                                        this.f371ae[i37].m51b(this.f371ae[i37].f135aa);
                                        i37++;
                                    }
                                }
                            } else {
                                this.f371ae[i32].f161b.m87a(1);
                                if (this.f371ae[i32].f161b.f294g != null) {
                                    if (this.f369ac.f725e == 0) {
                                        this.f371ae[i32].f227m = this.f371ae[i32].f161b.f293f.f13i[this.f371ae[i32].f161b.f294g.f582d].f755i;
                                        this.f371ae[i32].f228n = this.f371ae[i32].f161b.f293f.f13i[this.f371ae[i32].f161b.f294g.f582d].f756j;
                                    } else if (this.f369ac.f725e == 1) {
                                        this.f371ae[i32].f227m = this.f371ae[i32].f161b.f293f.f15k[this.f371ae[i32].f161b.f294g.f584f].f571i;
                                        this.f371ae[i32].f228n = this.f371ae[i32].f161b.f293f.f15k[this.f371ae[i32].f161b.f294g.f584f].f572j;
                                    } else if (this.f369ac.f725e == 2) {
                                        this.f371ae[i32].f227m = this.f371ae[i32].f161b.f293f.f14j[this.f371ae[i32].f161b.f294g.f583e].f52h;
                                        this.f371ae[i32].f228n = this.f371ae[i32].f161b.f293f.f14j[this.f371ae[i32].f161b.f294g.f583e].f53i;
                                        for (int i39 = 0; i39 < 5; i39++) {
                                            this.f371ae[i32].f230p[i39] = this.f371ae[i32].f161b.f293f.f14j[this.f371ae[i32].f161b.f294g.f583e].f48d[i39];
                                            this.f371ae[i32].f231q[i39] = this.f371ae[i32].f161b.f293f.f14j[this.f371ae[i32].f161b.f294g.f583e].f49e[i39];
                                            this.f371ae[i32].f232r[i39] = this.f371ae[i32].f161b.f293f.f14j[this.f371ae[i32].f161b.f294g.f583e].f50f[i39];
                                            this.f371ae[i32].f233s[i39] = this.f371ae[i32].f161b.f293f.f14j[this.f371ae[i32].f161b.f294g.f583e].f51g[i39];
                                        }
                                    }
                                    if (this.f371ae[i32].f227m == 0 && this.f371ae[i32].f228n == 0) {
                                        this.f371ae[i32].f229o = 3;
                                    }
                                    this.f371ae[i32].f100S = this.f317A.f629aO.f23s[i29][i30].f71b;
                                    this.f371ae[i32].f101T = this.f317A.f629aO.f23s[i29][i30].f72c;
                                    this.f371ae[i32].f102U = this.f317A.f629aO.f23s[i29][i30].f73d;
                                    this.f371ae[i32].f103V = this.f317A.f629aO.f23s[i29][i30].f74e;
                                }
                                i31 = i32 + 1;
                            }
                            break;
                        }
                        break;
                    case 13:
                        if (this.f369ac.f725e == 2) {
                            this.f465cS = 10;
                            this.f466cT = -270;
                            this.f467cU = 100;
                            this.f468cV = -130;
                            this.f469cW = -2;
                            this.f470cX = 0;
                            this.f471cY = 0;
                        } else if (this.f369ac.f725e == 0) {
                            this.f465cS = 6;
                            this.f466cT = -270;
                            this.f467cU = 320;
                            this.f468cV = -80;
                            this.f469cW = 12;
                            this.f470cX = 0;
                            this.f471cY = 0;
                        } else if (this.f369ac.f725e == 1) {
                            if (this.f369ac.f732l) {
                                this.f465cS = 2;
                                this.f466cT = -110;
                                this.f467cU = 20;
                                this.f468cV = -120;
                                this.f469cW = -11;
                                this.f470cX = 0;
                                this.f471cY = 0;
                            } else {
                                this.f465cS = -6;
                                this.f466cT = 70;
                                this.f467cU = 270;
                                this.f468cV = 140;
                                this.f469cW = 14;
                                this.f470cX = 0;
                                this.f471cY = 0;
                            }
                        }
                        if (this.f369ac.f728h < 0) {
                            if (this.f369ac.f721a < 1) {
                                this.f369ac.f728h = 1;
                            } else if (this.f369ac.f721a < 0) {
                                this.f369ac.f728h = 2;
                            } else {
                                this.f369ac.f728h = 3;
                            }
                        }
                        this.f373ag = new C0010e[10];
                        this.f374ah = new C0010e[10];
                        for (int i40 = 0; i40 < 4; i40++) {
                            this.f373ag[i40] = this.f371ae[i40];
                        }
                        for (int i41 = 0; i41 < 3; i41++) {
                            this.f373ag[i41 + 4] = this.f372af[i41];
                        }
                        for (int i42 = 0; i42 < 3; i42++) {
                            this.f373ag[i42 + 4 + 3] = this.f494cv[i42];
                        }
                        for (int i43 = 0; i43 < 4; i43++) {
                            this.f374ah[i43] = this.f371ae[i43];
                        }
                        for (int i44 = 0; i44 < 3; i44++) {
                            this.f374ah[i44 + 4] = this.f372af[i44];
                        }
                        for (int i45 = 0; i45 < 3; i45++) {
                            this.f374ah[i45 + 4 + 3] = this.f494cv[i45];
                        }
                        for (int i46 = 0; i46 < 3; i46++) {
                            this.f494cv[i46].f224j = true;
                        }
                        m109F(100);
                        m110G(100);
                        break;
                    case 14:
                        switch (this.f369ac.f725e) {
                            case 0:
                                if (this.f369ac.f728h > 0) {
                                    m142h(3, 1);
                                } else {
                                    m142h(0, 1);
                                }
                                break;
                            case 1:
                                m142h(1, 1);
                                break;
                            case 2:
                                m142h(2, 1);
                                break;
                        }
                        m112I(0);
                        this.f334R = 0;
                        this.f333Q = 0;
                        this.f335S = 0;
                        this.f445bz.f542p = 0;
                        break;
                    case 15:
                        this.f397bD--;
                        break;
                }
                this.f397bD++;
                this.f506da = false;
            } else if (this.f506da) {
                m151p();
                this.f445bz.m204o(180);
                m211v(7);
            }
            System.gc();
        }
    }

    /* JADX INFO: renamed from: K */
    private void m114K(int i) {
        if (this.f472cZ) {
            return;
        }
        if (this.f319C == 1) {
            if (this.f542p >= 400) {
                this.f321E = (short) 0;
                if ((i & 128) == 128 || (i & 512) == 512) {
                    m182c();
                    m161y();
                    return;
                }
                this.f326J |= i;
                if (this.f445bz.f369ac.f725e == 2) {
                    if (((i & 1) == 1 || (262144 & i) == 262144) && this.f455cI) {
                        this.f456cJ = true;
                        this.f455cI = false;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this.f319C == 2) {
            if (this.f445bz.f542p < 400 && (i & 512) != 512) {
                this.f445bz.f320D = (byte) 0;
                return;
            }
            if ((i & 512) == 512) {
                this.f398bE = true;
                return;
            }
            if (this.f397bD == 15) {
                if ((i & 256) == 256 || (i & 2097152) == 2097152) {
                    this.f397bD++;
                    this.f445bz.f542p = 0;
                    return;
                }
                return;
            }
            if (((i & 128) == 128 || (i & 256) == 256 || (i & 2097152) == 2097152) && this.f397bD == 16) {
                this.f506da = true;
                return;
            }
            return;
        }
        if (this.f319C != 3) {
            if (this.f319C == 7) {
                if (this.f542p >= 400) {
                    if ((i & 128) == 128 || (i & 512) == 512) {
                        try {
                            m182c();
                            m161y();
                            return;
                        } catch (Exception e) {
                            return;
                        }
                    } else {
                        if ((i & 64) == 64 || (i & 256) == 256 || (i & 2097152) == 2097152) {
                            this.f515dk = (short) (this.f514dj - 1);
                            this.f445bz.m111H(0);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if ((this.f319C == 4 || this.f319C == 5 || this.f319C == 6) && this.f542p >= 400) {
                if ((i & 512) == 512) {
                    m182c();
                    m161y();
                    return;
                } else {
                    if ((i & 128) == 128 || (i & 256) == 256 || (i & 2097152) == 2097152) {
                        m182c();
                        this.f405bL = true;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f542p >= 400) {
            if (this.f445bz.f317A.f674n == 1) {
                if ((i & 1) == 1 || (262144 & i) == 262144) {
                    if (this.f445bz.f317A.f678r > 0) {
                        this.f445bz.f317A.f678r--;
                        if (this.f445bz.f317A.f678r < 0) {
                            this.f445bz.f317A.f678r = 0;
                        }
                    }
                } else if (((i & 2) == 2 || (16777216 & i) == 16777216) && this.f445bz.f317A.f678r + (this.f445bz.f317A.f684x / this.f445bz.f317A.f679s) < this.f445bz.f317A.f683w) {
                    this.f445bz.f317A.f678r++;
                }
                if ((i & 64) == 64 || (i & 512) == 512) {
                    this.f445bz.f317A.m236e();
                }
            } else if ((i & 64) == 64 || (i & 512) == 512) {
                this.f407bN = 1;
            } else if (this.f445bz.f317A.f674n == 6 || this.f445bz.f317A.f674n == 7) {
                if ((i & 128) == 128 || (i & 256) == 256 || (i & 2097152) == 2097152) {
                    this.f407bN = 2;
                }
                if ((i & 1) == 1 || (262144 & i) == 262144) {
                    if (this.f508dc > 0) {
                        this.f508dc--;
                    } else {
                        this.f508dc = 1;
                    }
                } else if ((i & 2) == 2 || (16777216 & i) == 16777216) {
                    if (this.f508dc < 1) {
                        this.f508dc++;
                    } else {
                        this.f508dc = 0;
                    }
                }
            } else if ((i & 128) == 128 || (i & 256) == 256 || (i & 2097152) == 2097152 || (i & 512) == 512) {
                if (this.f509dd == 0) {
                    if (this.f508dc != 2 && this.f508dc != 3) {
                        this.f407bN = 2;
                    }
                } else if (this.f509dd == 1) {
                    this.f407bN = 2;
                }
            } else if ((i & 1) == 1 || (262144 & i) == 262144) {
                do {
                    if (this.f509dd == 0) {
                        int i2 = this.f508dc - 1;
                        this.f508dc = i2;
                        if (i2 < 0) {
                            this.f508dc = 5;
                        }
                    } else if (this.f509dd == 1) {
                        int i3 = this.f508dc - 1;
                        this.f508dc = i3;
                        if (i3 < 0) {
                            this.f508dc = 2;
                        }
                    }
                } while (!m155t());
            } else if ((i & 2) == 2 || (16777216 & i) == 16777216) {
                do {
                    if (this.f509dd == 0) {
                        int i4 = this.f508dc + 1;
                        this.f508dc = i4;
                        if (i4 >= 6) {
                            this.f508dc = 0;
                        }
                    } else if (this.f509dd == 1) {
                        int i5 = this.f508dc + 1;
                        this.f508dc = i5;
                        if (i5 >= 3) {
                            this.f508dc = 0;
                        }
                    }
                } while (!m155t());
            }
            if (this.f509dd == 0) {
                if (this.f508dc != 2) {
                    if (this.f508dc == 3) {
                        if ((i & 4) == 4 || (1048576 & i) == 1048576 || (i & 8) == 8 || (4194304 & i) == 4194304) {
                            this.f445bz.f535i = this.f445bz.f535i ? false : true;
                            m185d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.f445bz.m199j(303)) {
                    return;
                }
                if ((i & 4) == 4 || (1048576 & i) == 1048576) {
                    if (this.f533g > 0) {
                        this.f533g--;
                        m209t(this.f533g);
                        m177a(false);
                        m185d();
                        m198i(303);
                        return;
                    }
                    return;
                }
                if (((i & 8) == 8 || (4194304 & i) == 4194304) && this.f533g < 5) {
                    this.f533g++;
                    this.f532f = true;
                    m209t(this.f533g);
                    m177a(false);
                    m185d();
                    m198i(303);
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private void m115L(int i) {
        int iM213y = this.f445bz.m213y(i);
        this.f496cx = this.f445bz.m163A(iM213y);
        m128a(this.f496cx > 0, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 2013, this.f445bz);
        this.f381ao = new int[this.f496cx][];
        this.f497cy = new int[this.f496cx << 1];
        for (int i2 = 0; i2 < this.f496cx; i2++) {
            this.f497cy[i2 << 1] = this.f445bz.m164B(iM213y);
            this.f497cy[(i2 << 1) + 1] = this.f445bz.m164B(iM213y);
            int iM163A = this.f445bz.m163A(iM213y);
            m128a(iM163A > 0, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 2045, this.f445bz);
            this.f381ao[i2] = new int[iM163A];
            for (int i3 = 0; i3 < iM163A; i3++) {
                this.f381ao[i2][i3] = ((this.f445bz.m163A(iM213y) & 65535) << 16) | (this.f445bz.m163A(iM213y) & 65535);
            }
        }
        this.f445bz.m203n(i);
    }

    /* JADX INFO: renamed from: M */
    private String m116M(int i) {
        switch (i) {
            case 0:
                return "Intro_Race.nrf";
            case 1:
                return "Intro_Drift.nrf";
            case 2:
                return "Intro_Drag.nrf";
            case 3:
                return "Intro_Cop.nrf";
            case 4:
                return "Outro_Race.nrf";
            case 5:
                return "Outro_Drift.nrf";
            case 6:
                return "Outro_Drag.nrf";
            case 7:
                return "Outro_Cop.nrf";
            default:
                m125a(0, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 3090, this.f445bz);
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:427:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:429:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:431:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:437:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:439:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:470:0x0856  */
    /* JADX WARN: Code duplicated, block: B:472:0x085a  */
    /* JADX WARN: Code duplicated, block: B:479:0x086f  */
    /* JADX WARN: Code duplicated, block: B:480:0x0875  */
    /* JADX WARN: Code duplicated, block: B:482:0x087a  */
    /* JADX WARN: Code duplicated, block: B:484:0x0880  */
    /* JADX WARN: Code duplicated, block: B:486:0x0886  */
    /* JADX WARN: Code duplicated, block: B:489:0x089e  */
    /* JADX WARN: Code duplicated, block: B:491:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:856:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:857:0x0063 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    private void m117N(int i) {
        boolean z;
        boolean z2;
        int i2 = 0;
        this.f538l++;
        if (this.f435bp) {
            for (int i3 = 1; i3 != 67108864; i3 <<= 1) {
                if ((this.f437br & i3) != 0 && this.f435bp) {
                    this.f538l = 0;
                    if (this.f433bn >= 1) {
                        int i4 = this.f433bn - 1;
                        this.f434bo[i4] = i3;
                        this.f433bn++;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 27) {
                                i5 = -1;
                                z2 = false;
                                break;
                            }
                            int i6 = 0;
                            while (true) {
                                if (i6 > i4) {
                                    z2 = true;
                                    break;
                                } else {
                                    if (this.f503dD[i5][i6] != this.f434bo[i6]) {
                                        z2 = false;
                                        break;
                                    }
                                    i6++;
                                }
                            }
                            if (z2 && this.f503dD[i5][i4 + 1] == -1) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (z2) {
                            if (i5 == 18) {
                                this.f534h = true;
                                m185d();
                            } else if (i5 == 6) {
                                this.f540n ^= 4;
                            } else if (i5 == 17) {
                                this.f540n ^= 16;
                            } else if (i5 == 10) {
                                this.f439bt = !this.f439bt;
                            } else if (i5 == 26) {
                                this.f540n ^= 128;
                            } else if (i5 == 4) {
                                this.f540n ^= 1;
                            } else if (i5 == 7) {
                                this.f540n ^= 8;
                            } else if (i5 == 8) {
                                this.f540n ^= 2;
                            } else if (i5 == 19) {
                                f313dG = !f313dG;
                            } else if (i5 == 20) {
                                this.f540n ^= 32;
                            } else if (i5 == 21) {
                                this.f540n ^= 64;
                            } else if (i5 == 22) {
                                if (this.f445bz.f369ac.f725e != 2) {
                                    if (this.f445bz.f369ac.f725e == 1) {
                                        this.f445bz.f369ac.f725e = 0;
                                        for (int i7 = 0; i7 < 4; i7++) {
                                            this.f371ae[i7].f235u = false;
                                        }
                                    } else {
                                        this.f445bz.f369ac.f725e = 1;
                                        for (int i8 = 0; i8 < 4; i8++) {
                                            this.f371ae[i8].f235u = true;
                                        }
                                    }
                                }
                            } else if ((this.f541o & 8192) != 0) {
                                if (this.f319C == 1) {
                                    if (i5 == 2) {
                                        m107E(1);
                                    } else if (i5 == 12) {
                                        m107E(2);
                                    } else if (i5 == 13) {
                                        m107E(3);
                                    } else if (i5 == 14) {
                                        m107E(0);
                                    } else if (i5 == 3) {
                                        m107E(-1);
                                    } else if (i5 == 9) {
                                        if (this.f371ae[0].f218d) {
                                            this.f371ae[0].f86E -= 8388608;
                                            this.f371ae[0].f86E &= 16777215;
                                            this.f371ae[0].f86E += 8388608;
                                            this.f371ae[0].f218d = false;
                                            this.f540n |= 2;
                                        } else {
                                            this.f371ae[0].f218d = true;
                                        }
                                    } else if (i5 == 25 && this.f371ae[0].f235u) {
                                        this.f371ae[0].f94M = this.f317A.f629aO.f23s[this.f369ac.f721a][this.f369ac.f722b].f70a;
                                    }
                                }
                            } else if ((this.f541o & 4096) != 0) {
                                C0022q c0022q = this.f445bz.f317A;
                                if (i5 == 11) {
                                    c0022q.f614a.f368ab.m22b();
                                    c0022q.f614a.m182c();
                                    c0022q.f614a.m212x(16384);
                                } else if (i5 == 15) {
                                    if (!c0022q.f614a.f368ab.f37e) {
                                        c0022q.f614a.f368ab.f37e = true;
                                    }
                                } else if (i5 != 16) {
                                    if (i5 == 24) {
                                        c0022q.f614a.f539m = true;
                                    } else if (i5 == 0) {
                                        c0022q.f614a.f368ab.f37e = true;
                                        c0022q.f614a.f368ab.f38f = true;
                                        for (int i9 = 0; i9 < 4; i9++) {
                                            for (int i10 = 0; i10 < 4; i10++) {
                                                c0022q.f614a.f368ab.f43k[i9][i10] = 1;
                                            }
                                        }
                                        c0022q.f667g = true;
                                    } else if (i5 == 1) {
                                        for (int i11 = 0; i11 < 32; i11++) {
                                            c0022q.f614a.f368ab.m23b(i11);
                                        }
                                        c0022q.f614a.f368ab.f39g = true;
                                        c0022q.f666f = true;
                                    } else if (i5 == 23) {
                                        c0022q.m232b(79);
                                    }
                                }
                            }
                            this.f433bn = 0;
                        } else if (i4 >= 4) {
                            this.f433bn = 0;
                        }
                    } else if (i3 == this.f502dC[this.f433bn]) {
                        this.f433bn++;
                    } else {
                        this.f433bn = 0;
                    }
                    if ((this.f541o & 8192) != 0) {
                        m114K(i3);
                    } else if ((this.f541o & 4096) != 0) {
                        C0022q c0022q2 = this.f445bz.f317A;
                        if (c0022q2.f614a.f542p >= 250 || (i3 & 512) == 512) {
                            if (c0022q2.f614a.f544r) {
                                c0022q2.f614a.m209t(c0022q2.f614a.f533g);
                                c0022q2.f614a.m177a(false);
                                if ((c0022q2.f614a.f541o & 4096) != 0) {
                                    c0022q2.f614a.m198i(306);
                                } else {
                                    c0022q2.f614a.m200k(306);
                                }
                                c0022q2.f614a.f544r = false;
                            }
                            if (c0022q2.f686z == 11) {
                                if ((i3 & 256) == 256 || (i3 & 2097152) == 2097152) {
                                    c0022q2.f600M = true;
                                    c0022q2.f686z = 12;
                                    c0022q2.f614a.f542p = 0;
                                    c0022q2.f614a.m204o(256);
                                    c0022q2.f614a.f544r = false;
                                    c0022q2.f614a.m198i(306);
                                    if (c0022q2.f614a.m194g()) {
                                        c0022q2.f614a.f369ac.f746z = false;
                                        c0022q2.f614a.f369ac.f716B = Math.abs(c0022q2.f614a.m178b()) % 30;
                                        c0022q2.f614a.f369ac.m258a(Math.abs(c0022q2.f614a.m178b()) % 4, Math.abs(c0022q2.f614a.m178b()) % 4);
                                        c0022q2.f614a.f369ac.f731k = true;
                                        c0022q2.f614a.m182c();
                                        c0022q2.f614a.m212x(8192);
                                    }
                                }
                            } else if (c0022q2.f686z >= 12) {
                                if (c0022q2.f627aM == c0022q2.f655at || c0022q2.f627aM == c0022q2.f657av || c0022q2.f627aM == c0022q2.f622aH) {
                                    if (c0022q2.f627aM == c0022q2.f655at || c0022q2.f627aM == c0022q2.f622aH) {
                                        if ((i3 & 4) == 4 || (1048576 & i3) == 1048576) {
                                            C0002ab c0002ab = c0022q2.f614a.f368ab;
                                            int i12 = c0022q2.f670j;
                                            do {
                                                i12--;
                                                if (i12 < 0) {
                                                    i12 = 31;
                                                }
                                            } while (c0002ab.f44l[i12] != 1);
                                            c0022q2.f670j = i12;
                                        } else if ((i3 & 8) == 8 || (4194304 & i3) == 4194304) {
                                            C0002ab c0002ab2 = c0022q2.f614a.f368ab;
                                            int i13 = c0022q2.f670j;
                                            do {
                                                i13++;
                                                if (i13 >= 32) {
                                                    i13 = 0;
                                                }
                                            } while (c0002ab2.f44l[i13] != 1);
                                            c0022q2.f670j = i13;
                                        }
                                        c0022q2.m227a(c0022q2.f670j);
                                    } else if (c0022q2.f627aM == c0022q2.f657av) {
                                        if ((i3 & 4) == 4 || (1048576 & i3) == 1048576) {
                                            int i14 = c0022q2.f671k - 1;
                                            c0022q2.f671k = i14;
                                            if (i14 < 0) {
                                                c0022q2.f671k = c0022q2.f629aO.f23s[c0022q2.f668h][c0022q2.f669i].f75f - 1;
                                            }
                                        } else if ((i3 & 8) == 8 || (4194304 & i3) == 4194304) {
                                            int i15 = c0022q2.f671k + 1;
                                            c0022q2.f671k = i15;
                                            if (i15 >= c0022q2.f629aO.f23s[c0022q2.f668h][c0022q2.f669i].f75f) {
                                                c0022q2.f671k = 0;
                                            }
                                        }
                                        c0022q2.m227a(c0022q2.f629aO.f23s[c0022q2.f668h][c0022q2.f669i].f76g[c0022q2.f671k]);
                                    }
                                }
                                if (c0022q2.f674n == 4) {
                                    if ((i3 & 128) == 128 || (i3 & 64) == 64 || (i3 & 256) == 256 || (i3 & 2097152) == 2097152 || (i3 & 512) == 512) {
                                        c0022q2.f614a.f542p = 0;
                                        c0022q2.f674n = c0022q2.f675o;
                                        if (((i3 & 128) == 128 || (i3 & 256) == 256 || (i3 & 2097152) == 2097152) && c0022q2.f676p == 0) {
                                            c0022q2.f674n = (byte) 0;
                                            c0022q2.m235d();
                                        } else {
                                            c0022q2.f674n = (byte) 0;
                                        }
                                    }
                                    if ((i3 & 1) == 1 || (262144 & i3) == 262144) {
                                        int i16 = c0022q2.f676p - 1;
                                        c0022q2.f676p = i16;
                                        if (i16 < 0) {
                                            c0022q2.f676p = 1;
                                        }
                                    }
                                    if ((i3 & 2) == 2 || (16777216 & i3) == 16777216) {
                                        int i17 = c0022q2.f676p + 1;
                                        c0022q2.f676p = i17;
                                        if (i17 > 1) {
                                            c0022q2.f676p = 0;
                                        }
                                    }
                                } else if (c0022q2.f674n == 5) {
                                    if ((i3 & 128) == 128 || (i3 & 64) == 64 || (i3 & 256) == 256 || (i3 & 2097152) == 2097152 || (i3 & 512) == 512) {
                                        for (int i18 = 0; i18 < c0022q2.f613Z; i18++) {
                                            if (c0022q2.f603P < (c0022q2.f602O - c0022q2.f613Z) - 1) {
                                                c0022q2.f603P++;
                                            }
                                        }
                                        c0022q2.f674n = c0022q2.f675o;
                                        c0022q2.f674n = (byte) 0;
                                        if (c0022q2.f598K) {
                                            c0022q2.f598K = false;
                                        }
                                    }
                                    if (((i3 & 1) == 1 || (262144 & i3) == 262144) && c0022q2.f603P > 0) {
                                        c0022q2.f603P--;
                                    }
                                    if (((i3 & 2) == 2 || (16777216 & i3) == 16777216) && c0022q2.f603P + c0022q2.f604Q < c0022q2.f602O - 1 && c0022q2.f603P < c0022q2.f602O - 1) {
                                        c0022q2.f603P++;
                                    }
                                } else if (c0022q2.f674n == 1) {
                                    if ((i3 & 1) == 1 || (262144 & i3) == 262144) {
                                        c0022q2.f614a.f320D = (byte) 1;
                                    } else if ((i3 & 2) == 2 || (16777216 & i3) == 16777216) {
                                        c0022q2.f614a.f320D = (byte) 2;
                                    } else {
                                        c0022q2.f614a.f320D = (byte) 0;
                                        c0022q2.f614a.f321E = (short) 0;
                                    }
                                    if ((i3 & 64) == 64 || (i3 & 512) == 512) {
                                        c0022q2.m236e();
                                        c0022q2.f614a.f541o = 4096;
                                    }
                                } else {
                                    if ((i3 & 4) == 4 || (1048576 & i3) == 1048576) {
                                        c0022q2.m231b();
                                        c0022q2.f614a.f320D = (byte) 4;
                                        c0022q2.f614a.f321E = (short) 0;
                                    } else if ((i3 & 8) == 8 || (4194304 & i3) == 4194304) {
                                        c0022q2.m226a();
                                        c0022q2.f614a.f320D = (byte) 8;
                                        c0022q2.f614a.f321E = (short) 0;
                                    }
                                    if ((i3 & 1) == 1 || (262144 & i3) == 262144) {
                                        c0022q2.m237f();
                                        c0022q2.f614a.f320D = (byte) 1;
                                        c0022q2.f614a.f321E = (short) 0;
                                    }
                                    if ((i3 & 2) == 2 || (16777216 & i3) == 16777216) {
                                        c0022q2.m238g();
                                        c0022q2.f614a.f320D = (byte) 2;
                                        c0022q2.f614a.f321E = (short) 0;
                                    }
                                    if ((i3 & 128) == 128 || (i3 & 256) == 256 || (i3 & 2097152) == 2097152) {
                                        C0012g c0012g = c0022q2.f627aM.f60a[c0022q2.f627aM.f62c];
                                        int i19 = c0012g.f252c;
                                        c0022q2.f614a.f542p = 0;
                                        if (i19 == 1) {
                                            c0022q2.f614a.m182c();
                                            c0022q2.m229a(45, true);
                                        } else if (i19 == 2) {
                                            c0022q2.m234c();
                                        }
                                        if (i19 == 13) {
                                            c0022q2.m229a(34, false);
                                        }
                                        if (i19 == 12) {
                                            c0022q2.m229a(127, false);
                                        }
                                        if (i19 == 10) {
                                            c0022q2.f614a.m182c();
                                            c0022q2.m233b(C0016k.m93a(c0012g.f253d), false);
                                        }
                                        if (i19 == 131072) {
                                            c0022q2.m229a(184, true);
                                        }
                                        c0022q2.f614a.f369ac.f724d = false;
                                        if (i19 == 9) {
                                            c0022q2.f614a.f369ac.f746z = false;
                                            c0022q2.f614a.f369ac.f716B = Math.abs(c0022q2.f614a.m178b()) % 30;
                                            c0022q2.f614a.f369ac.m258a(Math.abs(c0022q2.f614a.m178b()) % 4, Math.abs(c0022q2.f614a.m178b()) % 4);
                                            c0022q2.f614a.f369ac.f731k = true;
                                            c0022q2.f614a.m182c();
                                            c0022q2.f614a.m212x(8192);
                                            z = true;
                                        } else if (i19 == 6) {
                                            if (c0022q2.f614a.f368ab.m20a(c0022q2.f627aM.f62c, 0)) {
                                                z = false;
                                            } else {
                                                c0022q2.f668h = c0022q2.f627aM.f62c;
                                                if (c0022q2.f669i == -1) {
                                                    c0022q2.f669i = 0;
                                                    z = true;
                                                } else {
                                                    z = true;
                                                }
                                            }
                                        } else if (i19 == 15) {
                                            if (c0022q2.f614a.f368ab.m20a(c0022q2.f668h, c0022q2.f627aM.f62c)) {
                                                z = false;
                                            } else {
                                                c0022q2.m227a(c0022q2.f670j);
                                                c0022q2.f671k = 0;
                                                z = true;
                                            }
                                        } else if (i19 == 17) {
                                            c0022q2.f614a.f369ac.f716B = c0022q2.f670j;
                                            c0022q2.f614a.f368ab.f36d = c0022q2.f670j;
                                            if (c0022q2.f673m[c0022q2.f668h][c0022q2.f669i].f710c == 3) {
                                                c0022q2.f614a.f369ac.f715A = -1;
                                                c0022q2.f614a.f369ac.f746z = false;
                                                c0022q2.f614a.f369ac.m258a(c0022q2.f668h, c0022q2.f669i);
                                                c0022q2.f614a.m182c();
                                                c0022q2.f614a.m212x(8192);
                                                z = true;
                                            } else {
                                                c0022q2.m227a(c0022q2.f629aO.f23s[c0022q2.f668h][c0022q2.f669i].f76g[c0022q2.f671k]);
                                                z = true;
                                            }
                                        } else if (i19 == 18) {
                                            c0022q2.f614a.f369ac.f715A = c0022q2.f671k + 1;
                                            c0022q2.f614a.f369ac.f746z = true;
                                            c0022q2.f614a.f369ac.m258a(c0022q2.f668h, c0022q2.f669i);
                                            c0022q2.f614a.m182c();
                                            c0022q2.f614a.m212x(8192);
                                            z = true;
                                        } else if (i19 == 20) {
                                            c0022q2.m227a(c0022q2.f670j);
                                            z = true;
                                        } else {
                                            if (i19 == 5 && !c0022q2.f614a.f368ab.f40h) {
                                                c0022q2.m232b(149);
                                                c0022q2.f614a.f368ab.f40h = true;
                                                c0022q2.f614a.f368ab.m22b();
                                            }
                                            z = true;
                                        }
                                        if (c0012g.f254e != null && z) {
                                            c0012g.f254e.f61b = c0022q2.f627aM;
                                            c0022q2.m230a(c0012g.f254e);
                                        }
                                    }
                                    if ((i3 & 64) == 64 || (i3 & 512) == 512) {
                                        c0022q2.m234c();
                                    }
                                }
                            } else if ((i3 & 512) == 512) {
                                c0022q2.f601N = true;
                            }
                        } else {
                            c0022q2.f614a.f320D = (byte) 0;
                        }
                    } else if ((this.f541o & 16384) != 0) {
                        C0005ae c0005ae = this.f445bz.f444by;
                        C0016k c0016k = c0005ae.f55a.f551y;
                        if (c0005ae.f58d < 9) {
                            if (c0005ae.f56b >= 1000) {
                                if (c0005ae.f56b < 400) {
                                    if (c0005ae.f58d == 3) {
                                        if ((i3 & 128) != 128 || (i3 & 256) == 256 || (i3 & 2097152) == 2097152) {
                                            c0016k.m97b(c0005ae.f59e);
                                            c0016k.m99c();
                                            c0005ae.f56b = 0;
                                            c0005ae.f57c = 0;
                                            c0005ae.f58d++;
                                            if (c0005ae.f58d != 4 && !c0005ae.f55a.f534h) {
                                                c0005ae.f58d++;
                                            }
                                        } else {
                                            if (((i3 & 4) == 4 || (1048576 & i3) == 1048576) && c0005ae.f59e > 0) {
                                                c0005ae.f59e--;
                                            } else if (((i3 & 8) == 8 || (4194304 & i3) == 4194304) && c0005ae.f59e < 4) {
                                                c0005ae.f59e++;
                                            }
                                            if (((i3 & 1) == 1 || (262144 & i3) == 262144) && c0005ae.f59e > 0) {
                                                c0005ae.f59e--;
                                            } else if (((i3 & 2) == 2 || (16777216 & i3) == 16777216) && c0005ae.f59e < 4) {
                                                c0005ae.f59e++;
                                            }
                                        }
                                    } else if (c0005ae.f58d == 4) {
                                        if ((i3 & 128) != 128 || (i3 & 256) == 256 || (i3 & 2097152) == 2097152) {
                                            c0005ae.f55a.m185d();
                                            c0005ae.f56b = 3001;
                                        }
                                    } else if (c0005ae.f58d == 5) {
                                        if ((i3 & 128) == 128) {
                                            if (c0005ae.f55a.f533g <= 0) {
                                                c0005ae.f55a.f533g = 2;
                                            }
                                            c0005ae.f55a.m209t(c0005ae.f55a.f533g);
                                            c0005ae.f56b = 3001;
                                        } else if ((i3 & 64) == 64) {
                                            c0005ae.f55a.f533g = 0;
                                            c0005ae.f55a.m209t(c0005ae.f55a.f533g);
                                            c0005ae.f56b = 3001;
                                        }
                                        c0005ae.f55a.m185d();
                                    } else {
                                        c0005ae.f56b = 3001;
                                    }
                                }
                            } else if (c0005ae.f58d != 2) {
                                if (c0005ae.f58d == 7 || c0005ae.f58d == 8) {
                                    if ((i3 & 256) == 256 || (i3 & 2097152) == 2097152) {
                                        c0005ae.f56b = 3001;
                                    }
                                } else if (c0005ae.f56b < 400) {
                                    if (c0005ae.f58d == 3) {
                                        if ((i3 & 128) != 128) {
                                            c0016k.m97b(c0005ae.f59e);
                                            c0016k.m99c();
                                            c0005ae.f56b = 0;
                                            c0005ae.f57c = 0;
                                            c0005ae.f58d++;
                                            if (c0005ae.f58d != 4) {
                                            }
                                        } else {
                                            c0016k.m97b(c0005ae.f59e);
                                            c0016k.m99c();
                                            c0005ae.f56b = 0;
                                            c0005ae.f57c = 0;
                                            c0005ae.f58d++;
                                            if (c0005ae.f58d != 4) {
                                            }
                                        }
                                    } else if (c0005ae.f58d == 4) {
                                        if ((i3 & 128) != 128) {
                                        }
                                        c0005ae.f55a.m185d();
                                        c0005ae.f56b = 3001;
                                    } else if (c0005ae.f58d == 5) {
                                        if ((i3 & 128) == 128) {
                                            if (c0005ae.f55a.f533g <= 0) {
                                                c0005ae.f55a.f533g = 2;
                                            }
                                            c0005ae.f55a.m209t(c0005ae.f55a.f533g);
                                            c0005ae.f56b = 3001;
                                        } else if ((i3 & 64) == 64) {
                                            c0005ae.f55a.f533g = 0;
                                            c0005ae.f55a.m209t(c0005ae.f55a.f533g);
                                            c0005ae.f56b = 3001;
                                        }
                                        c0005ae.f55a.m185d();
                                    } else {
                                        c0005ae.f56b = 3001;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f437br = 0;
            for (int i20 = 1; i20 != 67108864; i20 <<= 1) {
                if ((this.f438bs & i20) != 0 && this.f435bp && this.f436bq) {
                    if ((this.f541o & 8192) != 0) {
                        if (!this.f472cZ && this.f319C == 1) {
                            this.f326J &= i20 ^ (-1);
                            this.f320D = (byte) 0;
                            this.f321E = (short) 0;
                        }
                    } else if ((this.f541o & 4096) != 0) {
                        C0022q c0022q3 = this.f445bz.f317A;
                        c0022q3.f614a.f320D = (byte) 0;
                        c0022q3.f614a.f321E = (short) 0;
                    }
                }
            }
            this.f438bs = 0;
            if (this.f543q) {
                this.f542p += i;
            }
            try {
                if ((this.f541o & 8192) != 0) {
                    m113J(i);
                } else if ((this.f541o & 4096) != 0) {
                    C0022q c0022q4 = this.f445bz.f317A;
                    c0022q4.f591D += i;
                    if (c0022q4.f686z >= -1 && c0022q4.f686z <= 10) {
                        c0022q4.f686z++;
                        if (c0022q4.f686z > 9 && c0022q4.f686z < 10 && c0022q4.f614a.f538l >= 10) {
                            c0022q4.f686z += 20;
                            if (c0022q4.f686z >= 10) {
                                c0022q4.f686z = 10;
                            }
                        }
                        switch (c0022q4.f686z) {
                            case 0:
                                c0022q4.f614a.m182c();
                                c0022q4.f614a.f542p = 0;
                                c0022q4.f614a.f320D = (byte) 0;
                                c0022q4.f598K = false;
                                c0022q4.f674n = (byte) 0;
                                c0022q4.f614a.f369ac.f715A = -1;
                                c0022q4.f614a.f369ac.f716B = -1;
                                c0022q4.f614a.f369ac.f746z = false;
                                c0022q4.f596I = c0022q4.f614a.f546t.m67c();
                                c0022q4.f679s = c0022q4.f596I;
                                c0022q4.f684x = (((c0022q4.f614a.f499d - 4) - 90) / c0022q4.f679s) * c0022q4.f679s;
                                c0022q4.f685y = 3;
                                c0022q4.f680t = false;
                                c0022q4.f597J = 0;
                                c0022q4.f636aa = 706;
                                c0022q4.f637ab = -500;
                                c0022q4.f638ac = 800;
                                c0022q4.f642ag = 0;
                                c0022q4.f644ai = 220;
                                c0022q4.f646ak = 0;
                                c0022q4.f639ad = 706;
                                c0022q4.f640ae = -500;
                                c0022q4.f641af = 800;
                                c0022q4.f643ah = 0;
                                c0022q4.f645aj = 220;
                                c0022q4.f647al = 0;
                                c0022q4.f607T = 15;
                                c0022q4.f608U = c0022q4.f614a.f446c - (c0022q4.f607T << 1);
                                c0022q4.f609V = c0022q4.f614a.f499d / 2;
                                c0022q4.f610W = 18;
                                c0022q4.f611X = 50;
                                c0022q4.f612Y = (c0022q4.f614a.f446c / 2) - (c0022q4.f608U / 2);
                                c0022q4.f613Z = c0022q4.f609V / 18;
                                c0022q4.f670j = c0022q4.f614a.f368ab.f36d;
                                if (c0022q4.f614a.f368ab.f38f) {
                                    c0022q4.f667g = false;
                                }
                                if (c0022q4.f614a.f368ab.m19a(0)) {
                                    C0002ab c0002ab3 = c0022q4.f614a.f368ab;
                                    int i21 = 0;
                                    for (int i22 = 0; i22 <= 29; i22++) {
                                        if (c0002ab3.m19a(i22)) {
                                            i21++;
                                        }
                                    }
                                    if ((i21 == 30 ? 1 : 0) != 0 && !c0022q4.f614a.f368ab.f39g) {
                                        c0022q4.f614a.f368ab.m23b(30);
                                        c0022q4.f614a.f368ab.f39g = true;
                                        c0022q4.f614a.f368ab.m22b();
                                        c0022q4.f666f = true;
                                    } else if (!c0022q4.f614a.f368ab.m19a(30) && c0022q4.f614a.f368ab.f39g) {
                                        c0022q4.f614a.f368ab.m23b(30);
                                        c0022q4.f614a.f368ab.m22b();
                                        c0022q4.f664d = true;
                                    } else if (c0022q4.f614a.f368ab.m19a(31) || !c0022q4.f614a.f368ab.f38f) {
                                        while (!c0022q4.f614a.f368ab.m19a(c0022q4.f670j)) {
                                            int i23 = c0022q4.f670j + 1;
                                            c0022q4.f670j = i23;
                                            if (i23 >= 32) {
                                                c0022q4.f670j = 0;
                                            }
                                        }
                                    } else {
                                        c0022q4.f614a.f368ab.m23b(31);
                                        c0022q4.f614a.f368ab.m22b();
                                        c0022q4.f665e = true;
                                    }
                                } else {
                                    c0022q4.f614a.f368ab.m23b(0);
                                    c0022q4.f670j = 0;
                                    c0022q4.f614a.f368ab.m22b();
                                    c0022q4.f663c = true;
                                }
                                c0022q4.f671k = 0;
                                c0022q4.f672l = -1;
                                c0022q4.f614a.f333Q = 0;
                                c0022q4.f614a.f334R = 0;
                                c0022q4.f614a.f335S = 0;
                                c0022q4.f593F = true;
                                c0022q4.f594G = false;
                                break;
                            case 1:
                                c0022q4.f614a.m176a(118, false);
                                c0022q4.f614a.m176a(162, false);
                                c0022q4.f614a.m176a(168, false);
                                c0022q4.f614a.m176a(174, false);
                                c0022q4.f614a.m176a(180, false);
                                c0022q4.f614a.m176a(232, false);
                                c0022q4.f614a.m176a(228, false);
                                c0022q4.f614a.m176a(224, false);
                                c0022q4.f614a.m176a(220, false);
                                c0022q4.f614a.m176a(216, false);
                                c0022q4.f614a.m176a(212, false);
                                c0022q4.f614a.m176a(156, false);
                                c0022q4.f614a.m176a(152, false);
                                c0022q4.f614a.m176a(148, false);
                                c0022q4.f614a.m176a(144, false);
                                c0022q4.f614a.m176a(140, false);
                                c0022q4.f614a.m176a(136, false);
                                c0022q4.f614a.m176a(132, false);
                                c0022q4.f614a.m176a(128, false);
                                c0022q4.f614a.m176a(124, false);
                                break;
                            case 3:
                                c0022q4.f628aN = new C0015j[4];
                                while (i2 < 4) {
                                    if (c0022q4.f628aN[i2] == null) {
                                        c0022q4.f628aN[i2] = new C0015j(c0022q4.f614a, c0022q4.f614a.f552z, null);
                                    }
                                    i2++;
                                }
                                break;
                            case 4:
                                c0022q4.f628aN[1].m90b(30);
                                break;
                            case 5:
                                c0022q4.f628aN[2].m90b(20);
                                break;
                            case 6:
                                c0022q4.f628aN[3].m90b(31);
                                break;
                            case 7:
                                c0022q4.f648am = C0014i.m70a("ff5_3d_menu.m3g");
                                break;
                            case 8:
                                c0022q4.f629aO.m11d();
                                c0022q4.f649an = C0014i.m70a("reflection_plane.m3g")[0];
                                Appearance appearance = new Appearance();
                                appearance.setPolygonMode(c0022q4.f614a.f552z.f266c);
                                appearance.setCompositingMode(c0022q4.f614a.f552z.f270g);
                                appearance.setTexture(0, c0022q4.f629aO.f18n);
                                c0022q4.f649an.setAppearance(0, appearance);
                                break;
                            case 9:
                                if (!c0022q4.f682v) {
                                    c0022q4.f614a.m193g(306);
                                    c0022q4.f682v = true;
                                }
                                c0022q4.f629aO.m6a(true);
                                if (c0022q4.f614a.f369ac.f731k) {
                                    c0022q4.m230a(c0022q4.f651ap);
                                    i2 = 1;
                                } else if (c0022q4.f662b) {
                                    c0022q4.m230a(c0022q4.f659ax);
                                    c0022q4.f659ax.f62c = c0022q4.f614a.f369ac.f721a + 1;
                                    i2 = 1;
                                } else if (c0022q4.f667g) {
                                    c0022q4.m230a(c0022q4.f651ap);
                                    i2 = 1;
                                } else if (c0022q4.f668h != -1 && c0022q4.f614a.f369ac.f729i) {
                                    switch (c0022q4.f668h) {
                                        case 0:
                                            c0022q4.m230a(c0022q4.f661az);
                                            break;
                                        case 1:
                                            c0022q4.m230a(c0022q4.f616aB);
                                            break;
                                        case 2:
                                            c0022q4.m230a(c0022q4.f618aD);
                                            break;
                                        case 3:
                                            c0022q4.m230a(c0022q4.f620aF);
                                            break;
                                    }
                                    if (c0022q4.f614a.f369ac.f717C) {
                                        c0022q4.f627aM.f62c = c0022q4.f614a.f369ac.f722b + 1;
                                    } else {
                                        c0022q4.f627aM.f62c = c0022q4.f614a.f369ac.f722b;
                                    }
                                    c0022q4.f659ax.f62c = c0022q4.f614a.f369ac.f721a;
                                    i2 = 1;
                                } else if (c0022q4.f668h != -1 || c0022q4.f614a.f369ac.f731k) {
                                    c0022q4.m230a(c0022q4.f651ap);
                                    i2 = 1;
                                } else {
                                    c0022q4.m230a(c0022q4.f651ap);
                                }
                                if (i2 != 0) {
                                    c0022q4.f614a.f544r = false;
                                    c0022q4.f614a.m198i(306);
                                }
                                if (c0022q4.f588A) {
                                    c0022q4.f670j = c0022q4.f590C;
                                    while (!c0022q4.f614a.f368ab.m19a(c0022q4.f670j)) {
                                        int i24 = c0022q4.f670j + 1;
                                        c0022q4.f670j = i24;
                                        if (i24 >= 32) {
                                            c0022q4.f670j = 0;
                                        }
                                    }
                                    c0022q4.f614a.f369ac.f716B = c0022q4.f670j;
                                    if (c0022q4.f673m[c0022q4.f668h][c0022q4.f669i].f710c == 3) {
                                        c0022q4.m227a(c0022q4.f670j);
                                        c0022q4.m230a(c0022q4.f655at);
                                    } else {
                                        c0022q4.m227a(c0022q4.f629aO.f23s[c0022q4.f668h][c0022q4.f669i].f76g[c0022q4.f589B]);
                                        c0022q4.m230a(c0022q4.f657av);
                                    }
                                    c0022q4.f588A = false;
                                }
                                c0022q4.f614a.f320D = (byte) 0;
                                c0022q4.f614a.f321E = (short) 0;
                                c0022q4.f594G = false;
                                if (c0022q4.f599L) {
                                    c0022q4.f599L = false;
                                    if (c0022q4.f686z < 12) {
                                        c0022q4.f599L = true;
                                    } else if (!c0022q4.f598K) {
                                        c0022q4.f598K = true;
                                        c0022q4.m232b(48);
                                    }
                                }
                                break;
                            case 10:
                                c0022q4.f614a.f542p = 0;
                                break;
                        }
                        c0022q4.f614a.m182c();
                        if (c0022q4.f686z == 11 && c0022q4.f600M) {
                            c0022q4.f686z = 12;
                            c0022q4.f614a.m204o(256);
                            c0022q4.f614a.f542p = 0;
                        }
                    } else if (c0022q4.f686z == 12) {
                        if (c0022q4.f674n == 0) {
                            if (c0022q4.f614a.f539m) {
                                c0022q4.m232b(71);
                                c0022q4.f614a.f539m = false;
                            } else if (c0022q4.f662b) {
                                c0022q4.m232b(182);
                                c0022q4.f614a.f368ab.m22b();
                                c0022q4.f662b = false;
                            } else if (c0022q4.f667g) {
                                c0022q4.m232b(148);
                                c0022q4.f614a.f368ab.m23b(31);
                                c0022q4.f614a.f368ab.f38f = true;
                                c0022q4.f614a.f368ab.m22b();
                                c0022q4.f667g = false;
                            } else if (c0022q4.f663c) {
                                c0022q4.m232b(126);
                                c0022q4.f614a.f368ab.m22b();
                                c0022q4.f663c = false;
                            } else if (c0022q4.f664d) {
                                c0022q4.m232b(194);
                                c0022q4.f614a.f368ab.m22b();
                                c0022q4.f664d = false;
                            } else if (c0022q4.f665e) {
                                c0022q4.m232b(194);
                                c0022q4.f614a.f368ab.m22b();
                                c0022q4.f665e = false;
                            } else if (c0022q4.f666f) {
                                c0022q4.m232b(125);
                                c0022q4.f614a.f368ab.m22b();
                                c0022q4.f666f = false;
                            }
                        }
                        if (c0022q4.f627aM != null && c0022q4.f627aM.f64e == 5) {
                            c0022q4.f595H += i >> 1;
                            if (c0022q4.f593F && c0022q4.f594G && c0022q4.f592E < c0022q4.f591D) {
                                c0022q4.f628aN[0].m90b(c0022q4.f672l);
                                c0022q4.f593F = false;
                                c0022q4.f594G = false;
                                System.gc();
                            }
                        }
                        float f = 0.005f;
                        c0022q4.f643ah = 32;
                        c0022q4.f645aj = 172;
                        if (c0022q4.f627aM.f64e == 1) {
                            if (c0022q4.f647al == 0) {
                                c0022q4.f639ad = -200;
                                c0022q4.f640ae = -500;
                                c0022q4.f641af = 1000;
                                if (c0022q4.f636aa <= c0022q4.f639ad) {
                                    c0022q4.f647al = 1;
                                }
                            }
                            if (c0022q4.f647al == 1) {
                                c0022q4.f639ad = 700;
                                c0022q4.f640ae = -500;
                                c0022q4.f641af = 900;
                                if (c0022q4.f636aa >= c0022q4.f639ad) {
                                    c0022q4.f647al = 0;
                                }
                            }
                            f = i / 9000.0f;
                        } else if (c0022q4.f627aM.f64e == 2) {
                            c0022q4.f639ad = 100;
                            c0022q4.f640ae = -332;
                            c0022q4.f641af = 800;
                            f = i / 600.0f;
                        } else if (c0022q4.f627aM.f64e == 3) {
                            c0022q4.f639ad = -700;
                            c0022q4.f640ae = -332;
                            c0022q4.f641af = 800;
                            f = i / 600.0f;
                        } else if (c0022q4.f627aM.f64e == 4) {
                            c0022q4.f639ad = 1000;
                            c0022q4.f640ae = -332;
                            c0022q4.f641af = 800;
                            f = i / 600.0f;
                        }
                        c0022q4.f636aa += m119a(c0022q4.f636aa, c0022q4.f639ad, f);
                        c0022q4.f637ab += m119a(c0022q4.f637ab, c0022q4.f640ae, f);
                        c0022q4.f638ac += m119a(c0022q4.f638ac, c0022q4.f641af, f);
                        c0022q4.f642ag += m119a(c0022q4.f642ag, c0022q4.f643ah, f);
                        c0022q4.f644ai = m119a(c0022q4.f644ai, c0022q4.f645aj, f) + c0022q4.f644ai;
                    } else if (c0022q4.f686z != 11 || c0022q4.f614a.f542p <= 10000 || c0022q4.f614a.m194g()) {
                        c0022q4.f592E = c0022q4.f591D + 1000;
                    } else {
                        c0022q4.f600M = true;
                        c0022q4.f686z = 12;
                        c0022q4.f614a.f542p = 0;
                        c0022q4.f614a.m204o(256);
                        c0022q4.f614a.f544r = false;
                        c0022q4.f614a.m198i(306);
                        if (c0022q4.f614a.m194g()) {
                            c0022q4.f614a.f369ac.f746z = false;
                            c0022q4.f614a.f369ac.f716B = Math.abs(c0022q4.f614a.m178b()) % 30;
                            c0022q4.f614a.f369ac.m258a(Math.abs(c0022q4.f614a.m178b()) % 4, Math.abs(c0022q4.f614a.m178b()) % 4);
                            c0022q4.f614a.f369ac.f731k = true;
                            c0022q4.f614a.m182c();
                            c0022q4.f614a.m212x(8192);
                        }
                    }
                    if (c0022q4.f674n < 3) {
                        RunnableC0017l runnableC0017l = c0022q4.f614a;
                        runnableC0017l.f321E = (short) (runnableC0017l.f321E + i);
                        if (c0022q4.f674n != 1) {
                            if (c0022q4.f614a.f321E > 400) {
                                if (c0022q4.f627aM == c0022q4.f651ap) {
                                    if ((c0022q4.f614a.f320D & 4) == 4 || (c0022q4.f614a.f320D & 1048576) == 1048576) {
                                        c0022q4.m237f();
                                    } else if ((c0022q4.f614a.f320D & 8) == 8 || (c0022q4.f614a.f320D & 4194304) == 4194304) {
                                        c0022q4.m238g();
                                    }
                                } else if ((c0022q4.f614a.f320D & 1) == 1 || (c0022q4.f614a.f320D & 262144) == 262144) {
                                    c0022q4.m237f();
                                } else if ((c0022q4.f614a.f320D & 2) == 2 || (c0022q4.f614a.f320D & 16777216) == 16777216) {
                                    c0022q4.m238g();
                                } else if ((c0022q4.f614a.f320D & 4) == 4 || (c0022q4.f614a.f320D & 1048576) == 1048576) {
                                    c0022q4.m231b();
                                } else if ((c0022q4.f614a.f320D & 8) == 8 || (c0022q4.f614a.f320D & 4194304) == 4194304) {
                                    c0022q4.m226a();
                                }
                            }
                        } else if (c0022q4.f614a.f321E > 100) {
                            c0022q4.f614a.f321E = (short) 0;
                            if ((c0022q4.f614a.f320D & 1) == 1 || (c0022q4.f614a.f320D & 262144) == 262144) {
                                if (c0022q4.f678r > 0) {
                                    c0022q4.f678r--;
                                    if (c0022q4.f678r < 0) {
                                        c0022q4.f678r = 0;
                                    }
                                }
                            } else if (((c0022q4.f614a.f320D & 2) == 2 || (c0022q4.f614a.f320D & 16777216) == 16777216) && c0022q4.f678r + ((c0022q4.f684x + 17) / c0022q4.f679s) < c0022q4.f683w) {
                                c0022q4.f678r++;
                            }
                        }
                    }
                } else if ((this.f541o & 16384) != 0) {
                    C0005ae c0005ae2 = this.f445bz.f444by;
                    if (i > 10000) {
                        i = 100;
                    }
                    C0016k c0016k2 = c0005ae2.f55a.f551y;
                    if (c0005ae2.f58d != 0) {
                        if (c0005ae2.f56b <= 3000) {
                            if (c0005ae2.f58d == 5 || c0005ae2.f58d == -99 || c0005ae2.f58d == 4 || c0005ae2.f58d == 3) {
                                c0005ae2.f56b = 1000;
                                c0005ae2.f57c += i;
                            } else {
                                c0005ae2.f56b += i;
                            }
                        }
                        if (c0005ae2.f58d == 1) {
                            c0005ae2.f55a.f368ab.m17a();
                            c0005ae2.f55a.f536j = false;
                            c0005ae2.f55a.f537k = null;
                            if (f311aR.getAppProperty("UNITYGAMECATALOGURL") != null) {
                                c0005ae2.f55a.f536j = true;
                                c0005ae2.f55a.f537k = f311aR.getAppProperty("UNITYGAMECATALOGURL");
                            }
                            c0005ae2.f56b = 3001;
                        }
                        int i25 = ((10000 - c0005ae2.f57c) / 1000) + 1;
                        if (c0005ae2.f58d == 5 && i25 < 0) {
                            c0005ae2.f56b = 3001;
                        }
                        if (c0005ae2.f56b > 3000) {
                            if (c0005ae2.f58d != -99) {
                                c0005ae2.f58d++;
                            }
                            c0005ae2.f56b = 0;
                            c0005ae2.f57c = 0;
                            if (c0005ae2.f58d == 3 && c0016k2.m98b()) {
                                c0005ae2.f58d++;
                            }
                            if (c0005ae2.f58d == 4 && !c0005ae2.f55a.f534h) {
                                c0005ae2.f58d++;
                            }
                            if (c0005ae2.f58d == 6) {
                                c0005ae2.f58d++;
                            }
                            c0005ae2.f56b = 0;
                            c0005ae2.f57c = 0;
                        }
                        if (c0005ae2.f58d >= 9) {
                            c0005ae2.f55a.m212x(4096);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f436bq = true;
        }
    }

    /* JADX INFO: renamed from: O */
    private static int m118O(int i) {
        if (i == 48) {
            return 65536;
        }
        if (i == 49) {
            return 131072;
        }
        if (i == 50) {
            return 262144;
        }
        if (i == 51) {
            return 524288;
        }
        if (i == 52) {
            return 1048576;
        }
        if (i == 53) {
            return 2097152;
        }
        if (i == 54) {
            return 4194304;
        }
        if (i == 55) {
            return 8388608;
        }
        if (i == 56) {
            return 16777216;
        }
        if (i == 57) {
            return 33554432;
        }
        if (i == -1) {
            return 1;
        }
        if (i == -2) {
            return 2;
        }
        if (i == -3) {
            return 4;
        }
        if (i == -4) {
            return 8;
        }
        if (i == -6) {
            return 128;
        }
        if (i == -7) {
            return 64;
        }
        if (i == 42) {
            return 32;
        }
        if (i == 35) {
            return 16;
        }
        if (i == -5) {
            return 256;
        }
        return i == -8 ? 1024 : 0;
    }

    /* JADX INFO: renamed from: a */
    static int m119a(int i, int i2, float f) {
        float f2 = i2 - i;
        if (f2 < 0.001f && f2 > -0.001f) {
            return 0;
        }
        float f3 = f2 * f;
        if (f3 > 1.0f || f3 < -1.0f) {
            return (int) f3;
        }
        return f2 < 0.0f ? -1 : 1;
    }

    /* JADX INFO: renamed from: a */
    static int m120a(String str, int i, int i2, char c) {
        while (i < i2 && str.charAt(i) != c) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private int m121a(String str, int i, boolean z) {
        String string = str.startsWith("/") ? str : new StringBuffer().append("/").append(str).toString();
        if (this.f364aX == -1) {
            try {
                if (z) {
                    this.f366aZ[i] = Image.createImage(string);
                } else {
                    this.f361aU[i] = Image.createImage(string);
                }
            } catch (Error e) {
                m124a(0, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 771, str.concat(e.toString()), this.f445bz);
            } catch (Exception e2) {
                m124a(0, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 764, str.concat(e2.toString()), this.f445bz);
            }
        } else {
            this.f362aV = 0;
            if (this.f363aW != null) {
                System.gc();
                this.f363aW = null;
            }
            try {
                DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream(string));
                int i2 = 0;
                while (true) {
                    int i3 = dataInputStream.read();
                    if (i3 == -1) {
                        break;
                    }
                    if (this.f362aV < 4) {
                        i2 = (i2 << 8) + i3;
                        if (this.f362aV == 3 && i2 != -1991225785) {
                            this.f362aV = i2;
                            break;
                        }
                    }
                    this.f362aV++;
                }
                dataInputStream.close();
                DataInputStream dataInputStream2 = new DataInputStream(getClass().getResourceAsStream(string));
                this.f363aW = new byte[this.f362aV];
                dataInputStream2.readFully(this.f363aW);
                dataInputStream2.close();
                this.f363aW[0] = -119;
                this.f363aW[1] = 80;
                this.f363aW[2] = 78;
                this.f363aW[3] = 71;
                int[] iArr = new int[2];
                m131a(1347179589, iArr);
                m138b(this.f363aW, iArr[0] + 4, iArr[1] - 4);
                m132a(this.f363aW, iArr[1], iArr[0]);
                if (z) {
                    try {
                        this.f366aZ[i] = Image.createImage(this.f363aW, 0, this.f362aV);
                    } catch (Exception e3) {
                    }
                } else {
                    try {
                        this.f361aU[i] = Image.createImage(this.f363aW, 0, this.f362aV);
                    } catch (Exception e4) {
                    }
                }
                this.f363aW = null;
            } catch (Error e5) {
                m125a(0, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 837, this.f445bz);
                this.f363aW = null;
                return -1;
            } catch (Exception e6) {
                m125a(0, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 830, this.f445bz);
                this.f363aW = null;
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private int m122a(short[] sArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            if (i5 + 1 < i) {
                int i7 = sArr[i5 * 5] - sArr[(i5 + 1) * 5];
                int i8 = sArr[(i5 * 5) + 1] - sArr[((i5 + 1) * 5) + 1];
                if (i7 < 0) {
                    i7 = -i7;
                }
                if (i8 < 0) {
                    i8 = -i8;
                }
                if (i7 < i8) {
                    i3 = i7;
                    i4 = i8;
                } else {
                    i3 = i8;
                    i4 = i7;
                }
                int i9 = (i4 * 1007) + (i3 * 441);
                if (i4 < (i3 << 4)) {
                    i9 -= i4 * 40;
                }
                i2 = ((i9 + 512) >> 10) + i6;
            } else {
                i2 = i6;
            }
            i5++;
            i6 = i2;
        }
        return i6 / i;
    }

    /* JADX INFO: renamed from: a */
    private static int m123a(short[][] sArr, int i, int i2) {
        if (i == 0 || sArr == null || sArr[0] == null) {
            return -1;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i - 1 && i2 >= sArr[i3][0]) {
            i3 = i4 + 1;
            while (sArr[i3][0] < 0) {
                i3++;
            }
            if (i2 >= sArr[i3][0]) {
                i4 = i3;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: a */
    private static void m124a(int i, String str, int i2, String str2, RunnableC0017l runnableC0017l) {
        m126a("Assert", new StringBuffer().append(str).append(" Line=").append(i2).append(" Error: ").append(str2).toString(), runnableC0017l);
    }

    /* JADX INFO: renamed from: a */
    public static void m125a(int i, String str, int i2, RunnableC0017l runnableC0017l) {
        m126a("Assert", new StringBuffer().append(str).append(" Line=").append(i2).toString(), runnableC0017l);
    }

    /* JADX INFO: renamed from: a */
    private static void m126a(String str, String str2, RunnableC0017l runnableC0017l) {
        String string;
        if (!f314dH) {
            System.out.println(str.concat(str2));
            return;
        }
        if (f315dI) {
            return;
        }
        if (f313dG) {
            long j = Runtime.getRuntime().totalMemory();
            string = new StringBuffer().append(new StringBuffer().append(str2).append("\nTotal Memory: ").append(j).toString()).append("\nUsed Memory: ").append(j - Runtime.getRuntime().freeMemory()).toString();
        } else {
            str = "";
            string = (runnableC0017l == null || runnableC0017l.f551y == null || runnableC0017l.f551y.f308a == null || runnableC0017l.f551y.f308a[79] == null) ? "ERROR!" : runnableC0017l.f551y.f308a[79];
        }
        Display.getDisplay(f311aR).setCurrent(new TextBox(str, string, 1000, 131072));
        f315dI = true;
    }

    /* JADX INFO: renamed from: a */
    private void m127a(String str, boolean z) {
        if (this.f452cF) {
            return;
        }
        this.f452cF = false;
        this.f348aE = this.f322F + 1500;
        this.f349aF = -1;
        this.f350aG = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m128a(boolean z, String str, int i, RunnableC0017l runnableC0017l) {
        if (z) {
            return;
        }
        m126a("Assert", new StringBuffer().append(str).append(" Line=").append(i).toString(), runnableC0017l);
    }

    /* JADX INFO: renamed from: a */
    private void m129a(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        try {
            m202m(i3);
            short s = (short) (this.f445bz.f343a[(short) (this.f445bz.f343a[i3 + 1] & 65535)] >> 16);
            int i6 = this.f445bz.f343a[i3];
            short s2 = (short) (this.f445bz.f343a[i3 + 1] >> 16);
            byte[] bArr2 = this.f393b[s];
            m128a(s2 % (i4 * 3) == 0, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndshare\\asset_share.hpp", 844, this.f445bz);
            int i7 = i4 * 3 * (i5 + 1);
            int i8 = i + i2;
            while (i < i8) {
                int i9 = bArr[i] & 255;
                int i10 = bArr[i + 1] & 255;
                int i11 = bArr[i + 2] & 255;
                int i12 = -1;
                int i13 = 16777215;
                for (int i14 = 0; i14 < i4; i14++) {
                    int i15 = (i14 * 3) + i6;
                    int i16 = i9 - (bArr2[i15] & 255);
                    int i17 = i10 - (bArr2[i15 + 1] & 255);
                    int i18 = i11 - (bArr2[i15 + 2] & 255);
                    int i19 = (i18 * i18) + (i16 * i16) + (i17 * i17);
                    if (i12 == -1 || i19 < i13) {
                        i13 = i19;
                        i12 = i14;
                    }
                    if (i13 == 0) {
                        break;
                    }
                }
                int i20 = (i12 * 3) + i6 + i7;
                bArr[i] = bArr2[i20];
                bArr[i + 1] = bArr2[i20 + 1];
                bArr[i + 2] = bArr2[i20 + 2];
                i += 3;
            }
            m203n(i3);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m130a(short[] sArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            sArr[i3 * 5] = this.f445bz.m163A(i2);
            sArr[(i3 * 5) + 1] = (short) (-this.f445bz.m163A(i2));
            sArr[(i3 * 5) + 2] = this.f445bz.m163A(i2);
            sArr[(i3 * 5) + 3] = -1;
            sArr[(i3 * 5) + 4] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m131a(int i, int[] iArr) {
        for (int i2 = 0; i2 < this.f362aV; i2++) {
            if (this.f363aW[i2] == 80 && this.f363aW[i2 + 1] == 76 && this.f363aW[i2 + 2] == 84 && this.f363aW[i2 + 3] == 69) {
                iArr[0] = i2;
                iArr[1] = (this.f363aW[i2 - 1] & 255) + ((this.f363aW[i2 - 4] & 255) << 24) + ((this.f363aW[i2 - 3] & 255) << 16) + ((this.f363aW[i2 - 2] & 255) << 8) + 4;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m132a(byte[] bArr, int i, int i2) {
        if (this.f512dh == 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= 256) {
                    break;
                }
                long j = i4;
                for (int i5 = 0; i5 < 8; i5++) {
                    j = (1 & j) != 0 ? (j >> 1) ^ 3988292384L : j >> 1;
                }
                this.f511dg[i4] = j;
                i3 = i4 + 1;
            }
            this.f512dh = 1;
        }
        long j2 = 4294967295L;
        for (int i6 = 0; i6 < i; i6++) {
            j2 = (j2 >> 8) ^ this.f511dg[((int) (((long) bArr[i6 + i2]) ^ j2)) & 255];
        }
        long j3 = j2 ^ 4294967295L;
        bArr[i2 + i] = (byte) ((j3 >> 24) & 255);
        bArr[i2 + i + 1] = (byte) ((j3 >> 16) & 255);
        bArr[i2 + i + 2] = (byte) ((j3 >> 8) & 255);
        bArr[i2 + i + 3] = (byte) (j3 & 255);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m133a(int[] iArr, int i, short[][] sArr, int i2) {
        int i3;
        if (i2 <= 0) {
            return false;
        }
        if (i < 0) {
            i = -i;
        }
        int iM123a = m123a(sArr, i2, i >> 16);
        int i4 = iM123a != i2 + (-1) ? iM123a + 1 : iM123a;
        int i5 = -1;
        int i6 = -1;
        if (sArr[i4][0] < 0) {
            int i7 = i4 + 1;
            if (sArr[i7][0] < 0) {
                i3 = i7 + 1;
                i6 = i7;
            } else {
                i6 = i4;
                i3 = i7;
            }
            m128a(sArr[i3][0] >= 0, "c:\\mobiledevelopment\\ff53d\\src\\game_state_cutscene_share_java.hpp", 367, this.f445bz);
            i5 = i4;
        } else {
            i3 = i4;
        }
        short s = sArr[iM123a][0];
        short s2 = sArr[i3][0];
        if (s == s2) {
            iArr[0] = sArr[i3][1];
            iArr[1] = sArr[i3][2];
            iArr[2] = sArr[i3][3];
        } else if (i5 != -1) {
            for (int i8 = 0; i8 < 3; i8++) {
                this.f525du[i8] = sArr[i5][i8 + 1] - sArr[iM123a][i8 + 1];
                this.f526dv[i8] = sArr[i3][i8 + 1] - sArr[i6][i8 + 1];
                this.f527dw[i8] = sArr[i6][i8 + 1] - sArr[i5][i8 + 1];
            }
            int i9 = ((i >> 1) - (s << 15)) / (s2 - s);
            int iM165a = m165a(i9 >> 1) << 1;
            int iM179b = 32768 - (m179b(i9 >> 1) << 1);
            int iM179b2 = (32768 - (m179b(i9) << 1)) >> 1;
            iArr[0] = sArr[iM123a][1] + ((this.f525du[0] * iM165a) >> 15) + ((this.f526dv[0] * iM179b) >> 15) + ((this.f527dw[0] * iM179b2) >> 15);
            iArr[1] = sArr[iM123a][2] + ((this.f525du[1] * iM165a) >> 15) + ((this.f526dv[1] * iM179b) >> 15) + ((this.f527dw[1] * iM179b2) >> 15);
            iArr[2] = ((iM179b2 * this.f527dw[2]) >> 15) + sArr[iM123a][3] + ((iM165a * this.f525du[2]) >> 15) + ((this.f526dv[2] * iM179b) >> 15);
        } else {
            int i10 = ((i >> 1) - (s << 15)) / (s2 - s);
            iArr[0] = sArr[iM123a][1] + (((sArr[i3][1] - sArr[iM123a][1]) * i10) >> 15);
            iArr[1] = sArr[iM123a][2] + (((sArr[i3][2] - sArr[iM123a][2]) * i10) >> 15);
            iArr[2] = ((i10 * (sArr[i3][3] - sArr[iM123a][3])) >> 15) + sArr[iM123a][3];
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static int m134b(int i, int i2, int i3) {
        if (i < i2) {
            while (i2 - i > 32768) {
                i2 -= 65536;
            }
        } else if (i > i2) {
            while (i - i2 > 32768) {
                i2 += 65536;
            }
        }
        return (((i2 - i) * i3) >> 16) + i;
    }

    /* JADX INFO: renamed from: b */
    private static int m135b(int i, int i2, int i3, int i4, int i5) {
        if (i < i2) {
            while (i2 - i > 32768) {
                i2 -= 65536;
            }
        } else if (i > i2) {
            while (i - i2 > 32768) {
                i2 += 65536;
            }
        }
        if (i2 < i3) {
            while (i3 - i2 > 32768) {
                i3 -= 65536;
            }
        } else if (i2 > i3) {
            while (i2 - i3 > 32768) {
                i3 += 65536;
            }
        }
        return (((i2 - i) * i5) >> 16) + i + (((i3 - i2) * i4) >> 16);
    }

    /* JADX INFO: renamed from: b */
    private void m136b(int i, int[] iArr) {
        this.f364aX = i;
        this.f365aY = iArr;
    }

    /* JADX INFO: renamed from: b */
    private void m137b(boolean z) {
        this.f320D = (byte) 0;
        this.f321E = (short) 0;
        if (z) {
            return;
        }
        try {
            if (this.f531e) {
                return;
            }
            try {
                this.f320D = (byte) 0;
                this.f321E = (short) 0;
                if ((this.f541o & 8192) == 0) {
                    m146k();
                    this.f544r = true;
                    m141g(306, 0);
                    m196h(306);
                } else if (this.f319C != 8) {
                    m161y();
                }
            } catch (Exception e) {
            }
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m138b(byte[] bArr, int i, int i2) {
        switch (this.f364aX) {
            case 0:
                for (int i3 = i; i3 < i + i2; i3 += 3) {
                    int i4 = bArr[i3] & 255;
                    int i5 = bArr[i3 + 1] & 255;
                    int i6 = bArr[i3 + 2] & 255;
                    if (i4 < 0) {
                        i4 += 255;
                    }
                    if (i5 < 0) {
                        i5 += 255;
                    }
                    if (i6 < 0) {
                        i6 += 255;
                    }
                    if (i4 == i5 && i4 == i6) {
                        int i7 = (this.f365aY[0] >> 16) & 255;
                        int i8 = (this.f365aY[0] >> 8) & 255;
                        int i9 = this.f365aY[0] & 255;
                        bArr[i3] = (byte) ((i7 * i4) >> 8);
                        bArr[i3 + 1] = (byte) ((i8 * i4) >> 8);
                        bArr[i3 + 2] = (byte) ((i9 * i4) >> 8);
                    }
                }
                break;
            case 1:
                m129a(bArr, i, i2, this.f365aY[0], this.f365aY[1], this.f365aY[2]);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m139b(short[] sArr, int i) {
        this.f488cp.m28a();
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i2 < i) {
            if (i4 != this.f488cp.f67b || i3 != this.f488cp.f68c) {
                this.f488cp.m28a();
            }
            int i5 = sArr[i2 * 5] << 12;
            i3 = (-sArr[(i2 * 5) + 1]) << 12;
            this.f338V.m252a(i5, i3, this.f488cp);
            sArr[(i2 * 5) + 3] = this.f488cp.f66a;
            i2++;
            i4 = i5;
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m140b(int[] iArr, int i, short[][] sArr, int i2) {
        int i3;
        int i4;
        if (i2 <= 0) {
            return false;
        }
        if (i < 0) {
            i = -i;
        }
        int iM123a = m123a(sArr, i2, i >> 16);
        int i5 = iM123a != i2 + (-1) ? iM123a + 1 : iM123a;
        int i6 = -1;
        if (sArr[i5][0] < 0) {
            i3 = i5 + 1;
            int i7 = -sArr[i5][0];
            m128a(sArr[i3][0] >= 0, "c:\\mobiledevelopment\\ff53d\\src\\game_state_cutscene_share_java.hpp", 432, this.f445bz);
            i6 = i7;
            i4 = i5;
        } else {
            i3 = i5;
            i4 = -1;
        }
        short s = sArr[iM123a][0];
        short s2 = sArr[i3][0];
        if (s == s2) {
            iArr[0] = sArr[i3][1];
            iArr[1] = sArr[i3][2];
            iArr[2] = sArr[i3][3];
        } else if (i4 != -1) {
            int i8 = (i >> 16) < i6 ? (i - (s << 16)) / ((i6 - s) << 3) : ((i - (i6 << 16)) / ((s2 - i6) << 3)) + 8192;
            int iM179b = (32768 - (m179b(i8) << 1)) << 1;
            int iM165a = (m165a(i8) << 1) << 1;
            iArr[0] = m135b(sArr[iM123a][1], sArr[i4][1], sArr[i3][1], iM179b, iM165a);
            iArr[1] = m135b(sArr[iM123a][2], sArr[i4][2], sArr[i3][2], iM179b, iM165a);
            iArr[2] = m135b(sArr[iM123a][3], sArr[i4][3], sArr[i3][3], iM179b, iM165a);
        } else {
            int i9 = (i - (s << 16)) / (s2 - s);
            iArr[0] = m134b(sArr[iM123a][1], sArr[i3][1], i9);
            iArr[1] = m134b(sArr[iM123a][2], sArr[i3][2], i9);
            iArr[2] = m134b(sArr[iM123a][3], sArr[i3][3], i9);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private synchronized void m141g(int i, int i2) {
        if (this.f510df != null) {
            this.f510df.m220a(306, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m142h(int i, int i2) {
        this.f445bz.f400bG = i;
        this.f445bz.f401bH = i2;
        C0007b c0007b = new C0007b();
        this.f445bz.f338V.m252a(this.f445bz.f339W << 8, (-this.f445bz.f340X) << 8, c0007b);
        int i3 = c0007b.f69d >> 8;
        this.f445bz.f402bI[0] = this.f445bz.f339W;
        this.f445bz.f402bI[1] = this.f445bz.f340X;
        this.f445bz.f402bI[2] = i3;
        this.f445bz.f403bJ[0] = this.f445bz.f410bQ;
        this.f445bz.f403bJ[1] = 0;
        this.f445bz.f403bJ[2] = this.f445bz.f374ah[0].f86E - 8388608;
    }

    /* JADX INFO: renamed from: i */
    private int m143i(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        m128a(j >= -2147483648L, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1884, this.f445bz);
        m128a(j <= 2147483647L, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1885, this.f445bz);
        return (i * i2) >> 14;
    }

    /* JADX INFO: renamed from: j */
    private int m144j(int i, int i2) {
        long j = (((long) i) << 14) / ((long) i2);
        m128a(j >= -2147483648L, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1891, this.f445bz);
        m128a(j <= 2147483647L, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1892, this.f445bz);
        return (int) j;
    }

    /* JADX INFO: renamed from: k */
    private int m145k(int i, int i2) {
        long j = (((long) i) << 22) / ((long) i2);
        m128a(j >= -2147483648L, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1898, this.f445bz);
        m128a(j <= 2147483647L, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1899, this.f445bz);
        return (int) j;
    }

    /* JADX INFO: renamed from: k */
    private void m146k() {
        if (this.f510df != null) {
            this.f510df.m218a();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m147l() {
        this.f445bz.f534h = false;
        m148m();
        m149n();
        byte[] bArr = new byte[112];
        int[] iArr = new int[28];
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("config", false);
            recordStoreOpenRecordStore.getRecord(1, bArr, 0);
            recordStoreOpenRecordStore.closeRecordStore();
            for (int i = 0; i < 28; i++) {
                int i2 = i << 2;
                iArr[i] = (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
            }
            if (iArr[0] != 51) {
                m185d();
                return;
            }
            this.f532f = iArr[1] != 0;
            this.f532f = true;
            this.f533g = iArr[2];
            this.f323G = (byte) iArr[3];
            this.f534h = iArr[4] != 0;
            this.f445bz.f534h = false;
            this.f535i = iArr[5] != 0;
            m128a(true, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\system_java.hpp", 305, this.f445bz);
        } catch (Exception e) {
            this.f445bz.f534h = true;
            this.f445bz.f533g = 0;
            this.f445bz.m209t(this.f445bz.f533g);
            m148m();
            m149n();
            m185d();
        } catch (RecordStoreNotFoundException e2) {
            this.f445bz.f534h = true;
            this.f445bz.f533g = 0;
            this.f445bz.m209t(this.f445bz.f533g);
            m185d();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m148m() {
        this.f323G = -1;
        this.f534h = false;
    }

    /* JADX INFO: renamed from: n */
    private void m149n() {
        this.f532f = true;
        this.f533g = 1;
    }

    /* JADX INFO: renamed from: o */
    private void m150o() {
        for (int i = 0; i < 4; i++) {
            this.f371ae[i].f224j = true;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m151p() {
        try {
            m196h(303);
            if (this.f533g > 0) {
                m193g(306);
                if ((this.f541o & 4096) != 0) {
                    this.f445bz.m198i(306);
                } else {
                    this.f445bz.m200k(306);
                }
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: q */
    private void m152q() {
        this.f445bz.f369ac.f729i = true;
        this.f370ad = this.f371ae[0].f139ae;
        if (this.f369ac.f746z) {
            this.f493cu = true;
            if (this.f371ae[this.f369ac.f715A].f139ae > 0 && this.f370ad > this.f371ae[this.f369ac.f715A].f139ae) {
                this.f493cu = false;
            }
        }
        switch (this.f369ac.f725e) {
            case 0:
                if (this.f369ac.f728h <= 0) {
                    m142h(4, 4);
                } else {
                    m142h(7, 4);
                }
                break;
            case 1:
                m142h(5, 4);
                break;
            case 2:
                m142h(6, 4);
                break;
        }
        m112I((this.f445bz.f374ah[0].f107Z - 1) - 1);
        m211v(7);
    }

    /* JADX INFO: renamed from: r */
    private void m153r() {
        m128a(this.f409bP.f66a != -1, "c:\\mobiledevelopment\\ff53d\\src\\game_state_play_share.hpp", 1188, this.f445bz);
        int i = (this.f339W >> 15) + 8;
        int i2 = ((-this.f340X) >> 15) + 8;
        int i3 = 9999999;
        for (int i4 = 0; i4 < this.f496cx; i4++) {
            int i5 = i - this.f497cy[i4 << 1];
            int i6 = i2 - this.f497cy[(i4 << 1) + 1];
            int i7 = (i5 * i5) + (i6 * i6);
            if (i7 == 0) {
                this.f380an = i4;
                break;
            }
            if (i7 < i3) {
                this.f380an = i4;
                i3 = i7;
            }
        }
        int i8 = (this.f331O + this.f418bY) >> 16;
        this.f377ak = (1 << (((i8 + 22) >> 4) & 15)) | (1 << ((i8 >> 4) & 15)) | (1 << (((i8 - 11) >> 4) & 15)) | (1 << (((i8 + 11) >> 4) & 15)) | (1 << (((i8 - 22) >> 4) & 15));
        RunnableC0017l runnableC0017l = this.f445bz;
        if (runnableC0017l.f442bw < 166) {
            if (runnableC0017l.f379am < runnableC0017l.f381ao[runnableC0017l.f445bz.f380an].length) {
                runnableC0017l.f379am++;
            }
        } else {
            if (runnableC0017l.f442bw <= 166 || runnableC0017l.f379am <= 12) {
                return;
            }
            runnableC0017l.f379am--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x04ed  */
    /* JADX INFO: renamed from: s */
    private void m154s() {
        int i;
        int i2;
        int i3;
        m172a(0, 60, this.f446c, (this.f499d - 60) - 90);
        this.f445bz.f552z.m81g();
        f312aS.setClip(0, 60, this.f446c, (this.f499d - 60) - 90);
        this.f445bz.f552z.m79e();
        this.f445bz.f552z.m82h();
        this.f445bz.f552z.m83i();
        this.f445bz.f552z.m84j();
        if (this.f369ac.f746z) {
            int i4 = this.f369ac.f715A;
            if (!this.f371ae[i4].f224j) {
                C0015j c0015j = this.f371ae[i4].f161b;
                int i5 = this.f371ae[i4].f237w;
                int i6 = this.f371ae[i4].f239y;
                int i7 = this.f371ae[i4].f238x;
                c0015j.f292e.setIdentity();
                c0015j.f292e.postTranslate((i5 + c0015j.f295h.f562j[13][0]) * 0.00390625f, (i6 + c0015j.f295h.f562j[13][1] + 152) * 0.00390625f, (i7 + c0015j.f295h.f562j[13][2]) * 0.00390625f);
                c0015j.f292e.postScale(1.5f, 1.5f, 1.5f);
                c0015j.f288a.f552z.f271h.render(c0015j.f293f.f22r, c0015j.f292e);
            }
        }
        if (this.f371ae[0].f222h) {
            for (int i8 = 0; i8 < 10; i8++) {
                if (!this.f373ag[i8].f218d) {
                    this.f373ag[i8].m55d();
                }
            }
        } else {
            for (int i9 = 9; i9 > -1; i9--) {
                if (!this.f373ag[i9].f218d) {
                    this.f373ag[i9].m55d();
                }
            }
        }
        this.f371ae[0].m55d();
        this.f445bz.f552z.m80f();
        C0023r c0023r = this.f443bx;
        c0023r.f687a.m172a(0, 0, c0023r.f687a.f446c, c0023r.f687a.f499d);
        c0023r.m244b();
        if (c0023r.f687a.f322F > 4000) {
            int i10 = c0023r.f687a.f446c;
            c0023r.f687a.m210u(c0023r.f687a.f322F - 4000);
            c0023r.f687a.f546t.m65a(c0023r.f687a.f360aQ, 0, c0023r.f687a.f360aQ.length(), i10 - c0023r.f687a.f546t.m59a("00:00.00", 0, "00:00.00".length()), 0, 0);
            c0023r.f687a.f360aQ = "";
            if (c0023r.f687a.f535i) {
                StringBuffer stringBuffer = new StringBuffer();
                RunnableC0017l runnableC0017l = c0023r.f687a;
                runnableC0017l.f360aQ = stringBuffer.append(runnableC0017l.f360aQ).append(Math.abs((c0023r.f687a.f371ae[0].f90I * 559) >> 16)).toString();
                StringBuffer stringBuffer2 = new StringBuffer();
                RunnableC0017l runnableC0017l2 = c0023r.f687a;
                runnableC0017l2.f360aQ = stringBuffer2.append(runnableC0017l2.f360aQ).append(c0023r.f687a.f551y.f308a[70]).toString();
            } else {
                StringBuffer stringBuffer3 = new StringBuffer();
                RunnableC0017l runnableC0017l3 = c0023r.f687a;
                runnableC0017l3.f360aQ = stringBuffer3.append(runnableC0017l3.f360aQ).append(Math.abs((c0023r.f687a.f371ae[0].f90I * 900) >> 16)).toString();
                StringBuffer stringBuffer4 = new StringBuffer();
                RunnableC0017l runnableC0017l4 = c0023r.f687a;
                runnableC0017l4.f360aQ = stringBuffer4.append(runnableC0017l4.f360aQ).append(c0023r.f687a.f551y.f308a[69]).toString();
            }
            c0023r.f687a.f546t.m65a(c0023r.f687a.f360aQ, 0, c0023r.f687a.f360aQ.length(), c0023r.f687a.f446c - 4, 58, 10);
            c0023r.m246c();
            int iM206q = ((c0023r.f687a.f499d - c0023r.f687a.m206q(100)) - 90) - 4;
            if (c0023r.f687a.f371ae[0].f229o == 1) {
                int iM205p = (int) ((c0023r.f687a.f371ae[0].f226l / c0023r.f687a.f371ae[0].f227m) * c0023r.f687a.m205p(100));
                c0023r.f687a.m171a(100, 4, iM206q);
                c0023r.f687a.m172a(0, 0, iM205p, c0023r.f687a.f499d);
                c0023r.f687a.m171a(96, 4, iM206q);
                c0023r.f687a.m172a(0, 0, c0023r.f687a.f446c, c0023r.f687a.f499d);
            } else if (c0023r.f687a.f371ae[0].f229o == 2) {
                int iM205p2 = (int) ((c0023r.f687a.f371ae[0].f226l / c0023r.f687a.f371ae[0].f228n) * c0023r.f687a.m205p(100));
                c0023r.f687a.m171a(100, 4, iM206q);
                c0023r.f687a.m172a(0, 0, iM205p2, c0023r.f687a.f499d);
                c0023r.f687a.m171a(96, 4, iM206q);
                c0023r.f687a.m172a(0, 0, c0023r.f687a.f446c, c0023r.f687a.f499d);
            } else if (c0023r.f687a.f371ae[0].f229o == 0) {
                if (((c0023r.f687a.f322F >> 6) & 1) != 0) {
                    c0023r.f687a.m171a(92, 4, iM206q);
                } else {
                    c0023r.f687a.m171a(96, 4, iM206q);
                }
            }
            if (c0023r.f687a.f369ac.f728h > 0) {
                int i11 = c0023r.f687a.f371ae[0].f151aq;
                if (i11 > 74665) {
                    if (((c0023r.f687a.f322F >> 10) & 1) != 0) {
                        c0023r.m243a(68, 60, 52);
                    } else {
                        c0023r.m243a(72, 64, 56);
                    }
                } else if (i11 > 44799) {
                    c0023r.m243a(68, 60, 56);
                } else if (i11 > 14933) {
                    c0023r.m243a(68, 64, 56);
                } else {
                    c0023r.m243a(72, 64, 56);
                }
            } else if (c0023r.f687a.f369ac.f725e == 0) {
                c0023r.m242a(15, 0);
            } else if (c0023r.f687a.f369ac.f725e == 1) {
                c0023r.m245b(15, 0);
                c0023r.m242a(15, c0023r.f687a.f546t.m67c() - 2);
            } else if (c0023r.f687a.f369ac.f725e == 2) {
                int i12 = c0023r.f687a.f446c;
                int i13 = c0023r.f687a.f499d;
                int iM205p3 = c0023r.f687a.m205p(86);
                int iM206q2 = c0023r.f687a.m206q(86);
                int i14 = (i12 >> 1) - (iM205p3 >> 1);
                int i15 = ((i13 - 90) - 4) - iM206q2;
                c0023r.f687a.m171a(86, i14, i15);
                int i16 = 180 - ((c0023r.f687a.f351aH - 3) - 4);
                int i17 = 180 - ((c0023r.f687a.f351aH + 4) + 4);
                if (i16 < 0) {
                    i16 = 0;
                }
                if (i16 > 180) {
                    i16 = 180;
                }
                if (i17 < 0) {
                    i17 = 0;
                }
                if (i17 > 180) {
                    i17 = 180;
                }
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = c0023r.f687a.f352aI;
                int i22 = (c0023r.f687a.f371ae[0].f232r[i21] - c0023r.f687a.f371ae[0].f231q[i21]) / 3;
                if (c0023r.f687a.f371ae[0].f234t > c0023r.f687a.f371ae[0].f231q[i21] + (i22 << 1)) {
                    i18 = 0;
                    i19 = 255;
                    i20 = 0;
                } else if (c0023r.f687a.f371ae[0].f234t > i22 + c0023r.f687a.f371ae[0].f231q[i21]) {
                    i18 = 255;
                    i19 = 255;
                    i20 = 0;
                } else if (c0023r.f687a.f371ae[0].f234t > c0023r.f687a.f371ae[0].f231q[i21] + 0) {
                    i18 = 255;
                    i19 = 0;
                    i20 = 0;
                } else if (c0023r.f687a.f371ae[0].f234t < c0023r.f687a.f371ae[0].f231q[i21]) {
                    i18 = 255;
                    i19 = 255;
                    i20 = 255;
                }
                if (c0023r.f687a.f352aI >= 4) {
                    i = 255;
                    i2 = 255;
                    i3 = 255;
                } else {
                    i = i20;
                    i2 = i18;
                    i3 = i19;
                }
                c0023r.f687a.m174a(i14, i15, iM205p3, iM206q2 << 1, i16, i17, 0);
                int i23 = 180 - ((c0023r.f687a.f351aH - 1) - 4);
                int i24 = 180 - ((c0023r.f687a.f351aH + 2) + 4);
                if (i23 < 0) {
                    i23 = 0;
                }
                if (i23 > 180) {
                    i23 = 180;
                }
                if (i24 < 0) {
                    i24 = 0;
                }
                if (i24 > 180) {
                    i24 = 180;
                }
                c0023r.f687a.m174a(i14, i15, iM205p3, iM206q2 << 1, i23, i24, (i2 << 16) | (i3 << 8) | i);
                c0023r.m242a(15, 0);
                int i25 = c0023r.f687a.f446c;
                int i26 = c0023r.f687a.f499d;
                int iM206q3 = c0023r.f687a.m206q(78);
                int iM205p4 = (i25 >> 1) - (c0023r.f687a.m205p(78) >> 1);
                int i27 = ((i26 - 90) - 4) - iM206q3;
                int iM205p5 = c0023r.f687a.m205p(82) >> 1;
                int i28 = c0023r.f687a.f446c >> 1;
                int iM205p6 = c0023r.f687a.m205p(78) >> 1;
                c0023r.f687a.m171a(78, iM205p4, i27);
                int i29 = 0;
                int i30 = 0;
                switch (c0023r.f687a.f352aI) {
                    case 0:
                    case 2:
                    case 4:
                        i30 = i27 - iM205p5;
                        break;
                    case 1:
                    case 3:
                    case 5:
                        i30 = (i27 + iM206q3) - iM205p5;
                        break;
                }
                switch (c0023r.f687a.f352aI) {
                    case 0:
                    case 1:
                        i29 = (i28 - iM205p6) - iM205p5;
                        break;
                    case 2:
                    case 3:
                        i29 = i28 - iM205p5;
                        break;
                    case 4:
                    case 5:
                        i29 = (i28 + iM205p6) - iM205p5;
                        break;
                }
                c0023r.f687a.m171a(82, i29, i30);
            }
        }
        if ((c0023r.f687a.f369ac.f725e == 0 || c0023r.f687a.f369ac.f725e == 1) && c0023r.f687a.f371ae[0].f152ar > 0 && !c0023r.f687a.f371ae[0].f220f && c0023r.f687a.f371ae[0].f90I > 0) {
            c0023r.f687a.f546t.m61a(c0023r.f687a.f551y.f308a[67], 0, c0023r.f687a.f551y.f308a[67].length(), c0023r.f687a.f446c - 20, c0023r.f687a.f446c >> 1, c0023r.f687a.f499d >> 1, 1, 0, -1, -1);
        }
        c0023r.f687a.m172a(0, 0, c0023r.f687a.f446c, c0023r.f687a.f499d);
        if (c0023r.f687a.f322F < 4000) {
            int iM205p7 = (c0023r.f687a.f446c - c0023r.f687a.m205p(34)) >> 1;
            c0023r.f687a.m171a(34, iM205p7, 0);
            if (c0023r.f687a.f369ac.f739s || c0023r.f687a.f322F > 3000) {
                c0023r.f687a.m171a(42, iM205p7, 39);
            } else if (c0023r.f687a.f322F > 2000) {
                c0023r.f687a.m171a(46, iM205p7, 23);
            } else if (c0023r.f687a.f322F > 1000) {
                c0023r.f687a.m171a(38, iM205p7, 7);
            }
        } else if (c0023r.f687a.f348aE <= c0023r.f687a.f322F || c0023r.f687a.f319C != 1) {
            if (c0023r.f687a.f348aE > 0) {
                c0023r.f687a.m192f();
            }
        } else if (c0023r.f687a.f350aG != null) {
            c0023r.f687a.m172a(0, 0, c0023r.f687a.f446c, c0023r.f687a.f499d);
            c0023r.f687a.f546t.m61a(c0023r.f687a.f350aG, 0, c0023r.f687a.f350aG.length(), c0023r.f687a.f446c - 16, c0023r.f687a.f446c >> 1, (c0023r.f687a.f499d >> 2) + 10, 1, 0, -1, -1);
        } else if (c0023r.f687a.f349aF != -1) {
            c0023r.f687a.m172a(0, 0, c0023r.f687a.f446c, c0023r.f687a.f499d);
            c0023r.f687a.m171a(c0023r.f687a.f349aF, (c0023r.f687a.f446c >> 1) - 68, (c0023r.f687a.f499d >> 1) - 20);
        } else {
            c0023r.f687a.f348aE = c0023r.f687a.f322F - 1;
        }
        if ((c0023r.f687a.f540n & 2) != 0) {
            c0023r.f687a.f360aQ = new StringBuffer().append("").append(c0023r.f687a.f371ae[0].f237w >> 8).toString();
            c0023r.f687a.f546t.m65a(c0023r.f687a.f360aQ, 0, c0023r.f687a.f360aQ.length(), c0023r.f687a.f446c - 68, c0023r.f687a.f499d - 68, 0);
            c0023r.f687a.f360aQ = new StringBuffer().append("").append(c0023r.f687a.f371ae[0].f238x >> 8).toString();
            c0023r.f687a.f546t.m65a(c0023r.f687a.f360aQ, 0, c0023r.f687a.f360aQ.length(), c0023r.f687a.f446c - 68, c0023r.f687a.f499d - 58, 0);
            c0023r.f687a.f360aQ = new StringBuffer().append("").append(c0023r.f687a.f371ae[0].f239y >> 8).toString();
            c0023r.f687a.f546t.m65a(c0023r.f687a.f360aQ, 0, c0023r.f687a.f360aQ.length(), c0023r.f687a.f446c - 68, c0023r.f687a.f499d - 48, 0);
        }
        c0023r.f687a.m172a(0, 0, c0023r.f687a.f446c, c0023r.f687a.f499d);
        c0023r.f687a.f551y.m95a();
        if (c0023r.f687a.f319C == 1) {
            c0023r.f687a.f551y.m96a(7, 0);
        }
        this.f395bB++;
    }

    /* JADX INFO: renamed from: t */
    private boolean m155t() {
        return (this.f408bO == 2 && (this.f508dc == 1 || this.f508dc == 5 || this.f508dc == 2 || this.f508dc == 3 || this.f508dc == 4)) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    private int m156u() {
        if (this.f445bz.m116M(this.f445bz.f400bG) == null) {
            return -1;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream(new StringBuffer().append("/").append(this.f445bz.m116M(this.f445bz.f400bG)).toString()));
            int iAvailable = dataInputStream.available() >> 1;
            short[] sArr = new short[iAvailable];
            for (int i = 0; i < iAvailable; i++) {
                sArr[i] = (short) (((short) dataInputStream.readUnsignedByte()) | (((short) dataInputStream.readUnsignedByte()) << 8));
            }
            dataInputStream.close();
            this.f517dm = null;
            this.f518dn = null;
            this.f519do = null;
            this.f522dr = null;
            this.f523ds = null;
            this.f524dt = null;
            System.gc();
            this.f514dj = sArr[1];
            this.f518dn = new short[3];
            this.f516dl = sArr[2];
            this.f517dm = new short[this.f516dl];
            int i2 = 0;
            int i3 = 3;
            while (i2 < this.f516dl) {
                this.f517dm[i2] = sArr[i3];
                i2++;
                i3++;
            }
            this.f519do = new short[3][][];
            this.f518dn[0] = sArr[i3];
            this.f519do[0] = (short[][]) Array.newInstance((Class<?>) Short.TYPE, this.f518dn[0], 4);
            int i4 = i3 + 1;
            for (int i5 = 0; i5 < this.f518dn[0]; i5++) {
                int i6 = 0;
                while (i6 < 4) {
                    this.f519do[0][i5][i6] = sArr[i4];
                    i6++;
                    i4++;
                }
            }
            this.f518dn[1] = sArr[i4];
            this.f519do[1] = (short[][]) Array.newInstance((Class<?>) Short.TYPE, this.f518dn[1], 4);
            int i7 = i4 + 1;
            for (int i8 = 0; i8 < this.f518dn[1]; i8++) {
                int i9 = 0;
                while (i9 < 4) {
                    this.f519do[1][i8][i9] = sArr[i7];
                    i9++;
                    i7++;
                }
            }
            this.f518dn[2] = sArr[i7];
            this.f519do[2] = (short[][]) Array.newInstance((Class<?>) Short.TYPE, this.f518dn[2], 4);
            int i10 = i7 + 1;
            for (int i11 = 0; i11 < this.f518dn[2]; i11++) {
                int i12 = 0;
                while (i12 < 4) {
                    this.f519do[2][i11][i12] = sArr[i10];
                    i12++;
                    i10++;
                }
            }
            int i13 = i10 + 1;
            this.f520dp = sArr[i10];
            int i14 = i13 + 1;
            this.f521dq = sArr[i13];
            this.f523ds = (short[][]) Array.newInstance((Class<?>) Short.TYPE, this.f520dp, 4);
            this.f522dr = new short[this.f521dq];
            int i15 = 0;
            while (i15 < this.f521dq) {
                this.f522dr[i15] = sArr[i14];
                i15++;
                i14++;
            }
            this.f524dt = (short[][][][]) Array.newInstance((Class<?>) short[][].class, this.f520dp, 4);
            for (int i16 = 0; i16 < this.f520dp; i16++) {
                this.f523ds[i16][0] = sArr[i14];
                this.f524dt[i16][0] = (short[][]) Array.newInstance((Class<?>) Short.TYPE, this.f523ds[i16][0], 4);
                int i17 = i14 + 1;
                for (int i18 = 0; i18 < this.f523ds[i16][0]; i18++) {
                    int i19 = 0;
                    while (i19 < 4) {
                        this.f524dt[i16][0][i18][i19] = sArr[i17];
                        i19++;
                        i17++;
                    }
                }
                this.f523ds[i16][1] = sArr[i17];
                this.f524dt[i16][1] = (short[][]) Array.newInstance((Class<?>) Short.TYPE, this.f523ds[i16][1], 4);
                int i20 = i17 + 1;
                for (int i21 = 0; i21 < this.f523ds[i16][1]; i21++) {
                    int i22 = 0;
                    while (i22 < 4) {
                        this.f524dt[i16][1][i21][i22] = sArr[i20];
                        i22++;
                        i20++;
                    }
                }
                this.f523ds[i16][2] = sArr[i20];
                this.f524dt[i16][2] = (short[][]) Array.newInstance((Class<?>) Short.TYPE, this.f523ds[i16][2], 4);
                int i23 = i20 + 1;
                for (int i24 = 0; i24 < this.f523ds[i16][2]; i24++) {
                    int i25 = 0;
                    while (i25 < 4) {
                        this.f524dt[i16][2][i24][i25] = sArr[i23];
                        i25++;
                        i23++;
                    }
                }
                this.f523ds[i16][3] = sArr[i23];
                this.f524dt[i16][3] = (short[][]) Array.newInstance((Class<?>) Short.TYPE, this.f523ds[i16][3], 4);
                i14 = i23 + 1;
                for (int i26 = 0; i26 < this.f523ds[i16][3]; i26++) {
                    int i27 = 0;
                    while (i27 < 4) {
                        this.f524dt[i16][3][i26][i27] = sArr[i14];
                        i27++;
                        i14++;
                    }
                }
            }
            System.gc();
            return i14;
        } catch (Exception e) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: v */
    private void m157v() {
        for (int i = 0; i < 10; i++) {
            this.f373ag[i].f224j = this.f445bz.f404bK[i];
        }
        if (this.f319C != 3) {
            this.f445bz.m211v(this.f445bz.f401bH);
        }
        this.f317A.f629aO.m6a(false);
    }

    /* JADX INFO: renamed from: w */
    static int m158w(int i) {
        return i * 117;
    }

    /* JADX INFO: renamed from: w */
    private void m159w() {
        this.f445bz = this;
        this.f444by = new C0005ae(this);
        this.f443bx = new C0023r(this);
        this.f551y = new C0016k(this);
        this.f368ab = new C0002ab(this);
        this.f369ac = new C0030y(this);
        this.f328L = new Transform();
        this.f472cZ = false;
        this.f371ae = null;
        this.f372af = null;
        this.f494cv = null;
        this.f338V = null;
        this.f488cp = null;
        this.f409bP = null;
        this.f445bz.f402bI = new int[3];
        this.f445bz.f403bJ = new int[3];
        this.f445bz.f404bK = new boolean[10];
        this.f515dk = (short) 0;
        this.f525du = new int[3];
        this.f526dv = new int[3];
        this.f527dw = new int[3];
        this.f528dx = new int[3];
        this.f529dy = new int[3];
        this.f530dz = new int[3];
        this.f500dA = new Transform();
        this.f501dB = new float[16];
        this.f458cL = new int[5];
        this.f459cM = new int[5];
        this.f460cN = new int[5];
        for (int i = 0; i < 5; i++) {
            this.f458cL[i] = 7000;
            this.f459cM[i] = 4200;
            this.f460cN[i] = 500;
        }
        this.f461cO = new int[5];
        this.f461cO[0] = 1000;
        this.f461cO[1] = 4200;
        this.f461cO[2] = 4800;
        this.f461cO[3] = 5200;
        this.f461cO[4] = 5200;
        this.f462cP = 100;
        this.f464cR = 10;
        this.f465cS = 10;
        this.f466cT = -270;
        this.f467cU = 100;
        this.f468cV = -130;
        this.f469cW = -2;
        this.f470cX = 0;
        this.f471cY = 0;
        this.f353aJ = 100;
        this.f463cQ = 100;
    }

    /* JADX INFO: renamed from: x */
    private void m160x() {
        this.f339W = 0;
        this.f340X = 0;
        this.f489cq = 0;
        this.f341Y = 0.0f;
        this.f492ct = -1;
        this.f331O = 0;
        this.f410bQ = 0;
        this.f336T = null;
        this.f337U = null;
        this.f486cn = null;
        this.f474cb = 0;
        this.f475cc = 0;
        this.f478cf = 0;
        this.f479cg = 0;
        this.f480ch = 0;
        this.f483ck = 0;
        this.f370ad = 1;
        this.f493cu = true;
        this.f473ca = 0;
        this.f379am = 20;
        this.f338V = new C0026u();
        this.f488cp = new C0007b();
        this.f409bP = new C0007b();
        this.f373ag = null;
        this.f374ah = null;
        this.f375ai = 0;
        this.f376aj = 0;
        this.f326J = 0;
        this.f322F = 0;
        this.f324H = 0;
        this.f487co = 0;
        this.f495cw = 0;
        this.f377ak = 0;
        this.f395bB = 0;
        this.f348aE = 0;
        this.f349aF = -1;
        this.f452cF = false;
        this.f408bO = 1;
        this.f329M = false;
        this.f330N = true;
        this.f327K = false;
        this.f325I = 0;
        this.f350aG = null;
        this.f369ac.f729i = false;
        this.f454cH = new int[6];
        this.f454cH[0] = 0;
        this.f454cH[1] = 2500;
        this.f454cH[2] = 5000;
        this.f454cH[3] = 8000;
        this.f454cH[4] = 10000;
        this.f454cH[5] = 14000;
        this.f351aH = 1;
        this.f352aI = 0;
        this.f455cI = false;
        this.f457cK = false;
        this.f456cJ = false;
        this.f353aJ = 100;
    }

    /* JADX INFO: renamed from: y */
    private void m161y() {
        this.f326J = 0;
        if (this.f319C == 2) {
            this.f398bE = true;
            m146k();
        } else {
            if (this.f319C != 3) {
                this.f408bO = this.f319C;
            }
            m211v(3);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m162z() {
        int iM213y = this.f445bz.m213y(350);
        short s = (short) (this.f445bz.f343a[351] >> 16);
        this.f318B = new short[s >> 1];
        for (int i = 0; i < (s >> 1); i++) {
            this.f318B[i] = (short) (this.f445bz.m164B(iM213y) | (this.f445bz.m164B(iM213y) << '\b'));
        }
        this.f445bz.m203n(350);
    }

    /* JADX INFO: renamed from: A */
    final short m163A(int i) {
        int i2 = this.f393b[i][this.f396bC];
        int i3 = this.f393b[i][this.f396bC + 1];
        if (i2 < 0) {
            i2 += 256;
        }
        if (i3 < 0) {
            i3 += 256;
        }
        this.f396bC += 2;
        return (short) (((i3 & 255) << 8) | (i2 & 255));
    }

    /* JADX INFO: renamed from: B */
    final char m164B(int i) {
        byte b = this.f393b[i][this.f396bC];
        this.f396bC++;
        return b < 0 ? (char) (b + 256) : (char) b;
    }

    /* JADX INFO: renamed from: a */
    final int m165a(int i) {
        short s = this.f318B[(i >> 8) & 255];
        return s + (((this.f318B[((i >> 8) + 1) & 255] - s) * (i - (i & (-256)))) >> 8);
    }

    /* JADX INFO: renamed from: a */
    final int m166a(int i, int i2) {
        int i3 = i2 + 1;
        int i4 = (i3 >> 1) + i;
        return (i3 & 1) != 0 ? this.f343a[i4] & 65535 : (this.f343a[i4] >> 16) & 65535;
    }

    /* JADX INFO: renamed from: a */
    final int m167a(String[] strArr, String str, int i) throws Throwable {
        int i2;
        boolean z = false;
        int i3 = 0;
        for (int i4 = 0; i4 < 201; i4++) {
            strArr[i4] = null;
        }
        DataInputStream dataInputStream = null;
        try {
            try {
                DataInputStream dataInputStream2 = new DataInputStream(getClass().getResourceAsStream(new StringBuffer().append("/").append(str).toString()));
                try {
                    int iAvailable = dataInputStream2.available();
                    byte[] bArr = new byte[iAvailable];
                    byte[] bArr2 = new byte[iAvailable + 2];
                    dataInputStream2.readFully(bArr);
                    bArr2[0] = (byte) (iAvailable >> 8);
                    bArr2[1] = (byte) iAvailable;
                    for (int i5 = 0; i5 < iAvailable; i5++) {
                        bArr2[i5 + 2] = bArr[i5];
                    }
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                    dataInputStream2.close();
                    try {
                        dataInputStream = new DataInputStream(byteArrayInputStream);
                        String utf = "";
                        try {
                            utf = DataInputStream.readUTF(dataInputStream);
                        } catch (Exception e) {
                        }
                        boolean z2 = true;
                        int i6 = 0;
                        int i7 = 0;
                        while (!z) {
                            try {
                                if (strArr[i7] == null) {
                                    strArr[i7] = "";
                                }
                                if (!z2) {
                                    switch (this.f323G) {
                                        case 0:
                                            strArr[i7] = "English!";
                                            i6 = i6;
                                            i7++;
                                            break;
                                        case 1:
                                            strArr[i7] = "French!";
                                            i6 = i6;
                                            i7++;
                                            break;
                                        case 2:
                                            strArr[i7] = "Italian!";
                                            i6 = i6;
                                            i7++;
                                            break;
                                        case 3:
                                            strArr[i7] = "German!";
                                            i6 = i6;
                                            i7++;
                                            break;
                                        case 4:
                                            int i8 = i7 + 1;
                                            strArr[i7] = "Spanish!";
                                            i6 = i6;
                                            i7 = i8;
                                            break;
                                        default:
                                            i3 = i7 + 1;
                                            strArr[i7] = "Random!";
                                            i6 = i6;
                                            i7 = i3;
                                            break;
                                    }
                                } else {
                                    i6++;
                                    char cCharAt = utf.charAt(i6);
                                    if (cCharAt != '\n' && cCharAt != '\r') {
                                        char cM102C = (char) m102C(cCharAt);
                                        if (strArr[i7].endsWith("\\") && cM102C == 'n') {
                                            strArr[i7] = strArr[i7].substring(0, strArr[i7].length() - 1);
                                            cM102C = '\n';
                                        }
                                        strArr[i7] = new StringBuffer().append(strArr[i7]).append(cM102C).toString();
                                    } else if (cCharAt == '\n' && (i7 = i7 + 1) < 201) {
                                        strArr[i7] = "";
                                    }
                                    if (i6 >= utf.length()) {
                                        z2 = false;
                                    }
                                }
                                if (i7 >= 201) {
                                    z = true;
                                }
                            } catch (Exception e2) {
                                i2 = i7;
                                if (dataInputStream == null) {
                                    return i2;
                                }
                                dataInputStream.close();
                                return i2;
                            }
                        }
                        dataInputStream.close();
                        return i7;
                    } catch (Exception e3) {
                        dataInputStream = null;
                        i2 = 0;
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = null;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    dataInputStream = dataInputStream2;
                    i2 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                }
            } catch (Exception e5) {
                i2 = i3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    final String m168a(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            charArray[i] = (char) m102C(charArray[i]);
        }
        return new String(charArray);
    }

    /* JADX INFO: renamed from: a */
    final Image m169a(String str, int i, int i2, int i3) {
        Image imageCreateImage;
        if (!str.startsWith("/")) {
            str = new StringBuffer().append("/").append(str).toString();
        }
        this.f362aV = 0;
        if (this.f363aW != null) {
            System.gc();
            this.f363aW = null;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream(str));
            int i4 = 0;
            while (true) {
                int i5 = dataInputStream.read();
                if (i5 == -1) {
                    break;
                }
                if (this.f362aV < 4) {
                    i4 = (i4 << 8) + i5;
                    if (this.f362aV == 3 && i4 != -1991225785) {
                        this.f362aV = i4;
                        break;
                    }
                }
                this.f362aV++;
            }
            dataInputStream.close();
            DataInputStream dataInputStream2 = new DataInputStream(getClass().getResourceAsStream(str));
            this.f363aW = new byte[this.f362aV];
            dataInputStream2.readFully(this.f363aW);
            dataInputStream2.close();
        } catch (Exception e) {
        }
        this.f363aW[0] = -119;
        this.f363aW[1] = 80;
        this.f363aW[2] = 78;
        this.f363aW[3] = 71;
        int[] iArr = new int[2];
        m131a(1347179589, iArr);
        m129a(this.f363aW, iArr[0] + 4, iArr[1] - 4, i, i2, i3);
        m132a(this.f363aW, iArr[1], iArr[0]);
        try {
            imageCreateImage = Image.createImage(this.f363aW, 0, this.f362aV);
        } catch (Exception e2) {
            imageCreateImage = null;
        }
        this.f363aW = null;
        return imageCreateImage;
    }

    /* JADX INFO: renamed from: a */
    final void m170a() {
        C0020o c0020o = this.f510df;
        if (c0020o.f573a) {
            return;
        }
        c0020o.f577e = -1;
        c0020o.f576d = -1;
        c0020o.f574b = false;
        for (int i = 0; i < 3; i++) {
            if (c0020o.f575c[i] != null) {
                try {
                    c0020o.f575c[i].f31a.stop();
                    c0020o.f575c[i].f31a.removePlayerListener(c0020o);
                    c0020o.f575c[i].f31a.deallocate();
                    c0020o.f575c[i].f31a.close();
                    c0020o.f575c[i].f31a = null;
                    c0020o.f575c[i].f32b = 0;
                    c0020o.f575c[i] = null;
                } catch (Exception e) {
                } catch (Throwable th) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m171a(int i, int i2, int i3) {
        int i4 = i2 + ((short) (this.f445bz.f343a[i] >> 16));
        int i5 = i3 + ((short) (this.f445bz.f343a[i] & 65535));
        int iM205p = m205p(i);
        int iM206q = m206q(i);
        short s = (short) (this.f445bz.f343a[i + 2] & 65535);
        short s2 = (short) (this.f445bz.f343a[i + 3] >> 16);
        m175a((short) (this.f445bz.f343a[(short) (this.f445bz.f343a[i + 2] >> 16)] >> 16), i4 - s, i5 - s2, i4, i5, iM205p, iM206q, false);
    }

    /* JADX INFO: renamed from: a */
    final void m172a(int i, int i2, int i3, int i4) {
        this.f426bg = 0;
        this.f427bh = i2;
        this.f428bi = i3;
        this.f429bj = i4;
    }

    /* JADX INFO: renamed from: a */
    final void m173a(int i, int i2, int i3, int i4, int i5) {
        f312aS.setColor(i5);
        f312aS.setClip(this.f426bg, this.f427bh, this.f428bi, this.f429bj);
        f312aS.fillRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    final void m174a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        f312aS.setColor(i7);
        f312aS.setClip(this.f426bg, this.f427bh, this.f428bi, this.f429bj);
        f312aS.fillArc(i, i2, i3, i4, i5, i6 - i5);
    }

    /* JADX INFO: renamed from: a */
    final void m175a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        if (i4 < this.f426bg) {
            i6 -= this.f426bg - i4;
            i4 = this.f426bg;
        }
        if (i4 + i6 > this.f426bg + this.f428bi) {
            i6 = (this.f426bg + this.f428bi) - i4;
        }
        if (i5 < this.f427bh) {
            i7 -= this.f427bh - i5;
            i5 = this.f427bh;
        }
        if (i5 + i7 > this.f427bh + this.f429bj) {
            i7 = (this.f427bh + this.f429bj) - i5;
        }
        if (i6 <= 0 || i7 <= 0) {
            return;
        }
        f312aS.setClip(i4, i5, i6, i7);
        if (this.f361aU[i] != null) {
            f312aS.drawImage(this.f361aU[i], i2, i3, 20);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m176a(int i, boolean z) {
        short s = (short) (this.f445bz.f343a[i + 2] >> 16);
        short s2 = (short) (this.f445bz.f343a[s] & 65535);
        short s3 = (short) (this.f445bz.f343a[s] >> 16);
        short s4 = (short) (this.f445bz.f343a[s + 1] & 65535);
        m128a(s2 >= 0, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 1030, this.f445bz);
        int i2 = s2 + 1;
        if (s2 == 0) {
            m121a(new StringBuffer().append("/").append(Integer.toString(s4)).append(".png").toString(), (int) s3, false);
        }
        this.f445bz.f343a[s] = i2 | (this.f445bz.f343a[s] & (-65536));
    }

    /* JADX INFO: renamed from: a */
    final void m177a(boolean z) {
        C0020o c0020o = this.f510df;
        int i = (c0020o.f578f.f533g * 100) / 5;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 3) {
                return;
            }
            if (c0020o.f575c[i3] != null) {
                c0020o.f575c[i3].f31a.getControl("VolumeControl").setLevel(i);
            }
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    final int m178b() {
        return this.f513di.nextInt();
    }

    /* JADX INFO: renamed from: b */
    final int m179b(int i) {
        return m165a(i + 16384);
    }

    /* JADX INFO: renamed from: b */
    final void m180b(int i, int i2) {
        m171a(232, i - (m205p(232) >> 1), i2);
    }

    /* JADX INFO: renamed from: c */
    final int m181c(int i) {
        return this.f318B[i & 255];
    }

    /* JADX INFO: renamed from: c */
    final void m182c() {
        this.f504dE = true;
        m27j();
        this.f504dE = false;
    }

    /* JADX INFO: renamed from: c */
    final void m183c(int i, int i2) {
        m171a(220, i - (m205p(220) >> 1), i2);
    }

    /* JADX INFO: renamed from: d */
    final int m184d(int i) {
        return this.f318B[(i + 64) & 255];
    }

    /* JADX INFO: renamed from: d */
    final void m185d() {
        int[] iArr = new int[28];
        iArr[0] = 51;
        iArr[1] = this.f532f ? 1 : 0;
        iArr[2] = this.f533g;
        iArr[3] = this.f323G;
        iArr[4] = this.f534h ? 1 : 0;
        iArr[5] = this.f535i ? 1 : 0;
        m128a(true, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\system_java.hpp", 179, this.f445bz);
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            int i3 = i << 2;
            bArr[i3] = i2 >> 24;
            bArr[i3 + 1] = (byte) (i2 >> 16);
            bArr[i3 + 2] = (byte) (i2 >> 8);
            bArr[i3 + 3] = (byte) i2;
        }
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("config", true);
            if (recordStoreOpenRecordStore.getNumRecords() == 0) {
                recordStoreOpenRecordStore.addRecord(bArr, 0, bArr.length);
            } else {
                recordStoreOpenRecordStore.setRecord(1, bArr, 0, bArr.length);
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: d */
    final void m186d(int i, int i2) {
        f312aS.setClip(0, 0, this.f446c, this.f499d);
        f312aS.setColor(255, 174, 64);
        f312aS.drawLine(i, i2, i, i2);
        f312aS.drawLine(i, i2 + 1, i + 1, i2 + 1);
        f312aS.drawLine(i, i2 + 2, i + 2, i2 + 2);
        f312aS.drawLine(i, i2 + 3, i + 1, i2 + 3);
        f312aS.drawLine(i, i2 + 4, i, i2 + 4);
    }

    /* JADX INFO: renamed from: e */
    final int m187e(int i) {
        int i2 = -i;
        m128a(i2 >= 0, "c:\\mobiledevelopment\\ff53d\\src\\game_share.h", 277, this.f445bz);
        m128a((i2 >> 12) + 1 < 256, "c:\\mobiledevelopment\\ff53d\\src\\game_share.h", 278, this.f445bz);
        int i3 = this.f394bA[i2 >> 12];
        return i3 + (((this.f394bA[(i2 >> 12) + 1] - i3) * (i2 - (i2 & (-4096)))) >> 12);
    }

    /* JADX INFO: renamed from: e */
    final void m188e() {
        if (this.f330N) {
            int i = this.f419bZ;
            if (this.f334R > 0) {
                i = 3;
            }
            switch (i) {
                case 0:
                    this.f413bT = this.f466cT - 200;
                    this.f414bU = this.f467cU + 0;
                    this.f415bV = this.f468cV - 350;
                    this.f416bW = (int) (((this.f469cW - 15) << 24) / 360.0f);
                    this.f417bX = 0;
                    this.f418bY = 0;
                    break;
                case 1:
                    this.f413bT = this.f466cT - 50;
                    this.f414bU = this.f467cU + 0;
                    this.f415bV = this.f468cV + 20;
                    this.f416bW = (int) (((this.f469cW - 8) << 24) / 360.0f);
                    this.f417bX = 0;
                    this.f418bY = 0;
                    break;
                case 2:
                    this.f413bT = this.f466cT + 0;
                    this.f414bU = this.f467cU + 0;
                    this.f415bV = this.f468cV + 300;
                    this.f416bW = (int) (((this.f469cW + 0) << 24) / 360.0f);
                    this.f417bX = 0;
                    this.f418bY = 0;
                    break;
                case 3:
                    this.f413bT = this.f466cT + 0;
                    this.f414bU = this.f467cU + 50;
                    this.f415bV = this.f468cV + 0;
                    this.f416bW = (int) (((this.f469cW + 0) << 24) / 360.0f);
                    this.f417bX = 0;
                    this.f418bY = (int) ((-754974720) / 360.0f);
                    break;
                case 4:
                    this.f413bT = this.f466cT + 0;
                    this.f414bU = (-50) - this.f467cU;
                    this.f415bV = this.f468cV + 0;
                    this.f416bW = (int) (((this.f469cW + 0) << 24) / 360.0f);
                    this.f417bX = 0;
                    this.f418bY = -((int) ((-754974720) / 360.0f));
                    break;
                case 10:
                    this.f413bT = -15000;
                    this.f414bU = 0;
                    this.f415bV = 400;
                    this.f416bW = 0;
                    this.f417bX = 0;
                    this.f418bY = 1631118;
                    break;
                case 11:
                    this.f413bT = 0;
                    this.f415bV = -350;
                    this.f416bW = 0;
                    this.f417bX = 0;
                    this.f418bY = 1165084;
                    this.f414bU = -25;
                    break;
            }
            this.f411bR = this.f413bT;
            this.f412bS = this.f414bU;
            this.f332P = i;
        }
    }

    /* JADX INFO: renamed from: e */
    final void m189e(int i, int i2) {
        f312aS.setClip(0, 0, this.f446c, this.f499d);
        f312aS.setColor(255, 174, 64);
        f312aS.drawLine(12, i2, 12, i2);
        f312aS.drawLine(11, i2 + 1, 12, i2 + 1);
        f312aS.drawLine(10, i2 + 2, 12, i2 + 2);
        f312aS.drawLine(11, i2 + 3, 12, i2 + 3);
        f312aS.drawLine(12, i2 + 4, 12, i2 + 4);
    }

    /* JADX INFO: renamed from: f */
    final int m190f(int i) {
        int i2 = -i;
        m128a(i2 >= 0, "c:\\mobiledevelopment\\ff53d\\src\\game_share.h", 289, this.f445bz);
        m128a((i2 >> 8) + 1 < 256, "c:\\mobiledevelopment\\ff53d\\src\\game_share.h", 290, this.f445bz);
        int i3 = this.f394bA[i2 >> 8];
        return i3 + (((this.f394bA[(i2 >> 8) + 1] - i3) * (i2 - (i2 & (-256)))) >> 8);
    }

    /* JADX INFO: renamed from: f */
    final int m191f(int i, int i2) {
        int iM145k;
        if (i2 == 0.0f) {
            if (i > 0.0f) {
                return 4194304;
            }
            return ((float) i) != 0.0f ? -4194304 : 0;
        }
        if (Math.abs(i) <= Math.abs(i2)) {
            int iM144j = m144j(i, i2);
            m128a(iM144j <= 65536, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1931, this.f445bz);
            m128a(iM144j >= -65536, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1932, this.f445bz);
            iM145k = m145k(iM144j, m143i(7209, m143i(iM144j, iM144j)) + 25750);
            if (i2 < 0) {
                return i < 0 ? iM145k - 8388608 : iM145k + 8388608;
            }
        } else {
            int iM144j2 = m144j(i2, i);
            m128a(iM144j2 <= 65536, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1944, this.f445bz);
            m128a(iM144j2 >= -65536, "c:\\mobiledevelopment\\ff53d\\src\\game_share.hpp", 1945, this.f445bz);
            iM145k = 4194304 - m145k(iM144j2, m143i(7209, m143i(iM144j2, iM144j2)) + 25750);
            if (i < 0) {
                return i2 < 0 ? iM145k - 8388608 : iM145k - 8388608;
            }
        }
        return iM145k;
    }

    /* JADX INFO: renamed from: f */
    final void m192f() {
        this.f348aE = 0;
        this.f349aF = -1;
        this.f452cF = false;
        this.f350aG = null;
    }

    /* JADX INFO: renamed from: g */
    final void m193g(int i) {
        this.f510df.m222b(i);
    }

    /* JADX INFO: renamed from: g */
    final boolean m194g() {
        return f311aR.getAppProperty("UNITYDEMOMODE") != null && f311aR.getAppProperty("UNITYDEMOMODE").equals("Y");
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m195h() {
        synchronized (this) {
            if (this.f421bb) {
                m106E();
                m185d();
                m204o(298);
                m204o(294);
                m204o(290);
                m204o(286);
                m204o(186);
                m204o(192);
                m204o(206);
                m204o(202);
                m204o(198);
                this.f545s.m66b();
                this.f546t.m66b();
                this.f547u.m66b();
                this.f545s = null;
                this.f546t = null;
                this.f547u = null;
                this.f548v = null;
                this.f549w = null;
                this.f550x = null;
                this.f445bz.f551y.f308a = null;
                System.gc();
                this.f445bz.f402bI = null;
                this.f445bz.f403bJ = null;
                this.f517dm = null;
                this.f518dn = null;
                this.f519do = null;
                this.f522dr = null;
                this.f523ds = null;
                this.f524dt = null;
                this.f525du = null;
                this.f526dv = null;
                this.f527dw = null;
                this.f528dx = null;
                this.f529dy = null;
                this.f530dz = null;
                this.f500dA = null;
                this.f501dB = null;
                System.gc();
                this.f458cL = null;
                this.f459cM = null;
                this.f460cN = null;
                this.f461cO = null;
                this.f368ab = null;
                this.f369ac = null;
                this.f443bx = null;
                this.f551y = null;
                this.f444by = null;
                this.f328L = null;
                C0022q c0022q = this.f445bz.f317A;
                c0022q.f614a.m170a();
                for (int i = 0; i < c0022q.f677q; i++) {
                    c0022q.f650ao[i] = null;
                }
                c0022q.f651ap = null;
                for (int i2 = 0; i2 < 5; i2++) {
                    c0022q.f652aq[i2] = null;
                }
                c0022q.f653ar = null;
                for (int i3 = 0; i3 < 1; i3++) {
                    c0022q.f654as[0] = null;
                }
                c0022q.f655at = null;
                for (int i4 = 0; i4 < 1; i4++) {
                    c0022q.f656au[0] = null;
                }
                c0022q.f657av = null;
                for (int i5 = 0; i5 < 4; i5++) {
                    c0022q.f658aw[i5] = null;
                }
                c0022q.f659ax = null;
                for (int i6 = 0; i6 < 4; i6++) {
                    c0022q.f660ay[i6] = null;
                }
                c0022q.f661az = null;
                for (int i7 = 0; i7 < 4; i7++) {
                    c0022q.f615aA[i7] = null;
                }
                c0022q.f616aB = null;
                for (int i8 = 0; i8 < 4; i8++) {
                    c0022q.f617aC[i8] = null;
                }
                c0022q.f618aD = null;
                for (int i9 = 0; i9 < 4; i9++) {
                    c0022q.f619aE[i9] = null;
                }
                c0022q.f620aF = null;
                for (int i10 = 0; i10 < 1; i10++) {
                    c0022q.f621aG[0] = null;
                }
                c0022q.f622aH = null;
                for (int i11 = 0; i11 < 5; i11++) {
                    c0022q.f623aI[i11] = null;
                }
                c0022q.f624aJ = null;
                for (int i12 = 0; i12 < 5; i12++) {
                    c0022q.f625aK[i12] = null;
                }
                c0022q.f626aL = null;
                c0022q.f629aO = null;
                c0022q.f629aO = null;
                this.f445bz.f552z.m75b();
                this.f343a = null;
                this.f421bb = false;
                this.f317A = null;
                this.f552z = null;
                this.f318B = null;
                this.f394bA = null;
            }
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: h */
    final synchronized void m196h(int i) {
        if (this.f510df != null) {
            this.f510df.m219a(i);
        }
    }

    public final synchronized void hideNotify() {
        AbstractC0004ad.f54aT = true;
        m146k();
        this.f424be = true;
        this.f425bf = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m197i() {
        this.f420ba = System.currentTimeMillis();
        System.currentTimeMillis();
        if (this.f432bm == null) {
            this.f505dF = false;
            this.f430bk = true;
            setFullScreenMode(true);
            Display.getDisplay(f311aR).setCurrent(this);
            this.f432bm = new Thread(this);
            this.f432bm.start();
        }
    }

    /* JADX INFO: renamed from: i */
    final synchronized void m198i(int i) {
        C0020o c0020o = this.f510df;
        if (!c0020o.f573a) {
            c0020o.f576d = i;
            c0020o.f577e = c0020o.f578f.f542p;
            Player playerM223c = c0020o.m223c(i);
            if (playerM223c != null || (playerM223c = c0020o.m222b(i)) != null) {
                for (int i2 = 0; i2 < 3; i2++) {
                    try {
                        if (c0020o.f575c[i2] != null) {
                            c0020o.m221a(c0020o.f575c[i2].f31a);
                        }
                    } catch (Exception e) {
                    } catch (Throwable th) {
                    }
                }
                playerM223c.setLoopCount(1);
                playerM223c.start();
                c0020o.f574b = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    final synchronized boolean m199j(int i) {
        return this.f510df.f574b;
    }

    /* JADX INFO: renamed from: k */
    final synchronized void m200k(int i) {
        Player playerM223c;
        C0020o c0020o = this.f510df;
        if (!c0020o.f573a && ((playerM223c = c0020o.m223c(306)) != null || (playerM223c = c0020o.m222b(306)) != null)) {
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    if (c0020o.f575c[i2] != null) {
                        c0020o.m221a(c0020o.f575c[i2].f31a);
                    }
                } catch (Exception e) {
                } catch (Throwable th) {
                }
            }
            playerM223c.setLoopCount(-1);
            playerM223c.start();
            c0020o.f574b = true;
        }
    }

    protected final synchronized void keyPressed(int i) {
        if (!AbstractC0004ad.f54aT) {
            int iM118O = (1048560 & i) != 589824 ? m118O(i) : 0;
            if (iM118O != 0) {
                this.f437br = iM118O | this.f437br;
            }
        }
    }

    protected final synchronized void keyReleased(int i) {
        if (!AbstractC0004ad.f54aT) {
            int iM118O = m118O(i);
            if (iM118O != 0) {
                this.f438bs = iM118O | this.f438bs;
            }
        } else if (i == 53) {
            AbstractC0004ad.f54aT = false;
            showNotify();
        }
    }

    /* JADX INFO: renamed from: l */
    final void m201l(int i) {
        C0020o c0020o = this.f510df;
        Player playerM223c = c0020o.m223c(306);
        if (playerM223c != null) {
            try {
                c0020o.m221a(playerM223c);
            } catch (Exception e) {
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    final void m202m(int i) throws IOException {
        short s = (short) (this.f445bz.f343a[i + 1] & 65535);
        short s2 = (short) (this.f445bz.f343a[s] & 65535);
        m128a(s2 >= 0, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 1315, this.f445bz);
        int i2 = s2 + 1;
        if (s2 == 0) {
            short s3 = (short) (this.f445bz.f343a[s] >> 16);
            m128a(this.f393b[s3] == null, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 1320, this.f445bz);
            DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream(new StringBuffer().append("/").append(Integer.toString(s3)).append(".dat").toString()));
            this.f393b[s3] = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(this.f393b[s3]);
            dataInputStream.close();
        }
        this.f445bz.f343a[s] = i2 | (this.f445bz.f343a[s] & (-65536));
    }

    /* JADX INFO: renamed from: n */
    final void m203n(int i) {
        short s = (short) (this.f445bz.f343a[i + 1] & 65535);
        short s2 = (short) (this.f445bz.f343a[s] & 65535);
        m128a(s2 != 0, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 1351, this.f445bz);
        int i2 = s2 - 1;
        if (i2 == 0) {
            short s3 = (short) (this.f445bz.f343a[s] >> 16);
            m128a(this.f393b[s3] != null, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 1356, this.f445bz);
            this.f393b[s3] = null;
            System.gc();
        }
        this.f445bz.f343a[s] = i2 | (this.f445bz.f343a[s] & (-65536));
    }

    /* JADX INFO: renamed from: o */
    final void m204o(int i) {
        short s = (short) (this.f445bz.f343a[i + 2] >> 16);
        short s2 = (short) (this.f445bz.f343a[s] & 65535);
        short s3 = (short) (this.f445bz.f343a[s] >> 16);
        int i2 = s2 - 1;
        if (i2 == 0) {
            m128a(this.f361aU[s3] != null, "c:\\mobiledevelopment\\ff53d\\ndplatform\\ndjava\\asset_java.hpp", 1184, this.f445bz);
            this.f361aU[s3] = null;
        }
        this.f445bz.f343a[s] = (this.f445bz.f343a[s] & (-65536)) | (i2 >= 0 ? i2 : 0);
    }

    /* JADX INFO: renamed from: p */
    final int m205p(int i) {
        return (short) (this.f445bz.f343a[i + 1] >> 16);
    }

    public final synchronized void paint(Graphics graphics) {
        synchronized (this) {
            if (AbstractC0004ad.f54aT) {
                Font font = Font.getFont(0, 0, 8);
                Font font2 = graphics.getFont();
                graphics.setFont(font);
                String[] strArr = {"Press 5 to Continue", "Appuie sur 5 pour continuer", "Premi 5 per continuare", "Drücke 5 zum Fortfahren", "Pulsa 5 para continuar"};
                graphics.setColor(0);
                graphics.fillRect(0, 0, getWidth(), getHeight());
                graphics.setColor(16777215);
                int height = (getHeight() / (graphics.getFont().getHeight() * strArr.length)) + (graphics.getFont().getHeight() << 1);
                for (String str : strArr) {
                    graphics.drawString(str, (getWidth() >> 1) - (graphics.getFont().stringWidth(strArr[1]) >> 1), height, 20);
                    height += Font.getDefaultFont().getHeight() + 5;
                }
                graphics.setFont(font2);
            } else if (!this.f531e) {
                f312aS = graphics;
                if (this.f504dE) {
                    m171a(298, (this.f446c - m205p(298)) >> 1, (this.f499d - m206q(298)) >> 1);
                } else if (!this.f531e) {
                    m108F();
                }
                f312aS = null;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    final int m206q(int i) {
        return (short) (this.f445bz.f343a[i + 1] & 65535);
    }

    /* JADX INFO: renamed from: r */
    final void m207r(int i) {
        m136b(0, (int[]) null);
        short s = (short) (this.f445bz.f343a[i + 1] & 65535);
        short s2 = (short) (this.f445bz.f343a[s] >> 16);
        for (int i2 = 0; i2 < s2; i2++) {
            int iM166a = m166a(s, i2);
            m136b(0, new int[]{(((short) (this.f445bz.f343a[iM166a] >> 16)) << 16) | (((short) (this.f445bz.f343a[iM166a] & 65535)) << 8) | ((short) (this.f445bz.f343a[iM166a + 1] >> 16))});
            m176a((int) ((short) (this.f445bz.f343a[iM166a + 1] & 65535)), false);
        }
        m136b(-1, (int[]) null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f505dF) {
            this.f430bk = true;
            this.f421bb = false;
            this.f531e = false;
            this.f433bn = 0;
            this.f540n = 0;
            this.f534h = false;
            this.f535i = true;
            try {
                if (!this.f421bb) {
                    this.f552z = new C0014i(this);
                    this.f317A = new C0022q(this);
                    this.f446c = getWidth();
                    this.f499d = getHeight();
                    this.f426bg = 0;
                    this.f427bh = 0;
                    this.f428bi = this.f446c;
                    this.f429bj = this.f499d;
                    this.f510df = new C0020o(this);
                    DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream("/data.bin"));
                    int i = dataInputStream.readInt();
                    this.f343a = new int[i >> 2];
                    byte[] bArr = new byte[i];
                    dataInputStream.readFully(bArr);
                    int i2 = i >> 2;
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = i3 << 2;
                        this.f343a[i3] = (bArr[i4 + 3] & 255) | (bArr[i4] << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
                    }
                    dataInputStream.close();
                    m162z();
                    m100A();
                    m147l();
                    m209t(this.f533g);
                    this.f435bp = false;
                    this.f437br = 0;
                    this.f438bs = 0;
                    this.f544r = false;
                    this.f536j = false;
                    this.f537k = null;
                    if (f311aR.getAppProperty("UNITYDEMOMODE") != null) {
                        f311aR.getAppProperty("UNITYDEMOMODE").equals("Y");
                    }
                    if (f311aR.getAppProperty("UNITYGAMECATALOGURL") != null) {
                        this.f536j = true;
                        this.f537k = new String(f311aR.getAppProperty("UNITYGAMECATALOGURL"));
                    }
                    m176a(298, false);
                    m176a(294, false);
                    m176a(290, false);
                    m176a(286, false);
                    m176a(186, false);
                    m176a(192, false);
                    m176a(206, false);
                    m176a(202, false);
                    m176a(198, false);
                    this.f545s = new C0011f(this);
                    this.f546t = new C0011f(this);
                    this.f547u = new C0011f(this);
                    this.f545s.m62a();
                    this.f546t.m62a();
                    this.f547u.m62a();
                    this.f545s.m64a(460, 325);
                    this.f546t.m64a(460, 325);
                    this.f547u.m64a(460, 325);
                    this.f545s.m63a(16777215);
                    this.f546t.m63a(16777215);
                    this.f547u.m63a(16777215);
                    this.f548v = this.f546t;
                    this.f549w = this.f547u;
                    this.f550x = this.f546t;
                    this.f445bz.f552z.m72a();
                    C0022q c0022q = this.f445bz.f317A;
                    c0022q.f686z = -1;
                    c0022q.f588A = false;
                    c0022q.f605R = 16777215;
                    c0022q.f606S = 8421504;
                    c0022q.f682v = false;
                    c0022q.f598K = false;
                    c0022q.f674n = (byte) 0;
                    c0022q.f668h = -1;
                    c0022q.f669i = -1;
                    c0022q.f662b = false;
                    c0022q.f667g = false;
                    c0022q.f666f = false;
                    c0022q.f663c = false;
                    c0022q.f664d = false;
                    c0022q.f665e = false;
                    c0022q.f600M = false;
                    c0022q.f629aO = new C0000a(c0022q.f614a, c0022q.f614a.f552z);
                    c0022q.m240i();
                    m159w();
                    this.f541o = 16384;
                    this.f542p = 0;
                    this.f543q = true;
                    m104D();
                    this.f440bu = System.currentTimeMillis();
                    this.f441bv = 0L;
                    this.f442bw = 1L;
                    this.f439bt = false;
                    this.f421bb = true;
                }
                this.f430bk = false;
                this.f431bl = 0;
                this.f420ba = System.currentTimeMillis();
                this.f505dF = true;
            } catch (Exception e) {
                e.printStackTrace();
                this.f531e = true;
                this.f505dF = true;
                return;
            }
        }
        if (!f314dH) {
            f314dH = true;
        }
        while (!this.f422bc) {
            if (this.f424be) {
                try {
                    Thread.sleep(100L);
                } catch (Exception e2) {
                }
                if (this.f425bf) {
                    this.f425bf = false;
                    m137b(false);
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception e3) {
                }
            } else {
                if (this.f531e) {
                    if (!f315dI) {
                        hideNotify();
                        m195h();
                        f311aR.notifyDestroyed();
                    }
                    this.f422bc = true;
                }
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i5 = (int) (jCurrentTimeMillis - this.f420ba);
                    this.f420ba = jCurrentTimeMillis;
                    int i6 = i5 > 100 ? 100 : i5;
                    int i7 = i6 == 0 ? 0 : 1;
                    if (!this.f430bk && !this.f531e) {
                        for (int i8 = 0; i8 < i7; i8++) {
                            m117N(i6);
                        }
                    }
                } catch (Error e4) {
                    e4.printStackTrace();
                    this.f531e = true;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    this.f531e = true;
                }
                this.f431bl++;
                if (this.f531e) {
                    if (!f315dI) {
                        hideNotify();
                        m195h();
                        f311aR.notifyDestroyed();
                    }
                    this.f422bc = true;
                }
                m27j();
                try {
                    if (this.f442bw < 16) {
                        Thread.sleep(16 - this.f442bw);
                    }
                } catch (Exception e6) {
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e7) {
                }
            }
            if (this.f423bd) {
                this.f423bd = false;
                this.f424be = false;
                this.f420ba = System.currentTimeMillis();
                m137b(true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    final void m208s(int i) {
        short s = (short) (this.f445bz.f343a[i + 1] & 65535);
        short s2 = (short) (this.f445bz.f343a[s] >> 16);
        for (int i2 = 0; i2 < s2; i2++) {
            m204o((short) (this.f445bz.f343a[m166a(s, i2) + 1] & 65535));
            m136b(-1, (int[]) null);
        }
    }

    public final synchronized void showNotify() {
        if (!AbstractC0004ad.f54aT) {
            this.f423bd = true;
        }
    }

    protected final void sizeChanged(int i, int i2) {
        this.f446c = getWidth();
        this.f499d = getHeight();
    }

    /* JADX INFO: renamed from: t */
    final void m209t(int i) {
        this.f533g = i;
        if (i > 0) {
            this.f532f = true;
        } else {
            this.f532f = false;
        }
    }

    /* JADX INFO: renamed from: u */
    final void m210u(int i) {
        if (i <= 0) {
            this.f445bz.f360aQ = "";
            StringBuffer stringBuffer = new StringBuffer();
            RunnableC0017l runnableC0017l = this.f445bz;
            runnableC0017l.f360aQ = stringBuffer.append(runnableC0017l.f360aQ).append("--:--.--").toString();
            return;
        }
        int i2 = (i / 10) % 100;
        int i3 = (i / 1000) % 60;
        int i4 = i / 60000;
        if (i4 < 10) {
            this.f445bz.f360aQ = "0";
            StringBuffer stringBuffer2 = new StringBuffer();
            RunnableC0017l runnableC0017l2 = this.f445bz;
            runnableC0017l2.f360aQ = stringBuffer2.append(runnableC0017l2.f360aQ).append(i4).toString();
        } else {
            this.f445bz.f360aQ = new StringBuffer().append("").append(i4).toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        RunnableC0017l runnableC0017l3 = this.f445bz;
        runnableC0017l3.f360aQ = stringBuffer3.append(runnableC0017l3.f360aQ).append(":").toString();
        if (i3 < 10) {
            StringBuffer stringBuffer4 = new StringBuffer();
            RunnableC0017l runnableC0017l4 = this.f445bz;
            runnableC0017l4.f360aQ = stringBuffer4.append(runnableC0017l4.f360aQ).append(0).toString();
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        RunnableC0017l runnableC0017l5 = this.f445bz;
        runnableC0017l5.f360aQ = stringBuffer5.append(runnableC0017l5.f360aQ).append(i3).toString();
        StringBuffer stringBuffer6 = new StringBuffer();
        RunnableC0017l runnableC0017l6 = this.f445bz;
        runnableC0017l6.f360aQ = stringBuffer6.append(runnableC0017l6.f360aQ).append(".").toString();
        if (i2 < 10) {
            StringBuffer stringBuffer7 = new StringBuffer();
            RunnableC0017l runnableC0017l7 = this.f445bz;
            runnableC0017l7.f360aQ = stringBuffer7.append(runnableC0017l7.f360aQ).append(0).toString();
        }
        StringBuffer stringBuffer8 = new StringBuffer();
        RunnableC0017l runnableC0017l8 = this.f445bz;
        runnableC0017l8.f360aQ = stringBuffer8.append(runnableC0017l8.f360aQ).append(i2).toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0315 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:106:0x032b A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0353  */
    /* JADX WARN: Code duplicated, block: B:119:0x0356 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0383 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:128:0x038b A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:129:0x039b A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:130:0x03a2 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:131:0x03af A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:166:0x043d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01db  */
    /* JADX WARN: Code duplicated, block: B:67:0x0233 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0242 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0269 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:78:0x028a A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:81:0x02a8 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:85:0x02c9 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:87:0x02cf A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02d7 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02db A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02e5 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02f5 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02f9 A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:60:0x01dc, B:63:0x01fa, B:65:0x022e, B:70:0x0249, B:72:0x0269, B:74:0x027b, B:78:0x028a, B:79:0x0294, B:81:0x02a8, B:82:0x02ba, B:110:0x0335, B:114:0x0344, B:83:0x02c1, B:85:0x02c9, B:87:0x02cf, B:90:0x02d7, B:92:0x02db, B:94:0x02e5, B:126:0x0383, B:128:0x038b, B:129:0x039b, B:95:0x02ef, B:97:0x02f5, B:99:0x02f9, B:101:0x0315, B:102:0x031a, B:103:0x0321, B:130:0x03a2, B:131:0x03af, B:133:0x03b5, B:135:0x03ba, B:119:0x0356, B:121:0x035a, B:123:0x0368, B:104:0x0326, B:106:0x032b, B:67:0x0233, B:69:0x0242), top: B:168:0x01dc }] */
    /* JADX INFO: renamed from: v */
    final void m211v(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        int i10;
        int i11;
        boolean z2 = true;
        this.f472cZ = true;
        int i12 = this.f319C;
        this.f319C = (byte) i;
        if (i != 3) {
            m182c();
            System.gc();
        }
        if (i == 1) {
            try {
                this.f326J = 0;
                this.f395bB = 0;
                m192f();
                this.f334R = 0;
                this.f333Q = 0;
                this.f335S = 0;
                this.f322F = 0;
                if (this.f369ac.f728h > 0) {
                    this.f445bz.f322F = 4000;
                }
                if (this.f445bz.f369ac.f725e == 2) {
                    this.f371ae[0].f218d = false;
                } else {
                    this.f371ae[0].f218d = true;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    this.f371ae[i13].f222h = false;
                }
                if (this.f445bz.f369ac.f725e == 2) {
                    this.f371ae[0].f237w = this.f337U[0] << 4;
                    this.f371ae[0].f238x = this.f337U[1] << 4;
                    this.f371ae[1].f237w = this.f336T[0] << 4;
                    this.f371ae[1].f238x = this.f336T[1] << 4;
                    this.f371ae[2].f237w = this.f484cl[0] << 4;
                    this.f371ae[2].f238x = this.f484cl[1] << 4;
                    this.f371ae[3].f237w = this.f485cm[0] << 4;
                    this.f371ae[3].f238x = this.f485cm[1] << 4;
                    for (int i14 = 0; i14 < 4; i14++) {
                        if (this.f371ae[i14].f161b.f294g != null) {
                            C0003ac c0003ac = this.f371ae[i14].f161b.f293f.f14j[this.f371ae[i14].f161b.f294g.f583e];
                            this.f371ae[i14].f141ag = c0003ac.f46b * 117;
                            this.f371ae[i14].f142ah = ((c0003ac.f47c * 100) / 100) << 1;
                        }
                    }
                    int i15 = this.f371ae[0].f141ag;
                    int i16 = i15 / 5;
                    this.f454cH[0] = i15 - (i16 * 5);
                    this.f454cH[1] = i15 - (i16 << 2);
                    this.f454cH[2] = i15 - (i16 * 3);
                    this.f454cH[3] = i15 - (i16 << 1);
                    this.f454cH[4] = i15 - i16;
                    this.f454cH[5] = i15;
                }
                m105D(16);
            } catch (Exception e) {
            }
        } else if (i == 2) {
            try {
                m182c();
                this.f397bD = -2;
                this.f326J = 0;
                this.f398bE = false;
                this.f399bF = 0;
                this.f406bM = false;
                this.f507db = Math.abs(this.f513di.nextInt()) % 3;
                this.f445bz.m176a(180, false);
            } catch (Exception e2) {
            }
        } else if (i == 3) {
            try {
                this.f326J = 0;
                this.f542p = 0;
                this.f406bM = false;
                this.f407bN = 0;
                m201l(306);
                m196h(306);
                try {
                    m193g(303);
                } catch (Exception e3) {
                }
                m146k();
                m141g(306, 0);
                m196h(306);
                if (i12 != 3) {
                    this.f508dc = 0;
                    this.f509dd = 0;
                    this.f445bz.f317A.f674n = (byte) 0;
                }
            } catch (Exception e4) {
            }
        } else if (i == 4 || i == 5) {
            try {
                this.f405bL = false;
                this.f445bz.f369ac.f729i = true;
                this.f542p = 0;
                this.f326J = 0;
                m201l(306);
                m196h(306);
                try {
                    m193g(303);
                } catch (Exception e5) {
                }
                m146k();
                m176a(180, false);
                this.f371ae[0].f225k = 0;
                this.f371ae[0].f226l = 0;
                m210u(this.f322F - 4000);
                i2 = this.f369ac.f721a;
                i3 = this.f369ac.f722b;
                this.f445bz.f369ac.f730j = false;
                if (this.f319C != 5 || this.f319C == 6) {
                    this.f370ad = this.f445bz.f369ac.f727g + 1;
                    if (this.f319C == 5) {
                        this.f445bz.f369ac.f730j = true;
                    }
                }
                this.f371ae[0].f94M += (this.f371ae[0].f95N * 6553) >> 16;
                if (this.f371ae[0].f139ae > 0) {
                    i7 = this.f445bz.f322F - 4000;
                    i8 = this.f445bz.f368ab.f42j[i2][i3];
                    if (i8 <= 0 && (i10 = i7 / 60000) >= (i9 = i8 / 60000)) {
                        if (i10 > i9) {
                            z = false;
                        } else {
                            int i17 = (i8 / 1000) % 60;
                            int i18 = (i7 / 1000) % 60;
                            if (i18 < i17) {
                                z = true;
                            } else if (i18 > i17 || ((i7 / 10) % 100 >= (i11 = (i8 / 10) % 100) && i11 != 0)) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        this.f445bz.f368ab.f42j[i2][i3] = i7;
                    }
                    if (this.f445bz.f368ab.f41i[i2][i3] < ((int) this.f371ae[0].f94M)) {
                        this.f445bz.f368ab.f41i[i2][i3] = (int) this.f371ae[0].f94M;
                    }
                    this.f445bz.f368ab.m22b();
                }
                if (!this.f445bz.f369ac.f731k) {
                    z2 = this.f369ac.f728h > 0 ? false : false;
                    if (z2) {
                        i5 = i3 + 1;
                        if (i5 >= 4) {
                            i6 = i2 + 1;
                            this.f317A.f662b = true;
                            i5 = 0;
                        } else {
                            i6 = i2;
                        }
                        if (i6 >= 4) {
                            this.f317A.f662b = false;
                            this.f317A.f667g = true;
                        } else if (this.f368ab.m20a(i6, i5)) {
                            this.f368ab.f43k[i6][i5] = 1;
                            this.f369ac.f717C = true;
                        } else {
                            this.f317A.f662b = false;
                        }
                    }
                    if (this.f369ac.f746z) {
                        if (this.f493cu) {
                            i4 = this.f317A.f629aO.f23s[i2][i3].f76g[this.f369ac.f715A - 1];
                            if (!this.f368ab.m19a(i4)) {
                                this.f369ac.f718D = true;
                            }
                            this.f368ab.f44l[i4] = 1;
                        } else {
                            this.f368ab.f44l[this.f369ac.f716B] = 0;
                        }
                    } else if (this.f369ac.f728h > 0 && this.f319C == 5) {
                        this.f368ab.f44l[this.f369ac.f716B] = 0;
                    }
                    this.f368ab.m22b();
                }
                if (this.f319C == 6) {
                    this.f542p = 0;
                }
            } catch (Exception e6) {
            }
        } else {
            try {
                if (this.f319C == 6) {
                    this.f405bL = false;
                    this.f445bz.f369ac.f729i = true;
                    this.f542p = 0;
                    this.f326J = 0;
                    m201l(306);
                    m196h(306);
                    m193g(303);
                    m146k();
                    m176a(180, false);
                    this.f371ae[0].f225k = 0;
                    this.f371ae[0].f226l = 0;
                    m210u(this.f322F - 4000);
                    i2 = this.f369ac.f721a;
                    i3 = this.f369ac.f722b;
                    this.f445bz.f369ac.f730j = false;
                    if (this.f319C != 5) {
                        this.f370ad = this.f445bz.f369ac.f727g + 1;
                        if (this.f319C == 5) {
                            this.f445bz.f369ac.f730j = true;
                        }
                    } else {
                        this.f370ad = this.f445bz.f369ac.f727g + 1;
                        if (this.f319C == 5) {
                            this.f445bz.f369ac.f730j = true;
                        }
                    }
                    this.f371ae[0].f94M += (this.f371ae[0].f95N * 6553) >> 16;
                    if (this.f371ae[0].f139ae > 0) {
                        i7 = this.f445bz.f322F - 4000;
                        i8 = this.f445bz.f368ab.f42j[i2][i3];
                        z = i8 <= 0 ? true : true;
                        if (z) {
                            this.f445bz.f368ab.f42j[i2][i3] = i7;
                        }
                        if (this.f445bz.f368ab.f41i[i2][i3] < ((int) this.f371ae[0].f94M)) {
                            this.f445bz.f368ab.f41i[i2][i3] = (int) this.f371ae[0].f94M;
                        }
                        this.f445bz.f368ab.m22b();
                    }
                    if (!this.f445bz.f369ac.f731k) {
                        if (this.f369ac.f728h > 0) {
                        }
                        if (z2) {
                            i5 = i3 + 1;
                            if (i5 >= 4) {
                                i6 = i2 + 1;
                                this.f317A.f662b = true;
                                i5 = 0;
                            } else {
                                i6 = i2;
                            }
                            if (i6 >= 4) {
                                this.f317A.f662b = false;
                                this.f317A.f667g = true;
                            } else if (this.f368ab.m20a(i6, i5)) {
                                this.f368ab.f43k[i6][i5] = 1;
                                this.f369ac.f717C = true;
                            } else {
                                this.f317A.f662b = false;
                            }
                        }
                        if (this.f369ac.f746z) {
                            if (this.f493cu) {
                                i4 = this.f317A.f629aO.f23s[i2][i3].f76g[this.f369ac.f715A - 1];
                                if (!this.f368ab.m19a(i4)) {
                                    this.f369ac.f718D = true;
                                }
                                this.f368ab.f44l[i4] = 1;
                            } else {
                                this.f368ab.f44l[this.f369ac.f716B] = 0;
                            }
                        } else if (this.f369ac.f728h > 0) {
                            this.f368ab.f44l[this.f369ac.f716B] = 0;
                        }
                        this.f368ab.m22b();
                    }
                    if (this.f319C == 6) {
                        this.f542p = 0;
                    }
                } else if (i == 7) {
                    try {
                        this.f515dk = (short) 0;
                        this.f445bz.f332P = 0;
                        this.f445bz.f371ae[0].f226l = 0;
                        this.f445bz.f334R = 0;
                        this.f445bz.f333Q = 0;
                        this.f445bz.f335S = 0;
                        for (int i19 = 0; i19 < 10; i19++) {
                            this.f445bz.f404bK[i19] = this.f373ag[i19].f224j;
                            this.f373ag[i19].f224j = true;
                        }
                        if (this.f445bz.m156u() == -1) {
                            this.f445bz.m157v();
                        }
                        this.f542p = 0;
                        this.f317A.f629aO.m6a(true);
                    } catch (Exception e7) {
                    }
                } else if (i == 8) {
                    try {
                        m211v(1);
                    } catch (Exception e8) {
                    }
                }
            } catch (Exception e9) {
            }
        }
        if (i != 3 && this.f398bE) {
            try {
                this.f398bE = false;
                m161y();
            } catch (Exception e10) {
            }
        }
        this.f472cZ = false;
    }

    /* JADX INFO: renamed from: x */
    final void m212x(int i) {
        if ((this.f541o & 6144) != 6144) {
            m106E();
        }
        System.gc();
        this.f541o = i;
        m104D();
    }

    /* JADX INFO: renamed from: y */
    final int m213y(int i) {
        try {
            m202m(i);
            short s = (short) (this.f445bz.f343a[(short) (this.f445bz.f343a[i + 1] & 65535)] >> 16);
            this.f396bC = this.f445bz.f343a[i];
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: z */
    final void m214z(int i) {
        m203n(i);
    }
}
