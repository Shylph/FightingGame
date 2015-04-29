import element.Box;
import gui.GUIController;
import java.util.Timer;
import java.util.TimerTask;

public class GameEngine {
    private GUIController guiController;
    private BoxData boxData;
    private Box[] boxes;

    public GameEngine() {
        guiController = new GUIController();
        boxData = new BoxData();
        boxes = boxData.getBoxes();
    }

    public void rotationTest() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                boxes[0].rotation += 0.01;
                boxes[1].rotation += 0.03;
                guiController.repaint();
            }
        }, 100, 10);
    }

    public void processs() {
        guiController.addBoxes(boxes);
        guiController.showControl();


        rotationTest();
    }
}
