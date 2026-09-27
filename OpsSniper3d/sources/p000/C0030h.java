package p000;

import com.m3gworks.engine.C0020a;
import com.m3gworks.engine.C0021b;
import com.m3gworks.engine.C0022c;
import com.m3gworks.engine.C0023d;
import com.m3gworks.engine.RunnableC0025f;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0030h {

    /* JADX INFO: renamed from: a */
    private static C0030h f236a;

    /* JADX INFO: renamed from: b */
    private static String[] f237b = C0023d.f130k;

    /* JADX INFO: renamed from: c */
    private static String f238c = C0023d.f131l;

    /* JADX INFO: renamed from: f */
    private static Image f239f = null;

    /* JADX INFO: renamed from: g */
    private static Image f240g = null;

    /* JADX INFO: renamed from: h */
    private static Image[] f241h = null;

    /* JADX INFO: renamed from: i */
    private static Image[] f242i = null;

    /* JADX INFO: renamed from: j */
    private static Image f243j = null;

    /* JADX INFO: renamed from: k */
    private static Image f244k = null;

    /* JADX INFO: renamed from: l */
    private static Image f245l = null;

    /* JADX INFO: renamed from: m */
    private static Image f246m = null;

    /* JADX INFO: renamed from: n */
    private static Image f247n = null;

    /* JADX INFO: renamed from: o */
    private static Image f248o = null;

    /* JADX INFO: renamed from: p */
    private static Image f249p = null;

    /* JADX INFO: renamed from: d */
    private int f250d = -1;

    /* JADX INFO: renamed from: e */
    private int f251e = -1;

    /* JADX INFO: renamed from: q */
    private int f252q = 0;

    /* JADX INFO: renamed from: r */
    private long f253r = 0;

    /* JADX INFO: renamed from: s */
    private long f254s = 0;

    /* JADX INFO: renamed from: t */
    private int[] f255t = {-1, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: u */
    private long[] f256u = new long[8];

    /* JADX INFO: renamed from: v */
    private int f257v = 0;

    /* JADX INFO: renamed from: w */
    private boolean f258w = false;

    /* JADX INFO: renamed from: x */
    private int f259x = 0;

    /* JADX INFO: renamed from: y */
    private String f260y = null;

    /* JADX INFO: renamed from: a */
    public static C0030h m157a() {
        if (f236a == null) {
            f236a = new C0030h();
        }
        return f236a;
    }

    /* JADX INFO: renamed from: a */
    private void m158a(int i, Graphics graphics, int i2, int i3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f253r < 500) {
            String str = f237b[i];
            int height = f246m.getHeight() + 5;
            C0028f.m130a();
            C0028f.m132a(str, str.length(), graphics, i2, 2, height, -1);
        }
        if (jCurrentTimeMillis - this.f253r >= 600) {
            this.f253r = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m159d() {
        C0020a.m97a();
        try {
            f240g = Image.createImage("/res/image2d/scope.png");
            f245l = Image.createImage("/res/image2d/telescope.png");
            f246m = Image.createImage("/res/image2d/sniper_symbol.png");
            f247n = Image.createImage("/res/image2d/bullet_symbol.png");
            f243j = Image.createImage("/res/image2d/compass.png");
            f249p = Image.createImage("/res/image2d/supply.png");
            f244k = Image.createImage("/res/image2d/spot.png");
            f248o = Image.createImage("/res/image2d/fp_pt.png");
            f239f = Image.createImage("/res/image2d/weapon_handin.png");
            f241h = C0017aq.f89b;
            f242i = C0017aq.f91d;
        } catch (Exception e) {
            System.out.println("Failed to load 2D images");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m160e() {
        f237b = null;
        f240g = null;
        f241h = null;
        f242i = null;
        f239f = null;
        f243j = null;
        f244k = null;
        f249p = null;
        f245l = null;
        f246m = null;
        f247n = null;
        f248o = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m161a(int i) {
        this.f251e = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m162a(Graphics graphics, C0022c c0022c) {
        int width;
        C0011ak c0011ak;
        if (C0029g.m148a().m156c()) {
            return;
        }
        if (this.f260y != null) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, c0022c.getWidth(), c0022c.getHeight());
            C0028f.m130a();
            String str = this.f260y;
            int length = this.f260y.length();
            int width2 = c0022c.getWidth();
            c0022c.getHeight();
            C0028f.m132a(str, length, graphics, width2, 0, 10, -1);
            return;
        }
        if (RunnableC0025f.m117a().m124e() == 1) {
            int i = C0045w.m228a().m240f().f24m;
            int[] iArr = new int[c0022c.getWidth()];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr[i2] = i;
            }
            for (int i3 = 0; i3 < c0022c.getHeight(); i3++) {
                graphics.drawRGB(iArr, 0, c0022c.getWidth(), 0, i3, c0022c.getWidth(), 1, true);
            }
            graphics.setColor(0);
            graphics.fillRect(0, 0, c0022c.getWidth(), c0022c.getHeight() / 4);
            graphics.fillRect(0, (int) (c0022c.getHeight() * 0.75f), c0022c.getWidth(), c0022c.getHeight() / 4);
            graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[5].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (c0022c.getWidth() - (C0028f.f186l[5].length() * 6)) - 8, c0022c.getHeight() - C0028f.f187m.getHeight(), 20);
            C0028f.m130a();
            String str2 = C0028f.f186l[5];
            int length2 = C0028f.f186l[5].length();
            int width3 = c0022c.getWidth();
            c0022c.getHeight();
            C0028f.m132a(str2, length2, graphics, width3, (c0022c.getWidth() - (C0028f.f186l[5].length() * 6)) - 4, c0022c.getHeight() - C0028f.f187m.getHeight(), -1);
            return;
        }
        if (C0021b.m101a().m104d()) {
            int i4 = C0045w.m228a().m240f().m18b().f165l;
            int[] iArr2 = new int[c0022c.getWidth()];
            for (int i5 = 0; i5 < iArr2.length; i5++) {
                iArr2[i5] = i4;
            }
            for (int i6 = 0; i6 < c0022c.getHeight(); i6++) {
                graphics.drawRGB(iArr2, 0, c0022c.getWidth(), 0, i6, c0022c.getWidth(), 1, true);
            }
            if (C0021b.m101a().m105e() != null && C0021b.m101a().m105e().f39e) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, c0022c.getWidth(), c0022c.getHeight() / 4);
                graphics.fillRect(0, (int) (c0022c.getHeight() * 0.75f), c0022c.getWidth(), c0022c.getHeight() / 4);
            }
            if (C0021b.m101a().m105e() != null && C0021b.m101a().m105e().f35a == 10 && (c0011ak = C0045w.m228a().m240f().m18b().f166m) != null && c0011ak.f53a == 1) {
                String strM45b = c0011ak.m45b();
                int iM46c = c0011ak.m46c();
                if (strM45b == null) {
                    strM45b = "...";
                    iM46c = "...".length();
                }
                C0028f.m130a();
                int width4 = c0022c.getWidth();
                c0022c.getHeight();
                C0028f.m132a(strM45b, iM46c, graphics, width4, 5, ((c0022c.getHeight() * 3) / 4) + 5, -1);
            }
            if (C0045w.m228a().m240f().f22k != C0045w.m228a().m240f().f20i.length - 1) {
                graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[5].length() * 6) + 7 + 3, C0028f.f187m.getHeight(), 0, (c0022c.getWidth() - (C0028f.f186l[5].length() * 6)) - 8, c0022c.getHeight() - C0028f.f187m.getHeight(), 20);
                C0028f.m130a();
                String str3 = C0028f.f186l[5];
                int length3 = C0028f.f186l[5].length();
                int width5 = c0022c.getWidth();
                c0022c.getHeight();
                C0028f.m132a(str3, length3, graphics, width5, (c0022c.getWidth() - (C0028f.f186l[5].length() * 6)) - 4, c0022c.getHeight() - C0028f.f187m.getHeight(), -1);
                return;
            }
            return;
        }
        if (C0045w.m228a().m240f().f20i[C0045w.m228a().m240f().f20i.length - 1].f158e) {
            return;
        }
        try {
            int width6 = c0022c.getWidth();
            int height = c0022c.getHeight();
            this.f259x = 0;
            int iM100b = C0020a.m97a().m100b();
            C0015ao c0015ao = (C0015ao) C0045w.m228a().m240f().f18g;
            RunnableC0025f runnableC0025fM117a = RunnableC0025f.m117a();
            this.f259x = 1;
            if (c0022c.m111d() == 1 && c0015ao.mo9c().m65d() != null) {
                graphics.setColor(16777215);
                int i7 = width6 / 2;
                int i8 = height / 2;
                boolean[] zArrM43h = C0010aj.m33a().m43h();
                if (zArrM43h[0] || zArrM43h[1] || zArrM43h[2] || zArrM43h[3] || zArrM43h[4]) {
                    this.f252q++;
                } else {
                    this.f252q--;
                }
                if (this.f252q > 5) {
                    this.f252q = 5;
                } else if (this.f252q < 0) {
                    this.f252q = 0;
                }
                graphics.drawLine(i7, i8, i7, i8);
                graphics.drawLine((((i7 - 3) - 3) + 1) - this.f252q, i8, (i7 - 3) - this.f252q, i8);
                graphics.drawLine(i7 + 3 + this.f252q, i8, (((i7 + 3) + 3) - 1) + this.f252q, i8);
                graphics.drawLine(i7, (((i8 - 3) - 3) + 1) - this.f252q, i7, (i8 - 3) - this.f252q);
                graphics.drawLine(i7, i8 + 3 + this.f252q, i7, (((i8 + 3) + 3) - 1) + this.f252q);
            }
            this.f259x = 2;
            if (this.f250d >= 0) {
                Image[] imageArr = null;
                int i9 = c0015ao.mo9c().f71j;
                C0035m c0035mM65d = c0015ao.mo9c().m65d();
                int width7 = 0;
                if (i9 == 0) {
                    imageArr = f241h;
                    width7 = ((int) (c0035mM65d.f272e[iM100b][0][2] * 0.6496f)) + (imageArr[0].getWidth() / 3);
                } else if (i9 == 1) {
                    imageArr = f241h;
                    width7 = ((int) (c0035mM65d.f272e[iM100b][0][2] * 0.4233f)) + (imageArr[0].getWidth() / 3);
                } else if (i9 == 2) {
                    imageArr = f242i;
                    width7 = c0035mM65d.f272e[iM100b][0][2] + (imageArr[0].getWidth() / 3);
                }
                if (c0035mM65d != null && imageArr != null) {
                    graphics.drawImage(imageArr[this.f250d], width6 - width7, height - ((c0035mM65d.f272e[iM100b][0][3] / 3) << 2), 3);
                    this.f250d++;
                    if (this.f250d >= imageArr.length) {
                        this.f250d = -1;
                    }
                }
            }
            int height2 = C0028f.f187m.getHeight();
            this.f259x = 3;
            if (c0015ao.mo7b() > 0) {
                if (c0022c.m111d() == 1) {
                    C0010aj c0010ajM33a = C0010aj.m33a();
                    C0035m c0035mM65d2 = c0015ao.mo9c().m65d();
                    if (c0035mM65d2 != null) {
                        int iM40e = c0010ajM33a.m40e();
                        if (iM40e != 0) {
                            graphics.drawRegion(f239f, c0035mM65d2.f272e[iM100b][0][0], c0035mM65d2.f272e[iM100b][0][1], c0035mM65d2.f272e[iM100b][0][2], c0035mM65d2.f272e[iM100b][0][3], 0, width6 + (iM40e * 3), ((iM40e * 3) + height) - height2, 40);
                        } else {
                            graphics.drawRegion(f239f, c0035mM65d2.f272e[iM100b][0][0], c0035mM65d2.f272e[iM100b][0][1], c0035mM65d2.f272e[iM100b][0][2], c0035mM65d2.f272e[iM100b][0][3], 0, width6, ((c0010ajM33a.m39d() * 3) + height) - height2, 40);
                        }
                    }
                } else if (c0015ao.mo9c().f72k == 0) {
                    graphics.drawRegion(f245l, 0, 0, f245l.getWidth(), f245l.getHeight(), 0, (width6 / 2) - (f245l.getWidth() - 5), height / 2, 40);
                    graphics.drawRegion(f245l, 5, 0, f245l.getWidth() - 5, f245l.getHeight(), 2, (width6 / 2) - (f245l.getWidth() - 5), height / 2, 36);
                    graphics.drawRegion(f245l, 0, 0, f245l.getWidth(), f245l.getHeight(), 1, (width6 / 2) - (f245l.getWidth() - 5), height / 2, 24);
                    graphics.drawRegion(f245l, 5, 0, f245l.getWidth() - 5, f245l.getHeight(), 3, (width6 / 2) - (f245l.getWidth() - 5), height / 2, 20);
                    graphics.drawRegion(f245l, 5, 0, f245l.getWidth() - 5, f245l.getHeight(), 0, (f245l.getWidth() - 5) + (width6 / 2), height / 2, 40);
                    graphics.drawRegion(f245l, 0, 0, f245l.getWidth(), f245l.getHeight(), 2, (f245l.getWidth() - 5) + (width6 / 2), height / 2, 36);
                    graphics.drawRegion(f245l, 5, 0, f245l.getWidth() - 5, f245l.getHeight(), 1, (f245l.getWidth() - 5) + (width6 / 2), height / 2, 24);
                    graphics.drawRegion(f245l, 0, 0, f245l.getWidth(), f245l.getHeight(), 3, (f245l.getWidth() - 5) + (width6 / 2), height / 2, 20);
                    graphics.setColor(0, 0, 0);
                    int height3 = (height / 2) - f245l.getHeight();
                    graphics.fillRect(0, 0, width6, height3);
                    graphics.fillRect(0, (f245l.getHeight() << 1) + height3, width6, height3 + 1);
                    int width8 = ((width6 / 2) - (f245l.getWidth() << 1)) + 5;
                    graphics.fillRect(0, height3, width8 + 1, f245l.getHeight() << 1);
                    graphics.fillRect(width6 - width8, height3, width8 + 1, f245l.getHeight() << 1);
                } else {
                    int i10 = width6 / 2;
                    int i11 = height / 2;
                    graphics.setColor(0);
                    int width9 = f240g.getWidth() / 4;
                    graphics.drawLine(i10 - width9, i11 - 2, i10 - width9, i11 + 2);
                    graphics.drawLine(i10 + width9, i11 - 2, i10 + width9, i11 + 2);
                    graphics.drawLine(i10 - 2, i11 - width9, i10 + 2, i11 - width9);
                    graphics.drawLine(i10 - 2, i11 + width9, i10 + 2, i11 + width9);
                    graphics.drawLine(i10 - (width9 << 1), i11 - 2, i10 - (width9 << 1), i11 + 2);
                    graphics.drawLine((width9 << 1) + i10, i11 - 2, (width9 << 1) + i10, i11 + 2);
                    graphics.drawLine(i10 - 2, i11 - (width9 << 1), i10 + 2, i11 - (width9 << 1));
                    graphics.drawLine(i10 - 2, (width9 << 1) + i11, i10 + 2, (width9 << 1) + i11);
                    graphics.drawLine(i10 - (width9 * 3), i11 - 2, i10 - (width9 * 3), i11 + 2);
                    graphics.drawLine((width9 * 3) + i10, i11 - 2, (width9 * 3) + i10, i11 + 2);
                    graphics.drawLine(i10 - 2, i11 - (width9 * 3), i10 + 2, i11 - (width9 * 3));
                    graphics.drawLine(i10 - 2, (width9 * 3) + i11, i10 + 2, (width9 * 3) + i11);
                    graphics.drawLine(i10 - f240g.getWidth(), i11, f240g.getWidth() + i10, i11);
                    graphics.drawLine(i10, i11 - f240g.getHeight(), i10, i11 + f240g.getHeight());
                    graphics.drawRegion(f240g, 0, 0, f240g.getWidth(), f240g.getHeight(), 0, width6 / 2, height / 2, 40);
                    graphics.drawRegion(f240g, 0, 0, f240g.getWidth(), f240g.getHeight(), 2, width6 / 2, height / 2, 36);
                    graphics.drawRegion(f240g, 0, 0, f240g.getWidth(), f240g.getHeight(), 1, width6 / 2, height / 2, 24);
                    graphics.drawRegion(f240g, 0, 0, f240g.getWidth(), f240g.getHeight(), 3, width6 / 2, height / 2, 20);
                    graphics.setColor(0, 0, 0);
                    int height4 = (height / 2) - f240g.getHeight();
                    graphics.fillRect(0, 0, width6, height4 + 2);
                    graphics.fillRect(0, (f240g.getHeight() << 1) + height4, width6, height4 + 1);
                    int width10 = (width6 / 2) - f240g.getWidth();
                    graphics.fillRect(0, height4 + 2, width10 + 1, f240g.getHeight() << 1);
                    graphics.fillRect((f240g.getWidth() << 1) + width10, height4 + 2, width10 + 1, f240g.getHeight() << 1);
                }
            }
            this.f259x = 4;
            this.f259x = 5;
            int[] iArr3 = new int[width6];
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                iArr3[i12] = -299953405;
            }
            for (int i13 = 0; i13 < f246m.getHeight() + 4; i13++) {
                graphics.drawRGB(iArr3, 0, width6, 0, i13, width6, 1, true);
            }
            this.f259x = 6;
            C0035m c0035mM65d3 = c0015ao.mo9c().m65d();
            if (c0035mM65d3 == null || !(c0035mM65d3.f271d == 0 || c0035mM65d3.f271d == 1 || c0035mM65d3.f271d == 2 || c0035mM65d3.f271d == 3)) {
                width = (((width6 - 2) - 30) - 2) - f247n.getWidth();
            } else {
                int iM60b = c0015ao.mo9c().m60b();
                int i14 = c0015ao.mo9c().m65d().f269b;
                int i15 = iM60b % i14;
                if (i15 != 0 || iM60b == 0 || iM60b < c0015ao.mo9c().f68g[c0035mM65d3.f271d] || C0010aj.m33a().m41f()) {
                    i14 = i15;
                }
                int i16 = iM60b - i14;
                String string = new StringBuffer(String.valueOf(i14 < 10 ? new StringBuffer(" ").append(i14).toString() : new StringBuffer().append(i14).toString())).append("/").append(i16 < 10 ? new StringBuffer(" ").append(i16).toString() : new StringBuffer().append(i16).toString()).toString();
                int length4 = (width6 - 2) - (string.length() * 6);
                int width11 = (length4 - 2) - f247n.getWidth();
                graphics.drawImage(f247n, width11, ((f246m.getHeight() + 4) - f247n.getHeight()) / 2, 20);
                C0028f.m130a();
                C0028f.m132a(string, string.length(), graphics, width6, length4, ((f246m.getHeight() + 4) - 11) / 2, -1);
                width = width11;
            }
            this.f259x = 7;
            int iMo7b = c0015ao.mo7b();
            String string2 = iMo7b == 100 ? new StringBuffer().append(iMo7b).toString() : (iMo7b >= 100 || iMo7b < 10) ? new StringBuffer("  ").append(iMo7b).toString() : new StringBuffer(" ").append(iMo7b).toString();
            int i17 = 10;
            if (iM100b == 2) {
                i17 = 10;
            } else if (iM100b == 1) {
                i17 = 6;
            } else if (iM100b == 0) {
                i17 = 2;
            }
            this.f259x = 8;
            int length5 = (width - i17) - (string2.length() * 6);
            C0028f.m130a();
            C0028f.m132a(string2, string2.length(), graphics, width6, length5, ((f246m.getHeight() + 4) - 11) / 2, -1);
            graphics.drawImage(f246m, (length5 - 2) - f246m.getWidth(), 2, 20);
            String string3 = new StringBuffer(String.valueOf(iM100b == 0 ? f238c.substring(0, 3) : f238c)).append(" ").append(C0045w.m228a().m240f().f22k + 1).append("/").append(C0045w.m228a().m240f().f20i.length).toString();
            C0028f.m130a();
            C0028f.m132a(string3, string3.length(), graphics, width6, 2, ((f246m.getHeight() + 4) - 11) / 2, -1);
            for (int i18 = 0; i18 < this.f255t.length; i18++) {
                if (this.f255t[i18] != -1) {
                    if (this.f256u[i18] == 0) {
                        this.f256u[i18] = System.currentTimeMillis();
                    }
                    if (System.currentTimeMillis() - this.f256u[i18] < 2000) {
                        int[] iArr4 = new int[f249p.getHeight() * 5];
                        for (int i19 = 0; i19 < iArr4.length; i19++) {
                            iArr4[i19] = -1155591421;
                        }
                        for (int i20 = 0; i20 < f249p.getHeight(); i20++) {
                            graphics.drawRGB(iArr4, 0, f249p.getHeight() * 5, 2, ((f249p.getHeight() + 2) * i18) + f246m.getHeight() + i20 + 5, f249p.getHeight() * 5, 1, true);
                        }
                        int height5 = this.f255t[i18] * f249p.getHeight();
                        int height6 = f246m.getHeight() + 5 + ((f249p.getHeight() + 2) * i18) + (f249p.getHeight() / 2);
                        graphics.drawRegion(f249p, height5, 0, f249p.getHeight(), f249p.getHeight(), 0, 2, height6, 6);
                        String str4 = C0005ae.f25a[this.f255t[i18]];
                        C0028f.m130a();
                        C0028f.m132a(str4, str4.length(), graphics, width6, f249p.getHeight() + 2 + 2, height6 - 5, -1);
                    } else {
                        this.f256u[i18] = 0;
                        this.f255t[i18] = -1;
                    }
                }
            }
            this.f259x = 9;
            graphics.drawRegion(f243j, 0, 0, f243j.getWidth(), f243j.getHeight(), 0, f243j.getWidth() + 1, ((height - f243j.getHeight()) - 1) - height2, 40);
            graphics.drawRegion(f243j, 0, 0, f243j.getWidth(), f243j.getHeight(), 2, f243j.getWidth(), ((height - f243j.getHeight()) - 1) - height2, 36);
            graphics.drawRegion(f243j, 0, 0, f243j.getWidth(), f243j.getHeight(), 1, f243j.getWidth() + 1, ((height - f243j.getHeight()) - 2) - height2, 24);
            graphics.drawRegion(f243j, 0, 0, f243j.getWidth(), f243j.getHeight(), 3, f243j.getWidth(), ((height - f243j.getHeight()) - 2) - height2, 20);
            graphics.drawImage(f248o, f243j.getWidth(), (height - f243j.getHeight()) - height2, 3);
            this.f259x = 10;
            if (C0045w.m228a().m240f().f20i != null) {
                float[] fArr = C0045w.m228a().m240f().m18b().f154a;
                float[] fArrM212m = c0015ao.m212m();
                int iSqrt = (int) ((((float) Math.sqrt(((fArrM212m[0] - fArr[0]) * (fArrM212m[0] - fArr[0])) + ((fArrM212m[2] - fArr[2]) * (fArrM212m[2] - fArr[2])))) / 250.0f) * ((int) (0.7f * f243j.getWidth())));
                float[] fArr2 = {fArr[0] - fArrM212m[0], 0.0f, fArr[2] - fArrM212m[2]};
                float[] fArrM205a = c0015ao.m205a(1, 1.0f);
                fArrM205a[1] = 0.0f;
                float fM16a = (float) C0003ac.m16a(((double) C0034l.m184a(fArr2, fArrM205a)) / (Math.sqrt(((fArr2[0] * fArr2[0]) + (fArr2[1] * fArr2[1])) + (fArr2[2] * fArr2[2])) * Math.sqrt(((fArrM205a[0] * fArrM205a[0]) + (fArrM205a[1] * fArrM205a[1])) + (fArrM205a[2] * fArrM205a[2]))));
                if (C0034l.m186b(fArr2, fArrM205a)[1] < 0.0f) {
                    fM16a = -fM16a;
                }
                graphics.drawImage(f244k, f243j.getWidth() + ((int) (Math.sin(fM16a) * ((double) iSqrt))), ((((height - f243j.getHeight()) - 1) - 1) - ((int) (Math.cos(fM16a) * ((double) iSqrt)))) - height2, 3);
            }
            this.f259x = 11;
            if (c0015ao.m70h() || c0015ao.mo7b() <= 0) {
                int[] iArr5 = new int[width6];
                for (int i21 = 0; i21 < iArr5.length; i21++) {
                    iArr5[i21] = 872349696;
                }
                for (int i22 = 0; i22 < height; i22++) {
                    graphics.drawRGB(iArr5, 0, width6, 0, i22, width6, 1, true);
                }
            }
            this.f259x = 12;
            if (this.f258w) {
                int[] iArr6 = new int[f249p.getHeight() * 3];
                for (int i23 = 0; i23 < iArr6.length; i23++) {
                    iArr6[i23] = -1155591421;
                }
                for (int i24 = 0; i24 < (f249p.getHeight() << 1); i24++) {
                    graphics.drawRGB(iArr6, 0, f249p.getHeight() * 3, (width6 - (f249p.getHeight() * 3)) / 2, i24 + (((((height - f243j.getHeight()) - 1) - height2) - (f249p.getHeight() / 2)) - ((((f249p.getHeight() << 1) - f249p.getHeight()) - 11) / 2)), f249p.getHeight() * 3, 1, true);
                }
                int height7 = 0;
                switch (this.f257v) {
                    case 0:
                        height7 = f249p.getHeight() * 0;
                        break;
                    case 1:
                        height7 = f249p.getHeight() * 1;
                        break;
                    case 2:
                        height7 = f249p.getHeight() * 2;
                        break;
                    case 3:
                        height7 = f249p.getHeight() * 3;
                        break;
                    case 4:
                        height7 = f249p.getHeight() * 4;
                        break;
                }
                graphics.drawRegion(f249p, height7, 0, f249p.getHeight(), f249p.getHeight(), 0, width6 / 2, ((height - f243j.getHeight()) - 1) - height2, 10);
                this.f259x = 121;
                String string4 = new StringBuffer(" x ").append(c0015ao.mo9c().f70i[this.f257v]).toString();
                C0028f.m130a();
                C0028f.m132a(string4, string4.length(), graphics, width6, width6 / 2, (((height - f243j.getHeight()) - 1) - height2) - 5, -1);
                this.f259x = 122;
                String str5 = C0005ae.f25a[this.f257v];
                C0028f.m130a();
                C0028f.m132a(str5, str5.length(), graphics, width6, (width6 - (str5.length() * 6)) / 2, (((height - f243j.getHeight()) - 1) - height2) + (f249p.getHeight() / 2) + 2, -1);
            }
            this.f259x = 13;
            this.f259x = 14;
            if (c0035mM65d3 != null && c0035mM65d3.f271d != 3 && runnableC0025fM117a.m124e() == 2 && C0010aj.m33a().m41f()) {
                int[] iArr7 = new int[width6];
                for (int i25 = 0; i25 < iArr7.length; i25++) {
                    iArr7[i25] = -585166077;
                }
                for (int i26 = 0; i26 < 13; i26++) {
                    graphics.drawRGB(iArr7, 0, width6, 0, f246m.getHeight() + i26 + 4, width6, 1, true);
                }
                m158a(0, graphics, width6, height);
            }
            if (this.f251e != -1) {
                if (this.f254s == 0) {
                    this.f254s = System.currentTimeMillis();
                }
                if (System.currentTimeMillis() - this.f254s < 3000) {
                    int[] iArr8 = new int[width6];
                    for (int i27 = 0; i27 < iArr8.length; i27++) {
                        iArr8[i27] = -585166077;
                    }
                    for (int i28 = 0; i28 < 13; i28++) {
                        graphics.drawRGB(iArr8, 0, width6, 0, f246m.getHeight() + i28 + 4, width6, 1, true);
                    }
                    m158a(this.f251e, graphics, width6, height);
                } else {
                    this.f254s = 0L;
                    this.f251e = -1;
                }
            }
            this.f259x = 15;
            graphics.setColor(2036483);
            graphics.fillRect(0, height - height2, width6, height2);
            graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[6].length() * 6) + 7, C0028f.f187m.getHeight(), 0, 0, c0022c.getHeight() - C0028f.f187m.getHeight(), 20);
            graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[7].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (c0022c.getWidth() - (C0028f.f186l[7].length() * 6)) - 8, c0022c.getHeight() - C0028f.f187m.getHeight(), 20);
            C0028f.m130a();
            String str6 = C0028f.f186l[6];
            int length6 = C0028f.f186l[6].length();
            int width12 = c0022c.getWidth();
            c0022c.getHeight();
            C0028f.m132a(str6, length6, graphics, width12, 4, c0022c.getHeight() - C0028f.f187m.getHeight(), -1);
            C0028f.m130a();
            String str7 = C0028f.f186l[7];
            int length7 = C0028f.f186l[7].length();
            int width13 = c0022c.getWidth();
            c0022c.getHeight();
            C0028f.m132a(str7, length7, graphics, width13, (c0022c.getWidth() - (C0028f.f186l[7].length() * 6)) - 4, c0022c.getHeight() - C0028f.f187m.getHeight(), -1);
            this.f259x = 16;
        } catch (Exception e) {
            e.printStackTrace();
            this.f260y = new StringBuffer(String.valueOf(e.toString())).append(" ").append(this.f259x).toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m163a(boolean z) {
        this.f258w = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m164b() {
        if ((((InterfaceC0032j) C0045w.m228a().m240f().f18g).mo9c().m65d().f271d != 0 || C0022c.m107b().m111d() == 1) && this.f250d == -1) {
            this.f250d = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m165b(int i) {
        this.f257v = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m166c() {
        this.f250d = -1;
        this.f251e = -1;
        this.f252q = 0;
        this.f253r = 0L;
        this.f258w = false;
        this.f257v = 0;
        this.f254s = 0L;
        for (int i = 0; i < this.f255t.length; i++) {
            this.f255t[i] = -1;
            this.f256u[i] = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m167c(int i) {
        boolean z;
        int length = this.f255t.length - 1;
        while (true) {
            if (length < 0) {
                z = false;
                break;
            } else {
                if (this.f255t[length] != -1) {
                    this.f255t[length + 1] = i;
                    z = true;
                    break;
                }
                length--;
            }
        }
        if (z) {
            return;
        }
        this.f255t[0] = i;
    }

    /* JADX INFO: renamed from: f */
    public final int m168f() {
        return this.f257v;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m169g() {
        return this.f258w;
    }
}
