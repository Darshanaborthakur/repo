public class EqualsOperator{
    public static void main(String args[])
    {
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        boolean b=(str1==str2);
        System.out.println(b);
        b=(str2==str3);
        System.out.println(b);
    }
}