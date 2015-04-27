package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIController {
    private Frame mainFrame;

    public GUIController() {
        prepareGUI();
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

        Panel gamePanel = new GamePanel(mainFrame.getSize());
        mainFrame.add(gamePanel);
    }

    public void showControl() {
        mainFrame.setVisible(true);
    }
}