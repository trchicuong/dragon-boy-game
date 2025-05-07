/*
 * Decompiled with CFR 0.152.
 */
public final class ak {
    public int a;
    public String b;
    public short[] c;
    public int d;
    public int e;
    public static el f = new el("vClanImage");
    public static t g = new t("h id images");

    public static void a(ak ak2) {
        bt.a().b((byte)ak2.a);
        f.addElement(ak2);
    }

    public static ak a(short s) {
        int n = 0;
        while (n < f.size()) {
            ak ak2 = (ak)f.elementAt(n);
            if (ak2.a == s) {
                return ak2;
            }
            ++n;
        }
        return null;
    }

    public static boolean a(int n) {
        int n2 = 0;
        while (n2 < f.size()) {
            ak ak2 = (ak)f.elementAt(n2);
            if (ak2.a == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }
}
