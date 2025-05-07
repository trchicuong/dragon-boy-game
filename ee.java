/*
 * Decompiled with CFR 0.152.
 */
public final class ee {
    public int a;
    public byte b;
    public dn c;

    public ee() {
    }

    public ee(int n, int n2) {
        if (n == 22) {
            n = 6;
            n2 *= 1000;
        }
        if (n == 23) {
            n = 7;
            n2 *= 1000;
        }
        this.a = n2;
        this.c = p.j().K[n];
    }

    public final String a() {
        return ai.a(this.c.b, "#", String.valueOf(this.a));
    }
}
