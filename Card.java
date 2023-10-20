package ATM;
public abstract class Card {
    protected int cardNumber;
    protected String expirationDate;
    protected int ccvNumber;

    // cardNumber getter
    public int getCardNumber() {
        return cardNumber;
    }

    // cardNumber setter
    public void setCardNumber(int number) {
        cardNumber = number;
    }

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