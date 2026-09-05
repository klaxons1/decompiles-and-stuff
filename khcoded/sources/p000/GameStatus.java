package p000;

import com.docomostar.lang.IllegalStateException;
import com.docomostar.net.URLEncoder;
import com.docomostar.util.Base64;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.reflect.Array;
import java.util.Vector;
import javax.microedition.io.Connector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class GameStatus {
    public static ExtraStatus EXTRA;
    public static GameData GAME;
    public static PlayerData PLAYER;
    public static int[] systemData = new int[9];

    /* JADX INFO: renamed from: gs */
    private static final GameStatus f57gs = new GameStatus();
    public static boolean scratchpadAccess = false;
    public static boolean sdCardAccess = false;
    private static final int[] saveDataDivision = {0, 100, 2500};

    class ExtraStatus {
        public static final byte CHEAT_MODE_NOSET = -1;
        public static final byte CHEAT_MODE_SET = 1;
        public static final byte EX_ATK = 1;
        public static final byte EX_CEHAT_BALL = 9;
        public static final byte EX_CHEAT_TYPE_DEBUG = 0;
        public static final byte EX_CHEAT_TYPE_MAGIC = 1;
        public static final byte EX_DEF = 2;
        public static final byte EX_EXE_CHEAT_MAX = 2;
        public static final byte EX_FLG_AUTO_COMBO = 3;
        public static final byte EX_FLG_AUTO_JUMP = 0;
        public static final byte EX_FLG_CRUSH = 1;
        public static final byte EX_FLG_HOMING = 2;
        public static final byte EX_FLG_MAX = 4;
        public static final byte EX_HP = 0;
        public static final byte EX_HP_BALL = 8;
        public static final byte EX_LEVEL = 5;
        public static final byte EX_MAX = 10;
        public static final byte EX_MONEY = 6;
        public static final byte EX_MOT_SPD = 4;
        public static final byte EX_SPD = 3;
        public static final byte EX_TYPE_CHEAT = 1;
        public static final byte EX_TYPE_ITEM = 0;
        public static final byte EX_TYPE_MAX = 3;
        public static final byte EX_TYPE_SUMMON = 2;
        public static final byte EX_VP = 7;
        private int f_status;
        private int status;
        private final GameStatus this$0;
        private int[] type = new int[3];
        private int[] timer = new int[3];
        private int[] max_timer = new int[3];
        private float[] param = new float[10];
        private boolean[] f_param = new boolean[4];
        private int[] exeCheatMode = new int[2];
        private int exeCheatType = -1;
        private int setCheatNum = 0;

        ExtraStatus(GameStatus gameStatus) {
            this.this$0 = gameStatus;
            for (int i = 0; i < this.type.length; i++) {
                this.type[i] = 0;
                if (i == 1) {
                    this.type[i] = -1;
                }
                this.timer[i] = 0;
                this.max_timer[i] = 0;
            }
            this.status = 0;
            for (int i2 = 0; i2 < this.param.length; i2++) {
                this.param[i2] = 0.0f;
            }
            this.f_status = 0;
            for (int i3 = 0; i3 < this.f_param.length; i3++) {
                this.f_param[i3] = false;
            }
            for (int i4 = 0; i4 < this.exeCheatMode.length; i4++) {
                this.exeCheatMode[i4] = -1;
            }
        }

        private void clearStatus(int i) {
            this.status &= (1 << i) ^ (-1);
        }

        private void clearStatusFlag(int i) {
            this.f_status &= (1 << i) ^ (-1);
        }

        private void setStatus(int i) {
            this.status |= 1 << i;
        }

        private void setStatusFlag(int i) {
            this.f_status |= 1 << i;
        }

        public void clearCheatMode(int i) {
            for (int i2 = 0; i2 < this.exeCheatMode.length; i2++) {
                if ((this.exeCheatMode[i2] & 65535) == i) {
                    this.exeCheatMode[i2] = -1;
                    this.setCheatNum--;
                    if (this.setCheatNum == 0) {
                        this.exeCheatType = -1;
                        return;
                    }
                    return;
                }
            }
        }

        public void clearCheatModeAll() {
            for (int i = 0; i < this.exeCheatMode.length; i++) {
                this.exeCheatMode[i] = -1;
            }
            this.exeCheatType = -1;
            this.setCheatNum = 0;
        }

        public void clearParam(int i) {
            clearStatus(i);
            this.param[i] = 0.0f;
        }

        public void clearParamFlag(int i) {
            clearStatusFlag(i);
            this.f_param[i] = false;
        }

        public int getCheatMode(int i) {
            return this.exeCheatMode[i] < 0 ? this.exeCheatMode[i] : this.exeCheatMode[i] & 65535;
        }

        public int getCheatModeNum() {
            return this.setCheatNum;
        }

        public int getCheatType() {
            return this.exeCheatType;
        }

        public int getExeCheatIndex(int i) {
            for (int i2 = 0; i2 < this.exeCheatMode.length; i2++) {
                if ((this.exeCheatMode[i2] & 65535) == i) {
                    return i2;
                }
            }
            return -1;
        }

        public int getExeCheatLevel(int i) {
            return this.exeCheatMode[i] < 0 ? this.exeCheatMode[i] : this.exeCheatMode[i] >> 16;
        }

        public int getMaxTimer(int i) {
            return this.max_timer[i];
        }

        public float getParam(int i) {
            return this.param[i];
        }

        public boolean getParamFlag(int i) {
            return this.f_param[i];
        }

        public int getTimer(int i) {
            return this.timer[i];
        }

        public int getType(int i) {
            return this.type[i];
        }

        public boolean isCheatMode(int i) {
            for (int i2 = 0; i2 < this.exeCheatMode.length; i2++) {
                if ((this.exeCheatMode[i2] & 65535) == i) {
                    return true;
                }
            }
            return false;
        }

        public boolean isStatus(int i) {
            return (this.status & (1 << i)) != 0;
        }

        public int setCheatMode(int i, int i2, int i3) {
            for (int i4 = 0; i4 < this.exeCheatMode.length; i4++) {
                if (this.exeCheatMode[i4] == -1) {
                    this.exeCheatMode[i4] = (i3 << 16) + i;
                    this.setCheatNum++;
                    if (this.exeCheatType == 1) {
                        return i4;
                    }
                    this.exeCheatType = i2;
                    return i4;
                }
            }
            return 0;
        }

        public void setMaxTimer(int i, int i2) {
            this.max_timer[i] = i2;
        }

        public void setParam(int i, float f) {
            setStatus(i);
            this.param[i] = f;
        }

        public void setParamFlag(int i) {
            setStatusFlag(i);
            this.f_param[i] = true;
        }

        public void setTimer(int i, int i2) {
            this.timer[i] = i2;
        }

        public void setType(int i, int i2) {
            this.type[i] = i2;
        }
    }

    class GameData {
        public int barrierTimer;
        public byte ctlCharNo;
        public boolean dbgHpFlg;
        public boolean debugDisp;
        public int eneAliveTime;
        public boolean eventMode;
        public boolean ghostMode;
        public boolean hpDisp;
        public boolean hpUnDisp;
        public int hpViewLen;
        public int mapView;
        public boolean miniMapDisp;
        public boolean miniMapNoDisp;
        public float miniMapZoom;
        public boolean mmapTexFlag;
        public boolean reaction;
        public int reactionJmp;
        public int reactionKey;
        public int reactionMotion;
        public int reactionSpd;
        public int reactionTime;
        public int reactionTimeMax;
        public int regeneTimer;
        public int stagebreakCount;
        public int stagekillCount;
        public int targetBlockView;
        public int targetLen;
        public int targetView;
        private final GameStatus this$0;
        public int trinityPower;
        public boolean volumeView;
        public VipObject cheatCursorPos = new VipObject();
        public Vector forceEventFiles = new Vector();
        public Vector waitEventFiles = new Vector();
        public int areaDebugMode = 0;
        public byte extCommand = 0;
        public boolean debugModeOff = false;
        public boolean blockGravity = true;
        public boolean puzzleStop = false;
        public boolean miniMapZoomFlg = false;
        public boolean vpDisp = false;
        public boolean gameStop = false;
        public boolean titleBack = false;
        public boolean playerCtrlStop = false;

        public GameData(GameStatus gameStatus) {
            this.this$0 = gameStatus;
        }
    }

    class PlayerData {
        public static final byte ABILITY_NUM = 32;
        public static final byte BATTLE_ITEM_DEFAULT = 3;
        public static final byte BATTLE_ITEM_MAX = 5;
        public static final int DBG_POWER_MAX = 10000;
        public static final byte EQUIP_ACCESSARY_DEFAULT = 1;
        public static final byte EQUIP_ACCESSARY_MAX = 3;
        public static final int ID_EFFECT_ITEMUSE = 30000;
        public static final int LEVEL_MAX = 99;
        public static final byte LEVEL_MAX_DEFAULT = 9;
        public static final byte WORLD_LEVEL_MAX = 3;
        public int EXP_MAX;
        public byte[][] item;
        public boolean serverload;
        private final GameStatus this$0;
        private int[] intData = new int[16];
        private short[] shortData = new short[1];
        private byte[] byteData = new byte[12];
        private int[] intDataTemp = new int[3];
        private short[] shortDataTemp = new short[7];
        private byte[] byteDataTemp = new byte[0];
        public String[] strData = new String[2];
        public boolean[] boolData = new boolean[3];
        public int[] equipAccessary = new int[3];
        public int[] equipStatus = new int[6];
        public byte[] bitem = new byte[5];
        public byte[] bitemAt = new byte[5];
        public byte[] supportLevel = new byte[32];
        public byte[] cheatLevel = new byte[32];
        public byte[] worldLevel = new byte[21];
        public MogInfo mog = new MogInfo();
        public boolean[][] mixFlg = new boolean[6][];
        public short[][] mixEvent = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 5, 4);
        public boolean saveflag = false;

        public PlayerData(GameStatus gameStatus) {
            this.this$0 = gameStatus;
            this.mixFlg[0] = new boolean[50];
            this.mixFlg[1] = new boolean[90];
            this.mixFlg[2] = new boolean[90];
            this.mixFlg[3] = new boolean[90];
            this.mixFlg[4] = new boolean[90];
            this.mixFlg[5] = new boolean[90];
            this.mixFlg[0][0] = true;
            this.mixFlg[1][0] = true;
            this.mixFlg[2][0] = true;
            this.mixFlg[3][0] = true;
            this.mixFlg[4][0] = true;
            this.mixFlg[5][0] = true;
        }

        public void abilityLevelChange(int i, int i2, int i3) {
            int abilityLevel = getAbilityLevel(i, i2) + i3;
            if (abilityLevel < Game.getAbilityData(i, i2, 0)) {
                abilityLevel = Game.getAbilityData(i, i2, 0);
            }
            if (abilityLevel > Game.getAbilityData(i, i2, 1)) {
                abilityLevel = Game.getAbilityData(i, i2, 1);
            }
            setAbilityLevel(i, i2, abilityLevel);
        }

        public boolean addBItem(int i, int i2) {
            if (Item.getItemData(1, i2) == null || !haveItem(1, i2)) {
                return false;
            }
            if (this.bitem[i] >= 0) {
                addItem(1, this.bitem[i], 1, false);
            }
            delItem(1, i2, 1);
            this.bitem[i] = (byte) i2;
            return true;
        }

        public void addExp(int i) {
            if (getNumberData(3) >= getNumberData(4)) {
                return;
            }
            setNumberData(5, Util.attadd(getNumberData(5), i, this.EXP_MAX));
            do {
                i += -getNumberData(32);
                if (i < 0) {
                    setNumberData(32, -i);
                    return;
                }
                setNumberData(3, Util.attadd(getNumberData(3), 1, getNumberData(4)));
                int levelStatus = (getLevelStatus(0) + this.equipStatus[2]) - Character.charData[0].maxHp;
                if (levelStatus < 0 || Character.charData[0].maxHp >= 218) {
                    levelStatus = 0;
                }
                if (levelStatus > 0 && Character.charData[0].maxHp + levelStatus > 218) {
                    levelStatus = 218 - Character.charData[0].maxHp;
                }
                CharData charData = Character.charData[0];
                charData.f12hp = (short) (levelStatus + charData.f12hp);
                Character.setEquipEff(0);
                if (Character.charData[0].f12hp > Character.charData[0].maxHp) {
                    Character.charData[0].f12hp = Character.charData[0].maxHp;
                }
                setNumberData(32, getLevelStatus(3));
                setNumberData(38, 30);
            } while (getNumberData(3) != getNumberData(4));
            setNumberData(5, getNumberData(5) - i);
        }

        public boolean addItem(int i, int i2, int i3) {
            return addItem(i, i2, i3, true);
        }

        public boolean addItem(int i, int i2, int i3, boolean z) {
            return addItem(i, i2, i3, z, true);
        }

        public boolean addItem(int i, int i2, int i3, boolean z, boolean z2) {
            ItemData itemData = Item.getItemData(i, i2);
            if (itemData == null) {
                return false;
            }
            if (i == 7) {
                switch (itemData.effectId[0]) {
                    case 11:
                        Vector vectorSplitCommand = Network.splitCommand("<SendClearCode>", Network.AKCommand(4, null, new StringBuffer().append("uid=").append(Game.TEST_UID).append("&ctype=C&ccode=KHC_").append((int) itemData.effectAmount[0]).append("&acode=ITEM_GET").toString(), z2));
                        if (vectorSplitCommand == null) {
                            Network.dispAkErrorDialog(-1);
                            return false;
                        }
                        if (Util.s2i((String) vectorSplitCommand.elementAt(0)) != 0) {
                            Network.dispAkErrorDialog(Util.s2i((String) vectorSplitCommand.elementAt(0)));
                            return false;
                        }
                        break;
                    case 12:
                        if (isFlg(11, itemData.effectAmount[0])) {
                            return false;
                        }
                        setFlg(11, itemData.effectAmount[0]);
                        break;
                    case 13:
                        if (isFlg(12, itemData.effectAmount[0])) {
                            return false;
                        }
                        setFlg(12, itemData.effectAmount[0]);
                        break;
                }
            } else if (i == 8) {
                this.mixFlg[itemData.effectId[0] - 16][itemData.effectAmount[0]] = true;
            } else if (i == 6 && GameStatus.PLAYER.getNumberData(19) == 5 && this.item[i][i2] < 0 && !Game.insertLicense(i2)) {
                int iDustLicense = Game.dustLicense(i2);
                this.item[i][iDustLicense] = -1;
                if (iDustLicense == i2) {
                    return false;
                }
                Game.insertLicense(i2);
            }
            byte b = this.item[i][i2];
            if (b >= itemData.numMax) {
                return false;
            }
            if (b < 0) {
                b = 0;
            }
            int i4 = b + i3;
            if (i4 > itemData.numMax) {
                i4 = itemData.numMax;
            }
            this.item[i][i2] = (byte) i4;
            if (i == 6 && GameStatus.PLAYER.isW7Lv() && this.item[i][i2] > 1) {
                int levelStatus = (GameStatus.PLAYER.getLevelStatus(0) + GameStatus.PLAYER.equipStatus[2]) - Character.charData[0].maxHp;
                if (levelStatus < 0 || Character.charData[0].maxHp >= 218) {
                    levelStatus = 0;
                }
                if (levelStatus > 0 && Character.charData[0].maxHp + levelStatus > 218) {
                    levelStatus = 218 - Character.charData[0].maxHp;
                }
                CharData charData = Character.charData[0];
                charData.f12hp = (short) (levelStatus + charData.f12hp);
                Character.setEquipEff(0);
                if (Character.charData[0].f12hp > Character.charData[0].maxHp) {
                    Character.charData[0].f12hp = Character.charData[0].maxHp;
                }
                GameStatus.PLAYER.setNumberData(38, 30);
            }
            return true;
        }

        public void autoReload(int i) {
            autoReload(i, false);
        }

        public void autoReload(int i, boolean z) {
            if (!isFlg(13, 11) || this.bitemAt[i] < 0) {
                return;
            }
            if (z || (Game.eventBit & 1) == 0) {
                if (haveItem(1, this.bitemAt[i])) {
                    addBItem(i, this.bitemAt[i]);
                } else if (this.bitem[i] < 0) {
                    this.bitemAt[i] = -1;
                }
            }
        }

        public boolean backBItem(int i) {
            if (this.bitem[i] < 0) {
                return false;
            }
            addItem(1, this.bitem[i], 1, false);
            delBItem(i);
            return true;
        }

        public void cureDebugPower(float f, boolean z, boolean z2) {
            cureDebugPower(f, z, z2, false);
        }

        public void cureDebugPower(float f, boolean z, boolean z2, boolean z3) {
            if (Character.charData[0].f12hp == 0) {
                return;
            }
            if (z3 || !Attack.isTCGaugeView()) {
                int i = (int) (100.0f * f);
                if (z2) {
                    i = ((this.equipStatus[3] + 100) * i) / 100;
                }
                if (z) {
                    setNumberData(34, (getNumberData(10) + i > 10000 ? i - ((getNumberData(10) + i) - 10000) : i) / 100);
                    setNumberData(36, 15);
                }
                setNumberData(10, Math.min(getNumberData(10) + i, DBG_POWER_MAX));
                return;
            }
            int i2 = (int) f;
            if (z) {
                if (GameStatus.GAME.trinityPower + i2 > 100) {
                    i2 = ((int) f) - ((GameStatus.GAME.trinityPower + ((int) f)) - 100);
                }
                setNumberData(34, i2);
                setNumberData(36, 15);
            }
            GameStatus.GAME.trinityPower = Math.min(100, GameStatus.GAME.trinityPower + ((int) f));
        }

        public void delAllKeyItem() {
            for (int i = 0; i < 26; i++) {
                delItem(5, i, 99);
            }
            for (int i2 = 0; i2 < this.item[6].length; i2++) {
                this.item[6][i2] = -1;
            }
        }

        public boolean delBItem(int i) {
            if (this.bitem[i] < 0) {
                return false;
            }
            this.bitem[i] = -1;
            return true;
        }

        public boolean delItem(int i, int i2, int i3) {
            byte b;
            if (Item.getItemData(i, i2) == null || !haveItem(i, i2) || (b = this.item[i][i2]) <= 0) {
                return false;
            }
            byte b2 = (byte) (b - i3);
            if (b2 <= 0) {
                b2 = -1;
            }
            this.item[i][i2] = b2;
            return true;
        }

        public boolean delLicense(int i, int i2, int i3) {
            byte b;
            if (Item.getItemData(i, i2) == null || !haveItem(i, i2) || (b = this.item[i][i2]) <= 0) {
                return false;
            }
            byte b2 = (byte) (b - i3);
            this.item[i][i2] = b2 > 0 ? b2 : (byte) 0;
            return true;
        }

        public void downDebugPower(int i) {
            setNumberData(10, Math.max(getNumberData(10) - (i * 100), 0));
        }

        public int getAbilityEff(int i, int i2) {
            return getAbilityEff(i, i2, GameStatus.PLAYER.getAbilityLevel(i, i2));
        }

        public int getAbilityEff(int i, int i2, int i3) {
            if (Attack.isTCGaugeView() && i == 0 && i2 == 14) {
                return 15;
            }
            return Game.getAbilityData(i, i2, i3 + 8);
        }

        public int getAbilityLevel(int i, int i2) {
            return i == 0 ? GameStatus.PLAYER.supportLevel[i2] : GameStatus.PLAYER.cheatLevel[i2];
        }

        public int[] getAllFlgId(int i) {
            int i2 = 0;
            int[] iArr = new int[getFlgNum(i)];
            int i3 = 0;
            while (true) {
                int i4 = i2;
                if (i4 >= 32) {
                    return iArr;
                }
                if (isFlg(i, i4)) {
                    iArr[i3] = i4;
                    i3++;
                }
                i2 = i4 + 1;
            }
        }

        public int getAllItemNum() {
            int categoryItemNum = 0;
            int i = 0;
            while (true) {
                int i2 = categoryItemNum;
                if (i > 5) {
                    return i2;
                }
                categoryItemNum = getCategoryItemNum(i) + i2;
                i++;
            }
        }

        public int getAtk() {
            return GameStatus.PLAYER.getLevelStatus(1) + this.equipStatus[0];
        }

        public int getBItemEmptyIndex() {
            for (int i = 0; i < getNumberData(27); i++) {
                if (this.bitem[i] < 0 && this.bitemAt[i] < 0) {
                    return i;
                }
            }
            return -1;
        }

        public int getBItemIndex(int i) {
            for (int i2 = 0; i2 < getNumberData(27); i2++) {
                if (this.bitem[i2] == i) {
                    return i2;
                }
            }
            return -1;
        }

        public int getBItemNum() {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i;
                if (i2 >= getNumberData(27)) {
                    return i3;
                }
                i = this.bitem[i2] >= 0 ? i3 + 1 : i3;
                i2++;
            }
        }

        public int getBItemNum(int i) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2;
                if (i3 >= getNumberData(27)) {
                    return i4;
                }
                if (this.bitem[i3] >= 0 && this.bitem[i3] == i) {
                    i4++;
                }
                i2 = i4;
                i3++;
            }
        }

        public int getCategoryItemNum(int i) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2;
                if (i3 >= this.item[i].length) {
                    return i4;
                }
                i2 = this.item[i][i3] >= 0 ? i4 + 1 : i4;
                i3++;
            }
        }

        public int getCategoryItemNum(int i, int i2) {
            ItemData itemData;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3;
                if (i4 >= this.item[i].length) {
                    return i5;
                }
                if (this.item[i][i4] >= 0 && (itemData = Item.getItemData(i, i4)) != null && (itemData.type & i2) != 0) {
                    i5++;
                }
                i3 = i5;
                i4++;
            }
        }

        public int getDebugPower() {
            return getNumberData(10) / 100;
        }

        public int getDef() {
            return GameStatus.PLAYER.getLevelStatus(2) + this.equipStatus[1];
        }

        public int getEquipAccessaryNum() {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i;
                if (i2 >= getNumberData(28)) {
                    return i3;
                }
                i = this.equipAccessary[i2] >= 0 ? i3 + 1 : i3;
                i2++;
            }
        }

        public int getEquipAccessaryNum(int i) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2;
                if (i3 >= getNumberData(28)) {
                    return i4;
                }
                if (this.equipAccessary[i3] >= 0 && this.equipAccessary[i3] == i) {
                    i4++;
                }
                i2 = i4;
                i3++;
            }
        }

        public int getEquipId(int i, int i2) {
            switch (i) {
                case 0:
                    return this.equipAccessary[i2];
                default:
                    return -1;
            }
        }

        public int getExeDebugAbilityEff(int i) {
            int exeCheatIndex = GameStatus.EXTRA.getExeCheatIndex(i);
            if (GameStatus.EXTRA.getExeCheatIndex(i) < 0) {
                return 0;
            }
            return Game.getAbilityData(1, i, GameStatus.EXTRA.getExeCheatLevel(exeCheatIndex) + 8);
        }

        public int getFlgNum(int i) {
            int i2 = 0;
            for (int i3 = 0; i3 < 32; i3++) {
                if (isFlg(i, i3)) {
                    i2++;
                }
            }
            return i2;
        }

        public int getItemNum() {
            int categoryItemNum = 0;
            int i = 0;
            while (true) {
                int i2 = categoryItemNum;
                if (i > 5) {
                    return i2;
                }
                categoryItemNum = getCategoryItemNum(i) + i2;
                i++;
            }
        }

        public int getLevelStatus(int i) {
            return getLevelStatus(Game.getPlayerLv(), i);
        }

        public int getLevelStatus(int i, int i2) {
            int i3;
            int i4;
            int i5 = 20;
            if (Game.eventGBVar[48] && Game.eventGBVar[52]) {
                i3 = 4;
                i4 = 6;
            } else if (Game.eventGBVar[48] && Game.eventGBVar[53]) {
                i3 = 5;
                i4 = 6;
                i5 = 18;
            } else if (Game.eventGBVar[49] && Game.eventGBVar[51]) {
                i3 = 6;
                i4 = 4;
            } else if (Game.eventGBVar[49] && Game.eventGBVar[53]) {
                i3 = 6;
                i4 = 5;
                i5 = 18;
            } else if (Game.eventGBVar[50] && Game.eventGBVar[51]) {
                i3 = 5;
                i4 = 4;
                i5 = 22;
            } else if (Game.eventGBVar[50] && Game.eventGBVar[52]) {
                i3 = 4;
                i4 = 5;
                i5 = 22;
            } else {
                i3 = 5;
                i4 = 5;
            }
            switch (i2) {
                case 0:
                    return ((i - 1) * 2) + i5;
                case 1:
                    return ((i - 1) * 2) + i4;
                case 2:
                    return i3 + ((i - 1) * 2);
                case 3:
                    return i * i * 4;
                default:
                    return 0;
            }
        }

        public int getMaxAp() {
            return getNumberData(26) + this.equipStatus[5];
        }

        public int getMaxHp() {
            return GameStatus.PLAYER.getLevelStatus(0) + this.equipStatus[2];
        }

        public int getNumberData(int i) {
            if (i < 16) {
                return this.intData[i];
            }
            if (i < 18) {
                return this.shortData[(i - 16) - 1];
            }
            if (i < 31) {
                return this.byteData[(i - 18) - 1];
            }
            if (i < 35) {
                return this.intDataTemp[(i - 31) - 1];
            }
            return i < 43 ? this.shortDataTemp[(i - 35) - 1] : this.byteDataTemp[(i - 43) - 1];
        }

        public boolean haveItem(int i, int i2) {
            return Item.getItemData(i, i2) != null && this.item[i][i2] > 0;
        }

        public void init() {
            this.strData[0] = "";
            this.strData[1] = "";
            setNumberData(6, 0);
            setNumberData(7, 0);
            setNumberData(1, 0);
            setNumberData(25, 0);
            setNumberData(26, 0);
            setNumberData(3, 1);
            setNumberData(5, 0);
            setNumberData(32, getLevelStatus(1, 3));
            setNumberData(38, -1);
            setNumberData(39, -1);
            setNumberData(11, 0);
            setNumberData(12, 0);
            setNumberData(13, 0);
            setNumberData(14, 0);
            setNumberData(24, 0);
            setNumberData(17, 0);
            this.boolData[0] = false;
            this.boolData[1] = false;
            for (int i = 0; i < 3; i++) {
                this.equipAccessary[i] = -1;
            }
            for (int i2 = 0; i2 < 6; i2++) {
                this.equipStatus[i2] = 0;
            }
            for (int i3 = 0; i3 < 5; i3++) {
                this.bitem[i3] = -1;
                this.bitemAt[i3] = -1;
            }
            if (this.item != null) {
                for (int i4 = 0; i4 < this.item.length; i4++) {
                    this.item[i4] = new byte[Item.getCategoryItemNum(i4)];
                    for (int i5 = 0; i5 < this.item[i4].length; i5++) {
                        this.item[i4][i5] = -1;
                    }
                }
            }
            for (int i6 = 0; i6 < 5; i6++) {
                this.mixEvent[i6][0] = -1;
            }
            for (int i7 = 0; i7 < this.mixFlg.length; i7++) {
                for (int i8 = 0; i8 < this.mixFlg[i7].length; i8++) {
                    this.mixFlg[i7][i8] = false;
                }
            }
            this.mixFlg[0][0] = true;
            this.mixFlg[1][0] = true;
            this.mixFlg[2][0] = true;
            this.mixFlg[3][0] = true;
            this.mixFlg[4][0] = true;
            this.mixFlg[5][0] = true;
            for (int i9 = 0; i9 < this.worldLevel.length; i9++) {
                this.worldLevel[i9] = 1;
            }
            setNumberData(30, 0);
        }

        public void initItem() {
            this.item = new byte[Item.getCategoryNum()][];
            for (int i = 0; i < this.item.length; i++) {
                this.item[i] = new byte[Item.getCategoryItemNum(i)];
                for (int i2 = 0; i2 < this.item[i].length; i2++) {
                    this.item[i][i2] = -1;
                }
            }
        }

        public boolean isBossStage() {
            return getNumberData(21) == 1 || getNumberData(21) == 9;
        }

        public boolean isFlg(int i, int i2) {
            if ((i == 14 || i == 13) && GameStatus.PLAYER.getNumberData(19) == 5 && Game.menu.dispId != 22) {
                return false;
            }
            return (getNumberData(i) & (1 << i2)) != 0;
        }

        public boolean isW7Lv() {
            return GameStatus.PLAYER.getNumberData(20) == 7 && GameStatus.PLAYER.getNumberData(21) == 0 && GameStatus.PLAYER.getNumberData(19) == 2;
        }

        public void playTimeCount() {
            if (getNumberData(1) >= 54000000) {
                setNumberData(1, 54000000);
            } else {
                setNumberData(1, getNumberData(1) + 1);
            }
        }

        public void setAbilityLevel(int i, int i2, int i3) {
            if (i == 0) {
                GameStatus.PLAYER.supportLevel[i2] = (byte) i3;
            } else {
                GameStatus.PLAYER.cheatLevel[i2] = (byte) i3;
            }
        }

        public boolean setEquipItem(int i, int i2, int i3) {
            ItemData itemData = null;
            switch (i) {
                case 0:
                    itemData = Item.getItemData(0, i3);
                    if (itemData == null) {
                        return false;
                    }
                    this.equipAccessary[i2] = i3;
                    break;
                    break;
            }
            for (int i4 = 0; i4 < itemData.effectAmount.length; i4++) {
                switch (itemData.effectId[i4]) {
                    case 5:
                        int[] iArr = this.equipStatus;
                        iArr[0] = iArr[0] + itemData.effectAmount[i4];
                        break;
                    case 6:
                        int[] iArr2 = this.equipStatus;
                        iArr2[1] = iArr2[1] + itemData.effectAmount[i4];
                        break;
                    case 7:
                        int[] iArr3 = this.equipStatus;
                        iArr3[2] = iArr3[2] + itemData.effectAmount[i4];
                        break;
                    case 8:
                        int[] iArr4 = this.equipStatus;
                        iArr4[3] = iArr4[3] + itemData.effectAmount[i4];
                        break;
                    case 9:
                        int[] iArr5 = this.equipStatus;
                        iArr5[4] = iArr5[4] + itemData.effectAmount[i4];
                        break;
                    case 10:
                        int[] iArr6 = this.equipStatus;
                        iArr6[5] = iArr6[5] + itemData.effectAmount[i4];
                        break;
                }
            }
            return true;
        }

        public void setFlg(int i, int i2) {
            setFlg(i, i2, true);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.docomostar.lang.IllegalStateException */
        public void setFlg(int i, int i2, boolean z) throws IllegalStateException {
            setNumberData(i, getNumberData(i) | (1 << i2));
            if ((i == 12 || i == 11) && Game.eventStr[16] != null && !Game.eventStr[16].equals("")) {
                Game.menu.viewSysMessage(Game.setMessage(Game.eventStr[16]), 745, 180, 200);
                Game.eventStr[16] = "";
            }
            if (z) {
                if (i == 12 || i == 11) {
                    int i3 = i == 11 ? 0 : 1;
                    if (Game.isAbilityPoint(i3, i2)) {
                        if (i3 != 1 || getFlgNum(14) < 8) {
                            GameCommon.resetPushKey();
                            if (Game.menu.commonQuestion(new StringBuffer().append(Game.getCheatModeName(i3, i2)).append("|を装備しますか？").toString(), new String[]{"はい", "いいえ"}, 0, 0, 90, 240, 1) == 0) {
                                if (i3 == 1 && ((i2 == 0 || i2 == 1 || i2 == 2) && (Game.isEquipAbility(1, 0) || Game.isEquipAbility(1, 1) || Game.isEquipAbility(1, 2)))) {
                                    Sound.play_se(0, 1, 9);
                                    Game.menu.commonQuestion("\u3000Dファイア、Dブリザド、|\u3000Dサンダーは同時に１つ|\u3000までしか装備できません", new String[]{"OK"}, 0, 0, 120, 180, 1);
                                    return;
                                }
                                Game.equipAbility(i3, i2);
                            }
                            Game.soraCharDataReload();
                        }
                    }
                }
            }
        }

        public void setNumberData(int i, int i2) {
            if (i < 16) {
                this.intData[i] = i2;
                return;
            }
            if (i < 18) {
                this.shortData[(i - 16) - 1] = (short) i2;
                return;
            }
            if (i < 31) {
                this.byteData[(i - 18) - 1] = (byte) i2;
                return;
            }
            if (i < 35) {
                this.intDataTemp[(i - 31) - 1] = i2;
            } else if (i < 43) {
                this.shortDataTemp[(i - 35) - 1] = (short) i2;
            } else {
                this.byteDataTemp[(i - 43) - 1] = (byte) i2;
            }
        }

        public boolean unsetEquipItem(int i, int i2, int i3, int i4) {
            int i5;
            ItemData itemData = null;
            switch (i) {
                case 0:
                    if (i4 >= 0) {
                        ItemData itemData2 = Item.getItemData(0, i4);
                        i5 = 0;
                        for (int i6 = 0; i6 < itemData2.effectAmount.length; i6++) {
                            if (itemData2.effectId[i6] == 10) {
                                i5 += itemData2.effectAmount[i6];
                            }
                        }
                    } else {
                        i5 = 0;
                    }
                    ItemData itemData3 = Item.getItemData(0, i3);
                    if (itemData3 == null) {
                        return false;
                    }
                    int i7 = 0;
                    for (int i8 = 0; i8 < itemData3.effectAmount.length; i8++) {
                        if (itemData3.effectId[i8] == 10) {
                            i7 += itemData3.effectAmount[i8];
                        }
                    }
                    if ((getMaxAp() + i5) - i7 < getNumberData(25)) {
                        return false;
                    }
                    this.equipAccessary[i2] = -1;
                    itemData = itemData3;
                    break;
                    break;
            }
            for (int i9 = 0; i9 < itemData.effectAmount.length; i9++) {
                switch (itemData.effectId[i9]) {
                    case 5:
                        int[] iArr = this.equipStatus;
                        iArr[0] = iArr[0] - itemData.effectAmount[i9];
                        break;
                    case 6:
                        int[] iArr2 = this.equipStatus;
                        iArr2[1] = iArr2[1] - itemData.effectAmount[i9];
                        break;
                    case 7:
                        int[] iArr3 = this.equipStatus;
                        iArr3[2] = iArr3[2] - itemData.effectAmount[i9];
                        break;
                    case 8:
                        int[] iArr4 = this.equipStatus;
                        iArr4[3] = iArr4[3] - itemData.effectAmount[i9];
                        break;
                    case 9:
                        int[] iArr5 = this.equipStatus;
                        iArr5[4] = iArr5[4] - itemData.effectAmount[i9];
                        break;
                    case 10:
                        int[] iArr6 = this.equipStatus;
                        iArr6[5] = iArr6[5] - itemData.effectAmount[i9];
                        break;
                }
            }
            return true;
        }

        public void unsetFlg(int i, int i2) {
            setNumberData(i, getNumberData(i) & ((1 << i2) ^ (-1)));
        }

        public void useBItem(int i, int i2) {
            int i3;
            if (Attack.isHoming()) {
                Attack.resetHoming();
            }
            if (Attack.isRC()) {
                Attack.resetRC();
            }
            int i4 = 9;
            if (getNumberData(19) != 4) {
                Character.charData[i].useItemWait = (short) 25;
                Character.charData[i].useItemId = this.bitem[i2];
                Character.charData[i].invCnt = (short) 30;
                Character.motionSet(i, 39);
            } else {
                Character.charData[i].useItemWait = (short) 3;
                Character.charData[i].invCnt = (short) 5;
                Character.charData[i].useItemId = this.bitem[i2];
                Character.motionSet(i, 39);
                i4 = -1;
            }
            if (i4 >= 0 && (i3 = Effect.set(i4, 0, Character.charData[i].f69x, Character.charData[i].f70y + Character.charData[i].height, Character.charData[i].f71z, 2.0f, 0, 0, 0.0f, i + ID_EFFECT_ITEMUSE)) >= 0) {
                Effect.homingBind(i3, Character.charData[i], Character.charData[i].height);
            }
            Sound.play_se(0, 1, 16);
            delBItem(i2);
            autoReload(i2);
        }

        public boolean useItemMenu(int i, int i2, boolean z) {
            if (!z && !haveItem(i, i2)) {
                return false;
            }
            ItemData itemData = Item.getItemData(i, i2);
            short s = itemData.effectAmount[0];
            int abilityEff = s;
            if (GameStatus.PLAYER.isFlg(13, 9)) {
                abilityEff = (s * (getAbilityEff(0, 9) + 100)) / 100;
            }
            for (int i3 = 0; i3 < itemData.effectId.length; i3++) {
                switch (itemData.effectId[i3]) {
                    case 2:
                        Character.cure(0, abilityEff);
                        break;
                    case 3:
                        cureDebugPower(abilityEff, false, true, true);
                        break;
                }
            }
            if (!z) {
                delItem(i, i2, 1);
            }
            Sound.play_se(0, 1, 33);
            return true;
        }
    }

    private GameStatus() {
        initSystemData();
        PLAYER = new PlayerData(this);
        PLAYER.init();
        GAME = new GameData(this);
        EXTRA = new ExtraStatus(this);
    }

    private static int dataLoad(Vector vector, int i) throws Throwable {
        Throwable th;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        do {
            try {
            } catch (Exception e) {
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
            }
        } while (scratchpadAccess);
        scratchpadAccess = true;
        DataInputStream dataInputStreamOpenDataInputStream = Connector.openDataInputStream(new StringBuffer().append("scratchpad:///0;pos=").append(saveDataDivision[i]).toString());
        try {
            int iDataSaveLoad = dataSaveLoad(null, dataInputStreamOpenDataInputStream, vector, false, i);
            if (dataInputStreamOpenDataInputStream != null) {
                try {
                    dataInputStreamOpenDataInputStream.close();
                } catch (Exception e2) {
                }
            }
            scratchpadAccess = false;
            return iDataSaveLoad;
        } catch (Exception e3) {
            dataInputStream2 = dataInputStreamOpenDataInputStream;
            if (dataInputStream2 != null) {
                try {
                    dataInputStream2.close();
                } catch (Exception e4) {
                }
            }
            scratchpadAccess = false;
            return 0;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = dataInputStreamOpenDataInputStream;
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (Exception e5) {
                }
            }
            scratchpadAccess = false;
            throw th;
        }
    }

    private static int dataLoad(byte[] bArr, Vector vector, int i) throws Throwable {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        int iDataSaveLoad = 0;
        try {
            dataInputStream = new DataInputStream(Util.byte2InputStream(bArr));
            try {
                iDataSaveLoad = dataSaveLoad(null, dataInputStream, vector, false, i);
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e2) {
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (Exception e3) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    try {
                        dataInputStream2.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            dataInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        return iDataSaveLoad;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007e A[Catch: Exception -> 0x00bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:11:0x0079, B:13:0x007e), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x008e A[Catch: Exception -> 0x00b1, TRY_LEAVE, TryCatch #10 {Exception -> 0x00b1, blocks: (B:19:0x0089, B:21:0x008e), top: B:53:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #5 {Exception -> 0x00a5, blocks: (B:26:0x009a, B:28:0x009f), top: B:51:0x009a }] */
    private static byte[] dataSave(Vector vector, int i) throws Throwable {
        DataInputStream dataInputStream;
        DataOutputStream dataOutputStreamOpenDataOutputStream;
        DataInputStream dataInputStream2;
        do {
            try {
            } catch (Exception e) {
                dataInputStream2 = null;
                dataOutputStreamOpenDataOutputStream = null;
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
                dataOutputStreamOpenDataOutputStream = null;
            }
        } while (scratchpadAccess);
        scratchpadAccess = true;
        DataOutputStream dataOutputStreamOpenDataOutputStream2 = Connector.openDataOutputStream(new StringBuffer().append("scratchpad:///0;pos=").append(saveDataDivision[i] + 8).toString());
        try {
            int iDataSaveLoad = dataSaveLoad(dataOutputStreamOpenDataOutputStream2, null, vector, true, i);
            dataOutputStreamOpenDataOutputStream2.close();
            int i2 = iDataSaveLoad + 8;
            dataOutputStreamOpenDataOutputStream = Connector.openDataOutputStream(new StringBuffer().append("scratchpad:///0;pos=").append(saveDataDivision[i]).toString());
            try {
                dataOutputStreamOpenDataOutputStream.writeInt(i2);
                dataOutputStreamOpenDataOutputStream.writeInt(19);
                dataOutputStreamOpenDataOutputStream.close();
                byte[] bArr = new byte[i2];
                DataInputStream dataInputStreamOpenDataInputStream = Connector.openDataInputStream(new StringBuffer().append("scratchpad:///0;pos=").append(saveDataDivision[i]).toString());
                try {
                    dataInputStreamOpenDataInputStream.read(bArr);
                    if (dataOutputStreamOpenDataOutputStream != null) {
                        try {
                            dataOutputStreamOpenDataOutputStream.close();
                            if (dataInputStreamOpenDataInputStream != null) {
                                dataInputStreamOpenDataInputStream.close();
                            }
                        } catch (Exception e2) {
                        }
                    } else if (dataInputStreamOpenDataInputStream != null) {
                        dataInputStreamOpenDataInputStream.close();
                    }
                    scratchpadAccess = false;
                    return bArr;
                } catch (Exception e3) {
                    dataInputStream2 = dataInputStreamOpenDataInputStream;
                    if (dataOutputStreamOpenDataOutputStream != null) {
                        try {
                            dataOutputStreamOpenDataOutputStream.close();
                            if (dataInputStream2 != null) {
                                dataInputStream2.close();
                            }
                        } catch (Exception e4) {
                            scratchpadAccess = false;
                            return null;
                        }
                    } else if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    scratchpadAccess = false;
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStreamOpenDataInputStream;
                    if (dataOutputStreamOpenDataOutputStream != null) {
                        try {
                            dataOutputStreamOpenDataOutputStream.close();
                            if (dataInputStream != null) {
                                dataInputStream.close();
                            }
                        } catch (Exception e5) {
                            scratchpadAccess = false;
                            throw th;
                        }
                    } else if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    scratchpadAccess = false;
                    throw th;
                }
            } catch (Exception e6) {
                dataInputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = null;
            }
        } catch (Exception e7) {
            dataInputStream2 = null;
            dataOutputStreamOpenDataOutputStream = dataOutputStreamOpenDataOutputStream2;
        } catch (Throwable th4) {
            th = th4;
            dataInputStream = null;
            dataOutputStreamOpenDataOutputStream = dataOutputStreamOpenDataOutputStream2;
        }
    }

    private static int dataSaveLoad(DataOutputStream dataOutputStream, DataInputStream dataInputStream, Vector vector, boolean z, int i) {
        int length;
        int i2;
        if (z) {
            i2 = 0;
        } else {
            try {
                i2 = dataInputStream.readInt();
                try {
                    dataInputStream.readInt();
                } catch (Exception e) {
                    length = i2;
                }
            } catch (Exception e2) {
                length = 0;
            }
        }
        length = i2;
        for (int i3 = 0; i3 < vector.size(); i3++) {
            try {
                Object objElementAt = vector.elementAt(i3);
                String name = objElementAt.getClass().getName();
                if (name.equals("[I")) {
                    int[] iArr = (int[]) objElementAt;
                    for (int i4 = 0; i4 < iArr.length; i4++) {
                        if (dataOutputStream != null) {
                            dataOutputStream.writeInt(iArr[i4]);
                            length += 4;
                        } else {
                            iArr[i4] = dataInputStream.readInt();
                        }
                    }
                } else if (name.equals("[[I")) {
                    int[][] iArr2 = (int[][]) objElementAt;
                    for (int i5 = 0; i5 < iArr2.length; i5++) {
                        for (int i6 = 0; i6 < iArr2[i5].length; i6++) {
                            if (dataOutputStream != null) {
                                dataOutputStream.writeInt(iArr2[i5][i6]);
                                length += 4;
                            } else {
                                iArr2[i5][i6] = dataInputStream.readInt();
                            }
                        }
                    }
                } else if (name.equals("[[[I")) {
                    int[][][] iArr3 = (int[][][]) objElementAt;
                    for (int i7 = 0; i7 < iArr3.length; i7++) {
                        for (int i8 = 0; i8 < iArr3[i7].length; i8++) {
                            for (int i9 = 0; i9 < iArr3[i7][i8].length; i9++) {
                                if (dataOutputStream != null) {
                                    dataOutputStream.writeInt(iArr3[i7][i8][i9]);
                                    length += 4;
                                } else {
                                    iArr3[i7][i8][i9] = dataInputStream.readInt();
                                }
                            }
                        }
                    }
                } else if (name.equals("[S")) {
                    short[] sArr = (short[]) objElementAt;
                    for (int i10 = 0; i10 < sArr.length; i10++) {
                        if (dataOutputStream != null) {
                            dataOutputStream.writeShort(sArr[i10]);
                            length += 2;
                        } else {
                            sArr[i10] = dataInputStream.readShort();
                        }
                    }
                } else if (name.equals("[[S")) {
                    short[][] sArr2 = (short[][]) objElementAt;
                    for (int i11 = 0; i11 < sArr2.length; i11++) {
                        for (int i12 = 0; i12 < sArr2[i11].length; i12++) {
                            if (dataOutputStream != null) {
                                dataOutputStream.writeShort(sArr2[i11][i12]);
                                length += 2;
                            } else {
                                sArr2[i11][i12] = dataInputStream.readShort();
                            }
                        }
                    }
                } else if (name.equals("[[[S")) {
                    short[][][] sArr3 = (short[][][]) objElementAt;
                    for (int i13 = 0; i13 < sArr3.length; i13++) {
                        for (int i14 = 0; i14 < sArr3[i13].length; i14++) {
                            for (int i15 = 0; i15 < sArr3[i13][i14].length; i15++) {
                                if (dataOutputStream != null) {
                                    dataOutputStream.writeShort(sArr3[i13][i14][i15]);
                                    length += 2;
                                } else {
                                    sArr3[i13][i14][i15] = dataInputStream.readShort();
                                }
                            }
                        }
                    }
                } else if (name.equals("[B")) {
                    byte[] bArr = (byte[]) objElementAt;
                    if (dataOutputStream != null) {
                        dataOutputStream.write(bArr);
                        length += bArr.length;
                    } else {
                        dataInputStream.read(bArr);
                    }
                } else if (name.equals("[[B")) {
                    byte[][] bArr2 = (byte[][]) objElementAt;
                    for (int i16 = 0; i16 < bArr2.length; i16++) {
                        if (dataOutputStream != null) {
                            dataOutputStream.write(bArr2[i16]);
                            length += bArr2[i16].length;
                        } else {
                            dataInputStream.read(bArr2[i16]);
                        }
                    }
                } else if (name.equals("[[[B")) {
                    byte[][][] bArr3 = (byte[][][]) objElementAt;
                    for (int i17 = 0; i17 < bArr3.length; i17++) {
                        for (int i18 = 0; i18 < bArr3[i17].length; i18++) {
                            if (dataOutputStream != null) {
                                dataOutputStream.write(bArr3[i17][i18]);
                                length += bArr3[i17][i18].length;
                            } else {
                                dataInputStream.read(bArr3[i17][i18]);
                            }
                        }
                    }
                } else if (name.equals("[F")) {
                    float[] fArr = (float[]) objElementAt;
                    for (int i19 = 0; i19 < fArr.length; i19++) {
                        if (dataOutputStream != null) {
                            dataOutputStream.writeFloat(fArr[i19]);
                            length += 4;
                        } else {
                            fArr[i19] = dataInputStream.readFloat();
                        }
                    }
                } else if (name.equals("[[F")) {
                    float[][] fArr2 = (float[][]) objElementAt;
                    for (int i20 = 0; i20 < fArr2.length; i20++) {
                        for (int i21 = 0; i21 < fArr2[i20].length; i21++) {
                            if (dataOutputStream != null) {
                                dataOutputStream.writeFloat(fArr2[i20][i21]);
                                length += 4;
                            } else {
                                fArr2[i20][i21] = dataInputStream.readFloat();
                            }
                        }
                    }
                } else if (name.equals("[[[F")) {
                    float[][][] fArr3 = (float[][][]) objElementAt;
                    for (int i22 = 0; i22 < fArr3.length; i22++) {
                        for (int i23 = 0; i23 < fArr3[i22].length; i23++) {
                            for (int i24 = 0; i24 < fArr3[i22][i23].length; i24++) {
                                if (dataOutputStream != null) {
                                    dataOutputStream.writeFloat(fArr3[i22][i23][i24]);
                                    length += 4;
                                } else {
                                    fArr3[i22][i23][i24] = dataInputStream.readFloat();
                                }
                            }
                        }
                    }
                } else if (name.equals("[Ljava.lang.String;")) {
                    String[] strArr = (String[]) objElementAt;
                    for (int i25 = 0; i25 < strArr.length; i25++) {
                        if (dataOutputStream != null) {
                            byte[] bytes = strArr[i25].getBytes();
                            dataOutputStream.writeByte(bytes.length);
                            dataOutputStream.write(bytes);
                            length += bytes.length + 1;
                        } else {
                            byte[] bArr4 = new byte[dataInputStream.readByte()];
                            dataInputStream.read(bArr4);
                            strArr[i25] = new String(bArr4);
                        }
                    }
                } else if (name.equals("[[Z")) {
                    boolean[][] zArr = (boolean[][]) objElementAt;
                    for (int i26 = 0; i26 < zArr.length; i26++) {
                        byte[] bArr5 = new byte[(zArr[i26].length / 8) + 1];
                        if (dataOutputStream == null) {
                            dataInputStream.read(bArr5);
                        }
                        for (int i27 = 0; i27 < zArr[i26].length; i27++) {
                            if (dataOutputStream == null) {
                                zArr[i26][i27] = (bArr5[i27 / 8] & (1 << (i27 % 8))) != 0;
                            } else if (zArr[i26][i27]) {
                                int i28 = i27 / 8;
                                bArr5[i28] = (byte) (bArr5[i28] | (1 << (i27 % 8)));
                            }
                        }
                        if (dataOutputStream != null) {
                            length += bArr5.length;
                            dataOutputStream.write(bArr5);
                        }
                    }
                } else if (name.equals("[Z")) {
                    boolean[] zArr2 = (boolean[]) objElementAt;
                    byte[] bArr6 = new byte[(zArr2.length / 8) + 1];
                    if (dataOutputStream == null) {
                        dataInputStream.read(bArr6);
                    }
                    for (int i29 = 0; i29 < zArr2.length; i29++) {
                        if (dataOutputStream == null) {
                            zArr2[i29] = (bArr6[i29 / 8] & (1 << (i29 % 8))) != 0;
                        } else if (zArr2[i29]) {
                            int i30 = i29 / 8;
                            bArr6[i30] = (byte) (bArr6[i30] | (1 << (i29 % 8)));
                        }
                    }
                    if (dataOutputStream != null) {
                        length += bArr6.length;
                        dataOutputStream.write(bArr6);
                    }
                }
            } catch (Exception e3) {
            }
        }
        vector.removeAllElements();
        return length;
    }

    public static void initSystemData() {
        systemData[0] = 19;
        systemData[1] = 0;
        systemData[2] = 3;
        systemData[3] = 0;
        systemData[4] = 0;
        systemData[5] = 0;
        systemData[6] = 0;
        systemData[7] = 114;
        systemData[8] = 0;
    }

    public static void load(int i) {
        dataLoad(saveDataSet(i), i);
        if (i == 0) {
            Sound.setVolume();
        }
    }

    public static void load(byte[] bArr, int i) throws Throwable {
        dataLoad(bArr, saveDataSet(i), i);
        if (i == 0) {
            Sound.setVolume();
        }
    }

    public static void loadGame(int i, boolean z) {
        load(0);
        if (i == 2 && z) {
            Vector vectorSplitCommand = Network.splitCommand("<APT>", Network.LAPCommand(1, "1,1", true));
            if (vectorSplitCommand != null) {
                if (Util.s2i((String) vectorSplitCommand.elementAt(0)) != 0) {
                    Network.dispCodedErrorDialog(-1);
                }
                systemData[8] = Util.s2i((String) vectorSplitCommand.elementAt(1));
                load(Base64.decode((String) vectorSplitCommand.elementAt(2)), 2);
                int[] iArr = systemData;
                iArr[1] = iArr[1] | 1;
                saveSystemData();
                saveGame(2, false);
            }
        } else if (i == 2 && (systemData[1] & 1) == 0 && PLAYER.saveflag) {
            Vector vectorSplitCommand2 = Network.splitCommand("<APT>", Network.LAPCommand(1, "1,1", true));
            if (vectorSplitCommand2 != null) {
                if (Util.s2i((String) vectorSplitCommand2.elementAt(0)) != 0) {
                    Network.dispCodedErrorDialog(-1);
                }
                systemData[8] = Util.s2i((String) vectorSplitCommand2.elementAt(1));
                load(Base64.decode((String) vectorSplitCommand2.elementAt(2)), 2);
                int[] iArr2 = systemData;
                iArr2[1] = iArr2[1] | 1;
                saveSystemData();
                saveGame(2, false);
            }
        } else {
            load(i);
        }
        if (PLAYER.getNumberData(19) >= 2) {
            PLAYER.boolData[2] = true;
        }
    }

    public static int[] loadSaveInfo() throws Throwable {
        Vector vector = new Vector();
        int[] iArr = new int[3];
        vector.addElement(iArr);
        dataLoad(vector, 2);
        vector.removeAllElements();
        return iArr;
    }

    public static void loadSystemData() {
        DataInputStream dataInputStreamOpenDataInputStream;
        do {
            try {
            } catch (Exception e) {
                dataInputStreamOpenDataInputStream = null;
            }
        } while (scratchpadAccess);
        scratchpadAccess = true;
        dataInputStreamOpenDataInputStream = Connector.openDataInputStream("scratchpad:///0;pos=0");
        try {
            if (dataInputStreamOpenDataInputStream == null) {
                scratchpadAccess = false;
                return;
            }
            dataInputStreamOpenDataInputStream.skip(8L);
            int i = dataInputStreamOpenDataInputStream.readInt();
            if (dataInputStreamOpenDataInputStream != null) {
                dataInputStreamOpenDataInputStream.close();
                dataInputStreamOpenDataInputStream = null;
            }
            scratchpadAccess = false;
            if (i == 0) {
                if (dataInputStreamOpenDataInputStream != null) {
                    dataInputStreamOpenDataInputStream.close();
                }
                initSystemData();
                saveSystemData();
            } else if (i != 19) {
                if (dataInputStreamOpenDataInputStream != null) {
                    dataInputStreamOpenDataInputStream.close();
                }
                initSystemData();
                saveSystemData();
            } else {
                load(0);
            }
            GameCommon.initKeyStyle();
        } catch (Exception e2) {
            if (dataInputStreamOpenDataInputStream != null) {
                try {
                    dataInputStreamOpenDataInputStream.close();
                } catch (Exception e3) {
                }
            }
            scratchpadAccess = false;
        }
    }

    public static byte[] save(int i) {
        return dataSave(saveDataSet(i), i);
    }

    private static Vector saveDataSet(int i) {
        Vector vector = new Vector();
        if (i == 0) {
            vector.addElement(systemData);
        } else if (i == 1 || i == 2) {
            vector.addElement(PLAYER.intData);
            vector.addElement(PLAYER.shortData);
            vector.addElement(PLAYER.byteData);
            vector.addElement(PLAYER.strData);
            vector.addElement(PLAYER.boolData);
            vector.addElement(PLAYER.equipAccessary);
            vector.addElement(PLAYER.item);
            vector.addElement(PLAYER.bitem);
            vector.addElement(PLAYER.bitemAt);
            vector.addElement(PLAYER.supportLevel);
            vector.addElement(PLAYER.cheatLevel);
            vector.addElement(PLAYER.worldLevel);
            PLAYER.mog.addElement(vector);
            vector.addElement(Game.eventWSVar);
            vector.addElement(Game.eventWBVar);
            vector.addElement(Game.eventGIVar);
            vector.addElement(Game.eventGBVar);
            vector.addElement(Game.eventItemFlg[1]);
            vector.addElement(Game.eventItemFlg[2]);
            vector.addElement(Game.EVENT_RUN_FLG);
            vector.addElement(PLAYER.mixFlg);
            vector.addElement(PLAYER.mixEvent);
        }
        return vector;
    }

    public static void saveGame(int i, boolean z) {
        if (i == 2) {
            int[] iArr = systemData;
            iArr[1] = iArr[1] | 1;
        }
        if (i == 2) {
            PLAYER.serverload = false;
        }
        save(0);
        byte[] bArrSave = save(i);
        if (i == 2 && z) {
            Vector vectorSplitCommand = Network.splitCommand("<APT>", Network.LAPCommand(1, new StringBuffer().append("1,2,").append(URLEncoder.encode(Util.addslash(Util.addslash(Util.delchar(Util.delchar(Base64.encode(bArrSave), '\n'), '\r'), 44), 41))).append(",").append(Main.MODEL).toString(), true));
            if (vectorSplitCommand == null) {
                Network.dispCodedErrorDialog(-1);
            }
            if (Util.s2i((String) vectorSplitCommand.elementAt(0)) < 0) {
                Network.dispCodedErrorDialog(-1);
            }
            systemData[8] = Util.s2i((String) vectorSplitCommand.elementAt(1));
            saveSystemData();
            Network.LAPCommand(0, "", true, true, 2, false);
            if (PLAYER.getNumberData(19) == 1 || Game.curList[PLAYER.getNumberData(20)]) {
                return;
            }
            Network.dispCurErrorDialog(true, -1);
        }
    }

    public static void saveSystemData() {
        systemData[0] = 19;
        save(0);
    }
}
