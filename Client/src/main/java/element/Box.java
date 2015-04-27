package element;

import math.Vector;

/**
 * Created by Kang SangHun on 2015-04-27.
 */
public class Box {
    public Vector position,v;
    private Vector width;
    public double rotation;

    public Box() {
    }


    public Box(Vector _position, Vector _width) {
        position = _position;
        width = _width;
        rotation = 0;
        v = new Vector(0, 0);
    }

    public Vector getWidth() {
        return width;
    }
}
