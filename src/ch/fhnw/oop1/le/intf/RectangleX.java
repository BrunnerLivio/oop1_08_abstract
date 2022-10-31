package ch.fhnw.oop1.le.intf;

public class RectangleX implements Figure {
    private int x, y, w, h;

    public RectangleX(int x, int y, int w, int h) {   
        this.x = x; this.y = y; this.w = w; this.h = h;   }

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }
}
