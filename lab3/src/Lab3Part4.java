import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part4 extends JFrame implements ActionListener {
    Float wallet = 0f;
    Float topUpValue = 10.0f;
    Float callValue = 5.5f;
    Float sendTextValue = 2.5f;
    JButton topUpButton = new JButton("Top Up");
    JButton makeCallButton = new JButton("Make Call");
    JButton sendTextButton = new JButton("Send Text");
    JLabel balanceLabel = new JLabel("Balance: " + wallet + " $");
    JLabel messageLabel = new JLabel("Top Up The Wallet!");

    public Lab3Part4() {
        Container contentPane = getContentPane();

        // background image
        JPanel parentPanel = new JPanel();
        parentPanel.setBackground(new Color(9, 22, 28));

        JPanel balancePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        balancePanel.setBackground(new Color(9, 22, 28));
        balancePanel.add(balanceLabel);

        Font niceFont = new Font(Font.SERIF, Font.BOLD, 32);
        balanceLabel.setFont(niceFont);
        balanceLabel.setForeground(Color.YELLOW);

        JPanel introductionPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        Icon wifiIco = new ImageIcon("src/wifi.png");
        JLabel wifiLabel = new JLabel(wifiIco);
        Icon batteryIco = new ImageIcon("src/battery.png");
        JLabel batteryLabel = new JLabel(batteryIco);

        introductionPanel.add(wifiLabel);
        introductionPanel.add(batteryLabel);

        JLabel introductionTextLabel = new JLabel("<html>Hi John,<br> Welcome back!</html>");
        Font intFont = new Font(Font.SERIF, Font.BOLD| Font.ITALIC, 18);

        introductionTextLabel.setFont(intFont);
        introductionTextLabel.setForeground(Color.WHITE);
        introductionPanel.setBackground(new Color(9, 22, 28));
        introductionPanel.add(introductionTextLabel);

        // Message Panel
        JPanel messagePanel = new JPanel(new GridLayout(1,1));
        messagePanel.setBackground(new Color(9, 22, 28));
        messagePanel.add(messageLabel);
        messageLabel.setFont(niceFont);
        messageLabel.setForeground(Color.RED);

        // Button Panel
        JPanel buttonPanel = new JPanel(new GridLayout(2,1, 10, 10));
        buttonPanel.setBackground(new Color(228, 242, 60));

        Icon homeIco = new ImageIcon("src/home.png");
        Icon chartIco = new ImageIcon("src/chart.png");
        Icon timeIco = new ImageIcon("src/time.png");
        Border customBorder = BorderFactory.createLineBorder(new Color(187, 196, 64), 8);

        JLabel homeLabel = new JLabel(homeIco);
        JLabel chartLabel = new JLabel(chartIco);
        JLabel timeLabel = new JLabel(timeIco);

        homeLabel.setOpaque(true);
        chartLabel.setOpaque(true);
        timeLabel.setOpaque(true);

        homeLabel.setBackground(Color.WHITE);
        chartLabel.setBackground(new Color(211, 221, 62));
        timeLabel.setBackground(new Color(211, 221, 62));


        buttonPanel.add(topUpButton);
        buttonPanel.add(makeCallButton);
        buttonPanel.add(sendTextButton);

        buttonPanel.add(homeLabel);
        buttonPanel.add(chartLabel);
        buttonPanel.add(timeLabel);

        topUpButton.addActionListener((ActionListener) this);
        makeCallButton.addActionListener((ActionListener) this);
        sendTextButton.addActionListener((ActionListener) this);

        topUpButton.setFont(niceFont);
        sendTextButton.setFont(niceFont);
        makeCallButton.setFont(niceFont);

        topUpButton.setBorder(customBorder);
        makeCallButton.setBorder(customBorder);
        sendTextButton.setBorder(customBorder);

        topUpButton.setBackground(new Color(211, 221, 62));
        makeCallButton.setBackground(new Color(211, 221, 62));
        sendTextButton.setBackground(new Color(211, 221, 62));

        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(balancePanel, BorderLayout.WEST);
        parentPanel.add(introductionPanel, BorderLayout.EAST);
        parentPanel.add(messagePanel, BorderLayout.CENTER);
        parentPanel.add(buttonPanel, BorderLayout.SOUTH);

        updateInfoButton();
        contentPane.add(parentPanel);

        setTitle("Lab3Part4");
        setSize(new Dimension(700, 903));
        setVisible(true);
        setResizable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == topUpButton) {
            wallet += topUpValue;
            balanceLabel.setText("Balance: " + wallet + " $");
        } else if (e.getSource() == makeCallButton) {
            wallet -= callValue;
            balanceLabel.setText("Balance: " + wallet + " $");
        } else if (e.getSource() == sendTextButton) {
            wallet -= sendTextValue;
            balanceLabel.setText("Balance: " + wallet + " $");

        }

        // If statement for warning massage
        if(wallet <= 5) {
            messageLabel.setForeground(Color.RED);
            messageLabel.setText("Top Up The Wallet!");
        } else {
            messageLabel.setForeground(Color.GREEN);
            messageLabel.setText("The Wallet is Ok!");
        }

        updateInfoButton();
    }

    private void updateInfoButton(){

        // Make buttons invisible
        sendTextButton.setEnabled(wallet >= 2.5f);
        makeCallButton.setEnabled(wallet >= 5);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new Lab3Part4();
        });
    }
}