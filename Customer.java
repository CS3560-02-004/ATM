package ATM;
public class Customer {
    private int customerID;
    private String customerName;
    private int phoneNumber;
    private String emailAddress;
    private String billingAddress;

    // Customer constructor
    public Customer(int customerID, String customerName, int phoneNumber, String emailAddress, String billingAddress) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.billingAddress = billingAddress;
    }

    // insertCard takes a Card as a parameter an inserts it into the ATM based on the cards type
    public void insertCard(Card card) {
        
    }

    // customer id getter
    public int getCustomerID() {
        return customerID;
    }

    // customer id setter
    public void setCustomerID(int id) {
        customerID = id;
    }

    // customer name getter
    public String getCustomerName() {
        return customerName;
    }

    // customer name setter
    public void setCustomerName(String name) {
        customerName = name;
    }

    // phone number getter
    public int getPhoneNumber() {
        return phoneNumber;
    }

    // phone number setter
    public void setPhoneNumber(int number) {
        phoneNumber = number;
    }

    // email getter
    public String getEmailAddress() {
        return emailAddress;
    }

    // email setter
    public void setEmailAddress(String email) {
        emailAddress = email;
    }

    // billing address getter
    public String getBillingAddress() {
        return billingAddress;
    }

    // email address setter
    public void setBillingAddress(String address) {
        billingAddress = address;
    }
}