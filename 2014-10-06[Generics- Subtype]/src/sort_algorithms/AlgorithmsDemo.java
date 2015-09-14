/**
 * 
 */
package sort_algorithms;

import java.util.*;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author SmPatel
 *
 */
public class AlgorithmsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll= new LinkedList<Integer>();
		
		ll.add(-8);
		ll.add(8);
		ll.add(20);
		ll.add(-20);
		
		//create a reverse order comparator		
		Comparator<Integer> r=Collections.reverseOrder();
		
		//sort list by using comparator
		Collections.sort(ll, r);
		System.out.println("List sorted in reverse");
		for(int i:ll)
			System.out.print(i +" ");
		
		System.out.println();
		
		//shuffle list
		Collections.shuffle(ll);
		System.out.println("Shuffled List ");
		for(int i:ll)
			System.out.print(i +" ");
		
		System.out.println();
		
		System.out.println("Min in List: "+Collections.min(ll));
		System.out.println("Max in List: "+Collections.max(ll));
		
		 ArrayList<Integer> al=new ArrayList<Integer>();  
		  al.add(2);  
		  al.add(3);  
		  al.add(9);  
		  al.add(7);  
		  
		  Comparator<Integer> r1=Collections.reverseOrder();
		  Collections.sort(al, r1);
			System.out.println("ArrayList sorted in reverse");
			for(int i:al)
				System.out.print(i +" ");
	}

}
