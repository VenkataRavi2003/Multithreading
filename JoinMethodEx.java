import java.util.Scanner;
class MyThread implements Runnable{
	int num;
	boolean armstrongResult;
	public MyThread(int num){
		this.num = num;
	}

	public void run(){
		armstrongResult = checkArmstrong(num);
	}
	public boolean checkArmstrong(int num){
		int temp = num , sum = 0;
		String str = Integer.toString(num);
		int len = str.length();

		while (temp != 0) {
			int rem = temp % 10;
			sum += (int)Math.pow(rem,len);
			temp /= 10;
		}

		return sum == num;
	}
	public boolean isArmstrong(){
		return armstrongResult;
	}
}
public class JoinMethodEx{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();

			MyThread mt = new MyThread(num);
			Thread t = new Thread(mt);

			t.start();
			t.join();

			if(mt.isArmstrong()){
				System.out.println("\n"+num+" -> Is Armstrong Number.");
			}else {
				System.out.println("\n"+num+" -> Not Armstrong Number!!");
			}

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
}