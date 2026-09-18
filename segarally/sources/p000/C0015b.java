package p000;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0015b {
    public byte[] Code;

    public C0015b(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        this.Code = new byte[length + 1];
        System.arraycopy(bytes, 0, this.Code, 0, length);
    }

    public C0015b(byte[] bArr) {
        int i = 0;
        while (i < bArr.length && bArr[i] != 0) {
            i++;
        }
        this.Code = new byte[i + 1];
        System.arraycopy(bArr, 0, this.Code, 0, i);
    }

    public C0015b(byte[] bArr, int i, int i2) {
        this.Code = new byte[i2 + 1];
        System.arraycopy(bArr, i, this.Code, 0, i2);
    }

    public final int Code(byte[] bArr, int i) {
        int i2 = 0;
        while (i < this.Code.length) {
            if (this.Code[i] == bArr[i2]) {
                i2++;
                if (i2 >= bArr.length) {
                    break;
                }
            } else {
                i2 = 0;
            }
            i++;
        }
        if (i < this.Code.length) {
            return i - (bArr.length - 1);
        }
        return -1;
    }

    public final void Code(int i, int i2) {
        byte[] bArr = new byte[this.Code.length - (i2 - i)];
        System.arraycopy(this.Code, 0, bArr, 0, i);
        System.arraycopy(this.Code, i2, bArr, i, this.Code.length - i2);
        this.Code = bArr;
    }

    public final void Code(byte[] bArr, byte[] bArr2) {
        int iCode = Code(bArr2, 0);
        if (iCode != -1) {
            byte[] bArr3 = new byte[(this.Code.length - bArr2.length) + bArr.length];
            System.arraycopy(this.Code, 0, bArr3, 0, iCode);
            System.arraycopy(bArr, 0, bArr3, iCode, bArr.length);
            System.arraycopy(this.Code, bArr2.length + iCode, bArr3, bArr.length + iCode, bArr3.length - (iCode + bArr.length));
            this.Code = bArr3;
        }
    }

    public final String toString() {
        byte[] bArr = this.Code;
        int i = 0;
        while (i < bArr.length && bArr[i] != 0) {
            i++;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            cArr[i2] = (char) bArr[i2];
        }
        return new String(cArr);
    }
}
