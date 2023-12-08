import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part1b extends JFrame implements ActionListener {

    JButton myButton = new JButton("My Text Changes When You Push Me");
    public Lab3Part1b() {
        Container contentPane = getContentPane();

        JPanel parentPanel = new JPanel();

        myButton.addActionListener(this);
        parentPanel.add(myButton);

        setTitle("Lab3Part1b");
        setSize(new Dimension(650, 400));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab3Part1b();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "";
        if (e.getSource()==myButton){
            message = "See, I Told You The Text Would Change?";
        }
        myButton.setText(message);
    }
}