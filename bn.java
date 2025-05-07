/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class bn {
    private static byte[] a = new byte[]{-22, 2, 12, 4, 5, 2, -10};
    private int b = 0;

    public static Image a(String string) {
        Image image = null;
        string = "/x" + en.b + string;
        try {
            Object object = new DataInputStream("".getClass().getResourceAsStream(string));
            int n = ((FilterInputStream)object).available();
            byte[] byArray = new byte[n];
            ((DataInputStream)object).read(byArray, 0, n);
            object = new bn();
            new bn().b = 0;
            int n2 = 0;
            while (n2 < byArray.length) {
                byte by = byArray[n2];
                Object object2 = object;
                by = (byte)(a[((bn)object2).b++] & 0xFF ^ by & 0xFF);
                if (((bn)object2).b >= a.length) {
                    ((bn)object2).b %= a.length;
                }
                byArray[n2] = by;
                ++n2;
            }
            image = Image.createImage((byte[])byArray, (int)0, (int)n);
        }
        catch (IOException iOException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (NullPointerException nullPointerException) {}
        if (image == null) {
            try {
                image = Image.createImage((String)string);
            }
            catch (IOException iOException) {
                return null;
            }
        }
        return image;
    }
}
