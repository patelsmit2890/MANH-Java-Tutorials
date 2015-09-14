/**
 * 
 */
package ThreadSynchronization;


/**
 * @author SmPatel
 *
 */
class Runner {
	private int contents;
	private boolean available = false;
	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			}
			catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}
	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			}
			catch (InterruptedException e) { 
			} 
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private Runner run;
	private int number;
	public Consumer(Runner c, int number) {
		run = c;
		this.number = number;
	}
	public void run() {
		int value = 0;
		for (int i = 0; i < 21; i++) {
			value = run.get();
			System.out.println("Consumer #" 
					+ this.number
					+ " got: " + value);
		}
	}
}

class Producer extends Thread {
	private Runner run;
	private int number;

	public Producer(Runner c, int number) {
		run = c;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 21; i++) {
			run.put(i);
			System.out.println("Producer #" + this.number
					+ " put: " + i);
			try {
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) { }
		}
	}
}
public class SyncMainApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner ro = new Runner();
		Producer p1 = new Producer(ro, 1);
		Consumer c1 = new Consumer(ro, 1);
		p1.start(); 
		c1.start();
		System.out.println("Main thread about to die");
	}

}
