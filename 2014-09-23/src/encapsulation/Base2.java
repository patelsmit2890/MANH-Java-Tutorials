/**
 * 
 */
package encapsulation;

/**
 * @author SmPatel
 *
 */
public class Base2 {
	public void test()
	{
		Base1 b1=new Base1();
		b1.def=1;
		b1.prof=2;//protected member can access without inheriting bcoz within same package
		b1.pubf=3;
	}
}
