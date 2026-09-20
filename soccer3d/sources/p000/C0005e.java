package p000;

import com.nokia.mid.ui.DeviceControl;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.IndexBuffer;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: C:\Temp\jadx-9991838165078942717\classes.dex */
public class C0005e extends Canvas {

    /* JADX INFO: renamed from: A */
    private String f180A;

    /* JADX INFO: renamed from: B */
    String[] f181B;

    /* JADX INFO: renamed from: C */
    private long f182C;

    /* JADX INFO: renamed from: D */
    private int f183D;

    /* JADX INFO: renamed from: E */
    private int f184E;

    /* JADX INFO: renamed from: F */
    private float f185F;

    /* JADX INFO: renamed from: G */
    private Font f186G;

    /* JADX INFO: renamed from: I */
    private int f188I;

    /* JADX INFO: renamed from: J */
    private Font f189J;

    /* JADX INFO: renamed from: K */
    private Background f190K;

    /* JADX INFO: renamed from: L */
    private int f191L;

    /* JADX INFO: renamed from: M */
    private int f192M;

    /* JADX INFO: renamed from: N */
    public long f193N;

    /* JADX INFO: renamed from: Q */
    public int f196Q;

    /* JADX INFO: renamed from: R */
    private Transform f197R;

    /* JADX INFO: renamed from: S */
    public int f198S;

    /* JADX INFO: renamed from: U */
    private int f200U;

    /* JADX INFO: renamed from: V */
    private int f201V;

    /* JADX INFO: renamed from: W */
    public int f202W;

    /* JADX INFO: renamed from: X */
    private String[] f203X;

    /* JADX INFO: renamed from: Z */
    private int f205Z;

    /* JADX INFO: renamed from: a */
    public boolean f206a;

    /* JADX INFO: renamed from: aA */
    public Image f207aA;

    /* JADX INFO: renamed from: aG */
    private long f213aG;

    /* JADX INFO: renamed from: aH */
    private float f214aH;

    /* JADX INFO: renamed from: aI */
    public int f215aI;

    /* JADX INFO: renamed from: aJ */
    private float f216aJ;

    /* JADX INFO: renamed from: aK */
    private int f217aK;

    /* JADX INFO: renamed from: aL */
    private Timer f218aL;

    /* JADX INFO: renamed from: aO */
    private Object[] f221aO;

    /* JADX INFO: renamed from: aP */
    private Graphics3D f222aP;

    /* JADX INFO: renamed from: aQ */
    private int f223aQ;

    /* JADX INFO: renamed from: aR */
    private int f224aR;

    /* JADX INFO: renamed from: aa */
    String[] f226aa;

    /* JADX INFO: renamed from: ab */
    private int f227ab;

    /* JADX INFO: renamed from: ac */
    private int f228ac;

    /* JADX INFO: renamed from: af */
    public int f231af;

    /* JADX INFO: renamed from: ag */
    private int f232ag;

    /* JADX INFO: renamed from: ah */
    private int f233ah;

    /* JADX INFO: renamed from: ai */
    public Image f234ai;

    /* JADX INFO: renamed from: ak */
    private int f236ak;

    /* JADX INFO: renamed from: al */
    public boolean f237al;

    /* JADX INFO: renamed from: am */
    private int f238am;

    /* JADX INFO: renamed from: ao */
    private int f240ao;

    /* JADX INFO: renamed from: ap */
    private int f241ap;

    /* JADX INFO: renamed from: aq */
    String f242aq;

    /* JADX INFO: renamed from: ar */
    private int f243ar;

    /* JADX INFO: renamed from: ay */
    public boolean f250ay;

    /* JADX INFO: renamed from: b */
    public int f252b;

    /* JADX INFO: renamed from: c */
    private int f253c;

    /* JADX INFO: renamed from: e */
    private String f255e;

    /* JADX INFO: renamed from: g */
    private int f257g;

    /* JADX INFO: renamed from: h */
    private Font f258h;

    /* JADX INFO: renamed from: i */
    private Camera f259i;

    /* JADX INFO: renamed from: j */
    String f260j;

    /* JADX INFO: renamed from: k */
    private String f261k;

    /* JADX INFO: renamed from: l */
    private Displayable f262l;

    /* JADX INFO: renamed from: p */
    private int f266p;

    /* JADX INFO: renamed from: q */
    private float f267q;

    /* JADX INFO: renamed from: s */
    private short[] f269s;

    /* JADX INFO: renamed from: t */
    private float f270t;

    /* JADX INFO: renamed from: u */
    private int f271u;

    /* JADX INFO: renamed from: v */
    private float f272v;

    /* JADX INFO: renamed from: x */
    public Image f274x;

    /* JADX INFO: renamed from: y */
    private int f275y;

    /* JADX INFO: renamed from: z */
    private C0004d f276z;

    /* JADX INFO: renamed from: ax */
    private int[] f249ax = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4, 5, 26, 27, 28, 29, 30, 31, 24, 25, 34, 35, 36, 37, 38, 39, 32, 33, 40, 41, 42, 43, 44, 45, 40, 41, 42, 43, 44, 45};

    /* JADX INFO: renamed from: az */
    private float f251az = 0.0f;

    /* JADX INFO: renamed from: aN */
    private int[] f220aN = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: f */
    private int[] f256f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: as */
    private int[] f244as = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: aE */
    private int[] f211aE = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: P */
    public VertexArray[] f195P = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: Y */
    public VertexArray[] f204Y = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: O */
    public VertexBuffer[] f194O = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: ad */
    public IndexBuffer[] f229ad = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: H */
    public PolygonMode[] f187H = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: ae */
    public Appearance[] f230ae = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: aC */
    public VertexArray[] f209aC = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: aj */
    public Image2D[] f235aj = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: w */
    public Texture2D[] f273w = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: T */
    public CompositingMode[] f199T = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: at */
    private int[] f245at = {2, 4, 2, 6, 4, 8, 4, 2, 4, 4, 4, 6, 6, 2, 6, 4, 6, 6, 6, 8, 2, 2, 2, 5, 2, 8, 4, 3, 4, 5, 4, 7, 6, 2, 6, 4, 6, 6, 6, 8, 2, 4, 2, 6, 6, 8, 4, 3, 4, 5, 4, 7, 6, 2, 6, 4, 6, 5, 6, 6};

    /* JADX INFO: renamed from: r */
    public int f268r = 100;

    /* JADX INFO: renamed from: an */
    private Vector f239an = null;

    /* JADX INFO: renamed from: aS */
    private C0006f f225aS = null;

    /* JADX INFO: renamed from: n */
    private Vector f264n = null;

    /* JADX INFO: renamed from: aD */
    private int f210aD = 0;

    /* JADX INFO: renamed from: au */
    private int f246au = 0;

    /* JADX INFO: renamed from: av */
    private int f247av = 0;

    /* JADX INFO: renamed from: aM */
    public int f219aM = 0;

    /* JADX INFO: renamed from: aB */
    C0007g f208aB = null;

    /* JADX INFO: renamed from: aF */
    private int[] f212aF = {0, 1250067, 2565927, 3815994, 5131854, 6447714, 7697781, 9013641, 10263708, 11579568, 12895428, 14145495, 15461355, 16777215};

    /* JADX INFO: renamed from: m */
    private int[] f263m = {16711935, 1638400, 0, 983047, 2361355, 3739919, 5118997, 5646103, 6173724, 6830365, 9518622, 10374443, 9785914, 10375995, 11429966, 11572571, 2888199, 5243930, 16711935, 1638400, 0, 197379, 1708814, 2956822, 4270367, 5584167, 6897712, 8145721, 9459521, 10773066, 12086867, 11888716, 12880750, 12297376, 2888199, 5243930, 16711935, 1638400, 0, 1507337, 3542802, 5644060, 7811878, 8602412, 9459252, 10510135, 11561017, 12877647, 12027493, 12880488, 14461574, 14794651, 5126714, 8349286, 16711935, 1638400, 0, 1703946, 4069146, 6434346, 8865338, 9787715, 10710092, 11892561, 13075286, 14589553, 13608584, 14592910, 16372148, 16770764, 5126714, 8349286, 16711935, 1638400, 0, 6235145, 7288342, 8341795, 11231802, 11825992, 12485718, 13145445, 13805427, 14465154, 14861710, 15323803, 15785896, 16248245, 5126714, 8349286, 16711935, 1638400, 0, 7154698, 8405016, 9721127, 10971702, 12287556, 13538131, 14854242, 15119990, 15451531, 15782816, 16114356, 16445641, 16777182, 5126714, 8349286, 16711935, 1638400, 0, 7154732, 8142647, 9196099, 10249551, 11303003, 12290919, 13344371, 14397823, 15451531, 15782816, 16114356, 16445641, 16777182, 5126714, 8349286, 16711935, 1638400, 0, 7154732, 8142647, 9196614, 10316117, 11370084, 12489587, 13543554, 14663057, 15782816, 16114100, 16445641, 16777182, 16777208, 5126714, 8349286, 16711935, 1638400, 0, 9324844, 9984058, 10709064, 11434071, 12093541, 12818547, 13543554, 14663057, 15782816, 16114100, 16445641, 16777182, 16777208, 5126714, 8349286};

    /* JADX INFO: renamed from: d */
    private int[] f254d = {0, 1114112, 2228224, 3342336, 4456448, 5570560, 6684672, 7798784, 8912896, 10027008, 11141120, 12255232, 13369344, 14483456, 15597568, 16711680, 0, 4352, 8704, 13056, 17408, 21760, 26112, 30464, 34816, 39168, 43520, 47872, 52224, 56576, 60928, 65280, 0, 17, 34, 51, 68, 85, 102, 119, 136, 153, 170, 187, 204, 221, 238, 255, 0, 8, 16, 24, 32, 40, 48, 56, 0, 72, 80, 88, 96, 104, 112, 120, 4210752, 5263440, 6316128, 7895160, 9474192, 10000536, 10526880, 11053224, 11579568, 12105912, 12632256, 13158600, 13684944, 14211288, 14737632, 15263976, 0, 526344, 1052688, 1579032, 2105376, 2631720, 3158064, 3684408, 4210752, 4737096, 5263440, 5789784, 6316128, 6842472, 7368816, 7895160, 0, 263172, 526344, 789516, 1052688, 1315860, 1579032, 1842204, 2105376, 2368548, 2631720, 2894892, 3158064, 3421236, 3684408, 3947580, 0, 1118464, 2236928, 3355392, 4473856, 5592320, 6710784, 7829248, 8947712, 10066176, 11184640, 12303104, 13421568, 14540032, 15658496, 16776960, 0, 2048, 4096, 6144, 8192, 10240, 12288, 14336, 16384, 18432, 20480, 22528, 24576, 26624, 28672, 30720, 3684471, 4210824, 4737177, 5263530, 5789883, 6316236, 6842589, 7368942, 7895295, 8421631, 8947967, 9474303, 10000639, 10526975, 11053311, 11579647, 0, 1116160, 2232320, 3348480, 4464640, 5580800, 6696960, 7813120, 8929280, 10045440, 11161600, 12277760, 13393920, 14510080, 15626240, 16742400, 0, 524288, 1048576, 1572864, 2097152, 2621440, 3145728, 3670016, 4194304, 4718592, 5242880, 5767168, 6291456, 6815744, 7340032, 7864320, 0, 1114129, 2228258, 3342387, 4456516, 5570645, 6684774, 7798903, 8913032, 10027161, 11141290, 12255419, 13369548, 14483677, 15597806, 16711935};

    /* JADX INFO: renamed from: aw */
    private short[] f248aw = {0, 6, 0, 9, 3, 4, 8, 8, 8, 7, 2, 4, 0, 0, 0, 10, 4, 1, 11, 2, 4, 0, 4, 2, 11, 4, 2, 7, 2, 0, 4, 3, 4, 0, 3, 3, 2, 4, 0, 4, 6, 4, 4, 4, 4, 9, 3, 2, 4, 4, 4, 2, 4, 2, 2, 4, 2, 0, 5, 0, 4, 1, 4, 1, 4, 0, 10, 6, 10, 0, 2, 2, 4, 0, 4, 11, 8, 11, 2, 4, 0, 0, 4, 0, 7, 2, 7, 7, 1, 4, 0, 0, 0, 0, 4, 0, 2, 7, 2, 4, 3, 4};

    /* JADX INFO: renamed from: o */
    private short[] f265o = {4, 4, 4, 3, 3, 4, 7, 8, 8, 2, 2, 4, 4, 0, 0, 1, 1, 1, 4, 4, 4, 4, 4, 2, 4, 4, 2, 2, 2, 0, 0, 4, 4, 4, 4, 3, 4, 2, 0, 5, 4, 4, 5, 5, 4, 4, 3, 2, 2, 6, 2, 4, 2, 2, 4, 2, 2, 4, 0, 0, 5, 8, 4, 5, 1, 0, 4, 10, 10, 5, 4, 2, 0, 0, 0, 4, 5, 11, 4, 4, 0, 4, 4, 4, 2, 4, 7, 1, 1, 4, 4, 0, 0, 4, 4, 0, 7, 7, 2, 3, 4, 4};

    public C0005e() throws Exception {
        this.f189J = null;
        this.f258h = null;
        this.f186G = null;
        DeviceControl.setLights(0, 100);
        this.f237al = true;
        this.f196Q = 0;
        this.f250ay = false;
        this.f206a = false;
        this.f262l = this;
        m118h();
        m125a(-1);
        m162q();
        this.f189J = Font.getFont(0, 1, 0);
        this.f258h = Font.getFont(0, 1, 8);
        this.f186G = Font.getFont(0, 1, 16);
        this.f238am = this.f189J.getHeight();
        this.f183D = this.f258h.getHeight();
        this.f223aQ = this.f186G.getHeight();
        m119l();
        setFullScreenMode(true);
        this.f276z = new C0004d(this);
        this.f218aL = new Timer();
        this.f218aL.schedule(this.f276z, 0L, 100L);
        this.f200U = -1;
    }

    /* JADX INFO: renamed from: a */
    private int m97a(Object obj) {
        int i = 0;
        while (i < 64) {
            if (this.f221aO[i] == null) {
                this.f221aO[i] = obj;
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private int m98a(Graphics graphics, int i, boolean z, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int iM154i = m154i();
        if (z) {
            m110a(graphics, i == 1, z2);
        }
        int i8 = this.f276z.f142bm;
        int i9 = 0;
        int height = this.f189J.getHeight();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            int i12 = i9;
            if (i11 >= i) {
                break;
            }
            if (z) {
                m103a(graphics, m123a((short) i11), 120, (-graphics.getTranslateY()) + 47, 17, 2236962, 16776960, false, 1);
            }
            i10 = i11 + 1;
            i9 = i12 + 1;
        }
        graphics.setClip(0, -20, 240, 260 - height);
        if (iM154i == 0) {
            i4 = 230;
            i5 = 24;
        } else {
            i4 = 120;
            i5 = 17;
        }
        if (this.f276z.f142bm >= this.f247av + i3) {
            this.f247av = (this.f276z.f142bm - i3) + 1;
        }
        if (this.f276z.f142bm < this.f247av) {
            this.f247av = this.f276z.f142bm;
        }
        int i13 = this.f247av;
        int i14 = this.f247av + i3;
        int iM158m = i14 > m158m() ? m158m() : i14;
        int i15 = (iM158m - i13 >= i3 || (i13 = iM158m - i3) >= 0) ? i13 : 1;
        int i16 = this.f276z.f142bm > 1 ? 1048582 : 1048581;
        int i17 = this.f276z.f142bm < i2 + (-1) ? 1048584 : 1048583;
        m108a(graphics, i16, this.f276z.f120bL, i4, -3, 40);
        int i18 = 0;
        for (int i19 = i15; i19 < iM158m; i19++) {
            if (z) {
                if (i19 == this.f276z.f142bm) {
                    i6 = 12255232;
                    i7 = 16777215;
                    z3 = true;
                } else {
                    i6 = 3355443;
                    i7 = 16776960;
                    z3 = false;
                }
                m103a(graphics, m123a((short) i19), i4, i18, i5, i6, i7, z3, 1);
            }
            i18 += height;
        }
        m108a(graphics, i17, this.f276z.f120bL, i4, i18 + 5, 24);
        int i20 = i18 + 15;
        graphics.setClip(0, 0, 240, 320);
        return i20;
    }

    /* JADX INFO: renamed from: a */
    private int m99a(Graphics graphics, int i, boolean z, int i2, boolean z2) {
        return m98a(graphics, i, z, i2, 3, z2);
    }

    /* JADX INFO: renamed from: a */
    private int m100a(Graphics graphics, int i, boolean z, int i2, boolean z2, boolean z3) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int iM154i = m154i();
        int iM132b = m132b();
        if (z && z2) {
            m110a(graphics, i == 1, z3);
        }
        int i7 = 0;
        int i8 = this.f276z.f142bm;
        int i9 = 0;
        int height = this.f189J.getHeight() - 2;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= i) {
                break;
            }
            if (z) {
                m103a(graphics, m123a((short) i11), 120, (-graphics.getTranslateY()) + 47, 17, 2236962, 16776960, false, 1);
            }
            i10 = i11 + 1;
            i9++;
        }
        graphics.setClip(0, 0, 240, 260 - height);
        if (iM154i == 0) {
            i3 = 24;
            i4 = 230;
        } else {
            i3 = 17;
            i4 = 120;
        }
        while (i9 < i2) {
            if (z) {
                if (i9 == this.f276z.f142bm) {
                    i5 = 12255232;
                    i6 = 16777215;
                    z4 = true;
                } else {
                    i5 = 3355443;
                    i6 = 16776960;
                    z4 = false;
                }
                m103a(graphics, m123a((short) i9), i4, i7, i3, i5, i6, z4, iM132b);
            }
            i7 += height;
            i9++;
        }
        graphics.setClip(0, 0, 240, 320);
        return i7;
    }

    /* JADX INFO: renamed from: a */
    private int m101a(Graphics graphics, int i, boolean z, boolean z2) {
        return m100a(graphics, i, z, m158m(), true, z2);
    }

    /* JADX INFO: renamed from: a */
    private int m102a(Graphics graphics, String str, int i, int i2, int i3) {
        return m103a(graphics, str, i, i2, i3, 3355443, 16776960, false, 1);
    }

    /* JADX INFO: renamed from: a */
    private int m103a(Graphics graphics, String str, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        switch (i6) {
            case 1:
                graphics.setFont(this.f189J);
                break;
            case 2:
                graphics.setFont(this.f186G);
                break;
            default:
                graphics.setFont(this.f258h);
                break;
        }
        if (z && i6 != 0) {
            graphics.setColor(i4);
            graphics.drawString(str, i + 1, i2 + 1, i3);
            graphics.drawString(str, i - 1, i2 - 1, i3);
            graphics.drawString(str, i, i2 - 1, i3);
            graphics.drawString(str, i, i2 + 1, i3);
            graphics.setColor(i5);
            graphics.drawString(str, i, i2, i3);
        } else {
            graphics.setColor(i5);
            graphics.drawString(str, i, i2, i3);
        }
        return this.f189J.stringWidth(str);
    }

    /* JADX INFO: renamed from: a */
    private int m104a(short[] sArr, short[] sArr2, byte[] bArr, int[] iArr, int[] iArr2, int i, float f, float f2, int i2, int i3, int i4) {
        int i5 = this.f271u;
        this.f195P[i5] = new VertexArray(sArr.length / 3, 3, 2);
        this.f195P[i5].set(0, sArr.length / 3, sArr);
        this.f194O[i5] = new VertexBuffer();
        this.f194O[i5].setPositions(this.f195P[i5], f, (float[]) null);
        this.f194O[i5].setDefaultColor(i);
        if (iArr == null) {
            this.f229ad[i5] = new TriangleStripArray(0, iArr2);
        } else {
            this.f229ad[i5] = new TriangleStripArray(iArr, iArr2);
        }
        this.f187H[i5] = new PolygonMode();
        if ((i4 & 1) != 0) {
            this.f187H[i5].setPerspectiveCorrectionEnable(true);
        } else {
            this.f187H[i5].setPerspectiveCorrectionEnable(false);
        }
        this.f187H[i5].setCulling(162);
        this.f230ae[i5] = new Appearance();
        this.f199T[i5] = new CompositingMode();
        this.f199T[i5].setBlending(68);
        if (bArr != null) {
            this.f204Y[i5] = new VertexArray(bArr.length / 3, 3, 1);
            this.f204Y[i5].set(0, bArr.length / 3, bArr);
            this.f194O[i5].setColors(this.f204Y[i5]);
            if ((i4 & 2) != 0) {
                this.f187H[i5].setShading(165);
            } else {
                this.f187H[i5].setShading(164);
            }
        }
        if (sArr2 != null) {
            if ((i4 & 64) != 0) {
                short[] sArr3 = {0, 0, 0, 0, 0, 0, 0, 0};
                for (int i6 = 0; i6 < 8; i6++) {
                    if ((i6 & 1) == 0) {
                        sArr3[i6] = (short) (sArr2[(((i4 >> 8) & 255) * 8) + i6] * 2);
                    } else {
                        sArr3[i6] = sArr2[(((i4 >> 8) & 255) * 8) + i6];
                    }
                }
                this.f209aC[i5] = new VertexArray(sArr3.length / 2, 2, 2);
                this.f209aC[i5].set(0, sArr3.length / 2, sArr3);
            } else {
                this.f209aC[i5] = new VertexArray(sArr2.length / 2, 2, 2);
                this.f209aC[i5].set(0, sArr2.length / 2, sArr2);
            }
            this.f194O[i5].setTexCoords(0, this.f209aC[i5], f2, (float[]) null);
            if ((i4 & 16) != 0) {
                this.f230ae[i5].setTexture(0, this.f273w[i4 >> 16]);
            } else {
                if ((i4 & 4) != 0) {
                    this.f235aj[i5] = new Image2D(100, m142d(i2, i3));
                } else {
                    this.f235aj[i5] = new Image2D(99, m142d(i2, i3));
                }
                this.f273w[i5] = new Texture2D(this.f235aj[i5]);
                this.f273w[i5].setFiltering(208, 210);
                this.f273w[i5].setWrapping(241, 241);
                this.f273w[i5].setBlending(228);
                this.f230ae[i5].setTexture(0, this.f273w[i5]);
            }
            if ((i4 & 4) != 0) {
                this.f199T[i5].setAlphaThreshold(1.0f);
                this.f199T[i5].setBlending(64);
            }
        }
        if ((i4 & 8) != 0) {
            this.f199T[i5].setDepthTestEnable(true);
            this.f199T[i5].setDepthWriteEnable(true);
        } else {
            this.f199T[i5].setDepthTestEnable(false);
            this.f199T[i5].setDepthWriteEnable(false);
        }
        this.f230ae[i5].setPolygonMode(this.f187H[i5]);
        this.f230ae[i5].setCompositingMode(this.f199T[i5]);
        this.f271u++;
        return i5;
    }

    /* JADX INFO: renamed from: a */
    private short m105a(InputStream inputStream) throws Exception {
        return (short) ((inputStream.read() + (inputStream.read() << 8)) & 65535);
    }

    /* JADX INFO: renamed from: a */
    private void m106a(Graphics graphics, int i) {
        this.f189J.getHeight();
        String strM148e = m148e();
        String strM156j = m156j();
        String strM122a = m122a();
        m108a(graphics, 1048578, this.f276z.f120bL, 0, this.f202W + 320, 36);
        if (this.f202W > 0) {
            this.f202W -= 4;
            return;
        }
        if (strM148e != null) {
            m103a(graphics, strM148e, 10, 317, 36, 3355443, 16776960, false, i);
        }
        if (strM156j != null) {
            m103a(graphics, strM156j, 120, 273, 17, 3355443, 16776960, false, i);
        }
        if (strM122a != null) {
            m103a(graphics, strM122a, 230, 317, 40, 3355443, 16776960, false, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m107a(Graphics graphics, int i, int i2, int i3) {
        int iM85k = this.f276z.m85k(i);
        if (iM85k != -1) {
            int iM120a = m120a(iM85k, this.f276z.f40L);
            int iM133b = m133b(iM85k, this.f276z.f40L);
            graphics.setColor(0);
            graphics.fillRect((i2 - (iM120a >> 1)) + 2, i3 + 2, iM120a, iM133b);
            m108a(graphics, iM85k, this.f276z.f40L, i2, i3, 17);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m108a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        Image image;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = (int[]) this.f221aO[i2];
        int i10 = ((1048575 & i) * 8) + 4;
        int i11 = iArr[i10 + 7];
        int width = 0;
        int height = 0;
        int i12 = iArr[i10 + 2];
        int i13 = iArr[i10 + 3];
        if (i12 == 0 || i13 == 0) {
            return;
        }
        switch (iArr[3]) {
            case 0:
                Image image2 = (Image) this.f221aO[iArr[(iArr[0] * 8) + i11 + (iArr[1] * 3) + 4]];
                width = image2.getWidth();
                height = image2.getHeight();
                image = image2;
                break;
            default:
                image = null;
                break;
        }
        if (i12 == 0) {
            i12 = width;
        }
        if (i13 == 0) {
            i13 = height;
        }
        int i14 = (i5 & 2) != 0 ? i4 - (i13 / 2) : i4;
        int i15 = (i5 & 1) != 0 ? i3 - (i12 / 2) : i3;
        int i16 = (i5 & 8) != 0 ? i15 - i12 : i15;
        if ((i5 & 32) != 0) {
            i14 -= i13;
        }
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int i17 = i16 - iArr[i10 + 4];
        int i18 = i14 - iArr[i10 + 5];
        if (i17 + i12 < clipX || i17 >= clipX + clipWidth || i18 + i13 < clipY || i18 >= clipY + clipHeight) {
            return;
        }
        if (i17 < clipX) {
            i7 = i12 - (clipX - i17);
            i6 = clipX;
        } else {
            i6 = i17;
            i7 = i12;
        }
        int i19 = i6 + i7 > clipX + clipWidth ? i7 - ((i6 + i7) - (clipX + clipWidth)) : i7;
        if (i18 < clipY) {
            i9 = i13 - (clipY - i18);
            i8 = clipY;
        } else {
            i8 = i18;
            i9 = i13;
        }
        if (i8 + i9 > clipY + clipHeight) {
            i9 -= (i8 + i9) - (clipY + clipHeight);
        }
        switch (iArr[3]) {
            case 0:
                graphics.setClip(i6, i8, i19, i9);
                graphics.drawImage(image, i17 - iArr[i10], i18 - iArr[i10 + 1], 20);
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m109a(Graphics graphics, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        m107a(graphics, i5, 65, 89);
        m107a(graphics, i6, 175, 89);
        m103a(graphics, m123a((short) i), 65, 164 - this.f183D, 33, 3355443, 16776960, false, 1);
        m103a(graphics, m123a((short) i2), 175, 164 - this.f183D, 33, 3355443, 16776960, false, 1);
        m103a(graphics, m123a((short) i3), 65, 164, 33, 3355443, 16776960, false, 0);
        m103a(graphics, m123a((short) i4), 175, 164, 33, 3355443, 16776960, false, 0);
        m102a(graphics, this.f225aS.m166a((short) 128), 120, 106, 17);
    }

    /* JADX INFO: renamed from: a */
    private void m110a(Graphics graphics, boolean z, boolean z2) {
        int translateY = graphics.getTranslateY();
        if (this.f198S < 0) {
            this.f198S += 2;
        }
        if (this.f234ai != null) {
            graphics.drawImage(this.f234ai, 0, -translateY, 20);
        }
        m108a(graphics, 1048577, this.f276z.f120bL, 0, (-translateY) + this.f198S, 20);
        if (z) {
            m108a(graphics, 1048579, this.f276z.f120bL, 0, (-translateY) + 48, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    private int m111b(Graphics graphics, int i) {
        boolean z;
        int i2;
        int i3 = this.f238am + 76 + 4;
        m110a(graphics, true, false);
        m102a(graphics, m123a((short) 0), 120, (-graphics.getTranslateY()) + 47, 17);
        m103a(graphics, this.f225aS.m166a((short) 7), 13, 76, 20, 0, 16776960, true, 1);
        m103a(graphics, this.f225aS.m166a((short) 6), 120, 76, 17, 0, 16776960, true, 1);
        m103a(graphics, this.f225aS.m166a((short) 5), 216, 76, 24, 0, 16776960, true, 1);
        graphics.setColor(16776960);
        graphics.drawRect(5, i3 + 1, 230, 1);
        int i4 = i3 + 10;
        if (this.f276z.f142bm >= this.f247av + i) {
            this.f247av++;
        }
        if (this.f276z.f142bm < this.f247av) {
            this.f247av--;
        }
        int i5 = this.f247av;
        int i6 = this.f247av + i;
        int i7 = i6 > 8 ? 8 : i6;
        int i8 = i7 - i5 < i ? i7 - i : i5;
        int i9 = this.f276z.f142bm > 1 ? 1048582 : 1048581;
        int i10 = this.f276z.f142bm < 7 ? 1048584 : 1048583;
        m108a(graphics, i9, this.f276z.f120bL, 237, i4 + 6, 24);
        m108a(graphics, i10, this.f276z.f120bL, 237, 268, 40);
        int i11 = i8;
        int i12 = i4;
        while (i11 < i7) {
            int i13 = this.f276z.f119bK[(((this.f276z.f151bv - 18) * 8) / 2) + i11 + 474];
            int i14 = this.f276z.f119bK[i13 + 408];
            int i15 = this.f276z.f119bK[i13 + i13 + 0 + 442];
            int i16 = this.f276z.f119bK[((i13 + i13) + 1) + 442] - this.f276z.f57aB[i13 * 1];
            int i17 = this.f276z.f142bm == i11 ? 16777215 : 16776960;
            if (i14 == this.f276z.f119bK[406]) {
                z = true;
                i2 = 16729156;
            } else {
                z = false;
                i2 = i17;
            }
            m103a(graphics, this.f225aS.m166a(this.f276z.m61c(i14)), 13, i12, 20, 3355443, i2, z, 1);
            m103a(graphics, new StringBuffer().append("").append(i15).toString(), 120, i12, 17, 3355443, i2, z, 1);
            m103a(graphics, new StringBuffer().append("").append(i16).toString(), 210, i12, 24, 3355443, i2, z, 1);
            i12 += this.f238am;
            i11++;
        }
        return 76;
    }

    /* JADX INFO: renamed from: b */
    private void m112b(Graphics graphics) {
        for (int i = 0; i < 320; i += 32) {
            for (int i2 = 0; i2 < 240; i2 += 32) {
                m108a(graphics, 1048586, this.f276z.f120bL, i2, i, 20);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m113c(Graphics graphics, int i) {
        graphics.setClip(2, i, 236, 12);
        int i2 = this.f266p;
        int i3 = 2;
        while (i3 < 236) {
            if (i2 < 9) {
                graphics.setColor(((((i2 * 90) / 10) + 0) << 8) | 0 | 0);
            } else {
                graphics.setColor((((((19 - i2) * 90) / 10) + 0) << 8) | 0 | 0);
            }
            graphics.fillRect(i3, i + 1, i3 + 12, 10);
            i3 += 12;
            i2 = (i2 + 18) % 19;
        }
        this.f266p = (this.f266p + 1) % 19;
        graphics.setColor(0);
        graphics.drawRect(2, i, 236, 11);
        graphics.setClip(0, 0, 240, 320);
    }

    /* JADX INFO: renamed from: d */
    private void m114d(Graphics graphics) {
        m106a(graphics, 1);
    }

    /* JADX INFO: renamed from: d */
    private void m115d(Graphics graphics, int i) {
        String strM137c;
        int i2 = 0;
        switch (i) {
            case 0:
                strM137c = m137c((short) 54);
                break;
            case 1:
                strM137c = m137c((short) 57);
                break;
            case 2:
                strM137c = m137c((short) 12);
                break;
            default:
                strM137c = "???";
                break;
        }
        m108a(graphics, 1048580, this.f276z.f120bL, 0, 71, 20);
        while (true) {
            int i3 = i2;
            if (i3 >= 10) {
                m103a(graphics, strM137c, 47, 75, 17, 2236962, 16776960, true, 1);
                return;
            }
            m108a(graphics, 1048585, this.f276z.f120bL, (this.f245at[(i * 10 * 2) + (i3 * 2)] * 7) + 10, ((((this.f245at[(((i * 10) * 2) + (i3 * 2)) + 1] * 16) + 48) + 25) + 99) - 80, 20);
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m116e(Graphics graphics) {
        m141c(graphics);
    }

    /* JADX INFO: renamed from: f */
    private void m117f(Graphics graphics) {
        graphics.setColor(0);
        graphics.fillRect(0, 0, 240, this.f183D + 2);
        m103a(graphics, this.f260j, 1, 1, 20, 3355443, 16776960, false, 0);
        m103a(graphics, this.f242aq, 239, 1, 24, 3355443, 16776960, false, 0);
    }

    /* JADX INFO: renamed from: h */
    private void m118h() throws Exception {
        InputStream resourceAsStream = getClass().getResourceAsStream("/a");
        this.f275y = m105a(resourceAsStream);
        this.f236ak = m105a(resourceAsStream);
        this.f232ag = m105a(resourceAsStream);
        this.f269s = new short[(this.f232ag * 5) + (this.f275y * 1)];
        this.f221aO = new Object[64];
        for (int i = 0; i < this.f275y; i++) {
            this.f269s[(i * 1) + (this.f232ag * 5)] = m105a(resourceAsStream);
        }
        for (int i2 = 0; i2 < this.f232ag; i2++) {
            this.f269s[i2 * 5] = m105a(resourceAsStream);
            this.f269s[(i2 * 5) + 1] = (short) ((this.f269s[(i2 * 5) + 1] & 65280) | (resourceAsStream.read() & 255));
            this.f269s[(i2 * 5) + 1] = (short) ((this.f269s[(i2 * 5) + 1] & 255) | ((resourceAsStream.read() & 255) << 8));
            this.f269s[(i2 * 5) + 2] = m105a(resourceAsStream);
            this.f269s[(i2 * 5) + 3] = m105a(resourceAsStream);
            this.f269s[(i2 * 5) + 4] = m105a(resourceAsStream);
        }
        resourceAsStream.close();
    }

    /* JADX INFO: renamed from: l */
    private void m119l() {
        this.f226aa = new String[4];
        this.f181B = new String[2];
    }

    /* JADX INFO: renamed from: a */
    public int m120a(int i, int i2) {
        return ((int[]) this.f221aO[i2])[((1048575 & i) * 8) + 4 + 2];
    }

    /* JADX INFO: renamed from: a */
    public int m121a(Graphics graphics, int i, int i2, Vector vector, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = this.f276z.f142bm;
        int size = vector.size();
        int i4 = (320 - i2) - 65;
        int height = this.f189J.getHeight() + 3;
        int i5 = i4 / height;
        if (z && z3) {
            m110a(graphics, true, z4);
        }
        if (z3) {
            m102a(graphics, m123a((short) 0), 120, (-graphics.getTranslateY()) + 47, 17);
            if (z2) {
                int i6 = i3 > 0 ? 1048582 : 1048581;
                int i7 = i3 < (vector.size() - i5) + (-2) ? 1048584 : 1048583;
                m108a(graphics, i6, this.f276z.f120bL, 120, 76, 17);
                m108a(graphics, i7, this.f276z.f120bL, 120, 268, 33);
            }
        }
        graphics.setClip(0, i2, 240, i4);
        int i8 = i3;
        int i9 = i2;
        while (i8 < size && i8 < i3 + i5) {
            if (z3) {
                m102a(graphics, i8 >= 0 ? (String) vector.elementAt(i8) : "???", i, i9, 17);
            }
            i9 += height;
            i8++;
        }
        graphics.setClip(0, 0, 240, 320);
        return i9;
    }

    /* JADX INFO: renamed from: a */
    public String m122a() {
        return this.f255e;
    }

    /* JADX INFO: renamed from: a */
    public String m123a(short s) {
        return (String) this.f239an.elementAt(s);
    }

    /* JADX INFO: renamed from: a */
    public Vector m124a(String str, Font font, int i) {
        this.f264n = new Vector();
        while (true) {
            int iM134b = m134b(str, font, i);
            if (iM134b <= 0) {
                return this.f264n;
            }
            str = str.substring(iM134b);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r6v0 ??, r6v1 ??, r6v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: a */
    void m125a(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, short], vars: [r6v0 ??, r6v1 ??, r6v2 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX INFO: renamed from: a */
    public void m126a(int i, boolean z) {
        int[] iArr = new int[80];
        int iNextInt = (new Random().nextInt() & Integer.MAX_VALUE) % 8;
        if (i < 0 || i * 3 >= this.f248aw.length) {
            return;
        }
        System.arraycopy(this.f263m, iNextInt * 18, iArr, 0, 18);
        System.arraycopy(this.f212aF, 0, iArr, 18, 14);
        if (z) {
            System.arraycopy(this.f254d, this.f248aw[(i * 3) + 1] * 16, iArr, 32, 16);
            System.arraycopy(this.f254d, this.f248aw[(i * 3) + 2] * 16, iArr, 48, 16);
            System.arraycopy(this.f254d, this.f248aw[i * 3] * 16, iArr, 64, 16);
        } else {
            System.arraycopy(this.f254d, this.f265o[(i * 3) + 1] * 16, iArr, 32, 16);
            System.arraycopy(this.f254d, this.f265o[(i * 3) + 2] * 16, iArr, 48, 16);
            System.arraycopy(this.f254d, this.f265o[i * 3] * 16, iArr, 64, 16);
        }
        this.f207aA = this.f208aB.m170a(iArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m127a(String str) {
        this.f239an.addElement(str);
    }

    /* JADX INFO: renamed from: a */
    public void m128a(Graphics graphics) {
        if (this.f274x != null) {
            graphics.drawImage(this.f274x, 120, 102, 17);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m129a(short s, short s2) {
        m130a((short) -1, s, s2);
    }

    /* JADX INFO: renamed from: a */
    public void m130a(short s, short s2, short s3) {
        if (s > -1) {
            this.f180A = this.f225aS.m166a(s);
        } else {
            this.f180A = null;
        }
        if (s2 > -1) {
            this.f261k = this.f225aS.m166a(s2);
        } else {
            this.f261k = null;
        }
        if (s3 > -1) {
            this.f255e = this.f225aS.m166a(s3);
        } else {
            this.f255e = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m131a(short s, String[] strArr) {
        this.f239an.addElement(this.f225aS.m167a(s, strArr));
    }

    /* JADX INFO: renamed from: b */
    public int m132b() {
        return this.f246au;
    }

    /* JADX INFO: renamed from: b */
    public int m133b(int i, int i2) {
        return ((int[]) this.f221aO[i2])[((1048575 & i) * 8) + 4 + 3];
    }

    /* JADX INFO: renamed from: b */
    public int m134b(String str, Font font, int i) {
        int iStringWidth;
        this.f215aI = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            char cCharAt = i4 >= str.length() ? (char) 0 : str.charAt(i4);
            if (cCharAt == ' ' || cCharAt == 0 || cCharAt == '|' || cCharAt == '-' || cCharAt == '\n') {
                String strSubstring = str.substring(0, i4);
                if (font.stringWidth(strSubstring) > i) {
                    if (i3 == -1) {
                        do {
                            iStringWidth = font.stringWidth(strSubstring.substring(0, i4));
                            i4--;
                        } while (iStringWidth > i);
                    } else {
                        i4 = i3;
                    }
                    this.f264n.addElement(str.substring(0, i4));
                    return (i4 + 1) - i2;
                }
                if (cCharAt == 0 || cCharAt == '|' || cCharAt == '\n') {
                    this.f264n.addElement(str.substring(0, i4));
                    if (cCharAt == 0) {
                        return -1;
                    }
                    return i4 + 1;
                }
                if (cCharAt == '-') {
                    i3 = i4 + 1;
                    i2 = 1;
                } else {
                    i3 = i4;
                }
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: b */
    void m135b(int i) {
        int[] iArr = (int[]) this.f221aO[i];
        if (iArr != null) {
            for (int i2 = 0; i2 < iArr[2]; i2++) {
                this.f221aO[iArr[(iArr[0] * 8) + i2 + (iArr[1] * 3) + 4]] = null;
            }
            this.f221aO[i] = null;
            System.gc();
        }
        System.gc();
    }

    /* JADX INFO: renamed from: b */
    public void m136b(short s) {
        String strM166a = this.f225aS.m166a(s);
        int iIndexOf = strM166a.indexOf("\n");
        if (iIndexOf < 0) {
            this.f239an.addElement(strM166a);
        } else {
            this.f239an.addElement(strM166a.substring(0, iIndexOf));
            this.f239an.addElement(strM166a.substring(iIndexOf + 2, strM166a.length()));
        }
    }

    /* JADX INFO: renamed from: c */
    public String m137c(short s) {
        return this.f225aS.m166a(s);
    }

    /* JADX INFO: renamed from: c */
    public void m138c() {
        this.f181B[0] = new StringBuffer().append("").append(this.f276z.f170q / 60000).toString();
        this.f181B[1] = new StringBuffer().append("").append((this.f276z.f170q % 60000) / 1000 < 10 ? "0" : "").append((this.f276z.f170q % 60000) / 1000).toString();
        this.f242aq = this.f225aS.m167a((short) 30, this.f181B);
    }

    /* JADX INFO: renamed from: c */
    public void m139c(int i) {
        m140c(i, 1);
    }

    /* JADX INFO: renamed from: c */
    public void m140c(int i, int i2) {
        if (this.f239an == null) {
            this.f239an = new Vector();
        } else {
            this.f239an.removeAllElements();
        }
        this.f180A = null;
        this.f261k = null;
        this.f255e = null;
        m152g(i);
        this.f246au = i2;
        this.f247av = this.f276z.f142bm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX INFO: renamed from: c */
    public void m141c(Graphics graphics) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        this.f222aP.bindTarget(graphics, true, 0);
        this.f222aP.clear(this.f190K);
        int i2 = !this.f276z.f114bF ? 0 : 1;
        Transform transform = new Transform();
        float f6 = ((this.f276z.f119bK[23] - 800.0f) - 3488.0f) / 34.8f;
        float f7 = ((this.f276z.f119bK[55] - 1280.0f) - 4384.0f) / 28.4f;
        float f8 = f6 - this.f216aJ;
        float f9 = f7 - this.f214aH;
        float f10 = (f8 * f8) + (f9 * f9);
        if (f10 < 1.0d || f10 > 2500.0d || this.f237al) {
            this.f216aJ = f6;
            this.f214aH = f7;
            f = f7;
            f2 = f6;
        } else {
            this.f216aJ = (f8 / 3.0f) + this.f216aJ;
            this.f214aH += f9 / 3.0f;
            f2 = this.f216aJ;
            f = this.f214aH;
        }
        float f11 = this.f276z.f95an[i2] * 2.8125f;
        int i3 = this.f276z.f119bK[i2 + 384] + (i2 * 11);
        int i4 = this.f276z.f119bK[i3 + 192];
        int i5 = this.f276z.f119bK[i3 + 288];
        boolean z = false;
        if (i4 == 0 && ((this.f276z.f43O == 2 && this.f276z.f173t == i2 && i3 == i2 * 11) || ((this.f276z.f43O == 3 && this.f276z.f121bM == i2 && i5 > 23) || ((this.f276z.f43O == 4 && this.f276z.f68aM == i2) || ((this.f276z.f43O == 6 && this.f276z.f32D == i2) || (this.f276z.f43O == 7 && this.f276z.f32D == i2)))))) {
            z = true;
            if (this.f276z.f43O == 7) {
                this.f272v = f2;
                this.f270t = 25.0f;
                this.f267q = f;
                this.f185F = f11;
                this.f257g = 20;
            }
        }
        ?? r10 = z;
        if (r10 != 0 || this.f257g > 0) {
            if (r10 == 0) {
                f4 = this.f272v;
                float f12 = this.f267q;
                f11 = this.f185F;
                f3 = f12;
            } else {
                f3 = f;
                f4 = f2;
            }
            transform.postTranslate((float) (((double) f4) - (Math.sin(Math.toRadians(f11)) * 33.0d)), 25.0f, (float) (((double) f3) + (Math.cos(Math.toRadians(f11)) * 33.0d)));
            transform.postRotate((-30.0f) * ((float) Math.sin(Math.toRadians(f11))), 0.0f, 0.0f, 1.0f);
            transform.postRotate((-30.0f) * ((float) Math.cos(Math.toRadians(f11))), 1.0f, 0.0f, 0.0f);
            transform.postRotate(-f11, 0.0f, 1.0f, 0.0f);
            this.f222aP.setCamera(this.f259i, transform);
            this.f197R.setIdentity();
            this.f197R.postTranslate(-120.0f, 0.0f, -180.0f);
            for (int i6 = 0; i6 <= 6; i6++) {
                this.f222aP.render(this.f194O[this.f228ac], this.f229ad[this.f228ac], this.f230ae[this.f228ac], this.f197R);
                this.f197R.postTranslate(0.0f, 0.0f, 80.0f);
            }
            this.f197R.setIdentity();
            this.f197R.postTranslate(-120.0f, 0.0f, -220.0f);
            this.f222aP.render(this.f194O[this.f227ab], this.f229ad[this.f227ab], this.f230ae[this.f227ab], this.f197R);
            this.f197R.setIdentity();
            this.f197R.postTranslate(240.0f - 120.0f, 0.0f, 440.0f - 220.0f);
            this.f197R.postRotate(180.0f, 0.0f, 1.0f, 0.0f);
            this.f222aP.render(this.f194O[this.f227ab], this.f229ad[this.f227ab], this.f230ae[this.f227ab], this.f197R);
            this.f197R.setIdentity();
            this.f197R.postTranslate((-120.0f) - 40.0f, 0.0f, 40.0f - 220.0f);
            this.f222aP.render(this.f194O[this.f188I], this.f229ad[this.f188I], this.f230ae[this.f188I], this.f197R);
            this.f197R.setIdentity();
            this.f197R.postTranslate((-120.0f) + 280.0f, 0.0f, (-220.0f) + 400.0f);
            this.f197R.postRotate(180.0f, 0.0f, 1.0f, 0.0f);
            this.f222aP.render(this.f194O[this.f188I], this.f229ad[this.f188I], this.f230ae[this.f188I], this.f197R);
        } else {
            switch (this.f276z.f91aj) {
                case 0:
                    float f13 = f2 + 60.0f;
                    if (f13 > 130.0f) {
                        f13 = 130.0f;
                    }
                    if (f < -140.0f) {
                        f = -140.0f;
                    }
                    if (f > 140.0f) {
                        f = 140.0f;
                    }
                    transform.postTranslate(f13, 25.0f, f);
                    transform.postRotate(30.0f, 0.0f, 0.0f, 1.0f);
                    transform.postRotate(90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                case 1:
                    float f14 = 60.0f + f;
                    if (f14 > 190.0f) {
                        f14 = 190.0f;
                    }
                    float f15 = f2 < -85.0f ? -85.0f : f2;
                    if (f15 > 85.0f) {
                        f15 = 85.0f;
                    }
                    transform.postTranslate(f15, 25.0f, f14);
                    transform.postRotate(-30.0f, 1.0f, 0.0f, 0.0f);
                    f = f14;
                    break;
                case 2:
                    transform.postTranslate(f2, 80.0f, f);
                    transform.postRotate(-90.0f, 1.0f, 0.0f, 0.0f);
                    break;
            }
            this.f222aP.setCamera(this.f259i, transform);
            float f16 = f + 180.0f;
            int i7 = (int) (f16 / 80.0f);
            float f17 = f16 % 80.0f;
            switch (this.f276z.f91aj) {
                case 0:
                    this.f197R.setIdentity();
                    this.f197R.postTranslate(-120.0f, 0.0f, -180.0f);
                    for (int i8 = 0; i8 <= 5; i8++) {
                        this.f222aP.render(this.f194O[this.f228ac], this.f229ad[this.f228ac], this.f230ae[this.f228ac], this.f197R);
                        this.f197R.postTranslate(0.0f, 0.0f, 80.0f);
                    }
                    break;
                case 1:
                    this.f197R.setIdentity();
                    this.f197R.postTranslate(-120.0f, 0.0f, -180.0f);
                    for (int i9 = 0; i9 <= i7; i9++) {
                        this.f222aP.render(this.f194O[this.f228ac], this.f229ad[this.f228ac], this.f230ae[this.f228ac], this.f197R);
                        this.f197R.postTranslate(0.0f, 0.0f, 80.0f);
                    }
                    break;
                case 2:
                    this.f197R.setIdentity();
                    this.f197R.postTranslate(-120.0f, 0.0f, (-180.0f) + (80.0f * (i7 - 1)));
                    if (i7 > 0) {
                        this.f222aP.render(this.f194O[this.f228ac], this.f229ad[this.f228ac], this.f230ae[this.f228ac], this.f197R);
                    }
                    this.f197R.postTranslate(0.0f, 0.0f, 80.0f);
                    this.f222aP.render(this.f194O[this.f228ac], this.f229ad[this.f228ac], this.f230ae[this.f228ac], this.f197R);
                    this.f197R.postTranslate(0.0f, 0.0f, 80.0f);
                    if (i7 < 5) {
                        this.f222aP.render(this.f194O[this.f228ac], this.f229ad[this.f228ac], this.f230ae[this.f228ac], this.f197R);
                    }
                    break;
            }
            if (this.f276z.f91aj != 2 || (this.f276z.f91aj == 2 && i7 < 2)) {
                this.f197R.setIdentity();
                this.f197R.postTranslate(-120.0f, 0.0f, -220.0f);
                this.f222aP.render(this.f194O[this.f227ab], this.f229ad[this.f227ab], this.f230ae[this.f227ab], this.f197R);
            }
            if (this.f276z.f91aj != 1 && (this.f276z.f91aj != 2 || (this.f276z.f91aj == 2 && i7 > 2))) {
                this.f197R.setIdentity();
                this.f197R.postTranslate(240.0f - 120.0f, 0.0f, 440.0f - 220.0f);
                this.f197R.postRotate(180.0f, 0.0f, 1.0f, 0.0f);
                this.f222aP.render(this.f194O[this.f227ab], this.f229ad[this.f227ab], this.f230ae[this.f227ab], this.f197R);
            }
            this.f197R.setIdentity();
            this.f197R.postTranslate((-120.0f) - 40.0f, 0.0f, 40.0f - 220.0f);
            this.f222aP.render(this.f194O[this.f188I], this.f229ad[this.f188I], this.f230ae[this.f188I], this.f197R);
            if (this.f276z.f91aj != 0) {
                this.f197R.setIdentity();
                this.f197R.postTranslate((-120.0f) + 280.0f, 0.0f, (-220.0f) + 400.0f);
                this.f197R.postRotate(180.0f, 0.0f, 1.0f, 0.0f);
                this.f222aP.render(this.f194O[this.f188I], this.f229ad[this.f188I], this.f230ae[this.f188I], this.f197R);
            }
        }
        this.f197R.setIdentity();
        this.f222aP.render(this.f194O[this.f184E], this.f229ad[this.f184E], this.f230ae[this.f184E], this.f197R);
        this.f197R.postRotate(180.0f, 0.0f, 1.0f, 0.0f);
        this.f222aP.render(this.f194O[this.f184E], this.f229ad[this.f184E], this.f230ae[this.f184E], this.f197R);
        this.f197R.setIdentity();
        this.f197R.postTranslate(-13.5f, 0.0f, -155.0f);
        this.f222aP.render(this.f194O[this.f243ar], this.f229ad[this.f243ar], this.f230ae[this.f243ar], this.f197R);
        this.f197R.setIdentity();
        this.f197R.postTranslate(12.5f, 0.0f, 153.5f);
        this.f197R.postRotate(180.0f, 0.0f, 1.0f, 0.0f);
        this.f222aP.render(this.f194O[this.f243ar], this.f229ad[this.f243ar], this.f230ae[this.f243ar], this.f197R);
        this.f197R.setIdentity();
        this.f197R.postTranslate(-13.5f, 0.0f, -155.0f);
        this.f222aP.render(this.f194O[this.f224aR], this.f229ad[this.f224aR], this.f230ae[this.f224aR], this.f197R);
        this.f197R.postTranslate(0.0f, 0.0f, 308.0f);
        this.f222aP.render(this.f194O[this.f224aR], this.f229ad[this.f224aR], this.f230ae[this.f224aR], this.f197R);
        this.f197R.setIdentity();
        this.f197R.postTranslate(-100.0f, 0.0f, -155.0f);
        this.f222aP.render(this.f194O[this.f217aK], this.f229ad[this.f217aK], this.f230ae[this.f217aK], this.f197R);
        this.f197R.postTranslate(0.0f, 0.0f, 155.0f);
        this.f222aP.render(this.f194O[this.f217aK], this.f229ad[this.f217aK], this.f230ae[this.f217aK], this.f197R);
        this.f197R.postTranslate(0.0f, 0.0f, 155.0f);
        this.f222aP.render(this.f194O[this.f217aK], this.f229ad[this.f217aK], this.f230ae[this.f217aK], this.f197R);
        this.f197R.setIdentity();
        this.f197R.postTranslate(100.0f, 0.0f, -155.0f);
        this.f222aP.render(this.f194O[this.f217aK], this.f229ad[this.f217aK], this.f230ae[this.f217aK], this.f197R);
        this.f197R.postTranslate(0.0f, 0.0f, 155.0f);
        this.f222aP.render(this.f194O[this.f217aK], this.f229ad[this.f217aK], this.f230ae[this.f217aK], this.f197R);
        this.f197R.postTranslate(0.0f, 0.0f, 155.0f);
        this.f222aP.render(this.f194O[this.f217aK], this.f229ad[this.f217aK], this.f230ae[this.f217aK], this.f197R);
        this.f197R.setIdentity();
        this.f197R.postTranslate(f6, 0.0f, f7);
        this.f222aP.render(this.f194O[this.f191L], this.f229ad[this.f191L], this.f230ae[this.f191L], this.f197R);
        if (this.f276z.f119bK[i2 + 400] == 0) {
            if (this.f276z.f43O == 0 || ((this.f276z.f43O == 2 && this.f276z.f173t == i2) || ((this.f276z.f43O == 3 && this.f276z.f121bM == i2) || ((this.f276z.f43O == 4 && this.f276z.f68aM == i2) || ((this.f276z.f43O == 6 && this.f276z.f32D == i2) || (this.f276z.f43O == 7 && this.f276z.f32D == i2)))))) {
                this.f197R.setIdentity();
                this.f197R.postTranslate(((this.f276z.f119bK[22] - 800.0f) - 3488.0f) / 34.8f, 0.0f, ((this.f276z.f119bK[54] - 1280.0f) - 4384.0f) / 28.4f);
                this.f222aP.render(this.f194O[this.f205Z], this.f229ad[this.f205Z], this.f230ae[this.f205Z], this.f197R);
            }
            if (r10 > 0) {
                this.f197R.setIdentity();
                float f18 = ((this.f276z.f119bK[i3 + 0] - 800.0f) - 3488.0f) / 34.8f;
                float f19 = ((this.f276z.f119bK[i3 + 32] - 1280.0f) - 4384.0f) / 28.4f;
                int i10 = this.f276z.f95an[i2];
                this.f197R.postTranslate(f18, 0.0f, f19);
                this.f197R.postRotate(((-i10) * 2.8125f) + 180.0f, 0.0f, 1.0f, 0.0f);
                this.f197R.postTranslate(0.0f, 0.0f, 8.0f);
                this.f222aP.render(this.f194O[this.f253c], this.f229ad[this.f253c], this.f230ae[this.f253c], this.f197R);
            } else if (this.f276z.f98aq[i2] == 2 && this.f276z.f43O == 0 && this.f276z.f173t == i2 && this.f276z.f64aI == 0) {
                this.f197R.setIdentity();
                this.f197R.postTranslate(((this.f276z.f119bK[i3 + 0] - 800.0f) - 3488.0f) / 34.8f, 0.0f, ((this.f276z.f119bK[i3 + 32] - 1280.0f) - 4384.0f) / 28.4f);
                this.f197R.postRotate(((-this.f276z.f95an[i2]) * 45.0f) + 180.0f, 0.0f, 1.0f, 0.0f);
                this.f197R.postTranslate(0.0f, 0.0f, 8.0f);
                this.f222aP.render(this.f194O[this.f192M], this.f229ad[this.f192M], this.f230ae[this.f192M], this.f197R);
            }
        }
        if (r10 != 0 || this.f257g > 0) {
            if (r10 == 0) {
                float f20 = this.f272v;
                float f21 = this.f267q;
                f11 = this.f185F;
                this.f257g--;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 < 22) {
                    float f22 = ((this.f276z.f119bK[i12 + 0] - 800.0f) - 3488.0f) / 34.8f;
                    float f23 = ((this.f276z.f119bK[i12 + 32] - 1280.0f) - 4384.0f) / 28.4f;
                    int i13 = this.f276z.f119bK[i12 + 288];
                    if (i13 <= 23) {
                        i = this.f276z.f119bK[i12 + 192] == 0 ? i12 == i3 ? 24 : 28 : (i13 % 3) + (((this.f276z.f119bK[i12 + 224] - (((this.f276z.f95an[i2] + 8) / 16) & 7)) & 7) * 3);
                    } else if (i12 == 0 || i12 == 11) {
                        i = this.f276z.f43O == 2 ? 24 : (i13 - 24) + 32;
                    } else {
                        i = 32;
                    }
                    this.f197R.setIdentity();
                    this.f197R.postTranslate(f22, 0.0f, f23);
                    this.f197R.postRotate(-f11, 0.0f, 1.0f, 0.0f);
                    if (i12 < 11) {
                        if (i12 == 0) {
                            this.f222aP.render(this.f194O[this.f256f[i]], this.f229ad[this.f256f[i]], this.f230ae[this.f256f[i]], this.f197R);
                        } else {
                            this.f222aP.render(this.f194O[this.f220aN[i]], this.f229ad[this.f220aN[i]], this.f230ae[this.f220aN[i]], this.f197R);
                        }
                    } else if (i12 == 11) {
                        this.f222aP.render(this.f194O[this.f211aE[i]], this.f229ad[this.f211aE[i]], this.f230ae[this.f211aE[i]], this.f197R);
                    } else {
                        this.f222aP.render(this.f194O[this.f244as[i]], this.f229ad[this.f244as[i]], this.f230ae[this.f244as[i]], this.f197R);
                    }
                    i11 = i12 + 1;
                } else {
                    this.f197R.setIdentity();
                    this.f197R.postTranslate(f6, this.f276z.f124bP / 30.0f, f7);
                    this.f197R.postRotate(-(f11 - 8.0f), 0.0f, 1.0f, 0.0f);
                    this.f222aP.render(this.f194O[this.f241ap], this.f229ad[this.f241ap], this.f230ae[this.f241ap], this.f197R);
                }
            }
        } else {
            int i14 = 0;
            while (true) {
                int i15 = i14;
                if (i15 < 22) {
                    float f24 = ((this.f276z.f119bK[i15 + 0] - 800.0f) - 3488.0f) / 34.8f;
                    float f25 = ((this.f276z.f119bK[i15 + 32] - 1280.0f) - 4384.0f) / 28.4f;
                    int i16 = this.f276z.f119bK[i15 + 288];
                    if (i16 > 23) {
                        i16 = (i15 == 0 || i15 == 11) ? (i16 - 24) + 32 : this.f276z.f119bK[i15 + 224] + 32;
                    } else if (this.f276z.f119bK[i15 + 192] == 0) {
                        i16 = this.f276z.f119bK[i15 + 224] + 24;
                    }
                    this.f197R.setIdentity();
                    this.f197R.postTranslate(f24, 0.0f, f25);
                    if (this.f276z.f91aj == 0) {
                        if ((i15 == 0 || i15 == 11) && i16 > 39) {
                            this.f197R.postRotate(15.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            this.f197R.postRotate(90.0f, 0.0f, 1.0f, 0.0f);
                        }
                        i16 = this.f249ax[i16];
                    } else if (this.f276z.f91aj == 2) {
                        if (f25 < f7) {
                            float f26 = (-(f7 - f25)) / 3.5f;
                            if (f26 < 20.0f) {
                                f26 = 20.0f;
                            }
                            f5 = -f26;
                        } else {
                            f5 = (f25 - f7) / 3.5f;
                            if (f5 < 20.0f) {
                                f5 = 20.0f;
                            }
                            i16 = this.f249ax[i16];
                        }
                        this.f197R.postRotate(f5, 1.0f, 0.0f, 0.0f);
                    }
                    if (i15 < 11) {
                        if (i15 == 0) {
                            this.f222aP.render(this.f194O[this.f256f[i16]], this.f229ad[this.f256f[i16]], this.f230ae[this.f256f[i16]], this.f197R);
                        } else {
                            this.f222aP.render(this.f194O[this.f220aN[i16]], this.f229ad[this.f220aN[i16]], this.f230ae[this.f220aN[i16]], this.f197R);
                        }
                    } else if (i15 == 11) {
                        this.f222aP.render(this.f194O[this.f211aE[i16]], this.f229ad[this.f211aE[i16]], this.f230ae[this.f211aE[i16]], this.f197R);
                    } else {
                        this.f222aP.render(this.f194O[this.f244as[i16]], this.f229ad[this.f244as[i16]], this.f230ae[this.f244as[i16]], this.f197R);
                    }
                    i14 = i15 + 1;
                } else {
                    this.f197R.setIdentity();
                    this.f197R.postTranslate(f6, this.f276z.f124bP / 30.0f, f7);
                    if (this.f276z.f91aj == 0) {
                        this.f197R.postRotate(-90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (this.f276z.f91aj == 2) {
                        this.f197R.postRotate(-90.0f, 1.0f, 0.0f, 0.0f);
                    }
                    this.f222aP.render(this.f194O[this.f241ap], this.f229ad[this.f241ap], this.f230ae[this.f241ap], this.f197R);
                }
            }
        }
        if (this.f276z.f98aq[i2] == 1 && this.f276z.f43O == 0 && this.f276z.f173t == i2 && this.f276z.f64aI == 0) {
            this.f197R.setIdentity();
            this.f197R.postTranslate(f6, 12.0f, f7);
            if (this.f276z.f91aj == 0) {
                this.f197R.postRotate(-90.0f, 0.0f, 1.0f, 0.0f);
            } else if (this.f276z.f91aj == 2) {
                this.f197R.postRotate(-90.0f, 1.0f, 0.0f, 0.0f);
            }
            this.f222aP.render(this.f194O[this.f233ah], this.f229ad[this.f233ah], this.f230ae[this.f233ah], this.f197R);
        }
        this.f222aP.releaseTarget();
    }

    /* JADX INFO: renamed from: d */
    public Image m142d(int i, int i2) {
        int[] iArr = (int[]) this.f221aO[i2];
        return (Image) this.f221aO[iArr[iArr[((1048575 & i) * 8) + 4 + 7] + (iArr[0] * 8) + (iArr[1] * 3) + 4]];
    }

    /* JADX INFO: renamed from: d */
    public void m143d() {
        if (this.f276z.f33E > 0) {
            if (this.f276z.f106ay == 0) {
                this.f276z.m92r();
            } else if (this.f276z.f106ay == 1) {
                this.f276z.m83i();
            }
        }
        this.f218aL.cancel();
        this.f218aL = null;
        this.f276z = null;
    }

    /* JADX INFO: renamed from: d */
    public void m144d(int i) {
        if (this.f276z.f162i == 0) {
            try {
                Display.getDisplay(C0000a.f1b).vibrate(i);
            } catch (Exception e) {
            }
        }
        this.f276z.f146bq = i;
    }

    /* JADX INFO: renamed from: d */
    public void m145d(short s) {
        this.f264n = m124a(this.f225aS.m166a(s), this.f189J, 190);
    }

    /* JADX INFO: renamed from: e */
    public int m146e(int i) {
        return m147e(i, -1);
    }

    /* JADX INFO: renamed from: e */
    public int m147e(int i, int i2) {
        int iM97a;
        try {
            String string = new StringBuffer().append("/").append((char) ((i / 16) + 97)).append((char) ((i % 16) + 97)).toString();
            InputStream resourceAsStream = getClass().getResourceAsStream(string);
            int[] iArr = new int[(this.f269s[i * 5] * 9) + (this.f269s[(i * 5) + 2] * 3) + (this.f269s[(i * 5) + 1] & 255) + 4];
            iM97a = m97a(iArr);
            try {
                iArr[0] = this.f269s[i * 5];
                iArr[1] = this.f269s[(i * 5) + 2];
                iArr[2] = this.f269s[(i * 5) + 1] & 255;
                iArr[3] = this.f269s[(i * 5) + 1] >> 8;
                for (int i3 = 0; i3 < iArr[0]; i3++) {
                    int i4 = (i3 * 8) + 4;
                    iArr[i4] = resourceAsStream.read();
                    iArr[i4 + 1] = resourceAsStream.read();
                    iArr[i4 + 2] = resourceAsStream.read();
                    iArr[i4 + 3] = resourceAsStream.read();
                    iArr[i4 + 4] = resourceAsStream.read();
                    iArr[i4 + 5] = resourceAsStream.read();
                    iArr[i4 + 6] = resourceAsStream.read();
                    iArr[i4 + 7] = resourceAsStream.read();
                    if (iArr[i4 + 4] >= 128) {
                        int i5 = i4 + 4;
                        iArr[i5] = iArr[i5] - 256;
                    }
                    if (iArr[i4 + 5] >= 128) {
                        int i6 = i4 + 5;
                        iArr[i6] = iArr[i6] - 256;
                    }
                }
                for (int i7 = 0; i7 < iArr[1]; i7++) {
                    int i8 = (i7 * 3) + (iArr[0] * 8) + 4;
                    iArr[i8] = resourceAsStream.read();
                    iArr[i8 + 1] = resourceAsStream.read();
                    iArr[i8 + 2] = resourceAsStream.read();
                }
                resourceAsStream.close();
                if (i2 == -1 || this.f269s[(i * 5) + 4] == 0) {
                    for (int i9 = 0; i9 < iArr[2]; i9++) {
                        switch (this.f269s[(i * 5) + 1] >> 8) {
                            case 0:
                                iArr[(iArr[0] * 8) + i9 + (iArr[1] * 3) + 4] = m97a(Image.createImage(new StringBuffer().append(string).append((char) ((i9 / 16) + 97)).append((char) ((i9 % 16) + 97)).append(".png").toString()));
                                break;
                        }
                    }
                } else {
                    for (int i10 = 0; i10 < iArr[2]; i10++) {
                        switch (this.f269s[(i * 5) + 1] >> 8) {
                            case 0:
                                if ((this.f269s[(i * 5) + 4] & (1 << i10)) != 0) {
                                    InputStream resourceAsStream2 = getClass().getResourceAsStream(new StringBuffer().append(string).append((char) ((i10 / 16) + 97)).append((char) ((i10 % 16) + 97)).append(".r").toString());
                                    int iM105a = m105a(resourceAsStream2);
                                    short sM105a = m105a(resourceAsStream2);
                                    m105a(resourceAsStream2);
                                    int i11 = (sM105a * 3) + 4;
                                    byte[] bArr = new byte[i11];
                                    for (int i12 = 0; i12 <= i2; i12++) {
                                        resourceAsStream2.read(bArr);
                                    }
                                    resourceAsStream2.close();
                                    byte[] bArr2 = new byte[iM105a];
                                    InputStream resourceAsStream3 = getClass().getResourceAsStream(new StringBuffer().append(string).append((char) ((i10 / 16) + 97)).append((char) ((i10 % 16) + 97)).append(".png").toString());
                                    resourceAsStream3.read(bArr2);
                                    resourceAsStream3.close();
                                    for (int i13 = 0; i13 < i11; i13++) {
                                        bArr2[i13 + 41] = bArr[i13];
                                    }
                                    iArr[(iArr[0] * 8) + i10 + (iArr[1] * 3) + 4] = m97a(Image.createImage(bArr2, 0, iM105a));
                                } else {
                                    iArr[(iArr[0] * 8) + i10 + (iArr[1] * 3) + 4] = m97a(Image.createImage(new StringBuffer().append(string).append((char) ((i10 / 16) + 97)).append((char) ((i10 % 16) + 97)).append(".png").toString()));
                                }
                                break;
                        }
                    }
                }
            } catch (Exception e) {
                C0000a.f1b.m0a();
            }
        } catch (Exception e2) {
            iM97a = -1;
        }
        System.gc();
        return iM97a;
    }

    /* JADX INFO: renamed from: e */
    public String m148e() {
        return this.f180A;
    }

    /* JADX INFO: renamed from: f */
    public int m149f() {
        return this.f264n.size();
    }

    /* JADX INFO: renamed from: f */
    public void m150f(int i) {
        try {
            switch (i) {
                case 0:
                    this.f274x = Image.createImage("/win_gold.png");
                    break;
                case 1:
                    this.f274x = Image.createImage("/win_silver.png");
                    break;
                case 2:
                    this.f274x = Image.createImage("/win_bronze.png");
                    break;
                default:
                    this.f274x = Image.createImage("/win_fourth.png");
                    break;
            }
        } catch (IOException e) {
        }
        System.gc();
    }

    /* JADX INFO: renamed from: g */
    public void m151g() {
        if (this.f276z.f151bv == 1) {
            this.f237al = true;
        }
        this.f276z.m77g();
    }

    /* JADX INFO: renamed from: g */
    public void m152g(int i) {
        this.f210aD = i;
    }

    /* JADX INFO: renamed from: h */
    public int m153h(int i) {
        return i / (this.f189J.getHeight() + 3);
    }

    public void hideNotify() {
        if (this.f276z.f151bv == 1) {
            this.f237al = true;
            this.f219aM = 5;
        }
        this.f276z.m77g();
    }

    /* JADX INFO: renamed from: i */
    public int m154i() {
        return this.f210aD;
    }

    /* JADX INFO: renamed from: i */
    public void m155i(int i) {
        m160o();
        try {
            switch (i) {
                case 1:
                    this.f234ai = Image.createImage("/menu_background.png");
                    break;
                case 2:
                    this.f234ai = Image.createImage("/pokal_back.png");
                    break;
                default:
                    this.f234ai = Image.createImage("/menu_background_with_player.png");
                    break;
            }
        } catch (IOException e) {
        }
        System.gc();
    }

    /* JADX INFO: renamed from: j */
    public String m156j() {
        return this.f261k;
    }

    /* JADX INFO: renamed from: k */
    public void m157k() {
        int i = this.f276z.f119bK[406];
        int i2 = this.f276z.f119bK[407];
        int i3 = this.f276z.f119bK[390];
        int i4 = this.f276z.f119bK[391];
        this.f226aa[0] = this.f225aS.m166a(this.f276z.m61c(i));
        this.f226aa[1] = new StringBuffer().append("").append(i3).toString();
        this.f226aa[2] = new StringBuffer().append("").append(i4).toString();
        this.f226aa[3] = this.f225aS.m166a(this.f276z.m61c(i2));
        this.f260j = this.f225aS.m167a((short) 29, this.f226aa);
    }

    public void keyPressed(int i) {
        this.f250ay = true;
        this.f206a = true;
        this.f193N = -1L;
        this.f182C = System.currentTimeMillis();
        this.f231af = i;
    }

    public void keyReleased(int i) {
        this.f213aG = System.currentTimeMillis();
        this.f193N = this.f213aG - this.f182C;
        this.f250ay = false;
    }

    /* JADX INFO: renamed from: m */
    public int m158m() {
        return this.f239an.size();
    }

    /* JADX INFO: renamed from: n */
    public void m159n() {
        this.f237al = false;
        Display display = Display.getDisplay(C0000a.f1b);
        if (display.getCurrent() != this.f262l) {
            display.setCurrent(this.f262l);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m160o() {
        this.f234ai = null;
    }

    /* JADX INFO: renamed from: p */
    public void m161p() {
        for (int i = 0; i < 192; i++) {
            this.f273w[i] = null;
            this.f235aj[i] = null;
            this.f209aC[i] = null;
            this.f204Y[i] = null;
            this.f199T[i] = null;
            this.f230ae[i] = null;
            this.f187H[i] = null;
            this.f229ad[i] = null;
            this.f194O[i] = null;
            this.f195P[i] = null;
        }
        this.f222aP = null;
        this.f259i = null;
        this.f197R = null;
        this.f190K = null;
        this.f271u = 0;
        this.f276z.f98aq[0] = 0;
        this.f276z.f98aq[1] = 0;
        this.f276z.f95an[0] = 0;
        this.f276z.f95an[1] = 0;
        this.f222aP = Graphics3D.getInstance();
        this.f259i = new Camera();
        this.f259i.setPerspective(64.0f, (getWidth() * 1.4f) / (getHeight() * 1.4f), 1.0f, 1000.0f);
        this.f216aJ = -0.9195402f;
        this.f214aH = 0.0f;
        if (this.f276z.f91aj == 1) {
            this.f214aH += 60.0f;
            if (this.f214aH > 190.0f) {
                this.f214aH = 190.0f;
            }
            if (this.f216aJ < -85.0f) {
                this.f216aJ = -85.0f;
            }
            if (this.f216aJ > 85.0f) {
                this.f216aJ = 85.0f;
            }
        } else if (this.f276z.f91aj == 0) {
            this.f216aJ += 60.0f;
            if (this.f216aJ > 130.0f) {
                this.f216aJ = 130.0f;
            }
            if (this.f214aH < -140.0f) {
                this.f214aH = -140.0f;
            }
            if (this.f214aH > 140.0f) {
                this.f214aH = 140.0f;
            }
        }
        this.f197R = new Transform();
        this.f190K = new Background();
        this.f190K.setColor(4876684);
        this.f228ac = m104a(new short[]{0, 0, 0, 0, 0, 80, 80, 0, 0, 80, 0, 80, 160, 0, 0, 160, 0, 80, 240, 0, 0, 240, 0, 80}, new short[]{0, 0, 0, 4, 4, 0, 4, 4, 8, 0, 8, 4, 12, 0, 12, 4}, null, null, new int[]{8}, -1, 1.0f, 1.0f, 3145728, this.f276z.f157d, 1);
        m135b(this.f276z.f157d);
        this.f184E = m104a(new short[]{-9, 0, -9, -9, 0, 9, 3353, 0, -9, 3333, 0, 9, 3353, 0, 5131, 3333, 0, 5111, -9, 0, 5131, -9, 0, 5111, 878, 0, 5121, 898, 0, 5121, 878, 0, 4588, 898, 0, 4568, -9, 0, 4588, -9, 0, 4568, 1945, 0, 5121, 1965, 0, 5121, 1945, 0, 3521, 1965, 0, 3501, -9, 0, 3521, -9, 0, 3501, 888, 0, 0, 908, 0, 0, 866, 0, 197, 886, 0, 202, 800, 0, 385, 818, 0, 394, 695, 0, 554, 710, 0, 566, 554, 0, 695, 566, 0, 710, 385, 0, 800, 394, 0, 818, 197, 0, 866, 202, 0, 886, 0, 0, 888, 0, 0, 908, 727, 0, 3501, 727, 0, 3489, 711, 0, 3501, 582, 0, 3336, 569, 0, 3352, 406, 0, 3221, 397, 0, 3239, 208, 0, 3150, 204, 0, 3169, 0, 0, 3125, 0, 0, 3145, 3254, 0, 5121, 3234, 0, 5121, 3261, 0, 5087, 3243, 0, 5079, 3280, 0, 5058, 3266, 0, 5044, 3309, 0, 5039, 3302, 0, 5021, 3343, 0, 5032, 3343, 0, 5012, 0, 0, 0, 39, 0, 0, 0, 0, 39, 0, 0, 4004, 39, 0, 4044, 0, 0, 4084, 9, 0, -9, 9, 0, 9, -3353, 0, -9, -3333, 0, 9, -3353, 0, 5131, -3333, 0, 5111, 9, 0, 5131, 9, 0, 5111, -878, 0, 5121, -898, 0, 5121, -878, 0, 4588, -898, 0, 4568, 9, 0, 4588, 9, 0, 4568, -1945, 0, 5121, -1965, 0, 5121, -1945, 0, 3521, -1965, 0, 3501, 9, 0, 3521, 9, 0, 3501, -888, 0, 0, -908, 0, 0, -866, 0, 197, -886, 0, 202, -800, 0, 385, -818, 0, 394, -695, 0, 554, -710, 0, 566, -554, 0, 695, -566, 0, 710, -385, 0, 800, -394, 0, 818, -197, 0, 866, -202, 0, 886, 0, 0, 888, 0, 0, 908, -727, 0, 3501, -727, 0, 3489, -711, 0, 3501, -582, 0, 3336, -569, 0, 3352, -406, 0, 3221, -397, 0, 3239, -208, 0, 3150, -204, 0, 3169, 0, 0, 3125, 0, 0, 3145, -3254, 0, 5121, -3234, 0, 5121, -3261, 0, 5087, -3243, 0, 5079, -3280, 0, 5058, -3266, 0, 5044, -3309, 0, 5039, -3302, 0, 5021, -3343, 0, 5032, -3343, 0, 5012, 0, 0, 0, -39, 0, 0, 0, 0, 39, 0, 0, 4004, -39, 0, 4044, 0, 0, 4084}, null, null, null, new int[]{8, 6, 6, 16, 11, 10, 3, 3, 8, 6, 6, 16, 11, 10, 3, 3}, -1, 0.03f, 1.0f, 0, 0, 0);
        this.f227ab = m104a(new short[]{80, 6, 40, 0, 6, 40, 80, 0, 40, 0, 0, 40, 80, 20, 0, 0, 20, 0, 80, 24, 0, 0, 24, 0, 160, 6, 40, 160, 0, 40, 160, 20, 0, 160, 24, 0, 240, 6, 40, 240, 0, 40, 240, 20, 0, 240, 24, 0, -40, 20, 40, -40, 24, 40, 360, 20, 40, 360, 24, 40}, new short[]{256, 110, 0, 110, 256, 128, 0, 128, 256, 45, 0, 45, 256, 36, 0, 36, 512, 110, 512, 128, 512, 45, 512, 36, 768, 110, 768, 128, 768, 45, 768, 36, -128, 45, -128, 36, 1024, 45, 1024, 36}, null, new int[]{0, 1, 2, 3, 4, 5, 0, 1, 6, 7, 4, 5, 8, 0, 9, 2, 10, 4, 8, 0, 11, 6, 10, 4, 12, 8, 13, 9, 14, 10, 12, 8, 15, 11, 14, 10, 1, 16, 5, 7, 17, 5, 16, 18, 12, 14, 19, 15, 18, 14}, new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 4, 3, 4}, -1, 1.0f, 0.0078125f, 4194304, this.f276z.f136bg, 1);
        this.f188I = m104a(new short[]{40, 6, 0, 40, 6, 80, 40, 0, 0, 40, 0, 80, 0, 20, 0, 0, 20, 80, 0, 24, 0, 0, 24, 80, 40, 6, 160, 40, 0, 160, 0, 20, 160, 0, 24, 160, 40, 6, 240, 40, 0, 240, 0, 20, 240, 0, 24, 240, 40, 6, 320, 40, 0, 320, 0, 20, 320, 0, 24, 320, 40, 6, 360, 40, 0, 360, 0, 20, 360, 0, 24, 360}, new short[]{256, 110, 0, 110, 256, 128, 0, 128, 256, 45, 0, 45, 256, 36, 0, 36, -256, 110, -256, 128, -256, 45, -256, 36, -512, 110, -512, 128, -512, 45, -512, 36, -768, 110, -768, 128, -768, 45, -768, 36, -896, 110, -896, 128, -896, 45, -896, 36}, null, new int[]{0, 1, 2, 3, 4, 5, 0, 1, 6, 7, 4, 5, 1, 8, 3, 9, 5, 10, 1, 8, 7, 11, 5, 10, 8, 12, 9, 13, 10, 14, 8, 12, 11, 15, 10, 14, 12, 16, 13, 17, 14, 18, 12, 16, 15, 19, 14, 18, 16, 20, 17, 21, 18, 22, 16, 20, 19, 23, 18, 22}, new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, -1, 1.0f, 0.0078125f, 4194304, this.f276z.f136bg, 1);
        m135b(this.f276z.f136bg);
        this.f224aR = m104a(new short[]{0, 22, 2, 0, 0, 2, 2, 22, 2, 2, 0, 2, 1, 22, 0, 1, 0, 0, 50, 22, 2, 50, 0, 2, 52, 22, 2, 52, 0, 2, 51, 22, 0, 51, 0, 0, 0, 20, 2, 52, 20, 2, 0, 22, 2, 52, 22, 2, 0, 21, 0, 52, 21, 0}, null, null, new int[]{0, 1, 2, 3, 4, 5, 0, 1, 6, 7, 8, 9, 10, 11, 6, 7, 12, 13, 14, 15, 16, 17, 12, 13}, new int[]{8, 8, 8}, -1, 0.5f, 1.0f, 0, 0, 8);
        this.f243ar = m104a(new short[]{51, 0, -32, 1, 0, -32, 51, 22, -16, 1, 22, -16, 51, 22, 0, 1, 22, 0, 1, 0, 0, 1, 0, -16, 51, 0, 0, 51, 0, -16}, new short[]{0, 0, 0, 64, 64, 0, 64, 64, 128, 0, 128, 64, 128, 32, 64, 32, 128, 32, 64, 32}, null, new int[]{0, 1, 2, 3, 4, 5, 6, 5, 7, 3, 1, 8, 4, 9, 2, 0}, new int[]{6, 5, 5}, -1, 0.5f, 0.03125f, 5242880, this.f276z.f168o, 12);
        m135b(this.f276z.f168o);
        this.f217aK = m104a(new short[]{0, 24, 2, 0, 0, 2, 2, 24, 2, 2, 0, 2, 1, 24, 0, 1, 0, 0, 7, 21, 7, 1, 18, 0}, null, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, -1, 0, 0}, new int[]{0, 1, 2, 3, 4, 5, 0, 1, 7, 4, 6}, new int[]{8, 3}, -1, 0.25f, 1.0f, 0, 0, 8);
        this.f191L = m104a(new short[]{80, 0, 0, 0, 0, 0, 80, 0, 80, 0, 0, 80}, new short[]{1, 0, 0, 0, 1, 1, 0, 1}, null, null, new int[]{4}, -2130706433, 0.02f, 1.0f, 7340032, this.f276z.f108b, 12);
        m135b(this.f276z.f108b);
        this.f241ap = m104a(new short[]{40, 40, 0, 0, 40, 0, 40, 0, 0, 0, 0, 0}, new short[]{1, 0, 0, 0, 1, 1, 0, 1}, null, null, new int[]{4}, -1, 0.033333335f, 1.0f, 6291456, this.f276z.f149bt, 12);
        m135b(this.f276z.f149bt);
        short[] sArr = {32, 1, 0, 1, 32, 32, 0, 32, 64, 0, 32, 0, 64, 32, 32, 32, 96, 0, 64, 0, 96, 32, 64, 32, 32, 32, 0, 32, 32, 64, 0, 64, 64, 32, 32, 32, 64, 64, 32, 64, 96, 32, 64, 32, 96, 64, 64, 64, 32, 64, 0, 64, 32, 96, 0, 96, 64, 64, 32, 64, 64, 96, 32, 96, 96, 64, 64, 64, 96, 96, 64, 96, 32, 96, 0, 96, 32, 128, 0, 128, 64, 96, 32, 96, 64, 128, 32, 128, 96, 96, 64, 96, 96, 128, 64, 128, 32, 128, 0, 128, 32, 160, 0, 160, 64, 128, 32, 128, 64, 160, 32, 160, 96, 128, 64, 128, 96, 160, 64, 160, 32, 160, 0, 160, 32, 192, 0, 192, 64, 160, 32, 160, 64, 192, 32, 192, 96, 160, 64, 160, 96, 192, 64, 192, 32, 192, 0, 192, 32, 224, 0, 224, 64, 192, 32, 192, 64, 224, 32, 224, 96, 192, 64, 192, 96, 224, 64, 224, 32, 224, 0, 224, 32, 256, 0, 256, 64, 224, 32, 224, 64, 256, 32, 256, 96, 224, 64, 224, 96, 256, 64, 256, 128, 1, 96, 1, 128, 32, 96, 32, 128, 32, 96, 32, 128, 64, 96, 64, 128, 64, 96, 64, 128, 96, 96, 96, 128, 96, 96, 96, 128, 128, 96, 128, 128, 128, 96, 128, 128, 160, 96, 160, 128, 160, 96, 160, 128, 192, 96, 192, 128, 192, 96, 192, 128, 224, 96, 224, 128, 224, 96, 224, 128, 254, 96, 254, 127, 1, 0, 1, 127, 32, 0, 32, 128, 32, 0, 32, 128, 64, 0, 64, 128, 64, 0, 64, 128, 96, 0, 96, 128, 96, 0, 96, 128, 128, 0, 128, 128, 128, 0, 128, 128, 160, 0, 160, 128, 160, 0, 160, 128, 192, 0, 192, 128, 192, 0, 192, 128, 224, 0, 224, 128, 224, 0, 224, 128, 254, 0, 254, 16, 1, 0, 1, 16, 128, 0, 128, 32, 0, 16, 0, 32, 128, 16, 128, 48, 0, 32, 0, 48, 128, 32, 128, 64, 0, 48, 0, 64, 128, 48, 128, 80, 0, 64, 0, 80, 128, 64, 128, 96, 0, 80, 0, 96, 128, 80, 128, 16, 128, 0, 128, 16, 256, 0, 256, 32, 128, 16, 128, 32, 256, 16, 256, 48, 128, 32, 128, 48, 256, 32, 256, 64, 128, 48, 128, 64, 256, 48, 256, 80, 128, 64, 128, 80, 256, 64, 256, 96, 128, 80, 128, 96, 254, 80, 254};
        short[] sArr2 = {40, 90, 0, -40, 90, 0, 40, 0, 0, -40, 0, 0};
        int[] iArr = {4};
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 32) {
                break;
            }
            if (i3 != 0) {
                this.f220aN[i3] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 8388608, this.f276z.f141bl, (i3 << 8) | (this.f220aN[0] << 16) | 92);
            } else {
                this.f220aN[i3] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 8388608, this.f276z.f141bl, (i3 << 8) | 76);
            }
            i2 = i3 + 1;
        }
        m135b(this.f276z.f141bl);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= 8) {
                break;
            }
            if (i5 != 0) {
                this.f220aN[i5 + 32] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 9437184, this.f276z.f45Q, ((i5 + 32) << 8) | (this.f220aN[32] << 16) | 92);
            } else {
                this.f220aN[i5 + 32] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 9437184, this.f276z.f45Q, ((i5 + 32) << 8) | 76);
            }
            i4 = i5 + 1;
        }
        m135b(this.f276z.f45Q);
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= 32) {
                break;
            }
            if (i7 != 0) {
                this.f256f[i7] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 8388608, this.f276z.f50V, (i7 << 8) | (this.f256f[0] << 16) | 92);
            } else {
                this.f256f[i7] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 8388608, this.f276z.f50V, (i7 << 8) | 76);
            }
            i6 = i7 + 1;
        }
        m135b(this.f276z.f50V);
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= 12) {
                break;
            }
            if (i9 != 0) {
                this.f256f[i9 + 32] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 10485760, this.f276z.f105ax, ((i9 + 40) << 8) | (this.f256f[32] << 16) | 92);
            } else {
                this.f256f[i9 + 32] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 10485760, this.f276z.f105ax, ((i9 + 40) << 8) | 76);
            }
            i8 = i9 + 1;
        }
        m135b(this.f276z.f105ax);
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= 32) {
                break;
            }
            if (i11 != 0) {
                this.f244as[i11] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 8388608, this.f276z.f110bB, (i11 << 8) | (this.f244as[0] << 16) | 92);
            } else {
                this.f244as[i11] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 8388608, this.f276z.f110bB, (i11 << 8) | 76);
            }
            i10 = i11 + 1;
        }
        m135b(this.f276z.f110bB);
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 >= 8) {
                break;
            }
            if (i13 != 0) {
                this.f244as[i13 + 32] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 9437184, this.f276z.f99ar, ((i13 + 32) << 8) | (this.f244as[32] << 16) | 92);
            } else {
                this.f244as[i13 + 32] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 9437184, this.f276z.f99ar, ((i13 + 32) << 8) | 76);
            }
            i12 = i13 + 1;
        }
        m135b(this.f276z.f99ar);
        int i14 = 0;
        while (true) {
            int i15 = i14;
            if (i15 >= 32) {
                break;
            }
            if (i15 != 0) {
                this.f211aE[i15] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 8388608, this.f276z.f89ah, (i15 << 8) | (this.f211aE[0] << 16) | 92);
            } else {
                this.f211aE[i15] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 8388608, this.f276z.f89ah, (i15 << 8) | 76);
            }
            i14 = i15 + 1;
        }
        m135b(this.f276z.f89ah);
        int i16 = 0;
        while (true) {
            int i17 = i16;
            if (i17 >= 12) {
                m135b(this.f276z.f73aR);
                this.f205Z = m104a(new short[]{40, 0, -40, -40, 0, -40, 40, 0, 40, -40, 0, 40}, new short[]{1, 0, 0, 0, 1, 1, 0, 1}, null, null, new int[]{4}, -1, 0.06666667f, 1.0f, 11534336, this.f276z.f123bO, 12);
                m135b(this.f276z.f123bO);
                short[] sArr3 = {1, 0, 0, 0, 1, 1, 0, 1};
                short[] sArr4 = {40, 0, -40, -40, 0, -40, 40, 0, 40, -40, 0, 40};
                int[] iArr2 = {4};
                this.f192M = m104a(sArr4, sArr3, null, null, iArr2, -1, 0.1f, 1.0f, 12582912, this.f276z.f129bU, 12);
                m135b(this.f276z.f129bU);
                this.f253c = m104a(sArr4, sArr3, null, null, iArr2, -1, 0.1f, 1.0f, 13631488, this.f276z.f166m, 12);
                m135b(this.f276z.f166m);
                this.f233ah = m104a(new short[]{40, 40, 0, 0, 40, 0, 40, 0, 0, 0, 0, 0}, new short[]{1, 0, 0, 0, 1, 1, 0, 1}, null, null, new int[]{4}, -1, 0.2f, 1.0f, 14680064, this.f276z.f42N, 0);
                m135b(this.f276z.f42N);
                this.f257g = 0;
                return;
            }
            if (i17 != 0) {
                this.f211aE[i17 + 32] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 10485760, this.f276z.f73aR, ((i17 + 40) << 8) | (this.f211aE[32] << 16) | 92);
            } else {
                this.f211aE[i17 + 32] = m104a(sArr2, sArr, null, null, iArr, -1, 0.1f, 0.00390625f, 10485760, this.f276z.f73aR, ((i17 + 40) << 8) | 76);
            }
            i16 = i17 + 1;
        }
    }

    public void paint(Graphics graphics) {
        graphics.setClip(0, 0, 240, 320);
        switch (this.f276z.f151bv) {
            case 0:
            case 21:
                m110a(graphics, false, true);
                m103a(graphics, this.f225aS.m166a((short) 46), 120, 160, 17, 3355443, 16776960, true, 2);
                m113c(graphics, 307);
                break;
            case 1:
                this.f201V++;
                m116e(graphics);
                if (!this.f237al) {
                    String strM166a = null;
                    switch (this.f276z.f43O) {
                        case 1:
                            if (this.f276z.f75aT > 0) {
                                strM166a = this.f225aS.m166a((short) 19);
                            }
                            break;
                        case 2:
                            strM166a = this.f225aS.m166a((short) 22);
                            break;
                        case 3:
                            strM166a = this.f225aS.m166a((short) 127);
                            break;
                        case 4:
                            strM166a = this.f225aS.m166a((short) 10);
                            break;
                        case 6:
                            strM166a = this.f225aS.m166a((short) 17);
                            break;
                        case 7:
                            strM166a = this.f225aS.m166a((short) 63);
                            break;
                    }
                    if (strM166a != null) {
                        int height = this.f189J.getHeight();
                        graphics.setColor(0);
                        graphics.fillRect(0, 320 - height, 240, height);
                        m103a(graphics, strM166a, 120, 319, 33, 3355443, 16776960, false, 1);
                    }
                }
                if (this.f276z.f64aI == 1) {
                    switch (this.f276z.f76aU) {
                        case 0:
                            m103a(graphics, this.f225aS.m166a((short) 18), 120, 160, 17, 16776960, 16711680, true, 2);
                            break;
                        case 1:
                            m103a(graphics, this.f225aS.m166a((short) 23), 120, 160, 17, 16776960, 16711680, true, 2);
                            break;
                        case 2:
                            if (this.f276z.f132bc != 0) {
                                m103a(graphics, this.f225aS.m166a((short) 61), 120, 160, 17, 16776960, 16711680, true, 2);
                            } else {
                                m103a(graphics, this.f225aS.m166a((short) 21), 120, 160, 17, 16776960, 16711680, true, 2);
                            }
                            break;
                    }
                }
                if (this.f201V % 4 == 0) {
                    m138c();
                    m157k();
                }
                m117f(graphics);
                if (this.f237al) {
                    m112b(graphics);
                    switch (this.f196Q) {
                        case 0:
                            m103a(graphics, this.f225aS.m166a((short) 62), 120, 132, 17, 3355443, 16776960, false, 1);
                            if (this.f276z.f100as == 0) {
                                m106a(graphics, 1);
                            }
                            break;
                        case 3:
                            int iM100a = (320 - m100a(graphics, 1, false, 5, false, false)) - 55;
                            graphics.translate(0, iM100a);
                            m100a(graphics, 1, true, 5, false, false);
                            graphics.translate(0, -iM100a);
                            m106a(graphics, 1);
                            break;
                        case 4:
                            graphics.setClip(0, 0, 240, 320);
                            int iM133b = m133b(1048579, this.f276z.f120bL) + ((320 - m121a(graphics, 120, 0, this.f264n, true, false, false, false)) >> 1);
                            graphics.translate(0, iM133b);
                            m121a(graphics, 120, 0, this.f264n, true, false, true, true);
                            graphics.translate(0, -iM133b);
                            m114d(graphics);
                            break;
                    }
                }
                break;
            case 2:
                m110a(graphics, false, true);
                break;
            case 3:
                if (this.f276z.f120bL != -1) {
                    int iM101a = (320 - m101a(graphics, 0, false, false)) - 55;
                    graphics.translate(0, iM101a);
                    m101a(graphics, 0, true, true);
                    graphics.translate(0, -iM101a);
                    m114d(graphics);
                }
                break;
            case 4:
                int iM101a2 = (320 - m101a(graphics, 1, false, false)) - 55;
                graphics.translate(0, iM101a2);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a2);
                m114d(graphics);
                break;
            case 5:
            case 25:
                int iM101a3 = (320 - m101a(graphics, 1, false, false)) - 55;
                graphics.translate(0, iM101a3);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a3);
                m114d(graphics);
                break;
            case 6:
                graphics.setClip(0, 0, 240, 320);
                m121a(graphics, 120, 90, this.f264n, true, true, true, true);
                m114d(graphics);
                break;
            case 10:
                int iM100a2 = (320 - m100a(graphics, 1, false, 4, true, false)) - 55;
                graphics.translate(0, iM100a2);
                int iM100a3 = m100a(graphics, 1, true, 4, true, false) + 10;
                graphics.translate(0, -iM100a2);
                graphics.setClip(0, 0, 240, 320);
                m114d(graphics);
                m109a(graphics, 4, 5, 6, 7, false, this.f276z.f119bK[406], this.f276z.f119bK[407]);
                break;
            case 11:
            case 27:
            case 28:
                int iM98a = (320 - m98a(graphics, 0, false, m158m(), 5, false)) - 55;
                graphics.translate(0, iM98a);
                m98a(graphics, 1, true, m158m(), 5, false);
                graphics.translate(0, -iM98a);
                graphics.setClip(0, 0, 240, 320);
                m114d(graphics);
                m108a(graphics, 1048576, this.f276z.f120bL, 48, 256, 33);
                graphics.drawImage(this.f207aA, 50, 251, 33);
                int iM71f = this.f276z.f142bm - 1;
                if (!this.f276z.f78aW) {
                    iM71f = this.f276z.m71f(iM71f);
                }
                m107a(graphics, iM71f, 47, 98);
                break;
            case 12:
                int iM99a = (320 - m99a(graphics, 0, false, 4, false)) - 55;
                graphics.translate(0, iM99a);
                m99a(graphics, 1, true, 4, false);
                graphics.translate(0, -iM99a);
                graphics.setClip(0, 0, 240, 320);
                m114d(graphics);
                m115d(graphics, this.f276z.f119bK[388]);
                break;
            case 13:
                int iM100a4 = (320 - m100a(graphics, 1, false, 3, true, false)) - 55;
                graphics.translate(0, iM100a4);
                m100a(graphics, 1, true, 3, true, false);
                graphics.translate(0, -iM100a4);
                graphics.setClip(0, 0, 240, 320);
                m114d(graphics);
                this.f240ao = 83;
                m107a(graphics, this.f276z.f119bK[406], 120, this.f240ao + 8);
                m102a(graphics, m123a((short) 3), 120, this.f240ao + 53, 17);
                break;
            case 14:
                int iM100a5 = (320 - m100a(graphics, 1, false, 3, true, false)) - 55;
                graphics.translate(0, iM100a5);
                m100a(graphics, 1, true, 3, true, true);
                graphics.translate(0, -iM100a5);
                m114d(graphics);
                break;
            case 15:
            case 36:
                int iM100a6 = (320 - m100a(graphics, 0, false, 0, true, false)) - 55;
                graphics.translate(0, iM100a6);
                m100a(graphics, 1, true, 0, true, false);
                graphics.translate(0, -iM100a6);
                graphics.setClip(0, 0, 240, 320);
                m114d(graphics);
                m109a(graphics, 1, 2, 3, 4, false, this.f276z.f119bK[406], this.f276z.f119bK[407]);
                break;
            case 16:
            case 45:
                graphics.setClip(0, 0, 240, 320);
                int iM133b2 = m133b(1048579, this.f276z.f120bL) + ((320 - m121a(graphics, 120, 0, this.f264n, true, false, false, false)) >> 1);
                graphics.translate(0, iM133b2);
                m121a(graphics, 120, 0, this.f264n, true, false, true, true);
                graphics.translate(0, -iM133b2);
                m114d(graphics);
                break;
            case 17:
                int iM101a4 = ((199 - m101a(graphics, 0, false, false)) >> 1) + 25 + 48;
                graphics.translate(0, iM101a4);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a4);
                m114d(graphics);
                break;
            case 18:
            case 19:
                graphics.setClip(0, 0, 240, 320);
                m111b(graphics, 7);
                m114d(graphics);
                break;
            case 20:
                graphics.setClip(0, 0, 240, 320);
                m110a(graphics, true, true);
                m128a(graphics);
                m121a(graphics, 120, 251 - ((this.f189J.getHeight() + 3) * this.f264n.size()), this.f264n, false, false, true, true);
                m114d(graphics);
                break;
            case 22:
                int iM101a5 = (320 - m101a(graphics, 0, false, false)) >> 1;
                graphics.translate(0, iM101a5);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a5);
                m114d(graphics);
                break;
            case 23:
            case 37:
                int iM100a7 = (320 - m100a(graphics, 0, false, 0, true, false)) - 55;
                graphics.translate(0, iM100a7);
                m100a(graphics, 1, true, 0, true, false);
                graphics.translate(0, -iM100a7);
                graphics.setClip(0, 0, 240, 320);
                m114d(graphics);
                m109a(graphics, 1, 2, 3, 4, false, this.f276z.f119bK[406], this.f276z.f119bK[407]);
                m103a(graphics, m123a((short) 5), 120, (154 - this.f183D) + 10, 33, 3355443, 16776960, false, 1);
                break;
            case 24:
                int iM101a6 = (320 - m101a(graphics, 1, false, false)) - 55;
                graphics.translate(0, iM101a6);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a6);
                m114d(graphics);
                break;
            case 26:
                int iM100a8 = (320 - m100a(graphics, 1, false, 0, true, false)) - 55;
                graphics.translate(0, iM100a8);
                m100a(graphics, 1, true, 0, true, false);
                graphics.translate(0, -iM100a8);
                graphics.setClip(0, 0, 240, 320);
                m114d(graphics);
                m109a(graphics, 1, 2, 3, 4, false, this.f276z.f119bK[406], this.f276z.f119bK[407]);
                break;
            case 29:
                int iM101a7 = (320 - m101a(graphics, 1, false, false)) - 55;
                graphics.translate(0, iM101a7);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a7);
                m114d(graphics);
                break;
            case 30:
                int iM101a8 = (320 - m101a(graphics, 0, false, false)) >> 1;
                graphics.translate(0, iM101a8);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a8);
                m114d(graphics);
                m113c(graphics, 258);
                break;
            case 31:
            case 34:
            case 35:
            case 42:
                graphics.setClip(0, 0, 240, 320);
                int iM133b3 = m133b(1048579, this.f276z.f120bL) + ((320 - m121a(graphics, 120, 0, this.f264n, true, false, false, false)) >> 1);
                graphics.translate(0, iM133b3);
                m121a(graphics, 120, 0, this.f264n, true, false, true, true);
                graphics.translate(0, -iM133b3);
                m114d(graphics);
                m113c(graphics, 258);
                break;
            case 32:
                int iM98a2 = (320 - m98a(graphics, 0, false, m158m(), 5, false)) - 55;
                graphics.translate(0, iM98a2);
                m98a(graphics, 1, true, m158m(), 5, false);
                graphics.translate(0, -iM98a2);
                m114d(graphics);
                break;
            case 33:
                int iM101a9 = (320 - m101a(graphics, 0, false, false)) >> 1;
                graphics.translate(0, iM101a9);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a9);
                m114d(graphics);
                break;
            case 38:
                int iM101a10 = (320 - m101a(graphics, 0, false, false)) >> 1;
                graphics.translate(0, iM101a10);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a10);
                m114d(graphics);
                break;
            case 39:
                int[] iArrM89n = this.f276z.m89n(this.f276z.f142bm - 1);
                int i = iArrM89n[4];
                m110a(graphics, true, true);
                m103a(graphics, m123a((short) 0), 120, 47, 17, 2236962, 16776960, false, 1);
                m114d(graphics);
                graphics.setClip(0, 0, 240, 320);
                m103a(graphics, m123a((short) 1), 120, 93, 17, 2236962, 16733525, false, 1);
                int i2 = this.f238am + 5 + 93;
                if (iArrM89n[0] != 99) {
                    m107a(graphics, i, 120, i2);
                    int i3 = i2 + 35;
                    m102a(graphics, this.f225aS.m166a(this.f276z.m61c(i)), 120, i3, 17);
                    int i4 = i3 + 20;
                    m102a(graphics, m123a((short) 2), 120, i4, 17);
                    int i5 = i4 + this.f238am;
                    m102a(graphics, m123a((short) 3), 120, i5, 17);
                    int i6 = i5 + this.f238am;
                    m102a(graphics, m123a((short) 4), 120, i6, 17);
                    int i7 = this.f238am + i6;
                } else {
                    m102a(graphics, m137c((short) 26), 120, 160, 17);
                    int i8 = this.f238am + i2;
                }
                m108a(graphics, this.f276z.f142bm > 1 ? 1048582 : 1048581, this.f276z.f120bL, 120, 78, 17);
                m108a(graphics, this.f276z.f142bm < 5 ? 1048584 : 1048583, this.f276z.f120bL, 120, 268, 33);
                break;
            case 41:
                int iM101a11 = (320 - m101a(graphics, 0, false, false)) >> 1;
                graphics.translate(0, iM101a11);
                m101a(graphics, 1, true, true);
                graphics.translate(0, -iM101a11);
                m114d(graphics);
                break;
            case 43:
                graphics.setClip(0, 0, 240, 320);
                int iM133b4 = m133b(1048579, this.f276z.f120bL) + ((320 - m121a(graphics, 120, 0, this.f264n, true, false, false, false)) >> 1);
                graphics.translate(0, iM133b4);
                m121a(graphics, 120, 0, this.f264n, true, false, true, true);
                graphics.translate(0, -iM133b4);
                m114d(graphics);
                break;
            case 46:
                graphics.setClip(0, 0, 240, 320);
                int iM133b5 = m133b(1048579, this.f276z.f120bL) + ((320 - m121a(graphics, 120, 0, this.f264n, true, false, false, false)) >> 1);
                graphics.translate(0, iM133b5);
                m121a(graphics, 120, 0, this.f264n, true, false, true, true);
                graphics.translate(0, -iM133b5);
                m114d(graphics);
                break;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m162q() {
        this.f225aS = new C0006f();
    }

    /* JADX INFO: renamed from: r */
    public void m163r() {
        if (this.f208aB == null) {
            this.f208aB = new C0007g("/player_trans.png");
            m126a(0, true);
        }
    }

    public void showNotify() {
        if (this.f276z.f151bv != 1) {
        }
    }
}
