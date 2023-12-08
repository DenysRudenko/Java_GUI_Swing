import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part1 extends JFrame implements ActionListener {
    JCheckBox smFontCheckBox = new JCheckBox("Small Font");
    JCheckBox bigFontCheckBox = new JCheckBox("Big Font");
    JCheckBox vbFontCheckBox = new JCheckBox("Very Big Font");
    JCheckBox hugeFontCheckBox = new JCheckBox("Huge Font");

    JLabel fontLabel = new JLabel("Change Font with CheckBoxes");
    public Lab4Part1() {
        Container contentPane = getContentPane();

        JPanel parentPanel = new JPanel();
        JPanel checkBoxPanel = new JPanel();
        JPanel labelPanel = new JPanel();

        ButtonGroup fontCheboxGroup = new ButtonGroup();

        smFontCheckBox.addActionListener((ActionListener) this);
        bigFontCheckBox.addActionListener((ActionListener) this);
        vbFontCheckBox.addActionListener((ActionListener) this);
        hugeFontCheckBox.addActionListener((ActionListener) this);

        fontCheboxGroup.add(smFontCheckBox);
        fontCheboxGroup.add(bigFontCheckBox);
        fontCheboxGroup.add(vbFontCheckBox);
        fontCheboxGroup.add(hugeFontCheckBox);

        checkBoxPanel.add(smFontCheckBox);
        checkBoxPanel.add(bigFontCheckBox);
        checkBoxPanel.add(vbFontCheckBox);
        checkBoxPanel.add(hugeFontCheckBox);

        labelPanel.add(fontLabel);

        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(checkBoxPanel, BorderLayout.NORTH);
        parentPanel.add(labelPanel, BorderLayout.CENTER);

        setTitle("Lab4Part1");
        setSize(new Dimension(800, 600));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab4Part1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Font smallFont = new Font(Font.SERIF, Font.BOLD, 12);
        Font bigFont = new Font(Font.SERIF, Font.BOLD, 18);
        Font vbFont = new Font(Font.SERIF, Font.BOLD, 24);
        Font hugeFont = new Font(Font.SERIF, Font.BOLD, 48);

        if (e.getSource() == smFontCheckBox) {
            fontLabel.setFont(smallFont);
        } else if (e.getSource() == bigFontCheckBox) {
            fontLabel.setFont(bigFont);
        } else if (e.getSource() == vbFontCheckBox) {
            fontLabel.setFont(vbFont);
        } else if (e.getSource() == hugeFontCheckBox){
            fontLabel.setFont(hugeFont);
        }
    }
}