/**
 * 
 */
package multipleinterface1;

/**
 * @author SmPatel
 *
 */
public class AnotherClient implements Callback{

	// Implement Callback's interface
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squared is " + (p*p));
	}
}
