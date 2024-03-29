import java.util.ArrayList;

public class BankDriver {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        MinimumBalanceAccount mba = new MinimumBalanceAccount();
        SavingsAccount sa = new SavingsAccount();
        ba.deposit(1000);
        mba.deposit(1000);
        sa.deposit(1000);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(ba);
        accounts.add(mba);
        accounts.add(sa);

        for (BankAccount account : accounts) {
            account.deposit(1000);
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            }
        }

//        BankAccount sa2 = new SavingsAccount();
//        BankAccount sa3 = sa;
//
//        sa.addInterest();
//        ((SavingsAccount) sa3).addInterest();
    }
}