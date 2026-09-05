package p000;

import com.docomostar.StarApplication;
import com.docomostar.system.PhoneSystem;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public class Main extends StarApplication {
    public static String MODEL = System.getProperty("microedition.platform");

    /* JADX INFO: renamed from: gm */
    Game f58gm = null;
    private Thread thread = null;

    public void activated(int i) {
        if (i != 0) {
            PhoneSystem.setAttribute(0, 1);
            GameCommon.resetAllKey();
            GameCommon.refreshKey();
            this.f58gm.bgmReplay();
        }
    }

    public void started(int i) {
        MODEL = Util.replace(MODEL, "+", "");
        DirectBufferManager.init();
        Character.init();
        MapData.init();
        Draw2D.init();
        Sound.init();
        this.f58gm = new Game();
        this.thread = new Thread(this.f58gm);
        this.thread.start();
    }
}
