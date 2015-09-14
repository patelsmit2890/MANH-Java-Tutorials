/**
 * 
 */
package web;

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
public class RegisterDao {

	public static int register(User u){ 
		Connection con=null;
		PreparedStatement ps=null;
		int status=0;  
		try{  
			con=ConnectionProvider.getCon();  
			ps=con.prepareStatement("insert into employees (EMPNO,FIRST_NAME,LAST_NAME,Address) values(?,?,?,?)"); 
			ps.setString(1, u.getUemp());
			ps.setString(2, u.getUname());
			ps.setString(3,u.getUemail());
			ps.setString(4, u.getUpass());
			status=ps.executeUpdate();  
		}catch(Exception e){
			e.printStackTrace();
		}  
		finally{
			try {
				if(ps!=null && con!=null){					
					ps.close();
					con.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return status;  
	}  
}
