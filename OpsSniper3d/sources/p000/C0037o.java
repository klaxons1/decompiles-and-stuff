package p000;

import javax.microedition.m3g.Background;

/* JADX INFO: renamed from: o */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0037o {

    /* JADX INFO: renamed from: a */
    public int f280a;

    /* JADX INFO: renamed from: b */
    public float f281b;

    /* JADX INFO: renamed from: c */
    public boolean f282c;

    /* JADX INFO: renamed from: d */
    public int f283d;

    /* JADX INFO: renamed from: e */
    private float[] f284e;

    /* JADX INFO: renamed from: f */
    private float f285f;

    /* JADX INFO: renamed from: g */
    private float f286g;

    public C0037o() {
        this.f281b = -1.0f;
        this.f282c = false;
        this.f283d = 0;
    }

    public C0037o(int i, float[] fArr, float f, float f2) {
        this.f281b = -1.0f;
        this.f282c = false;
        this.f283d = 0;
        this.f280a = i;
        this.f284e = fArr;
        this.f285f = f;
        this.f286g = f2;
        if (i == -1) {
            this.f283d = -16777216;
        } else if (i == -2) {
            this.f283d = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m192a(int i) {
        if (i != -1) {
            if (i == -2) {
                switch (this.f283d) {
                    case -1728053248:
                        this.f283d = -1157627904;
                        break;
                    case -1157627904:
                        this.f283d = -587202560;
                        break;
                    case -587202560:
                        this.f283d = -16777216;
                        break;
                    case 0:
                        this.f283d = 285212672;
                        break;
                    case 285212672:
                        this.f283d = 855638016;
                        break;
                    case 855638016:
                        this.f283d = 1426063360;
                        break;
                    case 1426063360:
                        this.f283d = 1996488704;
                        break;
                    case 1996488704:
                        this.f283d = -1728053248;
                        break;
                }
            }
        } else {
            switch (this.f283d) {
                case -1728053248:
                    this.f283d = 1996488704;
                    break;
                case -1157627904:
                    this.f283d = -1728053248;
                    break;
                case -587202560:
                    this.f283d = -1157627904;
                    break;
                case -16777216:
                    this.f283d = -587202560;
                    break;
                case 285212672:
                    this.f283d = 0;
                    break;
                case 855638016:
                    this.f283d = 285212672;
                    break;
                case 1426063360:
                    this.f283d = 855638016;
                    break;
                case 1996488704:
                    this.f283d = 1426063360;
                    break;
            }
        }
        return this.f283d;
    }

    /* JADX INFO: renamed from: a */
    public final void m193a() {
        if (this.f282c) {
        }
        C0015ao c0015ao = (C0015ao) C0045w.m228a().m240f().f18g;
        if (this.f281b == -1.0f && this.f280a == -1) {
            if (this.f285f == 0.0f) {
                c0015ao.m227g();
            } else if (this.f285f > 0.0f) {
                c0015ao.m227g();
                c0015ao.mo176c(this.f285f);
            }
        }
        if (this.f281b == -1.0f && this.f284e != null) {
            c0015ao.m212m()[0] = this.f284e[0];
            c0015ao.m212m()[1] = this.f284e[1];
            c0015ao.m212m()[2] = this.f284e[2];
            this.f281b = 0.0f;
            return;
        }
        switch (this.f280a) {
            case -2:
                this.f283d = m192a(this.f280a);
                this.f281b += 1.0f;
                C0045w.m228a().m240f().f24m = this.f283d;
                if (this.f283d == -16777216) {
                    this.f282c = true;
                }
                break;
            case -1:
                this.f283d = m192a(this.f280a);
                this.f281b += 1.0f;
                C0045w.m228a().m240f().f24m = this.f283d;
                if (this.f283d == 0) {
                    this.f282c = true;
                }
                break;
            case 1:
                c0015ao.m226e(new float[]{0.2f, 0.0f, 0.0f});
                this.f281b += 0.2f;
                if (this.f281b >= this.f286g) {
                    this.f282c = true;
                }
                break;
            case 2:
                c0015ao.m226e(new float[]{-0.2f, 0.0f, 0.0f});
                this.f281b += 0.2f;
                if (this.f281b >= this.f286g) {
                    this.f282c = true;
                }
                break;
            case 3:
                c0015ao.m226e(new float[]{0.0f, 0.2f, 0.0f});
                this.f281b += 0.2f;
                if (this.f281b >= this.f286g) {
                    this.f282c = true;
                }
                break;
            case 4:
                c0015ao.m226e(new float[]{0.0f, -0.2f, 0.0f});
                this.f281b += 0.2f;
                if (this.f281b >= this.f286g) {
                    this.f282c = true;
                }
                break;
            case 5:
                c0015ao.m226e(new float[]{0.0f, 0.0f, 0.2f});
                this.f281b += 0.2f;
                if (this.f281b >= this.f286g) {
                    this.f282c = true;
                }
                break;
            case 6:
                c0015ao.m226e(new float[]{0.0f, 0.0f, -0.2f});
                this.f281b += 0.2f;
                if (this.f281b >= this.f286g) {
                    this.f282c = true;
                }
                break;
            case 7:
                float fMo177d = c0015ao.mo177d(1.0f);
                Background background = C0045w.m228a().m239e().getBackground();
                if (background != null) {
                    background.setCrop(((int) (fMo177d * (background.getCropWidth() / 60.0f))) + background.getCropX(), background.getCropY(), background.getCropWidth(), background.getCropHeight());
                }
                this.f281b += 1.0f;
                if (this.f281b >= this.f286g) {
                    this.f282c = true;
                }
                break;
            case 8:
                float fMo176c = c0015ao.mo176c(1.0f);
                Background background2 = C0045w.m228a().m239e().getBackground();
                if (background2 != null) {
                    background2.setCrop(background2.getCropX() - ((int) (fMo176c * (background2.getCropWidth() / 60.0f))), background2.getCropY(), background2.getCropWidth(), background2.getCropHeight());
                }
                this.f281b += 1.0f;
                if (this.f281b >= this.f286g) {
                    this.f282c = true;
                }
                break;
        }
    }
}
