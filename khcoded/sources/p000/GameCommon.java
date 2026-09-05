package p000;

import android.R;
import com.docomostar.StarApplication;
import com.docomostar.opt.system.PhoneSystem2;
import com.docomostar.opt.ui.Graphics2;
import com.docomostar.system.PhoneSystem;
import com.docomostar.ui.Canvas;
import com.docomostar.ui.Dialog;
import com.docomostar.ui.Graphics;
import com.docomostar.ui.ogl.GraphicsOGL;
import com.jcraft.jzlib.ZInputStream;
import com.mascotcapsule.eruption.docomostar.ActionTable;
import com.mascotcapsule.eruption.docomostar.Appearance;
import com.mascotcapsule.eruption.docomostar.Figure;
import com.mascotcapsule.eruption.docomostar.Graphics3D;
import com.mascotcapsule.eruption.docomostar.Loader;
import com.mascotcapsule.eruption.docomostar.Object3D;
import com.mascotcapsule.eruption.docomostar.Texture;
import com.mascotcapsule.eruption.docomostar.TextureTable;
import com.mascotcapsule.eruption.docomostar.VertexBuffer;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class GameCommon extends Canvas {
    public static final byte DS_AI_VIEW = 18;
    public static final byte DS_ATK_VIEW = 17;
    public static final byte DS_CAMERA_ANGLE = 5;
    public static final byte DS_COLLI_VIEW = 3;
    public static final byte DS_CRITICAL = 21;
    public static final byte DS_DMG_VIEW = 23;
    public static final byte DS_DTIME_FIX = 27;
    public static final byte DS_EVEFLG_VIEW = 24;
    public static final byte DS_EVENT_DBG = 8;
    public static final byte DS_EVENT_EXE_ID = 33;
    public static final byte DS_EVENT_FRAME = 6;
    public static final byte DS_EVENT_GO_FRAME = 10;
    public static final byte DS_EVENT_GO_LINE = 11;
    public static final byte DS_EVENT_G_FLG = 30;
    public static final byte DS_EVENT_LINE = 7;
    public static final byte DS_EVENT_LINE_VIEW = 13;
    public static final byte DS_EVENT_MAP_NO = 12;
    public static final byte DS_EVENT_RESET = 9;
    public static final byte DS_EVENT_VIEW = 19;
    public static final byte DS_LOG_LV = 20;
    public static final byte DS_MAPOBJ_ID = 26;
    public static final byte DS_MAP_ANIM = 34;
    public static final byte DS_MAX = 35;
    public static final byte DS_MODE = 0;
    public static final byte DS_MODE_CAMERA = 2;
    public static final byte DS_MODE_CHAR = 3;
    public static final byte DS_MODE_DEBUG = 31;
    public static final byte DS_MODE_EVENT = 5;
    public static final byte DS_MODE_INFO = 1;
    public static final byte DS_MODE_MAP = 4;
    public static final byte DS_MODE_MAX = 7;
    public static final byte DS_MODE_NONE = 0;
    public static final byte DS_MODE_OTHER = 6;
    public static final byte DS_MOTION = 29;
    public static final byte DS_MOTION_VIEW = 28;
    public static final byte DS_ON_OFF = 1;
    public static final byte DS_REC = 15;
    public static final byte DS_REC_EXE = 0;
    public static final byte DS_REC_MAX = 3;
    public static final byte DS_REC_SEED = 2;
    public static final byte DS_REC_TIME = 1;
    public static final byte DS_SELECT = 4;
    public static final byte DS_SNAP = 14;
    public static final byte DS_SORA_DG = 32;
    public static final byte DS_SORA_HP = 22;
    public static final byte DS_SORA_LEVEL = 25;
    public static final byte DS_TARGET_CHAR = 2;
    public static final byte DS_TEST_FLG = 16;
    public static int KEY_PUSH_BIT = 0;
    public static int KEY_STATE_BIT = 0;
    private static int KEY_STATE_BIT_BACK = 0;
    public static final int K_0 = 7;
    public static final int K_1 = 8;
    public static final int K_2 = 9;
    public static final int K_3 = 10;
    public static final int K_4 = 11;
    public static final int K_5 = 12;
    public static final int K_6 = 13;
    public static final int K_7 = 14;
    public static final int K_8 = 15;
    public static final int K_9 = 16;
    public static final int K_A = 17;
    public static final int K_ANY = 16777215;
    public static final int K_DIR = 25;
    public static final int K_DIR_BACK = 26;
    public static final int K_DIR_DOUBLE = 24;
    public static final int K_DOWN = 2;
    public static final int K_IAPP = 23;
    public static final int K_LEFT = 1;
    public static final int K_MAX = 27;
    public static final int K_RIGHT = 3;
    public static final int K_ROLL_L = 20;
    public static final int K_ROLL_R = 19;
    public static final int K_S = 18;
    public static final int K_SELECT = 4;
    public static final int K_SOFT1 = 5;
    public static final int K_SOFT2 = 6;
    public static final int K_SOFT3 = 21;
    public static final int K_SOFT4 = 22;
    public static final int K_UP = 0;
    private static int LAST_DIR_KEY = 0;
    public static final byte SOFT_MENU_BACK = 6;
    public static final byte SOFT_MENU_CLOSE = 2;
    public static final byte SOFT_MENU_COMMAND = 7;
    public static final byte SOFT_MENU_CONFIG = 8;
    public static final byte SOFT_MENU_END = 5;
    public static final byte SOFT_MENU_HELP = 9;
    public static final byte SOFT_MENU_MAX = 10;
    public static final byte SOFT_MENU_MENU = 1;
    public static final byte SOFT_MENU_NULL = 0;
    public static final byte SOFT_MENU_SKIP = 3;
    public static final byte SOFT_MENU_STOP = 4;
    private static String[] SOFT_MENU_STR;

    /* JADX INFO: renamed from: g */
    public static Graphics f54g;

    /* JADX INFO: renamed from: g2 */
    public static Graphics2 f55g2;

    /* JADX INFO: renamed from: g3 */
    public static Graphics3D f56g3;
    public static GraphicsOGL ogl;
    public static int[] DEBUG_STATUS = new int[35];

    /* JADX INFO: renamed from: com, reason: collision with root package name */
    private static final GameCommon f1057com = new GameCommon();
    public static int ANY_KEY_MASK = 15204351;
    public static int CONF_ATTACK_KEY_MASK = 128;
    public static int CONF_JUMP_KEY_MASK = 131072;
    public static int CONF_SELECT_MASK = 144;
    public static int CONF_AVOID_KEY_MASK = 16793600;
    public static int CONF_GUARD_KEY_MASK = 32768;
    public static int CONF_MENU_SYSTEM_KEY = 5;
    public static int CONF_MENU_COMMAND_KEY = 6;
    public static int CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
    public static int CONF_VOLUME_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
    public static int CONF_SYSTEM_BACK_MASK = 131072 | CONF_MENU_KEY_MASK;
    public static int CONF_KEY_UP = 17;
    public static int CONF_KEY_RIGHT = 18;
    public static int CONF_KEY_DOWN = 19;
    public static int CONF_KEY_LEFT = 16;
    public static int[] KEY_STATE = new int[27];
    private static long KEY_DIR_TIME = 0;
    private static long[] UD_KEY_TIME = new long[2];
    private static boolean[] UD_KEY_FLG = new boolean[2];
    public static int[] SOFT_MENU = new int[2];
    private static String[] softLabelStr = new String[2];
    private static final String[] volstr = {"♪×", "♪>", "♪>>", "♪>>>"};
    public static boolean SoftKeyUndrawFlg = false;
    public static long sleepTime = 0;
    public static long sleepTimeDebug = 0;
    private static int loadCount = 0;
    private static int[] loadingSize = new int[3];
    private static int[] loadingSizeMax = new int[3];
    private static int[] loadingSizeMode = new int[3];
    public static boolean now3DState = false;
    private static float[] _GCCxz = new float[2];

    private GameCommon() {
        SOFT_MENU_STR = new String[10];
        SOFT_MENU_STR[0] = null;
        SOFT_MENU_STR[1] = " ﾒﾆｭｰ";
        SOFT_MENU_STR[2] = "閉じる";
        SOFT_MENU_STR[3] = " ｽｷｯﾌﾟ";
        SOFT_MENU_STR[4] = " 中断";
        SOFT_MENU_STR[5] = " 終了";
        SOFT_MENU_STR[6] = " 戻る";
        SOFT_MENU_STR[7] = " ｺﾏﾝﾄﾞ";
        SOFT_MENU_STR[8] = "ｺﾝﾌｨｸﾞ";
        SOFT_MENU_STR[9] = " ﾍﾙﾌﾟ";
        f54g = getGraphics();
        f55g2 = f54g;
        ogl = f54g;
        DEBUG_STATUS[28] = -1;
    }

    public static float GetCharCollision(int i) {
        return GetCharCollision(i, true);
    }

    public static float GetCharCollision(int i, boolean z) {
        if (!Character.charData[i].getBitState(4194304)) {
            return MapData.getAreaCollision(Character.charData[i].f69x, Character.charData[i].f70y, Character.charData[i].f71z, Math.max(Character.charData[i].width, Character.charData[i].depth), Character.charData[i].height, z);
        }
        float[] fArrRelativeChange = Attack.relativeChange(Character.charData[i].dir, Character.charData[i].ahX, Character.charData[i].ahZ, 0, false);
        fArrRelativeChange[0] = fArrRelativeChange[0] + Character.charData[i].f69x;
        fArrRelativeChange[1] = fArrRelativeChange[1] + Character.charData[i].f71z;
        return MapData.getAreaCollision(fArrRelativeChange[0], Character.charData[i].f70y, fArrRelativeChange[1], Math.max(Character.charData[i].ahWidth, Character.charData[i].ahDepth), Character.charData[i].ahHeight, z);
    }

    private static Object3D LoadObject3D(ZInputStream zInputStream, int i) {
        Object3D[] object3DArrLoad = null;
        try {
            byte[] bArr = zInputStream.read(0, Util.readInt(zInputStream));
            if (bArr != null) {
                object3DArrLoad = Loader.load(DirectBufferManager.getBuffer(), bArr, i);
            }
        } catch (Exception e) {
            if (!StrageDeviceAccess.sdCardAccessCheck()) {
                criticalError();
            }
        }
        return object3DArrLoad[0];
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[Catch: Exception -> 0x0131, TRY_LEAVE, TryCatch #8 {Exception -> 0x0131, blocks: (B:41:0x00e3, B:43:0x00e8), top: B:84:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff A[Catch: Exception -> 0x0127, TRY_LEAVE, TryCatch #5 {Exception -> 0x0127, blocks: (B:50:0x00fa, B:52:0x00ff), top: B:82:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0112 A[Catch: Exception -> 0x0119, TRY_LEAVE, TryCatch #2 {Exception -> 0x0119, blocks: (B:57:0x010d, B:59:0x0112), top: B:80:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static ErpObject ReadObject3DZip(String str, int i, boolean z) {
        Throwable th;
        ZInputStream zInputStream;
        InputStream inputStreamStrageInputStream;
        ZInputStream zInputStream2;
        InputStream inputStream;
        System.gc();
        try {
            inputStreamStrageInputStream = StrageDeviceAccess.strageInputStream(str);
            try {
                zInputStream = new ZInputStream(inputStreamStrageInputStream);
                try {
                    zInputStream.setBufferSize(65536);
                    ErpObject erpObject = new ErpObject();
                    erpObject.model = new ErpModel[zInputStream.read()];
                    erpObject.tex = new TextureTable[zInputStream.read()];
                    for (int i2 = 0; i2 < erpObject.model.length; i2++) {
                        erpObject.model[i2] = new ErpModel();
                    }
                    for (int i3 = 0; i3 < erpObject.tex.length; i3++) {
                        erpObject.tex[i3] = (TextureTable) LoadObject3D(zInputStream, i);
                    }
                    for (int i4 = 0; i4 < erpObject.model.length; i4++) {
                        if (zInputStream.read() > 0) {
                            erpObject.model[i4].act = (ActionTable) LoadObject3D(zInputStream, i);
                        }
                        if (zInputStream.read() > 0) {
                            erpObject.model[i4].figure = (Figure) LoadObject3D(zInputStream, i);
                            Util.deleteFigureLight(erpObject.model[i4].figure);
                        }
                    }
                    for (int i5 = 0; i5 < erpObject.model.length; i5++) {
                        if (erpObject.model[i5].figure != null) {
                            for (int i6 = 0; i6 < erpObject.tex.length; i6++) {
                                erpObject.model[i5].figure.bindTexture(erpObject.tex[i6]);
                            }
                            if (erpObject.model[i5].act != null) {
                                erpObject.model[i5].figure.bindAction(erpObject.model[i5].act);
                            }
                            erpObject.model[i5].figure.setCamera(null);
                            if (z) {
                                f56g3.createBufferObject(DirectBufferManager.getBuffer(), ogl, erpObject.model[i5].figure);
                            }
                        }
                    }
                    if (zInputStream != null) {
                        try {
                            zInputStream.close();
                            if (inputStreamStrageInputStream != null) {
                                inputStreamStrageInputStream.close();
                            }
                        } catch (Exception e) {
                        }
                    } else if (inputStreamStrageInputStream != null) {
                        inputStreamStrageInputStream.close();
                    }
                    StrageDeviceAccess.StrageStreamClose();
                    return erpObject;
                } catch (Throwable th2) {
                    zInputStream2 = zInputStream;
                    inputStream = inputStreamStrageInputStream;
                    try {
                        Game.memoryPrint("LOAD MAP ERROR");
                        if (zInputStream2 != null) {
                            try {
                                zInputStream2.close();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Exception e2) {
                                StrageDeviceAccess.StrageStreamClose();
                                return null;
                            }
                        } else if (inputStream != null) {
                            inputStream.close();
                        }
                        StrageDeviceAccess.StrageStreamClose();
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        zInputStream = zInputStream2;
                        inputStreamStrageInputStream = inputStream;
                        if (zInputStream != null) {
                            zInputStream.close();
                            if (inputStreamStrageInputStream != null) {
                                inputStreamStrageInputStream.close();
                            }
                        } else if (inputStreamStrageInputStream != null) {
                            inputStreamStrageInputStream.close();
                        }
                        StrageDeviceAccess.StrageStreamClose();
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                zInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            zInputStream = null;
            inputStreamStrageInputStream = null;
        }
    }

    public static ErpObject ReadObject3DZipStream(ZInputStream zInputStream, int i, boolean z) {
        System.gc();
        try {
            ErpObject erpObject = new ErpObject();
            erpObject.model = new ErpModel[zInputStream.read()];
            erpObject.tex = new TextureTable[zInputStream.read()];
            for (int i2 = 0; i2 < erpObject.model.length; i2++) {
                erpObject.model[i2] = new ErpModel();
            }
            for (int i3 = 0; i3 < erpObject.tex.length; i3++) {
                erpObject.tex[i3] = (TextureTable) LoadObject3D(zInputStream, i);
            }
            for (int i4 = 0; i4 < erpObject.model.length; i4++) {
                if (zInputStream.read() > 0) {
                    erpObject.model[i4].act = (ActionTable) LoadObject3D(zInputStream, i);
                }
                if (zInputStream.read() > 0) {
                    erpObject.model[i4].figure = (Figure) LoadObject3D(zInputStream, i);
                    Util.deleteFigureLight(erpObject.model[i4].figure);
                }
            }
            for (int i5 = 0; i5 < erpObject.model.length; i5++) {
                if (erpObject.model[i5].figure != null) {
                    for (int i6 = 0; i6 < erpObject.tex.length; i6++) {
                        erpObject.model[i5].figure.bindTexture(erpObject.tex[i6]);
                    }
                    if (erpObject.model[i5].act != null) {
                        erpObject.model[i5].figure.bindAction(erpObject.model[i5].act);
                    }
                    erpObject.model[i5].figure.setCamera(null);
                    if (z) {
                        f56g3.createBufferObject(DirectBufferManager.getBuffer(), ogl, erpObject.model[i5].figure);
                    }
                }
            }
            return erpObject;
        } catch (Exception e) {
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    public static void SOFT_MENU_RSET() {
        softLabelStr[0] = SOFT_MENU_STR[SOFT_MENU[0]];
        softLabelStr[1] = SOFT_MENU_STR[SOFT_MENU[1]];
    }

    public static void SOFT_MENU_SET(int i, int i2) {
        if (SOFT_MENU[0] == i && SOFT_MENU[1] == i2) {
            return;
        }
        SOFT_MENU[0] = i;
        SOFT_MENU[1] = i2;
        SOFT_MENU_RSET();
    }

    public static void begin3D() {
        now3DState = true;
        ogl.beginDrawing();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    public static int checkDirKey8() {
        int i = 2;
        int i2 = (KEY_STATE_BIT >> 25) & 7;
        if (i2 != 0 || LAST_DIR_KEY == 0 || ((KEY_STATE_BIT_BACK >> 25) & 7) != 0) {
            i = -1;
        } else if (LAST_DIR_KEY == 0) {
            i = 0;
        } else if (LAST_DIR_KEY != 1) {
            if (LAST_DIR_KEY == 2) {
                i = 4;
            } else if (LAST_DIR_KEY == 3) {
                i = 6;
            } else {
                i = -1;
            }
        }
        LAST_DIR_KEY = 0;
        if (i2 <= 0) {
            return i;
        }
        int i3 = i2 - 1;
        int i4 = i3 << 1;
        if (getKeyStateBit((i3 + 1) & 3)) {
            return (i4 + 1) & 7;
        }
        return getKeyStateBit((i3 + 3) & 3) ? (i4 + 7) & 7 : i4;
    }

    public static void confirmTerminate() {
        Dialog dialog = new Dialog(3, "確認ダイアログ");
        dialog.setText("アプリを終了しますか？");
        if (dialogShow(dialog) == 4) {
            GameStatus.save(0);
            terminate();
        }
    }

    public static void criticalError() {
        Dialog dialog = new Dialog(2, "エラーが発生しました");
        dialog.setText("予期しないエラーが発生しました\nアプリを終了します。");
        dialogShow(dialog);
        terminate();
    }

    public static int dialogShow(Dialog dialog) {
        if (now3DState) {
            ogl.endDrawing();
        }
        int iShow = dialog.show();
        if (now3DState) {
            ogl.beginDrawing();
        }
        return iShow;
    }

    public static boolean dialogWindow(boolean z, int i, boolean z2) {
        String[] strArr = {"", ""};
        if (now3DState) {
            end3D();
        }
        f54g.unlock(true);
        f54g.lock();
        if (softLabelStr[0] != null) {
            strArr[0] = softLabelStr[0];
            softLabelStr[0] = "";
        }
        if (softLabelStr[1] != null) {
            strArr[1] = softLabelStr[1];
            softLabelStr[1] = "";
        }
        f54g.setColor(Graphics.getColorOfRGB(32, 50, 64));
        f54g.fillRect(100, 100, 654, 280);
        for (int i2 = 0; i2 < 5; i2++) {
            f54g.setColor(Graphics.getColorOfRGB(255 / (1 << i2), 255 / (1 << i2), 255 / (1 << i2)));
            f54g.drawRect(i2 + 100, i2 + 100, 654 - (i2 << 1), 280 - (i2 << 1));
        }
        if (z) {
            Draw2D.drawString("はい", 300, 360, 30, i == 0 ? 16777215 : 8421504, 0, 0, 0);
            Draw2D.drawString("いいえ", 460, 360, 30, i == 1 ? 16777215 : 8421504, 0, 0, 0);
        } else {
            Draw2D.drawString("決定キーを押すと継続します", 240, 360, 30, K_ANY, 0, 0, 0);
        }
        Draw2D.flush();
        f54g.unlock(true);
        while (true) {
            refreshKey();
            Draw2D.flush();
            if (!z || (!getKeyPushBit(1) && !getKeyPushBit(3))) {
                if (getKeyPushMask(CONF_SELECT_MASK)) {
                    break;
                }
            } else {
                Sound.play_se(0, 1, 3);
                resetAllKey();
                i ^= 1;
                Draw2D.drawString("はい", 300, 360, 30, i == 0 ? 16777215 : 8421504, 0, 0, 0);
                Draw2D.drawString("いいえ", 460, 360, 30, i == 1 ? 16777215 : 8421504, 0, 0, 0);
                f54g.lock();
                Draw2D.flush();
                f54g.unlock(true);
            }
            syncCommon(1);
        }
        Sound.play_se(0, 1, 5);
        resetAllKey();
        if (z2) {
            f54g.lock();
            Draw2D.flush();
            f54g.clearRect(0, 0, 854, 480);
            f54g.unlock(true);
        }
        if (softLabelStr[0] != null) {
            softLabelStr[0] = strArr[0];
        }
        if (softLabelStr[1] != null) {
            softLabelStr[1] = strArr[1];
        }
        return i == 0;
    }

    public static void drawSoftKey() {
        if (SoftKeyUndrawFlg) {
            return;
        }
        if (softLabelStr[1] != null) {
            f54g.setColor(Graphics.getColorOfRGB(80, 80, 80));
            f54g.fillRect(0, 439, 55, 2);
            f54g.setColor(Graphics.getColorOfRGB(48, 48, 48));
            f54g.fillRect(0, 441, 55, 16);
            f54g.setColor(Graphics.getColorOfRGB(16, 16, 16));
            f54g.fillRect(0, 457, 55, 2);
            f54g.setColor(Graphics.getColorOfRGB(255, 255, 255));
            Draw2D.setFont(16);
            f54g.drawString(softLabelStr[1], 4, Draw2D.nowFontAsc + 457);
        }
        if (softLabelStr[0] != null) {
            f54g.setColor(Graphics.getColorOfRGB(80, 80, 80));
            f54g.fillRect(0, 460, 55, 2);
            f54g.setColor(Graphics.getColorOfRGB(48, 48, 48));
            f54g.fillRect(0, 462, 55, 16);
            f54g.setColor(Graphics.getColorOfRGB(16, 16, 16));
            f54g.fillRect(0, 478, 55, 2);
            f54g.setColor(Graphics.getColorOfRGB(255, 255, 255));
            Draw2D.setFont(16);
            f54g.drawString(softLabelStr[0], 4, Draw2D.nowFontAsc + 478);
        }
        if (GameStatus.GAME.volumeView) {
            f54g.setColor(Graphics.getColorOfRGB(80, 80, 80));
            f54g.fillRect(799, 460, 55, 2);
            f54g.setColor(Graphics.getColorOfRGB(48, 48, 48));
            f54g.fillRect(799, 462, 55, 16);
            f54g.setColor(Graphics.getColorOfRGB(16, 16, 16));
            f54g.fillRect(799, 478, 55, 2);
            f54g.setColor(Graphics.getColorOfRGB(255, 255, 255));
            Draw2D.setFont(16);
            f54g.drawString(volstr[GameStatus.systemData[2]], 803, Draw2D.nowFontAsc + 478);
        }
    }

    public static void end3D() {
        now3DState = false;
        ogl.endDrawing();
    }

    public static GameCommon getInstance() {
        return f1057com;
    }

    public static boolean getKeyPushBit(int i) {
        return (KEY_PUSH_BIT & (1 << i)) != 0;
    }

    public static boolean getKeyPushDownKey() {
        return (KEY_PUSH_BIT & 524292) != 0 || UD_KEY_FLG[1];
    }

    public static boolean getKeyPushMask(int i) {
        return (KEY_PUSH_BIT & i) != 0;
    }

    public static boolean getKeyPushUpKey() {
        return (KEY_PUSH_BIT & 1048577) != 0 || UD_KEY_FLG[0];
    }

    public static boolean getKeyStateBit(int i) {
        return (KEY_STATE_BIT & (1 << i)) != 0;
    }

    public static boolean getKeyStateMask(int i) {
        return (KEY_STATE_BIT & i) != 0;
    }

    public static Figure getObjectFigure(ErpObject erpObject, int i) {
        return erpObject.model[i].figure;
    }

    public static float getObjectMaxFrame(ErpObject erpObject, int i) {
        if (erpObject.model[i].act != null) {
            return erpObject.model[i].act.getMaxFrame();
        }
        return 0.0f;
    }

    public static Texture getObjectTexture(ErpObject erpObject, int i) {
        for (int i2 = 0; i2 < erpObject.tex.length; i2++) {
            Texture textureFindTexture = erpObject.tex[i2].findTexture(i);
            if (textureFindTexture != null) {
                return textureFindTexture;
            }
        }
        return null;
    }

    public static Texture getObjectTexture(TextureTable textureTable) {
        return textureTable.findTexture(((Texture) textureTable.findObject3D(10, -1)).getGid());
    }

    public static void infoTarminate() {
        Dialog dialog = new Dialog(0, "アプリ終了");
        dialog.setText("アプリを終了します。");
        dialogShow(dialog);
        terminate();
    }

    public static void initKeyStyle() {
        if (Game.DISPLAY_STYLE == 12) {
            CONF_KEY_UP = 17;
            CONF_KEY_RIGHT = 18;
            CONF_KEY_DOWN = 19;
            CONF_KEY_LEFT = 16;
            if (GameStatus.systemData[3] == 0) {
                CONF_VOLUME_KEY_MASK = 4096;
                CONF_MENU_COMMAND_KEY = 5;
                CONF_MENU_SYSTEM_KEY = 6;
                CONF_ATTACK_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
                CONF_JUMP_KEY_MASK = 4096;
                CONF_SELECT_MASK = 2064;
                CONF_AVOID_KEY_MASK = 16809984;
                CONF_GUARD_KEY_MASK = 16384;
            } else if (GameStatus.systemData[3] == 1) {
                CONF_VOLUME_KEY_MASK = 4096;
                CONF_MENU_COMMAND_KEY = 5;
                CONF_MENU_SYSTEM_KEY = 6;
                CONF_ATTACK_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
                CONF_JUMP_KEY_MASK = 16384;
                CONF_SELECT_MASK = 2064;
                CONF_AVOID_KEY_MASK = 16809984;
                CONF_GUARD_KEY_MASK = 4096;
            } else if (GameStatus.systemData[3] == 2) {
                CONF_VOLUME_KEY_MASK = 4096;
                CONF_MENU_COMMAND_KEY = 5;
                CONF_MENU_SYSTEM_KEY = 6;
                CONF_ATTACK_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
                CONF_JUMP_KEY_MASK = 4096;
                CONF_SELECT_MASK = 2064;
                CONF_AVOID_KEY_MASK = 16793600;
                CONF_GUARD_KEY_MASK = 32768;
            } else if (GameStatus.systemData[3] == 3) {
                CONF_VOLUME_KEY_MASK = 4096;
                CONF_MENU_COMMAND_KEY = 5;
                CONF_MENU_SYSTEM_KEY = 6;
                CONF_ATTACK_KEY_MASK = 131072;
                CONF_JUMP_KEY_MASK = 262144;
                CONF_SELECT_MASK = 131088;
                CONF_AVOID_KEY_MASK = 16781312;
                CONF_GUARD_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
            } else if (GameStatus.systemData[3] == 4) {
                CONF_VOLUME_KEY_MASK = 4194304;
                CONF_MENU_COMMAND_KEY = 21;
                CONF_MENU_SYSTEM_KEY = 22;
                CONF_ATTACK_KEY_MASK = 262144;
                CONF_JUMP_KEY_MASK = Appearance.LIGHTTWOSIDE;
                CONF_SELECT_MASK = 262160;
                CONF_AVOID_KEY_MASK = 16793600;
                CONF_GUARD_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
            } else if (GameStatus.systemData[3] == 5) {
                CONF_VOLUME_KEY_MASK = 4194304;
                CONF_MENU_COMMAND_KEY = 21;
                CONF_MENU_SYSTEM_KEY = 22;
                CONF_ATTACK_KEY_MASK = 131072;
                CONF_JUMP_KEY_MASK = 262144;
                CONF_SELECT_MASK = 131088;
                CONF_AVOID_KEY_MASK = 16793600;
                CONF_GUARD_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
            }
            CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
            CONF_SYSTEM_BACK_MASK = CONF_JUMP_KEY_MASK | CONF_MENU_KEY_MASK;
            return;
        }
        if (Game.DISPLAY_STYLE == 3) {
            CONF_KEY_UP = 16;
            CONF_KEY_RIGHT = 17;
            CONF_KEY_DOWN = 18;
            CONF_KEY_LEFT = 19;
            CONF_VOLUME_KEY_MASK = VertexBuffer.TEXTURECOORDF_1;
            CONF_MENU_SYSTEM_KEY = 22;
            CONF_MENU_COMMAND_KEY = 21;
            if (GameStatus.systemData[3] == 0) {
                CONF_ATTACK_KEY_MASK = 128;
                CONF_JUMP_KEY_MASK = 262144;
                CONF_SELECT_MASK = 144;
                CONF_AVOID_KEY_MASK = R.attr.theme;
                CONF_GUARD_KEY_MASK = 32768;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
                return;
            }
            if (GameStatus.systemData[3] == 1) {
                CONF_ATTACK_KEY_MASK = 128;
                CONF_JUMP_KEY_MASK = 32768;
                CONF_SELECT_MASK = 144;
                CONF_AVOID_KEY_MASK = R.attr.theme;
                CONF_GUARD_KEY_MASK = 262144;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
                return;
            }
            if (GameStatus.systemData[3] == 2) {
                CONF_ATTACK_KEY_MASK = 128;
                CONF_JUMP_KEY_MASK = 262144;
                CONF_SELECT_MASK = 144;
                CONF_AVOID_KEY_MASK = 16809984;
                CONF_GUARD_KEY_MASK = 65536;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
                return;
            }
            if (GameStatus.systemData[3] == 3) {
                CONF_ATTACK_KEY_MASK = 16;
                CONF_JUMP_KEY_MASK = 8388608;
                CONF_SELECT_MASK = 16;
                CONF_AVOID_KEY_MASK = VertexBuffer.SPRITE_PER_OBJ;
                CONF_GUARD_KEY_MASK = 64;
                CONF_VOLUME_KEY_MASK = 1024;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
                return;
            }
            if (GameStatus.systemData[3] == 4) {
                CONF_ATTACK_KEY_MASK = 32768;
                CONF_JUMP_KEY_MASK = 65536;
                CONF_SELECT_MASK = 32784;
                CONF_AVOID_KEY_MASK = 16785408;
                CONF_GUARD_KEY_MASK = 4096;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = 65536 | CONF_MENU_KEY_MASK;
                return;
            }
            if (GameStatus.systemData[3] == 5) {
                CONF_MENU_COMMAND_KEY = 12;
                CONF_MENU_SYSTEM_KEY = 13;
                CONF_ATTACK_KEY_MASK = 128;
                CONF_JUMP_KEY_MASK = 262144;
                CONF_SELECT_MASK = 144;
                CONF_AVOID_KEY_MASK = R.attr.theme;
                CONF_GUARD_KEY_MASK = 32768;
                CONF_VOLUME_KEY_MASK = 1024;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
                return;
            }
            return;
        }
        if (Game.DISPLAY_STYLE < 10) {
            CONF_KEY_UP = 18;
            CONF_KEY_RIGHT = 19;
            CONF_KEY_DOWN = 16;
            CONF_KEY_LEFT = 17;
            CONF_VOLUME_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
            CONF_MENU_COMMAND_KEY = 6;
            CONF_MENU_SYSTEM_KEY = 5;
            if (GameStatus.systemData[3] == 0) {
                CONF_ATTACK_KEY_MASK = 128;
                CONF_JUMP_KEY_MASK = 131072;
                CONF_SELECT_MASK = 144;
                CONF_AVOID_KEY_MASK = 16793600;
                CONF_GUARD_KEY_MASK = 32768;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 131072;
                return;
            }
            if (GameStatus.systemData[3] == 1) {
                CONF_ATTACK_KEY_MASK = 128;
                CONF_JUMP_KEY_MASK = 32768;
                CONF_SELECT_MASK = 144;
                CONF_AVOID_KEY_MASK = 16793600;
                CONF_GUARD_KEY_MASK = 131072;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 131072;
                return;
            }
            if (GameStatus.systemData[3] == 2) {
                CONF_ATTACK_KEY_MASK = 128;
                CONF_JUMP_KEY_MASK = 131072;
                CONF_SELECT_MASK = 144;
                CONF_AVOID_KEY_MASK = 16809984;
                CONF_GUARD_KEY_MASK = 16384;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 131072;
                return;
            }
            if (GameStatus.systemData[3] == 3) {
                CONF_ATTACK_KEY_MASK = 16;
                CONF_JUMP_KEY_MASK = 8388608;
                CONF_SELECT_MASK = 16;
                CONF_AVOID_KEY_MASK = VertexBuffer.SPRITE_PER_OBJ;
                CONF_GUARD_KEY_MASK = VertexBuffer.TEXTURECOORDF_1;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 131072;
                return;
            }
            if (GameStatus.systemData[3] == 4) {
                CONF_ATTACK_KEY_MASK = 32768;
                CONF_JUMP_KEY_MASK = 16384;
                CONF_SELECT_MASK = 32784;
                CONF_AVOID_KEY_MASK = 16779264;
                CONF_GUARD_KEY_MASK = 4096;
                CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
                CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 16384;
                return;
            }
            CONF_MENU_COMMAND_KEY = 12;
            CONF_MENU_SYSTEM_KEY = 11;
            CONF_ATTACK_KEY_MASK = 128;
            CONF_JUMP_KEY_MASK = 131072;
            CONF_SELECT_MASK = 144;
            CONF_AVOID_KEY_MASK = 16793600;
            CONF_GUARD_KEY_MASK = 32768;
            CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
            CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 131072;
            return;
        }
        CONF_KEY_UP = 17;
        CONF_KEY_RIGHT = 18;
        CONF_KEY_DOWN = 19;
        CONF_KEY_LEFT = 16;
        CONF_VOLUME_KEY_MASK = 4194304;
        CONF_MENU_SYSTEM_KEY = 21;
        CONF_MENU_COMMAND_KEY = 5;
        if (GameStatus.systemData[3] == 0) {
            CONF_ATTACK_KEY_MASK = 65536;
            CONF_JUMP_KEY_MASK = 262144;
            CONF_SELECT_MASK = 65552;
            CONF_AVOID_KEY_MASK = 16777344;
            CONF_GUARD_KEY_MASK = 32768;
            CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
            CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
            return;
        }
        if (GameStatus.systemData[3] == 1) {
            CONF_ATTACK_KEY_MASK = 65536;
            CONF_JUMP_KEY_MASK = 32768;
            CONF_SELECT_MASK = 65552;
            CONF_AVOID_KEY_MASK = 16777344;
            CONF_GUARD_KEY_MASK = 262144;
            CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
            CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
            return;
        }
        if (GameStatus.systemData[3] == 2) {
            CONF_ATTACK_KEY_MASK = 65536;
            CONF_JUMP_KEY_MASK = 262144;
            CONF_SELECT_MASK = 65552;
            CONF_AVOID_KEY_MASK = 16809984;
            CONF_GUARD_KEY_MASK = 128;
            CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
            CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
            return;
        }
        if (GameStatus.systemData[3] == 3) {
            CONF_VOLUME_KEY_MASK = Appearance.USE_FIGURE_APPEARANCE;
            CONF_ATTACK_KEY_MASK = 16;
            CONF_SELECT_MASK = 16;
            CONF_AVOID_KEY_MASK = VertexBuffer.SPRITE_PER_OBJ;
            CONF_JUMP_KEY_MASK = 4194304;
            CONF_GUARD_KEY_MASK = 64;
            CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
            CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 128;
            return;
        }
        if (GameStatus.systemData[3] == 4) {
            CONF_ATTACK_KEY_MASK = 32768;
            CONF_JUMP_KEY_MASK = 128;
            CONF_SELECT_MASK = 32784;
            CONF_AVOID_KEY_MASK = R.id.background;
            CONF_GUARD_KEY_MASK = 16384;
            CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
            CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 128;
            return;
        }
        CONF_VOLUME_KEY_MASK = 8;
        CONF_MENU_COMMAND_KEY = 13;
        CONF_MENU_SYSTEM_KEY = 12;
        CONF_ATTACK_KEY_MASK = 65536;
        CONF_JUMP_KEY_MASK = 262144;
        CONF_SELECT_MASK = 65552;
        CONF_AVOID_KEY_MASK = 16777344;
        CONF_GUARD_KEY_MASK = 32768;
        CONF_MENU_KEY_MASK = (1 << CONF_MENU_SYSTEM_KEY) | (1 << CONF_MENU_COMMAND_KEY);
        CONF_SYSTEM_BACK_MASK = CONF_MENU_KEY_MASK | 262144;
    }

    private static int keyConvert(int i) {
        int i2 = -1;
        if (Game.DISPLAY_STYLE == 3 && PhoneSystem2.getAttribute(142) == 3) {
            if (i == CONF_KEY_UP) {
                return 1;
            }
            if (i == CONF_KEY_RIGHT) {
                return 0;
            }
            if (i == CONF_KEY_DOWN) {
                return 3;
            }
            if (i == CONF_KEY_LEFT) {
                return 2;
            }
        }
        if (i != CONF_KEY_UP) {
            if (i != CONF_KEY_RIGHT) {
                if (i != CONF_KEY_DOWN) {
                    if (i != CONF_KEY_LEFT) {
                        switch (i) {
                            case 0:
                                i2 = 7;
                                break;
                            case 5:
                                i2 = 12;
                                break;
                            case 10:
                                i2 = 17;
                                break;
                            case 11:
                                i2 = 18;
                                break;
                            case 12:
                                i2 = 21;
                                break;
                            case 13:
                                i2 = 22;
                                break;
                            case 20:
                                i2 = 4;
                                break;
                            case 21:
                                i2 = 5;
                                break;
                            case 22:
                                i2 = 6;
                                break;
                            case 32:
                                i2 = 23;
                                break;
                            case 48:
                                i2 = 20;
                                break;
                            case 49:
                                i2 = 19;
                                break;
                        }
                        if (Game.DISPLAY_STYLE != 1 || PhoneSystem2.getAttribute(142) != 3) {
                            switch (i) {
                                case 1:
                                    i2 = 8;
                                    break;
                                case 2:
                                    i2 = 9;
                                    break;
                                case 3:
                                    i2 = 10;
                                    break;
                                case 4:
                                    i2 = 11;
                                    break;
                                case 6:
                                    i2 = 13;
                                    break;
                                case 7:
                                    i2 = 14;
                                    break;
                                case 8:
                                    i2 = 15;
                                    break;
                                case 9:
                                    i2 = 16;
                                    break;
                            }
                        } else {
                            switch (i) {
                                case 1:
                                    i2 = 10;
                                    break;
                                case 2:
                                    i2 = 13;
                                    break;
                                case 3:
                                    i2 = 16;
                                    break;
                                case 4:
                                    i2 = 9;
                                    break;
                                case 6:
                                    i2 = 15;
                                    break;
                                case 7:
                                    i2 = 8;
                                    break;
                                case 8:
                                    i2 = 11;
                                    break;
                                case 9:
                                    i2 = 14;
                                    break;
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 3;
            }
        } else {
            i2 = 0;
        }
        return i2;
    }

    public static void loadingCountSet(int i, int i2, int i3) {
        loadingSizeMax[i] = i2 + 1;
        loadingSize[i] = 0;
        loadingSizeMode[i] = i3;
        for (int i4 = i + 1; i4 < loadingSizeMax.length; i4++) {
            int[] iArr = loadingSizeMax;
            loadingSize[i4] = 0;
            iArr[i4] = 0;
        }
        nowLoading(loadingSizeMode[i]);
    }

    public static void loadingCountUp(int i) {
        if (loadingSize[i] < loadingSizeMax[i]) {
            int[] iArr = loadingSize;
            iArr[i] = iArr[i] + 1;
            for (int i2 = i + 1; i2 < loadingSizeMax.length; i2++) {
                int[] iArr2 = loadingSize;
                loadingSizeMax[i2] = 0;
                iArr2[i2] = 0;
            }
        }
        nowLoading(loadingSizeMode[i]);
    }

    public static void loadingCountUp(int i, int i2) {
        if (loadingSize[i] < loadingSizeMax[i]) {
            int[] iArr = loadingSize;
            iArr[i] = iArr[i] + i2;
            for (int i3 = i + 1; i3 < loadingSizeMax.length; i3++) {
                int[] iArr2 = loadingSize;
                loadingSizeMax[i3] = 0;
                iArr2[i3] = 0;
            }
        }
        nowLoading(loadingSizeMode[i]);
    }

    public static void nowLoading(int i) {
        float f;
        GameStatus.GAME.volumeView = false;
        SoftKeyUndrawFlg = true;
        if (i != 4 && i != 5) {
            Draw2D.fillRect(0, 0, 854, 480, 0, 0, 0, 0);
        }
        if (i != 5) {
            float f2 = 0.0f;
            float f3 = 231.0f;
            int i2 = 0;
            while (true) {
                f = f2;
                if (i2 >= loadingSizeMax.length || loadingSizeMax[i2] <= 0 || loadingSize[i2] > loadingSizeMax[i2]) {
                    break;
                }
                f3 /= loadingSizeMax[i2];
                f2 = (loadingSize[i2] * f3) + f;
                i2++;
            }
            if (loadingSizeMax[0] > 0 && (f > 0.0f || loadingSize[0] == 0)) {
                Draw2D.fillRect(Attack.ID_EFFECT_PIYORI_MARK, 425, 235, 20, 7829367, 0, 0, 0);
                Draw2D.fillRect(601, 426, 233, 18, 10066329, 0, 0, 0);
                Draw2D.fillRect(602, 427, 231, 16, 11184810, 0, 0, 0);
                Draw2D.fillRect(602, 427, (int) f, 16, 43600, 0, 0, 0);
                Draw2D.fillRect(602, 427, (int) f, 5, 39232, 0, 0, 0);
                Draw2D.fillRect(602, 427, (int) f, 4, 34864, 0, 0, 0);
                Draw2D.fillRect(602, 427, (int) f, 3, 30496, 0, 0, 0);
                Draw2D.fillRect(602, 427, (int) f, 2, 26128, 0, 0, 0);
                Draw2D.fillRect(602, 427, (int) f, 1, 21760, 0, 0, 0);
            }
        }
        if (i == 0) {
            Draw2D.drawString("ダウンロード中", Attack.ID_EFFECT_PIYORI_MARK, 479, 24, K_ANY, 0, 0, 0);
            int i3 = 0;
            while (i3 < 6) {
                Draw2D.drawString(".", (i3 * 10) + 775, 479, 24, loadCount % 6 >= i3 ? 16777215 : 0, 0, 0, 0);
                i3++;
            }
        } else if (i == 1 || i == 4) {
            Draw2D.drawString("データ展開中", Attack.ID_EFFECT_PIYORI_MARK, 479, 24, K_ANY, 0, 0, 0);
            int i4 = 0;
            while (i4 < 6) {
                Draw2D.drawString(".", (i4 * 10) + 755, 479, 24, loadCount % 6 >= i4 ? 16777215 : 0, 0, 0, 0);
                i4++;
            }
        } else if (i == 2) {
            Draw2D.drawString("microSDカードチェック中", 490, 479, 24, K_ANY, 0, 0, 0);
            int i5 = 0;
            while (i5 < 6) {
                Draw2D.drawString(".", (i5 * 10) + 775, 479, 24, loadCount % 6 >= i5 ? 16777215 : 0, 0, 0, 0);
                i5++;
            }
        } else if (i == 3) {
            Draw2D.drawString("バージョンチェック中", Attack.ID_EFFECT_PIYORI_MARK, 479, 24, K_ANY, 0, 0, 0);
        } else if (i == 4) {
            Draw2D.fillRect(300, 210, Appearance.LIGHTTWOSIDE, 42, K_ANY, 0, 0, 0);
            Draw2D.fillRect(303, 213, 250, 36, 0, 0, 0, 0);
            Draw2D.drawString("データ展開中", 323, 243, 24, K_ANY, 0, 0, 0);
            int i6 = 0;
            while (i6 < 6) {
                Draw2D.drawString(".", (i6 * 10) + 478, 243, 24, loadCount % 6 >= i6 ? 16777215 : 0, 0, 0, 0);
                i6++;
            }
        } else if (i == 5) {
            Draw2D.drawString("通信中", Attack.ID_EFFECT_PIYORI_MARK, 479, 24, K_ANY, 0, 0, 0);
        }
        Draw2D.flush();
        f54g.unlock(true);
        f54g.lock();
        begin3D();
        loadCount++;
        GameStatus.GAME.volumeView = true;
        if (i != 5) {
            SoftKeyUndrawFlg = false;
        }
    }

    public static void refreshKey() {
        for (int i = 0; i <= 24; i++) {
            if (KEY_STATE[i] != 0) {
                KEY_STATE_BIT |= 1 << i;
            } else {
                KEY_STATE_BIT &= (1 << i) ^ (-1);
            }
        }
        KEY_STATE_BIT &= -234881025;
        KEY_STATE_BIT |= (KEY_STATE[25] & 7) << 25;
        KEY_PUSH_BIT = 0;
        for (int i2 = 0; i2 <= 24; i2++) {
            if ((KEY_STATE_BIT_BACK & (1 << i2)) == 0 && (KEY_STATE_BIT & (1 << i2)) != 0) {
                KEY_PUSH_BIT |= 1 << i2;
            }
        }
        boolean[] zArr = UD_KEY_FLG;
        UD_KEY_FLG[1] = false;
        zArr[0] = false;
        if ((KEY_PUSH_BIT & 1) != 0) {
            UD_KEY_TIME[0] = sleepTime;
        } else if ((KEY_STATE_BIT & 1) == 0) {
            UD_KEY_TIME[0] = 0;
        } else if (UD_KEY_TIME[0] > 0 && sleepTime - UD_KEY_TIME[0] >= 1000) {
            UD_KEY_TIME[0] = sleepTime - 888;
            UD_KEY_FLG[0] = true;
        }
        if ((KEY_PUSH_BIT & 4) != 0) {
            UD_KEY_TIME[1] = sleepTime;
        } else if ((KEY_STATE_BIT & 4) == 0) {
            UD_KEY_TIME[1] = 0;
        } else if (UD_KEY_TIME[1] > 0 && sleepTime - UD_KEY_TIME[1] >= 1000) {
            UD_KEY_TIME[1] = sleepTime - 888;
            UD_KEY_FLG[1] = true;
        }
        KEY_STATE_BIT_BACK = KEY_STATE_BIT;
        KEY_STATE[20] = 0;
        KEY_STATE[19] = 0;
    }

    public static void resetAllKey() {
        resetKey();
        KEY_STATE_BIT = 0;
        KEY_STATE_BIT_BACK = 0;
        Util.zeroClear(KEY_STATE);
    }

    public static void resetKey() {
        LAST_DIR_KEY = 0;
        KEY_DIR_TIME = 0L;
        KEY_PUSH_BIT = 0;
    }

    public static void resetPushKey() {
        KEY_STATE_BIT_BACK = KEY_STATE_BIT;
        KEY_PUSH_BIT = 0;
    }

    public static void resetSelectKey() {
        resetKey();
        KEY_STATE_BIT &= 260046863;
        KEY_STATE_BIT_BACK &= 260046863;
        for (int i = 4; i < 23; i++) {
            KEY_STATE[i] = 0;
        }
    }

    public static void syncCommon(int i) {
        f54g.unlock(true);
        if (PhoneSystem.getAttribute(9) == 0) {
            PhoneSystem.setAttribute(0, 0);
            Sound.setVolume(0);
            while (PhoneSystem.getAttribute(9) == 0) {
                StarApplication.getThisStarApplication().setWakeupTimer(1000L);
                StarApplication.getThisStarApplication().suspend();
            }
            Sound.setVolume();
            PhoneSystem.setAttribute(0, 1);
        }
        sleepTimeDebug = sleepTime;
        long j = sleepTime + ((long) i);
        sleepTime = j;
        int iCurrentTimeMillis = (int) (j - System.currentTimeMillis());
        if (iCurrentTimeMillis <= 0 || iCurrentTimeMillis > i) {
            sleepTime = System.currentTimeMillis();
        } else {
            Util.Sleep(iCurrentTimeMillis);
        }
        f54g.lock();
        begin3D();
    }

    public static void terminate() {
        StarApplication.getThisStarApplication().terminate();
    }

    public static void upgrate() {
        StarApplication.getThisStarApplication().getStarApplicationManager().upgrade();
    }

    public void paint(Graphics graphics) {
    }

    public void processEvent(int i, int i2) {
        int i3;
        if (i == 0 || i == 1) {
            boolean z = i2 == CONF_KEY_UP || i2 == CONF_KEY_RIGHT || i2 == CONF_KEY_DOWN || i2 == CONF_KEY_LEFT;
            int iKeyConvert = keyConvert(i2);
            if (iKeyConvert >= 0) {
                if (i == 0) {
                    if (z) {
                        i3 = KEY_STATE[0] + KEY_STATE[3] + KEY_STATE[2] + KEY_STATE[1] + 1;
                        if (KEY_STATE[26] == i2 && sleepTime - KEY_DIR_TIME < 350 && !Attack.isRC()) {
                            KEY_STATE[24] = 1;
                        }
                        KEY_DIR_TIME = sleepTime;
                        KEY_STATE[26] = i2;
                        LAST_DIR_KEY = iKeyConvert;
                    } else {
                        i3 = 1;
                    }
                    if (GameStatus.GAME.volumeView && i2 < 30 && ((1 << i2) & CONF_VOLUME_KEY_MASK) != 0) {
                        GameStatus.systemData[2] = (GameStatus.systemData[2] + 1) % 4;
                        Game.menu.menu_ref = true;
                        Sound.setVolume();
                        if (!GameStatus.scratchpadAccess && !GameStatus.sdCardAccess) {
                            GameStatus.saveSystemData();
                        }
                    }
                } else {
                    if (i != 1 || i2 == 48 || i2 == 49) {
                        return;
                    }
                    if (z) {
                        KEY_STATE[24] = 0;
                        i3 = 0;
                    } else {
                        i3 = 0;
                    }
                }
                KEY_STATE[iKeyConvert] = i3;
                if (z) {
                    int iMax = Math.max(Math.max(Math.max(KEY_STATE[0], KEY_STATE[3]), KEY_STATE[2]), KEY_STATE[1]);
                    if (iMax == 0) {
                        KEY_STATE[25] = 0;
                        return;
                    }
                    if (iMax == KEY_STATE[0]) {
                        KEY_STATE[25] = 1;
                        return;
                    }
                    if (iMax == KEY_STATE[3]) {
                        KEY_STATE[25] = 4;
                    } else if (iMax == KEY_STATE[2]) {
                        KEY_STATE[25] = 3;
                    } else if (iMax == KEY_STATE[1]) {
                        KEY_STATE[25] = 2;
                    }
                }
            }
        }
    }
}
