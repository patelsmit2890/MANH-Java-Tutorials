/**
 * 
 */
package assertion;

/**
 * @author smpatel
 *
 */
class Arithmatic1{
	public int sum(int num1,int num2){
		return num1*num2;
	}
}
public class AssertionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assert new Arithmatic1().sum(2,4)==6:"Not Valid";
	}

}
