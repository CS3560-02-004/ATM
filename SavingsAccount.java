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
}