/**
 * 
 */
package multipleinterface1;


/**
 * @author SmPatel
 *
 */
public class TestIfaceMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//---------Callback
		/*Callback c = new Client();
	    c.callback(42);*/
	    
		//---------AnotherClient
		Callback c = new Client();
	    AnotherClient ob = new AnotherClient();
	    c.callback(42);
	    c = ob; // c now refers to AnotherClient object
	    c.callback(42);
	}

}
abstract class Incomplete implements Callback {
	int a, b;
	void show() {
		System.out.println(a + " " + b);
	}
	// ...
}
