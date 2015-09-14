/**
 * 
 */
package set;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/**
 * @author SmPatel
 *
 */
class Process1{

	public static Map<Integer,String> getResult() {

		HashMap<Integer,String> result=new HashMap<Integer,String>();
		result.put(100,"Smit");
		result.put(101,"Ravi");
		result.put(102,"Satvik");
		result.put(103,"Maulik");
		result.put(100,"Piyush");
		return result;

	}
}
public class MapClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> mp=Process1.getResult();

		/*for(Map.Entry m:mp.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		} */
		
		Set set = mp.entrySet();	      
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}


	}

}
