package p000;

import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0046r extends C0052x {

    /* JADX INFO: renamed from: a */
    public int f509a;

    /* JADX INFO: renamed from: b */
    public boolean f510b;

    /* JADX INFO: renamed from: c */
    public String[] f511c;

    /* JADX INFO: renamed from: d */
    public String[] f512d;

    /* JADX INFO: renamed from: e */
    public int[] f513e;

    public C0046r(InterfaceC0018ar interfaceC0018ar) {
        super("", new String[]{C0026az.m177a(C0026az.f310k)}, interfaceC0018ar);
        this.f511c = new String[9];
        this.f512d = new String[9];
        this.f513e = new int[9];
        this.f546p = 0;
        this.f511c[0] = C0026az.m177a(C0026az.f276Y);
        this.f511c[1] = C0026az.m177a(C0026az.f277Z);
        this.f511c[2] = C0026az.m177a(C0026az.f279aa);
        this.f511c[3] = C0026az.m177a(C0026az.f280ab);
        this.f511c[4] = C0026az.m177a(C0026az.f281ac);
        this.f511c[5] = C0026az.m177a(C0026az.f282ad);
        this.f511c[6] = C0026az.m177a(C0026az.f283ae);
        this.f511c[7] = C0026az.m177a(C0026az.f284af);
        this.f511c[8] = C0026az.m177a(C0026az.f285ag);
    }

    /* JADX INFO: renamed from: c */
    private static String m315c(int i) {
        switch (i) {
            case 1:
                return "Up";
            case 2:
                return "Left";
            case 5:
                return "Right";
            case 6:
                return "Down";
            case 8:
                return "Fire/OK";
            case 35:
                return "#";
            case 42:
                return "*";
            case 48:
                return "0";
            case 49:
                return "1";
            case 50:
                return "2";
            case 51:
                return "3";
            case 52:
                return "4";
            case 53:
                return "5";
            case 54:
                return "6";
            case 55:
                return "7";
            case 56:
                return "8";
            case 57:
                return "9";
            default:
                return "Unknown";
        }
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final int mo7a() {
        return 8;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final void mo8a(int i) {
        if (C0052x.f540j != 0) {
            return;
        }
        if (this.f510b) {
            this.f549s.mo116a(this, -1);
        } else {
            if (this.f509a >= this.f512d.length) {
                this.f549s.mo116a(this, 1);
                return;
            }
            this.f513e[this.f509a] = i;
            this.f512d[this.f509a] = m315c(i);
            this.f509a++;
        }
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final void mo9a(Graphics graphics) {
        graphics.setColor(16777215);
        int i = C0052x.f539i - 24;
        int i2 = i / 2;
        int height = graphics.getFont().getHeight() / 2;
        int i3 = i / 9;
        int i4 = (C0052x.f537g / 2) - 7;
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= 9) {
                return;
            }
            int i7 = (((-i2) + (i3 * i6)) + (i3 / 2)) - height;
            graphics.setColor((i6 != this.f509a || this.f543m % 500 >= 250) ? 16378665 : 16223774);
            graphics.drawString(this.f511c[i6], -i4, i7, 20);
            graphics.drawString(this.f512d[i6], i4, i7, 24);
            i5 = i6 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m316b() {
        this.f547q = C0026az.m177a(C0026az.f274W);
        this.f510b = true;
        this.f509a = -1;
    }

    /* JADX INFO: renamed from: c */
    public final void m317c() {
        this.f547q = C0026az.m177a(C0026az.f275X);
        this.f510b = false;
        this.f509a = 0;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: d */
    public final void mo12d() {
        String[] strArr;
        char c;
        String strM315c;
        if (this.f510b) {
            C0013am c0013amM99k = C0013am.m99k();
            this.f512d[0] = m315c(c0013amM99k.m127e(0));
            this.f512d[1] = m315c(c0013amM99k.m127e(1));
            this.f512d[2] = m315c(c0013amM99k.m127e(2));
            this.f512d[3] = m315c(c0013amM99k.m127e(3));
            this.f512d[4] = m315c(c0013amM99k.m127e(4));
            this.f512d[5] = m315c(c0013amM99k.m127e(5));
            this.f512d[6] = m315c(c0013amM99k.m127e(6));
            this.f512d[7] = m315c(c0013amM99k.m127e(7));
            strArr = this.f512d;
            c = '\b';
            strM315c = m315c(c0013amM99k.m127e(8));
        } else {
            this.f512d[0] = "";
            this.f512d[1] = "";
            this.f512d[2] = "";
            this.f512d[3] = "";
            this.f512d[4] = "";
            this.f512d[5] = "";
            this.f512d[6] = "";
            this.f512d[7] = "";
            strArr = this.f512d;
            c = '\b';
            strM315c = "";
        }
        strArr[c] = strM315c;
    }
}
