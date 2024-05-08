class Book {
    int id;
    String name;
}

class BookDetails {
    public static void main(String args[]) {
        Book b1 = new Book();
        System.out.println("id==" + b1.id);
        System.out.println("Name==" + b1.name);
    }
}