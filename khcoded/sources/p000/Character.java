package p000;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.ogl.GraphicsOGL;
import com.docomostar.ui.util3d.FastMath;
import com.mascotcapsule.eruption.docomostar.Appearance;
import com.mascotcapsule.eruption.docomostar.Figure;
import com.mascotcapsule.eruption.docomostar.Graphics3D;
import com.mascotcapsule.eruption.docomostar.IndexBuffer;
import com.mascotcapsule.eruption.docomostar.Light;
import com.mascotcapsule.eruption.docomostar.RegionI;
import com.mascotcapsule.eruption.docomostar.Texture;
import com.mascotcapsule.eruption.docomostar.TextureTable;
import com.mascotcapsule.eruption.docomostar.Transform;
import com.mascotcapsule.eruption.docomostar.Util3D;
import com.mascotcapsule.eruption.docomostar.Vector3D;
import com.mascotcapsule.eruption.docomostar.VertexBuffer;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Character {
    private static final byte AFTERIMAGE_MAX = 4;
    private static final byte AIMAGE_DATA_DIR = 3;
    private static final byte AIMAGE_DATA_IMG = 4;
    private static final byte AIMAGE_DATA_MAX = 6;
    private static final byte AIMAGE_DATA_X = 0;
    private static final byte AIMAGE_DATA_Y = 1;
    private static final byte AIMAGE_DATA_Z = 2;
    public static final byte CHAR_BASE_DRAW_TYPE = 1;
    public static final byte CHAR_BASE_ID = 0;
    public static final byte CHAR_BASE_MAX = 6;
    public static final byte CHAR_BASE_REVATK = 3;
    public static final byte CHAR_BASE_REVDEF = 4;
    public static final byte CHAR_BASE_REVEXP = 5;
    public static final byte CHAR_BASE_REVHP = 2;
    public static final byte CHAR_ID_MAX = 11;
    public static final byte CHAR_POS_AIR = 1;
    public static final byte CHAR_POS_GROUND = 0;
    public static final byte CHAR_POS_INVISIBLE = 2;
    public static final byte IMG_INFO_ALIVE_CNT = 6;
    public static final byte IMG_INFO_DEPTH = 2;
    public static final byte IMG_INFO_FLINCH_MAX = 8;
    public static final byte IMG_INFO_FLINCH_MIN = 7;
    public static final byte IMG_INFO_GUARD_ATTR = 4;
    public static final byte IMG_INFO_HEIGHT = 1;
    public static final byte IMG_INFO_MAX = 9;
    public static final byte IMG_INFO_POSITION = 5;
    public static final byte IMG_INFO_SHADOW = 3;
    public static final byte IMG_INFO_WIDTH = 0;
    public static final float SORA_DEFAULT_SPD = 1.2f;
    public static CharData[] charData = null;
    public static final int charDataMax = 100;
    public static int[][] charIdList;
    public static Light light;
    private static Figure[][] preFigure;
    private static Figure[][] preFigureAfter;
    private static Figure[] preFigureShadow;
    private static short preTexMaxSize = 1024;
    private static byte preTexMax = 2;
    public static short[][][] motionId = new short[11][][];
    public static short[][][][] motionData = new short[11][][][];
    public static float[][][] imageInfo = new float[11][][];
    public static final float[] rollMove = {2.5f, 2.2f, 1.9f, 1.4f, 0.6f, 0.3f, 0.2f, 0.1f, 0.0f, 0.0f, 0.0f};
    public static Figure[] figData = new Figure[11];
    public static TextureTable[][] charTexTbls = new TextureTable[11][];
    public static short[][][][][] texInfo = new short[11][][][][];
    public static int[][] texUserIdMin = new int[11][];
    public static float[][] texMag = new float[11][];
    public static int[][] texAlpha = new int[11][];
    public static short soraCharId = 0;
    public static short[][] charBase = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 11, 6);
    private static float[][] _xz_ = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
    private static int afterImage = -1;
    private static float[][] aImageData = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 6);
    private static int useFigure = 0;
    private static RegionI _reg = new RegionI();
    private static short[] _tex = new short[8];
    private static Vector3D _vec = new Vector3D();

    Character() {
    }

    public static void afterImageMove() {
        for (int length = aImageData.length - 2; length >= 0; length--) {
            aImageData[length + 1][0] = aImageData[length][0];
            aImageData[length + 1][1] = aImageData[length][1];
            aImageData[length + 1][2] = aImageData[length][2];
            aImageData[length + 1][3] = aImageData[length][3];
            aImageData[length + 1][4] = aImageData[length][4];
        }
        aImageData[0][0] = charData[afterImage].f69x;
        aImageData[0][1] = charData[afterImage].f70y;
        aImageData[0][2] = charData[afterImage].f71z;
        aImageData[0][3] = charData[afterImage].dir;
        aImageData[0][4] = charData[afterImage].image;
    }

    public static void afterImageSet(int i) {
        int charIndex;
        afterImage = i;
        if (i < 0 || (charIndex = getCharIndex(charData[i].charId)) < 0) {
            return;
        }
        for (int i2 = 0; i2 < aImageData.length; i2++) {
            afterImageMove();
        }
        if (charData[i].drawType == 1) {
            short s = 0;
            for (int i3 = 0; i3 < texInfo[charIndex][charData[i].motionNo].length; i3++) {
                for (int i4 = 0; i4 < texInfo[charIndex][charData[i].motionNo][i3].length; i4++) {
                    if (s < texInfo[charIndex][charData[i].motionNo][i3][i4][0]) {
                        s = texInfo[charIndex][charData[i].motionNo][i3][i4][0];
                    }
                }
            }
            for (int i5 = 0; i5 < preFigureAfter.length; i5++) {
                for (int i6 = 0; i6 <= s - texUserIdMin[charIndex][charData[i].motionNo]; i6++) {
                    preFigureAfter[i5][i6].getIndexBuffer(0).getAppearance().setTexture(0, charTexTbls[charIndex][texUserIdMin[charIndex][charData[i].motionNo] + i6].findTexture(charTexTbls[charIndex][texUserIdMin[charIndex][charData[i].motionNo] + i6].getUserId()));
                }
            }
        }
    }

    public static void allMotionMove() {
        for (int i = 0; i < charData.length; i++) {
            if (charData[i].use) {
                motionMove(i);
            }
        }
    }

    public static boolean checkCharsHit(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        getCharXZ(f7, f4, f6, _xz_[2]);
        getCharXZ(f14, f11, f13, _xz_[3]);
        return Math.abs(f - f8) < (_xz_[2][0] + _xz_[3][0]) / 2.0f && Math.abs(f3 - f10) < (_xz_[2][1] + _xz_[3][1]) / 2.0f && ((f9 <= f2 && f2 - f9 < f12) || (f9 > f2 && f9 - f2 < f5));
    }

    public static boolean checkCharsHit(int i, int i2) {
        if (i == i2) {
            return false;
        }
        Attack.relativeChange(charData[i].dir, charData[i].ahX, charData[i].ahZ, 0, false, _xz_[0]);
        Attack.relativeChange(charData[i2].dir, charData[i2].ahX, charData[i2].ahZ, 0, false, _xz_[1]);
        return checkCharsHit(charData[i].f69x + _xz_[0][0], charData[i].f70y + charData[i].ahY, charData[i].f71z + _xz_[0][1], charData[i].ahWidth, charData[i].ahHeight, charData[i].ahDepth, charData[i].dir, charData[i2].f69x + _xz_[1][0], charData[i2].f70y + charData[i2].ahY, charData[i2].f71z + _xz_[1][1], charData[i2].ahWidth, charData[i2].ahHeight, charData[i2].ahDepth, charData[i2].dir);
    }

    public static boolean checkCharsHitXZ(int i, int i2) {
        if (i == i2) {
            return false;
        }
        Attack.relativeChange(charData[i].dir, charData[i].ahX, charData[i].ahZ, 0, false, _xz_[0]);
        Attack.relativeChange(charData[i2].dir, charData[i2].ahX, charData[i2].ahZ, 0, false, _xz_[1]);
        return checkCharsHit(charData[i].f69x + _xz_[0][0], 0.0f, charData[i].f71z + _xz_[0][1], charData[i].ahWidth, 1.0f, charData[i].ahDepth, charData[i].dir, charData[i2].f69x + _xz_[1][0], 0.0f, charData[i2].f71z + _xz_[1][1], charData[i2].ahWidth, 1.0f, charData[i2].ahDepth, charData[i2].dir);
    }

    public static boolean checkHaveMotion(int i, int i2) {
        int charIndex = getCharIndex(charData[i].charId);
        for (int i3 = 0; i3 < motionId[charIndex][charData[i].motionNo].length; i3++) {
            if (motionId[charIndex][charData[i].motionNo][i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkMoveCharHit(int i, int i2) {
        charData[i].hitChar = (byte) -1;
        for (int i3 = 0; i3 < charData.length; i3++) {
            if (i3 != i && charData[i3].use && i2 >= charData[i3].type && i2 >= charData[i].type && checkCharsHit(i, i3)) {
                if (charData[i].hitChar != 0) {
                    charData[i].hitChar = (byte) i3;
                }
                if (charData[i3].hitChar != 0) {
                    charData[i3].hitChar = (byte) i;
                }
                return true;
            }
        }
        return false;
    }

    public static void checkViewObject() {
        for (int i = 0; i < charData.length; i++) {
            if (!charData[i].use || (!GameStatus.GAME.ghostMode && 0.0f >= CameraData.screenZ(charData[i].f69x, charData[i].f70y, charData[i].f71z, charData[i].width, charData[i].height, charData[i].width, CameraData.clipNear, CameraData.clipFar))) {
                charData[i].disp = false;
            } else {
                charData[i].disp = true;
            }
        }
    }

    public static void cure(int i, int i2) {
        if (GameStatus.PLAYER.getNumberData(19) == 5 || charData[i].f12hp != 0) {
            CharData charData2 = charData[i];
            charData2.f12hp = (short) (charData2.f12hp + i2);
            charData[i].f12hp = (short) Math.min((int) charData[i].f12hp, (int) charData[i].maxHp);
        }
    }

    public static void dmg(int i, int i2) {
        charData[i].dmgHp = charData[i].f12hp;
        charData[i].dmg = i2;
        charData[i].dmgCnt = (short) 15;
        charData[i].f12hp = (short) Math.min((int) charData[i].maxHp, Math.max(0, charData[i].f12hp - i2));
        if (i == 0 && GameStatus.GAME.dbgHpFlg) {
            charData[i].f12hp = (short) 1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public static void draw(GraphicsOGL graphicsOGL, Graphics3D graphics3D, int i, boolean z) throws IllegalStateException {
        int i2;
        int iMin;
        float f;
        short s = charData[i].motion;
        if (s == 18 && charData[i].glideDir != 0) {
            int iDirTo8 = Util.dirTo8(charData[i].dir - CameraData.dirDelay);
            s = ((charData[i].glideDir >= 0 || iDirTo8 > 4) && (charData[i].glideDir <= 0 || iDirTo8 <= 4)) ? (short) 19 : (short) 20;
        } else if (charData[i].getBitState(16)) {
            if (s == 1) {
                s = 25;
            }
            if (s == 0) {
                s = 24;
            }
        }
        int charIndex = getCharIndex(charData[i].charId);
        if (charIndex < 0) {
            return;
        }
        charData[i].image = motionData[charIndex][charData[i].motionNo][getMotionIndex(i, s)][(int) charData[i].frame];
        charData[i].f16ts.setTranslate(charData[i].f69x, charData[i].f70y, charData[i].f71z);
        if (charData[i].delCnt < 100) {
            i2 = (charData[i].delCnt * 255) / 100;
        } else {
            i2 = charData[i].getBitState(1024) ? charData[i].alpha : 255;
        }
        int i3 = charData[i].ambient;
        if (i == 0) {
            iMin = (((int) Math.min(255.0f, ((i3 >> 16) & 255) * 1.3f)) << 16) | ((int) Math.min(255.0f, (i3 & 255) * 1.3f)) | (((int) Math.min(255.0f, ((i3 >> 8) & 255) * 1.3f)) << 8);
        } else {
            iMin = i3;
        }
        float f2 = charData[i].scale;
        if (charData[i].drawType == 1) {
            f = f2 * texMag[charIndex][charData[i].motionNo];
            charData[i].figure = setPrePrim(graphics3D, i, charData[i].image, charData[i].dir, charData[i].f16ts, (i2 << 24) | iMin, preFigure[i]);
        } else if (charData[i].drawType == 2) {
            if (i2 == 0) {
                return;
            }
            if (charData[i].figure == null || figData[charIndex] != null) {
                charData[i].figure = figData[charIndex];
            }
            charData[i].figure.setFrame(charData[i].image);
            Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), charData[i].dir / 360.0f, charData[i].f16ts);
            f = f2;
        } else {
            if (charData[i].drawType == 4) {
                short s2 = charData[i].image;
                MapData.timeEnd = s2;
                MapData.timeStart = s2;
                MapData.time = s2;
                return;
            }
            f = f2;
        }
        if (f != 1.0f) {
            Util.setScale(f, f, f, charData[i].f16ts);
        }
        graphics3D.addDrawQueueFigure(graphicsOGL, charData[i].figure, charData[i].f16ts);
        if (i == 0 && i2 == 255) {
            graphics3D.addDrawQueueFigure(graphicsOGL, setPrePrim(graphics3D, i, charData[i].image, charData[i].dir, null, (i2 / 6) << 24, preFigureShadow), charData[i].f16ts);
        }
        if (!z || afterImage != i) {
            return;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= aImageData.length) {
                return;
            }
            if (charData[i].f69x != aImageData[i5][0] || charData[i].f70y != aImageData[i5][1] || charData[i].f71z != aImageData[i5][2]) {
                charData[i].f16ts.setTranslate(aImageData[i5][0], aImageData[i5][1], aImageData[i5][2]);
                if (charData[i].drawType == 1) {
                    charData[i].figure = setPrePrim(graphics3D, i, (int) aImageData[i5][4], aImageData[i5][3], charData[i].f16ts, ((70 - (i5 * 10)) << 24) | iMin, preFigureAfter[i5]);
                } else {
                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), charData[i].dir / 360.0f, charData[i].f16ts);
                    if (f != 1.0f) {
                        Util.setScale(f, f, f, charData[i].f16ts);
                    }
                }
                if (f != 1.0f) {
                    Util.setScale(f, f, f, charData[i].f16ts);
                }
                graphics3D.addDrawQueueFigure(graphicsOGL, charData[i].figure, charData[i].f16ts);
            }
            i4 = i5 + 1;
        }
    }

    public static void freeCharId(short s) {
        for (int i = 0; i < charBase.length; i++) {
            if (charBase[i][0] == s) {
                charBase[i][0] = -1;
            }
        }
    }

    public static int getCharIndex(short s) {
        if (s < 0) {
            return -1;
        }
        for (int i = 0; i < charBase.length; i++) {
            if (charBase[i][0] == s) {
                return i;
            }
        }
        return -1;
    }

    public static void getCharXZ(float f, float f2, float f3, float[] fArr) {
        fArr[0] = f2;
        fArr[1] = f3;
        if (45 > ((int) f) % 180 || ((int) f) % 180 > 135) {
            return;
        }
        fArr[0] = f3;
        fArr[1] = f2;
    }

    public static float[] getCharXZ(float f, float f2, float f3) {
        float[] fArr = {f2, f3};
        if (45 <= ((int) f) % 180 && ((int) f) % 180 <= 135) {
            fArr[0] = f3;
            fArr[1] = f2;
        }
        return fArr;
    }

    public static float getCharsDir(int i, float f, float f2) {
        return Util.atan2_360(f - charData[i].f69x, f2 - charData[i].f71z);
    }

    public static float getCharsDir(int i, int i2) {
        Attack.relativeChange(charData[i].dir, charData[i].ahX, charData[i].ahZ, 0, false, _xz_[0]);
        Attack.relativeChange(charData[i2].dir, charData[i2].ahX, charData[i2].ahZ, 0, false, _xz_[1]);
        return Util.atan2_360((charData[i2].f69x + _xz_[1][0]) - (charData[i].f69x + _xz_[0][0]), (charData[i2].f71z + _xz_[1][1]) - (charData[i].f71z + _xz_[0][1]));
    }

    public static float getCharsDirOP(int i, int i2) {
        return Util.atan2_360(charData[i2].f69x - charData[i].f69x, charData[i2].f71z - charData[i].f71z);
    }

    public static float getCharsDirY(int i, int i2) {
        return Util.atan2_360(getCharsLen2(i, i2), (charData[i].f70y - charData[i2].f70y) * (charData[i].f70y - charData[i2].f70y));
    }

    public static int getCharsLen2(int i, int i2) {
        Attack.relativeChange(charData[i].dir, charData[i].ahX, charData[i].ahZ, 0, false, _xz_[0]);
        Attack.relativeChange(charData[i2].dir, charData[i2].ahX, charData[i2].ahZ, 0, false, _xz_[1]);
        return (int) ((((charData[i2].f69x + _xz_[1][0]) - (charData[i].f69x + _xz_[0][0])) * ((charData[i2].f69x + _xz_[1][0]) - (charData[i].f69x + _xz_[0][0]))) + (((charData[i2].f70y + charData[i2].ahY) - (charData[i].f70y + charData[i].ahY)) * ((charData[i2].f70y + charData[i2].ahY) - (charData[i].f70y + charData[i].ahY))) + (((charData[i2].f71z + _xz_[1][1]) - (charData[i].f71z + _xz_[0][1])) * ((charData[i2].f71z + _xz_[1][1]) - (_xz_[0][1] + charData[i].f71z))));
    }

    public static int getCharsLen2_P2B(int i, int i2) {
        Attack.relativeChange(charData[i].dir, charData[i].ahX, charData[i].ahZ, 0, false, _xz_[0]);
        Attack.relativeChange(charData[i2].dir, charData[i2].ahX, charData[i2].ahZ, 0, false, _xz_[1]);
        getCharXZ(charData[i2].dir, charData[i2].ahWidth, charData[i2].ahDepth, _xz_[2]);
        return (int) Util.lenP2B(charData[i].f69x + _xz_[0][0], charData[i].f70y + charData[i].ahY, charData[i].f71z + _xz_[0][1], charData[i2].f69x + _xz_[1][0], charData[i2].f70y + charData[i2].ahY, charData[i2].f71z + _xz_[1][1], _xz_[2][0], charData[i2].ahHeight, _xz_[2][1]);
    }

    public static int getCharsXZLen2(int i, int i2) {
        Attack.relativeChange(charData[i].dir, charData[i].ahX, charData[i].ahZ, 0, false, _xz_[0]);
        Attack.relativeChange(charData[i2].dir, charData[i2].ahX, charData[i2].ahZ, 0, false, _xz_[1]);
        return (int) ((((charData[i2].f69x + _xz_[1][0]) - (charData[i].f69x + _xz_[0][0])) * ((charData[i2].f69x + _xz_[1][0]) - (charData[i].f69x + _xz_[0][0]))) + (((charData[i2].f71z + _xz_[1][1]) - (charData[i].f71z + _xz_[0][1])) * ((charData[i2].f71z + _xz_[1][1]) - (_xz_[0][1] + charData[i].f71z))));
    }

    public static int getMotionId(int i, int i2) {
        return motionId[getCharIndex(charData[i].charId)][charData[i].motionNo][i2];
    }

    private static int getMotionIndex(int i, int i2) {
        int i3 = 0;
        int charIndex = getCharIndex(charData[i].charId);
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i4 >= motionId[charIndex][charData[i].motionNo].length) {
                return i5;
            }
            if (motionId[charIndex][charData[i].motionNo][i4] == i2) {
                return i4;
            }
            i3 = motionId[charIndex][charData[i].motionNo][i4] == 0 ? i4 : i5;
            i4++;
        }
    }

    public static int getMotionLength(int i, int i2) {
        return motionData[getCharIndex(charData[i].charId)][charData[i].motionNo][getMotionIndex(i, i2)].length - 1;
    }

    public static int getMotionNum(int i) {
        return motionId[getCharIndex(charData[i].charId)][charData[i].motionNo].length;
    }

    public static int getMotionType(int i) {
        return getMotionTypeMain(charData[i].motion);
    }

    public static int getMotionTypeMain(int i) {
        for (int i2 = 0; i2 < Motion.TYPE.length; i2++) {
            if (Motion.TYPE[i2][0] == i) {
                return Motion.TYPE[i2][1];
            }
        }
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    public static int getNearEneCharDir(int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        int i7 = -1;
        int i8 = Integer.MAX_VALUE;
        while (i4 < charData.length) {
            if (i4 == i || !charData[i4].use || charData[i4].f12hp <= 0 || charData[i4].level <= 0) {
                i3 = i6;
            } else {
                if (Attack.attrEneCheck(charData[i4].type, charData[i].type, charData[i].type == 9) && !charData[i4].getBitState(1024) && charData[i4].getBitState(32)) {
                    int charsLen2_P2B = getCharsLen2_P2B(i, i4);
                    int iAbs = (int) (((charData[i4].position != 1 || charData[i4].f70y - charData[i].f70y > 10.0f) ? (int) (Math.abs(charData[i].f70y - charData[i4].f70y) * 40.0f) : 0) + (Math.abs(Util.DiffDir(charData[i].dir, getCharsDir(i, i4))) / 10.0f));
                    if (iAbs == 0) {
                        iAbs = 1;
                    }
                    int i9 = charsLen2_P2B * iAbs;
                    if (charData[i4].getBitState(16)) {
                        if (charsLen2_P2B >= i2 || i5 <= i9) {
                            i3 = i6;
                        } else {
                            i5 = i9;
                            i3 = i4;
                        }
                    } else if (charsLen2_P2B >= i2 || i8 <= i9) {
                        i3 = i6;
                    } else {
                        i3 = i6;
                        i7 = i4;
                        i8 = i9;
                    }
                } else {
                    i3 = i6;
                }
            }
            i4++;
            i6 = i3;
        }
        if (i7 >= 0) {
            return i7;
        }
        if (i6 >= 0) {
            return i6;
        }
        return -1;
    }

    public static int getNextType(int i) {
        int charIndex = getCharIndex(charData[i].charId);
        int motionIndex = getMotionIndex(i, charData[i].motion);
        return motionData[charIndex][charData[i].motionNo][motionIndex][motionData[charIndex][charData[i].motionNo][motionIndex].length - 1];
    }

    public static int getNowMotionLength(int i) {
        return getMotionLength(i, charData[i].motion);
    }

    public static void init() {
        for (int i = 0; i < charBase.length; i++) {
            for (int i2 = 0; i2 < charBase[i].length; i2++) {
                charBase[i][i2] = -1;
            }
        }
        if (preFigure == null) {
            preFigure = (Figure[][]) Array.newInstance((Class<?>) Figure.class, 100, preTexMax);
            for (int i3 = 0; i3 < preFigure.length; i3++) {
                for (int i4 = 0; i4 < preFigure[i3].length; i4++) {
                    preFigure[i3][i4] = initPreChar();
                }
            }
        }
        preFigureShadow = new Figure[preTexMax];
        for (int i5 = 0; i5 < preFigureShadow.length; i5++) {
            preFigureShadow[i5] = initPreChar();
            Appearance appearance = (Appearance) preFigureShadow[i5].findObject3D(14, -1);
            appearance.setProperties(appearance.getProperties() ^ 8);
        }
        preFigureAfter = (Figure[][]) Array.newInstance((Class<?>) Figure.class, 4, preTexMax);
        for (int i6 = 0; i6 < preFigureAfter.length; i6++) {
            for (int i7 = 0; i7 < preFigureAfter[i6].length; i7++) {
                preFigureAfter[i6][i7] = initPreChar();
            }
        }
        light = new Light(0);
        light.setColor(GameCommon.K_ANY);
        light.setIntensity(1.0f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    private static Figure initPreChar() throws IllegalStateException {
        short[] sArr = {0, 1, 2, 3};
        int[] iArr = {4};
        VertexBuffer vertexBuffer = new VertexBuffer(DirectBufferManager.getVBS(), 49, 4);
        vertexBuffer.setVertices(1, 0, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f}, 0, 4);
        vertexBuffer.setVertices(16, 0, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 4);
        vertexBuffer.setTexCoordScale(32, 1.0f / preTexMaxSize, new float[]{0.0f, 0.0f, 0.0f});
        IndexBuffer[] indexBufferArr = {new IndexBuffer(DirectBufferManager.getIBS(), iArr.length, sArr.length)};
        indexBufferArr[0].set(5, iArr, sArr);
        indexBufferArr[0].fix();
        Appearance appearance = new Appearance();
        appearance.setAlphaThreshold(1);
        appearance.setProperties(appearance.getProperties() | 64);
        appearance.setTextureBlendMode(0, 4);
        appearance.setUserId(1);
        appearance.setTextureCombineRgbScale(0, 2.0f);
        appearance.setTextureFilter(0, 0, 0);
        appearance.setTextureFilter(0, 1, 1);
        indexBufferArr[0].setAppearance(appearance);
        return new Figure(vertexBuffer, indexBufferArr);
    }

    public static void motionMove(int i) {
        if (afterImage == i) {
            afterImageMove();
        }
        int charIndex = getCharIndex(charData[i].charId);
        if (charIndex < 0) {
            return;
        }
        int motionIndex = getMotionIndex(i, charData[i].motion);
        short s = motionData[charIndex][charData[i].motionNo][motionIndex][motionData[charIndex][charData[i].motionNo][motionIndex].length - 1];
        int length = motionData[charIndex][charData[i].motionNo][motionIndex].length - 1;
        if (charData[i].motionCompSpd <= 0) {
            charData[i].frame += charData[i].motionSpd;
        } else if (charData[i].frame < length / 2) {
            charData[i].frame -= charData[i].motionCompSpd;
            if (charData[i].frame <= 0.0f) {
                charData[i].frame = 0.0f;
                charData[i].motionCompSpd = (short) 0;
            }
        } else {
            charData[i].frame += charData[i].motionCompSpd;
        }
        if (charData[i].frame >= length) {
            if (((charData[i].motion == 2 || charData[i].motion == 15 || charData[i].motion == 46 || charData[i].motion == 42) && charData[i].f12hp == 0) || s == -1) {
                if (charData[i].f12hp != 0 || charData[i].motion == 42 || !checkHaveMotion(i, 42)) {
                    charData[i].frame = length - 1;
                    charData[i].dwnSpd = 0.0f;
                    return;
                }
                motionSet(i, 42);
            } else if (s != -2 && s >= 0) {
                if (charData[i].getBitState(4)) {
                    motionSet(i, 13);
                } else {
                    motionSet(i, s);
                }
            }
            charData[i].frame = 0.0f;
            charData[i].motionCompSpd = (short) 0;
        }
    }

    public static void motionSet(int i, int i2) {
        if (charData[i].f12hp != 0 || i2 == 28 || getMotionTypeMain(i2) == 4 || getMotionType(i) != 4) {
            for (int i3 = 0; i3 < Action.extBindCharNo.length; i3++) {
                if (i > 0 && i == Action.extBindCharNo[i3] && charData[i].f12hp == 0 && charData[i].aliveCnt > 0 && i2 != 28) {
                    return;
                }
            }
            if (!checkHaveMotion(i, i2)) {
                i2 = 0;
            }
            if (charData[i].getBitState(16)) {
                if (i2 == 1) {
                    i2 = 25;
                }
                if (i2 == 0) {
                    i2 = 24;
                }
            }
            if (charData[i].motion != i2) {
                charData[i].motion = (short) i2;
                charData[i].frame = 0.0f;
                if (i2 == 0 || i2 == 24) {
                    if (i == 0) {
                        charData[i].waitCnt = (short) 40;
                    }
                    charData[i].setBitState(8, false);
                } else {
                    if (i == 0) {
                        charData[i].waitCnt = (short) 0;
                    }
                    charData[i].setBitState(8, true);
                }
                if (charData[i].getBitState(4)) {
                    return;
                }
                if (i2 == 12 || i2 == 13 || i2 == 10 || i2 == 16) {
                    charData[i].setBitState(4, true);
                }
            }
        }
    }

    public static void resetCharData(int i) {
        CharData charData2 = charData[i];
        CharData charData3 = charData[i];
        CharData charData4 = charData[i];
        CharData charData5 = charData[i];
        CharData charData6 = charData[i];
        CharData charData7 = charData[i];
        charData[i].dir = 0.0f;
        charData7.dwnDir = 0.0f;
        charData6.dwnSpd = 0.0f;
        charData5.jmpSpd = 0.0f;
        charData4.f71z = 0.0f;
        charData3.f70y = 0.0f;
        charData2.f69x = 0.0f;
        charData[i].hitChar = (byte) -1;
        charData[i].thinkDir = -1.0f;
        charData[i].motionSpd = 1.0f;
        charData[i].dmgCnt = (short) 0;
        charData[i].assistDir = (byte) 0;
        charData[i].turn_spd = 0.0f;
        charData[i].dmg = 0;
        charData[i].dmgHp = (short) 0;
        charData[i].dmgCnt = (short) 0;
        charData[i].setBitState(4, false);
        charData[i].setBitState(64, false);
        charData[i].setBitState(8, false);
        charData[i].setBitState(16, false);
        charData[i].setBitState(128, false);
        charData[i].setBitState(32, true);
        charData[i].setBitState(Appearance.USE_FIGURE_APPEARANCE, false);
        charData[i].setBitState(4096, false);
        charData[i].setBitState(1024, false);
        charData[i].setBitState(8192, false);
        charData[i].setBitState(16384, true);
        charData[i].setBitState(32768, true);
        charData[i].setBitState(65536, false);
        charData[i].setBitState(262144, true);
        charData[i].setBitState(524288, false);
        charData[i].setBitState(VertexBuffer.TEXTURECOORDF_0, true);
        charData[i].setBitState(VertexBuffer.TEXTURECOORDF_1, false);
        charData[i].setBitState(4194304, false);
        charData[i].setBitState(8388608, false);
        charData[i].setBitState(VertexBuffer.SPRITE_PER_OBJ, false);
        charData[i].setBitState(33554432, false);
        charData[i].setBitState(67108864, false);
        charData[i].setBitState(134217728, false);
        charData[i].setBitState(268435456, false);
        motionSet(i, 0);
        if (charData[i].type != 0) {
            charData[i].use = true;
            charData[i].delCnt = (short) 100;
        } else {
            charData[i].use = false;
            charData[i].f12hp = (short) 0;
            charData[i].delCnt = (short) 0;
            charData[i].aliveCnt = (short) 0;
            Attack.resetPiyori(i);
        }
        charData[i].motionCompSpd = (short) 0;
        charData[i].guardAttribute = (short) 0;
        if (getCharIndex(charData[i].charId) >= 0) {
            charData[i].guardAttribute = (short) imageInfo[getCharIndex(charData[i].charId)][charData[i].motionNo][4];
        }
        charData[i].itemUse = false;
        charData[i].useItemWait = (short) 0;
        charData[i].useItemId = (short) -1;
        charData[i].targetChar = (byte) -1;
        charData[i].targetBlock = (byte) -1;
        charData[i].targetFixTime = (short) 0;
        charData[i].bindFigUserId = (short) -1;
        charData[i].actId = (short) -1;
        charData[i].thinkAtk = (short) 0;
        charData[i].thinkDmg = 0;
        charData[i].thinkId = (short) 0;
        charData[i].thinkCur = (short) 0;
        charData[i].thinkRand = (short) Util.randomFix(0, Integer.MAX_VALUE);
        charData[i].actCur = (short) 0;
        charData[i].actWait = (short) 0;
        charData[i].actTimer = (short) 0;
        charData[i].waitCnt = (short) 0;
        charData[i].alpha = (short) 255;
        charData[i].ahX = 0.0f;
        charData[i].ahY = 0.0f;
        charData[i].ahZ = 0.0f;
        charData[i].ahWidth = charData[i].width;
        charData[i].ahHeight = charData[i].height;
        charData[i].ahDepth = charData[i].depth;
        Attack.resetPiyori(i);
        Attack.freeCharAttack(i, false);
        Action.callBackActionSet(0, i);
        if (charData[i].aiId >= 0 && charData[i].actId >= 0) {
            Action.action(i);
        }
        if (!charData[i].getBitState(8192)) {
            if (GameStatus.EXTRA.isCheatMode(8)) {
                Game.levelUpDownSet(i, GameStatus.PLAYER.getExeDebugAbilityEff(8), true);
            }
            if (GameStatus.EXTRA.isCheatMode(9)) {
                Game.levelUpDownSet(i, -GameStatus.PLAYER.getExeDebugAbilityEff(9), true);
            }
            if (GameStatus.EXTRA.isCheatMode(6)) {
                Game.abnormalAISet(i, 6);
            }
            if (GameStatus.EXTRA.isCheatMode(7)) {
                Game.abnormalAISet(i, 7);
            }
        }
        if (GameStatus.EXTRA.isCheatMode(4)) {
            Game.slowAbilitySet(i);
        }
    }

    public static int setCharId(short s, byte b, short s2, short s3, short s4, short s5) {
        for (int i = 0; i < charBase.length; i++) {
            if (charBase[i][0] == -1) {
                charBase[i][0] = s;
                charBase[i][1] = b;
                charBase[i][2] = s2;
                charBase[i][3] = s3;
                charBase[i][4] = s4;
                charBase[i][5] = s5;
                return i;
            }
        }
        return -1;
    }

    public static void setEquipEff(int i) {
        if (charData == null) {
            return;
        }
        if (i == 0) {
            charData[i].maxHp = (short) (GameStatus.PLAYER.getLevelStatus(0) + GameStatus.PLAYER.equipStatus[2]);
            charData[i].attackPow = (short) (GameStatus.PLAYER.equipStatus[0] + GameStatus.PLAYER.getLevelStatus(1));
            charData[i].defense = (short) (GameStatus.PLAYER.getLevelStatus(2) + GameStatus.PLAYER.equipStatus[1]);
            if (charData[i].maxHp <= 0) {
                charData[i].maxHp = (short) 1;
                charData[i].f12hp = (short) 1;
            }
            if (charData[i].maxHp >= 218) {
                charData[i].maxHp = (short) 218;
            }
            if (charData[i].attackPow <= 0) {
                charData[i].attackPow = (short) 1;
            }
            if (charData[i].defense <= 0) {
                charData[i].defense = (short) 1;
            }
            if (charData[i].dmgHp > charData[i].maxHp) {
                charData[i].dmgHp = charData[i].maxHp;
            }
        } else {
            charData[i].maxHp = (short) 10;
            charData[i].attackPow = (short) 10;
            charData[i].defense = (short) 10;
            if (charData[i].level > 0) {
                charData[i].level = (byte) GameStatus.PLAYER.getNumberData(3);
                for (int i2 = 0; i2 < Action.extBindCharNo.length; i2++) {
                    if (i == Action.extBindCharNo[i2]) {
                        charData[i].level = (byte) Math.min(99, charData[i].level + charData[i].add_data[0]);
                        break;
                    }
                }
                int charIndex = getCharIndex(charData[i].charId);
                charData[i].maxHp = (short) ((GameStatus.PLAYER.getLevelStatus(charData[i].level, 0) * charBase[charIndex][2]) / 100);
                charData[i].attackPow = (short) ((GameStatus.PLAYER.getLevelStatus(charData[i].level, 1) * charBase[charIndex][3]) / 100);
                charData[i].defense = (short) ((charBase[charIndex][4] * GameStatus.PLAYER.getLevelStatus(charData[i].level, 2)) / 100);
                if (charData[i].maxHp == 0) {
                    charData[i].maxHp = (short) 1;
                }
                if (charData[i].dmgHp > charData[i].maxHp) {
                    charData[i].dmgHp = charData[i].maxHp;
                }
            }
            if (GameStatus.PLAYER.getNumberData(19) == 5) {
                charData[1].attackPow = (short) ((GameStatus.PLAYER.getLevelStatus(1) * 155) / 100);
                charData[1].defense = (short) ((GameStatus.PLAYER.getLevelStatus(2) * 130) / 100);
                charData[1].maxHp = (short) ((GameStatus.PLAYER.getLevelStatus(0) * 150) / 100);
                charData[2].attackPow = (short) ((GameStatus.PLAYER.getLevelStatus(1) * 165) / 100);
                charData[2].defense = (short) ((GameStatus.PLAYER.getLevelStatus(2) * 130) / 100);
                charData[2].maxHp = (short) ((GameStatus.PLAYER.getLevelStatus(0) * 130) / 100);
                for (int i3 = 1; i3 < 3; i3++) {
                    if (charData[i3].attackPow < 1) {
                        charData[i3].attackPow = (short) 1;
                    }
                    if (charData[i3].defense < 1) {
                        charData[i3].defense = (short) 1;
                    }
                    if (charData[i3].maxHp < 1) {
                        charData[i3].maxHp = (short) 1;
                    }
                }
            }
        }
        if (i == 0) {
            Game.checkAlert();
        }
    }

    public static void setJmpSpd(int i, float f) {
        charData[i].jmpSpd = Util3D.sqrt(0.6666667f * f) - 0.16666667f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    private static Figure setPrePrim(Graphics3D graphics3D, int i, int i2, float f, Transform transform, int i3, Figure[] figureArr) throws IllegalStateException {
        int charIndex = getCharIndex(charData[i].charId);
        float fAtan2_360 = Util.atan2_360(CameraData.gazDelayX - CameraData.apsDelayX, CameraData.gazDelayZ - CameraData.apsDelayZ);
        int iDirTo8 = Util.dirTo8(f - fAtan2_360);
        boolean z = false;
        if (iDirTo8 > 4) {
            iDirTo8 = 8 - iDirTo8;
            z = true;
        }
        if (texInfo[charIndex][charData[i].motionNo].length <= 4) {
            iDirTo8 = 0;
        }
        short s = texInfo[charIndex][charData[i].motionNo][iDirTo8][i2][0];
        short s2 = texInfo[charIndex][charData[i].motionNo][iDirTo8][i2][2];
        short s3 = texInfo[charIndex][charData[i].motionNo][iDirTo8][i2][3];
        short s4 = texInfo[charIndex][charData[i].motionNo][iDirTo8][i2][4];
        short s5 = texInfo[charIndex][charData[i].motionNo][iDirTo8][i2][5];
        short s6 = texInfo[charIndex][charData[i].motionNo][iDirTo8][i2][6];
        short s7 = texInfo[charIndex][charData[i].motionNo][iDirTo8][i2][7];
        if (transform != null) {
            _vec.set((90.0f - CameraData.angNow) / 360.0f, (fAtan2_360 + 180.0f) / 360.0f, 0.0f);
            Util.setRotateEuler(0, _vec, transform);
            if (CameraData.angNow > 0.0f) {
                if (GameStatus.GAME.areaDebugMode != 2 || CameraData.angNow <= 50.0f) {
                    Util.setTranslate(0.0f, 1.5f, 0.0f, transform);
                } else {
                    float fAtan2_361 = Util.atan2_360(CameraData.gazX - CameraData.apsX, CameraData.gazZ - CameraData.apsZ);
                    Util.setTranslate(FastMath.sin(fAtan2_361) * (CameraData.angNow - 50.0f) * (-0.08f), 2.5f, FastMath.cos(fAtan2_361) * (CameraData.angNow - 50.0f) * (-0.08f), transform);
                }
            }
            Util.setScale(s4 / 13.0f, 1.0f, s5 / 13.0f, transform);
            float f2 = charData[i].scale * texMag[charIndex][charData[i].motionNo];
            if (z) {
                Util.setTranslate(((-(s4 - s6)) / s4) * f2, 0.0f, f2 * ((-s7) / s5), transform);
            } else {
                Util.setTranslate(((-s6) / s4) * f2, 0.0f, f2 * ((-s7) / s5), transform);
            }
        }
        if (texInfo[charIndex][charData[i].motionNo][iDirTo8][i2][1] == 1) {
            if (z) {
                short[] sArr = _tex;
                _tex[2] = s2;
                sArr[6] = s2;
                short[] sArr2 = _tex;
                _tex[5] = s3;
                sArr2[7] = s3;
                short[] sArr3 = _tex;
                short s8 = (short) (s2 + s5);
                _tex[0] = s8;
                sArr3[4] = s8;
                short[] sArr4 = _tex;
                short s9 = (short) (s3 + s4);
                _tex[1] = s9;
                sArr4[3] = s9;
            } else {
                short[] sArr5 = _tex;
                _tex[2] = s2;
                sArr5[6] = s2;
                short[] sArr6 = _tex;
                _tex[1] = s3;
                sArr6[3] = s3;
                short[] sArr7 = _tex;
                short s10 = (short) (s3 + s4);
                _tex[5] = s10;
                sArr7[7] = s10;
                short[] sArr8 = _tex;
                short s11 = (short) (s2 + s5);
                _tex[0] = s11;
                sArr8[4] = s11;
            }
        } else if (z) {
            short[] sArr9 = _tex;
            _tex[4] = s2;
            sArr9[6] = s2;
            short[] sArr10 = _tex;
            _tex[1] = s3;
            sArr10[5] = s3;
            short[] sArr11 = _tex;
            short s12 = (short) (s2 + s4);
            _tex[0] = s12;
            sArr11[2] = s12;
            short[] sArr12 = _tex;
            short s13 = (short) (s3 + s5);
            _tex[3] = s13;
            sArr12[7] = s13;
        } else {
            short[] sArr13 = _tex;
            _tex[0] = s2;
            sArr13[2] = s2;
            short[] sArr14 = _tex;
            _tex[1] = s3;
            sArr14[5] = s3;
            short[] sArr15 = _tex;
            short s14 = (short) (s2 + s4);
            _tex[4] = s14;
            sArr15[6] = s14;
            short[] sArr16 = _tex;
            short s15 = (short) (s3 + s5);
            _tex[3] = s15;
            sArr16[7] = s15;
        }
        charTexTbls[charIndex][s].findTexture(charTexTbls[charIndex][s].getUserId()).getLevelSize(0, _reg);
        short s16 = 0;
        short s17 = 0;
        for (int x1 = _reg.getX1(); x1 < preTexMaxSize; x1 <<= 1) {
            s16 = (short) (s16 + 1);
        }
        for (int y1 = _reg.getY1(); y1 < preTexMaxSize; y1 <<= 1) {
            s17 = (short) (s17 + 1);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            _tex[i4 << 1] = (short) (_tex[i4 << 1] << s16);
            _tex[(i4 << 1) + 1] = (short) (_tex[(i4 << 1) + 1] << s17);
        }
        int i5 = s - texUserIdMin[charIndex][charData[i].motionNo];
        VertexBuffer vertexBuffer = figureArr[i5].getVertexBuffer();
        vertexBuffer.setVertices(32, 0, _tex, 0, 4);
        int i6 = (i3 >> 24) & 255;
        vertexBuffer.multiVertexColors(i6 / 255.0f, ((i3 >> 16) & 255) / 255.0f, ((i3 >> 8) & 255) / 255.0f, (i3 & 255) / 255.0f);
        if (i6 == 255) {
            ((Appearance) figureArr[i5].findObject3D(14, -1)).setBlendMode(4);
        } else {
            ((Appearance) figureArr[i5].findObject3D(14, -1)).setBlendMode(0);
        }
        return figureArr[i5];
    }

    public static void setPrePrimTex(int i) {
        int charIndex = getCharIndex(charData[i].charId);
        if (charIndex >= 0 && charData[i].drawType == 1) {
            short s = 0;
            for (int i2 = 0; i2 < texInfo[charIndex][charData[i].motionNo].length; i2++) {
                for (int i3 = 0; i3 < texInfo[charIndex][charData[i].motionNo][i2].length; i3++) {
                    if (s < texInfo[charIndex][charData[i].motionNo][i2][i3][0]) {
                        s = texInfo[charIndex][charData[i].motionNo][i2][i3][0];
                    }
                }
            }
            for (int i4 = 0; i4 <= s - texUserIdMin[charIndex][charData[i].motionNo]; i4++) {
                Texture textureFindTexture = charTexTbls[charIndex][texUserIdMin[charIndex][charData[i].motionNo] + i4].findTexture(charTexTbls[charIndex][texUserIdMin[charIndex][charData[i].motionNo] + i4].getUserId());
                preFigure[i][i4].getIndexBuffer(0).getAppearance().setTexture(0, textureFindTexture);
                preFigure[i][i4].getIndexBuffer(0).getAppearance().setAlphaThreshold(texAlpha[charIndex][charData[i].motionNo]);
                if (i == 0) {
                    preFigureShadow[i4].getIndexBuffer(0).getAppearance().setTexture(0, textureFindTexture);
                }
            }
        }
    }
}
