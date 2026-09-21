package p000;

import java.io.IOException;
import javax.bluetooth.RemoteDevice;

/* JADX INFO: renamed from: z */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0054z {

    /* JADX INFO: renamed from: a */
    public RemoteDevice f556a;

    /* JADX INFO: renamed from: b */
    public C0039k f557b;

    public C0054z(RemoteDevice remoteDevice, C0039k c0039k) {
        this.f556a = remoteDevice;
        this.f557b = c0039k;
    }

    /* JADX INFO: renamed from: a */
    public final String m346a() {
        try {
            return this.f556a.getFriendlyName(false);
        } catch (IOException e) {
            return null;
        }
    }
}
