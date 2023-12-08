import javax.swing.*;
import java.awt.*;

public class Lab1Part3 extends JFrame {

    public Lab1Part3() {
        setTitle("Denys Rudenko");
        setSize(600, 450);
        Container contentPane = getContentPane();
        JPanel buttonPanel = new JPanel();

        Icon openIcon = new ImageIcon("src/open.png");
        JButton myOpenButton = new JButton("Open", openIcon);

        Icon saveIcon = new ImageIcon("src/save.png");
        JButton mySaveButton = new JButton("Save", saveIcon);

        Icon deleteIcon = new ImageIcon("src/delete.png");
        JButton myDeleteButton = new JButton("Delete", deleteIcon);

        Icon undoIcon = new ImageIcon("src/undo.png");
        JButton myUndoButton = new JButton("Undo", undoIcon);

        buttonPanel.add(myOpenButton);
        buttonPanel.add(mySaveButton);
        buttonPanel.add(myDeleteButton);
        buttonPanel.add(myUndoButton);

        contentPane.add(buttonPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab1Part3();
    }
}