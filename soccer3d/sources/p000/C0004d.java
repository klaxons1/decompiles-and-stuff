package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.TimerTask;
import javax.bluetooth.ServiceRecord;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: C:\Temp\jadx-9991838165078942717\classes.dex */
public class C0004d extends TimerTask {

    /* JADX INFO: renamed from: A */
    private int f29A;

    /* JADX INFO: renamed from: B */
    private int f30B;

    /* JADX INFO: renamed from: C */
    private int f31C;

    /* JADX INFO: renamed from: D */
    public int f32D;

    /* JADX INFO: renamed from: E */
    public int f33E;

    /* JADX INFO: renamed from: F */
    public long f34F;

    /* JADX INFO: renamed from: G */
    private int f35G;

    /* JADX INFO: renamed from: H */
    private Random f36H;

    /* JADX INFO: renamed from: J */
    private int f38J;

    /* JADX INFO: renamed from: K */
    private int f39K;

    /* JADX INFO: renamed from: L */
    public int f40L;

    /* JADX INFO: renamed from: N */
    public int f42N;

    /* JADX INFO: renamed from: O */
    public int f43O;

    /* JADX INFO: renamed from: P */
    private int f44P;

    /* JADX INFO: renamed from: Q */
    public int f45Q;

    /* JADX INFO: renamed from: R */
    private int f46R;

    /* JADX INFO: renamed from: S */
    public int f47S;

    /* JADX INFO: renamed from: U */
    private int f49U;

    /* JADX INFO: renamed from: V */
    public int f50V;

    /* JADX INFO: renamed from: W */
    public boolean f51W;

    /* JADX INFO: renamed from: X */
    private int f52X;

    /* JADX INFO: renamed from: a */
    private int[] f55a;

    /* JADX INFO: renamed from: aA */
    private int f56aA;

    /* JADX INFO: renamed from: aD */
    private int f59aD;

    /* JADX INFO: renamed from: aF */
    private int f61aF;

    /* JADX INFO: renamed from: aG */
    private int f62aG;

    /* JADX INFO: renamed from: aH */
    private int f63aH;

    /* JADX INFO: renamed from: aI */
    public int f64aI;

    /* JADX INFO: renamed from: aJ */
    private int f65aJ;

    /* JADX INFO: renamed from: aK */
    private int f66aK;

    /* JADX INFO: renamed from: aL */
    public int f67aL;

    /* JADX INFO: renamed from: aM */
    public int f68aM;

    /* JADX INFO: renamed from: aN */
    public int f69aN;

    /* JADX INFO: renamed from: aO */
    public int f70aO;

    /* JADX INFO: renamed from: aP */
    private int f71aP;

    /* JADX INFO: renamed from: aQ */
    private int f72aQ;

    /* JADX INFO: renamed from: aR */
    public int f73aR;

    /* JADX INFO: renamed from: aS */
    private int f74aS;

    /* JADX INFO: renamed from: aT */
    public int f75aT;

    /* JADX INFO: renamed from: aU */
    public int f76aU;

    /* JADX INFO: renamed from: aV */
    private int f77aV;

    /* JADX INFO: renamed from: aX */
    private int f79aX;

    /* JADX INFO: renamed from: aY */
    private String[] f80aY;

    /* JADX INFO: renamed from: aZ */
    private int f81aZ;

    /* JADX INFO: renamed from: aa */
    private int f82aa;

    /* JADX INFO: renamed from: ab */
    private int f83ab;

    /* JADX INFO: renamed from: ac */
    private int f84ac;

    /* JADX INFO: renamed from: ad */
    private int f85ad;

    /* JADX INFO: renamed from: ae */
    public int f86ae;

    /* JADX INFO: renamed from: af */
    public int f87af;

    /* JADX INFO: renamed from: ag */
    private int f88ag;

    /* JADX INFO: renamed from: ah */
    public int f89ah;

    /* JADX INFO: renamed from: ai */
    public long f90ai;

    /* JADX INFO: renamed from: aj */
    public int f91aj;

    /* JADX INFO: renamed from: al */
    private boolean f93al;

    /* JADX INFO: renamed from: am */
    private int f94am;

    /* JADX INFO: renamed from: ao */
    private int f96ao;

    /* JADX INFO: renamed from: ar */
    public int f99ar;

    /* JADX INFO: renamed from: at */
    private int f101at;

    /* JADX INFO: renamed from: au */
    private int f102au;

    /* JADX INFO: renamed from: av */
    private boolean f103av;

    /* JADX INFO: renamed from: ax */
    public int f105ax;

    /* JADX INFO: renamed from: ay */
    public int f106ay;

    /* JADX INFO: renamed from: az */
    private ByteArrayOutputStream f107az;

    /* JADX INFO: renamed from: b */
    public int f108b;

    /* JADX INFO: renamed from: bA */
    private int f109bA;

    /* JADX INFO: renamed from: bB */
    public int f110bB;

    /* JADX INFO: renamed from: bC */
    private int f111bC;

    /* JADX INFO: renamed from: bD */
    private Thread f112bD;

    /* JADX INFO: renamed from: bE */
    private int f113bE;

    /* JADX INFO: renamed from: bF */
    public boolean f114bF;

    /* JADX INFO: renamed from: bG */
    private int f115bG;

    /* JADX INFO: renamed from: bH */
    private int f116bH;

    /* JADX INFO: renamed from: bJ */
    private int f118bJ;

    /* JADX INFO: renamed from: bL */
    public int f120bL;

    /* JADX INFO: renamed from: bM */
    public int f121bM;

    /* JADX INFO: renamed from: bN */
    private Player f122bN;

    /* JADX INFO: renamed from: bO */
    public int f123bO;

    /* JADX INFO: renamed from: bP */
    public int f124bP;

    /* JADX INFO: renamed from: bR */
    private int f126bR;

    /* JADX INFO: renamed from: bS */
    private int f127bS;

    /* JADX INFO: renamed from: bT */
    private C0005e f128bT;

    /* JADX INFO: renamed from: bU */
    public int f129bU;

    /* JADX INFO: renamed from: ba */
    private int f130ba;

    /* JADX INFO: renamed from: bb */
    private int f131bb;

    /* JADX INFO: renamed from: bc */
    public int f132bc;

    /* JADX INFO: renamed from: bd */
    public int f133bd;

    /* JADX INFO: renamed from: be */
    private int f134be;

    /* JADX INFO: renamed from: bg */
    public int f136bg;

    /* JADX INFO: renamed from: bj */
    public int f139bj;

    /* JADX INFO: renamed from: bk */
    private int f140bk;

    /* JADX INFO: renamed from: bl */
    public int f141bl;

    /* JADX INFO: renamed from: bm */
    public int f142bm;

    /* JADX INFO: renamed from: bn */
    private long f143bn;

    /* JADX INFO: renamed from: bq */
    public int f146bq;

    /* JADX INFO: renamed from: bs */
    private int f148bs;

    /* JADX INFO: renamed from: bt */
    public int f149bt;

    /* JADX INFO: renamed from: bu */
    private int f150bu;

    /* JADX INFO: renamed from: bv */
    public int f151bv;

    /* JADX INFO: renamed from: bw */
    public int f152bw;

    /* JADX INFO: renamed from: bx */
    private boolean f153bx;

    /* JADX INFO: renamed from: by */
    private int f154by;

    /* JADX INFO: renamed from: bz */
    private int f155bz;

    /* JADX INFO: renamed from: c */
    private int f156c;

    /* JADX INFO: renamed from: d */
    public int f157d;

    /* JADX INFO: renamed from: e */
    private int f158e;

    /* JADX INFO: renamed from: g */
    private int f160g;

    /* JADX INFO: renamed from: h */
    private int f161h;

    /* JADX INFO: renamed from: i */
    public int f162i;

    /* JADX INFO: renamed from: j */
    private int f163j;

    /* JADX INFO: renamed from: k */
    private int f164k;

    /* JADX INFO: renamed from: l */
    private int f165l;

    /* JADX INFO: renamed from: m */
    public int f166m;

    /* JADX INFO: renamed from: n */
    private int f167n;

    /* JADX INFO: renamed from: o */
    public int f168o;

    /* JADX INFO: renamed from: p */
    public int f169p;

    /* JADX INFO: renamed from: q */
    public int f170q;

    /* JADX INFO: renamed from: s */
    public int f172s;

    /* JADX INFO: renamed from: t */
    public int f173t;

    /* JADX INFO: renamed from: u */
    public int f174u;

    /* JADX INFO: renamed from: x */
    public int f177x;

    /* JADX INFO: renamed from: y */
    private int f178y;

    /* JADX INFO: renamed from: z */
    private int f179z;

    /* JADX INFO: renamed from: I */
    int[] f37I = {0, 10, 40, 100};

    /* JADX INFO: renamed from: br */
    private RunnableC0002c f147br = null;

    /* JADX INFO: renamed from: bQ */
    private boolean f125bQ = false;

    /* JADX INFO: renamed from: bI */
    public boolean f117bI = true;

    /* JADX INFO: renamed from: aW */
    public boolean f78aW = false;

    /* JADX INFO: renamed from: w */
    private int f176w = 0;

    /* JADX INFO: renamed from: aw */
    private int f104aw = 0;

    /* JADX INFO: renamed from: as */
    public int f100as = 0;

    /* JADX INFO: renamed from: aC */
    private boolean f58aC = false;

    /* JADX INFO: renamed from: aE */
    private int[] f60aE = {0, 0};

    /* JADX INFO: renamed from: aq */
    public int[] f98aq = {0, 0};

    /* JADX INFO: renamed from: an */
    public int[] f95an = {0, 0};

    /* JADX INFO: renamed from: ak */
    private int f92ak = 0;

    /* JADX INFO: renamed from: bi */
    public int[] f138bi = {0, 3, 0, 3, 1, 0, 1, 2, 3, 1, 3, 3, 3, 2, 0, 2, 2, 2, 2, 1, 1, 3, 3, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2};

    /* JADX INFO: renamed from: M */
    public int[] f41M = {0, 0};

    /* JADX INFO: renamed from: v */
    public long[] f175v = {0, 0};

    /* JADX INFO: renamed from: Y */
    int[] f53Y = {36, 16, 12};

    /* JADX INFO: renamed from: r */
    int[] f171r = {6, 7, 0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: bo */
    int[] f144bo = {0, 0};

    /* JADX INFO: renamed from: bf */
    int[] f135bf = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: bh */
    int[] f137bh = {8, 6, 4};

    /* JADX INFO: renamed from: bp */
    int[] f145bp = {80, 60, 50};

    /* JADX INFO: renamed from: T */
    private int[] f48T = null;

    /* JADX INFO: renamed from: ap */
    private byte[] f97ap = new byte[1];

    /* JADX INFO: renamed from: Z */
    private boolean f54Z = false;

    /* JADX INFO: renamed from: bK */
    public int[] f119bK = new int[482];

    /* JADX INFO: renamed from: f */
    public int[] f159f = new int[921];

    /* JADX INFO: renamed from: aB */
    public int[] f57aB = new int[8];

    public C0004d(C0005e c0005e) throws Exception {
        this.f107az = null;
        this.f107az = new ByteArrayOutputStream(332);
        this.f128bT = c0005e;
        m39m();
        InputStream resourceAsStream = getClass().getResourceAsStream("/0.d");
        for (int i = 0; i < 921; i++) {
            this.f159f[i] = resourceAsStream.read() + (resourceAsStream.read() << 8) + (resourceAsStream.read() << 16) + (resourceAsStream.read() << 24);
        }
        resourceAsStream.close();
        this.f36H = new Random();
        this.f143bn = 0L;
        this.f87af = 0;
        this.f174u = -1;
        this.f120bL = -1;
        this.f40L = -1;
        this.f31C = 0;
        this.f162i = 1;
        this.f165l = 1;
        this.f154by = 0;
        this.f91aj = 1;
        this.f133bd = 1;
        m21B();
        this.f157d = -1;
        this.f152bw = -1;
        this.f51W = true;
        this.f77aV = 0;
        this.f113bE = 0;
        m37k();
        m96z();
        m84j(4);
        this.f33E = 0;
        this.f132bc = 0;
        this.f85ad = 2;
        m42p(9);
    }

    /* JADX INFO: renamed from: B */
    private void m21B() {
        this.f48T = new int[47];
        for (int i = 0; i < 47; i++) {
            this.f48T[i] = -1;
        }
    }

    /* JADX INFO: renamed from: C */
    private void m22C() {
        for (int i = 0; i < 192; i++) {
            this.f128bT.f273w[i] = null;
            this.f128bT.f235aj[i] = null;
            this.f128bT.f209aC[i] = null;
            this.f128bT.f204Y[i] = null;
            this.f128bT.f199T[i] = null;
            this.f128bT.f230ae[i] = null;
            this.f128bT.f187H[i] = null;
            this.f128bT.f229ad[i] = null;
            this.f128bT.f194O[i] = null;
            this.f128bT.f195P[i] = null;
        }
        if (this.f152bw != -1) {
            this.f128bT.m135b(this.f152bw);
            this.f152bw = -1;
        }
    }

    /* JADX INFO: renamed from: D */
    private void m23D() {
        int i = this.f142bm - 1;
        if (i >= this.f30B) {
            i = this.f30B - 1;
        } else if (i < 0) {
            i = 0;
        }
        this.f128bT.m139c(1);
        this.f128bT.m155i(1);
        this.f128bT.m136b((short) 33);
        this.f80aY = new String[1];
        this.f80aY[0] = new StringBuffer().append("").append(i + 1).toString();
        this.f128bT.m131a((short) 27, this.f80aY);
        this.f80aY[0] = new StringBuffer().append("").append(this.f55a[this.f44P * i]).toString();
        this.f128bT.m131a((short) 28, this.f80aY);
        this.f80aY = new String[1];
        this.f80aY[0] = new StringBuffer().append("").append(this.f55a[(this.f44P * i) + 1]).toString();
        this.f128bT.m131a((short) 56, this.f80aY);
        this.f80aY = new String[2];
        this.f80aY[0] = new StringBuffer().append("").append(this.f55a[(this.f44P * i) + 2]).toString();
        this.f80aY[1] = new StringBuffer().append("").append(this.f55a[(i * this.f44P) + 3]).toString();
        this.f128bT.m131a((short) 55, this.f80aY);
        this.f128bT.m129a((short) -1, (short) 137);
        if (this.f142bm < 1) {
            this.f142bm = 1;
        }
    }

    /* JADX INFO: renamed from: F */
    private void m24F() {
        this.f128bT.m139c(1);
        this.f128bT.m136b((short) 49);
        this.f128bT.m145d((short) 126);
        this.f128bT.m129a((short) 154, (short) 147);
        this.f142bm = 0;
        m38l(0);
    }

    /* JADX INFO: renamed from: a */
    private int m25a(int i) {
        if (i <= 0 || i >= 47) {
            return -1;
        }
        return this.f48T[i];
    }

    /* JADX INFO: renamed from: a */
    private int m26a(int i, int i2, int i3, int i4, int i5) {
        for (int i6 = 0; i6 < this.f30B; i6++) {
            int[] iArrM89n = m89n(i6);
            if (i < iArrM89n[0]) {
                m28a(i6, i, i2, i3, i4, i5);
                return i6;
            }
            if (i == iArrM89n[0]) {
                if (i2 > iArrM89n[1]) {
                    m28a(i6, i, i2, i3, i4, i5);
                    return i6;
                }
                if (i2 == iArrM89n[1] && i3 - i4 >= iArrM89n[2] - iArrM89n[3]) {
                    m28a(i6, i, i2, i3, i4, i5);
                    return i6;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private void m27a(int i, int i2) {
        if (i <= 0 || i >= 47) {
            return;
        }
        this.f48T[i] = i2;
    }

    /* JADX INFO: renamed from: a */
    private void m28a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i >= this.f30B || i <= -1) {
            return;
        }
        for (int i7 = this.f30B - 2; i7 >= i; i7--) {
            this.f55a[(i7 + 1) * this.f44P] = this.f55a[this.f44P * i7];
            this.f55a[((i7 + 1) * this.f44P) + 1] = this.f55a[(this.f44P * i7) + 1];
            this.f55a[((i7 + 1) * this.f44P) + 2] = this.f55a[(this.f44P * i7) + 2];
            this.f55a[((i7 + 1) * this.f44P) + 3] = this.f55a[(this.f44P * i7) + 3];
            this.f55a[((i7 + 1) * this.f44P) + 4] = this.f55a[(this.f44P * i7) + 4];
        }
        m59b(i, i2, i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: a */
    private void m29a(byte[] bArr) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            this.f29A = dataInputStream.readInt();
            this.f178y = dataInputStream.readInt();
            this.f118bJ = dataInputStream.readInt();
            this.f172s = dataInputStream.readInt();
            boolean z = dataInputStream.readBoolean();
            if (z) {
                if (!this.f128bT.f237al) {
                    this.f100as = 1;
                    this.f128bT.f237al = z;
                }
            } else if (this.f128bT.f237al && this.f100as != 0) {
                this.f100as = 0;
                this.f128bT.f237al = z;
            }
            this.f58aC = dataInputStream.readBoolean();
            if (this.f58aC) {
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m30a(int i, byte b) {
        if (b != -1) {
            this.f147br.m5a(new byte[]{b, (byte) i}, 2);
        }
        if ((this.f147br.f10e & 512) == 0) {
            m42p(33);
            return false;
        }
        byte[] bArrM10c = this.f147br.m10c();
        if (bArrM10c == null) {
            return false;
        }
        switch (bArrM10c[1]) {
            case 26:
                return i == 26 && bArrM10c[0] == 1;
            case 34:
                if (i != 34) {
                    return false;
                }
                if (this.f117bI) {
                    this.f119bK[407] = bArrM10c[0];
                } else {
                    this.f119bK[406] = bArrM10c[0];
                }
                return true;
            case 35:
                if (i != 35) {
                    return false;
                }
                if (this.f117bI) {
                    this.f119bK[389] = bArrM10c[0];
                } else {
                    this.f119bK[388] = bArrM10c[0];
                }
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m31b() {
        if (this.f106ay != 1) {
            if (this.f106ay == 0 && this.f77aV == 1) {
                m36j();
                return;
            }
            return;
        }
        this.f35G++;
        if (this.f119bK[390] > this.f119bK[391]) {
            this.f140bk = (this.f140bk + (this.f119bK[390] * 3)) / 4;
        } else {
            this.f140bk = (this.f140bk + (this.f119bK[391] * 3)) / 4;
        }
        if (this.f140bk < 3) {
            this.f140bk = 3;
        }
        this.f119bK[458] = this.f119bK[390];
        int[] iArr = this.f119bK;
        iArr[443] = iArr[443] + this.f119bK[390];
        int i = this.f159f[((this.f35G % 7) * 8) + 1 + 455];
        this.f119bK[i + 458] = this.f119bK[391];
        int[] iArr2 = this.f119bK;
        int i2 = (i * 2) + 1 + 442;
        iArr2[i2] = iArr2[i2] + this.f119bK[391];
        for (int i3 = 1; i3 < 8; i3++) {
            if (i3 != i) {
                this.f119bK[i3 + 458] = (this.f36H.nextInt() & Integer.MAX_VALUE) % this.f140bk;
                int[] iArr3 = this.f119bK;
                int i4 = i3 + i3 + 1 + 442;
                iArr3[i4] = iArr3[i4] + this.f119bK[i3 + 458];
            }
        }
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = this.f159f[((this.f35G % 7) * 8) + i5 + i5 + 0 + 455];
            int i7 = this.f159f[((this.f35G % 7) * 8) + i5 + i5 + 1 + 455];
            int i8 = this.f119bK[i6 + 458];
            int i9 = this.f119bK[i7 + 458];
            int[] iArr4 = this.f57aB;
            int i10 = i6 * 1;
            iArr4[i10] = iArr4[i10] + i9;
            int[] iArr5 = this.f57aB;
            int i11 = i7 * 1;
            iArr5[i11] = iArr5[i11] + i8;
            if (i8 > i9) {
                int[] iArr6 = this.f119bK;
                int i12 = i6 + i6 + 0 + 442;
                iArr6[i12] = iArr6[i12] + 3;
                int[] iArr7 = this.f119bK;
                int i13 = i7 + i7 + 0 + 442;
                iArr7[i13] = iArr7[i13] + 0;
            } else if (i8 < i9) {
                int[] iArr8 = this.f119bK;
                int i14 = i6 + i6 + 0 + 442;
                iArr8[i14] = iArr8[i14] + 0;
                int[] iArr9 = this.f119bK;
                int i15 = i7 + i7 + 0 + 442;
                iArr9[i15] = iArr9[i15] + 3;
            } else {
                int[] iArr10 = this.f119bK;
                int i16 = i6 + i6 + 0 + 442;
                iArr10[i16] = iArr10[i16] + 1;
                int[] iArr11 = this.f119bK;
                int i17 = i7 + i7 + 0 + 442;
                iArr11[i17] = iArr11[i17] + 1;
            }
        }
        for (int i18 = 0; i18 < 8; i18++) {
            this.f119bK[i18 + 466] = i18;
        }
        for (int i19 = 0; i19 < 8; i19++) {
            int i20 = -999999;
            int i21 = 0;
            int i22 = -1;
            for (int i23 = 0; i23 < 8; i23++) {
                if (this.f119bK[i23 + 466] > -1) {
                    if (this.f119bK[i23 + i23 + 0 + 442] > i22) {
                        i22 = this.f119bK[i23 + i23 + 0 + 442];
                        i20 = this.f119bK[((i23 + i23) + 1) + 442] - this.f57aB[i23 * 1];
                        i21 = i23;
                    } else if (this.f119bK[i23 + i23 + 0 + 442] == i22 && this.f119bK[((i23 + i23) + 1) + 442] - this.f57aB[i23 * 1] > i20) {
                        i20 = this.f119bK[((i23 + i23) + 1) + 442] - this.f57aB[i23 * 1];
                        i21 = i23;
                    }
                }
            }
            this.f119bK[i21 + 466] = -1;
            this.f119bK[i19 + 474] = i21;
        }
        this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -2));
        this.f112bD.setPriority(5);
        this.f112bD.start();
    }

    /* JADX INFO: renamed from: b */
    private void m32b(byte[] bArr) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            if (1 == dataInputStream.readShort()) {
                this.f160g = dataInputStream.readInt();
                this.f43O = dataInputStream.readShort();
                boolean z = dataInputStream.readBoolean();
                if (z) {
                    if (!this.f128bT.f237al) {
                        this.f100as = 1;
                        this.f128bT.f237al = z;
                    }
                } else if (this.f128bT.f237al && this.f100as != 0) {
                    this.f100as = 0;
                    this.f128bT.f237al = z;
                }
                this.f124bP = dataInputStream.readShort();
                this.f119bK[23] = dataInputStream.readShort();
                this.f119bK[55] = dataInputStream.readShort();
                this.f121bM = dataInputStream.readShort();
                this.f68aM = dataInputStream.readShort();
                this.f119bK[384] = dataInputStream.readShort();
                this.f119bK[385] = dataInputStream.readShort();
                this.f98aq[1] = dataInputStream.readShort();
                this.f95an[1] = dataInputStream.readShort();
                this.f170q = dataInputStream.readInt();
                this.f64aI = dataInputStream.readShort();
                this.f177x = dataInputStream.readShort();
                this.f148bs = dataInputStream.readShort();
                this.f76aU = dataInputStream.readShort();
                this.f32D = dataInputStream.readShort();
                this.f153bx = dataInputStream.readBoolean();
                this.f58aC = this.f153bx;
                if (this.f58aC) {
                }
                this.f119bK[390] = dataInputStream.readShort();
                this.f119bK[391] = dataInputStream.readShort();
                this.f132bc = dataInputStream.readInt();
                for (int i = 0; i < 22; i++) {
                    this.f119bK[i + 0] = dataInputStream.readShort();
                    this.f119bK[i + 32] = dataInputStream.readShort();
                    this.f119bK[i + 192] = dataInputStream.readShort();
                    this.f119bK[i + 224] = dataInputStream.readShort();
                    this.f119bK[i + 256] = dataInputStream.readShort();
                    this.f119bK[i + 288] = dataInputStream.readShort();
                }
                this.f67aL = dataInputStream.readInt();
                this.f146bq = dataInputStream.readInt();
                this.f173t = dataInputStream.readInt();
                this.f71aP = dataInputStream.readInt();
                if (this.f67aL != -1) {
                    m69e(this.f67aL);
                }
                if (this.f146bq > 0) {
                    this.f128bT.m144d(this.f146bq);
                }
                this.f119bK[22] = this.f119bK[this.f119bK[385] + 11 + 0];
                this.f119bK[54] = this.f119bK[this.f119bK[385] + 11 + 32];
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: c */
    private int m33c(int i, int i2, int i3, int i4) {
        if (!this.f128bT.f206a) {
            return -1;
        }
        this.f128bT.f206a = false;
        switch (this.f128bT.f231af) {
            case -7:
                if (i4 != -1) {
                    return i4;
                }
                return -1;
            case -6:
                return i3 == -1 ? this.f142bm - i : i3;
            case -5:
            case 53:
                return i3 == -1 ? this.f142bm - i : i3;
            case -2:
            case 56:
                if (this.f142bm >= i2) {
                    return -1;
                }
                this.f142bm++;
                return -1;
            case -1:
            case 50:
                if (this.f142bm <= i || this.f142bm <= 0) {
                    return -1;
                }
                this.f142bm--;
                return -1;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m34d(int i, int i2, int i3) {
        int[] iArr = this.f55a;
        int i4 = this.f30B * this.f44P;
        iArr[i4] = iArr[i4] + i;
        int[] iArr2 = this.f55a;
        int i5 = (this.f30B * this.f44P) + 1;
        iArr2[i5] = iArr2[i5] + i2;
        int[] iArr3 = this.f55a;
        int i6 = (this.f30B * this.f44P) + 2;
        iArr3[i6] = iArr3[i6] + i3;
    }

    /* JADX INFO: renamed from: h */
    private void m35h() {
        this.f119bK[406] = (this.f36H.nextInt() & Integer.MAX_VALUE) % 34;
        this.f119bK[400] = 0;
        this.f119bK[388] = 0;
        this.f119bK[407] = (this.f36H.nextInt() & Integer.MAX_VALUE) % 33;
        this.f119bK[401] = 1;
        this.f119bK[389] = (this.f36H.nextInt() & Integer.MAX_VALUE) % 3;
        if (this.f119bK[407] >= this.f119bK[406]) {
            int[] iArr = this.f119bK;
            iArr[407] = iArr[407] + 1;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m36j() {
        this.f77aV = 0;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("single", true);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() != 0) {
                recordStoreOpenRecordStore.deleteRecord(recordEnumerationEnumerateRecords.nextRecordId());
            }
            recordEnumerationEnumerateRecords.destroy();
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: k */
    private void m37k() {
        this.f113bE = 0;
        this.f77aV = 0;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("league", true);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() != 0) {
                this.f113bE = 1;
            }
            recordEnumerationEnumerateRecords.destroy();
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
        }
        try {
            RecordStore recordStoreOpenRecordStore2 = RecordStore.openRecordStore("single", true);
            RecordEnumeration recordEnumerationEnumerateRecords2 = recordStoreOpenRecordStore2.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords2.numRecords() != 0) {
                this.f77aV = 1;
            }
            recordEnumerationEnumerateRecords2.destroy();
            recordStoreOpenRecordStore2.closeRecordStore();
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: l */
    private void m38l(int i) {
        this.f142bm = m25a(this.f151bv);
        if (this.f142bm == -1) {
            this.f142bm = i;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m39m() {
        this.f44P = 5;
        this.f30B = 5;
        this.f55a = new int[(this.f30B * this.f44P) + 3];
        m41p();
    }

    /* JADX INFO: renamed from: o */
    private void m40o() {
        this.f113bE = 0;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("league", true);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() != 0) {
                recordStoreOpenRecordStore.deleteRecord(recordEnumerationEnumerateRecords.nextRecordId());
            }
            recordEnumerationEnumerateRecords.destroy();
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: p */
    private void m41p() {
        m59b(0, 99, 0, 0, 999, 0);
        m59b(1, 99, 0, 0, 999, 0);
        m59b(2, 99, 0, 0, 999, 0);
        m59b(3, 99, 0, 0, 999, 0);
        m59b(4, 99, 0, 0, 999, 0);
        m34d(0, 0, 0);
    }

    /* JADX INFO: renamed from: p */
    private void m42p(int i) {
        int i2;
        int i3;
        this.f128bT.f252b = 0;
        this.f86ae = this.f151bv;
        m27a(this.f86ae, this.f142bm);
        this.f151bv = i;
        switch (i) {
            case 0:
                if (this.f33E == 3) {
                    this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -5));
                } else {
                    this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -1));
                }
                this.f112bD.setPriority(5);
                this.f112bD.start();
                break;
            case 1:
                m46v();
                if (this.f33E == 0) {
                    this.f58aC = false;
                    m94w();
                }
                this.f128bT.m138c();
                this.f128bT.m157k();
                this.f33E = 1;
                break;
            case 2:
                if (this.f120bL == -1) {
                    this.f120bL = this.f128bT.m146e(1);
                    this.f40L = this.f128bT.m146e(0);
                    this.f128bT.m163r();
                    this.f128bT.m155i(0);
                }
                this.f128bT.f198S = -48;
                this.f128bT.f202W = 48;
                this.f143bn = System.currentTimeMillis() + 3000;
                this.f128bT.f231af = 0;
                break;
            case 3:
                if (this.f120bL == -1) {
                    this.f120bL = this.f128bT.m146e(1);
                    this.f40L = this.f128bT.m146e(0);
                    this.f128bT.m163r();
                }
                this.f33E = 0;
                this.f128bT.m139c(0);
                this.f128bT.m155i(0);
                if ((this.f77aV | this.f113bE) > 0) {
                    this.f128bT.m136b((short) 139);
                }
                this.f128bT.m136b((short) 146);
                this.f128bT.m136b((short) 152);
                this.f128bT.m136b((short) 144);
                this.f128bT.m136b((short) 142);
                this.f128bT.m129a((short) 151, (short) 141);
                m38l(0);
                break;
            case 4:
                this.f128bT.m139c(0);
                this.f128bT.m155i(0);
                this.f128bT.m136b((short) 79);
                this.f128bT.m136b((short) 0);
                this.f128bT.m136b((short) 33);
                this.f128bT.m136b((short) 49);
                this.f128bT.m129a((short) 151, (short) 137);
                this.f117bI = true;
                this.f78aW = false;
                this.f114bF = false;
                this.f33E = 0;
                this.f100as = 0;
                m38l(1);
                break;
            case 5:
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 153);
                this.f128bT.m136b(m64d(this.f31C));
                this.f128bT.m136b(m90o(this.f162i));
                this.f128bT.m136b(m82i(this.f165l));
                this.f128bT.m136b(m79h(this.f154by));
                this.f128bT.m136b(m57b(this.f91aj));
                this.f80aY = new String[1];
                this.f80aY[0] = new StringBuffer().append("").append((int) m76g(this.f133bd)).toString();
                this.f128bT.m131a((short) 20, this.f80aY);
                this.f128bT.m129a((short) 151, (short) 137);
                m38l(1);
                break;
            case 6:
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 145);
                this.f128bT.m129a((short) -1, (short) 137);
                this.f128bT.m145d((short) 25);
                m38l(0);
                break;
            case 8:
                this.f82aa = this.f53Y[this.f133bd];
                this.f106ay = 0;
                this.f114bF = false;
                this.f119bK[388] = 0;
                break;
            case 9:
                this.f112bD = null;
                if (this.f120bL == -1) {
                    this.f120bL = this.f128bT.m146e(1);
                    this.f40L = this.f128bT.m146e(0);
                    this.f128bT.m163r();
                    this.f128bT.m155i(0);
                }
                break;
            case 10:
                this.f128bT.m139c(0);
                this.f128bT.m155i(1);
                this.f128bT.m136b((short) 0);
                this.f128bT.m136b((short) 139);
                this.f128bT.m136b((short) 67);
                this.f128bT.m136b((short) 59);
                this.f128bT.m136b(m61c(this.f119bK[406]));
                this.f128bT.m136b(m61c(this.f119bK[407]));
                if (this.f114bF) {
                    this.f128bT.m136b((short) 58);
                    this.f128bT.m136b((short) 66);
                } else {
                    this.f128bT.m136b((short) 66);
                    this.f128bT.m136b((short) 58);
                }
                this.f128bT.m129a((short) 151, (short) 137);
                m38l(1);
                this.f82aa = this.f53Y[this.f133bd];
                this.f114bF = false;
                this.f106ay = 0;
                m36j();
                break;
            case 11:
                if (this.f142bm < 1) {
                    this.f142bm = 1;
                }
                this.f47S = -1;
                this.f128bT.m139c(0);
                this.f128bT.m155i(1);
                this.f128bT.m136b((short) 90);
                if (this.f78aW) {
                    this.f147br.f24t = 5;
                    int i4 = 0;
                    for (int i5 = 0; i5 < 34; i5++) {
                        this.f128bT.m136b(m61c(i5));
                        i4++;
                        if (this.f119bK[this.f150bu + 0 + 406] == this.f104aw) {
                            this.f142bm = i4;
                        }
                    }
                } else {
                    int i6 = 0;
                    for (int i7 = 0; i7 < 34; i7++) {
                        if (this.f119bK[(1 - this.f150bu) + 406] != i7) {
                            this.f128bT.m136b(m61c(i7));
                            i6++;
                            if (this.f119bK[this.f150bu + 0 + 406] == i7) {
                                this.f142bm = i6;
                            }
                        }
                    }
                }
                this.f128bT.m129a((short) 148, (short) 138);
                this.f128bT.m126a(m71f(this.f142bm - 1), true);
                break;
            case 12:
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 88);
                this.f128bT.m136b((short) 86);
                this.f128bT.m136b((short) 85);
                this.f128bT.m136b((short) 87);
                this.f128bT.m129a((short) 140, (short) 137);
                m38l(1);
                break;
            case 13:
                this.f128bT.m139c(0);
                this.f128bT.m155i(1);
                this.f128bT.m136b((short) 52);
                this.f128bT.m136b((short) 80);
                this.f128bT.m136b((short) 44);
                this.f128bT.m136b(m61c(this.f119bK[406]));
                this.f128bT.m129a((short) 151, (short) 137);
                m38l(1);
                break;
            case 14:
                this.f128bT.m139c(0);
                this.f128bT.m155i(1);
                this.f128bT.m136b((short) 33);
                this.f128bT.m136b((short) 45);
                this.f128bT.m136b((short) 52);
                this.f128bT.m136b(m61c(this.f119bK[406]));
                this.f128bT.m129a((short) 151, (short) 137);
                m38l(1);
                break;
            case 15:
                this.f119bK[407] = this.f119bK[this.f159f[(((this.f35G + 1) % 7) * 8) + 1 + 455] + 408];
                this.f128bT.m139c(0);
                this.f80aY = new String[2];
                this.f80aY[0] = new StringBuffer().append("").append(this.f35G + 2).toString();
                this.f80aY[1] = "7";
                this.f128bT.m131a((short) 41, this.f80aY);
                this.f128bT.m136b(m61c(this.f119bK[406]));
                this.f128bT.m136b(m61c(this.f119bK[407]));
                if (this.f114bF) {
                    this.f128bT.m136b((short) 58);
                    this.f128bT.m136b((short) 66);
                } else {
                    this.f128bT.m136b((short) 66);
                    this.f128bT.m136b((short) 58);
                }
                this.f128bT.m129a((short) 139, (short) 137);
                m38l(1);
                break;
            case 16:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 33);
                this.f128bT.m145d((short) 42);
                this.f128bT.m129a((short) 154, (short) 147);
                m38l(0);
                break;
            case 17:
                this.f128bT.m140c(1, 0);
                this.f80aY = new String[1];
                this.f80aY[0] = new StringBuffer().append("").append(this.f35G + 1).toString();
                this.f128bT.m131a((short) 16, this.f80aY);
                this.f128bT.m129a((short) 139, (short) 70);
                m38l(1);
                this.f80aY = new String[4];
                for (int i8 = 0; i8 < 4; i8++) {
                    if (this.f114bF) {
                        i2 = this.f159f[((this.f35G % 7) * 8) + i8 + i8 + 1 + 455];
                        i3 = this.f159f[((this.f35G % 7) * 8) + i8 + i8 + 0 + 455];
                    } else {
                        i2 = this.f159f[((this.f35G % 7) * 8) + i8 + i8 + 0 + 455];
                        i3 = this.f159f[((this.f35G % 7) * 8) + i8 + i8 + 1 + 455];
                    }
                    int i9 = this.f119bK[i2 + 458];
                    int i10 = this.f119bK[i3 + 458];
                    int i11 = this.f119bK[i2 + 408];
                    int i12 = this.f119bK[i3 + 408];
                    this.f80aY[0] = this.f128bT.m137c(m61c(i11));
                    this.f80aY[1] = new StringBuffer().append("").append(i9).toString();
                    this.f80aY[2] = new StringBuffer().append("").append(i10).toString();
                    this.f80aY[3] = this.f128bT.m137c(m61c(i12));
                    this.f128bT.m131a((short) 65, this.f80aY);
                }
                break;
            case 18:
            case 19:
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 43);
                this.f80aY = new String[3];
                for (int i13 = 0; i13 < 8; i13++) {
                    int i14 = this.f119bK[(((this.f151bv - 18) * 8) / 2) + i13 + 474];
                    int i15 = this.f119bK[i14 + 408];
                    int i16 = this.f119bK[i14 + i14 + 0 + 442];
                    int i17 = this.f119bK[i14 + i14 + 1 + 442];
                    if (i15 == this.f119bK[406]) {
                        this.f139bj = (i13 * 3) + 7;
                    }
                }
                this.f128bT.m129a((short) 139, (short) 70);
                m38l(0);
                break;
            case 20:
                this.f128bT.m139c(1);
                this.f128bT.m155i(2);
                this.f128bT.m136b((short) 40);
                switch (this.f139bj + 1) {
                    case 1:
                        this.f128bT.m145d((short) 36);
                        this.f128bT.m150f(0);
                        break;
                    case 2:
                        this.f128bT.m145d((short) 37);
                        this.f128bT.m150f(1);
                        break;
                    case 3:
                        this.f128bT.m145d((short) 38);
                        this.f128bT.m150f(2);
                        break;
                    default:
                        this.f128bT.m145d((short) 39);
                        this.f128bT.m150f(3);
                        break;
                }
                this.f128bT.m129a((short) 139, (short) -1);
                m38l(0);
                break;
            case 22:
                m40o();
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 35);
                this.f128bT.m136b((short) 34);
                this.f128bT.m129a((short) 139, (short) -1);
                m38l(-1);
                break;
            case 23:
            case 37:
                int i18 = this.f119bK[406];
                int i19 = this.f119bK[407];
                int i20 = this.f119bK[390];
                int i21 = this.f119bK[391];
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 69);
                this.f128bT.m136b(m61c(i18));
                this.f128bT.m136b(m61c(i19));
                if (this.f114bF) {
                    this.f128bT.m136b((short) 58);
                    this.f128bT.m136b((short) 66);
                } else {
                    this.f128bT.m136b((short) 66);
                    this.f128bT.m136b((short) 58);
                }
                this.f80aY = new String[2];
                this.f80aY[0] = new StringBuffer().append("").append(i20).toString();
                this.f80aY[1] = new StringBuffer().append("").append(i21).toString();
                this.f128bT.m131a((short) 78, this.f80aY);
                if (this.f106ay == 1) {
                    this.f128bT.m129a((short) 139, (short) 70);
                } else {
                    this.f128bT.m129a((short) -1, (short) 70);
                }
                this.f142bm = 1;
                break;
            case 24:
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 9);
                if (this.f77aV == 1) {
                    this.f128bT.m136b((short) 0);
                }
                if (this.f113bE == 1) {
                    this.f128bT.m136b((short) 33);
                }
                this.f128bT.m129a((short) 151, (short) 137);
                m38l(1);
                break;
            case 25:
                this.f128bT.m139c(0);
                this.f128bT.m155i(0);
                this.f128bT.m136b((short) 143);
                this.f128bT.m136b((short) 33);
                this.f128bT.m136b((short) 49);
                this.f128bT.m129a((short) 151, (short) 137);
                m38l(1);
                break;
            case 26:
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 19);
                this.f128bT.m136b(m61c(this.f119bK[406]));
                this.f128bT.m136b(m61c(this.f119bK[407]));
                if (this.f114bF) {
                    this.f128bT.m136b((short) 58);
                    this.f128bT.m136b((short) 66);
                } else {
                    this.f128bT.m136b((short) 66);
                    this.f128bT.m136b((short) 58);
                }
                if (this.f78aW) {
                    this.f128bT.m129a((short) 64, (short) 70);
                } else {
                    this.f128bT.m129a((short) 64, (short) 137);
                }
                m38l(1);
                break;
            case 27:
            case 28:
                this.f47S = -1;
                this.f128bT.m139c(0);
                this.f128bT.m155i(1);
                if (this.f150bu == 0) {
                    this.f128bT.m136b((short) 68);
                } else {
                    this.f128bT.m136b((short) 60);
                }
                int i22 = 0;
                for (int i23 = 0; i23 < 34; i23++) {
                    if (this.f119bK[(1 - this.f150bu) + 406] != i23) {
                        this.f128bT.m136b(m61c(i23));
                        i22++;
                        if (this.f119bK[this.f150bu + 0 + 406] == i23) {
                            this.f142bm = i22;
                        }
                    }
                }
                this.f128bT.m129a((short) 148, (short) 138);
                this.f128bT.m126a(m71f(this.f142bm - 1), true);
                break;
            case 29:
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 49);
                this.f128bT.m136b((short) 11);
                this.f128bT.m136b((short) 31);
                this.f128bT.m129a((short) 151, (short) 137);
                m38l(1);
                this.f128bT.f237al = false;
                this.f117bI = true;
                this.f78aW = false;
                this.f114bF = false;
                this.f100as = 0;
                this.f33E = 0;
                if (this.f147br == null) {
                    if (this.f92ak == 0 || this.f92ak == 2) {
                        this.f147br = new RunnableC0002c();
                        if (this.f147br.f17l == null) {
                            for (int i24 = 30; i24 > 0 && this.f147br.f17l == null; i24--) {
                                this.f147br = null;
                                this.f147br = new RunnableC0002c();
                            }
                            if (this.f147br.f17l == null) {
                                m42p(46);
                                this.f147br = null;
                                this.f92ak = 3;
                            }
                        }
                    } else {
                        m42p(46);
                    }
                }
                break;
            case 30:
                this.f147br.m8b();
                this.f147br.m11d();
                this.f125bQ = true;
                this.f78aW = true;
                this.f117bI = false;
                this.f33E = 0;
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m136b((short) 136);
                this.f128bT.m129a((short) -1, (short) 70);
                m38l(-1);
                break;
            case 31:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m129a((short) -1, (short) 137);
                this.f128bT.m145d((short) 135);
                m38l(0);
                this.f78aW = true;
                this.f117bI = true;
                this.f33E = 0;
                if (!this.f147br.m4a(true, (ServiceRecord) null)) {
                    m42p(33);
                }
                break;
            case 32:
                this.f142bm = 1;
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 76);
                this.f128bT.m129a((short) 32, (short) 137);
                m38l(this.f142bm);
                int iM12e = this.f147br.m12e();
                if (iM12e > 0) {
                    for (int i25 = 0; i25 < iM12e; i25++) {
                        this.f128bT.m127a(this.f147br.m9c(i25));
                    }
                    this.f128bT.m129a((short) 32, (short) 137);
                    this.f93al = true;
                } else {
                    this.f128bT.m136b((short) 53);
                    this.f128bT.m129a((short) 72, (short) 137);
                    this.f93al = false;
                }
                break;
            case 33:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m136b((short) 8);
                this.f128bT.m129a((short) -1, (short) 139);
                m38l(-1);
                this.f78aW = false;
                if (this.f147br != null) {
                    this.f147br.m8b();
                }
                break;
            case 34:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m129a((short) -1, (short) 70);
                this.f128bT.m145d((short) 89);
                m38l(0);
                break;
            case 35:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m129a((short) -1, (short) 70);
                this.f128bT.m145d((short) 91);
                m38l(0);
                m30a(35, (byte) (this.f142bm % 3));
                break;
            case 36:
                this.f128bT.m139c(0);
                this.f128bT.m136b((short) 50);
                if (!this.f117bI) {
                    this.f114bF = true;
                }
                this.f128bT.m136b(m61c(this.f119bK[406]));
                this.f128bT.m136b(m61c(this.f119bK[407]));
                if (this.f114bF) {
                    this.f128bT.m136b((short) 58);
                    this.f128bT.m136b((short) 66);
                } else {
                    this.f128bT.m136b((short) 66);
                    this.f128bT.m136b((short) 58);
                }
                this.f128bT.m129a((short) 140, (short) 70);
                m38l(1);
                System.out.println(new StringBuffer().append("TEAM 0 ").append(this.f119bK[406]).toString());
                System.out.println(new StringBuffer().append("TEAM 1 ").append(this.f119bK[407]).toString());
                break;
            case 38:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m136b((short) 73);
                this.f128bT.m129a((short) 154, (short) 147);
                m38l(0);
                break;
            case 39:
                if (this.f38J != -1) {
                    this.f142bm = this.f38J + 1;
                    this.f38J = -1;
                }
                m23D();
                break;
            case 41:
                this.f128bT.m139c(1);
                this.f128bT.m155i(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m136b((short) 81);
                this.f128bT.m127a(" ");
                this.f80aY = new String[1];
                this.f80aY[0] = new StringBuffer().append("").append(this.f55a[this.f30B * this.f44P]).toString();
                this.f128bT.m131a((short) 84, this.f80aY);
                this.f80aY[0] = new StringBuffer().append("").append(this.f55a[(this.f30B * this.f44P) + 2]).toString();
                this.f128bT.m131a((short) 83, this.f80aY);
                this.f80aY[0] = new StringBuffer().append("").append(this.f55a[(this.f30B * this.f44P) + 1]).toString();
                this.f128bT.m131a((short) 82, this.f80aY);
                this.f128bT.m129a((short) -1, (short) 137);
                m38l(0);
                break;
            case 42:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m129a((short) -1, (short) 70);
                this.f128bT.m145d((short) 135);
                m38l(0);
                break;
            case 43:
                this.f128bT.m139c(1);
                this.f128bT.m155i(0);
                this.f128bT.m136b((short) 40);
                this.f128bT.m129a((short) 139, (short) -1);
                this.f128bT.m145d((short) 51);
                m38l(0);
                break;
            case 45:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 79);
                this.f128bT.m145d((short) 77);
                this.f128bT.m129a((short) 154, (short) 147);
                m38l(0);
                break;
            case 46:
                this.f128bT.m139c(1);
                this.f128bT.m136b((short) 49);
                this.f128bT.m145d((short) 1);
                this.f128bT.m129a((short) -1, (short) 139);
                m38l(0);
                this.f78aW = false;
                if (this.f147br != null) {
                    this.f147br.m8b();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m43q() {
        this.f128bT.m139c(0);
        this.f128bT.m136b((short) 153);
        this.f128bT.m136b(m64d(this.f31C));
        this.f128bT.m136b(m90o(this.f162i));
        this.f128bT.m136b(m79h(this.f154by));
        this.f128bT.m136b(m57b(this.f91aj));
        this.f128bT.m129a((short) 151, (short) 137);
        this.f142bm = 1;
    }

    /* JADX INFO: renamed from: t */
    private byte[] m44t() {
        try {
            this.f107az.reset();
            DataOutputStream dataOutputStream = new DataOutputStream(this.f107az);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeInt(this.f160g);
            dataOutputStream.writeShort(this.f43O);
            if (this.f100as == 0) {
                dataOutputStream.writeBoolean(this.f128bT.f237al);
            } else {
                dataOutputStream.writeBoolean(false);
            }
            dataOutputStream.writeShort(this.f124bP);
            dataOutputStream.writeShort(this.f119bK[23]);
            dataOutputStream.writeShort(this.f119bK[55]);
            dataOutputStream.writeShort(this.f121bM);
            dataOutputStream.writeShort(this.f68aM);
            dataOutputStream.writeShort(this.f119bK[384]);
            dataOutputStream.writeShort(this.f119bK[385]);
            dataOutputStream.writeShort(this.f98aq[1]);
            dataOutputStream.writeShort(this.f95an[1]);
            dataOutputStream.writeInt(this.f170q);
            dataOutputStream.writeShort(this.f64aI);
            dataOutputStream.writeShort(this.f177x);
            dataOutputStream.writeShort(this.f148bs);
            dataOutputStream.writeShort(this.f76aU);
            dataOutputStream.writeShort(this.f32D);
            dataOutputStream.writeBoolean(this.f153bx);
            dataOutputStream.writeShort(this.f119bK[390]);
            dataOutputStream.writeShort(this.f119bK[391]);
            dataOutputStream.writeInt(this.f132bc);
            for (int i = 0; i < 22; i++) {
                dataOutputStream.writeShort(this.f119bK[i + 0]);
                dataOutputStream.writeShort(this.f119bK[i + 32]);
                dataOutputStream.writeShort(this.f119bK[i + 192]);
                dataOutputStream.writeShort(this.f119bK[i + 224]);
                dataOutputStream.writeShort(this.f119bK[i + 256]);
                dataOutputStream.writeShort(this.f119bK[i + 288]);
            }
            dataOutputStream.writeInt(this.f67aL);
            dataOutputStream.writeInt(this.f146bq);
            dataOutputStream.writeInt(this.f173t);
            dataOutputStream.writeInt(this.f71aP);
            this.f67aL = -1;
            this.f146bq = 0;
        } catch (Exception e) {
        }
        return this.f107az.toByteArray();
    }

    /* JADX INFO: renamed from: u */
    private byte[] m45u() {
        try {
            this.f107az.reset();
            DataOutputStream dataOutputStream = new DataOutputStream(this.f107az);
            dataOutputStream.writeInt(this.f61aF);
            dataOutputStream.writeInt(this.f111bC);
            dataOutputStream.writeInt(this.f154by);
            dataOutputStream.writeInt(this.f91aj);
            if (this.f100as == 0) {
                dataOutputStream.writeBoolean(this.f128bT.f237al);
            } else {
                dataOutputStream.writeBoolean(false);
            }
            dataOutputStream.writeBoolean(this.f153bx);
        } catch (Exception e) {
        }
        return this.f107az.toByteArray();
    }

    /* JADX INFO: renamed from: v */
    private void m46v() {
        this.f128bT.m139c(1);
        this.f128bT.m136b((short) 62);
        this.f128bT.m130a((short) 149, (short) 140, (short) 137);
        this.f142bm = 0;
    }

    /* JADX INFO: renamed from: x */
    private int m47x() {
        int i = 0;
        if (!this.f128bT.f250ay && !this.f128bT.f206a) {
            return 0;
        }
        this.f128bT.f206a = false;
        if (this.f128bT.f231af == -3 || this.f128bT.f231af == 52 || this.f128bT.f231af == 49 || this.f128bT.f231af == 55) {
            i = 1;
        } else if (this.f128bT.f231af == -4 || this.f128bT.f231af == 54 || this.f128bT.f231af == 51 || this.f128bT.f231af == 57) {
            i = 2;
        }
        if (this.f128bT.f231af == -1 || this.f128bT.f231af == 50 || this.f128bT.f231af == 49 || this.f128bT.f231af == 51) {
            i |= 32;
        } else if (this.f128bT.f231af == -2 || this.f128bT.f231af == 56 || this.f128bT.f231af == 55 || this.f128bT.f231af == 57) {
            i |= 64;
        }
        if (this.f128bT.f231af == -5 || this.f128bT.f231af == 53) {
            i |= this.f151bv == 1 ? 8 : 4;
        }
        if (this.f128bT.f231af == -7 || this.f128bT.f231af == 35) {
            i |= 4;
        }
        if (this.f128bT.f231af == -6 || this.f128bT.f231af == 42) {
            return i | (this.f151bv == 1 ? 16 : 4);
        }
        return i;
    }

    /* JADX INFO: renamed from: A */
    public void m48A() {
        m54a(22, 0, 0, 0, 0, 0, -1);
        m54a(24, 133, 177, 4, 0, 0, -1);
        m54a(23, 133, 177, 1, 0, 0, -1);
        this.f119bK[215] = -1;
        this.f119bK[119] = 0;
        for (int i = 0; i < 22; i++) {
            int i2 = this.f159f[(((this.f119bK[(i / 11) + 388] * 11) + (i % 11)) * 3) + 0 + 2];
            int i3 = this.f159f[(((this.f119bK[(i / 11) + 388] * 11) + (i % 11)) * 3) + 0];
            int i4 = this.f159f[(((this.f119bK[(i / 11) + 388] * 11) + (i % 11)) * 3) + 0 + 1];
            if (i < 11) {
                if (i2 == 0) {
                    m54a(i, i3, i4, 9, 0, 0, i2);
                } else {
                    m54a(i, i3, i4, 45, 0, 0, i2);
                }
            } else if (i2 == 0) {
                m54a(i, i3, i4, 75, 0, 0, i2);
            } else {
                m54a(i, i3, i4, 111, 0, 0, i2);
            }
            this.f135bf[i] = 0;
        }
        m54a(25, 106, 301, 5, 0, 0, -1);
        m54a(26, 120, -100, 6, 0, 0, -1);
        m73f();
        int[] iArr = this.f119bK;
        this.f119bK[391] = 0;
        iArr[390] = 0;
    }

    /* JADX INFO: renamed from: E */
    public void m49E() {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("options", true);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() != 0) {
                recordStoreOpenRecordStore.deleteRecord(recordEnumerationEnumerateRecords.nextRecordId());
            }
            recordEnumerationEnumerateRecords.destroy();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeBoolean(this.f51W);
            dataOutputStream.writeInt(this.f31C);
            dataOutputStream.writeInt(this.f131bb);
            dataOutputStream.writeInt(this.f46R);
            dataOutputStream.writeInt(this.f165l);
            dataOutputStream.writeInt(this.f162i);
            dataOutputStream.writeInt(this.f154by);
            dataOutputStream.writeInt(this.f91aj);
            dataOutputStream.writeInt(this.f133bd);
            for (int i = 0; i < (this.f30B * this.f44P) + 3; i++) {
                dataOutputStream.writeInt(this.f55a[i]);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            recordStoreOpenRecordStore.addRecord(byteArray, 0, byteArray.length);
            byteArrayOutputStream.close();
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: G */
    public void m50G() {
        this.f70aO += (((this.f119bK[23] >> 5) - 120) - this.f70aO) >> 1;
        this.f69aN += (((this.f119bK[55] >> 5) - 160) - this.f69aN) >> 1;
        if (this.f70aO < 0) {
            this.f70aO = 0;
        }
        if (this.f69aN < 0) {
            this.f69aN = 0;
        }
        if (this.f70aO > 24) {
            this.f70aO = 24;
        }
        if (this.f69aN > 32) {
            this.f69aN = 32;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m51a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iM55b;
        int iM72f;
        int i7;
        int iM72f2 = 0;
        if (i4 == 1) {
            i5 = this.f118bJ;
            i6 = this.f172s;
        } else {
            i5 = this.f154by;
            i6 = this.f91aj;
        }
        if ((this.f43O == 2 && this.f173t == i4) || ((this.f43O == 3 && this.f121bM == i4) || ((this.f43O == 4 && this.f68aM == i4) || ((this.f43O == 6 && this.f32D == i4) || (this.f43O == 7 && this.f32D == i4))))) {
            if (this.f119bK[i + 192] == 0) {
                if ((i3 & 1) != 0) {
                    i7 = -1;
                } else {
                    i7 = (i3 & 2) != 0 ? 1 : 0;
                }
                int[] iArr = this.f95an;
                iArr[i4] = (i7 * 2) + iArr[i4];
                int[] iArr2 = this.f95an;
                iArr2[i4] = iArr2[i4] & 127;
                if (this.f43O == 2 || this.f43O == 4) {
                    if (this.f52X == 0) {
                        if (this.f95an[i4] < 36) {
                            this.f95an[i4] = 36;
                        }
                        if (this.f95an[i4] > 92) {
                            this.f95an[i4] = 92;
                        }
                    } else {
                        if (this.f95an[i4] < 64 && this.f95an[i4] > 28) {
                            this.f95an[i4] = 28;
                        }
                        if (this.f95an[i4] > 63 && this.f95an[i4] < 100) {
                            this.f95an[i4] = 100;
                        }
                    }
                }
                if (this.f43O == 3 || this.f43O == 4) {
                    if (this.f72aQ == 0) {
                        if (this.f95an[i4] < 4 || this.f95an[i4] > 95) {
                            this.f95an[i4] = 4;
                        }
                        if (this.f95an[i4] > 60 && this.f95an[i4] < 96) {
                            this.f95an[i4] = 60;
                        }
                    } else {
                        if (this.f95an[i4] > 120 || this.f95an[i4] < 32) {
                            this.f95an[i4] = 120;
                        }
                        if (this.f95an[i4] < 72 && this.f95an[i4] > 32) {
                            this.f95an[i4] = 72;
                        }
                    }
                }
                if (this.f43O == 7) {
                    if (this.f52X == 0) {
                        if (this.f95an[i4] < 112 && this.f95an[i4] >= 64) {
                            this.f95an[i4] = 112;
                        }
                        if (this.f95an[i4] > 16 && this.f95an[i4] < 64) {
                            this.f95an[i4] = 16;
                        }
                    } else {
                        if (this.f95an[i4] < 48) {
                            this.f95an[i4] = 48;
                        }
                        if (this.f95an[i4] > 80) {
                            this.f95an[i4] = 80;
                        }
                    }
                }
            }
            iM72f = ((this.f95an[i4] + 8) & 127) / 16;
        } else if (i5 == 0) {
            if ((i3 & 1) != 0) {
                iM72f2 = -1;
            } else if ((i3 & 2) != 0) {
                iM72f2 = 1;
            }
            iM72f = (i2 + iM72f2) & 7;
            if (iM72f2 != 0) {
                this.f60aE[i4] = 8;
            }
            if (this.f60aE[i4] == 0) {
                if (this.f173t == i4) {
                    iM72f = this.f177x != i4 ? m81i(i, 4256, 10048) : m81i(i, 4256, 1280);
                } else {
                    iM72f = m72f(this.f119bK[i + 0], this.f119bK[i + 32]);
                }
            } else if (this.f60aE[i4] != 0) {
                int[] iArr3 = this.f60aE;
                iArr3[i4] = iArr3[i4] - 1;
            }
            this.f94am = 1;
        } else {
            this.f94am = 1;
            if ((i3 & 1) != 0) {
                if ((i3 & 32) != 0) {
                    iM72f2 = 7;
                } else {
                    iM72f2 = (i3 & 64) != 0 ? 5 : 6;
                }
            } else if ((i3 & 2) != 0) {
                if ((i3 & 32) != 0) {
                    iM72f2 = 1;
                } else {
                    iM72f2 = (i3 & 64) != 0 ? 3 : 2;
                }
            } else if ((i3 & 32) == 0) {
                if ((i3 & 64) != 0) {
                    iM72f2 = 4;
                } else {
                    this.f94am = 0;
                    iM72f2 = i2;
                }
            }
            if (this.f94am > 0) {
                this.f60aE[i4] = 8;
            }
            if (this.f60aE[i4] == 0) {
                if (this.f173t != i4) {
                    iM72f2 = m72f(this.f119bK[i + 0], this.f119bK[i + 32]);
                }
                iM55b = m55b(i2, iM72f2);
            } else {
                if (this.f60aE[i4] != 0) {
                    int[] iArr4 = this.f60aE;
                    iArr4[i4] = iArr4[i4] - 1;
                }
                iM55b = iM72f2;
            }
            iM72f = (i6 != 0 || this.f94am <= 0) ? iM55b : this.f171r[iM55b];
            this.f94am = 1;
        }
        if (this.f43O != 1 || this.f62aG >= 2) {
            return iM72f;
        }
        this.f94am = 1;
        return m55b(i2, m72f(this.f119bK[i + 0], this.f119bK[i + 32]));
    }

    /* JADX WARN: Code duplicated, block: B:498:0x104d  */
    /* JADX WARN: Code duplicated, block: B:500:0x1053  */
    /* JADX INFO: renamed from: a */
    public void m52a() {
        int iM51a;
        int iM51a2;
        int i;
        int i2;
        int iAbs;
        int iM51a3;
        int iSin = 0;
        int i3 = 0;
        if (this.f43O == 2 || this.f43O == 3 || this.f43O == 4 || this.f43O == 6 || this.f43O == 7) {
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= 2) {
                    break;
                }
                if (this.f43O == 6 || this.f43O == 3) {
                    int i6 = this.f43O == 3 ? this.f121bM : this.f32D;
                    int i7 = i5 != i6 ? 1600 : 400;
                    if (this.f43O == 3 && i7 > 400) {
                        i7 = 3600;
                    }
                    for (int i8 = 1; i8 < 11; i8++) {
                        int i9 = (i5 * 11) + i8;
                        this.f119bK[i9 + 192] = 0;
                        if ((i5 != i6 || (i5 == i6 && i8 != this.f119bK[i6 + 384])) && m60c(this.f119bK[i9 + 0], this.f119bK[i9 + 32]) < i7) {
                            this.f119bK[i9 + 224] = (m72f(this.f119bK[i9 + 0], this.f119bK[i9 + 32]) + 4) & 7;
                            this.f119bK[i9 + 192] = 3;
                            m91q(i9);
                        }
                    }
                } else {
                    for (int i10 = 1; i10 < 11; i10++) {
                        this.f119bK[(i5 * 11) + i10 + 192] = 0;
                    }
                }
                i4 = i5 + 1;
            }
        }
        switch (this.f43O) {
            case 0:
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11;
                    if (i12 < 2) {
                        this.f79aX = this.f119bK[i12 + 384];
                        for (int i14 = 0; i14 < 11; i14++) {
                            if (this.f119bK[i12 + 392] != i14) {
                                m80h((i12 * 11) + i14, i14, i12);
                            }
                        }
                        if (this.f41M[i12] == 0) {
                            this.f119bK[i12 + 384] = this.f79aX;
                        }
                        this.f61aF = 0;
                        i11 = i13 + 11;
                        i12++;
                    } else if (this.f43O == 2) {
                        this.f119bK[224] = this.f119bK[32] < 5664 ? 4 : 0;
                    }
                    break;
                }
                break;
            case 1:
                if (this.f75aT > 0) {
                    this.f75aT--;
                } else {
                    this.f119bK[this.f71aP + 384] = 10;
                    this.f61aF = 0;
                    if (this.f62aG != 0) {
                        if (this.f62aG == 2) {
                            if (this.f134be == 0) {
                                m69e(2);
                            }
                            m53a(30, this.f119bK[(((this.f173t * 11) + 11) - 2) + 224], this.f173t);
                        }
                        this.f62aG--;
                    } else {
                        m80h(((this.f71aP * 11) + 11) - 1, 10, this.f71aP);
                    }
                }
                break;
            case 2:
                int i15 = 0;
                this.f119bK[394] = 0;
                this.f119bK[395] = 0;
                int i16 = 0;
                while (true) {
                    int i17 = i15;
                    int i18 = i16;
                    if (i18 < 2) {
                        if (this.f78aW && i18 == 1) {
                            this.f111bC = this.f178y;
                            this.f61aF = this.f29A;
                        }
                        int i19 = 0;
                        while (true) {
                            int i20 = i19;
                            if (i20 < 11) {
                                int i21 = i17 + i20;
                                if (i20 == 0 && i18 == this.f81aZ) {
                                    int i22 = this.f52X == 0 ? this.f119bK[i21 + 96] + 832 : this.f119bK[i21 + 96] - 832;
                                    if (Math.abs(this.f119bK[i21 + 32] - i22) < 224) {
                                        this.f119bK[i21 + 192] = 0;
                                        if (this.f119bK[i18 + 400] == 0) {
                                            this.f60aE[i18] = 4;
                                            this.f119bK[i21 + 224] = m55b(this.f119bK[i21 + 224], m51a(i21, this.f119bK[i21 + 224], this.f111bC, i18));
                                            m74f(i21, this.f119bK[i21 + 224], i18);
                                            if (this.f61aF != 0) {
                                                m58b(this.f61aF, (int) (Math.sin(Math.toRadians(this.f95an[i18] * 2.8125f)) * 32.0d), (int) ((-Math.cos(Math.toRadians(this.f95an[i18] * 2.8125f))) * 32.0d), i18);
                                                this.f43O = 0;
                                                this.f119bK[i18 + 384] = i20 + 1;
                                            } else {
                                                this.f119bK[i18 + 384] = i20;
                                            }
                                        } else {
                                            this.f119bK[i21 + 224] = this.f52X != 0 ? 0 : 4;
                                            if (this.f164k >= 21) {
                                                int iNextInt = (this.f36H.nextInt() & Integer.MAX_VALUE) % 100;
                                                this.f119bK[i21 + 224] = m81i(i21, ((((this.f36H.nextInt() & Integer.MAX_VALUE) % 218) - 109) << 5) + 4256, 5664);
                                                int iNextInt2 = (this.f119bK[i21 + 224] * 16) + (this.f36H.nextInt() % 16);
                                                m58b(((this.f36H.nextInt() & Integer.MAX_VALUE) % 150) + 100, (int) (Math.sin(Math.toRadians(iNextInt2 * 2.8125f)) * 32.0d), (int) ((-Math.cos(Math.toRadians(iNextInt2 * 2.8125f))) * 32.0d), i18);
                                                this.f43O = 0;
                                            }
                                        }
                                        this.f119bK[i21 + 288] = this.f119bK[i21 + 224] * 3;
                                    } else {
                                        m74f(i21, m56b(i21, this.f119bK[i21 + 64], i22), i18);
                                        this.f119bK[i21 + 224] = this.f52X != 0 ? 0 : 4;
                                    }
                                    this.f164k = 0;
                                } else {
                                    int i23 = this.f119bK[i21 + 32];
                                    if (Math.abs(i23 - 5664) > 2496) {
                                        i23 = (i23 + 5664) / 2;
                                    }
                                    if (Math.abs(i23 - this.f119bK[i21 + 32]) < 320) {
                                        this.f164k++;
                                        this.f119bK[i21 + 224] = m72f(this.f119bK[i21 + 0], this.f119bK[i21 + 32]);
                                        this.f119bK[i21 + 288] = this.f119bK[i21 + 224] * 3;
                                        this.f119bK[i21 + 192] = 0;
                                    } else {
                                        this.f119bK[i21 + 224] = m81i(i21, this.f119bK[i21 + 64], i23);
                                        this.f119bK[i21 + 192] = 3;
                                        m91q(i21);
                                    }
                                }
                                i19 = i20 + 1;
                            }
                        }
                        i15 = i17 + 11;
                        i16 = i18 + 1;
                    }
                    break;
                }
                break;
            case 3:
                int i24 = this.f119bK[this.f121bM + 384];
                this.f119bK[402] = this.f119bK[this.f121bM + 384] + 1;
                if (this.f119bK[402] > 9) {
                    this.f119bK[402] = 1;
                }
                this.f119bK[403] = this.f119bK[402] + 1;
                if (this.f119bK[(1 - this.f121bM) + 400] != 0) {
                    this.f119bK[404] = this.f119bK[(1 - this.f121bM) + 384];
                } else {
                    this.f119bK[404] = this.f119bK[(1 - this.f121bM) + 384] + 1;
                    if (this.f119bK[404] > 10) {
                        this.f119bK[404] = 1;
                    }
                }
                this.f119bK[405] = this.f119bK[404] + 1;
                if (this.f119bK[405] > 10) {
                    this.f119bK[405] = 1;
                }
                if (this.f78aW && this.f121bM == 1) {
                    this.f111bC = this.f178y;
                    this.f61aF = this.f29A;
                }
                int i25 = (this.f121bM * 11) + i24;
                int i26 = this.f119bK[i25 + 224];
                if (this.f72aQ == 0) {
                    if (i26 < 1 || i26 > 3) {
                        this.f119bK[i25 + 224] = 2;
                    }
                    iM51a3 = this.f119bK[i25 + 224];
                } else {
                    if (i26 < 5 || i26 > 7) {
                        this.f119bK[i25 + 224] = 6;
                    }
                    iM51a3 = this.f119bK[i25 + 224];
                }
                if (m60c(this.f119bK[i25 + 0], this.f119bK[i25 + 32]) > 24) {
                    this.f119bK[i25 + 224] = m72f(this.f119bK[i25 + 0], this.f119bK[i25 + 32]);
                    this.f119bK[i25 + 192] = 3;
                    m91q(i25);
                } else {
                    if (this.f72aQ != 0) {
                        this.f119bK[i25 + 0] = 7840;
                    } else {
                        this.f119bK[i25 + 0] = 768;
                    }
                    if (this.f119bK[this.f121bM + 400] == 0) {
                        this.f60aE[this.f121bM] = 4;
                        iM51a3 = m51a(i25, this.f119bK[i25 + 224], this.f111bC, this.f121bM);
                    } else {
                        this.f61aF = 0;
                        int i27 = this.f119bK[402] + (this.f121bM * 11);
                        int iM81i = m81i(i25, this.f119bK[i27 + 0], this.f119bK[i27 + 32]);
                        if (iM51a3 != iM81i) {
                            iM51a3 = iM81i;
                        } else if (m67e(i25, this.f119bK[i27 + 0], this.f119bK[i27 + 32]) < 4900) {
                            this.f61aF = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 50) + 100;
                            this.f119bK[this.f121bM + 384] = this.f119bK[402];
                        }
                        if (this.f119bK[(1 - this.f121bM) + 400] == 0) {
                            this.f60aE[this.f121bM] = 4;
                            m78g(this.f119bK[this.f121bM + 384] + (this.f121bM * 11), this.f111bC, this.f61aF);
                        }
                    }
                    if (this.f72aQ == 0) {
                        if ((iM51a3 < 1 || iM51a3 > 3) && this.f119bK[this.f121bM + 400] != 0) {
                            iM51a3 = this.f119bK[i25 + 224];
                        }
                        this.f119bK[i25 + 288] = 24;
                    } else {
                        if ((iM51a3 < 5 || iM51a3 > 7) && this.f119bK[this.f121bM + 400] != 0) {
                            iM51a3 = this.f119bK[i25 + 224];
                        }
                        this.f119bK[i25 + 288] = 24;
                    }
                    this.f116bH = this.f119bK[i25 + 0] + ((this.f159f[(iM51a3 * 2) + 138] * 1) / 8);
                    this.f115bG = this.f119bK[i25 + 32] + ((this.f159f[((iM51a3 * 2) + 1) + 138] * 1) / 8);
                    this.f63aH = 0;
                    this.f119bK[i25 + 224] = iM51a3;
                    if (this.f61aF != 0) {
                        this.f119bK[i25 + 288] = iM51a3 * 3;
                        if (this.f119bK[this.f121bM + 400] == 0) {
                            int iSin2 = (int) (Math.sin(Math.toRadians(this.f95an[this.f121bM] * 2.8125f)) * 32.0d);
                            int i28 = (int) ((-Math.cos(Math.toRadians(this.f95an[this.f121bM] * 2.8125f))) * 32.0d);
                            if (this.f72aQ != 0) {
                                this.f116bH = 7712;
                            }
                            m58b((this.f61aF * 8) / 10, iSin2, i28, this.f121bM);
                        } else {
                            m53a((this.f61aF * 8) / 10, iM51a3, this.f121bM);
                        }
                        for (int i29 = 1; i29 < 11; i29++) {
                            this.f135bf[((1 - this.f121bM) * 11) + i29] = 10;
                        }
                        this.f43O = 0;
                        this.f119bK[this.f121bM + 392] = i24;
                        this.f119bK[this.f121bM + 386] = 99999;
                    }
                    this.f124bP = 288;
                }
                int i30 = 0;
                while (true) {
                    int i31 = i30;
                    if (i31 < 4) {
                        int i32 = this.f119bK[i31 + 402] + (i31 < 2 ? this.f121bM * 11 : (1 - this.f121bM) * 11);
                        if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < 40) {
                            int i33 = i31 > 1 ? 1920 : 640;
                            this.f119bK[i32 + 224] = m81i(i32, this.f116bH + ((int) (Math.sin(Math.toRadians(this.f95an[this.f121bM] * 2.8125f)) * ((double) i33))) + ((((this.f36H.nextInt() & Integer.MAX_VALUE) % 40) - 20) << 5), ((int) ((-Math.cos(Math.toRadians(this.f95an[this.f121bM] * 2.8125f))) * ((double) i33))) + this.f115bG + ((((this.f36H.nextInt() & Integer.MAX_VALUE) % 40) - 20) << 5));
                        }
                        this.f119bK[i32 + 192] = 3;
                        m91q(i32);
                        i30 = i31 + 1;
                    }
                    break;
                }
                break;
            case 4:
                int i34 = this.f119bK[this.f68aM + 384];
                this.f119bK[402] = this.f119bK[this.f68aM + 384] + 1;
                if (this.f119bK[402] > 9) {
                    this.f119bK[402] = 1;
                }
                this.f119bK[403] = this.f119bK[402] + 1;
                if (this.f119bK[(1 - this.f68aM) + 400] != 0) {
                    this.f119bK[404] = this.f119bK[(1 - this.f68aM) + 384];
                } else {
                    this.f119bK[404] = this.f119bK[(1 - this.f68aM) + 384] + 1;
                    if (this.f119bK[404] > 10) {
                        this.f119bK[404] = 1;
                    }
                }
                this.f119bK[405] = this.f119bK[404] + 1;
                if (this.f119bK[405] > 10) {
                    this.f119bK[405] = 1;
                }
                if (this.f78aW && this.f68aM == 1) {
                    this.f111bC = this.f178y;
                    this.f61aF = this.f29A;
                }
                int i35 = (this.f68aM * 11) + i34;
                int iM55b = this.f119bK[i35 + 224];
                if (m60c(this.f119bK[i35 + 0], this.f119bK[i35 + 32]) > 24) {
                    this.f119bK[i35 + 224] = m72f(this.f119bK[i35 + 0], this.f119bK[i35 + 32]);
                    this.f119bK[i35 + 192] = 3;
                    m91q(i35);
                } else {
                    if (this.f119bK[i35 + 192] != 0) {
                        iM55b = m81i(i35, 4256, 5664);
                    }
                    this.f119bK[i35 + 192] = 0;
                    this.f119bK[i35 + 0] = ((this.f72aQ * 218) + 24) << 5;
                    if (this.f115bG < 5664) {
                        this.f119bK[i35 + 32] = 1280;
                    } else {
                        this.f119bK[i35 + 32] = 10048;
                    }
                    if (this.f119bK[this.f68aM + 400] == 0) {
                        this.f60aE[this.f68aM] = 4;
                        iM55b = m55b(this.f119bK[i35 + 224], m51a(i35, iM55b, this.f111bC, this.f68aM));
                    } else {
                        this.f61aF = 0;
                        int i36 = this.f119bK[402] + (this.f68aM * 11);
                        int iM81i2 = m81i(i35, this.f119bK[i36 + 0], this.f119bK[i36 + 32]);
                        if (iM55b != iM81i2) {
                            iM55b = iM81i2;
                        } else if (m67e(i35, this.f119bK[i36 + 0], this.f119bK[i36 + 32]) < 4900) {
                            this.f61aF = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 80) + 120;
                            this.f119bK[this.f68aM + 384] = this.f119bK[402];
                        }
                        if (this.f52X != 0) {
                            if (iM55b == 3) {
                                iM55b = 2;
                            }
                            if (iM55b < 6 && iM55b > 3) {
                                iM55b = 6;
                            }
                        } else {
                            if (iM55b < 2) {
                                iM55b = 2;
                            }
                            if (iM55b > 6) {
                                iM55b = 6;
                            }
                        }
                        if (this.f72aQ != 0) {
                            if (iM55b > 0 && iM55b < 3) {
                                iM55b = 0;
                            }
                            if (iM55b == 3) {
                                iM55b = 4;
                            }
                        } else {
                            if (iM55b > 5) {
                                iM55b = 0;
                            }
                            if (iM55b == 5) {
                                iM55b = 4;
                            }
                        }
                        if (this.f119bK[(1 - this.f68aM) + 400] == 0) {
                            this.f60aE[this.f68aM] = 4;
                            int i37 = this.f119bK[(1 - this.f68aM) + 384] + ((1 - this.f68aM) * 11);
                            if (m60c(this.f119bK[i37 + 0], this.f119bK[i37 + 32]) > 900) {
                                m78g(i37, this.f111bC, this.f61aF);
                            } else {
                                this.f119bK[i37 + 224] = m81i(i37, 4256, this.f119bK[i37 + 32]);
                                this.f119bK[i37 + 192] = 3;
                                m91q(i37);
                            }
                        }
                    }
                    this.f119bK[i35 + 288] = iM55b * 3;
                    this.f116bH = this.f119bK[i35 + 0] + ((this.f159f[(iM55b * 2) + 138] * 6) >> 2);
                    this.f115bG = this.f119bK[i35 + 32] + ((this.f159f[((iM55b * 2) + 1) + 138] * 6) >> 2);
                    this.f119bK[i35 + 224] = iM55b;
                    if (this.f61aF != 0) {
                        if (this.f119bK[this.f68aM + 400] == 0) {
                            m58b(this.f61aF + 30, (int) (Math.sin(Math.toRadians(this.f95an[this.f68aM] * 2.8125f)) * 32.0d), (int) ((-Math.cos(Math.toRadians(this.f95an[this.f68aM] * 2.8125f))) * 32.0d), this.f68aM);
                        } else {
                            m53a(this.f61aF + 30, iM55b, this.f68aM);
                        }
                        this.f43O = 0;
                        this.f119bK[this.f68aM + 392] = i34;
                        this.f119bK[this.f68aM + 386] = 99999;
                    }
                }
                int i38 = 0;
                while (true) {
                    int i39 = i38;
                    if (i39 >= 4) {
                        m66d(0, 0);
                        m66d(11, 1);
                    } else {
                        int i40 = (i39 < 2 ? this.f68aM * 11 : (1 - this.f68aM) * 11) + this.f119bK[i39 + 402];
                        if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < 30) {
                            int iNextInt3 = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 40) - 20;
                            int i41 = this.f72aQ == 0 ? 4256 - ((iNextInt3 + 40) << 5) : ((iNextInt3 + 40) << 5) + 4256;
                            int iNextInt4 = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 40) - 20;
                            this.f119bK[i40 + 224] = m81i(i40, i41, this.f115bG < 5664 ? (iNextInt4 + 70) << 5 : (iNextInt4 + 284) << 5);
                        }
                        this.f119bK[i40 + 192] = 2;
                        m91q(i40);
                        i38 = i39 + 1;
                    }
                    break;
                }
                break;
            case 6:
                int i42 = this.f119bK[this.f32D + 384] + (this.f32D * 11);
                this.f119bK[402] = this.f119bK[this.f32D + 384] + 1;
                if (this.f119bK[402] > 9) {
                    this.f119bK[402] = 1;
                }
                this.f119bK[403] = this.f119bK[402] + 1;
                if (this.f119bK[(1 - this.f32D) + 400] != 0) {
                    this.f119bK[404] = this.f119bK[(1 - this.f32D) + 384];
                } else {
                    this.f119bK[404] = this.f119bK[(1 - this.f32D) + 384] + 1;
                    if (this.f119bK[404] > 10) {
                        this.f119bK[404] = 1;
                    }
                }
                this.f119bK[405] = this.f119bK[404] + 1;
                if (this.f119bK[405] > 10) {
                    this.f119bK[405] = 1;
                }
                if (this.f78aW && this.f32D == 1) {
                    this.f111bC = this.f178y;
                    this.f61aF = this.f29A;
                }
                int i43 = -1;
                this.f169p++;
                if (this.f119bK[this.f32D + 400] == 0) {
                    this.f60aE[this.f32D] = 4;
                    iM51a2 = m51a(i42, 0, this.f111bC, this.f32D);
                } else if (this.f169p < 30) {
                    this.f61aF = 0;
                    iM51a2 = this.f119bK[i42 + 224];
                } else {
                    iM51a2 = this.f119bK[i42 + 224];
                    this.f61aF = 0;
                    int i44 = (this.f32D * 11) + 1;
                    while (i44 < (this.f32D * 11) + 11) {
                        if (i44 != i42) {
                            int i45 = this.f119bK[i44 + 0];
                            int i46 = this.f119bK[i44 + 32];
                            if (Math.abs(iM51a2 - m81i(i42, i45, i46)) < 2) {
                                int i47 = i45 - this.f119bK[i42 + 0];
                                int i48 = i46 - this.f119bK[i42 + 32];
                                int iAbs2 = Math.abs(i47);
                                int iAbs3 = Math.abs(i48);
                                if (iAbs2 < iAbs3) {
                                    this.f61aF = iAbs3 / 15;
                                } else {
                                    this.f61aF = iAbs2 / 15;
                                }
                                int i49 = iAbs2 < iAbs3 ? iAbs3 >> 5 : iAbs2 >> 5;
                                iSin = i47 / i49;
                                i3 = i48 / i49;
                                i = (this.f32D * 11) + 11;
                                i43 = i44;
                            } else if ((this.f169p & 3) == 0) {
                                iM51a2 = (iM51a2 + 1) & 7;
                                i = i44;
                            } else {
                                i = i44;
                            }
                        } else {
                            i = i44;
                        }
                        i44 = i + 1;
                    }
                }
                this.f119bK[i42 + 224] = iM51a2;
                if (this.f61aF != 0 && this.f169p >= 15) {
                    if (this.f119bK[this.f32D + 400] == 0) {
                        int i50 = Integer.MAX_VALUE;
                        int i51 = Integer.MAX_VALUE;
                        int i52 = (this.f32D * 11) + 1;
                        i2 = i43;
                        while (i52 < (this.f32D * 11) + 11) {
                            if (i52 != i42) {
                                int i53 = this.f119bK[i52 + 0];
                                int i54 = this.f119bK[i52 + 32];
                                iAbs = Math.abs(m81i(i42, i53, i54) - iM51a2);
                                if (iAbs > 5) {
                                    iAbs = 8 - iAbs;
                                }
                                if (iAbs < 1) {
                                    int i55 = i53 - this.f119bK[i42 + 0];
                                    int i56 = i54 - this.f119bK[i42 + 32];
                                    int i57 = (i55 * i55) + (i56 * i56);
                                    if (iAbs > i51 || i57 > i50) {
                                        iAbs = i51;
                                    } else {
                                        i50 = i57;
                                        i2 = i52;
                                    }
                                } else {
                                    iAbs = i51;
                                }
                            } else {
                                iAbs = i51;
                            }
                            i52++;
                            i51 = iAbs;
                        }
                        if (i2 > -1) {
                            int i58 = this.f119bK[i2 + 0];
                            int i59 = this.f119bK[i2 + 32];
                            m81i(i42, i58, i59);
                            int i60 = i58 - this.f119bK[i42 + 0];
                            int i61 = i59 - this.f119bK[i42 + 32];
                            int iAbs4 = Math.abs(i60);
                            int iAbs5 = Math.abs(i61);
                            if (iAbs4 < iAbs5) {
                                this.f61aF = iAbs5 / 15;
                            } else {
                                this.f61aF = iAbs4 / 15;
                            }
                            int i62 = iAbs4 < iAbs5 ? iAbs5 >> 5 : iAbs4 >> 5;
                            iSin = i60 / i62;
                            i3 = i61 / i62;
                        } else {
                            iSin = (int) (Math.sin(Math.toRadians(this.f95an[this.f32D] * 2.8125f)) * 32.0d);
                            i3 = (int) ((-Math.cos(Math.toRadians(this.f95an[this.f32D] * 2.8125f))) * 32.0d);
                        }
                    } else {
                        i2 = i43;
                    }
                    if (this.f61aF < 100) {
                        this.f61aF = 100;
                    }
                    if (this.f61aF > 220) {
                        this.f61aF = 220;
                    }
                    m58b(this.f61aF, iSin, i3, this.f32D);
                    if (i2 > -1) {
                        this.f119bK[this.f32D + 384] = i2 % 11;
                        if (this.f119bK[this.f32D + 400] == 0) {
                            this.f41M[this.f32D] = 9;
                        }
                    }
                    this.f43O = 0;
                }
                this.f119bK[i42 + 0] = this.f116bH - ((int) (Math.sin(Math.toRadians(this.f95an[this.f32D] * 2.8125f)) * 128.0d));
                this.f119bK[i42 + 32] = this.f115bG + ((int) (Math.cos(Math.toRadians(this.f95an[this.f32D] * 2.8125f)) * 128.0d));
                int i63 = 0;
                while (true) {
                    int i64 = i63;
                    if (i64 >= 4) {
                        m66d(0, 0);
                        m66d(11, 1);
                    } else {
                        int i65 = (i64 < 2 ? this.f32D * 11 : (1 - this.f32D) * 11) + this.f119bK[i64 + 402];
                        if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < 30) {
                            this.f119bK[i65 + 224] = m81i(i65, this.f116bH + ((int) (Math.sin(Math.toRadians(this.f95an[this.f32D] * 2.8125f)) * 1280.0d)) + ((((this.f36H.nextInt() & Integer.MAX_VALUE) % 40) - 20) << 5), this.f115bG + ((int) ((-Math.cos(Math.toRadians(this.f95an[this.f32D] * 2.8125f))) * 1280.0d)) + ((((this.f36H.nextInt() & Integer.MAX_VALUE) % 40) - 20) << 5));
                        }
                        this.f119bK[i65 + 192] = 2;
                        m91q(i65);
                        i63 = i64 + 1;
                    }
                    break;
                }
                break;
            case 7:
                if (this.f78aW && this.f32D == 1) {
                    this.f111bC = this.f178y;
                    this.f61aF = this.f29A;
                }
                int i66 = this.f119bK[this.f32D + 384] + (this.f32D * 11);
                int i67 = this.f119bK[i66 + 224];
                if (m60c(this.f119bK[i66 + 0], this.f119bK[i66 + 32]) > 32) {
                    this.f119bK[i66 + 224] = m72f(this.f119bK[i66 + 0], this.f119bK[i66 + 32]);
                    this.f119bK[i66 + 192] = 3;
                    m91q(i66);
                } else {
                    this.f119bK[i66 + 192] = 0;
                    if (this.f119bK[this.f32D + 400] == 0) {
                        this.f60aE[this.f32D] = 4;
                        iM51a = m51a(i66, 0, this.f111bC, this.f32D);
                    } else {
                        iM51a = this.f119bK[i66 + 224];
                    }
                    this.f119bK[i66 + 224] = iM51a;
                    if (this.f61aF != 0) {
                        if (this.f119bK[this.f32D + 400] == 0) {
                            iSin = (int) (Math.sin(Math.toRadians(this.f95an[this.f32D] * 2.8125f)) * 32.0d);
                            i3 = (int) ((-Math.cos(Math.toRadians(this.f95an[this.f32D] * 2.8125f))) * 32.0d);
                        }
                        if (this.f61aF < 90) {
                            this.f61aF = 90;
                        }
                        if (this.f61aF > 220) {
                            this.f61aF = 220;
                        }
                        m58b(this.f61aF, iSin, i3, this.f32D);
                        this.f43O = 0;
                    }
                    this.f119bK[i66 + 0] = this.f116bH - ((int) (Math.sin(Math.toRadians(this.f95an[this.f32D] * 2.8125f)) * 96.0d));
                    this.f119bK[i66 + 32] = this.f115bG + ((int) (Math.cos(Math.toRadians(this.f95an[this.f32D] * 2.8125f)) * 96.0d));
                }
                int i68 = 0;
                int i69 = 0;
                while (true) {
                    int i70 = i68;
                    int i71 = i69;
                    if (i71 < 2) {
                        int i72 = 0;
                        while (true) {
                            int i73 = i72;
                            if (i73 < 11) {
                                int i74 = i70 + i73;
                                if (i73 == 0) {
                                    if (i71 == this.f81aZ) {
                                        int i75 = this.f119bK[i74 + 64] - this.f119bK[i74 + 0] < 0 ? -(this.f119bK[i74 + 64] - this.f119bK[i74 + 0]) : this.f119bK[i74 + 64] - this.f119bK[i74 + 0];
                                        int i76 = this.f119bK[i74 + 96] - this.f119bK[i74 + 32] < 0 ? -(this.f119bK[i74 + 96] - this.f119bK[i74 + 32]) : this.f119bK[i74 + 96] - this.f119bK[i74 + 32];
                                        if (i75 >= 128 || i76 >= 128) {
                                            this.f119bK[i74 + 224] = m81i(i74, this.f119bK[i74 + 64], this.f119bK[i74 + 96]);
                                            this.f119bK[i74 + 192] = 3;
                                            m87m(i74);
                                        } else {
                                            this.f119bK[i74 + 0] = this.f119bK[i74 + 64];
                                            this.f119bK[i74 + 32] = this.f119bK[i74 + 96];
                                            this.f119bK[i74 + 224] = m81i(i74, 4256, 5152);
                                            this.f119bK[i74 + 192] = 0;
                                        }
                                    }
                                } else if (i71 != this.f32D || i73 != i66 % 11) {
                                    int i77 = this.f119bK[i74 + 32];
                                    if (Math.abs(i77 - 5664) > 2496) {
                                        i77 = (i77 + 5664) / 2;
                                    }
                                    if (Math.abs(i77 - this.f119bK[i74 + 32]) < 320) {
                                        this.f164k++;
                                        this.f119bK[i74 + 224] = m72f(this.f119bK[i74 + 0], this.f119bK[i74 + 32]);
                                        this.f119bK[i74 + 288] = this.f119bK[i74 + 224] * 3;
                                        this.f119bK[i74 + 192] = 0;
                                    } else {
                                        this.f119bK[i74 + 224] = m81i(i74, this.f119bK[i74 + 64], i77);
                                        this.f119bK[i74 + 192] = 3;
                                        m91q(i74);
                                    }
                                }
                                i72 = i73 + 1;
                            }
                        }
                        i68 = i70 + 11;
                        i69 = i71 + 1;
                    }
                    break;
                }
                break;
        }
        if (this.f119bK[400] == 0) {
            this.f119bK[22] = this.f119bK[this.f119bK[384] + 0];
            this.f119bK[54] = this.f119bK[this.f119bK[384] + 32];
        }
        if (this.f41M[0] > 0) {
            int[] iArr = this.f41M;
            iArr[0] = iArr[0] - 1;
        }
        if (this.f41M[1] > 0) {
            int[] iArr2 = this.f41M;
            iArr2[1] = iArr2[1] - 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m53a(int i, int i2, int i3) {
        this.f63aH = i / 2;
        this.f124bP += i / 4;
        int i4 = i2 + i2;
        int i5 = (i / 30) + 2;
        this.f102au = this.f159f[i4 + 138] * i5;
        this.f101at = this.f159f[i4 + 1 + 138] * i5;
        this.f116bH += this.f102au * 2;
        this.f115bG += this.f101at * 2;
        this.f71aP = i3;
        this.f173t = -1;
        if (this.f43O != 1 && this.f43O != 3) {
            m69e(1);
        }
        this.f119bK[392] = -1;
        this.f119bK[393] = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m54a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i2 << 5;
        int i9 = i3 << 5;
        this.f119bK[i + 0] = i8;
        this.f119bK[i + 32] = i9;
        this.f119bK[i + 64] = i8;
        this.f119bK[i + 96] = i9;
        this.f119bK[i + 128] = this.f159f[(i7 * 2) + 99] << 5;
        this.f119bK[i + 160] = this.f159f[((i7 * 2) + 99) + 1] << 5;
        this.f119bK[i + 192] = 0;
        this.f119bK[i + 224] = i5;
        this.f119bK[i + 256] = i4;
        this.f119bK[i + 288] = 0;
        this.f119bK[i + 320] = i7;
        this.f119bK[i + 352] = 0;
    }

    /* JADX INFO: renamed from: b */
    public int m55b(int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 0) {
            return i;
        }
        if (i3 > 4) {
            i3 -= 8;
        }
        if (i3 < -4) {
            i3 += 8;
        }
        return ((i3 < 0 ? -1 : 1) + i) & 7;
    }

    /* JADX INFO: renamed from: b */
    public int m56b(int i, int i2, int i3) {
        int iM81i = m81i(i, i2, i3);
        int i4 = iM81i << 1;
        int[] iArr = this.f119bK;
        int i5 = i + 0;
        iArr[i5] = iArr[i5] + (this.f159f[i4 + 138] * 2);
        int[] iArr2 = this.f119bK;
        int i6 = i + 32;
        iArr2[i6] = iArr2[i6] + (this.f159f[i4 + 1 + 138] * 2);
        this.f119bK[i + 288] = i4 + this.f159f[this.f119bK[i + 352] + 154] + iM81i;
        this.f119bK[i + 352] = (this.f119bK[i + 352] + 1) & 3;
        return iM81i;
    }

    /* JADX INFO: renamed from: b */
    public short m57b(int i) {
        switch (i) {
            case 0:
                return (short) 3;
            case 1:
                return (short) 2;
            case 2:
                return (short) 4;
            default:
                return (short) -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m58b(int i, int i2, int i3, int i4) {
        this.f63aH = i / 2;
        this.f124bP += i / 4;
        int i5 = (i / 30) + 2;
        this.f102au = i2 * i5;
        this.f101at = i5 * i3;
        this.f116bH += this.f102au;
        this.f115bG += this.f101at;
        this.f71aP = i4;
        this.f173t = -1;
        if (this.f43O != 1 && this.f43O != 3) {
            m69e(1);
        }
        this.f119bK[392] = -1;
        this.f119bK[393] = -1;
    }

    /* JADX INFO: renamed from: b */
    public void m59b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < 0 || i >= this.f30B) {
            return;
        }
        this.f55a[this.f44P * i] = i2;
        this.f55a[(this.f44P * i) + 1] = i3;
        this.f55a[(this.f44P * i) + 2] = i4;
        this.f55a[(this.f44P * i) + 3] = i5;
        this.f55a[(this.f44P * i) + 4] = i6;
    }

    /* JADX INFO: renamed from: c */
    public int m60c(int i, int i2) {
        int i3 = (i - this.f116bH) >> 5;
        int i4 = (i2 - this.f115bG) >> 5;
        return (i3 * i3) + (i4 * i4);
    }

    /* JADX INFO: renamed from: c */
    public short m61c(int i) {
        switch (i) {
            case 0:
                return (short) 92;
            case 1:
                return (short) 103;
            case 2:
                return (short) 114;
            case 3:
                return (short) 120;
            case 4:
                return (short) 118;
            case 5:
                return (short) 121;
            case 6:
                return (short) 122;
            case 7:
                return (short) 123;
            case 8:
                return (short) 124;
            case 9:
                return (short) 125;
            case 10:
                return (short) 93;
            case 11:
                return (short) 94;
            case 12:
                return (short) 95;
            case 13:
                return (short) 96;
            case 14:
                return (short) 97;
            case 15:
                return (short) 119;
            case 16:
                return (short) 98;
            case 17:
                return (short) 99;
            case 18:
                return (short) 100;
            case 19:
                return (short) 101;
            case 20:
                return (short) 102;
            case 21:
                return (short) 104;
            case 22:
                return (short) 105;
            case 23:
                return (short) 106;
            case 24:
                return (short) 107;
            case 25:
                return (short) 108;
            case 26:
                return (short) 109;
            case 27:
                return (short) 110;
            case 28:
                return (short) 111;
            case 29:
                return (short) 112;
            case 30:
                return (short) 113;
            case 31:
                return (short) 115;
            case 32:
                return (short) 116;
            case 33:
                return (short) 117;
            default:
                return (short) -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m62c() {
        this.f70aO = 0;
        this.f69aN = 0;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX INFO: renamed from: c */
    public void m63c(int i, int i2, int i3) {
        int i4;
        if (i2 == (this.f49U & 1)) {
            int i5 = this.f119bK[i + 192];
            int i6 = this.f119bK[i + 224];
            int i7 = this.f119bK[i + 0];
            int i8 = this.f119bK[i + 32];
            int i9 = this.f119bK[i + 320];
            int i10 = this.f119bK[i + 64];
            int i11 = this.f119bK[i + 96];
            if (this.f81aZ != i2 && (Math.abs(this.f115bG - 5664) >= 960 || this.f173t != 1 - i2)) {
                int i12 = this.f119bK[this.f119bK[i2 + 384] + (i2 * 11) + 224];
                switch (i9) {
                    case 1:
                    case 2:
                    case 3:
                        i4 = ((i11 + this.f115bG) + 5664) / 3;
                        break;
                    case 4:
                    case 6:
                        i4 = this.f119bK[this.f119bK[i2 + 384] + (i2 * 11) + 32] + (this.f159f[i12 + i12 + 1 + 138] * 5);
                        break;
                    case 5:
                        i4 = (this.f115bG + 5664) / 2;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        i4 = this.f119bK[this.f119bK[i2 + 384] + (i2 * 11) + 32] + (this.f159f[i12 + i12 + 1 + 138] * 30);
                        break;
                    default:
                        i4 = i11;
                        break;
                }
            } else {
                int i13 = this.f116bH - i10;
                if (Math.abs(this.f115bG - i11) < this.f119bK[i + 160]) {
                    i4 = (this.f115bG + i11) / 2;
                    if (Math.abs(i13) < this.f119bK[i + 128] && this.f173t != i2) {
                        int i14 = ((this.f52X * 274) + 40) << 5;
                        i10 = (i10 + this.f116bH) / 2;
                        i4 = ((i11 + i14) + this.f115bG) / 3;
                    }
                } else {
                    i4 = i11;
                }
            }
            int i15 = i8 - i4 > 960 ? 5 : 3;
            int i16 = (Math.abs(i7 - i10) >= 256 || Math.abs(i8 - i4) >= 256) ? 32 : -32;
            this.f119bK[i + 224] = m81i(i, i10, i4);
            int i17 = i16 + i5;
            if (i17 < 0) {
                i17 = 0;
            }
            if (i17 <= i15) {
                i15 = i17;
            }
            this.f119bK[i + 192] = i15;
            int iM60c = m60c(i7, i8);
            if (iM60c + 24 < this.f119bK[i2 + 386]) {
                this.f79aX = i3;
                this.f119bK[i2 + 386] = iM60c;
            }
            if (i15 == 0) {
                int iM72f = m72f(i7, i8);
                this.f119bK[i + 224] = iM72f;
                this.f119bK[i + 288] = iM72f * 3;
            }
        }
        m91q(i);
    }

    /* JADX INFO: renamed from: d */
    public short m64d(int i) {
        switch (i) {
            case 0:
                return (short) 134;
            case 1:
                return (short) 132;
            case 2:
                return (short) 133;
            case 3:
                return (short) 131;
            default:
                return (short) -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m65d() {
        int i;
        int i2;
        this.f63aH -= 15;
        this.f124bP += this.f63aH;
        if (this.f124bP <= 8) {
            this.f63aH = -((this.f63aH * 7) / 10);
            this.f124bP = 0;
        }
        this.f116bH += this.f102au;
        this.f115bG += this.f101at;
        int i3 = this.f116bH >> 5;
        int i4 = this.f115bG >> 5;
        this.f102au -= this.f102au / 16;
        this.f101at -= this.f101at / 16;
        if (Math.abs(this.f102au) < 20) {
            this.f102au = 0;
        }
        if (Math.abs(this.f101at) < 20) {
            this.f101at = 0;
        }
        if (this.f115bG < 5664) {
            this.f81aZ = this.f177x ^ 1;
            this.f52X = 0;
            i = 0;
        } else {
            this.f81aZ = this.f177x;
            this.f52X = 1;
            i = 274;
        }
        if (this.f116bH < 4256) {
            this.f72aQ = 0;
            i2 = 0;
        } else {
            this.f72aQ = 1;
            i2 = 218;
        }
        if (this.f43O == 0) {
            int i5 = (i2 + 24) << 5;
            if ((this.f116bH < i5 && this.f72aQ == 0) || (this.f116bH > i5 && this.f72aQ != 0)) {
                this.f102au = 0;
                this.f101at = 0;
                this.f63aH = 0;
                this.f124bP = 0;
                this.f116bH = i5;
                this.f43O = 3;
                this.f121bM = 1 - this.f71aP;
                m69e(2);
                if (this.f72aQ == 0) {
                    this.f95an[this.f121bM] = 32;
                } else {
                    this.f95an[this.f121bM] = 96;
                }
            }
            int i6 = (i + 40) << 5;
            if ((this.f115bG < i6 && this.f52X == 0) || (this.f115bG > i6 && this.f52X != 0)) {
                int i7 = this.f116bH >> 5;
                if (i7 > 122 && i7 < 144 && this.f124bP < 540) {
                    this.f163j = this.f81aZ ^ 1;
                    int[] iArr = this.f119bK;
                    int i8 = this.f163j + 390;
                    iArr[i8] = iArr[i8] + 1;
                    if (this.f71aP != this.f163j) {
                        this.f132bc = 1;
                    } else {
                        this.f132bc = 0;
                    }
                    this.f148bs = 0;
                    this.f64aI = 1;
                    this.f96ao = -512;
                    this.f158e = 32;
                    this.f76aU = 2;
                    m93s();
                    m69e(0);
                    this.f128bT.m144d(1500);
                } else if (!(this.f71aP == this.f177x && i == 0) && (this.f71aP == this.f177x || i == 0)) {
                    this.f116bH = (i2 + 24) << 5;
                    this.f43O = 4;
                    this.f68aM = 1 - this.f71aP;
                    if (i == 0) {
                        if (i2 == 0) {
                            this.f95an[this.f68aM] = 36;
                        } else {
                            this.f95an[this.f68aM] = 92;
                        }
                    } else if (i2 == 0) {
                        this.f95an[this.f68aM] = 28;
                    } else {
                        this.f95an[this.f68aM] = 100;
                    }
                    m69e(2);
                } else {
                    m69e(2);
                    this.f43O = 2;
                    this.f164k = 0;
                    this.f71aP ^= 1;
                    if (i == 0) {
                        this.f95an[this.f71aP] = 64;
                    } else {
                        this.f95an[this.f71aP] = 0;
                    }
                }
                this.f115bG = i6;
                this.f102au = 0;
                this.f101at = 0;
                this.f63aH = 0;
                this.f124bP = 0;
            }
        }
        if (Math.abs(this.f102au) + Math.abs(this.f101at) > 8) {
            this.f119bK[311] = (this.f119bK[311] + 1) % 3;
        }
        this.f119bK[23] = this.f116bH;
        this.f119bK[55] = this.f115bG;
        this.f119bK[24] = this.f116bH;
        this.f119bK[56] = this.f115bG;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0273  */
    /* JADX INFO: renamed from: d */
    public void m66d(int i, int i2) {
        int i3;
        int i4;
        this.f119bK[i + 192] = 3;
        int iAbs = Math.abs(this.f119bK[i + 96] - this.f115bG);
        if (iAbs >= 2016 || this.f43O == 6) {
            int i5 = this.f119bK[i + 0] - this.f119bK[i + 64];
            int i6 = this.f119bK[i + 32] - this.f119bK[i + 96];
            if ((i5 * i5) + (i6 * i6) < 3200) {
                this.f119bK[i2 + 394] = 0;
                this.f119bK[i + 224] = m81i(i, 4256, 5664);
                this.f119bK[i + 288] = 0;
                this.f119bK[i + 192] = 0;
                this.f119bK[i + 0] = this.f119bK[i + 64];
                this.f119bK[i + 32] = this.f119bK[i + 96];
            } else {
                this.f119bK[i + 224] = m81i(i, this.f119bK[i + 64], this.f119bK[i + 96]);
                m87m(i);
            }
        } else {
            int i7 = this.f119bK[i + 0];
            int i8 = this.f119bK[i + 32];
            int i9 = this.f116bH;
            int i10 = this.f115bG;
            int i11 = this.f124bP;
            int iAbs2 = Math.abs(this.f119bK[i + 64] - this.f116bH);
            if (iAbs >= 640 || iAbs2 >= 768) {
                if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < this.f119bK[i2 + 398]) {
                    if (iAbs >= 320 || iAbs2 >= 480) {
                        int i12 = (this.f116bH >> 5) - 133;
                        if ((i12 < 0 ? -i12 : i12) < 15) {
                            i3 = this.f116bH;
                        } else {
                            i3 = i12 < 0 ? 3936 : 4576;
                        }
                        this.f119bK[i + 224] = m81i(i, i3, this.f119bK[i + 96]);
                    } else {
                        this.f119bK[i + 224] = m81i(i, (this.f119bK[i + 64] + i9) / 2, (this.f119bK[i + 96] + i10) / 2);
                    }
                }
                m87m(i);
            } else {
                int i13 = i8 - this.f115bG;
                if (i13 < 0) {
                    i13 = -i13;
                }
                int i14 = this.f116bH - i7;
                int i15 = i14 < 0 ? -i14 : i14;
                if (i13 >= 224 || i15 >= 320) {
                    if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < this.f119bK[i2 + 396]) {
                        this.f119bK[i + 224] = m81i(i, (this.f119bK[i + 64] + i9) / 2, (this.f119bK[i + 96] + i10) / 2);
                    }
                    m87m(i);
                } else {
                    int i16 = this.f124bP;
                    if (i11 < i16) {
                        i16 = i11;
                    }
                    int i17 = this.f116bH;
                    if (this.f119bK[i2 + 394] != 0) {
                        if (this.f159f[this.f119bK[i2 + 394]] != -1 || i15 >= 224 || i16 >= 192) {
                            i4 = i15;
                        } else {
                            this.f43O = 2;
                            this.f164k = 0;
                            if (this.f52X == 0) {
                                this.f95an[i2] = 64;
                                i4 = i15;
                                i16 = 0;
                            } else {
                                this.f95an[i2] = 0;
                                i4 = i15;
                                i16 = 0;
                            }
                        }
                    } else if (i15 >= 128) {
                        if (i14 < 0) {
                            this.f119bK[i2 + 394] = 132;
                        } else {
                            this.f119bK[i2 + 394] = 126;
                        }
                        if (i15 >= 288 || (this.f36H.nextInt() & Integer.MAX_VALUE) % 100 >= this.f119bK[i2 + 396]) {
                            i4 = i15;
                        } else {
                            i4 = 0;
                        }
                    } else if (i16 >= 160) {
                        this.f119bK[i2 + 394] = 122;
                        if (i16 >= 288 || (this.f36H.nextInt() & Integer.MAX_VALUE) % 100 >= this.f119bK[i2 + 396]) {
                            i4 = i15;
                        } else {
                            i4 = i15;
                            i16 = 160;
                        }
                    } else if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < this.f119bK[i2 + 398]) {
                        this.f119bK[i2 + 394] = 119;
                        i4 = i15;
                    } else {
                        i4 = i15;
                    }
                    if (i4 < 224 && i16 < 192) {
                        if (i8 < 5664) {
                            m74f(i, 4, i2);
                        } else {
                            m74f(i, 0, i2);
                        }
                    }
                }
            }
        }
        if (this.f119bK[i2 + 394] == 0) {
            this.f119bK[i + 288] = this.f119bK[i + 224] * 3;
            return;
        }
        int i18 = ((this.f177x ^ i2) * 6) + 24;
        int[] iArr = this.f159f;
        int[] iArr2 = this.f119bK;
        int i19 = i2 + 394;
        int i20 = iArr2[i19];
        iArr2[i19] = i20 + 1;
        int i21 = iArr[i20];
        if (i21 != -1) {
            this.f119bK[i + 288] = i18 + i21;
        } else {
            this.f119bK[i2 + 394] = 0;
            this.f119bK[i + 288] = this.f119bK[i + 224] * 3;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m67e(int i, int i2, int i3) {
        int i4 = (i2 - this.f119bK[i + 0]) >> 5;
        int i5 = (i3 - this.f119bK[i + 32]) >> 5;
        return (i4 * i4) + (i5 * i5);
    }

    /* JADX INFO: renamed from: e */
    public void m68e() {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("league", false);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            byte[] bArrNextRecord = recordEnumerationEnumerateRecords.nextRecord();
            recordEnumerationEnumerateRecords.destroy();
            recordStoreOpenRecordStore.closeRecordStore();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrNextRecord);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            int i = this.f33E;
            this.f130ba = dataInputStream.readInt();
            this.f33E = dataInputStream.readInt();
            this.f82aa = dataInputStream.readInt();
            this.f165l = dataInputStream.readInt();
            this.f114bF = dataInputStream.readBoolean();
            this.f35G = dataInputStream.readInt();
            this.f140bk = dataInputStream.readInt();
            this.f139bj = dataInputStream.readInt();
            this.f119bK[406] = dataInputStream.readInt();
            this.f119bK[407] = dataInputStream.readInt();
            this.f119bK[388] = dataInputStream.readInt();
            this.f119bK[389] = dataInputStream.readInt();
            this.f119bK[400] = dataInputStream.readInt();
            this.f119bK[401] = dataInputStream.readInt();
            for (int i2 = 0; i2 < 8; i2++) {
                this.f119bK[i2 + 408] = dataInputStream.readInt();
                this.f119bK[i2 + 458] = dataInputStream.readInt();
                this.f119bK[i2 + 474] = dataInputStream.readInt();
                this.f119bK[(i2 << 1) + 0 + 442] = dataInputStream.readInt();
                this.f119bK[(i2 << 1) + 1 + 442] = dataInputStream.readInt();
                this.f57aB[i2 * 1] = dataInputStream.readInt();
            }
            if (i == 0 && this.f33E > 0) {
                this.f33E = 3;
            } else if (i > 0 && this.f33E > 0) {
                this.f33E = 1;
                this.f119bK[390] = dataInputStream.readInt();
                this.f119bK[391] = dataInputStream.readInt();
                this.f170q = dataInputStream.readInt();
                this.f43O = dataInputStream.readInt();
                this.f177x = dataInputStream.readInt();
                this.f96ao = dataInputStream.readInt();
                this.f158e = dataInputStream.readInt();
                this.f64aI = dataInputStream.readInt();
                this.f148bs = dataInputStream.readInt();
                this.f76aU = dataInputStream.readInt();
                this.f116bH = dataInputStream.readInt();
                this.f115bG = dataInputStream.readInt();
                this.f124bP = dataInputStream.readInt();
                this.f63aH = dataInputStream.readInt();
                this.f102au = dataInputStream.readInt();
                this.f101at = dataInputStream.readInt();
                this.f52X = dataInputStream.readInt();
                this.f81aZ = dataInputStream.readInt();
                this.f72aQ = dataInputStream.readInt();
                this.f98aq[0] = dataInputStream.readInt();
                this.f98aq[1] = dataInputStream.readInt();
                this.f95an[0] = dataInputStream.readInt();
                this.f95an[1] = dataInputStream.readInt();
                this.f121bM = dataInputStream.readInt();
                this.f68aM = dataInputStream.readInt();
                this.f32D = dataInputStream.readInt();
                this.f163j = dataInputStream.readInt();
                this.f169p = dataInputStream.readInt();
                this.f173t = dataInputStream.readInt();
                this.f71aP = dataInputStream.readInt();
                this.f119bK[384] = dataInputStream.readInt();
                this.f119bK[385] = dataInputStream.readInt();
                this.f119bK[392] = dataInputStream.readInt();
                this.f119bK[393] = dataInputStream.readInt();
                this.f119bK[394] = dataInputStream.readInt();
                this.f119bK[395] = dataInputStream.readInt();
                this.f164k = dataInputStream.readInt();
                this.f62aG = dataInputStream.readInt();
                this.f75aT = dataInputStream.readInt();
                this.f132bc = dataInputStream.readInt();
                this.f161h = dataInputStream.readInt();
                for (int i3 = 0; i3 < 22; i3++) {
                    this.f119bK[i3 + 0] = dataInputStream.readInt();
                    this.f119bK[i3 + 32] = dataInputStream.readInt();
                    this.f119bK[i3 + 64] = dataInputStream.readInt();
                    this.f119bK[i3 + 96] = dataInputStream.readInt();
                    this.f119bK[i3 + 128] = dataInputStream.readInt();
                    this.f119bK[i3 + 160] = dataInputStream.readInt();
                    this.f119bK[i3 + 192] = dataInputStream.readInt();
                    this.f119bK[i3 + 224] = dataInputStream.readInt();
                    this.f119bK[i3 + 256] = dataInputStream.readInt();
                    this.f119bK[i3 + 288] = dataInputStream.readInt();
                    this.f119bK[i3 + 320] = dataInputStream.readInt();
                    this.f119bK[i3 + 352] = dataInputStream.readInt();
                }
            }
            this.f106ay = 1;
            this.f56aA = 0;
            this.f155bz = 0;
            this.f60aE[0] = 0;
            this.f60aE[1] = 0;
            this.f61aF = 0;
            this.f111bC = 0;
            this.f59aD = 0;
            byteArrayInputStream.close();
            this.f103av = false;
        } catch (Exception e) {
            this.f103av = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m69e(int i) {
        if (this.f51W && !this.f128bT.f237al && this.f31C > 0) {
            try {
                if (this.f122bN != null) {
                    this.f122bN.close();
                }
                this.f122bN = null;
                this.f122bN = Manager.createPlayer(getClass().getResourceAsStream(new StringBuffer().append("/").append((char) ((i / 10) + 48)).append((char) ((i % 10) + 48)).append(".wav").toString()), "audio/x-wav");
                this.f122bN.realize();
                this.f122bN.getControl("VolumeControl").setLevel(this.f37I[this.f31C]);
                this.f122bN.start();
            } catch (Exception e) {
                if (this.f122bN != null) {
                    this.f122bN.close();
                }
                this.f122bN = null;
            }
        }
        this.f67aL = i;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0402 A[PHI: r0
  0x0402: PHI (r0v35 int) = (r0v27 int), (r0v27 int), (r0v27 int), (r0v26 int) binds: [B:76:0x01c6, B:78:0x01d6, B:80:0x01e0, B:62:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    public void m70e(int i, int i2) {
        int iNextInt;
        int i3;
        int iM81i;
        int i4 = this.f119bK[i + 0];
        int i5 = this.f119bK[i + 32];
        int iM72f = this.f119bK[i + 224];
        if (this.f119bK[i2 + 386] >= 49 || this.f124bP >= 160) {
            if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < this.f179z || this.f43O == 1) {
                iM72f = m72f(i4, i5);
            }
        } else if (this.f173t == i2) {
            if ((this.f177x ^ i2) != 0) {
                i3 = 264;
                if ((i5 >> 5) > 244 && iM72f > 2 && iM72f < 6 && iM72f == m81i(i, 4256, 10048)) {
                    this.f61aF = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 70) + 180;
                }
            } else {
                i3 = 90;
                if ((i5 >> 5) < 110 && ((iM72f == 7 || iM72f < 2) && iM72f == m81i(i, 4256, 1280))) {
                    this.f61aF = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 70) + 180;
                }
            }
            if (this.f61aF == 0) {
                if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < this.f179z) {
                    iM81i = m81i(i, 4256, i3 << 5);
                    int iM81i2 = iM81i - ((m81i(this.f119bK[(1 - i2) + 384], i4, i5) + 4) & 7);
                    if (iM81i2 == 0) {
                        iM81i = (this.f49U & 4) != 0 ? (iM81i - 1) & 7 : (iM81i + 1) & 7;
                    } else if (iM81i2 == 1 || iM81i2 == -7) {
                        iM81i = (iM81i + 1) & 7;
                    } else if (iM81i2 == -1 || iM81i2 == 7) {
                        iM81i = (iM81i - 1) & 7;
                    }
                } else {
                    iM81i = iM72f;
                }
                int i6 = this.f119bK[(1 - i2) + 384];
                int iM67e = m67e(i, this.f119bK[i6 + 0], this.f119bK[i6 + 32]);
                if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < this.f156c || iM67e < 2500) {
                    int iM81i3 = m81i(i, this.f119bK[i6 + 0], this.f119bK[i6 + 32]);
                    int i7 = this.f49U % 11;
                    if (i7 != 0 && i7 != this.f119bK[i2 + 384]) {
                        int i8 = (i2 * 11) + i7;
                        int iM67e2 = m67e(i, this.f119bK[i8 + 0], this.f119bK[i8 + 32]);
                        if (iM67e2 < 6400 && iM67e2 > 400) {
                            int iM81i4 = m81i(i, this.f119bK[i8 + 0], this.f119bK[i8 + 32]);
                            if (Math.abs(iM81i - iM81i4) < 2 && iM81i4 != iM81i3) {
                                this.f79aX = i7;
                                this.f119bK[i2 + 386] = 0;
                                this.f61aF = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 80) + 120;
                                iM81i = iM81i4;
                            }
                        }
                    }
                    if (this.f61aF != 0 || (this.f36H.nextInt() & Integer.MAX_VALUE) % 100 >= this.f167n || Math.abs(i5 - 5664) >= 3200) {
                        iM72f = iM81i;
                    } else {
                        this.f61aF = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 30) + 90;
                        iM72f = iM81i;
                    }
                } else {
                    iM72f = iM81i;
                }
            }
        } else if (this.f173t == 1 - i2) {
            if ((this.f36H.nextInt() & Integer.MAX_VALUE) % 100 < (this.f127bS * 8) / 10) {
                this.f61aF = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 170) + 80;
            }
        } else if (this.f36H.nextInt() % 100 < this.f145bp[this.f165l] && this.f43O == 0) {
            this.f135bf[i] = (this.f36H.nextInt() % this.f137bh[this.f165l]) + 3;
        }
        int iM72f2 = this.f119bK[i + 224];
        if (iM72f > -1) {
            this.f119bK[i + 192] = 3;
            int i9 = iM72f - iM72f2;
            if (i9 > 4) {
                i9 -= 8;
            }
            if (i9 < -4) {
                i9 += 8;
            }
            if (i9 < 0) {
                iM72f2 = (iM72f2 - 1) & 7;
            } else if (i9 > 0) {
                iM72f2 = (iM72f2 + 1) & 7;
            } else {
                this.f119bK[i + 192] = 3;
            }
        } else {
            this.f119bK[i + 192] = 0;
            this.f119bK[i + 288] = iM72f2 * 3;
            this.f119bK[i + 352] = 0;
        }
        if (this.f119bK[i2 + 386] >= 49 || this.f124bP >= 160) {
            int i10 = (this.f119bK[i + 0] >> 5) - this.f70aO;
            int i11 = (this.f119bK[i + 32] >> 5) - this.f69aN;
            if (i10 < 8 || i10 > 232 || i11 < 10 || i11 > 310) {
                iM72f2 = m72f(i4, i5);
                this.f119bK[i + 192] = 5;
            }
        } else if (this.f173t != 1 - i2) {
            if (this.f61aF != 0) {
                m53a(this.f61aF, iM72f2, i2);
            } else if (this.f173t == i2) {
                m74f(i, iM72f2, i2);
                if (iM72f > -1) {
                    this.f119bK[i + 192] = 2;
                    this.f119bK[311] = (this.f119bK[311] + 1) % 3;
                }
            } else if (Math.abs(this.f102au) <= 180 && Math.abs(this.f101at) <= 180) {
                m74f(i, iM72f2, i2);
                if (this.f119bK[i + 192] > 2) {
                    this.f119bK[i + 192] = 2;
                }
            }
        } else if (this.f61aF > 0 && (iNextInt = (this.f36H.nextInt() & Integer.MAX_VALUE) % ((this.f126bR * 1) / 1)) < this.f61aF) {
            if (this.f61aF <= 100 || iNextInt >= (this.f61aF - 100) / 2) {
                if (this.f36H.nextInt() % 100 < this.f145bp[this.f165l] && this.f43O == 0) {
                    this.f135bf[i] = (this.f36H.nextInt() % this.f137bh[this.f165l]) + 3;
                }
                if (this.f61aF <= 170 || (iNextInt & 1) != 0) {
                    m74f(i, iM72f2, i2);
                } else {
                    m53a(this.f61aF >> 2, iM72f2, i2);
                }
            } else {
                m69e(2);
                this.f32D = 1 - i2;
                int i12 = (this.f32D * 11) + this.f119bK[this.f32D + 384];
                this.f119bK[i12 + 192] = 0;
                this.f102au = 0;
                this.f101at = 0;
                this.f124bP = 0;
                this.f63aH = 0;
                int i13 = this.f177x == i2 ? 10048 : 1280;
                if (Math.abs(this.f119bK[i12 + 32] - i13) >= 1344 || Math.abs(this.f119bK[i12 + 0] - 4256) >= 2240) {
                    m74f(i12, 0, this.f32D);
                    this.f119bK[i12 + 192] = 0;
                    this.f43O = 6;
                    if (this.f177x == i2) {
                        this.f95an[this.f32D] = 64;
                    } else {
                        this.f95an[this.f32D] = 0;
                    }
                } else {
                    this.f116bH = 4256;
                    if (this.f177x == i2) {
                        this.f115bG = i13 - 928;
                        this.f95an[this.f32D] = 64;
                    } else {
                        this.f115bG = i13 + 928;
                        this.f95an[this.f32D] = 0;
                    }
                    this.f43O = 7;
                }
                this.f169p = 0;
            }
        }
        this.f119bK[i + 224] = iM72f2;
        m91q(i);
    }

    /* JADX INFO: renamed from: f */
    public int m71f(int i) {
        return (i >= this.f128bT.m158m() + (-1) || i < this.f119bK[(1 - this.f150bu) + 406]) ? i : i + 1;
    }

    /* JADX INFO: renamed from: f */
    int m72f(int i, int i2) {
        return m75g(this.f116bH - i, (this.f115bG - i2) >> 5);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x012b  */
    /* JADX INFO: renamed from: f */
    public void m73f() {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < 22; i4++) {
            int i5 = i4 / 11;
            int i6 = i4 % 11;
            int i7 = this.f119bK[i5 + 388];
            this.f119bK[i5 + 394] = 0;
            if (this.f64aI == 0 || this.f148bs != 0) {
                i3 = this.f130ba;
                if (this.f170q >= 2700000) {
                    i3 ^= 1;
                }
            } else {
                i3 = this.f163j ^ 1;
            }
            int i8 = this.f159f[(((i7 * 11) + i6) * 3) + 0] + 24;
            if ((i5 != 0 || this.f170q >= 2700000) && (i5 == 0 || this.f170q < 2700000)) {
                i = 4;
                i2 = (137 - this.f159f[((((i7 * 11) + i6) * 3) + 0) + 1]) + 40;
                if (i5 == i3) {
                    if (i6 == 9) {
                        i8 = 133;
                        i2 = 175;
                        i = 3;
                    } else if (i6 == 10) {
                        i8 = 153;
                        i2 = 177;
                        i = 5;
                    }
                }
            } else {
                i2 = this.f159f[(((i7 * 11) + i6) * 3) + 0 + 1] + 40 + 137;
                if (i5 != i3) {
                    i = 0;
                } else if (i6 == 9) {
                    i8 = 133;
                    i2 = 179;
                    i = 7;
                } else if (i6 == 10) {
                    i8 = 113;
                    i2 = 177;
                    i = 1;
                } else {
                    i = 0;
                }
            }
            int i9 = i8 << 5;
            int i10 = i2 << 5;
            this.f119bK[i4 + 0] = i9;
            this.f119bK[i4 + 32] = i10;
            this.f119bK[i4 + 64] = i9;
            this.f119bK[i4 + 96] = i10;
            this.f119bK[i4 + 224] = i;
            this.f119bK[i4 + 192] = 0;
        }
        this.f119bK[384] = 9;
        this.f119bK[385] = 9;
        this.f119bK[386] = 9999999;
        this.f119bK[387] = 9999999;
        this.f116bH = 4256;
        this.f115bG = 5664;
        this.f124bP = 0;
        this.f63aH = 0;
        this.f102au = 0;
        this.f101at = 0;
        this.f119bK[23] = this.f116bH;
        this.f119bK[55] = this.f115bG;
        this.f119bK[24] = this.f116bH;
        this.f119bK[56] = this.f115bG;
        this.f119bK[22] = -100;
        this.f119bK[54] = -100;
        this.f71aP = i3;
        this.f173t = i3;
        this.f43O = 1;
        this.f62aG = 2;
        this.f75aT = 30;
    }

    /* JADX INFO: renamed from: f */
    public void m74f(int i, int i2, int i3) {
        int i4 = i2 + i2;
        this.f116bH = this.f119bK[i + 0] + ((this.f159f[i4 + 138] * 128) >> 5);
        this.f115bG = ((this.f159f[(i4 + 1) + 138] * 128) >> 5) + this.f119bK[i + 32];
        this.f63aH = 0;
        this.f102au = 0;
        this.f101at = 0;
        this.f124bP = 0;
        this.f173t = i3;
        this.f71aP = i3;
        if (this.f43O == 1) {
            this.f43O = 0;
        }
        this.f119bK[392] = -1;
        this.f119bK[393] = -1;
    }

    /* JADX INFO: renamed from: g */
    int m75g(int i, int i2) {
        if (i2 == 0) {
            return i >= 0 ? 2 : 6;
        }
        int i3 = i / i2;
        if (i3 < 0) {
            i3 = -i3;
        }
        int i4 = i3 >> 4;
        if (i > 0) {
            if (i4 >= 4) {
                return 2;
            }
            if (i2 < 0) {
                return i4 >= 1 ? 1 : 0;
            }
            return i4 >= 1 ? 3 : 4;
        }
        if (i4 >= 4) {
            return 6;
        }
        if (i2 < 0) {
            return i4 >= 1 ? 7 : 0;
        }
        return i4 >= 1 ? 5 : 4;
    }

    /* JADX INFO: renamed from: g */
    public short m76g(int i) {
        switch (i) {
            case 0:
                return (short) 3;
            case 1:
                return (short) 5;
            case 2:
                return (short) 7;
            default:
                return (short) -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m77g() {
        if (this.f122bN != null) {
            try {
                this.f122bN.stop();
            } catch (Exception e) {
            }
            this.f122bN.close();
            this.f122bN = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03e5 A[PHI: r10 r11
  0x03e5: PHI (r10v3 int) = (r10v2 int), (r10v5 int), (r10v5 int), (r10v5 int) binds: [B:59:0x0142, B:64:0x0169, B:72:0x018e, B:73:0x0190] A[DONT_GENERATE, DONT_INLINE]
  0x03e5: PHI (r11v4 int) = (r11v2 int), (r11v6 int), (r11v6 int), (r11v6 int) binds: [B:59:0x0142, B:64:0x0169, B:72:0x018e, B:73:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    public void m78g(int i, int i2, int i3) {
        int iNextInt;
        int i4;
        int i5;
        int iAbs;
        int i6;
        int iNextInt2;
        int i7;
        int iAbs2;
        int iAbs3;
        int i8 = this.f119bK[i + 224];
        int i9 = i > 10 ? 1 : 0;
        int i10 = this.f154by;
        if (i9 == 1) {
            i2 = this.f178y;
            i3 = this.f29A;
            i10 = this.f118bJ;
        }
        int iM51a = m51a(i, i8, i2, i9);
        int iM55b = i10 == 0 ? m55b(i8, iM51a) : iM51a;
        this.f119bK[i + 192] = this.f94am != 0 ? 3 : 0;
        if (this.f119bK[i9 + 386] >= 49 || this.f124bP >= 160) {
            if (this.f98aq[i9] == 1) {
                this.f98aq[i9] = 0;
            }
            int i11 = (this.f119bK[i + 0] >> 5) - (this.f119bK[23] >> 5);
            int i12 = (this.f119bK[i + 32] >> 5) - (this.f119bK[55] >> 5);
            if ((i11 * i11) + (i12 * i12) > 2500) {
                iM55b = m72f(this.f119bK[i + 0], this.f119bK[i + 32]);
                this.f119bK[i + 192] = 5;
            }
        } else if (this.f173t != (i9 ^ 1)) {
            int i13 = -1;
            if (this.f98aq[i9] <= 0 || System.currentTimeMillis() >= this.f175v[i9]) {
                this.f98aq[i9] = 0;
                this.f175v[i9] = System.currentTimeMillis() + 1200;
                int iNextInt3 = 4256;
                i4 = this.f177x != i9 ? 10048 : 1280;
                this.f95an[i9] = m81i(i, 4256, i4);
                int iAbs4 = Math.abs(this.f95an[i9] - iM55b);
                if (iAbs4 > 5) {
                    iAbs4 = 8 - iAbs4;
                }
                if (iAbs4 < 3) {
                    iNextInt3 = 4256 + ((((this.f36H.nextInt() & Integer.MAX_VALUE) % 20) - 10) << 5);
                    int i14 = iNextInt3 - this.f119bK[i + 0];
                    int i15 = i4 - this.f119bK[i + 32];
                    int iAbs5 = Math.abs(i14);
                    int iAbs6 = Math.abs(i15);
                    if ((iAbs5 * iAbs5) + (iAbs6 * iAbs6) < 5017600) {
                        this.f98aq[i9] = 1;
                    }
                }
                if (this.f98aq[i9] == 0) {
                    int i16 = Integer.MAX_VALUE;
                    int i17 = Integer.MAX_VALUE;
                    i13 = -1;
                    int i18 = 1;
                    int i19 = i4;
                    i5 = iNextInt3;
                    while (i18 < 11) {
                        int i20 = (i9 * 11) + i18;
                        if (i20 != i) {
                            i5 = this.f119bK[i20 + 0];
                            i19 = this.f119bK[i20 + 32];
                            this.f95an[i9] = m81i(i, i5, i19);
                            iAbs = Math.abs(this.f95an[i9] - iM55b);
                            if (iAbs > 5) {
                                iAbs = 8 - iAbs;
                            }
                            if (iAbs < 2) {
                                int i21 = i5 - this.f119bK[i + 0];
                                int i22 = i19 - this.f119bK[i + 32];
                                i6 = (i21 * i21) + (i22 * i22);
                                if ((iAbs >= i17 || i6 > (i16 * 3) / 2) && ((iAbs <= i17 || i6 > (i16 * 2) / 3) && (iAbs != i17 || i6 >= i16))) {
                                    iAbs = i17;
                                    i6 = i16;
                                    i20 = i13;
                                }
                            } else {
                                iAbs = i17;
                                i6 = i16;
                                i20 = i13;
                            }
                        } else {
                            iAbs = i17;
                            i6 = i16;
                            i20 = i13;
                        }
                        i18++;
                        i17 = iAbs;
                        i16 = i6;
                        i13 = i20;
                    }
                    if (i13 > -1) {
                        this.f98aq[i9] = 2;
                        this.f144bo[i9] = i13;
                        i5 = this.f119bK[i13 + 0];
                        i4 = this.f119bK[i13 + 32];
                        this.f95an[i9] = m81i(i, i5, i4);
                    } else {
                        i4 = i19;
                    }
                } else {
                    i5 = iNextInt3;
                }
            } else if (this.f98aq[i9] == 1) {
                i5 = 4256;
                i4 = this.f177x != i9 ? 10048 : 1280;
                this.f95an[i9] = m81i(i, 4256, i4);
            } else {
                i13 = this.f144bo[i9];
                i5 = this.f119bK[i13 + 0];
                i4 = this.f119bK[i13 + 32];
                this.f95an[i9] = m81i(i, i5, i4);
            }
            if (i3 != 0) {
                if (this.f98aq[i9] == 0) {
                    m53a(i3, iM55b, i9);
                } else {
                    if (this.f98aq[i9] == 1) {
                        iNextInt2 = (((((this.f36H.nextInt() & Integer.MAX_VALUE) % 20) - 10) << 5) + i5) - this.f119bK[i + 0];
                        i7 = i4 - this.f119bK[i + 32];
                        iAbs2 = Math.abs(iNextInt2);
                        iAbs3 = Math.abs(i7);
                        if (i3 != 0) {
                            i3 = 180;
                        }
                    } else {
                        int i23 = (this.f159f[this.f119bK[i13 + 224] + 138] * this.f119bK[i13 + 192] * 3) + i5;
                        int i24 = i4 + (this.f159f[this.f119bK[i13 + 224] + 1 + 138] * this.f119bK[i13 + 192] * 3);
                        iNextInt2 = i23 - this.f119bK[i + 0];
                        i7 = i24 - this.f119bK[i + 32];
                        iAbs2 = Math.abs(iNextInt2);
                        iAbs3 = Math.abs(i7);
                        i3 = iAbs2 < iAbs3 ? iAbs3 / 15 : iAbs2 / 15;
                        if (i3 < 90) {
                            i3 = 90;
                        }
                        if (i3 > 220) {
                            i3 = 220;
                        }
                    }
                    int i25 = iAbs2 < iAbs3 ? iAbs3 >> 5 : iAbs2 >> 5;
                    m58b(i3, iNextInt2 / i25, i7 / i25, i9);
                    if (this.f98aq[i9] == 2 && i13 > -1) {
                        this.f119bK[i9 + 384] = i13 % 11;
                        this.f41M[i9] = 7;
                    }
                }
                this.f98aq[i9] = 0;
            } else if (Math.abs(this.f102au) <= 180 && Math.abs(this.f101at) <= 180) {
                m74f(i, iM55b, i9);
                if (this.f94am != 0) {
                    this.f119bK[i + 192] = 2;
                    this.f119bK[311] = (this.f119bK[311] + 1) % 3;
                }
            }
        } else {
            if (this.f98aq[i9] == 1) {
                this.f98aq[i9] = 0;
            }
            if (i3 != 0 && (iNextInt = (this.f36H.nextInt() & Integer.MAX_VALUE) % 100) < i3) {
                if (i3 > 100 && iNextInt < (i3 - 100) / 2) {
                    m69e(2);
                    this.f128bT.m144d(500);
                    this.f32D = 1 - i9;
                    int i26 = (this.f32D * 11) + this.f119bK[this.f32D + 384];
                    this.f102au = 0;
                    this.f101at = 0;
                    this.f124bP = 0;
                    this.f63aH = 0;
                    int i27 = this.f177x == i9 ? 10048 : 1280;
                    if (Math.abs(this.f119bK[i26 + 32] - i27) >= 1344 || Math.abs(this.f119bK[i26 + 0] - 4256) >= 2240) {
                        m74f(i26, 0, this.f32D);
                        this.f119bK[i26 + 192] = 0;
                        this.f43O = 6;
                        if (this.f177x == i9) {
                            this.f95an[this.f32D] = 64;
                        } else {
                            this.f95an[this.f32D] = 0;
                        }
                    } else {
                        this.f116bH = 4256;
                        if (this.f177x == i9) {
                            this.f115bG = i27 - 928;
                            this.f95an[this.f32D] = 64;
                        } else {
                            this.f115bG = i27 + 928;
                            this.f95an[this.f32D] = 0;
                        }
                        this.f43O = 7;
                    }
                    this.f169p = 0;
                } else if (i3 <= 140 || (iNextInt & 1) != 0) {
                    m74f(i, iM55b, i9);
                } else {
                    m53a(i3 >> 1, iM55b, i9);
                }
            }
        }
        this.f119bK[i + 224] = iM55b;
        m91q(i);
    }

    /* JADX INFO: renamed from: h */
    public short m79h(int i) {
        switch (i) {
            case 0:
                return (short) 75;
            case 1:
                return (short) 13;
            default:
                return (short) -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m80h(int i, int i2, int i3) {
        if (this.f135bf[i] > 0) {
            this.f119bK[i + 192] = 0;
            this.f119bK[i + 288] = this.f119bK[i + 224] * 3;
            this.f119bK[i + 352] = 0;
            int[] iArr = this.f135bf;
            iArr[i] = iArr[i] - 1;
            return;
        }
        if (i2 != this.f119bK[i3 + 384]) {
            if (i2 == 0) {
                m66d(i, i3);
                return;
            } else {
                m63c(i, i3, i2);
                return;
            }
        }
        this.f119bK[i3 + 386] = m60c(this.f119bK[i + 0], this.f119bK[i + 32]);
        if (this.f119bK[i3 + 400] == 0) {
            m78g(i, this.f111bC, this.f61aF);
        } else {
            m70e(i, i3);
        }
    }

    /* JADX INFO: renamed from: i */
    int m81i(int i, int i2, int i3) {
        return m75g(i2 - this.f119bK[i + 0], (i3 - this.f119bK[i + 32]) >> 5);
    }

    /* JADX INFO: renamed from: i */
    public short m82i(int i) {
        switch (i) {
            case 0:
                return (short) 14;
            case 1:
                return (short) 48;
            case 2:
                return (short) 24;
            default:
                return (short) -1;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m83i() {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("league", true);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() != 0) {
                recordStoreOpenRecordStore.deleteRecord(recordEnumerationEnumerateRecords.nextRecordId());
            }
            recordEnumerationEnumerateRecords.destroy();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(this.f130ba);
            dataOutputStream.writeInt(this.f33E);
            dataOutputStream.writeInt(this.f82aa);
            dataOutputStream.writeInt(this.f165l);
            dataOutputStream.writeBoolean(this.f114bF);
            dataOutputStream.writeInt(this.f35G);
            dataOutputStream.writeInt(this.f140bk);
            dataOutputStream.writeInt(this.f139bj);
            dataOutputStream.writeInt(this.f119bK[406]);
            dataOutputStream.writeInt(this.f119bK[407]);
            dataOutputStream.writeInt(this.f119bK[388]);
            dataOutputStream.writeInt(this.f119bK[389]);
            dataOutputStream.writeInt(this.f119bK[400]);
            dataOutputStream.writeInt(this.f119bK[401]);
            for (int i = 0; i < 8; i++) {
                dataOutputStream.writeInt(this.f119bK[i + 408]);
                dataOutputStream.writeInt(this.f119bK[i + 458]);
                dataOutputStream.writeInt(this.f119bK[i + 474]);
                dataOutputStream.writeInt(this.f119bK[(i << 1) + 0 + 442]);
                dataOutputStream.writeInt(this.f119bK[(i << 1) + 1 + 442]);
                dataOutputStream.writeInt(this.f57aB[i * 1]);
            }
            if (this.f33E > 0) {
                dataOutputStream.writeInt(this.f119bK[390]);
                dataOutputStream.writeInt(this.f119bK[391]);
                dataOutputStream.writeInt(this.f170q);
                dataOutputStream.writeInt(this.f43O);
                dataOutputStream.writeInt(this.f177x);
                dataOutputStream.writeInt(this.f96ao);
                dataOutputStream.writeInt(this.f158e);
                dataOutputStream.writeInt(this.f64aI);
                dataOutputStream.writeInt(this.f148bs);
                dataOutputStream.writeInt(this.f76aU);
                dataOutputStream.writeInt(this.f116bH);
                dataOutputStream.writeInt(this.f115bG);
                dataOutputStream.writeInt(this.f124bP);
                dataOutputStream.writeInt(this.f63aH);
                dataOutputStream.writeInt(this.f102au);
                dataOutputStream.writeInt(this.f101at);
                dataOutputStream.writeInt(this.f52X);
                dataOutputStream.writeInt(this.f81aZ);
                dataOutputStream.writeInt(this.f72aQ);
                dataOutputStream.writeInt(this.f98aq[0]);
                dataOutputStream.writeInt(this.f98aq[1]);
                dataOutputStream.writeInt(this.f95an[0]);
                dataOutputStream.writeInt(this.f95an[1]);
                dataOutputStream.writeInt(this.f121bM);
                dataOutputStream.writeInt(this.f68aM);
                dataOutputStream.writeInt(this.f32D);
                dataOutputStream.writeInt(this.f163j);
                dataOutputStream.writeInt(this.f169p);
                dataOutputStream.writeInt(this.f173t);
                dataOutputStream.writeInt(this.f71aP);
                dataOutputStream.writeInt(this.f119bK[384]);
                dataOutputStream.writeInt(this.f119bK[385]);
                dataOutputStream.writeInt(this.f119bK[392]);
                dataOutputStream.writeInt(this.f119bK[393]);
                dataOutputStream.writeInt(this.f119bK[394]);
                dataOutputStream.writeInt(this.f119bK[395]);
                dataOutputStream.writeInt(this.f164k);
                dataOutputStream.writeInt(this.f62aG);
                dataOutputStream.writeInt(this.f75aT);
                dataOutputStream.writeInt(this.f132bc);
                dataOutputStream.writeInt(this.f161h);
                for (int i2 = 0; i2 < 22; i2++) {
                    dataOutputStream.writeInt(this.f119bK[i2 + 0]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 32]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 64]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 96]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 128]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 160]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 192]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 224]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 256]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 288]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 320]);
                    dataOutputStream.writeInt(this.f119bK[i2 + 352]);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            recordStoreOpenRecordStore.addRecord(byteArray, 0, byteArray.length);
            byteArrayOutputStream.close();
            recordStoreOpenRecordStore.closeRecordStore();
            this.f113bE = 1;
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: j */
    public void m84j(int i) {
        this.f122bN = null;
    }

    /* JADX INFO: renamed from: k */
    public int m85k(int i) {
        switch (i) {
            case 0:
                return 5;
            case 1:
                return 6;
            case 2:
                return 7;
            case 3:
                return 8;
            case 4:
                return 0;
            case 5:
                return 4;
            case 6:
                return 1;
            case 7:
                return 2;
            case 8:
                return 3;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 29;
            case 30:
                return 30;
            case 31:
                return 31;
            case 32:
                return 32;
            case 33:
                return 33;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m86l() {
        int i;
        if (this.f64aI == 0) {
            m52a();
            m65d();
            return;
        }
        int i2 = this.f96ao;
        if (this.f76aU == 2) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= 2) {
                    break;
                }
                for (int i7 = 0; i7 < 11; i7++) {
                    int i8 = i3 + i7;
                    if (m67e(i8, this.f119bK[i8 + 64], this.f119bK[i8 + 96]) > 16) {
                        this.f119bK[i8 + 224] = m81i(i8, this.f119bK[i8 + 64], this.f119bK[i8 + 96]);
                        this.f119bK[i8 + 192] = 2;
                        m91q(i8);
                    } else {
                        this.f119bK[i8 + 0] = this.f119bK[i8 + 64];
                        this.f119bK[i8 + 32] = this.f119bK[i8 + 96];
                        this.f119bK[i8 + 192] = 0;
                        i4++;
                    }
                }
                i3 += 11;
                i5 = i6 + 1;
            }
            if (this.f96ao > 2560 || i4 >= 22) {
                this.f116bH = 4256;
                this.f115bG = 5664;
                this.f124bP = 0;
                this.f63aH = 0;
                this.f102au = 0;
                this.f101at = 0;
                this.f119bK[23] = this.f116bH;
                this.f119bK[55] = this.f115bG;
                this.f119bK[24] = this.f116bH;
                this.f119bK[56] = this.f115bG;
            }
            if (i4 < 22) {
                this.f158e = 128;
            } else {
                this.f96ao = 10240;
            }
            if (this.f119bK[400] == 0) {
                this.f119bK[22] = this.f119bK[this.f119bK[384] + 0];
                this.f119bK[54] = this.f119bK[this.f119bK[384] + 32];
            }
        }
        switch (this.f64aI) {
            case 1:
                this.f96ao += this.f158e;
                this.f158e += 18;
                if (this.f96ao >= 10240) {
                    this.f64aI = 2;
                    this.f158e = (-(this.f158e * 4)) / 10;
                    this.f96ao = 5120;
                }
                break;
            case 2:
                this.f64aI = 3;
                this.f158e = 28;
                switch (this.f148bs) {
                    case 0:
                    case 1:
                        m73f();
                        this.f70aO = (this.f116bH >> 5) - 120;
                        this.f69aN = (this.f115bG >> 5) - 160;
                        i = this.f96ao;
                        break;
                    case 2:
                        this.f153bx = true;
                        this.f158e = 0;
                        this.f64aI = 2;
                    default:
                        i = i2;
                        break;
                }
                i2 = i;
                break;
            case 3:
                this.f64aI = 0;
                break;
        }
        this.f119bK[58] = i2;
    }

    /* JADX INFO: renamed from: m */
    public void m87m(int i) {
        int i2 = this.f119bK[i + 192];
        if (i2 != 0) {
            int i3 = this.f119bK[i + 224];
            int i4 = i3 + i3;
            int i5 = this.f119bK[i + 0];
            int i6 = this.f119bK[i + 32];
            int i7 = i5 + (this.f159f[i4 + 138] * i2);
            int i8 = (i2 * this.f159f[i4 + 1 + 138]) + i6;
            int iMin = Math.min(Math.max(i7, 768), 7744);
            int iMin2 = Math.min(Math.max(i8, 1280), 10048);
            this.f119bK[i + 0] = iMin;
            this.f119bK[i + 32] = iMin2;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m88n() {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("single", false);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            byte[] bArrNextRecord = recordEnumerationEnumerateRecords.nextRecord();
            recordEnumerationEnumerateRecords.destroy();
            recordStoreOpenRecordStore.closeRecordStore();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrNextRecord);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            this.f119bK[406] = dataInputStream.readInt();
            this.f119bK[407] = dataInputStream.readInt();
            this.f119bK[400] = dataInputStream.readInt();
            this.f119bK[401] = dataInputStream.readInt();
            this.f119bK[388] = dataInputStream.readInt();
            this.f119bK[389] = dataInputStream.readInt();
            this.f165l = dataInputStream.readInt();
            this.f82aa = dataInputStream.readInt();
            this.f130ba = dataInputStream.readInt();
            this.f114bF = dataInputStream.readBoolean();
            this.f119bK[390] = dataInputStream.readInt();
            this.f119bK[391] = dataInputStream.readInt();
            this.f170q = dataInputStream.readInt();
            this.f43O = dataInputStream.readInt();
            this.f177x = dataInputStream.readInt();
            this.f96ao = dataInputStream.readInt();
            this.f158e = dataInputStream.readInt();
            this.f64aI = dataInputStream.readInt();
            this.f148bs = dataInputStream.readInt();
            this.f76aU = dataInputStream.readInt();
            this.f116bH = dataInputStream.readInt();
            this.f115bG = dataInputStream.readInt();
            this.f124bP = dataInputStream.readInt();
            this.f63aH = dataInputStream.readInt();
            this.f102au = dataInputStream.readInt();
            this.f101at = dataInputStream.readInt();
            this.f52X = dataInputStream.readInt();
            this.f81aZ = dataInputStream.readInt();
            this.f72aQ = dataInputStream.readInt();
            this.f98aq[0] = dataInputStream.readInt();
            this.f98aq[1] = dataInputStream.readInt();
            this.f95an[0] = dataInputStream.readInt();
            this.f95an[1] = dataInputStream.readInt();
            this.f121bM = dataInputStream.readInt();
            this.f68aM = dataInputStream.readInt();
            this.f32D = dataInputStream.readInt();
            this.f163j = dataInputStream.readInt();
            this.f169p = dataInputStream.readInt();
            this.f173t = dataInputStream.readInt();
            this.f71aP = dataInputStream.readInt();
            this.f119bK[384] = dataInputStream.readInt();
            this.f119bK[385] = dataInputStream.readInt();
            this.f119bK[392] = dataInputStream.readInt();
            this.f119bK[393] = dataInputStream.readInt();
            this.f119bK[394] = dataInputStream.readInt();
            this.f119bK[395] = dataInputStream.readInt();
            this.f164k = dataInputStream.readInt();
            this.f62aG = dataInputStream.readInt();
            this.f75aT = dataInputStream.readInt();
            this.f132bc = dataInputStream.readInt();
            this.f161h = dataInputStream.readInt();
            for (int i = 0; i < 22; i++) {
                this.f119bK[i + 0] = dataInputStream.readInt();
                this.f119bK[i + 32] = dataInputStream.readInt();
                this.f119bK[i + 64] = dataInputStream.readInt();
                this.f119bK[i + 96] = dataInputStream.readInt();
                this.f119bK[i + 128] = dataInputStream.readInt();
                this.f119bK[i + 160] = dataInputStream.readInt();
                this.f119bK[i + 192] = dataInputStream.readInt();
                this.f119bK[i + 224] = dataInputStream.readInt();
                this.f119bK[i + 256] = dataInputStream.readInt();
                this.f119bK[i + 288] = dataInputStream.readInt();
                this.f119bK[i + 320] = dataInputStream.readInt();
                this.f119bK[i + 352] = dataInputStream.readInt();
            }
            this.f106ay = 0;
            this.f56aA = 0;
            this.f155bz = 0;
            this.f60aE[0] = 0;
            this.f60aE[1] = 0;
            this.f61aF = 0;
            this.f111bC = 0;
            this.f59aD = 0;
            byteArrayInputStream.close();
            this.f103av = false;
        } catch (Exception e) {
            this.f103av = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public int[] m89n(int i) {
        if (i < 0 || i >= this.f30B) {
            return null;
        }
        int[] iArr = new int[this.f44P];
        iArr[0] = this.f55a[this.f44P * i];
        iArr[1] = this.f55a[(this.f44P * i) + 1];
        iArr[2] = this.f55a[(this.f44P * i) + 2];
        iArr[3] = this.f55a[(this.f44P * i) + 3];
        iArr[4] = this.f55a[(this.f44P * i) + 4];
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    public short m90o(int i) {
        switch (i) {
            case 0:
                return (short) 130;
            case 1:
                return (short) 129;
            default:
                return (short) -1;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m91q(int i) {
        m87m(i);
        if (this.f119bK[i + 192] != 0) {
            this.f119bK[i + 288] = this.f159f[this.f119bK[i + 352] + 154] + (this.f119bK[i + 224] * 3);
            this.f119bK[i + 352] = (this.f119bK[i + 352] + 1) & 3;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m92r() {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("single", true);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() != 0) {
                recordStoreOpenRecordStore.deleteRecord(recordEnumerationEnumerateRecords.nextRecordId());
            }
            recordEnumerationEnumerateRecords.destroy();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(this.f119bK[406]);
            dataOutputStream.writeInt(this.f119bK[407]);
            dataOutputStream.writeInt(this.f119bK[400]);
            dataOutputStream.writeInt(this.f119bK[401]);
            dataOutputStream.writeInt(this.f119bK[388]);
            dataOutputStream.writeInt(this.f119bK[389]);
            dataOutputStream.writeInt(this.f165l);
            dataOutputStream.writeInt(this.f82aa);
            dataOutputStream.writeInt(this.f130ba);
            dataOutputStream.writeBoolean(this.f114bF);
            dataOutputStream.writeInt(this.f119bK[390]);
            dataOutputStream.writeInt(this.f119bK[391]);
            dataOutputStream.writeInt(this.f170q);
            dataOutputStream.writeInt(this.f43O);
            dataOutputStream.writeInt(this.f177x);
            dataOutputStream.writeInt(this.f96ao);
            dataOutputStream.writeInt(this.f158e);
            dataOutputStream.writeInt(this.f64aI);
            dataOutputStream.writeInt(this.f148bs);
            dataOutputStream.writeInt(this.f76aU);
            dataOutputStream.writeInt(this.f116bH);
            dataOutputStream.writeInt(this.f115bG);
            dataOutputStream.writeInt(this.f124bP);
            dataOutputStream.writeInt(this.f63aH);
            dataOutputStream.writeInt(this.f102au);
            dataOutputStream.writeInt(this.f101at);
            dataOutputStream.writeInt(this.f52X);
            dataOutputStream.writeInt(this.f81aZ);
            dataOutputStream.writeInt(this.f72aQ);
            dataOutputStream.writeInt(this.f98aq[0]);
            dataOutputStream.writeInt(this.f98aq[1]);
            dataOutputStream.writeInt(this.f95an[0]);
            dataOutputStream.writeInt(this.f95an[1]);
            dataOutputStream.writeInt(this.f121bM);
            dataOutputStream.writeInt(this.f68aM);
            dataOutputStream.writeInt(this.f32D);
            dataOutputStream.writeInt(this.f163j);
            dataOutputStream.writeInt(this.f169p);
            dataOutputStream.writeInt(this.f173t);
            dataOutputStream.writeInt(this.f71aP);
            dataOutputStream.writeInt(this.f119bK[384]);
            dataOutputStream.writeInt(this.f119bK[385]);
            dataOutputStream.writeInt(this.f119bK[392]);
            dataOutputStream.writeInt(this.f119bK[393]);
            dataOutputStream.writeInt(this.f119bK[394]);
            dataOutputStream.writeInt(this.f119bK[395]);
            dataOutputStream.writeInt(this.f164k);
            dataOutputStream.writeInt(this.f62aG);
            dataOutputStream.writeInt(this.f75aT);
            dataOutputStream.writeInt(this.f132bc);
            dataOutputStream.writeInt(this.f161h);
            for (int i = 0; i < 22; i++) {
                dataOutputStream.writeInt(this.f119bK[i + 0]);
                dataOutputStream.writeInt(this.f119bK[i + 32]);
                dataOutputStream.writeInt(this.f119bK[i + 64]);
                dataOutputStream.writeInt(this.f119bK[i + 96]);
                dataOutputStream.writeInt(this.f119bK[i + 128]);
                dataOutputStream.writeInt(this.f119bK[i + 160]);
                dataOutputStream.writeInt(this.f119bK[i + 192]);
                dataOutputStream.writeInt(this.f119bK[i + 224]);
                dataOutputStream.writeInt(this.f119bK[i + 256]);
                dataOutputStream.writeInt(this.f119bK[i + 288]);
                dataOutputStream.writeInt(this.f119bK[i + 320]);
                dataOutputStream.writeInt(this.f119bK[i + 352]);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            recordStoreOpenRecordStore.addRecord(byteArray, 0, byteArray.length);
            byteArrayOutputStream.close();
            recordStoreOpenRecordStore.closeRecordStore();
            this.f77aV = 1;
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:173:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:180:0x0415  */
    /* JADX WARN: Code duplicated, block: B:181:0x041c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0420  */
    /* JADX WARN: Code duplicated, block: B:185:0x0424  */
    /* JADX WARN: Code duplicated, block: B:188:0x043b  */
    /* JADX WARN: Code duplicated, block: B:190:0x043f  */
    /* JADX WARN: Code duplicated, block: B:192:0x045a  */
    /* JADX WARN: Code duplicated, block: B:489:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:491:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:493:0x0be1  */
    /* JADX WARN: Code duplicated, block: B:495:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:498:0x0bf6  */
    /* JADX WARN: Code duplicated, block: B:501:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:522:0x0c68  */
    /* JADX WARN: Code duplicated, block: B:523:0x0c6b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:524:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:525:0x0c71  */
    /* JADX WARN: Code duplicated, block: B:526:0x0c75  */
    /* JADX WARN: Code duplicated, block: B:527:0x0c7c  */
    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        int i;
        int i2;
        int i3;
        boolean z;
        switch (this.f151bv) {
            case 0:
            case 9:
                if (this.f112bD == null) {
                    m42p(this.f85ad);
                    break;
                } else if (!this.f112bD.isAlive()) {
                    this.f112bD = null;
                    if (this.f33E <= 1) {
                        m42p(this.f85ad);
                        break;
                    } else {
                        switch (this.f33E) {
                            case 2:
                                m94w();
                                this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -6));
                                this.f112bD.setPriority(5);
                                this.f112bD.start();
                                this.f33E = 1;
                                break;
                            case 3:
                                this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -1));
                                this.f112bD.setPriority(5);
                                this.f112bD.start();
                                this.f33E = 2;
                                break;
                        }
                    }
                }
                break;
            case 1:
                this.f160g++;
                this.f34F = System.currentTimeMillis() - this.f90ai;
                this.f90ai = System.currentTimeMillis();
                if (!this.f153bx) {
                    this.f74aS = (int) this.f34F;
                    this.f56aA += this.f74aS;
                    this.f59aD = this.f111bC;
                    this.f111bC = m47x();
                    if (!this.f128bT.f237al) {
                        this.f128bT.f196Q = 0;
                        if ((this.f111bC & 4) == 0 && (this.f59aD & 4) != 0) {
                            this.f128bT.f237al = true;
                        }
                        if (this.f128bT.f237al) {
                            if (this.f56aA >= 100) {
                                this.f49U++;
                                this.f56aA = 0;
                            }
                            m50G();
                        } else if (this.f117bI) {
                            this.f83ab = 0;
                            this.f88ag = 0;
                            if (this.f64aI == 0 && this.f43O == 0) {
                                this.f170q += this.f74aS * this.f82aa;
                            }
                            if (this.f119bK[400] == 0) {
                                if ((this.f111bC & 8) == 0) {
                                    this.f61aF = this.f155bz;
                                    if (this.f61aF > 0 && this.f61aF < 70) {
                                        this.f61aF = 70;
                                    }
                                    this.f155bz = 0;
                                } else if (this.f155bz != 0 || (this.f59aD & 8) == 0) {
                                    this.f155bz += 30;
                                    if (this.f155bz > 220) {
                                        this.f61aF = 220;
                                        this.f155bz = 0;
                                    }
                                }
                            }
                            this.f49U++;
                            this.f56aA = 0;
                            m86l();
                            m50G();
                            if (this.f170q >= 5400000) {
                                if (this.f64aI == 0) {
                                    m69e(3);
                                    this.f148bs = 2;
                                    this.f64aI = 1;
                                    this.f96ao = -512;
                                    this.f158e = 32;
                                    this.f76aU = 0;
                                }
                                this.f170q = 5400000;
                            }
                            if (this.f177x == 0 && this.f170q >= 2700000) {
                                m69e(3);
                                this.f148bs = 1;
                                this.f64aI = 1;
                                this.f96ao = -512;
                                this.f158e = 32;
                                this.f76aU = 1;
                                this.f177x = 1;
                                this.f170q = 2700000;
                            }
                        }
                    } else if (this.f128bT.f219aM != 0) {
                        this.f128bT.f219aM--;
                    } else if (this.f100as == 0) {
                        switch (this.f128bT.f196Q) {
                            case 0:
                                if ((this.f111bC & 4) != 0 || (this.f59aD & 4) == 0) {
                                    if ((this.f111bC & 8) == 0 && (this.f59aD & 8) != 0) {
                                        this.f90ai = System.currentTimeMillis();
                                        this.f34F = System.currentTimeMillis() - this.f90ai;
                                        this.f74aS = (int) this.f34F;
                                        this.f56aA = this.f74aS;
                                        this.f128bT.f237al = false;
                                        this.f111bC = 0;
                                        this.f59aD = 0;
                                        this.f155bz = 0;
                                        this.f61aF = 0;
                                        this.f29A = 0;
                                        this.f178y = 0;
                                    } else if ((this.f111bC & 16) != 0) {
                                        m43q();
                                        this.f128bT.f196Q = 3;
                                    }
                                } else if (this.f78aW) {
                                    m24F();
                                    this.f128bT.f196Q = 4;
                                } else {
                                    if (this.f106ay == 0) {
                                        m92r();
                                    } else if (this.f106ay == 1) {
                                        m83i();
                                    }
                                    this.f128bT.f237al = false;
                                    this.f128bT.f196Q = 0;
                                    this.f87af = 1;
                                    this.f85ad = 3;
                                    m22C();
                                    m42p(9);
                                }
                                break;
                            case 3:
                                if ((this.f111bC & 32) == 0 && (this.f59aD & 32) != 0) {
                                    this.f142bm--;
                                    if (this.f142bm < 1) {
                                        this.f142bm = 1;
                                    }
                                    break;
                                } else if ((this.f111bC & 64) == 0 && (this.f59aD & 64) != 0) {
                                    this.f142bm++;
                                    if (this.f142bm > 4) {
                                        this.f142bm = 4;
                                    }
                                    break;
                                } else if ((this.f111bC & 4) == 0 && (this.f59aD & 4) != 0) {
                                    Thread thread = new Thread(new RunnableC0001b(this, this.f128bT, -4));
                                    thread.setPriority(5);
                                    thread.start();
                                    m46v();
                                    this.f128bT.f196Q = 0;
                                    break;
                                } else if ((this.f111bC & 8) == 0 && (this.f59aD & 8) != 0) {
                                    switch (this.f142bm - 1) {
                                        case 0:
                                            this.f31C = (this.f31C + 1) % 4;
                                            m43q();
                                            this.f142bm = 1;
                                            break;
                                        case 1:
                                            this.f162i = (this.f162i + 1) % 2;
                                            m43q();
                                            this.f142bm = 2;
                                            break;
                                        case 2:
                                            this.f154by = (this.f154by + 1) % 2;
                                            m43q();
                                            this.f142bm = 3;
                                            break;
                                        case 3:
                                            this.f91aj = (this.f91aj + 1) % 3;
                                            m43q();
                                            this.f142bm = 4;
                                            break;
                                    }
                                }
                                break;
                            case 4:
                                if ((this.f111bC & 8) != 0) {
                                    this.f147br.m8b();
                                    this.f128bT.f237al = false;
                                    this.f128bT.f196Q = 0;
                                    this.f87af = 1;
                                    this.f85ad = 3;
                                    m22C();
                                    m42p(this.f161h);
                                } else if ((this.f111bC & 4) == 0 && (this.f59aD & 4) != 0) {
                                    m46v();
                                    this.f128bT.f196Q = 0;
                                }
                                break;
                        }
                    }
                    if (!this.f78aW || this.f153bx) {
                        if (this.f153bx) {
                            if (this.f78aW) {
                                if (this.f114bF) {
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                                i2 = this.f119bK[i + 390];
                                i3 = this.f119bK[(1 - i) + 390];
                                if (i2 > i3) {
                                    m34d(1, 0, 0);
                                } else if (i2 == i3) {
                                    m34d(0, 0, 1);
                                } else {
                                    m34d(0, 1, 0);
                                }
                                m49E();
                                this.f87af = 1;
                                this.f85ad = 2;
                                m22C();
                                this.f33E = 0;
                                m31b();
                                if (this.f117bI) {
                                    m42p(44);
                                } else {
                                    m42p(37);
                                }
                            } else {
                                this.f87af = 1;
                                this.f85ad = 2;
                                m22C();
                                this.f33E = 0;
                                m31b();
                                m42p(23);
                            }
                        }
                    } else if ((this.f147br.f10e & 512) == 0) {
                        m42p(33);
                    } else {
                        if (this.f117bI) {
                            byte[] bArrM6a = this.f147br.m6a(m44t());
                            if (bArrM6a == null) {
                                m22C();
                                m42p(33);
                            } else {
                                m29a(bArrM6a);
                            }
                        } else {
                            if ((this.f111bC & 8) == 0) {
                                this.f61aF = this.f155bz;
                                if (this.f61aF > 0 && this.f61aF < 90) {
                                    this.f61aF = 90;
                                }
                                this.f155bz = 0;
                            } else if (this.f155bz != 0 || (this.f59aD & 8) == 0) {
                                this.f155bz += 70;
                                if (this.f155bz > 200) {
                                    this.f61aF = 200;
                                    this.f155bz = 0;
                                }
                            }
                            byte[] bArrM6a2 = this.f147br.m6a(m45u());
                            if (bArrM6a2 == null) {
                                m22C();
                                m42p(33);
                            } else {
                                m32b(bArrM6a2);
                            }
                        }
                        if (this.f153bx) {
                            if (this.f78aW) {
                                if (this.f114bF) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                i2 = this.f119bK[i + 390];
                                i3 = this.f119bK[(1 - i) + 390];
                                if (i2 > i3) {
                                    m34d(1, 0, 0);
                                } else if (i2 == i3) {
                                    m34d(0, 0, 1);
                                } else {
                                    m34d(0, 1, 0);
                                }
                                m49E();
                                this.f87af = 1;
                                this.f85ad = 2;
                                m22C();
                                this.f33E = 0;
                                m31b();
                                if (this.f117bI) {
                                    m42p(44);
                                } else {
                                    m42p(37);
                                }
                            } else {
                                this.f87af = 1;
                                this.f85ad = 2;
                                m22C();
                                this.f33E = 0;
                                m31b();
                                m42p(23);
                            }
                        }
                    }
                } else if (this.f153bx) {
                    if (this.f78aW) {
                        if (this.f114bF) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        i2 = this.f119bK[i + 390];
                        i3 = this.f119bK[(1 - i) + 390];
                        if (i2 > i3) {
                            m34d(1, 0, 0);
                        } else if (i2 == i3) {
                            m34d(0, 0, 1);
                        } else {
                            m34d(0, 1, 0);
                        }
                        m49E();
                        this.f87af = 1;
                        this.f85ad = 2;
                        m22C();
                        this.f33E = 0;
                        m31b();
                        if (this.f117bI) {
                            m42p(44);
                        } else {
                            m42p(37);
                        }
                    } else {
                        this.f87af = 1;
                        this.f85ad = 2;
                        m22C();
                        this.f33E = 0;
                        m31b();
                        m42p(23);
                    }
                }
                break;
            case 2:
                if (System.currentTimeMillis() > this.f143bn || this.f128bT.f231af != 0) {
                    this.f128bT.f231af = 0;
                    m42p(3);
                }
                break;
            case 3:
                switch ((this.f77aV | this.f113bE) > 0 ? m33c(0, 4, -1, 5) : m33c(-1, 3, -1, 5)) {
                    case 0:
                        m42p(24);
                        break;
                    case 1:
                        m42p(4);
                        break;
                    case 2:
                        m42p(5);
                        break;
                    case 3:
                        m42p(6);
                        break;
                    case 4:
                        m42p(25);
                        break;
                    case 5:
                        C0000a.f1b.m0a();
                        break;
                }
                break;
            case 4:
                switch (m33c(1, 3, -1, 3)) {
                    case 0:
                        m35h();
                        if (this.f77aV > 0) {
                            m42p(45);
                        } else {
                            m42p(10);
                        }
                        break;
                    case 1:
                        m35h();
                        if (this.f113bE > 0) {
                            m42p(16);
                        } else {
                            m42p(13);
                        }
                        break;
                    case 2:
                        m35h();
                        m42p(29);
                        break;
                    case 3:
                        m42p(3);
                        break;
                }
                break;
            case 5:
                switch (m33c(1, 6, -1, 6)) {
                    case 0:
                        this.f31C = (this.f31C + 1) % 4;
                        m42p(5);
                        this.f142bm = 1;
                        break;
                    case 1:
                        this.f162i = (this.f162i + 1) % 2;
                        m42p(5);
                        this.f142bm = 2;
                        break;
                    case 2:
                        this.f165l = (this.f165l + 1) % 3;
                        m42p(5);
                        this.f142bm = 3;
                        break;
                    case 3:
                        this.f154by = (this.f154by + 1) % 2;
                        m42p(5);
                        this.f142bm = 4;
                        break;
                    case 4:
                        this.f91aj = (this.f91aj + 1) % 3;
                        m42p(5);
                        this.f142bm = 5;
                        break;
                    case 5:
                        this.f133bd = (this.f133bd + 1) % 3;
                        m42p(5);
                        this.f142bm = 6;
                        break;
                    case 6:
                        Thread thread2 = new Thread(new RunnableC0001b(this, this.f128bT, -4));
                        thread2.setPriority(5);
                        thread2.start();
                        m42p(3);
                        break;
                }
                break;
            case 6:
                if (this.f128bT.f206a) {
                    switch (m33c(0, this.f128bT.m149f() - this.f128bT.m153h(165), -2, -3)) {
                        case -3:
                            m42p(3);
                            break;
                        case -2:
                            if (this.f128bT.f250ay) {
                                this.f128bT.f206a = true;
                            }
                            break;
                    }
                }
                break;
            case 8:
                this.f161h = 9;
                this.f85ad = 1;
                m42p(0);
                break;
            case 10:
                switch (m33c(1, 3, -1, 3)) {
                    case 0:
                        this.f161h = 9;
                        this.f85ad = 1;
                        this.f84ac = 26;
                        this.f39K = 10;
                        this.f119bK[388] = this.f131bb;
                        m42p(12);
                        break;
                    case 1:
                        this.f150bu = 0;
                        this.f39K = 10;
                        this.f85ad = 10;
                        m42p(28);
                        break;
                    case 2:
                        this.f150bu = 1;
                        this.f39K = 10;
                        this.f85ad = 10;
                        m42p(27);
                        break;
                    case 3:
                        m42p(4);
                        break;
                }
                break;
            case 11:
                if (this.f78aW && (this.f147br.f10e & 512) == 0) {
                    m42p(33);
                } else {
                    this.f104aw = m33c(1, this.f128bT.m158m() - 1, -1, -2);
                    if (this.f142bm - 1 >= 0 && this.f47S != this.f142bm) {
                        this.f128bT.m126a(m71f(this.f142bm - 1), true);
                    }
                    if (this.f104aw == -2) {
                        m42p(this.f39K);
                    } else if (this.f104aw > -1) {
                        if (!this.f78aW) {
                            this.f119bK[this.f150bu + 406] = m71f(this.f104aw);
                        }
                        m42p(this.f85ad);
                        if (this.f78aW) {
                            if (this.f117bI) {
                                this.f119bK[406] = this.f104aw;
                            } else {
                                this.f119bK[407] = this.f104aw;
                            }
                            m30a(34, (byte) this.f104aw);
                            m42p(this.f85ad);
                            this.f147br.f24t = 0;
                        }
                    }
                }
                break;
            case 12:
                if (this.f78aW && (this.f147br.f10e & 512) == 0) {
                    m42p(33);
                } else {
                    int iM33c = m33c(1, 3, -2, -3);
                    this.f119bK[388] = (this.f142bm - 1) % 3;
                    if (iM33c == -3) {
                        m42p(this.f39K);
                        z = true;
                    } else if (iM33c == -2) {
                        this.f66aK = 12;
                        m42p(this.f84ac);
                        if (this.f78aW && !this.f117bI) {
                            this.f119bK[389] = this.f142bm % 3;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (this.f39K == 10) {
                            this.f131bb = this.f119bK[388];
                        } else {
                            this.f46R = this.f119bK[388];
                        }
                        Thread thread3 = new Thread(new RunnableC0001b(this, this.f128bT, -4));
                        thread3.setPriority(5);
                        thread3.start();
                    }
                }
                break;
            case 13:
                switch (m33c(1, 2, -1, 2)) {
                    case 0:
                        for (int i4 = 1; i4 < 34; i4++) {
                            this.f119bK[i4 + 408] = -1;
                        }
                        this.f119bK[408] = this.f119bK[406];
                        this.f65aJ = 0;
                        for (int i5 = 0; i5 < 34; i5++) {
                            if (i5 < 8) {
                                this.f119bK[(i5 * 2) + 0 + 442] = 0;
                                this.f119bK[(i5 * 2) + 1 + 442] = 0;
                                this.f57aB[i5 * 1] = 0;
                            }
                            if (i5 != this.f119bK[406]) {
                                int iNextInt = ((this.f36H.nextInt() & Integer.MAX_VALUE) % 33) + 1;
                                while (this.f119bK[iNextInt + 408] != -1) {
                                    iNextInt = (iNextInt + 1) % 34;
                                }
                                this.f119bK[iNextInt + 408] = i5;
                            }
                        }
                        this.f35G = -1;
                        this.f114bF = false;
                        this.f82aa = this.f53Y[this.f133bd];
                        this.f106ay = 1;
                        this.f119bK[407] = this.f119bK[409];
                        this.f109bA = 13;
                        m42p(15);
                        this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -2));
                        this.f112bD.setPriority(5);
                        this.f112bD.start();
                        break;
                    case 1:
                        this.f150bu = 0;
                        this.f85ad = 13;
                        this.f39K = 13;
                        this.f119bK[407] = 34;
                        m42p(11);
                        break;
                    case 2:
                        m42p(4);
                        break;
                }
                break;
            case 15:
                switch (m33c(1, 0, 0, 1)) {
                    case 0:
                        this.f161h = this.f35G == -1 ? 9 : 17;
                        this.f85ad = 1;
                        this.f84ac = 26;
                        this.f39K = 15;
                        this.f119bK[388] = this.f46R;
                        m42p(12);
                        break;
                    case 1:
                        m42p(this.f109bA);
                        break;
                }
                break;
            case 16:
                switch (m33c(1, 0, 1, 0)) {
                    case 0:
                        m42p(3);
                        break;
                    case 1:
                        this.f113bE = 0;
                        m40o();
                        m42p(13);
                        break;
                }
                break;
            case 17:
                switch (m33c(1, 0, 0, 1)) {
                    case 0:
                        m42p(18);
                        break;
                    case 1:
                        this.f87af = 1;
                        this.f85ad = 4;
                        m42p(9);
                        break;
                }
                break;
            case 18:
            case 19:
                switch (m33c(0, 7, 0, 1)) {
                    case 0:
                        if (this.f35G == 6) {
                            this.f139bj = 0;
                            while (this.f119bK[this.f119bK[this.f139bj + 474] + 408] != this.f119bK[406]) {
                                this.f139bj++;
                            }
                            this.f38J = m26a(this.f139bj + 1, this.f119bK[442], this.f119bK[443], this.f57aB[0], this.f119bK[406]);
                            m49E();
                            m40o();
                            m42p(20);
                        } else {
                            this.f109bA = 18;
                            m42p(15);
                        }
                        break;
                    case 1:
                        m42p(3);
                        break;
                }
                break;
            case 20:
                if (this.f128bT.f206a) {
                    this.f128bT.f206a = false;
                    if (this.f38J != -1) {
                        Thread thread4 = new Thread(new RunnableC0001b(this, this.f128bT, -4));
                        thread4.setPriority(5);
                        thread4.start();
                        m42p(43);
                    } else {
                        this.f87af = 1;
                        this.f85ad = 2;
                        m42p(9);
                    }
                }
                break;
            case 21:
                if (!this.f112bD.isAlive()) {
                    this.f112bD = null;
                    if (!this.f103av) {
                        if (this.f33E <= 1) {
                            this.f113bE = 1;
                            m42p(this.f85ad);
                            break;
                        } else {
                            switch (this.f33E) {
                                case 2:
                                    m94w();
                                    this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -3));
                                    this.f112bD.setPriority(5);
                                    this.f112bD.start();
                                    this.f161h = this.f35G == -1 ? 9 : 17;
                                    this.f85ad = 1;
                                    break;
                                case 3:
                                    this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -1));
                                    this.f112bD.setPriority(5);
                                    this.f112bD.start();
                                    this.f33E = 2;
                                    break;
                            }
                        }
                    } else {
                        this.f113bE = 0;
                        m42p(22);
                        break;
                    }
                }
                break;
            case 22:
                if (this.f128bT.f206a) {
                    this.f128bT.f206a = false;
                    this.f87af = 1;
                    this.f85ad = 2;
                    m42p(9);
                }
                break;
            case 23:
            case 37:
                switch (m33c(1, 0, 0, 1)) {
                    case 0:
                        if (this.f106ay == 1) {
                            m42p(17);
                        }
                        break;
                    case 1:
                        this.f87af = 1;
                        this.f85ad = 3;
                        m42p(9);
                        if (this.f78aW) {
                            this.f147br.m8b();
                        }
                        break;
                }
                break;
            case 24:
                switch (m33c(1, this.f128bT.m158m() - 1, -1, 2)) {
                    case 0:
                        if (this.f77aV == 0) {
                            this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -3));
                            this.f112bD.setPriority(5);
                            this.f112bD.start();
                            this.f85ad = 15;
                            this.f109bA = 18;
                            m42p(21);
                        } else {
                            this.f161h = 9;
                            this.f85ad = 1;
                            this.f33E = 3;
                            m42p(0);
                        }
                        break;
                    case 1:
                        this.f112bD = new Thread(new RunnableC0001b(this, this.f128bT, -3));
                        this.f112bD.setPriority(5);
                        this.f112bD.start();
                        this.f85ad = 15;
                        this.f109bA = 18;
                        m42p(21);
                        break;
                    case 2:
                        m42p(3);
                        break;
                }
                break;
            case 25:
                switch (m33c(1, 2, -1, 2)) {
                    case 0:
                        m42p(39);
                        break;
                    case 1:
                        m42p(41);
                        break;
                    case 2:
                        m42p(3);
                        break;
                }
                break;
            case 26:
                if (this.f78aW && m30a(26, (byte) -1)) {
                    m30a(26, (byte) 1);
                    this.f161h = 9;
                    this.f85ad = 1;
                    m42p(0);
                }
                switch (m33c(1, 0, 0, 1)) {
                    case 0:
                        if (this.f78aW) {
                            m30a(26, (byte) 1);
                        } else {
                            this.f161h = 9;
                            this.f85ad = 1;
                            m42p(0);
                        }
                        break;
                    case 1:
                        if (this.f78aW) {
                            m42p(33);
                        } else {
                            m42p(this.f66aK);
                        }
                        break;
                }
                break;
            case 27:
            case 28:
                this.f104aw = m33c(1, this.f128bT.m158m() - 1, -1, -2);
                if (this.f142bm - 1 >= 0) {
                    this.f128bT.m126a(m71f(this.f142bm - 1), true);
                }
                if (this.f104aw == -2) {
                    m42p(this.f39K);
                } else if (this.f104aw > -1) {
                    if (!this.f78aW) {
                        this.f119bK[this.f150bu + 406] = m71f(this.f104aw);
                    }
                    m42p(this.f85ad);
                    if (this.f78aW) {
                        if (this.f117bI) {
                            this.f119bK[406] = this.f104aw;
                        } else {
                            this.f119bK[407] = this.f104aw;
                        }
                        m30a(34, (byte) this.f104aw);
                        m42p(this.f85ad);
                        this.f147br.f24t = 0;
                    }
                }
                break;
            case 29:
                switch (m33c(1, 2, -1, 2)) {
                    case 0:
                        m42p(31);
                        break;
                    case 1:
                        m42p(30);
                        break;
                    case 2:
                        m42p(4);
                        break;
                }
                break;
            case 30:
                if (this.f125bQ && this.f147br.f10e == 0) {
                    m42p(32);
                    this.f125bQ = false;
                } else {
                    switch (m33c(0, 0, -2, 0)) {
                        case 0:
                            this.f147br.m8b();
                            this.f125bQ = false;
                            this.f78aW = false;
                            m42p(29);
                    }
                }
                break;
            case 31:
                if ((this.f147br.f10e & 512) != 0) {
                    this.f85ad = 34;
                    this.f39K = 33;
                    m42p(11);
                } else if (this.f147br.f10e == 0) {
                    m42p(46);
                    this.f147br = null;
                    this.f92ak = 1;
                } else {
                    switch (m33c(0, 0, -2, 0)) {
                        case 0:
                            this.f147br.m8b();
                            m42p(29);
                            this.f78aW = false;
                    }
                }
                break;
            case 32:
                switch (m33c(1, this.f128bT.m158m() - 1, 0, 1)) {
                    case 0:
                        if (!this.f93al) {
                            m42p(30);
                        } else if (this.f147br.m4a(false, this.f147br.m7b(this.f142bm - 1))) {
                            m42p(42);
                            this.f117bI = false;
                            this.f147br.m13f();
                            this.f147br.m2a(10000);
                        } else {
                            m42p(33);
                        }
                        break;
                    case 1:
                        m42p(29);
                        break;
                }
                break;
            case 33:
                switch (m33c(1, 2, -1, 0)) {
                    case 0:
                        m42p(4);
                        break;
                }
                break;
            case 34:
                if (m30a(34, (byte) -1)) {
                    m30a(34, (byte) this.f104aw);
                    m42p(36);
                } else {
                    switch (m33c(0, 0, -2, 0)) {
                        case 0:
                            m42p(33);
                    }
                }
                break;
            case 35:
                if (!m30a(35, (byte) -1)) {
                    switch (m33c(0, 0, -2, 0)) {
                        case -2:
                            this.f85ad = 1;
                            this.f66aK = 33;
                            if (!this.f78aW) {
                                m42p(26);
                            }
                            break;
                        case 0:
                            m42p(33);
                            break;
                    }
                } else {
                    m30a(35, (byte) (this.f142bm % 3));
                    this.f82aa = this.f53Y[this.f133bd];
                    this.f106ay = 2;
                    m42p(26);
                    this.f85ad = 1;
                    this.f66aK = 33;
                    break;
                }
                break;
            case 36:
                if ((this.f147br.f10e & 512) == 512) {
                    switch (m33c(1, 0, 0, 1)) {
                        case 0:
                            this.f161h = this.f35G == -1 ? 9 : 17;
                            this.f85ad = 1;
                            this.f84ac = 35;
                            this.f39K = 36;
                            this.f119bK[388] = this.f46R;
                            m42p(12);
                            break;
                        case 1:
                            m42p(33);
                            break;
                    }
                } else {
                    m42p(33);
                    break;
                }
                break;
            case 38:
                switch (m33c(1, 1, 0, 1)) {
                    case 0:
                        this.f39K = 33;
                        this.f85ad = 34;
                        m42p(11);
                        break;
                    case 1:
                        m42p(3);
                        break;
                }
                break;
            case 39:
                this.f104aw = m33c(1, this.f30B, -1, 2);
                if (this.f142bm - 1 >= 0 && this.f47S != this.f142bm) {
                    m23D();
                }
                if (this.f104aw == 2) {
                    m42p(25);
                }
                break;
            case 41:
                switch (m33c(0, 0, -2, 2)) {
                    case 2:
                        m42p(25);
                        break;
                }
                break;
            case 42:
                if ((this.f147br.f10e & 512) != 0) {
                    this.f85ad = 34;
                    m42p(11);
                    this.f39K = 33;
                } else if (this.f147br.m3a()) {
                    m42p(33);
                } else if (this.f147br.f10e == 0) {
                    if (this.f147br.f15j == 0) {
                        m42p(46);
                        this.f92ak = 4;
                    } else {
                        m42p(33);
                    }
                    this.f147br = null;
                }
                switch (m33c(1, 1, -2, 0)) {
                    case 0:
                        this.f147br.m8b();
                        m42p(29);
                        break;
                }
                break;
            case 43:
                if (this.f128bT.f206a) {
                    this.f128bT.f206a = false;
                    this.f87af = 1;
                    this.f85ad = 39;
                    m42p(9);
                }
                break;
            case 44:
                byte[] bArrM6a3 = this.f147br.m6a(m44t());
                if (bArrM6a3 == null) {
                    m42p(37);
                } else {
                    m29a(bArrM6a3);
                }
                if (this.f58aC) {
                    m42p(37);
                }
                break;
            case 45:
                switch (m33c(1, 0, 0, 1)) {
                    case 0:
                        m42p(10);
                        break;
                    case 1:
                        m42p(3);
                        break;
                }
                break;
            case 46:
                switch (m33c(1, 2, -1, 0)) {
                    case 0:
                        m42p(4);
                        break;
                }
                break;
        }
        this.f128bT.repaint();
        this.f128bT.serviceRepaints();
        if (this.f43O != 0) {
            if (this.f117bI) {
                if (this.f98aq[0] == 1) {
                    this.f98aq[0] = 0;
                }
            } else if (this.f98aq[1] == 1) {
                this.f98aq[1] = 0;
            }
        }
        this.f47S = this.f142bm;
        if (this.f54Z) {
            C0000a.f1b.m0a();
        }
        System.gc();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7 A[PHI: r1
  0x00a7: PHI (r1v11 int) = (r1v9 int), (r1v9 int), (r1v21 int), (r1v21 int) binds: [B:28:0x0096, B:31:0x009e, B:18:0x0055, B:25:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: s */
    public void m93s() {
        int i;
        int i2;
        int i3;
        for (int i4 = 0; i4 < 22; i4++) {
            int i5 = i4 / 11;
            int i6 = i4 % 11;
            int i7 = this.f119bK[i5 + 388];
            this.f119bK[i5 + 394] = 0;
            if (this.f64aI == 0 || this.f148bs != 0) {
                i = this.f130ba;
                if (this.f170q >= 2700000) {
                    i ^= 1;
                }
            } else {
                i = this.f163j ^ 1;
            }
            int i8 = this.f159f[(((i7 * 11) + i6) * 3) + 0] + 24;
            if ((i5 != 0 || this.f170q >= 2700000) && (i5 == 0 || this.f170q < 2700000)) {
                i2 = (137 - this.f159f[((((i7 * 11) + i6) * 3) + 0) + 1]) + 40;
                if (i5 != i) {
                    i3 = i2;
                } else if (i6 == 9) {
                    i3 = 175;
                    i8 = 133;
                } else if (i6 == 10) {
                    i3 = 177;
                    i8 = 153;
                } else {
                    i3 = i2;
                }
            } else {
                i2 = this.f159f[(((i7 * 11) + i6) * 3) + 0 + 1] + 40 + 137;
                if (i5 != i) {
                    i3 = i2;
                } else if (i6 == 9) {
                    i3 = 179;
                    i8 = 133;
                } else if (i6 == 10) {
                    i3 = 177;
                    i8 = 113;
                } else {
                    i3 = i2;
                }
            }
            this.f119bK[i4 + 64] = i8 << 5;
            this.f119bK[i4 + 96] = i3 << 5;
            this.f135bf[i4] = 0;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m94w() {
        int i;
        int i2;
        this.f41M[0] = 0;
        this.f41M[1] = 0;
        this.f67aL = -1;
        this.f146bq = 0;
        this.f111bC = 0;
        this.f59aD = 0;
        this.f177x = 0;
        this.f153bx = false;
        this.f64aI = 0;
        this.f88ag = 0;
        this.f170q = 0;
        this.f90ai = System.currentTimeMillis();
        long[] jArr = this.f175v;
        long[] jArr2 = this.f175v;
        long j = this.f90ai;
        jArr2[1] = j;
        jArr[0] = j;
        if (this.f114bF) {
            i = this.f119bK[407];
            i2 = this.f119bK[406];
        } else {
            i = this.f119bK[406];
            i2 = this.f119bK[407];
        }
        int i3 = this.f138bi[i] - this.f138bi[i2];
        if (this.f119bK[400] == 0) {
            this.f119bK[396] = this.f159f[(this.f165l * 9) + 0 + 158] + (i3 * 2);
            this.f119bK[398] = this.f159f[(this.f165l * 9) + 1 + 158] + (i3 * 2);
            this.f119bK[397] = this.f159f[((this.f165l * 9) + 2) + 158] - (i3 * 3);
            this.f119bK[399] = this.f159f[((this.f165l * 9) + 3) + 158] - (i3 * 3);
            this.f127bS = this.f159f[((this.f165l * 9) + 4) + 158] - (i3 * 3);
            if (this.f127bS < 2) {
                this.f127bS = 2;
            }
            this.f126bR = this.f159f[(this.f165l * 9) + 5 + 158] + (i3 * 50);
            this.f179z = this.f159f[((this.f165l * 9) + 6) + 158] - (i3 * 3);
            this.f156c = this.f159f[((this.f165l * 9) + 7) + 158] - (i3 * 3);
            this.f167n = this.f159f[((this.f165l * 9) + 8) + 158] - (i3 / 2);
            if (this.f167n < 2) {
                this.f167n = 2;
            }
        } else {
            this.f119bK[396] = this.f159f[168];
            this.f119bK[398] = this.f159f[169];
            this.f119bK[397] = this.f159f[168];
            this.f119bK[399] = this.f159f[169];
            this.f127bS = this.f159f[180];
            this.f126bR = this.f159f[181];
            this.f179z = this.f159f[182];
            this.f156c = this.f159f[183];
            this.f167n = this.f159f[184];
        }
        if (this.f134be != 2) {
            this.f130ba = this.f36H.nextInt() & 1;
        }
        this.f173t = this.f130ba;
        this.f71aP = this.f130ba;
        this.f119bK[392] = -1;
        this.f119bK[393] = -1;
        this.f119bK[400] = 0;
        if (this.f78aW) {
            this.f119bK[401] = 0;
        } else {
            this.f119bK[401] = 1;
        }
        m62c();
        m48A();
        this.f70aO = (this.f119bK[23] >> 5) - 120;
        this.f69aN = (this.f119bK[55] >> 5) - 160;
        if (this.f134be == 2) {
            this.f134be = 0;
        }
        if (!this.f114bF) {
            m86l();
        }
        this.f100as = 0;
    }

    /* JADX INFO: renamed from: y */
    public void m95y() {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("single", false);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            byte[] bArrNextRecord = recordEnumerationEnumerateRecords.nextRecord();
            recordEnumerationEnumerateRecords.destroy();
            recordStoreOpenRecordStore.closeRecordStore();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrNextRecord);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            this.f119bK[406] = dataInputStream.readInt();
            this.f119bK[407] = dataInputStream.readInt();
            this.f119bK[400] = dataInputStream.readInt();
            this.f119bK[401] = dataInputStream.readInt();
            this.f119bK[388] = dataInputStream.readInt();
            this.f119bK[389] = dataInputStream.readInt();
            this.f165l = dataInputStream.readInt();
            this.f82aa = dataInputStream.readInt();
            this.f130ba = dataInputStream.readInt();
            this.f114bF = dataInputStream.readBoolean();
            this.f106ay = 0;
            byteArrayInputStream.close();
            this.f103av = false;
        } catch (Exception e) {
            this.f103av = true;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m96z() {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("options", false);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            byte[] bArrNextRecord = recordEnumerationEnumerateRecords.nextRecord();
            recordEnumerationEnumerateRecords.destroy();
            recordStoreOpenRecordStore.closeRecordStore();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrNextRecord);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            this.f51W = dataInputStream.readBoolean();
            this.f31C = dataInputStream.readInt();
            this.f131bb = dataInputStream.readInt();
            this.f46R = dataInputStream.readInt();
            this.f165l = dataInputStream.readInt();
            this.f162i = dataInputStream.readInt();
            this.f154by = dataInputStream.readInt();
            this.f91aj = dataInputStream.readInt();
            this.f133bd = dataInputStream.readInt();
            for (int i = 0; i < (this.f30B * this.f44P) + 3; i++) {
                this.f55a[i] = dataInputStream.readInt();
            }
            byteArrayInputStream.close();
            this.f103av = false;
        } catch (Exception e) {
            this.f51W = true;
            this.f31C = 0;
            this.f131bb = 0;
            this.f46R = 0;
            this.f165l = 1;
            this.f162i = 1;
            this.f154by = 0;
            this.f91aj = 1;
            this.f133bd = 1;
            this.f103av = true;
        }
    }
}
