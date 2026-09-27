package com.m3gworks.engine;

import p000.AbstractC0042t;
import p000.C0001aa;
import p000.C0002ab;
import p000.C0004ad;
import p000.C0005ae;
import p000.C0009ai;
import p000.C0011ak;
import p000.C0015ao;
import p000.C0026d;
import p000.C0037o;
import p000.C0039q;
import p000.C0045w;

/* JADX INFO: renamed from: com.m3gworks.engine.a */
/* JADX INFO: loaded from: C:\Temp\jadx-13891056157711705654\classes.dex */
public final class C0020a {

    /* JADX INFO: renamed from: a */
    private static C0020a f106a;

    /* JADX INFO: renamed from: b */
    private int f107b = 1;

    private C0020a() {
    }

    /* JADX INFO: renamed from: a */
    public static C0020a m97a() {
        if (f106a == null) {
            f106a = new C0020a();
        }
        return f106a;
    }

    /* JADX INFO: renamed from: c */
    public static void m98c() {
        C0004ad c0004ad = new C0004ad();
        c0004ad.f12a = "спасение ученого";
        c0004ad.f13b = "/res/maps/5.m3g";
        c0004ad.f16e = "/res/maps/5.data";
        c0004ad.f14c = C0023d.f138s;
        c0004ad.f15d = "/res/image2d/thumbnail_1.png";
        c0004ad.f17f = 150.0f;
        c0004ad.f18g = new C0015ao(1, "Me", 0, new float[]{41.0f, 3.2f, -34.0f});
        c0004ad.f19h = new C0039q(1, "Mate", 0, new float[]{-84.0f, 0.05f, -63.0f}, false);
        C0026d c0026d = new C0026d("mission 0", "mission 0 desc", 2, true, new float[]{-65.80881f, 0.05f, -66.37585f}, 7.0f, 25.0f);
        c0026d.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-66.13764f, 0.05f, -43.92928f}, true), new C0002ab(2, "Bot", 3, new float[]{-68.30498f, 0.05f, -65.53292f}, true), new C0002ab(3, "Bot", 3, new float[]{-76.00909f, 0.05f, -42.10829f}, true)};
        c0026d.f161h = new C0005ae[]{new C0005ae(339, 1, new float[]{40.700607f, 0.3f, -42.998905f}, false), new C0005ae(336, 2, new float[]{39.200607f, 0.0f, -42.998905f}, false), new C0005ae(338, 6, new float[]{40.700607f, 0.0f, -41.498905f}, false), new C0005ae(337, 5, new float[]{42.200607f, 0.0f, -42.998905f}, false)};
        C0026d c0026d2 = new C0026d("mission 1", "mission 1 desc", 2, true, new float[]{-89.84386f, 0.05f, 32.566605f}, 7.0f, 25.0f);
        c0026d2.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-105.41666f, 0.05f, 26.493723f}, true), new C0002ab(2, "Bot", 3, new float[]{-79.4086f, 0.05f, 40.058193f}, true), new C0002ab(3, "Bot", 3, new float[]{-63.1997f, 0.05f, 22.556519f}, true)};
        C0026d c0026d3 = new C0026d("mission 2", "mission 2 desc", 4, true, new float[]{-21.163237f, 0.05f, -30.070118f}, 5.0f, 30.0f);
        c0026d3.f159f = new AbstractC0042t[]{new C0039q(1, "Mate", 1, new float[]{-21.163237f, 0.05f, -30.070118f}, true)};
        c0026d3.f164k = new C0009ai[]{new C0009ai(-2, null, 0.0f, 0.0f, true), new C0009ai(10, null, -1.0f, 2.1474836E9f, true), new C0009ai(-1, null, -1.0f, 0.0f, true)};
        c0026d3.f166m = new C0011ak(1, C0023d.f121b);
        C0026d c0026d4 = new C0026d("mission 3", "mission 3 desc", 1, true, new float[]{74.850586f, 0.0f, 54.617332f}, 10.0f, 90.0f);
        c0026d4.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{5.7791653f, 0.05f, 44.67751f}, false), new C0002ab(2, "Bot", 3, new float[]{-3.8908284f, 0.05f, -18.398756f}, false)};
        c0026d4.f164k = new C0009ai[]{new C0009ai(-2, null, 0.0f, 0.0f, false), new C0009ai(-1, null, -1.0f, 0.0f, true), new C0009ai(8, null, -1.0f, 0.0f, true), new C0009ai(-2, null, 0.0f, 0.0f, true), new C0009ai(11, null, -1.0f, 0.0f, true), new C0009ai(-1, null, -1.0f, 0.0f, true)};
        c0004ad.f20i = new C0026d[]{c0026d, c0026d2, c0026d3, c0026d4};
        c0004ad.f23l = new C0037o[]{new C0037o(-1, new float[]{-75.83976f, 5.0f, 35.734264f}, 0.0f, 0.0f), new C0037o(1, new float[]{-75.83976f, 5.0f, 35.734264f}, 0.0f, 15.0f), new C0037o(-2, null, 0.0f, 0.0f), new C0037o(-1, new float[]{-64.2f, 5.0f, -27.4f}, 45.0f, 0.0f), new C0037o(7, new float[]{-64.2f, 5.0f, -27.4f}, -1.0f, 120.0f), new C0037o(-2, null, -1.0f, 0.0f), new C0037o(-1, new float[]{c0004ad.f18g.m215p()[0], c0004ad.f18g.m215p()[1], c0004ad.f18g.m215p()[2]}, 0.0f, 0.0f)};
        C0045w.m228a().m235a(c0004ad);
        C0004ad c0004ad2 = new C0004ad();
        c0004ad2.f12a = "угон машины";
        c0004ad2.f13b = "/res/maps/3.m3g";
        c0004ad2.f16e = "/res/maps/3.data";
        c0004ad2.f14c = C0023d.f139t;
        c0004ad2.f15d = "/res/image2d/thumbnail_2.png";
        c0004ad2.f17f = 150.0f;
        c0004ad2.f18g = new C0015ao(1, "Me", 0, new float[]{-19.909487f, 3.2f, 72.02775f});
        c0004ad2.f19h = new C0039q(1, "Mate", 0, new float[]{-84.0f, 0.05f, -63.0f}, false);
        C0026d c0026d5 = new C0026d("mission 0", "mission 0 desc", 2, true, new float[]{-65.85681f, 0.05f, -7.4612722f}, 7.0f, 25.0f);
        c0026d5.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-64.342255f, 0.05f, 0.046309948f}, true), new C0002ab(2, "Bot", 3, new float[]{-65.66036f, 0.05f, -15.614548f}, true)};
        c0026d5.f161h = new C0005ae[]{new C0005ae(481, 4, new float[]{-20.214916f, 0.3f, 64.330734f}, false), new C0005ae(480, 6, new float[]{-21.714916f, 0.0f, 65.330734f}, false), new C0005ae(479, 5, new float[]{-20.214916f, 0.0f, 66.830734f}, false)};
        C0026d c0026d6 = new C0026d("mission 1", "mission 1 desc", 3, true, new float[]{80.70057f, 0.05f, -66.39298f}, 7.0f, 70.0f);
        c0026d6.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{25.713684f, 0.05f, -4.47254f}, false), new C0002ab(2, "Bot", 3, new float[]{92.547615f, 0.05f, -58.408684f}, false), new C0002ab(3, "Bot", 3, new float[]{41.30842f, 0.05f, -89.61635f}, false)};
        c0026d6.f162i = new C0001aa[]{new C0001aa(477, 478, true)};
        C0026d c0026d7 = new C0026d("mission 3", "mission 3 desc", 1, true, new float[]{-19.909487f, 3.2f, 72.02775f}, 10.0f, 90.0f);
        c0026d7.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-19.374079f, 0.05f, 54.93725f}, false), new C0002ab(2, "Bot", 3, new float[]{5.44467f, 0.05f, 70.16494f}, false)};
        c0004ad2.f20i = new C0026d[]{c0026d5, c0026d6, c0026d7};
        c0004ad2.f23l = new C0037o[]{new C0037o(-1, new float[]{48.302357f, 10.0f, -48.872574f}, 180.0f, 0.0f), new C0037o(3, new float[]{48.302357f, 10.0f, -48.872574f}, 0.0f, 20.0f), new C0037o(-2, null, 0.0f, 0.0f), new C0037o(-1, new float[]{60.89711f, 5.0f, -83.405106f}, 225.0f, 0.0f), new C0037o(7, new float[]{60.89711f, 5.0f, -83.405106f}, -1.0f, 120.0f), new C0037o(-2, null, -1.0f, 0.0f), new C0037o(-1, new float[]{c0004ad2.f18g.m215p()[0], c0004ad2.f18g.m215p()[1], c0004ad2.f18g.m215p()[2]}, 0.0f, 0.0f)};
        C0045w.m228a().m235a(c0004ad2);
        C0004ad c0004ad3 = new C0004ad();
        c0004ad3.f12a = "уничтожение";
        c0004ad3.f13b = "/res/maps/2.m3g";
        c0004ad3.f16e = "/res/maps/2.data";
        c0004ad3.f14c = C0023d.f140u;
        c0004ad3.f15d = "/res/image2d/thumbnail_3.png";
        c0004ad3.f17f = 150.0f;
        c0004ad3.f18g = new C0015ao(1, "Me", 0, new float[]{123.12175f, 3.2f, 64.81776f});
        c0004ad3.f19h = new C0039q(1, "Mate", 0, new float[]{-84.0f, 0.05f, -63.0f}, false);
        C0026d c0026d8 = new C0026d("mission 0", "mission 0 desc", 2, true, new float[]{38.228275f, 0.05f, -11.469077f}, 10.0f, 25.0f);
        c0026d8.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{32.382137f, 0.05f, -31.088665f}, true), new C0002ab(2, "Bot", 3, new float[]{38.228275f, 0.05f, -11.469077f}, true)};
        c0026d8.f161h = new C0005ae[]{new C0005ae(314, 1, new float[]{121.272995f, 0.3f, 54.120117f}, false), new C0005ae(311, 2, new float[]{119.272995f, 0.3f, 54.120117f}, false), new C0005ae(312, 7, new float[]{121.272995f, 0.3f, 56.120117f}, false), new C0005ae(313, 5, new float[]{123.272995f, 0.3f, 54.120117f}, false)};
        C0026d c0026d9 = new C0026d("mission 1", "mission 1 desc", 2, true, new float[]{-102.178345f, 0.05f, 9.537279f}, 10.0f, 30.0f);
        c0026d9.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-90.42267f, 0.05f, -6.643062f}, true), new C0002ab(2, "Bot", 3, new float[]{-93.99808f, 0.05f, 30.891033f}, true), new C0002ab(3, "Bot", 3, new float[]{-50.07881f, 0.05f, -18.175842f}, true)};
        C0026d c0026d10 = new C0026d("mission 2", "mission 2 desc", 2, true, new float[]{22.67954f, 0.05f, 67.66577f}, 10.0f, 30.0f);
        c0026d10.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{17.049822f, 0.05f, 75.83525f}, true), new C0002ab(2, "Bot", 3, new float[]{42.432243f, 0.05f, 44.487045f}, true)};
        C0026d c0026d11 = new C0026d("mission 3", "mission 3 desc", 1, true, new float[]{88.03467f, 3.2f, -45.215263f}, 10.0f, 30.0f);
        c0026d11.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{136.6784f, 0.05f, -38.897766f}, true), new C0002ab(2, "Bot", 3, new float[]{136.1756f, 0.05f, -24.757698f}, true), new C0002ab(3, "Bot", 3, new float[]{119.69717f, 0.05f, -16.127464f}, true)};
        c0026d11.f164k = new C0009ai[]{new C0009ai(-2, null, 0.0f, 0.0f, false), new C0009ai(-1, null, -1.0f, 0.0f, true), new C0009ai(8, null, -1.0f, 0.0f, true), new C0009ai(-2, null, 0.0f, 0.0f, true), new C0009ai(11, null, -1.0f, 0.0f, true), new C0009ai(-1, null, -1.0f, 0.0f, true)};
        c0004ad3.f20i = new C0026d[]{c0026d8, c0026d9, c0026d10, c0026d11};
        c0004ad3.f23l = new C0037o[]{new C0037o(-1, new float[]{22.733963f, 6.0f, 6.3737426f}, 60.0f, 0.0f), new C0037o(7, new float[]{22.733963f, 6.0f, 6.3737426f}, -1.0f, 120.0f), new C0037o(-2, null, 0.0f, 0.0f), new C0037o(-1, new float[]{43.67164f, 8.0f, -7.3992615f}, 315.0f, 0.0f), new C0037o(7, new float[]{43.67164f, 8.0f, -7.3992615f}, -1.0f, 100.0f), new C0037o(-2, null, -1.0f, 0.0f), new C0037o(-1, new float[]{c0004ad3.f18g.m215p()[0], c0004ad3.f18g.m215p()[1], c0004ad3.f18g.m215p()[2]}, 0.0f, 0.0f)};
        C0045w.m228a().m235a(c0004ad3);
        C0004ad c0004ad4 = new C0004ad();
        c0004ad4.f12a = "встреча с информатором";
        c0004ad4.f13b = "/res/maps/1.m3g";
        c0004ad4.f16e = "/res/maps/1.data";
        c0004ad4.f14c = C0023d.f141v;
        c0004ad4.f15d = "/res/image2d/thumbnail_4.png";
        c0004ad4.f17f = 150.0f;
        c0004ad4.f18g = new C0015ao(1, "Me", 0, new float[]{-130.21411f, 3.2f, -10.344215f});
        c0004ad4.f19h = new C0039q(1, "Mate", 0, new float[]{-84.0f, 0.05f, -63.0f}, false);
        C0026d c0026d12 = new C0026d("mission 2", "mission 2 desc", 1, true, new float[]{17.574062f, 0.05f, -15.744247f}, 5.0f, 20.0f);
        c0026d12.f159f = new AbstractC0042t[]{new C0039q(1, "Mate", 2, new float[]{17.574062f, 0.05f, -15.744247f}, true)};
        c0026d12.f164k = new C0009ai[]{new C0009ai(-2, null, 0.0f, 0.0f, false), new C0009ai(-1, null, -1.0f, 0.0f, true), new C0009ai(10, null, -1.0f, 2.1474836E9f, true), new C0009ai(-2, null, 0.0f, 0.0f, true), new C0009ai(-1, null, -1.0f, 0.0f, false)};
        c0026d12.f166m = new C0011ak(1, C0023d.f122c);
        c0026d12.f161h = new C0005ae[]{new C0005ae(330, 1, new float[]{-116.455475f, 0.3f, -11.747216f}, false), new C0005ae(329, 5, new float[]{-116.455475f, 0.3f, -13.147216f}, false)};
        C0026d c0026d13 = new C0026d("mission 1", "mission 1 desc", 2, true, new float[]{83.86756f, 0.05f, 22.830627f}, 10.0f, 30.0f);
        c0026d13.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{83.86756f, 0.05f, 22.830627f}, true), new C0002ab(2, "Bot", 3, new float[]{84.80921f, 0.05f, 0.0f}, true), new C0002ab(3, "Bot", 3, new float[]{101.342255f, 0.05f, 29.963186f}, true)};
        C0026d c0026d14 = new C0026d("mission 3", "mission 3 desc", 1, true, new float[]{68.90415f, 3.2f, 71.62316f}, 10.0f, 40.0f);
        c0026d14.f160g = new AbstractC0042t[]{new C0002ab(2, "Bot", 3, new float[]{-1.406394f, 0.05f, 86.13304f}, false), new C0002ab(3, "Bot", 3, new float[]{44.656868f, 0.05f, 99.6212f}, false)};
        c0026d14.f164k = new C0009ai[]{new C0009ai(-2, null, 0.0f, 0.0f, false), new C0009ai(-1, null, -1.0f, 0.0f, true), new C0009ai(8, null, -1.0f, 0.0f, true), new C0009ai(-2, null, 0.0f, 0.0f, true), new C0009ai(11, null, -1.0f, 0.0f, true), new C0009ai(-1, null, -1.0f, 0.0f, true)};
        c0004ad4.f20i = new C0026d[]{c0026d12, c0026d13, c0026d14};
        c0004ad4.f23l = new C0037o[]{new C0037o(-1, new float[]{-68.35648f, 6.0f, 41.690094f}, 0.0f, 0.0f), new C0037o(7, new float[]{-68.35648f, 6.0f, 41.690094f}, -1.0f, 100.0f), new C0037o(-2, null, 0.0f, 0.0f), new C0037o(-1, new float[]{c0004ad4.f18g.m215p()[0], c0004ad4.f18g.m215p()[1], c0004ad4.f18g.m215p()[2]}, 0.0f, 0.0f)};
        C0045w.m228a().m235a(c0004ad4);
        C0004ad c0004ad5 = new C0004ad();
        c0004ad5.f12a = "захват офицера";
        c0004ad5.f13b = "/res/maps/6.m3g";
        c0004ad5.f16e = "/res/maps/6.data";
        c0004ad5.f14c = C0023d.f142w;
        c0004ad5.f15d = "/res/image2d/thumbnail_5.png";
        c0004ad5.f17f = 150.0f;
        c0004ad5.f18g = new C0015ao(1, "Me", 0, new float[]{-0.90973866f, 3.2f, -107.7708f});
        c0004ad5.f19h = new C0039q(1, "Mate", 0, new float[]{-84.0f, 0.05f, -63.0f}, false);
        C0026d c0026d15 = new C0026d("mission 0", "mission 0 desc", 2, true, new float[]{73.53931f, 0.05f, 138.14067f}, 10.0f, 25.0f);
        c0026d15.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{73.53931f, 0.05f, 138.14067f}, true), new C0002ab(2, "Bot", 3, new float[]{40.273983f, 0.05f, 146.63127f}, true)};
        c0026d15.f161h = new C0005ae[]{new C0005ae(596, 1, new float[]{-1.3185203f, 0.3f, -85.901726f}, false), new C0005ae(595, 5, new float[]{0.0f, 0.3f, -84.401726f}, false)};
        C0026d c0026d16 = new C0026d("mission 2", "mission 2 desc", 1, false, new float[]{-50.17048f, 0.05f, 70.754875f}, 6.0f, 30.0f);
        c0026d16.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 4, new float[]{-50.17048f, 0.05f, 70.754875f}, false), new C0002ab(2, "Bot", 3, new float[]{-27.629393f, 0.05f, 63.251606f}, true), new C0002ab(3, "Bot", 3, new float[]{-44.834003f, 0.05f, 88.223305f}, true)};
        c0004ad5.f20i = new C0026d[]{c0026d15, c0026d16};
        c0004ad5.f23l = new C0037o[]{new C0037o(-1, new float[]{-0.34500116f, 6.0f, -95.95656f}, 240.0f, 0.0f), new C0037o(7, new float[]{-0.34500116f, 6.0f, -95.95656f}, -1.0f, 120.0f), new C0037o(-2, null, 0.0f, 0.0f), new C0037o(-1, new float[]{-0.14554274f, 8.0f, 122.35867f}, 60.0f, 0.0f), new C0037o(7, new float[]{-0.14554274f, 8.0f, 122.35867f}, -1.0f, 100.0f), new C0037o(-2, null, -1.0f, 0.0f), new C0037o(-1, new float[]{c0004ad5.f18g.m215p()[0], c0004ad5.f18g.m215p()[1], c0004ad5.f18g.m215p()[2]}, 0.0f, 0.0f)};
        C0045w.m228a().m235a(c0004ad5);
        C0004ad c0004ad6 = new C0004ad();
        c0004ad6.f12a = "уничтожение 2";
        c0004ad6.f13b = "/res/maps/4.m3g";
        c0004ad6.f16e = "/res/maps/4.data";
        c0004ad6.f14c = C0023d.f143x;
        c0004ad6.f15d = "/res/image2d/thumbnail_6.png";
        c0004ad6.f17f = 150.0f;
        c0004ad6.f18g = new C0015ao(1, "Me", 0, new float[]{-77.884056f, 3.2f, 89.3352f});
        c0004ad6.f19h = new C0039q(1, "Mate", 0, new float[]{-84.0f, 0.05f, -63.0f}, false);
        C0026d c0026d17 = new C0026d("mission 0", "mission 0 desc", 2, true, new float[]{-56.821648f, 0.05f, -13.634411f}, 10.0f, 40.0f);
        c0026d17.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-43.623127f, 0.05f, -24.950441f}, true), new C0002ab(1, "Bot", 3, new float[]{-83.71787f, 0.05f, -35.90635f}, true), new C0002ab(1, "Bot", 3, new float[]{-36.411102f, 0.05f, -54.66571f}, true), new C0002ab(2, "Bot", 3, new float[]{-79.19817f, 0.05f, -54.303116f}, true)};
        c0026d17.f161h = new C0005ae[]{new C0005ae(279, 1, new float[]{-77.884056f, 0.3f, 83.335205f}, false), new C0005ae(276, 2, new float[]{-76.384056f, 0.3f, 83.335205f}, false), new C0005ae(278, 6, new float[]{-77.884056f, 0.3f, 84.835205f}, false), new C0005ae(277, 5, new float[]{-79.28406f, 0.3f, 83.335205f}, false)};
        C0026d c0026d18 = new C0026d("mission 1", "mission 1 desc", 2, true, new float[]{8.589114f, 0.05f, -34.73408f}, 10.0f, 15.0f);
        c0026d18.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{8.589114f, 0.05f, -34.73408f}, true)};
        C0026d c0026d19 = new C0026d("mission 2", "mission 2 desc", 2, true, new float[]{104.286095f, 0.05f, -6.011861f}, 10.0f, 50.0f);
        c0026d19.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{127.51613f, 0.05f, -34.479576f}, true), new C0002ab(1, "Bot", 3, new float[]{151.97571f, 0.05f, -11.051382f}, true), new C0002ab(1, "Bot", 3, new float[]{140.85214f, 0.05f, 7.8999605f}, true), new C0002ab(2, "Bot", 3, new float[]{119.80853f, 0.05f, 21.91162f}, true)};
        C0026d c0026d20 = new C0026d("mission 3", "mission 3 desc", 1, true, new float[]{-102.82618f, 3.2f, 31.195707f}, 6.0f, 30.0f);
        c0026d20.f164k = new C0009ai[]{new C0009ai(-2, null, 0.0f, 0.0f, false), new C0009ai(-1, null, -1.0f, 0.0f, true), new C0009ai(8, null, -1.0f, 0.0f, true), new C0009ai(-2, null, 0.0f, 0.0f, true), new C0009ai(11, null, -1.0f, 0.0f, true), new C0009ai(-1, null, -1.0f, 0.0f, true)};
        c0004ad6.f20i = new C0026d[]{c0026d17, c0026d18, c0026d19, c0026d20};
        c0004ad6.f23l = new C0037o[]{new C0037o(-1, new float[]{-2.3127809f, 6.0f, -3.9495583f}, 60.0f, 0.0f), new C0037o(7, new float[]{-2.3127809f, 6.0f, -3.9495583f}, -1.0f, 120.0f), new C0037o(-2, null, 0.0f, 0.0f), new C0037o(-1, new float[]{121.807236f, 6.0f, 19.259012f}, 60.0f, 0.0f), new C0037o(7, new float[]{121.807236f, 6.0f, 19.259012f}, -1.0f, 100.0f), new C0037o(-2, null, -1.0f, 0.0f), new C0037o(-1, new float[]{c0004ad6.f18g.m215p()[0], c0004ad6.f18g.m215p()[1], c0004ad6.f18g.m215p()[2]}, 0.0f, 0.0f)};
        C0045w.m228a().m235a(c0004ad6);
        C0004ad c0004ad7 = new C0004ad();
        c0004ad7.f12a = "разрушение склада боеприпасов";
        c0004ad7.f13b = "/res/maps/8.m3g";
        c0004ad7.f16e = "/res/maps/8.data";
        c0004ad7.f14c = C0023d.f144y;
        c0004ad7.f15d = "/res/image2d/thumbnail_7.png";
        c0004ad7.f17f = 150.0f;
        c0004ad7.f18g = new C0015ao(1, "Me", 0, new float[]{-104.07254f, 3.2f, -88.55178f});
        c0004ad7.f19h = new C0039q(1, "Mate", 0, new float[]{-84.0f, 0.05f, -63.0f}, false);
        C0026d c0026d21 = new C0026d("mission 0", "mission 0 desc", 2, true, new float[]{34.718513f, 0.05f, 31.570494f}, 10.0f, 35.0f);
        c0026d21.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{34.718513f, 0.05f, 31.570494f}, true), new C0002ab(1, "Bot", 3, new float[]{44.817337f, 0.05f, -2.8956976f}, true), new C0002ab(3, "Bot", 3, new float[]{8.131538f, 0.05f, 23.281519f}, true)};
        c0026d21.f161h = new C0005ae[]{new C0005ae(447, 4, new float[]{-102.92236f, 0.3f, -76.60699f}, false), new C0005ae(448, 1, new float[]{-101.42236f, 0.3f, -76.60699f}, false), new C0005ae(446, 5, new float[]{-102.92236f, 0.3f, -75.10699f}, false)};
        C0026d c0026d22 = new C0026d("mission 1", "mission 1 desc", 3, true, new float[]{155.31885f, 0.05f, 69.6542f}, 8.0f, 30.0f);
        c0026d22.f160g = new AbstractC0042t[]{new C0002ab(2, "Bot", 3, new float[]{153.33914f, 0.05f, 46.73429f}, false), new C0002ab(3, "Bot", 3, new float[]{132.5299f, 0.05f, 50.994423f}, false)};
        c0026d22.f162i = new C0001aa[]{new C0001aa(444, 445, true)};
        C0026d c0026d23 = new C0026d("mission 3", "mission 3 desc", 1, true, new float[]{-77.86194f, 3.2f, 131.31508f}, 9.0f, 30.0f);
        c0026d23.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-40.937954f, 0.05f, 146.44781f}, false), new C0002ab(2, "Bot", 3, new float[]{-49.860283f, 0.05f, 134.38986f}, false)};
        c0026d23.f164k = new C0009ai[]{new C0009ai(-2, null, 0.0f, 0.0f, false), new C0009ai(-1, null, -1.0f, 0.0f, true), new C0009ai(8, null, -1.0f, 0.0f, true), new C0009ai(-2, null, 0.0f, 0.0f, true), new C0009ai(11, null, -1.0f, 0.0f, true), new C0009ai(-1, null, -1.0f, 0.0f, true)};
        c0004ad7.f20i = new C0026d[]{c0026d21, c0026d22, c0026d23};
        c0004ad7.f23l = new C0037o[]{new C0037o(-1, new float[]{61.51076f, 8.0f, 36.16284f}, 60.0f, 0.0f), new C0037o(7, new float[]{61.51076f, 8.0f, 36.16284f}, -1.0f, 180.0f), new C0037o(-2, null, -1.0f, 0.0f), new C0037o(-1, new float[]{c0004ad7.f18g.m215p()[0], c0004ad7.f18g.m215p()[1], c0004ad7.f18g.m215p()[2]}, 0.0f, 0.0f)};
        C0045w.m228a().m235a(c0004ad7);
        C0004ad c0004ad8 = new C0004ad();
        c0004ad8.f12a = "спасение";
        c0004ad8.f13b = "/res/maps/9.m3g";
        c0004ad8.f16e = "/res/maps/9.data";
        c0004ad8.f14c = C0023d.f145z;
        c0004ad8.f15d = "/res/image2d/thumbnail_8.png";
        c0004ad8.f17f = 300.0f;
        c0004ad8.f18g = new C0015ao(1, "Me", 0, new float[]{107.61824f, 3.2f, 242.53185f});
        c0004ad8.f19h = new C0039q(1, "Mate", 0, new float[]{-84.0f, 0.05f, -63.0f}, false);
        C0026d c0026d24 = new C0026d("mission 0", "mission 0 desc", 2, true, new float[]{-112.291435f, 0.05f, 155.35835f}, 10.0f, 25.0f);
        c0026d24.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-112.291435f, 0.05f, 155.35835f}, true), new C0002ab(3, "Bot", 3, new float[]{-95.912025f, 0.05f, 165.43321f}, true)};
        c0026d24.f161h = new C0005ae[]{new C0005ae(327, 2, new float[]{105.84094f, 0.3f, 224.66675f}, false), new C0005ae(330, 1, new float[]{104.74094f, 0.3f, 224.66675f}, false), new C0005ae(329, 6, new float[]{105.24094f, 0.3f, 223.16675f}, false), new C0005ae(328, 5, new float[]{106.74094f, 0.3f, 224.66675f}, false)};
        C0026d c0026d25 = new C0026d("mission 1", "mission 1 desc", 2, true, new float[]{-79.81425f, 0.05f, 47.11807f}, 10.0f, 35.0f);
        c0026d25.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-79.81425f, 0.05f, 47.11807f}, true), new C0002ab(1, "Bot", 3, new float[]{-135.6427f, 0.05f, 32.387077f}, true), new C0002ab(1, "Bot", 3, new float[]{-94.513275f, 0.05f, 7.2551f}, true)};
        C0026d c0026d26 = new C0026d("mission 3", "mission 3 desc", 1, true, new float[]{-2.1636932f, 0.05f, -77.489685f}, 8.0f, 35.0f);
        c0026d26.f160g = new AbstractC0042t[]{new C0002ab(1, "Bot", 3, new float[]{-2.1636932f, 0.05f, -77.489685f}, false), new C0002ab(2, "Bot", 3, new float[]{11.14242f, 0.05f, -79.50423f}, false)};
        c0026d26.f164k = new C0009ai[]{new C0009ai(-2, null, 0.0f, 0.0f, false), new C0009ai(-1, null, -1.0f, 0.0f, true), new C0009ai(8, null, -1.0f, 0.0f, true), new C0009ai(-2, null, 0.0f, 0.0f, true), new C0009ai(11, null, -1.0f, 0.0f, true), new C0009ai(-1, null, -1.0f, 0.0f, true), new C0009ai(12, null, -1.0f, 0.0f, true)};
        c0004ad8.f20i = new C0026d[]{c0026d24, c0026d25, c0026d26};
        c0004ad8.f23l = new C0037o[]{new C0037o(-1, new float[]{96.24789f, 8.0f, 106.30455f}, 60.0f, 0.0f), new C0037o(7, new float[]{96.24789f, 8.0f, 106.30455f}, -1.0f, 120.0f), new C0037o(-2, null, -1.0f, 0.0f), new C0037o(-1, new float[]{c0004ad8.f18g.m215p()[0], c0004ad8.f18g.m215p()[1], c0004ad8.f18g.m215p()[2]}, 0.0f, 0.0f)};
        C0045w.m228a().m235a(c0004ad8);
    }

    /* JADX INFO: renamed from: a */
    public final void m99a(int i) {
        this.f107b = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m100b() {
        return this.f107b;
    }
}
