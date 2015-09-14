/**
 * 
 */
package jdbcmetadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.postgresql.PGResultSetMetaData;

/**
 * @author SmPatel
 *
 */
public class ResultsetMataData {

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

			ps= con.prepareStatement("Select FIRST_NAME,LAST_NAME,SALARY,EMPNO from EMPLOYEES WHERE GRADE=?");

			//first(1) placeholder is replaced by 4 (Like in GRADE=? becomes GRADE=4) or one can use setstring method also but server will convert from string to var
			ps.setInt(1, 4);

			rs=ps.executeQuery();

			/*while(rs.next()){
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}	*/		

			/*ps=con.prepareStatement("select * from Employees");
			rs = ps.executeQuery();			
			PGResultSetMetaData meta = (PGResultSetMetaData)rs.getMetaData(); 
			String tableName = meta.getBaseTableName(1);					
			System.out.println("Table Name: "+tableName);*/ //not working

			ResultSetMetaData rsmd=(ResultSetMetaData)rs.getMetaData();
			
			System.out.println("Table Name: "+rsmd.getTableName(1));

			System.out.println("Column 1 Type: "+rsmd.getColumnTypeName(1));
			
			int cnt=rsmd.getColumnCount();			
			System.out.println("number of columns: "+cnt);

			String str;
			for(int i=1;i<=cnt;i++)
			{
				str=rsmd.getColumnLabel(i);
				System.out.println(i+" column name: "+str);				
			}	
			


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
