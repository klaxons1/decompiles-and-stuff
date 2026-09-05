package p000;

import com.docomostar.device.StorageDevice;
import com.docomostar.fs.File;
import com.docomostar.fs.FileNotAccessibleException;
import com.docomostar.fs.FileSystemFullException;
import com.docomostar.fs.Folder;
import com.docomostar.fs.StarStorageService;
import com.docomostar.fs.sd.SDBindingEncryptionAttribute;
import com.docomostar.io.FileDataInput;
import com.docomostar.io.FileEntity;
import com.docomostar.media.MediaImage;
import com.docomostar.media.MediaManager;
import com.docomostar.media.MediaResource;
import com.docomostar.media.MediaSound;
import com.docomostar.opt.device.MediaPlayer;
import com.docomostar.system.PhoneSystem;
import com.docomostar.ui.Dialog;
import com.docomostar.ui.Font;
import com.docomostar.ui.Graphics;
import com.docomostar.ui.Image;
import com.jcraft.jzlib.ZInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class StrageDeviceAccess {
    public static int flashPlay;
    private static JoinData[] joinDataList = null;
    private static InputStream SD_INPUT = null;
    private static OutputStream SD_OUTPUT = null;
    private static FileEntity SD_FILE = null;
    private static ZInputStream SD_ZINPUT = null;

    StrageDeviceAccess() {
    }

    public static void StrageStreamClose() {
        try {
            if (SD_ZINPUT != null) {
                SD_ZINPUT.close();
                SD_ZINPUT = null;
            }
            if (SD_INPUT != null) {
                SD_INPUT.close();
                SD_INPUT = null;
            }
            if (SD_OUTPUT != null) {
                SD_OUTPUT.close();
                SD_OUTPUT = null;
            }
            if (SD_FILE != null) {
                SD_FILE.close();
                SD_FILE = null;
            }
        } catch (Exception e) {
        }
    }

    private static String crc32(byte[] bArr) {
        int i = 0;
        int[] iArr = {0, 1996959894, -301047508, -1727442502, 124634137, 1886057615, -379345611, -1637575261, 249268274, 2044508324, -522852066, -1747789432, 162941995, 2125561021, -407360249, -1866523247, 498536548, 1789927666, -205950648, -2067906082, 450548861, 1843258603, -187386543, -2083289657, 325883990, 1684777152, -43845254, -1973040660, 335633487, 1661365465, -99664541, -1928851979, 997073096, 1281953886, -715111964, -1570279054, 1006888145, 1258607687, -770865667, -1526024853, 901097722, 1119000684, -608450090, -1396901568, 853044451, 1172266101, -589951537, -1412350631, 651767980, 1373503546, -925412992, -1076862698, 565507253, 1454621731, -809855591, -1195530993, 671266974, 1594198024, -972236366, -1324619484, 795835527, 1483230225, -1050600021, -1234817731, 1994146192, 31158534, -1731059524, -271249366, 1907459465, 112637215, -1614814043, -390540237, 2013776290, 251722036, -1777751922, -519137256, 2137656763, 141376813, -1855689577, -429695999, 1802195444, 476864866, -2056965928, -228458418, 1812370925, 453092731, -2113342271, -183516073, 1706088902, 314042704, -1950435094, -54949764, 1658658271, 366619977, -1932296973, -69972891, 1303535960, 984961486, -1547960204, -725929758, 1256170817, 1037604311, -1529756563, -740887301, 1131014506, 879679996, -1385723834, -631195440, 1141124467, 855842277, -1442165665, -586318647, 1342533948, 654459306, -1106571248, -921952122, 1466479909, 544179635, -1184443383, -832445281, 1591671054, 702138776, -1328506846, -942167884, 1504918807, 783551873, -1212326853, -1061524307, -306674912, -1698712650, 62317068, 1957810842, -355121351, -1647151185, 81470997, 1943803523, -480048366, -1805370492, 225274430, 2053790376, -468791541, -1828061283, 167816743, 2097651377, -267414716, -2029476910, 503444072, 1762050814, -144550051, -2140837941, 426522225, 1852507879, -19653770, -1982649376, 282753626, 1742555852, -105259153, -1900089351, 397917763, 1622183637, -690576408, -1580100738, 953729732, 1340076626, -776247311, -1497606297, 1068828381, 1219638859, -670225446, -1358292148, 906185462, 1090812512, -547295293, -1469587627, 829329135, 1181335161, -882789492, -1134132454, 628085408, 1382605366, -871598187, -1156888829, 570562233, 1426400815, -977650754, -1296233688, 733239954, 1555261956, -1026031705, -1244606671, 752459403, 1541320221, -1687895376, -328994266, 1969922972, 40735498, -1677130071, -351390145, 1913087877, 83908371, -1782625662, -491226604, 2075208622, 213261112, -1831694693, -438977011, 2094854071, 198958881, -2032938284, -237706686, 1759359992, 534414190, -2118248755, -155638181, 1873836001, 414664567, -2012718362, -15766928, 1711684554, 285281116, -1889165569, -127750551, 1634467795, 376229701, -1609899400, -686959890, 1308918612, 956543938, -1486412191, -799009033, 1231636301, 1047427035, -1362007478, -640263460, 1088359270, 936918000, -1447252397, -558129467, 1202900863, 817233897, -1111625188, -893730166, 1404277552, 615818150, -1160759803, -841546093, 1423857449, 601450431, -1285129682, -1000256840, 1567103746, 711928724, -1274298825, -1022587231, 1510334235, 755167117, 1};
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 >= bArr.length) {
                return Integer.toHexString(i3);
            }
            i = ((i3 << 8) | bArr[i2]) ^ iArr[(char) ((i3 >> 24) & 255)];
            i2++;
        }
    }

    public static String createJoinFilename(JoinData joinData) {
        if (joinData == null) {
            return null;
        }
        return new StringBuffer().append("Z").append(Util.zero_int(joinData.index, 7)).append(".DAT").toString();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x041a A[PHI: r2 r3 r4
  0x041a: PHI (r2v35 int) = (r2v34 int), (r2v34 int), (r2v83 int) binds: [B:62:0x01cd, B:64:0x01d3, B:66:0x01e0] A[DONT_GENERATE, DONT_INLINE]
  0x041a: PHI (r3v13 int) = (r3v12 int), (r3v12 int), (r3v44 int) binds: [B:62:0x01cd, B:64:0x01d3, B:66:0x01e0] A[DONT_GENERATE, DONT_INLINE]
  0x041a: PHI (r4v20 long) = (r4v19 long), (r4v19 long), (r4v39 long) binds: [B:62:0x01cd, B:64:0x01d3, B:66:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    public static void downloadFileList(String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        strageCheck(0);
        if (Main.MODEL.length() < 2 || Main.MODEL.substring(0, 2).equals("ap") || !isVersionCheck(str)) {
            z = false;
        } else {
            filelistVersionUp(str);
            z = true;
        }
        boolean z2 = true;
        while (true) {
            String[] strArr = {Util.txtDataStrip(new String(readWebStrage(Game.DOWNLOAD_URL, str, 1)))};
            int iS2i = Util.s2i(Util.strtok(strArr, ","));
            try {
                String[] strArr2 = new String[iS2i];
                int[] iArr = new int[iS2i];
                int i6 = 0;
                String[] strArr3 = new String[iS2i];
                int i7 = -1;
                int i8 = 0;
                int i9 = iS2i;
                boolean z3 = z2;
                while (i8 < iS2i) {
                    try {
                        GameCommon.nowLoading(2);
                        strArr2[i8] = Util.strtok(strArr, ",");
                        iArr[i8] = Util.s2i(Util.strtok(strArr, ","));
                        int i10 = 0;
                        try {
                            i10 = Integer.parseInt(strArr2[i8].substring(1, 3));
                        } catch (Exception e) {
                        }
                        if (i10 > 0 && i10 < Game.curList.length && !Game.curList[i10]) {
                            iArr[i8] = 0;
                            i3 = i9 - 1;
                            i4 = i7;
                            i5 = i6;
                        } else if (strArr2[i8].indexOf(".MV") > 0 && strArr2[i8].indexOf(new StringBuffer().append(".MV").append(Game.MOVIE_TYPE).toString()) < 0 && strArr2[i8].indexOf(new StringBuffer().append(".MV").append(Game.STAFFROLL_TYPE).toString()) < 0) {
                            iArr[i8] = 0;
                            i3 = i9 - 1;
                            i4 = i7;
                            i5 = i6;
                        } else if (strArr2[i8].indexOf(".MV") <= 0 || !Main.MODEL.substring(0, 2).equals("ap")) {
                            File fileStream = getFileStream(strArr2[i8], false);
                            if (fileStream == null) {
                                i3 = i9;
                            } else if (fileStream.getLength() == iArr[i8]) {
                                iArr[i8] = 0;
                                i3 = i9 - 1;
                            } else {
                                if (z3) {
                                    if (z) {
                                        Draw2D.drawString("microSDカードのデータファイルが更新されています", 150, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                                        Draw2D.drawString("古いファイルを削除します", 150, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                                    } else {
                                        Draw2D.drawString("microSDカードのデータファイルが破損しています", 150, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                                        Draw2D.drawString("破損ファイルを削除します", 150, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                                    }
                                    GameCommon.dialogWindow(false, 0, true);
                                    z3 = false;
                                }
                                fileStream.delete();
                                i3 = i9;
                            }
                            if (iArr[i8] > 0) {
                                i5 = i6 + (((iArr[i8] / 51200) + 1) * 51200);
                                i4 = i7 + 1;
                                strArr3[i4] = strArr2[i8];
                            } else {
                                i4 = i7;
                                i5 = i6;
                            }
                        } else {
                            iArr[i8] = 0;
                            i3 = i9 - 1;
                            i4 = i7;
                            i5 = i6;
                        }
                        i8++;
                        i7 = i4;
                        i6 = i5;
                        i9 = i3;
                    } catch (Exception e2) {
                        z2 = z3;
                        Network.mainteCheck();
                        strageCheck(0);
                    }
                }
                if (i9 > 0) {
                    Folder folder = getFolder();
                    long freeSize = folder.getFreeSize();
                    int i11 = (i6 + 1023) / 1024;
                    int i12 = i11 >= 1024 ? (i11 + 1023) / 1024 : 0;
                    if (i6 <= freeSize || !sdCardDeleteMovieCheck()) {
                        i = i12;
                        i2 = i11;
                    } else {
                        freeSize = folder.getFreeSize();
                        i11 = (i6 + 1023) / 1024;
                        i12 = 0;
                        if (i11 >= 1024) {
                            i = (i11 + 1023) / 1024;
                            i2 = i11;
                        } else {
                            i = i12;
                            i2 = i11;
                        }
                    }
                    if (Main.MODEL.substring(0, 2).equals("ap") || i6 <= freeSize) {
                        Network.pakehoCheck();
                        while (true) {
                            Draw2D.drawString("microSDカードにデータファイルがありません", 200, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                            Draw2D.drawString("microSDカードにファイルをダウンロードします", 200, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                            if (i > 0) {
                                Draw2D.drawString(new StringBuffer().append("約").append(i).append("MByteのデータをダウンロードします").toString(), 200, 260, 24, GameCommon.K_ANY, 0, 0, 0);
                            } else {
                                Draw2D.drawString(new StringBuffer().append("約").append(i2).append("KByteのデータをダウンロードします").toString(), 200, 260, 24, GameCommon.K_ANY, 0, 0, 0);
                            }
                            int i13 = ((i6 / 140000) / 60) + 1;
                            Draw2D.drawString(new StringBuffer().append("通信時間は約").append(i13).append("〜").append(i13 * 10).append("分かかります").toString(), 200, 290, 24, GameCommon.K_ANY, 0, 0, 0);
                            if (GameCommon.dialogWindow(true, 0, true)) {
                                break;
                            } else {
                                GameCommon.confirmTerminate();
                            }
                        }
                        GameCommon.loadingCountSet(0, i6, 0);
                        Draw2D.fillRect(0, 0, 854, 480, 0, 0, 0, 0);
                        System.currentTimeMillis();
                        if (i7 >= 0 && !Network.tcpAllDownload(Game.DOWNLOAD_URL, strArr3, true)) {
                            Draw2D.drawString("データファイルのダウンロードに失敗しました", 200, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                            Draw2D.drawString("アプリを終了します", 200, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                            GameCommon.dialogWindow(false, 0, true);
                            GameCommon.terminate();
                        }
                        System.currentTimeMillis();
                        Draw2D.fillRect(0, 0, 854, 480, 0, 0, 0, 0);
                    } else {
                        Draw2D.drawString("microSDカードの空き容量が足りません", 200, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                        if (i > 0) {
                            Draw2D.drawString(new StringBuffer().append(i).append("MByte以上の空き容量を確保してください").toString(), 200, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                        } else {
                            Draw2D.drawString(new StringBuffer().append(i2).append("KByte以上の空き容量を確保してください").toString(), 200, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                        }
                        GameCommon.dialogWindow(false, 0, true);
                        GameCommon.confirmTerminate();
                        z2 = z3;
                    }
                }
                joinDataList = new JoinData[Util.s2i(Util.strtok(strArr, ","))];
                for (int i14 = 0; i14 < joinDataList.length; i14++) {
                    joinDataList[i14] = new JoinData();
                    joinDataList[i14].fname = Util.strtok(strArr, ",");
                    joinDataList[i14].org_size = Util.s2i(Util.strtok(strArr, ","));
                    joinDataList[i14].compress = Util.s2i(Util.strtok(strArr, ",")) != 0;
                    joinDataList[i14].zlib_size = Util.s2i(Util.strtok(strArr, ","));
                    joinDataList[i14].index = Util.s2i(Util.strtok(strArr, ","));
                    joinDataList[i14].offset = Util.s2i(Util.strtok(strArr, ","));
                }
                return;
            } catch (Exception e3) {
            }
        }
    }

    private static int drawName(Image image, String str) {
        Graphics graphics = image.getGraphics();
        graphics.setFont(Font.getFont(1896873984, 24));
        graphics.setColor(Graphics.getColorOfRGB(0, 0, 0));
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
        if (str.length() > 0) {
            image.setTransparentEnabled(false);
            if (str.charAt(0) == '@') {
                graphics.setColor(Graphics.getColorOfRGB(255, 128, 16));
                graphics.drawString(str.substring(1), 6, 24);
                image.setTransparentEnabled(true);
                return 1;
            }
            if (str.length() > 0 && str.charAt(0) == '$') {
                graphics.setColor(Graphics.getColorOfRGB(255, 255, 16));
                graphics.drawString(str.substring(1), 6, 24);
                return 2;
            }
            if (str.length() <= 0 || str.charAt(0) != '#') {
                graphics.setColor(Graphics.getColorOfRGB(255, 255, 255));
                graphics.drawString(str, 12, 24);
                return 3;
            }
            if (str.charAt(1) == '1') {
                return 4;
            }
            if (str.charAt(1) == '2') {
                return 5;
            }
            if (str.charAt(1) == '3') {
                return 6;
            }
        }
        return 0;
    }

    public static void filelistVersionUp(String str) {
        strageCheck(0);
        try {
            File fileStream = getFileStream(str, false);
            if (fileStream != null) {
                fileStream.delete();
            }
        } catch (Exception e) {
        }
        strageCheck(51200);
        readWebStrage(Game.DOWNLOAD_URL, str, 1);
    }

    public static File getFileStream(String str, boolean z) {
        try {
            Folder folder = getFolder();
            try {
                return folder.getFile(str);
            } catch (FileNotAccessibleException e) {
                if (!z || e.getStatus() != 1) {
                    return null;
                }
                SDBindingEncryptionAttribute[] sDBindingEncryptionAttributeArr = {new SDBindingEncryptionAttribute()};
                sDBindingEncryptionAttributeArr[0].setEncryption(true);
                sDBindingEncryptionAttributeArr[0].setBlockSize(65536);
                return folder.createFile(str, sDBindingEncryptionAttributeArr);
            }
        } catch (Exception e2) {
            return null;
        }
    }

    private static Folder getFolder() throws Exception {
        while (true) {
            try {
                return StorageDevice.getInstance("/ext0").getFolder(StarStorageService.getAccessToken(0, 8));
            } catch (FileSystemFullException e) {
                sdCardFullErr();
            }
        }
    }

    public static JoinData getJoinData(String str) {
        if (joinDataList == null) {
            return null;
        }
        for (int i = 0; i < joinDataList.length; i++) {
            if (joinDataList[i].fname.equalsIgnoreCase(str)) {
                return joinDataList[i];
            }
        }
        return null;
    }

    public static boolean isVersionCheck(String str) {
        String crcString;
        if (getFileStream(str, false) == null) {
            return true;
        }
        int i = 3;
        while (true) {
            crcString = Network.getCrcString(str);
            if (crcString != null) {
                break;
            }
            if (i < 0) {
                if (!Network.dispReConnectDialog()) {
                    Draw2D.drawString("データファイルのダウンロードに失敗しました", 200, 180, 24, GameCommon.K_ANY, 0, 0, 0);
                    Draw2D.drawString("アプリを終了します", 200, 210, 24, GameCommon.K_ANY, 0, 0, 0);
                    GameCommon.dialogWindow(false, 0, true);
                    GameCommon.terminate();
                }
                i = 3;
            }
            i--;
        }
        return !crcString.equalsIgnoreCase(crc32(readStrage(str)));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x033e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0628 A[Catch: Exception -> 0x0664, TryCatch #16 {Exception -> 0x0664, blocks: (B:188:0x0623, B:190:0x0628, B:192:0x062d, B:193:0x0637), top: B:241:0x0623 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x062d A[Catch: Exception -> 0x0664, TryCatch #16 {Exception -> 0x0664, blocks: (B:188:0x0623, B:190:0x0628, B:192:0x062d, B:193:0x0637), top: B:241:0x0623 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x0623 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:? A[RETURN, SYNTHETIC] */
    public static void playMovie(String str, boolean z) {
        File fileStream;
        boolean z2;
        File fileStream2;
        MediaSound[] mediaSoundArr;
        FileDataInput fileDataInputOpenDataInput;
        FileEntity fileEntityOpen;
        Throwable th;
        MediaSound[] mediaSoundArr2;
        MediaSound[] mediaSoundArr3;
        int i;
        int i2;
        long jCurrentTimeMillis;
        int i3;
        long j;
        int i4;
        int i5;
        MediaImage mediaImage;
        String string = new StringBuffer().append(str).append(".MV").append(Game.MOVIE_TYPE).toString();
        strageCheck(0);
        if (getFileStream(string, false) == null) {
            Dialog dialog = new Dialog(2, "データエラー");
            dialog.setText("ムービーファイルがダウンロードされていません");
            GameCommon.dialogShow(dialog);
            return;
        }
        if (Game.MOVIE_TYPE == 1 || Game.MOVIE_TYPE == 2) {
            GameCommon.end3D();
            GameCommon.f54g.clearRect(0, 0, 854, 480);
            GameCommon.f54g.unlock(true);
            GameCommon.f54g.lock();
            GameCommon.begin3D();
            Sound.soundStop(0);
            MediaPlayer mediaPlayer = MediaPlayer.getMediaPlayer();
            while (true) {
                fileStream = getFileStream(string, false);
                if (fileStream != null) {
                    break;
                } else {
                    strageCheck(0);
                }
            }
            boolean z3 = true;
            long j2 = 0;
            while (z3) {
                try {
                    int iPlay = mediaPlayer.play(fileStream, j2);
                    switch (iPlay) {
                        case 1:
                        case 97:
                        case 98:
                            Draw2D.drawString("ムービーをスキップしますか？", 250, 240, 24, GameCommon.K_ANY, 0, 0, 0);
                            if (!GameCommon.dialogWindow(true, 1, true)) {
                                long lastStoppedPosition = iPlay == 1 ? mediaPlayer.getLastStoppedPosition() : 0L;
                                GameCommon.f54g.lock();
                                GameCommon.begin3D();
                                j2 = lastStoppedPosition;
                            } else if (iPlay != 1 || !string.equals(new StringBuffer().append("V0710000.MV").append(Game.MOVIE_TYPE).toString()) || mediaPlayer.getLastStoppedPosition() >= 80000 || mediaPlayer.getLastStoppedPosition() <= 0) {
                                z2 = false;
                            } else {
                                GameCommon.f54g.lock();
                                GameCommon.begin3D();
                                j2 = 80000;
                            }
                            break;
                        case 2:
                        case 4:
                            z2 = false;
                            break;
                        case 3:
                            GameCommon.f54g.lock();
                            GameCommon.begin3D();
                            j2 = 0;
                            continue;
                        default:
                            z2 = z3;
                            break;
                    }
                    GameCommon.f54g.lock();
                    GameCommon.begin3D();
                    z3 = z2;
                } catch (Exception e) {
                    GameCommon.f54g.lock();
                    GameCommon.begin3D();
                } catch (Throwable th2) {
                    GameCommon.f54g.lock();
                    GameCommon.begin3D();
                    throw th2;
                }
            }
        } else {
            FileEntity fileEntity = null;
            FileDataInput fileDataInput = null;
            while (true) {
                fileStream2 = getFileStream(string, false);
                if (fileStream2 != null) {
                    break;
                } else {
                    strageCheck(0);
                }
            }
            System.gc();
            Game.memoryPrint("M0");
            MediaImage image = null;
            int i6 = 0;
            boolean z4 = GameStatus.GAME.volumeView;
            try {
                try {
                    GameStatus.sdCardAccess = true;
                    fileEntityOpen = fileStream2.open(0);
                    try {
                        fileDataInputOpenDataInput = fileEntityOpen.openDataInput();
                        try {
                            fileEntityOpen.setBufferSize(524288);
                            int i7 = fileDataInputOpenDataInput.readInt();
                            int i8 = fileDataInputOpenDataInput.readInt();
                            int i9 = i7 - (i8 + 1);
                            byte[] bArr = new byte[fileDataInputOpenDataInput.readInt()];
                            short s = fileDataInputOpenDataInput.readShort();
                            short s2 = fileDataInputOpenDataInput.readShort();
                            int i10 = 1024000 / fileDataInputOpenDataInput.readByte();
                            byte[] bArr2 = new byte[fileDataInputOpenDataInput.readInt()];
                            fileDataInputOpenDataInput.readFully(bArr2);
                            String[] strArr = {Util.txtDataStrip(new String(bArr2))};
                            int i11 = 0;
                            for (int i12 = 0; i12 < strArr[0].length(); i12++) {
                                if (strArr[0].charAt(i12) == ',') {
                                    i11++;
                                }
                            }
                            int i13 = i11 / 4;
                            String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, i13, 2);
                            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i13, 2);
                            for (int i14 = 0; i14 < i13; i14++) {
                                iArr[i14][0] = Util.s2i(Util.strtok(strArr, ","));
                                iArr[i14][1] = Util.s2i(Util.strtok(strArr, ","));
                                strArr2[i14][0] = Util.strtok(strArr, ",");
                                strArr2[i14][1] = Util.strtok(strArr, ",");
                            }
                            int i15 = -1;
                            mediaSoundArr = new MediaSound[i8];
                            for (int i16 = 0; i16 < i8; i16++) {
                                try {
                                    byte[] bArr3 = new byte[fileDataInputOpenDataInput.readInt()];
                                    fileDataInputOpenDataInput.readFully(bArr3);
                                    mediaSoundArr[i16] = MediaManager.getSound(bArr3);
                                    mediaSoundArr[i16].use((MediaResource) null, true);
                                } catch (Exception e2) {
                                    mediaSoundArr3 = mediaSoundArr;
                                    fileDataInput = fileDataInputOpenDataInput;
                                    fileEntity = fileEntityOpen;
                                    try {
                                        Game.memoryPrint("M1");
                                        Sound.soundStop(0);
                                        Sound.soundStop(1);
                                        Sound.init();
                                        GameStatus.GAME.volumeView = z4;
                                        if (fileDataInput != null) {
                                            try {
                                                fileDataInput.close();
                                            } catch (Exception e3) {
                                                GameStatus.sdCardAccess = false;
                                                if (string.equals(new StringBuffer().append("V0810000.MV").append(Game.MOVIE_TYPE).toString())) {
                                                    staffRoll();
                                                    playMovie("V0820000", z);
                                                }
                                            }
                                        }
                                        if (fileEntity != null) {
                                            fileEntity.close();
                                        }
                                        if (image != null) {
                                            image.getImage().dispose();
                                            image.unuse();
                                        }
                                        Util.FreeData(mediaSoundArr3, 2);
                                        GameCommon.SOFT_MENU_SET(0, 0);
                                        GameCommon.f54g.lock();
                                        GameCommon.f54g.clearRect(0, 0, 854, 480);
                                        GameCommon.f54g.unlock(true);
                                        GameCommon.f54g.lock();
                                        GameCommon.begin3D();
                                        GameStatus.sdCardAccess = false;
                                        if (string.equals(new StringBuffer().append("V0810000.MV").append(Game.MOVIE_TYPE).toString())) {
                                            staffRoll();
                                            playMovie("V0820000", z);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        mediaSoundArr2 = mediaSoundArr3;
                                        fileDataInputOpenDataInput = fileDataInput;
                                        fileEntityOpen = fileEntity;
                                        Sound.soundStop(0);
                                        Sound.soundStop(1);
                                        Sound.init();
                                        GameStatus.GAME.volumeView = z4;
                                        if (fileDataInputOpenDataInput != null) {
                                            try {
                                                fileDataInputOpenDataInput.close();
                                            } catch (Exception e4) {
                                                GameStatus.sdCardAccess = false;
                                                throw th;
                                            }
                                        }
                                        if (fileEntityOpen != null) {
                                            fileEntityOpen.close();
                                        }
                                        if (image != null) {
                                            image.getImage().dispose();
                                            image.unuse();
                                        }
                                        Util.FreeData(mediaSoundArr2, 2);
                                        GameCommon.SOFT_MENU_SET(0, 0);
                                        GameCommon.f54g.lock();
                                        GameCommon.f54g.clearRect(0, 0, 854, 480);
                                        GameCommon.f54g.unlock(true);
                                        GameCommon.f54g.lock();
                                        GameCommon.begin3D();
                                        GameStatus.sdCardAccess = false;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    Game.memoryPrint("M2");
                                    Sound.soundStop(0);
                                    Sound.soundStop(1);
                                    Sound.init();
                                    GameStatus.GAME.volumeView = z4;
                                    if (fileDataInputOpenDataInput != null) {
                                        try {
                                            fileDataInputOpenDataInput.close();
                                        } catch (Exception e5) {
                                            GameStatus.sdCardAccess = false;
                                            if (string.equals(new StringBuffer().append("V0810000.MV").append(Game.MOVIE_TYPE).toString())) {
                                                staffRoll();
                                                playMovie("V0820000", z);
                                            }
                                        }
                                    }
                                    if (fileEntityOpen != null) {
                                        fileEntityOpen.close();
                                    }
                                    if (image != null) {
                                        image.getImage().dispose();
                                        image.unuse();
                                    }
                                    Util.FreeData(mediaSoundArr, 2);
                                    GameCommon.SOFT_MENU_SET(0, 0);
                                    GameCommon.f54g.lock();
                                    GameCommon.f54g.clearRect(0, 0, 854, 480);
                                    GameCommon.f54g.unlock(true);
                                    GameCommon.f54g.lock();
                                    GameCommon.begin3D();
                                    GameStatus.sdCardAccess = false;
                                    if (string.equals(new StringBuffer().append("V0810000.MV").append(Game.MOVIE_TYPE).toString())) {
                                        staffRoll();
                                        playMovie("V0820000", z);
                                    }
                                }
                            }
                            MediaImage mediaImageCreateMediaImage = MediaManager.createMediaImage(s, s2);
                            System.gc();
                            GameCommon.SOFT_MENU_SET(3, 0);
                            GameCommon.resetAllKey();
                            GameCommon.end3D();
                            GameCommon.f54g.clearRect(0, 0, 854, 480);
                            GameCommon.f54g.unlock(true);
                            long jCurrentTimeMillis2 = System.currentTimeMillis() << 10;
                            int i17 = 0;
                            int i18 = 0;
                            int i19 = 1;
                            int i20 = 0;
                            int i21 = -1;
                            int i22 = 0;
                            int i23 = 0;
                            long j3 = jCurrentTimeMillis2;
                            long jCurrentTimeMillis3 = jCurrentTimeMillis2;
                            while (i23 < i9) {
                                GameStatus.GAME.volumeView = true;
                                if (i6 >= i8 || i17 > i23 * i10) {
                                    i = i19;
                                    i2 = i17;
                                } else {
                                    int i24 = i19 ^ 1;
                                    int i25 = i6 + 1;
                                    int iMovieBgm = (Sound.movieBgm(i24, mediaSoundArr[i6]) << 10) + i17;
                                    if (i21 > 0 && iMovieBgm < i21 * i10) {
                                        Sound.soundStop(i24);
                                    }
                                    i = i24;
                                    i18 = i17;
                                    i2 = iMovieBgm;
                                    i6 = i25;
                                }
                                if (PhoneSystem.getAttribute(9) == 0) {
                                    Sound.soundPause(i, true);
                                    while (PhoneSystem.getAttribute(9) == 0) {
                                        Util.Sleep(400);
                                    }
                                    Sound.soundPause(i, false);
                                    jCurrentTimeMillis = System.currentTimeMillis() << 10;
                                    j3 = jCurrentTimeMillis - ((long) (i23 * i10));
                                } else {
                                    jCurrentTimeMillis = jCurrentTimeMillis3;
                                }
                                long j4 = jCurrentTimeMillis + ((long) i10);
                                int i26 = fileDataInputOpenDataInput.readInt();
                                if (GameCommon.KEY_STATE[GameCommon.CONF_MENU_SYSTEM_KEY] != 0 || GameCommon.KEY_STATE[GameCommon.CONF_MENU_COMMAND_KEY] != 0) {
                                    if (!string.equals(new StringBuffer().append("V0710000.MV").append(Game.MOVIE_TYPE).toString()) || i23 >= 1200) {
                                        break;
                                    }
                                    Sound.soundStop(0);
                                    Sound.soundStop(1);
                                    i21 = 1200;
                                }
                                if (i21 >= 0 && i21 > i23) {
                                    fileDataInputOpenDataInput.skipBytes(i26);
                                    jCurrentTimeMillis3 = System.currentTimeMillis() << 10;
                                    j = jCurrentTimeMillis3 - ((long) (i23 * i10));
                                    i3 = (i20 >= iArr.length || iArr[i20][1] > i23) ? i20 : i20 + 1;
                                    if (i22 >= iArr.length || iArr[i22][0] > i23) {
                                        i4 = i15;
                                        i5 = i22;
                                        mediaImage = image;
                                    } else {
                                        i5 = i22 + 1;
                                        i4 = i15;
                                        mediaImage = image;
                                    }
                                } else if ((System.currentTimeMillis() << 10) <= j4) {
                                    if (i26 > 0) {
                                        fileDataInputOpenDataInput.readFully(bArr, 0, i26);
                                        image = MediaManager.getImage(bArr);
                                        image.use(mediaImageCreateMediaImage, true);
                                    }
                                    GameCommon.f54g.lock();
                                    if (i26 > 0) {
                                        GameCommon.f54g.drawScaledImage(image.getImage(), 427 - s, 60, s << 1, s2 << 1, 0, 0, s, s2);
                                    }
                                    if (i20 >= iArr.length || iArr[i20][1] > i23) {
                                        i3 = i20;
                                    } else {
                                        GameCommon.f54g.setColor(Graphics.getColorOfRGB(0, 0, 0));
                                        GameCommon.f54g.fillRect(50, 370, 754, 80);
                                        i3 = i20 + 1;
                                    }
                                    if (i22 >= iArr.length || iArr[i22][0] > i23) {
                                        i5 = i22;
                                    } else {
                                        Draw2D.setFont(30);
                                        GameCommon.f54g.setColor(Graphics.getColorOfRGB(0, 0, 0));
                                        GameCommon.f54g.fillRect(50, 370, 754, 80);
                                        GameCommon.f54g.setColor(Graphics.getColorOfRGB(255, 255, 255));
                                        if (strArr2[i22][1] == null || strArr2[i22][1].length() <= 0) {
                                            GameCommon.f54g.drawString(strArr2[i22][0], (854 - Draw2D.getFont().stringWidth(strArr2[i22][0])) / 2, 446);
                                        } else {
                                            int iMax = Math.max(Draw2D.getFont().stringWidth(strArr2[i22][0]), Draw2D.getFont().stringWidth(strArr2[i22][1]));
                                            GameCommon.f54g.drawString(strArr2[i22][0], (854 - iMax) / 2, 406);
                                            GameCommon.f54g.drawString(strArr2[i22][1], (854 - iMax) / 2, 446);
                                        }
                                        i5 = i22 + 1;
                                    }
                                    if (i15 != GameStatus.systemData[2]) {
                                        i4 = GameStatus.systemData[2];
                                        GameCommon.drawSoftKey();
                                    } else {
                                        i4 = i15;
                                    }
                                    GameCommon.f54g.unlock(true);
                                    while (j4 > (System.currentTimeMillis() << 10)) {
                                    }
                                    j = j3;
                                    jCurrentTimeMillis3 = j4;
                                    mediaImageCreateMediaImage = image;
                                    mediaImage = image;
                                } else {
                                    fileDataInputOpenDataInput.skipBytes(i26);
                                    if ((System.currentTimeMillis() << 10) - j3 > (Sound.playTime(i) << 10) + i18) {
                                        jCurrentTimeMillis3 = System.currentTimeMillis() << 10;
                                        j = jCurrentTimeMillis3 - ((long) (i23 * i10));
                                        i3 = i20;
                                        i4 = i15;
                                        i5 = i22;
                                        mediaImage = image;
                                    } else {
                                        i3 = i20;
                                        j = j3;
                                        jCurrentTimeMillis3 = j4;
                                        i4 = i15;
                                        i5 = i22;
                                        mediaImage = image;
                                    }
                                }
                                i23++;
                                i20 = i3;
                                i19 = i;
                                i17 = i2;
                                j3 = j;
                                i15 = i4;
                                i22 = i5;
                                image = mediaImage;
                            }
                            Sound.soundStop(0);
                            Sound.soundStop(1);
                            Sound.init();
                            GameStatus.GAME.volumeView = z4;
                            if (fileDataInputOpenDataInput != null) {
                                try {
                                    fileDataInputOpenDataInput.close();
                                } catch (Exception e6) {
                                }
                            }
                            if (fileEntityOpen != null) {
                                fileEntityOpen.close();
                            }
                            if (image != null) {
                                image.getImage().dispose();
                                image.unuse();
                            }
                            Util.FreeData(mediaSoundArr, 2);
                            GameCommon.SOFT_MENU_SET(0, 0);
                            GameCommon.f54g.lock();
                            GameCommon.f54g.clearRect(0, 0, 854, 480);
                            GameCommon.f54g.unlock(true);
                            GameCommon.f54g.lock();
                            GameCommon.begin3D();
                            GameStatus.sdCardAccess = false;
                        } catch (Exception e7) {
                            mediaSoundArr3 = null;
                            fileDataInput = fileDataInputOpenDataInput;
                            fileEntity = fileEntityOpen;
                        } catch (Throwable th5) {
                            th = th5;
                            mediaSoundArr2 = null;
                            Sound.soundStop(0);
                            Sound.soundStop(1);
                            Sound.init();
                            GameStatus.GAME.volumeView = z4;
                            if (fileDataInputOpenDataInput != null) {
                                fileDataInputOpenDataInput.close();
                            }
                            if (fileEntityOpen != null) {
                                fileEntityOpen.close();
                            }
                            if (image != null) {
                                image.getImage().dispose();
                                image.unuse();
                            }
                            Util.FreeData(mediaSoundArr2, 2);
                            GameCommon.SOFT_MENU_SET(0, 0);
                            GameCommon.f54g.lock();
                            GameCommon.f54g.clearRect(0, 0, 854, 480);
                            GameCommon.f54g.unlock(true);
                            GameCommon.f54g.lock();
                            GameCommon.begin3D();
                            GameStatus.sdCardAccess = false;
                            throw th;
                        }
                    } catch (Exception e8) {
                        mediaSoundArr3 = null;
                        fileEntity = fileEntityOpen;
                    } catch (Throwable th6) {
                        th = th6;
                        mediaSoundArr2 = null;
                        fileDataInputOpenDataInput = null;
                    }
                } catch (Exception e9) {
                    mediaSoundArr3 = null;
                } catch (Throwable th7) {
                    mediaSoundArr = null;
                    fileDataInputOpenDataInput = null;
                    fileEntityOpen = null;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
        if (string.equals(new StringBuffer().append("V0810000.MV").append(Game.MOVIE_TYPE).toString())) {
            staffRoll();
            playMovie("V0820000", z);
        }
    }

    public static byte[] readStrage(String str) {
        byte[] bArr = null;
        try {
            JoinData joinData = getJoinData(str);
            if (joinData == null) {
                File fileStream = getFileStream(str, false);
                if (fileStream != null) {
                    bArr = new byte[(int) fileStream.getLength()];
                    FileEntity fileEntityOpen = fileStream.open(0);
                    InputStream inputStreamOpenInputStream = fileEntityOpen.openInputStream();
                    inputStreamOpenInputStream.read(bArr);
                    inputStreamOpenInputStream.close();
                    fileEntityOpen.close();
                }
            } else {
                File fileStream2 = getFileStream(createJoinFilename(joinData), false);
                if (fileStream2 != null) {
                    FileEntity fileEntityOpen2 = fileStream2.open(0);
                    InputStream inputStreamOpenInputStream2 = fileEntityOpen2.openInputStream();
                    inputStreamOpenInputStream2.skip(joinData.offset);
                    if (joinData.compress) {
                        ZInputStream zInputStream = new ZInputStream(inputStreamOpenInputStream2);
                        if (joinData.org_size < 65536) {
                            zInputStream.setBufferSize(joinData.org_size + 1);
                        } else {
                            zInputStream.setBufferSize(65536);
                        }
                        bArr = zInputStream.read(0, joinData.org_size);
                        zInputStream.close();
                    } else {
                        bArr = new byte[joinData.org_size];
                        inputStreamOpenInputStream2.read(bArr);
                    }
                    inputStreamOpenInputStream2.close();
                    fileEntityOpen2.close();
                }
            }
        } catch (Exception e) {
        } finally {
            StrageStreamClose();
        }
        return bArr;
    }

    public static byte[] readWebStrage(String str, String str2, int i) {
        byte[] strage = readStrage(str2);
        if (strage == null) {
            if (i == 2) {
                Network.tcpDownload(new StringBuffer().append(str).append(str2).toString(), str2, false);
                strage = readStrage(str2);
            } else {
                Network.tcpDownload(new StringBuffer().append(str).append(str2).toString(), str2, false);
                strage = readStrage(str2);
            }
            StrageStreamClose();
        }
        return strage;
    }

    public static boolean sdCardAccessCheck() {
        StorageDevice storageDevice = StorageDevice.getInstance("/ext0");
        return storageDevice.isAccessible() && storageDevice.isReadable() && storageDevice.isWritable();
    }

    public static void sdCardAccessErr() {
        Dialog dialog = new Dialog(2, "microSDカードエラー");
        dialog.setText("microSDカードにアクセスできません\nmicroSDカードを確認してください");
        GameCommon.dialogShow(dialog);
        GameCommon.confirmTerminate();
    }

    public static boolean sdCardDeleteMovieCheck() {
        boolean z;
        try {
            File[] files = getFolder().getFiles();
            int i = 0;
            while (true) {
                if (i >= files.length) {
                    z = false;
                    break;
                }
                if (files[i].getPath().indexOf(".MV") > 0 && files[i].getPath().indexOf(new StringBuffer().append(".MV").append(Game.MOVIE_TYPE).toString()) < 0 && files[i].getPath().indexOf(new StringBuffer().append(".MV").append(Game.STAFFROLL_TYPE).toString()) < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                Dialog dialog = new Dialog(3, "削除確認");
                dialog.setText("microSDカードの空き容量が足りません\n他の機種用のKINGDOM HEARTS coded ムービーデータが\n存在しますが削除してもよろしいですか？");
                if (GameCommon.dialogShow(dialog) == 4) {
                    for (int i2 = 0; i2 < files.length; i2++) {
                        if (files[i2].getPath().indexOf(".MV") > 0 && files[i2].getPath().indexOf(new StringBuffer().append(".MV").append(Game.MOVIE_TYPE).toString()) < 0 && files[i2].getPath().indexOf(new StringBuffer().append(".MV").append(Game.STAFFROLL_TYPE).toString()) < 0) {
                            files[i2].delete();
                        }
                    }
                    return true;
                }
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static void sdCardError() {
        Dialog dialog = new Dialog(2, "microSDカードエラー");
        dialog.setText("microSDカードに異常が発生しました\nアプリを終了します。");
        GameCommon.dialogShow(dialog);
        GameCommon.terminate();
    }

    public static void sdCardFullErr() {
        Dialog dialog = new Dialog(2, "microSDカードエラー");
        dialog.setText("microSDカードの空き容量が足りません\n空き容量を確保してください");
        GameCommon.dialogShow(dialog);
        GameCommon.confirmTerminate();
    }

    /* JADX WARN: Code duplicated, block: B:160:0x048b A[Catch: Exception -> 0x071e, TryCatch #10 {Exception -> 0x071e, blocks: (B:158:0x0486, B:160:0x048b, B:161:0x048e, B:163:0x0496, B:164:0x04a0), top: B:275:0x0486 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0496 A[Catch: Exception -> 0x071e, TryCatch #10 {Exception -> 0x071e, blocks: (B:158:0x0486, B:160:0x048b, B:161:0x048e, B:163:0x0496, B:164:0x04a0), top: B:275:0x0486 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0508 A[Catch: Exception -> 0x06fd, TryCatch #12 {Exception -> 0x06fd, blocks: (B:176:0x0503, B:178:0x0508, B:179:0x050b, B:181:0x0513, B:182:0x051d), top: B:277:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0513 A[Catch: Exception -> 0x06fd, TryCatch #12 {Exception -> 0x06fd, blocks: (B:176:0x0503, B:178:0x0508, B:179:0x050b, B:181:0x0513, B:182:0x051d), top: B:277:0x0503 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0486 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0503 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0228 A[Catch: Exception -> 0x0734, TryCatch #5 {Exception -> 0x0734, blocks: (B:62:0x0223, B:64:0x0228, B:65:0x022b, B:67:0x0233, B:68:0x023d), top: B:273:0x0223 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0233 A[Catch: Exception -> 0x0734, TryCatch #5 {Exception -> 0x0734, blocks: (B:62:0x0223, B:64:0x0228, B:65:0x022b, B:67:0x0233, B:68:0x023d), top: B:273:0x0223 }] */
    public static void staffRoll() throws Throwable {
        File fileStream;
        Throwable th;
        MediaSound[] mediaSoundArr;
        FileDataInput fileDataInputOpenDataInput;
        FileEntity fileEntityOpen;
        MediaSound[] mediaSoundArr2;
        FileEntity fileEntity;
        long j;
        long jCurrentTimeMillis;
        int i;
        MediaImage mediaImage;
        int i2;
        int i3;
        int i4;
        Graphics graphics = GameCommon.f54g;
        String string = new StringBuffer().append("V0890000.MV").append(Game.STAFFROLL_TYPE).toString();
        strageCheck(0);
        if (getFileStream(string, false) == null) {
            Dialog dialog = new Dialog(2, "データエラー");
            dialog.setText("データがダウンロードされていません");
            readWebStrage(Game.DOWNLOAD_URL, string, 2);
            GameCommon.dialogShow(dialog);
            GameCommon.resetAllKey();
            return;
        }
        FileDataInput fileDataInput = null;
        while (true) {
            fileStream = getFileStream(string, false);
            if (fileStream != null) {
                break;
            } else {
                strageCheck(0);
            }
        }
        System.gc();
        MediaImage image = null;
        Image[] imageArr = new Image[16];
        Image[] imageArr2 = new Image[2];
        int[] iArr = new int[16];
        int i5 = 0;
        int i6 = 100;
        boolean z = GameStatus.GAME.volumeView;
        try {
            try {
                GameStatus.sdCardAccess = true;
                fileEntityOpen = fileStream.open(0);
                try {
                    fileDataInputOpenDataInput = fileEntityOpen.openDataInput();
                    try {
                        fileEntityOpen.setBufferSize(524288);
                        int i7 = fileDataInputOpenDataInput.readInt();
                        int i8 = fileDataInputOpenDataInput.readInt();
                        int length = i7 - ((i8 + 1) + imageArr2.length);
                        byte[] bArr = new byte[fileDataInputOpenDataInput.readInt()];
                        short s = fileDataInputOpenDataInput.readShort();
                        short s2 = fileDataInputOpenDataInput.readShort();
                        int i9 = 1024000 / fileDataInputOpenDataInput.readByte();
                        byte[] bArr2 = new byte[fileDataInputOpenDataInput.readInt()];
                        fileDataInputOpenDataInput.readFully(bArr2);
                        String[] strArr = {Util.delchar(new String(bArr2), '\r')};
                        int i10 = 0;
                        for (int i11 = 0; i11 < strArr[0].length(); i11++) {
                            if (strArr[0].charAt(i11) == '\n') {
                                i10++;
                            }
                        }
                        String[] strArr2 = new String[i10];
                        for (int i12 = 0; i12 < i10; i12++) {
                            strArr2[i12] = Util.strtok(strArr, "\n");
                        }
                        int i13 = -1;
                        mediaSoundArr = new MediaSound[i8];
                        for (int i14 = 0; i14 < i8; i14++) {
                            try {
                                byte[] bArr3 = new byte[fileDataInputOpenDataInput.readInt()];
                                fileDataInputOpenDataInput.readFully(bArr3);
                                mediaSoundArr[i14] = MediaManager.getSound(bArr3);
                                mediaSoundArr[i14].use((MediaResource) null, true);
                            } catch (Exception e) {
                                mediaSoundArr2 = mediaSoundArr;
                                fileDataInput = fileDataInputOpenDataInput;
                                fileEntity = fileEntityOpen;
                                try {
                                    Game.memoryPrint("M1");
                                    Sound.soundStop(0);
                                    Sound.soundStop(1);
                                    Sound.setVolume();
                                    Sound.init();
                                    GameStatus.GAME.volumeView = z;
                                    if (fileDataInput != null) {
                                        try {
                                            fileDataInput.close();
                                        } catch (Exception e2) {
                                            GameStatus.sdCardAccess = false;
                                            return;
                                        }
                                    }
                                    if (fileEntity != null) {
                                        fileEntity.close();
                                    }
                                    Util.FreeData(imageArr, 0);
                                    if (image != null) {
                                        image.getImage().dispose();
                                        image.unuse();
                                    }
                                    Util.FreeData(imageArr2, 0);
                                    Util.FreeData(mediaSoundArr2, 2);
                                    GameCommon.SOFT_MENU_SET(0, 0);
                                    GameCommon.f54g.lock();
                                    GameCommon.f54g.clearRect(0, 0, 854, 480);
                                    GameCommon.f54g.unlock(true);
                                    GameCommon.f54g.lock();
                                    GameCommon.begin3D();
                                    GameStatus.sdCardAccess = false;
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mediaSoundArr = mediaSoundArr2;
                                    fileDataInputOpenDataInput = fileDataInput;
                                    fileEntityOpen = fileEntity;
                                    Sound.soundStop(0);
                                    Sound.soundStop(1);
                                    Sound.setVolume();
                                    Sound.init();
                                    GameStatus.GAME.volumeView = z;
                                    if (fileDataInputOpenDataInput != null) {
                                        try {
                                            fileDataInputOpenDataInput.close();
                                        } catch (Exception e3) {
                                            GameStatus.sdCardAccess = false;
                                            throw th;
                                        }
                                    }
                                    if (fileEntityOpen != null) {
                                        fileEntityOpen.close();
                                    }
                                    Util.FreeData(imageArr, 0);
                                    if (image != null) {
                                        image.getImage().dispose();
                                        image.unuse();
                                    }
                                    Util.FreeData(imageArr2, 0);
                                    Util.FreeData(mediaSoundArr, 2);
                                    GameCommon.SOFT_MENU_SET(0, 0);
                                    GameCommon.f54g.lock();
                                    GameCommon.f54g.clearRect(0, 0, 854, 480);
                                    GameCommon.f54g.unlock(true);
                                    GameCommon.f54g.lock();
                                    GameCommon.begin3D();
                                    GameStatus.sdCardAccess = false;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                Game.memoryPrint("M2");
                                Sound.soundStop(0);
                                Sound.soundStop(1);
                                Sound.setVolume();
                                Sound.init();
                                GameStatus.GAME.volumeView = z;
                                if (fileDataInputOpenDataInput != null) {
                                    try {
                                        fileDataInputOpenDataInput.close();
                                    } catch (Exception e4) {
                                        GameStatus.sdCardAccess = false;
                                        return;
                                    }
                                }
                                if (fileEntityOpen != null) {
                                    fileEntityOpen.close();
                                }
                                Util.FreeData(imageArr, 0);
                                if (image != null) {
                                    image.getImage().dispose();
                                    image.unuse();
                                }
                                Util.FreeData(imageArr2, 0);
                                Util.FreeData(mediaSoundArr, 2);
                                GameCommon.SOFT_MENU_SET(0, 0);
                                GameCommon.f54g.lock();
                                GameCommon.f54g.clearRect(0, 0, 854, 480);
                                GameCommon.f54g.unlock(true);
                                GameCommon.f54g.lock();
                                GameCommon.begin3D();
                                GameStatus.sdCardAccess = false;
                                return;
                            }
                        }
                        for (int i15 = 0; i15 < imageArr2.length; i15++) {
                            fileDataInputOpenDataInput.readFully(bArr, 0, fileDataInputOpenDataInput.readInt());
                            MediaImage image2 = MediaManager.getImage(bArr);
                            image2.use((MediaResource) null, true);
                            imageArr2[i15] = image2.getImage();
                        }
                        for (int i16 = 0; i16 < 16; i16++) {
                            imageArr[i16] = Image.createImage(480, 32);
                            imageArr[i16].setTransparentColor(Graphics.getColorOfRGB(0, 0, 0));
                        }
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = 0;
                        while (i19 < 16) {
                            iArr[i17 % 16] = drawName(imageArr[i17 % 16], strArr2[i18]);
                            i17++;
                            i19++;
                            i18++;
                        }
                        MediaImage mediaImageCreateMediaImage = MediaManager.createMediaImage(s, s2);
                        System.gc();
                        GameCommon.SOFT_MENU_SET(0, 0);
                        GameCommon.resetAllKey();
                        GameCommon.end3D();
                        GameCommon.f54g.clearRect(0, 0, 854, 480);
                        GameCommon.f54g.unlock(true);
                        GameCommon.f54g.setColor(Graphics.getColorOfRGB(0, 0, 0));
                        long jCurrentTimeMillis2 = System.currentTimeMillis() << 10;
                        int i20 = 0;
                        GameStatus.GAME.volumeView = true;
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 1;
                        int iMovieBgm = 0;
                        long j2 = jCurrentTimeMillis2;
                        long jCurrentTimeMillis3 = jCurrentTimeMillis2;
                        int i25 = i18;
                        MediaImage mediaImage2 = null;
                        while (true) {
                            if (i5 >= i8 || iMovieBgm > i23 * 34133) {
                                i24 = i24;
                                iMovieBgm = iMovieBgm;
                            } else {
                                int i26 = i24 ^ 1;
                                int i27 = i5 + 1;
                                try {
                                    i24 = i26;
                                    i20 = iMovieBgm;
                                    iMovieBgm = (Sound.movieBgm(i26, mediaSoundArr[i5]) << 10) + iMovieBgm;
                                    i5 = i27;
                                } catch (Exception e5) {
                                    mediaSoundArr2 = mediaSoundArr;
                                    image = mediaImage2;
                                    fileDataInput = fileDataInputOpenDataInput;
                                    fileEntity = fileEntityOpen;
                                    Game.memoryPrint("M1");
                                    Sound.soundStop(0);
                                    Sound.soundStop(1);
                                    Sound.setVolume();
                                    Sound.init();
                                    GameStatus.GAME.volumeView = z;
                                    if (fileDataInput != null) {
                                        fileDataInput.close();
                                    }
                                    if (fileEntity != null) {
                                        fileEntity.close();
                                    }
                                    Util.FreeData(imageArr, 0);
                                    if (image != null) {
                                        image.getImage().dispose();
                                        image.unuse();
                                    }
                                    Util.FreeData(imageArr2, 0);
                                    Util.FreeData(mediaSoundArr2, 2);
                                    GameCommon.SOFT_MENU_SET(0, 0);
                                    GameCommon.f54g.lock();
                                    GameCommon.f54g.clearRect(0, 0, 854, 480);
                                    GameCommon.f54g.unlock(true);
                                    GameCommon.f54g.lock();
                                    GameCommon.begin3D();
                                    GameStatus.sdCardAccess = false;
                                    return;
                                } catch (Throwable th4) {
                                    th = th4;
                                    image = mediaImage2;
                                    Sound.soundStop(0);
                                    Sound.soundStop(1);
                                    Sound.setVolume();
                                    Sound.init();
                                    GameStatus.GAME.volumeView = z;
                                    if (fileDataInputOpenDataInput != null) {
                                        fileDataInputOpenDataInput.close();
                                    }
                                    if (fileEntityOpen != null) {
                                        fileEntityOpen.close();
                                    }
                                    Util.FreeData(imageArr, 0);
                                    if (image != null) {
                                        image.getImage().dispose();
                                        image.unuse();
                                    }
                                    Util.FreeData(imageArr2, 0);
                                    Util.FreeData(mediaSoundArr, 2);
                                    GameCommon.SOFT_MENU_SET(0, 0);
                                    GameCommon.f54g.lock();
                                    GameCommon.f54g.clearRect(0, 0, 854, 480);
                                    GameCommon.f54g.unlock(true);
                                    GameCommon.f54g.lock();
                                    GameCommon.begin3D();
                                    GameStatus.sdCardAccess = false;
                                    throw th;
                                }
                            }
                            if (PhoneSystem.getAttribute(9) == 0) {
                                Sound.soundPause(i24, true);
                                while (PhoneSystem.getAttribute(9) == 0) {
                                    Util.Sleep(400);
                                }
                                Sound.soundPause(i24, false);
                                jCurrentTimeMillis = System.currentTimeMillis() << 10;
                                j = jCurrentTimeMillis - ((long) (i23 * 34133));
                            } else {
                                j = j2;
                                jCurrentTimeMillis = jCurrentTimeMillis3;
                            }
                            jCurrentTimeMillis3 = jCurrentTimeMillis + ((long) 34133);
                            int i28 = i6 - 1;
                            if (i6 != 0 || i22 >= length) {
                                i22 = i22;
                                i = 0;
                                i6 = i28;
                            } else {
                                i = fileDataInputOpenDataInput.readInt();
                                i22++;
                                i6 = 565;
                            }
                            i23++;
                            if (GameCommon.KEY_STATE[GameCommon.CONF_MENU_SYSTEM_KEY] != 0) {
                                mediaImage = mediaImage2;
                                break;
                            }
                            if (GameCommon.KEY_STATE[GameCommon.CONF_MENU_COMMAND_KEY] != 0) {
                                mediaImage = mediaImage2;
                                break;
                            }
                            if ((System.currentTimeMillis() << 10) <= jCurrentTimeMillis3) {
                                if (i > 0) {
                                    fileDataInputOpenDataInput.readFully(bArr, 0, i);
                                    image = MediaManager.getImage(bArr);
                                    image.use(mediaImageCreateMediaImage, true);
                                } else {
                                    image = mediaImage2;
                                }
                                GameCommon.f54g.lock();
                                if (image != null && i6 >= 0 && ((i6 > 515 || 50 > i6) && (i6 & 1) == 0)) {
                                    if (i6 > 515) {
                                        GameCommon.f55g2.setRenderMode(1, (565 - i6) * 5, 0);
                                    } else {
                                        GameCommon.f55g2.setRenderMode(1, i6 * 5, 0);
                                    }
                                    GameCommon.f54g.drawImage(image.getImage(), 510, 160);
                                    GameCommon.f55g2.setRenderMode(0, 255, 0);
                                }
                                GameCommon.f54g.clearRect(20, 0, 480, 480);
                                int i29 = ((i23 << 1) - 480) >> 5;
                                int i30 = ((i29 << 5) + 480) - (i23 << 1);
                                if (strArr2.length - i29 < 16 && i21 != i29) {
                                    Sound.setVolume((Sound.volumBase[0][GameStatus.systemData[2]] * (strArr2.length - i29)) / 16);
                                    i21 = i29;
                                }
                                if (strArr2.length - 1 == i29 && i30 <= 0) {
                                    mediaImage = image;
                                    break;
                                }
                                int i31 = 0;
                                int i32 = i30;
                                int i33 = i29;
                                int i34 = i25;
                                int i35 = i17;
                                while (i31 < 16) {
                                    if (i33 >= 0 && i33 < strArr2.length && i32 < 480) {
                                        if (i33 < i34 || strArr2.length <= i34) {
                                            i2 = i34;
                                            i3 = i35;
                                        } else {
                                            i2 = i34 + 1;
                                            iArr[i35 % 16] = drawName(imageArr[i35 % 16], strArr2[i34]);
                                            i3 = i35 + 1;
                                        }
                                        if (i32 >= 420) {
                                            GameCommon.f55g2.setRenderMode(1, ((480 - i32) >> 1) * 8, 0);
                                        } else if (i32 < 20) {
                                            GameCommon.f55g2.setRenderMode(1, Math.max(0, ((i32 + 20) >> 1) * 12), 0);
                                        }
                                        if (iArr[i33 % 16] >= 4) {
                                            graphics.drawImage(imageArr2[iArr[i33 % 16] - 4], 40, i32);
                                        } else if (iArr[i33 % 16] != 0) {
                                            if (i32 < 400) {
                                                graphics.drawImage(imageArr[i33 % 16], 20, i32);
                                            } else if (iArr[i33 % 16] == 1) {
                                                graphics.setColor(Graphics.getColorOfRGB(0, 0, 0));
                                                graphics.fillRect(0, i32, 754, 80);
                                                int i36 = (i32 - 400) << 2;
                                                graphics.drawImage(imageArr[i33 % 16], 20 - i36, i32);
                                                graphics.drawImage(imageArr[i33 % 16], i36 + 20, i32);
                                                int length2 = ((strArr2[i33].length() * 24) * 2) / 3;
                                                for (int i37 = 0; i37 < 32; i37++) {
                                                    if (i37 < 16) {
                                                        graphics.drawLine(20 - i36, (i37 << 1) + i32, i36 + 20, (i37 << 1) + i32);
                                                    } else {
                                                        graphics.drawLine((20 - i36) + length2, ((i37 - 16) << 1) + i32 + 1, i36 + 20 + length2, ((i37 - 16) << 1) + i32 + 1);
                                                    }
                                                }
                                                GameCommon.f55g2.setRenderMode(0, 255, 0);
                                                GameCommon.drawSoftKey();
                                            } else if (iArr[i33 % 16] == 2) {
                                                char[] cArr = new char[strArr2[i33].length() - 1];
                                                int i38 = 0;
                                                if (cArr.length <= 14) {
                                                    i4 = 5;
                                                } else if (cArr.length <= 18) {
                                                    i4 = 4;
                                                } else {
                                                    i4 = cArr.length <= 24 ? 3 : 2;
                                                }
                                                graphics.setColor(Graphics.getColorOfRGB(255, 255, 16));
                                                for (int i39 = 0; i39 < cArr.length; i39++) {
                                                    i38++;
                                                    if ((i4 >> 0) * i39 >= (480 - i32) - 8) {
                                                        if (((i32 >> 1) & 1) != 0) {
                                                            cArr[i39] = ' ';
                                                            break;
                                                        }
                                                        cArr[i39] = (char) (Util.randomFix(0, 25) + 65);
                                                        Font font = Font.getFont(1896873984, 24);
                                                        int iStringWidth = font.stringWidth("A");
                                                        int height = font.getHeight() / 3;
                                                        graphics.fillRect(((i38 - 1) * iStringWidth) + 26, (i32 + 24) - height, iStringWidth, height);
                                                        break;
                                                    }
                                                    cArr[i39] = strArr2[i33].charAt(i39 + 1);
                                                }
                                                Draw2D.setFont(24);
                                                graphics.drawChars(cArr, 26, i32 + 24, 0, i38);
                                            } else if (iArr[i33 % 16] == 3) {
                                                graphics.drawImage(imageArr[i33 % 16], 20, i32);
                                            }
                                        }
                                        if (i32 >= 420 || i32 < 20) {
                                            GameCommon.f55g2.setRenderMode(0, 255, 0);
                                        }
                                        i34 = i2;
                                        i35 = i3;
                                    }
                                    i31++;
                                    i32 += 32;
                                    i33++;
                                }
                                if (i13 != GameStatus.systemData[2]) {
                                    i13 = GameStatus.systemData[2];
                                    GameCommon.drawSoftKey();
                                }
                                GameCommon.f54g.unlock(true);
                                do {
                                } while (jCurrentTimeMillis3 > (System.currentTimeMillis() << 10));
                                j2 = j;
                                i25 = i34;
                                i17 = i35;
                                mediaImageCreateMediaImage = image;
                                mediaImage2 = image;
                            } else {
                                fileDataInputOpenDataInput.skipBytes(i);
                                if ((System.currentTimeMillis() << 10) - j > (Sound.playTime(i24) << 10) + i20) {
                                    jCurrentTimeMillis3 = System.currentTimeMillis() << 10;
                                    j2 = jCurrentTimeMillis3 - ((long) (i23 * 34133));
                                } else {
                                    j2 = j;
                                }
                            }
                        }
                        Sound.soundStop(0);
                        Sound.soundStop(1);
                        Sound.setVolume();
                        Sound.init();
                        GameStatus.GAME.volumeView = z;
                        if (fileDataInputOpenDataInput != null) {
                            try {
                                fileDataInputOpenDataInput.close();
                            } catch (Exception e6) {
                            }
                        }
                        if (fileEntityOpen != null) {
                            fileEntityOpen.close();
                        }
                        Util.FreeData(imageArr, 0);
                        if (mediaImage != null) {
                            mediaImage.getImage().dispose();
                            mediaImage.unuse();
                        }
                        Util.FreeData(imageArr2, 0);
                        Util.FreeData(mediaSoundArr, 2);
                        GameCommon.SOFT_MENU_SET(0, 0);
                        GameCommon.f54g.lock();
                        GameCommon.f54g.clearRect(0, 0, 854, 480);
                        GameCommon.f54g.unlock(true);
                        GameCommon.f54g.lock();
                        GameCommon.begin3D();
                        GameStatus.sdCardAccess = false;
                    } catch (Exception e7) {
                        mediaSoundArr2 = null;
                        fileDataInput = fileDataInputOpenDataInput;
                        fileEntity = fileEntityOpen;
                    } catch (Throwable th5) {
                        th = th5;
                        mediaSoundArr = null;
                    }
                } catch (Exception e8) {
                    mediaSoundArr2 = null;
                    fileEntity = fileEntityOpen;
                } catch (Throwable th6) {
                    th = th6;
                    mediaSoundArr = null;
                    fileDataInputOpenDataInput = null;
                }
            } catch (Exception e9) {
                mediaSoundArr2 = null;
                fileEntity = null;
            } catch (Throwable th7) {
                th = th7;
                mediaSoundArr = null;
                fileDataInputOpenDataInput = null;
                fileEntityOpen = null;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public static boolean strageCheck(int i) {
        boolean z = true;
        if (i != 0) {
            i = ((i / 51200) + 1) * 51200;
        }
        z = false;
        while (true) {
            if (sdCardAccessCheck()) {
                try {
                    Folder folder = getFolder();
                    if (folder == null || i <= 0 || folder.getFreeSize() > i) {
                        break;
                    }
                    sdCardFullErr();
                } catch (Exception e) {
                    sdCardAccessErr();
                }
            } else {
                sdCardAccessErr();
            }
        }
        return z;
    }

    public static InputStream strageInputStream(String str) {
        try {
            JoinData joinData = getJoinData(str);
            if (joinData == null) {
                SD_FILE = getFileStream(str, false).open(0);
                SD_INPUT = SD_FILE.openInputStream();
            } else {
                SD_FILE = getFileStream(createJoinFilename(joinData), false).open(0);
                SD_INPUT = SD_FILE.openInputStream();
                SD_INPUT.skip(joinData.offset);
            }
        } catch (Exception e) {
        }
        return SD_INPUT;
    }

    public static OutputStream strageOutputStream(String str) {
        try {
            SD_FILE = getFileStream(str, true).open(1);
            SD_OUTPUT = SD_FILE.openOutputStream();
        } catch (Exception e) {
        }
        return SD_OUTPUT;
    }

    public static boolean writeStrage(String str, byte[] bArr) {
        try {
            FileEntity fileEntityOpen = getFileStream(str, true).open(1);
            OutputStream outputStreamOpenOutputStream = fileEntityOpen.openOutputStream();
            outputStreamOpenOutputStream.write(bArr);
            outputStreamOpenOutputStream.close();
            fileEntityOpen.close();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            StrageStreamClose();
        }
    }
}
