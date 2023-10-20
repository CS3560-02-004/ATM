package ATM;
public class CreditAccount extends Account {
    private double creditLimit;
    private double creditUsed;

    // creditLimit getter
    public double getCreditLimit() {
        return creditLimit;
    }

    // creditLimit setter
    public void setCreditLimit(double limit) {
        creditLimit = limit;
    }

    // creditUsed getter
    public double getCreditUsed() {
        return creditUsed;
    }

    // creditUsed setter
    public void setCreditUsed(double credit) {
        creditUsed = credit;
    }
}