/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class en {
    public Graphics a;
    public static int b = 1;

    public final void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.a.fillArc(n *= b, n2 *= b, n3 *= b, n4 *= b, 0, 360);
    }

    public final void a(Image image, int n, int n2, int n3) {
        if (image == null) {
            return;
        }
        this.a.drawImage(image, n *= b, n2 *= b, n3);
    }

    public final void a(Image object, float f, float f2, int n) {
        int n2 = n;
        float f3 = f2;
        f2 = f;
        Image image = object;
        object = this;
        if (image != null) {
            object.a.drawImage(image, (int)(f2 *= (float)b), (int)(f3 *= (float)b), n2);
        }
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.a.drawLine(n *= b, n2 *= b, n3 *= b, n4 *= b);
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.a.setColor(n5);
        this.a.fillRect(n *= b, n2 *= b, n3 *= b, n4 *= b);
    }

    public final void b(int n, int n2, int n3, int n4) {
        this.d(n, n2, n3, n4);
    }

    public final void c(int n, int n2, int n3, int n4) {
        this.d(n, n2, 1, n4);
        this.d(n + n3, n2, 1, n4);
        this.d(n, n2, n3, 1);
        this.d(n, n2 + n4, n3 + 1, 1);
    }

    public final void a(Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (image == null) {
            return;
        }
        this.a.drawRegion(image, n *= b, n2 *= b, n3 *= b, n4 *= b, n5, n6 *= b, n7 *= b, n8);
    }

    public final void b(Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (image == null) {
            return;
        }
        this.a(image, 0, n2, n3, n4, n5, n6, n7, n8);
    }

    public final void a(Image image, int n, int n2, int n3, int n4) {
        n = 0;
        while (n < n3 / en.a(image) + 1) {
            n2 = 0;
            while (n2 < n4 / en.b(image) + 1) {
                this.a.drawImage(image, 0 + n * en.a(image), 0 + n2 * en.b(image), 0);
                ++n2;
            }
            ++n;
        }
    }

    public static int a(float f, int n, int n2) {
        ds.c("blend color");
        f = n2 >> 16 & 0xFF;
        float f2 = n2 >> 8 & 0xFF;
        float f3 = n2 & 0xFF;
        f *= 0.4f;
        f2 *= 0.4f;
        f3 *= 0.4f;
        if (f > 255.0f) {
            f = 255.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 > 255.0f) {
            f2 = 255.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        int n3 = 0xFF000000 | (int)f << 16 | (int)f2 << 8 | (int)f3 & 0xFF;
        return n3;
    }

    public final void d(int n, int n2, int n3, int n4) {
        this.a.fillRect(n *= b, n2 *= b, n3 *= b, n4 *= b);
    }

    public final int a() {
        return this.a.getTranslateX() / b;
    }

    public final int b() {
        return this.a.getTranslateY() / b;
    }

    public final void e(int n, int n2, int n3, int n4) {
        this.a.setClip(n *= b, n2 *= b, n3 *= b, n4 *= b);
    }

    public final int c() {
        return this.a.getClipX();
    }

    public final int d() {
        return this.a.getClipY();
    }

    public final int e() {
        return this.a.getClipWidth();
    }

    public final int f() {
        return this.a.getClipHeight();
    }

    public final void a(int n) {
        this.a.setColor(n);
    }

    public final void a(int n, int n2) {
        this.a.translate(n *= b, n2 *= b);
    }

    public static int a(Image image) {
        return image.getWidth() / b;
    }

    public static int b(Image image) {
        return image.getHeight() / b;
    }

    public static int c(Image image) {
        return image.getWidth();
    }

    public static int d(Image image) {
        return image.getHeight();
    }
}
