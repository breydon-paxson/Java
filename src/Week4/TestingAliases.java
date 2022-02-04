package week4;

public class TestingAliases {

    public static void main(String[] args) {
        String s1 = new String("Hi There");
        String s2 = new String("Hi There");
        //s2 += "here";
        String s3 = s1;
        System.out.println(s1 + " " + s2 + " " + s3);
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));


        BankAccount acct1 = new BankAccount("Tom", 123);
        BankAccount acct2 = new BankAccount("Tom", 123);
        BankAccount acct3 = acct1;

        System.out.println("acct1 == acct2: " + (acct1 == acct2));
        System.out.println("acct1 == acct3: " + (acct1 == acct3));
        System.out.println("acct1.equals(acct2)" + acct1.equals(acct2) );
        System.out.println("acct1.equals(acct3)" + acct1.equals(acct3) );
    }
}
