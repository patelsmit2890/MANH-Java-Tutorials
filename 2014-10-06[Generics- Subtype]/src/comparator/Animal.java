/**
 * 
 */
package comparator;

import java.util.Comparator;

/**
 * @author SmPatel
 *
 */
public class Animal implements Comparator<Animal>, Comparable<Animal> {	

	private String name;
	private int age;
	Animal(){
		
	}

	Animal(String n, int a){
		name = n;
		age = a;
	}

	public String getAnimalName(){
		return name;
	}

	public int getAnimalAge(){
		return age;
	}

	public int compareTo(Animal d){
		return (this.name).compareTo(d.name);
	}

	public int compare(Animal d, Animal d1){
		return d.age - d1.age;
		
	}
}


