/**
 * 
 */
package interfacejava;

/**
 * @author SmPatel
 *
 */
public class AirportMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirportMainApp metropolisAirport = new AirportMainApp();
		Helicopter copter = new Helicopter();
		SeaPlane sPlane = new SeaPlane();
		metropolisAirport.givePermissionToLand(copter);
		metropolisAirport.givePermissionToLand(sPlane);
	}
	private void givePermissionToLand(Flyer f) {
		f.land();
	}
}
