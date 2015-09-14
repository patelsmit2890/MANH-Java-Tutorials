/**
 * 
 */
package ma.testq_quest_4;

/**
 * @author SmPatel
 *
 */
public class Counter implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */


	/**
	 * @param args
	 */

	Storage st;  
	public Counter(Storage store){  
		st = store;    

	}  

	public void run() {
		// TODO Auto-generated method stub

		synchronized(st) {  
			for(int i = 1 ; i < 11; i++){  
				while(!st.isPrinted()) {             
					try {  
						st.wait();  
					} catch(Exception e) {  }  
				}  
				st.setValue(i);  
				st.setPrinted(false);  
				st.notify();  
			}  
		}  

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Storage st=new Storage();
		Counter c = new Counter(st);  
		Printer p = new Printer(st);  
		new Thread(c,"Counter").start();    
		new Thread(p,"Printer").start();  

	}
}


class Printer implements Runnable{

	Storage st;  
	public Printer(Storage st){  
		this.st = st;  
	}  
	@Override  
	public void run() {  
		synchronized(st) {  
			for(int i = 1; i < 11; i++) {  
				while(st.isPrinted()) {           
					try {  
						st.wait();  
					} catch(Exception e) {  }  
				}  
				System.out.println(Thread.currentThread().getName() + " " + st.getValue());  
				st.setPrinted(true);  
				st.notify();  
			}  
		}  
	}  
}
class Storage
{ 		
	int  i;  
	boolean printed = true;  
	public void setValue(int i){  
		this.i = i;  
	}  
	public int getValue(){  
		return this.i;  
	}  
	public boolean isPrinted() {  
		return printed;  
	}  
	public void setPrinted(boolean p) {  
		printed = p;  
	}  
} 
