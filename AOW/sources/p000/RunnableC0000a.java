package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DataElement;
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

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class RunnableC0000a implements Runnable, DiscoveryListener {

    /* JADX INFO: renamed from: a */
    int f1a;

    /* JADX INFO: renamed from: a */
    private RunnableC0002c f2a;

    /* JADX INFO: renamed from: a */
    private Vector f3a;

    /* JADX INFO: renamed from: a */
    private DiscoveryAgent f4a;

    /* JADX INFO: renamed from: a */
    L2CAPConnection f5a;

    /* JADX INFO: renamed from: a */
    private L2CAPConnectionNotifier f6a;

    /* JADX INFO: renamed from: a */
    private LocalDevice f7a;

    /* JADX INFO: renamed from: a */
    private int[] f10a;

    /* JADX INFO: renamed from: b */
    int f13b;

    /* JADX INFO: renamed from: b */
    Vector f14b;

    /* JADX INFO: renamed from: b */
    private boolean f15b;

    /* JADX INFO: renamed from: b */
    byte[] f16b;

    /* JADX INFO: renamed from: c */
    private int f17c;

    /* JADX INFO: renamed from: c */
    private Vector f18c;

    /* JADX INFO: renamed from: d */
    private boolean f20d;

    /* JADX INFO: renamed from: e */
    boolean f21e;

    /* JADX INFO: renamed from: a */
    private String[] f11a = new String[4];

    /* JADX INFO: renamed from: a */
    private UUID[] f12a = new UUID[1];

    /* JADX INFO: renamed from: c */
    boolean f19c = false;

    /* JADX INFO: renamed from: a */
    private byte[] f9a = new byte[288];

    /* JADX INFO: renamed from: a */
    byte f0a = -1;

    /* JADX INFO: renamed from: a */
    boolean f8a = true;

    RunnableC0000a(RunnableC0002c runnableC0002c) {
        this.f2a = runnableC0002c;
        for (int i = 0; i < 4; i++) {
            this.f11a[i] = "";
            for (int i2 = this.f2a.f44a[i + 135]; i2 < this.f2a.f44a[i + 135 + 1]; i2++) {
                StringBuffer stringBuffer = new StringBuffer();
                String[] strArr = this.f11a;
                strArr[i] = stringBuffer.append(strArr[i]).append((char) (this.f2a.f66d[i2] & 255)).toString();
            }
        }
        this.f13b = -1;
        this.f17c = -1;
        this.f12a[0] = new UUID(this.f11a[1], false);
        new Thread(this).start();
        String property = C0010k.getProperty("microedition.platform");
        boolean z = property != null && property.indexOf("Nokia6600") >= 0;
        this.f20d = z;
    }

    /* JADX INFO: renamed from: a */
    private int m0a() {
        byte b = 0;
        int i = 0;
        while (true) {
            byte b2 = b;
            if (i >= 404) {
                return b2 & 255;
            }
            b = (byte) (((byte) (this.f2a.f77f[i] * this.f2a.f77f[i])) + b2);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m1a(byte[] bArr) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            try {
                Thread.yield();
                long jCurrentTimeMillis = C0010k.currentTimeMillis();
                while (true) {
                    if (!this.f5a.ready() || this.f5a.receive(this.f9a) <= 0) {
                        if (C0010k.currentTimeMillis() > 60000 + jCurrentTimeMillis && this.f2a.f127u) {
                            return -1;
                        }
                        Thread.yield();
                    }
                }
                if (i3 == 0) {
                    int i5 = ((this.f9a[1] & 255) << 8) | (this.f9a[0] & 255);
                    if (i5 == 0) {
                        return -1;
                    }
                    if ((this.f9a[2] & 255) != this.f2a.f98k % 200 && this.f2a.f105m == 1 && this.f17c < 0) {
                        this.f17c = this.f2a.f98k;
                    }
                    if ((this.f9a[3] & 255) != m0a() && this.f2a.f105m == 1) {
                        this.f13b = this.f2a.f98k;
                    }
                    i2 = i5 + 1;
                    i = 4;
                } else {
                    i = 0;
                    i2 = i4;
                }
                int i6 = i2 - i3;
                if (i6 + i > 288) {
                    i6 = 288 - i;
                }
                C0010k.arraycopy(this.f9a, i, bArr, i3, i6);
                int i7 = i3 + i6;
                if (i7 >= i2) {
                    if (bArr[0] >= 0) {
                        new StringBuffer("DEBUG COMMAND IN ").append((int) bArr[0]).append(" on tick ").append(this.f2a.f98k);
                    }
                    return i2 - 1;
                }
                i3 = i7;
                i4 = i2;
            } catch (Exception e) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private int m2a(byte[] bArr, int i) {
        for (int i2 = 1; i2 <= i; i2++) {
            try {
                bArr[(i + 4) - i2] = bArr[i - i2];
            } catch (Exception e) {
                C0010k.out.println(new StringBuffer("Can't send image data: ").append(e).toString());
                return -1;
            }
        }
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[2] = (byte) (this.f2a.f98k % 200);
        bArr[3] = (byte) m0a();
        int i3 = i + 4;
        bArr[i3] = 91;
        for (int i4 = 4; i4 < i3; i4++) {
            bArr[i3] = (byte) (bArr[i3] ^ bArr[i4]);
        }
        int i5 = i3 + 1;
        if (i5 < 288) {
            byte[] bArr2 = new byte[this.f20d ? 288 : i5];
            C0010k.arraycopy(bArr, 0, bArr2, 0, i5);
            this.f5a.send(bArr2);
            return 0;
        }
        int i6 = 0;
        while (i5 - i6 >= 288) {
            byte[] bArr3 = new byte[288];
            C0010k.arraycopy(bArr, i6, bArr3, 0, 288);
            this.f5a.send(bArr3);
            Thread.yield();
            i6 += 288;
        }
        int i7 = i5 - i6;
        byte[] bArr4 = new byte[this.f20d ? 288 : i7];
        C0010k.arraycopy(bArr, i6, bArr4, 0, i7);
        this.f5a.send(bArr4);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3a() {
        try {
            this.f7a = LocalDevice.getLocalDevice();
            this.f7a.setDiscoverable(10390323);
            this.f6a = Connector.open(new StringBuffer("btl2cap://localhost:").append(this.f11a[1]).append(";name=").append(this.f2a.f36a.f430at).append(";authenticate=false;encrypt=false;ReceiveMTU=288;TransmitMTU=288").toString());
            this.f7a.getRecord(this.f6a).setAttributeValue(17185, new DataElement(32, new StringBuffer().append(this.f2a.f36a.f430at).toString()));
            this.f5a = null;
            try {
                this.f5a = this.f6a.acceptAndOpen();
                this.f6a.close();
                this.f6a = null;
                return true;
            } catch (IOException e) {
                return false;
            }
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4a() {
        try {
            if (this.f6a != null) {
                this.f6a.close();
                this.f6a = null;
            }
        } catch (Exception e) {
        }
        try {
            if (this.f5a != null) {
                this.f5a.close();
                this.f5a = null;
            }
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m5a(int i) {
        try {
            this.f5a = null;
            String string = new StringBuffer(((ServiceRecord) this.f18c.elementAt(i)).getConnectionURL(0, false)).append(";ReceiveMTU=288;TransmitMTU=288").toString();
            if (string == null) {
                Enumeration enumeration = (Enumeration) ((DataElement) ((Enumeration) ((ServiceRecord) this.f18c.elementAt(i)).getAttributeValue(4).getValue()).nextElement()).getValue();
                enumeration.nextElement();
                string = new StringBuffer("btl2cap://").append(((ServiceRecord) this.f18c.elementAt(i)).getHostDevice().getBluetoothAddress()).append(":").append(Long.toString(((DataElement) enumeration.nextElement()).getLong(), 16)).append(";master=false;encrypt=false;authenticate=false;ReceiveMTU=288;TransmitMTU=288").toString();
            }
            try {
                this.f5a = Connector.open(string);
                return true;
            } catch (IOException e) {
                return false;
            }
        } catch (Exception e2) {
        }
    }

    /* JADX INFO: renamed from: b */
    final boolean m6b() {
        try {
            this.f7a = LocalDevice.getLocalDevice();
            this.f4a = this.f7a.getDiscoveryAgent();
            this.f3a = new Vector();
            this.f15b = true;
            try {
                if (!this.f4a.startInquiry(10390323, this)) {
                    return false;
                }
                while (this.f15b) {
                    RunnableC0002c.m10a(250L);
                }
                return true;
            } catch (BluetoothStateException e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }

    public final void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
        if (this.f3a.indexOf(remoteDevice) == -1) {
            this.f3a.addElement(remoteDevice);
        }
    }

    public final void inquiryCompleted(int i) {
        int i2 = 0;
        this.f14b = new Vector();
        this.f18c = new Vector();
        if (this.f3a.size() <= 0) {
            this.f15b = false;
            return;
        }
        this.f10a = new int[this.f3a.size()];
        int[] iArr = {17185};
        while (true) {
            int i3 = i2;
            if (i3 >= this.f3a.size()) {
                return;
            }
            try {
                this.f10a[i3] = this.f4a.searchServices(iArr, this.f12a, (RemoteDevice) this.f3a.elementAt(i3), this);
            } catch (Exception e) {
                this.f10a[i3] = -1;
            }
            i2 = i3 + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f8a) {
            switch (this.f0a) {
                case 0:
                    this.f21e = m3a();
                    break;
                case 1:
                    this.f1a = m2a(this.f16b, this.f1a);
                    if (this.f19c) {
                        this.f19c = false;
                        m4a();
                    }
                    break;
                case 2:
                    this.f1a = m1a(this.f16b);
                    break;
            }
            this.f0a = (byte) -1;
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
            }
        }
    }

    public final void serviceSearchCompleted(int i, int i2) {
        for (int i3 = 0; i3 < this.f10a.length; i3++) {
            if (this.f10a[i3] == i) {
                this.f10a[i3] = -1;
                break;
            }
        }
        for (int i4 = 0; i4 < this.f10a.length; i4++) {
            if (this.f10a[i4] != -1) {
                return;
            }
        }
        this.f15b = false;
    }

    public final void servicesDiscovered(int i, ServiceRecord[] serviceRecordArr) {
        if (serviceRecordArr.length > 0) {
            this.f18c.addElement(serviceRecordArr[0]);
            DataElement attributeValue = serviceRecordArr[0].getAttributeValue(17185);
            if (attributeValue == null || attributeValue.getDataType() != 32) {
                this.f14b.addElement("nullissimo");
            } else {
                this.f14b.addElement((String) attributeValue.getValue());
            }
        }
    }
}
