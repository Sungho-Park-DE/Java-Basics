public class SavingsAccount extends BankAccount {
    private double interest;

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void addInterest() {
        setBalance((int) (getBalance() * (1 + interest)));
    }
}
