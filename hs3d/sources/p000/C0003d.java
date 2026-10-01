package p000;

import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: C:\Temp\jadx-62219550241199143\classes.dex */
public class C0003d {

    /* JADX INFO: renamed from: a */
    byte f123a;

    /* JADX INFO: renamed from: a */
    Texture2D f124a;

    public C0003d() {
    }

    C0003d(byte b) {
        this.f124a = null;
        this.f123a = (byte) 99;
    }

    C0003d(byte b, short s, String str, boolean z) {
        this.f124a = null;
        this.f123a = b;
        Image imageM176a = z ? C0011l.m176a(str) : C0011l.m202b(str);
        if (imageM176a == null) {
            RunnableC0008i.m124a(true, new StringBuffer().append("t1: ").append(str).toString());
            return;
        }
        this.f124a = null;
        this.f124a = new Texture2D(new Image2D(this.f123a, imageM176a));
        this.f124a.setBlending(228);
    }

    C0003d(byte b, short s, Image image) {
        this.f124a = null;
        this.f123a = (byte) 99;
        if (image == null) {
            RunnableC0008i.m124a(true, "t3");
            return;
        }
        this.f124a = null;
        this.f124a = new Texture2D(new Image2D(this.f123a, image));
        this.f124a.setBlending(228);
    }

    /* JADX INFO: renamed from: a */
    private static final int m37a(int i) {
        if (i < 0) {
            return i + 253;
        }
        return i > 252 ? i - 253 : i;
    }

    /* JADX INFO: renamed from: a */
    private static final int m38a(int i, int i2, int i3) {
        if (i <= 0) {
            return i2;
        }
        if (i >= 100) {
            return i3;
        }
        int i4 = (i2 >> 16) & 255;
        int i5 = (i2 >> 8) & 255;
        int i6 = i2 & 255;
        return C0011l.m169a(255, i4 + (((((i3 >> 16) & 255) - i4) * i) / 100), i5 + (((((i3 >> 8) & 255) - i5) * i) / 100), i6 + ((((i3 & 255) - i6) * i) / 100));
    }

    /* JADX INFO: renamed from: a */
    private static long m39a(byte b) {
        long j = 10;
        for (byte b2 = 1; b2 < b; b2 = (byte) (b2 + 1)) {
            j *= 10;
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    static final Image m40a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        InputStream resourceAsStream;
        InputStream inputStream;
        int[] iArr;
        int iM38a;
        float f;
        float f2;
        int i8;
        int[] iArr2 = new int[49120];
        int[][] iArr3 = null;
        try {
            resourceAsStream = HSpeed.f0a.getClass().getResourceAsStream(str);
            try {
                float f3 = resourceAsStream.read() / 25.5f;
                int i9 = resourceAsStream.read();
                int i10 = resourceAsStream.read() - i9;
                int i11 = resourceAsStream.read();
                int i12 = resourceAsStream.read() - i11;
                if (307 / 160 > f3) {
                    i4 = 1;
                }
                if ((i4 != 2 || f3 <= 1.0f) && (i4 != 1 || f3 >= 1.0f)) {
                    f = 160 * f3;
                    f2 = 160;
                } else {
                    f = 307;
                    f2 = 307 / f3;
                }
                int i13 = (int) (i9 + ((f - 307) / 2.0f));
                int i14 = (int) (i11 + ((f2 - 160) / 2.0f));
                float f4 = (((int) f) * 2.0f) / i10;
                float f5 = (((int) f2) * 2.0f) / i12;
                int i15 = resourceAsStream.read() + 1;
                int i16 = resourceAsStream.read();
                iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i15 + i16, 7);
                iArr3[0][0] = -1;
                iArr3[0][1] = -1;
                int i17 = 1;
                while (i17 < i15) {
                    iArr3[i17][0] = -1;
                    iArr3[i17][1] = C0011l.m169a(255, resourceAsStream.read(), resourceAsStream.read(), resourceAsStream.read());
                    i17++;
                }
                while (i17 < i15 + i16) {
                    iArr3[i17] = new int[7];
                    iArr3[i17][0] = resourceAsStream.read();
                    if (iArr3[i17][0] == 0) {
                        iArr3[i17][1] = C0011l.m166a((resourceAsStream.read() - i13) * f4);
                        iArr3[i17][2] = C0011l.m166a((resourceAsStream.read() - i14) * f5);
                        iArr3[i17][3] = C0011l.m166a((resourceAsStream.read() - i13) * f4);
                        iArr3[i17][4] = C0011l.m166a((resourceAsStream.read() - i14) * f5);
                        iArr3[i17][5] = resourceAsStream.read() + 1;
                        iArr3[i17][6] = resourceAsStream.read() + 1;
                    } else {
                        iArr3[i17][1] = C0011l.m166a((resourceAsStream.read() - i13) * f4);
                        iArr3[i17][2] = C0011l.m166a((resourceAsStream.read() - i14) * f5);
                        iArr3[i17][3] = C0011l.m166a(resourceAsStream.read() * f5);
                        iArr3[i17][4] = resourceAsStream.read() + 1;
                        iArr3[i17][5] = resourceAsStream.read() + 1;
                    }
                    i17++;
                }
                int i18 = 0;
                int i19 = 0;
                int[] iArr4 = new int[2];
                int i20 = 0;
                int i21 = 0;
                boolean z = false;
                float f6 = 0.0f;
                int i22 = 0;
                while (true) {
                    if (z) {
                        z = false;
                        i20 = i20;
                        i21 = 0;
                        f6 = f6;
                        i22 = i22;
                    } else {
                        int i23 = resourceAsStream.read();
                        if (i23 != -1) {
                            switch (i23) {
                                case 0:
                                    i20 = i23;
                                    i21 = resourceAsStream.read() + 1;
                                    f6 = f6;
                                    i22 = i22;
                                    break;
                                case 1:
                                    int i24 = resourceAsStream.read() + 1;
                                    i20 = i23;
                                    i21 = i21;
                                    f6 = (resourceAsStream.read() * f5) / 10.0f;
                                    i22 = i24;
                                    break;
                                case 2:
                                    i21 = resourceAsStream.read() + 1;
                                    i22 = resourceAsStream.read() + 1;
                                    f6 = (resourceAsStream.read() * f5) / 10.0f;
                                default:
                                    i20 = i23;
                                    i21 = i21;
                                    f6 = f6;
                                    i22 = i22;
                                    break;
                            }
                        } else {
                            if (resourceAsStream != null) {
                                try {
                                    resourceAsStream.close();
                                } catch (Exception e) {
                                    iArr = iArr2;
                                }
                            }
                            iArr = iArr2;
                            int[] iArr5 = new int[4];
                            int[] iArr6 = new int[4];
                            int i25 = 0;
                            int i26 = 0;
                            while (true) {
                                int i27 = i26;
                                if (i27 >= 160) {
                                    return Image.createRGBImage(iArr, 307, 160, false);
                                }
                                int i28 = 0;
                                while (true) {
                                    int i29 = i28;
                                    if (i29 < 307) {
                                        int i30 = 0;
                                        int i31 = 0;
                                        C0011l.m187a(iArr5, iArr[(i27 * 307) + i29]);
                                        int i32 = 0;
                                        int i33 = 0;
                                        while (i32 < 4) {
                                            int i34 = i29 << 1;
                                            int i35 = i32 > 1 ? i34 + 1 : i34;
                                            int i36 = i27 << 1;
                                            if (i32 == 1 || i32 == 3) {
                                                i36++;
                                            }
                                            switch (iArr3[iArr5[i32]][0]) {
                                                case -1:
                                                    iM38a = iArr3[iArr5[i32]][1];
                                                    break;
                                                case 0:
                                                    int i37 = iArr3[iArr5[i32]][3] - iArr3[iArr5[i32]][1];
                                                    int i38 = iArr3[iArr5[i32]][4] - iArr3[iArr5[i32]][2];
                                                    iM38a = m38a(((((i36 - iArr3[iArr5[i32]][2]) * i38) + ((i35 - iArr3[iArr5[i32]][1]) * i37)) * 100) / ((i37 * i37) + (i38 * i38)), iArr3[iArr3[iArr5[i32]][5]][1], iArr3[iArr3[iArr5[i32]][6]][1]);
                                                    break;
                                                case 1:
                                                    int i39 = iArr3[iArr5[i32]][1] - i35;
                                                    int i40 = iArr3[iArr5[i32]][2] - i36;
                                                    iM38a = m38a((int) ((Math.sqrt((i40 * i40) + (i39 * i39)) * 100.0d) / ((double) iArr3[iArr5[i32]][3])), iArr3[iArr3[iArr5[i32]][4]][1], iArr3[iArr3[iArr5[i32]][5]][1]);
                                                    break;
                                                default:
                                                    iM38a = i25;
                                                    break;
                                            }
                                            C0011l.m187a(iArr6, iM38a);
                                            i30 += iArr6[1];
                                            i31 += iArr6[2];
                                            i33 += iArr6[3];
                                            i32++;
                                            i25 = iM38a;
                                        }
                                        iArr[(i27 * 307) + i29] = C0011l.m169a(255, i30 / 4, i31 / 4, i33 / 4);
                                        i28 = i29 + 1;
                                    }
                                }
                                i26 = i27 + 1;
                            }
                        }
                    }
                    int[] iArr7 = new int[500];
                    int[] iArr8 = new int[500];
                    byte b = (byte) resourceAsStream.read();
                    byte b2 = (byte) resourceAsStream.read();
                    int iM37a = m37a(b + i18);
                    int iM37a2 = m37a(b2 + i19);
                    iArr7[0] = C0011l.m166a((iM37a - i13) * f4);
                    iArr8[0] = C0011l.m166a((iM37a2 - i14) * f5);
                    int i41 = 1;
                    i18 = iM37a;
                    i19 = iM37a2;
                    while (true) {
                        byte b3 = (byte) resourceAsStream.read();
                        if (b3 == 127) {
                            z = z;
                        } else if (b3 == 126) {
                            byte b4 = (byte) resourceAsStream.read();
                            byte b5 = (byte) resourceAsStream.read();
                            int iM37a3 = m37a(b4 + i18);
                            int iM37a4 = m37a(b5 + i19);
                            iArr7[i41] = C0011l.m166a((iM37a3 - i13) * f4);
                            iArr8[i41] = C0011l.m166a((iM37a4 - i14) * f5);
                            i41++;
                            i18 = iM37a3;
                            i19 = iM37a4;
                        } else if (b3 == 125) {
                            z = true;
                        } else {
                            int iM37a5 = m37a(b3 + i18);
                            int iM37a6 = m37a(((byte) resourceAsStream.read()) + i19);
                            int iM37a7 = m37a(((byte) resourceAsStream.read()) + iM37a5);
                            int iM37a8 = m37a(((byte) resourceAsStream.read()) + iM37a6);
                            int iM37a9 = m37a(((byte) resourceAsStream.read()) + iM37a7);
                            int iM37a10 = m37a(((byte) resourceAsStream.read()) + iM37a8);
                            int iM166a = C0011l.m166a((iM37a5 - i13) * f4);
                            int iM166a2 = C0011l.m166a((iM37a6 - i14) * f5);
                            int iM166a3 = C0011l.m166a((iM37a7 - i13) * f4);
                            int iM166a4 = C0011l.m166a((iM37a8 - i14) * f5);
                            int iM166a5 = C0011l.m166a((iM37a9 - i13) * f4);
                            int iM166a6 = C0011l.m166a((iM37a10 - i14) * f5);
                            int iM166a7 = C0011l.m166a((i18 - i13) * f4);
                            int iM166a8 = C0011l.m166a((i19 - i14) * f5);
                            int i42 = 1;
                            int i43 = iM166a7;
                            int i44 = iM166a8;
                            while (i42 < i) {
                                m42a(iArr4, (1.0f * i42) / i, iM166a7, iM166a8, iM166a, iM166a2, iM166a3, iM166a4, iM166a5, iM166a6);
                                if (((i43 - iArr4[0]) * (i43 - iArr4[0])) + ((i44 - iArr4[1]) * (i44 - iArr4[1])) > 30) {
                                    i43 = iArr4[0];
                                    iArr7[i41] = i43;
                                    i44 = iArr4[1];
                                    iArr8[i41] = i44;
                                    i8 = i41 + 1;
                                } else {
                                    i8 = i41;
                                }
                                i42++;
                                i41 = i8;
                            }
                            iArr7[i41] = C0011l.m166a((iM37a9 - i13) * f4);
                            iArr8[i41] = C0011l.m166a((iM37a10 - i14) * f5);
                            i41++;
                            i18 = iM37a9;
                            i19 = iM37a10;
                        }
                    }
                    int[] iArr9 = new int[i41];
                    System.arraycopy(iArr7, 0, iArr9, 0, i41);
                    int[] iArr10 = new int[i41];
                    System.arraycopy(iArr8, 0, iArr10, 0, i41);
                    switch (i20) {
                        case 0:
                            m44a(iArr2, iArr9, iArr10, i21, 307);
                            continue;
                        case 1:
                            m43a(iArr2, iArr9, iArr10, i22, f6, 307);
                            continue;
                        case 2:
                            m44a(iArr2, iArr9, iArr10, i21, 307);
                            m43a(iArr2, iArr9, iArr10, i22, f6, 307);
                            break;
                    }
                }
            } catch (Exception e2) {
                inputStream = resourceAsStream;
                iArr = null;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e3) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (resourceAsStream == null) {
                    throw th;
                }
                try {
                    resourceAsStream.close();
                    throw th;
                } catch (Exception e4) {
                    throw th;
                }
            }
        } catch (Exception e5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            resourceAsStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final void m41a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (m45a(i5, i6, i, i2, i3, i4)) {
            i9 = i4;
            i10 = i3;
            i11 = i6;
            i12 = i5;
        } else {
            i9 = i6;
            i10 = i5;
            i11 = i4;
            i12 = i3;
        }
        int i14 = i - i12;
        int i15 = i12 - i10;
        int i16 = i10 - i;
        int i17 = i2 - i11;
        int i18 = i11 - i9;
        int i19 = i9 - i2;
        int iMin = Math.min(i, Math.min(i12, i10));
        int iMax = Math.max(i, Math.max(i12, i10));
        int iMin2 = Math.min(i2, Math.min(i11, i9));
        int iMax2 = Math.max(i2, Math.max(i11, i9));
        int i20 = (i17 * i) - (i14 * i2);
        int i21 = (i12 * i18) - (i11 * i15);
        int i22 = (i10 * i19) - (i9 * i16);
        int i23 = (i17 < 0 || (i17 == 0 && i14 > 0)) ? i20 + 1 : i20;
        int i24 = (i18 < 0 || (i18 == 0 && i15 > 0)) ? i21 + 1 : i21;
        if (i19 < 0 || (i19 == 0 && i16 > 0)) {
            i22++;
        }
        int i25 = ((i14 * iMin2) + i23) - (i17 * iMin);
        int i26 = (i24 + (i15 * iMin2)) - (i18 * iMin);
        int i27 = (i22 + (i16 * iMin2)) - (i19 * iMin);
        for (int i28 = iMin2; i28 < iMax2; i28++) {
            int i29 = i27;
            int i30 = i26;
            int i31 = i25;
            for (int i32 = iMin; i32 < iMax; i32++) {
                if (i31 > 0 && i30 > 0 && i29 > 0 && (i13 = ((i28 / 2) * i8) + (i32 / 2)) >= 0 && i13 < iArr.length) {
                    int i33 = iArr[i13] >>> 24;
                    int i34 = (iArr[i13] >> 16) & 255;
                    int i35 = (iArr[i13] >> 8) & 255;
                    int i36 = iArr[i13] & 255;
                    if (i32 % 2 == 0) {
                        if (i28 % 2 == 0) {
                            iArr[i13] = C0011l.m169a(i7, i34, i35, i36);
                        } else {
                            iArr[i13] = C0011l.m169a(i33, i7, i35, i36);
                        }
                    } else if (i28 % 2 == 0) {
                        iArr[i13] = C0011l.m169a(i33, i34, i7, i36);
                    } else {
                        iArr[i13] = C0011l.m169a(i33, i34, i35, i7);
                    }
                }
                i31 -= i17;
                i30 -= i18;
                i29 -= i19;
            }
            i25 += i14;
            i26 += i15;
            i27 += i16;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final void m42a(int[] iArr, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f2 = 1.0f - f;
        float f3 = f2 * f2 * f2;
        float f4 = 3.0f * f * f2 * f2;
        float f5 = f2 * 3.0f * f * f;
        float f6 = f * f * f;
        iArr[0] = (int) ((i * f3) + (i3 * f4) + (i5 * f5) + (i7 * f6));
        iArr[1] = (int) ((f5 * i6) + (f3 * i2) + (f4 * i4) + (i8 * f6));
    }

    /* JADX INFO: renamed from: a */
    private static final void m43a(int[] iArr, int[] iArr2, int[] iArr3, int i, float f, int i2) {
        int length = iArr2.length - 1;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr3[i3 + 1] - iArr3[i3];
            int i5 = -(iArr2[i3 + 1] - iArr2[i3]);
            if (i4 != 0 || i5 != 0) {
                if (f <= 1.0f) {
                    int i6 = iArr2[i3];
                    int i7 = iArr3[i3];
                    int i8 = iArr2[i3 + 1] - i6;
                    int i9 = iArr3[i3 + 1] - i7;
                    if (Math.abs(i8) > Math.abs(i9)) {
                        int i10 = i8 > 0 ? 1 : -1;
                        for (int i11 = 0; i11 != i8; i11 += i10) {
                            int i12 = (i9 * i11) / i8;
                            int i13 = (((i7 + i12) / 2) * i2) + ((i6 + i11) / 2);
                            if (i13 >= 0 && i13 < iArr.length) {
                                int i14 = iArr[i13] >>> 24;
                                int i15 = (iArr[i13] >> 16) & 255;
                                int i16 = (iArr[i13] >> 8) & 255;
                                int i17 = iArr[i13] & 255;
                                if (i11 % 2 == 0) {
                                    if (i12 % 2 == 0) {
                                        iArr[i13] = C0011l.m169a(i, i15, i16, i17);
                                    } else {
                                        iArr[i13] = C0011l.m169a(i14, i, i16, i17);
                                    }
                                } else if (i12 % 2 == 0) {
                                    iArr[i13] = C0011l.m169a(i14, i15, i, i17);
                                } else {
                                    iArr[i13] = C0011l.m169a(i14, i15, i16, i);
                                }
                            }
                        }
                    } else {
                        int i18 = i9 > 0 ? 1 : -1;
                        for (int i19 = 0; i19 != i9; i19 += i18) {
                            int i20 = (i8 * i19) / i9;
                            int i21 = (((i7 + i19) / 2) * i2) + ((i6 + i20) / 2);
                            if (i21 >= 0 && i21 < iArr.length) {
                                int i22 = iArr[i21] >>> 24;
                                int i23 = (iArr[i21] >> 16) & 255;
                                int i24 = (iArr[i21] >> 8) & 255;
                                int i25 = iArr[i21] & 255;
                                if (i20 % 2 == 0) {
                                    if (i19 % 2 == 0) {
                                        iArr[i21] = C0011l.m169a(i, i23, i24, i25);
                                    } else {
                                        iArr[i21] = C0011l.m169a(i22, i, i24, i25);
                                    }
                                } else if (i19 % 2 == 0) {
                                    iArr[i21] = C0011l.m169a(i22, i23, i, i25);
                                } else {
                                    iArr[i21] = C0011l.m169a(i22, i23, i24, i);
                                }
                            }
                        }
                    }
                } else {
                    float fSqrt = ((float) Math.sqrt((i4 * i4) + (i5 * i5))) * 2.0f;
                    int iM166a = C0011l.m166a((i4 * f) / fSqrt);
                    int iM166a2 = C0011l.m166a((i5 * f) / fSqrt);
                    m41a(iArr2[i3] - iM166a, iArr3[i3] - iM166a2, iArr2[i3 + 1] - iM166a, iArr3[i3 + 1] - iM166a2, iArr2[i3] + iM166a, iArr3[i3] + iM166a2, i, iArr, i2);
                    m41a(iArr2[i3 + 1] - iM166a, iArr3[i3 + 1] - iM166a2, iArr2[i3 + 1] + iM166a, iArr3[i3 + 1] + iM166a2, iArr2[i3] + iM166a, iArr3[i3] + iM166a2, i, iArr, i2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01ac  */
    /* JADX INFO: renamed from: a */
    private static final void m44a(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        while (iArr2.length > 2) {
            int i9 = 0;
            int i10 = iArr2[0];
            int i11 = 1;
            while (true) {
                i3 = i9;
                if (i11 >= iArr2.length) {
                    break;
                }
                if (iArr2[i11] < i10) {
                    i10 = iArr2[i11];
                    i9 = i11;
                } else {
                    i9 = i3;
                }
                i11++;
            }
            int length = (i3 + 1) % iArr2.length;
            int length2 = i3 > 0 ? i3 - 1 : iArr2.length - 1;
            int i12 = -1;
            boolean z3 = false;
            if (iArr2.length > 3) {
                int i13 = 0;
                while (i13 < iArr2.length) {
                    if (i13 == i3 || i13 == length || i13 == length2) {
                        z = z3;
                        i4 = i12;
                    } else {
                        int i14 = iArr2[i13];
                        int i15 = iArr3[i13];
                        int i16 = iArr2[i3];
                        int i17 = iArr3[i3];
                        int i18 = iArr2[length];
                        int i19 = iArr3[length];
                        int i20 = iArr2[length2];
                        int i21 = iArr3[length2];
                        if (i14 < Math.min(i16, Math.min(i18, i20)) || i14 > Math.max(i16, Math.max(i18, i20)) || i15 < Math.min(i17, Math.min(i19, i21)) || i15 > Math.max(i17, Math.max(i19, i21))) {
                            z2 = false;
                        } else {
                            if (m45a(i20, i21, i16, i17, i18, i19)) {
                                i5 = i19;
                                i6 = i18;
                                i7 = i21;
                                i8 = i20;
                            } else {
                                i5 = i21;
                                i6 = i20;
                                i7 = i19;
                                i8 = i18;
                            }
                            z2 = (m45a(i14, i15, i16, i17, i8, i7) || m45a(i14, i15, i8, i7, i6, i5) || m45a(i14, i15, i6, i5, i16, i17)) ? false : true;
                        }
                        if (!z2 || (z3 && iArr2[i13] >= iArr2[i12])) {
                            z = z3;
                            i4 = i12;
                        } else {
                            z = true;
                            i4 = i13;
                        }
                    }
                    i13++;
                    z3 = z;
                    i12 = i4;
                }
            }
            if (z3) {
                int length3 = i12 < i3 ? (iArr2.length - i3) + i12 + 1 : (i12 - i3) + 1;
                int length4 = (iArr2.length - length3) + 2;
                int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, length3);
                int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, length4);
                for (int i22 = 0; i22 < length3; i22++) {
                    int length5 = (i3 + i22) % iArr2.length;
                    iArr4[0][i22] = iArr2[length5];
                    iArr4[1][i22] = iArr3[length5];
                }
                for (int i23 = 0; i23 < length4; i23++) {
                    int length6 = (i12 + i23) % iArr2.length;
                    iArr5[0][i23] = iArr2[length6];
                    iArr5[1][i23] = iArr3[length6];
                }
                int[][][] iArr6 = {iArr4, iArr5};
                int[][] iArr7 = iArr6[0];
                int[][] iArr8 = iArr6[1];
                m44a(iArr, iArr7[0], iArr7[1], i, i2);
                m44a(iArr, iArr8[0], iArr8[1], i, i2);
                return;
            }
            m41a(iArr2[i3], iArr3[i3], iArr2[length], iArr3[length], iArr2[length2], iArr3[length2], i, iArr, i2);
            int[] iArr9 = new int[iArr2.length - 1];
            int[] iArr10 = new int[iArr3.length - 1];
            int[][] iArr11 = {iArr9, iArr10};
            int i24 = 0;
            for (int i25 = 0; i25 < iArr2.length; i25++) {
                if (i25 != i3) {
                    iArr9[i24] = iArr2[i25];
                    iArr10[i24] = iArr3[i25];
                    i24++;
                }
            }
            iArr2 = iArr11[0];
            iArr3 = iArr11[1];
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m45a(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((i5 - i3) * (i2 - i4)) - ((i6 - i4) * (i - i3)) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0140 A[Catch: Exception -> 0x0182, TRY_LEAVE, TryCatch #8 {Exception -> 0x0182, blocks: (B:55:0x013b, B:57:0x0140), top: B:81:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    static Object[] m46a(String str, float[] fArr) throws Throwable {
        DataInputStream dataInputStream;
        InputStream inputStreamM172a;
        int[] iArr;
        int[] iArr2;
        short[] sArr;
        short[] sArr2;
        short[] sArr3;
        float f = 1.0f;
        try {
            inputStreamM172a = C0011l.m172a(str);
            try {
                dataInputStream = new DataInputStream(inputStreamM172a);
                try {
                    try {
                        short s = dataInputStream.readShort();
                        f = dataInputStream.readInt() / m39a(dataInputStream.readByte());
                        fArr[0] = dataInputStream.readInt() / m39a(dataInputStream.readByte());
                        fArr[1] = dataInputStream.readInt() / m39a(dataInputStream.readByte());
                        fArr[2] = dataInputStream.readInt() / m39a(dataInputStream.readByte());
                        if (str.equals("/p.apt")) {
                            f *= 1.5f;
                            fArr[0] = fArr[0] * 1.5f;
                            fArr[1] = fArr[1] * 1.5f;
                            fArr[2] = fArr[2] * 1.5f;
                        }
                        sArr2 = new short[s * 3];
                        for (int i = 0; i < s * 3; i++) {
                            sArr2[i] = dataInputStream.readShort();
                        }
                        if (C0013n.f479a) {
                            C0013n.f501b = sArr2;
                            C0013n.f479a = false;
                        }
                        if (str.equals("/f1.apt")) {
                            sArr3 = null;
                        } else {
                            sArr3 = new short[s << 1];
                            for (int i2 = 0; i2 < (s << 1); i2++) {
                                sArr3[i2] = dataInputStream.readByte();
                                if (sArr3[i2] < 0) {
                                    sArr3[i2] = (short) (sArr3[i2] + 256);
                                }
                            }
                        }
                        int i3 = dataInputStream.readShort();
                        int[] iArr3 = new int[i3];
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i3) {
                            iArr3[i4] = dataInputStream.readByte();
                            int i6 = iArr3[i4] + i5;
                            i4++;
                            i5 = i6;
                        }
                        iArr = new int[i5];
                        for (int i7 = 0; i7 < i5; i7++) {
                            iArr[i7] = dataInputStream.readShort();
                        }
                        try {
                            dataInputStream.close();
                            if (inputStreamM172a != null) {
                                inputStreamM172a.close();
                            }
                            iArr2 = iArr3;
                            sArr = sArr3;
                        } catch (Exception e) {
                            iArr2 = iArr3;
                            sArr = sArr3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                                if (inputStreamM172a != null) {
                                    inputStreamM172a.close();
                                }
                            } catch (Exception e2) {
                                throw th;
                            }
                        } else if (inputStreamM172a != null) {
                            inputStreamM172a.close();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    RunnableC0008i.m124a(false, new StringBuffer().append("em ").append(e).toString());
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (Exception e4) {
                            iArr = null;
                            iArr2 = null;
                            sArr = null;
                            sArr2 = null;
                        }
                    }
                    if (inputStreamM172a != null) {
                        inputStreamM172a.close();
                    }
                    iArr = null;
                    iArr2 = null;
                    sArr = null;
                    sArr2 = null;
                }
            } catch (Exception e5) {
                e = e5;
                dataInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
                if (dataInputStream != null) {
                    dataInputStream.close();
                    if (inputStreamM172a != null) {
                        inputStreamM172a.close();
                    }
                } else if (inputStreamM172a != null) {
                    inputStreamM172a.close();
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            dataInputStream = null;
            inputStreamM172a = null;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = null;
            inputStreamM172a = null;
        }
        if (sArr2 == null) {
            RunnableC0008i.m124a(true, new StringBuffer().append("v3 ").append(str).toString());
            return null;
        }
        VertexBuffer vertexBuffer = new VertexBuffer();
        VertexArray vertexArray = new VertexArray(sArr2.length / 3, 3, 2);
        vertexArray.set(0, sArr2.length / 3, sArr2);
        vertexBuffer.setPositions(vertexArray, f, fArr);
        if (sArr != null) {
            VertexArray vertexArray2 = new VertexArray(sArr.length / 2, 2, 2);
            vertexArray2.set(0, sArr.length / 2, sArr);
            vertexBuffer.setTexCoords(0, vertexArray2, 0.00390625f, (float[]) null);
        } else {
            vertexBuffer.setDefaultColor(-65536);
        }
        return new Object[]{vertexBuffer, new TriangleStripArray(iArr, iArr2)};
    }

    /* JADX INFO: renamed from: a */
    Texture2D m47a() {
        return this.f124a;
    }

    /* JADX INFO: renamed from: a */
    void m48a() {
        this.f124a = null;
    }

    /* JADX INFO: renamed from: a */
    void m49a(int[] iArr, int i, byte[] bArr, int[] iArr2, int i2, int i3, int i4, int i5) {
        int[] iArr3 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[4];
        for (int i6 = 0; i6 < 128; i6++) {
            for (int i7 = 0; i7 < 128; i7++) {
                if (bArr == null || (C0011l.m199b(((i6 << 7) + i7) % 8) & bArr[((i6 << 7) + i7) / 8]) == 0) {
                    C0011l.m205b(iArr4, iArr3[(i6 << 7) + i7]);
                    int i8 = iArr4[1];
                    if (i == -1) {
                        iArr4[2] = 1;
                    } else if (i == -2) {
                        iArr4[2] = 1;
                        iArr4[1] = iArr4[1] - 151;
                        if (iArr4[1] < 0) {
                            iArr4[1] = 0;
                        }
                    } else if (i == -3) {
                        iArr4[2] = 1;
                        iArr4[1] = iArr4[1] + 108;
                        if (iArr4[1] > 360) {
                            iArr4[1] = 360;
                        }
                    } else {
                        iArr4[0] = i;
                        iArr4[2] = 360;
                    }
                    if (iArr2 != null && i2 >= 0) {
                        int i9 = -1;
                        if ((i5 == 0 || i5 == 1) && i6 >= i4 && i6 < i4 + 27) {
                            if (i5 == 0) {
                                i9 = (((i6 - i4) + (i2 * 27)) << 7) + i7;
                            } else if (i5 == 1) {
                                i9 = (((((i6 - i4) + (i2 * 27)) << 7) + 128) - i7) - 1;
                            }
                        } else if ((i5 == 2 || i5 == 3) && 128 - i7 >= i4 && 128 - i7 < i4 + 27) {
                            if (i5 == 2) {
                                i9 = ((((128 - i7) - i4) + (i2 * 27)) << 7) + i6;
                            } else if (i5 == 3) {
                                i9 = ((((((128 - i7) - i4) + (i2 * 27)) << 7) + 128) - i6) - 1;
                            }
                        }
                        if (i9 != -1 && iArr2[i9] != iArr2[0]) {
                            C0011l.m205b(iArr5, iArr2[i9]);
                            iArr4[0] = iArr5[0];
                            if (i == -2 || i == -3) {
                                iArr4[1] = i8;
                            }
                            if (i3 == 1) {
                                iArr4[1] = iArr5[1];
                            }
                            iArr4[2] = iArr5[2];
                        }
                    }
                    iArr3[(i6 << 7) + i7] = C0011l.m170a(iArr4);
                }
            }
        }
        if (this.f124a != null) {
            this.f124a.setImage(new Image2D(this.f123a, Image.createRGBImage(iArr3, 128, 128, false)));
        } else {
            this.f124a = new Texture2D(new Image2D(this.f123a, Image.createRGBImage(iArr3, 128, 128, false)));
            this.f124a.setBlending(228);
        }
    }
}
