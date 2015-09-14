/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author SmPatel
 *
 */
public class JdbcUpdateMainApp {

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
			String sql="UPDATE EMPLOYEES SET FIRST_NAME=?,LAST_NAME=?,ADDRESS=?,GRADE=?,SALARY=?,SECTIONNO=? where EMPNO=?";
			ps= con.prepareStatement(sql);			
			ps.setString(1,"Satvikkumar");
			ps.setString(2, "Shetyy");
			ps.setString(3, "RSSSansthaa");
			ps.setInt(4, 4);
			ps.setInt(5, 60000);
			ps.setInt(6, 1);			
			ps.setInt(7, 2048);
			int rows=ps.executeUpdate();
			System.out.println("No. of rows Updated Succefully: "+rows);

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
