package ch.fhnw.oop1.le.intf;

public class Main {
    public static void main(String[] args) {
		Rectangle x = new Rectangle(0, 0, 4, 5);

		Figure f = x;
		f.move(2, 3);
		f.draw();

		//////////////////////////////////

        Rectangle r = null;
		r = new Rectangle(0, 0, 4, 5);
		if (r instanceof Figure) { System.out.println("Figure"); }
		if (r instanceof AbstractFigure) { System.out.println("AbstractFigure"); }
		if (r instanceof Rectangle) { System.out.println("Rectangle"); }
		if (r instanceof TextBox) { System.out.println("TextBox"); }
		if (r instanceof Drawable) { System.out.println("Drawable"); }
		// if (r instanceof Triangle) { System.out.println("Triangle"); }
		
    }
}
