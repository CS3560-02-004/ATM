package ATM;
public abstract class Card {
    protected int cardNumber;
    protected String expirationDate;
    protected int ccvNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int number) {
        cardNumber = number;
    }
}