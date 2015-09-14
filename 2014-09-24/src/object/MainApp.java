/**
 * 
 */
package object;

/**
 * @author SmPatel
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point();
		Point p2=new Point();
		
		p1.setX(2);
		p1.setY(4);
		
		p2.setX(2);
		p2.setY(4);
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		System.out.println("x="+p1.getX()+" y= "+p1.getY());
		System.out.println("x="+p2.getX()+" y= "+p2.getY());
		
		System.out.println(p1.equals(p2));// important to understand
		
	}

}
