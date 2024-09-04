class Wishing{
	public synchronized void greet(String name){

		for (int i = 0 ; i < 5 ; ++i) {
			System.out.println("good evening : "+name);
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				
			}
		}
	}
}
class MyThread extends Thread{
	String name;
	Wishing wish;
	MyThread(String name,Wishing wish){
		this.name = name;
		this.wish = wish;
	}
	public void run(){
		wish.greet(name);
	}
}
public class SynchronizationEx{
	public static void main(String[] args){
		
		Wishing wish = new Wishing();

		MyThread mt1 = new MyThread("ravi",wish);
		MyThread mt2 = new MyThread("venkat",wish);

		mt1.start();
		mt2.start();
	}
}