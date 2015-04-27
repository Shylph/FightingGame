package gui;

import element.Box;
import math.Vector;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class GameCanvas extends Canvas {
    public BufferStrategy strategy;
    private Box box;

    public GameCanvas() {
        box = new Box(new Vector(200,158),new Vector(70,100));
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                box.rotation += 0.01;
                repaint();
            }
        }, 100, 10);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        if(getBufferStrategy() == null){
            createBufferStrategy(2);
            strategy = getBufferStrategy();
        }
        g = strategy.getDrawGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.RED);
        drawBox(g, box);
        strategy.show();
    }

    private void drawBox(Graphics g, Box b) {
        Vector width = b.getWidth();
        double x = width.y / 2.0;
        double y = width.x / 2.0;
        double c = cos(b.rotation);
        double s = sin(b.rotation);
    /*
    v1 - v2
	l     l
	v4 - v3
	*/
        Vector v1 = new Vector(-1 * x, -1 * y);
        Vector v2 = new Vector(x, -1 * y);
        Vector v3 = new Vector(x, y);
        Vector v4 = new Vector(-1 * x, y);

        Vector tv1 = new Vector(v1.x * c + v1.y * s, -1 * v1.x * s + v1.y * c);
        Vector tv2 = new Vector(v2.x * c + v2.y * s, -1 * v2.x * s + v2.y * c);
        Vector tv3 = new Vector(v3.x * c + v3.y * s, -1 * v3.x * s + v3.y * c);
        Vector tv4 = new Vector(v4.x * c + v4.y * s, -1 * v4.x * s + v4.y * c);

        drawLine(g,Vector.add(tv1, b.position), Vector.add(tv2, b.position));
        drawLine(g,Vector.add(tv2, b.position), Vector.add(tv3, b.position));
        drawLine(g,Vector.add(tv3, b.position), Vector.add(tv4, b.position));
        drawLine(g,Vector.add(tv4, b.position), Vector.add(tv1, b.position));
    }
    private void drawLine(Graphics g,Vector v1, Vector v2){
        g.drawLine((int) v1.x, (int) v1.y, (int) v2.x, (int) v2.y);
    }

}