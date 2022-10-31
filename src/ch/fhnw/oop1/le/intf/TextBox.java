package ch.fhnw.oop1.le.intf;

public class TextBox extends Rectangle {

    private String text;

    public TextBox(int x, int y, int w, int h, String text) {
        super(x, y, w, h);
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println("TextBox.draw()");
    }
}
