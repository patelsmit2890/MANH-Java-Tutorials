/**
 * 
 */
package com.strings;

/**
 * @author SmPatel
 *
 */
public class StringOperation {

	String str1="";

	public StringOperation(String str) {
		// TODO Auto-generated constructor stub
		str1=str;
	}

	// prints substring from index a to b excluding character at bth index */
	public void substring(int a,int b){		
		System.out.println(str1.substring(a, b));
	}

	//changing the case of first letter to opposite case
	public void changeFirstLetterCase(String str){
		if(str!=null && str!="")
		{
			String [] temp=str.split("\\s+");
			int len=temp.length;
			for(int i=0;i<len;i++)
			{
				if(Character.isUpperCase(temp[i].charAt(0)))
				{
					temp[i]=(temp[i].substring(0, 1)).toLowerCase()+(temp[i].substring(1, temp[i].length()));
				}else
				{
					temp[i]=(temp[i].substring(0, 1)).toUpperCase()+(temp[i].substring(1, temp[i].length()));
				}
				System.out.print(temp[i]+" "); 
			}
			System.out.println(); 
		}else{
			System.out.println("Quest2<b>: Please enter string.");
		}
	}

	//prints whether the strings are equal or not(ignoring case) if not then print which is bigger and smaller
	public void compareeString(String st1,String st2){
		if(st1!=null && st2!=null && st1!="" && st2!="")
		{
			if(st1.equalsIgnoreCase(st2))
			{
				System.out.println("Strings: "+st1+" and "+st2+" are equal." );
			}else if(st1.length()>st2.length()){
				System.out.println("String "+st1+" is bigger than string "+st2);
			}else if(st1.length()<st2.length()){
				System.out.println("String "+st1+" is smaller than string "+st2);
			}else if(st1.length()==st2.length()){//if strings are not equal but length are equal then print which is come first lexicographically
				int comparisResult = st1.compareTo(st2);		       
				if(comparisResult < 0){
					System.out.println("lexicographically precedes \"" + st2 + "\".");
				}else if(comparisResult > 0){
					System.out.println("lexicographically follows \"" + st2 + "\".");
				}
			}
		}else
		{
			System.out.println("Quest2<c>: Please enter two strings.");
		}
	}

	public static void main(String args[]){

		//Driver
		StringOperation strop=new StringOperation("Jay Swaminarayan");

		//Quest 2<a>
		//substring by taking starting index and ending index.
		try{
			strop.substring(0, 10);
		}
		//throws if start or end are negative or greater than length(), or start is greater than end.
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}

		//Quest2<b>
		//Convert starting letter of a string to the opposite case.
		strop.changeFirstLetterCase("Enter The number");

		//Quest2< c>		
		//two strings which one is bigger, smaller or equal.
		strop.compareeString("Alan", "Sachin");



	}
}
