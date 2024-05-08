public class StringCompare {
    public static void main(String args[]) {
       
        String s1 = "NERIST";
        String s2 = "NIRJULI";
        String  s3="ABCXYZ";
        int a=s1.compareTo(s2);
        System.out.println(a);
        a=s1.compareTo(s3);
        System.out.println(a);
        a=s2.compareTo(s1);
        System.out.println(a);
    }
}