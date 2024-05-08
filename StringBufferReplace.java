public class StringBufferReplace {
    public static void main(String args[]) {
        StringBufferDemo str = new StringBufferDemo("Hello World");
        str.replace(6, 11, "java");
        System.out.println(str);
    }
}