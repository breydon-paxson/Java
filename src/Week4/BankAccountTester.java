package Week4;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 1234);
        System.out.println(suzyAccount);
        suzyAccount.deposit(100);
        System.out.println(suzyAccount);
        suzyAccount.withdraw(10.10);
        System.out.println(suzyAccount);
    }
}
