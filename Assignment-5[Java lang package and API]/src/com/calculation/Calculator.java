/**
 * 
 */
package com.calculation;

/**
 * @author SmPatel
 *
 */
public class Calculator implements com.calci.Calculator{

	/**
	 * @param args
	 */

	//method sum calculate sum of two number
	public void sum(int a, int b){
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
	}

	//method sub calculate subtraction of two number
	public void sub(int a, int b){
		System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
	}

	//method multi calculate multiplication of two number
	public void multi(int a, int b){
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
	}

	//method divide calculate division of two number
	public void divide(int a, int b){
		System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal=new Calculator();

		//check if at least 3 args are there or not
		if(args.length==3)		
		{
			try{
				if(args[1].equals("+")){
					cal.sum(Integer.parseInt(args[0]), Integer.parseInt(args[2]));
				}else if(args[1].equals("-")){
					cal.sub(Integer.parseInt(args[0]), Integer.parseInt(args[2]));
				}else if(args[1].equals("'*'")){
					cal.multi(Integer.parseInt(args[0]), Integer.parseInt(args[2]));
				}else if(args[1].equals("/")){
					cal.divide(Integer.parseInt(args[0]), Integer.parseInt(args[2]));
				}else{
					System.out.println("please enter input inn given format: number1 operator(+,-,mul,/) number2");
				}
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
			catch(ArithmeticException e)//throws if denominator is zero
			{
				e.printStackTrace();
			}
		}else{

			System.out.println("Please provide three argument as: number1 operator(+,-,mul,/) number2");
		}
	}

}
