package p000;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class C0009j {

    /* JADX INFO: renamed from: aE */
    private byte[] f574aE;

    /* JADX INFO: renamed from: c */
    private InputStream f586c;

    /* JADX INFO: renamed from: f */
    private RunnableC0002c f609f;

    /* JADX INFO: renamed from: s */
    private short[] f612s;

    /* JADX INFO: renamed from: aI */
    private byte[] f578aI = new byte[1600];

    /* JADX INFO: renamed from: aJ */
    private byte[] f579aJ = new byte[1600];

    /* JADX INFO: renamed from: t */
    private short[] f613t = new short[170];

    /* JADX INFO: renamed from: K */
    private byte[][] f568K = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 13, 22);

    /* JADX INFO: renamed from: L */
    private byte[][] f569L = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 13, 22);

    /* JADX INFO: renamed from: aK */
    private byte[] f580aK = new byte[13];

    /* JADX INFO: renamed from: u */
    short[] f614u = new short[13];

    /* JADX INFO: renamed from: v */
    private short[] f615v = new short[13];

    /* JADX INFO: renamed from: w */
    private short[] f616w = new short[13];

    /* JADX INFO: renamed from: aL */
    private byte[] f581aL = new byte[21467];

    /* JADX INFO: renamed from: aM */
    private byte[] f582aM = new byte[21467];

    /* JADX INFO: renamed from: x */
    private short[] f617x = new short[222];

    /* JADX INFO: renamed from: aN */
    byte[] f583aN = new byte[21703];

    /* JADX INFO: renamed from: aO */
    byte[] f584aO = new byte[21703];

    /* JADX INFO: renamed from: y */
    short[] f618y = new short[150];

    /* JADX INFO: renamed from: z */
    private short[] f619z = new short[250];

    /* JADX INFO: renamed from: A */
    private short[] f566A = new short[250];

    /* JADX INFO: renamed from: aP */
    byte f585aP = 0;

    /* JADX INFO: renamed from: cs */
    private int f601cs = 0;

    /* JADX INFO: renamed from: cq */
    private int f599cq = 0;

    /* JADX INFO: renamed from: M */
    byte[][] f570M = {this.f578aI, this.f581aL, this.f583aN};

    /* JADX INFO: renamed from: N */
    byte[][] f571N = {this.f579aJ, this.f582aM, this.f584aO};

    /* JADX INFO: renamed from: m */
    short[][] f611m = {this.f613t, this.f617x, this.f618y};

    /* JADX INFO: renamed from: j */
    private String[] f610j = {"/s", "/t", "/d"};

    /* JADX INFO: renamed from: cr */
    private int f600cr = 0;

    /* JADX INFO: renamed from: ct */
    private int f602ct = 0;

    /* JADX INFO: renamed from: cu */
    private int f603cu = 0;

    /* JADX INFO: renamed from: cv */
    private int f604cv = 0;

    /* JADX INFO: renamed from: ck */
    int f593ck = 0;

    /* JADX INFO: renamed from: cw */
    private int f605cw = 0;

    /* JADX INFO: renamed from: cx */
    private int f606cx = 0;

    /* JADX INFO: renamed from: cy */
    private int f607cy = 0;

    /* JADX INFO: renamed from: cz */
    private int f608cz = 0;

    /* JADX INFO: renamed from: cA */
    private int f587cA = 0;

    /* JADX INFO: renamed from: cB */
    private int f588cB = 0;

    /* JADX INFO: renamed from: cl */
    private int f594cl = 0;

    /* JADX INFO: renamed from: cm */
    private int f595cm = 0;

    /* JADX INFO: renamed from: cn */
    private int f596cn = 0;

    /* JADX INFO: renamed from: co */
    private int f597co = 0;

    /* JADX INFO: renamed from: cp */
    int f598cp = 0;

    /* JADX INFO: renamed from: W */
    boolean f572W = false;

    /* JADX INFO: renamed from: X */
    boolean f573X = false;

    /* JADX INFO: renamed from: cC */
    private int f589cC = 0;

    /* JADX INFO: renamed from: cD */
    private int f590cD = 0;

    /* JADX INFO: renamed from: cE */
    private int f591cE = 0;

    /* JADX INFO: renamed from: cF */
    private int f592cF = 0;

    /* JADX INFO: renamed from: J */
    private byte[][] f567J = {new byte[]{0, 8, 16, 24, 32, 39, 46, 54, 62, 68, 75, 83, 90, 99, 107, 115, 123}, new byte[]{0, 9, 17, 25, 33, 41, 49, 59, 67, 75, 83, 90, 98, 106, 114, 122}, new byte[]{0, 7, 11, 18, 25, 32, 39, 46, 52, 59, 66, 71, 77, 79, 82, 84, 87, 89, 96, 104, 107}, new byte[]{0, 7, 11, 18, 25, 32, 39, 46, 52, 59, 66, 72, 80, 89, 98, 106, 110, 114}, new byte[]{0, 4, 7, 11, 15, 19, 23, 27, 31, 35, 39, 43, 46, 50, 54, 58, 62, 66, 70, 74, 78}, new byte[]{0, 7, 14, 21, 28, 35, 42, 50, 57, 64, 71, 78, 85, 92, 99, 106, 113, 120}, new byte[]{0, 7, 13, 20, 30, 37, 45, 52, 62, 73, 81, 91, 98, 105, 115, 122}, new byte[]{0, 8, 18, 25, 33, 42, 50, 58, 68, 76, 88, 96}, new byte[]{0, 9, 18, 26, 36, 47, 56, 67, 75, 82, 90, 98}};

    /* JADX INFO: renamed from: aF */
    private byte[] f575aF = {7, 9, 8, 7, 5, 7, 7, 7, 8};

    /* JADX INFO: renamed from: aG */
    private byte[] f576aG = {0, 7, 16, 24, 31, 0, 7, 14, 21};

    /* JADX INFO: renamed from: aH */
    private byte[] f577aH = {0, -1, 0, 0, 1, 0, 2, 0, 0};

    public C0009j(RunnableC0002c runnableC0002c) {
        this.f609f = runnableC0002c;
        this.f574aE = this.f609f.f66d;
        this.f612s = this.f609f.f44a;
    }

    /* JADX INFO: renamed from: a */
    private int m227a(int i, Graphics graphics) {
        int i2 = this.f613t[i + 1] - this.f613t[i];
        int i3 = i2 - 1;
        this.f601cs = 0;
        while (this.f601cs < i2) {
            int i4 = i3 + (this.f567J[this.f578aI[this.f613t[i] + this.f601cs] & 15][this.f579aJ[this.f613t[i] + this.f601cs] + 1] - this.f567J[this.f578aI[this.f613t[i] + this.f601cs] & 15][this.f579aJ[this.f613t[i] + this.f601cs]]);
            if (graphics != null) {
                this.f608cz = this.f594cl + ((this.f605cw - this.f598cp) * 11) + this.f577aH[this.f578aI[this.f613t[i] + this.f601cs] & 15];
                this.f587cA = this.f567J[this.f578aI[this.f613t[i] + this.f601cs] & 15][this.f579aJ[this.f613t[i] + this.f601cs] + 1] - this.f567J[this.f578aI[this.f613t[i] + this.f601cs] & 15][this.f579aJ[this.f613t[i] + this.f601cs]];
                this.f588cB = this.f607cy;
                this.f588cB += 15;
                this.f608cz += this.f609f.f36a.f458bB + 10;
                C0006g.m118a(graphics, this.f609f.f47a[0][(this.f578aI[this.f613t[i] + this.f601cs] >> 4) + 33], this.f567J[this.f578aI[this.f613t[i] + this.f601cs] & 15][this.f579aJ[this.f613t[i] + this.f601cs]], this.f576aG[this.f578aI[this.f613t[i] + this.f601cs] & 15], this.f587cA, this.f575aF[this.f578aI[this.f613t[i] + this.f601cs] & 15], this.f588cB, this.f608cz, 20);
                this.f607cy += this.f587cA + 1;
            }
            this.f601cs++;
            i3 = i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    private int m228a(String str, Graphics graphics) {
        this.f601cs = 0;
        while (this.f601cs < str.length()) {
            short sCharAt = str.charAt(this.f601cs);
            this.f578aI[this.f613t[this.f599cq] + this.f601cs] = this.f574aE[this.f612s[139] + sCharAt];
            this.f579aJ[this.f613t[this.f599cq] + this.f601cs] = this.f574aE[sCharAt + this.f612s[140]];
            this.f601cs++;
        }
        this.f613t[this.f599cq + 1] = (short) (this.f613t[this.f599cq] + str.length());
        return m227a(this.f599cq, graphics);
    }

    /* JADX INFO: renamed from: a */
    final short m229a() {
        return this.f618y[129];
    }

    /* JADX INFO: renamed from: a */
    final void m230a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String string;
        this.f590cD = 0;
        this.f597co = 0;
        this.f595cm = i5;
        this.f619z[0] = this.f611m[this.f595cm][i6];
        this.f591cE = 0;
        this.f589cC = this.f611m[this.f595cm][i6] & 65535;
        while (this.f589cC < (this.f611m[this.f595cm][i6 + 1] & 65535)) {
            if ((this.f570M[this.f595cm][this.f589cC] == 1 && this.f571N[this.f595cm][this.f589cC] == 10 && (this.f571N[this.f595cm][this.f589cC + 1] < 90 || this.f571N[this.f595cm][this.f589cC + 1] >= 112)) || this.f570M[this.f595cm][this.f589cC] == -1) {
                this.f590cD = this.f589cC + 1;
                this.f592cF = this.f591cE;
            }
            if (this.f570M[this.f595cm][this.f589cC] == 32) {
                this.f591cE++;
                switch (this.f571N[this.f595cm][this.f589cC]) {
                    case 7:
                        this.f591cE += m228a("www.crazy-arts.ru", (Graphics) null);
                        break;
                    case 8:
                        this.f591cE += m227a(145, (Graphics) null);
                        break;
                    case 9:
                        this.f591cE += m227a(144, (Graphics) null);
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 27:
                    default:
                        this.f591cE += m228a("nullissimo", (Graphics) null);
                        break;
                    case 20:
                        break;
                    case 21:
                        this.f591cE += m227a(this.f609f.f36a.f367aC + 123, (Graphics) null);
                        break;
                    case 22:
                        int i8 = this.f591cE;
                        if (this.f609f.f36a.f391aN == 6) {
                            string = this.f609f.f36a.f521d[(this.f609f.f36a.f394aP * 3) + 2];
                        } else {
                            string = new StringBuffer().append(this.f609f.f46a[1][this.f609f.f36a.f405ag]).append(this.f609f.f36a.f391aN == 4 ? "43+" : "43 ").append(this.f609f.f36a.f430at).toString();
                        }
                        this.f591cE = m228a(string, (Graphics) null) + i8;
                        break;
                    case 23:
                        this.f591cE += m228a(new StringBuffer().append(this.f609f.f36a.f430at).toString(), (Graphics) null);
                        break;
                    case 24:
                        this.f591cE += m228a(new StringBuffer().append(this.f609f.f36a.f472bP).toString(), (Graphics) null);
                        break;
                    case 25:
                        this.f591cE += m228a(new StringBuffer().append(-this.f609f.f34a.f137w).toString(), (Graphics) null);
                        break;
                    case 26:
                        this.f591cE += m228a(new StringBuffer().append((int) this.f609f.f82g[this.f609f.f36a.f405ag]).toString(), (Graphics) null);
                        break;
                    case 28:
                        this.f591cE += m228a("wap.gear-games.com", (Graphics) null);
                        break;
                    case 29:
                        this.f591cE += m228a(this.f609f.f46a[0][this.f609f.f36a.f405ag], (Graphics) null);
                        break;
                    case 30:
                        this.f591cE += m228a(this.f609f.f46a[2][this.f609f.f36a.f405ag], (Graphics) null);
                        break;
                }
            } else if (this.f570M[this.f595cm][this.f589cC] != -1) {
                this.f591cE++;
                this.f591cE += this.f567J[this.f570M[this.f595cm][this.f589cC] & 15][this.f571N[this.f595cm][this.f589cC] + 1] - this.f567J[this.f570M[this.f595cm][this.f589cC] & 15][this.f571N[this.f595cm][this.f589cC]];
            }
            if ((this.f591cE > i3 && this.f590cD > (this.f619z[this.f597co] & 65535)) || this.f570M[this.f595cm][this.f589cC] == -1) {
                this.f597co++;
                this.f619z[this.f597co] = (short) this.f590cD;
                this.f566A[this.f597co - 1] = (short) ((((i3 - this.f592cF) * (i7 & 1)) / 2) + i);
                this.f589cC = this.f590cD - 1;
                this.f591cE = 0;
            }
            if (this.f570M[this.f595cm][this.f589cC] == 1 && (this.f571N[this.f595cm][this.f589cC] == 12 || this.f571N[this.f595cm][this.f589cC] == 13)) {
                this.f590cD = this.f589cC + 1;
                this.f592cF = this.f591cE;
            }
            this.f589cC++;
        }
        if (this.f591cE > 0) {
            this.f597co++;
            this.f566A[this.f597co - 1] = (short) ((((i3 - this.f591cE) * (i7 & 1)) / 2) + i);
            this.f619z[this.f597co] = this.f611m[this.f595cm][i6 + 1];
        }
        this.f594cl = ((i7 != 3 || this.f597co * 11 >= i4) ? 0 : (i4 - (this.f597co * 11)) / 2) + i2;
        this.f596cn = i4 / 11;
        this.f598cp = 0;
    }

    /* JADX INFO: renamed from: a */
    final void m231a(int i, int i2, int i3, String str, int i4) {
        this.f601cs = 0;
        while (this.f601cs < str.length()) {
            int iCharAt = str.charAt(this.f601cs);
            if (iCharAt > 500) {
                iCharAt -= 848;
            }
            if (i4 < 0 || iCharAt < 48 || iCharAt > 57) {
                this.f578aI[this.f613t[this.f599cq] + this.f601cs] = this.f574aE[this.f612s[139] + iCharAt];
                this.f579aJ[this.f613t[this.f599cq] + this.f601cs] = this.f574aE[iCharAt + this.f612s[140]];
            } else {
                this.f578aI[this.f613t[this.f599cq] + this.f601cs] = this.f574aE[this.f612s[141] + i4];
                this.f579aJ[this.f613t[this.f599cq] + this.f601cs] = (byte) ((iCharAt - 48) + this.f574aE[this.f612s[142] + i4]);
            }
            this.f601cs++;
        }
        this.f613t[this.f599cq + 1] = (short) (this.f613t[this.f599cq] + str.length());
        m235f(i, i2, i3, this.f599cq);
    }

    /* JADX INFO: renamed from: a */
    final void m232a(int i, int i2, byte[] bArr, int i3) {
        this.f601cs = 0;
        while (this.f601cs < i3) {
            int i4 = bArr[this.f601cs] & 255;
            this.f578aI[this.f613t[this.f599cq] + this.f601cs] = this.f574aE[this.f612s[139] + i4];
            this.f579aJ[this.f613t[this.f599cq] + this.f601cs] = this.f574aE[i4 + this.f612s[140]];
            this.f601cs++;
        }
        this.f613t[this.f599cq + 1] = (short) (this.f613t[this.f599cq] + i3);
        m235f(i, i2, 1, this.f599cq);
    }

    /* JADX INFO: renamed from: a */
    final void m233a(Graphics graphics) {
        this.f605cw = 0;
        while (this.f605cw < this.f585aP) {
            this.f607cy = this.f616w[this.f605cw];
            this.f606cx = 0;
            while (this.f606cx < this.f580aK[this.f605cw]) {
                if (this.f569L[this.f605cw][this.f606cx] == 126) {
                    this.f607cy -= 3;
                } else {
                    this.f608cz = this.f615v[this.f605cw] + this.f577aH[this.f569L[this.f605cw][this.f606cx] & 15];
                    this.f588cB = this.f607cy;
                    this.f588cB += 15;
                    this.f608cz += this.f609f.f36a.f458bB + 10;
                    if (this.f609f.f81g && !this.f609f.f36a.f346L) {
                        this.f588cB -= this.f609f.f80g;
                        this.f608cz -= this.f609f.f84h;
                    }
                    this.f587cA = this.f567J[this.f569L[this.f605cw][this.f606cx] & 15][this.f568K[this.f605cw][this.f606cx] + 1] - this.f567J[this.f569L[this.f605cw][this.f606cx] & 15][this.f568K[this.f605cw][this.f606cx]];
                    C0006g.m118a(graphics, this.f609f.f47a[0][(this.f569L[this.f605cw][this.f606cx] >> 4) + 33], this.f567J[this.f569L[this.f605cw][this.f606cx] & 15][this.f568K[this.f605cw][this.f606cx]], this.f576aG[this.f569L[this.f605cw][this.f606cx] & 15], this.f587cA, this.f575aF[this.f569L[this.f605cw][this.f606cx] & 15], this.f588cB, this.f608cz, 20);
                    this.f607cy += this.f587cA + 1;
                }
                this.f606cx++;
            }
            this.f605cw++;
        }
        this.f585aP = (byte) 0;
    }

    /* JADX INFO: renamed from: b */
    final void m234b(Graphics graphics) {
        String string;
        try {
            this.f605cw = this.f598cp;
            while (this.f605cw < this.f598cp + this.f596cn && this.f605cw < this.f597co) {
                this.f607cy = this.f566A[this.f605cw];
                this.f606cx = this.f619z[this.f605cw] & 65535;
                while (this.f606cx < (this.f619z[this.f605cw + 1] & 65535)) {
                    if (this.f570M[this.f595cm][this.f606cx] != -1) {
                        this.f608cz = this.f594cl + ((this.f605cw - this.f598cp) * 11) + this.f577aH[this.f570M[this.f595cm][this.f606cx] & 15];
                        this.f588cB = this.f607cy;
                        this.f588cB += 15;
                        this.f608cz += this.f609f.f36a.f458bB + 10;
                        if (this.f609f.f81g && !this.f609f.f36a.f346L) {
                            this.f588cB -= this.f609f.f80g;
                            this.f608cz -= this.f609f.f84h;
                        }
                        if (this.f570M[this.f595cm][this.f606cx] == 32) {
                            switch (this.f571N[this.f595cm][this.f606cx]) {
                                case 7:
                                    this.f591cE += m228a("www.crazy-arts.ru", graphics);
                                    break;
                                case 8:
                                    this.f591cE += m227a(145, graphics);
                                    break;
                                case 9:
                                    this.f591cE += m227a(144, graphics);
                                    break;
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 27:
                                default:
                                    m228a("nullissimo", graphics);
                                    break;
                                case 20:
                                    break;
                                case 21:
                                    m227a(this.f609f.f36a.f367aC + 123, graphics);
                                    break;
                                case 22:
                                    int i = this.f591cE;
                                    if (this.f609f.f36a.f391aN == 6) {
                                        string = this.f609f.f36a.f521d[(this.f609f.f36a.f394aP * 3) + 2];
                                    } else {
                                        string = new StringBuffer().append(this.f609f.f46a[1][this.f609f.f36a.f405ag]).append(this.f609f.f36a.f391aN == 4 ? "43+" : "43 ").append(this.f609f.f36a.f430at).toString();
                                    }
                                    this.f591cE = m228a(string, graphics) + i;
                                    break;
                                case 23:
                                    this.f591cE += m228a(new StringBuffer().append(this.f609f.f36a.f430at).toString(), graphics);
                                    break;
                                case 24:
                                    this.f591cE += m228a(new StringBuffer().append(this.f609f.f36a.f472bP).toString(), graphics);
                                    break;
                                case 25:
                                    this.f591cE += m228a(new StringBuffer().append(-this.f609f.f34a.f137w).toString(), graphics);
                                    break;
                                case 26:
                                    this.f591cE += m228a(new StringBuffer().append((int) this.f609f.f82g[this.f609f.f36a.f405ag]).toString(), graphics);
                                    break;
                                case 28:
                                    this.f591cE += m228a("wap.gear-games.com", graphics);
                                    break;
                                case 29:
                                    this.f591cE += m228a(this.f609f.f46a[0][this.f609f.f36a.f405ag], graphics);
                                    break;
                                case 30:
                                    this.f591cE += m228a(this.f609f.f46a[2][this.f609f.f36a.f405ag], graphics);
                                    break;
                            }
                            this.f607cy++;
                        } else {
                            this.f587cA = this.f567J[this.f570M[this.f595cm][this.f606cx] & 15][this.f571N[this.f595cm][this.f606cx] + 1] - this.f567J[this.f570M[this.f595cm][this.f606cx] & 15][this.f571N[this.f595cm][this.f606cx]];
                            C0006g.m118a(graphics, this.f609f.f47a[0][(this.f570M[this.f595cm][this.f606cx] >> 4) + 33], this.f567J[this.f570M[this.f595cm][this.f606cx] & 15][this.f571N[this.f595cm][this.f606cx]], this.f576aG[this.f570M[this.f595cm][this.f606cx] & 15], this.f587cA, this.f575aF[this.f570M[this.f595cm][this.f606cx] & 15], this.f588cB, this.f608cz, 20);
                            this.f607cy += this.f587cA + 1;
                        }
                    }
                    this.f606cx++;
                }
                this.f605cw++;
            }
            this.f572W = this.f598cp == 0;
            this.f573X = this.f598cp + this.f596cn >= this.f597co;
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: f */
    final void m235f(int i, int i2, int i3, int i4) {
        this.f593ck = this.f585aP;
        this.f580aK[this.f593ck] = (byte) (this.f613t[i4 + 1] - this.f613t[i4]);
        this.f614u[this.f593ck] = (short) (this.f580aK[this.f593ck] - 1);
        this.f616w[this.f593ck] = (short) i;
        this.f615v[this.f593ck] = (short) i2;
        this.f601cs = 0;
        while (this.f601cs < this.f580aK[this.f593ck]) {
            this.f569L[this.f593ck][this.f601cs] = this.f578aI[this.f613t[i4] + this.f601cs];
            this.f568K[this.f593ck][this.f601cs] = this.f579aJ[this.f613t[i4] + this.f601cs];
            short[] sArr = this.f614u;
            int i5 = this.f593ck;
            sArr[i5] = (short) (sArr[i5] + (this.f567J[this.f569L[this.f593ck][this.f601cs] & 15][this.f568K[this.f593ck][this.f601cs] + 1] - this.f567J[this.f569L[this.f593ck][this.f601cs] & 15][this.f568K[this.f593ck][this.f601cs]]));
            this.f601cs++;
        }
        short[] sArr2 = this.f616w;
        int i6 = this.f593ck;
        sArr2[i6] = (short) (sArr2[i6] - ((this.f614u[this.f593ck] * i3) / 2));
        if (this.f593ck == 1 && (this.f609f.f36a.f501bs == 46 || this.f609f.f36a.f501bs == 84 || this.f609f.f36a.f501bs == 87)) {
            this.f609f.f36a.f471bO = this.f616w[this.f593ck] + this.f614u[this.f593ck];
            if (this.f609f.f36a.f382aJ >= 0) {
                this.f609f.f36a.f471bO -= this.f567J[this.f569L[this.f593ck][this.f580aK[this.f593ck] - 1] & 15][this.f568K[this.f593ck][this.f580aK[this.f593ck] - 1] + 1] - this.f567J[this.f569L[this.f593ck][this.f580aK[this.f593ck] - 1] & 15][this.f568K[this.f593ck][this.f580aK[this.f593ck] - 1]];
            }
        }
        this.f585aP = (byte) (this.f585aP + 1);
    }

    /* JADX INFO: renamed from: r */
    final void m236r(int i) {
        if (i == 0) {
            this.f609f.f36a.f522e = "";
        }
        try {
            this.f586c = getClass().getResourceAsStream(new StringBuffer("/0").append(this.f610j[i]).append("0").toString());
            if (this.f586c != null) {
                this.f603cu = 0;
                this.f611m[i][0] = 0;
                this.f602ct = 0;
                while (true) {
                    int i2 = this.f586c.read();
                    this.f600cr = i2;
                    if (i2 == -1) {
                        break;
                    }
                    if (this.f600cr == 124) {
                        this.f603cu++;
                        this.f611m[i][this.f603cu] = (short) this.f602ct;
                    } else {
                        if (this.f600cr == 31) {
                            this.f604cv = 0;
                            while (this.f604cv < this.f609f.f41a.length()) {
                                this.f570M[i][this.f602ct] = this.f574aE[this.f612s[139] + ((byte) this.f609f.f41a.charAt(this.f604cv))];
                                this.f571N[i][this.f602ct] = this.f574aE[this.f612s[140] + ((byte) this.f609f.f41a.charAt(this.f604cv))];
                                this.f604cv++;
                                this.f602ct++;
                            }
                            this.f602ct--;
                        } else {
                            this.f570M[i][this.f602ct] = this.f574aE[this.f612s[139] + this.f600cr];
                            this.f571N[i][this.f602ct] = this.f574aE[this.f612s[140] + this.f600cr];
                            if (i == 0 && this.f603cu == 143) {
                                StringBuffer stringBuffer = new StringBuffer();
                                C0006g c0006g = this.f609f.f36a;
                                c0006g.f522e = stringBuffer.append(c0006g.f522e).append((char) this.f600cr).toString();
                            }
                        }
                        this.f602ct++;
                    }
                }
                if (i == 0) {
                    this.f599cq = this.f603cu;
                }
            }
            this.f586c.close();
            this.f586c = null;
        } catch (IOException e) {
        } catch (Exception e2) {
        }
    }
}
