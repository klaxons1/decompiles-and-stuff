package p000;

import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

/* JADX INFO: renamed from: ap */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0016ap implements PlayerListener {

    /* JADX INFO: renamed from: a */
    private static C0016ap f78a;

    /* JADX INFO: renamed from: b */
    private Player[] f79b;

    /* JADX INFO: renamed from: c */
    private Player[] f80c;

    /* JADX INFO: renamed from: d */
    private Player[] f81d;

    /* JADX INFO: renamed from: e */
    private Player[] f82e;

    /* JADX INFO: renamed from: f */
    private int f83f;

    /* JADX INFO: renamed from: g */
    private int f84g;

    /* JADX INFO: renamed from: h */
    private int f85h;

    /* JADX INFO: renamed from: i */
    private int f86i;

    /* JADX INFO: renamed from: j */
    private String f87j = "";

    private C0016ap() {
    }

    /* JADX INFO: renamed from: a */
    public static C0016ap m72a() {
        if (f78a == null) {
            f78a = new C0016ap();
        }
        return f78a;
    }

    /* JADX INFO: renamed from: a */
    private Player m73a(String str) {
        Exception e;
        Player player = null;
        try {
            Player playerCreatePlayer = Manager.createPlayer(getClass().getResourceAsStream(str), "audio/x-wav");
            try {
                playerCreatePlayer.realize();
                playerCreatePlayer.prefetch();
                playerCreatePlayer.getControl("VolumeControl").setLevel(100);
                playerCreatePlayer.addPlayerListener(this);
                return playerCreatePlayer;
            } catch (Exception e2) {
                e = e2;
                player = playerCreatePlayer;
                this.f87j = new StringBuffer(String.valueOf(e.toString())).append(" ").append(str).toString();
                System.out.println(this.f87j);
                e.printStackTrace();
                return player;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m74a(Player player) {
        if (player == null || player.getState() != 300) {
            return;
        }
        try {
            player.setMediaTime(0L);
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Could not play sound ");
        }
    }

    /* JADX INFO: renamed from: a */
    private Player[] m75a(String str, int i) {
        Player[] playerArr = new Player[1];
        for (int i2 = 0; i2 < 1; i2++) {
            playerArr[0] = m73a(str);
        }
        return playerArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m76a(int i) {
        switch (i) {
            case 1:
                m74a(this.f79b[this.f83f]);
                int i2 = this.f83f + 1;
                this.f83f = 0;
                break;
            case 2:
                m74a(this.f80c[this.f84g]);
                int i3 = this.f84g + 1;
                this.f84g = 0;
                break;
            case 3:
                m74a(this.f81d[this.f85h]);
                int i4 = this.f85h + 1;
                this.f85h = 0;
                break;
            case 4:
                m74a(this.f82e[this.f86i]);
                int i5 = this.f86i + 1;
                this.f86i = 0;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77b() {
        if (this.f79b != null) {
            return;
        }
        this.f79b = m75a("/res/sound/rifle.wav", 1);
        this.f83f = 0;
        this.f80c = m75a("/res/sound/sniper.wav", 1);
        this.f84g = 0;
        this.f81d = m75a("/res/sound/pistol.wav", 1);
        this.f85h = 0;
        this.f82e = m75a("/res/sound/explode.wav", 1);
        this.f86i = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m78c() {
        if (this.f79b != null) {
            for (int i = 0; i < 1; i++) {
                this.f79b[0].close();
            }
        }
        if (this.f80c != null) {
            for (int i2 = 0; i2 < 1; i2++) {
                this.f80c[0].close();
            }
        }
        if (this.f81d != null) {
            for (int i3 = 0; i3 < 1; i3++) {
                this.f81d[0].close();
            }
        }
        if (this.f82e != null) {
            for (int i4 = 0; i4 < 1; i4++) {
                this.f82e[0].close();
            }
        }
        this.f79b = null;
        this.f80c = null;
        this.f81d = null;
        this.f82e = null;
    }

    public final void playerUpdate(Player player, String str, Object obj) {
        if (str == "endOfMedia") {
            try {
                player.stop();
                player.setMediaTime(0L);
            } catch (Exception e) {
            }
        }
    }
}
