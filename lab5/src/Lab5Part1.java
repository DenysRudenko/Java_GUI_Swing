import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Lab5Part1 extends JFrame implements ChangeListener {
    JProgressBar progressBar = new JProgressBar();
    JSlider slider = new JSlider();
    public Lab5Part1() {
        Container contentPane = getContentPane();

        JPanel parentPanel = new JPanel();

        JPanel centerPanel = new JPanel();

        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        slider.setMinimum(0);
        slider.setMaximum(100);

        slider.addChangeListener(this);
        progressBar.addChangeListener(this);

        centerPanel.setLayout(new GridLayout(2,1));
        centerPanel.add(progressBar);
        centerPanel.add(slider);

        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(centerPanel, BorderLayout.CENTER);

        setTitle("Lab5Part1");
        setSize(new Dimension(400, 300));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab5Part1();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        progressBar.setValue(slider.getValue());
    }
}
