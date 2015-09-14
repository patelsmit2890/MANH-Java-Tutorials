/**
 * 
 */
package multipleinterface;

/**
 * @author SmPatel
 *
 */
public class RiverBarge extends Vehicle implements sailer {
	public void dock()
	{
		System.out.println("RiverBarge doc");
	}
	public void cruise(){
		System.out.println("RiverBarge cruise");
	}
}
