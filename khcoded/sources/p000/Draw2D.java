package p000;

import com.docomostar.ui.Font;
import com.docomostar.ui.Graphics;
import com.docomostar.ui.Image;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Draw2D {
    public static final int STRING_MODE_CENTER = 2;
    public static final int STRING_MODE_LEFT = 0;
    public static final int STRING_MODE_RIGHT = 1;
    private static Draw2dObject[] object;
    private static int objectNumMax = 74;
    private static int objectNum = 0;
    public static int nowFont = -1;
    public static int nowFontAsc = 0;

    Draw2D() {
    }

    private static void add() {
        if (objectNum >= objectNumMax - 1) {
            return;
        }
        objectNum++;
    }

    public static void clear() {
        objectNum = 0;
    }

    public static void drawImage(Image image, int i, int i2, int i3, int i4, int i5, int i6) {
        object[objectNum].addDraw2dObject(image, i, i2, 0, 0, i3, i4, i5, i6);
        add();
    }

    public static void drawLine(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        object[objectNum].addDraw2dObject(i, i2, i3, i4, i5, i6, i7, i8);
        add();
    }

    public static void drawPolyline(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        object[objectNum].addDraw2dObject(iArr, iArr2, i, i2, i3, i4, i5, i6);
        add();
    }

    public static void drawRect(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        object[objectNum].addDraw2dObject(i, i2, i3, i4, i5, i6, i7, i8, 1);
        add();
    }

    public static void drawRegion(Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        object[objectNum].addDraw2dObject(image, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
        add();
    }

    public static void drawScaledImage(Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        object[objectNum].addDraw2dObject(image, i, i2, i3, i4, i5, i6, i7, i8);
        add();
    }

    public static void drawString(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        object[objectNum].addDraw2dObject(str, i, i2, i3, i4, i5, i6, i7);
        add();
    }

    public static void drawStringMode(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int fontStringWidth;
        if (i8 == 1) {
            fontStringWidth = i - getFontStringWidth(1896873984, i3, str);
        } else {
            fontStringWidth = i8 == 2 ? i - (getFontStringWidth(1896873984, i3, str) / 2) : i;
        }
        drawString(str, fontStringWidth, i2, i3, i4, i5, i6, i7);
    }

    public static void fillArc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        object[objectNum].addDraw2dObject(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        add();
    }

    public static void fillRect(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        object[objectNum].addDraw2dObject(i, i2, i3, i4, i5, i6, i7, i8, 0);
        add();
    }

    public static void flush() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        GameCommon.end3D();
        int i6 = -1;
        int i7 = 255;
        int i8 = 0;
        int i9 = -1;
        int i10 = 0;
        while (i10 < objectNum) {
            Draw2dObject draw2dObject = object[i10];
            if (i6 == draw2dObject.renderMode && (i6 == 0 || (i7 == draw2dObject.srcRatio && i8 == draw2dObject.dstRatio))) {
                i3 = i8;
                i4 = i7;
                i5 = i6;
            } else {
                if (draw2dObject.renderMode == 0) {
                    i = 255;
                    i2 = 0;
                } else {
                    i = draw2dObject.srcRatio;
                    i2 = draw2dObject.dstRatio;
                }
                int i11 = draw2dObject.renderMode;
                GameCommon.f55g2.setRenderMode(i11, i, i2);
                i3 = i2;
                i4 = i;
                i5 = i11;
            }
            if (draw2dObject.type != 7 && draw2dObject.type != 8 && i9 != draw2dObject.rgb) {
                i9 = draw2dObject.rgb;
                GameCommon.f54g.setColor(Graphics.getColorOfRGB((i9 >> 16) & 255, (i9 >> 8) & 255, i9 & 255));
            }
            int i12 = i9;
            if (draw2dObject.flip != 0) {
                GameCommon.f54g.setFlipMode(draw2dObject.flip);
            }
            if (draw2dObject.type == 0) {
                setFont(draw2dObject.font);
                GameCommon.f54g.drawString(draw2dObject.str, draw2dObject.f24x, draw2dObject.f25y + nowFontAsc);
                draw2dObject.str = null;
            } else if (draw2dObject.type == 2) {
                GameCommon.f54g.fillRect(draw2dObject.f24x, draw2dObject.f25y, draw2dObject.f23w, draw2dObject.f18h);
            } else if (draw2dObject.type == 3) {
                GameCommon.f54g.fillArc(draw2dObject.f24x, draw2dObject.f25y, draw2dObject.f23w, draw2dObject.f18h, draw2dObject.startAngle, draw2dObject.arcAngle);
            } else if (draw2dObject.type == 4) {
                GameCommon.f54g.drawLine(draw2dObject.f24x, draw2dObject.f25y, draw2dObject.f23w, draw2dObject.f18h);
            } else if (draw2dObject.type == 5) {
                GameCommon.f54g.drawPolyline(draw2dObject.xPoints, draw2dObject.yPoints, draw2dObject.offset, draw2dObject.count);
            } else if (draw2dObject.type == 7) {
                GameCommon.f54g.drawImage(draw2dObject.img, draw2dObject.f24x, draw2dObject.f25y);
            } else if (draw2dObject.type == 8) {
                GameCommon.f54g.drawScaledImage(draw2dObject.img, draw2dObject.f24x, draw2dObject.f25y, draw2dObject.f23w, draw2dObject.f18h, 0, 0, draw2dObject.img.getWidth(), draw2dObject.img.getHeight());
            } else if (draw2dObject.type == 9) {
                GameCommon.f54g.drawRect(draw2dObject.f24x, draw2dObject.f25y, draw2dObject.f23w, draw2dObject.f18h);
            } else if (draw2dObject.type == 10) {
                GameCommon.f54g.drawScaledImage(draw2dObject.img, draw2dObject.f24x, draw2dObject.f25y, draw2dObject.f23w, draw2dObject.f18h, draw2dObject.f21sx, draw2dObject.f22sy, draw2dObject.f20sw, draw2dObject.f19sh);
            }
            if (draw2dObject.flip != 0) {
                GameCommon.f54g.setFlipMode(0);
            }
            i10++;
            i9 = i12;
            i8 = i3;
            i7 = i4;
            i6 = i5;
        }
        clear();
        GameCommon.f55g2.setRenderMode(0, 255, 0);
        GameCommon.drawSoftKey();
    }

    public static Font getFont() {
        return Font.getFont(1896873984, nowFont);
    }

    public static int getFontStringWidth(int i, int i2, String str) {
        return Font.getFont(i, i2).stringWidth(str);
    }

    public static void init() {
        object = new Draw2dObject[objectNumMax];
        for (int i = 0; i < object.length; i++) {
            object[i] = new Draw2dObject();
        }
    }

    public static void setFont(int i) {
        if (nowFont != i) {
            nowFont = i;
            Font font = Font.getFont(1896873984, i);
            GameCommon.f54g.setFont(font);
            nowFontAsc = font.getAscent() - font.getHeight();
        }
    }
}
