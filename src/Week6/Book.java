package Week6;

public class Book {
    //attributes
    private String title;
    private double price;
    private String author;

    //constructor
    public Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    //method
    public double returnPrice() {
        return price;
    }

    public void doSomething() {
        System.out.println("In Book");
    }

    public void priceChange(double newPrice) {
        this.price = newPrice;
    }

    //print
    public String toString() {
        return title + " by " + author + " costs " + price;
    }
}
