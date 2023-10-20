package ATM;
public class CheckingAccount extends Account {
    private double checkingBalance;

    // checkingBalance getter
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // checkingBalance setter
    public void setCheckingBalance(double balance) {
        checkingBalance = balance;
    }
}