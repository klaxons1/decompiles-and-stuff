package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class ActionTable extends Object3D {

    /* JADX INFO: renamed from: a */
    private Action[] f95a;

    ActionTable(int i) {
        super(13);
        if (i < 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        this.f95a = new Action[i];
    }

    @Override // com.mascotcapsule.eruption.docomostar.Object3D
    /* JADX INFO: renamed from: a */
    final int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        int iMo0a = super.mo0a(i, i2, object3DArr, i3);
        if (object3DArr == null || object3DArr.length > iMo0a) {
            for (int i4 = 0; i4 < this.f95a.length; i4++) {
                iMo0a = this.f95a[i4].mo0a(i, i2, object3DArr, iMo0a);
                if (object3DArr != null && object3DArr.length <= iMo0a) {
                    break;
                }
            }
        }
        return iMo0a;
    }

    /* JADX INFO: renamed from: a */
    final void m1a(int i, Action action) {
        this.f95a[i] = action;
        action.f87f = this;
    }

    public final Action findAction(int i) {
        if (i == -1) {
            return null;
        }
        for (int i2 = 0; i2 < this.f95a.length; i2++) {
            if (this.f95a[i2] != null && this.f95a[i2].f82a == i) {
                return this.f95a[i2];
            }
        }
        return null;
    }

    public final float getMaxFrame() {
        float f = 0.0f;
        for (int i = 0; i < this.f95a.length; i++) {
            if (this.f95a[i] != null) {
                float numFrame = this.f95a[i].getNumFrame();
                if (numFrame > f) {
                    f = numFrame;
                }
            }
        }
        return f;
    }
}
