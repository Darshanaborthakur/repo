import java.util.*;

abstract class Shape{
    int a,b;
    Shape(int x,int y)
    {
        a=x;
        b=y;
    }
    abstract void area();
}

class Rectangle extends Shape{
    Rectangle(int x,int y)
    {
        super(x, y);
    }
    void area()
    {
        System.out.println("Area of the Rectangle==" +a*b);
    }
}
class Triangle extends Shape{
    Triangle(int x, int y)
    {
        super(x, y);
    }
    void area()
    {
        System.out.println("Area of the triangle==" + 0.5*a*b);
    }
}
class Abstract1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter triangle sides");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Triangle t=new Triangle(a, b);
        System.out.println("Enter rectangle sides");
        int c=sc.nextInt();
        int d=sc.nextInt();
        Rectangle r=new Rectangle(c,d);
        t.area();
        r.area();
    }
}