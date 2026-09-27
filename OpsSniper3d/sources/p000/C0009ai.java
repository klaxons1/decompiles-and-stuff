package p000;

import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: ai */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0009ai {

    /* JADX INFO: renamed from: a */
    public int f35a;

    /* JADX INFO: renamed from: b */
    public float f36b;

    /* JADX INFO: renamed from: c */
    public boolean f37c;

    /* JADX INFO: renamed from: d */
    public int f38d;

    /* JADX INFO: renamed from: e */
    public boolean f39e;

    /* JADX INFO: renamed from: f */
    private float[] f40f;

    /* JADX INFO: renamed from: g */
    private float f41g;

    public C0009ai() {
        this.f36b = -1.0f;
        this.f37c = false;
        this.f38d = 0;
        this.f39e = false;
    }

    public C0009ai(int i, float[] fArr, float f, float f2, boolean z) {
        this.f36b = -1.0f;
        this.f37c = false;
        this.f38d = 0;
        this.f39e = false;
        this.f35a = i;
        this.f40f = null;
        this.f41g = f2;
        if (i == -1) {
            this.f38d = -16777216;
        } else if (i == -2) {
            this.f38d = 0;
        }
        this.f39e = z;
    }

    /* JADX INFO: renamed from: a */
    private int m31a(int i) {
        if (i != -1) {
            if (i == -2) {
                switch (this.f38d) {
                    case -1728053248:
                        this.f38d = -1157627904;
                        break;
                    case -1157627904:
                        this.f38d = -587202560;
                        break;
                    case -587202560:
                        this.f38d = -16777216;
                        break;
                    case 0:
                        this.f38d = 285212672;
                        break;
                    case 285212672:
                        this.f38d = 855638016;
                        break;
                    case 855638016:
                        this.f38d = 1426063360;
                        break;
                    case 1426063360:
                        this.f38d = 1996488704;
                        break;
                    case 1996488704:
                        this.f38d = -1728053248;
                        break;
                }
            }
        } else {
            switch (this.f38d) {
                case -1728053248:
                    this.f38d = 1996488704;
                    break;
                case -1157627904:
                    this.f38d = -1728053248;
                    break;
                case -587202560:
                    this.f38d = -1157627904;
                    break;
                case -16777216:
                    this.f38d = -587202560;
                    break;
                case 285212672:
                    this.f38d = 0;
                    break;
                case 855638016:
                    this.f38d = 285212672;
                    break;
                case 1426063360:
                    this.f38d = 855638016;
                    break;
                case 1996488704:
                    this.f38d = 1426063360;
                    break;
            }
        }
        return this.f38d;
    }

    /* JADX INFO: renamed from: a */
    public final void m32a() {
        if (this.f37c) {
        }
        C0015ao c0015ao = (C0015ao) C0045w.m228a().m240f().f18g;
        if (this.f36b == -1.0f && this.f40f != null) {
            c0015ao.m214o().m189c().setTranslation(this.f40f[0], this.f40f[1], this.f40f[2]);
            this.f36b = 0.0f;
            return;
        }
        switch (this.f35a) {
            case -2:
                this.f38d = m31a(this.f35a);
                this.f36b += 1.0f;
                C0045w.m228a().m240f().m18b().f165l = this.f38d;
                if (this.f38d == -16777216) {
                    this.f37c = true;
                }
                break;
            case -1:
                this.f38d = m31a(this.f35a);
                this.f36b += 1.0f;
                C0045w.m228a().m240f().m18b().f165l = this.f38d;
                if (this.f38d == 0) {
                    this.f37c = true;
                }
                break;
            case 1:
                c0015ao.m226e(new float[]{0.2f, 0.0f, 0.0f});
                this.f36b += 0.2f;
                if (this.f36b >= this.f41g) {
                    this.f37c = true;
                }
                break;
            case 2:
                c0015ao.m226e(new float[]{-0.2f, 0.0f, 0.0f});
                this.f36b += 0.2f;
                if (this.f36b >= this.f41g) {
                    this.f37c = true;
                }
                break;
            case 3:
                c0015ao.m226e(new float[]{0.0f, 0.2f, 0.0f});
                this.f36b += 0.2f;
                if (this.f36b >= this.f41g) {
                    this.f37c = true;
                }
                break;
            case 4:
                c0015ao.m226e(new float[]{0.0f, -0.2f, 0.0f});
                this.f36b += 0.2f;
                if (this.f36b >= this.f41g) {
                    this.f37c = true;
                }
                break;
            case 5:
                c0015ao.m226e(new float[]{0.0f, 0.0f, 0.2f});
                this.f36b += 0.2f;
                if (this.f36b >= this.f41g) {
                    this.f37c = true;
                }
                break;
            case 6:
                c0015ao.m226e(new float[]{0.0f, 0.0f, -0.2f});
                this.f36b += 0.2f;
                if (this.f36b >= this.f41g) {
                    this.f37c = true;
                }
                break;
            case 8:
                C0039q c0039q = (C0039q) C0045w.m228a().m240f().f19h;
                if (this.f36b == 0.0f) {
                    c0039q.mo11e();
                    c0039q.m212m()[0] = c0015ao.m212m()[0];
                    c0039q.m212m()[1] = 0.0f;
                    c0039q.m212m()[2] = c0015ao.m212m()[2];
                    c0039q.m197a(true);
                }
                this.f36b += 1.0f;
                if (this.f36b % C0041s.f297d[5][1] == 0.0f) {
                    c0039q.m173a(5, c0039q.m205a(1, 3.0f));
                }
                float[] fArr = new float[3];
                float[] fArr2 = {c0039q.m212m()[0], c0015ao.m212m()[1], c0039q.m212m()[2]};
                Camera cameraM190d = C0000a.m0a().m190d();
                cameraM190d.getTranslation(fArr);
                C0038p.m195a(cameraM190d, fArr, fArr2, new float[]{0.0f, 1.0f, 0.0f}, null);
                Transform transform = new Transform();
                cameraM190d.getTransform(transform);
                ((AbstractC0044v) C0045w.m228a().m240f().f18g).m225a(transform);
                if (this.f36b > (C0041s.f297d[5][1] << 2)) {
                    this.f37c = true;
                }
                break;
            case 10:
                this.f36b += 1.0f;
                C0045w.m228a().m240f().m18b().f165l = 0;
                if (this.f36b >= this.f41g) {
                    this.f37c = true;
                }
                break;
            case 11:
                ((C0039q) C0045w.m228a().m240f().f19h).m197a(false);
                this.f37c = true;
                break;
            case 12:
                this.f36b += 1.0f;
                if (C0045w.m228a().f327a != null) {
                    C0045w.m228a().f327a.translate(-0.5f, 0.08f, -0.5f);
                    float[] fArr3 = new float[3];
                    float[] fArr4 = new float[3];
                    C0045w.m228a().f327a.getTranslation(fArr4);
                    Camera cameraM190d2 = C0000a.m0a().m190d();
                    cameraM190d2.getTranslation(fArr3);
                    C0038p.m195a(cameraM190d2, fArr3, fArr4, new float[]{0.0f, 1.0f, 0.0f}, null);
                    Transform transform2 = new Transform();
                    cameraM190d2.getTransform(transform2);
                    ((AbstractC0044v) C0045w.m228a().m240f().f18g).m225a(transform2);
                } else {
                    this.f37c = true;
                }
                if (this.f36b >= 170.0f) {
                    this.f37c = true;
                }
                break;
        }
    }
}
