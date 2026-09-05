package com.mascotcapsule.eruption.docomostar;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.Graphics;
import com.docomostar.ui.Image;
import com.docomostar.ui.ogl.ByteBuffer;
import com.docomostar.ui.ogl.DirectBufferFactory;
import com.docomostar.ui.ogl.GraphicsOGL;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public final class Texture extends Object3D {
    public static final int PixelFormat_A = 17;
    public static final int PixelFormat_ATITC_RGB = 21;
    public static final int PixelFormat_ATITC_RGBA = 22;
    public static final int PixelFormat_DPY = 20;
    public static final int PixelFormat_L = 16;
    public static final int PixelFormat_LA = 18;
    public static final int PixelFormat_RGB = 1;
    public static final int PixelFormat_RGB565 = 3;
    public static final int PixelFormat_RGBA = 2;
    public static final int PixelFormat_RGBA4444 = 5;
    public static final int PixelFormat_RGBA5551 = 4;
    public static final int PixelFormat_idx4_RGB = 11;
    public static final int PixelFormat_idx4_RGB565 = 13;
    public static final int PixelFormat_idx4_RGBA = 12;
    public static final int PixelFormat_idx4_RGBA4444 = 15;
    public static final int PixelFormat_idx4_RGBA5551 = 14;
    public static final int PixelFormat_idx8_RGB = 6;
    public static final int PixelFormat_idx8_RGB565 = 8;
    public static final int PixelFormat_idx8_RGBA = 7;
    public static final int PixelFormat_idx8_RGBA4444 = 10;
    public static final int PixelFormat_idx8_RGBA5551 = 9;
    public static final int PixelFormat_reserve0 = 19;
    public static final int PixelFormat_undef = 0;
    public static final int SIZE_MAX = 1024;

    /* JADX INFO: renamed from: a */
    static C0062cg[] f466a;

    /* JADX INFO: renamed from: C */
    private int f468C;

    /* JADX INFO: renamed from: D */
    private int f469D;

    /* JADX INFO: renamed from: E */
    private Graphics f470E;

    /* JADX INFO: renamed from: F */
    private boolean f471F;

    /* JADX INFO: renamed from: b */
    int f472b;

    /* JADX INFO: renamed from: c */
    int f473c;

    /* JADX INFO: renamed from: d */
    int f474d;

    /* JADX INFO: renamed from: e */
    int f475e;

    /* JADX INFO: renamed from: f */
    int f476f;

    /* JADX INFO: renamed from: g */
    ByteBuffer[] f477g;

    /* JADX INFO: renamed from: p */
    ByteBuffer f478p;

    /* JADX INFO: renamed from: q */
    int f479q;

    /* JADX INFO: renamed from: r */
    int f480r;

    /* JADX INFO: renamed from: s */
    BufferPool f481s;

    /* JADX INFO: renamed from: t */
    C0122u[] f482t;

    /* JADX INFO: renamed from: u */
    TextureTable f483u;

    /* JADX INFO: renamed from: v */
    Image f484v;

    /* JADX INFO: renamed from: w */
    byte f485w;

    /* JADX INFO: renamed from: x */
    byte f486x;

    /* JADX INFO: renamed from: y */
    boolean f487y;

    /* JADX INFO: renamed from: z */
    private static RegionI f467z = new RegionI();

    /* JADX INFO: renamed from: A */
    private static RegionI f464A = new RegionI();

    /* JADX INFO: renamed from: B */
    private static RegionI f465B = new RegionI();

    static {
        C0062cg[] c0062cgArr = new C0062cg[23];
        f466a = c0062cgArr;
        c0062cgArr[0] = new C0062cg(-1, -1, 0);
        f466a[1] = new C0062cg(3, -1, 0);
        f466a[2] = new C0062cg(4, -1, 0);
        f466a[3] = new C0062cg(2, -1, 0);
        f466a[4] = new C0062cg(2, -1, 0);
        f466a[5] = new C0062cg(2, -1, 0);
        f466a[6] = new C0062cg(1, 3, Appearance.LIGHTTWOSIDE);
        f466a[7] = new C0062cg(1, 4, Appearance.LIGHTTWOSIDE);
        f466a[8] = new C0062cg(1, 2, Appearance.LIGHTTWOSIDE);
        f466a[9] = new C0062cg(1, 2, Appearance.LIGHTTWOSIDE);
        f466a[10] = new C0062cg(1, 2, Appearance.LIGHTTWOSIDE);
        f466a[11] = new C0062cg(0, 3, 16);
        f466a[12] = new C0062cg(0, 4, 16);
        f466a[13] = new C0062cg(0, 2, 16);
        f466a[14] = new C0062cg(0, 2, 16);
        f466a[15] = new C0062cg(0, 2, 16);
        f466a[16] = new C0062cg(1, -1, 0);
        f466a[17] = new C0062cg(1, -1, 0);
        f466a[18] = new C0062cg(2, -1, 0);
        f466a[19] = new C0062cg(-1, -1, 0);
        f466a[20] = f466a[3];
        f466a[21] = new C0062cg(3, -1, 0);
        f466a[22] = new C0062cg(4, -1, 0);
    }

    public Texture(BufferPool bufferPool, int i, int i2, int i3, int i4, boolean z) {
        this(bufferPool, i, i2, i3, i4, z, 0);
    }

    Texture(BufferPool bufferPool, int i, int i2, int i3, int i4, boolean z, int i5) {
        byte b;
        super(10);
        this.f472b = -1;
        this.f480r = 0;
        this.f477g = null;
        this.f478p = null;
        this.f485w = (byte) -1;
        this.f487y = false;
        if (bufferPool != null && bufferPool.getType() != 3) {
            throw new IllegalArgumentException();
        }
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        this.f481s = bufferPool;
        this.f472b = i;
        if (i2 <= 0 || i2 > 20) {
            throw new IllegalArgumentException();
        }
        if (i2 == 19) {
            throw new IllegalArgumentException();
        }
        boolean z2 = i3 <= 1024 && i4 <= 1024 && i3 > 0 && i4 > 0 && ((i3 + (-1)) & i3) == 0 && ((i4 + (-1)) & i4) == 0;
        if (!z2) {
            throw new IllegalArgumentException();
        }
        if (!z && z) {
            throw new IllegalArgumentException();
        }
        if (i2 == 20 && z) {
            throw new IllegalArgumentException();
        }
        this.f475e = i2;
        this.f473c = i3;
        this.f474d = i4;
        this.f468C = Util3D.m289a(i3);
        this.f469D = Util3D.m289a(i4);
        if (i2 == 20) {
            int iM300d = Util3D.m300d(i3 * i4 * f466a[20].f791a);
            this.f484v = Image.createImage(i3, i4);
            this.f470E = this.f484v.getGraphics();
            this.f476f = 1;
            this.f477g = new ByteBuffer[this.f476f];
            if (this.f481s != null) {
                this.f482t = new C0122u[this.f476f];
                this.f482t[0] = this.f481s.m69a(this, iM300d, 0);
                if (this.f482t[0] == null) {
                    throw new OutOfMemoryError();
                }
                this.f477g[0] = (ByteBuffer) this.f481s.f156a[0];
            } else {
                this.f477g[0] = DirectBufferFactory.getFactory().allocateByteBuffer(iM300d);
            }
        } else {
            m243a(i2, this.f468C, this.f469D, z);
        }
        switch (this.f475e) {
            case 2:
            case 20:
                b = 4;
                break;
            case 3:
            case 4:
            case 5:
                b = 2;
                break;
            default:
                b = 1;
                break;
        }
        this.f486x = b;
    }

    /* JADX INFO: renamed from: a */
    private final void m243a(int i, int i2, int i3, boolean z) {
        int i4;
        DirectBufferFactory factory = DirectBufferFactory.getFactory();
        if (f466a[i].f792b > 0) {
            this.f479q = getPaletteSize();
            i4 = f466a[i].f791a;
        } else {
            this.f479q = 0;
            i4 = f466a[i].f791a;
        }
        int i5 = 1 << i2;
        int i6 = 1 << i3;
        if (!z) {
            this.f476f = 1;
            int iM300d = i4 > 0 ? this.f479q + Util3D.m300d(i6 * i5 * i4) : this.f479q + Util3D.m300d(i6 * ((i5 + 1) >> 1));
            if (this.f481s != null) {
                this.f482t = new C0122u[this.f476f];
                this.f482t[0] = this.f481s.m69a(this, iM300d, 0);
                if (this.f482t[0] == null) {
                    throw new OutOfMemoryError();
                }
            }
            if (this.f479q > 0) {
                if (this.f481s != null) {
                    this.f478p = this.f481s.f156a[0];
                    return;
                } else {
                    this.f478p = factory.allocateByteBuffer(iM300d);
                    return;
                }
            }
            this.f477g = new ByteBuffer[this.f476f];
            if (this.f481s != null) {
                this.f477g[0] = (ByteBuffer) this.f481s.f156a[0];
                return;
            } else {
                this.f477g[0] = factory.allocateByteBuffer(iM300d);
                return;
            }
        }
        if (i3 <= i2) {
            i3 = i2;
        }
        this.f476f = i3 + 1;
        if (this.f479q == 0) {
            this.f477g = new ByteBuffer[this.f476f];
            if (this.f481s != null) {
                this.f482t = new C0122u[this.f476f];
            }
        }
        int iM300d2 = 0;
        for (int i7 = 0; i7 < this.f476f; i7++) {
            if (i5 < 1) {
                i5 = 1;
            }
            if (i6 < 1) {
                i6 = 1;
            }
            iM300d2 = i4 > 0 ? iM300d2 + Util3D.m300d(i5 * i6 * i4) : iM300d2 + Util3D.m300d(((i5 + 1) >> 1) * i6);
            i5 >>= 1;
            i6 >>= 1;
            if (this.f479q == 0) {
                if (this.f481s != null) {
                    this.f482t[i7] = this.f481s.m69a(this, iM300d2, 0);
                    if (this.f482t[i7] == null) {
                        throw new OutOfMemoryError();
                    }
                    this.f477g[i7] = (ByteBuffer) this.f481s.f156a[0];
                } else {
                    this.f477g[i7] = factory.allocateByteBuffer(iM300d2);
                }
                iM300d2 = 0;
            }
        }
        if (this.f479q > 0) {
            if (this.f481s == null) {
                this.f478p = factory.allocateByteBuffer(iM300d2 + this.f479q);
                return;
            }
            this.f482t = new C0122u[1];
            this.f482t[0] = this.f481s.m69a(this, iM300d2 + this.f479q, 0);
            if (this.f482t[0] == null) {
                throw new OutOfMemoryError();
            }
            this.f478p = this.f481s.f156a[0];
        }
    }

    /* JADX INFO: renamed from: b */
    private final int m244b(int i) {
        int i2 = this.f473c;
        int i3 = this.f474d;
        int i4 = f466a[this.f475e].f791a;
        int paletteSize = getPaletteSize();
        int i5 = 0;
        while (i5 < i) {
            if (i2 < 1) {
                i2 = 1;
            }
            if (i3 < 1) {
                i3 = 1;
            }
            int i6 = i4 > 0 ? i2 * i3 * i4 : ((i2 + 1) >> 1) * i3;
            i2 >>= 1;
            i3 >>= 1;
            i5++;
            paletteSize = i6 + paletteSize;
        }
        return paletteSize;
    }

    /* JADX INFO: renamed from: a */
    final boolean m245a() {
        return this.f475e == 20 && this.f484v != null;
    }

    /* JADX INFO: renamed from: a */
    final boolean m246a(GraphicsOGL graphicsOGL, C0009ah c0009ah) {
        if (!this.f487y) {
            this.f480r = C0009ah.m355a(graphicsOGL, this);
            this.f487y = true;
            this.f485w = (byte) -1;
            this.f471F = false;
            return true;
        }
        if (this.f471F) {
            this.f480r = C0009ah.m360b(graphicsOGL, this);
            this.f487y = true;
            this.f485w = (byte) -1;
            this.f471F = false;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    final boolean m247b() {
        return f466a[this.f475e].f792b > 0;
    }

    public final int getGid() {
        return this.f472b;
    }

    public final Graphics getGraphicsContext() {
        return this.f470E;
    }

    public final Image getGraphicsSurface() {
        return this.f484v;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void getImage(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) throws IllegalStateException {
        int i7;
        int i8;
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (this.f475e != i) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f476f) {
            throw new IllegalArgumentException();
        }
        if (i5 <= 0 || i6 <= 0) {
            throw new IllegalArgumentException();
        }
        if (1024 < i5 || 1024 < i6) {
            throw new IllegalArgumentException();
        }
        if (this.f475e == 21 || this.f475e == 22) {
            throw new IllegalStateException();
        }
        if (this.f475e == 20) {
            throw new IllegalStateException();
        }
        if (this.f477g == null && this.f478p == null) {
            throw new IllegalStateException();
        }
        getLevelSize(i2, f467z);
        f464A.f460a = i3;
        f464A.f461b = i4;
        f464A.f462c = i3 + i5;
        f464A.f463d = i4 + i6;
        if (f467z.intersect(f464A, f465B)) {
            int i9 = f467z.f462c;
            int i10 = f467z.f463d;
            int i11 = f465B.f462c;
            int i12 = f465B.f463d;
            int i13 = f466a[this.f475e].f791a;
            switch (i13) {
                case 0:
                    int i14 = ((i11 < i9 ? i9 - i11 : 0) >> 1) + ((i3 > 0 ? i3 : 0) >> 1);
                    int i15 = ((i11 < i3 + i5 ? (i3 + i5) - i11 : 0) >> 1) + ((i3 < 0 ? -i3 : 0) >> 1);
                    int i16 = (((i9 + 1) >> 1) * (i4 > 0 ? i4 : 0)) + ((i3 > 0 ? i3 : 0) >> 1);
                    int i17 = (((i5 + 1) >> 1) * (i4 < 0 ? -i4 : 0)) + ((i3 < 0 ? -i3 : 0) >> 1);
                    int i18 = (i9 * i10) >> 1;
                    if (i18 == 0) {
                        i18 = 1;
                    }
                    byte[] bArr2 = new byte[i18];
                    byte[] bArr3 = this.f477g != null ? this.f477g[i2].get(this.f481s != null ? this.f482t[i2].f1033a : 0, bArr2, 0, i18) : this.f478p.get((this.f481s != null ? this.f482t[0].f1033a : 0) + m244b(i2), bArr2, 0, i18);
                    int i19 = i3 > 0 ? i3 : 0;
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    int i20 = i17;
                    while (i4 < i12) {
                        int i21 = i3 < 0 ? -i3 : 0;
                        int i22 = i19;
                        while (i22 < i11) {
                            if ((i22 & 1) != 0) {
                                i7 = bArr3[i16] & 15;
                                i16++;
                            } else {
                                i7 = (bArr3[i16] & 240) >> 4;
                            }
                            if ((i21 & 1) != 0) {
                                bArr[i20] = (byte) (bArr[i20] & 240);
                                bArr[i20] = (byte) (bArr[i20] | i7);
                                i8 = i20 + 1;
                            } else {
                                bArr[i20] = (byte) (bArr[i20] & 15);
                                bArr[i20] = (byte) (bArr[i20] | (i7 << 4));
                                i8 = i20;
                            }
                            i22++;
                            i20 = i8;
                            i21++;
                        }
                        int i23 = (i22 & 1) != 0 ? i16 + 1 : i16;
                        if ((i21 & 1) != 0) {
                            i20++;
                        }
                        i16 = i23 + i14;
                        i20 += i15;
                        i4++;
                    }
                    return;
                default:
                    int i24 = ((i3 > 0 ? i3 : 0) + (i11 < i9 ? i9 - i11 : 0)) * i13;
                    int i25 = ((i3 < 0 ? -i3 : 0) + (i11 < i3 + i5 ? (i3 + i5) - i11 : 0)) * i13;
                    int i26 = ((i3 > 0 ? i3 : 0) + (i9 * (i4 > 0 ? i4 : 0))) * i13;
                    int i27 = ((i3 < 0 ? -i3 : 0) + (i5 * (i4 < 0 ? -i4 : 0))) * i13;
                    int i28 = i9 * i10 * i13;
                    byte[] bArr4 = new byte[i28];
                    byte[] bArr5 = this.f477g != null ? this.f477g[i2].get(this.f481s != null ? this.f482t[i2].f1033a : 0, bArr4, 0, i28) : this.f478p.get((this.f481s != null ? this.f482t[0].f1033a : 0) + m244b(i2), bArr4, 0, i9 * i10 * i13);
                    int i29 = i3 > 0 ? i3 : 0;
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    int i30 = i26;
                    while (i4 < i12) {
                        for (int i31 = i29; i31 < i11; i31++) {
                            int i32 = i30;
                            int i33 = 0;
                            while (i33 < i13) {
                                bArr[i27] = bArr5[i32];
                                i33++;
                                i27++;
                                i32++;
                            }
                            i30 = i32;
                        }
                        i30 += i24;
                        i27 += i25;
                        i4++;
                    }
                    return;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final int getImageSize(int i) throws IllegalStateException {
        if (i < 0 || i >= this.f476f) {
            throw new IllegalArgumentException();
        }
        if (this.f475e == 21 || this.f475e == 22) {
            throw new IllegalStateException();
        }
        int i2 = f466a[this.f475e].f791a;
        getLevelSize(i, f467z);
        switch (i2) {
            case 0:
                return (f467z.f462c * f467z.f463d) >> 1;
            default:
                return i2 * f467z.f462c * f467z.f463d;
        }
    }

    public final int getLevelNum() {
        return this.f476f;
    }

    public final void getLevelSize(int i, RegionI regionI) {
        if (regionI == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i >= this.f476f) {
            throw new IllegalArgumentException();
        }
        regionI.f460a = 0;
        regionI.f461b = 0;
        regionI.f462c = this.f473c;
        regionI.f463d = this.f474d;
        for (int i2 = 0; i2 < this.f476f; i2++) {
            regionI.f462c = regionI.f462c < 1 ? 1 : regionI.f462c;
            regionI.f463d = regionI.f463d < 1 ? 1 : regionI.f463d;
            if (i2 == i) {
                return;
            }
            regionI.f462c >>= 1;
            regionI.f463d >>= 1;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void getPalette(int i, byte[] bArr) throws IllegalStateException {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (this.f475e != i) {
            throw new IllegalArgumentException();
        }
        if (bArr.length < getPaletteSize()) {
            throw new IllegalArgumentException();
        }
        if (this.f475e == 20) {
            throw new IllegalStateException();
        }
        if (this.f478p == null) {
            throw new IllegalStateException();
        }
        this.f478p.get(this.f481s != null ? this.f482t[0].f1033a : 0, bArr, 0, getPaletteSize());
    }

    public final int getPaletteSize() {
        return f466a[this.f475e].f793c * f466a[this.f475e].f792b;
    }

    public final int getPixelFormat() {
        return this.f475e;
    }

    public final TextureTable getTextureTable() {
        return this.f483u;
    }

    public final void purgeBuffer() {
        this.f478p = null;
        if (this.f477g != null) {
            for (int i = 0; i < this.f477g.length; i++) {
                this.f477g[i] = null;
            }
        }
        if (this.f481s != null) {
            for (int i2 = 0; i2 < this.f482t.length; i2++) {
                this.f482t[i2].f1037e = true;
            }
            this.f481s = null;
            this.f482t = null;
        }
    }

    public final void purgeGLobject(Graphics3D graphics3D, GraphicsOGL graphicsOGL) {
        if (graphics3D == null) {
            throw new NullPointerException();
        }
        if (this.f487y) {
            C0009ah.m364c(graphicsOGL, this);
            this.f487y = false;
        }
        this.f485w = (byte) -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void setImage(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) throws IllegalStateException {
        int i7;
        int i8;
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (this.f475e != i) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0 || i2 >= this.f476f) {
            throw new IllegalArgumentException();
        }
        if (i5 <= 0 || i6 <= 0) {
            throw new IllegalArgumentException();
        }
        if (1024 < i5 || 1024 < i6) {
            throw new IllegalArgumentException();
        }
        if (this.f475e == 21 || this.f475e == 22) {
            throw new IllegalStateException();
        }
        if (this.f475e == 20) {
            throw new IllegalStateException();
        }
        if (this.f477g == null && this.f478p == null) {
            throw new IllegalStateException();
        }
        getLevelSize(i2, f467z);
        f464A.f460a = i3;
        f464A.f461b = i4;
        f464A.f462c = i3 + i5;
        f464A.f463d = i4 + i6;
        if (f467z.intersect(f464A, f465B)) {
            int i9 = f467z.f462c;
            int i10 = f467z.f463d;
            int i11 = f465B.f462c;
            int i12 = f465B.f463d;
            int i13 = f466a[this.f475e].f791a;
            switch (i13) {
                case 0:
                    int i14 = ((i11 < i9 ? i9 - i11 : 0) >> 1) + ((i3 > 0 ? i3 : 0) >> 1);
                    int i15 = ((i11 < i3 + i5 ? (i3 + i5) - i11 : 0) >> 1) + ((i3 < 0 ? -i3 : 0) >> 1);
                    int i16 = (((i9 + 1) >> 1) * (i4 > 0 ? i4 : 0)) + ((i3 > 0 ? i3 : 0) >> 1);
                    int i17 = (((i5 + 1) >> 1) * (i4 < 0 ? -i4 : 0)) + ((i3 < 0 ? -i3 : 0) >> 1);
                    int i18 = (i9 * i10) >> 1;
                    if (i18 == 0) {
                        i18 = 1;
                    }
                    byte[] bArr2 = new byte[i18];
                    byte[] bArr3 = this.f477g != null ? this.f477g[i2].get(this.f481s != null ? this.f482t[i2].f1033a : 0, bArr2, 0, i18) : this.f478p.get((this.f481s != null ? this.f482t[0].f1033a : 0) + m244b(i2), bArr2, 0, i18);
                    int i19 = i3 > 0 ? i3 : 0;
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    while (i4 < i12) {
                        int i20 = i19;
                        int i21 = i3 < 0 ? -i3 : 0;
                        while (i20 < i11) {
                            if ((i21 & 1) != 0) {
                                i7 = bArr[i17] & 15;
                                i17++;
                            } else {
                                i7 = (bArr[i17] & 240) >> 4;
                            }
                            if ((i20 & 1) != 0) {
                                bArr3[i16] = (byte) (bArr3[i16] & 240);
                                bArr3[i16] = (byte) (bArr3[i16] | i7);
                                i8 = i16 + 1;
                            } else {
                                bArr3[i16] = (byte) (bArr3[i16] & 15);
                                bArr3[i16] = (byte) (bArr3[i16] | (i7 << 4));
                                i8 = i16;
                            }
                            i21++;
                            i20++;
                            i16 = i8;
                        }
                        if ((i20 & 1) != 0) {
                            i16++;
                        }
                        i16 += i14;
                        i17 = ((i21 & 1) != 0 ? i17 + 1 : i17) + i15;
                        i4++;
                    }
                    if (this.f477g == null) {
                        if (this.f481s != null) {
                            i19 = this.f482t[0].f1033a;
                        }
                        this.f478p.put(m244b(i2) + i19, bArr3, 0, i18);
                    } else {
                        this.f477g[i2].put(this.f481s != null ? this.f482t[i2].f1033a : i19, bArr3, 0, i18);
                    }
                    break;
                default:
                    int i22 = ((i3 > 0 ? i3 : 0) + (i11 < i9 ? i9 - i11 : 0)) * i13;
                    int i23 = ((i3 < 0 ? -i3 : 0) + (i11 < i3 + i5 ? (i3 + i5) - i11 : 0)) * i13;
                    int i24 = ((i3 > 0 ? i3 : 0) + (i9 * (i4 > 0 ? i4 : 0))) * i13;
                    int i25 = ((i3 < 0 ? -i3 : 0) + (i5 * (i4 < 0 ? -i4 : 0))) * i13;
                    int i26 = i9 * i10 * i13;
                    byte[] bArr4 = new byte[i26];
                    byte[] bArr5 = this.f477g != null ? this.f477g[i2].get(this.f481s != null ? this.f482t[i2].f1033a : 0, bArr4, 0, i26) : this.f478p.get((this.f481s != null ? this.f482t[0].f1033a : 0) + m244b(i2), bArr4, 0, i9 * i10 * i13);
                    int i27 = i3 > 0 ? i3 : 0;
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    int i28 = i25;
                    while (i4 < i12) {
                        int i29 = i27;
                        while (i29 < i11) {
                            int i30 = i24;
                            int i31 = 0;
                            while (i31 < i13) {
                                bArr5[i30] = bArr[i28];
                                i31++;
                                i28++;
                                i30++;
                            }
                            i29++;
                            i24 = i30;
                        }
                        i24 += i22;
                        i28 += i23;
                        i4++;
                    }
                    if (this.f477g == null) {
                        if (this.f481s != null) {
                            i27 = this.f482t[0].f1033a;
                        }
                        this.f478p.put(i27 + m244b(i2), bArr5, 0, i9 * i10 * i13);
                    } else {
                        if (this.f481s != null) {
                            i27 = this.f482t[i2].f1033a;
                        }
                        this.f477g[i2].put(i27, bArr5, 0, i26);
                    }
                    break;
            }
            if (this.f487y) {
                if (this.f485w >= 0) {
                    this.f485w = (byte) -2;
                } else {
                    this.f485w = (byte) i2;
                }
            }
            this.f471F = true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public final void setPalette(int i, byte[] bArr) throws IllegalStateException {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (this.f475e != i) {
            throw new IllegalArgumentException();
        }
        if (bArr.length < getPaletteSize()) {
            throw new IllegalArgumentException();
        }
        if (this.f475e == 20) {
            throw new IllegalStateException();
        }
        if (this.f478p == null) {
            throw new IllegalStateException();
        }
        this.f478p.put(this.f481s != null ? this.f482t[0].f1033a : 0, bArr, 0, getPaletteSize());
        this.f485w = (byte) -2;
        this.f471F = true;
    }
}
