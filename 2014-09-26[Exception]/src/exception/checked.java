/**
 * 
 */
package exception;

import java.sql.SQLException;

/**
 * @author smpatel
 *
 */
class Test1{
	public void testing1() throws SQLException
	{
		testing2();
	}
	public void testing2() throws SQLException
	{
		testing3();
	}
	public void testing3() throws SQLException
	{
		testing4();
	}
	public void testing4() throws SQLException
	{
		throw new SQLException();
		
	}
}
public class checked {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		/*Class.forName("java.util.Date"); // ClassNotFoundException-checked exception
		Integer.parseInt("12");*/
		try{
		new Test1().testing1();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
