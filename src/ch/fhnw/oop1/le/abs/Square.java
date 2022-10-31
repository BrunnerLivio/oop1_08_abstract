package ch.fhnw.oop1.le.abs;

public class Square extends Figure {
    private int size;

    public Square(int x, int y, int w) {
        super(x, y);
        size = w;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}
