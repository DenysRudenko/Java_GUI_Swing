import javax.swing.*;
import java.awt.*;

public class Lab1Part2 extends JFrame {

    public Lab1Part2() {
        setTitle("Denys Rudenko");
        setSize(400, 500);
        Container contentPlane = getContentPane();
        JPanel labelHolderPanel = new JPanel();
        JLabel labelNoImage = new JLabel("Label with no image");
        JLabel imageLabel = new JLabel("Label with image");

        Icon catIcon = new ImageIcon("src/cat.png");
        imageLabel.setIcon(catIcon);

        JLabel myImageChoiceLabel = new JLabel("small tiny dog");
        Icon dogIcon = new ImageIcon("src/dog.png");
        myImageChoiceLabel.setIcon(dogIcon);
        labelHolderPanel.add(labelNoImage);
        labelHolderPanel.add(imageLabel);
        labelHolderPanel.add(myImageChoiceLabel);
        contentPlane.add(labelHolderPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab1Part2();
    }
}
