/**
 * 
 */
package ma.controllar;

import static ma.controllar.Provider.*;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author SmPatel
 *
 */
public class ConnectionProvider {

	private static Connection con=null;  
	static{  
		try{  
			//Class.forName(DRIVER); 
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
		}catch(Exception e){
			e.printStackTrace();
		}  
	}  

	public static Connection getCon(){  
		return con;  
	}  

}
