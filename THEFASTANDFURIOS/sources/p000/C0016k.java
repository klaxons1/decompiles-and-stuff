package p000;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreFullException;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: C:\Temp\jadx-6875864555729388861\classes.dex */
final class C0016k {

    /* JADX INFO: renamed from: b */
    private RunnableC0017l f309b;

    /* JADX INFO: renamed from: a */
    String[] f308a = null;

    /* JADX INFO: renamed from: c */
    private int f310c = 0;

    public C0016k(RunnableC0017l runnableC0017l) {
        this.f309b = runnableC0017l;
    }

    /* JADX INFO: renamed from: a */
    static int m93a(int i) {
        return new int[]{41, 42, 43, 44}[i];
    }

    /* JADX INFO: renamed from: d */
    private static void m94d() {
        try {
            RecordStore.deleteRecordStore("currentLanguage2");
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: a */
    final void m95a() {
        this.f309b.m171a(192, 0, this.f309b.f499d - this.f309b.m206q(192));
    }

    /* JADX INFO: renamed from: a */
    final void m96a(int i, int i2) {
        int i3 = this.f309b.f499d - 19;
        int i4 = i2 == 1 ? (this.f309b.f446c - 3) - 14 : 3;
        switch (i) {
            case 0:
                this.f309b.m171a(198, i4, i3);
                break;
            case 1:
                this.f309b.m171a(202, i4, i3);
                break;
            case 2:
                this.f309b.m171a(206, i4, i3);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                if (i2 != 0) {
                    this.f309b.f546t.m65a(this.f308a[i], 0, this.f308a[i].length(), this.f309b.f446c - 3, this.f309b.f499d - 19, 2);
                } else {
                    this.f309b.f546t.m65a(this.f308a[i], 0, this.f308a[i].length(), 3, this.f309b.f499d - 19, 0);
                }
                break;
            case 7:
                this.f309b.m171a(106, i4, i3);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    final void m97b(int i) {
        String str;
        this.f310c = i;
        this.f309b.f323G = i;
        if (this.f309b.f323G == 0) {
            this.f309b.f548v = this.f309b.f546t;
            this.f309b.f549w = this.f309b.f547u;
            this.f309b.f550x = this.f309b.f546t;
        } else {
            this.f309b.f548v = this.f309b.f545s;
            this.f309b.f549w = this.f309b.f546t;
            this.f309b.f550x = this.f309b.f545s;
        }
        if (this.f308a == null) {
            this.f308a = new String[201];
        }
        try {
            RunnableC0017l runnableC0017l = this.f309b;
            String[] strArr = this.f308a;
            switch (this.f310c) {
                case 0:
                    str = "text_eng.txt";
                    break;
                case 1:
                    str = "text_fre.txt";
                    break;
                case 2:
                    str = "text_itl.txt";
                    break;
                case 3:
                    str = "text_ger.txt";
                    break;
                case 4:
                    str = "text_spn.txt";
                    break;
                default:
                    str = "text_eng.txt";
                    break;
            }
            if (runnableC0017l.m167a(strArr, str, 201) != 201) {
                RunnableC0017l.m125a(0, "c:\\mobiledevelopment\\ff53d\\src\\gametext.hpp", 110, this.f309b);
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: b */
    final boolean m98b() {
        boolean z = true;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("currentLanguage2", false);
            if (recordStoreOpenRecordStore.getNumRecords() == 1) {
                this.f310c = recordStoreOpenRecordStore.getRecord(1)[0];
                recordStoreOpenRecordStore.closeRecordStore();
                if (this.f310c <= -1 || this.f310c >= 5) {
                    this.f310c = 0;
                    z = false;
                } else {
                    m97b(this.f310c);
                }
            } else {
                this.f310c = 0;
                z = false;
            }
            return z;
        } catch (InvalidRecordIDException e) {
            m94d();
            this.f310c = 0;
            return false;
        } catch (Exception e2) {
            m94d();
            this.f310c = 0;
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    final void m99c() {
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("currentLanguage2", true);
            byte[] bArr = {(byte) this.f310c};
            if (recordStoreOpenRecordStore.getNumRecords() == 1) {
                byte[] record = recordStoreOpenRecordStore.getRecord(1);
                record[0] = (byte) this.f310c;
                recordStoreOpenRecordStore.setRecord(1, record, 0, 1);
            } else {
                recordStoreOpenRecordStore.closeRecordStore();
                RecordStore.deleteRecordStore("currentLanguage2");
                recordStoreOpenRecordStore = RecordStore.openRecordStore("currentLanguage2", true);
                recordStoreOpenRecordStore.addRecord(bArr, 0, 1);
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (RecordStoreFullException e) {
            this.f309b.f539m = true;
        } catch (Exception e2) {
            m94d();
        }
    }
}
