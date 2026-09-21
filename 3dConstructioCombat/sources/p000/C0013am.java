package p000;

import com.lightningtoads.jdropscape.Dropscape;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: am */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0013am extends AbstractC0043o implements InterfaceC0051w, CommandListener, InterfaceC0018ar {

    /* JADX INFO: renamed from: aF */
    private static C0013am f119aF;

    /* JADX INFO: renamed from: A */
    public C0007ag f120A;

    /* JADX INFO: renamed from: B */
    public int f121B;

    /* JADX INFO: renamed from: C */
    public C0025ay[] f122C;

    /* JADX INFO: renamed from: D */
    public C0000a[] f123D;

    /* JADX INFO: renamed from: E */
    public C0040l f124E;

    /* JADX INFO: renamed from: F */
    public Hashtable f125F;

    /* JADX INFO: renamed from: G */
    public int f126G;

    /* JADX INFO: renamed from: H */
    public int f127H;

    /* JADX INFO: renamed from: I */
    public int f128I;

    /* JADX INFO: renamed from: J */
    public int f129J;

    /* JADX INFO: renamed from: K */
    public int[] f130K;

    /* JADX INFO: renamed from: L */
    public int[] f131L;

    /* JADX INFO: renamed from: M */
    public int[] f132M;

    /* JADX INFO: renamed from: N */
    public Vector f133N;

    /* JADX INFO: renamed from: O */
    public AbstractC0050v[] f134O;

    /* JADX INFO: renamed from: P */
    public int f135P;

    /* JADX INFO: renamed from: Q */
    public C0025ay[] f136Q;

    /* JADX INFO: renamed from: R */
    public int[] f137R;

    /* JADX INFO: renamed from: S */
    public Random f138S;

    /* JADX INFO: renamed from: T */
    public int f139T;

    /* JADX INFO: renamed from: U */
    public int f140U;

    /* JADX INFO: renamed from: V */
    public int f141V;

    /* JADX INFO: renamed from: W */
    public int f142W;

    /* JADX INFO: renamed from: X */
    public String[] f143X;

    /* JADX INFO: renamed from: Y */
    public int[] f144Y;

    /* JADX INFO: renamed from: Z */
    public boolean f145Z;

    /* JADX INFO: renamed from: a */
    public String f146a;

    /* JADX INFO: renamed from: aA */
    public int f147aA;

    /* JADX INFO: renamed from: aB */
    public boolean f148aB;

    /* JADX INFO: renamed from: aC */
    public int f149aC;

    /* JADX INFO: renamed from: aa */
    public boolean f150aa;

    /* JADX INFO: renamed from: ab */
    public boolean f151ab;

    /* JADX INFO: renamed from: ac */
    public int f152ac;

    /* JADX INFO: renamed from: ad */
    public int f153ad;

    /* JADX INFO: renamed from: ae */
    public C0025ay f154ae;

    /* JADX INFO: renamed from: af */
    public C0025ay f155af;

    /* JADX INFO: renamed from: ag */
    public C0025ay f156ag;

    /* JADX INFO: renamed from: ah */
    public C0025ay f157ah;

    /* JADX INFO: renamed from: ai */
    public C0046r f158ai;

    /* JADX INFO: renamed from: aj */
    public C0052x f159aj;

    /* JADX INFO: renamed from: ak */
    public C0052x f160ak;

    /* JADX INFO: renamed from: al */
    public int f161al;

    /* JADX INFO: renamed from: am */
    public int f162am;

    /* JADX INFO: renamed from: an */
    public int f163an;

    /* JADX INFO: renamed from: ao */
    public int f164ao;

    /* JADX INFO: renamed from: ap */
    public Command f165ap;

    /* JADX INFO: renamed from: aq */
    public StringBuffer f166aq;

    /* JADX INFO: renamed from: ar */
    public char[] f167ar;

    /* JADX INFO: renamed from: as */
    public int f168as;

    /* JADX INFO: renamed from: at */
    public int f169at;

    /* JADX INFO: renamed from: au */
    public int f170au;

    /* JADX INFO: renamed from: av */
    public boolean f171av;

    /* JADX INFO: renamed from: aw */
    public boolean f172aw;

    /* JADX INFO: renamed from: ax */
    public C0036h f173ax;

    /* JADX INFO: renamed from: ay */
    public C0044p f174ay;

    /* JADX INFO: renamed from: az */
    public boolean f175az;

    /* JADX INFO: renamed from: b */
    public String f176b;

    /* JADX INFO: renamed from: c */
    public Image f177c;

    /* JADX INFO: renamed from: d */
    public int f178d;

    /* JADX INFO: renamed from: e */
    public int f179e;

    /* JADX INFO: renamed from: f */
    public int[] f180f;

    /* JADX INFO: renamed from: g */
    public int f181g;

    /* JADX INFO: renamed from: h */
    public C0003ac[] f182h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0051w[] f183i;

    /* JADX INFO: renamed from: j */
    public int f184j;

    /* JADX INFO: renamed from: k */
    public int[] f185k;

    /* JADX INFO: renamed from: l */
    public int f186l;

    /* JADX INFO: renamed from: m */
    public int f187m;

    /* JADX INFO: renamed from: n */
    public int[] f188n;

    /* JADX INFO: renamed from: o */
    public int f189o;

    /* JADX INFO: renamed from: p */
    public int[] f190p;

    /* JADX INFO: renamed from: q */
    public C0027b f191q;

    /* JADX INFO: renamed from: r */
    public C0006af f192r;

    /* JADX INFO: renamed from: s */
    public Font f193s;

    /* JADX INFO: renamed from: t */
    public Font f194t;

    /* JADX INFO: renamed from: u */
    public Font f195u;

    /* JADX INFO: renamed from: v */
    public Font f196v;

    /* JADX INFO: renamed from: w */
    public C0032d f197w;

    /* JADX INFO: renamed from: x */
    public C0025ay f198x;

    /* JADX INFO: renamed from: y */
    public C0025ay f199y;

    /* JADX INFO: renamed from: z */
    public C0042n f200z;

    public C0013am(RunnableC0015ao runnableC0015ao) {
        super(runnableC0015ao);
        this.f185k = new int[9];
        this.f193s = Font.getFont(32, 1, 16);
        this.f194t = Font.getFont(32, 1, 8);
        this.f195u = Font.getFont(64, 1, 8);
        this.f196v = Font.getFont(64, 0, 8);
        this.f198x = new C0025ay();
        this.f199y = new C0025ay();
        this.f200z = new C0042n();
        this.f125F = new Hashtable();
        this.f133N = new Vector();
        this.f151ab = true;
        this.f154ae = new C0025ay();
        this.f155af = new C0025ay();
        this.f156ag = new C0025ay(0, C0031c.m231c(40), C0031c.m231c(40));
        this.f157ah = new C0025ay();
        this.f165ap = new Command(C0026az.m177a(C0026az.f303d), 2, 1);
        this.f166aq = new StringBuffer();
        this.f167ar = new char[128];
        this.f168as = 6316128;
        this.f169at = 0;
        f119aF = this;
        m128e();
    }

    /* JADX INFO: renamed from: a */
    private void m93a(Graphics graphics, StringBuffer stringBuffer, int i, int i2, int i3) {
        int length = stringBuffer.length();
        stringBuffer.getChars(0, length, this.f167ar, 0);
        graphics.drawChars(this.f167ar, 0, length, i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    private static void m94a(C0052x c0052x) {
        c0052x.mo12d();
        C0052x.f539i = (c0052x.mo7a() * C0052x.f536f) + 24;
        C0052x.f540j = 0;
    }

    /* JADX INFO: renamed from: b */
    private void m95b(int i, int i2) {
        for (int i3 = 0; i3 < this.f183i.length; i3++) {
            C0003ac c0003ac = this.f182h[i3];
            int iM231c = C0031c.m231c(18);
            if (c0003ac.f402A && c0003ac.f422y == m99k().f197w) {
                this.f198x.m173a(0, 0, (int) (((((long) ((int) ((((long) iM231c) * 196608) >> 16))) << 32) / 262144) >> 16));
                C0031c.m227b(this.f198x, c0003ac.f454J);
                C0031c.m239d(this.f198x);
                C0031c.m215a(this.f198x, i2 << 3);
                C0031c.m216a(this.f198x, c0003ac.f454J);
                c0003ac.mo254a(this.f198x);
            }
            if (c0003ac.f454J.f251c > iM231c) {
                this.f198x.m174a(c0003ac.f454J);
                this.f198x.f251c = iM231c;
                c0003ac.mo254a(this.f198x);
            }
            this.f183i[i3].mo119b(i);
        }
        C0033e c0033e = (C0033e) this.f183i[this.f147aA];
        this.f191q.m182a(c0033e.f436m.f245a, c0033e.f436m.f246b, C0031c.f381f);
    }

    /* JADX INFO: renamed from: b */
    private void m96b(String str) throws Exception {
        int i;
        C0035g c0035g;
        InputStream resourceAsStream = getClass().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IOException("File not found");
        }
        this.f142W = 0;
        Vector vector = new Vector();
        String str2 = null;
        String str3 = null;
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        Vector vector4 = new Vector();
        String str4 = null;
        C0035g c0035g2 = null;
        this.f149aC = 1;
        C0004ad c0004ad = new C0004ad(resourceAsStream, 4096);
        int i2 = 0;
        String str5 = null;
        while (!c0004ad.m41b()) {
            String strM42c = c0004ad.m42c();
            int iIndexOf = strM42c.indexOf(58);
            if (iIndexOf != -1) {
                String strSubstring = strM42c.substring(0, iIndexOf);
                String strSubstring2 = strM42c.substring(iIndexOf + 1, strM42c.length());
                if (strSubstring.equals("texture")) {
                    this.f192r.f48d.m78b(strSubstring2, strSubstring2);
                    vector.addElement(strSubstring2);
                } else if (strSubstring.equals("geometry")) {
                    this.f192r.f48d.m75a(strSubstring2, strSubstring2);
                    str2 = strSubstring2;
                } else if (strSubstring.equals("collision")) {
                    str3 = strSubstring2;
                } else if (strSubstring.equals("music")) {
                    str5 = strSubstring2;
                } else if (strSubstring.equals("buildinglayer")) {
                    this.f149aC = Integer.parseInt(strSubstring2, 10);
                } else if (strSubstring.equals("bgimage")) {
                    this.f176b = strSubstring2;
                    if (this.f151ab) {
                        this.f177c = Image.createImage(this.f176b);
                    } else {
                        this.f177c = null;
                    }
                } else if (strSubstring.equals("bgtopcolor")) {
                    this.f178d = Integer.parseInt(strSubstring2, 16);
                } else if (strSubstring.equals("bgbottomcolor")) {
                    this.f179e = Integer.parseInt(strSubstring2, 16);
                } else if (strSubstring.equals("bgoffset")) {
                    this.f181g = Integer.parseInt(strSubstring2);
                } else if (strSubstring.equals("hudcolor1")) {
                    this.f168as = Integer.parseInt(strSubstring2, 16);
                } else if (strSubstring.equals("hudcolor2")) {
                    this.f169at = Integer.parseInt(strSubstring2, 16);
                } else if (strSubstring.equals("bgsprite")) {
                    int iIndexOf2 = strSubstring2.indexOf(44);
                    int iIndexOf3 = strSubstring2.indexOf(44, iIndexOf2 + 1);
                    int iIndexOf4 = strSubstring2.indexOf(44, iIndexOf3 + 1);
                    int iIndexOf5 = strSubstring2.indexOf(44, iIndexOf4 + 1);
                    String strSubstring3 = strSubstring2.substring(0, iIndexOf2);
                    C0040l c0040l = new C0040l(this.f192r);
                    int i3 = Integer.parseInt(strSubstring2.substring(iIndexOf2 + 1, iIndexOf3));
                    c0040l.m300a(i3, i3, strSubstring3);
                    c0040l.m298a();
                    c0040l.mo251a(C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf3 + 1, iIndexOf4))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf4 + 1, iIndexOf5))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf5 + 1, strSubstring2.length()))));
                    this.f120A.f460Y.m16a(c0040l);
                } else if (strSubstring.equals("base")) {
                    int iIndexOf6 = strSubstring2.indexOf(44);
                    int iIndexOf7 = strSubstring2.indexOf(44, iIndexOf6 + 1);
                    vector2.addElement(new C0025ay(C0031c.m231c(Integer.parseInt(strSubstring2.substring(0, iIndexOf6))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf6 + 1, iIndexOf7))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf7 + 1, strSubstring2.length())))));
                } else if (strSubstring.equals("playerspawn")) {
                    int iIndexOf8 = strSubstring2.indexOf(44);
                    int iIndexOf9 = strSubstring2.indexOf(44, iIndexOf8 + 1);
                    this.f136Q[i2] = new C0025ay(C0031c.m231c(Integer.parseInt(strSubstring2.substring(0, iIndexOf8))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf8 + 1, iIndexOf9))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf9 + 1, strSubstring2.length()))));
                } else if (strSubstring.equals("playerrotation")) {
                    int iM224b = C0031c.m224b(C0031c.m210a(C0031c.m231c(Integer.parseInt(strSubstring2)), 205887), C0031c.m231c(180));
                    if (iM224b < 0) {
                        iM224b += 411774;
                    } else if (iM224b > 411774) {
                        iM224b -= 411774;
                    }
                    this.f137R[i2] = iM224b;
                    i2++;
                } else if (strSubstring.equals("time")) {
                    this.f141V = Integer.parseInt(strSubstring2) * 1000;
                } else if (strSubstring.equals("thinktime")) {
                    this.f184j = Integer.parseInt(strSubstring2);
                } else if (strSubstring.equals("deliverytime")) {
                    this.f140U = Integer.parseInt(strSubstring2) * 1000;
                } else if (strSubstring.equals("initialdelivery")) {
                    this.f139T = Integer.parseInt(strSubstring2) * 1000;
                } else if (strSubstring.equals("piececount")) {
                    int iIndexOf10 = strSubstring2.indexOf(44);
                    this.f143X[this.f142W] = strSubstring2.substring(0, iIndexOf10);
                    this.f144Y[this.f142W] = Integer.parseInt(strSubstring2.substring(iIndexOf10 + 1, strSubstring2.length()));
                    this.f142W++;
                } else {
                    if (strSubstring.equals("piecestart")) {
                        c0035g = new C0035g();
                    } else if (strSubstring.equals("piecemins")) {
                        int iIndexOf11 = strSubstring2.indexOf(44);
                        int iIndexOf12 = strSubstring2.indexOf(44, iIndexOf11 + 1);
                        C0025ay c0025ay = new C0025ay(C0031c.m231c(Integer.parseInt(strSubstring2.substring(0, iIndexOf11))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf11 + 1, iIndexOf12))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf12 + 1, strSubstring2.length()))));
                        C0031c.m226b(c0025ay, C0031c.m231c(10));
                        c0035g2.f449j.f247a.m174a(c0025ay);
                    } else if (strSubstring.equals("piecemaxs")) {
                        int iIndexOf13 = strSubstring2.indexOf(44);
                        int iIndexOf14 = strSubstring2.indexOf(44, iIndexOf13 + 1);
                        C0025ay c0025ay2 = new C0025ay(C0031c.m231c(Integer.parseInt(strSubstring2.substring(0, iIndexOf13))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf13 + 1, iIndexOf14))), C0031c.m231c(Integer.parseInt(strSubstring2.substring(iIndexOf14 + 1, strSubstring2.length()))));
                        C0031c.m226b(c0025ay2, C0031c.m231c(10));
                        c0035g2.f449j.f248b.m174a(c0025ay2);
                    } else if (strSubstring.equals("piecezoffset")) {
                        c0035g2.f448i = C0031c.m231c(Integer.parseInt(strSubstring2));
                        c0035g2.f448i = C0031c.m224b(c0035g2.f448i, C0031c.m231c(10));
                    } else if (strSubstring.equals("piecemesh")) {
                        this.f192r.f48d.m75a(strSubstring2, strSubstring2);
                        c0035g2.f441b = strSubstring2;
                    } else if (strSubstring.equals("piececap")) {
                        c0035g2.f446g = strSubstring2;
                    } else if (strSubstring.equals("piecestorymesh")) {
                        this.f192r.f48d.m75a(strSubstring2, strSubstring2);
                        vector3.addElement(strSubstring2);
                    } else if (strSubstring.equals("piecestorycapmesh")) {
                        this.f192r.f48d.m75a(strSubstring2, strSubstring2);
                        vector4.addElement(strSubstring2);
                    } else if (strSubstring.equals("piecetexture")) {
                        this.f192r.f48d.m78b(strSubstring2, strSubstring2);
                        str4 = strSubstring2;
                    } else if (strSubstring.equals("piecebase")) {
                        c0035g2.f445f = strSubstring2;
                    } else if (strSubstring.equals("pieceend")) {
                        c0035g2.f440a = strSubstring2;
                        c0035g2.f442c = new String[vector3.size()];
                        int i4 = 0;
                        while (true) {
                            int i5 = i4;
                            if (i5 >= vector3.size()) {
                                break;
                            }
                            c0035g2.f442c[i5] = (String) vector3.elementAt(i5);
                            i4 = i5 + 1;
                        }
                        vector3.removeAllElements();
                        c0035g2.f443d = new String[vector4.size()];
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            if (i7 >= vector4.size()) {
                                break;
                            }
                            c0035g2.f443d[i7] = (String) vector4.elementAt(i7);
                            i6 = i7 + 1;
                        }
                        vector4.removeAllElements();
                        c0035g2.f444e = str4;
                        c0035g2.f447h = c0035g2.f442c.length;
                        this.f125F.put(strSubstring2, c0035g2);
                        c0035g = null;
                    }
                    c0035g2 = c0035g;
                }
            }
            c0035g = c0035g2;
            c0035g2 = c0035g;
        }
        try {
            c0004ad.m40a();
            while (true) {
                int i8 = i;
                if (i8 >= this.f121B) {
                    break;
                }
                this.f122C[i8] = (C0025ay) vector2.elementAt(i8);
                i = i8 + 1;
            }
        } catch (IOException e) {
        }
        int i9 = (this.f178d & 16711680) >> 16;
        int i10 = (this.f178d & 65280) >> 8;
        int i11 = this.f178d & 255;
        int i12 = (this.f179e & 16711680) >> 16;
        int i13 = (this.f179e & 65280) >> 8;
        int i14 = this.f179e & 255;
        this.f180f = new int[6];
        for (int i15 = 0; i15 < this.f180f.length; i15++) {
            this.f180f[(this.f180f.length - i15) - 1] = (((((i9 - i12) * (i15 + 1)) / (this.f180f.length + 1)) + i12) << 16) + (((((i10 - i13) * (i15 + 1)) / (this.f180f.length + 1)) + i13) << 8) + (((i11 - i14) * (i15 + 1)) / (this.f180f.length + 1)) + i14;
        }
        InputStream resourceAsStream2 = getClass().getResourceAsStream(str3);
        this.f200z.f487a = C0049u.m331a(resourceAsStream2);
        resourceAsStream2.close();
        this.f197w = new C0032d(this.f192r);
        this.f197w.m250a(0);
        this.f197w.m261g();
        this.f197w.f410m = 0;
        this.f197w.f413p = C0031c.m231c(2);
        this.f197w.f412o = C0031c.m231c(2);
        C0005ae c0005ae = new C0005ae(this.f192r);
        c0005ae.m45a(str2);
        if (vector.size() == 1) {
            c0005ae.m47b((String) vector.elementAt(0));
        } else if (vector.size() > 1) {
            String[] strArr = new String[vector.size()];
            int i16 = 0;
            while (true) {
                int i17 = i16;
                if (i17 >= vector.size()) {
                    break;
                }
                strArr[i17] = (String) vector.elementAt(i17);
                i16 = i17 + 1;
            }
            c0005ae.m46a(strArr);
        }
        c0005ae.m44a(0);
        this.f197w.m16a(c0005ae);
        this.f192r.f47c.m16a((C0037i) this.f197w);
        this.f121B = vector2.size();
        this.f122C = new C0025ay[this.f121B];
        this.f123D = new C0000a[this.f121B];
        i = 0;
        if (str5 != null) {
            C0053y.m338a().m340a(str5, str5, "audio/midi");
            C0053y.m338a().m341a(str5, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX INFO: renamed from: f */
    private void m97f(int i) {
        int i2;
        int i3;
        int i4;
        this.f153ad += i;
        if (this.f153ad > 6000) {
            this.f161al = 0;
            this.f162am = 0;
            this.f163an = 0;
            this.f164ao = 0;
            for (int i5 = 0; i5 < this.f123D.length; i5++) {
                C0000a c0000a = this.f123D[i5];
                if (c0000a != null) {
                    if (c0000a.f0a == null) {
                        i2 = c0000a.f2c;
                        i3 = 10;
                    } else {
                        i2 = c0000a.f2c - 1;
                        if (i2 >= 5) {
                            i4 = 200;
                        } else {
                            i3 = 25;
                        }
                        if (c0000a.f6g == 1) {
                            this.f161al = i4 + this.f161al;
                            this.f162am++;
                        } else {
                            this.f163an = i4 + this.f163an;
                            this.f164ao++;
                        }
                    }
                    i4 = i3 * i2;
                    if (c0000a.f6g == 1) {
                        this.f161al = i4 + this.f161al;
                        this.f162am++;
                    } else {
                        this.f163an = i4 + this.f163an;
                        this.f164ao++;
                    }
                }
            }
            this.f150aa = true;
            this.f492aD.m141a(Dropscape.f389g);
        }
    }

    /* JADX INFO: renamed from: g */
    private int m98g(int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.f185k[i2] == i) {
                return 1 << i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static C0013am m99k() {
        return f119aF;
    }

    /* JADX INFO: renamed from: n */
    private void m100n() throws Exception {
        C0037i c0037i;
        InterfaceC0051w[] interfaceC0051wArr;
        C0033e c0033e;
        C0037i c0037i2;
        C0003ac c0003ac;
        int i = 0;
        try {
            this.f192r = new C0006af();
            C0053y.m338a().m342a(this.f145Z);
            this.f120A = new C0007ag(this.f192r);
            this.f120A.m63b(new C0025ay(0, 0, C0031c.m231c(-10)));
            this.f120A.f63c = 0;
            this.f120A.m68e(7);
            this.f120A.m69f(256);
            this.f120A.f75o = 4;
            this.f120A.f76p = this;
            this.f192r.f47c = this.f120A;
            this.f200z.f489c = 1 << this.f120A.f65e;
            C0008ah c0008ah = this.f192r.f48d;
            c0008ah.m75a("ship", "/models/highship");
            c0008ah.m73a("target", 16, 16, 32, 32, 0, 4, false, "/sprites/arrow");
            c0008ah.m73a("ship", 64, 32, 128, 128, 0, 8, true, "/sprites/spaceship_red");
            c0008ah.m74a("stunMissile", 64, 64, 128, 128, 0, 4, true, "/sprites/stunmissile", 2);
            c0008ah.m74a("stunMissile3Pack", 64, 64, 128, 128, 0, 4, true, "/sprites/3missile", 1);
            c0008ah.m74a("puttyMissile", 64, 64, 128, 128, 0, 4, true, "/sprites/puttymissile", 1);
            c0008ah.m74a("demoBomb", 64, 64, 128, 128, 0, 4, true, "/sprites/demobomb", 1);
            c0008ah.m74a("balloon", 64, 64, 128, 128, 0, 4, true, "/sprites/balloon", 1);
            c0008ah.m74a("nukie", 64, 64, 128, 128, 0, 4, true, "/sprites/nukie", 1);
            c0008ah.m74a("stunMissileFire", 64, 64, 128, 128, 0, 4, true, "/sprites/fire", 2);
            c0008ah.m74a("sparks", 64, 64, 128, 128, 0, 4, true, "/sprites/sparks", 2);
            c0008ah.m74a("explode", 64, 64, 128, 128, 0, 4, true, "/sprites/explode1", 1);
            c0008ah.m74a("nukieExplode", 64, 64, 128, 128, 0, 4, true, "/sprites/explode2", 1);
            c0008ah.m73a("yellowGlow", 32, 32, 32, 32, 0, 1, true, "/sprites/yellowGlow");
            c0008ah.m73a("yellowBeam", 32, 32, 32, 32, 0, 1, true, "/sprites/moon");
            c0008ah.m73a("redGlow", 32, 32, 32, 32, 0, 1, true, "/sprites/redGlow");
            c0008ah.m73a("redBeam", 32, 32, 32, 32, 0, 1, true, "/sprites/moon");
            c0008ah.m73a("moon1", 32, 32, 32, 32, 0, 1, false, "/sprites/moon");
            C0053y.m338a().m340a("stunHit", "/sounds/stun_hit.wav", "audio/x-wav");
            C0053y.m338a().m340a("puttyHit", "/sounds/putty_hit.wav", "audio/x-wav");
            C0053y.m338a().m340a("bombHit", "/sounds/bomb_hit.wav", "audio/x-wav");
            C0053y.m338a().m340a("shootPiece", "/sounds/shoot_piece.wav", "audio/x-wav");
            C0053y.m338a().m340a("pickup", "/sounds/pickup.wav", "audio/x-wav");
            m96b(this.f146a);
            this.f191q = new C0027b(this.f192r);
            this.f191q.m183b(C0031c.m237d(C0031c.m231c(45)), C0031c.m231c(1), C0031c.m231c(80));
            this.f120A.m16a(this.f191q);
            this.f124E = new C0040l(this.f192r);
            this.f124E.m300a(25, 25, "target");
            this.f124E.f474d = 250;
            this.f124E.m298a();
            this.f124E.m303b(2);
            boolean z = this.f173ax != null;
            boolean z2 = z && !this.f172aw;
            this.f182h[0] = new C0003ac(this.f192r);
            this.f182h[0].mo254a(this.f136Q[0]);
            this.f182h[0].m27b(!z2);
            if (z2) {
                C0040l c0040l = new C0040l(this.f192r);
                c0040l.m300a(600, 300, "ship");
                c0040l.m298a();
                c0040l.f474d = 25;
                c0037i = c0040l;
            } else {
                C0005ae c0005ae = new C0005ae(this.f192r);
                c0005ae.m45a("ship");
                c0005ae.m44a(2);
                c0037i = c0005ae;
            }
            this.f182h[0].m28c(c0037i);
            this.f120A.m16a((C0037i) this.f182h[0]);
            if (z2) {
                interfaceC0051wArr = this.f183i;
                c0033e = new C0033e(this.f182h[0], null);
            } else {
                interfaceC0051wArr = this.f183i;
                c0033e = new C0033e(this.f182h[0], this.f124E);
            }
            interfaceC0051wArr[0] = c0033e;
            this.f183i[0].mo108a(this.f137R[0]);
            if (!z2) {
                this.f182h[0].f22S = this;
            }
            this.f182h[1] = new C0003ac(this.f192r);
            this.f182h[1].mo254a(this.f136Q[1]);
            this.f182h[1].m27b(z2);
            C0040l c0040l2 = null;
            if (z2) {
                C0005ae c0005ae2 = new C0005ae(this.f192r);
                c0005ae2.m45a("ship");
                c0005ae2.m44a(2);
                c0003ac = this.f182h[1];
                c0037i2 = c0005ae2;
            } else {
                C0040l c0040l3 = new C0040l(this.f192r);
                c0040l3.m300a(600, 300, "ship");
                c0040l3.m298a();
                c0040l3.f474d = 50;
                c0037i2 = c0040l3;
                c0040l2 = c0040l3;
                c0003ac = this.f182h[1];
            }
            c0003ac.m28c(c0037i2);
            this.f120A.m16a((C0037i) this.f182h[1]);
            if (!z) {
                this.f183i[1] = new C0048t(this.f182h[1], c0040l2);
                this.f182h[1].f22S = this.f183i[1];
            } else if (z2) {
                this.f183i[1] = new C0033e(this.f182h[1], this.f124E);
            } else {
                this.f183i[1] = new C0033e(this.f182h[1], null);
            }
            this.f183i[1].mo108a(this.f137R[1]);
            if (z2) {
                this.f182h[1].f22S = this;
            }
            if (z2) {
                i = 1;
            }
            this.f147aA = i;
            C0045q c0045q = new C0045q(this.f192r);
            this.f198x.m173a(C0031c.m231c(-1), C0031c.m231c(1), C0031c.m231c(-2));
            C0031c.m239d(this.f198x);
            c0045q.m314b(this.f198x);
            c0045q.m313a(C0031c.m231c(1));
            this.f120A.m16a(c0045q);
            System.gc();
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m101o() {
        this.f170au = 0;
        this.f171av = false;
        this.f172aw = false;
        if (this.f173ax != null) {
            try {
                this.f173ax.m283b();
            } catch (IOException e) {
            }
            this.f173ax = null;
        }
        if (this.f174ay != null) {
            this.f174ay.m310a();
            this.f174ay = null;
        }
        this.f187m = 0;
        this.f189o = 0;
        this.f147aA = 0;
    }

    /* JADX INFO: renamed from: p */
    private void m102p() {
        int iM209a = C0031c.m209a(this.f153ad) / 4;
        if (iM209a > C0031c.m231c(1)) {
            iM209a = C0031c.m231c(1);
        }
        C0031c.m229b(this.f198x, this.f156ag, this.f154ae);
        C0031c.m215a(this.f198x, iM209a);
        C0031c.m216a(this.f198x, this.f154ae);
        C0031c.m229b(this.f199y, this.f157ah, this.f155af);
        C0031c.m215a(this.f199y, iM209a);
        C0031c.m216a(this.f199y, this.f155af);
        this.f191q.m182a(this.f198x, this.f199y, C0031c.f381f);
    }

    /* JADX INFO: renamed from: q */
    private void m103q() {
        int[] iArr;
        int i;
        int i2;
        C0033e c0033e = (C0033e) this.f183i[this.f147aA];
        int i3 = c0033e.f436m.f246b.f249a;
        int i4 = c0033e.f436m.f246b.f250b;
        int iM242f = C0031c.m242f(((int) ((((long) i3) * ((long) i3)) >> 16)) + ((int) ((((long) i4) * ((long) i4)) >> 16)));
        int i5 = (int) (((((long) i3) << 32) / ((long) iM242f)) >> 16);
        int i6 = (int) (((((long) i4) << 32) / ((long) iM242f)) >> 16);
        this.f129J = 0;
        for (int i7 = this.f120A.f17E - 1; i7 >= 0 && this.f129J < 10; i7--) {
            C0037i c0037iM17b = this.f120A.m17b(i7);
            int i8 = c0037iM17b.f453I;
            if (c0037iM17b != this.f182h[this.f147aA] && (i8 & 7168) != 0) {
                C0025ay c0025ay = c0037iM17b.f454J;
                C0025ay c0025ay2 = this.f182h[this.f147aA].f454J;
                int i9 = c0025ay.f249a - c0025ay2.f249a;
                int i10 = c0025ay.f250b - c0025ay2.f250b;
                if (((int) ((((long) i9) * ((long) i9)) >> 16)) + ((int) ((((long) i10) * ((long) i10)) >> 16)) < 104857600) {
                    if ((i8 & 2048) > 0) {
                        iArr = this.f130K;
                        i = this.f129J;
                        i2 = 16711680;
                    } else if ((i8 & 4096) > 0) {
                        iArr = this.f130K;
                        i = this.f129J;
                        i2 = 255;
                    } else {
                        if ((i8 & 1024) > 0) {
                            iArr = this.f130K;
                            i = this.f129J;
                            i2 = 65280;
                        }
                        this.f131L[this.f129J] = C0031c.m223b(((int) ((((long) i6) * ((long) i9)) >> 16)) - ((int) ((((long) i5) * ((long) i10)) >> 16))) / 2;
                        this.f132M[this.f129J] = (-C0031c.m223b(((int) ((((long) i5) * ((long) i9)) >> 16)) + ((int) ((((long) i10) * ((long) i6)) >> 16)))) / 2;
                        this.f129J++;
                    }
                    iArr[i] = i2;
                    this.f131L[this.f129J] = C0031c.m223b(((int) ((((long) i6) * ((long) i9)) >> 16)) - ((int) ((((long) i5) * ((long) i10)) >> 16))) / 2;
                    this.f132M[this.f129J] = (-C0031c.m223b(((int) ((((long) i5) * ((long) i9)) >> 16)) + ((int) ((((long) i10) * ((long) i6)) >> 16)))) / 2;
                    this.f129J++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    private void m104r() {
        C0032d c0032d;
        C0032d c0029bb;
        int i;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f135P; i4++) {
            AbstractC0050v abstractC0050v = this.f134O[i4];
            if (!abstractC0050v.m286c(2048) && abstractC0050v.f451G == this.f120A) {
                if (abstractC0050v.m286c(4096)) {
                    i2++;
                } else {
                    i3++;
                }
            }
        }
        if (this.f138S.nextInt() % 2 != 0 || i2 >= 2 || this.f142W <= 0) {
            if (i3 < 2) {
                int iAbs = Math.abs(this.f138S.nextInt() % 8);
                if (iAbs == 7) {
                    c0029bb = new C0029bb(2, this.f192r);
                } else if (iAbs == 6) {
                    c0029bb = new C0029bb(4, this.f192r);
                } else if (iAbs == 5) {
                    c0029bb = new C0029bb(3, this.f192r);
                } else if (iAbs == 4) {
                    c0029bb = new C0029bb(5, this.f192r);
                } else {
                    c0029bb = iAbs == 3 ? new C0029bb(0, this.f192r) : new C0029bb(1, this.f192r);
                }
            } else {
                c0032d = null;
            }
            if (c0032d != null) {
                int iNextInt = this.f138S.nextInt() % 30;
                if (this.f138S.nextInt() % 2 == 0) {
                    i = 1;
                } else {
                    i = -1;
                }
                c0032d.mo251a(C0031c.m231c(i * iNextInt), C0031c.m231c((this.f138S.nextInt() % 30) * (this.f138S.nextInt() % 2 != 0 ? -1 : 1)), C0031c.m231c(40));
                this.f198x.m173a(0, 0, C0031c.m231c(-1));
                c0032d.m256c(this.f198x);
                this.f120A.m16a((C0037i) c0032d);
            }
        }
        String str = this.f143X[this.f142W - 1];
        int[] iArr = this.f144Y;
        int i5 = this.f142W - 1;
        iArr[i5] = iArr[i5] - 1;
        if (this.f144Y[this.f142W - 1] < 1) {
            this.f142W--;
        }
        C0041m c0041m = new C0041m(this.f192r);
        c0041m.m305a((C0035g) this.f125F.get(str));
        c0029bb = c0041m;
        c0032d = c0029bb;
        if (c0032d != null) {
            int iNextInt2 = this.f138S.nextInt() % 30;
            if (this.f138S.nextInt() % 2 == 0) {
                i = 1;
            } else {
                i = -1;
            }
            c0032d.mo251a(C0031c.m231c(i * iNextInt2), C0031c.m231c((this.f138S.nextInt() % 30) * (this.f138S.nextInt() % 2 != 0 ? -1 : 1)), C0031c.m231c(40));
            this.f198x.m173a(0, 0, C0031c.m231c(-1));
            c0032d.m256c(this.f198x);
            this.f120A.m16a((C0037i) c0032d);
        }
    }

    /* JADX INFO: renamed from: s */
    private void m105s() {
        this.f150aa = true;
        this.f492aD.m141a(Dropscape.f387e);
    }

    /* JADX INFO: renamed from: t */
    private void m106t() {
        this.f150aa = true;
        this.f492aD.m141a(Dropscape.f386d);
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: a */
    public final void mo107a() {
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: a */
    public final void mo108a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final void m109a(int i, int i2) {
        if (i2 < 0 || i2 >= this.f185k.length) {
            return;
        }
        this.f185k[i2] = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m110a(C0016ap c0016ap) {
        this.f133N.addElement(c0016ap);
    }

    /* JADX INFO: renamed from: a */
    public final void m111a(C0022av c0022av, C0032d c0032d, C0028ba c0028ba) {
        C0031c.m218a(this.f198x, c0022av.f245a, c0022av.f246b);
        c0028ba.f330a = this.f200z.m307a(c0022av.f245a, this.f198x, (c0032d == this.f182h[0] || c0032d == this.f182h[1]) ? 131072 : -c0032d.f416s.f247a.f251c, c0028ba.f332c);
        if (c0028ba.f330a != -65536) {
            C0031c.m217a(c0028ba.f331b, c0022av.f246b, c0028ba.f330a);
            C0031c.m216a(c0028ba.f331b, c0022av.f245a);
            c0028ba.f334e = this.f197w;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m112a(C0036h c0036h, boolean z, String str) {
        this.f146a = str;
        this.f170au = 0;
        this.f171av = false;
        this.f172aw = z;
        this.f173ax = c0036h;
        this.f147aA = 0;
        this.f148aB = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m113a(String str) {
        this.f146a = str;
        this.f170au = 0;
        this.f171av = false;
        this.f172aw = false;
        this.f173ax = null;
        this.f174ay = null;
        this.f147aA = 0;
        this.f148aB = false;
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: a */
    public final void mo114a(Graphics graphics) {
        int i;
        int i2;
        int i3;
        int iM308l = m308l();
        int iM309m = m309m();
        if (this.f150aa || this.f197w == null) {
            graphics.setColor(11851504);
            graphics.fillRect(0, 0, iM308l, iM309m);
            graphics.setFont(this.f193s);
            graphics.setColor(0);
            graphics.drawString(C0026az.m177a(C0026az.f305f), iM308l / 2, (iM309m / 2) - 10, 17);
            return;
        }
        int iM223b = ((iM309m / 2) + this.f181g) - C0031c.m223b((int) ((((long) ((int) (((((long) ((C0033e) this.f183i[this.f147aA]).f428e) << 32) / 411774) >> 16))) * 67108864) >> 16));
        if (!this.f151ab || this.f177c == null) {
            int length = this.f180f.length / 2;
            graphics.setColor(this.f178d);
            graphics.fillRect(0, 0, iM308l, iM223b - length);
            for (int length2 = this.f180f.length - 1; length2 >= 0; length2--) {
                graphics.setColor(this.f180f[length2]);
                graphics.drawLine(0, (iM223b - length) + length2, iM308l, (iM223b - length) + length2);
            }
            graphics.setColor(this.f179e);
            i = 0;
            i2 = iM223b + length;
            i3 = iM223b + length;
        } else {
            int width = this.f177c.getWidth();
            int iM231c = C0031c.m231c(width * 4);
            int height = this.f177c.getHeight();
            int iM223b2 = width - (C0031c.m223b((int) ((((long) ((int) (((((long) ((C0033e) this.f183i[this.f147aA]).f427d) << 32) / 411774) >> 16))) * ((long) iM231c)) >> 16)) % width);
            graphics.setColor(this.f178d);
            graphics.fillRect(0, 0, iM308l, iM223b - height);
            int i4 = (-iM223b2) + width;
            if ((-iM223b2) < iM308l && i4 >= 0) {
                graphics.drawImage(this.f177c, -iM223b2, iM223b - height, 20);
            }
            if (i4 < iM308l && i4 + width >= 0) {
                graphics.drawImage(this.f177c, i4, iM223b - height, 20);
            }
            graphics.setColor(this.f179e);
            i = 0;
            i3 = iM223b;
            i2 = iM223b;
        }
        graphics.fillRect(i, i2, iM308l, iM309m - i3);
        this.f192r.f47c.m287a(graphics, this.f191q);
        graphics.setFont(this.f194t);
        graphics.setColor(this.f169at);
        graphics.translate(18, 10);
        graphics.drawLine(-8, 0, 8, 0);
        graphics.drawLine(-4, 10, 4, 10);
        graphics.drawLine(-4, 20, 4, 20);
        graphics.drawLine(-4, 30, 4, 30);
        graphics.drawLine(-8, 40, 8, 40);
        graphics.drawLine(0, 0, 0, 40);
        graphics.setColor(48896);
        int i5 = (this.f182h[this.f147aA].f454J.f251c / 32768) + 5;
        graphics.fillTriangle(0, 40 - i5, 10, 40 - (i5 - 5), 10, 40 - (i5 + 5));
        graphics.setColor(this.f168as);
        graphics.translate(-18, -10);
        if (this.f141V < 10000 && this.f141V % 1000 < 500) {
            graphics.setColor(16711680);
        }
        int i6 = this.f141V / 60000;
        int i7 = (this.f141V % 60000) / 1000;
        this.f166aq.delete(0, this.f166aq.length());
        this.f166aq.append(i6);
        this.f166aq.append(':');
        if (i7 < 10) {
            this.f166aq.append('0');
        }
        this.f166aq.append(i7);
        m93a(graphics, this.f166aq, iM308l / 2, 10, 17);
        graphics.setColor(this.f168as);
        graphics.translate(iM308l - 50, 10);
        graphics.setColor(48896);
        graphics.fillArc(0, 0, 40, 40, this.f127H, 8);
        graphics.setColor(40704);
        graphics.fillArc(0, 0, 40, 40, this.f127H - 8, 8);
        graphics.setColor(32512);
        graphics.fillArc(0, 0, 40, 40, this.f127H - 16, 8);
        graphics.setColor(this.f168as);
        graphics.drawLine(10, 20, 30, 20);
        graphics.drawLine(20, 10, 20, 30);
        graphics.setColor(this.f169at);
        graphics.drawArc(0, 0, 40, 40, 0, 360);
        for (int i8 = 0; i8 < this.f129J; i8++) {
            graphics.setColor(this.f130K[i8]);
            graphics.fillRect(this.f131L[i8] + 18, this.f132M[i8] + 18, 5, 5);
        }
        graphics.setColor(this.f169at);
        graphics.translate(-(iM308l - 50), -10);
        if (this.f159aj != null) {
            graphics.setFont(this.f196v);
            graphics.setColor(0);
            graphics.translate(iM308l / 2, iM309m / 2);
            this.f159aj.m335c(graphics);
            graphics.translate((-iM308l) / 2, (-iM309m) / 2);
        }
        if (this.f158ai != null) {
            graphics.setFont(this.f195u);
            graphics.setColor(0);
            graphics.translate(iM308l / 2, iM309m / 2);
            this.f158ai.m335c(graphics);
            graphics.translate((-iM308l) / 2, (-iM309m) / 2);
        }
        if (this.f160ak != null) {
            graphics.setFont(this.f195u);
            graphics.setColor(0);
            graphics.translate(iM308l / 2, iM309m / 2);
            this.f160ak.m335c(graphics);
            graphics.translate((-iM308l) / 2, (-iM309m) / 2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m115a(AbstractC0050v abstractC0050v) {
        int i = 0;
        while (i < this.f135P && this.f134O[i] != abstractC0050v) {
            i++;
        }
        if (i == this.f135P) {
            if (this.f134O.length < this.f135P + 1) {
                AbstractC0050v[] abstractC0050vArr = new AbstractC0050v[this.f135P + 1];
                System.arraycopy(this.f134O, 0, abstractC0050vArr, 0, this.f134O.length);
                this.f134O = abstractC0050vArr;
            }
            this.f134O[this.f135P] = abstractC0050v;
            this.f135P++;
        }
    }

    @Override // p000.InterfaceC0018ar
    /* JADX INFO: renamed from: a */
    public final void mo116a(C0052x c0052x, int i) {
        if (c0052x == this.f160ak) {
            this.f160ak = null;
            if (i == 0) {
                if (this.f173ax != null) {
                    m105s();
                } else {
                    m106t();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m117a(boolean z) {
        C0053y.m338a().m342a(z);
        this.f145Z = z;
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: b */
    public final void mo118b() {
    }

    @Override // p000.AbstractC0043o, p000.InterfaceC0051w
    /* JADX INFO: renamed from: b */
    public final void mo119b(int i) {
        if (this.f197w == null) {
            return;
        }
        if (!(this.f158ai == null && this.f159aj == null) && this.f192r.f46b > 0) {
            return;
        }
        if (this.f160ak != null) {
            this.f160ak.m333b(i);
        }
        if (this.f173ax != null) {
            i = 100;
            if (this.f171av) {
                return;
            }
        }
        int i2 = this.f192r.f45a;
        int iM209a = C0031c.m209a(i);
        this.f192r.m49a(i);
        if (this.f152ac == 0) {
            m95b(i, iM209a);
        } else {
            m102p();
        }
        for (int size = this.f133N.size() - 1; size >= 0; size--) {
            ((C0016ap) this.f133N.elementAt(size)).m157a(iM209a);
        }
        this.f126G += i;
        if (this.f127H > 2880) {
            this.f127H -= 2880;
        }
        this.f127H = this.f126G / 8;
        if (this.f128I < i2) {
            this.f128I = i2 + 150;
            m103q();
        }
        if (this.f139T < i2) {
            this.f139T = this.f140U + i2;
            m104r();
        }
        if (this.f152ac != 0) {
            if (this.f152ac == 1) {
                m97f(i);
            }
        } else {
            if (this.f141V > 0) {
                this.f141V -= i;
                return;
            }
            this.f152ac = 1;
            C0033e c0033e = (C0033e) this.f183i[this.f147aA];
            this.f154ae.m174a(c0033e.f436m.f245a);
            this.f155af.m174a(c0033e.f436m.f246b);
            C0031c.m229b(this.f157ah, C0031c.f376a, this.f156ag);
            C0031c.m239d(this.f157ah);
            this.f141V = 0;
            this.f153ad = 0;
            this.f182h[0].m33o();
            this.f182h[1].m33o();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m120b(C0016ap c0016ap) {
        this.f133N.removeElement(c0016ap);
    }

    /* JADX INFO: renamed from: b */
    public final void m121b(AbstractC0050v abstractC0050v) {
        int i = 0;
        while (i < this.f135P && this.f134O[i] != abstractC0050v) {
            i++;
        }
        if (i != this.f135P) {
            this.f134O[i] = null;
            System.arraycopy(this.f134O, i + 1, this.f134O, i, this.f135P - (i + 1));
            this.f135P--;
            this.f134O[this.f135P] = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m122b(boolean z) {
        this.f151ab = z;
        if (this.f192r != null) {
            if (!this.f151ab) {
                if (this.f177c != null) {
                    this.f177c = null;
                }
            } else {
                if (this.f177c != null || this.f176b == null) {
                    return;
                }
                try {
                    this.f177c = Image.createImage(this.f176b);
                } catch (IOException e) {
                }
            }
        }
    }

    @Override // p000.InterfaceC0051w
    /* JADX INFO: renamed from: c */
    public final void mo123c() {
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: c */
    public final void mo124c(int i) {
        if (this.f159aj != null) {
            this.f159aj = null;
            this.f158ai = new C0046r(this);
            this.f158ai.m316b();
            m94a(this.f158ai);
        } else if (this.f158ai != null) {
            this.f158ai = null;
        }
        if (this.f160ak != null) {
            this.f160ak.mo8a(i);
        } else if (i == -6 || i == -7) {
            commandAction(this.f165ap, null);
        } else {
            this.f186l |= m98g(i);
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
        this.f159aj = null;
        this.f158ai = null;
        if (this.f160ak == null && command == this.f165ap) {
            this.f160ak = new C0052x(C0026az.m177a(C0026az.f255D), new String[]{C0026az.m177a(C0026az.f314o), C0026az.m177a(C0026az.f315p)}, this);
            m94a(this.f160ak);
            this.f160ak.f544n = 1;
            this.f186l = 0;
        }
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: d */
    public final void mo125d(int i) {
        this.f186l &= m98g(i) ^ (-1);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m126d() {
        return this.f197w != null;
    }

    /* JADX INFO: renamed from: e */
    public final int m127e(int i) {
        if (i < 0 || i >= this.f185k.length) {
            return 0;
        }
        return this.f185k[i];
    }

    /* JADX INFO: renamed from: e */
    public final void m128e() {
        this.f177c = null;
        this.f182h = new C0003ac[2];
        this.f183i = new InterfaceC0051w[2];
        this.f188n = new int[2];
        this.f190p = new int[2];
        this.f191q = null;
        this.f197w = null;
        this.f122C = null;
        this.f123D = null;
        this.f124E = null;
        this.f125F.clear();
        this.f133N.removeAllElements();
        this.f134O = new AbstractC0050v[0];
        this.f135P = 0;
        this.f136Q = new C0025ay[2];
        this.f137R = new int[2];
        this.f138S = new Random(1337L);
        this.f152ac = 0;
        this.f153ad = 0;
        this.f142W = 0;
        this.f143X = new String[10];
        this.f144Y = new int[10];
        this.f128I = 0;
        this.f130K = new int[10];
        this.f131L = new int[10];
        this.f132M = new int[10];
        if (this.f120A != null) {
            this.f120A.mo19c();
            this.f120A = null;
        }
        if (this.f192r != null) {
            this.f192r.m48a();
            this.f192r = null;
        }
        C0053y.m338a().m343b();
        m101o();
        System.gc();
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: f */
    public final void mo129f() {
        if (this.f197w == null) {
            return;
        }
        if (this.f173ax == null) {
            ((C0033e) this.f183i[this.f147aA]).f431h = this.f186l;
            return;
        }
        try {
            DataOutputStream dataOutputStream = this.f174ay.f496c;
            dataOutputStream.writeInt(this.f187m);
            dataOutputStream.writeInt(this.f188n[0]);
            dataOutputStream.writeInt(this.f188n[1]);
            this.f174ay.m312b();
        } catch (IOException e) {
            m105s();
        }
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: g */
    public final void mo130g() {
        C0033e c0033e;
        int[] iArr;
        char c = 0;
        if (this.f197w == null || this.f173ax == null) {
            return;
        }
        try {
            this.f175az = this.f174ay.m311a(this.f187m <= 2 ? 5000L : 600L);
            if (this.f175az) {
                try {
                    DataInputStream dataInputStream = this.f174ay.f499f;
                    this.f189o = dataInputStream.readInt();
                    this.f190p[0] = dataInputStream.readInt();
                    this.f190p[1] = dataInputStream.readInt();
                } catch (IOException e) {
                    m105s();
                }
            }
            if (this.f170au >= 4) {
                if (this.f174ay.f505l) {
                }
                m105s();
            }
            if (this.f189o < this.f187m) {
                this.f170au++;
                this.f171av = true;
                return;
            }
            this.f170au = 0;
            if (this.f189o > this.f187m) {
                c0033e = (C0033e) this.f183i[1 - this.f147aA];
                iArr = this.f190p;
            } else {
                c0033e = (C0033e) this.f183i[1 - this.f147aA];
                iArr = this.f190p;
                c = 1;
            }
            c0033e.f431h = iArr[c];
            ((C0033e) this.f183i[this.f147aA]).f431h = this.f188n[1];
            this.f187m++;
            this.f188n[0] = this.f188n[1];
            this.f188n[1] = this.f186l;
            this.f171av = false;
        } catch (Exception e2) {
            m105s();
        }
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: h */
    public final void mo131h() {
        this.f150aa = false;
        boolean z = this.f197w == null;
        if (this.f173ax != null) {
            z = false;
        }
        if (z) {
            this.f159aj = new C0052x("Instructions:", new String[]{"Get pieces for buildings", "Use weapons on enemy", "Arrow shows target", "High score wins!"}, this);
            this.f159aj.f545o = C0052x.f537g;
            for (int i = 0; i < this.f159aj.f548r.length; i++) {
                int iStringWidth = this.f196v.stringWidth(this.f159aj.f548r[i]);
                if (iStringWidth > this.f159aj.f545o) {
                    this.f159aj.f545o = iStringWidth;
                }
            }
            this.f159aj.f550t = false;
            m94a(this.f159aj);
        }
        if (this.f197w == null) {
            try {
                m100n();
            } catch (Exception e) {
                m128e();
                this.f150aa = true;
                this.f492aD.m141a(Dropscape.f388f);
                e.toString();
                return;
            }
        }
        C0053y.m338a().m344c();
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e2) {
        }
        if (this.f173ax != null) {
            this.f174ay = new C0044p(this.f173ax, 12);
        }
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: i */
    public final void mo132i() {
        this.f186l = 0;
        if (this.f173ax != null && this.f152ac != 1) {
            m105s();
        }
        C0053y.m338a().m345d();
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
        }
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: j */
    public final void mo133j() {
        m128e();
        f119aF = null;
    }
}
