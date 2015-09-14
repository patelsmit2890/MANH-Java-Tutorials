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
public class JdbcInsertMainApp {

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
			ps= con.prepareStatement("insert into employees (EMPNO,FIRST_NAME,LAST_NAME,ADDRESS,GRADE,SALARY,SECTIONNO,DATE_JOINED) values (?,?,?,?,?,?,?,?)");
			ps.setInt(1, 2048);
			ps.setString(2,"Satvik");
			ps.setString(3, "Shety");
			ps.setString(4, "RSS");
			ps.setInt(5, 4);
			ps.setInt(6, 40000);
			ps.setInt(7, 1);
			Date date= new Date(2014, 10, 8);
			ps.setDate(8,date);
			ps.executeUpdate();
			System.out.println("Inserted Succefully");
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
