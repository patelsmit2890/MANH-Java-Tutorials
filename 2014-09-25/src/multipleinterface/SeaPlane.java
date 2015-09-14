/**
 * 
 */
package multipleinterface;

/**
 * @author SmPatel
 *
 */
public class SeaPlane extends Airplane implements sailer{
	public void dock()
	{
		System.out.println("SeaPlane doc");
	}
	public void cruise(){
		System.out.println("SeaPlane cruise");
	}

}
