package ch.fhnw.oop1.le;

public class Motivation {
    public static void main(String[] args) {
        // Figure f = new Figure();
        Figure f = new Rectangle();
        f.draw();
        f = new TextBox();
        f.draw();
    }
}

class Figure {
    int x, y;
    void draw(){
        System.out.println("?");
    }
}

class Rectangle extends Figure {
    int w, h;
    @Override 
    void draw() {
        System.out.println("Rectangle.draw()");
    }
 }

 class TextBox extends Rectangle {
    String text;
    @Override 
    void draw() {
        System.out.println("TextBox.draw(text)");
        super.draw();
    }
 }
 
 
 
