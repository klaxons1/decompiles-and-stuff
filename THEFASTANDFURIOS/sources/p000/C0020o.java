package p000;

import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

/* JADX INFO: renamed from: o */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0020o implements PlayerListener {

    /* JADX INFO: renamed from: a */
    boolean f573a = false;

    /* JADX INFO: renamed from: b */
    boolean f574b = false;

    /* JADX INFO: renamed from: c */
    C0001aa[] f575c = new C0001aa[3];

    /* JADX INFO: renamed from: d */
    int f576d;

    /* JADX INFO: renamed from: e */
    int f577e;

    /* JADX INFO: renamed from: f */
    RunnableC0017l f578f;

    C0020o(RunnableC0017l runnableC0017l) {
        this.f578f = runnableC0017l;
    }

    /* JADX INFO: renamed from: a */
    private void m217a(int i, Player player) {
        for (int i2 = 0; i2 < 3; i2++) {
            if (this.f575c[i2] == null) {
                this.f575c[i2] = new C0001aa(i, player);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m218a() {
        for (int i = 0; i < 3; i++) {
            try {
                if (this.f575c[i] != null) {
                    m221a(this.f575c[i].f31a);
                }
            } catch (Exception e) {
                return;
            } catch (Throwable th) {
                return;
            }
        }
        this.f576d = -1;
        this.f577e = -1;
        this.f574b = false;
    }

    /* JADX INFO: renamed from: a */
    final void m219a(int i) {
        if (this.f573a) {
            return;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (this.f575c[i2] != null && this.f575c[i2].f32b == i) {
                try {
                    this.f575c[i2].f31a.stop();
                    this.f575c[i2].f31a.removePlayerListener(this);
                    this.f575c[i2].f31a.deallocate();
                    this.f575c[i2].f31a.close();
                    this.f575c[i2].f31a = null;
                    this.f575c[i2].f32b = 0;
                    this.f575c[i2] = null;
                    return;
                } catch (Exception e) {
                    return;
                } catch (Throwable th) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m220a(int i, int i2) {
        int i3 = (i2 * 100) / 5;
        Player playerM223c = m223c(i);
        if (playerM223c != null) {
            playerM223c.getControl("VolumeControl").setLevel(i3);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m221a(Player player) {
        try {
            if (player.getState() == 400) {
                player.stop();
                this.f574b = false;
            }
        } catch (MediaException e) {
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: renamed from: b */
    final Player m222b(int i) {
        if (this.f573a) {
            return null;
        }
        if (this.f575c[0] != null) {
            m219a(this.f575c[0].f32b);
        }
        if (this.f575c[1] != null) {
            m219a(this.f575c[1].f32b);
        }
        if (this.f575c[2] != null) {
            m219a(this.f575c[2].f32b);
        }
        Player playerM223c = m223c(i);
        if (playerM223c != null) {
            return playerM223c;
        }
        try {
            this.f578f.m202m(i);
            short s = (short) (this.f578f.f343a[(short) (this.f578f.f343a[i + 1] & 65535)] >> 16);
            int i2 = this.f578f.f343a[i];
            int i3 = (short) (this.f578f.f343a[i + 1] >> 16);
            byte[] bArr = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                bArr[i4] = this.f578f.f393b[s][i4 + i2];
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, bArr.length);
            Player playerCreatePlayer = Manager.createPlayer(byteArrayInputStream, "audio/midi");
            playerCreatePlayer.addPlayerListener(this);
            playerCreatePlayer.realize();
            playerCreatePlayer.prefetch();
            m217a(i, playerCreatePlayer);
            m220a(i, this.f578f.f533g);
            byteArrayInputStream.close();
            this.f578f.m203n(i);
            return playerCreatePlayer;
        } catch (MediaException e) {
            return null;
        } catch (Exception e2) {
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    final Player m223c(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            if (this.f575c[i2] != null && this.f575c[i2].f32b == i) {
                return this.f575c[i2].f31a;
            }
        }
        return null;
    }

    public final void playerUpdate(Player player, String str, Object obj) {
        if (str.equals("deviceUnavailable")) {
            this.f573a = true;
        } else if (str.equals("deviceAvailable")) {
            this.f573a = false;
        } else if (str.equals("endOfMedia")) {
            this.f574b = false;
        }
    }
}
