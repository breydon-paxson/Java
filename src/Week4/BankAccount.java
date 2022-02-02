package Week4;

public class BankAccount {

    //Attributes
    private Person owner;
    private double balance;
    private int account;

    //constructor
    public BankAccount(Person owner, int account) {
        this.owner = owner;
        balance = 0;
        this.account = account;

    }


    //other methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficent funds");
        }
    }

    //Print
    public String toString() {

        return owner  + " has account " + account + " with balance " + balance;
    }


//    public static void main(String[] args) {
//        BankAccount suzyAcct = new BankAccount("Suzy", 1234);
//        System.out.println(suzyAcct);
//        suzyAcct.deposit(200);
//        System.out.println(suzyAcct);
//        suzyAcct.withdraw(100);
//        System.out.println(suzyAcct);
//    }
}


