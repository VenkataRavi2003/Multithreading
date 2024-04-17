import java.util.Scanner;
class MyThread1 extends Thread {
    int N;
    public MyThread1(int N) {
        this.N = N;
    }
    public void run() {
        System.out.println("\n" + Thread.currentThread().getName() + " Printing 1 to N : \n");
        for (int i = 1; i <= N; ++i) {
            System.out.print(i + ",");
        }
    }
}
class MyThread2 extends Thread {
    int N;
    public MyThread2(int N) {
        this.N = N;
    }
    public void run() {
        System.out.println("\n" + Thread.currentThread().getName() + " Printing N to 1 : \n");
        for (int i = N; i >= 1; --i) {
            System.out.print(i + ",");
        }
    }
}

public class CreatingTwoThreadsPrinting1toN_And_N_to_1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
	    
        System.out.print("\nEnter N : ");
        int N = sc.nextInt();

        MyThread1 mt1 = new MyThread1(N);
        mt1.start();
        mt1.join(); // Wait for mt1 to complete before starting mt2

        MyThread2 mt2 = new MyThread2(N);
        mt2.start();

	    sc.close();
    }
}
