package element;

import math.Vector;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Box {
    public Vector position, v;
    private Vector width;
    public double rotation;


    public Box(Vector _position, Vector _width) {
        position = _position;
        width = _width;
        rotation = 0;
        v = new Vector(0, 0);
    }

    public Vector getWidth() {
        return width;
    }


    public Vector[] getVertexPositions() {
        double x = width.x / 2.0;
        double y = width.y / 2.0;
        /*
        v1 - v2
		l    l
		v4 - v3
		*/
        Vector v1 = new Vector(-1 * x, -1 * y);
        Vector v2 = new Vector(x, -1 * y);
        Vector v3 = new Vector(x, y);
        Vector v4 = new Vector(-1 * x, y);
        Vector[] v = new Vector[]{v1, v2, v3, v4};
        double c = cos(rotation);
        double s = sin(rotation);

        Vector tv1 = new Vector(v[0].x * c + v[0].y * s, -1 * v[0].x * s + v[0].y * c);
        Vector tv2 = new Vector(v[1].x * c + v[1].y * s, -1 * v[1].x * s + v[1].y * c);
        Vector tv3 = new Vector(v[2].x * c + v[2].y * s, -1 * v[2].x * s + v[2].y * c);
        Vector tv4 = new Vector(v[3].x * c + v[3].y * s, -1 * v[3].x * s + v[3].y * c);
        return new Vector[]{Vector.add(tv1, position), Vector.add(tv2, position), Vector.add(tv3, position), Vector.add(tv4, position)};
    }
}