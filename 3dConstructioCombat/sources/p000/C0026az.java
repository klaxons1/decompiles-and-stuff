package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;

/* JADX INFO: renamed from: az */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0026az {

    /* JADX INFO: renamed from: A */
    public static final int f252A;

    /* JADX INFO: renamed from: B */
    public static final int f253B;

    /* JADX INFO: renamed from: C */
    public static final int f254C;

    /* JADX INFO: renamed from: D */
    public static final int f255D;

    /* JADX INFO: renamed from: E */
    public static final int f256E;

    /* JADX INFO: renamed from: F */
    public static final int f257F;

    /* JADX INFO: renamed from: G */
    public static final int f258G;

    /* JADX INFO: renamed from: H */
    public static final int f259H;

    /* JADX INFO: renamed from: I */
    public static final int f260I;

    /* JADX INFO: renamed from: J */
    public static final int f261J;

    /* JADX INFO: renamed from: K */
    public static final int f262K;

    /* JADX INFO: renamed from: L */
    public static final int f263L;

    /* JADX INFO: renamed from: M */
    public static final int f264M;

    /* JADX INFO: renamed from: N */
    public static final int f265N;

    /* JADX INFO: renamed from: O */
    public static final int f266O;

    /* JADX INFO: renamed from: P */
    public static final int f267P;

    /* JADX INFO: renamed from: Q */
    public static final int f268Q;

    /* JADX INFO: renamed from: R */
    public static final int f269R;

    /* JADX INFO: renamed from: S */
    public static final int f270S;

    /* JADX INFO: renamed from: T */
    public static final int f271T;

    /* JADX INFO: renamed from: U */
    public static final int f272U;

    /* JADX INFO: renamed from: V */
    public static final int f273V;

    /* JADX INFO: renamed from: W */
    public static final int f274W;

    /* JADX INFO: renamed from: X */
    public static final int f275X;

    /* JADX INFO: renamed from: Y */
    public static final int f276Y;

    /* JADX INFO: renamed from: Z */
    public static final int f277Z;

    /* JADX INFO: renamed from: a */
    public static final int f278a;

    /* JADX INFO: renamed from: aa */
    public static final int f279aa;

    /* JADX INFO: renamed from: ab */
    public static final int f280ab;

    /* JADX INFO: renamed from: ac */
    public static final int f281ac;

    /* JADX INFO: renamed from: ad */
    public static final int f282ad;

    /* JADX INFO: renamed from: ae */
    public static final int f283ae;

    /* JADX INFO: renamed from: af */
    public static final int f284af;

    /* JADX INFO: renamed from: ag */
    public static final int f285ag;

    /* JADX INFO: renamed from: ah */
    public static final int f286ah;

    /* JADX INFO: renamed from: ai */
    public static final int f287ai;

    /* JADX INFO: renamed from: aj */
    public static final int f288aj;

    /* JADX INFO: renamed from: ak */
    public static final int f289ak;

    /* JADX INFO: renamed from: al */
    public static final int f290al;

    /* JADX INFO: renamed from: am */
    public static final int f291am;

    /* JADX INFO: renamed from: an */
    public static final int f292an;

    /* JADX INFO: renamed from: ao */
    public static final int f293ao;

    /* JADX INFO: renamed from: ap */
    public static final int f294ap;

    /* JADX INFO: renamed from: aq */
    public static final int f295aq;

    /* JADX INFO: renamed from: ar */
    public static final int f296ar;

    /* JADX INFO: renamed from: as */
    public static final String[] f297as;

    /* JADX INFO: renamed from: at */
    private static int f298at;

    /* JADX INFO: renamed from: au */
    private static MIDlet f299au;

    /* JADX INFO: renamed from: av */
    private static Hashtable f300av;

    /* JADX INFO: renamed from: b */
    public static final int f301b;

    /* JADX INFO: renamed from: c */
    public static final int f302c;

    /* JADX INFO: renamed from: d */
    public static final int f303d;

    /* JADX INFO: renamed from: e */
    public static final int f304e;

    /* JADX INFO: renamed from: f */
    public static final int f305f;

    /* JADX INFO: renamed from: g */
    public static final int f306g;

    /* JADX INFO: renamed from: h */
    public static final int f307h;

    /* JADX INFO: renamed from: i */
    public static final int f308i;

    /* JADX INFO: renamed from: j */
    public static final int f309j;

    /* JADX INFO: renamed from: k */
    public static final int f310k;

    /* JADX INFO: renamed from: l */
    public static final int f311l;

    /* JADX INFO: renamed from: m */
    public static final int f312m;

    /* JADX INFO: renamed from: n */
    public static final int f313n;

    /* JADX INFO: renamed from: o */
    public static final int f314o;

    /* JADX INFO: renamed from: p */
    public static final int f315p;

    /* JADX INFO: renamed from: q */
    public static final int f316q;

    /* JADX INFO: renamed from: r */
    public static final int f317r;

    /* JADX INFO: renamed from: s */
    public static final int f318s;

    /* JADX INFO: renamed from: t */
    public static final int f319t;

    /* JADX INFO: renamed from: u */
    public static final int f320u;

    /* JADX INFO: renamed from: v */
    public static final int f321v;

    /* JADX INFO: renamed from: w */
    public static final int f322w;

    /* JADX INFO: renamed from: x */
    public static final int f323x;

    /* JADX INFO: renamed from: y */
    public static final int f324y;

    /* JADX INFO: renamed from: z */
    public static final int f325z;

    static {
        f298at = 0;
        int i = f298at;
        f298at = i + 1;
        f278a = i;
        int i2 = f298at;
        f298at = i2 + 1;
        f301b = i2;
        int i3 = f298at;
        f298at = i3 + 1;
        f302c = i3;
        int i4 = f298at;
        f298at = i4 + 1;
        f303d = i4;
        int i5 = f298at;
        f298at = i5 + 1;
        f304e = i5;
        int i6 = f298at;
        f298at = i6 + 1;
        f305f = i6;
        int i7 = f298at;
        f298at = i7 + 1;
        f306g = i7;
        int i8 = f298at;
        f298at = i8 + 1;
        f307h = i8;
        int i9 = f298at;
        f298at = i9 + 1;
        f308i = i9;
        int i10 = f298at;
        f298at = i10 + 1;
        f309j = i10;
        int i11 = f298at;
        f298at = i11 + 1;
        f310k = i11;
        int i12 = f298at;
        f298at = i12 + 1;
        f311l = i12;
        int i13 = f298at;
        f298at = i13 + 1;
        f312m = i13;
        int i14 = f298at;
        f298at = i14 + 1;
        f313n = i14;
        int i15 = f298at;
        f298at = i15 + 1;
        f314o = i15;
        int i16 = f298at;
        f298at = i16 + 1;
        f315p = i16;
        int i17 = f298at;
        f298at = i17 + 1;
        f316q = i17;
        int i18 = f298at;
        f298at = i18 + 1;
        f317r = i18;
        int i19 = f298at;
        f298at = i19 + 1;
        f318s = i19;
        int i20 = f298at;
        f298at = i20 + 1;
        f319t = i20;
        f298at++;
        int i21 = f298at;
        f298at = i21 + 1;
        f320u = i21;
        int i22 = f298at;
        f298at = i22 + 1;
        f321v = i22;
        int i23 = f298at;
        f298at = i23 + 1;
        f322w = i23;
        int i24 = f298at;
        f298at = i24 + 1;
        f323x = i24;
        int i25 = f298at;
        f298at = i25 + 1;
        f324y = i25;
        int i26 = f298at;
        f298at = i26 + 1;
        f325z = i26;
        int i27 = f298at;
        f298at = i27 + 1;
        f252A = i27;
        int i28 = f298at;
        f298at = i28 + 1;
        f253B = i28;
        int i29 = f298at;
        f298at = i29 + 1;
        f254C = i29;
        int i30 = f298at;
        f298at = i30 + 1;
        f255D = i30;
        int i31 = f298at;
        f298at = i31 + 1;
        f256E = i31;
        int i32 = f298at;
        f298at = i32 + 1;
        f257F = i32;
        int i33 = f298at;
        f298at = i33 + 1;
        f258G = i33;
        int i34 = f298at;
        f298at = i34 + 1;
        f259H = i34;
        int i35 = f298at;
        f298at = i35 + 1;
        f260I = i35;
        int i36 = f298at;
        f298at = i36 + 1;
        f261J = i36;
        int i37 = f298at;
        f298at = i37 + 1;
        f262K = i37;
        int i38 = f298at;
        f298at = i38 + 1;
        f263L = i38;
        int i39 = f298at;
        f298at = i39 + 1;
        f264M = i39;
        int i40 = f298at;
        f298at = i40 + 1;
        f265N = i40;
        int i41 = f298at;
        f298at = i41 + 1;
        f266O = i41;
        int i42 = f298at;
        f298at = i42 + 1;
        f267P = i42;
        f298at++;
        f298at++;
        int i43 = f298at;
        f298at = i43 + 1;
        f268Q = i43;
        int i44 = f298at;
        f298at = i44 + 1;
        f269R = i44;
        int i45 = f298at;
        f298at = i45 + 1;
        f270S = i45;
        int i46 = f298at;
        f298at = i46 + 1;
        f271T = i46;
        int i47 = f298at;
        f298at = i47 + 1;
        f272U = i47;
        int i48 = f298at;
        f298at = i48 + 1;
        f273V = i48;
        int i49 = f298at;
        f298at = i49 + 1;
        f274W = i49;
        int i50 = f298at;
        f298at = i50 + 1;
        f275X = i50;
        int i51 = f298at;
        f298at = i51 + 1;
        f276Y = i51;
        int i52 = f298at;
        f298at = i52 + 1;
        f277Z = i52;
        int i53 = f298at;
        f298at = i53 + 1;
        f279aa = i53;
        int i54 = f298at;
        f298at = i54 + 1;
        f280ab = i54;
        int i55 = f298at;
        f298at = i55 + 1;
        f281ac = i55;
        int i56 = f298at;
        f298at = i56 + 1;
        f282ad = i56;
        int i57 = f298at;
        f298at = i57 + 1;
        f283ae = i57;
        int i58 = f298at;
        f298at = i58 + 1;
        f284af = i58;
        int i59 = f298at;
        f298at = i59 + 1;
        f285ag = i59;
        int i60 = f298at;
        f298at = i60 + 1;
        f286ah = i60;
        int i61 = f298at;
        f298at = i61 + 1;
        f287ai = i61;
        int i62 = f298at;
        f298at = i62 + 1;
        f288aj = i62;
        int i63 = f298at;
        f298at = i63 + 1;
        f289ak = i63;
        int i64 = f298at;
        f298at = i64 + 1;
        f290al = i64;
        int i65 = f298at;
        f298at = i65 + 1;
        f291am = i65;
        int i66 = f298at;
        f298at = i66 + 1;
        f292an = i66;
        int i67 = f298at;
        f298at = i67 + 1;
        f293ao = i67;
        int i68 = f298at;
        f298at = i68 + 1;
        f294ap = i68;
        int i69 = f298at;
        f298at = i69 + 1;
        f295aq = i69;
        int i70 = f298at;
        f298at = i70 + 1;
        f296ar = i70;
        f297as = new String[]{"UNKNOWN", "Select", "Exit", "Menu", "Back", "Please wait", "OK", "Game aborted", "Error loading level", "Choose level", "Back", "Look for servers", "Start server", "Multiplayer", "Yes", "No", "Resume Game", "Options", "Exit", "Single player", "Play", "Multiplayer", "Connect success", "Connect error", "Found servers", "No servers", "Cancel", "Servers", "Connecting", "Looking for servers", "Exit?", "Client connected", "Connect failed", "Client connecting", "Awaiting client", "Starting server", "Sound ON", "Sound OFF", "Vibrate ON", "Vibrate OFF", "Options", "Help", "Constructo Combat", "Detail HIGH", "Detail LOW", "Controls", "View", "Configure", "Default", "Defaults set", "Scores", "Current Controls", "Configure Controls", "Forward", "Backward", "Left", "Right", "Tilt up", "Tilt down", "Fly up", "Fly down", "Action", "No score", "Game over", "You won!", "You tied!", "You lost!", "Yellow score", "Yellow buildings", "Red score", "Red buildings", "Next page", "Previous page"};
        f300av = new Hashtable();
    }

    /* JADX INFO: renamed from: a */
    public static String m176a() {
        return "Go constructo crazy! Build your buildings on a variety of landscapes and prevent opponents from doing the same. Use your grapple to grab building parts and weapons. Place pieces at acceptable locations and fire weapons at your enemies or their buildings; the green arrow indicates potential targets.\nPoints are awarded at the end of the level, for each building as follows:\n  1 story   - 10\n  2 stories - 20\n  3 stories - 30\n  4 stories - 40\n  5 stories - 50\nIf a building has a roof on it, you get five times the score for that building\nAnd if a building is 5 stories high with a roof, you get 200 points!\n \nControls may be configured. Default controls are:\n  Up - Fly forward\n  Left - Turn left\n  Right - Turn right\n  Down - Fly back\n  Fire - Get or use item\n  4 - Fly down\n  6 - Fly up\n  1 - Tilt down\n  3 - Tilt up\n \nWeapons you find:\n  Stun missile - Stun opposing ships\n  Stun missile pack - 3 stun missles\n  Putty missle - Bounce enemies across the map\n  Ballons - Attach to pieces or opponents\n  Demo bomb - Destoy a building section\n  Nuke - Flatten an entire structure\n \nBad guys to watch for:\n  Opponent - Wants to win\n";
    }

    /* JADX INFO: renamed from: a */
    public static String m177a(int i) {
        return i >= f297as.length ? f297as[f278a] : f297as[i];
    }

    /* JADX INFO: renamed from: a */
    public static String m178a(String str) {
        String str2 = (String) f300av.get(str);
        return str2 != null ? str2 : f299au.getAppProperty(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m179a(String str, String str2) {
        f300av.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m180a(MIDlet mIDlet) {
        f299au = mIDlet;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("properties", true);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            while (recordEnumerationEnumerateRecords.hasNextElement()) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordEnumerationEnumerateRecords.nextRecord()));
                String utf = dataInputStream.readUTF();
                String utf2 = dataInputStream.readUTF();
                dataInputStream.close();
                f300av.put(utf, utf2);
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m181b() {
        try {
            RecordStore.deleteRecordStore("properties");
        } catch (Exception e) {
        }
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("properties", true);
            Enumeration enumerationKeys = f300av.keys();
            Enumeration enumerationElements = f300av.elements();
            while (enumerationKeys.hasMoreElements()) {
                String str = (String) enumerationKeys.nextElement();
                String str2 = (String) enumerationElements.nextElement();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeUTF(str2);
                recordStoreOpenRecordStore.addRecord(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e2) {
        }
        f299au = null;
    }
}
