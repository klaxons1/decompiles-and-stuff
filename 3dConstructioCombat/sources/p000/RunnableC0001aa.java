package p000;

import com.lightningtoads.jdropscape.Dropscape;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: aa */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class RunnableC0001aa extends C0052x implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final byte[] f7a = {67, 67, 72, 83};

    /* JADX INFO: renamed from: b */
    public C0039k f8b;

    /* JADX INFO: renamed from: c */
    public C0054z f9c;

    /* JADX INFO: renamed from: d */
    public C0014an f10d;

    /* JADX INFO: renamed from: e */
    public boolean f11e;

    /* JADX INFO: renamed from: u */
    public Object f12u;

    /* JADX INFO: renamed from: v */
    public Thread f13v;

    /* JADX INFO: renamed from: w */
    public C0030bc f14w;

    /* JADX INFO: renamed from: x */
    public String f15x;

    public RunnableC0001aa(C0030bc c0030bc) {
        super(C0026az.m177a(C0026az.f252A), new String[]{C0026az.m177a(C0026az.f325z)}, c0030bc);
        this.f8b = new C0039k("4F41EC690AB349B89662473C33DC26D2");
        this.f10d = new C0014an();
        this.f12u = new Object();
        this.f14w = c0030bc;
    }

    /* JADX INFO: renamed from: a */
    private void m5a(C0036h c0036h) throws Exception {
        int i = 0;
        byte[] bArr = new byte[f7a.length];
        int i2 = 0;
        while (i2 < 1000 && !c0036h.m281a()) {
            Thread.sleep(1L);
            i2++;
        }
        if (i2 == 1000) {
            throw new Exception("Client handshake timeout");
        }
        c0036h.m280a(bArr);
        for (int i3 = 0; i3 < f7a.length; i3++) {
            if (bArr[i3] != f7a[i3]) {
                throw new Exception("Client handshake mismatch");
            }
        }
        c0036h.m282b(f7a);
        while (i < 1000 && !c0036h.m281a()) {
            Thread.sleep(1L);
            i++;
        }
        if (i == 1000) {
            throw new Exception("Client handshake timeout");
        }
        byte[] bArr2 = new byte[128];
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr2));
        c0036h.m280a(bArr2);
        this.f15x = dataInputStream.readUTF();
    }

    /* JADX INFO: renamed from: i */
    private void m6i() {
        synchronized (this.f12u) {
            this.f547q = C0026az.m177a(C0026az.f254C);
            this.f548r = new String[]{C0026az.m177a(C0026az.f325z)};
        }
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final int mo7a() {
        int iMo7a;
        synchronized (this.f12u) {
            iMo7a = super.mo7a();
        }
        return iMo7a;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final void mo8a(int i) {
        synchronized (this.f12u) {
            super.mo8a(i);
        }
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final void mo9a(Graphics graphics) {
        synchronized (this.f12u) {
            super.mo9a(graphics);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10b() {
        String[] strArr = new String[this.f8b.m296c() + 1];
        for (int i = 0; i < this.f8b.m296c(); i++) {
            strArr[i] = this.f8b.m292a(i).m346a();
            if (strArr[i] == null) {
                strArr[i] = C0026az.m177a(C0026az.f278a);
            }
        }
        strArr[strArr.length - 1] = C0026az.m177a(C0026az.f325z);
        synchronized (this.f12u) {
            this.f548r = strArr;
            this.f547q = C0026az.m177a(this.f548r.length == 1 ? C0026az.f324y : C0026az.f323x);
            this.f11e = true;
            m336f();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11c() {
        this.f10d.m134a();
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: d */
    public final void mo12d() {
        if (this.f11e) {
            this.f11e = false;
            return;
        }
        C0013am.m99k().m128e();
        m6i();
        try {
            this.f8b.m294a(this);
        } catch (Exception e) {
            m10b();
        }
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: e */
    public final void mo13e() {
        synchronized (this.f12u) {
            if (this.f544n == this.f548r.length - 1) {
                this.f549s.mo116a(this, -1);
            } else if (this.f13v == null && this.f544n < this.f8b.m296c()) {
                this.f547q = C0026az.m177a(C0026az.f253B);
                this.f9c = this.f8b.m292a(this.f544n);
                this.f13v = new Thread(this);
                this.f13v.start();
            }
        }
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: g */
    public final void mo14g() {
        this.f13v = null;
        this.f11e = false;
        try {
            this.f8b.m293a();
        } catch (Exception e) {
        }
        m6i();
        this.f8b.m295b();
        this.f9c = null;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: h */
    public final void mo15h() {
        mo14g();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0036h c0036h;
        try {
            this.f10d.m135a(this.f9c);
            c0036h = this.f10d.f203c;
            m5a(c0036h);
        } catch (Exception e) {
            c0036h = null;
        }
        this.f9c = null;
        synchronized (this.f12u) {
            if (this.f13v != null) {
                if (c0036h == null) {
                    this.f547q = C0026az.m177a(C0026az.f322w);
                } else {
                    this.f547q = C0026az.m177a(C0026az.f321v);
                    C0013am.m99k().m112a(c0036h, false, this.f15x);
                    this.f14w.f374y = true;
                    this.f14w.m208b().m141a(Dropscape.f384b);
                }
                this.f13v = null;
            }
        }
    }
}
