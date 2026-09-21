package p000;

import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public class C0052x {

    /* JADX INFO: renamed from: f */
    public static int f536f = 0;

    /* JADX INFO: renamed from: g */
    public static int f537g = 0;

    /* JADX INFO: renamed from: h */
    public static int f538h;

    /* JADX INFO: renamed from: i */
    public static int f539i;

    /* JADX INFO: renamed from: j */
    public static int f540j;

    /* JADX INFO: renamed from: k */
    public static int f541k;

    /* JADX INFO: renamed from: l */
    public static int f542l;

    /* JADX INFO: renamed from: m */
    public int f543m;

    /* JADX INFO: renamed from: n */
    public int f544n;

    /* JADX INFO: renamed from: o */
    public int f545o;

    /* JADX INFO: renamed from: q */
    public String f547q;

    /* JADX INFO: renamed from: r */
    public String[] f548r;

    /* JADX INFO: renamed from: s */
    public InterfaceC0018ar f549s;

    /* JADX INFO: renamed from: p */
    public int f546p = 12;

    /* JADX INFO: renamed from: t */
    public boolean f550t = true;

    public C0052x(String str, String[] strArr, InterfaceC0018ar interfaceC0018ar) {
        this.f547q = str;
        this.f548r = strArr;
        this.f549s = interfaceC0018ar;
    }

    /* JADX INFO: renamed from: a */
    public int mo7a() {
        int length = this.f548r.length;
        return this.f547q != null ? length + 1 : length;
    }

    /* JADX INFO: renamed from: a */
    public void mo8a(int i) {
        if (f540j != 0) {
            return;
        }
        if (i == 1) {
            if (this.f544n > 0) {
                this.f544n--;
                return;
            } else {
                this.f544n = this.f548r.length - 1;
                return;
            }
        }
        if (i != 6) {
            if (i == 8) {
                mo13e();
            }
        } else if (this.f544n < this.f548r.length - 1) {
            this.f544n++;
        } else {
            this.f544n = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo9a(Graphics graphics) {
        int length;
        int i;
        int i2;
        int i3;
        int i4 = f539i - 24;
        int i5 = i4 / 2;
        int height = graphics.getFont().getHeight() / 2;
        if (this.f547q == null) {
            length = i4 / this.f548r.length;
        } else {
            length = i4 / (this.f548r.length + 1);
            graphics.setColor(16777215);
            graphics.drawString(this.f547q, 0, ((-i5) + (length / 2)) - height, 17);
        }
        int i6 = 0;
        while (i6 < this.f548r.length) {
            if (this.f550t) {
                i = (i6 != this.f544n || this.f543m % 500 >= 250) ? 16378665 : 16223774;
            } else {
                i = 16777215;
            }
            graphics.setColor(i);
            if (this.f547q == null) {
                i2 = -i5;
                i3 = i6;
            } else {
                i2 = -i5;
                i3 = i6 + 1;
            }
            graphics.drawString(this.f548r[i6], 0, (((i3 * length) + i2) + (length / 2)) - height, 17);
            i6++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m333b(int i) {
        if (f540j == 0) {
            this.f543m += i;
            return;
        }
        f538h += i;
        int i2 = f538h / 6;
        if (i2 > 0) {
            f538h -= i2 * 6;
            int iMo7a = (f536f * mo7a()) + 24;
            if (f540j == 1) {
                f539i = i2 + f539i;
                if (f539i >= iMo7a) {
                    f539i = iMo7a;
                    f540j = 0;
                    this.f543m = 0;
                    mo12d();
                    return;
                }
                return;
            }
            if (f540j == 2) {
                f539i -= i2;
                if (f539i <= 0) {
                    f539i = 0;
                    f541k = f542l;
                    f540j = 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m334b(Graphics graphics) {
        int i = f539i;
        int i2 = this.f545o != 0 ? this.f545o : f537g;
        graphics.fillRoundRect(((-i2) / 2) + 2, ((-i) / 2) + 2, i2 - 4, i - 4, 12, 12);
        graphics.drawRoundRect((-i2) / 2, (-i) / 2, i2 - 1, i - 1, 12, 12);
    }

    /* JADX INFO: renamed from: c */
    public final void m335c(Graphics graphics) {
        if (f539i > 0) {
            m334b(graphics);
            if (f540j == 0) {
                mo9a(graphics);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo12d() {
    }

    /* JADX INFO: renamed from: e */
    public void mo13e() {
        if (this.f549s != null) {
            this.f549s.mo116a(this, this.f544n);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m336f() {
        f538h = 0;
        f540j = 2;
        f542l = this.f546p;
        if (this.f547q != null) {
            this.f544n = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo14g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo15h() {
    }
}
