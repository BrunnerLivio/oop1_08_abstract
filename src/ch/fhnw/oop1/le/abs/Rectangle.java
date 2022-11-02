package ch.fhnw.oop1.le.abs;

public class Rectangle extends Figure {
  private int w, h;

  public Rectangle(int x, int y, int w, int h) {
    super(x, y);
    this.w = w;
    this.h = h;
  }

  @Override
  public void draw() {
    System.out.println("Rectangle.draw()");
  }
}
