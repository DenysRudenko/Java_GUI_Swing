import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4Part2 extends JFrame implements ActionListener {

    JMenuItem amazonMenuItem = new JMenuItem("Amazon Prime");
    JMenuItem netflixMenuItem = new JMenuItem("Netflix");
    JMenuItem hboMenuItem = new JMenuItem("HBO");
    JMenuItem nowTvMenuItem = new JMenuItem("NowTv");
    JMenuItem skyStreamMenuItem = new JMenuItem("Sky Stream");
    JLabel streamLabel = new JLabel();

    public Lab4Part2() {
        Container contentPane = getContentPane();

        JMenuBar menuBar = new JMenuBar();

        amazonMenuItem.addActionListener((ActionListener) this);
        netflixMenuItem.addActionListener((ActionListener) this);
        hboMenuItem.addActionListener((ActionListener) this);
        nowTvMenuItem.addActionListener((ActionListener) this);
        skyStreamMenuItem.addActionListener((ActionListener) this);

        menuBar.add(amazonMenuItem);
        menuBar.add(netflixMenuItem);
        menuBar.add(hboMenuItem);
        menuBar.add(nowTvMenuItem);
        menuBar.add(skyStreamMenuItem);
        setJMenuBar(menuBar);

        JPanel parentPanel = new JPanel();
        parentPanel.add(streamLabel);

        setTitle("Lab4Part2");
        setSize(new Dimension(800, 600));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab4Part2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == amazonMenuItem) {
            Icon amazonIco = new ImageIcon("src/amazon.png");
            streamLabel.setIcon(amazonIco);
        } else if (e.getSource() == netflixMenuItem) {
            Icon netflixIco = new ImageIcon("src/netflix.png");
            streamLabel.setIcon(netflixIco);
        } else if (e.getSource() == hboMenuItem) {
            Icon hboIco = new ImageIcon("src/hbo.png");
            streamLabel.setIcon(hboIco);
        } else if (e.getSource() == nowTvMenuItem){
            Icon nowTv = new ImageIcon("src/nowTv.png");
            streamLabel.setIcon(nowTv);
        } else if ( e.getSource() == skyStreamMenuItem){
            Icon skyStream = new ImageIcon("src/skyStrem.png");
            streamLabel.setIcon(skyStream);
        }
    }
}