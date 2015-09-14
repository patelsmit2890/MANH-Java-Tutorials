/**
 * 
 */
package list;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import data.Point;



/**
 * @author SmPatel
 *
 */
class Process{
	
	public static Collection<Integer> getResult() {
		
		Vector<Integer> result=new Vector<Integer>();
		result.add(4);
		result.add(2);
		result.add(9);
		result.add(8);
		result.add(6);
		return result;
		
	}
}
public class LinkedListCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> result=new HashSet<Integer>();
		
		result.add(4);
		result.add(2);
		result.add(9);
		result.add(8);
		result.add(6);
		
		Iterator<Integer> it=result.iterator();
		Integer i;
		while(it.hasNext())
		{		i=(Integer)it.next();	
			System.out.println(i);
		}
		
		/*for(Integer l:result){
			System.out.println(l);
		}*/
		
		Collection<Integer> col=Process.getResult();
		Iterator<Integer> it1=col.iterator();
		Integer j;
		while(it1.hasNext())
		{		j=(Integer)it1.next();	
			System.out.println(j);
		}

	}

}
