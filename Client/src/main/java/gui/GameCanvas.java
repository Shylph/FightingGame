package gui;

import element.Box;
import math.Vector;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameCanvas extends Canvas {
    public BufferStrategy strategy;
    private Box[] boxes;


    public void addBoxes(Box[] boxes) {
        this.boxes = boxes;
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        if (getBufferStrategy() == null) {
            createBufferStrategy(2);
            strategy = getBufferStrategy();
        }
        g = strategy.getDrawGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED);
        if (boxes != null)
            for (Box b : boxes) {
                drawBox(g, b);
            }

        strategy.show();
    }

    private void drawBox(Graphics g, Box b) {
        Vector[] v = b.getVertexPositions();
        g.drawLine((int) v[0].x, (int) v[0].y, (int) v[1].x, (int) v[1].y);
        g.drawLine((int) v[1].x, (int) v[1].y, (int) v[2].x, (int) v[2].y);
        g.drawLine((int) v[2].x, (int) v[2].y, (int) v[3].x, (int) v[3].y);
        g.drawLine((int) v[3].x, (int) v[3].y, (int) v[0].x, (int) v[0].y);
    }

}