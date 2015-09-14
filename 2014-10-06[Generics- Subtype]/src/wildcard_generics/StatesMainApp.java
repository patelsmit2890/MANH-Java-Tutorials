/**
 * 
 */
package wildcard_generics;

/**
 * @author SmPatel
 *
 */
public class StatesMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = 0.0;

		Double dob[]={1.1,2.2,3.3};
        States<Double> doStates = new States<Double>(dob);
       

        result = doStates.average();
        System.out.println("Result of double no.=" + result); 
        
        Integer in[]={5,8,6,7};
        States<Integer> intStates = new States<Integer>(in);
        result=intStates.average();
        System.out.println("Result of integer no.=" + result);
        
        Float ft[]={6.0F,5.0F,8.0F,7.0F};
        States<Float> ftStates = new States<Float>(ft);
        result=ftStates.average();
        System.out.println("Result of float no.=" + result);
        
        if(intStates.sameAvg(doStates))//comparing integer no. average with double no. average
        	System.out.println("Same Average of int and double no.");
        else
        	System.out.println("Not Same average of integer and doubler no.");

        if(ftStates.sameAvg(doStates))//comparing float no. average with double no. average
        	System.out.println("Same Average of float and double no.");
        else
        	System.out.println("Not Same average of float and doubler no.");
        
        if(ftStates.sameAvg(intStates))//comparing integer no. average with float no. average
        	System.out.println("Same Average of float and int no.");
        else
        	System.out.println("Not Same average of float and int no.");
       
	}

}
