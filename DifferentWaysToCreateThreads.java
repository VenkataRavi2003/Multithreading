// Class implementing the Runnable interface to create a thread
class MyThread1 implements Runnable{
	@Override
	public void run(){
		// Code that will be executed when the thread is started
		System.out.println("\nHey, i am from MyThread1 class.");
	}
}
// Class extending the Thread class to create a thread
class MyThread2 extends Thread{
	@Override
	public void run(){
		// Code that will be executed when the thread is started
		System.out.println("\nHey, i am from MyThread2 class.");
	}
}
public class DifferentWaysToCreateThreads{
	public static void main(String[] args) {
		
		// Creating an instance of MyThread1 which implements Runnable
		MyThread1 mt1 = new MyThread1();

		// Wrapping the MyThread1 instance in a Thread object
		Thread t1 = new Thread(mt1);
		// Starting the thread which will call the run method of MyThread1
		t1.start();

		 // Creating an instance of MyThread2 which extends Thread
		MyThread2 mt2 = new MyThread2();

		// Starting the thread which will call the run method of MyThread2	
		mt2.start();
	}
}