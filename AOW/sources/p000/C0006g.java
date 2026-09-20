package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.wireless.messaging.TextMessage;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class C0006g {

    /* JADX INFO: renamed from: C */
    private byte[][] f331C;

    /* JADX INFO: renamed from: D */
    private boolean f332D;

    /* JADX INFO: renamed from: D */
    private byte[][] f333D;

    /* JADX INFO: renamed from: E */
    private byte[][] f335E;

    /* JADX INFO: renamed from: F */
    private byte[][] f337F;

    /* JADX INFO: renamed from: G */
    private byte[][] f339G;

    /* JADX INFO: renamed from: H */
    private byte[][] f341H;

    /* JADX INFO: renamed from: I */
    private byte[][] f343I;

    /* JADX INFO: renamed from: N */
    private boolean f348N;

    /* JADX INFO: renamed from: O */
    boolean f349O;

    /* JADX INFO: renamed from: R */
    private boolean f352R;

    /* JADX INFO: renamed from: a */
    private DataInputStream f354a;

    /* JADX INFO: renamed from: a */
    private DataOutputStream f355a;

    /* JADX INFO: renamed from: a */
    private Image f356a;

    /* JADX INFO: renamed from: a */
    private RecordStore f357a;

    /* JADX INFO: renamed from: a */
    TextMessage f358a;

    /* JADX INFO: renamed from: aB */
    byte[] f365aB;

    /* JADX INFO: renamed from: aC */
    private byte[] f368aC;

    /* JADX INFO: renamed from: aD */
    private byte[] f371aD;

    /* JADX INFO: renamed from: aE */
    private int f373aE;

    /* JADX INFO: renamed from: aF */
    private int f375aF;

    /* JADX INFO: renamed from: aG */
    int f377aG;

    /* JADX INFO: renamed from: aH */
    private byte f378aH;

    /* JADX INFO: renamed from: aI */
    private byte f380aI;

    /* JADX INFO: renamed from: aQ */
    private int f395aQ;

    /* JADX INFO: renamed from: aR */
    private int f396aR;

    /* JADX INFO: renamed from: aS */
    private int f397aS;

    /* JADX INFO: renamed from: aV */
    int f400aV;

    /* JADX INFO: renamed from: aW */
    int f401aW;

    /* JADX INFO: renamed from: aq */
    private byte[] f424aq;

    /* JADX INFO: renamed from: as */
    private byte f427as;

    /* JADX INFO: renamed from: au */
    private byte[] f434au;

    /* JADX INFO: renamed from: av */
    private byte[] f437av;

    /* JADX INFO: renamed from: aw */
    private byte[] f440aw;

    /* JADX INFO: renamed from: b */
    RunnableC0000a f450b;

    /* JADX INFO: renamed from: b */
    RunnableC0003d f451b;

    /* JADX INFO: renamed from: b */
    C0005f f452b;

    /* JADX INFO: renamed from: b */
    C0009j f453b;

    /* JADX INFO: renamed from: b */
    Graphics[] f455b;

    /* JADX INFO: renamed from: bM */
    private int f469bM;

    /* JADX INFO: renamed from: bN */
    private int f470bN;

    /* JADX INFO: renamed from: bW */
    private int f479bW;

    /* JADX INFO: renamed from: bz */
    int f508bz;

    /* JADX INFO: renamed from: cf */
    private int f515cf;

    /* JADX INFO: renamed from: cg */
    private int f516cg;

    /* JADX INFO: renamed from: ch */
    int f517ch;

    /* JADX INFO: renamed from: ci */
    private int f518ci;

    /* JADX INFO: renamed from: d */
    RunnableC0002c f519d;

    /* JADX INFO: renamed from: d */
    String[] f521d;

    /* JADX INFO: renamed from: e */
    String f522e;

    /* JADX INFO: renamed from: f */
    private String f525f;

    /* JADX INFO: renamed from: k */
    private String f539k;

    /* JADX INFO: renamed from: l */
    private short[][] f542l;

    /* JADX INFO: renamed from: m */
    private short[] f543m;

    /* JADX INFO: renamed from: n */
    private short[] f544n;

    /* JADX INFO: renamed from: p */
    short[] f546p;

    /* JADX INFO: renamed from: q */
    private short[] f547q;

    /* JADX INFO: renamed from: r */
    private short[] f548r;

    /* JADX INFO: renamed from: l */
    private short[] f541l = new short[100];

    /* JADX INFO: renamed from: e */
    private String[] f524e = new String[100];

    /* JADX INFO: renamed from: ah */
    private byte f406ah = 0;

    /* JADX INFO: renamed from: ai */
    private byte[] f408ai = {0, 2, 3, 4, 1};

    /* JADX INFO: renamed from: aj */
    byte[] f410aj = new byte[16];

    /* JADX INFO: renamed from: ak */
    byte[] f412ak = new byte[6];

    /* JADX INFO: renamed from: al */
    byte[] f414al = new byte[5];

    /* JADX INFO: renamed from: h */
    private long f531h = Long.MAX_VALUE;

    /* JADX INFO: renamed from: am */
    byte[] f416am = new byte[14];

    /* JADX INFO: renamed from: an */
    byte[] f418an = new byte[20];

    /* JADX INFO: renamed from: ao */
    byte[] f420ao = new byte[2];

    /* JADX INFO: renamed from: ap */
    byte[] f422ap = new byte[2];

    /* JADX INFO: renamed from: as */
    private byte[] f428as = new byte[12];

    /* JADX INFO: renamed from: at */
    private byte[] f431at = new byte[15];

    /* JADX INFO: renamed from: ax */
    byte[] f443ax = new byte[30];

    /* JADX INFO: renamed from: o */
    short[] f545o = new short[50];

    /* JADX INFO: renamed from: ay */
    private byte[] f446ay = new byte[50];

    /* JADX INFO: renamed from: b */
    private String[][] f456b = (String[][]) Array.newInstance((Class<?>) String.class, 3, 50);

    /* JADX INFO: renamed from: k */
    private short[][] f540k = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 2, 7);

    /* JADX INFO: renamed from: az */
    private byte[] f449az = {115, 109, 115, 58, 47, 47};

    /* JADX INFO: renamed from: f */
    private String[] f527f = {"lic1", "lic2", "lic3", "cashz", "cash", "score"};

    /* JADX INFO: renamed from: aA */
    private byte[] f362aA = {56, 117, 23, 98, 41, 111, 60, 86};

    /* JADX INFO: renamed from: cc */
    private int f512cc = 4104;

    /* JADX INFO: renamed from: cd */
    private int f513cd = 66;

    /* JADX INFO: renamed from: Q */
    private boolean f351Q = false;

    /* JADX INFO: renamed from: ce */
    private int f514ce = -1000;

    /* JADX INFO: renamed from: aO */
    private byte f392aO = 0;

    /* JADX INFO: renamed from: S */
    private boolean f353S = true;

    /* JADX INFO: renamed from: g */
    private long f528g = 0;

    /* JADX INFO: renamed from: A */
    private boolean f328A = false;

    /* JADX INFO: renamed from: at */
    int f430at = 0;

    /* JADX INFO: renamed from: au */
    private int f433au = 0;

    /* JADX INFO: renamed from: av */
    private int f436av = 0;

    /* JADX INFO: renamed from: aw */
    private int f439aw = 0;

    /* JADX INFO: renamed from: ax */
    private int f442ax = 0;

    /* JADX INFO: renamed from: ay */
    private int f445ay = 0;

    /* JADX INFO: renamed from: az */
    int f448az = 0;

    /* JADX INFO: renamed from: aA */
    private int f361aA = 0;

    /* JADX INFO: renamed from: aB */
    private int f364aB = 0;

    /* JADX INFO: renamed from: aC */
    int f367aC = 0;

    /* JADX INFO: renamed from: aD */
    int f370aD = 0;

    /* JADX INFO: renamed from: B */
    private boolean f329B = false;

    /* JADX INFO: renamed from: C */
    private boolean f330C = false;

    /* JADX INFO: renamed from: aH */
    int f379aH = 0;

    /* JADX INFO: renamed from: aI */
    int f381aI = 0;

    /* JADX INFO: renamed from: aJ */
    private int f383aJ = 0;

    /* JADX INFO: renamed from: aK */
    int f385aK = 0;

    /* JADX INFO: renamed from: aL */
    int f387aL = 0;

    /* JADX INFO: renamed from: E */
    private boolean f334E = true;

    /* JADX INFO: renamed from: F */
    boolean f336F = false;

    /* JADX INFO: renamed from: aM */
    private int f389aM = 0;

    /* JADX INFO: renamed from: ag */
    byte f405ag = 3;

    /* JADX INFO: renamed from: aN */
    int f391aN = 0;

    /* JADX INFO: renamed from: aO */
    private int f393aO = 0;

    /* JADX INFO: renamed from: aP */
    int f394aP = 0;

    /* JADX INFO: renamed from: ai */
    byte f407ai = 4;

    /* JADX INFO: renamed from: aj */
    byte f409aj = 0;

    /* JADX INFO: renamed from: ak */
    byte f411ak = 0;

    /* JADX INFO: renamed from: al */
    private byte f413al = 0;

    /* JADX INFO: renamed from: am */
    private byte f415am = 0;

    /* JADX INFO: renamed from: an */
    private byte f417an = 0;

    /* JADX INFO: renamed from: a */
    short f359a = 0;

    /* JADX INFO: renamed from: b */
    private short f454b = 0;

    /* JADX INFO: renamed from: c */
    private short f509c = 0;

    /* JADX INFO: renamed from: d */
    private short f520d = 0;

    /* JADX INFO: renamed from: aT */
    private int f398aT = 0;

    /* JADX INFO: renamed from: aU */
    private int f399aU = 0;

    /* JADX INFO: renamed from: ao */
    private byte f419ao = 0;

    /* JADX INFO: renamed from: ap */
    private byte f421ap = 0;

    /* JADX INFO: renamed from: aq */
    private byte f423aq = 0;

    /* JADX INFO: renamed from: ar */
    byte f425ar = 0;

    /* JADX INFO: renamed from: G */
    private boolean f338G = false;

    /* JADX INFO: renamed from: e */
    private short f523e = 0;

    /* JADX INFO: renamed from: at */
    byte f429at = 0;

    /* JADX INFO: renamed from: f */
    short f526f = 0;

    /* JADX INFO: renamed from: g */
    short f530g = 0;

    /* JADX INFO: renamed from: au */
    byte f432au = 0;

    /* JADX INFO: renamed from: H */
    boolean f340H = false;

    /* JADX INFO: renamed from: h */
    short f533h = -1;

    /* JADX INFO: renamed from: aX */
    private int f402aX = 0;

    /* JADX INFO: renamed from: aY */
    private int f403aY = 0;

    /* JADX INFO: renamed from: aZ */
    private int f404aZ = 0;

    /* JADX INFO: renamed from: ba */
    private int f483ba = 0;

    /* JADX INFO: renamed from: i */
    private short f536i = 0;

    /* JADX INFO: renamed from: bb */
    private int f484bb = 0;

    /* JADX INFO: renamed from: bc */
    int f485bc = 0;

    /* JADX INFO: renamed from: bd */
    int f486bd = 0;

    /* JADX INFO: renamed from: be */
    private int f487be = 0;

    /* JADX INFO: renamed from: bf */
    private int f488bf = 0;

    /* JADX INFO: renamed from: bg */
    private int f489bg = 0;

    /* JADX INFO: renamed from: bh */
    private int f490bh = 0;

    /* JADX INFO: renamed from: bi */
    private int f491bi = 0;

    /* JADX INFO: renamed from: bj */
    int f492bj = 0;

    /* JADX INFO: renamed from: bk */
    private int f493bk = -1;

    /* JADX INFO: renamed from: bl */
    int f494bl = -1;

    /* JADX INFO: renamed from: bm */
    private int f495bm = 0;

    /* JADX INFO: renamed from: bn */
    int f496bn = 0;

    /* JADX INFO: renamed from: bo */
    private int f497bo = 0;

    /* JADX INFO: renamed from: bp */
    int f498bp = 0;

    /* JADX INFO: renamed from: bq */
    private int f499bq = 0;

    /* JADX INFO: renamed from: br */
    private int f500br = 0;

    /* JADX INFO: renamed from: bs */
    int f501bs = 27;

    /* JADX INFO: renamed from: I */
    private boolean f342I = true;

    /* JADX INFO: renamed from: J */
    boolean f344J = false;

    /* JADX INFO: renamed from: bt */
    private int f502bt = 0;

    /* JADX INFO: renamed from: bu */
    private int f503bu = 0;

    /* JADX INFO: renamed from: K */
    boolean f345K = true;

    /* JADX INFO: renamed from: bv */
    private int f504bv = 0;

    /* JADX INFO: renamed from: bw */
    private int f505bw = 0;

    /* JADX INFO: renamed from: bx */
    private int f506bx = 0;

    /* JADX INFO: renamed from: by */
    private int f507by = 0;

    /* JADX INFO: renamed from: av */
    byte f435av = 0;

    /* JADX INFO: renamed from: aw */
    private byte f438aw = 0;

    /* JADX INFO: renamed from: ax */
    private byte f441ax = 0;

    /* JADX INFO: renamed from: bA */
    int f457bA = 0;

    /* JADX INFO: renamed from: ay */
    byte f444ay = 0;

    /* JADX INFO: renamed from: L */
    boolean f346L = false;

    /* JADX INFO: renamed from: az */
    private byte f447az = 0;

    /* JADX INFO: renamed from: bB */
    int f458bB = 0;

    /* JADX INFO: renamed from: bC */
    private int f459bC = 0;

    /* JADX INFO: renamed from: bD */
    private int f460bD = 0;

    /* JADX INFO: renamed from: bE */
    private int f461bE = 0;

    /* JADX INFO: renamed from: bF */
    private int f462bF = 0;

    /* JADX INFO: renamed from: bG */
    private int f463bG = 0;

    /* JADX INFO: renamed from: bH */
    private int f464bH = 0;

    /* JADX INFO: renamed from: bI */
    private int f465bI = 0;

    /* JADX INFO: renamed from: bJ */
    private int f466bJ = 0;

    /* JADX INFO: renamed from: bK */
    private int f467bK = 2;

    /* JADX INFO: renamed from: M */
    private boolean f347M = true;

    /* JADX INFO: renamed from: aA */
    byte f360aA = 0;

    /* JADX INFO: renamed from: aB */
    private byte f363aB = 0;

    /* JADX INFO: renamed from: aC */
    private byte f366aC = 0;

    /* JADX INFO: renamed from: aD */
    byte f369aD = 0;

    /* JADX INFO: renamed from: aE */
    byte f372aE = 0;

    /* JADX INFO: renamed from: aF */
    byte f374aF = 0;

    /* JADX INFO: renamed from: bL */
    private int f468bL = 0;

    /* JADX INFO: renamed from: aG */
    private byte f376aG = 0;

    /* JADX INFO: renamed from: aJ */
    byte f382aJ = -1;

    /* JADX INFO: renamed from: aK */
    private byte f384aK = 0;

    /* JADX INFO: renamed from: i */
    private long f534i = 0;

    /* JADX INFO: renamed from: bO */
    int f471bO = 0;

    /* JADX INFO: renamed from: bP */
    int f472bP = 0;

    /* JADX INFO: renamed from: bQ */
    private int f473bQ = 0;

    /* JADX INFO: renamed from: bR */
    int f474bR = 0;

    /* JADX INFO: renamed from: bS */
    private int f475bS = 0;

    /* JADX INFO: renamed from: bT */
    private int f476bT = 0;

    /* JADX INFO: renamed from: aL */
    byte f386aL = 0;

    /* JADX INFO: renamed from: aM */
    byte f388aM = 0;

    /* JADX INFO: renamed from: bU */
    int f477bU = 0;

    /* JADX INFO: renamed from: bV */
    private int f478bV = 0;

    /* JADX INFO: renamed from: P */
    private boolean f350P = true;

    /* JADX INFO: renamed from: aN */
    byte f390aN = 0;

    /* JADX INFO: renamed from: g */
    private String f529g = "";

    /* JADX INFO: renamed from: h */
    private String f532h = "";

    /* JADX INFO: renamed from: i */
    private String f535i = "";

    /* JADX INFO: renamed from: bX */
    private int f480bX = 0;

    /* JADX INFO: renamed from: bY */
    private int f481bY = 0;

    /* JADX INFO: renamed from: bZ */
    private int f482bZ = 0;

    /* JADX INFO: renamed from: ca */
    private int f510ca = 0;

    /* JADX INFO: renamed from: j */
    private long f537j = 0;

    /* JADX INFO: renamed from: cb */
    private int f511cb = 0;

    /* JADX INFO: renamed from: j */
    String f538j = "";

    /* JADX INFO: renamed from: ar */
    byte[] f426ar = new byte[22000];

    public C0006g(RunnableC0002c runnableC0002c) {
        String[] strArr = {"A", "B", "C", "Z", "+", "S"};
        this.f519d = runnableC0002c;
        this.f508bz = 0;
        this.f525f = "";
        this.f479bW = 0;
        this.f525f = "";
        this.f479bW = 0;
        this.f365aB = this.f519d.f66d;
        this.f546p = this.f519d.f44a;
        this.f547q = this.f519d.f54b;
        this.f548r = this.f519d.f61c;
        this.f455b = this.f519d.f42a;
        this.f371aD = this.f519d.f77f;
        this.f335E = this.f519d.f55b;
        this.f339G = this.f519d.f72e;
        this.f341H = this.f519d.f78f;
        this.f337F = this.f519d.f83g;
        this.f343I = this.f519d.f45a;
        this.f542l = this.f519d.f56b;
        this.f331C = this.f519d.f62c;
        this.f368aC = this.f519d.f71e;
        this.f333D = this.f519d.f67d;
        for (int i = 0; i < this.f410aj.length; i++) {
            this.f410aj[i] = -1;
        }
        this.f508bz = 20;
        this.f440aw = new byte[]{0, 2, 5, 13, 21, 29, 37, 45, 54, 62, 71};
        this.f437av = new byte[]{48, 32, 49, 46, 44, -32, -31, -30, -29, 50, 97, 98, 99, -28, -27, -26, -25, 51, 100, 101, 102, -24, -23, -22, -21, 52, 103, 104, 105, -20, -19, -18, -17, 53, 106, 107, 108, -16, -15, -14, -13, 54, 109, 110, 111, -12, -11, -10, -9, 55, 112, 113, 114, 115, -8, -7, -6, -5, 56, 116, 117, 118, -4, -3, -2, -1, 57, 119, 120, 121, 122};
    }

    /* JADX INFO: renamed from: a */
    private byte m111a() {
        byte[] bArr = this.f424aq;
        int i = this.f468bL;
        this.f468bL = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: a */
    private static int m112a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            try {
                i *= 10;
                char cCharAt = str.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i += cCharAt - '0';
            } catch (Exception e) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private long m113a() {
        long jM111a = 0;
        for (int i = 0; i < 8; i++) {
            jM111a |= ((long) (m111a() & 255)) << (56 - (i << 3));
        }
        return jM111a;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x027f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0294  */
    /* JADX WARN: Code duplicated, block: B:89:0x0297  */
    /* JADX INFO: renamed from: a */
    private void m114a(int i, int i2, int i3, int i4, int i5) {
        short s;
        switch (i) {
            case 0:
                if (i2 == 0) {
                    if (this.f410aj[4] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[4], -1);
                    }
                } else if (i2 != 1) {
                    this.f453b.m231a(i4, i5, 0, new StringBuffer().append((int) this.f519d.f63c[this.f519d.f109n][0]).toString(), -1);
                } else if (this.f410aj[6] >= 0) {
                    m221o(i3, i4, i5, this.f410aj[6], -1);
                }
                break;
            case 1:
                if (i2 == 0) {
                    if (this.f519d.f63c[this.f519d.f109n][2] > this.f519d.f63c[this.f519d.f109n][3]) {
                        m217e(i3, i4, i5);
                    }
                } else if (i2 != 1) {
                    this.f453b.m231a(i4, i5, 0, new StringBuffer().append((int) this.f519d.f63c[this.f519d.f109n][2]).append("/").append((int) this.f519d.f63c[this.f519d.f109n][3]).toString(), -1);
                } else if (this.f410aj[8] >= 0) {
                    m221o(i3, i4, i5, this.f410aj[8], -1);
                }
                break;
            case 2:
                if (i2 == 0) {
                    if (this.f410aj[5] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[5], -1);
                    }
                } else if (i2 != 1) {
                    this.f453b.m231a(i4, i5, 0, new StringBuffer().append((int) this.f519d.f63c[this.f519d.f109n][4]).toString(), (this.f410aj[5] < 0 || this.f410aj[5] > 1) ? -1 : 0);
                } else if (this.f410aj[7] >= 0) {
                    m221o(i3, i4, i5, this.f410aj[7], -1);
                }
                break;
            case 3:
                if (i2 == 0) {
                    this.f475bS = i4;
                    this.f476bT = i5;
                } else if (i2 != 2) {
                    int i6 = (this.f452b.f323z + 4) - this.f475bS;
                    int i7 = (this.f452b.f147A + (this.f452b.f191O / 2)) - this.f476bT;
                    if (this.f519d.f81g) {
                        m165c(this.f455b[this.f429at], 15 - this.f519d.f80g, (this.f458bB + 10) - this.f519d.f84h, i4, i5);
                    } else {
                        m165c(this.f455b[this.f429at], 15, this.f458bB + 10, i4, i5);
                    }
                    for (int i8 = 0; i8 < (this.f476bT << 1); i8++) {
                        if (i7 + i8 >= 0 && i7 + i8 < this.f452b.f318y) {
                            for (int i9 = 0; i9 < (this.f475bS << 1); i9++) {
                                if (i6 + i9 >= 0 && i6 + i9 < this.f452b.f314x && (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][0][(i6 + i9) >> 5][i7 + i8] >> ((i6 + i9) & 31)) & 1) != 0)) {
                                    if (this.f519d.f88i == 2) {
                                        int[] iArr = null;
                                        if (((iArr[i7 + i8] >> ((i6 + i9) & 31)) & 1) != 0) {
                                            s = this.f542l[i7 + i8][i6 + i9];
                                            if (s > 0 || s > 100) {
                                                if ((-s) <= 0 && (-s) <= 100 && ((this.f371aD[6060 - s] >> 1) & 1) != 0 && this.f371aD[5252 - s] == i6 + i9 && this.f371aD[5353 - s] == i7 + i8) {
                                                    m217e(((((-s) - 1) / 50) << 2) + 2024, i9 - 90, i8 - 60);
                                                }
                                            } else if (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][1][(i6 + i9) >> 5][i7 + i8] >> ((i6 + i9) & 31)) & 1) != 0) {
                                                m217e(this.f365aB[this.f546p[57] + this.f371aD[s + 2323]] + 2024 + (((s - 1) / 50) << 2), i9 - 90, i8 - 60);
                                                if (this.f371aD[s + 5151] >= 0 && this.f371aD[s + 5151] <= this.f519d.f79f[6][284] - this.f519d.f79f[5][284]) {
                                                    m221o(284, i9, i8, this.f371aD[s + 5151], -1);
                                                }
                                            }
                                        }
                                    } else {
                                        s = this.f542l[i7 + i8][i6 + i9];
                                        if (s > 0) {
                                            if ((-s) <= 0) {
                                            }
                                        } else if ((-s) <= 0) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    m165c(this.f455b[this.f429at], 0, 0, 500, 500);
                } else if (this.f410aj[9] >= 0) {
                    m221o(i3, i4, i5, this.f410aj[9], -1);
                }
                break;
            case 4:
                m217e(i3, i4, i5);
                break;
            case 5:
                m217e((this.f519d.f99k ? 0 : 1) + i3, i4, i5);
                break;
            case 6:
                if (this.f448az == 3 || this.f448az == 4 || (this.f448az == 5 && this.f519d.f98k < 2000 && this.f452b.f229aa <= 0)) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else {
                        int i10 = this.f448az == 3 ? 200 : this.f448az == 4 ? 18000 : 2000;
                        int iM57a = (C0005f.m57a(this.f448az == 3 ? this.f452b.f165F : this.f519d.f98k, 0, i10) * 41) / i10;
                        int i11 = 0;
                        while (i11 < iM57a / (this.f519d.f92i[3][1404] & 255)) {
                            this.f404aZ = this.f519d.f92i[3][1404] & 255;
                            m178f(i3, (this.f404aZ * i11) + i4, i5);
                            i11++;
                        }
                        this.f404aZ = iM57a % (this.f519d.f92i[3][1404] & 255);
                        m178f(i3, (i11 * (this.f519d.f92i[3][1404] & 255)) + i4, i5);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m115a(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.fillRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    private void m116a(short s) {
        this.f523e = s;
        this.f419ao = this.f413al;
        this.f421ap = this.f415am;
        this.f423aq = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    private void m117a(boolean[] zArr, byte[] bArr, short[] sArr, int[] iArr, int i, int i2, int i3, int i4) {
        try {
            this.f480bX = i2;
            while (this.f480bX < i2 + i3) {
                this.f537j <<= i;
                this.f482bZ += i;
                if (zArr != null) {
                    if (zArr[this.f480bX]) {
                        this.f537j++;
                    }
                } else if (bArr != null) {
                    this.f537j += (long) (bArr[this.f480bX] + i4);
                } else if (sArr != null) {
                    this.f537j += (long) (sArr[this.f480bX] + i4);
                } else if (iArr != null) {
                    this.f537j += (long) (iArr[this.f480bX] + i4);
                }
                if (this.f482bZ >= 32 || this.f480bX == (i2 + i3) - 1) {
                    while (this.f482bZ >= 8) {
                        m198p((int) (this.f537j >> (this.f482bZ - 8)));
                        this.f482bZ -= 8;
                    }
                }
                this.f480bX++;
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m118a(Graphics graphics, Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            graphics.drawRegion(image, i, i2, i3, i4, 0, i5, i6, i7);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:94:0x03c3  */
    /* JADX INFO: renamed from: aA */
    private void m119aA() {
        int i;
        int i2;
        if (this.f523e >= 0) {
            m221o(this.f523e, (this.f419ao - this.f452b.f323z) * 30, (this.f421ap - this.f452b.f147A) * 20, this.f423aq, -1);
        }
        if (this.f519d.f81g) {
            if (this.f425ar >= 0) {
                byte b = this.f425ar >= 121 ? (byte) 1 : this.f519d.f92i[18][this.f425ar];
                byte b2 = this.f425ar >= 121 ? (byte) 1 : this.f519d.f92i[19][this.f425ar];
                for (int i3 = this.f411ak; i3 < this.f411ak + b2; i3++) {
                    for (int i4 = this.f409aj; i4 < this.f409aj + b; i4++) {
                        if (this.f542l[i3][i4] == 0 && this.f338G && (this.f519d.f88i >= 2 || (((this.f519d.f49a[this.f519d.f109n][0][i4 >> 5][i3] >> (i4 & 31)) & 1) != 0 && ((this.f519d.f49a[this.f519d.f109n][1][i4 >> 5][i3] >> (i4 & 31)) & 1) != 0))) {
                            if (this.f519d.f88i == 2) {
                                int[] iArr = null;
                                i2 = ((iArr[i3] >> (i4 & 31)) & 1) == 0 ? 2022 : 2021;
                            }
                        }
                        m217e(i2, ((i4 - this.f452b.f323z) * 30) - this.f398aT, ((i3 - this.f452b.f147A) * 20) - this.f399aU);
                    }
                }
                m217e(1996, ((this.f409aj - this.f452b.f323z) * 30) - this.f398aT, ((this.f411ak - this.f452b.f147A) * 20) - this.f399aU);
                m217e(1997, ((((this.f409aj + b) - 1) - this.f452b.f323z) * 30) - this.f398aT, ((this.f411ak - this.f452b.f147A) * 20) - this.f399aU);
                m217e(1998, ((this.f409aj - this.f452b.f323z) * 30) - this.f398aT, ((((this.f411ak + b2) - 1) - this.f452b.f147A) * 20) - this.f399aU);
                m217e(1999, ((((b + this.f409aj) - 1) - this.f452b.f323z) * 30) - this.f398aT, ((((b2 + this.f411ak) - 1) - this.f452b.f147A) * 20) - this.f399aU);
                this.f453b.m231a((((this.f409aj - this.f452b.f323z) * 30) - this.f398aT) + 2, ((((this.f411ak - 1) - this.f452b.f147A) * 20) - this.f399aU) + 9, 0, new StringBuffer().append((int) this.f547q[this.f548r[6] + this.f427as]).append("^").toString(), 0);
                this.f453b.m233a(this.f455b[this.f429at]);
                if (this.f425ar >= 121) {
                    this.f455b[this.f429at].setColor(this.f338G ? 65280 : 16711680);
                    for (int i5 = 0; i5 < 20; i5++) {
                        m172d(this.f455b[this.f429at], (((((this.f409aj - this.f452b.f323z) * 30) + 15) + 15) - this.f398aT) + ((this.f547q[this.f548r[8] + (i5 << 1)] * 5) / 20), ((((this.f458bB + 10) + ((this.f411ak - this.f452b.f147A) * 20)) + 10) - this.f399aU) + ((this.f547q[(this.f548r[8] + (i5 << 1)) + 1] * 5) / 20), (((((this.f409aj - this.f452b.f323z) * 30) + 15) + 15) - this.f398aT) + ((this.f547q[(this.f548r[8] + (i5 << 1)) + 2] * 5) / 20), ((((this.f458bB + 10) + ((this.f411ak - this.f452b.f147A) * 20)) + 10) - this.f399aU) + ((this.f547q[(this.f548r[8] + (i5 << 1)) + 3] * 5) / 20));
                    }
                }
            } else {
                m221o(this.f509c, ((this.f409aj - this.f452b.f323z) * 30) - this.f398aT, ((this.f411ak - this.f452b.f147A) * 20) - this.f399aU, this.f519d.f98k, -1);
                if (this.f335E[0][50] > 0 && this.f435av < 0) {
                    this.f453b.m231a(((((this.f409aj + 1) - this.f452b.f323z) * 30) - this.f398aT) - 7, ((((this.f411ak + 1) - this.f452b.f147A) * 20) - this.f399aU) + 4, 0, new StringBuffer().append((int) this.f335E[0][50]).toString(), 0);
                    this.f453b.m233a(this.f455b[this.f429at]);
                }
            }
            this.f399aU = 0;
            this.f398aT = 0;
        } else if (this.f425ar >= 0) {
            byte b3 = this.f425ar >= 121 ? (byte) 1 : this.f519d.f92i[18][this.f425ar];
            byte b4 = this.f425ar >= 121 ? (byte) 1 : this.f519d.f92i[19][this.f425ar];
            for (int i6 = this.f411ak; i6 < this.f411ak + b4; i6++) {
                for (int i7 = this.f409aj; i7 < this.f409aj + b3; i7++) {
                    if (this.f542l[i6][i7] == 0 && this.f338G && (this.f519d.f88i >= 2 || (((this.f519d.f49a[this.f519d.f109n][0][i7 >> 5][i6] >> (i7 & 31)) & 1) != 0 && ((this.f519d.f49a[this.f519d.f109n][1][i7 >> 5][i6] >> (i7 & 31)) & 1) != 0))) {
                        if (this.f519d.f88i == 2) {
                            int[] iArr2 = null;
                            i = ((iArr2[i6] >> (i7 & 31)) & 1) == 0 ? 2022 : 2021;
                        }
                    }
                    m217e(i, (i7 - this.f452b.f323z) * 30, (i6 - this.f452b.f147A) * 20);
                }
            }
            m217e(1996, (this.f409aj - this.f452b.f323z) * 30, (this.f411ak - this.f452b.f147A) * 20);
            m217e(1997, (((this.f409aj + b3) - 1) - this.f452b.f323z) * 30, (this.f411ak - this.f452b.f147A) * 20);
            m217e(1998, (this.f409aj - this.f452b.f323z) * 30, (((this.f411ak + b4) - 1) - this.f452b.f147A) * 20);
            m217e(1999, (((b3 + this.f409aj) - 1) - this.f452b.f323z) * 30, (((b4 + this.f411ak) - 1) - this.f452b.f147A) * 20);
            this.f453b.m231a(((this.f409aj - this.f452b.f323z) * 30) + 2, (((this.f411ak - 1) - this.f452b.f147A) * 20) + 9, 0, new StringBuffer().append((int) this.f547q[this.f548r[6] + this.f427as]).append("^").toString(), 0);
            this.f453b.m233a(this.f455b[this.f429at]);
            if (this.f425ar >= 121) {
                this.f455b[this.f429at].setColor(this.f338G ? 65280 : 16711680);
                for (int i8 = 0; i8 < 20; i8++) {
                    m172d(this.f455b[this.f429at], ((this.f409aj - this.f452b.f323z) * 30) + 15 + 15 + ((this.f547q[this.f548r[8] + (i8 << 1)] * 5) / 20), this.f458bB + 10 + ((this.f411ak - this.f452b.f147A) * 20) + 10 + ((this.f547q[(this.f548r[8] + (i8 << 1)) + 1] * 5) / 20), ((this.f409aj - this.f452b.f323z) * 30) + 15 + 15 + ((this.f547q[(this.f548r[8] + (i8 << 1)) + 2] * 5) / 20), this.f458bB + 10 + ((this.f411ak - this.f452b.f147A) * 20) + 10 + ((this.f547q[(this.f548r[8] + (i8 << 1)) + 3] * 5) / 20));
                }
            }
        } else {
            m221o(this.f509c, (this.f409aj - this.f452b.f323z) * 30, (this.f411ak - this.f452b.f147A) * 20, this.f519d.f98k, -1);
            if (this.f335E[0][50] > 0 && this.f435av < 0) {
                this.f453b.m231a((((this.f409aj + 1) - this.f452b.f323z) * 30) - 7, (((this.f411ak + 1) - this.f452b.f147A) * 20) + 4, 0, new StringBuffer().append((int) this.f335E[0][50]).toString(), 0);
                this.f453b.m233a(this.f455b[this.f429at]);
            }
        }
        if (this.f435av >= 0) {
            int iMax = Math.max(this.f452b.f323z - 1, Math.min((int) this.f409aj, (int) this.f435av));
            int iMin = Math.min(this.f452b.f323z + 8, Math.max((int) this.f409aj, (int) this.f435av));
            int iMax2 = Math.max(this.f452b.f147A - 1, Math.min((int) this.f411ak, (int) this.f438aw));
            int iMin2 = Math.min(this.f452b.f147A + this.f452b.f191O, Math.max((int) this.f411ak, (int) this.f438aw));
            if (this.f519d.f103l) {
                for (int i9 = iMax; i9 <= iMin; i9++) {
                    for (int i10 = iMax2; i10 <= iMin2; i10++) {
                        m217e(2020, (i9 - this.f452b.f323z) * 30, (i10 - this.f452b.f147A) * 20);
                    }
                }
            }
            while (iMax <= iMin) {
                m217e(2016, (iMax - this.f452b.f323z) * 30, (Math.min((int) this.f411ak, (int) this.f438aw) - this.f452b.f147A) * 20);
                m217e(2017, (iMax - this.f452b.f323z) * 30, (Math.max((int) this.f411ak, (int) this.f438aw) - this.f452b.f147A) * 20);
                iMax++;
            }
            while (iMax2 <= iMin2) {
                m217e(2018, (Math.min((int) this.f409aj, (int) this.f435av) - this.f452b.f323z) * 30, (iMax2 - this.f452b.f147A) * 20);
                m217e(2019, (Math.max((int) this.f409aj, (int) this.f435av) - this.f452b.f323z) * 30, (iMax2 - this.f452b.f147A) * 20);
                iMax2++;
            }
            m217e(1992, (Math.min((int) this.f409aj, (int) this.f435av) - this.f452b.f323z) * 30, (Math.min((int) this.f411ak, (int) this.f438aw) - this.f452b.f147A) * 20);
            m217e(1993, (Math.max((int) this.f409aj, (int) this.f435av) - this.f452b.f323z) * 30, (Math.min((int) this.f411ak, (int) this.f438aw) - this.f452b.f147A) * 20);
            m217e(1994, (Math.min((int) this.f409aj, (int) this.f435av) - this.f452b.f323z) * 30, (Math.max((int) this.f411ak, (int) this.f438aw) - this.f452b.f147A) * 20);
            m217e(1995, (Math.max((int) this.f409aj, (int) this.f435av) - this.f452b.f323z) * 30, (Math.max((int) this.f411ak, (int) this.f438aw) - this.f452b.f147A) * 20);
            this.f453b.m231a((((this.f409aj + 1) - this.f452b.f323z) * 30) - 7, (((this.f411ak + 1) - this.f452b.f147A) * 20) + 4, 0, new StringBuffer().append((int) this.f441ax).toString(), -1);
            this.f453b.m233a(this.f455b[this.f429at]);
        }
    }

    /* JADX INFO: renamed from: aD */
    private void m120aD() {
        byte b = this.f426ar[this.f477bU];
        this.f525f = "";
        for (int i = 0; i < b; i++) {
            this.f525f = new StringBuffer().append(this.f525f).append((char) (this.f426ar[this.f477bU + 1 + i] & 255)).toString();
        }
        int i2 = b + 1;
        int i3 = i2 + 1;
        this.f479bW = this.f426ar[i2 + this.f477bU];
        for (int i4 = 0; i4 < this.f479bW; i4++) {
            this.f545o[i4] = (short) (((this.f426ar[this.f477bU + i3] & 255) << 8) | (this.f426ar[this.f477bU + i3 + 1] & 255));
            this.f446ay[i4] = this.f426ar[this.f477bU + i3 + 2];
            i3 += 3;
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = i3 + 1;
                byte b2 = this.f426ar[i3 + this.f477bU];
                this.f456b[i5][i4] = "";
                for (int i7 = 0; i7 < b2; i7++) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String[] strArr = this.f456b[i5];
                    strArr[i4] = stringBuffer.append(strArr[i4]).append((char) (this.f426ar[this.f477bU + i6 + i7] & 255)).toString();
                }
                i3 = i6 + b2;
            }
            if (this.f446ay[i4] > 0) {
                for (int i8 = (this.f379aH - 1) * 50; i8 < this.f379aH * 50; i8++) {
                    if (this.f545o[i4] == this.f541l[i8]) {
                        byte[] bArr = this.f446ay;
                        bArr[i4] = (byte) (bArr[i4] + 1);
                        break;
                    }
                }
            }
        }
        this.f501bs = 6;
        m207a(8, true);
        this.f350P = false;
    }

    /* JADX INFO: renamed from: aE */
    private void m121aE() {
        boolean z;
        short s = (short) ((this.f426ar[this.f477bU] << 8) | this.f426ar[this.f477bU + 1]);
        byte b = this.f426ar[this.f477bU + 2];
        int i = 0;
        String str = "";
        while (i < b) {
            String string = new StringBuffer().append(str).append((char) (this.f426ar[this.f477bU + 3 + i] & 255)).toString();
            i++;
            str = string;
        }
        int i2 = ((this.f426ar[(this.f477bU + 3) + b] & 255) << 24) | ((this.f426ar[(this.f477bU + 4) + b] & 255) << 16) | ((this.f426ar[(this.f477bU + 5) + b] & 255) << 8) | (this.f426ar[this.f477bU + 6 + b] & 255);
        int i3 = (this.f379aH - 1) * 50;
        while (i3 < this.f379aH * 50) {
            if (this.f541l[i3] < 0) {
                try {
                    String string2 = new StringBuffer().append(i3 < 10 ? "aow220" : "aow22").append(i3).toString();
                    try {
                        RecordStore.deleteRecordStore(string2);
                    } catch (Exception e) {
                    }
                    this.f357a = RecordStore.openRecordStore(string2, true);
                    this.f426ar[this.f477bU + 5 + b] = (byte) (i2 >> 8);
                    this.f426ar[this.f477bU + 6 + b] = (byte) i2;
                    this.f357a.addRecord(this.f426ar, b + this.f477bU + 5, i2 + 2);
                    this.f357a.closeRecordStore();
                    z = true;
                } catch (Exception e2) {
                    z = false;
                }
                if (!z) {
                    break;
                }
                this.f541l[i3] = s;
                this.f524e[i3] = str;
                m127aL();
                this.f501bs = -1;
                m207a(55, true);
                this.f350P = false;
                return;
            }
            i3++;
        }
        this.f501bs = -1;
        m207a(56, true);
        this.f350P = false;
    }

    /* JADX INFO: renamed from: aF */
    private void m122aF() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.f519d.f118q = this.f426ar[this.f477bU + 0];
        int i6 = 2;
        int i7 = this.f426ar[this.f477bU + 1];
        if (this.f390aN == 0) {
            this.f519d.f53b = new String[i7];
        }
        int i8 = 0;
        while (i8 < i7) {
            if (this.f390aN == 0) {
                this.f519d.f53b[i8] = "";
            }
            int i9 = i6 + 1;
            byte b = this.f426ar[this.f477bU + i6];
            int i10 = 0;
            while (i10 < b) {
                if (this.f390aN == 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String[] strArr = this.f519d.f53b;
                    StringBuffer stringBufferAppend = stringBuffer.append(strArr[i8]);
                    i5 = i9 + 1;
                    strArr[i8] = stringBufferAppend.append((char) (this.f426ar[i9 + this.f477bU] & 255)).toString();
                } else {
                    i5 = i9 + 1;
                }
                i10++;
                i9 = i5;
            }
            boolean z = this.f390aN == 1 && i8 == this.f519d.f116p;
            if (z) {
                for (int i11 = 0; i11 < 5; i11++) {
                    this.f519d.f82g[i11] = 0;
                }
            }
            byte b2 = this.f426ar[i9 + this.f477bU];
            int i12 = 0;
            i6 = i9 + 1;
            while (i12 < b2) {
                int i13 = i6 + 1;
                byte b3 = this.f426ar[this.f477bU + i6];
                int i14 = 0;
                while (true) {
                    int i15 = i14;
                    i2 = i13;
                    if (i15 >= 4) {
                        break;
                    }
                    if (z) {
                        this.f519d.f46a[i15][b3] = "";
                    }
                    i13 = i2 + 1;
                    byte b4 = this.f426ar[i2 + this.f477bU];
                    int i16 = 0;
                    while (i16 < b4) {
                        if (z) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            String[] strArr2 = this.f519d.f46a[i15];
                            StringBuffer stringBufferAppend2 = stringBuffer2.append(strArr2[b3]);
                            i4 = i13 + 1;
                            strArr2[b3] = stringBufferAppend2.append((char) (this.f426ar[i13 + this.f477bU] & 255)).toString();
                        } else {
                            i4 = i13 + 1;
                        }
                        i16++;
                        i13 = i4;
                    }
                    i14 = i15 + 1;
                }
                if (z) {
                    i3 = i2 + 1;
                    this.f519d.f82g[b3] = this.f426ar[i2 + this.f477bU];
                } else {
                    i3 = i2 + 1;
                }
                i12++;
                i6 = i3;
            }
            i8++;
        }
        if (this.f390aN == 2) {
            int i17 = 0;
            while (i17 < i7) {
                boolean z2 = i17 == this.f519d.f116p;
                int i18 = i6 + 1;
                int i19 = (this.f426ar[this.f477bU + i6] & 255) << 8;
                i6 = i18 + 1;
                int i20 = i19 + (this.f426ar[i18 + this.f477bU] & 255);
                int i21 = 0;
                while (i21 < i20) {
                    if (z2) {
                        this.f453b.f570M[1][this.f453b.f611m[1][221] + i21] = this.f365aB[this.f546p[139] + (this.f426ar[this.f477bU + i6] & 255)];
                        i = i6 + 1;
                        this.f453b.f571N[1][i21 + this.f453b.f611m[1][221]] = this.f365aB[(this.f426ar[i6 + this.f477bU] & 255) + this.f546p[140]];
                    } else {
                        i = i6 + 1;
                    }
                    i21++;
                    i6 = i;
                }
                if (z2) {
                    short[] sArr = this.f453b.f611m[1];
                    sArr[221] = (short) (sArr[221] + i20);
                    break;
                }
                i17++;
            }
        }
        if (this.f390aN == 0) {
            this.f501bs = -1;
            m207a(52, true);
            this.f350P = false;
        } else if (this.f390aN == 1) {
            m127aL();
        }
    }

    /* JADX INFO: renamed from: aG */
    private void m123aG() {
        this.f529g = "";
        byte b = this.f426ar[this.f477bU];
        for (int i = 0; i < b; i++) {
            this.f529g = new StringBuffer().append(this.f529g).append((char) (this.f426ar[this.f477bU + 1 + i] & 255)).toString();
        }
        int i2 = b + 1;
        int i3 = ((this.f426ar[this.f477bU + i2] & 255) << 8) + (this.f426ar[this.f477bU + i2 + 1] & 255);
        int i4 = i2 + 2;
        for (int i5 = 0; i5 < i3; i5++) {
            this.f453b.f570M[1][this.f453b.f611m[1][220] + i5] = this.f365aB[this.f546p[139] + (this.f426ar[this.f477bU + i4 + i5] & 255)];
            this.f453b.f571N[1][this.f453b.f611m[1][220] + i5] = this.f365aB[this.f546p[140] + (this.f426ar[this.f477bU + i4 + i5] & 255)];
        }
        this.f453b.f611m[1][221] = (short) (i3 + this.f453b.f611m[1][220]);
        m207a(49, true);
        this.f350P = false;
    }

    /* JADX INFO: renamed from: aH */
    private void m124aH() {
        this.f535i = "";
        int i = this.f426ar[this.f477bU] & 255;
        for (int i2 = 0; i2 < i; i2++) {
            this.f535i = new StringBuffer().append(this.f535i).append((char) (this.f426ar[this.f477bU + 1 + i2] & 255)).toString();
        }
        m207a(40, true);
        this.f350P = false;
    }

    /* JADX INFO: renamed from: aI */
    private void m125aI() {
        this.f375aF = ((this.f452b.f226a.nextInt() & 65535) % (this.f547q[26] - 150)) + 150;
        this.f397aS = 1;
        for (int i = 0; i < this.f547q[25]; i++) {
            this.f397aS *= this.f375aF;
            this.f397aS %= this.f547q[26];
        }
    }

    /* JADX INFO: renamed from: aJ */
    private void m126aJ() {
        try {
            RecordStore.deleteRecordStore("aow226");
        } catch (Exception e) {
        }
        try {
            this.f357a = RecordStore.openRecordStore("aow226", true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f355a = new DataOutputStream(byteArrayOutputStream);
            this.f355a.writeInt(this.f430at);
            this.f355a.writeInt(this.f519d.f37a.f553cj);
            this.f355a.writeByte(this.f367aC);
            this.f355a.writeByte(this.f370aD);
            this.f355a.writeByte(this.f373aE);
            this.f355a.close();
            this.f357a.addRecord(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.toByteArray().length);
        } catch (Exception e2) {
        }
        try {
            this.f357a.closeRecordStore();
        } catch (Exception e3) {
        }
    }

    /* JADX INFO: renamed from: aL */
    private void m127aL() {
        try {
            RecordStore.deleteRecordStore("aow222");
        } catch (Exception e) {
        }
        try {
            this.f357a = RecordStore.openRecordStore("aow222", true);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f355a = new DataOutputStream(byteArrayOutputStream);
            this.f355a.writeByte(this.f519d.f118q);
            this.f355a.writeByte(this.f519d.f116p);
            this.f355a.writeByte(this.f433au);
            this.f355a.writeByte(this.f436av);
            this.f355a.writeByte(this.f445ay);
            this.f355a.writeByte(this.f439aw);
            this.f355a.writeByte(this.f442ax);
            this.f355a.writeBoolean(this.f336F);
            this.f355a.writeByte(this.f519d.f69e);
            this.f355a.writeByte(this.f361aA);
            this.f355a.writeByte(this.f364aB);
            this.f355a.writeShort(this.f519d.f63c[0][10]);
            for (int i = 0; i < 100; i++) {
                this.f355a.writeShort(this.f541l[i]);
                if (this.f541l[i] >= 0) {
                    this.f355a.writeByte(this.f524e[i].length());
                    for (int i2 = 0; i2 < this.f524e[i].length(); i2++) {
                        this.f355a.writeByte((byte) this.f524e[i].charAt(i2));
                    }
                }
            }
            this.f355a.write(this.f428as);
            this.f355a.writeByte(this.f376aG);
            this.f355a.writeLong(this.f528g);
            this.f355a.writeByte(2);
            int i3 = 0;
            for (int i4 = 0; i4 < 5; i4++) {
                if (this.f519d.f82g[i4] > 0) {
                    i3++;
                }
            }
            this.f355a.writeByte(i3);
            this.f511cb = 0;
            for (int i5 = 0; i5 < 5; i5++) {
                if (this.f519d.f82g[i5] > 0) {
                    m197o(i5);
                    for (int i6 = 0; i6 < 4; i6++) {
                        m197o(this.f519d.f46a[i6][i5].length());
                        for (int i7 = 0; i7 < this.f519d.f46a[i6][i5].length(); i7++) {
                            m197o(this.f519d.f46a[i6][i5].charAt(i7));
                        }
                        m197o(this.f519d.f82g[i5]);
                    }
                }
            }
            this.f355a.writeByte(this.f389aM);
            this.f355a.writeShort(this.f519d.f63c[this.f519d.f109n][9]);
            this.f355a.writeInt(this.f519d.f102l);
            this.f355a.writeShort(this.f375aF ^ this.f547q[24]);
            this.f355a.writeInt(this.f377aG);
            this.f355a.writeByte(this.f406ah);
            this.f355a.writeByte(this.f395aQ);
            this.f355a.writeByte(this.f396aR);
            this.f355a.writeByte(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.f355a.close();
            this.f357a.addRecord(byteArray, 0, byteArray.length);
            this.f357a.closeRecordStore();
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: aa */
    private void m128aa() {
        this.f452b.m109s();
        m190k(this.f448az);
        this.f389aM = 0;
        for (int i = 0; i < 6; i++) {
            this.f412ak[i] = 0;
        }
        this.f412ak[2] = this.f365aB[this.f546p[131] + Math.min(this.f448az, 7)];
        this.f412ak[3] = this.f365aB[this.f546p[129] + Math.min(this.f448az, 7)];
        this.f412ak[5] = this.f365aB[this.f546p[130] + Math.min(this.f448az, 7)];
        if (this.f379aH == 2) {
            this.f452b.m104d(this.f485bc);
        } else {
            this.f485bc = 0;
        }
        for (int i2 = 0; i2 < this.f416am.length; i2++) {
            this.f416am[i2] = this.f365aB[this.f546p[124] + i2];
        }
        for (int i3 = 0; i3 < this.f418an.length; i3++) {
            this.f418an[i3] = this.f365aB[this.f546p[125] + i3];
        }
        this.f387aL = 2;
        this.f385aK = 2;
        this.f523e = (short) -1;
        this.f417an = (byte) -1;
        this.f520d = (short) -1;
        this.f454b = (short) 0;
        this.f359a = (short) 0;
        this.f457bA = 0;
        this.f526f = (short) -1;
        this.f533h = (short) -1;
        this.f425ar = (byte) -1;
        this.f409aj = this.f371aD[(this.f519d.f109n * 50) + 5252 + 1];
        this.f411ak = this.f371aD[(this.f519d.f109n * 50) + 5353 + 1];
        m214ax();
        this.f435av = (byte) -1;
        for (int i4 = 0; i4 < this.f410aj.length; i4++) {
            this.f410aj[i4] = -1;
        }
        this.f536i = (short) 0;
        this.f444ay = (byte) -1;
        short[] sArr = this.f519d.f63c[this.f519d.f109n];
        this.f519d.f63c[this.f519d.f109n ^ 1][4] = 1000;
        sArr[4] = 1000;
        this.f374aF = (byte) -1;
        this.f372aE = (byte) -1;
        this.f360aA = (byte) -1;
        this.f530g = (short) -1;
        byte[] bArr = this.f422ap;
        this.f422ap[1] = 20;
        bArr[0] = 20;
        this.f420ao[0] = 15;
        this.f420ao[1] = 25;
        if (this.f334E) {
            for (int i5 = 0; i5 < 48; i5++) {
                if ((this.f452b.f268d & (1 << i5)) != 0) {
                    this.f452b.m107g(i5);
                }
            }
        }
        switch (this.f448az) {
            case 0:
                this.f369aD = (byte) 1;
                break;
            case 1:
                this.f369aD = (byte) 12;
                break;
            case 2:
                this.f369aD = (byte) 17;
                break;
            case 3:
                this.f369aD = (byte) 22;
                break;
            case 4:
                this.f369aD = (byte) 27;
                break;
            case 5:
                this.f369aD = (byte) 32;
                break;
            case 6:
                this.f369aD = (byte) 39;
                break;
            default:
                this.f369aD = (byte) 46;
                break;
        }
        this.f330C = false;
        this.f519d.f98k = 0;
        this.f519d.f126u = (byte) 0;
        this.f450b.f13b = -1;
    }

    /* JADX INFO: renamed from: ab */
    private void m129ab() {
        this.f452b.f314x = (byte) m159c(1);
        this.f452b.f318y = (byte) m159c(1);
        for (int i = 0; i < this.f452b.f318y; i++) {
            for (int i2 = 0; i2 < this.f452b.f314x; i2++) {
                this.f542l[i][i2] = 124;
                this.f343I[i][i2] = 0;
            }
        }
        int iM159c = m159c(1);
        this.f543m = this.f519d.f68d[iM159c];
        this.f544n = this.f519d.f73e[iM159c];
        int iM159c2 = m159c(2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iM159c2; i5++) {
            int iM159c3 = m159c(1);
            int iM159c4 = m159c(1);
            int i6 = 0;
            while (i6 < iM159c3) {
                this.f343I[i3][i4] = (byte) iM159c4;
                for (int i7 = 0; i7 < 5; i7++) {
                    if (this.f343I[i3][i4] >= this.f544n[i7] && this.f343I[i3][i4] < this.f544n[i7 + 1]) {
                        this.f343I[i3][i4] = (byte) (((this.f452b.f226a.nextInt() & 65535) % (this.f544n[i7 + 1] - this.f544n[i7])) + this.f544n[i7]);
                        break;
                    }
                }
                if (this.f343I[i3][i4] >= this.f544n[13]) {
                    this.f542l[i3][i4] = 126;
                }
                int i8 = i4 + 1;
                if (i8 >= this.f452b.f314x) {
                    i8 -= this.f452b.f314x;
                    i3++;
                }
                i6++;
                i4 = i8;
            }
        }
        int iM159c5 = m159c(2);
        for (int i9 = 0; i9 < iM159c5; i9++) {
            int iM159c6 = m159c(1);
            int iM159c7 = m159c(1);
            int iM159c8 = m159c(1);
            int i10 = iM159c6 + this.f544n[14];
            if (iM159c7 >= 0 && iM159c8 >= 0 && iM159c7 < this.f452b.f314x && iM159c8 < this.f452b.f318y) {
                for (int i11 = iM159c7; i11 < this.f519d.f92i[18][this.f543m[i10]] + iM159c7; i11++) {
                    for (int i12 = iM159c8; i12 < this.f519d.f92i[19][this.f543m[i10]] + iM159c8; i12++) {
                        this.f542l[i12][i11] = (short) ((i10 < this.f544n[13] || i10 >= this.f544n[15]) ? 125 : 126);
                    }
                }
                this.f542l[iM159c8][iM159c7] = (short) (i10 + 128);
            }
        }
        for (int i13 = 0; i13 < this.f452b.f318y; i13++) {
            for (int i14 = 0; i14 < ((this.f452b.f314x - 1) / 32) + 1; i14++) {
                int iM159c9 = m159c(4);
                for (int i15 = i14 << 5; i15 < ((i14 + 1) << 5) && i15 < this.f452b.f314x; i15++) {
                    if (((1 << ((((i14 + 1) << 5) - 1) - i15)) & iM159c9) == 0 && this.f542l[i13][i15] > 100 && this.f542l[i13][i15] < 1001) {
                        this.f542l[i13][i15] = 0;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ad */
    private void m130ad() {
        if (this.f366aC >= 0) {
            this.f366aC = (byte) (this.f366aC + 1);
            if (this.f366aC - 1 > this.f519d.f79f[6][289] - this.f519d.f79f[5][289]) {
                this.f366aC = (byte) 0;
                return;
            }
            return;
        }
        this.f366aC = (byte) (this.f366aC - 1);
        if ((-this.f366aC) - 1 > this.f519d.f79f[6][285] - this.f519d.f79f[5][285]) {
            this.f363aB = (byte) (this.f363aB + 1);
            if (this.f363aB < (this.f365aB[(this.f546p[157] + this.f360aA) + 1] & 255) - (this.f365aB[this.f546p[157] + this.f360aA] & 255)) {
                this.f366aC = (byte) 1;
                this.f508bz = (this.f365aB[this.f546p[157] + this.f360aA] & 255) + this.f363aB;
                this.f345K = true;
                return;
            }
            if (this.f374aF >= 0) {
                this.f360aA = this.f374aF;
                this.f374aF = (byte) -1;
                this.f501bs = -1;
                m207a(17, true);
                this.f345K = true;
                this.f366aC = (byte) 0;
                return;
            }
            if (this.f452b.f170H >= 50) {
                m207a((this.f452b.f167G + 25) - 1, true);
                this.f360aA = (byte) -1;
                this.f366aC = (byte) 0;
                return;
            }
            if (this.f519d.f90i) {
                this.f533h = (short) 271;
                this.f432au = (byte) 0;
            } else {
                this.f519d.f105m = (byte) 1;
                this.f407ai = (byte) 4;
                if (this.f530g >= 0) {
                    m139am();
                }
            }
            this.f360aA = (byte) -1;
            this.f366aC = (byte) 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: ae */
    private void m131ae() {
        boolean z;
        switch (this.f519d.f120r) {
            case -1:
                break;
            case 0:
            default:
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4 || this.f519d.f120r == 6 || this.f519d.f120r == 2 || this.f519d.f120r == 8) {
                        m132af();
                    }
                }
                break;
            case 1:
            case 3:
            case 7:
            case 9:
                if (this.f536i != 0 || this.f425ar >= 0 || this.f435av >= 0) {
                    this.f519d.f122s = (byte) 0;
                } else if (this.f519d.f122s == 4) {
                    if (this.f457bA == this.f365aB[this.f546p[67] + this.f519d.f120r]) {
                        m149aw();
                    }
                    this.f519d.f122s = (byte) 0;
                } else if (this.f519d.f110n < 4) {
                    if (this.f519d.f107m) {
                        m153b((int) this.f365aB[this.f546p[67] + this.f519d.f120r], 0);
                    }
                    if (this.f425ar >= 0) {
                        if (this.f519d.f120r != 4) {
                        }
                        m132af();
                    }
                } else {
                    m153b(0, (int) this.f365aB[this.f546p[67] + this.f519d.f120r]);
                }
                this.f519d.f120r = (byte) -1;
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4) {
                    }
                    m132af();
                }
                break;
            case 2:
                m136aj();
                m148av();
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4) {
                    }
                    m132af();
                }
                break;
            case 4:
                m134ah();
                m148av();
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4) {
                    }
                    m132af();
                }
                break;
            case 5:
                if (this.f425ar >= 0 || this.f536i != 0) {
                    if (this.f536i != 0) {
                        this.f371aD[6161 - this.f536i] = this.f409aj;
                        this.f371aD[6262 - this.f536i] = this.f411ak;
                        if (this.f519d.f94j < 0) {
                            this.f426ar[0] = 6;
                            this.f426ar[1] = (byte) (-this.f536i);
                            this.f426ar[2] = this.f409aj;
                            this.f426ar[3] = this.f411ak;
                            this.f469bM = 4;
                        }
                        this.f359a = this.f536i;
                        this.f536i = (short) 0;
                        this.f526f = (short) 135;
                        if (this.f519d.f90i) {
                            this.f533h = (short) 270;
                            this.f432au = (byte) 0;
                        }
                        this.f519d.f120r = (byte) -1;
                    } else if (this.f425ar >= 0) {
                        if (this.f519d.f63c[this.f519d.f109n][1] < 50 || this.f425ar >= 15) {
                            if (this.f519d.f63c[this.f519d.f109n][4] >= this.f547q[this.f548r[6] + this.f427as]) {
                                byte b = this.f409aj;
                                byte b2 = this.f411ak;
                                byte b3 = this.f425ar;
                                int i = b2;
                                while (true) {
                                    if (i < (b3 >= 121 ? (byte) 1 : this.f519d.f92i[19][b3]) + b2) {
                                        int i2 = b;
                                        while (true) {
                                            if (i2 < (b3 >= 121 ? (byte) 1 : this.f519d.f92i[18][b3]) + b) {
                                                if (this.f542l[i][i2] == 0 && (this.f519d.f88i >= 2 || (((this.f519d.f49a[this.f519d.f109n][0][i2 >> 5][i] >> (i2 & 31)) & 1) != 0 && ((this.f519d.f49a[this.f519d.f109n][1][i2 >> 5][i] >> (i2 & 31)) & 1) != 0))) {
                                                    if (this.f519d.f88i == 2) {
                                                        int[] iArr = null;
                                                        if (((iArr[i] >> (i2 & 31)) & 1) == 0) {
                                                        }
                                                    }
                                                    i2++;
                                                }
                                                z = false;
                                            } else {
                                                i++;
                                            }
                                        }
                                    } else {
                                        if (b3 >= 121 && this.f338G) {
                                            this.f338G = m158b((int) b, (int) b2);
                                        }
                                        z = this.f338G;
                                    }
                                }
                                if (z) {
                                    short[] sArr = this.f519d.f63c[this.f519d.f109n];
                                    sArr[4] = (short) (sArr[4] - this.f547q[this.f548r[6] + this.f427as]);
                                    if (this.f519d.f94j < 0) {
                                        this.f426ar[0] = 4;
                                        this.f426ar[1] = this.f425ar;
                                        this.f426ar[2] = this.f427as;
                                        this.f426ar[3] = this.f409aj;
                                        this.f426ar[4] = this.f411ak;
                                        this.f469bM = 5;
                                    }
                                    if (this.f425ar < 15) {
                                        m206a(this.f425ar, this.f409aj, this.f411ak, this.f519d.f109n, 0, false);
                                    } else {
                                        this.f542l[this.f411ak][this.f409aj] = (short) (this.f425ar >= 121 ? this.f425ar : (this.f519d.f109n * 100) + 1001);
                                        this.f407ai = (byte) 4;
                                    }
                                }
                            } else {
                                this.f410aj[5] = 0;
                            }
                        }
                        this.f519d.f120r = (byte) -1;
                    }
                } else if (this.f435av != -1 || this.f519d.f107m) {
                    if (this.f435av != -1) {
                        m170d(this.f435av, this.f438aw, this.f409aj, this.f411ak);
                        this.f435av = (byte) -1;
                        this.f519d.f122s = (byte) 0;
                    } else if (this.f359a > this.f519d.f109n * 50 && this.f359a <= (this.f519d.f109n + 1) * 50) {
                        m170d(this.f413al, this.f415am, this.f413al, this.f415am);
                        if (this.f413al - this.f409aj == -1) {
                            m134ah();
                        } else if (this.f413al - this.f409aj == 1) {
                            m135ai();
                        }
                        if (this.f415am - this.f411ak == -1) {
                            m136aj();
                        } else if (this.f415am - this.f411ak == 1) {
                            m137ak();
                        }
                    } else if ((-this.f359a) > this.f519d.f109n * 50 && (-this.f359a) <= (this.f519d.f109n + 1) * 50) {
                        m145as();
                    } else if (this.f335E[0][50] > 0) {
                        m146at();
                    }
                    if (this.f519d.f122s == 4) {
                        if (this.f526f < 0 && this.f359a >= 0) {
                            m170d(this.f452b.f323z, this.f452b.f147A, (this.f452b.f323z + 8) - 1, (this.f452b.f147A + this.f452b.f191O) - 1);
                        }
                        this.f519d.f122s = (byte) 0;
                    }
                    this.f519d.f120r = (byte) -1;
                } else if (this.f519d.f110n == 4) {
                    if (this.f335E[0][50] > 0) {
                        this.f526f = (short) 145;
                        this.f486bd = 0;
                        this.f488bf = 0;
                        this.f447az = (byte) 1;
                        for (int i3 = 0; i3 < this.f335E[0][50]; i3++) {
                            if (this.f365aB[this.f546p[58] + this.f371aD[this.f335E[0][i3] + 2323]] > this.f488bf && (this.f365aB[this.f546p[52] + 10] >= 0 || this.f371aD[this.f335E[0][i3] + 2323] != 10)) {
                                this.f488bf = this.f365aB[this.f546p[58] + this.f371aD[this.f335E[0][i3] + 2323]];
                            }
                            if (this.f365aB[this.f546p[52] + this.f371aD[this.f335E[0][i3] + 2323]] >= 0 && this.f365aB[this.f546p[52] + this.f371aD[this.f335E[0][i3] + 2323]] > this.f371aD[this.f335E[0][i3] + 2323]) {
                                this.f447az = (byte) 0;
                            }
                        }
                        this.f487be = this.f488bf + 2;
                        this.f502bt = C0005f.m57a((this.f409aj - this.f452b.f323z) * 30, 0, 240 - ((this.f488bf + 2) * 27));
                        this.f503bu = C0005f.m57a(((this.f411ak - this.f452b.f147A) + 1) * 20, 0, 299);
                    } else {
                        this.f435av = this.f409aj;
                        this.f438aw = this.f411ak;
                        m148av();
                    }
                    this.f519d.f120r = (byte) -1;
                }
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4) {
                    }
                    m132af();
                }
                break;
            case 6:
                m135ai();
                m148av();
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4) {
                    }
                    m132af();
                }
                break;
            case 8:
                m137ak();
                m148av();
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4) {
                    }
                    m132af();
                }
                break;
            case 10:
                this.f519d.f105m = (byte) 2;
                this.f407ai = (byte) 4;
                this.f519d.f120r = (byte) -1;
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4) {
                    }
                    m132af();
                }
                break;
            case 11:
                if (this.f536i != 0) {
                    this.f359a = this.f536i;
                    this.f536i = (short) 0;
                    this.f526f = (short) 135;
                    if (this.f519d.f90i) {
                        this.f533h = (short) 270;
                        this.f432au = (byte) 0;
                    }
                } else if (this.f425ar >= 0) {
                    this.f425ar = (byte) -1;
                } else if (this.f435av >= 0 || this.f335E[0][50] > 0) {
                    this.f435av = (byte) -1;
                    m194m(0);
                } else {
                    this.f519d.f105m = (byte) 0;
                    this.f501bs = -1;
                    m207a(1, true);
                    if (this.f519d.f90i) {
                        this.f533h = (short) 270;
                        this.f432au = (byte) 0;
                    }
                    if (this.f519d.f94j < 0) {
                        m133ag();
                    }
                }
                this.f519d.f120r = (byte) -1;
                if (this.f425ar >= 0) {
                    if (this.f519d.f120r != 4) {
                    }
                    m132af();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: af */
    private void m132af() {
        if (this.f448az == 3 && ((this.f409aj >= 74 && this.f411ak >= 73) || (this.f411ak >= 70 && this.f409aj <= 7))) {
            this.f338G = false;
            return;
        }
        if (this.f425ar >= 121) {
            this.f338G = m158b((int) this.f409aj, (int) this.f411ak);
            return;
        }
        this.f338G = false;
        byte b = this.f519d.f92i[18][this.f425ar];
        byte b2 = this.f519d.f92i[19][this.f425ar];
        if (this.f409aj + b > this.f452b.f314x || this.f411ak + b2 > this.f452b.f318y) {
            return;
        }
        int i = this.f519d.f109n * 50;
        while (true) {
            i++;
            if (i > (this.f519d.f109n + 1) * 50 || this.f338G) {
                return;
            }
            if (((this.f371aD[i + 5454] + 1) & 255) > 1 && (this.f371aD[i + 6060] & 1) == 0 && this.f365aB[this.f546p[94] + this.f371aD[i + 5656]] % 3 == 0) {
                this.f338G = (((this.f409aj + (b / 2)) - this.f371aD[i + 5252]) * ((this.f409aj + (b / 2)) - this.f371aD[i + 5252])) + (((this.f411ak + (b2 / 2)) - this.f371aD[i + 5353]) * ((this.f411ak + (b2 / 2)) - this.f371aD[i + 5353])) <= this.f422ap[this.f519d.f109n] * this.f422ap[this.f519d.f109n];
            }
        }
    }

    /* JADX INFO: renamed from: ag */
    private void m133ag() {
        this.f426ar[0] = -2;
        this.f469bM = 1;
        if (this.f519d.f113o == 1) {
            m192l(1);
            this.f469bM = this.f468bL;
        }
    }

    /* JADX INFO: renamed from: ah */
    private void m134ah() {
        if (this.f409aj > 0) {
            this.f409aj = (byte) (this.f409aj - 1);
            if (this.f409aj < this.f452b.f323z + 1 && this.f452b.f323z > 0) {
                C0005f c0005f = this.f452b;
                c0005f.f323z = (byte) (c0005f.f323z - 1);
                for (int i = 10; i > 0; i--) {
                    for (int i2 = 0; i2 < 18; i2++) {
                        this.f341H[i2][i] = this.f341H[i2][i - 1];
                    }
                }
                for (int i3 = 0; i3 < 18; i3++) {
                    this.f341H[i3][0] = -1;
                }
                for (int i4 = 0; i4 < 50; i4++) {
                    if (this.f339G[1][i4] != -1) {
                        byte[] bArr = this.f339G[2];
                        bArr[i4] = (byte) (bArr[i4] + 1);
                        if (this.f339G[2][i4] >= 11) {
                            byte[] bArr2 = this.f339G[1];
                            this.f339G[6][i4] = -1;
                            bArr2[i4] = -1;
                        }
                    }
                }
                if (this.f519d.f81g) {
                    this.f519d.f80g = -15;
                }
                this.f407ai = this.f407ai != -1 ? (byte) 4 : (byte) 0;
            }
            if (this.f519d.f81g) {
                this.f398aT = -15;
            }
        }
    }

    /* JADX INFO: renamed from: ai */
    private void m135ai() {
        if ((this.f425ar >= 0 ? this.f519d.f92i[18][this.f425ar] - 1 : 0) + this.f409aj < this.f452b.f314x - 1) {
            this.f409aj = (byte) (this.f409aj + 1);
            if ((this.f425ar >= 0 ? this.f519d.f92i[18][this.f425ar] - 1 : 0) + this.f409aj >= (this.f452b.f323z + 8) - 1 && this.f452b.f323z + 8 < this.f452b.f314x) {
                C0005f c0005f = this.f452b;
                c0005f.f323z = (byte) (c0005f.f323z + 1);
                for (int i = 0; i < 10; i++) {
                    for (int i2 = 0; i2 < 18; i2++) {
                        this.f341H[i2][i] = this.f341H[i2][i + 1];
                    }
                }
                for (int i3 = 0; i3 < 18; i3++) {
                    this.f341H[i3][10] = -1;
                }
                for (int i4 = 0; i4 < 50; i4++) {
                    if (this.f339G[1][i4] != -1) {
                        byte[] bArr = this.f339G[2];
                        bArr[i4] = (byte) (bArr[i4] - 1);
                        if (this.f339G[2][i4] < 0) {
                            byte[] bArr2 = this.f339G[1];
                            this.f339G[6][i4] = -1;
                            bArr2[i4] = -1;
                        }
                    }
                }
                if (this.f519d.f81g) {
                    this.f519d.f80g = 15;
                }
                this.f407ai = this.f407ai == -1 ? (byte) 1 : (byte) 4;
            }
            if (this.f519d.f81g) {
                this.f398aT = 15;
            }
        }
    }

    /* JADX INFO: renamed from: aj */
    private void m136aj() {
        if (this.f411ak > 0) {
            this.f411ak = (byte) (this.f411ak - 1);
            if ((this.f411ak < this.f452b.f147A + 3 || (this.f448az == 2 && this.f452b.f229aa == 2)) && this.f452b.f147A > 0) {
                C0005f c0005f = this.f452b;
                c0005f.f147A = (byte) (c0005f.f147A - 1);
                for (int i = 0; i < 11; i++) {
                    for (int i2 = 17; i2 > 0; i2--) {
                        this.f341H[i2][i] = this.f341H[i2 - 1][i];
                    }
                }
                for (int i3 = 0; i3 < 11; i3++) {
                    this.f341H[0][i3] = -1;
                }
                for (int i4 = 0; i4 < 50; i4++) {
                    if (this.f339G[1][i4] != -1) {
                        byte[] bArr = this.f339G[3];
                        bArr[i4] = (byte) (bArr[i4] + 1);
                        if (this.f339G[3][i4] >= 18) {
                            byte[] bArr2 = this.f339G[1];
                            this.f339G[6][i4] = -1;
                            bArr2[i4] = -1;
                        }
                    }
                }
                if (this.f519d.f81g) {
                    this.f519d.f84h = -10;
                }
                this.f407ai = this.f407ai != -1 ? (byte) 4 : (byte) 2;
            }
            if (this.f519d.f81g) {
                this.f399aU = -10;
            }
        }
    }

    /* JADX INFO: renamed from: ak */
    private void m137ak() {
        if ((this.f425ar >= 0 ? this.f519d.f92i[19][this.f425ar] - 1 : 0) + this.f411ak < this.f452b.f318y - 1) {
            this.f411ak = (byte) (this.f411ak + 1);
            if ((this.f425ar >= 0 ? this.f519d.f92i[19][this.f425ar] - 1 : 0) + this.f411ak >= (this.f452b.f147A + this.f452b.f191O) - 2 && this.f452b.f147A + this.f452b.f191O < this.f452b.f318y) {
                C0005f c0005f = this.f452b;
                c0005f.f147A = (byte) (c0005f.f147A + 1);
                for (int i = 0; i < 11; i++) {
                    for (int i2 = 0; i2 < 17; i2++) {
                        this.f341H[i2][i] = this.f341H[i2 + 1][i];
                    }
                }
                for (int i3 = 0; i3 < 11; i3++) {
                    this.f341H[17][i3] = -1;
                }
                for (int i4 = 0; i4 < 50; i4++) {
                    if (this.f339G[1][i4] != -1) {
                        byte[] bArr = this.f339G[3];
                        bArr[i4] = (byte) (bArr[i4] - 1);
                        if (this.f339G[3][i4] < 0) {
                            byte[] bArr2 = this.f339G[1];
                            this.f339G[6][i4] = -1;
                            bArr2[i4] = -1;
                        }
                    }
                }
                if (this.f519d.f81g) {
                    this.f519d.f84h = 10;
                }
                this.f407ai = this.f407ai == -1 ? (byte) 3 : (byte) 4;
            }
            if (this.f519d.f81g) {
                this.f399aU = 10;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x023b  */
    /* JADX WARN: Code duplicated, block: B:116:0x025b  */
    /* JADX WARN: Code duplicated, block: B:118:0x025f  */
    /* JADX WARN: Code duplicated, block: B:120:0x027a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0290  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02da  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:130:0x0304  */
    /* JADX WARN: Code duplicated, block: B:131:0x0307  */
    /* JADX WARN: Code duplicated, block: B:133:0x030d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0351  */
    /* JADX WARN: Code duplicated, block: B:141:0x0374  */
    /* JADX WARN: Code duplicated, block: B:143:0x0380  */
    /* JADX WARN: Code duplicated, block: B:144:0x0383  */
    /* JADX WARN: Code duplicated, block: B:145:0x0390  */
    /* JADX WARN: Code duplicated, block: B:146:0x039d  */
    /* JADX WARN: Code duplicated, block: B:148:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2  */
    /* JADX INFO: renamed from: al */
    private void m138al() {
        boolean z;
        byte b;
        byte b2;
        short s;
        byte b3;
        if (this.f519d.f110n <= 0 || this.f519d.f110n > 2) {
            switch (this.f519d.f120r) {
                case 0:
                    if (this.f526f == 135 || this.f526f == 136 || this.f526f == 137) {
                        this.f508bz = -1;
                        byte b4 = this.f365aB[this.f546p[(this.f484bb << 1) + 95] + this.f365aB[this.f546p[(this.f484bb << 1) + 96] + this.f412ak[this.f484bb]] + this.f486bd];
                        switch (this.f526f) {
                            case 135:
                                this.f508bz = b4 + 158;
                                break;
                            case 136:
                                this.f508bz = b4 + 138;
                                break;
                            case 137:
                                this.f508bz = this.f486bd + 172;
                                break;
                        }
                        this.f501bs = -1;
                        if (this.f508bz >= 0) {
                            this.f340H = true;
                            this.f530g = this.f526f;
                            this.f526f = (short) 139;
                            this.f498bp = -1;
                            this.f500br = -1;
                            this.f345K = true;
                        }
                    }
                    this.f519d.f120r = (byte) -1;
                    break;
                case 1:
                    if (this.f526f != 135) {
                        if (this.f526f == 145) {
                            if (this.f526f != 135 || this.f526f == 136 || this.f526f == 137) {
                                this.f340H = true;
                                this.f501bs = -1;
                                this.f530g = this.f526f;
                                this.f526f = (short) 139;
                                this.f508bz = 89;
                                this.f498bp = -1;
                                this.f500br = -1;
                                this.f332D = true;
                                this.f345K = true;
                            }
                            if (this.f526f == 145 && this.f365aB[this.f546p[67] + this.f519d.f120r] <= this.f487be) {
                                this.f486bd = this.f365aB[this.f546p[67] + this.f519d.f120r] - 1;
                                m147au();
                                this.f526f = (short) -1;
                            }
                            this.f519d.f120r = (byte) -1;
                        }
                        this.f519d.f120r = (byte) -1;
                    } else {
                        this.f536i = this.f359a;
                        this.f519d.f120r = (byte) -1;
                        if (this.f519d.f90i) {
                            this.f533h = (short) 271;
                            this.f432au = (byte) 0;
                        }
                        this.f526f = (short) -1;
                    }
                    break;
                case 2:
                    if (!this.f453b.f572W) {
                        this.f453b.f598cp--;
                    }
                    if (this.f526f == 135 && this.f414al[this.f486bd] < this.f365aB[this.f546p[132] + this.f367aC]) {
                        byte[] bArr = this.f414al;
                        int i = this.f486bd;
                        bArr[i] = (byte) (bArr[i] + 1);
                    }
                    this.f410aj[12] = 0;
                    break;
                case 3:
                    if (this.f526f != 135) {
                    }
                    this.f340H = true;
                    this.f501bs = -1;
                    this.f530g = this.f526f;
                    this.f526f = (short) 139;
                    this.f508bz = 89;
                    this.f498bp = -1;
                    this.f500br = -1;
                    this.f332D = true;
                    this.f345K = true;
                    this.f519d.f120r = (byte) -1;
                    break;
                case 4:
                    if (this.f526f == 137) {
                        if (this.f371aD[6868 - this.f359a] < 0 && m215b(this.f486bd, -1) >= 0) {
                            this.f486bd = m215b(this.f486bd, -1);
                            this.f345K = true;
                        }
                    } else if (!this.f332D && this.f486bd > 0) {
                        this.f486bd--;
                    }
                    this.f410aj[10] = 0;
                    break;
                case 5:
                    if (!this.f332D) {
                        if (this.f526f == 145) {
                            m147au();
                        }
                        if (this.f329B) {
                            this.f329B = false;
                            this.f499bq = -12;
                            this.f497bo = -12;
                            this.f501bs = -12;
                            this.f519d.f105m = (byte) 0;
                            this.f405ag = (byte) 3;
                            this.f391aN = this.f367aC;
                            m207a(34, true);
                            this.f407ai = (byte) 4;
                            this.f519d.f120r = (byte) -1;
                            z = true;
                        } else {
                            if (this.f332D) {
                                this.f452b.m100a((byte) (-this.f359a), this.f371aD[5454 - this.f359a] & 255);
                                this.f530g = (short) -1;
                                if (this.f519d.f94j < 0) {
                                    this.f426ar[0] = 7;
                                    this.f426ar[1] = (byte) (-this.f359a);
                                    this.f469bM = 2;
                                }
                            }
                            if (this.f526f == 136) {
                                this.f427as = this.f365aB[this.f546p[(this.f484bb << 1) + 95] + this.f365aB[this.f546p[(this.f484bb << 1) + 96] + this.f412ak[this.f484bb]] + this.f486bd];
                                this.f425ar = this.f452b.f210U[this.f427as];
                                if (this.f425ar < 15) {
                                    s = this.f519d.f63c[this.f519d.f109n][1];
                                    if (this.f379aH != 2) {
                                        b3 = this.f365aB[this.f546p[133] + this.f367aC];
                                    } else {
                                        b3 = 51;
                                    }
                                    if (s >= b3) {
                                        this.f425ar = (byte) -1;
                                        this.f340H = true;
                                        this.f501bs = -1;
                                        this.f526f = (short) 139;
                                        this.f508bz = 30;
                                        this.f498bp = 136;
                                        this.f500br = 136;
                                        this.f329B = true;
                                        this.f345K = true;
                                        z = true;
                                    } else if (this.f425ar < 15 || this.f519d.f63c[this.f519d.f109n][1] < 50) {
                                        this.f371aD[6868 - this.f359a] = (byte) this.f486bd;
                                        this.f338G = true;
                                        byte b5 = this.f409aj;
                                        int i2 = this.f452b.f323z + 1;
                                        int i3 = this.f452b.f323z + 8;
                                        if (this.f425ar >= 121) {
                                            b = 1;
                                        } else {
                                            b = this.f519d.f92i[18][this.f425ar];
                                        }
                                        this.f409aj = (byte) C0005f.m57a((int) b5, i2, (i3 - b) - 1);
                                        byte b6 = this.f411ak;
                                        int i4 = this.f452b.f147A + 1;
                                        int i5 = this.f452b.f191O + this.f452b.f147A;
                                        if (this.f425ar >= 121) {
                                            b2 = 1;
                                        } else {
                                            b2 = this.f519d.f92i[19][this.f425ar];
                                        }
                                        this.f411ak = (byte) C0005f.m57a((int) b6, i4, (i5 - b2) - 1);
                                        z = false;
                                    } else {
                                        this.f425ar = (byte) -1;
                                        this.f340H = true;
                                        this.f501bs = -1;
                                        this.f526f = (short) 139;
                                        this.f508bz = 37;
                                        this.f345K = true;
                                        z = true;
                                    }
                                } else {
                                    if (this.f425ar < 15) {
                                    }
                                    this.f371aD[6868 - this.f359a] = (byte) this.f486bd;
                                    this.f338G = true;
                                    byte b7 = this.f409aj;
                                    int i6 = this.f452b.f323z + 1;
                                    int i7 = this.f452b.f323z + 8;
                                    if (this.f425ar >= 121) {
                                        b = 1;
                                    } else {
                                        b = this.f519d.f92i[18][this.f425ar];
                                    }
                                    this.f409aj = (byte) C0005f.m57a((int) b7, i6, (i7 - b) - 1);
                                    byte b8 = this.f411ak;
                                    int i8 = this.f452b.f147A + 1;
                                    int i9 = this.f452b.f191O + this.f452b.f147A;
                                    if (this.f425ar >= 121) {
                                        b2 = 1;
                                    } else {
                                        b2 = this.f519d.f92i[19][this.f425ar];
                                    }
                                    this.f411ak = (byte) C0005f.m57a((int) b8, i8, (i9 - b2) - 1);
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                        }
                        if (!z || m184g()) {
                        }
                        this.f329B = false;
                        if (this.f526f == 137 && this.f371aD[6868 - this.f359a] < 0) {
                            this.f371aD[6565 - this.f359a] = (byte) this.f486bd;
                        }
                        if (this.f530g >= 0) {
                            if (this.f526f == 139 && this.f530g == 135 && !this.f332D) {
                                this.f486bd = 0;
                            }
                            this.f526f = this.f530g;
                            this.f530g = (short) -1;
                            this.f345K = true;
                            this.f332D = false;
                            this.f519d.f120r = (byte) -1;
                        } else {
                            if (this.f526f != 145) {
                                if (this.f519d.f90i) {
                                    this.f533h = (short) 271;
                                    this.f432au = (byte) 0;
                                }
                                this.f332D = false;
                            }
                            this.f526f = (short) -1;
                        }
                        this.f519d.f120r = (byte) -1;
                    }
                    break;
                case 6:
                    if (this.f526f == 137) {
                        if (this.f371aD[6868 - this.f359a] < 0 && m215b(this.f486bd, 1) >= 0) {
                            this.f486bd = m215b(this.f486bd, 1);
                            this.f345K = true;
                        }
                    } else if (!this.f332D && this.f486bd < this.f487be - 1) {
                        this.f486bd++;
                    }
                    this.f410aj[11] = 0;
                    break;
                case 7:
                case 9:
                    if (this.f526f == 145) {
                        this.f486bd = this.f365aB[this.f546p[67] + this.f519d.f120r] - 1;
                        m147au();
                        this.f526f = (short) -1;
                    }
                    this.f519d.f120r = (byte) -1;
                    break;
                case 8:
                    if (!this.f453b.f573X) {
                        this.f453b.f598cp++;
                    }
                    if (this.f526f == 135 && this.f414al[this.f486bd] > 0) {
                        byte[] bArr2 = this.f414al;
                        int i10 = this.f486bd;
                        bArr2[i10] = (byte) (bArr2[i10] - 1);
                    }
                    this.f410aj[13] = 0;
                    break;
                case 10:
                    if (this.f329B) {
                        this.f329B = false;
                        this.f499bq = -12;
                        this.f497bo = -12;
                        this.f501bs = -12;
                        this.f519d.f105m = (byte) 0;
                        this.f405ag = (byte) 3;
                        this.f391aN = this.f367aC;
                        m207a(34, true);
                        this.f407ai = (byte) 4;
                        this.f519d.f120r = (byte) -1;
                        z = true;
                    } else {
                        if (this.f332D) {
                            this.f452b.m100a((byte) (-this.f359a), this.f371aD[5454 - this.f359a] & 255);
                            this.f530g = (short) -1;
                            if (this.f519d.f94j < 0) {
                                this.f426ar[0] = 7;
                                this.f426ar[1] = (byte) (-this.f359a);
                                this.f469bM = 2;
                            }
                        }
                        if (this.f526f == 136) {
                            this.f427as = this.f365aB[this.f546p[(this.f484bb << 1) + 95] + this.f365aB[this.f546p[(this.f484bb << 1) + 96] + this.f412ak[this.f484bb]] + this.f486bd];
                            this.f425ar = this.f452b.f210U[this.f427as];
                            if (this.f425ar < 15) {
                                s = this.f519d.f63c[this.f519d.f109n][1];
                                if (this.f379aH != 2) {
                                    b3 = this.f365aB[this.f546p[133] + this.f367aC];
                                } else {
                                    b3 = 51;
                                }
                                if (s >= b3) {
                                    this.f425ar = (byte) -1;
                                    this.f340H = true;
                                    this.f501bs = -1;
                                    this.f526f = (short) 139;
                                    this.f508bz = 30;
                                    this.f498bp = 136;
                                    this.f500br = 136;
                                    this.f329B = true;
                                    this.f345K = true;
                                    z = true;
                                } else {
                                    if (this.f425ar < 15) {
                                    }
                                    this.f371aD[6868 - this.f359a] = (byte) this.f486bd;
                                    this.f338G = true;
                                    byte b9 = this.f409aj;
                                    int i11 = this.f452b.f323z + 1;
                                    int i12 = this.f452b.f323z + 8;
                                    if (this.f425ar >= 121) {
                                        b = 1;
                                    } else {
                                        b = this.f519d.f92i[18][this.f425ar];
                                    }
                                    this.f409aj = (byte) C0005f.m57a((int) b9, i11, (i12 - b) - 1);
                                    byte b10 = this.f411ak;
                                    int i13 = this.f452b.f147A + 1;
                                    int i14 = this.f452b.f191O + this.f452b.f147A;
                                    if (this.f425ar >= 121) {
                                        b2 = 1;
                                    } else {
                                        b2 = this.f519d.f92i[19][this.f425ar];
                                    }
                                    this.f411ak = (byte) C0005f.m57a((int) b10, i13, (i14 - b2) - 1);
                                    z = false;
                                }
                            } else {
                                if (this.f425ar < 15) {
                                }
                                this.f371aD[6868 - this.f359a] = (byte) this.f486bd;
                                this.f338G = true;
                                byte b11 = this.f409aj;
                                int i15 = this.f452b.f323z + 1;
                                int i16 = this.f452b.f323z + 8;
                                if (this.f425ar >= 121) {
                                    b = 1;
                                } else {
                                    b = this.f519d.f92i[18][this.f425ar];
                                }
                                this.f409aj = (byte) C0005f.m57a((int) b11, i15, (i16 - b) - 1);
                                byte b12 = this.f411ak;
                                int i17 = this.f452b.f147A + 1;
                                int i18 = this.f452b.f191O + this.f452b.f147A;
                                if (this.f425ar >= 121) {
                                    b2 = 1;
                                } else {
                                    b2 = this.f519d.f92i[19][this.f425ar];
                                }
                                this.f411ak = (byte) C0005f.m57a((int) b12, i17, (i18 - b2) - 1);
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (!z) {
                    }
                    break;
                case 11:
                    this.f329B = false;
                    if (this.f526f == 137) {
                        this.f371aD[6565 - this.f359a] = (byte) this.f486bd;
                    }
                    if (this.f530g >= 0) {
                        if (this.f526f == 139) {
                            this.f486bd = 0;
                        }
                        this.f526f = this.f530g;
                        this.f530g = (short) -1;
                        this.f345K = true;
                        this.f332D = false;
                        this.f519d.f120r = (byte) -1;
                    } else {
                        if (this.f526f != 145) {
                            if (this.f519d.f90i) {
                                this.f533h = (short) 271;
                                this.f432au = (byte) 0;
                            }
                            this.f332D = false;
                        }
                        this.f526f = (short) -1;
                    }
                    this.f519d.f120r = (byte) -1;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: am */
    private void m139am() {
        this.f526f = this.f530g;
        this.f530g = (short) -1;
        this.f359a = (short) this.f497bo;
        this.f486bd = this.f498bp;
        if (this.f526f == 139) {
            this.f340H = true;
            this.f508bz = this.f400aV;
        }
        if (this.f526f == 139 || this.f526f == 137) {
            this.f345K = true;
        }
    }

    /* JADX INFO: renamed from: an */
    private void m140an() {
        switch (this.f519d.f120r) {
            case -1:
            case 0:
            case 7:
            case 9:
            default:
                return;
            case 1:
            case 3:
                this.f467bK = (this.f519d.f120r + 1) / 2;
                this.f407ai = (byte) 4;
                this.f519d.f120r = (byte) -1;
                return;
            case 2:
                if (this.f466bJ > 0) {
                    this.f466bJ = Math.max(this.f466bJ - (this.f519d.f110n != 0 ? 2 : 1), 0);
                    if (this.f464bH <= 0 || this.f466bJ - this.f464bH >= 5) {
                        return;
                    }
                    this.f464bH -= 20;
                    this.f407ai = (byte) 2;
                    return;
                }
                return;
            case 4:
                if (this.f465bI > 0) {
                    this.f465bI = Math.max(this.f465bI - (this.f519d.f110n != 0 ? 2 : 1), 0);
                    if (this.f463bG <= 0 || this.f465bI - this.f463bG >= 5) {
                        return;
                    }
                    this.f463bG -= 20;
                    this.f407ai = (byte) 0;
                    return;
                }
                return;
            case 5:
            case 10:
                this.f409aj = (byte) this.f465bI;
                this.f411ak = (byte) this.f466bJ;
                byte b = this.f452b.f323z;
                byte b2 = this.f452b.f147A;
                this.f452b.f323z = (byte) C0005f.m57a(this.f409aj - 4, 0, this.f452b.f314x - 8);
                this.f452b.f147A = (byte) C0005f.m57a(this.f411ak - (this.f452b.f191O / 2), 0, this.f452b.f318y - this.f452b.f191O);
                m162c(this.f452b.f323z - b, this.f452b.f147A - b2);
                m148av();
                if (this.f425ar >= 0) {
                    m132af();
                }
                break;
            case 6:
                if (this.f465bI < this.f452b.f314x - 1) {
                    this.f465bI = Math.min((this.f519d.f110n == 0 ? 1 : 2) + this.f465bI, this.f452b.f314x - 1);
                    if (this.f463bG >= this.f452b.f314x - (this.f459bC / this.f467bK) || (this.f463bG + (this.f459bC / this.f467bK)) - this.f465bI >= 5) {
                        return;
                    }
                    this.f463bG += 20;
                    this.f407ai = (byte) 1;
                    return;
                }
                return;
            case 8:
                if (this.f466bJ < this.f452b.f318y - 1) {
                    this.f466bJ = Math.min((this.f519d.f110n != 0 ? 2 : 1) + this.f466bJ, this.f452b.f318y - 1);
                    if (this.f464bH >= this.f452b.f318y - (this.f460bD / this.f467bK) || (this.f464bH + (this.f460bD / this.f467bK)) - this.f466bJ >= 5) {
                        return;
                    }
                    this.f464bH += 20;
                    this.f407ai = (byte) 3;
                    return;
                }
                return;
            case 11:
                break;
        }
        this.f407ai = (byte) 4;
        this.f519d.f105m = (byte) 1;
        this.f347M = true;
        this.f519d.f120r = (byte) -1;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0392  */
    /* JADX WARN: Code duplicated, block: B:181:0x039a  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d3  */
    /* JADX INFO: renamed from: ao */
    private void m141ao() {
        boolean z;
        int iM160c;
        int iM160c2;
        if ((this.f501bs == 67 || (this.f501bs == 71 && this.f450b.f5a == null && this.f519d.f123s && this.f519d.f113o == 0)) && this.f450b.f0a == -1) {
            this.f450b.f0a = (byte) 0;
            this.f519d.f124t = (byte) 6;
            this.f519d.f120r = (byte) -1;
            z = true;
        } else if (this.f501bs == 69) {
            if (!this.f450b.m6b()) {
                m207a(68, true);
            } else if (this.f450b.f14b.size() > 0) {
                m207a(81, true);
            } else {
                m207a(70, true);
                this.f494bl = -1;
            }
            this.f519d.f120r = (byte) -1;
            z = true;
        } else if (this.f501bs == 71 && this.f450b.f5a == null && this.f519d.f123s && this.f519d.f113o == 1) {
            if (this.f450b.m6b() && this.f450b.f14b.size() > 0) {
                for (int i = 0; i < this.f450b.f14b.size(); i++) {
                    if (this.f519d.f106m == m112a((String) this.f450b.f14b.elementAt(i)) && this.f450b.m5a(i)) {
                        this.f450b.f0a = (byte) 2;
                        this.f519d.f124t = (byte) 1;
                    }
                }
            }
            if (this.f519d.f124t != 1) {
                m207a(74, true);
            }
            this.f519d.f120r = (byte) -1;
            z = true;
        } else if (this.f496bn != 0) {
            this.f496bn = 0;
            z = true;
        } else if (this.f533h >= 0) {
            this.f519d.f120r = (byte) -1;
            z = true;
        } else if (this.f501bs != 18 || this.f366aC == 0) {
            z = false;
        } else {
            this.f519d.f120r = (byte) -1;
            z = true;
        }
        if (z) {
        }
        if (this.f519d.f110n <= 0 || this.f519d.f110n > 2) {
            short s = this.f365aB[this.f546p[80] + (this.f365aB[this.f546p[81] + this.f501bs] & 255) + this.f486bd];
            boolean z2 = (this.f365aB[(this.f546p[81] + this.f501bs) + 1] & 255) - (this.f365aB[this.f546p[81] + this.f501bs] & 255) > 0;
            boolean z3 = (this.f365aB[this.f546p[89] + (this.f501bs >> 3)] & (1 << (this.f501bs & 7))) != 0;
            switch (this.f519d.f120r) {
                case 1:
                    this.f519d.f120r = (byte) -1;
                    break;
                case 2:
                    if (z3) {
                        if (!this.f453b.f572W) {
                            this.f453b.f598cp--;
                        }
                    } else if (this.f486bd > 0 && (iM160c2 = m160c(this.f486bd, -1)) >= 0) {
                        this.f486bd = iM160c2;
                        if (this.f486bd < this.f490bh) {
                            this.f490bh = this.f486bd;
                        }
                        this.f496bn = this.f519d.f85h ? 1 : 0;
                    }
                    this.f410aj[12] = 0;
                    break;
                case 3:
                    this.f519d.f120r = (byte) -1;
                    break;
                case 5:
                case 10:
                    this.f410aj[14] = 0;
                    if (!this.f350P && this.f501bs != 52) {
                        if (this.f501bs == 48) {
                            this.f519d.f116p = (byte) this.f486bd;
                        } else {
                            if (this.f501bs == 60) {
                                this.f519d.f53b = null;
                            }
                            m209aC();
                            if (!this.f350P) {
                            }
                        }
                    }
                    if (!m186h()) {
                        if (z2 && (this.f365aB[this.f546p[83] + s] < 0 || !m207a(this.f365aB[this.f546p[83] + s], true))) {
                            byte b = this.f365aB[this.f546p[80] + (this.f365aB[this.f546p[81] + this.f501bs] & 255) + this.f486bd];
                            switch (this.f365aB[this.f546p[83] + b]) {
                                case -18:
                                case -17:
                                case -15:
                                case -14:
                                case -13:
                                case -12:
                                case -11:
                                case -10:
                                case -9:
                                case -8:
                                    m161c(b);
                                    break;
                                case -7:
                                case -2:
                                    switch (this.f365aB[b + this.f546p[83]]) {
                                        case -7:
                                            this.f360aA = (byte) -1;
                                            this.f345K = true;
                                            if (this.f519d.f90i) {
                                                this.f533h = (short) 271;
                                                this.f432au = (byte) 0;
                                            } else {
                                                this.f519d.f105m = (byte) 1;
                                                this.f407ai = (byte) 4;
                                                if (this.f530g >= 0) {
                                                    m139am();
                                                }
                                            }
                                            break;
                                        case -2:
                                            if (this.f379aH == 0) {
                                                this.f381aI = this.f361aA;
                                            } else if (this.f379aH == 1) {
                                                this.f381aI = this.f364aB;
                                            } else {
                                                this.f381aI = 0;
                                            }
                                            if (this.f379aH != 0) {
                                                this.f448az = this.f379aH == 1 ? this.f439aw : this.f442ax;
                                                if (this.f448az >= 0) {
                                                    if (this.f379aH == 2) {
                                                        this.f519d.f113o = (byte) 0;
                                                    }
                                                    this.f334E = false;
                                                    m128aa();
                                                    m183g(true);
                                                    if (this.f379aH == 2) {
                                                        this.f348N = true;
                                                        if (this.f501bs == 22) {
                                                            this.f519d.f127u = false;
                                                            this.f426ar[0] = -6;
                                                            this.f450b.f1a = 1;
                                                            this.f450b.f0a = (byte) 1;
                                                            this.f519d.f124t = (byte) 9;
                                                            this.f469bM = 0;
                                                        }
                                                        m207a(67, true);
                                                    } else {
                                                        this.f519d.f105m = (byte) 1;
                                                        this.f407ai = (byte) 4;
                                                        this.f519d.f127u = true;
                                                    }
                                                }
                                            } else if (this.f436av > this.f433au) {
                                                this.f448az = this.f436av;
                                                if (this.f448az > this.f365aB[this.f546p[134] + this.f367aC]) {
                                                    this.f501bs = 0;
                                                    this.f497bo = 0;
                                                    this.f498bp = 0;
                                                    this.f499bq = 9;
                                                    this.f500br = 0;
                                                    m207a(29, true);
                                                } else {
                                                    this.f508bz = 0;
                                                    m207a(9, true);
                                                }
                                            } else {
                                                this.f448az = this.f433au;
                                                this.f334E = false;
                                                m128aa();
                                                m183g(true);
                                                if (this.f379aH == 2) {
                                                    this.f348N = true;
                                                    if (this.f501bs == 22) {
                                                        this.f519d.f127u = false;
                                                        this.f426ar[0] = -6;
                                                        this.f450b.f1a = 1;
                                                        this.f450b.f0a = (byte) 1;
                                                        this.f519d.f124t = (byte) 9;
                                                        this.f469bM = 0;
                                                    }
                                                    m207a(67, true);
                                                } else {
                                                    this.f519d.f105m = (byte) 1;
                                                    this.f407ai = (byte) 4;
                                                    this.f519d.f127u = true;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                                case -6:
                                case -5:
                                case -4:
                                case -3:
                                    m167d(b);
                                    break;
                            }
                        }
                        if (this.f501bs == 18) {
                            if (this.f363aB + 1 >= (this.f365aB[(this.f546p[157] + this.f360aA) + 1] & 255) - (this.f365aB[this.f546p[157] + this.f360aA] & 255) || this.f365aB[this.f546p[159] + (this.f365aB[this.f546p[157] + this.f360aA] & 255) + this.f363aB] != this.f365aB[this.f546p[159] + (this.f365aB[this.f546p[157] + this.f360aA] & 255) + this.f363aB + 1]) {
                                this.f366aC = (byte) -1;
                            } else {
                                this.f363aB = (byte) (this.f363aB + 1);
                                this.f508bz = (this.f365aB[this.f546p[157] + this.f360aA] & 255) + this.f363aB;
                                this.f345K = true;
                            }
                        }
                        this.f519d.f120r = (byte) -1;
                    }
                    break;
                case 7:
                    this.f519d.f120r = (byte) -1;
                    break;
                case 8:
                    if (z3) {
                        if (!this.f453b.f573X) {
                            this.f453b.f598cp++;
                        }
                    } else if (this.f486bd < this.f487be - 1 && (iM160c = m160c(this.f486bd, 1)) >= 0) {
                        this.f486bd = iM160c;
                        for (int i2 = 0; i2 < this.f491bi - 1 && iM160c >= 0; i2++) {
                            iM160c = m160c(iM160c, -1);
                        }
                        if (iM160c > this.f490bh) {
                            this.f490bh = iM160c;
                        }
                        this.f496bn = this.f519d.f85h ? -1 : 0;
                    }
                    this.f410aj[13] = 0;
                    break;
                case 9:
                    this.f519d.f120r = (byte) -1;
                    break;
                case 11:
                    this.f410aj[15] = 0;
                    if (!this.f350P && this.f501bs != 53 && this.f501bs != 60 && (this.f365aB[this.f546p[91] + (this.f501bs >> 3)] & (1 << (this.f501bs & 7))) != 0) {
                        m209aC();
                        if (!this.f350P) {
                        }
                    }
                    m142ap();
                    this.f519d.f120r = (byte) -1;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ap */
    private void m142ap() {
        if (this.f501bs == 28) {
            this.f336F = false;
            m127aL();
        }
        if ((this.f501bs == 14 || this.f501bs == 82) && !this.f344J) {
            this.f493bk = 1;
            this.f494bl = this.f501bs == 82 ? 5 : 6;
        }
        if (this.f501bs == 67 || (this.f519d.f123s && this.f501bs == 71)) {
            this.f519d.f124t = (byte) -1;
            this.f450b.m4a();
        }
        if ((this.f501bs == 1 || this.f501bs == 92 || this.f501bs == 17) && this.f519d.f94j < 0) {
            this.f360aA = (byte) -1;
            m207a(this.f519d.f127u ? 71 : 72, false);
            return;
        }
        if (this.f365aB[this.f546p[85] + this.f501bs] == -20) {
            this.f451b.m32q();
            m207a(61, false);
            this.f486bd = 0;
            return;
        }
        if (this.f365aB[this.f546p[85] + this.f501bs] == -12) {
            if (this.f497bo >= 0) {
                m207a(this.f497bo, false);
                this.f486bd = this.f498bp;
                return;
            } else {
                this.f526f = (short) this.f498bp;
                this.f519d.f105m = (byte) 1;
                this.f407ai = (byte) 4;
                return;
            }
        }
        if (this.f501bs != 0 && this.f365aB[this.f546p[85] + this.f501bs] >= -2 && this.f493bk >= 0) {
            m207a(this.f493bk, false);
            return;
        }
        if (this.f365aB[this.f546p[85] + this.f501bs] != -2) {
            if (this.f365aB[this.f546p[85] + this.f501bs] >= 0) {
                if (this.f501bs == 0) {
                    this.f494bl = -1;
                }
                m207a(this.f365aB[this.f546p[85] + this.f501bs], false);
                return;
            }
            return;
        }
        if (this.f374aF >= 0) {
            this.f360aA = this.f374aF;
            this.f374aF = (byte) -1;
            this.f501bs = -1;
            m207a(17, true);
            this.f345K = true;
            return;
        }
        if (this.f501bs == 18 && this.f452b.f170H >= 50) {
            m207a((this.f452b.f167G + 25) - 1, true);
            return;
        }
        if (this.f501bs == 2 && this.f508bz >= 138) {
            this.f486bd = this.f498bp;
        }
        if (!this.f519d.f90i || (this.f501bs == 2 && this.f508bz >= 138)) {
            this.f519d.f105m = (byte) 1;
            this.f407ai = (byte) 4;
            if (this.f530g >= 0) {
                m139am();
            }
        } else {
            this.f533h = (short) 271;
            this.f432au = (byte) 0;
        }
        this.f360aA = (byte) -1;
        this.f366aC = (byte) 0;
        this.f345K = true;
    }

    /* JADX INFO: renamed from: aq */
    private void m143aq() {
        switch (this.f519d.f120r) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (this.f501bs == 46) {
                    if (this.f382aJ == this.f519d.f120r) {
                        this.f384aK = (byte) ((this.f384aK + 1) % (this.f440aw[this.f382aJ + 1] - this.f440aw[this.f382aJ]));
                        this.f434au[this.f380aI - 1] = this.f437av[this.f440aw[this.f382aJ] + this.f384aK];
                        if ((this.f380aI <= 1 || (this.f434au[this.f380aI - 2] & 255) < 192) && (this.f434au[this.f380aI - 1] & 255) >= 224) {
                            byte[] bArr = this.f434au;
                            int i = this.f380aI - 1;
                            bArr[i] = (byte) (bArr[i] - 32);
                        }
                    } else if (this.f380aI < this.f434au.length) {
                        this.f382aJ = this.f519d.f120r;
                        this.f384aK = (byte) 0;
                        byte[] bArr2 = this.f434au;
                        byte b = this.f380aI;
                        this.f380aI = (byte) (b + 1);
                        bArr2[b] = this.f437av[this.f440aw[this.f382aJ]];
                        if ((this.f380aI <= 1 || (this.f434au[this.f380aI - 2] & 255) < 192) && (this.f434au[this.f380aI - 1] & 255) >= 224) {
                            byte[] bArr3 = this.f434au;
                            int i2 = this.f380aI - 1;
                            bArr3[i2] = (byte) (bArr3[i2] - 32);
                        }
                    }
                    this.f534i = C0010k.currentTimeMillis();
                } else {
                    if (this.f380aI < this.f434au.length) {
                        byte[] bArr4 = this.f434au;
                        byte b2 = this.f380aI;
                        this.f380aI = (byte) (b2 + 1);
                        bArr4[b2] = (byte) (this.f519d.f120r + 48);
                    }
                    this.f534i = 0L;
                }
                this.f519d.f120r = (byte) -1;
                break;
            case 10:
                if (this.f501bs == 46) {
                    this.f376aG = this.f380aI;
                    if (this.f376aG < 6) {
                        m207a(43, true);
                        this.f493bk = 46;
                    } else {
                        m127aL();
                        if (this.f379aH == 0) {
                            byte[] bArr5 = this.f443ax;
                            this.f443ax[1] = 0;
                            bArr5[0] = 0;
                            this.f443ax[2] = this.f519d.f63c[0][10] >> 24;
                            this.f443ax[3] = (byte) (this.f519d.f63c[0][10] >> 16);
                            this.f443ax[4] = (byte) (this.f519d.f63c[0][10] >> 8);
                            this.f443ax[5] = (byte) this.f519d.f63c[0][10];
                        } else {
                            this.f443ax[0] = 0;
                            this.f443ax[1] = (byte) this.f541l[(this.f389aM - 7) - 1];
                            this.f443ax[2] = this.f519d.f63c[this.f519d.f109n][9] >> 24;
                            this.f443ax[3] = (byte) (this.f519d.f63c[this.f519d.f109n][9] >> 16);
                            this.f443ax[4] = (byte) (this.f519d.f63c[this.f519d.f109n][9] >> 8);
                            this.f443ax[5] = (byte) this.f519d.f63c[this.f519d.f109n][9];
                        }
                        this.f443ax[6] = this.f376aG;
                        for (int i3 = 0; i3 < this.f376aG; i3++) {
                            this.f443ax[i3 + 7] = this.f428as[i3];
                        }
                        this.f443ax[this.f376aG + 7] = 0;
                        this.f474bR = this.f376aG + 8;
                        this.f443ax[this.f474bR] = 0;
                        for (int i4 = 0; i4 < this.f474bR; i4++) {
                            byte[] bArr6 = this.f443ax;
                            int i5 = this.f474bR;
                            bArr6[i5] = (byte) (bArr6[i5] ^ this.f443ax[i4]);
                        }
                        this.f474bR++;
                        this.f474bR = m152b(this.f443ax, this.f474bR);
                        if (this.f393aO == 0) {
                            this.f535i = "";
                            m207a(53, true);
                        } else {
                            this.f391aN = 5;
                            this.f405ag = (byte) 0;
                            if (m173e((int) this.f405ag, 5) == 0) {
                                m207a(40, true);
                            } else {
                                m207a(41, true);
                            }
                        }
                    }
                } else if (this.f501bs == 84) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < this.f380aI && i7 < 4; i7++) {
                        i6 = (i6 * 10) + (this.f434au[i7] - 48);
                    }
                    int i8 = (i6 - 1000) & 32767;
                    this.f397aS = 1;
                    for (int i9 = 0; i9 < this.f547q[27]; i9++) {
                        this.f397aS *= i8;
                        this.f397aS %= this.f547q[28];
                    }
                    int i10 = this.f397aS ^ this.f375aF;
                    for (int i11 = 0; i11 < 16; i11++) {
                        i10 = (i10 >> 1) | (i10 & 1);
                    }
                    m207a(i10 + 76, true);
                    this.f406ah = (byte) (this.f406ah - i10);
                    this.f375aF = ((i10 ^ 1) | (this.f406ah & 1) | ((this.f406ah >> 1) & 1)) * this.f375aF;
                    m126aJ();
                    m127aL();
                } else {
                    RunnableC0004e runnableC0004e = new RunnableC0004e();
                    runnableC0004e.f142c = "";
                    for (int i12 = 0; i12 < 6; i12++) {
                        runnableC0004e.f142c = new StringBuffer().append(runnableC0004e.f142c).append((char) this.f449az[i12]).toString();
                    }
                    for (int i13 = 0; i13 < this.f380aI; i13++) {
                        runnableC0004e.f142c = new StringBuffer().append(runnableC0004e.f142c).append((char) this.f434au[i13]).toString();
                    }
                    this.f538j = "";
                    for (int i14 = this.f546p[145]; i14 < this.f546p[146]; i14++) {
                        this.f538j = new StringBuffer().append(this.f538j).append((char) this.f365aB[i14]).toString();
                    }
                    this.f538j = new StringBuffer().append(this.f538j).append(this.f522e).toString();
                    this.f538j = new StringBuffer().append(this.f538j).append(this.f430at).toString();
                    runnableC0004e.m33a(this.f519d);
                    while (runnableC0004e.f145x) {
                        Thread.yield();
                        RunnableC0002c.m10a(1000L);
                    }
                    m207a(82, false);
                    this.f486bd = 3;
                }
                this.f519d.f120r = (byte) -1;
                break;
            case 11:
                this.f519d.f120r = (byte) -1;
                this.f534i = 0L;
                if (this.f382aJ >= 0) {
                    this.f382aJ = (byte) -1;
                    this.f380aI = (byte) (this.f380aI - 1);
                } else if (this.f380aI > 0) {
                    this.f380aI = (byte) (this.f380aI - 1);
                } else if (this.f501bs == 46) {
                    m207a(this.f497bo, false);
                    this.f486bd = this.f498bp;
                } else if (this.f501bs == 84) {
                    m207a(83, true);
                    this.f486bd = 1;
                } else {
                    this.f494bl = 4;
                    m207a(82, false);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ar */
    private void m144ar() {
        switch (this.f519d.f120r) {
            case 4:
                this.f342I = true;
                this.f486bd = ((this.f486bd + this.f487be) - 1) % this.f487be;
                this.f519d.f120r = (byte) -1;
                break;
            case 5:
            case 10:
                this.f405ag = (byte) 3;
                this.f391aN = 6;
                this.f394aP = this.f486bd;
                this.f499bq = 62;
                this.f497bo = 62;
                int i = this.f486bd;
                this.f500br = i;
                this.f498bp = i;
                m207a(34, true);
                this.f519d.f120r = (byte) -1;
                break;
            case 6:
                this.f342I = true;
                this.f486bd = ((this.f486bd + this.f487be) + 1) % this.f487be;
                this.f519d.f120r = (byte) -1;
                break;
            case 11:
                m207a(0, false);
                this.f519d.f120r = (byte) -1;
                break;
        }
    }

    /* JADX INFO: renamed from: as */
    private void m145as() {
        this.f435av = (byte) -1;
        if (this.f519d.f90i) {
            this.f533h = (short) 270;
            this.f432au = (byte) 0;
        }
        if ((this.f371aD[6060 - this.f359a] & 1) != 0 || (this.f365aB[this.f546p[94] + this.f371aD[5656 - this.f359a]] < 0 && this.f371aD[5656 - this.f359a] != 4 && this.f371aD[5656 - this.f359a] != 12)) {
            this.f501bs = -1;
            this.f526f = (short) 139;
            this.f508bz = 89;
            this.f340H = true;
            this.f332D = true;
            this.f345K = true;
            return;
        }
        if (this.f371aD[5656 - this.f359a] == 4 || this.f371aD[5656 - this.f359a] == 12) {
            this.f526f = (short) 137;
            this.f486bd = this.f371aD[6868 - this.f359a];
            if (this.f486bd < 0) {
                this.f486bd = this.f371aD[6565 - this.f359a];
            }
            if (this.f519d.f109n == 1 && (this.f486bd < 24 || this.f486bd >= 48)) {
                this.f486bd = 24;
            }
            this.f345K = true;
            return;
        }
        this.f526f = (short) (136 - ((this.f371aD[5656 - this.f359a] & 7) / 2));
        this.f484bb = this.f365aB[this.f546p[94] + this.f371aD[5656 - this.f359a]];
        this.f487be = this.f365aB[(this.f546p[(this.f484bb << 1) + 96] + this.f412ak[this.f484bb]) + 1] - this.f365aB[this.f546p[(this.f484bb << 1) + 96] + this.f412ak[this.f484bb]];
        if (this.f526f == 135) {
            if (!this.f330C && this.f379aH != 2 && this.f519d.f63c[this.f519d.f109n][0] >= this.f365aB[this.f546p[132] + this.f367aC] && this.f367aC < 2) {
                this.f340H = true;
                this.f501bs = -1;
                this.f526f = (short) 139;
                this.f530g = (short) 135;
                this.f508bz = 30;
                this.f498bp = -1;
                this.f500br = -1;
                this.f329B = true;
                this.f345K = true;
                this.f330C = true;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.f487be; i2++) {
                if (this.f371aD[6767 - this.f359a] >= 0 && this.f452b.f181K[this.f371aD[6767 - this.f359a] + i] == i2 && this.f452b.f187M[this.f371aD[6767 - this.f359a] + i] == (-this.f359a)) {
                    this.f414al[i2] = this.f452b.f184L[this.f371aD[6767 - this.f359a] + i];
                    i++;
                } else {
                    this.f414al[i2] = 0;
                }
            }
        }
        if (this.f526f != 139) {
            this.f486bd = Math.max((int) this.f371aD[6868 - this.f359a], 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x02ed  */
    /* JADX INFO: renamed from: at */
    private void m146at() {
        char c;
        short s;
        if (this.f359a > (this.f519d.f109n ^ 1) * 50 && this.f359a <= ((this.f519d.f109n ^ 1) + 1) * 50) {
            c = 1;
        } else if ((-this.f359a) <= (this.f519d.f109n ^ 1) * 50 || (-this.f359a) > ((this.f519d.f109n ^ 1) + 1) * 50) {
            c = (this.f359a < ((this.f519d.f109n ^ 1) * 100) + 1001 || this.f359a >= (((this.f519d.f109n ^ 1) + 1) * 100) + 1001) ? (char) 0 : (char) 3;
        } else {
            c = 2;
        }
        if (this.f519d.f94j < 0) {
            this.f426ar[0] = 0;
            this.f426ar[1] = 0;
            this.f469bM = 2;
        }
        for (int i = 0; i < this.f335E[0][50]; i++) {
            if ((this.f371aD[this.f335E[0][i] + 2929] & 96) == 0) {
                this.f371aD[this.f335E[0][i] + 1717] = (byte) (c == 2 ? this.f337F[3][this.f371aD[this.f335E[0][i] + 2323]] > 1 ? this.f371aD[5252 - this.f359a] : C0005f.m57a((int) this.f371aD[this.f335E[0][i] + 0], (int) this.f371aD[6363 - this.f359a], (this.f371aD[6363 - this.f359a] + this.f519d.f92i[18][this.f371aD[5656 - this.f359a]]) - 1) : this.f413al);
                this.f371aD[this.f335E[0][i] + 1818] = (byte) (c == 2 ? this.f337F[3][this.f371aD[this.f335E[0][i] + 2323]] > 1 ? this.f371aD[5353 - this.f359a] : C0005f.m57a((int) this.f371aD[this.f335E[0][i] + 101], (int) this.f371aD[6464 - this.f359a], (this.f371aD[6464 - this.f359a] + this.f519d.f92i[19][this.f371aD[5656 - this.f359a]]) - 1) : this.f415am);
                this.f371aD[this.f335E[0][i] + 1111] = 0;
                this.f371aD[this.f335E[0][i] + 4545] = 0;
                if (this.f519d.f88i < 2) {
                    s = (c <= 0 || this.f337F[3][this.f371aD[this.f335E[0][i] + 2323]] <= 0 || (((this.f519d.f49a[this.f519d.f109n][1][this.f413al >> 5][this.f415am] >> (this.f413al & 31)) & 1) == 0 && (((this.f519d.f49a[this.f519d.f109n][0][this.f413al >> 5][this.f415am] >> (this.f413al & 31)) & 1) == 0 || c < 2))) ? (short) 0 : c <= 2 ? this.f359a : (short) 126;
                } else if (this.f519d.f88i == 2) {
                    if (c <= 0 || this.f337F[3][this.f371aD[this.f335E[0][i] + 2323]] <= 0) {
                        s = 0;
                    } else {
                        int[] iArr = null;
                        if (((iArr[this.f415am] >> (this.f413al & 31)) & 1) != 0) {
                            s = c <= 2 ? this.f359a : (short) 126;
                        } else {
                            s = 0;
                        }
                    }
                } else if (c <= 0 || this.f337F[3][this.f371aD[this.f335E[0][i] + 2323]] <= 0) {
                    s = 0;
                } else {
                    s = c <= 2 ? this.f359a : (short) 126;
                }
                this.f371aD[this.f335E[0][i] + 1919] = (byte) s;
                this.f371aD[this.f335E[0][i] + 3131] = c == 3 ? (byte) 0 : c == 1 ? this.f371aD[this.f359a + 3030] : this.f371aD[5858 - this.f359a];
                this.f371aD[this.f335E[0][i] + 707] = this.f371aD[this.f335E[0][i] + 404];
                this.f371aD[this.f335E[0][i] + 1515] = 1;
                byte[] bArr = this.f371aD;
                int i2 = this.f335E[0][i] + 2828;
                bArr[i2] = (byte) (bArr[i2] & 191);
                if (this.f519d.f94j < 0) {
                    this.f426ar[this.f469bM] = this.f335E[0][i];
                    this.f426ar[this.f469bM + 1] = this.f371aD[this.f335E[0][i] + 1717];
                    this.f426ar[this.f469bM + 2] = this.f371aD[this.f335E[0][i] + 1818];
                    this.f426ar[this.f469bM + 3] = this.f371aD[this.f335E[0][i] + 1919];
                    this.f426ar[this.f469bM + 4] = this.f371aD[this.f335E[0][i] + 3131];
                    this.f426ar[this.f469bM + 5] = this.f371aD[this.f335E[0][i] + 707];
                    byte[] bArr2 = this.f426ar;
                    bArr2[1] = (byte) (bArr2[1] + 1);
                    this.f469bM += 6;
                }
                m116a(c > 0 ? (short) 248 : (short) 246);
            }
        }
        this.f519d.f122s = (byte) 0;
    }

    /* JADX INFO: renamed from: au */
    private void m147au() {
        switch (this.f486bd) {
            case 0:
                m194m(0);
                this.f435av = this.f409aj;
                this.f438aw = this.f411ak;
                m148av();
                break;
            case 1:
                if (this.f519d.f94j < 0) {
                    this.f426ar[0] = 1;
                    this.f426ar[1] = 0;
                    this.f469bM = 2;
                }
                for (int i = 0; i < this.f335E[0][50]; i++) {
                    byte[] bArr = this.f371aD;
                    int i2 = this.f335E[0][i] + 2828;
                    bArr[i2] = (byte) (bArr[i2] | 64);
                    if (this.f519d.f94j < 0) {
                        this.f426ar[this.f469bM] = this.f335E[0][i];
                        byte[] bArr2 = this.f426ar;
                        bArr2[1] = (byte) (bArr2[1] + 1);
                        this.f469bM++;
                    }
                }
                break;
            case 2:
                if (this.f519d.f94j < 0) {
                    this.f426ar[0] = 2;
                    this.f426ar[1] = 0;
                    this.f469bM = 2;
                }
                for (int i3 = 0; i3 < this.f335E[0][50]; i3++) {
                    if ((this.f371aD[this.f335E[0][i3] + 2929] & 96) == 0 && this.f365aB[this.f546p[52] + this.f371aD[this.f335E[0][i3] + 2323]] >= 0 && ((this.f447az == 0 && this.f365aB[this.f546p[52] + this.f371aD[this.f335E[0][i3] + 2323]] > this.f371aD[this.f335E[0][i3] + 2323]) || (this.f447az == 1 && this.f365aB[this.f546p[52] + this.f371aD[this.f335E[0][i3] + 2323]] < this.f371aD[this.f335E[0][i3] + 2323]))) {
                        byte[] bArr3 = this.f371aD;
                        int i4 = this.f335E[0][i3] + 2929;
                        bArr3[i4] = (byte) (bArr3[i4] | 32);
                        if (this.f519d.f94j < 0) {
                            this.f426ar[this.f469bM] = this.f335E[0][i3];
                            byte[] bArr4 = this.f426ar;
                            bArr4[1] = (byte) (bArr4[1] + 1);
                            this.f469bM++;
                        }
                    }
                }
                break;
            case 3:
                for (int i5 = 0; i5 < this.f335E[0][50]; i5++) {
                    if ((this.f371aD[this.f335E[0][i5] + 2929] & 96) == 0 && this.f365aB[this.f546p[58] + this.f371aD[this.f335E[0][i5] + 2323]] >= 2) {
                        this.f371aD[this.f335E[0][i5] + 1717] = this.f409aj;
                        this.f371aD[this.f335E[0][i5] + 1818] = this.f411ak;
                        this.f371aD[this.f335E[0][i5] + 1919] = 127;
                        this.f371aD[this.f335E[0][i5] + 1111] = 0;
                        this.f371aD[this.f335E[0][i5] + 4545] = 0;
                        this.f371aD[this.f335E[0][i5] + 707] = this.f371aD[this.f335E[0][i5] + 404];
                        this.f371aD[this.f335E[0][i5] + 1515] = 1;
                        m116a((short) 248);
                    }
                }
                break;
        }
        this.f519d.f120r = (byte) -1;
    }

    /* JADX INFO: renamed from: av */
    private void m148av() {
        if (this.f435av < 0) {
            return;
        }
        this.f441ax = (byte) 0;
        for (int iMin = Math.min((int) this.f409aj, (int) this.f435av); iMin <= Math.max((int) this.f409aj, (int) this.f435av); iMin++) {
            for (int iMin2 = Math.min((int) this.f411ak, (int) this.f438aw); iMin2 <= Math.max((int) this.f411ak, (int) this.f438aw); iMin2++) {
                if (this.f542l[iMin2][iMin] > this.f519d.f109n * 50 && this.f542l[iMin2][iMin] <= (this.f519d.f109n + 1) * 50 && this.f371aD[this.f542l[iMin2][iMin] + 1616] > 0) {
                    this.f441ax = (byte) (this.f441ax + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: aw */
    private void m149aw() {
        if (this.f335E[0][50] <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f335E[0][50]; i3++) {
            i2 += this.f371aD[this.f335E[0][i3] + 0];
            i += this.f371aD[this.f335E[0][i3] + 101];
        }
        int i4 = i2 / this.f335E[0][50];
        int i5 = i / this.f335E[0][50];
        byte b = 0;
        int i6 = 1000;
        for (int i7 = 0; i7 < this.f335E[0][50]; i7++) {
            int iAbs = Math.abs(i4 - this.f371aD[this.f335E[0][i7] + 0]) + Math.abs(i5 - this.f371aD[this.f335E[0][i7] + 101]);
            if (iAbs < i6) {
                b = this.f335E[0][i7];
                i6 = iAbs;
            }
        }
        this.f409aj = this.f371aD[b];
        this.f411ak = this.f371aD[b + 101];
        m214ax();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX INFO: renamed from: ay */
    private void m150ay() {
        char c;
        char c2;
        int i = this.f452b.f147A - 4;
        while (true) {
            int i2 = i;
            if (i2 >= this.f452b.f147A + this.f452b.f191O + 2) {
                break;
            }
            if (i2 >= 0 && i2 < this.f452b.f318y) {
                int i3 = this.f452b.f323z - 4;
                while (true) {
                    int i4 = i3;
                    if (i4 < this.f452b.f323z + 8 + 1) {
                        if (i4 >= 0 && i4 < this.f452b.f314x) {
                            if (i4 < this.f452b.f323z - 1 || i2 < this.f452b.f147A - 1 || i4 >= this.f452b.f323z + 8 + 1 || i2 >= this.f452b.f147A + this.f452b.f191O + 1) {
                                c = 0;
                            } else {
                                if (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][0][i4 >> 5][i2] >> (i4 & 31)) & 1) != 0) {
                                    if (this.f519d.f88i == 2) {
                                        int[] iArr = null;
                                        if (((iArr[i2] >> (i4 & 31)) & 1) == 0) {
                                            c2 = 2;
                                        }
                                    }
                                    c2 = (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][1][i4 >> 5][i2] >> (i4 & 31)) & 1) != 0) ? (char) 0 : (char) 1;
                                } else {
                                    c2 = 2;
                                }
                                c = c2;
                            }
                            if (this.f542l[i2][i4] <= 0 || this.f542l[i2][i4] > 100) {
                                m163c(i4, i2, 1);
                            } else if (i4 >= this.f452b.f323z - 1 && i2 >= this.f452b.f147A - 1 && i4 < this.f452b.f323z + 8 + 1 && i2 < this.f452b.f147A + this.f452b.f191O + 1 && (this.f519d.f88i >= 3 || c == 0)) {
                                m169d(this.f542l[i2][i4], (i4 - this.f452b.f323z) * 30, (i2 - this.f452b.f147A) * 20);
                            }
                            if ((this.f519d.f88i >= 3 || c < 2) && i4 >= this.f452b.f323z - 3 && i2 >= this.f452b.f147A - 2 && i4 < this.f452b.f323z + 8 && i2 < this.f452b.f147A + this.f452b.f191O) {
                                byte b = this.f341H[(i2 - this.f452b.f147A) + 2][(i4 - this.f452b.f323z) + 3];
                                while (b >= 0) {
                                    m221o(this.f339G[0][b], this.f339G[4][b] + ((i4 - this.f452b.f323z) * 30), this.f339G[5][b] + ((i2 - this.f452b.f147A) * 20), this.f339G[1][b], -1);
                                    b = this.f339G[6][b];
                                }
                            }
                            if (i4 >= this.f452b.f323z - 1 && i2 >= this.f452b.f147A - 1 && i4 < this.f452b.f323z + 8 + 1 && i2 < this.f452b.f147A + this.f452b.f191O + 1) {
                                if ((this.f519d.f88i >= 3 || c == 0) && i4 >= this.f452b.f323z - 1 && i2 >= this.f452b.f147A - 1 && i4 <= this.f452b.f323z + 8 && i2 <= this.f452b.f147A + this.f452b.f191O) {
                                    m174e(i4 - this.f452b.f323z, i2 - this.f452b.f147A);
                                }
                                if (this.f526f == 135 && this.f371aD[6161 - this.f359a] == i4 && this.f371aD[6262 - this.f359a] == i2) {
                                    m217e(1830, ((i4 - this.f452b.f323z) * 30) - 90, ((i2 - this.f452b.f147A) * 20) - 60);
                                }
                                if (this.f519d.f88i < 2 && c == 1) {
                                    m217e(this.f519d.f88i + 1852, ((i4 - this.f452b.f323z) * 30) - 90, ((i2 - this.f452b.f147A) * 20) - 60);
                                }
                            }
                        }
                        i3 = i4 + 1;
                    }
                }
            }
            i = i2 + 1;
        }
        if (this.f425ar >= 0) {
            this.f455b[this.f429at].setColor(65280);
            int i5 = this.f519d.f109n * 50;
            while (true) {
                i5++;
                if (i5 > (this.f519d.f109n + 1) * 50) {
                    break;
                }
                if (((this.f371aD[i5 + 5454] + 1) & 255) > 1 && (this.f371aD[i5 + 6060] & 1) == 0 && this.f365aB[this.f546p[94] + this.f371aD[i5 + 5656]] % 3 == 0) {
                    for (int i6 = 0; i6 < 20; i6++) {
                        m172d(this.f455b[this.f429at], ((this.f371aD[i5 + 5252] - this.f452b.f323z) * 30) + 15 + ((this.f547q[this.f548r[8] + (i6 << 1)] * this.f422ap[this.f519d.f109n]) / 20), this.f458bB + 10 + ((this.f371aD[i5 + 5353] - this.f452b.f147A) * 20) + ((this.f547q[(this.f548r[8] + (i6 << 1)) + 1] * this.f422ap[this.f519d.f109n]) / 20), ((this.f371aD[i5 + 5252] - this.f452b.f323z) * 30) + 15 + ((this.f547q[(this.f548r[8] + (i6 << 1)) + 2] * this.f422ap[this.f519d.f109n]) / 20), this.f458bB + 10 + ((this.f371aD[i5 + 5353] - this.f452b.f147A) * 20) + ((this.f547q[(this.f548r[8] + (i6 << 1)) + 3] * this.f422ap[this.f519d.f109n]) / 20));
                    }
                }
            }
        }
        if (this.f519d.f88i < 3) {
            m151az();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:80:0x0211 A[PHI: r5 r6
  0x0211: PHI (r5v9 int) = (r5v8 int), (r5v11 int), (r5v11 int), (r5v8 int) binds: [B:11:0x0034, B:32:0x00b8, B:31:0x00b6, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0211: PHI (r6v2 boolean) = (r6v1 boolean), (r6v4 boolean), (r6v4 boolean), (r6v1 boolean) binds: [B:11:0x0034, B:32:0x00b8, B:31:0x00b6, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: az */
    private void m151az() {
        int i;
        char c;
        int i2 = 0;
        boolean z = false;
        for (int i3 = this.f452b.f147A - 1; i3 < this.f452b.f147A + this.f452b.f191O + 1; i3++) {
            if (i3 >= 0 && i3 < this.f452b.f318y) {
                int i4 = this.f452b.f323z - 1;
                int i5 = i2;
                boolean z2 = z;
                while (i4 < this.f452b.f323z + 8 + 1) {
                    if (i4 < 0) {
                        i = i5;
                    } else if (i4 < this.f452b.f314x) {
                        if (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][0][i4 >> 5][i3] >> (i4 & 31)) & 1) != 0) {
                            if (this.f519d.f88i == 2) {
                                int[] iArr = null;
                                if (((iArr[i3] >> (i4 & 31)) & 1) == 0) {
                                    c = 2;
                                }
                            }
                            c = (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][1][i4 >> 5][i3] >> (i4 & 31)) & 1) != 0) ? (char) 0 : (char) 1;
                        } else {
                            c = 2;
                        }
                        if (c == 2 && !z2) {
                            i5 = i4;
                            z2 = true;
                        }
                        if ((c < 2 || i4 + 1 >= this.f452b.f323z + 8 + 1) && z2) {
                            int i6 = (c == 2 ? 1 : 0) + (i4 - i5);
                            this.f455b[this.f429at].setColor(0);
                            m115a(this.f455b[this.f429at], ((i5 - this.f452b.f323z) * 30) + 15, this.f458bB + 10 + ((i3 - this.f452b.f147A) * 20), i6 * 30, 20);
                            i = i5;
                            z2 = false;
                        } else {
                            i = i5;
                        }
                    } else if (z2) {
                        this.f455b[this.f429at].setColor(0);
                        m115a(this.f455b[this.f429at], ((i5 - this.f452b.f323z) * 30) + 15, this.f458bB + 10 + ((i3 - this.f452b.f147A) * 20), ((i4 - i5) + 1) * 30, 20);
                        i = i5;
                        z2 = false;
                    } else {
                        i = i5;
                    }
                    i4++;
                    i5 = i;
                }
                i2 = i5;
                z = z2;
            }
        }
        if (this.f519d.f88i == 0) {
            for (int i7 = this.f452b.f147A - 1; i7 < this.f452b.f147A + this.f452b.f191O + 1; i7++) {
                if (i7 >= 0 && i7 < this.f452b.f318y) {
                    for (int i8 = this.f452b.f323z - 1; i8 < this.f452b.f323z + 8 + 1; i8++) {
                        if (i8 >= 0 && i8 < this.f452b.f314x && ((this.f519d.f49a[this.f519d.f109n][0][i8 >> 5][i7] >> (i8 & 31)) & 1) == 0 && ((i8 > 0 && ((this.f519d.f49a[this.f519d.f109n][0][(i8 - 1) >> 5][i7] >> ((i8 - 1) & 31)) & 1) != 0) || ((i8 < this.f452b.f314x - 1 && ((this.f519d.f49a[this.f519d.f109n][0][(i8 + 1) >> 5][i7] >> ((i8 + 1) & 31)) & 1) != 0) || ((i7 > 0 && ((this.f519d.f49a[this.f519d.f109n][0][i8 >> 5][i7 - 1] >> (i8 & 31)) & 1) != 0) || (i7 < this.f452b.f318y - 1 && ((this.f519d.f49a[this.f519d.f109n][0][i8 >> 5][i7 + 1] >> (i8 & 31)) & 1) != 0))))) {
                            m217e(1851, ((i8 - this.f452b.f323z) * 30) - 90, ((i7 - this.f452b.f147A) * 20) - 60);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m152b(byte[] bArr, int i) {
        byte[] bArr2 = {72, 100, 50, 95, 98, 99, 71, 114, 86, 69, 68, 82, 102, 117, 122, 80, 73, 87, 66, 56, 78, 89, 45, 113, 81, 54, 109, 120, 76, 75, 90, 106, 52, 108, 79, 110, 53, 121, 74, 105, 77, 65, 116, 115, 97, 85, 88, 67, 84, 57, 112, 111, 119, 70, 49, 104, 103, 83, 48, 101, 51, 107, 118, 55};
        if (i <= 0) {
            return 0;
        }
        byte[] bArr3 = new byte[120];
        int i2 = 0;
        for (int i3 = 0; i3 <= (i - 1) / 3; i3++) {
            int iM57a = C0005f.m57a(i - (i3 * 3), 1, 3);
            int i4 = 0;
            for (int i5 = 0; i5 < iM57a; i5++) {
                i4 += (bArr[(i3 * 3) + i5] & 255) << (16 - (i5 << 3));
            }
            for (int i6 = 0; i6 <= iM57a; i6++) {
                bArr3[i2] = bArr2[(i4 >> (18 - (i6 * 6))) & 63];
                i2++;
            }
        }
        for (int i7 = 0; i7 < i2; i7++) {
            bArr[i7] = bArr3[i7];
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    private void m153b(int i, int i2) {
        if (this.f335E[i][50] <= 0) {
            return;
        }
        m194m(i2);
        for (int i3 = 0; i3 < this.f335E[i][50]; i3++) {
            if (i2 > 0) {
                for (int i4 = 1; i4 <= 4; i4++) {
                    if ((this.f371aD[this.f335E[i][i3] + 2929] & (1 << i4)) != 0) {
                        byte[] bArr = this.f371aD;
                        int i5 = this.f335E[i][i3] + 2929;
                        bArr[i5] = (byte) (bArr[i5] & ((1 << i4) ^ (-1)));
                        int i6 = 0;
                        while (i6 < this.f335E[i4][50]) {
                            if (this.f335E[i4][i6] == this.f335E[i][i3]) {
                                while (i6 < this.f335E[i4][50] - 1) {
                                    this.f335E[i4][i6] = this.f335E[i4][i6 + 1];
                                    i6++;
                                }
                                byte[] bArr2 = this.f335E[i4];
                                bArr2[50] = (byte) (bArr2[50] - 1);
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
            this.f335E[i2][i3] = this.f335E[i][i3];
            byte[] bArr3 = this.f371aD;
            int i7 = this.f335E[i2][i3] + 2929;
            bArr3[i7] = (byte) (bArr3[i7] | (1 << i2));
        }
        this.f335E[i2][50] = this.f335E[i][50];
        this.f457bA = Math.max(i, i2);
    }

    /* JADX INFO: renamed from: b */
    private void m154b(int i, int i2, int i3, int i4, int i5) {
        switch (i) {
            case 6:
                m217e((this.f519d.f99k ? 0 : 1) + i3, i4, i5);
                break;
            case 15:
                break;
            default:
                if (this.f519d.f105m != 2) {
                    if (i2 == 1 && this.f410aj[i - 2] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[i - 2], -1);
                    }
                    if (i - 1 != this.f457bA) {
                        if (i2 > 1) {
                            this.f453b.m231a(i4, i5, i2 == 2 ? 1 : 0, new StringBuffer().append((int) (i2 == 2 ? this.f335E[i - 1][50] : this.f365aB[(this.f546p[66] + i) - 2])).toString(), i2 != 2 ? 1 : -1);
                        }
                    } else if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (i2 > 1) {
                        this.f453b.m231a(i4, i5, i2 == 2 ? 1 : 0, new StringBuffer().append((int) (i2 == 2 ? this.f335E[i - 1][50] : this.f365aB[(this.f546p[66] + i) - 2])).toString(), i2 == 2 ? 0 : 2);
                    }
                    break;
                } else if (i > 2 && i < 5 && i2 > 1) {
                    this.f453b.m231a(i4, i5, i2 == 2 ? 1 : 0, i2 == 2 ? i == 3 ? "-" : "+" : new StringBuffer().append((int) this.f365aB[(this.f546p[66] + i) - 3]).toString(), i2 != 2 ? 1 : -1);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m155b(String str) {
        boolean zPlatformRequest = false;
        try {
            zPlatformRequest = this.f519d.f33a.platformRequest(str);
        } catch (Exception e) {
        }
        RunnableC0002c.m10a(100L);
        if (zPlatformRequest) {
            this.f519d.m24b();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m156b(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.drawRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    private void m157b(boolean[] zArr, byte[] bArr, short[] sArr, int[] iArr, int i, int i2, int i3, int i4) {
        try {
            this.f510ca = 1;
            this.f480bX = 0;
            while (this.f480bX < i) {
                this.f510ca <<= 1;
                this.f480bX++;
            }
            this.f510ca--;
            this.f480bX = i2;
            while (this.f480bX < i2 + i3) {
                while (this.f482bZ < i) {
                    this.f537j <<= 8;
                    this.f537j += (long) (m111a() & 255);
                    this.f482bZ += 8;
                }
                this.f481bY = (int) ((this.f537j >> (this.f482bZ - i)) & ((long) this.f510ca));
                this.f481bY -= i4;
                if (zArr != null) {
                    if (this.f481bY > 0) {
                        zArr[this.f480bX] = true;
                    } else {
                        zArr[this.f480bX] = false;
                    }
                } else if (bArr != null) {
                    bArr[this.f480bX] = (byte) this.f481bY;
                } else if (sArr != null) {
                    sArr[this.f480bX] = (short) this.f481bY;
                } else if (iArr != null) {
                    iArr[this.f480bX] = this.f481bY;
                }
                this.f482bZ -= i;
                this.f480bX++;
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m158b(int i, int i2) {
        this.f452b.m99a((byte) i, (byte) i2, 5);
        this.f452b.f221Y = 0;
        return !this.f452b.m102a((byte) i, (byte) i2, -1, 5, 1);
    }

    /* JADX INFO: renamed from: c */
    private int m159c(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = ((this.f426ar[this.f473bQ + i2] & 255) << (((i - 1) - i2) << 3)) + i3;
            i2++;
            i3 = i4;
        }
        this.f473bQ += i;
        return i3;
    }

    /* JADX INFO: renamed from: c */
    private int m160c(int i, int i2) {
        if ((this.f365aB[this.f546p[81] + this.f501bs + 1] & 255) > (this.f365aB[this.f546p[81] + this.f501bs] & 255)) {
            int i3 = (this.f365aB[this.f546p[81] + this.f501bs] & 255) + i;
            while (i3 + i2 >= (this.f365aB[this.f546p[81] + this.f501bs] & 255) && i3 + i2 < (this.f365aB[this.f546p[81] + this.f501bs + 1] & 255)) {
                i3 += i2;
                i += i2;
                if (this.f365aB[this.f546p[80] + i3] >= 64 || ((this.f531h >> this.f365aB[this.f546p[80] + i3]) & 1) != 0) {
                    return i;
                }
            }
        } else {
            int i4 = i + i2;
            if (i4 >= 0 && i4 < this.f487be) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    private void m161c(byte b) {
        int i = 0;
        switch (this.f365aB[this.f546p[83] + b]) {
            case -18:
                m155b("http://wap.gear-games.com/?p=mtog&l=ru");
                break;
            case -17:
                int i2 = (this.f379aH - 1) * 50;
                while (i2 < this.f379aH * 50) {
                    if (this.f541l[i2] >= 0) {
                        if (this.f498bp != i) {
                            i++;
                        }
                    }
                    i2++;
                }
                try {
                    RecordStore.deleteRecordStore(new StringBuffer().append(i2 < 10 ? "aow220" : "aow22").append(i2).toString());
                    break;
                } catch (Exception e) {
                }
                this.f541l[i2] = -1;
                if (this.f379aH == 1 && this.f439aw == i2 + 7 + 1) {
                    this.f439aw = -1;
                } else if (this.f379aH == 2 && this.f442ax == i2 + 7 + 1) {
                    this.f442ax = -1;
                }
                m127aL();
                this.f501bs = 6;
                m207a(57, true);
                break;
            case -15:
                m155b(this.f532h);
                this.f501bs = -1;
                m207a(this.f499bq, true);
                break;
            case -14:
                if (this.f499bq >= 0) {
                    m207a(this.f499bq, false);
                    this.f486bd = this.f500br;
                } else {
                    this.f526f = (short) this.f500br;
                    this.f519d.f105m = (byte) 1;
                    this.f407ai = (byte) 4;
                }
                break;
            case -13:
                try {
                    if (this.f535i == "" || this.f535i == null) {
                        this.f535i = new StringBuffer("http://gear-games.com/wap/?p=score&game=0&mid=").append(this.f430at).append("&rating=").append((int) (this.f379aH == 0 ? (short) 0 : this.f541l[(this.f448az - 7) - 1])).append("&page=0&count=25&center=1").toString();
                    }
                    break;
                } catch (Exception e2) {
                }
                m155b(this.f535i);
                m207a(this.f497bo, false);
                this.f486bd = this.f498bp;
                break;
            case -12:
                if (this.f497bo >= 0) {
                    m207a(this.f497bo, false);
                    this.f486bd = this.f498bp;
                } else {
                    this.f526f = (short) this.f498bp;
                    this.f519d.f105m = (byte) 1;
                    this.f407ai = (byte) 4;
                }
                break;
            case -10:
                if (this.f391aN != 6) {
                    if (this.f391aN <= 3) {
                        m125aI();
                        if (m166d((int) this.f405ag, this.f391aN) != 0) {
                            this.f375aF = 0;
                            this.f406ah = (byte) 0;
                            m127aL();
                            m207a(35, true);
                        } else {
                            this.f406ah = (byte) 3;
                            this.f395aQ = this.f391aN;
                            this.f396aR = this.f405ag;
                            m127aL();
                            m207a(37, true);
                        }
                    } else if (this.f391aN != 4) {
                        if (this.f391aN == 5) {
                            if (m166d((int) this.f405ag, 5) != 0) {
                                m207a(41, true);
                            } else {
                                m207a(40, true);
                            }
                        }
                    } else if (m166d((int) this.f405ag, 4) != 0) {
                        m207a(36, true);
                    } else {
                        m207a(38, true);
                    }
                } else if (m166d((int) this.f405ag, 6) != 0) {
                    m207a(36, true);
                } else {
                    m207a(62, true);
                }
                break;
            case -9:
                m168d((int) this.f519d.f69e, (this.f519d.f69e + 1) % 3);
                m127aL();
                break;
            case -8:
                this.f383aJ ^= 1;
                if (this.f383aJ != 0) {
                    this.f519d.m28l();
                } else {
                    RunnableC0002c runnableC0002c = this.f519d;
                    runnableC0002c.f74f = (byte) 0;
                    runnableC0002c.m29n();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m162c(int i, int i2) {
        int i3 = i >= 0 ? 0 : 10;
        while (true) {
            if ((i < 0 || i3 >= 11) && (i >= 0 || i3 < 0)) {
                break;
            }
            int i4 = i2 >= 0 ? 0 : 17;
            while (true) {
                if ((i2 < 0 || i4 >= 18) && (i2 >= 0 || i4 < 0)) {
                    break;
                }
                if (i3 + i < 0 || i4 + i2 < 0 || i3 + i >= 11 || i4 + i2 >= 18) {
                    this.f341H[i4][i3] = -1;
                } else {
                    this.f341H[i4][i3] = this.f341H[i4 + i2][i3 + i];
                }
                i4 = (i2 >= 0 ? 1 : -1) + i4;
            }
            i3 = (i >= 0 ? 1 : -1) + i3;
        }
        for (int i5 = 0; i5 < 50; i5++) {
            if (this.f339G[1][i5] != -1) {
                byte[] bArr = this.f339G[2];
                bArr[i5] = (byte) (bArr[i5] - i);
                byte[] bArr2 = this.f339G[3];
                bArr2[i5] = (byte) (bArr2[i5] - i2);
                if (this.f339G[2][i5] < 0 || this.f339G[3][i5] < 0 || this.f339G[2][i5] >= 11 || this.f339G[3][i5] >= 18) {
                    byte[] bArr3 = this.f339G[1];
                    this.f339G[6][i5] = -1;
                    bArr3[i5] = -1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ee  */
    /* JADX INFO: renamed from: c */
    private void m163c(int i, int i2, int i3) {
        int i4;
        boolean z;
        boolean z2 = (-this.f542l[i2][i]) > 0 && (-this.f542l[i2][i]) <= 100;
        boolean z3 = this.f542l[i2][i] >= 1001 && this.f542l[i2][i] <= 1200;
        boolean z4 = this.f542l[i2][i] >= 128;
        boolean z5 = this.f542l[i2][i] >= 121 && this.f542l[i2][i] <= 123;
        if (z2) {
            i4 = this.f371aD[5656 - this.f542l[i2][i]];
        } else if (z3) {
            i4 = (((this.f542l[i2][i] - 1001) % 100) / 50) + 15;
        } else {
            i4 = (!z4 || this.f542l[i2][i] + (-128) < this.f544n[14]) ? -1 : this.f543m[this.f542l[i2][i] - 128];
        }
        if (i3 != 1) {
            z = false;
        } else {
            if (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][0][i >> 5][i2] >> (i & 31)) & 1) != 0) {
                if (this.f519d.f88i == 2) {
                    int[] iArr = null;
                    if (((iArr[i2] >> (i & 31)) & 1) == 0) {
                    }
                }
                z = false;
            }
            z = true;
        }
        if ((i < this.f452b.f323z - 1 || i2 < this.f452b.f147A - 1 || i2 >= this.f452b.f147A + this.f452b.f191O + 1) && (i4 < 0 || i < this.f452b.f323z - this.f519d.f92i[18][i4] || i2 <= this.f452b.f147A - this.f519d.f92i[19][i4])) {
            return;
        }
        if (z) {
            if (i4 < 0 || z3) {
                return;
            }
            boolean z6 = z;
            for (int i5 = 0; i5 < this.f519d.f92i[18][i4] && z6; i5++) {
                for (int i6 = i2 > 0 ? -i3 : 0; i6 < this.f519d.f92i[19][i4] && z6; i6++) {
                    if (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][0][(i + i5) >> 5][i2 + i6] >> ((i + i5) & 31)) & 1) != 0) {
                        if (this.f519d.f88i == 2) {
                            int[] iArr2 = null;
                            z6 = ((iArr2[i2 + i6] >> ((i + i5) & 31)) & 1) == 0;
                        }
                    }
                }
            }
            if (z6) {
                return;
            }
        }
        if (z5) {
            if (this.f519d.f109n == 1) {
                m217e((this.f542l[i2][i] + 1437) - 121, (i - this.f452b.f323z) * 30, (i2 - this.f452b.f147A) * 20);
                return;
            }
            return;
        }
        if (!z2) {
            if (z3) {
                m220n((((this.f542l[i2][i] - 1001) % 100) / 20) + this.f420ao[this.f542l[i2][i] / 1101], (i - this.f452b.f323z) * 30, (i2 - this.f452b.f147A) * 20, i3, 0);
                return;
            }
            if (z4) {
                if (this.f542l[i2][i] - 128 >= this.f544n[14]) {
                    m220n(this.f543m[this.f542l[i2][i] - 128], (i - this.f452b.f323z) * 30, (i2 - this.f452b.f147A) * 20, i3, 0);
                    return;
                } else {
                    if (i3 == 1) {
                        m217e(this.f543m[this.f542l[i2][i] - 128], (i - this.f452b.f323z) * 30, (i2 - this.f452b.f147A) * 20);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f519d.f88i < 2 && ((this.f519d.f49a[this.f519d.f109n][1][i >> 5][i2] >> (i & 31)) & 1) != 0) {
            if ((this.f371aD[6060 - this.f542l[i2][i]] & 2) == 0) {
                this.f429at = (byte) 0;
                m220n(i4, (this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30, ((this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20) - this.f458bB, 0, -this.f542l[i2][i]);
                this.f429at = (byte) i3;
            }
            byte[] bArr = this.f371aD;
            int i7 = 6060 - this.f542l[i2][i];
            bArr[i7] = (byte) (bArr[i7] | 2);
        } else if (this.f519d.f88i == 2) {
            int[] iArr3 = null;
            if (((iArr3[i2] >> (i & 31)) & 1) != 0) {
                if ((this.f371aD[6060 - this.f542l[i2][i]] & 2) == 0) {
                    this.f429at = (byte) 0;
                    m220n(i4, (this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30, ((this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20) - this.f458bB, 0, -this.f542l[i2][i]);
                    this.f429at = (byte) i3;
                }
                byte[] bArr2 = this.f371aD;
                int i8 = 6060 - this.f542l[i2][i];
                bArr2[i8] = (byte) (bArr2[i8] | 2);
            } else if (this.f519d.f88i > 2) {
                if ((this.f371aD[6060 - this.f542l[i2][i]] & 2) == 0 && (this.f371aD[6363 - this.f542l[i2][i]] != i || this.f371aD[6464 - this.f542l[i2][i]] != i2 || i3 != 0)) {
                    this.f429at = (byte) 0;
                    m220n(i4, (this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30, ((this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20) - this.f458bB, 0, -this.f542l[i2][i]);
                    this.f429at = (byte) i3;
                }
                byte[] bArr3 = this.f371aD;
                int i9 = 6060 - this.f542l[i2][i];
                bArr3[i9] = (byte) (bArr3[i9] | 2);
            }
        } else if (this.f519d.f88i > 2) {
            if ((this.f371aD[6060 - this.f542l[i2][i]] & 2) == 0) {
                this.f429at = (byte) 0;
                m220n(i4, (this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30, ((this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20) - this.f458bB, 0, -this.f542l[i2][i]);
                this.f429at = (byte) i3;
            }
            byte[] bArr4 = this.f371aD;
            int i10 = 6060 - this.f542l[i2][i];
            bArr4[i10] = (byte) (bArr4[i10] | 2);
        }
        if (this.f371aD[6363 - this.f542l[i2][i]] == i && this.f371aD[6464 - this.f542l[i2][i]] == i2 && (this.f371aD[6060 - this.f542l[i2][i]] & 2) != 0) {
            m175e(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m164c(int i, int i2, int i3, int i4, int i5) {
        byte b = this.f365aB[this.f546p[(this.f484bb << 1) + 95] + this.f365aB[this.f546p[(this.f484bb << 1) + 96] + this.f412ak[this.f484bb]] + this.f486bd];
        short s = this.f452b.f207T[b];
        switch (i) {
            case 0:
                if (this.f486bd > 0) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (this.f410aj[10] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[10], -1);
                    }
                }
                break;
            case 1:
                if (this.f486bd < this.f487be - 1) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (this.f410aj[11] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[11], -1);
                    }
                }
                break;
            case 2:
                if (this.f414al[this.f486bd] < 50) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (this.f410aj[12] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[12], -1);
                    }
                }
                break;
            case 3:
                if (this.f414al[this.f486bd] > 0) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (this.f410aj[13] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[13], -1);
                    }
                }
                break;
            case 4:
                this.f453b.m235f(i4, i5, 1, b + 73);
                break;
            case 5:
                m217e(this.f416am[this.f365aB[this.f546p[(this.f484bb << 1) + 95] + this.f365aB[this.f546p[(this.f484bb << 1) + 96] + this.f412ak[this.f484bb]] + this.f486bd]] + i3, i4, i5);
                break;
            case 6:
                this.f453b.m231a(i4, i5, 1, new StringBuffer().append((int) this.f414al[this.f486bd]).toString(), -1);
                break;
            case 7:
                this.f453b.m231a(i4, i5, 1, new StringBuffer().append((int) this.f337F[4][s]).toString(), -1);
                break;
            case 8:
                this.f453b.m231a(i4, i5, 1, new StringBuffer().append((int) this.f337F[2][s]).toString(), -1);
                break;
            case 9:
                this.f453b.m231a(i4, i5, 1, new StringBuffer().append(10 - this.f337F[0][s]).toString(), -1);
                break;
            case 10:
                this.f453b.m231a(i4, i5, 1, new StringBuffer().append((this.f547q[s + this.f548r[5]] * this.f452b.f201R[0]) / 10).toString(), -1);
                break;
            case 11:
                if (this.f486bd == this.f371aD[6868 - this.f359a]) {
                    if (i2 != 0) {
                        int i6 = 0;
                        int i7 = (this.f371aD[6565 - this.f359a] * 52) / ((this.f365aB[s + this.f546p[42]] * this.f452b.f195P[this.f365aB[this.f546p[94] + this.f371aD[5656 - this.f359a]]]) / 10);
                        while (i6 < i7 / (this.f519d.f92i[3][1407] & 255)) {
                            this.f404aZ = this.f519d.f92i[3][1407] & 255;
                            m178f(i3, (this.f404aZ * i6) + i4, i5);
                            i6++;
                        }
                        this.f404aZ = i7 % (this.f519d.f92i[3][1407] & 255);
                        m178f(i3, (i6 * (this.f519d.f92i[3][1407] & 255)) + i4, i5);
                    } else {
                        m217e(i3, i4, i5);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m165c(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setClip(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: d */
    private int m166d(int i, int i2) {
        m173e(i, i2);
        int i3 = ((this.f519d.f50b ^ this.f365aB[this.f546p[0] + 38]) ^ this.f519d.f57c) ^ this.f519d.f64d;
        for (int i4 = 0; i4 < 8; i4++) {
            i3 = (i3 >> 1) | (i3 & 1);
        }
        return i3;
    }

    /* JADX INFO: renamed from: d */
    private void m167d(byte b) {
        switch (this.f365aB[this.f546p[83] + b]) {
            case -6:
                if (this.f379aH == 0) {
                    if (this.f448az == 0) {
                        this.f436av = 0;
                        this.f445ay = Math.max(this.f436av, this.f445ay);
                        this.f433au = -1;
                        this.f519d.f63c[0][10] = 0;
                        m127aL();
                    }
                } else if (this.f379aH == 1) {
                    this.f439aw = -1;
                } else if (!this.f348N) {
                    this.f442ax = -1;
                }
                if (this.f379aH != 2 || !this.f348N) {
                    this.f334E = true;
                    m128aa();
                }
                if (this.f379aH == 2) {
                    this.f501bs = 1;
                    this.f486bd = 0;
                    m207a(71, true);
                } else {
                    this.f519d.f105m = (byte) 1;
                    this.f407ai = (byte) 4;
                }
                this.f519d.f127u = true;
                break;
            case -5:
                this.f519d.m24b();
                break;
            case -4:
                try {
                    if (this.f501bs == 0) {
                        String[] strArr = this.f519d.f37a.f555g;
                        this.f521d = strArr;
                        if (strArr == null) {
                            m155b(this.f519d.f37a.f559m);
                        } else {
                            m207a(62, true);
                        }
                    } else if (this.f501bs == 3) {
                        m155b(this.f519d.f37a.f558l);
                    } else if (this.f501bs == 97) {
                        m155b("http://wap.gear-games.com/?p=buy_wm&l=ru");
                    } else if (this.f501bs == 88) {
                        m155b(new StringBuffer("http://wap.gear-games.com/?p=refinfo&mid=").append(this.f430at).append("&game=2&l=ru").toString());
                    }
                } catch (Exception e) {
                    return;
                }
                break;
            case -3:
                m180f(true);
                if (this.f379aH == 0) {
                    this.f433au = this.f448az;
                } else if (this.f379aH == 1) {
                    this.f439aw = this.f448az;
                } else {
                    this.f442ax = this.f448az;
                }
                m127aL();
                m207a(this.f493bk, true);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m168d(int i, int i2) {
        this.f519d.f69e = (byte) i2;
        this.f519d.f81g = i2 >= 2;
        this.f519d.f85h = i2 >= 2;
        this.f519d.f90i = i2 > 0;
        this.f519d.f95j = i2 > 0;
        this.f519d.f99k = i2 > 0;
        this.f519d.f103l = i2 > 0;
        this.f519d.f88i = (byte) (i2 > 0 ? 0 : 1);
        if ((this.f493bk == 1 || this.f493bk == 92) && this.f379aH != 2) {
            if (i <= 1 && i2 >= 2) {
                for (int i3 = 0; i3 < 400; i3++) {
                    int i4 = this.f452b.f172H[i3] - this.f452b.f169G[i3];
                    if (i4 > 0) {
                        byte[] bArr = this.f452b.f172H;
                        bArr[i3] = (byte) (i4 + bArr[i3]);
                        byte[] bArr2 = this.f452b.f160D;
                        bArr2[i3] = (byte) (bArr2[i3] / 2);
                        byte[] bArr3 = this.f452b.f163E;
                        bArr3[i3] = (byte) (bArr3[i3] / 2);
                    }
                }
            }
            if (i == 2 && i2 <= 1) {
                for (int i5 = 0; i5 < 400; i5++) {
                    int i6 = this.f452b.f172H[i5] - this.f452b.f169G[i5];
                    if (i6 > 0) {
                        byte[] bArr4 = this.f452b.f172H;
                        bArr4[i5] = (byte) (bArr4[i5] - (i6 / 2));
                        byte[] bArr5 = this.f452b.f160D;
                        bArr5[i5] = (byte) (bArr5[i5] << 1);
                        byte[] bArr6 = this.f452b.f163E;
                        bArr6[i5] = (byte) (bArr6[i5] << 1);
                    }
                }
            }
        }
        if (i2 == 0) {
            this.f452b.f191O = (byte) (16 - C0005f.f146P);
        }
        if (i2 > 0) {
            this.f452b.f191O = (byte) 16;
            if (this.f493bk == 1 || this.f493bk == 92) {
                this.f452b.f147A = (byte) Math.min((int) this.f452b.f147A, this.f452b.f318y - 16);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x032c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0353  */
    /* JADX WARN: Code duplicated, block: B:79:0x0362  */
    /* JADX WARN: Code duplicated, block: B:80:0x0384  */
    /* JADX WARN: Code duplicated, block: B:82:0x0393  */
    /* JADX WARN: Code duplicated, block: B:83:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x03e4  */
    /* JADX INFO: renamed from: d */
    private void m169d(int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.f519d.f109n == 1) {
            if (this.f371aD[i + 4949] >= 121 && this.f371aD[i + 4949] <= 123) {
                m217e((this.f371aD[i + 4949] + 1437) - 121, i2, i3);
            }
            if (this.f371aD[i + 5050] >= 121 && this.f371aD[i + 5050] <= 123) {
                m217e((this.f371aD[i + 5050] + 1437) - 121, this.f365aB[this.f546p[1] + this.f371aD[i + 404]] + i2, this.f365aB[this.f546p[1] + 8 + this.f371aD[i + 404]] + i3);
            }
        }
        int i6 = i2 + this.f371aD[i + 202];
        int i7 = i3 + this.f371aD[i + 303];
        if (this.f371aD[i + 1616] > 0 && i > this.f519d.f109n * 50 && i <= (this.f519d.f109n + 1) * 50 && (this.f371aD[i + 2929] & 1) != 0) {
            m217e((3 - this.f365aB[this.f546p[57] + this.f371aD[i + 2323]]) + 1811, i6 - 90, i7 - 60);
        }
        if (this.f371aD[i + 1414] >= 10) {
            i4 = (this.f371aD[i + 1414] + 231) - 10;
        } else {
            i4 = ((((1 << this.f371aD[i + 2323]) & 15) == 0 || this.f371aD[i + 1414] != 0 || (this.f371aD[i + 2828] & 7) == 0) ? (short) 0 : (short) 8) + this.f452b.f280g[this.f371aD[i + 2323]][this.f371aD[i + 1414]] + this.f371aD[i + 404];
        }
        int i8 = (this.f519d.f79f[12][i4] - this.f519d.f79f[11][i4]) + 1;
        boolean z = this.f435av >= 0 && i > this.f519d.f109n * 50 && i <= (this.f519d.f109n + 1) * 50 && Math.min((int) this.f435av, (int) this.f409aj) <= this.f371aD[i] && Math.max((int) this.f435av, (int) this.f409aj) >= this.f371aD[i] && Math.min((int) this.f438aw, (int) this.f411ak) <= this.f371aD[i + 101] && Math.max((int) this.f438aw, (int) this.f411ak) >= this.f371aD[i + 101];
        int i9 = (this.f371aD[i + 1313] < i8 ? this.f371aD[i + 1313] : (byte) 0) + this.f519d.f79f[11][i4];
        short s = this.f519d.f79f[13][i9];
        int i10 = i6 + this.f519d.f92i[15][i9];
        int i11 = i7 + this.f519d.f92i[16][i9];
        byte b = 7;
        this.f351Q = i >= 51;
        for (int i12 = 0; i12 < 3; i12++) {
            b = (byte) (b | (1 << this.f365aB[this.f546p[((this.f371aD[i + 2828] >> i12) & 1) + 54] + i12]));
        }
        int i13 = this.f519d.f79f[8][s];
        while (true) {
            int i14 = i13;
            byte b2 = b;
            if (i14 > this.f519d.f79f[9][s]) {
                break;
            }
            if (((1 << this.f519d.f92i[13][i14 == true ? 1 : 0]) & b2) != 0) {
                short s2 = this.f519d.f79f[10][i14 == true ? 1 : 0];
                byte b3 = this.f365aB[this.f546p[53] + this.f519d.f92i[13][i14 == true ? 1 : 0]];
                if (b3 <= 0) {
                    i5 = s2;
                    if (this.f519d.f92i[12][i14 == true ? 1 : 0] == 0) {
                        m178f(i5, this.f519d.f92i[10][i14 == true ? 1 : 0] + i10, this.f519d.f92i[11][i14 == true ? 1 : 0] + i11);
                    } else if (this.f519d.f92i[12][i14 == true ? 1 : 0] == 1) {
                        m217e(i5, this.f519d.f92i[10][i14 == true ? 1 : 0] + i10, this.f519d.f92i[11][i14 == true ? 1 : 0] + i11);
                    } else if (this.f519d.f92i[13][i14 == true ? 1 : 0] <= 2) {
                        m221o(i5, i10 + this.f519d.f92i[10][i14 == true ? 1 : 0], i11 + this.f519d.f92i[11][i14 == true ? 1 : 0], this.f519d.f98k + i, -1);
                    } else if (this.f371aD[(b3 * 101) + 2525 + i] <= this.f519d.f79f[6][i5] - this.f519d.f79f[5][i5]) {
                        b2 = (byte) (((1 << this.f365aB[(this.f546p[54] + this.f519d.f92i[13][i14 == true ? 1 : 0]) - 3]) ^ (-1)) & b2);
                        m221o(i5, this.f519d.f92i[10][i14 == true ? 1 : 0] + i10, this.f519d.f92i[11][i14 == true ? 1 : 0] + i11, this.f371aD[(b3 * 101) + 2525 + i], -1);
                    }
                } else if (this.f371aD[i + 2323] != 17) {
                    i5 = s2;
                    i5 = s2 + (this.f371aD[((b3 * 101) + 404) + i] - this.f371aD[i + 404]);
                    i5 = s2;
                    if (this.f519d.f92i[12][i14 == true ? 1 : 0] == 0) {
                        m178f(i5, this.f519d.f92i[10][i14 == true ? 1 : 0] + i10, this.f519d.f92i[11][i14 == true ? 1 : 0] + i11);
                    } else if (this.f519d.f92i[12][i14 == true ? 1 : 0] == 1) {
                        m217e(i5, this.f519d.f92i[10][i14 == true ? 1 : 0] + i10, this.f519d.f92i[11][i14 == true ? 1 : 0] + i11);
                    } else if (this.f519d.f92i[13][i14 == true ? 1 : 0] <= 2) {
                        m221o(i5, i10 + this.f519d.f92i[10][i14 == true ? 1 : 0], i11 + this.f519d.f92i[11][i14 == true ? 1 : 0], this.f519d.f98k + i, -1);
                    } else if (this.f371aD[(b3 * 101) + 2525 + i] <= this.f519d.f79f[6][i5] - this.f519d.f79f[5][i5]) {
                        b2 = (byte) (((1 << this.f365aB[(this.f546p[54] + this.f519d.f92i[13][i14 == true ? 1 : 0]) - 3]) ^ (-1)) & b2);
                        m221o(i5, this.f519d.f92i[10][i14 == true ? 1 : 0] + i10, this.f519d.f92i[11][i14 == true ? 1 : 0] + i11, this.f371aD[(b3 * 101) + 2525 + i], -1);
                    }
                } else {
                    i5 = s2;
                }
            }
            b = b2;
            i13 = (i14 == true ? 1 : 0) + 1;
        }
        this.f351Q = false;
        if (this.f371aD[i + 1616] > 0 && (i - 1) / 50 == this.f519d.f109n && ((this.f371aD[i + 2929] & 1) != 0 || this.f359a == i || z)) {
            m217e(((this.f365aB[this.f546p[42] + this.f371aD[i + 2323]] - 30) / 12) + 1854, i6 - 90, i7 - 60);
            this.f404aZ = (((((this.f365aB[this.f546p[42] + this.f371aD[i + 2323]] - 30) / 12) << 1) + 12) * this.f371aD[i + 1616]) / this.f365aB[this.f546p[42] + this.f371aD[i + 2323]];
            this.f483ba = ((this.f371aD[i + 1616] - 1) * 3) / this.f365aB[this.f546p[42] + this.f371aD[i + 2323]];
            m178f(1404 - this.f483ba, this.f402aX, this.f403aY);
        }
        if (this.f371aD[i + 1616] > 0) {
            if (this.f359a == i && this.f520d >= 0) {
                m221o(this.f520d, i6, i7, Math.max((int) this.f417an, 0), -1);
            }
            if (z) {
                m221o((((1 << this.f371aD[i + 2323]) & 16447) == 0 ? 1 : 0) + 253, i6, i7, Math.max((int) this.f417an, 0), -1);
            }
            if ((i - 1) / 50 == this.f519d.f109n && (this.f371aD[i + 2828] & 64) != 0) {
                m217e(1872, i6 - 90, i7 - 60);
            }
            if ((this.f371aD[i + 2828] & 128) != 0) {
                m217e((((i - 1) / 50) ^ this.f519d.f109n) + 1870, i6 - 90, i7 - 60);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m170d(int i, int i2, int i3, int i4) {
        m194m(0);
        for (int iMin = Math.min(i, i3); iMin <= Math.max(i, i3); iMin++) {
            for (int iMin2 = Math.min(i2, i4); iMin2 <= Math.max(i2, i4); iMin2++) {
                if (this.f542l[iMin2][iMin] > this.f519d.f109n * 50 && this.f542l[iMin2][iMin] <= (this.f519d.f109n + 1) * 50 && this.f371aD[this.f542l[iMin2][iMin] + 1616] > 0) {
                    this.f335E[0][this.f335E[0][50]] = (byte) this.f542l[iMin2][iMin];
                    byte[] bArr = this.f371aD;
                    int i5 = this.f542l[iMin2][iMin] + 2929;
                    bArr[i5] = (byte) (bArr[i5] | 1);
                    byte[] bArr2 = this.f335E[0];
                    bArr2[50] = (byte) (bArr2[50] + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m171d(int i, int i2, int i3, int i4, int i5) {
        short s = this.f365aB[this.f546p[(this.f484bb << 1) + 95] + this.f365aB[this.f546p[(this.f484bb << 1) + 96] + this.f412ak[this.f484bb]] + this.f486bd];
        switch (i) {
            case 0:
                if (this.f486bd > 0) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (this.f410aj[10] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[10], -1);
                    }
                }
                break;
            case 1:
                if (this.f486bd < this.f487be - 1) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (this.f410aj[11] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[11], -1);
                    }
                }
                break;
            case 2:
                this.f453b.m235f(i4, i5, 1, s + 87);
                break;
            case 3:
                m217e(this.f418an[s] + i3, i4, i5);
                break;
            case 4:
                this.f453b.m231a(i4, i5, 1, new StringBuffer().append((int) this.f547q[s + this.f548r[6]]).toString(), -1);
                break;
            case 5:
                this.f453b.m231a(i4, i5, 1, new StringBuffer().append((int) this.f365aB[s + this.f546p[61]]).toString(), -1);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m172d(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.drawLine(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: e */
    private int m173e(int i, int i2) {
        RunnableC0004e runnableC0004e = new RunnableC0004e();
        runnableC0004e.f143d = this.f519d.f46a[0][i];
        if (i2 == 6) {
            this.f538j = this.f521d[(this.f394aP * 3) + 2];
        } else {
            this.f538j = new StringBuffer().append(this.f519d.f46a[1][i]).append("43 ").append(this.f519d.f37a.f556h[1]).append(" aow22 ").append(this.f527f[i2]).append(" ").append(this.f430at).toString();
            if (i2 <= 3) {
                this.f538j = new StringBuffer().append(this.f538j).append(" ").append(this.f397aS).toString();
            } else if (i2 == 4) {
                this.f538j = new StringBuffer().append(this.f538j).append(" 0").toString();
            }
            if (i2 <= 4 && this.f519d.f52b != null && this.f519d.f52b != "" && this.f519d.f52b.length() == 9 && this.f519d.f52b.charAt(0) != '0') {
                this.f538j = new StringBuffer().append(this.f538j).append(" ").append(this.f519d.f52b).toString();
            }
            if (i2 == 5) {
                this.f538j = new StringBuffer().append(this.f538j).append(" ").toString();
                for (int i3 = 0; i3 < this.f474bR; i3++) {
                    this.f538j = new StringBuffer().append(this.f538j).append((char) this.f443ax[i3]).toString();
                }
            }
        }
        runnableC0004e.f142c = "";
        for (int i4 = 0; i4 < 6; i4++) {
            runnableC0004e.f142c = new StringBuffer().append(runnableC0004e.f142c).append((char) this.f449az[i4]).toString();
        }
        runnableC0004e.f142c = new StringBuffer().append(runnableC0004e.f142c).append(runnableC0004e.f143d.toString()).toString();
        runnableC0004e.m33a(this.f519d);
        while (runnableC0004e.f145x) {
            Thread.yield();
            RunnableC0002c.m10a(1000L);
        }
        int i5 = runnableC0004e.f144r;
        this.f472bP = i5;
        this.f519d.f64d = (byte) (this.f365aB[this.f546p[0] + 37] ^ i5);
        return i5;
    }

    /* JADX INFO: renamed from: e */
    private void m174e(int i, int i2) {
        short s = this.f452b.f282h[i2 + 1][i + 1];
        while (s >= 0) {
            int i3 = (((i * 30) + this.f452b.f321y[s]) + 15) - 90;
            int i4 = (((((i2 * 20) + this.f452b.f326z[s]) - ((this.f452b.f175I[s] * ((this.f452b.f172H[s] + 1) - this.f452b.f169G[s])) / (this.f452b.f172H[s] + 1))) + 10) - 60) - 10;
            switch (this.f365aB[this.f546p[48] + this.f452b.f178J[s]]) {
                case 0:
                    m217e((this.f365aB[this.f546p[49] + this.f452b.f178J[s]] << 5) + 1277 + this.f452b.f166F[s], i3, i4);
                    break;
                case 1:
                    m217e((this.f365aB[this.f546p[49] + this.f452b.f178J[s]] << 5) + 1341 + this.f452b.f166F[s], i3, i4);
                    break;
                case 2:
                    if (((1 << this.f452b.f178J[s]) & 0) != 0) {
                        i4 -= this.f365aB[((this.f546p[50] + 15) - this.f452b.f172H[s]) + (this.f452b.f169G[s] << 1)] - this.f365aB[(this.f546p[50] + 15) - this.f452b.f172H[s]];
                    }
                    if (this.f452b.f267c[1][0][s] >= 0) {
                        m217e((this.f365aB[this.f546p[49] + this.f452b.f178J[s]] << 4) + 1405 + this.f452b.f166F[s], i3, i4);
                    }
                    byte[] bArr = this.f365aB;
                    short[] sArr = this.f546p;
                    byte[] bArr2 = this.f452b.f178J;
                    int i5 = 4 / (this.f519d.f81g ? 1 : 2);
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = i5;
                    int i9 = i4;
                    int i10 = i3;
                    while (i7 < 4 && (this.f452b.f267c[0][i7][s] != 0 || this.f452b.f267c[1][i7][s] != 0)) {
                        int i11 = i6;
                        while (i8 < 7 && i11 < 7) {
                            this.f540k[0][i11] = (short) (((this.f452b.f267c[0][i7][s] * i8) / 7) + i10);
                            this.f540k[1][i11] = (short) (((this.f452b.f267c[1][i7][s] * i8) / 7) + i9);
                            i8 += i5;
                            i11++;
                        }
                        i8 -= 7;
                        i10 += this.f452b.f267c[0][i7][s];
                        i9 += this.f452b.f267c[1][i7][s];
                        i7++;
                        i6 = i11;
                    }
                    int i12 = this.f452b.f267c[1][0][s] >= 0 ? 0 : i6 - 1;
                    while (true) {
                        if ((this.f452b.f267c[1][0][s] >= 0 && i12 < i6) || (this.f452b.f267c[1][0][s] < 0 && i12 >= 0)) {
                            m217e((this.f365aB[this.f546p[49] + this.f452b.f178J[s]] * 7) + 1440 + i12, this.f540k[0][i12], this.f540k[1][i12]);
                            i12 += this.f452b.f267c[1][0][s] >= 0 ? 1 : -1;
                        }
                    }
                    if (this.f452b.f267c[1][0][s] < 0) {
                        m217e((this.f365aB[this.f546p[49] + this.f452b.f178J[s]] << 4) + 1405 + this.f452b.f166F[s], i3, i4);
                    }
                    break;
                case 3:
                    m221o(59, this.f452b.f321y[s] + (i * 30), this.f452b.f326z[s] + (i2 * 20), this.f452b.f169G[s] - 1, s);
                    break;
            }
            s = this.f452b.f277f[s];
        }
    }

    /* JADX INFO: renamed from: e */
    private void m175e(int i, int i2, int i3, int i4) {
        m220n(i4, (i - this.f452b.f323z) * 30, (i2 - this.f452b.f147A) * 20, i3, -this.f542l[i2][i]);
        if (i3 != 1 || ((this.f371aD[5454 - this.f542l[i2][i]] + 1) & 255) <= 1) {
            return;
        }
        int i5 = ((((this.f365aB[this.f546p[59] + i4] & 255) - 100) / 35) * 10) + 30;
        int i6 = this.f519d.f92i[3][1404] & 255;
        if ((this.f359a == this.f542l[i2][i] && ((-this.f542l[i2][i]) - 1) / 50 == this.f519d.f109n) || (this.f371aD[6060 - this.f542l[i2][i]] & 1) != 0) {
            m217e((((this.f365aB[this.f546p[59] + i4] & 255) - 100) / 35) + 1863, (((i - this.f452b.f323z) * 30) + (this.f519d.f92i[18][i4] * 15)) - 90, ((i2 - this.f452b.f147A) * 20) - 60);
            this.f483ba = (this.f371aD[6060 - this.f542l[i2][i]] & 1) == 0 ? 1404 - ((((this.f371aD[5454 - this.f542l[i2][i]] & 255) - 1) * 3) / (this.f365aB[this.f546p[59] + i4] & 255)) : 1406;
            int i7 = ((this.f371aD[5454 - this.f542l[i2][i]] & 255) * i5) / (this.f365aB[this.f546p[59] + i4] & 255);
            this.f404aZ = i6;
            int i8 = 0;
            while (i8 < i7 / i6) {
                m178f(this.f483ba, this.f402aX + (this.f404aZ * i8), this.f403aY);
                i8++;
            }
            this.f404aZ = i7 % i6;
            m178f(this.f483ba, (i8 * i6) + this.f402aX, this.f403aY);
        }
        if (this.f371aD[6868 - this.f542l[i2][i]] >= 0 && ((-this.f542l[i2][i]) - 1) / 50 == this.f519d.f109n && (this.f365aB[this.f546p[94] + i4] % 3 > 0 || i4 == 4 || i4 == 12)) {
            byte b = (i4 == 4 || i4 == 12) ? (byte) 0 : this.f452b.f207T[this.f365aB[this.f546p[(this.f365aB[this.f546p[94] + i4] << 1) + 95] + this.f365aB[this.f546p[(this.f365aB[this.f546p[94] + i4] << 1) + 96] + this.f412ak[this.f365aB[this.f546p[94] + i4]]] + this.f371aD[6868 - this.f542l[i2][i]]]];
            m217e((((this.f365aB[this.f546p[59] + i4] & 255) - 100) / 35) + 1863, (((i - this.f452b.f323z) * 30) + (this.f519d.f92i[18][i4] * 15)) - 90, (((i2 - this.f452b.f147A) * 20) - 60) + 5);
            int i9 = (this.f371aD[6565 - this.f542l[i2][i]] * i5) / ((i4 == 4 || i4 == 12) ? this.f371aD[6767 - this.f542l[i2][i]] : (this.f365aB[b + this.f546p[42]] * this.f452b.f195P[this.f365aB[this.f546p[94] + i4]]) / 10);
            this.f404aZ = i6;
            int i10 = 0;
            while (i10 < i9 / i6) {
                m178f(1405, this.f402aX + (this.f404aZ * i10), this.f403aY);
                i10++;
            }
            this.f404aZ = i9 % i6;
            m178f(1405, (i10 * i6) + this.f402aX, this.f403aY);
        }
        if (this.f371aD[7171 - this.f542l[i2][i]] == 0) {
            m221o(269, ((this.f519d.f92i[18][i4] - 1) * 15) + ((this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30), ((this.f519d.f92i[19][i4] - 1) * 10) + ((this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20), this.f519d.f98k - this.f542l[i2][i], -1);
        }
        if (this.f359a != this.f542l[i2][i] || this.f520d < 0) {
            return;
        }
        if (this.f417an >= 0) {
            m221o(this.f520d, (this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30, (this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20, this.f417an, -1);
            m221o(this.f520d + 1, (((this.f371aD[6363 - this.f542l[i2][i]] + this.f519d.f92i[18][i4]) - 1) - this.f452b.f323z) * 30, (this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20, this.f417an, -1);
            m221o(this.f520d + 2, (this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30, (((this.f371aD[6464 - this.f542l[i2][i]] + this.f519d.f92i[19][i4]) - 1) - this.f452b.f147A) * 20, this.f417an, -1);
            m221o(this.f520d + 3, (((this.f371aD[6363 - this.f542l[i2][i]] + this.f519d.f92i[18][i4]) - 1) - this.f452b.f323z) * 30, (((this.f371aD[6464 - this.f542l[i2][i]] + this.f519d.f92i[19][i4]) - 1) - this.f452b.f147A) * 20, this.f417an, -1);
            return;
        }
        m217e(this.f520d, (this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30, (this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20);
        m217e(this.f520d + 1, (((this.f371aD[6363 - this.f542l[i2][i]] + this.f519d.f92i[18][i4]) - 1) - this.f452b.f323z) * 30, (this.f371aD[6464 - this.f542l[i2][i]] - this.f452b.f147A) * 20);
        m217e(this.f520d + 2, (this.f371aD[6363 - this.f542l[i2][i]] - this.f452b.f323z) * 30, (((this.f371aD[6464 - this.f542l[i2][i]] + this.f519d.f92i[19][i4]) - 1) - this.f452b.f147A) * 20);
        m217e(this.f520d + 3, (((this.f371aD[6363 - this.f542l[i2][i]] + this.f519d.f92i[18][i4]) - 1) - this.f452b.f323z) * 30, (((this.f371aD[6464 - this.f542l[i2][i]] + this.f519d.f92i[19][i4]) - 1) - this.f452b.f147A) * 20);
    }

    /* JADX INFO: renamed from: e */
    private void m176e(int i, int i2, int i3, int i4, int i5) {
        switch (i) {
            case 0:
                if (this.f371aD[6868 - this.f359a] < 0 && m215b(this.f486bd, -1) >= 0) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (this.f410aj[10] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[10], -1);
                    }
                    break;
                }
                break;
            case 1:
                if (this.f371aD[6868 - this.f359a] < 0 && m215b(this.f486bd, 1) >= 0) {
                    if (i2 == 0) {
                        m217e(i3, i4, i5);
                    } else if (this.f410aj[11] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[11], -1);
                    }
                    break;
                }
                break;
            case 2:
                if (this.f345K) {
                    if (i2 == 0) {
                        this.f504bv = i4;
                        this.f505bw = i5;
                    } else {
                        this.f506bx = i4 - this.f504bv;
                        this.f507by = i5 - this.f505bw;
                        this.f453b.m230a(this.f504bv, this.f505bw, this.f506bx, this.f507by, 1, this.f486bd + 90, 1);
                        this.f345K = false;
                    }
                }
                if (i2 == 1) {
                    this.f453b.m234b(this.f455b[this.f429at]);
                }
                break;
            case 3:
                if (i2 == 0) {
                    m217e(this.f486bd + i3, i4, i5);
                    break;
                } else if ((this.f452b.f272e & (1 << this.f486bd)) == 0) {
                    m217e(i3, i4, i5);
                    break;
                } else if ((this.f452b.f268d & (1 << this.f486bd)) != 0 && this.f371aD[6868 - this.f359a] < 0) {
                    m217e(i3 + 1, i4, i5);
                    break;
                }
                break;
            case 4:
                this.f453b.m231a(i4, i5, 1, new StringBuffer().append((int) this.f547q[this.f548r[7] + this.f486bd]).toString(), -1);
                break;
            case 5:
                if (this.f371aD[6868 - this.f359a] >= 0) {
                    if (i2 != 0) {
                        this.f404aZ = (this.f371aD[6565 - this.f359a] * 34) / this.f371aD[6767 - this.f359a];
                        m178f(i3, i4, i5);
                    } else {
                        m217e(i3, i4, i5);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    private int m177f() {
        int i = 0;
        try {
            i = this.f362aA[this.f511cb] ^ this.f354a.readByte();
            this.f511cb = (this.f511cb + 1) % this.f362aA.length;
        } catch (Exception e) {
        }
        return i & 255;
    }

    /* JADX INFO: renamed from: f */
    private void m178f(int i, int i2, int i3) {
        if (this.f519d.f95j || i < 2100) {
            int i4 = this.f519d.f92i[0][i] & 255;
            try {
                if (this.f514ce > -1000) {
                    i3 += ((i2 - this.f514ce) * this.f365aB[(this.f546p[14] + 32) + this.f392aO]) / 100;
                    i2 = ((this.f514ce + (((((i2 - this.f514ce) - 15) + ((this.f519d.f92i[3][i] & 255) / 2)) * this.f365aB[this.f546p[14] + this.f392aO]) / 100)) - ((this.f519d.f92i[3][i] & 255) / 2)) + 15;
                }
                int i5 = i2 + 15;
                int i6 = i3 + this.f458bB + 10;
                if (this.f519d.f81g && !this.f346L) {
                    i5 -= this.f519d.f80g;
                    i6 -= this.f519d.f84h;
                }
                switch (i4) {
                    case 42:
                        this.f455b[this.f429at].setColor(C0001b.f25b[this.f519d.f92i[5][i] & 255]);
                        m172d(this.f455b[this.f429at], (this.f519d.f92i[1][i] & 255) + i5, (this.f519d.f92i[2][i] & 255) + i6, (this.f519d.f92i[3][i] & 255) + i5, (this.f519d.f92i[4][i] & 255) + i6);
                        break;
                    case 43:
                        this.f455b[this.f429at].setColor(C0001b.f25b[this.f519d.f92i[5][i] & 255]);
                        m156b(this.f455b[this.f429at], (this.f519d.f92i[1][i] & 255) + i5, (this.f519d.f92i[2][i] & 255) + i6, this.f519d.f92i[3][i] & 255, this.f519d.f92i[4][i] & 255);
                        break;
                    case 44:
                        this.f455b[this.f429at].setColor(C0001b.f25b[this.f519d.f92i[5][i] & 255]);
                        m115a(this.f455b[this.f429at], (this.f519d.f92i[1][i] & 255) + i5, (this.f519d.f92i[2][i] & 255) + i6, this.f519d.f92i[3][i] & 255, this.f519d.f92i[4][i] & 255);
                        break;
                    case 45:
                        this.f455b[this.f429at].setColor(C0001b.f25b[this.f519d.f92i[5][i] & 255]);
                        m156b(this.f455b[this.f429at], ((this.f519d.f92i[1][i] & 255) << 2) + i5, ((this.f519d.f92i[2][i] & 255) << 2) + i6, (this.f519d.f92i[3][i] & 255) << 2, (this.f519d.f92i[4][i] & 255) << 2);
                        break;
                    default:
                        m118a(this.f455b[this.f429at], this.f519d.f47a[0][((i4 == 8 && this.f351Q) ? 1 : 0) + i4], this.f519d.f92i[1][i] & 255, this.f519d.f92i[2][i] & 255, (i < 1402 || i > 1407) ? this.f519d.f92i[3][i] & 255 : this.f404aZ, this.f519d.f92i[4][i] & 255, i5, i6, 20);
                        break;
                }
            } catch (Exception e) {
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    private void m179f(int i, int i2, int i3, int i4, int i5) {
        int i6 = -1;
        i6 = -1;
        if (this.f501bs < 0 && this.f332D) {
            i6 = this.f371aD[5656 - this.f359a] + 87;
        } else if (this.f501bs == 17 || this.f508bz < 12) {
            i6 = this.f365aB[this.f546p[82] + this.f501bs] + 0;
        } else if (this.f508bz < 172 && (this.f508bz < 22 || this.f508bz >= 90)) {
            if (this.f508bz < 138) {
                i6 = this.f365aB[((this.f546p[82] + this.f508bz) - 12) + 19];
            } else if (this.f508bz < 158) {
                i6 = (this.f508bz + 87) - 138;
            } else {
                i6 = this.f508bz < 172 ? (this.f508bz + 73) - 158 : -1;
            }
        }
        switch (i) {
            case 0:
                if (i6 >= 0) {
                    switch (i2) {
                        case 0:
                            this.f453b.m235f(i4, i5, 1, i6);
                            break;
                        case 1:
                            m217e(i3, i4, i5);
                            break;
                    }
                }
                break;
            case 1:
                if (((i6 >= 0 && i2 == 1) || (i6 < 0 && i2 == 0)) && this.f345K) {
                    this.f504bv = i4;
                    this.f505bw = i5;
                    break;
                }
                break;
            case 2:
                if (this.f345K) {
                    this.f506bx = i4 - this.f504bv;
                    this.f507by = i5 - this.f505bw;
                    this.f453b.m230a(this.f504bv, this.f505bw, this.f506bx, this.f507by, (this.f501bs == 17 || this.f501bs == 15) ? 2 : 1, this.f508bz, this.f501bs == 17 ? 0 : ((this.f508bz < 12 || this.f508bz >= 90 || this.f501bs == 30 || this.f501bs == 31) && this.f508bz != 220) ? 1 : 3);
                    this.f345K = false;
                }
                this.f453b.m234b(this.f455b[this.f429at]);
                break;
            case 3:
                if (!this.f453b.f573X) {
                    if (i2 == 0) {
                        m178f(i3, i4, i5);
                    } else if (this.f410aj[13] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[13], -1);
                    }
                }
                break;
            case 4:
                if (!this.f453b.f572W) {
                    if (i2 == 0) {
                        m178f(i3, i4, i5);
                    } else if (this.f410aj[12] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[12], -1);
                    }
                }
                break;
            case 5:
                if (this.f501bs == 30 || this.f501bs == 85 || this.f501bs == 31) {
                    m217e(this.f367aC + i3, i4, i5);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m180f(boolean z) {
        String str;
        String str2;
        this.f468bL = 0;
        this.f518ci = 0;
        try {
            this.f424aq = this.f426ar;
            if (z) {
                try {
                    str = this.f379aH == 0 ? "aow221" : this.f379aH == 1 ? "aow224" : "aow225";
                } catch (Exception e) {
                }
            } else {
                str = "aow227";
            }
            RecordStore.deleteRecordStore(str);
            if (!z) {
                str2 = "aow227";
            } else if (this.f379aH == 0) {
                str2 = "aow221";
            } else {
                str2 = this.f379aH == 1 ? "aow224" : "aow225";
            }
            this.f357a = RecordStore.openRecordStore(str2, true);
            m198p(this.f519d.f109n);
            m198p(this.f519d.f101l);
            m199q(this.f519d.f98k);
            m199q(this.f452b.f299s);
            m199q(this.f452b.f302t);
            m198p(this.f452b.f156C);
            m198p(this.f452b.f199R);
            m198p(this.f385aK);
            m198p(this.f387aL);
            m198p(this.f452b.f202S);
            m198p(this.f452b.f205T);
            m199q(this.f452b.f159D);
            m199q(this.f452b.f162E);
            m198p(this.f452b.f208U);
            m198p(this.f452b.f229aa);
            m198p(this.f452b.f214W);
            m198p(this.f452b.f217X);
            m198p(this.f452b.f220Y);
            m198p(this.f452b.f223Z);
            m198p(this.f452b.f323z);
            m198p(this.f452b.f147A);
            long j = this.f452b.f268d;
            for (int i = 0; i < 8; i++) {
                m198p((int) ((j >> (56 - (i << 3))) & 255));
            }
            m198p(this.f452b.f167G);
            m198p(this.f452b.f170H);
            m198p(this.f452b.f173I);
            m198p(this.f452b.f176J);
            m198p(this.f409aj);
            m198p(this.f411ak);
            m198p(this.f467bK);
            m198p(this.f372aE);
            if (this.f519d.f88i < 2) {
                for (int i2 = 0; i2 < 2; i2++) {
                    for (int i3 = 0; i3 < 4; i3++) {
                        for (int i4 = 0; i4 < 128; i4++) {
                            m199q(this.f519d.f49a[i2][0][i3][i4]);
                        }
                    }
                }
            } else if (this.f519d.f88i < 3) {
                for (int i5 = 0; i5 < 4; i5++) {
                    for (int i6 = 0; i6 < 128; i6++) {
                        int[] iArr = null;
                        m199q(iArr[i6]);
                    }
                }
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.f452b.f318y; i8++) {
                for (int i9 = 0; i9 < this.f452b.f314x; i9++) {
                    if (this.f542l[i8][i9] >= 121 && this.f542l[i8][i9] <= 123) {
                        i7++;
                    }
                }
            }
            m199q(i7);
            for (int i10 = 0; i10 < this.f452b.f318y; i10++) {
                for (int i11 = 0; i11 < this.f452b.f314x; i11++) {
                    if (this.f542l[i10][i11] >= 121 && this.f542l[i10][i11] <= 123) {
                        m198p(i11);
                        m198p(i10);
                        m198p(this.f542l[i10][i11] - 121);
                    }
                }
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f452b.f318y; i13++) {
                for (int i14 = 0; i14 < this.f452b.f314x; i14++) {
                    if (this.f542l[i13][i14] >= 1001 && this.f542l[i13][i14] <= 1200) {
                        i12++;
                    }
                }
            }
            m199q(i12);
            for (int i15 = 0; i15 < this.f452b.f318y; i15++) {
                for (int i16 = 0; i16 < this.f452b.f314x; i16++) {
                    if (this.f542l[i15][i16] >= 1001 && this.f542l[i15][i16] <= 1200) {
                        m198p(i16);
                        m198p(i15);
                        m198p(this.f542l[i15][i16] - 1001);
                    }
                }
            }
            this.f482bZ = 0;
            m117a(null, null, this.f519d.f63c[0], null, 18, 0, 10, 65536);
            m117a(null, null, this.f519d.f63c[1], null, 18, 0, 10, 65536);
            for (int i17 = 1; i17 <= 4; i17++) {
                m117a(null, this.f335E[i17], null, null, 7, 0, 51, 0);
            }
            int i18 = 0;
            int i19 = 0;
            while (i18 < 72) {
                if (this.f365aB[this.f546p[8] + i18] > 0) {
                    m117a(null, this.f371aD, null, null, this.f365aB[this.f546p[8] + i18], i19 + 1, 100, this.f365aB[this.f546p[9] + i18] & 255);
                }
                i18++;
                i19 += 101;
            }
            m117a(null, this.f452b.f181K, null, null, 5, 0, 60, 1);
            m117a(null, this.f452b.f184L, null, null, 6, 0, 60, 1);
            m117a(null, this.f452b.f187M, null, null, 7, 0, 60, 1);
            m117a(null, this.f452b.f312w, null, null, 7, 0, 400, 0);
            m117a(null, this.f452b.f316x, null, null, 7, 0, 400, 0);
            m117a(null, this.f452b.f321y, null, null, 5, 0, 400, 16);
            m117a(null, this.f452b.f326z, null, null, 5, 0, 400, 16);
            m117a(null, this.f452b.f149A, null, null, 8, 0, 400, 128);
            m117a(null, this.f452b.f153B, null, null, 8, 0, 400, 128);
            m117a(null, this.f452b.f157C, null, null, 8, 0, 400, 128);
            m117a(null, this.f452b.f160D, null, null, 8, 0, 400, 128);
            m117a(null, this.f452b.f163E, null, null, 8, 0, 400, 128);
            m117a(null, this.f452b.f166F, null, null, 5, 0, 400, 0);
            m117a(null, this.f452b.f169G, null, null, 5, 0, 400, 1);
            m117a(null, this.f452b.f172H, null, null, 5, 0, 400, 1);
            m117a(null, this.f452b.f175I, null, null, 5, 0, 400, 1);
            m117a(null, this.f452b.f178J, null, null, 5, 0, 400, 1);
            m117a(this.f452b.f227a, null, null, null, 1, 0, 3, 0);
            m117a(null, this.f452b.f216W, null, null, 5, 0, 3, 0);
            m117a(null, this.f452b.f225Z, null, null, 5, 0, 3, 0);
            m117a(this.f452b.f262b, null, null, null, 1, 0, 3, 0);
            m117a(this.f452b.f266c, null, null, null, 1, 0, 3, 0);
            m117a(null, this.f452b.f294p[0], null, null, 5, 0, 3, 1);
            m117a(null, this.f452b.f294p[1], null, null, 5, 0, 3, 1);
            m117a(null, this.f452b.f219X, null, null, 5, 0, 3, 1);
            m117a(null, null, null, this.f452b.f269d, 24, 0, 3, 1);
            m117a(null, null, null, this.f452b.f273e, 24, 0, 3, 1);
            m117a(null, null, null, this.f452b.f276f, 24, 0, 3, 1);
            if (this.f482bZ > 0) {
                m198p((int) (this.f537j << (8 - this.f482bZ)));
            }
            m198p(this.f485bc);
            m198p(this.f452b.f211V);
            if (this.f379aH == 2) {
                for (int i20 = 0; i20 < this.f470bN; i20++) {
                    m198p(this.f426ar[(17500 - this.f470bN) + i20]);
                }
            }
            this.f357a.addRecord(this.f426ar, 0, this.f518ci);
            this.f357a.closeRecordStore();
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: g */
    private int m181g() {
        int iM111a = 0;
        int i = 0;
        while (true) {
            int i2 = iM111a;
            if (i >= 4) {
                return i2;
            }
            iM111a = ((m111a() & 255) << (24 - (i << 3))) | i2;
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0497  */
    /* JADX WARN: Code duplicated, block: B:160:0x049f  */
    /* JADX WARN: Code duplicated, block: B:162:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:164:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:168:0x04da  */
    /* JADX WARN: Code duplicated, block: B:170:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:174:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:175:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:178:0x0506  */
    /* JADX WARN: Code duplicated, block: B:184:0x0534  */
    /* JADX WARN: Code duplicated, block: B:185:0x0536  */
    /* JADX WARN: Code duplicated, block: B:187:0x053e  */
    /* JADX WARN: Code duplicated, block: B:195:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:196:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:198:0x05b4 A[LOOP:6: B:198:0x05b4->B:200:0x05e7, LOOP_START, PHI: r11
  0x05b4: PHI (r11v4 int) = (r11v0 int), (r11v5 int) binds: [B:197:0x05b2, B:200:0x05e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:200:0x05e7 A[LOOP:6: B:198:0x05b4->B:200:0x05e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x0623  */
    /* JADX WARN: Code duplicated, block: B:212:0x062a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0635 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x0637  */
    /* JADX WARN: Code duplicated, block: B:219:0x0641  */
    /* JADX WARN: Code duplicated, block: B:220:0x0643  */
    /* JADX WARN: Code duplicated, block: B:221:0x0645  */
    /* JADX WARN: Code duplicated, block: B:222:0x0670  */
    /* JADX WARN: Code duplicated, block: B:223:0x0677  */
    /* JADX WARN: Code duplicated, block: B:244:0x070b  */
    /* JADX WARN: Code duplicated, block: B:262:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x04e6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    private void m182g(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iMin;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (i) {
            case 0:
                byte b = this.f365aB[this.f546p[82] + this.f501bs];
                if (b >= 0) {
                    switch (i2) {
                        case 0:
                            C0009j c0009j = this.f453b;
                            if (b == 10 && this.f379aH == 2) {
                                b = 42;
                            }
                            c0009j.m235f(i4, i5, 1, b + 0);
                            break;
                        case 1:
                            m217e(i3, i4, i5);
                            break;
                    }
                }
                break;
            case 1:
                if (this.f342I) {
                    if ((this.f365aB[this.f546p[82] + this.f501bs] >= 0 && i2 == 1) || (this.f365aB[this.f546p[82] + this.f501bs] < 0 && i2 == 0)) {
                        this.f505bw = i5;
                        break;
                    }
                }
                break;
            case 2:
                if (this.f342I) {
                    this.f507by = i5 - this.f505bw;
                    int i15 = 0;
                    if (this.f501bs == 81) {
                        this.f487be = this.f450b.f14b.size();
                    } else if (this.f501bs == 7) {
                        this.f487be = this.f379aH == 1 ? Math.min(this.f445ay, (int) this.f365aB[this.f546p[134] + this.f367aC]) + 1 : 1;
                        for (int i16 = (this.f379aH - 1) * 50; i16 < this.f379aH * 50; i16++) {
                            if (this.f541l[i16] >= 0) {
                                this.f487be++;
                            }
                        }
                    } else if (this.f501bs == 57) {
                        this.f487be = 0;
                        for (int i17 = (this.f379aH - 1) * 50; i17 < this.f379aH * 50; i17++) {
                            if (this.f541l[i17] >= 0) {
                                this.f487be++;
                            }
                        }
                    } else if (this.f501bs == 59 || this.f501bs == 86) {
                        this.f487be = 0;
                        for (int i18 = 0; i18 < 5; i18++) {
                            if (this.f519d.f82g[i18] > 0) {
                                this.f487be++;
                            }
                        }
                    } else if (this.f501bs == 48) {
                        this.f487be = this.f519d.f53b.length;
                    } else if (this.f501bs == 98) {
                        this.f487be = 2;
                    } else {
                        this.f487be = (this.f365aB[(this.f546p[81] + this.f501bs) + 1] & 255) - (this.f365aB[this.f546p[81] + this.f501bs] & 255);
                        if (this.f501bs == 93) {
                            if (this.f448az <= 7) {
                                this.f531h &= -216172782113783809L;
                            } else {
                                this.f531h |= 216172782113783808L;
                            }
                        }
                        for (int i19 = this.f365aB[this.f546p[81] + this.f501bs] & 255; i19 < (this.f365aB[this.f546p[81] + this.f501bs + 1] & 255); i19++) {
                            if (((this.f531h >> this.f365aB[this.f546p[80] + i19]) & 1) == 0) {
                                i15++;
                            }
                        }
                    }
                    this.f489bg = ((this.f487be - i15) * 12) - 5;
                    if (this.f489bg > this.f507by) {
                        this.f489bg = this.f505bw + 2;
                        this.f491bi = this.f507by / 12;
                    } else {
                        this.f489bg = this.f505bw + ((this.f507by - this.f489bg) / 2) + 2;
                        this.f491bi = this.f487be - i15;
                    }
                    if (this.f486bd >= this.f487be || this.f486bd <= 0) {
                        this.f486bd = m160c(-1, 1);
                    }
                    this.f342I = false;
                }
                byte b2 = 4;
                byte b3 = 0;
                int i20 = this.f490bh;
                int i21 = 0;
                while (true) {
                    int i22 = i21;
                    int i23 = i20;
                    byte b4 = b3;
                    if (i22 >= this.f491bi) {
                        this.f352R = m160c(i23 + (-1), 1) >= 0;
                    } else {
                        if ((this.f501bs == 59 || this.f501bs == 86) && this.f519d.f82g[this.f408ai[i22 + b4]] <= 0) {
                            i22--;
                            i23--;
                            b3 = (byte) (b4 + 1);
                        } else {
                            byte b5 = (this.f486bd == m160c(i23 + (-1), 1) || this.f486bd == i23 + (-1)) ? (byte) (b2 - 2) : b2;
                            if (this.f501bs == 81) {
                                this.f453b.m231a(120, ((this.f489bg + (i22 * 12)) - b5) - ((this.f496bn == 0 || !(this.f486bd == this.f490bh + i22 || this.f486bd + this.f496bn == this.f490bh + i22)) ? 0 : this.f496bn), 1, (String) this.f450b.f14b.elementAt(this.f490bh + i22), -1);
                            } else if (this.f501bs == 48) {
                                this.f453b.m231a(120, ((this.f489bg + (i22 * 12)) - b5) - ((this.f496bn == 0 || !(this.f486bd == this.f490bh + i22 || this.f486bd + this.f496bn == this.f490bh + i22)) ? 0 : this.f496bn), 1, this.f519d.f53b[this.f490bh + i22], -1);
                            } else if (this.f501bs == 59 || this.f501bs == 86) {
                                byte b6 = this.f408ai[this.f490bh + i22 + b4];
                                this.f453b.m231a(120, ((this.f489bg + (i22 * 12)) - b5) - ((this.f496bn == 0 || !(this.f486bd == this.f490bh + i22 || this.f486bd + this.f496bn == this.f490bh + i22)) ? 0 : this.f496bn), 1, new StringBuffer().append(this.f519d.f46a[2][b6]).append(" - ").append(this.f519d.f46a[3][b6]).toString(), -1);
                            } else if (this.f501bs == 7) {
                                if (i22 + this.f490bh > (this.f379aH == 1 ? Math.min(this.f445ay, (int) this.f365aB[this.f546p[134] + this.f367aC]) : 0)) {
                                    if (this.f501bs != 7) {
                                        iMin = -1;
                                    } else if (this.f379aH == 1) {
                                        iMin = Math.min(this.f445ay, (int) this.f365aB[this.f546p[134] + this.f367aC]);
                                    } else {
                                        iMin = 0;
                                    }
                                    i11 = (this.f379aH - 1) * 50;
                                    i12 = iMin;
                                    while (i11 < this.f379aH * 50) {
                                        if (this.f541l[i11] >= 0) {
                                            i14 = i12 + 1;
                                            if (i23 == i14) {
                                                C0009j c0009j2 = this.f453b;
                                                int i24 = (this.f489bg + (i22 * 12)) - b5;
                                                if (this.f496bn == 0) {
                                                    i13 = 0;
                                                } else {
                                                    i13 = 0;
                                                }
                                                c0009j2.m231a(120, i24 - i13, 1, this.f524e[i11], -1);
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i11++;
                                        i12 = i14;
                                    }
                                    C0009j c0009j3 = this.f453b;
                                    int i25 = (this.f489bg + (i22 * 12)) - b5;
                                    if (this.f496bn == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = 0;
                                    }
                                    c0009j3.m231a(120, i25 - i13, 1, this.f524e[i11], -1);
                                } else if (this.f501bs == 57) {
                                    if (this.f501bs != 7) {
                                        iMin = -1;
                                    } else if (this.f379aH == 1) {
                                        iMin = Math.min(this.f445ay, (int) this.f365aB[this.f546p[134] + this.f367aC]);
                                    } else {
                                        iMin = 0;
                                    }
                                    i11 = (this.f379aH - 1) * 50;
                                    i12 = iMin;
                                    while (i11 < this.f379aH * 50) {
                                        if (this.f541l[i11] >= 0) {
                                            i14 = i12 + 1;
                                            if (i23 == i14) {
                                                C0009j c0009j4 = this.f453b;
                                                int i26 = (this.f489bg + (i22 * 12)) - b5;
                                                if (this.f496bn == 0 && (this.f486bd == this.f490bh + i22 || this.f486bd + this.f496bn == this.f490bh + i22)) {
                                                    i13 = this.f496bn;
                                                } else {
                                                    i13 = 0;
                                                }
                                                c0009j4.m231a(120, i26 - i13, 1, this.f524e[i11], -1);
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i11++;
                                        i12 = i14;
                                    }
                                    C0009j c0009j5 = this.f453b;
                                    int i27 = (this.f489bg + (i22 * 12)) - b5;
                                    if (this.f496bn == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = 0;
                                    }
                                    c0009j5.m231a(120, i27 - i13, 1, this.f524e[i11], -1);
                                } else if (this.f501bs == 98) {
                                    C0009j c0009j6 = this.f453b;
                                    int i28 = (this.f489bg + (i22 * 12)) - b5;
                                    if (this.f496bn == 0 && (this.f486bd == this.f490bh + i22 || this.f486bd + this.f496bn == this.f490bh + i22)) {
                                        i10 = this.f496bn;
                                    } else {
                                        i10 = 0;
                                    }
                                    c0009j6.m231a(120, i28 - i10, 1, new StringBuffer().append(this.f490bh + i22 + 1).append(" зв. - ").append(this.f519d.f46a[2][i22 + 3 + this.f490bh]).toString(), -1);
                                } else {
                                    if (this.f501bs != 7) {
                                        while (((this.f531h >> this.f365aB[(this.f546p[80] + (this.f365aB[this.f546p[81] + this.f501bs] & 255)) + i23]) & 1) == 0) {
                                            i23++;
                                        }
                                    }
                                    C0009j c0009j7 = this.f453b;
                                    int i29 = (this.f489bg + (i22 * 12)) - b5;
                                    if (this.f496bn == 0 && (this.f486bd == i23 || m160c(this.f486bd, this.f496bn) == i23)) {
                                        i6 = this.f496bn;
                                    } else {
                                        i6 = 0;
                                    }
                                    int i30 = i29 - i6;
                                    if (this.f501bs == 7) {
                                        if (this.f379aH == 1) {
                                            i9 = i23;
                                        } else {
                                            i9 = 7;
                                        }
                                        i7 = i9 + 115;
                                    } else {
                                        i7 = this.f365aB[this.f546p[80] + (this.f365aB[this.f546p[81] + this.f501bs] & 255) + i23] + 0;
                                    }
                                    if (this.f501bs == 11) {
                                        i8 = 0;
                                    } else if (i22 == 0) {
                                        i8 = this.f383aJ;
                                    } else {
                                        i8 = this.f519d.f69e;
                                    }
                                    c0009j7.m235f(120, i30, 1, i7 + i8);
                                }
                            } else if (this.f501bs == 57) {
                                if (this.f501bs != 7) {
                                    iMin = -1;
                                } else if (this.f379aH == 1) {
                                    iMin = Math.min(this.f445ay, (int) this.f365aB[this.f546p[134] + this.f367aC]);
                                } else {
                                    iMin = 0;
                                }
                                i11 = (this.f379aH - 1) * 50;
                                i12 = iMin;
                                while (i11 < this.f379aH * 50) {
                                    if (this.f541l[i11] >= 0) {
                                        i14 = i12 + 1;
                                        if (i23 == i14) {
                                            C0009j c0009j8 = this.f453b;
                                            int i210 = (this.f489bg + (i22 * 12)) - b5;
                                            if (this.f496bn == 0) {
                                                i13 = 0;
                                            } else {
                                                i13 = 0;
                                            }
                                            c0009j8.m231a(120, i210 - i13, 1, this.f524e[i11], -1);
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i11++;
                                    i12 = i14;
                                }
                                C0009j c0009j9 = this.f453b;
                                int i211 = (this.f489bg + (i22 * 12)) - b5;
                                if (this.f496bn == 0) {
                                    i13 = 0;
                                } else {
                                    i13 = 0;
                                }
                                c0009j9.m231a(120, i211 - i13, 1, this.f524e[i11], -1);
                            } else if (this.f501bs == 98) {
                                C0009j c0009j10 = this.f453b;
                                int i212 = (this.f489bg + (i22 * 12)) - b5;
                                if (this.f496bn == 0) {
                                    i10 = 0;
                                } else {
                                    i10 = 0;
                                }
                                c0009j10.m231a(120, i212 - i10, 1, new StringBuffer().append(this.f490bh + i22 + 1).append(" зв. - ").append(this.f519d.f46a[2][i22 + 3 + this.f490bh]).toString(), -1);
                            } else {
                                if (this.f501bs != 7) {
                                    while (((this.f531h >> this.f365aB[(this.f546p[80] + (this.f365aB[this.f546p[81] + this.f501bs] & 255)) + i23]) & 1) == 0) {
                                        i23++;
                                    }
                                }
                                C0009j c0009j11 = this.f453b;
                                int i213 = (this.f489bg + (i22 * 12)) - b5;
                                if (this.f496bn == 0) {
                                    i6 = 0;
                                } else {
                                    i6 = 0;
                                }
                                int i31 = i213 - i6;
                                if (this.f501bs == 7) {
                                    if (this.f379aH == 1) {
                                        i9 = i23;
                                    } else {
                                        i9 = 7;
                                    }
                                    i7 = i9 + 115;
                                } else {
                                    i7 = this.f365aB[this.f546p[80] + (this.f365aB[this.f546p[81] + this.f501bs] & 255) + i23] + 0;
                                }
                                if (this.f501bs == 11) {
                                    i8 = 0;
                                } else if (i22 == 0) {
                                    i8 = this.f383aJ;
                                } else {
                                    i8 = this.f519d.f69e;
                                }
                                c0009j11.m235f(120, i31, 1, i7 + i8);
                            }
                            if (i23 == this.f486bd) {
                                if (this.f496bn != 0) {
                                    this.f492bj = (this.f453b.f614u[this.f453b.f593ck] + this.f492bj) / 2;
                                } else {
                                    this.f492bj = this.f453b.f614u[this.f453b.f593ck];
                                }
                            }
                            if (i23 == this.f486bd) {
                                this.f517ch = this.f489bg + (i22 * 12);
                            }
                            b3 = b4;
                            b2 = b5;
                        }
                        i21 = i22 + 1;
                        i20 = i23 + 1;
                    }
                    break;
                }
                break;
            case 3:
                if (this.f352R) {
                    if (i2 == 0) {
                        m178f(i3, i4, i5);
                    } else if (this.f410aj[13] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[13], -1);
                    }
                }
                break;
            case 4:
                if (this.f490bh > 0) {
                    if (i2 == 0) {
                        m178f(i3, i4, i5);
                    } else if (this.f410aj[12] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[12], -1);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private void m183g(boolean z) {
        String string;
        this.f468bL = this.f379aH == 2 ? 1 : 0;
        this.f518ci = 0;
        try {
            this.f424aq = this.f426ar;
            if (this.f379aH != 2 || this.f519d.f113o == 0) {
                if (z) {
                    string = new StringBuffer("aow22").append(this.f379aH == 0 ? "1" : this.f379aH == 1 ? "4" : "5").toString();
                } else {
                    string = "aow227";
                }
                this.f357a = RecordStore.openRecordStore(string, true);
                if (this.f357a.getNumRecords() > 0) {
                    this.f518ci = this.f357a.getRecord(1, this.f426ar, this.f468bL);
                }
            } else {
                this.f518ci = this.f469bM - 1;
                if (this.f501bs == 71) {
                    m192l(17000);
                    this.f468bL = 1;
                }
            }
            if (this.f518ci > 0) {
                try {
                    this.f519d.f109n = m111a();
                    this.f519d.f101l = m111a();
                    this.f519d.f98k = m181g();
                    this.f452b.f299s = m181g();
                    this.f452b.f302t = m181g();
                    this.f452b.f156C = m111a();
                    this.f452b.f199R = m111a();
                    this.f385aK = m111a();
                    this.f387aL = m111a();
                    this.f452b.f202S = m111a();
                    this.f452b.f205T = m111a();
                    this.f452b.f159D = m181g();
                    this.f452b.f162E = m181g();
                    this.f452b.f208U = m111a();
                    this.f452b.f229aa = m111a();
                    this.f452b.f214W = m111a();
                    this.f452b.f217X = m111a();
                    this.f452b.f220Y = m111a();
                    this.f452b.f223Z = m111a();
                    this.f452b.f323z = m111a();
                    this.f452b.f147A = m111a();
                    this.f452b.f268d = m113a();
                    this.f452b.f167G = m111a();
                    this.f452b.f170H = m111a();
                    this.f452b.f173I = m111a();
                    this.f452b.f176J = m111a();
                    this.f409aj = m111a();
                    this.f411ak = m111a();
                    this.f467bK = m111a();
                    this.f372aE = m111a();
                    if (this.f519d.f88i < 2) {
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= 2) {
                                break;
                            }
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 < 4) {
                                    for (int i5 = 0; i5 < 128; i5++) {
                                        this.f519d.f49a[i2][0][i4][i5] = m181g();
                                    }
                                    i3 = i4 + 1;
                                }
                            }
                            i = i2 + 1;
                        }
                    } else if (this.f519d.f88i < 3) {
                        for (int i6 = 0; i6 < 4; i6++) {
                            for (int i7 = 0; i7 < 128; i7++) {
                                Object[] objArr = 0;
                                objArr[i7] = m181g();
                            }
                        }
                    }
                    int iM181g = m181g();
                    for (int i8 = 0; i8 < iM181g; i8++) {
                        this.f542l[m111a()][m111a()] = (short) (m111a() + 121);
                    }
                    int iM181g2 = m181g();
                    for (int i9 = 0; i9 < iM181g2; i9++) {
                        this.f542l[m111a()][m111a()] = (short) ((m111a() & 255) + 1001);
                    }
                    this.f482bZ = 0;
                    m157b(null, null, this.f519d.f63c[0], null, 18, 0, 10, 65536);
                    m157b(null, null, this.f519d.f63c[1], null, 18, 0, 10, 65536);
                    for (int i10 = 1; i10 <= 4; i10++) {
                        m157b(null, this.f335E[i10], null, null, 7, 0, 51, 0);
                    }
                    int i11 = 0;
                    for (int i12 = 0; i12 < 72; i12++) {
                        if (this.f365aB[this.f546p[8] + i12] > 0) {
                            m157b(null, this.f371aD, null, null, this.f365aB[this.f546p[8] + i12], i11 + 1, 100, this.f365aB[this.f546p[9] + i12] & 255);
                        } else {
                            for (int i13 = 1; i13 < 101; i13++) {
                                this.f371aD[i11 + i13] = 0;
                            }
                        }
                        i11 += 101;
                    }
                    m157b(null, this.f452b.f181K, null, null, 5, 0, 60, 1);
                    m157b(null, this.f452b.f184L, null, null, 6, 0, 60, 1);
                    m157b(null, this.f452b.f187M, null, null, 7, 0, 60, 1);
                    m157b(null, this.f452b.f312w, null, null, 7, 0, 400, 0);
                    m157b(null, this.f452b.f316x, null, null, 7, 0, 400, 0);
                    m157b(null, this.f452b.f321y, null, null, 5, 0, 400, 16);
                    m157b(null, this.f452b.f326z, null, null, 5, 0, 400, 16);
                    m157b(null, this.f452b.f149A, null, null, 8, 0, 400, 128);
                    m157b(null, this.f452b.f153B, null, null, 8, 0, 400, 128);
                    m157b(null, this.f452b.f157C, null, null, 8, 0, 400, 128);
                    m157b(null, this.f452b.f160D, null, null, 8, 0, 400, 128);
                    m157b(null, this.f452b.f163E, null, null, 8, 0, 400, 128);
                    m157b(null, this.f452b.f166F, null, null, 5, 0, 400, 0);
                    m157b(null, this.f452b.f169G, null, null, 5, 0, 400, 1);
                    m157b(null, this.f452b.f172H, null, null, 5, 0, 400, 1);
                    m157b(null, this.f452b.f175I, null, null, 5, 0, 400, 1);
                    m157b(null, this.f452b.f178J, null, null, 5, 0, 400, 1);
                    m157b(this.f452b.f227a, null, null, null, 1, 0, 3, 0);
                    m157b(null, this.f452b.f216W, null, null, 5, 0, 3, 0);
                    m157b(null, this.f452b.f225Z, null, null, 5, 0, 3, 0);
                    m157b(this.f452b.f262b, null, null, null, 1, 0, 3, 0);
                    m157b(this.f452b.f266c, null, null, null, 1, 0, 3, 0);
                    m157b(null, this.f452b.f294p[0], null, null, 5, 0, 3, 1);
                    m157b(null, this.f452b.f294p[1], null, null, 5, 0, 3, 1);
                    m157b(null, this.f452b.f219X, null, null, 5, 0, 3, 1);
                    m157b(null, null, null, this.f452b.f269d, 24, 0, 3, 1);
                    m157b(null, null, null, this.f452b.f273e, 24, 0, 3, 1);
                    m157b(null, null, null, this.f452b.f276f, 24, 0, 3, 1);
                    this.f485bc = m111a();
                    this.f452b.m104d(this.f485bc);
                    this.f452b.f211V = m111a();
                    if (this.f379aH == 2 && this.f519d.f113o == 1) {
                        if (this.f501bs == 71) {
                            this.f468bL = 17000;
                        }
                        RunnableC0002c runnableC0002c = this.f519d;
                        runnableC0002c.f109n = (byte) (runnableC0002c.f109n ^ 1);
                        this.f452b.f323z = m111a();
                        this.f452b.f147A = m111a();
                        this.f409aj = m111a();
                        this.f411ak = m111a();
                        this.f467bK = m111a();
                        this.f482bZ = 0;
                        for (int i14 = 1; i14 <= 4; i14++) {
                            m157b(null, this.f335E[i14], null, null, 7, 0, 51, 0);
                        }
                        if (this.f452b.f167G != 0) {
                            this.f452b.f167G = (byte) (((this.f452b.f167G - 1) ^ 1) + 1);
                        }
                    }
                } catch (Exception e) {
                }
            }
            if (this.f379aH != 2 || this.f519d.f113o == 0) {
                this.f357a.closeRecordStore();
            }
            this.f335E[0][50] = 0;
            for (int i15 = (this.f519d.f109n * 50) + 1; i15 <= (this.f519d.f109n + 1) * 50; i15++) {
                byte[] bArr = this.f371aD;
                int i16 = i15 + 2929;
                bArr[i16] = (byte) (bArr[i16] & 254);
            }
            for (int i17 = 0; i17 < 48; i17++) {
                if ((this.f452b.f268d & (1 << i17)) != 0) {
                    boolean z2 = true;
                    for (int i18 = ((i17 / 24) * 50) + 1; i18 <= ((i17 / 24) + 1) * 50; i18++) {
                        if (((this.f371aD[i18 + 5454] + 1) & 255) > 1 && ((this.f371aD[i18 + 5656] == 4 || this.f371aD[i18 + 5656] == 12) && this.f371aD[i18 + 6868] == i17)) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        this.f452b.m107g(i17);
                    }
                }
            }
            for (int i19 = 0; i19 < 2; i19++) {
                this.f452b.m106f(i19);
            }
            for (int i20 = 1; i20 < 101; i20++) {
                this.f371aD[i20 + 5151] = -1;
            }
            for (int i21 = 1; i21 <= 100; i21++) {
                if (this.f371aD[i21 + 5454] != 0) {
                    for (int i22 = 0; i22 < this.f519d.f92i[18][this.f371aD[i21 + 5656]]; i22++) {
                        for (int i23 = 0; i23 < this.f519d.f92i[19][this.f371aD[i21 + 5656]]; i23++) {
                            this.f542l[this.f371aD[i21 + 6464] + i23][this.f371aD[i21 + 6363] + i22] = (short) (-i21);
                        }
                    }
                }
            }
            for (byte b = 1; b <= 100; b = (byte) (b + 1)) {
                if (this.f371aD[b + 1616] != 0) {
                    if (this.f542l[this.f371aD[b + 101]][this.f371aD[b]] == 0) {
                        this.f542l[this.f371aD[b + 101]][this.f371aD[b]] = b;
                    }
                    if ((this.f371aD[b + 2828] & 16) != 0 && this.f542l[this.f371aD[b + 101] + this.f365aB[this.f546p[1] + 8 + this.f371aD[b + 404]]][this.f371aD[b] + this.f365aB[this.f546p[1] + this.f371aD[b + 404]]] == 0) {
                        this.f542l[this.f371aD[b + 101] + this.f365aB[this.f546p[1] + 8 + this.f371aD[b + 404]]][this.f371aD[b] + this.f365aB[this.f546p[1] + this.f371aD[b + 404]]] = 127;
                    }
                }
            }
            this.f452b.m97S();
            if (this.f519d.f88i < 2) {
                this.f452b.m98T();
            }
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 >= 3) {
                    return;
                }
                if (this.f452b.f216W[b3] > 0) {
                    this.f452b.f291m[b3][50] = (byte) (this.f365aB[(this.f546p[108] + this.f452b.f216W[b3]) + 1] - this.f365aB[this.f546p[108] + this.f452b.f216W[b3]]);
                    for (byte b4 = 0; b4 < this.f452b.f291m[b3][50]; b4 = (byte) (b4 + 1)) {
                        this.f452b.f291m[b3][b4] = this.f452b.f210U[this.f365aB[this.f546p[107] + this.f365aB[this.f546p[108] + this.f452b.f216W[b3]] + b4]];
                    }
                }
                b2 = (byte) (b3 + 1);
            }
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m184g() {
        byte bM103b;
        if (this.f526f == 135) {
            if (this.f519d.f94j < 0) {
                this.f426ar[0] = 3;
                this.f426ar[1] = (byte) (-this.f359a);
                this.f426ar[2] = 0;
                this.f469bM = 3;
            }
            if (this.f371aD[6767 - this.f359a] >= 0) {
                for (int i = this.f371aD[6767 - this.f359a]; i < 60 && this.f452b.f187M[i] == (-this.f359a); i++) {
                    this.f452b.f187M[i] = 0;
                }
                this.f371aD[6767 - this.f359a] = -1;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f487be; i3++) {
                if (this.f414al[i3] > 0) {
                    i2++;
                    if (this.f519d.f94j < 0) {
                        this.f426ar[this.f469bM] = (byte) i3;
                        this.f426ar[this.f469bM + 1] = this.f414al[i3];
                        byte[] bArr = this.f426ar;
                        bArr[2] = (byte) (bArr[2] + 1);
                        this.f469bM += 2;
                    }
                }
            }
            if (i2 > 0) {
                byte bM103b2 = this.f452b.m103b(i2);
                if (bM103b2 >= 0) {
                    int i4 = 0;
                    for (byte b = 0; b < this.f487be; b = (byte) (b + 1)) {
                        if (this.f414al[b] > 0) {
                            this.f452b.f187M[bM103b2 + i4] = (byte) (-this.f359a);
                            this.f452b.f181K[bM103b2 + i4] = b;
                            this.f452b.f184L[bM103b2 + i4] = this.f414al[b];
                            i4++;
                        }
                    }
                    this.f371aD[6767 - this.f359a] = bM103b2;
                }
            } else if (this.f371aD[6868 - this.f359a] >= 0 && (bM103b = this.f452b.m103b(1)) >= 0) {
                this.f452b.f187M[bM103b] = (byte) (-this.f359a);
                this.f452b.f181K[bM103b] = this.f371aD[6868 - this.f359a];
                this.f452b.f184L[bM103b] = 0;
                this.f371aD[6767 - this.f359a] = bM103b;
            }
        }
        if (this.f526f != 137) {
            return false;
        }
        if ((this.f452b.f268d & (1 << this.f486bd)) != 0 || (this.f452b.f272e & (1 << this.f486bd)) == 0) {
            return true;
        }
        if (this.f519d.f63c[this.f519d.f109n][4] < this.f547q[this.f548r[7] + this.f486bd]) {
            this.f410aj[5] = 0;
            return true;
        }
        this.f371aD[6868 - this.f359a] = (byte) this.f486bd;
        this.f371aD[6767 - this.f359a] = 100;
        this.f371aD[6565 - this.f359a] = 0;
        this.f452b.f268d |= 1 << this.f486bd;
        short[] sArr = this.f519d.f63c[this.f519d.f109n];
        sArr[4] = (short) (sArr[4] - this.f547q[this.f548r[7] + this.f486bd]);
        if (this.f519d.f94j >= 0) {
            return false;
        }
        this.f426ar[0] = 5;
        this.f426ar[1] = (byte) (-this.f359a);
        this.f426ar[2] = (byte) this.f486bd;
        this.f469bM = 3;
        return false;
    }

    /* JADX INFO: renamed from: h */
    private void m185h(int i, int i2, int i3, int i4, int i5) {
        byte b = this.f365aB[this.f546p[159] + (this.f365aB[this.f546p[157] + this.f360aA] & 255) + this.f363aB];
        switch (i) {
            case 0:
                if (this.f366aC == 0 && i2 == 0) {
                    m217e(b + i3, i4, i5);
                    break;
                } else if (this.f366aC < 0 && i2 == 1) {
                    m221o(i3 + b, i4, i5, (-this.f366aC) - 1, -1);
                    break;
                } else if (this.f366aC > 1 && i2 == 2) {
                    m221o(i3 + b, i4, i5, this.f366aC - 1, -1);
                    break;
                }
                break;
            case 1:
                if (this.f345K) {
                    this.f504bv = i4;
                    this.f505bw = i5;
                }
                break;
            case 2:
                if (this.f345K) {
                    this.f506bx = i4 - this.f504bv;
                    this.f507by = i5 - this.f505bw;
                    this.f453b.m230a(this.f504bv, this.f505bw, this.f506bx, this.f507by, 2, this.f508bz, 0);
                    this.f345K = false;
                }
                this.f453b.m234b(this.f455b[this.f429at]);
                break;
            case 3:
                if (!this.f453b.f573X) {
                    if (i2 == 0) {
                        m178f(i3, i4, i5);
                    } else if (this.f410aj[13] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[13], -1);
                    }
                }
                break;
            case 4:
                if (!this.f453b.f572W) {
                    if (i2 == 0) {
                        m178f(i3, i4, i5);
                    } else if (this.f410aj[12] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[12], -1);
                    }
                }
                break;
            case 5:
                this.f453b.m235f(i4, i5, 0, b + 126);
                break;
            case 6:
                this.f453b.m235f(i4, i5, 0, b + 130);
                break;
            case 7:
                this.f453b.m235f(i4, i5, 0, b + 134);
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m186h() {
        int i;
        int i2 = 0;
        if (this.f501bs == 28) {
            this.f336F = true;
            m127aL();
        }
        if (this.f501bs == 0) {
            this.f519d.f109n = (byte) 1;
            this.f519d.f94j = 0;
        }
        if (this.f501bs == 80 && this.f486bd < 2) {
            this.f519d.f113o = (byte) this.f486bd;
            this.f348N = false;
        }
        if ((this.f501bs == 19 || this.f501bs == 25 || this.f501bs == 26) && this.f379aH == 2 && this.f519d.f127u) {
            this.f426ar[0] = -4;
            this.f469bM = 1;
            this.f519d.f127u = false;
        }
        if (this.f501bs == 24 && this.f379aH == 2 && this.f519d.f127u) {
            this.f426ar[0] = -5;
            this.f469bM = 1;
            this.f519d.f127u = false;
        }
        if (this.f501bs == 82) {
            this.f497bo = 82;
            this.f498bp = this.f486bd;
        }
        if (this.f501bs == 76) {
            if (this.f375aF > 0 && this.f375aF == this.f397aS) {
                this.f370aD |= (((this.f396aR - 3) << 1) + 1) << this.f395aQ;
                this.f367aC = (this.f370aD & 1) + ((this.f370aD >> 1) & 1);
                m126aJ();
            }
            this.f406ah = (byte) 0;
            this.f375aF = 0;
            this.f396aR = 0;
            m127aL();
        }
        if (this.f501bs == 91) {
            this.f519d.f109n = (byte) this.f486bd;
        }
        if (this.f501bs == 93) {
            if (this.f486bd == 0) {
                i = 23;
            } else {
                i = this.f486bd == 1 ? 22 : 20;
            }
            this.f485bc = i;
        }
        if (this.f501bs == 73) {
            this.f450b.f0a = (byte) -1;
            this.f519d.f124t = (byte) -1;
            this.f450b.m4a();
        }
        if (this.f501bs == 17 && this.f379aH == 2) {
            this.f360aA = (byte) -1;
            m207a(71, true);
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 26 && this.f379aH == 2) {
            m207a(12, true);
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 0 && this.f486bd < 3) {
            this.f379aH = this.f486bd;
            this.f519d.f94j = this.f486bd < 2 ? 0 : -1;
            if ((this.f379aH == 0 && this.f436av < 0 && this.f519d.f63c[0][10] > 0) || (this.f379aH == 1 && this.f389aM > 0)) {
                this.f501bs = this.f379aH == 0 ? 4 : 6;
                this.f499bq = 0;
                this.f497bo = 0;
                int i3 = this.f486bd;
                this.f500br = i3;
                this.f498bp = i3;
                m207a(42, true);
                this.f519d.f120r = (byte) -1;
                return true;
            }
        }
        if ((this.f501bs == 1 || this.f501bs == 92) && this.f486bd == 0 && this.f519d.f94j < 0) {
            m207a(this.f519d.f127u ? 71 : 72, true);
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 72) {
            m207a(this.f519d.f113o == 0 ? 1 : 0, true);
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 81 && this.f450b.f0a == -1) {
            if (this.f450b.m5a(this.f486bd)) {
                this.f519d.f106m = m112a((String) this.f450b.f14b.elementAt(this.f486bd));
                this.f450b.f0a = (byte) 2;
                this.f519d.f124t = (byte) 1;
            } else {
                m207a(68, true);
            }
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 57) {
            this.f497bo = 57;
            this.f498bp = this.f486bd;
            m207a(58, true);
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 8) {
            if (this.f545o[this.f486bd] == 0) {
                m207a(59, true);
            } else {
                this.f499bq = 8;
                this.f497bo = 8;
                int i4 = this.f486bd;
                this.f500br = i4;
                this.f498bp = i4;
                m207a(this.f446ay[this.f486bd] < 2 ? 54 : 55, true);
            }
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 59 || this.f501bs == 86) {
            int i5 = this.f501bs;
            this.f499bq = i5;
            this.f497bo = i5;
            int i6 = this.f486bd;
            this.f500br = i6;
            this.f498bp = i6;
            this.f391aN = 4;
            this.f405ag = (byte) 0;
            while (this.f405ag < 5) {
                if (this.f519d.f82g[this.f408ai[this.f405ag]] > 0) {
                    if (this.f486bd == i2) {
                        break;
                    }
                    i2++;
                }
                this.f405ag = (byte) (this.f405ag + 1);
            }
            this.f405ag = this.f408ai[this.f405ag];
            m207a(34, true);
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 48) {
            this.f519d.f116p = (byte) this.f486bd;
            while (i2 < this.f453b.f611m[1][50] - this.f453b.f611m[1][49]) {
                this.f453b.f570M[1][this.f453b.f611m[1][220] + i2] = this.f453b.f570M[1][this.f453b.f611m[1][49] + i2];
                this.f453b.f571N[1][this.f453b.f611m[1][220] + i2] = this.f453b.f571N[1][this.f453b.f611m[1][49] + i2];
                i2++;
            }
            this.f453b.f611m[1][221] = (short) ((this.f453b.f611m[1][220] + this.f453b.f611m[1][50]) - this.f453b.f611m[1][49]);
            if (this.f350P) {
                this.f519d.m25b(2);
            } else {
                this.f390aN = (byte) 2;
                this.f477bU += 5;
                m122aF();
                this.f477bU -= 5;
            }
            m207a(60, true);
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 60) {
            this.f519d.f53b = null;
            this.f519d.m25b(1);
            if (this.f519d.f116p == 1 && C0010k.currentTimeMillis() <= 1259583723485L) {
                this.f519d.f46a[0][3] = new StringBuffer().append(this.f512cc | this.f513cd).toString();
                this.f519d.f46a[1][3] = String.valueOf(new char[]{'6', '1', '0'});
            }
            m127aL();
        }
        if (this.f501bs == 75 && this.f328A) {
            m207a(50, true);
            this.f499bq = 27;
            this.f497bo = 27;
            this.f328A = false;
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 15 && this.f508bz < (this.f365aB[this.f546p[157] + 1] & 255) - 1) {
            this.f508bz++;
            this.f345K = true;
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 98) {
            this.f391aN = this.f367aC;
            this.f405ag = (byte) (this.f486bd + 3);
            m207a(34, true);
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 7) {
            if (this.f486bd <= (this.f379aH == 1 ? Math.min(this.f445ay, (int) this.f365aB[this.f546p[134] + this.f367aC]) : 0)) {
                this.f448az = this.f379aH == 1 ? this.f486bd : 7;
            } else {
                this.f448az = (this.f379aH - 1) * 50;
                int i7 = 0;
                while (this.f448az < this.f379aH * 50) {
                    if (this.f541l[this.f448az] >= 0) {
                        i7++;
                        if (i7 == this.f486bd - (this.f379aH == 1 ? Math.min(this.f445ay, (int) this.f365aB[this.f546p[134] + this.f367aC]) : 0)) {
                            break;
                        }
                    }
                    this.f448az++;
                }
                this.f448az += 8;
            }
            if (this.f379aH == 1) {
                m207a(10, true);
            } else {
                m207a(91, true);
                this.f381aI = 0;
            }
            this.f519d.f120r = (byte) -1;
            return true;
        }
        if (this.f501bs == 27) {
            this.f383aJ = 1;
            this.f519d.m28l();
        }
        if (this.f501bs == 10) {
            this.f381aI = this.f486bd;
            if (this.f379aH == 0) {
                this.f361aA = this.f381aI;
            } else {
                this.f364aB = this.f381aI;
            }
            m127aL();
        }
        if (this.f501bs == 12) {
            if ((this.f379aH == 0 && this.f448az < 0) || (this.f379aH == 1 && this.f448az > 6)) {
                this.f501bs = 0;
                this.f499bq = 0;
                this.f497bo = 0;
                this.f500br = 0;
                this.f498bp = 0;
                if (this.f379aH != 0) {
                    m207a(33, true);
                } else {
                    m207a(47, true);
                }
                this.f519d.f120r = (byte) -1;
                return true;
            }
            if (this.f379aH != 0) {
                this.f501bs = -1;
                m207a(0, true);
                this.f519d.f120r = (byte) -1;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private void m187i(int i, int i2, int i3, int i4, int i5) {
        StringBuffer stringBuffer;
        short[] sArr;
        C0009j c0009j;
        char c = '\n';
        if (i == 6 && this.f501bs == 12) {
            return;
        }
        if (i == 6 || this.f501bs == 12) {
            switch (i) {
                case 0:
                    switch (i2) {
                        case 0:
                            this.f453b.m235f(i4, i5, 0, 138);
                            break;
                        case 1:
                            int i6 = ((this.f519d.f98k * 100) / 1000) % 60;
                            int i7 = ((this.f519d.f98k * 100) / 60000) % 60;
                            int i8 = (this.f519d.f98k * 100) / 3600000;
                            this.f453b.m231a(i4, i5, 2, new StringBuffer().append(i8 < 10 ? "0" : "").append(i8).append(i7 < 10 ? ":0" : ":").append(i7).append(i6 < 10 ? ":0" : ":").append(i6).toString(), -1);
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            if (this.f501bs == 12) {
                                m217e(i3, i4, i5);
                            }
                            break;
                    }
                    return;
                case 1:
                    switch (i2) {
                        case 0:
                            this.f453b.m235f(i4, i5, 1, 139);
                            break;
                        case 1:
                            this.f453b.m231a(i4, i5, 0, new StringBuffer().append((int) this.f519d.f63c[this.f519d.f109n][5]).toString(), -1);
                            break;
                    }
                    return;
                case 2:
                    c0009j = this.f453b;
                    stringBuffer = new StringBuffer();
                    sArr = this.f519d.f63c[this.f519d.f109n];
                    c = 6;
                    break;
                case 3:
                    switch (i2) {
                        case 0:
                            this.f453b.m235f(i4, i5, 1, 140);
                            break;
                        case 1:
                            this.f453b.m231a(i4, i5, 0, new StringBuffer().append((int) this.f519d.f63c[this.f519d.f109n][7]).toString(), -1);
                            break;
                    }
                    return;
                case 4:
                    c0009j = this.f453b;
                    stringBuffer = new StringBuffer();
                    sArr = this.f519d.f63c[this.f519d.f109n];
                    c = '\b';
                    break;
                case 5:
                    switch (i2) {
                        case 0:
                            this.f453b.m235f(i4, i5, 0, 141);
                            break;
                        case 1:
                            this.f453b.m231a(i4, i5, 2, new StringBuffer().append((int) this.f519d.f63c[this.f519d.f109n][9]).toString(), -1);
                            break;
                    }
                    return;
                case 6:
                    switch (i2) {
                        case 0:
                            this.f453b.m235f(i4, i5, 1, (this.f379aH == 0 ? this.f448az : 7) + 107);
                            break;
                        case 1:
                            if (this.f448az > 7) {
                                this.f453b.m231a(i4, i5, 1, this.f524e[(this.f448az - 7) - 1], -1);
                            } else {
                                this.f453b.m235f(i4, i5, 1, this.f448az + 115);
                            }
                            break;
                    }
                    return;
                case 7:
                    switch (i2) {
                        case 0:
                            this.f453b.m235f(i4, i5, 0, 142);
                            return;
                        case 1:
                            C0009j c0009j2 = this.f453b;
                            stringBuffer = new StringBuffer();
                            sArr = this.f519d.f63c[this.f379aH == 0 ? (byte) 0 : this.f519d.f109n];
                            if (this.f379aH != 0) {
                                c = '\t';
                                c0009j = c0009j2;
                            } else {
                                c0009j = c0009j2;
                            }
                            break;
                        default:
                            return;
                    }
                    break;
                default:
                    return;
            }
            c0009j.m231a(i4, i5, 2, stringBuffer.append((int) sArr[c]).toString(), -1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x010b  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x0159  */
    /* JADX WARN: Code duplicated, block: B:54:0x015c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x021e  */
    /* JADX INFO: renamed from: i */
    private boolean m188i() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        this.f359a = (short) 0;
        this.f413al = this.f409aj;
        this.f415am = this.f411ak;
        if (this.f519d.f88i < 2 && ((this.f519d.f49a[this.f519d.f109n][0][this.f409aj >> 5][this.f411ak] >> (this.f409aj & 31)) & 1) != 0) {
            if ((-this.f542l[this.f411ak][this.f409aj]) <= 100) {
                if (this.f542l[this.f411ak][this.f409aj] > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.f542l[this.f411ak][this.f409aj] > this.f519d.f109n * 50) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                } else if ((-this.f542l[this.f411ak][this.f409aj]) > this.f519d.f109n * 50) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    if (this.f371aD[this.f542l[this.f411ak][this.f409aj] + 1616] > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else if (((this.f371aD[5454 - this.f542l[this.f411ak][this.f409aj]] + 1) & 255) > 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.f519d.f88i < 2) {
                        this.f359a = this.f542l[this.f411ak][this.f409aj];
                        return z2;
                    }
                    if (((this.f519d.f49a[this.f519d.f109n][1][this.f409aj >> 5][this.f411ak] >> (this.f409aj & 31)) & 1) == 0) {
                    }
                    this.f359a = this.f542l[this.f411ak][this.f409aj];
                    return z2;
                }
            }
            if (this.f335E[0][50] > 0) {
                this.f359a = this.f542l[this.f411ak][this.f409aj];
                return false;
            }
        } else if (this.f519d.f88i == 2) {
            int[] iArr = null;
            if (((iArr[this.f411ak] >> (this.f409aj & 31)) & 1) != 0) {
                if ((-this.f542l[this.f411ak][this.f409aj]) <= 100) {
                    if (this.f542l[this.f411ak][this.f409aj] > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (this.f542l[this.f411ak][this.f409aj] > this.f519d.f109n * 50) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                    } else if ((-this.f542l[this.f411ak][this.f409aj]) > this.f519d.f109n * 50) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        if (this.f371aD[this.f542l[this.f411ak][this.f409aj] + 1616] > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else if (((this.f371aD[5454 - this.f542l[this.f411ak][this.f409aj]] + 1) & 255) > 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (this.f519d.f88i < 2) {
                            this.f359a = this.f542l[this.f411ak][this.f409aj];
                            return z2;
                        }
                        if (((this.f519d.f49a[this.f519d.f109n][1][this.f409aj >> 5][this.f411ak] >> (this.f409aj & 31)) & 1) == 0) {
                        }
                        this.f359a = this.f542l[this.f411ak][this.f409aj];
                        return z2;
                    }
                }
                if (this.f335E[0][50] > 0) {
                    this.f359a = this.f542l[this.f411ak][this.f409aj];
                    return false;
                }
            } else if (this.f519d.f88i > 2) {
                if ((-this.f542l[this.f411ak][this.f409aj]) <= 100 && this.f542l[this.f411ak][this.f409aj] <= 100 && this.f542l[this.f411ak][this.f409aj] != 0) {
                    if (this.f542l[this.f411ak][this.f409aj] > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (this.f542l[this.f411ak][this.f409aj] > this.f519d.f109n * 50 || this.f542l[this.f411ak][this.f409aj] > (this.f519d.f109n + 1) * 50) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else if ((-this.f542l[this.f411ak][this.f409aj]) > this.f519d.f109n * 50 || (-this.f542l[this.f411ak][this.f409aj]) > (this.f519d.f109n + 1) * 50) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z) {
                        if (this.f371aD[this.f542l[this.f411ak][this.f409aj] + 1616] > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else if (((this.f371aD[5454 - this.f542l[this.f411ak][this.f409aj]] + 1) & 255) > 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (this.f519d.f88i < 2) {
                            this.f359a = this.f542l[this.f411ak][this.f409aj];
                            return z2;
                        }
                        if (((this.f519d.f49a[this.f519d.f109n][1][this.f409aj >> 5][this.f411ak] >> (this.f409aj & 31)) & 1) == 0 || (!z && (this.f371aD[6060 - this.f542l[this.f411ak][this.f409aj]] & 2) != 0)) {
                            this.f359a = this.f542l[this.f411ak][this.f409aj];
                            return z2;
                        }
                    }
                }
                if (this.f335E[0][50] > 0 && this.f542l[this.f411ak][this.f409aj] >= ((this.f519d.f109n ^ 1) * 100) + 1001 && this.f542l[this.f411ak][this.f409aj] < (((this.f519d.f109n ^ 1) + 1) * 100) + 1001) {
                    this.f359a = this.f542l[this.f411ak][this.f409aj];
                    return false;
                }
            }
        } else if (this.f519d.f88i > 2) {
            if ((-this.f542l[this.f411ak][this.f409aj]) <= 100) {
                if (this.f542l[this.f411ak][this.f409aj] > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.f542l[this.f411ak][this.f409aj] > this.f519d.f109n * 50) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                } else if ((-this.f542l[this.f411ak][this.f409aj]) > this.f519d.f109n * 50) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    if (this.f371aD[this.f542l[this.f411ak][this.f409aj] + 1616] > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else if (((this.f371aD[5454 - this.f542l[this.f411ak][this.f409aj]] + 1) & 255) > 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.f519d.f88i < 2) {
                        this.f359a = this.f542l[this.f411ak][this.f409aj];
                        return z2;
                    }
                    if (((this.f519d.f49a[this.f519d.f109n][1][this.f409aj >> 5][this.f411ak] >> (this.f409aj & 31)) & 1) == 0) {
                    }
                    this.f359a = this.f542l[this.f411ak][this.f409aj];
                    return z2;
                }
            }
            if (this.f335E[0][50] > 0) {
                this.f359a = this.f542l[this.f411ak][this.f409aj];
                return false;
            }
        }
        int i2 = this.f335E[0][50] <= 0 ? this.f519d.f109n : this.f519d.f109n ^ 1;
        int i3 = 10000;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        for (int iMax = Math.max(this.f411ak - 1, 0); iMax <= Math.min(this.f411ak + 1, this.f452b.f318y - 1); iMax++) {
            for (int iMax2 = Math.max(this.f409aj - 1, 0); iMax2 <= Math.min(this.f409aj + 1, this.f452b.f314x - 1); iMax2++) {
                if (this.f519d.f88i >= 2 || ((this.f519d.f49a[this.f519d.f109n][1][iMax2 >> 5][iMax] >> (iMax2 & 31)) & 1) != 0) {
                    if (this.f519d.f88i == 2) {
                        int[] iArr2 = null;
                        if (((iArr2[iMax] >> (iMax2 & 31)) & 1) != 0) {
                            if (this.f542l[iMax][iMax2] <= i2 * 50 && this.f542l[iMax][iMax2] <= (i2 + 1) * 50 && this.f371aD[this.f542l[iMax][iMax2] + 1616] > 0 && i3 > (i = ((((iMax2 - this.f409aj) * 30) + this.f371aD[this.f542l[iMax][iMax2] + 202]) * (((iMax2 - this.f409aj) * 30) + this.f371aD[this.f542l[iMax][iMax2] + 202])) + ((((iMax - this.f411ak) * 20) + this.f371aD[this.f542l[iMax][iMax2] + 303]) * (((iMax - this.f411ak) * 20) + this.f371aD[this.f542l[iMax][iMax2] + 303])))) {
                                s = this.f542l[iMax][iMax2];
                                i4 = iMax;
                                i5 = iMax2;
                                i3 = i;
                            }
                        }
                    } else if (this.f542l[iMax][iMax2] <= i2 * 50) {
                    }
                }
            }
        }
        if (s <= 0) {
            return true;
        }
        this.f359a = s;
        this.f413al = (byte) i5;
        this.f415am = (byte) i4;
        return i2 == this.f519d.f109n;
    }

    /* JADX INFO: renamed from: j */
    private void m189j(int i, int i2, int i3, int i4, int i5) {
        if (this.f501bs == 62) {
            if (this.f342I) {
                this.f487be = this.f521d.length / 3;
                try {
                    this.f356a = Image.createImage(new StringBuffer().append(this.f486bd < 10 ? "/r0" : "/r").append(this.f486bd).toString());
                } catch (Exception e) {
                }
                this.f342I = false;
            }
            if (i == 1) {
                switch (i2) {
                    case 0:
                        this.f453b.m231a(i4, i5, 1, this.f521d[this.f486bd * 3], -1);
                        break;
                    case 1:
                        m118a(this.f455b[this.f429at], this.f356a, 0, 0, this.f356a.getWidth(), this.f356a.getHeight(), (i4 - (this.f356a.getWidth() / 2)) + 15, (i5 - (this.f356a.getHeight() / 2)) + 10, 0);
                        break;
                    case 2:
                    case 3:
                        m217e(i3, i4, i5);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m190k(int i) {
        if (i <= 7) {
            this.f519d.m23a(new StringBuffer("mi").append(i).toString());
        } else {
            m196n((i - 7) - 1);
        }
        this.f473bQ = 0;
        byte bM159c = (byte) m159c(1);
        if (bM159c >= 0) {
            this.f519d.m23a(new StringBuffer("m").append((int) bM159c).toString());
            this.f473bQ = 0;
            m129ab();
            this.f519d.m23a(new StringBuffer("mi").append(i).toString());
            this.f473bQ = 1;
        } else {
            m129ab();
        }
        int iM159c = m159c(1);
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 51);
        bArr[0][50] = 0;
        for (int i2 = 0; i2 < iM159c; i2++) {
            int iM159c2 = m159c(1);
            int iM159c3 = m159c(1);
            int iM159c4 = m159c(1);
            int iM159c5 = m159c(1);
            if (iM159c3 >= 0 && iM159c4 >= 0 && iM159c3 < this.f452b.f314x && iM159c4 < this.f452b.f318y) {
                if (this.f334E) {
                    if (iM159c2 >= 15) {
                        this.f542l[iM159c4][iM159c3] = (short) ((((iM159c2 - 15) / 10) * 100) + 1001 + (((iM159c2 - 15) % 5) * 20));
                    } else {
                        m206a((byte) iM159c2, iM159c3, iM159c4, iM159c2 / 8, iM159c5, true);
                    }
                }
                if (iM159c2 < 15 && iM159c2 / 8 == this.f519d.f94j) {
                    bArr[0][bArr[0][50]] = (byte) iM159c2;
                    bArr[1][bArr[0][50]] = (byte) iM159c3;
                    bArr[2][bArr[0][50]] = (byte) iM159c4;
                    bArr[3][bArr[0][50]] = (byte) iM159c5;
                    byte[] bArr2 = bArr[0];
                    bArr2[50] = (byte) (bArr2[50] + 1);
                }
            }
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= 2) {
                break;
            }
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < 3) {
                    this.f452b.f274e[i4][i6][20] = (byte) m159c(1);
                    for (int i7 = 0; i7 < this.f452b.f274e[i4][i6][20]; i7++) {
                        for (int i8 = 0; i8 < 4; i8++) {
                            this.f452b.f274e[i4][i6][(i7 << 2) + i8] = (byte) m159c(1);
                        }
                    }
                    i5 = i6 + 1;
                }
            }
            i3 = i4 + 1;
        }
        byte[] bArr3 = this.f452b.f291m[0];
        byte[] bArr4 = this.f452b.f291m[1];
        this.f452b.f291m[2][50] = 0;
        bArr4[50] = 0;
        bArr3[50] = 0;
        for (int i9 = 0; i9 < bArr[0][50]; i9++) {
            byte b = this.f365aB[this.f546p[109] + bArr[0][i9]];
            int i10 = 0;
            while (i10 < this.f452b.f274e[b][bArr[3][i9]][20]) {
                if (bArr[1][i9] >= this.f452b.f274e[b][bArr[3][i9]][i10 << 2] && bArr[2][i9] >= this.f452b.f274e[b][bArr[3][i9]][(i10 << 2) + 1] && bArr[1][i9] < this.f452b.f274e[b][bArr[3][i9]][i10 << 2] + this.f452b.f274e[b][bArr[3][i9]][(i10 << 2) + 2] && bArr[2][i9] < this.f452b.f274e[b][bArr[3][i9]][(i10 << 2) + 1] + this.f452b.f274e[b][bArr[3][i9]][(i10 << 2) + 3]) {
                    this.f452b.f291m[bArr[3][i9]][this.f452b.f291m[bArr[3][i9]][50]] = bArr[0][i9];
                    byte[] bArr5 = this.f452b.f291m[bArr[3][i9]];
                    bArr5[50] = (byte) (bArr5[50] + 1);
                    break;
                }
                i10++;
            }
            if (b == 1 && this.f334E && i10 >= this.f452b.f274e[b][bArr[3][i9]][20]) {
                this.f371aD[i9 + 6666 + (this.f519d.f94j * 50) + 1] = 3;
            }
        }
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 >= 3) {
                break;
            }
            this.f452b.f289k[i12][40] = (byte) m159c(1);
            for (int i13 = 0; i13 < this.f452b.f289k[i12][40]; i13++) {
                for (int i14 = 0; i14 < 4; i14++) {
                    this.f452b.f289k[i12][(i13 << 2) + i14] = (byte) m159c(1);
                }
            }
            i11 = i12 + 1;
        }
        int i15 = 0;
        while (true) {
            int i16 = i15;
            if (i16 >= 3) {
                break;
            }
            this.f452b.f290l[i16][40] = (byte) m159c(1);
            for (int i17 = 0; i17 < this.f452b.f290l[i16][40]; i17++) {
                for (int i18 = 0; i18 < 4; i18++) {
                    this.f452b.f290l[i16][(i17 << 2) + i18] = (byte) m159c(1);
                }
            }
            i15 = i16 + 1;
        }
        int i19 = 0;
        while (true) {
            int i20 = i19;
            if (i20 >= 3) {
                break;
            }
            this.f452b.f222Y[i20] = (byte) m159c(1);
            int iM159c6 = m159c(1);
            for (int i21 = 0; i21 < iM159c6; i21++) {
                this.f452b.f296q[i20][i21] = (byte) m159c(1);
            }
            for (int i22 = 0; i22 < this.f452b.f222Y[i20] + 1; i22++) {
                this.f452b.f298r[i20][i22] = (byte) m159c(1);
            }
            i19 = i20 + 1;
        }
        int i23 = 0;
        while (true) {
            int i24 = i23;
            if (i24 >= 3) {
                break;
            }
            this.f452b.f301s[i24][8] = (byte) m159c(1);
            for (int i25 = 0; i25 < this.f452b.f301s[i24][8]; i25++) {
                for (int i26 = 0; i26 < 2; i26++) {
                    this.f452b.f301s[i24][(i25 << 1) + i26] = (byte) m159c(1);
                }
            }
            i23 = i24 + 1;
        }
        int i27 = 0;
        while (true) {
            int i28 = i27;
            if (i28 >= 3) {
                break;
            }
            this.f452b.f292n[i28][8] = (byte) m159c(1);
            for (int i29 = 0; i29 < this.f452b.f292n[i28][8]; i29++) {
                for (int i30 = 0; i30 < 4; i30++) {
                    this.f452b.f292n[i28][(i29 << 2) + i30] = (byte) m159c(1);
                }
            }
            i27 = i28 + 1;
        }
        this.f452b.f152B = m159c(1);
        for (int i31 = 0; i31 < this.f452b.f152B; i31++) {
            for (int i32 = 0; i32 < 6; i32++) {
                this.f452b.f293o[i32][i31] = (byte) m159c(1);
            }
        }
        if (i > 7) {
            int iM159c7 = m159c(2);
            int i33 = 0;
            for (int i34 = 0; i34 < iM159c7; i34++) {
                int iM159c8 = m159c(1);
                if (iM159c8 == 124) {
                    C0009j c0009j = this.f453b;
                    c0009j.f618y[i33 + 129 + 1] = (short) ((this.f453b.m229a() + i34) - i33);
                    i33++;
                } else {
                    this.f453b.f583aN[(this.f453b.m229a() + i34) - i33] = this.f365aB[this.f546p[139] + iM159c8];
                    this.f453b.f584aO[(this.f453b.m229a() + i34) - i33] = this.f365aB[iM159c8 + this.f546p[140]];
                }
            }
            m159c(2);
            int iM159c9 = m159c(2);
            int iM159c10 = m159c(2);
            for (int i35 = 0; i35 < iM159c9 + 1; i35++) {
                this.f365aB[this.f546p[157] + 46 + i35] = (byte) (m159c(1) + 129);
            }
            for (int i36 = 0; i36 < iM159c9; i36++) {
                this.f365aB[this.f546p[158] + 46 + i36] = (byte) m159c(1);
            }
            for (int i37 = 0; i37 < iM159c10; i37++) {
                this.f365aB[this.f546p[159] + 129 + i37] = (byte) m159c(1);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m191k(int i, int i2, int i3, int i4, int i5) {
        switch (i) {
            case 0:
                this.f453b.m231a(i4, i5, 1, this.f525f, -1);
                break;
            case 1:
            case 2:
            case 3:
                if (this.f487be >= i) {
                    switch (i2) {
                        case 0:
                            if (this.f486bd == (this.f490bh + i) - 1) {
                                m217e(i3, i4, i5);
                            }
                            break;
                        case 1:
                        case 2:
                        case 3:
                            if (i2 == 3 && this.f446ay[(this.f490bh + i) - 1] == 1) {
                                this.f453b.m231a(i4, i5, 2, ">", 0);
                            } else if (i2 != 3 || this.f446ay[(this.f490bh + i) - 1] == 0) {
                                this.f453b.m231a(i4, i5, i2 != 1 ? i2 == 2 ? 0 : 2 : 1, this.f456b[i2 - 1][(this.f490bh + i) - 1], -1);
                            }
                            break;
                        case 4:
                            if (this.f446ay[(this.f490bh + i) - 1] >= 2) {
                                m217e(i3, i4, i5);
                            }
                            break;
                    }
                }
                break;
            case 4:
                if (this.f490bh + this.f491bi < this.f487be) {
                    if (i2 == 0) {
                        m178f(i3, i4, i5);
                    } else if (this.f410aj[13] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[13], -1);
                    }
                }
                break;
            case 5:
                if (this.f490bh > 0) {
                    if (i2 == 0) {
                        m178f(i3, i4, i5);
                    } else if (this.f410aj[12] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[12], -1);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    private void m192l(int i) {
        this.f424aq = this.f426ar;
        this.f468bL = i;
        m198p(this.f452b.f323z);
        m198p(this.f452b.f147A);
        m198p(this.f409aj);
        m198p(this.f411ak);
        m198p(this.f467bK);
        this.f482bZ = 0;
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (i3 > 4) {
                return;
            }
            m117a(null, this.f335E[i3], null, null, 7, 0, 51, 0);
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: l */
    private void m193l(int i, int i2, int i3, int i4, int i5) {
        switch (i) {
            case 0:
                if (this.f519d.f105m != 0 || (this.f365aB[this.f546p[90] + (this.f501bs >> 3)] & (1 << (this.f501bs & 7))) != 0 || (!this.f344J && i2 <= 0)) {
                    if (i2 != 2) {
                        m217e(((i2 == 1 && this.f526f == -1 && this.f519d.f105m == 1) ? 1 : 0) + i3, i4, i5);
                    } else if (this.f410aj[14] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[14], -1);
                    }
                }
                break;
            case 1:
                if (this.f519d.f105m != 0 || (this.f365aB[this.f546p[91] + (this.f501bs >> 3)] & (1 << (this.f501bs & 7))) != 0 || (!this.f344J && i2 <= 0)) {
                    if (i2 != 2) {
                        m217e(((i2 == 1 && this.f425ar < 0 && this.f435av < 0 && this.f536i == 0 && this.f526f == -1 && this.f519d.f105m == 1 && this.f335E[0][50] == 0) ? 1 : 0) + i3, i4, i5);
                    } else if (this.f410aj[15] >= 0) {
                        m221o(i3, i4, i5, this.f410aj[15], -1);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m194m(int i) {
        for (int i2 = 0; i2 < this.f335E[i][50]; i2++) {
            byte[] bArr = this.f371aD;
            int i3 = this.f335E[i][i2] + 2929;
            bArr[i3] = (byte) (bArr[i3] & ((1 << i) ^ (-1)));
        }
        this.f335E[i][50] = 0;
        this.f457bA = 0;
    }

    /* JADX INFO: renamed from: m */
    private void m195m(int i, int i2, int i3, int i4, int i5) {
        switch (i) {
            case 0:
                m217e(this.f488bf + i3, i4, i5);
                break;
            default:
                if (i <= this.f488bf + 2) {
                    switch (i2) {
                        case 0:
                            if (i - 1 == this.f486bd) {
                                m217e(i3, i4, i5);
                            }
                            break;
                        case 1:
                            m178f(i3 + (i == 3 ? this.f447az : (byte) 0), i4, i5);
                            break;
                        case 2:
                            this.f453b.m231a(i4, i5, 0, new StringBuffer().append((int) this.f365aB[(this.f546p[66] + i) - 1]).toString(), i + (-1) == this.f486bd ? 2 : 1);
                            break;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m196n(int i) {
        try {
            this.f357a = RecordStore.openRecordStore(new StringBuffer().append(i < 10 ? "aow220" : "aow22").append(i).toString(), true);
            if (this.f357a.getNumRecords() > 0) {
                byte[] record = this.f357a.getRecord(1);
                try {
                    int i2 = ((record[0] & 255) << 8) + (record[1] & 255);
                    for (int i3 = 0; i3 < i2; i3++) {
                        this.f426ar[i3] = record[i3 + 2];
                    }
                } catch (Exception e) {
                }
            }
            this.f357a.closeRecordStore();
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: o */
    private void m197o(int i) {
        try {
            this.f355a.writeByte(this.f362aA[this.f511cb] ^ i);
            this.f511cb = (this.f511cb + 1) % this.f362aA.length;
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: p */
    private void m198p(int i) {
        byte[] bArr = this.f424aq;
        int i2 = this.f468bL;
        this.f468bL = i2 + 1;
        bArr[i2] = (byte) i;
        this.f518ci++;
    }

    /* JADX INFO: renamed from: q */
    private void m199q(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            m198p(i >> (24 - (i2 << 3)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: U */
    final void m200U() {
        byte[] bArr;
        byte b;
        if (!this.f349O) {
            if (this.f469bM <= 0) {
                bArr = this.f426ar;
                b = (this.f519d.f105m == 0 && this.f501bs == 71) ? (byte) -3 : (byte) -1;
            }
            if (this.f426ar[0] == -4) {
                this.f450b.f19c = true;
            }
            this.f450b.f1a = this.f469bM;
            this.f450b.f0a = (byte) 1;
            this.f519d.f124t = (byte) 4;
            this.f469bM = 0;
            this.f349O = false;
        }
        bArr = this.f426ar;
        b = -2;
        bArr[0] = b;
        this.f469bM = 1;
        if (this.f426ar[0] == -4) {
            this.f450b.f19c = true;
        }
        this.f450b.f1a = this.f469bM;
        this.f450b.f0a = (byte) 1;
        this.f519d.f124t = (byte) 4;
        this.f469bM = 0;
        this.f349O = false;
    }

    /* JADX INFO: renamed from: V */
    final void m201V() {
        this.f450b.f0a = (byte) 2;
        this.f519d.f124t = (byte) 5;
    }

    /* JADX INFO: renamed from: W */
    final void m202W() {
        this.f426ar[0] = (byte) this.f448az;
        this.f515cf = this.f448az > 7 ? this.f541l[(this.f448az - 7) - 1] : (short) -1;
        if (this.f448az > 7) {
            this.f426ar[1] = (byte) (this.f515cf >> 8);
            this.f426ar[2] = (byte) this.f515cf;
        }
        this.f426ar[3] = (byte) (this.f519d.f102l >> 8);
        this.f426ar[4] = (byte) this.f519d.f102l;
        this.f426ar[5] = (byte) (this.f519d.f109n ^ 1);
        this.f426ar[6] = (byte) this.f485bc;
        this.f426ar[7] = 4;
        for (int i = 0; i < this.f426ar[7]; i++) {
            this.f426ar[i + 8] = (byte) "6290".charAt(i);
        }
        this.f450b.f1a = this.f426ar[7] + 8;
        this.f450b.f0a = (byte) 1;
        this.f519d.f124t = (byte) 0;
        this.f469bM = 0;
    }

    /* JADX INFO: renamed from: X */
    final void m203X() {
        if (this.f426ar[0] != 0) {
            this.f450b.m4a();
            this.f519d.f124t = (byte) -1;
            return;
        }
        if (this.f450b.f13b < 0) {
            this.f539k = "";
            for (int i = 0; i < this.f426ar[1]; i++) {
                this.f539k = new StringBuffer().append(this.f539k).append((char) (this.f426ar[i + 2] & 255)).toString();
            }
        }
        this.f450b.f1a = 1;
        if (this.f501bs == 71) {
            m180f(false);
            this.f348N = true;
        }
        if (this.f348N) {
            this.f334E = false;
            m128aa();
            m183g(this.f501bs != 71);
            this.f450b.f1a += this.f518ci;
        }
        this.f450b.f0a = (byte) 1;
        this.f519d.f124t = (byte) 2;
        this.f469bM = 0;
    }

    /* JADX INFO: renamed from: Y */
    final void m204Y() {
        this.f448az = this.f426ar[0];
        this.f515cf = ((this.f426ar[1] & 255) << 8) + (this.f426ar[2] & 255);
        if (this.f448az > 7) {
            this.f448az = (this.f379aH - 1) * 50;
            while (this.f448az < this.f379aH * 50 && this.f541l[this.f448az] != this.f515cf) {
                this.f448az++;
            }
        }
        this.f516cg = ((this.f426ar[3] & 255) << 8) + (this.f426ar[4] & 255);
        this.f519d.f109n = this.f426ar[5];
        this.f485bc = this.f426ar[6];
        this.f539k = "";
        for (int i = 0; i < this.f426ar[7]; i++) {
            this.f539k = new StringBuffer().append(this.f539k).append((char) (this.f426ar[i + 8] & 255)).toString();
        }
        this.f469bM = 0;
        if (this.f448az >= this.f379aH * 50 || this.f516cg != this.f519d.f102l) {
            this.f426ar[0] = -1;
            m207a(73, true);
            this.f450b.f1a = 1;
        } else {
            if (this.f448az > 7) {
                this.f448az += 8;
            }
            this.f334E = false;
            m128aa();
            this.f426ar[0] = 0;
            this.f426ar[1] = 4;
            for (int i2 = 0; i2 < this.f426ar[1]; i2++) {
                this.f426ar[i2 + 2] = (byte) "6290".charAt(i2);
            }
            this.f450b.f1a = this.f426ar[1] + 2;
        }
        this.f450b.f0a = (byte) 1;
        this.f519d.f124t = (byte) 7;
    }

    /* JADX INFO: renamed from: Z */
    final void m205Z() {
        this.f469bM = this.f450b.f1a;
        this.f348N = this.f469bM > 1;
        if (this.f348N) {
            m183g(true);
        }
        this.f469bM = 0;
        this.f519d.f123s = false;
        if (this.f501bs != 71) {
            m207a(9, true);
        } else {
            this.f519d.f127u = true;
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m206a(byte b, int i, int i2, int i3, int i4, boolean z) {
        if (this.f519d.f63c[i3][1] >= 50) {
            return false;
        }
        int i5 = (i3 * 50) + 1;
        while (true) {
            byte b2 = (byte) i5;
            if (b2 > (i3 + 1) * 50) {
                return false;
            }
            if (this.f371aD[b2 + 5454] == 0) {
                this.f371aD[b2 + 6363] = (byte) i;
                this.f371aD[b2 + 6464] = (byte) i2;
                this.f371aD[b2 + 5252] = (byte) ((this.f519d.f92i[18][b] / 2) + i);
                this.f371aD[b2 + 5353] = (byte) ((this.f519d.f92i[19][b] / 2) + i2);
                this.f371aD[b2 + 6161] = (byte) ((this.f371aD[b2 + 6363] + this.f519d.f92i[18][b]) - 1);
                this.f371aD[b2 + 6262] = (byte) (this.f371aD[b2 + 6464] + this.f519d.f92i[19][b]);
                this.f371aD[b2 + 5656] = b;
                if (z) {
                    this.f371aD[b2 + 5454] = this.f365aB[this.f546p[59] + b];
                    this.f371aD[b2 + 6060] = 0;
                } else {
                    this.f371aD[b2 + 5454] = (byte) ((this.f365aB[this.f546p[59] + b] & 255) / 10);
                    this.f371aD[b2 + 6060] = 1;
                }
                this.f371aD[b2 + 6565] = 0;
                this.f371aD[b2 + 5959] = 0;
                this.f371aD[b2 + 5757] = 0;
                this.f371aD[b2 + 7070] = 0;
                this.f371aD[b2 + 6868] = -1;
                this.f371aD[b2 + 6767] = -1;
                this.f371aD[b2 + 6666] = (byte) i4;
                this.f371aD[b2 + 5858] = this.f519d.f101l;
                this.f371aD[b2 + 6969] = -1;
                this.f371aD[b2 + 5555] = 0;
                RunnableC0002c runnableC0002c = this.f519d;
                runnableC0002c.f101l = (byte) (runnableC0002c.f101l + 1);
                for (int i6 = i2; i6 < this.f519d.f92i[19][b] + i2; i6++) {
                    for (int i7 = i; i7 < this.f519d.f92i[18][b] + i; i7++) {
                        this.f542l[i6][i7] = (byte) (-b2);
                    }
                }
                short[] sArr = this.f519d.f63c[i3];
                sArr[1] = (short) (sArr[1] + 1);
                if (i3 == this.f519d.f109n) {
                    this.f425ar = (byte) -1;
                    if (this.f519d.f88i == 2) {
                        this.f452b.m101a((int) this.f371aD[b2 + 5252], (int) this.f371aD[b2 + 5353], (int) this.f452b.f213V[b]);
                    }
                }
                if (b == 12) {
                    this.f371aD[b2 + 6565] = 24;
                }
                this.f452b.m108i(-b2);
                this.f452b.m106f(i3);
                if (i3 == this.f519d.f94j && this.f365aB[this.f546p[94] + b] % 3 == 0) {
                    byte[] bArr = this.f452b.f225Z;
                    bArr[i4] = (byte) (bArr[i4] + 1);
                }
                if (this.f519d.f92i[18][b] + i > this.f452b.f323z && this.f519d.f92i[19][b] + i2 > this.f452b.f147A && i < this.f452b.f323z + 8 && i2 < this.f452b.f147A + this.f452b.f191O) {
                    this.f407ai = (byte) 4;
                }
                return true;
            }
            i5 = b2 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0323  */
    /* JADX INFO: renamed from: a */
    final boolean m207a(int i, boolean z) {
        int i2;
        int i3;
        this.f519d.f50b = this.f365aB[32];
        this.f519d.f57c = this.f365aB[33];
        this.f519d.f64d = this.f365aB[34];
        int i4 = (i == 1 && this.f379aH == 2 && this.f519d.f113o != 0) ? 92 : i;
        if (i4 == 53) {
            if (this.f501bs == 6) {
                this.f497bo = 6;
                this.f498bp = 1;
                this.f451b.f133p = 1;
            } else if (this.f501bs == 80) {
                this.f497bo = 80;
                this.f498bp = 2;
                this.f451b.f133p = 1;
            } else if (this.f501bs == 54) {
                this.f451b.f133p = 2;
            } else if (this.f501bs == 50) {
                this.f451b.f133p = 3;
            } else if (this.f501bs == 46) {
                this.f451b.f133p = 4;
            } else if (this.f501bs == 34 || this.f501bs == 64) {
                this.f451b.f133p = 6;
                this.f497bo = 64;
                this.f498bp = 0;
            } else if (this.f501bs == 83) {
                this.f451b.f133p = 6;
            } else if (this.f501bs == 85) {
                this.f451b.f133p = 8;
            }
            this.f451b.m31p();
        }
        if (i4 == 48 && this.f519d.f53b == null) {
            this.f519d.m25b(0);
        }
        if (i4 == 8) {
            this.f487be = this.f479bW;
            this.f491bi = 3;
        }
        if (i4 == 40) {
            this.f389aM = 0;
            this.f519d.f63c[0][10] = 0;
            m127aL();
        }
        if (this.f501bs == 13) {
            this.f393aO = this.f486bd;
        }
        if ((i4 == 7 && this.f445ay < 0 && this.f379aH == 1) || i4 == 57) {
            int i5 = (this.f379aH - 1) * 50;
            while (i5 < this.f379aH * 50 && this.f541l[i5] < 0) {
                i5++;
            }
            if (i5 >= this.f379aH * 50) {
                i2 = 44;
            } else {
                i2 = i4;
            }
        } else {
            i2 = i4;
        }
        if (i2 == 6 && this.f379aH == 2) {
            i2 = 80;
        }
        if ((i2 == 80 || (i2 == 5 && this.f379aH == 2)) && (this.f370aD & 3) == 0) {
            i2 = 66;
            this.f497bo = 0;
            this.f499bq = 0;
            this.f498bp = 2;
            this.f500br = 2;
        }
        if (i2 == 30 && this.f501bs >= 0 && z) {
            int i6 = this.f501bs;
            this.f497bo = i6;
            this.f499bq = i6;
            int i7 = this.f486bd;
            this.f498bp = i7;
            this.f500br = i7;
        }
        if ((i2 == 30 || i2 == 85) && (this.f370aD & 3) == 3) {
            i2 = 31;
        }
        if (i2 == 98 && (this.f367aC != 0 || this.f519d.f82g[4] == 0)) {
            i2 = 34;
            this.f391aN = this.f367aC;
            this.f405ag = (byte) 3;
        }
        if (i2 == 4) {
            if (this.f433au < 0 && this.f436av <= 0) {
                this.f501bs = 23;
                this.f486bd = 0;
                i2 = 10;
            }
        } else {
            if (i2 == 16) {
                this.f501bs = 16;
                this.f486bd = 0;
                return false;
            }
            if (i2 == 5 && ((this.f379aH == 1 && this.f439aw < 0) || (this.f379aH == 2 && this.f442ax < 0))) {
                i2 = this.f379aH == 1 ? 6 : 80;
            } else if (i2 == 28 && this.f379aH != 0) {
                this.f501bs = 28;
                this.f486bd = 0;
                i2 = 9;
            }
        }
        if (i2 == 0) {
            this.f448az = 0;
            this.f519d.f127u = false;
            this.f519d.f123s = false;
        }
        if (i2 == 84 && (this.f375aF <= 0 || this.f406ah <= 0)) {
            i2 = 78;
        }
        if (i2 == 34 && this.f501bs != 79 && this.f391aN <= 3 && this.f375aF > 0 && this.f406ah > 0) {
            this.f501bs = 34;
            this.f486bd = 0;
            this.f494bl = 0;
            i2 = 79;
        }
        if (this.f501bs == 14) {
            this.f508bz = this.f486bd + 1;
            this.f345K = true;
        }
        if (z) {
            if ((this.f501bs < 19 || (this.f365aB[this.f546p[89] + (this.f501bs >> 3)] & (1 << (this.f501bs & 7))) == 0) && (i2 < 25 || i2 >= 29)) {
                this.f493bk = this.f501bs;
                this.f494bl = this.f486bd;
                this.f495bm = this.f490bh;
            } else {
                this.f493bk = -1;
                this.f495bm = 0;
            }
            this.f490bh = 0;
            this.f486bd = 0;
        } else {
            if (this.f501bs != 28) {
                this.f486bd = this.f494bl >= 0 ? this.f494bl : this.f365aB[this.f546p[86] + this.f501bs];
                this.f490bh = this.f495bm;
            } else {
                this.f490bh = 0;
                this.f486bd = 0;
            }
            this.f494bl = -1;
            this.f493bk = -1;
            this.f495bm = 0;
        }
        if (this.f501bs < 0 || (this.f365aB[this.f546p[88] + (i2 >> 3)] & (1 << (i2 & 7))) == 0) {
            this.f407ai = (byte) 4;
        }
        this.f501bs = i2;
        this.f342I = true;
        if (this.f501bs == 9) {
            this.f508bz = -1;
        }
        if (this.f365aB[this.f546p[84] + this.f501bs] >= 0) {
            if (this.f365aB[this.f546p[84] + this.f501bs] == 127) {
                i3 = 220;
            } else {
                i3 = (this.f501bs >= 19 ? (byte) 12 : (byte) 0) + this.f365aB[this.f546p[84] + this.f501bs];
            }
            this.f508bz = i3;
            this.f345K = true;
        }
        if (this.f501bs == 17) {
            this.f508bz = this.f365aB[this.f546p[157] + this.f369aD + this.f452b.f205T] & 255;
            this.f345K = true;
        }
        if (this.f501bs == 71 && this.f519d.f123s) {
            this.f508bz += 8;
        }
        if (this.f501bs == 73 && this.f516cg != this.f519d.f102l) {
            this.f508bz += 11;
        }
        return true;
    }

    /* JADX INFO: renamed from: aB */
    final void m208aB() {
        byte b;
        if (this.f407ai != -1) {
            this.f429at = (byte) 0;
            this.f407ai = (byte) 4;
            if (this.f407ai != 4) {
                this.f455b[1].drawImage(this.f519d.f43a[0], this.f365aB[this.f546p[12] + (this.f407ai << 1)] * 20, this.f365aB[this.f546p[12] + (this.f407ai << 1) + 1] * 20, 0);
                this.f455b[0].drawImage(this.f519d.f43a[1], 0, 0, 0);
            } else {
                m218e(false);
                this.f407ai = (byte) 4;
                if (this.f347M) {
                    this.f465bI = this.f452b.f323z + 4;
                    this.f466bJ = this.f452b.f147A + (this.f452b.f191O / 2);
                    this.f347M = false;
                }
                if (this.f452b.f314x * this.f467bK < 200) {
                    this.f459bC = this.f452b.f314x * this.f467bK;
                    this.f463bG = 0;
                } else {
                    this.f459bC = 200;
                    this.f463bG = C0005f.m57a(this.f465bI - ((this.f459bC / 2) / this.f467bK), 0, this.f452b.f314x - (this.f459bC / this.f467bK));
                }
                if (this.f452b.f318y * this.f467bK < 280) {
                    this.f460bD = this.f452b.f318y * this.f467bK;
                    this.f464bH = 0;
                } else {
                    this.f460bD = 280;
                    this.f464bH = C0005f.m57a(this.f466bJ - ((this.f460bD / 2) / this.f467bK), 0, this.f452b.f318y - (this.f460bD / this.f467bK));
                }
                this.f461bE = (240 - this.f459bC) / 2;
                this.f462bF = (320 - this.f460bD) / 2;
                m217e(2040, this.f461bE - 90, this.f462bF - 60);
                m217e(2041, (this.f461bE + this.f459bC) - 90, this.f462bF - 60);
                m217e(2042, (this.f461bE + this.f459bC) - 90, (this.f462bF + this.f460bD) - 60);
                m217e(2043, this.f461bE - 90, (this.f462bF + this.f460bD) - 60);
                for (int i = 0; i < this.f459bC; i += 20) {
                    m217e(2044, (this.f461bE + i) - 90, this.f462bF - 60);
                }
                for (int i2 = 0; i2 < this.f460bD; i2 += 20) {
                    m217e(2045, (this.f461bE + this.f459bC) - 90, (this.f462bF + i2) - 60);
                }
                for (int i3 = 0; i3 < this.f459bC; i3 += 20) {
                    m217e(2046, (this.f461bE + i3) - 90, (this.f462bF + this.f460bD) - 60);
                }
                for (int i4 = 0; i4 < this.f460bD; i4 += 20) {
                    m217e(2047, this.f461bE - 90, (this.f462bF + i4) - 60);
                }
                this.f455b[this.f429at].setColor(1825);
                m115a(this.f455b[this.f429at], this.f461bE + 15, this.f458bB + 10 + this.f462bF, this.f459bC, this.f460bD);
            }
            m165c(this.f455b[this.f429at], this.f461bE + 15, this.f458bB + 10 + this.f462bF, this.f459bC, this.f460bD);
            int i5 = this.f407ai == 1 ? (this.f461bE + this.f459bC) - 20 : this.f461bE;
            int i6 = this.f407ai == 0 ? this.f461bE + 20 : this.f461bE + this.f459bC;
            int i7 = this.f407ai == 3 ? (this.f462bF + this.f460bD) - 20 : this.f462bF;
            int i8 = this.f407ai == 2 ? this.f462bF + 1 : this.f462bF + this.f460bD;
            int i9 = 0;
            int i10 = 0;
            byte b2 = -1;
            int i11 = -1;
            int i12 = i7;
            while (i12 < i8) {
                int i13 = i5;
                while (i13 < i6) {
                    short s = this.f542l[this.f464bH + ((i12 - this.f462bF) / this.f467bK)][this.f463bG + ((i13 - this.f461bE) / this.f467bK)];
                    int i14 = 0;
                    if (this.f519d.f88i < 2) {
                        if (((this.f519d.f49a[this.f519d.f109n][0][(this.f463bG + ((i13 - this.f461bE) / this.f467bK)) >> 5][this.f464bH + ((i12 - this.f462bF) / this.f467bK)] >> ((this.f463bG + ((i13 - this.f461bE) / this.f467bK)) & 31)) & 1) == 0) {
                            s = -101;
                        } else if (((this.f519d.f49a[this.f519d.f109n][1][(this.f463bG + ((i13 - this.f461bE) / this.f467bK)) >> 5][this.f464bH + ((i12 - this.f462bF) / this.f467bK)] >> ((this.f463bG + ((i13 - this.f461bE) / this.f467bK)) & 31)) & 1) == 0) {
                            if ((-s) > 0 && (-s) <= 100 && ((this.f371aD[6060 - s] >> 1) & 1) == 0) {
                                s = 0;
                            }
                            i14 = 3;
                        }
                    }
                    if (this.f519d.f88i == 2) {
                        int[] iArr = null;
                        if (((iArr[this.f464bH + ((i12 - this.f462bF) / this.f467bK)] >> ((this.f463bG + ((i13 - this.f461bE) / this.f467bK)) & 31)) & 1) == 0) {
                            s = -101;
                        }
                    }
                    int i15 = 0;
                    while (true) {
                        if (i15 >= 15) {
                            i14 = i11;
                            b = b2;
                            break;
                        }
                        if (s <= this.f547q[this.f548r[3] + i15]) {
                            if (i13 < i6 - this.f467bK) {
                                if (b2 != this.f365aB[this.f546p[79] + i15] || i11 != i14) {
                                    if (i10 > 0) {
                                        m115a(this.f455b[this.f429at], i9 + 15, this.f458bB + 10 + i12, i10 * this.f467bK, this.f467bK);
                                    }
                                    b = this.f365aB[this.f546p[79] + i15];
                                    this.f455b[this.f429at].setColor(this.f365aB[this.f546p[i14 + 73] + i15] & 255, this.f365aB[this.f546p[i14 + 74] + i15] & 255, this.f365aB[i15 + this.f546p[i14 + 75]] & 255);
                                    i10 = 1;
                                    i9 = i13;
                                    break;
                                }
                                i10++;
                                i14 = i11;
                                b = b2;
                                break;
                            }
                            if (b2 == this.f365aB[this.f546p[79] + i15] && i11 == i14) {
                                m115a(this.f455b[this.f429at], i9 + 15, this.f458bB + 10 + i12, (i10 + 1) * this.f467bK, this.f467bK);
                            } else {
                                m115a(this.f455b[this.f429at], i9 + 15, this.f458bB + 10 + i12, i10 * this.f467bK, this.f467bK);
                                this.f455b[this.f429at].setColor(this.f365aB[this.f546p[i14 + 73] + i15] & 255, this.f365aB[this.f546p[i14 + 74] + i15] & 255, this.f365aB[this.f546p[i14 + 75] + i15] & 255);
                                m115a(this.f455b[this.f429at], i13 + 15, this.f458bB + 10 + i12, this.f467bK, this.f467bK);
                            }
                            b = -1;
                            i14 = i11;
                            i10 = 0;
                            break;
                        }
                        i15++;
                    }
                    i13 += this.f467bK;
                    i11 = i14;
                    b2 = b;
                }
                i12 = this.f467bK + i12;
            }
            for (int i16 = i7 - ((this.f464bH * this.f467bK) % 20); i16 < i8; i16 += 20) {
                for (int i17 = i5 - ((this.f463bG * this.f467bK) % 20); i17 < i6; i17 += 20) {
                    m217e(2048, i17, i16);
                }
            }
            m165c(this.f455b[this.f429at], 0, 0, 500, 500);
            this.f407ai = (byte) -1;
        }
        this.f429at = (byte) 1;
        this.f455b[this.f429at].drawImage(this.f519d.f43a[0], 0, 0, 0);
        m165c(this.f455b[this.f429at], this.f461bE + 15, this.f458bB + 10 + this.f462bF, this.f459bC, this.f460bD);
        m217e(2039, (this.f461bE + ((this.f465bI - this.f463bG) * this.f467bK)) - 200, (this.f462bF + ((this.f466bJ - this.f464bH) * this.f467bK)) - 200);
        m165c(this.f455b[this.f429at], 0, 0, 500, 500);
    }

    /* JADX INFO: renamed from: aC */
    final void m209aC() {
        this.f350P = true;
        if (this.f388aM >= this.f386aL) {
            return;
        }
        while (this.f388aM < this.f386aL && this.f350P) {
            byte[] bArr = this.f426ar;
            int i = this.f477bU;
            this.f477bU = i + 1;
            int i2 = (bArr[i] & 255) << 24;
            byte[] bArr2 = this.f426ar;
            int i3 = this.f477bU;
            this.f477bU = i3 + 1;
            int i4 = i2 | ((bArr2[i3] & 255) << 16);
            byte[] bArr3 = this.f426ar;
            int i5 = this.f477bU;
            this.f477bU = i5 + 1;
            int i6 = i4 | ((bArr3[i5] & 255) << 8);
            byte[] bArr4 = this.f426ar;
            int i7 = this.f477bU;
            this.f477bU = i7 + 1;
            this.f478bV = i6 | (bArr4[i7] & 255);
            byte[] bArr5 = this.f426ar;
            int i8 = this.f477bU;
            this.f477bU = i8 + 1;
            byte b = bArr5[i8];
            this.f478bV--;
            switch (b) {
                case 0:
                    m122aF();
                    break;
                case 1:
                    this.f532h = "";
                    int i9 = this.f426ar[this.f477bU] & 255;
                    for (int i10 = 0; i10 < i9; i10++) {
                        this.f453b.f570M[1][this.f453b.f611m[1][220] + i10] = this.f365aB[this.f546p[139] + (this.f426ar[this.f477bU + 1 + i10] & 255)];
                        this.f453b.f571N[1][this.f453b.f611m[1][220] + i10] = this.f365aB[this.f546p[140] + (this.f426ar[this.f477bU + 1 + i10] & 255)];
                    }
                    this.f453b.f611m[1][221] = (short) (this.f453b.f611m[1][220] + i9);
                    int i11 = i9 + 1;
                    int i12 = this.f426ar[this.f477bU + i11] & 255;
                    int i13 = i11 + 1;
                    for (int i14 = 0; i14 < i12; i14++) {
                        this.f532h = new StringBuffer().append(this.f532h).append((char) (this.f426ar[this.f477bU + i13 + i14] & 255)).toString();
                    }
                    m207a(51, true);
                    this.f350P = false;
                    break;
                case 3:
                    int i15 = ((this.f426ar[this.f477bU] >> 7) & 1) | ((this.f426ar[this.f477bU] >> 5) & 2);
                    if (this.f370aD != (i15 | 0)) {
                        this.f370aD = i15 | 0;
                        this.f367aC = (this.f370aD & 1) + ((this.f370aD >> 1) & 1);
                        if (this.f375aF != 0 && this.f395aQ < 3) {
                            this.f375aF = 0;
                        }
                        m126aJ();
                    }
                    break;
                case 4:
                    this.f430at = ((this.f426ar[this.f477bU] & 255) << 24) | ((this.f426ar[this.f477bU + 1] & 255) << 16) | ((this.f426ar[this.f477bU + 2] & 255) << 8) | (this.f426ar[this.f477bU + 3] & 255);
                    m126aJ();
                    break;
                case 5:
                    m123aG();
                    break;
                case 6:
                    m124aH();
                    break;
                case 7:
                    int i16 = this.f426ar[this.f477bU] & 255;
                    int i17 = this.f477bU + 1;
                    if (i16 > 0) {
                        this.f373aE = this.f426ar[i17];
                        m126aJ();
                    }
                    break;
                case 20:
                    m120aD();
                    break;
                case 21:
                    m121aE();
                    break;
            }
            if (b == 0 && (this.f390aN & 1) == 0) {
                this.f390aN = (byte) ((this.f390aN & 1) + 1);
                this.f388aM = (byte) (this.f388aM - 1);
                this.f477bU -= 5;
            } else {
                this.f477bU += this.f478bV;
            }
            this.f388aM = (byte) (this.f388aM + 1);
        }
        if (this.f350P && this.f375aF != 0 && this.f451b.f133p == 6) {
            m207a(89, true);
        } else {
            if (!this.f350P || this.f501bs == this.f497bo) {
                return;
            }
            m207a(this.f497bo, false);
            this.f486bd = this.f498bp;
            this.f519d.f120r = (byte) -1;
        }
    }

    /* JADX INFO: renamed from: aK */
    final void m210aK() {
        boolean z;
        boolean z2 = true;
        this.f519d.f50b = this.f365aB[32];
        this.f519d.f57c = this.f365aB[33];
        this.f519d.f64d = (byte) 0;
        try {
            this.f357a = RecordStore.openRecordStore("aow226", true);
            if (this.f357a.getNumRecords() > 0) {
                try {
                    this.f354a = new DataInputStream(new ByteArrayInputStream(this.f357a.getRecord(1)));
                    this.f430at = this.f354a.readInt();
                    this.f519d.f37a.f553cj = this.f354a.readInt();
                    this.f367aC = this.f354a.readByte();
                    this.f370aD = this.f354a.readByte();
                    this.f373aE = this.f354a.readByte();
                    z = true;
                } catch (Exception e) {
                    z = false;
                }
                if (this.f354a != null) {
                    this.f354a.close();
                }
            } else {
                z = false;
            }
            if (z) {
                boolean zM223d = this.f519d.f37a.m223d(this.f519d.f37a.f553cj);
                int i = this.f519d.f64d ^ ((this.f519d.f50b ^ this.f365aB[this.f546p[0] + 38]) ^ this.f519d.f57c);
                for (int i2 = 0; i2 < 8; i2++) {
                    i = (i >> 1) | (i & 1);
                }
                if (!zM223d) {
                    z2 = zM223d;
                } else if (i != 0) {
                    z2 = false;
                }
            } else {
                z2 = z;
            }
        } catch (Exception e2) {
            z2 = false;
        }
        try {
            this.f357a.closeRecordStore();
        } catch (Exception e3) {
        }
        if (z2) {
            return;
        }
        try {
            this.f353S = false;
            this.f430at = 0;
            try {
                String appProperty = this.f519d.f33a.getAppProperty("new_id");
                for (int i3 = 0; i3 < appProperty.length(); i3++) {
                    this.f430at *= 10;
                    this.f430at += appProperty.charAt(i3) - '0';
                }
            } catch (Exception e4) {
            }
            if (this.f430at < 100000000 || this.f430at >= 1000000000) {
                this.f430at = ((this.f452b.f226a.nextInt() & Integer.MAX_VALUE) % 900000000) + 100000000;
            }
            this.f519d.f37a.m223d(0);
            this.f370aD = 0;
            this.f367aC = (this.f370aD & 1) + ((this.f370aD >> 1) & 1);
            this.f373aE = 0;
            m126aJ();
        } catch (Exception e5) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01dd A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x0004, B:5:0x002e, B:35:0x01d9, B:37:0x01dd, B:40:0x01e7, B:43:0x0214, B:55:0x0238, B:57:0x023f, B:64:0x0271, B:66:0x0280, B:67:0x0285, B:69:0x028b, B:86:0x02ef, B:87:0x02f5, B:73:0x0299, B:77:0x02a8, B:78:0x02d8, B:89:0x02f9, B:72:0x0293, B:82:0x02e7, B:59:0x0243, B:61:0x0253, B:63:0x025d), top: B:99:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x01e7 A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x0004, B:5:0x002e, B:35:0x01d9, B:37:0x01dd, B:40:0x01e7, B:43:0x0214, B:55:0x0238, B:57:0x023f, B:64:0x0271, B:66:0x0280, B:67:0x0285, B:69:0x028b, B:86:0x02ef, B:87:0x02f5, B:73:0x0299, B:77:0x02a8, B:78:0x02d8, B:89:0x02f9, B:72:0x0293, B:82:0x02e7, B:59:0x0243, B:61:0x0253, B:63:0x025d), top: B:99:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0214 A[Catch: Exception -> 0x02eb, LOOP:2: B:41:0x0210->B:43:0x0214, LOOP_END, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x0004, B:5:0x002e, B:35:0x01d9, B:37:0x01dd, B:40:0x01e7, B:43:0x0214, B:55:0x0238, B:57:0x023f, B:64:0x0271, B:66:0x0280, B:67:0x0285, B:69:0x028b, B:86:0x02ef, B:87:0x02f5, B:73:0x0299, B:77:0x02a8, B:78:0x02d8, B:89:0x02f9, B:72:0x0293, B:82:0x02e7, B:59:0x0243, B:61:0x0253, B:63:0x025d), top: B:99:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0237  */
    /* JADX WARN: Code duplicated, block: B:59:0x0243 A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x0004, B:5:0x002e, B:35:0x01d9, B:37:0x01dd, B:40:0x01e7, B:43:0x0214, B:55:0x0238, B:57:0x023f, B:64:0x0271, B:66:0x0280, B:67:0x0285, B:69:0x028b, B:86:0x02ef, B:87:0x02f5, B:73:0x0299, B:77:0x02a8, B:78:0x02d8, B:89:0x02f9, B:72:0x0293, B:82:0x02e7, B:59:0x0243, B:61:0x0253, B:63:0x025d), top: B:99:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0253 A[Catch: Exception -> 0x02eb, LOOP:3: B:60:0x0251->B:61:0x0253, LOOP_END, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x0004, B:5:0x002e, B:35:0x01d9, B:37:0x01dd, B:40:0x01e7, B:43:0x0214, B:55:0x0238, B:57:0x023f, B:64:0x0271, B:66:0x0280, B:67:0x0285, B:69:0x028b, B:86:0x02ef, B:87:0x02f5, B:73:0x0299, B:77:0x02a8, B:78:0x02d8, B:89:0x02f9, B:72:0x0293, B:82:0x02e7, B:59:0x0243, B:61:0x0253, B:63:0x025d), top: B:99:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x025b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0280 A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x0004, B:5:0x002e, B:35:0x01d9, B:37:0x01dd, B:40:0x01e7, B:43:0x0214, B:55:0x0238, B:57:0x023f, B:64:0x0271, B:66:0x0280, B:67:0x0285, B:69:0x028b, B:86:0x02ef, B:87:0x02f5, B:73:0x0299, B:77:0x02a8, B:78:0x02d8, B:89:0x02f9, B:72:0x0293, B:82:0x02e7, B:59:0x0243, B:61:0x0253, B:63:0x025d), top: B:99:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0293 A[Catch: Exception -> 0x02eb, TryCatch #2 {Exception -> 0x02eb, blocks: (B:3:0x0004, B:5:0x002e, B:35:0x01d9, B:37:0x01dd, B:40:0x01e7, B:43:0x0214, B:55:0x0238, B:57:0x023f, B:64:0x0271, B:66:0x0280, B:67:0x0285, B:69:0x028b, B:86:0x02ef, B:87:0x02f5, B:73:0x0299, B:77:0x02a8, B:78:0x02d8, B:89:0x02f9, B:72:0x0293, B:82:0x02e7, B:59:0x0243, B:61:0x0253, B:63:0x025d), top: B:99:0x0004 }] */
    /* JADX INFO: renamed from: aM */
    final void m211aM() {
        byte b;
        int i;
        byte b2;
        boolean zM223d;
        long jCurrentTimeMillis;
        int i2;
        int i3;
        byte b3;
        byte b4;
        boolean z;
        int i4;
        try {
            this.f519d.f50b = this.f365aB[32];
            this.f519d.f57c = this.f365aB[33];
            this.f519d.f64d = (byte) 0;
            this.f357a = RecordStore.openRecordStore("aow222", true);
            if (this.f357a.getNumRecords() > 0) {
                try {
                    this.f354a = new DataInputStream(new ByteArrayInputStream(this.f357a.getRecord(1)));
                    this.f519d.f118q = this.f354a.readByte();
                    this.f519d.f116p = this.f354a.readByte();
                    this.f433au = this.f354a.readByte();
                    this.f436av = this.f354a.readByte();
                    this.f445ay = this.f354a.readByte();
                    this.f439aw = this.f354a.readByte();
                    this.f442ax = this.f354a.readByte();
                    this.f336F = this.f354a.readBoolean();
                    this.f519d.f69e = this.f354a.readByte();
                    this.f361aA = this.f354a.readByte();
                    this.f364aB = this.f354a.readByte();
                    this.f519d.f63c[0][10] = this.f354a.readShort();
                    for (int i5 = 0; i5 < 100; i5++) {
                        this.f541l[i5] = this.f354a.readShort();
                        if (this.f541l[i5] >= 0) {
                            byte b5 = this.f354a.readByte();
                            this.f524e[i5] = "";
                            for (int i6 = 0; i6 < b5; i6++) {
                                StringBuffer stringBuffer = new StringBuffer();
                                String[] strArr = this.f524e;
                                strArr[i5] = stringBuffer.append(strArr[i5]).append((char) (this.f354a.readByte() & 255)).toString();
                            }
                        }
                    }
                    this.f354a.read(this.f428as);
                    this.f376aG = this.f354a.readByte();
                    this.f528g = this.f354a.readLong();
                    try {
                        b4 = this.f354a.readByte();
                        if (b4 > 0) {
                            try {
                                byte b6 = this.f354a.readByte();
                                this.f511cb = 0;
                                for (int i7 = 0; i7 < 5; i7++) {
                                    this.f519d.f82g[i7] = 0;
                                }
                                for (int i8 = 0; i8 < b6; i8++) {
                                    int iM177f = m177f();
                                    for (int i9 = 0; i9 < 4; i9++) {
                                        int iM177f2 = m177f();
                                        this.f519d.f46a[i9][iM177f] = "";
                                        for (int i10 = 0; i10 < iM177f2; i10++) {
                                            StringBuffer stringBuffer2 = new StringBuffer();
                                            String[] strArr2 = this.f519d.f46a[i9];
                                            strArr2[iM177f] = stringBuffer2.append(strArr2[iM177f]).append((char) m177f()).toString();
                                        }
                                        this.f519d.f82g[iM177f] = (byte) m177f();
                                    }
                                }
                                this.f389aM = this.f354a.readByte();
                                this.f519d.f63c[this.f519d.f109n][9] = this.f354a.readShort();
                                i4 = this.f354a.readInt();
                                try {
                                    this.f375aF = this.f354a.readShort() ^ this.f547q[24];
                                    this.f377aG = this.f354a.readInt();
                                    this.f406ah = this.f354a.readByte();
                                    this.f395aQ = this.f354a.readByte();
                                    this.f396aR = this.f354a.readByte();
                                    try {
                                        b3 = this.f354a.readByte();
                                        i = i4;
                                        z = true;
                                    } catch (Exception e) {
                                        b3 = 0;
                                        i = i4;
                                        z = true;
                                    }
                                } catch (Exception e2) {
                                    b3 = 0;
                                    i = i4;
                                    z = true;
                                }
                            } catch (Exception e3) {
                                i4 = 0;
                                b3 = 0;
                                i = i4;
                                z = true;
                                if (this.f354a != null) {
                                    this.f354a.close();
                                }
                                b = b3;
                                b2 = b4;
                                zM223d = z;
                                if (zM223d) {
                                    zM223d = this.f519d.f37a.m223d(this.f519d.f37a.f553cj);
                                    i2 = this.f519d.f64d ^ ((this.f519d.f50b ^ this.f365aB[this.f546p[0] + 38]) ^ this.f519d.f57c);
                                    for (i3 = 0; i3 < 8; i3++) {
                                        i2 = (i2 >> 1) | (i2 & 1);
                                    }
                                    if (zM223d) {
                                        if (i2 == 0) {
                                            zM223d = true;
                                        } else {
                                            zM223d = false;
                                        }
                                    }
                                }
                                this.f357a.closeRecordStore();
                                if (zM223d) {
                                    this.f433au = -1;
                                    this.f436av = -1;
                                    this.f445ay = -1;
                                    this.f439aw = -1;
                                    this.f442ax = -1;
                                    for (int i11 = 0; i11 < 100; i11++) {
                                        this.f541l[i11] = -1;
                                    }
                                    this.f376aG = (byte) 0;
                                    this.f519d.f116p = (byte) -1;
                                    this.f519d.f118q = (byte) -1;
                                    this.f528g = 0L;
                                    this.f389aM = 0;
                                } else {
                                    this.f433au = -1;
                                    this.f436av = -1;
                                    this.f445ay = -1;
                                    this.f439aw = -1;
                                    this.f442ax = -1;
                                    while (i11 < 100) {
                                        this.f541l[i11] = -1;
                                    }
                                    this.f376aG = (byte) 0;
                                    this.f519d.f116p = (byte) -1;
                                    this.f519d.f118q = (byte) -1;
                                    this.f528g = 0L;
                                    this.f389aM = 0;
                                }
                                jCurrentTimeMillis = C0010k.currentTimeMillis();
                                if (jCurrentTimeMillis - this.f528g > 1209600000) {
                                    this.f328A = true;
                                    this.f528g = jCurrentTimeMillis;
                                }
                                if (this.f519d.f116p < 0) {
                                    m207a(63, true);
                                } else {
                                    m207a(63, true);
                                }
                                if (this.f519d.f116p == 1) {
                                    this.f519d.f46a[0][3] = new StringBuffer().append(this.f512cc | this.f513cd).toString();
                                    this.f519d.f46a[1][3] = String.valueOf(new char[]{'6', '1', '0'});
                                }
                                m168d(-1, (int) this.f519d.f69e);
                                m127aL();
                            }
                        } else {
                            this.f389aM = this.f354a.readByte();
                            this.f519d.f63c[this.f519d.f109n][9] = this.f354a.readShort();
                            i4 = this.f354a.readInt();
                            this.f375aF = this.f354a.readShort() ^ this.f547q[24];
                            this.f377aG = this.f354a.readInt();
                            this.f406ah = this.f354a.readByte();
                            this.f395aQ = this.f354a.readByte();
                            this.f396aR = this.f354a.readByte();
                            b3 = this.f354a.readByte();
                            i = i4;
                            z = true;
                        }
                    } catch (Exception e4) {
                        i4 = 0;
                        b4 = 0;
                    }
                } catch (Exception e5) {
                    b3 = 0;
                    i = 0;
                    b4 = 0;
                    z = false;
                }
                if (this.f354a != null) {
                    this.f354a.close();
                }
                b = b3;
                b2 = b4;
                zM223d = z;
            } else {
                b = 0;
                i = 0;
                b2 = 0;
                zM223d = false;
            }
            if (zM223d) {
                zM223d = this.f519d.f37a.m223d(this.f519d.f37a.f553cj);
                i2 = this.f519d.f64d ^ ((this.f519d.f50b ^ this.f365aB[this.f546p[0] + 38]) ^ this.f519d.f57c);
                while (i3 < 8) {
                    i2 = (i2 >> 1) | (i2 & 1);
                }
                if (zM223d) {
                    if (i2 == 0) {
                        zM223d = true;
                    } else {
                        zM223d = false;
                    }
                }
            }
            this.f357a.closeRecordStore();
            if (zM223d || !this.f353S) {
                this.f433au = -1;
                this.f436av = -1;
                this.f445ay = -1;
                this.f439aw = -1;
                this.f442ax = -1;
                while (i11 < 100) {
                    this.f541l[i11] = -1;
                }
                this.f376aG = (byte) 0;
                this.f519d.f116p = (byte) -1;
                this.f519d.f118q = (byte) -1;
                this.f528g = 0L;
                this.f389aM = 0;
            } else if (b2 < 2) {
                this.f439aw = -1;
            }
            jCurrentTimeMillis = C0010k.currentTimeMillis();
            if (jCurrentTimeMillis - this.f528g > 1209600000) {
                this.f328A = true;
                this.f528g = jCurrentTimeMillis;
            }
            if (this.f519d.f116p < 0 && i == this.f519d.f102l && b == 0) {
                if (b2 <= 0) {
                    this.f519d.m25b(1);
                }
                if (this.f328A) {
                    m207a(50, true);
                    this.f499bq = 27;
                    this.f497bo = 27;
                    this.f328A = false;
                }
            } else {
                m207a(63, true);
            }
            if (this.f519d.f116p == 1 && jCurrentTimeMillis <= 1259583723485L) {
                this.f519d.f46a[0][3] = new StringBuffer().append(this.f512cc | this.f513cd).toString();
                this.f519d.f46a[1][3] = String.valueOf(new char[]{'6', '1', '0'});
            }
            m168d(-1, (int) this.f519d.f69e);
            m127aL();
        } catch (Exception e6) {
        }
    }

    /* JADX INFO: renamed from: aN */
    final void m212aN() {
        int length = this.f519d.f37a.f563q.length() ^ this.f519d.f64d;
        for (int i = 0; i < 5; i++) {
            length = (length >> 1) | (length & 1);
        }
        this.f519d.f64d = (byte) (this.f365aB[this.f546p[0] + 37] ^ (length & 1));
    }

    /* JADX INFO: renamed from: ac */
    final void m213ac() {
        short s;
        if (this.f367aC == 0 && this.f448az == 1 && this.f519d.f98k >= 2500 && this.f519d.f105m == 1) {
            this.f519d.f105m = (byte) 0;
            this.f501bs = 0;
            m207a(29, true);
            this.f499bq = -7;
            this.f497bo = 0;
            this.f500br = -1;
            this.f498bp = 0;
            this.f508bz = 52;
            this.f407ai = (byte) 4;
            this.f519d.f120r = (byte) -1;
            return;
        }
        if (this.f519d.f122s > 0 && this.f519d.f122s < 4) {
            RunnableC0002c runnableC0002c = this.f519d;
            runnableC0002c.f122s = (byte) (runnableC0002c.f122s - 1);
        }
        if (this.f533h >= 0) {
            this.f432au = (byte) (this.f432au + 1);
            if (this.f432au > this.f519d.f79f[6][this.f533h] - this.f519d.f79f[5][this.f533h]) {
                if (this.f519d.f105m == 0 && this.f533h == 271) {
                    this.f519d.f105m = (byte) 1;
                    this.f407ai = (byte) 4;
                    if (this.f530g >= 0) {
                        if (this.f519d.f90i) {
                            this.f533h = (short) 270;
                            this.f432au = (byte) 0;
                        }
                        m139am();
                    }
                }
                this.f533h = (short) -1;
            }
        }
        if (this.f452b.f167G != 0 && (this.f519d.f105m == 1 || (this.f519d.f94j < 0 && this.f519d.f105m == 2))) {
            C0005f c0005f = this.f452b;
            c0005f.f170H = (byte) (c0005f.f170H + 1);
            if (this.f452b.f170H >= 50) {
                if (this.f452b.f167G == 1) {
                    short[] sArr = this.f519d.f63c[this.f519d.f109n];
                    sArr[9] = (short) (sArr[9] + ((this.f519d.f63c[this.f519d.f109n][6] * 10) - (this.f519d.f63c[this.f519d.f109n][8] * 5)));
                    int iM57a = C0005f.m57a((int) this.f519d.f63c[this.f519d.f109n][9], 0, this.f385aK > 0 ? this.f387aL * 100 : 100000);
                    int iMax = Math.max((this.f385aK * 500) - (this.f519d.f98k / 20), 0);
                    if (this.f385aK > 0) {
                        this.f519d.f63c[this.f519d.f109n][9] = (short) ((((iM57a * (iMax / 2)) / (this.f387aL * 100)) + iMax) / (2 - this.f381aI));
                    } else {
                        this.f519d.f63c[this.f519d.f109n][9] = (short) (iM57a / (2 - this.f381aI));
                    }
                    if (this.f379aH == 0) {
                        short[] sArr2 = this.f519d.f63c[0];
                        sArr2[10] = (short) (sArr2[10] + this.f519d.f63c[this.f519d.f109n][9]);
                    } else if (this.f379aH == 1 && this.f448az > 6) {
                        this.f389aM = this.f448az;
                        m127aL();
                    }
                }
                if (this.f452b.f167G == 1 && this.f379aH == 0) {
                    if (this.f448az < 6) {
                        this.f448az++;
                        this.f436av = this.f448az;
                        this.f445ay = Math.max(this.f436av, this.f445ay);
                    } else {
                        this.f448az = -1;
                        this.f433au = -1;
                        this.f436av = -1;
                    }
                    m127aL();
                }
                if (this.f519d.f63c[0][9] < 0) {
                    this.f519d.f63c[0][9] = 0;
                }
                if (this.f519d.f63c[1][9] < 0) {
                    this.f519d.f63c[1][9] = 0;
                }
                this.f519d.f105m = (byte) 0;
                this.f407ai = (byte) 4;
                this.f501bs = -1;
                if (this.f372aE < 0 || this.f452b.f167G != 1) {
                    m207a((this.f452b.f167G + 25) - 1, true);
                } else {
                    m207a(18, true);
                    this.f363aB = (byte) 0;
                    this.f366aC = (byte) 1;
                    this.f360aA = this.f372aE;
                    this.f508bz = this.f365aB[this.f546p[157] + this.f372aE] & 255;
                    this.f372aE = (byte) -1;
                }
                if (this.f519d.f90i) {
                    this.f533h = (short) 270;
                    this.f432au = (byte) 0;
                }
                this.f345K = true;
            }
        }
        for (int i = 10; i < this.f410aj.length; i++) {
            if (this.f410aj[i] >= 0) {
                byte[] bArr = this.f410aj;
                bArr[i] = (byte) (bArr[i] + 1);
                if (this.f410aj[i] >= this.f365aB[this.f546p[126] + i]) {
                    this.f410aj[i] = -1;
                }
            }
        }
        switch (this.f519d.f105m) {
            case 0:
                if (this.f366aC != 0) {
                    m130ad();
                }
                if (this.f501bs == 46 || this.f501bs == 84 || this.f501bs == 87) {
                    m143aq();
                } else if (this.f501bs == 62) {
                    m144ar();
                } else {
                    m141ao();
                }
                break;
            case 1:
                if (this.f523e >= 0) {
                    this.f423aq = (byte) (this.f423aq + 1);
                    if (this.f423aq > this.f519d.f79f[6][this.f523e] - this.f519d.f79f[5][this.f523e]) {
                        this.f523e = (short) -1;
                    }
                }
                if (this.f444ay >= 0) {
                    this.f444ay = (byte) (this.f444ay + 1);
                    if (this.f444ay >= 5) {
                        this.f444ay = (byte) -1;
                    }
                }
                for (int i2 = 0; i2 < 10; i2++) {
                    if (this.f410aj[i2] >= 0) {
                        byte[] bArr2 = this.f410aj;
                        bArr2[i2] = (byte) (bArr2[i2] + 1);
                        if (this.f410aj[i2] >= this.f365aB[this.f546p[126] + i2]) {
                            this.f410aj[i2] = -1;
                        }
                    }
                }
                if (this.f417an >= 0 && this.f520d >= 0) {
                    this.f417an = (byte) (this.f417an + 1);
                    if (this.f417an > this.f519d.f79f[6][this.f520d] - this.f519d.f79f[5][this.f520d]) {
                        this.f417an = (byte) -1;
                        this.f520d = (short) (this.f359a > 0 ? this.f520d - 4 : this.f520d == 261 ? 1992 : 2000);
                    }
                }
                boolean zM188i = (this.f536i != 0 || this.f425ar >= 0 || this.f435av >= 0 || this.f526f != -1) ? true : m188i();
                if (this.f536i != 0) {
                    s = 249;
                } else if (zM188i) {
                    s = this.f335E[0][50] > 0 ? (short) 251 : (short) 250;
                } else {
                    s = 252;
                }
                this.f509c = s;
                if (this.f454b != this.f359a) {
                    if (this.f359a == 0 || (!zM188i && this.f335E[0][50] <= 0)) {
                        this.f417an = (byte) -1;
                        this.f520d = (short) -1;
                    } else {
                        int i3 = (this.f359a <= 0 || ((1 << this.f371aD[this.f359a + 2323]) & 16447) != 0) ? 0 : 1;
                        this.f520d = (short) ((this.f359a < 0 ? zM188i ? 261 : 265 : zM188i ? 257 : 259) + i3);
                        this.f417an = (byte) 0;
                    }
                    this.f454b = this.f359a;
                }
                if (this.f448az == 2 && this.f452b.f229aa == 2) {
                    if (this.f452b.f165F <= 15) {
                        this.f519d.f120r = (byte) 2;
                        this.f452b.f165F++;
                    } else {
                        this.f519d.f120r = (byte) -1;
                        C0005f c0005f2 = this.f452b;
                        c0005f2.f229aa = (byte) (c0005f2.f229aa + 1);
                    }
                }
                if (this.f360aA >= 0) {
                    if (this.f533h < 0 && this.f526f >= 0) {
                        this.f530g = this.f526f;
                        short s2 = this.f359a;
                        this.f497bo = s2;
                        this.f499bq = s2;
                        int i4 = this.f486bd;
                        this.f498bp = i4;
                        this.f500br = i4;
                        this.f400aV = this.f508bz;
                        if (this.f519d.f90i) {
                            this.f533h = (short) 271;
                            this.f432au = (byte) 0;
                        }
                        this.f526f = (short) -1;
                    }
                    if (this.f533h < 0 && this.f526f < 0) {
                        this.f519d.f105m = (byte) 0;
                        this.f501bs = -1;
                        if (this.f360aA < 50) {
                            m207a(18, true);
                            this.f363aB = (byte) 0;
                            this.f366aC = (byte) 1;
                            this.f508bz = this.f365aB[this.f546p[157] + this.f360aA] & 255;
                        } else {
                            m207a(17, true);
                        }
                        if (this.f519d.f90i) {
                            this.f533h = (short) 270;
                            this.f432au = (byte) 0;
                        }
                        this.f345K = true;
                    }
                    this.f519d.f120r = (byte) -1;
                } else if (this.f533h < 0) {
                    if (this.f526f == -1) {
                        m131ae();
                    } else {
                        m138al();
                    }
                }
                break;
            case 2:
                m140an();
                break;
        }
        if (this.f519d.f120r != -1) {
            this.f519d.f110n++;
            if (this.f519d.f107m) {
                this.f519d.f120r = (byte) -1;
            }
        }
    }

    /* JADX INFO: renamed from: ax */
    final void m214ax() {
        byte b = this.f452b.f323z;
        byte b2 = this.f452b.f147A;
        this.f452b.f323z = (byte) C0005f.m57a(this.f409aj - 4, 0, this.f452b.f314x - 8);
        this.f452b.f147A = (byte) C0005f.m57a(this.f411ak - (this.f452b.f191O / 2), 0, this.f452b.f318y - this.f452b.f191O);
        m162c(this.f452b.f323z - b, this.f452b.f147A - b2);
        this.f407ai = (byte) 4;
    }

    /* JADX INFO: renamed from: b */
    final int m215b(int i, int i2) {
        int i3 = i + i2;
        while (true) {
            if (i3 >= (this.f519d.f109n == 0 ? 0 : 24)) {
                if (i3 >= (this.f519d.f109n == 0 ? 24 : 48)) {
                    break;
                }
                if ((this.f452b.f275f & (1 << i3)) == 0) {
                    return i3;
                }
                i3 += i2;
            } else {
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    final void m216b(byte b) {
        if (this.f519d.f105m == 1 || (this.f379aH == 2 && this.f519d.f105m == 2)) {
            this.f519d.f105m = (byte) 0;
            this.f501bs = -1;
            this.f526f = (short) -1;
            this.f530g = (short) -1;
            this.f332D = false;
            this.f329B = false;
            m207a(b, true);
            if (this.f379aH == 2) {
                this.f349O = true;
            }
            this.f519d.f120r = (byte) -1;
        }
    }

    /* JADX INFO: renamed from: e */
    final void m217e(int i, int i2, int i3) {
        if (this.f519d.f95j || i < 2183) {
            for (int i4 = this.f519d.f79f[0][i]; i4 <= this.f519d.f79f[1][i]; i4++) {
                short s = this.f519d.f79f[2][i4];
                if (this.f519d.f92i[6][i4] == 0) {
                    m178f(s, this.f519d.f79f[3][i4] + i2, this.f519d.f79f[4][i4] + i3);
                } else {
                    m217e(s, this.f519d.f79f[3][i4] + i2, this.f519d.f79f[4][i4] + i3);
                }
                if (i4 == this.f519d.f79f[0][i] && i >= 1854 && i <= 1867) {
                    this.f402aX = this.f519d.f79f[3][i4] + i2 + 1;
                    this.f403aY = this.f519d.f79f[4][i4] + i3 + 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    final void m218e(boolean z) {
        this.f346L = true;
        if (this.f407ai != -1) {
            this.f429at = (byte) 0;
            if (this.f407ai != 4) {
                this.f455b[1].drawImage(this.f519d.f43a[0], this.f365aB[this.f546p[12] + (this.f407ai << 1)] * 30, this.f365aB[this.f546p[12] + (this.f407ai << 1) + 1] * 20, 0);
                this.f455b[0].drawImage(this.f519d.f43a[1], 0, 0, 0);
            }
            int i = this.f407ai == 1 ? (this.f452b.f323z + 8) - 2 : this.f452b.f323z - 1;
            int i2 = this.f407ai == 0 ? this.f452b.f323z + 1 : this.f452b.f323z + 8 + 1;
            int i3 = this.f407ai == 3 ? (this.f452b.f147A + this.f452b.f191O) - 2 : this.f452b.f147A - 1;
            int i4 = this.f407ai == 2 ? this.f452b.f147A + 1 : this.f452b.f147A + this.f452b.f191O + 1;
            for (int i5 = i3; i5 < i4; i5++) {
                if (i5 >= 0 && i5 < this.f452b.f318y) {
                    for (int i6 = i; i6 < i2; i6++) {
                        if (i6 >= 0 && i6 < this.f452b.f314x) {
                            m217e(this.f543m[this.f343I[i5][i6] & 255], (i6 - this.f452b.f323z) * 30, (i5 - this.f452b.f147A) * 20);
                        }
                    }
                }
            }
            int i7 = i3 - 1;
            while (true) {
                int i8 = i7;
                if (i8 >= i4 + 1) {
                    break;
                }
                if (i8 >= 0 && i8 < this.f452b.f318y) {
                    int i9 = i - 1;
                    while (true) {
                        int i10 = i9;
                        if (i10 < i2 + 1) {
                            if (i10 >= 0 && i10 < this.f452b.f314x) {
                                byte b = this.f331C[i8][i10];
                                while (b >= 0) {
                                    m217e(this.f452b.f281h[this.f333D[5][b]] + this.f333D[6][b], (((i10 - this.f452b.f323z) * 30) + this.f333D[2][b]) - 90, (((i8 - this.f452b.f147A) * 20) + this.f333D[3][b]) - 60);
                                    b = this.f368aC[b];
                                }
                            }
                            i9 = i10 + 1;
                        }
                    }
                }
                i7 = i8 + 1;
            }
            for (int i11 = this.f452b.f147A - 4; i11 < this.f452b.f147A + this.f452b.f191O + 2; i11++) {
                if (i11 >= 0 && i11 < this.f452b.f318y) {
                    for (int i12 = this.f452b.f323z - 4; i12 < this.f452b.f323z + 8 + 1; i12++) {
                        if (i12 >= 0 && i12 < this.f452b.f314x) {
                            m163c(i12, i11, 0);
                        }
                    }
                }
            }
            this.f407ai = (byte) -1;
        }
        this.f458bB = (this.f519d.f81g ? 0 : 15) + (-(this.f452b.f147A + this.f452b.f191O == this.f452b.f318y ? (20 - ((this.f519d.f81g ? 320 : 290) % 20)) % 20 : 0));
        this.f429at = (byte) 1;
        this.f455b[this.f429at].drawImage(this.f519d.f43a[0], 0, this.f458bB, 0);
        if (!z) {
            this.f429at = (byte) 0;
            this.f455b[this.f429at].drawImage(this.f519d.f43a[1], 0, 0, 0);
        }
        m150ay();
        m119aA();
        this.f346L = false;
        this.f458bB = 0;
        m220n(133, 0, 0, 1, 0);
        m220n(134, 0, 320, 1, 0);
        if (!z) {
            m217e(2151, 0, 0);
        }
        m220n(144, 0, 320, 1, 0);
        if (this.f533h >= 0 && z) {
            m221o(this.f533h, 120, 160, this.f432au, -1);
        } else {
            if (this.f526f < 0 || !z) {
                return;
            }
            m220n(this.f526f, this.f526f != 145 ? 120 : this.f502bt, this.f526f != 145 ? 160 : this.f503bu, 1, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    final boolean m219f() {
        byte bM103b;
        int i = 2;
        this.f469bM = this.f450b.f1a;
        this.f519d.f128v = false;
        switch (this.f426ar[0]) {
            case -6:
                this.f519d.f120r = (byte) -1;
                this.f519d.f127u = false;
                this.f486bd = -1;
                this.f501bs = -1;
                this.f426ar[0] = -6;
                this.f450b.f1a = 1;
                this.f450b.f0a = (byte) 1;
                this.f519d.f124t = (byte) 10;
                this.f469bM = 0;
                m207a(67, true);
                this.f469bM = 0;
                return false;
            case -5:
                this.f519d.f120r = (byte) -1;
                this.f519d.f127u = false;
                m207a(9, true);
                break;
            case -4:
                this.f519d.f120r = (byte) -1;
                this.f519d.f127u = false;
                this.f450b.m4a();
                if (this.f501bs != 25 && this.f501bs != 26) {
                    m207a(72, true);
                }
                break;
            case -3:
                this.f519d.f128v = true;
                break;
            case -2:
                this.f519d.f120r = (byte) -1;
                if (this.f519d.f105m == 1 || this.f519d.f105m == 2) {
                    this.f400aV = this.f508bz;
                    this.f401aW = this.f486bd;
                    this.f519d.f105m = (byte) 0;
                    this.f501bs = -1;
                    m207a(71, true);
                }
                if (this.f519d.f113o != 0) {
                    m133ag();
                    return true;
                }
                this.f470bN = this.f469bM - 1;
                for (int i2 = 0; i2 < this.f470bN; i2++) {
                    this.f426ar[(17500 - this.f470bN) + i2] = this.f426ar[i2 + 1];
                }
                break;
                break;
            case 0:
                for (int i3 = 0; i3 < this.f426ar[1]; i3++) {
                    this.f371aD[this.f426ar[i] + 1717] = this.f426ar[i + 1];
                    this.f371aD[this.f426ar[i] + 1818] = this.f426ar[i + 2];
                    this.f371aD[this.f426ar[i] + 1111] = 0;
                    this.f371aD[this.f426ar[i] + 4545] = 0;
                    this.f371aD[this.f426ar[i] + 1919] = this.f426ar[i + 3];
                    this.f371aD[this.f426ar[i] + 3131] = this.f426ar[i + 4];
                    this.f371aD[this.f426ar[i] + 707] = this.f426ar[i + 5];
                    this.f371aD[this.f426ar[i] + 1515] = 1;
                    byte[] bArr = this.f371aD;
                    int i4 = this.f426ar[i] + 2828;
                    bArr[i4] = (byte) (bArr[i4] & 191);
                    i += 6;
                }
                break;
            case 1:
                for (int i5 = 0; i5 < this.f426ar[1]; i5++) {
                    byte[] bArr2 = this.f371aD;
                    int i6 = this.f426ar[i] + 2828;
                    bArr2[i6] = (byte) (bArr2[i6] | 64);
                    i++;
                }
                break;
            case 2:
                for (int i7 = 0; i7 < this.f426ar[1]; i7++) {
                    byte[] bArr3 = this.f371aD;
                    int i8 = this.f426ar[i] + 2929;
                    bArr3[i8] = (byte) (bArr3[i8] | 32);
                    i++;
                }
                break;
            case 3:
                int i9 = 3;
                if (this.f371aD[this.f426ar[1] + 6767] >= 0) {
                    for (int i10 = this.f371aD[this.f426ar[1] + 6767]; i10 < 60 && this.f452b.f187M[i10] == this.f426ar[1]; i10++) {
                        this.f452b.f187M[i10] = 0;
                    }
                    this.f371aD[this.f426ar[1] + 6767] = -1;
                }
                if (this.f426ar[2] > 0) {
                    byte bM103b2 = this.f452b.m103b((int) this.f426ar[2]);
                    if (bM103b2 >= 0) {
                        for (byte b = 0; b < this.f426ar[2]; b = (byte) (b + 1)) {
                            this.f452b.f187M[bM103b2 + b] = this.f426ar[1];
                            this.f452b.f181K[bM103b2 + b] = this.f426ar[i9];
                            this.f452b.f184L[bM103b2 + b] = this.f426ar[i9 + 1];
                            i9 += 2;
                        }
                        this.f371aD[this.f426ar[1] + 6767] = bM103b2;
                    }
                } else if (this.f371aD[this.f426ar[1] + 6868] >= 0 && (bM103b = this.f452b.m103b(1)) >= 0) {
                    this.f452b.f187M[bM103b] = this.f426ar[1];
                    this.f452b.f181K[bM103b] = this.f371aD[this.f426ar[1] + 6868];
                    this.f452b.f184L[bM103b] = 0;
                    this.f371aD[this.f426ar[1] + 6767] = bM103b;
                }
                break;
            case 4:
                short[] sArr = this.f519d.f63c[this.f519d.f109n ^ 1];
                sArr[4] = (short) (sArr[4] - this.f547q[this.f426ar[2] + this.f548r[6]]);
                if (this.f426ar[1] < 15) {
                    m206a(this.f426ar[1], this.f426ar[3], this.f426ar[4], this.f519d.f109n ^ 1, 0, false);
                } else {
                    this.f542l[this.f426ar[4]][this.f426ar[3]] = (short) (this.f426ar[1] >= 121 ? this.f426ar[1] : ((this.f519d.f109n ^ 1) * 100) + 1001);
                    this.f407ai = (byte) 4;
                }
                break;
            case 5:
                this.f371aD[this.f426ar[1] + 6868] = this.f426ar[2];
                this.f371aD[this.f426ar[1] + 6767] = 100;
                this.f371aD[this.f426ar[1] + 6565] = 0;
                this.f452b.f268d |= 1 << this.f426ar[2];
                short[] sArr2 = this.f519d.f63c[this.f519d.f109n ^ 1];
                sArr2[4] = (short) (sArr2[4] - this.f547q[this.f426ar[2] + this.f548r[7]]);
                break;
            case 6:
                this.f371aD[this.f426ar[1] + 6161] = this.f426ar[2];
                this.f371aD[this.f426ar[1] + 6262] = this.f426ar[3];
                break;
            case 7:
                this.f452b.m100a(this.f426ar[1], this.f371aD[this.f426ar[1] + 5454] & 255);
                break;
        }
        this.f469bM = 0;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX INFO: renamed from: n */
    final void m220n(int i, int i2, int i3, int i4, int i5) {
        int iM57a;
        int i6;
        byte b;
        if (i5 <= 0) {
            iM57a = 0;
        } else if (this.f371aD[i5 + 5454] == -1) {
            iM57a = 7;
        } else {
            iM57a = C0005f.m57a((this.f371aD[i5 + 6060] & 1) != 0 ? 4 : 7 - (((this.f371aD[i5 + 5454] & 255) << 2) / (this.f365aB[this.f546p[59] + i] & 255)), 4, 7);
        }
        int i7 = this.f519d.f79f[14][i];
        int i8 = -1;
        byte b2 = 0;
        while (i7 <= this.f519d.f79f[15][i]) {
            short s = this.f519d.f79f[16][i7];
            if (this.f519d.f92i[24][i7] == 2) {
                if (i < 15) {
                    switch (this.f519d.f92i[25][i7]) {
                        case 1:
                            if (i4 == 1 && this.f519d.f92i[23][i7] == 2 && this.f371aD[i5 + 6969] >= 0 && this.f371aD[i5 + 6969] < this.f365aB[this.f546p[46] + this.f365aB[this.f546p[60] + i]]) {
                                m221o(s + this.f371aD[i5 + 7070], i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7], this.f371aD[i5 + 6969], -1);
                                i6 = i8;
                                b = b2;
                            } else {
                                i6 = i8;
                                b = b2;
                            }
                            break;
                        case 2:
                            if (i4 == 1 && this.f519d.f92i[23][i7] == 1) {
                                m217e(this.f371aD[i5 + 7070] + s, this.f519d.f79f[17][i7] + i2, this.f519d.f92i[20][i7] + i3);
                                i6 = i8;
                                b = b2;
                            } else {
                                i6 = i8;
                                b = b2;
                            }
                            break;
                        case 10:
                            if (i4 == 1 && (((this.f371aD[i5 + 6060] & 1) != 0 || this.f371aD[i5 + 7171] == 0 || ((this.f365aB[this.f546p[94] + i] % 3 > 0 || i == 4 || i == 12) && this.f371aD[i5 + 6868] < 0)) && this.f519d.f92i[23][i7] == 1)) {
                                m217e(s, this.f519d.f79f[17][i7] + i2, this.f519d.f92i[20][i7] + i3);
                            }
                            i6 = i8;
                            b = b2;
                            break;
                        default:
                            i6 = i8;
                            b = b2;
                            break;
                    }
                } else {
                    if (this.f519d.f92i[25][i7] != b2) {
                        b = this.f519d.f92i[25][i7];
                        i6 = 0;
                    } else {
                        i6 = i8 + 1;
                        b = b2;
                    }
                    switch (i) {
                        case 133:
                            m114a(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 134:
                            m154b(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 135:
                            m164c(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 136:
                            m171d(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 137:
                            m176e(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 138:
                            int i9 = i2 + this.f519d.f79f[17][i7];
                            int i10 = i3 + this.f519d.f92i[20][i7];
                            if (this.f342I) {
                                this.f378aH = (byte) 0;
                                if (this.f501bs == 87) {
                                    this.f431at[0] = 43;
                                    this.f378aH = (byte) 1;
                                }
                                this.f434au = this.f501bs == 46 ? this.f428as : this.f431at;
                                this.f380aI = this.f501bs == 46 ? this.f376aG : this.f378aH;
                                this.f342I = false;
                            }
                            switch (b) {
                                case 0:
                                    if (C0010k.currentTimeMillis() - this.f534i > 1000) {
                                        this.f534i = 0L;
                                        this.f382aJ = (byte) -1;
                                    }
                                    this.f453b.m235f(i9, i10, 1, (this.f501bs == 46 ? 65 : this.f501bs == 84 ? 68 : 69) + 0);
                                    break;
                                case 1:
                                    this.f453b.m232a(i9, i10 + 2, this.f434au, this.f380aI);
                                    if (((C0010k.currentTimeMillis() / 500) & 1) == 0) {
                                        m178f(s, this.f471bO, i10);
                                    }
                                    break;
                            }
                            break;
                        case 139:
                            if (!this.f340H) {
                                m182g(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            } else {
                                m179f(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            }
                            break;
                        case 140:
                            m185h(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 141:
                            m187i(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 142:
                            m189j(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 143:
                            m191k(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 144:
                            m193l(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                        case 145:
                            m195m(b, i6, s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7]);
                            break;
                    }
                }
            } else if ((this.f519d.f92i[24][i7] != i4 && i < 133) || (this.f519d.f92i[25][i7] > 0 && ((i4 == 0 && this.f519d.f92i[25][i7] != iM57a) || (i4 == 1 && this.f519d.f92i[25][i7] > iM57a)))) {
                i6 = i8;
                b = b2;
            } else if (this.f519d.f92i[23][i7] == 0) {
                m178f(s, this.f519d.f79f[17][i7] + i2, this.f519d.f92i[20][i7] + i3);
                i6 = i8;
                b = b2;
            } else if (this.f519d.f92i[23][i7] == 1) {
                m217e(s, this.f519d.f79f[17][i7] + i2, this.f519d.f92i[20][i7] + i3);
                i6 = i8;
                b = b2;
            } else {
                if (this.f519d.f92i[23][i7] == 2 && this.f371aD[i5 + 7171] != 0 && (this.f371aD[i5 + 6060] & 1) == 0 && ((this.f365aB[this.f546p[94] + i] % 3 <= 0 && i != 4 && i != 12) || this.f371aD[i5 + 6868] >= 0)) {
                    m221o(s, i2 + this.f519d.f79f[17][i7], i3 + this.f519d.f92i[20][i7], this.f519d.f98k + i + i5, -1);
                }
                i6 = i8;
                b = b2;
            }
            i7++;
            i8 = i6;
            b2 = b;
        }
        if (this.f453b.f585aP > 0) {
            this.f453b.m233a(this.f455b[this.f429at]);
        }
    }

    /* JADX INFO: renamed from: o */
    final void m221o(int i, int i2, int i3, int i4, int i5) {
        try {
            int i6 = this.f519d.f79f[5][i] + (i4 % ((this.f519d.f79f[6][i] - this.f519d.f79f[5][i]) + 1));
            if (i == 59) {
                this.f514ce = i2;
                this.f392aO = this.f452b.f166F[i5];
            }
            if (this.f519d.f92i[9][i6] == 0) {
                m178f(this.f519d.f79f[7][i6], this.f519d.f92i[7][i6] + i2, this.f519d.f92i[8][i6] + i3);
            } else {
                m217e(this.f519d.f79f[7][i6], this.f519d.f92i[7][i6] + i2, this.f519d.f92i[8][i6] + i3);
            }
            this.f514ce = -1000;
        } catch (Exception e) {
        }
    }
}
