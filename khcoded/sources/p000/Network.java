package p000;

import com.docomostar.io.BufferedReader;
import com.docomostar.io.HttpConnection;
import com.docomostar.io.SocketConnection;
import com.docomostar.system.Launcher;
import com.docomostar.ui.Dialog;
import com.docomostar.ui.UIException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Vector;
import javax.microedition.io.Connector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Network {
    private static final int P2P_SOCKET_MAX = 1;
    public static final int P2P_TYPE_TCP = 1;
    public static int CONTENT_ID = 10000001;
    private static int accessCount = 0;
    private static SocketConnection[] _tcp_sc = new SocketConnection[1];
    private static InputStream[] _tcp_in = new InputStream[1];
    private static OutputStream[] _tcp_out = new OutputStream[1];
    public static int[][] _connectType = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 1, 2);

    Network() {
    }

    public static String AKCommand(int i, String str, String str2, boolean z) throws Throwable {
        byte[] bytes;
        String string;
        String str3 = Game.AK_URL;
        switch (i) {
            case 0:
                bytes = null;
                string = new StringBuffer().append(str3).append("/user/Login.api?uid=").append(Game.TEST_UID).append("&apptype=C").toString();
                break;
            case 1:
                bytes = null;
                string = new StringBuffer().append(str3).append("/user/GetMoney.api?uid=").append(Game.TEST_UID).toString();
                break;
            case 2:
                String string2 = new StringBuffer().append(str3).append("/user/ConsumeMoney.api").toString();
                bytes = str2.getBytes();
                string = string2;
                break;
            case 3:
                String string3 = new StringBuffer().append(str3).append("/user/AddMoney.api").toString();
                bytes = str2.getBytes();
                string = string3;
                break;
            case 4:
                String string4 = new StringBuffer().append(str3).append("/minigame/SendClearCode.api").toString();
                bytes = str2.getBytes();
                string = string4;
                break;
            case 5:
                bytes = null;
                string = new StringBuffer().append(str3).append("/level/GetLevel.api?uid=").append(Game.TEST_UID).toString();
                break;
            default:
                bytes = null;
                string = str3;
                break;
        }
        if (z) {
            Draw2D.fillRect(0, 0, 854, 480, 0, 2, 80, 80);
        }
        GameCommon.nowLoading(5);
        byte[] bArrWeb_access = web_access(Game.HOST_NAME, string, bytes, false, null, false, true);
        GameCommon.SoftKeyUndrawFlg = false;
        if (bArrWeb_access == null) {
            return null;
        }
        return new String(bArrWeb_access);
    }

    public static String LAPCommand(int i, String str, boolean z) throws Throwable {
        if (z) {
            Draw2D.fillRect(0, 0, 854, 480, 0, 2, 80, 80);
        }
        GameCommon.nowLoading(5);
        byte[] bArrLAPCommandAccess = LAPCommandAccess(i, str, false, false, 2);
        GameCommon.SoftKeyUndrawFlg = false;
        if (bArrLAPCommandAccess == null) {
            return null;
        }
        checkMainCur(new String(bArrLAPCommandAccess));
        checkAppliMessage(2, new String(bArrLAPCommandAccess));
        return new String(bArrLAPCommandAccess);
    }

    public static String LAPCommand(int i, String str, boolean z, boolean z2, int i2, boolean z3) {
        byte[] bArrLAPCommandAccess;
        do {
            if (z3) {
                Draw2D.fillRect(0, 0, 854, 480, 0, 2, 80, 80);
            }
            GameCommon.nowLoading(5);
            bArrLAPCommandAccess = LAPCommandAccess(i, str, z, z2, i2);
            GameCommon.SoftKeyUndrawFlg = false;
            if (bArrLAPCommandAccess != null) {
                if (!z) {
                    break;
                }
            } else {
                return null;
            }
        } while (!checkMainCur(new String(bArrLAPCommandAccess)));
        if (z2) {
            checkSubCur(new String(bArrLAPCommandAccess));
        }
        if (i2 > 0) {
            checkAppliMessage(i2, new String(bArrLAPCommandAccess));
        }
        checkAppliVersion(new String(bArrLAPCommandAccess));
        return new String(bArrLAPCommandAccess);
    }

    private static byte[] LAPCommandAccess(int i, String str, boolean z, boolean z2, int i2) throws Throwable {
        String string = new StringBuffer().append("lap=<LPV>(100)<CID>(").append(CONTENT_ID).append(")<CAV>(").append(114).append(")<MUA>(").append(Main.MODEL).append(")<CUR>(0)<MBR>(0)").toString();
        if (i2 > 0) {
            string = new StringBuffer().append(string).append("<MES>(").append(GameStatus.systemData[(i2 - 1) + 5]).append(",").append(i2).append(")").toString();
        }
        if (z2) {
            string = new StringBuffer().append(string).append("<CI2>(10000009,10000002,10000003,10000004,10000005,10000006,10000007,10000008)<CU2>(0)").toString();
        }
        try {
            byte[] bArrWeb_access = web_access(Game.HOST_NAME, Game.GP_URL, (i > 0 ? new StringBuffer().append(string).append("<APT>(").append(i).append(",").append(str).append(")").toString() : string).getBytes(), false, null, false, true);
            if (bArrWeb_access == null) {
                return null;
            }
            new String(bArrWeb_access);
            return bArrWeb_access;
        } catch (Exception e) {
            return null;
        }
    }

    public static void checkAppliMessage(int i, String str) {
        Vector vectorSplitCommand = splitCommand("<MES>", str);
        if (vectorSplitCommand == null || GameStatus.systemData[(i - 1) + 5] >= Util.s2i((String) vectorSplitCommand.elementAt(0))) {
            return;
        }
        GameStatus.systemData[(i - 1) + 5] = Util.s2i((String) vectorSplitCommand.elementAt(0));
        GameStatus.saveSystemData();
        String[] strArr = {(String) vectorSplitCommand.elementAt(2)};
        int i2 = 0;
        while (true) {
            String strStrtok = Util.strtok(strArr, "|");
            if (strStrtok == null) {
                GameCommon.dialogWindow(false, 0, true);
                return;
            } else {
                Draw2D.drawString(strStrtok, 120, i2 + 180, 24, GameCommon.K_ANY, 0, 0, 0);
                i2 += 30;
            }
        }
    }

    public static void checkAppliVersion(String str) {
        Vector vectorSplitCommand = splitCommand("<CAV>", str);
        if (vectorSplitCommand != null) {
            int iS2i = Util.s2i((String) vectorSplitCommand.elementAt(0));
            int iS2i2 = Util.s2i((String) vectorSplitCommand.elementAt(1));
            if (iS2i == 1) {
                Dialog dialog = new Dialog(0, "アプリのバージョンアップ");
                dialog.setText((String) vectorSplitCommand.elementAt(2));
                GameCommon.dialogShow(dialog);
                GameCommon.upgrate();
                GameCommon.infoTarminate();
                return;
            }
            if ((iS2i != 2 && iS2i != 3) || GameStatus.systemData[7] == iS2i2) {
                if (iS2i == 9) {
                    Dialog dialog2 = new Dialog(0, "");
                    dialog2.setText((String) vectorSplitCommand.elementAt(2));
                    GameCommon.dialogShow(dialog2);
                    GameCommon.terminate();
                    return;
                }
                return;
            }
            Dialog dialog3 = new Dialog(3, "アプリのバージョンアップ");
            dialog3.setText((String) vectorSplitCommand.elementAt(2));
            if (GameCommon.dialogShow(dialog3) == 4) {
                GameCommon.upgrate();
                GameCommon.infoTarminate();
            }
            GameStatus.systemData[7] = iS2i2;
            GameStatus.saveSystemData();
        }
    }

    public static boolean checkMainCur(String str) {
        Game.curList[0] = false;
        Vector vectorSplitCommand = splitCommand("<MBR>", str);
        if (vectorSplitCommand != null && Util.s2i((String) vectorSplitCommand.elementAt(0)) != 1 && dispCodedErrorDialog(Util.s2i((String) vectorSplitCommand.elementAt(0)))) {
            return false;
        }
        Vector vectorSplitCommand2 = splitCommand("<CUR>", str);
        if (vectorSplitCommand2 == null) {
            dispCodedErrorDialog(-1);
        } else if (Util.s2i((String) vectorSplitCommand2.elementAt(0)) == 4) {
            Dialog dialog = new Dialog(2, "通信エラー");
            if (vectorSplitCommand2.size() > 2) {
                dialog.setText((String) vectorSplitCommand2.elementAt(2));
            } else {
                dialog.setText("ただいまサーバにアクセスできません\n詳しくはサイトのトップページをご覧ください");
            }
            GameCommon.dialogShow(dialog);
            GameCommon.infoTarminate();
        } else if (Util.s2i((String) vectorSplitCommand2.elementAt(0)) != 1 && dispCodedErrorDialog(Util.s2i((String) vectorSplitCommand2.elementAt(0)))) {
            return false;
        }
        Game.curList[0] = true;
        return true;
    }

    public static void checkSubCur(String str) {
        int i = 0;
        for (int i2 = 1; i2 < Game.curList.length; i2++) {
            Game.curList[i2] = false;
        }
        Vector vectorSplitCommand = splitCommand("<CU2>", str);
        if (vectorSplitCommand == null) {
            dispCodedErrorDialog(-1);
        }
        int i3 = 1;
        while (i < vectorSplitCommand.size()) {
            if (Util.s2i((String) vectorSplitCommand.elementAt(i)) == 1) {
                Game.curList[i3] = true;
            }
            i++;
            i3++;
        }
        if (Main.MODEL.equals("P07A")) {
            Game.curList[1] = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean dispAkErrorDialog(int i) {
        new String[1][0] = "OK";
        switch (i) {
            case 0:
                return false;
            case 3:
                Draw2D.drawString("ただいまサーバにアクセスできません", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                Draw2D.drawString("詳しくはサイトのトップページをご覧ください", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                GameCommon.dialogWindow(false, 0, false);
                launchBrowser(Game.TOPPAGE_URL);
                return false;
            case 6:
                Draw2D.drawString("ユーザ情報エラーが発生しました。", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                Draw2D.drawString("アプリを終了します。", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                GameCommon.dialogWindow(false, 0, false);
                GameCommon.terminate();
                return false;
            case 12:
                Draw2D.drawString("既に取得済みのプレゼントです", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                GameCommon.dialogWindow(false, 0, false);
                return false;
            case 40:
                Draw2D.drawString("このアイテムを購入するにはAKLv、マニーが足りません", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                Draw2D.drawString("AKLv、マニーの説明を見るためにサイト接続しますか？", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                if (GameCommon.dialogWindow(true, 1, true)) {
                    launchBrowser(Game.MUNNIEPAGE_URL, true);
                }
                return false;
            default:
                GameCommon.criticalError();
                return false;
        }
    }

    public static boolean dispCodedErrorDialog(int i) {
        switch (i) {
            case 1:
                return false;
            case 2:
                dispCurErrorDialog(true, -1);
                return false;
            case 3:
                Draw2D.drawString("ポイントが不足しているためアプリの利用権が停止中です", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                GameCommon.dialogWindow(false, 0, false);
                launchBrowser(Game.TOPPAGE_URL);
                GameCommon.infoTarminate();
                return false;
            case 4:
            case 7:
            default:
                Draw2D.drawString("予期しないエラーが発生しました", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                Draw2D.drawString("アプリを終了します。", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                GameCommon.dialogWindow(false, 0, false);
                GameCommon.terminate();
                return false;
            case 5:
            case 6:
                Draw2D.drawString("通信に失敗しました", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                Draw2D.drawString("電波が届かないか、サーバが混雑している恐れがあります", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                Draw2D.drawString("再接続しますか？", 120, 240, 24, GameCommon.K_ANY, 0, 0, 0);
                if (!GameCommon.dialogWindow(true, 0, true)) {
                    GameCommon.infoTarminate();
                }
                return true;
            case 8:
                Draw2D.drawString("サービスは終了しました", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                Draw2D.drawString("アプリを終了します", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                GameCommon.dialogWindow(false, 0, false);
                GameCommon.infoTarminate();
                return false;
        }
    }

    public static void dispCurErrorDialog(boolean z, int i) {
        if (i == 0) {
            Draw2D.drawString("アプリの利用権がありません", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
            Draw2D.drawString("サービス申し込みを行ってください", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
            GameCommon.dialogWindow(false, 0, false);
            launchBrowser(Game.TOPPAGE_URL);
        } else {
            Draw2D.drawString("エピソードの利用権がありません", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
            Draw2D.drawString("サービス申し込みを行ってください", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
            GameCommon.dialogWindow(false, 0, false);
            launchBrowser(new StringBuffer().append(Game.PURCHASE_URL).append("#ep").append(i).toString());
        }
        if (z) {
            GameCommon.infoTarminate();
        }
    }

    public static boolean dispReConnectDialog() {
        boolean z = GameCommon.now3DState;
        if (z) {
            GameCommon.end3D();
        }
        GameCommon.f54g.unlock(true);
        GameCommon.f54g.lock();
        Draw2D.flush();
        GameCommon.f54g.clearRect(0, 0, 854, 480);
        GameCommon.f54g.unlock(true);
        Draw2D.drawString("通信に失敗しました", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
        Draw2D.drawString("電波が届かないか、サーバが混雑している恐れがあります", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
        Draw2D.drawString("再接続しますか？", 120, 240, 24, GameCommon.K_ANY, 0, 0, 0);
        boolean zDialogWindow = GameCommon.dialogWindow(true, 0, true);
        if (z) {
            GameCommon.begin3D();
        }
        return zDialogWindow;
    }

    public static String getCrcString(String str) {
        GameCommon.nowLoading(3);
        return getHttpString(new StringBuffer().append("http://").append(Game.DLHOST_NAME).append(Game.DOWNLOAD_URL).append(str).append("&comm=CRC").toString());
    }

    public static int getDataSize(String str) {
        int i = -1;
        try {
            HttpConnection httpConnectionOpen = Connector.open(new StringBuffer().append(new StringBuffer().append("http://").append(Game.DLHOST_NAME).append(str).toString()).append("&comm=HEAD").toString(), 1, true);
            httpConnectionOpen.setRequestMethod("GET");
            httpConnectionOpen.connect();
            InputStream inputStreamOpenInputStream = httpConnectionOpen.openInputStream();
            i = Util.readInt(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            httpConnectionOpen.close();
            return i;
        } catch (Exception e) {
            return i;
        } catch (UIException e2) {
            return i;
        }
    }

    public static String getHttpString(String str) {
        try {
            HttpConnection httpConnectionOpen = Connector.open(str, 1, true);
            httpConnectionOpen.setRequestMethod("GET");
            httpConnectionOpen.connect();
            InputStream inputStreamOpenInputStream = httpConnectionOpen.openInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                    return line;
                } catch (UIException e2) {
                    return line;
                }
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            if (httpConnectionOpen != null) {
                httpConnectionOpen.close();
            }
            return line;
        } catch (Exception e3) {
            return null;
        } catch (UIException e4) {
            return null;
        }
    }

    public static void launchBrowser(String str) {
        launchBrowser(str, false);
    }

    public static void launchBrowser(String str, boolean z) {
        if (z) {
            Draw2D.drawStringMode("アプリを終了してサイト接続します。", 427, 180, 24, GameCommon.K_ANY, 0, 0, 0, 2);
            Draw2D.drawStringMode("ここまでのプレイデータをセーブしますか？", 427, 210, 24, GameCommon.K_ANY, 0, 0, 0, 2);
            if (GameCommon.dialogWindow(true, 0, true)) {
                if (GameStatus.PLAYER.getNumberData(19) == 1) {
                    Game.menu.commonSave("ワールドセレクト");
                } else {
                    Game.menu.commonSave(MapData.mapName[GameStatus.PLAYER.getNumberData(22)]);
                }
                Game.menu.commonQuestion("\u3000\u3000\u3000セーブが完了しました", new String[]{"OK"}, 0, 0, 55, 260);
            }
        }
        Launcher.launch(1, new String[]{str});
    }

    public static void mainteCheck() throws Throwable {
        byte[] bArrWeb_access = web_access(Game.HOST_NAME, new StringBuffer().append(Game.GP_URL).append("&lap=<LPV>(100)<CID>(").append(CONTENT_ID).append(")<CUR>(0)").toString(), null, false, null, false, false);
        if (bArrWeb_access != null) {
            checkMainCur(new String(bArrWeb_access));
        }
    }

    private static void p2pClose(int i) {
        if (i < 0) {
            return;
        }
        try {
            _connectType[i][1] = 0;
            if (_tcp_in[i] != null) {
                _tcp_in[i].close();
            }
            if (_tcp_out[i] != null) {
                _tcp_out[i].close();
            }
            if (_tcp_sc[i] != null) {
                _tcp_sc[i].close();
            }
        } catch (Exception e) {
        }
        _tcp_in[i] = null;
        _tcp_out[i] = null;
        _tcp_sc[i] = null;
    }

    public static void pakehoCheck() {
        if (Main.MODEL.length() >= 2 && Main.MODEL.substring(0, 2).equals("ap")) {
            return;
        }
        int i = 0;
        while (true) {
            String httpString = getHttpString(new StringBuffer().append("http://").append(Game.DLHOST_NAME).append(Game.PAKEHO_URL).toString());
            if (httpString == null) {
                int i2 = i + 1;
                if (i == 3) {
                    while (!dispReConnectDialog()) {
                        GameCommon.confirmTerminate();
                    }
                    i = 0;
                } else {
                    i = i2;
                }
            } else {
                if (httpString.equals("1")) {
                    return;
                }
                Draw2D.drawString("データのダウンロードが出来ません", 120, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                Draw2D.drawString("詳しくはサイトをご覧ください", 120, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                GameCommon.dialogWindow(false, 0, false);
                launchBrowser(Game.PAKEHO_CHECK_URL);
                GameCommon.infoTarminate();
            }
        }
    }

    public static Vector splitCommand(String str, String str2) {
        Vector vector;
        int iIndexOf;
        char cCharAt;
        if (str2 == null || (iIndexOf = str2.indexOf(new StringBuffer().append(str).append("(").toString())) == -1) {
            vector = null;
        } else {
            Vector vector2 = new Vector();
            int length = iIndexOf + str.length() + 1;
            do {
                String string = "";
                int i = length;
                while (true) {
                    length = i + 1;
                    cCharAt = str2.charAt(i);
                    if (cCharAt == ',' || cCharAt == ')') {
                        break;
                    }
                    if (cCharAt == '`') {
                        i = length + 1;
                        string = new StringBuffer().append(string).append(str2.charAt(length)).toString();
                    } else {
                        string = new StringBuffer().append(string).append(cCharAt).toString();
                        i = length;
                    }
                }
                vector2.addElement(string);
                if (length >= str2.length()) {
                    if (cCharAt != ')') {
                        return null;
                    }
                    vector = vector2;
                }
            } while (cCharAt != ')');
            vector = vector2;
        }
        return vector;
    }

    public static boolean tcpAllDownload(String str, String[] strArr, boolean z) {
        if (strArr == null) {
            return false;
        }
        for (int i = 0; i < strArr.length && strArr[i] != null && strArr[i] != ""; i++) {
            if (!tcpDownloadDataMain(new StringBuffer().append(str).append(strArr[i]).toString(), strArr[i], z, true, 0)) {
                return false;
            }
        }
        return true;
    }

    public static boolean tcpClient(int i) {
        try {
            p2pClose(i);
            _tcp_sc[i] = (SocketConnection) Connector.open(new StringBuffer().append("socket://").append(Game.DLHOST_NAME).append(":").append(Game.PORT_NUMBER).toString());
            _tcp_sc[i].openRemotePort();
            _tcp_sc[i].connect();
            _tcp_in[i] = _tcp_sc[i].openInputStream();
            _tcp_out[i] = _tcp_sc[i].openOutputStream();
            _connectType[i][1] = 1;
            return true;
        } catch (Exception e) {
            p2pClose(i);
            return false;
        }
    }

    public static boolean tcpDownload(String str, String str2, boolean z) {
        return tcpDownloadDataMain(str, str2, z, true, 0);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:36:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111 A[SYNTHETIC] */
    private static boolean tcpDownloadDataMain(String str, String str2, boolean z, boolean z2, int i) throws Throwable {
        byte[] bArrTcpRead;
        System.gc();
        if (z2) {
            tcpClient(i);
        }
        int iTcpGetDataSize = tcpGetDataSize(str, false, i);
        if (iTcpGetDataSize <= 0) {
            mainteCheck();
            return false;
        }
        int i2 = 153600;
        boolean z3 = iTcpGetDataSize > 153600;
        int i3 = 0;
        int length = 0;
        int i4 = z3 ? 153600 : iTcpGetDataSize;
        OutputStream outputStreamStrageOutputStream = StrageDeviceAccess.strageOutputStream(str2);
        boolean z4 = false;
        while (true) {
            try {
                i2 = i4;
                String string = new StringBuffer().append("GET ").append(str).toString();
                if (z3) {
                    string = new StringBuffer().append(string).append("&bytes=").append(i3).append("-").append(i2 - 1).toString();
                }
                tcpWrite(i, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(string).append(" HTTP/1.1\r\n").toString()).append("Host: ").append(Game.DLHOST_NAME).append("\r\n").toString()).append("User-Agent: DoCoMo/2.0 ").append(Main.MODEL).append("(c10)\r\n").toString()).append("\r\n").toString().getBytes());
                TcpHttpHeader tcpHttpHeader = new TcpHttpHeader();
                while (true) {
                    bArrTcpRead = tcpRead(i);
                    if (bArrTcpRead != null && tcpHttpHeader.analyzeHeader(bArrTcpRead)) {
                        break;
                    }
                    if (z4 || !StrageDeviceAccess.sdCardAccessCheck()) {
                        StrageDeviceAccess.sdCardError();
                    }
                    mainteCheck();
                    if (!dispReConnectDialog()) {
                        return false;
                    }
                    p2pClose(i);
                    tcpClient(i);
                    i3 = iTcpGetDataSize - (iTcpGetDataSize - length);
                    if (!z3) {
                        i4 = i2;
                    } else if (153600 + i3 > iTcpGetDataSize) {
                        i4 = iTcpGetDataSize;
                    } else {
                        i4 = 153600 + i3;
                    }
                }
                if (tcpHttpHeader.getStatus() != 200 && tcpHttpHeader.getStatus() != 206) {
                    if (z2) {
                        p2pClose(i);
                    }
                    throw new Exception();
                }
                InputStream inputStreamByte2InputStream = Util.byte2InputStream(bArrTcpRead);
                if (bArrTcpRead.length - tcpHttpHeader.getHeaderSize() > 0) {
                    byte[] bArr = new byte[bArrTcpRead.length - tcpHttpHeader.getHeaderSize()];
                    inputStreamByte2InputStream.skip(tcpHttpHeader.getHeaderSize());
                    inputStreamByte2InputStream.read(bArr, 0, bArrTcpRead.length - tcpHttpHeader.getHeaderSize());
                    boolean z5 = true;
                    try {
                        outputStreamStrageOutputStream.write(bArr);
                        z5 = false;
                        length += bArr.length;
                        if (z) {
                            GameCommon.loadingCountUp(0, bArr.length);
                        }
                        z4 = false;
                    } catch (Exception e) {
                        z4 = z5;
                        if (z4) {
                            StrageDeviceAccess.sdCardError();
                        } else {
                            StrageDeviceAccess.sdCardError();
                        }
                        mainteCheck();
                        if (!dispReConnectDialog()) {
                            return false;
                        }
                        p2pClose(i);
                        tcpClient(i);
                        i3 = iTcpGetDataSize - (iTcpGetDataSize - length);
                        if (!z3) {
                            i4 = i2;
                        } else if (153600 + i3 > iTcpGetDataSize) {
                            i4 = iTcpGetDataSize;
                        } else {
                            i4 = 153600 + i3;
                        }
                    }
                }
                while (length < i2) {
                    byte[] bArrTcpRead2 = tcpRead(i);
                    if (bArrTcpRead2 != null) {
                        outputStreamStrageOutputStream.write(bArrTcpRead2);
                        length += bArrTcpRead2.length;
                        if (z) {
                            GameCommon.loadingCountUp(0, bArrTcpRead2.length);
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                    }
                }
                if (length >= iTcpGetDataSize) {
                    if (z2) {
                        p2pClose(i);
                    }
                    StrageDeviceAccess.StrageStreamClose();
                    return true;
                }
                i4 = 153600 + i2 > iTcpGetDataSize ? iTcpGetDataSize : 153600 + i2;
                i3 = i2;
            } catch (Exception e2) {
            }
            if (z4) {
                StrageDeviceAccess.sdCardError();
            } else {
                StrageDeviceAccess.sdCardError();
            }
            mainteCheck();
            if (!dispReConnectDialog()) {
                return false;
            }
            p2pClose(i);
            tcpClient(i);
            i3 = iTcpGetDataSize - (iTcpGetDataSize - length);
            if (!z3) {
                i4 = i2;
            } else if (153600 + i3 > iTcpGetDataSize) {
                i4 = iTcpGetDataSize;
            } else {
                i4 = 153600 + i3;
            }
        }
    }

    public static int tcpGetDataSize(String str, boolean z, int i) throws Throwable {
        int contentSize = -1;
        if (z) {
            tcpClient(i);
        }
        while (true) {
            try {
                String string = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("GET ").append(str).append("&comm=HEAD2 HTTP/1.1\r\n").toString()).append("Host: ").append(Game.DLHOST_NAME).append("\r\n").toString()).append("User-Agent: DoCoMo/2.0 ").append(Main.MODEL).append("(c10)\r\n").toString();
                if (z) {
                    string = new StringBuffer().append(string).append("Connection: close\r\n").toString();
                }
                tcpWrite(i, new StringBuffer().append(string).append("\r\n").toString().getBytes());
                TcpHttpHeader tcpHttpHeader = new TcpHttpHeader();
                while (true) {
                    byte[] bArrTcpRead = tcpRead(i);
                    if (bArrTcpRead != null && tcpHttpHeader.analyzeHeader(bArrTcpRead)) {
                        break;
                    }
                }
                if (tcpHttpHeader.getStatus() != 200 && tcpHttpHeader.getStatus() != 206) {
                    if (!z) {
                        break;
                    }
                    p2pClose(i);
                    break;
                }
                contentSize = tcpHttpHeader.getContentSize();
                if (!z) {
                    break;
                }
                p2pClose(i);
                break;
            } catch (Exception e) {
                mainteCheck();
                if (!dispReConnectDialog()) {
                    break;
                }
                p2pClose(i);
                tcpClient(i);
            }
        }
        return contentSize;
    }

    private static byte[] tcpRead(int i) throws Exception {
        byte[] bArr;
        int iAvailable;
        if (_tcp_in[i].available() <= 0 || (iAvailable = _tcp_in[i].available()) <= 0) {
            bArr = null;
        } else {
            bArr = new byte[iAvailable];
            _tcp_in[i].read(bArr);
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return bArr;
    }

    private static void tcpWrite(int i, byte[] bArr) throws Exception {
        _tcp_out[i].write(bArr);
        _tcp_out[i].flush();
    }

    public static byte[] web_access(String str, String str2, byte[] bArr, boolean z, String str3, boolean z2) {
        return web_access(str, str2, bArr, z, str3, z2, true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0193 A[Catch: Exception -> 0x01bf, TRY_LEAVE, TryCatch #11 {Exception -> 0x01bf, blocks: (B:98:0x018e, B:100:0x0193), top: B:148:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0197  */
    /* JADX WARN: Code duplicated, block: B:103:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b5 A[LOOP:1: B:111:0x01af->B:113:0x01b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:147:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0058 A[EDGE_INSN: B:165:0x0058->B:23:0x0058 BREAK  A[LOOP:0: B:3:0x0029->B:172:0x0029], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0166 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[Catch: Exception -> 0x0183, TRY_LEAVE, TryCatch #18 {Exception -> 0x0183, blocks: (B:15:0x0044, B:17:0x0049), top: B:152:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:184:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[DONT_INVERT, PHI: r5
  0x00a4: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String) binds: [B:39:0x007b, B:40:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[Catch: UIException -> 0x00f3, Exception -> 0x016c, all -> 0x018a, TRY_LEAVE, TryCatch #7 {all -> 0x018a, blocks: (B:40:0x007d, B:42:0x00a6, B:45:0x00c5, B:50:0x00dc, B:52:0x00e2, B:54:0x00e6, B:56:0x00ed, B:57:0x00f2, B:65:0x0142, B:68:0x0148, B:73:0x0156, B:63:0x0139, B:79:0x0166, B:80:0x016b, B:60:0x00f7), top: B:147:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7 A[Catch: UIException -> 0x00f3, Exception -> 0x016c, all -> 0x018a, TRY_LEAVE, TryCatch #7 {all -> 0x018a, blocks: (B:40:0x007d, B:42:0x00a6, B:45:0x00c5, B:50:0x00dc, B:52:0x00e2, B:54:0x00e6, B:56:0x00ed, B:57:0x00f2, B:65:0x0142, B:68:0x0148, B:73:0x0156, B:63:0x0139, B:79:0x0166, B:80:0x016b, B:60:0x00f7), top: B:147:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0160 A[Catch: Exception -> 0x01ea, TRY_LEAVE, TryCatch #5 {Exception -> 0x01ea, blocks: (B:75:0x015b, B:77:0x0160), top: B:145:0x015b }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0175 A[Catch: Exception -> 0x0187, TRY_LEAVE, TryCatch #16 {Exception -> 0x0187, blocks: (B:84:0x0170, B:86:0x0175), top: B:150:0x0170 }] */
    public static byte[] web_access(String str, String str2, byte[] bArr, boolean z, String str3, boolean z2, boolean z3) throws Throwable {
        OutputStream outputStreamStrageOutputStream;
        boolean z4;
        Throwable th;
        int length;
        int i;
        HttpConnection httpConnection;
        System.gc();
        String string = new StringBuffer().append("http://").append(str).append(str2).toString();
        int i2 = 3;
        byte[] bArr2 = null;
        int dataSize = -1;
        int i3 = 0;
        OutputStream outputStream = null;
        String string2 = "";
        boolean z5 = false;
        while (true) {
            int i4 = i2 - 1;
            if (i2 < 0) {
                outputStream = outputStream;
                break;
            }
            HttpConnection httpConnection2 = null;
            InputStream inputStreamOpenInputStream = null;
            if (!z || dataSize >= 0) {
                if (outputStream == null || str3 == null) {
                    outputStreamStrageOutputStream = outputStream;
                    z4 = z5;
                } else {
                    try {
                        outputStreamStrageOutputStream = StrageDeviceAccess.strageOutputStream(str3);
                        if (outputStreamStrageOutputStream == null) {
                            try {
                                throw new Exception();
                            } catch (Exception e) {
                                inputStreamOpenInputStream = null;
                                z5 = true;
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        inputStreamOpenInputStream.close();
                                    } catch (Exception e2) {
                                        outputStream = null;
                                        string2 = string2;
                                        z5 = z5;
                                        Util.Sleep(5000);
                                        if (i4 == 0) {
                                            i2 = i4;
                                        } else {
                                            if (!z3) {
                                                if (outputStream != null) {
                                                    StrageDeviceAccess.StrageStreamClose();
                                                }
                                                return null;
                                            }
                                            if (str3 != null && (z5 || !StrageDeviceAccess.sdCardAccessCheck())) {
                                                StrageDeviceAccess.sdCardError();
                                            }
                                            mainteCheck();
                                            if (outputStream != null || !StrageDeviceAccess.strageCheck(dataSize)) {
                                                while (!dispReConnectDialog()) {
                                                    GameCommon.confirmTerminate();
                                                }
                                            }
                                            i2 = 3;
                                        }
                                    }
                                }
                                if (httpConnection2 != null) {
                                    httpConnection2.close();
                                }
                                outputStream = outputStreamStrageOutputStream;
                                string2 = string2;
                                z5 = z5;
                                Util.Sleep(5000);
                                if (i4 == 0) {
                                    i2 = i4;
                                } else {
                                    if (!z3) {
                                        if (outputStream != null) {
                                            StrageDeviceAccess.StrageStreamClose();
                                        }
                                        return null;
                                    }
                                    if (str3 != null) {
                                        StrageDeviceAccess.sdCardError();
                                    }
                                    mainteCheck();
                                    if (outputStream != null) {
                                        while (!dispReConnectDialog()) {
                                            GameCommon.confirmTerminate();
                                        }
                                    } else {
                                        while (!dispReConnectDialog()) {
                                            GameCommon.confirmTerminate();
                                        }
                                    }
                                    i2 = 3;
                                }
                            } catch (UIException e3) {
                                inputStreamOpenInputStream = null;
                                z5 = true;
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        inputStreamOpenInputStream.close();
                                    } catch (Exception e4) {
                                        outputStream = null;
                                        string2 = string2;
                                        z5 = z5;
                                        Util.Sleep(5000);
                                        if (i4 == 0) {
                                            i2 = i4;
                                        } else {
                                            if (!z3) {
                                                if (outputStream != null) {
                                                    StrageDeviceAccess.StrageStreamClose();
                                                }
                                                return null;
                                            }
                                            if (str3 != null) {
                                                StrageDeviceAccess.sdCardError();
                                            }
                                            mainteCheck();
                                            if (outputStream != null) {
                                                while (!dispReConnectDialog()) {
                                                    GameCommon.confirmTerminate();
                                                }
                                            } else {
                                                while (!dispReConnectDialog()) {
                                                    GameCommon.confirmTerminate();
                                                }
                                            }
                                            i2 = 3;
                                        }
                                    }
                                }
                                if (httpConnection2 != null) {
                                    httpConnection2.close();
                                }
                                outputStream = outputStreamStrageOutputStream;
                                string2 = string2;
                                z5 = z5;
                                Util.Sleep(5000);
                                if (i4 == 0) {
                                    i2 = i4;
                                } else {
                                    if (!z3) {
                                        if (outputStream != null) {
                                            StrageDeviceAccess.StrageStreamClose();
                                        }
                                        return null;
                                    }
                                    if (str3 != null) {
                                        StrageDeviceAccess.sdCardError();
                                    }
                                    mainteCheck();
                                    if (outputStream != null) {
                                        while (!dispReConnectDialog()) {
                                            GameCommon.confirmTerminate();
                                        }
                                    } else {
                                        while (!dispReConnectDialog()) {
                                            GameCommon.confirmTerminate();
                                        }
                                    }
                                    i2 = 3;
                                }
                            }
                        } else {
                            z4 = false;
                        }
                    } catch (Exception e5) {
                        inputStreamOpenInputStream = null;
                        outputStreamStrageOutputStream = outputStream;
                        z5 = true;
                    } catch (UIException e6) {
                        inputStreamOpenInputStream = null;
                        outputStreamStrageOutputStream = outputStream;
                        z5 = true;
                    }
                }
                while (true) {
                    if (!z) {
                        if (bArr == null) {
                            httpConnection = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 1, true);
                            httpConnection.setRequestMethod("GET");
                            httpConnection2 = httpConnection;
                        } else {
                            HttpConnection httpConnection3 = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 3, true);
                            httpConnection3.setRequestMethod("POST");
                            httpConnection3.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                            OutputStream outputStreamOpenOutputStream = httpConnection3.openOutputStream();
                            httpConnection3.setRequestProperty("Content-Length", Integer.toString(bArr.length));
                            outputStreamOpenOutputStream.write(bArr);
                            outputStreamOpenOutputStream.flush();
                            outputStreamOpenOutputStream.close();
                            httpConnection2 = httpConnection3;
                        }
                        httpConnection2.connect();
                        inputStreamOpenInputStream = httpConnection2.openInputStream();
                        length = (int) httpConnection2.getLength();
                        if (length > 0) {
                        }
                        throw new Exception();
                    }
                    try {
                        try {
                            string2 = new StringBuffer().append("&bytes=").append(i3).append("-").append(Math.min(153600 + i3, dataSize) - 1).toString();
                            if (bArr == null) {
                                httpConnection = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 1, true);
                                try {
                                    httpConnection.setRequestMethod("GET");
                                    httpConnection2 = httpConnection;
                                } catch (Exception e7) {
                                    httpConnection2 = httpConnection;
                                    z5 = z4;
                                    if (inputStreamOpenInputStream != null) {
                                        inputStreamOpenInputStream.close();
                                    }
                                    if (httpConnection2 != null) {
                                        httpConnection2.close();
                                    }
                                    outputStream = outputStreamStrageOutputStream;
                                    string2 = string2;
                                    z5 = z5;
                                    Util.Sleep(5000);
                                    if (i4 == 0) {
                                        i2 = i4;
                                    } else {
                                        if (!z3) {
                                            if (outputStream != null) {
                                                StrageDeviceAccess.StrageStreamClose();
                                            }
                                            return null;
                                        }
                                        if (str3 != null) {
                                            StrageDeviceAccess.sdCardError();
                                        }
                                        mainteCheck();
                                        if (outputStream != null) {
                                            while (!dispReConnectDialog()) {
                                                GameCommon.confirmTerminate();
                                            }
                                        } else {
                                            while (!dispReConnectDialog()) {
                                                GameCommon.confirmTerminate();
                                            }
                                        }
                                        i2 = 3;
                                    }
                                } catch (UIException e8) {
                                    httpConnection2 = httpConnection;
                                    z5 = z4;
                                    if (inputStreamOpenInputStream != null) {
                                        inputStreamOpenInputStream.close();
                                    }
                                    if (httpConnection2 != null) {
                                        httpConnection2.close();
                                    }
                                    outputStream = outputStreamStrageOutputStream;
                                    string2 = string2;
                                    z5 = z5;
                                    Util.Sleep(5000);
                                    if (i4 == 0) {
                                        i2 = i4;
                                    } else {
                                        if (!z3) {
                                            if (outputStream != null) {
                                                StrageDeviceAccess.StrageStreamClose();
                                            }
                                            return null;
                                        }
                                        if (str3 != null) {
                                            StrageDeviceAccess.sdCardError();
                                        }
                                        mainteCheck();
                                        if (outputStream != null) {
                                            while (!dispReConnectDialog()) {
                                                GameCommon.confirmTerminate();
                                            }
                                        } else {
                                            while (!dispReConnectDialog()) {
                                                GameCommon.confirmTerminate();
                                            }
                                        }
                                        i2 = 3;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    httpConnection2 = httpConnection;
                                    if (inputStreamOpenInputStream != null) {
                                        try {
                                            inputStreamOpenInputStream.close();
                                        } catch (Exception e9) {
                                            throw th;
                                        }
                                    }
                                    if (httpConnection2 == null) {
                                        throw th;
                                    }
                                    httpConnection2.close();
                                    throw th;
                                }
                            } else {
                                HttpConnection httpConnection4 = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 3, true);
                                httpConnection4.setRequestMethod("POST");
                                httpConnection4.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                                OutputStream outputStreamOpenOutputStream2 = httpConnection4.openOutputStream();
                                httpConnection4.setRequestProperty("Content-Length", Integer.toString(bArr.length));
                                outputStreamOpenOutputStream2.write(bArr);
                                outputStreamOpenOutputStream2.flush();
                                outputStreamOpenOutputStream2.close();
                                httpConnection2 = httpConnection4;
                            }
                            httpConnection2.connect();
                            inputStreamOpenInputStream = httpConnection2.openInputStream();
                            length = (int) httpConnection2.getLength();
                            if (length > 0 || length > 153600) {
                                throw new Exception();
                            }
                            if (z2) {
                                GameCommon.loadingCountUp(0, length);
                            }
                            if (bArr2 == null) {
                                bArr2 = new byte[length];
                            }
                            if (outputStreamStrageOutputStream != null) {
                                i = inputStreamOpenInputStream.read(bArr2);
                            } else {
                                i = inputStreamOpenInputStream.read(bArr2, i3, length);
                                dataSize = length;
                            }
                            if (i != length) {
                                throw new Exception();
                            }
                            if (outputStreamStrageOutputStream != null) {
                                outputStreamStrageOutputStream.write(bArr2);
                                z4 = false;
                            } else {
                                z4 = z4;
                            }
                            i3 += i;
                            try {
                                inputStreamOpenInputStream.close();
                                inputStreamOpenInputStream = null;
                                httpConnection2.close();
                                httpConnection2 = null;
                                if (i3 >= dataSize) {
                                    if (outputStreamStrageOutputStream != null) {
                                        StrageDeviceAccess.StrageStreamClose();
                                    }
                                    if (0 != 0) {
                                        try {
                                            inputStreamOpenInputStream.close();
                                            if (0 != 0) {
                                                httpConnection2.close();
                                            }
                                        } catch (Exception e10) {
                                        }
                                    } else if (0 != 0) {
                                        httpConnection2.close();
                                    }
                                    return bArr2;
                                }
                                if (outputStreamStrageOutputStream != null) {
                                    bArr2 = null;
                                }
                            } catch (Exception e11) {
                                z5 = z4;
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                                if (httpConnection2 != null) {
                                    httpConnection2.close();
                                }
                                outputStream = outputStreamStrageOutputStream;
                                string2 = string2;
                                z5 = z5;
                                Util.Sleep(5000);
                                if (i4 == 0) {
                                    i2 = i4;
                                } else {
                                    if (!z3) {
                                        if (outputStream != null) {
                                            StrageDeviceAccess.StrageStreamClose();
                                        }
                                        return null;
                                    }
                                    if (str3 != null) {
                                        StrageDeviceAccess.sdCardError();
                                    }
                                    mainteCheck();
                                    if (outputStream != null) {
                                        while (!dispReConnectDialog()) {
                                            GameCommon.confirmTerminate();
                                        }
                                    } else {
                                        while (!dispReConnectDialog()) {
                                            GameCommon.confirmTerminate();
                                        }
                                    }
                                    i2 = 3;
                                }
                            } catch (UIException e12) {
                                z5 = z4;
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                                if (httpConnection2 != null) {
                                    httpConnection2.close();
                                }
                                outputStream = outputStreamStrageOutputStream;
                                string2 = string2;
                                z5 = z5;
                                Util.Sleep(5000);
                                if (i4 == 0) {
                                    i2 = i4;
                                } else {
                                    if (!z3) {
                                        if (outputStream != null) {
                                            StrageDeviceAccess.StrageStreamClose();
                                        }
                                        return null;
                                    }
                                    if (str3 != null) {
                                        StrageDeviceAccess.sdCardError();
                                    }
                                    mainteCheck();
                                    if (outputStream != null) {
                                        while (!dispReConnectDialog()) {
                                            GameCommon.confirmTerminate();
                                        }
                                    } else {
                                        while (!dispReConnectDialog()) {
                                            GameCommon.confirmTerminate();
                                        }
                                    }
                                    i2 = 3;
                                }
                            }
                        } catch (Exception e13) {
                            z5 = z4;
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream.close();
                            }
                            if (httpConnection2 != null) {
                                httpConnection2.close();
                            }
                            outputStream = outputStreamStrageOutputStream;
                            string2 = string2;
                            z5 = z5;
                            Util.Sleep(5000);
                            if (i4 == 0) {
                                i2 = i4;
                            } else {
                                if (!z3) {
                                    if (outputStream != null) {
                                        StrageDeviceAccess.StrageStreamClose();
                                    }
                                    return null;
                                }
                                if (str3 != null) {
                                    StrageDeviceAccess.sdCardError();
                                }
                                mainteCheck();
                                if (outputStream != null) {
                                    while (!dispReConnectDialog()) {
                                        GameCommon.confirmTerminate();
                                    }
                                } else {
                                    while (!dispReConnectDialog()) {
                                        GameCommon.confirmTerminate();
                                    }
                                }
                                i2 = 3;
                            }
                        } catch (UIException e14) {
                            z5 = z4;
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream.close();
                            }
                            if (httpConnection2 != null) {
                                httpConnection2.close();
                            }
                            outputStream = outputStreamStrageOutputStream;
                            string2 = string2;
                            z5 = z5;
                            Util.Sleep(5000);
                            if (i4 == 0) {
                                i2 = i4;
                            } else {
                                if (!z3) {
                                    if (outputStream != null) {
                                        StrageDeviceAccess.StrageStreamClose();
                                    }
                                    return null;
                                }
                                if (str3 != null) {
                                    StrageDeviceAccess.sdCardError();
                                }
                                mainteCheck();
                                if (outputStream != null) {
                                    while (!dispReConnectDialog()) {
                                        GameCommon.confirmTerminate();
                                    }
                                } else {
                                    while (!dispReConnectDialog()) {
                                        GameCommon.confirmTerminate();
                                    }
                                }
                                i2 = 3;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        if (httpConnection2 == null) {
                            throw th;
                        }
                        httpConnection2.close();
                        throw th;
                    }
                }
            } else {
                try {
                    try {
                        dataSize = getDataSize(str2);
                        if (dataSize < 0) {
                            throw new Exception();
                        }
                        if (str3 == null) {
                            bArr2 = new byte[dataSize];
                        }
                        if (outputStream == null) {
                            outputStreamStrageOutputStream = outputStream;
                            z4 = z5;
                            while (true) {
                                if (!z) {
                                    if (bArr == null) {
                                        httpConnection = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 1, true);
                                        httpConnection.setRequestMethod("GET");
                                        httpConnection2 = httpConnection;
                                    } else {
                                        HttpConnection httpConnection5 = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 3, true);
                                        httpConnection5.setRequestMethod("POST");
                                        httpConnection5.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                                        OutputStream outputStreamOpenOutputStream3 = httpConnection5.openOutputStream();
                                        httpConnection5.setRequestProperty("Content-Length", Integer.toString(bArr.length));
                                        outputStreamOpenOutputStream3.write(bArr);
                                        outputStreamOpenOutputStream3.flush();
                                        outputStreamOpenOutputStream3.close();
                                        httpConnection2 = httpConnection5;
                                    }
                                    httpConnection2.connect();
                                    inputStreamOpenInputStream = httpConnection2.openInputStream();
                                    length = (int) httpConnection2.getLength();
                                    if (length > 0) {
                                    }
                                    throw new Exception();
                                }
                                string2 = new StringBuffer().append("&bytes=").append(i3).append("-").append(Math.min(153600 + i3, dataSize) - 1).toString();
                                if (bArr == null) {
                                    httpConnection = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 1, true);
                                    httpConnection.setRequestMethod("GET");
                                    httpConnection2 = httpConnection;
                                } else {
                                    HttpConnection httpConnection6 = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 3, true);
                                    httpConnection6.setRequestMethod("POST");
                                    httpConnection6.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                                    OutputStream outputStreamOpenOutputStream4 = httpConnection6.openOutputStream();
                                    httpConnection6.setRequestProperty("Content-Length", Integer.toString(bArr.length));
                                    outputStreamOpenOutputStream4.write(bArr);
                                    outputStreamOpenOutputStream4.flush();
                                    outputStreamOpenOutputStream4.close();
                                    httpConnection2 = httpConnection6;
                                }
                                httpConnection2.connect();
                                inputStreamOpenInputStream = httpConnection2.openInputStream();
                                length = (int) httpConnection2.getLength();
                                if (length > 0) {
                                }
                                throw new Exception();
                            }
                        }
                        outputStreamStrageOutputStream = outputStream;
                        z4 = z5;
                        while (true) {
                            if (!z) {
                                if (bArr == null) {
                                    httpConnection = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 1, true);
                                    httpConnection.setRequestMethod("GET");
                                    httpConnection2 = httpConnection;
                                } else {
                                    HttpConnection httpConnection7 = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 3, true);
                                    httpConnection7.setRequestMethod("POST");
                                    httpConnection7.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                                    OutputStream outputStreamOpenOutputStream5 = httpConnection7.openOutputStream();
                                    httpConnection7.setRequestProperty("Content-Length", Integer.toString(bArr.length));
                                    outputStreamOpenOutputStream5.write(bArr);
                                    outputStreamOpenOutputStream5.flush();
                                    outputStreamOpenOutputStream5.close();
                                    httpConnection2 = httpConnection7;
                                }
                                httpConnection2.connect();
                                inputStreamOpenInputStream = httpConnection2.openInputStream();
                                length = (int) httpConnection2.getLength();
                                if (length > 0) {
                                }
                                throw new Exception();
                            }
                            string2 = new StringBuffer().append("&bytes=").append(i3).append("-").append(Math.min(153600 + i3, dataSize) - 1).toString();
                            if (bArr == null) {
                                httpConnection = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 1, true);
                                httpConnection.setRequestMethod("GET");
                                httpConnection2 = httpConnection;
                            } else {
                                HttpConnection httpConnection8 = (HttpConnection) Connector.open(new StringBuffer().append(string).append(string2).toString(), 3, true);
                                httpConnection8.setRequestMethod("POST");
                                httpConnection8.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                                OutputStream outputStreamOpenOutputStream6 = httpConnection8.openOutputStream();
                                httpConnection8.setRequestProperty("Content-Length", Integer.toString(bArr.length));
                                outputStreamOpenOutputStream6.write(bArr);
                                outputStreamOpenOutputStream6.flush();
                                outputStreamOpenOutputStream6.close();
                                httpConnection2 = httpConnection8;
                            }
                            httpConnection2.connect();
                            inputStreamOpenInputStream = httpConnection2.openInputStream();
                            length = (int) httpConnection2.getLength();
                            if (length > 0) {
                            }
                            throw new Exception();
                        }
                    } catch (Exception e15) {
                        inputStreamOpenInputStream = null;
                        outputStreamStrageOutputStream = outputStream;
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        if (httpConnection2 != null) {
                            httpConnection2.close();
                        }
                        outputStream = outputStreamStrageOutputStream;
                        string2 = string2;
                        z5 = z5;
                        Util.Sleep(5000);
                        if (i4 == 0) {
                            i2 = i4;
                        } else {
                            if (!z3) {
                                if (outputStream != null) {
                                    StrageDeviceAccess.StrageStreamClose();
                                }
                                return null;
                            }
                            if (str3 != null) {
                                StrageDeviceAccess.sdCardError();
                            }
                            mainteCheck();
                            if (outputStream != null) {
                                while (!dispReConnectDialog()) {
                                    GameCommon.confirmTerminate();
                                }
                            } else {
                                while (!dispReConnectDialog()) {
                                    GameCommon.confirmTerminate();
                                }
                            }
                            i2 = 3;
                        }
                    } catch (UIException e16) {
                        inputStreamOpenInputStream = null;
                        outputStreamStrageOutputStream = outputStream;
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        if (httpConnection2 != null) {
                            httpConnection2.close();
                        }
                        outputStream = outputStreamStrageOutputStream;
                        string2 = string2;
                        z5 = z5;
                        Util.Sleep(5000);
                        if (i4 == 0) {
                            i2 = i4;
                        } else {
                            if (!z3) {
                                if (outputStream != null) {
                                    StrageDeviceAccess.StrageStreamClose();
                                }
                                return null;
                            }
                            if (str3 != null) {
                                StrageDeviceAccess.sdCardError();
                            }
                            mainteCheck();
                            if (outputStream != null) {
                                while (!dispReConnectDialog()) {
                                    GameCommon.confirmTerminate();
                                }
                            } else {
                                while (!dispReConnectDialog()) {
                                    GameCommon.confirmTerminate();
                                }
                            }
                            i2 = 3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamOpenInputStream = null;
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    if (httpConnection2 == null) {
                        throw th;
                    }
                    httpConnection2.close();
                    throw th;
                }
            }
        }
        if (outputStream != null) {
            StrageDeviceAccess.StrageStreamClose();
        }
        return null;
    }
}
