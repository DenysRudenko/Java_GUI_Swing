import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Lab5Part4 extends JFrame implements ActionListener {

    JPanel countriesPanel = buildCountriesPanel(),
            hobbiesPanel = buildHobbiesPanel(),
            displayPanel = new JPanel();

    JMenuItem countriesMenuItem = new JMenuItem("Countries Panel");
    JMenuItem hobbiesMenuItem = new JMenuItem("Hobbies Panel");
    JButton switchButton = new JButton("Switch");
    String activeCardName;

    public Lab5Part4() {
        Container contentPane = getContentPane();

        JMenuBar menuBar = new JMenuBar();

        JMenu viewMenu = new JMenu("View");
        viewMenu.add(countriesMenuItem);
        viewMenu.add(hobbiesMenuItem);

        viewMenu.setMnemonic(KeyEvent.VK_V);
        countriesMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
        hobbiesMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));

        switchButton.addActionListener((ActionListener) this);
        countriesMenuItem.addActionListener((ActionListener) this);
        hobbiesMenuItem.addActionListener((ActionListener) this);

        menuBar.add(viewMenu);

        setJMenuBar(menuBar);

        setTitle("Lab5Part4");
        setSize(new Dimension(800, 450));
        setVisible(true);
        setResizable(false);

        displayPanel.setLayout(new CardLayout());
        displayPanel.add(countriesPanel, "CountriesPanel");
        displayPanel.add(hobbiesPanel, "HobbiesPanel");
        activeCardName = "CountriesPanel";


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(displayPanel, BorderLayout.CENTER);
        mainPanel.add(switchButton, BorderLayout.SOUTH);

        contentPane.add(mainPanel);
    }

    public JPanel buildCountriesPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel card1Label = new JLabel();
        card1Label.setText("Countries");
        card1Label.setHorizontalAlignment(JLabel.CENTER);

        Icon imageIcoIreland = new ImageIcon("src/ireland.png");
        Icon imageIcoItaly = new ImageIcon("src/italy.png");
        Icon imageIcoUkraine = new ImageIcon("src/ukraine.png");
        Icon imageIcoAustria = new ImageIcon("src/asutria.png");

        JLabel firstLabel = new JLabel(imageIcoIreland);
        JLabel secondLabel = new JLabel(imageIcoItaly);
        JLabel thirdLabel = new JLabel(imageIcoUkraine);
        JLabel fourthLabel = new JLabel(imageIcoAustria);

        JPanel imagePanel = new JPanel();

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        firstLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        secondLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        thirdLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        fourthLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        JPanel descriptionPanel = new JPanel();
        JTextArea description = new JTextArea(9,60);

        description.setText(
                "Ukraine, with its rich history and diverse landscapes, offers a unique blend of cultural heritage,"
                        + " from the vibrant cities like Kyiv to the picturesque Carpathian Mountains."
                        + "Austria, known for its classical music heritage and stunning Alpine scenery,"
                        + " captivates visitors with its imperial architecture in Vienna, charming villages in the Alps,"
                        + " and the cultural richness of cities like Salzburg."
                        + "Ireland, famed for its friendly locals and lush green landscapes, invites travelers"
                        + " to explore its ancient castles, enjoy traditional music in cozy pubs, and marvel at the"
                        + " dramatic cliffs along the Wild Atlantic Way."
                        + "Italy, a cradle of art, history, and exquisite cuisine, enchants visitors with iconic"
                        + " landmarks like the Colosseum in Rome, the romantic canals of Venice, and the artistic"
                        + " treasures of Florence.");

        JScrollPane scrollPane = new JScrollPane(description);
        description.setLineWrap(true);
//        description.setColumns(60);
        descriptionPanel.add(scrollPane);

        imagePanel.add(firstLabel);
        imagePanel.add(secondLabel);
        imagePanel.add(thirdLabel);
        imagePanel.add(fourthLabel);

        panel.add(card1Label, BorderLayout.PAGE_START);
        panel.add(imagePanel, BorderLayout.CENTER);
        panel.add(descriptionPanel, BorderLayout.SOUTH);


        return panel;
    }

    public JPanel buildHobbiesPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel card1Label = new JLabel();
        card1Label.setText("Countries");
        card1Label.setHorizontalAlignment(JLabel.CENTER);

        Icon imageIcoPiano = new ImageIcon("src/piano.png");
        Icon imageIcoTravel = new ImageIcon("src/travel.png");
        Icon imageIcoIt = new ImageIcon("src/it.png");
        Icon imageIcoDrawing = new ImageIcon("src/drawing.png");

        JLabel firstLabel = new JLabel(imageIcoPiano);
        JLabel secondLabel = new JLabel(imageIcoTravel);
        JLabel thirdLabel = new JLabel(imageIcoIt);
        JLabel fourthLabel = new JLabel(imageIcoDrawing);

        JPanel imagePanel = new JPanel();

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        firstLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        secondLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        thirdLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        fourthLabel.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        JPanel descriptionPanel = new JPanel();
        JTextArea description = new JTextArea(9,60);

        description.setText(
                "Playing the piano is not just a hobby; it's a passion that allows me to express emotions through the beautiful language of music."
                        + "Drawing is my creative outlet, where I can bring imagination to life on paper, capturing moments and ideas with strokes of a pencil or brush."
                        + "Programming is both my profession and a source of fascination, as I enjoy the art of crafting solutions and building innovative applications."
                        + "Traveling is my escape and a constant source of inspiration, providing opportunities to explore diverse cultures, taste new cuisines, and create lasting memories around the world."
                      );

        JScrollPane scrollPane = new JScrollPane(description);
        description.setLineWrap(true);

        descriptionPanel.add(scrollPane);

        imagePanel.add(firstLabel);
        imagePanel.add(secondLabel);
        imagePanel.add(thirdLabel);
        imagePanel.add(fourthLabel);

        panel.add(card1Label, BorderLayout.PAGE_START);
        panel.add(imagePanel, BorderLayout.CENTER);
        panel.add(descriptionPanel, BorderLayout.SOUTH);

        return panel;
    }

    public static void main(String[] args) {
        JFrame frame = new Lab5Part4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout card = (CardLayout) displayPanel.getLayout();

        if (e.getSource() == countriesMenuItem) {
            card.show(displayPanel, "CountriesPanel");
            activeCardName = "CountriesPanel";
        } else if (e.getSource() == hobbiesMenuItem) {
            card.show(displayPanel, "HobbiesPanel");
            activeCardName = "HobbiesPanel";
        } else if (e.getSource() == switchButton){
            if (activeCardName.equals("CountriesPanel")){
                card.show(displayPanel, "HobbiesPanel");
                activeCardName = "HobbiesPanel";
            } else {
                card.show(displayPanel, "CountriesPanel");
                activeCardName = "CountriesPanel";
            }
        }
}}