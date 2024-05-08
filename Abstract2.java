import java.util.*;

abstract class ShapeTest {
    double a;
    double b;

    ShapeTest(double x, double y) {
        a = x;
        b = y;
    }

    abstract void area();
}

class RectangleTest extends Shape {
    RectangleTest(double x, double y) {
        super(x, y);
    }

    void area() {
        System.out.println("Area of Rectangle==" + a * b);
    }
}

class TriangleTest extends Shape {
    TriangleTest(double x, double y) {
        super(x, y);
    }

    void area() {
        System.out.println("Area of the triangle==" + 0.5 * a * b);
    }
}

class CircleTest extends Shape {
    CircleTest(double x, double y) {
        super(x, y);
    }

    void area() {
        System.out.println("Area of the circle==" + a * b * b);
    }
}

class Abstract2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rectangle sides");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        RectangleTest r = new RectangleTest(a, b);
        System.out.println("Enter Triangle sides");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        TriangleTest t = new TriangleTest(c, d);

        double e = sc.nextDouble();
        double f = sc.nextDouble();
        CircleTest l=new CircleTest(e, f);
        r.area();
        t.area();
        l.area();

    }
}