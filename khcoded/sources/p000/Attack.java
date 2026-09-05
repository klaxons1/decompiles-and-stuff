package p000;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.ui.util3d.FastMath;
import com.jcraft.jzlib.ZInputStream;
import com.mascotcapsule.eruption.docomostar.Appearance;
import com.mascotcapsule.eruption.docomostar.Figure;
import com.mascotcapsule.eruption.docomostar.Transform;
import com.mascotcapsule.eruption.docomostar.Util3D;
import com.mascotcapsule.eruption.docomostar.Vector3D;
import com.mascotcapsule.eruption.docomostar.VertexBuffer;
import java.lang.reflect.Array;
import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Attack {
    public static final byte ATTACK_ATTR_ALL = 9;
    public static final byte ATTACK_ATTR_ALLY = 1;
    public static final byte ATTACK_ATTR_ENEMY = 0;
    public static final byte ATTACK_FILE_EX_TYPE_MAX = 2;
    public static final byte ATTACK_FILE_TYPE_SORA = 1;
    public static final byte ATTACK_FILE_TYPE_STAGE = 0;
    private static final byte ATTACK_INFO_NUM = 100;
    private static final byte ATTACK_MODEL_MAX = 10;
    private static final byte ATTACK_OBJ_NUM = 50;
    public static final byte ATTACK_OPTYPE_ABS = 2;
    public static final byte ATTACK_OPTYPE_OWN = 0;
    public static final byte ATTACK_OPTYPE_TARGET = 1;
    public static final float BLOCK_ATTACK_HOSEI = 0.2f;
    private static final short CHAR_SIZE_BIG = 30;
    public static final int COMBO_BONUS_MAX = 12;
    private static final short COMBO_CAN_LEN2 = 200;
    private static final short COMBO_INPUT_DEFAULT = 18;
    private static final short COMBO_WAIT_DEFAULT = 5;
    public static final int ID_EFFECT_PIYORI_MARK = 600;
    private static final byte MODEL_DRAW_TYPE_BILLBOARD = 1;
    private static final byte MODEL_DRAW_TYPE_NORMAL = 0;
    private static final byte RC_CHECK_DIR = 4;
    private static final byte RC_DIR_NUM = 4;
    private static final byte RC_INPUT_MAX = 5;
    private static final byte RC_NEXT2_DIR = 3;
    private static final byte RC_NEXT_DIR = 2;
    private static final byte RC_NOW_DIR = 1;
    private static final byte RC_START_DIR = 0;
    public static int hitMove = 0;
    public static final int p2pAtkDataSize = 21;
    public static int magicHitCount = 0;
    public static int magicDrawTime = 0;
    public static int kealWait = 0;
    public static int cameraShakeTimer = 0;
    private static byte[][] RCInputData = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, 5);
    public static int comboNum = 0;
    public static int comboTime = 0;
    private static int comboRank = 0;
    private static int comboInputDrawTime = 0;
    private static int comboWait = 0;
    private static int comboStartTime = 0;
    private static int comboTarget = -1;
    private static short COMBO_WAIT_MAX = 0;
    public static short[] comboBonusCount = new short[12];

    /* JADX INFO: renamed from: bc */
    private static BattleCommand f1bc = new BattleCommand();
    private static AttackData[] AtkData = new AttackData[50];
    private static AttackInfo[][] AtkInfo = (AttackInfo[][]) Array.newInstance((Class<?>) AttackInfo.class, 11, 100);
    private static Figure[][] atkModel = new Figure[11][];
    private static float[][] atkModelFrame = new float[11][];
    public static boolean bAir = false;
    private static int effectTimer = 0;
    private static final Attack attack = new Attack();

    /* JADX INFO: renamed from: gm */
    private static Game f2gm = null;
    private static TextureData alwaysTexture = Game.alwaysTexture;
    private static int AtkGroupP = 1;
    public static final int ID_EFFECT_PIYORI = 500;
    private static int AtkGroupN = ID_EFFECT_PIYORI;
    private static float[] _pos_org = new float[3];
    private static float[][] _CNO_ = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 4);
    private static Vector _vec = new Vector();
    private static boolean comboInput = false;
    private static int bonusBak = 0;
    public static int tcCharNo = 0;
    public static boolean comboStop = false;
    private static boolean comboDisp = false;
    private static int comboDrawTime = 0;
    public static int tcDrawTime = 0;
    private static int homingAttackNo = -1;
    private static short homingPHosei = 0;
    private static int homingTime = 0;
    public static VipObject targetAttack = null;
    public static int targetAttackLen2 = -1;
    private static int comboBonusDrawTime = -1;
    private static int drawWait2D = 0;
    private static int comboRankUp = 0;
    private static final float[] _flip = {0.0f, 0.25f, 0.5f, 0.75f};
    private static final short[][] _base = {new short[]{430, 80, 430, 139}, new short[]{271, 240, 334, 240}, new short[]{430, 396, 430, 338}, new short[]{588, 240, 526, 240}, new short[]{397, 46, 0, 0}, new short[]{397, 78, 0, 0}, new short[]{429, 78, 0, 0}, new short[]{429, 46, 0, 0}, new short[]{237, 206, 0, 0}, new short[]{237, 238, 0, 0}, new short[]{269, 238, 0, 0}, new short[]{269, 206, 0, 0}, new short[]{397, 361, 0, 0}, new short[]{397, 393, 0, 0}, new short[]{429, 393, 0, 0}, new short[]{429, 361, 0, 0}, new short[]{555, 206, 0, 0}, new short[]{555, 238, 0, 0}, new short[]{587, 238, 0, 0}, new short[]{587, 206, 0, 0}};
    private static final byte[][] _image = {new byte[]{-1, -1}, new byte[]{-1, 15}, new byte[]{15, 40}, new byte[]{-1, 14}, new byte[]{14, 40}, new byte[]{-1, 13}, new byte[]{13, 40}, new byte[]{-1, 12}, new byte[]{12, 40}, new byte[]{-1, 11}, new byte[]{11, 40}, new byte[]{-1, GameCommon.DS_MOTION}, new byte[]{GameCommon.DS_MOTION, GameCommon.DS_MOTION}};
    private static float[] _ofs = new float[2];
    private static Transform _ts = new Transform();
    private static float[] _ret = {0.0f, 0.0f};

    class AttackData extends VipObject {
        public byte atkFlag;
        public int attribute;
        public Figure bindFig;
        public int blockGrp;
        public short blockNo;
        public boolean canCounter;
        public CharData charData;
        public int char_no;
        public int checkMotion;
        public short comboHosei;
        public float cur;
        public float curBack;
        public boolean disp;
        public boolean flipSet;
        public int gidIndex;
        public int groupNo;
        public int[] hitChar_no = new int[5];
        public boolean hitOnce;

        /* JADX INFO: renamed from: hp */
        public int f3hp;
        public boolean isHit;
        public boolean isRefrect;
        public float liftSpd;
        public int loopCnt;
        public int magicPow;
        public int modelBlend;
        public int modelNo;
        public float modelScale;
        public int modelType;
        public boolean motionSync;
        public int objNo;
        public short piyoriHosei;
        public short rangeMag;
        public float sdir;
        public boolean separate;
        public short startFrame;

        /* JADX INFO: renamed from: sx */
        public float f4sx;

        /* JADX INFO: renamed from: sy */
        public float f5sy;

        /* JADX INFO: renamed from: sz */
        public float f6sz;
        public CharData targetData;
        public int target_no;
        public short tempVal;
        private final Attack this$0;
        public float time;
        public short totalDamage;
        public boolean use;
        public int wait;

        AttackData(Attack attack) {
            this.this$0 = attack;
        }
    }

    class AttackInfo {
        public int attackNum;
        public int attribute;
        public int[][][] callBack;
        public int cancelFrame;
        public float checkH;
        public float checkOfsX;
        public float checkOfsY;
        public float checkOfsZ;
        public float checkR;
        public int dwnDirType;
        public float dwnspd;
        public int gid;

        /* JADX INFO: renamed from: h */
        public float f7h;
        public int hpMax;
        public int opType;
        public int power;

        /* JADX INFO: renamed from: r */
        public float f8r;
        public byte[][][][] script;
        private final Attack this$0;
        public boolean use;

        AttackInfo(Attack attack) {
            this.this$0 = attack;
        }

        public void free() {
            this.gid = -1;
            this.use = false;
            this.callBack = (int[][][]) null;
            this.script = (byte[][][][]) null;
        }
    }

    private Attack() {
        for (int i = 0; i < AtkInfo.length; i++) {
            for (int i2 = 0; i2 < AtkInfo[i].length; i2++) {
                AtkInfo[i][i2] = new AttackInfo(this);
            }
        }
        for (int i3 = 0; i3 < AtkData.length; i3++) {
            AtkData[i3] = new AttackData(this);
        }
        freeAllAttackData();
        freeAllAttackInfo();
    }

    public static Vector AttackChar(int i, int i2, int i3, long j, float f, int i4, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i5;
        boolean z3;
        if (i >= 0 && Character.charData[i].type == 9) {
            i3 = 1;
        }
        _vec.removeAllElements();
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= Character.charData.length) {
                break;
            }
            if (attrEneCheck(Character.charData[i7].type, i3) && ((i < 0 || Character.charData[i].type != 9 || i != i7) && Character.charData[i7].use && Character.charData[i7].f12hp > 0 && Character.charData[i7].level > 0)) {
                float[] charXZ = Character.getCharXZ(Character.charData[i7].dir, Character.charData[i7].ahWidth, Character.charData[i7].ahDepth);
                float[] fArrRelativeChange = relativeChange(Character.charData[i7].dir, Character.charData[i7].ahX, Character.charData[i7].ahZ, 0, false);
                if ((Character.charData[i7].invCnt == 0 || z) && ((!Character.charData[i7].getBitState(1024) || GameStatus.EXTRA.isCheatMode(1)) && ((i2 < 0 || AtkInfo[AtkData[i2].gidIndex >> 16][AtkData[i2].gidIndex & 65535].gid != 80 || AtkData[i2].target_no == i7) && Util.hitCheckB2B(f2, f3 - (f6 / 2.0f), f4, f5, f6, f7, Character.charData[i7].f69x + fArrRelativeChange[0], Character.charData[i7].f70y + Character.charData[i7].ahY, Character.charData[i7].f71z + fArrRelativeChange[1], charXZ[0], Character.charData[i7].ahHeight, charXZ[1])))) {
                    if (!z) {
                        if (i2 < 0 || AtkData[i2].char_no < 0 || AtkData[i2].separate) {
                            f9 = f8;
                            f10 = f4;
                            f11 = f2;
                        } else {
                            f11 = AtkData[i2].charData.f69x;
                            f10 = AtkData[i2].charData.f71z;
                            f9 = AtkData[i2].charData.dir;
                        }
                        boolean z4 = Math.abs(Util.DiffDir(Character.charData[i7].dir, f8)) < 90.0f && Math.abs(Util.DiffDir(Character.charData[i7].dir, Util.atan2_360(Character.charData[i7].f69x - f11, Character.charData[i7].f71z - f10))) < 90.0f;
                        if (z4 && Character.charData[i7].f69x == f11 && Character.charData[i7].f71z == f10) {
                            z4 = false;
                        }
                        float abilityEff = 90.0f;
                        if (i7 == 0 && GameStatus.PLAYER.isFlg(13, 0)) {
                            abilityEff = 90.0f - (GameStatus.PLAYER.getAbilityEff(0, 0) * 22.5f);
                        }
                        if (i7 == 0 && GameStatus.GAME.extCommand != 0) {
                            abilityEff = 9999.0f;
                        }
                        if (i >= 0 && i7 == 0 && GameStatus.EXTRA.isCheatMode(12)) {
                            if (Character.charData[i].flinchCntMax >= 0) {
                                Character.charData[i].flinchCnt = (short) 0;
                            }
                            AttackChar(i7, -1, Character.charData[i7].type, ((int) ((charDmgSet(i7, j, i2, z4, true) * GameStatus.PLAYER.getExeDebugAbilityEff(12)) / 100.0f)) * (-1), 0.0f, 0, Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, 1.0f, 1.0f, 1.0f, 0.0f, false, true);
                            Sound.play_se(0, 1, 23);
                            if (effectTimer == 0) {
                                float fDirTo8 = Util.dirTo8(Character.getCharsDir(i7, i)) * 45;
                                if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                    fDirTo8 += 10.0f;
                                }
                                Effect.set(0, 8, Character.charData[i7].f69x + fArrRelativeChange[0] + (FastMath.sin(fDirTo8) * (charXZ[0] / 2.0f)), Character.charData[i7].f70y + Character.charData[i7].ahY + (Character.charData[i7].ahHeight / 2.0f), Character.charData[i7].f71z + fArrRelativeChange[1] + (FastMath.cos(fDirTo8) * (charXZ[1] / 2.0f)), 2.0f, 0, 0, fDirTo8);
                                effectTimer = 5;
                            }
                            return null;
                        }
                        if (i >= 0 && !z2 && Character.charData[i7].flinchTime == 0) {
                            if ((!isEnemy(i7) || ((GameStatus.PLAYER.boolData[1] && counterStateCheck(i7)) || !guardAttributeCheck(i7, f11, f10, f9, abilityEff))) && !(!isEnemy(i7) && Character.charData[i7].motion == 38 && guardAttributeCheck(i7, f11, f10, f9, abilityEff))) {
                                z3 = !isEnemy(i7) && GameStatus.PLAYER.isFlg(13, 3) && Character.getMotionType(i7) == 0 && guardAttributeCheck(i7, f11, f10, f9, abilityEff);
                                if (z3) {
                                }
                            } else {
                                z3 = false;
                            }
                            if (Character.charData[i].targetChar == i7) {
                                if (z3) {
                                    Character.motionSet(i7, 38);
                                }
                                if (i2 >= 0) {
                                    refrectSet(i2);
                                }
                                if (!Character.charData[i7].getBitState(67108864)) {
                                    Action.callBackActionSet(5, i7);
                                }
                                if (!Character.charData[i].getBitState(VertexBuffer.TEXTURECOORDF_1)) {
                                    Action.callBackActionSet(6, i);
                                }
                                if (effectTimer == 0) {
                                    float fDirTo9 = Util.dirTo8(Character.getCharsDir(i7, i)) * 45;
                                    if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                        fDirTo9 += 10.0f;
                                    }
                                    Effect.set(0, 8, Character.charData[i7].f69x + fArrRelativeChange[0] + (FastMath.sin(fDirTo9) * (charXZ[0] / 2.0f)), Character.charData[i7].f70y + Character.charData[i7].ahY + (Character.charData[i7].ahHeight / 2.0f), Character.charData[i7].f71z + fArrRelativeChange[1] + (FastMath.cos(fDirTo9) * (charXZ[1] / 2.0f)), 2.0f, 0, 0, fDirTo9);
                                    effectTimer = 5;
                                }
                                if (i7 != 0) {
                                    break;
                                }
                                if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                    f8 = (Util.dirTo8(f8) / 2) * 90;
                                    if (f8 != 90.0f && f8 != 270.0f) {
                                        f8 = 90.0f;
                                    }
                                }
                                Character.charData[i7].dwnDir = f8;
                                Character.charData[i7].dir = Util.RotDir(f8, 180.0f);
                                Character.charData[i7].dwnSpd = Math.min(3.0f, ((charDmgSet(i7, j, i2, z4, true) * f) / Character.charData[i7].maxHp) + 0.2f);
                                if (GameStatus.PLAYER.isFlg(13, 1) && counterStateCheck(i)) {
                                    GameStatus.PLAYER.setNumberData(37, 20);
                                }
                                if (!GameStatus.PLAYER.isFlg(13, 13)) {
                                    break;
                                }
                                Character.cure(i7, GameStatus.PLAYER.getAbilityEff(0, 13));
                                break;
                            }
                        }
                        if (Character.charData[i7].invCnt <= 0) {
                            float fAtan2_360 = 0.0f;
                            float fRotDir = 0.0f;
                            if (GameStatus.PLAYER.getNumberData(19) == 3 && Character.charData[i7].f69x == f2 && Character.charData[i7].f71z == f4) {
                                fAtan2_360 = Character.charData[i7].dir;
                                fRotDir = Util.RotDir(fAtan2_360, 180.0f);
                            } else if (i4 == 0) {
                                fAtan2_360 = Util.RotDir(f8, 180.0f);
                                fRotDir = f8;
                            } else if (i4 == 1) {
                                fAtan2_360 = Util.atan2_360(f2 - Character.charData[i7].f69x, f4 - Character.charData[i7].f71z);
                                fRotDir = Util.RotDir(fAtan2_360, 180.0f);
                            } else if (i4 == 2) {
                                fAtan2_360 = Character.charData[i7].dir;
                                fRotDir = Util.RotDir(fAtan2_360, 180.0f);
                            } else if (i4 == 3) {
                            }
                            if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                float fDirTo10 = (Util.dirTo8(fAtan2_360) / 2) * 90;
                                if (fDirTo10 != 90.0f && fDirTo10 != 270.0f) {
                                    fDirTo10 = 90.0f;
                                }
                                float fRotDir2 = Util.RotDir(fDirTo10, 180.0f);
                                if (z2 || Character.charData[i7].guardAttribute == 0 || i7 == GameStatus.GAME.ctlCharNo) {
                                    f12 = fRotDir2;
                                    f13 = fDirTo10;
                                } else {
                                    float f14 = Character.charData[i7].dir;
                                    f12 = f14;
                                    f13 = f14;
                                }
                            } else if (z2 || ((int) Character.imageInfo[Character.getCharIndex(Character.charData[i7].charId)][Character.charData[i7].motionNo][4]) == 0 || i7 == GameStatus.GAME.ctlCharNo) {
                                f12 = fRotDir;
                                f13 = fAtan2_360;
                            } else {
                                f12 = f8;
                                f13 = Character.charData[i7].dir;
                            }
                            int iCharDmgSet = charDmgSet(i7, j, i2, z4, false);
                            if (i2 >= 0) {
                                AttackData attackData = AtkData[i2];
                                attackData.totalDamage = (short) (attackData.totalDamage + iCharDmgSet);
                            }
                            if (i == 0 && isEnemy(i7) && GameStatus.EXTRA.isCheatMode(10)) {
                                Character.cure(0, (int) ((GameStatus.PLAYER.getExeDebugAbilityEff(10) * iCharDmgSet) / 100.0f));
                            }
                            Character.charData[i7].dwnSpd = 0.0f;
                            if (Character.charData[i7].spd > 0.0f) {
                                Character.charData[i7].dir = f13;
                                Character.charData[i7].dwnDir = f12;
                                Character.charData[i7].dwnSpd = Math.min(3.0f, ((iCharDmgSet * f) / Character.charData[i7].maxHp) + 0.2f);
                            }
                            if (i7 == 0) {
                                GameStatus.PLAYER.setNumberData(37, 0);
                                GameStatus.PLAYER.boolData[1] = false;
                                if (GameStatus.GAME.extCommand == 0 && GameStatus.PLAYER.isFlg(13, 20)) {
                                    GameStatus.PLAYER.cureDebugPower(GameStatus.PLAYER.getAbilityEff(0, 20), true, true);
                                }
                            }
                            if (i2 >= 0 && GameStatus.PLAYER.getNumberData(19) == 3 && i7 == Character.charData.length - 1) {
                                hitMove = ((int) FastMath.sin(Util.RotDir(Util.dirTo8(AtkData[i2].dir) * 45, 180.0f))) * 2;
                                Character.charData[i7].f69x -= hitMove;
                            } else if (i2 >= 0 && Character.charData[i7].charId == 10009) {
                                hitMove = 1;
                                if (Util.RotDir(0.0f, AtkData[i2].dir) < 180.0f) {
                                    hitMove *= -1;
                                }
                                Character.charData[i7].f69x -= hitMove;
                            }
                            callBackExe(2, i7, -1);
                            if (!Character.charData[i7].getBitState(524288)) {
                                Action.callBackActionSet(1, i7);
                            }
                            if (Character.charData[i7].flinchTime == 45 && !Character.charData[i7].getBitState(134217728)) {
                                Action.callBackActionSet(8, i7);
                            }
                            if (Character.charData[i7].thinkDmg > 0) {
                                Character.charData[i7].thinkDmg -= iCharDmgSet;
                                if (Character.charData[i7].thinkDmg <= 0) {
                                    Action.callBackActionSet(7, i7);
                                    Character.charData[i7].thinkDmg = 0;
                                }
                            }
                            if (Character.charData[i7].f12hp == 0) {
                                resetPiyori(i7);
                                if (i7 == 0) {
                                    f2gm.changeCheatModeEnd(false, true);
                                    GameStatus.PLAYER.setNumberData(38, -1);
                                    GameStatus.PLAYER.setNumberData(39, -1);
                                    resetRC(true);
                                    resetComboBonusTime();
                                }
                                if (isTC() && i7 == tcCharNo) {
                                    resetRC();
                                }
                                Character.charData[i7].aliveCnt = (short) Character.imageInfo[Character.getCharIndex(Character.charData[i7].charId)][Character.charData[i7].motionNo][6];
                                if (Character.charData[i7].aliveCnt != 0) {
                                    Character.charData[i7].delCnt = (short) 99;
                                    Character.motionSet(i7, 28);
                                    if (Character.charData[i7].type == 1 && (i5 = Effect.set(11, 0, Character.charData[i7].f69x, Character.charData[i7].f70y, Character.charData[i7].f71z, Character.charData[i7].width * 1.2f, 0, -1, 0.0f, i7 + ID_EFFECT_PIYORI_MARK)) >= 0) {
                                        Effect.homingBind(i5, Character.charData[i7], Character.charData[i7].height / 3.0f);
                                    }
                                }
                                Action.callBackActionSet(2, i7);
                                freeCharAttack(i7, false);
                                Character.charData[i7].motionSpd = 1.0f;
                                if (i2 >= 0 && ((i < 0 || Character.charData[i].type != 2) && isEnemy(i7) && GameStatus.PLAYER.getNumberData(21) == 1)) {
                                    int i8 = Character.charData[i7].add_data[0];
                                    int i9 = GameCommon.K_ANY;
                                    int i10 = 0;
                                    if (GameStatus.PLAYER.getNumberData(19) == 4) {
                                        int[] iArr = {12910428, 16775754, 16753481, 16733011, 16746224, 8651007, 13387516};
                                        i8 *= AtkData[i2].piyoriHosei;
                                        if (AtkData[i2].piyoriHosei > 1) {
                                            i9 = iArr[AtkData[i2].piyoriHosei - 1];
                                        }
                                        i10 = 2;
                                        if (i7 >= 50 && i7 < 55) {
                                            f2gm.blockExplosion((int) Character.charData[i7].spd);
                                            Character.charData[i7].spd = -1.0f;
                                        }
                                    }
                                    f2gm.addScore(i8, i10, i9);
                                }
                                if ((i < 0 || Character.charData[i].type != 2) && isEnemy(i7) && Character.charData[i7].position != 2 && Character.charData[i7].aliveCnt == 0) {
                                    if (i >= 0) {
                                        int abilityEff2 = Character.charData[i7].exp;
                                        Game game = f2gm;
                                        if (Game.isPinch(0) && GameStatus.PLAYER.isFlg(13, 25)) {
                                            abilityEff2 = (abilityEff2 * (GameStatus.PLAYER.getAbilityEff(0, 25) + 100)) / 100;
                                        }
                                        if (abilityEff2 > 0) {
                                            GameStatus.PLAYER.addExp(abilityEff2);
                                        }
                                    }
                                    GameStatus.GAME.stagekillCount++;
                                    float[][] dropItem = Item.getDropItem(Character.charData[i7].itableNo);
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = i11;
                                        if (i12 >= dropItem.length) {
                                            break;
                                        }
                                        if (dropItem[i12][0] == 9.0f) {
                                            if (dropItem[i12][2] > 0.0f) {
                                                ItemData itemData = Item.getItemData((int) dropItem[i12][0], (int) dropItem[i12][1]);
                                                int i13 = -1;
                                                if (itemData.effectId[0] == 3) {
                                                    i13 = 3;
                                                } else if (itemData.effectId[0] == 2) {
                                                    i13 = 4;
                                                } else if (itemData.effectId[0] == 4) {
                                                    i13 = 5;
                                                } else if (itemData.effectId[0] == 1) {
                                                    i13 = 2;
                                                }
                                                f2gm.setPrizeEffect(i13, Character.charData[i7].f69x, Character.charData[i7].f70y, Character.charData[i7].f71z, (int) (itemData.effectAmount[0] * dropItem[i12][2]), 1.0f, i7);
                                            }
                                        } else if (dropItem[i12][0] >= 0.0f) {
                                            if (GameStatus.PLAYER.isW7Lv() && ((int) dropItem[i12][0]) == 6) {
                                                f2gm.setPrizeEffect(10, Character.charData[i7].f69x, Character.charData[i7].f70y, Character.charData[i7].f71z, (int) dropItem[i12][2]);
                                            } else {
                                                f2gm.setPrizeEffect(6, Character.charData[i7].f69x, Character.charData[i7].f70y, Character.charData[i7].f71z, 1, 1.0f, i7);
                                            }
                                            Game game2 = f2gm;
                                            Game.getPrizeItem((int) dropItem[i12][0], (int) dropItem[i12][1]);
                                        }
                                        i11 = i12 + 1;
                                    }
                                    GameStatus.ExtraStatus extraStatus = GameStatus.EXTRA;
                                    GameStatus.ExtraStatus extraStatus2 = GameStatus.EXTRA;
                                    int type = extraStatus.getType(1);
                                    GameStatus.ExtraStatus extraStatus3 = GameStatus.EXTRA;
                                    if (type != -1) {
                                        int exeDebugAbilityEff = GameStatus.EXTRA.isCheatMode(11) ? ((GameStatus.PLAYER.getExeDebugAbilityEff(11) + 100) * 2) / 100 : 2;
                                        f2gm.setPrizeEffect(5, Character.charData[i7].f69x, Character.charData[i7].f70y + 0.5f, Character.charData[i7].f71z, exeDebugAbilityEff, 1.0f, i7);
                                        GameStatus.PLAYER.setNumberData(42, GameStatus.PLAYER.getNumberData(42) + exeDebugAbilityEff);
                                    }
                                }
                                if (i == 0) {
                                    int nearEneCharDir = Character.getNearEneCharDir(i, GameStatus.GAME.targetLen);
                                    if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                        Game game3 = f2gm;
                                        if (Game.m_bossData[7] != 0) {
                                            nearEneCharDir = 0;
                                        }
                                    }
                                    if (nearEneCharDir > 0) {
                                        Character.charData[i].targetChar = (byte) nearEneCharDir;
                                        setHoming(-999, (short) 0);
                                    } else {
                                        Character.charData[i].targetChar = (byte) -1;
                                    }
                                    if (GameStatus.EXTRA.isCheatMode(0) && f2gm.magicTarget == i7) {
                                        f2gm.nextNearFireTargetSet();
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    _vec.addElement(new StringBuffer().append("").append(i7).toString());
                    if (!z && i2 >= 0 && AtkData[i2].hitOnce) {
                        break;
                    }
                }
                if (Character.charData[i7].getBitState(Appearance.DRAWSILHOUETTE)) {
                    float[] charXZ2 = Character.getCharXZ(Character.charData[i7].dir, Character.charData[i7].width * 1.5f, Character.charData[i7].depth * 1.5f);
                    if (Util.hitCheckB2B(f2, f3 - (f6 / 2.0f), f4, f5, f6, f7, Character.charData[i7].f69x, Character.charData[i7].f70y, Character.charData[i7].f71z, charXZ2[0], Character.charData[i7].height * 1.5f, charXZ2[1])) {
                        if (i2 < 0) {
                            break;
                        }
                        callBackExe(8, i, i2);
                        break;
                    }
                } else {
                    continue;
                }
            }
            i6 = i7 + 1;
        }
        return _vec;
    }

    public static void AutoComboReset() {
        int iRandomFix = Util.randomFix(0, 99) % 3;
        if (isStartRC()) {
            for (int i = 0; i < 4; i++) {
                byte[] bArr = RCInputData[4];
                RCInputData[0][i] = 0;
                bArr[i] = 0;
                if (i == iRandomFix) {
                    byte[] bArr2 = RCInputData[4];
                    RCInputData[0][i] = 1;
                    bArr2[i] = 1;
                }
            }
        }
    }

    public static void AutoComboStart() {
        if (isStartRC()) {
            for (int i = 0; i < 4; i++) {
                RCInputData[0][i] = 1;
            }
            return;
        }
        if (isRC()) {
            comboTime = 36;
            for (int i2 = 1; i2 < RCInputData.length; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    RCInputData[i2][i3] = 1;
                }
                RCInputData[i2][4] = 0;
            }
        }
    }

    private static void RCDataClear(int i) {
        for (int i2 = 0; i2 < 5; i2++) {
            RCInputData[i][i2] = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0179  */
    public static boolean RCInput(int i) {
        boolean z;
        if (comboInput || comboNum >= GameStatus.PLAYER.getAbilityEff(0, 14)) {
            return false;
        }
        if (!isStartRC() && (!isRCDisp() || comboWait > 0)) {
            return false;
        }
        int iRCInputSuccess = RCInputSuccess(i);
        if (iRCInputSuccess >= 0) {
            GameStatus.ExtraStatus extraStatus = GameStatus.EXTRA;
            GameStatus.ExtraStatus extraStatus2 = GameStatus.EXTRA;
            if (!extraStatus.getParamFlag(3)) {
                GameCommon.resetAllKey();
            }
            if (iRCInputSuccess == 1) {
                return true;
            }
        }
        if (isStartRC()) {
            if (iRCInputSuccess == 0) {
                COMBO_WAIT_MAX = COMBO_WAIT_DEFAULT;
                comboTime = 18;
                for (int i2 = 0; i2 < 5; i2++) {
                    RCInputData[1][i2] = RCInputData[0][i2];
                }
                RCNextSet(2, false);
                RCNextSet(3, false);
                RCDataClear(0);
                for (int i3 = 0; i3 < 5; i3++) {
                    RCInputData[4][i3] = RCInputData[2][i3];
                }
                comboStartTime = 0;
                comboRank = 0;
                comboBonusDrawTime = -1;
                bonusBak = 0;
                Character.charData[0].atkCnt = (short) 3;
                bAir = true;
                z = true;
            } else {
                z = false;
            }
        } else if (!isRCDisp() || comboWait != 0) {
            z = false;
        } else if (iRCInputSuccess == 0) {
            if (RCInputData[2][4] == 1) {
                comboRank++;
                if (comboRank == 1 && GameStatus.PLAYER.isFlg(13, 15)) {
                    comboRank += GameStatus.PLAYER.getAbilityEff(0, 15);
                }
                comboRankUp = 5;
                comboBonusGet(Character.charData[0].targetChar);
                RCInputData[2][4] = 0;
            }
            for (int i4 = 0; i4 < 5; i4++) {
                RCInputData[1][i4] = RCInputData[2][i4];
            }
            for (int i5 = 0; i5 < 5; i5++) {
                RCInputData[2][i5] = RCInputData[3][i5];
            }
            for (int i6 = 0; i6 < 5; i6++) {
                RCInputData[4][i6] = RCInputData[2][i6];
            }
            RCNextSet(3, comboNum + 3 >= GameStatus.PLAYER.getAbilityEff(0, 14));
            z = true;
        } else {
            z = false;
            resetRC();
        }
        if (!z) {
            return false;
        }
        for (int i7 = 0; i7 < Character.charData.length; i7++) {
            if (Character.charData[i7].use && Character.charData[i7].f12hp > 0) {
                Action.callBackActionSet(9, i7);
            }
        }
        Sound.play_se(0, 1, 26);
        comboNum++;
        if (comboNum >= GameStatus.PLAYER.getAbilityEff(0, 14)) {
            comboNum = GameStatus.PLAYER.getAbilityEff(0, 14);
        }
        bonusBak = comboNum;
        comboInput = true;
        comboWait = COMBO_WAIT_MAX;
        comboInputDrawTime = 3;
        return true;
    }

    public static byte RCInputCheck(boolean z) {
        byte b;
        if (comboInput) {
            b = 1;
            if (comboNum >= GameStatus.PLAYER.getAbilityEff(0, 14)) {
                b = (byte) 3;
            }
        } else {
            b = 0;
        }
        if (!z) {
            if (comboInput) {
                comboInput = false;
            }
            if (comboNum >= GameStatus.PLAYER.getAbilityEff(0, 14)) {
                resetRC();
            }
        }
        return b;
    }

    private static int RCInputSuccess(int i) {
        GameStatus.ExtraStatus extraStatus = GameStatus.EXTRA;
        GameStatus.ExtraStatus extraStatus2 = GameStatus.EXTRA;
        if (extraStatus.getParamFlag(3)) {
            for (int i2 = 0; i2 < 4; i2++) {
                RCInputData[4][i2] = 0;
            }
            return 0;
        }
        if (RCInputData[4][i / 2] <= 0) {
            return -1;
        }
        byte[] bArr = RCInputData[4];
        int i3 = i / 2;
        bArr[i3] = (byte) (bArr[i3] - 1);
        for (int i4 = 0; i4 < 4; i4++) {
            if (RCInputData[4][i4] > 0) {
                return 1;
            }
        }
        return 0;
    }

    private static void RCNextSet(int i, boolean z) {
        byte b = 2;
        RCDataClear(i);
        GameStatus.ExtraStatus extraStatus = GameStatus.EXTRA;
        GameStatus.ExtraStatus extraStatus2 = GameStatus.EXTRA;
        if (extraStatus.getParamFlag(3)) {
            for (int i2 = 0; i2 < 4; i2++) {
                RCInputData[i][i2] = 1;
            }
            if (checkRankUp(i, z)) {
                RCInputData[i][4] = 1;
                return;
            }
            return;
        }
        byte bRandomFix = (byte) Util.randomFix(0, 3);
        if (checkRankUp(i, z)) {
            RCInputData[i][4] = 1;
            int iRandomFix = Util.randomFix(0, 99) % GameStatus.PLAYER.getAbilityLevel(0, 14);
            if (isTC()) {
                RCInputData[i][4] = 0;
                iRandomFix = Util.randomFix(0, 99) % 3;
            }
            if (iRandomFix != 0) {
                if (iRandomFix == 1) {
                    RCInputData[i][rotDir4(bRandomFix, 2)] = 1;
                    b = 1;
                } else if (iRandomFix == 2) {
                    b = 3;
                } else {
                    if (iRandomFix == 3) {
                        RCInputData[i][rotDir4(bRandomFix, 1)] = 1;
                        RCInputData[i][rotDir4(bRandomFix, 2)] = 1;
                    }
                    b = 1;
                }
            }
        } else {
            b = 1;
        }
        RCInputData[i][bRandomFix] = b;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:164:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:167:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:172:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:174:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:176:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:192:0x0be6  */
    /* JADX WARN: Code duplicated, block: B:194:0x0bf4  */
    /* JADX WARN: Code duplicated, block: B:685:0x1dc5 A[PHI: r5
  0x1dc5: PHI (r5v49 int) = (r5v45 int), (r5v45 int), (r5v44 int) binds: [B:398:0x12e7, B:400:0x12f6, B:396:0x12de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:797:0x0b6d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:0x0b6d A[SYNTHETIC] */
    private static boolean attackAction(int i, byte[][] bArr) {
        float f;
        float f2;
        int i2;
        int i3;
        boolean z;
        int i4;
        float f3;
        VipObject vipObject;
        int i5;
        boolean z2;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= bArr.length) {
                return true;
            }
            readCommand(bArr[i7], f1bc, AtkData[i].char_no, i);
            if (f1bc.commandId == 0) {
                if (f1bc.params[0] == 0.0f) {
                    AtkData[i].charData.f69x = f1bc.params[1];
                    AtkData[i].charData.f70y = f1bc.params[2];
                    AtkData[i].charData.f71z = f1bc.params[3];
                    AtkData[i].charData.dir = f1bc.params[4];
                } else if (f1bc.params[0] == 1.0f) {
                    AtkData[i].charData.f69x = CameraData.gazX + f1bc.params[1];
                    AtkData[i].charData.f70y = CameraData.gazY + f1bc.params[2];
                    AtkData[i].charData.f71z = CameraData.gazZ + f1bc.params[3];
                    AtkData[i].charData.dir = f1bc.params[4];
                } else if (f1bc.params[0] == 2.0f || f1bc.params[0] == 3.0f || f1bc.params[0] == 4.0f) {
                    AtkData[i].charData.f69x = AtkData[i].f69x + f1bc.params[1];
                    AtkData[i].charData.f70y = f1bc.params[2];
                    if (f1bc.params[0] == 2.0f) {
                        AtkData[i].charData.f70y = AtkData[i].f70y + f1bc.params[2];
                    }
                    AtkData[i].charData.f71z = AtkData[i].f71z + f1bc.params[3];
                    AtkData[i].charData.dir = Util.RotDir(AtkData[i].dir, f1bc.params[4]);
                    if (f1bc.params[0] == 4.0f) {
                        AtkData[i].charData.dir = f1bc.params[4];
                    }
                } else if (f1bc.params[0] == 5.0f || f1bc.params[0] == 6.0f) {
                    float f4 = AtkData[i].charData.f69x;
                    float f5 = AtkData[i].charData.f70y;
                    float f6 = AtkData[i].charData.f71z;
                    AtkData[i].charData.f69x = AtkData[i].f69x + f1bc.params[1];
                    if (f1bc.params[0] != 6.0f) {
                        AtkData[i].charData.f70y = AtkData[i].f70y + f1bc.params[2];
                    }
                    AtkData[i].charData.f71z = AtkData[i].f71z + f1bc.params[3];
                    AtkData[i].charData.dir = Util.RotDir(AtkData[i].dir, f1bc.params[4]);
                    if (GameCommon.GetCharCollision(AtkData[i].char_no) < 0.0f) {
                        AtkData[i].charData.f69x = f4;
                        AtkData[i].charData.f70y = f5;
                        AtkData[i].charData.f71z = f6;
                    }
                }
            } else if (f1bc.commandId == 1) {
                float[] fArrRelativeChange = relativeChange(AtkData[i].charData.dir, f1bc.params[0], f1bc.params[2], 0, false);
                float f7 = AtkData[i].charData.f69x + fArrRelativeChange[0];
                float f8 = AtkData[i].charData.f71z + fArrRelativeChange[1];
                if (f1bc.params[3] == 99999.0f) {
                    f1bc.params[3] = 0.0f;
                    f7 = AtkData[i].charData.f69x + f1bc.params[0];
                    f8 = AtkData[i].charData.f71z + f1bc.params[2];
                }
                float fAtan2_360 = Util.atan2_360(f7 - AtkData[i].charData.f69x, f8 - AtkData[i].charData.f71z);
                float fSqrt = AtkData[i].charData.motionSpd * Util3D.sqrt(Util.getDistance(AtkData[i].charData.f69x, 0.0f, AtkData[i].charData.f71z, f7, 0.0f, f8));
                boolean z3 = GameStatus.PLAYER.getNumberData(19) != 3;
                AtkData[i].charData.f70y += f1bc.params[1];
                Game.MoveChar(AtkData[i].char_no, fAtan2_360, fSqrt, z3);
                AtkData[i].charData.dir = Util.RotDir(AtkData[i].charData.dir, f1bc.params[3]);
            } else if (f1bc.commandId == 55) {
                float[] fArrRelativeChange2 = relativeChange(AtkData[i].charData.dir, f1bc.params[0], f1bc.params[2], 0, false);
                float f9 = AtkData[i].charData.f69x + fArrRelativeChange2[0];
                float f10 = AtkData[i].charData.f71z + fArrRelativeChange2[1];
                if ((((int) f1bc.params[4]) & 1) == 1) {
                    f1bc.params[3] = 0.0f;
                    f9 = AtkData[i].charData.f69x + f1bc.params[0];
                    f10 = AtkData[i].charData.f71z + f1bc.params[2];
                }
                Game.MoveChar(AtkData[i].char_no, Util.atan2_360(f9 - AtkData[i].charData.f69x, f10 - AtkData[i].charData.f71z), AtkData[i].charData.motionSpd * Util3D.sqrt(Util.getDistance(AtkData[i].charData.f69x, 0.0f, AtkData[i].charData.f71z, f9, 0.0f, f10)), GameStatus.PLAYER.getNumberData(19) != 3);
                AtkData[i].charData.dir = Util.RotDir(AtkData[i].charData.dir, f1bc.params[3]);
                AtkData[i].charData.f70y += f1bc.params[1];
                float fGetCharCollision = GameCommon.GetCharCollision(AtkData[i].char_no);
                if (fGetCharCollision < 0.0f || fGetCharCollision > AtkData[i].charData.f70y) {
                    AtkData[i].charData.f70y -= f1bc.params[1];
                }
            } else if (f1bc.commandId == 2) {
                byte b = AtkData[i].charData.drawType;
                AtkData[i].dir = Util.RotDir(AtkData[i].dir, f1bc.params[4]);
                AtkData[i].angle = Util.RotDir(AtkData[i].angle, f1bc.params[5]);
                if (f1bc.params[0] == 0.0f) {
                    AtkData[i].f69x = f1bc.params[1];
                    AtkData[i].f70y = f1bc.params[2];
                    AtkData[i].f71z = f1bc.params[3];
                    AtkData[i].dir = f1bc.params[4];
                    AtkData[i].angle = f1bc.params[5];
                } else if (f1bc.params[0] == 1.0f) {
                    float[] fArrRelativeChange3 = relativeChange(AtkData[i].dir, f1bc.params[1], f1bc.params[3], b, false);
                    AtkData[i].f69x += fArrRelativeChange3[0];
                    AtkData[i].f70y += f1bc.params[2];
                    AttackData attackData = AtkData[i];
                    attackData.f71z = fArrRelativeChange3[1] + attackData.f71z;
                } else if (f1bc.params[0] == 2.0f) {
                    float[] fArrRelativeChange4 = relativeChange(AtkData[i].sdir, f1bc.params[1], f1bc.params[3], b, false);
                    AtkData[i].f69x = AtkData[i].f4sx + fArrRelativeChange4[0];
                    AtkData[i].f70y = AtkData[i].f5sy + f1bc.params[2];
                    AtkData[i].f71z = fArrRelativeChange4[1] + AtkData[i].f6sz;
                } else if (f1bc.params[0] == 3.0f) {
                    float[] fArrRelativeChange5 = relativeChange(AtkData[i].charData.dir, f1bc.params[1], f1bc.params[3], b, AtkData[i].flipSet);
                    AtkData[i].f69x = AtkData[i].charData.f69x + fArrRelativeChange5[0];
                    AtkData[i].f70y = AtkData[i].charData.f70y + f1bc.params[2];
                    AtkData[i].f71z = fArrRelativeChange5[1] + AtkData[i].charData.f71z;
                    AtkData[i].dir = Util.RotDir(AtkData[i].charData.dir, f1bc.params[4]);
                } else if (f1bc.params[0] == 4.0f) {
                    if (AtkData[i].targetData != null) {
                        float[] fArrRelativeChange6 = relativeChange(AtkData[i].targetData.dir, f1bc.params[1], f1bc.params[3], b, false);
                        AtkData[i].f69x = AtkData[i].targetData.f69x + fArrRelativeChange6[0];
                        AtkData[i].f70y = AtkData[i].targetData.f70y + f1bc.params[2];
                        AtkData[i].f71z = fArrRelativeChange6[1] + AtkData[i].targetData.f71z;
                        AtkData[i].dir = Util.RotDir(AtkData[i].targetData.dir, f1bc.params[4]);
                    } else {
                        float[] fArrRelativeChange7 = relativeChange(AtkData[i].dir, f1bc.params[1], f1bc.params[3], b, false);
                        AtkData[i].f69x += fArrRelativeChange7[0];
                        AtkData[i].f70y += f1bc.params[2];
                        AtkData[i].f71z = fArrRelativeChange7[1] + AtkData[i].f71z;
                        AtkData[i].dir = Util.RotDir(AtkData[i].dir, f1bc.params[4]);
                    }
                } else if (f1bc.params[0] == 5.0f || f1bc.params[0] == 6.0f || f1bc.params[0] == 7.0f) {
                    int i8 = 0;
                    if (AtkData[i].target_no >= 0 && Character.charData[AtkData[i].target_no].type >= 1) {
                        i8 = AtkData[i].target_no;
                    }
                    AtkData[i].dir = Util.RotDir(Character.charData[i8].dir, f1bc.params[4]);
                    if (f1bc.params[0] == 6.0f) {
                        AtkData[i].dir = f1bc.params[4];
                        AtkData[i].angle = f1bc.params[5];
                    }
                    float[] fArrRelativeChange8 = relativeChange(AtkData[i].dir, f1bc.params[1], f1bc.params[3], b, false);
                    AtkData[i].f69x = Character.charData[i8].f69x + fArrRelativeChange8[0];
                    AtkData[i].f70y = Character.charData[i8].f70y + f1bc.params[2];
                    if (f1bc.params[0] == 7.0f) {
                        AtkData[i].f70y = f1bc.params[2];
                    }
                    AtkData[i].f71z = Character.charData[i8].f71z + fArrRelativeChange8[1];
                } else if (f1bc.params[0] == 8.0f) {
                    float[] fArrRelativeChange9 = relativeChange(CameraData.dirDelay, f1bc.params[1], f1bc.params[3], b, false);
                    AtkData[i].f69x = CameraData.apsDelayX + fArrRelativeChange9[0];
                    AtkData[i].f70y = CameraData.apsDelayY + f1bc.params[2];
                    AtkData[i].f71z = fArrRelativeChange9[1] + CameraData.apsDelayZ;
                    AtkData[i].dir = CameraData.dirDelay;
                    AtkData[i].angle = CameraData.angDelay;
                } else if (f1bc.params[0] == 9.0f) {
                    float[] fArrRelativeChange10 = relativeChange(Character.charData[tcCharNo].dir, f1bc.params[1], f1bc.params[3], b, false);
                    AtkData[i].f69x = Character.charData[tcCharNo].f69x + fArrRelativeChange10[0];
                    AtkData[i].f70y = Character.charData[tcCharNo].f70y + f1bc.params[2];
                    AtkData[i].f71z = fArrRelativeChange10[1] + Character.charData[tcCharNo].f71z;
                    AtkData[i].dir = Util.RotDir(Character.charData[tcCharNo].dir, f1bc.params[4]);
                }
            } else if (f1bc.commandId == 5) {
                AtkData[i].charData.invCnt = (short) f1bc.params[0];
            } else if (f1bc.commandId == 6) {
                AtkData[i].atkFlag = (byte) f1bc.params[0];
            } else if (f1bc.commandId == 7) {
                Character.motionSet(AtkData[i].char_no, 0);
                Character.motionSet(AtkData[i].char_no, (int) f1bc.params[0]);
            } else if (f1bc.commandId == 53) {
                if ((((int) f1bc.params[0]) == 0 && AtkData[i].charData.motion == ((int) f1bc.params[1])) || (((int) f1bc.params[0]) == 1 && AtkData[i].charData.motion != ((int) f1bc.params[1]))) {
                    Character.motionSet(AtkData[i].char_no, 0);
                    Character.motionSet(AtkData[i].char_no, (int) f1bc.params[2]);
                }
            } else if (f1bc.commandId == 8) {
                Sound.play_se(((int) f1bc.params[0]) <= 1 ? (int) f1bc.params[0] : ((AtkData[i].gidIndex >> 16) + 1) << 16, 1, (int) f1bc.params[1]);
            } else if (f1bc.commandId == 10 || f1bc.commandId == 32 || f1bc.commandId == 46) {
                int length = (f1bc.params[8] == 3.0f || f1bc.params[8] == 4.0f) ? AtkData[i].hitChar_no.length : 1;
                for (int i9 = 0; i9 < length; i9++) {
                    int iGetFrame = (int) f1bc.params[5];
                    if (iGetFrame == 99999) {
                        iGetFrame = (int) Game.GetFrame(0, (int) f1bc.params[2]);
                    }
                    float f11 = AtkData[i].f69x;
                    float f12 = AtkData[i].f70y;
                    float f13 = AtkData[i].f71z;
                    if (f1bc.commandId == 46) {
                        float[] fArrRelativeChange11 = relativeChange(AtkData[i].dir, f1bc.params[11], f1bc.params[13], 0, false);
                        f11 += fArrRelativeChange11[0];
                        f12 += f1bc.params[12];
                        f13 += fArrRelativeChange11[1];
                    }
                    if (f1bc.params[8] == 1.0f || f1bc.params[8] == 3.0f) {
                        int i10 = AtkData[i].hitChar_no[i9];
                        if (i10 >= 0) {
                            if (Character.charData[i10].width + Character.charData[i10].height + Character.charData[i10].depth <= 30.0f) {
                                f11 = Character.charData[i10].f69x;
                                float f14 = (Character.charData[i10].height / 2.0f) + Character.charData[i10].f70y;
                                f = Character.charData[i10].f71z;
                                f2 = f14;
                            }
                            int i11 = (int) f1bc.params[6];
                            i2 = (int) f1bc.params[7];
                            if (i2 >= 0) {
                                i2 = (AtkData[i].groupNo * 100000) + (AtkData[i].objNo * 100) + ((int) f1bc.params[7]);
                            }
                            i3 = (int) f1bc.params[1];
                            if (i3 == 2) {
                                i3 = ((AtkData[i].gidIndex >> 16) + 1) << 16;
                            }
                            z = false;
                            if (f1bc.commandId == 32 && ((int) f1bc.params[10]) == 1) {
                                z = true;
                            }
                            i4 = Effect.set(i3, (int) f1bc.params[2], f11, f2, f, f1bc.params[3], (int) f1bc.params[4], iGetFrame, i11, i2, z);
                            if (f1bc.params[9] >= 0.0f) {
                                f3 = 0.0f;
                                vipObject = AtkData[i];
                                if (f1bc.params[9] == 1.0f) {
                                    if (AtkData[i].hitChar_no[i9] >= 0) {
                                        f3 = Character.charData[AtkData[i].hitChar_no[i9]].height;
                                        vipObject = Character.charData[AtkData[i].hitChar_no[i9]];
                                    }
                                } else if (f1bc.params[9] == 2.0f) {
                                    f3 = AtkData[i].charData.height;
                                    vipObject = AtkData[i].charData;
                                }
                                if (i4 >= 0) {
                                    Effect.homingBind(i4, vipObject, f3);
                                }
                            }
                        } else if (i9 == 0) {
                        }
                        f = f13;
                        f2 = f12;
                        int i12 = (int) f1bc.params[6];
                        i2 = (int) f1bc.params[7];
                        if (i2 >= 0) {
                            i2 = (AtkData[i].groupNo * 100000) + (AtkData[i].objNo * 100) + ((int) f1bc.params[7]);
                        }
                        i3 = (int) f1bc.params[1];
                        if (i3 == 2) {
                            i3 = ((AtkData[i].gidIndex >> 16) + 1) << 16;
                        }
                        z = false;
                        if (f1bc.commandId == 32) {
                            z = true;
                        }
                        i4 = Effect.set(i3, (int) f1bc.params[2], f11, f2, f, f1bc.params[3], (int) f1bc.params[4], iGetFrame, i12, i2, z);
                        if (f1bc.params[9] >= 0.0f) {
                            f3 = 0.0f;
                            vipObject = AtkData[i];
                            if (f1bc.params[9] == 1.0f) {
                                if (AtkData[i].hitChar_no[i9] >= 0) {
                                    f3 = Character.charData[AtkData[i].hitChar_no[i9]].height;
                                    vipObject = Character.charData[AtkData[i].hitChar_no[i9]];
                                }
                            } else if (f1bc.params[9] == 2.0f) {
                                f3 = AtkData[i].charData.height;
                                vipObject = AtkData[i].charData;
                            }
                            if (i4 >= 0) {
                                Effect.homingBind(i4, vipObject, f3);
                            }
                        }
                    } else {
                        if (f1bc.params[8] == 2.0f) {
                            f11 = AtkData[i].charData.f69x;
                            float f15 = (AtkData[i].charData.height / 2.0f) + AtkData[i].charData.f70y;
                            f = AtkData[i].charData.f71z;
                            f2 = f15;
                        } else if (f1bc.params[8] != 4.0f) {
                            f = f13;
                            f2 = f12;
                        } else {
                            int i13 = AtkData[i].hitChar_no[i9];
                            if (i13 >= 0) {
                                f11 = Character.charData[i13].f69x;
                                float f16 = Character.charData[i13].height + Character.charData[i13].f70y;
                                f = Character.charData[i13].f71z;
                                f2 = f16;
                            } else if (i9 == 0) {
                                f = f13;
                                f2 = f12;
                            }
                        }
                        int i14 = (int) f1bc.params[6];
                        i2 = (int) f1bc.params[7];
                        if (i2 >= 0) {
                            i2 = (AtkData[i].groupNo * 100000) + (AtkData[i].objNo * 100) + ((int) f1bc.params[7]);
                        }
                        i3 = (int) f1bc.params[1];
                        if (i3 == 2) {
                            i3 = ((AtkData[i].gidIndex >> 16) + 1) << 16;
                        }
                        z = false;
                        if (f1bc.commandId == 32) {
                            z = true;
                        }
                        i4 = Effect.set(i3, (int) f1bc.params[2], f11, f2, f, f1bc.params[3], (int) f1bc.params[4], iGetFrame, i14, i2, z);
                        if (f1bc.params[9] >= 0.0f) {
                            f3 = 0.0f;
                            vipObject = AtkData[i];
                            if (f1bc.params[9] == 1.0f) {
                                if (AtkData[i].hitChar_no[i9] >= 0) {
                                    f3 = Character.charData[AtkData[i].hitChar_no[i9]].height;
                                    vipObject = Character.charData[AtkData[i].hitChar_no[i9]];
                                }
                            } else if (f1bc.params[9] == 2.0f) {
                                f3 = AtkData[i].charData.height;
                                vipObject = AtkData[i].charData;
                            }
                            if (i4 >= 0) {
                                Effect.homingBind(i4, vipObject, f3);
                            }
                        }
                    }
                }
            } else if (f1bc.commandId == 11 || f1bc.commandId == 58) {
                boolean z4 = true;
                if (f1bc.commandId == 58 && (((int) f1bc.params[1]) & 1) == 1 && AtkData[i].separate) {
                    z4 = false;
                }
                if (z4) {
                    Effect.clear((AtkData[i].groupNo * 100000) + (AtkData[i].objNo * 100) + ((int) f1bc.params[0]));
                }
            } else if (f1bc.commandId == 9) {
                AtkData[i].modelType = (int) f1bc.params[0];
                AtkData[i].modelNo = (int) f1bc.params[1];
                AtkData[i].modelScale = f1bc.params[2];
                AtkData[i].modelBlend = (int) f1bc.params[3];
            } else if (f1bc.commandId == 3) {
                AtkData[i].wait = (int) f1bc.params[0];
            } else if (f1bc.commandId == 4) {
                if (AtkData[i].charData.motion == f1bc.params[0]) {
                    AtkData[i].cur = AtkData[i].curBack;
                    return true;
                }
            } else if (f1bc.commandId == 12) {
                AtkData[i].checkMotion = (int) f1bc.params[0];
            } else if (f1bc.commandId == 42) {
                AtkData[i].checkMotion = 65536 + ((int) f1bc.params[0]);
            } else if (f1bc.commandId == 13 || f1bc.commandId == 41) {
                int i15 = (int) f1bc.params[0];
                int i16 = -1;
                if (f1bc.commandId == 41) {
                    i16 = (int) f1bc.params[2];
                } else if (f1bc.params[2] == 0.0f) {
                    i16 = AtkData[i].char_no;
                } else if (f1bc.params[2] == 1.0f) {
                    i16 = AtkData[i].target_no;
                }
                setAttackData((int) f1bc.params[1], i15, Character.charData[i15], i16, i16 == -1 ? null : Character.charData[i16], (short) 0, (short) 0);
            } else if (f1bc.commandId == 43) {
                int i17 = -1;
                if (f1bc.params[0] == 0.0f) {
                    i17 = AtkData[i].char_no;
                } else if (f1bc.params[0] == 1.0f) {
                    i17 = AtkData[i].target_no;
                } else if (f1bc.params[0] == 2.0f) {
                    i17 = (int) f1bc.params[1];
                }
                int i18 = -1;
                if (f1bc.params[4] == 0.0f) {
                    i18 = AtkData[i].char_no;
                } else if (f1bc.params[4] == 1.0f) {
                    i18 = AtkData[i].target_no;
                } else if (f1bc.params[4] == 2.0f) {
                    i18 = (int) f1bc.params[5];
                }
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = 0.0f;
                if (f1bc.params[3] == 0.0f) {
                    if (AtkData[i].char_no >= 0) {
                        f17 = AtkData[i].charData.f69x;
                        f18 = AtkData[i].charData.f70y;
                        f19 = AtkData[i].charData.f71z;
                        f20 = AtkData[i].charData.dir;
                    }
                } else if (f1bc.params[3] == 1.0f) {
                    if (AtkData[i].target_no >= 0) {
                        f17 = AtkData[i].targetData.f69x;
                        f18 = AtkData[i].targetData.f70y;
                        f19 = AtkData[i].targetData.f71z;
                        f20 = AtkData[i].targetData.dir;
                    }
                } else if (f1bc.params[3] == 2.0f) {
                    f17 = AtkData[i].f69x;
                    f18 = AtkData[i].f70y;
                    f19 = AtkData[i].f71z;
                    f20 = AtkData[i].dir;
                } else if (f1bc.params[3] == 3.0f && f1bc.params[0] == 2.0f && i17 >= 0) {
                    f17 = Character.charData[i17].f69x;
                    f18 = Character.charData[i17].f70y;
                    f19 = Character.charData[i17].f71z;
                    f20 = Character.charData[i17].dir;
                }
                setAttackDataMain((int) f1bc.params[2], i17, i17 == -1 ? new CharData() : Character.charData[i17], i18, i18 == -1 ? null : Character.charData[i18], f17, f18, f19, f20, (short) 0, (short) 0, -1, 0, -1, (short) f1bc.params[6]);
            } else if (f1bc.commandId == 57) {
                boolean z5 = false;
                if ((((int) f1bc.params[0]) == 0 && ((int) f1bc.params[1]) == ((int) f1bc.params[2])) || (((int) f1bc.params[0]) == 1 && ((int) f1bc.params[1]) != ((int) f1bc.params[2]))) {
                    z5 = true;
                }
                if (GameCommon.DEBUG_STATUS[17] >= 2) {
                }
                if (z5) {
                    int i19 = -1;
                    if (f1bc.params[3] == 0.0f) {
                        i19 = AtkData[i].char_no;
                    } else if (f1bc.params[3] == 1.0f) {
                        i19 = AtkData[i].target_no;
                    } else if (f1bc.params[3] == 2.0f) {
                        i19 = (int) f1bc.params[4];
                    }
                    int i20 = -1;
                    if (f1bc.params[7] == 0.0f) {
                        i20 = AtkData[i].char_no;
                    } else if (f1bc.params[7] == 1.0f) {
                        i20 = AtkData[i].target_no;
                    } else if (f1bc.params[7] == 2.0f) {
                        i20 = (int) f1bc.params[8];
                    }
                    float f21 = 0.0f;
                    float f22 = 0.0f;
                    float f23 = 0.0f;
                    float f24 = 0.0f;
                    if (f1bc.params[6] == 0.0f) {
                        if (AtkData[i].char_no >= 0) {
                            f21 = AtkData[i].charData.f69x;
                            f22 = AtkData[i].charData.f70y;
                            f23 = AtkData[i].charData.f71z;
                            f24 = AtkData[i].charData.dir;
                        }
                    } else if (f1bc.params[6] == 1.0f) {
                        if (AtkData[i].target_no >= 0) {
                            f21 = AtkData[i].targetData.f69x;
                            f22 = AtkData[i].targetData.f70y;
                            f23 = AtkData[i].targetData.f71z;
                            f24 = AtkData[i].targetData.dir;
                        }
                    } else if (f1bc.params[6] == 2.0f) {
                        f21 = AtkData[i].f69x;
                        f22 = AtkData[i].f70y;
                        f23 = AtkData[i].f71z;
                        f24 = AtkData[i].dir;
                    } else if (f1bc.params[6] == 3.0f && f1bc.params[3] == 2.0f && i19 >= 0) {
                        f21 = Character.charData[i19].f69x;
                        f22 = Character.charData[i19].f70y;
                        f23 = Character.charData[i19].f71z;
                        f24 = Character.charData[i19].dir;
                    }
                    setAttackDataMain((int) f1bc.params[5], i19, i19 == -1 ? new CharData() : Character.charData[i19], i20, i20 == -1 ? null : Character.charData[i20], f21, f22, f23, f24, (short) 0, (short) 0, -1, 0, -1, (short) f1bc.params[9]);
                }
            } else if (f1bc.commandId == 14) {
                if (f1bc.params[1] == 1.0f || !AtkData[i].separate) {
                    if (f1bc.params[0] == 0.0f) {
                        freeAttackData(i);
                    } else {
                        freeAttackDataGroup(i, AtkData[i].groupNo);
                    }
                }
            } else if (f1bc.commandId == 15 || f1bc.commandId == 36) {
                float f25 = 0.0f;
                float f26 = 0.0f;
                float f27 = 0.0f;
                float f28 = -1.0f;
                if (AtkData[i].char_no < 0 || Character.charData[AtkData[i].char_no].targetBlock < 0) {
                    int i21 = AtkData[i].char_no;
                    if (f1bc.params[0] == 0.0f) {
                        i5 = AtkData[i].target_no;
                    } else if (f1bc.params[0] == 2.0f || f1bc.params[0] == 3.0f) {
                        i21 = 0;
                        if (AtkData[i].target_no < 0 || Character.charData[AtkData[i].target_no].type < 1) {
                            i5 = i21;
                        } else {
                            i5 = AtkData[i].target_no;
                        }
                    } else {
                        i5 = i21;
                    }
                    if (i5 >= 0 && Character.charData[i5].f12hp > 0) {
                        float[] fArr = new float[3];
                        if (f1bc.commandId == 36) {
                            fArr[0] = f1bc.params[3];
                            fArr[1] = f1bc.params[5];
                            fArr[2] = f1bc.params[4];
                            if (f1bc.params[0] == 2.0f) {
                                relativeChange(Character.charData[i5].dir, f1bc.params[3], f1bc.params[5], 0, false, fArr);
                            }
                        }
                        f25 = Character.charData[i5].f69x + fArr[0];
                        f27 = fArr[1] + Character.charData[i5].f71z;
                        f26 = fArr[2] + Character.charData[i5].f70y;
                        f28 = Character.charData[i5].height;
                    }
                } else {
                    f25 = MapData.bugBlock[Character.charData[AtkData[i].char_no].targetBlock].f69x;
                    f26 = MapData.bugBlock[Character.charData[AtkData[i].char_no].targetBlock].f70y;
                    f27 = MapData.bugBlock[Character.charData[AtkData[i].char_no].targetBlock].f71z;
                    f28 = MapData.bugBlock[Character.charData[AtkData[i].char_no].targetBlock].sizeY;
                }
                if (f28 >= 0.0f) {
                    AtkData[i].dir = Util.RotDir(AtkData[i].dir, Util.limitDiffDir(Util.atan2_360(f25 - AtkData[i].f69x, f27 - AtkData[i].f71z), AtkData[i].dir, f1bc.params[2]));
                    if (f1bc.params[1] == 1.0f || f1bc.params[1] == 2.0f) {
                        if (f1bc.params[1] == 2.0f) {
                            f28 = 0.0f;
                        }
                        AtkData[i].angle = Util.RotDir(AtkData[i].angle, Util.limitDiffDir(Util.atan2_360((f28 + f26) - AtkData[i].f70y, Util3D.sqrt(((f27 - AtkData[i].f71z) * (f27 - AtkData[i].f71z)) + ((f25 - AtkData[i].f69x) * (f25 - AtkData[i].f69x)))), AtkData[i].angle, f1bc.params[2]));
                    }
                }
            } else if (f1bc.commandId == 16 || f1bc.commandId == 54) {
                float f29 = f1bc.params[0];
                if (f1bc.commandId == 54 && f1bc.params[0] > f1bc.params[1]) {
                    f29 = f1bc.params[1];
                }
                float fSin = FastMath.sin(AtkData[i].angle) * f29;
                float fCos = f29 * FastMath.cos(AtkData[i].angle);
                AtkData[i].f69x += FastMath.sin(AtkData[i].dir) * fCos;
                AttackData attackData2 = AtkData[i];
                attackData2.f70y = fSin + attackData2.f70y;
                AttackData attackData3 = AtkData[i];
                attackData3.f71z = (fCos * FastMath.cos(AtkData[i].dir)) + attackData3.f71z;
            } else if (f1bc.commandId == 45) {
                if (AtkData[i].char_no >= 0 && AtkData[i].target_no >= 0) {
                    AtkData[i].dir = Util.atan2_360(Character.charData[AtkData[i].target_no].f69x - AtkData[i].f69x, Character.charData[AtkData[i].target_no].f71z - AtkData[i].f71z);
                    AtkData[i].angle = Util.atan2_360((Character.charData[AtkData[i].target_no].f70y + (Character.charData[AtkData[i].target_no].height / 2.0f)) - AtkData[i].f70y, Util3D.sqrt(((Character.charData[AtkData[i].target_no].f69x - AtkData[i].f69x) * (Character.charData[AtkData[i].target_no].f69x - AtkData[i].f69x)) + ((Character.charData[AtkData[i].target_no].f71z - AtkData[i].f71z) * (Character.charData[AtkData[i].target_no].f71z - AtkData[i].f71z))));
                    float fSqrt2 = (Util3D.sqrt(Util.getDistance(AtkData[i].f69x, AtkData[i].f70y, AtkData[i].f71z, AtkData[i].targetData.f69x, AtkData[i].targetData.f70y + (Character.charData[AtkData[i].target_no].height / 2.0f), AtkData[i].targetData.f71z)) * f1bc.params[2]) / 100.0f;
                    float fSin2 = FastMath.sin(AtkData[i].angle) * fSqrt2;
                    float fCos2 = fSqrt2 * FastMath.cos(AtkData[i].angle);
                    AtkData[i].f69x += FastMath.sin(AtkData[i].dir) * fCos2;
                    AttackData attackData4 = AtkData[i];
                    attackData4.f70y = fSin2 + attackData4.f70y;
                    AttackData attackData5 = AtkData[i];
                    attackData5.f71z = (fCos2 * FastMath.cos(AtkData[i].dir)) + attackData5.f71z;
                }
            } else if (f1bc.commandId == 17) {
                if (f1bc.params[1] == 1.0f || !AtkData[i].charData.getBitState(4)) {
                    if (f1bc.params[0] > 0.0f) {
                        Character.setJmpSpd(AtkData[i].char_no, f1bc.params[0]);
                        AtkData[i].charData.setBitState(4, true);
                    } else if (AtkData[i].charData.getBitState(4)) {
                        AtkData[i].charData.jmpSpd = f1bc.params[0];
                    }
                } else if (f1bc.params[1] == 2.0f) {
                    float fGetCharCollision2 = GameCommon.GetCharCollision(AtkData[i].char_no) + f1bc.params[0];
                    if (fGetCharCollision2 - AtkData[i].charData.f70y > 0.0f) {
                        Character.setJmpSpd(AtkData[i].char_no, fGetCharCollision2 - AtkData[i].charData.f70y);
                    }
                }
            } else if (f1bc.commandId == 40) {
                if (AtkData[i].charData.getBitState(4) && (f1bc.params[0] == 0.0f || AtkData[i].charData.jmpSpd > 0.0f)) {
                    AtkData[i].cur = AtkData[i].curBack;
                    return true;
                }
            } else if (f1bc.commandId == 18) {
                if (AtkData[i].loopCnt == -1 && f1bc.params[0] > 0.0f) {
                    AtkData[i].loopCnt = (int) f1bc.params[0];
                }
            } else if (f1bc.commandId == 19) {
                AttackData attackData6 = AtkData[i];
                int i22 = attackData6.loopCnt - 1;
                attackData6.loopCnt = i22;
                if (i22 <= 0) {
                    AtkData[i].loopCnt = -1;
                } else {
                    AtkData[i].cur = AtkData[i].curBack;
                }
            } else if (f1bc.commandId == 20) {
                Character.afterImageSet(-1);
                if (f1bc.params[0] == 1.0f) {
                    Character.afterImageSet(AtkData[i].char_no);
                }
            } else if (f1bc.commandId == 21) {
                AtkData[i].liftSpd = f1bc.params[0];
            } else if (f1bc.commandId == 22) {
                if (((int) f1bc.params[0]) <= 1) {
                    CameraData.shake = ((int) f1bc.params[0]) != 0;
                } else {
                    CameraData.shake = true;
                    cameraShakeTimer = (int) f1bc.params[0];
                }
            } else if (f1bc.commandId == 23) {
                AtkData[i].separate = true;
                AtkData[i].charData.setBitState(Appearance.LIGHTTWOSIDE, false);
            } else if (f1bc.commandId == 25) {
                int i23 = (int) f1bc.params[0];
                if (AtkData[i].charData.drawType == 2) {
                    AtkData[i].bindFig = (Figure) Character.figData[Character.getCharIndex(Character.charData[AtkData[i].char_no].charId)].findObject3D(9, i23);
                } else if (AtkData[i].charData.drawType == 4) {
                    AtkData[i].bindFig = (Figure) MapData.modelFig.findObject3D(9, i23);
                } else {
                    AtkData[i].bindFig = null;
                }
                if (AtkData[i].bindFig != null) {
                    AtkData[i].modelType = (int) f1bc.params[1];
                }
            } else if (f1bc.commandId == 26) {
                AtkData[i].canCounter = f1bc.params[0] != 0.0f;
            } else if (f1bc.commandId == 27) {
                GameStatus.GAME.waitEventFiles.addElement(new StringBuffer().append("").append((int) f1bc.params[0]).toString());
            } else if (f1bc.commandId == 30 || f1bc.commandId == 35 || f1bc.commandId == 51) {
                int i24 = 0;
                while (true) {
                    if (i24 >= 50 - MapData.gBlockNum) {
                        z2 = false;
                        break;
                    }
                    if (MapData.bugBlock[i24].type == -1) {
                        MapData.bugBlock[i24].clear();
                        AtkData[i].blockNo = (short) i24;
                        MapData.bugBlock[i24].state = (byte) 2;
                        MapData.bugBlock[i24].view = (byte) 1;
                        BugBlock bugBlock = MapData.bugBlock[i24];
                        BugBlock bugBlock2 = MapData.bugBlock[i24];
                        MapData.bugBlock[i24].sizeZ = 4.0f;
                        bugBlock2.sizeY = 4.0f;
                        bugBlock.sizeX = 4.0f;
                        MapData.bugBlock[i24].type = (byte) f1bc.params[0];
                        MapData.bugBlock[i24].f9hp = (byte) f1bc.params[1];
                        MapData.bugBlock[i24].group = (byte) -1;
                        if (f1bc.commandId == 35 && f1bc.params[2] == 0.0f) {
                            MapData.bugBlock[i24].gravity = (byte) 0;
                        }
                        if (f1bc.commandId == 51 && f1bc.params[3] > 0.0f) {
                            MapData.bugBlock[i24].moveDir = (byte) f1bc.params[3];
                        }
                        if (GameStatus.EXTRA.isCheatMode(17)) {
                            f2gm.treasureBlockSet();
                        }
                        z2 = true;
                        break;
                    }
                    i24++;
                }
                if (!z2) {
                }
            } else if (f1bc.commandId == 28) {
                short s = AtkData[i].blockNo;
                if (s >= 0) {
                    if (f1bc.params[0] == 0.0f) {
                        MapData.bugBlock[s].f69x = f1bc.params[1];
                        MapData.bugBlock[s].f70y = f1bc.params[2];
                        MapData.bugBlock[s].f71z = f1bc.params[3];
                    } else if (f1bc.params[0] == 1.0f || f1bc.params[0] == 4.0f) {
                        float[] fArrRelativeChange12 = relativeChange(AtkData[i].dir, f1bc.params[1], f1bc.params[3], 0, false);
                        MapData.bugBlock[s].f69x = AtkData[i].f69x + fArrRelativeChange12[0];
                        MapData.bugBlock[s].f70y = AtkData[i].f70y + f1bc.params[2];
                        MapData.bugBlock[s].f71z = fArrRelativeChange12[1] + AtkData[i].f71z;
                    } else if (f1bc.params[0] == 2.0f) {
                        float[] fArrRelativeChange13 = relativeChange(AtkData[i].charData.dir, f1bc.params[1], f1bc.params[3], 0, AtkData[i].flipSet);
                        MapData.bugBlock[s].f69x = AtkData[i].charData.f69x + fArrRelativeChange13[0];
                        MapData.bugBlock[s].f70y = AtkData[i].charData.f70y + f1bc.params[2];
                        MapData.bugBlock[s].f71z = fArrRelativeChange13[1] + AtkData[i].charData.f71z;
                    } else if (f1bc.params[0] == 3.0f && AtkData[i].targetData != null) {
                        float[] fArrRelativeChange14 = relativeChange(AtkData[i].targetData.dir, f1bc.params[1], f1bc.params[3], 0, false);
                        MapData.bugBlock[s].f69x = AtkData[i].targetData.f69x + fArrRelativeChange14[0];
                        MapData.bugBlock[s].f70y = AtkData[i].targetData.f70y + f1bc.params[2];
                        MapData.bugBlock[s].f71z = fArrRelativeChange14[1] + AtkData[i].targetData.f71z;
                    }
                    if (f1bc.params[0] != 4.0f) {
                        MapData.bugBlock[s].f69x = MapData.w2bc(MapData.bugBlock[s].f69x);
                        MapData.bugBlock[s].f71z = MapData.w2bc(MapData.bugBlock[s].f71z);
                    }
                    if (f1bc.params[0] != 4.0f) {
                        int collisionOption = MapData.getCollisionOption(MapData.bugBlock[s].f69x, MapData.bugBlock[s].f70y, MapData.bugBlock[s].f71z, MapData.bugBlock[s].sizeX, 0);
                        float areaCollision = MapData.getAreaCollision(MapData.bugBlock[s].f69x, MapData.bugBlock[s].f70y, MapData.bugBlock[s].f71z, 0.0f, 0.0f, true);
                        if ((collisionOption & 2) != 0 || areaCollision < 0.0f || (f1bc.params[0] != 4.0f && MapData.bugBlock[s].f70y + MapData.bugBlock[s].sizeY < areaCollision)) {
                            MapData.bugBlock[s].clear();
                            AtkData[i].blockNo = (short) -1;
                        }
                    }
                    if (MapData.bugBlock[s].gravity != 0) {
                        BugBlock bugBlock3 = MapData.bugBlock[s];
                        bugBlock3.gravity = (byte) (bugBlock3.gravity | 2);
                    }
                }
            } else if (f1bc.commandId == 44) {
                if (AtkData[i].blockNo >= 0) {
                    MapData.bugBlock[AtkData[i].blockNo].clear();
                }
            } else if (f1bc.commandId == 29) {
                if (!Character.charData[0].getBitState(4) && !Character.charData[0].getBitState(1024)) {
                    Character.motionSet(0, 41);
                    GameStatus.PLAYER.setNumberData(40, Math.max(GameStatus.PLAYER.getNumberData(40), (int) f1bc.params[0]));
                }
            } else if (f1bc.commandId == 31) {
                AtkData[i].attribute = (int) f1bc.params[0];
            } else if (f1bc.commandId == 33) {
                int i25 = (int) f1bc.params[0];
                if (i25 >= 0) {
                    Character.charData[i25].f69x = f1bc.params[1];
                    Character.charData[i25].f70y = f1bc.params[2];
                    Character.charData[i25].f71z = f1bc.params[3];
                    Character.charData[i25].dir = f1bc.params[4];
                }
            } else if (f1bc.commandId == 34) {
                AtkData[i].rangeMag = (short) f1bc.params[0];
            } else if (f1bc.commandId == 37) {
                for (int i26 = 0; i26 < AtkData[i].hitChar_no.length; i26++) {
                    AtkData[i].hitChar_no[i26] = -1;
                }
                int i27 = 0;
                for (int i28 = 0; i28 < Character.charData.length; i28++) {
                    if (Character.charData[i28].use && ((Character.charData[i28].level > 0 || Character.charData[i28].type == 2) && ((((int) f1bc.params[0]) == 0 && i28 == AtkData[i].char_no) || ((((int) f1bc.params[0]) == 1 && AtkData[i].char_no >= 0 && !attrEneCheck(Character.charData[i28].type, Character.charData[AtkData[i].char_no].type)) || ((((int) f1bc.params[0]) == 2 && i28 == AtkData[i].target_no) || ((((int) f1bc.params[0]) == 3 && AtkData[i].char_no >= 0 && attrEneCheck(Character.charData[i28].type, Character.charData[AtkData[i].char_no].type)) || ((int) f1bc.params[0]) == 9)))))) {
                        float f30 = (f1bc.params[2] * (100.0f + AtkData[i].piyoriHosei)) / 100.0f;
                        if (((int) f1bc.params[1]) == 0) {
                            Character.cure(i28, (int) f30);
                        } else if (((int) f1bc.params[1]) == 1) {
                            if (i28 == 0) {
                                GameStatus.PLAYER.cureDebugPower(f30, GameStatus.GAME.extCommand == 0, true, true);
                            }
                        } else if (((int) f1bc.params[1]) != 2 && ((int) f1bc.params[1]) != 3 && ((int) f1bc.params[1]) == 4) {
                            Character.cure(i28, Math.max(1, (int) ((Character.charData[i28].maxHp * f1bc.params[2]) / 100.0f)));
                        }
                        AtkData[i].hitChar_no[i27] = i28;
                        i27++;
                    }
                }
            } else if (f1bc.commandId == 38) {
                AtkData[i].motionSync = f1bc.params[0] != 0.0f;
            } else if (f1bc.commandId == 39) {
                Game.blurSet((int) f1bc.params[0], 1);
            } else if (f1bc.commandId == 47) {
                AtkData[i].tempVal = (short) f1bc.params[0];
            } else if (f1bc.commandId == 48) {
                AtkData[i].hitOnce = true;
            } else if (f1bc.commandId == 49) {
                if (AtkData[i].char_no >= 0 && AtkData[i].totalDamage > 0) {
                    int iMax = Math.max(1, (AtkData[i].totalDamage * Util.randomFix((int) f1bc.params[0], (int) f1bc.params[1])) / 100);
                    if (GameCommon.DEBUG_STATUS[17] >= 2) {
                    }
                    Character.cure(AtkData[i].char_no, iMax);
                }
            } else if (f1bc.commandId == 50) {
                if (AtkData[i].char_no >= 0) {
                    Character.charData[AtkData[i].char_no].thinkVal[(int) f1bc.params[0]] = (short) f1bc.params[1];
                }
            } else if (f1bc.commandId != 52 && f1bc.commandId == 56) {
                Game game = f2gm;
                Game.eventSIVar[(int) f1bc.params[0]] = (int) f1bc.params[1];
                if (GameCommon.DEBUG_STATUS[17] >= 2) {
                }
            }
            i6 = i7 + 1;
        }
    }

    private static int attackAttack(int i, boolean z) {
        int i2 = -1;
        float f = (AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].f8r * AtkData[i].rangeMag) / 100.0f;
        float f2 = (AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].f7h * AtkData[i].rangeMag) / 100.0f;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            int i5 = i2;
            if (i4 >= AtkData.length) {
                return i5;
            }
            if (i != i4 && AtkData[i4].use && AtkData[i4].disp && attrEneCheck(AtkData[i4].attribute, AtkData[i].attribute)) {
                float f3 = (AtkInfo[AtkData[i4].gidIndex >> 16][AtkData[i4].gidIndex & 65535].f8r * AtkData[i4].rangeMag) / 100.0f;
                float f4 = (AtkInfo[AtkData[i4].gidIndex >> 16][AtkData[i4].gidIndex & 65535].f7h * AtkData[i4].rangeMag) / 100.0f;
                if (Util.hitCheckB2B(AtkData[i].f69x, AtkData[i].f70y - (f2 / 2.0f), AtkData[i].f71z, f, f2, f, AtkData[i4].f69x, AtkData[i4].f70y - (f4 / 2.0f), AtkData[i4].f71z, f3, f4, f3)) {
                    if (z) {
                        i5 = i4 + GameStatus.PlayerData.DBG_POWER_MAX;
                    } else if (AtkData[i4].f3hp > 0) {
                        AtkData[i4].f3hp--;
                        if (AtkData[i4].f3hp == 0) {
                            callBackExe(9, AtkData[i4].char_no, i4);
                        }
                        i5 = i4 + GameStatus.PlayerData.DBG_POWER_MAX;
                    }
                }
            }
            i2 = i5;
            i3 = i4 + 1;
        }
    }

    public static void attackCtrl() {
        boolean z;
        int i;
        if (comboStartTime > 0) {
            int i2 = comboStartTime - 1;
            comboStartTime = i2;
            if (i2 == 0) {
                resetRC();
            }
        }
        if (effectTimer > 0) {
            effectTimer--;
        }
        if (kealWait > 0) {
            kealWait--;
        }
        if (cameraShakeTimer > 0) {
            int i3 = cameraShakeTimer - 1;
            cameraShakeTimer = i3;
            if (i3 == 0) {
                CameraData.shake = false;
            }
        }
        tcCtrl();
        for (int i4 = 0; i4 < AtkData.length; i4++) {
            if (AtkData[i4].use && (!GameStatus.EXTRA.isCheatMode(1) || AtkData[i4].char_no == 0)) {
                float f = 1.0f;
                if (AtkData[i4].char_no >= 0 && AtkData[i4].motionSync) {
                    f = Character.charData[AtkData[i4].char_no].motionSpd;
                }
                int i5 = ((int) (AtkData[i4].cur + f)) - ((int) AtkData[i4].cur);
                if (AtkData[i4].startFrame > 0) {
                    short s = AtkData[i4].startFrame;
                    AtkData[i4].startFrame = (short) 0;
                    z = true;
                    i = s;
                } else {
                    z = false;
                    i = i5;
                }
                if (i == 0) {
                    AtkData[i4].cur += f;
                }
                for (int i6 = 0; i6 < i && AtkData[i4].use; i6++) {
                    if (AtkData[i4].cur >= AtkInfo[AtkData[i4].gidIndex >> 16][AtkData[i4].gidIndex & 65535].script[getFuncId(6, AtkData[i4].gidIndex, AtkData[i4].objNo)].length) {
                        attackAction(i4, getFuncBlock(5, AtkData[i4].gidIndex, AtkData[i4].objNo, 0));
                        freeAttackData(i4);
                    } else if (AtkData[i4].checkMotion < 0 || (((AtkData[i4].checkMotion >> 16) != 0 || AtkData[i4].charData.motion == (AtkData[i4].checkMotion & 65535)) && !((AtkData[i4].checkMotion >> 16) == 1 && AtkData[i4].charData.motion == (AtkData[i4].checkMotion & 65535)))) {
                        _pos_org[0] = AtkData[i4].f69x;
                        _pos_org[1] = AtkData[i4].f70y;
                        _pos_org[2] = AtkData[i4].f71z;
                        if (AtkData[i4].wait == 0) {
                            attackAction(i4, getFuncBlock(6, AtkData[i4].gidIndex, AtkData[i4].objNo, (int) AtkData[i4].cur));
                        }
                        if (attackHit(i4, AtkData[i4].f69x, AtkData[i4].f70y, AtkData[i4].f71z) < 0 && AtkData[i4].use && AtkData[i4].separate && (Math.abs(_pos_org[0] - AtkData[i4].f69x) + Math.abs(_pos_org[2] - AtkData[i4].f71z) > AtkInfo[AtkData[i4].gidIndex >> 16][AtkData[i4].gidIndex & 65535].f8r || Math.abs(_pos_org[1] - AtkData[i4].f70y) > AtkInfo[AtkData[i4].gidIndex >> 16][AtkData[i4].gidIndex & 65535].f7h)) {
                            float f2 = (AtkData[i4].f69x - _pos_org[0]) / 8;
                            float f3 = (AtkData[i4].f70y - _pos_org[1]) / 8;
                            float f4 = (AtkData[i4].f71z - _pos_org[2]) / 8;
                            for (int i7 = 8; i7 > 0 && attackHit(i4, _pos_org[0] + (i7 * f2), _pos_org[1] + (i7 * f3), _pos_org[2] + (i7 * f4)) < 0; i7--) {
                            }
                        }
                    } else {
                        attackAction(i4, getFuncBlock(4, AtkData[i4].gidIndex, AtkData[i4].objNo, 0));
                    }
                    if (AtkData[i4].wait > 0) {
                        AtkData[i4].wait--;
                    }
                    if (AtkData[i4].wait == 0) {
                        AtkData[i4].curBack = AtkData[i4].cur;
                        if (z) {
                            AtkData[i4].cur += 1.0f;
                        } else {
                            AtkData[i4].cur += f / i;
                        }
                    }
                }
                AttackData attackData = AtkData[i4];
                attackData.time = f + attackData.time;
            }
        }
    }

    public static int attackDataGetByte(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            int i6 = i3;
            if (i5 >= AtkData.length) {
                bArr[i] = (byte) i6;
                return i4;
            }
            if (AtkData[i5].use && AtkData[i5].char_no == i2) {
                Util.short2byte(bArr, i4, (short) AtkData[i5].groupNo);
                int i7 = i4 + 2;
                Util.int2byte(bArr, i7, AtkInfo[AtkData[i5].gidIndex >> 16][AtkData[i5].gidIndex & 65535].gid);
                int i8 = i7 + 4;
                int i9 = i8 + 1;
                bArr[i8] = (byte) AtkData[i5].objNo;
                Util.float2byte(bArr, i9, AtkData[i5].f4sx);
                int i10 = i9 + 2;
                Util.float2byte(bArr, i10, AtkData[i5].f5sy);
                int i11 = i10 + 2;
                Util.float2byte(bArr, i11, AtkData[i5].f6sz);
                int i12 = i11 + 2;
                Util.float2byte(bArr, i12, AtkData[i5].sdir);
                int i13 = i12 + 2;
                Util.float2byte(bArr, i13, AtkData[i5].cur);
                int i14 = i13 + 2;
                Util.short2byte(bArr, i14, AtkData[i5].piyoriHosei);
                int i15 = i14 + 2;
                Util.short2byte(bArr, i15, AtkData[i5].comboHosei);
                i4 = i15 + 2;
                i6++;
            }
            i3 = i6;
            i5++;
        }
    }

    public static int attackDataSetByte(byte[] bArr, int i, int i2) {
        boolean z;
        int i3 = i + 1;
        byte b = bArr[i];
        int i4 = 0;
        while (i4 < b) {
            short sByte2short = Util.byte2short(bArr, i3);
            int i5 = i3 + 2;
            short s = Character.charData[i2].type == 2 ? (short) (sByte2short + (i2 * 100)) : (short) -1;
            int iByte2int = Util.byte2int(bArr, i5);
            int i6 = i5 + 4;
            int i7 = i6 + 1;
            byte b2 = bArr[i6];
            float fByte2float = Util.byte2float(bArr, i7);
            int i8 = i7 + 2;
            float fByte2float2 = Util.byte2float(bArr, i8);
            int i9 = i8 + 2;
            float fByte2float3 = Util.byte2float(bArr, i9);
            int i10 = i9 + 2;
            float fByte2float4 = Util.byte2float(bArr, i10);
            int i11 = i10 + 2;
            float fByte2float5 = Util.byte2float(bArr, i11);
            int i12 = i11 + 2;
            short sByte2short2 = Util.byte2short(bArr, i12);
            int i13 = i12 + 2;
            short sByte2short3 = Util.byte2short(bArr, i13);
            int i14 = i13 + 2;
            int i15 = 0;
            while (true) {
                if (i15 >= AtkData.length) {
                    z = false;
                    break;
                }
                if (AtkData[i15].use && ((s < 0 || AtkData[i15].groupNo == s) && AtkInfo[AtkData[i15].gidIndex >> 16][AtkData[i15].gidIndex & 65535].gid == iByte2int && AtkData[i15].objNo == b2 && AtkData[i15].char_no == i2)) {
                    z = true;
                    break;
                }
                i15++;
            }
            if (!z) {
                setAttackSkip(iByte2int, i2, Character.charData[i2].targetChar, fByte2float, fByte2float2, fByte2float3, fByte2float4, sByte2short3, sByte2short2, (int) fByte2float5, s);
            }
            i4++;
            i3 = i14;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x04c8  */
    private static int attackHit(int i, float f, float f2, float f3) {
        int iAttackAttack;
        long levelStatus;
        int charsLen2;
        if (AtkData[i].atkFlag == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < AtkData[i].hitChar_no.length; i2++) {
            AtkData[i].hitChar_no[i2] = -1;
        }
        if (AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].power >= 0) {
            boolean z = ((AtkData[i].atkFlag >> 1) & 1) == 1 && f2gm.InvasionAttack(AtkData[i].char_no, i, f, f2, f3, (AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].f8r * ((float) AtkData[i].rangeMag)) / 100.0f, (AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].f7h * ((float) AtkData[i].rangeMag)) / 100.0f, false, AtkData[i].separate).size() > 0;
            if ((AtkData[i].atkFlag & 1) != 1) {
                iAttackAttack = -1;
            } else {
                boolean z2 = ((AtkData[i].atkFlag >> 2) & 1) != 0;
                if (AtkData[i].char_no < 0) {
                    levelStatus = (int) ((((GameStatus.PLAYER.getLevelStatus(1) / 3.0f) * (GameStatus.PLAYER.getLevelStatus(1) / 3.0f)) * AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].power) / 100.0f);
                } else if (AtkData[i].magicPow >= 0) {
                    levelStatus = (((GameStatus.PLAYER.getLevelStatus(1) + AtkData[i].magicPow) * (GameStatus.PLAYER.getLevelStatus(1) + AtkData[i].magicPow)) * AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].power) / 100;
                    if ((AtkData[i].magicPow >> 16) > 0) {
                        levelStatus = ((long) AtkData[i].magicPow) << 16;
                    }
                } else {
                    levelStatus = ((Character.charData[AtkData[i].char_no].attackPow * AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].power) / 100) * ((Character.charData[AtkData[i].char_no].attackPow * AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].power) / 100);
                    if (AtkData[i].char_no == 0) {
                        Game game = f2gm;
                        if (Game.isPinch(AtkData[i].char_no) && GameStatus.GAME.extCommand == 0) {
                            int abilityEff = GameStatus.PLAYER.isFlg(13, 21) ? 0 - GameStatus.PLAYER.getAbilityEff(0, 21) : 0;
                            if (GameStatus.PLAYER.isFlg(13, 22)) {
                                abilityEff += GameStatus.PLAYER.getAbilityEff(0, 22);
                            }
                            if (abilityEff != 0) {
                                levelStatus += (((long) abilityEff) * levelStatus) / 100;
                            }
                        }
                    }
                }
                Vector vectorAttackChar = AttackChar(AtkData[i].char_no, i, AtkData[i].attribute, levelStatus, AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].dwnspd, AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].dwnDirType, f, f2, f3, (AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].f8r * AtkData[i].rangeMag) / 100.0f, (AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].f7h * AtkData[i].rangeMag) / 100.0f, (AtkInfo[AtkData[i].gidIndex >> 16][AtkData[i].gidIndex & 65535].f8r * AtkData[i].rangeMag) / 100.0f, AtkData[i].dir, false, isRC() ? true : z2);
                if (vectorAttackChar == null) {
                    attackAction(i, getFuncBlock(5, AtkData[i].gidIndex, AtkData[i].objNo, 0));
                    freeAttackData(i);
                    return -1;
                }
                if (vectorAttackChar.size() > 0) {
                    int i3 = 0;
                    int i4 = Integer.MAX_VALUE;
                    int i5 = 0;
                    while (true) {
                        int i6 = i5;
                        if (i6 >= AtkData[i].hitChar_no.length || i6 >= vectorAttackChar.size()) {
                            break;
                        }
                        AtkData[i].hitChar_no[i6] = Util.s2i((String) vectorAttackChar.elementAt(i6));
                        int i7 = isTC() ? tcCharNo : AtkData[i].char_no;
                        if (i7 >= 0 && (charsLen2 = Character.getCharsLen2(i7, AtkData[i].hitChar_no[i6])) < i4) {
                            i3 = AtkData[i].hitChar_no[i6];
                            i4 = charsLen2;
                        }
                        i5 = i6 + 1;
                    }
                    iAttackAttack = i3;
                } else {
                    iAttackAttack = -1;
                }
            }
            if (iAttackAttack < 0 && z) {
                iAttackAttack = 1000;
            }
            if (iAttackAttack < 0 && ((AtkData[i].atkFlag >> 3) & 1) == 1) {
                iAttackAttack = attackAttack(i, false);
            }
        } else {
            iAttackAttack = -1;
        }
        if (iAttackAttack < 0) {
            if (AtkData[i].isRefrect) {
                callBackExe(7, AtkData[i].char_no, i);
                AtkData[i].isRefrect = false;
            }
            return iAttackAttack;
        }
        AtkData[i].isRefrect = false;
        AtkData[i].isHit = true;
        if (AtkData[i].char_no == 0 && iAttackAttack < 1000 && isRC()) {
            Character.charData[iAttackAttack].flinchCnt = (short) 0;
            if (comboTarget < 0 || iAttackAttack != ((comboTarget >> 16) & 65535)) {
                comboTarget = (iAttackAttack << 16) + 1;
            } else {
                comboTarget++;
            }
            comboTime = 18;
            if (Util.randomFix(0, 99) < (GameStatus.PLAYER.isFlg(13, 6) ? 40 + GameStatus.PLAYER.getAbilityEff(0, 6) : 40)) {
                comboBonusGet(iAttackAttack);
            }
        }
        if (iAttackAttack < 1000 && AtkData[i].char_no >= 0 && ((AtkData[i].char_no == 0 || Character.charData[AtkData[i].char_no].charId == 1054) && Character.charData[iAttackAttack].spd > 0.0f && !Character.charData[iAttackAttack].getBitState(268435456) && AtkData[i].liftSpd != 0.0f && Character.charData[iAttackAttack].position == 0)) {
            if (AtkData[i].liftSpd > 0.0f && !Character.charData[iAttackAttack].getBitState(4)) {
                Character.setJmpSpd(iAttackAttack, 10.0f);
                Character.charData[iAttackAttack].setBitState(4, true);
                Character.charData[iAttackAttack].setBitState(64, true);
            } else if (AtkData[i].liftSpd < 0.0f && Character.charData[iAttackAttack].getBitState(4)) {
                Character.charData[iAttackAttack].jmpSpd = AtkData[i].liftSpd;
                Character.charData[iAttackAttack].setBitState(64, true);
            }
        }
        attackAction(i, getFuncBlock(1, AtkData[i].gidIndex, AtkData[i].objNo, 0));
        return iAttackAttack;
    }

    public static boolean attrEneCheck(int i, int i2) {
        return attrEneCheck(i, i2, false);
    }

    public static boolean attrEneCheck(int i, int i2, boolean z) {
        if (i2 == 0 && i == 1) {
            return true;
        }
        if (i2 == 1 && i == 0) {
            return true;
        }
        return (i2 == 1 && i == 9) || i2 == 9;
    }

    public static void battleCancel() {
        battleCancel(true, true);
    }

    public static void battleCancel(boolean z, boolean z2) {
        if (comboRank > 0 && comboBonusDrawTime < 0) {
            comboBonusDrawTime = -1;
            comboRank = 0;
            bonusBak = 0;
        }
        comboBonusDrawTime = -1;
        if (isRC()) {
            comboStop = true;
        }
        comboDrawTime = 0;
        comboNum = 0;
        comboStartTime = 0;
        comboInputDrawTime = 0;
        comboWait = 0;
        comboTarget = -1;
        comboInput = false;
        if (tcDrawTime > 0 && Character.charData != null) {
            Character.charData[0].setBitState(1024, false);
            Character.charData[0].alpha = (short) 255;
            if (Action.extBindCharNo[0] > 0) {
                Character.charData[Action.extBindCharNo[0]].setBitState(1024, false);
                Character.charData[Action.extBindCharNo[0]].alpha = (short) 255;
            }
            if (Action.extBindCharNo[1] > 0) {
                Character.charData[Action.extBindCharNo[1]].setBitState(1024, false);
                Character.charData[Action.extBindCharNo[1]].alpha = (short) 255;
            }
        }
        tcDrawTime = 0;
        for (int i = 0; i < RCInputData.length; i++) {
            RCDataClear(i);
        }
        if (z2 && Character.charData != null) {
            Character.charData[0].atkCnt = (short) 0;
            Character.charData[0].setBitState(4, false);
            Character.motionSet(0, 0);
        }
        Game.comboCheck = true;
        GameStatus.PLAYER.setNumberData(36, 0);
        GameStatus.PLAYER.setNumberData(37, 0);
        hitMove = 0;
        if (Character.charData != null) {
            for (int i2 = 0; i2 < Character.charData.length; i2++) {
                freeCharAttack(i2, z);
            }
        }
        if (z) {
            freeAllAttackData();
        }
        resetHoming();
    }

    public static void callBackExe(int i, int i2, int i3) {
        if (GameCommon.DEBUG_STATUS[17] >= 2) {
        }
        if (i3 >= 0) {
            if (AtkData[i3].use) {
                attackAction(i3, getFuncBlock(i, AtkData[i3].gidIndex, AtkData[i3].objNo, 0));
            }
        } else {
            for (int i4 = 0; i4 < AtkData.length; i4++) {
                if (AtkData[i4].use && AtkData[i4].char_no == i2) {
                    attackAction(i4, getFuncBlock(i, AtkData[i4].gidIndex, AtkData[i4].objNo, 0));
                }
            }
        }
    }

    public static boolean canNC(int i) {
        for (int i2 = 0; i2 < AtkData.length; i2++) {
            if (AtkData[i2].use && AtkData[i2].char_no == i && AtkData[i2].isHit) {
                return true;
            }
        }
        return false;
    }

    public static boolean canTC() {
        return isTCGaugeView() && GameStatus.GAME.trinityPower == 100 && Character.charData[Action.extBindCharNo[0]].f12hp > 0 && Character.charData[Action.extBindCharNo[1]].f12hp > 0 && !((!tcBattleCheck(Action.extBindCharNo[0]) && !tcBattleCheck(Action.extBindCharNo[1])) || isRC() || isRCDisp() || isStartRC() || comboStop);
    }

    /* JADX WARN: Code duplicated, block: B:351:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:353:0x0901 A[PHI: r10
  0x0901: PHI (r10v12 long) = (r10v11 long), (r10v13 long) binds: [B:306:0x07d8, B:308:0x07e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:355:0x0907  */
    /* JADX WARN: Code duplicated, block: B:360:0x0917  */
    public static int charDmgSet(int i, long j, int i2, boolean z, boolean z2) {
        int i3;
        long jAbs;
        boolean z3;
        float f;
        long j2;
        long j3;
        float f2;
        float f3;
        if ((j >> 32) > 0) {
            jAbs = (int) (((((long) Character.charData[i].maxHp) * (j >> 32)) / 100.0f) + 0.5f);
        } else if (j < 0) {
            jAbs = Math.abs(j);
        } else {
            long j4 = (i2 < 0 || AtkData[i2].comboHosei == 0) ? j : (((long) AtkData[i2].comboHosei) * j) / 100;
            short s = Character.charData[i].defense;
            if (s <= 0) {
                s = 1;
            }
            if (i == 0) {
                Game game = f2gm;
                if (Game.isPinch(i)) {
                    int abilityEff = GameStatus.PLAYER.isFlg(13, 21) ? 0 + GameStatus.PLAYER.getAbilityEff(0, 21) : 0;
                    if (GameStatus.PLAYER.isFlg(13, 22)) {
                        abilityEff -= GameStatus.PLAYER.getAbilityEff(0, 22);
                    }
                    if (abilityEff != 0) {
                        i3 = ((abilityEff * s) / 100) + s;
                    } else {
                        i3 = s;
                    }
                } else {
                    i3 = s;
                }
            } else {
                i3 = s;
            }
            jAbs = j4 / ((long) i3);
        }
        if (i == 0 && !z2) {
            Game game2 = f2gm;
            if (Game.isPinch(i) && GameStatus.PLAYER.isFlg(13, 23)) {
                jAbs = (jAbs * ((long) GameStatus.PLAYER.getAbilityEff(0, 23))) / 100;
            }
            if (Character.charData[i].f12hp > 1 && ((long) Character.charData[i].f12hp) - jAbs <= 0 && GameStatus.PLAYER.isFlg(13, 24) && jAbs <= Character.charData[i].f12hp * GameStatus.PLAYER.getAbilityEff(0, 24)) {
                jAbs = Character.charData[i].f12hp - 1;
            }
        }
        if (GameStatus.PLAYER.getNumberData(19) == 3) {
            if (jAbs == 0) {
                jAbs = 1;
            }
            if (GameStatus.PLAYER.getNumberData(19) == 3 && Character.charData[i].flinchTime > 0) {
                jAbs *= 2;
            }
        } else if (GameStatus.PLAYER.getNumberData(19) == 4) {
            Game game3 = f2gm;
            Util.deleteAll(Game.m_targetHarrier);
        }
        if (jAbs < Character.charData[i].minDmg) {
            jAbs = Character.charData[i].minDmg;
        }
        long j5 = GameStatus.EXTRA.isCheatMode(18) ? Character.charData[i].maxHp : jAbs;
        if (z2) {
            return (int) j5;
        }
        boolean z4 = false;
        if (i2 >= 0 && AtkData[i2].magicPow > 0) {
            magicHitCountUp();
        }
        if (GameStatus.EXTRA.isCheatMode(1) && (j >> 32) != 6) {
            f2gm.blizzardCountUp(i);
        }
        if (GameStatus.PLAYER.getNumberData(19) != 5) {
            if (isEnemy(i) && (i2 < 0 || (AtkData[i2].char_no >= 0 && !isEnemy(AtkData[i2].char_no) && AtkData[i2].magicPow < 0))) {
                int playerLv = 0;
                if (i2 >= 0) {
                    int i4 = 100 + (AtkData[i2].piyoriHosei & 255);
                    int i5 = Character.charData[i].level > 100 ? Character.charData[i].level - 100 : Character.charData[i].level;
                    Game game4 = f2gm;
                    playerLv = (((((Game.getPlayerLv() + 10) - i5) * i4) / 100) * AtkInfo[AtkData[i2].gidIndex >> 16][AtkData[i2].gidIndex & 65535].power) / 100;
                    if (z && GameStatus.PLAYER.getNumberData(19) != 3) {
                        playerLv *= 5;
                    }
                    if ((AtkData[i2].piyoriHosei >> 8) > 0 && Util.randomFix(0, 99) < (AtkData[i2].piyoriHosei >> 8)) {
                        playerLv = Character.charData[i].flinchCnt;
                    }
                    if (AtkData[i2].char_no == 0 && GameStatus.PLAYER.boolData[1]) {
                        GameStatus.PLAYER.boolData[1] = false;
                        GameStatus.PLAYER.setNumberData(37, 0);
                    }
                }
                if (Character.charData[i].flinchCntMax >= 0) {
                    Character.charData[i].flinchCnt = (short) Math.max(0, Character.charData[i].flinchCnt - playerLv);
                }
                if (Character.charData[i].flinchTime == 0 && Character.charData[i].flinchCntMax >= 0 && Character.charData[i].flinchCnt == 0) {
                    Character.charData[i].flinchTime = (short) 45;
                    freeCharAttack(i, false);
                    float f4 = Character.charData[i].ahWidth;
                    float f5 = Character.charData[i].ahHeight;
                    if (GameStatus.PLAYER.getNumberData(19) == 3 && i == Character.charData.length - 1) {
                        f4 = 5.0f;
                        f5 = 12.0f;
                    }
                    if (Character.charData[i].charId == 1028) {
                        f3 = Character.charData[i].width;
                        f2 = Character.charData[i].height;
                    } else {
                        f2 = f5;
                        f3 = f4;
                    }
                    int i6 = Effect.set(5, 0, Character.charData[i].ahX, Character.charData[i].ahY + f2, Character.charData[i].ahZ, f3, 0, -1, 0.0f, i + ID_EFFECT_PIYORI);
                    if (i6 >= 0) {
                        Effect.homingBind(i6, Character.charData[i], f2);
                    }
                    if (GameStatus.PLAYER.isFlg(13, 14) && ((i2 < 0 || AtkData[i2].char_no == 0) && ((!GameStatus.PLAYER.isBossStage() || GameStatus.PLAYER.getNumberData(20) == 5 || GameStatus.PLAYER.getNumberData(20) == 6 || GameStatus.PLAYER.getNumberData(20) == 7) && !isRC() && !isStartRC()))) {
                        comboStartSet(Util.dirTo8(Util.atan2_360(Character.charData[i].f69x - Character.charData[0].f69x, Character.charData[i].f71z - Character.charData[0].f71z) - CameraData.dirDelay) / 2);
                    }
                    z4 = true;
                }
                if (z4) {
                    float f6 = Character.charData[i].f69x;
                    float f7 = (Character.charData[i].height / 2.0f) + Character.charData[i].f70y;
                    float f8 = Character.charData[i].f71z;
                    if (i2 >= 0 && Character.charData[i].width + Character.charData[i].height + Character.charData[i].depth > 30.0f) {
                        f6 = AtkData[i2].f69x;
                        f7 = AtkData[i2].f70y;
                        f8 = AtkData[i2].f71z;
                    }
                    if (z4) {
                        Effect.set(0, 1, f6, f7, f8, 6.0f, 0, 0, 0.0f);
                    }
                }
            }
        } else if (i2 < 0 || (AtkData[i2].char_no >= 0 && AtkData[i2].magicPow < 0)) {
            int i7 = 0;
            if (i2 >= 0) {
                int i8 = 100 + (AtkData[i2].piyoriHosei & 255);
                int i9 = Character.charData[i].level > 100 ? Character.charData[i].level - 100 : Character.charData[i].level;
                Game game5 = f2gm;
                int playerLv2 = (((((Game.getPlayerLv() + 10) - i9) * i8) / 100) * AtkInfo[AtkData[i2].gidIndex >> 16][AtkData[i2].gidIndex & 65535].power) / 100;
                if (z && GameStatus.PLAYER.getNumberData(19) != 3) {
                    int i10 = playerLv2 * 5;
                }
                if ((AtkData[i2].piyoriHosei >> 8) > 0 && Util.randomFix(0, 99) < (AtkData[i2].piyoriHosei >> 8)) {
                    short s2 = Character.charData[i].flinchCnt;
                }
                if (AtkData[i2].char_no == 0 && GameStatus.PLAYER.boolData[1]) {
                    GameStatus.PLAYER.boolData[1] = false;
                    GameStatus.PLAYER.setNumberData(37, 0);
                }
                if (i > 2 && AtkData[i2].char_no == 0) {
                    Game game6 = f2gm;
                    if (Game.m_bossData[0] == 0) {
                        Game game7 = f2gm;
                        Game.m_bossData[14] = i;
                    }
                }
                i7 = (AtkData[i2].tempVal * i8) / 100;
                if (Character.charData[AtkData[i2].char_no].flinchTime > 0) {
                    i7 = 0;
                }
            }
            long jOBAttrDmg = f2gm.OBAttrDmg(AtkInfo[AtkData[i2].gidIndex >> 16][AtkData[i2].gidIndex & 65535].gid, i, (int) j5);
            if (Character.charData[i].motion == 48 || jOBAttrDmg == 0) {
                i7 = 0;
            }
            if (Character.charData[i].flinchCntMax >= 0) {
                Character.charData[i].flinchCnt = (short) Math.max(0, Character.charData[i].flinchCnt - i7);
            }
            if (Character.charData[i].flinchTime == 0 && Character.charData[i].flinchCntMax >= 0 && Character.charData[i].flinchCnt == 0) {
                Character.charData[i].flinchTime = (short) 45;
                freeCharAttack(i);
                float f9 = Character.charData[i].width;
                float f10 = Character.charData[i].height;
                if (GameStatus.PLAYER.getNumberData(19) == 3 && i == Character.charData.length - 1) {
                    f9 = 5.0f;
                    f = 12.0f;
                } else {
                    f = f10;
                }
                int i11 = Effect.set(5, 0, Character.charData[i].f69x, Character.charData[i].f70y + f, Character.charData[i].f71z, f9, 0, -1, 0.0f, i + ID_EFFECT_PIYORI);
                if (i11 >= 0) {
                    Effect.homingBind(i11, Character.charData[i], f);
                }
                if (GameStatus.PLAYER.isFlg(13, 14) && (!GameStatus.PLAYER.isBossStage() || GameStatus.PLAYER.getNumberData(20) == 5 || GameStatus.PLAYER.getNumberData(20) == 6 || GameStatus.PLAYER.getNumberData(20) == 7)) {
                    int i12 = GameStatus.PLAYER.getNumberData(19) == 3 ? 2000 : 200;
                    if (!isRC() && !isStartRC() && Character.getCharsLen2(0, i) < i12) {
                        int iDirTo8 = Util.dirTo8(Util.atan2_360(Character.charData[i].f69x - Character.charData[0].f69x, Character.charData[i].f71z - Character.charData[0].f71z) - CameraData.dirDelay) / 2;
                        byte[] bArr = RCInputData[4];
                        RCInputData[0][iDirTo8] = 1;
                        bArr[iDirTo8] = 1;
                        GameStatus.ExtraStatus extraStatus = GameStatus.EXTRA;
                        GameStatus.ExtraStatus extraStatus2 = GameStatus.EXTRA;
                        if (extraStatus.getParamFlag(3)) {
                            for (int i13 = 0; i13 < 4; i13++) {
                                RCInputData[0][i13] = 1;
                            }
                        }
                        comboStartTime = 45;
                        comboDrawTime = 5;
                        comboBonusDrawTime = -1;
                        Sound.play_se(0, 1, 10);
                        for (int i14 = 0; i14 < comboBonusCount.length; i14++) {
                            comboBonusCount[i14] = 0;
                        }
                    }
                }
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                float f11 = Character.charData[i].f69x;
                float f12 = (Character.charData[i].height / 2.0f) + Character.charData[i].f70y;
                float f13 = Character.charData[i].f71z;
                if (i2 >= 0 && Character.charData[i].width + Character.charData[i].height + Character.charData[i].depth > 30.0f) {
                    f11 = AtkData[i2].f69x;
                    f12 = AtkData[i2].f70y;
                    f13 = AtkData[i2].f71z;
                }
                if (z3) {
                    Effect.set(0, 1, f11, f12, f13, 6.0f, 0, 0, 0.0f);
                }
            }
        }
        if (Character.checkHaveMotion(i, 2) && !Character.charData[i].getBitState(33554432)) {
            if (GameStatus.PLAYER.getNumberData(19) != 5) {
                Character.motionSet(i, 0);
            }
            if (Character.charData[i].getBitState(4)) {
                Character.motionSet(i, 15);
            } else if (GameStatus.PLAYER.getNumberData(19) == 5) {
                int i15 = (int) j5;
                Game game8 = f2gm;
                if (Game.m_bossData[0] == 2) {
                    long jOBAttrDmg2 = f2gm.OBAttrDmg(AtkInfo[AtkData[i2].gidIndex >> 16][AtkData[i2].gidIndex & 65535].gid, i, (int) j5);
                    if (i < 3) {
                        Game game9 = f2gm;
                        if (Game.m_bossData[9] >= 10) {
                            Game game10 = f2gm;
                            j3 = jOBAttrDmg2 * ((long) (Game.m_bossData[9] / 10));
                        } else {
                            j3 = jOBAttrDmg2;
                        }
                    } else {
                        j3 = jOBAttrDmg2;
                    }
                    if (Character.charData[i].motion == 48) {
                        Character.charData[i].f69x += 2.0f;
                        if (j3 > 0) {
                            j3 /= 2;
                            if (j3 == 0) {
                                j5 = 1;
                            } else {
                                j5 = j3;
                            }
                        } else {
                            j5 = j3;
                        }
                    } else if (j3 > 0) {
                        Character.motionSet(i, 46);
                        j5 = j3;
                    } else {
                        Effect.set(0, 8, (i < 3 ? -5.0f : 5.0f) + Character.charData[i].f69x, Character.charData[i].f70y + 4.0f, Character.charData[i].f71z, 3.0f, 0, 0, 270.0f);
                        Sound.play_se(0, 1, 22);
                        j5 = j3;
                    }
                } else {
                    Character.motionSet(i, 46);
                }
                if (i15 != j5) {
                }
            } else {
                Character.motionSet(i, 2);
            }
        } else if (GameStatus.PLAYER.getNumberData(19) == 5) {
            int i16 = (int) j5;
            Game game11 = f2gm;
            if (Game.m_bossData[0] == 2) {
                long jOBAttrDmg3 = f2gm.OBAttrDmg(AtkInfo[AtkData[i2].gidIndex >> 16][AtkData[i2].gidIndex & 65535].gid, i, (int) j5);
                if (i < 3) {
                    Game game12 = f2gm;
                    if (Game.m_bossData[9] >= 10) {
                        Game game13 = f2gm;
                        j2 = jOBAttrDmg3 * ((long) (Game.m_bossData[9] / 10));
                    } else {
                        j2 = jOBAttrDmg3;
                    }
                } else {
                    j2 = jOBAttrDmg3;
                }
                if (Character.charData[i].motion == 48) {
                    Character.charData[i].f69x += 2.0f;
                    if (j2 > 0) {
                        j2 /= 2;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                    }
                } else if (j2 <= 0) {
                    Effect.set(0, 8, (i < 3 ? -2 : 2) + Character.charData[i].f69x, Character.charData[i].f70y + 4.0f, Character.charData[i].f71z, 3.0f, 0, 0, 270.0f);
                    Sound.play_se(0, 1, 22);
                }
            } else {
                j2 = j5;
            }
            if (i16 != j2) {
            }
            j5 = j2;
        }
        Character.dmg(i, (int) j5);
        if (GameStatus.PLAYER.getNumberData(19) == 5) {
            Game game14 = f2gm;
            if (Game.m_bossData[0] == 0) {
                Character.charData[i].invCnt = (short) (i == GameStatus.GAME.ctlCharNo ? 20 : 3);
            }
        } else if (!GameStatus.EXTRA.isCheatMode(1)) {
            Character.charData[i].invCnt = (short) (Character.charData[i].type == 1 ? 20 : 3);
            if (i == 0 && i2 >= 0 && AtkInfo[AtkData[i2].gidIndex >> 16][AtkData[i2].gidIndex & 65535].gid == 10304) {
                Character.charData[i].invCnt = COMBO_WAIT_DEFAULT;
            }
        }
        if (Character.charData[i].f12hp == 0 && Character.charData[i].getBitState(65536)) {
            Character.charData[i].f12hp = (short) 1;
        }
        if (i == 0 && GameStatus.PLAYER.getNumberData(19) != 5) {
            if (isRC() && !isTC()) {
                resetRC();
            }
            Sound.play_se(0, 1, 21);
        }
        return (int) j5;
    }

    public static Vector checkAttack(int i, int i2, CharData charData, float f, int i3) {
        int idIndex = getIdIndex(i);
        if (AtkInfo[idIndex >> 16][65535 & idIndex].checkR < 0.0f) {
            return null;
        }
        float[] fArrRelativeChange = relativeChange(f, AtkInfo[idIndex >> 16][65535 & idIndex].checkOfsX, AtkInfo[idIndex >> 16][65535 & idIndex].checkOfsZ, charData.drawType, false);
        return AttackChar(i2, -1, i3 >= 0 ? i3 : AtkInfo[idIndex >> 16][65535 & idIndex].attribute, 1L, 0.0f, 1, charData.f69x + fArrRelativeChange[0], charData.f70y + AtkInfo[idIndex >> 16][65535 & idIndex].checkOfsY, charData.f71z + fArrRelativeChange[1], AtkInfo[idIndex >> 16][65535 & idIndex].checkR, AtkInfo[idIndex >> 16][65535 & idIndex].checkH, AtkInfo[idIndex >> 16][idIndex & 65535].checkR, f, true, false);
    }

    public static boolean checkAttack(int i, int i2, CharData charData, float f) {
        Vector vectorCheckAttack = checkAttack(i, i2, charData, f, -1);
        return vectorCheckAttack != null && vectorCheckAttack.size() > 0;
    }

    public static boolean checkAttackBlockNo(int i, int i2, CharData charData, int i3) {
        int idIndex = getIdIndex(i);
        if (AtkInfo[idIndex >> 16][idIndex & 65535].checkR < 0.0f) {
            return false;
        }
        float[] fArrRelativeChange = relativeChange(charData.dir, AtkInfo[idIndex >> 16][idIndex & 65535].checkOfsX, AtkInfo[idIndex >> 16][idIndex & 65535].checkOfsZ, charData.drawType, false);
        Vector vectorInvasionAttack = f2gm.InvasionAttack(i2, -1, fArrRelativeChange[0] + charData.f69x, AtkInfo[idIndex >> 16][idIndex & 65535].checkOfsY + charData.f70y, charData.f71z + fArrRelativeChange[1], AtkInfo[idIndex >> 16][idIndex & 65535].checkR, AtkInfo[idIndex >> 16][idIndex & 65535].checkH, true, false);
        for (int i4 = 0; i4 < vectorInvasionAttack.size(); i4++) {
            if (Util.s2i((String) vectorInvasionAttack.elementAt(i4)) == i3) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHaveAttackId(int i, int i2) {
        int charIndex = Character.getCharIndex(Character.charData[i].charId);
        if (charIndex < 0) {
            return false;
        }
        for (int i3 = 0; i3 < AtkInfo[charIndex].length; i3++) {
            if (AtkInfo[charIndex][i3].gid == i2) {
                return true;
            }
        }
        return false;
    }

    public static void checkNearAttackTarget(int i, int i2, int i3, int i4) {
        Character.charData[i].targetChar = (byte) -1;
        for (int i5 = 0; i5 < _CNO_.length; i5++) {
            for (int i6 = 0; i6 < _CNO_[i5].length; i6++) {
                _CNO_[i5][i6] = -1.0f;
                if (i6 == 3) {
                    _CNO_[i5][i6] = 99999.0f;
                }
            }
        }
        int nearEneCharDir = Character.getNearEneCharDir(i, i2);
        int iCheckNearEneAttack = checkNearEneAttack(i, i3);
        int iNearBlockCheck = MapData.nearBlockCheck(Character.charData[i], i4, 180, Character.charData[i].getBitState(4) ? 6.0f : 3.9f);
        if (nearEneCharDir >= 0) {
            Character.charData[i].targetChar = (byte) nearEneCharDir;
            _CNO_[0][0] = 0.0f;
            _CNO_[0][1] = nearEneCharDir;
            _CNO_[0][2] = Character.getCharsDir(i, Character.charData[i].targetChar);
            float fAbs = Math.abs(Util.DiffDir(Character.charData[i].dir, _CNO_[0][2]));
            float[] fArr = _CNO_[0];
            if (fAbs == 0.0f) {
                fAbs = 1.0f;
            }
            fArr[3] = fAbs * Character.getCharsLen2_P2B(i, Character.charData[i].targetChar);
        }
        if (iCheckNearEneAttack >= 0) {
            _CNO_[1][0] = 1.0f;
            _CNO_[1][1] = iCheckNearEneAttack;
            _CNO_[1][2] = Util.atan2_360(targetAttack.f69x - Character.charData[i].f69x, targetAttack.f71z - Character.charData[i].f71z);
            float fAbs2 = Math.abs(Util.DiffDir(Character.charData[i].dir, _CNO_[1][2]));
            _CNO_[1][3] = Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, targetAttack.f69x, targetAttack.f70y, targetAttack.f71z) * (fAbs2 == 0.0f ? 1.0f : fAbs2);
        }
        if (iNearBlockCheck >= 0) {
            _CNO_[2][0] = 2.0f;
            _CNO_[2][1] = iNearBlockCheck;
            _CNO_[2][2] = Util.atan2_360(MapData.bugBlock[iNearBlockCheck].f69x - Character.charData[i].f69x, MapData.bugBlock[iNearBlockCheck].f71z - Character.charData[i].f71z);
            float fAbs3 = Math.abs(Util.DiffDir(Character.charData[i].dir, _CNO_[2][2]));
            _CNO_[2][3] = Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, MapData.bugBlock[iNearBlockCheck].f69x, MapData.bugBlock[iNearBlockCheck].f70y, MapData.bugBlock[iNearBlockCheck].f71z) * (fAbs3 == 0.0f ? 1.0f : fAbs3);
        }
        if (_CNO_[0][0] >= 0.0f || _CNO_[1][0] >= 0.0f || _CNO_[2][0] >= 0.0f) {
            char c = 0;
            if (_CNO_[1][3] <= _CNO_[0][3] && _CNO_[1][3] <= _CNO_[2][3]) {
                Character.charData[i].targetChar = (byte) -1;
                c = 1;
            } else if (_CNO_[2][3] < _CNO_[0][3] && _CNO_[2][3] < _CNO_[1][3]) {
                c = 2;
            }
            for (int i7 = 0; i7 < _CNO_[c].length; i7++) {
                _CNO_[3][i7] = _CNO_[c][i7];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0103  */
    public static int checkNearEneAttack(int i, int i2) {
        int i3;
        int i4 = -1;
        targetAttackLen2 = -1;
        targetAttack = null;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            i3 = i4;
            int i8 = i5;
            if (i7 >= AtkData.length) {
                break;
            }
            if (AtkData[i7].use && AtkData[i7].disp && AtkData[i7].f3hp > 0 && AtkData[i7].atkFlag != 0 && attrEneCheck(AtkData[i7].attribute, Character.charData[i].type)) {
                float f = (AtkInfo[AtkData[i7].gidIndex >> 16][AtkData[i7].gidIndex & 65535].f8r * AtkData[i7].rangeMag) / 100.0f;
                float f2 = (AtkInfo[AtkData[i7].gidIndex >> 16][AtkData[i7].gidIndex & 65535].f7h * AtkData[i7].rangeMag) / 100.0f;
                int iLenP2B = (int) Util.lenP2B(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, AtkData[i7].f69x, AtkData[i7].f70y - (f2 / 2.0f), AtkData[i7].f71z, f, f2, f);
                int iAbs = (int) Math.abs(Util.DiffDir(Character.charData[i].dir, Util.atan2_360(AtkData[i7].f69x - Character.charData[i].f69x, AtkData[i7].f71z - Character.charData[i].f71z)));
                if (iAbs == 0) {
                    iAbs = 1;
                }
                i5 = iLenP2B * iAbs;
                if (iLenP2B >= i2 || i8 <= i5) {
                    i4 = i3;
                    i5 = i8;
                } else {
                    targetAttackLen2 = iLenP2B;
                    i4 = i7;
                }
            } else {
                i4 = i3;
                i5 = i8;
            }
            i6 = i7 + 1;
        }
        if (i3 >= 0) {
            targetAttack = AtkData[i3];
        }
        return i3;
    }

    public static float checkNearObject(int i, int i2, int i3) {
        float distance;
        float fAtan2_360;
        float f;
        float distance2 = 0.0f;
        int iNearBlockCheck = MapData.nearBlockCheck(Character.charData[i], i2);
        if (iNearBlockCheck >= 0) {
            fAtan2_360 = Util.atan2_360(MapData.bugBlock[iNearBlockCheck].f69x - Character.charData[i].f69x, MapData.bugBlock[iNearBlockCheck].f71z - Character.charData[i].f71z);
            float fAbs = Math.abs(Util.DiffDir(Character.charData[i].dir, fAtan2_360));
            distance = Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, MapData.bugBlock[iNearBlockCheck].f69x, MapData.bugBlock[iNearBlockCheck].f70y, MapData.bugBlock[iNearBlockCheck].f71z) * (fAbs == 0.0f ? 1.0f : fAbs);
        } else {
            distance = 0.0f;
            fAtan2_360 = 65535.0f;
        }
        if (Character.charData[i].targetChar >= 0 && i3 >= Character.getCharsLen2_P2B(i, Character.charData[i].targetChar)) {
            float charsDir = Character.getCharsDir(i, Character.charData[i].targetChar);
            float fAbs2 = Math.abs(Util.DiffDir(Character.charData[i].dir, charsDir));
            distance2 = (fAbs2 != 0.0f ? fAbs2 : 1.0f) * Character.getCharsLen2_P2B(i, Character.charData[i].targetChar);
            f = charsDir;
        } else if (targetAttack == null || targetAttackLen2 <= 0) {
            f = 65535.0f;
        } else {
            float fAtan2_361 = Util.atan2_360(targetAttack.f69x - Character.charData[i].f69x, targetAttack.f71z - Character.charData[i].f71z);
            float fAbs3 = Math.abs(Util.DiffDir(Character.charData[i].dir, fAtan2_361));
            distance2 = (fAbs3 != 0.0f ? fAbs3 : 1.0f) * Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, targetAttack.f69x, targetAttack.f70y, targetAttack.f71z);
            f = fAtan2_361;
        }
        if (fAtan2_360 == 65535.0f && f == 65535.0f) {
            return 65535.0f;
        }
        if (fAtan2_360 == 65535.0f || f != 65535.0f) {
            return ((fAtan2_360 != 65535.0f || f == 65535.0f) && distance < distance2) ? fAtan2_360 : f;
        }
        return fAtan2_360;
    }

    private static boolean checkRankUp(int i, boolean z) {
        return i == 3 && RCInputData[1][4] == 0 && RCInputData[2][4] == 0 && comboRank < 12 && (z || Util.randomFix(0, 99) < getRankUpPer());
    }

    private static void comboBonusGet(int i) {
        if (comboRank <= 0) {
            return;
        }
        Game game = f2gm;
        if (Game.isGetItemNow()) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        float[][] dropItem = Item.getDropItem((comboRank - 1) + 10);
        if (dropItem[0][0] >= 0.0f) {
            f2gm.setPrizeEffect(6, Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, 1, 3.0f, -1);
            Game game2 = f2gm;
            Game.getPrizeItem((int) dropItem[0][0], (int) dropItem[0][1], 36, 2);
            short[] sArr = comboBonusCount;
            int i2 = comboRank - 1;
            sArr[i2] = (short) (sArr[i2] + 1);
        }
    }

    public static void comboStartSet(int i) {
        byte[] bArr = RCInputData[4];
        RCInputData[0][i] = 1;
        bArr[i] = 1;
        GameStatus.ExtraStatus extraStatus = GameStatus.EXTRA;
        GameStatus.ExtraStatus extraStatus2 = GameStatus.EXTRA;
        if (extraStatus.getParamFlag(3)) {
            for (int i2 = 0; i2 < 4; i2++) {
                RCInputData[0][i2] = 1;
            }
        }
        comboStartTime = 45;
        comboDrawTime = 5;
        comboBonusDrawTime = -1;
        Sound.play_se(0, 1, 10);
        for (int i3 = 0; i3 < comboBonusCount.length; i3++) {
            comboBonusCount[i3] = 0;
        }
    }

    public static boolean counterStateCheck(int i) {
        if (!Character.charData[i].getBitState(Appearance.LIGHTTWOSIDE)) {
            return false;
        }
        for (int i2 = 0; i2 < AtkData.length; i2++) {
            if (AtkData[i2].char_no == i && AtkData[i2].use && AtkData[i2].canCounter) {
                return true;
            }
        }
        return false;
    }

    public static void drawAttack2D() {
        float f;
        if (drawWait2D > 0) {
            drawWait2D--;
            return;
        }
        if (comboStop) {
            comboRankUp = 0;
            if (comboNum > 0) {
                comboDisp = false;
            }
            if (comboDrawTime != 0) {
                drawComboRim(comboDrawTime * 25);
                if (!GameStatus.GAME.gameStop) {
                    comboDrawTime--;
                }
            }
            if (comboDrawTime == 0) {
                comboStop = false;
                RCDataClear(0);
                RCDataClear(4);
            }
        } else {
            int i = isTCGaugeView() ? -20736 : -13241597;
            if (isRCDisp() || isStartRC()) {
                if (comboDrawTime != 0) {
                    if (!comboDisp) {
                        comboBonusDrawTime = 0;
                        comboRank = 0;
                    }
                    if (!GameStatus.GAME.gameStop) {
                        comboDrawTime--;
                    }
                    comboDisp = true;
                }
                drawComboRim(100);
                if (isStartRC()) {
                    int i2 = GameStatus.EXTRA.isCheatMode(13) ? 105 : 103;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= 4) {
                            break;
                        }
                        int i5 = 0;
                        while (true) {
                            int i6 = i5;
                            if (i6 < RCInputData[0][i4]) {
                                setDrawOffset(i4, i6 * 10);
                                DrawTexture.drawScaleColor(alwaysTexture, i2, (int) ((_base[i4][0] - ((alwaysTexture.getWidth(i2) * 1.0f) / 2.0f)) + _ofs[0]), (int) ((_base[i4][1] - ((alwaysTexture.getHeight(i2) * 1.0f) / 2.0f)) + _ofs[1]), (int) (alwaysTexture.getWidth(i2) * 1.0f), (int) (alwaysTexture.getHeight(i2) * 1.0f), _flip[i4], 255, (i >> 16) & 255, (i >> 8) & 255, i & 255);
                                i5 = i6 + 1;
                            }
                        }
                        i3 = i4 + 1;
                    }
                } else if (comboNum < GameStatus.PLAYER.getAbilityEff(0, 14)) {
                    if (comboWait > 0) {
                        if (!GameStatus.GAME.gameStop) {
                            comboWait--;
                        }
                        int i7 = GameStatus.EXTRA.isCheatMode(13) ? 105 : 103;
                        float f2 = 1.0f;
                        for (int i8 = 0; i8 < COMBO_WAIT_MAX - comboWait; i8++) {
                            f2 *= 1.2f;
                        }
                        int i9 = 0;
                        float f3 = f2;
                        while (i9 < 4) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                if (i11 >= RCInputData[1][i9]) {
                                    break;
                                }
                                if (2 <= comboWait) {
                                    setDrawOffset(i9, i11 * 20);
                                    alwaysTexture.setBlendMode(99, 1);
                                    DrawTexture.drawScaleColor(alwaysTexture, i7, (int) ((_base[i9][0] - ((alwaysTexture.getWidth(i7) * f3) / 2.0f)) + _ofs[0]), (int) ((_base[i9][1] - ((alwaysTexture.getHeight(i7) * f3) / 2.0f)) + _ofs[1]), (int) (alwaysTexture.getWidth(i7) * f3), (int) (alwaysTexture.getHeight(i7) * f3), _flip[i9], Math.max(0, 255 - ((COMBO_WAIT_MAX - comboWait) * 96)), 255, 255, 255);
                                }
                                i10 = i11 + 1;
                            }
                            if (RCInputData[1][i9] > 0) {
                                f = 1.0f;
                                alwaysTexture.setBlendMode(108, 1);
                                DrawTexture.drawScaleColor(alwaysTexture, 108, _base[(i9 * 4) + 4][0], _base[(i9 * 4) + 4][1], (int) (alwaysTexture.getWidth(108) * 1.0f), (int) (alwaysTexture.getHeight(108) * 1.0f), _flip[0], Math.min(255, comboWait * 80), 255, 255, 255);
                                alwaysTexture.setBlendMode(108, 1);
                                DrawTexture.drawScaleColor(alwaysTexture, 108, _base[(i9 * 4) + 4 + 1][0], _base[(i9 * 4) + 4 + 1][1], (int) (alwaysTexture.getWidth(108) * 1.0f), (int) (alwaysTexture.getHeight(108) * 1.0f), _flip[1], Math.min(255, comboWait * 80), 255, 255, 255);
                                alwaysTexture.setBlendMode(108, 1);
                                DrawTexture.drawScaleColor(alwaysTexture, 108, _base[(i9 * 4) + 4 + 2][0], _base[(i9 * 4) + 4 + 2][1], (int) (alwaysTexture.getWidth(108) * 1.0f), (int) (alwaysTexture.getHeight(108) * 1.0f), _flip[2], Math.min(255, comboWait * 80), 255, 255, 255);
                                alwaysTexture.setBlendMode(108, 1);
                                DrawTexture.drawScaleColor(alwaysTexture, 108, _base[(i9 * 4) + 4 + 3][0], _base[(i9 * 4) + 4 + 3][1], (int) (alwaysTexture.getWidth(108) * 1.0f), (int) (alwaysTexture.getHeight(108) * 1.0f), _flip[3], Math.min(255, comboWait * 80), 255, 255, 255);
                            } else {
                                f = f3;
                            }
                            i9++;
                            f3 = f;
                        }
                    }
                    if (comboWait == 0 && comboNum + 1 < GameStatus.PLAYER.getAbilityEff(0, 14)) {
                        int i12 = GameStatus.EXTRA.isCheatMode(13) ? 106 : 104;
                        int i13 = 0;
                        while (true) {
                            int i14 = i13;
                            if (i14 >= 4) {
                                break;
                            }
                            int i15 = 0;
                            while (true) {
                                int i16 = i15;
                                if (i16 < RCInputData[3][i14]) {
                                    setDrawOffset(i14, i16 * 10);
                                    DrawTexture.drawScaleColor(alwaysTexture, i12, (int) ((_base[i14][2] - (alwaysTexture.getWidth(i12) / 2)) + _ofs[0]), (int) ((_base[i14][3] - (alwaysTexture.getHeight(i12) / 2)) + _ofs[1]), alwaysTexture.getWidth(i12), alwaysTexture.getHeight(i12), _flip[i14], 255, (i >> 16) & 255, (i >> 8) & 255, i & 255);
                                    i15 = i16 + 1;
                                }
                            }
                            i13 = i14 + 1;
                        }
                    }
                    int i17 = GameStatus.EXTRA.isCheatMode(13) ? 105 : 103;
                    int i18 = 0;
                    while (true) {
                        int i19 = i18;
                        if (i19 >= 4) {
                            break;
                        }
                        int i20 = 0;
                        while (true) {
                            int i21 = i20;
                            if (i21 < RCInputData[2][i19]) {
                                float fMin = Math.min(1.0f, ((COMBO_WAIT_MAX + 1) - comboWait) / 3.0f);
                                setDrawOffset(i19, (i21 * 20) - (comboWait * 15));
                                int i22 = 80;
                                if (i21 < RCInputData[4][i19]) {
                                    i22 = 255;
                                }
                                DrawTexture.drawScaleColor(alwaysTexture, i17, (int) ((_base[i19][0] - ((alwaysTexture.getWidth(i17) * fMin) / 2.0f)) + _ofs[0]), (int) ((_base[i19][1] - ((alwaysTexture.getHeight(i17) * fMin) / 2.0f)) + _ofs[1]), (int) (alwaysTexture.getWidth(i17) * fMin), (int) (fMin * alwaysTexture.getHeight(i17)), _flip[i19], i22, (i >> 16) & 255, (i >> 8) & 255, i & 255);
                                i20 = i21 + 1;
                            }
                        }
                        i18 = i19 + 1;
                    }
                }
                if (comboNum > 0) {
                    if (comboRank > 0) {
                        DrawTexture.drawImage(alwaysTexture, 102, 506, 315, alwaysTexture.getWidth(102), alwaysTexture.getHeight(102), 0.0f, 0, i);
                        DrawTexture.drawImage(alwaysTexture, 102, 555, 315, alwaysTexture.getWidth(102), alwaysTexture.getHeight(102), 0.0f, 1, i);
                        DrawTexture.drawColor(alwaysTexture, 94, 530, 374, 0.0f, 255, 255, 230, 20);
                        DrawTexture.drawColor(alwaysTexture, 98, 528, 386, 0.0f, 255, 255, 230, 20);
                        int i23 = _image[comboRank][0] <= 0 ? 503 : 518;
                        if (_image[comboRank][0] > 0) {
                            DrawTexture.drawColor(alwaysTexture, _image[comboRank][0], i23, 340, 1.0f, 255, 255, 255, 255);
                        }
                        if (_image[comboRank][1] > 0) {
                            DrawTexture.drawColor(alwaysTexture, _image[comboRank][1], i23 + 31, 340, 1.0f, 255, 255, 255, 255);
                        }
                        if (comboRankUp > 0) {
                            float f4 = 2.0f + (0.16f * (5 - comboRankUp));
                            int i24 = 255 - ((5 - comboRankUp) * 21);
                            DrawTexture.drawScaleColor(alwaysTexture, 99, 576 - ((((int) (alwaysTexture.getWidth(99) * f4)) - alwaysTexture.getWidth(99)) / 2), 315 - ((((int) (alwaysTexture.getHeight(99) * f4)) - alwaysTexture.getHeight(99)) / 2), (int) (alwaysTexture.getWidth(99) * f4), (int) (alwaysTexture.getHeight(99) * f4), 1.0f, i24, 255, 55, 20);
                            DrawTexture.drawScaleColor(alwaysTexture, 98, 467 - ((((int) (alwaysTexture.getWidth(98) * f4)) - alwaysTexture.getWidth(98)) / 2), 315 - ((((int) (alwaysTexture.getHeight(98) * f4)) - alwaysTexture.getHeight(98)) / 2), (int) (alwaysTexture.getWidth(98) * f4), (int) (alwaysTexture.getHeight(98) * f4), 1.0f, i24, 255, 55, 20);
                            if (!GameStatus.GAME.gameStop) {
                                comboRankUp--;
                            }
                        }
                    }
                    DrawTexture.drawImage(alwaysTexture, 102, 246, 54, alwaysTexture.getWidth(102), alwaysTexture.getHeight(102), 0.0f, 0, i);
                    DrawTexture.drawImage(alwaysTexture, 102, 295, 54, alwaysTexture.getWidth(102), alwaysTexture.getHeight(102), 0.0f, 1, i);
                    DrawTexture.drawColor(alwaysTexture, 95, 262, 107, 0.0f, 255, 255, 55, 20);
                    DrawTexture.drawColor(alwaysTexture, 97, 274, 137, 0.0f, 255, 255, 155, 20);
                    DrawTexture.drawString(alwaysTexture, Util.zero_int(comboNum, 2), 252, 75, 1.0f, 1.0f, 255);
                    DrawTexture.drawString(alwaysTexture, Util.zero_int(GameStatus.PLAYER.getAbilityEff(0, 14), 2), 276, 121, 0.5f, 1.0f, 255);
                }
            }
        }
        Game game = f2gm;
        if (Game.menu.isExe()) {
            return;
        }
        drawComboResult();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
    public static void drawAttack3D() throws IllegalStateException {
        for (int i = 0; i < AtkData.length; i++) {
            if (AtkData[i].use && AtkData[i].disp) {
                float f = AtkData[i].angle;
                if (AtkData[i].modelNo >= 0) {
                    Figure figure = atkModel[AtkData[i].gidIndex >> 16][AtkData[i].modelNo];
                    if (AtkData[i].modelNo < atkModelFrame[AtkData[i].gidIndex >> 16].length) {
                        figure.setFrame(AtkData[i].time % ((int) atkModelFrame[AtkData[i].gidIndex >> 16][AtkData[i].modelNo]));
                    }
                    if (AtkData[i].modelType == 1) {
                        float f2 = AtkData[i].modelScale;
                        if (Util.dirTo8(AtkData[i].dir - CameraData.dirDelay) > 4) {
                            f2 *= -1.0f;
                        }
                        if (f != 0.0f && f2 >= 0.0f) {
                            f *= -1.0f;
                        }
                        if (AtkData[i].modelBlend != 100) {
                            Util.setTransparency((int) (AtkData[i].modelBlend * 2.55f), figure);
                        }
                        _ts.setTranslate(AtkData[i].f69x, AtkData[i].f70y, AtkData[i].f71z);
                        Util.setRotate(new Vector3D(0.0f, 0.0f, 1.0f), f / 360.0f, _ts);
                        Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), ((CameraData.dirDelay + AtkData[i].dir) + 180.0f) / 360.0f, _ts);
                        Util.setScale(f2, AtkData[i].modelScale, AtkData[i].modelScale, _ts);
                    } else {
                        _ts.setTranslate(AtkData[i].f69x, AtkData[i].f70y, AtkData[i].f71z);
                        if (Util.dirTo8(AtkData[i].dir - CameraData.dirDelay) <= 4 && f != 0.0f) {
                            f *= -1.0f;
                        }
                        Util.setRotate(new Vector3D(0.0f, 0.0f, 1.0f), f / 360.0f, _ts);
                        Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), AtkData[i].dir / 360.0f, _ts);
                        Util.setScale(AtkData[i].modelScale, AtkData[i].modelScale, AtkData[i].modelScale, _ts);
                    }
                    GameCommon.f56g3.addDrawQueueFigure(GameCommon.ogl, figure, _ts);
                }
                if (AtkData[i].bindFig != null) {
                    AtkData[i].bindFig.setRenderEnable(true);
                    _ts.setTranslate(AtkData[i].f69x, AtkData[i].f70y, AtkData[i].f71z);
                    if (Util.dirTo8(AtkData[i].dir - CameraData.dirDelay) <= 4 && f != 0.0f) {
                        f *= -1.0f;
                    }
                    Util.setRotate(new Vector3D(0.0f, 0.0f, 1.0f), f / 360.0f, _ts);
                    Util.setRotate(new Vector3D(0.0f, 1.0f, 0.0f), AtkData[i].dir / 360.0f, _ts);
                    Util.setRotate(new Vector3D(0.0f, 0.0f, 1.0f), (AtkData[i].time * AtkData[i].modelType) / 360.0f, _ts);
                    Util.setScale(AtkData[i].charData.scale, AtkData[i].charData.scale, AtkData[i].charData.scale, _ts);
                    GameCommon.f56g3.addDrawQueueFigure(GameCommon.ogl, AtkData[i].bindFig, _ts);
                    AtkData[i].bindFig.setRenderEnable(false);
                }
            }
        }
        if (GameCommon.DEBUG_STATUS[17] >= 1) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x02ef A[PHI: r12
  0x02ef: PHI (r12v2 int) = (r12v1 int), (r12v7 int), (r12v7 int) binds: [B:19:0x01c3, B:26:0x01db, B:28:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
    private static void drawComboResult() {
        char c;
        int i;
        int i2;
        int i3;
        if (comboBonusDrawTime < 0) {
            return;
        }
        int i4 = comboBonusDrawTime <= 5 ? comboBonusDrawTime * 51 : 255;
        alwaysTexture.getWidth(79);
        int height = alwaysTexture.getHeight(79);
        DrawTexture.drawRegionRGB(alwaysTexture, 79, 280, 310, 12, height, 0, 0, 12, height, 1.0f, i4, 16762404);
        DrawTexture.drawRegionRGB(alwaysTexture, 79, 292, 310, 257, height, 12, 0, 1, height, 1.0f, i4, 16762404);
        DrawTexture.drawRegionRGB(alwaysTexture, 79, 548, 310, 24, height, 13, 0, 37, height, 1.0f, i4, 16762404);
        DrawTexture.drawString(alwaysTexture, "COMBO RESULT", 286, 314, 0.4f, 1.0f, i4);
        DrawTexture.drawString(alwaysTexture, new StringBuffer().append("").append(bonusBak).toString(), (bonusBak < 10 ? 37 : 0) + 280 + 30, 333, 0.8f, 1.0f, i4);
        DrawTexture.drawString(alwaysTexture, "COMBO!!", 385, 338, 0.6f, 1.0f, i4);
        int comboItemRankNum = getComboItemRankNum();
        if (1 > comboItemRankNum || comboItemRankNum > 6) {
            c = (7 > comboItemRankNum || comboItemRankNum > 12) ? (char) 0 : (char) 2;
        } else {
            c = 1;
        }
        if (c >= 1) {
            int width = alwaysTexture.getWidth(86) - 1;
            int height2 = alwaysTexture.getHeight(86);
            DrawTexture.drawRegionRGB(alwaysTexture, 86, 280, 310 + height, 6, 50, 0, 1, 5, 5, 1.0f, i4, 16762404);
            DrawTexture.drawRegionRGB(alwaysTexture, 86, 285, 310 + height, 272, 50, 5, 4, 1, 1, 1.0f, i4, 16762404);
            DrawTexture.drawRegionRGB(alwaysTexture, 86, 556, 310 + height, (width - 6) - 0, 50, 6, 4, (width - 6) - 0, 1, 1.0f, i4, 16762404);
            DrawTexture.drawRegionRGB(alwaysTexture, 86, 280, 310 + height + 50, 6, height2 - 5, 0, 5, 5, height2 - 5, 1.0f, i4, 16762404);
            DrawTexture.drawRegionRGB(alwaysTexture, 86, 285, 310 + height + 50, 272, height2 - 5, 5, 5, 5, height2 - 5, 1.0f, i4, 16762404);
            DrawTexture.drawRegionRGB(alwaysTexture, 86, 556, 310 + height + 50, (width - 6) - 0, height2 - 5, 6, 5, (width - 6) - 0, height2 - 5, 1.0f, i4, 16762404);
            int i5 = 0;
            int i6 = 288;
            int i7 = 310 + height + 10;
            int height3 = (int) (alwaysTexture.getHeight(29) * 0.65f);
            if (c != 2) {
                i = i4;
            } else {
                if (30 <= comboBonusDrawTime && comboBonusDrawTime < 35) {
                    i4 = (comboBonusDrawTime - 30) * 51;
                }
                if (25 > comboBonusDrawTime || comboBonusDrawTime >= 30) {
                    i = i4;
                } else {
                    i = 255 - ((comboBonusDrawTime - 25) * 51);
                }
            }
            int length = comboBonusCount.length - 1;
            while (length >= 0) {
                if (comboBonusCount[length] <= 0) {
                    i2 = i6;
                    i3 = i5;
                } else if (c != 2 || comboBonusDrawTime > 30 || i5 >= 6) {
                    int i8 = _image[length + 1][0] <= 0 ? 0 - (height3 / 2) : 0;
                    if (_image[length + 1][0] > 0) {
                        DrawTexture.drawScaleColor(alwaysTexture, _image[length + 1][0], i6 + i8, i7, height3, height3, 1.0f, i, 255, 55, 20);
                    }
                    if (_image[length + 1][1] > 0) {
                        DrawTexture.drawScaleColor(alwaysTexture, _image[length + 1][1], i6 + i8 + height3, i7, height3, height3, 1.0f, i, 255, 55, 20);
                    }
                    Draw2D.drawString(new StringBuffer().append("x").append((int) comboBonusCount[length]).toString(), (height3 * 2) + i6 + 5, i7 + 20, 24, (i << 16) | (i << 8) | i, 0, 0, i);
                    i2 = i6 + 93;
                    i3 = i5 + 1;
                    if (i3 % 3 == 0) {
                        i2 = 288;
                        i7 += 30;
                        if (c == 2 && comboBonusDrawTime > 30 && i3 >= 6) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i3 = i5 + 1;
                    i2 = i6;
                }
                length--;
                i6 = i2;
                i5 = i3;
            }
        }
        if (!GameStatus.GAME.gameStop && comboBonusDrawTime >= 0) {
            comboBonusDrawTime--;
        }
        if (comboBonusDrawTime == -1) {
            comboRank = 0;
            bonusBak = 0;
        }
    }

    private static void drawComboRim(int i) {
        int i2 = isTCGaugeView() ? 16756480 : 3535619;
        DrawTexture.drawScaleColor(alwaysTexture, 107, 230, 41, alwaysTexture.getWidth(107) * 2, alwaysTexture.getHeight(107) * 2, _flip[0], i, (i2 >> 16) & 255, (i2 >> 8) & 255, i2 & 255);
        DrawTexture.drawScaleColor(alwaysTexture, 107, 230, 239, alwaysTexture.getWidth(107) * 2, alwaysTexture.getHeight(107) * 2, _flip[1], i, (i2 >> 16) & 255, (i2 >> 8) & 255, i2 & 255);
        DrawTexture.drawScaleColor(alwaysTexture, 107, 428, 239, alwaysTexture.getWidth(107) * 2, alwaysTexture.getHeight(107) * 2, _flip[2], i, (i2 >> 16) & 255, (i2 >> 8) & 255, i2 & 255);
        DrawTexture.drawScaleColor(alwaysTexture, 107, 428, 41, alwaysTexture.getWidth(107) * 2, alwaysTexture.getHeight(107) * 2, _flip[3], i, (i2 >> 16) & 255, (i2 >> 8) & 255, i2 & 255);
    }

    public static void freeAllAttackData() {
        for (int i = 0; i < AtkData.length; i++) {
            freeAttackData(i);
            AtkData[i].charData = null;
            AtkData[i].targetData = null;
            AtkData[i].bindFig = null;
        }
    }

    public static void freeAllAttackInfo() {
        for (int i = 0; i < AtkInfo.length; i++) {
            for (int i2 = 0; i2 < AtkInfo[i].length; i2++) {
                AtkInfo[i][i2].free();
            }
        }
    }

    public static void freeAttackData(int i) {
        boolean z;
        if (AtkData[i].charData != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= AtkData.length) {
                    z = true;
                    break;
                } else {
                    if (AtkData[i2].use && i2 != i && !AtkData[i2].separate && AtkData[i2].char_no == AtkData[i].char_no) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                AtkData[i].charData.setBitState(Appearance.LIGHTTWOSIDE, false);
            }
        }
        AtkData[i].use = false;
        AtkData[i].disp = false;
    }

    private static void freeAttackDataGroup(int i, int i2) {
        for (int i3 = 0; i3 < AtkData.length; i3++) {
            if (AtkData[i3].groupNo == i2) {
                if (i != i3) {
                    attackAction(i3, getFuncBlock(5, AtkData[i3].gidIndex, AtkData[i3].objNo, 0));
                }
                freeAttackData(i3);
            }
        }
    }

    public static void freeAttackInfo(int i) {
        for (int i2 = 0; i2 < AtkInfo[i].length; i2++) {
            AtkInfo[i][i2].free();
        }
    }

    public static void freeCharAttack(int i) {
        freeCharAttack(i, true);
    }

    public static void freeCharAttack(int i, boolean z) {
        if (AtkData == null) {
            return;
        }
        for (int i2 = 0; i2 < AtkData.length; i2++) {
            if (AtkData[i2].use && AtkData[i2].char_no == i && (z || !AtkData[i2].separate)) {
                if (GameCommon.DEBUG_STATUS[17] >= 2) {
                }
                attackAction(i2, getFuncBlock(5, AtkData[i2].gidIndex, AtkData[i2].objNo, 0));
                freeAttackData(i2);
            }
        }
    }

    public static void freeModel(int i) {
        if (atkModel == null || atkModel[i] == null) {
            return;
        }
        Game.FreeFigure(atkModel[i]);
    }

    public static int getAttackDataNum() {
        return AtkInfo.length;
    }

    public static boolean getAttackTempVal() {
        for (int i = 0; i < AtkData.length; i++) {
            if (AtkData[i].use && AtkData[i].tempVal > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean getAttackUse(int[] iArr) {
        for (int i : iArr) {
            if (AtkData[i].use) {
                return true;
            }
        }
        return false;
    }

    public static int getBattleDataSize(byte[] bArr, int i) {
        byte b = bArr[i];
        if (b == 0 || b == 5 || b == 7) {
            return 2;
        }
        if (b == 1) {
            return 3;
        }
        if (b == 2 || b == 3) {
            return 5;
        }
        if (b == 4) {
            return bArr[i + 1] + 1;
        }
        if (b == 6) {
            if (bArr[i + 1] == 0) {
                return 6;
            }
            if (bArr[i + 1] == 1) {
                return 3;
            }
            if (bArr[i + 1] == 2) {
                return 6;
            }
            if (bArr[i + 1] == 3 || bArr[i + 1] == 4 || bArr[i + 1] == 5 || bArr[i + 1] == 6) {
                return 3;
            }
        }
        return 0;
    }

    public static int getCancelFrame(int i) {
        int idIndex = getIdIndex(i);
        if (AtkInfo[idIndex >> 16][idIndex & 65535].use) {
            return AtkInfo[idIndex >> 16][idIndex & 65535].cancelFrame;
        }
        return -1;
    }

    public static int getCharAttackNum(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 >= AtkData.length) {
                return i4;
            }
            if (AtkData[i3].use && AtkData[i3].char_no == i) {
                i4++;
            }
            i2 = i4;
            i3++;
        }
    }

    private static int getComboItemRankNum() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 >= comboBonusCount.length) {
                return i3;
            }
            i = comboBonusCount[i2] > 0 ? i3 + 1 : i3;
            i2++;
        }
    }

    private static byte[][] getFuncBlock(int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < AtkInfo[i2 >> 16][i2 & 65535].callBack[i3].length; i5++) {
            if (AtkInfo[i2 >> 16][i2 & 65535].callBack[i3][i5][0] == i) {
                return AtkInfo[i2 >> 16][i2 & 65535].script[AtkInfo[i2 >> 16][i2 & 65535].callBack[i3][i5][1]][i4];
            }
        }
        return (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 0, 0);
    }

    private static int getFuncId(int i, int i2, int i3) {
        for (int i4 = 0; i4 < AtkInfo[i2 >> 16][i2 & 65535].callBack[i3].length; i4++) {
            if (AtkInfo[i2 >> 16][i2 & 65535].callBack[i3][i4][0] == i) {
                return AtkInfo[i2 >> 16][i2 & 65535].callBack[i3][i4][1];
            }
        }
        return -1;
    }

    private static int getGroupNo(int i) {
        if (i == 0) {
            AtkGroupP++;
            if (AtkGroupP >= 100) {
                AtkGroupP = 1;
            }
            return AtkGroupP;
        }
        AtkGroupN++;
        if (AtkGroupN >= 1000) {
            AtkGroupN = ID_EFFECT_PIYORI;
        }
        return AtkGroupN;
    }

    public static int getHomingAttackNo() {
        return homingAttackNo;
    }

    public static short getHomingPHosei() {
        return homingPHosei;
    }

    private static int getIdIndex(int i) throws IllegalArgumentException {
        for (int i2 = 0; i2 < AtkInfo.length; i2++) {
            for (int i3 = 0; i3 < AtkInfo[i2].length; i3++) {
                if (AtkInfo[i2][i3].gid == i) {
                    return (i2 << 16) + i3;
                }
            }
        }
        throw new IllegalArgumentException(new StringBuffer().append("ATTACK_ID not found : ").append(i).toString());
    }

    public static Attack getInstance(Game game) {
        if (f2gm == null) {
            f2gm = game;
        }
        if (f2gm == null) {
            return null;
        }
        return attack;
    }

    public static int getMagicPow(int i) {
        if (i < 0) {
            return -1;
        }
        return AtkData[i].magicPow;
    }

    public static float[] getNearTargetData() {
        _CNO_[3][2] = Character.charData[0].dir;
        if (_CNO_[3][0] == 0.0f) {
            if (Character.charData[0].targetChar >= 0) {
                _CNO_[3][2] = Character.getCharsDir(0, Character.charData[0].targetChar);
            }
        } else if (_CNO_[3][0] == 1.0f) {
            if (targetAttack != null) {
                _CNO_[3][2] = Util.atan2_360(targetAttack.f69x - Character.charData[0].f69x, targetAttack.f71z - Character.charData[0].f71z);
            }
        } else if (_CNO_[3][0] == 2.0f) {
            _CNO_[3][2] = Util.atan2_360(MapData.bugBlock[(int) _CNO_[3][1]].f69x - Character.charData[0].f69x, MapData.bugBlock[(int) _CNO_[3][1]].f71z - Character.charData[0].f71z);
        }
        return _CNO_[3];
    }

    private static int getRankUpPer() {
        return isTC() ? 50 : 10;
    }

    public static int getTargetAttackNum(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 >= AtkData.length) {
                return i4;
            }
            if (AtkData[i3].use && AtkData[i3].target_no == i) {
                i4++;
            }
            i2 = i4;
            i3++;
        }
    }

    private static boolean guardAttributeCheck(int i, float f, float f2, float f3, float f4) {
        if (Character.charData[i].guardAttribute == 0) {
            return false;
        }
        if (Character.charData[i].guardAttribute == 2) {
            return true;
        }
        float[] fArrRelativeChange = relativeChange(Character.charData[i].dir, Character.charData[i].ahX, Character.charData[i].ahZ, 0, false);
        if (Character.charData[i].guardAttribute != 1) {
            return false;
        }
        if (Math.abs(Util.DiffDir(Character.charData[i].dir, f3)) < f4) {
            if (Math.abs(Util.DiffDir(Character.charData[i].dir, Util.atan2_360((Character.charData[i].f69x + fArrRelativeChange[0]) - f, (fArrRelativeChange[1] + Character.charData[i].f71z) - f2))) < f4) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAttackDraw() {
        return comboBonusDrawTime >= 0 || comboDrawTime > 0 || GameStatus.PLAYER.getNumberData(38) >= 0 || GameStatus.PLAYER.getNumberData(39) >= 0;
    }

    public static boolean isCharAttackAlive(int i, int i2) {
        for (int i3 = 0; i3 < AtkData.length; i3++) {
            if (AtkData[i3].use && AtkData[i3].char_no == i && i2 == AtkInfo[AtkData[i3].gidIndex >> 16][AtkData[i3].gidIndex & 65535].gid) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEnemy(int i) {
        return Character.charData[i].type == 0 || Character.charData[i].type == 9;
    }

    public static boolean isExtSolo() {
        if (GameStatus.GAME.extCommand == 2) {
            if (Action.extBindCharNo[0] > 0 && Action.extBindCharNo[1] <= 0) {
                return true;
            }
            if (Action.extBindCharNo[0] <= 0 && Action.extBindCharNo[1] > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHoming() {
        return homingAttackNo >= 0;
    }

    public static boolean isRC() {
        if (GameStatus.PLAYER.getNumberData(19) == 5) {
            return false;
        }
        if (isRCDisp()) {
            return true;
        }
        for (int i = 0; i < AtkData.length; i++) {
            if (AtkData[i].use && AtkData[i].comboHosei != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRCDisp() {
        if (comboInput) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            if (RCInputData[1][i] > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStartRC() {
        for (int i = 0; i < 4; i++) {
            if (RCInputData[0][i] > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTC() {
        return isTCGaugeView() && (isStartRC() || isRC());
    }

    public static boolean isTCGaugeView() {
        return GameStatus.GAME.extCommand == 2 && Action.extBindCharNo[0] > 0 && Action.extBindCharNo[1] > 0;
    }

    public static void load(int i, ZInputStream zInputStream) throws Exception {
        freeAttackInfo(i);
        int i2 = zInputStream.read();
        for (int i3 = 0; i3 < i2; i3++) {
            zInputStream.skip(4L);
            AtkInfo[i][i3].use = true;
            AtkInfo[i][i3].gid = (int) readBattleData(zInputStream);
            AtkInfo[i][i3].attackNum = (int) readBattleData(zInputStream);
            AtkInfo[i][i3].attribute = (int) readBattleData(zInputStream);
            AtkInfo[i][i3].opType = (int) readBattleData(zInputStream);
            AtkInfo[i][i3].power = (int) readBattleData(zInputStream);
            AtkInfo[i][i3].hpMax = (int) readBattleData(zInputStream);
            AtkInfo[i][i3].dwnDirType = (int) readBattleData(zInputStream);
            AtkInfo[i][i3].dwnspd = readBattleData(zInputStream);
            AtkInfo[i][i3].f8r = readBattleData(zInputStream);
            AtkInfo[i][i3].f7h = readBattleData(zInputStream);
            AtkInfo[i][i3].checkR = readBattleData(zInputStream);
            AtkInfo[i][i3].checkH = readBattleData(zInputStream);
            AtkInfo[i][i3].checkOfsX = readBattleData(zInputStream);
            AtkInfo[i][i3].checkOfsY = readBattleData(zInputStream);
            AtkInfo[i][i3].checkOfsZ = readBattleData(zInputStream);
            AtkInfo[i][i3].cancelFrame = (int) readBattleData(zInputStream);
            AtkInfo[i][i3].callBack = new int[AtkInfo[i][i3].attackNum][][];
            for (int i4 = 0; i4 < AtkInfo[i][i3].callBack.length; i4++) {
                AtkInfo[i][i3].callBack[i4] = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, zInputStream.read(), 2);
                for (int i5 = 0; i5 < AtkInfo[i][i3].callBack[i4].length; i5++) {
                    for (int i6 = 0; i6 < AtkInfo[i][i3].callBack[i4][i5].length; i6++) {
                        AtkInfo[i][i3].callBack[i4][i5][i6] = zInputStream.read();
                    }
                }
            }
            AtkInfo[i][i3].script = new byte[zInputStream.read()][][][];
            for (int i7 = 0; i7 < AtkInfo[i][i3].script.length; i7++) {
                AtkInfo[i][i3].script[i7] = new byte[zInputStream.read()][][];
                for (int i8 = 0; i8 < AtkInfo[i][i3].script[i7].length; i8++) {
                    AtkInfo[i][i3].script[i7][i8] = new byte[zInputStream.read()][];
                    for (int i9 = 0; i9 < AtkInfo[i][i3].script[i7][i8].length; i9++) {
                        AtkInfo[i][i3].script[i7][i8][i9] = new byte[Util.readShort(zInputStream) + 1];
                        zInputStream.read(AtkInfo[i][i3].script[i7][i8][i9], 1, AtkInfo[i][i3].script[i7][i8][i9].length - 1);
                        setCommandType(AtkInfo[i][i3].script[i7][i8][i9]);
                    }
                }
            }
        }
    }

    public static void loadModel(int i, ZInputStream zInputStream) throws Exception {
        ErpObject erpObjectReadObject3DZipStream = GameCommon.ReadObject3DZipStream(zInputStream, 0, false);
        atkModel[i] = new Figure[erpObjectReadObject3DZipStream.model.length];
        atkModelFrame[i] = new float[erpObjectReadObject3DZipStream.model.length];
        for (int i2 = 0; i2 < erpObjectReadObject3DZipStream.model.length; i2++) {
            atkModel[i][i2] = GameCommon.getObjectFigure(erpObjectReadObject3DZipStream, i2);
            if (GameCommon.getObjectMaxFrame(erpObjectReadObject3DZipStream, i2) != 0.0f) {
                atkModelFrame[i][i2] = GameCommon.getObjectMaxFrame(erpObjectReadObject3DZipStream, i2);
            }
        }
    }

    public static void magicHitCountUp() {
        magicHitCount++;
        magicDrawTime = 5;
    }

    public static void moveAllAttackPos(float f, float f2, float f3) {
        for (int i = 0; i < AtkData.length; i++) {
            if (AtkData[i].use) {
                AtkData[i].f69x += f;
                AtkData[i].f70y += f2;
                AtkData[i].f71z += f3;
            }
        }
    }

    public static float readBattleData(ZInputStream zInputStream) throws Exception {
        int i = zInputStream.read();
        if (i == 0 || i == 5 || i == 7) {
            return zInputStream.read();
        }
        if (i == 1) {
            return Util.readShort(zInputStream);
        }
        if (i == 2) {
            return Util.readInt(zInputStream);
        }
        if (i == 3) {
            return Util.readInt(zInputStream) / 100.0f;
        }
        if (i == 6) {
        }
        return 0.0f;
    }

    public static float readBattleData(byte[] bArr, int i) {
        return readBattleData(bArr, i, -1, null, -1);
    }

    public static float readBattleData(byte[] bArr, int i, int i2, BattleCommand battleCommand, int i3) {
        float f = 0.0f;
        byte b = bArr[i];
        if (b == 0 || b == 5 || b == 7) {
            return bArr[i + 1];
        }
        if (b == 1) {
            return Util.readShort(bArr[i + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
        }
        if (b == 2) {
            return Util.readInt(bArr[i + 4] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
        }
        if (b == 3) {
            return Util.readInt(bArr[i + 4] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) / 100.0f;
        }
        if (b == 4) {
            battleCommand.str = new String(bArr, i + 2, (int) bArr[i + 1]);
            return 0.0f;
        }
        if (b != 6) {
            return 0.0f;
        }
        if ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) == 0) {
            return Util.randomFix(Util.readShort(bArr[i + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET), Util.readShort(bArr[i + 5] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 4] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET));
        }
        if ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) == 1) {
            return Character.charData[i2].thinkVal[bArr[i + 2]];
        }
        if ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) == 2) {
            return Util.randomFix(0, 99) % 2 == 1 ? Util.readShort(bArr[i + 5] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 4] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) : Util.readShort(bArr[i + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
        }
        if ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) == 3) {
            String str = new String(new byte[]{bArr[i + 2]});
            if (str.equals("a")) {
                return getCharAttackNum(i2);
            }
            if (str.equals("n")) {
                return i2;
            }
            if (str.equals("p")) {
                return Character.charData[i2].f12hp;
            }
            if (str.equals("x")) {
                return Character.charData[i2].f69x;
            }
            if (str.equals("y")) {
                return Character.charData[i2].f70y;
            }
            if (str.equals("z")) {
                return Character.charData[i2].f71z;
            }
            return 0.0f;
        }
        if ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) == 4) {
            if (new String(new byte[]{bArr[i + 2]}).equals("h")) {
                return MapData.getPointCollisionHighest(Character.charData[i2].f69x, Character.charData[i2].f71z);
            }
            return 0.0f;
        }
        if ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) != 5) {
            if ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) != 6) {
                return 0.0f;
            }
            String str2 = new String(new byte[]{bArr[i + 2]});
            if (str2.equals("o")) {
                if (i3 >= 0) {
                    return AtkData[i3].char_no;
                }
                return 0.0f;
            }
            if (str2.equals("v")) {
                if (i3 >= 0) {
                    return AtkData[i3].tempVal;
                }
                return 0.0f;
            }
            if (str2.equals("x")) {
                if (i3 >= 0) {
                    return AtkData[i3].f69x;
                }
                return 0.0f;
            }
            if (str2.equals("y")) {
                if (i3 >= 0) {
                    return AtkData[i3].f70y;
                }
                return 0.0f;
            }
            if (!str2.equals("z") || i3 < 0) {
                return 0.0f;
            }
            return AtkData[i3].f71z;
        }
        String str3 = new String(new byte[]{bArr[i + 2]});
        if (str3.equals("a")) {
            if (i2 < 0) {
                return 0.0f;
            }
            for (int i4 = 0; i4 < Character.charData.length; i4++) {
                if (Character.charData[i4].use && Character.charData[i4].f12hp > 0 && Character.charData[i4].type == Character.charData[i2].type) {
                    f += 1.0f;
                }
            }
            return f;
        }
        if (str3.equals("b")) {
            int i5 = 0;
            while (i5 < 50) {
                float f2 = (MapData.bugBlock[i5].state != 0 && MapData.bugBlock[i5].view == 1 && MapData.bugBlock[i5].group == -1) ? f + 1.0f : f;
                i5++;
                f = f2;
            }
            return f;
        }
        if (str3.equals("c")) {
            return comboNum;
        }
        if (str3.equals("d")) {
            if (i2 < 0 || Character.charData[i2].targetChar < 0) {
                return 0.0f;
            }
            return Util3D.sqrt(Character.getCharsXZLen2(i2, Character.charData[i2].targetChar));
        }
        if (str3.equals("m")) {
            return Character.charData[0].motion;
        }
        if (str3.equals("t")) {
            float f3 = tcCharNo;
            if (isTC()) {
                return f3;
            }
            return -1.0f;
        }
        if (str3.equals("x")) {
            return Character.charData[i2].targetChar >= 0 ? Character.charData[Character.charData[i2].targetChar].f69x : Character.charData[i2].f69x;
        }
        if (str3.equals("y")) {
            return Character.charData[i2].targetChar >= 0 ? Character.charData[Character.charData[i2].targetChar].f70y : Character.charData[i2].f70y;
        }
        if (str3.equals("z")) {
            return Character.charData[i2].targetChar >= 0 ? Character.charData[Character.charData[i2].targetChar].f71z : Character.charData[i2].f71z;
        }
        return 0.0f;
    }

    public static void readCommand(byte[] bArr, BattleCommand battleCommand) {
        readCommand(bArr, battleCommand, -1, -1);
    }

    public static void readCommand(byte[] bArr, BattleCommand battleCommand, int i, int i2) {
        for (int i3 = 0; i3 < battleCommand.params.length; i3++) {
            battleCommand.params[i3] = 0.0f;
        }
        battleCommand.type = bArr[0];
        battleCommand.commandId = bArr[1];
        int battleDataSize = 3;
        battleCommand.paramNum = bArr[2];
        for (int i4 = 0; i4 < battleCommand.paramNum; i4++) {
            battleCommand.params[i4] = readBattleData(bArr, battleDataSize, i, battleCommand, i2);
            battleDataSize += getBattleDataSize(bArr, battleDataSize);
        }
    }

    public static boolean reduceHomingTime() {
        if (homingTime > 0) {
            homingTime--;
        }
        return homingTime == 0;
    }

    public static void refrectSet(int i) {
        AtkData[i].isRefrect = true;
    }

    public static void relativeChange(float f, float f2, float f3, int i, boolean z, float[] fArr) {
        fArr[0] = FastMath.sin(Util.RotDir(f, 90.0f)) * f2;
        fArr[1] = FastMath.cos(Util.RotDir(f, 90.0f)) * f2;
        fArr[0] = fArr[0] + (FastMath.sin(f) * f3);
        fArr[1] = fArr[1] + (FastMath.cos(f) * f3);
    }

    public static float[] relativeChange(float f, float f2, float f3, int i, boolean z) {
        _ret[0] = FastMath.sin(Util.RotDir(f, 90.0f)) * f2;
        _ret[1] = FastMath.cos(Util.RotDir(f, 90.0f)) * f2;
        float[] fArr = _ret;
        fArr[0] = fArr[0] + (FastMath.sin(f) * f3);
        float[] fArr2 = _ret;
        fArr2[1] = fArr2[1] + (FastMath.cos(f) * f3);
        return _ret;
    }

    public static void removeAttackBlock(int i) {
        for (int i2 = 0; i2 < AtkData.length; i2++) {
            if (AtkData[i2].use && AtkData[i2].blockNo == i) {
                AtkData[i2].blockNo = (short) -1;
            }
        }
    }

    public static void resetComboBonusTime() {
        comboBonusDrawTime = -1;
    }

    public static void resetHoming() {
        homingAttackNo = -1;
        homingPHosei = (short) 0;
        homingTime = 0;
    }

    public static void resetPiyori(int i) {
        resetPiyori(i, true);
    }

    public static void resetPiyori(int i, boolean z) {
        Character.charData[i].flinchTime = (short) 0;
        CharData charData = Character.charData[i];
        Character.charData[i].flinchCnt = (short) -1;
        charData.flinchCntMax = (short) -1;
        int charIndex = Character.getCharIndex(Character.charData[i].charId);
        if (charIndex >= 0 && Character.imageInfo[charIndex][Character.charData[i].motionNo][7] >= 0.0f && Character.imageInfo[charIndex][Character.charData[i].motionNo][8] >= 0.0f) {
            CharData charData2 = Character.charData[i];
            CharData charData3 = Character.charData[i];
            short sRandomFix = (short) Util.randomFix((int) Character.imageInfo[charIndex][Character.charData[i].motionNo][7], (int) Character.imageInfo[charIndex][Character.charData[i].motionNo][8]);
            charData3.flinchCnt = sRandomFix;
            charData2.flinchCntMax = sRandomFix;
        }
        Effect.clear(i + ID_EFFECT_PIYORI);
        if (z) {
            Effect.clear(i + ID_EFFECT_PIYORI_MARK);
        }
    }

    public static void resetRC() {
        resetRC(false);
    }

    public static void resetRC(boolean z) {
        if (z && isStartRC()) {
            comboStartTime = 0;
        }
        if (comboDisp && (isRCDisp() || (isStartRC() && comboStartTime == 0))) {
            comboStop = true;
            comboDrawTime = 5;
            comboBonusDrawTime = -1;
            if (comboNum > 0) {
                comboBonusDrawTime = 40;
                if (getComboItemRankNum() > 6) {
                    comboBonusDrawTime = 60;
                }
            }
        }
        comboNum = 0;
        comboInputDrawTime = 0;
        for (int i = 0; i < RCInputData.length; i++) {
            RCDataClear(i);
        }
        comboTarget = -1;
        comboInput = false;
    }

    private static int rotDir4(int i, int i2) {
        return (i + i2) % 4;
    }

    public static int[] setAttackData(int i, float f, float f2, float f3, float f4) {
        return setAttackData(i, f, f2, f3, f4, -1);
    }

    public static int[] setAttackData(int i, float f, float f2, float f3, float f4, int i2) {
        CharData charData = new CharData();
        charData.motionSpd = 1.0f;
        return setAttackDataMain(i, -1, charData, -1, null, f, f2, f3, f4, (short) 0, (short) 0, i2, 0, -1, (short) 0);
    }

    public static int[] setAttackData(int i, int i2, CharData charData, int i3, CharData charData2, short s, short s2) {
        return setAttackData(i, i2, charData, i3, charData2, s, s2, -1);
    }

    public static int[] setAttackData(int i, int i2, CharData charData, int i3, CharData charData2, short s, short s2, int i4) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int idIndex = getIdIndex(i);
        if (AtkInfo[idIndex >> 16][65535 & idIndex].opType == 0) {
            if (i2 < 0 || charData == null) {
                return null;
            }
            f = charData.f69x;
            f3 = charData.f71z;
            f2 = charData.f70y;
            f4 = charData.dir;
        } else if (AtkInfo[idIndex >> 16][idIndex & 65535].opType == 1) {
            if (i3 < 0 || charData2 == null) {
                return null;
            }
            f = charData2.f69x;
            f3 = charData2.f71z;
            f2 = charData2.f70y;
            f4 = charData2.dir;
        }
        return setAttackDataMain(i, i2, charData, i3, charData2, f, f2, f3, f4, s, s2, i4, 0, -1, (short) 0);
    }

    public static int[] setAttackDataMain(int i, int i2, CharData charData, int i3, CharData charData2, float f, float f2, float f3, float f4, short s, short s2, int i4, int i5, int i6, short s3) {
        int idIndex = getIdIndex(i);
        if (!AtkInfo[idIndex >> 16][65535 & idIndex].use) {
            return null;
        }
        if (i6 < 0) {
            i6 = getGroupNo(i2);
        }
        int[] iArr = new int[AtkInfo[idIndex >> 16][65535 & idIndex].attackNum];
        for (int i7 = 0; i7 < AtkInfo[idIndex >> 16][65535 & idIndex].attackNum; i7++) {
            iArr[i7] = -1;
            for (int i8 = 0; i8 < AtkData.length; i8++) {
                if (!AtkData[i8].use) {
                    AtkData[i8].use = true;
                    AtkData[i8].disp = true;
                    AtkData[i8].flipSet = false;
                    AtkData[i8].separate = false;
                    AtkData[i8].canCounter = false;
                    AtkData[i8].isHit = false;
                    AtkData[i8].isRefrect = false;
                    AtkData[i8].motionSync = true;
                    AtkData[i8].hitOnce = false;
                    AtkData[i8].atkFlag = (byte) -1;
                    AtkData[i8].comboHosei = s;
                    AtkData[i8].piyoriHosei = s2;
                    AtkData[i8].startFrame = (short) i5;
                    AtkData[i8].wait = 0;
                    AtkData[i8].checkMotion = -1;
                    AtkData[i8].modelType = 0;
                    AtkData[i8].modelNo = -1;
                    AtkData[i8].bindFig = null;
                    AtkData[i8].f3hp = AtkInfo[idIndex >> 16][65535 & idIndex].hpMax;
                    AtkData[i8].attribute = AtkInfo[idIndex >> 16][65535 & idIndex].attribute;
                    AtkData[i8].blockNo = (short) -1;
                    AtkData[i8].magicPow = i4;
                    AtkData[i8].char_no = i2;
                    AtkData[i8].target_no = i3;
                    AtkData[i8].charData = charData;
                    AtkData[i8].targetData = charData2;
                    for (int i9 = 0; i9 < AtkData[i8].hitChar_no.length; i9++) {
                        AtkData[i8].hitChar_no[i9] = -1;
                    }
                    AtkData[i8].rangeMag = (short) 100;
                    AtkData[i8].liftSpd = 0.0f;
                    AttackData attackData = AtkData[i8];
                    AtkData[i8].f4sx = f;
                    attackData.f69x = f;
                    AttackData attackData2 = AtkData[i8];
                    AtkData[i8].f5sy = f2;
                    attackData2.f70y = f2;
                    AttackData attackData3 = AtkData[i8];
                    AtkData[i8].f6sz = f3;
                    attackData3.f71z = f3;
                    AttackData attackData4 = AtkData[i8];
                    AtkData[i8].sdir = f4;
                    attackData4.dir = f4;
                    AtkData[i8].angle = 0.0f;
                    AtkData[i8].blockGrp = -1;
                    AtkData[i8].gidIndex = idIndex;
                    AtkData[i8].objNo = i7;
                    AtkData[i8].groupNo = i6;
                    AtkData[i8].loopCnt = -1;
                    AtkData[i8].cur = 0.0f;
                    AtkData[i8].curBack = 0.0f;
                    AtkData[i8].time = 0.0f;
                    AtkData[i8].tempVal = s3;
                    AtkData[i8].totalDamage = (short) 0;
                    iArr[i7] = i8;
                    charData.setBitState(Appearance.LIGHTTWOSIDE, true);
                    break;
                }
            }
            if (iArr[i7] >= 0) {
                attackAction(iArr[i7], getFuncBlock(0, AtkData[iArr[i7]].gidIndex, AtkData[iArr[i7]].objNo, 0));
            }
        }
        return iArr;
    }

    public static void setAttackPower(int i, int i2) {
        int idIndex = getIdIndex(i);
        AtkInfo[idIndex >> 16][idIndex & 65535].power = i2;
    }

    public static void setAttackSkip(int i, int i2, int i3, float f, float f2, float f3, float f4, short s, short s2, int i4, int i5) {
        setAttackDataMain(i, i2, i2 < 0 ? null : Character.charData[i2], i3, i3 < 0 ? null : Character.charData[i3], f, f2, f3, f4, s, s2, -1, i4, i5, (short) 0);
    }

    public static void setCommandType(byte[] bArr) {
        int battleDataSize = 3;
        byte b = bArr[2];
        for (int i = 0; i < b; i++) {
            if (bArr[battleDataSize] == 5) {
                bArr[0] = 1;
                return;
            }
            battleDataSize += getBattleDataSize(bArr, battleDataSize);
        }
        bArr[0] = 0;
    }

    private static void setDrawOffset(int i, float f) {
        relativeChange(180.0f, FastMath.sin(i * 90) * f, FastMath.cos(i * 90) * f, 0, false);
        _ofs[0] = _ret[0];
        _ofs[1] = _ret[1];
    }

    public static void setHoming(int i, short s) {
        homingAttackNo = i;
        homingPHosei = s;
        if (homingAttackNo >= 0) {
            homingTime = 30;
        }
    }

    public static void setTargetChar(int i, int i2) {
        Character.charData[i].targetChar = (byte) i2;
        float[] fArr = _CNO_[3];
        _CNO_[0][0] = 0.0f;
        fArr[0] = 0.0f;
        float[] fArr2 = _CNO_[3];
        float f = i2;
        _CNO_[0][1] = f;
        fArr2[1] = f;
        float[] fArr3 = _CNO_[3];
        float[] fArr4 = _CNO_[0];
        float charsDir = Character.getCharsDir(i, i2);
        fArr4[2] = charsDir;
        fArr3[2] = charsDir;
        float fAbs = Math.abs(Util.DiffDir(Character.charData[i].dir, _CNO_[0][2]));
        float[] fArr5 = _CNO_[3];
        float[] fArr6 = _CNO_[0];
        if (fAbs == 0.0f) {
            fAbs = 1.0f;
        }
        float charsLen2_P2B = fAbs * Character.getCharsLen2_P2B(i, i2);
        fArr6[3] = charsLen2_P2B;
        fArr5[3] = charsLen2_P2B;
    }

    private static boolean tcBattleCheck(int i) {
        if (Character.getCharsLen2(0, i) >= 100 || Character.charData[i].thinkVal[4] != 2 || Character.charData[i].getBitState(1024) || Character.charData[i].getBitState(4)) {
            return false;
        }
        for (int i2 = 0; i2 < Character.charData.length; i2++) {
            if (Character.charData[i2].use && isEnemy(i2) && Character.charData[i2].f12hp > 0 && Character.getCharsLen2(i, i2) < 64) {
                return true;
            }
        }
        return false;
    }

    public static void tcCtrl() {
        if (tcDrawTime <= 0 || GameStatus.GAME.gameStop) {
            return;
        }
        int i = tcDrawTime - 1;
        tcDrawTime = i;
        if (i == 0) {
            Character.charData[0].setBitState(1024, false);
            Character.charData[Action.extBindCharNo[0]].setBitState(1024, false);
            Character.charData[Action.extBindCharNo[1]].setBitState(1024, false);
            Character.charData[0].alpha = (short) 255;
            Character.charData[Action.extBindCharNo[0]].alpha = (short) 255;
            Character.charData[Action.extBindCharNo[1]].alpha = (short) 255;
            return;
        }
        if (tcDrawTime == 10) {
            Game game = f2gm;
            int[] iArr = Game.eventRectData[10];
            Game game2 = f2gm;
            iArr[0] = 3;
            Game game3 = f2gm;
            int[] iArr2 = Game.eventRectData[10];
            Game game4 = f2gm;
            iArr2[1] = 0;
            Game game5 = f2gm;
            int[] iArr3 = Game.eventRectData[10];
            Game game6 = f2gm;
            iArr3[2] = 0;
            Game game7 = f2gm;
            int[] iArr4 = Game.eventRectData[10];
            Game game8 = f2gm;
            iArr4[3] = 854;
            Game game9 = f2gm;
            int[] iArr5 = Game.eventRectData[10];
            Game game10 = f2gm;
            iArr5[4] = 480;
            Game game11 = f2gm;
            int[] iArr6 = Game.eventRectData[10];
            Game game12 = f2gm;
            iArr6[5] = 16777215;
            Game game13 = f2gm;
            int[] iArr7 = Game.eventRectData[10];
            Game game14 = f2gm;
            iArr7[8] = 1;
            Game game15 = f2gm;
            int[] iArr8 = Game.eventRectData[10];
            Game game16 = f2gm;
            iArr8[6] = 0;
            Game game17 = f2gm;
            int[] iArr9 = Game.eventRectData[10];
            Game game18 = f2gm;
            iArr9[7] = 0;
            Game game19 = f2gm;
            int[] iArr10 = Game.eventRectData[10];
            Game game20 = f2gm;
            iArr10[9] = 9;
            Game game21 = f2gm;
            int[] iArr11 = Game.eventRectData[10];
            Game game22 = f2gm;
            iArr11[10] = 9;
            Game game23 = f2gm;
            int[] iArr12 = Game.eventRectData[10];
            Game game24 = f2gm;
            iArr12[11] = 1;
            return;
        }
        if (tcDrawTime == 20) {
            Game game25 = f2gm;
            int[] iArr13 = Game.eventRectData[10];
            Game game26 = f2gm;
            iArr13[0] = 3;
            Game game27 = f2gm;
            int[] iArr14 = Game.eventRectData[10];
            Game game28 = f2gm;
            iArr14[1] = 0;
            Game game29 = f2gm;
            int[] iArr15 = Game.eventRectData[10];
            Game game30 = f2gm;
            iArr15[2] = 0;
            Game game31 = f2gm;
            int[] iArr16 = Game.eventRectData[10];
            Game game32 = f2gm;
            iArr16[3] = 854;
            Game game33 = f2gm;
            int[] iArr17 = Game.eventRectData[10];
            Game game34 = f2gm;
            iArr17[4] = 480;
            Game game35 = f2gm;
            int[] iArr18 = Game.eventRectData[10];
            Game game36 = f2gm;
            iArr18[5] = 16777215;
            Game game37 = f2gm;
            int[] iArr19 = Game.eventRectData[10];
            Game game38 = f2gm;
            iArr19[8] = 1;
            Game game39 = f2gm;
            int[] iArr20 = Game.eventRectData[10];
            Game game40 = f2gm;
            iArr20[6] = 0;
            Game game41 = f2gm;
            int[] iArr21 = Game.eventRectData[10];
            Game game42 = f2gm;
            iArr21[7] = 0;
            Game game43 = f2gm;
            int[] iArr22 = Game.eventRectData[10];
            Game game44 = f2gm;
            iArr22[9] = 9;
            Game game45 = f2gm;
            int[] iArr23 = Game.eventRectData[10];
            Game game46 = f2gm;
            iArr23[10] = 9;
            Game game47 = f2gm;
            int[] iArr24 = Game.eventRectData[10];
            Game game48 = f2gm;
            iArr24[11] = 0;
        }
    }

    public AttackInfo getAttackData(int i) {
        return AtkInfo[i][0];
    }
}
