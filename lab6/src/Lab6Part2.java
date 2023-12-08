import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class Lab6Part2 extends JFrame implements MouseListener {
    JLabel imageLabel;
    JLabel colorLabel;
    public Lab6Part2() {

        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BorderLayout());


        imageLabel = new JLabel("Choose an image here");
        colorLabel = new JLabel("Choose a colour here");

        imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        colorLabel.setOpaque(true);
        colorLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        colorLabel.addMouseListener(this);
        imageLabel.addMouseListener(this);

        imageLabel.setPreferredSize(new Dimension(800, 281));
        colorLabel.setPreferredSize(new Dimension(800, 281));


        parentPanel.add(imageLabel, BorderLayout.PAGE_END);
        parentPanel.add(colorLabel, BorderLayout.PAGE_START);


        setTitle("Lab 6 Part 2");
        setSize(800, 600);
        setVisible(true);
        setContentPane(parentPanel);
    }

    public void chooseImage() {
        JFileChooser fileChooser = new JFileChooser();
        int optionVal = fileChooser.showOpenDialog(this);

        if (optionVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
            imageLabel.setIcon(imageIcon);
        }
    }

    public void chooseColor() {
        Color chosenColor = JColorChooser.showDialog(this, "Choose colour", Color.BLACK);
        colorLabel.setBackground(chosenColor);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab6Part2();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() instanceof JLabel){
            if((JLabel)e.getSource() == imageLabel){
                chooseImage();
            }

            if((JLabel)e.getSource() == colorLabel){
                chooseColor();
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() instanceof JLabel){
            if((JLabel)e.getSource() == imageLabel){
                imageLabel.setIcon(null);
            }

        }
    }
}
