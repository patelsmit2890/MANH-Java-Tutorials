/**
 * 
 */
package ma.testq_quest_3;

/**
 * @author SmPatel
 *
 */

public class ClientMainApp {

	/**
	 * @param args
	 */
	public static int [] arrayFull = {2,4,6,8,10};

	public static int[] functionArray(Function function, int [] values){
		int [] halfed = new int[values.length];
		for(int i = 0; i < values.length; i++){
			halfed[i] = function.evaluate(values[i]);
		}		
		return halfed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Half half = new Half();
		
		System.out.print("Initial integer array: [ ");
		for (int i : arrayFull) {			
			System.out.print(i+" ");			
		}
		System.out.print("]");			

		System.out.println();
		
		int [] results = functionArray(half, arrayFull);
		
		System.out.print("Halfed integer array: [ ");
		for (int i : results) {			
			System.out.print(i+" ");			
		}
		System.out.print("]");

	}

}
