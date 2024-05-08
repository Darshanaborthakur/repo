import java.util.*;
public class StaticBlock{
    static int j=10;
    static int n;

    static{
        System.out.println("Static block initialized");
        n=j*8;
    }
    public static void main(String args[])
    {
        System.out.println("Inside main method");
        System.out.println("value of j:" +j);
        System.out.println("value of n:"+n);
    }
}