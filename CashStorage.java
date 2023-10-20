public class CashStorage extends ATM
{
	private int cashAmount;
	private int oneDollarQuantity;
	private int fiveDollarQuantity;
	private int tenDollarQuantity;
	private int twentyDollarQuantity;
	private int fiftyDollarQuantity;
	private int hundredDollarQuantity;

	// CashStorage constructor that also contains constructor values for ATM super class
	public CashStorage(int atmID, String branchName, int, cashAmount, int oneDollarQuantity, int fiveDollarQuantity, int tenDollarQuantity, 
											int twentyDollarQuantity, int fiftyDollarQuantity, int hundredDollarQuantity)

	// Getters -----------------------------------------------
	public int getOneDollarQuantity()
	public int getFiveDollarQuantity()
	public int getTenDollarQuantity()
	public int getTwentyDollarQuantity()
	public int getFiftyDollarQuantity()
	public int gethundredDollarQuantity()


	// Setters --------------------------------------------------------

	// add certain number of a type of dollar denomination
	public void addDenomination(int denominationValue, int amount)

	// remove certain number of a type of dollar denomination
	// return true if successful, return false if too many dollars being removed
	public boolean removeDenomination(int denominationValue, int amount)

	// check to see if a withdraw amount can be converted to cash given the number of denominations available
	// return true if the withdraw amount can be converted to cash
	public boolean checkDenomination(int withdraw)
}