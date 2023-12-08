import javax.swing.*;
import java.awt.*;

public class Lab2Part2 extends JFrame {

    public Lab2Part2() {
        Container contentPane = getContentPane();


        JPanel holderPanel = new JPanel();

        String[] provinces = {"Leinster", "Ulster", "Munster", "Connaught"};
        String[] cities = {"Dublin", "Belfast", "Cork", "Limerick"};

        JList<String> firstList = new JList<String>(provinces);
        JList<String> secondList = new JList<String>(cities);
        firstList.setVisibleRowCount(3);
        secondList.setVisibleRowCount(3);

        JScrollPane fScrollPane = new JScrollPane(firstList);
        JScrollPane secScrollPane = new JScrollPane(secondList);


        holderPanel.add(fScrollPane);
        holderPanel.add(secScrollPane);

        contentPane.add(holderPanel);
        setTitle("Lab2Part2");
        setSize(new Dimension(600, 400));
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab2Part2();
    }
}