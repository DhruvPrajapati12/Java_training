package day7_08_04_22;

class Thread11 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
	}
}

class Thread22 extends Thread
{
	public void run()
	{
		for(int i=7; i<=10; i++)
		{
			System.out.println(i);
		}
	}
}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread11 t1 = new Thread11();
		Thread22 t2 = new Thread22();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t1.start();
	}

}
