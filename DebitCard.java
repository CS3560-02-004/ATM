package ATM;
public class DebitCard extends Card {
    private int pin;

    // Constructor
    public DebitCard(int cardNumber, String expirationDate, int ccvNumber, int pin) {
        super(cardNumber, expirationDate, ccvNumber);

        this.pin = pin;
    }

    // pin getter
    public int getPin() {
        return pin;
    }

    // pin setter
    public void setPin(int pin) {
        this.pin = pin;
    }
}