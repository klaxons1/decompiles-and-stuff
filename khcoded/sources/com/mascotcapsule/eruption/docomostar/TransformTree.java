package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class TransformTree extends Animatable {
    public static final int ROOT = -1;
    public static final int ScaleType_LOCAL = 2;
    public static final int ScaleType_NORMAL = 0;
    public static final int ScaleType_POST = 1;

    /* JADX INFO: renamed from: q */
    private static float[] f498q = new float[3];

    /* JADX INFO: renamed from: r */
    private static boolean[] f499r = new boolean[4];

    /* JADX INFO: renamed from: s */
    private static int[] f500s = new int[4];

    /* JADX INFO: renamed from: c */
    int f501c;

    /* JADX INFO: renamed from: d */
    C0113l[] f502d;

    /* JADX INFO: renamed from: e */
    Transform f503e;

    /* JADX INFO: renamed from: f */
    byte f504f;

    /* JADX INFO: renamed from: g */
    boolean f505g;

    /* JADX INFO: renamed from: p */
    boolean f506p;

    /* JADX INFO: renamed from: t */
    private short[] f507t;

    /* JADX INFO: renamed from: u */
    private Transform f508u;

    /* JADX INFO: renamed from: v */
    private float[] f509v;

    /* JADX INFO: renamed from: w */
    private byte f510w;

    /* JADX INFO: renamed from: x */
    private boolean f511x;

    public TransformTree(int i, int i2) {
        super(5);
        if (i <= 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException();
        }
        m278a(i, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m278a(int i, int i2) {
        super.mo3a();
        this.f501c = i;
        this.f510w = (byte) i2;
        this.f507t = new short[i];
        this.f502d = new C0113l[i];
        this.f503e = new Transform();
        if (i2 != 0) {
            this.f508u = new Transform();
            this.f509v = new float[3];
            this.f509v[0] = 1.0f;
            this.f509v[1] = 1.0f;
            this.f509v[2] = 1.0f;
            for (int i3 = 0; i3 < i; i3++) {
                this.f502d[i3] = new C0083da();
            }
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                this.f502d[i4] = new C0113l();
            }
        }
        this.f504f = (byte) 0;
        this.f505g = false;
        this.f506p = true;
        this.f511x = false;
    }

    /* JADX INFO: renamed from: a */
    private void m279a(int i, Transform transform) {
        Transform.m251e(this.f502d[i].f960a, transform);
        this.f502d[i].f965f = true;
        this.f506p = true;
    }

    /* JADX INFO: renamed from: b */
    private void m280b(int i, Transform transform) {
        Transform.m251e(transform, this.f502d[i].f960a);
    }

    /* JADX INFO: renamed from: c */
    private void m281c() {
        if (this.f504f == 127) {
            this.f504f = (byte) -128;
        } else {
            this.f504f = (byte) (this.f504f + 1);
        }
    }

    /* JADX INFO: renamed from: d */
    private Transform m282d(int i) {
        Transform transform;
        short[] sArr = this.f507t;
        C0113l[] c0113lArr = this.f502d;
        int i2 = 0;
        while (i != -1) {
            sArr[i2] = (short) i;
            i = c0113lArr[i].f964e;
            i2++;
        }
        int i3 = i2 - 1;
        if (this.f505g) {
            this.f505g = false;
            transform = this.f503e;
        } else {
            int i4 = i3;
            while (i4 >= 0 && !c0113lArr[sArr[i4]].f965f) {
                i4--;
            }
            if (i4 == i3) {
                transform = this.f503e;
                i3 = i4;
            } else {
                transform = c0113lArr[sArr[i4 + 1]].f961b;
                i3 = i4;
            }
        }
        if (i3 >= 0) {
            this.f506p = true;
        }
        while (i3 >= 0) {
            int i5 = i3 - 1;
            C0113l c0113l = c0113lArr[sArr[i3]];
            c0113l.f965f = false;
            c0113l.f961b.m261a(transform, c0113l.f960a);
            transform = c0113l.f961b;
            i3 = i5;
        }
        return transform;
    }

    /* JADX INFO: renamed from: e */
    private Transform m283e(int i) {
        Transform transform;
        float[] fArr;
        Transform transform2;
        short[] sArr = this.f507t;
        C0113l[] c0113lArr = this.f502d;
        int i2 = 0;
        while (i != -1) {
            sArr[i2] = (short) i;
            i = c0113lArr[i].f964e;
            i2++;
        }
        int i3 = i2 - 1;
        if (this.f505g) {
            this.f505g = false;
            transform = this.f503e;
            transform2 = this.f508u;
            fArr = this.f509v;
        } else {
            int i4 = i3;
            while (i4 >= 0 && !c0113lArr[sArr[i4]].f965f) {
                i4--;
            }
            if (i4 == i3) {
                transform = this.f503e;
                transform2 = this.f508u;
                fArr = this.f509v;
                i3 = i4;
            } else {
                C0083da c0083da = (C0083da) c0113lArr[sArr[i4 + 1]];
                transform = c0083da.f961b;
                Transform transform3 = c0083da.f847i;
                fArr = c0083da.f849k;
                transform2 = transform3;
                i3 = i4;
            }
        }
        if (i3 >= 0) {
            this.f506p = true;
        }
        Transform transform4 = transform2;
        while (i3 >= 0) {
            int i5 = i3 - 1;
            C0083da c0083da2 = (C0083da) c0113lArr[sArr[i3]];
            c0083da2.f965f = false;
            transform.m275d(c0083da2.f960a, c0083da2.f961b);
            c0083da2.f847i.m272c(transform4, c0083da2.f960a);
            c0083da2.f961b.m272c(c0083da2.f961b, c0083da2.f847i);
            if (this.f510w == 1) {
                c0083da2.f849k[0] = fArr[0] * c0083da2.f848j[0];
                c0083da2.f849k[1] = fArr[1] * c0083da2.f848j[1];
                c0083da2.f849k[2] = fArr[2] * c0083da2.f848j[2];
                c0083da2.f961b.m269b(c0083da2.f849k);
            } else {
                c0083da2.f961b.m269b(c0083da2.f848j);
            }
            transform = c0083da2.f961b;
            transform4 = c0083da2.f847i;
            fArr = c0083da2.f849k;
            i3 = i5;
        }
        return transform;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo4a(Action action) {
        if (action.f84c != 1) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo5a(ActionController actionController) {
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo6a(C0097do c0097do, float f) {
        C0019ar[] c0019arArr = c0097do.f895a.f85d;
        int length = this.f501c <= c0097do.f895a.f85d.length ? this.f501c : c0097do.f895a.f85d.length;
        for (int i = 0; i < length; i++) {
            c0019arArr[i].m411a(this.f502d[i], f, c0097do.f899e, c0097do.f897c[i], this.f510w);
            this.f502d[i].f965f = true;
        }
        this.f506p = true;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo7a(C0019ar[][] c0019arArr, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, int i) {
        short s = 0;
        for (int i2 = 0; i2 < i; i2++) {
            short s2 = this.f101b[i2].f901g.f90c;
            f500s[i2] = s2;
            f499r[i2] = true;
            if (s <= s2) {
                s = s2;
            }
        }
        int i3 = this.f501c < s ? this.f501c : s;
        for (int i4 = 0; i4 < i3; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                if (i4 >= f500s[i5]) {
                    f499r[i5] = false;
                }
            }
            C0019ar.m408a(c0019arArr, this.f502d[i4], fArr, c0033beArr, fArr2, f499r, i, i4, this.f510w);
            this.f502d[i4].f965f = true;
        }
        this.f506p = true;
    }

    /* JADX INFO: renamed from: b */
    final Transform m284b(int i) {
        return this.f502d[i].f961b;
    }

    /* JADX INFO: renamed from: b */
    final void m285b(boolean z) {
        int i = this.f501c;
        for (int i2 = 0; i2 < i; i2++) {
            this.f502d[i2].f965f = true;
        }
    }

    /* JADX INFO: renamed from: c */
    final Transform m286c(int i) {
        if (!this.f511x && !loopCheck()) {
            return null;
        }
        Transform transformM283e = this.f510w != 0 ? m283e(i) : m282d(i);
        if (!this.f506p) {
            return transformM283e;
        }
        m281c();
        return transformM283e;
    }

    /* JADX INFO: renamed from: d */
    final void m287d(Transform transform) {
        if (this.f503e.m277d(transform)) {
            return;
        }
        Transform.m251e(this.f503e, transform);
        if (this.f510w != 0) {
            float[] fArr = transform.f494b.m;
            this.f509v[0] = Vector3D.length(fArr[0], fArr[1], fArr[2]);
            this.f509v[1] = Vector3D.length(fArr[4], fArr[5], fArr[6]);
            this.f509v[2] = Vector3D.length(fArr[8], fArr[9], fArr[10]);
            f498q[0] = 1.0f / this.f509v[0];
            f498q[1] = 1.0f / this.f509v[1];
            f498q[2] = 1.0f / this.f509v[2];
            Transform.m251e(this.f508u, transform);
            this.f508u.m269b(f498q);
        }
        this.f505g = true;
        this.f506p = true;
    }

    public final int getNumTransform() {
        return this.f501c;
    }

    public final int getParent(int i) {
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        return this.f502d[i].f964e;
    }

    public final void getToWorldTransform(int i, Transform transform) {
        if (transform == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        Transform.m251e(transform, m284b(i));
    }

    public final void getTransform(int i, Transform transform) {
        if (transform == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        m280b(i, transform);
    }

    public final boolean loopCheck() {
        int i = this.f501c;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            int i4 = i2;
            while (i4 != -1) {
                i3++;
                if (i3 > i) {
                    this.f511x = false;
                    return false;
                }
                i4 = this.f502d[i4].f964e;
            }
        }
        this.f511x = true;
        return true;
    }

    public final void mulScale(int i, Vector3D vector3D) {
        if (vector3D == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        f498q[0] = vector3D.f516a;
        f498q[1] = vector3D.f517b;
        f498q[2] = vector3D.f518c;
        this.f502d[i].f960a.m269b(f498q);
        this.f502d[i].f965f = true;
        this.f506p = true;
    }

    public final void relatedMultiply() {
        if (!this.f511x && !loopCheck()) {
            throw new IllegalStateException();
        }
        m285b(true);
        if (this.f510w != 0) {
            for (int i = 0; i < this.f501c; i++) {
                m283e(i);
            }
        } else {
            for (int i2 = 0; i2 < this.f501c; i2++) {
                m282d(i2);
            }
        }
        if (this.f506p) {
            m281c();
        }
        this.f505g = false;
    }

    public final void reset() {
        if (this.f510w != 0) {
            for (int i = 0; i < this.f501c; i++) {
                C0083da c0083da = (C0083da) this.f502d[i];
                Transform.m251e(c0083da.f960a, c0083da.f962c);
                c0083da.f848j[0] = 1.0f;
                c0083da.f848j[1] = 1.0f;
                c0083da.f848j[2] = 1.0f;
                c0083da.f965f = true;
            }
        } else {
            for (int i2 = 0; i2 < this.f501c; i2++) {
                C0113l c0113l = this.f502d[i2];
                Transform.m251e(c0113l.f960a, c0113l.f962c);
                c0113l.f960a.m269b(c0113l.f963d);
                c0113l.f965f = true;
            }
        }
        this.f506p = true;
        relatedMultiply();
    }

    public final void setDampingAngle(int i, float f) {
        if (i < 0 || this.f501c <= i) {
            throw new IndexOutOfBoundsException();
        }
        if (f < 0.0f || 1.0f < f) {
            throw new IllegalArgumentException();
        }
        this.f502d[i].f967h = f;
    }

    public final void setIdentity(int i) {
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        this.f502d[i].f960a.setIdentity();
        this.f502d[i].f965f = true;
        this.f506p = true;
    }

    public final void setParent(int i, int i2) {
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        if ((i2 < 0 || i2 >= this.f501c) && i2 != -1) {
            throw new IndexOutOfBoundsException();
        }
        this.f502d[i].f964e = (short) i2;
        this.f502d[i].f965f = true;
        this.f511x = false;
        this.f506p = true;
    }

    public final void setRestrictionAngle(int i, Vector3D vector3D, Vector3D vector3D2) {
        if (i < 0 || this.f501c <= i) {
            throw new IndexOutOfBoundsException();
        }
        if (vector3D.f516a < -1.0f || 1.0f < vector3D.f516a || vector3D.f517b < -1.0f || 1.0f < vector3D.f517b || vector3D.f518c < -1.0f || 1.0f < vector3D.f518c || vector3D2.f516a < -1.0f || 1.0f < vector3D2.f516a || vector3D2.f517b < -1.0f || 1.0f < vector3D2.f517b || vector3D2.f518c < -1.0f || 1.0f < vector3D2.f518c || vector3D2.f516a < vector3D.f516a || vector3D2.f517b < vector3D.f517b || vector3D2.f518c < vector3D.f518c) {
            throw new IllegalArgumentException();
        }
        this.f502d[i].f966g[0].set(vector3D);
        this.f502d[i].f966g[1].set(vector3D2);
    }

    public final void setRotateEuler(int i, int i2, Vector3D vector3D) {
        if (vector3D == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 < 0 || i2 > 5) {
            throw new IllegalArgumentException();
        }
        f498q[0] = vector3D.f516a;
        f498q[1] = vector3D.f517b;
        f498q[2] = vector3D.f518c;
        Transform.f489a[i2].mo456a(this.f502d[i].f960a, f498q);
        this.f502d[i].f965f = true;
        this.f506p = true;
    }

    public final void setTransform(int i, Transform transform) {
        if (transform == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        m279a(i, transform);
    }

    public final void setTranslate(int i, Vector3D vector3D) {
        if (vector3D == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f501c) {
            throw new IndexOutOfBoundsException();
        }
        f498q[0] = vector3D.f516a;
        f498q[1] = vector3D.f517b;
        f498q[2] = vector3D.f518c;
        this.f502d[i].f960a.m265a(f498q);
        this.f502d[i].f965f = true;
        this.f506p = true;
    }

    public final boolean solveIK(int i, int i2, Vector3D vector3D, boolean z, int i3) {
        boolean z2;
        Vector3D vector3D2 = new Vector3D();
        Vector3D vector3D3 = new Vector3D();
        Vector3D vector3D4 = new Vector3D();
        Vector3D vector3D5 = new Vector3D();
        Transform transform = new Transform();
        Transform transform2 = new Transform();
        Transform transform3 = new Transform();
        if (i < 0 || this.f501c <= i) {
            throw new IndexOutOfBoundsException();
        }
        if (vector3D == null) {
            throw new NullPointerException();
        }
        if (i2 == 0) {
            return false;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= i3) {
                relatedMultiply();
                this.f506p = false;
                return true;
            }
            int parent = getParent(i);
            int i6 = 0;
            boolean z3 = true;
            while (z3) {
                Transform transformM286c = m286c(i);
                Transform transformM286c2 = m286c(parent);
                vector3D2.f516a = transformM286c.f494b.m[12] - transformM286c2.f494b.m[12];
                vector3D2.f517b = transformM286c.f494b.m[13] - transformM286c2.f494b.m[13];
                vector3D2.f518c = transformM286c.f494b.m[14] - transformM286c2.f494b.m[14];
                vector3D3.f516a = vector3D.f516a - transformM286c2.f494b.m[12];
                vector3D3.f517b = vector3D.f517b - transformM286c2.f494b.m[13];
                vector3D3.f518c = vector3D.f518c - transformM286c2.f494b.m[14];
                vector3D3.normalize(vector3D3);
                vector3D2.normalize(vector3D2);
                float fDot = vector3D3.dot(vector3D2);
                if (fDot < 0.9999f) {
                    m280b(parent, transform2);
                    transform3.m260a(transformM286c2, transformM286c2.m253a());
                    vector3D4.cross(vector3D2, vector3D3);
                    transform3.transPosition(vector3D4);
                    vector3D4.normalize(vector3D4);
                    float fAcos = Util3D.acos(fDot);
                    C0113l c0113l = this.f502d[parent];
                    if (z) {
                        if (0.0f <= fAcos && c0113l.f967h < fAcos) {
                            fAcos = c0113l.f967h;
                        } else if (fAcos < 0.0f && c0113l.f967h < (-fAcos)) {
                            fAcos = -c0113l.f967h;
                        }
                    }
                    transform.setRotate(vector3D4, fAcos);
                    transform.multiply(transform2, transform);
                    transform.m258a(4, vector3D5);
                    if (c0113l.f966g[1].f516a < vector3D5.f516a) {
                        vector3D5.f516a = c0113l.f966g[1].f516a;
                        z2 = true;
                    } else if (vector3D5.f516a < c0113l.f966g[0].f516a) {
                        vector3D5.f516a = c0113l.f966g[0].f516a;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c0113l.f966g[1].f517b < vector3D5.f517b) {
                        vector3D5.f517b = c0113l.f966g[1].f517b;
                        z2 = true;
                    } else if (vector3D5.f517b < c0113l.f966g[0].f517b) {
                        vector3D5.f517b = c0113l.f966g[0].f517b;
                        z2 = true;
                    }
                    if (c0113l.f966g[1].f518c < vector3D5.f518c) {
                        vector3D5.f518c = c0113l.f966g[1].f518c;
                        z2 = true;
                    } else if (vector3D5.f518c < c0113l.f966g[0].f518c) {
                        vector3D5.f518c = c0113l.f966g[0].f518c;
                        z2 = true;
                    }
                    if (z2) {
                        f498q[0] = vector3D5.f516a;
                        f498q[1] = vector3D5.f517b;
                        f498q[2] = vector3D5.f518c;
                        Transform.f489a[4].mo456a(transform, f498q);
                    }
                    m279a(parent, transform);
                }
                i6++;
                parent = getParent(parent);
                if (i2 < 0 && parent == -1) {
                    z3 = false;
                } else if ((i2 > 0 && i2 <= i6) || parent == -1) {
                    z3 = false;
                }
            }
            i4 = i5 + 1;
        }
    }
}
