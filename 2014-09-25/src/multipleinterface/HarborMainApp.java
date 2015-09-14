/**
 * 
 */
package multipleinterface;

/**
 * @author SmPatel
 *
 */
public class HarborMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HarborMainApp bostonHarbor = new HarborMainApp();
		RiverBarge barge = new RiverBarge();
		SeaPlane sPlane = new SeaPlane();
		bostonHarbor.givePermissionToDock(barge);
		bostonHarbor.givePermissionToDock(sPlane);
	}
	private void givePermissionToDock(sailer s) {
		s.dock();
	}
}
