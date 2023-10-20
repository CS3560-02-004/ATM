public class SavingsAccount extends Account {
    private double savingsBalance;
    private double interestRate;

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