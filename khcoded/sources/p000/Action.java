package p000;

import com.docomostar.ui.util3d.FastMath;
import com.jcraft.jzlib.ZInputStream;
import com.mascotcapsule.eruption.docomostar.Appearance;
import com.mascotcapsule.eruption.docomostar.Util3D;
import com.mascotcapsule.eruption.docomostar.VertexBuffer;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Action {
    public static final byte EXT_CHAR_DONA = 0;
    public static final byte EXT_CHAR_GUFI = 1;
    public static final byte EXT_CHAR_MAX = 2;
    private static int[][] gid = new int[11][];
    private static int[][][][] callBack = new int[11][][][];
    private static byte[][][][][] thinkScript = new byte[11][][][][];
    private static byte[][][][][] actionScript = new byte[11][][][][];

    /* JADX INFO: renamed from: bc */
    private static BattleCommand f0bc = new BattleCommand();
    public static byte[] extBindCharNo = new byte[2];
    public static byte[] extFlushCount = new byte[2];
    public static short[] extDefaultAiId = new short[2];

    Action() {
    }

    /* JADX WARN: Code duplicated, block: B:1139:0x2c33  */
    /* JADX WARN: Code duplicated, block: B:1141:0x2c39  */
    /* JADX WARN: Code duplicated, block: B:1148:0x2c53  */
    /* JADX WARN: Code duplicated, block: B:1149:0x2c56  */
    /* JADX WARN: Code duplicated, block: B:205:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:212:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:215:0x0804  */
    /* JADX WARN: Code duplicated, block: B:218:0x0821  */
    /* JADX WARN: Code duplicated, block: B:220:0x0831  */
    /* JADX WARN: Code duplicated, block: B:222:0x085c  */
    /* JADX WARN: Code duplicated, block: B:224:0x0871  */
    /* JADX WARN: Code duplicated, block: B:226:0x087f  */
    /* JADX WARN: Code duplicated, block: B:254:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:255:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:256:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:261:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:263:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:303:0x0c8b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0cc4  */
    /* JADX WARN: Code duplicated, block: B:312:0x0ce9  */
    /* JADX WARN: Code duplicated, block: B:314:0x0d07  */
    /* JADX WARN: Code duplicated, block: B:316:0x0d15  */
    /* JADX WARN: Code duplicated, block: B:344:0x0eb9  */
    /* JADX WARN: Code duplicated, block: B:345:0x0ec1  */
    /* JADX WARN: Code duplicated, block: B:447:0x125e  */
    /* JADX WARN: Code duplicated, block: B:450:0x129b  */
    /* JADX WARN: Code duplicated, block: B:471:0x131b  */
    /* JADX WARN: Code duplicated, block: B:473:0x1323  */
    /* JADX WARN: Code duplicated, block: B:475:0x133e  */
    /* JADX WARN: Code duplicated, block: B:478:0x1355  */
    /* JADX WARN: Code duplicated, block: B:481:0x1368  */
    /* JADX WARN: Code duplicated, block: B:485:0x1388  */
    /* JADX WARN: Code duplicated, block: B:487:0x139a  */
    /* JADX WARN: Code duplicated, block: B:490:0x13b0  */
    /* JADX WARN: Code duplicated, block: B:492:0x13be  */
    /* JADX WARN: Code duplicated, block: B:609:0x1898  */
    /* JADX WARN: Code duplicated, block: B:611:0x18a3  */
    /* JADX WARN: Code duplicated, block: B:614:0x18b1  */
    /* JADX WARN: Code duplicated, block: B:616:0x18be  */
    /* JADX WARN: Code duplicated, block: B:621:0x18d2  */
    /* JADX WARN: Code duplicated, block: B:623:0x18e0  */
    /* JADX WARN: Code duplicated, block: B:626:0x18ee  */
    /* JADX WARN: Code duplicated, block: B:628:0x18f6  */
    /* JADX WARN: Code duplicated, block: B:630:0x1904  */
    /* JADX WARN: Code duplicated, block: B:632:0x191f  */
    /* JADX WARN: Code duplicated, block: B:633:0x1921  */
    /* JADX WARN: Code duplicated, block: B:635:0x1933  */
    public static boolean action(int i) {
        float[] fArr;
        float fAtan2_360;
        boolean z;
        float f;
        float f2;
        boolean z2;
        float fAbs;
        boolean z3;
        float f3;
        float fAtan2_361;
        boolean z4;
        float f4;
        boolean z5;
        float pointCollisionHighest;
        float f5;
        float f6;
        float f7;
        float[] fArr2;
        float f8;
        float fRotDir;
        boolean z6;
        float fRotDir2;
        if (Character.charData[i].actWait > 0) {
            CharData charData = Character.charData[i];
            charData.actWait = (short) (charData.actWait - 1);
            return true;
        }
        int charIndex = Character.getCharIndex(Character.charData[i].charId);
        int aiIndex = getAiIndex(charIndex, Character.charData[i].aiId);
        boolean z7 = false;
        while (!z7) {
            short s = Character.charData[i].actId;
            int iThink = s == -1 ? think(i) : s;
            Attack.readCommand(actionScript[charIndex][aiIndex][iThink][Character.charData[i].actCur], f0bc, i, -1);
            if (f0bc.commandId == 0) {
                boolean z8 = false;
                if (f0bc.params[0] == 26.0f || f0bc.params[0] == 24.0f) {
                    if (!Character.charData[i].getBitState(16) && !Character.charData[i].getBitState(4)) {
                        Character.charData[i].setBitState(16, true);
                        z8 = true;
                    }
                } else if (f0bc.params[0] != 27.0f) {
                    z8 = true;
                } else if (Character.charData[i].getBitState(16)) {
                    Character.charData[i].setBitState(16, false);
                    z8 = true;
                }
                if (z8) {
                    Character.motionSet(i, 0);
                    Character.motionSet(i, (int) f0bc.params[0]);
                }
                CharData charData2 = Character.charData[i];
                charData2.actCur = (short) (charData2.actCur + 1);
                z7 = true;
            } else if (f0bc.commandId == 1) {
                if (Character.charData[i].motion != f0bc.params[0]) {
                    CharData charData3 = Character.charData[i];
                    charData3.actCur = (short) (charData3.actCur + 1);
                    z7 = true;
                } else {
                    z7 = true;
                }
            } else if (f0bc.commandId == 2) {
                Attack.setAttackData((int) f0bc.params[0], i, Character.charData[i], Character.charData[i].targetChar, Character.charData[i].targetChar >= 0 ? Character.charData[Character.charData[i].targetChar] : null, (short) 0, (short) 0);
                CharData charData4 = Character.charData[i];
                charData4.actCur = (short) (charData4.actCur + 1);
                z7 = true;
            } else if (f0bc.commandId == 39) {
                int i2 = (int) f0bc.params[1];
                Attack.setAttackData((int) f0bc.params[0], i, Character.charData[i], i2, i2 >= 0 ? Character.charData[i2] : null, (short) 0, (short) 0);
                CharData charData5 = Character.charData[i];
                charData5.actCur = (short) (charData5.actCur + 1);
                z7 = true;
            } else if (f0bc.commandId == 3) {
                Character.charData[i].actWait = (short) f0bc.params[0];
                CharData charData6 = Character.charData[i];
                charData6.actCur = (short) (charData6.actCur + 1);
                z7 = true;
            } else if (f0bc.commandId == 4) {
                if (!Character.charData[i].getBitState(4)) {
                    Character.motionSet(i, 11);
                    Character.setJmpSpd(i, f0bc.params[0]);
                }
                CharData charData7 = Character.charData[i];
                charData7.actCur = (short) (charData7.actCur + 1);
                z7 = true;
            } else if (f0bc.commandId == 5) {
                int charIndex2 = (int) f0bc.params[0];
                if (charIndex2 == 2) {
                    charIndex2 = (Character.getCharIndex(Character.charData[i].charId) + 1) << 16;
                }
                Sound.play_se(charIndex2, 1, (int) f0bc.params[1]);
                CharData charData8 = Character.charData[i];
                charData8.actCur = (short) (charData8.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 6) {
                int charIndex3 = (int) f0bc.params[1];
                if (charIndex3 == 2) {
                    charIndex3 = (Character.getCharIndex(Character.charData[i].charId) + 1) << 16;
                }
                int iGetFrame = (int) f0bc.params[5];
                if (iGetFrame == 99999) {
                    iGetFrame = (int) Game.GetFrame(0, (int) f0bc.params[2]);
                }
                int i3 = Effect.set(charIndex3, (int) f0bc.params[2], Character.charData[i].f69x, Character.charData[i].f70y + Character.charData[i].height, Character.charData[i].f71z, f0bc.params[3], (int) f0bc.params[4], iGetFrame, f0bc.params[6]);
                if (f0bc.params[7] == 1.0f && i3 >= 0) {
                    Effect.homingBind(i3, Character.charData[i], Character.charData[i].height);
                }
                CharData charData9 = Character.charData[i];
                charData9.actCur = (short) (charData9.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 32 || f0bc.commandId == 41) {
                int charIndex4 = (int) f0bc.params[1];
                if (charIndex4 == 2) {
                    charIndex4 = (Character.getCharIndex(Character.charData[i].charId) + 1) << 16;
                }
                int iGetFrame2 = (int) f0bc.params[5];
                if (iGetFrame2 == 99999) {
                    iGetFrame2 = (int) Game.GetFrame(0, (int) f0bc.params[2]);
                }
                int i4 = (int) f0bc.params[6];
                int i5 = ((int) f0bc.params[7]) > 0 ? (((int) f0bc.params[7]) * 1000) + i : -1;
                float f9 = Character.charData[i].f69x;
                float f10 = Character.charData[i].height + Character.charData[i].f70y;
                float f11 = Character.charData[i].f71z;
                if (f0bc.commandId == 41) {
                    float[] fArrRelativeChange = Attack.relativeChange(Character.charData[i].dir, f0bc.params[11], f0bc.params[13], 0, false);
                    f9 += fArrRelativeChange[0];
                    f10 += f0bc.params[12];
                    f11 += fArrRelativeChange[1];
                }
                int i6 = Effect.set(charIndex4, (int) f0bc.params[2], f9, f10, f11, f0bc.params[3], (int) f0bc.params[4], iGetFrame2, i4, i5, ((int) f0bc.params[10]) == 1);
                int i7 = 0;
                if (f0bc.commandId == 41 && ((int) f0bc.params[8]) == 99) {
                    i7 = (int) (0 + f0bc.params[12]);
                }
                if (f0bc.params[9] > 0.0f && i6 >= 0) {
                    Effect.homingBind(i6, Character.charData[i], i7 + Character.charData[i].height);
                }
                CharData charData10 = Character.charData[i];
                charData10.actCur = (short) (charData10.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 33) {
                Effect.clear((((int) f0bc.params[0]) * 1000) + i);
                CharData charData11 = Character.charData[i];
                charData11.actCur = (short) (charData11.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 7) {
                if (f0bc.params[0] == 0.0f) {
                    Character.charData[i].f69x = f0bc.params[1];
                    Character.charData[i].f70y = f0bc.params[2];
                    Character.charData[i].f71z = f0bc.params[3];
                } else {
                    Character.charData[i].f69x = CameraData.gazX + f0bc.params[1];
                    Character.charData[i].f70y = CameraData.gazY + f0bc.params[2];
                    Character.charData[i].f71z = CameraData.gazZ + f0bc.params[3];
                }
                Character.charData[i].dir = f0bc.params[4];
                CharData charData12 = Character.charData[i];
                charData12.actCur = (short) (charData12.actCur + 1);
                z7 = true;
            } else if (f0bc.commandId == 8) {
                float charsDir = Character.charData[i].dir;
                if (Character.charData[i].thinkDir > 0.0f) {
                    fRotDir2 = Character.charData[i].thinkDir;
                } else {
                    if (f0bc.params[0] == 1.0f || f0bc.params[0] == 4.0f) {
                        byte b = 0;
                        if (Character.charData[i].targetChar >= 0 && Character.charData[Character.charData[i].targetChar].type >= 1) {
                            b = Character.charData[i].targetChar;
                        }
                        charsDir = Character.getCharsDir(i, b);
                        if (f0bc.params[0] == 4.0f) {
                            charsDir = Util.dir45(charsDir);
                            if (charsDir % 90.0f != 0.0f) {
                                charsDir -= 45.0f;
                            }
                        }
                    } else if (f0bc.params[0] == 2.0f) {
                        if (Character.charData[i].targetBlock >= 0) {
                            if (MapData.bugBlock[Character.charData[i].targetBlock].state == 0) {
                                Character.charData[i].targetBlock = (byte) -1;
                                if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                                }
                                CharData charData13 = Character.charData[i];
                                charData13.actCur = (short) (charData13.actCur + 1);
                                z7 = true;
                            } else {
                                charsDir = Util.atan2_360(MapData.bugBlock[Character.charData[i].targetBlock].f69x - Character.charData[i].f69x, MapData.bugBlock[Character.charData[i].targetBlock].f71z - Character.charData[i].f71z);
                            }
                        } else if (Character.charData[i].targetChar == -1) {
                            CharData charData14 = Character.charData[i];
                            charData14.actCur = (short) (charData14.actCur + 1);
                            z7 = true;
                        } else {
                            charsDir = Character.getCharsDir(i, Character.charData[i].targetChar);
                        }
                    } else if (f0bc.params[0] == 3.0f) {
                        charsDir = 0.0f;
                    }
                    fRotDir2 = Util.RotDir(charsDir, f0bc.params[1] * Character.charData[i].motionSpd);
                    Character.charData[i].thinkDir = fRotDir2;
                }
                Character.charData[i].dir = Util.RotDir(Character.charData[i].dir, Util.limitDiffDir(fRotDir2, Character.charData[i].dir, f0bc.params[2]));
                if (Character.charData[i].dir == fRotDir2) {
                    Character.charData[i].thinkDir = -1.0f;
                    CharData charData15 = Character.charData[i];
                    charData15.actCur = (short) (charData15.actCur + 1);
                    z7 = true;
                } else {
                    z7 = true;
                }
            } else if (f0bc.commandId == 9 || f0bc.commandId == 34) {
                if (Character.charData[i].actTimer > 0) {
                    CharData charData16 = Character.charData[i];
                    charData16.actTimer = (short) (charData16.actTimer - 1);
                    if (Character.charData[i].actTimer == 0) {
                        if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                            Character.motionSet(i, 0);
                        }
                        CharData charData17 = Character.charData[i];
                        charData17.actCur = (short) (charData17.actCur + 1);
                        z7 = true;
                    }
                } else {
                    Character.charData[i].actTimer = (short) f0bc.params[2];
                }
                if ((((int) f0bc.params[6]) & 1) == 1 && Character.charData[i].getBitState(128)) {
                    if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                        Character.motionSet(i, 0);
                    }
                    CharData charData18 = Character.charData[i];
                    charData18.actCur = (short) (charData18.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                } else if (f0bc.commandId == 34 && f0bc.params[7] >= 0.0f && Attack.checkAttack((int) f0bc.params[7], i, Character.charData[i], Character.charData[i].dir)) {
                    if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                        Character.motionSet(i, 0);
                    }
                    CharData charData19 = Character.charData[i];
                    charData19.actCur = (short) (charData19.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                } else {
                    float[] fArrRelativeChange2 = {0.0f, 0.0f};
                    if (f0bc.params[0] == 0.0f) {
                        byte b2 = Character.charData[i].targetChar;
                        if (Character.charData[i].targetChar == -1) {
                            if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                                Character.motionSet(i, 0);
                            }
                            CharData charData20 = Character.charData[i];
                            charData20.actCur = (short) (charData20.actCur + 1);
                            Character.charData[i].actTimer = (short) 0;
                            z7 = true;
                        } else {
                            float[] fArrRelativeChange3 = Attack.relativeChange(Character.charData[b2].dir, f0bc.params[3], f0bc.params[4], 0, false);
                            fArrRelativeChange3[0] = Character.charData[b2].f69x + fArrRelativeChange3[0];
                            fArrRelativeChange3[1] = Character.charData[b2].f71z + fArrRelativeChange3[1];
                            fArr = fArrRelativeChange3;
                            fAtan2_360 = Util.atan2_360(fArr[0] - Character.charData[i].f69x, fArr[1] - Character.charData[i].f71z);
                            if (((((int) f0bc.params[6]) >> 3) & 1) == 0) {
                                if (((((int) f0bc.params[6]) >> 4) & 1) == 1 || Character.charData[i].targetChar < 0) {
                                    Character.charData[i].dir = fAtan2_360;
                                } else {
                                    Character.charData[i].dir = Character.getCharsDir(i, Character.charData[i].targetChar);
                                }
                            }
                            if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                                Character.motionSet(i, 1);
                            }
                            if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                z = false;
                            } else {
                                z = true;
                            }
                            f = f0bc.params[1] * Character.charData[i].motionSpd;
                            f2 = Character.charData[i].f70y;
                            if (Game.MoveChar(i, fAtan2_360, f, z)) {
                                if (((((int) f0bc.params[6]) >> 1) & 1) == 1) {
                                    fAbs = f + Math.abs(Character.charData[i].f70y - f2);
                                    if (Util.getDistance(Character.charData[i].f69x, 0.0f, Character.charData[i].f71z, fArr[0], 0.0f, fArr[1]) <= fAbs * fAbs) {
                                        z2 = true;
                                        Character.charData[i].f69x = fArr[0];
                                        Character.charData[i].f71z = fArr[1];
                                    } else {
                                        z2 = false;
                                    }
                                } else if (MapData.w2b(Character.charData[i].f69x) == MapData.w2b(fArr[0]) || MapData.w2b(Character.charData[i].f71z) != MapData.w2b(fArr[1])) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                                        Character.motionSet(i, 0);
                                    }
                                    CharData charData21 = Character.charData[i];
                                    charData21.actCur = (short) (charData21.actCur + 1);
                                    Character.charData[i].actTimer = (short) 0;
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                            } else {
                                if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData22 = Character.charData[i];
                                charData22.actCur = (short) (charData22.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            }
                        }
                    } else {
                        if (f0bc.params[0] == 1.0f) {
                            fArrRelativeChange2[0] = Character.charData[i].f13ox + f0bc.params[3];
                            fArrRelativeChange2[1] = Character.charData[i].f15oz + f0bc.params[4];
                            fArr = fArrRelativeChange2;
                        } else if (f0bc.params[0] == 2.0f) {
                            fArrRelativeChange2[0] = f0bc.params[3];
                            fArrRelativeChange2[1] = f0bc.params[4];
                            fArr = fArrRelativeChange2;
                        } else if (f0bc.params[0] == 3.0f) {
                            float[] fArrRelativeChange4 = Attack.relativeChange(CameraData.dirDelay, f0bc.params[3], f0bc.params[4], 0, false);
                            fArrRelativeChange4[0] = CameraData.gazX + fArrRelativeChange4[0];
                            fArrRelativeChange4[1] = CameraData.gazZ + fArrRelativeChange4[1];
                            fArr = fArrRelativeChange4;
                        } else {
                            if (f0bc.params[0] == 4.0f) {
                                GameStatus.ExtraStatus extraStatus = GameStatus.EXTRA;
                                GameStatus.ExtraStatus extraStatus2 = GameStatus.EXTRA;
                                if (extraStatus.getType(1) > 0) {
                                    int cheatType = GameStatus.EXTRA.getCheatType();
                                    GameStatus.ExtraStatus extraStatus3 = GameStatus.EXTRA;
                                    if (cheatType == 1) {
                                        float[] fArrRelativeChange5 = Attack.relativeChange(CameraData.dirDelay, f0bc.params[3], f0bc.params[4], 0, false);
                                        fArrRelativeChange5[0] = GameStatus.GAME.cheatCursorPos.f69x + fArrRelativeChange5[0];
                                        fArrRelativeChange5[1] = GameStatus.GAME.cheatCursorPos.f71z + fArrRelativeChange5[1];
                                        fArr = fArrRelativeChange5;
                                    }
                                }
                            } else if (f0bc.params[0] == 6.0f) {
                                if (Attack.isTC()) {
                                    fArrRelativeChange2 = Attack.relativeChange(Character.charData[Attack.tcCharNo].dir, f0bc.params[3], f0bc.params[4], 0, false);
                                    fArrRelativeChange2[0] = Character.charData[Attack.tcCharNo].f69x + fArrRelativeChange2[0];
                                    fArrRelativeChange2[1] = Character.charData[Attack.tcCharNo].f71z + fArrRelativeChange2[1];
                                } else {
                                    if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                                        Character.motionSet(i, 0);
                                    }
                                    CharData charData23 = Character.charData[i];
                                    charData23.actCur = (short) (charData23.actCur + 1);
                                    Character.charData[i].actTimer = (short) 0;
                                    z7 = true;
                                }
                            }
                            fArr = fArrRelativeChange2;
                        }
                        fAtan2_360 = Util.atan2_360(fArr[0] - Character.charData[i].f69x, fArr[1] - Character.charData[i].f71z);
                        if (((((int) f0bc.params[6]) >> 3) & 1) == 0) {
                            if (((((int) f0bc.params[6]) >> 4) & 1) == 1) {
                                Character.charData[i].dir = fAtan2_360;
                            } else {
                                Character.charData[i].dir = fAtan2_360;
                            }
                        }
                        if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                            Character.motionSet(i, 1);
                        }
                        if (GameStatus.PLAYER.getNumberData(19) == 3) {
                            z = false;
                        } else {
                            z = true;
                        }
                        f = f0bc.params[1] * Character.charData[i].motionSpd;
                        f2 = Character.charData[i].f70y;
                        if (Game.MoveChar(i, fAtan2_360, f, z)) {
                            if (((((int) f0bc.params[6]) >> 1) & 1) == 1) {
                                fAbs = f + Math.abs(Character.charData[i].f70y - f2);
                                if (Util.getDistance(Character.charData[i].f69x, 0.0f, Character.charData[i].f71z, fArr[0], 0.0f, fArr[1]) <= fAbs * fAbs) {
                                    z2 = true;
                                    Character.charData[i].f69x = fArr[0];
                                    Character.charData[i].f71z = fArr[1];
                                } else {
                                    z2 = false;
                                }
                            } else if (MapData.w2b(Character.charData[i].f69x) == MapData.w2b(fArr[0])) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData24 = Character.charData[i];
                                charData24.actCur = (short) (charData24.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                        } else {
                            if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                                Character.motionSet(i, 0);
                            }
                            CharData charData25 = Character.charData[i];
                            charData25.actCur = (short) (charData25.actCur + 1);
                            Character.charData[i].actTimer = (short) 0;
                            z7 = true;
                        }
                    }
                }
            } else if (f0bc.commandId == 36) {
                if (Character.charData[i].actTimer > 0) {
                    CharData charData26 = Character.charData[i];
                    charData26.actTimer = (short) (charData26.actTimer - 1);
                    if (Character.charData[i].actTimer == 0) {
                        if (((((int) f0bc.params[7]) >> 2) & 1) == 0) {
                            Character.motionSet(i, 0);
                        }
                        CharData charData27 = Character.charData[i];
                        charData27.actCur = (short) (charData27.actCur + 1);
                        z7 = true;
                    }
                } else {
                    Character.charData[i].actTimer = (short) f0bc.params[2];
                }
                if ((((int) f0bc.params[7]) & 1) == 1 && Character.charData[i].getBitState(128)) {
                    if (((((int) f0bc.params[7]) >> 2) & 1) == 0) {
                        Character.motionSet(i, 0);
                    }
                    CharData charData28 = Character.charData[i];
                    charData28.actCur = (short) (charData28.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                } else if (f0bc.params[8] < 0.0f || !Attack.checkAttack((int) f0bc.params[8], i, Character.charData[i], Character.charData[i].dir)) {
                    float[] fArrRelativeChange6 = {0.0f, 0.0f, 0.0f};
                    if (f0bc.params[0] == 0.0f) {
                        byte b3 = Character.charData[i].targetChar;
                        if (Character.charData[i].targetChar == -1) {
                            if (((((int) f0bc.params[7]) >> 2) & 1) == 0) {
                                Character.motionSet(i, 0);
                            }
                            CharData charData29 = Character.charData[i];
                            charData29.actCur = (short) (charData29.actCur + 1);
                            Character.charData[i].actTimer = (short) 0;
                            z7 = true;
                        } else {
                            float[] fArrRelativeChange7 = Attack.relativeChange(Character.charData[b3].dir, f0bc.params[3], f0bc.params[5], 0, false);
                            fArrRelativeChange7[0] = Character.charData[b3].f69x + fArrRelativeChange7[0];
                            fArrRelativeChange7[1] = Character.charData[b3].f71z + fArrRelativeChange7[1];
                            fArrRelativeChange7[2] = Character.charData[b3].f70y;
                            fArr2 = fArrRelativeChange7;
                            float fLimitDiffDir = Util.limitDiffDir(Util.atan2_360(fArr2[2] - Character.charData[i].f70y, Util3D.sqrt(((fArr2[0] - Character.charData[i].f69x) * (fArr2[0] - Character.charData[i].f69x)) + ((fArr2[1] - Character.charData[i].f71z) * (fArr2[1] - Character.charData[i].f71z)))), 0.0f, f0bc.params[6]);
                            f8 = f0bc.params[1] * Character.charData[i].motionSpd;
                            Character.charData[i].f70y += FastMath.sin(fLimitDiffDir) * f8;
                            float fCos = FastMath.cos(fLimitDiffDir) * f8;
                            fRotDir = Util.RotDir(Character.charData[i].dir, Util.limitDiffDir(Util.atan2_360(fArr2[0] - Character.charData[i].f69x, fArr2[1] - Character.charData[i].f71z), Character.charData[i].dir, f0bc.params[6]));
                            Character.charData[i].f69x += FastMath.sin(fRotDir) * fCos;
                            CharData charData30 = Character.charData[i];
                            charData30.f71z = (fCos * FastMath.cos(fRotDir)) + charData30.f71z;
                            if (((((int) f0bc.params[7]) >> 3) & 1) == 0) {
                                if (((((int) f0bc.params[7]) >> 4) & 1) == 1 || Character.charData[i].targetChar < 0) {
                                    Character.charData[i].dir = fRotDir;
                                } else {
                                    Character.charData[i].dir = Character.getCharsDir(i, Character.charData[i].targetChar);
                                }
                            }
                            if (((((int) f0bc.params[7]) >> 1) & 1) == 1) {
                                if (Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, fArr2[0], fArr2[2], fArr2[1]) <= f8 * f8) {
                                    z6 = true;
                                    Character.charData[i].f69x = fArr2[0];
                                    Character.charData[i].f71z = fArr2[1];
                                    Character.charData[i].f70y = fArr2[2];
                                } else {
                                    z6 = false;
                                }
                            } else if (MapData.w2b(Character.charData[i].f69x) != MapData.w2b(fArr2[0]) && MapData.w2b(Character.charData[i].f71z) == MapData.w2b(fArr2[1]) && MapData.w2b(Character.charData[i].f70y) == MapData.w2b(fArr2[2])) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (((((int) f0bc.params[7]) >> 2) & 1) == 0) {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData31 = Character.charData[i];
                                charData31.actCur = (short) (charData31.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                        }
                    } else {
                        if (f0bc.params[0] == 1.0f) {
                            fArrRelativeChange6[0] = Character.charData[i].f13ox + f0bc.params[3];
                            fArrRelativeChange6[1] = Character.charData[i].f15oz + f0bc.params[4];
                            fArrRelativeChange6[2] = Character.charData[i].f14oy;
                            fArr2 = fArrRelativeChange6;
                        } else if (f0bc.params[0] == 2.0f) {
                            fArrRelativeChange6[0] = f0bc.params[3];
                            fArrRelativeChange6[1] = f0bc.params[5];
                            fArrRelativeChange6[2] = f0bc.params[4];
                            fArr2 = fArrRelativeChange6;
                        } else if (f0bc.params[0] == 3.0f) {
                            float[] fArrRelativeChange8 = Attack.relativeChange(CameraData.dirDelay, f0bc.params[3], f0bc.params[5], 0, false);
                            fArrRelativeChange8[0] = CameraData.gazX + fArrRelativeChange8[0];
                            fArrRelativeChange8[1] = CameraData.gazZ + fArrRelativeChange8[1];
                            fArrRelativeChange8[2] = CameraData.gazY;
                            fArr2 = fArrRelativeChange8;
                        } else {
                            if (f0bc.params[0] == 4.0f) {
                                GameStatus.ExtraStatus extraStatus4 = GameStatus.EXTRA;
                                GameStatus.ExtraStatus extraStatus5 = GameStatus.EXTRA;
                                if (extraStatus4.getType(1) > 0) {
                                    int cheatType2 = GameStatus.EXTRA.getCheatType();
                                    GameStatus.ExtraStatus extraStatus6 = GameStatus.EXTRA;
                                    if (cheatType2 == 1) {
                                        float[] fArrRelativeChange9 = Attack.relativeChange(CameraData.dirDelay, f0bc.params[3], f0bc.params[5], 0, false);
                                        fArrRelativeChange9[0] = GameStatus.GAME.cheatCursorPos.f69x + fArrRelativeChange9[0];
                                        fArrRelativeChange9[1] = GameStatus.GAME.cheatCursorPos.f71z + fArrRelativeChange9[1];
                                        fArrRelativeChange9[2] = GameStatus.GAME.cheatCursorPos.f70y;
                                        fArr2 = fArrRelativeChange9;
                                    }
                                }
                            } else if (f0bc.params[0] == 6.0f) {
                                if (Attack.isTC()) {
                                    fArrRelativeChange6 = Attack.relativeChange(Character.charData[Attack.tcCharNo].dir, f0bc.params[3], f0bc.params[4], 0, false);
                                    fArrRelativeChange6[0] = Character.charData[Attack.tcCharNo].f69x + fArrRelativeChange6[0];
                                    fArrRelativeChange6[1] = Character.charData[Attack.tcCharNo].f71z + fArrRelativeChange6[1];
                                    fArrRelativeChange6[2] = Character.charData[Attack.tcCharNo].f70y;
                                } else {
                                    if (((((int) f0bc.params[6]) >> 2) & 1) == 0) {
                                        Character.motionSet(i, 0);
                                    }
                                    CharData charData32 = Character.charData[i];
                                    charData32.actCur = (short) (charData32.actCur + 1);
                                    Character.charData[i].actTimer = (short) 0;
                                    z7 = true;
                                }
                            }
                            fArr2 = fArrRelativeChange6;
                        }
                        float fLimitDiffDir2 = Util.limitDiffDir(Util.atan2_360(fArr2[2] - Character.charData[i].f70y, Util3D.sqrt(((fArr2[0] - Character.charData[i].f69x) * (fArr2[0] - Character.charData[i].f69x)) + ((fArr2[1] - Character.charData[i].f71z) * (fArr2[1] - Character.charData[i].f71z)))), 0.0f, f0bc.params[6]);
                        f8 = f0bc.params[1] * Character.charData[i].motionSpd;
                        Character.charData[i].f70y += FastMath.sin(fLimitDiffDir2) * f8;
                        float fCos2 = FastMath.cos(fLimitDiffDir2) * f8;
                        fRotDir = Util.RotDir(Character.charData[i].dir, Util.limitDiffDir(Util.atan2_360(fArr2[0] - Character.charData[i].f69x, fArr2[1] - Character.charData[i].f71z), Character.charData[i].dir, f0bc.params[6]));
                        Character.charData[i].f69x += FastMath.sin(fRotDir) * fCos2;
                        CharData charData33 = Character.charData[i];
                        charData33.f71z = (fCos2 * FastMath.cos(fRotDir)) + charData33.f71z;
                        if (((((int) f0bc.params[7]) >> 3) & 1) == 0) {
                            if (((((int) f0bc.params[7]) >> 4) & 1) == 1) {
                                Character.charData[i].dir = fRotDir;
                            } else {
                                Character.charData[i].dir = fRotDir;
                            }
                        }
                        if (((((int) f0bc.params[7]) >> 1) & 1) == 1) {
                            if (Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, fArr2[0], fArr2[2], fArr2[1]) <= f8 * f8) {
                                z6 = true;
                                Character.charData[i].f69x = fArr2[0];
                                Character.charData[i].f71z = fArr2[1];
                                Character.charData[i].f70y = fArr2[2];
                            } else {
                                z6 = false;
                            }
                        } else if (MapData.w2b(Character.charData[i].f69x) != MapData.w2b(fArr2[0])) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            if (((((int) f0bc.params[7]) >> 2) & 1) == 0) {
                                Character.motionSet(i, 0);
                            }
                            CharData charData34 = Character.charData[i];
                            charData34.actCur = (short) (charData34.actCur + 1);
                            Character.charData[i].actTimer = (short) 0;
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                    }
                } else {
                    if (((((int) f0bc.params[7]) >> 2) & 1) == 0) {
                        Character.motionSet(i, 0);
                    }
                    CharData charData35 = Character.charData[i];
                    charData35.actCur = (short) (charData35.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                }
            } else if (f0bc.commandId == 10 || f0bc.commandId == 46 || f0bc.commandId == 63) {
                if (Character.charData[i].actTimer > 0) {
                    CharData charData36 = Character.charData[i];
                    charData36.actTimer = (short) (charData36.actTimer - 1);
                    if (Character.charData[i].actTimer == 0) {
                        CharData charData37 = Character.charData[i];
                        charData37.actCur = (short) (charData37.actCur + 1);
                        if (f0bc.params[0] != 4.0f && f0bc.params[0] != 5.0f) {
                            if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                Character.motionSet(i, 0);
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                        }
                    }
                } else {
                    Character.charData[i].actTimer = (short) f0bc.params[2];
                }
                float f12 = Character.charData[i].dir;
                float fAtan2_362 = Character.charData[i].angle;
                float f13 = f0bc.commandId == 46 ? f0bc.params[8] : 0.0f;
                if (f0bc.params[0] != 0.0f) {
                    float f14 = Character.charData[i].f13ox;
                    float f15 = Character.charData[i].f14oy;
                    float f16 = Character.charData[i].f15oz;
                    if (f0bc.params[0] == 2.0f) {
                        f14 = CameraData.gazX;
                        f15 = CameraData.gazY;
                        f16 = CameraData.gazZ;
                    } else if (f0bc.params[0] == 3.0f) {
                        GameStatus.ExtraStatus extraStatus7 = GameStatus.EXTRA;
                        GameStatus.ExtraStatus extraStatus8 = GameStatus.EXTRA;
                        if (extraStatus7.getType(1) > 0) {
                            int cheatType3 = GameStatus.EXTRA.getCheatType();
                            GameStatus.ExtraStatus extraStatus9 = GameStatus.EXTRA;
                            if (cheatType3 == 1) {
                                f14 = GameStatus.GAME.cheatCursorPos.f69x;
                                f15 = GameStatus.GAME.cheatCursorPos.f70y;
                                f16 = GameStatus.GAME.cheatCursorPos.f71z;
                            }
                        }
                    } else if (f0bc.params[0] == 4.0f || f0bc.params[0] == 5.0f) {
                        byte b4 = -1;
                        int i8 = 0;
                        while (true) {
                            byte b5 = b4;
                            if (i8 < extBindCharNo.length) {
                                if (extBindCharNo[i8] != i && extBindCharNo[i8] > 0 && Character.charData[extBindCharNo[i8]].use) {
                                    b5 = extBindCharNo[i8];
                                }
                                b4 = b5;
                                i8++;
                            } else {
                                if (b5 < 0) {
                                    z3 = f0bc.params[0] == 4.0f;
                                } else {
                                    float[] fArrRelativeChange10 = Attack.relativeChange(Character.charData[0].dir, 4.0f, -4.0f, 0, false);
                                    float[] fArrRelativeChange11 = Attack.relativeChange(Character.charData[0].dir, -4.0f, -4.0f, 0, false);
                                    int[] iArr = {(int) Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, Character.charData[0].f69x + fArrRelativeChange10[0], Character.charData[0].f70y, Character.charData[0].f71z + fArrRelativeChange10[1]), (int) Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, Character.charData[0].f69x + fArrRelativeChange11[0], Character.charData[0].f70y, Character.charData[0].f71z + fArrRelativeChange11[1]), (int) Util.getDistance(Character.charData[b5].f69x, Character.charData[b5].f70y, Character.charData[b5].f71z, Character.charData[0].f69x + fArrRelativeChange10[0], Character.charData[0].f70y, Character.charData[0].f71z + fArrRelativeChange10[1]), (int) Util.getDistance(Character.charData[b5].f69x, Character.charData[b5].f70y, Character.charData[b5].f71z, Character.charData[0].f69x + fArrRelativeChange11[0], Character.charData[0].f70y, Character.charData[0].f71z + fArrRelativeChange11[1])};
                                    int i9 = Integer.MAX_VALUE;
                                    int i10 = 0;
                                    for (int i11 = 0; i11 < iArr.length; i11++) {
                                        if (i9 > iArr[i11]) {
                                            i9 = iArr[i11];
                                            i10 = i11;
                                        }
                                    }
                                    z3 = i10 == 0 || i10 == 3;
                                }
                                float[] fArrRelativeChange12 = Attack.relativeChange(Character.charData[0].dir, z3 ? 4 : -4, -4, 0, false);
                                f14 = fArrRelativeChange12[0] + Character.charData[0].f69x;
                                f15 = Character.charData[0].f70y;
                                f16 = fArrRelativeChange12[1] + Character.charData[0].f71z;
                            }
                        }
                    } else if (f0bc.params[0] == 6.0f) {
                        if (!Attack.isTC() || Attack.tcCharNo <= 0) {
                            if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                Character.motionSet(i, 0);
                            }
                            CharData charData38 = Character.charData[i];
                            charData38.actCur = (short) (charData38.actCur + 1);
                            Character.charData[i].actTimer = (short) 0;
                            z7 = true;
                        } else if (Character.charData[i].hitChar == Attack.tcCharNo) {
                            if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                Character.motionSet(i, 0);
                            }
                            CharData charData39 = Character.charData[i];
                            charData39.actCur = (short) (charData39.actCur + 1);
                            Character.charData[i].actTimer = (short) 0;
                            z7 = true;
                        } else {
                            float[] fArrRelativeChange13 = Attack.relativeChange(Character.charData[Attack.tcCharNo].dir, Character.charData[Attack.tcCharNo].ahX, Character.charData[Attack.tcCharNo].ahZ, 0, false);
                            f14 = fArrRelativeChange13[0] + Character.charData[Attack.tcCharNo].f69x;
                            f15 = Character.charData[Attack.tcCharNo].f70y;
                            f16 = fArrRelativeChange13[1] + Character.charData[Attack.tcCharNo].f71z;
                        }
                    }
                    float f17 = ((f16 - Character.charData[i].f71z) * (f16 - Character.charData[i].f71z)) + ((f14 - Character.charData[i].f69x) * (f14 - Character.charData[i].f69x));
                    float fAtan2_363 = Util.atan2_360(f14 - Character.charData[i].f69x, f16 - Character.charData[i].f71z);
                    if (f0bc.commandId == 46) {
                        fAtan2_362 = Util.atan2_360((f15 + f13) - Character.charData[i].f70y, Util3D.sqrt(f17));
                        f3 = ((f16 - Character.charData[i].f71z) * (f16 - Character.charData[i].f71z)) + ((f15 - Character.charData[i].f70y) * (f15 - Character.charData[i].f70y)) + ((f14 - Character.charData[i].f69x) * (f14 - Character.charData[i].f69x));
                    } else {
                        f3 = f17;
                    }
                    if (f3 <= 4.0f) {
                        if (f0bc.params[0] == 4.0f || f0bc.params[0] == 5.0f) {
                            Character.charData[i].dir = Character.charData[0].dir;
                        }
                        if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                            Character.motionSet(i, 0);
                        }
                        CharData charData40 = Character.charData[i];
                        charData40.actCur = (short) (charData40.actCur + 1);
                        Character.charData[i].actTimer = (short) 0;
                        z7 = true;
                    } else {
                        fAtan2_361 = fAtan2_363;
                        z4 = false;
                        if (f0bc.commandId == 46) {
                            Character.charData[i].angle = fAtan2_362;
                        }
                        Character.charData[i].dir = Util.RotDir(Character.charData[i].dir, Util.limitDiffDir(fAtan2_361, Character.charData[i].dir, f0bc.params[4]));
                        f4 = Character.charData[i].motionSpd * f0bc.params[1];
                        if (f0bc.commandId == 46) {
                            if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if (f0bc.params[0] != 4.0f) {
                            }
                            if (f0bc.commandId == 46) {
                                Character.motionSet(i, 1);
                            } else {
                                Character.motionSet(i, 1);
                            }
                            if (!Game.MoveChar(i, fAtan2_361, f4, z5)) {
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData41 = Character.charData[i];
                                charData41.actCur = (short) (charData41.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else if (f0bc.commandId == 46) {
                                pointCollisionHighest = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                                if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                    f0bc.params[5] = 0.0f;
                                }
                                if (((((int) f0bc.params[7]) >> 3) & 1) == 1) {
                                    pointCollisionHighest = 0.0f;
                                }
                                if (Character.charData[i].f70y >= f0bc.params[5] + pointCollisionHighest) {
                                }
                                if (((((int) f0bc.params[7]) >> 4) & 1) == 0) {
                                    if (Character.charData[i].f70y < f0bc.params[5] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[5];
                                    } else if (Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[6];
                                    }
                                }
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData42 = Character.charData[i];
                                charData42.actCur = (short) (charData42.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                        } else {
                            if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if (f0bc.params[0] != 4.0f) {
                            }
                            if (f0bc.commandId == 46) {
                                Character.motionSet(i, 1);
                            } else {
                                Character.motionSet(i, 1);
                            }
                            if (!Game.MoveChar(i, fAtan2_361, f4, z5)) {
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData43 = Character.charData[i];
                                charData43.actCur = (short) (charData43.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else if (f0bc.commandId == 46) {
                                pointCollisionHighest = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                                if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                    f0bc.params[5] = 0.0f;
                                }
                                if (((((int) f0bc.params[7]) >> 3) & 1) == 1) {
                                    pointCollisionHighest = 0.0f;
                                }
                                if (Character.charData[i].f70y >= f0bc.params[5] + pointCollisionHighest) {
                                }
                                if (((((int) f0bc.params[7]) >> 4) & 1) == 0) {
                                    if (Character.charData[i].f70y < f0bc.params[5] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[5];
                                    } else if (Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[6];
                                    }
                                }
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData44 = Character.charData[i];
                                charData44.actCur = (short) (charData44.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                        }
                    }
                } else if (Character.charData[i].targetBlock < 0) {
                    byte b6 = Character.charData[i].targetChar;
                    if (b6 == -1) {
                        if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                            Character.motionSet(i, 0);
                        }
                        CharData charData45 = Character.charData[i];
                        charData45.actCur = (short) (charData45.actCur + 1);
                        Character.charData[i].actTimer = (short) 0;
                        z7 = true;
                    } else {
                        float charsDir2 = Character.getCharsDir(i, b6);
                        if (f0bc.commandId == 46) {
                            fAtan2_362 = Util.atan2_360((Character.charData[b6].f70y + f13) - Character.charData[i].f70y, Util3D.sqrt(Character.getCharsXZLen2(i, b6)));
                        }
                        if (Character.charData[i].hitChar != b6 && ((f0bc.params[3] < 0.0f || !Attack.checkAttack((int) f0bc.params[3], i, Character.charData[i], charsDir2)) && (f0bc.commandId != 63 || f0bc.params[5] <= 0.0f || Math.abs((Character.charData[i].f70y + Character.charData[i].ahY) - (Character.charData[b6].f70y + Character.charData[b6].ahY)) < f0bc.params[5] || !Character.checkCharsHitXZ(i, b6)))) {
                            fAtan2_361 = charsDir2;
                            z4 = false;
                        } else if (f0bc.commandId == 46 && ((((int) f0bc.params[7]) >> 2) & 1) == 1 && Math.abs(Character.charData[i].f70y - Character.charData[b6].f70y) >= 0.5f) {
                            z4 = true;
                            fAtan2_361 = charsDir2;
                        } else {
                            if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                Character.motionSet(i, 0);
                            }
                            CharData charData46 = Character.charData[i];
                            charData46.actCur = (short) (charData46.actCur + 1);
                            Character.charData[i].actTimer = (short) 0;
                            z7 = true;
                        }
                        if (f0bc.commandId == 46) {
                            Character.charData[i].angle = fAtan2_362;
                        }
                        Character.charData[i].dir = Util.RotDir(Character.charData[i].dir, Util.limitDiffDir(fAtan2_361, Character.charData[i].dir, f0bc.params[4]));
                        f4 = Character.charData[i].motionSpd * f0bc.params[1];
                        if (f0bc.commandId == 46) {
                            if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            z5 = f0bc.params[0] != 4.0f ? false : false;
                            if (f0bc.commandId == 46) {
                                Character.motionSet(i, 1);
                            } else {
                                Character.motionSet(i, 1);
                            }
                            if (!Game.MoveChar(i, fAtan2_361, f4, z5)) {
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData47 = Character.charData[i];
                                charData47.actCur = (short) (charData47.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else if (f0bc.commandId == 46) {
                                pointCollisionHighest = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                                if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                    f0bc.params[5] = 0.0f;
                                }
                                if (((((int) f0bc.params[7]) >> 3) & 1) == 1) {
                                    pointCollisionHighest = 0.0f;
                                }
                                if (Character.charData[i].f70y >= f0bc.params[5] + pointCollisionHighest) {
                                }
                                if (((((int) f0bc.params[7]) >> 4) & 1) == 0) {
                                    if (Character.charData[i].f70y < f0bc.params[5] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[5];
                                    } else if (Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[6];
                                    }
                                }
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData48 = Character.charData[i];
                                charData48.actCur = (short) (charData48.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                        } else {
                            if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if (f0bc.params[0] != 4.0f) {
                            }
                            if (f0bc.commandId == 46) {
                                Character.motionSet(i, 1);
                            } else {
                                Character.motionSet(i, 1);
                            }
                            if (!Game.MoveChar(i, fAtan2_361, f4, z5)) {
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData49 = Character.charData[i];
                                charData49.actCur = (short) (charData49.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else if (f0bc.commandId == 46) {
                                pointCollisionHighest = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                                if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                    f0bc.params[5] = 0.0f;
                                }
                                if (((((int) f0bc.params[7]) >> 3) & 1) == 1) {
                                    pointCollisionHighest = 0.0f;
                                }
                                if (Character.charData[i].f70y >= f0bc.params[5] + pointCollisionHighest) {
                                }
                                if (((((int) f0bc.params[7]) >> 4) & 1) == 0) {
                                    if (Character.charData[i].f70y < f0bc.params[5] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[5];
                                    } else if (Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[6];
                                    }
                                }
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData410 = Character.charData[i];
                                charData410.actCur = (short) (charData410.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                        }
                    }
                } else if (MapData.bugBlock[Character.charData[i].targetBlock].state == 0) {
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                    Character.charData[i].targetBlock = (byte) -1;
                    if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                        Character.motionSet(i, 0);
                    }
                    CharData charData50 = Character.charData[i];
                    charData50.actCur = (short) (charData50.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                } else {
                    float f18 = ((MapData.bugBlock[Character.charData[i].targetBlock].f69x - Character.charData[i].f69x) * (MapData.bugBlock[Character.charData[i].targetBlock].f69x - Character.charData[i].f69x)) + ((MapData.bugBlock[Character.charData[i].targetBlock].f71z - Character.charData[i].f71z) * (MapData.bugBlock[Character.charData[i].targetBlock].f71z - Character.charData[i].f71z));
                    fAtan2_361 = Util.atan2_360(MapData.bugBlock[Character.charData[i].targetBlock].f69x - Character.charData[i].f69x, MapData.bugBlock[Character.charData[i].targetBlock].f71z - Character.charData[i].f71z);
                    float fAtan2_364 = f0bc.commandId == 46 ? Util.atan2_360((MapData.bugBlock[Character.charData[i].targetBlock].f70y + f13) - Character.charData[i].f70y, Util3D.sqrt(f18)) : fAtan2_362;
                    if ((((int) f0bc.params[3]) < 0 || !Attack.checkAttackBlockNo((int) f0bc.params[3], i, Character.charData[i], Character.charData[i].targetBlock)) && !(MapData.w2b(MapData.bugBlock[Character.charData[i].targetBlock].f69x) == MapData.w2b(Character.charData[i].f69x) && MapData.w2b(MapData.bugBlock[Character.charData[i].targetBlock].f71z) == MapData.w2b(Character.charData[i].f71z))) {
                        fAtan2_362 = fAtan2_364;
                        z4 = false;
                        if (f0bc.commandId == 46) {
                            Character.charData[i].angle = fAtan2_362;
                        }
                        Character.charData[i].dir = Util.RotDir(Character.charData[i].dir, Util.limitDiffDir(fAtan2_361, Character.charData[i].dir, f0bc.params[4]));
                        f4 = Character.charData[i].motionSpd * f0bc.params[1];
                        if (f0bc.commandId == 46 || Character.charData[i].position != 1) {
                            if (GameStatus.PLAYER.getNumberData(19) == 3) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if ((f0bc.params[0] != 4.0f || f0bc.params[0] == 5.0f) && Character.getCharsLen2(0, i) < 50) {
                            }
                            if (f0bc.commandId == 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                Character.motionSet(i, 1);
                            }
                            if (!Game.MoveChar(i, fAtan2_361, f4, z5)) {
                                if (f0bc.commandId == 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData411 = Character.charData[i];
                                charData411.actCur = (short) (charData411.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else if (f0bc.commandId == 46) {
                                pointCollisionHighest = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                                if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                    f0bc.params[5] = 0.0f;
                                }
                                if (((((int) f0bc.params[7]) >> 3) & 1) == 1) {
                                    pointCollisionHighest = 0.0f;
                                }
                                if (Character.charData[i].f70y >= f0bc.params[5] + pointCollisionHighest || Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                    if (((((int) f0bc.params[7]) >> 4) & 1) == 0) {
                                        if (Character.charData[i].f70y < f0bc.params[5] + pointCollisionHighest) {
                                            Character.charData[i].f70y = pointCollisionHighest + f0bc.params[5];
                                        } else if (Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                            Character.charData[i].f70y = pointCollisionHighest + f0bc.params[6];
                                        }
                                    }
                                    if (f0bc.commandId == 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                        Character.motionSet(i, 0);
                                    }
                                    CharData charData412 = Character.charData[i];
                                    charData412.actCur = (short) (charData412.actCur + 1);
                                    Character.charData[i].actTimer = (short) 0;
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                            } else {
                                z7 = true;
                            }
                        } else {
                            float fSin = FastMath.sin(Character.charData[i].angle) * f4;
                            float fCos3 = f4 * FastMath.cos(Character.charData[i].angle);
                            Character.charData[i].f70y += fSin;
                            if (!z4) {
                                float fGetCharCollision = GameCommon.GetCharCollision(i);
                                if ((((int) f0bc.params[7]) & 1) == 1) {
                                    if (fSin < 0.0f && fGetCharCollision > Character.charData[i].f70y) {
                                        Character.charData[i].f70y = fGetCharCollision;
                                    } else if (fSin > 0.0f && MapData.bugBlockHitCheck(Character.charData[i]) >= 0) {
                                        Character.charData[i].f70y -= fSin;
                                    }
                                    boolean z9 = GameStatus.PLAYER.getNumberData(19) != 3;
                                    if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                        Character.motionSet(i, 1);
                                    }
                                    if (!Game.MoveChar(i, fAtan2_361, fCos3, z9)) {
                                        if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                            Character.motionSet(i, 0);
                                        }
                                        CharData charData51 = Character.charData[i];
                                        charData51.actCur = (short) (charData51.actCur + 1);
                                        Character.charData[i].actTimer = (short) 0;
                                        z7 = true;
                                    } else if (f0bc.commandId == 46) {
                                        pointCollisionHighest = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                                        if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                            f0bc.params[5] = 0.0f;
                                        }
                                        if (((((int) f0bc.params[7]) >> 3) & 1) == 1) {
                                            pointCollisionHighest = 0.0f;
                                        }
                                        if (Character.charData[i].f70y >= f0bc.params[5] + pointCollisionHighest) {
                                        }
                                        if (((((int) f0bc.params[7]) >> 4) & 1) == 0) {
                                            if (Character.charData[i].f70y < f0bc.params[5] + pointCollisionHighest) {
                                                Character.charData[i].f70y = pointCollisionHighest + f0bc.params[5];
                                            } else if (Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                                Character.charData[i].f70y = pointCollisionHighest + f0bc.params[6];
                                            }
                                        }
                                        if (f0bc.commandId == 46) {
                                            Character.motionSet(i, 0);
                                        } else {
                                            Character.motionSet(i, 0);
                                        }
                                        CharData charData413 = Character.charData[i];
                                        charData413.actCur = (short) (charData413.actCur + 1);
                                        Character.charData[i].actTimer = (short) 0;
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                } else {
                                    if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                        Character.motionSet(i, 1);
                                    }
                                    float fSin2 = FastMath.sin(fAtan2_361) * fCos3;
                                    float fCos4 = FastMath.cos(fAtan2_361) * fCos3;
                                    Character.charData[i].f69x += fSin2;
                                    Character.charData[i].f71z += fCos4;
                                    if (GameCommon.GetCharCollision(i, false) < 0.0f) {
                                        Character.charData[i].f69x -= fSin2;
                                        Character.charData[i].f71z -= fCos4;
                                        if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                                            Character.motionSet(i, 0);
                                        }
                                        CharData charData52 = Character.charData[i];
                                        charData52.actCur = (short) (charData52.actCur + 1);
                                        Character.charData[i].actTimer = (short) 0;
                                        z7 = true;
                                    } else if (f0bc.commandId == 46) {
                                        pointCollisionHighest = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                                        if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                            f0bc.params[5] = 0.0f;
                                        }
                                        if (((((int) f0bc.params[7]) >> 3) & 1) == 1) {
                                            pointCollisionHighest = 0.0f;
                                        }
                                        if (Character.charData[i].f70y >= f0bc.params[5] + pointCollisionHighest) {
                                        }
                                        if (((((int) f0bc.params[7]) >> 4) & 1) == 0) {
                                            if (Character.charData[i].f70y < f0bc.params[5] + pointCollisionHighest) {
                                                Character.charData[i].f70y = pointCollisionHighest + f0bc.params[5];
                                            } else if (Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                                Character.charData[i].f70y = pointCollisionHighest + f0bc.params[6];
                                            }
                                        }
                                        if (f0bc.commandId == 46) {
                                            Character.motionSet(i, 0);
                                        } else {
                                            Character.motionSet(i, 0);
                                        }
                                        CharData charData414 = Character.charData[i];
                                        charData414.actCur = (short) (charData414.actCur + 1);
                                        Character.charData[i].actTimer = (short) 0;
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                }
                            } else if (f0bc.commandId == 46) {
                                pointCollisionHighest = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                                if (GameStatus.PLAYER.getNumberData(19) == 5) {
                                    f0bc.params[5] = 0.0f;
                                }
                                if (((((int) f0bc.params[7]) >> 3) & 1) == 1) {
                                    pointCollisionHighest = 0.0f;
                                }
                                if (Character.charData[i].f70y >= f0bc.params[5] + pointCollisionHighest) {
                                }
                                if (((((int) f0bc.params[7]) >> 4) & 1) == 0) {
                                    if (Character.charData[i].f70y < f0bc.params[5] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[5];
                                    } else if (Character.charData[i].f70y > f0bc.params[6] + pointCollisionHighest) {
                                        Character.charData[i].f70y = pointCollisionHighest + f0bc.params[6];
                                    }
                                }
                                if (f0bc.commandId == 46) {
                                    Character.motionSet(i, 0);
                                } else {
                                    Character.motionSet(i, 0);
                                }
                                CharData charData415 = Character.charData[i];
                                charData415.actCur = (short) (charData415.actCur + 1);
                                Character.charData[i].actTimer = (short) 0;
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                        }
                    } else {
                        if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                        }
                        if (f0bc.commandId != 46 || ((((int) f0bc.params[7]) >> 1) & 1) == 0) {
                            Character.motionSet(i, 0);
                        }
                        CharData charData53 = Character.charData[i];
                        charData53.actCur = (short) (charData53.actCur + 1);
                        Character.charData[i].actTimer = (short) 0;
                        z7 = true;
                    }
                }
            } else if (f0bc.commandId == 11 || f0bc.commandId == 45) {
                if (Character.charData[i].actTimer > 0) {
                    CharData charData54 = Character.charData[i];
                    charData54.actTimer = (short) (charData54.actTimer - 1);
                    if (Character.charData[i].actTimer == 0) {
                        if (((((int) f0bc.params[3]) >> 1) & 1) == 0) {
                            Character.motionSet(i, 0);
                        }
                        CharData charData55 = Character.charData[i];
                        charData55.actCur = (short) (charData55.actCur + 1);
                        z7 = true;
                    }
                } else {
                    Character.charData[i].actTimer = (short) f0bc.params[1];
                }
                if (!((((int) f0bc.params[3]) & 1) == 1 && Character.charData[i].getBitState(128)) && (f0bc.params[2] < 0.0f || !Attack.checkAttack((int) f0bc.params[2], i, Character.charData[i], Character.charData[i].dir))) {
                    float fCos5 = f0bc.params[0] * Character.charData[i].motionSpd;
                    if (f0bc.commandId == 45) {
                        float fSin3 = FastMath.sin(Character.charData[i].angle) * fCos5;
                        Character.charData[i].f70y += fSin3;
                        float fGetCharCollision2 = GameCommon.GetCharCollision(i);
                        if (fSin3 < 0.0f && fGetCharCollision2 > Character.charData[i].f70y) {
                            Character.charData[i].f70y = fGetCharCollision2;
                        } else if (fSin3 > 0.0f && MapData.bugBlockHitCheck(Character.charData[i]) >= 0) {
                            Character.charData[i].f70y -= fSin3;
                        }
                        fCos5 *= FastMath.cos(Character.charData[i].angle);
                    }
                    boolean z10 = GameStatus.PLAYER.getNumberData(19) != 3;
                    if (((((int) f0bc.params[3]) >> 1) & 1) == 0) {
                        Character.motionSet(i, 1);
                    }
                    if (!Game.MoveChar(i, Character.charData[i].dir, fCos5, z10)) {
                        if (((((int) f0bc.params[3]) >> 1) & 1) == 0) {
                            Character.motionSet(i, 0);
                        }
                        CharData charData56 = Character.charData[i];
                        charData56.actCur = (short) (charData56.actCur + 1);
                        Character.charData[i].actTimer = (short) 0;
                        z7 = true;
                    } else if (f0bc.commandId == 45) {
                        float pointCollisionHighest2 = MapData.getPointCollisionHighest(Character.charData[i].f69x, Character.charData[i].f71z);
                        if (((((int) f0bc.params[3]) >> 3) & 1) == 1) {
                            pointCollisionHighest2 = 0.0f;
                        }
                        if (Character.charData[i].f70y < f0bc.params[4] + pointCollisionHighest2 || Character.charData[i].f70y > f0bc.params[5] + pointCollisionHighest2) {
                            if (((((int) f0bc.params[3]) >> 4) & 1) == 0) {
                                if (Character.charData[i].f70y < f0bc.params[4] + pointCollisionHighest2) {
                                    Character.charData[i].f70y = pointCollisionHighest2 + f0bc.params[4];
                                } else if (Character.charData[i].f70y > f0bc.params[5] + pointCollisionHighest2) {
                                    Character.charData[i].f70y = pointCollisionHighest2 + f0bc.params[5];
                                }
                            }
                            if (((((int) f0bc.params[3]) >> 1) & 1) == 0) {
                                Character.motionSet(i, 0);
                            }
                            CharData charData57 = Character.charData[i];
                            charData57.actCur = (short) (charData57.actCur + 1);
                            Character.charData[i].actTimer = (short) 0;
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                    } else {
                        z7 = true;
                    }
                } else {
                    if (((((int) f0bc.params[3]) >> 1) & 1) == 0) {
                        Character.motionSet(i, 0);
                    }
                    CharData charData58 = Character.charData[i];
                    charData58.actCur = (short) (charData58.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                }
            } else if (f0bc.commandId == 12) {
                if (Character.charData[i].actTimer > 0) {
                    CharData charData59 = Character.charData[i];
                    charData59.actTimer = (short) (charData59.actTimer - 1);
                    if (Character.charData[i].actTimer == 0) {
                        Character.motionSet(i, 0);
                        CharData charData60 = Character.charData[i];
                        charData60.actCur = (short) (charData60.actCur + 1);
                        z7 = true;
                    }
                } else {
                    Character.charData[i].actTimer = (short) f0bc.params[1];
                }
                if (f0bc.params[2] < 0.0f || !Attack.checkAttack((int) f0bc.params[2], i, Character.charData[i], Character.charData[i].dir)) {
                    Character.motionSet(i, 1);
                    float fSin4 = FastMath.sin(Character.charData[i].dir) * f0bc.params[0];
                    float fCos6 = FastMath.cos(Character.charData[i].dir) * f0bc.params[0];
                    Character.charData[i].f69x += fSin4;
                    Character.charData[i].f71z += fCos6;
                    if (GameCommon.GetCharCollision(i, false) < 0.0f) {
                        Character.charData[i].f69x -= fSin4;
                        Character.charData[i].f71z -= fCos6;
                        CharData charData61 = Character.charData[i];
                        charData61.actCur = (short) (charData61.actCur + 1);
                        Character.charData[i].actTimer = (short) 0;
                        Character.motionSet(i, 0);
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                } else {
                    Character.motionSet(i, 0);
                    CharData charData62 = Character.charData[i];
                    charData62.actCur = (short) (charData62.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                }
            } else if (f0bc.commandId == 13) {
                if (Character.charData[i].actTimer > 0) {
                    CharData charData63 = Character.charData[i];
                    charData63.actTimer = (short) (charData63.actTimer - 1);
                    if (Character.charData[i].actTimer == 0) {
                        Character.motionSet(i, 0);
                        CharData charData64 = Character.charData[i];
                        charData64.actCur = (short) (charData64.actCur + 1);
                        z7 = true;
                    }
                } else {
                    Character.charData[i].actTimer = (short) f0bc.params[2];
                }
                float fRotDir3 = Character.charData[i].dir;
                if (((int) f0bc.params[0]) != 0) {
                    GameStatus.ExtraStatus extraStatus10 = GameStatus.EXTRA;
                    GameStatus.ExtraStatus extraStatus11 = GameStatus.EXTRA;
                    if (extraStatus10.getType(1) > 0) {
                        int cheatType4 = GameStatus.EXTRA.getCheatType();
                        GameStatus.ExtraStatus extraStatus12 = GameStatus.EXTRA;
                        if (cheatType4 == 1) {
                            fRotDir3 = Util.RotDir(Util.atan2_360(GameStatus.GAME.cheatCursorPos.f69x - Character.charData[i].f69x, GameStatus.GAME.cheatCursorPos.f71z - Character.charData[i].f71z), Character.charData[i].random(-30, 30) + 180);
                            Character.charData[i].dir = Util.RotDir(Character.charData[i].dir, Util.limitDiffDir(fRotDir3, Character.charData[i].dir, f0bc.params[3]));
                        }
                    }
                } else if (Character.charData[i].targetChar == -1) {
                    Character.motionSet(i, 0);
                    CharData charData65 = Character.charData[i];
                    charData65.actCur = (short) (charData65.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                } else {
                    fRotDir3 = Util.RotDir(Character.getCharsDir(i, Character.charData[i].targetChar), Character.charData[i].random(-30, 30) + 180);
                    Character.charData[i].dir = Util.RotDir(Character.charData[i].dir, Util.limitDiffDir(fRotDir3, Character.charData[i].dir, f0bc.params[3]));
                }
                boolean z11 = GameStatus.PLAYER.getNumberData(19) != 3;
                Character.motionSet(i, 1);
                if (Game.MoveChar(i, fRotDir3, f0bc.params[1] * Character.charData[i].motionSpd, z11)) {
                    z7 = true;
                } else {
                    Character.motionSet(i, 0);
                    CharData charData66 = Character.charData[i];
                    charData66.actCur = (short) (charData66.actCur + 1);
                    Character.charData[i].actTimer = (short) 0;
                    z7 = true;
                }
            } else if (f0bc.commandId == 52) {
                if (Character.charData[i].actTimer > 0) {
                    CharData charData67 = Character.charData[i];
                    short s2 = (short) (charData67.actTimer - 1);
                    charData67.actTimer = s2;
                    if (s2 == 0) {
                        Character.charData[i].setBitState(1024, false);
                        Character.charData[i].alpha = (short) 255;
                        Character.charData[i].f70y += 6.0f;
                        Character.charData[i].setBitState(4, true);
                        if (Character.charData[i].motion == 0 || Character.charData[i].motion == 1) {
                            Character.motionSet(i, 13);
                        }
                        CharData charData68 = Character.charData[i];
                        charData68.actCur = (short) (charData68.actCur + 1);
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                } else {
                    Character.charData[i].actTimer = (short) f0bc.params[1];
                    if (Character.charData[i].actTimer > 0) {
                        Character.charData[i].setBitState(1024, true);
                        Character.charData[i].alpha = (short) 0;
                    }
                    float f19 = Character.charData[i].dir;
                    float f20 = Character.charData[i].f69x;
                    float f21 = Character.charData[i].f70y;
                    float f22 = Character.charData[i].f71z;
                    if (((int) f0bc.params[0]) == 0) {
                        if (Character.charData[i].targetBlock >= 0 && MapData.bugBlock[Character.charData[i].targetBlock].state == 0) {
                            Character.charData[i].targetBlock = (byte) -1;
                        }
                        if (Character.charData[i].targetBlock >= 0) {
                            float f23 = MapData.bugBlock[Character.charData[i].targetBlock].f69x;
                            f21 = MapData.bugBlock[Character.charData[i].targetBlock].f70y;
                            f5 = MapData.bugBlock[Character.charData[i].targetBlock].f71z;
                            f6 = f23;
                            f7 = f19;
                        } else if (Character.charData[i].targetChar >= 0) {
                            float fRotDir4 = Util.RotDir(Character.charData[Character.charData[i].targetChar].dir, 180.0f);
                            float f24 = Character.charData[Character.charData[i].targetChar].f69x;
                            f21 = Character.charData[Character.charData[i].targetChar].f70y;
                            f5 = Character.charData[Character.charData[i].targetChar].f71z;
                            f6 = f24;
                            f7 = fRotDir4;
                        } else {
                            f5 = f22;
                            f6 = f20;
                            f7 = f19;
                        }
                    } else if (((int) f0bc.params[0]) == 1) {
                        float f25 = Character.charData[0].dir;
                        float f26 = Character.charData[0].f69x;
                        f21 = Character.charData[0].f70y;
                        f5 = Character.charData[0].f71z;
                        f6 = f26;
                        f7 = f25;
                    } else {
                        f5 = f22;
                        f6 = f20;
                        f7 = f19;
                    }
                    int[][] iArr2 = {new int[]{0, -6}, new int[]{-6, 0}, new int[]{6, 0}, new int[]{0, 6}, new int[]{0, 0}};
                    int i12 = 0;
                    while (true) {
                        int i13 = i12;
                        if (i13 < 5) {
                            float[] fArrRelativeChange14 = Attack.relativeChange(f7, iArr2[i13][0], iArr2[i13][1], 0, false);
                            float areaCollision = MapData.getAreaCollision(MapData.w2bc(Math.max(0.0f, fArrRelativeChange14[0] + f6)), f21, MapData.w2bc(Math.max(0.0f, fArrRelativeChange14[1] + f5)), 0.0f, 0.0f, true);
                            if (areaCollision < 0.0f || areaCollision - 8.0f > f21 || f21 > 8.0f + areaCollision) {
                                i12 = i13 + 1;
                            } else {
                                Character.charData[i].dir = f7;
                                Character.charData[i].f69x = MapData.w2bc(Math.max(0.0f, fArrRelativeChange14[0] + f6));
                                Character.charData[i].f71z = MapData.w2bc(Math.max(0.0f, fArrRelativeChange14[1] + f5));
                                Character.charData[i].f70y = areaCollision + 6.0f;
                                if ((((int) f0bc.params[1]) == 0 && Character.charData[i].motion == 0) || Character.charData[i].motion == 1) {
                                    Character.motionSet(i, 13);
                                }
                            }
                        }
                    }
                    if (((int) f0bc.params[2]) >= 0) {
                        Effect.set((int) f0bc.params[2], (int) f0bc.params[3], Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, 1.0f, 0, 0, 0.0f, -1, false);
                    }
                    if (((int) f0bc.params[1]) == 0) {
                        CharData charData69 = Character.charData[i];
                        charData69.actCur = (short) (charData69.actCur + 1);
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                }
            } else if (f0bc.commandId == 14) {
                Character.charData[i].thinkIfNest = (byte) 0;
                Character.charData[i].thinkId = (short) 0;
                Character.charData[i].thinkCur = (short) 0;
                CharData charData70 = Character.charData[i];
                charData70.actCur = (short) (charData70.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 15) {
                Character.charData[i].thinkIfNest = (byte) 0;
                Character.charData[i].thinkId = (short) f0bc.params[0];
                Character.charData[i].thinkCur = (short) 0;
                CharData charData71 = Character.charData[i];
                charData71.actCur = (short) (charData71.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 16) {
                Character.charData[i].thinkAtk = (short) f0bc.params[0];
                CharData charData72 = Character.charData[i];
                charData72.actCur = (short) (charData72.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 17) {
                Character.charData[i].f12hp = (short) 0;
                Attack.resetPiyori(i);
                Character.motionSet(i, 0);
                if (Character.checkHaveMotion(i, 42)) {
                    Character.motionSet(i, 42);
                } else if (Character.charData[i].getBitState(4)) {
                    Character.motionSet(i, 15);
                } else {
                    Character.motionSet(i, 2);
                }
                CharData charData73 = Character.charData[i];
                charData73.actCur = (short) (charData73.actCur + 1);
                z7 = true;
            } else if (f0bc.commandId == 18) {
                Character.charData[i].ahX = f0bc.params[0];
                Character.charData[i].ahY = f0bc.params[1];
                Character.charData[i].ahZ = f0bc.params[2];
                Character.charData[i].ahWidth = f0bc.params[3];
                Character.charData[i].ahHeight = f0bc.params[4];
                Character.charData[i].ahDepth = f0bc.params[5];
                CharData charData74 = Character.charData[i];
                charData74.actCur = (short) (charData74.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 19) {
                Character.charData[i].ahX = 0.0f;
                Character.charData[i].ahY = 0.0f;
                Character.charData[i].ahZ = 0.0f;
                Character.charData[i].ahWidth = Character.charData[i].width;
                Character.charData[i].ahHeight = Character.charData[i].height;
                Character.charData[i].ahDepth = Character.charData[i].depth;
                Character.charData[i].bindFigUserId = (short) 0;
                CharData charData75 = Character.charData[i];
                charData75.actCur = (short) (charData75.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 20) {
                Character.charData[i].invCnt = (short) f0bc.params[0];
                CharData charData76 = Character.charData[i];
                charData76.actCur = (short) (charData76.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 21) {
                Character.charData[i].setBitState(Appearance.DRAWSILHOUETTE, ((int) f0bc.params[0]) == 1);
                CharData charData77 = Character.charData[i];
                charData77.actCur = (short) (charData77.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 22) {
                GameStatus.GAME.waitEventFiles.addElement(new StringBuffer().append("").append((int) f0bc.params[0]).toString());
                CharData charData78 = Character.charData[i];
                charData78.actCur = (short) (charData78.actCur + 1);
                z7 = true;
            } else if (f0bc.commandId == 23) {
                Character.charData[i].guardAttribute = (short) f0bc.params[0];
                CharData charData79 = Character.charData[i];
                charData79.actCur = (short) (charData79.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 24) {
                if (Character.charData[i].drawType == 2) {
                    Util.setFigureUseridVisible(Character.figData[Character.getCharIndex(Character.charData[i].charId)], (int) f0bc.params[0], ((int) f0bc.params[1]) == 1);
                } else if (Character.charData[i].drawType == 4) {
                    Util.setFigureUseridVisible(MapData.modelFig, (int) f0bc.params[0], ((int) f0bc.params[1]) == 1);
                }
                CharData charData80 = Character.charData[i];
                charData80.actCur = (short) (charData80.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 25) {
                short sAbs = (short) f0bc.params[0];
                if (f0bc.params[0] < 0.0f) {
                    sAbs = (short) ((Character.charData[i].maxHp * Math.abs((int) f0bc.params[0])) / 100.0f);
                }
                Character.charData[i].thinkDmg = sAbs;
                CharData charData81 = Character.charData[i];
                charData81.actCur = (short) (charData81.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 26) {
                if (Character.charData[i].motionCompSpd == 0 && Character.charData[i].frame == 0.0f) {
                    CharData charData82 = Character.charData[i];
                    charData82.actCur = (short) (charData82.actCur + 1);
                    z7 = true;
                } else {
                    short s3 = (short) f0bc.params[0];
                    if (s3 <= 0) {
                        s3 = 0;
                        CharData charData83 = Character.charData[i];
                        charData83.actCur = (short) (charData83.actCur + 1);
                    }
                    Character.charData[i].motionCompSpd = s3;
                    z7 = true;
                }
            } else if (f0bc.commandId == 27) {
                Character.charData[i].setBitState(32, ((int) f0bc.params[0]) == 1);
                CharData charData84 = Character.charData[i];
                charData84.actCur = (short) (charData84.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 28) {
                Character.charData[i].thinkVal[(int) f0bc.params[0]] = (short) f0bc.params[1];
                CharData charData85 = Character.charData[i];
                charData85.actCur = (short) (charData85.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 29) {
                Character.charData[i].motionSpd = f0bc.params[0];
                CharData charData86 = Character.charData[i];
                charData86.actCur = (short) (charData86.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 31) {
                Character.charData[i].setBitState(Appearance.USE_FIGURE_APPEARANCE, ((int) f0bc.params[0]) == 1);
                CharData charData87 = Character.charData[i];
                charData87.actCur = (short) (charData87.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 35) {
                CharData charData88 = Character.charData[i];
                charData88.actCur = (short) (charData88.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 37) {
                switch ((int) f0bc.params[1]) {
                    case 0:
                        short[] sArr = Character.charData[i].thinkVal;
                        int i14 = (int) f0bc.params[0];
                        sArr[i14] = (short) (sArr[i14] + ((short) f0bc.params[2]));
                        break;
                    case 1:
                        short[] sArr2 = Character.charData[i].thinkVal;
                        int i15 = (int) f0bc.params[0];
                        sArr2[i15] = (short) (sArr2[i15] - ((short) f0bc.params[2]));
                        break;
                    case 2:
                        short[] sArr3 = Character.charData[i].thinkVal;
                        int i16 = (int) f0bc.params[0];
                        sArr3[i16] = (short) (sArr3[i16] * ((short) f0bc.params[2]));
                        break;
                    case 3:
                        short[] sArr4 = Character.charData[i].thinkVal;
                        int i17 = (int) f0bc.params[0];
                        sArr4[i17] = (short) (sArr4[i17] / ((short) f0bc.params[2]));
                        break;
                    case 4:
                        short[] sArr5 = Character.charData[i].thinkVal;
                        int i18 = (int) f0bc.params[0];
                        sArr5[i18] = (short) (sArr5[i18] % ((short) f0bc.params[2]));
                        break;
                }
                CharData charData89 = Character.charData[i];
                charData89.actCur = (short) (charData89.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 38) {
                boolean bitState = Character.charData[i].getBitState(8192);
                Character.charData[i].setBitState(8192, ((int) f0bc.params[0]) == 1);
                if (bitState && !Character.charData[i].getBitState(8192)) {
                    if (GameStatus.EXTRA.isCheatMode(6) && Character.charData[i].type != 9) {
                        Game.abnormalAISet(i, 6);
                    }
                    if (GameStatus.EXTRA.isCheatMode(7) && !Character.charData[i].getBitState(4096)) {
                        Game.abnormalAISet(i, 7);
                    }
                }
                CharData charData90 = Character.charData[i];
                charData90.actCur = (short) (charData90.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 40) {
                Character.charData[i].thinkVal[(int) f0bc.params[0]] = (short) recoverCharSearch(i);
                CharData charData91 = Character.charData[i];
                charData91.actCur = (short) (charData91.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 42) {
                Character.charData[i].position = (byte) f0bc.params[0];
                CharData charData92 = Character.charData[i];
                charData92.actCur = (short) (charData92.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 43) {
                Character.charData[i].setBitState(32768, ((int) f0bc.params[0]) == 1);
                CharData charData93 = Character.charData[i];
                charData93.actCur = (short) (charData93.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 44) {
                if (((int) f0bc.params[0]) == 0) {
                    Character.charData[i].angle += f0bc.params[1];
                } else {
                    Character.charData[i].angle = f0bc.params[1];
                }
                CharData charData94 = Character.charData[i];
                charData94.actCur = (short) (charData94.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 47) {
                Character.charData[i].setBitState(65536, ((int) f0bc.params[0]) == 1);
                CharData charData95 = Character.charData[i];
                charData95.actCur = (short) (charData95.actCur + 1);
                z7 = false;
            } else if (f0bc.commandId == 48) {
                if (Character.charData[i].alpha < ((int) f0bc.params[0])) {
                    Character.charData[i].alpha = (short) Math.min(255, Math.min((int) f0bc.params[0], Character.charData[i].alpha + ((int) f0bc.params[1])));
                } else if (Character.charData[i].alpha > ((int) f0bc.params[0])) {
                    Character.charData[i].alpha = (short) Math.max(0, Math.max((int) f0bc.params[0], Character.charData[i].alpha - ((int) f0bc.params[1])));
                }
                Character.charData[i].setBitState(1024, true);
                if (Character.charData[i].alpha == 255) {
                    Character.charData[i].setBitState(1024, false);
                }
                if (Character.charData[i].alpha == ((int) f0bc.params[0])) {
                    CharData charData96 = Character.charData[i];
                    charData96.actCur = (short) (charData96.actCur + 1);
                    z7 = true;
                } else {
                    z7 = true;
                }
            } else {
                if (f0bc.commandId == 49) {
                    Character.charData[i].thinkAtk = (short) 0;
                    Character.charData[i].thinkId = (short) 0;
                    Character.charData[i].thinkCur = (short) 0;
                    Character.charData[i].actCur = (short) 0;
                    Character.charData[i].actWait = (short) 0;
                    Character.charData[i].actTimer = (short) 0;
                    Character.charData[i].waitCnt = (short) 0;
                    initSet(i, -999, (short) f0bc.params[0], ((int) f0bc.params[1]) == 1);
                    callBackActionSet(0, i);
                    return true;
                }
                if (f0bc.commandId == 50) {
                    if (((int) f0bc.params[0]) == 2) {
                        Character.charData[i].targetBlock = (byte) -1;
                    } else {
                        CharData charData97 = Character.charData[i];
                        if (((int) f0bc.params[0]) == 1) {
                            charData97 = Character.charData[0];
                        }
                        Character.charData[i].targetBlock = (byte) MapData.nearBlockCheck(charData97, (int) f0bc.params[1]);
                        if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                        }
                    }
                    CharData charData98 = Character.charData[i];
                    charData98.actCur = (short) (charData98.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 51) {
                    extBindCharNo[(int) f0bc.params[0]] = (byte) i;
                    if (extDefaultAiId[(int) f0bc.params[0]] < 0) {
                        extDefaultAiId[(int) f0bc.params[0]] = Character.charData[i].aiId;
                        Character.setEquipEff(i);
                    }
                    CharData charData99 = Character.charData[i];
                    charData99.actCur = (short) (charData99.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 53) {
                    int nearEneCharDir = -1;
                    if (((int) f0bc.params[0]) == 0) {
                        nearEneCharDir = Character.charData[0].targetChar;
                    } else if (((int) f0bc.params[0]) == 1) {
                        nearEneCharDir = (int) f0bc.params[1];
                    } else if (((int) f0bc.params[0]) == 2) {
                        nearEneCharDir = Character.charData[i].targetChar;
                    } else if (((int) f0bc.params[0]) == 3 && (nearEneCharDir = Character.getNearEneCharDir(i, GameStatus.GAME.targetLen * 2)) < 0) {
                        nearEneCharDir = 0;
                        if (Character.charData[i].type != 0 || Character.charData[0].getBitState(1024)) {
                            nearEneCharDir = -1;
                        }
                    }
                    if (nearEneCharDir >= 0) {
                        Character.charData[i].targetFixTime = (short) f0bc.params[2];
                    }
                    Character.charData[i].targetChar = (byte) nearEneCharDir;
                    CharData charData100 = Character.charData[i];
                    charData100.actCur = (short) (charData100.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 54) {
                    Character.charData[i].bindFigUserId = (short) f0bc.params[0];
                    CharData charData101 = Character.charData[i];
                    charData101.actCur = (short) (charData101.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 55) {
                    Character.charData[i].setBitState(262144, ((int) f0bc.params[0]) == 1);
                    CharData charData102 = Character.charData[i];
                    charData102.actCur = (short) (charData102.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 56) {
                    Character.charData[i].setBitState(524288, ((int) f0bc.params[0]) == 1);
                    CharData charData103 = Character.charData[i];
                    charData103.actCur = (short) (charData103.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 57) {
                    Character.charData[i].setBitState(VertexBuffer.TEXTURECOORDF_0, ((int) f0bc.params[0]) == 1);
                    CharData charData104 = Character.charData[i];
                    charData104.actCur = (short) (charData104.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 58) {
                    Character.charData[i].setBitState(VertexBuffer.TEXTURECOORDF_1, ((int) f0bc.params[0]) == 1);
                    CharData charData105 = Character.charData[i];
                    charData105.actCur = (short) (charData105.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 59) {
                    Character.charData[i].setBitState(4194304, ((int) f0bc.params[0]) == 1);
                    CharData charData106 = Character.charData[i];
                    charData106.actCur = (short) (charData106.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 60) {
                    Character.afterImageSet(-1);
                    if (f0bc.params[0] == 1.0f) {
                        Character.afterImageSet(i);
                    }
                    CharData charData107 = Character.charData[i];
                    charData107.actCur = (short) (charData107.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 61) {
                    Character.charData[i].setBitState(8388608, ((int) f0bc.params[0]) == 1);
                    CharData charData108 = Character.charData[i];
                    charData108.actCur = (short) (charData108.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 62) {
                    Character.charData[i].setBitState(VertexBuffer.SPRITE_PER_OBJ, ((int) f0bc.params[0]) == 1);
                    CharData charData109 = Character.charData[i];
                    charData109.actCur = (short) (charData109.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 65) {
                    Character.charData[i].setBitState(33554432, ((int) f0bc.params[0]) == 1);
                    CharData charData110 = Character.charData[i];
                    charData110.actCur = (short) (charData110.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 64) {
                    CharData charData111 = Character.charData[i];
                    charData111.actCur = (short) (charData111.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 66) {
                    Game.eventSIVar[(int) f0bc.params[0]] = (int) f0bc.params[1];
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                    CharData charData112 = Character.charData[i];
                    charData112.actCur = (short) (charData112.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 67) {
                    Character.charData[i].setBitState(67108864, ((int) f0bc.params[0]) == 1);
                    CharData charData113 = Character.charData[i];
                    charData113.actCur = (short) (charData113.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 68) {
                    Character.charData[i].figure = Character.figData[Character.getCharIndex((short) f0bc.params[0])];
                    CharData charData114 = Character.charData[i];
                    charData114.actCur = (short) (charData114.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 69) {
                    GameStatus.GAME.targetView = 12;
                    CharData charData115 = Character.charData[i];
                    charData115.actCur = (short) (charData115.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 70) {
                    Attack.resetPiyori(i);
                    if (((int) f0bc.params[0]) == 1) {
                        CharData charData116 = Character.charData[i];
                        Character.charData[i].flinchCnt = (short) -1;
                        charData116.flinchCntMax = (short) -1;
                    }
                    CharData charData117 = Character.charData[i];
                    charData117.actCur = (short) (charData117.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 71) {
                    Character.charData[i].setBitState(134217728, ((int) f0bc.params[0]) == 1);
                    CharData charData118 = Character.charData[i];
                    charData118.actCur = (short) (charData118.actCur + 1);
                    z7 = false;
                } else if (f0bc.commandId == 72) {
                    if (Character.charData[i].getBitState(4)) {
                        z7 = true;
                    } else {
                        CharData charData119 = Character.charData[i];
                        charData119.actCur = (short) (charData119.actCur + 1);
                        z7 = true;
                    }
                } else if (f0bc.commandId == 73) {
                    Character.charData[i].setBitState(268435456, ((int) f0bc.params[0]) == 1);
                    CharData charData120 = Character.charData[i];
                    charData120.actCur = (short) (charData120.actCur + 1);
                    z7 = false;
                } else {
                    Character.charData[i].actId = (short) -1;
                    z7 = true;
                }
            }
            if (Character.charData[i].actCur >= actionScript[charIndex][aiIndex][iThink].length) {
                Character.charData[i].actId = (short) -1;
            }
        }
        return true;
    }

    public static void callBackActionSet(int i, int i2) {
        int aiIndex;
        int charIndex = Character.getCharIndex(Character.charData[i2].charId);
        if (charIndex >= 0 && (aiIndex = getAiIndex(charIndex, Character.charData[i2].aiId)) >= 0) {
            if (i == 0) {
                Character.charData[i2].thinkId = (short) 0;
                Character.charData[i2].thinkCur = (short) 0;
                Character.charData[i2].thinkDmg = 0;
                Character.charData[i2].thinkIfNest = (byte) 0;
                Util.zeroClear(Character.charData[i2].thinkIfResult);
                Util.zeroClear(Character.charData[i2].thinkVal);
                if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i2].getBitState(131072)) {
                }
            }
            for (int i3 = 0; i3 < callBack[charIndex][aiIndex].length; i3++) {
                if (callBack[charIndex][aiIndex][i3][0] == i) {
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i2].getBitState(131072)) {
                    }
                    Character.charData[i2].actId = (short) callBack[charIndex][aiIndex][i3][1];
                    Character.charData[i2].actCur = (short) 0;
                    Character.charData[i2].actWait = (short) 0;
                    Character.charData[i2].actTimer = (short) 0;
                    return;
                }
            }
        }
    }

    public static boolean checkHaveCallBack(int i, int i2) {
        int aiIndex;
        int charIndex = Character.getCharIndex(Character.charData[i2].charId);
        if (charIndex < 0 || (aiIndex = getAiIndex(charIndex, Character.charData[i2].aiId)) < 0) {
            return false;
        }
        for (int i3 = 0; i3 < callBack[charIndex][aiIndex].length; i3++) {
            if (callBack[charIndex][aiIndex][i3][0] == i) {
                return true;
            }
        }
        return false;
    }

    public static void freeAction(int i) {
        gid[i] = null;
        callBack[i] = (int[][][]) null;
        thinkScript[i] = (byte[][][][]) null;
        actionScript[i] = (byte[][][][]) null;
    }

    private static int getAiIndex(int i, int i2) {
        if (i >= 0 && gid[i] != null) {
            for (int i3 = 0; i3 < gid[i].length; i3++) {
                if (gid[i][i3] == i2) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static void initSet(int i, int i2, int i3, boolean z) {
        Character.charData[i].thinkIfNest = (byte) 0;
        Util.zeroClear(Character.charData[i].thinkIfResult);
        if (z) {
            Util.zeroClear(Character.charData[i].thinkVal);
        }
        if (i2 != -999) {
            Character.charData[i].actRange2 = i2;
        }
        Character.charData[i].aiId = (short) i3;
        Character.charData[i].actId = (short) -1;
    }

    public static boolean isExtBindChar(int i) {
        for (int i2 = 0; i2 < extBindCharNo.length; i2++) {
            if (extBindCharNo[i2] > 0 && i == extBindCharNo[i2]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExtUnconsAll() {
        boolean z = false;
        for (int i = 0; i < extBindCharNo.length; i++) {
            if (extBindCharNo[i] > 0 && Character.charData[extBindCharNo[i]].use) {
                if (Character.charData[extBindCharNo[i]].aliveCnt == 0) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    public static void load(int i, ZInputStream zInputStream) throws Exception {
        freeAction(i);
        int i2 = zInputStream.read();
        gid[i] = new int[i2];
        callBack[i] = new int[i2][][];
        thinkScript[i] = new byte[i2][][][];
        actionScript[i] = new byte[i2][][][];
        for (int i3 = 0; i3 < gid[i].length; i3++) {
            zInputStream.skip(4L);
            gid[i][i3] = (int) Attack.readBattleData(zInputStream);
            thinkScript[i][i3] = new byte[zInputStream.read()][][];
            for (int i4 = 0; i4 < thinkScript[i][i3].length; i4++) {
                thinkScript[i][i3][i4] = new byte[zInputStream.read()][];
                for (int i5 = 0; i5 < thinkScript[i][i3][i4].length; i5++) {
                    thinkScript[i][i3][i4][i5] = new byte[Util.readShort(zInputStream) + 1];
                    zInputStream.read(thinkScript[i][i3][i4][i5], 1, thinkScript[i][i3][i4][i5].length - 1);
                    Attack.setCommandType(thinkScript[i][i3][i4][i5]);
                }
            }
            callBack[i][i3] = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, zInputStream.read(), 2);
            for (int i6 = 0; i6 < callBack[i][i3].length; i6++) {
                for (int i7 = 0; i7 < callBack[i][i3][i6].length; i7++) {
                    callBack[i][i3][i6][i7] = zInputStream.read();
                }
            }
            actionScript[i][i3] = new byte[zInputStream.read()][][];
            for (int i8 = 0; i8 < actionScript[i][i3].length; i8++) {
                actionScript[i][i3][i8] = new byte[zInputStream.read()][];
                for (int i9 = 0; i9 < actionScript[i][i3][i8].length; i9++) {
                    actionScript[i][i3][i8][i9] = new byte[Util.readShort(zInputStream) + 1];
                    zInputStream.read(actionScript[i][i3][i8][i9], 1, actionScript[i][i3][i8][i9].length - 1);
                    Attack.setCommandType(actionScript[i][i3][i8][i9]);
                }
            }
        }
    }

    private static int recoverCharSearch(int i) {
        int i2 = -2;
        float f = 1.0f;
        for (int i3 = 0; i3 < Character.charData.length; i3++) {
            if (i3 != i && Character.charData[i3].use && (((Character.charData[i].type != 9 && Character.charData[i3].type == Character.charData[i].type) || (Character.charData[i].type == 9 && Character.charData[i3].type == 1)) && Character.charData[i3].f12hp > 0 && Character.charData[i3].f12hp < Character.charData[i3].maxHp)) {
                if (i2 < 0) {
                    i2 = i3;
                }
                float f2 = Character.charData[i3].f12hp / Character.charData[i3].maxHp;
                if (f2 < f) {
                    f = f2;
                    i2 = i3;
                }
            }
        }
        if (i2 < 0 && Character.charData[i].type != 9 && Character.charData[i].f12hp < Character.charData[i].maxHp) {
            i2 = -1;
            float f3 = Character.charData[i].f12hp / Character.charData[i].maxHp;
        }
        if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:320:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:321:0x0a47 A[PHI: r2
  0x0a47: PHI (r2v332 byte) = (r2v328 byte), (r2v328 byte), (r2v327 byte), (r2v327 byte) binds: [B:42:0x0158, B:44:0x0167, B:64:0x01df, B:66:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    private static int think(int i) {
        boolean zCheckCharsHitXZ;
        boolean zVerify;
        byte b;
        int charIndex = Character.getCharIndex(Character.charData[i].charId);
        int aiIndex = getAiIndex(charIndex, Character.charData[i].aiId);
        int i2 = Character.charData[i].thinkId;
        int i3 = Character.charData[i].thinkCur;
        Character.charData[i].actCur = (short) 0;
        int i4 = 0;
        while (true) {
            int i5 = i3;
            int i6 = i2;
            if (Character.charData[i].actId != -1) {
                Character.charData[i].thinkId = (short) i6;
                Character.charData[i].thinkCur = (short) i5;
                return Character.charData[i].actId;
            }
            Attack.readCommand(thinkScript[charIndex][aiIndex][i6][i5], f0bc, i, -1);
            i4++;
            if (i4 >= 10000) {
                Character.charData[i].thinkId = (short) 0;
                Character.charData[i].thinkCur = (short) 0;
                Character.charData[i].actId = (short) 0;
                return 0;
            }
            if (f0bc.type == 1) {
                if (f0bc.commandId == 2) {
                    boolean zCheckAttack = false;
                    if (Character.charData[i].targetBlock < 0) {
                        zCheckAttack = Attack.checkAttack((int) f0bc.params[1], i, Character.charData[i], Character.charData[i].dir);
                    } else if (MapData.bugBlock[Character.charData[i].targetBlock].state == 0) {
                        Character.charData[i].targetBlock = (byte) -1;
                    } else {
                        zCheckAttack = Attack.checkAttackBlockNo((int) f0bc.params[1], i, Character.charData[i], Character.charData[i].targetBlock);
                    }
                    zVerify = verify(zCheckAttack, (int) f0bc.params[0]);
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                } else if (f0bc.commandId == 3) {
                    byte b2 = -1;
                    if (f0bc.params[0] == 0.0f || (f0bc.params[0] == 1.0f && Character.charData[i].targetChar < 0 && GameStatus.EXTRA.isCheatMode(15))) {
                        b2 = 0;
                        if (Character.charData[i].targetChar < 0 || Character.charData[Character.charData[i].targetChar].type < 1) {
                            b = b2;
                        } else {
                            b = Character.charData[i].targetChar;
                        }
                    } else if (f0bc.params[0] != 1.0f || Character.charData[i].targetChar < 0) {
                        b = b2;
                    } else {
                        b = Character.charData[i].targetChar;
                    }
                    float charsLen2 = b >= 0 ? Character.getCharsLen2(i, b) : -1.0f;
                    if (f0bc.params[0] == 1.0f && Character.charData[i].targetBlock >= 0) {
                        if (MapData.bugBlock[Character.charData[i].targetBlock].state == 0) {
                            Character.charData[i].targetBlock = (byte) -1;
                        } else {
                            byte b3 = Character.charData[i].targetBlock;
                            charsLen2 = Util.getDistance(MapData.bugBlock[b3].f69x, MapData.bugBlock[b3].f70y, MapData.bugBlock[b3].f71z, Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z);
                        }
                    }
                    if (charsLen2 >= 0.0f) {
                        zVerify = verify(charsLen2, (int) f0bc.params[1], f0bc.params[2]);
                        if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                        }
                    } else {
                        zVerify = false;
                    }
                } else if (f0bc.commandId == 11) {
                    if (Character.charData[i].targetChar >= 0) {
                        byte b4 = Character.charData[i].targetChar;
                        zVerify = verify(Util.atan2_360(Character.charData[b4].f70y - Character.charData[i].f70y, Util3D.sqrt(Character.getCharsXZLen2(i, b4))), (int) f0bc.params[0], f0bc.params[1]);
                    } else {
                        zVerify = false;
                    }
                } else if (f0bc.commandId == 4) {
                    zVerify = verify(Character.charData[i].f12hp, (int) f0bc.params[0], (Character.charData[i].maxHp * f0bc.params[1]) / 100.0f);
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                } else if (f0bc.commandId == 5) {
                    zVerify = verify(Character.charData[i].random(0, 100), (int) f0bc.params[0], f0bc.params[1]);
                } else if (f0bc.commandId == 6) {
                    zVerify = verify(Character.charData[i].getBitState(128), (int) f0bc.params[0]);
                } else if (f0bc.commandId == 7) {
                    zVerify = verify((int) Character.charData[GameStatus.GAME.ctlCharNo].targetChar, (int) f0bc.params[0], i);
                } else if (f0bc.commandId == 8) {
                    GameStatus.ExtraStatus extraStatus = GameStatus.EXTRA;
                    GameStatus.ExtraStatus extraStatus2 = GameStatus.EXTRA;
                    zVerify = verify(extraStatus.getType(1) > 0, (int) f0bc.params[0]);
                } else if (f0bc.commandId == 9) {
                    zVerify = verify(Character.charData[i].motion, (int) f0bc.params[0], f0bc.params[1]);
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                } else if (f0bc.commandId == 10) {
                    zVerify = verify((int) Character.charData[i].thinkAtk, (int) f0bc.params[0], 0);
                } else if (f0bc.commandId == 14) {
                    if (Character.charData[i].actRange2 < 0) {
                        zVerify = true;
                    } else {
                        zVerify = verify(((float) Character.charData[i].actRange2) >= Util.getDistance(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, Character.charData[i].f13ox, Character.charData[i].f14oy, Character.charData[i].f15oz), (int) f0bc.params[0]);
                        if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                        }
                    }
                } else if (f0bc.commandId == 15) {
                    zVerify = verify(Attack.isRC(), (int) f0bc.params[0]);
                } else if (f0bc.commandId == 16) {
                    GameStatus.ExtraStatus extraStatus3 = GameStatus.EXTRA;
                    GameStatus.ExtraStatus extraStatus4 = GameStatus.EXTRA;
                    zVerify = verify(extraStatus3.getType(1) > 0 ? GameStatus.EXTRA.getCheatType() : -1, (int) f0bc.params[0], f0bc.params[1]);
                } else if (f0bc.commandId == 18) {
                    zVerify = verify((int) Character.charData[i].thinkVal[(int) f0bc.params[0]], (int) f0bc.params[1], (int) ((short) f0bc.params[2]));
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                } else if (f0bc.commandId == 19) {
                    float[] fArrRelativeChange = Attack.relativeChange(Character.charData[i].dir, f0bc.params[1], f0bc.params[3], 0, false);
                    float[] charXZ = Character.getCharXZ(Character.charData[i].dir, f0bc.params[4], f0bc.params[6]);
                    zVerify = verify(Attack.AttackChar(i, -1, Character.charData[i].type, 0L, 0.0f, 0, Character.charData[i].f69x + fArrRelativeChange[0], Character.charData[i].f70y + f0bc.params[2], Character.charData[i].f71z + fArrRelativeChange[1], charXZ[0], f0bc.params[5], charXZ[1], Character.charData[i].dir, true, false).size() > 0, (int) f0bc.params[0]);
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                } else if (f0bc.commandId == 20) {
                    zVerify = verify(Character.charData[i].flinchTime > 0, (int) f0bc.params[0]);
                } else if (f0bc.commandId == 21) {
                    boolean z = false;
                    if (f0bc.params[1] <= Character.charData[i].f69x && Character.charData[i].f69x <= f0bc.params[1] + f0bc.params[4] && f0bc.params[2] <= Character.charData[i].f70y && Character.charData[i].f70y <= f0bc.params[2] + f0bc.params[5] && f0bc.params[3] <= Character.charData[i].f71z && Character.charData[i].f71z <= f0bc.params[3] + f0bc.params[6]) {
                        z = true;
                    }
                    zVerify = verify(z, (int) f0bc.params[0]);
                } else if (f0bc.commandId == 23) {
                    boolean bitState = Character.charData[i].getBitState(4096);
                    if (Character.charData[i].type == 9) {
                        bitState = false;
                    }
                    zVerify = verify(bitState, (int) f0bc.params[0]);
                } else if (f0bc.commandId == 24) {
                    zVerify = verify(i, (int) f0bc.params[0], (int) f0bc.params[1]);
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                } else if (f0bc.commandId == 27) {
                    if (Character.charData[i].targetBlock >= 0 && MapData.bugBlock[Character.charData[i].targetBlock].state == 0) {
                        Character.charData[i].targetBlock = (byte) -1;
                    }
                    zVerify = verify(Character.charData[i].targetBlock >= 0, (int) f0bc.params[0]);
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                } else if (f0bc.commandId == 28) {
                    zVerify = verify(Character.charData[i].targetChar >= 0, (int) f0bc.params[0]);
                } else if (f0bc.commandId == 29) {
                    zVerify = verify(Character.charData[i].type == 9, (int) f0bc.params[0]);
                } else if (f0bc.commandId == 30) {
                    zVerify = verify((Game.eventBit & ((byte) (1 << ((int) f0bc.params[0])))) == 1, (int) f0bc.params[1]);
                } else if (f0bc.commandId == 31) {
                    zVerify = verify(f0bc.params[0], (int) f0bc.params[1], f0bc.params[2]);
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                } else {
                    if (f0bc.commandId != 32) {
                        return -1;
                    }
                    byte b5 = -1;
                    if (Character.charData[i].targetChar < 0 && GameStatus.EXTRA.isCheatMode(15)) {
                        b5 = 0;
                    } else if (Character.charData[i].targetChar >= 0) {
                        b5 = Character.charData[i].targetChar;
                    }
                    if (Character.charData[i].targetBlock < 0) {
                        zCheckCharsHitXZ = b5 >= 0 ? Character.checkCharsHitXZ(i, b5) : false;
                    } else if (MapData.bugBlock[Character.charData[i].targetBlock].state == 0) {
                        Character.charData[i].targetBlock = (byte) -1;
                        zCheckCharsHitXZ = false;
                    } else {
                        zCheckCharsHitXZ = MapData.w2b(MapData.bugBlock[Character.charData[i].targetBlock].f69x) == MapData.w2b(Character.charData[i].f69x) && MapData.w2b(MapData.bugBlock[Character.charData[i].targetBlock].f71z) == MapData.w2b(Character.charData[i].f71z);
                    }
                    zVerify = verify(zCheckCharsHitXZ, (int) f0bc.params[0]);
                    if (GameCommon.DEBUG_STATUS[18] >= 1 || Character.charData[i].getBitState(131072)) {
                    }
                }
                CharData charData = Character.charData[i];
                charData.thinkIfNest = (byte) (charData.thinkIfNest + 1);
                if (zVerify) {
                    Character.charData[i].thinkIfResult[Character.charData[i].thinkIfNest] = 1;
                } else {
                    Character.charData[i].thinkIfResult[Character.charData[i].thinkIfNest] = 0;
                    int i7 = 0;
                    while (i5 + 1 < thinkScript[charIndex][aiIndex][i6].length) {
                        i5++;
                        Attack.readCommand(thinkScript[charIndex][aiIndex][i6][i5], f0bc, i, -1);
                        if (f0bc.type == 1) {
                            i7++;
                        } else if (f0bc.commandId == 12) {
                            if (i7 == 0) {
                            }
                        } else if (f0bc.commandId != 13) {
                            continue;
                        } else if (i7 == 0) {
                            CharData charData2 = Character.charData[i];
                            charData2.thinkIfNest = (byte) (charData2.thinkIfNest - 1);
                        } else {
                            i7--;
                        }
                    }
                }
                i3 = i5 + 1;
                i2 = i6;
            } else if (f0bc.commandId == 12) {
                if (Character.charData[i].thinkIfResult[Character.charData[i].thinkIfNest] == 1) {
                    int i8 = 0;
                    while (i5 + 1 < thinkScript[charIndex][aiIndex][i6].length) {
                        i5++;
                        Attack.readCommand(thinkScript[charIndex][aiIndex][i6][i5], f0bc, i, -1);
                        if (f0bc.type == 1) {
                            i8++;
                        } else if (f0bc.commandId != 13) {
                            continue;
                        } else if (i8 == 0) {
                            CharData charData3 = Character.charData[i];
                            charData3.thinkIfNest = (byte) (charData3.thinkIfNest - 1);
                        } else {
                            i8--;
                        }
                    }
                }
                i3 = i5 + 1;
                i2 = i6;
            } else if (f0bc.commandId == 13) {
                CharData charData4 = Character.charData[i];
                charData4.thinkIfNest = (byte) (charData4.thinkIfNest - 1);
                i3 = i5 + 1;
                i2 = i6;
            } else if (f0bc.commandId == 0) {
                Character.charData[i].actId = (short) f0bc.params[0];
                i3 = i5 + 1;
                i2 = i6;
            } else if (f0bc.commandId == 1) {
                int i9 = (int) f0bc.params[0];
                Character.charData[i].thinkIfNest = (byte) 0;
                i3 = 0;
                i2 = i9;
            } else if (f0bc.commandId == 17) {
                Character.charData[i].thinkVal[(int) f0bc.params[0]] = (short) f0bc.params[1];
                i3 = i5 + 1;
                i2 = i6;
            } else if (f0bc.commandId == 25) {
                switch ((int) f0bc.params[1]) {
                    case 0:
                        short[] sArr = Character.charData[i].thinkVal;
                        int i10 = (int) f0bc.params[0];
                        sArr[i10] = (short) (sArr[i10] + ((short) f0bc.params[2]));
                        break;
                    case 1:
                        short[] sArr2 = Character.charData[i].thinkVal;
                        int i11 = (int) f0bc.params[0];
                        sArr2[i11] = (short) (sArr2[i11] - ((short) f0bc.params[2]));
                        break;
                    case 2:
                        short[] sArr3 = Character.charData[i].thinkVal;
                        int i12 = (int) f0bc.params[0];
                        sArr3[i12] = (short) (sArr3[i12] * ((short) f0bc.params[2]));
                        break;
                    case 3:
                        short[] sArr4 = Character.charData[i].thinkVal;
                        int i13 = (int) f0bc.params[0];
                        sArr4[i13] = (short) (sArr4[i13] / ((short) f0bc.params[2]));
                        break;
                    case 4:
                        short[] sArr5 = Character.charData[i].thinkVal;
                        int i14 = (int) f0bc.params[0];
                        sArr5[i14] = (short) (sArr5[i14] % ((short) f0bc.params[2]));
                        break;
                }
                i3 = i5 + 1;
                i2 = i6;
            } else if (f0bc.commandId == 26) {
                Character.charData[i].thinkVal[(int) f0bc.params[0]] = (short) recoverCharSearch(i);
                i3 = i5 + 1;
                i2 = i6;
            } else {
                if (f0bc.commandId != 33) {
                    return -1;
                }
                i3 = i5 + 1;
                i2 = i6;
            }
            if (i3 >= thinkScript[charIndex][aiIndex][i2].length) {
                i2 = 0;
                i3 = 0;
            }
        }
    }

    private static boolean verify(float f, int i, float f2) {
        if (i == 0 && f == f2) {
            return true;
        }
        if (i == 1 && f != f2) {
            return true;
        }
        if (i == 2 && f <= f2) {
            return true;
        }
        if (i == 3 && f >= f2) {
            return true;
        }
        if (i != 4 || f >= f2) {
            return i == 5 && f > f2;
        }
        return true;
    }

    private static boolean verify(int i, int i2, int i3) {
        if (i2 == 0 && i == i3) {
            return true;
        }
        if (i2 == 1 && i != i3) {
            return true;
        }
        if (i2 == 2 && i <= i3) {
            return true;
        }
        if (i2 == 3 && i >= i3) {
            return true;
        }
        if (i2 != 4 || i >= i3) {
            return i2 == 5 && i > i3;
        }
        return true;
    }

    private static boolean verify(boolean z, int i) {
        if (i == 0 && z) {
            return true;
        }
        return i == 1 && !z;
    }
}
