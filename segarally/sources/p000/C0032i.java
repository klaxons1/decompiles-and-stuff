package p000;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class C0032i extends C0010as {
    public int Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public Appearance f512Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private Mesh f513Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public TriangleStripArray f514Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public VertexArray f515Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public VertexBuffer f516Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public VertexArray[] f517Code;

    /* JADX INFO: renamed from: V */
    public int f324V;

    public C0032i(int i) {
        this(i, 1);
    }

    public C0032i(int i, int i2) {
        ((C0010as) this).f406Code = new Group();
        this.f516Code = new VertexBuffer();
        this.Code = i;
        this.f324V = i2;
        this.f517Code = new VertexArray[this.f324V];
    }

    public C0032i(int i, boolean z, float[] fArr, float f, boolean z2, float[] fArr2, float f2) {
        this(i, 1);
        Code(z, fArr, f, z2, fArr2, f2);
    }

    @Override // p000.C0010as
    public Group Code() {
        if (this.f513Code == null) {
            if (this.f514Code == null) {
                throw new RuntimeException("setTriStrip() not called yet");
            }
            if (this.f512Code == null) {
                throw new RuntimeException("setAppearance() not called yet");
            }
            this.f513Code = new Mesh(this.f516Code, this.f514Code, this.f512Code);
            ((C0010as) this).f406Code.addChild(this.f513Code);
        }
        return ((C0010as) this).f406Code;
    }

    @Override // p000.C0010as
    public final void Code(C0028d c0028d) {
        this.f512Code = c0028d.Code;
        if (this.f513Code != null) {
            this.f513Code.setAppearance(0, this.f512Code);
        }
    }

    public final void Code(boolean z, float[] fArr, float f, boolean z2, float[] fArr2, float f2) {
        this.f515Code = new VertexArray(this.Code, 3, z ? 2 : 1);
        this.f516Code.setPositions(this.f515Code, f, fArr);
        for (int i = 0; i < this.f324V; i++) {
            this.f517Code[i] = new VertexArray(this.Code, z2 ? 3 : 2, 1);
            this.f516Code.setTexCoords(i, this.f517Code[i], f2, fArr2);
        }
    }

    public final void Code(byte[] bArr, int i, int i2) {
        if (this.f517Code == null) {
            throw new RuntimeException("init() not called");
        }
        this.f517Code[0].set(i, i2, bArr);
    }

    public final void Code(float[] fArr, float f) {
        this.f516Code.setPositions(this.f515Code, f, fArr);
    }

    public final void Code(int[] iArr, int[] iArr2) {
        ((C0010as) this).f406Code.removeChild(this.f513Code);
        this.f513Code = null;
        this.f514Code = new TriangleStripArray(iArr, iArr2);
    }

    public final void Code(short[] sArr, int i, int i2) {
        if (this.f515Code == null) {
            throw new RuntimeException("init() not called");
        }
        this.f515Code.set(i, i2, sArr);
    }
}
