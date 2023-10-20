package ATM;
public abstract class Card {
    protected int cardNumber;
    protected int withdrawAmount; 
    protected String expirationDate;
    protected int ccvNumber;

    // constructor
    public Card(int cardNumber, String expirationDate, int ccvNumber) {
        this.cardNumber = cardNumber;
        this.withdrawAmount = 0;
        this.expirationDate = expirationDate;
        this.ccvNumber = ccvNumber;
    }

    // authenticates the given card, via PIN for debit cards or automatically for credit cards
    public void authenticateCard(Card card) {

    }

    // cardNumber getter
    public int getCardNumber() {
        return cardNumber;
    }

    // cardNumber setter
    public void setCardNumber(int number) {
        cardNumber = number;
    }

    // Increment how much has been withdrawn from the card in one day
    public void incrementWithdrawAmount(int withdrawAmount)

    // Reset withdraw amount at the end of the day
    public void resetWithdrawAmount()

    // expirationDate getter
    public String getExpirationDate() {
        return expirationDate;
    }

    // expirationDate setter
    public void setExpirationDate(String date) {
        expirationDate = date;
    }

    // ccvNumber getter
    public int getCCVNumber() {
        return ccvNumber;
    }

    // ccvNumber setter
    public void setCCVNumber(int number) {
        ccvNumber = number;
    }
}
