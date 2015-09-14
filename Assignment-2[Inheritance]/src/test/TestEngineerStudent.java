/**
 * 
 */
package test;

import assignment2.EngineeringStudent;

/**
 * @author SmPatel
 *
 */
public class TestEngineerStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EngineeringStudent es1=new EngineeringStudent();		
		es1.setDetails("12IT16F", "Alan", "IT", "Distributed Computing", 85.52, "Advanced DBMS", 80.45);
		es1.setBranchName("CS");
		
		if(es1.verifyRollNum("12IT16F")){			
			es1.display("12IT16F");			
			//es1.avgMarks("12IT16F");
			System.out.println("Percentage: "+es1.percent());
			
		}
		else{
			System.out.println("Invalid Data for student 1");
		}
	}

}
