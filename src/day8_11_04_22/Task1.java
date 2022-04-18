package day8_11_04_22;
//import java.util.Scanner;

class Account
{
//	Scanner sc = new Scanner(System.in);
	int amount, rem, add;
	
	Account(int n, int add, int rem)
	{
		amount = n;
		this.rem = rem;
		this.add = add;
	}
	
	void displayBalance()
	{
		System.out.println("Your balance is " + amount);
	}
	
	void withdraw()
	{
//		System.out.print("Enter amount do you want to remove: ");
//		int remove;
//		remove = sc.nextInt();
		amount= amount - rem;
		System.out.println("Your remaining balance is " + amount);
//		System.out.println("Your remaining balance is 400");
		System.out.println();
	}
	
	void deposite()
	{
//		System.out.print("Enter amount do you want to deposite: ");
//		int add;
//		add = sc.nextInt();
		amount= amount + add;
		System.out.println("Your remaining balance is " + amount);
//		System.out.println("Your remaining balance is 900");
	}
}

class myThread extends Thread
{
	Account ac;
	
	myThread(Account obj)
	{
		ac = obj;
	}
	
	public void run()
	{
		synchronized(ac)
		{
			ac.displayBalance();
			ac.deposite();
			ac.withdraw();
		}
		
	}
	
	
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account(1000, 200, 100);
		Account ac2 = new Account(2000, 500, 200);
		myThread t1 = new myThread(ac1);
		myThread t2 = new myThread(ac2);
		
		t1.run();
		t2.run();
	}

}
