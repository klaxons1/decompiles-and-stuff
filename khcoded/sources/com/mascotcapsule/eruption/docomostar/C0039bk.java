package com.mascotcapsule.eruption.docomostar;

import java.util.Random;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.bk */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0039bk {

    /* JADX INFO: renamed from: d */
    private static Random f728d = new Random();

    /* JADX INFO: renamed from: a */
    private float f729a = 0.0f;

    /* JADX INFO: renamed from: b */
    private float f730b = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f731c;

    C0039bk() {
    }

    /* JADX INFO: renamed from: a */
    static int m436a(int i) {
        return f728d.nextInt(i);
    }

    /* JADX INFO: renamed from: a */
    final float m437a() {
        if (this.f730b == 0.0f) {
            this.f731c = this.f729a;
        } else {
            this.f731c = this.f729a + (this.f730b * f728d.nextFloat());
        }
        return this.f731c;
    }

    /* JADX INFO: renamed from: a */
    final void m438a(float f, float f2) {
        if (f2 > f) {
            throw new IllegalArgumentException("min has bigger value than max");
        }
        this.f729a = f2;
        this.f730b = f - f2;
    }
}
