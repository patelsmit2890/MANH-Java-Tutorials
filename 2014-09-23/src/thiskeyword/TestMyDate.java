package thiskeyword;


public class TestMyDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate today = new MyDate(11, 12, 1992);
		MyDate the_next_week = today.addDays(7);
		System.out.println(today.toString());
		System.out.println(the_next_week.toString());
	}

}
