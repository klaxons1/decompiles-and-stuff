package p000;

import java.io.IOException;
import javax.bluetooth.L2CAPConnection;
import javax.bluetooth.L2CAPConnectionNotifier;
import javax.bluetooth.LocalDevice;
import javax.microedition.io.Connector;

/* JADX INFO: renamed from: at */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class RunnableC0020at implements Runnable {

    /* JADX INFO: renamed from: a */
    public boolean f238a;

    /* JADX INFO: renamed from: b */
    public String f239b;

    /* JADX INFO: renamed from: c */
    public RunnableC0011ak f240c;

    /* JADX INFO: renamed from: d */
    public C0036h f241d;

    /* JADX INFO: renamed from: e */
    public Thread f242e;

    /* JADX INFO: renamed from: f */
    public L2CAPConnectionNotifier f243f;

    /* JADX INFO: renamed from: g */
    public int f244g;

    /* JADX INFO: renamed from: a */
    public final void m166a() {
        this.f238a = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m167a(String str, RunnableC0011ak runnableC0011ak, int i) {
        this.f239b = str;
        this.f240c = runnableC0011ak;
        this.f238a = false;
        this.f244g = i;
        if (this.f242e == null) {
            this.f242e = new Thread(this);
            this.f242e.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m168b() {
        if (this.f241d != null) {
            try {
                this.f241d.m283b();
            } catch (IOException e) {
            } finally {
                this.f241d = null;
            }
        }
        if (this.f243f != null) {
            try {
                this.f243f.close();
            } catch (IOException e2) {
            } finally {
                this.f243f = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        L2CAPConnection l2CAPConnectionAcceptAndOpen;
        try {
            LocalDevice.getLocalDevice().setDiscoverable(10390323);
            this.f243f = Connector.open(new StringBuffer().append("btl2cap://localhost:").append(this.f239b).append(";ReceiveMTU=").append(this.f244g).append(";TransmitMTU=").append(this.f244g).toString());
            l2CAPConnectionAcceptAndOpen = this.f243f.acceptAndOpen();
        } catch (IOException e) {
            l2CAPConnectionAcceptAndOpen = null;
        }
        this.f242e = null;
        if (!this.f238a && l2CAPConnectionAcceptAndOpen != null) {
            this.f241d = new C0036h(l2CAPConnectionAcceptAndOpen);
            this.f240c.m91b();
        } else if (this.f243f != null) {
            try {
                this.f243f.close();
            } catch (IOException e2) {
            } finally {
                this.f243f = null;
            }
        }
    }
}
