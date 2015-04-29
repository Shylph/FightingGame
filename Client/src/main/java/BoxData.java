import element.Box;
import math.Vector;

public class BoxData {
    private Box[] boxes;

    public BoxData() {
        boxes = new Box[]{
                new Box(new Vector(200, 158), new Vector(70, 100)),
                new Box(new Vector(150, 158), new Vector(40, 60)),
        };
    }

    public Box[] getBoxes() {
        return boxes;
    }
}
