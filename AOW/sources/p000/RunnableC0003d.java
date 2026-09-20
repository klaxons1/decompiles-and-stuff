package p000;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class RunnableC0003d implements Runnable {

    /* JADX INFO: renamed from: a */
    private HttpConnection f129a;

    /* JADX INFO: renamed from: b */
    C0006g f130b;

    /* JADX INFO: renamed from: b */
    private InputStream f131b;

    /* JADX INFO: renamed from: p */
    private byte[] f134p = new byte[14];

    /* JADX INFO: renamed from: c */
    private String[] f132c = new String[11];

    /* JADX INFO: renamed from: v */
    private byte f136v = 0;

    /* JADX INFO: renamed from: w */
    byte f137w = 0;

    /* JADX INFO: renamed from: p */
    int f133p = 0;

    /* JADX INFO: renamed from: q */
    private int f135q = 0;

    /* JADX INFO: renamed from: w */
    private boolean f138w = false;

    /* JADX INFO: renamed from: d */
    private int m30d() {
        int i = 0;
        try {
            i = this.f134p[this.f135q] ^ this.f131b.read();
            this.f135q = (this.f135q + 1) % this.f134p.length;
            return i;
        } catch (IOException e) {
            return i;
        }
    }

    /* JADX INFO: renamed from: p */
    final void m31p() {
        this.f138w = false;
        this.f136v = (byte) 2;
        this.f137w = (byte) 2;
        new Thread(this).start();
    }

    /* JADX INFO: renamed from: q */
    final void m32q() {
        this.f138w = true;
        Thread.yield();
        try {
            if (this.f129a != null) {
                this.f129a.close();
            }
        } catch (IOException e) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f136v == 2) {
                if (this.f132c[0] == null || this.f132c[0] == "") {
                    for (int i = 0; i < 11; i++) {
                        this.f132c[i] = "";
                        for (int i2 = this.f130b.f546p[i + 146]; i2 < this.f130b.f546p[i + 146 + 1]; i2++) {
                            StringBuffer stringBuffer = new StringBuffer();
                            String[] strArr = this.f132c;
                            strArr[i] = stringBuffer.append(strArr[i]).append((char) (this.f130b.f365aB[i2] & 255)).toString();
                        }
                    }
                }
                String str = this.f132c[0];
                String string = new StringBuffer().append(this.f133p).toString();
                String string2 = new StringBuffer().append(this.f130b.f430at).toString();
                String string3 = new StringBuffer().append((int) this.f130b.f519d.f118q).toString();
                int i3 = this.f130b.f370aD;
                for (int i4 = 0; i4 < 3; i4++) {
                    i3 = (i3 | (((i3 >> i4) & 1) << (7 - i4))) & ((1 << i4) ^ (-1));
                }
                String strValueOf = String.valueOf(i3);
                String string4 = new StringBuffer().append(this.f130b.f377aG).toString();
                String string5 = new StringBuffer().append(this.f130b.f519d.f102l).toString();
                String string6 = "";
                for (int i5 = 0; i5 < this.f134p.length; i5++) {
                    this.f134p[i5] = (byte) (((byte) str.charAt(i5 + 7)) ^ (this.f130b.f430at >> ((i5 % 4) * 8)));
                }
                String string7 = "";
                if (this.f133p == 1) {
                    string7 = new StringBuffer("&did=").append(new StringBuffer().append(this.f130b.f379aH - 1).toString()).toString();
                } else if (this.f133p == 2) {
                    string7 = new StringBuffer("&did=").append(new StringBuffer().append((int) this.f130b.f545o[this.f130b.f498bp]).toString()).toString();
                } else if (this.f133p != 3) {
                    if (this.f133p == 4) {
                        for (int i6 = 0; i6 < this.f130b.f474bR; i6++) {
                            string6 = new StringBuffer().append(string6).append((char) this.f130b.f443ax[i6]).toString();
                        }
                        string7 = new StringBuffer("&score=").append(string6).toString();
                    } else if (this.f133p == 8) {
                        string7 = new StringBuffer("&conv=").append(new StringBuffer().append(this.f130b.f367aC + 1).toString()).toString();
                    }
                }
                this.f129a = Connector.open(new StringBuffer().append(str).append(this.f132c[4]).append(string).append(this.f132c[5]).append(string2).append(this.f132c[6]).append("2").append(this.f132c[9]).append(string5).append(this.f132c[7]).append(string3).append(this.f132c[8]).append(string4).append(this.f132c[10]).append(strValueOf).append("&chan=").append("0").append(string7).toString());
                if (!this.f138w) {
                    this.f137w = (byte) 1;
                    if (this.f133p == 4) {
                        this.f129a.setRequestMethod("POST");
                        this.f129a.setRequestProperty("Connection", "close");
                        this.f129a.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        HttpConnection httpConnection = this.f129a;
                        String property = C0010k.getProperty("microedition.platform");
                        httpConnection.setRequestProperty("User-Agent", property != null ? new StringBuffer().append(property).append(" aow22").toString() : "aow22");
                    } else {
                        this.f129a.setRequestMethod("GET");
                    }
                    this.f131b = this.f129a.openInputStream();
                    int i7 = this.f131b.read() | (this.f131b.read() << 24) | (this.f131b.read() << 16) | (this.f131b.read() << 8);
                    this.f135q = 0;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            this.f130b.f386aL = this.f130b.f426ar[0];
                            this.f130b.f477bU = 1;
                            this.f130b.f388aM = (byte) 0;
                            this.f130b.f390aN = (byte) 0;
                            this.f130b.m209aC();
                            break;
                        }
                        if (this.f138w) {
                            break;
                        }
                        this.f130b.f426ar[i8] = (byte) m30d();
                        i8++;
                    }
                }
            }
            this.f137w = (byte) 0;
            try {
                if (this.f131b != null) {
                    this.f131b.close();
                }
                if (this.f129a != null) {
                }
            } catch (Exception e) {
            }
        } catch (Exception e2) {
            this.f137w = (byte) -5;
            try {
                if (this.f131b != null) {
                    this.f131b.close();
                }
                if (this.f129a != null) {
                }
            } catch (Exception e3) {
            }
        } catch (ConnectionNotFoundException e4) {
            this.f137w = (byte) -2;
            try {
                if (this.f131b != null) {
                    this.f131b.close();
                }
                if (this.f129a != null) {
                }
            } catch (Exception e5) {
            }
        } catch (IOException e6) {
            this.f137w = (byte) -5;
            try {
                if (this.f131b != null) {
                    this.f131b.close();
                }
                if (this.f129a != null) {
                }
            } catch (Exception e7) {
            }
        } catch (SecurityException e8) {
            this.f137w = (byte) -1;
            try {
                if (this.f131b != null) {
                    this.f131b.close();
                }
                if (this.f129a != null) {
                }
            } catch (Exception e9) {
            }
        } finally {
            try {
                if (this.f131b != null) {
                    this.f131b.close();
                }
                if (this.f129a != null) {
                    this.f129a.close();
                }
            } catch (Exception e10) {
            }
            this.f129a = null;
            this.f131b = null;
        }
        if (this.f136v != 2 || this.f137w >= 0) {
            return;
        }
        this.f130b.m207a(61, true);
    }
}
