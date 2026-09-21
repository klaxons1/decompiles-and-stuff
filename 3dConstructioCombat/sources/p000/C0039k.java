package p000;

import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0039k implements DiscoveryListener {

    /* JADX INFO: renamed from: a */
    public Vector f468a = new Vector();

    /* JADX INFO: renamed from: b */
    public RunnableC0001aa f469b;

    /* JADX INFO: renamed from: c */
    public String f470c;

    public C0039k(String str) {
        this.f470c = str;
    }

    /* JADX INFO: renamed from: a */
    public final C0054z m292a(int i) {
        return (C0054z) this.f468a.elementAt(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m293a() throws Exception {
        LocalDevice.getLocalDevice().getDiscoveryAgent().cancelInquiry(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m294a(RunnableC0001aa runnableC0001aa) throws Exception {
        this.f468a.removeAllElements();
        this.f469b = runnableC0001aa;
        LocalDevice.getLocalDevice().getDiscoveryAgent().startInquiry(10390323, this);
    }

    /* JADX INFO: renamed from: b */
    public final void m295b() {
        this.f468a.removeAllElements();
    }

    /* JADX INFO: renamed from: c */
    public final int m296c() {
        return this.f468a.size();
    }

    public final void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
        this.f468a.addElement(new C0054z(remoteDevice, this));
    }

    public final void inquiryCompleted(int i) {
        this.f469b.m10b();
    }

    public final void serviceSearchCompleted(int i, int i2) {
    }

    public final void servicesDiscovered(int i, ServiceRecord[] serviceRecordArr) {
    }
}
