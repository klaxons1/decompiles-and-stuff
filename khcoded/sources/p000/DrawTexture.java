package p000;

import com.mascotcapsule.eruption.docomostar.Appearance;
import com.mascotcapsule.eruption.docomostar.RegionF;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class DrawTexture {
    private static RegionF[] _region = {new RegionF(0.0f, 0.0f, 0.0f, 0.0f), null};
    public static Appearance appRect = new Appearance();
    private static int[] fontPos = {40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 39, 39, 38, 39, 39, 39, 39, 39, 20, 39, 39, 36, 39, 39, 39, 37, 39, 39, 38, 36, 39, 37, 39, 39, 37, 38, 20, 44, 43, 29, 29};
    private static int[] fontPos2 = {2, 15, 3, -2, 8, 2, 1, 10, 1, 10};
    private static Appearance appTmp = null;

    DrawTexture() {
    }

    public static void draw(TextureData textureData, int i, int i2, int i3, float f, int i4) {
        int[] offsetIndex = textureData.getOffsetIndex(i);
        int graphicIndex = textureData.getGraphicIndex(offsetIndex) + i;
        drawScale(textureData, i, i2, i3, textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][4], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][5], f, i4);
    }

    public static void drawColor(TextureData textureData, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7) {
        int[] offsetIndex = textureData.getOffsetIndex(i);
        int graphicIndex = textureData.getGraphicIndex(offsetIndex) + i;
        drawScaleColor(textureData, i, i2, i3, textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][4], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][5], f, i4, i5, i6, i7);
    }

    public static void drawExtendX(TextureData textureData, int i, int i2, int i3, int i4, int i5) {
        drawRegion(textureData, i, i2, i3, i5, textureData.getHeight(i), 0, 0, i5, textureData.getHeight(i), 1.0f, 255);
        drawRegion(textureData, i, i2 + i5, i3, i4 + 2, textureData.getHeight(i), i5, 0, 1, textureData.getHeight(i), 1.0f, 255);
        drawRegion(textureData, i, i2 + i5 + i4 + 1, i3, textureData.getWidth(i) - i5, textureData.getHeight(i), i5 + 1, 0, textureData.getWidth(i) - i5, textureData.getHeight(i), 1.0f, 255);
    }

    public static void drawImage(TextureData textureData, int i, int i2, int i3, int i4) {
        drawImage(textureData, i, i2, i3, textureData.getWidth(i), textureData.getHeight(i), 0.0f, 0, i4);
    }

    public static void drawImage(TextureData textureData, int i, int i2, int i3, int i4, int i5, float f, int i6, int i7) {
        int[] offsetIndex = textureData.getOffsetIndex(i);
        int graphicIndex = textureData.getGraphicIndex(offsetIndex) + i;
        if (i6 == 0) {
            _region[0].set(textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][4])) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][5] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3])) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1]);
        } else {
            _region[0].set(((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][4])) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][5] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3])) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1]);
        }
        drawRect(i2, i3, i4, i5, f, Util.getColorOfRGBAtoABGR((i7 >> 16) & 255, (i7 >> 8) & 255, i7 & 255, (i7 >> 24) & 255), textureData.app[offsetIndex[0]][offsetIndex[1]], _region);
        textureData.app[offsetIndex[0]][offsetIndex[1]].setBlendMode(0);
    }

    public static void drawImageFace(TextureData textureData, int i, int i2, int i3, int i4, int i5, float f, int i6, int i7) {
        int[] offsetIndex = textureData.getOffsetIndex(i);
        int graphicIndex = i + textureData.getGraphicIndex(offsetIndex);
        short s = textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][0];
        if (i6 == 0) {
            _region[0].set(textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] / textureData.mctSize[offsetIndex[0]][s][0], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] / textureData.mctSize[offsetIndex[0]][s][1], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][4])) / textureData.mctSize[offsetIndex[0]][s][0], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][5])) / textureData.mctSize[offsetIndex[0]][s][1]);
        } else {
            _region[0].set(((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][4])) / textureData.mctSize[offsetIndex[0]][s][0], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] / textureData.mctSize[offsetIndex[0]][s][1], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] / textureData.mctSize[offsetIndex[0]][s][0], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][5])) / textureData.mctSize[offsetIndex[0]][s][1]);
        }
        drawRect(i6 == 1 ? (((16 - textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][4]) - textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][6]) * (i4 / textureData.getWidth(graphicIndex))) + i2 : (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][6] * (i4 / textureData.getWidth(graphicIndex))) + i2, ((i5 / textureData.getHeight(graphicIndex)) * textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][7]) + i3, i4, i5, f, Util.getColorOfRGBAtoABGR((i7 >> 16) & 255, (i7 >> 8) & 255, i7 & 255, (i7 >> 24) & 255), textureData.app[offsetIndex[0]][s], _region);
        textureData.app[offsetIndex[0]][s].setBlendMode(0);
    }

    public static void drawRect(int i, int i2, int i3, int i4, float f, int i5, Appearance appearance, RegionF[] regionFArr) {
        GameCommon.f56g3.drawRect(GameCommon.ogl, (short) i, (short) i2, (short) i3, (short) i4, f, i5, appearance, regionFArr);
    }

    public static void drawRect(int i, int i2, int i3, int i4, int i5) {
        if (appTmp == null) {
            appTmp = new Appearance();
            appTmp.setAlphaThreshold(1);
            appTmp.setBlendMode(0);
            appTmp.setTextureBlendMode(0, 4);
            appTmp.setProperties(appTmp.getProperties() ^ 8);
        }
        drawRect(i, i2, i3, i4, 0.0f, i5, appTmp, null);
    }

    public static void drawRect(int i, int i2, int i3, int i4, int i5, Appearance appearance) {
        drawRect(i, i2, i3, i4, 0.0f, i5, appearance, null);
    }

    public static void drawRect(int i, int i2, int i3, int i4, int i5, Appearance appearance, RegionF[] regionFArr) {
        drawRect(i, i2, i3, i4, 0.0f, i5, appearance, regionFArr);
    }

    public static void drawRegion(TextureData textureData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10) {
        int[] offsetIndex = textureData.getOffsetIndex(i);
        int graphicIndex = textureData.getGraphicIndex(offsetIndex) + i;
        _region[0].set(((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + i6)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] + i7)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1], ((short) ((textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + i6) + i8)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) ((textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] + i7) + i9)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1]);
        drawRect(i2, i3, i4, i5, f, Util.getColorOfRGBAtoABGR(128, 128, 128, i10), textureData.app[offsetIndex[0]][offsetIndex[1]], _region);
        textureData.app[offsetIndex[0]][offsetIndex[1]].setBlendMode(0);
    }

    public static void drawRegionRGB(TextureData textureData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        drawRegionRGB(textureData, i, i2, i3, i6, i7, i4, i5, i6, i7, 0.0f, 255, i8);
    }

    public static void drawRegionRGB(TextureData textureData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, int i11) {
        int[] offsetIndex = textureData.getOffsetIndex(i);
        int graphicIndex = textureData.getGraphicIndex(offsetIndex) + i;
        _region[0].set(((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + i6)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] + i7)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1], ((short) ((textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + i6) + i8)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) ((textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] + i7) + i9)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1]);
        drawRect(i2, i3, i4, i5, f, Util.getColorOfRGBAtoABGR((i11 >> 16) & 255, (i11 >> 8) & 255, i11 & 255, i10), textureData.app[offsetIndex[0]][offsetIndex[1]], _region);
        textureData.app[offsetIndex[0]][offsetIndex[1]].setBlendMode(0);
    }

    public static void drawRegionRGBFlip(TextureData textureData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, int i11) {
        int[] offsetIndex = textureData.getOffsetIndex(i);
        int graphicIndex = textureData.getGraphicIndex(offsetIndex) + i;
        _region[0].set(((short) ((textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + i6) + i8)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] + i7)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + i6)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) ((textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] + i7) + i9)) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1]);
        drawRect(i2, i3, i4, i5, f, Util.getColorOfRGBAtoABGR((i11 >> 16) & 255, (i11 >> 8) & 255, i11 & 255, i10), textureData.app[offsetIndex[0]][offsetIndex[1]], _region);
        textureData.app[offsetIndex[0]][offsetIndex[1]].setBlendMode(0);
    }

    public static void drawScale(TextureData textureData, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        drawScaleColor(textureData, i, i2, i3, i4, i5, f, i6, 128, 128, 128);
    }

    public static void drawScaleColor(TextureData textureData, int i, int i2, int i3, int i4, int i5, float f, int i6, int i7, int i8, int i9) {
        int[] offsetIndex = textureData.getOffsetIndex(i);
        int graphicIndex = textureData.getGraphicIndex(offsetIndex) + i;
        _region[0].set(textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3] / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][2] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][4])) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][0], ((short) (textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][5] + textureData.offsetInfo[offsetIndex[0]][offsetIndex[1]][graphicIndex][3])) / textureData.mctSize[offsetIndex[0]][offsetIndex[1]][1]);
        drawRect(i2, i3, i4, i5, f, Util.getColorOfRGBAtoABGR(i7, i8, i9, i6), textureData.app[offsetIndex[0]][offsetIndex[1]], _region);
        textureData.app[offsetIndex[0]][offsetIndex[1]].setBlendMode(0);
    }

    public static void drawString(TextureData textureData, String str, int i, int i2, float f, float f2, int i3) {
        drawStringColor(textureData, str, i, i2, f, f2, i3, GameCommon.K_ANY);
    }

    public static void drawStringColor(TextureData textureData, String str, int i, int i2, float f, float f2, int i3, int i4) {
        float f3;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            int i8 = i5;
            if (i7 >= str.length()) {
                return;
            }
            int iCharAt = 0;
            if (str.charAt(i7) >= '0' && str.charAt(i7) <= '9') {
                iCharAt = textureData.offsetInfo[0][0].length + (str.charAt(i7) - '0');
            } else if (str.charAt(i7) < 'A' || str.charAt(i7) > 'Z') {
                switch (str.charAt(i7)) {
                    case ' ':
                        f3 = 35.0f;
                        continue;
                        i5 = i8 + ((int) (f3 * f));
                        i6 = i7 + 1;
                        break;
                    case '!':
                        iCharAt = 37;
                        break;
                    case '%':
                        iCharAt = 39;
                        break;
                    case '+':
                        iCharAt = 40;
                        break;
                    case '-':
                        iCharAt = 38;
                        break;
                    case ':':
                        iCharAt = 41;
                        break;
                }
            } else {
                iCharAt = (str.charAt(i7) - 'A') + textureData.offsetInfo[0][0].length + 10;
            }
            int length = iCharAt - textureData.offsetInfo[0][0].length;
            drawScaleColor(textureData, iCharAt, i + i8 + (length < 10 ? ((int) (fontPos2[length] * f)) / 2 : 0), i2, (int) (textureData.getWidth(iCharAt) * f), (int) (textureData.getHeight(iCharAt) * f), f2, i3, (i4 >> 16) & 255, (i4 >> 8) & 255, i4 & 255);
            f3 = fontPos[length];
            i5 = i8 + ((int) (f3 * f));
            i6 = i7 + 1;
        }
    }

    public static void fillRect(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i6 != 255) {
            appRect.setAlphaThreshold(1);
            appRect.setBlendMode(0);
            appRect.setProperties(1046);
        }
        if (i6 != 255) {
            drawRect(i, i2, i3, i4, 0.0f, Util.getColorOfRGBAtoABGR((i5 >> 16) & 255, (i5 >> 8) & 255, i5 & 255, i6), appRect, null);
        } else {
            drawRect(i, i2, i3, i4, 0.0f, Util.getColorOfRGBAtoABGR((i5 >> 16) & 255, (i5 >> 8) & 255, i5 & 255, i6), null, _region);
        }
    }
}
