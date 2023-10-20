package ATM;
public class DebitCard extends Card {
    private int pin;

    // Constructor
    public DebitCard(int cardNumber, String expirationDate, int ccvNumber, int pin) {
        super(cardNumber, expirationDate, ccvNumber);

        this.pin = pin;
    }

    // returns true if the pin is valid, false otherwise
    public boolean verifyPIN(int attemptedPIN) {
        return true;
    }

    // displays the transaction window
    private void displayTransactionWindow(){

    }

    // notifies the user of an invalid pin
    private void notifyInvalidPIN() {

    }

    // notifies the user of an invalid card
    private void displayCardInvalidity() {

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