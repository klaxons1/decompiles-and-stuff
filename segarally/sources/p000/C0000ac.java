package p000;

/* JADX INFO: renamed from: ac */
/* JADX INFO: loaded from: C:\Temp\jadx-13810906317745716458\classes.dex */
public final class C0000ac extends C0040z {
    public byte Code;

    /* JADX INFO: renamed from: Code, reason: collision with other field name */
    public short f364Code;

    public C0000ac(byte[] bArr, int i) {
        this.f364Code = C0037t.m191I(bArr, i);
        this.Code = bArr[i + 2];
    }

    @Override // p000.C0040z
    public final int Code() {
        return 4;
    }

    @Override // p000.C0040z
    /* JADX INFO: renamed from: V */
    public final int mo15V() {
        return 3;
    }
}
