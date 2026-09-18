package p000;

import Coral.Math.Float.crlV4;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.PolygonMode;

/* JADX INFO: renamed from: bj */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0020bj {

    /* JADX INFO: renamed from: V */
    public static float[] f113V;

    /* JADX INFO: renamed from: Z */
    public static float f114Z;

    /* JADX INFO: renamed from: Z */
    public static crlV4[] f116Z;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public float f441Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public int f442Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0010as f443Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public PolygonMode f444Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public float[] f445Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public crlV4[] f446Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public crlV4[][] f447Code;

    /* JADX INFO: renamed from: I */
    public float f117I;

    /* JADX INFO: renamed from: I */
    public C0010as f118I;

    /* JADX INFO: renamed from: I */
    public crlV4[] f119I;

    /* JADX INFO: renamed from: V */
    public float f120V;

    /* JADX INFO: renamed from: V */
    public int f121V;

    /* JADX INFO: renamed from: V */
    public C0010as f122V;

    /* JADX INFO: renamed from: V */
    public crlV4[] f123V;

    /* JADX INFO: renamed from: a */
    public C0010as f124a;

    /* JADX INFO: renamed from: I */
    private static final float[] f111I = {2.75f, 37.5f, 18.4f, 19.0f, 1.0f, 33.5f, 14.5f, 15.0f, -10.5f, 0.0f};
    private static crlV4 Code = new crlV4();

    /* JADX INFO: renamed from: V */
    private static crlV4 f112V = new crlV4();

    /* JADX INFO: renamed from: I */
    private static crlV4 f110I = new crlV4();

    /* JADX INFO: renamed from: Z */
    private static crlV4 f115Z = new crlV4();

    static {
        int[] iArr = {0, 20, 40, 60, -20, -40};
    }

    public C0020bj() {
        f116Z = new crlV4[6];
        for (int i = 0; i < 6; i++) {
            f116Z[i] = new crlV4();
        }
        f113V = new float[6];
        this.f446Code = new crlV4[550];
        this.f123V = new crlV4[275];
        this.f447Code = new crlV4[3][];
        this.f447Code[0] = new crlV4[275];
        this.f119I = new crlV4[275];
        for (int i2 = 0; i2 < 275; i2++) {
            this.f119I[i2] = new crlV4();
            this.f123V[i2] = new crlV4();
            this.f446Code[i2 * 2] = new crlV4();
            this.f446Code[(i2 * 2) + 1] = new crlV4();
            this.f447Code[0][i2] = new crlV4();
        }
        this.f442Code = -1;
        this.f121V = -1;
        this.f124a = new C0010as(false);
        this.f445Code = new float[3];
        this.f444Code = new PolygonMode();
        this.f444Code.setPerspectiveCorrectionEnable(true);
    }

    public static void Code() {
        f114Z = 0.0f;
    }

    public final int Code(long j) {
        crlV4[] crlv4Arr;
        int i;
        C0031g c0031gM243Code = RunnableC0025bt.f462Code.m243Code(j);
        int i2 = c0031gM243Code.f500Code + 1;
        int i3 = i2 + 8;
        byte[] bArr = c0031gM243Code.f507Code;
        this.f441Code = C0037t.Code(bArr, i2) * 0.5f;
        crlV4[] crlv4Arr2 = this.f119I;
        int i4 = C0031g.Code.f76B;
        if (i4 == -1) {
            i4 = 9;
        }
        int iM193V = C0037t.m193V(bArr, i3);
        if (this.f442Code == -1) {
            this.f442Code = iM193V / 12;
        }
        int i5 = i3 + 4;
        for (int i6 = 0; i6 < this.f442Code; i6++) {
            crlv4Arr2[i6].m208Code(C0037t.Code(bArr, i5), C0037t.Code(bArr, i5 + 4) + f111I[i4], C0037t.Code(bArr, i5 + 8));
            i5 += 12;
        }
        crlV4[] crlv4Arr3 = this.f119I;
        this.f121V = this.f442Code * 2;
        f112V = crlv4Arr3[this.f442Code - 1];
        crlV4 crlv4 = new crlV4();
        int i7 = i3 + iM193V + 4;
        crlV4 crlv5 = new crlV4();
        for (int i8 = 0; i8 < this.f442Code; i8++) {
            Code = f112V;
            f112V = crlv4Arr3[i8];
            f110I = Code(crlv4Arr3, i8 - 2);
            f115Z = Code(crlv4Arr3, i8);
            crlV4.m7V(crlv4, f115Z, f110I);
            if (f114Z == 0.0f) {
                f114Z = crlv4.Code() / 2.0f;
            }
            crlv4.m206Code();
            crlv5.f362Code = crlv4.f17I;
            crlv5.f17I = -crlv4.f362Code;
            crlv5.f18V = 0.0f;
            crlv5.m207Code(this.f441Code);
            this.f446Code[i8 * 2].Code(Code);
            this.f446Code[i8 * 2].m14V(crlv5);
            this.f446Code[(i8 * 2) + 1].Code(Code);
            this.f446Code[(i8 * 2) + 1].m10I(crlv5);
            if (i8 <= 0) {
                this.f123V[this.f442Code - 1].Code(crlv4);
                this.f123V[this.f442Code - 1].m207Code(-1.0f);
                crlv4Arr = this.f123V;
                i = this.f442Code;
            } else {
                this.f123V[i8 - 1].Code(crlv4);
                this.f123V[i8 - 1].m207Code(-1.0f);
                crlv4Arr = this.f123V;
                i = i8;
            }
            crlv4Arr[i - 1].m206Code();
        }
        crlV4[] crlv4Arr4 = this.f119I;
        Code = new crlV4();
        float f = 5.0f;
        for (int i9 = 0; i9 < 6; i9++) {
            int i10 = (this.f442Code - 2) - (i9 / 2);
            Code.Code(crlv4Arr4[i10 + 1]);
            Code.m10I(crlv4Arr4[i10]);
            Code.m206Code();
            float fCode = ((float) crlV4.Code(Code.f362Code, Code.f17I)) * 57.295776f;
            float f2 = -Code.f362Code;
            Code.f362Code = Code.f17I;
            Code.f17I = f2;
            Code.m207Code(f);
            f = -f;
            Code.m14V(crlv4Arr4[i10]);
            f116Z[i9].Code(Code);
            f113V[i9] = fCode;
        }
        this.f120V = C0037t.Code(this.f119I, this.f442Code, this.f445Code);
        this.f117I = 1.0f / this.f120V;
        int iM193V2 = C0037t.m193V(bArr, i7) + 4 + i7;
        this.f447Code[0] = this.f119I;
        C0007ao.Code().Code(this.f442Code, bArr, iM193V2 + 4, C0037t.m193V(bArr, iM193V2));
        C0028d c0028dM242Code = RunnableC0025bt.f462Code.m242Code(C0031g.f497Code[C0031g.Code.f76B][1]);
        C0028d c0028dM242Code2 = RunnableC0025bt.f462Code.m242Code(C0031g.f497Code[C0031g.Code.f76B][2]);
        c0028dM242Code.Code.getTexture(0).setBlending(227);
        c0028dM242Code2.Code.getTexture(0).setBlending(227);
        c0028dM242Code2.Code.setPolygonMode(this.f444Code);
        this.f443Code = RunnableC0025bt.f462Code.m241Code(C0031g.f497Code[C0031g.Code.f76B][3]);
        this.f443Code.Code(c0028dM242Code);
        this.f124a.Code(this.f443Code);
        this.f118I = RunnableC0025bt.f462Code.m241Code(C0031g.f497Code[C0031g.Code.f76B][4]);
        this.f118I.Code(RunnableC0025bt.f462Code.m242Code(115329633643640L));
        this.f124a.Code(this.f118I);
        this.f122V = RunnableC0025bt.f462Code.m241Code(C0031g.f497Code[C0031g.Code.f76B][5]);
        this.f122V.Code(c0028dM242Code2);
        this.f124a.Code(this.f122V);
        int i11 = 501;
        Mesh meshFind = this.f124a.Code().find(500);
        while (meshFind != null) {
            Appearance appearanceDuplicate = meshFind.getAppearance(0).duplicate();
            appearanceDuplicate.setPolygonMode(this.f444Code);
            meshFind.setAppearance(0, appearanceDuplicate);
            meshFind = (Mesh) this.f124a.Code().find(i11);
            i11++;
        }
        Group groupCode = this.f124a.Code();
        int i12 = 1000;
        int i13 = 1000;
        while (true) {
            Mesh meshFind2 = groupCode.find(i13);
            if (meshFind2 == null) {
                return 0;
            }
            meshFind2.setRenderingEnable(false);
            groupCode = this.f124a.Code();
            i13 = i12;
            i12++;
        }
    }

    public final crlV4 Code(crlV4[] crlv4Arr, int i) {
        while (i >= this.f442Code) {
            i -= this.f442Code;
        }
        if (i < 0) {
            i += this.f442Code;
        }
        return crlv4Arr[i];
    }

    /* JADX INFO: renamed from: V */
    public final void m106V() {
        C0031g.f483Code.m125V(this.f124a);
        this.f124a.m217Code();
        this.f118I.Code((C0028d) null);
        this.f122V.Code((C0028d) null);
        this.f443Code.Code((C0028d) null);
        this.f118I = null;
        this.f122V = null;
        this.f443Code = null;
        this.f442Code = -1;
    }
}
