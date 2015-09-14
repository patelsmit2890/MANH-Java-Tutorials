/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment1.Student;

/**
 * @author SmPatel
 *
 */
public class TestStudent {

	/**
	 * Test method for {@link assignment1.Student#setDetails(java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, double)}.
	 */
	//Tested using JUnit
	@Test
	public void testSetDetails() {
		
		
		Student st=new Student();
		st.setDetails("12IT16F", "Alan", "IT", "Distributed Computing", 85.52, "Advanced DBMS", 80.45);
		
		String expResult="12IT16F";
		String actResult=(String) st.getRollNumber();
		assertEquals(expResult,actResult);//test pass
		//assertEquals("12IT",actResult);//wrong input test fail
		
		String expResult1="Alan";
		String actResult1=(String) st.getStudentName();
		assertEquals(expResult1,actResult1);//test pass
		//assertEquals("Alan@",actResult);//wrong input test fail
		
		double expResult2=85.52;
		double actResult2=(double) st.getScoreFirstSubject();
		int retval = Double.compare(expResult2, actResult2);//This method returns the value 0 if expResult2 is numerically equal to actResult2
		assertEquals(0, retval);//test pass
		//assertEquals(1,retval);//wrong input test fail
		
	}

	/**
	 * Test method for {@link assignment1.Student#avgMarks(java.lang.String)}.
	 */
	@Test
	public void testAvgMarks() {
		Student st=new Student();
		st.setDetails("12IT16F", "Alan", "IT", "Distributed Computing", 85.52, "Advanced DBMS", 80.45);
		double expResult=82.985;
		double actResult=(double) st.avgMarks("12IT16F");
		int retval = Double.compare(expResult, actResult);//This method returns the value 0 if expResult is numerically equal to actResult
		assertEquals(0, retval);//test pass
		//assertEquals(1,retval);//wrong input test fail
	}
	
}
