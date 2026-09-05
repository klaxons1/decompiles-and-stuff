package p000;

import com.docomostar.ui.Image;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Draw2dObject {
    public static final byte DRAW2D_TYPE_DRAWRECT = 9;
    public static final byte DRAW2D_TYPE_FILLARC = 3;
    public static final byte DRAW2D_TYPE_FILLRECT = 2;
    public static final byte DRAW2D_TYPE_IMAGE = 7;
    public static final byte DRAW2D_TYPE_IMAGE_REGION = 10;
    public static final byte DRAW2D_TYPE_IMAGE_SCALE = 8;
    public static final byte DRAW2D_TYPE_LINE = 4;
    public static final byte DRAW2D_TYPE_POLYLINE = 5;
    public static final byte DRAW2D_TYPE_STRING = 0;
    public int arcAngle;
    public int count;
    public int dstRatio;
    public int flip;
    public int font;

    /* JADX INFO: renamed from: h */
    public int f18h;
    public Image img;
    public int offset;
    public int renderMode;
    public int rgb;

    /* JADX INFO: renamed from: sh */
    public int f19sh;
    public int srcRatio;
    public int startAngle;
    public String str;

    /* JADX INFO: renamed from: sw */
    public int f20sw;

    /* JADX INFO: renamed from: sx */
    public int f21sx;

    /* JADX INFO: renamed from: sy */
    public int f22sy;
    public byte type;

    /* JADX INFO: renamed from: w */
    public int f23w;

    /* JADX INFO: renamed from: x */
    public int f24x;
    public int[] xPoints;

    /* JADX INFO: renamed from: y */
    public int f25y;
    public int[] yPoints;

    Draw2dObject() {
    }

    public void addDraw2dObject(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.type = (byte) 4;
        this.f24x = i;
        this.f25y = i2;
        this.f23w = i3;
        this.f18h = i4;
        this.rgb = i5;
        this.renderMode = i6;
        this.srcRatio = i7;
        this.dstRatio = i8;
    }

    public void addDraw2dObject(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            this.type = (byte) 2;
        } else {
            this.type = (byte) 9;
        }
        this.f24x = i;
        this.f25y = i2;
        this.f23w = i3;
        this.f18h = i4;
        this.rgb = i5;
        this.renderMode = i6;
        this.srcRatio = i7;
        this.dstRatio = i8;
    }

    public void addDraw2dObject(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.type = (byte) 3;
        this.f24x = i;
        this.f25y = i2;
        this.f23w = i3;
        this.f18h = i4;
        this.startAngle = i5;
        this.arcAngle = i6;
        this.rgb = i7;
        this.renderMode = i8;
        this.srcRatio = i9;
        this.dstRatio = i10;
    }

    public void addDraw2dObject(Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 == 0) {
            this.type = (byte) 7;
        } else {
            this.type = (byte) 8;
        }
        this.img = image;
        this.f24x = i;
        this.f25y = i2;
        this.f23w = i3;
        this.f18h = i4;
        this.flip = i5;
        this.renderMode = i6;
        this.srcRatio = i7;
        this.dstRatio = i8;
    }

    public void addDraw2dObject(Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.type = (byte) 10;
        this.img = image;
        this.f24x = i;
        this.f25y = i2;
        this.f23w = i3;
        this.f18h = i4;
        this.f21sx = i5;
        this.f22sy = i6;
        this.f20sw = i7;
        this.f19sh = i8;
        this.flip = i9;
        this.renderMode = i10;
        this.srcRatio = i11;
        this.dstRatio = i12;
    }

    public void addDraw2dObject(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.type = (byte) 0;
        this.str = str;
        this.f24x = i;
        this.f25y = i2;
        this.font = i3;
        this.rgb = i4;
        this.renderMode = i5;
        this.srcRatio = i6;
        this.dstRatio = i7;
    }

    public void addDraw2dObject(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.type = (byte) 5;
        this.xPoints = iArr;
        this.yPoints = iArr2;
        this.offset = i;
        this.count = i2;
        this.rgb = i3;
        this.renderMode = i4;
        this.srcRatio = i5;
        this.dstRatio = i6;
    }
}
