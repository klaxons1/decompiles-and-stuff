package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: C:\Temp\jadx-10272082993942724318\classes.dex */
public final class RunnableC0004e implements Runnable {

    /* JADX INFO: renamed from: a */
    private Thread f139a;

    /* JADX INFO: renamed from: a */
    private MessageConnection f140a;

    /* JADX INFO: renamed from: b */
    private RunnableC0002c f141b;

    /* JADX INFO: renamed from: c */
    String f142c;

    /* JADX INFO: renamed from: d */
    public String f143d = "";

    /* JADX INFO: renamed from: r */
    int f144r = 0;

    /* JADX INFO: renamed from: x */
    public boolean f145x;

    /* JADX INFO: renamed from: a */
    final int m33a(RunnableC0002c runnableC0002c) {
        this.f141b = runnableC0002c;
        if (this.f139a == null) {
            this.f144r = this.f141b.f65d;
            this.f145x = true;
            this.f139a = new Thread(this);
            this.f139a.start();
        } else {
            this.f144r = 10;
        }
        return this.f144r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f140a == null) {
            try {
                this.f140a = Connector.open(this.f142c);
            } catch (IOException e) {
                this.f144r = 2;
                this.f145x = false;
                return;
            } catch (SecurityException e2) {
                this.f144r = 4;
                this.f145x = false;
                return;
            } catch (ConnectionNotFoundException e3) {
                this.f144r = 3;
                this.f145x = false;
                return;
            } catch (IllegalArgumentException e4) {
                this.f144r = 1;
                this.f145x = false;
                return;
            }
        }
        try {
            C0006g c0006g = this.f141b.f36a;
            c0006g.f358a = this.f140a.newMessage("text");
            TextMessage textMessage = c0006g.f358a;
            RunnableC0002c runnableC0002c = c0006g.f519d;
            runnableC0002c.f50b = (byte) (runnableC0002c.f50b + runnableC0002c.f66d[runnableC0002c.f44a[0] + 35]);
            textMessage.setPayloadText(runnableC0002c.f36a.f538j);
            MessageConnection messageConnection = this.f140a;
            C0006g c0006g2 = this.f141b.f36a;
            RunnableC0002c runnableC0002c2 = c0006g2.f519d;
            runnableC0002c2.f57c = (byte) (runnableC0002c2.f57c + c0006g2.f365aB[c0006g2.f546p[0] + 36]);
            messageConnection.send(c0006g2.f358a);
            try {
                this.f140a.close();
            } catch (Exception e5) {
                this.f144r = 11;
            }
            this.f145x = false;
        } catch (InterruptedIOException e6) {
            this.f144r = 6;
            this.f145x = false;
        } catch (IOException e7) {
            this.f144r = 9;
            this.f145x = false;
        } catch (IllegalArgumentException e8) {
            this.f144r = 5;
            this.f145x = false;
        } catch (NullPointerException e9) {
            this.f144r = 7;
            this.f145x = false;
        } catch (SecurityException e10) {
            this.f144r = 8;
            this.f145x = false;
        }
    }
}
