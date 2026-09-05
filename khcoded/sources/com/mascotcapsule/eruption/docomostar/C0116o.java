package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.o */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0116o extends AbstractC0056ca {

    /* JADX INFO: renamed from: a */
    int f974a;

    /* JADX INFO: renamed from: b */
    float f975b;

    /* JADX INFO: renamed from: c */
    VertexBuffer f976c;

    /* JADX INFO: renamed from: d */
    C0076cu f977d;

    /* JADX INFO: renamed from: e */
    IndexBuffer f978e;

    /* JADX INFO: renamed from: f */
    BoneDeformer f979f;

    /* JADX INFO: renamed from: g */
    C0007af f980g;

    /* JADX INFO: renamed from: h */
    MorphDeformer f981h;

    /* JADX INFO: renamed from: i */
    C0059cd f982i;

    /* JADX INFO: renamed from: j */
    C0117p f983j;

    /* JADX INFO: renamed from: k */
    C0096dn f984k;

    /* JADX INFO: renamed from: l */
    Batch f985l;

    /* JADX INFO: renamed from: m */
    GeometricShape f986m;

    /* JADX INFO: renamed from: n */
    Transform f987n = new Transform();

    /* JADX INFO: renamed from: o */
    Transform f988o = new Transform();

    /* JADX INFO: renamed from: p */
    boolean f989p;

    /* JADX INFO: renamed from: q */
    boolean f990q;

    /* JADX INFO: renamed from: r */
    boolean f991r;

    /* JADX INFO: renamed from: s */
    boolean f992s;

    /* JADX INFO: renamed from: t */
    boolean f993t;

    /* JADX INFO: renamed from: u */
    boolean f994u;

    C0116o() {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0056ca
    /* JADX INFO: renamed from: a */
    final boolean mo444a(AbstractC0056ca abstractC0056ca) {
        return this.f974a <= ((C0116o) abstractC0056ca).f974a;
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0056ca
    /* JADX INFO: renamed from: b */
    final boolean mo445b(AbstractC0056ca abstractC0056ca) {
        if (this.f974a > ((C0116o) abstractC0056ca).f974a) {
            return false;
        }
        if (this.f974a < ((C0116o) abstractC0056ca).f974a) {
            return true;
        }
        if ((this.f974a & 1) != 0) {
            if (this.f975b < ((C0116o) abstractC0056ca).f975b) {
                return false;
            }
        } else if (this.f975b > ((C0116o) abstractC0056ca).f975b) {
            return false;
        }
        return true;
    }
}
