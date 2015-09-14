/**
 * 
 */
package jdbc;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.naming.spi.DirStateFactory.Result;

/**
 * @author SmPatel
 *
 */
public class JdbcSelectMainApp {

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

			ps= con.prepareStatement("Select FIRST_NAME,LAST_NAME,SALARY,EMPNO from EMPLOYEES WHERE GRADE=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
						
			//first(1) placeholder is replaced by 4 (Like in GRADE=? becomes GRADE=4) or one can use setstring method also but server will convert from string to var
			ps.setInt(1, 4);

			rs=ps.executeQuery();

			while(rs.next()){
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
			
			/*rs.beforeFirst();
			while(rs.next()){
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}*/

			/*rs.moveToInsertRow();
			rs.updateInt("EMPNO",1008);	
			rs.updateString(1,"Alan");
			rs.updateString(2,"hogard");
			rs.updateInt(3,60000);					
			rs.insertRow();	*/		
	
			
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
