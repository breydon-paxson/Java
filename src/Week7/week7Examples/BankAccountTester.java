package Week7.week7Examples;

import java.util.Arrays;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 1234);
//        System.out.println(suzyAccount);
//        suzyAccount.deposit(100);
//        suzyAccount.deposit(10);
//        System.out.println(suzyAccount);
//        suzyAccount.withdraw(10.10);
       // System.out.println(suzyAccount);
        BankAccount[] accts = {new BankAccount("Timmy", 1235, 100),
                               new BankAccount("Suzy Q", 4567,1000),
                               suzyAccount};
        System.out.println(Arrays.toString(accts));
        Arrays.sort(accts);
        System.out.println(Arrays.toString(accts));



    }
}
