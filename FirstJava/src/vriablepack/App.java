/**
 * 
 */
package vriablepack;

/**
 * @author smpatel
 *
 */
public class App {

	static int value;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Data1 dd=new Data1();
		dd.value=4;
		Data1 result=dd.d;
		System.out.println(result.value);*/
		
		
		//System.out.println(Data1.num);// 1
		//new Data1();
		
		try{
			Class.forName("vriablepack.Data1");// dynamically load --not require creating object
		}catch(ClassNotFoundException e){
			System.out.println(e.toString());
		}
	}

}
class Data1
{
	/*int value;
	Data1 d=this;*/
	static int num;
	static
	{
		System.out.println("wdw");
	}
}
 //this has local scope but its class scope and initialization is performed inside constructor