package p000;

import com.lightningtoads.jdropscape.Dropscape;
import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: renamed from: ao */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class RunnableC0015ao extends FullCanvas implements Runnable {

    /* JADX INFO: renamed from: f */
    public AbstractC0043o f209f;

    /* JADX INFO: renamed from: g */
    public boolean f210g;

    /* JADX INFO: renamed from: h */
    public boolean f211h;

    /* JADX INFO: renamed from: i */
    public Display f212i;

    /* JADX INFO: renamed from: j */
    public Dropscape f213j;

    /* JADX INFO: renamed from: l */
    public int f215l;

    /* JADX INFO: renamed from: a */
    public int[] f204a = new int[10];

    /* JADX INFO: renamed from: b */
    public int f205b = 0;

    /* JADX INFO: renamed from: c */
    public int[] f206c = new int[10];

    /* JADX INFO: renamed from: d */
    public int f207d = 0;

    /* JADX INFO: renamed from: k */
    public int[] f214k = new int[5];

    /* JADX INFO: renamed from: e */
    public long f208e = 0;

    public RunnableC0015ao(MIDlet mIDlet, Display display) {
        this.f212i = display;
    }

    /* JADX INFO: renamed from: b */
    private int m136b(int i) {
        int gameAction;
        if (i == -23 && getKeyName(i).compareTo("OK") == 0) {
            return 8;
        }
        if (i == 42 || i == 35) {
            return i;
        }
        return ((i < 48 || i > 57) && (gameAction = getGameAction(i)) != 0) ? gameAction : i;
    }

    /* JADX INFO: renamed from: d */
    private void m137d() {
        if (this.f209f == null || this.f209f.f493aE != 0) {
            return;
        }
        this.f209f.mo129f();
        this.f209f.f493aE = 1;
    }

    /* JADX INFO: renamed from: e */
    private void m138e() {
        if (this.f209f == null || this.f209f.f493aE != 2) {
            return;
        }
        this.f209f.mo130g();
        this.f209f.f493aE = 0;
    }

    /* JADX INFO: renamed from: f */
    private void m139f() {
        if (this.f209f == null) {
            return;
        }
        if (this.f208e == 0) {
            this.f208e = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = (int) (jCurrentTimeMillis - this.f208e);
        if (i > 0 && i < 1000 && this.f209f.f493aE == 1) {
            this.f209f.mo119b(i);
            this.f209f.f493aE = 2;
        }
        this.f208e = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: a */
    public final void m140a() {
        if (this.f210g) {
            return;
        }
        this.f208e = 0L;
        this.f210g = true;
        this.f211h = true;
        this.f212i.setCurrent(this);
        new Thread(this).start();
    }

    /* JADX INFO: renamed from: a */
    public final void m141a(int i) {
        if (this.f215l >= this.f214k.length) {
            throw new RuntimeException("Too many commands");
        }
        int[] iArr = this.f214k;
        int i2 = this.f215l;
        this.f215l = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m142a(AbstractC0043o abstractC0043o) {
        this.f209f.mo132i();
        repaint();
        serviceRepaints();
        this.f209f = abstractC0043o;
        System.gc();
        this.f209f.mo131h();
    }

    /* JADX INFO: renamed from: b */
    public final void m143b() {
        if (this.f210g) {
            this.f210g = false;
            if (this.f209f != null) {
                this.f209f.mo132i();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m144c() {
        this.f210g = false;
        if (this.f209f != null) {
            this.f209f.mo132i();
            this.f209f.mo133j();
        }
    }

    public final void hideNotify() {
        m143b();
    }

    public final void keyPressed(int i) {
        int iM136b = m136b(i);
        synchronized (this.f204a) {
            if (this.f205b < 10) {
                this.f204a[this.f205b] = iM136b;
                this.f205b++;
            }
        }
    }

    public final void keyReleased(int i) {
        int iM136b = m136b(i);
        synchronized (this.f206c) {
            if (this.f207d < 10) {
                this.f206c[this.f207d] = iM136b;
                this.f207d++;
            }
        }
    }

    public final void paint(Graphics graphics) {
        if (this.f211h || this.f209f == null) {
            return;
        }
        this.f209f.mo114a(graphics);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException e) {
        }
        if (this.f209f != null) {
            this.f209f.mo131h();
        }
        while (this.f210g) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e2) {
            }
            m137d();
            m139f();
            this.f211h = false;
            synchronized (this.f204a) {
                for (int i = 0; i < this.f205b; i++) {
                    this.f209f.mo124c(this.f204a[i]);
                }
                this.f205b = 0;
            }
            synchronized (this.f206c) {
                for (int i2 = 0; i2 < this.f207d; i2++) {
                    this.f209f.mo125d(this.f206c[i2]);
                }
                this.f207d = 0;
            }
            repaint();
            serviceRepaints();
            m138e();
            if (this.f213j != null && this.f215l > 0) {
                for (int i3 = 0; i3 < this.f215l; i3++) {
                    this.f213j.m249a(this.f214k[i3]);
                }
                this.f215l = 0;
            }
        }
    }

    public final void showNotify() {
        m140a();
    }
}
