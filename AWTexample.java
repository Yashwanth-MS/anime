import java.awt.*;
import javax.swing.*;

public class AWTexample {
    public static void main(String[] args) {
        JFrame f = new JFrame("AWT Example");

        Label l = new Label("Enter Name:");
        l.setBounds(50, 50, 80, 30);

        TextField tf = new TextField();
        tf.setBounds(150, 50, 150, 30);

        Button b = new Button("Submit");
        b.setBounds(100, 100, 80, 30);

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

