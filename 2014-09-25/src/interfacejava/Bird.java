/**
 * 
 */
package interfacejava;

/**
 * @author SmPatel
 *
 */
public class Bird extends Animal implements Flyer{

	public void takeOff() {
		System.out.println("Bird Takeoff");

	}
	public void land() {
		System.out.println("Bird Land");
	}
	public void fly() {
		System.out.println("Bird Fly");
	}
	public void buildNest() {
		System.out.println("Bird buildNest");

	}
	public void layEggs() {
		System.out.println("Bird layEggs");
	}
	public void eat()
	{
		System.out.println("Bird eat");
	}
	
}
