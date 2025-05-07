/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class df {
    public int a;
    public int b;
    public int c;
    public Image d;

    public df(int n) {
        Image image = ch.a(n);
        if (image != null) {
            this.d = image;
            this.a = ch.c[n][0];
            this.b = ch.c[n][1] / ch.c[n][2];
            this.c = ch.c[n][2];
        }
    }

    public df(Image image, int n, int n2) {
        if (image != null) {
            this.d = image;
            this.a = n;
            this.b = n2;
            this.c = image.getHeight() / n2;
            if (this.c <= 0) {
                this.c = 1;
            }
        }
    }

    public final void a(int n, int n2, int n3, int n4, int n5, en en2) {
        try {
            if (this.d != null) {
                if (n > this.c) {
                    n = this.c;
                }
                en2.a(this.d, 0, n * this.b, this.a, this.b, n4, n2, n3, n5);
                return;
            }
        }
        catch (Exception exception) {}
    }
}
