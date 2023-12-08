import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Lab3Part2 extends JFrame implements ListSelectionListener {

    Icon catIco = new ImageIcon("src/cat.jpg");
    Icon dogIco = new ImageIcon("src/dog.jpg");
    Icon foxIco = new ImageIcon("src/fox.jpg");
    String[] animalArr = {"Cat", "Dog", "Fox"};
    JList<String> animalList = new JList<String>(animalArr);
    JTextArea myTextArea = new JTextArea("");
    JLabel imageLabel = new JLabel("Images will appear here: please select from the above list.");

    public Lab3Part2() {
        Container contentPane = getContentPane();

        JPanel parentPanel = new JPanel();

        JPanel labelPanel = new JPanel(new GridLayout(0, 1));
        labelPanel.add(animalList);
        labelPanel.add(imageLabel);

        JPanel textPanel = new JPanel(new GridLayout(1, 0));
        textPanel.add(myTextArea);

        animalList.addListSelectionListener((ListSelectionListener) this);


        parentPanel.add(labelPanel);
        parentPanel.add(textPanel);

        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(labelPanel, BorderLayout.CENTER);
        parentPanel.add(textPanel, BorderLayout.SOUTH);
        setTitle("Lab3Part2");
        setSize(new Dimension(650, 400));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);

    }

    public static void main(String[] args) {
        JFrame frame = new Lab3Part2();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object source = e.getSource();
        String message = "";

        if (source == animalList) {
            int selectionNum = animalList.getSelectedIndex();

            switch (selectionNum) {
                case 0 -> {
                    imageLabel.setIcon(catIco);
                    imageLabel.setText("");
                    message = "This is a Pixel Cat - most sweet cat in the house.";
                    myTextArea.setText(message);
                }
                case 1 -> {
                    imageLabel.setIcon(dogIco);
                    imageLabel.setText("");
                    message = "This is a Pixel Dog - most active doggy in the city.";
                    myTextArea.setText(message);
                }
                default -> {
                    imageLabel.setIcon(foxIco);
                    imageLabel.setText("");
                    message = "This is a Pixel Fox - cutest Fox in our village. Chickens could confirm that info.";
                    myTextArea.setText(message);
                }
            }
        }
    }

}