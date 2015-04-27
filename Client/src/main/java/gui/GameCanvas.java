package gui;

import java.awt.*;
import java.awt.geom.Line2D;

public class GameCanvas extends Canvas {

    public GameCanvas() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.drawRect(12, 12, 325, 4565);
        g2.draw(new Line2D.Double(0, 0, 60, 100));
    }

}