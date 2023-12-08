import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Lab4Part4 extends JFrame implements ActionListener {

    JButton bankInfoButton = new JButton(" Banking Service ");
    JButton topUpButton = new JButton("Top Up");
    JButton creditButton = new JButton("Credit Cash");
    JButton otherButton = new JButton("Other");
    JButton cardBalanceButton = new JButton("Card Balance");
    JButton cashWithButton = new JButton("Cash Withdraw");
    JButton centerButton = new JButton(" Money transfer ");
    JButton settingsButton = new JButton("My Settings");
    JMenuItem depositMenuItem = new JMenuItem("Deposit");
    JMenuItem savingsMenuItem = new JMenuItem("Savings");
    JMenuItem investmentMenuItem = new JMenuItem("Investment");
    JMenuItem accStatementMenuItem = new JMenuItem("Account Statement");
    JMenuItem debitCardMenuItem = new JMenuItem("Debit Card");
    JMenuItem creditCardMenuItem = new JMenuItem("Credit Card");
    JMenuItem phoneTopUpMenuItem = new JMenuItem("Mobile Phone");
    JMenuItem changePinMenuItem = new JMenuItem("Change PIN");
    JMenuItem changeMobileNumMenuItem = new JMenuItem("Change Mobile Number");
    JMenuItem supportMenuItem = new JMenuItem("Support Center");
    JMenuItem helpMenuItem = new JMenuItem("Help");
    JMenuItem clickCardBMenuItem = new JMenuItem("Card Balance");
    JMenuItem clickCashMenuItem = new JMenuItem("Cash Withdraw");
    JMenuItem clickMoneyMenuItem = new JMenuItem("Money Transfer");

    JLabel infoLebel = new JLabel();

    public Lab4Part4() {
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

        // Menu bar and menus
        JMenuBar menuBar = new JMenuBar();
        JMenu bankingServiceMenu = new JMenu("Banking Service");

        bankingServiceMenu.add(depositMenuItem);
        bankingServiceMenu.add(savingsMenuItem);
        bankingServiceMenu.add(investmentMenuItem);
        bankingServiceMenu.addSeparator();
        bankingServiceMenu.add(accStatementMenuItem);

        bankingServiceMenu.setMnemonic(KeyEvent.VK_Q);
        depositMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.ALT_MASK));
        savingsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.ALT_MASK));
        investmentMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.ALT_MASK));
        accStatementMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.ALT_MASK));

        JMenu topUpMenu = new JMenu("Top Up");

        topUpMenu.add(debitCardMenuItem);
        topUpMenu.add(creditCardMenuItem);
        topUpMenu.addSeparator();
        topUpMenu.add(phoneTopUpMenuItem);

        topUpMenu.setMnemonic(KeyEvent.VK_W);

        debitCardMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.ALT_MASK));
        creditCardMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.ALT_MASK));
        phoneTopUpMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, KeyEvent.ALT_MASK));

        JMenu mySettingsMenu = new JMenu("My Settings");

        mySettingsMenu.add(changePinMenuItem);
        mySettingsMenu.add(changeMobileNumMenuItem);

        mySettingsMenu.setMnemonic(KeyEvent.VK_E);

        changePinMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.ALT_MASK));
        changeMobileNumMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.ALT_MASK));

        JMenu clickMenu = new JMenu("Operations");
        clickMenu.add(clickCardBMenuItem);
        clickMenu.add(clickCashMenuItem);
        clickMenu.add(clickMoneyMenuItem);

        clickMenu.setMnemonic(KeyEvent.VK_A);

        clickCardBMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.ALT_MASK));
        clickCashMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.ALT_MASK));
        clickMoneyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.ALT_MASK));

        menuBar.add(bankingServiceMenu);
        menuBar.add(topUpMenu);
        menuBar.add(mySettingsMenu);
        menuBar.add(clickMenu);



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
        phonePanel.setOpaque(false);
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

        bankInfoButton.setBackground(new Color(105, 159, 37));
        bankInfoButton.setFont(optionFont);
        bankInfoButton.setBorder(customBorder);

        topUpButton.setBackground(new Color(105, 159, 37));
        topUpButton.setFont(optionFont);
        topUpButton.setBorder(customBorder);

        creditButton.setBackground(new Color(105, 159, 37));
        creditButton.setFont(optionFont);
        creditButton.setBorder(customBorder);

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

        cardBalanceButton.setBackground(new Color(105, 159, 37));
        cardBalanceButton.setFont(optionFont);
        cardBalanceButton.setBorder(customBorder);

        cashWithButton.setBackground(new Color(105, 159, 37));
        cashWithButton.setFont(optionFont);
        cashWithButton.setBorder(customBorder);

        centerButton.setBackground(new Color(105, 159, 37));
        centerButton.setFont(optionFont);
        centerButton.setBorder(customBorder);

        settingsButton.setBackground(new Color(105, 159, 37));
        settingsButton.setFont(optionFont);
        settingsButton.setBorder(customBorder);

        rightPanel.add(rightEmptyLabel);
        rightPanel.add(rightEmptyLabelTwo);
        rightPanel.add(cardBalanceButton);
        rightPanel.add(cashWithButton);
        rightPanel.add(centerButton);
        rightPanel.add(settingsButton);

        // Set button listeners

        bankInfoButton.addActionListener((ActionListener) this);
        topUpButton.addActionListener((ActionListener) this);
        creditButton.addActionListener((ActionListener) this);
        otherButton.addActionListener((ActionListener) this);
        cardBalanceButton.addActionListener((ActionListener) this);
        cashWithButton.addActionListener((ActionListener) this);
        centerButton.addActionListener((ActionListener) this);
        settingsButton.addActionListener((ActionListener) this);

        clickCardBMenuItem.addActionListener((ActionListener) this);
        clickMoneyMenuItem.addActionListener((ActionListener) this);
        clickCashMenuItem.addActionListener((ActionListener) this);

        // Set BorderLayout for parentPanel

        parentPanel.setLayout(new BorderLayout());

        parentPanel.add(topPanel, BorderLayout.NORTH);

        parentPanel.add(leftPanel, BorderLayout.WEST);

        parentPanel.add(rightPanel, BorderLayout.EAST);

        parentPanel.add(phonePanel, BorderLayout.CENTER);

        JPanel bottomCenterPanel = new JPanel();
        bottomCenterPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomCenterPanel.setOpaque(false); // Make it transparent


        bottomCenterPanel.add(infoLebel);

        parentPanel.add(bottomCenterPanel, BorderLayout.CENTER);

        setJMenuBar(menuBar);
        setTitle("ATM Privat24");
        setSize(new Dimension(1200, 688));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab4Part4();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clickInfoString = "You have clicked ";
        infoLebel.setForeground(Color.red);

        if (e.getSource() == cardBalanceButton || e.getSource() == clickCardBMenuItem ) {
            infoLebel.setText(clickInfoString + "Card Balance");
            cardBalanceButton.setEnabled(false);
            cashWithButton.setEnabled(true);
            centerButton.setEnabled(true);
        } else if(e.getSource() == cashWithButton || e.getSource() == clickCashMenuItem){
            infoLebel.setText(clickInfoString + "Cash Withdraw");
            cashWithButton.setEnabled(false);
            cardBalanceButton.setEnabled(true);
            centerButton.setEnabled(true);
        }  else if(e.getSource() == centerButton || e.getSource() == clickMoneyMenuItem) {
            infoLebel.setText(clickInfoString + "Money Transfer");
            cashWithButton.setEnabled(true);
            cardBalanceButton.setEnabled(true);
            centerButton.setEnabled(false);
        }
    }
}