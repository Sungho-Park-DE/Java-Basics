public class MinimumBalanceAccount extends BankAccount{
    private int minimum;

    public void setMinimum(int minimum){
        this.minimum=minimum;

    }
    public int getMinimum(){
        return minimum;
    }

    @Override // methode overrride
    // @ anotation
    public boolean deposit(int amount) {
        if(getBalance()-amount<minimum){
            System.out.println("At least more then "+minimum);
            return false;
        }
        setBalance(getBalance()-amount);
        return true;
    }
}
