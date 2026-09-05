package p000;

import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: C:\Temp\jadx-10063267948654414545\classes.dex */
public final class C0001b implements InterfaceC0007h, PlayerListener {

    /* JADX INFO: renamed from: a */
    private static int f8a;

    /* JADX INFO: renamed from: a */
    private static Player f10a;

    /* JADX INFO: renamed from: a */
    private static boolean f11a;

    /* JADX INFO: renamed from: a */
    private static byte[][] f14a;

    /* JADX INFO: renamed from: a */
    private static int[] f12a = {0, 1, 2, 3, 4};

    /* JADX INFO: renamed from: a */
    private static boolean[] f13a = {false, false, true, false, true};

    /* JADX INFO: renamed from: b */
    private static int[] f15b = {0, 1, 2, 3, 4};

    /* JADX INFO: renamed from: a */
    private static C0001b f9a = new C0001b();

    private C0001b() {
    }

    /* JADX INFO: renamed from: a */
    public static void m2a() {
        f14a = new byte[f12a.length][];
        for (int i = 0; i < f14a.length; i++) {
            try {
                f14a[i] = C0005f.m24a(f12a[i]);
            } catch (Exception e) {
            }
        }
        f11a = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m3a(int i) {
        int i2;
        if (i < f15b.length && (i2 = f15b[i]) != -1) {
            RunnableC0010k.f230c = f13a[i2] ? i : -1;
            if (RunnableC0010k.f236e) {
                if (f10a != null) {
                    f10a.deallocate();
                    f10a.close();
                    f10a = null;
                }
                try {
                    Player playerCreatePlayer = Manager.createPlayer(new ByteArrayInputStream(f14a[i2]), "audio/midi");
                    f10a = playerCreatePlayer;
                    playerCreatePlayer.setLoopCount(f13a[i2] ? -1 : 1);
                    f10a.prefetch();
                    f10a.realize();
                    f10a.start();
                } catch (Exception e) {
                }
                f8a = i;
                if (InterfaceC0007h.f51h[f8a] != -1) {
                    f10a.addPlayerListener(f9a);
                    f11a = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4a() {
        int i = RunnableC0010k.f230c;
        if (!RunnableC0010k.f236e || i == -1 || m6b()) {
            return true;
        }
        m3a(i);
        return m6b();
    }

    /* JADX INFO: renamed from: b */
    public static void m5b() {
        if (f10a != null) {
            if (InterfaceC0007h.f51h[f8a] != -1) {
                f10a.removePlayerListener(f9a);
                f11a = false;
            }
            f10a.deallocate();
            f10a.close();
            f10a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m6b() {
        return f10a != null && f10a.getState() == 400;
    }

    public final void playerUpdate(Player player, String str, Object obj) {
        if (f11a && str == "endOfMedia" && InterfaceC0007h.f51h[f8a] != -1) {
            C0004e.m16a(3, InterfaceC0007h.f51h[f8a]);
        }
    }
}
