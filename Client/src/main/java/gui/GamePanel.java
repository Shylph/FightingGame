package gui;

import java.awt.*;

/**
 * Created by Kang SangHun on 2015-04-27.
 */
public class GamePanel extends Panel {

    private final Canvas gameCanvas;

    public GamePanel(Dimension size){
        setLayout(null);
        setSize(size);
        gameCanvas = new GameCanvas();
        gameCanvas.setSize(this.getSize());
        add(gameCanvas);
    }
}
