package ATM;
public class SavingsAccount extends Account {
    private double savingsBalance;
    private double interestRate;

    // Constructor
    public SavingsAccount(int accountID, String dateCreated, double savingsBalance, double interestRate) {
        super(accountID, dateCreated);

        this.savingsBalance = savingsBalance;
        this.interestRate = interestRate;
    }

    // savingsBalance getter
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // savingsBalance setter
    public void setSavingsBalance(double balance) {
        savingsBalance = balance;
    }

    // interestRate getter
    public double getInterestRate() {
        return interestRate;
    }

    // interestRate setter
    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Transfer money to another account
    // Take in the amount of money that is requested to be transfered,
    //    and take in the accountNumber that the money is being transferred to
    // Return true if the transfer is successful, false if not.
    // Method should ensure transferAmount is within the balance the sender account
    public boolean transferFunds(double transferAmount, int accountNumber)
}
