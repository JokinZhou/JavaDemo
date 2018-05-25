/**
 * 
 */
package demo;

/**
 * @author lenovo
 *
 */
public class TestThreadByRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("子线程："+ Thread.currentThread().getName());
		 Thread.currentThread().getState().toString();
	}

}
