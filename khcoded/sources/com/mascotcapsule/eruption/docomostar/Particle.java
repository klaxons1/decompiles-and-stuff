package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public class Particle extends Object3D {

    /* JADX INFO: renamed from: A */
    float[] f408A;

    /* JADX INFO: renamed from: B */
    float[] f409B;

    /* JADX INFO: renamed from: C */
    C0080cy f410C;

    /* JADX INFO: renamed from: D */
    C0080cy f411D;

    /* JADX INFO: renamed from: E */
    float[] f412E;

    /* JADX INFO: renamed from: F */
    float[] f413F;

    /* JADX INFO: renamed from: G */
    float[] f414G;

    /* JADX INFO: renamed from: H */
    float[] f415H;

    /* JADX INFO: renamed from: I */
    boolean f416I;

    /* JADX INFO: renamed from: a */
    IndexBuffer[] f417a;

    /* JADX INFO: renamed from: b */
    VertexBuffer f418b;

    /* JADX INFO: renamed from: c */
    C0039bk f419c;

    /* JADX INFO: renamed from: d */
    C0039bk f420d;

    /* JADX INFO: renamed from: e */
    C0039bk f421e;

    /* JADX INFO: renamed from: f */
    float f422f;

    /* JADX INFO: renamed from: g */
    float f423g;

    /* JADX INFO: renamed from: p */
    C0080cy f424p;

    /* JADX INFO: renamed from: q */
    float[] f425q;

    /* JADX INFO: renamed from: r */
    float[] f426r;

    /* JADX INFO: renamed from: s */
    C0080cy f427s;

    /* JADX INFO: renamed from: t */
    C0080cy f428t;

    /* JADX INFO: renamed from: u */
    C0080cy f429u;

    /* JADX INFO: renamed from: v */
    float[] f430v;

    /* JADX INFO: renamed from: w */
    float[] f431w;

    /* JADX INFO: renamed from: x */
    C0080cy f432x;

    /* JADX INFO: renamed from: y */
    C0080cy f433y;

    /* JADX INFO: renamed from: z */
    C0080cy f434z;

    public Particle() {
        super(21);
        this.f419c = new C0039bk();
        this.f420d = new C0039bk();
        this.f421e = new C0039bk();
        this.f424p = new C0080cy(3);
        this.f425q = new float[3];
        this.f426r = new float[3];
        this.f427s = new C0080cy(3);
        this.f428t = new C0080cy(3);
        this.f429u = new C0080cy(3);
        this.f430v = new float[3];
        this.f431w = new float[3];
        this.f432x = new C0080cy(3);
        this.f433y = new C0080cy(3);
        this.f434z = new C0080cy(4);
        this.f408A = new float[4];
        this.f409B = new float[4];
        this.f410C = new C0080cy(4);
        this.f411D = new C0080cy(4);
        this.f412E = new float[2];
        this.f413F = new float[2];
        this.f414G = new float[2];
        this.f415H = new float[2];
        m233a();
    }

    Particle(int i) {
        super(22);
        this.f419c = new C0039bk();
        this.f420d = new C0039bk();
        this.f421e = new C0039bk();
        this.f424p = new C0080cy(3);
        this.f425q = new float[3];
        this.f426r = new float[3];
        this.f427s = new C0080cy(3);
        this.f428t = new C0080cy(3);
        this.f429u = new C0080cy(3);
        this.f430v = new float[3];
        this.f431w = new float[3];
        this.f432x = new C0080cy(3);
        this.f433y = new C0080cy(3);
        this.f434z = new C0080cy(4);
        this.f408A = new float[4];
        this.f409B = new float[4];
        this.f410C = new C0080cy(4);
        this.f411D = new C0080cy(4);
        this.f412E = new float[2];
        this.f413F = new float[2];
        this.f414G = new float[2];
        this.f415H = new float[2];
        m233a();
    }

    /* JADX INFO: renamed from: a */
    private void m233a() {
        this.f416I = false;
        this.f422f = Float.MAX_VALUE;
        this.f423g = Float.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            this.f429u.m480a(i, 1.0f, 1.0f);
            this.f430v[i] = Float.MAX_VALUE;
            this.f431w[i] = Float.MIN_VALUE;
            this.f425q[i] = Float.MAX_VALUE;
            this.f426r[i] = -3.4028235E38f;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f434z.m480a(i2, 1.0f, 1.0f);
            this.f408A[i2] = 1.0f;
            this.f409B[i2] = 0.0f;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            this.f412E[i3] = 1.0f;
            this.f413F[i3] = 0.0f;
            this.f414G[i3] = 0.0f;
            this.f415H[i3] = 0.0f;
        }
    }

    protected final void clone(Particle particle) {
        this.f417a = particle.f417a;
        this.f418b = particle.f418b;
        this.f419c = particle.f419c;
        this.f420d = particle.f420d;
        this.f421e = particle.f421e;
        this.f422f = particle.f422f;
        this.f423g = particle.f423g;
        this.f424p = particle.f424p;
        this.f425q = particle.f425q;
        this.f426r = particle.f426r;
        this.f427s = particle.f427s;
        this.f428t = particle.f428t;
        this.f429u = particle.f429u;
        this.f430v = particle.f430v;
        this.f431w = particle.f431w;
        this.f432x = particle.f432x;
        this.f433y = particle.f433y;
        this.f434z = particle.f434z;
        this.f408A = particle.f408A;
        this.f409B = particle.f409B;
        this.f410C = particle.f410C;
        this.f411D = particle.f411D;
        this.f412E = particle.f412E;
        this.f413F = particle.f413F;
        this.f414G = particle.f414G;
        this.f415H = particle.f415H;
        this.f416I = particle.f416I;
    }

    public final void setColorIniVal(int i, int i2) {
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        Util3D.m296b(fArr, i);
        Util3D.m296b(fArr2, i2);
        for (int i3 = 0; i3 < 4; i3++) {
            this.f434z.m480a(i3, fArr[i3], fArr2[i3]);
        }
    }

    public final void setColorRange(int i, int i2) {
        Util3D.m296b(this.f408A, i);
        Util3D.m296b(this.f409B, i2);
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f409B[i3] > this.f408A[i3]) {
                throw new IllegalArgumentException("min has bigger value than max");
            }
        }
    }

    public final void setColorVelocity(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        if (fArr == null || fArr2 == null || fArr3 == null || fArr4 == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < 4; i++) {
            this.f410C.m480a(i, fArr[i], fArr2[i]);
            this.f411D.m480a(i, fArr3[i], fArr4[i]);
        }
    }

    public final void setLifeDuration(float f, float f2) {
        this.f419c.m438a(f, f2);
    }

    public final void setModel(VertexBuffer vertexBuffer, IndexBuffer[] indexBufferArr) {
        if (vertexBuffer == null || indexBufferArr == null) {
            throw new NullPointerException();
        }
        if (indexBufferArr.length < 1) {
            throw new IllegalArgumentException("ib length is 0");
        }
        for (IndexBuffer indexBuffer : indexBufferArr) {
            if (indexBuffer == null) {
                throw new NullPointerException();
            }
        }
        this.f418b = vertexBuffer;
        this.f417a = new IndexBuffer[indexBufferArr.length];
        for (int i = 0; i < indexBufferArr.length; i++) {
            this.f417a[i] = indexBufferArr[i];
        }
        if (indexBufferArr.length == 1 && indexBufferArr[0].getIndexType() == 7) {
            this.f416I = true;
        } else {
            this.f416I = false;
        }
    }

    public final void setMoveSpeed(float f, float f2, float f3, float f4) {
        this.f420d.m438a(f, f2);
        this.f421e.m438a(f3, f4);
    }

    public final void setMoveSpeedRange(float f, float f2) {
        if (f2 > f) {
            throw new IllegalArgumentException("min has bigger value than max");
        }
        this.f422f = f;
        this.f423g = f2;
    }

    public final void setRotationIniVal(Vector3D vector3D, Vector3D vector3D2) {
        if (vector3D == null || vector3D2 == null) {
            throw new NullPointerException();
        }
        this.f424p.m480a(0, vector3D.getX(), vector3D2.getX());
        this.f424p.m480a(1, vector3D.getY(), vector3D2.getY());
        this.f424p.m480a(2, vector3D.getZ(), vector3D2.getZ());
    }

    public final void setRotationRange(Vector3D vector3D, Vector3D vector3D2) {
        if (vector3D == null || vector3D2 == null) {
            throw new NullPointerException();
        }
        if (vector3D2.getX() > vector3D.getX() || vector3D2.getY() > vector3D.getY() || vector3D2.getZ() > vector3D.getZ()) {
            throw new IllegalArgumentException("min has bigger value than max");
        }
        this.f425q[0] = vector3D.getX();
        this.f425q[1] = vector3D.getY();
        this.f425q[2] = vector3D.getZ();
        this.f426r[0] = vector3D2.getX();
        this.f426r[1] = vector3D2.getY();
        this.f426r[2] = vector3D2.getZ();
    }

    public final void setRotationVelocity(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, Vector3D vector3D4) {
        if (vector3D == null || vector3D2 == null || vector3D3 == null || vector3D4 == null) {
            throw new NullPointerException();
        }
        this.f427s.m480a(0, vector3D.getX(), vector3D2.getX());
        this.f427s.m480a(1, vector3D.getY(), vector3D2.getY());
        this.f427s.m480a(2, vector3D.getZ(), vector3D2.getZ());
        this.f428t.m480a(0, vector3D3.getX(), vector3D4.getX());
        this.f428t.m480a(1, vector3D3.getY(), vector3D4.getY());
        this.f428t.m480a(2, vector3D3.getZ(), vector3D4.getZ());
    }

    public final void setScaleIniVal(Vector3D vector3D, Vector3D vector3D2) {
        if (vector3D == null || vector3D2 == null) {
            throw new NullPointerException();
        }
        this.f429u.m480a(0, vector3D.getX(), vector3D2.getX());
        this.f429u.m480a(1, vector3D.getY(), vector3D2.getY());
        this.f429u.m480a(2, vector3D.getZ(), vector3D2.getZ());
    }

    public final void setScaleRange(Vector3D vector3D, Vector3D vector3D2) {
        if (vector3D == null || vector3D2 == null) {
            throw new NullPointerException();
        }
        if (vector3D2.getX() > vector3D.getX() || vector3D2.getY() > vector3D.getY() || vector3D2.getZ() > vector3D.getZ()) {
            throw new IllegalArgumentException("min has bigger value than max");
        }
        this.f430v[0] = vector3D.getX();
        this.f430v[1] = vector3D.getY();
        this.f430v[2] = vector3D.getZ();
        this.f431w[0] = vector3D2.getX();
        this.f431w[1] = vector3D2.getY();
        this.f431w[2] = vector3D2.getZ();
    }

    public final void setScaleVelocity(Vector3D vector3D, Vector3D vector3D2, Vector3D vector3D3, Vector3D vector3D4) {
        if (vector3D == null || vector3D2 == null || vector3D3 == null || vector3D4 == null) {
            throw new NullPointerException();
        }
        this.f432x.m480a(0, vector3D.getX(), vector3D2.getX());
        this.f432x.m480a(1, vector3D.getY(), vector3D2.getY());
        this.f432x.m480a(2, vector3D.getZ(), vector3D2.getZ());
        this.f433y.m480a(0, vector3D3.getX(), vector3D4.getX());
        this.f433y.m480a(1, vector3D3.getY(), vector3D4.getY());
        this.f433y.m480a(2, vector3D3.getZ(), vector3D4.getZ());
    }

    public final void setTextureSTRange(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < 2; i++) {
            if (fArr2[i] > fArr[i]) {
                throw new IllegalArgumentException("min has bigger value than max");
            }
            this.f412E[i] = fArr[i];
            this.f413F[i] = fArr2[i];
        }
    }

    public final void setTextureSTVelocity(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < 2; i++) {
            this.f414G[i] = fArr[i];
            this.f415H[i] = fArr2[i];
        }
    }
}
