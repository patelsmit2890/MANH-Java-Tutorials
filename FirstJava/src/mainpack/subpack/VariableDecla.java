/**
 * 
 */
package mainpack.subpack;

/**
 * @author smpatel
 *
 */
public class VariableDecla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//---------------1------------------------
		/*Data d1,d2; //stack
		d1=new Data();//heap
		
		d1.value=8;
		d2=d1;
		System.out.println(d2.value);
		d2.value=10;
		System.out.println(d1.value);*/
		//-----------1 end-----------------
		
		//------------------2-----------------
		Data d1,d2;		
		d1=new Data();
		d2=new Data();		
		d1.value=2;
		d2.value=4;
		
		Data.value=8;
		System.out.println(d1.value+"\t"+d2.value);
		System.out.println(1+'2'); //2 ascii value+1  ---char convert to int----- implicit casting;
		//-----------2 end-----------------

	}

}
class Data{
	//----------1----------
	//int value;
	
	//------------2----------
	static int value;
}

