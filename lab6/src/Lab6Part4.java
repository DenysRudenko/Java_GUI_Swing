import javax.swing.*;
import java.awt.*;

public class Lab6Part4 extends JFrame {
    public Lab6Part4() {
        setTitle("Snowman");
        setSize(400, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawSnowman(g);
    }

    public void drawSnowman(Graphics g) {
        drawHead(g);
        drawBody(g);
        bottomDrawBody(g);
        drawLimbs(g);
        drawButtons(g);
    }

    public void drawHead(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(150, 58, 100, 100); // Head
        g.setColor(Color.BLACK);
        g.fillOval(165, 85, 15, 15); // Left eye
        g.fillOval(220, 85, 15, 15); // Right eye
        g.drawArc(180, 100, 40, 30, 180, 180); // Mouth
        g.setColor(Color.WHITE);
        g.fillOval(165, 85, 10, 10); // Left eye
        g.fillOval(220, 85, 10, 10); // Right eye
        g.setColor(Color.RED);

        // Coordinates for the carrot polygon
        int[] yPoints = {100, 130, 115};
        int[] xPoints = {200, 275, 200};

        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
    public void drawBody(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(125, 150, 150, 150); // Body
    }
    public void bottomDrawBody(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(110, 280, 180, 180); // Body
    }

    public void drawLimbs(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(83, 200, 133, 225); // Left arm
        g.drawLine(108,212,83,180);
        g.drawLine(108,212,83,190);
        g.drawLine(312, 200, 272, 225); // Right arm
        g.drawLine(292,212,312,205);
        g.drawLine(292,212,312,195);
    }

    public void drawButtons(Graphics g) {
        g.setColor(Color.BLACK);

        g.fillOval(193, 175, 10, 10);
        g.fillOval(193, 190, 10, 10);
        g.fillOval(193, 205, 10, 10);
        g.fillOval(193, 220, 10, 10);
        g.fillOval(193, 235, 10, 10);

        g.fillOval(193, 310, 10, 10);
        g.fillOval(193, 325, 10, 10);
        g.fillOval(193, 340, 10, 10);
        g.fillOval(193, 355, 10, 10);
        g.fillOval(193, 370, 10, 10);
        g.fillOval(193, 385, 10, 10);

    }

    public static void main(String[] args) {
        JFrame frame = new Lab6Part4();
    }
}
