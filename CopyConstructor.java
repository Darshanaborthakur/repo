class Copy {
    int bid;
    String bname;

    Copy(int id, String name) {
        bid = id;
        bname = name;
    }

    Copy() {
    }

    void display() {
        System.out.println(bid + " " + bname);
    }
}

class CopyConstructor {
    public static void main(String args[]) {
        Copy c1 = new Copy(123, "ABC");
        Copy c2 = new Copy(122, "XYZ");
        c2.bid =c1.bid;
        c2.bname =c1.bname;
        c1.display();
        c2.display();
    }
}