package day7_08_04_22;

class MultithreadDemo extends Thread
{
	static int i=1;
	public void run()
	{
		System.out.println("Thread" + i + " is running: " + Thread.currentThread().getId());
		i++;
	}
}

public class Multithread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++)
		{
			MultithreadDemo obj = new MultithreadDemo();
			obj.start();
		}
	}

}
