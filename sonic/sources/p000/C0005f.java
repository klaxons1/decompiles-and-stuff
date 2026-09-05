package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public final class C0005f {

    /* JADX INFO: renamed from: a */
    private static int f37a;

    /* JADX INFO: renamed from: a */
    private static DataInputStream f38a;

    /* JADX INFO: renamed from: a */
    private static Hashtable f39a;

    /* JADX INFO: renamed from: a */
    private static int[] f40a;

    /* JADX INFO: renamed from: b */
    private static int f41b = -1;

    /* JADX INFO: renamed from: b */
    private static int[] f42b;

    /* JADX INFO: renamed from: a */
    public static DataInputStream m21a(int i) {
        return new DataInputStream(new ByteArrayInputStream(m24a(i)));
    }

    /* JADX INFO: renamed from: a */
    private static void m22a(int i) {
        if (f41b != -1) {
            f41b = -1;
            f40a = null;
            f42b = null;
            try {
                if (f38a != null) {
                    f38a.close();
                    f38a = null;
                }
            } catch (Exception e) {
            }
        }
        f41b = i;
        f38a = new DataInputStream(RunnableC0010k.f216a.getClass().getResourceAsStream(new StringBuffer().append("/").append(i).append(".pak").toString()));
        try {
            int i2 = f38a.readShort();
            f40a = new int[i2];
            f42b = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                f38a.readInt();
                f40a[i3] = f38a.readInt();
                f42b[i3] = f38a.readInt();
            }
            f37a = (i2 * 12) + 2;
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23a(int i) {
        return f39a.containsKey(new Integer(i));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m24a(int i) {
        byte[] bArrM26a;
        if (i == -1) {
            return null;
        }
        if (f39a == null) {
            f39a = new Hashtable();
        }
        byte[] bArr = (byte[]) f39a.get(new Integer(i));
        if (bArr != null) {
            return bArr;
        }
        int i2 = i & 65535;
        int i3 = (i >> 16) & 65535;
        try {
            if (i3 == 0) {
                bArrM26a = m26a(new StringBuffer().append(i2).append(".res").toString(), true);
            } else {
                if (f41b != i3) {
                    m22a(i3);
                }
                int i4 = f40a[i2];
                int i5 = f42b[i2];
                if (f38a == null || f37a > i4) {
                    f38a.close();
                    f38a = null;
                    DataInputStream dataInputStream = new DataInputStream(RunnableC0010k.f216a.getClass().getResourceAsStream(new StringBuffer().append("/").append(i3).append(".pak").toString()));
                    f38a = dataInputStream;
                    dataInputStream.skipBytes(i4);
                } else if (f37a <= i4) {
                    f38a.skip(i4 - f37a);
                }
                byte[] bArr2 = new byte[i5];
                try {
                    f38a.readFully(bArr2);
                    f37a = i5 + i4;
                    bArrM26a = bArr2;
                } catch (Exception e) {
                    return bArr2;
                }
            }
            try {
                f39a.put(new Integer(i), bArrM26a);
                return bArrM26a;
            } catch (Exception e2) {
                return bArrM26a;
            }
        } catch (Exception e3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m25a(String str) {
        return m26a(str, false);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m26a(String str, boolean z) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream resourceAsStream = RunnableC0010k.f216a.getClass().getResourceAsStream(new StringBuffer().append("/").append(str).toString());
            if (z) {
                resourceAsStream.skip(4L);
            }
            while (true) {
                int i = resourceAsStream.read();
                if (i == -1) {
                    resourceAsStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(i);
            }
        } catch (Exception e) {
            return null;
        }
    }
}
