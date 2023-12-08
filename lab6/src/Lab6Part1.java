import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab6Part1 extends JFrame implements ActionListener {
    JDesktopPane desktopPane;
    JMenuItem chessMenuItem = new JMenuItem("Launch Chess Game");
    JMenuItem snakesMenuItem = new JMenuItem("Launch Snakes and Ladders");

    public Lab6Part1() {

        desktopPane = new JDesktopPane();

        JMenuBar menuBar = new JMenuBar();
        JMenu gamesMenu = new JMenu("Games Menu");

        menuBar.add(gamesMenu);

        gamesMenu.add(chessMenuItem);
        gamesMenu.add(snakesMenuItem);

        chessMenuItem.addActionListener(this);
        snakesMenuItem.addActionListener(this);

        setJMenuBar(menuBar);

        setTitle("Lab6Part1");
        setSize(870, 600);
        setVisible(true);
        setContentPane(desktopPane);
    }

    public void launchChessGame() {
        JInternalFrame chessFrame = new JInternalFrame("Chess Game",
                true, true, true, true);

        chessFrame.setSize(400, 400);

        JLabel chessLabel = new JLabel(new ImageIcon("src/chess.jpg"));

        chessFrame.add(chessLabel);

        chessFrame.setVisible(true);
        desktopPane.add(chessFrame);
    }

    public void launchSnakesAndLaddersGame() {
        JInternalFrame snakesFrame = new JInternalFrame("Snakes and Ladders",
                true, true, true, true);

        snakesFrame.setSize(400, 400);

        snakesFrame.setLocation(450, 0);

        JLabel snakesLabel = new JLabel(new ImageIcon("src/snakes.jpg"));

        snakesFrame.add(snakesLabel);

        snakesFrame.setVisible(true);
        desktopPane.add(snakesFrame);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab6Part1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chessMenuItem) {
            launchChessGame();
        } else if (e.getSource() == snakesMenuItem) {
           launchSnakesAndLaddersGame();
        }
    }
}
