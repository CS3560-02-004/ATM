package ATM;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cs3560.atm_project.DatabaseConnection;
import com.cs3560.atm_project.LoginGUI;

public class SavingsAccount extends Account {
    private double savingsBalance;
    private double interestRate;
    private final String GET_SAVING_BALANCE = "SELECT * FROM saving WHERE accountID = ";
    private DatabaseConnection db;
    private ResultSet rs;
    
    // Constructor
    // Took out param String dateCreated, double savingsBalance, double interestRate
    public SavingsAccount(int accountID) {
        super(accountID);
        
        // Establishing connection to database
        db = new DatabaseConnection();
        rs = db.getQuery(String.format(GET_SAVING_BALANCE + accountID));
        
        try {
            if (rs.next() == false) {
                System.out.println("AccountID not found");
            } 
            else {
                do {
                    savingsBalance = rs.getDouble("savingBalance");
                } while (rs.next());
            }
        } 
        catch (SQLException ex) {
        	// Error accessing database
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // savingsBalance getter
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // savingsBalance setter
    public void setSavingsBalance(double balance) {
        savingsBalance = balance;
    }

    // interestRate getter
    public double getInterestRate() {
        return interestRate;
    }

    // interestRate setter
    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Transfer money to another account
    // Take in the amount of money that is requested to be transfered,
    //    and take in the accountNumber that the money is being transferred to
    // Return true if the transfer is successful, false if not.
    // Method should ensure transferAmount is within the balance the sender account
    public boolean transferFunds(double transferAmount, int accountNumber) {
    	// if transferAmt is negative or zero
    	if (transferAmount <= 0) {
    		System.out.println("Invalid transfer amount.");
    		return false;
    	}
    	// if transferAmt is over the current savingsBalance
    	if (transferAmount > savingsBalance) {
    		System.out.println("Insufficient funds for transfer.");
    		return false;
    	}
    	// if transferAmt is valid
    	else {
            try {
                // Update the sender's balance
                savingsBalance -= transferAmount;
                String query1 = String.format("UPDATE saving SET savingBalance -= %f WHERE accountID = %d", transferAmount, super.getAccountID());
                db.executeUpdate(query1);

                // Update the recipient's balance, goes straight to their checking acc
                // Up to receiving user's discretion to distribute funds across accounts
                String query2 = String.format("UPDATE checking SET checkingBalance += %f WHERE accountID = %d", transferAmount, accountNumber);
                db.executeUpdate(query2);
                
                // Transfer successful
                return true;
            } 
            catch (Exception e) {
                // Transfer failed due to a database error
                e.printStackTrace();
                return false;
            }
    	}
    }
}
