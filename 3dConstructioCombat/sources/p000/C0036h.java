package p000;

import java.io.IOException;
import javax.bluetooth.L2CAPConnection;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0036h {

    /* JADX INFO: renamed from: a */
    public L2CAPConnection f450a;

    public C0036h(L2CAPConnection l2CAPConnection) {
        this.f450a = l2CAPConnection;
    }

    /* JADX INFO: renamed from: a */
    public final int m280a(byte[] bArr) throws IOException {
        return this.f450a.receive(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m281a() throws IOException {
        return this.f450a.ready();
    }

    /* JADX INFO: renamed from: b */
    public final int m282b(byte[] bArr) throws IOException {
        this.f450a.send(bArr);
        return bArr.length;
    }

    /* JADX INFO: renamed from: b */
    public final void m283b() throws IOException {
        this.f450a.close();
    }
}
