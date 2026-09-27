package p000;

import java.io.IOException;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Image2D;

/* JADX INFO: renamed from: al */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0012al {
    /* JADX INFO: renamed from: a */
    public static Image2D m47a(String str) {
        Image imageCreateImage = null;
        try {
            imageCreateImage = Image.createImage(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Image2D(100, imageCreateImage);
    }

    /* JADX INFO: renamed from: a */
    public static Image2D[] m48a(String str, int i, int i2) {
        Image2D[] image2DArr = new Image2D[i];
        try {
            Image imageCreateImage = Image.createImage(str);
            for (int i3 = 0; i3 < i; i3++) {
                image2DArr[i3] = new Image2D(100, Image.createImage(imageCreateImage, i3 * i2, 0, i2, i2, 0));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image2DArr;
    }

    /* JADX INFO: renamed from: a */
    public static Image2D[] m49a(String str, int i, int i2, Image[] imageArr) {
        Image2D[] image2DArr = new Image2D[i];
        try {
            Image imageCreateImage = Image.createImage(str);
            for (int i3 = 0; i3 < i; i3++) {
                imageArr[i3] = Image.createImage(imageCreateImage, i3 << 5, 0, 32, 32, 0);
                image2DArr[i3] = new Image2D(100, imageArr[i3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image2DArr;
    }
}
