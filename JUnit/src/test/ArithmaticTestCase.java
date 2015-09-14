/**
 * 
 */
package test;

import math.Arithmatic;
import junit.framework.TestCase;

/**
 * @author smpatel
 *
 */
public class ArithmaticTestCase extends TestCase {

	/**
	 * Test method for {@link math.Arithmatic#sum(int, int)}.
	 */
	public void testSum() {
		int expResult=6;
		Arithmatic ar=new Arithmatic();
		int actResult=ar.sum(2, 4);
		assertEquals(expResult, actResult);
		
		//fail("Not yet implemented");
	}

}
