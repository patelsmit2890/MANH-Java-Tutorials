/**
 * 
 */
package vriablepack;

import javax.naming.BinaryRefAddr;

/**
 * @author smpatel
 *
 */
class Data
{
	int value;
}
class Factory
{
	Data getInstance(int status)
	{
		if(status==1)
		{return new Data();}
		return null;
	}
		
}
class Point
{
	int x;
	int y;
}

public class VariableMainApp {
	//static Data d;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Start");
		Data d1=new Data();
		d1.value=7;
		Data d2=new Data();
		d2.value=8;
		System.out.println(d1.value); */

		/*String s1="MA";
		String s2="mA";// check id of variable in debug mode in variable window. 

		s1="abc";
		String s3=new String("ABC");
		String s4=new String("ABC");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println("End");	*/

		/*//Data d;
		Data d=new Factory().getInstance(2);
		//Data d=null;
		if(d!=null)// for avoiding null pointer exception check with null
		d.value=7;
		
		d=null;//for helping garbage collector to clean up object
*/		
		
		/*System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toBinaryString(7>>2));*/
		
		//int nums[]={2,3,4,5};
		//int[] nums={2,3,4,5};
		
		/*for(int num:nums)// enhanced for loop
		{
			System.out.println(num);
		}*/
		
		/*nums=new int[3];
		nums[0]=10;
		for(int num:nums)// enhanced for loop
		{
			System.out.println(num);
		}*/
		
		//int nums[][]={{1,2,3},{4,5,6},{7,8,9}};		
		//nums[0][0] = 5;
		/*for(int[] u: nums){
			for(int d:u){
		    System.out.println(d);
			}
		}*/
		
		/*int nums[][];
		nums=new int[3][];
		nums[0]=new int[5];
		nums[1]=new int[2];
		nums[2]=new int[6];*/
		
		/*int nums[][]={{5,6,8,9},{2,3},{1,2,3,4,5,6}};
		for(int[] u: nums){
			for(int d:u){
		    System.out.println(d);
			}
		}*/

		Point p[];
		p=new Point[5];
		p[0]=new Point();
		p[0].x=2;
		p[0].y=4;
		
	}
}
