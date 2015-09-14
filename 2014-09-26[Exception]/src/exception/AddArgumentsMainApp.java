/**
 * 
 */
package exception;

/**
 * @author smpatel
 *
 */
public class AddArgumentsMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try{
			int sum = 0;
			for ( String arg : args ) {
				sum += Integer.parseInt(arg);
			}
			System.out.println("Sum = " + sum);
		}
		catch (NumberFormatException nfe) {
			System.err.println("One of the command-line "
					+ "arguments is not an integer.");
		}*/
		try{
			System.out.println(args[0]);
			try{
				System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
			}
			catch(ArrayIndexOutOfBoundsException e){

			}
			System.out.println("End of try block");// will not execute when Arithmatic exception occurs
		}catch(ArrayIndexOutOfBoundsException e){
			//e.toString();
			System.out.println("ArrayoutofboundException: "+ e.toString());
		}
		catch(NumberFormatException e){
			//e.toString();
			System.out.println("NumberFormatException: "+ e.toString());
		}
		catch(ArithmeticException e){
			//e.toString();
			System.out.println("ArithmeticException: "+ e.toString());
		}catch(Exception e){
			//e.toString();
			System.out.println("Exception: "+ e.toString());
		}// default exception handler should be last bcoz it contains all exception
		finally{
			System.out.println("Finally");
		}
		System.out.println("End");

	}

}
