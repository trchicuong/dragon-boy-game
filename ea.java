/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

public final class ea {
    public int a;
    public int b;
    public int c;
    public int d;
    private boolean o;
    private af p;
    public int e;
    private int q;
    public int f;
    public int g;
    private int r;
    private int s;
    private int t;
    private boolean u = true;
    public int h;
    public int i = 0;
    public static el j = new el("vEffData");
    public int k = 0;
    public long l = 0L;
    private static el v = new el("vLastEff");
    public static el m = new el("vNewEff");
    public static el n = new el("vdowloadEff");
    private int[] w;
    private int[] x;
    private int[] y;
    private int[] z;
    private int[] A;
    private boolean B;
    private short[] C;

    private static void b(int n) {
        int n2 = 0;
        while (n2 < j.size()) {
            ck ck2 = (ck)j.elementAt(n2);
            if (ck2.d == n) {
                j.removeElement(ck2);
                return;
            }
            ++n2;
        }
    }

    public static ck a(int n) {
        int n2 = 0;
        while (n2 < j.size()) {
            ck ck2 = (ck)j.elementAt(n2);
            if (ck2.d == n) {
                return ck2;
            }
            ++n2;
        }
        return null;
    }

    public ea() {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
    }

    public ea(int n, af object, int n2, int n3, int n4, byte by) {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
        this.p = object;
        this.a = n;
        this.h = n2;
        this.r = n3;
        this.s = n4;
        this.i = by;
        if (ea.a(n) == null) {
            object = new ck();
            new ck().d = n;
            if (n >= 42 && n <= 46) {
                n = 106;
            }
            String string = "/x" + en.b + "/effectdata/" + n + "/data";
            InputStream inputStream = null;
            try {
                inputStream = ad.a(string);
            }
            catch (Exception exception) {}
            if (inputStream != null) {
                if (n > 100 && n < 200) {
                    ((ck)object).b(string);
                } else {
                    ((ck)object).a(string);
                }
                ((ck)object).a = l.b("/effectdata/" + n + "/img.png");
            } else {
                bt.a().a((short)n);
            }
            j.addElement(object);
        }
        this.c = -1;
        this.d = -1;
        this.k = -1;
        this.b = 4;
        if (n == 78) {
            this.b = 5;
        }
    }

    public ea(int n, int n2, int n3, int n4, int n5, int n6) {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
        this.f = n2;
        this.g = n3;
        this.a = n;
        this.h = n4;
        this.r = n5;
        this.s = n6;
        if (ea.a(n) == null) {
            ck ck2 = new ck();
            new ck().d = n;
            if (n >= 42 && n <= 46) {
                n = 106;
            }
            String string = "/x" + en.b + "/effectdata/" + n + "/data";
            InputStream inputStream = null;
            try {
                inputStream = ad.a(string);
            }
            catch (Exception exception) {}
            if (inputStream != null) {
                if (n > 100 && n < 200) {
                    ck2.b(string);
                } else {
                    ck2.a(string);
                }
                ck2.a = l.b("/effectdata/" + n + "/img.png");
            } else {
                bt.a().a((short)n);
            }
            j.addElement(ck2);
            if (v.size() > 20) {
                ea.b(Integer.parseInt((String)v.elementAt(0)));
                v.removeElementAt(0);
            }
            v.addElement(String.valueOf(this.a));
        }
        this.c = -1;
        this.d = -1;
        this.b = n == 78 ? 5 : 1;
        if (!ea.a(String.valueOf(this.a))) {
            m.addElement(String.valueOf(this.a));
        }
    }

    private static boolean a(String string) {
        int n = 0;
        while (n < m.size()) {
            String string2 = (String)m.elementAt(n);
            if (string2.equals(string)) {
                return true;
            }
            ++n;
        }
        return false;
    }

    private boolean b() {
        return this.u;
    }

    public final void a(en en2, int n, int n2) {
        if (!this.b()) {
            return;
        }
        if (ea.a((int)this.a).a != null) {
            ea.a(this.a).a(en2, this.q, this.f + n, this.g + n2, this.k, this.h);
        }
    }

    public final void a(en en2) {
        if (!this.b()) {
            return;
        }
        if (ea.a(this.a) == null) {
            return;
        }
        if (ea.a((int)this.a).a != null) {
            try {
                ea.a(this.a).a(en2, this.q, this.f, this.g, this.k, this.h);
                return;
            }
            catch (Exception exception) {
                ds.c("Effect " + this.a + " err at frame " + this.q + " vitri " + this.f + "_" + this.g + "   " + this.h);
                exception.printStackTrace();
            }
        }
    }

    public final void a() {
        block45: {
            try {
                ck ck2;
                if (this.a >= 42 && this.a <= 46) {
                    ea ea2 = this;
                    if (ea2.a == 42) {
                        ea2.q = ea2.w[ea2.e];
                    }
                    if (ea2.a == 43) {
                        ea2.q = ea2.x[ea2.e];
                    }
                    if (ea2.a == 44) {
                        ea2.q = ea2.y[ea2.e];
                    }
                    if (ea2.a == 45) {
                        ea2.q = ea2.z[ea2.e];
                    }
                    if (ea2.a == 46) {
                        ea2.q = ea2.A[ea2.e];
                    }
                    ++ea2.e;
                    if (ea2.e > ea2.w.length - 1) {
                        ea2.e = 0;
                    }
                    return;
                }
                if (ea.a(this.a) == null) {
                    return;
                }
                if (ea.a((int)this.a).a == null) {
                    return;
                }
                if (this.b == 5) {
                    int n = this.p.H;
                    ck2 = ea.a(this.a);
                    if (n >= ck2.c.length) {
                        n = 0;
                    }
                    this.C = ck2.c[n] == null ? new short[1] : ck2.c[n];
                } else {
                    ck2 = ea.a(this.a);
                    this.C = ck2.b;
                }
                if (this.C != null) {
                    if (!this.B) {
                        this.B = true;
                        int n = this.C.length - 1;
                        if (n > 0 && this.b != 1) {
                            this.e = ds.b(0, n);
                        }
                        if (this.b == 0) {
                            this.e = ds.b(this.c, this.d);
                        }
                    }
                    switch (this.b) {
                        case 4: {
                            this.f = this.p.B;
                            this.g = this.p.C;
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 5: {
                            this.k = this.p.I == 1 ? 0 : 1;
                            this.f = this.p.I == 1 ? this.p.B - 15 : this.p.B + 15;
                            this.g = this.p.cC == 0 ? this.p.C - 25 : this.p.C - 35;
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 1: 
                        case 3: {
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 0: {
                            if (ds.a(this.f - 50, this.g - 50, 100, 100, af.e().B, af.e().C) && this.e > this.c && this.e < this.d) {
                                if (this.e < this.d) {
                                    this.e = this.d;
                                }
                                this.o = true;
                            }
                            if (!this.o) {
                                ++this.e;
                                if (this.e != this.d) break;
                                this.e = this.c;
                                break;
                            }
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 2: {
                            if (this.e < this.C.length) {
                                ++this.e;
                            }
                            ++this.t;
                            if (this.t != this.s) break;
                            this.t = 0;
                            this.k = ds.b(0, 2);
                        }
                    }
                    if (this.e <= this.C.length - 1) {
                        this.q = this.C[this.e];
                    }
                }
                if (this.e >= this.C.length - 1) {
                    if (this.b == 0 || this.b == 3) {
                        this.u = false;
                    }
                    if (this.s == -1) {
                        ei.a.removeElement(this);
                    }
                    if (this.b == 2) {
                        this.e = 0;
                        return;
                    }
                    if (this.b == 1 && this.r == 1) {
                        this.u = false;
                    }
                    if (this.b == 4 || this.b == 5) {
                        if (this.r == -1) {
                            this.e = 0;
                            return;
                        }
                        ++this.t;
                        if (this.t == this.s) {
                            this.t = 0;
                            --this.r;
                            this.e = 0;
                            if (this.r == 0) {
                                this.p.b(0, this.a);
                            }
                        }
                        return;
                    }
                    this.o = false;
                    if (this.r == -1) {
                        ++this.t;
                        this.e = 0;
                        if (this.t == this.s) {
                            this.t = 0;
                            if (this.s > 1) {
                                this.k = ds.b(0, 2);
                                return;
                            }
                        }
                    } else {
                        ++this.t;
                        this.e = 0;
                        if (this.t == this.s) {
                            this.t = 0;
                            --this.r;
                            if (this.r == 0) {
                                ei.a.removeElement(this);
                                return;
                            }
                        }
                    }
                    break block45;
                }
                this.u = true;
                return;
            }
            catch (Exception exception) {
                System.out.println("err  Effect.update: " + this.a + "  " + this.b);
                exception.printStackTrace();
                ei.a.removeElement(this);
            }
        }
    }
}
