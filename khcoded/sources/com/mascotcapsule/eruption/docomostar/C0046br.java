package com.mascotcapsule.eruption.docomostar;

import java.util.Stack;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.br */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0046br {

    /* JADX INFO: renamed from: a */
    private static Stack f741a = new Stack();

    C0046br() {
    }

    /* JADX INFO: renamed from: a */
    static final Vector3D m439a() {
        if (f741a.empty()) {
            f741a.push(new Vector3D());
        }
        return (Vector3D) f741a.pop();
    }

    /* JADX INFO: renamed from: a */
    static final Vector3D m440a(Vector3D vector3D) {
        return (Vector3D) f741a.push(vector3D);
    }
}
