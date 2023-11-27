package ATM;

public class CreditCard extends Card {
    private int zipCode;

    // Constructor
    public CreditCard(int cardNumber, String expirationDate, int ccvNumber, int zipCode) {
        super(cardNumber, expirationDate, ccvNumber);

        this.zipCode = zipCode;
    }

    // zipCode getter
    public int getZipCode() {
        return zipCode;
    }

    // zipCode setter
    public void setZipCode(int zip) {
        zipCode = zip;
    }
}