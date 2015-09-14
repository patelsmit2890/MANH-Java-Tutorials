package MultiThread;

/**
 * @author SmPatel
 *
 */
class Data{
	private int value;
	boolean available = false;
	public int getValue(){		    
		return value;
	}
	public void setValue(int value){		
		this.value=value;	

	}
}
class Runner implements Runnable{
	Data d;
	Runner() {
		// TODO Auto-generated constructor stub
		d=new Data();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread currentThread;	
		boolean available = false;
		for(int ctr=0;ctr<20;ctr++)
		{
			currentThread=Thread.currentThread();
			System.out.println(currentThread);
			if(currentThread.getName().equals("Producer")){ 

				synchronized (d) {					
					while (available) {
						try {
							wait();
						}
						catch (InterruptedException e) { 
						} 
					}
					d.setValue(ctr+1);	
					available = true;
					d.notify();
				}
				
			}				
		else if(currentThread.getName().equals("Consumer")){
			synchronized (d) {
				
				while (!available) {
					try {
						wait();
					}
					catch (InterruptedException e) {
					}
				}
				available = false;	
				d.notify();
				System.out.println(d.getValue());

			}
		}

	}
}
}
public class Synchronization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub.		
		Thread mainThread=Thread.currentThread();
		Thread t1,t2;
		Runner ro=new Runner();
		t1=new Thread(ro,"Producer");
		t1.start();
		t1.setPriority(1);
		t2=new Thread(ro,"Consumer");			
		t2.start();
		try {
			t2.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread about to die");

	}

}
