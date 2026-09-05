package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class RegionI {

    /* JADX INFO: renamed from: a */
    int f460a;

    /* JADX INFO: renamed from: b */
    int f461b;

    /* JADX INFO: renamed from: c */
    int f462c;

    /* JADX INFO: renamed from: d */
    int f463d;

    public RegionI() {
    }

    public RegionI(int i, int i2, int i3, int i4) {
        this.f460a = i;
        this.f461b = i2;
        this.f462c = i3;
        this.f463d = i4;
    }

    public final boolean compare(RegionI regionI) {
        return this.f460a == regionI.f460a && this.f461b == regionI.f461b && this.f462c == regionI.f462c && this.f463d == regionI.f463d;
    }

    public final void copy(RegionI regionI) {
        this.f460a = regionI.f460a;
        this.f461b = regionI.f461b;
        this.f462c = regionI.f462c;
        this.f463d = regionI.f463d;
    }

    public final int getX0() {
        return this.f460a;
    }

    public final int getX1() {
        return this.f462c;
    }

    public final int getY0() {
        return this.f461b;
    }

    public final int getY1() {
        return this.f463d;
    }

    public final boolean intersect(RegionI regionI, RegionI regionI2) {
        int i = this.f460a > regionI.f460a ? this.f460a : regionI.f460a;
        int i2 = this.f461b > regionI.f461b ? this.f461b : regionI.f461b;
        int i3 = this.f462c < regionI.f462c ? this.f462c : regionI.f462c;
        int i4 = this.f463d < regionI.f463d ? this.f463d : regionI.f463d;
        if (i3 - i < 0 || i4 - i2 < 0) {
            return false;
        }
        if (regionI2 != null) {
            regionI2.f460a = i;
            regionI2.f461b = i2;
            regionI2.f462c = i3;
            regionI2.f463d = i4;
        }
        return true;
    }

    public final void set(int i, int i2, int i3, int i4) {
        this.f460a = i;
        this.f461b = i2;
        this.f462c = i3;
        this.f463d = i4;
    }
}
