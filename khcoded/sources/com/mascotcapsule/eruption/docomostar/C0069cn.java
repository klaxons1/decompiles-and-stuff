package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.DirectBuffer;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.cn */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0069cn {

    /* JADX INFO: renamed from: a */
    final int f805a;

    /* JADX INFO: renamed from: b */
    int f806b;

    /* JADX INFO: renamed from: c */
    final short[] f807c;

    /* JADX INFO: renamed from: d */
    final byte[] f808d;

    /* JADX INFO: renamed from: e */
    int f809e;

    /* JADX INFO: renamed from: f */
    DirectBuffer f810f;

    /* JADX INFO: renamed from: g */
    BufferPool f811g;

    /* JADX INFO: renamed from: h */
    C0122u f812h;

    C0069cn(int i, int i2) {
        this.f805a = i;
        this.f806b = i2;
        this.f807c = null;
        this.f808d = null;
    }

    C0069cn(int i, byte[] bArr) {
        this.f805a = -1;
        this.f806b = bArr.length;
        this.f807c = null;
        this.f808d = bArr;
    }

    C0069cn(int i, short[] sArr) {
        this.f805a = i;
        this.f806b = sArr.length;
        this.f807c = sArr;
        this.f808d = null;
    }

    /* JADX INFO: renamed from: a */
    final void m475a() {
        if (this.f811g != null) {
            if (this.f807c != null) {
                this.f810f.put(this.f812h.f1033a, this.f807c, 0, this.f806b);
                return;
            } else {
                this.f810f.put(this.f812h.f1033a, this.f808d, 0, this.f806b);
                return;
            }
        }
        if (this.f807c != null) {
            this.f810f.put(0, this.f807c, 0, this.f806b);
        } else {
            this.f810f.put(0, this.f808d, 0, this.f806b);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m476b() {
        this.f810f = null;
        if (this.f811g != null) {
            this.f812h.f1037e = true;
            this.f811g = null;
            this.f812h = null;
        }
    }
}
