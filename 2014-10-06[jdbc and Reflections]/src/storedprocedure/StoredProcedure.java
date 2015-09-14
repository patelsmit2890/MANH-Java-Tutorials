/**
 * 
 */
package storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author SmPatel
 *
 */
public class StoredProcedure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		//PreparedStatement ps=null;	
		//ResultSet rs=null;
		CallableStatement cs = null;

		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			con=DriverManager.getConnection("jdbc:oracle:thin:@MA-INDIA238:1522:ORA11GIN","MARKDEV","MARKDEV");

			cs=con.prepareCall("{call alanwil(?,?,?,?)}");
			cs.setInt(1, 1548);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
			cs.registerOutParameter(4, java.sql.Types.VARCHAR);

			//boolean rs1=cs.execute();	
			cs.execute();
			System.out.println(cs.getString(2)+ ": "+cs.getString(3)+": "+cs.getString(4));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(con!=null){
					con.close();
					cs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
