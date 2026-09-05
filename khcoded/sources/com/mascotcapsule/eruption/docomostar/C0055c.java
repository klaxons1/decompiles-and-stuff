package com.mascotcapsule.eruption.docomostar;

import java.util.Stack;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.c */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0055c {

    /* JADX INFO: renamed from: a */
    private static Stack f766a = new Stack();

    C0055c() {
    }

    /* JADX INFO: renamed from: a */
    static final Transform m442a() {
        if (f766a.empty()) {
            f766a.push(new Transform());
        }
        return (Transform) f766a.pop();
    }

    /* JADX INFO: renamed from: a */
    static final Transform m443a(Transform transform) {
        return (Transform) f766a.push(transform);
    }
}
