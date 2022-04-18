package day7_08_04_22;

class Thread1 extends Thread
{
	public void run()
	{
		int i=0; 
		while(i<4)
		{
			System.out.println("I am thread1 first line");
			System.out.println("I am thread1 second line");
			i++;
		}
	}
}

//class Thread11 implements Runnable
//{
//	public void run()
//	{
//		int i=0; 
//		while(i<4)
//		{
//			System.out.println("I am thread1 first line");
//			System.out.println("I am thread1 second line");
//			i++;
//		}
//	}
//}

class Thread2 extends Thread
{
	public void run()
	{
		int i=0; 
		while(i<4)
		{
			System.out.println("I am thread2 first line");
			System.out.println("I am thread2 second line");
			i++;
		}
	}
}

//class Thread22 implements Runnable
//{
//	public void run()
//	{
//		int i=0; 
//		while(i<4)
//		{
//			System.out.println("I am thread2 first line");
//			System.out.println("I am thread2 second line");
//			i++;
//		}
//	}
//}

public class Multithread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
//		Thread11 t11 = new Thread11();
//		Thread22 t22 = new Thread22();
//		
//		Thread t1 = new Thread(t11);
//		Thread t2 = new Thread(t22);
//		t1.start();
//		t2.start();
	}

}
