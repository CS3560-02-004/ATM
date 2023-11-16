package ATM;
public class ATM
{
	// ATM Attributes ------------------------------
	private int atmID;
	private String branchName;

	// ATM constructor ------------------------------
	public ATM(int atmID, String branchName) {
		this.atmID = atmID;
		this.branchName = branchName;
	}

	// ATM getters ------------------------------
	public int getAtmID() {
		return atmID;
	}
	public String getBranchName() {
		return branchName;
	}

	// ATM setters ------------------------------

	// set value of AtmID
	// return true if parameter is allowed, false if not
	public boolean setAtmID(int atmID)

	// set name of branchName
	public void setBranchName(String branchName)
}
