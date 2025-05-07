/*
 * Decompiled with CFR 0.152.
 */
public final class ei {
    public static el a = new el("vEff");

    public static void a(ea ea2) {
        a.addElement(ea2);
    }

    public static void a(int n) {
        if (ei.b(n) != null) {
            a.removeElement(ei.b(n));
        }
    }

    private static ea b(int n) {
        int n2 = 0;
        while (n2 < a.size()) {
            ea ea2 = (ea)a.elementAt(n2);
            if (ea2.a == n) {
                return ea2;
            }
            ++n2;
        }
        return null;
    }

    public static void a(en en2, int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < a.size()) {
            if (((ea)ei.a.elementAt((int)n4)).h == -n3) {
                ((ea)a.elementAt(n4)).a(en2, n, n2);
            }
            ++n4;
        }
    }

    public static void a(en en2) {
        int n = 0;
        while (n < a.size()) {
            if (((ea)ei.a.elementAt((int)n)).h == 1) {
                ((ea)a.elementAt(n)).a(en2);
            }
            ++n;
        }
    }

    public static void b(en en2) {
        int n = 0;
        while (n < a.size()) {
            if (((ea)ei.a.elementAt((int)n)).h == 2) {
                ((ea)a.elementAt(n)).a(en2);
            }
            ++n;
        }
    }

    public static void c(en en2) {
        int n = 0;
        while (n < a.size()) {
            if (((ea)ei.a.elementAt((int)n)).h == 3) {
                ((ea)a.elementAt(n)).a(en2);
            }
            ++n;
        }
    }

    public static void d(en en2) {
        int n = 0;
        while (n < a.size()) {
            if (((ea)ei.a.elementAt((int)n)).h == 4) {
                ((ea)a.elementAt(n)).a(en2);
            }
            ++n;
        }
    }

    public static void a() {
        int n = 0;
        while (n < a.size()) {
            ((ea)a.elementAt(n)).a();
            ++n;
        }
    }
}
