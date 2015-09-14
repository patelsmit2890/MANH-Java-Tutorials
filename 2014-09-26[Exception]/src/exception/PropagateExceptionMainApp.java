/**
 * 
 */
package exception;


/**
 * @author smpatel
 *
 */
public class PropagateExceptionMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println(args[0]);
		new Test().testing(args[0], args[1]);
		}catch(ArithmeticException e){
			//propagating `exception to caller place when will give 1 0 as argument it will not catch in testing method but it will catch here
			System.out.println("ArithmeticException: "+ e.toString());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+ e.toString());
		}
	}

}
class Test{
	public void testing(String arg1,String arg2)
	{
		try{			
			System.out.println(Integer.parseInt(arg1)/Integer.parseInt(arg2));
			}
		catch(ArrayIndexOutOfBoundsException e){
			//e.toString();
			System.out.println("ArrayoutofboundException: "+ e.toString());
		}
		catch(NumberFormatException e){
			//e.toString();
			System.out.println("NumberFormatException: "+ e.toString());
		}		
	}
}
