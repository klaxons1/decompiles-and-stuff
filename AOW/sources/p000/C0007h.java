package p000;

import java.io.InputStream;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class C0007h {

    /* JADX INFO: renamed from: a */
    MIDlet f552a;

    /* JADX INFO: renamed from: e */
    private RunnableC0002c f554e;

    /* JADX INFO: renamed from: i */
    String[] f557i;

    /* JADX INFO: renamed from: q */
    String f563q;

    /* JADX INFO: renamed from: g */
    String[] f555g = {"AOW 2 - Global Conf.", "", "42", "Футбольный менеджер", "", "46", "Первобытные Войны", "", "00", "Первобытный Парк", "", "02", "Карта Москвы и Метро", "", "03", "Карта Питера и Метро", "", "04", "Любимым 2", "", "56"};

    /* JADX INFO: renamed from: l */
    String f558l = "http://wap.gear-games.com/?s=aow22";

    /* JADX INFO: renamed from: m */
    String f559m = "";

    /* JADX INFO: renamed from: n */
    private String f560n = "";

    /* JADX INFO: renamed from: o */
    private String f561o = "";

    /* JADX INFO: renamed from: h */
    String[] f556h = {"1161", "731131", "2.99 ye"};

    /* JADX INFO: renamed from: T */
    private boolean f549T = false;

    /* JADX INFO: renamed from: U */
    private boolean f550U = true;

    /* JADX INFO: renamed from: V */
    private boolean f551V = true;

    /* JADX INFO: renamed from: cj */
    int f553cj = 0;

    /* JADX INFO: renamed from: p */
    String f562p = "";

    public C0007h(MIDlet mIDlet, RunnableC0002c runnableC0002c) {
        this.f552a = mIDlet;
        this.f554e = runnableC0002c;
    }

    /* JADX INFO: renamed from: aO */
    final void m222aO() {
        int length;
        try {
            String string = "";
            int length2 = "MIDlet-Jar-URL".length();
            InputStream resourceAsStream = getClass().getResourceAsStream("/META-INF/MANIFEST.MF");
            if (resourceAsStream != null) {
                while (true) {
                    int i = resourceAsStream.read();
                    if (i == -1) {
                        break;
                    }
                    if (i == 10) {
                        if (string.length() > length2 && string.substring(0, length2).equals("MIDlet-Jar-URL")) {
                            this.f550U = false;
                        }
                        string = "";
                    } else {
                        string = new StringBuffer().append(string).append((char) (i & 255)).toString();
                    }
                }
                resourceAsStream.close();
            } else {
                this.f550U = true;
            }
        } catch (Exception e) {
            this.f550U = true;
        }
        String lowerCase = "";
        this.f551V = false;
        try {
            lowerCase = this.f552a.getAppProperty("MIDlet-Jar-URL").toLowerCase();
            length = lowerCase.length();
        } catch (Exception e2) {
            length = 0;
        }
        if (this.f557i != null) {
            loop1: for (int i2 = 0; i2 < this.f557i.length; i2++) {
                int length3 = this.f557i[i2].length() + 1;
                for (int i3 = 0; i3 < length - length3; i3++) {
                    if (lowerCase.substring(i3, i3 + length3).equals(new StringBuffer().append(this.f557i[i2]).append("/").toString())) {
                        int i4 = 1;
                        while (true) {
                            if (i4 >= i3) {
                                this.f551V = true;
                                break loop1;
                            } else if (lowerCase.charAt(i4) == '/' && lowerCase.charAt(i4 - 1) != '/' && lowerCase.charAt(i4 - 1) != ':') {
                                break loop1;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
            }
        }
        this.f549T = (this.f550U && this.f551V) ? false : true;
        try {
            this.f559m = this.f552a.getAppProperty("Wap-Link");
        } catch (Exception e3) {
        }
        try {
            this.f552a.getAppProperty("Short-Number");
            this.f552a.getAppProperty("Payment-Text");
            this.f561o = this.f552a.getAppProperty("Code");
        } catch (Exception e4) {
        }
        try {
            this.f552a.getAppProperty("Partner-Code");
        } catch (Exception e5) {
        }
        this.f556h[0] = Integer.toString(1161);
        if (this.f549T) {
            this.f556h[1] = "gg";
        } else {
            this.f556h[1] = this.f561o;
        }
        for (int i5 = 0; i5 < this.f555g.length / 3; i5++) {
            this.f555g[(i5 * 3) + 1] = this.f556h[0];
            this.f555g[(i5 * 3) + 2] = new StringBuffer("610").append(this.f555g[(i5 * 3) + 2]).append(" ").append((this.f561o == null || this.f561o.equals("replaced_partner")) ? "gg" : this.f561o).append(" aow22").toString();
        }
        String str = this.f558l;
        this.f559m = str;
        this.f560n = str;
        if (this.f559m == null || this.f559m.length() < 2) {
            this.f559m = this.f558l;
        }
        if (this.f560n == null || this.f560n.length() < 2) {
            this.f560n = "Skachal zdes' horoshie igri i poleznie prilojeniya - http://wap.gear-games.com/";
        }
        if (this.f556h[0] == null || this.f556h[1] == null || this.f556h[0].length() < 2 || this.f556h[1].length() < 2) {
            this.f556h[0] = Integer.toString(1161);
            this.f556h[1] = "gg";
        }
        if (this.f556h[2] == null || this.f556h[2].length() < 2) {
            this.f556h[2] = "2.99 ye";
        }
        if (this.f555g[2] == null || this.f555g[2].length() < 2) {
            this.f555g[2] = "07";
            this.f555g[5] = "00";
            this.f555g[8] = "02";
            this.f555g[11] = "03";
            this.f555g[14] = "04";
            for (int i6 = 0; i6 < this.f555g.length / 3; i6++) {
                this.f555g[(i6 * 3) + 1] = Integer.toString(1161);
                this.f555g[(i6 * 3) + 2] = new StringBuffer("610").append(this.f555g[(i6 * 3) + 2]).append(" gg aow22").toString();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    final boolean m223d(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        RunnableC0002c runnableC0002c = this.f554e;
        runnableC0002c.f50b = (byte) (runnableC0002c.f50b + runnableC0002c.f66d[runnableC0002c.f44a[0] + 35]);
        String property = C0010k.getProperty("microedition.platform");
        if (property == null) {
            property = "";
        }
        StringBuffer stringBufferAppend = stringBuffer.append(property);
        C0006g c0006g = this.f554e.f36a;
        RunnableC0002c runnableC0002c2 = c0006g.f519d;
        runnableC0002c2.f57c = (byte) (c0006g.f365aB[c0006g.f546p[0] + 36] + runnableC0002c2.f57c);
        String property2 = C0010k.getProperty("video.encodings");
        if (property2 == null) {
            property2 = "";
        }
        this.f563q = stringBufferAppend.append(property2).toString();
        this.f553cj = 0;
        for (int i2 = 0; i2 < this.f563q.length(); i2++) {
            int i3 = this.f553cj;
            C0005f c0005f = this.f554e.f35a;
            String str = this.f563q;
            c0005f.f264c.f64d = (byte) ((c0005f.f264c.f64d + 1) & 63);
            this.f553cj = i3 ^ (str.charAt(i2) << (i2 % 24));
        }
        this.f554e.f36a.m212aN();
        return this.f553cj == i;
    }
}
