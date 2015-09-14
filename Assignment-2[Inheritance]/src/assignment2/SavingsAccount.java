/**
 * 
 */
package assignment2;

/**
 * @author SmPatel
 *
 */
public class SavingsAccount extends Account {
	
	double interestRate;	
	
	public void displayDetails(int acc) {
		if(acc==acc_Num)
		{
			System.out.println("Account Holder Name: " + this.acc_Hol_Name.toString());
			System.out.println("Interest: " + this.calculateMonthlyInterest(this.interestRate));
				
		}
		else
		{
			System.out.println("Please enter valid Account Number");
			System.exit(0);
		}
	}

	public double getInterestRate() {
		return interestRate;
	}	    
    public double calculateMonthlyInterest(double interest)
	{
    	if(interest>0)
		{
			this.interestRate = interest/100;
			double interestAdd = (acc_Balance*this.interestRate/12);
	    	this.acc_Balance += interestAdd;
	    	System.out.println("Interest rate is : "+interest);
	    	System.out.println("Monthly Interest is : "+interestAdd);
	    	System.out.println("Balance is : "+this.acc_Balance);
		}else
		{
			System.out.println("Please enter valid interest rate");
			System.exit(0);
		}
		return interest;	
		
	}    

}
