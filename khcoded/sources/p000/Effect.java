package p000;

import com.docomostar.ui.util3d.FastMath;
import com.jcraft.jzlib.ZInputStream;
import com.mascotcapsule.eruption.docomostar.Figure;
import com.mascotcapsule.eruption.docomostar.Transform;
import com.mascotcapsule.eruption.docomostar.Util3D;
import com.mascotcapsule.eruption.docomostar.Vector3D;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Effect {
    private static final byte ATTACK_FIGURE_NUM = 10;
    public static final byte CATEGORY_ALWAYS = 0;
    public static final byte CATEGORY_MAX = 13;
    public static final byte CATEGORY_STAGE = 1;
    private static final byte EFFECT_NUM = 32;
    public static final short EVENT_ID_TRINITY = 300;
    private static EffectData[] effectData;
    private static EffectList[][] idList = (EffectList[][]) null;
    private static EffectObject[][] objList = (EffectObject[][]) null;
    private static EffectObject[] afterEffect = null;
    public static boolean effectUndrawFlag = false;
    private static final Effect effect = new Effect();
    public static float[] _xyz = new float[3];

    class EffectData {
        public int bind;
        public int blend;
        public int category;
        public int endFrame;
        public int eventId;
        public boolean flip;
        public boolean frameExe;
        private VipObject homing;

        /* JADX INFO: renamed from: id */
        public int f26id;
        public boolean loop;
        public float moveFrame;
        public float moveMax;
        public float moveX;
        public float moveY;
        public float moveZ;
        public float option;
        public boolean rAnime;
        public float[] scale = new float[3];
        public int startFrame;
        private final Effect this$0;
        public int time;
        public int timeMax;
        public boolean use;

        /* JADX INFO: renamed from: v */
        public int f27v;
        public boolean vFlag;
        public float vFrame;
        public int vMax;
        public int vMoveColor;

        /* JADX INFO: renamed from: x */
        public float f28x;

        /* JADX INFO: renamed from: y */
        public float f29y;

        /* JADX INFO: renamed from: z */
        public float f30z;

        EffectData(Effect effect) {
            this.this$0 = effect;
        }
    }

    private Effect() {
        effectData = new EffectData[32];
        for (int i = 0; i < effectData.length; i++) {
            effectData[i] = new EffectData(this);
        }
        idList = new EffectList[13][];
        objList = new EffectObject[13][];
        afterEffect = new EffectObject[4];
    }

    public static void changePos(int i, float f, float f2, float f3) {
        for (int i2 = 0; i2 < effectData.length; i2++) {
            if (effectData[i2].use && effectData[i2].eventId > 0 && effectData[i2].eventId == i) {
                effectData[i2].f28x = f;
                effectData[i2].f29y = f2;
                effectData[i2].f30z = f3;
                return;
            }
        }
    }

    public static void changePosIdx(int i, float f, float f2, float f3) {
        if (effectData[i].use) {
            effectData[i].f28x = f;
            effectData[i].f29y = f2;
            effectData[i].f30z = f3;
        }
    }

    public static void clear(int i) {
        for (int i2 = 0; i2 < effectData.length; i2++) {
            if (effectData[i2].use && effectData[i2].eventId > 0 && effectData[i2].eventId == i) {
                clearEffect(i2);
            }
        }
    }

    public static void clearAllEffect() {
        for (int i = 0; i < effectData.length; i++) {
            clearEffect(i);
        }
    }

    public static void clearBattleCancel() {
        for (int i = 0; i < effectData.length; i++) {
            if ((effectData[i].eventId <= 0 || effectData[i].eventId >= 256) && (500 > effectData[i].eventId || effectData[i].eventId >= 700)) {
                clearEffect(i);
            }
        }
    }

    public static void clearEffect(int i) {
        if (effectData[i].vFlag) {
            EffectList effectList = getEffectList(effectData[i].category, effectData[i].f26id);
            if (effectList != null) {
                for (int i2 = 0; i2 < effectList.modelList.length; i2++) {
                    EffectObject effectObject = getEffectObject(effectData[i].category, effectList.modelList[i2]);
                    if (effectObject != null && effectObject.figure != null) {
                        Util.multiVertexTransparency(1.0f, GameCommon.K_ANY, effectObject.figure, false);
                    }
                }
            }
            effectData[i].vFlag = false;
        }
        effectData[i].use = false;
        effectData[i].homing = null;
        effectUndrawFlag = false;
    }

    public static void clearOtherAllEffect(int i) {
        for (int i2 = 0; i2 < effectData.length; i2++) {
            if (effectData[i2].eventId != i) {
                clearEffect(i2);
            }
        }
    }

    public static void clearThinkEffect() {
        for (int i = 0; i < effectData.length; i++) {
            if (effectData[i].use && effectData[i].eventId >= 1000 && effectData[i].eventId < 10000) {
                clearEffect(i);
            }
        }
    }

    public static void ctrl() {
        for (int i = 0; i < effectData.length; i++) {
            if (effectData[i].use && ((!GameStatus.EXTRA.isCheatMode(1) || effectData[i].category == Character.getCharIndex(Character.charData[0].charId) + 2) && effectData[i].bind < 0)) {
                if (effectData[i].moveMax > 0.0f) {
                    effectData[i].f28x += effectData[i].moveX;
                    effectData[i].f29y += effectData[i].moveY;
                    effectData[i].f30z += effectData[i].moveZ;
                    effectData[i].moveFrame += 1.0f;
                    if (effectData[i].moveFrame >= effectData[i].moveMax) {
                        effectData[i].moveMax = 0.0f;
                    }
                }
                if (effectData[i].vFrame > 0.0f) {
                    effectData[i].f27v += effectData[i].vMoveColor;
                    effectData[i].vFrame -= 1.0f;
                    if (effectData[i].vFrame <= 0.0f) {
                        effectData[i].f27v = effectData[i].vMax;
                    }
                }
                effectData[i].time++;
                if (effectData[i].loop) {
                    if (effectData[i].frameExe) {
                        if (effectData[i].time > effectData[i].endFrame) {
                            effectData[i].time = effectData[i].startFrame;
                        }
                    } else if (effectData[i].time > effectData[i].timeMax) {
                        effectData[i].time = 0;
                    }
                } else if (effectData[i].time > effectData[i].timeMax) {
                    clearEffect(i);
                }
            }
        }
    }

    public static void draw() {
        for (int i = 0; i < effectData.length; i++) {
            if (effectData[i].use && (!GameStatus.EXTRA.isCheatMode(1) || effectData[i].category == Character.getCharIndex(Character.charData[0].charId) + 2)) {
                if (effectData[i].homing != null) {
                    effectData[i].f28x = effectData[i].homing.f69x + effectData[i].moveX;
                    effectData[i].f29y = effectData[i].homing.f70y + effectData[i].moveY;
                    effectData[i].f30z = effectData[i].homing.f71z + effectData[i].moveZ;
                }
                EffectList effectList = getEffectList(effectData[i].category, effectData[i].f26id);
                if (effectList != null) {
                    for (int i2 = 0; i2 < effectList.modelList.length; i2++) {
                        Transform transform = new Transform();
                        EffectObject effectObject = getEffectObject(effectData[i].category, effectList.modelList[i2]);
                        if (effectObject != null) {
                            Figure figure = effectObject.figure;
                            if (effectData[i].vFlag) {
                                Util.multiVertexTransparency(effectData[i].f27v / 255.0f, GameCommon.K_ANY, figure, false);
                            }
                            switch (effectObject.type) {
                                case 1:
                                    Util.setTranslate(effectData[i].f28x, effectData[i].f29y, effectData[i].f30z, transform);
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), (CameraData.dirDelay + 180.0f) / 360.0f, transform);
                                    Util.setRotate(new Vector3D(1.0f, 0.0f, 0.0f), (-CameraData.angDelay) / 360.0f, transform);
                                    break;
                                case 2:
                                    Util.setTranslate(effectData[i].f28x, effectData[i].f29y, effectData[i].f30z, transform);
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), (CameraData.dirDelay + 180.0f) / 360.0f, transform);
                                    break;
                                case 3:
                                    Util.setTranslate(CameraData.gazDelayX, CameraData.gazDelayY, CameraData.gazDelayZ, transform);
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), (CameraData.dirDelay + 180.0f) / 360.0f, transform);
                                    Util.setRotate(new Vector3D(1.0f, 0.0f, 0.0f), (-CameraData.angDelay) / 360.0f, transform);
                                    if (effectObject.setting.length > 0) {
                                        float[] fArr = new float[3];
                                        if (effectData[i].f26id == 6 && GameStatus.PLAYER.getNumberData(19) == 3) {
                                            fArr[0] = 1.2f;
                                            fArr[1] = 1.2f;
                                            fArr[2] = 1.2f;
                                        } else {
                                            fArr[0] = effectObject.setting[0].trans[0];
                                            fArr[1] = effectObject.setting[0].trans[1];
                                            fArr[2] = effectObject.setting[0].trans[2];
                                        }
                                        _xyz[0] = CameraData.gazDelayX - CameraData.apsDelayX;
                                        _xyz[1] = CameraData.apsDelayY - CameraData.gazDelayY;
                                        _xyz[2] = CameraData.gazDelayZ - CameraData.apsDelayZ;
                                        float fSqrt = Util3D.sqrt((_xyz[0] * _xyz[0]) + (_xyz[1] * _xyz[1]) + (_xyz[2] * _xyz[2]));
                                        float fSin = FastMath.sin(CameraData.viewAng / 2.0f) / 0.38256836f;
                                        Util.setScale(fArr[0] * fSqrt * fSin, fArr[1] * fSqrt * fSin, fArr[2] * fSqrt * fSin, transform);
                                    }
                                    break;
                                case 4:
                                    Util.setTranslate(effectData[i].f28x, effectData[i].f29y, effectData[i].f30z, transform);
                                    _xyz[0] = effectData[i].f28x - CameraData.apsDelayX;
                                    _xyz[2] = effectData[i].f30z - CameraData.apsDelayZ;
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), Util.RotDir(180.0f, Util.atan2_360(_xyz[0], _xyz[2])) / 360.0f, transform);
                                    break;
                                case 5:
                                case 6:
                                    Util.setTranslate(effectData[i].f28x, effectData[i].f29y, effectData[i].f30z, transform);
                                    Vector3D vector3D = new Vector3D();
                                    vector3D.set((90.0f - CameraData.angNow) / 360.0f, (Util.atan2_360(CameraData.gazDelayX - CameraData.apsDelayX, CameraData.gazDelayZ - CameraData.apsDelayZ) + 180.0f) / 360.0f, 0.0f);
                                    Util.setRotateEuler(0, vector3D, transform);
                                    Util.setRotate(new Vector3D(1.0f, 0.0f, 0.0f), -0.25f, transform);
                                    break;
                                case 7:
                                    Util.setTranslate(effectData[i].f28x, effectData[i].f29y, effectData[i].f30z, transform);
                                    _xyz[0] = effectData[i].f28x - CameraData.apsDelayX;
                                    _xyz[1] = effectData[i].f29y - CameraData.apsDelayY;
                                    _xyz[2] = effectData[i].f30z - CameraData.apsDelayZ;
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), Util.RotDir(180.0f, Util.atan2_360(_xyz[0], _xyz[2])) / 360.0f, transform);
                                    Util.setRotate(new Vector3D(1.0f, 0.0f, 0.0f), Util.atan2_360(_xyz[1], Util3D.sqrt((_xyz[0] * _xyz[0]) + (_xyz[2] * _xyz[2]))) / 360.0f, transform);
                                    break;
                                default:
                                    Util.setTranslate(effectData[i].f28x, effectData[i].f29y, effectData[i].f30z, transform);
                                    break;
                            }
                            for (int i3 = 0; i3 < effectObject.setting.length; i3++) {
                                switch (effectObject.setting[i3].type) {
                                    case 0:
                                        Util.setScale(effectObject.setting[i3].trans[0], effectObject.setting[i3].trans[1], effectObject.setting[i3].trans[2], transform);
                                        break;
                                    case 1:
                                        Util.setTranslate(effectObject.setting[i3].trans[0], effectObject.setting[i3].trans[1], effectObject.setting[i3].trans[2], transform);
                                        break;
                                    case 2:
                                        Util.setRotate(new Vector3D(effectObject.setting[i3].trans[0], effectObject.setting[i3].trans[1], effectObject.setting[i3].trans[2]), effectObject.setting[i3].trans[3] / 360.0f, transform);
                                        break;
                                    case 3:
                                        Util.setRotate(new Vector3D(effectObject.setting[i3].trans[0], effectObject.setting[i3].trans[1], effectObject.setting[i3].trans[2]), effectData[i].option / 360.0f, transform);
                                        break;
                                    case 4:
                                        if (effectData[i].homing != null) {
                                            float f = effectData[i].homing.angle;
                                            if (f != 0.0f && Util.dirTo8(effectData[i].homing.dir - CameraData.dirDelay) <= 4) {
                                                f *= -1.0f;
                                            }
                                            Util.setRotate(new Vector3D(0.0f, 0.0f, 1.0f), f / 360.0f, transform);
                                            Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), effectData[i].homing.dir / 360.0f, transform);
                                        }
                                        break;
                                    case 5:
                                        Util.setRotate(new Vector3D(effectObject.setting[i3].trans[0], effectObject.setting[i3].trans[1], effectObject.setting[i3].trans[2]), (effectObject.setting[i3].trans[3] * effectData[i].time) / 360.0f, transform);
                                        break;
                                }
                            }
                            if (effectData[i].flip) {
                                Util.setScale(-effectData[i].scale[0], effectData[i].scale[1], effectData[i].scale[2], transform);
                            } else {
                                Util.setScale(effectData[i].scale[0], effectData[i].scale[1], effectData[i].scale[2], transform);
                            }
                            if (!effectData[i].rAnime) {
                                figure.setFrame(effectData[i].time);
                            }
                            GameCommon.f56g3.addDrawQueueFigure(GameCommon.ogl, figure, transform);
                        }
                    }
                }
            }
        }
    }

    public static void draw(int i) {
        for (int i2 = 0; i2 < effectData.length; i2++) {
            if (effectData[i2].use && effectData[i2].eventId == i && (!GameStatus.EXTRA.isCheatMode(1) || effectData[i2].category == Character.getCharIndex(Character.charData[0].charId) + 2)) {
                if (effectData[i2].homing != null) {
                    effectData[i2].f28x = effectData[i2].homing.f69x + effectData[i2].moveX;
                    effectData[i2].f29y = effectData[i2].homing.f70y + effectData[i2].moveY;
                    effectData[i2].f30z = effectData[i2].homing.f71z + effectData[i2].moveZ;
                }
                EffectList effectList = getEffectList(effectData[i2].category, effectData[i2].f26id);
                if (effectList != null) {
                    for (int i3 = 0; i3 < effectList.modelList.length; i3++) {
                        Transform transform = new Transform();
                        EffectObject effectObject = getEffectObject(effectData[i2].category, effectList.modelList[i3]);
                        if (effectObject != null) {
                            Figure figure = effectObject.figure;
                            if (effectData[i2].vFlag) {
                                Util.multiVertexTransparency(effectData[i2].f27v / 255.0f, GameCommon.K_ANY, figure, false);
                            }
                            switch (effectObject.type) {
                                case 1:
                                    Util.setTranslate(effectData[i2].f28x, effectData[i2].f29y, effectData[i2].f30z, transform);
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), (CameraData.dirDelay + 180.0f) / 360.0f, transform);
                                    Util.setRotate(new Vector3D(1.0f, 0.0f, 0.0f), (-CameraData.angDelay) / 360.0f, transform);
                                    break;
                                case 2:
                                    Util.setTranslate(effectData[i2].f28x, effectData[i2].f29y, effectData[i2].f30z, transform);
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), (CameraData.dirDelay + 180.0f) / 360.0f, transform);
                                    break;
                                case 3:
                                    Util.setTranslate(CameraData.gazDelayX, CameraData.gazDelayY, CameraData.gazDelayZ, transform);
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), (CameraData.dirDelay + 180.0f) / 360.0f, transform);
                                    Util.setRotate(new Vector3D(1.0f, 0.0f, 0.0f), (-CameraData.angDelay) / 360.0f, transform);
                                    if (effectObject.setting.length > 0) {
                                        float[] fArr = new float[3];
                                        if (effectData[i2].f26id == 6 && GameStatus.PLAYER.getNumberData(19) == 3) {
                                            fArr[0] = 1.2f;
                                            fArr[1] = 1.2f;
                                            fArr[2] = 1.2f;
                                        } else {
                                            fArr[0] = effectObject.setting[0].trans[0];
                                            fArr[1] = effectObject.setting[0].trans[1];
                                            fArr[2] = effectObject.setting[0].trans[2];
                                        }
                                        _xyz[0] = CameraData.gazDelayX - CameraData.apsDelayX;
                                        _xyz[1] = CameraData.apsDelayY - CameraData.gazDelayY;
                                        _xyz[2] = CameraData.gazDelayZ - CameraData.apsDelayZ;
                                        float fSqrt = Util3D.sqrt((_xyz[0] * _xyz[0]) + (_xyz[1] * _xyz[1]) + (_xyz[2] * _xyz[2]));
                                        float fSin = FastMath.sin(CameraData.viewAng / 2.0f) / 0.38256836f;
                                        Util.setScale(fArr[0] * fSqrt * fSin, fArr[1] * fSqrt * fSin, fArr[2] * fSqrt * fSin, transform);
                                    }
                                    break;
                                case 4:
                                    Util.setTranslate(effectData[i2].f28x, effectData[i2].f29y, effectData[i2].f30z, transform);
                                    _xyz[0] = effectData[i2].f28x - CameraData.apsDelayX;
                                    _xyz[2] = effectData[i2].f30z - CameraData.apsDelayZ;
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), Util.RotDir(180.0f, Util.atan2_360(_xyz[0], _xyz[2])) / 360.0f, transform);
                                    break;
                                case 5:
                                case 6:
                                    Util.setTranslate(effectData[i2].f28x, effectData[i2].f29y, effectData[i2].f30z, transform);
                                    Vector3D vector3D = new Vector3D();
                                    vector3D.set((90.0f - CameraData.angNow) / 360.0f, (Util.atan2_360(CameraData.gazDelayX - CameraData.apsDelayX, CameraData.gazDelayZ - CameraData.apsDelayZ) + 180.0f) / 360.0f, 0.0f);
                                    Util.setRotateEuler(0, vector3D, transform);
                                    Util.setRotate(new Vector3D(1.0f, 0.0f, 0.0f), -0.25f, transform);
                                    break;
                                case 7:
                                    Util.setTranslate(effectData[i2].f28x, effectData[i2].f29y, effectData[i2].f30z, transform);
                                    _xyz[0] = effectData[i2].f28x - CameraData.apsDelayX;
                                    _xyz[1] = effectData[i2].f29y - CameraData.apsDelayY;
                                    _xyz[2] = effectData[i2].f30z - CameraData.apsDelayZ;
                                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), Util.RotDir(180.0f, Util.atan2_360(_xyz[0], _xyz[2])) / 360.0f, transform);
                                    Util.setRotate(new Vector3D(1.0f, 0.0f, 0.0f), Util.atan2_360(_xyz[1], Util3D.sqrt((_xyz[0] * _xyz[0]) + (_xyz[2] * _xyz[2]))) / 360.0f, transform);
                                    break;
                                default:
                                    Util.setTranslate(effectData[i2].f28x, effectData[i2].f29y, effectData[i2].f30z, transform);
                                    break;
                            }
                            for (int i4 = 0; i4 < effectObject.setting.length; i4++) {
                                switch (effectObject.setting[i4].type) {
                                    case 0:
                                        Util.setScale(effectObject.setting[i4].trans[0], effectObject.setting[i4].trans[1], effectObject.setting[i4].trans[2], transform);
                                        break;
                                    case 1:
                                        Util.setTranslate(effectObject.setting[i4].trans[0], effectObject.setting[i4].trans[1], effectObject.setting[i4].trans[2], transform);
                                        break;
                                    case 2:
                                        Util.setRotate(new Vector3D(effectObject.setting[i4].trans[0], effectObject.setting[i4].trans[1], effectObject.setting[i4].trans[2]), effectObject.setting[i4].trans[3] / 360.0f, transform);
                                        break;
                                    case 3:
                                        Util.setRotate(new Vector3D(effectObject.setting[i4].trans[0], effectObject.setting[i4].trans[1], effectObject.setting[i4].trans[2]), effectData[i2].option / 360.0f, transform);
                                        break;
                                    case 4:
                                        if (effectData[i2].homing != null) {
                                            float f = effectData[i2].homing.angle;
                                            if (f != 0.0f && Util.dirTo8(effectData[i2].homing.dir - CameraData.dirDelay) <= 4) {
                                                f *= -1.0f;
                                            }
                                            Util.setRotate(new Vector3D(0.0f, 0.0f, 1.0f), f / 360.0f, transform);
                                            Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), effectData[i2].homing.dir / 360.0f, transform);
                                        }
                                        break;
                                    case 5:
                                        Util.setRotate(new Vector3D(effectObject.setting[i4].trans[0], effectObject.setting[i4].trans[1], effectObject.setting[i4].trans[2]), (effectObject.setting[i4].trans[3] * effectData[i2].time) / 360.0f, transform);
                                        break;
                                }
                            }
                            if (effectData[i2].flip) {
                                Util.setScale(-effectData[i2].scale[0], effectData[i2].scale[1], effectData[i2].scale[2], transform);
                            } else {
                                Util.setScale(effectData[i2].scale[0], effectData[i2].scale[1], effectData[i2].scale[2], transform);
                            }
                            if (!effectData[i2].rAnime) {
                                figure.setFrame(effectData[i2].time);
                            }
                            GameCommon.f56g3.addDrawQueueFigure(GameCommon.ogl, figure, transform);
                        }
                    }
                }
            }
        }
    }

    public static void frameSet(int i, int i2, int i3) {
        effectData[i].frameExe = true;
        effectData[i].startFrame = i2;
        effectData[i].endFrame = i3;
        effectData[i].time = i2;
    }

    public static void free(int i) {
        int categoryIndex = getCategoryIndex(i);
        if (idList != null && idList[categoryIndex] != null) {
            for (int i2 = 0; i2 < idList[categoryIndex].length; i2++) {
                idList[categoryIndex][i2].modelList = null;
                idList[categoryIndex][i2] = null;
            }
            idList[categoryIndex] = null;
        }
        if (objList == null || objList[categoryIndex] == null) {
            return;
        }
        for (int i3 = 0; i3 < objList[categoryIndex].length; i3++) {
            objList[categoryIndex][i3].setting = null;
            Game.FreeFigure(objList[categoryIndex][i3].figure);
            objList[categoryIndex][i3] = null;
        }
        objList[categoryIndex] = null;
    }

    private static int getCategoryIndex(int i) {
        return i >= 65535 ? ((i >> 16) - 1) + 2 : i;
    }

    public static EffectList getEffectList(int i, int i2) {
        if (idList == null) {
            return null;
        }
        int categoryIndex = getCategoryIndex(i);
        for (int i3 = 0; i3 < idList[categoryIndex].length; i3++) {
            if (idList[categoryIndex][i3].effectId == i2) {
                return idList[categoryIndex][i3];
            }
        }
        return null;
    }

    public static EffectObject getEffectObject(int i, int i2) {
        if (i2 < 0 || objList == null) {
            return null;
        }
        int categoryIndex = getCategoryIndex(i);
        if (objList[categoryIndex].length > i2) {
            return objList[categoryIndex][i2];
        }
        return null;
    }

    public static int getMaxFrame(int i, int i2) {
        int iMax = 0;
        EffectList effectList = getEffectList(i, i2);
        if (effectList == null) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            int i4 = iMax;
            if (i3 >= effectList.modelList.length) {
                return i4;
            }
            EffectObject effectObject = getEffectObject(i, effectList.modelList[i3]);
            iMax = effectObject == null ? i4 : Math.max(i4, (int) effectObject.frame);
            i3++;
        }
    }

    public static int getNowTime(int i) {
        return effectData[i].time;
    }

    public static void homingBind(int i, VipObject vipObject, float f) {
        effectData[i].homing = vipObject;
        effectData[i].moveY = f;
    }

    public static void homingBind(int i, VipObject vipObject, float f, float f2, float f3) {
        effectData[i].homing = vipObject;
        effectData[i].moveX = f;
        effectData[i].moveY = f2;
        effectData[i].moveZ = f3;
    }

    public static void homingBindEventId(int i, VipObject vipObject, float f, float f2, float f3) {
        for (int i2 = 0; i2 < effectData.length; i2++) {
            if (effectData[i2].use && effectData[i2].eventId > 0 && effectData[i2].eventId == i) {
                effectData[i2].homing = vipObject;
                effectData[i2].moveX = f;
                effectData[i2].moveY = f2;
                effectData[i2].moveZ = f3;
            }
        }
    }

    public static boolean isSet(int i) {
        for (int i2 = 0; i2 < effectData.length; i2++) {
            if (effectData[i2].use && effectData[i2].eventId > 0 && effectData[i2].eventId == i) {
                return true;
            }
        }
        return false;
    }

    public static void load(ZInputStream zInputStream, int i) throws Exception {
        loadMain(zInputStream, getCategoryIndex(i));
    }

    public static void load(String str, int i) {
        Throwable th;
        ZInputStream zInputStream;
        InputStream inputStreamStrageInputStream;
        ZInputStream zInputStream2;
        try {
            inputStreamStrageInputStream = StrageDeviceAccess.strageInputStream(str);
            try {
                zInputStream2 = new ZInputStream(inputStreamStrageInputStream);
                try {
                    zInputStream2.setBufferSize(65536);
                    loadMain(zInputStream2, getCategoryIndex(i));
                    if (zInputStream2 != null) {
                        try {
                            zInputStream2.close();
                        } catch (Exception e) {
                            return;
                        }
                    }
                    if (inputStreamStrageInputStream != null) {
                        inputStreamStrageInputStream.close();
                    }
                    StrageDeviceAccess.StrageStreamClose();
                } catch (Exception e2) {
                    if (zInputStream2 != null) {
                        try {
                            zInputStream2.close();
                        } catch (Exception e3) {
                            return;
                        }
                    }
                    if (inputStreamStrageInputStream != null) {
                        inputStreamStrageInputStream.close();
                    }
                    StrageDeviceAccess.StrageStreamClose();
                } catch (Throwable th2) {
                    th = th2;
                    zInputStream = zInputStream2;
                    if (zInputStream != null) {
                        try {
                            zInputStream.close();
                        } catch (Exception e4) {
                            throw th;
                        }
                    }
                    if (inputStreamStrageInputStream != null) {
                        inputStreamStrageInputStream.close();
                    }
                    StrageDeviceAccess.StrageStreamClose();
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
            inputStreamStrageInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            zInputStream = null;
            inputStreamStrageInputStream = null;
        }
    }

    private static void loadMain(ZInputStream zInputStream, int i) throws Exception {
        int length;
        zInputStream.skip(1L);
        String[] strArr = {Util.txtDataStrip(new String(zInputStream.read(0, Util.readInt(zInputStream))))};
        if (idList[i] != null) {
            length = idList[i].length;
            EffectList[] effectListArr = idList[i];
            idList[i] = new EffectList[Util.s2i(Util.strtok(strArr, ",")) + length];
            for (int i2 = 0; i2 < length; i2++) {
                idList[i][i2] = effectListArr[i2];
            }
        } else {
            idList[i] = new EffectList[Util.s2i(Util.strtok(strArr, ","))];
            length = 0;
        }
        for (int i3 = length; i3 < idList[i].length; i3++) {
            idList[i][i3] = new EffectList();
            idList[i][i3].effectId = Util.s2i(Util.strtok(strArr, ","));
            idList[i][i3].modelList = new int[Util.s2i(Util.strtok(strArr, ","))];
            for (int i4 = 0; i4 < idList[i][i3].modelList.length; i4++) {
                idList[i][i3].modelList[i4] = Util.s2i(Util.strtok(strArr, ",")) + length;
            }
        }
        if (objList[i] != null) {
            length = objList[i].length;
            EffectObject[] effectObjectArr = objList[i];
            objList[i] = new EffectObject[Util.s2i(Util.strtok(strArr, ",")) + length];
            for (int i5 = 0; i5 < length; i5++) {
                objList[i][i5] = effectObjectArr[i5];
            }
        } else {
            objList[i] = new EffectObject[Util.s2i(Util.strtok(strArr, ","))];
        }
        for (int i6 = length; i6 < objList[i].length; i6++) {
            objList[i][i6] = new EffectObject();
            objList[i][i6].type = Util.s2i(Util.strtok(strArr, ","));
            objList[i][i6].setting = new EffectSetting[Util.s2i(Util.strtok(strArr, ","))];
            for (int i7 = 0; i7 < objList[i][i6].setting.length; i7++) {
                objList[i][i6].setting[i7] = new EffectSetting();
                objList[i][i6].setting[i7].type = Util.s2i(Util.strtok(strArr, ","));
                switch (objList[i][i6].setting[i7].type) {
                    case 0:
                    case 1:
                    case 3:
                    case 9:
                        objList[i][i6].setting[i7].trans = new float[3];
                        for (int i8 = 0; i8 < objList[i][i6].setting[i7].trans.length; i8++) {
                            objList[i][i6].setting[i7].trans[i8] = Util.s2f(Util.strtok(strArr, ","));
                        }
                        break;
                    case 2:
                        objList[i][i6].setting[i7].trans = new float[4];
                        for (int i9 = 0; i9 < objList[i][i6].setting[i7].trans.length; i9++) {
                            objList[i][i6].setting[i7].trans[i9] = Util.s2f(Util.strtok(strArr, ","));
                        }
                        break;
                    case 5:
                        objList[i][i6].setting[i7].trans = new float[5];
                        for (int i10 = 0; i10 < objList[i][i6].setting[i7].trans.length; i10++) {
                            objList[i][i6].setting[i7].trans[i10] = Util.s2f(Util.strtok(strArr, ","));
                        }
                        break;
                }
            }
        }
        zInputStream.skip(4L);
        ErpObject erpObjectReadObject3DZipStream = GameCommon.ReadObject3DZipStream(zInputStream, 0, false);
        int i11 = 0;
        int i12 = length;
        while (i12 < objList[i].length) {
            objList[i][i12].figure = GameCommon.getObjectFigure(erpObjectReadObject3DZipStream, i11);
            objList[i][i12].frame = GameCommon.getObjectMaxFrame(erpObjectReadObject3DZipStream, i11);
            if (objList[i][i12].type == 3) {
                Util.unsetProperties(objList[i][i12].figure, 8);
                Util.setDrawOrder(objList[i][i12].figure, 32767);
            } else if (objList[i][i12].type == 6) {
                Util.unsetProperties(objList[i][i12].figure, 8);
            } else {
                Util.setDrawOrder(objList[i][i12].figure, 255, false);
            }
            i12++;
            i11++;
        }
    }

    public static int set(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, int i3, int i4, float f7, int i5, boolean z) {
        EffectObject effectObject;
        int categoryIndex = getCategoryIndex(i);
        for (int i6 = 0; i6 < effectData.length; i6++) {
            if (!effectData[i6].use) {
                effectData[i6].use = true;
                effectData[i6].category = categoryIndex;
                effectData[i6].f26id = i2;
                effectData[i6].f28x = f;
                effectData[i6].f29y = f2;
                effectData[i6].f30z = f3;
                effectData[i6].scale[0] = f4;
                effectData[i6].scale[1] = f5;
                effectData[i6].scale[2] = f6;
                effectData[i6].blend = i3;
                effectData[i6].eventId = i5;
                effectData[i6].time = 0;
                effectData[i6].option = f7;
                effectData[i6].loop = false;
                effectData[i6].moveX = 0.0f;
                effectData[i6].moveY = 0.0f;
                effectData[i6].moveZ = 0.0f;
                effectData[i6].moveFrame = 0.0f;
                effectData[i6].moveMax = 0.0f;
                effectData[i6].vFlag = false;
                effectData[i6].f27v = 0;
                effectData[i6].vMax = 0;
                effectData[i6].vMoveColor = 0;
                effectData[i6].vFrame = 0.0f;
                effectData[i6].frameExe = false;
                effectData[i6].startFrame = 0;
                effectData[i6].endFrame = 0;
                effectData[i6].flip = z;
                effectData[i6].bind = -1;
                effectData[i6].rAnime = false;
                EffectList effectList = getEffectList(effectData[i6].category, effectData[i6].f26id);
                if (effectList != null) {
                    effectObject = getEffectObject(effectData[i6].category, effectList.modelList[0]);
                    for (int i7 = 0; i7 < effectObject.setting.length; i7++) {
                        if (effectObject.setting[i7].type == 5) {
                            effectData[i6].rAnime = true;
                        }
                    }
                } else {
                    effectObject = null;
                }
                if (i4 == 0) {
                    if (!effectData[i6].rAnime || effectObject == null) {
                        effectData[i6].timeMax = getMaxFrame(categoryIndex, i2);
                    } else {
                        for (int i8 = 0; i8 < effectObject.setting.length; i8++) {
                            if (effectObject.setting[i8].type == 5) {
                                effectData[i6].timeMax = (int) effectObject.setting[i8].trans[4];
                            }
                        }
                    }
                } else if (i4 >= 0) {
                    effectData[i6].timeMax = i4;
                } else if (!effectData[i6].rAnime || effectObject == null) {
                    effectData[i6].timeMax = getMaxFrame(categoryIndex, i2);
                    effectData[i6].loop = true;
                } else {
                    for (int i9 = 0; i9 < effectObject.setting.length; i9++) {
                        if (effectObject.setting[i9].type == 5) {
                            effectData[i6].timeMax = (int) effectObject.setting[i9].trans[4];
                            effectData[i6].loop = true;
                        }
                    }
                }
                effectData[i6].homing = null;
                return i6;
            }
        }
        return -1;
    }

    public static int set(int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, float f5) {
        return set(i, i2, f, f2, f3, f4, i3, i4, f5, 0, false);
    }

    public static int set(int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, float f5, int i5) {
        return set(i2, i, f, f2, f3, f4, i3, i4, f5, i5, false);
    }

    public static int set(int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, float f5, int i5, boolean z) {
        return set(i, i2, f, f2, f3, f4, f4, f4, i3, i4, f5, i5, z);
    }

    public static void setMovePos(int i, float f, float f2, float f3, float f4, int i2, int i3, float f5) {
        for (int i4 = 0; i4 < effectData.length; i4++) {
            if (effectData[i4].use && effectData[i4].eventId > 0 && effectData[i4].eventId == i) {
                float f6 = f2 - effectData[i4].f28x;
                float f7 = f3 - effectData[i4].f29y;
                float f8 = f4 - effectData[i4].f30z;
                int i5 = i3 - i2;
                if (f6 != 0.0f) {
                    f6 /= f;
                }
                if (f7 != 0.0f) {
                    f7 /= f;
                }
                if (f8 != 0.0f) {
                    f8 /= f;
                }
                if (i5 != 0) {
                    i5 = (int) (i5 / f5);
                }
                effectData[i4].moveX = f6;
                effectData[i4].moveY = f7;
                effectData[i4].moveZ = f8;
                effectData[i4].moveMax = f;
                if (i2 == 255 && i3 == 255) {
                    effectData[i4].vFlag = false;
                } else {
                    effectData[i4].vFlag = true;
                }
                effectData[i4].f27v = i2;
                effectData[i4].vMax = i3;
                effectData[i4].vMoveColor = i5;
                effectData[i4].vFrame = f5;
                effectData[i4].moveFrame = 0.0f;
                return;
            }
        }
    }

    public static void stageInit() {
        EffectList effectList = getEffectList(0, 7);
        if (effectList == null) {
            return;
        }
        for (int i = 0; i < effectList.modelList.length; i++) {
            EffectObject effectObject = getEffectObject(0, effectList.modelList[i]);
            if (effectObject != null) {
                Util.multiVertexTransparency(1.0f, GameCommon.K_ANY, effectObject.figure, false);
            }
        }
    }

    public static void timeSet(int i, int i2, int i3) {
        effectData[i].time = i2;
        if (i3 >= 0) {
            effectData[i].timeMax = i3;
        }
    }
}
