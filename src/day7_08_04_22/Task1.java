// Create three threads using class Thread and then runnning them concurrently

package day7_08_04_22;

class Addi extends Thread
{
	int a, b, c;
	Addi(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public void run()
	{
		c = a+b;
		System.out.println("Addition of " + a + " and " + b + " is : " + c);
	}
}

class Sub extends Thread
{
	int a, b, c;
	Sub(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public void run()
	{
		c = a-b;
		System.out.println("Substraction of " + a + " and " + b + " is : " + c);
	}
}

class Multi extends Thread
{
	int a, b, c;
	Multi(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public void run()
	{
		c = a*b;
		System.out.println("Multiplication of " + a + " and " + b + " is : " + c);
	}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addi a = new Addi(20, 10);
		Sub s = new Sub(20, 10);
		Multi m = new Multi(20, 10);
		
		a.start();
		s.start();
		m.start();
	}

}
