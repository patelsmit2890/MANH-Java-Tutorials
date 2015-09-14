/**
 * 
 */
package MultiThread;

/**
 * @author SmPatel
 *
 */

public class Th implements Runnable

{
	Thread t;

	Th(String str) {

		t = new Thread(this, str);
		t.start();
	}
	public void run() {

		for (int i = 0; i < 5; i++) {

			if ((i % 5) == 0) {

				System.out.println(Thread.currentThread().getName() + "yielding control...");

				Thread.yield();

			}

		}

		System.out.println(Thread.currentThread().getName() + " has inished executing.");

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Th("Thread 1");

		new Th("Thread 2");

		new Th("Thread 3");
	}


}
