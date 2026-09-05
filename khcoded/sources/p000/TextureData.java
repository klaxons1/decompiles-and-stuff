package p000;

import com.jcraft.jzlib.ZInputStream;
import com.mascotcapsule.eruption.docomostar.Appearance;
import com.mascotcapsule.eruption.docomostar.Texture;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class TextureData {
    private static int[] _ret = new int[2];
    public Appearance[][] app;
    public String[] mctFile;
    public short[][] mctId;
    public float[][][] mctSize;
    public String[] offsetFile;
    public short[][][][] offsetInfo;

    TextureData() {
    }

    public void free() {
        if (this.app != null) {
            for (int i = 0; i < this.app.length; i++) {
                for (int i2 = 0; i2 < this.app[i].length; i2++) {
                    Texture texture = this.app[i][i2].getTexture(0);
                    texture.getTextureTable().purgeBufferAll();
                    texture.getTextureTable().purgeGLobjectAll(GameCommon.f56g3, GameCommon.ogl);
                }
            }
        }
        this.app = (Appearance[][]) null;
        this.mctId = (short[][]) null;
        this.offsetFile = null;
        this.mctSize = (float[][][]) null;
    }

    public int getGraphicIndex(int[] iArr) {
        int length;
        int i = 0;
        for (int i2 = 0; i2 <= iArr[0]; i2++) {
            if (i2 != iArr[0]) {
                length = i;
                for (int i3 = 0; i3 < this.offsetInfo[i2].length; i3++) {
                    length -= this.offsetInfo[i2][i3].length;
                }
            } else {
                length = i;
                for (int i4 = 0; i4 < iArr[1]; i4++) {
                    length -= this.offsetInfo[i2][i4].length;
                }
            }
            i = length;
        }
        return i;
    }

    public int getHeight(int i) {
        int[] offsetIndex = getOffsetIndex(i);
        return this.offsetInfo[offsetIndex[0]][offsetIndex[1]][getGraphicIndex(offsetIndex) + i][5];
    }

    public int[] getOffsetIndex(int i) {
        int[] iArr = _ret;
        _ret[1] = 0;
        iArr[0] = 0;
        int length = 0;
        boolean z = false;
        for (int i2 = 0; i2 < this.offsetInfo.length; i2++) {
            for (int i3 = 0; i3 < this.offsetInfo[i2].length; i3++) {
                if (i <= (this.offsetInfo[i2][i3].length - 1) + length) {
                    _ret[0] = i2;
                    _ret[1] = i3;
                    z = true;
                    break;
                }
                length += this.offsetInfo[i2][i3].length;
            }
            if (z) {
                break;
            }
        }
        return _ret;
    }

    public int getWidth(int i) {
        int[] offsetIndex = getOffsetIndex(i);
        return this.offsetInfo[offsetIndex[0]][offsetIndex[1]][getGraphicIndex(offsetIndex) + i][4];
    }

    public void init(String[] strArr) {
        this.mctFile = new String[Util.s2i(Util.strtok(strArr, ","))];
        for (int i = 0; i < this.mctFile.length; i++) {
            this.mctFile[i] = Util.strtok(strArr, ",");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public void load() {
        Throwable th;
        ZInputStream zInputStream;
        ?? r3;
        ZInputStream zInputStream2;
        ?? r4;
        ?? r5;
        InputStream inputStreamByte2InputStream = null;
        try {
            this.offsetInfo = new short[this.mctFile.length][][][];
            this.mctId = new short[this.mctFile.length][];
            this.mctSize = new float[this.mctFile.length][][];
            this.app = new Appearance[this.mctFile.length][];
            int i = 0;
            ZInputStream zInputStream3 = null;
            while (true) {
                try {
                    r5 = inputStreamByte2InputStream;
                    if (i >= this.mctFile.length) {
                        break;
                    }
                    inputStreamByte2InputStream = Util.byte2InputStream(StrageDeviceAccess.readStrage(this.mctFile[i]));
                    try {
                        zInputStream2 = new ZInputStream(inputStreamByte2InputStream);
                        try {
                            this.offsetInfo[i] = new short[zInputStream2.read()][][];
                            this.mctId[i] = new short[this.offsetInfo[i].length];
                            this.mctSize[i] = new float[this.offsetInfo[i].length][];
                            Appearance[][] appearanceArr = this.app;
                            Appearance[] appearanceArr2 = new Appearance[this.offsetInfo[i].length];
                            appearanceArr[i] = appearanceArr2;
                            int i2 = 0;
                            r5 = appearanceArr2;
                            while (i2 < this.offsetInfo[i].length) {
                                this.mctId[i][i2] = Util.readShort(zInputStream2);
                                this.mctSize[i][i2] = new float[2];
                                this.mctSize[i][i2][0] = Util.readShort(zInputStream2);
                                this.mctSize[i][i2][1] = Util.readShort(zInputStream2);
                                this.offsetInfo[i][i2] = new short[Util.readShort(zInputStream2)][];
                                int i3 = 0;
                                while (i3 < this.offsetInfo[i][i2].length) {
                                    this.offsetInfo[i][i2][i3] = new short[8];
                                    for (int i4 = 0; i4 < this.offsetInfo[i][i2][i3].length; i4++) {
                                        this.offsetInfo[i][i2][i3][i4] = Util.readShort(zInputStream2);
                                    }
                                    i3++;
                                }
                                i2++;
                                r5 = i3;
                            }
                            i++;
                            zInputStream3 = zInputStream2;
                        } catch (Exception e) {
                            r4 = inputStreamByte2InputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            zInputStream = zInputStream2;
                            r3 = inputStreamByte2InputStream;
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                } catch (Exception e2) {
                                    throw th;
                                }
                            }
                            if (zInputStream == null) {
                                throw th;
                            }
                            zInputStream.close();
                            throw th;
                        }
                    } catch (Exception e3) {
                        zInputStream2 = zInputStream3;
                        r4 = inputStreamByte2InputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        zInputStream = zInputStream3;
                        r3 = inputStreamByte2InputStream;
                    }
                } catch (Exception e4) {
                    zInputStream2 = zInputStream3;
                    r4 = r5;
                } catch (Throwable th4) {
                    th = th4;
                    zInputStream = zInputStream3;
                    r3 = r5;
                }
                if (r4 != 0) {
                    try {
                        r4.close();
                    } catch (Exception e5) {
                        return;
                    }
                }
                if (zInputStream2 != null) {
                    zInputStream2.close();
                    return;
                }
                return;
            }
            for (int i5 = 0; i5 < this.mctFile.length; i5++) {
                ErpObject erpObjectReadObject3DZipStream = GameCommon.ReadObject3DZipStream(zInputStream3, 0, false);
                for (int i6 = 0; i6 < this.app[i5].length; i6++) {
                    Texture objectTexture = GameCommon.getObjectTexture(erpObjectReadObject3DZipStream, this.mctId[i5][i6]);
                    this.app[i5][i6] = new Appearance();
                    this.app[i5][i6].setAlphaThreshold(1);
                    this.app[i5][i6].setBlendMode(0);
                    this.app[i5][i6].setTextureBlendMode(0, 4);
                    this.app[i5][i6].setProperties(this.app[i5][i6].getProperties() ^ 8);
                    this.app[i5][i6].setTexture(0, objectTexture);
                    this.app[i5][i6].setTextureCombineRgbScale(0, 2.0f);
                }
            }
            if (r5 != 0) {
                try {
                    r5.close();
                } catch (Exception e6) {
                    return;
                }
            }
            if (zInputStream3 != null) {
                zInputStream3.close();
            }
        } catch (Exception e7) {
            zInputStream2 = null;
            r4 = 0;
        } catch (Throwable th5) {
            th = th5;
            zInputStream = null;
            r3 = 0;
        }
    }

    public void loadFace(String str, boolean z) {
        Throwable th;
        ZInputStream zInputStream;
        InputStream inputStreamByte2InputStream;
        ZInputStream zInputStream2;
        if (str == null || str.length() == 0 || str.equals("NULL")) {
            return;
        }
        try {
            this.offsetInfo = new short[1][][][];
            this.mctId = new short[1][];
            this.mctSize = new float[1][][];
            this.app = new Appearance[1][];
            inputStreamByte2InputStream = Util.byte2InputStream(StrageDeviceAccess.readStrage(str));
            try {
                zInputStream2 = new ZInputStream(inputStreamByte2InputStream);
                try {
                    this.offsetInfo[0] = new short[zInputStream2.read()][][];
                    this.mctId[0] = new short[this.offsetInfo[0].length];
                    this.mctSize[0] = new float[this.offsetInfo[0].length][];
                    this.app[0] = new Appearance[this.offsetInfo[0].length];
                    for (int i = 0; i < this.offsetInfo[0].length; i++) {
                        this.mctId[0][i] = Util.readShort(zInputStream2);
                        this.mctSize[0][i] = new float[2];
                        this.mctSize[0][i][0] = Util.readShort(zInputStream2);
                        this.mctSize[0][i][1] = Util.readShort(zInputStream2);
                    }
                    this.offsetInfo[0][0] = new short[Util.readShort(zInputStream2)][];
                    for (int i2 = 0; i2 < this.offsetInfo[0][0].length; i2++) {
                        this.offsetInfo[0][0][i2] = new short[8];
                        for (int i3 = 0; i3 < this.offsetInfo[0][0][i2].length; i3++) {
                            this.offsetInfo[0][0][i2][i3] = Util.readShort(zInputStream2);
                        }
                    }
                    ErpObject erpObjectReadObject3DZipStream = GameCommon.ReadObject3DZipStream(zInputStream2, 0, false);
                    for (int i4 = 0; i4 < this.app[0].length; i4++) {
                        Texture objectTexture = GameCommon.getObjectTexture(erpObjectReadObject3DZipStream, this.mctId[0][i4]);
                        this.app[0][i4] = new Appearance();
                        this.app[0][i4].setAlphaThreshold(1);
                        this.app[0][i4].setBlendMode(0);
                        this.app[0][i4].setTextureBlendMode(0, 4);
                        this.app[0][i4].setProperties(this.app[0][i4].getProperties() ^ 8);
                        this.app[0][i4].setTexture(0, objectTexture);
                        this.app[0][i4].setTextureCombineRgbScale(0, 2.0f);
                    }
                    char c = !z ? (char) 1 : (char) 0;
                    int i5 = zInputStream2.read();
                    Game.FACE_ANIM_TBL[c] = new int[i5][];
                    Game.FACE_ANIM_TYPE_TBL[c] = new int[i5];
                    Game.FACE_ANIM_COLOR[c] = new int[i5];
                    Game.FACE_ANIM_ANIM_TBL[c] = new int[i5][];
                    for (int i6 = 0; i6 < i5; i6++) {
                        Game.FACE_ANIM_TBL[c][i6] = new int[zInputStream2.read()];
                        Game.FACE_ANIM_TYPE_TBL[c][i6] = zInputStream2.read();
                        for (int i7 = 0; i7 < Game.FACE_ANIM_TBL[c][i6].length; i7++) {
                            Game.FACE_ANIM_TBL[c][i6][i7] = Util.readShort(zInputStream2);
                        }
                    }
                    for (int i8 = 0; i8 < i5; i8++) {
                        Game.FACE_ANIM_COLOR[c][i8] = (zInputStream2.read() << 16) | (zInputStream2.read() << 8) | zInputStream2.read();
                    }
                    for (int i9 = 0; i9 < i5; i9++) {
                        Game.FACE_ANIM_ANIM_TBL[c][i9] = new int[zInputStream2.read()];
                        for (int i10 = 0; i10 < Game.FACE_ANIM_ANIM_TBL[c][i9].length; i10++) {
                            Game.FACE_ANIM_ANIM_TBL[c][i9][i10] = zInputStream2.read();
                        }
                    }
                    if (inputStreamByte2InputStream != null) {
                        try {
                            inputStreamByte2InputStream.close();
                        } catch (Exception e) {
                            return;
                        }
                    }
                    if (zInputStream2 != null) {
                        zInputStream2.close();
                    }
                } catch (Exception e2) {
                    if (inputStreamByte2InputStream != null) {
                        try {
                            inputStreamByte2InputStream.close();
                        } catch (Exception e3) {
                            return;
                        }
                    }
                    if (zInputStream2 != null) {
                        zInputStream2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zInputStream = zInputStream2;
                    if (inputStreamByte2InputStream != null) {
                        try {
                            inputStreamByte2InputStream.close();
                        } catch (Exception e4) {
                            throw th;
                        }
                    }
                    if (zInputStream == null) {
                        throw th;
                    }
                    zInputStream.close();
                    throw th;
                }
            } catch (Exception e5) {
                zInputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                zInputStream = null;
            }
        } catch (Exception e6) {
            zInputStream2 = null;
            inputStreamByte2InputStream = null;
        } catch (Throwable th4) {
            th = th4;
            zInputStream = null;
            inputStreamByte2InputStream = null;
        }
    }

    public void setBlendMode(int i, int i2) {
        int[] offsetIndex = getOffsetIndex(i);
        this.app[offsetIndex[0]][offsetIndex[1]].setBlendMode(i2);
    }
}
