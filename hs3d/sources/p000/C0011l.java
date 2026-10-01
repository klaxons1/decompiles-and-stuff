package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
public final class C0011l {

    /* JADX INFO: renamed from: a */
    static Random f455a;

    /* JADX INFO: renamed from: b */
    private static int f461b;

    /* JADX INFO: renamed from: b */
    static Random f462b;

    /* JADX INFO: renamed from: a */
    static int[] f459a = new int[4];

    /* JADX INFO: renamed from: a */
    static int f454a = 70693;

    /* JADX INFO: renamed from: a */
    static final short[][] f460a = {new short[]{25, 0, 22, 22}, new short[]{47, 0, 22, 22}, new short[]{6, 0, 7, 12}, new short[]{0, 0, 7, 12}, new short[]{13, 7, 12, 7}, new short[]{13, 0, 12, 7}, new short[]{0, 22, 12, 12}, new short[]{12, 22, 12, 12}, new short[]{24, 22, 12, 12}, new short[]{0, 36, 15, 14}, new short[]{16, 36, 18, 16}, new short[]{2, 52, 16, 16}, new short[]{19, 52, 16, 16}, new short[]{35, 52, 16, 16}, new short[]{2, 73, 12, 12}, new short[]{19, 73, 12, 12}, new short[]{35, 73, 12, 12}, new short[]{54, 41, 16, 16}, new short[]{54, 58, 16, 16}, new short[]{54, 25, 16, 16}, new short[]{0, 123, 21}, new short[]{111, 77}, new short[]{38, 27, 14, 23}};

    /* JADX INFO: renamed from: a */
    static final byte[] f457a = {0, 15, 19, 34, 49, 64, 79, 94, 109, 124, -117};

    /* JADX INFO: renamed from: b */
    static final byte[] f463b = {15, 4, 15, 15, 15, 15, 15, 15, 15, 15, 3};

    /* JADX INFO: renamed from: a */
    private static RecordStore f456a = null;

    /* JADX INFO: renamed from: a */
    static float f453a = 3.1415927f;

    /* JADX INFO: renamed from: b */
    private static int[] f464b = null;

    /* JADX INFO: renamed from: a */
    private static final char[] f458a = new char[64];

    /* JADX INFO: renamed from: a */
    public static final byte m160a(char c) {
        if (c >= 1040 && c <= 1103) {
            return (byte) (c - 848);
        }
        switch (c) {
            case 1025:
                return (byte) (c - 857);
            case 1026:
            case 1027:
                return (byte) (c - 898);
            case 1028:
                return (byte) (c - 858);
            case 1029:
                return (byte) (c - 840);
            case 1030:
                return (byte) (c - 852);
            case 1031:
                return (byte) (c - 856);
            case 1032:
                return (byte) (c - 869);
            case 1033:
            case 1036:
                return (byte) (c - 895);
            case 1034:
                return (byte) (c - 894);
            case 1035:
                return (byte) (c - 893);
            case 1038:
                return (byte) (c - 877);
            case 1039:
                return (byte) (c - 896);
            case 1040:
                return (byte) (c - 848);
            case 1105:
                return (byte) (c - 921);
            case 1106:
                return (byte) (c - 962);
            case 1107:
                return (byte) (c - 976);
            case 1108:
                return (byte) (c - 922);
            case 1109:
                return (byte) (c - 919);
            case 1110:
                return (byte) (c - 931);
            case 1111:
                return (byte) (c - 920);
            case 1112:
                return (byte) (c - 924);
            case 1113:
            case 1116:
                return (byte) (c - 959);
            case 1114:
                return (byte) (c - 958);
            case 1115:
                return (byte) (c - 957);
            case 1118:
                return (byte) (c - 956);
            case 1119:
                return (byte) (c - 960);
            case 1168:
                return (byte) (c - 1003);
            case 1169:
                return (byte) (c - 989);
            case 8212:
                return (byte) (c - 8061);
            case 8216:
                return (byte) (c - 8071);
            case 8218:
                return (byte) (c - 8088);
            case 8224:
            case 8225:
                return (byte) (c - 8090);
            case 8226:
                return (byte) (c - 8077);
            case 8240:
                return (byte) (c - 8103);
            case 8249:
                return (byte) (c - 8110);
            case 8250:
                return (byte) (c - 8095);
            case 8364:
                return (byte) (c - 8228);
            case 8470:
                return (byte) (c - 8285);
            case 8482:
                return (byte) (c - 8329);
            default:
                return (byte) c;
        }
    }

    /* JADX INFO: renamed from: a */
    static byte m161a(short s, int i) {
        return (byte) (i == 0 ? (s >>> 8) & 255 : s & 255);
    }

    /* JADX INFO: renamed from: a */
    public static float m162a() {
        int i = f461b + 1;
        f461b = i;
        return i % 2 == 0 ? f455a.nextFloat() : f462b.nextFloat();
    }

    /* JADX INFO: renamed from: a */
    public static final float m163a(double d) {
        return m198b((float) d);
    }

    /* JADX INFO: renamed from: a */
    static float m164a(float f) {
        double radians = Math.toRadians(f);
        return (float) (Math.sin(radians) / ((double) m198b((float) Math.cos(radians))));
    }

    /* JADX INFO: renamed from: a */
    static final float m165a(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 > 0.0f) {
            return m212d(f / f2);
        }
        if (f2 < 0.0f) {
            return f < 0.0f ? -(f453a - m212d(f / f2)) : f453a - m212d((-f) / f2);
        }
        return f < 0.0f ? (-f453a) / 2.0f : f453a / 2.0f;
    }

    /* JADX INFO: renamed from: a */
    static final int m166a(float f) {
        int i = ((f * 10.0f) % 10.0f >= 5.0f ? 1 : 0) + ((int) f);
        if (i == 0) {
            return f > 0.0f ? 1 : -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    static int m167a(int i) {
        return i < 0 ? i + 256 : i;
    }

    /* JADX INFO: renamed from: a */
    private static int m168a(int i, int i2, int i3) {
        int i4 = i3 < 0 ? i3 + 360 : i3;
        if (i4 > 360) {
            i4 -= 360;
        }
        if (i4 < 60) {
            return i + (((i4 * (i2 - i)) + 30) / 60);
        }
        if (i4 < 180) {
            return i2;
        }
        if (i4 < 240) {
            return i + ((((240 - i4) * (i2 - i)) + 30) / 60);
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    static int m169a(int i, int i2, int i3, int i4) {
        return ((i & 255) << 24) | ((i2 & 255) << 16) | ((i3 & 255) << 8) | (i4 & 255);
    }

    /* JADX INFO: renamed from: a */
    static int m170a(int[] iArr) {
        int iM168a;
        int iM168a2;
        int i;
        if (iArr[2] == 0) {
            int i2 = (iArr[1] * 255) / 360;
            if (iArr[0] != 240) {
                iM168a2 = i2;
                i = i2;
                iM168a = i2;
            } else {
                iM168a2 = i2;
                i = i2;
                iM168a = i2;
            }
        } else {
            int i3 = iArr[1] <= 180 ? ((iArr[1] * (iArr[2] + 360)) + 180) / 360 : (iArr[1] + iArr[2]) - (((iArr[1] * iArr[2]) + 180) / 360);
            int i4 = (iArr[1] * 2) - i3;
            iM168a = ((m168a(i4, i3, iArr[0] + 120) * 255) + 180) / 360;
            int iM168a3 = ((m168a(i4, i3, iArr[0]) * 255) + 180) / 360;
            iM168a2 = ((m168a(i4, i3, iArr[0] - 120) * 255) + 180) / 360;
            i = iM168a3;
        }
        return m169a(iArr[3], iM168a, i, iM168a2);
    }

    /* JADX INFO: renamed from: a */
    public static long m171a(String str) {
        int i = 0;
        if (f464b == null) {
            f464b = new int[256];
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = 8;
                int i4 = i2;
                while (true) {
                    i3--;
                    if (i3 >= 0) {
                        i4 = (i4 & 1) != 0 ? (i4 >>> 1) ^ (-306674912) : i4 >>> 1;
                    }
                }
                f464b[i2] = i4;
            }
        }
        byte[] bytes = str.getBytes();
        int i5 = -1;
        int length = bytes.length;
        while (true) {
            length--;
            if (length < 0) {
                return ((long) (i5 ^ (-1))) & 4294967295L;
            }
            i5 = (i5 >>> 8) ^ f464b[(bytes[i] ^ i5) & 255];
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    static InputStream m172a(String str) {
        return HSpeed.f0a.getClass().getResourceAsStream(str);
    }

    /* JADX INFO: renamed from: a */
    static String m173a(int i) {
        int iM167a = m167a(i);
        return iM167a == 0 ? "-" : new StringBuffer().append(iM167a).append("").toString();
    }

    /* JADX INFO: renamed from: a */
    static String m174a(DataInputStream dataInputStream) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            byte b = dataInputStream.readByte();
            if (b == 13) {
                break;
            }
            stringBuffer.append((char) b);
        }
        dataInputStream.readByte();
        if (stringBuffer.length() > 0) {
            return stringBuffer.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    static String m175a(String str) {
        try {
            return RunnableC0008i.f280a.getAppProperty(str);
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    static Image m176a(String str) {
        Image imageCreateImage = null;
        byte[] bArrM191a = m191a(str);
        if (bArrM191a != null) {
            try {
                imageCreateImage = Image.createImage(bArrM191a, 0, bArrM191a.length);
            } catch (Throwable th) {
            }
        }
        if (imageCreateImage == null || imageCreateImage.getWidth() == 0 || imageCreateImage.getHeight() == 0) {
            RunnableC0008i.m124a(true, new StringBuffer().append("s9 ").append(str).toString());
        }
        return imageCreateImage;
    }

    /* JADX INFO: renamed from: a */
    static short m177a(int i, int i2) {
        return (short) (((i & 255) << 8) | (i2 & 255));
    }

    /* JADX INFO: renamed from: a */
    static void m178a() {
        try {
            RecordStore.deleteRecordStore("hsrms");
        } catch (Exception e) {
        }
        f456a = null;
    }

    /* JADX INFO: renamed from: a */
    static void m179a(int i) {
        int i2 = i / 60000;
        int i3 = (i - (60000 * i2)) / 1000;
        C0006g.m87b(i2);
        C0006g.m86b(':');
        if (i3 < 10) {
            C0006g.m86b('0');
        }
        C0006g.m87b(i3);
    }

    /* JADX INFO: renamed from: a */
    static void m180a(int i, int i2) {
        if (C0002c.f68a > 0) {
            if (C0009j.f405j > 1 || (C0009j.f405j == 1 && RunnableC0008i.f329j == 0)) {
                int i3 = C0002c.f68a - i2;
                C0002c.f68a = i3;
                if (i3 < 1) {
                    C0002c.f68a = 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #2 {Exception -> 0x0096, blocks: (B:20:0x004c, B:22:0x0051), top: B:45:0x004c }] */
    /* JADX INFO: renamed from: a */
    public static final void m181a(String str) {
        int i;
        RunnableC0008i.f293a = new byte[137][];
        InputStream inputStreamM172a = m172a(str);
        DataInputStream dataInputStream = new DataInputStream(inputStreamM172a);
        while (true) {
            try {
                String utf = dataInputStream.readUTF();
                if (utf == null) {
                    break;
                }
                int iIndexOf = utf.indexOf(58);
                int length = utf.length();
                if (iIndexOf > -1) {
                    String strSubstring = utf.substring(1, iIndexOf);
                    int i2 = iIndexOf + 1;
                    while (i2 < length && utf.charAt(i2) == ' ') {
                        i2++;
                    }
                    String strSubstring2 = utf.substring(i2, length);
                    try {
                        i = Integer.parseInt(strSubstring);
                    } catch (NumberFormatException e) {
                        i = -1;
                    }
                    if (i == -1 || i >= RunnableC0008i.f293a.length) {
                        C0009j.f351a.put(strSubstring, strSubstring2);
                    } else {
                        RunnableC0008i.f293a[i] = m207b(strSubstring2.replace('|', '\n'));
                        if (i != 91 && i != 96 && i != 97 && i != 98 && i != 131) {
                            m184a(RunnableC0008i.f293a[i]);
                        }
                    }
                }
            } catch (Exception e2) {
            }
        }
        dataInputStream.close();
        if (inputStreamM172a != null) {
            inputStreamM172a.close();
        }
        C0002c.f74a = (short) (f460a[20][0] - 21);
        System.gc();
        try {
            dataInputStream.close();
            if (inputStreamM172a != null) {
                inputStreamM172a.close();
            }
        } catch (Exception e3) {
        }
        C0002c.f74a = (short) (f460a[20][0] - 21);
        System.gc();
    }

    /* JADX INFO: renamed from: a */
    static final void m182a(String str, boolean z) {
        HSpeed.f3b = true;
        try {
            if (RunnableC0008i.f280a.platformRequest(str)) {
                z = true;
            }
            HSpeed.f3b = false;
            if (z) {
                RunnableC0008i.f280a.m2c();
            } else {
                m204b(50);
            }
        } catch (Throwable th) {
            if (z) {
                RunnableC0008i.f280a.m2c();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static final void m183a(Graphics graphics, int i, int i2, int i3, int i4) {
        if (C0009j.f352a != null) {
            graphics.drawRegion(C0009j.f352a, f460a[i][0], f460a[i][1], f460a[i][2], f460a[i][3], 0, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    static final void m184a(byte[] bArr) {
        C0006g.m70a(bArr);
        if (C0006g.m65a(1) <= 307) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        int i = 2;
        while (true) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            for (int i2 = 1; i2 < i; i2++) {
                int length = (bArr2.length * i2) / i;
                while (length < bArr2.length && bArr2[length] != 32) {
                    length++;
                }
                if (length < bArr2.length) {
                    bArr2[length] = 10;
                }
            }
            C0006g.m70a(bArr2);
            if (C0006g.m65a(1) <= 307) {
                System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m185a(byte[] bArr, int i) {
        if (f456a == null) {
            m203b();
        }
        try {
            int nextRecordID = f456a.getNextRecordID() - 1;
            if (nextRecordID >= i) {
                f456a.setRecord(i, bArr, 0, bArr == null ? 0 : bArr.length);
                return;
            }
            for (int i2 = nextRecordID + 1; i2 <= i; i2++) {
                if (i2 == i) {
                    f456a.addRecord(bArr, 0, bArr == null ? 0 : bArr.length);
                } else {
                    f456a.addRecord((byte[]) null, 0, 0);
                }
            }
        } catch (Exception e) {
            RunnableC0008i.m127b(false, new StringBuffer().append("s4 ").append(i).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m186a(float[] fArr) {
        float fM198b = m198b((float) Math.sqrt((fArr[0] * fArr[0]) + (fArr[1] * fArr[1]) + (fArr[2] * fArr[2])));
        fArr[0] = fArr[0] / fM198b;
        fArr[1] = fArr[1] / fM198b;
        fArr[2] = fArr[2] / fM198b;
    }

    /* JADX INFO: renamed from: a */
    static void m187a(int[] iArr, int i) {
        iArr[0] = i >>> 24;
        iArr[1] = (i >> 16) & 255;
        iArr[2] = (i >> 8) & 255;
        iArr[3] = i & 255;
    }

    /* JADX INFO: renamed from: a */
    static final boolean m188a(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * (f2 - f4)) - ((f - f3) * (f6 - f4)) <= 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m189a(String str, String str2) throws Throwable {
        Throwable th;
        MessageConnection messageConnection;
        MessageConnection messageConnection2;
        boolean z;
        HSpeed.f3b = true;
        RunnableC0008i.f315e = true;
        String string = new StringBuffer().append("sms://").append(str).toString();
        try {
            messageConnection2 = (MessageConnection) Connector.open(string);
            try {
                TextMessage textMessageNewMessage = messageConnection2.newMessage("text");
                textMessageNewMessage.setAddress(string);
                textMessageNewMessage.setPayloadText(str2);
                messageConnection2.send(textMessageNewMessage);
                if (messageConnection2 != null) {
                    try {
                        messageConnection2.close();
                        z = true;
                    } catch (Exception e) {
                        z = true;
                    }
                } else {
                    z = true;
                }
            } catch (Exception e2) {
                if (messageConnection2 != null) {
                    try {
                        messageConnection2.close();
                        z = false;
                    } catch (Exception e3) {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                messageConnection = messageConnection2;
                if (messageConnection == null) {
                    throw th;
                }
                try {
                    messageConnection.close();
                    throw th;
                } catch (Exception e4) {
                    throw th;
                }
            }
        } catch (Exception e5) {
            messageConnection2 = null;
        } catch (Throwable th3) {
            th = th3;
            messageConnection = null;
        }
        RunnableC0008i.f315e = false;
        HSpeed.f3b = false;
        return z;
    }

    /* JADX INFO: renamed from: a */
    static byte[] m190a(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i >>> ((3 - i2) << 3));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    static byte[] m191a(String str) {
        Throwable th;
        InputStream inputStreamM172a;
        int i;
        InputStream inputStream = null;
        byte b = 0;
        for (byte b2 : str.getBytes()) {
            b = (byte) (b + b2);
        }
        byte[] bArr = null;
        for (int i2 = 0; bArr == null && i2 < 1; i2++) {
            try {
                inputStreamM172a = m172a(str);
                try {
                    int iM169a = m169a(inputStreamM172a.read(), inputStreamM172a.read(), inputStreamM172a.read(), inputStreamM172a.read());
                    bArr = new byte[iM169a];
                    for (int i3 = 0; i3 < iM169a; i3++) {
                        int i4 = inputStreamM172a.read();
                        if (i4 == -1) {
                            break;
                        }
                        if (i3 / iM169a < 0.25f) {
                            i = i4 - f460a[21][1];
                        } else if (i3 / iM169a < 0.5f) {
                            i = i4 - f460a[20][1];
                        } else {
                            i = ((float) i3) / ((float) iM169a) < 0.75f ? i4 - f460a[21][0] : i4 - b;
                        }
                        bArr[i3] = (byte) i;
                    }
                    if (inputStreamM172a != null) {
                        try {
                            inputStreamM172a.close();
                        } catch (Exception e) {
                        }
                    }
                } catch (Throwable th2) {
                    if (inputStreamM172a != null) {
                        try {
                            inputStreamM172a.close();
                        } catch (Exception e2) {
                            bArr = null;
                        }
                    }
                    bArr = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if (bArr == null) {
                m204b(200);
            }
        }
        if (bArr == null) {
            RunnableC0008i.m124a(true, new StringBuffer().append("s5: ").append(str).toString());
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [javax.microedition.io.HttpConnection] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [javax.microedition.io.HttpConnection] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a6 -> B:101:0x0018). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    static final byte[] m192a(String str, byte[] bArr) {
        Throwable th;
        ?? r5;
        ?? r3;
        ?? r2;
        ?? r0;
        byte[] bArr2;
        HttpConnection httpConnection;
        InputStream inputStreamOpenInputStream;
        int length;
        int i;
        int i2;
        byte[] bArr3 = null;
        ?? r1 = 1;
        HSpeed.f3b = true;
        RunnableC0008i.f315e = true;
        try {
            try {
                try {
                    if (bArr != null) {
                        HttpConnection httpConnection2 = (HttpConnection) Connector.open(str, 3, true);
                        if (httpConnection2 != null) {
                            httpConnection2.setRequestMethod("POST");
                            httpConnection2.setRequestProperty("Content-Length", new StringBuffer().append("").append(bArr.length).toString());
                            httpConnection2.setRequestProperty("Accept", "application/octet-stream");
                            httpConnection2.setRequestProperty("Connection", "close");
                            OutputStream outputStreamOpenOutputStream = httpConnection2.openOutputStream();
                            outputStreamOpenOutputStream.write(bArr);
                            outputStreamOpenOutputStream.flush();
                            if (outputStreamOpenOutputStream != null) {
                                try {
                                    outputStreamOpenOutputStream.close();
                                } catch (Exception e) {
                                    httpConnection = httpConnection2;
                                    r1 = httpConnection2;
                                }
                            }
                            httpConnection = httpConnection2;
                            r1 = httpConnection2;
                            try {
                                httpConnection.getResponseCode();
                                inputStreamOpenInputStream = httpConnection.openInputStream();
                                try {
                                    length = (int) httpConnection.getLength();
                                    bArr2 = new byte[length];
                                    i = 0;
                                    i2 = 0;
                                    while (i != length && i2 != -1) {
                                        i2 = inputStreamOpenInputStream.read(bArr2, i, length - i);
                                        i += i2;
                                    }
                                    if (inputStreamOpenInputStream != null) {
                                        try {
                                            inputStreamOpenInputStream.close();
                                        } catch (Exception e2) {
                                        }
                                    }
                                    if (httpConnection != null) {
                                        try {
                                            httpConnection.close();
                                        } catch (Exception e3) {
                                        }
                                    }
                                } catch (Exception e4) {
                                    r0 = httpConnection;
                                    r2 = inputStreamOpenInputStream;
                                    if (r2 != 0) {
                                        try {
                                            r2.close();
                                        } catch (Exception e5) {
                                        }
                                    }
                                    if (r0 != 0) {
                                        try {
                                            r0.close();
                                        } catch (Exception e6) {
                                            bArr2 = bArr3;
                                        }
                                    }
                                    bArr2 = bArr3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r5 = inputStreamOpenInputStream;
                                    r3 = httpConnection;
                                    if (r5 != 0) {
                                        try {
                                            r5.close();
                                        } catch (Exception e7) {
                                        }
                                    }
                                    if (r3 == 0) {
                                        throw th;
                                    }
                                    try {
                                        r3.close();
                                        throw th;
                                    } catch (Exception e8) {
                                        throw th;
                                    }
                                }
                            } catch (Exception e9) {
                                r2 = 0;
                                r0 = httpConnection;
                            } catch (Throwable th3) {
                                th = th3;
                                r5 = 0;
                                r3 = httpConnection;
                            }
                            RunnableC0008i.f315e = false;
                            HSpeed.f3b = false;
                            bArr3 = bArr2;
                        } else if (httpConnection2 != null) {
                            try {
                                httpConnection2.close();
                            } catch (Exception e10) {
                            }
                        }
                    } else {
                        HttpConnection httpConnectionOpen = Connector.open(str, 1, true);
                        if (httpConnectionOpen != null) {
                            httpConnectionOpen.setRequestMethod("GET");
                            httpConnectionOpen.setRequestProperty("Accept", "application/octet-stream");
                            httpConnectionOpen.setRequestProperty("Connection", "close");
                            httpConnection = httpConnectionOpen;
                            r1 = httpConnectionOpen;
                            httpConnection.getResponseCode();
                            inputStreamOpenInputStream = httpConnection.openInputStream();
                            length = (int) httpConnection.getLength();
                            bArr2 = new byte[length];
                            i = 0;
                            i2 = 0;
                            while (i != length) {
                                i2 = inputStreamOpenInputStream.read(bArr2, i, length - i);
                                i += i2;
                            }
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream.close();
                            }
                            if (httpConnection != null) {
                                httpConnection.close();
                            }
                            RunnableC0008i.f315e = false;
                            HSpeed.f3b = false;
                            bArr3 = bArr2;
                        } else if (httpConnectionOpen != null) {
                            try {
                                httpConnectionOpen.close();
                            } catch (Exception e11) {
                            }
                        }
                    }
                } catch (Exception e12) {
                    r2 = bArr3;
                    r0 = bArr3;
                } catch (Throwable th4) {
                    th = th4;
                    r5 = bArr3;
                    r3 = bArr3;
                }
            } catch (Throwable th5) {
                th = th5;
                r5 = 0;
                r3 = 1;
            }
        } catch (Exception e13) {
            r2 = 0;
            r0 = r1;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    private static char[] m193a(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = ((i << 2) + 2) / 3;
        char[] cArr = new char[((i + 2) / 3) << 2];
        int i6 = 0;
        int i7 = 0;
        while (i7 < i) {
            int i8 = i7 + 1;
            int i9 = bArr[i7] & 255;
            if (i8 < i) {
                i3 = i8 + 1;
                i2 = bArr[i8] & 255;
            } else {
                i2 = 0;
                i3 = i8;
            }
            if (i3 < i) {
                i7 = i3 + 1;
                i4 = bArr[i3] & 255;
            } else {
                i4 = 0;
                i7 = i3;
            }
            int i10 = i9 >>> 2;
            int i11 = ((i9 & 3) << 4) | (i2 >>> 4);
            int i12 = ((i2 & 15) << 2) | (i4 >>> 6);
            int i13 = i4 & 63;
            int i14 = i6 + 1;
            cArr[i6] = f458a[i10];
            int i15 = i14 + 1;
            cArr[i14] = f458a[i11];
            cArr[i15] = i15 < i5 ? f458a[i12] : '=';
            int i16 = i15 + 1;
            cArr[i16] = i16 < i5 ? f458a[i13] : '=';
            i6 = i16 + 1;
        }
        return cArr;
    }

    /* JADX INFO: renamed from: a */
    static final int[] m194a(String str) {
        Image imageM176a = m176a(str);
        if (imageM176a == null) {
            return null;
        }
        int[] iArr = new int[imageM176a.getWidth() * imageM176a.getHeight()];
        imageM176a.getRGB(iArr, 0, imageM176a.getWidth(), 0, 0, imageM176a.getWidth(), imageM176a.getHeight());
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    static final String[] m195a(String str, char c) {
        if (str == null) {
            return null;
        }
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        String[] strArr = new String[i];
        while (true) {
            i--;
            if (i <= 0) {
                strArr[0] = str;
                return strArr;
            }
            strArr[i] = str.substring(str.lastIndexOf(c) + 1);
            str = str.substring(0, str.lastIndexOf(c));
        }
    }

    /* JADX INFO: renamed from: a */
    static final String[] m196a(String str, int i, boolean z) {
        String[] strArr;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C0004e.m53a(str, 138, true));
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            String utf = dataInputStream.readUTF();
            try {
                dataInputStream.close();
                byteArrayInputStream.close();
            } catch (Exception e) {
            }
            String[] strArrM195a = m195a(utf, '|');
            if (strArrM195a.length > 7) {
                String[] strArr2 = new String[6];
                strArr2[0] = strArrM195a[0];
                strArr2[1] = strArrM195a[1];
                strArr2[4] = strArrM195a[5];
                strArr2[5] = strArrM195a[6];
                if (strArrM195a.length == 10) {
                    String property = System.getProperty("wireless.messaging.sms.smsc");
                    if (property == null) {
                        return null;
                    }
                    if (property.startsWith("+")) {
                        property = property.substring(1);
                    }
                    String[] strArrM195a2 = m195a(strArrM195a[3], ';');
                    String[] strArrM195a3 = m195a(strArrM195a[4], ';');
                    String[] strArrM195a4 = m195a(strArrM195a[8], ';');
                    String[] strArrM195a5 = m195a(strArrM195a[9], ';');
                    for (int i2 = 0; i2 < strArrM195a4.length; i2++) {
                        if (property.startsWith(strArrM195a4[i2])) {
                            strArr2[1] = new StringBuffer().append(strArr2[1]).append(strArrM195a2[i2]).append(" (").append(strArrM195a5[i2]).append(").").toString();
                            strArr2[1] = new StringBuffer().append(strArr2[1]).append(" ").append(strArrM195a[2]).toString();
                            strArr2[2] = strArrM195a2[i2];
                            strArr2[3] = strArrM195a3[i2];
                            return strArr2;
                        }
                    }
                    return null;
                }
                strArr2[1] = new StringBuffer().append(strArr2[1]).append(" ").append(strArrM195a[2]).toString();
                strArr2[2] = strArrM195a[3];
                strArr2[3] = strArrM195a[4];
                strArr = strArr2;
            } else {
                strArr = null;
            }
            return strArr;
        } catch (Exception e2) {
            try {
                dataInputStream.close();
                byteArrayInputStream.close();
                return null;
            } catch (Exception e3) {
                return null;
            }
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                byteArrayInputStream.close();
            } catch (Exception e4) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    static byte[][][] m197a() throws Throwable {
        Throwable th;
        InputStream inputStream;
        InputStream inputStreamM172a;
        byte[][][] bArr = null;
        for (int i = 0; bArr == null && i < 1; i++) {
            bArr = new byte[2][][];
            try {
                inputStreamM172a = m172a("/story.cc");
                for (int i2 = 0; i2 < 2; i2++) {
                    try {
                        int i3 = inputStreamM172a.read();
                        bArr[i2] = new byte[i3 * 5][];
                        for (int i4 = 0; i4 < i3; i4++) {
                            int i5 = inputStreamM172a.read();
                            if (i5 > 0) {
                                bArr[i2][i4 * 5] = new byte[i5];
                                for (int i6 = 0; i6 < i5; i6++) {
                                    int i7 = inputStreamM172a.read() - 23;
                                    if (i7 < 0) {
                                        i7 += 256;
                                    }
                                    bArr[i2][i4 * 5][i6] = (byte) i7;
                                }
                            }
                            int iM177a = m177a(inputStreamM172a.read(), inputStreamM172a.read());
                            if (iM177a > 0) {
                                bArr[i2][(i4 * 5) + 1] = new byte[iM177a];
                                for (int i8 = 0; i8 < iM177a; i8++) {
                                    int i9 = inputStreamM172a.read() - 23;
                                    if (i9 < 0) {
                                        i9 += 256;
                                    }
                                    bArr[i2][(i4 * 5) + 1][i8] = (byte) i9;
                                }
                            }
                            bArr[i2][(i4 * 5) + 2] = new byte[42];
                            for (int i10 = 0; i10 < 42; i10++) {
                                bArr[i2][(i4 * 5) + 2][i10] = (byte) inputStreamM172a.read();
                            }
                            int iM177a2 = m177a(inputStreamM172a.read(), inputStreamM172a.read());
                            if (iM177a2 > 0) {
                                bArr[i2][(i4 * 5) + 3] = new byte[iM177a2];
                                for (int i11 = 0; i11 < iM177a2; i11++) {
                                    int i12 = inputStreamM172a.read() - 23;
                                    if (i12 < 0) {
                                        i12 += 256;
                                    }
                                    bArr[i2][(i4 * 5) + 3][i11] = (byte) i12;
                                }
                            }
                            int iM177a3 = m177a(inputStreamM172a.read(), inputStreamM172a.read());
                            if (iM177a3 > 0) {
                                bArr[i2][(i4 * 5) + 4] = new byte[iM177a3];
                                for (int i13 = 0; i13 < iM177a3; i13++) {
                                    int i14 = inputStreamM172a.read() - 23;
                                    if (i14 < 0) {
                                        i14 += 256;
                                    }
                                    bArr[i2][(i4 * 5) + 4][i13] = (byte) i14;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamM172a;
                        if (inputStream == null) {
                            throw th;
                        }
                        try {
                            inputStream.close();
                            throw th;
                        } catch (Exception e) {
                            throw th;
                        }
                    }
                }
                if (inputStreamM172a != null) {
                    try {
                        inputStreamM172a.close();
                    } catch (Exception e2) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
            if (bArr == null) {
                m204b(200);
            }
        }
        if (bArr == null) {
            RunnableC0008i.m124a(true, "s1");
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static final float m198b(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.001f;
        }
        if (f <= -0.001f || f >= 0.001f) {
            return f;
        }
        return 0.001f;
    }

    /* JADX INFO: renamed from: b */
    static int m199b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: b */
    static String m200b(int i) {
        int iM167a = (int) ((m167a(i) * 3.597f) / 1.5f);
        return iM167a == 0 ? "-" : new StringBuffer().append(iM167a).append("").toString();
    }

    /* JADX INFO: renamed from: b */
    public static final String m201b(String str) {
        byte[] bytes = str.getBytes();
        return new String(m193a(bytes, bytes.length));
    }

    /* JADX INFO: renamed from: b */
    static final Image m202b(String str) {
        return m176a(str);
    }

    /* JADX INFO: renamed from: b */
    static void m203b() {
        if (f456a == null) {
            try {
                f456a = RecordStore.openRecordStore("hsrms", true);
            } catch (Exception e) {
                f456a = null;
                RunnableC0008i.m127b(false, "s2");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static final void m204b(int i) {
        System.gc();
        if (i > 0) {
            try {
                Thread.sleep(i);
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static final void m205b(int[] iArr, int i) {
        iArr[3] = i >>> 24;
        int i2 = (i >> 16) & 255;
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        int iMax = Math.max(Math.max(i2, i3), i4);
        int iMin = Math.min(Math.min(i2, i3), i4);
        iArr[1] = (((iMax + iMin) * 360) + 255) / 510;
        if (iMax == iMin) {
            iArr[2] = 0;
            iArr[0] = 240;
            return;
        }
        if (iArr[1] <= 180) {
            iArr[2] = (((iMax - iMin) * 360) + ((iMax + iMin) / 2)) / (iMax + iMin);
        } else {
            iArr[2] = (((iMax - iMin) * 360) + (((510 - iMax) - iMin) / 2)) / ((510 - iMax) - iMin);
        }
        int i5 = (((iMax - i2) * 60) + ((iMax - iMin) / 2)) / (iMax - iMin);
        int i6 = (((iMax - i3) * 60) + ((iMax - iMin) / 2)) / (iMax - iMin);
        int i7 = (((iMax - i4) * 60) + ((iMax - iMin) / 2)) / (iMax - iMin);
        if (i2 == iMax) {
            iArr[0] = i7 - i6;
        } else if (i3 == iMax) {
            iArr[0] = (i5 + 120) - i7;
        } else {
            iArr[0] = (i6 + 240) - i5;
        }
        if (iArr[0] < 0) {
            iArr[0] = iArr[0] + 360;
        }
        if (iArr[0] > 360) {
            iArr[0] = iArr[0] - 360;
        }
    }

    /* JADX INFO: renamed from: b */
    static byte[] m206b(int i) {
        if (f456a == null) {
            return null;
        }
        try {
            return f456a.getRecord(i);
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m207b(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m160a(str.charAt(i));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static final float m208c(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.0f;
        }
        if (f <= -0.001f || f >= 0.001f) {
            return f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    static int m209c(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 90) {
            return (i - 65) + 10;
        }
        if (i < 97 || i > 122) {
            return 0;
        }
        return (i - 97) + 10;
    }

    /* JADX INFO: renamed from: c */
    static String m210c(int i) {
        int i2 = i / 60000;
        int i3 = (i - (60000 * i2)) / 1000;
        C0006g.m68a(i2);
        C0006g.m86b(':');
        if (i3 < 10) {
            C0006g.m86b('0');
        }
        C0006g.m87b(i3);
        return C0006g.m71a();
    }

    /* JADX INFO: renamed from: c */
    static void m211c() {
        if (f456a != null) {
            try {
                f456a.closeRecordStore();
            } catch (Exception e) {
                RunnableC0008i.m127b(false, "s3");
            } finally {
                f456a = null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m212d(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        int i = 0;
        if (f < 0.0f) {
            f2 = -f;
            z = true;
        } else {
            z = false;
            f2 = f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f / f2;
        } else {
            z2 = false;
        }
        while (f2 > f453a / 12.0f) {
            i++;
            f2 = (1.0f / (f2 + 1.7320508f)) * ((f2 * 1.7320508f) - 1.0f);
        }
        float f3 = f2 * f2;
        float f4 = (((0.5591371f / (1.4087812f + f3)) + 0.6031058f) - (f3 * 0.05160454f)) * f2;
        while (i > 0.0f) {
            f4 += f453a / 6.0f;
            i--;
        }
        float f5 = z2 ? (f453a / 2.0f) - f4 : f4;
        return z ? -f5 : f5;
    }

    /* JADX INFO: renamed from: d */
    static void m213d() {
        if (C0004e.f132a[0]) {
            return;
        }
        C0000a.f22b = RunnableC0008i.m112a(new String(C0013n.f480a), (f454a + C0000a.f7a) >> 1);
        C0004e.f132a[0] = true;
    }

    /* JADX INFO: renamed from: e */
    static void m214e() {
        C0006g.m95d();
        m204b(200);
    }

    /* JADX INFO: renamed from: f */
    static final void m215f() {
        int i = 0;
        char c = 'A';
        while (c <= 'Z') {
            f458a[i] = c;
            c = (char) (c + 1);
            i++;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            f458a[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = '0';
        while (c3 <= '9') {
            f458a[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        f458a[i] = '+';
        f458a[i + 1] = '/';
    }
}
