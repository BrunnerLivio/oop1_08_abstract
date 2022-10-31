package ch.fhnw.oop1.le.abs;

public class Main {
    public static void main(String[] args) {
        //Figure fx = new Figure(); // Compile Error
        Figure f = new Rectangle(10, 10, 20, 10);
        f.draw();
        f = new Square(5, 6, 10);
        f.draw();

        Figure[ ] figures = new Figure[2];
        figures[0] = new Square(0, 0, 10);
        figures[1] = new Rectangle(10, 10, 20, 10);
        
        // Framework Code
        for(Figure figure : figures) {
            figure.draw();
        }
    }
}
