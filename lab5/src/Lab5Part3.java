import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Lab5Part3 extends JFrame implements ChangeListener {
    JSlider slider = new JSlider();
    Icon imageIco = new ImageIcon("src/donkey.png");
    int previousSliderValue = 0;
    int imageHeight = 100;
    int imageWidth = 150;
    BufferedImage blankImage = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
    ImageIcon blankIco = new ImageIcon(blankImage);
    JLabel firstLabel = new JLabel(blankIco);
    JLabel secondLabel = new JLabel(blankIco);
    JLabel thirdLabel = new JLabel(blankIco);
    JLabel fourthLabel = new JLabel(blankIco);

    public Lab5Part3() {
        Container contentPane = getContentPane();

        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BoxLayout(parentPanel, BoxLayout.Y_AXIS));

        JPanel imagePanel = new JPanel();

        imagePanel.setLayout(new BoxLayout(imagePanel, BoxLayout.X_AXIS));

        imagePanel.add(firstLabel);
        imagePanel.add(secondLabel);
        imagePanel.add(thirdLabel);
        imagePanel.add(fourthLabel);

        slider.setMinimum(1);
        slider.setMaximum(4);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(1);

        slider.setValue(1);
        previousSliderValue = 1;
        firstLabel.setIcon(imageIco);

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        firstLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        secondLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        thirdLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        fourthLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        JPanel sliderPanel = new JPanel();
        slider.addChangeListener(this);
        sliderPanel.add(slider);

        parentPanel.add(imagePanel);
        parentPanel.add(sliderPanel);

        setTitle("Lab5Part3");
        setSize(new Dimension(800, 800));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab5Part3();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
       int sliderValue = slider.getValue();

       if (previousSliderValue == sliderValue){
           return;
       }

        switch (previousSliderValue) {
            case 1 -> firstLabel.setIcon(blankIco);
            case 2 -> secondLabel.setIcon(blankIco);
            case 3 -> thirdLabel.setIcon(blankIco);
            case 4 -> fourthLabel.setIcon(blankIco);
        }

        switch (sliderValue) {
            case 1 -> firstLabel.setIcon(imageIco);
            case 2 -> secondLabel.setIcon(imageIco);
            case 3 -> thirdLabel.setIcon(imageIco);
            case 4 -> fourthLabel.setIcon(imageIco);
        }

       previousSliderValue = sliderValue;

    }
}