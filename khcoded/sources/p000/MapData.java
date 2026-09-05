package p000;

import com.mascotcapsule.eruption.docomostar.Appearance;
import com.mascotcapsule.eruption.docomostar.Batch;
import com.mascotcapsule.eruption.docomostar.Figure;
import com.mascotcapsule.eruption.docomostar.Light;
import java.lang.reflect.Array;
import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class MapData {
    public static final byte BUG_BLOCK_STATE_APPEAR = 4;
    public static final byte BUG_BLOCK_STATE_DAMAGE = 1;
    public static final byte BUG_BLOCK_STATE_DESTROY = 3;
    public static final byte BUG_BLOCK_STATE_NON = 0;
    public static final byte BUG_BLOCK_STATE_NORMAL = 2;
    public static final int COLLISION_FLG_BARRIER = 1;
    public static final int COLLISION_FLG_CAMERA_SW = 4;
    public static final int COLLISION_FLG_JUMP_CAMERA_OFF = 8;
    public static final int COLLISION_FLG_OUT = 2;
    public static final byte MODEL_INFO_ALPHA = 4;
    public static final byte MODEL_INFO_MAX = 5;
    public static final byte MODEL_INFO_PERS = 3;
    public static final byte MODEL_INFO_SIZE_X = 0;
    public static final byte MODEL_INFO_SIZE_Y = 1;
    public static final byte MODEL_INFO_SIZE_Z = 2;
    public static short[] addData;
    public static int[] ambientList;
    public static Appearance appearance;
    public static int areaNo;
    public static Batch batch;
    public static Figure[] batchFig;
    public static int blockAreaNo;
    public static BugBlock[] bugBlock;
    public static BugBlock[][] bugBlockAll;
    public static byte[][] bugBlockMoveData;
    public static float[] bugBlockTmpF;
    public static int[] bugBlockTmpI;
    public static int[][] cameraDef;
    public static int changeAreaTimer;
    public static int changeAreaTimerMax;
    public static Collision[][] collisionData;
    public static String[] collisionFile;
    public static int debugLightColor;
    public static int debugLightPow;
    public static String[] faceFile;
    public static int gBlockNum;
    public static Light light;
    public static String[] mapName;
    public static Appearance mmapApp;
    public static int[] mmapMctX;
    public static int[] mmapMctY;
    public static int[] mmapOffX;
    public static int[] mmapOffY;
    public static Figure modelFig;
    public static String[] modelFile;
    public static RootData[] rootData;
    public static int time;
    public static int timeEnd;
    public static boolean timeLoopFlg;
    public static int timeMax;
    public static int timeStart;
    private static final MapData map = new MapData();
    private static int lightColorBack = 0;
    public static final short[][] bugBlockTime = {new short[]{0, 11, 1}, new short[]{20, 11, 1}, new short[]{40, 11, 1}, new short[]{60, 11, 1}, new short[]{0, 11, 1}, new short[]{80, 11, 1}, new short[]{80, 11, 2}, new short[]{90, 11, 1}, new short[]{66, 11, 1}, new short[]{0, 11, 1}, new short[]{18, 11, 1}, new short[]{0, 11, -5}, new short[]{60, 11, 1}, new short[]{60, 11, 1}};
    public static int mapYpos = 0;
    public static Vector itemBlock = new Vector();
    private static float[][] _dxz = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 2);
    private static int[] _bx = new int[2];
    private static int[] _bz = new int[2];
    private static int[] _ret = new int[3];
    public static int[][][] areaDebugCollision = (int[][][]) null;
    public static int[][] areaDebugCollisionNow = (int[][]) null;
    public static int[][] areaDebugInfo = (int[][]) null;
    public static int areaDebugId = 0;

    MapData() {
    }

    public static boolean addBlock(int i, int i2, float f, float f2, float f3, byte b, int i3) {
        while (i < 50 - gBlockNum) {
            if (bugBlock[i].type != -1) {
                if (!((i2 == 6) | (i2 == 5)) || bugBlock[i].view != 0) {
                    i++;
                }
            }
            bugBlock[i].clear();
            if (i3 == 0) {
                bugBlock[i].clush_flg_temp = (byte) 3;
                i2 = 5;
                if (Game.eventSIVar[24] == 0) {
                    Game.eventSIVar[24] = 2;
                }
            } else if (i2 == 5 && Util.randomFix(0, 100) < Game.eventSIVar[26]) {
                i2 = 6;
                if (Game.eventSIVar[24] == 0) {
                    Game.eventSIVar[24] = 2;
                } else {
                    Game.eventSIVar[24] = 3;
                }
            }
            bugBlock[i].set((byte) 1, f, f2, f3, (byte) 0, 4.0f, 4.0f, 4.0f, (byte) i2, (byte) i3, (byte) 0, (byte) 1);
            if (i2 == 5 || i2 == 6) {
                bugBlock[i].state = (byte) 4;
                bugBlockTimeSet(bugBlock[i]);
                if (b >= 0) {
                    bugBlock[i].moveDir = b;
                    bugBlock[i].moveDis = 4.0f;
                    bugBlock[i].moveFrm = (short) 0;
                } else {
                    bugBlock[i].moveDir = (byte) 0;
                    bugBlock[i].moveDis = 0.0f;
                    bugBlock[i].moveFrm = (short) 0;
                }
            }
            return true;
        }
        return false;
    }

    public static float b2w(int i) {
        return (i << 2) + 2;
    }

    public static int barrierHitCheck(float f, float f2, float f3, float f4, float f5) {
        if ((getCollisionOption(f, f2, f3, f4, 1) & 1) == 0) {
            return -1;
        }
        float f6 = f4 / 2.0f;
        _bx[0] = w2b(f - f6);
        _bx[1] = w2b(f + f6);
        _bz[0] = w2b(f3 - f6);
        _bz[1] = w2b(f6 + f3);
        if (_bx[0] < 0 || _bz[0] < 0 || _bz[1] >= collisionData.length || _bx[1] >= collisionData[_bz[1]].length) {
            return -2;
        }
        if ((collisionData[_bz[0]][_bx[0]].option & 1) == (collisionData[_bz[1]][_bx[0]].option & 1) && (collisionData[_bz[0]][_bx[1]].option & 1) == (collisionData[_bz[1]][_bx[1]].option & 1) && (collisionData[_bz[0]][_bx[0]].option & 1) != (collisionData[_bz[0]][_bx[1]].option & 1)) {
            return (collisionData[_bz[0]][_bx[0]].option & 1) != 0 ? 3 : 1;
        }
        if ((collisionData[_bz[0]][_bx[0]].option & 1) == (collisionData[_bz[0]][_bx[1]].option & 1) && (collisionData[_bz[1]][_bx[0]].option & 1) == (collisionData[_bz[1]][_bx[1]].option & 1) && (collisionData[_bz[0]][_bx[0]].option & 1) != (collisionData[_bz[1]][_bx[0]].option & 1)) {
            return (collisionData[_bz[0]][_bx[0]].option & 1) == 0 ? 0 : 2;
        }
        return Util.dirTo8(f5) / 2;
    }

    public static int blockBlockHitCheck(int i) {
        if (bugBlock != null) {
            for (int i2 = 0; i2 < 50; i2++) {
                if (i2 != i && bugBlock[i2].state != 0 && bugBlock[i2].state != 3 && bugBlock[i2].view == 1 && hitBlock(i2) && w2b(bugBlock[i2].f69x) == w2b(bugBlock[i].f69x) && w2b(bugBlock[i2].f71z) == w2b(bugBlock[i].f71z)) {
                    if (bugBlock[i2].f70y <= bugBlock[i].f70y && bugBlock[i].f70y - bugBlock[i2].f70y < bugBlock[i2].sizeY) {
                        return i2;
                    }
                    if (bugBlock[i2].f70y > bugBlock[i].f70y && bugBlock[i2].f70y - bugBlock[i].f70y < bugBlock[i].sizeY) {
                        return i2;
                    }
                }
            }
        }
        return -1;
    }

    public static float bugBlockHeight(float f, float f2, float f3, float f4, float f5) {
        float fBugBlockHeightNo = bugBlockHeightNo(f, f2, f3, f4, f5);
        if (fBugBlockHeightNo < 0.0f) {
            return fBugBlockHeightNo;
        }
        return bugBlock[(int) fBugBlockHeightNo].sizeY + bugBlock[(int) fBugBlockHeightNo].f70y;
    }

    public static int bugBlockHeightNo(float f, float f2, float f3, float f4, float f5) {
        boolean z;
        float f6 = -1.0f;
        int i = -1;
        if (bugBlock == null) {
            return -1;
        }
        while (true) {
            int i2 = 0;
            int i3 = i;
            boolean z2 = false;
            float f7 = f6;
            while (i2 < 50) {
                if (hitBlock(i2) && f7 < bugBlock[i2].f70y + bugBlock[i2].sizeY && bugBlockHitCheck(f, 0.0f, f3, f4, f5 + f2, i2)) {
                    f7 = bugBlock[i2].f70y + bugBlock[i2].sizeY;
                    if (f2 < bugBlock[i2].f70y + bugBlock[i2].sizeY) {
                        f2 = bugBlock[i2].f70y + bugBlock[i2].sizeY;
                    }
                    z = true;
                    i3 = i2;
                } else {
                    if (i3 == i2) {
                        break;
                    }
                    z = z2;
                }
                i2++;
                z2 = z;
            }
            if (!z2) {
                return i3;
            }
            i = i3;
            f6 = f7;
        }
    }

    public static int bugBlockHitCheck(float f, float f2, float f3, float f4, float f5) {
        if (bugBlock != null) {
            for (int i = 0; i < 50; i++) {
                if (bugBlockHitCheck(f, f2, f3, f4, f5, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int bugBlockHitCheck(CharData charData) {
        if (bugBlock != null) {
            for (int i = 0; i < 50; i++) {
                if (hitBlock(i) && bugBlockHitCheck(charData, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int bugBlockHitCheck(CharData[] charDataArr, int i) {
        for (int i2 = 0; i2 < charDataArr.length; i2++) {
            if (bugBlockHitCheck(charDataArr[i2], i)) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean bugBlockHitCheck(float f, float f2, float f3, float f4, float f5, int i) {
        return bugBlock != null && bugBlock[i].state != 0 && bugBlock[i].state != 3 && bugBlock[i].view == 1 && bugBlock[i].f70y <= f5 + f2 && f2 <= bugBlock[i].sizeY + bugBlock[i].f70y && Math.abs(bugBlock[i].f69x - f) * 2.0f <= bugBlock[i].sizeX + f4 && Math.abs(bugBlock[i].f71z - f3) * 2.0f <= bugBlock[i].sizeZ + f4;
    }

    public static boolean bugBlockHitCheck(CharData charData, int i) {
        if (bugBlock == null || bugBlock[i] == null || !charData.use) {
            return false;
        }
        return bugBlockHitCheck(charData.f69x, charData.f70y, charData.f71z, Math.max(charData.width, charData.depth), charData.height, i);
    }

    public static int bugBlockHitCheckType(float f, float f2, float f3, float f4, float f5, int i) {
        if (bugBlock != null) {
            for (int i2 = 0; i2 < 50; i2++) {
                if (bugBlock[i2].type == i && bugBlockHitCheck(f, f2, f3, f4, f5, i2)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static boolean bugBlockRide(CharData charData) {
        charData.f70y -= 0.5f;
        boolean z = bugBlockHitCheck(charData) >= 0;
        charData.f70y += 0.5f;
        return z;
    }

    public static void bugBlockTimeSet(BugBlock bugBlock2) {
        if (bugBlock2.type == -1) {
            return;
        }
        if (bugBlock2.state == 4) {
            bugBlock2.timer = (byte) (bugBlockTime[bugBlock2.type][1] - 1);
            return;
        }
        if (bugBlock2.state == 2) {
            bugBlock2.timer = (byte) (bugBlockTime[bugBlock2.type][2] - 1);
        } else if (bugBlock2.state == 1 || bugBlock2.state == 3) {
            bugBlock2.timer = (byte) (bugBlockTime[bugBlock2.type][1] - 1);
        }
    }

    public static void changeArea(int i) {
        changeArea(i, 10);
    }

    public static void changeArea(int i, int i2) {
        if (GameStatus.PLAYER.getNumberData(19) == 5) {
            if (i == 1) {
                areaNo = i;
                return;
            }
            i2 = 1;
        }
        if (areaNo != i) {
            areaNo = i;
            if (blockAreaNo != areaNo) {
                changeAreaTimer = i2;
                changeAreaTimerMax = i2;
            } else {
                changeAreaTimer = 0;
                changeAreaTimerMax = 0;
            }
        }
    }

    public static int checkBlockPuzzle(int i) {
        int[] iArr = {w2b(bugBlock[i].f69x), w2b(bugBlock[i].f71z)};
        if (iArr[1] < 0 || iArr[0] < 0 || iArr[1] - areaDebugInfo[areaDebugId][3] < 0 || iArr[0] - areaDebugInfo[areaDebugId][2] < 0 || iArr[1] - areaDebugInfo[areaDebugId][3] >= areaDebugCollision[areaDebugId].length || iArr[0] - areaDebugInfo[areaDebugId][2] >= areaDebugCollision[areaDebugId][0].length) {
            return -1;
        }
        if (areaDebugCollision[areaDebugId][iArr[1] - areaDebugInfo[areaDebugId][3]][iArr[0] - areaDebugInfo[areaDebugId][2]] == 0) {
            return -3;
        }
        return getPointCollision(bugBlock[i].f69x, bugBlock[i].f71z) != -1.0f ? 0 : -1;
    }

    public static boolean checkClipBlock(int i) {
        if (GameStatus.PLAYER.getNumberData(19) == 3) {
            return bugBlock[i].view == 1 && bugBlock[i].state != 0 && CameraData.checkClipView(bugBlock[i].f69x - (bugBlock[i].sizeX / 2.0f), bugBlock[i].f70y, 0.0f, bugBlock[i].sizeX, bugBlock[i].sizeY, 0.0f);
        }
        return bugBlock[i].view == 1 && bugBlock[i].state != 0 && CameraData.screenZ(bugBlock[i].f69x, bugBlock[i].f70y, bugBlock[i].f71z, bugBlock[i].sizeX, bugBlock[i].sizeY, bugBlock[i].sizeZ, (float) CameraData.clipNear, (float) CameraData.clipFar) > 0.0f;
    }

    public static int[] checkNearBlock(int i, int i2) {
        int[] iArr = new int[i2];
        int[][] iArr2 = {new int[]{-4, 0}, new int[]{0, 4}, new int[]{4, 0}, new int[]{0, -4}, new int[]{-4, -4}, new int[]{-4, 4}, new int[]{4, -4}, new int[]{4, 4}};
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr3 = {w2b(bugBlock[i].f69x + iArr2[i3][0]), w2b(bugBlock[i].f71z + iArr2[i3][1])};
            if (iArr3[1] < 0 || iArr3[0] < 0) {
                iArr[i3] = -1;
            } else if (iArr3[1] - areaDebugInfo[areaDebugId][3] < 0 || iArr3[0] - areaDebugInfo[areaDebugId][2] < 0) {
                iArr[i3] = -1;
            } else if (iArr3[1] - areaDebugInfo[areaDebugId][3] >= areaDebugCollision[areaDebugId].length || iArr3[0] - areaDebugInfo[areaDebugId][2] >= areaDebugCollision[areaDebugId][0].length) {
                iArr[i3] = -1;
            } else if (areaDebugCollision[areaDebugId][iArr3[1] - areaDebugInfo[areaDebugId][3]][iArr3[0] - areaDebugInfo[areaDebugId][2]] == 0) {
                iArr[i3] = -3;
            } else if (getPointCollision(bugBlock[i].f69x + iArr2[i3][0], bugBlock[i].f71z + iArr2[i3][1]) == -1.0f) {
                iArr[i3] = -1;
            }
        }
        for (int i4 = 0; i4 < 50; i4++) {
            if (bugBlock[i4].view != 0 && ((bugBlock[i4].type == 5 || bugBlock[i4].type == 6) && bugBlock[i4].moveDis == 0.0f)) {
                int[] iArr4 = {w2b(bugBlock[i].f69x), w2b(bugBlock[i].f71z)};
                int[] iArr5 = {w2b(bugBlock[i4].f69x), w2b(bugBlock[i4].f71z)};
                for (int i5 = 0; i5 < i2; i5++) {
                    if (iArr[i5] == 0 && iArr4[0] + (iArr2[i5][0] / 4) == iArr5[0] && iArr4[1] + (iArr2[i5][1] / 4) == iArr5[1]) {
                        iArr[i5] = i4 + 1;
                        break;
                    }
                }
            }
        }
        return iArr;
    }

    public static void clearBlockData() {
        for (int i = 0; i < 50; i++) {
            bugBlock[i].clear();
        }
    }

    public static boolean collisionJoinCheck(float f, float f2, float f3, float f4) {
        _bx[0] = w2b(f);
        _bx[1] = w2b(f3);
        _bz[0] = w2b(f2);
        _bz[1] = w2b(f4);
        if (_bx[0] >= 0 && ((collisionData[0].length > _bx[0] || _bx[1] >= 0) && ((collisionData[0].length > _bx[1] || _bz[0] >= 0) && ((collisionData.length > _bz[0] || _bz[1] >= 0) && collisionData.length > _bz[1] && Math.abs(_bx[0] - _bx[1]) <= 1 && Math.abs(_bz[0] - _bz[1]) <= 1 && ((_bx[0] >= _bx[1] || (collisionData[_bz[0]][_bx[0]].f17y[1] == collisionData[_bz[0]][_bx[1]].f17y[0] && collisionData[_bz[0]][_bx[0]].f17y[2] == collisionData[_bz[0]][_bx[1]].f17y[3] && collisionData[_bz[1]][_bx[0]].f17y[1] == collisionData[_bz[1]][_bx[1]].f17y[0] && collisionData[_bz[1]][_bx[0]].f17y[2] == collisionData[_bz[1]][_bx[1]].f17y[3])) && ((_bx[0] <= _bx[1] || (collisionData[_bz[0]][_bx[1]].f17y[1] == collisionData[_bz[0]][_bx[0]].f17y[0] && collisionData[_bz[0]][_bx[1]].f17y[2] == collisionData[_bz[0]][_bx[0]].f17y[3] && collisionData[_bz[1]][_bx[1]].f17y[1] == collisionData[_bz[1]][_bx[0]].f17y[0] && collisionData[_bz[1]][_bx[1]].f17y[2] == collisionData[_bz[1]][_bx[0]].f17y[3])) && (_bz[0] >= _bz[1] || (collisionData[_bz[0]][_bx[0]].f17y[3] == collisionData[_bz[1]][_bx[0]].f17y[0] && collisionData[_bz[0]][_bx[0]].f17y[2] == collisionData[_bz[1]][_bx[0]].f17y[1])))))))) {
            if (_bz[0] <= _bz[1]) {
                return true;
            }
            if (collisionData[_bz[1]][_bx[0]].f17y[3] == collisionData[_bz[0]][_bx[0]].f17y[0] && collisionData[_bz[1]][_bx[0]].f17y[2] == collisionData[_bz[0]][_bx[0]].f17y[1]) {
                return true;
            }
        }
        return false;
    }

    public static void copyAreaBlock(int i) {
        for (int i2 = 0; i2 < 50 - gBlockNum; i2++) {
            bugBlock[i2].clear();
            if (bugBlockAll.length > 0 && i2 < bugBlockAll[i].length) {
                BugBlock.copyBlock(bugBlockAll[i][i2], bugBlock[i2]);
                bugBlockTimeSet(bugBlock[i2]);
            }
        }
    }

    public static void copyAreaDebugCollision(int i) {
        if (areaDebugCollision == null) {
            return;
        }
        areaDebugCollisionNow = (int[][]) null;
        if (areaDebugCollision[i] != null) {
            areaDebugCollisionNow = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, areaDebugCollision[i].length, areaDebugCollision[i][0].length);
            for (int i2 = 0; i2 < areaDebugCollisionNow.length; i2++) {
                for (int i3 = 0; i3 < areaDebugCollisionNow[i2].length; i3++) {
                    areaDebugCollisionNow[i2][i3] = areaDebugCollision[i][i2][i3];
                }
            }
        }
    }

    public static int coreBlockBreak() {
        int i = 0;
        for (int i2 = 0; i2 < 50; i2++) {
            if (bugBlock[i2].state != 0) {
                bugBlock[i2].state = (byte) 3;
                bugBlockTimeSet(bugBlock[i2]);
                BugBlock bugBlock2 = bugBlock[i2];
                bugBlock2.timer = (byte) (bugBlock2.timer + Util.randomFix(0, 4));
                i++;
            }
        }
        for (int i3 = 0; i3 < bugBlockAll[areaNo].length; i3++) {
            bugBlockAll[areaNo][i3].state = (byte) 0;
        }
        return i;
    }

    public static void debugLightSet(boolean z) {
        if (!z) {
            light.setColor(lightColorBack);
            light.setIntensity(1.0f);
        } else {
            lightColorBack = light.getColor();
            light.setColor(debugLightColor);
            light.setIntensity(debugLightPow);
        }
    }

    public static void fallBlockSet(int i, int i2) {
        bugBlock[i].root = (byte) -127;
        bugBlock[i].nextRoot = (byte) 4;
        bugBlock[i].offsetX = 0.0f;
        bugBlock[i].offsetY = (byte) ((bugBlock[i].f70y - i2) - bugBlock[i].f70y);
        bugBlock[i].offsetZ = 0.0f;
    }

    public static short getAddData(int i) {
        if (addData == null || addData.length <= i) {
            return (short) 0;
        }
        return addData[i];
    }

    public static float getAreaCollision(float f, float f2, float f3, float f4, float f5, boolean z) {
        float f6;
        float f7 = -999.0f;
        if (f4 == 0.0f) {
            float pointCollision = getPointCollision(f, f3);
            if (pointCollision < 0.0f) {
                return pointCollision;
            }
            f6 = pointCollision;
        } else {
            float f8 = f4 / 2.0f;
            int i = 3;
            while (i >= 0) {
                float pointCollision2 = getPointCollision(f + (i < 2 ? -f8 : f8), (((i + 1) & 2) == 0 ? -f8 : f8) + f3);
                if (pointCollision2 < 0.0f) {
                    return pointCollision2;
                }
                if (f7 >= pointCollision2) {
                    pointCollision2 = f7;
                }
                i--;
                f7 = pointCollision2;
            }
            _bx[0] = w2b(f - f8);
            _bx[1] = w2b(f + f8);
            _bz[0] = w2b(f3 - f8);
            _bz[1] = w2b(f8 + f3);
            for (int i2 = _bx[0]; i2 < _bx[1]; i2++) {
                for (int i3 = _bz[0]; i3 < _bz[1]; i3++) {
                    int i4 = (i2 + 1) << 2;
                    int i5 = (i3 + 1) << 2;
                    int i6 = 0;
                    while (true) {
                        int i7 = i6;
                        if (i7 < 4) {
                            float pointCollision3 = getPointCollision(((i7 & 1) != 0 ? 1 : -1) + i4, ((i7 >> 1) != 0 ? 1 : -1) + i5);
                            if (pointCollision3 < 0.0f) {
                                return pointCollision3;
                            }
                            if (f7 < pointCollision3) {
                                f7 = pointCollision3;
                            }
                            i6 = i7 + 1;
                        }
                    }
                }
            }
            f6 = f7;
        }
        if (z && f6 >= 0.0f) {
            float fBugBlockHeight = bugBlockHeight(f, Math.max(f2, f6), f3, f4, f5);
            if (fBugBlockHeight > f6) {
                return fBugBlockHeight;
            }
        }
        return f6;
    }

    public static float getAreaCollisionShadow(float f, float f2, float f3, float f4, float f5) {
        float f6 = f4 / 2.0f;
        _dxz[0][0] = -f6;
        _dxz[0][1] = -f6;
        _dxz[1][0] = -f6;
        _dxz[1][1] = f6;
        _dxz[2][0] = f6;
        _dxz[2][1] = f6;
        _dxz[3][0] = f6;
        _dxz[3][1] = -f6;
        float f7 = 999.0f;
        int i = 3;
        while (i >= 0) {
            float pointCollision = getPointCollision(_dxz[i][0] + f, _dxz[i][1] + f3);
            if (pointCollision < 0.0f) {
                return pointCollision;
            }
            float fBugBlockHeight = bugBlockHeight(_dxz[i][0] + f, f2, _dxz[i][1] + f3, 0.0f, f5);
            if (fBugBlockHeight > pointCollision && fBugBlockHeight > 0.0f) {
                pointCollision = fBugBlockHeight;
            }
            if (f7 <= pointCollision) {
                pointCollision = f7;
            }
            i--;
            f7 = pointCollision;
        }
        return f7;
    }

    public static int[] getAreaIdList() {
        int[] iArr = new int[15];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = -1;
        }
        for (int i2 = 0; i2 < collisionData.length; i2++) {
            for (int i3 = 0; i3 < collisionData[i2].length; i3++) {
                int i4 = collisionData[i2][i3].areaNo & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                if (i4 >= 0 && i4 < 255 && Util.check(iArr, i4) < 0) {
                    Util.insert(iArr, i4);
                }
            }
        }
        return iArr;
    }

    public static Collision getCharCollisionData(float f, float f2) {
        int iW2b = w2b(f);
        int iW2b2 = w2b(f2);
        if (iW2b < 0 || iW2b2 < 0 || iW2b2 >= collisionData.length || iW2b >= collisionData[iW2b2].length) {
            return null;
        }
        return collisionData[iW2b2][iW2b];
    }

    public static Collision getCharCollisionData(CharData charData) {
        return getCharCollisionData(charData.f69x, charData.f71z);
    }

    public static int getCollisionOption(float f, float f2, float f3, float f4, int i) {
        float f5 = f4 / 2.0f;
        _bx[0] = w2b(f - f5);
        _bx[1] = w2b(f + f5);
        _bz[0] = w2b(f3 - f5);
        _bz[1] = w2b(f5 + f3);
        int i2 = 0;
        for (int i3 = _bx[0]; i3 <= _bx[1]; i3++) {
            for (int i4 = _bz[0]; i4 <= _bz[1]; i4++) {
                if (i3 >= 0 && i4 >= 0 && i4 < collisionData.length && i3 < collisionData[i4].length && (i == 0 || ((i == 1 && f2 >= Math.min((int) collisionData[i4][i3].f17y[0], Math.min((int) collisionData[i4][i3].f17y[1], Math.min((int) collisionData[i4][i3].f17y[2], (int) collisionData[i4][i3].f17y[3])))) || (i == 2 && f2 <= Math.max((int) collisionData[i4][i3].f17y[0], Math.max((int) collisionData[i4][i3].f17y[1], Math.max((int) collisionData[i4][i3].f17y[2], (int) collisionData[i4][i3].f17y[3]))))))) {
                    i2 |= collisionData[i4][i3].option;
                }
            }
        }
        return i2;
    }

    public static int getPointAmbient(float f, float f2) {
        float f3;
        int i;
        int i2;
        int i3;
        int i4;
        int iW2b = w2b(f);
        int iW2b2 = w2b(f2);
        if (f < 0.0f || f2 < 0.0f || iW2b2 >= collisionData.length || iW2b >= collisionData[iW2b2].length || collisionData[iW2b2][iW2b].ambient < 0) {
            return 8421504;
        }
        float fB2w = (f - b2w(iW2b)) + 2.0f;
        float fB2w2 = (f2 - b2w(iW2b2)) + 2.0f;
        if (fB2w > 2.0f && iW2b < collisionData[iW2b2].length - 1 && collisionData[iW2b2][iW2b + 1].ambient >= 0) {
            f3 = fB2w - 2.0f;
            i = iW2b + 1;
            i2 = iW2b;
        } else if (fB2w >= 2.0f || iW2b <= 0 || collisionData[iW2b2][iW2b - 1].ambient < 0) {
            f3 = fB2w;
            i = iW2b;
            i2 = iW2b;
        } else {
            f3 = fB2w + 2.0f;
            i = iW2b;
            i2 = iW2b - 1;
        }
        if (fB2w2 > 2.0f && iW2b2 < collisionData.length - 1 && collisionData[iW2b2 + 1][i2].ambient >= 0 && collisionData[iW2b2 + 1][i].ambient >= 0) {
            i3 = iW2b2 + 1;
            fB2w2 -= 2.0f;
            i4 = iW2b2;
        } else if (fB2w2 >= 2.0f || iW2b2 <= 0 || collisionData[iW2b2 - 1][i2].ambient < 0 || collisionData[iW2b2 - 1][i].ambient < 0) {
            i3 = iW2b2;
            i4 = iW2b2;
        } else {
            i4 = iW2b2 - 1;
            fB2w2 += 2.0f;
            i3 = iW2b2;
        }
        for (int i5 = 0; i5 < 3; i5++) {
            _ret[i5] = ((int) ((((((ambientList[collisionData[i4][i2].ambient] >> (i5 << 3)) & 255) * (4.0f - fB2w2)) + (((ambientList[collisionData[i3][i2].ambient] >> (i5 << 3)) & 255) * fB2w2)) * (4.0f - f3)) + (((((ambientList[collisionData[i4][i].ambient] >> (i5 << 3)) & 255) * (4.0f - fB2w2)) + (((ambientList[collisionData[i3][i].ambient] >> (i5 << 3)) & 255) * fB2w2)) * f3))) >> 4;
        }
        return (_ret[2] << 16) + (_ret[1] << 8) + _ret[0];
    }

    public static float getPointCollision(float f, float f2) {
        int iW2b = w2b(f);
        int iW2b2 = w2b(f2);
        if (iW2b < 0 || iW2b >= collisionData[0].length || iW2b2 < 0 || iW2b2 >= collisionData.length) {
            return -1.0f;
        }
        if (collisionData[iW2b2][iW2b].f17y[0] < 0) {
            return collisionData[iW2b2][iW2b].f17y[0];
        }
        if (areaDebugCollisionNow != null) {
            if (iW2b2 - areaDebugInfo[areaDebugId][3] < 0 || iW2b - areaDebugInfo[areaDebugId][2] < 0 || iW2b2 - areaDebugInfo[areaDebugId][3] >= areaDebugCollisionNow.length || iW2b - areaDebugInfo[areaDebugId][2] >= areaDebugCollisionNow[0].length || areaDebugCollisionNow[iW2b2 - areaDebugInfo[areaDebugId][3]][iW2b - areaDebugInfo[areaDebugId][2]] == 0) {
                return -1.0f;
            }
        } else if ((collisionData[iW2b2][iW2b].option & 2) != 0) {
            return 0.0f;
        }
        float fB2w = (f - b2w(iW2b)) + 2.0f;
        float fB2w2 = (f2 - b2w(iW2b2)) + 2.0f;
        if (collisionData[iW2b2][iW2b].f17y[0] == collisionData[iW2b2][iW2b].f17y[1] && collisionData[iW2b2][iW2b].f17y[0] == collisionData[iW2b2][iW2b].f17y[2]) {
            return collisionData[iW2b2][iW2b].f17y[0];
        }
        return ((fB2w * ((collisionData[iW2b2][iW2b].f17y[2] * fB2w2) + (collisionData[iW2b2][iW2b].f17y[1] * (4.0f - fB2w2)))) + (((collisionData[iW2b2][iW2b].f17y[0] * (4.0f - fB2w2)) + (collisionData[iW2b2][iW2b].f17y[3] * fB2w2)) * (4.0f - fB2w))) / 16.0f;
    }

    public static float getPointCollisionHighest(float f, float f2) {
        int iW2b = w2b(f);
        int iW2b2 = w2b(f2);
        if (iW2b < 0 || iW2b >= collisionData[0].length || iW2b2 < 0 || iW2b2 >= collisionData.length) {
            return -1.0f;
        }
        if (collisionData[iW2b2][iW2b].f17y[0] < 0) {
            return collisionData[iW2b2][iW2b].f17y[0];
        }
        if ((collisionData[iW2b2][iW2b].option & 2) != 0) {
            return 0.0f;
        }
        return Math.max((int) collisionData[iW2b2][iW2b].f17y[0], Math.max((int) collisionData[iW2b2][iW2b].f17y[1], Math.max((int) collisionData[iW2b2][iW2b].f17y[2], (int) collisionData[iW2b2][iW2b].f17y[3])));
    }

    public static boolean hitBlock(int i) {
        return (bugBlock[i].type == -1 || bugBlock[i].type == 3 || bugBlock[i].type == 12 || bugBlock[i].type == 13 || bugBlock[i].type == 7 || bugBlock[i].type == 8 || bugBlock[i].type == 9 || bugBlock[i].type == 10) ? false : true;
    }

    public static void init() {
        mmapApp = new Appearance();
        mmapApp.setAlphaThreshold(1);
        mmapApp.setBlendMode(0);
        mmapApp.setTextureBlendMode(0, 4);
        mmapApp.setProperties(mmapApp.getProperties() ^ 8);
        light = new Light(0);
        debugLightColor = 3211056;
        debugLightPow = 3;
        debugLightSet(false);
        bugBlock = new BugBlock[50];
        bugBlockTmpI = new int[50];
        bugBlockTmpF = new float[50];
        for (int i = 0; i < 50; i++) {
            bugBlock[i] = new BugBlock();
        }
    }

    public static boolean isBossBlock(int i) {
        return bugBlock[i].type == 8 || bugBlock[i].type == 9 || bugBlock[i].type == 10;
    }

    public static void mapSetAlpha(Figure figure, int i) {
        int i2 = i < 0 ? 0 : i;
        if (i2 > 255) {
            i2 = 255;
        }
        Appearance[] appearanceArr = new Appearance[figure.findObject3D(14, -1, null)];
        figure.findObject3D(14, -1, appearanceArr);
        for (int i3 = 0; i3 < appearanceArr.length; i3++) {
            int color = (i2 << 24) | (appearanceArr[i3].getColor(1) & GameCommon.K_ANY);
            if (i2 == 255) {
                appearanceArr[i3].setBlendMode(1, 0);
            } else {
                appearanceArr[i3].setBlendMode(4, 5);
            }
            appearanceArr[i3].setColor(1, color);
        }
    }

    public static void moveEnd(int i) {
        bugBlock[i].root = (byte) -1;
        bugBlock[i].nextRoot = (byte) -1;
        bugBlock[i].offsetX = 0.0f;
        bugBlock[i].offsetY = 0.0f;
        bugBlock[i].offsetZ = 0.0f;
        bugBlock[i].moveTime = (short) 0;
    }

    public static int nearBlockCheck(CharData charData, int i) {
        return nearBlockCheck(charData, i, 180, 3.9f);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    public static int nearBlockCheck(CharData charData, int i, int i2, float f) {
        int i3;
        int i4;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        if (bugBlock != null) {
            int i7 = 0;
            while (i7 < 50) {
                if (bugBlock[i7].state == 0 || bugBlock[i7].state == 3 || bugBlock[i7].view != 1 || bugBlock[i7].f9hp <= 0 || bugBlock[i7].f70y >= charData.f70y + f || bugBlock[i7].f70y <= charData.f70y - f) {
                    i3 = i6;
                    i4 = i5;
                } else {
                    int iAbs = (int) Math.abs(Util.DiffDir(charData.dir, Util.atan2_360(bugBlock[i7].f69x - charData.f69x, bugBlock[i7].f71z - charData.f71z)));
                    int distance = (int) Util.getDistance(charData.f69x, charData.f70y, charData.f71z, bugBlock[i7].f69x, bugBlock[i7].f70y, bugBlock[i7].f71z);
                    i4 = distance * (iAbs == 0 ? 1 : iAbs);
                    if (distance >= i || i5 <= i4 || iAbs > i2) {
                        i3 = i6;
                        i4 = i5;
                    } else {
                        i3 = i7;
                    }
                }
                i7++;
                i6 = i3;
                i5 = i4;
            }
        }
        return i6;
    }

    public static int w2b(float f) {
        if (f < 0.0f) {
            return -1;
        }
        return ((int) f) >> 2;
    }

    public static float w2bc(float f) {
        return (((int) f) & 16777212) + 2;
    }
}
