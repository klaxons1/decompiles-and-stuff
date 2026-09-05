package com.mascotcapsule.eruption.docomostar;

import java.io.InputStream;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.au */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0022au extends AbstractC0032bd {

    /* JADX INFO: renamed from: a */
    int f682a;

    /* JADX INFO: renamed from: b */
    int[] f683b;

    C0022au() {
        this((byte) 0);
    }

    private C0022au(byte b) {
    }

    @Override // com.mascotcapsule.eruption.docomostar.AbstractC0032bd
    /* JADX INFO: renamed from: a */
    final void mo395a(C0028b c0028b, InputStream inputStream) {
        C0004ac c0004ac = new C0004ac();
        C0028b.m416a(c0028b, inputStream, c0004ac);
        this.f682a = C0028b.m426g(c0028b, inputStream);
        int iM414a = C0028b.m414a(c0028b, inputStream);
        NodeDeformer nodeDeformer = new NodeDeformer(this.f682a);
        this.f698d = nodeDeformer;
        this.f683b = new int[this.f682a];
        nodeDeformer.f401i = c0004ac.f559c;
        nodeDeformer.f402j = c0004ac.f560d;
        short s = (short) this.f682a;
        for (int i = 0; i < s; i++) {
            this.f683b[i] = C0028b.m414a(c0028b, inputStream);
            nodeDeformer.f392e[i].f674d = (short) C0028b.m426g(c0028b, inputStream);
            nodeDeformer.f392e[i].f675e = ((byte) C0028b.m421c(c0028b, inputStream)) != 0;
        }
        if (iM414a != -1) {
            nodeDeformer.setRefGid(iM414a);
        }
    }
}
