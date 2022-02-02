package week1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        int number;
        number = 1;
        System.out.println("the number is " + number);
        char myCharacter = 'c' ;
        String myStr = "This is a string.";

        System.out.print("hi this is a string ");
        System.out.println("here is another");

        String name;	// Declare variable
        name = "Bob";	// Initialize variable
        System.out.println("Hello, " + name + "!");
        name = "What about " + name + "?";
        // Don't declare variables more than once.
        System.out.println(name);

        System.out.println(2 + 3 + "a");
        System.out.println(2 + "a" + 3);
        System.out.println("a" + 2 + 3);
        System.out.println("a" + (2 + 3));

        int number_1 = 4;
        System.out.println("My favorite number is " + number_1 + ".");
        int x = 2;
        System.out.println("x = " + x);
        System.out.println("x as double = " + (double) x);

        int a = 1;
        int y = 2;
        int z = 3;
        System.out.println("double average = " + (a + y + z)/3);
    }
}
