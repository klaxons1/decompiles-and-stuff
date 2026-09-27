package p000;

/* JADX INFO: renamed from: ac */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0003ac {
    /* JADX INFO: renamed from: a */
    public static double m16a(double d) {
        if (d > 1.0d) {
            d = 1.0d;
        } else if (d < -1.0d) {
            d = -1.0d;
        }
        double dAbs = Math.abs(d);
        double dSqrt = Math.sqrt(1.0d - dAbs) * (((1.5707288d - (0.212114d * dAbs)) + ((0.074261d * dAbs) * dAbs)) - (dAbs * ((0.0187293d * dAbs) * dAbs)));
        return d < 0.0d ? 3.141592653589793d - dSqrt : dSqrt;
    }
}
