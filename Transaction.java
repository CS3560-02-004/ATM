package ATM;
public class Transaction {
    private int transactionID;
    private String transactionDate;
    private String transactionType;
    private String transactionStatus;

    // Constructor
    public Transaction(int transactionID, String transactionDate, String transactionType, String transactionStatus) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
    }

    // transactionID getter
    public int getTransactionID() {
        return transactionID;
    }

    // transactionID setter
    public void setTransactionID(int id) {
        transactionID = id;
    }

    // transactionDate getter
    public String getTransactionDate() {
        return transactionDate;
    }

    // transactionDate setter
    public void setTransactionDate(String date) {
        transactionDate = date;
    }

    // transactionType getter
    public String getTransactionType() {
        return transactionType;
    }

    // transactionType setter
    public void setTransactionType(String type) {
        transactionType = type;
    }

    // transactionStatus getter
    public String getTransactionStatus() {
        return transactionStatus;
    }

    // transactionStatus setter
    public void setTransactionStatus(String status) {
        transactionStatus = status;
    }
}