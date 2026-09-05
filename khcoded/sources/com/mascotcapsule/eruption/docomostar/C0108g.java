package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.ogl.GraphicsOGL;
import java.util.Vector;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.g */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0108g {

    /* JADX INFO: renamed from: d */
    private static int[] f931d = new int[17];

    /* JADX INFO: renamed from: e */
    private static int[] f932e = new int[17];

    /* JADX INFO: renamed from: f */
    private static Vector3D f933f = new Vector3D();

    /* JADX INFO: renamed from: g */
    private static Vector3D f934g = new Vector3D();

    /* JADX INFO: renamed from: h */
    private static Transform f935h = new Transform();

    /* JADX INFO: renamed from: i */
    private static Vector3D f936i = new Vector3D();

    /* JADX INFO: renamed from: j */
    private static Vector3D f937j = new Vector3D();

    /* JADX INFO: renamed from: k */
    private static float[] f938k = new float[1];

    /* JADX INFO: renamed from: a */
    Vector f939a;

    /* JADX INFO: renamed from: b */
    Camera f940b;

    /* JADX INFO: renamed from: c */
    Transform f941c;

    /* JADX INFO: renamed from: l */
    private C0116o[] f942l;

    /* JADX INFO: renamed from: m */
    private C0116o[] f943m;

    /* JADX INFO: renamed from: n */
    private int f944n;

    /* JADX INFO: renamed from: o */
    private int f945o;

    /* JADX INFO: renamed from: p */
    private int f946p;

    /* JADX INFO: renamed from: q */
    private int f947q;

    /* JADX INFO: renamed from: r */
    private Appearance f948r;

    /* JADX INFO: renamed from: s */
    private Transform f949s;

    /* JADX INFO: renamed from: t */
    private int f950t;

    /* JADX INFO: renamed from: u */
    private boolean f951u;

    C0108g(Graphics3D graphics3D, int i, int i2) {
        if (i < 2) {
            throw new IllegalArgumentException();
        }
        this.f942l = new C0116o[i];
        this.f943m = new C0116o[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f943m[i3] = new C0116o();
        }
        this.f939a = new Vector(32, 32);
        this.f946p = i2;
        this.f947q = i;
        this.f948r = graphics3D.f305d;
        this.f949s = graphics3D.f304c;
        this.f950t = -1;
        this.f951u = false;
    }

    /* JADX INFO: renamed from: a */
    static final void m504a(int[] iArr, int i) {
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 - i3 <= 10) {
                if (i4 == 0) {
                    break;
                }
                i4--;
                i3 = f931d[i4];
                i2 = f932e[i4];
            }
            int i5 = iArr[(i3 + i2) >> 1];
            int i6 = i2;
            int i7 = i3;
            while (true) {
                if (iArr[i7] >= i5 || i7 >= i2) {
                    while (iArr[i6] > i5 && i6 > i3) {
                        i6--;
                    }
                    if (i7 >= i6) {
                        break;
                    }
                    int i8 = iArr[i7];
                    iArr[i7] = iArr[i6];
                    iArr[i6] = i8;
                    i7++;
                    i6--;
                } else {
                    i7++;
                }
            }
            if (i7 - i3 > i2 - i6) {
                if (i7 - i3 > 10) {
                    f931d[i4] = i3;
                    f932e[i4] = i7 - 1;
                    i4++;
                }
                i3 = i6 + 1;
            } else {
                if (i2 - i6 > 10) {
                    f931d[i4] = i6 + 1;
                    f932e[i4] = i2;
                    i4++;
                }
                i2 = i7 - 1;
            }
        }
        for (int i9 = 1; i9 < i; i9++) {
            int i10 = iArr[i9];
            for (int i11 = i9 - 1; i11 >= 0 && iArr[i11] > i10; i11--) {
                int i12 = iArr[i11 + 1];
                iArr[i11 + 1] = iArr[i11];
                iArr[i11] = i12;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static final void m505a(AbstractC0056ca[] abstractC0056caArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = i - 1;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 - i6 <= 10) {
                if (i7 == 0) {
                    break;
                }
                i7--;
                i6 = f931d[i7];
                i5 = f932e[i7];
            }
            AbstractC0056ca abstractC0056ca = abstractC0056caArr[(i6 + i5) >> 1];
            if (i2 == 1) {
                i3 = i5;
                i4 = i6;
                while (true) {
                    if (!abstractC0056caArr[i4].mo444a(abstractC0056ca) || i4 >= i5) {
                        while (!abstractC0056caArr[i3].mo444a(abstractC0056ca) && i3 > i6) {
                            i3--;
                        }
                        if (i4 >= i3) {
                            break;
                        }
                        AbstractC0056ca abstractC0056ca2 = abstractC0056caArr[i4];
                        abstractC0056caArr[i4] = abstractC0056caArr[i3];
                        abstractC0056caArr[i3] = abstractC0056ca2;
                        i4++;
                        i3--;
                    } else {
                        i4++;
                    }
                }
            } else {
                i3 = i5;
                i4 = i6;
                while (true) {
                    if (!abstractC0056caArr[i4].mo445b(abstractC0056ca) || i4 >= i5) {
                        while (!abstractC0056caArr[i3].mo445b(abstractC0056ca) && i3 > i6) {
                            i3--;
                        }
                        if (i4 >= i3) {
                            break;
                        }
                        AbstractC0056ca abstractC0056ca3 = abstractC0056caArr[i4];
                        abstractC0056caArr[i4] = abstractC0056caArr[i3];
                        abstractC0056caArr[i3] = abstractC0056ca3;
                        i4++;
                        i3--;
                    } else {
                        i4++;
                    }
                }
            }
            if (i4 - i6 > i5 - i3) {
                if (i4 - i6 > 10) {
                    f931d[i7] = i6;
                    f932e[i7] = i4 - 1;
                    i7++;
                }
                i6 = i3 + 1;
            } else {
                if (i5 - i3 > 10) {
                    f931d[i7] = i3 + 1;
                    f932e[i7] = i5;
                    i7++;
                }
                i5 = i4 - 1;
            }
        }
        if (i2 == 1) {
            for (int i8 = 1; i8 < i; i8++) {
                AbstractC0056ca abstractC0056ca4 = abstractC0056caArr[i8];
                for (int i9 = i8 - 1; i9 >= 0 && !abstractC0056caArr[i9].mo444a(abstractC0056ca4); i9--) {
                    AbstractC0056ca abstractC0056ca5 = abstractC0056caArr[i9 + 1];
                    abstractC0056caArr[i9 + 1] = abstractC0056caArr[i9];
                    abstractC0056caArr[i9] = abstractC0056ca5;
                }
            }
            return;
        }
        for (int i10 = 1; i10 < i; i10++) {
            AbstractC0056ca abstractC0056ca6 = abstractC0056caArr[i10];
            for (int i11 = i10 - 1; i11 >= 0 && !abstractC0056caArr[i11].mo445b(abstractC0056ca6); i11--) {
                AbstractC0056ca abstractC0056ca7 = abstractC0056caArr[i11 + 1];
                abstractC0056caArr[i11 + 1] = abstractC0056caArr[i11];
                abstractC0056caArr[i11] = abstractC0056ca7;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m506b(C0116o c0116o) {
        C0116o[] c0116oArr = this.f942l;
        int i = this.f944n;
        this.f944n = i + 1;
        c0116oArr[i] = c0116o;
    }

    /* JADX INFO: renamed from: e */
    private void m507e() {
        for (int i = 0; i < this.f944n; i++) {
            C0116o c0116o = this.f942l[i];
            VertexBuffer vertexBuffer = c0116o.f976c;
            if (vertexBuffer.f522A.f825b != c0116o.f978e.f321H) {
                vertexBuffer.m336a(c0116o.f978e, vertexBuffer.f522A);
            }
            vertexBuffer.f528G = false;
            if (c0116o.f979f != null) {
                c0116o.f979f.m46a((TransformTree) null, 0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final int m508a() {
        return this.f950t;
    }

    /* JADX INFO: renamed from: a */
    final void m509a(int i) {
        if (i < 0) {
            this.f950t = -1;
            this.f951u = false;
        } else {
            this.f950t = i;
            this.f951u = true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    final void m510a(Batch batch, int i, boolean z) throws IllegalStateException {
        C0116o c0116oM517d = m517d();
        IndexBuffer indexBuffer = batch.f126c;
        if (c0116oM517d == null) {
            throw new IllegalStateException();
        }
        c0116oM517d.f975b = 0.0f;
        c0116oM517d.f976c = batch.f125b;
        c0116oM517d.f977d = c0116oM517d.f976c.m344e(0);
        if (batch.f127d == null) {
            c0116oM517d.f984k = null;
        } else {
            if (indexBuffer.f352y.m31i()) {
                batch.f124a.m62d();
                c0116oM517d.f976c.f527F = batch.f124a.f147g;
            }
            c0116oM517d.f984k = batch.f127d[0];
        }
        c0116oM517d.f979f = batch.f124a;
        c0116oM517d.f980g = batch.f124a.f145e;
        c0116oM517d.f981h = null;
        c0116oM517d.f982i = null;
        c0116oM517d.f985l = batch;
        c0116oM517d.f986m = null;
        c0116oM517d.f987n.setIdentity();
        c0116oM517d.f989p = z;
        c0116oM517d.f990q = false;
        c0116oM517d.f991r = false;
        c0116oM517d.f992s = false;
        c0116oM517d.f978e = indexBuffer;
        if (indexBuffer.f352y != null) {
            c0116oM517d.f983j = indexBuffer.f352y.m27b(0);
            for (int i2 = 0; i2 < 2; i2++) {
                if (indexBuffer.f352y.f110e[i2].f714l != null) {
                    indexBuffer.f352y.f110e[i2].f714l.f371s = -1;
                }
            }
        } else {
            c0116oM517d.f983j = this.f948r.m27b(0);
        }
        c0116oM517d.f974a = (c0116oM517d.f983j.f997c.f760l ? 1 : 0) | (c0116oM517d.f983j.f997c.f759k << 1);
        m506b(c0116oM517d);
    }

    /* JADX INFO: renamed from: a */
    final void m511a(Figure figure, Figure figure2, Transform transform, int i, boolean z, boolean z2, boolean z3) {
        C0117p c0117pM27b;
        short s = figure.f223a;
        BoneDeformer boneDeformer = figure.f227e;
        MorphDeformer morphDeformer = figure.f228f;
        boolean z4 = (boneDeformer == null || z3) ? false : true;
        C0059cd c0059cdM200b = morphDeformer != null ? morphDeformer.m200b(i) : null;
        for (int i2 = 0; i2 < s; i2++) {
            IndexBuffer indexBuffer = figure.f224b[i2];
            Appearance appearance = (indexBuffer.f352y == null || !Appearance.m23l(indexBuffer.f352y.f109d.f749a)) ? indexBuffer.f352y : figure2.f237w;
            if (appearance != null) {
                if (Appearance.m22k(appearance.f109d.f749a)) {
                    for (int i3 = 0; i3 < 2; i3++) {
                        if (appearance.f110e[i3].f714l != null) {
                            appearance.f110e[i3].f714l.f371s = -1;
                        }
                    }
                    c0117pM27b = appearance.m27b(i);
                } else {
                    continue;
                }
            } else {
                c0117pM27b = this.f948r.m27b(0);
            }
            C0116o c0116oM517d = m517d();
            if (c0116oM517d == null) {
                throw new IllegalStateException();
            }
            c0116oM517d.f975b = 0.0f;
            c0116oM517d.f976c = figure.f225c;
            c0116oM517d.f977d = c0116oM517d.f976c.m344e(i);
            if (figure.f230p == null) {
                c0116oM517d.f984k = null;
            } else {
                if (appearance.m31i()) {
                    boneDeformer.m62d();
                    c0116oM517d.f976c.f527F = boneDeformer.f147g;
                }
                c0116oM517d.f984k = figure.f230p[i2];
            }
            c0116oM517d.f979f = boneDeformer;
            c0116oM517d.f980g = boneDeformer == null ? null : boneDeformer.f145e;
            c0116oM517d.f981h = morphDeformer;
            c0116oM517d.f982i = c0059cdM200b;
            c0116oM517d.f985l = null;
            c0116oM517d.f986m = figure.f233s;
            Transform.m251e(c0116oM517d.f987n, transform);
            c0116oM517d.f989p = z;
            c0116oM517d.f990q = z4;
            c0116oM517d.f991r = z2;
            c0116oM517d.f992s = false;
            c0116oM517d.f978e = indexBuffer;
            c0116oM517d.f983j = c0117pM27b;
            c0116oM517d.f974a = (c0116oM517d.f983j.f997c.f760l ? 1 : 0) | (c0116oM517d.f983j.f997c.f759k << 1);
            m506b(c0116oM517d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x02be  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX INFO: renamed from: a */
    final void m512a(Graphics3D graphics3D, GraphicsOGL graphicsOGL, Transform transform, Camera camera, int i) throws Throwable {
        int i2;
        int i3 = 0;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 14) != 0;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= this.f944n) {
                break;
            }
            C0116o c0116o = this.f942l[i5];
            c0116o.f988o.m261a(transform, c0116o.f987n);
            IndexBuffer indexBuffer = c0116o.f978e;
            if (!z2 || c0116o.f992s) {
                c0116o.f993t = false;
            } else {
                GeometricShape geometricShape = null;
                if ((i & 12) == 12) {
                    geometricShape = c0116o.f986m;
                } else if ((i & 4) != 0) {
                    geometricShape = indexBuffer.f349v;
                }
                if (geometricShape != null) {
                    geometricShape.m133b(c0116o.f988o, f936i, f938k);
                    if (Collision3D.m77a(f936i, f938k[0], camera.f176c)) {
                        c0116o.f993t = true;
                    } else {
                        c0116o.f993t = false;
                    }
                } else if ((i & 2) == 0) {
                    c0116o.f993t = true;
                } else {
                    c0116o.f993t = false;
                }
                i4 = i5 + 1;
            }
            if (z) {
                if (c0116o.f990q && c0116o.f981h != null) {
                    indexBuffer.m163a(c0116o.f976c, c0116o.f979f, this.f949s, c0116o.f981h, c0116o.f980g, c0116o.f982i);
                } else if (c0116o.f990q) {
                    indexBuffer.m164a(c0116o.f976c, c0116o.f979f, this.f949s, c0116o.f980g);
                } else if (c0116o.f981h != null) {
                    indexBuffer.m165a(c0116o.f976c, c0116o.f981h, c0116o.f982i);
                } else {
                    indexBuffer.m169b(c0116o.f976c);
                }
                c0116o.f988o.m262a(indexBuffer.f353z, f934g);
                c0116o.f975b = f934g.distance(f933f);
            }
            i4 = i5 + 1;
        }
        if (z) {
            m505a(this.f942l, this.f944n, 2);
        } else {
            m505a(this.f942l, this.f944n, 1);
        }
        for (int i6 = 0; i6 < this.f944n; i6++) {
            C0116o c0116o2 = this.f942l[i6];
            if (c0116o2.f993t) {
                i2 = i3;
            } else {
                VertexBuffer vertexBuffer = c0116o2.f976c;
                IndexBuffer indexBuffer2 = c0116o2.f978e;
                if (c0116o2.f984k == null) {
                    if (c0116o2.f990q && c0116o2.f981h != null) {
                        c0116o2.f979f.m45a(c0116o2.f981h, indexBuffer2, vertexBuffer, c0116o2.f980g, c0116o2.f982i);
                    } else if (c0116o2.f990q) {
                        c0116o2.f979f.m44a(indexBuffer2, vertexBuffer, c0116o2.f980g);
                    } else if (c0116o2.f981h != null) {
                        c0116o2.f981h.m194a(indexBuffer2, vertexBuffer, c0116o2.f982i);
                    }
                    if (c0116o2.f991r) {
                        if (vertexBuffer.f539d[4]) {
                            vertexBuffer.m345h();
                        }
                        if (vertexBuffer.f539d[7]) {
                            vertexBuffer.m342d();
                        }
                        if (c0116o2.f977d.f825b != indexBuffer2.f321H) {
                            vertexBuffer.m336a(indexBuffer2, c0116o2.f977d);
                        }
                        vertexBuffer.m343d(c0116o2.f988o);
                        this.f949s.m264a(graphics3D.f309h, graphicsOGL, -2);
                    } else {
                        if (z2) {
                            f935h.m267b(camera.f176c, c0116o2.f988o);
                            c0116o2.f978e.m166a(c0116o2.f976c, f936i, f937j);
                            if (Collision3D.m77a(f936i, f936i.distance(f937j), f935h)) {
                                i2 = i3;
                            }
                        }
                        if (c0116o2.f977d.f825b != indexBuffer2.f321H) {
                            vertexBuffer.m336a(indexBuffer2, c0116o2.f977d);
                        }
                        if (camera.getCameraType() == 0) {
                            for (int i7 = 0; i7 < 2; i7++) {
                                c0116o2.f983j.f998d[i7].f716n = false;
                            }
                        }
                        if (c0116o2.f989p) {
                            if (c0116o2.f990q && c0116o2.f981h != null) {
                                c0116o2.f979f.m57b(c0116o2.f981h, indexBuffer2, vertexBuffer, c0116o2.f980g, c0116o2.f982i);
                            } else if (c0116o2.f990q) {
                                c0116o2.f979f.m56b(indexBuffer2, vertexBuffer, c0116o2.f980g);
                            } else if (c0116o2.f981h != null) {
                                c0116o2.f981h.m201b(indexBuffer2, vertexBuffer, c0116o2.f982i);
                            }
                        }
                        if (c0116o2.f981h != null) {
                            c0116o2.f981h.m203c(indexBuffer2, vertexBuffer, c0116o2.f982i);
                        }
                        if (c0116o2.f985l != null && !c0116o2.f985l.f129f) {
                            c0116o2.f985l.m40a(graphics3D, c0116o2.f988o, z && c0116o2.f983j.f997c.f760l);
                        }
                        c0116o2.f988o.m264a(graphics3D.f309h, graphicsOGL, -2);
                    }
                } else {
                    if (c0116o2.f977d.f825b != indexBuffer2.f321H) {
                        vertexBuffer.m336a(indexBuffer2, c0116o2.f977d);
                    }
                    if (camera.getCameraType() == 0) {
                        for (int i8 = 0; i8 < 2; i8++) {
                            c0116o2.f983j.f998d[i8].f716n = false;
                        }
                    }
                    if (c0116o2.f985l != null && !c0116o2.f985l.f129f) {
                        c0116o2.f985l.m38a(graphicsOGL, graphics3D, c0116o2.f988o, z && c0116o2.f983j.f997c.f760l);
                    }
                    if (c0116o2.f983j.f995a.m30h()) {
                        vertexBuffer.m333a(c0116o2.f979f, c0116o2.f981h, c0116o2.f982i, indexBuffer2, c0116o2.f980g);
                    }
                    if (c0116o2.f983j.f995a.m31i()) {
                        vertexBuffer.m332a(c0116o2.f979f, c0116o2.f981h, c0116o2.f980g, c0116o2.f982i, indexBuffer2);
                    }
                    c0116o2.f979f.m48a(c0116o2.f980g, c0116o2.f988o);
                }
                graphics3D.m151a(graphicsOGL, c0116o2);
                vertexBuffer.m338b();
                if (graphics3D.f303b && this.f951u) {
                    i2 = indexBuffer2.f351x + i3;
                    if (this.f950t < i2) {
                        C0009ah.m361b(graphicsOGL);
                        i2 = 0;
                    }
                } else {
                    i2 = i3;
                }
            }
            i3 = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m513a(VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Transform transform, int i, boolean z, boolean z2, boolean z3) {
        C0116o c0116oM517d = m517d();
        if (c0116oM517d == null) {
            throw new IllegalStateException();
        }
        c0116oM517d.f975b = 0.0f;
        c0116oM517d.f976c = vertexBuffer;
        c0116oM517d.f977d = vertexBuffer.m344e(i);
        c0116oM517d.f984k = null;
        c0116oM517d.f979f = null;
        c0116oM517d.f980g = null;
        c0116oM517d.f981h = null;
        c0116oM517d.f982i = null;
        c0116oM517d.f985l = null;
        c0116oM517d.f986m = null;
        Transform.m251e(c0116oM517d.f987n, transform);
        c0116oM517d.f989p = z;
        c0116oM517d.f990q = false;
        c0116oM517d.f991r = z2;
        c0116oM517d.f992s = z3;
        c0116oM517d.f978e = indexBuffer;
        if (indexBuffer.f352y != null) {
            c0116oM517d.f983j = indexBuffer.f352y.m27b(i);
            for (int i2 = 0; i2 < 2; i2++) {
                if (indexBuffer.f352y.f110e[i2].f714l != null) {
                    indexBuffer.f352y.f110e[i2].f714l.f371s = -1;
                }
            }
        } else {
            c0116oM517d.f983j = this.f948r.m27b(0);
        }
        c0116oM517d.f974a = (c0116oM517d.f983j.f997c.f760l ? 1 : 0) | (c0116oM517d.f983j.f997c.f759k << 1);
        m506b(c0116oM517d);
    }

    /* JADX INFO: renamed from: a */
    final void m514a(C0116o c0116o) {
        if (c0116o == null) {
            return;
        }
        c0116o.f994u = false;
        this.f945o = 0;
        this.f944n = 0;
    }

    /* JADX INFO: renamed from: b */
    final void m515b() {
        int size = this.f939a.size();
        m507e();
        for (int i = 0; i < size; i++) {
            ((Object3D) this.f939a.elementAt(i)).f403k = 0;
        }
        this.f939a.removeAllElements();
        int i2 = this.f944n;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f942l[i3].f994u = false;
        }
        this.f945o = 0;
        this.f944n = 0;
        this.f940b = null;
        this.f941c = null;
    }

    /* JADX INFO: renamed from: c */
    final void m516c() {
        int size = this.f939a.size();
        m507e();
        for (int i = 0; i < size; i++) {
            ((Object3D) this.f939a.elementAt(i)).f403k = 0;
        }
        this.f939a.removeAllElements();
        int i2 = this.f947q;
        for (int i3 = 0; i3 < i2; i3++) {
            C0116o c0116o = this.f943m[i3];
            c0116o.f974a = 0;
            c0116o.f975b = 0.0f;
            c0116o.f976c = null;
            c0116o.f977d = null;
            c0116o.f978e = null;
            c0116o.f979f = null;
            c0116o.f980g = null;
            c0116o.f981h = null;
            c0116o.f982i = null;
            c0116o.f983j = null;
            c0116o.f984k = null;
            c0116o.f985l = null;
            c0116o.f986m = null;
            c0116o.f987n.setIdentity();
            c0116o.f988o.setIdentity();
            c0116o.f989p = false;
            c0116o.f990q = false;
            c0116o.f991r = false;
            c0116o.f992s = false;
            c0116o.f993t = false;
            c0116o.f994u = false;
        }
        this.f945o = 0;
        this.f944n = 0;
        this.f940b = null;
        this.f941c = null;
    }

    /* JADX INFO: renamed from: d */
    final C0116o m517d() {
        C0116o c0116o;
        int i = this.f945o;
        do {
            C0116o[] c0116oArr = this.f943m;
            int i2 = this.f945o;
            this.f945o = i2 + 1;
            c0116o = c0116oArr[i2];
            if (this.f945o >= this.f947q) {
                this.f945o = 0;
            }
            if (this.f945o == i) {
                if (this.f946p <= 0) {
                    return null;
                }
                this.f945o = this.f947q;
                int i3 = this.f946p + this.f947q;
                C0116o[] c0116oArr2 = new C0116o[i3];
                C0116o[] c0116oArr3 = new C0116o[i3];
                for (int i4 = 0; i4 < this.f947q; i4++) {
                    c0116oArr2[i4] = this.f942l[i4];
                }
                for (int i5 = 0; i5 < this.f947q; i5++) {
                    c0116oArr3[i5] = this.f943m[i5];
                }
                for (int i6 = this.f947q; i6 < i3; i6++) {
                    c0116oArr3[i6] = new C0116o();
                }
                this.f942l = c0116oArr2;
                this.f943m = c0116oArr3;
                this.f947q = i3;
            }
        } while (c0116o.f994u);
        c0116o.f994u = true;
        return c0116o;
    }
}
