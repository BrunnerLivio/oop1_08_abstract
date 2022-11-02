package ch.fhnw.oop1.ab;

import java.util.Scanner;

/**
 * Programm zur Berechnung von geometrischen Grössen von Figuren.
 */
public class Geometry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Was möchten Sie erstellen? (Rechteck, Kreis, Nichts)");
            String str = s.nextLine();
            Figure f = null;
            switch (str) {
                case "Rechteck":
                    f = createRectangle(s);
                    break;
                case "Kreis":
                    f = createCircle(s);
                    break;
                case "Nichts":
                    System.out.println("Bye bye");
                    running = false;
                    break;
                default:
                    System.out.println("Nicht verstanden... ");
                    f = null;
                }

            if (f != null) {
                System.out.println("Fläche: " + f.getArea());
                System.out.println("Umfang: " + f.getCircumference());
            }
        }
    }

    //Erzeugt ein Kreis.
    private static Figure createCircle(Scanner s) {
        System.out.println("Radius?:");
        double r = nextDouble(s);
        return new Circle(r);
    }

    // Erzeugt ein Rechteck.
    private static Figure createRectangle(Scanner s) {
        System.out.println("Breite?:");
        double w = nextDouble(s);
        System.out.println("Höhe?:");
        double h = nextDouble(s);
        return new Rectangle(w, h);
    }
    
    // Returns the next double and consumes the remaining newline.
    private static double nextDouble(Scanner s) {
        double result = s.nextDouble();
        s.nextLine();
        return result;
    }
}

