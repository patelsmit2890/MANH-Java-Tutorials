/**
 * 
 */
package polyacc;

/**
 * @author SmPatel
 *
 */
public class PolyMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test driver one can provide different input and test
		PolyAccount pa=new PolyAccount();
		pa.setDetails(2535656, "Alan", "CA");
		pa.depositAmount(5000, 2535656);
		pa.displayDetails(2535656);
	}

}
