package Week4;

public class BankAcctTester {
    public static void main(String[] args) {
        Person tommy = new Person("Tommy", "111 111 1111", "222-222-2222");
        BankAccount acct = new BankAccount("Tommy", 567);
        System.out.println(acct);

        BankAccount suzyAcct = new BankAccount("Suzy", 2345, 100);
        System.out.println(suzyAcct);

        acct.deposit(1000);
        System.out.println(acct);
        //System.out.println(BankAccount.getNumberOfAccounts());
        //suzyAcct.balance += 1000;
        //System.out.println(suzyAcct.balance);
    }
}
