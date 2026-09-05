package com.mascotcapsule.eruption.docomostar;

import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class IntersectionAttributes {

    /* JADX INFO: renamed from: a */
    private int f354a = 0;

    /* JADX INFO: renamed from: b */
    private Vector f355b = new Vector();

    /* JADX INFO: renamed from: a */
    final void m172a() {
        this.f355b.removeAllElements();
        this.f354a = 0;
    }

    /* JADX INFO: renamed from: a */
    final void m173a(C0082d c0082d) {
        this.f355b.addElement(c0082d);
        this.f354a++;
    }

    public final Appearance getAppearance(int i) {
        if (i < 0 || i >= this.f354a) {
            throw new IllegalArgumentException();
        }
        return ((C0082d) this.f355b.elementAt(i)).f846f;
    }

    public final float[] getColor(int i) {
        if (i < 0 || i >= this.f354a) {
            throw new IllegalArgumentException();
        }
        return ((C0082d) this.f355b.elementAt(i)).f844d;
    }

    public final float getDistance(int i) {
        if (i < 0 || i >= this.f354a) {
            throw new IllegalArgumentException();
        }
        return ((C0082d) this.f355b.elementAt(i)).f841a;
    }

    public final float[] getNormal(int i) {
        if (i < 0 || i >= this.f354a) {
            throw new IllegalArgumentException();
        }
        return ((C0082d) this.f355b.elementAt(i)).f843c;
    }

    public final int getNum() {
        return this.f354a;
    }

    public final float[] getTextureCoord(int i, int i2) {
        if (i < 0 || i >= this.f354a) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= 2) {
            throw new IllegalArgumentException();
        }
        return ((C0082d) this.f355b.elementAt(i)).f842b[i2];
    }

    public final int getUserData(int i) {
        if (i < 0 || i >= this.f354a) {
            throw new IllegalArgumentException();
        }
        return ((C0082d) this.f355b.elementAt(i)).f845e;
    }
}
