package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.m3g.Appearance;

/* JADX INFO: renamed from: bh */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0019bh extends C0033j {

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static long[][] f422Code;

    /* JADX INFO: renamed from: f */
    public static int f74f;

    /* JADX INFO: renamed from: j */
    public static int f75j;

    /* JADX INFO: renamed from: B */
    public int f76B;

    /* JADX INFO: renamed from: B */
    private boolean f77B;

    /* JADX INFO: renamed from: B */
    private int[] f78B;

    /* JADX INFO: renamed from: B */
    public long[] f79B;

    /* JADX INFO: renamed from: C */
    public int f80C;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public byte f423Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private long f424Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0004ai f425Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0005aj f426Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0010as f427Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0011au f428Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0017bd f429Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0018be f430Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0028d f431Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0031g f432Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public boolean f433Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public int[] f434Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public long[] f435Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0001ae[] f436Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0022bm[] f437Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public boolean[] f438Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private int[][] f439Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private int[][][] f440Code;

    /* JADX INFO: renamed from: D */
    public int f81D;

    /* JADX INFO: renamed from: F */
    public int f82F;

    /* JADX INFO: renamed from: I */
    public int f83I;

    /* JADX INFO: renamed from: I */
    public boolean f84I;

    /* JADX INFO: renamed from: I */
    public int[] f85I;

    /* JADX INFO: renamed from: I */
    public long[] f86I;

    /* JADX INFO: renamed from: I */
    private int[][] f87I;

    /* JADX INFO: renamed from: L */
    public int f88L;

    /* JADX INFO: renamed from: S */
    public int f89S;

    /* JADX INFO: renamed from: V */
    public byte f90V;

    /* JADX INFO: renamed from: V */
    public int f91V;

    /* JADX INFO: renamed from: V */
    public boolean f92V;

    /* JADX INFO: renamed from: V */
    public int[] f93V;

    /* JADX INFO: renamed from: V */
    public long[] f94V;

    /* JADX INFO: renamed from: V */
    private int[][] f95V;

    /* JADX INFO: renamed from: V */
    public long[][] f96V;

    /* JADX INFO: renamed from: Z */
    public int f97Z;

    /* JADX INFO: renamed from: Z */
    public boolean f98Z;

    /* JADX INFO: renamed from: Z */
    public long[] f99Z;

    /* JADX INFO: renamed from: a */
    public int f100a;

    /* JADX INFO: renamed from: a */
    private C0001ae[] f101a;

    /* JADX INFO: renamed from: b */
    public int f102b;

    /* JADX INFO: renamed from: c */
    public int f103c;

    /* JADX INFO: renamed from: d */
    public int f104d;

    /* JADX INFO: renamed from: e */
    public int f105e;

    /* JADX INFO: renamed from: g */
    public int f106g;

    /* JADX INFO: renamed from: h */
    public int f107h;

    /* JADX INFO: renamed from: i */
    public int f108i;

    /* JADX INFO: renamed from: k */
    private int f109k;

    /* JADX INFO: renamed from: Z */
    public static final int[] f73Z = {10, 8, 6, 4, 2, 1};
    private static float[] Code = new float[16];

    static {
        int[] iArr = {0, 0, 0, 0};
    }

    public C0019bh() {
        this(false);
    }

    public C0019bh(boolean z) {
    }

    public static int Code(int i) {
        return C0031g.f498Code[i].length;
    }

    private void Code(int i, boolean z) {
        this.f437Code[i].f129Z = z;
        C0031g.f485Code.Code(this.f437Code[i].f127V).f185V = z;
        this.f101a[i].f367Code = z;
    }

    /* JADX INFO: renamed from: F */
    public static final int m53F(int i) {
        if (i >= 85) {
            return 2;
        }
        if (i < 70) {
            return i < 50 ? -1 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: V */
    private void m54V(int i) {
        this.f107h |= 1 << i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final int m55a(int i) {
        boolean z;
        for (int i2 = 0; i2 < C0031g.f274d.length; i2 += 2) {
            if (C0031g.f274d[i2] == i) {
                z = true;
                if (z) {
                    return C0031g.f274d[i2 + 1];
                }
                return 0;
            }
        }
        z = false;
        if (z) {
            return C0031g.f274d[i2 + 1];
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private void m56a(int i) {
        if (i < 9) {
            this.f106g |= 1 << i;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m57m() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0031g.f287h.length * 4);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (int i = 0; i < C0031g.f287h.length; i++) {
            dataOutputStream.writeInt(C0031g.f287h[i]);
        }
        for (int i2 = 0; i2 < f422Code.length; i2++) {
            for (int i3 = 0; i3 < f422Code[i2].length; i3++) {
                dataOutputStream.writeLong(f422Code[i2][i3]);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        dataOutputStream.close();
        RunnableC0025bt.f462Code.Code(C0031g.f492Code[1], byteArray);
    }

    /* JADX INFO: renamed from: n */
    public static void m58n() {
        for (int i = 0; i < f422Code.length; i++) {
            for (int i2 = 0; i2 < f422Code[i].length; i2++) {
                f422Code[i][i2] = 0;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private void m59z() {
        this.f437Code[0].m109V(this.f436Code[0]);
        C0031g.f485Code.Code(this.f437Code[0].f127V).f195d = 0.0f;
        boolean z = this.f423Code == 2 || this.f90V == 2;
        if ((!z && f74f == 1) || (z && this.f98Z)) {
            C0031g.f484Code.m173Z(13);
        }
        this.f437Code[0].m109V(this.f429Code);
        this.f424Code = C0031g.f276e;
        RunnableC0025bt.Code(32, 16777215);
        this.f430Code.m50C();
        this.f437Code[0].Code(this.f429Code);
        C0031g.f251ag = 2;
    }

    /* JADX INFO: renamed from: B */
    public final int m60B() {
        return (this.f109k * 100) / 3;
    }

    /* JADX INFO: renamed from: B */
    public final int m61B(int i) {
        return this.f439Code[this.f89S][i];
    }

    /* JADX INFO: renamed from: B */
    public final void m62B() {
        switch (this.f109k) {
            case 0:
                C0020bj.Code();
                this.f433Code = false;
                this.f99Z = RunnableC0025bt.f462Code.f534Code;
                this.f437Code[2].mo209Code();
                this.f437Code[3].mo209Code();
                break;
            case 1:
                C0031g.f483Code.Code(C0031g.f481Code.f124a);
                Appearance appearance = RunnableC0025bt.f462Code.m242Code(C0031g.f497Code[this.f76B][0]).Code;
                appearance.getCompositingMode().setDepthTestEnable(false);
                appearance.getCompositingMode().setDepthWriteEnable(false);
                RunnableC0025bt.f457Code.Code(C0031g.f497Code[this.f76B][0], 12);
                C0031g.f489Code.Code(C0031g.f263b[this.f97Z]);
                C0031g.f483Code.Code(this.f427Code);
                this.f427Code.Code(true);
                C0031g.f483Code.addChild(this.f425Code);
                C0031g.f483Code.Code(this.f425Code);
                C0031g.f267c.f519Code = this.f425Code;
                this.f437Code[4].mo209Code();
                this.f437Code[5].mo209Code();
                break;
            case 2:
                C0031g.m151n();
                m66C();
                break;
            default:
                return;
        }
        this.f109k++;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m63B(int i) {
        return (this.f107h & (1 << i)) == 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m64C() {
        byte b;
        byte b2;
        this.f96V = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 6, 2);
        this.f79B = new long[6];
        this.f93V = new int[6];
        this.f85I = new int[6];
        f422Code = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 9, 3);
        this.f440Code = new int[C0031g.f498Code.length][][];
        this.f439Code = new int[C0031g.f498Code.length][];
        this.f95V = new int[C0031g.f498Code.length][];
        this.f87I = new int[C0031g.f498Code.length][];
        for (int i = 0; i < C0031g.f498Code.length; i++) {
            this.f439Code[i] = new int[Code(i)];
            this.f95V[i] = new int[Code(i)];
            this.f87I[i] = new int[Code(i)];
            this.f440Code[i] = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Code(i), 6);
        }
        C0031g.f287h = new int[15];
        m71F();
        m95b();
        try {
            byte[] bArrM240Code = C0037t.m240Code(C0031g.f492Code[1]);
            if (bArrM240Code == null) {
                C0031g.f287h[1] = 50;
                C0031g.f287h[0] = 50;
                C0031g.f287h[3] = 0;
                C0031g.f287h[4] = 1;
                C0031g.f287h[14] = 1;
                C0031g.f287h[6] = 1;
                C0031g.f287h[7] = 1;
                C0031g.f287h[8] = 1;
                C0031g.f287h[9] = 1;
                C0031g.f287h[10] = 1;
                C0031g.f287h[11] = 1;
                C0031g.f287h[12] = 1;
                C0031g.f287h[13] = 0;
                m58n();
            } else {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrM240Code));
                for (int i2 = 0; i2 < C0031g.f287h.length; i2++) {
                    C0031g.f287h[i2] = dataInputStream.readInt();
                }
                for (int i3 = 0; i3 < f422Code.length; i3++) {
                    for (int i4 = 0; i4 < f422Code[i3].length; i4++) {
                        f422Code[i3][i4] = dataInputStream.readLong();
                    }
                }
                dataInputStream.close();
            }
            b = 0;
        } catch (IOException e) {
            b = -1;
        }
        if (b == 0) {
            try {
                byte[] bArrM240Code2 = C0037t.m240Code(C0031g.f492Code[0]);
                if (bArrM240Code2 != null) {
                    DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArrM240Code2));
                    this.f106g = dataInputStream2.readInt();
                    this.f107h = dataInputStream2.readInt();
                    for (int i5 = 0; i5 < this.f440Code.length; i5++) {
                        for (int i6 = 0; i6 < this.f440Code[i5].length; i6++) {
                            for (int i7 = 0; i7 < this.f440Code[i5][i6].length; i7++) {
                                this.f440Code[i5][i6][i7] = dataInputStream2.readInt();
                            }
                        }
                    }
                    for (int i8 = 0; i8 < this.f439Code.length; i8++) {
                        for (int i9 = 0; i9 < this.f439Code[i8].length; i9++) {
                            this.f439Code[i8][i9] = dataInputStream2.readInt();
                            this.f95V[i8][i9] = dataInputStream2.readInt();
                            this.f87I[i8][i9] = dataInputStream2.readInt();
                        }
                    }
                    this.f89S = dataInputStream2.readInt();
                    this.f82F = dataInputStream2.readInt();
                    this.f81D = dataInputStream2.readInt();
                    this.f83I = dataInputStream2.readInt();
                    int i10 = dataInputStream2.readInt();
                    int i11 = dataInputStream2.readInt();
                    dataInputStream2.read(new byte[i10], 0, i10);
                    dataInputStream2.read(new byte[i11], 0, i11);
                    dataInputStream2.close();
                    this.f84I = true;
                } else {
                    this.f84I = false;
                }
                b2 = 0;
            } catch (IOException e2) {
                b2 = -1;
            }
            if (b2 == 0) {
            }
        }
        this.f423Code = (byte) -1;
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m65C(int i) {
        return (C0031g.f498Code[this.f89S][i].length - 3) / 3;
    }

    /* JADX INFO: renamed from: C */
    public final void m66C() {
        for (int i = 0; i < 6; i++) {
            this.f437Code[i].mo25V();
        }
        C0010as c0010asM198V = RunnableC0025bt.f462Code.m198V(C0031g.f229V[this.f80C]);
        this.f437Code[0].Code(c0010asM198V, 0);
        if (this.f80C != 6) {
            c0010asM198V.Code(RunnableC0025bt.f462Code.m242Code(C0031g.f222I[this.f80C]), 1);
        }
        C0031g.f485Code.Code(this.f437Code[0].f127V).Code(C0020bj.f116Z[0], C0020bj.f113V[0]);
        C0031g.f485Code.Code(this.f437Code[0].f127V).Code(this.f93V[0]);
        this.f429Code.m218Code();
        this.f426Code.mo24I();
        this.f437Code[0].m109V(this.f429Code);
        this.f437Code[0].m109V(this.f436Code[0]);
        this.f437Code[0].Code(this.f436Code[0]);
        ((C0038u) this.f436Code[0]).Code();
        C0031g.f485Code.Code(this.f437Code[0].f127V).m124V();
        Code(0, true);
        if (this.f423Code == 2 || (this.f423Code == 1 && this.f90V == 2)) {
            for (int i2 = 1; i2 < 6; i2++) {
                Code(i2, false);
            }
        } else {
            for (int i3 = 1; i3 < 6; i3++) {
                C0010as c0010asM241Code = RunnableC0025bt.f462Code.m241Code(C0031g.f229V[this.f93V[i3]]);
                this.f437Code[i3].Code(c0010asM241Code, i3);
                if (C0031g.f229V[this.f93V[i3]] != 113455300566750L) {
                    c0010asM241Code.Code(RunnableC0025bt.f462Code.m242Code(C0031g.f222I[this.f93V[i3]]), 1);
                }
                if (this.f90V == 1 && this.f93V[i3] == this.f88L) {
                    this.f437Code[i3].m107C();
                }
                C0031g.f485Code.Code(this.f437Code[i3].f127V).Code(C0020bj.f116Z[i3], C0020bj.f113V[i3]);
                C0031g.f485Code.Code(this.f437Code[i3].f127V).Code(this.f93V[i3]);
                ((C0017bd) this.f436Code[i3]).m218Code();
                C0031g.f485Code.Code(this.f437Code[i3].f127V).m124V();
                this.f437Code[i3].mo24I();
                C0031g.f485Code.Code(this.f437Code[i3].f127V).f183V = (C0031g.f481Code.f442Code - 2) - (i3 / 2);
                Code(i3, true);
            }
        }
        for (int i4 = 0; i4 < 6; i4++) {
            this.f434Code[i4] = 0;
            this.f435Code[i4] = 0;
            this.f94V[i4] = 0;
        }
        this.f430Code.Code(C0031g.f485Code.Code(this.f437Code[0].f127V));
        C0011au.Code(C0031g.f485Code.Code(this.f437Code[0].f127V));
        this.f425Code.m21I();
        this.f425Code.Code(this.f428Code);
        this.f426Code.Code();
        this.f432Code.Code(false);
        C0031g.f251ag = 0;
        C0031g.f238a = System.currentTimeMillis() + ((long) 5000);
        C0031g.f212B = 5000;
        C0031g.f265c = 0L;
        C0031g.f276e = 0L;
        this.f104d = 0;
        for (int i5 = 0; i5 < 6; i5++) {
            this.f438Code[i5] = false;
            this.f85I[i5] = i5;
        }
        C0031g.f266c.f318a.m179q();
        C0031g.m150m();
    }

    @Override // p000.C0033j
    /* JADX INFO: renamed from: Code */
    public final int mo237Code() {
        this.f77B = false;
        this.f91V = 1;
        this.f434Code = new int[6];
        this.f94V = new long[6];
        this.f86I = new long[6];
        this.f435Code = new long[6];
        this.f78B = new int[6];
        for (int i = 0; i < 6; i++) {
            this.f78B[i] = i;
        }
        this.f437Code = new C0022bm[6];
        this.f436Code = new C0001ae[6];
        this.f101a = new C0001ae[6];
        this.f437Code[0] = new C0005aj();
        this.f426Code = (C0005aj) this.f437Code[0];
        this.f426Code.m110V(null, 0);
        C0031g.f485Code.Code(this.f426Code);
        this.f436Code[0] = new C0038u();
        C0038u.Code(C0031g.f485Code.Code(((C0022bm) this.f426Code).f127V));
        this.f429Code = new C0017bd();
        this.f429Code.Code(C0031g.f485Code.Code(((C0022bm) this.f426Code).f127V));
        this.f426Code.Code(this.f436Code[0]);
        this.f101a[0] = new C0001ae(false);
        this.f101a[0].f365Code = this.f426Code;
        this.f426Code.Code(this.f101a[0]);
        C0031g.f239a.m186a(this.f426Code);
        C0031g.f485Code.Code(this.f437Code[0].f127V).Code((InterfaceC0009ar) this.f426Code);
        for (int i2 = 1; i2 < 6; i2++) {
            this.f437Code[i2] = new C0022bm();
            this.f437Code[i2].m110V(null, i2);
            C0031g.f485Code.Code(this.f437Code[i2], false);
            this.f436Code[i2] = new C0017bd();
            ((C0017bd) this.f436Code[i2]).Code(C0031g.f485Code.Code(this.f437Code[i2].f127V));
            this.f437Code[i2].Code(this.f436Code[i2]);
            this.f101a[i2] = new C0001ae(false);
            this.f101a[i2].f365Code = this.f437Code[i2];
            this.f101a[i2].f367Code = false;
            this.f437Code[i2].Code(this.f101a[i2]);
            C0031g.f239a.m186a(this.f437Code[i2]);
            C0031g.f485Code.Code(this.f437Code[i2].f127V).Code((InterfaceC0009ar) this.f437Code[i2]);
        }
        this.f425Code = new C0004ai();
        this.f430Code = new C0018be(false);
        this.f428Code = new C0011au();
        this.f425Code.Code(RunnableC0025bt.Code() / RunnableC0025bt.m113V(), 60.0f, 1.0f, 200.0f);
        this.f430Code.Code();
        this.f430Code.m52V(0.0f, 3.0f, -10.0f);
        this.f430Code.Code(0.0f, 2.0f, 0.0f);
        C0031g.f260b.Code(this.f425Code);
        this.f425Code.Code(200.0f);
        this.f431Code = new C0028d();
        this.f432Code = C0031g.Code(30, this.f431Code, 1L, 1L, 0, 95, 15, 105);
        this.f432Code.Code(2, C0031g.f482Code, C0031g.f485Code.Code(((C0022bm) this.f426Code).f127V));
        C0033j.Code().Code(this.f432Code);
        this.f432Code.f506Code = false;
        this.f427Code = new C0010as();
        this.f427Code.Code(this.f432Code.m230Code());
        this.f432Code.m230Code().Code(0.0f, 0.0f, -2.0f);
        this.f432Code.m230Code().m44V(0.01f, 0.01f, 0.0f);
        this.f438Code = new boolean[6];
        return 0;
    }

    @Override // p000.C0033j
    public final int Code(int i, int i2) {
        return m53F((((i2 << 8) / m83V(i)) * 101) >> 8);
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m219Code() {
        this.f431Code.Code(115329633643640L, 12);
        RunnableC0025bt.f457Code.Code(RunnableC0025bt.f462Code.m241Code(25366811507263L));
        C0031g.f483Code.Code = RunnableC0025bt.f457Code;
        C0007ao.Code();
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m220Code(int i) {
        boolean z;
        if (this.f434Code[i] <= this.f91V) {
            int[] iArr = this.f434Code;
            iArr[i] = iArr[i] + 1;
            if (this.f434Code[i] != 1) {
                if (this.f90V == 3) {
                    boolean z2 = true;
                    for (int i2 = 0; i2 < 6; i2++) {
                        if (!this.f438Code[i2] && this.f434Code[i2] < this.f434Code[i]) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        this.f104d++;
                        this.f434Code[i] = this.f91V;
                        this.f438Code[i] = true;
                        this.f79B[i] = Long.MAX_VALUE - ((long) this.f104d);
                        if (i == 0) {
                            m59z();
                            return;
                        } else {
                            this.f437Code[i].f452Code.Code(false);
                            Code(i, false);
                            return;
                        }
                    }
                }
                this.f435Code[i] = C0031g.f276e - this.f94V[i];
                this.f94V[i] = C0031g.f276e;
                if (i == 0) {
                    if (this.f435Code[i] < C0031g.f265c || C0031g.f265c == 0) {
                        C0031g.f265c = this.f435Code[i];
                        C0031g.f266c.f318a.f308I = C0031g.f276e + ((long) 4000);
                    }
                    C0019bh c0019bh = C0031g.Code;
                    int i3 = this.f76B;
                    long j = this.f435Code[i];
                    int[][] iArr2 = c0019bh.f87I;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= f422Code[i3].length) {
                            z = false;
                            break;
                        } else {
                            if (f422Code[i3][i4] == 0) {
                                f422Code[i3][i4] = j;
                                z = true;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (!z && (j < f422Code[i3][2] || f422Code[i3][2] == 0)) {
                        f422Code[i3][2] = j;
                    }
                    int length = f422Code[i3].length - 1;
                    if (!z) {
                        i4 = length;
                    }
                    C0037t.Code(f422Code[i3], 0, i4);
                    if (j == f422Code[i3][0]) {
                        c0019bh.f98Z = true;
                        C0031g.f266c.f318a.f506Code = true;
                    }
                    C0031g.Code(this.f435Code[i]);
                }
                if (this.f434Code[i] > this.f91V) {
                    this.f79B[i] = C0031g.f276e;
                    if (i == 0) {
                        m59z();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m221Code(int i, int i2) {
        for (int i3 = 0; i3 < this.f440Code[i][i2].length; i3++) {
            this.f440Code[i][i2][i3] = 0;
        }
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final boolean m222Code() {
        if (!this.f84I) {
            this.f84I = C0037t.m195V(C0031g.f492Code[0]);
        }
        return this.f84I;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final boolean m223Code(int i) {
        return m67D() < C0031g.f270c[i];
    }

    /* JADX INFO: renamed from: D */
    public final int m67D() {
        int i = 0;
        int iM88Z = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f439Code.length) {
                return iM88Z;
            }
            iM88Z += m88Z(i2);
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public final int m68D(int i) {
        return C0031g.f498Code[this.f89S][i][1];
    }

    /* JADX INFO: renamed from: D */
    public final void m69D() {
        this.f80C = this.f87I[this.f89S][this.f82F];
    }

    /* JADX INFO: renamed from: F */
    public final int m70F() {
        int length = 0;
        for (int i = 0; i < C0031g.f498Code.length; i++) {
            for (int i2 = 0; i2 < Code(i); i2++) {
                length += (C0031g.f498Code[i][i2].length - 3) / 3;
            }
        }
        return length * f73Z[0];
    }

    /* JADX INFO: renamed from: F */
    public final void m71F() {
        int i = 0;
        this.f100a = -1;
        this.f102b = -1;
        this.f106g = 0;
        this.f107h = 0;
        for (int i2 = 0; i2 < C0031g.f498Code.length; i2++) {
            for (int i3 = 0; i3 < Code(i2); i3++) {
                this.f439Code[i2][i3] = 0;
            }
        }
        if (C0031g.f300u <= 0) {
            m54V(1);
            m54V(0);
            m56a(0);
            i = 3;
            m56a(1);
        } else {
            m54V(0);
        }
        m56a(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: I */
    public final int m72I() {
        int i;
        int i2 = 1;
        switch (C0031g.f251ag) {
            case 0:
                C0031g.f212B = C0031g.f238a - System.currentTimeMillis();
                if (C0031g.f212B <= 0) {
                    C0031g.f280f = System.currentTimeMillis();
                    C0031g.f251ag = 1;
                    C0031g.f212B = 0L;
                    RunnableC0025bt.Code(50, 16777215);
                    this.f425Code.m21I();
                    this.f425Code.Code(this.f430Code);
                    this.f430Code.Code(C0031g.f485Code.Code(this.f437Code[0].f127V));
                } else {
                    C0011au.Code(C0031g.f485Code.Code(this.f437Code[0].f127V));
                }
                return 0;
            case 1:
                this.f425Code.Code(Code);
                this.f427Code.Code(Code);
                C0007ao.m28a().m40i();
                if (C0031g.f212B > 0) {
                    C0031g.f212B = C0031g.f238a - System.currentTimeMillis();
                }
                C0031g.f276e = System.currentTimeMillis() - C0031g.f280f;
                this.f435Code[0] = 0;
                int i3 = C0038u.Code.f183V;
                int i4 = this.f434Code[0];
                f74f = 1;
                while (true) {
                    int i5 = i2;
                    if (i5 >= 6) {
                        if ((RunnableC0025bt.Code & 256) == 256) {
                            RunnableC0025bt.Code &= 65279;
                            this.f430Code.m49B();
                        }
                        return 0;
                    }
                    if (!this.f438Code[i5] && (this.f434Code[i5] > i4 || (this.f434Code[i5] == i4 && ((i = ((C0017bd) this.f436Code[i5]).f416Code.f183V) > i3 || (i == i3 && ((C0017bd) this.f436Code[i5]).f416Code.f173F > C0038u.Code.f173F))))) {
                        f74f++;
                    }
                    i2 = i5 + 1;
                }
                break;
            case 2:
                C0031g.f276e = System.currentTimeMillis() - C0031g.f280f;
                if (C0031g.f276e > this.f424Code + ((long) 5000) && !this.f77B) {
                    RunnableC0025bt.m114V(16, 0);
                    this.f77B = true;
                }
                if (this.f77B && !RunnableC0025bt.m224Code()) {
                    this.f77B = false;
                    this.f437Code[0].m109V(this.f429Code);
                    this.f437Code[0].Code(this.f436Code[0]);
                    m85V();
                    RunnableC0025bt.f135D = 14;
                    RunnableC0025bt.Code(32, 16777215);
                }
                return 0;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m73I(int i) {
        int length = 0;
        for (int i2 = 0; i2 < Code(i); i2++) {
            length += (C0031g.f498Code[i][i2].length - 3) / 3;
        }
        return length * f73Z[0];
    }

    /* JADX INFO: renamed from: I */
    public final int m74I(int i, int i2) {
        return C0031g.f498Code[this.f89S][i][(i2 * 3) + 3 + 1];
    }

    /* JADX INFO: renamed from: I */
    public final void m75I() {
        if (this.f433Code) {
            return;
        }
        this.f109k = 0;
        for (int i = 0; i < 6; i++) {
            this.f79B[i] = 0;
            this.f434Code[i] = 0;
            this.f94V[i] = 0;
            this.f86I[i] = 0;
            this.f437Code[i].mo25V();
        }
        C0007ao.Code().m211Code();
        C0007ao.m28a().m41j();
        RunnableC0025bt.f457Code.m32V();
        C0031g.f483Code.removeChild(this.f425Code);
        C0031g.f481Code.m106V();
        C0031g.f483Code.m125V(this.f427Code);
        this.f99Z = RunnableC0025bt.f462Code.f534Code;
        for (int i2 = 0; i2 < this.f99Z.length; i2++) {
            for (int i3 = 0; i3 < RunnableC0025bt.f149V.length; i3++) {
                if (this.f99Z[i2] == RunnableC0025bt.f149V[i3]) {
                    this.f99Z[i2] = 0;
                }
            }
        }
        RunnableC0025bt.f462Code.m197V(this.f99Z);
        this.f99Z = null;
        this.f433Code = true;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m76I(int i) {
        if (this.f89S == 0 && this.f82F == 2 && i == 2) {
            return true;
        }
        if (this.f89S == 1 && this.f82F == 1 && i == 3) {
            return true;
        }
        if (this.f89S == 1 && this.f82F == 4 && i == 4) {
            return true;
        }
        if (this.f89S == 2 && this.f82F == 1 && i == 5) {
            return true;
        }
        return this.f89S == 2 && this.f82F == 5 && i == 6;
    }

    /* JADX INFO: renamed from: L */
    public final int m77L() {
        return this.f440Code[this.f89S][this.f82F][0];
    }

    /* JADX INFO: renamed from: L */
    public final int m78L(int i) {
        return C0031g.f498Code[this.f89S][i][2];
    }

    /* JADX INFO: renamed from: L */
    public final void m79L() {
        this.f87I[this.f89S][this.f82F] = this.f80C;
    }

    /* JADX INFO: renamed from: S */
    public final int m80S(int i) {
        return m53F((((m61B(i) << 8) / m83V(i)) * 101) >> 8);
    }

    /* JADX INFO: renamed from: S */
    public final void m81S() {
        byte b = 2;
        switch (this.f423Code) {
            case 0:
                do {
                    this.f76B = RunnableC0025bt.Code(9);
                } while (m91Z(this.f76B));
                if (C0031g.f300u > 0) {
                    this.f76B = 0;
                }
                this.f91V = 2;
                b = 0;
                this.f90V = b;
                break;
            case 1:
                this.f76B = m84V(this.f82F, this.f81D);
                this.f90V = (byte) m74I(this.f82F, this.f81D);
                this.f91V = m89Z(this.f82F, this.f81D);
                break;
            case 2:
                this.f90V = b;
                break;
        }
        f74f = 3;
        new StringBuffer().append("mTrackID ").append(this.f76B).toString();
        new StringBuffer().append("mRaceType ").append((int) this.f90V).toString();
        new StringBuffer().append("mNumberOfLaps ").append(this.f91V).toString();
    }

    @Override // p000.C0033j
    /* JADX INFO: renamed from: V */
    public final int mo82V() {
        if (this.f425Code == null) {
            return 0;
        }
        this.f430Code.mo16V();
        this.f430Code = null;
        this.f425Code = null;
        return 0;
    }

    /* JADX INFO: renamed from: V */
    public final int m83V(int i) {
        return m65C(i) * f73Z[0];
    }

    /* JADX INFO: renamed from: V */
    public final int m84V(int i, int i2) {
        return C0031g.f498Code[this.f89S][i][(i2 * 3) + 3 + 0];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x024f. Please report as an issue. */
    /* JADX INFO: renamed from: V */
    public final void m85V() {
        C0031g c0031g;
        int i;
        int[] iArr;
        int i2;
        int i3;
        long[] jArr;
        long j;
        if (this.f90V != 2 && C0031g.f251ag == 2) {
            new StringBuffer().append("racetime[player] == ").append(this.f79B[0]).toString();
            for (int i4 = 1; i4 < 6; i4++) {
                if (this.f79B[i4] == 0) {
                    new StringBuffer().append("racetime[").append(i4).append("] is 0").toString();
                    if (this.f438Code[0]) {
                        new StringBuffer().append("player knocked out, multiplying lap time of ").append(this.f435Code[i4]).append(" by laps (").append(this.f91V).append(")").toString();
                        jArr = this.f79B;
                        j = this.f435Code[i4] * ((long) this.f91V);
                    } else {
                        int i5 = C0031g.f485Code.Code(i4).f183V;
                        float f = (this.f435Code[i4] / ((long) C0031g.f481Code.f442Code)) * (C0031g.f481Code.f442Code - i5);
                        new StringBuffer().append("last lap time == ").append(this.f435Code[i4]).append(", current seg == ").append(i5).toString();
                        new StringBuffer().append("offset == ").append((int) f).toString();
                        jArr = this.f79B;
                        j = ((long) f) + this.f79B[0];
                    }
                    jArr[i4] = j;
                    new StringBuffer().append("racetime[").append(i4).append("] set to ").append(this.f79B[i4]).toString();
                }
            }
            for (int i6 = 1; i6 < 5; i6++) {
                for (int i7 = i6 + 1; i7 < 6; i7++) {
                    if (this.f79B[i6] == this.f79B[i7]) {
                        new StringBuffer().append("").append(i6).append(" and ").append(i7).append(" have same time, adding 25 to ").append(i6).toString();
                        long[] jArr2 = this.f79B;
                        jArr2[i6] = jArr2[i6] + ((long) 25);
                    }
                }
            }
            int[] iArr2 = new int[6];
            long j2 = -1;
            int i8 = 0;
            while (true) {
                long j3 = Long.MAX_VALUE;
                if (i8 >= 6) {
                    break;
                }
                for (int i9 = 0; i9 < 6; i9++) {
                    if (this.f79B[i9] < j3 && this.f79B[i9] > j2) {
                        j3 = this.f79B[i9];
                        this.f85I[i9] = i8;
                        iArr2[i8] = i9;
                    }
                }
                j2 = j3;
                i8++;
            }
            long[] jArr3 = new long[6];
            for (int i10 = 0; i10 < 6; i10++) {
                jArr3[this.f85I[i10]] = this.f79B[i10];
            }
            for (int i11 = 0; i11 < 6; i11++) {
                this.f79B[i11] = jArr3[i11];
            }
            if (this.f90V == 3) {
                for (int i12 = 5; i12 > 5 - m89Z(this.f82F, this.f81D); i12--) {
                    this.f438Code[iArr2[i12]] = true;
                }
            }
            this.f104d = m89Z(this.f82F, this.f81D);
            for (int i13 = 0; i13 < 6; i13++) {
                new StringBuffer().append("mRaceOrder[").append(i13).append("] == ").append(this.f85I[i13]).toString();
            }
        }
        this.f108i = 0;
        for (int i14 = 0; i14 < 6; i14++) {
            this.f96V[this.f85I[i14]][0] = this.f93V[i14];
            this.f96V[i14][1] = this.f79B[i14];
            new StringBuffer().append("mRaceResults[").append(i14).append("] = ").append(this.f96V[i14][0]).append(",").append(this.f79B[i14]).toString();
        }
        f75j = this.f85I[0];
        new StringBuffer().append("playerresultindx == ").append(f75j).toString();
        switch (this.f423Code) {
            case 0:
                if (C0031g.f300u <= 0) {
                    c0031g = C0031g.f266c;
                    i = -20;
                } else {
                    c0031g = C0031g.f266c;
                    i = 81;
                }
                c0031g.Code(true, 20, i);
                break;
            case 1:
                for (int i15 = 0; i15 < 6; i15++) {
                    if (C0031g.Code.f90V != 3 || this.f85I[i15] < 6 - C0031g.Code.f104d) {
                        iArr = this.f440Code[this.f89S][this.f82F];
                        i2 = iArr[i15];
                        i3 = f73Z[this.f85I[i15]];
                    } else {
                        iArr = this.f440Code[this.f89S][this.f82F];
                        i2 = iArr[i15];
                        i3 = 1;
                    }
                    iArr[i15] = i3 + i2;
                }
                this.f81D++;
                if (this.f81D >= m65C(this.f82F)) {
                    this.f81D = 0;
                    this.f92V = true;
                    this.f105e = m80S(this.f82F);
                    this.f103c = -1;
                    boolean[] zArr = new boolean[C0031g.f498Code.length];
                    for (int i16 = 0; i16 < C0031g.f498Code.length; i16++) {
                        zArr[i16] = m223Code(i16);
                    }
                    if (this.f440Code[this.f89S][this.f82F][0] > this.f439Code[this.f89S][this.f82F]) {
                        this.f439Code[this.f89S][this.f82F] = this.f440Code[this.f89S][this.f82F][0];
                    }
                    for (int i17 = 0; i17 < C0031g.f498Code.length; i17++) {
                        if (zArr[i17] != m223Code(i17)) {
                            this.f103c = i17;
                            if (this.f90V == 1 && this.f440Code[this.f89S][this.f82F][0] > this.f440Code[this.f89S][this.f82F][1] && m63B(this.f88L)) {
                                m54V(this.f88L);
                                this.f102b = this.f88L;
                            }
                        }
                    }
                    if (this.f90V == 1) {
                        m54V(this.f88L);
                        this.f102b = this.f88L;
                    }
                }
                i = -38;
                this.f95V[this.f89S][this.f82F] = this.f81D;
                c0031g = C0031g.f266c;
                c0031g.Code(true, 20, i);
                break;
            case 2:
                this.f96V[0][0] = this.f93V[0];
                this.f96V[0][1] = this.f79B[0];
                c0031g = C0031g.f266c;
                i = -20;
                c0031g.Code(true, 20, i);
                break;
        }
        mo96c();
        if (C0031g.f300u != 0) {
            this.f423Code = (byte) -1;
        }
        C0031g.f484Code.m160I();
        C0031g.f266c.m180s();
    }

    /* JADX INFO: renamed from: V */
    public final boolean m86V(int i) {
        return m67D() < C0031g.f498Code[this.f89S][i][0];
    }

    /* JADX INFO: renamed from: Z */
    public final int m87Z() {
        this.f97Z = this.f76B / 3;
        C0031g.m135V(2, (RunnableC0025bt.m113V() - C0031g.f245aa) - 4);
        int i = this.f76B;
        int length = C0031g.f497Code[i].length + 3;
        long[] jArr = new long[length];
        System.arraycopy(C0031g.f497Code[i], 0, jArr, 0, C0031g.f497Code[i].length);
        jArr[length - 3] = C0031g.f222I[0];
        jArr[length - 2] = C0031g.f222I[6];
        jArr[length - 1] = -4294967294L;
        RunnableC0025bt.f462Code.Code(jArr);
        return 0;
    }

    /* JADX INFO: renamed from: Z */
    public final int m88Z(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i4 >= this.f439Code[i].length) {
                return i3;
            }
            i3 += this.f439Code[i][i4];
            i2 = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final int m89Z(int i, int i2) {
        return C0031g.f498Code[this.f89S][i][(i2 * 3) + 3 + 2];
    }

    /* JADX INFO: renamed from: Z */
    public final void m90Z() {
        C0031g.f481Code.Code(C0031g.f490Code[this.f76B]);
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m91Z(int i) {
        return (this.f106g & (1 << i)) == 0;
    }

    @Override // p000.C0033j
    /* JADX INFO: renamed from: a */
    public final int mo92a() {
        return this.f95V[this.f89S][this.f82F];
    }

    /* JADX INFO: renamed from: a */
    public final void m93a() {
        this.f95V[this.f89S][this.f82F] = 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m94b(int i) {
        return this.f95V[this.f89S][i];
    }

    /* JADX INFO: renamed from: b */
    public final void m95b() {
        this.f89S = 0;
        this.f82F = 0;
        this.f81D = 0;
        this.f83I = 1;
        f74f = 6;
        this.f98Z = false;
        this.f92V = false;
        for (int i = 0; i < C0031g.f498Code.length; i++) {
            if (!C0031g.f240a) {
                for (int i2 = 0; i2 < this.f439Code[i].length; i2++) {
                    this.f439Code[i][i2] = 0;
                }
            }
            for (int i3 = 0; i3 < this.f95V[i].length; i3++) {
                this.f95V[i][i3] = 0;
            }
        }
        for (int i4 = 0; i4 < this.f440Code.length; i4++) {
            for (int i5 = 0; i5 < this.f440Code[i4].length; i5++) {
                for (int i6 = 0; i6 < this.f440Code[i4][i5].length; i6++) {
                    this.f440Code[i4][i5][i6] = 0;
                }
            }
        }
        this.f84I = false;
    }

    @Override // p000.C0033j
    /* JADX INFO: renamed from: c */
    public final int mo96c() {
        try {
            if (this.f84I) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(163);
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(this.f106g);
                dataOutputStream.writeInt(this.f107h);
                for (int i = 0; i < this.f440Code.length; i++) {
                    for (int i2 = 0; i2 < this.f440Code[i].length; i2++) {
                        for (int i3 = 0; i3 < this.f440Code[i][i2].length; i3++) {
                            dataOutputStream.writeInt(this.f440Code[i][i2][i3]);
                        }
                    }
                }
                for (int i4 = 0; i4 < this.f439Code.length; i4++) {
                    for (int i5 = 0; i5 < this.f439Code[i4].length; i5++) {
                        dataOutputStream.writeInt(this.f439Code[i4][i5]);
                        dataOutputStream.writeInt(this.f95V[i4][i5]);
                        dataOutputStream.writeInt(this.f87I[i4][i5]);
                    }
                }
                dataOutputStream.writeInt(this.f89S);
                dataOutputStream.writeInt(this.f82F);
                dataOutputStream.writeInt(this.f81D);
                dataOutputStream.writeInt(this.f83I);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                RunnableC0025bt.f462Code.Code(C0031g.f492Code[0], byteArray);
            }
            m57m();
            return 0;
        } catch (IOException e) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m97c(int i) {
        if (this.f89S != 0 || i != 2) {
            if (this.f89S == 1 && i == 1) {
                return 3;
            }
            if (this.f89S == 1 && i == 4) {
                return 4;
            }
            if (this.f89S == 2 && i == 1) {
                return 5;
            }
            if (this.f89S == 2 && i == 5) {
                return 6;
            }
        }
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public final void m98c() {
        int i = 4;
        int i2 = 2;
        this.f93V[0] = this.f80C;
        if (this.f90V == 1) {
            if (this.f89S == 0 && this.f82F == 2) {
                i = 2;
            } else if (this.f89S == 1 && this.f82F == 1) {
                i = 3;
            } else {
                if (this.f89S != 1 || this.f82F != 4) {
                    if (this.f89S == 2 && this.f82F == 1) {
                        i = 5;
                    } else if (this.f89S == 2 && this.f82F == 5) {
                        i = 6;
                    }
                }
                this.f93V[1] = this.f88L;
            }
            this.f88L = i;
            this.f93V[1] = this.f88L;
        } else {
            this.f88L = -1;
            i2 = 1;
        }
        int i3 = 0;
        while (i2 < 6) {
            if (i3 == this.f93V[0]) {
                i3++;
            }
            if (this.f90V == 1 && i3 == this.f93V[1]) {
                i3++;
            }
            this.f93V[i2] = i3;
            i3++;
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m99g() {
        long[] jArr;
        long j;
        this.f108i = 1;
        for (int i = 0; i < 6; i++) {
            this.f96V[this.f85I[i]][0] = this.f93V[i];
            if (C0031g.Code.f90V != 3 || i < 6 - C0031g.Code.f104d) {
                jArr = this.f96V[i];
                j = f73Z[i];
            } else {
                j = 1;
                jArr = this.f96V[i];
            }
            jArr[1] = j;
        }
        f75j = this.f85I[0];
    }

    /* JADX INFO: renamed from: h */
    public final void m100h() {
        this.f108i = 1;
        for (int i = 0; i < 6; i++) {
            this.f85I[i] = i;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 5; i3++) {
                if (this.f440Code[this.f89S][this.f82F][this.f85I[i3]] < this.f440Code[this.f89S][this.f82F][this.f85I[i3 + 1]]) {
                    int i4 = this.f85I[i3];
                    this.f85I[i3] = this.f85I[i3 + 1];
                    this.f85I[i3 + 1] = i4;
                }
            }
        }
        for (int i5 = 0; i5 < 6; i5++) {
            this.f96V[i5][0] = this.f93V[this.f85I[i5]];
            this.f96V[i5][1] = this.f440Code[this.f89S][this.f82F][this.f85I[i5]];
            if (this.f85I[i5] == 0) {
                f75j = i5;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m101i() {
        if (m91Z(this.f76B)) {
            m56a(this.f76B);
            this.f100a = this.f76B;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m102j() {
        this.f106g = -1;
    }

    /* JADX INFO: renamed from: k */
    public final void m103k() {
        this.f107h = -1;
    }

    /* JADX INFO: renamed from: l */
    public final void m104l() {
        for (int i = 0; i < C0031g.f498Code.length; i++) {
            for (int i2 = 0; i2 < Code(i); i2++) {
                this.f439Code[i][i2] = ((C0031g.f498Code[i][i2].length - 3) / 3) * f73Z[0];
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m105p() {
        C0037t.Code(C0031g.f492Code[0]);
        this.f84I = false;
    }
}
