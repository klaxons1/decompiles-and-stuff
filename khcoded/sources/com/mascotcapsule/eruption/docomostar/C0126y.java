package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.y */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0126y {

    /* JADX INFO: renamed from: a */
    static final C0058cc f1043a = new C0058cc();

    /* JADX INFO: renamed from: b */
    static final Transform f1044b = new Transform();

    /* JADX INFO: renamed from: c */
    static final Vector3D f1045c = new Vector3D();

    /* JADX INFO: renamed from: d */
    private static final float[] f1046d = new float[3];

    /* JADX INFO: renamed from: e */
    private static InterfaceC0023av f1047e = new C0001a();

    /* JADX INFO: renamed from: f */
    private static InterfaceC0023av f1048f = new C0042bn();

    C0126y() {
    }

    /* JADX INFO: renamed from: a */
    static final InterfaceC0023av m521a(Transform transform, C0116o c0116o) {
        f1044b.copy(transform);
        switch (Graphics3D.m136a(transform)) {
            case 1:
                float[] fArr = f1044b.f494b.m;
                float length = Vector3D.length(fArr[0], fArr[1], fArr[2]);
                if (length == 0.0f) {
                    throw new ArithmeticException();
                }
                float[] fArr2 = f1046d;
                float[] fArr3 = f1046d;
                float f = 1.0f / length;
                f1046d[2] = f;
                fArr3[1] = f;
                fArr2[0] = f;
                f1044b.m269b(f1046d);
                break;
            case 2:
                f1043a.m447a(f1044b);
                Transform.m250a(f1044b, f1043a);
                f1043a.m446a();
                return f1047e;
        }
        f1043a.m448b(f1044b);
        f1043a.m446a();
        return c0116o.f976c.f527F ? f1047e : f1048f;
    }
}
