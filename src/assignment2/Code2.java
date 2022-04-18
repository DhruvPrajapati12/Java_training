package assignment2;

class Thread1Demo extends Thread
{
	public void run()
	{
		for(int i=0; i<=100; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i+ " ");
			}
		}
	}
}

class Thread2Demo extends Thread
{
	public void run()
	{
		for(int i=0; i<=100; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
	}
}

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1Demo t1 = new Thread1Demo();
		Thread2Demo t2 = new Thread2Demo();
		
		t1.start();
		t2.start();
	}

}
