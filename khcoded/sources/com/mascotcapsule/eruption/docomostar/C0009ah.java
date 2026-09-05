package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.ByteBuffer;
import com.docomostar.ui.ogl.DirectBuffer;
import com.docomostar.ui.ogl.DirectBufferFactory;
import com.docomostar.ui.ogl.FloatBuffer;
import com.docomostar.ui.ogl.GraphicsOGL;
import com.docomostar.ui.ogl.ShortBuffer;
import com.docomostar.ui.ogl.math.Matrix4f;
import p000.GameCommon;

/* JADX INFO: renamed from: com.mascotcapsule.eruption.docomostar.ah */
/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
final class C0009ah {

    /* JADX INFO: renamed from: r */
    private static int[] f588r;

    /* JADX INFO: renamed from: v */
    private static ShortBuffer f592v;

    /* JADX INFO: renamed from: w */
    private static FloatBuffer f593w;

    /* JADX INFO: renamed from: A */
    private VertexBuffer f594A;

    /* JADX INFO: renamed from: B */
    private VertexBuffer f595B;

    /* JADX INFO: renamed from: C */
    private C0104dv f596C;

    /* JADX INFO: renamed from: D */
    private C0104dv f597D;

    /* JADX INFO: renamed from: F */
    private C0127z[] f599F;

    /* JADX INFO: renamed from: G */
    private int f600G;

    /* JADX INFO: renamed from: H */
    private float[] f601H;

    /* JADX INFO: renamed from: I */
    private float[] f602I;

    /* JADX INFO: renamed from: J */
    private float[] f603J;

    /* JADX INFO: renamed from: K */
    private float[] f604K;

    /* JADX INFO: renamed from: L */
    private float[] f605L;

    /* JADX INFO: renamed from: M */
    private float[] f606M;

    /* JADX INFO: renamed from: N */
    private float f607N;

    /* JADX INFO: renamed from: O */
    private float f608O;

    /* JADX INFO: renamed from: P */
    private int f609P;

    /* JADX INFO: renamed from: Q */
    private int f610Q;

    /* JADX INFO: renamed from: R */
    private int f611R;

    /* JADX INFO: renamed from: S */
    private int f612S;

    /* JADX INFO: renamed from: T */
    private float f613T;

    /* JADX INFO: renamed from: U */
    private float f614U;

    /* JADX INFO: renamed from: V */
    private boolean f615V;

    /* JADX INFO: renamed from: W */
    private boolean f616W;

    /* JADX INFO: renamed from: X */
    private boolean f617X;

    /* JADX INFO: renamed from: Y */
    private boolean f618Y;

    /* JADX INFO: renamed from: Z */
    private boolean f619Z;

    /* JADX INFO: renamed from: a */
    int f620a;

    /* JADX INFO: renamed from: aa */
    private boolean f621aa;

    /* JADX INFO: renamed from: ab */
    private boolean f622ab;

    /* JADX INFO: renamed from: ac */
    private boolean f623ac;

    /* JADX INFO: renamed from: ad */
    private boolean f624ad;

    /* JADX INFO: renamed from: ae */
    private boolean f625ae;

    /* JADX INFO: renamed from: af */
    private boolean f626af;

    /* JADX INFO: renamed from: ag */
    private boolean f627ag;

    /* JADX INFO: renamed from: ah */
    private boolean f628ah;

    /* JADX INFO: renamed from: ai */
    private boolean f629ai;

    /* JADX INFO: renamed from: aj */
    private int f630aj;

    /* JADX INFO: renamed from: ak */
    private float f631ak;

    /* JADX INFO: renamed from: al */
    private float f632al;

    /* JADX INFO: renamed from: am */
    private float f633am;

    /* JADX INFO: renamed from: an */
    private boolean f634an;

    /* JADX INFO: renamed from: b */
    C0049bu f635b;

    /* JADX INFO: renamed from: x */
    private int f636x;

    /* JADX INFO: renamed from: c */
    private static final float[] f573c = {0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d */
    private static final float[] f574d = {1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: e */
    private static final float[] f575e = {0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: f */
    private static final float[] f576f = {0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: g */
    private static final float[] f577g = {0.0f, 0.0f, -1.0f, 0.0f};

    /* JADX INFO: renamed from: h */
    private static final int[] f578h = {7424, 7425};

    /* JADX INFO: renamed from: i */
    private static final int[] f579i = {5888, 5889, 5890, 5890};

    /* JADX INFO: renamed from: j */
    private static final int[] f580j = {7681, 260, 3042, 8449, 8448};

    /* JADX INFO: renamed from: k */
    private static final int[] f581k = {10497, 33071};

    /* JADX INFO: renamed from: l */
    private static final int[] f582l = {-1, 0, 1, 3, 4, 5, 6, 4};

    /* JADX INFO: renamed from: m */
    private static int[] f583m = {0, 6407, 6408, 6407, 6408, 6408, 6407, 6408, 6407, 6408, 6408, 6407, 6408, 6407, 6408, 6408, 6409, 6406, 6410, 0, 6407, 6407, 6408};

    /* JADX INFO: renamed from: n */
    private static int[] f584n = {0, 5121, 5121, 33635, 32820, 32819, 35733, 35734, 35735, 35737, 35736, 35728, 35729, 35730, 35732, 35731, 5121, 5121, 5121, 0, 33635, 5121, 5121};

    /* JADX INFO: renamed from: o */
    private static final int[] f585o = {34962, 34963};

    /* JADX INFO: renamed from: p */
    private static final int[] f586p = {1029, 1028, -1};

    /* JADX INFO: renamed from: q */
    private static final int[] f587q = {1028, 1029, -1};

    /* JADX INFO: renamed from: s */
    private static int[] f589s = new int[1];

    /* JADX INFO: renamed from: t */
    private static RegionI f590t = new RegionI();

    /* JADX INFO: renamed from: u */
    private static Matrix4f f591u = new Matrix4f();

    /* JADX INFO: renamed from: y */
    private RegionI f637y = new RegionI();

    /* JADX INFO: renamed from: z */
    private RegionI f638z = new RegionI();

    /* JADX INFO: renamed from: E */
    private C0077cv[] f598E = new C0077cv[2];

    static {
        DirectBufferFactory factory = DirectBufferFactory.getFactory();
        f592v = factory.allocateShortBuffer(8);
        f593w = factory.allocateFloatBuffer(8);
    }

    C0009ah(GraphicsOGL graphicsOGL, int i, int i2) {
        this.f636x = i2;
        for (int i3 = 0; i3 < 2; i3++) {
            this.f598E[i3] = new C0077cv();
        }
        this.f599F = new C0127z[8];
        for (int i4 = 0; i4 < 8; i4++) {
            this.f599F[i4] = new C0127z();
        }
        this.f601H = new float[4];
        this.f602I = new float[4];
        this.f603J = new float[4];
        this.f604K = new float[4];
        this.f605L = new float[4];
        this.f606M = new float[4];
        this.f635b = new C0049bu(graphicsOGL);
        m370a(graphicsOGL);
    }

    /* JADX INFO: renamed from: a */
    static int m355a(GraphicsOGL graphicsOGL, Texture texture) {
        int i = texture.f475e;
        graphicsOGL.glGenTextures(f589s);
        if (graphicsOGL.glGetError() != 0) {
            throw new OutOfMemoryError("OpenGL memory");
        }
        graphicsOGL.glBindTexture(3553, f589s[0]);
        if (texture.m247b()) {
            if (texture.f481s != null) {
                texture.f481s.m70a(texture.f482t[0]);
            }
            graphicsOGL.glCompressedTexImage2D(3553, (-texture.f476f) + 1, f584n[i], texture.f473c, texture.f474d, 0, texture.f478p);
            if (graphicsOGL.glGetError() != 0) {
                if (!texture.f487y) {
                    graphicsOGL.glDeleteTextures(f589s);
                }
                throw new OutOfMemoryError("OpenGL memory");
            }
        } else {
            for (int i2 = 0; i2 < texture.f476f; i2++) {
                texture.getLevelSize(i2, f590t);
                if (texture.f481s != null) {
                    texture.f481s.m70a(texture.f482t[i2]);
                }
                graphicsOGL.glTexImage2D(3553, i2, f583m[i], f590t.f462c, f590t.f463d, 0, f583m[i], f584n[i], texture.f477g[i2]);
                if (graphicsOGL.glGetError() != 0) {
                    if (!texture.f487y) {
                        graphicsOGL.glDeleteTextures(f589s);
                    }
                    throw new OutOfMemoryError("OpenGL memory");
                }
            }
        }
        return f589s[0];
    }

    /* JADX INFO: renamed from: a */
    static void m356a(int i) {
        f583m[20] = f583m[i];
        f584n[20] = f584n[i];
    }

    /* JADX INFO: renamed from: a */
    static void m357a(GraphicsOGL graphicsOGL, int i, DirectBuffer directBuffer, int i2) {
        graphicsOGL.glBufferSubData(f585o[i], i2, directBuffer);
    }

    /* JADX INFO: renamed from: a */
    private void m358a(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, boolean z) {
        m382a(graphicsOGL, vertexBuffer, 4, z);
    }

    /* JADX INFO: renamed from: a */
    private static void m359a(GraphicsOGL graphicsOGL, C0069cn[] c0069cnArr) {
        for (C0069cn c0069cn : c0069cnArr) {
            graphicsOGL.glDrawElements(f582l[c0069cn.f805a], c0069cn.f806b, 5123, c0069cn.f809e);
        }
    }

    /* JADX INFO: renamed from: b */
    static int m360b(GraphicsOGL graphicsOGL, Texture texture) {
        int i = texture.f475e;
        graphicsOGL.glBindTexture(3553, texture.f480r);
        if (texture.m247b()) {
            if (texture.f481s != null) {
                texture.f481s.m70a(texture.f482t[0]);
            }
            graphicsOGL.glCompressedTexImage2D(3553, (-texture.f476f) + 1, f584n[i], texture.f473c, texture.f474d, 0, texture.f478p);
            if (graphicsOGL.glGetError() != 0) {
                throw new OutOfMemoryError("OpenGL memory");
            }
        } else if (texture.f485w == -2) {
            for (int i2 = 0; i2 < texture.f476f; i2++) {
                texture.getLevelSize(i2, f590t);
                if (texture.f481s != null) {
                    texture.f481s.m70a(texture.f482t[i2]);
                }
                graphicsOGL.glTexSubImage2D(3553, i2, f590t.f460a, f590t.f461b, f590t.f462c, f590t.f463d, f583m[i], f584n[i], texture.f477g[i2]);
                if (graphicsOGL.glGetError() != 0) {
                    throw new OutOfMemoryError("OpenGL memory");
                }
            }
        } else {
            byte b = texture.f485w;
            texture.getLevelSize(b, f590t);
            if (texture.f481s != null) {
                texture.f481s.m70a(texture.f482t[b]);
            }
            graphicsOGL.glTexSubImage2D(3553, b, f590t.f460a, f590t.f461b, f590t.f462c, f590t.f463d, f583m[i], f584n[i], texture.f477g[b]);
            if (graphicsOGL.glGetError() != 0) {
                throw new OutOfMemoryError("OpenGL memory");
            }
        }
        return texture.f480r;
    }

    /* JADX INFO: renamed from: b */
    static void m361b(GraphicsOGL graphicsOGL) {
        graphicsOGL.glFlush();
    }

    /* JADX INFO: renamed from: b */
    static final void m362b(GraphicsOGL graphicsOGL, float[] fArr) {
        graphicsOGL.glMultMatrixf(fArr);
    }

    /* JADX INFO: renamed from: c */
    static void m363c(GraphicsOGL graphicsOGL, int i) {
        f589s[0] = i;
        graphicsOGL.glDeleteBuffers(f589s);
    }

    /* JADX INFO: renamed from: c */
    static void m364c(GraphicsOGL graphicsOGL, Texture texture) {
        f589s[0] = texture.f480r;
        graphicsOGL.glDeleteTextures(f589s);
    }

    /* JADX INFO: renamed from: d */
    static void m365d(GraphicsOGL graphicsOGL, Texture texture) {
        if (texture.f484v != null) {
            graphicsOGL.glBindTexture(3553, texture.f480r);
            graphicsOGL.glCopyTexImage2D(3553, 0, f583m[texture.f475e], 0, 0, texture.f473c, texture.f474d, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    static final void m366f(GraphicsOGL graphicsOGL, int i) {
        graphicsOGL.glMatrixMode(f579i[0]);
        graphicsOGL.glPushMatrix();
    }

    /* JADX INFO: renamed from: g */
    static final void m367g(GraphicsOGL graphicsOGL, int i) {
        graphicsOGL.glMatrixMode(f579i[0]);
        graphicsOGL.glPopMatrix();
    }

    /* JADX INFO: renamed from: a */
    final int m368a(GraphicsOGL graphicsOGL, C0104dv c0104dv, DirectBuffer directBuffer) {
        graphicsOGL.glGenBuffers(f589s);
        if (graphicsOGL.glGetError() != 0) {
            throw new OutOfMemoryError("OpenGL memory");
        }
        graphicsOGL.glBindBuffer(f585o[c0104dv.f920a], f589s[0]);
        this.f629ai = true;
        if (c0104dv.f920a == 0) {
            this.f596C = c0104dv;
        } else {
            this.f597D = c0104dv;
        }
        graphicsOGL.glBufferData(f585o[c0104dv.f920a], directBuffer, 35044);
        if (graphicsOGL.glGetError() == 0) {
            return f589s[0];
        }
        graphicsOGL.glDeleteBuffers(f589s);
        throw new OutOfMemoryError("OpenGL memory");
    }

    /* JADX INFO: renamed from: a */
    final void m369a(int i, int i2) {
        this.f636x = i2;
    }

    /* JADX INFO: renamed from: a */
    final void m370a(GraphicsOGL graphicsOGL) {
        graphicsOGL.glDisable(3024);
        graphicsOGL.glDisable(32925);
        graphicsOGL.glDepthFunc(515);
        graphicsOGL.glFrontFace(2305);
        graphicsOGL.glLightModelfv(2899, f573c);
        graphicsOGL.glEnable(3089);
        graphicsOGL.glViewport(this.f637y.f460a, this.f636x - (this.f637y.f461b + this.f637y.f463d), this.f637y.f462c, this.f637y.f463d);
        graphicsOGL.glScissor(this.f638z.f460a, this.f636x - (this.f638z.f461b + this.f638z.f463d), this.f638z.f462c, this.f638z.f463d);
        this.f594A = null;
        this.f595B = null;
        this.f596C = null;
        this.f597D = null;
        graphicsOGL.glDisableClientState(32884);
        graphicsOGL.glDisableClientState(32885);
        graphicsOGL.glDisableClientState(32886);
        graphicsOGL.glDisableClientState(34477);
        graphicsOGL.glDisableClientState(34884);
        graphicsOGL.glBindBuffer(34962, 0);
        graphicsOGL.glBindBuffer(34963, 0);
        if (this.f615V) {
            f588r = f587q;
        } else {
            f588r = f586p;
        }
        for (int i = 0; i < 2; i++) {
            this.f598E[i].m478a();
            m393d(graphicsOGL, i);
            graphicsOGL.glBindTexture(3553, 0);
            graphicsOGL.glDisableClientState(32888);
            graphicsOGL.glTexEnvf(8960, 8704, 7681.0f);
            graphicsOGL.glTexEnvfv(8960, 8705, f573c);
            m394e(graphicsOGL, i);
        }
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = i2 + 16384;
            this.f599F[i2].m522a();
            graphicsOGL.glDisable(i3);
            graphicsOGL.glLightfv(i3, 4608, f573c);
            graphicsOGL.glLightfv(i3, 4609, f573c);
            graphicsOGL.glLightfv(i3, 4610, f573c);
            graphicsOGL.glLightf(i3, 4615, 1.0f);
            graphicsOGL.glLightf(i3, 4616, 0.0f);
            graphicsOGL.glLightf(i3, 4617, 0.0f);
            graphicsOGL.glLightf(i3, 4613, 0.0f);
            graphicsOGL.glLightf(i3, 4614, 180.0f);
        }
        this.f600G = 0;
        graphicsOGL.glDisable(2977);
        graphicsOGL.glDisable(32826);
        Util3D.m296b(this.f601H, -1);
        Util3D.m296b(this.f602I, -13421773);
        Util3D.m296b(this.f603J, -3355444);
        Util3D.m296b(this.f604K, 0);
        Util3D.m296b(this.f605L, 0);
        this.f607N = 0.0f;
        this.f608O = 0.0f;
        this.f613T = 0.0f;
        this.f614U = 0.0f;
        this.f609P = 1;
        this.f610Q = 0;
        this.f611R = 0;
        this.f612S = 1;
        this.f616W = false;
        this.f617X = false;
        this.f618Y = false;
        this.f619Z = false;
        this.f621aa = false;
        this.f622ab = true;
        this.f623ac = true;
        this.f624ad = true;
        this.f625ae = true;
        this.f626af = false;
        this.f627ag = false;
        this.f628ah = false;
        this.f629ai = false;
        graphicsOGL.glDisable(2896);
        graphicsOGL.glLightModelf(2898, 0.0f);
        graphicsOGL.glColor4f(this.f601H[0], this.f601H[1], this.f601H[2], this.f601H[3]);
        graphicsOGL.glMaterialfv(1032, 4608, this.f602I);
        graphicsOGL.glMaterialfv(1032, 4609, this.f603J);
        graphicsOGL.glMaterialfv(1032, 5632, this.f604K);
        graphicsOGL.glMaterialfv(1032, 4610, this.f605L);
        graphicsOGL.glMaterialf(1032, 5633, this.f607N);
        graphicsOGL.glDisable(2903);
        graphicsOGL.glDisable(3042);
        graphicsOGL.glBlendFunc(this.f609P, this.f610Q);
        graphicsOGL.glDisable(3008);
        graphicsOGL.glAlphaFunc(518, this.f608O);
        graphicsOGL.glEnable(2929);
        graphicsOGL.glDepthMask(true);
        graphicsOGL.glColorMask(true, true, true, true);
        graphicsOGL.glHint(3152, 4353);
        graphicsOGL.glDisable(32823);
        graphicsOGL.glPolygonOffset(this.f613T, this.f614U);
        graphicsOGL.glEnable(2884);
        graphicsOGL.glCullFace(1029);
        graphicsOGL.glShadeModel(7425);
        graphicsOGL.glDisable(34880);
        this.f630aj = 0;
        Util3D.m291a(this.f606M, GameCommon.K_ANY);
        this.f606M[3] = 1.0f;
        this.f631ak = 1.0f;
        this.f632al = 0.0f;
        this.f633am = 1.0f;
        this.f634an = false;
        graphicsOGL.glDisable(2912);
        graphicsOGL.glFogfv(2918, this.f606M);
        graphicsOGL.glFogf(2915, this.f632al);
        graphicsOGL.glFogf(2916, this.f633am);
        graphicsOGL.glFogf(2914, 1.0f);
        graphicsOGL.glHint(3156, 4353);
    }

    /* JADX INFO: renamed from: a */
    final void m371a(GraphicsOGL graphicsOGL, int i) {
        if (this.f598E[i].f826a != null) {
            this.f598E[i].f826a = null;
            graphicsOGL.glDisableClientState(32888);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m372a(GraphicsOGL graphicsOGL, int i, Light light, Matrix4f matrix4f) {
        C0127z c0127z = this.f599F[i];
        int i2 = i + 16384;
        if (light == null && c0127z.f1056h) {
            c0127z.f1056h = false;
            graphicsOGL.glDisable(i2);
        }
        if (light != null) {
            if (light != null && !c0127z.f1056h) {
                c0127z.f1056h = true;
                graphicsOGL.glEnable(i2);
            }
            switch (light.f363c) {
                case 0:
                    if (c0127z.f1049a != light.f363c) {
                        c0127z.f1049a = light.f363c;
                        graphicsOGL.glLightfv(i2, 4608, light.f364d);
                        graphicsOGL.glLightfv(i2, 4609, f573c);
                        graphicsOGL.glLightfv(i2, 4610, f573c);
                        graphicsOGL.glLightf(i2, 4615, 1.0f);
                        graphicsOGL.glLightf(i2, 4616, 0.0f);
                        graphicsOGL.glLightf(i2, 4617, 0.0f);
                        graphicsOGL.glLightf(i2, 4613, 0.0f);
                        graphicsOGL.glLightf(i2, 4614, 180.0f);
                        Util3D.m301d(c0127z.f1050b, light.f364d);
                        c0127z.f1051c = 1.0f;
                        c0127z.f1052d = 0.0f;
                        c0127z.f1053e = 0.0f;
                        c0127z.f1055g = 0.0f;
                        c0127z.f1054f = 1.0f;
                    } else if (!Util3D.m292a(c0127z.f1050b, light.f364d)) {
                        Util3D.m301d(c0127z.f1050b, light.f364d);
                        graphicsOGL.glLightfv(i2, 4608, light.f364d);
                    }
                    break;
                case 1:
                    graphicsOGL.glMatrixMode(5888);
                    graphicsOGL.glLoadMatrixf(matrix4f.m);
                    graphicsOGL.glLightfv(i2, 4611, f576f);
                    if (c0127z.f1049a != light.f363c) {
                        c0127z.f1049a = light.f363c;
                        graphicsOGL.glLightfv(i2, 4608, f573c);
                        graphicsOGL.glLightfv(i2, 4609, light.f364d);
                        graphicsOGL.glLightfv(i2, 4610, light.f364d);
                        graphicsOGL.glLightf(i2, 4615, 1.0f);
                        graphicsOGL.glLightf(i2, 4616, 0.0f);
                        graphicsOGL.glLightf(i2, 4617, 0.0f);
                        graphicsOGL.glLightf(i2, 4613, 0.0f);
                        graphicsOGL.glLightf(i2, 4614, 180.0f);
                        Util3D.m301d(c0127z.f1050b, light.f364d);
                        c0127z.f1051c = 1.0f;
                        c0127z.f1052d = 0.0f;
                        c0127z.f1053e = 0.0f;
                        c0127z.f1055g = 0.0f;
                        c0127z.f1054f = 1.0f;
                    } else if (!Util3D.m292a(c0127z.f1050b, light.f364d)) {
                        Util3D.m301d(c0127z.f1050b, light.f364d);
                        graphicsOGL.glLightfv(i2, 4609, light.f364d);
                        graphicsOGL.glLightfv(i2, 4610, light.f364d);
                    }
                    break;
                case 2:
                case 3:
                    graphicsOGL.glMatrixMode(5888);
                    graphicsOGL.glLoadMatrixf(matrix4f.m);
                    graphicsOGL.glLightfv(i2, 4611, f575e);
                    if (light.f363c == 3) {
                        graphicsOGL.glLightfv(i2, 4612, f577g);
                    }
                    if (c0127z.f1049a == light.f363c) {
                        if (!Util3D.m292a(c0127z.f1050b, light.f364d)) {
                            Util3D.m301d(c0127z.f1050b, light.f364d);
                            graphicsOGL.glLightfv(i2, 4609, light.f364d);
                            graphicsOGL.glLightfv(i2, 4610, light.f364d);
                        }
                        if (c0127z.f1051c != light.f365e) {
                            c0127z.f1051c = light.f365e;
                            graphicsOGL.glLightf(i2, 4615, light.f365e);
                        }
                        if (c0127z.f1052d != light.f366f) {
                            c0127z.f1052d = light.f366f;
                            graphicsOGL.glLightf(i2, 4616, light.f366f);
                        }
                        if (c0127z.f1053e != light.f367g) {
                            c0127z.f1053e = light.f367g;
                            graphicsOGL.glLightf(i2, 4617, light.f367g);
                        }
                        if (c0127z.f1055g != light.f369q) {
                            c0127z.f1055g = light.f369q;
                            graphicsOGL.glLightf(i2, 4613, light.f369q);
                        }
                        if (c0127z.f1054f != light.f368p) {
                            c0127z.f1054f = light.f368p;
                            if (light.f363c != 2) {
                                graphicsOGL.glLightf(i2, 4614, light.f368p * 360.0f);
                            } else {
                                graphicsOGL.glLightf(i2, 4614, 180.0f);
                            }
                        }
                    } else {
                        c0127z.f1049a = light.f363c;
                        graphicsOGL.glLightfv(i2, 4608, f573c);
                        graphicsOGL.glLightfv(i2, 4609, light.f364d);
                        graphicsOGL.glLightfv(i2, 4610, light.f364d);
                        graphicsOGL.glLightf(i2, 4615, light.f365e);
                        graphicsOGL.glLightf(i2, 4616, light.f366f);
                        graphicsOGL.glLightf(i2, 4617, light.f367g);
                        graphicsOGL.glLightf(i2, 4613, light.f369q);
                        if (light.f363c == 2) {
                            graphicsOGL.glLightf(i2, 4614, 180.0f);
                        } else {
                            graphicsOGL.glLightf(i2, 4614, light.f368p * 360.0f);
                        }
                        Util3D.m301d(c0127z.f1050b, light.f364d);
                        c0127z.f1051c = light.f365e;
                        c0127z.f1052d = light.f366f;
                        c0127z.f1053e = light.f367g;
                        c0127z.f1055g = light.f369q;
                        c0127z.f1054f = light.f368p;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m373a(GraphicsOGL graphicsOGL, int i, C0036bh c0036bh) {
        C0077cv c0077cv = this.f598E[i];
        Texture texture = c0036bh.f713k;
        graphicsOGL.glBindTexture(3553, texture.f480r);
        if (c0077cv.f832g != texture.f486x) {
            graphicsOGL.glPixelStorei(3317, texture.f486x);
            c0077cv.f832g = texture.f486x;
        }
        if (c0036bh.f717o) {
            graphicsOGL.glTexParameterf(3553, 10240, c0036bh.f709g);
            graphicsOGL.glTexParameterf(3553, 10241, c0036bh.f708f);
            graphicsOGL.glTexParameterf(3553, 10242, f581k[c0036bh.f706d]);
            graphicsOGL.glTexParameterf(3553, 10243, f581k[c0036bh.f707e]);
            c0036bh.f717o = false;
        }
        if (c0036bh.f705c == 3) {
            if (c0077cv.f827b != 34160) {
                c0077cv.f827b = 34160;
                graphicsOGL.glTexEnvf(8960, 8704, 34160.0f);
                graphicsOGL.glTexEnvf(8960, 34161, 34478.0f);
                graphicsOGL.glTexEnvf(8960, 34176, 34167.0f);
                graphicsOGL.glTexEnvf(8960, 34192, 768.0f);
                graphicsOGL.glTexEnvf(8960, 34177, 5890.0f);
                graphicsOGL.glTexEnvf(8960, 34193, 768.0f);
                return;
            }
            return;
        }
        if (c0036bh.f710h == 1.0f) {
            if (c0036bh.f703a != c0077cv.f827b || c0077cv.f830e) {
                c0077cv.f827b = c0036bh.f703a;
                c0077cv.f830e = false;
                graphicsOGL.glTexEnvf(8960, 8704, f580j[c0036bh.f703a]);
            }
            if (Util3D.m292a(c0036bh.f704b, c0077cv.f828c)) {
                return;
            }
            Util3D.m299c(c0077cv.f828c, c0036bh.f704b);
            graphicsOGL.glTexEnvfv(8960, 8705, c0036bh.f704b);
            return;
        }
        if (c0036bh.f703a != c0077cv.f827b || !c0077cv.f830e) {
            c0077cv.f827b = c0036bh.f703a;
            switch (c0036bh.f703a) {
                case 0:
                    graphicsOGL.glTexEnvf(8960, 8704, 7681.0f);
                    break;
                case 1:
                    graphicsOGL.glTexEnvf(8960, 8704, 34160.0f);
                    graphicsOGL.glTexEnvf(8960, 34161, 260.0f);
                    graphicsOGL.glTexEnvf(8960, 34176, 5890.0f);
                    graphicsOGL.glTexEnvf(8960, 34192, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34177, 34168.0f);
                    graphicsOGL.glTexEnvf(8960, 34193, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34162, 8448.0f);
                    graphicsOGL.glTexEnvf(8960, 34184, 5890.0f);
                    graphicsOGL.glTexEnvf(8960, 34200, 770.0f);
                    graphicsOGL.glTexEnvf(8960, 34185, 34168.0f);
                    graphicsOGL.glTexEnvf(8960, 34201, 770.0f);
                    break;
                case 2:
                    Util3D.m299c(c0077cv.f828c, c0036bh.f704b);
                    graphicsOGL.glTexEnvfv(8960, 8705, c0036bh.f704b);
                    graphicsOGL.glTexEnvf(8960, 8704, 34160.0f);
                    graphicsOGL.glTexEnvf(8960, 34161, 34165.0f);
                    graphicsOGL.glTexEnvf(8960, 34176, 34166.0f);
                    graphicsOGL.glTexEnvf(8960, 34192, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34177, 34168.0f);
                    graphicsOGL.glTexEnvf(8960, 34193, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34178, 5890.0f);
                    graphicsOGL.glTexEnvf(8960, 34194, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34162, 8448.0f);
                    graphicsOGL.glTexEnvf(8960, 34184, 5890.0f);
                    graphicsOGL.glTexEnvf(8960, 34200, 770.0f);
                    graphicsOGL.glTexEnvf(8960, 34185, 34168.0f);
                    graphicsOGL.glTexEnvf(8960, 34201, 770.0f);
                    break;
                case 3:
                    graphicsOGL.glTexEnvf(8960, 8704, 34160.0f);
                    graphicsOGL.glTexEnvf(8960, 34161, 34165.0f);
                    graphicsOGL.glTexEnvf(8960, 34176, 5890.0f);
                    graphicsOGL.glTexEnvf(8960, 34192, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34177, 34168.0f);
                    graphicsOGL.glTexEnvf(8960, 34193, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34178, 5890.0f);
                    graphicsOGL.glTexEnvf(8960, 34194, 770.0f);
                    graphicsOGL.glTexEnvf(8960, 34162, 7681.0f);
                    graphicsOGL.glTexEnvf(8960, 34184, 34168.0f);
                    graphicsOGL.glTexEnvf(8960, 34200, 770.0f);
                    break;
                case 4:
                    graphicsOGL.glTexEnvf(8960, 8704, 34160.0f);
                    graphicsOGL.glTexEnvf(8960, 34161, 8448.0f);
                    graphicsOGL.glTexEnvf(8960, 34176, 5890.0f);
                    graphicsOGL.glTexEnvf(8960, 34192, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34177, 34168.0f);
                    graphicsOGL.glTexEnvf(8960, 34193, 768.0f);
                    graphicsOGL.glTexEnvf(8960, 34162, 8448.0f);
                    graphicsOGL.glTexEnvf(8960, 34184, 5890.0f);
                    graphicsOGL.glTexEnvf(8960, 34200, 770.0f);
                    graphicsOGL.glTexEnvf(8960, 34185, 34168.0f);
                    graphicsOGL.glTexEnvf(8960, 34201, 770.0f);
                    break;
            }
        }
        if (!Util3D.m292a(c0036bh.f704b, c0077cv.f828c)) {
            Util3D.m299c(c0077cv.f828c, c0036bh.f704b);
            graphicsOGL.glTexEnvfv(8960, 8705, c0036bh.f704b);
        }
        if (c0036bh.f710h != c0077cv.f829d) {
            c0077cv.f829d = c0036bh.f710h;
            graphicsOGL.glTexEnvf(8960, 34163, c0036bh.f710h);
        }
        c0077cv.f830e = true;
    }

    /* JADX INFO: renamed from: a */
    final void m374a(GraphicsOGL graphicsOGL, int i, float[] fArr) {
        int i2;
        boolean z = true;
        if ((i & 1) != 0) {
            i2 = Appearance.LIGHTTWOSIDE;
            if (!this.f623ac) {
                graphicsOGL.glDepthMask(true);
            }
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            i2 |= 16384;
            graphicsOGL.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        }
        if (this.f624ad && this.f625ae) {
            z = false;
        } else {
            graphicsOGL.glColorMask(true, true, true, true);
        }
        graphicsOGL.glClear(i2);
        if (!this.f623ac) {
            graphicsOGL.glDepthMask(false);
        }
        if (z) {
            boolean z2 = this.f624ad;
            graphicsOGL.glColorMask(z2, z2, z2, this.f625ae);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m375a(GraphicsOGL graphicsOGL, Matrix4f matrix4f, int i) {
        graphicsOGL.glMatrixMode(f579i[i + 2]);
        if (i != -1 || !this.f615V) {
            graphicsOGL.glLoadMatrixf(matrix4f.m);
        } else {
            Transform.m249a(f591u, matrix4f);
            graphicsOGL.glLoadMatrixf(f591u.m);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m376a(GraphicsOGL graphicsOGL, Camera camera) {
        if (camera == null) {
            if (this.f630aj != 0) {
                this.f630aj = 0;
                graphicsOGL.glDisable(2912);
            }
            return;
        }
        switch (camera.f178e) {
            case 0:
                if (this.f630aj != camera.f178e) {
                    this.f630aj = camera.f178e;
                    graphicsOGL.glDisable(2912);
                }
                break;
            case 1:
                if (this.f630aj != camera.f178e) {
                    this.f630aj = camera.f178e;
                    graphicsOGL.glEnable(2912);
                    graphicsOGL.glFogf(2917, 9729.0f);
                }
                if (this.f632al != camera.f181p) {
                    this.f632al = camera.f181p;
                    graphicsOGL.glFogf(2915, camera.f181p);
                }
                if (this.f633am != camera.f182q) {
                    this.f633am = camera.f182q;
                    graphicsOGL.glFogf(2916, camera.f182q);
                }
                if (!Util3D.m292a(camera.f179f, this.f606M)) {
                    Util3D.m301d(this.f606M, camera.f179f);
                    graphicsOGL.glFogfv(2918, this.f606M);
                }
                if (!camera.f183r) {
                    if (this.f634an) {
                        this.f634an = false;
                        graphicsOGL.glHint(3156, 4353);
                    }
                } else if (!this.f634an) {
                    this.f634an = true;
                    graphicsOGL.glHint(3156, 4354);
                }
                break;
            case 2:
                if (this.f630aj != camera.f178e) {
                    this.f630aj = camera.f178e;
                    graphicsOGL.glEnable(2912);
                    graphicsOGL.glFogf(2917, 2048.0f);
                }
                if (this.f631ak != camera.f180g) {
                    this.f631ak = camera.f180g;
                    graphicsOGL.glFogf(2914, camera.f180g);
                }
                if (!Util3D.m292a(camera.f179f, this.f606M)) {
                    Util3D.m301d(this.f606M, camera.f179f);
                    graphicsOGL.glFogfv(2918, this.f606M);
                }
                if (!camera.f183r) {
                    if (this.f634an) {
                        this.f634an = false;
                        graphicsOGL.glHint(3156, 4353);
                    }
                } else if (!this.f634an) {
                    this.f634an = true;
                    graphicsOGL.glHint(3156, 4354);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m377a(GraphicsOGL graphicsOGL, IndexBuffer indexBuffer) {
        int i = indexBuffer.f342g > 0 ? indexBuffer.f340e - 1 : indexBuffer.f340e;
        if (this.f628ah) {
            this.f628ah = false;
            graphicsOGL.glDisable(34880);
            graphicsOGL.glDisableClientState(34884);
        }
        if (indexBuffer.f317D != null) {
            this.f597D = indexBuffer.f317D;
            graphicsOGL.glBindBuffer(34963, indexBuffer.f317D.f921b);
            m359a(graphicsOGL, indexBuffer.f318E);
            this.f629ai = false;
            return;
        }
        if (this.f597D != null) {
            graphicsOGL.glBindBuffer(34963, 0);
            this.f597D = null;
        }
        if (indexBuffer.f314A != null) {
            DirectBuffer[] directBufferArr = indexBuffer.f314A;
            if (indexBuffer.f315B != null) {
                C0122u[] c0122uArr = indexBuffer.f316C;
                int i2 = 0;
                while (i2 < i) {
                    directBufferArr[i2].setSegment(c0122uArr[i2].f1033a, c0122uArr[i2].f1035c);
                    graphicsOGL.glDrawElements(f582l[indexBuffer.f336a], 5123, directBufferArr[i2]);
                    i2++;
                }
                if (indexBuffer.f342g > 0) {
                    directBufferArr[i2].setSegment(c0122uArr[i2].f1033a, c0122uArr[i2].f1035c);
                    graphicsOGL.glDrawElements(4, 5123, directBufferArr[i2]);
                }
            } else {
                int i3 = 0;
                while (i3 < i) {
                    graphicsOGL.glDrawElements(f582l[indexBuffer.f336a], 5123, directBufferArr[i3]);
                    i3++;
                }
                if (indexBuffer.f342g > 0) {
                    graphicsOGL.glDrawElements(4, 5123, directBufferArr[i3]);
                }
            }
        } else {
            int i4 = indexBuffer.f339d;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = indexBuffer.f344q[i5];
                graphicsOGL.glDrawArrays(f582l[indexBuffer.f336a], i4, i6);
                i4 += i6;
            }
        }
        this.f629ai = false;
    }

    /* JADX INFO: renamed from: a */
    final void m378a(GraphicsOGL graphicsOGL, RegionI regionI) {
        if (this.f637y.compare(regionI)) {
            return;
        }
        this.f637y.copy(regionI);
        graphicsOGL.glViewport(regionI.f460a, this.f636x - (regionI.f461b + regionI.f463d), regionI.f462c, regionI.f463d);
    }

    /* JADX INFO: renamed from: a */
    final void m379a(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer) {
        if (vertexBuffer.f551x == null) {
            if (this.f596C != null) {
                graphicsOGL.glBindBuffer(34962, 0);
                graphicsOGL.glDisableClientState(34477);
                this.f596C = null;
                this.f629ai = true;
            }
            if (this.f594A != vertexBuffer || this.f629ai) {
                this.f594A = vertexBuffer;
                FloatBuffer floatBuffer = vertexBuffer.f544q[0];
                graphicsOGL.glEnableClientState(32884);
                graphicsOGL.glVertexPointer(3, 5126, 0, floatBuffer);
                FloatBuffer floatBuffer2 = vertexBuffer.f544q[1];
                if (floatBuffer2 == null) {
                    graphicsOGL.glDisableClientState(32885);
                    return;
                }
                graphicsOGL.glEnableClientState(32885);
                if ((vertexBuffer.f537b & 2) != 0) {
                    graphicsOGL.glNormalPointer(5126, 0, floatBuffer2);
                    return;
                } else {
                    graphicsOGL.glNormalPointer(5122, 0, (ShortBuffer) floatBuffer2);
                    return;
                }
            }
            return;
        }
        if (this.f596C != vertexBuffer.f551x) {
            graphicsOGL.glBindBuffer(34962, vertexBuffer.f551x.f921b);
            this.f596C = vertexBuffer.f551x;
            this.f629ai = true;
        }
        if (this.f594A != vertexBuffer || this.f629ai) {
            this.f594A = vertexBuffer;
            C0069cn[] c0069cnArr = vertexBuffer.f552y;
            graphicsOGL.glEnableClientState(32884);
            graphicsOGL.glVertexPointer(3, 5126, 0, c0069cnArr[0].f809e);
            if (c0069cnArr[1] != null) {
                graphicsOGL.glEnableClientState(32885);
                if ((vertexBuffer.f537b & 2) != 0) {
                    graphicsOGL.glNormalPointer(5126, 0, c0069cnArr[1].f809e);
                } else {
                    graphicsOGL.glNormalPointer(5122, 0, c0069cnArr[1].f809e);
                }
            } else {
                graphicsOGL.glDisableClientState(32885);
            }
            if (c0069cnArr[8] == null) {
                graphicsOGL.glDisableClientState(34477);
            } else {
                graphicsOGL.glEnableClientState(34477);
                graphicsOGL.glWeightPointerOES(vertexBuffer.f545r, 5126, 0, c0069cnArr[8].f809e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m380a(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, int i) {
        m381a(graphicsOGL, vertexBuffer, i, i + 5, false);
    }

    /* JADX INFO: renamed from: a */
    final void m381a(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, int i, int i2, boolean z) {
        C0077cv c0077cv = this.f598E[i];
        if (vertexBuffer.f551x == null) {
            DirectBuffer directBuffer = vertexBuffer != null ? vertexBuffer.f544q[i2] : null;
            if (this.f596C != null) {
                graphicsOGL.glBindBuffer(34962, 0);
                graphicsOGL.glDisableClientState(34477);
                this.f596C = null;
                this.f629ai = true;
            }
            if (directBuffer == null) {
                if (c0077cv.f826a != null || this.f629ai) {
                    c0077cv.f826a = null;
                    graphicsOGL.glDisableClientState(32888);
                    return;
                }
                return;
            }
            if (c0077cv.f826a == vertexBuffer && c0077cv.f833h == i2 && !this.f629ai) {
                return;
            }
            c0077cv.f826a = vertexBuffer;
            c0077cv.f833h = i2;
            graphicsOGL.glEnableClientState(32888);
            if (vertexBuffer.f530I[i2].f642b == 2 || z) {
                graphicsOGL.glTexCoordPointer(vertexBuffer.f530I[i2].f643c, 5122, 0, directBuffer);
                return;
            } else {
                graphicsOGL.glTexCoordPointer(vertexBuffer.f530I[i2].f643c, 5126, 0, directBuffer);
                return;
            }
        }
        C0069cn[] c0069cnArr = vertexBuffer.f552y;
        if (this.f596C != vertexBuffer.f551x) {
            graphicsOGL.glBindBuffer(34962, vertexBuffer.f551x.f921b);
            this.f596C = vertexBuffer.f551x;
            this.f629ai = true;
        }
        if (c0069cnArr[i2] == null) {
            if (c0077cv.f826a != null || this.f629ai) {
                c0077cv.f826a = null;
                graphicsOGL.glDisableClientState(32888);
                return;
            }
            return;
        }
        if (c0077cv.f826a == vertexBuffer && c0077cv.f833h == i2 && !this.f629ai) {
            return;
        }
        c0077cv.f826a = vertexBuffer;
        c0077cv.f833h = i2;
        if (i2 >= 9) {
            graphicsOGL.glBindBuffer(34962, vertexBuffer.f553z.f921b);
            this.f596C = vertexBuffer.f553z;
            this.f629ai = true;
        }
        graphicsOGL.glEnableClientState(32888);
        if (vertexBuffer.f530I[i2].f642b == 2 || z) {
            graphicsOGL.glTexCoordPointer(vertexBuffer.f530I[i2].f643c, 5122, 0, c0069cnArr[i2].f809e);
        } else {
            graphicsOGL.glTexCoordPointer(vertexBuffer.f530I[i2].f643c, 5126, 0, c0069cnArr[i2].f809e);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m382a(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, int i, boolean z) {
        if (vertexBuffer == null || vertexBuffer.f551x == null) {
            ByteBuffer byteBuffer = (ByteBuffer) (vertexBuffer != null ? vertexBuffer.f544q[i] : null);
            if (this.f596C != null) {
                graphicsOGL.glBindBuffer(34962, 0);
                graphicsOGL.glDisableClientState(34477);
                this.f596C = null;
                this.f629ai = true;
            }
            if (byteBuffer == null || !z) {
                if (this.f595B != null || this.f629ai) {
                    this.f595B = null;
                    graphicsOGL.glDisableClientState(32886);
                    return;
                }
                return;
            }
            if (this.f595B != vertexBuffer || this.f629ai) {
                this.f595B = vertexBuffer;
                graphicsOGL.glEnableClientState(32886);
                graphicsOGL.glColorPointer(4, 5121, 0, byteBuffer);
                return;
            }
            return;
        }
        C0069cn[] c0069cnArr = vertexBuffer.f552y;
        if (this.f596C != vertexBuffer.f551x) {
            graphicsOGL.glBindBuffer(34962, vertexBuffer.f551x.f921b);
            this.f596C = vertexBuffer.f551x;
            this.f629ai = true;
        }
        if (c0069cnArr[i] == null || !z) {
            if (this.f595B != null || this.f629ai) {
                this.f595B = null;
                graphicsOGL.glDisableClientState(32886);
                return;
            }
            return;
        }
        if (this.f595B != vertexBuffer || this.f629ai) {
            this.f595B = vertexBuffer;
            if (i != 4) {
                graphicsOGL.glBindBuffer(34962, vertexBuffer.f553z.f921b);
                this.f596C = vertexBuffer.f553z;
                this.f629ai = true;
            }
            graphicsOGL.glEnableClientState(32886);
            graphicsOGL.glColorPointer(4, 5121, 0, c0069cnArr[i].f809e);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m383a(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, int i, float[] fArr) {
        C0077cv c0077cv = this.f598E[i];
        if (this.f596C != null) {
            graphicsOGL.glBindBuffer(34962, 0);
            graphicsOGL.glDisableClientState(34477);
            this.f596C = null;
        }
        if (fArr == null) {
            if (c0077cv.f826a != null) {
                c0077cv.f826a = null;
                graphicsOGL.glDisableClientState(32888);
                return;
            }
            return;
        }
        f593w.put(0, fArr, 0, 8);
        if (c0077cv.f826a != vertexBuffer) {
            c0077cv.f826a = vertexBuffer;
            graphicsOGL.glEnableClientState(32888);
            graphicsOGL.glTexCoordPointer(2, 5126, 0, f593w);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m384a(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, short[] sArr) {
        if (this.f628ah) {
            this.f628ah = false;
            graphicsOGL.glDisable(34880);
            graphicsOGL.glDisableClientState(34884);
        }
        f592v.put(0, sArr, 0, 8);
        if (this.f597D != null) {
            graphicsOGL.glBindBuffer(34963, 0);
            this.f597D = null;
        }
        if (this.f594A != vertexBuffer) {
            this.f594A = vertexBuffer;
            graphicsOGL.glEnableClientState(32884);
            graphicsOGL.glVertexPointer(2, 5122, 0, f592v);
            graphicsOGL.glDisableClientState(32885);
        }
        graphicsOGL.glDrawArrays(5, 0, 4);
        this.f629ai = false;
    }

    /* JADX INFO: renamed from: a */
    final void m385a(GraphicsOGL graphicsOGL, C0051bw c0051bw) {
        int i = c0051bw.f749a;
        if (c0051bw.f760l) {
            if (!this.f619Z) {
                this.f619Z = true;
                graphicsOGL.glEnable(3042);
            }
            if (this.f609P != c0051bw.f755g || this.f610Q != c0051bw.f756h) {
                this.f609P = c0051bw.f755g;
                this.f610Q = c0051bw.f756h;
                graphicsOGL.glBlendFunc(c0051bw.f755g, c0051bw.f756h);
            }
        } else if (this.f619Z) {
            this.f619Z = false;
            this.f609P = c0051bw.f755g;
            this.f610Q = c0051bw.f756h;
            graphicsOGL.glDisable(3042);
        }
        if (c0051bw.f750b > 0.0f) {
            if (!this.f621aa) {
                this.f621aa = true;
                graphicsOGL.glEnable(3008);
            }
            if (this.f608O != c0051bw.f750b) {
                this.f608O = c0051bw.f750b;
                graphicsOGL.glAlphaFunc(518, c0051bw.f750b);
            }
        } else if (this.f621aa) {
            this.f621aa = false;
            graphicsOGL.glDisable(3008);
        }
        if (Appearance.m16e(i)) {
            if (!this.f622ab) {
                this.f622ab = true;
                graphicsOGL.glEnable(2929);
            }
        } else if (this.f622ab) {
            this.f622ab = false;
            graphicsOGL.glDisable(2929);
        }
        if (Appearance.m17f(i)) {
            if (!this.f623ac) {
                this.f623ac = true;
                graphicsOGL.glDepthMask(true);
            }
        } else if (this.f623ac) {
            this.f623ac = false;
            graphicsOGL.glDepthMask(false);
        }
        boolean zM14d = Appearance.m14d(i);
        boolean zM12c = Appearance.m12c(i);
        if (this.f624ad != zM14d || this.f625ae != zM12c) {
            this.f624ad = zM14d;
            this.f625ae = zM12c;
            graphicsOGL.glColorMask(zM14d, zM14d, zM14d, zM12c);
        }
        if (Appearance.m18g(i)) {
            if (!this.f626af) {
                this.f626af = true;
                graphicsOGL.glHint(3152, 4354);
            }
        } else if (this.f626af) {
            this.f626af = false;
            graphicsOGL.glHint(3152, 4353);
        }
        if (Appearance.m19h(i)) {
            if (!this.f627ag) {
                this.f627ag = true;
                graphicsOGL.glEnable(32823);
            }
            if (this.f613T != c0051bw.f751c || this.f614U != c0051bw.f752d) {
                this.f613T = c0051bw.f751c;
                this.f614U = c0051bw.f752d;
                graphicsOGL.glPolygonOffset(c0051bw.f751c, c0051bw.f752d);
            }
        } else if (this.f627ag) {
            this.f627ag = false;
            graphicsOGL.glDisable(32823);
        }
        if (Appearance.m20i(i)) {
            if (!this.f617X) {
                this.f617X = true;
                graphicsOGL.glLightModelf(2898, 1.0f);
            }
        } else if (this.f617X) {
            this.f617X = false;
            graphicsOGL.glLightModelf(2898, 0.0f);
        }
        if (this.f611R != c0051bw.f757i) {
            this.f611R = c0051bw.f757i;
            int i2 = f588r[c0051bw.f757i];
            if (i2 != -1) {
                graphicsOGL.glEnable(2884);
                graphicsOGL.glCullFace(i2);
            } else {
                graphicsOGL.glDisable(2884);
            }
        }
        if (this.f612S != c0051bw.f758j) {
            this.f612S = c0051bw.f758j;
            graphicsOGL.glShadeModel(f578h[c0051bw.f758j]);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m386a(GraphicsOGL graphicsOGL, C0086dd c0086dd, VertexBuffer vertexBuffer) {
        boolean z;
        boolean z2;
        if (!c0086dd.f857f || (vertexBuffer.f536a & 2) == 0) {
            if (this.f616W) {
                this.f616W = false;
                graphicsOGL.glDisable(2896);
                z = true;
            } else {
                z = false;
            }
            if (c0086dd.f858g && vertexBuffer.f544q[4] != null) {
                m358a(graphicsOGL, vertexBuffer, true);
                return;
            }
            if (z || !Util3D.m297b(c0086dd.f853b, this.f601H)) {
                Util3D.m301d(this.f601H, c0086dd.f853b);
                float[] fArr = c0086dd.f853b;
                graphicsOGL.glColor4f(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            m358a(graphicsOGL, vertexBuffer, false);
            return;
        }
        if (this.f616W) {
            z2 = false;
        } else {
            this.f616W = true;
            graphicsOGL.glEnable(2896);
            z2 = true;
        }
        if (!Util3D.m297b(this.f601H, f574d)) {
            Util3D.m301d(this.f601H, f574d);
            graphicsOGL.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (!c0086dd.f858g || vertexBuffer.f544q[4] == null) {
            if (this.f618Y) {
                this.f618Y = false;
                graphicsOGL.glDisable(2903);
            }
            m358a(graphicsOGL, vertexBuffer, false);
        } else {
            if (!this.f618Y) {
                this.f618Y = true;
                graphicsOGL.glEnable(2903);
            }
            m358a(graphicsOGL, vertexBuffer, true);
        }
        if (!Util3D.m297b(c0086dd.f852a, this.f602I)) {
            Util3D.m301d(this.f602I, c0086dd.f852a);
            graphicsOGL.glMaterialfv(1032, 4608, this.f602I);
        }
        if (z2 || !Util3D.m297b(c0086dd.f853b, this.f603J)) {
            Util3D.m301d(this.f603J, c0086dd.f853b);
            graphicsOGL.glMaterialfv(1032, 4609, this.f603J);
        }
        if (!Util3D.m297b(c0086dd.f854c, this.f604K)) {
            Util3D.m301d(this.f604K, c0086dd.f854c);
            graphicsOGL.glMaterialfv(1032, 5632, this.f604K);
        }
        if (!Util3D.m297b(c0086dd.f855d, this.f605L)) {
            Util3D.m301d(this.f605L, c0086dd.f855d);
            graphicsOGL.glMaterialfv(1032, 4610, this.f605L);
        }
        if (c0086dd.f856e != this.f607N) {
            this.f607N = c0086dd.f856e;
            graphicsOGL.glMaterialf(1032, 5633, c0086dd.f856e);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m387a(GraphicsOGL graphicsOGL, C0096dn c0096dn, BoneDeformer boneDeformer, Transform transform) {
        Transform[] transformArr = boneDeformer.f144d.f651a;
        float[] fArr = boneDeformer.f145e.f567e.f494b.m;
        if (!this.f628ah) {
            this.f628ah = true;
            graphicsOGL.glEnable(34880);
        }
        graphicsOGL.glEnableClientState(34884);
        graphicsOGL.glMatrixMode(34880);
        for (int i = 0; i < c0096dn.f893e; i++) {
            C0043bo c0043bo = c0096dn.f889a[i];
            short[] sArr = c0043bo.f734a;
            int length = sArr.length;
            if (transform == null) {
                for (int i2 = 0; i2 < length; i2++) {
                    graphicsOGL.glCurrentPaletteMatrixOES(i2);
                    short s = sArr[i2];
                    if (s < 0) {
                        graphicsOGL.glLoadMatrixf(fArr);
                    } else {
                        graphicsOGL.glLoadMatrixf(transformArr[s].f494b.m);
                    }
                }
            } else {
                for (int i3 = 0; i3 < length; i3++) {
                    graphicsOGL.glCurrentPaletteMatrixOES(i3);
                    short s2 = sArr[i3];
                    if (s2 < 0) {
                        graphicsOGL.glLoadMatrixf(fArr);
                    } else {
                        graphicsOGL.glLoadMatrixf(transformArr[s2].f494b.m);
                    }
                    graphicsOGL.glMultMatrixf(transform.f494b.m);
                }
            }
            graphicsOGL.glMatrixIndexPointerOES(c0043bo.f735b, 5121, 0, c0043bo.f736c.f809e);
            this.f597D = c0096dn.f892d;
            graphicsOGL.glBindBuffer(34963, c0096dn.f892d.f921b);
            m359a(graphicsOGL, c0043bo.f737d);
            this.f629ai = false;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m388a(GraphicsOGL graphicsOGL, C0104dv c0104dv) {
        graphicsOGL.glBindBuffer(f585o[c0104dv.f920a], c0104dv.f921b);
        this.f629ai = true;
        if (c0104dv.f920a == 0) {
            this.f596C = c0104dv;
        } else {
            this.f597D = c0104dv;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m389a(GraphicsOGL graphicsOGL, boolean z) {
        this.f615V = z;
        if (z) {
            f588r = f587q;
        } else {
            f588r = f586p;
        }
        this.f611R = 0;
        graphicsOGL.glCullFace(f588r[this.f611R]);
    }

    /* JADX INFO: renamed from: a */
    final void m390a(GraphicsOGL graphicsOGL, float[] fArr) {
        boolean z;
        if (this.f616W) {
            this.f616W = false;
            graphicsOGL.glDisable(2896);
            z = true;
        } else {
            z = false;
        }
        if (z || !Util3D.m297b(fArr, this.f601H)) {
            Util3D.m301d(this.f601H, fArr);
            graphicsOGL.glColor4f(fArr[0], fArr[1], fArr[2], fArr[3]);
        }
        m358a(graphicsOGL, (VertexBuffer) null, false);
    }

    /* JADX INFO: renamed from: b */
    final void m391b(GraphicsOGL graphicsOGL, int i) {
        if (this.f600G != i) {
            switch (i) {
                case 0:
                    graphicsOGL.glDisable(2977);
                    graphicsOGL.glDisable(32826);
                    break;
                case 1:
                    graphicsOGL.glDisable(2977);
                    graphicsOGL.glEnable(32826);
                    break;
                case 2:
                    graphicsOGL.glEnable(2977);
                    graphicsOGL.glDisable(32826);
                    break;
            }
            this.f600G = i;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m392b(GraphicsOGL graphicsOGL, RegionI regionI) {
        if (this.f638z.compare(regionI)) {
            return;
        }
        this.f638z.copy(regionI);
        graphicsOGL.glScissor(regionI.f460a, this.f636x - (regionI.f461b + regionI.f463d), regionI.f462c, regionI.f463d);
    }

    /* JADX INFO: renamed from: d */
    final void m393d(GraphicsOGL graphicsOGL, int i) {
        graphicsOGL.glClientActiveTexture(i + 33984);
        graphicsOGL.glActiveTexture(i + 33984);
        if (this.f598E[i].f831f) {
            return;
        }
        this.f598E[i].f831f = true;
        graphicsOGL.glEnable(3553);
    }

    /* JADX INFO: renamed from: e */
    final void m394e(GraphicsOGL graphicsOGL, int i) {
        graphicsOGL.glClientActiveTexture(i + 33984);
        graphicsOGL.glActiveTexture(i + 33984);
        if (this.f598E[i].f831f) {
            this.f598E[i].f831f = false;
            graphicsOGL.glDisable(3553);
        }
    }
}
