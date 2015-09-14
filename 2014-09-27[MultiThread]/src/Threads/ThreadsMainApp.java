/**
 * 
 */
package Threads;

/**
 * @author SmPatel
 *
 */
class Runner implements Runnable{// one way creating by implementing Runnable interface
	
	//-----------1-------------
	/*Thread t1,t2;	
	Runner() {
		// TODO Auto-generated constructor stub
			
		t1=new Thread(this);
		t2=new Thread(this);
		//t1=new Thread(r,"Thread 1");		
		
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	//--------------------1------------------
	
	public void run() {
		
		//-----------1------------
		/*Thread currentThread=Thread.currentThread();
		if(currentThread==t1)
		{
			System.out.println("First Thread");
		}else
		{
			System.out.println("Second Thread");
		}*/
		//-----------------1-----------------
		
		//------------------3-----------
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("FT"))
		{
			System.out.println("First Thread");
		}
		//-----------3--------------
		
		//System.out.println(Thread.currentThread());//2		
	}
}
public class ThreadsMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Thread.currentThread().toString());
		
		Thread mainThread=Thread.currentThread();//Return type of threads are thread
		System.out.println(mainThread.toString());
		/*try {
			//mainThread.sleep(500);
			Thread.sleep(5000);//we are calling Thread bcoz rht noe only one thread only-mainThread so it will run only mainThread only
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//-------1---------------
		/*new Runner();*/
		//--------1---------
		
		//-----------2--------------------------
		/*Thread t1,t2;
		Runner r=new Runner();
		t1=new Thread(r);
		t2=new Thread(r);
		//t1=new Thread(r,"Thread 1");		
		
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ //---------------------2------------------------
		
		//------------3----------
		Thread t1,t2;
		Runner r=new Runner();
		t1=new Thread(r,"FT");
		t2=new Thread(r,"ST");		
		//------------3------------
		
		
		//System.out.println(t1.getState());
		//System.out.println(t2.getState());
		//System.out.println(t1.toString());
		//System.err.println("End");
	}

}
