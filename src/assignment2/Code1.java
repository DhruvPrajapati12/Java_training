package assignment2;

class Thread1 implements Runnable
{

	@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello");
		}
	}
	
}

class Thread2 implements Runnable
{

	@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hi");
		}
	}
	
}

class Thread3 implements Runnable
{

	@Override
	public void run() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("How are you?");
		System.out.println();
	}
	
}

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t11 = new Thread1();
		Thread2 t22 = new Thread2();
		Thread3 t33 = new Thread3();
		
		Thread t1 = new Thread(t11);
		Thread t2 = new Thread(t22);
		Thread t3 = new Thread(t33);
		
		t1.start();
		t2.start();
		t3.start();
	}

}