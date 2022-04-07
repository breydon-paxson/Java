package Week11.Homework;

public class Book {

    //instance variables
    private String title;
    private String author;
    private int numberOfCopies;

    //constructor
    public Book(String title, String author, int number) {
        this.title = title;
        this.author = author;
        numberOfCopies = number;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return (title.equals(other.title) &&
                    author.equals(other.author) &&
                    numberOfCopies == other.numberOfCopies);

        } else return false;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 7;
        int h = 7;
        h = h + title.hashCode() * HASH_MULTIPLIER;
        h = h + author.hashCode() * HASH_MULTIPLIER;
        h += Integer.valueOf(numberOfCopies).hashCode() * HASH_MULTIPLIER;

        return h;
    }




    public void updateCopies (int additionalCopies) {
        numberOfCopies += additionalCopies;
    }

    public String toString() {
        return title + " by " + author + " has copies of " + numberOfCopies;
    }
}
