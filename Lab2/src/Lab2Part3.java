import javax.swing.*;
import java.awt.*;

public class Lab2Part3 extends JFrame {

    public Lab2Part3() {
        Container contentPane = getContentPane();

        JPanel parentPanel = new JPanel();
        JPanel comboPanel = new JPanel(new GridLayout(0, 1, 5, 5));


        String[] favCities = {"Kiev", "Dublin", "Wien", "Brussels", "Venice" };
        String[] favBands = {"Nirvana", "HardKiss", "Milky Chance", "ReignWolf", "Black Pistol Fire" };


        JComboBox<String> combo = new JComboBox<String>(favCities);
        JComboBox<String> comboTwo = new JComboBox<String>(favBands);

        comboPanel.add(combo);
        comboPanel.add(comboTwo);

        JPanel radioButtonPanel = new JPanel(new GridLayout(0, 1));

        ButtonGroup group = new ButtonGroup();
        JRadioButton firstRadioBut = new JRadioButton("Top Combo");
        JRadioButton secondRadioBut = new JRadioButton("Bottom Combo");
        group.add(firstRadioBut);
        group.add(secondRadioBut);


        JLabel radioLabel = new JLabel("Please select which ComboBox you like the most from the two shown above");
        Font niceFont = new Font(Font.SERIF,Font.BOLD, 20);
        radioLabel.setFont(niceFont);

        radioButtonPanel.add(radioLabel);
        radioButtonPanel.add(firstRadioBut);
        radioButtonPanel.add(secondRadioBut);

        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(comboPanel, BorderLayout.NORTH);
        parentPanel.add(radioButtonPanel, BorderLayout.SOUTH);
        setTitle("Lab2Part3");
        setSize(new Dimension(650, 400));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab2Part3();

    }
}