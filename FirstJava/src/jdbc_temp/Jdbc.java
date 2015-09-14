/**
 * 
 */
package jdbc_temp;

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
public class Jdbc {

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

			con=DriverManager.getConnection("jdbc:oracle:thin:@smit:1521:xe","hr","hr");

			String str="Select * from test";			
			ps= con.prepareStatement(str,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+" : "+rs.getString(2));
			}		
			
			/*ps= con.prepareStatement("insert into test (USERNAME,PASSWORD) values (?,?)");			
			ps.setString(1,"Student");
			ps.setString(2, "student123");			
			ps.executeUpdate();
			System.out.println("Inserted Succefully");*/

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(rs!=null && ps!=null && con!=null){
					rs.close();
					ps.close();
					con.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
