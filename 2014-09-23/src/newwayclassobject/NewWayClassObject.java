/**
 * 
 */
package newwayclassobject;

import java.util.Date;

/**
 * @author smpatel
 *
 */
public class NewWayClassObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Date dt=(Date)Class.forName("java.util.Date").newInstance(); // another way of creating object of class other than new
			//Date dt=new Date(); //using new
			System.out.println(dt);
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
