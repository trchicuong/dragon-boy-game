/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class cy {
    public short a;
    public int b = 0;
    public int c;
    private long d;
    private long e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private String k;
    private int l = 100;

    public cy(short s, int n) {
        this.a = s;
        this.c = n / 60;
        this.b = n % 60;
        this.g = n;
        this.h = n;
        this.d = this.e = System.currentTimeMillis();
        this.f = s == 14;
    }

    public cy() {
    }

    public static boolean a(int n) {
        int n2 = 0;
        while (n2 < af.br.size()) {
            cy cy2 = (cy)af.br.elementAt(n2);
            if (cy2.a == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static boolean b(int n) {
        int n2 = 0;
        while (n2 < p.bv.size()) {
            cy cy2 = (cy)p.bv.elementAt(n2);
            if (cy2.a == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static cy c(int n) {
        int n2 = 0;
        while (n2 < af.br.size()) {
            cy cy2 = (cy)af.br.elementAt(n2);
            if (cy2.a == n) {
                return cy2;
            }
            ++n2;
        }
        return null;
    }

    public static cy d(int n) {
        int n2 = 0;
        while (n2 < p.bv.size()) {
            cy cy2 = (cy)p.bv.elementAt(n2);
            if (cy2.a == n) {
                return cy2;
            }
            ++n2;
        }
        return null;
    }

    public final void a(byte by2, String string, int n) {
        this.j = n == -1;
        this.i = true;
        this.c = n / 60;
        this.b = n % 60;
        this.a = by2;
        this.g = n;
        this.h = n;
        this.k = string;
        this.d = this.e = System.currentTimeMillis();
        this.f = this.a == 14;
    }

    public final void a(int n, boolean bl) {
        this.c = n / 60;
        this.b = n % 60;
        this.g = n;
        this.h = n;
        this.i = false;
        this.d = this.e = System.currentTimeMillis();
    }

    public final void a(en en2, int n2, int n3) {
        if (this.f) {
            if (af.e() != null) {
                n2 = main.a.A / 2 - 40;
                n3 = main.a.B - 80;
                en2.a(0x808080);
                en2.d(n2, n3, 80, 2);
                en2.a(0xFFFFFF);
                if (this.l > 0) {
                    en2.d(n2, n3, 80 * this.l / 100, 2);
                    return;
                }
            }
        } else {
            String string = String.valueOf(this.c) + "'";
            if (this.c <= 0) {
                string = String.valueOf(this.b) + "s";
            }
            if (this.c < 0) {
                string = "";
            }
            if (this.j) {
                string = "";
            }
            di.c.a(en2, String.valueOf(this.k) + " " + string, n2, n3, 0, di.f);
        }
    }

    public final void a() {
        this.d = System.currentTimeMillis();
        if (this.d - this.e >= 1000L) {
            this.e = System.currentTimeMillis();
            --this.b;
            --this.h;
            if (this.b <= 0) {
                this.b = 60;
                --this.c;
            }
            if (this.g > 0) {
                this.l = this.h * 100 / this.g;
            }
        }
        if (this.c < 0 && !this.i) {
            af.br.removeElement(this);
        }
        if (this.c < 0 && this.i && !this.j) {
            p.bv.removeElement(this);
        }
    }
}
