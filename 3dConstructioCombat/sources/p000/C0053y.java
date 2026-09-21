package p000;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0053y {

    /* JADX INFO: renamed from: a */
    public static C0053y f551a = null;

    /* JADX INFO: renamed from: c */
    public boolean f553c;

    /* JADX INFO: renamed from: d */
    public Hashtable f554d = new Hashtable();

    /* JADX INFO: renamed from: e */
    public Hashtable f555e = new Hashtable();

    /* JADX INFO: renamed from: b */
    public boolean f552b = true;

    /* JADX INFO: renamed from: a */
    private C0012al m337a(String str) {
        return (C0012al) this.f555e.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static C0053y m338a() {
        if (f551a == null) {
            f551a = new C0053y();
        }
        return f551a;
    }

    /* JADX INFO: renamed from: e */
    private void m339e() {
        Enumeration enumerationElements = this.f555e.elements();
        while (enumerationElements.hasMoreElements()) {
            C0012al c0012al = (C0012al) enumerationElements.nextElement();
            try {
                c0012al.f114a.stop();
                c0012al.f114a.deallocate();
                c0012al.f114a.close();
            } catch (Exception e) {
            } finally {
                c0012al.f114a = null;
            }
        }
        this.f555e.clear();
    }

    /* JADX INFO: renamed from: a */
    public final C0012al m340a(String str, String str2, String str3) throws Exception {
        C0012al c0012al = (C0012al) this.f555e.get(str);
        if (c0012al == null) {
            c0012al = new C0012al();
            if (str3.equals("audio/midi")) {
                Player playerCreatePlayer = Manager.createPlayer(getClass().getResourceAsStream(str2), str3);
                playerCreatePlayer.realize();
                c0012al.f114a = playerCreatePlayer;
            }
            c0012al.f117d = str2;
            c0012al.f118e = str3;
            this.f555e.put(str, c0012al);
        }
        return c0012al;
    }

    /* JADX INFO: renamed from: a */
    public final void m341a(String str, boolean z) {
        Player player;
        int i;
        C0012al c0012alM337a = m337a(str);
        if (c0012alM337a == null) {
            throw new RuntimeException(new StringBuffer().append(str).append(" not cached").toString());
        }
        if (c0012alM337a.f118e.equals("audio/midi")) {
            try {
                c0012alM337a.f116c = z;
                if (this.f552b) {
                    C0012al c0012al = (C0012al) this.f554d.put(c0012alM337a.f114a.getContentType(), c0012alM337a);
                    if (c0012al != null) {
                        c0012al.f114a.deallocate();
                    }
                    if (c0012alM337a.f114a != null) {
                        c0012alM337a.f114a.close();
                    }
                    c0012alM337a.f114a = Manager.createPlayer(getClass().getResourceAsStream(c0012alM337a.f117d), c0012alM337a.f118e);
                    c0012alM337a.f114a.realize();
                    if (c0012alM337a.f116c) {
                        i = -1;
                        player = c0012alM337a.f114a;
                    } else {
                        player = c0012alM337a.f114a;
                        i = 1;
                    }
                    player.setLoopCount(i);
                    if (!this.f553c) {
                        c0012alM337a.f115b = true;
                    } else {
                        c0012alM337a.f114a.prefetch();
                        c0012alM337a.f114a.start();
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m342a(boolean z) {
        this.f552b = z;
        if (!this.f552b) {
            Enumeration enumerationElements = this.f555e.elements();
            while (enumerationElements.hasMoreElements()) {
                C0012al c0012al = (C0012al) enumerationElements.nextElement();
                try {
                    c0012al.f114a.stop();
                    c0012al.f114a.deallocate();
                } catch (Exception e) {
                }
            }
            return;
        }
        Enumeration enumerationElements2 = this.f555e.elements();
        while (enumerationElements2.hasMoreElements()) {
            C0012al c0012al2 = (C0012al) enumerationElements2.nextElement();
            if (c0012al2.f116c) {
                if (this.f553c) {
                    try {
                        c0012al2.f114a.prefetch();
                        c0012al2.f114a.start();
                    } catch (Exception e2) {
                    }
                } else {
                    c0012al2.f115b = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m343b() {
        this.f554d.clear();
        m339e();
    }

    /* JADX INFO: renamed from: c */
    public final void m344c() {
        Player player;
        int i;
        this.f553c = true;
        if (this.f552b) {
            Enumeration enumerationElements = this.f555e.elements();
            while (enumerationElements.hasMoreElements()) {
                C0012al c0012al = (C0012al) enumerationElements.nextElement();
                try {
                    if (c0012al.f115b || c0012al.f116c) {
                        if (c0012al.f114a != null) {
                            c0012al.f114a.close();
                        }
                        c0012al.f114a = Manager.createPlayer(getClass().getResourceAsStream(c0012al.f117d), c0012al.f118e);
                        c0012al.f114a.realize();
                        c0012al.f114a.prefetch();
                        if (c0012al.f116c) {
                            player = c0012al.f114a;
                            i = -1;
                        } else {
                            player = c0012al.f114a;
                            i = 1;
                        }
                        player.setLoopCount(i);
                        c0012al.f114a.start();
                        c0012al.f115b = false;
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m345d() {
        this.f553c = false;
        if (this.f552b) {
            Enumeration enumerationElements = this.f555e.elements();
            while (enumerationElements.hasMoreElements()) {
                C0012al c0012al = (C0012al) enumerationElements.nextElement();
                try {
                    c0012al.f115b = c0012al.f114a.getState() == 400 || c0012al.f116c;
                    c0012al.f114a.stop();
                    c0012al.f114a.deallocate();
                } catch (Exception e) {
                }
            }
        }
    }
}
