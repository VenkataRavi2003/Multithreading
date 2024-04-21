import java.util.Scanner;
class EvenThread implements Runnable{
	int N;
	public EvenThread(int N){
	    this.N = N;
	}
	public void run(){
		System.out.println("\n"+Thread.currentThread().getName()+" : Even Numbers ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for ( int i = 0 ; i <= N ; ++i ) {
		     if(i % 2 == 0)
		        System.out.print(i+",");			
		}
	}
}
class OddThread implements Runnable{
	 int N;
	 public OddThread(int N){
		this.N = N;
	 }
	 public void run(){
		System.out.println("\n"+Thread.currentThread().getName()+" : Odd Numbers");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for ( int i = 0 ; i <= N ; ++i ) {
		      if(i % 2 != 0)
		        System.out.print(i+",");			
		}
	}
}

public class PrintingEvenAndOddNumsByTwoDifferentThreadsUptoN{

	public static void main(String[] args) throws InterruptedException{

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter N : ");
		int N = sc.nextInt();

		EvenThread eThread = new EvenThread(N);
		OddThread oThread  = new OddThread(N);

		Thread t1 = new Thread(eThread);
		Thread t2 = new Thread(oThread);

		t1.start();
		t1.join();
		
		t2.start();

		sc.close();

	}
}
