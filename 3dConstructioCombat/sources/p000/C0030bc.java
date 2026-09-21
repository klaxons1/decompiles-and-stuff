package p000;

import com.lightningtoads.jdropscape.Dropscape;
import java.io.IOException;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

/* JADX INFO: renamed from: bc */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0030bc extends AbstractC0043o implements CommandListener, InterfaceC0018ar {

    /* JADX INFO: renamed from: a */
    public static final String[] f340a = {"City", "Farm", "Castle", "Ocean Floor", "The Sun", "City Night", "Farm Night", "Castle Night", "Ocean Night", "Blackhole"};

    /* JADX INFO: renamed from: b */
    public static final String[] f341b = {"/levels/level01/level01.txt", "/levels/level02/level02.txt", "/levels/level03/level03.txt", "/levels/level04/level04.txt", "/levels/level05/level05.txt", "/levels/level01/level01n.txt", "/levels/level02/level02n.txt", "/levels/level03/level03n.txt", "/levels/level04/level04n.txt", "/levels/level05/level05n.txt"};

    /* JADX INFO: renamed from: A */
    public Image f342A;

    /* JADX INFO: renamed from: B */
    public Command f343B;

    /* JADX INFO: renamed from: C */
    public Command f344C;

    /* JADX INFO: renamed from: D */
    public Command f345D;

    /* JADX INFO: renamed from: E */
    public boolean f346E;

    /* JADX INFO: renamed from: F */
    public Font f347F;

    /* JADX INFO: renamed from: G */
    public Font f348G;

    /* JADX INFO: renamed from: H */
    public long f349H;

    /* JADX INFO: renamed from: I */
    public Image f350I;

    /* JADX INFO: renamed from: J */
    public Image f351J;

    /* JADX INFO: renamed from: c */
    public Alert f352c;

    /* JADX INFO: renamed from: d */
    public C0052x f353d;

    /* JADX INFO: renamed from: e */
    public C0052x f354e;

    /* JADX INFO: renamed from: f */
    public C0017aq f355f;

    /* JADX INFO: renamed from: g */
    public C0052x f356g;

    /* JADX INFO: renamed from: h */
    public C0052x f357h;

    /* JADX INFO: renamed from: i */
    public RunnableC0011ak f358i;

    /* JADX INFO: renamed from: j */
    public RunnableC0001aa f359j;

    /* JADX INFO: renamed from: k */
    public C0052x f360k;

    /* JADX INFO: renamed from: l */
    public C0052x f361l;

    /* JADX INFO: renamed from: m */
    public C0047s f362m;

    /* JADX INFO: renamed from: n */
    public C0052x f363n;

    /* JADX INFO: renamed from: o */
    public C0052x f364o;

    /* JADX INFO: renamed from: p */
    public C0052x f365p;

    /* JADX INFO: renamed from: q */
    public String f366q;

    /* JADX INFO: renamed from: r */
    public int f367r;

    /* JADX INFO: renamed from: s */
    public int f368s;

    /* JADX INFO: renamed from: t */
    public C0052x f369t;

    /* JADX INFO: renamed from: u */
    public boolean f370u;

    /* JADX INFO: renamed from: v */
    public boolean f371v;

    /* JADX INFO: renamed from: w */
    public boolean f372w;

    /* JADX INFO: renamed from: x */
    public boolean f373x;

    /* JADX INFO: renamed from: y */
    public boolean f374y;

    /* JADX INFO: renamed from: z */
    public Player f375z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030bc(RunnableC0015ao runnableC0015ao) {
        int i;
        super(runnableC0015ao);
        int i2 = 0;
        this.f343B = new Command(C0026az.m177a(C0026az.f301b), 8, 1);
        this.f344C = new Command(C0026az.m177a(C0026az.f302c), 7, 1);
        this.f345D = new Command(C0026az.m177a(C0026az.f304e), 2, 1);
        this.f347F = Font.getFont(32, 1, 16);
        this.f348G = Font.getFont(64, 1, 8);
        this.f353d = new C0052x(null, new String[]{C0026az.m177a(C0026az.f319t), C0026az.m177a(C0026az.f320u), C0026az.m177a(C0026az.f317r), C0026az.m177a(C0026az.f273V), C0026az.m177a(C0026az.f266O), C0026az.m177a(C0026az.f318s)}, this);
        this.f357h = new C0052x(C0026az.m177a(C0026az.f313n), new String[]{C0026az.m177a(C0026az.f312m), C0026az.m177a(C0026az.f311l), C0026az.m177a(C0026az.f310k)}, this);
        this.f358i = new RunnableC0011ak(this);
        this.f359j = new RunnableC0001aa(this);
        this.f354e = new C0052x(C0026az.m177a(C0026az.f316q), new String[]{C0026az.m177a(C0026az.f314o), C0026az.m177a(C0026az.f315p)}, this);
        this.f355f = new C0017aq(this);
        this.f356g = new C0052x(C0026az.m177a(C0026az.f255D), new String[]{C0026az.m177a(C0026az.f314o), C0026az.m177a(C0026az.f315p)}, this);
        this.f360k = new C0052x(C0026az.m177a(C0026az.f307h), new String[]{C0026az.m177a(C0026az.f306g)}, this);
        this.f361l = new C0052x(C0026az.m177a(C0026az.f308i), new String[]{C0026az.m177a(C0026az.f306g)}, this);
        this.f362m = new C0047s(this);
        this.f363n = new C0021au(this);
        m204e();
        int[] iArr = {128, 128, 172, 240};
        int[] iArr2 = {128, 160, 220, 320};
        int iM308l = m308l();
        int iM309m = m309m();
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= iArr.length) {
                break;
            }
            i2 = Math.abs(iArr[i3] - iM308l) + Math.abs(iArr2[i3] - iM309m) <= Math.abs(iArr[i] - iM308l) + Math.abs(iArr2[i] - iM309m) ? i3 : i;
            i3++;
        }
        if (i == 3) {
            C0052x.f536f = 25;
            C0052x.f537g = 150;
        } else if (i == 2) {
            C0052x.f536f = 18;
            C0052x.f537g = 130;
        } else if (i == 1) {
            C0052x.f536f = 16;
            C0052x.f537g = 120;
        } else {
            C0052x.f536f = 14;
            C0052x.f537g = 120;
        }
        try {
            this.f350I = Image.createImage("/bg/cs_logo.png");
            this.f351J = Image.createImage("/bg/lt_logo.png");
        } catch (IOException e) {
        }
        this.f349H = 0L;
    }

    /* JADX INFO: renamed from: a */
    private void m201a(int i) {
        this.f367r = i;
        if (this.f364o.f548r.length == 1) {
            mo116a(this.f364o, 0);
        } else {
            m206a(this.f364o);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m202c() {
        this.f352c = new Alert(C0026az.m177a(C0026az.f267P));
        this.f352c.setTimeout(-2);
        this.f352c.setString(C0026az.m176a());
        this.f352c.addCommand(this.f345D);
        this.f352c.setCommandListener(this);
        this.f492aD.f212i.setCurrent(this.f352c);
    }

    /* JADX INFO: renamed from: d */
    private void m203d() {
        this.f352c = null;
        this.f492aD.f212i.setCurrent(this.f492aD);
    }

    /* JADX INFO: renamed from: e */
    private void m204e() {
        C0052x c0052x;
        int i = 0;
        String strM178a = C0026az.m178a("Constructo-MaxLevel");
        int i2 = strM178a != null ? Integer.parseInt(strM178a) : 0;
        int i3 = i2 <= 9 ? i2 : 9;
        if (i3 < this.f368s) {
            i3 = this.f368s;
            C0026az.m179a("Constructo-MaxLevel", new StringBuffer().append("").append(i3).toString());
        }
        int i4 = i3;
        if (i4 >= 5) {
            String[] strArr = new String[6];
            int i5 = 0;
            while (i5 < 5) {
                strArr[i5] = f340a[i5];
                i5++;
            }
            strArr[i5] = C0026az.m177a(C0026az.f295aq);
            this.f364o = new C0052x(C0026az.m177a(C0026az.f309j), strArr, this);
            String[] strArr2 = new String[(i4 - 5) + 2];
            while (i < (i4 - 5) + 1) {
                strArr2[i] = f340a[i + 5];
                i++;
            }
            strArr2[i] = C0026az.m177a(C0026az.f296ar);
            c0052x = new C0052x(C0026az.m177a(C0026az.f309j), strArr2, this);
        } else {
            String[] strArr3 = new String[i4 + 1];
            for (int i6 = 0; i6 <= i4; i6++) {
                strArr3[i6] = f340a[i6];
            }
            this.f364o = new C0052x(C0026az.m177a(C0026az.f309j), strArr3, this);
            c0052x = null;
        }
        this.f365p = c0052x;
    }

    /* JADX INFO: renamed from: a */
    public final void m205a() {
        if (this.f358i != null) {
            this.f358i.m92c();
        }
        if (this.f359j != null) {
            this.f359j.m11c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: a */
    public final void mo114a(Graphics graphics) {
        Image image;
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int i = clipWidth / 2;
        int i2 = clipHeight / 2;
        graphics.setColor(11851504);
        graphics.fillRect(0, 0, clipWidth, clipHeight);
        if (this.f374y) {
            graphics.setFont(this.f347F);
            graphics.setColor(0);
            graphics.drawString(C0026az.m177a(C0026az.f305f), i, i2 - 10, 17);
            return;
        }
        int i3 = i2 + C0052x.f541k;
        if (this.f350I != null) {
            image = this.f350I;
        } else {
            if (this.f351J == null) {
                if (this.f342A != null) {
                    image = this.f342A;
                }
                graphics.setFont(this.f348G);
                graphics.setColor(0);
                if (this.f369t != null) {
                    graphics.translate(i, i3);
                    this.f369t.m335c(graphics);
                    graphics.translate(-i, -i3);
                }
            }
            image = this.f351J;
        }
        graphics.drawImage(image, i, i2, 3);
        graphics.setFont(this.f348G);
        graphics.setColor(0);
        if (this.f369t != null) {
            graphics.translate(i, i3);
            this.f369t.m335c(graphics);
            graphics.translate(-i, -i3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m206a(C0052x c0052x) {
        if (this.f369t != null) {
            this.f369t.mo14g();
        }
        this.f369t = c0052x;
        this.f369t.m336f();
    }

    @Override // p000.InterfaceC0018ar
    /* JADX INFO: renamed from: a */
    public final void mo116a(C0052x c0052x, int i) {
        C0052x c0052x2;
        C0052x c0052x3;
        C0052x c0052x4;
        C0052x c0052x5;
        int i2;
        C0052x c0052x6;
        if (i == -1) {
            m206a(this.f353d);
        }
        if (c0052x == this.f353d) {
            if (i == 0) {
                if (C0013am.m99k().m126d()) {
                    m206a(this.f354e);
                } else {
                    m201a(2);
                }
            }
            if (i == 1) {
                m206a(this.f357h);
            }
            if (i == 2) {
                c0052x6 = this.f355f;
            } else if (i == 3) {
                c0052x6 = this.f362m;
            } else if (i == 4) {
                m202c();
                return;
            } else if (i != 5) {
                return;
            } else {
                c0052x6 = this.f356g;
            }
            m206a(c0052x6);
            return;
        }
        if (c0052x == this.f354e) {
            if (i == 1) {
                m201a(2);
                C0013am.m99k().m128e();
                C0013am.m99k().m113a(this.f366q);
                return;
            }
            this.f374y = true;
            this.f492aD.m141a(Dropscape.f385c);
        } else {
            if (c0052x != this.f356g) {
                if (c0052x != this.f357h) {
                    if (c0052x != this.f360k && c0052x != this.f362m && c0052x != this.f361l) {
                        if (c0052x == this.f363n) {
                            int i3 = C0013am.m99k().f161al;
                            if (C0013am.m99k().f148aB || this.f368s >= 9 || C0013am.m99k().f163an > C0013am.m99k().f161al) {
                                if (C0013am.m99k().f148aB || !this.f362m.m319c(i3)) {
                                    m206a(this.f353d);
                                    return;
                                } else {
                                    m206a(this.f362m);
                                    return;
                                }
                            }
                            this.f362m.m319c(i3);
                            this.f368s++;
                            m204e();
                            this.f367r = 3;
                            if (this.f368s < 5) {
                                c0052x5 = this.f364o;
                                i2 = this.f368s;
                            } else {
                                c0052x5 = this.f365p;
                                i2 = this.f368s - 5;
                            }
                            mo116a(c0052x5, i2);
                            return;
                        }
                        if (c0052x == this.f364o) {
                            if (i != -1) {
                                this.f368s = i;
                            }
                            if (i >= 0 && i < 5) {
                                this.f366q = f341b[i];
                                switch (this.f367r) {
                                    case 1:
                                        this.f368s = -1;
                                        this.f358i.f113v = this.f366q;
                                        c0052x4 = this.f358i;
                                        break;
                                    case 2:
                                        C0013am.m99k().m128e();
                                        C0013am.m99k().m113a(this.f366q);
                                        this.f374y = true;
                                        this.f492aD.m141a(Dropscape.f384b);
                                        c0052x4 = this.f353d;
                                        break;
                                    case 3:
                                        C0013am.m99k().m128e();
                                        C0013am.m99k().m113a(this.f366q);
                                        this.f374y = true;
                                        this.f492aD.m141a(Dropscape.f385c);
                                        c0052x4 = this.f353d;
                                        break;
                                    default:
                                        this.f368s = -1;
                                        c0052x4 = this.f353d;
                                        break;
                                }
                                m206a(c0052x4);
                                this.f367r = 0;
                                return;
                            }
                            if (i == 5) {
                                c0052x2 = this.f365p;
                            }
                        } else {
                            if (c0052x != this.f365p) {
                                return;
                            }
                            if (i != -1) {
                                this.f368s = i + 5;
                            }
                            if (i >= 0 && i < this.f365p.f548r.length - 1) {
                                this.f366q = f341b[i + 5];
                                switch (this.f367r) {
                                    case 1:
                                        this.f368s = -1;
                                        this.f358i.f113v = this.f366q;
                                        c0052x3 = this.f358i;
                                        break;
                                    case 2:
                                        C0013am.m99k().m128e();
                                        C0013am.m99k().m113a(this.f366q);
                                        this.f374y = true;
                                        this.f492aD.m141a(Dropscape.f384b);
                                        c0052x3 = this.f353d;
                                        break;
                                    case 3:
                                        C0013am.m99k().m128e();
                                        C0013am.m99k().m113a(this.f366q);
                                        this.f374y = true;
                                        this.f492aD.m141a(Dropscape.f385c);
                                        c0052x3 = this.f353d;
                                        break;
                                    default:
                                        this.f368s = -1;
                                        c0052x3 = this.f353d;
                                        break;
                                }
                                m206a(c0052x3);
                                this.f367r = 0;
                                return;
                            }
                            if (i == this.f365p.f548r.length - 1) {
                                c0052x2 = this.f364o;
                            }
                        }
                    }
                    c0052x2 = this.f353d;
                    this = this;
                } else if (i == 0) {
                    m201a(1);
                    return;
                } else if (i == 1) {
                    this.f368s = -1;
                    c0052x2 = this.f359j;
                } else if (i != 2) {
                    return;
                }
                this.m206a(c0052x2);
            }
            if (i == 0) {
                C0013am.m99k().m128e();
                this.f492aD.m141a(Dropscape.f383a);
                this.f374y = true;
                return;
            } else if (i != 1) {
                return;
            }
        }
        c0052x2 = this.f353d;
        this = this;
        this.m206a(c0052x2);
    }

    /* JADX INFO: renamed from: a */
    public final void m207a(boolean z) {
        if (!z) {
            if (this.f375z != null) {
                try {
                    this.f375z.stop();
                    this.f375z.deallocate();
                    this.f375z = null;
                    return;
                } catch (Exception e) {
                    return;
                }
            }
            return;
        }
        try {
            this.f375z = Manager.createPlayer(getClass().getResourceAsStream("/sounds/title.mid"), "audio/midi");
            this.f375z.setLoopCount(-1);
            if (this.f373x) {
                this.f375z.prefetch();
                this.f375z.stop();
                try {
                    this.f375z.setMediaTime(0L);
                } catch (Exception e2) {
                }
                this.f375z.start();
            }
        } catch (Exception e3) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final RunnableC0015ao m208b() {
        return this.f492aD;
    }

    @Override // p000.AbstractC0043o, p000.InterfaceC0051w
    /* JADX INFO: renamed from: b */
    public final void mo119b(int i) {
        this.f349H += (long) i;
        if (this.f349H > 2000 && this.f350I != null) {
            this.f350I = null;
        } else if (this.f349H > 4000 && this.f351J != null) {
            this.f351J = null;
        } else if (this.f349H > 6000 && !this.f346E) {
            m206a(this.f353d);
            this.f346E = true;
        }
        if (this.f369t == null) {
            return;
        }
        if (this.f370u) {
            this.f370u = false;
            this.f369t.mo8a(8);
        } else if (this.f371v) {
            this.f371v = false;
            m206a(this.f356g);
        }
        this.f369t.m333b(i);
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: c */
    public final void mo124c(int i) {
        if (this.f369t == null) {
            return;
        }
        this.f369t.mo8a(i);
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command == this.f344C) {
            this.f371v = true;
        } else if (command == this.f343B) {
            this.f370u = true;
        } else if (command == this.f345D) {
            m203d();
        }
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: d */
    public final void mo125d(int i) {
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: f */
    public final void mo129f() {
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: g */
    public final void mo130g() {
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: h */
    public final void mo131h() {
        C0052x.f539i = 0;
        C0052x.f540j = 2;
        try {
            this.f342A = Image.createImage("/bg/splash.png");
        } catch (Exception e) {
        }
        if (this.f352c != null) {
            this.f492aD.f212i.setCurrent(this.f352c);
        }
        if (!this.f372w) {
            this.f372w = true;
            this.f355f.m165b();
        }
        this.f374y = false;
        this.f373x = true;
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e2) {
        }
        if (this.f375z != null) {
            try {
                this.f375z.deallocate();
                this.f375z.close();
                this.f375z = null;
                this.f375z = Manager.createPlayer(getClass().getResourceAsStream("/sounds/title.mid"), "audio/midi");
                this.f375z.setLoopCount(-1);
                this.f375z.prefetch();
                this.f375z.stop();
                try {
                    this.f375z.setMediaTime(0L);
                } catch (Exception e3) {
                }
                this.f375z.start();
            } catch (Exception e4) {
            }
        }
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: i */
    public final void mo132i() {
        this.f373x = false;
        this.f342A = null;
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
        }
        if (this.f375z != null) {
            try {
                this.f375z.stop();
                this.f375z.deallocate();
            } catch (Exception e2) {
            }
        }
    }

    @Override // p000.AbstractC0043o
    /* JADX INFO: renamed from: j */
    public final void mo133j() {
        if (this.f353d != null) {
            this.f353d.mo15h();
            this.f353d = null;
        }
        if (this.f354e != null) {
            this.f354e.mo15h();
            this.f354e = null;
        }
        if (this.f355f != null) {
            this.f355f.mo15h();
            this.f355f = null;
        }
        if (this.f356g != null) {
            this.f356g.mo15h();
            this.f356g = null;
        }
        if (this.f357h != null) {
            this.f357h.mo15h();
            this.f357h = null;
        }
        if (this.f358i != null) {
            this.f358i.mo15h();
            this.f358i = null;
        }
        if (this.f359j != null) {
            this.f359j.mo15h();
            this.f359j = null;
        }
        if (this.f360k != null) {
            this.f360k.mo15h();
            this.f360k = null;
        }
        if (this.f361l != null) {
            this.f361l.mo15h();
            this.f361l = null;
        }
        if (this.f362m != null) {
            this.f362m.mo15h();
            this.f362m = null;
        }
        if (this.f363n != null) {
            this.f363n.mo15h();
            this.f363n = null;
        }
    }
}
