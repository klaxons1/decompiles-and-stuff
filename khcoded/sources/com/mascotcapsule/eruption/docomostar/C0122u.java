package com.mascotcapsule.eruption.docomostar;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.u */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0122u {

    /* JADX INFO: renamed from: a */
    int f1033a;

    /* JADX INFO: renamed from: b */
    int f1034b;

    /* JADX INFO: renamed from: c */
    final int f1035c;

    /* JADX INFO: renamed from: d */
    int f1036d;

    /* JADX INFO: renamed from: e */
    boolean f1037e = false;

    /* JADX INFO: renamed from: f */
    private WeakReference f1038f;

    C0122u(Object obj, int i, int i2, int i3) {
        this.f1038f = new WeakReference(obj);
        this.f1033a = i;
        this.f1034b = i;
        this.f1035c = i2;
        this.f1036d = i3;
    }

    /* JADX INFO: renamed from: a */
    final boolean m520a() {
        return (this.f1037e || this.f1038f.get() == null) ? false : true;
    }
}
