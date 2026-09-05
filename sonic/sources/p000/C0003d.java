package p000;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public final class C0003d {

    /* JADX INFO: renamed from: a */
    private static int f17a;

    /* JADX INFO: renamed from: a */
    public static int[] f18a;

    /* JADX INFO: renamed from: a */
    private static boolean[] f19a;

    /* JADX INFO: renamed from: a */
    public static byte[][] f20a;

    /* JADX INFO: renamed from: a */
    public static C0006g[][] f21a;

    /* JADX INFO: renamed from: b */
    public static int[] f22b;

    /* JADX INFO: renamed from: c */
    public static int[] f23c;

    /* JADX INFO: renamed from: d */
    public static int[] f24d;

    /* JADX INFO: renamed from: e */
    private static int[] f25e;

    /* JADX INFO: renamed from: a */
    public static int m7a() {
        if (f17a == 0) {
            System.gc();
            f18a = new int[15];
            f20a = new byte[15][];
            f21a = new C0006g[15][];
            f22b = new int[15];
            f23c = new int[15];
            f24d = new int[15];
            f25e = new int[15];
            f19a = new boolean[15];
        }
        for (int i = 0; i < 15; i++) {
            if (!f19a[i]) {
                f19a[i] = true;
                f17a++;
                return i;
            }
        }
        System.out.println("increase Animator.INITIAL_ANIMATORS!");
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m8a() {
        f17a = 0;
        f18a = null;
        f20a = null;
        f21a = null;
        f22b = null;
        f23c = null;
        f24d = null;
        f25e = null;
        f19a = null;
        System.gc();
    }

    /* JADX INFO: renamed from: a */
    public static void m9a(int i) {
        f19a[i] = false;
        f17a--;
    }

    /* JADX INFO: renamed from: a */
    public static void m10a(int i, int i2) {
        f18a[i] = i2;
        f20a[i] = null;
        int[] iArr = f23c;
        f22b[i] = 0;
        iArr[i] = 0;
        int[] iArr2 = f24d;
        f25e[i] = 1;
        iArr2[i] = 1;
    }

    /* JADX INFO: renamed from: a */
    public static void m11a(int i, C0006g[] c0006gArr) {
        m10a(i, c0006gArr.length);
        f25e[i] = 0;
        f21a[i] = c0006gArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m12a(int i, C0006g[] c0006gArr, int i2) {
        if (c0006gArr == f21a[i]) {
            return;
        }
        m14b(i, c0006gArr, 1);
    }

    /* JADX INFO: renamed from: b */
    public static void m13b(int i) {
        int[] iArr = f25e;
        int i2 = iArr[i] - 1;
        iArr[i] = i2;
        if (i2 <= 0) {
            int[] iArr2 = f22b;
            iArr2[i] = iArr2[i] + 1;
            if (f22b[i] == f18a[i]) {
                f22b[i] = 0;
            }
            f25e[i] = f24d[i];
            int i3 = f22b[i];
            if (f20a[i] == null) {
                f23c[i] = i3;
            } else {
                f23c[i] = f20a[i][i3];
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m14b(int i, C0006g[] c0006gArr, int i2) {
        m10a(i, c0006gArr.length);
        f24d[i] = i2;
        f25e[i] = i2;
        f21a[i] = c0006gArr;
    }
}
