/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bw
implements b {
    public short a;
    public short b;
    public short c;
    public short d;
    public boolean e;
    public boolean f;
    public bo g;

    public bw(short s, short s2, short s3, short s4, boolean bl, boolean bl2, String string) {
        this.a = s;
        this.b = s2;
        this.c = s3;
        this.d = s4;
        string = ds.a(string);
        this.e = bl;
        this.f = bl2;
        if ((bv.l == 21 || bv.l == 22 || bv.l == 23) && this.a >= 0 && this.a <= 24) {
            return;
        }
        if ((bv.l == 0 && af.e().K != 0 || bv.l == 7 && af.e().K != 1 || bv.l == 14 && af.e().K != 2) && bl2) {
            return;
        }
        if (bv.f() || bv.l == 47) {
            if (s2 > 150 && bv.f()) {
                return;
            }
            this.g = new bo(string, s + (s3 - s) / 2, s4 - (s > 100 ? 24 : 48));
            this.g.i = new de(null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
            bv.t.addElement(this);
            return;
        }
        if (!bl && !bl2) {
            this.g = new bo(string, s, s2 - 24);
            this.g.i = new de(null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
        } else {
            if (bv.b()) {
                this.g = new bo(string, s, s2 - 16);
            } else {
                s = (short)(s + (s3 - s) / 2);
                this.g = new bo(string, s, s2 - (s2 != 0 ? 16 : -32));
            }
            this.g.i = new de(null, this, 2, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
        }
        bv.t.addElement(this);
    }

    public final void a(int n, Object object) {
        switch (n) {
            case 1: {
                n = (this.a + this.c) / 2;
                int n2 = this.d;
                if (this.d > this.b + 24) {
                    n2 = (this.b + this.d) / 2;
                }
                p.j().aX = 0;
                af.e().bP = new dm(n, n2);
                af.e().I = af.e().B - af.e().bP.a > 0 ? -1 : 1;
                bt.a().g();
                return;
            }
            case 2: {
                p.j().aX = 0;
                if (af.e().i() != null) {
                    bt.a().g();
                    bp.a();
                    bt.a().q();
                    af.bG = true;
                    return;
                }
                if (af.e().j() != null) {
                    bt.a().g();
                    bt.a().f();
                    af.bH = true;
                    af.bG = true;
                    main.a.g();
                    main.a.f();
                    bp.a();
                    return;
                }
                n = (this.a + this.c) / 2;
                short s = this.d;
                af.e().bP = new dm(n, s);
                af.e().I = af.e().B - af.e().bP.a > 0 ? -1 : 1;
                af.e().ay = new de(null, this, 2, null);
            }
        }
    }
}
