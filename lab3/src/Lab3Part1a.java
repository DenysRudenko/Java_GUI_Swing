import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part1a extends JFrame implements ActionListener {
    JLabel myName = new JLabel("My name is Denys Rudenko");
    JButton nameButton = new JButton("Translate to Ukrainian");
    public Lab3Part1a() {
        Container contentPane = getContentPane();

        JPanel parentPanel = new JPanel();

        nameButton.addActionListener(this);

        parentPanel.add(myName);
        parentPanel.add(nameButton);
        setTitle("Lab3Part1a");
        setSize(new Dimension(650, 400));
        setVisible(true);
        setResizable(false);

        contentPane.add(parentPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "";

        if(e.getSource()==nameButton){
            message = "Моє ім'я Денис Руденко";
        }
        myName.setText(message);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab3Part1a();

    }
}