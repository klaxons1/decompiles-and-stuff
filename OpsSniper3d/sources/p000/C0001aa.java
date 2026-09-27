package p000;

import com.m3gworks.engine.RunnableC0025f;
import javax.microedition.m3g.Mesh;

/* JADX INFO: renamed from: aa */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0001aa {

    /* JADX INFO: renamed from: a */
    public Mesh f1a;

    /* JADX INFO: renamed from: b */
    public Mesh f2b;

    /* JADX INFO: renamed from: c */
    public boolean f3c;

    /* JADX INFO: renamed from: d */
    public int f4d;

    /* JADX INFO: renamed from: e */
    public int f5e;

    /* JADX INFO: renamed from: f */
    private boolean f6f;

    public C0001aa() {
        this.f3c = false;
    }

    public C0001aa(int i, int i2, boolean z) {
        this.f3c = false;
        this.f4d = i;
        this.f5e = i2;
        this.f6f = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m3a() {
        boolean z = false;
        this.f3c = true;
        this.f1a.setRenderingEnable(false);
        this.f1a.setPickingEnable(false);
        this.f2b.setRenderingEnable(true);
        this.f2b.setPickingEnable(true);
        C0004ad c0004adM240f = C0045w.m228a().m240f();
        if (c0004adM240f.f20i != null) {
            C0026d c0026dM18b = c0004adM240f.m18b();
            if (c0026dM18b.f157d == 3) {
                int i = 0;
                while (true) {
                    if (i < c0026dM18b.f162i.length) {
                        if (!c0026dM18b.f162i[i].f3c && c0026dM18b.f162i[i].f6f) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    RunnableC0025f.m117a().m120a(c0026dM18b);
                }
            }
        }
    }
}
