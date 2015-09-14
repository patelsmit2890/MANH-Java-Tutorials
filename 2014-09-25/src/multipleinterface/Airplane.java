package multipleinterface;

public class Airplane extends Vehicle implements Flyer{
	public void takeOff() {
		System.out.println("Airplane Takeoff");

	}
	public void land() {
		System.out.println("Airplane Land");
	}
	public void fly() {
		System.out.println("Airplane Fly");
	}

}
