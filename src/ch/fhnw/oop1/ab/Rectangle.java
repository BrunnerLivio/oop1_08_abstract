package ch.fhnw.oop1.ab;

class Rectangle extends Figure {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getArea() {
    return width * height;
  }

  public double getCircumference() {
    return width * 2 + height * 2;
  }
}
