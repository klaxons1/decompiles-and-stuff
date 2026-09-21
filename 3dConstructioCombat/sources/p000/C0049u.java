package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0049u {

    /* JADX INFO: renamed from: a */
    public C0025ay f528a = new C0025ay();

    /* JADX INFO: renamed from: b */
    public int f529b;

    /* JADX INFO: renamed from: c */
    public short f530c;

    /* JADX INFO: renamed from: d */
    public short f531d;

    /* JADX INFO: renamed from: e */
    public short f532e;

    /* JADX INFO: renamed from: a */
    public static C0049u[] m331a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte[] bArr = new byte[4];
        dataInputStream.read(bArr, 0, 4);
        if (bArr[0] != 84 || bArr[1] != 67 || bArr[2] != 76 || bArr[3] != 84) {
            throw new IOException("Not of TCLT format");
        }
        int i = dataInputStream.readShort();
        C0049u[] c0049uArr = new C0049u[i];
        for (short s = 0; s < i; s = (short) (s + 1)) {
            C0049u c0049u = new C0049u();
            c0049uArr[s] = c0049u;
            c0049u.f528a.f249a = dataInputStream.readInt();
            c0049u.f528a.f250b = dataInputStream.readInt();
            c0049u.f528a.f251c = dataInputStream.readInt();
            c0049u.f529b = dataInputStream.readInt();
            c0049u.f530c = dataInputStream.readShort();
            c0049u.f531d = dataInputStream.readShort();
            dataInputStream.readShort();
            c0049u.f532e = dataInputStream.readShort();
        }
        return c0049uArr;
    }
}
