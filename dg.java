/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;
import main.a;

public abstract class dg
extends Canvas
implements Runnable {
    public static boolean ao;

    public static void a(GameMidlet gameMidlet) {
        Display.getDisplay((MIDlet)gameMidlet).setCurrent((Displayable)a.h);
    }

    public dg() {
        this.setFullScreenMode(true);
        int n2 = super.getHeight();
        int n3 = super.getWidth();
        if (n3 * n2 >= 2073600) {
            en.b = 4;
            return;
        }
        if (n3 * n2 >= 691200) {
            en.b = 3;
            return;
        }
        if (n3 * n2 > 153600) {
            en.b = 2;
            return;
        }
        en.b = 1;
    }

    public int getHeight() {
        System.out.println("DONT USE getHeight, PLEASE USE getHeightz()");
        return -1;
    }

    public int getWidth() {
        System.out.println("DONT USE getWidth, PLEASE USE getWidthz()");
        return -1;
    }

    public final int m() {
        int n2 = super.getWidth();
        return n2 / en.b + (n2 % en.b == 0 ? 0 : 1);
    }

    public final int n() {
        int n2 = super.getHeight();
        return n2 / en.b + (n2 % en.b == 0 ? 0 : 1);
    }

    protected final void pointerDragged(int n2, int n3) {
        this.a(n2 /= en.b, n3 /= en.b);
    }

    protected final void pointerPressed(int n2, int n3) {
        this.b(n2 /= en.b, n3 /= en.b);
    }

    protected final void pointerReleased(int n2, int n3) {
        this.c(n2 /= en.b, n3 /= en.b);
    }

    protected abstract void a(int var1, int var2);

    protected abstract void b(int var1, int var2);

    protected abstract void c(int var1, int var2);

    protected abstract void d();

    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (Exception exception) {}
        ao = true;
        while (ao) {
            long l = System.currentTimeMillis();
            this.d();
            this.repaint();
            this.serviceRepaints();
            long l2 = System.currentTimeMillis() - l;
            try {
                if (l2 < 27L) {
                    long l3;
                    long l4;
                    do {
                        l3 = System.currentTimeMillis();
                        Thread.sleep(27L - l2);
                    } while ((l4 = System.currentTimeMillis()) - l3 < 27L - l2);
                    continue;
                }
                Thread.sleep(1L);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }
}
