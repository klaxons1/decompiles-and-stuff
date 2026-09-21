package p000;

import com.lightningtoads.jdropscape.Dropscape;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: ak */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class RunnableC0011ak extends C0052x implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final byte[] f107a = {67, 67, 72, 83};

    /* JADX INFO: renamed from: b */
    public RunnableC0020at f108b;

    /* JADX INFO: renamed from: c */
    public Object f109c;

    /* JADX INFO: renamed from: d */
    public C0030bc f110d;

    /* JADX INFO: renamed from: e */
    public Thread f111e;

    /* JADX INFO: renamed from: u */
    public String f112u;

    /* JADX INFO: renamed from: v */
    public String f113v;

    public RunnableC0011ak(C0030bc c0030bc) {
        super(C0026az.m177a(C0026az.f260I), new String[]{C0026az.m177a(C0026az.f325z)}, c0030bc);
        this.f108b = new RunnableC0020at();
        this.f109c = new Object();
        this.f110d = c0030bc;
    }

    /* JADX INFO: renamed from: a */
    private void m90a(C0036h c0036h) throws Exception {
        byte[] bArr = new byte[f107a.length];
        c0036h.m282b(f107a);
        int i = 0;
        while (i < 1000 && !c0036h.m281a()) {
            Thread.sleep(1L);
            i++;
        }
        if (i == 1000) {
            throw new Exception("Server handshake timeout");
        }
        c0036h.m280a(bArr);
        for (int i2 = 0; i2 < f107a.length; i2++) {
            if (bArr[i2] != f107a[i2]) {
                throw new Exception("Server handshake mismatch");
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new DataOutputStream(byteArrayOutputStream).writeUTF(this.f113v);
        c0036h.m282b(byteArrayOutputStream.toByteArray());
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final int mo7a() {
        return 4;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final void mo9a(Graphics graphics) {
        int i = C0052x.f539i - 24;
        int i2 = i / 2;
        int height = graphics.getFont().getHeight() / 2;
        int i3 = i / 4;
        graphics.setColor(16777215);
        graphics.drawString(this.f547q, 0, ((-i2) + (i3 / 2)) - height, 17);
        if (this.f112u != null) {
            int i4 = (((-i2) + i3) + (i3 / 2)) - height;
            synchronized (this.f109c) {
                graphics.drawString(this.f112u, 0, i4, 17);
            }
        }
        graphics.setColor(this.f543m % 500 < 250 ? 16223774 : 16378665);
        graphics.drawString(this.f548r[0], 0, (((-i2) + (i3 * 3)) + (i3 / 2)) - height, 17);
    }

    /* JADX INFO: renamed from: b */
    public final void m91b() {
        synchronized (this.f109c) {
            this.f112u = C0026az.m177a(C0026az.f258G);
        }
        this.f111e = new Thread(this);
        this.f111e.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m92c() {
        this.f108b.m168b();
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: d */
    public final void mo12d() {
        C0013am.m99k().m128e();
        this.f112u = C0026az.m177a(C0026az.f259H);
        this.f108b.m167a("4F41EC690AB349B89662473C33DC26D2", this, 64);
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: e */
    public final void mo13e() {
        this.f549s.mo116a(this, -1);
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: g */
    public final void mo14g() {
        this.f108b.m166a();
        this.f111e = null;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: h */
    public final void mo15h() {
        mo14g();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0036h c0036h = this.f108b.f241d;
        try {
            m90a(c0036h);
        } catch (Exception e) {
            c0036h = null;
        }
        synchronized (this.f109c) {
            if (this.f111e != null) {
                if (c0036h == null) {
                    this.f112u = C0026az.m177a(C0026az.f257F);
                } else {
                    this.f112u = C0026az.m177a(C0026az.f256E);
                    C0013am.m99k().m112a(c0036h, true, this.f113v);
                    this.f110d.f374y = true;
                    this.f110d.m208b().m141a(Dropscape.f384b);
                }
                this.f111e = null;
            }
        }
    }
}
