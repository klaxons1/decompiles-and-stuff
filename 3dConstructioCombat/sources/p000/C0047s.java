package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Calendar;
import java.util.Date;
import javax.microedition.lcdui.Graphics;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;

/* JADX INFO: renamed from: s */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0047s extends C0052x {

    /* JADX INFO: renamed from: a */
    public int[] f514a;

    /* JADX INFO: renamed from: b */
    public Date[] f515b;

    /* JADX INFO: renamed from: c */
    public String[] f516c;

    /* JADX INFO: renamed from: d */
    public Calendar f517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0047s(InterfaceC0018ar interfaceC0018ar) {
        super(C0026az.m177a(C0026az.f273V), new String[]{C0026az.m177a(C0026az.f310k)}, interfaceC0018ar);
        int i = 0;
        this.f514a = new int[4];
        this.f515b = new Date[4];
        this.f516c = new String[4];
        this.f517d = Calendar.getInstance();
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("scores", true);
            RecordEnumeration recordEnumerationEnumerateRecords = recordStoreOpenRecordStore.enumerateRecords((RecordFilter) null, (RecordComparator) null, false);
            while (recordEnumerationEnumerateRecords.hasNextElement()) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(recordEnumerationEnumerateRecords.nextRecord()));
                int i2 = dataInputStream.readInt();
                long j = dataInputStream.readLong();
                dataInputStream.close();
                if (i < this.f514a.length) {
                    this.f514a[i] = i2;
                    this.f515b[i] = new Date(j);
                    this.f516c[i] = m318a(this.f515b[i]);
                }
                i++;
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (i < 4) {
            this.f516c[i] = C0026az.m177a(C0026az.f286ah);
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m318a(Date date) {
        this.f517d.setTime(date);
        return new StringBuffer().append(this.f517d.get(2) + 1).append("/").append(this.f517d.get(5)).append("/").append(this.f517d.get(1)).toString();
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final int mo7a() {
        return 6;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final void mo9a(Graphics graphics) {
        graphics.setColor(16777215);
        int i = C0052x.f539i - 24;
        int i2 = i / 2;
        int height = graphics.getFont().getHeight() / 2;
        int i3 = i / 6;
        graphics.setColor(16777215);
        graphics.drawString(this.f547q, 0, ((-i2) + (i3 / 2)) - height, 17);
        for (int i4 = 0; i4 < this.f514a.length; i4++) {
            int i5 = (((-i2) + ((i4 + 1) * i3)) + (i3 / 2)) - height;
            graphics.drawString(new StringBuffer().append("").append(this.f514a[i4]).toString(), -40, i5, 17);
            graphics.drawString(new StringBuffer().append("").append(this.f516c[i4]).toString(), 20, i5, 17);
        }
        graphics.setColor(this.f543m % 500 < 250 ? 16223774 : 16378665);
        graphics.drawString(this.f548r[0], 0, (((-i2) + (i3 * 5)) + (i3 / 2)) - height, 17);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m319c(int i) {
        for (int i2 = 0; i2 < this.f514a.length; i2++) {
            if (this.f514a[i2] < i) {
                System.arraycopy(this.f514a, i2, this.f514a, i2 + 1, (this.f514a.length - i2) - 1);
                System.arraycopy(this.f515b, i2, this.f515b, i2 + 1, (this.f515b.length - i2) - 1);
                System.arraycopy(this.f516c, i2, this.f516c, i2 + 1, (this.f516c.length - i2) - 1);
                this.f514a[i2] = i;
                this.f515b[i2] = new Date();
                this.f516c[i2] = m318a(this.f515b[i2]);
                return true;
            }
        }
        return false;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: h */
    public final void mo15h() {
        try {
            RecordStore.deleteRecordStore("scores");
        } catch (Exception e) {
        }
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore("scores", true);
            for (int i = 0; i < 4; i++) {
                if (this.f515b[i] != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(this.f514a[i]);
                    dataOutputStream.writeLong(this.f515b[i].getTime());
                    recordStoreOpenRecordStore.addRecord(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                }
            }
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception e2) {
        }
    }
}
