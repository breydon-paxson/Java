package Week3;

public class BankAccount {
    //Attributes
    private String owner;
    private double balance;
    private int account;

    //Constructor
    public BankAccount(String name, int account) {
        owner = name;
        balance = 0;
        this.account = account;
    }

    //Other methods
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
        } else
        {
            System.out.println("Insufficent funds");
        }

    }

    //Print
    public String toString() {
        return owner + " has account " + account + " with balance " + balance;
    }

    public static void main(String[] args) {
        BankAccount suzyAcct = new BankAccount("Suzy", 1234);
        System.out.println(suzyAcct);
        suzyAcct.deposit(200);
        System.out.println(suzyAcct);
        suzyAcct.withdraw(100);
        System.out.println(suzyAcct);
    }
}
