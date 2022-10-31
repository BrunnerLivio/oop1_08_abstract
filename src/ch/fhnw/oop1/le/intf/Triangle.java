package ch.fhnw.oop1.le.intf;

public class Triangle extends AbstractFigure {
    private int s;

    public Triangle(int x, int y, int s) {
        super(x, y);
        this.s = s;
    }   

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
}
