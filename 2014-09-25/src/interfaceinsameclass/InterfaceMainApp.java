/**
 * 
 */
package interfaceinsameclass;

/**
 * @author SmPatel
 *
 */
public class InterfaceMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 obj = new A6();
		obj.print();
	}

}
interface printable{//interface helps to implement behaviour protocol
	int num=5;
	void print();
}
class A6 implements printable{
	public void print(){
		System.out.println("Hello");
	}
}


