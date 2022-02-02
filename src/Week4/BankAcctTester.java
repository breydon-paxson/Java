package Week4;

public class BankAcctTester {
    public static void main(String[] args) {
        Person tommy = new Person("Tommy", "111 111 1111", "222-222-2222");
        BankAccount acct = new BankAccount(tommy, 567);
        System.out.println(acct);
    }
}
