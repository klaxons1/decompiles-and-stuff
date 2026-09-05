package com.mascotcapsule.eruption.docomostar;

import java.io.IOException;
import java.io.InputStream;
import p000.GameStatus;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.b */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0028b {

    /* JADX INFO: renamed from: c */
    C0066ck f686c;

    /* JADX INFO: renamed from: e */
    int f688e;

    /* JADX INFO: renamed from: a */
    int f684a = 0;

    /* JADX INFO: renamed from: b */
    Object3D[] f685b = null;

    /* JADX INFO: renamed from: d */
    int f687d = 0;

    /* JADX INFO: renamed from: f */
    BufferPool f689f = null;

    /* JADX INFO: renamed from: g */
    BufferPool f690g = null;

    /* JADX INFO: renamed from: h */
    BufferPool f691h = null;

    C0028b() {
    }

    /* JADX INFO: renamed from: a */
    static int m414a(C0028b c0028b, InputStream inputStream) {
        return (int) c0028b.m420c(inputStream);
    }

    /* JADX INFO: renamed from: a */
    private short m415a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1];
        inputStream.read(bArr, 0, 1);
        int i = bArr[0] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
        this.f687d++;
        return (short) i;
    }

    /* JADX INFO: renamed from: a */
    static void m416a(C0028b c0028b, InputStream inputStream, C0004ac c0004ac) {
        c0004ac.f557a = (int) c0028b.m420c(inputStream);
        c0004ac.f558b = (int) c0028b.m420c(inputStream);
        c0004ac.f559c = (int) c0028b.m420c(inputStream);
        c0004ac.f560d = (int) c0028b.m420c(inputStream);
    }

    /* JADX INFO: renamed from: a */
    static void m417a(C0028b c0028b, int[] iArr, InputStream inputStream) {
        c0028b.f686c = new C0066ck(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            int iM418b = c0028b.m418b(inputStream);
            c0028b.f686c.f803b[i] = iM418b;
            c0028b.f686c.f804c[i] = new AbstractC0032bd[iM418b];
            for (int i2 = 0; i2 < iM418b; i2++) {
                AbstractC0032bd c0024aw = null;
                switch (iArr[i]) {
                    case 0:
                        c0024aw = new C0125x();
                        break;
                    case 1:
                        c0024aw = new C0027az();
                        break;
                    case 2:
                        c0024aw = new C0110i();
                        break;
                    case 3:
                        c0024aw = new C0081cz();
                        break;
                    case 4:
                        c0024aw = new C0040bl();
                        break;
                    case 5:
                        new C0050bv();
                    case 6:
                        c0024aw = new C0010ai();
                        break;
                    case 7:
                        c0024aw = new C0018aq();
                        break;
                    case 8:
                        c0024aw = new C0063ch();
                        break;
                    case 9:
                        c0024aw = new C0068cm();
                        break;
                    case 10:
                        c0024aw = new C0022au();
                        break;
                    case 11:
                        c0024aw = new C0095dm();
                        break;
                    case 12:
                        c0024aw = new C0115n();
                        break;
                    case 13:
                        c0024aw = new C0024aw();
                        break;
                }
                if (c0024aw != null) {
                    c0024aw.mo395a(c0028b, inputStream);
                    c0028b.f686c.f804c[i][i2] = c0024aw;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private int m418b(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[2];
        inputStream.read(bArr, 0, 2);
        int i = ((bArr[1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8) + (bArr[0] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
        this.f687d += 2;
        return i;
    }

    /* JADX INFO: renamed from: b */
    static long m419b(C0028b c0028b, InputStream inputStream) {
        return c0028b.m420c(inputStream);
    }

    /* JADX INFO: renamed from: c */
    private long m420c(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        inputStream.read(bArr, 0, 4);
        long j = ((bArr[3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24) + ((bArr[2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16) + ((bArr[1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8) + (bArr[0] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
        this.f687d += 4;
        return j;
    }

    /* JADX INFO: renamed from: c */
    static short m421c(C0028b c0028b, InputStream inputStream) {
        return c0028b.m415a(inputStream);
    }

    /* JADX INFO: renamed from: d */
    static byte m422d(C0028b c0028b, InputStream inputStream) {
        return (byte) c0028b.m415a(inputStream);
    }

    /* JADX INFO: renamed from: d */
    private float m423d(InputStream inputStream) {
        return Float.intBitsToFloat((int) m420c(inputStream));
    }

    /* JADX INFO: renamed from: e */
    static short m424e(C0028b c0028b, InputStream inputStream) {
        return (short) c0028b.m418b(inputStream);
    }

    /* JADX INFO: renamed from: f */
    static float m425f(C0028b c0028b, InputStream inputStream) {
        return c0028b.m423d(inputStream);
    }

    /* JADX INFO: renamed from: g */
    static int m426g(C0028b c0028b, InputStream inputStream) {
        return c0028b.m418b(inputStream);
    }

    /* JADX INFO: renamed from: h */
    static Vector3D m427h(C0028b c0028b, InputStream inputStream) {
        return new Vector3D(c0028b.m423d(inputStream), c0028b.m423d(inputStream), c0028b.m423d(inputStream));
    }

    /* JADX INFO: renamed from: i */
    static int m428i(C0028b c0028b, InputStream inputStream) {
        return c0028b.m418b(inputStream);
    }
}
