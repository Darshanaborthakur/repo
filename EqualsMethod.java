public class EqualsMethod {
    public static void main(String args[]) {
        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "JAVA";
        boolean b = str1.equals(str2);
        System.out.println(b);
        b = str2.equals(str3);
        System.out.println(b);
    }
}