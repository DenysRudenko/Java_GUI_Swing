import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Lab2Part4 extends JFrame {

    private JPanel panel1;

    public Lab2Part4() {
        Container contentPane = getContentPane();

        // background image
        JPanel parentPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load your background image
                ImageIcon backgroundImage = new ImageIcon("src/background.jpg");
                Image img = backgroundImage.getImage();

                // Draw the background image
                g.drawImage(img, 0, 0, this);
            }
        };

        JLabel rightEmptyLabel = new JLabel();
        JLabel rightEmptyLabelTwo = new JLabel();
        JLabel leftEmptyLabel = new JLabel();
        JLabel leftEmptyLabelTwo = new JLabel();

        // Text at the top
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(30, 30, 30));

        JLabel instructions = new JLabel("Choose a service");
        instructions.setForeground(new Color(105, 159, 37));
        instructions.setLayout(new FlowLayout(FlowLayout.TRAILING));
        Font niceFont = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 32);
        instructions.setFont(niceFont);
        topPanel.add(instructions);

        JPanel phonePanel = new JPanel();
        JLabel phoneNum = new JLabel("3700");
        phoneNum.setForeground(new Color(105, 159, 37));
        Font phoneFont = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 25);
        phonePanel.add(phoneNum);
        phoneNum.setFont(phoneFont);

        Icon phoneIcon = new ImageIcon("src/phone.png");
        JLabel phoneLabel = new JLabel(phoneIcon);
        phonePanel.add(phoneLabel);
        phonePanel.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        // Left buttons
        JPanel leftPanel = new JPanel(new GridLayout(0, 1, 35, 35));
        leftPanel.setBackground(new Color(30, 30, 30));
        Font optionFont = new Font(Font.SERIF, Font.BOLD , 20);

        Border customBorder = BorderFactory.createLineBorder(new Color(72, 109, 24), 5);
        JButton bankInfoButton = new JButton(" Banking Service ");
        bankInfoButton.setBackground(new Color(105, 159, 37));
        bankInfoButton.setFont(optionFont);
        bankInfoButton.setBorder(customBorder);


        JButton topUpButton = new JButton("Top Up");
        topUpButton.setBackground(new Color(105, 159, 37));
        topUpButton.setFont(optionFont);
        topUpButton.setBorder(customBorder);

        JButton creditButton = new JButton("Credit Cash");
        creditButton.setBackground(new Color(105, 159, 37));
        creditButton.setFont(optionFont);
        creditButton.setBorder(customBorder);

        JButton otherButton = new JButton("Other");
        otherButton.setBackground(new Color(105, 159, 37));
        otherButton.setFont(optionFont);
        otherButton.setBorder(customBorder);

        leftPanel.add(leftEmptyLabel);
        leftPanel.add(leftEmptyLabelTwo);
        leftPanel.add(bankInfoButton);
        leftPanel.add(topUpButton);
        leftPanel.add(creditButton);
        leftPanel.add(otherButton);

        // Right buttons
        JPanel rightPanel = new JPanel(new GridLayout(0, 1, 35, 35));
        rightPanel.setBackground(new Color(30, 30, 30));
        JButton cardBalanceButton = new JButton("Card Balance");
        cardBalanceButton.setBackground(new Color(105, 159, 37));
        cardBalanceButton.setFont(optionFont);
        cardBalanceButton.setBorder(customBorder);

        JButton cashWithButton = new JButton("Cash Withdraw");
        cashWithButton.setBackground(new Color(105, 159, 37));
        cashWithButton.setFont(optionFont);
        cashWithButton.setBorder(customBorder);

        JButton centerButton = new JButton(" Money transfer ");
        centerButton.setBackground(new Color(105, 159, 37));
        centerButton.setFont(optionFont);
        centerButton.setBorder(customBorder);

        JButton settingsButton = new JButton("My Settings");
        settingsButton.setBackground(new Color(105, 159, 37));
        settingsButton.setFont(optionFont);
        settingsButton.setBorder(customBorder);

        rightPanel.add(rightEmptyLabel);
        rightPanel.add(rightEmptyLabelTwo);
        rightPanel.add(cardBalanceButton);
        rightPanel.add(cashWithButton);
        rightPanel.add(centerButton);
        rightPanel.add(settingsButton);

        // Set BorderLayout for parentPanel

        parentPanel.setLayout(new BorderLayout());

        parentPanel.add(topPanel, BorderLayout.NORTH);

        parentPanel.add(leftPanel, BorderLayout.WEST);

        parentPanel.add(rightPanel, BorderLayout.EAST);

        parentPanel.add(phonePanel, BorderLayout.CENTER);
        setTitle("ATM Privat24");
        setSize(new Dimension(1200, 650));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab2Part4();

    }
}
