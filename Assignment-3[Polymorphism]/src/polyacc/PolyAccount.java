package polyacc;


public class PolyAccount extends Account{

	//overriding displayDetails method of Account class for showing Saving/Current account balance
	public void displayDetails(int acc)
	{
		if(verifyAcc(acc))
		{
			System.out.println("Account Holder Name: " + this.getAcc_Hol_Name().toString());
			if (this.getAcc_Type().toString().equals("SA")){
				//System.out.println("Account Type: Saving");
				System.out.println("Saving Account Balance: " + this.getAcc_Balance());
			} else if(this.getAcc_Type().toString().equals("CA")){
				//System.out.println("Account Type: Current");
				System.out.println("Current Account Balance: " + this.getAcc_Balance());			
			}			
		}
		else
		{
			System.out.println("Please enter valid Account Number");
			System.exit(0);
		}
	}	

}
