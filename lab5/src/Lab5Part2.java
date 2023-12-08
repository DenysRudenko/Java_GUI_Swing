import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;


public class Lab5Part2 extends JFrame implements ActionListener {
    String[] displayOptions = {"First Question Panel", "Second question panel", "Third Question panel", "Results"};
//    JComboBox<String> switchDisplay = new JComboBox<String>(displayOptions);

    JPanel firstQuePanel = buildFirstTextPanel(),
            secondQuePanel = buildSecondTextPanel(),
            thirdQuePanel = buildThirdTextPanel(),
            resultsPanel = buildResultsTextPanel(),
            displayPanel = new JPanel();
    JRadioButton firstCheckBoxSnacks, secondCheckBoxSnacks, thirdCheckBoxSnacks, fourthCheckBoxSnacks,
            firstCheckBoxAnimals, secondCheckBoxAnimals, thirdCheckBoxAnimals, fourthCheckBoxAnimals,
            firstCheckBoxCountries, secondCheckBoxCountries, thirdCheckBoxCountries, fourthCheckBoxCountries;

    ButtonGroup firstCheckboxGroup = new ButtonGroup();
    ButtonGroup secondCheckboxGroup = new ButtonGroup();
    ButtonGroup thirdCheckboxGroup = new ButtonGroup();

    JLabel resultsLabelOne;
    Font textFont;
    public Lab5Part2() {
        Container contentPane = getContentPane();


        firstCheckboxGroup.add(firstCheckBoxSnacks);
        firstCheckboxGroup.add(secondCheckBoxSnacks);
        firstCheckboxGroup.add(thirdCheckBoxSnacks);
        firstCheckboxGroup.add(fourthCheckBoxSnacks);

        secondCheckboxGroup.add(firstCheckBoxAnimals);
        secondCheckboxGroup.add(secondCheckBoxAnimals);
        secondCheckboxGroup.add(thirdCheckBoxAnimals);
        secondCheckboxGroup.add(fourthCheckBoxAnimals);

        thirdCheckboxGroup.add(firstCheckBoxCountries);
        thirdCheckboxGroup.add(secondCheckBoxCountries);
        thirdCheckboxGroup.add(thirdCheckBoxCountries);
        thirdCheckboxGroup.add(fourthCheckBoxCountries);

        displayPanel.setLayout(new CardLayout());
        displayPanel.add(firstQuePanel);
        displayPanel.add(secondQuePanel);
        displayPanel.add(thirdQuePanel);
        displayPanel.add(resultsPanel);

//        switchDisplay.addActionListener(this);


        firstCheckBoxSnacks.addActionListener(this);
        secondCheckBoxSnacks.addActionListener(this);
        thirdCheckBoxSnacks.addActionListener(this);
        fourthCheckBoxSnacks.addActionListener(this);

        firstCheckBoxAnimals.addActionListener(this);
        secondCheckBoxAnimals.addActionListener(this);
        thirdCheckBoxAnimals.addActionListener(this);
        fourthCheckBoxAnimals.addActionListener(this);

        firstCheckBoxCountries.addActionListener(this);
        secondCheckBoxCountries.addActionListener(this);
        thirdCheckBoxCountries.addActionListener(this);
        fourthCheckBoxCountries.addActionListener(this);

//        contentPane.add(switchDisplay);
        contentPane.add(displayPanel, BorderLayout.NORTH);

//        contentPane.add(emptyLabel);

        setTitle("Lab5Part2");
        setSize(new Dimension(800, 400));
        setVisible(true);
        setResizable(false);
    }

    public JPanel buildFirstTextPanel() {
        JPanel panel = null;
        panel = new JPanel();

        JLabel card1Label = new JLabel();
        card1Label.setText("Pick your favourite snack:");

        firstCheckBoxSnacks = new JRadioButton("Chocolate");
        secondCheckBoxSnacks = new JRadioButton("Crisps");
        thirdCheckBoxSnacks = new JRadioButton("Popcorn");
        fourthCheckBoxSnacks = new JRadioButton("Banana slices");

        textFont = new Font("Serif", Font.BOLD | Font.ITALIC, 32);
        card1Label.setFont(textFont);

        panel.add(card1Label);
        panel.add(firstCheckBoxSnacks);
        panel.add(secondCheckBoxSnacks);
        panel.add(thirdCheckBoxSnacks);
        panel.add(fourthCheckBoxSnacks);
        return panel;
    }

    public JPanel buildSecondTextPanel() {
        JPanel panel = null;
        panel = new JPanel();

        JLabel card2Label = new JLabel("Pick your favourite animal:");
        textFont = new Font("Serif", Font.BOLD, 32);

        card2Label.setFont(textFont);
        card2Label.setForeground(Color.RED);

        firstCheckBoxAnimals = new JRadioButton("Cat");
        secondCheckBoxAnimals = new JRadioButton("Dog");
        thirdCheckBoxAnimals = new JRadioButton("Parrot");
        fourthCheckBoxAnimals = new JRadioButton("Lion");

        panel.add(card2Label);
        panel.add(firstCheckBoxAnimals);
        panel.add(secondCheckBoxAnimals);
        panel.add(thirdCheckBoxAnimals);
        panel.add(fourthCheckBoxAnimals);

        return panel;
    }

    public JPanel buildThirdTextPanel() {
        JPanel panel = null;
        panel = new JPanel();

        JLabel card3Label = new JLabel("Pick your favourite country:");
        textFont = new Font("Serif", Font.BOLD, 32);

        card3Label.setFont(textFont);
        card3Label.setForeground(Color.GREEN);

        firstCheckBoxCountries = new JRadioButton("Ireland");
        secondCheckBoxCountries = new JRadioButton("Austria");
        thirdCheckBoxCountries = new JRadioButton("Italy");
        fourthCheckBoxCountries = new JRadioButton("Belgium");

        panel.add(card3Label);
        panel.add(firstCheckBoxCountries);
        panel.add(secondCheckBoxCountries);
        panel.add(thirdCheckBoxCountries);
        panel.add(fourthCheckBoxCountries);

        return panel;
    }

    public JPanel buildResultsTextPanel() {
        JPanel panel = new JPanel();

        JLabel card4Label = new JLabel();
        card4Label.setText("Results: ");

        resultsLabelOne = new JLabel();

        textFont = new Font("Serif", Font.BOLD | Font.ITALIC, 32);
        card4Label.setFont(textFont);


        panel.add(card4Label);
        panel.add(resultsLabelOne);


        return panel;
    }

    public static void main(String[] args) {
        JFrame frame = new Lab5Part2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout card = (CardLayout) displayPanel.getLayout();
        card.next(displayPanel);

        String resultText = "";
        resultText += "Snacks - " + getSelectedButtonText(firstCheckboxGroup) + " | ";
        resultText += "Animals - " + getSelectedButtonText(secondCheckboxGroup) + " | ";
        resultText += "Countries - " + getSelectedButtonText(thirdCheckboxGroup);
        resultsLabelOne.setText(resultText);
    }

    // Helper method to get the selected radio button text from a ButtonGroup
    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return "Not Selected!";
    }

}
