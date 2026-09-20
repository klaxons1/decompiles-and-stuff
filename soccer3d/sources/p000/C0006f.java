package p000;

import com.nokia.mid.appl.socr.C0003a;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: C:\Temp\jadx-9991838165078942717\classes.dex */
public class C0006f {

    /* JADX INFO: renamed from: b */
    private short[] f278b;

    /* JADX INFO: renamed from: c */
    private String[] f279c;

    /* JADX INFO: renamed from: d */
    private short[] f280d = {137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 150, 151, 152, 153, 154, 0, 2, 3, 4, 8, 9, 10, 11, 13, 14, 16, 17, 18, 19, 21, 22, 23, 24, 25, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 52, 58, 59, 60, 62, 64, 65, 66, 67, 68, 69, 70, 71, 73, 74, 75, 76, 78, 79, 80, 85, 86, 87, 88, 89, 90, 91, 92, 103, 114, 120, 121, 122, 123, 124, 125, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 115, 116, 117, 127, 135, 136, 128, 130, 129, 131, 132, 133, 134, 20, 27, 28, 81, 84, 82, 83, 53, 15, 54, 57, 12, 61, 63, 72, 7, 6, 5, 126, 55, 56, 51, 50, 26, 77, 149, 1, 118, 119};

    /* JADX INFO: renamed from: a */
    private int f277a = 0;

    public C0006f() {
        m165b();
    }

    /* JADX INFO: renamed from: a */
    private short m164a() {
        short s = -1;
        for (int i = 0; i < this.f277a; i++) {
            if (this.f280d[i] > s) {
                s = this.f280d[i];
            }
        }
        return s;
    }

    /* JADX INFO: renamed from: b */
    private void m165b() {
        this.f277a = this.f280d.length;
        this.f279c = new String[this.f277a + 1];
        short sM164a = m164a();
        this.f278b = new short[sM164a + 1];
        for (short s = 0; s < sM164a; s = (short) (s + 1)) {
            this.f278b[s] = -1;
        }
        for (short s2 = 0; s2 < this.f277a; s2 = (short) (s2 + 1)) {
            short s3 = this.f280d[s2];
            this.f279c[s2] = C0003a.m14a(s3);
            this.f278b[s3] = s2;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m166a(short s) {
        if (s >= this.f278b.length) {
            return "!!!";
        }
        short s2 = this.f278b[s];
        return (s2 <= -1 || s2 >= this.f279c.length) ? "???" : this.f279c[s2];
    }

    /* JADX INFO: renamed from: a */
    public String m167a(short s, String[] strArr) {
        String strM166a = m166a(s);
        if (strArr == null) {
            return strM166a;
        }
        if (strArr.length == 1) {
            return C0003a.m16a(strM166a, "%U", strArr[0]);
        }
        for (int i = 0; i < strArr.length; i++) {
            strM166a = C0003a.m16a(strM166a, new StringBuffer().append("%").append(i).append("U").toString(), strArr[i]);
        }
        return strM166a;
    }
}
