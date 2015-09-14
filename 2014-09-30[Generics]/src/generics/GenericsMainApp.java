package generics;

import data.Point;

public class GenericsMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Point p=new Point();
		//p.setX(new Integer(2));// no autoboxing
		p.setX(2);//auto boxing supported by java 5 and later
		Integer i=(Integer)p.getX();
		p.setY(4);
		System.out.println(i+","+p.getY());*/
		
		Point<Integer> p=new Point<Integer>();
		p.setX(2);
		p.setY(4);
		System.out.println(p.getX()+","+p.getY());
		
		Point<Float> p1=new Point<Float>(); //we can't use primitive type in <>but can use any reference type
		p1.setX(2.2f);
		p1.setY(4.3f);
		System.out.println(p1.getX()+","+p1.getY());
	}

}
