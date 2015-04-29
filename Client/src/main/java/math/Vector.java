package math;

import static java.lang.Math.sqrt;

public class Vector {
    public double x, y;

    public Vector() {
        x = 0;
        y = 0;
    }


    public Vector(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double length() {
        return sqrt(x * x + y * y);
    }

    public void normalize() {
        double l = length();
        x = x / l;
        y = y / l;
    }

    public void add(Vector v) {
        x += v.x;
        y += v.y;
    }

    public static Vector add(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y);
    }

    public static double dot(Vector a, Vector b) {
        return a.x * b.x + a.y * b.y;
    }
}
