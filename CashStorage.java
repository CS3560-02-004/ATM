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
	public int getCashAmount()
	public int getOneDollarQuantity()
	public int getFiveDollarQuantity()
	public int getTenDollarQuantity()
	public int getTwentyDollarQuantity()
	public int getFiftyDollarQuantity()
	public int gethundredDollarQuantity()


	// Setters --------------------------------------------------------

	// add certain number of each type of dollar denomination
	// the array parameter will be an int array of 6 elements
	//		- each element = number of denominations for a 
	//			specific type of denomination
	//						- ie: denominationArray[0] == num of 1 dollar bills
	//									and denominationArray[1] == num of 5 dollar bills
	public void addDenominations(int[] denominationArray)

	// remove certain number of each type of dollar denomination
	//		- uses same array concept as method above
	// return true if successful, return false if too many dollars being removed
	public boolean removeDenominations(int[] denominationArray)

	// first check to see if cashAmount >= withdrawAmount, return false if not true
	// check to see if a withdraw amount can be converted to cash given the number of denominations available
	// 	- return true if the withdraw amount can be converted to cash
	public boolean checkDenomination(int withdrawAmount)
}