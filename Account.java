package ATM;
public abstract class Account {
    protected int accountID;
    protected String dateCreated;

    // Constructor
    public Account(int accountID, String dateCreated) {
        this.accountID = accountID;
        this.dateCreated = dateCreated;
    }

    // deposits funds into the account
    public void depositFunds(double amount) {

    }

    // withdraws funds from the account
    public void withdrawFunds(double amount) {

    }

    // transfers funds from this account to the other account
    public void transferFunds(Account toAccount) {

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