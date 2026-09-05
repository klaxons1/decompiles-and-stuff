package com.mascotcapsule.eruption.docomostar;

import com.docomostar.ui.ogl.GraphicsOGL;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class TextureTable extends Object3D {

    /* JADX INFO: renamed from: a */
    private Texture[] f488a;

    TextureTable(int i) {
        super(11);
        if (i < 0 || i > 32767) {
            throw new IllegalArgumentException();
        }
        this.f488a = new Texture[i];
    }

    @Override // com.mascotcapsule.eruption.docomostar.Object3D
    /* JADX INFO: renamed from: a */
    final int mo0a(int i, int i2, Object3D[] object3DArr, int i3) {
        int iMo0a = super.mo0a(i, i2, object3DArr, i3);
        if (object3DArr == null || object3DArr.length > iMo0a) {
            for (int i4 = 0; i4 < this.f488a.length; i4++) {
                iMo0a = this.f488a[i4].mo0a(i, i2, object3DArr, iMo0a);
                if (object3DArr != null && object3DArr.length <= iMo0a) {
                    break;
                }
            }
        }
        return iMo0a;
    }

    /* JADX INFO: renamed from: a */
    final void m248a(int i, Texture texture) {
        this.f488a[i] = texture;
        texture.f483u = this;
    }

    public final Texture findTexture(int i) {
        if (i == -1) {
            return null;
        }
        for (int i2 = 0; i2 < this.f488a.length; i2++) {
            if (this.f488a[i2] != null && this.f488a[i2].f472b == i) {
                return this.f488a[i2];
            }
        }
        return null;
    }

    public final Texture getTexture(int i) {
        if ((i < 0) || (i >= this.f488a.length)) {
            throw new IllegalArgumentException();
        }
        return this.f488a[i];
    }

    public final int getTextureNum() {
        return this.f488a.length;
    }

    public final void purgeBufferAll() {
        for (int i = 0; i < this.f488a.length; i++) {
            this.f488a[i].purgeBuffer();
        }
    }

    public final void purgeGLobjectAll(Graphics3D graphics3D, GraphicsOGL graphicsOGL) {
        for (int i = 0; i < this.f488a.length; i++) {
            this.f488a[i].purgeGLobject(graphics3D, graphicsOGL);
        }
    }
}
