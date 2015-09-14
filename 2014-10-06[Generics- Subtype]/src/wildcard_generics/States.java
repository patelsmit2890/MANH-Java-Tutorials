/**
 * 
 */
package wildcard_generics;

/**
 * @author SmPatel
 *
 */
public class States<T extends Number> {
	
	T[] nums;
	
	States(T[] o) {
		// TODO Auto-generated constructor stub
		nums=o;		
	}
	
	double average(){
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;	
	}
	
	boolean sameAvg(States<?> ob){// ? will take any type of object
		if(average()==ob.average())
		{
			return true;
		}
		return false;
		
	}

}
