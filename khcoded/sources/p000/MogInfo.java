package p000;

import java.util.Vector;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class MogInfo {
    private static final byte RECIPE_MAX = 24;
    public String[] strData = new String[1];
    private int[] intData = new int[7];
    private byte[] byteData = new byte[3];
    public byte kupo = 0;

    private void getMixLv() {
        int totalExp = getTotalExp();
        for (int i = 2; i < 100; i++) {
            if (totalExp - getMixLvExpTotal(i) < 0) {
                setNumberData(8, i - 1);
                setNumberData(6, getMixLvExpTotal(i) - totalExp);
                return;
            } else {
                if (i == 99) {
                    setNumberData(8, 99);
                    setNumberData(6, 0);
                    return;
                }
            }
        }
    }

    public void addElement(Vector vector) {
        vector.addElement(this.intData);
        vector.addElement(this.byteData);
        vector.addElement(this.strData);
    }

    public void addMixExp(int i, int i2) {
        int numberData = getNumberData(i + 0);
        if (getMixLvExpTotal(99) <= numberData + i2) {
            i2 = getMixLvExpTotal(99) - numberData;
        }
        setNumberData(i + 0, getNumberData(i + 0) + i2);
        getMixLv();
        for (int i3 = 0; i3 < GameStatus.PLAYER.mixFlg.length; i3++) {
            for (int i4 = 0; i4 < GameStatus.PLAYER.mixFlg[i3].length; i4++) {
                GameStatus.PLAYER.mixFlg[i3][i4] = false;
            }
        }
        for (int i5 = 0; i5 < GameStatus.PLAYER.mixFlg.length; i5++) {
            int lv = getLv(getNumberData(i5 + 0));
            for (int i6 = 0; i6 < Item.recipe[i5].length; i6++) {
                if (Item.recipe[i5][i6][1] <= lv) {
                    GameStatus.PLAYER.mixFlg[i5][i6] = true;
                }
            }
        }
        for (int i7 = 0; i7 < GameStatus.PLAYER.item[8].length; i7++) {
            if (GameStatus.PLAYER.item[8][i7] > 0) {
                ItemData itemData = Item.getItemData(8, i7);
                GameStatus.PLAYER.mixFlg[itemData.effectId[0] - 16][itemData.effectAmount[0]] = true;
            }
        }
    }

    public int exeMixLocal(int i, int i2, boolean z) {
        short s = Item.recipe[i][i2][0];
        int lv = getLv(getNumberData(i + 0));
        int numberData = ((((s * 12) / 10) - lv) * (((s * 12) / 10) - lv)) + getNumberData(8);
        if (s - lv < 0) {
            numberData = getNumberData(8);
        }
        if (numberData <= 0) {
            numberData = 1;
        }
        int iRandomFix = Util.randomFix(0, 99);
        int castPer = getCastPer(i, i2);
        if (getNumberData(10) % 6 == i) {
            castPer += ((getNumberData(10) / 6) + 1) * 10;
        }
        if (this.kupo == 2 || z) {
            castPer += 20;
        }
        int i3 = castPer / 10;
        if (i3 >= 50) {
            i3 = 50;
        }
        int i4 = iRandomFix < i3 ? 2 : iRandomFix < castPer ? 1 : 0;
        if (i4 > 0) {
            addMixExp(i, numberData);
        } else {
            addMixExp(i, getNumberData(8));
        }
        if (!z) {
            for (int i5 = 0; i5 < 6; i5++) {
                int[] recipeMaterial = Item.getRecipeMaterial(i5, i, i2);
                if (recipeMaterial[2] > 0) {
                    GameStatus.PLAYER.delItem(recipeMaterial[0], recipeMaterial[1], recipeMaterial[2]);
                }
            }
        }
        return i4;
    }

    public int getCastPer(int i, int i2) {
        return (int) Math.ceil((((getLv(getNumberData(i + 0)) * 2.0f) + getNumberData(8)) / (Item.recipe[i][i2][0] * 6)) * 100.0f);
    }

    public int getLv(int i) {
        for (int i2 = 1; i2 < 100; i2++) {
            if (i < getMixLvExpTotal(i2)) {
                return i2 - 1;
            }
        }
        return 99;
    }

    public int getMixLvExp(int i) {
        return (i + 1) * (i + 1) * 3;
    }

    public int getMixLvExpTotal(int i) {
        int mixLvExp = 0;
        for (int i2 = 1; i2 < i; i2++) {
            mixLvExp += getMixLvExp(i2);
        }
        return mixLvExp;
    }

    public int getNextExp() {
        return (getNumberData(8) + 1) * (getNumberData(8) + 1) * 4;
    }

    public int getNumberData(int i) {
        return i < 7 ? this.intData[i] : this.byteData[(i - 7) - 1];
    }

    public int getRecipeMakeNum() {
        int recipeMakeNum = 0;
        int i = 0;
        while (true) {
            int i2 = recipeMakeNum;
            if (i >= Item.recipe.length) {
                return i2;
            }
            recipeMakeNum = getRecipeMakeNum(i) + i2;
            i++;
        }
    }

    public int getRecipeMakeNum(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 >= getRecipeNum(i)) {
                return i4;
            }
            i2 = GameStatus.PLAYER.mixFlg[i][i3] ? i4 + 1 : i4;
            i3++;
        }
    }

    public int getRecipeMax() {
        return (getNumberData(9) * 2) + 6;
    }

    public int getRecipeNum() {
        int recipeNum = 0;
        int i = 0;
        while (true) {
            int i2 = recipeNum;
            if (i >= Item.recipe.length) {
                return i2;
            }
            recipeNum = getRecipeNum(i) + i2;
            i++;
        }
    }

    public int getRecipeNum(int i) {
        return Item.recipe[i].length;
    }

    public String getTitle() {
        return new String[]{"しろうとモーグリ", "みならいモーグリ", "合成士のたまご", "半人前の合成士", "一人前の合成士", "りっぱな合成士", "合成マスター", "選ばれし合成マスター", "全てをきわめたモグ", "伝説のモーグリ"}[getNumberData(8) / 10];
    }

    public int getTotalExp() {
        int numberData = 0;
        int i = 0;
        while (true) {
            int i2 = numberData;
            if (i >= 6) {
                return i2;
            }
            numberData = getNumberData(i + 0) + i2;
            i++;
        }
    }

    public void init(int i) {
        this.strData[0] = "モーグリ";
        setNumberData(1, 0);
        setNumberData(2, 0);
        setNumberData(3, 0);
        setNumberData(4, 0);
        setNumberData(5, 0);
        setNumberData(0, 0);
        setNumberData(6, 0);
        setNumberData(9, 0);
        setNumberData(10, -1);
        getMixLv();
    }

    public void setNumberData(int i, int i2) {
        if (i < 7) {
            this.intData[i] = i2;
        } else {
            this.byteData[(i - 7) - 1] = (byte) i2;
        }
    }
}
