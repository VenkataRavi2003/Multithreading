class MyThread extends Thread{
	public void run(){
		System.out.println("Hey!! hi hello");
	}
	public synchronized void m1(){
		System.out.println("Entered Into Synchronized m1()");
		try{
		Thread.sleep(2000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println("Completed");
	}
}
class Synchronization{
	public static void main(String args[]){
		MyThread mt=new MyThread();
		mt.start();
		mt.m1();
		MyThread mt2=new MyThread();
		mt2.start();
		mt2.m1();
	}
}
