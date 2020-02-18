package swingexample;


import javax.swing.*;

public class TextBox extends UIControl {

    @Override
    public void draw() {
        System.out.println("Drawing a textbox");
        JButton button = new JButton("Click");
    }
}
