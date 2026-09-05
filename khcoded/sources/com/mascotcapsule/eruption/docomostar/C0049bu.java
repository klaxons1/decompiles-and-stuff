package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.GraphicsOGL;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bu */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0049bu {

    /* JADX INFO: renamed from: a */
    final int f746a;

    /* JADX INFO: renamed from: b */
    final int f747b;

    /* JADX INFO: renamed from: c */
    private int[] f748c;

    C0049bu(GraphicsOGL graphicsOGL) {
        int[] iArr = new int[2];
        graphicsOGL.glGetIntegerv(3377, iArr);
        graphicsOGL.glGetIntegerv(3386, iArr);
        this.f748c = new int[2];
        this.f748c[0] = iArr[0];
        this.f748c[1] = iArr[1];
        graphicsOGL.glGetIntegerv(3379, iArr);
        graphicsOGL.glGetIntegerv(34018, iArr);
        graphicsOGL.glGetIntegerv(34882, iArr);
        this.f746a = iArr[0];
        graphicsOGL.glGetIntegerv(34468, iArr);
        if (iArr[0] > 3) {
            this.f747b = 3;
        } else {
            this.f747b = iArr[0];
        }
    }
}
