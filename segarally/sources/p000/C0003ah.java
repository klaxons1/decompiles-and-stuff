package p000;

import Coral.Math.Float.crlV4;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Transform;

/* JADX INFO: renamed from: ah */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public class C0003ah extends Camera {

    /* JADX INFO: renamed from: V */
    public static float[] f20V = new float[16];
    private float Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private Transform f373Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public float[] f374Code;

    /* JADX INFO: renamed from: I */
    private float f21I;

    /* JADX INFO: renamed from: V */
    private float f22V;

    /* JADX INFO: renamed from: Z */
    private float f23Z;

    public C0003ah() {
        new crlV4();
        new crlV4();
        new crlV4();
        new crlV4();
        this.f374Code = new float[16];
        this.f373Code = new Transform();
    }

    public void Code() {
        this.f373Code = null;
        this.f374Code = null;
    }

    public final void Code(float f) {
        this.Code = f;
        setPerspective(this.f23Z, this.f21I, this.f22V, this.Code);
    }

    public void Code(float f, float f2, float f3, float f4) {
        this.f22V = f3;
        this.Code = f4;
        this.f23Z = f2;
        this.f21I = f;
        setPerspective(this.f23Z, this.f21I, this.f22V, this.Code);
    }

    public final void Code(float[] fArr) {
        System.arraycopy(this.f374Code, 0, fArr, 0, 16);
    }

    /* JADX INFO: renamed from: V */
    public void mo20V() {
        System.arraycopy(this.f374Code, 0, f20V, 0, 16);
        f20V[3] = 0.0f;
        f20V[7] = 0.0f;
        f20V[11] = 0.0f;
        this.f373Code.set(this.f374Code);
        setTransform(this.f373Code);
    }
}
