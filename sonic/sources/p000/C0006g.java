package p000;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public final class C0006g implements InterfaceC0007h {

    /* JADX INFO: renamed from: a */
    public byte f43a;

    /* JADX INFO: renamed from: a */
    private int f44a;

    /* JADX INFO: renamed from: a */
    private Image f45a;

    /* JADX INFO: renamed from: a */
    public short f46a;

    /* JADX INFO: renamed from: b */
    public byte f47b;

    /* JADX INFO: renamed from: b */
    private int f48b;

    /* JADX INFO: renamed from: b */
    public short f49b;

    /* JADX INFO: renamed from: c */
    private int f50c;

    public C0006g() {
        this.f44a = 0;
        System.out.println("*** error! DeviceImage(tileImage, manipulation) is not possible on a midp 1 build");
    }

    public C0006g(int i, int i2) {
        this.f44a = 0;
        this.f46a = (short) 120;
        this.f49b = (short) 30;
        this.f45a = Image.createImage(120, 30);
    }

    public C0006g(int i, String str) {
        this.f44a = 0;
        m27a(C0005f.m24a(i));
    }

    public C0006g(C0006g c0006g, int i, int i2, int i3, int i4) {
        this.f44a = 0;
        this.f46a = (short) i3;
        this.f49b = (short) i4;
        this.f45a = c0006g.f45a;
        this.f48b = i;
        this.f50c = i2;
    }

    public C0006g(byte[] bArr, String str) {
        this.f44a = 0;
        m27a(bArr);
    }

    /* JADX INFO: renamed from: a */
    private void m27a(byte[] bArr) {
        try {
            this.f45a = Image.createImage(bArr, 0, bArr.length);
            this.f46a = (short) this.f45a.getWidth();
            this.f49b = (short) this.f45a.getHeight();
            System.gc();
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final Graphics m28a() {
        return this.f45a.getGraphics();
    }

    /* JADX INFO: renamed from: a */
    public final void m29a(Graphics graphics, int i, int i2) {
        graphics.drawRegion(this.f45a, this.f48b, this.f50c, this.f46a, this.f49b, 0, i + this.f43a, i2 + this.f47b, 20);
    }

    /* JADX INFO: renamed from: a */
    public final void m30a(Graphics graphics, int i, int i2, int i3) {
        graphics.drawImage(this.f45a, (236 - this.f48b) + this.f43a, (316 - this.f50c) + this.f47b, 40);
    }

    /* JADX INFO: renamed from: a */
    public final C0006g[] m31a(int i, int i2) {
        int i3 = this.f46a / i;
        int i4 = this.f49b / i2;
        C0006g[] c0006gArr = new C0006g[i4 * i3];
        int i5 = 0;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = 0;
            int i8 = i5;
            while (i7 < i3) {
                c0006gArr[i8] = new C0006g(this, i7 * i, i6 * i2, i, i2);
                i7++;
                i8++;
            }
            i6++;
            i5 = i8;
        }
        return c0006gArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m32b(Graphics graphics, int i, int i2) {
        graphics.drawImage(this.f45a, (i - this.f48b) + this.f43a, (i2 - this.f50c) + this.f47b, 20);
    }
}
