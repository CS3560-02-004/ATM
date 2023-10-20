package ATM;
public abstract class Account {
    protected int accountID;
    protected String dateCreated;

    // Constructor
    public Account(int accountID, String dateCreated) {
        this.accountID = accountID;
        this.dateCreated = dateCreated;
    }

    // accountID getter
    public int getAccountID() {
        return accountID;
    }

    // accountID setter
    public void setAccountID(int id) {
        accountID = id;
    }

    // dateCreated getter
    public String getDateCreated() {
        return dateCreated;
    }

    // dateCreated setter
    public void setDateCreated(String date) {
        dateCreated = date;
    }
}