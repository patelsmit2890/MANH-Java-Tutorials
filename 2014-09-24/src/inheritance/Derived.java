package inheritance;

public class Derived extends Base {

	@Override
	/*public void test() {
		// TODO Auto-generated method stub
		super.test();
	}// overriden by IDE source option
*/	
	public void test(){
		
		
	}
	public Derived(int i){
		super(i);
		System.out.println("Derived");
		}
}
