package p000;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
class VersionUp {
    public static VersionUpList[] list;
    public static VersionUpType[] type;

    VersionUp() {
    }

    public static VersionUpType getVtypeIndex(int i) {
        for (int i2 = 0; i2 < type.length; i2++) {
            if (type[i2].f67id == i) {
                return type[i2];
            }
        }
        return null;
    }

    public static boolean load(String str) {
        String[] strArr = {Util.txtDataStrip(new String(StrageDeviceAccess.readStrage(str)))};
        if (strArr == null) {
            return false;
        }
        list = new VersionUpList[Util.s2i(Util.strtok(strArr, ","))];
        for (int i = 0; i < list.length; i++) {
            list[i] = new VersionUpList();
            list[i].type = Util.s2i(Util.strtok(strArr, ","));
            list[i].name = Util.strtok(strArr, ",");
            list[i].info = Util.strtok(strArr, ",");
        }
        for (int i2 = 0; i2 < list.length; i2++) {
            list[i2].caname = new String[Util.s2i(Util.strtok(strArr, ","))];
            list[i2].vid = new int[list[i2].caname.length];
            for (int i3 = 0; i3 < list[i2].caname.length; i3++) {
                list[i2].caname[i3] = Util.strtok(strArr, ",");
                list[i2].vid[i3] = Util.s2i(Util.strtok(strArr, ","));
            }
        }
        type = new VersionUpType[Util.s2i(Util.strtok(strArr, ","))];
        for (int i4 = 0; i4 < type.length; i4++) {
            type[i4] = new VersionUpType();
            type[i4].f67id = Util.s2i(Util.strtok(strArr, ","));
            type[i4].f68vp = new int[Util.s2i(Util.strtok(strArr, ","))];
            type[i4].wid = new int[type[i4].f68vp.length];
            type[i4].info = new String[type[i4].f68vp.length];
            for (int i5 = 0; i5 < type[i4].f68vp.length; i5++) {
                type[i4].wid[i5] = Util.s2i(Util.strtok(strArr, ","));
                type[i4].f68vp[i5] = Util.s2i(Util.strtok(strArr, ","));
                type[i4].info[i5] = Util.strtok(strArr, ",");
            }
        }
        return true;
    }
}
