package p000;

import java.lang.reflect.Array;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;

/* JADX INFO: renamed from: ab */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0002ab {

    /* JADX INFO: renamed from: a */
    public RunnableC0017l f33a;

    /* JADX INFO: renamed from: b */
    public int f34b;

    /* JADX INFO: renamed from: c */
    public int f35c;

    /* JADX INFO: renamed from: d */
    public int f36d;

    /* JADX INFO: renamed from: e */
    public boolean f37e;

    /* JADX INFO: renamed from: f */
    public boolean f38f;

    /* JADX INFO: renamed from: g */
    public boolean f39g;

    /* JADX INFO: renamed from: h */
    public boolean f40h;

    /* JADX INFO: renamed from: i */
    public int[][] f41i = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, 4);

    /* JADX INFO: renamed from: j */
    public int[][] f42j = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, 4);

    /* JADX INFO: renamed from: k */
    public int[][] f43k = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, 4);

    /* JADX INFO: renamed from: l */
    public int[] f44l = new int[32];

    public C0002ab(RunnableC0017l runnableC0017l) {
        this.f33a = runnableC0017l;
        m15e();
    }

    /* JADX INFO: renamed from: a */
    private void m13a(byte[] bArr, int i) {
        bArr[this.f34b] = i >> 24;
        bArr[this.f34b + 1] = (byte) (i >> 16);
        bArr[this.f34b + 2] = (byte) (i >> 8);
        bArr[this.f34b + 3] = (byte) i;
        this.f34b += 4;
    }

    /* JADX INFO: renamed from: b */
    private void m14b(byte[] bArr, int i) {
        bArr[this.f34b] = (byte) (i >> 8);
        bArr[this.f34b + 1] = (byte) i;
        this.f34b += 2;
    }

    /* JADX INFO: renamed from: e */
    private void m15e() {
        this.f33a.f539m = false;
        this.f35c = 0;
        this.f36d = 0;
        this.f37e = false;
        this.f38f = false;
        this.f39g = false;
        this.f40h = false;
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.f42j[i][i2] = 0;
                this.f41i[i][i2] = 0;
            }
        }
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                this.f43k[i3][i4] = 0;
            }
        }
        this.f43k[0][0] = 1;
        for (int i5 = 0; i5 < 32; i5++) {
            this.f44l[i5] = 0;
        }
        this.f44l[0] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m16a(byte[] bArr) {
        int i = (bArr[this.f34b] << 24) | ((bArr[this.f34b + 1] & 255) << 16) | ((bArr[this.f34b + 2] & 255) << 8) | (bArr[this.f34b + 3] & 255);
        this.f34b += 4;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final void m17a() {
        m18a(true);
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("FFL_profile", false);
            if (recordStoreOpenRecordStore.getNumRecords() != 1) {
                recordStoreOpenRecordStore.closeRecordStore();
                m25c();
                return;
            }
            byte[] record = recordStoreOpenRecordStore.getRecord(1);
            recordStoreOpenRecordStore.closeRecordStore();
            if (record == null) {
                m25c();
                return;
            }
            if (record.length != 337) {
                m25c();
                return;
            }
            if (record[0] != 51) {
                m25c();
                return;
            }
            this.f34b = 0;
            this.f34b++;
            this.f35c = m16a(record);
            this.f36d = m16a(record);
            this.f37e = m21b(record) != 0;
            this.f38f = m21b(record) != 0;
            this.f39g = m21b(record) != 0;
            this.f40h = m21b(record) != 0;
            for (int i = 0; i < 4; i++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    this.f42j[i][i2] = m16a(record);
                }
            }
            for (int i3 = 0; i3 < 4; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    this.f41i[i3][i4] = m16a(record);
                }
            }
            for (int i5 = 0; i5 < 4; i5++) {
                for (int i6 = 0; i6 < 4; i6++) {
                    this.f43k[i5][i6] = m16a(record);
                }
            }
            for (int i7 = 0; i7 < 32; i7++) {
                this.f44l[i7] = m16a(record);
            }
        } catch (RecordStoreException e) {
            m25c();
        } catch (RecordStoreFullException e2) {
            this.f33a.f539m = true;
            m25c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18a(boolean z) {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("FFL_profile", true);
            if (recordStoreOpenRecordStore.getNumRecords() != 1) {
                if (recordStoreOpenRecordStore.getNumRecords() > 0) {
                    recordStoreOpenRecordStore.closeRecordStore();
                    RecordStore.deleteRecordStore("FFL_profile");
                    recordStoreOpenRecordStore = RecordStore.openRecordStore("FFL_profile", true);
                }
                if (z) {
                    m15e();
                }
                byte[] bArr = new byte[337];
                this.f34b = 0;
                bArr[0] = 51;
                this.f34b++;
                m13a(bArr, this.f35c);
                m13a(bArr, this.f36d);
                m14b(bArr, this.f37e ? 1 : 0);
                m14b(bArr, this.f38f ? 1 : 0);
                m14b(bArr, this.f39g ? 1 : 0);
                m14b(bArr, this.f40h ? 1 : 0);
                for (int i = 0; i < 4; i++) {
                    for (int i2 = 0; i2 < 4; i2++) {
                        m13a(bArr, this.f42j[i][i2]);
                    }
                }
                for (int i3 = 0; i3 < 4; i3++) {
                    for (int i4 = 0; i4 < 4; i4++) {
                        m13a(bArr, this.f41i[i3][i4]);
                    }
                }
                for (int i5 = 0; i5 < 4; i5++) {
                    for (int i6 = 0; i6 < 4; i6++) {
                        m13a(bArr, this.f43k[i5][i6]);
                    }
                }
                for (int i7 = 0; i7 < 32; i7++) {
                    m13a(bArr, this.f44l[i7]);
                }
                recordStoreOpenRecordStore.addRecord(bArr, 0, 337);
            }
            recordStoreOpenRecordStore.closeRecordStore();
            this.f33a.f539m = false;
        } catch (Exception e) {
            e.printStackTrace();
            m25c();
        } catch (InvalidRecordIDException e2) {
            m25c();
        } catch (RecordStoreException e3) {
            m25c();
        } catch (RecordStoreFullException e4) {
            this.f33a.f539m = true;
            m25c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19a(int i) {
        return this.f44l[i] == 1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20a(int i, int i2) {
        return this.f43k[i][i2] == 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m21b(byte[] bArr) {
        int i = (bArr[this.f34b] << 8) | (bArr[this.f34b + 1] & 255);
        this.f34b += 2;
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final void m22b() {
        try {
            RecordStore.deleteRecordStore("FFL_profile");
        } catch (RecordStoreException e) {
            m25c();
        } catch (RecordStoreNotFoundException e2) {
        }
        m18a(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m23b(int i) {
        this.f44l[i] = 1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24b(int i, int i2) {
        if (i == 3 && i2 == 3) {
            return this.f38f;
        }
        int i3 = i2 + 1;
        if (i3 >= 4) {
            i++;
            i3 = 0;
        }
        return !m20a(i, i3);
    }

    /* JADX INFO: renamed from: c */
    public final void m25c() {
        try {
            RecordStore.deleteRecordStore("FFL_profile");
        } catch (RecordStoreNotFoundException e) {
        } catch (RecordStoreException e2) {
        }
        m15e();
        System.err.println("Profile Cleared");
    }

    /* JADX INFO: renamed from: d */
    public final int m26d() {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (m19a(i2)) {
                i++;
            }
        }
        return i;
    }
}
