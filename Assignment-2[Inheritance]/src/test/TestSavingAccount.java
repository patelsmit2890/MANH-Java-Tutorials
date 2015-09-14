/**
 * 
 */
package test;

import assignment2.SavingsAccount;

/**
 * @author SmPatel
 *
 */
public class TestSavingAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount s1;
    	s1=new SavingsAccount();
    	s1.setDetails(235698,"Alan","SA"); 	
		
		if(s1.getAcc_Num()!=235698){
			System.out.println("Invalid data for 1st Transaction!");
		}
		else{
			s1.depositAmount(5000,235698);
			s1.calculateMonthlyInterest(10);//calculate monthly interest by providing interest rate as argument
			//s1.withDrawAmount(1200,235698);
			//s1.withDrawAmount(52200);//wrong input			
		}
	}

}
