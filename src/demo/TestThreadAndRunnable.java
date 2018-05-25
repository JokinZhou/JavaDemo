/**
 * 
 */
package demo;

/**
 * @author lenovo
 *
 */
public class TestThreadAndRunnable {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestThreadAndRunnable.Another a = new TestThreadAndRunnable(). new Another();
		a.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//等待两秒让，子线程进入到等待时间
		System.out.println("子方法的线程："+ a.getName()+",它的线程状态是："+a.getState().toString());//获取已经是等待时间的子线程的状态
		System.out.println("子方法的线程："+ a.getName()+",它的线程状态是："+a.isAlive());
		System.out.println("main方法的线程："+ Thread.currentThread().getName());
		
		TestThreadByRunnable ttbr = new TestThreadByRunnable();
		Thread t = new Thread(ttbr);//把 runnable接口的实现类 作为参数去生成一个新的线程实例对象
		a.join();//等待a线程执行完毕以后才执行下面的代码
		t.start();//只有调用start的启动的线程才能独立运行，如果调用run的，它会等待主线程执行完以后在执行，起不到多线程的效果
	}
	
  public class Another extends Thread{
	  @Override
	  public void run(){
		  //重写方法
		  System.out.println("子方法的线程："+ this.getName());
		  try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  System.out.println("子方法的线程："+ this.getName()+",它的线程状态是："+ Thread.currentThread().getState().toString());
		  
	  }
  }

}
