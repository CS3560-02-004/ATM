
import java.sql.ResultSet;

/*
 * Input card number to compare against database
 */
public class Login {
    final String SEARCH_CARD = "SELECT * FROM card where cardNumber = ";
    final String LOCK_CARD = "UPDATE card SET lockStatus = true WHERE cardNumber = ";

    private DatabaseConnection db;
    private String cardNumber;
    private int pin;
    private ResultSet rs;
    private int lockCounter;
    private boolean cardLock;

    public Login(String cardNumber) {
        this.cardNumber = cardNumber;
        pin = null;
        lockCounter = 0;
        db = new DatabaseConnection();
        rs = db.getQuery(String.format(searchCard + cardNumber));
        // do found cardNumber in database
        if (rs == null) {
            System.err.out("Card not found in database.");
        // found in database, load in necessary result
        } else {
            while (rs.next()) {
                pin = rs.getInt("fourDigitPin");
                cardLock = rs.getBoolean("lockStatus");
            }
        }

    }


    // Loop for pin input, if fail 3 times, lock the card
    private boolean loopPin() {
        boolean correctPIN = false;
        while (lockCounter < 4 && correctPIN == false) {
            correctPIN = pinVerification(pin);
            lockCounter++;
        }
        if (lockCounter = 3) {
            lockCard();
        }
        return correctPIN;
    }

    private boolean pinVerification(int pin) {
        boolean result = false;

        if (this.pin == pin) {
            result = true;
        }
        return result;
    }
    // Lock card
    private void lockCard() {
        rs = db.getQuery(String.format(LOCK_CARD + cardNumber));
    }
    private boolean isLocked() {
        return cardLock;
    }
}
