package swingexample;

import javax.swing.*;

public class Frame extends UIControl {

    @Override
    public void draw() {
        System.out.println("Drawing a frame");
        JFrame frame = new JFrame();

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
