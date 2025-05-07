/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class br
implements db {
    private static br o = new br();
    private static br p = new br();
    private DataOutputStream q;
    public DataInputStream a;
    public bd b;
    public boolean c = true;
    private ay r;
    public boolean d;
    public boolean e;
    private final dw s = new dw(this);
    private Thread t;
    public Thread f;
    public Thread g;
    public int h;
    public int i;
    boolean j;
    public byte[] k = null;
    private byte u;
    private byte v;
    long l;
    public String m = "";
    private long w = 0L;
    public static boolean n;
    private static int x;

    public static br a() {
        return o;
    }

    public static br b() {
        return p;
    }

    public final void c() {
        dw.a(this.s).removeAllElements();
    }

    public final boolean d() {
        return this.d && this.r != null && this.r.a != null && this.a != null;
    }

    public final void a(bd bd2) {
        this.b = bd2;
    }

    public final void a(String string, int n) {
        System.out.println(">>connect: " + string + ":" + n);
        if (this.d || this.e) {
            return;
        }
        if (l.d() < this.w) {
            return;
        }
        this.w = l.d() + 50L;
        if (this.c) {
            bs.t = -1;
        }
        this.j = false;
        br br2 = this;
        br2.f();
        this.t = new Thread(new cf(this, string, n));
        this.t.start();
    }

    public final void a(y y2) {
        ++x;
        this.s.a(y2);
    }

    private synchronized void b(y object) {
        System.out.println("DO SEND MSG: " + ((y)object).a);
        byte[] byArray = ((y)object).a();
        try {
            if (this.j) {
                byte by = this.a(((y)object).a);
                this.q.writeByte(by);
            } else {
                this.q.writeByte(((y)object).a);
            }
            if (byArray != null) {
                int n;
                int n2 = byArray.length;
                if (this.j) {
                    n = this.a((byte)(n2 >> 8));
                    this.q.writeByte(n);
                    n2 = this.a((byte)n2);
                    this.q.writeByte(n2);
                } else {
                    this.q.writeShort(n2);
                }
                if (this.j) {
                    n = 0;
                    while (n < byArray.length) {
                        byArray[n] = this.a(byArray[n]);
                        ++n;
                    }
                }
                ((OutputStream)this.q).write(byArray);
                this.h += 5 + byArray.length;
            } else {
                this.q.writeShort(0);
                this.h += 5;
            }
            this.q.flush();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private byte a(byte by) {
        byte by2 = this.v;
        this.v = (byte)(by2 + 1);
        by = (byte)(this.k[by2] & 0xFF ^ by & 0xFF);
        if (this.v >= this.k.length) {
            this.v = (byte)(this.v % this.k.length);
        }
        return by;
    }

    public final void e() {
        this.f();
    }

    private void f() {
        this.k = null;
        this.u = 0;
        this.v = 0;
        try {
            this.d = false;
            this.e = false;
            if (this.r != null && this.r.a != null) {
                this.r.a();
            }
            this.r = null;
            if (this.q != null) {
                this.q.close();
            }
            this.q = null;
            if (this.a != null) {
                this.a.close();
            }
            this.a = null;
            if (this.g != null) {
                this.g.interrupt();
            }
            this.g = null;
            if (this.f != null) {
                this.f.interrupt();
            }
            this.f = null;
            if (this.c) {
                bs.t = 0;
            }
            System.gc();
            ac.c = false;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    static ay a(br br2) {
        return br2.r;
    }

    static void a(br br2, ay ay2) {
        br2.r = ay2;
    }

    static void a(br br2, DataOutputStream dataOutputStream) {
        br2.q = dataOutputStream;
    }

    static dw b(br br2) {
        return br2.s;
    }

    static void a(br br2, y y2) {
        br2.b(y2);
    }

    static void c(br br2) {
        br2.f();
    }

    static byte a(br br2, byte by) {
        byte by2 = br2.u;
        br2.u = (byte)(by2 + 1);
        by = (byte)(br2.k[by2] & 0xFF ^ by & 0xFF);
        if (br2.u >= br2.k.length) {
            br2.u = (byte)(br2.u % br2.k.length);
        }
        return by;
    }
}
