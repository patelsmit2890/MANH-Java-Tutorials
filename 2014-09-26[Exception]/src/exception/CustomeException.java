/**
 * 
 */
package exception;

/**
 * @author smpatel
 *
 */
class InvalidAgeException extends Exception{  
	/*InvalidAgeException(String s){  
		super(s);  
	}  */ //1
	public String getMessage()
	{
		return "You need to be 18 or above to register for voting";
	}//2
} 
class Voting{
	void register(int age) throws InvalidAgeException{
		if(age<18){
			//throw new InvalidAgeException("not valid"); //1
			throw new InvalidAgeException();//2
		}
		/*else
		{
			System.out.println("welcome to vote");  
		}*/

	}
}
public class CustomeException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
			new Voting().register(12);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
