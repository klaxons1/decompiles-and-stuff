package p000;

import com.lightningtoads.jdropscape.Dropscape;

/* JADX INFO: renamed from: aq */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0017aq extends C0052x implements InterfaceC0018ar {

    /* JADX INFO: renamed from: a */
    public C0030bc f226a;

    /* JADX INFO: renamed from: b */
    public C0052x f227b;

    /* JADX INFO: renamed from: c */
    public C0052x f228c;

    /* JADX INFO: renamed from: d */
    public C0046r f229d;

    public C0017aq(C0030bc c0030bc) {
        super(C0026az.m177a(C0026az.f265N), new String[]{C0026az.m177a(C0026az.f261J), C0026az.m177a(C0026az.f263L), C0026az.m177a(C0026az.f268Q), C0026az.m177a(C0026az.f310k)}, null);
        this.f549s = this;
        this.f226a = c0030bc;
        this.f227b = new C0052x(C0026az.m177a(C0026az.f268Q), new String[]{C0026az.m177a(C0026az.f269R), C0026az.m177a(C0026az.f270S), C0026az.m177a(C0026az.f271T), C0026az.m177a(C0026az.f310k)}, this);
        this.f228c = new C0052x(C0026az.m177a(C0026az.f272U), new String[]{C0026az.m177a(C0026az.f306g)}, this);
        this.f229d = new C0046r(this);
    }

    /* JADX INFO: renamed from: a */
    private void m160a(boolean z) {
        String str;
        String str2;
        if (z) {
            this.f548r[0] = C0026az.m177a(C0026az.f261J);
            this.f226a.m208b().m141a(Dropscape.f390h);
            str = "Constructo-Sound";
            str2 = "on";
        } else {
            this.f548r[0] = C0026az.m177a(C0026az.f262K);
            this.f226a.m208b().m141a(Dropscape.f391i);
            str = "Constructo-Sound";
            str2 = "off";
        }
        C0026az.m179a(str, str2);
    }

    /* JADX INFO: renamed from: b */
    private void m161b(boolean z) {
        String str;
        String str2;
        if (z) {
            this.f548r[1] = C0026az.m177a(C0026az.f263L);
            this.f226a.m208b().m141a(Dropscape.f392j);
            str = "Constructo-Vibrate";
            str2 = "on";
        } else {
            this.f548r[1] = C0026az.m177a(C0026az.f264M);
            this.f226a.m208b().m141a(Dropscape.f393k);
            str = "Constructo-Vibrate";
            str2 = "off";
        }
        C0026az.m179a(str, str2);
    }

    /* JADX INFO: renamed from: c */
    private void m162c() {
        C0013am c0013amM99k = C0013am.m99k();
        String strM178a = C0026az.m178a("Constructo-Bindings");
        if (strM178a == null) {
            m164j();
            return;
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int iIndexOf = strM178a.indexOf(44, i2);
            if (iIndexOf == -1) {
                iIndexOf = strM178a.length();
                z = false;
            }
            c0013amM99k.m109a(Integer.parseInt(strM178a.substring(i2, iIndexOf)), i);
            i2 = iIndexOf + 1;
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m163i() {
        C0013am c0013amM99k = C0013am.m99k();
        String str = "";
        int i = 0;
        while (i < 9) {
            String string = new StringBuffer().append(str).append(c0013amM99k.m127e(i)).toString();
            if (i != 8) {
                string = new StringBuffer().append(string).append(',').toString();
            }
            i++;
            str = string;
        }
        C0026az.m179a("Constructo-Bindings", str);
    }

    /* JADX INFO: renamed from: j */
    private static void m164j() {
        C0013am c0013amM99k = C0013am.m99k();
        c0013amM99k.m109a(1, 0);
        c0013amM99k.m109a(6, 1);
        c0013amM99k.m109a(2, 2);
        c0013amM99k.m109a(5, 3);
        c0013amM99k.m109a(51, 4);
        c0013amM99k.m109a(49, 5);
        c0013amM99k.m109a(54, 6);
        c0013amM99k.m109a(52, 7);
        c0013amM99k.m109a(8, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [bc] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v4, types: [x] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // p000.InterfaceC0018ar
    /* JADX INFO: renamed from: a */
    public final void mo116a(C0052x c0052x, int i) {
        ?? r4;
        ?? r0;
        if (c0052x != this) {
            if (c0052x == this.f227b) {
                if (i == 0) {
                    this.f229d.m316b();
                    r0 = this.f226a;
                    r4 = this.f229d;
                } else if (i == 1) {
                    this.f229d.m317c();
                    r0 = this.f226a;
                    r4 = this.f229d;
                } else if (i == 2) {
                    m164j();
                    m163i();
                    r0 = this.f226a;
                    r4 = this.f228c;
                } else {
                    if (i != 3) {
                        return;
                    }
                    r0 = this.f226a;
                    this = this;
                }
            } else if (c0052x != this.f228c) {
                if (c0052x != this.f229d) {
                    return;
                }
                if (i == 1) {
                    for (int i2 = 0; i2 < this.f229d.f513e.length; i2++) {
                        C0013am.m99k().m109a(this.f229d.f513e[i2], i2);
                    }
                    m163i();
                }
            }
            r0.m206a(r4);
        }
        if (i == 0) {
            if (this.f548r[0] == C0026az.m177a(C0026az.f261J)) {
                m160a(false);
                return;
            } else {
                m160a(true);
                return;
            }
        }
        if (i == 1) {
            if (this.f548r[1] == C0026az.m177a(C0026az.f263L)) {
                m161b(false);
                return;
            } else {
                m161b(true);
                return;
            }
        }
        if (i != 2) {
            this.f226a.mo116a(this, -1);
            return;
        }
        r0 = this.f226a;
        r4 = this.f227b;
        r0.m206a(r4);
    }

    /* JADX INFO: renamed from: b */
    public final void m165b() {
        boolean z = false;
        String strM178a = C0026az.m178a("Constructo-Sound");
        m160a(strM178a == null || !strM178a.equals("off"));
        String strM178a2 = C0026az.m178a("Constructo-Vibrate");
        if (strM178a2 == null || !strM178a2.equals("off")) {
            z = true;
        }
        m161b(z);
        String strM178a3 = C0026az.m178a("Constructo-Detail");
        if (strM178a3 != null) {
            strM178a3.equals("low");
        }
        m162c();
    }
}
