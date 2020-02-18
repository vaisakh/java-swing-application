package swingexample;


public class Main {

    public static void main(String args[]) {
        drawUIControl(new Frame());
        drawUIControl(new TextBox());
        drawUIControl(new Button());
    }

    public static void drawUIControl(UIControl  control) {
        control.draw();
    }
}
