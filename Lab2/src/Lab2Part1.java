import javax.swing.*;
import java.awt.*;

public class Lab2Part1 extends JFrame {

    public Lab2Part1() {
        Container contentPane = getContentPane();

        JPanel holderPanel = new JPanel(new GridLayout(0, 2, 20, 20));

        JLabel labelName = new JLabel(" First Name:");

        JTextField textName = new JTextField(20);
        holderPanel.add(labelName);
        holderPanel.add(textName);

        JLabel labelSurname = new JLabel(" Surname:");
        JTextField textSurname = new JTextField(20);
        holderPanel.add(labelSurname);
        holderPanel.add(textSurname);

        JLabel labelCity = new JLabel(" City:");
        JTextField textCity = new JTextField(20);
        holderPanel.add(labelCity);
        holderPanel.add(textCity);

        JLabel labelAge = new JLabel(" Age:");
        JTextField textAge = new JTextField(20);
        holderPanel.add(labelAge);
        holderPanel.add(textAge);

        JLabel labelStNum = new JLabel(" Student Number:");
        JTextField textStNum = new JTextField(20);
        holderPanel.add(labelStNum);
        holderPanel.add(textStNum);

        JLabel passLabel = new JLabel(" Enter New Password:");
        JPasswordField passField = new JPasswordField(20);
        holderPanel.add(passLabel);
        holderPanel.add(passField);

        JLabel verifyLabel = new JLabel(" Verify New Password");
        JPasswordField verifyPassField = new JPasswordField(20);
        holderPanel.add(verifyLabel);
        holderPanel.add(verifyPassField);
        setTitle("Lab2Part1");
        setSize(new Dimension(600, 400));
        setVisible(true);

        contentPane.add(holderPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab2Part1();

    }
}
