package Week6;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 1234);
        System.out.println(suzyAccount);
        suzyAccount.deposit(100);
//        suzyAccount.deposit(10);
//        System.out.println(suzyAccount);
//        suzyAccount.withdraw(10.10);
        System.out.println(suzyAccount);

        SavingsAccount tommyAccount = new SavingsAccount("Tommy", .15);
        System.out.println(tommyAccount);
        tommyAccount.deposit(10.10);
        tommyAccount.deposit(10);
        System.out.println(tommyAccount);

        BankAccount acct = new SavingsAccount("person", .09);
        acct.deposit(100);
        acct.withdraw(10);
        System.out.println(acct);

        //SavingsAccount savingsVar = new BankAccount("another");

    }
}
