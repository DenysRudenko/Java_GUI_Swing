import javax.swing.*;
import java.awt.*;

public class Lab1Part4 extends JFrame {

    public Lab1Part4() {
        setTitle("About my Pet");
        setSize(1200, 800);
        Container contentPane = getContentPane();

        JPanel holderPanel = new JPanel();

        JTextField textField = new JTextField();
        JTextArea textArea = new JTextArea();

        textField.setText("Cat Patrick");
        textArea.setText("Patrick loves to eat Whiskas 3 times a day\n" +
                "and having a fun at nigth ");

        Font niceFont = new Font(Font.SERIF,Font.BOLD | Font.ITALIC, 32);
        textField.setFont(niceFont);

        JLabel catLabel = new JLabel("This is my pet");
        Icon catIcon = new ImageIcon("src/pet.jpg");
        catLabel.setIcon(catIcon);

        holderPanel.add(catLabel);

        holderPanel.add(textField);

        JScrollPane scrollPane = new JScrollPane(textArea);

        holderPanel.add(scrollPane);

        Icon likeIcon = new ImageIcon("src/like.png");
        JButton likeButton = new JButton("Like", likeIcon);

        holderPanel.add(likeButton);

        contentPane.add(holderPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab1Part4();
    }
}