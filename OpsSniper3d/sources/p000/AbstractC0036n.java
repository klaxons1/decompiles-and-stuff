package p000;

import javax.microedition.m3g.Node;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public abstract class AbstractC0036n {

    /* JADX INFO: renamed from: a */
    protected Node f276a;

    /* JADX INFO: renamed from: b */
    protected Node f277b;

    /* JADX INFO: renamed from: c */
    public int f278c = 0;

    /* JADX INFO: renamed from: d */
    private AbstractC0042t f279d;

    public AbstractC0036n() {
    }

    public AbstractC0036n(AbstractC0042t abstractC0042t) {
        this.f279d = abstractC0042t;
    }

    /* JADX INFO: renamed from: b */
    public void mo187b() {
        this.f279d = null;
        this.f276a = null;
        this.f277b = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m188b(AbstractC0042t abstractC0042t) {
        this.f279d = abstractC0042t;
    }

    /* JADX INFO: renamed from: c */
    public final Node m189c() {
        return this.f276a;
    }

    /* JADX INFO: renamed from: d */
    public final Node m190d() {
        return this.f277b;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0042t m191e() {
        return this.f279d;
    }
}
