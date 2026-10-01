package p000;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VideoControl;

/* JADX INFO: renamed from: o */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
final class C0014o {

    /* JADX INFO: renamed from: a */
    static int f569a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    boolean f572a = false;

    /* JADX INFO: renamed from: a */
    private VideoControl f571a = null;

    /* JADX INFO: renamed from: a */
    private Player f570a = null;

    C0014o() {
    }

    /* JADX INFO: renamed from: a */
    final Image m254a(int i, int i2) {
        byte[] snapshot;
        int i3;
        int i4;
        this.f572a = true;
        try {
            snapshot = this.f571a.getSnapshot((String) null);
        } catch (Throwable th) {
            snapshot = null;
        }
        if (snapshot == null) {
            try {
                snapshot = this.f571a.getSnapshot("encoding=jpeg");
            } catch (Throwable th2) {
                snapshot = null;
            }
        }
        if (snapshot == null) {
            return null;
        }
        Image imageCreateImage = Image.createImage(snapshot, 0, snapshot.length);
        int width = imageCreateImage.getWidth();
        int height = imageCreateImage.getHeight();
        int[] iArr = new int[width * height];
        imageCreateImage.getRGB(iArr, 0, width, 0, 0, width, height);
        if (width > height) {
            i4 = (height * 55) / 65;
            i3 = height;
        } else {
            i3 = (width * 65) / 55;
            i4 = width;
        }
        Image imageCreateImage2 = Image.createImage(55, 65);
        Graphics graphics = imageCreateImage2.getGraphics();
        graphics.drawImage(C0011l.m202b("/av.cc"), 0, 0, 0);
        int i5 = (((width - i4) / 2) + (i4 / 55)) - ((width - i4) / 2);
        int i6 = (((height - i3) / 2) + (i3 / 65)) - ((height - i3) / 2);
        int[] iArr2 = new int[4];
        int i7 = 1;
        while (true) {
            int i8 = i7;
            if (i8 >= 64) {
                return imageCreateImage2;
            }
            int i9 = 1;
            while (true) {
                int i10 = i9;
                if (i10 < 54) {
                    int i11 = ((width - i4) / 2) + ((i10 * i4) / 55);
                    int i12 = ((height - i3) / 2) + ((i8 * i3) / 65);
                    int i13 = 1;
                    C0011l.m187a(iArr2, iArr[(i12 * width) + i11]);
                    int i14 = iArr2[1] + 0;
                    int i15 = iArr2[2] + 0;
                    int i16 = iArr2[3] + 0;
                    int i17 = 1;
                    while (true) {
                        int i18 = i17;
                        if (i18 < i6) {
                            for (int i19 = 1; i19 < i5; i19++) {
                                if (((i12 + i18) * width) + i11 + i19 < iArr.length) {
                                    C0011l.m187a(iArr2, iArr[((i12 + i18) * width) + i11 + i19]);
                                    i14 += iArr2[1];
                                    i15 += iArr2[2];
                                    i16 += iArr2[3];
                                    i13++;
                                }
                            }
                            i17 = i18 + 1;
                        }
                    }
                    graphics.setColor(C0011l.m169a(255, i14 / i13, i15 / i13, i16 / i13));
                    graphics.fillRect(i10, i8, 1, 1);
                    i9 = i10 + 1;
                }
            }
            i7 = i8 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m255a() {
        m256b();
        HSpeed.f3b = true;
        try {
            this.f570a = Manager.createPlayer("capture://image");
        } catch (Exception e) {
            if (this.f570a != null) {
                this.f570a.close();
            }
            this.f570a = null;
            try {
                this.f570a = Manager.createPlayer("capture://video");
            } catch (Exception e2) {
                if (this.f570a != null) {
                    this.f570a.close();
                }
                this.f570a = null;
            }
        }
        if (this.f570a != null) {
            try {
                RunnableC0008i.f286a.setColor(-16777216);
                RunnableC0008i.f286a.fillRect(0, 0, 320, 240);
                HSpeed.f0a.flushGraphics();
                Thread.sleep(30L);
                this.f570a.realize();
                this.f571a = this.f570a.getControl("VideoControl");
                this.f571a.initDisplayMode(1, HSpeed.f0a);
                try {
                    int displayWidth = this.f571a.getDisplayWidth();
                    int displayHeight = this.f571a.getDisplayHeight();
                    float f = 320.0f / displayWidth;
                    if (1.3333334f < displayWidth / displayHeight) {
                        f = 240.0f / displayHeight;
                    }
                    int i = (int) (displayWidth * f);
                    int i2 = (int) (f * displayHeight);
                    this.f571a.setDisplayLocation((-(i - 320)) / 2, (-(i2 - 240)) / 2);
                    this.f571a.setDisplaySize(i, i2);
                } catch (Exception e3) {
                    try {
                        this.f571a.setDisplayFullScreen(true);
                    } catch (Exception e4) {
                    }
                }
                this.f571a.setVisible(true);
                this.f570a.start();
            } catch (Exception e5) {
                if (this.f570a != null) {
                    this.f570a.close();
                }
                this.f570a = null;
                this.f571a = null;
            }
        }
        if (this.f570a != null && this.f571a != null) {
            RunnableC0008i.f294b = (byte) 2;
            return;
        }
        m256b();
        if (C0009j.f382d == null) {
            C0009j.f382d = C0011l.m202b("/av.cc");
        }
        C0009j.f405j = C0009j.f408k;
        RunnableC0008i.f329j = (byte) 3;
        RunnableC0008i.f294b = (byte) 0;
        RunnableC0008i.m116a((byte) 10, true);
    }

    /* JADX INFO: renamed from: b */
    final void m256b() {
        if (this.f571a != null) {
            this.f571a.setVisible(false);
        }
        if (this.f570a != null) {
            this.f570a.close();
        }
        this.f571a = null;
        this.f570a = null;
        HSpeed.f3b = false;
        if (C0009j.f384d[1] <= 0 || C0009j.f384d[14] <= 0 || RunnableC0008i.f281a.f59a != 0) {
            return;
        }
        RunnableC0008i.f281a.m18a(5, 0, -1, -1);
    }
}
