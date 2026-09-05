package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.ogl.GraphicsOGL;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class EffectSource extends Particle implements NodeDeformerNode {
    public static final int ShapeMode_FILL = 1;
    public static final int ShapeMode_LINE = 0;
    public static final int ShapeMode_Num = 2;
    public static final int ShapeType_BOX = 5;
    public static final int ShapeType_CIRCLE = 3;
    public static final int ShapeType_LINE = 1;
    public static final int ShapeType_Num = 6;
    public static final int ShapeType_POINT = 0;
    public static final int ShapeType_RECTANGLE = 2;
    public static final int ShapeType_SPHERE = 4;

    /* JADX INFO: renamed from: ae */
    private static final AbstractC0045bq[] f194ae = {new C0084db(), new C0034bf(), new C0099dq(), new C0098dp(), new C0085dc(), new C0079cx()};

    /* JADX INFO: renamed from: J */
    private boolean f195J;

    /* JADX INFO: renamed from: K */
    private boolean f196K;

    /* JADX INFO: renamed from: L */
    private C0039bk f197L;

    /* JADX INFO: renamed from: M */
    private float f198M;

    /* JADX INFO: renamed from: N */
    private float f199N;

    /* JADX INFO: renamed from: O */
    private float f200O;

    /* JADX INFO: renamed from: P */
    private int f201P;

    /* JADX INFO: renamed from: Q */
    private int f202Q;

    /* JADX INFO: renamed from: R */
    private int f203R;

    /* JADX INFO: renamed from: S */
    private C0060ce[] f204S;

    /* JADX INFO: renamed from: T */
    private C0119r[] f205T;

    /* JADX INFO: renamed from: U */
    private C0039bk f206U;

    /* JADX INFO: renamed from: V */
    private C0080cy f207V;

    /* JADX INFO: renamed from: W */
    private Vector3D f208W;

    /* JADX INFO: renamed from: X */
    private Vector3D f209X;

    /* JADX INFO: renamed from: Y */
    private Transform f210Y;

    /* JADX INFO: renamed from: Z */
    private int f211Z;

    /* JADX INFO: renamed from: aa */
    private int f212aa;

    /* JADX INFO: renamed from: ab */
    private Vector3D f213ab;

    /* JADX INFO: renamed from: ac */
    private IndexBuffer[] f214ac;

    /* JADX INFO: renamed from: ad */
    private Object3D f215ad;

    public EffectSource(int i) {
        super(22);
        this.f197L = new C0039bk();
        this.f206U = new C0039bk();
        this.f207V = new C0080cy(3);
        this.f208W = new Vector3D();
        this.f209X = new Vector3D();
        this.f210Y = new Transform();
        this.f213ab = new Vector3D();
        if (i <= 0) {
            throw new IllegalArgumentException("num is less or equal than 0");
        }
        this.f205T = new C0119r[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f205T[i2] = new C0119r(this);
        }
        this.f203R = i;
        this.f195J = true;
        this.f196K = false;
        this.f199N = 0.0f;
        this.f200O = 0.0f;
        this.f198M = 0.0f;
        this.f202Q = 0;
        this.f204S = null;
        this.f201P = 0;
        this.f211Z = 0;
        this.f212aa = 1;
        this.f214ac = null;
        this.f215ad = null;
    }

    /* JADX INFO: renamed from: a */
    static float m82a(EffectSource effectSource, float f) {
        effectSource.f199N = f;
        return f;
    }

    /* JADX INFO: renamed from: a */
    static EffectSource m83a(EffectSource effectSource) {
        EffectSource effectSource2 = new EffectSource(effectSource.f203R);
        effectSource2.f202Q = effectSource.f202Q;
        effectSource2.f204S = new C0060ce[effectSource2.f202Q];
        for (int i = 0; i < effectSource2.f202Q; i++) {
            effectSource2.f204S[i] = new C0060ce(effectSource2, effectSource.f204S[i].f778c, effectSource.f203R);
        }
        effectSource2.f195J = effectSource.f195J;
        effectSource2.f197L = effectSource.f197L;
        effectSource2.f196K = effectSource.f196K;
        effectSource2.setBaseModel(effectSource.f215ad, effectSource.f214ac);
        effectSource2.f206U = effectSource.f206U;
        effectSource2.f207V = effectSource.f207V;
        effectSource2.f208W = effectSource.f208W;
        effectSource2.f209X = effectSource.f209X;
        effectSource2.f210Y = effectSource.f210Y;
        effectSource2.f211Z = effectSource.f211Z;
        effectSource2.f212aa = effectSource.f212aa;
        effectSource2.f213ab = effectSource.f213ab;
        return effectSource2;
    }

    /* JADX INFO: renamed from: a */
    static void m84a(EffectSource effectSource, int i) {
        effectSource.m89b(i);
    }

    /* JADX INFO: renamed from: a */
    static void m85a(EffectSource effectSource, Vector3D vector3D) {
        effectSource.m92c(vector3D);
    }

    /* JADX INFO: renamed from: a */
    private static void m86a(IndexBuffer indexBuffer, TextureTable textureTable) {
        Texture textureFindTexture;
        int i = 0;
        Appearance appearance = indexBuffer.getAppearance();
        if (appearance != null) {
            if (textureTable == null) {
                while (i < 2) {
                    appearance.setTexture(i, null);
                    i++;
                }
            } else {
                while (i < 2) {
                    int textureRefGid = appearance.getTextureRefGid(i);
                    if (textureRefGid != -1 && (textureFindTexture = textureTable.findTexture(textureRefGid)) != null) {
                        appearance.setTexture(i, textureFindTexture);
                    }
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m87a(TextureTable textureTable, int i) {
        for (int i2 = 0; i2 < this.f202Q; i2++) {
            if (this.f204S[i2].f780e) {
                m86a(this.f204S[i2].f777b[0], textureTable);
            } else {
                Particle particle = this.f204S[i2].f778c;
                for (int i3 = 0; i3 < particle.f417a.length; i3++) {
                    m86a(particle.f417a[i3], textureTable);
                }
            }
            if (this.f204S[i2].f778c.f400h == 22 && i < 4) {
                ((EffectSource) this.f204S[i2].f778c).m87a(textureTable, i + 1);
            }
        }
        if (this.f214ac != null) {
            for (int i4 = 0; i4 < this.f214ac.length; i4++) {
                m86a(this.f214ac[i4], textureTable);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static AbstractC0045bq[] m88a() {
        return f194ae;
    }

    /* JADX INFO: renamed from: b */
    private void m89b(int i) {
        for (int i2 = 0; i2 < this.f203R; i2++) {
            C0119r c0119r = this.f205T[i2];
            if (c0119r.f1011e) {
                c0119r.m518a(i);
            }
        }
        for (int i3 = 0; i3 < this.f202Q; i3++) {
            this.f204S[i3].f776a.f539d[0] = true;
            if (this.f204S[i3].f780e) {
                this.f204S[i3].f776a.f539d[4] = true;
                this.f204S[i3].f776a.f539d[7] = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static C0060ce[] m90b(EffectSource effectSource) {
        return effectSource.f204S;
    }

    /* JADX INFO: renamed from: c */
    static int m91c(EffectSource effectSource) {
        return effectSource.f202Q;
    }

    /* JADX INFO: renamed from: c */
    private void m92c(Vector3D vector3D) {
        this.f200O += this.f197L.m437a() * this.f199N;
        int i = (int) this.f200O;
        AbstractC0045bq abstractC0045bq = f194ae[this.f211Z];
        Vector3D vector3D2 = this.f209X;
        Vector3D vector3D3 = this.f213ab;
        int i2 = this.f212aa;
        abstractC0045bq.f738a = vector3D2;
        abstractC0045bq.f739b = vector3D3;
        abstractC0045bq.f740c = i2;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f201P >= this.f203R) {
                if (!this.f195J) {
                    return;
                } else {
                    this.f201P = 0;
                }
            }
            int i4 = this.f201P;
            C0119r c0119r = this.f205T[i4];
            if (c0119r.f1011e && c0119r.f1010d.f785j != null) {
                c0119r.f1010d.f785j[c0119r.f1014h] = 0.0f;
                c0119r.f1010d.f785j[c0119r.f1014h + 1] = 0.0f;
            }
            c0119r.m519a(i4, vector3D);
            this.f201P++;
            this.f200O = 0.0f;
        }
    }

    /* JADX INFO: renamed from: d */
    static int m93d(EffectSource effectSource) {
        return effectSource.f211Z;
    }

    /* JADX INFO: renamed from: e */
    static Vector3D m94e(EffectSource effectSource) {
        return effectSource.f209X;
    }

    /* JADX INFO: renamed from: f */
    static Vector3D m95f(EffectSource effectSource) {
        return effectSource.f213ab;
    }

    /* JADX INFO: renamed from: g */
    static C0080cy m96g(EffectSource effectSource) {
        return effectSource.f207V;
    }

    /* JADX INFO: renamed from: h */
    static boolean m97h(EffectSource effectSource) {
        return effectSource.f196K;
    }

    /* JADX INFO: renamed from: i */
    static Transform m98i(EffectSource effectSource) {
        return effectSource.f210Y;
    }

    /* JADX INFO: renamed from: j */
    static int m99j(EffectSource effectSource) {
        return effectSource.f203R;
    }

    /* JADX INFO: renamed from: k */
    static Vector3D m100k(EffectSource effectSource) {
        return effectSource.f208W;
    }

    /* JADX INFO: renamed from: l */
    static float m101l(EffectSource effectSource) {
        return effectSource.f199N;
    }

    /* JADX INFO: renamed from: a */
    final void m102a(GraphicsOGL graphicsOGL, Graphics3D graphics3D, Transform transform, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f202Q) {
                break;
            }
            if (this.f204S[i3].f780e) {
                graphics3D.drawVertexBuffer(graphicsOGL, this.f204S[i3].f776a, this.f204S[i3].f777b[0], transform);
            } else {
                C0060ce c0060ce = this.f204S[i3];
                for (int i4 = 0; i4 < this.f203R; i4++) {
                    C0119r c0119r = this.f205T[i4];
                    if (c0119r.f1011e && c0119r.f1010d == c0060ce) {
                        Transform transform2 = new Transform();
                        Transform transform3 = new Transform();
                        Transform transform4 = new Transform();
                        Vector3D vector3D = new Vector3D(c0119r.f1009c.m396a(0), c0119r.f1009c.m396a(1), c0119r.f1009c.m396a(2));
                        transform2.setTranslate(c0119r.f1010d.f783h[c0119r.f1013g], c0119r.f1010d.f783h[c0119r.f1013g + 1], c0119r.f1010d.f783h[c0119r.f1013g + 2]);
                        transform3.setScale(c0119r.f1008b.m396a(0), c0119r.f1008b.m396a(1), c0119r.f1008b.m396a(2));
                        transform4.setRotateEuler(0, vector3D);
                        transform3.m271c(transform2);
                        transform2.multiply(transform, transform3);
                        transform2.multiply(transform2, transform4);
                        for (int i5 = 0; i5 < c0119r.f1007a.f417a.length; i5++) {
                            graphics3D.drawVertexBuffer(graphicsOGL, c0119r.f1012f, c0119r.f1007a.f417a[i5], transform2);
                        }
                    }
                }
            }
            if (this.f204S[i3].f778c.getClassType() == 22 && i < 4) {
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    if (i7 < this.f203R) {
                        if (this.f205T[i7].f1011e && this.f205T[i3].f1007a.f400h == 22) {
                            ((EffectSource) this.f205T[i7].f1007a).m102a(graphicsOGL, graphics3D, transform, i + 1);
                        }
                        i6 = i7 + 1;
                    }
                }
            }
            i2 = i3 + 1;
        }
        if (this.f215ad == null || this.f215ad.getClassType() != 3) {
            return;
        }
        Transform transform5 = new Transform();
        transform5.setTranslate(this.f209X);
        transform5.multiply(transform, transform5);
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= this.f214ac.length) {
                return;
            }
            graphics3D.drawVertexBuffer(graphicsOGL, (VertexBuffer) this.f215ad, this.f214ac[i9], transform5);
            i8 = i9 + 1;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void addSiblingNode(NodeDeformerNode nodeDeformerNode, Transform transform) {
        super.m223a(nodeDeformerNode, transform);
    }

    /* JADX INFO: renamed from: b */
    final void m103b(GraphicsOGL graphicsOGL, Graphics3D graphics3D, Transform transform, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f202Q) {
                break;
            }
            if (this.f204S[i3].f780e) {
                graphics3D.addDrawQueueVertexBuffer(graphicsOGL, this.f204S[i3].f776a, this.f204S[i3].f777b[0], transform);
            } else {
                C0060ce c0060ce = this.f204S[i3];
                for (int i4 = 0; i4 < this.f203R; i4++) {
                    C0119r c0119r = this.f205T[i4];
                    if (c0119r.f1011e && c0119r.f1010d == c0060ce) {
                        Transform transform2 = new Transform();
                        Transform transform3 = new Transform();
                        Transform transform4 = new Transform();
                        Vector3D vector3D = new Vector3D(c0119r.f1009c.m396a(0), c0119r.f1009c.m396a(1), c0119r.f1009c.m396a(2));
                        transform2.setTranslate(c0119r.f1010d.f783h[c0119r.f1013g], c0119r.f1010d.f783h[c0119r.f1013g + 1], c0119r.f1010d.f783h[c0119r.f1013g + 2]);
                        transform3.setScale(c0119r.f1008b.m396a(0), c0119r.f1008b.m396a(1), c0119r.f1008b.m396a(2));
                        transform4.setRotateEuler(0, vector3D);
                        transform2.multiply(transform, transform3);
                        transform2.multiply(transform2, transform4);
                        for (int i5 = 0; i5 < c0119r.f1007a.f417a.length; i5++) {
                            graphics3D.addDrawQueueVertexBuffer(graphicsOGL, c0119r.f1012f, c0119r.f1007a.f417a[i5], transform2);
                        }
                    }
                }
            }
            if (this.f204S[i3].f778c.getClassType() == 22 && i < 4) {
                ((EffectSource) this.f204S[i3].f778c).m103b(graphicsOGL, graphics3D, transform, i + 1);
            }
            i2 = i3 + 1;
        }
        if (this.f215ad == null || this.f215ad.getClassType() != 3) {
            return;
        }
        Transform transform5 = new Transform();
        transform5.setTranslate(this.f209X);
        transform5.multiply(transform, transform5);
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= this.f214ac.length) {
                return;
            }
            graphics3D.addDrawQueueVertexBuffer(graphicsOGL, (VertexBuffer) this.f215ad, this.f214ac[i7], transform);
            i6 = i7 + 1;
        }
    }

    public final void bindTexture(TextureTable textureTable) {
        m87a(textureTable, 1);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final NodeDeformer getParent() {
        return this.f404l;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final int getParentIndex() {
        return this.f405m;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void getToWorldTransform(Transform transform) {
        super.m224a(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void getTransform(Transform transform) {
        super.m229c(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final boolean isVisible() {
        return super.m232g();
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void mulScale(Vector3D vector3D) {
        super.m228b(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void removeFromParent() {
        super.m231f();
    }

    public final void setBaseModel(Object3D object3D, IndexBuffer[] indexBufferArr) {
        if (object3D == null) {
            throw new NullPointerException();
        }
        int classType = object3D.getClassType();
        if (classType != 3 && classType != 21) {
            throw new IllegalArgumentException("class type of obj must be VertexBuffer or Particle");
        }
        if (classType == 3) {
            if (indexBufferArr == null) {
                throw new NullPointerException("ib is null");
            }
            if (indexBufferArr.length < 1) {
                throw new IllegalArgumentException("ib length is 0");
            }
            for (IndexBuffer indexBuffer : indexBufferArr) {
                if (indexBuffer == null) {
                    throw new NullPointerException("ib contains null object");
                }
            }
            this.f214ac = new IndexBuffer[indexBufferArr.length];
            for (int i = 0; i < indexBufferArr.length; i++) {
                this.f214ac[i] = indexBufferArr[i];
            }
        }
        if (classType == 21) {
            clone((Particle) object3D);
        }
        this.f215ad = object3D;
    }

    public final void setExtFactorAcceleration(Vector3D vector3D) {
        if (vector3D == null) {
            throw new NullPointerException();
        }
        this.f208W.set(vector3D);
    }

    public final void setFlow(float f, float f2, boolean z) {
        this.f197L.m438a(f, f2);
        this.f195J = z;
    }

    public final void setFrame(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("frame value is less than 0");
        }
        if (this.f198M > 0.0f) {
            this.f199N = f - this.f198M;
        }
        this.f198M = f;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setIdentity() {
        super.m230e();
    }

    public final void setLaunchVector(Vector3D vector3D, Vector3D vector3D2, boolean z) {
        if (vector3D == null || vector3D2 == null) {
            throw new NullPointerException("upperVal or lowerVal is null");
        }
        this.f207V.m480a(0, vector3D.getX(), vector3D2.getX());
        this.f207V.m480a(1, vector3D.getY(), vector3D2.getY());
        this.f207V.m480a(2, vector3D.getZ(), vector3D2.getZ());
        this.f196K = z;
    }

    public final void setParticleSeeds(Object3D[] object3DArr) {
        if (object3DArr == null) {
            throw new NullPointerException("argument \"particles\" is null");
        }
        this.f202Q = object3DArr.length;
        this.f204S = new C0060ce[this.f202Q];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f202Q) {
                return;
            }
            if (object3DArr[i2] == null) {
                throw new NullPointerException("argument \"particles\" contains null object");
            }
            if (object3DArr[i2] == this) {
                throw new IllegalArgumentException("argument \"particles\" contains myself (It's not permitted.)");
            }
            int classType = object3DArr[i2].getClassType();
            if (classType != 21 && classType != 22) {
                throw new IllegalArgumentException("argument \"particles\" contains Illegal Type Object");
            }
            this.f204S[i2] = new C0060ce(this, (Particle) object3DArr[i2], this.f203R);
            i = i2 + 1;
        }
    }

    public final void setPosition(Vector3D vector3D) {
        if (vector3D == null) {
            throw new NullPointerException();
        }
        this.f209X.set(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setRotateEuler(int i, Vector3D vector3D) {
        super.m222a(i, vector3D);
    }

    public final void setRotation(Vector3D vector3D) {
        if (vector3D == null) {
            throw new NullPointerException();
        }
        this.f210Y.setRotateEuler(0, vector3D);
    }

    public final void setShapeSize(Vector3D vector3D) {
        if (vector3D == null) {
            throw new NullPointerException();
        }
        this.f213ab.set(vector3D);
    }

    public final void setShapeType(int i, int i2) {
        if (i < 0 || i >= 6) {
            throw new IllegalArgumentException("shapeType has illegal value");
        }
        if (i2 < 0 || i2 >= 2) {
            throw new IllegalArgumentException("shapMode has illegal value");
        }
        this.f211Z = i;
        this.f212aa = i2;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setTransform(Transform transform) {
        super.m227b(transform);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setTranslate(Vector3D vector3D) {
        super.m225a(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setVisible(boolean z) {
        super.m226a(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void updateParticles() throws IllegalStateException {
        if (this.f202Q < 1) {
            throw new IllegalStateException("No particle seeds were set");
        }
        m92c((Vector3D) null);
        m89b(1);
    }
}
