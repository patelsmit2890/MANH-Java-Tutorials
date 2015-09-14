/**
 * 
 */
package Threads;

import java.util.Calendar;
import java.util.Date;

/**
 * @author SmPatel
 *
 */
public class DateUsingGet {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
		System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
		System.out.println("Calendar's Month: " + cal.get(Calendar.MONTH));
		System.out.println("Calendar's Day: " + cal.get(Calendar.DATE));
		
		//use and replaced by Date.get method
		
		/*Date dt=new Date();
		int dt1=dt.getYear()+1900;
		System.out.println(dt.getDay()+"-"+dt.getMonth()+"-"+dt1);*/
		//deprecated and replaced by Calender.get(Calender.Month)
	}

}
