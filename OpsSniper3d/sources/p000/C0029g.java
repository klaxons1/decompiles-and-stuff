package p000;

import com.m3gworks.engine.C0020a;
import com.m3gworks.engine.C0022c;
import com.m3gworks.engine.C0023d;
import com.m3gworks.engine.RunnableC0025f;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0029g {

    /* JADX INFO: renamed from: a */
    private static C0029g f212a;

    /* JADX INFO: renamed from: d */
    private static final String[] f213d = C0023d.f132m;

    /* JADX INFO: renamed from: e */
    private static final String[] f214e = C0023d.f133n;

    /* JADX INFO: renamed from: f */
    private static final String[] f215f = C0023d.f134o;

    /* JADX INFO: renamed from: g */
    private static final String[] f216g = C0023d.f135p;

    /* JADX INFO: renamed from: h */
    private static final String[] f217h = C0023d.f136q;

    /* JADX INFO: renamed from: i */
    private static final String[] f218i = C0023d.f137r;

    /* JADX INFO: renamed from: b */
    private int f219b;

    /* JADX INFO: renamed from: c */
    private boolean f220c = false;

    /* JADX INFO: renamed from: j */
    private int f221j = 0;

    /* JADX INFO: renamed from: k */
    private int f222k = 0;

    /* JADX INFO: renamed from: l */
    private int f223l = 0;

    /* JADX INFO: renamed from: m */
    private int f224m = 0;

    /* JADX INFO: renamed from: n */
    private float f225n = 0.021875f;

    /* JADX INFO: renamed from: o */
    private float f226o = 0.24f;

    /* JADX INFO: renamed from: p */
    private float f227p = 0.140625f;

    /* JADX INFO: renamed from: q */
    private float f228q = 0.075f;

    /* JADX INFO: renamed from: r */
    private int f229r = 1;

    /* JADX INFO: renamed from: s */
    private int f230s = 1;

    /* JADX INFO: renamed from: t */
    private float f231t = 0.04f;

    /* JADX INFO: renamed from: u */
    private int f232u = 0;

    /* JADX INFO: renamed from: v */
    private int f233v = 0;

    /* JADX INFO: renamed from: w */
    private boolean f234w = true;

    /* JADX INFO: renamed from: x */
    private boolean f235x = true;

    /* JADX INFO: renamed from: a */
    public static C0029g m148a() {
        if (f212a == null) {
            f212a = new C0029g();
        }
        return f212a;
    }

    /* JADX INFO: renamed from: a */
    private static void m149a(Graphics graphics, int i, int i2) {
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = -585166077;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            graphics.drawRGB(iArr, 0, i, 0, i4, i, 1, true);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m150a(Graphics graphics, C0022c c0022c, String str, String[] strArr, int i) {
        int height = (int) (c0022c.getHeight() * ((1.0f - this.f226o) - this.f227p));
        int height2 = ((height - (C0028f.f176b.getHeight() << 1)) - ((int) (this.f225n * c0022c.getHeight()))) / (((int) (this.f225n * c0022c.getHeight())) + 11);
        int length = strArr.length;
        if (length > height2) {
            length = height2;
        }
        int height3 = ((length + 1) * ((int) (this.f225n * c0022c.getHeight()))) + (length * 11) + (C0028f.f176b.getHeight() << 1);
        int height4 = ((int) (c0022c.getHeight() * this.f226o)) + ((height - height3) / 2);
        int[] iArr = new int[c0022c.getWidth()];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = -15529214;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= height3 - 2) {
                break;
            }
            graphics.drawRGB(iArr, 0, c0022c.getWidth(), 0, i4 + height4, c0022c.getWidth(), 1, true);
            i3 = i4 + 1;
        }
        C0028f.m130a();
        String lowerCase = str.toLowerCase();
        int length2 = str.length();
        int width = c0022c.getWidth();
        c0022c.getHeight();
        C0028f.m132a(lowerCase, length2, graphics, width, (c0022c.getWidth() - (str.length() * 6)) / 2, (height4 - 11) - ((int) (c0022c.getHeight() * this.f225n)), -6253705);
        graphics.drawImage(C0028f.f176b, 0, height4 - C0028f.f176b.getHeight(), 20);
        int i5 = 0;
        this.f230s = strArr.length / height2;
        if (strArr.length % height2 > 0) {
            this.f230s++;
        }
        int i6 = (this.f229r - 1) * height2;
        int i7 = i6 + height2;
        int i8 = i6;
        while (i8 < i7) {
            int height5 = ((int) (c0022c.getHeight() * this.f225n)) + height4 + ((i8 % height2) * (((int) (c0022c.getHeight() * this.f225n)) + 11));
            if (i8 >= strArr.length) {
                if (this.f229r == 1) {
                    break;
                }
            } else {
                int width2 = (c0022c.getWidth() - (strArr[i8].length() * 6)) / 2;
                int i9 = i8 == i ? -1 : -6253705;
                C0028f.m130a();
                String lowerCase2 = strArr[i8].toLowerCase();
                int length3 = strArr[i8].length();
                int width3 = c0022c.getWidth();
                c0022c.getHeight();
                C0028f.m132a(lowerCase2, length3, graphics, width3, width2, height5, i9);
            }
            i5 = height5;
            i8++;
        }
        int height6 = i5 + 11 + ((int) (c0022c.getHeight() * this.f225n));
        graphics.drawImage(C0028f.f176b, 0, height6, 20);
        if (this.f230s > 1) {
            int width4 = (c0022c.getWidth() - ((this.f230s * 6) + ((this.f230s - 1) * ((int) (this.f231t * c0022c.getWidth()))))) / 2;
            int height7 = (((height6 + C0028f.f176b.getHeight()) + ((int) (c0022c.getHeight() * (1.0f - this.f228q)))) - 11) / 2;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= this.f230s) {
                    break;
                }
                int i12 = -6253705;
                if (i11 == this.f229r - 1) {
                    i12 = -1;
                }
                C0028f.m130a();
                String string = new StringBuffer(String.valueOf(i11 + 1)).toString();
                int length4 = new StringBuffer(String.valueOf(i11 + 1)).toString().length();
                int width5 = c0022c.getWidth();
                c0022c.getHeight();
                C0028f.m132a(string, length4, graphics, width5, width4 + ((((int) (this.f231t * c0022c.getWidth())) + 6) * i11), height7, i12);
                i10 = i11 + 1;
            }
            if (this.f229r == 1) {
                graphics.setColor(-6253705);
            } else {
                graphics.setColor(-1);
            }
            int width6 = (width4 - ((int) (this.f231t * c0022c.getWidth()))) - 2;
            int i13 = height7 + 5;
            graphics.drawLine(width6, i13, width6, i13);
            graphics.drawLine(width6 + 1, i13 - 1, width6 + 1, i13 + 1);
            if (C0020a.m97a().m100b() == 2) {
                graphics.drawLine(width6 + 2, i13 - 2, width6 + 2, i13 + 2);
            }
            if (this.f229r == this.f230s) {
                graphics.setColor(-6253705);
            } else {
                graphics.setColor(-1);
            }
            int width7 = ((c0022c.getWidth() - width4) + ((int) (this.f231t * c0022c.getWidth()))) - 3;
            int i14 = height7 + 5;
            if (C0020a.m97a().m100b() == 2) {
                graphics.drawLine(width7, i14 - 2, width7, i14 + 2);
            }
            graphics.drawLine(width7 + 1, i14 - 1, width7 + 1, i14 + 1);
            graphics.drawLine(width7 + 2, i14, width7 + 2, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m151b(Graphics graphics, C0022c c0022c) {
        if (this.f232u == 0) {
            this.f233v = -16777216;
            this.f232u++;
        } else if (this.f232u == 1) {
            this.f233v = -2013265920;
            this.f232u++;
        } else if (this.f232u == 2) {
            this.f233v = 0;
            this.f232u++;
        } else if (this.f232u == 3) {
            return;
        }
        int[] iArr = new int[c0022c.getWidth()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = this.f233v;
        }
        for (int i2 = 0; i2 < c0022c.getHeight(); i2++) {
            graphics.drawRGB(iArr, 0, c0022c.getWidth(), 0, i2, c0022c.getWidth(), 1, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m152a(int i) {
        this.f219b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m153a(int i, int i2) {
        if (this.f220c) {
            switch (this.f219b) {
                case 0:
                    if (i != 50 && i2 != 1) {
                        if (i != 56 && i2 != 6) {
                            if (i2 != 8 && i != -6 && i != -21) {
                                if (i == -7 || i == -22) {
                                    this.f220c = false;
                                }
                                break;
                            } else {
                                switch (this.f221j) {
                                    case 0:
                                        this.f220c = false;
                                        break;
                                    case 1:
                                        this.f232u = 0;
                                        this.f219b = 11;
                                        break;
                                    case 2:
                                        this.f232u = 0;
                                        this.f234w = C0028f.m130a().m146e();
                                        this.f235x = C0028f.m130a().m147f();
                                        this.f219b = 1;
                                        break;
                                    case 3:
                                        this.f232u = 0;
                                        this.f219b = 2;
                                        break;
                                    case 4:
                                        this.f220c = false;
                                        RunnableC0025f.m117a().m119a(5);
                                        break;
                                }
                            }
                        } else {
                            if (this.f221j != f214e.length - 1) {
                                this.f221j++;
                            } else {
                                this.f221j = 0;
                            }
                            break;
                        }
                    } else {
                        if (this.f221j != 0) {
                            this.f221j--;
                        } else {
                            this.f221j = f214e.length - 1;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (i != 50 && i2 != 1) {
                        if (i != 56 && i2 != 6) {
                            if (i != 52 && i2 != 2) {
                                if (i != 54 && i2 != 5) {
                                    if (i2 == 8) {
                                        switch (this.f222k) {
                                            case 0:
                                                this.f234w = this.f234w ? false : true;
                                                break;
                                            case 1:
                                                this.f235x = this.f235x ? false : true;
                                                break;
                                        }
                                    } else {
                                        if (i == -6 || i == -21) {
                                            this.f232u = 0;
                                            this.f222k = 0;
                                            C0028f.m130a().m141a(this.f234w);
                                            C0028f.m130a().m144b(this.f235x);
                                            this.f221j = 0;
                                            this.f219b = 0;
                                        } else if (i == -7 || i == -22) {
                                            this.f232u = 0;
                                            this.f222k = 0;
                                            this.f234w = C0028f.m130a().m146e();
                                            this.f235x = C0028f.m130a().m147f();
                                            this.f221j = 0;
                                            this.f219b = 0;
                                        }
                                        break;
                                    }
                                } else {
                                    switch (this.f222k) {
                                        case 0:
                                            this.f234w = this.f234w ? false : true;
                                            break;
                                        case 1:
                                            this.f235x = this.f235x ? false : true;
                                            break;
                                    }
                                }
                            } else {
                                switch (this.f222k) {
                                    case 0:
                                        this.f234w = this.f234w ? false : true;
                                        break;
                                    case 1:
                                        this.f235x = this.f235x ? false : true;
                                        break;
                                }
                            }
                        } else {
                            if (this.f222k != C0028f.f178d.length - 1) {
                                this.f222k++;
                            } else {
                                this.f222k = 0;
                            }
                            break;
                        }
                    } else {
                        if (this.f222k != 0) {
                            this.f222k--;
                        } else {
                            this.f222k = C0028f.f178d.length - 1;
                        }
                        break;
                    }
                    break;
                case 2:
                    if (i != 50 && i2 != 1) {
                        if (i == 56 || i2 == 6) {
                            if (this.f223l != C0028f.f180f.length - 1) {
                                this.f223l++;
                            } else {
                                this.f223l = 0;
                            }
                            break;
                        } else if (i != 52 && i2 != 2 && i != 54 && i2 != 5) {
                            if (i2 != 8 && i != -6 && i != -21) {
                                if (i == -7 || i == -22) {
                                    this.f232u = 0;
                                    this.f229r = 1;
                                    this.f230s = 1;
                                    this.f223l = 0;
                                    this.f221j = 0;
                                    this.f219b = 0;
                                }
                                break;
                            } else {
                                switch (this.f223l) {
                                    case 0:
                                        this.f232u = 0;
                                        this.f223l = 0;
                                        this.f219b = 20;
                                        break;
                                    case 1:
                                        this.f232u = 0;
                                        this.f223l = 0;
                                        this.f219b = 21;
                                        break;
                                    case 2:
                                        this.f232u = 0;
                                        this.f223l = 0;
                                        this.f219b = 22;
                                        break;
                                    case 3:
                                        this.f232u = 0;
                                        this.f223l = 0;
                                        this.f219b = 23;
                                        break;
                                    case 4:
                                        this.f232u = 0;
                                        this.f223l = 0;
                                        this.f219b = 24;
                                        break;
                                }
                            }
                        }
                    } else {
                        if (this.f223l != 0) {
                            this.f223l--;
                        } else {
                            this.f223l = C0028f.f180f.length - 1;
                        }
                        break;
                    }
                    break;
                case 11:
                    if (i != 50 && i2 != 1 && i != 56 && i2 != 6) {
                        if (i == 52 || i2 == 2) {
                            if (this.f229r > 1) {
                                this.f232u = 0;
                                this.f229r--;
                            }
                        } else if (i == 54 || i2 == 5) {
                            if (this.f229r < this.f230s) {
                                this.f232u = 0;
                                this.f229r++;
                            }
                        } else if (i2 == 8 || i == -7 || i == -22) {
                            this.f232u = 0;
                            this.f229r = 1;
                            this.f230s = 1;
                            this.f221j = 0;
                            this.f219b = 0;
                        }
                        break;
                    }
                    break;
                case 12:
                    String[] strArr = RunnableC0025f.m117a().m125f() == 1 ? C0045w.m228a().m241g() == C0045w.m228a().m238d().size() + (-1) ? f216g : f215f : f217h;
                    if (i != 50 && i2 != 1) {
                        if (i != 56 && i2 != 6) {
                            if (i2 == 8 || i == -6 || i == -21) {
                                if (RunnableC0025f.m117a().m125f() == 1) {
                                    if (C0045w.m228a().m241g() == C0045w.m228a().m238d().size() - 1) {
                                        switch (this.f224m) {
                                            case 0:
                                                this.f224m = 0;
                                                this.f220c = false;
                                                RunnableC0025f.m117a().m119a(4);
                                                break;
                                            case 1:
                                                this.f224m = 0;
                                                this.f220c = false;
                                                RunnableC0025f.m117a().m119a(5);
                                                break;
                                        }
                                    } else {
                                        switch (this.f224m) {
                                            case 0:
                                                this.f224m = 0;
                                                this.f220c = false;
                                                RunnableC0025f.m117a().m119a(6);
                                                break;
                                            case 1:
                                                this.f224m = 0;
                                                this.f220c = false;
                                                RunnableC0025f.m117a().m119a(4);
                                                break;
                                            case 2:
                                                this.f224m = 0;
                                                this.f220c = false;
                                                RunnableC0025f.m117a().m119a(5);
                                                break;
                                        }
                                    }
                                } else {
                                    switch (this.f224m) {
                                        case 0:
                                            this.f224m = 0;
                                            this.f220c = false;
                                            RunnableC0025f.m117a().m119a(4);
                                            break;
                                        case 1:
                                            this.f224m = 0;
                                            this.f220c = false;
                                            RunnableC0025f.m117a().m119a(5);
                                            break;
                                    }
                                }
                            }
                        } else {
                            if (this.f224m != strArr.length - 1) {
                                this.f224m++;
                            } else {
                                this.f224m = 0;
                            }
                            break;
                        }
                    } else {
                        if (this.f224m != 0) {
                            this.f224m--;
                        } else {
                            this.f224m = strArr.length - 1;
                        }
                        break;
                    }
                    break;
                case 20:
                    if (i != 50 && i2 != 1 && i != 56 && i2 != 6) {
                        if (i != 52 && i2 != 2) {
                            if (i == 54 || i2 == 5) {
                                if (this.f229r < this.f230s) {
                                    this.f232u = 0;
                                    this.f229r++;
                                }
                                break;
                            } else if (i2 != 8 && i != -6 && i != -21) {
                                if (i == -7 || i == -22) {
                                    this.f232u = 0;
                                    this.f229r = 1;
                                    this.f230s = 1;
                                    this.f223l = 0;
                                    this.f219b = 2;
                                }
                                break;
                            }
                        } else {
                            if (this.f229r > 1) {
                                this.f232u = 0;
                                this.f229r--;
                            }
                            break;
                        }
                    }
                    break;
                case 21:
                    if (i != 50 && i2 != 1 && i != 56 && i2 != 6) {
                        if (i != 52 && i2 != 2) {
                            if (i == 54 || i2 == 5) {
                                if (this.f229r < this.f230s) {
                                    this.f232u = 0;
                                    this.f229r++;
                                }
                                break;
                            } else if (i2 != 8 && i != -6 && i != -21) {
                                if (i == -7 || i == -22) {
                                    this.f232u = 0;
                                    this.f229r = 1;
                                    this.f230s = 1;
                                    this.f223l = 0;
                                    this.f219b = 2;
                                }
                                break;
                            }
                        } else {
                            if (this.f229r > 1) {
                                this.f232u = 0;
                                this.f229r--;
                            }
                            break;
                        }
                    }
                    break;
                case 22:
                    if (i != 50 && i2 != 1 && i != 56 && i2 != 6) {
                        if (i != 52 && i2 != 2) {
                            if (i == 54 || i2 == 5) {
                                if (this.f229r < this.f230s) {
                                    this.f232u = 0;
                                    this.f229r++;
                                }
                                break;
                            } else if (i2 != 8 && i != -6 && i != -21) {
                                if (i == -7 || i == -22) {
                                    this.f232u = 0;
                                    this.f229r = 1;
                                    this.f230s = 1;
                                    this.f223l = 0;
                                    this.f219b = 2;
                                }
                                break;
                            }
                        } else {
                            if (this.f229r > 1) {
                                this.f232u = 0;
                                this.f229r--;
                            }
                            break;
                        }
                    }
                    break;
                case 23:
                    if (i != 50 && i2 != 1 && i != 56 && i2 != 6) {
                        if (i != 52 && i2 != 2) {
                            if (i == 54 || i2 == 5) {
                                if (this.f229r < this.f230s) {
                                    this.f232u = 0;
                                    this.f229r++;
                                }
                                break;
                            } else if (i2 != 8 && i != -6 && i != -21) {
                                if (i == -7 || i == -22) {
                                    this.f232u = 0;
                                    this.f229r = 1;
                                    this.f230s = 1;
                                    this.f223l = 0;
                                    this.f219b = 2;
                                }
                                break;
                            }
                        } else {
                            if (this.f229r > 1) {
                                this.f232u = 0;
                                this.f229r--;
                            }
                            break;
                        }
                    }
                    break;
                case 24:
                    if (i != 50 && i2 != 1 && i != 56 && i2 != 6) {
                        if (i != 52 && i2 != 2) {
                            if (i == 54 || i2 == 5) {
                                if (this.f229r < this.f230s) {
                                    this.f232u = 0;
                                    this.f229r++;
                                }
                                break;
                            } else if (i2 != 8 && i != -6 && i != -21) {
                                if (i == -7 || i == -22) {
                                    this.f232u = 0;
                                    this.f229r = 1;
                                    this.f230s = 1;
                                    this.f223l = 0;
                                    this.f219b = 2;
                                }
                                break;
                            }
                        } else {
                            if (this.f229r > 1) {
                                this.f232u = 0;
                                this.f229r--;
                            }
                            break;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m154a(Graphics graphics, C0022c c0022c) {
        String[] strArr;
        String str;
        if (this.f220c) {
            switch (this.f219b) {
                case 0:
                    int width = c0022c.getWidth();
                    int height = c0022c.getHeight();
                    m149a(graphics, width, height);
                    m150a(graphics, c0022c, f213d[0], f214e, this.f221j);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[0].length() * 6) + 7, C0028f.f187m.getHeight(), 0, 0, height - C0028f.f187m.getHeight(), 20);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[2].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width - (C0028f.f186l[2].length() * 6)) - 8, height - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[0], C0028f.f186l[0].length(), graphics, width, 4, height - C0028f.f187m.getHeight(), -1);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[2], C0028f.f186l[2].length(), graphics, width, (width - (C0028f.f186l[2].length() * 6)) - 4, height - C0028f.f187m.getHeight(), -1);
                    m151b(graphics, c0022c);
                    break;
                case 1:
                    int width2 = c0022c.getWidth();
                    int height2 = c0022c.getHeight();
                    m149a(graphics, width2, height2);
                    String str2 = C0028f.f178d[0];
                    String str3 = this.f234w ? C0028f.f179e[0] : C0028f.f179e[1];
                    String str4 = C0028f.f178d[1];
                    String str5 = this.f235x ? C0028f.f179e[0] : C0028f.f179e[1];
                    String string = "";
                    for (int i = 0; i < (18 - str2.length()) - str3.length(); i++) {
                        string = new StringBuffer(String.valueOf(string)).append(" ").toString();
                    }
                    String string2 = "";
                    int i2 = 0;
                    while (true) {
                        String str6 = string2;
                        if (i2 >= (18 - str4.length()) - str5.length()) {
                            m150a(graphics, c0022c, f213d[2], new String[]{new StringBuffer(String.valueOf(str2)).append(string).append("<").append(str3).append(">").toString(), new StringBuffer(String.valueOf(str4)).append(str6).append("<").append(str5).append(">").toString()}, this.f222k);
                            graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[0].length() * 6) + 7, C0028f.f187m.getHeight(), 0, 0, height2 - C0028f.f187m.getHeight(), 20);
                            graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[3].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width2 - (C0028f.f186l[3].length() * 6)) - 8, height2 - C0028f.f187m.getHeight(), 20);
                            C0028f.m130a();
                            C0028f.m132a(C0028f.f186l[0], C0028f.f186l[0].length(), graphics, width2, 4, height2 - C0028f.f187m.getHeight(), -1);
                            C0028f.m130a();
                            C0028f.m132a(C0028f.f186l[3], C0028f.f186l[3].length(), graphics, width2, (width2 - (C0028f.f186l[3].length() * 6)) - 4, height2 - C0028f.f187m.getHeight(), -1);
                            m151b(graphics, c0022c);
                        } else {
                            string2 = new StringBuffer(String.valueOf(str6)).append(" ").toString();
                            i2++;
                        }
                        break;
                    }
                    break;
                case 2:
                    int width3 = c0022c.getWidth();
                    int height3 = c0022c.getHeight();
                    m149a(graphics, width3, height3);
                    m150a(graphics, c0022c, f213d[3], C0028f.f180f, this.f223l);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[0].length() * 6) + 7, C0028f.f187m.getHeight(), 0, 0, c0022c.getHeight() - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    String str7 = C0028f.f186l[0];
                    int length = C0028f.f186l[0].length();
                    int width4 = c0022c.getWidth();
                    c0022c.getHeight();
                    C0028f.m132a(str7, length, graphics, width4, 4, c0022c.getHeight() - C0028f.f187m.getHeight(), -1);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[2].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width3 - (C0028f.f186l[2].length() * 6)) - 8, height3 - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[2], C0028f.f186l[2].length(), graphics, width3, (width3 - (C0028f.f186l[2].length() * 6)) - 4, height3 - C0028f.f187m.getHeight(), -1);
                    m151b(graphics, c0022c);
                    break;
                case 11:
                    int width5 = c0022c.getWidth();
                    int height4 = c0022c.getHeight();
                    m149a(graphics, width5, height4);
                    m150a(graphics, c0022c, C0028f.f177c[6], ((C0004ad) C0045w.m228a().m238d().elementAt(C0028f.m130a().f201a)).f14c, -1);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[2].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width5 - (C0028f.f186l[2].length() * 6)) - 8, height4 - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[2], C0028f.f186l[2].length(), graphics, width5, (width5 - (C0028f.f186l[2].length() * 6)) - 4, height4 - C0028f.f187m.getHeight(), -1);
                    m151b(graphics, c0022c);
                    break;
                case 12:
                    int width6 = c0022c.getWidth();
                    int height5 = c0022c.getHeight();
                    m149a(graphics, width6, height5);
                    if (RunnableC0025f.m117a().m125f() != 1) {
                        strArr = f217h;
                        str = f218i[1];
                    } else if (C0045w.m228a().m241g() == C0045w.m228a().m238d().size() - 1) {
                        strArr = f216g;
                        str = f218i[0];
                    } else {
                        strArr = f215f;
                        str = f218i[0];
                    }
                    C0028f.m130a();
                    C0028f.m132a(str, str.length(), graphics, width6, (width6 - (str.length() * 6)) / 2, height5 / 4, -1);
                    m150a(graphics, c0022c, "", strArr, this.f224m);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[0].length() * 6) + 7, C0028f.f187m.getHeight(), 0, 0, height5 - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[0], C0028f.f186l[0].length(), graphics, width6, 4, height5 - C0028f.f187m.getHeight(), -1);
                    break;
                case 20:
                    int width7 = c0022c.getWidth();
                    int height6 = c0022c.getHeight();
                    m149a(graphics, width7, height6);
                    m150a(graphics, c0022c, C0028f.f180f[0], C0028f.f181g, -1);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[2].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width7 - (C0028f.f186l[2].length() * 6)) - 8, height6 - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[2], C0028f.f186l[2].length(), graphics, width7, (width7 - (C0028f.f186l[2].length() * 6)) - 4, height6 - C0028f.f187m.getHeight(), -1);
                    m151b(graphics, c0022c);
                    break;
                case 21:
                    int width8 = c0022c.getWidth();
                    int height7 = c0022c.getHeight();
                    m149a(graphics, width8, height7);
                    m150a(graphics, c0022c, C0028f.f180f[1], C0028f.f182h, -1);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[2].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width8 - (C0028f.f186l[2].length() * 6)) - 8, height7 - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[2], C0028f.f186l[2].length(), graphics, width8, (width8 - (C0028f.f186l[2].length() * 6)) - 4, height7 - C0028f.f187m.getHeight(), -1);
                    m151b(graphics, c0022c);
                    break;
                case 22:
                    int width9 = c0022c.getWidth();
                    int height8 = c0022c.getHeight();
                    m149a(graphics, width9, height8);
                    m150a(graphics, c0022c, C0028f.f180f[2], C0028f.f183i, -1);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[2].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width9 - (C0028f.f186l[2].length() * 6)) - 8, height8 - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[2], C0028f.f186l[2].length(), graphics, width9, (width9 - (C0028f.f186l[2].length() * 6)) - 4, height8 - C0028f.f187m.getHeight(), -1);
                    m151b(graphics, c0022c);
                    break;
                case 23:
                    int width10 = c0022c.getWidth();
                    int height9 = c0022c.getHeight();
                    m149a(graphics, width10, height9);
                    m150a(graphics, c0022c, C0028f.f180f[3], C0028f.f184j, -1);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[2].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width10 - (C0028f.f186l[2].length() * 6)) - 8, height9 - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[2], C0028f.f186l[2].length(), graphics, width10, (width10 - (C0028f.f186l[2].length() * 6)) - 4, height9 - C0028f.f187m.getHeight(), -1);
                    m151b(graphics, c0022c);
                    break;
                case 24:
                    int width11 = c0022c.getWidth();
                    int height10 = c0022c.getHeight();
                    m149a(graphics, width11, height10);
                    m149a(graphics, width11, height10);
                    m150a(graphics, c0022c, C0028f.f180f[4], C0028f.f185k, -1);
                    graphics.drawRegion(C0028f.f187m, 0, 0, (C0028f.f186l[2].length() * 6) + 7, C0028f.f187m.getHeight(), 0, (width11 - (C0028f.f186l[2].length() * 6)) - 8, height10 - C0028f.f187m.getHeight(), 20);
                    C0028f.m130a();
                    C0028f.m132a(C0028f.f186l[2], C0028f.f186l[2].length(), graphics, width11, (width11 - (C0028f.f186l[2].length() * 6)) - 4, height10 - C0028f.f187m.getHeight(), -1);
                    m151b(graphics, c0022c);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m155b() {
        this.f221j = 0;
        this.f220c = true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m156c() {
        return this.f220c;
    }
}
