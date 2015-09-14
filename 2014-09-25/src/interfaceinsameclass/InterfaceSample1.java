/**
 * 
 */
package interfaceinsameclass;

/**
 * @author SmPatel
 *
 */
public class InterfaceSample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		// TODO Auto-generated method stub

		Airplane1 ap=new Airplane1();
		ap.takeOff();
	}

}
interface Flyer1{
	public void takeOff();
	public void land();
	public void fly();
}
class Airplane1 implements Flyer1 {
	public void takeOff() {
		System.out.println("Takeoff");

	}
	public void land() {
		System.out.println("Land");
	}
	public void fly() {
		System.out.println("Fly");
	}
}
