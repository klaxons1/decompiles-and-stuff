package p000;

import com.docomostar.media.MediaImage;
import com.docomostar.media.MediaManager;
import com.docomostar.media.MediaResource;
import com.docomostar.media.MediaSound;
import com.docomostar.ui.Image;
import com.docomostar.ui.PalettedImage;
import com.docomostar.ui.util3d.FastMath;
import com.jcraft.jzlib.ZInputStream;
import com.mascotcapsule.eruption.docomostar.Appearance;
import com.mascotcapsule.eruption.docomostar.Figure;
import com.mascotcapsule.eruption.docomostar.Light;
import com.mascotcapsule.eruption.docomostar.Object3D;
import com.mascotcapsule.eruption.docomostar.Texture;
import com.mascotcapsule.eruption.docomostar.Transform;
import com.mascotcapsule.eruption.docomostar.Vector3D;
import com.mascotcapsule.eruption.docomostar.VertexBuffer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Util {
    private static int[] RANDN = new int[32];

    /* JADX INFO: renamed from: _n */
    private static int[] f66_n = new int[2];
    private static Object3D[] _obj = new Object3D[64];
    private static Transform _work = new Transform();
    private static VertexBuffer[] _vb = new VertexBuffer[16];

    Util() {
    }

    public static void ByteSet(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i + i4] = (byte) (i2 & 255);
            i2 >>= 8;
        }
    }

    public static float DiffDir(float f, float f2) {
        float f3 = (f - f2) % 360.0f;
        if (f3 >= 180.0f) {
            return f3 - 360.0f;
        }
        return f3 < -180.0f ? f3 + 360.0f : f3;
    }

    public static void FreeData(Object[] objArr, int i) {
        if (objArr == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= objArr.length) {
                return;
            }
            if (objArr[i3] != null) {
                if (i == 0) {
                    ((Image) objArr[i3]).dispose();
                } else if (i == 1) {
                    ((PalettedImage) objArr[i3]).dispose();
                } else {
                    ((MediaSound) objArr[i3]).unuse();
                    ((MediaSound) objArr[i3]).dispose();
                }
                objArr[i3] = null;
            }
            i2 = i3 + 1;
        }
    }

    public static Object[] ReadData(ZInputStream zInputStream, int i, int i2) throws Exception {
        int i3;
        Image[] imageArr = i == 0 ? new Image[zInputStream.read()] : i == 1 ? new PalettedImage[zInputStream.read()] : new MediaSound[zInputStream.read()];
        for (int i4 = 0; i4 < imageArr.length; i4++) {
            byte[] bArr = zInputStream.read(0, readInt(zInputStream));
            if (i == 0) {
                MediaImage image = MediaManager.getImage(bArr);
                image.use((MediaResource) null, true);
                imageArr[i4] = image.getImage();
            } else if (i == 1) {
                imageArr[i4] = PalettedImage.createPalettedImage(bArr);
            } else {
                imageArr[i4] = MediaManager.getSound(bArr);
                ((MediaSound) imageArr[i4]).use((MediaResource) null, true);
            }
        }
        if (i == 2 && (i3 = zInputStream.read()) > 0) {
            Sound.LoadSEPortData(i3, zInputStream, i2);
        }
        return imageArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[Catch: Exception -> 0x005e, TryCatch #2 {Exception -> 0x005e, blocks: (B:10:0x001e, B:12:0x0023, B:13:0x0026), top: B:47:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0034 A[Catch: Exception -> 0x003b, TryCatch #4 {Exception -> 0x003b, blocks: (B:18:0x002f, B:20:0x0034, B:21:0x0037), top: B:49:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0048 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:28:0x0043, B:30:0x0048, B:31:0x004b), top: B:45:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Object[] ReadData(String str, int i, int i2) throws Throwable {
        Throwable th;
        ZInputStream zInputStream;
        InputStream inputStreamStrageInputStream;
        ZInputStream zInputStream2;
        Object[] objArrReadData = null;
        System.gc();
        try {
            inputStreamStrageInputStream = StrageDeviceAccess.strageInputStream(str);
            if (inputStreamStrageInputStream == null) {
                try {
                    inputStreamStrageInputStream = StrageDeviceAccess.strageInputStream(str);
                    zInputStream2 = new ZInputStream(inputStreamStrageInputStream);
                    try {
                        zInputStream2.setBufferSize(65536);
                        objArrReadData = ReadData(zInputStream2, i, i2);
                        if (zInputStream2 != null) {
                            try {
                                zInputStream2.close();
                            } catch (Exception e) {
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
                    if (zInputStream2 != null) {
                        zInputStream2.close();
                    }
                    if (inputStreamStrageInputStream != null) {
                        inputStreamStrageInputStream.close();
                    }
                    StrageDeviceAccess.StrageStreamClose();
                    return objArrReadData;
                } catch (Throwable th3) {
                    th = th3;
                    zInputStream = null;
                    if (zInputStream != null) {
                        zInputStream.close();
                    }
                    if (inputStreamStrageInputStream != null) {
                        inputStreamStrageInputStream.close();
                    }
                    StrageDeviceAccess.StrageStreamClose();
                    throw th;
                }
            } else {
                zInputStream2 = new ZInputStream(inputStreamStrageInputStream);
                zInputStream2.setBufferSize(65536);
                objArrReadData = ReadData(zInputStream2, i, i2);
                if (zInputStream2 != null) {
                    zInputStream2.close();
                }
                if (inputStreamStrageInputStream != null) {
                    inputStreamStrageInputStream.close();
                }
                StrageDeviceAccess.StrageStreamClose();
            }
        } catch (Exception e6) {
            zInputStream2 = null;
            inputStreamStrageInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            zInputStream = null;
            inputStreamStrageInputStream = null;
        }
        return objArrReadData;
    }

    public static float RotDir(float f, float f2) {
        float f3 = f + f2;
        if (f3 < 0.0f) {
            return f3 + 360.0f;
        }
        return f3 >= 360.0f ? f3 - 360.0f : f3;
    }

    public static void SeqSort(int[] iArr, float[] fArr) {
        f66_n[0] = fArr.length;
        f66_n[1] = 0;
        boolean[] zArr = new boolean[fArr.length];
        while (true) {
            int[] iArr2 = f66_n;
            int i = iArr2[0];
            iArr2[0] = i - 1;
            if (i <= 0) {
                return;
            }
            float f = -1.6777215E7f;
            f66_n[1] = fArr.length;
            while (true) {
                int[] iArr3 = f66_n;
                int i2 = iArr3[1];
                iArr3[1] = i2 - 1;
                if (i2 > 0) {
                    if (!zArr[f66_n[1]] && fArr[f66_n[1]] > f) {
                        f = fArr[f66_n[1]];
                        iArr[f66_n[0]] = f66_n[1];
                    }
                }
            }
            zArr[iArr[f66_n[0]]] = true;
        }
    }

    public static void Sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (Exception e) {
        }
    }

    public static String addslash(String str, int i) {
        String string = "";
        int i2 = 0;
        do {
            int iIndexOf = str.substring(i2).indexOf(i);
            if (iIndexOf == -1) {
                break;
            }
            string = new StringBuffer().append(string).append(str.substring(i2, i2 + iIndexOf)).append("`").append((char) i).toString();
            i2 += iIndexOf + 1;
        } while (i2 < str.length());
        return new StringBuffer().append(string).append(str.substring(i2)).toString();
    }

    public static float atan2_360(float f, float f2) {
        if (-0.001f < f && f < 0.001f) {
            return f2 >= 0.0f ? 0.0f : 180.0f;
        }
        if (-0.001f >= f2 || f2 >= 0.001f) {
            return (f < 0.0f ? 180 : 0) + FastMath.atan2(f2, f);
        }
        return f > 0.0f ? 90.0f : 270.0f;
    }

    public static int attadd(int i, int i2, int i3) {
        if (i > i3 || i3 > i + i2) {
            return (i < i3 || i3 < i + i2) ? i + i2 : i3;
        }
        return i3;
    }

    public static String big_space_int(int i, int i2) {
        String strSpace_int = space_int(i, i2);
        StringBuffer stringBuffer = new StringBuffer(strSpace_int);
        for (int i3 = 0; i3 < strSpace_int.length(); i3++) {
            char cCharAt = strSpace_int.charAt(i3);
            if (cCharAt >= '0' && cCharAt <= '9') {
                stringBuffer.setCharAt(i3, (char) ((cCharAt - '0') + 65296));
            } else if (cCharAt == ' ') {
                stringBuffer.setCharAt(i3, (char) 12288);
            }
        }
        return stringBuffer.toString();
    }

    public static String big_zero_int(int i, int i2) {
        String strZero_int = zero_int(i, i2);
        StringBuffer stringBuffer = new StringBuffer(strZero_int);
        for (int i3 = 0; i3 < strZero_int.length(); i3++) {
            char cCharAt = strZero_int.charAt(i3);
            if (cCharAt >= '0' && cCharAt <= '9') {
                stringBuffer.setCharAt(i3, (char) ((cCharAt - '0') + 65296));
            }
        }
        return stringBuffer.toString();
    }

    public static InputStream byte2InputStream(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArr);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            return null;
        }
    }

    public static float byte2float(byte[] bArr, int i) {
        return readShort(bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) / 32.0f;
    }

    public static int byte2int(byte[] bArr, int i) {
        return (bArr[i] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) + ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8) + ((bArr[i + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 16) + ((bArr[i + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 24);
    }

    public static short byte2short(byte[] bArr, int i) {
        return (short) ((bArr[i] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) + ((bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET) << 8));
    }

    public static int check(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public static String delchar(String str, char c) {
        StringBuffer stringBuffer = new StringBuffer(str);
        while (true) {
            int iIndexOf = stringBuffer.toString().indexOf(c);
            if (iIndexOf == -1) {
                return stringBuffer.toString();
            }
            stringBuffer.deleteCharAt(iIndexOf);
        }
    }

    public static void deleteAll(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = -1;
        }
    }

    public static void deleteFigureLight(Figure figure) {
        int iFindObject3D = figure.findObject3D(16, -1, _obj);
        for (int i = 0; i < iFindObject3D; i++) {
            ((Light) _obj[i]).setVisible(false);
            _obj[i].setRenderEnable(false);
        }
    }

    public static void deleteIdx(int[] iArr, int i) {
        iArr[i] = -1;
        while (i < iArr.length - 1) {
            if (iArr[i + 1] >= 0) {
                iArr[i] = iArr[i + 1];
                iArr[i + 1] = -1;
            }
            i++;
        }
    }

    public static void deleteVal(int[] iArr, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                i2 = -1;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            deleteIdx(iArr, i2);
        }
    }

    public static int dir45(float f) {
        return (((int) (22.5f + f)) / 45) * 45;
    }

    public static int dirTo8(float f) {
        return ((int) ((((double) f) + 382.5d) / 45.0d)) & 7;
    }

    public static float distance2(float f, float f2) {
        return (f * f) + (f2 * f2);
    }

    public static void float2byte(byte[] bArr, int i, float f) {
        int i2 = (int) (32.0f * f);
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
    }

    public static boolean floatEquals(float f, float f2) {
        return -1.0E-5f < f - f2 || f - f2 < 1.0E-5f;
    }

    public static int getColorOfRGBAtoABGR(int i, int i2, int i3, int i4) {
        return (i4 << 24) | (i3 << 16) | (i2 << 8) | i;
    }

    public static float getDistance(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f - f4) * (f - f4)) + ((f2 - f5) * (f2 - f5)) + ((f3 - f6) * (f3 - f6));
    }

    public static int getNumber(int i, int i2) {
        for (int i3 = 1; i3 < i2; i3++) {
            i /= 10;
        }
        return i % 10;
    }

    public static void getRandomArray(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = -1;
        }
        int i4 = 0;
        while (true) {
            iArr[i4] = randomFix(i, i2);
            boolean z = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (iArr[i4] == iArr[i5]) {
                    z = true;
                }
            }
            if (!z && (i4 = i4 + 1) == iArr.length) {
                return;
            }
        }
    }

    public static Texture getTexture(Figure figure, int i) {
        int iFindObject3D = figure.findObject3D(10, -1, _obj);
        if (iFindObject3D >= 120) {
        }
        for (int i2 = 0; i2 < iFindObject3D; i2++) {
            if (((Texture) _obj[i2]).getGid() == i) {
                return (Texture) _obj[i2];
            }
        }
        return null;
    }

    public static boolean hitCheckB2B(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        return Math.abs(f - f7) < (f4 + f10) / 2.0f && Math.abs(f3 - f9) < (f6 + f12) / 2.0f && ((f8 <= f2 && f2 - f8 < f11) || (f8 > f2 && f8 - f2 < f5));
    }

    public static boolean hitCheckC2C(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f4 - f) * (f4 - f)) + ((f5 - f2) * (f5 - f2)) < (f3 + f6) * (f3 + f6);
    }

    public static boolean hitCheckS2B(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        return lenP2B(f, f2, f3, f5, f6, f7, f8, f9, f10) < f4;
    }

    public static boolean hitCheckS2S(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return (((f5 - f) * (f5 - f)) + ((f6 - f2) * (f6 - f2))) + ((f7 - f3) * (f7 - f3)) < (f4 + f8) * (f4 + f8);
    }

    public static void insert(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 0) {
                iArr[i2] = i;
                return;
            }
        }
    }

    public static void int2byte(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public static float lenP2B(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f7 * 0.5f;
        float f11 = f9 * 0.5f;
        float f12 = f < f4 - f10 ? 0.0f + ((f - (f4 - f10)) * (f - (f4 - f10))) : 0.0f;
        if (f > f4 + f10) {
            f12 += (f - (f10 + f4)) * (f - (f4 + f10));
        }
        if (f3 < f6 - f11) {
            f12 += (f3 - (f6 - f11)) * (f3 - (f6 - f11));
        }
        if (f3 > f6 + f11) {
            f12 += (f3 - (f6 + f11)) * (f3 - (f11 + f6));
        }
        if (f2 < f5) {
            f12 += (f2 - f5) * (f2 - f5);
        }
        return f2 > f5 + f8 ? f12 + ((f2 - (f5 + f8)) * (f2 - (f5 + f8))) : f12;
    }

    public static float limitDiffDir(float f, float f2, float f3) {
        float fDiffDir = DiffDir(f, f2);
        if (Math.abs(fDiffDir) > f3) {
            return fDiffDir >= 0.0f ? f3 : -f3;
        }
        return fDiffDir;
    }

    public static void multiVertexTransparency(float f, int i, Figure figure, boolean z) {
        if (z) {
            int iFindObject3D = figure.findObject3D(14, -1, _obj);
            for (int i2 = 0; i2 < iFindObject3D; i2++) {
                if (f == 1.0f) {
                    ((Appearance) _obj[i2]).setBlendMode(1, 0);
                } else {
                    ((Appearance) _obj[i2]).setBlendMode(0);
                }
                _obj[i2] = null;
            }
        }
        if (i == 16777215) {
            setMultiVertexColors(figure, f, 1.0f, 1.0f, 1.0f);
        } else {
            setMultiVertexColors(figure, f, ((i >> 16) & 255) / 255.0f, ((i >> 8) & 255) / 255.0f, (i & 255) / 255.0f);
        }
    }

    public static void nullClear(String[] strArr) {
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = null;
            }
        }
    }

    public static int randomFix(int i, int i2) {
        int i3 = RANDN[0];
        int i4 = i3 == 31 ? 1 : i3 + 1;
        RANDN[0] = i4;
        int[] iArr = RANDN;
        iArr[i4] = (i4 > 3 ? RANDN[i4 - 3] : RANDN[(i4 + 31) - 3]) + iArr[i4];
        return (((RANDN[i4] >> 1) & Integer.MAX_VALUE) % ((i2 - i) + 1)) + i;
    }

    public static int readInt(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int readInt(ZInputStream zInputStream) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= 4) {
                break;
            }
            try {
                i2 = ((zInputStream.read() & 255) << (i3 << 3)) + i;
                i3++;
            } catch (Exception e) {
            }
        }
        return i;
    }

    public static int readInt(InputStream inputStream) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= 4) {
                break;
            }
            try {
                i2 = ((inputStream.read() & 255) << (i3 << 3)) + i;
                i3++;
            } catch (Exception e) {
            }
        }
        return i;
    }

    public static int readInt(byte[] bArr, int i) {
        if (bArr.length < i + 4) {
            return -1;
        }
        return readInt(bArr[i + 3] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 2] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i + 1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET, bArr[i] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET);
    }

    public static short readShort(int i, int i2) {
        return (short) ((i << 8) | i2);
    }

    public static short readShort(ZInputStream zInputStream) {
        short s;
        short s2 = 0;
        int i = 0;
        while (true) {
            s = s2;
            if (i >= 2) {
                break;
            }
            try {
                s2 = (short) (((zInputStream.read() & 255) << (i << 3)) + s);
                i++;
            } catch (Exception e) {
            }
        }
        return s;
    }

    public static short readShort(InputStream inputStream) {
        short s;
        short s2 = 0;
        int i = 0;
        while (true) {
            s = s2;
            if (i >= 2) {
                break;
            }
            try {
                s2 = (short) (((inputStream.read() & 255) << (i << 3)) + s);
                i++;
            } catch (Exception e) {
            }
        }
        return s;
    }

    public static String readString(InputStream inputStream, int i) {
        if (i <= 0) {
            return "";
        }
        try {
            byte[] bArr = new byte[i];
            inputStream.read(bArr);
            return new String(bArr);
        } catch (Exception e) {
            return null;
        }
    }

    public static String replace(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        while (iIndexOf >= 0) {
            String[] strArr = {"", ""};
            strArr[0] = str.substring(0, iIndexOf);
            strArr[1] = str.substring(iIndexOf + str2.length(), str.length());
            str = new StringBuffer().append(strArr[0]).append(str3).append(strArr[1]).toString();
            iIndexOf = str.indexOf(str2);
        }
        return str;
    }

    public static float s2f(String str) {
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            return 0.0f;
        }
    }

    public static int s2i(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void setDrawOrder(Figure figure, int i) {
        setDrawOrder(figure, i, true);
    }

    public static void setDrawOrder(Figure figure, int i, boolean z) {
        int iFindObject3D = figure.findObject3D(14, -1, _obj);
        if (iFindObject3D >= 120) {
        }
        for (int i2 = 0; i2 < iFindObject3D; i2++) {
            if (z || ((Appearance) _obj[i2]).getDrawOrder() == 0) {
                ((Appearance) _obj[i2]).setDrawOrder(i);
            }
        }
    }

    public static void setFigureUseridVisible(Figure figure, int i, boolean z) {
        int iFindObject3D = figure.findObject3D(9, i, _obj);
        if (iFindObject3D >= 120) {
        }
        for (int i2 = 0; i2 < iFindObject3D; i2++) {
            ((Figure) _obj[i2]).setVisible(z);
            _obj[i2].setRenderEnable(z);
        }
    }

    public static void setMultiVertexColors(Figure figure, float f, float f2, float f3, float f4) {
        int iFindObject3D = figure.findObject3D(3, -1, _vb);
        for (int i = 0; i < iFindObject3D; i++) {
            _vb[i].multiVertexColors(f, f4, f3, f2);
            _vb[i] = null;
        }
    }

    public static void setProperties(Figure figure, int i) {
        int iFindObject3D = figure.findObject3D(14, -1, _obj);
        if (iFindObject3D >= 120) {
        }
        for (int i2 = 0; i2 < iFindObject3D; i2++) {
            ((Appearance) _obj[i2]).setProperties(((Appearance) _obj[i2]).getProperties() | i);
        }
    }

    public static void setRotate(Vector3D vector3D, float f, Transform transform) {
        _work.setRotate(vector3D, f);
        transform.multiply(_work);
    }

    public static void setRotateEuler(int i, Vector3D vector3D, Transform transform) {
        _work.setRotateEuler(i, vector3D);
        transform.multiply(_work);
    }

    public static void setScale(float f, float f2, float f3, Transform transform) {
        _work.setScale(f, f2, f3);
        transform.multiply(_work);
    }

    public static void setTranslate(float f, float f2, float f3, Transform transform) {
        _work.setTranslate(f, f2, f3);
        transform.multiply(_work);
    }

    public static void setTransparency(int i, Figure figure) {
        Appearance appearance = (Appearance) figure.findObject3D(14, -1);
        if (appearance == null) {
            return;
        }
        if (i == 255) {
            appearance.setBlendMode(4);
        } else {
            appearance.setBlendMode(0);
        }
        appearance.setColor(1, getColorOfRGBAtoABGR(255, 255, 255, i));
    }

    public static void short2byte(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static int size(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < 0) {
                return i;
            }
        }
        return iArr.length;
    }

    public static String space_int(int i, int i2) {
        String string = "";
        int i3 = 1;
        for (int i4 = i2 - 1; i4 > 0; i4--) {
            i3 *= 10;
        }
        boolean z = true;
        while (i2 > 0) {
            int i5 = i / i3;
            i %= i3;
            i3 /= 10;
            if (i5 == 0 && z && i2 != 1) {
                string = new StringBuffer().append(string).append(" ").toString();
            } else {
                string = new StringBuffer().append(string).append(i5).toString();
                z = false;
            }
            i2--;
        }
        return string;
    }

    public static void srandomFix(int i) {
        int[] iArr = {3, -1708027847, 853131300, -1687801470, 1570894658, -566525472, -552964171, -251413502, 1223901435, 1950999915, -1095640144, -1420011240, -1805298435, -1943115761, -348292705, -1323376457, 759393158, -630772182, 361286280, -479628451, -1873857033, -686452778, 1873211473, 1634626454, -1399525412, 910245779, -970800488, -173790536, -1970743429, -173171442, -1986452981, 670779321};
        for (int i2 = 0; i2 < iArr.length; i2++) {
            RANDN[i2] = iArr[i2];
        }
        RANDN[1] = i;
        for (int i3 = 2; i3 <= 31; i3++) {
            RANDN[i3] = (1103515245 * RANDN[i3 - 1]) + 12345;
        }
        for (int i4 = 0; i4 < 310; i4++) {
            randomFix(0, 2147483646);
        }
    }

    public static String strtok(String[] strArr, String str) {
        if (strArr == null || strArr[0] == null) {
            return null;
        }
        int iIndexOf = strArr[0].indexOf(str);
        if (iIndexOf != -1) {
            String strSubstring = strArr[0].substring(0, iIndexOf);
            strArr[0] = strArr[0].substring(iIndexOf + 1);
            return strSubstring;
        }
        String str2 = strArr[0];
        strArr[0] = null;
        return str2;
    }

    public static String txtDataStrip(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        while (true) {
            int iIndexOf = stringBuffer.toString().indexOf("//");
            if (iIndexOf == -1) {
                break;
            }
            int iIndexOf2 = stringBuffer.toString().indexOf(10, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = 65535;
            }
            stringBuffer.delete(iIndexOf, iIndexOf2 + 1);
        }
        while (true) {
            int iIndexOf3 = stringBuffer.toString().indexOf("/*");
            if (iIndexOf3 == -1) {
                break;
            }
            int iIndexOf4 = stringBuffer.toString().indexOf("*/", iIndexOf3);
            if (iIndexOf4 == -1) {
                iIndexOf4 = 65535;
            }
            stringBuffer.delete(iIndexOf3, iIndexOf4 + 2);
        }
        while (true) {
            int iIndexOf5 = stringBuffer.toString().indexOf(13);
            if (iIndexOf5 == -1) {
                break;
            }
            stringBuffer.deleteCharAt(iIndexOf5);
        }
        while (true) {
            int iIndexOf6 = stringBuffer.toString().indexOf(10);
            if (iIndexOf6 == -1) {
                break;
            }
            stringBuffer.deleteCharAt(iIndexOf6);
        }
        while (true) {
            int iIndexOf7 = stringBuffer.toString().indexOf(9);
            if (iIndexOf7 == -1) {
                break;
            }
            stringBuffer.deleteCharAt(iIndexOf7);
        }
        while (true) {
            int iIndexOf8 = stringBuffer.toString().indexOf(32);
            if (iIndexOf8 == -1) {
                return stringBuffer.toString();
            }
            stringBuffer.deleteCharAt(iIndexOf8);
        }
    }

    public static void unsetProperties(Figure figure, int i) {
        int iFindObject3D = figure.findObject3D(14, -1, _obj);
        if (iFindObject3D >= 120) {
        }
        for (int i2 = 0; i2 < iFindObject3D; i2++) {
            ((Appearance) _obj[i2]).setProperties(((Appearance) _obj[i2]).getProperties() & (i ^ (-1)));
        }
    }

    public static void writeInt(OutputStream outputStream, int i) {
        try {
            outputStream.write(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (Exception e) {
        }
    }

    public static void zeroClear(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    public static void zeroClear(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = 0.0f;
        }
    }

    public static void zeroClear(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    public static void zeroClear(short[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = 0;
        }
    }

    public static void zeroClear(boolean[] zArr) {
        for (int i = 0; i < zArr.length; i++) {
            zArr[i] = false;
        }
    }

    public static void zeroClear(byte[][] bArr) {
        for (byte[] bArr2 : bArr) {
            zeroClear(bArr2);
        }
    }

    public static void zeroClear(float[][] fArr) {
        for (float[] fArr2 : fArr) {
            zeroClear(fArr2);
        }
    }

    public static void zeroClear(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            zeroClear(iArr2);
        }
    }

    public static String zero_int(int i, int i2) {
        int i3 = 1;
        String string = "";
        for (int i4 = i2 - 1; i4 > 0; i4--) {
            i3 *= 10;
        }
        while (i2 > 0) {
            int i5 = i / i3;
            i %= i3;
            i3 /= 10;
            string = new StringBuffer().append(string).append(i5).toString();
            i2--;
        }
        return string;
    }
}
