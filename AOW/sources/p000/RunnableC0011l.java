package p000;

import java.io.DataInputStream;
import javax.microedition.rms.RecordStore;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class RunnableC0011l implements Runnable {

    /* JADX INFO: renamed from: n */
    private static short[][] f622n = null;

    /* JADX INFO: renamed from: d */
    private static C0006g f621d = null;

    public static void start() {
        boolean z;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("crack", true);
            recordStoreOpenRecordStore.getRecord(1, new byte[recordStoreOpenRecordStore.getRecordSize(1)], 0);
            recordStoreOpenRecordStore.closeRecordStore();
            z = true;
        } catch (Exception e) {
            z = false;
        }
        if (!z) {
            try {
                DataInputStream dataInputStream = new DataInputStream(aow22.m7a());
                if (dataInputStream.readInt() == 1380799232) {
                    int i = dataInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        String utf = dataInputStream.readUTF();
                        try {
                            RecordStore.deleteRecordStore(utf);
                        } catch (Exception e2) {
                        }
                        RecordStore recordStoreOpenRecordStore2 = RecordStore.openRecordStore(utf, true);
                        int i3 = dataInputStream.readInt();
                        for (int i4 = 1; i4 < i3; i4++) {
                            dataInputStream.readInt();
                            char c = dataInputStream.readChar();
                            int iAddRecord = recordStoreOpenRecordStore2.addRecord((byte[]) null, 0, 0);
                            if (c == '+') {
                                byte[] bArr = new byte[dataInputStream.readInt()];
                                dataInputStream.read(bArr);
                                recordStoreOpenRecordStore2.setRecord(iAddRecord, bArr, 0, bArr.length);
                            } else {
                                recordStoreOpenRecordStore2.deleteRecord(iAddRecord);
                            }
                        }
                        recordStoreOpenRecordStore2.closeRecordStore();
                    }
                }
            } catch (Exception e3) {
            }
        }
        new Thread(new RunnableC0011l()).start();
    }

    /* JADX INFO: Infinite loop detected, blocks: 15, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Thread.sleep(64L);
                if (f622n == null) {
                    f622n = aow22.f22b.f24g.f35a.f287j;
                }
                if (f621d == null) {
                    f621d = aow22.f22b.f24g.f36a;
                }
                f621d.f367aC = 2;
                f621d.f370aD = 3;
            } catch (Exception e) {
            }
        }
    }
}
