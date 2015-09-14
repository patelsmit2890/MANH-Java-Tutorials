/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author SmPatel
 *
 */
public class JdbcDeleteMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			con=DriverManager.getConnection("jdbc:oracle:thin:@MA-INDIA238:1522:ORA11GIN","MARKDEV","MARKDEV");
			ps= con.prepareStatement("Delete EMPLOYEES where EMPNO=?");			
			ps.setInt(1,225);			
			ps.executeUpdate();
			System.out.println("Deleetd Succefully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(rs!=null && ps!=null && con!=null){					
					ps.close();
					con.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
