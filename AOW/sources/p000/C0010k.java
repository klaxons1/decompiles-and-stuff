package p000;

import java.io.InputStream;
import java.io.PrintStream;
import javax.microedition.rms.RecordStore;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class C0010k {
    public static PrintStream out;

    /* JADX INFO: renamed from: r */
    private static String f620r;

    static {
        PrintStream printStream = System.out;
        out = System.err;
        f620r = "";
        try {
            if (m239b("Tanchiki Pro")) {
                write(2);
            } else if (m239b("Dizzy IV")) {
                write(3);
            } else if (m239b("Dizzy VI")) {
                write(4);
            } else if (m239b("Rebound Ball 2")) {
                write(5);
            } else if (m239b("Robodef Pro")) {
                write(6);
            } else if (m238a("glomo.cfg")) {
                write(1);
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m237a(String str, byte[] bArr, int i) {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, true);
            if (recordStoreOpenRecordStore.getNumRecords() < i) {
                while (recordStoreOpenRecordStore.getNumRecords() < i) {
                    recordStoreOpenRecordStore.addRecord((byte[]) null, 0, 0);
                }
            }
            recordStoreOpenRecordStore.setRecord(i, bArr, 0, bArr.length);
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m238a(String str) {
        try {
            return Runtime.getRuntime().getClass().getResourceAsStream(new StringBuffer("/").append(str).toString()) != null;
        } catch (Exception e) {
        }
    }

    public static void arraycopy(Object obj, int i, Object obj2, int i2, int i3) {
        try {
            System.arraycopy(obj, i, obj2, i2, i3);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m239b(String str) {
        try {
            if (f620r == "") {
                InputStream resourceAsStream = Runtime.getRuntime().getClass().getResourceAsStream("/META-INF/MANIFEST.MF");
                while (true) {
                    int i = resourceAsStream.read();
                    if (i == -1) {
                        break;
                    }
                    f620r = new StringBuffer().append(f620r).append((char) i).toString();
                }
                resourceAsStream.close();
            }
            return f620r.indexOf(str) != -1;
        } catch (Exception e) {
            return false;
        }
    }

    public static long currentTimeMillis() {
        try {
            return System.currentTimeMillis();
        } catch (Exception e) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: gc */
    public static void m240gc() {
        try {
            System.gc();
        } catch (Exception e) {
        }
    }

    public static String getProperty(String str) {
        if (str == "microedition.platform") {
            return "SonyEricssonW900i";
        }
        if (str == "microedition.profiles") {
            return "MIDP2.0";
        }
        if (str == "microedition.configuration") {
            return "CDLC1.1";
        }
        if (str == "microedition.io.file.FileConnection.version") {
            return "1.0";
        }
        if (str == "IMEI") {
            return "445795258744125478";
        }
        return null;
    }

    private static void write(int i) {
        try {
            switch (i) {
                case 1:
                    m237a("generalInfo", new byte[]{0, 0, 0, 0}, 1);
                    m237a("generalInfo", new byte[]{0, 0, 1, 64, 23, 41, 47, -61}, 2);
                    m237a("generalInfo", new byte[]{0, 0, 0, 0, 0, 0, 0, 1}, 3);
                    m237a("generalInfo", new byte[]{0, 17, 83, 111, 110, 121, 69, 114, 105, 99, 115, 115, 111, 110, 87, 57, 48, 48, 105}, 4);
                    m237a("generalInfo", new byte[]{0, 6, 48, 48, 48, 48, 48, 48}, 6);
                    m237a("generalInfo", new byte[]{0, 0, 0, 0, 0, 13, -115, 47}, 7);
                    m237a("generalInfo", new byte[]{0, 0, 0, 0, 0, 13, -115, 47}, 10);
                    m237a("generalInfo", new byte[]{0, 6, 48, 48, 48, 48, 48, 48}, 21);
                    m237a("generalInfo", new byte[]{0, 6, 48, 48, 48, 48, 48, 48}, 23);
                    m237a("generalInfo", new byte[]{0, 6, 48, 48, 48, 48, 48, 48}, 25);
                    break;
                case 2:
                    m237a("temp", new byte[]{33, 114, 115, 67}, 1);
                    m237a("temp", new byte[]{5, -105, -87, 32}, 2);
                    break;
                case 3:
                    m237a("activation", new byte[]{49, 48, 83, 69, 87, 57, 48, 48}, 1);
                    break;
                case 4:
                    m237a("activation", new byte[]{48, 57, 83, 69, 87, 57, 48, 48}, 1);
                    break;
                case 5:
                    m237a("GAMEDATA", new byte[]{-1, -1, -50, -2, -1, -3, -1, -49, -2, -1, -84, -18, -1, -56, -51, -115, -70, -122, -111, -112, -112, -116, -116, -100, -106, -106, -49, -49, -58, -88, -111}, 1);
                    break;
                case 6:
                    RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("params", true);
                    byte[] record = recordStoreOpenRecordStore.getRecord(1);
                    recordStoreOpenRecordStore.closeRecordStore();
                    record[1] = -1;
                    record[2] = -1;
                    record[3] = -1;
                    record[4] = -1;
                    record[46] = 0;
                    record[47] = 0;
                    record[51] = 0;
                    record[55] = 0;
                    record[62] = 0;
                    record[63] = 0;
                    record[67] = 0;
                    record[71] = 0;
                    m237a("params", record, 1);
                    break;
                default:
                    return;
            }
        } catch (Exception e) {
        }
    }
}
