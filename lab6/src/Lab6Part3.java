import javax.swing.*;
import java.awt.*;

public class Lab6Part3 extends JFrame {
     JPanel mainPanel;
    public Lab6Part3() {
        setTitle("Space Adventure Game");
        setSize(1400, 800);


        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        mainPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load your background image
                ImageIcon backgroundImage = new ImageIcon("src/background.jpg");
                Image img = backgroundImage.getImage();

                // Draw the background image
                g.drawImage(img, 0, 0, this);
            }
        };

        JLabel mainLabel = new JLabel("Heroes of Might & Magic VII");
        Font labelFont = new Font("Arial", Font.BOLD | Font.ITALIC, 25);

        mainLabel.setForeground(Color.DARK_GRAY);
        mainLabel.setFont(labelFont);
        mainPanel.add(mainLabel);

        add(mainPanel);
        setVisible(true);
        startGame();
    }

    public void startGame() {
        JOptionPane.showMessageDialog(this, "Welcome to the Might&Magic Game!\nChoose a fraction to begin.");

        String[] portalOptions = {"Haven", "Academy", "Necropolis"};
        int fractionChoice = JOptionPane.showOptionDialog(this,
                "Choose a Fraction:", "Fraction Selection",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, portalOptions, portalOptions[0]);

        if (fractionChoice == 0) {
            havenFraction();
        } else if (fractionChoice == 1) {
            academyFraction();
        } else if (fractionChoice == 2) {
            necropolisFraction();
        }

        JOptionPane.showMessageDialog(this, "Game Over! Thanks for playing.");
    }
    public void havenFraction() {
        ImageIcon customImage = new ImageIcon("src/havenIco.png");

        JOptionPane.showMessageDialog(this, "You choose Haven."
                +"\nNow you will fight for paradise in the name of freedom", "Haven",JOptionPane.INFORMATION_MESSAGE, customImage);

        int response = JOptionPane.showOptionDialog(this, "Choose a hero who will save your empire.",
                "Alien Encounter", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                new String[]{"Male", "Female"}, "Male");

        if (response == 0) {

            ImageIcon maleImage = new ImageIcon("src/maleHaven.png");
            JOptionPane.showMessageDialog(this, "You choose Male! Time to defend your Empire from enemies!", "Result",
                    JOptionPane.INFORMATION_MESSAGE, maleImage);
        } else if(response == 1) {
            ImageIcon femaleImage = new ImageIcon("src/femaleHaven.png");
            JOptionPane.showMessageDialog(this, "You choose Female! Time to defend your Empire from enemies!", "Result",
                    JOptionPane.INFORMATION_MESSAGE, femaleImage);
        }
    }

    public void academyFraction() {
        ImageIcon customImage = new ImageIcon("src/academyIco.png");

        JOptionPane.showMessageDialog(this, "You choose Academy."
                +" Thanks to magic, bring stability and prosperity to the people!",
                "Academy",JOptionPane.INFORMATION_MESSAGE, customImage);

        int response = JOptionPane.showOptionDialog(this, "Choose a hero who will save your empire.",
                "Alien Encounter", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                new String[]{"Male", "Female"}, "Male");

        if (response == 0) {
            ImageIcon maleImage = new ImageIcon("src/maleAca.png");
            JOptionPane.showMessageDialog(this, "You choose Male! Time to defend your Empire from enemies!", "Result",
                    JOptionPane.INFORMATION_MESSAGE, maleImage);
        } else if(response == 1){
            ImageIcon femaleImage = new ImageIcon("src/femaleAca.png");
            JOptionPane.showMessageDialog(this, "You choose Female! Time to defend your Empire from enemies!", "Result",
                    JOptionPane.INFORMATION_MESSAGE, femaleImage);
        }
    }

    public void necropolisFraction() {
        ImageIcon customImage = new ImageIcon("src/necroIco.png");

        JOptionPane.showMessageDialog(this, "You choose Necropolis."
                +" Thanks to necromancy, protect your state from enemies and give death to attackers!",
                "Necropolis",JOptionPane.INFORMATION_MESSAGE, customImage);

        int response = JOptionPane.showOptionDialog(this, "Choose a hero who will save your empire.",
                "Alien Encounter", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                new String[]{"Male", "Female"}, "Male");

        if (response == 0) {
            ImageIcon maleImage = new ImageIcon("src/maleNecro.png");
            JOptionPane.showMessageDialog(this, "You choose Male! Time to defend your Empire from enemies!", "Result",
                    JOptionPane.INFORMATION_MESSAGE, maleImage);
        } else if(response == 1){
            ImageIcon femaleImage = new ImageIcon("src/femaleNecro.png");
            JOptionPane.showMessageDialog(this, "You choose Female! Time to defend your Empire from enemies!", "Result",
                    JOptionPane.INFORMATION_MESSAGE, femaleImage);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new Lab6Part3();
    }
}