package assignment1;

public class Account {

	private long acc_Num;
	private String acc_Hol_Name;
	private String acc_Type;
	private double acc_Balance;
	/**
	 * @return the acc_Num
	 */
	public long getAcc_Num() {
		return acc_Num;
	}
	/**
	 * @return the acc_Hol_Name
	 */
	public String getAcc_Hol_Name() {
		return acc_Hol_Name;
	}

	/**
	 * @return the acc_Type
	 */
	public String getAcc_Type() {
		return acc_Type;
	}	

	/**
	 * @return the acc_Balance
	 */
	public double getAcc_Balance() {
		return acc_Balance;
	}

	//setDetails method for setting values
	public void setDetails(int acc_Num, String acc_Hol_Name, String acc_Type) {
		try {
			this.acc_Num = acc_Num;	        
		} catch (NumberFormatException e) {
			//error
			System.out.println("Error, not a number. Please try again.");
			System.exit(0);
		}		

		if(acc_Hol_Name.matches("[A-Za-z]+"))
		{
			this.acc_Hol_Name = acc_Hol_Name;

		}else
		{
			System.out.println("Please enter valid Name. Only Alphabets Allowed.");
			System.exit(0);
		}


		if(acc_Type.toString()=="SA"||acc_Type.toString()=="CA"){
			this.acc_Type = acc_Type;
		}else{
			System.out.println("Please enter SA for Saving and CA for current");
			System.exit(0);
		}		

	}

	//depositAmount method for deposit amount in account
	public void depositAmount(int deposit,int acc) {
		if(acc==acc_Num)
		{
			try{
				if(deposit>0){
					acc_Balance += deposit;
					System.out.println("Deposited Money is: "+deposit);
				}else{
					System.out.println("Please Enter Deposit Amount greate than 0");
					System.exit(0);
				}
			}catch(NumberFormatException e){
				System.out.println("Error, not a valid number. Please try again.");			
			}
		}
		else
		{
			System.out.println("Please enter valid Account Number");
			System.exit(0);
		}
	}

	//withDrawAmount method for withdraw amount from account
	public void withDrawAmount(int withdraw,int acc) {
		if(verifyAcc(acc))
		{
			try{
				if (verifyBal(withdraw)) {
					acc_Balance -= withdraw;
					System.out.println("Withdraw Money is: "+withdraw);			
				} else {
					System.out.println("balance is less than specified amount. Please specify less amount.");
					System.exit(0);			
				}
			}catch(NumberFormatException e){
				System.out.println("Error, not a valid number. Please try again.");			
			}
		}else
		{
			System.out.println("Please enter valid Account Number");
			System.exit(0);
		}

	}

	//displayDetails method for displaying details
	public void displayDetails(int acc) {
		if(verifyAcc(acc))
		{
			System.out.println("Account Holder Name: " + acc_Hol_Name.toString());		

			if (acc_Type.toString().equals("SA")){
				System.out.println("Account Type: Saving");
			} else if(acc_Type.toString().equals("CA")){
				System.out.println("Account Type: Current");
			}
			else{
				System.out.println("Enter Correct Account Type");
				System.exit(0);
			}

			System.out.println("Account Balance: " + acc_Balance);
		}
		else
		{
			System.out.println("Please enter valid Account Number");
			System.exit(0);
		}
	}
	//Additional method foe checking account number
	public boolean verifyAcc(int acc)
	{
		if(acc==acc_Num)
		{
			return true;
		}else{
			return false;
		}
	}
	
	//Additional method foe verifying balance
	public boolean verifyBal(int withDraw)
	{
		if(acc_Balance >= withDraw)
		{
			return true;
		}else{
			return false;
		}
	}

	public static void main(String args[]) {

		//Test driver and use TestAccount[using JUnit] for testing purpose
		Account ac=new Account();
		ac.setDetails(247285285, "Smit", "SA");
		ac.displayDetails(247285285);
		ac.depositAmount(5000,247285285);
		ac.withDrawAmount(5000,247285285);

	}
}
