package p000;

import com.mascotcapsule.eruption.docomostar.Figure;
import com.mascotcapsule.eruption.docomostar.Transform;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class CharData extends VipObject {
    public short actCur;
    public short actId;
    public int actRange2;
    public short actTimer;
    public short actWait;
    public float ahDepth;
    public float ahHeight;
    public float ahWidth;
    public float ahX;
    public float ahY;
    public float ahZ;
    public short aiId;
    public short aliveCnt;
    public short alpha;
    public short alphaBack;
    public int ambient;
    public byte assistDir;
    public short atkCnt;
    public short attackPow;
    public short bindFigUserId;
    public int bitState;
    public short charId;
    public int ctrlLength;
    public short defense;
    public short delCnt;
    public float depth;
    public boolean disp;
    public int dmg;
    public short dmgCnt;
    public short dmgHp;
    public byte drawType;
    public float dwnDir;
    public float dwnSpd;
    public short exp;
    public Figure figure;
    public short flinchCnt;
    public short flinchCntMax;
    public short flinchTime;
    public float frame;
    public byte glideDir;
    public short guardAttribute;
    public float height;
    public float heightHang;
    public byte hitChar;

    /* JADX INFO: renamed from: hp */
    public short f12hp;
    public short image;
    public short invCnt;
    public short itableNo;
    public boolean itemUse;
    public float jmpPow;
    public float jmpSpd;
    public byte level;
    public byte levelBack;
    public short maxHp;
    public short minDmg;
    public short motion;
    public short motionCompSpd;
    public short motionNo;
    public float motionSpd;

    /* JADX INFO: renamed from: ox */
    public float f13ox;

    /* JADX INFO: renamed from: oy */
    public float f14oy;

    /* JADX INFO: renamed from: oz */
    public float f15oz;
    public byte position;
    public short power;
    public float scale;
    public float shadowHeight;
    public float shadowSize;
    public float spd;
    public byte targetBlock;
    public byte targetChar;
    public short targetFixTime;
    public short thinkAtk;
    public short thinkCur;
    public float thinkDir;
    public int thinkDmg;
    public short thinkId;
    public byte thinkIfNest;
    public short thinkRand;
    public byte type;
    public boolean use;
    public short useItemId;
    public short useItemWait;
    public short waitCnt;
    public float width;
    public int[] add_data = new int[3];

    /* JADX INFO: renamed from: ts */
    public Transform f16ts = new Transform();
    public float turn_spd = 0.0f;
    public byte[] thinkIfResult = new byte[10];
    public short[] thinkVal = new short[5];

    CharData() {
    }

    public static final void copy(CharData charData, CharData charData2) {
        charData2.drawType = charData.drawType;
        charData2.type = charData.type;
        charData2.position = charData.position;
        charData2.level = charData.level;
        charData2.charId = charData.charId;
        charData2.motionNo = charData.motionNo;
        charData2.aiId = charData.aiId;
        charData2.itableNo = charData.itableNo;
        charData2.exp = charData.exp;
        charData2.minDmg = charData.minDmg;
        charData2.actRange2 = charData.actRange2;
        charData2.width = charData.width;
        charData2.height = charData.height;
        charData2.depth = charData.depth;
        charData2.spd = charData.spd;
        charData2.jmpPow = charData.jmpPow;
        charData2.shadowHeight = charData.shadowHeight;
        charData2.scale = charData.scale;
        charData2.heightHang = charData.heightHang;
        charData2.shadowSize = charData.shadowSize;
        charData2.add_data[0] = charData.add_data[0];
        charData2.add_data[1] = charData.add_data[1];
        charData2.add_data[2] = charData.add_data[2];
        charData.f16ts.copy(charData2.f16ts);
        charData2.figure = charData.figure;
        charData2.levelBack = charData.levelBack;
        charData2.glideDir = charData.glideDir;
        charData2.assistDir = charData.assistDir;
        charData2.hitChar = charData.hitChar;
        charData2.targetChar = charData.targetChar;
        charData2.targetBlock = charData.targetBlock;
        charData2.targetFixTime = charData.targetFixTime;
        charData2.motion = charData.motion;
        charData2.image = charData.image;
        charData2.delCnt = charData.delCnt;
        charData2.aliveCnt = charData.aliveCnt;
        charData2.useItemId = charData.useItemId;
        charData2.useItemWait = charData.useItemWait;
        charData2.alpha = charData.alpha;
        charData2.alphaBack = charData.alphaBack;
        charData2.waitCnt = charData.waitCnt;
        charData2.bindFigUserId = charData.bindFigUserId;
        charData2.ctrlLength = charData.ctrlLength;
        charData2.ambient = charData.ambient;
        charData2.turn_spd = charData.turn_spd;
        charData2.frame = charData.frame;
        charData2.motionSpd = charData.motionSpd;
        charData2.jmpSpd = charData.jmpSpd;
        charData2.thinkRand = charData.thinkRand;
        charData2.attackPow = charData.attackPow;
        charData2.defense = charData.defense;
        charData2.motionCompSpd = charData.motionCompSpd;
        charData2.guardAttribute = charData.guardAttribute;
        charData2.invCnt = charData.invCnt;
        charData2.flinchCnt = charData.flinchCnt;
        charData2.flinchCntMax = charData.flinchCntMax;
        charData2.flinchTime = charData.flinchTime;
        charData2.atkCnt = charData.atkCnt;
        charData2.thinkId = charData.thinkId;
        charData2.thinkCur = charData.thinkCur;
        charData2.actId = charData.actId;
        charData2.actCur = charData.actCur;
        charData2.thinkAtk = charData.thinkAtk;
        charData2.actWait = charData.actWait;
        charData2.actTimer = charData.actTimer;
        charData2.thinkDmg = charData.thinkDmg;
        charData2.dmg = charData.dmg;
        charData2.power = charData.power;
        charData2.dmgHp = charData.dmgHp;
        charData2.dmgCnt = charData.dmgCnt;
        charData2.maxHp = charData.maxHp;
        charData2.f12hp = charData.f12hp;
        charData2.f13ox = charData.f13ox;
        charData2.f14oy = charData.f14oy;
        charData2.f15oz = charData.f15oz;
        charData2.dwnSpd = charData.dwnSpd;
        charData2.dwnDir = charData.dwnDir;
        charData2.ahX = charData.ahX;
        charData2.ahY = charData.ahY;
        charData2.ahZ = charData.ahZ;
        charData2.ahWidth = charData.ahWidth;
        charData2.ahHeight = charData.ahHeight;
        charData2.ahDepth = charData.ahDepth;
        charData2.thinkDir = charData.thinkDir;
        charData2.thinkIfNest = charData.thinkIfNest;
        charData2.thinkIfResult[0] = charData.thinkIfResult[0];
        charData2.thinkIfResult[1] = charData.thinkIfResult[1];
        charData2.thinkIfResult[2] = charData.thinkIfResult[2];
        charData2.thinkIfResult[3] = charData.thinkIfResult[3];
        charData2.thinkIfResult[4] = charData.thinkIfResult[4];
        charData2.thinkIfResult[5] = charData.thinkIfResult[5];
        charData2.thinkIfResult[6] = charData.thinkIfResult[6];
        charData2.thinkIfResult[7] = charData.thinkIfResult[7];
        charData2.thinkIfResult[8] = charData.thinkIfResult[8];
        charData2.thinkIfResult[9] = charData.thinkIfResult[9];
        charData2.thinkVal[0] = charData.thinkVal[0];
        charData2.thinkVal[1] = charData.thinkVal[1];
        charData2.thinkVal[2] = charData.thinkVal[2];
        charData2.thinkVal[3] = charData.thinkVal[3];
        charData2.thinkVal[4] = charData.thinkVal[4];
        charData2.use = charData.use;
        charData2.disp = charData.disp;
        charData2.itemUse = charData.itemUse;
        charData2.bitState = charData.bitState;
        charData2.f69x = charData.f69x;
        charData2.f70y = charData.f70y;
        charData2.f71z = charData.f71z;
        charData2.dir = charData.dir;
        charData2.angle = charData.angle;
    }

    public boolean getBitState(int i) {
        return (this.bitState & i) != 0;
    }

    public int random(int i, int i2) {
        this.thinkRand = (short) (this.thinkRand ^ (((((206743425 >> (this.thinkRand & 3)) ^ (this.thinkRand >> 4)) ^ (this.thinkRand >> 2)) ^ (this.thinkRand << 1)) ^ (this.thinkRand << 3)));
        this.thinkRand = (short) (this.thinkRand + 1);
        if (this.thinkRand < 0) {
            this.thinkRand = (short) (-this.thinkRand);
        }
        return (this.thinkRand % ((i2 - i) + 1)) + i;
    }

    public void setBitState(int i, boolean z) {
        if (z) {
            this.bitState |= i;
        } else {
            this.bitState &= i ^ (-1);
        }
    }
}
