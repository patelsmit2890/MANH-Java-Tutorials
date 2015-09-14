/**
 * 
 */
package test;

import customexception.InvalidNameException;

/**
 * @author SmPatel
 *
 */
public class TestCustomNameException {

	/**
	 * @param args
	 */

	//Static validate method for checking name and if name is not valid then throw InvalidNameException exception 
	static void validate(String name)throws InvalidNameException{

		if(name.matches("[A-Za-z]+"))  
			System.out.println(name+" is a valid name"); 
		else  
			throw new InvalidNameException(name+ " is not a valid name");  

	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Driver
		try{  
			validate("Alan");  //valid name
			validate("@Alan"); //not a valid name
		}catch(Exception m){
			
			System.out.println("Exception occured: "+m);
			System.err.println("\nException occured: "+m);
		}  
	}

}
