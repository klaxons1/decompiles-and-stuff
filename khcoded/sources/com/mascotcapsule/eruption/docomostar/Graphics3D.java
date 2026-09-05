package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.ogl.GraphicsOGL;
import com.docomostar.ui.ogl.math.Matrix4f;
import java.lang.reflect.Array;
import p000.GameCommon;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Graphics3D {
    public static final int CAMERA_SORT = 1;
    public static final int CLEAR_COLOR = 2;
    public static final int CLEAR_DEPTH = 1;
    public static final int FRUSTUM_CULLING = 2;
    public static final int FRUSTUM_CULLING_FIGURE_BS = 12;
    public static final int FRUSTUM_CULLING_INDEX_BUFFER_BS = 4;
    public static final int MAX_LIGHT = 8;
    public static final int SHOW_DEBUG_ALL_BS = Integer.MIN_VALUE;
    public static final int SHOW_DEBUG_BS = 1073741824;

    /* JADX INFO: renamed from: B */
    private int f287B;

    /* JADX INFO: renamed from: C */
    private int f288C;

    /* JADX INFO: renamed from: D */
    private RegionI f289D;

    /* JADX INFO: renamed from: E */
    private RegionI f290E;

    /* JADX INFO: renamed from: F */
    private Texture f291F;

    /* JADX INFO: renamed from: G */
    private RegionI f292G;

    /* JADX INFO: renamed from: H */
    private RegionI f293H;

    /* JADX INFO: renamed from: I */
    private Light[] f294I;

    /* JADX INFO: renamed from: J */
    private Transform[] f295J;

    /* JADX INFO: renamed from: K */
    private Camera f296K;

    /* JADX INFO: renamed from: L */
    private Transform f297L;

    /* JADX INFO: renamed from: N */
    private C0065cj f299N;

    /* JADX INFO: renamed from: P */
    private Appearance f301P;

    /* JADX INFO: renamed from: a */
    boolean f302a;

    /* JADX INFO: renamed from: b */
    boolean f303b;

    /* JADX INFO: renamed from: c */
    Transform f304c;

    /* JADX INFO: renamed from: d */
    Appearance f305d;

    /* JADX INFO: renamed from: g */
    C0108g f308g;

    /* JADX INFO: renamed from: h */
    C0009ah f309h;

    /* JADX INFO: renamed from: i */
    int f310i;

    /* JADX INFO: renamed from: j */
    boolean f311j;

    /* JADX INFO: renamed from: k */
    private static float[] f271k = new float[4];

    /* JADX INFO: renamed from: l */
    private static Transform f272l = new Transform();

    /* JADX INFO: renamed from: m */
    private static short[] f273m = new short[8];

    /* JADX INFO: renamed from: n */
    private static float[] f274n = new float[8];

    /* JADX INFO: renamed from: o */
    private static float[][] f275o = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 8);

    /* JADX INFO: renamed from: p */
    private static VertexBuffer f276p = new VertexBuffer((BufferPool) null, 1, 1);

    /* JADX INFO: renamed from: q */
    private static Transform f277q = new Transform();

    /* JADX INFO: renamed from: r */
    private static Transform f278r = new Transform();

    /* JADX INFO: renamed from: s */
    private static Vector3D f279s = new Vector3D();

    /* JADX INFO: renamed from: t */
    private static Vector3D f280t = new Vector3D();

    /* JADX INFO: renamed from: u */
    private static Vector3D f281u = new Vector3D();

    /* JADX INFO: renamed from: v */
    private static Vector3D f282v = new Vector3D();

    /* JADX INFO: renamed from: w */
    private static Vector3D f283w = new Vector3D();

    /* JADX INFO: renamed from: x */
    private static short[] f284x = new short[3];

    /* JADX INFO: renamed from: y */
    private static short[] f285y = new short[3];

    /* JADX INFO: renamed from: z */
    private static short[] f286z = new short[3];

    /* JADX INFO: renamed from: A */
    private static byte[] f270A = new byte[4];

    /* JADX INFO: renamed from: M */
    private Transform[] f298M = new Transform[2];

    /* JADX INFO: renamed from: e */
    VertexBuffer[] f306e = new VertexBuffer[5];

    /* JADX INFO: renamed from: f */
    IndexBuffer[][] f307f = (IndexBuffer[][]) Array.newInstance((Class<?>) IndexBuffer.class, 5, 3);

    /* JADX INFO: renamed from: O */
    private final C0091di f300O = new C0091di();

    static {
        f274n[0] = 0.0f;
        f274n[1] = 0.0f;
        f274n[2] = 0.0f;
        f274n[3] = 1.0f;
        f274n[4] = 1.0f;
        f274n[5] = 0.0f;
        f274n[6] = 1.0f;
        f274n[7] = 1.0f;
        float[] fArr = f277q.f494b.m;
        fArr[0] = 0.5f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = -0.5f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.5f;
        fArr[13] = 0.5f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        Transform transform = f277q;
        Transform transform2 = f277q;
        f277q.f497e = (byte) 2;
        transform2.f496d = (byte) 2;
        transform.f495c = (byte) 2;
        float[] fArr2 = f278r.f494b.m;
        fArr2[0] = 1.5258789E-5f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[5] = -1.5258789E-5f;
        fArr2[6] = 0.0f;
        fArr2[7] = 0.0f;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = 0.0f;
        fArr2[11] = 0.0f;
        fArr2[12] = 0.5f;
        fArr2[13] = 0.5f;
        fArr2[14] = 0.0f;
        fArr2[15] = 1.0f;
        Transform transform3 = f278r;
        Transform transform4 = f278r;
        f278r.f497e = (byte) 2;
        transform4.f496d = (byte) 2;
        transform3.f495c = (byte) 2;
    }

    public Graphics3D(GraphicsOGL graphicsOGL, int i, int i2) {
        m140a(graphicsOGL, i, i2, 128, 64);
    }

    /* JADX INFO: renamed from: a */
    static final int m136a(Transform transform) {
        if (transform.m274c()) {
            return 0;
        }
        return transform.m276d() ? 1 : 2;
    }

    /* JADX INFO: renamed from: a */
    private final C0065cj m137a(GraphicsOGL graphicsOGL, C0116o c0116o, int i, Transform transform, Transform transform2) {
        VertexBuffer vertexBuffer = c0116o.f976c;
        Vector3D vector3D = f279s;
        C0065cj c0065cjM339c = vertexBuffer.m339c(i + 9);
        C0065cj c0065cjM326a = c0065cjM339c == null ? vertexBuffer.m326a(this, graphicsOGL, i + 9) : c0065cjM339c;
        vector3D.f516a = transform.f494b.m[12];
        vector3D.f517b = transform.f494b.m[13];
        vector3D.f518c = transform.f494b.m[14];
        InterfaceC0023av interfaceC0023avM521a = C0126y.m521a(transform2, c0116o);
        this.f300O.m483a(c0116o.f978e);
        if (c0116o.f984k != null) {
            Vector3D vector3D2 = f280t;
            float[] fArrM346i = c0116o.f976c.m346i();
            float[] fArrM347j = c0116o.f976c.m347j();
            while (true) {
                short sM482a = this.f300O.m482a();
                if (sM482a == -1) {
                    break;
                }
                vector3D2.f516a = fArrM347j[sM482a * 3];
                vector3D2.f517b = fArrM347j[(sM482a * 3) + 1];
                vector3D2.f518c = fArrM347j[(sM482a * 3) + 2];
                if (interfaceC0023avM521a.mo351b()) {
                    vector3D2.normalize(vector3D2);
                }
                m145a(transform2, vector3D, fArrM346i, vector3D2, c0065cjM326a.m472e(), sM482a);
            }
        } else {
            C0065cj c0065cjM339c2 = vertexBuffer.m339c(0);
            C0065cj c0065cjM339c3 = vertexBuffer.m339c(1);
            if ((c0116o.f976c.f537b & 2) == 0) {
                short[] sArr = f284x;
                while (true) {
                    short sM482a2 = this.f300O.m482a();
                    if (sM482a2 == -1) {
                        break;
                    }
                    interfaceC0023avM521a.mo350a(sArr, c0065cjM339c3.m472e(), sM482a2);
                    float[] fArrM471d = c0065cjM339c2.m471d();
                    short[] sArrM472e = c0065cjM326a.m472e();
                    Vector3D vector3D3 = f280t;
                    Vector3D vector3D4 = f281u;
                    int i2 = sM482a2 << 1;
                    int i3 = sM482a2 * 3;
                    vector3D3.f516a = fArrM471d[i3];
                    vector3D3.f517b = fArrM471d[i3 + 1];
                    vector3D3.f518c = fArrM471d[i3 + 2];
                    transform2.transPosition(vector3D3);
                    vector3D3.f516a -= vector3D.f516a;
                    vector3D3.f517b -= vector3D.f517b;
                    vector3D3.f518c -= vector3D.f518c;
                    vector3D3.normalize(vector3D3);
                    vector3D4.f516a = sArr[0] * 3.0517578E-5f;
                    vector3D4.f517b = sArr[1] * 3.0517578E-5f;
                    vector3D4.f518c = sArr[2] * 3.0517578E-5f;
                    float fDot = vector3D3.dot(vector3D4) * 2.0f;
                    float f = vector3D3.f516a - (vector3D4.f516a * fDot);
                    float f2 = vector3D3.f517b - (vector3D4.f517b * fDot);
                    float length = 1.0f / Vector3D.length(f, f2, (vector3D3.f518c - (fDot * vector3D4.f518c)) + 1.0f);
                    sArrM472e[i2] = (short) (f * 32767.0f * length);
                    sArrM472e[i2 + 1] = (short) (length * 32767.0f * f2);
                }
            } else {
                Vector3D vector3D5 = f280t;
                while (true) {
                    short sM482a3 = this.f300O.m482a();
                    if (sM482a3 == -1) {
                        break;
                    }
                    interfaceC0023avM521a.mo349a(vector3D5, c0065cjM339c3.m471d(), sM482a3);
                    m145a(transform2, vector3D, c0065cjM339c2.m471d(), vector3D5, c0065cjM326a.m472e(), sM482a3);
                }
            }
        }
        f278r.m264a(this.f309h, graphicsOGL, i);
        return c0065cjM326a;
    }

    /* JADX INFO: renamed from: a */
    private final C0065cj m138a(GraphicsOGL graphicsOGL, C0116o c0116o, Transform transform, int i) {
        C0065cj c0065cjM339c = null;
        if (c0116o.f984k != null) {
            c0065cjM339c = c0116o.f976c.m339c(i + 9);
            if (c0065cjM339c == null) {
                c0116o.f976c.f542g[i + 9] = c0116o.f976c.f542g[0];
                c0065cjM339c = c0116o.f976c.m326a(this, graphicsOGL, i + 9);
            }
            short[] sArrM472e = c0065cjM339c.m472e();
            float[] fArrM347j = c0116o.f976c.m347j();
            InterfaceC0023av interfaceC0023avM521a = C0126y.m521a(transform, c0116o);
            this.f300O.m483a(c0116o.f978e);
            while (true) {
                short sM482a = this.f300O.m482a();
                if (sM482a == -1) {
                    break;
                }
                Vector3D vector3D = f279s;
                interfaceC0023avM521a.mo349a(vector3D, fArrM347j, sM482a);
                sArrM472e[sM482a << 1] = (short) (vector3D.f516a * 32767.0f);
                sArrM472e[(sM482a << 1) + 1] = (short) (vector3D.f517b * 32767.0f);
            }
            f278r.m264a(this.f309h, graphicsOGL, i + 0);
        } else {
            InterfaceC0023av interfaceC0023avM521a2 = C0126y.m521a(transform, c0116o);
            if (interfaceC0023avM521a2.mo351b()) {
                C0065cj c0065cjM339c2 = c0116o.f976c.m339c(1);
                c0065cjM339c = c0116o.f976c.m339c(i + 9);
                if (c0065cjM339c == null) {
                    c0116o.f976c.f542g[i + 9] = c0116o.f976c.f542g[0];
                    c0065cjM339c = c0116o.f976c.m326a(this, graphicsOGL, i + 9);
                }
                short[] sArrM472e2 = c0065cjM339c.m472e();
                this.f300O.m483a(c0116o.f978e);
                if ((c0116o.f976c.f537b & 2) == 0) {
                    short[] sArr = f284x;
                    while (true) {
                        short sM482a2 = this.f300O.m482a();
                        if (sM482a2 == -1) {
                            break;
                        }
                        interfaceC0023avM521a2.mo350a(sArr, c0065cjM339c2.m472e(), sM482a2);
                        sArrM472e2[sM482a2 << 1] = sArr[0];
                        sArrM472e2[(sM482a2 << 1) + 1] = sArr[1];
                    }
                } else {
                    Vector3D vector3D2 = f279s;
                    float[] fArrM471d = c0065cjM339c2.m471d();
                    while (true) {
                        short sM482a3 = this.f300O.m482a();
                        if (sM482a3 == -1) {
                            break;
                        }
                        interfaceC0023avM521a2.mo349a(vector3D2, fArrM471d, sM482a3);
                        sArrM472e2[sM482a3 << 1] = (short) (vector3D2.f516a * 32767.0f);
                        sArrM472e2[(sM482a3 << 1) + 1] = (short) (vector3D2.f517b * 32767.0f);
                    }
                }
                f278r.m264a(this.f309h, graphicsOGL, i + 0);
            } else {
                if ((c0116o.f976c.f537b & 2) == 0) {
                    f278r.m264a(this.f309h, graphicsOGL, i + 0);
                } else {
                    f277q.m264a(this.f309h, graphicsOGL, i + 0);
                }
                C0009ah.m362b(graphicsOGL, interfaceC0023avM521a2.mo348a().f494b.m);
            }
        }
        return c0065cjM339c;
    }

    /* JADX INFO: renamed from: a */
    private final void m139a(GraphicsOGL graphicsOGL) {
        for (int i = this.f309h.f620a; i < 8; i++) {
            this.f309h.m372a(graphicsOGL, i, (Light) null, (Matrix4f) null);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m140a(GraphicsOGL graphicsOGL, int i, int i2, int i3, int i4) {
        this.f287B = i;
        this.f288C = i2;
        this.f289D = new RegionI(0, 0, this.f287B, this.f288C);
        this.f290E = new RegionI(0, 0, this.f287B, this.f288C);
        this.f292G = new RegionI(0, 0, this.f287B, this.f288C);
        this.f293H = new RegionI(0, 0, this.f287B, this.f288C);
        this.f294I = new Light[8];
        this.f295J = new Transform[8];
        for (int i5 = 0; i5 < 8; i5++) {
            this.f295J[i5] = new Transform();
        }
        this.f296K = null;
        this.f297L = new Transform();
        this.f304c = new Transform();
        for (int i6 = 0; i6 < 2; i6++) {
            this.f298M[i6] = new Transform();
        }
        this.f305d = new Appearance();
        this.f308g = new C0108g(this, 128, 64);
        this.f309h = new C0009ah(graphicsOGL, this.f287B, this.f288C);
        this.f309h.m394e(graphicsOGL, 0);
        this.f309h.m394e(graphicsOGL, 1);
        for (int i7 = 0; i7 < 8; i7++) {
            this.f309h.m372a(graphicsOGL, i7, (Light) null, (Matrix4f) null);
        }
        this.f309h.f620a = 0;
        for (int i8 = 0; i8 < 5; i8++) {
            this.f306e[i8] = GeometricShape.m128b(i8);
        }
        for (int i9 = 0; i9 < 5; i9++) {
            for (int i10 = 0; i10 < 3; i10++) {
                this.f307f[i9][i10] = GeometricShape.m123a(i9, i10);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m141a(GraphicsOGL graphicsOGL, Transform transform) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            Light light = this.f294I[i2];
            if (light != null) {
                if (light.f363c != 0) {
                    light.f371s = i;
                    Transform.m251e(light.f370r, this.f295J[i2]);
                    f272l.m261a(transform, this.f295J[i2]);
                }
                this.f309h.m372a(graphicsOGL, i, light, f272l.f494b);
                i++;
            }
        }
        this.f309h.f620a = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m142a(GraphicsOGL graphicsOGL, Transform transform, Figure figure) {
        int i = this.f309h.f620a;
        int i2 = 0;
        int i3 = i;
        for (int i4 = i; i4 < 8; i4++) {
            while (i2 < figure.f236v) {
                Light light = figure.f234t[i2];
                Transform transform2 = figure.f235u[i2];
                i2++;
                if (light != null) {
                    if (light.f363c != 0) {
                        light.f371s = i3;
                        Transform.m251e(light.f370r, transform2);
                        f272l.m261a(transform, transform2);
                    }
                    this.f309h.m372a(graphicsOGL, i3, light, f272l.f494b);
                    i3++;
                    break;
                }
            }
        }
        this.f309h.f620a = i3;
        figure.f236v = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    private final void m143a(GraphicsOGL graphicsOGL, C0116o c0116o, int i) throws IllegalStateException {
        Camera camera = c0116o.f983j.f998d[i].f715m;
        Transform transform = f272l;
        if (camera == null) {
            throw new IllegalStateException();
        }
        if (c0116o.f978e.getIndexType() == 7) {
            throw new IllegalStateException();
        }
        if (c0116o.f984k != null) {
            C0065cj c0065cjM339c = c0116o.f976c.m339c(12);
            if (c0065cjM339c == null) {
                c0065cjM339c = c0116o.f976c.m326a(this, graphicsOGL, 12);
            }
            float[] fArrM346i = c0116o.f976c.m346i();
            float[] fArrM471d = c0065cjM339c.m471d();
            this.f300O.m483a(c0116o.f978e);
            while (true) {
                short sM482a = this.f300O.m482a();
                if (sM482a == -1) {
                    break;
                }
                fArrM471d[sM482a * 3] = fArrM346i[sM482a * 3];
                fArrM471d[(sM482a * 3) + 1] = fArrM346i[(sM482a * 3) + 1];
                fArrM471d[(sM482a * 3) + 2] = fArrM346i[(sM482a * 3) + 2];
            }
            this.f309h.m381a(graphicsOGL, c0116o.f976c, i, 12, false);
        } else {
            this.f309h.m381a(graphicsOGL, c0116o.f976c, i, 0, false);
        }
        if (camera.f404l == null) {
            transform.m261a(camera.f176c, this.f298M[i]);
        } else {
            transform.m261a(camera.f176c, camera.f177d);
        }
        transform.m259a(c0116o.f987n);
        f277q.m264a(this.f309h, graphicsOGL, i);
        C0009ah.m362b(graphicsOGL, transform.f494b.m);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    private final void m144a(GraphicsOGL graphicsOGL, C0116o c0116o, Light light) throws IllegalStateException {
        VertexBuffer vertexBuffer = c0116o.f976c;
        C0065cj c0065cjM339c = vertexBuffer.m339c(1);
        C0065cj c0065cjM339c2 = vertexBuffer.m339c(2);
        C0065cj c0065cjM339c3 = vertexBuffer.m339c(3);
        Vector3D vector3D = f279s;
        if (c0065cjM339c == null || c0065cjM339c2 == null) {
            throw new IllegalStateException();
        }
        InterfaceC0023av interfaceC0023avM521a = C0126y.m521a(c0116o.f987n, c0116o);
        C0065cj c0065cjM339c4 = vertexBuffer.m339c(11);
        if (c0065cjM339c4 == null) {
            c0065cjM339c4 = vertexBuffer.m326a(this, graphicsOGL, 11);
        }
        byte[] bArr = f270A;
        light.m175a(vector3D, (Vector3D) null);
        this.f300O.m483a(c0116o.f978e);
        if ((vertexBuffer.f537b & 2) != 0) {
            Vector3D vector3D2 = f280t;
            Vector3D vector3D3 = f281u;
            Vector3D vector3D4 = f282v;
            float[] fArrM471d = c0065cjM339c.m471d();
            float[] fArrM471d2 = c0065cjM339c2.m471d();
            float[] fArrM471d3 = c0065cjM339c3.m471d();
            while (true) {
                short sM482a = this.f300O.m482a();
                if (sM482a == -1) {
                    return;
                }
                interfaceC0023avM521a.mo349a(vector3D2, fArrM471d, sM482a);
                bArr[2] = (byte) ((vector3D2.dot(vector3D) + 1.0f) * 127.0f);
                interfaceC0023avM521a.mo349a(vector3D3, fArrM471d2, sM482a);
                bArr[1] = (byte) ((vector3D3.dot(vector3D) + 1.0f) * 127.0f);
                if (c0065cjM339c3 == null) {
                    vector3D4.cross(vector3D2, vector3D3);
                } else {
                    interfaceC0023avM521a.mo349a(vector3D4, fArrM471d3, sM482a);
                }
                bArr[0] = (byte) ((vector3D4.dot(vector3D) + 1.0f) * 127.0f);
                c0065cjM339c4.m459a((int) sM482a, bArr, 0, 1);
            }
        } else {
            short[] sArr = f284x;
            short[] sArr2 = f285y;
            short[] sArr3 = f286z;
            short[] sArrM472e = c0065cjM339c.m472e();
            short[] sArrM472e2 = c0065cjM339c2.m472e();
            short[] sArrM472e3 = c0065cjM339c3.m472e();
            while (true) {
                short sM482a2 = this.f300O.m482a();
                if (sM482a2 == -1) {
                    return;
                }
                interfaceC0023avM521a.mo350a(sArr, sArrM472e, sM482a2);
                int i = (((int) (((sArr[0] * vector3D.f516a) + (sArr[1] * vector3D.f517b)) + (sArr[2] * vector3D.f518c))) >> 8) + 127;
                if (i < 0) {
                    i = 0;
                }
                if (i > 255) {
                    i = 255;
                }
                bArr[2] = (byte) i;
                interfaceC0023avM521a.mo350a(sArr2, sArrM472e2, sM482a2);
                int i2 = (((int) (((sArr2[0] * vector3D.f516a) + (sArr2[1] * vector3D.f517b)) + (sArr2[2] * vector3D.f518c))) >> 8) + 127;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 > 255) {
                    i2 = 255;
                }
                bArr[1] = (byte) i2;
                if (c0065cjM339c3 == null) {
                    m146a(sArr3, sArr, sArr2);
                } else {
                    interfaceC0023avM521a.mo350a(sArr3, sArrM472e3, sM482a2);
                }
                int i3 = (((int) (((sArr3[0] * vector3D.f516a) + (sArr3[1] * vector3D.f517b)) + (sArr3[2] * vector3D.f518c))) >> 8) + 127;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 > 255) {
                    i3 = 255;
                }
                bArr[0] = (byte) i3;
                c0065cjM339c4.m459a((int) sM482a2, bArr, 0, 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m145a(Transform transform, Vector3D vector3D, float[] fArr, Vector3D vector3D2, short[] sArr, int i) {
        Vector3D vector3D3 = f281u;
        int i2 = i << 1;
        int i3 = i * 3;
        vector3D3.f516a = fArr[i3];
        vector3D3.f517b = fArr[i3 + 1];
        vector3D3.f518c = fArr[i3 + 2];
        transform.transPosition(vector3D3);
        vector3D3.f516a -= vector3D.f516a;
        vector3D3.f517b -= vector3D.f517b;
        vector3D3.f518c -= vector3D.f518c;
        vector3D3.normalize(vector3D3);
        float fDot = vector3D3.dot(vector3D2) * 2.0f;
        float f = vector3D3.f516a - (vector3D2.f516a * fDot);
        float f2 = vector3D3.f517b - (vector3D2.f517b * fDot);
        float length = 1.0f / Vector3D.length(f, f2, (vector3D3.f518c - (fDot * vector3D2.f518c)) + 1.0f);
        sArr[i2] = (short) (32767.0f * f * length);
        sArr[i2 + 1] = (short) (length * 32767.0f * f2);
    }

    /* JADX INFO: renamed from: a */
    private static void m146a(short[] sArr, short[] sArr2, short[] sArr3) {
        int i = (((sArr2[1] * sArr3[2]) - (sArr2[2] * sArr3[1])) + 16384) >> 15;
        int i2 = (((sArr2[2] * sArr3[0]) - (sArr2[0] * sArr3[2])) + 16384) >> 15;
        int i3 = (((sArr2[0] * sArr3[1]) - (sArr2[1] * sArr3[0])) + 16384) >> 15;
        sArr[0] = (short) i;
        sArr[1] = (short) i2;
        sArr[2] = (short) i3;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m147a() {
        for (int i = 0; i < 8; i++) {
            Light light = this.f294I[i];
            if (light != null && light.getLightType() != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: b */
    private final void m148b(GraphicsOGL graphicsOGL, C0116o c0116o, Light light) throws IllegalStateException {
        VertexBuffer vertexBuffer = c0116o.f976c;
        float[] fArrM471d = vertexBuffer.m339c(0).m471d();
        C0065cj c0065cjM339c = vertexBuffer.m339c(1);
        C0065cj c0065cjM339c2 = vertexBuffer.m339c(2);
        C0065cj c0065cjM339c3 = vertexBuffer.m339c(3);
        Vector3D vector3D = f279s;
        Vector3D vector3D2 = f280t;
        if (c0065cjM339c == null || c0065cjM339c2 == null) {
            throw new IllegalStateException();
        }
        InterfaceC0023av interfaceC0023avM521a = C0126y.m521a(c0116o.f987n, c0116o);
        C0065cj c0065cjM339c4 = vertexBuffer.m339c(11);
        if (c0065cjM339c4 == null) {
            c0065cjM339c4 = vertexBuffer.m326a(this, graphicsOGL, 11);
        }
        byte[] bArr = f270A;
        this.f300O.m483a(c0116o.f978e);
        if ((vertexBuffer.f537b & 2) != 0) {
            Vector3D vector3D3 = f281u;
            Vector3D vector3D4 = f282v;
            Vector3D vector3D5 = f283w;
            float[] fArrM471d2 = c0065cjM339c.m471d();
            float[] fArrM471d3 = c0065cjM339c2.m471d();
            float[] fArrM471d4 = c0065cjM339c3.m471d();
            while (true) {
                short sM482a = this.f300O.m482a();
                if (sM482a == -1) {
                    return;
                }
                vector3D2.f516a = fArrM471d[sM482a * 3];
                vector3D2.f517b = fArrM471d[(sM482a * 3) + 1];
                vector3D2.f518c = fArrM471d[(sM482a * 3) + 2];
                light.m175a(vector3D, vector3D2);
                interfaceC0023avM521a.mo349a(vector3D3, fArrM471d2, sM482a);
                bArr[2] = (byte) ((((double) vector3D3.dot(vector3D)) + 1.0d) * 127.0d);
                interfaceC0023avM521a.mo349a(vector3D4, fArrM471d3, sM482a);
                bArr[1] = (byte) ((((double) vector3D4.dot(vector3D)) + 1.0d) * 127.0d);
                if (c0065cjM339c3 == null) {
                    vector3D5.cross(vector3D3, vector3D4);
                } else {
                    interfaceC0023avM521a.mo349a(vector3D5, fArrM471d4, sM482a);
                }
                bArr[0] = (byte) ((((double) vector3D5.dot(vector3D)) + 1.0d) * 127.0d);
                c0065cjM339c4.m459a((int) sM482a, bArr, 0, 1);
            }
        } else {
            short[] sArr = f284x;
            short[] sArr2 = f285y;
            short[] sArr3 = f286z;
            short[] sArrM472e = c0065cjM339c.m472e();
            short[] sArrM472e2 = c0065cjM339c2.m472e();
            short[] sArrM472e3 = c0065cjM339c3.m472e();
            while (true) {
                short sM482a2 = this.f300O.m482a();
                if (sM482a2 == -1) {
                    return;
                }
                vector3D2.f516a = fArrM471d[sM482a2 * 3];
                vector3D2.f517b = fArrM471d[(sM482a2 * 3) + 1];
                vector3D2.f518c = fArrM471d[(sM482a2 * 3) + 2];
                light.m175a(vector3D, vector3D2);
                interfaceC0023avM521a.mo350a(sArr, sArrM472e, sM482a2);
                int i = (((int) (((sArr[0] * vector3D.f516a) + (sArr[1] * vector3D.f517b)) + (sArr[2] * vector3D.f518c))) >> 8) + 127;
                if (i < 0) {
                    i = 0;
                }
                if (i > 255) {
                    i = 255;
                }
                bArr[2] = (byte) i;
                interfaceC0023avM521a.mo350a(sArr2, sArrM472e2, sM482a2);
                int i2 = (((int) (((sArr2[0] * vector3D.f516a) + (sArr2[1] * vector3D.f517b)) + (sArr2[2] * vector3D.f518c))) >> 8) + 127;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 > 255) {
                    i2 = 255;
                }
                bArr[1] = (byte) i2;
                if (c0065cjM339c3 == null) {
                    m146a(sArr3, sArr, sArr2);
                } else {
                    interfaceC0023avM521a.mo350a(sArr3, sArrM472e3, sM482a2);
                }
                int i3 = (((int) (((sArr3[0] * vector3D.f516a) + (sArr3[1] * vector3D.f517b)) + (sArr3[2] * vector3D.f518c))) >> 8) + 127;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 > 255) {
                    i3 = 255;
                }
                bArr[0] = (byte) i3;
                c0065cjM339c4.m459a((int) sM482a2, bArr, 0, 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m149a(GraphicsOGL graphicsOGL, IndexBuffer indexBuffer) {
        indexBuffer.m162a(this, graphicsOGL);
        indexBuffer.f345r = null;
        indexBuffer.f346s = null;
    }

    /* JADX INFO: renamed from: a */
    final void m150a(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, BoneDeformer boneDeformer, boolean z) {
        if (z) {
            vertexBuffer.m335a(this, graphicsOGL, boneDeformer);
        } else {
            vertexBuffer.m334a(this, graphicsOGL);
        }
        for (int i = 0; i < 8; i++) {
            vertexBuffer.f541f[i] = null;
            vertexBuffer.f543p[i] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m151a(GraphicsOGL graphicsOGL, C0116o c0116o) {
        int iM136a;
        C0009ah c0009ah;
        VertexBuffer vertexBuffer;
        int i;
        boolean z;
        C0009ah c0009ah2;
        VertexBuffer vertexBuffer2;
        int i2;
        boolean z2;
        C0009ah c0009ah3 = this.f309h;
        VertexBuffer vertexBuffer3 = c0116o.f976c;
        IndexBuffer indexBuffer = c0116o.f978e;
        C0117p c0117p = c0116o.f983j;
        boolean z3 = indexBuffer.f336a == 7;
        this.f299N = null;
        if (vertexBuffer3.f549v != null) {
            vertexBuffer3.f549v.m70a(vertexBuffer3.f550w);
        }
        c0117p.f995a.f111f = false;
        c0117p.f995a.f112g = false;
        for (int i3 = 0; i3 < 2; i3++) {
            c0117p.f995a.f113p[i3] = false;
            c0117p.f995a.f110e[i3].f717o = false;
        }
        if (Appearance.m21j(c0116o.f983j.f997c.f749a)) {
            if (this.f301P == null) {
                this.f301P = new Appearance();
                this.f301P.setCullingMode(1);
                this.f301P.setPolygonOffset(1.0f, 1.0f);
                this.f301P.setProperties(this.f301P.getProperties() | 128);
            }
            Transform transform = f272l;
            float f = 1.0f + c0116o.f983j.f997c.f753e;
            transform.setScale(f, f, f);
            this.f301P.setColor(1, c0116o.f983j.f997c.f754f & GameCommon.K_ANY);
            int i4 = c0116o.f976c.f536a;
            int i5 = c0116o.f976c.f537b;
            c0116o.f976c.f536a = 1;
            c0116o.f976c.f537b = 1;
            for (int i6 = 0; i6 < 2; i6++) {
                this.f309h.m394e(graphicsOGL, i6);
                this.f309h.m371a(graphicsOGL, i6);
            }
            this.f309h.m379a(graphicsOGL, c0116o.f976c);
            this.f309h.m386a(graphicsOGL, this.f301P.f108c, c0116o.f976c);
            this.f309h.m385a(graphicsOGL, this.f301P.f109d);
            if (c0116o.f984k != null) {
                c0116o.f978e.m162a(this, graphicsOGL);
                c0116o.f976c.m335a(this, graphicsOGL, c0116o.f979f);
                this.f309h.m387a(graphicsOGL, c0116o.f984k, c0116o.f979f, transform);
            } else {
                C0009ah.m366f(graphicsOGL, -2);
                C0009ah.m362b(graphicsOGL, transform.f494b.m);
                try {
                    c0116o.f978e.m162a(this, graphicsOGL);
                    c0116o.f976c.m334a(this, graphicsOGL);
                    this.f309h.m377a(graphicsOGL, c0116o.f978e);
                    C0009ah.m367g(graphicsOGL, -2);
                } catch (Throwable th) {
                    C0009ah.m367g(graphicsOGL, -2);
                    throw th;
                }
            }
            c0116o.f976c.f536a = i4;
            c0116o.f976c.f537b = i5;
        }
        if (c0116o.f989p) {
            iM136a = m136a(c0116o.f988o);
            if (vertexBuffer3.f527F) {
                iM136a = 2;
            }
        } else {
            iM136a = 0;
        }
        c0009ah3.m391b(graphicsOGL, iM136a);
        c0009ah3.m379a(graphicsOGL, vertexBuffer3);
        for (int i7 = 0; i7 < 2; i7++) {
            C0036bh c0036bh = c0117p.f998d[i7];
            if (c0036bh.f713k != null && (!z3 || i7 <= 0)) {
                c0009ah3.m393d(graphicsOGL, i7);
                Texture texture = c0036bh.f713k;
                if (texture.f484v != null && this.f291F == texture) {
                    throw new IllegalStateException();
                }
                texture.m246a(graphicsOGL, this.f309h);
                this.f309h.m373a(graphicsOGL, i7, c0036bh);
                switch (c0036bh.f705c) {
                    case 0:
                        this.f309h.m380a(graphicsOGL, c0116o.f976c, i7);
                        f272l.m261a(c0036bh.f712j.f960a, c0116o.f976c.m341d(i7));
                        f272l.m264a(this.f309h, graphicsOGL, i7);
                        break;
                    case 1:
                        if (c0116o.f976c.m339c(1) == null) {
                            throw new IllegalStateException();
                        }
                        if (c0036bh.f716n) {
                            if (this.f299N == null) {
                                Transform transform2 = f272l;
                                transform2.setInvert(c0116o.f988o);
                                transform2.multiply(c0116o.f987n, transform2);
                                this.f299N = m137a(graphicsOGL, c0116o, i7, transform2, c0116o.f987n);
                            }
                            c0009ah2 = this.f309h;
                            vertexBuffer2 = c0116o.f976c;
                            i2 = i7 + 9;
                            z2 = true;
                        } else {
                            if (this.f299N == null) {
                                this.f299N = m138a(graphicsOGL, c0116o, c0116o.f988o, i7);
                            }
                            if (this.f299N != null) {
                                c0009ah2 = this.f309h;
                                vertexBuffer2 = c0116o.f976c;
                                i2 = i7 + 9;
                                z2 = true;
                            } else {
                                c0009ah2 = this.f309h;
                                vertexBuffer2 = c0116o.f976c;
                                i2 = 1;
                                z2 = (c0116o.f976c.f537b & 2) == 0;
                            }
                        }
                        c0009ah2.m381a(graphicsOGL, vertexBuffer2, i7, i2, z2);
                        break;
                        break;
                    case 2:
                        Light light = c0116o.f983j.f998d[i7].f714l;
                        if (light == null || light.f371s < 0) {
                            throw new IllegalStateException();
                        }
                        if (c0116o.f976c.m339c(1) == null) {
                            throw new IllegalStateException();
                        }
                        if (light.getLightType() == 2) {
                            Transform transform3 = f272l;
                            transform3.setInvert(c0116o.f987n);
                            transform3.multiply(c0116o.f988o, transform3);
                            transform3.multiply(light.f370r);
                            m137a(graphicsOGL, c0116o, i7, transform3, c0116o.f988o);
                            c0009ah = this.f309h;
                            vertexBuffer = c0116o.f976c;
                            i = i7 + 9;
                            z = true;
                        } else {
                            Transform transform4 = f272l;
                            transform4.setInvert(light.f370r);
                            transform4.multiply(c0116o.f987n);
                            float[] fArr = transform4.f494b.m;
                            float[] fArr2 = transform4.f494b.m;
                            transform4.f494b.m[14] = 0.0f;
                            fArr2[13] = 0.0f;
                            fArr[12] = 0.0f;
                            if (m138a(graphicsOGL, c0116o, transform4, i7) != null) {
                                c0009ah = this.f309h;
                                vertexBuffer = c0116o.f976c;
                                i = i7 + 9;
                                z = true;
                            } else {
                                c0009ah = this.f309h;
                                vertexBuffer = c0116o.f976c;
                                i = 1;
                                z = (c0116o.f976c.f537b & 2) == 0;
                            }
                        }
                        c0009ah.m381a(graphicsOGL, vertexBuffer, i7, i, z);
                        break;
                        break;
                    case 3:
                        Light light2 = c0116o.f983j.f998d[i7].f714l;
                        if (light2 == null || light2.f371s < 0) {
                            throw new IllegalStateException();
                        }
                        if (light2.getLightType() == 1) {
                            m144a(graphicsOGL, c0116o, light2);
                        } else {
                            m148b(graphicsOGL, c0116o, light2);
                        }
                        this.f309h.m380a(graphicsOGL, c0116o.f976c, i7);
                        f272l.m261a(c0036bh.f712j.f960a, c0116o.f976c.m341d(i7));
                        f272l.m264a(this.f309h, graphicsOGL, i7);
                        break;
                        break;
                    case 4:
                        m143a(graphicsOGL, c0116o, i7);
                        break;
                }
            } else {
                c0009ah3.m394e(graphicsOGL, i7);
                c0009ah3.m371a(graphicsOGL, i7);
            }
        }
        if (c0117p.f995a.m29d()) {
            c0009ah3.m382a(graphicsOGL, vertexBuffer3, 11, true);
        } else {
            c0009ah3.m386a(graphicsOGL, c0117p.f996b, vertexBuffer3);
        }
        c0009ah3.m385a(graphicsOGL, c0117p.f997c);
        if (c0116o.f984k != null) {
            indexBuffer.m162a(this, graphicsOGL);
            vertexBuffer3.m335a(this, graphicsOGL, c0116o.f979f);
            c0009ah3.m387a(graphicsOGL, c0116o.f984k, c0116o.f979f, (Transform) null);
        } else {
            indexBuffer.m162a(this, graphicsOGL);
            vertexBuffer3.m334a(this, graphicsOGL);
            c0009ah3.m377a(graphicsOGL, c0116o.f978e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void addDrawQueueBatch(GraphicsOGL graphicsOGL, Batch batch) throws IllegalStateException {
        if (batch == null) {
            throw new NullPointerException();
        }
        if (batch.f128e) {
            throw new IllegalStateException();
        }
        if (this.f296K == null) {
            throw new IllegalStateException();
        }
        if (batch.f403k > 0) {
            throw new IllegalStateException();
        }
        try {
            VertexBuffer vertexBuffer = batch.f125b;
            IndexBuffer indexBuffer = batch.f126c;
            if (indexBuffer.f325L != vertexBuffer) {
                if (!indexBuffer.m167a(vertexBuffer)) {
                    throw new IllegalArgumentException();
                }
                indexBuffer.f325L = vertexBuffer;
            }
            this.f308g.m510a(batch, 0, this.f302a && vertexBuffer.f541f[1] != null);
            m141a(graphicsOGL, this.f297L);
            m139a(graphicsOGL);
            this.f309h.m376a(graphicsOGL, this.f296K);
            this.f308g.f939a.addElement(batch);
            batch.f403k++;
            this.f303b = true;
        } catch (Error e) {
            this.f308g.m515b();
            throw e;
        } catch (RuntimeException e2) {
            this.f308g.m515b();
            throw e2;
        }
    }

    public final void addDrawQueueEffectSource(GraphicsOGL graphicsOGL, EffectSource effectSource, Transform transform) {
        if (effectSource == null) {
            throw new NullPointerException();
        }
        try {
            effectSource.m103b(graphicsOGL, this, transform, 1);
            this.f303b = true;
        } catch (Error e) {
            this.f308g.m515b();
            throw e;
        } catch (RuntimeException e2) {
            this.f308g.m515b();
            throw e2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void addDrawQueueFigure(GraphicsOGL graphicsOGL, Figure figure, Transform transform) throws IllegalStateException {
        if (figure == null) {
            throw new NullPointerException();
        }
        if (figure.f239y) {
            throw new IllegalStateException();
        }
        try {
            int i = figure.f403k;
            boolean zIsVisible = figure.f231q != null ? figure.f231q.isVisible() : false;
            figure.f236v = 0;
            if (zIsVisible) {
                figure.m113a(figure, (TransformTree) null, this.f304c, 1);
                figure.m112a(figure, this, null, this.f304c, true, i, 1);
                figure.f231q.f176c.m264a(this.f309h, graphicsOGL, -1);
                m141a(graphicsOGL, figure.f232r);
                m142a(graphicsOGL, figure.f232r, figure);
                m139a(graphicsOGL);
                this.f309h.m376a(graphicsOGL, figure.f231q);
                this.f308g.f940b = figure.f231q;
                this.f308g.f941c = figure.f232r;
            } else {
                if (this.f296K == null) {
                    throw new IllegalStateException();
                }
                if (transform != null) {
                    figure.m113a(figure, (TransformTree) null, transform, 1);
                    figure.m112a(figure, this, null, transform, true, i, 1);
                } else {
                    figure.m113a(figure, (TransformTree) null, this.f304c, 1);
                    figure.m112a(figure, this, null, this.f304c, true, i, 1);
                }
                m141a(graphicsOGL, this.f297L);
                m142a(graphicsOGL, this.f297L, figure);
                m139a(graphicsOGL);
                this.f309h.m376a(graphicsOGL, this.f296K);
            }
            this.f308g.f939a.addElement(figure);
            figure.f403k++;
            this.f303b = true;
        } catch (Error e) {
            this.f308g.m515b();
            throw e;
        } catch (RuntimeException e2) {
            this.f308g.m515b();
            throw e2;
        }
    }

    public final void addDrawQueueVertexBuffer(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Transform transform) {
        if (vertexBuffer == null || indexBuffer == null) {
            throw new NullPointerException();
        }
        if (this.f296K == null) {
            throw new IllegalStateException();
        }
        if (indexBuffer.f325L != vertexBuffer) {
            if (!indexBuffer.m167a(vertexBuffer)) {
                throw new IllegalArgumentException();
            }
            indexBuffer.f325L = vertexBuffer;
        }
        if (indexBuffer.f352y == null || Appearance.m22k(indexBuffer.f352y.f109d.f749a)) {
            f272l.setIdentity();
            try {
                if (indexBuffer.getIndexType() == 7 && !VertexBuffer.m309h(vertexBuffer.f537b)) {
                    vertexBuffer.m327a();
                }
                this.f308g.m513a(vertexBuffer, indexBuffer, transform != null ? transform : f272l, vertexBuffer.f403k, this.f302a, indexBuffer.f336a == 7, false);
                GeometricShape geometricShape = indexBuffer.f349v;
                if (geometricShape != null && ((this.f310i & SHOW_DEBUG_ALL_BS) != 0 || ((this.f310i & SHOW_DEBUG_BS) != 0 && geometricShape.f258b))) {
                    C0108g c0108g = this.f308g;
                    VertexBuffer vertexBuffer2 = this.f306e[geometricShape.f257a];
                    IndexBuffer indexBuffer2 = this.f307f[geometricShape.f257a][0];
                    if (transform == null) {
                        transform = f272l;
                    }
                    c0108g.m513a(vertexBuffer2, indexBuffer2, geometricShape.m130a(transform, 0), 0, false, false, true);
                }
                this.f308g.f939a.addElement(vertexBuffer);
                vertexBuffer.f403k++;
                this.f308g.f939a.addElement(indexBuffer);
                indexBuffer.f403k++;
                this.f303b = true;
                m141a(graphicsOGL, this.f297L);
                m139a(graphicsOGL);
                this.f309h.m376a(graphicsOGL, this.f296K);
            } catch (Error e) {
                this.f308g.m515b();
                throw e;
            } catch (RuntimeException e2) {
                this.f308g.m515b();
                throw e2;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void bindRenderTarget(GraphicsOGL graphicsOGL, Texture texture) throws IllegalStateException {
        if (texture == null) {
            throw new NullPointerException();
        }
        if (!texture.m245a()) {
            throw new IllegalArgumentException();
        }
        if (this.f291F != null) {
            throw new IllegalStateException();
        }
        this.f291F = texture;
        this.f309h.m369a(texture.f473c, texture.f474d);
        this.f292G.set(0, 0, texture.f473c, texture.f474d);
        this.f309h.m378a(graphicsOGL, this.f292G);
        this.f293H.set(0, 0, texture.f473c, texture.f474d);
        this.f309h.m392b(graphicsOGL, this.f293H);
        this.f309h.m389a(graphicsOGL, true);
    }

    public final void clear(GraphicsOGL graphicsOGL, int i, int i2) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException();
        }
        Util3D.m296b(f271k, i2);
        this.f309h.m374a(graphicsOGL, i, f271k);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void createBufferObject(BufferPool[] bufferPoolArr, GraphicsOGL graphicsOGL, Batch batch) throws IllegalStateException {
        BufferPool bufferPool;
        BufferPool bufferPool2;
        if (bufferPoolArr != null) {
            int i = 0;
            while (true) {
                if (i >= bufferPoolArr.length) {
                    bufferPool = null;
                    break;
                } else {
                    if (bufferPoolArr[i] != null && bufferPoolArr[i].getType() == 2) {
                        bufferPool = bufferPoolArr[i];
                        break;
                    }
                    i++;
                }
            }
            for (int i2 = 0; i2 < bufferPoolArr.length; i2++) {
                if (bufferPoolArr[i2] != null && bufferPoolArr[i2].getType() == 3) {
                    bufferPool2 = bufferPoolArr[i2];
                }
            }
            bufferPool2 = null;
        } else {
            bufferPool = null;
            bufferPool2 = null;
        }
        batch.m39a(bufferPool2, bufferPool, graphicsOGL, this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void createBufferObject(BufferPool[] bufferPoolArr, GraphicsOGL graphicsOGL, Figure figure) throws IllegalStateException {
        BufferPool bufferPool;
        BufferPool bufferPool2;
        BufferPool bufferPool3;
        int[] iArr = new int[2];
        if (bufferPoolArr != null) {
            int i = 0;
            while (true) {
                if (i >= bufferPoolArr.length) {
                    bufferPool3 = null;
                    break;
                } else {
                    if (bufferPoolArr[i] != null && bufferPoolArr[i].getType() == 2) {
                        bufferPool3 = bufferPoolArr[i];
                        break;
                    }
                    i++;
                }
            }
            for (int i2 = 0; i2 < bufferPoolArr.length; i2++) {
                if (bufferPoolArr[i2] != null && bufferPoolArr[i2].getType() == 3) {
                    bufferPool2 = bufferPoolArr[i2];
                    bufferPool = bufferPool3;
                }
            }
            bufferPool = bufferPool3;
            bufferPool2 = null;
        } else {
            bufferPool = null;
            bufferPool2 = null;
        }
        figure.m118a(iArr, this, (TransformTree) null, 1);
        figure.m110a(bufferPool2, bufferPool, graphicsOGL, this, null, new C0104dv(graphicsOGL, this.f309h, 0, iArr[0]), new C0104dv(graphicsOGL, this.f309h, 1, iArr[1]), 1);
    }

    public final void deleteBufferObject(GraphicsOGL graphicsOGL, Batch batch) {
        batch.m37a(graphicsOGL, this);
    }

    public final void deleteBufferObject(GraphicsOGL graphicsOGL, Figure figure) {
        figure.m109a(graphicsOGL, this, 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void drawBatch(GraphicsOGL graphicsOGL, Batch batch, int i) throws IllegalStateException {
        if (batch == null) {
            throw new NullPointerException();
        }
        if (batch.f128e) {
            throw new IllegalStateException();
        }
        if (this.f296K == null) {
            throw new IllegalStateException();
        }
        if (this.f303b) {
            throw new IllegalStateException();
        }
        try {
            VertexBuffer vertexBuffer = batch.f125b;
            IndexBuffer indexBuffer = batch.f126c;
            if (indexBuffer.f325L != vertexBuffer) {
                if (!indexBuffer.m167a(vertexBuffer)) {
                    throw new IllegalArgumentException();
                }
                indexBuffer.f325L = vertexBuffer;
            }
            this.f308g.m510a(batch, 0, this.f302a && vertexBuffer.f541f[1] != null);
            this.f296K.f176c.m264a(this.f309h, graphicsOGL, -1);
            m141a(graphicsOGL, this.f297L);
            m139a(graphicsOGL);
            this.f309h.m376a(graphicsOGL, this.f296K);
            this.f308g.m512a(this, graphicsOGL, this.f297L, this.f296K, i);
            this.f308g.m515b();
        } catch (Throwable th) {
            this.f308g.m515b();
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void drawEffectSource(GraphicsOGL graphicsOGL, EffectSource effectSource, Transform transform) throws IllegalStateException {
        if (effectSource == null) {
            throw new NullPointerException();
        }
        if (this.f303b) {
            throw new IllegalStateException();
        }
        try {
            effectSource.m102a(graphicsOGL, this, transform, 1);
        } finally {
            this.f308g.m515b();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void drawFigure(GraphicsOGL graphicsOGL, Figure figure, Transform transform, int i) throws IllegalStateException {
        if (figure == null) {
            throw new NullPointerException();
        }
        if (figure.f239y) {
            throw new IllegalStateException();
        }
        if (this.f303b) {
            throw new IllegalStateException();
        }
        try {
            boolean zIsVisible = figure.f231q != null ? figure.f231q.isVisible() : false;
            figure.f236v = 0;
            if (zIsVisible) {
                figure.m113a(figure, (TransformTree) null, this.f304c, 1);
                figure.m111a(figure, this, null, this.f304c, true, 1);
                figure.f231q.f176c.m264a(this.f309h, graphicsOGL, -1);
                m141a(graphicsOGL, figure.f232r);
                m142a(graphicsOGL, figure.f232r, figure);
                m139a(graphicsOGL);
                this.f309h.m376a(graphicsOGL, figure.f231q);
                this.f308g.m512a(this, graphicsOGL, figure.f232r, figure.f231q, i);
            } else {
                if (this.f296K == null) {
                    throw new IllegalStateException();
                }
                if (transform != null) {
                    figure.m113a(figure, (TransformTree) null, transform, 1);
                    figure.m111a(figure, this, null, transform, true, 1);
                } else {
                    figure.m113a(figure, (TransformTree) null, this.f304c, 1);
                    figure.m111a(figure, this, null, this.f304c, true, 1);
                }
                this.f296K.f176c.m264a(this.f309h, graphicsOGL, -1);
                m141a(graphicsOGL, this.f297L);
                m142a(graphicsOGL, this.f297L, figure);
                m139a(graphicsOGL);
                this.f309h.m376a(graphicsOGL, this.f296K);
                this.f308g.m512a(this, graphicsOGL, this.f297L, this.f296K, i);
            }
            this.f308g.m515b();
        } catch (Throwable th) {
            this.f308g.m515b();
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void drawRect(GraphicsOGL graphicsOGL, short s, short s2, short s3, short s4, float f, int i, Appearance appearance, RegionF[] regionFArr) throws IllegalStateException {
        RegionF regionF;
        int i2 = s - (this.f287B >> 1);
        int i3 = (this.f288C >> 1) - s2;
        if (s3 <= 0 || s4 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i2 < -32768 || i2 + s3 > 32767) {
            throw new IllegalArgumentException();
        }
        if (i3 - s4 < -32768 || i3 > 32767) {
            throw new IllegalArgumentException();
        }
        if (regionFArr != null && regionFArr.length < 2) {
            throw new IllegalArgumentException();
        }
        Util3D.m296b(f271k, i);
        f272l.m256a(this.f287B, this.f288C);
        f272l.m264a(this.f309h, graphicsOGL, -1);
        this.f304c.m264a(this.f309h, graphicsOGL, -2);
        this.f309h.m376a(graphicsOGL, this.f296K);
        if (appearance == null) {
            appearance = this.f305d;
        }
        int i4 = 0;
        while (i4 < 2) {
            C0036bh c0036bh = appearance.f110e[i4];
            Texture texture = c0036bh.f713k;
            if (texture == null) {
                this.f309h.m394e(graphicsOGL, i4);
                this.f309h.m371a(graphicsOGL, i4);
            } else {
                if (texture.f484v != null && this.f291F == texture) {
                    throw new IllegalStateException();
                }
                this.f309h.m393d(graphicsOGL, i4);
                texture.m246a(graphicsOGL, this.f309h);
                c0036bh.f712j.f960a.m264a(this.f309h, graphicsOGL, i4 + 0);
                if (regionFArr == null || (regionF = regionFArr[i4]) == null) {
                    this.f309h.m383a(graphicsOGL, f276p, i4, f274n);
                } else {
                    float[] fArr = f275o[i4];
                    fArr[0] = regionF.f456a;
                    fArr[1] = regionF.f457b;
                    fArr[2] = regionF.f456a;
                    fArr[3] = regionF.f459d;
                    fArr[4] = regionF.f458c;
                    fArr[5] = regionF.f457b;
                    fArr[6] = regionF.f458c;
                    fArr[7] = regionF.f459d;
                    this.f309h.m383a(graphicsOGL, f276p, i4, fArr);
                }
                this.f309h.m373a(graphicsOGL, i4, c0036bh);
            }
            i4++;
        }
        this.f309h.m385a(graphicsOGL, appearance.f109d);
        this.f309h.m390a(graphicsOGL, f271k);
        if (f < -6.1035156E-5f || f > 6.1035156E-5f) {
            float f2 = s3 >> 1;
            float f3 = s4 >> 1;
            float fCos = Util3D.cos(f);
            float fSin = Util3D.sin(f);
            f273m[0] = (short) (((-f2) * fCos) + ((-fSin) * f3) + f2 + i2);
            f273m[1] = (short) (((((-f2) * fSin) + (f3 * fCos)) - f3) + i3);
            f273m[2] = (short) (((-f2) * fCos) + ((-f3) * (-fSin)) + f2 + i2);
            f273m[3] = (short) (((((-f2) * fSin) + ((-f3) * fCos)) - f3) + i3);
            f273m[4] = (short) ((f2 * fCos) + ((-fSin) * f3) + f2 + i2);
            f273m[5] = (short) ((((f2 * fSin) + (f3 * fCos)) - f3) + i3);
            f273m[6] = (short) (i2 + (f2 * fCos) + ((-f3) * (-fSin)) + f2);
            f273m[7] = (short) ((((f2 * fSin) + (fCos * (-f3))) - f3) + i3);
        } else {
            f273m[0] = (short) i2;
            f273m[1] = (short) i3;
            f273m[2] = (short) i2;
            f273m[3] = (short) (i3 - s4);
            f273m[4] = (short) (i2 + s3);
            f273m[5] = (short) i3;
            f273m[6] = (short) (i2 + s3);
            f273m[7] = (short) (i3 - s4);
        }
        this.f309h.m384a(graphicsOGL, f276p, f273m);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x024d  */
    public final void drawVertexBuffer(GraphicsOGL graphicsOGL, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, Transform transform) {
        Throwable th;
        C0116o c0116o;
        C0116o c0116oM517d;
        if (vertexBuffer == null || indexBuffer == null) {
            throw new NullPointerException();
        }
        if (this.f296K == null) {
            throw new IllegalStateException();
        }
        if (this.f303b) {
            throw new IllegalStateException();
        }
        if (indexBuffer.f325L != vertexBuffer) {
            if (!indexBuffer.m167a(vertexBuffer)) {
                throw new IllegalArgumentException();
            }
            indexBuffer.f325L = vertexBuffer;
        }
        Appearance appearance = indexBuffer.f352y;
        if (appearance == null) {
            appearance = this.f305d;
        }
        if (!Appearance.m22k(appearance.f109d.f749a)) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (appearance.f110e[i].f714l != null) {
                appearance.f110e[i].f714l.f371s = -1;
            }
        }
        C0117p c0117pM27b = appearance.m27b(0);
        C0116o c0116oM517d2 = this.f308g.m517d();
        if (c0116oM517d2 == null) {
            throw new IllegalStateException();
        }
        try {
            c0116oM517d2.f975b = 0.0f;
            c0116oM517d2.f976c = vertexBuffer;
            c0116oM517d2.f979f = null;
            c0116oM517d2.f980g = null;
            c0116oM517d2.f981h = null;
            c0116oM517d2.f982i = null;
            c0116oM517d2.f985l = null;
            c0116oM517d2.f986m = null;
            c0116oM517d2.f978e = indexBuffer;
            c0116oM517d2.f984k = null;
            c0116oM517d2.f983j = c0117pM27b;
            if (this.f296K.getCameraType() == 0) {
                for (int i2 = 0; i2 < 2; i2++) {
                    c0116oM517d2.f983j.f998d[i2].f716n = false;
                }
            }
            c0116oM517d2.f974a = (c0116oM517d2.f983j.f997c.f760l ? 1 : 0) | (c0116oM517d2.f983j.f997c.f759k << 1);
            if (transform != null) {
                Transform.m251e(c0116oM517d2.f987n, transform);
                c0116oM517d2.f988o.m261a(this.f297L, transform);
            } else {
                c0116oM517d2.f987n.setIdentity();
                Transform.m251e(c0116oM517d2.f988o, this.f297L);
            }
            c0116oM517d2.f989p = this.f302a && vertexBuffer.f541f[1] != null;
            c0116oM517d2.f990q = false;
            c0116oM517d2.f991r = false;
            m141a(graphicsOGL, this.f297L);
            m139a(graphicsOGL);
            this.f309h.m376a(graphicsOGL, this.f296K);
            this.f296K.f176c.m264a(this.f309h, graphicsOGL, -1);
            c0116oM517d2.f988o.m261a(this.f297L, c0116oM517d2.f987n);
            if (indexBuffer.getIndexType() == 7) {
                if (!VertexBuffer.m309h(vertexBuffer.f537b)) {
                    vertexBuffer.m327a();
                    if (VertexBuffer.m308g(vertexBuffer.f536a)) {
                        vertexBuffer.m345h();
                    }
                    vertexBuffer.m342d();
                }
                if (vertexBuffer.f539d[4]) {
                    vertexBuffer.m345h();
                }
                if (vertexBuffer.f539d[7]) {
                    vertexBuffer.m342d();
                }
                vertexBuffer.m343d(c0116oM517d2.f988o);
                this.f304c.m264a(this.f309h, graphicsOGL, -2);
            } else {
                c0116oM517d2.f988o.m264a(this.f309h, graphicsOGL, -2);
            }
            c0116oM517d2.f977d = vertexBuffer.m344e(0);
            if (c0116oM517d2.f977d.f825b != indexBuffer.f321H) {
                vertexBuffer.m336a(indexBuffer, c0116oM517d2.f977d);
            }
            m151a(graphicsOGL, c0116oM517d2);
            vertexBuffer.m338b();
            if (indexBuffer.f349v != null) {
                GeometricShape geometricShape = indexBuffer.f349v;
                if ((this.f310i & SHOW_DEBUG_ALL_BS) != 0 || ((this.f310i & SHOW_DEBUG_BS) != 0 && geometricShape.f258b)) {
                    c0116oM517d = this.f308g.m517d();
                    try {
                        if (c0116oM517d == null) {
                            throw new IllegalStateException();
                        }
                        c0116oM517d.f975b = 0.0f;
                        c0116oM517d.f976c = this.f306e[geometricShape.f257a];
                        c0116oM517d.f978e = this.f307f[geometricShape.f257a][0];
                        c0116oM517d.f979f = null;
                        c0116oM517d.f980g = null;
                        c0116oM517d.f981h = null;
                        c0116oM517d.f982i = null;
                        c0116oM517d.f985l = null;
                        c0116oM517d.f986m = null;
                        c0116oM517d.f983j = c0116oM517d.f978e.f352y.m27b(0);
                        c0116oM517d.f984k = null;
                        if (this.f296K.getCameraType() == 0) {
                            for (int i3 = 0; i3 < 2; i3++) {
                                c0116oM517d.f983j.f998d[i3].f716n = false;
                            }
                        }
                        c0116oM517d.f974a = (c0116oM517d.f983j.f997c.f760l ? 1 : 0) | (c0116oM517d.f983j.f997c.f759k << 1);
                        if (transform != null) {
                            c0116oM517d.f988o.m261a(this.f297L, geometricShape.m130a(transform, 0));
                        } else {
                            c0116oM517d.f988o.m261a(this.f297L, geometricShape.m134c(0));
                        }
                        c0116oM517d.f989p = false;
                        c0116oM517d.f990q = false;
                        c0116oM517d.f991r = false;
                        c0116oM517d.f988o.m264a(this.f309h, graphicsOGL, -2);
                        m151a(graphicsOGL, c0116oM517d);
                    } catch (Throwable th2) {
                        th = th2;
                        c0116o = c0116oM517d;
                        this.f308g.m514a(c0116oM517d2);
                        if (c0116o == null) {
                            throw th;
                        }
                        this.f308g.m514a(c0116o);
                        throw th;
                    }
                } else {
                    c0116oM517d = null;
                }
            } else {
                c0116oM517d = null;
            }
            this.f308g.m514a(c0116oM517d2);
            if (c0116oM517d != null) {
                this.f308g.m514a(c0116oM517d);
            }
        } catch (Throwable th3) {
            th = th3;
            c0116o = null;
        }
    }

    public final void flush(GraphicsOGL graphicsOGL) {
        C0009ah.m361b(graphicsOGL);
    }

    public final void flushDrawQueue(GraphicsOGL graphicsOGL, int i) {
        if (this.f303b) {
            try {
                if (this.f308g.f940b != null) {
                    this.f308g.f940b.f176c.m264a(this.f309h, graphicsOGL, -1);
                    this.f308g.m512a(this, graphicsOGL, this.f308g.f941c, this.f308g.f940b, i);
                } else {
                    if (this.f296K == null) {
                        throw new IllegalStateException();
                    }
                    this.f296K.f176c.m264a(this.f309h, graphicsOGL, -1);
                    this.f308g.m512a(this, graphicsOGL, this.f297L, this.f296K, i);
                }
                this.f308g.m515b();
                this.f303b = false;
            } catch (Throwable th) {
                this.f308g.m515b();
                this.f303b = false;
                throw th;
            }
        }
    }

    public final int getAttribute() {
        return this.f310i;
    }

    public final int getFlushPolygonCount() {
        return this.f308g.m508a();
    }

    public final int getLightNum() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i3 >= 8) {
                return i2;
            }
            if (this.f294I[i3] != null) {
                i2++;
            }
            i = i3 + 1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void getProjectedPoint(Vector3D vector3D, Vector3D vector3D2) throws IllegalStateException {
        float f = this.f289D.f462c >> 1;
        float f2 = this.f289D.f463d >> 1;
        if (vector3D == null || vector3D2 == null) {
            throw new NullPointerException();
        }
        if (this.f296K == null) {
            throw new IllegalStateException();
        }
        f272l.m267b(this.f296K.f176c, this.f297L);
        f272l.transPosition(vector3D, vector3D2);
        vector3D2.f516a = f + (vector3D2.f516a * f);
        vector3D2.f517b = (vector3D2.f517b * (-f2)) + f2;
    }

    public final void purgeArrayAll(GraphicsOGL graphicsOGL, Figure figure) {
        figure.m114a(this, graphicsOGL, 2, 1);
    }

    public final void releaseRenderTarget(GraphicsOGL graphicsOGL) {
        if (this.f291F == null) {
            return;
        }
        this.f291F.m246a(graphicsOGL, this.f309h);
        C0009ah.m365d(graphicsOGL, this.f291F);
        this.f291F = null;
        this.f309h.m369a(this.f287B, this.f288C);
        this.f309h.m389a(graphicsOGL, false);
    }

    public final void resetDrawQueue() {
        this.f308g.m516c();
        this.f303b = false;
    }

    public final void setAttribute(int i) {
        this.f310i = i;
        this.f311j = (this.f310i & (-1073741824)) != 0;
    }

    public final void setCamera(Camera camera, Transform transform) {
        this.f296K = camera;
        if (transform == null || camera == null) {
            this.f297L.setIdentity();
        } else {
            this.f297L.setInvert(transform);
        }
    }

    public final void setCamera(Camera camera, Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3) {
        if (vector3D == null || vector3D2 == null || vector3D3 == null) {
            throw new NullPointerException();
        }
        this.f296K = camera;
        this.f297L.m263a(vector3D, vector3D2, vector3D3);
    }

    public final void setClip(GraphicsOGL graphicsOGL, int i, int i2, int i3, int i4) {
        if (i3 < 0 || i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (this.f291F != null) {
            this.f293H.set(i, i2, i3, i4);
            this.f309h.m392b(graphicsOGL, this.f293H);
        } else {
            this.f290E.set(i, i2, i3, i4);
            this.f309h.m392b(graphicsOGL, this.f290E);
        }
    }

    public final void setDpyFormat(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                C0009ah.m356a(i);
                Texture.f466a[20] = Texture.f466a[i];
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void setFlushPolygonCount(int i) {
        this.f308g.m509a(i);
    }

    public final void setLight(GraphicsOGL graphicsOGL, int i, Light light, Transform transform) {
        if (i < 0 || i >= 8) {
            throw new IllegalArgumentException();
        }
        this.f294I[i] = light;
        if (transform == null || light == null) {
            this.f295J[i].setIdentity();
        } else {
            Transform.m251e(this.f295J[i], transform);
        }
        this.f302a = m147a();
    }

    public final void setProjectorTransform(int i, Transform transform) {
        if (i < 0 || i >= 2) {
            throw new IllegalArgumentException();
        }
        if (transform != null) {
            this.f298M[i].setInvert(transform);
        } else {
            this.f298M[i].setIdentity();
        }
    }

    public final void setViewport(GraphicsOGL graphicsOGL, int i, int i2, int i3, int i4) {
        if (i3 < 0 || i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (this.f291F != null) {
            this.f292G.set(i, i2, i3, i4);
            this.f309h.m378a(graphicsOGL, this.f292G);
        } else {
            this.f289D.set(i, i2, i3, i4);
            this.f309h.m378a(graphicsOGL, this.f289D);
        }
    }

    public final void syncContext(GraphicsOGL graphicsOGL) {
        this.f309h.m370a(graphicsOGL);
    }

    public final void updateBatch(GraphicsOGL graphicsOGL, Batch batch, int i) {
        C0096dn c0096dn = batch.f127d == null ? null : batch.f127d[0];
        IndexBuffer indexBuffer = batch.f126c;
        boolean z = (i & 1) != 0 && (indexBuffer.f352y != null ? indexBuffer.f352y.m27b(0) : this.f305d.m27b(0)).f997c.f760l;
        if (c0096dn == null) {
            batch.m40a(this, this.f297L, z);
        } else {
            batch.m38a(graphicsOGL, this, this.f297L, z);
        }
        batch.f129f = true;
    }
}
