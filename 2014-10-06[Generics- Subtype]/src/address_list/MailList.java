/**
 * 
 */
package address_list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author SmPatel
 *
 */
public class MailList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LinkedList<Address> ml=new LinkedList<Address>();//supported by java 1.5 and later
		
		LinkedList ml=new LinkedList();//supported by java 1.4
		
		ml.add(new Address ("J.W. West","11 Oak Avenue","Urbana","IL","61801"));
		ml.add(new Address ("Ralph Backer","1142 Maple","Mahome","IL","61853"));
		ml.add(new Address ("Tom Carlton","867 Elm St","Champaign","IL","64820"));

				/*for(Address element:ml)//supported by java 1.5 and later
			System.out.println(element+"\n");*/
		
		for(int i=0;i<ml.size();i++)//supported by java 1.4
		{
			System.out.println(ml.get(i));
			System.out.println();
		}
	}

}
class Address{
	
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address(String n,String s, String c,String st, String cd)
	{
		name=n;
		street=s;
		city=c;
		state=st;
		code=cd;
	}
	public String  toString(){
		return name+"\n"+street+"\n"+city+"\n"+state+"\n"+code;
	}
	
}
