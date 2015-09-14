/**
 * 
 */
package nestedinterface;

/**
 * @author SmPatel
 *
 */
public class NestedIFDemoMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// use a nested interface reference
	    A.NestedIF nif = new B();

	    if(nif.isNotNegative(10))
	      System.out.println("10 is not negative");
	    if(nif.isNotNegative(-12))
	      System.out.println("this won't be displayed");
	}

}
