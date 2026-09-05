package p000;

import com.docomostar.ui.util3d.FastMath;
import com.mascotcapsule.eruption.docomostar.Camera;
import com.mascotcapsule.eruption.docomostar.Graphics3D;
import com.mascotcapsule.eruption.docomostar.Transform;
import com.mascotcapsule.eruption.docomostar.Util3D;
import com.mascotcapsule.eruption.docomostar.Vector3D;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class CameraData {
    public static float angDelay;
    public static float angNow;
    public static float angOrg;
    public static float angSet;
    public static float apsDelayX;
    public static float apsDelayY;
    public static float apsDelayZ;
    public static float apsX;
    public static float apsY;
    public static float apsZ;
    public static int clipFar;
    public static int clipFarDef;
    public static int clipNear;
    public static int clipNearDef;
    public static float dirDelay;
    public static float dirNow;
    public static float dirOrg;
    public static float dirSet;
    public static float gazCorrect;
    public static float gazDelayX;
    public static float gazDelayY;
    public static float gazDelayZ;
    public static float gazHeight;
    public static float gazHeightOrg;
    public static float gazX;
    public static float gazY;
    public static float gazZ;
    public static float lenDelay;
    public static float lenNow;
    public static float lenOrg;
    public static float lenSet;
    public static float viewAng;
    public static float viewDat;
    private static Transform trans = null;
    private static float[] transArray = new float[16];
    public static float[] def = new float[3];
    public static float dirEvent = -1.0f;
    public static float angEvent = -999.0f;
    public static float lenEvent = -1.0f;
    public static int ltime = 1;
    public static Camera cam = new Camera();
    public static boolean shake = false;
    public static boolean colOffFlg = false;
    private static float[] perspect = new float[3];
    private static Vector3D[] _vec = {new Vector3D(), new Vector3D(), new Vector3D()};
    private static int radY = 0;

    /* JADX INFO: renamed from: _m */
    private static float[] f10_m = new float[16];
    private static Transform _mat = new Transform();
    private static int[] _ret = new int[3];
    private static float[] _tmp = new float[26];

    /* JADX INFO: renamed from: _z */
    private static float[] f11_z = new float[8];
    private static float[] _xy = new float[8];

    CameraData() {
    }

    public static Vector3D S2W(int i, int i2) {
        return S2W(i, i2, 10);
    }

    public static Vector3D S2W(int i, int i2, int i3) {
        float f = viewDat / i3;
        _vec[1].set((i - 427) / f, (i2 - 240) / f, i3);
        Transform transform = new Transform();
        transform.setInvert(trans);
        transform.get(_tmp);
        _vec[2].set((_vec[1].getX() * _tmp[0]) + (_vec[1].getY() * _tmp[1]) + (_vec[1].getZ() * _tmp[2]) + _tmp[3], (_vec[1].getX() * _tmp[4]) + (_vec[1].getY() * _tmp[5]) + (_vec[1].getZ() * _tmp[6]) + _tmp[7], (_vec[1].getX() * _tmp[8]) + (_vec[1].getY() * _tmp[9]) + (_vec[1].getZ() * _tmp[10]) + _tmp[11]);
        return _vec[2];
    }

    public static int[] W2S(float f, float f2, float f3, boolean z) {
        if (GameStatus.PLAYER.getNumberData(19) == 3) {
            _ret[0] = w2sx2D(f);
            _ret[1] = 480 - w2sy2D(f2);
        } else {
            _vec[0].set(f, f2, f3);
            trans.transPosition(_vec[0]);
            int[] iArr = _ret;
            int[] iArr2 = _ret;
            _ret[2] = 0;
            iArr2[1] = 0;
            iArr[0] = 0;
            if (clipNear < _vec[0].getZ() && _vec[0].getZ() < clipFar) {
                float z2 = viewDat / _vec[0].getZ();
                _ret[0] = ((int) (_vec[0].getX() * z2)) + 427;
                _ret[1] = ((int) (z2 * _vec[0].getY())) + 240;
                if (z || (_ret[0] > 0 && _ret[0] < 854 && _ret[1] > 0 && _ret[1] < 480)) {
                    _ret[2] = (int) (_vec[0].getZ() + 0.5f);
                }
            }
        }
        return _ret;
    }

    public static void apsCoordFromRot() {
        apsX = gazX - (FastMath.sin(dirNow) * lenNow);
        apsZ = gazZ - (FastMath.cos(dirNow) * lenNow);
        apsY = gazY + (FastMath.tan(angNow) * lenNow);
    }

    public static void apsRotFromCoord() {
        float f = gazX - apsX;
        float f2 = apsY - gazY;
        float f3 = gazZ - apsZ;
        dirNow = Util.atan2_360(f, f3);
        lenNow = Util3D.sqrt((f * f) + (f3 * f3));
        if (lenNow == 0.0f) {
            angNow = 90.0f;
        } else {
            angNow = FastMath.atan(f2 / lenNow);
        }
    }

    public static void cameraDelaySet(int i) {
        apsDelayX += (apsX - apsDelayX) / i;
        apsDelayY += (apsY - apsDelayY) / i;
        apsDelayZ += (apsZ - apsDelayZ) / i;
        gazDelayX += (gazX - gazDelayX) / i;
        gazDelayY += (gazY - gazDelayY) / i;
        gazDelayZ += (gazZ - gazDelayZ) / i;
        float f = gazDelayX - apsDelayX;
        float f2 = apsDelayY - gazDelayY;
        float f3 = gazDelayZ - apsDelayZ;
        dirDelay = Util.atan2_360(f, f3);
        lenDelay = Util3D.sqrt((f * f) + (f3 * f3));
        if (lenDelay == 0.0f) {
            angDelay = 90.0f;
        } else {
            angDelay = FastMath.atan(f2 / lenDelay);
        }
    }

    public static boolean checkClipView(float f, float f2, float f3, float f4, float f5, float f6) {
        if (GameStatus.PLAYER.getNumberData(19) != 3) {
            return screenZ(f, f2, f3, f4, f5, f6, (float) clipNear, (float) clipFar) > 0.0f;
        }
        float fW2sx2D = w2sx2D(f - f4);
        float fW2sx2D2 = w2sx2D(f + f4);
        float fW2sy2D = w2sy2D(f2);
        return ((0.0f <= fW2sx2D && fW2sx2D <= 854.0f) || (fW2sx2D <= 0.0f && 0.0f <= fW2sx2D2)) && ((0.0f <= fW2sy2D && fW2sy2D <= 480.0f) || (fW2sy2D <= 0.0f && 0.0f <= ((float) w2sy2D(f2 + f5))));
    }

    public static float getRadY() {
        return radY;
    }

    private static Transform lookAt() {
        _vec[2].set(gazDelayX - apsDelayX, gazDelayY - apsDelayY, gazDelayZ - apsDelayZ);
        if (apsDelayX == gazDelayX && apsDelayZ == gazDelayZ) {
            _vec[1].set(0.0f, 0.0f, 1.0f);
        } else if (radY != 0) {
            _vec[1].set(FastMath.sin(radY), FastMath.cos(radY), 0.0f);
        } else {
            _vec[1].set(0.0f, 1.0f, 0.0f);
        }
        _vec[2].normalize(_vec[2]);
        _vec[0].cross(_vec[2], _vec[1]);
        _vec[0].normalize(_vec[0]);
        _vec[1].cross(_vec[2], _vec[0]);
        f10_m[0] = _vec[0].getX();
        f10_m[1] = _vec[1].getX();
        f10_m[2] = _vec[2].getX();
        f10_m[3] = apsDelayX;
        f10_m[4] = _vec[0].getY();
        f10_m[5] = _vec[1].getY();
        f10_m[6] = _vec[2].getY();
        f10_m[7] = apsDelayY;
        f10_m[8] = _vec[0].getZ();
        f10_m[9] = _vec[1].getZ();
        f10_m[10] = _vec[2].getZ();
        f10_m[11] = apsDelayZ;
        f10_m[12] = 0.0f;
        f10_m[13] = 0.0f;
        f10_m[14] = 0.0f;
        f10_m[15] = 1.0f;
        _mat.set(f10_m);
        _mat.setInvert(_mat);
        return _mat;
    }

    public static void resetPerspect() {
        perspect[0] = 0.0f;
        perspect[1] = 0.0f;
        perspect[2] = 0.0f;
    }

    public static float screenZ(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f4 / 2.0f;
        float f10 = f6 / 2.0f;
        trans.get(_tmp);
        _tmp[18] = f - f9;
        _tmp[19] = f9 + f;
        _tmp[20] = f2;
        _tmp[21] = f2 + f5;
        _tmp[22] = f3 - f10;
        _tmp[23] = f10 + f3;
        _tmp[12] = _tmp[8] * _tmp[18];
        _tmp[13] = _tmp[8] * _tmp[19];
        _tmp[14] = _tmp[9] * _tmp[20];
        _tmp[15] = _tmp[9] * _tmp[21];
        _tmp[16] = _tmp[10] * _tmp[22];
        _tmp[17] = _tmp[10] * _tmp[23];
        f11_z[0] = _tmp[12] + _tmp[14] + _tmp[16] + _tmp[11];
        f11_z[1] = _tmp[13] + _tmp[14] + _tmp[16] + _tmp[11];
        f11_z[2] = _tmp[13] + _tmp[14] + _tmp[17] + _tmp[11];
        f11_z[3] = _tmp[12] + _tmp[14] + _tmp[17] + _tmp[11];
        f11_z[4] = _tmp[12] + _tmp[15] + _tmp[16] + _tmp[11];
        f11_z[5] = _tmp[13] + _tmp[15] + _tmp[16] + _tmp[11];
        f11_z[6] = _tmp[13] + _tmp[15] + _tmp[17] + _tmp[11];
        f11_z[7] = _tmp[12] + _tmp[15] + _tmp[17] + _tmp[11];
        _tmp[24] = Math.min(f11_z[0], Math.min(f11_z[1], Math.min(f11_z[2], Math.min(f11_z[3], Math.min(f11_z[4], Math.min(f11_z[5], Math.min(f11_z[6], f11_z[7])))))));
        _tmp[25] = Math.max(f11_z[0], Math.max(f11_z[1], Math.max(f11_z[2], Math.max(f11_z[3], Math.max(f11_z[4], Math.max(f11_z[5], Math.max(f11_z[6], f11_z[7])))))));
        if (_tmp[25] <= f7 || f8 <= _tmp[24]) {
            return -1.0f;
        }
        if (_tmp[24] < 0.1f) {
            for (int i = 0; i < f11_z.length; i++) {
                f11_z[i] = Math.max(f11_z[i], 0.1f);
            }
        }
        for (int i2 = 0; i2 < f11_z.length; i2++) {
            f11_z[i2] = viewDat / f11_z[i2];
        }
        _tmp[12] = _tmp[0] * _tmp[18];
        _tmp[13] = _tmp[0] * _tmp[19];
        _tmp[14] = _tmp[1] * _tmp[20];
        _tmp[15] = _tmp[1] * _tmp[21];
        _tmp[16] = _tmp[2] * _tmp[22];
        _tmp[17] = _tmp[2] * _tmp[23];
        _xy[0] = (_tmp[12] + _tmp[14] + _tmp[16] + _tmp[3]) * f11_z[0];
        _xy[1] = (_tmp[13] + _tmp[14] + _tmp[16] + _tmp[3]) * f11_z[1];
        _xy[2] = (_tmp[13] + _tmp[14] + _tmp[17] + _tmp[3]) * f11_z[2];
        _xy[3] = (_tmp[12] + _tmp[14] + _tmp[17] + _tmp[3]) * f11_z[3];
        _xy[4] = (_tmp[12] + _tmp[15] + _tmp[16] + _tmp[3]) * f11_z[4];
        _xy[5] = (_tmp[13] + _tmp[15] + _tmp[16] + _tmp[3]) * f11_z[5];
        _xy[6] = (_tmp[13] + _tmp[15] + _tmp[17] + _tmp[3]) * f11_z[6];
        _xy[7] = (_tmp[12] + _tmp[15] + _tmp[17] + _tmp[3]) * f11_z[7];
        if ((_xy[0] < -427.0f && _xy[1] < -427.0f && _xy[2] < -427.0f && _xy[3] < -427.0f && _xy[4] < -427.0f && _xy[5] < -427.0f && _xy[6] < -427.0f && _xy[7] < -427.0f) || (_xy[0] > 427.0f && _xy[1] > 427.0f && _xy[2] > 427.0f && _xy[3] > 427.0f && _xy[4] > 427.0f && _xy[5] > 427.0f && _xy[6] > 427.0f && _xy[7] > 427.0f)) {
            return -1.0f;
        }
        _tmp[12] = _tmp[4] * _tmp[18];
        _tmp[13] = _tmp[4] * _tmp[19];
        _tmp[14] = _tmp[5] * _tmp[20];
        _tmp[15] = _tmp[5] * _tmp[21];
        _tmp[16] = _tmp[6] * _tmp[22];
        _tmp[17] = _tmp[6] * _tmp[23];
        _xy[0] = (_tmp[12] + _tmp[14] + _tmp[16] + _tmp[7]) * f11_z[0];
        _xy[1] = (_tmp[13] + _tmp[14] + _tmp[16] + _tmp[7]) * f11_z[1];
        _xy[2] = (_tmp[13] + _tmp[14] + _tmp[17] + _tmp[7]) * f11_z[2];
        _xy[3] = (_tmp[12] + _tmp[14] + _tmp[17] + _tmp[7]) * f11_z[3];
        _xy[4] = (_tmp[12] + _tmp[15] + _tmp[16] + _tmp[7]) * f11_z[4];
        _xy[5] = (_tmp[13] + _tmp[15] + _tmp[16] + _tmp[7]) * f11_z[5];
        _xy[6] = (_tmp[13] + _tmp[15] + _tmp[17] + _tmp[7]) * f11_z[6];
        _xy[7] = (_tmp[12] + _tmp[15] + _tmp[17] + _tmp[7]) * f11_z[7];
        if ((_xy[0] >= -240.0f || _xy[1] >= -240.0f || _xy[2] >= -240.0f || _xy[3] >= -240.0f || _xy[4] >= -240.0f || _xy[5] >= -240.0f || _xy[6] >= -240.0f || _xy[7] >= -240.0f) && (_xy[0] <= 240.0f || _xy[1] <= 240.0f || _xy[2] <= 240.0f || _xy[3] <= 240.0f || _xy[4] <= 240.0f || _xy[5] <= 240.0f || _xy[6] <= 240.0f || _xy[7] <= 240.0f)) {
            return Math.max(_tmp[24], 0.1f);
        }
        return -1.0f;
    }

    public static void setCharPos(CharData charData, boolean z) {
        gazX = charData.f69x;
        gazZ = charData.f71z;
        gazX += FastMath.sin(dirNow) * gazCorrect;
        gazZ += FastMath.cos(dirNow) * gazCorrect;
        if (z) {
            gazY = MapData.getAreaCollisionShadow(charData.f69x, charData.f70y, charData.f71z, 0.0f, charData.height) + gazHeight;
        } else {
            gazY = charData.f70y + gazHeight;
        }
        apsCoordFromRot();
    }

    public static void setPerspectiveView(Graphics3D graphics3D, boolean z) {
        if (!z && clipNear == perspect[0] && clipFar == perspect[1] && viewAng == perspect[2]) {
            return;
        }
        perspect[0] = clipNear;
        perspect[1] = clipFar;
        perspect[2] = viewAng;
        cam.setPerspectiveFov(1.7791667f, viewAng / 360.0f, clipNear, clipFar);
        graphics3D.setCamera(cam, null);
    }

    public static void setPointPos(float f, float f2, float f3) {
        gazX = f;
        gazZ = f3;
        gazX += FastMath.sin(dirNow) * gazCorrect;
        gazZ += FastMath.cos(dirNow) * gazCorrect;
        gazY = gazHeight + f2;
        apsCoordFromRot();
        cameraDelaySet(1);
    }

    public static void setPosParallel(float f, float f2, float f3) {
        gazX = f;
        gazZ = f3;
        gazY = f2;
        apsCoordFromRot();
    }

    public static void setRadY(int i) {
        radY = i % 360;
    }

    public static float sx2w2D(int i) {
        return ((i / 12.0f) + apsX) - 35.0f;
    }

    public static float sy2w2D(int i) {
        return ((i / 12.0f) + apsY) - 20.0f;
    }

    public static void transSet(Graphics3D graphics3D) {
        if (apsDelayX == gazDelayX && apsDelayZ == gazDelayZ) {
            _vec[2].set(FastMath.sin(dirDelay), 0.0f, FastMath.cos(dirDelay));
        } else if (radY != 0) {
            _vec[2].set(FastMath.sin(radY), FastMath.cos(radY), 0.0f);
        } else {
            _vec[2].set(0.0f, 1.0f, 0.0f);
        }
        if (GameStatus.GAME.gameStop || !shake) {
            _vec[0].set(apsDelayX, apsDelayY, apsDelayZ);
        } else {
            _vec[0].set((Util.randomFix(-1, 1) * 0.3f) + apsDelayX, (Util.randomFix(-1, 1) * 0.3f) + apsDelayY, (Util.randomFix(-1, 1) * 0.3f) + apsDelayZ);
        }
        _vec[1].set(gazDelayX - apsDelayX, gazDelayY - apsDelayY, gazDelayZ - apsDelayZ);
        graphics3D.setCamera(cam, _vec[0], _vec[1], _vec[2]);
        trans = lookAt();
    }

    public static void viewAngSet(float f) {
        viewAng = f;
        viewDat = 240.0f / FastMath.tan(f / 2.0f);
    }

    public static int w2sx2D(float f) {
        return 427 - ((int) ((apsX - f) * 12.0f));
    }

    public static int w2sy2D(float f) {
        return 240 - ((int) ((apsY - f) * 12.0f));
    }

    public static void worldSelectEnd(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        viewAng = f;
        viewAngSet(viewAng);
        dirNow = f2;
        angNow = f3;
        lenNow = f4;
        apsRotFromCoord();
        apsCoordFromRot();
        cameraDelaySet(1);
    }

    public static void worldSelectInit(int i) {
        apsX = 0.0f;
        apsY = 0.0f;
        apsZ = 0.0f;
        gazX = 0.0f;
        gazY = 0.0f;
        gazZ = 0.0f;
        clipNear = 1;
        clipFar = 240;
        dirNow = 180.0f;
        angNow = 25.0f;
        lenNow = 20.0f;
        gazCorrect = i;
        setPointPos(0.0f, 0.0f, 0.0f);
        apsRotFromCoord();
        viewAng = 1.0f;
        viewAngSet(viewAng);
        gazY = 5.0f;
        gazZ = 87.0f;
        apsRotFromCoord();
        apsCoordFromRot();
        cameraDelaySet(1);
        setPerspectiveView(GameCommon.f56g3, true);
    }
}
