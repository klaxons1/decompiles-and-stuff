package p000;

import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class C0008i implements PlayerListener {

    /* JADX INFO: renamed from: a */
    Player f564a;

    /* JADX INFO: renamed from: a */
    VolumeControl f565a;

    public C0008i(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(RunnableC0002c.f30o, RunnableC0002c.f27e[RunnableC0002c.f28g], RunnableC0002c.f26d[RunnableC0002c.f28g]);
            this.f564a = Manager.createPlayer(byteArrayInputStream, str);
            byteArrayInputStream.close();
            this.f564a.realize();
            this.f564a.addPlayerListener(this);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: aP */
    final void m224aP() {
        try {
            if (this.f564a == null) {
                return;
            }
            if (this.f564a.getState() == 300) {
                m225aQ();
            }
            if (this.f564a.getState() != 400) {
                this.f564a.prefetch();
                this.f564a.start();
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: aQ */
    final void m225aQ() {
        try {
            if (this.f564a == null) {
                return;
            }
            if (this.f564a.getState() == 400 || this.f564a.getState() == 300) {
                this.f564a.setMediaTime(0L);
                this.f564a.stop();
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: h */
    final int m226h() {
        if (this.f564a == null) {
            return -1;
        }
        return this.f564a.getState();
    }

    public final void playerUpdate(Player player, String str, Object obj) {
        if (str.equals("deviceUnavailable")) {
            m225aQ();
            C0010k.currentTimeMillis();
        }
        if (str.equals("deviceAvailable")) {
            m224aP();
        }
    }
}
