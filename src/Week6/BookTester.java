package Week6;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 20.20, "JK Rawlings");
        System.out.println(book1);
        book1.priceChange(10.10);
        System.out.println(book1.returnPrice());

        Textbook txtbook1 = new Textbook("Big Java", 150, "Cayman", "Computer Science");
        System.out.println(txtbook1);
        txtbook1.addResources("www.book.com");
        System.out.println(txtbook1);

        Book test = txtbook1;
        test.doSomething();

    }
}
