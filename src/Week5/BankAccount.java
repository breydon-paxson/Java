package Week5;

public class BankAccount {

    //attributes
    private String owner;
    private int accountNum;
    private double balance;

    //constructor
    public BankAccount(String owner, int acct) {
        //this.owner = owner;
        //accountNum = nextId;
        //nextId++;
        //balance = 0;
        //this(owner,nextId++,0);
    }

    public BankAccount(String owner, int acct, double balance) {
        this.owner = owner;
        accountNum = acct;
        this.balance = balance;
    }


    //other methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }

//    public boolean equals(BankAccount otherAcct) {
//        if (owner.equals(otherAcct.owner) &&
//             accountNum == otherAcct.accountNum &&
//                balance == otherAcct.balance)
//        {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public boolean equals(BankAccount otherAcct) {
//         return owner.equals(otherAcct.owner) &&
//                accountNum == otherAcct.accountNum &&
//                balance == otherAcct.balance;
//    }

    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount otherAcct = (BankAccount) obj;
            return owner.equals(otherAcct.owner) &&
                    accountNum == otherAcct.accountNum &&
                    balance == otherAcct.balance;
        } else return false;
    }

    public BankAccount copy() {
        return new BankAccount(owner, accountNum, balance);
    }

    //public BankAccount copy() {
        //return new BankAccount(owner, accountNum, balance);
    //}

    //print methods
    public String toString() {
        String out = owner + " with account " + accountNum;
        out += " has balance " + balance;
        return out;
    }


}
