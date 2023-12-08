import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Question2 extends JFrame {

    JMenuItem messageDialogItem = new JMenuItem("Message Dialog");
    JMenuItem inputDialog = new JMenuItem("Input Dialog");

    public Question2() {
        Container contentPane = getContentPane();
        JPanel parentPanel = new JPanel();


        // Menu bar and menus
        JMenuBar menuBar = new JMenuBar();
        JMenu dialogMenu = new JMenu("Dialog Menu");

        dialogMenu.add(messageDialogItem);
        dialogMenu.add(inputDialog);


        // Setting the hot keys
        dialogMenu.setMnemonic(KeyEvent.VK_D);
        messageDialogItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.ALT_MASK));
        inputDialog.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.ALT_MASK));

        menuBar.add(dialogMenu);


        messageDialogItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Question2.this,
                        "This is a Message Dialog Menu For a Question 2", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        inputDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = JOptionPane.showInputDialog(Question2.this,
                        "Enter your name and student number:", "Input", JOptionPane.QUESTION_MESSAGE);

                // Display the user input
                if (userInput != null) {
                    JOptionPane.showMessageDialog(Question2.this,
                            "You entered: " + userInput, "Input Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        setJMenuBar(menuBar);
        setTitle("Italian Take Away");
        setSize(new Dimension(800, 600));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Question2();

    }
}
