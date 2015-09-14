/**
 * 
 */
package polymorphism;

/**
 * @author SmPatel
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr=new HR();
		Finance f=new Finance();
		Employee e=(Employee) hr.recruit("P");
		f.processSalary(e);
		e=(Employee) hr.recruit("I");
		f.processSalary(e);
		e=(Employee) hr.recruit("C");
		f.processSalary(e);

	}

}
