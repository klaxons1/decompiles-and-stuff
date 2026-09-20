package p000;

import java.io.IOException;
import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.L2CAPConnection;
import javax.bluetooth.L2CAPConnectionNotifier;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;

/* JADX INFO: renamed from: c */
/* JADX INFO: loaded from: C:\Temp\jadx-9991838165078942717\classes.dex */
public class RunnableC0002c implements DiscoveryListener, Runnable {

    /* JADX INFO: renamed from: q */
    public static final UUID f5q = new UUID("000050280000100080000002EE000001", false);

    /* JADX INFO: renamed from: a */
    private DiscoveryAgent f6a;

    /* JADX INFO: renamed from: b */
    public Vector f7b;

    /* JADX INFO: renamed from: c */
    private Thread f8c;

    /* JADX INFO: renamed from: f */
    private int f11f;

    /* JADX INFO: renamed from: g */
    private L2CAPConnectionNotifier f12g;

    /* JADX INFO: renamed from: h */
    private int f13h;

    /* JADX INFO: renamed from: j */
    public int f15j;

    /* JADX INFO: renamed from: k */
    private int f16k;

    /* JADX INFO: renamed from: l */
    public Vector f17l;

    /* JADX INFO: renamed from: m */
    private byte[] f18m;

    /* JADX INFO: renamed from: n */
    private byte[] f19n;

    /* JADX INFO: renamed from: o */
    public boolean f20o;

    /* JADX INFO: renamed from: p */
    private LocalDevice f21p;

    /* JADX INFO: renamed from: u */
    private ServiceRecord f25u;

    /* JADX INFO: renamed from: r */
    private int f22r = 0;

    /* JADX INFO: renamed from: i */
    private int f14i = 0;

    /* JADX INFO: renamed from: s */
    private String f23s = "Soccer Game Server";

    /* JADX INFO: renamed from: d */
    private L2CAPConnection f9d = null;

    /* JADX INFO: renamed from: t */
    public int f24t = 0;

    /* JADX INFO: renamed from: e */
    public int f10e = 0;

    public RunnableC0002c() {
        this.f19n = null;
        this.f17l = null;
        this.f7b = null;
        this.f21p = null;
        try {
            this.f21p = LocalDevice.getLocalDevice();
            if (this.f21p.setDiscoverable(10390323)) {
                this.f19n = new byte[332];
                this.f17l = new Vector();
                this.f7b = new Vector();
            }
        } catch (Exception e) {
            this.f19n = null;
            this.f17l = null;
            this.f7b = null;
            this.f21p = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1a(RemoteDevice remoteDevice) {
        try {
            this.f6a.searchServices((int[]) null, new UUID[]{f5q}, remoteDevice, this);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2a(int i) {
        this.f16k = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3a() {
        this.f13h = ((int) System.currentTimeMillis()) - this.f11f;
        return this.f13h > this.f16k;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4a(boolean z, ServiceRecord serviceRecord) {
        if (this.f10e != 0) {
            return false;
        }
        try {
            if (this.f12g != null) {
                this.f12g.close();
            }
            if (this.f9d != null) {
                this.f9d.close();
            }
            this.f9d = null;
            this.f12g = null;
            this.f10e = 256;
            this.f20o = z;
            this.f25u = serviceRecord;
            this.f8c = new Thread(this);
            this.f8c.setPriority(5);
            this.f8c.start();
            return true;
        } catch (Exception e) {
            this.f9d = null;
            this.f12g = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m5a(byte[] bArr, int i) {
        if ((this.f10e & 512) == 0 || (this.f10e & 1024) != 0) {
            return false;
        }
        this.f18m = null;
        this.f18m = new byte[i];
        System.arraycopy(bArr, 0, this.f18m, 0, i);
        this.f10e |= 1024;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m6a(byte[] bArr) {
        m2a(3000);
        m13f();
        if (!this.f20o) {
            boolean zM5a = false;
            boolean z = false;
            do {
                if (!z || !zM5a) {
                    zM5a = m5a(bArr, bArr.length);
                    if (!z && m10c() != null) {
                        z = true;
                    }
                }
            } while (!m3a());
            return null;
        }
        boolean zM5a2 = false;
        boolean z2 = false;
        do {
            if (!z2 || !zM5a2) {
                if (!zM5a2) {
                    zM5a2 = m5a(bArr, bArr.length);
                }
                if (!z2 && m10c() != null) {
                    z2 = true;
                }
            }
        } while (!m3a());
        return null;
        return this.f19n;
    }

    /* JADX INFO: renamed from: b */
    public ServiceRecord m7b(int i) {
        return ((ServiceRecord[]) this.f7b.elementAt(i))[0];
    }

    /* JADX INFO: renamed from: b */
    public void m8b() {
        this.f10e = 0;
        try {
            if (this.f12g != null) {
                this.f12g.close();
            }
            if (this.f9d != null) {
                this.f9d.close();
            }
        } catch (Exception e) {
        }
        this.f9d = null;
        this.f12g = null;
    }

    /* JADX INFO: renamed from: c */
    public String m9c(int i) {
        if (i <= this.f17l.size()) {
            try {
                return ((RemoteDevice) this.f17l.elementAt(i)).getFriendlyName(false);
            } catch (Exception e) {
                this.f17l.removeElementAt(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m10c() {
        if ((this.f10e & 2048) == 0) {
            return null;
        }
        this.f10e ^= 2048;
        return this.f19n;
    }

    /* JADX INFO: renamed from: d */
    public void m11d() {
        if (this.f10e == 0) {
            this.f22r = 0;
            this.f14i = 0;
            this.f17l.removeAllElements();
            this.f7b.removeAllElements();
            this.f6a = this.f21p.getDiscoveryAgent();
            this.f10e = 1;
            this.f25u = null;
            try {
                this.f6a.startInquiry(10390323, this);
            } catch (Exception e) {
            }
        }
    }

    public void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
        this.f17l.addElement(remoteDevice);
        this.f22r++;
    }

    /* JADX INFO: renamed from: e */
    public int m12e() {
        return this.f17l.size();
    }

    /* JADX INFO: renamed from: f */
    public void m13f() {
        this.f13h = 0;
        this.f11f = (int) System.currentTimeMillis();
    }

    public void inquiryCompleted(int i) {
        if (this.f22r != 0) {
            m1a((RemoteDevice) this.f17l.firstElement());
        } else {
            this.f10e = 0;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String string;
        String str = "";
        if (!this.f20o) {
            string = new StringBuffer().append(this.f25u.getConnectionURL(0, false)).append(";ReceiveMTU=332;TransmitMTU=332").toString();
        } else if (this.f10e != 0) {
            try {
                string = new StringBuffer().append("btl2cap://localhost:").append(f5q.toString()).append(";name=").append(this.f23s).append(";ReceiveMTU=").append(332).append(";TransmitMTU=").append(332).append("").toString();
                try {
                    this.f12g = Connector.open(string);
                    if (this.f12g != null) {
                        this.f9d = this.f12g.acceptAndOpen();
                        if (this.f9d == null) {
                            this.f10e = 0;
                        }
                    } else {
                        this.f10e = 0;
                    }
                } catch (Exception e) {
                    str = string;
                    this.f10e = 0;
                    string = str;
                }
            } catch (Exception e2) {
            }
        } else {
            string = "";
        }
        while ((this.f10e & 256) != 0) {
            try {
                if (this.f24t > 0) {
                    Thread thread = this.f8c;
                    Thread.sleep(this.f24t);
                }
                if ((this.f10e & 512) == 0) {
                    if (this.f20o) {
                        RemoteDevice.getRemoteDevice(this.f9d);
                        this.f10e |= 512;
                    } else {
                        this.f15j = 0;
                        try {
                            this.f9d = Connector.open(string);
                            this.f10e |= 512;
                        } catch (IOException e3) {
                            this.f15j = 1;
                            this.f10e = 0;
                        }
                    }
                } else if (this.f9d.ready()) {
                    this.f9d.receive(this.f19n);
                    this.f10e |= 2048;
                } else if ((this.f10e & 1024) != 0) {
                    this.f10e ^= 1024;
                    this.f9d.send(this.f18m);
                }
            } catch (Exception e4) {
                this.f10e = 0;
            }
        }
        try {
            if (this.f12g != null) {
                this.f12g.close();
            }
            if (this.f9d != null) {
                this.f9d.close();
            }
        } catch (IOException e5) {
        }
        this.f9d = null;
        this.f12g = null;
    }

    public void serviceSearchCompleted(int i, int i2) {
        if (i2 == 1) {
            this.f14i++;
        } else {
            this.f17l.removeElementAt(this.f14i);
            this.f22r--;
        }
        if (this.f14i == this.f22r) {
            this.f10e = 0;
        } else {
            m1a((RemoteDevice) this.f17l.elementAt(this.f14i));
        }
    }

    public void servicesDiscovered(int i, ServiceRecord[] serviceRecordArr) {
        this.f7b.addElement(serviceRecordArr);
    }
}
