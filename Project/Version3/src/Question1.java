import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class Question1 extends JFrame implements ActionListener {

    // Variables for to count the order value
    Float orderValue = 0f,
            cokeValue = 2f, spriteValue = 2.5f, waterValue = 1.5f,
            spaghettiValue = 7.0f, risottoValue = 6.5f, chickenValue = 9.5f,
            tiramisuValue = 5.5f, pannacottaValue = 4.5f, cannoliValue = 5.0f;


    // Variables for counting how many items user clicked during the order
    Integer cokeCount = 0, waterCount = 0, spriteCount = 0,
            spaghettiCount = 0, risottoCount = 0, chickenCount = 0,
            tiramisuCount = 0, pannacottaCount = 0, cannoliCount = 0;


    // Variable for Amount label
    JLabel amount = new JLabel("Amount: " + orderValue);

    // Variables for drinks icons
    Icon cokeIco = new ImageIcon("src/cokeIco.png");
    Icon spriteIco = new ImageIcon("src/spriteIco.png");
    Icon waterIco = new ImageIcon("src/waterIco.png");

    // Variables for meal icons
    Icon spaghettiIco = new ImageIcon("src/spaghettiIco.png");
    Icon risottoIco = new ImageIcon("src/risottoIco.png");
    Icon chickenIco = new ImageIcon("src/chickenIco.png");

    // Variables for dessert icons
    Icon tiramisuIco = new ImageIcon("src/tiramisuIco.png");
    Icon pannacottaIco = new ImageIcon("src/pannacottaIco.png");
    Icon cannoliIco = new ImageIcon("src/cannoliIco.png");
    int imageHeight = 150;
    int imageWidth = 150;
    BufferedImage blankImage = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
    ImageIcon blankIco = new ImageIcon(blankImage);

    // Variables for drinks labels
    JLabel drinksFirstLabel = new JLabel(blankIco);
    JLabel drinksSecondLabel = new JLabel(blankIco);
    JLabel drinksThirdLabel = new JLabel(blankIco);

    // Variables for meals labels
    JLabel mealFirstLabel = new JLabel(blankIco);
    JLabel mealSecondLabel = new JLabel(blankIco);
    JLabel mealThirdLabel = new JLabel(blankIco);

    // Variables for dessert labels
    JLabel dessertFirstLabel = new JLabel(blankIco);
    JLabel dessertSecondLabel = new JLabel(blankIco);
    JLabel dessertThirdLabel = new JLabel(blankIco);

    // menu items for drinks
    JMenuItem cokeMenuItem = new JMenuItem("Coke 2$");
    JMenuItem waterMenuItem = new JMenuItem("Water 1.5$");
    JMenuItem spriteMenuItem = new JMenuItem("Sprite 2.5$");


    // menu items for meals
    JMenuItem spaghettiBologneseMenuItem = new JMenuItem("Spaghetti Bolognese 7$");
    JMenuItem chickenParmesanMenuItem = new JMenuItem("Chicken Parmesan 9.5$");
    JMenuItem rissottoMushroomsMenuItem = new JMenuItem("Risotto with Mushrooms 6.5$");


    // menu items for desserts
    JMenuItem tiramisuMenuItem = new JMenuItem("Tiramisu 5.5$");
    JMenuItem cannoliMenuItem = new JMenuItem("Cannoli 5$");
    JMenuItem pannaCottaMenuItem = new JMenuItem("Panna Cotta 4.5$");

    String[] drinksArray = {"Coke", "Water", "Sprite"};
    String[] mealsArray = {"Spaghetti Bolognese", "Chicken Parmesan", "Risotto with Mushrooms"};
    String[] dessertArray = {"Tiramisu", "Connoli", "Panna Cotta"};

    JList<String> drinkList = new JList<String>(drinksArray);
    JList<String> mealsList = new JList<String>(mealsArray);
    JList<String> dessertList = new JList<String>(dessertArray);

    JLabel infoLebel = new JLabel();

    public Question1() {
        Container contentPane = getContentPane();

        // background image
        JPanel parentPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load your background image
                ImageIcon backgroundImage = new ImageIcon("src/backItaly.png");
                Image img = backgroundImage.getImage();

                // Draw the background image
                g.drawImage(img, 0, 0, this);
            }
        };


        // Menu bar and menus
        JMenuBar menuBar = new JMenuBar();
        JMenu drinksMenu = new JMenu("Drinks");

        drinksMenu.add(cokeMenuItem);
        drinksMenu.add(waterMenuItem);
        drinksMenu.add(spriteMenuItem);

        // Setting the hot keys
        drinksMenu.setMnemonic(KeyEvent.VK_D);
        cokeMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.ALT_MASK));
        waterMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.ALT_MASK));
        spriteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.ALT_MASK));

        // Main meeal menu
        JMenu mainMealMenu = new JMenu("Main Meal");

        mainMealMenu.add(spaghettiBologneseMenuItem);
        mainMealMenu.add(chickenParmesanMenuItem);
        mainMealMenu.add(rissottoMushroomsMenuItem);

        mainMealMenu.setMnemonic(KeyEvent.VK_M);

        // Setting the hot keys
        spaghettiBologneseMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.ALT_MASK));
        chickenParmesanMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.ALT_MASK));
        rissottoMushroomsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.ALT_MASK));

        // Dessert menu
        JMenu dessertsMenu = new JMenu("Desserts");

        dessertsMenu.add(tiramisuMenuItem);
        dessertsMenu.add(cannoliMenuItem);
        dessertsMenu.add(pannaCottaMenuItem);

        dessertsMenu.setMnemonic(KeyEvent.VK_D);


        // Setting the hot keys
        tiramisuMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.ALT_MASK));
        cannoliMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.ALT_MASK));
        pannaCottaMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.ALT_MASK));


        menuBar.add(drinksMenu);
        menuBar.add(mainMealMenu);
        menuBar.add(dessertsMenu);


        // Text at the top
        JPanel topPanel = new JPanel();

        topPanel.setOpaque(false);

        JLabel instructions = new JLabel("Must-Eat Food Ordering");

        instructions.setForeground(new Color(67, 181, 129));
        instructions.setLayout(new FlowLayout(FlowLayout.TRAILING));
        Font niceFont = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 32);
        instructions.setFont(niceFont);
        topPanel.add(instructions);

        JPanel drinksPanel = new JPanel();
        drinksPanel.setOpaque(false); // Make it transparent

        drinksPanel.setLayout(new BoxLayout(drinksPanel, BoxLayout.X_AXIS));

        drinksPanel.add(drinksFirstLabel);
        drinksPanel.add(drinksSecondLabel);
        drinksPanel.add(drinksThirdLabel);

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        drinksFirstLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 20, 10)));
        drinksSecondLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 20, 10)));
        drinksThirdLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 20, 10)));

        drinksFirstLabel.setText(cokeCount + "x");
        drinksFirstLabel.setForeground(Color.WHITE);

        drinksSecondLabel.setText(waterCount + "x");
        drinksSecondLabel.setForeground(Color.WHITE);

        drinksThirdLabel.setText(spriteCount + "x");
        drinksThirdLabel.setForeground(Color.white);


        JPanel mainMealPanel = new JPanel();
        mainMealPanel.setOpaque(false); // Make it transparent

        mainMealPanel.setLayout(new BoxLayout(mainMealPanel, BoxLayout.X_AXIS));

        mainMealPanel.add(mealFirstLabel);
        mainMealPanel.add(mealSecondLabel);
        mainMealPanel.add(mealThirdLabel);

        mealFirstLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 20, 10)));
        mealSecondLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 20, 10)));
        mealThirdLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 20, 10)));

        mealFirstLabel.setText(spaghettiCount + "x");
        mealFirstLabel.setForeground(Color.WHITE);
        mealSecondLabel.setText(chickenCount + "x");
        mealSecondLabel.setForeground(Color.WHITE);
        mealThirdLabel.setText(risottoCount + "x");
        mealThirdLabel.setForeground(Color.WHITE);

        JPanel dessertPanel = new JPanel();
        dessertPanel.setOpaque(false);

        dessertPanel.setLayout(new BoxLayout(dessertPanel, BoxLayout.X_AXIS));

        dessertPanel.add(dessertFirstLabel);
        dessertPanel.add(dessertSecondLabel);
        dessertPanel.add(dessertThirdLabel);

        dessertFirstLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        dessertSecondLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        dessertThirdLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        dessertFirstLabel.setText(tiramisuCount + "x");
        dessertFirstLabel.setForeground(Color.WHITE);

        dessertSecondLabel.setText(cannoliCount + "x");
        dessertSecondLabel.setForeground(Color.WHITE);

        dessertThirdLabel.setText(pannacottaCount + "x");
        dessertThirdLabel.setForeground(Color.WHITE);

        // Set button listeners


        cokeMenuItem.addActionListener((ActionListener) this);
        spriteMenuItem.addActionListener((ActionListener) this);
        waterMenuItem.addActionListener((ActionListener) this);

        spaghettiBologneseMenuItem.addActionListener(this);
        chickenParmesanMenuItem.addActionListener(this);
        rissottoMushroomsMenuItem.addActionListener(this);

        tiramisuMenuItem.addActionListener(this);
        pannaCottaMenuItem.addActionListener(this);
        cannoliMenuItem.addActionListener(this);

        JPanel amountPanel = new JPanel();
        amountPanel.setOpaque(false);

        amount.setForeground(new Color(67, 181, 129));
        amount.setLayout(new FlowLayout(FlowLayout.TRAILING));
        amount.setFont(niceFont);
        amountPanel.add(amount);


        // Set BorderLayout for parentPanel
        parentPanel.setLayout(new BoxLayout(parentPanel, BoxLayout.Y_AXIS));

        parentPanel.add(topPanel, BorderLayout.PAGE_START);
        parentPanel.add(drinksPanel, BorderLayout.SOUTH);
        parentPanel.add(mainMealPanel, BorderLayout.SOUTH);
        parentPanel.add(dessertPanel, BorderLayout.SOUTH);
        parentPanel.add(amountPanel, BorderLayout.PAGE_END);


        JPanel bottomCenterPanel = new JPanel();
        bottomCenterPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomCenterPanel.setOpaque(false); // Make it transparent


        bottomCenterPanel.add(infoLebel);

        parentPanel.add(bottomCenterPanel, BorderLayout.CENTER);

        setJMenuBar(menuBar);
        setTitle("Italian Take Away");
        setSize(new Dimension(800, 1145));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Question1();

    }

//  If we click the menu item, our value will add the specific value of item ot other orderValue,
//  then we set an icon, update the amount and counts how many times we click at specific item,
//  and display it.

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cokeMenuItem){
            orderValue += cokeValue;
            drinksFirstLabel.setIcon(cokeIco);
            amount.setText("Amount: " + orderValue + " $");
            cokeCount++;
            drinksFirstLabel.setText(cokeCount + "x");
        } else if(e.getSource() == waterMenuItem){
            orderValue += waterValue;
            drinksSecondLabel.setIcon(waterIco);
            amount.setText("Amount: " + orderValue + " $");
            waterCount++;
            drinksSecondLabel.setText(waterCount + "x");
        } else if(e.getSource() == spriteMenuItem){
            orderValue += spriteValue;
            drinksThirdLabel.setIcon(spriteIco);
            amount.setText("Amount: " + orderValue + " $");
            spriteCount++;
            drinksThirdLabel.setText(spriteCount + "x");
        } else if(e.getSource() == spaghettiBologneseMenuItem){
            orderValue += spaghettiValue;
            mealFirstLabel.setIcon(spaghettiIco);
            amount.setText("Amount: " + orderValue + " $");
            spaghettiCount++;
            mealFirstLabel.setText(spaghettiCount + "x");
        } else if(e.getSource() == chickenParmesanMenuItem){
            orderValue += chickenValue;
            amount.setText("Amount: " + orderValue + " $");
            mealSecondLabel.setIcon(chickenIco);
            chickenCount++;
            mealSecondLabel.setText(chickenCount + "x");
        } else if(e.getSource() == rissottoMushroomsMenuItem){
            orderValue += risottoValue;
            amount.setText("Amount: " + orderValue + " $");
            mealThirdLabel.setIcon(risottoIco);
            risottoCount++;
            mealThirdLabel.setText(risottoCount + "x");

        } else if(e.getSource() == tiramisuMenuItem){
            orderValue += tiramisuValue;
            amount.setText("Amount: " + orderValue + " $");
            dessertFirstLabel.setIcon(tiramisuIco);
            tiramisuCount++;
            dessertFirstLabel.setText(tiramisuCount + "x");
        } else if(e.getSource() == cannoliMenuItem){
            orderValue += cannoliValue;
            amount.setText("Amount: " + orderValue + " $");
            dessertSecondLabel.setIcon(cannoliIco);
            cannoliCount++;
            dessertSecondLabel.setText(cannoliCount + "x");
        } else if(e.getSource() == pannaCottaMenuItem){
            orderValue += pannacottaValue;
            amount.setText("Amount: " + orderValue + " $");
            dessertThirdLabel.setIcon(pannacottaIco);
            pannacottaCount++;
            dessertThirdLabel.setText(pannacottaCount + "x");
        }
    }}