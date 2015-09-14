/**
 * 
 */
package comparator;

import java.util.*;

/**
 * @author SmPatel
 *
 */
public class OwnComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Animal> list = new ArrayList<Animal>();

	      list.add(new Animal("Leopard",35));
	      list.add(new Animal("crocodile",100));
	      list.add(new Animal("Tiger",40));
	      list.add(new Animal("Lion",45));
	      list.add(new Animal("Monkey",15));
	      
	      Collections.sort(list);

	      for(Animal a: list)
	         System.out.print(a.getAnimalName() + ", ");

	      
	      Collections.sort(list, new Animal());
	      System.out.println(" ");
	      for(Animal a: list)
	         System.out.print(a.getAnimalName() +"  : "+
			 a.getAnimalAge() + ", ");
	}

}
