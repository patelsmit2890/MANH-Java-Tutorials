/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment1.Account;

/**
 * @author SmPatel
 *
 */
public class TestAccount {

	/**
	 * Test method for {@link assignment1.Account#setDetails(int, java.lang.String, java.lang.String)}.
	 */
	//Tested using JUnit
	@Test
	public void testSetDetails() {
		int expResult=256121656;
		Account ac=new Account();
		ac.setDetails(256121656, "Alan", "SA");
		int actResult=(int) ac.getAcc_Num();
		assertEquals(expResult,actResult);//test pass
		//assertEquals(234513,actResult);//wrong input test fail
		
		String expResult1="Alan";
		String actResult1=(String)ac.getAcc_Hol_Name();
		assertEquals(expResult1,actResult1); //Test pass
		//assertEquals("Alan@",str); //wrong input test fail
		
		String expResult2="SA";
		String actResult2=(String)ac.getAcc_Type();
		assertEquals(expResult2,actResult2); //Test pass
		//assertEquals("SA@",str); //wrong input test fail
	}

	/**
	 * Test method for {@link assignment1.Account#depositAmount(int)}.
	 */
	@Test
	public void testDepositAmount() {
		int expResult=5000;
		Account ac=new Account();
		ac.setDetails(256121656, "Alan", "SA");
		ac.depositAmount(5000,256121656);
		int actResult=(int) ac.getAcc_Balance();
		assertEquals(expResult,actResult);//test pass
		//assertEquals(50000,i);//wrong input test fail
	}

	/**
	 * Test method for {@link assignment1.Account#withDrawAmount(int)}.
	 */
	@Test
	public void testWithDrawAmount() {
		int expResult=0;
		Account ac=new Account();
		ac.setDetails(256121656, "Alan", "SA");
		ac.depositAmount(5000,256121656);
		ac.withDrawAmount(5000,256121656);
		int actResult=(int) ac.getAcc_Balance();
		assertEquals(expResult,actResult);//test pass
		//assertEquals(1,i);//wrong input test fail
		
	}

	/**
	 * Test method for {@link assignment1.Account#displayDetails(int)}.
	 */
	

}
