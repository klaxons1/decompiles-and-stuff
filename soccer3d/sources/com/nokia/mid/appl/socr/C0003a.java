package com.nokia.mid.appl.socr;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: renamed from: com.nokia.mid.appl.socr.a */
/* JADX INFO: loaded from: C:\Temp\jadx-9991838165078942717\classes.dex */
public class C0003a {

    /* JADX INFO: renamed from: c */
    private static C0003a f28c = null;

    /* JADX INFO: renamed from: a */
    private static DataInputStream f26a = null;

    /* JADX INFO: renamed from: b */
    public static final String f27b = System.getProperty("microedition.locale");

    static {
        m18a();
    }

    private C0003a() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m14a(int i) {
        return m15a(i, (String[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0079 A[Catch: IOException -> 0x00a1, all -> 0x00cd, TryCatch #1 {IOException -> 0x00a1, blocks: (B:4:0x0004, B:6:0x0008, B:7:0x000f, B:9:0x0013, B:11:0x0034, B:16:0x0046, B:17:0x0054, B:19:0x0079, B:21:0x0083, B:23:0x0087, B:34:0x00a8, B:36:0x00ab, B:28:0x0098), top: B:43:0x0004, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0083 A[Catch: IOException -> 0x00a1, all -> 0x00cd, TryCatch #1 {IOException -> 0x00a1, blocks: (B:4:0x0004, B:6:0x0008, B:7:0x000f, B:9:0x0013, B:11:0x0034, B:16:0x0046, B:17:0x0054, B:19:0x0079, B:21:0x0083, B:23:0x0087, B:34:0x00a8, B:36:0x00ab, B:28:0x0098), top: B:43:0x0004, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0087 A[Catch: IOException -> 0x00a1, all -> 0x00cd, TRY_LEAVE, TryCatch #1 {IOException -> 0x00a1, blocks: (B:4:0x0004, B:6:0x0008, B:7:0x000f, B:9:0x0013, B:11:0x0034, B:16:0x0046, B:17:0x0054, B:19:0x0079, B:21:0x0083, B:23:0x0087, B:34:0x00a8, B:36:0x00ab, B:28:0x0098), top: B:43:0x0004, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[Catch: IOException -> 0x00a1, all -> 0x00cd, LOOP:0: B:34:0x00a8->B:37:0x00ca, LOOP_START, PHI: r0 r1
  0x00a8: PHI (r0v14 java.lang.String) = (r0v13 java.lang.String), (r0v15 java.lang.String) binds: [B:22:0x0085, B:37:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:22:0x0085, B:37:0x00ca] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {IOException -> 0x00a1, blocks: (B:4:0x0004, B:6:0x0008, B:7:0x000f, B:9:0x0013, B:11:0x0034, B:16:0x0046, B:17:0x0054, B:19:0x0079, B:21:0x0083, B:23:0x0087, B:34:0x00a8, B:36:0x00ab, B:28:0x0098), top: B:43:0x0004, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab A[Catch: IOException -> 0x00a1, all -> 0x00cd, TRY_LEAVE, TryCatch #1 {IOException -> 0x00a1, blocks: (B:4:0x0004, B:6:0x0008, B:7:0x000f, B:9:0x0013, B:11:0x0034, B:16:0x0046, B:17:0x0054, B:19:0x0079, B:21:0x0083, B:23:0x0087, B:34:0x00a8, B:36:0x00ab, B:28:0x0098), top: B:43:0x0004, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static synchronized String m15a(int i, String[] strArr) {
        String utf;
        synchronized (C0003a.class) {
            try {
                if (f28c == null) {
                    f28c = new C0003a();
                }
                if (f26a != null) {
                    f26a.skipBytes(i * 2);
                    f26a.skipBytes((f26a.readShort() - (i * 2)) - 2);
                    utf = f26a.readUTF();
                    if (f26a.markSupported()) {
                        try {
                            f26a.reset();
                        } catch (IOException e) {
                            f26a.close();
                            f26a = null;
                        }
                    } else {
                        f26a.close();
                        f26a = null;
                    }
                    if (strArr != null) {
                        if (strArr.length == 1) {
                            utf = m16a(utf, "%U", strArr[0]);
                        } else {
                            for (int i2 = 0; i2 < strArr.length; i2++) {
                                utf = m16a(utf, new StringBuffer().append("%").append(i2).append("U").toString(), strArr[i2]);
                            }
                        }
                    }
                } else {
                    InputStream resourceAsStream = f28c.getClass().getResourceAsStream(new StringBuffer().append("/lang.").append(f27b).toString());
                    if (resourceAsStream == null) {
                        resourceAsStream = f28c.getClass().getResourceAsStream("/lang.xx");
                    }
                    if (resourceAsStream == null) {
                        utf = "X";
                    } else {
                        f26a = new DataInputStream(resourceAsStream);
                        f26a.mark(512);
                        f26a.skipBytes(i * 2);
                        f26a.skipBytes((f26a.readShort() - (i * 2)) - 2);
                        utf = f26a.readUTF();
                        if (f26a.markSupported()) {
                            f26a.close();
                            f26a = null;
                        } else {
                            f26a.reset();
                        }
                        if (strArr != null) {
                            if (strArr.length == 1) {
                                utf = m16a(utf, "%U", strArr[0]);
                            } else {
                                while (i2 < strArr.length) {
                                    utf = m16a(utf, new StringBuffer().append("%").append(i2).append("U").toString(), strArr[i2]);
                                }
                            }
                        }
                    }
                }
            } catch (IOException e2) {
                f26a = null;
                utf = "E";
            }
        }
        return utf;
    }

    /* JADX INFO: renamed from: a */
    public static String m16a(String str, String str2, String str3) {
        int iIndexOf;
        do {
            iIndexOf = str.indexOf(str2);
            if (iIndexOf >= 0) {
                str = new StringBuffer().append(str.substring(0, iIndexOf)).append(str3).append(str.substring(str2.length() + iIndexOf)).toString();
            }
        } while (iIndexOf >= 0);
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static StringBuffer m17a(InputStream inputStream) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            if (((char) inputStream.read()) == ' ') {
                while (true) {
                    int i = inputStream.read();
                    if (i < 0) {
                        break;
                    }
                    if (((char) i) != '\r') {
                        if (((char) i) == '\n') {
                            stringBuffer.append((Object) m17a(inputStream));
                            break;
                        }
                        stringBuffer.append((char) i);
                    }
                }
            }
        } catch (IOException e) {
        }
        return stringBuffer;
    }

    /* JADX INFO: renamed from: a */
    private static void m18a() {
        boolean z;
        String property = System.getProperty("microedition.platform");
        StringBuffer stringBuffer = new StringBuffer();
        if (f28c == null) {
            f28c = new C0003a();
        }
        InputStream resourceAsStream = f28c.getClass().getResourceAsStream("/META-INF/MANIFEST.MF");
        if (resourceAsStream == null) {
            z = false;
            break;
        }
        while (true) {
            try {
                int i = resourceAsStream.read();
                if (i < 0) {
                    return;
                }
                if (((char) i) == '\r') {
                    continue;
                } else if (((char) i) != '\n') {
                    stringBuffer.append((char) i);
                } else if (stringBuffer.toString().trim().startsWith("Nokia-Platform:")) {
                    stringBuffer.append((Object) m17a(resourceAsStream));
                    String strSubstring = stringBuffer.toString().trim().substring(15);
                    Vector vector = new Vector();
                    while (true) {
                        int iIndexOf = strSubstring.indexOf("@");
                        if (iIndexOf == -1) {
                            break;
                        }
                        vector.addElement(strSubstring.substring(0, iIndexOf));
                        strSubstring = strSubstring.substring(iIndexOf + 1, strSubstring.length());
                    }
                    vector.addElement(strSubstring);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= vector.size()) {
                            z = false;
                            break;
                        } else {
                            if (m19a(property, ((String) vector.elementAt(i2)).trim())) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    stringBuffer.delete(0, stringBuffer.length());
                }
            } catch (IOException e) {
            }
        }
        if (z) {
            return;
        }
        System.exit(0);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m19a(String str, String str2) {
        return m20a(str, str2, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m20a(String str, String str2, int i, int i2) {
        while (true) {
            if (i == str.length() && i2 == str2.length()) {
                return true;
            }
            if (i != str.length() && i2 != str2.length()) {
                switch (str2.charAt(i2)) {
                    case '*':
                        if (i2 == str2.length() - 1 || m20a(str, str2, i, i2 + 1)) {
                            return true;
                        }
                        i++;
                        break;
                    case '?':
                        i++;
                        i2++;
                        break;
                    default:
                        if (str.charAt(i) != str2.charAt(i2)) {
                            return false;
                        }
                        i++;
                        i2++;
                        break;
                        break;
                }
            } else {
                return false;
            }
        }
    }
}
