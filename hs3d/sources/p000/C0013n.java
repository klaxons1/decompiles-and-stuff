package p000;

import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
final class C0013n {

    /* JADX INFO: renamed from: a */
    static byte f473a;

    /* JADX INFO: renamed from: a */
    static float f474a;

    /* JADX INFO: renamed from: a */
    static int f475a;

    /* JADX INFO: renamed from: a */
    static C0005f f476a;

    /* JADX INFO: renamed from: a */
    static short f478a;

    /* JADX INFO: renamed from: a */
    private static C0002c[] f482a;

    /* JADX INFO: renamed from: a */
    private static C0005f[] f483a;

    /* JADX INFO: renamed from: a */
    static float[][] f486a;

    /* JADX INFO: renamed from: a */
    private static short[][] f487a;

    /* JADX INFO: renamed from: b */
    static byte f491b;

    /* JADX INFO: renamed from: b */
    static float f492b;

    /* JADX INFO: renamed from: b */
    static int f493b;

    /* JADX INFO: renamed from: b */
    private static C0005f f494b;

    /* JADX INFO: renamed from: b */
    static C0010k f495b;

    /* JADX INFO: renamed from: b */
    static short f496b;

    /* JADX INFO: renamed from: b */
    static boolean f497b;

    /* JADX INFO: renamed from: b */
    static float[] f499b;

    /* JADX INFO: renamed from: b */
    private static C0005f[] f500b;

    /* JADX INFO: renamed from: b */
    static byte[][] f502b;

    /* JADX INFO: renamed from: c */
    static byte f505c;

    /* JADX INFO: renamed from: c */
    static float f506c;

    /* JADX INFO: renamed from: c */
    static int f507c;

    /* JADX INFO: renamed from: c */
    private static C0005f f508c;

    /* JADX INFO: renamed from: c */
    static short f510c;

    /* JADX INFO: renamed from: c */
    private static C0005f[] f514c;

    /* JADX INFO: renamed from: c */
    static short[] f515c;

    /* JADX INFO: renamed from: d */
    static byte f516d;

    /* JADX INFO: renamed from: d */
    public static float f517d;

    /* JADX INFO: renamed from: d */
    static int f518d;

    /* JADX INFO: renamed from: d */
    private static C0005f f519d;

    /* JADX INFO: renamed from: d */
    static short f521d;

    /* JADX INFO: renamed from: d */
    static boolean f522d;

    /* JADX INFO: renamed from: d */
    static byte[] f523d;

    /* JADX INFO: renamed from: d */
    static short[] f524d;

    /* JADX INFO: renamed from: e */
    static byte f525e;

    /* JADX INFO: renamed from: e */
    public static float f526e;

    /* JADX INFO: renamed from: e */
    private static int f527e;

    /* JADX INFO: renamed from: e */
    static short f528e;

    /* JADX INFO: renamed from: e */
    static boolean f529e;

    /* JADX INFO: renamed from: f */
    static byte f531f;

    /* JADX INFO: renamed from: f */
    public static float f532f;

    /* JADX INFO: renamed from: f */
    static short f533f;

    /* JADX INFO: renamed from: f */
    static boolean f534f;

    /* JADX INFO: renamed from: g */
    static byte f535g;

    /* JADX INFO: renamed from: g */
    public static short f537g;

    /* JADX INFO: renamed from: g */
    static boolean f538g;

    /* JADX INFO: renamed from: h */
    static byte f539h;

    /* JADX INFO: renamed from: h */
    private static float f540h;

    /* JADX INFO: renamed from: i */
    private static byte f543i;

    /* JADX INFO: renamed from: i */
    private static short f545i;

    /* JADX INFO: renamed from: j */
    private static byte f547j;

    /* JADX INFO: renamed from: j */
    private static short f549j;

    /* JADX INFO: renamed from: k */
    private static byte f551k;

    /* JADX INFO: renamed from: k */
    private static float f552k;

    /* JADX INFO: renamed from: k */
    private static short f553k;

    /* JADX INFO: renamed from: l */
    private static float f556l;

    /* JADX INFO: renamed from: m */
    private static byte f558m;

    /* JADX INFO: renamed from: n */
    public static boolean f561n;

    /* JADX INFO: renamed from: o */
    public static boolean f562o;

    /* JADX INFO: renamed from: p */
    private static boolean f563p;

    /* JADX INFO: renamed from: q */
    private static boolean f564q = false;

    /* JADX INFO: renamed from: r */
    private static boolean f565r = false;

    /* JADX INFO: renamed from: h */
    private static short f541h = -7000;

    /* JADX INFO: renamed from: g */
    private static float f536g = 0.0f;

    /* JADX INFO: renamed from: a */
    public static boolean f479a = false;

    /* JADX INFO: renamed from: a */
    static short[] f484a = null;

    /* JADX INFO: renamed from: b */
    static short[] f501b = null;

    /* JADX INFO: renamed from: a */
    private static final byte[][][][] f490a = {new byte[][][]{new byte[][]{new byte[]{2, 95, 95, 95, 0}, new byte[]{5, 89, 103, 95, 0}, new byte[]{10, 95, 95, 95, 0}}, new byte[][]{new byte[]{40, 95, 111, 97, 0}, new byte[]{41, 95, 95, 95, 0}, new byte[]{42, 95, 95, 95, 0}}, new byte[][]{new byte[]{29, 95, 92, 95, 0}, new byte[]{126, 95, 95, 95, 0}, new byte[]{37, 95, 100, 99, 0}, new byte[]{73, 92, 112, 107, 0}, new byte[]{123, 103, 95, 98, 0}, new byte[]{124, 95, 95, 95, 0}}, new byte[][]{new byte[]{50, 127, 95, 95, 0}, new byte[]{46, 127, 107, 95, 0}, new byte[]{58, 127, 95, 95, 0}}}, new byte[][][]{new byte[][]{new byte[]{14, 95, 95, 95, 0}, new byte[]{16, 95, 108, 95, 0}, new byte[]{17, 95, 101, 95, 0}, new byte[]{18, 95, 95, 95, 0}}, new byte[][]{new byte[]{67, 95, 95, 95, 0}, new byte[]{68, 95, 95, 95, 0}, new byte[]{69, 104, 95, 95, 0}}, new byte[][]{new byte[]{75, 101, 100, 95, 0}, new byte[]{37, 95, 95, 95, 0}, new byte[]{79, 95, 95, 95, 0}, new byte[]{78, 95, 95, 95, 0}, new byte[]{77, 95, 95, 95, 0}}, new byte[][]{new byte[]{80, 91, 101, 85, 0}, new byte[]{4, 111, 90, 95, 0}, new byte[]{6, 127, 107, 95, 0}, new byte[]{33, 117, 103, 95, 0}}}, new byte[][][]{new byte[][]{new byte[]{10, 95, 95, 95, 0}, new byte[]{11, 91, 95, 95, 0}, new byte[]{12, 95, 95, 95, 0}}, new byte[][]{new byte[]{70, 109, 98, 92, 0}, new byte[]{71, 95, 95, 95, 0}, new byte[]{73, 95, 95, 95, 0}, new byte[]{75, 95, 95, 95, 0}}, new byte[][]{new byte[]{99, 95, 95, 95, 0}, new byte[]{100, 95, 95, 95, 0}, new byte[]{95, 95, 95, 95, 0}, new byte[]{94, 95, 95, 95, 0}, new byte[]{92, 95, 95, 95, 0}}, new byte[][]{new byte[]{32, 95, 95, 95, 0}, new byte[]{31, 119, 95, 64, 0}, new byte[]{33, 119, 95, 64, 0}}}, new byte[][][]{new byte[][]{new byte[]{30, 95, 95, 95, 0}, new byte[]{28, 95, 95, 95, 0}, new byte[]{32, 95, 95, 95, 0}}, new byte[][]{new byte[]{8, 95, 95, 95, 0}, new byte[]{2, 93, 109, 89, 0}, new byte[]{4, 95, 92, 95, 0}, new byte[]{6, 64, 92, 95, 0}}, new byte[][]{new byte[]{73, 95, 95, 95, 0}, new byte[]{105, 95, 94, 86, 0}, new byte[]{106, 95, 92, 95, 0}, new byte[]{108, 95, 109, 95, 0}, new byte[]{111, 95, 95, 95, 0}}, new byte[][]{new byte[]{18, 110, 106, 95, 0}, new byte[]{19, 95, 95, 95, 0}, new byte[]{20, 118, 110, 95, 0}, new byte[]{23, 95, 95, 95, 0}}}, new byte[][][]{new byte[][]{new byte[]{1, 95, 95, 95, 0}, new byte[]{2, 92, 95, 95, 0}, new byte[]{4, 95, 95, 95, 0}, new byte[]{5, 99, 100, 95, 0}}, new byte[][]{new byte[]{7, 95, 92, 77, 0}, new byte[]{11, 95, 108, 99, 0}, new byte[]{35, 95, 95, 95, 0}, new byte[]{36, 95, 101, 96, 0}}, new byte[][]{new byte[]{68, 95, 95, 95, 0}, new byte[]{87, 95, 90, 95, 0}, new byte[]{30, 95, 95, 95, 0}, new byte[]{29, 95, 95, 95, 0}, new byte[]{28, 95, 95, 95, 0}}, new byte[][]{new byte[]{39, 95, 95, 95, 0}, new byte[]{41, 100, 95, 95, 0}, new byte[]{44, 127, 112, 95, 0}}}, new byte[][][]{new byte[][]{new byte[]{2, 95, 95, 95, 0}, new byte[]{3, 95, 95, 95, 0}, new byte[]{16, 95, 95, 95, 0}, new byte[]{18, 95, 95, 95, 0}, new byte[]{19, 95, 95, 95, 0}}, new byte[][]{new byte[]{58, 95, 95, 95, 0}, new byte[]{79, 95, 95, 95, 0}, new byte[]{80, 95, 95, 95, 0}}, new byte[][]{new byte[]{46, 95, 95, 95, 0}, new byte[]{28, 100, 92, 95, 0}, new byte[]{26, 95, 95, 95, 0}, new byte[]{27, 95, 95, 95, 0}, new byte[]{25, 95, 95, 95, 0}, new byte[]{22, 95, 95, 95, 0}}, new byte[][]{new byte[]{51, 95, 95, 95, 0}, new byte[]{53, 116, 96, 95, 0}}}, new byte[][][]{new byte[][]{new byte[]{19, 95, 95, 95, 0}, new byte[]{20, 87, 95, 95, 0}, new byte[]{21, 95, 95, 95, 0}, new byte[]{22, 95, 95, 95, 0}}, new byte[][]{new byte[]{46, 100, 95, 95, 0}, new byte[]{48, 95, 95, 95, 0}, new byte[]{55, 93, 95, 79, 0}, new byte[]{67, 95, 95, 95, 0}}, new byte[][]{new byte[]{69, 106, 95, 95, 0}, new byte[]{70, 95, 95, 95, 0}, new byte[]{63, 95, 96, 95, 0}, new byte[]{62, 95, 95, 95, 0}, new byte[]{38, 95, 95, 95, 0}}, new byte[][]{new byte[]{23, 95, 95, 95, 0}, new byte[]{6, 95, 95, 95, 0}, new byte[]{4, 120, 107, 95, 0}}}, new byte[][][]{new byte[][]{new byte[]{1, 95, 95, 95, 0}, new byte[]{6, 95, 95, 95, 0}, new byte[]{57, 95, 95, 95, 0}, new byte[]{58, 95, 95, 95, 0}}, new byte[][]{new byte[]{45, 95, 95, 95, 0}, new byte[]{47, 95, 95, 95, 0}, new byte[]{49, 95, 95, 95, 0}, new byte[]{68, 87, 97, 95, 0}}, new byte[][]{new byte[]{80, 95, 95, 95, 0}, new byte[]{7, 95, 95, 95, 0}, new byte[]{8, 95, 95, 95, 0}, new byte[]{9, 95, 95, 95, 0}, new byte[]{12, 95, 95, 95, 0}, new byte[]{13, 106, 95, 95, 0}}, new byte[][]{new byte[]{20, 95, 95, 95, 0}, new byte[]{21, 108, 95, 95, 0}, new byte[]{23, 113, 99, 112, 0}, new byte[]{33, 95, 93, 95, 0}}}, new byte[][][]{new byte[][]{new byte[]{6, 86, 95, 95, 0}}, new byte[][]{new byte[]{11, 95, 122, 95, 0}, new byte[]{12, 95, 111, 95, 0}, new byte[]{19, 95, 112, 95, 0}}, new byte[][]{new byte[]{22, 95, 112, 95, 0}, new byte[]{24, 118, 100, 69, 0}, new byte[]{45, 125, 88, 95, 0}, new byte[]{104, 95, 95, 95, 0}}, new byte[][]{new byte[]{56, 127, 95, 95, 0}}}};

    /* JADX INFO: renamed from: a */
    static byte[] f480a = {77, 73, 68, 108, 101, 116, 45, 86, 101, 110, 100, 111, 114};

    /* JADX INFO: renamed from: b */
    static byte[] f498b = {104, 116, 116, 112, 58, 47, 47};

    /* JADX INFO: renamed from: c */
    static byte[] f512c = {109, 105, 99, 114, 111, 101, 100, 105, 116, 105, 111, 110, 46, 112, 108, 97, 116, 102, 111, 114, 109};

    /* JADX INFO: renamed from: e */
    private static final byte[] f530e = new byte[3];

    /* JADX INFO: renamed from: a */
    static final float[] f481a = {10.0f, 6.0f, 2.0f, 2.0f, 6.0f, 6.0f, 6.0f, 6.0f, 2.0f, 3.0f, 2.0f};

    /* JADX INFO: renamed from: a */
    static final byte[][] f485a = {new byte[]{0, 30, 70, 70, 1, 30, 30, 30, 70, 30, 70}, new byte[]{0, 1, 70, 70, 30, 1, 10, 1, 70, 30, 70}};

    /* JADX INFO: renamed from: a */
    static final short[][][] f489a = {new short[][]{new short[]{0, 26, 43, 51, 62, 77}, new short[]{0, 25, 34, 45, 53, 60}, new short[]{0, 26, 48, 55, 68, 75}, new short[]{0, 7, 20, 39, 61, 70}, new short[]{0, 19, 24, 46, 57, 77}}, new short[][]{new short[]{0, 31, 40, 53, 79, 91}, new short[]{0, 17, 45, 73, 88}, new short[]{0, 36, 43, 66, 78, 86, 108, 117}, new short[]{0, 13, 43, 54, 70, 109, 125}, new short[]{0, 20, 33, 75, 112}}};

    /* JADX INFO: renamed from: a */
    private static final byte[][][] f488a = {new byte[][]{new byte[]{0, 3, 4, 7, 11, 13, 15, 16, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 41, 42, 53, 54, 59, 60, 61, 62, 63, 64, 65, 66}, new byte[]{0, 3, 4, 6, 11, 15, 17, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 41, 42, 53, 54, 59, 60, 61, 62, 63, 64, 65, 66}}, new byte[][]{new byte[]{6, 8, 13, 14, 18, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 59, 60, 61, 62, 11}, new byte[]{7, 8, 11, 12, 14, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 59, 60, 61, 62}}, new byte[][]{new byte[]{0, 3, 5, 9, 10, 17, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 37, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 62, 63, 64, 65, 66}, new byte[]{0, 3, 5, 9, 13, 16, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 37, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 62, 63, 64, 65, 66}}, new byte[][]{new byte[]{1, 2, 4, 7, 11, 12, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 41, 42, 53, 54, 55, 56, 57, 58, 59, 60}, new byte[]{1, 2, 4, 6, 10, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 41, 42, 53, 54, 55, 56, 57, 58, 59}}, new byte[][]{new byte[]{6, 8, 11, 12, 17, 19, 20, 21, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 62, 63, 64, 65, 66, 67}, new byte[]{7, 8, 10, 13, 16, 19, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 62, 63, 64, 65, 66, 67}}, new byte[][]{new byte[]{0, 1, 3, 5, 9, 11, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17}}, new byte[][]{new byte[]{0, 1, 3, 4, 6, 7, 9, 10, 13, 26, 27, 28, 29, 30, 33, 34, 35, 36, 37, 38, 43, 44, 45, 46, 56, 62}, new byte[]{11, 12, 13, 14, 15, 18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 42}}, new byte[][]{new byte[]{0, 2, 3, 5, 6, 8, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 30, 31, 32, 33, 41, 42, 43, 44, 45, 46, 56}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, 17, 18, 26, 27, 28, 29, 30, 31}}, new byte[][]{new byte[]{1, 2, 6, 8, 9, 10, 12, 27, 28, 29, 30, 33, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 60}, new byte[]{12, 13, 14, 15, 18, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41}}, new byte[][]{new byte[]{0, 2, 3, 4, 6, 8, 12, 26, 27, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 61}, new byte[]{11, 12, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40}}};

    /* JADX INFO: renamed from: b */
    private static final byte[][][] f504b = {new byte[][]{new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 10, 18, 18, 34, 2, 0, 0, 0, 0, 0, 0, 0, 0, 8, 16, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 18, 18, 18, 18, 34, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 16, 32, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 16, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 18, 18, 18, 18, 34, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 16, 32, 0, 0, 0, 0, 0, 0, 0, 0}}, new byte[][]{new byte[]{0, 0, 0, 8, 17, 17, 17, 17, 17, 17, 17, 33, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 33, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 33, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 8, 32, 0, 0, 0, 0, 0, 8, 17, 17, 17, 17, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 17, 17, 17, 17, 32, 0, 0, 0, 0, 0, 8, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 8, 17, 17, 17, 17, 17, 17, 17, 33, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 33, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 33, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 9, 33, 9, 33, 9, 33, 9, 33, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 9, 17, 17, 17, 17, 17, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 16, 32, 8, 32, 0, 0, 0, 1, 1, 1, 1, 1, 9, 33, 9, 33, 9, 33, 9, 33, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 17, 17, 17, 17, 32, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 0, 1, 9, 17, 17, 17, 17, 33, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 33, 9, 33, 9, 33, 9, 33, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}};

    /* JADX INFO: renamed from: c */
    private static C0010k f509c = new C0010k();

    /* JADX INFO: renamed from: d */
    private static C0010k f520d = new C0010k();

    /* JADX INFO: renamed from: a */
    static final C0010k f477a = new C0010k();

    /* JADX INFO: renamed from: i */
    private static float f544i = 0.0f;

    /* JADX INFO: renamed from: l */
    private static byte f555l = 0;

    /* JADX INFO: renamed from: j */
    private static float f548j = 0.0f;

    /* JADX INFO: renamed from: s */
    private static boolean f566s = false;

    /* JADX INFO: renamed from: c */
    private static final float[] f513c = new float[4];

    /* JADX INFO: renamed from: c */
    static boolean f511c = false;

    /* JADX INFO: renamed from: n */
    private static byte f560n = 0;

    /* JADX INFO: renamed from: h */
    static boolean f542h = false;

    /* JADX INFO: renamed from: i */
    static boolean f546i = false;

    /* JADX INFO: renamed from: t */
    private static boolean f567t = false;

    /* JADX INFO: renamed from: j */
    static boolean f550j = false;

    /* JADX INFO: renamed from: k */
    static boolean f554k = false;

    /* JADX INFO: renamed from: l */
    static boolean f557l = false;

    /* JADX INFO: renamed from: m */
    static boolean f559m = true;

    /* JADX INFO: renamed from: u */
    private static boolean f568u = false;

    /* JADX INFO: renamed from: b */
    private static final float[][] f503b = {new float[]{0.3203125f, 0.4375f, 0.59375f, 0.7109375f}, new float[]{0.234375f, 0.40625f, 0.62109375f, 0.77734375f}};

    C0013n() {
    }

    /* JADX INFO: renamed from: a */
    static float m232a(int i, int i2) {
        int i3 = i2 << 1;
        return ((f486a[i][i3 + 1] - f486a[i][i3]) * 0.5f) + f486a[i][i3];
    }

    /* JADX INFO: renamed from: a */
    static float m233a(int i, int i2, int i3) {
        int i4 = i2 << 1;
        return ((f486a[i][i4 + 1] - f486a[i][i4]) * f503b[f516d - 1][i3]) + f486a[i][i4];
    }

    /* JADX INFO: renamed from: a */
    static int m234a(MIDlet mIDlet, Hashtable hashtable, String str, int i) {
        int iM3a = C0000a.m3a();
        try {
            String str2 = new String(C0004e.f131a);
            String appProperty = mIDlet.getAppProperty(str2);
            String appProperty2 = mIDlet.getAppProperty(str);
            if (appProperty2 == null) {
                appProperty2 = System.getProperty(str);
            }
            if (appProperty2 == null) {
                DataInputStream dataInputStream = new DataInputStream(C0011l.m172a(new String(C0002c.f79b)));
                while (true) {
                    try {
                        String strM174a = C0011l.m174a(dataInputStream);
                        if (strM174a == null) {
                            break;
                        }
                        int iIndexOf = strM174a.indexOf(58);
                        if (iIndexOf > -1 && strM174a.substring(0, iIndexOf).equals(str)) {
                            appProperty2 = strM174a.substring(iIndexOf + 2, strM174a.length());
                            break;
                        }
                    } catch (Exception e) {
                    }
                }
                dataInputStream.close();
            }
            if (appProperty2 == null) {
                int i2 = -iM3a;
                hashtable.put(str2, new StringBuffer().append("").append(i2).toString());
                return i2;
            }
            if (appProperty2 != null) {
                return iM3a;
            }
            byte[] bArrM53a = C0004e.m53a(appProperty2, i, false);
            int i3 = appProperty != null ? Integer.parseInt(appProperty) : -1;
            int i4 = (bArrM53a[3] & 255) | ((bArrM53a[0] & 255) << 24) | ((bArrM53a[1] & 255) << 16) | ((bArrM53a[2] & 255) << 8);
            String str3 = new String();
            if (Math.abs(i3 - i4) < 3 && Math.abs((i3 >> 2) - (i4 >> 2)) < 2) {
                iM3a = -C0000a.m3a();
                hashtable.put(str2, new StringBuffer().append("").append(iM3a).toString());
            }
            String str4 = new String(C0007h.f216a);
            String appProperty3 = mIDlet.getAppProperty(str4);
            if (appProperty3.equals(str3)) {
                hashtable.put(str4, str3);
                return iM3a;
            }
            String string = "";
            for (int length = appProperty3.length() - 1; length >= 0; length--) {
                string = new StringBuffer().append(string).append(appProperty3.charAt(length)).toString();
            }
            if (!appProperty3.equals(string)) {
                return iM3a;
            }
            int i5 = iM3a - ((iM3a - C0000a.f7a) - (Integer.parseInt(appProperty3) >> 8));
            hashtable.put(string, new StringBuffer().append("").append(i5).toString());
            return i5;
        } catch (Exception e2) {
            return iM3a;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m235a() {
        if (C0009j.f384d[1] == 2) {
            RunnableC0008i.f281a.m23d();
        }
        f484a = null;
        C0000a.f9a.m60a().getVertexBuffer().getPositions((float[]) null).set(0, f501b.length / 3, f501b);
        if (f483a != null) {
            for (int i = 0; i < f483a.length; i++) {
                f483a[i].m63a(true);
                f483a[i] = null;
            }
        }
        f483a = null;
        if (f500b != null) {
            for (int i2 = 0; i2 < f500b.length; i2++) {
                f500b[i2].m63a(true);
                f500b[i2] = null;
            }
        }
        f500b = null;
        if (f482a != null) {
            for (int i3 = 0; i3 < f482a.length; i3++) {
                f482a[i3].m34a();
                f482a[i3] = null;
            }
        }
        f482a = null;
        if (f514c != null) {
            for (int i4 = 0; i4 < f514c.length; i4++) {
                f514c[i4].m63a(true);
                f514c[i4] = null;
            }
        }
        f514c = null;
        f494b.m63a(true);
        f494b = null;
        f476a.m63a(true);
        f476a = null;
        f508c.m63a(true);
        f508c = null;
        if (f519d != null) {
            f519d.m63a(true);
        }
        f519d = null;
        C0012m.m218a();
        f487a = null;
        C0009j.f375c = null;
        f515c = null;
        f524d = null;
        C0009j.f366b = null;
        f486a = null;
        f495b = null;
        f523d = null;
        f499b = null;
        f502b = null;
        C0004e.m50a();
        C0007h.m102a();
        C0000a.m8a(true, 2);
        RunnableC0008i.m119a(0, false);
        if (C0009j.f384d[1] == 2 && RunnableC0008i.f333l != 10 && C0009j.f384d[14] > 0) {
            RunnableC0008i.f281a.m19a("/mm", 0, -1);
            RunnableC0008i.f281a.m17a(C0009j.f384d[14]);
        }
        C0011l.m214e();
    }

    /* JADX INFO: renamed from: a */
    static void m236a(float f, float f2, float f3) {
        int i;
        if (f538g) {
            return;
        }
        if (f3 > 0.005f || C0007h.f220b - f536g > 0.05f) {
            f536g = C0007h.f220b;
            float f4 = f - C0007h.f234c[0];
            float f5 = f2 - C0007h.f234c[2];
            float f6 = (C0007h.f194A * f4) + (C0007h.f275z * f5);
            float f7 = ((-f4) * C0007h.f275z) + (f5 * C0007h.f194A);
            float f8 = (f6 * 0.70710677f) + (f7 * 0.70710677f);
            float f9 = (f7 * 0.70710677f) + ((-f6) * 0.70710677f);
            if (f8 < 0.0f && f9 < 0.0f) {
                i = 1;
            } else if (f8 <= 0.0f || f9 >= 0.0f) {
                i = (f8 <= 0.0f || f9 <= 0.0f) ? 0 : 3;
            } else {
                i = 2;
            }
            int i2 = 1;
            int i3 = 0;
            while (f490a[C0000a.f5a][i][i3][4] != 0) {
                i3++;
                if (i3 >= f490a[C0000a.f5a][i].length) {
                    if (i2 == 5) {
                        return;
                    }
                    if (i2 != 1 || i == 3) {
                        i++;
                        if (i > 3) {
                            i -= 4;
                        } else if (i < 0) {
                            i += 4;
                        }
                    } else {
                        i = 3;
                    }
                    i2++;
                    i3 = 0;
                }
            }
            f490a[C0000a.f5a][i][i3][4] = 1;
            short[] sArr = f484a;
            int i4 = f490a[C0000a.f5a][i][i3][0] * 3;
            sArr[i4] = (short) ((f490a[C0000a.f5a][i][i3][1] / 100.0f) * sArr[i4]);
            short[] sArr2 = f484a;
            int i5 = (f490a[C0000a.f5a][i][i3][0] * 3) + 1;
            sArr2[i5] = (short) (sArr2[i5] * (f490a[C0000a.f5a][i][i3][2] / 100.0f));
            short[] sArr3 = f484a;
            int i6 = (f490a[C0000a.f5a][i][i3][0] * 3) + 2;
            sArr3[i6] = (short) ((f490a[C0000a.f5a][i][i3][3] / 100.0f) * sArr3[i6]);
            C0000a.f9a.m60a().getVertexBuffer().getPositions((float[]) null).set(0, f484a.length / 3, f484a);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m237a(int i) {
        switch (i) {
            case 1:
                f546i = false;
                f567t = true;
                f550j = false;
                f557l = false;
                f554k = false;
                f568u = false;
                f559m = false;
                f542h = false;
                break;
            case 2:
                f546i = false;
                f567t = true;
                f550j = true;
                f554k = true;
                f557l = false;
                f568u = false;
                f559m = true;
                f542h = false;
                break;
            case 3:
                f546i = true;
                f567t = true;
                f550j = true;
                f554k = true;
                f557l = true;
                f568u = false;
                f559m = true;
                f542h = false;
                break;
            case 4:
                f546i = true;
                f567t = true;
                f550j = true;
                f554k = true;
                f557l = true;
                f568u = false;
                f559m = true;
                f542h = true;
                break;
        }
        C0005f.m59b(f542h);
    }

    /* JADX INFO: renamed from: a */
    private static void m238a(int i, int i2, int i3, int i4) {
        if (!f564q) {
            i += 40;
            i3 += 40;
        }
        f564q = false;
        if (C0004e.f134b == 1) {
            RunnableC0008i.f286a.drawLine(309, i - 40, 320 - i4, i3 - 40);
        } else if (C0004e.f134b == 3) {
            RunnableC0008i.f286a.drawLine(11, (240 - i) + 40, i4, (240 - i3) + 40);
        } else {
            RunnableC0008i.f286a.drawLine(i, 11, i3, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m239a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (C0004e.f134b == 1) {
            RunnableC0008i.f286a.fillTriangle(13, 120, 39, 94, 39, 146);
        } else if (C0004e.f134b == 3) {
            RunnableC0008i.f286a.fillTriangle(307, 120, 281, 146, 281, 94);
        } else {
            RunnableC0008i.f286a.fillTriangle(160, 227, 134, 201, 186, 201);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m240a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, float f2, int i11, int i12, int i13) {
        f511c = i10 == 1;
        f525e = (byte) i2;
        f535g = (byte) i3;
        f521d = (short) i6;
        f516d = (byte) i4;
        f531f = (byte) i5;
        f547j = (byte) i7;
        f505c = (byte) i8;
        f551k = (byte) i9;
        f492b = f;
        f474a = f2;
        f491b = (byte) i11;
        f507c = i12;
        f493b = i13;
        if (f516d == 1) {
            f551k = (byte) ((f551k * 3) / 2);
        }
        m237a(i);
    }

    /* JADX INFO: renamed from: a */
    private static void m241a(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        if (i > 99) {
            f530e[0] = (byte) (i / 100);
            f530e[1] = (byte) ((i % 100) / 10);
            f530e[2] = (byte) (i % 10);
            i5 = 3;
        } else if (i > 9) {
            f530e[0] = (byte) (i / 10);
            f530e[1] = (byte) (i % 10);
            i5 = 2;
        } else {
            f530e[0] = (byte) i;
            i5 = 1;
        }
        if (i4 == 1) {
            byte b = f530e[0];
            m245a(C0009j.f366b, C0011l.m167a((int) C0011l.f457a[b]), 0, C0011l.f463b[b], 10, z, i2, i3, 17);
            return;
        }
        if (i4 == 0) {
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                byte b2 = f530e[i7];
                m245a(C0009j.f366b, C0011l.m167a((int) C0011l.f457a[b2]), 0, C0011l.f463b[b2], 10, z, i2 + i6, i3, 0);
                i6 = C0011l.f463b[b2] + i6;
            }
            return;
        }
        int i8 = 0;
        for (int i9 = i5 - 1; i9 >= 0; i9--) {
            byte b3 = f530e[i9];
            m245a(C0009j.f366b, C0011l.m167a((int) C0011l.f457a[b3]), 0, C0011l.f463b[b3], 10, z, i2 - i8, i3, 24);
            i8 = C0011l.f463b[b3] + i8;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m242a(int i, int i2, int i3, boolean z) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < C0006g.f162a) {
            int i6 = C0006g.m82a()[i4] - 48;
            m245a(C0009j.f366b, C0011l.m167a((int) C0011l.f457a[i6]), 0, C0011l.f463b[i6], 10, true, i5 + 0, 6, 0);
            i4++;
            i5 += C0011l.f463b[i6];
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m243a(C0002c c0002c) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = (c0002c.f115i * 0.5f) + 2.4f;
        float f6 = c0002c.f106d[0] * f5;
        float f7 = f5 * c0002c.f106d[2];
        float f8 = c0002c.f106d[2] * 2.405f;
        float f9 = 2.405f * (-c0002c.f106d[0]);
        float f10 = (c0002c.f103c[0] - f6) + f8;
        float f11 = (c0002c.f103c[2] - f7) + f9;
        float f12 = (c0002c.f103c[0] - f6) - f8;
        float f13 = (c0002c.f103c[2] - f7) - f9;
        if (c0002c.f115i > 7.0f) {
            f = c0002c.f103c[0] + (1.3f * f6) + f8;
            f2 = c0002c.f103c[2] + (1.3f * f7) + f9;
            f3 = ((f6 * 1.3f) + c0002c.f103c[0]) - f8;
            f4 = ((f7 * 1.3f) + c0002c.f103c[2]) - f9;
        } else {
            f = c0002c.f103c[0] + f6 + f8;
            f2 = c0002c.f103c[2] + f7 + f9;
            f3 = (f6 + c0002c.f103c[0]) - f8;
            f4 = (f7 + c0002c.f103c[2]) - f9;
        }
        if (C0011l.m188a(C0007h.f234c[0], C0007h.f234c[2], f10, f11, f12, f13) && C0011l.m188a(C0007h.f234c[0], C0007h.f234c[2], f3, f4, f, f2) && C0011l.m188a(C0007h.f234c[0], C0007h.f234c[2], f, f2, f10, f11) && C0011l.m188a(C0007h.f234c[0], C0007h.f234c[2], f12, f13, f3, f4)) {
            float f14 = C0007h.f273x;
            float f15 = -C0007h.f274y;
            float f16 = c0002c.f113g;
            float f17 = c0002c.f114h;
            float fM198b = (((f10 - f) * (f2 - C0007h.f234c[2])) + ((f11 - f2) * (C0007h.f234c[0] - f))) / C0011l.m198b(((f - f10) * (f15 - f17)) + ((f11 - f2) * (f14 - f16)));
            float fM198b2 = (((f12 - f10) * (f11 - C0007h.f234c[2])) + ((f13 - f11) * (C0007h.f234c[0] - f10))) / C0011l.m198b(((f10 - f12) * (f15 - f17)) + ((f13 - f11) * (f14 - f16)));
            float fM198b3 = (((f3 - f12) * (f13 - C0007h.f234c[2])) + ((f4 - f13) * (C0007h.f234c[0] - f12))) / C0011l.m198b(((f12 - f3) * (f15 - f17)) + ((f4 - f13) * (f14 - f16)));
            float fM198b4 = (((f - f3) * (f4 - C0007h.f234c[2])) + ((f2 - f4) * (C0007h.f234c[0] - f3))) / C0011l.m198b(((f3 - f) * (f15 - f17)) + ((f2 - f4) * (f14 - f16)));
            char c = 0;
            float f18 = 99999.0f;
            if (fM198b >= 0.0f && fM198b < 99999.0f) {
                f18 = fM198b;
            }
            if (fM198b2 >= 0.0f && fM198b2 < f18) {
                c = 1;
                f18 = fM198b2;
            }
            if (fM198b3 < 0.0f || fM198b3 >= f18) {
                fM198b3 = f18;
            } else {
                c = 2;
            }
            if (fM198b4 < 0.0f || fM198b4 >= fM198b3) {
                fM198b4 = fM198b3;
            } else {
                c = 3;
            }
            float[] fArr = C0007h.f234c;
            fArr[0] = fArr[0] - (f14 * fM198b4);
            float[] fArr2 = C0007h.f234c;
            fArr2[2] = fArr2[2] - (f15 * fM198b4);
            float[] fArr3 = c0002c.f103c;
            fArr3[0] = fArr3[0] - (f16 * fM198b4);
            float[] fArr4 = c0002c.f103c;
            fArr4[2] = fArr4[2] - (f17 * fM198b4);
            switch (c) {
                case 0:
                case 2:
                    f = c0002c.f103c[0];
                    f2 = c0002c.f103c[2];
                    f10 = c0002c.f106d[0] + c0002c.f103c[0];
                    f11 = c0002c.f106d[2] + c0002c.f103c[2];
                    break;
                case 1:
                case 3:
                    f = c0002c.f103c[0];
                    f2 = c0002c.f103c[2];
                    f10 = c0002c.f106d[2] + c0002c.f103c[0];
                    f11 = c0002c.f103c[2] - c0002c.f106d[0];
                    break;
            }
            float f19 = f10 - f;
            float f20 = f11 - f2;
            float fM198b5 = (((C0007h.f234c[0] - f) * f19) + ((C0007h.f234c[2] - f2) * f20)) / C0011l.m198b((f19 * f19) + (f20 * f20));
            float f21 = ((f19 * fM198b5) + f) - C0007h.f234c[0];
            float f22 = ((f20 * fM198b5) + f2) - C0007h.f234c[2];
            float fM198b6 = C0011l.m198b((float) Math.sqrt((f21 * f21) + (f22 * f22)));
            float f23 = f21 / fM198b6;
            float f24 = f22 / fM198b6;
            float f25 = (f14 * f23) + (f15 * f24);
            float f26 = ((-f14) * f24) + (f15 * f23);
            float f27 = (f16 * f23) + (f17 * f24);
            float f28 = ((-f16) * f24) + (f17 * f23);
            float f29 = ((1.5f * (f27 - f25)) / (1.0f + (C0007h.f262m / c0002c.f105d))) + f25;
            float f30 = (((f25 - f27) * 1.5f) / (1.0f + (c0002c.f105d / C0007h.f262m))) + f27;
            float f31 = (f29 * f23) - (f26 * f24);
            float f32 = (f26 * f23) + (f29 * f24);
            float f33 = (f30 * f23) - (f28 * f24);
            float f34 = (f23 * f28) + (f24 * f30);
            float[] fArr5 = C0007h.f234c;
            fArr5[0] = fArr5[0] + (f31 * fM198b4);
            float[] fArr6 = C0007h.f234c;
            fArr6[2] = fArr6[2] + (f32 * fM198b4);
            float[] fArr7 = c0002c.f103c;
            fArr7[0] = fArr7[0] + (f33 * fM198b4);
            float[] fArr8 = c0002c.f103c;
            fArr8[2] = (fM198b4 * f34) + fArr8[2];
            C0007h.f208a = (byte) 0;
            C0007h.f215a = false;
            boolean z = false;
            float fSqrt = 5.0f * ((float) Math.sqrt(((C0007h.f273x - f31) * (C0007h.f273x - f31)) + ((C0007h.f274y + f32) * (C0007h.f274y + f32))));
            c0002c.f95b -= ((C0007h.f262m * fSqrt) / c0002c.f105d) / 60.0f;
            float f35 = (((f474a * fSqrt) * c0002c.f105d) / C0007h.f262m) / 4500.0f;
            C0007h.f220b += f35;
            if (c0002c.f95b < 0.0f && !c0002c.f97b) {
                z = true;
                c0002c.f97b = true;
                c0002c.f113g = f31;
                c0002c.f114h = f32;
                if (c0002c.f94b == 1) {
                    f543i = (byte) (f543i + 1);
                }
            }
            if (C0007h.f228c <= 1 || C0007h.f236d <= c0002c.f92a) {
                c0002c.f100c += (((0.2f * fSqrt) * c0002c.f108e) * C0007h.f262m) / c0002c.f105d;
                if (c0002c.f100c > 40.0f) {
                    c0002c.f100c = 40.0f;
                }
                C0007h.f272w = (((fSqrt * 0.01f) * c0002c.f105d) / C0007h.f262m) + C0007h.f272w;
            } else {
                c0002c.f100c -= (((0.2f * fSqrt) * c0002c.f108e) * C0007h.f262m) / c0002c.f105d;
                if (c0002c.f100c < -40.0f) {
                    c0002c.f100c = -40.0f;
                }
                C0007h.f272w -= ((fSqrt * 0.01f) * c0002c.f105d) / C0007h.f262m;
            }
            float f36 = (C0007h.f214a + C0007h.f217a[3]) - (c0002c.f96b + c0002c.f110e[3]);
            if (f36 > 0.0f) {
                c0002c.f111f *= 0.95f;
            } else if (f36 > -0.04f) {
                c0002c.f111f *= 0.97f;
            } else if (f36 > -0.07f) {
                c0002c.f111f *= 0.985f;
            }
            C0007h.f273x = f31;
            C0007h.f274y = -f32;
            if (!z) {
                c0002c.f113g = f33;
                c0002c.f114h = f34;
            }
            C0007h.f269t = C0007h.f234c[0];
            C0007h.f270u = -C0007h.f234c[2];
            float f37 = ((c0002c.f103c[0] - C0007h.f234c[0]) / 2.0f) + C0007h.f234c[0];
            float f38 = C0007h.f234c[2] + ((c0002c.f103c[2] - C0007h.f234c[2]) / 2.0f);
            m236a(f37, f38, f35);
            if (f550j) {
                float f39 = C0007h.f234c[1] + ((c0002c.f103c[1] - C0007h.f234c[1]) / 2.0f);
                f495b.m148a(f37, 0.5f + f39, f38, f37 - C0007h.f273x, f39 + 0.5f, C0007h.f274y + f38, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                f529e = true;
            }
            RunnableC0008i.m129d();
        }
    }

    /* JADX INFO: renamed from: a */
    static void m244a(Graphics graphics) {
        boolean z;
        int i;
        if (f539h == 4) {
            RunnableC0008i.m117a(-30);
            int i2 = 26;
            if (f565r) {
                if (C0009j.f370b[0] != 255 || C0009j.f370b[1] != 255 || C0009j.f370b[2] != 255 || C0009j.f370b[3] != 255 || C0009j.f370b[4] != 255 || C0009j.f370b[5] != 255) {
                    C0006g.m70a(RunnableC0008i.f293a[79]);
                    C0006g.m79a(graphics, 160, 26, 1, 1, 1);
                    int i3 = (C0006g.f171b[1] << 1) + 26;
                    if (C0009j.f370b[0] != 255) {
                        C0006g.m70a(RunnableC0008i.f293a[50]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i3, 0, 0, 2);
                        C0006g.m68a(C0009j.f370b[0]);
                        C0006g.m79a(graphics, 160, i3, 0, 0, 0);
                        i3 += C0006g.f171b[0];
                    }
                    if (C0009j.f370b[1] != 255) {
                        C0006g.m70a(RunnableC0008i.f293a[51]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i3, 0, 0, 2);
                        C0006g.m68a(C0009j.f370b[1]);
                        C0006g.m86b(' ');
                        C0006g.m92c(RunnableC0008i.f293a[124]);
                        C0006g.m79a(graphics, 160, i3, 0, 0, 0);
                        i3 += C0006g.f171b[0];
                    }
                    if (C0009j.f370b[2] != 255) {
                        C0006g.m70a(RunnableC0008i.f293a[52]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i3, 0, 0, 2);
                        C0006g.m66a();
                        C0011l.m179a(C0009j.f370b[2] * 1000);
                        C0006g.m79a(graphics, 160, i3, 0, 0, 0);
                        i3 += C0006g.f171b[0];
                    }
                    if (C0009j.f370b[3] != 255 || C0009j.f370b[4] != 255) {
                        C0006g.m70a(RunnableC0008i.f293a[53]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i3, 0, 0, 2);
                        if (C0009j.f370b[3] == 255) {
                            C0006g.m67a('-');
                        } else {
                            C0006g.m68a(C0009j.f370b[3]);
                        }
                        C0006g.m88b(" / ");
                        if (C0009j.f370b[4] == 255) {
                            C0006g.m86b('-');
                        } else {
                            C0006g.m87b(C0009j.f370b[4]);
                        }
                        C0006g.m79a(graphics, 160, i3, 0, 0, 0);
                        i3 += C0006g.f171b[0];
                    }
                    if (C0009j.f370b[5] != 255) {
                        C0006g.m70a(RunnableC0008i.f293a[85]);
                        C0006g.m88b(": ");
                        C0006g.m79a(graphics, 160, i3, 0, 0, 2);
                        C0006g.m68a(C0009j.f370b[5]);
                        C0006g.m79a(graphics, 160, i3, 0, 0, 0);
                        i3 += C0006g.f171b[0];
                    }
                    i2 = i3 + C0006g.f171b[1];
                }
                C0006g.m70a(RunnableC0008i.f293a[130]);
                C0006g.m79a(graphics, 160, i2, 1, 1, 1);
                int i4 = i2 + (C0006g.f171b[1] << 1);
                C0006g.m70a(RunnableC0008i.f293a[103]);
                C0006g.m88b(": ");
                C0006g.m79a(graphics, 160, i4, 0, 0, 2);
                int iM167a = 255 - C0011l.m167a((int) C0009j.f401h[((((((f516d - 1) * 5) + f525e) - 1) * 7) + 3) + 1]);
                if (iM167a == 255) {
                    C0006g.m70a(RunnableC0008i.f293a[123]);
                } else {
                    C0006g.m66a();
                    C0011l.m179a(iM167a * 1000);
                }
                C0006g.m79a(graphics, 160, i4, 0, 0, 0);
                int i5 = i4 + C0006g.f171b[0];
                C0006g.m70a(RunnableC0008i.f293a[51]);
                C0006g.m88b(": ");
                C0006g.m79a(graphics, 160, i5, 0, 0, 2);
                int iM167a2 = C0011l.m167a((int) C0009j.f401h[(((((f516d - 1) * 5) + f525e) - 1) * 7) + 3 + 3]);
                if (iM167a2 == 0) {
                    C0006g.m70a(RunnableC0008i.f293a[123]);
                } else {
                    C0006g.m68a((int) ((iM167a2 * 3.597f) / 1.5f));
                }
                C0006g.m79a(graphics, 160, i5, 0, 0, 0);
                int i6 = i5 + C0006g.f171b[0];
                C0006g.m70a(RunnableC0008i.f293a[105]);
                C0006g.m88b(": ");
                C0006g.m79a(graphics, 160, i6, 0, 0, 2);
                int iM167a3 = C0011l.m167a((int) C0009j.f401h[(((((f516d - 1) * 5) + f525e) - 1) * 7) + 3 + 5]);
                if (iM167a3 == 0) {
                    C0006g.m70a(RunnableC0008i.f293a[123]);
                } else {
                    C0006g.m68a(iM167a3);
                }
                C0006g.m79a(graphics, 160, i6, 0, 0, 0);
            } else {
                C0006g.m70a(RunnableC0008i.f293a[73]);
                C0006g.m79a(graphics, 26, 26, 1, f555l == 0 ? 1 : 0, 0);
                int i7 = 52;
                if (C0009j.f384d[1] > 0) {
                    C0006g.m70a(RunnableC0008i.f293a[0]);
                    C0006g.m88b(": ");
                    C0006g.m92c(RunnableC0008i.f293a[C0009j.f384d[14] + 6]);
                    C0006g.m79a(graphics, 26, 52, 1, f555l == 1 ? 1 : 0, 0);
                    i7 = 78;
                }
                C0006g.m70a(RunnableC0008i.f293a[1]);
                C0006g.m88b(": ");
                C0006g.m92c(RunnableC0008i.f293a[C0009j.f384d[2] + 10]);
                C0006g.m79a(graphics, 26, i7, 1, f555l == 2 ? 1 : 0, 0);
                int i8 = i7 + 26;
                C0006g.m70a(RunnableC0008i.f293a[74]);
                C0006g.m79a(graphics, 26, i8, 1, f555l == 3 ? 1 : 0, 0);
                int i9 = i8 + 26;
                C0006g.m70a(RunnableC0008i.f293a[78]);
                C0006g.m88b(": ");
                C0006g.m87b(C0004e.f134b * 90);
                C0006g.m79a(graphics, 26, i9, 1, f555l == 4 ? 1 : 0, 0);
                int i10 = i9 + 26;
                C0006g.m70a(RunnableC0008i.f293a[79]);
                C0006g.m79a(graphics, 26, i10, 1, f555l == 5 ? 1 : 0, 0);
                int i11 = i10 + 26;
                C0006g.m70a(RunnableC0008i.f293a[75]);
                C0006g.m79a(graphics, 26, i11, 1, f555l == 6 ? 1 : 0, 0);
                int i12 = i11 + 26;
                C0006g.m70a(RunnableC0008i.f293a[76]);
                C0006g.m79a(graphics, 26, i12, 1, f555l == 7 ? 1 : 0, 0);
                C0011l.m183a(graphics, 1, 15, 225, 3);
            }
            C0011l.m183a(graphics, 0, 305, 225, 3);
            return;
        }
        if (f539h == 1 || (f539h == 2 && f522d && C0009j.f384d[9] == 1)) {
            if (C0004e.f134b == 0) {
                graphics.drawImage(C0009j.f375c, 160, 4, 17);
            } else if (C0004e.f134b == 1) {
                graphics.drawImage(C0009j.f375c, f528e, f533f / 2, 6);
            } else if (C0004e.f134b == 3) {
                graphics.drawImage(C0009j.f375c, 4, f533f / 2, 6);
            }
            f522d = false;
        }
        C0002c.m27a(graphics, C0004e.f129a, C0004e.f134b, f545i, f549j, f528e, f533f);
        C0002c.m31a(C0000a.f39d, RunnableC0008i.f288a);
        for (int i13 = 0; i13 < f487a[C0007h.f214a].length; i13++) {
            C0002c.m31a(f483a[f487a[C0007h.f214a][i13]], (C0010k) null);
        }
        if (C0007h.f214a <= 3 || f537g - C0007h.f214a <= 5) {
            C0002c.m31a(f494b, f520d);
        }
        C0002c.m31a(f476a, f477a);
        if (C0002c.m30a(2)) {
            RunnableC0008i.m115a((byte) 75);
        }
        if (C0004e.f125a != 1 || f538g || f539h != 2) {
            if (C0007h.f195B > 0.0f) {
                C0002c.m31a(C0007h.f212a, C0007h.f213a);
                C0002c.m31a(C0007h.f212a, C0007h.f223b);
                C0002c.m31a(C0007h.f212a, C0007h.f232c);
                C0002c.m31a(C0007h.f212a, C0007h.f238d);
            }
            if (f559m) {
                RunnableC0008i.f298b.m151a(C0007h.f243e);
                RunnableC0008i.f298b.m146a(0.0f, C0007h.f217a[1] - C0007h.f234c[1], 0.0f);
                C0002c.m31a(C0000a.f32c, RunnableC0008i.f298b);
            }
            RunnableC0008i.f298b.m151a(C0007h.f243e);
            RunnableC0008i.f298b.m145a(Math.toDegrees(C0007h.f265p), 1.0f, 0.0f, 0.0f);
            RunnableC0008i.f298b.m145a(Math.toDegrees(C0007h.f266q) + ((double) (5.0f * C0007h.f220b * C0007h.f218b)), 0.0f, 0.0f, -1.0f);
            C0002c.m31a(C0000a.f9a, RunnableC0008i.f298b);
            if (f554k && C0007h.f225b && C0004e.f125a != 1) {
                C0007h.f231c.m61a(f511c ? 1.0f : C0007h.f264o);
                RunnableC0008i.f298b.m146a(0.0f, 0.2f, 2.3000002f);
                RunnableC0008i.f298b.m154b(0.825f, 0.9f, f511c ? 4.0f : C0007h.f264o * 3.0f);
                C0002c.m31a(C0007h.f231c, RunnableC0008i.f298b);
            }
            if (f567t) {
                RunnableC0008i.f298b.m151a(C0007h.f243e);
                RunnableC0008i.f298b.m146a(0.0f, C0000a.f19a[C0000a.f5a][0], C0000a.f19a[C0000a.f5a][1]);
                float f = ((C0007h.f235d == -1 ? -1 : 1) * 45.45f * C0007h.f267r * RunnableC0008i.f277a) + f544i;
                f544i = f;
                if (f >= 360.0f) {
                    f544i -= 360.0f;
                } else if (f544i < 0.0f) {
                    f544i += 360.0f;
                }
                RunnableC0008i.f298b.m147a(f544i, -1.0f, 0.0f, 0.0f);
                RunnableC0008i.f298b.m154b(C0000a.f19a[C0000a.f5a][3], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f298b);
                RunnableC0008i.f298b.m151a(C0007h.f243e);
                RunnableC0008i.f298b.m146a(0.0f, C0000a.f19a[C0000a.f5a][0], C0000a.f19a[C0000a.f5a][2]);
                RunnableC0008i.f298b.m147a(f544i, -1.0f, 0.0f, 0.0f);
                RunnableC0008i.f298b.m154b(C0000a.f19a[C0000a.f5a][4], 1.0f, 1.0f);
                C0002c.m31a(C0000a.f24b, RunnableC0008i.f298b);
            }
        }
        float f2 = 100.0f;
        int i14 = 0;
        int i15 = -1;
        while (i14 < f553k) {
            if (f482a[i14].f102c) {
                RunnableC0008i.f298b.m152a(f482a[i14].f98b);
                if (f482a[i14].f94b == 1) {
                    C0002c.m31a(f500b[f482a[i14].f99c], RunnableC0008i.f298b);
                    if (!f482a[i14].f97b && (f482a[i14].f96b == C0007h.f214a || f482a[i14].f96b - 1 == C0007h.f214a || C0007h.f214a - f482a[i14].f96b == f537g - 1)) {
                        float f3 = f482a[i14].f110e[3] + (f482a[i14].f96b - C0007h.f214a);
                        if (f3 <= f2 && C0007h.f217a[3] < f3) {
                            f2 = f482a[i14].f110e[3] + (f482a[i14].f96b - C0007h.f214a);
                            i = i14;
                        }
                    }
                } else {
                    C0002c.m31a(f514c[f482a[i14].f99c], RunnableC0008i.f298b);
                }
                i = i15;
            } else {
                i = i15;
            }
            i14++;
            i15 = i;
        }
        if (C0009j.m139a()) {
            RunnableC0008i.m115a((byte) 11);
        }
        if (C0004e.f125a != 1) {
            if (f550j && f529e) {
                f552k = 3.0f;
            }
            if (f550j && f552k > 0.0f) {
                for (int i16 = 0; i16 < ((int) f552k); i16++) {
                    RunnableC0008i.f298b.m151a(f495b);
                    float fM162a = C0011l.m162a() - 0.5f;
                    float fM162a2 = C0011l.m162a() - 0.5f;
                    RunnableC0008i.f298b.m146a(0.0f, 0.5f * fM162a, 0.0f);
                    RunnableC0008i.f298b.m147a(fM162a * 15.0f, 1.0f, 0.0f, 0.0f);
                    RunnableC0008i.f298b.m147a(fM162a2 * 180.0f, 0.0f, 0.1f, 1.0f);
                    float f4 = C0007h.f267r;
                    if (f4 < 5.0f) {
                        f4 = 5.0f;
                    }
                    RunnableC0008i.f298b.m154b(0.0015f * f4, 0.0015f * f4, f4 * 0.15f);
                    C0002c.m31a(f519d, RunnableC0008i.f298b);
                }
                f552k -= RunnableC0008i.f277a * 5.0f;
            }
            if (f557l && (!f550j || f552k <= 0.0f)) {
                float f5 = C0007h.f267r * 0.1f;
                C0007h.f222b.m61a(0.2f + ((C0007h.f267r * 0.8f) / C0007h.f263n));
                float fM198b = C0011l.m198b(0.02f + (0.02f * f5));
                RunnableC0008i.f298b.m148a(C0007h.f234c[0], C0007h.f234c[1] + 0.7f, C0007h.f234c[2], C0007h.f234c[0] - C0007h.f273x, C0007h.f234c[1] + 0.7f, C0007h.f234c[2] + C0007h.f274y, 0.0f, 1.0f, 0.0f, fM198b, 1.0f, -f5);
                float fM162a3 = 0.0f;
                float fM162a4 = 0.0f;
                for (int i17 = 0; i17 < (((int) f5) >> 1) + 1; i17++) {
                    fM162a3 = ((((C0011l.m162a() - 0.5f) * 1.2f) * 1.85f) / fM198b) - fM162a3;
                    fM162a4 = (((C0011l.m162a() - 0.5f) * 2.4f) * 0.7f) - fM162a4;
                    RunnableC0008i.f298b.m146a(fM162a3, fM162a4, 0.0f);
                    C0002c.m31a(C0007h.f222b, RunnableC0008i.f298b);
                }
            }
        }
        if (C0009j.f411l == 3 && C0014o.f569a < 0) {
            RunnableC0008i.m115a((byte) 98);
        }
        if (f539h == 5 && f556l > 0.5f) {
            RunnableC0008i.f298b.m151a(C0004e.f129a);
            RunnableC0008i.f298b.m147a(((f556l - 0.5f) / 0.6f) * 360.0f, 0.0f, 1.0f, 0.0f);
            C0002c.m31a(f508c, RunnableC0008i.f298b);
        } else if (f539h == 11 && f558m <= 3 && C0007h.f267r < 5.0f && f505c > 0 && f547j > 0 && Math.abs(C0007h.f265p) < 0.015f && Math.abs(C0007h.f266q) < 0.015f) {
            RunnableC0008i.f298b.m151a(C0004e.f129a);
            RunnableC0008i.f298b.m147a(90.0f * (4 - f558m), 0.0f, 1.0f, 0.0f);
            RunnableC0008i.f298b.m146a(0.0f, ((f540h * 100.0f) - 100.0f) - (f563p ? 15.0f : 0.0f), 0.0f);
            C0002c.m31a(f508c, RunnableC0008i.f298b);
        }
        if (f546i) {
            if (f531f == 1 && C0004e.f138b && C0004e.f125a != 1) {
                RunnableC0008i.f298b.m151a(C0007h.f243e);
                RunnableC0008i.f298b.m159d(C0004e.f129a);
                RunnableC0008i.f298b.m147a(2.0f * C0004e.f139c, 0.0f, 0.0f, 1.0f);
                C0002c.m31a(C0004e.f137b, RunnableC0008i.f298b);
            } else if (f516d == 2 && f531f == 2 && C0004e.f125a != 1 && C0007h.f220b < 0.6f) {
                float f6 = 2.4f;
                float f7 = 0.0f;
                C0007h.f243e.m156b(RunnableC0008i.f291a);
                if (C0011l.m188a((C0004e.f143f - C0007h.f234c[0]) + ((RunnableC0008i.f291a[2] * 4.8f) / 2.0f), (C0004e.f144g - C0007h.f234c[2]) + ((RunnableC0008i.f291a[10] * 4.8f) / 2.0f), 0.0f, 0.0f, RunnableC0008i.f291a[10], -RunnableC0008i.f291a[2])) {
                    C0004e.f137b.m62a(0, C0004e.f127a);
                    z = true;
                    f6 = -2.4f;
                } else if (C0011l.m188a((C0004e.f143f - C0007h.f234c[0]) - ((RunnableC0008i.f291a[2] * 4.8f) / 2.0f), (C0004e.f144g - C0007h.f234c[2]) - ((RunnableC0008i.f291a[10] * 4.8f) / 2.0f), 0.0f, 0.0f, RunnableC0008i.f291a[10], -RunnableC0008i.f291a[2])) {
                    z = false;
                } else {
                    C0004e.f137b.m62a(0, C0004e.f136b);
                    z = true;
                    f7 = 0.1f;
                }
                if (z) {
                    float f8 = C0000a.f19a[C0000a.f5a][3] - 0.3f;
                    RunnableC0008i.f298b.m151a(C0007h.f243e);
                    RunnableC0008i.f298b.m145a(Math.toDegrees(C0007h.f265p), 1.0f, 0.0f, 0.0f);
                    RunnableC0008i.f298b.m145a(Math.toDegrees(C0007h.f266q) + ((double) (5.0f * C0007h.f220b * C0007h.f218b)), 0.0f, 0.0f, -1.0f);
                    f509c.m151a(RunnableC0008i.f298b);
                    if (C0007h.f220b < 0.2f || C0007h.f218b == -1) {
                        RunnableC0008i.f298b.m146a(f8, f7, f6);
                        RunnableC0008i.f298b.m159d(C0004e.f129a);
                        C0002c.m31a(C0004e.f137b, RunnableC0008i.f298b);
                    }
                    if (C0007h.f220b < 0.2f || C0007h.f218b == 1) {
                        RunnableC0008i.f298b.m151a(f509c);
                        RunnableC0008i.f298b.m146a(-f8, f7, f6);
                        RunnableC0008i.f298b.m159d(C0004e.f129a);
                        C0002c.m31a(C0004e.f137b, RunnableC0008i.f298b);
                    }
                }
            }
            if (C0004e.f130a && f531f == 1) {
                RunnableC0008i.f298b.m151a(C0004e.f129a);
                RunnableC0008i.f298b.m146a(0.0f, 0.0f, -1.0f);
                C0002c.m31a(C0004e.f128a, RunnableC0008i.f298b);
            }
            if (f516d == 1 && f531f == 2) {
                RunnableC0008i.f298b.m151a(C0004e.f129a);
                RunnableC0008i.f298b.m146a(0.0f, 0.0f, -1.0f);
                if (C0004e.f135b > 60.0f) {
                    float f9 = C0004e.f135b / 60.0f;
                    RunnableC0008i.f298b.m154b(f9, f9, f9);
                }
                C0002c.m31a(C0004e.f140c, RunnableC0008i.f298b);
            }
        }
        C0002c.m32b();
        if ((f539h == 2 || f539h == 1) && i15 != -1) {
            f513c[0] = f482a[i15].f98b[3];
            f513c[1] = f482a[i15].f98b[7];
            f513c[2] = f482a[i15].f98b[11];
            f513c[3] = 1.0f;
            C0002c.m28a(RunnableC0008i.f298b);
            C0004e.f129a.m153b();
            RunnableC0008i.f298b.m157c(C0004e.f129a);
            RunnableC0008i.f298b.m158c(f513c);
            if (f513c[0] <= f513c[3] && f513c[0] >= (-f513c[3]) && f513c[1] <= f513c[3] && f513c[1] >= (-f513c[3]) && f513c[2] <= f513c[3] && f513c[2] >= (-f513c[3])) {
                int iM198b = (int) ((((f513c[0] * f528e) / C0011l.m198b(f513c[3])) + f528e) * 0.5f);
                int iM198b2 = (int) (((((-f513c[1]) * f533f) / C0011l.m198b(f513c[3])) + f533f) * 0.5f);
                if (C0004e.f134b == 1) {
                    iM198b += 13;
                }
                if (C0009j.f384d[9] == 0) {
                    if (C0004e.f134b == 0) {
                        iM198b2 -= 13;
                    } else if (C0004e.f134b == 2) {
                        iM198b2 += 13;
                    } else if (C0004e.f134b == 3) {
                        iM198b -= 13;
                    }
                } else if (C0004e.f134b == 3) {
                    iM198b += 9;
                }
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                graphics.setClip(f545i, f549j, f528e, f533f);
                if (f566s) {
                    if (C0009j.f384d[9] == 0 && C0004e.f134b == 0) {
                        iM198b2 -= 4;
                    }
                    float fAbs = Math.abs(C0011l.m198b((f482a[i15].f110e[3] + (f482a[i15].f96b - C0007h.f214a)) - C0007h.f217a[3]));
                    if (fAbs < 0.2f) {
                        fAbs = 0.2f;
                    }
                    if (C0004e.f134b == 0 || C0004e.f134b == 2) {
                        int i18 = (C0004e.f134b == 0 ? 19 : -19) + ((int) (iM198b2 - (4.0f / fAbs)));
                        if (i18 < 19 && C0004e.f134b == 0) {
                            i18 = 19;
                        }
                        graphics.setColor(f531f == 2 ? -34560 : -46080);
                        graphics.fillRect((int) (iM198b - (5.0f / fAbs)), i18, (int) ((10.0f * (f482a[i15].f95b / C0011l.m198b((f481a[0] * f507c) / 100.0f))) / fAbs), 3);
                        graphics.setColor(f531f == 2 ? -3014656 : -6488064);
                        graphics.drawRect((int) (iM198b - (5.0f / fAbs)), i18, (int) (10.0f / fAbs), (int) (8.0f / fAbs));
                    } else {
                        int i19 = (C0004e.f134b == 3 ? 13 : -13) + ((int) (iM198b - (4.0f / fAbs)));
                        if (i19 < 19 && C0004e.f134b == 3) {
                            i19 = 19;
                        } else if (i19 > 301 && C0004e.f134b == 1) {
                            i19 = 301;
                        }
                        graphics.setColor(f531f == 2 ? -34560 : -46080);
                        int iM198b3 = (int) ((10.0f * (f482a[i15].f95b / C0011l.m198b((f481a[0] * f507c) / 100.0f))) / fAbs);
                        if (C0004e.f134b == 1) {
                            graphics.fillRect((((int) (8.0f / fAbs)) + i19) - 3, (int) (iM198b2 - (5.0f / fAbs)), 3, iM198b3);
                        } else {
                            graphics.fillRect(i19, (int) (((iM198b2 - (5.0f / fAbs)) + (10.0f / fAbs)) - iM198b3), 3, iM198b3);
                        }
                        graphics.setColor(f531f == 2 ? -3014656 : -6488064);
                        graphics.drawRect(i19, (int) (iM198b2 - (5.0f / fAbs)), (int) (8.0f / fAbs), (int) (10.0f / fAbs));
                    }
                } else {
                    if (C0004e.f134b == 0) {
                        iM198b2 = C0009j.f384d[9] == 0 ? iM198b2 - 4 : iM198b2 + 4;
                    } else if (C0004e.f134b == 1) {
                        iM198b2 -= 6;
                        iM198b -= 6;
                    } else if (C0004e.f134b == 3) {
                        iM198b2 -= 6;
                        iM198b -= 4;
                    }
                    int i20 = 1;
                    for (int i21 = 0; i21 < f505c; i21++) {
                        if (i21 != i15 && (f482a[i21].f93a || f482a[i21].f101c > f482a[i15].f101c || (f482a[i21].f101c == f482a[i15].f101c && f482a[i21].f110e[3] > f482a[i15].f110e[3]))) {
                            i20++;
                        }
                    }
                    if (C0007h.f224b > f482a[i15].f101c || (C0007h.f224b == f482a[i15].f101c && C0007h.f217a[3] > f482a[i15].f110e[3])) {
                        i20++;
                    }
                    if (iM198b2 < 19) {
                        iM198b2 = 19;
                    }
                    f564q = true;
                    m241a(i20, iM198b, iM198b2, 1, false);
                }
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            }
        }
        if (f539h == 2 && C0007h.f230c < 0) {
            f564q = true;
            graphics.setColor(-65536);
            m247b(147, 188, 26, 13);
            m239a(160, 227, 134, 201, 186, 201);
        }
        if ((f539h == 2 && C0009j.f384d[9] == 1) || f539h == 1) {
            switch (f560n) {
                case 0:
                    m245a(C0009j.f375c, 150, 0, 25, 15, true, 110, 4, 0);
                    m241a(f558m, 120, 6, 1, true);
                    break;
                case 1:
                    m245a(C0009j.f375c, 217, 0, 63, 15, true, 177, 4, 0);
                    graphics.setColor(-1);
                    double radians = Math.toRadians((C0007h.f268s * 360.0f) / 8000.0f);
                    m238a(232, 11, (int) (((double) 232) - (Math.sin(radians) * ((double) 7))), (int) ((Math.cos(radians) * ((double) 7)) + ((double) 11)));
                    m241a((int) (C0007h.f267r * 3.597f * 1.355f), 222, 6, 2, true);
                    break;
                case 2:
                    m245a(C0009j.f375c, 40, 0, 52, 15, true, 0, 4, 0);
                    if (f527e < 0) {
                        f527e = 0;
                    }
                    if (f518d < 0) {
                        f518d = 0;
                    }
                    C0006g.m66a();
                    C0011l.m179a(f527e);
                    m242a(0, 6, 0, true);
                    break;
                case 3:
                    graphics.setColor(-16777216);
                    m247b(-240, 0, 720, 4);
                    short s = 320;
                    int i22 = 0;
                    if (C0004e.f134b == 1 || C0004e.f134b == 3) {
                        s = 240;
                        i22 = 40;
                    }
                    for (int i23 = 0; i23 < f505c; i23++) {
                        graphics.setColor(f482a[i23].f97b ? -16776961 : -65536);
                        f564q = true;
                        m247b(((f482a[i23].f101c * s) / (f537g * f491b)) + i22, 0, 2, 4);
                    }
                    graphics.setColor(-16711936);
                    f564q = true;
                    m247b(i22 + ((s * C0007h.f224b) / (f537g * f491b)), 0, 2, 4);
                    break;
                case 4:
                    int i24 = (int) (C0007h.f229c * 29.0f);
                    if (i24 > 29) {
                        i24 = 29;
                    }
                    graphics.setColor(C0007h.f233c ? -256 : -6435585);
                    m247b(64, 12, 31, 4);
                    graphics.setColor(C0007h.f233c ? -65536 : -16776961);
                    m247b(65, 13, i24, 2);
                    int i25 = (int) (C0007h.f220b * 29.0f);
                    if (i25 > 29) {
                        i25 = 29;
                    }
                    graphics.setColor(-6435585);
                    m247b(143, 12, 31, 4);
                    graphics.setColor(-65536);
                    m247b(144, 13, i25, 2);
                    break;
            }
            if (C0007h.f210a > 0.0f) {
                int i26 = (int) (255.0f - ((C0007h.f210a * 255.0f) / 240.0f));
                if (i26 < 0) {
                    i26 = 0;
                }
                if (C0007h.f208a > 0) {
                    graphics.setColor(C0011l.m169a(255, 255, i26, 0));
                } else if (C0007h.f215a) {
                    graphics.setColor(C0011l.m169a(255, 0, i26, 0));
                } else {
                    graphics.setColor(C0011l.m169a(255, i26, 0, 0));
                }
                m247b(((int) (240.0f - C0007h.f210a)) / 2, 234, (int) C0007h.f210a, 6);
            }
            boolean z2 = false;
            if (f538g || f510c <= 0 || f540h >= 1.0f) {
                f540h = 0.0f;
                f510c = (short) 0;
            } else {
                z2 = true;
                m241a(f510c, (int) (120 + (120 * f540h)), (int) (227 + ((-107) * f540h)), 0, true);
                m241a(f510c, (int) (120 - (120 * f540h)), (int) (227 + ((-107) * f540h)), 0, true);
                f540h += RunnableC0008i.f277a * 0.5f;
            }
            if (C0009j.f370b[5] != 255 || z2) {
                int i27 = f496b >= 10 ? 2 : 1;
                if (f496b >= 100) {
                    i27++;
                }
                m241a(f496b, (240 - (i27 * C0011l.f463b[0])) / 2, 227, 0, true);
            }
            f560n = (byte) (f560n < 4 ? f560n + 1 : 0);
        }
        if (C0009j.f400h || !f538g || C0004e.f134b != 0 || f540h <= 0.0f || (C0009j.f370b[0] == 255 && C0009j.f370b[1] == 255 && C0009j.f370b[2] == 255 && C0009j.f370b[3] == 255 && C0009j.f370b[4] == 255 && C0009j.f370b[5] == 255)) {
            f563p = false;
        } else {
            f563p = true;
            int i28 = (int) ((-30.0f) - ((-30.0f) * f540h));
            graphics.drawRegion(RunnableC0008i.f287a, 0, 0, 320, 30, 0, 0, i28, 20);
            if (C0009j.f397g) {
                C0006g.m70a(RunnableC0008i.f293a[48]);
                C0006g.m79a(graphics, 160, i28 + ((30 - C0006g.f171b[1]) / 2), 1, 1, 1);
            } else {
                C0006g.m70a(RunnableC0008i.f293a[49]);
                C0006g.m79a(graphics, 160, i28 + ((30 - C0006g.f171b[1]) / 2), 1, 0, 1);
            }
        }
        if (f497b && C0004e.f134b == 0) {
            C0006g.m70a(RunnableC0008i.f293a[107]);
            C0006g.m79a(graphics, 160, (240 - C0006g.f171b[1]) - 13, 1, 1, 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m245a(Image image, int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = !f564q ? i5 + 40 : i5;
        f564q = false;
        if (C0004e.f134b == 1) {
            if (!z) {
                RunnableC0008i.f286a.drawRegion(image, image.getWidth() - i4, i, i4, i3, 0, i12, i6, 0);
                return;
            }
            int i13 = i6 > 120 ? i6 + 80 : i6;
            if ((i7 & 8) != 0) {
                i10 = i12 - i3;
            } else {
                i10 = (i7 & 1) != 0 ? i12 - (i3 / 2) : i12;
            }
            if ((i7 & 32) != 0) {
                i11 = i13 - i3;
            } else {
                i11 = (i7 & 2) != 0 ? i13 - (i3 / 2) : i13;
            }
            RunnableC0008i.f286a.drawRegion(image, image.getWidth() - i4, i, i4, i3, 0, (320 - i11) - i4, i10 - 40, 0);
            return;
        }
        if (C0004e.f134b != 3) {
            RunnableC0008i.f286a.drawRegion(image, i, 0, i3, i4, 0, i12, i6, i7);
            return;
        }
        if (!z) {
            RunnableC0008i.f286a.drawRegion(image, 0, (image.getHeight() - i) - i3, i4, i3, 0, i12, i6, 0);
            return;
        }
        int i14 = i6 > 120 ? i6 + 80 : i6;
        if ((i7 & 8) != 0) {
            i8 = i12 - i3;
        } else {
            i8 = (i7 & 1) != 0 ? i12 - (i3 / 2) : i12;
        }
        if ((i7 & 32) != 0) {
            i9 = i14 - i3;
        } else {
            i9 = (i7 & 2) != 0 ? i14 - (i3 / 2) : i14;
        }
        RunnableC0008i.f286a.drawRegion(image, 0, (image.getHeight() - i) - i3, i4, i3, 0, i9, ((240 - i8) - i3) + 40, 0);
    }

    /* JADX INFO: renamed from: b */
    static void m246b() {
        f540h = 0.0f;
        f561n = false;
        f538g = true;
        f539h = (byte) 11;
        f548j = -C0007h.f271v;
        int[] iArr = new int[6];
        C0009j.f357a = iArr;
        iArr[0] = f558m;
        C0009j.f357a[1] = (int) (((C0007h.f209a * 1000.0d) * 3.5969998836517334d) / ((double) f527e));
        C0009j.f357a[2] = f527e / 1000;
        C0009j.f357a[3] = (int) (C0007h.f220b * 100.0f);
        C0009j.f357a[4] = f543i;
        C0009j.f357a[5] = f496b;
        if (C0000a.f25b) {
            C0009j.f397g = f558m == 1;
        } else {
            C0009j.f397g = true;
            if (C0009j.f370b[0] != 255 && C0009j.f357a[0] > C0009j.f370b[0]) {
                C0009j.f397g = false;
            }
            if (C0009j.f370b[1] != 255 && C0009j.f357a[1] < C0009j.f370b[1]) {
                C0009j.f397g = false;
            }
            if (C0009j.f370b[2] != 255 && C0009j.f357a[2] > C0009j.f370b[2]) {
                C0009j.f397g = false;
            }
            if (C0009j.f370b[3] != 255 && C0009j.f357a[3] > C0009j.f370b[3]) {
                C0009j.f397g = false;
            }
            if (C0009j.f370b[4] != 255 && C0009j.f357a[4] < C0009j.f370b[4]) {
                C0009j.f397g = false;
            }
            if (C0009j.f370b[5] != 255 && C0009j.f357a[5] <= C0009j.f370b[5]) {
                C0009j.f397g = false;
            }
        }
        m253h();
    }

    /* JADX INFO: renamed from: b */
    private static void m247b(int i, int i2, int i3, int i4) {
        if (!f564q) {
            i += 40;
        }
        f564q = false;
        if (C0004e.f134b == 1) {
            if (i2 > 120) {
                i2 += 80;
            }
            RunnableC0008i.f286a.fillRect((320 - i2) - i4, i - 40, i4, i3);
        } else {
            if (C0004e.f134b != 3) {
                RunnableC0008i.f286a.fillRect(i, i2, i3, i4);
                return;
            }
            if (i2 > 120) {
                i2 += 80;
            }
            RunnableC0008i.f286a.fillRect(i2, ((240 - i) - i3) + 40, i4, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x0276  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ac A[Catch: all -> 0x083c, Exception -> 0x0843, TryCatch #16 {Exception -> 0x0843, all -> 0x083c, blocks: (B:110:0x028f, B:111:0x02a7, B:113:0x02ac, B:115:0x02b6, B:116:0x02bb, B:118:0x02c6, B:119:0x02cb, B:124:0x02d9, B:126:0x02de, B:128:0x02ea, B:129:0x02ee, B:131:0x02fd), top: B:290:0x028f }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02b6 A[Catch: all -> 0x083c, Exception -> 0x0843, TryCatch #16 {Exception -> 0x0843, all -> 0x083c, blocks: (B:110:0x028f, B:111:0x02a7, B:113:0x02ac, B:115:0x02b6, B:116:0x02bb, B:118:0x02c6, B:119:0x02cb, B:124:0x02d9, B:126:0x02de, B:128:0x02ea, B:129:0x02ee, B:131:0x02fd), top: B:290:0x028f }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02c6 A[Catch: all -> 0x083c, Exception -> 0x0843, TryCatch #16 {Exception -> 0x0843, all -> 0x083c, blocks: (B:110:0x028f, B:111:0x02a7, B:113:0x02ac, B:115:0x02b6, B:116:0x02bb, B:118:0x02c6, B:119:0x02cb, B:124:0x02d9, B:126:0x02de, B:128:0x02ea, B:129:0x02ee, B:131:0x02fd), top: B:290:0x028f }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02de A[Catch: all -> 0x083c, Exception -> 0x0843, TryCatch #16 {Exception -> 0x0843, all -> 0x083c, blocks: (B:110:0x028f, B:111:0x02a7, B:113:0x02ac, B:115:0x02b6, B:116:0x02bb, B:118:0x02c6, B:119:0x02cb, B:124:0x02d9, B:126:0x02de, B:128:0x02ea, B:129:0x02ee, B:131:0x02fd), top: B:290:0x028f }] */
    /* JADX WARN: Code duplicated, block: B:128:0x02ea A[Catch: all -> 0x083c, Exception -> 0x0843, TryCatch #16 {Exception -> 0x0843, all -> 0x083c, blocks: (B:110:0x028f, B:111:0x02a7, B:113:0x02ac, B:115:0x02b6, B:116:0x02bb, B:118:0x02c6, B:119:0x02cb, B:124:0x02d9, B:126:0x02de, B:128:0x02ea, B:129:0x02ee, B:131:0x02fd), top: B:290:0x028f }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02fd A[Catch: all -> 0x083c, Exception -> 0x0843, TRY_LEAVE, TryCatch #16 {Exception -> 0x0843, all -> 0x083c, blocks: (B:110:0x028f, B:111:0x02a7, B:113:0x02ac, B:115:0x02b6, B:116:0x02bb, B:118:0x02c6, B:119:0x02cb, B:124:0x02d9, B:126:0x02de, B:128:0x02ea, B:129:0x02ee, B:131:0x02fd), top: B:290:0x028f }] */
    /* JADX WARN: Code duplicated, block: B:135:0x030f A[Catch: Exception -> 0x0847, TRY_LEAVE, TryCatch #12 {Exception -> 0x0847, blocks: (B:133:0x030a, B:135:0x030f), top: B:283:0x030a }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0348 A[Catch: Exception -> 0x034c, TRY_LEAVE, TryCatch #2 {Exception -> 0x034c, blocks: (B:146:0x0343, B:148:0x0348), top: B:268:0x0343 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0357 A[Catch: Exception -> 0x0836, TRY_LEAVE, TryCatch #6 {Exception -> 0x0836, blocks: (B:155:0x0352, B:157:0x0357), top: B:276:0x0352 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x085a  */
    /* JADX WARN: Code duplicated, block: B:270:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x030a A[EDGE_INSN: B:283:0x030a->B:133:0x030a BREAK  A[LOOP:5: B:124:0x02d9->B:132:0x0306], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x02d7 A[EDGE_INSN: B:303:0x02d7->B:123:0x02d7 BREAK  A[LOOP:4: B:111:0x02a7->B:120:0x02d0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x015c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0185 A[Catch: Exception -> 0x084a, TRY_LEAVE, TryCatch #3 {Exception -> 0x084a, blocks: (B:73:0x0180, B:75:0x0185), top: B:270:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0204  */
    /* JADX INFO: renamed from: c */
    static void m248c() {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        DataInputStream dataInputStream3;
        int i;
        InputStream inputStreamM172a;
        String str;
        DataInputStream dataInputStream4;
        int i2;
        int i3;
        int i4;
        int i5;
        int length;
        int i6;
        int length2;
        int i7;
        int length3;
        int length4;
        DataInputStream dataInputStream5;
        C0002c.m33c();
        if (f493b != 0) {
            f484a = null;
            C0000a.f5a = (byte) (f493b >> 16);
            C0000a.m7a(false);
            C0000a.m8a(false, 0);
        }
        if (C0009j.f384d[1] == 2) {
            RunnableC0008i.f281a.m19a("/mw", 1, 1);
        }
        if (C0000a.f8a == null) {
            C0000a.m10b();
        }
        C0009j.f366b = null;
        C0009j.f366b = C0011l.m176a("/font.cc");
        f528e = (short) 320;
        f533f = (short) 240;
        f545i = (short) 0;
        f549j = (short) 0;
        f537g = (short) 0;
        f540h = 0.0f;
        f473a = (byte) 0;
        f566s = C0009j.f370b[4] != 255;
        f499b = new float[3];
        f495b = new C0010k();
        InputStream inputStreamM172a2 = null;
        try {
            inputStreamM172a2 = C0011l.m172a(new StringBuffer().append("/w").append((int) f516d).append("/").append((int) f525e).append("/path.c").toString());
            dataInputStream = new DataInputStream(inputStreamM172a2);
            try {
                try {
                    int i8 = dataInputStream.readShort();
                    if (f535g == -1) {
                        f521d = (short) ((i8 / 2) - f521d);
                    }
                    f486a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, i8);
                    int i9 = 0;
                    while (true) {
                        int i10 = i9;
                        if (i10 < 3) {
                            if (f535g == 1) {
                                for (int i11 = 0; i11 < i8; i11++) {
                                    int length5 = i11 - (f521d << 1);
                                    if (length5 < 0) {
                                        length5 += f486a[i10].length;
                                    }
                                    f486a[i10][length5] = dataInputStream.readFloat();
                                }
                            } else {
                                for (int i12 = (i8 - 1) + 2; i12 >= 2; i12--) {
                                    if (i12 < i8) {
                                        int length6 = i12 - (f521d << 1);
                                        if (length6 < 0) {
                                            length6 += f486a[i10].length;
                                        }
                                        f486a[i10][length6] = dataInputStream.readFloat();
                                    } else {
                                        int length7 = (1 - (((i8 - 1) + 2) - i12)) - (f521d << 1);
                                        if (length7 < 0) {
                                            length7 += f486a[i10].length;
                                        }
                                        f486a[i10][length7] = dataInputStream.readFloat();
                                    }
                                }
                            }
                            i9 = i10 + 1;
                        } else {
                            try {
                                break;
                            } catch (Exception e) {
                                dataInputStream5 = dataInputStream;
                            }
                        }
                    }
                    dataInputStream.close();
                    dataInputStream5 = null;
                    if (inputStreamM172a2 != null) {
                        try {
                            inputStreamM172a2.close();
                        } catch (Exception e2) {
                            dataInputStream3 = dataInputStream5;
                        }
                    }
                    inputStreamM172a2 = null;
                    dataInputStream3 = null;
                } catch (Throwable th) {
                    th = th;
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                            if (inputStreamM172a2 != null) {
                                inputStreamM172a2.close();
                            }
                        } catch (Exception e3) {
                            throw th;
                        }
                    } else if (inputStreamM172a2 != null) {
                        inputStreamM172a2.close();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                RunnableC0008i.m124a(false, new StringBuffer().append("l1 ").append(e).toString());
                f486a = null;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (Exception e5) {
                        dataInputStream2 = dataInputStream;
                        dataInputStream3 = dataInputStream2;
                        if (f486a == null) {
                            RunnableC0008i.m124a(true, "l2");
                            return;
                        }
                        f523d = new byte[f504b[f516d - 1][f525e - 1].length];
                        for (i = 0; i < f523d.length; i++) {
                            if (f535g == 1) {
                                length3 = i;
                            } else {
                                length3 = (f523d.length - 1) - i;
                            }
                            length4 = length3 - f521d;
                            if (length4 >= f523d.length) {
                                length4 -= f523d.length;
                            } else if (length4 < 0) {
                                length4 += f523d.length;
                            }
                            f523d[length4] = f504b[f516d - 1][f525e - 1][i];
                            if (f535g != -1) {
                                if ((f523d[length4] & 8) == 8) {
                                    byte[] bArr = f523d;
                                    bArr[length4] = (byte) (bArr[length4] & (-9));
                                    byte[] bArr2 = f523d;
                                    bArr2[length4] = (byte) (bArr2[length4] | 32);
                                } else if ((f523d[length4] & 32) == 32) {
                                    byte[] bArr3 = f523d;
                                    bArr3[length4] = (byte) (bArr3[length4] & (-33));
                                    byte[] bArr4 = f523d;
                                    bArr4[length4] = (byte) (bArr4[length4] | 8);
                                }
                            }
                        }
                        f537g = (short) (f486a[0].length / 2);
                        f553k = f505c;
                        if (f551k > 0) {
                            f553k = (short) (f553k + f551k);
                        }
                        if (f553k > 0) {
                            f482a = new C0002c[f553k];
                        }
                        f502b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, f537g);
                        try {
                            StringBuffer stringBufferAppend = new StringBuffer().append("/w").append((int) f516d).append("/").append((int) f525e).append("/road");
                            if (f535g == 1) {
                                str = "";
                            } else {
                                str = "b";
                            }
                            inputStreamM172a = C0011l.m172a(stringBufferAppend.append(str).append(".c").toString());
                            try {
                                try {
                                    dataInputStream4 = new DataInputStream(inputStreamM172a);
                                    try {
                                        f515c = new short[(f537g << 1) * 3];
                                        f524d = new short[((f537g << 1) << 1) * 3];
                                        i2 = 0;
                                        while (true) {
                                            i3 = i2;
                                            if (i3 < f515c.length) {
                                                break;
                                            }
                                            i6 = i3 - ((f521d << 1) * 3);
                                            if (i6 < 0) {
                                                length2 = i6 + f515c.length;
                                            } else {
                                                length2 = i6;
                                            }
                                            i7 = dataInputStream4.readShort() - (f521d << 1);
                                            if (i7 < 0) {
                                                i7 += f537g << 1;
                                            }
                                            f515c[length2] = (short) i7;
                                            i2 = i3 + 1;
                                        }
                                        i4 = 0;
                                        while (true) {
                                            i5 = i4;
                                            if (i5 >= f524d.length) {
                                                length = i5 - (((f521d << 1) << 1) * 3);
                                                if (length < 0) {
                                                    length += f524d.length;
                                                }
                                                f524d[length] = dataInputStream4.readByte();
                                                if (f524d[length] < 0) {
                                                    short[] sArr = f524d;
                                                    sArr[length] = (short) (sArr[length] + 256);
                                                }
                                                i4 = i5 + 1;
                                            } else {
                                                try {
                                                    break;
                                                } catch (Exception e6) {
                                                }
                                            }
                                        }
                                        dataInputStream4.close();
                                        if (inputStreamM172a != null) {
                                            inputStreamM172a.close();
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        dataInputStream3 = dataInputStream4;
                                        RunnableC0008i.m124a(false, new StringBuffer().append("l3 ").append(e).toString());
                                        f515c = null;
                                        f524d = null;
                                        if (dataInputStream3 != null) {
                                            try {
                                                dataInputStream3.close();
                                                if (inputStreamM172a != null) {
                                                    inputStreamM172a.close();
                                                }
                                            } catch (Exception e8) {
                                            }
                                        } else if (inputStreamM172a != null) {
                                            inputStreamM172a.close();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        dataInputStream3 = dataInputStream4;
                                        if (dataInputStream3 != null) {
                                            try {
                                                dataInputStream3.close();
                                                if (inputStreamM172a != null) {
                                                    inputStreamM172a.close();
                                                }
                                            } catch (Exception e9) {
                                                throw th;
                                            }
                                        } else if (inputStreamM172a != null) {
                                            inputStreamM172a.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Exception e10) {
                                e = e10;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            inputStreamM172a = inputStreamM172a2;
                        } catch (Throwable th4) {
                            th = th4;
                            inputStreamM172a = inputStreamM172a2;
                        }
                        if (f515c != null) {
                        }
                        RunnableC0008i.m124a(true, "l4");
                        return;
                    }
                }
                dataInputStream2 = null;
                if (inputStreamM172a2 != null) {
                    try {
                        inputStreamM172a2.close();
                    } catch (Exception e12) {
                        dataInputStream3 = dataInputStream2;
                    }
                }
                inputStreamM172a2 = null;
                dataInputStream3 = null;
            }
        } catch (Exception e13) {
            e = e13;
            dataInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            dataInputStream = null;
            if (dataInputStream != null) {
                dataInputStream.close();
                if (inputStreamM172a2 != null) {
                    inputStreamM172a2.close();
                }
            } else if (inputStreamM172a2 != null) {
                inputStreamM172a2.close();
            }
            throw th;
        }
        if (f486a == null) {
            RunnableC0008i.m124a(true, "l2");
            return;
        }
        f523d = new byte[f504b[f516d - 1][f525e - 1].length];
        while (i < f523d.length) {
            if (f535g == 1) {
                length3 = i;
            } else {
                length3 = (f523d.length - 1) - i;
            }
            length4 = length3 - f521d;
            if (length4 >= f523d.length) {
                length4 -= f523d.length;
            } else if (length4 < 0) {
                length4 += f523d.length;
            }
            f523d[length4] = f504b[f516d - 1][f525e - 1][i];
            if (f535g != -1) {
                if ((f523d[length4] & 8) == 8) {
                    byte[] bArr5 = f523d;
                    bArr5[length4] = (byte) (bArr5[length4] & (-9));
                    byte[] bArr6 = f523d;
                    bArr6[length4] = (byte) (bArr6[length4] | 32);
                } else if ((f523d[length4] & 32) == 32) {
                    byte[] bArr7 = f523d;
                    bArr7[length4] = (byte) (bArr7[length4] & (-33));
                    byte[] bArr8 = f523d;
                    bArr8[length4] = (byte) (bArr8[length4] | 8);
                }
            }
        }
        f537g = (short) (f486a[0].length / 2);
        f553k = f505c;
        if (f551k > 0) {
            f553k = (short) (f553k + f551k);
        }
        if (f553k > 0) {
            f482a = new C0002c[f553k];
        }
        f502b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, f537g);
        StringBuffer stringBufferAppend2 = new StringBuffer().append("/w").append((int) f516d).append("/").append((int) f525e).append("/road");
        if (f535g == 1) {
            str = "";
        } else {
            str = "b";
        }
        inputStreamM172a = C0011l.m172a(stringBufferAppend2.append(str).append(".c").toString());
        dataInputStream4 = new DataInputStream(inputStreamM172a);
        f515c = new short[(f537g << 1) * 3];
        f524d = new short[((f537g << 1) << 1) * 3];
        i2 = 0;
        while (true) {
            i3 = i2;
            if (i3 < f515c.length) {
                break;
                break;
            }
            i6 = i3 - ((f521d << 1) * 3);
            if (i6 < 0) {
                length2 = i6 + f515c.length;
            } else {
                length2 = i6;
            }
            i7 = dataInputStream4.readShort() - (f521d << 1);
            if (i7 < 0) {
                i7 += f537g << 1;
            }
            f515c[length2] = (short) i7;
            i2 = i3 + 1;
        }
        i4 = 0;
        while (true) {
            i5 = i4;
            if (i5 >= f524d.length) {
                break;
                break;
            }
            length = i5 - (((f521d << 1) << 1) * 3);
            if (length < 0) {
                length += f524d.length;
            }
            f524d[length] = dataInputStream4.readByte();
            if (f524d[length] < 0) {
                short[] sArr2 = f524d;
                sArr2[length] = (short) (sArr2[length] + 256);
            }
            i4 = i5 + 1;
        }
        dataInputStream4.close();
        if (inputStreamM172a != null) {
            inputStreamM172a.close();
        }
        if (f515c != null || f524d == null) {
            RunnableC0008i.m124a(true, "l4");
            return;
        }
        C0005f c0005fM231i = C0012m.m231i();
        f476a = c0005fM231i;
        c0005fM231i.m62a(0, C0000a.f8a);
        if (f505c > 0 && f547j > 0) {
            f500b = new C0005f[f547j];
            int i13 = 0;
            while (i13 < f547j) {
                int i14 = 0;
                if (C0000a.f5a % 3 == 0) {
                    i14 = (C0000a.f5a + 2) - i13;
                } else if (C0000a.f5a % 3 == 1) {
                    i14 = i13 == 0 ? C0000a.f5a - 1 : i13 == 1 ? C0000a.f5a + 1 : C0000a.f5a;
                } else if (C0000a.f5a % 3 == 2) {
                    i14 = (C0000a.f5a - 2) + i13;
                }
                f500b[i13] = new C0005f(new StringBuffer().append("/cars/").append(C0000a.f17a[i14]).append("/c.apt").toString(), 18, 0);
                f500b[i13].m62a(0, new C0003d((byte) 99, (short) 228, C0011l.m202b(new StringBuffer().append("/cars/").append(C0000a.f17a[i14]).append("/txt.cc").toString())));
                i13++;
            }
        }
        f508c = new C0005f("/f1.apt", 50, 3);
        f483a = new C0005f[f488a[(((f516d - 1) * 5) + f525e) - 1][0].length + f488a[(((f516d - 1) * 5) + f525e) - 1][1].length];
        for (int i15 = 0; i15 < f488a[(((f516d - 1) * 5) + f525e) - 1][0].length; i15++) {
            if (i15 == 0) {
                f483a[i15] = new C0005f(new StringBuffer().append("/w").append((int) f516d).append("/r/").append((int) f488a[(((f516d - 1) * 5) + f525e) - 1][0][i15]).append(".apt").toString(), 0, 4);
                f483a[i15].m62a(0, C0000a.f8a);
            } else {
                f483a[i15] = new C0005f(new StringBuffer().append("/w").append((int) f516d).append("/r/").append((int) f488a[(((f516d - 1) * 5) + f525e) - 1][0][i15]).append(".apt").toString(), f483a[0]);
            }
        }
        for (int length8 = f488a[(((f516d - 1) * 5) + f525e) - 1][0].length; length8 < f483a.length; length8++) {
            if (length8 == f488a[(((f516d - 1) * 5) + f525e) - 1][0].length) {
                f483a[length8] = new C0005f(new StringBuffer().append("/w").append((int) f516d).append("/t/").append((int) f488a[(((f516d - 1) * 5) + f525e) - 1][1][length8 - f488a[(((f516d - 1) * 5) + f525e) - 1][0].length]).append(".apt").toString(), 0, 12);
                f483a[length8].m62a(0, C0000a.f23b);
            } else {
                f483a[length8] = new C0005f(new StringBuffer().append("/w").append((int) f516d).append("/t/").append((int) f488a[(((f516d - 1) * 5) + f525e) - 1][1][length8 - f488a[(((f516d - 1) * 5) + f525e) - 1][0].length]).append(".apt").toString(), f483a[f488a[(((f516d - 1) * 5) + f525e) - 1][0].length]);
            }
        }
        f487a = (short[][]) Array.newInstance((Class<?>) Short.TYPE, f537g, 20);
        for (int i16 = 0; i16 < f537g; i16++) {
            int i17 = i16 + 1;
            if (i17 >= f537g) {
                i17 -= f537g;
            }
            int i18 = 0;
            for (int i19 = 0; i19 < f483a.length; i19++) {
                if (Math.sqrt(((m232a(0, i16) - f483a[i19].f161a[0]) * (m232a(0, i16) - f483a[i19].f161a[0])) + ((m232a(2, i16) - f483a[i19].f161a[2]) * (m232a(2, i16) - f483a[i19].f161a[2]))) < 400.0d || Math.sqrt(((m232a(0, i17) - f483a[i19].f161a[0]) * (m232a(0, i17) - f483a[i19].f161a[0])) + ((m232a(2, i17) - f483a[i19].f161a[2]) * (m232a(2, i17) - f483a[i19].f161a[2]))) < 400.0d) {
                    f487a[i16][i18] = (short) i19;
                    i18++;
                }
            }
            short[] sArr3 = new short[i18];
            System.arraycopy(f487a[i16], 0, sArr3, 0, i18);
            f487a[i16] = sArr3;
        }
        C0005f c0005f = new C0005f(new StringBuffer().append("/w").append((int) f516d).append("/gt.apt").toString(), 0, 4);
        f494b = c0005f;
        c0005f.m62a(0, C0000a.f8a);
        f520d.m148a(m232a(0, 0), m232a(1, 0), m232a(2, 0), m232a(0, 1), m232a(1, 1), m232a(2, 1), 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        if (f550j) {
            f519d = C0012m.m227e();
        }
        C0007h.m106b();
        if (!C0000a.f25b) {
            C0004e.m54b();
        }
        if (f551k > 0) {
            f514c = new C0005f[10];
            C0003d c0003d = new C0003d((byte) 99, (short) 228, "/tr.cc", false);
            for (int i20 = 0; i20 < 10; i20++) {
                if (i20 == 0) {
                    f514c[i20] = new C0005f(new StringBuffer().append("/tr").append(i20 + 1).append(".apt").toString(), 0, 4);
                    f514c[i20].m62a(0, c0003d);
                } else {
                    f514c[i20] = new C0005f(new StringBuffer().append("/tr").append(i20 + 1).append(".apt").toString(), f514c[0]);
                }
            }
        }
        if (f492b == -1.0f) {
            f492b = C0007h.f259j;
        }
        if (f511c) {
            f492b *= 0.8f;
        }
        for (byte b = 0; b < f553k; b = (byte) (b + 1)) {
            f482a[b] = new C0002c();
        }
        C0009j.f375c = null;
        C0009j.f375c = C0011l.m202b(new StringBuffer().append("/w").append((int) f516d).append("/topbg").append((int) f531f).append(".cc").toString());
        m250e();
        if (f541h < 0) {
            f539h = (byte) 1;
            RunnableC0008i.f329j = (byte) 5;
            return;
        }
        f539h = (byte) 5;
        RunnableC0008i.f276a = (byte) 0;
        C0006g.m72a();
        C0011l.m204b(70);
        RunnableC0008i.m114a();
    }

    /* JADX INFO: renamed from: d */
    static void m249d() {
        int i;
        int i2;
        m252g();
        f529e = false;
        if (C0007h.f211a > 0 && C0007h.f211a < 500) {
            RunnableC0008i.m115a((byte) 11);
        }
        switch (f539h) {
            case 1:
                RunnableC0008i.m126b();
                if (f541h > 0) {
                    m250e();
                    f539h = (byte) 5;
                    RunnableC0008i.f276a = (byte) 0;
                    C0006g.m72a();
                    C0011l.m204b(70);
                    RunnableC0008i.m114a();
                } else {
                    if (C0007h.f214a >= 0) {
                        f541h = (short) (f541h + RunnableC0008i.f296b);
                    }
                    RunnableC0008i.f277a *= 2.0f;
                    RunnableC0008i.f292a[RunnableC0008i.f317f] = true;
                    RunnableC0008i.f292a[9] = true;
                    m251f();
                    C0004e.m57e();
                    RunnableC0008i.f277a *= 0.5f;
                }
                break;
            case 2:
                if (!f538g) {
                    f527e += RunnableC0008i.f296b;
                    f518d += RunnableC0008i.f296b;
                }
                if (C0000a.f22b > 0 && C0000a.f22b < 500) {
                    RunnableC0008i.m115a((byte) 11);
                }
                if (C0004e.f125a == 0) {
                    if (f561n || f538g || C0007h.f230c < 0 || C0007h.f234c[1] - C0007h.f217a[1] <= 0.9f) {
                        if (f561n && C0007h.f234c[1] == C0007h.f217a[1]) {
                            f561n = false;
                        } else if (f562o) {
                            switch (C0007h.f228c) {
                                case 0:
                                    i = 1;
                                    break;
                                case 1:
                                    i = 2;
                                    break;
                                case 2:
                                    i = 1;
                                    break;
                                case 3:
                                    i = 2;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            if (C0007h.f217a[3] + 0.4f < 1.0f) {
                                int i3 = C0007h.f214a + 1;
                                if (i3 >= f537g) {
                                    i3 -= f537g;
                                }
                                f517d = m233a(0, (int) C0007h.f214a, i) + ((m233a(0, i3, i) - m233a(0, (int) C0007h.f214a, i)) * (C0007h.f217a[3] + 0.4f));
                                f526e = m233a(1, (int) C0007h.f214a, i) + ((m233a(1, i3, i) - m233a(1, (int) C0007h.f214a, i)) * (C0007h.f217a[3] + 0.4f));
                                f532f = ((m233a(2, i3, i) - m233a(2, (int) C0007h.f214a, i)) * (C0007h.f217a[3] + 0.4f)) + m233a(2, (int) C0007h.f214a, i);
                            } else {
                                int i4 = C0007h.f214a + 1;
                                if (i4 >= f537g) {
                                    i4 -= f537g;
                                }
                                int i5 = i4 + 1;
                                if (i5 >= f537g) {
                                    i5 -= f537g;
                                }
                                f517d = m233a(0, i4, i) + ((m233a(0, i5, i) - m233a(0, i4, i)) * ((C0007h.f217a[3] + 0.4f) - 1.0f));
                                f526e = m233a(1, i4, i) + ((m233a(1, i5, i) - m233a(1, i4, i)) * ((C0007h.f217a[3] + 0.4f) - 1.0f));
                                f532f = ((m233a(2, i5, i) - m233a(2, i4, i)) * ((C0007h.f217a[3] + 0.4f) - 1.0f)) + m233a(2, i4, i);
                            }
                        }
                        f562o = false;
                    } else {
                        f561n = true;
                        f506c = 2.0f + (C0011l.m162a() * 8.0f);
                        switch (C0007h.f228c) {
                            case 0:
                                i2 = 1;
                                break;
                            case 1:
                                i2 = 2;
                                break;
                            case 2:
                                i2 = 1;
                                break;
                            case 3:
                                i2 = 2;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        if (C0007h.f217a[3] + 0.4f < 1.0f) {
                            int i6 = C0007h.f214a + 1;
                            if (i6 >= f537g) {
                                i6 -= f537g;
                            }
                            f517d = m233a(0, (int) C0007h.f214a, i2) + ((m233a(0, i6, i2) - m233a(0, (int) C0007h.f214a, i2)) * (C0007h.f217a[3] + 0.4f));
                            f526e = m233a(1, (int) C0007h.f214a, i2) + ((m233a(1, i6, i2) - m233a(1, (int) C0007h.f214a, i2)) * (C0007h.f217a[3] + 0.4f));
                            f532f = ((m233a(2, i6, i2) - m233a(2, (int) C0007h.f214a, i2)) * (C0007h.f217a[3] + 0.4f)) + m233a(2, (int) C0007h.f214a, i2);
                        } else {
                            int i7 = C0007h.f214a + 1;
                            if (i7 >= f537g) {
                                i7 -= f537g;
                            }
                            int i8 = i7 + 1;
                            if (i8 >= f537g) {
                                i8 -= f537g;
                            }
                            f517d = m233a(0, i7, i2) + ((m233a(0, i8, i2) - m233a(0, i7, i2)) * ((C0007h.f217a[3] + 0.4f) - 1.0f));
                            f526e = m233a(1, i7, i2) + ((m233a(1, i8, i2) - m233a(1, i7, i2)) * ((C0007h.f217a[3] + 0.4f) - 1.0f));
                            f532f = ((m233a(2, i8, i2) - m233a(2, i7, i2)) * ((C0007h.f217a[3] + 0.4f) - 1.0f)) + m233a(2, i7, i2);
                        }
                    }
                    if (f561n) {
                        float f = ((C0007h.f234c[1] - C0007h.f217a[1]) * 2.0f) + 1.0f;
                        float f2 = RunnableC0008i.f277a;
                        if (f >= 5.0f) {
                            f = 5.0f;
                        }
                        RunnableC0008i.f277a = f2 / f;
                    }
                }
                m251f();
                C0004e.m57e();
                if (!f538g) {
                    f558m = (byte) 1;
                    for (int i9 = 0; i9 < f505c; i9++) {
                        if (f482a[i9].f93a || f482a[i9].f101c > C0007h.f224b || (f482a[i9].f101c == C0007h.f224b && f482a[i9].f110e[3] > C0007h.f217a[3])) {
                            f558m = (byte) (f558m + 1);
                        }
                    }
                }
                break;
            case 5:
                if (f556l == 0.0f) {
                    C0002c.m25a(C0004e.f135b, f528e, f533f, 0.5f, 600.0f);
                }
                float f3 = f556l + (RunnableC0008i.f277a * 0.09f);
                f556l = f3;
                if (f3 > 1.0f) {
                    f556l = 1.0f;
                    f539h = (byte) 2;
                    RunnableC0008i.m119a((int) C0004e.f134b, true);
                    m253h();
                }
                if (f556l <= 0.7f) {
                    f549j = (short) 0;
                    f533f = (short) 240;
                    double radians = ((double) (-C0007h.f271v)) + ((Math.toRadians(360.0d) * ((double) f556l)) / 0.699999988079071d);
                    C0004e.f143f = C0007h.f234c[0] + ((((float) Math.sin(radians)) * 35.0f) / (((f556l / 0.7f) * 6.0f) + 1.0f));
                    C0004e.f142e = (C0007h.f234c[1] + 10.0f) - ((9.5f * f556l) / 0.7f);
                    C0004e.f144g = ((((float) Math.cos(radians)) * 35.0f) / (((f556l / 0.7f) * 6.0f) + 1.0f)) + C0007h.f234c[2];
                    C0004e.f129a.m148a(C0004e.f143f, C0004e.f142e + C0004e.f141d, C0004e.f144g, C0007h.f234c[0], C0007h.f234c[1] + C0004e.f141d, C0007h.f234c[2], 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                C0004e.m57e();
                break;
            case 11:
                if (C0007h.f267r > 5.0f || Math.abs(C0007h.f265p) > 0.015f || Math.abs(C0007h.f266q) > 0.015f) {
                    int i10 = C0007h.f214a + 1;
                    if (i10 >= f537g) {
                        i10 -= f537g;
                    }
                    C0004e.f143f = m232a(0, i10);
                    C0004e.f142e = m232a(1, i10) + 2.0f;
                    C0004e.f144g = m232a(2, i10);
                    m251f();
                    f549j = (short) 0;
                    f533f = (short) 240;
                } else {
                    C0007h.f267r = 0.0f;
                    if (RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10] || RunnableC0008i.f292a[11]) {
                        RunnableC0008i.m115a((byte) 1);
                    }
                    float f4 = f540h + (RunnableC0008i.f277a * 0.5f);
                    f540h = f4;
                    if (f4 > 1.0f) {
                        f540h = 1.0f;
                    }
                    float f5 = f556l - (RunnableC0008i.f277a * 0.09f);
                    f556l = f5;
                    if (f5 < 0.0f) {
                        f556l += 1.0f;
                    }
                    double radians2 = ((double) f548j) + Math.toRadians(130.0d) + (Math.toRadians(360.0d) * ((double) f556l));
                    C0004e.f143f += ((C0007h.f234c[0] + (((float) Math.sin(radians2)) * 8.5f)) - C0004e.f143f) * RunnableC0008i.f277a;
                    C0004e.f142e += (C0007h.f234c[1] - C0004e.f142e) * RunnableC0008i.f277a;
                    C0004e.f144g = ((((((float) Math.cos(radians2)) * 8.5f) + C0007h.f234c[2]) - C0004e.f144g) * RunnableC0008i.f277a) + C0004e.f144g;
                    C0002c.m29a(C0007h.f227b, C0004e.f143f, C0004e.f144g, C0007h.f214a);
                    float fM198b = C0011l.m198b(((C0004e.f143f - C0007h.f227b[0]) * (C0004e.f143f - C0007h.f227b[0])) + ((C0004e.f144g - C0007h.f227b[2]) * (C0004e.f144g - C0007h.f227b[2])));
                    if (fM198b > C0002c.f76a[f516d - 1] * 1.2f) {
                        float f6 = (C0007h.f227b[0] - C0004e.f143f) * (1.0f - ((C0002c.f76a[f516d - 1] * 1.2f) / fM198b)) * 0.5f;
                        float f7 = (1.0f - ((C0002c.f76a[f516d - 1] * 1.2f) / fM198b)) * (C0007h.f227b[2] - C0004e.f144g) * 0.5f;
                        C0004e.f142e = (float) (((double) C0004e.f142e) + (Math.sqrt(C0011l.m198b((f6 * f6) + (f7 * f7))) * 0.5d));
                        C0004e.f143f = f6 + C0004e.f143f;
                        C0004e.f144g = f7 + C0004e.f144g;
                    }
                }
                C0004e.f129a.m148a(C0004e.f143f, C0004e.f142e + C0004e.f141d, C0004e.f144g, C0007h.f234c[0], C0007h.f234c[1] + (C0004e.f141d * 0.8f), C0007h.f234c[2], 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                C0004e.m57e();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01f8  */
    /* JADX INFO: renamed from: e */
    private static void m250e() {
        int iM162a;
        byte bM162a;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        f565r = false;
        C0004e.f135b = 60.0f;
        if (f484a == null) {
            f484a = new short[f501b.length];
            System.arraycopy(f501b, 0, f484a, 0, f484a.length);
        } else {
            System.arraycopy(f501b, 0, f484a, 0, f484a.length);
            C0000a.f9a.m60a().getVertexBuffer().getPositions((float[]) null).set(0, f484a.length / 3, f484a);
        }
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < f490a[C0000a.f5a][i].length; i2++) {
                f490a[C0000a.f5a][i][i2][4] = 0;
            }
        }
        f536g = 0.0f;
        f497b = false;
        f527e = 0;
        f518d = 0;
        f558m = (byte) 0;
        f496b = (short) 0;
        f478a = (short) 0;
        f510c = (short) 0;
        f534f = false;
        f538g = false;
        f543i = (byte) 0;
        f556l = 0.0f;
        f558m = (byte) (f505c + 1);
        f552k = 1.0f;
        f529e = false;
        f506c = 10.0f;
        f517d = 0.0f;
        f526e = 0.0f;
        f532f = 0.0f;
        f561n = false;
        f562o = false;
        for (int i3 = 0; i3 < f537g; i3++) {
            f502b[0][i3] = 0;
            f502b[1][i3] = 0;
            f502b[2][i3] = 0;
            f502b[3][i3] = 0;
        }
        byte[] bArr = f502b[C0007h.f228c];
        short s = C0007h.f214a;
        bArr[s] = (byte) (bArr[s] + 1);
        C0007h.m107c();
        int i4 = C0007h.f214a + 1;
        if (i4 >= f537g) {
            i4 -= f537g;
        }
        C0007h.m104a(m233a(0, (int) C0007h.f214a, (int) C0007h.f228c) + ((m233a(0, i4, (int) C0007h.f228c) - m233a(0, (int) C0007h.f214a, (int) C0007h.f228c)) * 0.01f), m233a(1, (int) C0007h.f214a, (int) C0007h.f228c) + ((m233a(1, i4, (int) C0007h.f228c) - m233a(1, (int) C0007h.f214a, (int) C0007h.f228c)) * 0.01f), m233a(2, (int) C0007h.f214a, (int) C0007h.f228c) + ((m233a(2, i4, (int) C0007h.f228c) - m233a(2, (int) C0007h.f214a, (int) C0007h.f228c)) * 0.01f));
        C0007h.f271v = (float) (((double) C0011l.m165a(m233a(2, (int) C0007h.f214a, (int) C0007h.f228c) - m233a(2, i4, (int) C0007h.f228c), m233a(0, (int) C0007h.f214a, (int) C0007h.f228c) - m233a(0, i4, (int) C0007h.f228c))) - Math.toRadians(90.0d));
        int i5 = C0007h.f214a - 1;
        if (i5 < 0) {
            i5 += f537g;
        }
        C0004e.m51a(m232a(0, i5), m232a(1, i5) + 30.0f, m232a(2, i5));
        f475a = 0;
        for (int i6 = 0; i6 < f485a[f516d - 1].length; i6++) {
            f475a += f485a[f516d - 1][i6];
        }
        for (byte b5 = 0; b5 < f553k; b5 = (byte) (b5 + 1)) {
            if (b5 < f505c) {
                bM162a = C0007h.f228c;
                iM162a = b5 * f491b * (f516d == 1 ? 2 : 3);
                b3 = (byte) (b5 % f547j);
                b = 1;
                b4 = 1;
            } else {
                iM162a = (short) (C0011l.m162a() > 0.3f ? C0007h.f214a + 2 + ((int) (C0011l.m162a() * 3.0f)) : (C0007h.f214a - 2) - ((int) (C0011l.m162a() * 3.0f)));
                if (iM162a >= f537g) {
                    iM162a -= f537g;
                } else if (iM162a < 0) {
                    iM162a += f537g;
                }
                bM162a = (byte) (C0011l.m162a() * 4.0f);
                b = (byte) (bM162a <= 1 ? -1 : 1);
                int iM162a2 = (int) (C0011l.m162a() * f475a);
                int i7 = 1;
                int i8 = 0;
                while (true) {
                    if (i7 >= f485a[f516d - 1].length) {
                        b2 = 1;
                        break;
                    } else if (i8 <= iM162a2 && iM162a2 < f485a[f516d - 1][i7] + i8) {
                        b2 = (byte) i7;
                        break;
                    } else {
                        i8 += f485a[f516d - 1][i7];
                        i7++;
                    }
                }
                b3 = (byte) (b2 - 1);
                b4 = 0;
            }
            byte[] bArr2 = f502b[bM162a];
            bArr2[iM162a] = (byte) (bArr2[iM162a] + 1);
            f482a[b5].m35a(b3, b4, iM162a, bM162a, b, m233a(0, iM162a, (int) bM162a), m233a(1, iM162a, (int) bM162a), m233a(2, iM162a, (int) bM162a));
            if (b4 == 0) {
                if ((f523d[iM162a] & 2) == 2) {
                    f482a[b5].f91a = (byte) 2;
                } else if ((f523d[iM162a + 1 < f537g ? iM162a + 1 : 0] & 2) == 2) {
                    f482a[b5].f91a = (byte) 2;
                } else if ((f523d[iM162a + (-1) >= 0 ? iM162a - 1 : f537g - 1] & 2) == 2) {
                    f482a[b5].f91a = (byte) 2;
                }
            }
        }
        C0012m.m221a(f476a, 0, true);
        m251f();
        f528e = (short) 320;
        f533f = (short) 240;
        f545i = (short) 0;
        f549j = (short) 0;
        RunnableC0008i.m119a((int) C0004e.f134b, true);
    }

    /* JADX INFO: renamed from: f */
    private static void m251f() {
        C0007h.m108d();
        for (int i = 0; i < f553k; i++) {
            int i2 = f482a[i].f96b;
            if (i2 - C0007h.f214a < -50) {
                i2 += f537g;
            } else if (i2 - C0007h.f214a > 50) {
                i2 -= f537g;
            }
            int i3 = i2 - C0007h.f214a;
            if (i3 <= -2 || i3 >= 3) {
                f482a[i].m36a(false);
            } else {
                f482a[i].m36a(true);
                if (f482a[i].f102c && Math.abs(f482a[i].f103c[1] - C0007h.f234c[1]) <= 1.0f && (Math.abs((C0007h.f214a + C0007h.f217a[3]) - (f482a[i].f96b + f482a[i].f110e[3])) < 0.3f || f482a[i].f91a == 1)) {
                    m243a(f482a[i]);
                }
            }
        }
        for (int i4 = 0; i4 < f505c; i4++) {
            if (f482a[i4].f102c) {
                for (int i5 = i4 + 1; i5 < f553k; i5++) {
                    if (f482a[i5].f102c) {
                        float f = f482a[i4].f103c[0] - f482a[i5].f103c[0];
                        float f2 = f482a[i4].f103c[2] - f482a[i5].f103c[2];
                        float f3 = (f * f) + (f2 * f2);
                        if (f3 < 12.25f) {
                            float fM198b = C0011l.m198b((float) Math.sqrt(f3));
                            f482a[i4].f103c[0] = ((f * 3.5f) / fM198b) + f482a[i5].f103c[0];
                            f482a[i4].f103c[2] = ((f2 * 3.5f) / fM198b) + f482a[i5].f103c[2];
                            f482a[i4].f98b[3] = f482a[i4].f103c[0];
                            f482a[i4].f98b[11] = f482a[i4].f103c[2];
                            float f4 = f482a[i4].f113g;
                            float f5 = f482a[i4].f114h;
                            float f6 = f482a[i5].f113g;
                            float f7 = f482a[i5].f114h;
                            float f8 = (f482a[i5].f103c[0] - f482a[i4].f103c[0]) / 3.5f;
                            float f9 = (f482a[i5].f103c[2] - f482a[i4].f103c[2]) / 3.5f;
                            float f10 = (f4 * f8) + (f5 * f9);
                            float f11 = ((-f4) * f9) + (f5 * f8);
                            float f12 = (f6 * f8) + (f7 * f9);
                            float f13 = ((-f6) * f9) + (f7 * f8);
                            float f14 = ((1.1f * (f12 - f10)) / (1.0f + (f482a[i4].f105d / f482a[i5].f105d))) + f10;
                            float f15 = f12 + (((f10 - f12) * 1.1f) / (1.0f + (f482a[i5].f105d / f482a[i4].f105d)));
                            float f16 = (f14 * f8) - (f11 * f9);
                            float f17 = (f11 * f8) + (f14 * f9);
                            f482a[i4].f113g = f16;
                            f482a[i4].f114h = f17;
                            f482a[i5].f113g = (f15 * f8) - (f13 * f9);
                            f482a[i5].f114h = (f15 * f9) + (f13 * f8);
                            f482a[i4].f111f *= 0.85f;
                            f482a[i5].f111f *= 0.85f;
                            break;
                        }
                    }
                }
            }
        }
        C0007h.m103a(C0007h.f269t, -C0007h.f270u);
        C0007h.m110f();
    }

    /* JADX INFO: renamed from: g */
    private static void m252g() {
        if (RunnableC0008i.f309d == 0 && RunnableC0008i.f302c == 1) {
            RunnableC0008i.m130e();
            RunnableC0008i.m115a((byte) 10);
            return;
        }
        if (f539h == 2) {
            if (RunnableC0008i.f292a[6]) {
                if (C0009j.f384d[9] == 1) {
                    C0009j.f384d[9] = 0;
                } else {
                    C0009j.f384d[9] = 1;
                }
                m253h();
                RunnableC0008i.f292a[6] = false;
            }
            f534f = RunnableC0008i.f292a[10];
            if (RunnableC0008i.f292a[7]) {
                if (f539h == 2) {
                    C0004e.m55c();
                }
                RunnableC0008i.f292a[7] = false;
            }
        }
        if (RunnableC0008i.f292a[11]) {
            if (f539h == 2) {
                f539h = (byte) 4;
                f555l = (byte) 0;
                RunnableC0008i.m119a(0, false);
            } else if (f539h == 4) {
                if (f565r) {
                    f565r = false;
                } else {
                    f539h = (byte) 2;
                    RunnableC0008i.m119a((int) C0004e.f134b, true);
                    m253h();
                }
            }
            RunnableC0008i.f292a[11] = false;
        }
        if (!f565r && ((RunnableC0008i.f292a[9] || RunnableC0008i.f292a[10]) && f539h == 4)) {
            switch (f555l) {
                case 0:
                    f539h = (byte) 2;
                    RunnableC0008i.m119a((int) C0004e.f134b, true);
                    m253h();
                    break;
                case 1:
                    byte[] bArr = C0009j.f384d;
                    bArr[14] = (byte) (bArr[14] + 1);
                    if (C0009j.f384d[14] > 3) {
                        C0009j.f384d[14] = 0;
                    }
                    RunnableC0008i.f281a.m17a(C0009j.f384d[14]);
                    break;
                case 2:
                    byte[] bArr2 = C0009j.f384d;
                    bArr2[2] = (byte) (bArr2[2] + 1);
                    if (C0009j.f384d[2] > 1) {
                        C0009j.f384d[2] = 0;
                    }
                    break;
                case 3:
                    m250e();
                    f539h = (byte) 5;
                    break;
                case 4:
                    byte b = (byte) (C0004e.f134b < 3 ? C0004e.f134b + 1 : 0);
                    C0004e.f134b = b;
                    if (b == 2) {
                        C0004e.f134b = (byte) (C0004e.f134b + 1);
                    }
                    break;
                case 5:
                    f565r = true;
                    break;
                case 6:
                    RunnableC0008i.m115a((byte) 1);
                    break;
                case 7:
                    RunnableC0008i.m120a(0, RunnableC0008i.f293a[30], RunnableC0008i.f293a[27], RunnableC0008i.f293a[28]);
                    break;
            }
            RunnableC0008i.f292a[9] = false;
            RunnableC0008i.f292a[10] = false;
        }
        if (!f565r && RunnableC0008i.f292a[RunnableC0008i.f317f] && f539h == 4) {
            f555l = (byte) (f555l - 1);
            if (C0009j.f384d[1] == 0 && f555l == 1) {
                f555l = (byte) (f555l - 1);
            }
            if (f555l < 0) {
                f555l = (byte) 7;
            }
            RunnableC0008i.f292a[RunnableC0008i.f317f] = false;
            return;
        }
        if (!f565r && RunnableC0008i.f292a[RunnableC0008i.f321g] && f539h == 4) {
            if (f555l == 7) {
                f555l = (byte) -1;
            }
            f555l = (byte) (f555l + 1);
            if (C0009j.f384d[1] == 0 && f555l == 1) {
                f555l = (byte) (f555l + 1);
            }
            RunnableC0008i.f292a[RunnableC0008i.f321g] = false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m253h() {
        if (C0009j.f384d[9] == 0 || f539h != 2) {
            f528e = (short) 320;
            f533f = (short) 240;
            f545i = (short) 0;
            f549j = (short) 0;
            return;
        }
        if (C0004e.f134b == 0) {
            f545i = (short) 0;
            f549j = (short) 19;
            f528e = (short) 320;
            f533f = (short) 221;
        } else if (C0004e.f134b == 1) {
            f545i = (short) 0;
            f549j = (short) 0;
            f528e = (short) 301;
            f533f = (short) 240;
        } else if (C0004e.f134b == 3) {
            f545i = (short) 19;
            f549j = (short) 0;
            f528e = (short) 301;
            f533f = (short) 240;
        }
        f522d = true;
    }
}
