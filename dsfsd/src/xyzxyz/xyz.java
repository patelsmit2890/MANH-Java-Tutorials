package xyzxyz;


import org.junit.Test;

import xyz.sdfcds;

import junit.framework.TestCase;

public class xyz extends TestCase {

	@Test
	public void testSum() {
		int expResult=6;
		sdfcds ar=new sdfcds();
		int actResult=ar.sum(2, 4);
		assertEquals(expResult, actResult);
		
		//fail("Not yet implemented");
	}

}
