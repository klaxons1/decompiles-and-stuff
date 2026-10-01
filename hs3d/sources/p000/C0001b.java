package p000;

import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
final class C0001b {

    /* JADX INFO: renamed from: a */
    static int f56a;

    /* JADX INFO: renamed from: a */
    private VolumeControl f61a;

    /* JADX INFO: renamed from: d */
    private byte f66d;

    /* JADX INFO: renamed from: c */
    private static int f58c = 0;

    /* JADX INFO: renamed from: b */
    private static boolean f57b = false;

    /* JADX INFO: renamed from: a */
    private boolean f62a = false;

    /* JADX INFO: renamed from: b */
    private byte f63b = -1;

    /* JADX INFO: renamed from: a */
    Player f60a = null;

    /* JADX INFO: renamed from: b */
    int f64b = -1;

    /* JADX INFO: renamed from: c */
    private byte f65c = -1;

    /* JADX INFO: renamed from: e */
    private byte f67e = -1;

    /* JADX INFO: renamed from: a */
    byte f59a = -1;

    C0001b(int i) {
        C0000a.f22b = i;
        f56a = i;
        C0002c.f68a = i;
        C0007h.f211a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m16a() {
        this.f62a = true;
        this.f65c = (byte) -1;
        this.f64b = -1;
        this.f67e = (byte) -1;
    }

    /* JADX INFO: renamed from: a */
    final void m17a(int i) {
        if (this.f60a != null) {
            if (i > 3) {
                i = 0;
            }
            switch (i) {
                case 0:
                    m16a();
                    break;
                case 1:
                    if (this.f61a != null) {
                        this.f61a.setLevel(40);
                    }
                    if (this.f65c == -1 && this.f66d == -1) {
                        m18a(5, 0, -1, -1);
                        break;
                    }
                    break;
                case 2:
                    if (this.f61a != null) {
                        this.f61a.setLevel(70);
                    }
                    if (this.f65c == -1 && this.f66d == -1) {
                        m18a(5, 0, -1, -1);
                        break;
                    }
                    break;
                case 3:
                    if (this.f61a != null) {
                        this.f61a.setLevel(100);
                    }
                    if (this.f65c == -1 && this.f66d == -1) {
                        m18a(5, 0, -1, -1);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18a(int i, int i2, int i3, int i4) {
        if (this.f60a != null) {
            if (!f57b || i2 == 1 || this.f59a == 0) {
                int state = this.f60a.getState();
                if (i >= this.f67e) {
                    if (this.f65c == i2 && state == 400) {
                        return;
                    }
                    if (state == 200) {
                        try {
                            this.f60a.prefetch();
                        } catch (Exception e) {
                        }
                    }
                    if (!f57b) {
                        try {
                            this.f60a.setMediaTime(i3);
                        } catch (MediaException e2) {
                            f57b = true;
                        }
                    }
                    if (state != 400) {
                        try {
                            this.f60a.start();
                        } catch (Exception e3) {
                        }
                    }
                    if (i4 != -1) {
                        this.f64b = (i4 - i3) / 1000;
                    }
                    this.f65c = (byte) i2;
                    this.f67e = (byte) i;
                    this.f62a = false;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    final void m19a(String str, int i, int i2) {
        f57b = false;
        m23d();
        this.f59a = (byte) i;
        this.f66d = (byte) i2;
        try {
            switch (i) {
                case 0:
                    this.f60a = Manager.createPlayer(C0011l.m172a(str), "audio/midi");
                    break;
                case 1:
                    try {
                        this.f60a = Manager.createPlayer(C0011l.m172a(str), "audio/x-wav");
                    } catch (Exception e) {
                        this.f60a = Manager.createPlayer(C0011l.m172a(str), "audio/wav");
                    }
                    break;
                case 2:
                    this.f60a = Manager.createPlayer(C0011l.m172a(str), "audio/mpeg");
                    break;
            }
        } catch (Exception e2) {
            this.f60a = null;
            this.f61a = null;
        }
        if (this.f60a == null) {
        }
        try {
            this.f60a.realize();
            this.f60a.setLoopCount(i2);
        } catch (Exception e3) {
        }
        try {
            this.f60a.prefetch();
        } catch (Exception e4) {
        }
        this.f61a = this.f60a.getControl("VolumeControl");
        switch (C0009j.f384d[14]) {
            case 0:
                m16a();
                break;
            case 1:
                this.f61a.setLevel(40);
                break;
            case 2:
                this.f61a.setLevel(70);
                break;
            case 3:
                this.f61a.setLevel(100);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m20b() {
        C0006g.m74a(0);
        if (this.f62a && this.f60a != null && (this.f60a.getState() == 400 || this.f63b != -1)) {
            try {
                this.f60a.stop();
            } catch (Exception e) {
            }
            this.f62a = false;
        }
        int i = f58c + RunnableC0008i.f296b;
        f58c = i;
        if (i > 3515) {
            if (C0009j.f384d[16] != 1) {
                byte[] bArr = C0009j.f384d;
                bArr[16] = (byte) (bArr[16] - 1);
            }
            f58c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21b(int i) {
        if (this.f62a || this.f60a == null || this.f65c != 1) {
            return;
        }
        if (this.f60a.getState() == 400 || this.f63b != -1) {
            m16a();
        }
    }

    /* JADX INFO: renamed from: c */
    final void m22c() {
        if (this.f60a != null) {
            m16a();
            try {
                this.f60a.stop();
            } catch (Exception e) {
            }
            this.f62a = false;
        }
    }

    /* JADX INFO: renamed from: d */
    final void m23d() {
        m16a();
        if (this.f60a != null) {
            try {
                this.f60a.stop();
                this.f60a.deallocate();
                this.f60a.close();
            } catch (Exception e) {
            } finally {
                this.f60a = null;
                this.f61a = null;
            }
            C0011l.m204b(50);
        }
    }
}
