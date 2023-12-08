import javax.swing.*;
import java.awt.*;

public class Lab1Part1 extends JFrame {

    public Lab1Part1() {
        setTitle("Denys Rudenko");
        setSize(600, 300);
        setLocation(500, 500);
        setResizable(false);
        Container contentPlane = getContentPane();
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab1Part1();
    }
}
