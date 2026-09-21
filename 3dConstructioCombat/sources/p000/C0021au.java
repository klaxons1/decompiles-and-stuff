package p000;

import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: au */
/* JADX INFO: loaded from: C:\Temp\jadx-17796118049335299489\classes.dex */
public final class C0021au extends C0052x {
    public C0021au(InterfaceC0018ar interfaceC0018ar) {
        super(C0026az.m177a(C0026az.f287ai), new String[]{C0026az.m177a(C0026az.f306g)}, interfaceC0018ar);
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final int mo7a() {
        return 7;
    }

    @Override // p000.C0052x
    /* JADX INFO: renamed from: a */
    public final void mo9a(Graphics graphics) {
        int i;
        graphics.setColor(16777215);
        int i2 = C0052x.f539i - 24;
        int i3 = i2 / 2;
        int height = graphics.getFont().getHeight() / 2;
        int i4 = i2 / 7;
        C0013am c0013amM99k = C0013am.m99k();
        graphics.setColor(16777215);
        int i5 = ((-i3) + (i4 / 2)) - height;
        if (c0013amM99k.f161al > c0013amM99k.f163an) {
            i = C0026az.f288aj;
        } else {
            i = c0013amM99k.f161al == c0013amM99k.f163an ? C0026az.f289ak : C0026az.f290al;
        }
        graphics.drawString(C0026az.m177a(i), 0, i5, 17);
        graphics.drawString(new StringBuffer().append(C0026az.m177a(C0026az.f291am)).append(": ").append(c0013amM99k.f161al).toString(), 0, (((-i3) + (i4 * 2)) + (i4 / 2)) - height, 17);
        graphics.drawString(new StringBuffer().append(C0026az.m177a(C0026az.f292an)).append(": ").append(c0013amM99k.f162am).toString(), 0, (((-i3) + (i4 * 3)) + (i4 / 2)) - height, 17);
        graphics.drawString(new StringBuffer().append(C0026az.m177a(C0026az.f293ao)).append(": ").append(c0013amM99k.f163an).toString(), 0, (((-i3) + (i4 * 4)) + (i4 / 2)) - height, 17);
        graphics.drawString(new StringBuffer().append(C0026az.m177a(C0026az.f294ap)).append(": ").append(c0013amM99k.f164ao).toString(), 0, (((-i3) + (i4 * 5)) + (i4 / 2)) - height, 17);
        graphics.setColor(this.f543m % 500 < 250 ? 16223774 : 16378665);
        graphics.drawString(this.f548r[0], 0, (((-i3) + (i4 * 6)) + (i4 / 2)) - height, 17);
    }
}
