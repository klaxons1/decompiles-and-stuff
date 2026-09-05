package p000;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class BugBlock extends VipObject {
    public int alpha;
    public boolean clush_flg;
    public byte clush_flg_temp;
    public short followChar;
    public byte gravity;
    public byte group;

    /* JADX INFO: renamed from: hp */
    public byte f9hp;
    public byte hpMax;
    public short lastPoint;
    public byte moveDir;
    public float moveDis;
    public short moveFrm;
    public short moveTime;
    public byte nextRoot;
    public byte nextSpd;
    public short offsetLen;
    public float offsetX;
    public float offsetY;
    public float offsetZ;
    public byte option;
    public byte root;
    public float sizeX;
    public float sizeY;
    public float sizeZ;
    public byte spd;
    public byte state;
    public short stopTime;
    public byte timer;
    public byte type;
    public byte view;

    public BugBlock() {
        clear();
    }

    public static void copyBlock(BugBlock bugBlock, BugBlock bugBlock2) {
        bugBlock2.f69x = bugBlock.f69x;
        bugBlock2.f70y = bugBlock.f70y;
        bugBlock2.f71z = bugBlock.f71z;
        bugBlock2.dir = bugBlock.dir;
        bugBlock2.view = bugBlock.view;
        bugBlock2.state = bugBlock.state;
        bugBlock2.sizeX = bugBlock.sizeX;
        bugBlock2.sizeY = bugBlock.sizeY;
        bugBlock2.sizeZ = bugBlock.sizeZ;
        bugBlock2.f9hp = bugBlock.f9hp;
        bugBlock2.hpMax = bugBlock.hpMax;
        bugBlock2.timer = bugBlock.timer;
        bugBlock2.type = bugBlock.type;
        bugBlock2.option = bugBlock.option;
        bugBlock2.group = bugBlock.group;
        bugBlock2.gravity = bugBlock.gravity;
        bugBlock2.root = bugBlock.root;
        bugBlock2.spd = bugBlock.spd;
        bugBlock2.moveTime = bugBlock.moveTime;
        bugBlock2.nextRoot = bugBlock.nextRoot;
        bugBlock2.nextSpd = bugBlock.nextSpd;
        bugBlock2.offsetX = bugBlock.offsetX;
        bugBlock2.offsetY = bugBlock.offsetY;
        bugBlock2.offsetZ = bugBlock.offsetZ;
        bugBlock2.offsetLen = bugBlock.offsetLen;
    }

    public void clear() {
        this.type = (byte) -1;
        this.f71z = 0.0f;
        this.f70y = 0.0f;
        this.f69x = 0.0f;
        this.gravity = (byte) 3;
        this.root = (byte) -1;
        this.nextRoot = (byte) -1;
        this.nextSpd = (byte) 0;
        this.moveFrm = (short) 0;
        this.view = (byte) 0;
        this.state = (byte) 0;
        this.timer = (byte) 0;
        this.option = (byte) 0;
        this.offsetZ = 0.0f;
        this.offsetY = 0.0f;
        this.offsetX = 0.0f;
        this.offsetLen = (short) 0;
        this.followChar = (short) -1;
        this.f9hp = (byte) 0;
        this.hpMax = (byte) 0;
        this.group = (byte) 0;
        this.spd = (byte) 0;
        this.moveTime = (short) 0;
        this.stopTime = (short) 0;
        this.lastPoint = (short) 0;
        this.moveDir = (byte) 0;
        this.moveFrm = (short) 0;
        this.moveDis = 0.0f;
        this.clush_flg = false;
        this.clush_flg_temp = (byte) 0;
    }

    public void set(byte b, float f, float f2, float f3, byte b2, float f4, float f5, float f6, byte b3, byte b4, byte b5, byte b6) {
        this.state = (byte) 2;
        this.view = b;
        this.f69x = f;
        this.f70y = f2;
        this.f71z = f3;
        this.dir = b2;
        this.sizeX = f4;
        this.sizeY = f5;
        this.sizeZ = f6;
        this.type = b3;
        this.hpMax = b4;
        this.f9hp = b4;
        this.option = b5;
        this.gravity = b6;
        if (this.gravity != 0) {
            this.gravity = (byte) (this.gravity | 2);
        }
        this.root = (byte) -1;
        this.nextRoot = (byte) -1;
        this.nextSpd = (byte) 0;
        this.moveFrm = (short) 0;
    }
}
