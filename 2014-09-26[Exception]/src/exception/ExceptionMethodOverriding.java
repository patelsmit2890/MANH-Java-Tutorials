/**
 * 
 */
package exception;

import java.sql.SQLException;

import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;

/**
 * @author smpatel
 *
 */
///----------------1--------------------
/*class Base{
	public void test() throws SQLException {
		
	}
}
class Derived extends Base{
	public void test() throws SQLException{
		
	}
	
}*/
///----------------2--------------------
/*class Base{
	public void test() throws SAXNotRecognizedException {
		
	}
}
class Derived extends Base{
	public void test() throws SAXException{// not allowed bcoz SAXException is base and SAXNotRecognizedException is derived
		
	}
	
}*/
///----------------3--------------------
class Base{
	public void test() throws SAXException {
		
	}
}
class Derived extends Base{
	public void test() throws SAXNotRecognizedException{// allowed bcoz SAXException is base and SAXNotRecognizedException is derived
		
	}
	
}

public class ExceptionMethodOverriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
