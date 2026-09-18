package p000;

import java.io.ByteArrayInputStream;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Object3D;
import javax.microedition.m3g.Transform;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

/* JADX INFO: renamed from: ao */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0007ao implements InterfaceC0009ar, PlayerListener, InterfaceC0036s {

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static C0007ao f382Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static Transform f383Code;

    /* JADX INFO: renamed from: a */
    private static C0007ao f30a;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public int f386Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public long f387Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0003ah f388Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0010as f389Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0028d f390Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public Object3D f391Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private Player f392Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private VolumeControl f393Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private boolean f394Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private float[] f395Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private int[] f396Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private long[] f397Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0031g[] f398Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public C0032i[] f399Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private Object[] f400Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private short[] f401Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private boolean[] f402Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0040z[][] f403Code;

    /* JADX INFO: renamed from: I */
    private int f31I;

    /* JADX INFO: renamed from: V */
    private int f32V;

    /* JADX INFO: renamed from: V */
    public long f33V;

    /* JADX INFO: renamed from: Z */
    private int f34Z;

    /* JADX INFO: renamed from: a */
    private int f35a;

    /* JADX INFO: renamed from: b */
    public int f36b;

    /* JADX INFO: renamed from: b */
    public C0007ao f37b;

    /* JADX INFO: renamed from: c */
    private int f38c;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static final String[] f384Code = {"audio/amr", "audio/midi", "audio/mpeg", "audio/x-wav", "Nokia tone format"};

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static final byte[][] f385Code = {new byte[]{95, 118, 95, 110, 127, 118, 127, 110}, new byte[]{96, 127, 96, 119, 127, 127, 127, 119}, new byte[]{95, 109, 95, 101, 127, 109, 127, 101}};
    private static float Code = -0.1f;

    static {
        int[] iArr = {0, 25, 50, 100};
    }

    private C0007ao() {
    }

    public C0007ao(float f, float f2, float f3, float f4) {
        this.f390Code = new C0028d();
        CompositingMode compositingMode = new CompositingMode();
        compositingMode.setDepthTestEnable(false);
        compositingMode.setDepthWriteEnable(true);
        compositingMode.setAlphaWriteEnable(true);
        this.f390Code.Code.setCompositingMode(compositingMode);
        this.f388Code = new C0003ah();
        this.f388Code.setPerspective(f, f2, f3, f4);
        f383Code = new Transform();
    }

    public C0007ao(int i) {
        this.f35a = 40;
        this.f386Code = -1;
        this.f35a = i;
        this.f399Code = new C0032i[this.f35a];
        this.f402Code = new boolean[this.f35a];
        this.f397Code = new long[this.f35a];
        this.f401Code = new short[12];
        this.f395Code = new float[12];
        for (int i2 = 0; i2 < this.f35a; i2++) {
            this.f399Code[i2] = new C0032i(4);
            this.f399Code[i2].Code(C0037t.f349a, C0037t.f346V);
            this.f402Code[i2] = false;
        }
        this.f31I = 0;
        this.f394Code = false;
    }

    public C0007ao(int i, int i2) {
        this.f400Code = new Object[i];
        this.f32V = i2;
    }

    public C0007ao(C0007ao c0007ao, Object3D object3D, boolean z) {
        long j;
        this.f36b = object3D.getAnimationTrack(0).getKeyframeSequence().getDuration();
        this.f391Code = object3D;
        this.f391Code.setRenderingEnable(true);
        if (z) {
            j = -1;
        } else {
            this.f33V = C0031g.f276e - ((long) 50);
            j = C0031g.f276e + ((long) this.f36b);
        }
        this.f387Code = j;
        m213Code();
    }

    public C0007ao(boolean z) {
    }

    private C0007ao(boolean z, boolean z2) {
        this.f37b = new C0007ao(10, 3);
    }

    public C0007ao(boolean z, boolean z2, boolean z3) {
        this(32, 32);
    }

    public static C0007ao Code() {
        if (f382Code == null) {
            f382Code = new C0007ao();
        }
        return f382Code;
    }

    public static void Code(float f) {
        Code = f;
    }

    /* JADX INFO: renamed from: I */
    private int m26I() {
        try {
            this.f392Code.stop();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: Z */
    private int m27Z() {
        try {
            this.f392Code.stop();
            this.f392Code.deallocate();
            this.f392Code.close();
            this.f392Code = null;
            this.f34Z = -1;
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0007ao m28a() {
        if (f30a == null) {
            f30a = new C0007ao(false, false);
        }
        return f30a;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public int m210Code() {
        m27Z();
        for (int i = 0; i < this.f35a; i++) {
            this.f396Code[i] = -1;
            this.f398Code[i] = null;
        }
        this.f35a = 0;
        this.f386Code = 0;
        return 0;
    }

    public int Code(C0037t c0037t, long[] jArr, int[] iArr) {
        if (this.f35a != 0) {
            m210Code();
        }
        this.f35a = jArr.length;
        for (int i = 0; i < this.f35a; i++) {
            this.f396Code[i] = iArr[i];
            this.f398Code[i] = c0037t.m199V(jArr[i]);
        }
        this.f32V = -1;
        this.f386Code = 1;
        return 0;
    }

    public Object Code(int i) {
        return this.f400Code[i];
    }

    public final C0040z Code(int i, int i2) {
        C0040z c0040z;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            C0040z[] c0040zArrM216Code = m216Code(i3);
            if (c0040zArrM216Code != null) {
                for (int i4 = 0; i4 < c0040zArrM216Code.length; i4++) {
                    c0040z = c0040zArrM216Code[i4];
                    if (c0040z.Code() == i) {
                        return c0040z;
                    }
                }
            }
        }
        for (int length = this.f403Code.length - 1; length > i2; length--) {
            C0040z[] c0040zArrM216Code2 = m216Code(length);
            if (c0040zArrM216Code2 != null) {
                for (int i5 = 0; i5 < c0040zArrM216Code2.length; i5++) {
                    c0040z = c0040zArrM216Code2[i5];
                    if (c0040z.Code() == i) {
                        return c0040z;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m211Code() {
        this.f403Code = (C0040z[][]) null;
    }

    public void Code(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f31I == -1) {
            this.f394Code = false;
            return;
        }
        if (this.f394Code) {
            this.f395Code[0] = this.f395Code[6];
            this.f395Code[1] = this.f395Code[7];
            this.f395Code[2] = this.f395Code[8];
            this.f395Code[3] = this.f395Code[9];
            this.f395Code[4] = this.f395Code[10];
            this.f395Code[5] = this.f395Code[11];
        }
        this.f395Code[6] = f4 - C0031g.f481Code.f445Code[0];
        this.f395Code[7] = (0.1f + f5) - C0031g.f481Code.f445Code[1];
        this.f395Code[8] = f6 - C0031g.f481Code.f445Code[2];
        this.f395Code[9] = f - C0031g.f481Code.f445Code[0];
        this.f395Code[10] = (0.1f + f2) - C0031g.f481Code.f445Code[1];
        this.f395Code[11] = f3 - C0031g.f481Code.f445Code[2];
        if (!this.f394Code) {
            this.f394Code = true;
            return;
        }
        C0032i c0032i = this.f399Code[this.f31I];
        this.f402Code[this.f31I] = true;
        this.f397Code[this.f31I] = C0031g.f276e + ((long) 1000);
        int i = this.f31I + 1;
        this.f31I = i;
        if (i == this.f35a) {
            this.f31I = this.f402Code[0] ? -1 : 0;
        }
        for (int i2 = 0; i2 < 12; i2++) {
            this.f401Code[i2] = (short) (this.f395Code[i2] * C0031g.f481Code.f120V);
        }
        c0032i.Code(this.f401Code, 0, 4);
        C0031g.f483Code.m125V(c0032i);
        C0031g.f483Code.Code(c0032i);
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public void m212Code(int i) {
        for (int i2 = 0; i2 < this.f35a; i2++) {
            this.f399Code[i2].Code(f385Code[i - 4], 0, 4);
        }
        this.f386Code = i;
    }

    public void Code(int i, int i2, int i3) {
        if (i3 == -1) {
            i3 = -1;
        }
        this.f38c = i3;
        this.f31I = i2;
        this.f32V = i;
    }

    public final void Code(int i, byte[] bArr, int i2, int i3) {
        C0040z c0040z;
        int iMo15V;
        this.f403Code = new C0040z[i][];
        if (i3 != 0) {
            int i4 = i2;
            while (i4 - i2 < i3) {
                int iM193V = C0037t.m193V(bArr, i4);
                int i5 = i4 + 4;
                int i6 = i5 + 1;
                int i7 = bArr[i5];
                this.f403Code[iM193V] = new C0040z[i7];
                i4 = i6;
                for (int i8 = 0; i8 < i7; i8++) {
                    int i9 = i4 + 4;
                    switch (C0037t.m193V(bArr, i4)) {
                        case 1:
                            c0040z = new C0040z(bArr, i9);
                            this.f403Code[iM193V][i8] = c0040z;
                            iMo15V = c0040z.mo15V();
                            break;
                        case 2:
                            c0040z = new C0026bu(bArr, i9);
                            this.f403Code[iM193V][i8] = c0040z;
                            iMo15V = c0040z.mo15V();
                            break;
                        case 3:
                            c0040z = new C0016bb(bArr, i9);
                            this.f403Code[iM193V][i8] = c0040z;
                            iMo15V = c0040z.mo15V();
                            break;
                        case 4:
                            c0040z = new C0000ac(bArr, i9);
                            this.f403Code[iM193V][i8] = c0040z;
                            iMo15V = c0040z.mo15V();
                            break;
                        default:
                            iMo15V = 0;
                            break;
                    }
                    i4 = i9 + iMo15V;
                }
            }
        }
    }

    public void Code(long j, int i) {
        this.f390Code.Code(j, i);
    }

    public void Code(C0010as c0010as) {
        this.f389Code = c0010as;
        if (this.f389Code != null) {
            this.f389Code.Code(this.f390Code);
        }
    }

    public void Code(C0028d c0028d) {
        for (int i = 0; i < this.f35a; i++) {
            this.f399Code[i].Code(c0028d);
        }
    }

    public void Code(Object obj) {
        if (this.f386Code >= this.f400Code.length) {
            int length = this.f400Code.length;
            int i = this.f32V + length;
            if (length == i) {
                i++;
            }
            Object[] objArr = new Object[i];
            System.arraycopy(this.f400Code, 0, objArr, 0, this.f386Code);
            this.f400Code = objArr;
        }
        this.f400Code[this.f386Code] = obj;
        this.f386Code++;
    }

    @Override // p000.InterfaceC0036s
    public void Code(Graphics3D graphics3D) {
        graphics3D.setCamera(this.f388Code, f383Code);
        graphics3D.render(this.f389Code.Code(), (Transform) null);
    }

    @Override // p000.InterfaceC0009ar
    public void Code(C0040z c0040z) {
        if (c0040z.Code() == 4) {
            C0000ac c0000ac = (C0000ac) c0040z;
            Object3D object3DFind = C0031g.f483Code.find(c0000ac.f364Code);
            if (c0000ac.Code != 0) {
                this.f37b.Code((Object) new C0007ao(this, object3DFind, false));
            } else {
                this.f37b.Code((Object) new C0007ao(this, object3DFind, true));
                ((C0040z) c0000ac).Code = false;
            }
        }
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public boolean m213Code() {
        if (this.f387Code == -1) {
            this.f391Code.animate(((int) C0031g.f276e) % this.f36b);
            return true;
        }
        if (C0031g.f276e < this.f387Code) {
            this.f391Code.animate((int) (C0031g.f276e - this.f33V));
            return true;
        }
        this.f391Code.animate(this.f36b);
        this.f391Code.setRenderingEnable(false);
        return false;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public boolean m214Code(int i) {
        return i == this.f34Z && this.f392Code != null && this.f392Code.getState() == 400;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public boolean m215Code(Object obj) {
        int i = 0;
        while (true) {
            if (i >= this.f386Code) {
                i = -1;
                break;
            }
            if (this.f400Code[i].equals(obj)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        while (true) {
            i++;
            if (i >= this.f386Code) {
                this.f386Code--;
                this.f400Code[this.f386Code] = null;
                return true;
            }
            this.f400Code[i - 1] = this.f400Code[i];
        }
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final C0040z[] m216Code(int i) {
        return this.f403Code[i];
    }

    /* JADX INFO: renamed from: I */
    public void m29I() {
        if (this.f34Z < this.f35a) {
            this.f399Code[this.f34Z].Code(true, C0031g.f481Code.f445Code, C0031g.f481Code.f117I, false, null, 0.0078125f);
            this.f399Code[this.f34Z].Code(f385Code[0], 0, 4);
            this.f399Code[this.f34Z + 1].Code(true, C0031g.f481Code.f445Code, C0031g.f481Code.f117I, false, null, 0.0078125f);
            this.f399Code[this.f34Z + 1].Code(f385Code[0], 0, 4);
            this.f399Code[this.f34Z + 2].Code(true, C0031g.f481Code.f445Code, C0031g.f481Code.f117I, false, null, 0.0078125f);
            this.f399Code[this.f34Z + 2].Code(f385Code[0], 0, 4);
            this.f34Z += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: V */
    public int m30V() {
        byte b;
        switch (this.f386Code) {
            case 1:
                if (this.f32V != -1 && !m214Code(this.f34Z)) {
                    if (this.f32V == this.f34Z) {
                        if (m214Code(this.f34Z)) {
                            b = -1;
                        } else {
                            try {
                                this.f393Code.setLevel(this.f31I);
                                this.f392Code.setLoopCount(this.f38c);
                                this.f392Code.start();
                                b = 0;
                            } catch (Exception e) {
                                b = -1;
                            }
                        }
                        if (b == 0) {
                            this.f32V = -1;
                        }
                    } else if ((this.f392Code == null || this.f392Code.getState() == 0) ? false : true) {
                        m27Z();
                    } else {
                        int i = this.f32V;
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f398Code[i].f507Code, this.f398Code[i].f500Code, this.f398Code[i].f313V);
                            this.f392Code = Manager.createPlayer(byteArrayInputStream, f384Code[this.f396Code[i]]);
                            this.f392Code.realize();
                            this.f392Code.addPlayerListener(this);
                            this.f392Code.prefetch();
                            this.f393Code = this.f392Code.getControl("VolumeControl");
                            byteArrayInputStream.close();
                            this.f34Z = this.f32V;
                        } catch (Exception e2) {
                            this.f32V = -1;
                            this.f34Z = -1;
                        }
                    }
                    break;
                }
                return 0;
            case 2:
                m26I();
                this.f386Code = 3;
                return 0;
            case 3:
            default:
                return 0;
            case 4:
                if (this.f38c == -1 && this.f32V == -1) {
                    this.f32V = this.f34Z;
                }
                this.f386Code = 1;
                return 0;
            case 5:
                m27Z();
                return 0;
        }
    }

    /* JADX INFO: renamed from: V */
    public int m31V(C0037t c0037t, long[] jArr, int[] iArr) {
        this.f35a = jArr.length;
        this.f396Code[this.f36b] = iArr[this.f36b];
        this.f398Code[this.f36b] = c0037t.m199V(jArr[this.f36b]);
        this.f32V = -1;
        this.f386Code = 1;
        this.f36b++;
        return 0;
    }

    /* JADX INFO: renamed from: V */
    public void m32V() {
        this.f390Code.Code();
    }

    /* JADX INFO: renamed from: V */
    public void m33V(int i) {
        if (i == this.f34Z) {
            m26I();
            this.f34Z = -1;
            this.f38c = 0;
        }
        if (this.f32V == i) {
            this.f32V = -1;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m34Z() {
        for (int i = 0; i < this.f35a; i++) {
            this.f399Code[i].Code(C0031g.f481Code.f445Code, C0031g.f481Code.f117I);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35a(int i) {
        this.f396Code = new int[i];
        this.f398Code = new C0031g[i];
        this.f35a = 0;
        this.f34Z = -1;
        this.f32V = -1;
        this.f386Code = 0;
    }

    /* JADX INFO: renamed from: b */
    public void m36b() {
        if (this.f34Z != -1) {
            m33V(this.f34Z);
        }
        this.f32V = -1;
    }

    /* JADX INFO: renamed from: e */
    public void m37e() {
        if (this.f386Code == 3) {
            this.f386Code = 4;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m38g() {
        for (int i = 0; i < this.f35a; i++) {
            if (this.f402Code[i] && this.f397Code[i] < C0031g.f276e) {
                this.f402Code[i] = false;
                C0031g.f483Code.m125V(this.f399Code[i]);
                this.f399Code[i].Code(0.0f, 0.0f, 0.0f);
                if (this.f31I == -1) {
                    this.f31I = i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m39h() {
        for (int i = 0; i < this.f35a; i++) {
            this.f402Code[i] = false;
            C0031g.f483Code.m125V(this.f399Code[i]);
        }
        this.f31I = 0;
        this.f394Code = false;
        this.f386Code = -1;
    }

    /* JADX INFO: renamed from: i */
    public void m40i() {
        int i = -1;
        for (int i2 = 0; i2 < this.f37b.f386Code; i2++) {
            if (!((C0007ao) this.f37b.Code(i2)).m213Code()) {
                i = i2;
            }
        }
        if (i != -1) {
            C0007ao c0007ao = this.f37b;
            Object obj = c0007ao.f400Code[i];
            for (int i3 = i + 1; i3 < c0007ao.f386Code; i3++) {
                c0007ao.f400Code[i3 - 1] = c0007ao.f400Code[i3];
            }
            c0007ao.f386Code--;
            c0007ao.f400Code[c0007ao.f386Code] = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m41j() {
        this.f37b.m42m();
    }

    /* JADX INFO: renamed from: m */
    public void m42m() {
        for (int i = 0; i < this.f386Code; i++) {
            this.f400Code[i] = null;
        }
        this.f386Code = 0;
    }

    @Override // p000.InterfaceC0036s
    /* JADX INFO: renamed from: o */
    public void mo43o() {
        if (C0003ah.f20V[15] == 1.0f) {
            f383Code.set(C0003ah.f20V);
            f383Code.postTranslate(0.0f, Code, 0.0f);
            this.f388Code.setTransform(f383Code);
        }
    }

    public void playerUpdate(Player player, String str, Object obj) {
    }
}
