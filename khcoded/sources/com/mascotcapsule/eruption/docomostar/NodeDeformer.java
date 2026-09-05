package com.mascotcapsule.eruption.docomostar;

import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class NodeDeformer extends Animatable {

    /* JADX INFO: renamed from: p */
    private static final float[] f389p = new float[1];

    /* JADX INFO: renamed from: c */
    short f390c;

    /* JADX INFO: renamed from: d */
    short f391d;

    /* JADX INFO: renamed from: e */
    C0017ap[] f392e;

    /* JADX INFO: renamed from: f */
    short[] f393f;

    /* JADX INFO: renamed from: g */
    TransformTree f394g;

    /* JADX INFO: renamed from: q */
    private short f395q;

    /* JADX INFO: renamed from: r */
    private short f396r;

    /* JADX INFO: renamed from: s */
    private Vector f397s;

    /* JADX INFO: renamed from: t */
    private Vector f398t;

    public NodeDeformer(int i) {
        super(7);
        if (i <= 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        m206b(i);
    }

    /* JADX INFO: renamed from: a */
    private final void m204a(int i, Object3D object3D) {
        int i2;
        short s;
        if (object3D.f400h == 9) {
            i2 = 0;
            s = this.f391d;
        } else if (object3D.f400h == 20) {
            i2 = this.f391d;
            s = this.f396r;
        } else {
            i2 = this.f396r;
            s = this.f395q;
        }
        while (i2 < s) {
            if (((Short) this.f398t.elementAt(i2)).shortValue() > i) {
                this.f398t.insertElementAt(new Short((short) i), i2);
                this.f395q = (short) this.f398t.size();
                if (object3D.f400h == 9) {
                    this.f391d = (short) (this.f391d + 1);
                    this.f396r = (short) (this.f396r + 1);
                    return;
                } else {
                    if (object3D.f400h == 20) {
                        this.f396r = (short) (this.f396r + 1);
                        return;
                    }
                    return;
                }
            }
            i2++;
        }
        this.f398t.insertElementAt(new Short((short) i), i2);
        this.f395q = (short) this.f398t.size();
        if (object3D.f400h == 9) {
            this.f391d = (short) (this.f391d + 1);
            this.f396r = (short) (this.f396r + 1);
        } else if (object3D.f400h == 20) {
            this.f396r = (short) (this.f396r + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m205a(Graphics3D graphics3D, int i) {
        while (i < this.f396r) {
            C0017ap c0017ap = this.f392e[this.f393f[i]];
            if (c0017ap.f671a.f400h == 20 && c0017ap.f675e) {
                GeometricShape geometricShape = (GeometricShape) c0017ap.f671a;
                if ((graphics3D.f310i & Graphics3D.SHOW_DEBUG_ALL_BS) != 0 || ((graphics3D.f310i & Graphics3D.SHOW_DEBUG_BS) != 0 && geometricShape.f258b)) {
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (graphics3D.f307f[geometricShape.f257a][i2] != null) {
                            graphics3D.f308g.m513a(graphics3D.f306e[geometricShape.f257a], graphics3D.f307f[geometricShape.f257a][i2], geometricShape.m134c(i2), 0, false, false, true);
                        }
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m206b(int i) {
        super.mo3a();
        this.f390c = (short) i;
        this.f397s = new Vector(i, 4);
        for (int i2 = 0; i2 < i; i2++) {
            this.f397s.addElement(new C0017ap());
        }
        this.f398t = new Vector(0, 32);
        m208c();
        m209d();
    }

    /* JADX INFO: renamed from: b */
    private final void m207b(int i, Object3D object3D) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f395q) {
                return;
            }
            if (((Short) this.f398t.elementAt(i3)).shortValue() == i) {
                this.f398t.removeElementAt(i3);
                this.f395q = (short) this.f398t.size();
                if (object3D.f400h == 9) {
                    this.f391d = (short) (this.f391d - 1);
                    this.f396r = (short) (this.f396r - 1);
                    return;
                } else {
                    if (object3D.f400h == 20) {
                        this.f396r = (short) (this.f396r - 1);
                        return;
                    }
                    return;
                }
            }
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m208c() {
        int size = this.f397s.size();
        this.f392e = new C0017ap[size];
        for (int i = 0; i < size; i++) {
            this.f392e[i] = (C0017ap) this.f397s.elementAt(i);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m209d() {
        int size = this.f398t.size();
        this.f393f = new short[size];
        for (int i = 0; i < size; i++) {
            this.f393f[i] = ((Short) this.f398t.elementAt(i)).shortValue();
        }
    }

    public static final boolean isNode(Object obj) {
        return obj instanceof NodeDeformerNode;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable, com.mascotcapsule.eruption.docomostar.Object3D
    /* JADX INFO: renamed from: a */
    final int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        return m210a(i, i2, object3DArr, i3, 0);
    }

    /* JADX INFO: renamed from: a */
    final int m210a(int i, int i2, Object3D[] object3DArr, int i3, int i4) {
        int iMo0a = super.mo0a(i, i2, object3DArr, i3);
        if (object3DArr == null || object3DArr.length > iMo0a) {
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 < this.f390c) {
                    Object3D object3D = this.f392e[i6].f671a;
                    if (object3D != null) {
                        switch (object3D.f400h) {
                            case 9:
                                if (i4 < 4) {
                                    iMo0a = ((Figure) object3D).m108a(i, i2, object3DArr, iMo0a, i4 + 1);
                                    if (object3DArr != null && object3DArr.length <= iMo0a) {
                                    }
                                }
                                break;
                            default:
                                iMo0a = object3D.mo0a(i, i2, object3DArr, iMo0a);
                                if (object3DArr != null && object3DArr.length <= iMo0a) {
                                }
                                break;
                        }
                    }
                    i5 = i6 + 1;
                }
            }
        }
        return iMo0a;
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo4a(Action action) {
        if (action.f84c != 5) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo5a(ActionController actionController) {
    }

    /* JADX INFO: renamed from: a */
    final void m211a(Figure figure, int i) {
        for (int i2 = 0; i2 < this.f395q; i2++) {
            C0017ap c0017ap = this.f392e[this.f393f[i2]];
            Object3D object3D = c0017ap.f671a;
            switch (object3D.f400h) {
                case 9:
                    if (i >= 4) {
                        return;
                    } else {
                        ((Figure) object3D).m113a(figure, this.f394g, c0017ap.m405a(this.f394g), i + 1);
                    }
                    break;
                case 15:
                    if (c0017ap.f675e && (figure.f231q == object3D || ((Camera) object3D).m73c())) {
                        Camera camera = (Camera) object3D;
                        if (camera.m8b()) {
                            camera.updatePosture();
                        }
                        figure.f232r = camera.m72a(this.f394g);
                    }
                    break;
                case 16:
                    if (c0017ap.f675e) {
                        Light light = (Light) object3D;
                        if (light.m8b()) {
                            light.updatePosture();
                        }
                        if (figure.f236v < 8) {
                            figure.f234t[figure.f236v] = light;
                            figure.f235u[figure.f236v] = light.m174a(this.f394g);
                            figure.f236v++;
                            if (!figure.f238x) {
                                figure.f238x = light.f363c != 0;
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m212a(Figure figure, Graphics3D graphics3D, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f391d) {
                if (graphics3D.f311j) {
                    m205a(graphics3D, i3);
                    return;
                }
                return;
            } else {
                C0017ap c0017ap = this.f392e[this.f393f[i3]];
                if (i >= 4) {
                    return;
                }
                ((Figure) c0017ap.f671a).m111a(figure, graphics3D, this.f394g, c0017ap.f673c, c0017ap.f675e, i + 1);
                i2 = i3 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m213a(Figure figure, Graphics3D graphics3D, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.f391d) {
                if (graphics3D.f311j) {
                    m205a(graphics3D, i4);
                    return;
                }
                return;
            } else {
                C0017ap c0017ap = this.f392e[this.f393f[i4]];
                if (i2 >= 4) {
                    return;
                }
                ((Figure) c0017ap.f671a).m112a(figure, graphics3D, this.f394g, c0017ap.f673c, c0017ap.f675e, i, i2 + 1);
                i3 = i4 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m214a(TextureTable textureTable, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f390c) {
                return;
            }
            Object3D object3D = this.f392e[i3].f671a;
            if (object3D != null) {
                switch (object3D.f400h) {
                    case 9:
                        if (i >= 4) {
                            return;
                        } else {
                            ((Figure) object3D).m115a(textureTable, i + 1);
                        }
                        break;
                }
            }
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m215a(TransformTree transformTree, float f, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f395q) {
                return;
            }
            Object3D object3D = this.f392e[this.f393f[i3]].f671a;
            switch (object3D.f400h) {
                case 9:
                    if (i >= 4) {
                        return;
                    } else {
                        ((Figure) object3D).m116a(transformTree, f, i + 1);
                    }
                    break;
                case 15:
                    ((Animatable) object3D).setFrame(f);
                    break;
                case 16:
                    ((Animatable) object3D).setFrame(f);
                    break;
            }
            i2 = i3 + 1;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo6a(C0097do c0097do, float f) {
        Action action = c0097do.f895a;
        short s = this.f395q;
        float[] fArr = {0.0f};
        for (int i = 0; i < s; i++) {
            short s2 = this.f393f[i];
            if (s2 >= action.f85d.length) {
                return;
            }
            C0019ar c0019ar = action.f85d[s2];
            C0017ap c0017ap = this.f392e[s2];
            if (isNode(c0017ap.f671a) && c0019ar.m410a(f, c0097do.f899e, c0097do.f897c[s2], fArr)) {
                c0017ap.f675e = fArr[0] > 0.5f;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m216a(C0105dw c0105dw, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f391d) {
                return;
            }
            C0017ap c0017ap = this.f392e[this.f393f[i3]];
            if (i >= 4) {
                return;
            }
            ((Figure) c0017ap.f671a).m117a(this.f394g, c0017ap.f673c, c0105dw, c0017ap.f675e, i + 1);
            i2 = i3 + 1;
        }
    }

    @Override // com.mascotcapsule.eruption.docomostar.Animatable
    /* JADX INFO: renamed from: a */
    final void mo7a(C0019ar[][] c0019arArr, float[][] fArr, C0033be[][] c0033beArr, float[][] fArr2, int i) {
    }

    /* JADX INFO: renamed from: a */
    final boolean m217a(TransformTree transformTree) {
        for (int i = 0; i < this.f390c; i++) {
            if (this.f392e[i].f674d >= transformTree.f501c) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    final boolean m218a(C0074cs c0074cs, int i) throws Throwable {
        boolean z;
        Vector3D vector3D = null;
        try {
            Vector3D vector3DM439a = C0046br.m439a();
            try {
                float[] fArr = f389p;
                int i2 = 0;
                boolean z2 = false;
                while (i2 < this.f395q) {
                    if (i >= 4) {
                        C0046br.m440a(vector3DM439a);
                        return false;
                    }
                    C0017ap c0017ap = this.f392e[this.f393f[i2]];
                    Object3D object3D = c0017ap.f671a;
                    if (object3D.f400h == 9) {
                        z = ((Figure) object3D).m119a(c0074cs, c0017ap.f675e, i + 1) ? true : z2;
                    } else {
                        if (object3D.f400h == 20 && ((c0074cs.f818f ^ (-1)) & 1) != 0) {
                            GeometricShape geometricShape = (GeometricShape) object3D;
                            if (geometricShape.f257a == 1) {
                                geometricShape.m132a(vector3DM439a, fArr);
                                if (Collision3D.m81a(c0074cs.f813a, c0074cs.f814b, c0074cs.f815c, vector3DM439a, fArr[0])) {
                                    if (c0074cs.f816d == null) {
                                        c0074cs.f817e++;
                                    } else if (c0074cs.f817e < c0074cs.f816d.length) {
                                        GeometricShape[] geometricShapeArr = c0074cs.f816d;
                                        int i3 = c0074cs.f817e;
                                        c0074cs.f817e = i3 + 1;
                                        geometricShapeArr[i3] = geometricShape;
                                    }
                                }
                            }
                        }
                    }
                    i2++;
                    z2 = z;
                }
                C0046br.m440a(vector3DM439a);
                return z2;
            } catch (Throwable th) {
                th = th;
                vector3D = vector3DM439a;
                C0046br.m440a(vector3D);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m219a(C0102dt c0102dt, int i) throws Throwable {
        boolean z;
        Vector3D vector3D = null;
        try {
            Vector3D vector3DM439a = C0046br.m439a();
            try {
                float[] fArr = f389p;
                int i2 = 0;
                boolean z2 = false;
                while (i2 < this.f395q) {
                    if (i >= 4) {
                        C0046br.m440a(vector3DM439a);
                        return false;
                    }
                    C0017ap c0017ap = this.f392e[this.f393f[i2]];
                    Object3D object3D = c0017ap.f671a;
                    if (object3D.f400h == 9) {
                        z = ((Figure) object3D).m120a(c0102dt, c0017ap.f675e, i + 1) ? true : z2;
                    } else {
                        if (object3D.f400h == 20 && ((c0102dt.f919e ^ (-1)) & 1) != 0) {
                            GeometricShape geometricShape = (GeometricShape) object3D;
                            if (geometricShape.f257a == 1) {
                                geometricShape.m132a(vector3DM439a, fArr);
                                if (Collision3D.m78a(c0102dt.f915a, c0102dt.f916b, vector3DM439a, fArr[0], (boolean[]) null)) {
                                    if (c0102dt.f917c == null) {
                                        c0102dt.f918d++;
                                    } else if (c0102dt.f918d < c0102dt.f917c.length) {
                                        GeometricShape[] geometricShapeArr = c0102dt.f917c;
                                        int i3 = c0102dt.f918d;
                                        c0102dt.f918d = i3 + 1;
                                        geometricShapeArr[i3] = geometricShape;
                                    }
                                }
                            }
                        }
                    }
                    i2++;
                    z2 = z;
                }
                C0046br.m440a(vector3DM439a);
                return z2;
            } catch (Throwable th) {
                th = th;
                vector3D = vector3DM439a;
                C0046br.m440a(vector3D);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m220a(C0109h c0109h, int i) throws Throwable {
        boolean z;
        Vector3D vector3D = null;
        try {
            Vector3D vector3DM439a = C0046br.m439a();
            try {
                float[] fArr = f389p;
                int i2 = 0;
                boolean z2 = false;
                while (i2 < this.f395q) {
                    if (i >= 4) {
                        C0046br.m440a(vector3DM439a);
                        return false;
                    }
                    C0017ap c0017ap = this.f392e[this.f393f[i2]];
                    Object3D object3D = c0017ap.f671a;
                    if (object3D.f400h == 9) {
                        z = ((Figure) object3D).m121a(c0109h, c0017ap.f675e, i + 1) ? true : z2;
                    } else {
                        if (object3D.f400h == 20 && ((c0109h.f956e ^ (-1)) & 1) != 0) {
                            GeometricShape geometricShape = (GeometricShape) object3D;
                            if (geometricShape.f257a == 1) {
                                geometricShape.m132a(vector3DM439a, fArr);
                                if (Collision3D.m79a(c0109h.f952a, c0109h.f953b, vector3DM439a, fArr[0])) {
                                    if (c0109h.f954c == null) {
                                        c0109h.f955d++;
                                    } else if (c0109h.f955d < c0109h.f954c.length) {
                                        GeometricShape[] geometricShapeArr = c0109h.f954c;
                                        int i3 = c0109h.f955d;
                                        c0109h.f955d = i3 + 1;
                                        geometricShapeArr[i3] = geometricShape;
                                    }
                                }
                            }
                        }
                    }
                    i2++;
                    z2 = z;
                }
                C0046br.m440a(vector3DM439a);
                return z2;
            } catch (Throwable th) {
                th = th;
                vector3D = vector3DM439a;
                C0046br.m440a(vector3D);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addNode(NodeDeformerNode nodeDeformerNode, int i, Transform transform) {
        int i2;
        C0017ap c0017ap = null;
        if (nodeDeformerNode == 0) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= 32767) {
            throw new IllegalArgumentException();
        }
        if (this.f394g != null && this.f394g.f501c <= i) {
            throw new IllegalArgumentException();
        }
        if (!isNode(nodeDeformerNode)) {
            throw new IllegalArgumentException();
        }
        if (((Object3D) nodeDeformerNode).f404l != null) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode != 0 && ((Object3D) nodeDeformerNode).f400h == 20 && ((GeometricShape) nodeDeformerNode).f259c != null) {
            throw new IllegalArgumentException();
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f390c) {
                i3 = -1;
                break;
            } else {
                if (this.f392e[i3].f671a == null) {
                    c0017ap = this.f392e[i3];
                    break;
                }
                i3++;
            }
        }
        if (c0017ap == null) {
            C0017ap c0017ap2 = new C0017ap();
            if (this.f390c >= Short.MAX_VALUE) {
                throw new IllegalArgumentException();
            }
            this.f397s.addElement(c0017ap2);
            this.f390c = (short) this.f397s.size();
            int i4 = this.f390c - 1;
            m208c();
            c0017ap = this.f392e[i4];
            i2 = i4;
        } else {
            i2 = i3;
        }
        if (((Object3D) nodeDeformerNode).f400h != 18) {
            m204a(i2, (Object3D) nodeDeformerNode);
            m209d();
        }
        c0017ap.f671a = (Object3D) nodeDeformerNode;
        c0017ap.f671a.f404l = this;
        c0017ap.f671a.f405m = (short) i2;
        c0017ap.f671a.f406n = (short) i;
        c0017ap.f674d = (short) i;
        c0017ap.f675e = true;
        if (transform != null) {
            Transform.m251e(c0017ap.f672b, transform);
        } else {
            c0017ap.f672b.setIdentity();
        }
        if (c0017ap.f671a.f400h == 20) {
            ((GeometricShape) c0017ap.f671a).f259c = this;
        }
    }

    public final NodeDeformerNode getNode(int i) {
        if (i < 0 || i >= this.f390c) {
            throw new IllegalArgumentException();
        }
        return (NodeDeformerNode) this.f392e[i].f671a;
    }

    public final int getNodeNum() {
        return this.f390c;
    }

    public final TransformTree getRefTransformTree() {
        return this.f394g;
    }

    public final int getTransformIndex(int i) {
        if (i < 0 || i >= this.f390c) {
            throw new IllegalArgumentException();
        }
        return this.f392e[i].f674d;
    }

    public final boolean isVisible(int i) {
        if (i < 0 || i >= this.f390c) {
            throw new IllegalArgumentException();
        }
        return this.f392e[i].f675e;
    }

    public final void removeNode(int i) {
        if (i < 0 || i >= this.f390c) {
            throw new IllegalArgumentException();
        }
        C0017ap c0017ap = this.f392e[i];
        if (c0017ap.f671a != null) {
            c0017ap.f671a.f404l = null;
            c0017ap.f671a.f405m = (short) -1;
            c0017ap.f671a.f406n = (short) -1;
            m207b(i, c0017ap.f671a);
            c0017ap.f671a = null;
        }
        this.f397s.removeElementAt(i);
        this.f390c = (short) this.f397s.size();
        m208c();
        m209d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setNode(int i, NodeDeformerNode nodeDeformerNode, int i2, Transform transform) {
        if (i < 0 || i >= this.f390c) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= 32767) {
            throw new IllegalArgumentException();
        }
        if (this.f394g != null && this.f394g.f501c <= i2) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode != 0 && !isNode(nodeDeformerNode)) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode != 0 && ((Object3D) nodeDeformerNode).f404l != null) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode != 0 && ((Object3D) nodeDeformerNode).f400h == 20 && ((GeometricShape) nodeDeformerNode).f259c != null) {
            throw new IllegalArgumentException();
        }
        if (nodeDeformerNode != 0 && ((Object3D) nodeDeformerNode).f400h != 18) {
            m204a(i, (Object3D) nodeDeformerNode);
        }
        C0017ap c0017ap = this.f392e[i];
        if (c0017ap.f671a != null) {
            m207b(i, c0017ap.f671a);
            c0017ap.f671a.f404l = null;
            c0017ap.f671a.f405m = (short) -1;
            c0017ap.f671a.f406n = (short) -1;
            c0017ap.f671a = null;
            if (c0017ap.f671a.f400h == 20) {
                ((GeometricShape) c0017ap.f671a).f259c = null;
            }
        }
        c0017ap.f671a = (Object3D) nodeDeformerNode;
        if (nodeDeformerNode != 0) {
            c0017ap.f671a.f404l = this;
            c0017ap.f671a.f405m = (short) i;
            c0017ap.f671a.f406n = (short) i2;
            c0017ap.f674d = (short) i2;
            c0017ap.f675e = true;
            if (transform != null) {
                Transform.m251e(c0017ap.f672b, transform);
            } else {
                c0017ap.f672b.setIdentity();
            }
            if (c0017ap.f671a.f400h == 20) {
                ((GeometricShape) c0017ap.f671a).f259c = this;
            }
        } else {
            c0017ap.f671a = null;
            c0017ap.f674d = (short) 0;
            c0017ap.f675e = true;
            c0017ap.f672b.setIdentity();
        }
        m209d();
    }

    public final void setVisible(int i, boolean z) {
        if (i < 0 || i >= this.f390c) {
            throw new IllegalArgumentException();
        }
        this.f392e[i].f675e = z;
    }
}
