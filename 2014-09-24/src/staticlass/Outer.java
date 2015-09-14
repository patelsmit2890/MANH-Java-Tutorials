package staticlass;

public class Outer {
	
	/*public class Inner{

	}//1----------inner class usage restricted with outer class only
	 */
	public static class Inner{

	}//2----------inner class can be use outside outer class with static keyword
}
class Test{
	//1-----------Inner in; //can't use here-innerclass

	Outer.Inner in;//2-----------------with the use of import
}