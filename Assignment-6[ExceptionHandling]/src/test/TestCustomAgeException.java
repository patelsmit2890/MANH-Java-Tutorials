/**
 * 
 */
package test;

import customexception.InvalidAgeException;

/**
 * @author SmPatel
 *
 */
public class TestCustomAgeException {

	/**
	 * @param args
	 */

	//Static validate method for checking age and if age is not valid then throw InvalidAgeException exception 
	static void validate(int age)throws InvalidAgeException{

		if(age>0 && age<=110)  
			System.out.println(age+ " is a valid age"); 
		else  
			throw new InvalidAgeException(age +" is not a valid age");  

	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Driver
		try{  
			validate(25);  //valid age
			validate(111);  //not a valid age
		}catch(Exception m){

			System.out.println("Exception occured: "+m);
			System.err.println("\nException occured: "+m);
		}  


	}

}
