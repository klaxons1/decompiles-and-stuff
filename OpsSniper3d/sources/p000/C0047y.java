package p000;

import java.util.TimerTask;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0047y extends TimerTask {

    /* JADX INFO: renamed from: a */
    private int f337a;

    public C0047y(int i) {
        this.f337a = i + 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m245a() {
        return this.f337a;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f337a--;
        if (this.f337a == 0) {
            cancel();
        }
    }
}
