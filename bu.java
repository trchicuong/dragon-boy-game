/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bu {
    public static boolean a = false;
    private static bu l;
    public static float b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;

    static {
        b = 0.5f;
        c = 30;
        d = 31;
        e = 32;
        f = 33;
        g = 34;
        h = 35;
        i = 36;
        j = 37;
        k = 38;
    }

    public static bu a() {
        if (l == null) {
            l = new bu();
        }
        return l;
    }

    public final void b() {
        if (af.cU) {
            av.a("isPaintAura", 0);
            af.cU = false;
        } else {
            av.a("isPaintAura", 1);
            af.cU = true;
        }
        bu.g();
    }

    public final void c() {
        if (!main.a.e) {
            bu bu2 = this;
            if (p.bV = !p.bV) {
                av.a("serverchat", 0);
            } else {
                av.a("serverchat", 1);
            }
            bu.g();
            return;
        }
        bu bu3 = this;
        if (p.aO == 0) {
            p.aO = 1;
            av.a("analog", p.aO);
            p.m();
        } else {
            p.aO = 0;
            av.a("analog", p.aO);
            p.m();
        }
        bu.g();
    }

    public final void d() {
        if (main.a.a) {
            av.a("lowGraphic", 0);
            main.a.a(aw.cL, 8885, null);
        } else {
            av.a("lowGraphic", 1);
            main.a.a(aw.cL, 8885, null);
        }
        bu.g();
    }

    public final void e() {
        if (af.cV) {
            av.a("isPaintAura2", 0);
            af.cV = false;
        } else {
            av.a("isPaintAura2", 1);
            af.cV = true;
        }
        bu.g();
    }

    public static void f() {
        if (main.a.I.n && af.e().aD != null && af.e().aD.c >= 2) {
            g.G = new String[]{aw.i, aw.bS, aw.bR, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S, aw.H};
            if (af.e().bO) {
                g.G = new String[]{aw.i, aw.bS, aw.bR, aw.w, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S, aw.H};
            }
        } else {
            g.G = new String[]{aw.i, aw.bS, aw.bR, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S};
            if (af.e().bO) {
                g.G = new String[]{aw.i, aw.bS, aw.bR, aw.w, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S};
            }
        }
        if (a) {
            String[] stringArray = new String[g.G.length + 1];
            int n2 = 0;
            while (n2 < g.G.length) {
                stringArray[n2] = g.G[n2];
                ++n2;
            }
            stringArray[g.G.length] = aw.d;
            g.G = stringArray;
        }
    }

    public static void g() {
        String string;
        String string2 = "[x]   ";
        String string3 = "[  ]   ";
        String string4 = string = p.aO == 0 ? String.valueOf(string3) + aw.E : String.valueOf(string2) + aw.F;
        if (!main.a.e) {
            string = !p.bV ? String.valueOf(string3) + aw.bW : String.valueOf(string2) + aw.bW;
        }
        g.H = new String[]{af.cU ? String.valueOf(string2) + aw.ca.trim() : String.valueOf(string3) + aw.ca.trim(), af.cV ? String.valueOf(string2) + aw.cb.trim() : String.valueOf(string3) + aw.cb.trim(), main.a.aj ? String.valueOf(string2) + aw.fz.trim() : String.valueOf(string3) + aw.fz.trim(), main.a.a ? String.valueOf(string2) + aw.y.trim() : String.valueOf(string3) + aw.y.trim(), string};
    }

    public static void h() {
        br.a().e();
        main.a.G.A();
        main.a.I.f();
        main.a.I.b();
    }
}
