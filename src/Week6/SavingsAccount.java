package Week6;

public class SavingsAccount extends BankAccount{
    //Notice this is no longer static
    private double interestRate = .1;

    public SavingsAccount(String owner, double interest) {
        super(owner);
        interestRate = interest;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount + (interestRate + getBalance()));
    }

    @Override
    public String toString() {
        String out = super.toString() + " with interest rate " + interestRate;
        return out;
    }

}
