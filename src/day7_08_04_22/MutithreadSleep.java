package day7_08_04_22;

class MultithreadDemo1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=3; i++)
		{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				System.out.println("Thread class: " + i);
		}
	}
}

public class MutithreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultithreadDemo1 obj = new MultithreadDemo1();
		obj.start();
		
		for(int i=11; i<=13; i++)
		{
			System.out.println("Parent class: " + i);
		}
		System.out.println("Done");
	}

}
