package com.m3gworks.engine;

import p000.C0009ai;
import p000.C0045w;

/* JADX INFO: renamed from: com.m3gworks.engine.b */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0021b {

    /* JADX INFO: renamed from: a */
    private static C0021b f108a;

    /* JADX INFO: renamed from: b */
    private boolean f109b = false;

    /* JADX INFO: renamed from: c */
    private C0009ai f110c;

    private C0021b() {
    }

    /* JADX INFO: renamed from: a */
    public static C0021b m101a() {
        if (f108a == null) {
            f108a = new C0021b();
        }
        return f108a;
    }

    /* JADX INFO: renamed from: b */
    public final void m102b() {
        boolean z;
        C0009ai[] c0009aiArr = C0045w.m228a().m240f().m18b().f164k;
        if (c0009aiArr == null) {
            z = true;
            break;
        }
        for (int i = 0; i < c0009aiArr.length; i++) {
            if (!c0009aiArr[i].f37c) {
                this.f110c = c0009aiArr[i];
                c0009aiArr[i].m32a();
                break;
            }
        }
        int i2 = 0;
        while (true) {
            if (i2 >= c0009aiArr.length) {
                z = true;
                break;
            } else {
                if (!c0009aiArr[i2].f37c) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        if (z) {
            this.f109b = false;
            RunnableC0025f.m117a().m123d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m103c() {
        this.f109b = true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m104d() {
        return this.f109b;
    }

    /* JADX INFO: renamed from: e */
    public final C0009ai m105e() {
        return this.f110c;
    }
}
