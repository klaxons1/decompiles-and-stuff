package p000;

import Coral.Math.Float.crlV4;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Loader;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Object3D;
import javax.microedition.m3g.World;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;

/* JADX INFO: renamed from: t */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0037t extends C0033j {

    /* JADX INFO: renamed from: B */
    public static int f341B;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static StringBuffer f523Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static byte[] f524Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static C0015b[] f525Code;

    /* JADX INFO: renamed from: I */
    public static int f342I;

    /* JADX INFO: renamed from: V */
    public static int f344V;

    /* JADX INFO: renamed from: Z */
    public static int f347Z;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private DataInputStream f529Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private InputStream f530Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0037t f531Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private boolean f532Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private int[] f533Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public long[] f534Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private C0024br[] f535Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private Object[] f536Code;

    /* JADX INFO: renamed from: D */
    private int f351D;

    /* JADX INFO: renamed from: F */
    private int f352F;

    /* JADX INFO: renamed from: L */
    private int f353L;

    /* JADX INFO: renamed from: S */
    private int f354S;

    /* JADX INFO: renamed from: V */
    private byte[] f355V;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private static final short[] f527Code = {-1, 0, -1, -1, 0, 1, 1, 0, -1, 1, 0, 1};

    /* JADX INFO: renamed from: a */
    public static final int[] f349a = {0, 1, 2, 3};

    /* JADX INFO: renamed from: V */
    public static final int[] f346V = {f349a.length};
    private static String Code = "M_3D";

    /* JADX INFO: renamed from: V */
    private static String f345V = "/res/";

    /* JADX INFO: renamed from: I */
    private static String f343I = ".spg";

    /* JADX INFO: renamed from: Z */
    private static String f348Z = ".bin";

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public static final String[] f526Code = {"en", "fr", "it", "de", "es", "nl", "pt"};

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    private long f528Code = -1;

    /* JADX INFO: renamed from: a */
    private int f356a = -1;

    /* JADX INFO: renamed from: C */
    public int f350C = C0031g.f292l;

    static {
        byte[] bArr = {1, 0, 1, 1, 0, 0, 0, 1};
    }

    public static final float Code(C0031g c0031g, int i) {
        return Code(c0031g.f507Code, i);
    }

    public static final float Code(byte[] bArr, int i) {
        return Float.intBitsToFloat(m193V(bArr, i));
    }

    public static final float Code(crlV4[] crlv4Arr, int i, float[] fArr) {
        float f = 1000.0f;
        float f2 = 1000.0f;
        float f3 = 1000.0f;
        float f4 = -1000.0f;
        float f5 = -1000.0f;
        float f6 = -1000.0f;
        for (int i2 = 0; i2 < i; i2++) {
            if (crlv4Arr[i2].f362Code < f) {
                f = crlv4Arr[i2].f362Code;
            } else if (crlv4Arr[i2].f362Code > f4) {
                f4 = crlv4Arr[i2].f362Code;
            }
            if (crlv4Arr[i2].f18V < f3) {
                f3 = crlv4Arr[i2].f18V;
            } else if (crlv4Arr[i2].f18V > f6) {
                f6 = crlv4Arr[i2].f18V;
            }
            if (crlv4Arr[i2].f17I < f2) {
                f2 = crlv4Arr[i2].f17I;
            } else if (crlv4Arr[i2].f17I > f5) {
                f5 = crlv4Arr[i2].f17I;
            }
        }
        fArr[0] = (f4 - f) / 2.0f;
        fArr[1] = (f6 - f3) / 2.0f;
        fArr[2] = (f5 - f2) / 2.0f;
        float f7 = (-f) > f4 ? -f : f4;
        float f8 = (-f3) > f6 ? -f3 : f6;
        float f9 = (-f2) > f5 ? -f2 : f5;
        if (f8 > f7) {
            f7 = f8;
        }
        if (f9 > f7) {
            f7 = f9;
        }
        return 16383.0f / f7;
    }

    public static final int Code(int i) {
        for (int i2 = 0; i2 < 32; i2++) {
            if (((i >> i2) & 1) != 0) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    private int Code(long j) {
        Object obj;
        if (j == 0) {
            return 0;
        }
        int i = (int) j;
        C0037t c0037t = this.f531Code;
        InputStream inputStream = c0037t.f530Code;
        for (int i2 = 0; i2 < c0037t.f352F; i2++) {
            if (c0037t.f533Code[i2] == i) {
                c0037t.f533Code[i2] = 0;
                Object obj2 = c0037t.f536Code[i2];
                c0037t.f536Code[i2] = null;
                obj = obj2;
                if (obj == null) {
                    return -1;
                }
                return 0;
            }
        }
        obj = null;
        if (obj == null) {
            return -1;
        }
        return 0;
    }

    public static final int Code(long j, byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        do {
            bArr[i4] = (byte) (((long) 48) + (j % ((long) 10)));
            i4++;
            j /= (long) 10;
            if (i4 >= i3) {
                break;
            }
        } while (j > 0);
        int i5 = i4;
        while (i5 < i3) {
            bArr[i5] = 48;
            i5++;
        }
        int i6 = i5 - 1;
        while (i6 > i) {
            byte b = bArr[i6];
            bArr[i6] = bArr[i];
            bArr[i] = b;
            i6--;
            i++;
        }
        return i5;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public static final int m238Code(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) + ((bArr[i + 2] & 255) << 8) + ((bArr[i + 1] & 255) << 16) + ((bArr[i] & 255) << 24);
    }

    public static final C0032i Code(float f, float f2, byte b, byte b2, byte b3, byte b4) {
        C0032i c0032i = new C0032i(4, true, null, 1.0f, false, null, 0.007874016f);
        c0032i.Code(f349a, f346V);
        c0032i.Code(f527Code, 0, 4);
        c0032i.m44V(f / 2.0f, 1.0f, f2 / 2.0f);
        c0032i.Code(new byte[]{b3, b4, b3, b2, b, b4, b, b2}, 0, 4);
        return c0032i;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    private Object m239Code(int i) {
        for (int i2 = 0; i2 < this.f352F; i2++) {
            if (this.f533Code[i2] == i) {
                return this.f536Code[i2];
            }
        }
        return null;
    }

    public static final Image2D Code(long j, int i) {
        Image imageM244Code = RunnableC0025bt.f462Code.m244Code(j);
        if (imageM244Code != null) {
            return new Image2D(i, imageM244Code);
        }
        return null;
    }

    private final void Code(byte b, int i, int i2, long j) {
        Group group;
        Object3D object3DFind;
        Object3D object3D;
        Appearance appearance = null;
        switch (b) {
            case 1:
                this.f531Code.Code((int) j, Image.createImage(this.f355V, i, i2));
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 15:
                C0031g c0031g = new C0031g();
                c0031g.Code(this.f355V, i, i2);
                this.f531Code.Code((int) j, c0031g);
                break;
            case 5:
                Object3D[] object3DArrLoad = Loader.load(this.f355V, i);
                Object3D object3D2 = null;
                int i3 = 0;
                while (true) {
                    if (i3 < object3DArrLoad.length) {
                        object3DFind = object3DArrLoad[i3].find(1);
                        if (object3DFind == null) {
                            i3++;
                            object3D2 = object3DFind;
                        } else {
                            group = (Group) object3DArrLoad[i3];
                        }
                    } else {
                        group = null;
                        object3DFind = object3D2;
                    }
                }
                if (object3DFind == null || !(object3DFind instanceof Group)) {
                    object3D = object3DArrLoad[0];
                } else {
                    group.removeChild((Node) object3DFind);
                    object3D = object3DFind;
                }
                Code((int) j, new C0010as((Group) object3D));
                for (int i4 = 0; i4 < object3DArrLoad.length; i4++) {
                    object3DArrLoad[i4] = null;
                }
                break;
            case 8:
                try {
                    Code((int) j, new Image2D(99, Image.createImage(this.f355V, i, i2)));
                } catch (Exception e) {
                    return;
                }
                break;
            case 9:
                int i5 = i + 4;
                int i6 = 4;
                while (i6 < i2) {
                    int i7 = i5 + 4;
                    int iM238Code = m238Code(this.f355V, i5);
                    int i8 = iM238Code + 9 + i6;
                    long jM238Code = m238Code(this.f355V, i7);
                    int i9 = i7 + 4;
                    int i10 = i9 + 1;
                    Code(this.f355V[i9], i10, iM238Code, jM238Code);
                    i5 = i10 + iM238Code;
                    i6 = i8;
                }
                break;
            case 11:
                int i11 = i + 4;
                int i12 = i2 - 4;
                int iM238Code2 = m238Code(this.f355V, i);
                short[] sArr = new short[iM238Code2 / 2];
                int i13 = 0;
                while (i13 < iM238Code2 / 2) {
                    sArr[i13] = m194V(this.f355V, i11);
                    i13++;
                    i11 += 2;
                }
                Image imageCreateImage = Image.createImage(this.f355V, i11, i12 - iM238Code2);
                C0031g c0031g2 = new C0031g(false, false, false, false, false, false, false);
                c0031g2.Code(imageCreateImage, sArr);
                this.f531Code.Code((int) j, c0031g2);
                break;
            case 12:
                World[] worldArrLoad = Loader.load(this.f355V, i);
                for (int i14 = 0; i14 < worldArrLoad.length; i14++) {
                    if (worldArrLoad[i14].find(0) != null) {
                        World world = worldArrLoad[i14];
                        worldArrLoad[i14] = null;
                        Mesh child = world.getChild(0);
                        Appearance appearance2 = child.getAppearance(0);
                        child.setAppearance(0, (Appearance) null);
                        appearance = appearance2;
                        C0028d c0028d = new C0028d();
                        c0028d.Code = appearance;
                        Code((int) j, c0028d);
                    } else {
                        worldArrLoad[i14] = null;
                    }
                    break;
                }
                C0028d c0028d2 = new C0028d();
                c0028d2.Code = appearance;
                Code((int) j, c0028d2);
                break;
        }
    }

    private final void Code(byte b, DataInputStream dataInputStream, int i, long j) throws IOException {
        Object3D object3DFind;
        Object3D object3D;
        int i2 = 4;
        Group group = null;
        switch (b) {
            case 1:
                dataInputStream.readFully(f524Code, 0, i);
                this.f531Code.Code((int) j, Image.createImage(f524Code, 0, i));
                break;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
                byte[] bArr = new byte[i];
                dataInputStream.readFully(bArr, 0, i);
                C0031g c0031g = new C0031g();
                c0031g.Code(bArr, 0, i);
                this.f531Code.Code((int) j, c0031g);
                break;
            case 5:
                byte[] bArr2 = new byte[i];
                dataInputStream.readFully(bArr2, 0, i);
                Object3D[] object3DArrLoad = Loader.load(bArr2, 0);
                Object3D object3D2 = null;
                int i3 = 0;
                while (true) {
                    if (i3 < object3DArrLoad.length) {
                        object3DFind = object3DArrLoad[i3].find(1);
                        if (object3DFind == null) {
                            i3++;
                            object3D2 = object3DFind;
                        } else {
                            group = (Group) object3DArrLoad[i3];
                        }
                    } else {
                        object3DFind = object3D2;
                    }
                }
                if (object3DFind == null || !(object3DFind instanceof Group)) {
                    object3D = object3DArrLoad[0];
                } else {
                    group.removeChild((Node) object3DFind);
                    object3D = object3DFind;
                }
                Code((int) j, new C0010as((Group) object3D));
                break;
            case 8:
                byte[] bArr3 = new byte[i];
                dataInputStream.readFully(bArr3, 0, i);
                Code((int) j, (Image2D) Loader.load(bArr3, 0)[0]);
                break;
            case 9:
                dataInputStream.readFully(new byte[4], 0, 4);
                while (i2 < i) {
                    int i4 = dataInputStream.readInt();
                    Code(dataInputStream.readByte(), dataInputStream, i4, dataInputStream.readInt());
                    i2 += i4 + 9;
                }
                break;
            case 11:
                int i5 = dataInputStream.readInt();
                byte[] bArr4 = new byte[i5];
                dataInputStream.readFully(bArr4, 0, i5);
                int i6 = (i - 4) - i5;
                byte[] bArr5 = new byte[i6];
                dataInputStream.readFully(bArr5, 0, i6);
                Image imageCreateImage = Image.createImage(bArr5, 0, i6);
                short[] sArr = new short[i5 / 2];
                for (int i7 = 0; i7 < i5 / 2; i7++) {
                    sArr[i7] = m194V(bArr4, i7 * 2);
                }
                C0031g c0031g2 = new C0031g(false, false, false, false, false, false, false);
                c0031g2.Code(imageCreateImage, sArr);
                this.f531Code.Code((int) j, c0031g2);
                break;
            case 12:
                byte[] bArr6 = new byte[i];
                dataInputStream.readFully(bArr6, 0, i);
                World[] worldArrLoad = Loader.load(bArr6, 0);
                for (int i8 = 0; i8 < worldArrLoad.length; i8++) {
                    if (worldArrLoad[i8].find(0) != null) {
                        Mesh child = worldArrLoad[i8].getChild(0);
                        Group appearance = child.getAppearance(0);
                        child.setAppearance(0, (Appearance) null);
                        group = appearance;
                        C0028d c0028d = new C0028d();
                        c0028d.Code = group;
                        Code((int) j, c0028d);
                    }
                    break;
                }
                C0028d c0028d2 = new C0028d();
                c0028d2.Code = group;
                Code((int) j, c0028d2);
                break;
        }
    }

    public static void Code(int i, int i2, int i3, int i4) {
        f344V = i;
        f342I = i2;
        f347Z = i3;
        f341B = i4;
    }

    private void Code(int i, Object obj) {
        for (int i2 = 0; i2 < this.f352F; i2++) {
            if (this.f533Code[i2] == 0) {
                this.f533Code[i2] = i;
                this.f536Code[i2] = obj;
                return;
            }
        }
    }

    public static final void Code(long[] jArr, int i, int i2) {
        int i3;
        long j;
        long j2;
        int i4 = i2 + 1;
        long j3 = jArr[(i + i2) / 2];
        int i5 = i - 1;
        int i6 = i2;
        int i7 = i;
        while (i5 + 1 < i4) {
            while (true) {
                i3 = i7;
                j = jArr[i3];
                if (i3 >= i4 || j >= j3) {
                    break;
                }
                i7 = i3 + 1;
                i5 = i3;
            }
            int i8 = i6;
            while (true) {
                j2 = jArr[i8];
                if (i5 > i8 || j2 <= j3) {
                    break;
                }
                i4 = i8;
                i8--;
            }
            if (i3 == i8) {
                i5 = i3;
                i6 = i8;
                i7 = i3;
            } else if (i3 >= i8 || j < j2) {
                i6 = i8;
                i7 = i3;
            } else {
                jArr[i3] = j2;
                jArr[i8] = j;
                i6 = i8 - 1;
                i7 = i3 + 1;
                i4 = i8;
                i5 = i3;
            }
        }
        if (i < i5) {
            Code(jArr, i, i5);
        }
        if (i4 < i2) {
            Code(jArr, i4, i2);
        }
    }

    public static final boolean Code(int i, int i2) {
        return ((1 << i2) & i) != 0;
    }

    public static boolean Code(String str) {
        try {
            RecordStore.deleteRecordStore(str);
            return true;
        } catch (RecordStoreNotFoundException e) {
            return true;
        } catch (RecordStoreException e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public static byte[] m240Code(String str) {
        RecordStore recordStoreOpenRecordStore;
        RecordStore recordStore;
        try {
            try {
                recordStoreOpenRecordStore = RecordStore.openRecordStore(str, false);
                try {
                    recordStoreOpenRecordStore.getNumRecords();
                    recordStoreOpenRecordStore.getRecordSize(1);
                    byte[] record = recordStoreOpenRecordStore.getRecord(1);
                    recordStoreOpenRecordStore.closeRecordStore();
                    try {
                        recordStoreOpenRecordStore.closeRecordStore();
                        return record;
                    } catch (RecordStoreException e) {
                        return record;
                    }
                } catch (RecordStoreFullException e2) {
                    if (recordStoreOpenRecordStore != null) {
                        recordStoreOpenRecordStore.closeRecordStore();
                        return 0;
                    }
                    return null;
                } catch (RecordStoreNotFoundException e3) {
                    if (recordStoreOpenRecordStore != null) {
                        try {
                            recordStoreOpenRecordStore.closeRecordStore();
                            return null;
                        } catch (RecordStoreException e4) {
                            return null;
                        }
                    }
                    return null;
                } catch (RecordStoreException e5) {
                    if (recordStoreOpenRecordStore != null) {
                        recordStoreOpenRecordStore.closeRecordStore();
                        return 0;
                    }
                    return null;
                } catch (IllegalArgumentException e6) {
                    recordStore = recordStoreOpenRecordStore;
                    if (recordStore != null) {
                        recordStore.closeRecordStore();
                        return 0;
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (recordStoreOpenRecordStore != null) {
                        try {
                            recordStoreOpenRecordStore.closeRecordStore();
                        } catch (RecordStoreException e7) {
                        }
                    }
                    throw th;
                }
            } catch (RecordStoreNotFoundException e8) {
                recordStoreOpenRecordStore = null;
            } catch (RecordStoreException e9) {
                recordStoreOpenRecordStore = null;
            } catch (RecordStoreFullException e10) {
                recordStoreOpenRecordStore = null;
            } catch (IllegalArgumentException e11) {
                recordStore = null;
            } catch (Throwable th2) {
                th = th2;
                recordStoreOpenRecordStore = null;
            }
        } catch (RecordStoreException e12) {
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    public static final short m191I(byte[] bArr, int i) {
        return (short) ((bArr[i] << 8) | (bArr[i + 1] & 255));
    }

    /* JADX INFO: renamed from: V */
    public static final int m192V(int i) {
        for (int i2 = 0; i2 < 32; i2++) {
            if (((i << i2) & Integer.MIN_VALUE) != 0) {
                return 31 - i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: V */
    public static final int m193V(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) + ((bArr[i + 2] & 255) << 8) + ((bArr[i + 1] & 255) << 16) + ((bArr[i] & 255) << 24);
    }

    /* JADX INFO: renamed from: V */
    public static final short m194V(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) + ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: V */
    public static boolean m195V(String str) {
        try {
            RecordStore.openRecordStore(str, false).closeRecordStore();
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        } catch (RecordStoreException e2) {
            return false;
        } catch (RecordStoreNotFoundException e3) {
            return false;
        }
    }

    @Override // p000.C0033j
    /* JADX INFO: renamed from: Code */
    public final int mo237Code() {
        for (int i = 0; i < this.f535Code.length; i++) {
            this.f535Code[i] = null;
        }
        this.f535Code = null;
        f525Code = null;
        this.f531Code = null;
        this.f533Code = null;
        this.f536Code = null;
        f523Code = null;
        this.f355V = null;
        return 0;
    }

    public final int Code(int i, int i2, int i3, String str) {
        Code = str;
        this.f355V = i <= 0 ? null : new byte[i];
        this.f535Code = new C0024br[4];
        Code(1, new C0024br(false));
        Code(0, (C0024br) new C0029e());
        f523Code = new StringBuffer(128);
        f523Code.insert(0, f345V);
        this.f531Code = this;
        this.f533Code = new int[i2];
        this.f536Code = new Object[i2];
        this.f352F = i2;
        f524Code = new byte[i3];
        ((C0033j) this).f518Code = 2;
        this.f351D = 3;
        return 0;
    }

    public final int Code(long[] jArr) {
        if (((C0033j) this).f518Code == 0 || ((C0033j) this).f518Code != 2) {
            return -1;
        }
        this.f534Code = jArr;
        this.f354S = 0;
        ((C0033j) this).f518Code = 6;
        return 0;
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final C0010as m241Code(long j) {
        return (C0010as) this.f531Code.m239Code((int) j);
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final C0028d m242Code(long j) {
        return (C0028d) m239Code((int) j);
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final C0031g m243Code(long j) {
        return (C0031g) m239Code((int) j);
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final Image m244Code(long j) {
        return (Image) this.f531Code.m239Code((int) j);
    }

    public final Image Code(long j, long j2) {
        C0031g c0031g = (C0031g) m239Code((int) j);
        System.arraycopy(c0031g.f507Code, c0031g.f500Code, f524Code, 33, c0031g.f313V);
        int i = c0031g.f313V + 33;
        C0031g c0031g2 = (C0031g) m239Code((int) j2);
        System.arraycopy(c0031g2.f507Code, c0031g2.f500Code, f524Code, i, c0031g2.f313V);
        int i2 = (c0031g2.f313V - 33) + i;
        System.arraycopy(f524Code, i2, f524Code, 0, 33);
        return Image.createImage(f524Code, 0, i2);
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final Image2D m245Code(long j) {
        return (Image2D) m239Code((int) j);
    }

    public final void Code() {
        if (this.f355V != null) {
            try {
                if (this.f530Code == null) {
                    this.f530Code = getClass().getResourceAsStream(new StringBuffer().append(f345V).append(Code).append(f343I).toString());
                }
                int i = this.f530Code.read(this.f355V, this.f353L, this.f355V.length - this.f353L < 1048576 ? this.f355V.length - this.f353L : 1048576);
                if (i != -1 && i != 0) {
                    this.f353L = i + this.f353L;
                    this.f356a = 10000 / (((this.f355V.length - 1) * 100) / this.f353L);
                    this.f354S--;
                } else {
                    this.f356a = 100;
                    this.f353L = this.f355V.length;
                    this.f530Code.close();
                    this.f532Code = true;
                }
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: renamed from: Code, reason: collision with other method in class */
    public final void m246Code(int i) {
        this.f535Code[i] = null;
    }

    public final void Code(int i, C0024br c0024br) {
        this.f535Code[i] = c0024br;
    }

    public final boolean Code(String str, byte[] bArr) {
        try {
            if (m195V(str)) {
                RecordStore.deleteRecordStore(str);
            }
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, true);
            recordStoreOpenRecordStore.addRecord(bArr, 0, bArr.length);
            recordStoreOpenRecordStore.closeRecordStore();
            return true;
        } catch (RecordStoreException | IllegalArgumentException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m196I() {
        if (((C0033j) this).f518Code == 6) {
            return -1;
        }
        f524Code = null;
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x0191  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    @Override // p000.C0033j
    /* JADX INFO: renamed from: V */
    public final int mo82V() {
        boolean z;
        int i;
        long j;
        boolean z2;
        if (((C0033j) this).f518Code != 6) {
            return 0;
        }
        do {
            if (RunnableC0025bt.f134C) {
                if (this.f354S > 0 && ((int) (this.f534Code[this.f354S] >> 32)) != -1) {
                    this.f354S--;
                    Code(this.f534Code[this.f354S]);
                    this.f528Code = this.f354S > 0 ? this.f534Code[this.f354S - 1] : -1;
                }
                RunnableC0025bt.f134C = false;
            }
            long j2 = this.f534Code[this.f354S];
            if (j2 == 0) {
                z = false;
                if (RunnableC0025bt.f134C) {
                    if (this.f354S >= 0 && ((int) (this.f534Code[this.f354S] >> 32)) != -1) {
                        Code(this.f534Code[this.f354S]);
                        this.f354S--;
                        if (this.f354S > 0) {
                            j = this.f534Code[this.f354S - 1];
                        } else {
                            j = -1;
                        }
                        this.f528Code = j;
                    }
                    RunnableC0025bt.f134C = false;
                }
                this.f354S++;
                if (this.f354S == this.f534Code.length) {
                    ((C0033j) this).f518Code = 2;
                }
                if (z) {
                    i = 32768;
                } else {
                    i = 0;
                }
            } else {
                if (((int) (j2 >> 32)) != -1) {
                    C0037t c0037t = this.f531Code;
                    InputStream inputStream = c0037t.f530Code;
                    int i2 = 0;
                    int i3 = (int) j2;
                    while (true) {
                        if (i2 >= c0037t.f352F) {
                            z2 = false;
                            break;
                        }
                        if (c0037t.f533Code[i2] == i3) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    if (z2) {
                        z = true;
                        this.f528Code = j2;
                    } else {
                        this.f351D = 3;
                        boolean z3 = false;
                        while (true) {
                            if (z3) {
                                z = false;
                            } else {
                                try {
                                    if (this.f532Code) {
                                        int i4 = (int) (j2 >> 32);
                                        int i5 = i4 + 4;
                                        int iM238Code = m238Code(this.f355V, i4);
                                        int iM238Code2 = m238Code(this.f355V, i5);
                                        int i6 = i5 + 4;
                                        int i7 = i6 + 1;
                                        byte b = this.f355V[i6];
                                        if ((b & 64) == 64) {
                                            b = (byte) (b & (-65));
                                        }
                                        if ((b & (-128)) == -128) {
                                            byte b2 = (byte) (b & 127);
                                            int iM238Code3 = m238Code(this.f355V, i7);
                                            int length = f345V.length();
                                            int i8 = i7 + 4;
                                            for (int i9 = 0; i9 < iM238Code - 4; i9++) {
                                                f523Code.append((char) this.f355V[i8]);
                                                i8++;
                                            }
                                            String string = f523Code.toString();
                                            if (b2 != 1) {
                                                this.f530Code = getClass().getResourceAsStream(string);
                                                this.f529Code = new DataInputStream(this.f530Code);
                                                Code(b2, this.f529Code, iM238Code3, iM238Code2);
                                                this.f529Code.close();
                                                this.f530Code = null;
                                                this.f529Code = null;
                                            } else {
                                                try {
                                                    this.f531Code.Code(iM238Code2, Image.createImage(string));
                                                } catch (IOException e) {
                                                }
                                            }
                                            f523Code.delete(length, 128 - length);
                                        } else {
                                            Code(b, i7, iM238Code, iM238Code2);
                                        }
                                    }
                                } catch (Exception e2) {
                                }
                                if (this.f531Code.m239Code((int) j2) == null) {
                                    this.f351D--;
                                    if (this.f351D < 0) {
                                        i = -1;
                                    }
                                } else {
                                    this.f528Code = j2;
                                    z3 = true;
                                }
                            }
                        }
                    }
                } else {
                    long j3 = this.f528Code;
                    try {
                        this.f535Code[(int) j2].Code();
                    } catch (Exception e3) {
                    }
                    this.f528Code = -1;
                    z = false;
                }
                if (RunnableC0025bt.f134C) {
                    if (this.f354S >= 0) {
                        Code(this.f534Code[this.f354S]);
                        this.f354S--;
                        if (this.f354S > 0) {
                            j = this.f534Code[this.f354S - 1];
                        } else {
                            j = -1;
                        }
                        this.f528Code = j;
                    }
                    RunnableC0025bt.f134C = false;
                }
                this.f354S++;
                if (this.f354S == this.f534Code.length) {
                    ((C0033j) this).f518Code = 2;
                }
                if (z) {
                    i = 0;
                } else {
                    i = 32768;
                }
            }
        } while (i == 32768);
        return i;
    }

    /* JADX INFO: renamed from: V */
    public final int m197V(long[] jArr) {
        for (int length = jArr.length - 1; length > -1; length--) {
            if (((int) (jArr[length] >> 32)) != -1) {
                Code(jArr[length]);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: V */
    public final C0010as m198V(long j) {
        return new C0010as(((C0010as) this.f531Code.m239Code((int) j)).Code().duplicate());
    }

    /* JADX INFO: renamed from: V */
    public final C0031g m199V(long j) {
        return m243Code(j);
    }

    /* JADX INFO: renamed from: V */
    public final void m200V() {
        f525Code = new C0015b[f344V];
        byte[] bArr = f524Code;
        try {
            DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream(new StringBuffer().append(f345V).append(new StringBuffer().append("cUItext_").append(f526Code[this.f350C]).append(f348Z).toString()).toString()));
            try {
                dataInputStream.read(bArr);
            } catch (Exception e) {
            }
            dataInputStream.close();
        } catch (Exception e2) {
        }
        int i = 0;
        int i2 = 0;
        while (i < f344V) {
            try {
                byte[] bArr2 = f524Code;
                short s = (short) (((bArr2[i2 + 1] & 255) << 8) + (bArr2[i2] & 255));
                int i3 = i2 + 2;
                f525Code[i] = new C0015b(f524Code, i3, s);
                i++;
                i2 = i3 + s;
            } catch (Exception e3) {
            }
        }
        f525Code[f342I].Code(RunnableC0025bt.f147V.getBytes(), new byte[]{35});
    }

    /* JADX INFO: renamed from: V */
    public final void m201V(int i) {
        C0024br[] c0024brArr;
        if (this.f535Code.length == i || i < 2) {
            return;
        }
        C0024br[] c0024brArr2 = new C0024br[i];
        if (this.f535Code.length <= i) {
            c0024brArr = this.f535Code;
            i = this.f535Code.length;
        } else {
            c0024brArr = this.f535Code;
        }
        System.arraycopy(c0024brArr, 0, c0024brArr2, 0, i);
        this.f535Code = c0024brArr2;
    }

    /* JADX INFO: renamed from: Z */
    public final int m202Z() {
        if (((C0033j) this).f518Code == 2) {
            return 100;
        }
        if (((C0033j) this).f518Code != 6 || this.f534Code.length <= 0 || this.f354S <= 0) {
            return 0;
        }
        return (((10000 / (((this.f534Code.length - 1) * 100) / this.f354S)) / 4) * 3) + (this.f356a / 4);
    }

    /* JADX INFO: renamed from: a */
    public final C0031g m203a(long j) {
        return (C0031g) this.f531Code.m239Code((int) j);
    }
}
