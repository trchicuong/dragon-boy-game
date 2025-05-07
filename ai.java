/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ai {
    public int a;
    public short[] b;
    public short c;
    public String[] d;
    public String[] e;
    public String[] f;
    public String[] g;
    public short h;

    public ai(short s, byte by, String string, String string2, String[] stringArray, short[] sArray, short s2, String[] stringArray2) {
        this.c = s;
        this.a = by;
        this.d = di.g.a(string, g.ab - 20);
        this.e = di.k.a(string2, g.ab - 20);
        this.f = stringArray;
        this.b = sArray;
        this.h = s2;
        this.g = stringArray2;
    }

    public ai() {
    }

    public static byte[] a(y y2) {
        try {
            int n = y2.c().readInt();
            if (n > 1) {
                byte[] byArray = new byte[n];
                y2.c().read(byArray);
                return byArray;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        return null;
    }

    public static byte[] a(DataInputStream dataInputStream) {
        try {
            int n = dataInputStream.readInt();
            byte[] byArray = new byte[n];
            dataInputStream.read(byArray);
            return byArray;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    public static String a(String string, String string2, String string3) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        while ((n = string.indexOf(string2)) != -1) {
            stringBuffer.append(String.valueOf(string.substring(0, n)) + string3);
            string = string.substring(n + string2.length());
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    public static String a(int n) {
        long l = (long)n * 1000L;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        calendar.setTime(new Date(l));
        int n2 = calendar.get(11);
        calendar.get(12);
        int n3 = calendar.get(5);
        int n4 = calendar.get(2) + 1;
        int n5 = calendar.get(1);
        return String.valueOf(n3) + "/" + n4 + "/" + n5 + " " + n2 + "h";
    }

    public static String b(int n) {
        int n2 = 0;
        if (n > 60) {
            n2 = n / 60;
            n %= 60;
        }
        int n3 = 0;
        if (n2 > 60) {
            n3 = n2 / 60;
            n2 %= 60;
        }
        int n4 = 0;
        if (n3 > 24) {
            n4 = n3 / 24;
            n3 %= 24;
        }
        String string = "";
        if (n4 > 0) {
            string = String.valueOf(string) + n4;
            string = String.valueOf(string) + "d";
            string = String.valueOf(string) + n3 + "h";
        } else if (n3 > 0) {
            string = String.valueOf(string) + n3;
            string = String.valueOf(string) + "h";
            string = String.valueOf(string) + n2 + "'";
        } else {
            string = n2 > 9 ? String.valueOf(string) + n2 : String.valueOf(string) + "0" + n2;
            string = String.valueOf(string) + ":";
            string = n > 9 ? String.valueOf(string) + n : String.valueOf(string) + "0" + n;
        }
        return string;
    }

    public static String a(long l) {
        String string = "";
        long l2 = l / 1000L + 1L;
        int n = 0;
        while ((long)n < l2) {
            if (l >= 1000L) {
                long l3 = l % 1000L;
                string = l3 == 0L ? ".000" + string : (l3 < 10L ? ".00" + l3 + string : (l3 < 100L ? ".0" + l3 + string : "." + l3 + string));
                l /= 1000L;
            } else {
                string = String.valueOf(l) + string;
                break;
            }
            ++n;
        }
        return string;
    }

    public static String c(int n) {
        int n2 = 0;
        if (n > 60) {
            n2 = n / 60;
        }
        n = 0;
        if (n2 > 60) {
            n = n2 / 60;
            n2 %= 60;
        }
        int n3 = 0;
        if (n > 24) {
            n3 = n / 24;
            n %= 24;
        }
        String string = "";
        if (n3 > 0) {
            string = String.valueOf(string) + n3;
            string = String.valueOf(string) + "d";
            string = String.valueOf(string) + n + "h";
        } else if (n > 0) {
            string = String.valueOf(string) + n;
            string = String.valueOf(string) + "h";
            string = String.valueOf(string) + n2 + "'";
        } else {
            if (n2 == 0) {
                n2 = 1;
            }
            string = String.valueOf(string) + n2;
            string = String.valueOf(string) + "ph";
        }
        return string;
    }
}
