package p000;

import java.io.InputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class Item {
    public static final byte ITEM_EFFECT_NUM = 5;
    private static String[] categoryName;
    private static int categoryNum;
    private static byte[][][] dropTable;
    private static ItemData[][] itemData;
    public static short[][][] recipe;
    public static ShopData[] shopData;
    private static String[] typeName;
    private static int typeNum;
    private static float[][] _ret = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 3);
    public static String[] MIX_CATEGORY_TBL = {"バトルアイテム", "チェーン", "バングル", "ブレスレット", "リング", "ピアス"};

    public static int getAkLevel(int i, int i2) {
        if (i <= categoryNum - 1 && i2 <= itemData[i].length - 1) {
            return itemData[i][i2].aklv;
        }
        return 0;
    }

    public static int getCategoryItemNum(int i) {
        return itemData[i].length;
    }

    public static int getCategoryNum() {
        return categoryNum;
    }

    public static float[][] getDropItem(int i) {
        return getDropItemMain(i, -1, -1, -1.0f);
    }

    public static float[][] getDropItem(int i, int i2, float f) {
        return getDropItemMain(-1, i, i2, f);
    }

    private static float[][] getDropItemMain(int i, int i2, int i3, float f) {
        int userType = Game.getUserType();
        for (int i4 = 0; i4 < _ret.length; i4++) {
            for (int i5 = 0; i5 < _ret[i4].length; i5++) {
                _ret[i4][i5] = -1.0f;
            }
        }
        if (i < 0) {
            _ret[0][0] = i2;
            _ret[0][1] = i3;
            _ret[0][2] = f;
        } else {
            if (dropTable[i].length == 0) {
                return _ret;
            }
            int[] iArr = new int[dropTable[i].length];
            float[] fArr = new float[dropTable[i].length];
            for (int i6 = 0; i6 < fArr.length; i6++) {
                fArr[i6] = dropTable[i][i6][userType + 2];
            }
            Util.SeqSort(iArr, fArr);
            int iRandomFix = Util.randomFix(0, 99);
            int i7 = 0;
            for (int i8 = 0; i8 < dropTable[i].length; i8++) {
                i7 += dropTable[i][iArr[i8]][userType + 2];
                if (iRandomFix < i7) {
                    _ret[0][0] = dropTable[i][iArr[i8]][0];
                    _ret[0][1] = dropTable[i][iArr[i8]][1] & GameStatus.ExtraStatus.CHEAT_MODE_NOSET;
                    _ret[0][2] = Util.randomFix(dropTable[i][iArr[i8]][5], dropTable[i][iArr[i8]][6]);
                    break;
                }
            }
        }
        if (_ret[0][0] == 9.0f && GameStatus.EXTRA.isCheatMode(11)) {
            _ret[0][2] = (_ret[0][2] * (GameStatus.PLAYER.getExeDebugAbilityEff(11) + 100)) / 100.0f;
        }
        if (_ret[0][0] == 9.0f && _ret[0][1] == 0.0f && _ret[0][2] >= 1.0f && GameStatus.GAME.extCommand == 0 && GameStatus.PLAYER.isFlg(13, 7)) {
            _ret[1][0] = 9.0f;
            _ret[1][1] = 1.0f;
            _ret[1][2] = Math.max(1.0f, (_ret[0][2] * GameStatus.PLAYER.getAbilityEff(0, 7)) / 100.0f);
            _ret[0][2] = Math.max(1.0f, _ret[0][2] - _ret[1][2]);
        }
        if (_ret[0][0] == 9.0f && _ret[0][1] == 1.0f && _ret[0][2] >= 1.0f && GameStatus.GAME.extCommand == 0 && GameStatus.PLAYER.isFlg(13, 8)) {
            _ret[1][0] = 9.0f;
            _ret[1][1] = 2.0f;
            _ret[1][2] = Math.max(1.0f, (_ret[0][2] * GameStatus.PLAYER.getAbilityEff(0, 8)) / 100.0f);
            _ret[0][2] = Math.max(1.0f, _ret[0][2] - _ret[1][2]);
        }
        if (Attack.isExtSolo()) {
            for (int i9 = 0; i9 < _ret.length; i9++) {
                if (_ret[i9][0] == 9.0f && _ret[i9][1] == 1.0f) {
                    for (int i10 = 0; i10 < _ret[i9].length; i10++) {
                        _ret[i9][i10] = -1.0f;
                    }
                }
            }
        }
        return _ret;
    }

    public static int getItemAllNum() {
        int categoryItemNum = 0;
        int i = 0;
        while (true) {
            int i2 = categoryItemNum;
            if (i >= getCategoryNum()) {
                return i2;
            }
            categoryItemNum = getCategoryItemNum(i) + i2;
            i++;
        }
    }

    public static ItemData getItemData(int i, int i2) {
        if (i <= categoryNum - 1 && i2 <= itemData[i].length - 1) {
            return itemData[i][i2];
        }
        return null;
    }

    public static int getItemDataAmount(int i, int i2, int i3) {
        if (i > categoryNum - 1 || i2 > itemData[i].length - 1) {
            return 0;
        }
        for (int i4 = 0; i4 < itemData[i][i2].effectId.length; i4++) {
            if (i3 == itemData[i][i2].effectId[i4]) {
                return itemData[i][i2].effectAmount[i4];
            }
        }
        return 0;
    }

    public static String getItemExplanation(int i, int i2) {
        return (i <= categoryNum + (-1) && i2 <= itemData[i].length + (-1)) ? itemData[i][i2].explanation : "";
    }

    public static int getItemIcon(int i, int i2) {
        switch (i) {
            case 0:
                return 65;
            case 1:
                return 75;
            case 2:
                return 50;
            case 3:
                return 82;
            case 4:
            case 5:
            case 6:
            default:
                return 49;
            case 7:
                switch (getItemData(i, i2).effectId[0]) {
                    case 12:
                    case 13:
                        return 47;
                    default:
                        return 49;
                }
        }
    }

    public static int getItemMaxNum(int i, int i2) {
        if (i <= categoryNum - 1 && i2 <= itemData[i].length - 1) {
            return itemData[i][i2].numMax;
        }
        return 0;
    }

    public static String getItemName(int i, int i2) {
        return (i <= categoryNum + (-1) && i2 <= itemData[i].length + (-1)) ? itemData[i][i2].name : "";
    }

    public static int getItemPrice(int i, int i2, int i3) {
        if (i > categoryNum - 1 || i2 > itemData[i].length - 1) {
            return 0;
        }
        switch (i3) {
            case 0:
                return itemData[i][i2].buyPrice;
            case 1:
                return 1;
            default:
                return 0;
        }
    }

    public static String getRecipeItemName(int i, int i2, int i3) {
        int i4;
        int i5 = 4;
        switch (i) {
            case 0:
                i4 = 2;
                break;
            case 1:
                i4 = 5;
                break;
            case 2:
            case 3:
            case 4:
                i4 = ((i - 2) * 3) + 7;
                i5 = ((i - 2) * 3) + 6;
                break;
            case 5:
            case 6:
            case 7:
                int i6 = ((i - 5) * 2) + 15;
                return recipe[i2][i3][i6] < 0 ? "" : getItemName(3, recipe[i2][i3][i6]);
            default:
                i4 = 0;
                i5 = 0;
                break;
        }
        return (recipe[i2][i3][i4] < 0 || recipe[i2][i3][i5] < 0) ? "" : getItemName(recipe[i2][i3][i5], recipe[i2][i3][i4]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int[] getRecipeMaterial(int i, int i2, int i3) {
        int[] iArr = {-1, -1, -1};
        switch (i) {
            case 0:
            case 1:
            case 2:
                iArr[0] = recipe[i2][i3][(i * 3) + 6];
                iArr[1] = recipe[i2][i3][(i * 3) + 7];
                iArr[2] = recipe[i2][i3][(i * 3) + 8];
                return iArr;
            case 3:
            case 4:
            case 5:
                iArr[0] = 3;
                iArr[1] = recipe[i2][i3][((i - 3) * 2) + 15];
                iArr[2] = recipe[i2][i3][((i - 3) * 2) + 16];
                return iArr;
            default:
                return iArr;
        }
    }

    public static int getShopListAllNum() {
        return shopData.length;
    }

    public static int getShopListNum() {
        int i = 0;
        if (shopData == null) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 >= shopData.length) {
                return i3;
            }
            i = !shopData[i2].disp ? i3 : i3 + 1;
            i2++;
        }
    }

    public static boolean isItemDataAmount(int i, int i2, int i3) {
        if (i > categoryNum - 1 || i2 > itemData[i].length - 1) {
            return false;
        }
        for (int i4 = 0; i4 < itemData[i][i2].effectId.length; i4++) {
            if (i3 == itemData[i][i2].effectId[i4]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isItemDel(int i) {
        return i != 5;
    }

    public static boolean isItemEquip(int i) {
        return i == 1 || i == 0;
    }

    public static boolean isItemUse(int i) {
        return i == 1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    public static boolean isItemUseAmount(int i, int i2) {
        boolean z;
        if (GameStatus.PLAYER.getNumberData(19) == 1 || !isItemUse(i)) {
            return false;
        }
        ItemData itemData2 = getItemData(i, i2);
        for (int i3 = 0; i3 < itemData2.effectId.length; i3++) {
            switch (itemData2.effectId[i3]) {
                case 2:
                    if (Character.charData[0].f12hp >= Character.charData[0].maxHp) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 3:
                    if (GameStatus.PLAYER.getDebugPower() >= 100) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static void load(String str) {
        InputStream inputStreamByte2InputStream = Util.byte2InputStream(StrageDeviceAccess.readStrage(str));
        if (inputStreamByte2InputStream == null) {
            return;
        }
        try {
            categoryNum = (byte) inputStreamByte2InputStream.read();
            categoryName = new String[categoryNum];
            itemData = new ItemData[categoryNum][];
            byte[] bArr = new byte[categoryNum];
            for (int i = 0; i < categoryNum; i++) {
                categoryName[i] = Util.readString(inputStreamByte2InputStream, inputStreamByte2InputStream.read());
                bArr[i] = (byte) inputStreamByte2InputStream.read();
            }
            typeNum = (byte) inputStreamByte2InputStream.read();
            typeName = new String[typeNum];
            for (int i2 = 0; i2 < typeNum; i2++) {
                typeName[i2] = Util.readString(inputStreamByte2InputStream, inputStreamByte2InputStream.read());
            }
            for (int i3 = 0; i3 < categoryNum; i3++) {
                itemData[i3] = new ItemData[inputStreamByte2InputStream.read()];
                for (int i4 = 0; i4 < itemData[i3].length; i4++) {
                    itemData[i3][i4] = new ItemData();
                    itemData[i3][i4].numMax = (byte) inputStreamByte2InputStream.read();
                    itemData[i3][i4].buyPrice = Util.readShort(inputStreamByte2InputStream);
                    itemData[i3][i4].aklv = (byte) inputStreamByte2InputStream.read();
                    itemData[i3][i4].type = (byte) inputStreamByte2InputStream.read();
                    itemData[i3][i4].effectId = new byte[bArr[i3]];
                    itemData[i3][i4].effectAmount = new short[bArr[i3]];
                    for (int i5 = 0; i5 < bArr[i3]; i5++) {
                        itemData[i3][i4].effectId[i5] = (byte) inputStreamByte2InputStream.read();
                        itemData[i3][i4].effectAmount[i5] = Util.readShort(inputStreamByte2InputStream);
                    }
                    itemData[i3][i4].explanation = Util.readString(inputStreamByte2InputStream, inputStreamByte2InputStream.read());
                    itemData[i3][i4].name = Util.readString(inputStreamByte2InputStream, inputStreamByte2InputStream.read());
                }
            }
        } catch (Exception e) {
        } finally {
            if (inputStreamByte2InputStream != null) {
                try {
                    inputStreamByte2InputStream.close();
                } catch (Exception e2) {
                }
            }
        }
    }

    public static void loadDropTable(String str) {
        dropTable = (byte[][][]) null;
        InputStream inputStreamByte2InputStream = Util.byte2InputStream(StrageDeviceAccess.readStrage(str));
        if (inputStreamByte2InputStream == null) {
            return;
        }
        try {
            dropTable = new byte[inputStreamByte2InputStream.read()][][];
            for (int i = 0; i < dropTable.length; i++) {
                dropTable[i] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, inputStreamByte2InputStream.read(), 7);
                for (int i2 = 0; i2 < dropTable[i].length; i2++) {
                    for (int i3 = 0; i3 < dropTable[i][i2].length; i3++) {
                        dropTable[i][i2][i3] = (byte) inputStreamByte2InputStream.read();
                    }
                }
            }
            if (inputStreamByte2InputStream != null) {
                try {
                    inputStreamByte2InputStream.close();
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
            if (inputStreamByte2InputStream != null) {
                try {
                    inputStreamByte2InputStream.close();
                } catch (Exception e3) {
                }
            }
        } catch (Throwable th) {
            if (inputStreamByte2InputStream != null) {
                try {
                    inputStreamByte2InputStream.close();
                } catch (Exception e4) {
                }
            }
            throw th;
        }
    }

    public static void loadRecipe(String str) {
        InputStream inputStreamByte2InputStream = Util.byte2InputStream(StrageDeviceAccess.readStrage(str));
        if (inputStreamByte2InputStream == null) {
            return;
        }
        try {
            recipe = new short[inputStreamByte2InputStream.read()][][];
            for (int i = 0; i < recipe.length; i++) {
                recipe[i] = (short[][]) Array.newInstance((Class<?>) Short.TYPE, inputStreamByte2InputStream.read(), 21);
                for (int i2 = 0; i2 < recipe[i].length; i2++) {
                    for (int i3 = 0; i3 < recipe[i][i2].length; i3++) {
                        recipe[i][i2][i3] = (short) inputStreamByte2InputStream.read();
                        if (recipe[i][i2][i3] == 255) {
                            recipe[i][i2][i3] = -1;
                        }
                    }
                }
            }
            if (inputStreamByte2InputStream != null) {
                try {
                    inputStreamByte2InputStream.close();
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
            if (inputStreamByte2InputStream != null) {
                try {
                    inputStreamByte2InputStream.close();
                } catch (Exception e3) {
                }
            }
        } catch (Throwable th) {
            if (inputStreamByte2InputStream != null) {
                try {
                    inputStreamByte2InputStream.close();
                } catch (Exception e4) {
                }
            }
            throw th;
        }
    }

    public static void loadShop(String str) {
        InputStream inputStreamByte2InputStream = Util.byte2InputStream(StrageDeviceAccess.readStrage(str));
        if (inputStreamByte2InputStream == null) {
            return;
        }
        try {
            shopData = new ShopData[inputStreamByte2InputStream.read()];
            for (int i = 0; i < shopData.length; i++) {
                shopData[i] = new ShopData();
                shopData[i].progress = Util.readShort(inputStreamByte2InputStream);
                shopData[i].categoryId = (byte) inputStreamByte2InputStream.read();
                shopData[i].itemId = Util.readShort(inputStreamByte2InputStream);
                shopData[i].per = (byte) inputStreamByte2InputStream.read();
                shopData[i].disp = true;
                if (GameStatus.PLAYER.getNumberData(29) < shopData[i].progress) {
                    shopData[i].disp = false;
                } else if (shopData[i].per < 100) {
                    if (Util.randomFix(0, 100) < shopData[i].per) {
                        shopData[i].disp = true;
                    } else {
                        shopData[i].disp = false;
                    }
                }
            }
        } catch (Exception e) {
        } finally {
            if (inputStreamByte2InputStream != null) {
                try {
                    inputStreamByte2InputStream.close();
                } catch (Exception e2) {
                }
            }
        }
    }

    public static void loadShopDebug() {
        int categoryItemNum = 0;
        for (int i = 0; i < getCategoryNum(); i++) {
            if (i != 9 && i != 5) {
                categoryItemNum += getCategoryItemNum(i);
            }
        }
        shopData = new ShopData[categoryItemNum];
        int i2 = 0;
        while (i2 < shopData.length) {
            for (int i3 = 0; i3 < getCategoryNum(); i3++) {
                if (i3 != 9 && i3 != 5) {
                    int i4 = i2;
                    for (int i5 = 0; i5 < getCategoryItemNum(i3); i5++) {
                        shopData[i4] = new ShopData();
                        shopData[i4].categoryId = (byte) i3;
                        shopData[i4].itemId = (short) i5;
                        shopData[i4].disp = true;
                        i4++;
                    }
                    i2 = i4;
                }
            }
        }
    }
}
