package p000;

import java.io.IOException;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Loader;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Object3D;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.World;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0041s extends AbstractC0036n {

    /* JADX INFO: renamed from: d */
    public static final int[][] f297d = {new int[]{9, 6}, new int[]{0, 9}, new int[]{0, 9}, new int[]{0, 9}, new int[]{0, 9}, new int[]{28, 9}, new int[]{16, 1}, new int[]{16, 1}, new int[]{16, 6}, new int[]{22, 1}, new int[]{22, 6}, new int[]{28, 9}};

    /* JADX INFO: renamed from: h */
    private static float[] f298h;

    /* JADX INFO: renamed from: i */
    private static float[] f299i;

    /* JADX INFO: renamed from: j */
    private static AbstractC0036n f300j;

    /* JADX INFO: renamed from: e */
    private Group f301e;

    /* JADX INFO: renamed from: f */
    private Group f302f;

    /* JADX INFO: renamed from: g */
    private Node f303g;

    /* JADX INFO: renamed from: k */
    private C0018b f304k;

    public C0041s() {
        float[] fArr = {30.0f, 30.0f, -30.0f, -30.0f};
        float[][] fArr2 = {new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.90763855f, 0.2431984f, 0.34201813f, -0.25881195f, 0.96591187f, 0.0f, -0.33035278f, -0.08851814f, 0.939682f}, new float[]{0.64785767f, 0.42536163f, 0.6318054f, -0.4848938f, 0.8700409f, -0.08851814f, -0.5873413f, -0.24901581f, 0.7700043f}, new float[]{0.26921082f, 0.5124817f, 0.81526184f, -0.6360321f, 0.73028564f, -0.24901581f, -0.7230072f, -0.45152283f, 0.52267456f}, new float[]{-0.27770233f, 0.6833954f, 0.67500305f, -0.89030457f, 0.08068085f, -0.447937f, -0.36060333f, -0.72540283f, 0.58613586f}, new float[]{0.32598114f, 0.7307129f, 0.5997009f, -0.83987427f, 0.51504517f, -0.17100525f, -0.43384552f, -0.44792938f, 0.7816925f}};
        float[][] fArr3 = {new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.9698334f, 0.17100525f, -0.17364502f, -0.17364502f, 0.98480225f, 0.0f, 0.17100525f, 0.03015232f, 0.98480225f}, new float[]{0.8811493f, 0.32901f, -0.33940887f, -0.33940887f, 0.9401245f, 0.03015232f, 0.32900238f, 0.08862877f, 0.9401245f}, new float[]{0.7393646f, 0.46444702f, -0.48724365f, -0.48724365f, 0.8686981f, 0.08862877f, 0.4644394f, 0.17188644f, 0.8686981f}};
    }

    public C0041s(AbstractC0042t abstractC0042t) {
        super(abstractC0042t);
        float[] fArr = {30.0f, 30.0f, -30.0f, -30.0f};
        float[][] fArr2 = {new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.90763855f, 0.2431984f, 0.34201813f, -0.25881195f, 0.96591187f, 0.0f, -0.33035278f, -0.08851814f, 0.939682f}, new float[]{0.64785767f, 0.42536163f, 0.6318054f, -0.4848938f, 0.8700409f, -0.08851814f, -0.5873413f, -0.24901581f, 0.7700043f}, new float[]{0.26921082f, 0.5124817f, 0.81526184f, -0.6360321f, 0.73028564f, -0.24901581f, -0.7230072f, -0.45152283f, 0.52267456f}, new float[]{-0.27770233f, 0.6833954f, 0.67500305f, -0.89030457f, 0.08068085f, -0.447937f, -0.36060333f, -0.72540283f, 0.58613586f}, new float[]{0.32598114f, 0.7307129f, 0.5997009f, -0.83987427f, 0.51504517f, -0.17100525f, -0.43384552f, -0.44792938f, 0.7816925f}};
        float[][] fArr3 = {new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.9698334f, 0.17100525f, -0.17364502f, -0.17364502f, 0.98480225f, 0.0f, 0.17100525f, 0.03015232f, 0.98480225f}, new float[]{0.8811493f, 0.32901f, -0.33940887f, -0.33940887f, 0.9401245f, 0.03015232f, 0.32900238f, 0.08862877f, 0.9401245f}, new float[]{0.7393646f, 0.46444702f, -0.48724365f, -0.48724365f, 0.8686981f, 0.08862877f, 0.4644394f, 0.17188644f, 0.8686981f}};
    }

    /* JADX INFO: renamed from: a */
    public final Node m200a() {
        return this.f303g;
    }

    /* JADX INFO: renamed from: a */
    public final Node m201a(World world) {
        Object3D[] object3DArrLoad;
        try {
            object3DArrLoad = Loader.load("/res/role/role.m3g");
        } catch (IOException e) {
            e.printStackTrace();
            object3DArrLoad = null;
        }
        World world2 = null;
        int i = 0;
        while (i < object3DArrLoad.length) {
            World world3 = object3DArrLoad[i] instanceof World ? (World) object3DArrLoad[i] : world2;
            i++;
            world2 = world3;
        }
        this.f277b = world2.find(85);
        world2.removeChild(this.f277b);
        if (f300j != null) {
            Mesh meshM190d = f300j.m190d();
            Mesh mesh = this.f277b;
            mesh.getVertexBuffer().setNormals(meshM190d.getVertexBuffer().getNormals());
            float[] fArr = new float[4];
            VertexArray positions = meshM190d.getVertexBuffer().getPositions(fArr);
            float[] fArr2 = {fArr[1], fArr[2], fArr[3]};
            mesh.getVertexBuffer().setPositions(positions, fArr[0], fArr2);
            VertexArray texCoords = meshM190d.getVertexBuffer().getTexCoords(0, fArr);
            fArr2[0] = fArr[1];
            fArr2[1] = fArr[2];
            fArr2[2] = fArr[3];
            mesh.getVertexBuffer().setTexCoords(0, texCoords, fArr[0], fArr2);
        }
        this.f303g = this.f277b.find(80);
        this.f303g.setRenderingEnable(true);
        Group skeleton = this.f277b.getSkeleton();
        this.f301e = skeleton.find(76);
        skeleton.find(75);
        this.f302f = skeleton.find(74);
        skeleton.find(69);
        skeleton.find(77);
        skeleton.find(81);
        world.addChild(this.f277b);
        Transform transform = new Transform();
        world.getTransformTo(this.f277b, transform);
        float[] fArr3 = {0.0f, 1.0f, 0.0f, 0.0f};
        transform.transform(fArr3);
        this.f277b.postRotate(180.0f, fArr3[0], fArr3[1], fArr3[2]);
        if (f300j == null) {
            Transform transform2 = new Transform();
            world.getTransformTo(this.f302f, transform2);
            float[] fArr4 = {1.0f, 0.0f, 0.0f, 0.0f};
            transform2.transform(fArr4);
            f298h = new float[]{fArr4[0], 0.0f, 0.0f};
            f298h[1] = fArr4[1];
            f298h[2] = fArr4[2];
            float[] fArr5 = {0.0f, 1.0f, 0.0f, 0.0f};
            transform2.transform(fArr5);
            f299i = new float[]{fArr5[0], 0.0f, 0.0f};
            f299i[1] = fArr5[1];
            f299i[2] = fArr5[2];
            f300j = this;
        }
        this.f276a = this.f277b;
        this.f304k = C0017aq.m79a().m80a(C0000a.m0a().m190d(), 1);
        this.f301e.addChild(this.f304k.m89b());
        this.f304k.m89b().translate(0.94f, 0.0f, -2.3f);
        return this.f277b;
    }

    @Override // p000.AbstractC0036n
    /* JADX INFO: renamed from: b */
    public final void mo187b() {
        super.mo187b();
        this.f301e = null;
        this.f302f = null;
        f300j = null;
        this.f304k = null;
    }

    /* JADX INFO: renamed from: f */
    public final C0018b m202f() {
        return this.f304k;
    }
}
