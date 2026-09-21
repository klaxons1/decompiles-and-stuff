package p000;

import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: o */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public abstract class AbstractC0043o {

    /* JADX INFO: renamed from: aD */
    public RunnableC0015ao f492aD;

    /* JADX INFO: renamed from: aE */
    public int f493aE;

    public AbstractC0043o(RunnableC0015ao runnableC0015ao) {
        this.f492aD = runnableC0015ao;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo114a(Graphics graphics);

    /* JADX INFO: renamed from: b */
    public abstract void mo119b(int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo124c(int i);

    /* JADX INFO: renamed from: d */
    public abstract void mo125d(int i);

    /* JADX INFO: renamed from: f */
    public abstract void mo129f();

    /* JADX INFO: renamed from: g */
    public abstract void mo130g();

    /* JADX INFO: renamed from: h */
    public abstract void mo131h();

    /* JADX INFO: renamed from: i */
    public abstract void mo132i();

    /* JADX INFO: renamed from: j */
    public abstract void mo133j();

    /* JADX INFO: renamed from: l */
    public final int m308l() {
        return this.f492aD.getWidth();
    }

    /* JADX INFO: renamed from: m */
    public final int m309m() {
        return this.f492aD.getHeight();
    }
}
