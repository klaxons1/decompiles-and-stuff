package p000;

import java.io.IOException;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;

/* JADX INFO: renamed from: an */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0014an implements DiscoveryListener {

    /* JADX INFO: renamed from: a */
    public Object f201a = new Object();

    /* JADX INFO: renamed from: b */
    public ServiceRecord f202b;

    /* JADX INFO: renamed from: c */
    public C0036h f203c;

    /* JADX INFO: renamed from: a */
    public final void m134a() {
        if (this.f203c != null) {
            try {
                this.f203c.m283b();
            } catch (IOException e) {
            } finally {
                this.f203c = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m135a(C0054z c0054z) throws IOException {
        this.f202b = null;
        this.f203c = null;
        UUID[] uuidArr = {new UUID(c0054z.f557b.f470c, false)};
        synchronized (this.f201a) {
            LocalDevice.getLocalDevice().getDiscoveryAgent().searchServices((int[]) null, uuidArr, c0054z.f556a, this);
            try {
                this.f201a.wait();
            } catch (InterruptedException e) {
            }
        }
        if (this.f202b != null) {
            String connectionURL = this.f202b.getConnectionURL(0, false);
            if (!connectionURL.startsWith("btl2cap")) {
                throw new IOException("Protocol mismatch");
            }
            this.f203c = new C0036h(Connector.open(connectionURL));
            this.f202b = null;
        }
    }

    public final void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
    }

    public final void inquiryCompleted(int i) {
    }

    public final void serviceSearchCompleted(int i, int i2) {
        synchronized (this.f201a) {
            this.f201a.notifyAll();
        }
    }

    public final void servicesDiscovered(int i, ServiceRecord[] serviceRecordArr) {
        if (serviceRecordArr.length <= 0 || !serviceRecordArr[0].getConnectionURL(0, false).startsWith("btl2cap")) {
            return;
        }
        synchronized (this.f201a) {
            this.f202b = serviceRecordArr[0];
            this.f201a.notifyAll();
        }
    }
}
