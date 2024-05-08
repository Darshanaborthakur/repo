class BookConstructor {
    int srollno;
    String sname;

    BookConstructor(int rollno, String name) {
        srollno = rollno;
        sname = name;
    }

    void display() {
        System.out.println(srollno + " " + sname);
    }
}

class BookConstructorDemo {
    public static void main(String args[]) {
        BookConstructor b1 = new BookConstructor(123, "ABC");
        BookConstructor b2 = new BookConstructor(222, "XYZ");
        b1.display();
        b2.display();
    }
}