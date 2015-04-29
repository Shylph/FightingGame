package gui;


import element.Box;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GUIController {
    private Frame mainFrame;
    private GameCanvas gameCanvas;

    public GUIController() {
        prepareGUI();
        createCanvas();
    }

    public void repaint() {
        gameCanvas.repaint();
    }

    public void createCanvas(){
        gameCanvas = new GameCanvas();
        gameCanvas.setSize(getSize());
        mainFrame.add(gameCanvas);
    }

    public void addBoxes(Box[] boxes) {
        gameCanvas.addBoxes(boxes);
    }

    private void prepareGUI() {
        mainFrame = new Frame("GAME");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(null);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

    }
    public Dimension getSize(){
        return mainFrame.getSize();
    }

    public void showControl() {
        mainFrame.setVisible(true);
    }
}