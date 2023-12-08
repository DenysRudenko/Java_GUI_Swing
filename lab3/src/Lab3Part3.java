import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part3 extends JFrame implements ActionListener {
    String[] colorStr = {"Red", "Blue", "Green", "Black", "Purple" };
    String[] imagesStr = {"Dublin Bridge", "Dublin Street", "Bolzano", "Venice", "Lago Di Braises" };
    JComboBox<String> colorList = new JComboBox<String>(colorStr);
    JComboBox<String> imageList = new JComboBox<String>(imagesStr);
    Icon dublinBridgeImg = new ImageIcon("src/dublinBridge.jpg");
    Icon dublinStreetImg = new ImageIcon("src/dublinStreet.jpg");
    Icon bolzanoImg = new ImageIcon("src/bolzano.jpg");
    Icon veniceImg = new ImageIcon("src/venice.jpg");
    Icon briesImg = new ImageIcon("src/lagoDiBraies.jpg");
    JLabel myTopLabel = new JLabel(dublinBridgeImg);
    JLabel myBottomLabel = new JLabel("This label changes colour based on what you select");

    public Lab3Part3() {
        Container contentPane = getContentPane();

        JPanel parentPanel = new JPanel();

        // That panel will include images on imageList ComboBox
        JPanel topLabelPanel = new JPanel();

        topLabelPanel.add(imageList);
        topLabelPanel.add(colorList);
        imageList.addActionListener((ActionListener) this);

        // Center panel
        JPanel centerLabelPanel = new JPanel();
        centerLabelPanel.add(myTopLabel);

        // That panel will change the colour of colorList ComBox
        JPanel bottomLabelPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        myBottomLabel.setOpaque(true);
        myBottomLabel.setBackground(Color.RED);
        bottomLabelPanel.add(myBottomLabel);
        colorList.addActionListener((ActionListener) this);

        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(topLabelPanel, BorderLayout.PAGE_START);
        parentPanel.add(centerLabelPanel, BorderLayout.CENTER);
        parentPanel.add(bottomLabelPanel, BorderLayout.PAGE_END);

        setTitle("Lab3Part3");
        setSize(new Dimension(800, 600));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab3Part3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == imageList) {
            int selectionImageNum = imageList.getSelectedIndex();

            switch (selectionImageNum) {
                case 0 -> {
                    myTopLabel.setIcon(dublinBridgeImg);
                }
                case 1 -> {
                    myTopLabel.setIcon(dublinStreetImg);
                }
                case 2 -> {
                    myTopLabel.setIcon(bolzanoImg);
                }
                case 3 -> {
                    myTopLabel.setIcon(veniceImg);
                }
                default -> {
                    myTopLabel.setIcon(briesImg);
                }
            }
        }

        if (e.getSource() == colorList) {
            int selectionColourNum = colorList.getSelectedIndex();

            switch (selectionColourNum) {
                case 0 -> {
                    myBottomLabel.setBackground(Color.RED);
                }
                case 1 -> {
                    myBottomLabel.setBackground(Color.BLUE);
                }
                case 2 -> {
                    myBottomLabel.setBackground(Color.GREEN);
                }
                case 3 -> {
                    myBottomLabel.setBackground(Color.BLACK);
                }
                default -> {
                    myBottomLabel.setBackground(new Color(127, 0, 255));
                }
            }
        }
    }
}