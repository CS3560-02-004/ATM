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

    // Transfer money to another account
    // Take in the amount of money that is requested to be transfered,
    //    and take in the accountNumber that the money is being transferred to
    // Return true if the transfer is successful, false if not.
    // Method should ensure transferAmount is within the balance the sender account
    public boolean transferFunds(double transferAmount, int accountNumber)
}
