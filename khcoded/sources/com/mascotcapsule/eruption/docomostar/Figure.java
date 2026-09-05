package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.ogl.GraphicsOGL;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Figure extends Object3D implements NodeDeformerNode {

    /* JADX INFO: renamed from: B */
    private float f218B;

    /* JADX INFO: renamed from: C */
    private IndexBuffer[] f219C;

    /* JADX INFO: renamed from: D */
    private boolean f220D;

    /* JADX INFO: renamed from: E */
    private boolean f221E;

    /* JADX INFO: renamed from: F */
    private boolean f222F;

    /* JADX INFO: renamed from: a */
    short f223a;

    /* JADX INFO: renamed from: b */
    IndexBuffer[] f224b;

    /* JADX INFO: renamed from: c */
    VertexBuffer f225c;

    /* JADX INFO: renamed from: d */
    NodeDeformer f226d;

    /* JADX INFO: renamed from: e */
    BoneDeformer f227e;

    /* JADX INFO: renamed from: f */
    MorphDeformer f228f;

    /* JADX INFO: renamed from: g */
    TransformTree f229g;

    /* JADX INFO: renamed from: p */
    C0096dn[] f230p;

    /* JADX INFO: renamed from: q */
    Camera f231q;

    /* JADX INFO: renamed from: r */
    Transform f232r;

    /* JADX INFO: renamed from: s */
    GeometricShape f233s;

    /* JADX INFO: renamed from: t */
    Light[] f234t;

    /* JADX INFO: renamed from: u */
    Transform[] f235u;

    /* JADX INFO: renamed from: v */
    int f236v;

    /* JADX INFO: renamed from: w */
    Appearance f237w;

    /* JADX INFO: renamed from: x */
    boolean f238x;

    /* JADX INFO: renamed from: y */
    boolean f239y;

    /* JADX INFO: renamed from: z */
    private static final Transform f217z = new Transform();

    /* JADX INFO: renamed from: A */
    private static final float[] f216A = new float[1];

    public Figure() {
        super(9);
        m107c(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Figure(VertexBuffer vertexBuffer, IndexBuffer[] indexBufferArr) {
        super(9);
        int length = indexBufferArr.length;
        if (vertexBuffer == null) {
            throw new NullPointerException();
        }
        if (indexBufferArr == null) {
            throw new NullPointerException();
        }
        if (length <= 0 || length > 32767) {
            throw new IllegalArgumentException();
        }
        if (vertexBuffer.f529H != null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < length; i++) {
            if (indexBufferArr[i] == null) {
                throw new NullPointerException();
            }
            if (!indexBufferArr[i].f337b) {
                throw new IllegalArgumentException();
            }
            if (indexBufferArr[i].f336a == 7 && length != 1) {
                throw new IllegalArgumentException();
            }
            if (!indexBufferArr[i].m167a(vertexBuffer)) {
                throw new IllegalArgumentException();
            }
        }
        m107c(length);
        if (indexBufferArr[0].getIndexType() == 7) {
            vertexBuffer.m327a();
            if (VertexBuffer.m308g(vertexBuffer.f536a)) {
                vertexBuffer.m345h();
            }
            vertexBuffer.m342d();
            this.f220D = true;
        }
        for (int i2 = 0; i2 < length; i2++) {
            indexBufferArr[i2].f325L = vertexBuffer;
            this.f224b[i2] = indexBufferArr[i2];
        }
        this.f225c = vertexBuffer;
        vertexBuffer.f529H = this;
    }

    /* JADX INFO: renamed from: a */
    private void m104a(float f, float f2, float f3, float f4, int i) {
        if (this.f225c != null) {
            this.f225c.m328a(f, f2, f3, f4);
        }
        if (this.f226d == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f226d.f390c) {
                return;
            }
            Object3D object3D = this.f226d.f392e[i3].f671a;
            if (object3D != null) {
                switch (object3D.f400h) {
                    case 9:
                        if (i >= 4) {
                            return;
                        } else {
                            ((Figure) object3D).m104a(f, f2, f3, f4, i + 1);
                        }
                        break;
                }
            }
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m105a(ActionTable actionTable, int i) {
        int refGid;
        int refGid2;
        int refGid3;
        TransformTree transformTree = this.f229g;
        NodeDeformer nodeDeformer = this.f226d;
        if (transformTree != null && (refGid3 = transformTree.getRefGid()) != -1) {
            if (actionTable != null) {
                Action actionFindAction = actionTable.findAction(refGid3);
                if (actionFindAction != null) {
                    transformTree.setAction(actionFindAction);
                }
            } else {
                transformTree.setAction(null);
            }
        }
        for (int i2 = 0; i2 < this.f223a; i2++) {
            Appearance appearance = this.f224b[i2].f352y;
            if (appearance != null && (refGid2 = appearance.getRefGid()) != -1) {
                if (actionTable != null) {
                    Action actionFindAction2 = actionTable.findAction(refGid2);
                    if (actionFindAction2 != null) {
                        appearance.setAction(actionFindAction2);
                    }
                } else {
                    appearance.setAction(null);
                }
            }
        }
        if (this.f228f != null && (refGid = this.f228f.getRefGid()) != -1) {
            if (actionTable != null) {
                Action actionFindAction3 = actionTable.findAction(refGid);
                if (actionFindAction3 != null) {
                    this.f228f.setAction(actionFindAction3);
                }
            } else {
                this.f228f.setAction(null);
            }
        }
        if (nodeDeformer != null) {
            C0017ap[] c0017apArr = nodeDeformer.f392e;
            short s = nodeDeformer.f390c;
            int refGid4 = nodeDeformer.getRefGid();
            if (refGid4 != -1) {
                if (actionTable != null) {
                    Action actionFindAction4 = actionTable.findAction(refGid4);
                    if (actionFindAction4 != null) {
                        nodeDeformer.setAction(actionFindAction4);
                    }
                } else {
                    nodeDeformer.setAction(null);
                }
            }
            for (int i3 = 0; i3 < s; i3++) {
                Object3D object3D = c0017apArr[i3].f671a;
                switch (object3D.f400h) {
                    case 9:
                        if (i >= 4) {
                            return;
                        } else {
                            ((Figure) object3D).m105a(actionTable, i + 1);
                        }
                        break;
                    case 15:
                    case 16:
                        int refGid5 = ((Animatable) object3D).getRefGid();
                        if (refGid5 != -1) {
                            if (actionTable != null) {
                                Action actionFindAction5 = actionTable.findAction(refGid5);
                                if (actionFindAction5 != null) {
                                    ((Animatable) object3D).setAction(actionFindAction5);
                                }
                            } else {
                                ((Animatable) object3D).setAction(null);
                            }
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m106a(Graphics3D graphics3D) {
        GeometricShape geometricShape = this.f233s;
        if (geometricShape != null && ((graphics3D.f310i & Graphics3D.SHOW_DEBUG_ALL_BS) != 0 || ((graphics3D.f310i & Graphics3D.SHOW_DEBUG_BS) != 0 && geometricShape.f258b))) {
            for (int i = 0; i < 3; i++) {
                if (graphics3D.f307f[geometricShape.f257a][i] != null) {
                    graphics3D.f308g.m513a(graphics3D.f306e[geometricShape.f257a], graphics3D.f307f[geometricShape.f257a][i], geometricShape.m134c(i), 0, false, false, true);
                }
            }
        }
        for (int i2 = 0; i2 < this.f223a; i2++) {
            GeometricShape geometricShape2 = this.f224b[i2].f349v;
            if (geometricShape2 != null && ((graphics3D.f310i & Graphics3D.SHOW_DEBUG_ALL_BS) != 0 || ((graphics3D.f310i & Graphics3D.SHOW_DEBUG_BS) != 0 && geometricShape2.f258b))) {
                for (int i3 = 0; i3 < 3; i3++) {
                    if (graphics3D.f307f[geometricShape2.f257a][i3] != null) {
                        graphics3D.f308g.m513a(graphics3D.f306e[geometricShape2.f257a], graphics3D.f307f[geometricShape2.f257a][i3], geometricShape2.m134c(i3), 0, false, false, true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m107c(int i) {
        this.f223a = (short) i;
        if (i > 0) {
            this.f224b = new IndexBuffer[i];
            this.f219C = new IndexBuffer[i];
        }
        this.f234t = new Light[8];
        this.f235u = new Transform[8];
    }

    @Override // com.mascotcapsule.eruption.docomostar.Object3D
    /* JADX INFO: renamed from: a */
    final int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        return m108a(i, i2, object3DArr, i3, 1);
    }

    /* JADX INFO: renamed from: a */
    final int m108a(int i, int i2, Object3D[] object3DArr, int i3, int i4) {
        int iM210a;
        int iMo0a = super.mo0a(i, i2, object3DArr, i3);
        if (object3DArr != null && object3DArr.length <= iMo0a) {
            return iMo0a;
        }
        for (int i5 = 0; i5 < this.f223a; i5++) {
            iMo0a = this.f224b[i5].mo0a(i, i2, object3DArr, iMo0a);
            if (object3DArr != null && object3DArr.length <= iMo0a) {
                return iMo0a;
            }
        }
        if (this.f225c != null) {
            iMo0a = this.f225c.mo0a(i, i2, object3DArr, iMo0a);
            if (object3DArr != null && object3DArr.length <= iMo0a) {
                return iMo0a;
            }
        }
        if (this.f229g != null) {
            iMo0a = this.f229g.mo0a(i, i2, object3DArr, iMo0a);
            if (object3DArr != null && object3DArr.length <= iMo0a) {
                return iMo0a;
            }
        }
        if (this.f227e != null) {
            iMo0a = this.f227e.mo0a(i, i2, object3DArr, iMo0a);
            if (object3DArr != null && object3DArr.length <= iMo0a) {
                return iMo0a;
            }
        }
        if (this.f228f != null) {
            iMo0a = this.f228f.mo0a(i, i2, object3DArr, iMo0a);
            if (object3DArr != null && object3DArr.length <= iMo0a) {
                return iMo0a;
            }
        }
        if (this.f231q != null) {
            iM210a = this.f231q.mo0a(i, i2, object3DArr, iMo0a);
            if (object3DArr != null && object3DArr.length <= iM210a) {
                return iM210a;
            }
        } else {
            iM210a = iMo0a;
        }
        if (this.f226d != null) {
            iM210a = this.f226d.m210a(i, i2, object3DArr, iM210a, i4);
            if (object3DArr != null && object3DArr.length <= iM210a) {
                return iM210a;
            }
        }
        return iM210a;
    }

    /* JADX INFO: renamed from: a */
    final void m109a(GraphicsOGL graphicsOGL, Graphics3D graphics3D, int i) {
        int i2 = 0;
        NodeDeformer nodeDeformer = this.f226d;
        VertexBuffer vertexBuffer = this.f225c;
        short s = this.f223a;
        if (this.f222F) {
            if (this.f230p != null) {
                for (int i3 = 0; i3 < s; i3++) {
                    this.f230p[i3].m490a(graphics3D, graphicsOGL);
                }
                this.f230p = null;
            } else {
                for (int i4 = 0; i4 < s; i4++) {
                    this.f224b[i4].f317D.m503a(graphics3D, graphicsOGL);
                    this.f224b[i4].f317D = null;
                }
            }
            if (vertexBuffer != null) {
                vertexBuffer.f551x.m503a(graphics3D, graphicsOGL);
                vertexBuffer.f551x = null;
                if (vertexBuffer.f553z != null) {
                    vertexBuffer.f553z.m503a(graphics3D, graphicsOGL);
                    vertexBuffer.f553z = null;
                }
            }
            this.f222F = false;
        }
        if (nodeDeformer == null) {
            return;
        }
        while (true) {
            int i5 = i2;
            if (i5 >= nodeDeformer.f390c) {
                return;
            }
            Object3D object3D = nodeDeformer.f392e[i5].f671a;
            if (object3D != null) {
                switch (object3D.f400h) {
                    case 9:
                        ((Figure) object3D).m109a(graphicsOGL, graphics3D, i + 1);
                        break;
                }
            }
            i2 = i5 + 1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    final void m110a(BufferPool bufferPool, BufferPool bufferPool2, GraphicsOGL graphicsOGL, Graphics3D graphics3D, TransformTree transformTree, C0104dv c0104dv, C0104dv c0104dv2, int i) throws IllegalStateException {
        if (this.f229g != null) {
            transformTree = this.f229g;
        }
        BoneDeformer boneDeformer = this.f227e;
        NodeDeformer nodeDeformer = this.f226d;
        VertexBuffer vertexBuffer = this.f225c;
        int i2 = this.f223a;
        if (this.f222F) {
            throw new IllegalStateException();
        }
        if (i2 > 0) {
            if (boneDeformer == null || transformTree == null || this.f228f != null) {
                for (int i3 = 0; i3 < i2; i3++) {
                    c0104dv2.m501a(bufferPool2, graphicsOGL, graphics3D.f309h, this.f224b[i3]);
                    this.f224b[i3].f317D = c0104dv2;
                }
            } else {
                boneDeformer.m43a();
                this.f230p = new C0096dn[i2];
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= i2) {
                        break;
                    }
                    this.f230p[i5] = new C0096dn(bufferPool, bufferPool2, graphicsOGL, graphics3D.f309h, this.f224b[i5], boneDeformer, false, c0104dv, c0104dv2, false);
                    i4 = i5 + 1;
                }
            }
        }
        if (vertexBuffer != null) {
            if (boneDeformer == null || transformTree == null) {
                c0104dv.m497a(graphicsOGL, graphics3D, vertexBuffer, (BoneDeformer) null);
                vertexBuffer.f551x = c0104dv;
            } else {
                c0104dv.m497a(graphicsOGL, graphics3D, vertexBuffer, boneDeformer);
                vertexBuffer.f551x = c0104dv;
            }
        }
        if (nodeDeformer != null) {
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i7 < nodeDeformer.f390c) {
                    Object3D object3D = nodeDeformer.f392e[i7].f671a;
                    if (object3D != null) {
                        switch (object3D.f400h) {
                            case 9:
                                if (i >= 4) {
                                    return;
                                } else {
                                    ((Figure) object3D).m110a(bufferPool, bufferPool2, graphicsOGL, graphics3D, transformTree, c0104dv, c0104dv2, i + 1);
                                }
                                break;
                        }
                    }
                    i6 = i7 + 1;
                }
            }
        }
        this.f222F = true;
    }

    /* JADX INFO: renamed from: a */
    final void m111a(Figure figure, Graphics3D graphics3D, TransformTree transformTree, Transform transform, boolean z, int i) {
        boolean z2 = true;
        if (this.f229g != null) {
            transformTree = this.f229g;
        }
        BoneDeformer boneDeformer = this.f227e;
        NodeDeformer nodeDeformer = this.f226d;
        VertexBuffer vertexBuffer = this.f225c;
        if (this.f407o) {
            if (vertexBuffer != null && z) {
                boolean z3 = (graphics3D.f302a || figure.f238x) && vertexBuffer.f541f[1] != null;
                if (boneDeformer == null || transformTree == null) {
                    graphics3D.f308g.m511a(this, figure, transform, 0, z3, this.f220D, true);
                } else {
                    boneDeformer.m47a(transformTree, vertexBuffer.f539d[0] || vertexBuffer.f539d[1]);
                    if (z3) {
                        boneDeformer.m62d();
                        vertexBuffer.f527F = boneDeformer.f147g;
                    } else {
                        vertexBuffer.f527F = false;
                    }
                    if (this.f228f != null) {
                        z2 = false;
                    } else if (this.f230p == null) {
                        boneDeformer.m59b(vertexBuffer);
                        if (z3) {
                            boneDeformer.m61c(vertexBuffer);
                        }
                    }
                    graphics3D.f308g.m511a(this, figure, f217z, 0, z3, false, z2);
                }
                if (graphics3D.f311j) {
                    m106a(graphics3D);
                }
            }
            if (nodeDeformer != null) {
                nodeDeformer.m212a(figure, graphics3D, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m112a(Figure figure, Graphics3D graphics3D, TransformTree transformTree, Transform transform, boolean z, int i, int i2) {
        if (this.f229g != null) {
            transformTree = this.f229g;
        }
        BoneDeformer boneDeformer = this.f227e;
        NodeDeformer nodeDeformer = this.f226d;
        VertexBuffer vertexBuffer = this.f225c;
        if (this.f407o) {
            if (vertexBuffer != null && z) {
                boolean z2 = (graphics3D.f302a || figure.f238x) && vertexBuffer.f541f[1] != null;
                if (boneDeformer == null || transformTree == null) {
                    graphics3D.f308g.m511a(this, figure, transform, i, z2, this.f220D, false);
                } else {
                    boneDeformer.m46a(transformTree, i);
                    boneDeformer.m47a(transformTree, vertexBuffer.f539d[0] || vertexBuffer.f539d[1]);
                    if (z2 && this.f230p == null) {
                        boneDeformer.m62d();
                        vertexBuffer.f527F = boneDeformer.f147g;
                    } else {
                        vertexBuffer.f527F = false;
                    }
                    graphics3D.f308g.m511a(this, figure, f217z, i, z2, false, false);
                }
                if (graphics3D.f311j) {
                    m106a(graphics3D);
                }
            }
            if (nodeDeformer != null) {
                nodeDeformer.m213a(figure, graphics3D, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m113a(Figure figure, TransformTree transformTree, Transform transform, int i) {
        boolean z = this.f229g != null;
        if (z) {
            transformTree = this.f229g;
        }
        NodeDeformer nodeDeformer = this.f226d;
        MorphDeformer morphDeformer = this.f228f;
        if (this.f407o) {
            if (this.f223a > 0) {
                for (int i2 = 0; i2 < this.f223a; i2++) {
                    Appearance appearance = this.f224b[i2].f352y;
                    if (appearance != null) {
                        if (appearance.m8b()) {
                            appearance.updatePosture();
                        }
                        figure.f238x = appearance.m28c();
                    }
                    if (this.f224b[i2].f349v != null) {
                        this.f224b[i2].f349v.m135d(transform);
                    }
                }
            }
            if (this.f233s != null) {
                this.f233s.m135d(transform);
            }
            if (morphDeformer != null && morphDeformer.m8b()) {
                morphDeformer.updatePosture();
            }
            if (transformTree != null) {
                if (z) {
                    transformTree.m287d(transform);
                }
                if (transformTree.m8b()) {
                    transformTree.updatePosture();
                    transformTree.relatedMultiply();
                    transformTree.f506p = false;
                } else if (transformTree.f506p) {
                    transformTree.relatedMultiply();
                    transformTree.f506p = false;
                }
                if (nodeDeformer != null) {
                    if (nodeDeformer.m8b()) {
                        nodeDeformer.updatePosture();
                    }
                    nodeDeformer.m211a(figure, i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m114a(Graphics3D graphics3D, GraphicsOGL graphicsOGL, int i, int i2) {
        if (!this.f239y) {
            if (this.f223a > 0) {
                if (this.f230p != null) {
                    for (int i3 = 0; i3 < this.f223a; i3++) {
                        if ((i & 1) != 0) {
                            this.f230p[i3].m489a();
                        }
                    }
                }
                for (int i4 = 0; i4 < this.f223a; i4++) {
                    if ((i & 2) != 0) {
                        graphics3D.m149a(graphicsOGL, this.f224b[i4]);
                    }
                    if ((i & 1) != 0) {
                        this.f224b[i4].purgeBuffer();
                    }
                }
            }
            if (this.f225c != null) {
                if ((i & 2) != 0) {
                    graphics3D.m150a(graphicsOGL, this.f225c, this.f227e, this.f230p != null);
                    this.f225c.m338b();
                }
                if ((i & 1) != 0) {
                    this.f225c.purgeBuffer();
                }
            }
            if ((i & 1) != 0) {
                this.f239y = true;
            }
        }
        if (this.f226d != null) {
            for (int i5 = 0; i5 < this.f226d.f390c; i5++) {
                Object3D object3D = this.f226d.f392e[i5].f671a;
                if (object3D != null) {
                    switch (object3D.f400h) {
                        case 9:
                            ((Figure) object3D).m114a(graphics3D, graphicsOGL, i, i2 + 1);
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m115a(TextureTable textureTable, int i) {
        Texture textureFindTexture;
        NodeDeformer nodeDeformer = this.f226d;
        if (this.f225c != null) {
            for (int i2 = 0; i2 < this.f223a; i2++) {
                Appearance appearance = this.f224b[i2].getAppearance();
                if (appearance != null) {
                    if (textureTable != null) {
                        for (int i3 = 0; i3 < 2; i3++) {
                            int textureRefGid = appearance.getTextureRefGid(i3);
                            if (textureRefGid != -1 && (textureFindTexture = textureTable.findTexture(textureRefGid)) != null) {
                                appearance.setTexture(i3, textureFindTexture);
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < 2; i4++) {
                            appearance.setTexture(i4, null);
                        }
                    }
                }
            }
        }
        if (nodeDeformer != null) {
            nodeDeformer.m214a(textureTable, i);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m116a(TransformTree transformTree, float f, int i) {
        if (this.f229g != null) {
            transformTree = this.f229g;
        }
        NodeDeformer nodeDeformer = this.f226d;
        MorphDeformer morphDeformer = this.f228f;
        if (transformTree != null) {
            transformTree.setFrame(f);
        }
        if (this.f224b != null) {
            for (int i2 = 0; i2 < this.f223a; i2++) {
                Appearance appearance = this.f224b[i2].f352y;
                if (appearance != null) {
                    appearance.setFrame(f);
                }
            }
        }
        if (nodeDeformer != null) {
            nodeDeformer.setFrame(f);
        }
        if (morphDeformer != null) {
            morphDeformer.setFrame(f);
        }
        if (transformTree != null && nodeDeformer != null) {
            nodeDeformer.m215a(transformTree, f, i);
        }
        this.f218B = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    final void m117a(TransformTree transformTree, Transform transform, C0105dw c0105dw, boolean z, int i) {
        boolean z2 = true;
        int i2 = 0;
        if ((this.f229g != null) != false) {
            transformTree = this.f229g;
        }
        BoneDeformer boneDeformer = this.f227e;
        MorphDeformer morphDeformer = this.f228f;
        NodeDeformer nodeDeformer = this.f226d;
        VertexBuffer vertexBuffer = this.f225c;
        if (this.f407o) {
            if (vertexBuffer != null && z) {
                if (((c0105dw.f928e & 12) == 0 || this.f233s == null) && ((c0105dw.f928e & 4) == 0 || !this.f221E)) {
                    if (boneDeformer != null && transformTree != null && morphDeformer != null) {
                        C0059cd c0059cdM200b = morphDeformer.m200b(0);
                        if (!vertexBuffer.f539d[0] && !vertexBuffer.f539d[1]) {
                            z2 = false;
                        }
                        boneDeformer.m47a(transformTree, z2);
                        while (true) {
                            int i3 = i2;
                            if (i3 >= this.f223a) {
                                break;
                            }
                            boneDeformer.m45a(morphDeformer, this.f224b[i3], vertexBuffer, boneDeformer.f145e, c0059cdM200b);
                            i2 = i3 + 1;
                        }
                    } else if (boneDeformer != null && transformTree != null) {
                        boneDeformer.m47a(transformTree, vertexBuffer.f539d[0] || vertexBuffer.f539d[1]);
                        boneDeformer.m59b(vertexBuffer);
                    } else if (morphDeformer != null) {
                        C0059cd c0059cdM200b2 = morphDeformer.m200b(0);
                        for (int i4 = 0; i4 < this.f223a; i4++) {
                            morphDeformer.m194a(this.f224b[i4], vertexBuffer, c0059cdM200b2);
                        }
                    }
                    if (boneDeformer != null) {
                        Collision3D.m75a(this, (Transform) null, c0105dw);
                    } else {
                        Collision3D.m75a(this, transform, c0105dw);
                    }
                } else {
                    Collision3D.m75a(this, transform, c0105dw);
                }
            }
            if (nodeDeformer != null) {
                nodeDeformer.m216a(c0105dw, i);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    /* JADX INFO: renamed from: a */
    final void m118a(int[] iArr, Graphics3D graphics3D, TransformTree transformTree, int i) throws IllegalStateException {
        int i2 = 0;
        if (this.f229g != null) {
            transformTree = this.f229g;
        }
        BoneDeformer boneDeformer = this.f227e;
        NodeDeformer nodeDeformer = this.f226d;
        VertexBuffer vertexBuffer = this.f225c;
        short s = this.f223a;
        if (this.f222F) {
            throw new IllegalStateException();
        }
        if (s > 0) {
            if (boneDeformer == null || transformTree == null || this.f228f != null) {
                for (int i3 = 0; i3 < s; i3++) {
                    iArr[1] = iArr[1] + C0104dv.m494a(this.f224b[i3]);
                }
            } else {
                for (int i4 = 0; i4 < s; i4++) {
                    C0096dn.m486a(iArr, graphics3D.f309h, this.f224b[i4], boneDeformer, false);
                }
            }
        }
        if (vertexBuffer != null) {
            if (boneDeformer == null || transformTree == null) {
                iArr[0] = iArr[0] + C0104dv.m495a(vertexBuffer, (BoneDeformer) null, 0);
            } else {
                iArr[0] = iArr[0] + C0104dv.m495a(vertexBuffer, boneDeformer, graphics3D.f309h.f635b.f747b);
            }
        }
        if (nodeDeformer == null) {
            return;
        }
        while (true) {
            int i5 = i2;
            if (i5 >= nodeDeformer.f390c) {
                return;
            }
            Object3D object3D = nodeDeformer.f392e[i5].f671a;
            if (object3D != null) {
                switch (object3D.f400h) {
                    case 9:
                        if (i >= 4) {
                            return;
                        } else {
                            ((Figure) object3D).m118a(iArr, graphics3D, transformTree, i + 1);
                        }
                        break;
                }
            }
            i2 = i5 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX INFO: renamed from: a */
    final boolean m119a(C0074cs c0074cs, boolean z, int i) throws Throwable {
        boolean z2;
        Vector3D vector3D;
        GeometricShape geometricShape;
        NodeDeformer nodeDeformer = this.f226d;
        if (!this.f407o) {
            return false;
        }
        if (z) {
            try {
                Vector3D vector3DM439a = C0046br.m439a();
                try {
                    float[] fArr = f216A;
                    if (((c0074cs.f818f ^ (-1)) & 2) == 0 || (geometricShape = this.f233s) == null) {
                        z2 = false;
                    } else {
                        geometricShape.m132a(vector3DM439a, fArr);
                        if (Collision3D.m81a(c0074cs.f813a, c0074cs.f814b, c0074cs.f815c, vector3DM439a, fArr[0])) {
                            if (c0074cs.f816d == null) {
                                c0074cs.f817e++;
                            } else if (c0074cs.f817e < c0074cs.f816d.length) {
                                GeometricShape[] geometricShapeArr = c0074cs.f816d;
                                int i2 = c0074cs.f817e;
                                c0074cs.f817e = i2 + 1;
                                geometricShapeArr[i2] = geometricShape;
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (((c0074cs.f818f ^ (-1)) & 4) != 0) {
                        for (int i3 = 0; i3 < this.f223a; i3++) {
                            GeometricShape geometricShape2 = this.f224b[i3].f349v;
                            if (geometricShape2 != null) {
                                geometricShape2.m132a(vector3DM439a, fArr);
                                if (Collision3D.m81a(c0074cs.f813a, c0074cs.f814b, c0074cs.f815c, vector3DM439a, fArr[0])) {
                                    if (c0074cs.f816d == null) {
                                        c0074cs.f817e++;
                                    } else if (c0074cs.f817e < c0074cs.f816d.length) {
                                        GeometricShape[] geometricShapeArr2 = c0074cs.f816d;
                                        int i4 = c0074cs.f817e;
                                        c0074cs.f817e = i4 + 1;
                                        geometricShapeArr2[i4] = geometricShape2;
                                    }
                                    z2 = true;
                                }
                            }
                        }
                    }
                    C0046br.m440a(vector3DM439a);
                } catch (Throwable th) {
                    th = th;
                    vector3D = vector3DM439a;
                    C0046br.m440a(vector3D);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                vector3D = null;
            }
        } else {
            z2 = false;
        }
        if (nodeDeformer == null || !nodeDeformer.m218a(c0074cs, i)) {
            return z2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX INFO: renamed from: a */
    final boolean m120a(C0102dt c0102dt, boolean z, int i) throws Throwable {
        Vector3D vector3D;
        boolean z2;
        GeometricShape geometricShape;
        NodeDeformer nodeDeformer = this.f226d;
        if (!this.f407o) {
            return false;
        }
        if (z) {
            try {
                Vector3D vector3DM439a = C0046br.m439a();
                try {
                    float[] fArr = f216A;
                    if (((c0102dt.f919e ^ (-1)) & 2) == 0 || (geometricShape = this.f233s) == null) {
                        z2 = false;
                    } else {
                        geometricShape.m132a(vector3DM439a, fArr);
                        if (Collision3D.m78a(c0102dt.f915a, c0102dt.f916b, vector3DM439a, fArr[0], (boolean[]) null)) {
                            if (c0102dt.f917c == null) {
                                c0102dt.f918d++;
                            } else if (c0102dt.f918d < c0102dt.f917c.length) {
                                GeometricShape[] geometricShapeArr = c0102dt.f917c;
                                int i2 = c0102dt.f918d;
                                c0102dt.f918d = i2 + 1;
                                geometricShapeArr[i2] = geometricShape;
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (((c0102dt.f919e ^ (-1)) & 4) != 0) {
                        for (int i3 = 0; i3 < this.f223a; i3++) {
                            GeometricShape geometricShape2 = this.f224b[i3].f349v;
                            if (geometricShape2 != null) {
                                geometricShape2.m132a(vector3DM439a, fArr);
                                if (Collision3D.m78a(c0102dt.f915a, c0102dt.f916b, vector3DM439a, fArr[0], (boolean[]) null)) {
                                    if (c0102dt.f917c == null) {
                                        c0102dt.f918d++;
                                    } else if (c0102dt.f918d < c0102dt.f917c.length) {
                                        GeometricShape[] geometricShapeArr2 = c0102dt.f917c;
                                        int i4 = c0102dt.f918d;
                                        c0102dt.f918d = i4 + 1;
                                        geometricShapeArr2[i4] = geometricShape2;
                                    }
                                    z2 = true;
                                }
                            }
                        }
                    }
                    C0046br.m440a(vector3DM439a);
                } catch (Throwable th) {
                    th = th;
                    vector3D = vector3DM439a;
                    C0046br.m440a(vector3D);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                vector3D = null;
            }
        } else {
            z2 = false;
        }
        if (nodeDeformer == null || !nodeDeformer.m219a(c0102dt, i)) {
            return z2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX INFO: renamed from: a */
    final boolean m121a(C0109h c0109h, boolean z, int i) throws Throwable {
        boolean z2;
        Vector3D vector3D;
        GeometricShape geometricShape;
        NodeDeformer nodeDeformer = this.f226d;
        if (!this.f407o) {
            return false;
        }
        if (z) {
            try {
                Vector3D vector3DM439a = C0046br.m439a();
                try {
                    float[] fArr = f216A;
                    if (((c0109h.f956e ^ (-1)) & 2) == 0 || (geometricShape = this.f233s) == null) {
                        z2 = false;
                    } else {
                        geometricShape.m132a(vector3DM439a, fArr);
                        if (Collision3D.m79a(c0109h.f952a, c0109h.f953b, vector3DM439a, fArr[0])) {
                            if (c0109h.f954c == null) {
                                c0109h.f955d++;
                            } else if (c0109h.f955d < c0109h.f954c.length) {
                                GeometricShape[] geometricShapeArr = c0109h.f954c;
                                int i2 = c0109h.f955d;
                                c0109h.f955d = i2 + 1;
                                geometricShapeArr[i2] = geometricShape;
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (((c0109h.f956e ^ (-1)) & 4) != 0) {
                        for (int i3 = 0; i3 < this.f223a; i3++) {
                            GeometricShape geometricShape2 = this.f224b[i3].f349v;
                            if (geometricShape2 != null) {
                                geometricShape2.m132a(vector3DM439a, fArr);
                                if (Collision3D.m79a(c0109h.f952a, c0109h.f953b, vector3DM439a, fArr[0])) {
                                    if (c0109h.f954c == null) {
                                        c0109h.f955d++;
                                    } else if (c0109h.f955d < c0109h.f954c.length) {
                                        GeometricShape[] geometricShapeArr2 = c0109h.f954c;
                                        int i4 = c0109h.f955d;
                                        c0109h.f955d = i4 + 1;
                                        geometricShapeArr2[i4] = geometricShape2;
                                    }
                                    z2 = true;
                                }
                            }
                        }
                    }
                    C0046br.m440a(vector3DM439a);
                } catch (Throwable th) {
                    th = th;
                    vector3D = vector3DM439a;
                    C0046br.m440a(vector3D);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                vector3D = null;
            }
        } else {
            z2 = false;
        }
        if (nodeDeformer == null || !nodeDeformer.m220a(c0109h, i)) {
            return z2;
        }
        return true;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void addSiblingNode(NodeDeformerNode nodeDeformerNode, Transform transform) {
        super.m223a(nodeDeformerNode, transform);
    }

    /* JADX INFO: renamed from: b */
    final void m122b(int i) {
        if (this.f229g != null) {
            this.f229g.reset();
        }
        if (this.f226d == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f226d.f390c) {
                return;
            }
            Object3D object3D = this.f226d.f392e[i3].f671a;
            if (object3D != null) {
                switch (object3D.f400h) {
                    case 9:
                        ((Figure) object3D).m122b(i + 1);
                        break;
                }
            }
            i2 = i3 + 1;
        }
    }

    public final void bindAction(ActionTable actionTable) {
        m105a(actionTable, 1);
    }

    public final void bindTexture(TextureTable textureTable) {
        m115a(textureTable, 1);
    }

    public final Appearance getAppearance() {
        return this.f237w;
    }

    public final BoneDeformer getBoneDeformer() {
        return this.f227e;
    }

    public final Camera getCamera() {
        return this.f231q;
    }

    public final float getFrame() {
        return this.f218B;
    }

    public final GeometricShape getGeometricShape() {
        return this.f233s;
    }

    public final IndexBuffer getIndexBuffer(int i) {
        if (i < 0 || i >= this.f223a) {
            throw new IllegalArgumentException();
        }
        return this.f224b[i];
    }

    public final IndexBuffer[] getIndexBuffer() {
        for (int i = 0; i < this.f223a; i++) {
            this.f219C[i] = this.f224b[i];
        }
        return this.f219C;
    }

    public final int getIndexNum() {
        return this.f223a;
    }

    public final MorphDeformer getMorphDeformer() {
        return this.f228f;
    }

    public final NodeDeformer getNodeDeformer() {
        return this.f226d;
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

    public final TransformTree getTransformTree() {
        return this.f229g;
    }

    public final VertexBuffer getVertexBuffer() {
        return this.f225c;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final boolean isVisible() {
        return super.m232g();
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void mulScale(Vector3D vector3D) {
        super.m228b(vector3D);
    }

    public final void multiVertexColors(float f, float f2, float f3, float f4) {
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            throw new IllegalArgumentException();
        }
        m104a(f, f2, f3, f4, 1);
    }

    public final boolean pick(Vector3D vector3D, Vector3D vector3D2, IntersectionAttributes intersectionAttributes, int i, boolean z, Transform transform) {
        if (vector3D == null || vector3D2 == null) {
            throw new NullPointerException();
        }
        if (vector3D2.f516a == 0.0f && vector3D2.f517b == 0.0f && vector3D2.f518c == 0.0f) {
            throw new IllegalArgumentException();
        }
        Vector3D vector3D3 = new Vector3D();
        Vector3D vector3D4 = new Vector3D();
        transform.m262a(vector3D, vector3D3);
        transform.m268b(vector3D2, vector3D4);
        updatePosture(transform);
        if (intersectionAttributes != null) {
            intersectionAttributes.m172a();
        }
        return new Pick().m241a(this, vector3D3, vector3D4, intersectionAttributes, i, z, this.f229g, transform, true, 1);
    }

    public final void purgeBufferAll() {
        m114a((Graphics3D) null, (GraphicsOGL) null, 1, 1);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void removeFromParent() {
        super.m231f();
    }

    public final void setAppearance(Appearance appearance) {
        this.f237w = appearance;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void setBoneDeformer(BoneDeformer boneDeformer) throws IllegalStateException {
        int[] iArr = new int[8];
        if (this.f225c == null) {
            throw new IllegalStateException();
        }
        if (this.f220D) {
            throw new IllegalStateException();
        }
        if (boneDeformer != null) {
            if (this.f229g != null && !boneDeformer.m53a(this.f229g)) {
                throw new IllegalArgumentException();
            }
            if (!boneDeformer.m54a(this.f225c)) {
                throw new IllegalArgumentException();
            }
            int iM325a = this.f225c.m325a(this.f228f != null ? this.f228f.m202c(127) : 15, iArr);
            if (iM325a != 0) {
                this.f225c.m330a(iM325a, iArr, boneDeformer, false);
            }
            for (int i = 0; i < this.f223a; i++) {
                this.f224b[i].m161a(boneDeformer);
            }
            this.f225c.m331a(boneDeformer);
            boneDeformer.f146f = this.f229g;
        }
        if (this.f227e != null) {
            this.f227e.f146f = null;
        }
        this.f227e = boneDeformer;
    }

    public final void setCamera(Camera camera) {
        this.f231q = camera;
        this.f232r = null;
    }

    public final void setFrame(float f) {
        m116a((TransformTree) null, f, 1);
    }

    public final void setGeometricShape(GeometricShape geometricShape) {
        if (geometricShape != null && geometricShape.f257a != 1) {
            throw new IllegalArgumentException();
        }
        if (geometricShape != null && geometricShape.f259c != null) {
            throw new IllegalArgumentException();
        }
        if (this.f225c == null) {
            throw new IllegalArgumentException();
        }
        if (this.f233s != null) {
            this.f233s.f259c = null;
            this.f233s = null;
        }
        this.f233s = geometricShape;
        if (geometricShape != null) {
            geometricShape.f259c = this;
        }
        this.f221E = Collision3D.m76a(this);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setIdentity() {
        super.m230e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void setMorphDeformer(MorphDeformer morphDeformer) throws IllegalStateException {
        int[] iArr = new int[8];
        if (this.f225c == null) {
            throw new IllegalStateException();
        }
        if (this.f220D) {
            throw new IllegalStateException();
        }
        if (morphDeformer != null) {
            if (!morphDeformer.m199a(this.f225c)) {
                throw new IllegalArgumentException();
            }
            int iM325a = this.f225c.m325a(morphDeformer.m202c(127), iArr);
            if (iM325a != 0) {
                this.f225c.m330a(iM325a, iArr, this.f227e, false);
            }
            if (this.f227e == null) {
                for (int i = 0; i < this.f223a; i++) {
                    this.f224b[i].m161a((BoneDeformer) null);
                }
            }
            morphDeformer.m196a(this.f225c, this.f224b);
            this.f225c.m331a(this.f227e);
        }
        this.f228f = morphDeformer;
    }

    public final void setNodeDeformer(NodeDeformer nodeDeformer) {
        if (nodeDeformer != null) {
            if (this.f229g != null && !nodeDeformer.m217a(this.f229g)) {
                throw new IllegalArgumentException();
            }
            nodeDeformer.f394g = this.f229g;
        }
        if (this.f226d != null) {
            this.f226d.f394g = null;
        }
        this.f226d = nodeDeformer;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setRotateEuler(int i, Vector3D vector3D) {
        super.m222a(i, vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setTransform(Transform transform) {
        super.m227b(transform);
    }

    public final void setTransformTree(TransformTree transformTree) {
        if (this.f229g != null) {
            if (this.f226d != null) {
                this.f226d.f394g = null;
            }
            if (this.f227e != null) {
                this.f227e.f146f = null;
            }
        }
        if (transformTree != null) {
            if (this.f226d != null) {
                if (!this.f226d.m217a(transformTree)) {
                    throw new IllegalArgumentException();
                }
                this.f226d.f394g = transformTree;
            }
            if (this.f227e != null) {
                if (!this.f227e.m53a(transformTree)) {
                    if (this.f226d != null) {
                        this.f226d.f394g = null;
                    }
                    throw new IllegalArgumentException();
                }
                this.f227e.f146f = transformTree;
            }
            transformTree.f506p = true;
        }
        this.f229g = transformTree;
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setTranslate(Vector3D vector3D) {
        super.m225a(vector3D);
    }

    @Override // com.mascotcapsule.eruption.docomostar.NodeDeformerNode
    public final void setVisible(boolean z) {
        super.m226a(z);
    }

    public final void updatePosture(Transform transform) {
        this.f236v = 0;
        if (transform == null) {
            m113a(this, (TransformTree) null, f217z, 1);
        } else {
            m113a(this, (TransformTree) null, transform, 1);
        }
    }
}
