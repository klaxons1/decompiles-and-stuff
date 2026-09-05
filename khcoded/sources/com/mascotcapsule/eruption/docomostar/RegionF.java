package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class RegionF {

    /* JADX INFO: renamed from: a */
    float f456a;

    /* JADX INFO: renamed from: b */
    float f457b;

    /* JADX INFO: renamed from: c */
    float f458c;

    /* JADX INFO: renamed from: d */
    float f459d;

    public RegionF() {
    }

    public RegionF(float f, float f2, float f3, float f4) {
        this.f456a = f;
        this.f457b = f2;
        this.f458c = f3;
        this.f459d = f4;
    }

    public final boolean compare(RegionF regionF) {
        return this.f456a == regionF.f456a && this.f457b == regionF.f457b && this.f458c == regionF.f458c && this.f459d == regionF.f459d;
    }

    public final void copy(RegionF regionF) {
        this.f456a = regionF.f456a;
        this.f457b = regionF.f457b;
        this.f458c = regionF.f458c;
        this.f459d = regionF.f459d;
    }

    public final float getX0() {
        return this.f456a;
    }

    public final float getX1() {
        return this.f458c;
    }

    public final float getY0() {
        return this.f457b;
    }

    public final float getY1() {
        return this.f459d;
    }

    public final boolean intersect(RegionF regionF, RegionF regionF2) {
        float f = this.f456a > regionF.f456a ? this.f456a : regionF.f456a;
        float f2 = this.f457b > regionF.f457b ? this.f457b : regionF.f457b;
        float f3 = this.f458c < regionF.f458c ? this.f458c : regionF.f458c;
        float f4 = this.f459d < regionF.f459d ? this.f459d : regionF.f459d;
        if (f3 - f < 0.0f || f4 - f2 < 0.0f) {
            return false;
        }
        if (regionF2 != null) {
            regionF2.f456a = f;
            regionF2.f457b = f2;
            regionF2.f458c = f3;
            regionF2.f459d = f4;
        }
        return true;
    }

    public final void set(float f, float f2, float f3, float f4) {
        this.f456a = f;
        this.f457b = f2;
        this.f458c = f3;
        this.f459d = f4;
    }
}
