package ATM;
public class CheckingAccount extends Account {
    private double checkingBalance;

    // Constructor
    public CheckingAccount(int accountID, String dateCreated, double checkingBalance) {
        super(accountID, dateCreated);

        this.checkingBalance = checkingBalance;
    }

    // checkingBalance getter
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // checkingBalance setter
    public void setCheckingBalance(double balance) {
        checkingBalance = balance;
    }
}