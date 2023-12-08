import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Lab4Part3 extends JFrame implements ActionListener {

    JMenuItem localNewsMenuItem = new JMenuItem("Local News");
    JMenuItem interNewsMenuItem = new JMenuItem("International News");
    JMenuItem localWeatherMenuItem = new JMenuItem("Local Weather");
    JMenuItem interWeatherMenuItem = new JMenuItem("International Weather");
    JLabel newsLabel = new JLabel();
    JTextArea infoTextArea = new JTextArea(4,50);
    JScrollPane infoScrollPane = new JScrollPane(infoTextArea);

    public Lab4Part3() {
        Container contentPane = getContentPane();

        JMenuBar menuBar = new JMenuBar();

        JMenu newsMenu = new JMenu("News");
        newsMenu.add(localNewsMenuItem);
        newsMenu.add(interNewsMenuItem);

        // Set the mnemonic key (Alt + W)
        newsMenu.setMnemonic(KeyEvent.VK_N);

        // Set key Alt+L and Alt+I
        localNewsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.ALT_MASK));
        interNewsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.ALT_MASK));

        JMenu weatherMenu = new JMenu("Weather");
        weatherMenu.add(localWeatherMenuItem);
        weatherMenu.add(interWeatherMenuItem);

        // Set the mnemonic key (Alt + S)
        weatherMenu.setMnemonic(KeyEvent.VK_W);

        // Set key Alt+L and Alt+I
        localWeatherMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.ALT_MASK));
        interWeatherMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.ALT_MASK));

        localNewsMenuItem.addActionListener((ActionListener) this);
        interNewsMenuItem.addActionListener((ActionListener) this);
        localWeatherMenuItem.addActionListener((ActionListener) this);
        interWeatherMenuItem.addActionListener((ActionListener) this);


        infoTextArea.setLineWrap(true);

        menuBar.add(newsMenu);
        menuBar.add(weatherMenu);
        setJMenuBar(menuBar);

        JPanel parentPanel = new JPanel();

        JPanel imagePanel = new JPanel();
        imagePanel.add(newsLabel);

        JPanel textPanel = new JPanel();
        textPanel.add(infoScrollPane);
        infoTextArea.setVisible(false);
        infoScrollPane.setVisible(false);

        parentPanel.add(imagePanel);
        parentPanel.add(textPanel);

        setTitle("Lab4Part3");
        setSize(new Dimension(800, 800));
        setVisible(true);
        setResizable(false);
        contentPane.add(parentPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new Lab4Part3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        infoTextArea.setVisible(true);
        infoScrollPane.setVisible(true);
        if (e.getSource() == localNewsMenuItem) {
            Icon localNewsIco = new ImageIcon("src/localNews.jpg");
            newsLabel.setIcon(localNewsIco);
            infoTextArea.setText(
                      "Four men arrested after drugs and weapons seized in operation across four counties."
                    + "Gardaí have arrested four men after drugs and weapons were"
                    + " seized in an operation across several counties."
                    + "The Garda National Drugs and Organised Crime Bureau (GNDOCB) intercepted two vehicles"
                    + "shortly before 4pm in the Finglas area on Friday afternoon."
                    + "In addition to this, planned searches of addresses were conducted in Kilkenny, Waterford,"
                    + " Tallaght and Ashbourne."
                    + "Three Glock handguns, a replica handgun, 28.5 kilogrammes of cocaine"
                    + " (worth approximately €2 million) and 1 kilo of cannabis herb (worth approximately €20,000)"
                    + " were recovered.");
        } else if (e.getSource() == interNewsMenuItem) {
            Icon interNewsIco = new ImageIcon("src/interNews.jpg");
            newsLabel.setIcon(interNewsIco);
            infoTextArea.setText(
                    "Hamburg airport closed after armed man rammed vehicle through gate and fired into air"
                    + "Police said they had launched a 'major operation at the airport' with a large contingent"
                    + " of emergency services, adding: 'We are currently assuming a static hostage situation.'"
                    + "After firing the shots the man threw two burning bottles out of the vehicle,"
                    + "the spokesperson added.They also said a child was in the car."
                    + "Hamburg police tweeted to say the car is still on the apron of Hamburg airport."
                    + "We are currently assuming a custody dispute is the background to the operation."
                    + "The LKA negotiating group and psychologists are on site."
                    + "There is contact with the person in the vehicle.");
        } else if (e.getSource() == localWeatherMenuItem) {
            Icon localWeatherIco = new ImageIcon("src/localWeather.jpg");
            newsLabel.setIcon(localWeatherIco);
            infoTextArea.setText(
                    "This infrared satellite image measures the temperature or radiance of the ground"
                    + " and clouds. Light shades represent low temperatures and dark shades high temperatures"
                    + "This infrared satellite image measures the temperature or radiance of the ground"
                    + " and clouds. Light shades represent low temperatures and dark shades high temperatures"
                    + "This infrared satellite image measures the temperature or radiance of the ground"
                    + " and clouds. Light shades represent low temperatures and dark shades high temperatures"
                    + "This infrared satellite image measures the temperature or radiance of the ground"
                    + " and clouds. Light shades represent low temperatures and dark shades high temperatures");
        } else if (e.getSource() == interWeatherMenuItem){
            Icon interWeatherIco = new ImageIcon("src/interWeather.jpg");
            newsLabel.setIcon(interWeatherIco);
            infoTextArea.setText(
                    "This visible satellite image measures the sunlight reflected by the Earth’s surface and clouds."
                    + " Clouds and snow reflect a lot of light and are bright; the oceans absorb almost all incoming"
                    + " light and are dark; thin or low clouds and land have variable reflectivities or albedos and"
                    + " are varying shades of grey."
                    + "This visible satellite image measures the sunlight reflected by the Earth’s surface and clouds."
                    + " Clouds and snow reflect a lot of light and are bright; the oceans absorb almost all incoming"
                    + " light and are dark; thin or low clouds and land have variable reflectivities or albedos and"
                    + " are varying shades of grey.");
        }
    }
}
