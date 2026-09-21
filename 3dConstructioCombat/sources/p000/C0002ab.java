package p000;

import javax.microedition.m3g.Group;

/* JADX INFO: renamed from: ab */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public class C0002ab extends C0037i {

    /* JADX INFO: renamed from: D */
    public C0037i[] f16D;

    /* JADX INFO: renamed from: E */
    public int f17E;

    /* JADX INFO: renamed from: F */
    public Group f18F;

    public C0002ab(C0006af c0006af) {
        super(c0006af);
        this.f16D = new C0037i[0];
        this.f453I |= 1;
        this.f452H.m50a(this);
        this.f18F = new Group();
        this.f456L = this.f18F;
    }

    /* JADX INFO: renamed from: a */
    public final void m16a(C0037i c0037i) {
        if (c0037i.f451G != null) {
            c0037i.f451G.m18b(c0037i);
        }
        if (this.f16D.length < this.f17E + 1) {
            C0037i[] c0037iArr = new C0037i[this.f17E + 1];
            System.arraycopy(this.f16D, 0, c0037iArr, 0, this.f16D.length);
            this.f16D = c0037iArr;
        }
        this.f16D[this.f17E] = c0037i;
        this.f17E++;
        c0037i.mo252a(this);
        if (c0037i.f456L != null) {
            this.f18F.addChild(c0037i.f456L);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0037i m17b(int i) {
        return this.f16D[i];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18b(C0037i c0037i) {
        int i = 0;
        while (i < this.f17E && this.f16D[i] != c0037i) {
            i++;
        }
        if (i == this.f17E) {
            return false;
        }
        this.f16D[i] = null;
        System.arraycopy(this.f16D, i + 1, this.f16D, i, this.f17E - (i + 1));
        this.f17E--;
        this.f16D[this.f17E] = null;
        if (c0037i.f456L != null) {
            this.f18F.removeChild(c0037i.f456L);
        }
        c0037i.mo252a((C0002ab) null);
        return true;
    }

    @Override // p000.C0037i
    /* JADX INFO: renamed from: c */
    public void mo19c() {
        while (this.f17E > 0) {
            this.f16D[0].mo19c();
        }
        super.mo19c();
    }
}
